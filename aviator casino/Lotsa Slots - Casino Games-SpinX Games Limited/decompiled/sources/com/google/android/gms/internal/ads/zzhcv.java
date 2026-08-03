package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzhcv extends com.google.android.gms.internal.ads.zzhbn implements java.util.concurrent.RunnableFuture {
    private volatile com.google.android.gms.internal.ads.zzhcd zza;

    zzhcv(com.google.android.gms.internal.ads.zzhbd zzhbdVar) {
        this.zza = new com.google.android.gms.internal.ads.zzhct(this, zzhbdVar);
    }

    static com.google.android.gms.internal.ads.zzhcv zze(java.lang.Runnable runnable, java.lang.Object obj) {
        return new com.google.android.gms.internal.ads.zzhcv(java.util.concurrent.Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.ads.zzhcd zzhcdVar = this.zza;
        if (zzhcdVar != null) {
            zzhcdVar.run();
        }
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhap
    protected final void zzc() {
        com.google.android.gms.internal.ads.zzhcd zzhcdVar;
        if (zzj() && (zzhcdVar = this.zza) != null) {
            zzhcdVar.zzh();
        }
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhap
    protected final java.lang.String zzd() {
        com.google.android.gms.internal.ads.zzhcd zzhcdVar = this.zza;
        if (zzhcdVar == null) {
            return super.zzd();
        }
        java.lang.String obj = zzhcdVar.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(obj.length() + 7);
        sb.append("task=[");
        sb.append(obj);
        sb.append(com.ironsource.X3.j.e);
        return sb.toString();
    }

    zzhcv(java.util.concurrent.Callable callable) {
        this.zza = new com.google.android.gms.internal.ads.zzhcu(this, callable);
    }
}
