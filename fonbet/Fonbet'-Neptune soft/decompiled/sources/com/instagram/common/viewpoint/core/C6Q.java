package com.instagram.common.viewpoint.core;

import android.widget.FrameLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;

/* renamed from: com.facebook.ads.redexgen.X.6Q, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6Q extends C1296fg {
    public InterfaceC1154dM A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A06(NativeAdLayout nativeAdLayout, C1153dL c1153dL, NativeAd nativeAd, C0813Ur c0813Ur) {
        C0967aK c0967aK = new C0967aK(c1153dL);
        MediaView mediaView = new MediaView(c1153dL);
        AdOptionsView adOptionsView = new AdOptionsView(c1153dL, nativeAd, nativeAdLayout);
        c0813Ur.A09(adOptionsView, 28);
        this.A00 = new EP(c1153dL, nativeAd, c0813Ur, C0696Qc.A0L(nativeAd.getInternalNativeAd()).A18(), c0967aK, mediaView, adOptionsView);
        XP.A0K(nativeAdLayout, c0813Ur.A00());
        nativeAd.registerViewForInteraction(nativeAdLayout, mediaView, c0967aK, this.A00.getViewsForInteraction());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        nativeAdLayout.addView(this.A00.getView(), layoutParams);
    }

    @Override // com.instagram.common.viewpoint.core.R8, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00.unregisterView();
    }
}
