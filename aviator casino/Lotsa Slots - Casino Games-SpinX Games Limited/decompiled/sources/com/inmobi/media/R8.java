package com.inmobi.media;

/* loaded from: classes5.dex */
public final class R8 implements com.inmobi.media.Of {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f4934a;
    public com.inmobi.media.C b;
    public com.inmobi.media.C2823v7 c;
    public android.widget.RelativeLayout d;
    public com.inmobi.media.U5 e;
    public com.inmobi.media.Lf f;
    public float g;
    public com.inmobi.media.InterfaceC2772t9 h;
    public final com.inmobi.media.Q8 i;
    public final com.inmobi.media.P8 j;

    public R8(com.inmobi.ads.rendering.InMobiAdActivity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        this.f4934a = new java.lang.ref.WeakReference(activity);
        this.f = com.inmobi.media.Mf.a(com.inmobi.media.N5.g());
        this.g = 1.0f;
        this.i = new com.inmobi.media.Q8(this);
        this.j = new com.inmobi.media.P8(this);
    }

    public final void a(android.content.Intent intent, android.util.SparseArray adContainers) {
        com.inmobi.media.U5 u5;
        android.view.Window window;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adContainers, "adContainers");
        if (!intent.hasExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX")) {
            android.app.Activity activity = (android.app.Activity) this.f4934a.get();
            if (activity instanceof com.inmobi.ads.rendering.InMobiAdActivity) {
                ((com.inmobi.ads.rendering.InMobiAdActivity) activity).b();
                return;
            }
            return;
        }
        com.inmobi.media.C c = (com.inmobi.media.C) adContainers.get(intent.getIntExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX", -1));
        if (c == null) {
            android.app.Activity activity2 = (android.app.Activity) this.f4934a.get();
            if (activity2 instanceof com.inmobi.ads.rendering.InMobiAdActivity) {
                ((com.inmobi.ads.rendering.InMobiAdActivity) activity2).b();
                return;
            }
            return;
        }
        int intExtra = intent.getIntExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_TYPE", 0);
        if (intExtra == 0) {
            com.inmobi.media.B fullScreenEventsListener = ((com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) c).getFullScreenEventsListener();
            if (fullScreenEventsListener != null) {
                ((com.inmobi.media.C2489ii) fullScreenEventsListener).a();
            }
            android.app.Activity activity3 = (android.app.Activity) this.f4934a.get();
            if (activity3 instanceof com.inmobi.ads.rendering.InMobiAdActivity) {
                ((com.inmobi.ads.rendering.InMobiAdActivity) activity3).b();
                return;
            }
            return;
        }
        if (intent.getBooleanExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_IS_FULL_SCREEN", false) && (this.f4934a.get() instanceof com.inmobi.ads.rendering.InMobiAdActivity)) {
            java.lang.Object obj = this.f4934a.get();
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.inmobi.ads.rendering.InMobiAdActivity");
            if (!((com.inmobi.ads.rendering.InMobiAdActivity) obj).g) {
                java.lang.Object obj2 = this.f4934a.get();
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.inmobi.ads.rendering.InMobiAdActivity");
                ((com.inmobi.ads.rendering.InMobiAdActivity) obj2).g = true;
                if ((c instanceof com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) && ((com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) c).X0) {
                    com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.h;
                    if (interfaceC2772t9 != null) {
                        ((com.inmobi.media.C2799u9) interfaceC2772t9).a("InMobiActivityViewHandler", "showInImmersiveMode");
                    }
                    java.lang.Object obj3 = this.f4934a.get();
                    com.inmobi.ads.rendering.InMobiAdActivity inMobiAdActivity = obj3 instanceof com.inmobi.ads.rendering.InMobiAdActivity ? (com.inmobi.ads.rendering.InMobiAdActivity) obj3 : null;
                    if (inMobiAdActivity != null && (window = inMobiAdActivity.getWindow()) != null) {
                        com.inmobi.media.B5.f4614a.getClass();
                        if (com.inmobi.media.B5.t()) {
                            android.view.WindowManager.LayoutParams attributes = window.getAttributes();
                            attributes.layoutInDisplayCutoutMode = 3;
                            window.setAttributes(attributes);
                            androidx.core.view.WindowCompat.setDecorFitsSystemWindows(window, false);
                        } else if (com.inmobi.media.B5.r()) {
                            android.view.WindowManager.LayoutParams attributes2 = window.getAttributes();
                            attributes2.layoutInDisplayCutoutMode = 1;
                            window.setAttributes(attributes2);
                            androidx.core.view.WindowCompat.setDecorFitsSystemWindows(window, false);
                        }
                        if (com.inmobi.media.B5.t()) {
                            androidx.core.view.WindowInsetsControllerCompat insetsController = androidx.core.view.WindowCompat.getInsetsController(window, window.getDecorView());
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(insetsController, "getInsetsController(...)");
                            insetsController.setSystemBarsBehavior(2);
                            insetsController.hide(androidx.core.view.WindowInsetsCompat.Type.systemBars());
                            insetsController.hide(androidx.core.view.WindowInsetsCompat.Type.displayCutout());
                        } else if (com.inmobi.media.B5.w()) {
                            window.getDecorView().setSystemUiVisibility(5638);
                        }
                    }
                } else {
                    android.app.Activity activity4 = (android.app.Activity) this.f4934a.get();
                    if (activity4 != null) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity4, "<this>");
                        try {
                            activity4.requestWindowFeature(1);
                            activity4.getWindow().setFlags(1024, 1024);
                        } catch (java.lang.Exception unused) {
                        }
                    }
                }
            }
        }
        if ((200 == intExtra && !kotlin.jvm.internal.Intrinsics.areEqual("html", ((com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) c).getMarkupType())) || ((202 == intExtra && !kotlin.jvm.internal.Intrinsics.areEqual("htmlUrl", ((com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) c).getMarkupType())) || (201 == intExtra && !kotlin.jvm.internal.Intrinsics.areEqual("inmobiJson", ((com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) c).getMarkupType())))) {
            com.inmobi.media.B fullScreenEventsListener2 = ((com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) c).getFullScreenEventsListener();
            if (fullScreenEventsListener2 != null) {
                ((com.inmobi.media.C2489ii) fullScreenEventsListener2).a();
            }
            android.app.Activity activity5 = (android.app.Activity) this.f4934a.get();
            if (activity5 instanceof com.inmobi.ads.rendering.InMobiAdActivity) {
                ((com.inmobi.ads.rendering.InMobiAdActivity) activity5).b();
                return;
            }
            return;
        }
        try {
            this.b = c;
            ((com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) c).setFullScreenActivityContext((android.app.Activity) this.f4934a.get());
            a();
            android.app.Activity activity6 = (android.app.Activity) this.f4934a.get();
            if (activity6 != null) {
                android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(activity6);
                relativeLayout.setId(65534);
                this.d = relativeLayout;
            }
            a(c);
            com.inmobi.media.C2823v7 c2823v7 = this.c;
            if (c2823v7 != null) {
                c2823v7.d();
            }
            android.app.Activity activity7 = (android.app.Activity) this.f4934a.get();
            if (activity7 != null) {
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) activity7.findViewById(android.R.id.content);
                android.widget.RelativeLayout relativeLayout2 = frameLayout != null ? (android.widget.RelativeLayout) frameLayout.findViewById(65519) : null;
                android.widget.RelativeLayout relativeLayout3 = this.d;
                if (relativeLayout3 != null && relativeLayout2 != null) {
                    android.widget.RelativeLayout relativeLayout4 = (android.widget.RelativeLayout) relativeLayout2.findViewById(65534);
                    if (relativeLayout4 != null) {
                        relativeLayout2.removeView(relativeLayout4);
                    }
                    relativeLayout2.addView(relativeLayout3);
                    com.inmobi.media.C2823v7 c2823v72 = this.c;
                    if (c2823v72 != null) {
                        c2823v72.c();
                    }
                }
            }
            if (c instanceof com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) {
                ((com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) c).setEmbeddedBrowserJsCallbacks(this.j);
            }
            if (!(c instanceof com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) || (u5 = this.e) == null) {
                return;
            }
            u5.setUserLeftApplicationListener(((com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) c).getListener());
        } catch (java.lang.Exception e) {
            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = (com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) c;
            gestureDetectorOnGestureListenerC2675pi.setFullScreenActivityContext(null);
            com.inmobi.media.B fullScreenEventsListener3 = gestureDetectorOnGestureListenerC2675pi.getFullScreenEventsListener();
            if (fullScreenEventsListener3 != null) {
                ((com.inmobi.media.C2489ii) fullScreenEventsListener3).a();
            }
            android.app.Activity activity8 = (android.app.Activity) this.f4934a.get();
            if (activity8 instanceof com.inmobi.ads.rendering.InMobiAdActivity) {
                ((com.inmobi.ads.rendering.InMobiAdActivity) activity8).b();
            }
            kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
            com.inmobi.media.AbstractC2665p9.a(e);
        }
    }

    public final void b(com.inmobi.media.Lf lf) {
        java.util.Objects.toString(lf);
        this.f = lf;
    }

    public final void c() {
        try {
            final com.inmobi.media.U5 u5 = this.e;
            if (u5 != null) {
                android.view.ViewParent parent = u5.getParent();
                android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(u5);
                }
                android.view.ViewParent parent2 = u5.getParent();
                android.view.ViewGroup viewGroup2 = parent2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent2 : null;
                if (viewGroup2 != null) {
                    viewGroup2.post(new java.lang.Runnable() { // from class: com.inmobi.media.R8$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.inmobi.media.R8.a(com.inmobi.media.U5.this);
                        }
                    });
                }
            }
            com.inmobi.media.U5 u52 = this.e;
            if (u52 != null) {
                com.inmobi.media.Z5 z5 = u52.c;
                if (z5 != null) {
                    z5.destroy();
                }
                u52.c = null;
                u52.d = null;
                u52.e = null;
                com.inmobi.media.Oo oo = u52.g;
                if (oo != null) {
                    oo.a();
                }
                u52.removeAllViews();
            }
            this.e = null;
            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.g1.getClass();
            a(com.inmobi.media.Vh.a("IN_CUSTOM_EXPAND", "onClose"));
        } catch (java.lang.Exception unused) {
        }
    }

    public final void b() {
        com.inmobi.media.P5 d;
        android.app.Activity activity;
        if (this.e == null) {
            return;
        }
        com.inmobi.media.C c = this.b;
        if (c != null && (((c instanceof com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) && ((com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) c).X0) || ((activity = (android.app.Activity) this.f4934a.get()) != null && com.inmobi.media.J3.a(activity)))) {
            d = com.inmobi.media.N5.h();
        } else {
            d = com.inmobi.media.N5.d();
        }
        float f = d.f4888a;
        float f2 = d.c;
        float f3 = f * f2;
        float f4 = d.b * f2;
        if (com.inmobi.media.Mf.b(this.f)) {
            a(kotlin.math.MathKt.roundToInt((1 - this.g) * f3), -1);
        } else {
            a(-1, kotlin.math.MathKt.roundToInt((1 - this.g) * f4));
        }
    }

    public final void a() {
        android.app.Activity activity = (android.app.Activity) this.f4934a.get();
        if (activity == null) {
            return;
        }
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) activity.findViewById(android.R.id.content);
        if ((frameLayout != null ? (android.widget.RelativeLayout) frameLayout.findViewById(65519) : null) != null) {
            return;
        }
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(activity);
        relativeLayout.setId(65519);
        relativeLayout.setBackgroundColor(0);
        frameLayout.removeAllViews();
        frameLayout.addView(relativeLayout, new android.widget.RelativeLayout.LayoutParams(-1, -1));
    }

    public final void a(com.inmobi.media.C c) {
        android.widget.RelativeLayout relativeLayout;
        if (((android.app.Activity) this.f4934a.get()) == null || (relativeLayout = this.d) == null) {
            return;
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = (com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) c;
        java.lang.String markupType = gestureDetectorOnGestureListenerC2675pi.getMarkupType();
        if (!kotlin.jvm.internal.Intrinsics.areEqual(markupType, "html") && !kotlin.jvm.internal.Intrinsics.areEqual(markupType, "htmlUrl")) {
            throw new java.lang.IllegalArgumentException("InMobiActivityViewHandler: Unknown Markup type");
        }
        com.inmobi.media.C2823v7 c2823v7 = new com.inmobi.media.C2823v7(this.f4934a, gestureDetectorOnGestureListenerC2675pi, relativeLayout);
        this.c = c2823v7;
        c2823v7.a(this.f);
        c2823v7.c = this.g;
        c2823v7.d = gestureDetectorOnGestureListenerC2675pi.X0;
    }

    public final void a(org.json.JSONObject jsonObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        com.inmobi.media.C c = this.b;
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = c instanceof com.inmobi.media.GestureDetectorOnGestureListenerC2675pi ? (com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) c : null;
        if (gestureDetectorOnGestureListenerC2675pi != null) {
            gestureDetectorOnGestureListenerC2675pi.c(jsonObject);
        }
    }

    @Override // com.inmobi.media.Of
    public final void a(com.inmobi.media.Lf orientation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(orientation, "orientation");
        if (((android.app.Activity) this.f4934a.get()) == null) {
            return;
        }
        com.inmobi.media.C2823v7 c2823v7 = this.c;
        if (c2823v7 != null) {
            c2823v7.a(orientation);
        }
        com.inmobi.media.Lf lf = this.f;
        if (lf != orientation && com.inmobi.media.Mf.b(lf) != com.inmobi.media.Mf.b(orientation)) {
            b(orientation);
            com.inmobi.media.C2823v7 c2823v72 = this.c;
            if (c2823v72 != null) {
                c2823v72.c();
            }
            b();
            return;
        }
        b(orientation);
    }

    public static final void a(com.inmobi.media.R8 r8) {
        r8.g = 1.0f;
        com.inmobi.media.C2823v7 c2823v7 = r8.c;
        if (c2823v7 != null) {
            c2823v7.c = 1.0f;
            c2823v7.c();
        }
        com.inmobi.media.U5 u5 = r8.e;
        if (u5 != null) {
            u5.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(0, 0));
        }
        r8.c();
    }

    public static final void a(com.inmobi.media.U5 u5) {
        u5.getParent().requestLayout();
    }

    public final void a(int i, int i2) {
        android.widget.RelativeLayout.LayoutParams layoutParams;
        android.app.Activity activity = (android.app.Activity) this.f4934a.get();
        if (activity == null) {
            return;
        }
        com.inmobi.media.Mf.b(this.f);
        if (com.inmobi.media.Mf.b(this.f)) {
            layoutParams = new android.widget.RelativeLayout.LayoutParams(i, i2);
            layoutParams.addRule(11);
        } else {
            layoutParams = new android.widget.RelativeLayout.LayoutParams(i, i2);
            layoutParams.addRule(12);
        }
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) ((android.widget.FrameLayout) activity.findViewById(android.R.id.content)).findViewById(65519);
        kotlin.jvm.internal.Intrinsics.checkNotNull(relativeLayout);
        if (((android.widget.RelativeLayout) relativeLayout.findViewById(65518)) != null) {
            com.inmobi.media.U5 u5 = this.e;
            if (u5 != null) {
                u5.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        com.inmobi.media.U5 u52 = this.e;
        if (u52 != null) {
            relativeLayout.addView(u52, layoutParams);
        }
    }
}
