package com.facetec.sdk;

/* loaded from: classes8.dex */
final class cf {
    static boolean b = false;
    private android.animation.ValueAnimator h;
    private java.lang.Integer i;
    private java.lang.Integer k;
    private final java.lang.ref.WeakReference<com.facetec.sdk.bf> m;
    private java.lang.Integer n;

    /* renamed from: a, reason: collision with root package name */
    boolean f3461a = false;
    private boolean j = false;
    boolean d = false;
    boolean c = false;
    float e = 0.0f;
    private boolean f = false;
    final com.facetec.sdk.df g = new com.facetec.sdk.df();

    cf(android.app.Activity activity) {
        this.m = new java.lang.ref.WeakReference<>((com.facetec.sdk.bf) activity);
    }

    final void a(java.lang.Boolean bool) {
        if (com.facetec.sdk.FaceTecSDK.b()) {
            return;
        }
        if (this.f && bool.booleanValue()) {
            return;
        }
        if (b && bool.booleanValue()) {
            return;
        }
        if (bool.booleanValue()) {
            com.facetec.sdk.FaceTecSDK.e = com.facetec.sdk.FaceTecSDK.b.LOW_LIGHT_FROM_SENSOR;
        } else {
            if (com.facetec.sdk.cq.A()) {
                com.facetec.sdk.FaceTecSDK.e = com.facetec.sdk.FaceTecSDK.b.LOW_LIGHT_FROM_PHX_ENV;
            } else {
                com.facetec.sdk.FaceTecSDK.e = com.facetec.sdk.FaceTecSDK.b.LOW_LIGHT_FROM_PHX_FACE;
            }
            this.f = true;
        }
        com.facetec.sdk.cq.M(com.facetec.sdk.as.ac, bool.booleanValue());
        com.facetec.sdk.cq.u();
        com.facetec.sdk.FaceTecSessionActivity faceTecSessionActivity = (com.facetec.sdk.FaceTecSessionActivity) this.m.get();
        if (faceTecSessionActivity != null) {
            faceTecSessionActivity.runOnUiThread(new java.lang.Runnable() { // from class: com.facetec.sdk.cf$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.cf.this.j();
                }
            });
        }
    }

    final void b() {
        if (com.facetec.sdk.FaceTecSDK.e == com.facetec.sdk.FaceTecSDK.b.BRIGHT_LIGHT) {
            return;
        }
        com.facetec.sdk.FaceTecSDK.e = com.facetec.sdk.FaceTecSDK.b.BRIGHT_LIGHT;
        this.f = true;
        com.facetec.sdk.cq.x();
        com.facetec.sdk.FaceTecSessionActivity faceTecSessionActivity = (com.facetec.sdk.FaceTecSessionActivity) this.m.get();
        if (faceTecSessionActivity != null) {
            faceTecSessionActivity.runOnUiThread(new java.lang.Runnable() { // from class: com.facetec.sdk.cf$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.cf.this.i();
                }
            });
        }
    }

    final void c() {
        com.facetec.sdk.FaceTecSessionActivity faceTecSessionActivity = (com.facetec.sdk.FaceTecSessionActivity) this.m.get();
        if (faceTecSessionActivity == null) {
            return;
        }
        if (com.facetec.sdk.FaceTecSDK.f3366a.f3361o.d == com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM && com.facetec.sdk.FaceTecSDK.f3366a.f3361o.b != null) {
            int intValue = ((java.lang.Integer) com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), 958631300, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -958631287)).intValue();
            if (faceTecSessionActivity.x != null && intValue != 0) {
                faceTecSessionActivity.x.setImageDrawable(androidx.core.content.ContextCompat.getDrawable(faceTecSessionActivity, intValue));
            }
        }
        int aI = com.facetec.sdk.dm.aI();
        if (com.facetec.sdk.FaceTecSDK.f3366a.j.showBrandingImage && aI != 0) {
            faceTecSessionActivity.K.setImageDrawable(androidx.core.content.ContextCompat.getDrawable(faceTecSessionActivity, aI));
        }
        faceTecSessionActivity.y.setBackground(com.facetec.sdk.dm.s(faceTecSessionActivity));
        if (faceTecSessionActivity.j != null) {
            faceTecSessionActivity.j.n();
        }
        if (faceTecSessionActivity.f != null) {
            faceTecSessionActivity.f.n();
        }
    }

    private void h() {
        final com.facetec.sdk.FaceTecSessionActivity faceTecSessionActivity = (com.facetec.sdk.FaceTecSessionActivity) this.m.get();
        if (this.i == null) {
            this.i = java.lang.Integer.valueOf(com.facetec.sdk.dp.e(faceTecSessionActivity, com.facetec.sdk.FaceTecSDK.f3366a.j.backgroundColor));
        }
        if (this.k == null) {
            this.k = java.lang.Integer.valueOf(com.facetec.sdk.dp.e(faceTecSessionActivity, com.facetec.sdk.FaceTecSDK.f3366a.g.backgroundColors));
        }
        if (this.n == null) {
            this.n = java.lang.Integer.valueOf(com.facetec.sdk.dp.e(faceTecSessionActivity, com.facetec.sdk.FaceTecSDK.f3366a.n.borderColor));
        }
        faceTecSessionActivity.runOnUiThread(new java.lang.Runnable() { // from class: com.facetec.sdk.cf$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.cf.this.d(faceTecSessionActivity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(final com.facetec.sdk.FaceTecSessionActivity faceTecSessionActivity) {
        new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new java.lang.Runnable() { // from class: com.facetec.sdk.cf$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.cf.this.c();
            }
        }, 500L);
        android.animation.ValueAnimator c = com.facetec.sdk.ay.c(faceTecSessionActivity.y, this.k.intValue(), java.lang.Integer.valueOf(com.facetec.sdk.dp.e(faceTecSessionActivity, com.facetec.sdk.dm.X())).intValue());
        c.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.cf$$ExternalSyntheticLambda6
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.facetec.sdk.cf.this.c(valueAnimator);
            }
        });
        c.start();
        android.animation.ValueAnimator c2 = com.facetec.sdk.ay.c(faceTecSessionActivity.M, this.i.intValue(), java.lang.Integer.valueOf(com.facetec.sdk.dp.e(faceTecSessionActivity, com.facetec.sdk.dm.U())).intValue());
        c2.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.cf$$ExternalSyntheticLambda7
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.facetec.sdk.cf.this.a(valueAnimator);
            }
        });
        c2.start();
        android.animation.ValueAnimator d = com.facetec.sdk.ay.d(new java.util.ArrayList(java.util.Arrays.asList(faceTecSessionActivity.u, faceTecSessionActivity.w, faceTecSessionActivity.v)), (android.graphics.drawable.GradientDrawable) faceTecSessionActivity.u.getBackground(), (int) (com.facetec.sdk.ay.d(com.facetec.sdk.dm.o()) * com.facetec.sdk.dm.b()), this.n.intValue(), java.lang.Integer.valueOf(((java.lang.Integer) com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), 817839405, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[]{faceTecSessionActivity}, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -817839365)).intValue()).intValue());
        d.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.cf$$ExternalSyntheticLambda8
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.facetec.sdk.cf.this.d(faceTecSessionActivity, valueAnimator);
            }
        });
        d.start();
        if (faceTecSessionActivity.j != null) {
            faceTecSessionActivity.j.k();
        }
        if (faceTecSessionActivity.f != null) {
            faceTecSessionActivity.f.k();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(android.animation.ValueAnimator valueAnimator) {
        this.k = (java.lang.Integer) valueAnimator.getAnimatedValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(android.animation.ValueAnimator valueAnimator) {
        this.i = (java.lang.Integer) valueAnimator.getAnimatedValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(com.facetec.sdk.FaceTecSessionActivity faceTecSessionActivity, android.animation.ValueAnimator valueAnimator) {
        this.n = (java.lang.Integer) valueAnimator.getAnimatedValue();
        faceTecSessionActivity.u.invalidate();
        faceTecSessionActivity.w.invalidate();
        faceTecSessionActivity.v.invalidate();
    }

    final void e() {
        this.f3461a = false;
        this.j = false;
        android.animation.ValueAnimator valueAnimator = this.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.h.removeAllUpdateListeners();
        }
    }

    final float a() {
        com.facetec.sdk.FaceTecSessionActivity faceTecSessionActivity = (com.facetec.sdk.FaceTecSessionActivity) this.m.get();
        if (faceTecSessionActivity == null) {
            return 0.5f;
        }
        float f = faceTecSessionActivity.getWindow().getAttributes().screenBrightness;
        if (f >= 0.0f) {
            return f;
        }
        try {
            if (android.provider.Settings.System.getInt(faceTecSessionActivity.getContentResolver(), "screen_brightness_mode") == 1) {
                try {
                    return android.provider.Settings.System.getFloat(faceTecSessionActivity.getContentResolver(), "screen_auto_brightness_adj");
                } catch (android.provider.Settings.SettingNotFoundException unused) {
                    return f();
                }
            }
            return f();
        } catch (android.provider.Settings.SettingNotFoundException unused2) {
            return 0.5f;
        }
    }

    final void d(final float f, final float f2, int i) {
        final com.facetec.sdk.FaceTecSessionActivity faceTecSessionActivity = (com.facetec.sdk.FaceTecSessionActivity) this.m.get();
        int i2 = this.c ? com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.TransferFrameStart : 1500;
        android.animation.ValueAnimator valueAnimator = this.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.h.removeAllUpdateListeners();
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(f, f2);
        this.h = ofFloat;
        ofFloat.setDuration(i2);
        this.h.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.cf$$ExternalSyntheticLambda2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator2) {
                com.facetec.sdk.cf.e(com.facetec.sdk.FaceTecSessionActivity.this, valueAnimator2);
            }
        });
        this.h.setInterpolator(new android.view.animation.LinearInterpolator());
        this.h.setStartDelay(i);
        this.h.addListener(new com.facetec.sdk.b() { // from class: com.facetec.sdk.cf$$ExternalSyntheticLambda3
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(android.animation.Animator animator) {
                com.facetec.sdk.cf.this.b(f2, f, animator);
            }
        });
        this.h.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(com.facetec.sdk.FaceTecSessionActivity faceTecSessionActivity, android.animation.ValueAnimator valueAnimator) {
        if (faceTecSessionActivity == null) {
            return;
        }
        android.view.WindowManager.LayoutParams attributes = faceTecSessionActivity.getWindow().getAttributes();
        attributes.screenBrightness = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        faceTecSessionActivity.getWindow().setAttributes(attributes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(float f, float f2, android.animation.Animator animator) {
        if (this.d || this.c) {
            this.d = false;
            this.c = false;
        } else if (this.f3461a && com.facetec.sdk.cq.j() == com.facetec.sdk.cm.ZOOM_CLOSE && !this.j && f == this.g.a()) {
            this.j = true;
            d(this.g.c(), this.g.e ? 0.5f : 0.8f, 1000);
        } else if (this.f3461a) {
            d(f, f2, 1000);
        }
    }

    final void d() {
        if (this.h == null || a() == this.e) {
            return;
        }
        this.c = true;
        d(a(), this.e, 0);
        new android.os.Handler().postDelayed(new java.lang.Runnable() { // from class: com.facetec.sdk.cf$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.cf.this.g();
            }
        }, 800L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        android.animation.ValueAnimator valueAnimator = this.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.h.removeAllUpdateListeners();
        }
    }

    private float f() throws android.provider.Settings.SettingNotFoundException {
        return android.provider.Settings.System.getInt(((com.facetec.sdk.FaceTecSessionActivity) this.m.get()).getContentResolver(), "screen_brightness") / 255.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        this.f3461a = false;
        this.d = true;
        d(a(), this.g.c(), 0);
        h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        this.f3461a = false;
        this.d = true;
        d(a(), this.g.a(), 0);
        h();
    }
}
