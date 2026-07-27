package com.startapp.sdk.ads.nativead;

/* loaded from: classes.dex */
public interface NativeAdDisplayListener {
    void adClicked(NativeAdInterface nativeAdInterface);

    void adDisplayed(NativeAdInterface nativeAdInterface);

    void adHidden(NativeAdInterface nativeAdInterface);

    void adNotDisplayed(NativeAdInterface nativeAdInterface);
}
