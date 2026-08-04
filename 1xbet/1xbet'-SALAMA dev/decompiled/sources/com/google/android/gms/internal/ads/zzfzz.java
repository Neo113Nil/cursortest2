package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
abstract class zzfzz extends zzgas implements Runnable {
    public static final /* synthetic */ int zzc = 0;
    I3.b zza;
    Object zzb;

    public zzfzz(I3.b bVar, Object obj) {
        bVar.getClass();
        this.zza = bVar;
        this.zzb = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        I3.b bVar = this.zza;
        Object obj = this.zzb;
        if ((isCancelled() | (bVar == null)) || (obj == null)) {
            return;
        }
        this.zza = null;
        if (bVar.isCancelled()) {
            zzs(bVar);
            return;
        }
        try {
            try {
                Object objZze = zze(obj, zzgbc.zzp(bVar));
                this.zzb = null;
                zzf(objZze);
            } catch (Throwable th) {
                try {
                    zzgbv.zza(th);
                    zzd(th);
                } finally {
                    this.zzb = null;
                }
            }
        } catch (Error e7) {
            zzd(e7);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e8) {
            zzd(e8.getCause());
        } catch (Exception e9) {
            zzd(e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfzr
    public final String zza() {
        I3.b bVar = this.zza;
        Object obj = this.zzb;
        String strZza = super.zza();
        String strH = bVar != null ? AbstractC0486a1.h("inputFuture=[", bVar.toString(), "], ") : "";
        if (obj != null) {
            return p150v0.a.o(strH, "function=[", obj.toString(), "]");
        }
        if (strZza != null) {
            return strH.concat(strZza);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfzr
    public final void zzb() {
        zzr(this.zza);
        this.zza = null;
        this.zzb = null;
    }

    public abstract Object zze(Object obj, Object obj2);

    public abstract void zzf(Object obj);
}
