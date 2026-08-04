package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import java.util.concurrent.ExecutionException;
import p155w1.L;

/* JADX INFO: loaded from: classes.dex */
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
    @Override // java.lang.Runnable
    public final void run() {
        Object objZzp;
        I3.b bVar = this.zza;
        Class cls = this.zzb;
        Object obj = this.zzc;
        if (((obj == null) || ((bVar == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        this.zza = null;
        try {
            th = bVar instanceof zzgcg ? ((zzgcg) bVar).zzl() : null;
            objZzp = th == null ? zzgbc.zzp(bVar) : null;
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
            zzc(objZzp);
            return;
        }
        if (!cls.isInstance(th)) {
            zzs(bVar);
            return;
        }
        try {
            Object objZze = zze(obj, th);
            this.zzb = null;
            this.zzc = null;
            zzf(objZze);
        } catch (Throwable th2) {
            try {
                zzgbv.zza(th2);
                zzd(th2);
            } finally {
                this.zzb = null;
                this.zzc = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfzr
    public final String zza() {
        I3.b bVar = this.zza;
        Class cls = this.zzb;
        Object obj = this.zzc;
        String strZza = super.zza();
        String strH = bVar != null ? AbstractC0486a1.h("inputFuture=[", bVar.toString(), "], ") : "";
        if (cls == null || obj == null) {
            if (strZza != null) {
                return strH.concat(strZza);
            }
            return null;
        }
        return strH + "exceptionType=[" + cls.toString() + "], fallback=[" + obj.toString() + "]";
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
