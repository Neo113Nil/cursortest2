package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzack implements android.media.Spatializer.OnSpatializerStateChangedListener {
    final /* synthetic */ java.lang.Runnable zza;

    zzack(com.google.android.gms.internal.ads.zzacm zzacmVar, java.lang.Runnable runnable) {
        this.zza = runnable;
        java.util.Objects.requireNonNull(zzacmVar);
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerAvailableChanged(android.media.Spatializer spatializer, boolean z) {
        this.zza.run();
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerEnabledChanged(android.media.Spatializer spatializer, boolean z) {
        this.zza.run();
    }
}
