package com.inmobi.media;

/* renamed from: com.inmobi.media.oi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2648oi extends com.inmobi.media.Lo {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.GestureDetectorOnGestureListenerC2675pi f5377a;

    public C2648oi(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi) {
        this.f5377a = gestureDetectorOnGestureListenerC2675pi;
    }

    @Override // com.inmobi.media.Lo
    public final boolean a() {
        return !kotlin.jvm.internal.Intrinsics.areEqual("Hidden", this.f5377a.getViewState());
    }

    @Override // com.inmobi.media.Lo
    public final void a(com.inmobi.media.Lf orientation, com.inmobi.media.No finalInsets) {
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi renderView;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(orientation, "orientation");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(finalInsets, "finalInsets");
        this.f5377a.a(orientation, finalInsets);
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = this.f5377a;
        gestureDetectorOnGestureListenerC2675pi.getClass();
        finalInsets.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(orientation, "orientation");
        com.inmobi.media.Mo mo = (com.inmobi.media.Mo) finalInsets.f4863a.get(orientation);
        if (mo == null) {
            return;
        }
        if (mo.b == 0 && mo.c == 0) {
            return;
        }
        gestureDetectorOnGestureListenerC2675pi.setCloseAssetArea(mo);
        kotlin.Lazy lazy = com.inmobi.media.Gi.f4728a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gestureDetectorOnGestureListenerC2675pi, "<this>");
        if (kotlin.jvm.internal.Intrinsics.areEqual(gestureDetectorOnGestureListenerC2675pi.getRoute().b, com.unity3d.ads.BuildConfig.FLAVOR)) {
            renderView = gestureDetectorOnGestureListenerC2675pi;
        } else {
            com.inmobi.media.Bo webViewFactory = gestureDetectorOnGestureListenerC2675pi.getWebViewFactory();
            webViewFactory.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.unity3d.ads.BuildConfig.FLAVOR, "id");
            renderView = (com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) webViewFactory.b.get(com.unity3d.ads.BuildConfig.FLAVOR);
        }
        if (renderView != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderView, "renderView");
            com.inmobi.media.Mo insets = gestureDetectorOnGestureListenerC2675pi.f1;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(insets, "insets");
            android.view.View findViewById = renderView.getRootView().findViewById(65532);
            com.inmobi.media.C2607n5 c2607n5 = findViewById instanceof com.inmobi.media.C2607n5 ? (com.inmobi.media.C2607n5) findViewById : null;
            if (c2607n5 == null) {
                return;
            }
            android.view.View findViewById2 = renderView.getRootView().findViewById(65531);
            com.inmobi.media.C2607n5 c2607n52 = findViewById2 instanceof com.inmobi.media.C2607n5 ? (com.inmobi.media.C2607n5) findViewById2 : null;
            if (c2607n52 == null) {
                return;
            }
            android.view.ViewGroup.LayoutParams layoutParams = c2607n5.getLayoutParams();
            android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 == null) {
                return;
            }
            android.view.ViewGroup.LayoutParams layoutParams3 = c2607n52.getLayoutParams();
            android.widget.RelativeLayout.LayoutParams layoutParams4 = layoutParams3 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams3 : null;
            if (layoutParams4 == null) {
                return;
            }
            layoutParams2.setMargins(0, insets.b, insets.c, 0);
            layoutParams4.setMargins(0, insets.b, insets.c, 0);
        }
    }
}
