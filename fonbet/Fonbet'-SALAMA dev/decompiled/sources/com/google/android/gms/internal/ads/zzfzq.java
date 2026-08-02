package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import java.util.concurrent.ExecutionException;
import w1.L;

/* loaded from: classes.dex */
abstract class zzfzq extends zzgas implements Runnable {
    public static final /* synthetic */ int zzd = 0;
    I3.b zza;
    Class zzb;
    Object zzc;

    public zzfzq(I3.b bVar, Class cls, Object obj) {
        bVar.getClass();
        this.zza = bVar;
        this.zzb = cls;
        this.zzc = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj;
        I3.b bVar = this.zza;
        Class cls = this.zzb;
        Object obj2 = this.zzc;
        if (((obj2 == null) || ((bVar == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        this.zza = null;
        try {
            th = bVar instanceof zzgcg ? ((zzgcg) bVar).zzl() : null;
        } catch (ExecutionException e7) {
            Throwable cause = e7.getCause();
            if (cause == null) {
                cause = new NullPointerException(L.j("Future type ", String.valueOf(bVar.getClass()), " threw ", String.valueOf(e7.getClass()), " without a cause"));
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        if (th == null) {
            obj = zzgbc.zzp(bVar);
            if (th != null) {
                zzc(obj);
                return;
            }
            if (!cls.isInstance(th)) {
                zzs(bVar);
                return;
            }
            try {
                Object zze = zze(obj2, th);
                this.zzb = null;
                this.zzc = null;
                zzf(zze);
                return;
            } catch (Throwable th2) {
                try {
                    zzgbv.zza(th2);
                    zzd(th2);
                    return;
                } finally {
                    this.zzb = null;
                    this.zzc = null;
                }
            }
        }
        obj = null;
        if (th != null) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfzr
    public final String zza() {
        I3.b bVar = this.zza;
        Class cls = this.zzb;
        Object obj = this.zzc;
        String zza = super.zza();
        String h6 = bVar != null ? AbstractC0486a1.h("inputFuture=[", bVar.toString(), "], ") : "";
        if (cls == null || obj == null) {
            if (zza != null) {
                return h6.concat(zza);
            }
            return null;
        }
        return h6 + "exceptionType=[" + cls.toString() + "], fallback=[" + obj.toString() + "]";
    }

    @Override // com.google.android.gms.internal.ads.zzfzr
    public final void zzb() {
        zzr(this.zza);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    public abstract Object zze(Object obj, Throwable th);

    public abstract void zzf(Object obj);
}
