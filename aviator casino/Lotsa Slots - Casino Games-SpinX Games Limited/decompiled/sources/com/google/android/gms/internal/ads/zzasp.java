package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzasp implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.ads.zzate zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzasq zzb;

    zzasp(com.google.android.gms.internal.ads.zzasq zzasqVar, com.google.android.gms.internal.ads.zzate zzateVar) {
        this.zza = zzateVar;
        java.util.Objects.requireNonNull(zzasqVar);
        this.zzb = zzasqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.zzb().put(this.zza);
        } catch (java.lang.InterruptedException unused) {
            java.lang.Thread.currentThread().interrupt();
        }
    }
}
