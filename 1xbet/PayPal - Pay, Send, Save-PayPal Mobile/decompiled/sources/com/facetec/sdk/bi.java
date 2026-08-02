package com.facetec.sdk;

/* loaded from: classes8.dex */
final class bi extends android.view.View {

    /* renamed from: a, reason: collision with root package name */
    private final int f3420a;
    private int b;
    private final java.util.ArrayList<com.facetec.sdk.bi.b> c;
    private final int d;
    private int e;
    private boolean f;

    static final class e {

        /* renamed from: a, reason: collision with root package name */
        float f3422a = 0.0f;
        float b;
        float e;

        e(float f, float f2) {
            this.e = f;
            this.b = f2;
        }
    }

    final class b {

        /* renamed from: a, reason: collision with root package name */
        android.graphics.Paint f3421a;
        com.facetec.sdk.bi.e e;
        float d = 0.0f;
        private int c = -1;
        java.util.ArrayList<android.animation.Animator> b = new java.util.ArrayList<>();

        b(float f, float f2) {
            this.e = new com.facetec.sdk.bi.e(f, f2);
            com.facetec.sdk.bi.this.setLayerType(2, null);
            android.graphics.Paint paint = new android.graphics.Paint(1);
            this.f3421a = paint;
            paint.setStyle(android.graphics.Paint.Style.STROKE);
            this.f3421a.setStrokeWidth(this.d);
            this.f3421a.setColor(this.c);
        }
    }

    public bi(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3420a = 500;
        this.d = 5;
        this.c = new java.util.ArrayList<>();
        this.f = false;
        post(new java.lang.Runnable() { // from class: com.facetec.sdk.bi$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.bi.this.b();
            }
        });
    }

    @Override // android.view.View
    protected final void onDraw(android.graphics.Canvas canvas) {
        java.util.ArrayList<com.facetec.sdk.bi.b> arrayList;
        if (!this.f || (arrayList = this.c) == null || arrayList.size() <= 0) {
            return;
        }
        java.util.Iterator<com.facetec.sdk.bi.b> it = this.c.iterator();
        while (it.hasNext()) {
            com.facetec.sdk.bi.b next = it.next();
            com.facetec.sdk.bi.e eVar = next.e;
            canvas.drawCircle(eVar.e, eVar.b, eVar.f3422a, next.f3421a);
        }
        this.f = false;
    }

    private void c() {
        this.f = true;
        postInvalidate();
    }

    final void c(float f, float f2) {
        if (this.c.size() > 5) {
            return;
        }
        final com.facetec.sdk.bi.b bVar = new com.facetec.sdk.bi.b(f, f2);
        final android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(bVar.e.f3422a, this.b);
        ofFloat.setDuration(500L);
        ofFloat.setInterpolator(new android.view.animation.DecelerateInterpolator());
        ofFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.bi$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.facetec.sdk.bi.this.e(bVar, valueAnimator);
            }
        });
        ofFloat.addListener(new com.facetec.sdk.b() { // from class: com.facetec.sdk.bi$$ExternalSyntheticLambda1
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(android.animation.Animator animator) {
                com.facetec.sdk.bi.this.e(bVar, ofFloat, animator);
            }
        });
        ofFloat.start();
        bVar.b.add(ofFloat);
        this.c.add(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(com.facetec.sdk.bi.b bVar, android.animation.ValueAnimator valueAnimator) {
        bVar.e.f3422a = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        bVar.d = java.lang.Math.min(this.e, bVar.e.f3422a);
        if (bVar.f3421a != null) {
            bVar.f3421a.setStrokeWidth(bVar.d);
        }
        bVar.f3421a.setAlpha(java.lang.Math.round((1.0f - valueAnimator.getAnimatedFraction()) * 255.0f));
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(com.facetec.sdk.bi.b bVar, android.animation.ValueAnimator valueAnimator, android.animation.Animator animator) {
        bVar.f3421a.setAlpha(0);
        c();
        bVar.b.remove(valueAnimator);
        this.c.remove(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.b = java.lang.Math.round(com.facetec.sdk.ay.d(50) * com.facetec.sdk.dm.b() * com.facetec.sdk.dm.a());
        this.e = java.lang.Math.round(com.facetec.sdk.ay.d(3) * com.facetec.sdk.dm.b() * com.facetec.sdk.dm.a());
    }
}
