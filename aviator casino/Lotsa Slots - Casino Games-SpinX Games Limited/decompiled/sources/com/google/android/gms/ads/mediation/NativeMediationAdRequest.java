package com.google.android.gms.ads.mediation;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
@java.lang.Deprecated
/* loaded from: classes3.dex */
public interface NativeMediationAdRequest extends com.google.android.gms.ads.mediation.MediationAdRequest {
    float getAdVolume();

    @java.lang.Deprecated
    com.google.android.gms.ads.formats.NativeAdOptions getNativeAdOptions();

    com.google.android.gms.ads.nativead.NativeAdOptions getNativeAdRequestOptions();

    boolean isAdMuted();

    boolean isUnifiedNativeAdRequested();

    boolean zza();

    java.util.Map zzb();
}
