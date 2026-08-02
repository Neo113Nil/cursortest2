package com.facetec.sdk;

/* loaded from: classes8.dex */
class e extends androidx.appcompat.widget.AppCompatButton {

    /* renamed from: a, reason: collision with root package name */
    private android.graphics.drawable.Drawable f3536a;
    private int b;
    private int c;
    boolean d;
    private android.graphics.Typeface e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private boolean k;
    private boolean l;
    private com.facetec.sdk.FaceTecSDK.b m;
    private android.animation.ValueAnimator n;

    /* renamed from: o, reason: collision with root package name */
    private com.facetec.sdk.e.EnumC0062e f3537o;
    private android.animation.ValueAnimator r;
    private android.animation.ValueAnimator t;

    /* renamed from: com.facetec.sdk.e$e, reason: collision with other inner class name */
    enum EnumC0062e {
        Guidance,
        IDScan,
        OCRConfirmation
    }

    public e(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = 200;
        this.d = false;
        this.k = false;
        this.l = false;
        this.f3537o = com.facetec.sdk.e.EnumC0062e.Guidance;
        this.m = com.facetec.sdk.FaceTecSDK.b.NORMAL;
        this.n = new android.animation.ValueAnimator();
        this.r = new android.animation.ValueAnimator();
        this.t = new android.animation.ValueAnimator();
    }

