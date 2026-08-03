package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbbx implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbbz zza;

    zzbbx(com.google.android.gms.internal.ads.zzbbz zzbbzVar) {
        java.util.Objects.requireNonNull(zzbbzVar);
        this.zza = zzbbzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzd();
    }
}
