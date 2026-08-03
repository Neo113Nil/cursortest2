package com.inmobi.media;

/* loaded from: classes5.dex */
public final class C3 {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.GestureDetectorOnGestureListenerC2675pi f4635a;
    public final boolean b;
    public final boolean c;
    public final com.inmobi.media.InterfaceC2772t9 d;

    public C3(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi renderView, boolean z, boolean z2, com.inmobi.media.InterfaceC2772t9 interfaceC2772t9) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderView, "renderView");
        this.f4635a = renderView;
        this.b = z;
        this.c = z2;
        this.d = interfaceC2772t9;
    }

    public final void a(final com.inmobi.media.Mo insets) {
        final android.view.ViewGroup viewGroup;
        android.os.Handler handler;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(insets, "insets");
        if (!(this.f4635a.getContainerContext() instanceof com.inmobi.ads.rendering.InMobiAdActivity) || (viewGroup = (android.view.ViewGroup) this.f4635a.getRootView().findViewById(65534)) == null || (handler = viewGroup.getHandler()) == null) {
            return;
        }
        handler.post(new java.lang.Runnable() { // from class: com.inmobi.media.C3$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.C3.a(com.inmobi.media.C3.this, viewGroup, insets);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b2, code lost:
    
        if (r2 == null) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(com.inmobi.media.C3 c3, android.view.ViewGroup viewGroup, com.inmobi.media.Mo mo) {
        kotlin.Unit unit;
        com.inmobi.media.Wn viewableAd;
        com.inmobi.media.Wn viewableAd2;
        kotlin.Pair a2 = c3.a();
        android.view.View.OnClickListener onClickListener = (android.view.View.OnClickListener) a2.component1();
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) a2.component2();
        kotlin.Unit unit2 = null;
        if (c3.b) {
            android.view.View findViewById = viewGroup != null ? viewGroup.findViewById(65532) : null;
            if (findViewById != null) {
                com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = c3.d;
                if (interfaceC2772t9 != null) {
                    ((com.inmobi.media.C2799u9) interfaceC2772t9).c("CloseButtonHandler", "Close button already present, not adding again");
                }
                c3.a(findViewById);
            } else {
                android.content.Context context = c3.f4635a.getContext();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                com.inmobi.media.C2607n5 c2607n5 = new com.inmobi.media.C2607n5(context, (byte) 0, c3.d);
                c2607n5.setId(65532);
                com.inmobi.media.B5.f4614a.getClass();
                if (com.inmobi.media.B5.x()) {
                    c2607n5.setElevation(1.7014117E38f);
                }
                c2607n5.setOnClickListener(onClickListener);
                c3.a(c2607n5);
                if (viewGroup != null) {
                    viewGroup.addView(c2607n5, layoutParams);
                }
                layoutParams.setMargins(0, mo.b, mo.c, 0);
            }
        } else {
            android.view.View findViewById2 = c3.f4635a.getRootView().findViewById(65532);
            if (findViewById2 != null) {
                com.inmobi.media.Bo webViewFactory = c3.f4635a.getWebViewFactory();
                webViewFactory.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.unity3d.ads.BuildConfig.FLAVOR, "id");
                com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = (com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) webViewFactory.b.get(com.unity3d.ads.BuildConfig.FLAVOR);
                if (gestureDetectorOnGestureListenerC2675pi != null && (viewableAd = gestureDetectorOnGestureListenerC2675pi.getViewableAd()) != null) {
                    viewableAd.a(findViewById2);
                }
                android.view.ViewParent parent = findViewById2.getParent();
                android.view.ViewGroup viewGroup2 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                if (viewGroup2 != null) {
                    viewGroup2.removeView(findViewById2);
                    unit = kotlin.Unit.INSTANCE;
                } else {
                    unit = null;
                }
            }
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = c3.d;
            if (interfaceC2772t92 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t92).c("CloseButtonHandler", "Close button not present, not removing");
                kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
            }
        }
        if (c3.c) {
            android.view.View findViewById3 = viewGroup != null ? viewGroup.findViewById(65531) : null;
            if (findViewById3 != null) {
                com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = c3.d;
                if (interfaceC2772t93 != null) {
                    ((com.inmobi.media.C2799u9) interfaceC2772t93).c("CloseButtonHandler", "Close region already present, not adding again");
                }
                c3.a(findViewById3);
                return;
            }
            android.content.Context context2 = c3.f4635a.getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            com.inmobi.media.C2607n5 c2607n52 = new com.inmobi.media.C2607n5(context2, (byte) 1, c3.d);
            c2607n52.setId(65531);
            com.inmobi.media.B5.f4614a.getClass();
            if (com.inmobi.media.B5.x()) {
                c2607n52.setElevation(1.7014117E38f);
            }
            c2607n52.setOnClickListener(onClickListener);
            c3.a(c2607n52);
            if (viewGroup != null) {
                viewGroup.addView(c2607n52, layoutParams);
            }
            layoutParams.setMargins(0, mo.b, mo.c, 0);
            return;
        }
        android.view.View findViewById4 = c3.f4635a.getRootView().findViewById(65531);
        if (findViewById4 != null) {
            com.inmobi.media.Bo webViewFactory2 = c3.f4635a.getWebViewFactory();
            webViewFactory2.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.unity3d.ads.BuildConfig.FLAVOR, "id");
            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi2 = (com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) webViewFactory2.b.get(com.unity3d.ads.BuildConfig.FLAVOR);
            if (gestureDetectorOnGestureListenerC2675pi2 != null && (viewableAd2 = gestureDetectorOnGestureListenerC2675pi2.getViewableAd()) != null) {
                viewableAd2.a(findViewById4);
            }
            android.view.ViewParent parent2 = findViewById4.getParent();
            android.view.ViewGroup viewGroup3 = parent2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent2 : null;
            if (viewGroup3 != null) {
                viewGroup3.removeView(findViewById4);
                unit2 = kotlin.Unit.INSTANCE;
            }
            if (unit2 != null) {
                return;
            }
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t94 = c3.d;
        if (interfaceC2772t94 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t94).c("CloseButtonHandler", "Close region not present, not removing");
            kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
        }
    }

    public final void a(android.view.View view) {
        com.inmobi.media.Wn viewableAd;
        com.inmobi.media.Bo webViewFactory = this.f4635a.getWebViewFactory();
        webViewFactory.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.unity3d.ads.BuildConfig.FLAVOR, "id");
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = (com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) webViewFactory.b.get(com.unity3d.ads.BuildConfig.FLAVOR);
        if (gestureDetectorOnGestureListenerC2675pi == null || (viewableAd = gestureDetectorOnGestureListenerC2675pi.getViewableAd()) == null) {
            return;
        }
        viewableAd.a(view, com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose.CLOSE_AD);
    }

    public final kotlin.Pair a() {
        float f = com.inmobi.media.N5.d().c;
        android.view.View.OnClickListener onClickListener = new android.view.View.OnClickListener() { // from class: com.inmobi.media.C3$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.inmobi.media.C3.a(com.inmobi.media.C3.this, view);
            }
        };
        int i = (int) (50 * f);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(i, i);
        layoutParams.addRule(11);
        return kotlin.TuplesKt.to(onClickListener, layoutParams);
    }

    public static final void a(com.inmobi.media.C3 c3, android.view.View view) {
        try {
            c3.f4635a.n();
        } catch (java.lang.Exception e) {
            e.getMessage();
            com.inmobi.media.Sb.a((byte) 2, "InMobi", "SDK encountered unexpected error in processing close request");
        }
    }
}
