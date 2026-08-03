package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbag implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbah zza;

    zzbag(com.google.android.gms.internal.ads.zzbah zzbahVar) {
        java.util.Objects.requireNonNull(zzbahVar);
        this.zza = zzbahVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.ads.zzbah zzbahVar = this.zza;
        synchronized (zzbahVar.zzp()) {
            if (zzbahVar.zzq()) {
                return;
            }
            zzbahVar.zzr(true);
            try {
                zzbahVar.zzn();
            } catch (java.lang.Exception e) {
                this.zza.zzo().zzc(2023, -1L, e);
            }
            com.google.android.gms.internal.ads.zzbah zzbahVar2 = this.zza;
            synchronized (zzbahVar2.zzp()) {
                zzbahVar2.zzr(false);
            }
        }
    }
}
