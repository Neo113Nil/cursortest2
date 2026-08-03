package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbrl implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbro zza;

    zzbrl(com.google.android.gms.internal.ads.zzbro zzbroVar) {
        java.util.Objects.requireNonNull(zzbroVar);
        this.zza = zzbroVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb();
    }
}
