package com.instagram.common.viewpoint.core;

import android.widget.FrameLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;

/* renamed from: com.facebook.ads.redexgen.X.7C, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C7C extends C2959hB {
    public InterfaceC2802ee A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A08(NativeAdLayout nativeAdLayout, C2930gi c2930gi, NativeAd nativeAd, C2394Vd c2394Vd) {
        C2624bk c2624bk = new C2624bk(c2930gi);
        MediaView mediaView = new MediaView(c2930gi);
        AdOptionsView adOptionsView = new AdOptionsView(c2930gi, nativeAd, nativeAdLayout);
        c2394Vd.A09(adOptionsView, 28);
        this.A00 = new F2(c2930gi, nativeAd, c2394Vd, UK.A0L(nativeAd.getInternalNativeAd()).A1C(), c2624bk, mediaView, adOptionsView);
        YB.A0N(nativeAdLayout, c2394Vd.A00());
        nativeAd.registerViewForInteraction(nativeAdLayout, mediaView, c2624bk, this.A00.getViewsForInteraction());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        nativeAdLayout.addView(this.A00.getView(), layoutParams);
    }

    @Override // com.instagram.common.viewpoint.core.C2300Rm, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00.unregisterView();
    }
}
