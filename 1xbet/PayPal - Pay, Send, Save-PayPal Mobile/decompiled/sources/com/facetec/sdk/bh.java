package com.facetec.sdk;

/* loaded from: classes8.dex */
class bh extends com.facetec.sdk.dc {
    android.graphics.Paint c;
    private final android.graphics.Matrix k;
    private final android.content.Context l;

    /* renamed from: o, reason: collision with root package name */
    private android.graphics.drawable.Drawable f3419o;
    private boolean p;
    private float q;
    private int r;
    private final float[] s;
    private float t;
    private int y;

    public bh(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k = new android.graphics.Matrix();
        this.s = new float[9];
        this.q = 0.0f;
        this.t = 0.0f;
        this.p = false;
        this.r = -1;
        this.y = -1;
        this.l = context;
        post(new java.lang.Runnable() { // from class: com.facetec.sdk.bh$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.bh.this.l();
            }
        });
    }

    @Override // com.facetec.sdk.dc, android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        android.graphics.drawable.Drawable drawable = this.f3419o;
        if (drawable != null) {
            drawable.draw(canvas);
            if (!this.p || this.e == null || this.h == null || this.g == null || this.c == null || this.d == null || this.f3498a == null) {
                return;
            }
            canvas.concat(this.k);
            canvas.drawOval(this.e, this.d);
            canvas.drawOval(this.g, this.c);
            canvas.drawOval(this.h, this.f3498a);
            return;
        }
        canvas.drawColor(com.facetec.sdk.dp.d(com.facetec.sdk.dm.m(this.l), 255));
    }

    final void b() {
        android.graphics.Paint paint = this.c;
        if (paint == null) {
            return;
        }
        com.facetec.sdk.ay.d(this.c, this, paint.getColor(), com.facetec.sdk.dm.k(this.l)).start();
        com.facetec.sdk.ay.d(this.f3498a, this, this.f3498a.getColor(), com.facetec.sdk.dm.n(this.l)).start();
        android.animation.ValueAnimator a2 = com.facetec.sdk.ay.a(this.f3419o, this, this.y, com.facetec.sdk.dm.X());
        a2.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.bh$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.facetec.sdk.bh.this.a(valueAnimator);
            }
        });
        a2.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(android.animation.ValueAnimator valueAnimator) {
        this.y = ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue();
    }

    final void d(final int i, final int i2, int i3) {
        postDelayed(new java.lang.Runnable() { // from class: com.facetec.sdk.bh$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.bh.this.a(i, i2);
            }
        }, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i, int i2) {
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(255, i);
        ofInt.setDuration(i2);
        ofInt.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.bh$$ExternalSyntheticLambda7
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.facetec.sdk.bh.this.e(valueAnimator);
            }
        });
        ofInt.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(android.animation.ValueAnimator valueAnimator) {
        android.graphics.drawable.Drawable drawable = this.f3419o;
        if (drawable == null) {
            return;
        }
        drawable.setAlpha(((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
        postInvalidateOnAnimation();
    }

    final void c(final int i) {
        postDelayed(new java.lang.Runnable() { // from class: com.facetec.sdk.bh$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.bh.this.e(i);
            }
        }, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(int i) {
        int alpha = this.c.getAlpha();
        android.content.Context context = this.l;
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(alpha, com.facetec.sdk.dm.d(context, com.facetec.sdk.dm.k(context)));
        long j = i;
        ofInt.setDuration(j);
        ofInt.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.bh$$ExternalSyntheticLambda1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.facetec.sdk.bh.this.d(valueAnimator);
            }
        });
        int alpha2 = this.f3498a.getAlpha();
        android.content.Context context2 = this.l;
        android.animation.ValueAnimator ofInt2 = android.animation.ValueAnimator.ofInt(alpha2, com.facetec.sdk.dm.d(context2, com.facetec.sdk.dm.n(context2)));
        ofInt2.setDuration(j);
        ofInt2.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.bh$$ExternalSyntheticLambda2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.facetec.sdk.bh.this.b(valueAnimator);
            }
        });
        ofInt.start();
        ofInt2.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(android.animation.ValueAnimator valueAnimator) {
        android.graphics.Paint paint = this.c;
        if (paint == null) {
            return;
        }
        paint.setAlpha(((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
        postInvalidateOnAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(android.animation.ValueAnimator valueAnimator) {
        if (this.f3498a == null) {
            return;
        }
        this.f3498a.setAlpha(((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
        postInvalidateOnAnimation();
    }

    final void d() {
        this.p = true;
        float b = com.facetec.sdk.dp.b().width * com.facetec.sdk.dm.b();
        this.q = b;
        this.k.setTranslate(b, 0.0f);
        post(new java.lang.Runnable() { // from class: com.facetec.sdk.bh$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.bh.this.i();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        android.animation.ValueAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this.q, 0.0f);
        ofFloat.setInterpolator(new android.view.animation.DecelerateInterpolator());
        ofFloat.setDuration(800L);
        ofFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.bh$$ExternalSyntheticLambda6
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.facetec.sdk.bh.this.c(valueAnimator);
            }
        });
        ofFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(android.animation.ValueAnimator valueAnimator) {
        android.graphics.Matrix matrix = this.k;
        if (matrix == null) {
            return;
        }
        matrix.getValues(this.s);
        float f = -((valueAnimator.getAnimatedFraction() * this.q) - (this.q - this.s[2]));
        this.t = f;
        this.k.postTranslate(f, 0.0f);
        postInvalidateOnAnimation();
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int width = getWidth();
        if (width != this.r) {
            if (this.f3419o == null) {
                this.y = com.facetec.sdk.dm.X();
                android.graphics.drawable.Drawable s = com.facetec.sdk.dm.s(this.l);
                this.f3419o = s;
                s.setAlpha(255);
            }
            this.f3419o.setBounds(0, 0, getWidth(), getHeight());
            if (this.r != -1) {
                d(true);
            }
            this.r = width;
        }
    }

    final void e() {
        this.p = true;
        postInvalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l() {
        setLayerType(2, null);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.c = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.c.setColor(com.facetec.sdk.dm.k(this.l));
    }
}