    final void b(final java.lang.Runnable runnable) {
        setOnClickListener(new android.view.View.OnClickListener() { // from class: com.facetec.sdk.e$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.facetec.sdk.e.this.d(runnable, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(java.lang.Runnable runnable, android.view.View view) {
        c(false, true);
        if (runnable != null) {
            runnable.run();
        }
    }

    final void a() {
        if (this.l) {
            return;
        }
        com.facetec.sdk.ay.c(this);
        this.l = true;
        android.content.Context context = getContext();
        this.f3536a = androidx.core.content.ContextCompat.getDrawable(context, com.facetec.sdk.R.drawable.facetec_button_background);
        int i = com.facetec.sdk.e.AnonymousClass1.c[this.f3537o.ordinal()];
        if (i == 1) {
            this.c = com.facetec.sdk.dp.e(context, isEnabled() ? com.facetec.sdk.dm.Y() : com.facetec.sdk.dm.ac());
            this.b = com.facetec.sdk.dp.e(context, isEnabled() ? ((java.lang.Integer) com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), 267803742, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -267803698)).intValue() : com.facetec.sdk.dm.ab());
            this.f = com.facetec.sdk.dp.e(context, com.facetec.sdk.dm.af());
            this.i = ((java.lang.Integer) com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), 1135720948, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -1135720948)).intValue();
            this.j = com.facetec.sdk.dm.G();
            this.h = 20;
            this.e = com.facetec.sdk.FaceTecSDK.f3366a.g.buttonFont;
        } else if (i == 2) {
            this.c = com.facetec.sdk.dp.e(context, isEnabled() ? com.facetec.sdk.dm.ad() : com.facetec.sdk.dm.ai());
            this.b = com.facetec.sdk.dp.e(context, isEnabled() ? ((java.lang.Integer) com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), -721444267, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 721444308)).intValue() : com.facetec.sdk.dm.ag());
            this.f = com.facetec.sdk.dp.e(context, com.facetec.sdk.dm.aj());
            this.i = ((java.lang.Integer) com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), -1664573873, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 1664573900)).intValue();
            this.j = com.facetec.sdk.dm.E();
            this.h = 20;
            this.e = com.facetec.sdk.FaceTecSDK.f3366a.i.buttonFont;
        } else if (i == 3) {
            this.c = com.facetec.sdk.dp.e(context, isEnabled() ? ((java.lang.Integer) com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), 676273973, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -676273931)).intValue() : com.facetec.sdk.dm.ao());
            this.b = com.facetec.sdk.dp.e(context, isEnabled() ? com.facetec.sdk.dm.al() : com.facetec.sdk.dm.aq());
            this.f = com.facetec.sdk.dp.e(context, com.facetec.sdk.dm.ar());
            this.i = ((java.lang.Integer) com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), 2053843160, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -2053843125)).intValue();
            this.j = com.facetec.sdk.dm.I();
            this.h = 20;
            this.e = com.facetec.sdk.FaceTecSDK.f3366a.f.buttonFont;
        }
        setTextSize(2, this.h * com.facetec.sdk.dm.a() * com.facetec.sdk.dm.b());
        setTypeface(this.e);
        setMaxLines(1);
        b(false);
        setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.facetec.sdk.e$$ExternalSyntheticLambda0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                boolean a2;
                a2 = com.facetec.sdk.e.this.a(view, motionEvent);
                return a2;
            }
        });
    }

    /* renamed from: com.facetec.sdk.e$1, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[com.facetec.sdk.e.EnumC0062e.values().length];
            c = iArr;
            try {
                iArr[com.facetec.sdk.e.EnumC0062e.Guidance.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                c[com.facetec.sdk.e.EnumC0062e.IDScan.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                c[com.facetec.sdk.e.EnumC0062e.OCRConfirmation.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a(android.view.View view, android.view.MotionEvent motionEvent) {
        if (!isEnabled()) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            c(true, false);
        } else if (motionEvent.getAction() == 3 || motionEvent.getX() < 0.0f || motionEvent.getX() > getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() > getHeight()) {
            c(false, true);
        } else if (motionEvent.getAction() == 1) {
            performClick();
        }
        return true;
    }

    final void c() {
        this.f3537o = com.facetec.sdk.e.EnumC0062e.IDScan;
        this.l = false;
        a();
    }

    final void e() {
        this.f3537o = com.facetec.sdk.e.EnumC0062e.OCRConfirmation;
        this.l = false;
        a();
    }

    private void b(boolean z) {
        int e;
        int e2;
        int e3;
        int e4;
        if (this.d) {
            d();
        }
        this.d = true;
        android.content.Context context = getContext();
        final float b = com.facetec.sdk.dm.b();
        int i = 0;
        int i2 = z ? this.g : 0;
        int i3 = this.c;
        int i4 = this.f;
        int i5 = this.b;
        int i6 = com.facetec.sdk.e.AnonymousClass1.c[this.f3537o.ordinal()];
        if (i6 == 1) {
            e = com.facetec.sdk.dp.e(context, com.facetec.sdk.dm.af());
            if (!isEnabled()) {
                i = com.facetec.sdk.dp.e(context, com.facetec.sdk.dm.ac());
                e4 = com.facetec.sdk.dp.e(context, com.facetec.sdk.dm.ab());
            } else if (this.k) {
                i = com.facetec.sdk.dp.e(context, ((java.lang.Integer) com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), 258885347, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -258885341)).intValue());
                e4 = com.facetec.sdk.dp.e(context, com.facetec.sdk.dm.Z());
            } else {
                e2 = com.facetec.sdk.dp.e(context, com.facetec.sdk.dm.Y());
                e3 = com.facetec.sdk.dp.e(context, ((java.lang.Integer) com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), 267803742, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -267803698)).intValue());
                e4 = e3;
                i = e2;
            }
        } else if (i6 == 2) {
            e = com.facetec.sdk.dp.e(context, com.facetec.sdk.dm.aj());
            if (!isEnabled()) {
                i = com.facetec.sdk.dp.e(context, com.facetec.sdk.dm.ai());
                e4 = com.facetec.sdk.dp.e(context, com.facetec.sdk.dm.ag());
            } else {
                if (this.k) {
                    e2 = com.facetec.sdk.dp.e(context, com.facetec.sdk.dm.am());
                    e3 = com.facetec.sdk.dp.e(context, ((java.lang.Integer) com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), 1648131984, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -1648131960)).intValue());
                } else {
                    e2 = com.facetec.sdk.dp.e(context, com.facetec.sdk.dm.ad());
                    e3 = com.facetec.sdk.dp.e(context, ((java.lang.Integer) com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), -721444267, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 721444308)).intValue());
                }
                e4 = e3;
                i = e2;
            }
        } else if (i6 != 3) {
            e = 0;
            e4 = 0;
        } else {
            e = com.facetec.sdk.dp.e(context, com.facetec.sdk.dm.ar());
            if (!isEnabled()) {
                i = com.facetec.sdk.dp.e(context, com.facetec.sdk.dm.ao());
                e4 = com.facetec.sdk.dp.e(context, com.facetec.sdk.dm.aq());
            } else if (this.k) {
                i = com.facetec.sdk.dp.e(context, com.facetec.sdk.dm.ap());
                e4 = com.facetec.sdk.dp.e(context, com.facetec.sdk.dm.ak());
            } else {
                i = com.facetec.sdk.dp.e(context, ((java.lang.Integer) com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), 676273973, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -676273931)).intValue());
                e4 = com.facetec.sdk.dp.e(context, com.facetec.sdk.dm.al());
            }
        }
        android.animation.ValueAnimator ofObject = android.animation.ValueAnimator.ofObject(new android.animation.ArgbEvaluator(), java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i));
        this.n = ofObject;
        long j = i2;
        ofObject.setDuration(j);
        this.n.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.e$$ExternalSyntheticLambda2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.facetec.sdk.e.this.b(valueAnimator);
            }
        });
        this.n.start();
        android.animation.ValueAnimator ofObject2 = android.animation.ValueAnimator.ofObject(new android.animation.ArgbEvaluator(), java.lang.Integer.valueOf(i4), java.lang.Integer.valueOf(e));
        this.r = ofObject2;
        ofObject2.setDuration(j);
        this.r.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.e$$ExternalSyntheticLambda3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.facetec.sdk.e.this.b(b, valueAnimator);
            }
        });
        this.r.start();
        android.animation.ValueAnimator ofObject3 = android.animation.ValueAnimator.ofObject(new android.animation.ArgbEvaluator(), java.lang.Integer.valueOf(i5), java.lang.Integer.valueOf(e4));
        this.t = ofObject3;
        ofObject3.setDuration(j);
        this.t.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.e$$ExternalSyntheticLambda4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.facetec.sdk.e.this.a(valueAnimator);
            }
        });
        this.t.addListener(new com.facetec.sdk.b() { // from class: com.facetec.sdk.e$$ExternalSyntheticLambda5
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(android.animation.Animator animator) {
                com.facetec.sdk.e.this.b(animator);
            }
        });
        this.t.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(android.animation.ValueAnimator valueAnimator) {
        this.c = ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue();
        com.facetec.sdk.dp.c(this.f3536a, ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(float f, android.animation.ValueAnimator valueAnimator) {
        this.f = ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue();
        com.facetec.sdk.dp.a(this.f3536a, ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue(), java.lang.Math.round(com.facetec.sdk.ay.d(this.i) * f), com.facetec.sdk.ay.d(this.j) * f);
        setBackground(this.f3536a);
        postInvalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(android.animation.ValueAnimator valueAnimator) {
        this.b = ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue();
        setTextColor(((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(android.animation.Animator animator) {
        this.d = false;
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        b(false);
    }

    final void a(boolean z, boolean z2) {
        if (isEnabled() == z) {
            if (this.d) {
                return;
            }
            b(false);
        } else {
            super.setEnabled(z);
            this.g = 200;
            b(z2);
        }
    }

    private void c(boolean z, boolean z2) {
        if (this.k == z || !isEnabled()) {
            return;
        }
        this.k = z;
        b(z2);
    }

    final void b() {
        if (this.m == com.facetec.sdk.FaceTecSDK.e) {
            return;
        }
        this.m = com.facetec.sdk.FaceTecSDK.e;
        this.g = 1000;
        b(true);
    }

    private void d() {
        this.n.cancel();
        this.r.cancel();
        this.t.cancel();
    }
}
