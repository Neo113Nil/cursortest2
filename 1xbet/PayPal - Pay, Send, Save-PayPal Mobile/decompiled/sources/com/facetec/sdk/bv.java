package com.facetec.sdk;

/* loaded from: classes8.dex */
final class bv extends android.view.View {

    /* renamed from: a, reason: collision with root package name */
    android.graphics.Paint f3439a;
    int b;
    int c;
    float d;
    com.facetec.sdk.bv.d e;
    private android.graphics.RectF f;
    private boolean g;
    private boolean h;
    float i;
    private final android.content.Context j;
    private float l;
    private float n;

    /* renamed from: o, reason: collision with root package name */
    private android.graphics.Paint f3440o;

    enum d {
        DEFAULT,
        SMALL_FOR_OVERZOOMED
    }

    public bv(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = com.facetec.sdk.bv.d.DEFAULT;
        this.g = false;
        this.h = false;
        this.j = context;
        post(new java.lang.Runnable() { // from class: com.facetec.sdk.bv$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.bv.this.e();
            }
        });
    }

    @Override // android.view.View
    protected final void onDraw(android.graphics.Canvas canvas) {
        android.graphics.RectF rectF;
        android.graphics.Paint paint;
        canvas.drawColor(com.facetec.sdk.dp.d(com.facetec.sdk.dm.d(this.j), 255));
        if (!this.g || (rectF = this.f) == null || (paint = this.f3440o) == null || this.f3439a == null) {
            return;
        }
        float f = this.c;
        canvas.drawRoundRect(rectF, f, f, paint);
        android.graphics.RectF rectF2 = this.f;
        float f2 = this.c;
        canvas.drawRoundRect(rectF2, f2, f2, this.f3439a);
    }

    final android.graphics.RectF d() {
        if (this.f == null) {
            d(false);
        }
        return this.f;
    }

    final void b() {
        this.g = true;
        postInvalidate();
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        d(true);
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void e() {
        this.c = java.lang.Math.round(com.facetec.sdk.ay.d(com.facetec.sdk.dm.M()) * com.facetec.sdk.dm.b());
        this.b = java.lang.Math.round(com.facetec.sdk.ay.d(com.facetec.sdk.dm.x()) * com.facetec.sdk.dm.b());
        c(com.facetec.sdk.dm.d());
        setLayerType(1, null);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f3440o = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f3440o.setAlpha(0);
        this.f3440o.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
        setLayerType(2, null);
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        this.f3439a = paint2;
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        this.f3439a.setStrokeWidth(java.lang.Math.round(this.b));
        this.f3439a.setColor(((java.lang.Integer) com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), -454362248, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[]{this.j}, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 454362277)).intValue());
    }

    final void d(boolean z) {
        if (!this.h || z) {
            this.h = true;
            int width = getWidth();
            int height = getHeight();
            float f = width;
            float d2 = (f - (com.facetec.sdk.dm.d() * 2.0f)) * a();
            float f2 = height;
            float f3 = (f2 - (0.632f * d2)) / 2.0f;
            float f4 = (f - d2) / 2.0f;
            c(f4);
            android.graphics.RectF rectF = new android.graphics.RectF();
            this.f = rectF;
            rectF.set(f4, f3, f - f4, f2 - f3);
            com.facetec.sdk.ai.f = this.f.centerX();
            com.facetec.sdk.ai.g = this.f.centerY();
        }
    }

    private void c(float f) {
        this.d = f;
        this.n = f / 1.5f;
        this.l = getWidth() / 2.0f;
        this.i = this.d;
    }

    private android.graphics.RectF b(float f) {
        float width = getWidth();
        float height = getHeight();
        float f2 = (height - ((width - (f * 2.0f)) * 0.632f)) / 2.0f;
        return new android.graphics.RectF(f, f2, width - f, height - f2);
    }

    final void e(final java.lang.Runnable runnable) {
        final java.lang.Runnable runnable2 = new java.lang.Runnable() { // from class: com.facetec.sdk.bv$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.bv.this.c(runnable);
            }
        };
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(this.i, this.n);
        ofFloat.setDuration(200L);
        ofFloat.setInterpolator(new android.view.animation.DecelerateInterpolator());
        ofFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.bv$$ExternalSyntheticLambda6
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.facetec.sdk.bv.this.e(valueAnimator);
            }
        });
        ofFloat.addListener(new com.facetec.sdk.b() { // from class: com.facetec.sdk.bv$$ExternalSyntheticLambda7
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(android.animation.Animator animator) {
                com.facetec.sdk.bv.c(runnable2, animator);
            }
        });
        ofFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        this.i = floatValue;
        this.f = b(floatValue);
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(java.lang.Runnable runnable, android.animation.Animator animator) {
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        this.i = floatValue;
        this.f = b(floatValue);
        this.c = java.lang.Math.min(java.lang.Math.round(((getWidth() - (this.i * 2.0f)) * 0.632f) / 2.0f), this.c);
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(final java.lang.Runnable runnable, android.animation.Animator animator) {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(this.b, 0.0f);
        ofFloat.setDuration(100L);
        ofFloat.setInterpolator(new android.view.animation.AccelerateInterpolator());
        ofFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.bv$$ExternalSyntheticLambda2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.facetec.sdk.bv.this.b(valueAnimator);
            }
        });
        ofFloat.addListener(new com.facetec.sdk.b() { // from class: com.facetec.sdk.bv$$ExternalSyntheticLambda3
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(android.animation.Animator animator2) {
                com.facetec.sdk.bv.e(runnable, animator2);
            }
        });
        ofFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(android.animation.ValueAnimator valueAnimator) {
        this.f3439a.setStrokeWidth(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(java.lang.Runnable runnable, android.animation.Animator animator) {
        if (runnable != null) {
            runnable.run();
        }
    }

    private float a() {
        if (this.e != com.facetec.sdk.bv.d.SMALL_FOR_OVERZOOMED) {
            return 1.0f;
        }
        return 1.0f / (((new java.util.Random().nextInt(java.lang.Math.round(0.050000004f) + 1) / 100.0f) + 0.1f) + 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(final java.lang.Runnable runnable) {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(this.i, this.l);
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(new android.view.animation.AccelerateInterpolator());
        ofFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.bv$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.facetec.sdk.bv.this.d(valueAnimator);
            }
        });
        ofFloat.addListener(new com.facetec.sdk.b() { // from class: com.facetec.sdk.bv$$ExternalSyntheticLambda1
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(android.animation.Animator animator) {
                com.facetec.sdk.bv.this.d(runnable, animator);
            }
        });
        ofFloat.start();
    }
}
