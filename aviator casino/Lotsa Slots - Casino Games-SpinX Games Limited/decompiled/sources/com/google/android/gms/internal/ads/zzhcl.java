package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzhcl extends com.google.android.gms.internal.ads.zzhap.zzf implements java.lang.Runnable {
    private final java.lang.Runnable zza;

    @Override // com.google.android.gms.internal.ads.zzhap
    protected final java.lang.String zzd() {
        java.lang.String obj = this.zza.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(obj.length() + 7);
        sb.append("task=[");
        sb.append(obj);
        sb.append(com.ironsource.X3.j.e);
        return sb.toString();
    }

    zzhcl(java.lang.Runnable runnable) {
        runnable.getClass();
        this.zza = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.run();
        } catch (java.lang.Throwable th) {
            zzb(th);
            throw th;
        }
    }
}
