package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import v0.AbstractC1663a;

/* loaded from: classes.dex */
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
                Object zze = zze(obj, zzgbc.zzp(bVar));
                this.zzb = null;
                zzf(zze);
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
        String zza = super.zza();
        String h6 = bVar != null ? AbstractC0486a1.h("inputFuture=[", bVar.toString(), "], ") : "";
        if (obj != null) {
            return AbstractC1663a.o(h6, "function=[", obj.toString(), "]");
        }
        if (zza != null) {
            return h6.concat(zza);
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
