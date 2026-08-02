package com.facetec.sdk;

/* loaded from: classes8.dex */
class di extends android.widget.FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    int[] f3512a;
    private android.widget.ImageView b;
    int c;
    private android.widget.ImageView d;
    boolean e;
    private boolean g;
    private android.os.Handler h;
    private androidx.core.graphics.drawable.RoundedBitmapDrawable[] i;

    public di(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        int i = 0;
        this.i = new androidx.core.graphics.drawable.RoundedBitmapDrawable[0];
        this.f3512a = new int[0];
        this.c = 0;
        this.e = true;
        if (((int[]) com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), -230834020, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 230834030)).length == 0) {
            return;
        }
        this.h = new android.os.Handler(android.os.Looper.getMainLooper());
        this.d = new android.widget.ImageView(context);
        this.b = new android.widget.ImageView(context);
        this.d.setAlpha(1.0f);
        this.b.setAlpha(0.0f);
        this.d.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        this.d.setAdjustViewBounds(true);
        this.b.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        this.b.setAdjustViewBounds(true);
        this.g = true;
        addView(this.d);
        addView(this.b);
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setCornerRadius(com.facetec.sdk.ay.d((int) (com.facetec.sdk.dm.z() * com.facetec.sdk.dm.b())));
        gradientDrawable.setStroke((int) com.facetec.sdk.ay.d(java.lang.Math.max(com.facetec.sdk.dm.k() == 0 ? 0 : 1, (int) (com.facetec.sdk.dm.k() * com.facetec.sdk.dm.b()))), com.facetec.sdk.dm.r(context));
        gradientDrawable.setColor(0);
        setBackground(gradientDrawable);
        setClipToOutline(true);
        setOutlineProvider(android.view.ViewOutlineProvider.BACKGROUND);
        if (com.facetec.sdk.FaceTecSDK.f3366a.g.enableRetryScreenSlideshowShuffle) {
            int[] iArr = (int[]) com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), -230834020, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 230834030);
            java.util.Random random = new java.util.Random();
            for (int i2 = 0; i2 < iArr.length; i2++) {
                int nextInt = random.nextInt(iArr.length);
                int i3 = iArr[nextInt];
                iArr[nextInt] = iArr[i2];
                iArr[i2] = i3;
            }
            this.f3512a = iArr;
        } else {
            this.f3512a = (int[]) com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), -230834020, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 230834030);
        }
        android.content.res.Resources resources = getResources();
        this.i = new androidx.core.graphics.drawable.RoundedBitmapDrawable[this.f3512a.length];
        while (true) {
            int[] iArr2 = this.f3512a;
            if (i < iArr2.length) {
                this.i[i] = androidx.core.graphics.drawable.RoundedBitmapDrawableFactory.create(resources, android.graphics.BitmapFactory.decodeResource(resources, iArr2[i]));
                i++;
            } else {
                this.d.setImageDrawable(this.i[this.c]);
                return;
            }
        }
    }

    final void e() {
        android.os.Handler handler = this.h;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.h = null;
        }
    }

    private int d() {
        int i = this.c;
        if (i == this.i.length - 1) {
            return 0;
        }
        return i + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void i() {
        int d = d();
        this.c = d;
        androidx.core.graphics.drawable.RoundedBitmapDrawable roundedBitmapDrawable = this.i[d];
        if (this.g) {
            this.b.setImageDrawable(roundedBitmapDrawable);
        } else {
            this.d.setImageDrawable(roundedBitmapDrawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void a() {
        android.os.Handler handler;
        if (!this.e) {
            if (this.g) {
                this.b.animate().alpha(1.0f).setDuration(800L).setListener(null).start();
                this.d.animate().alpha(0.0f).setDuration(800L).setListener(null).start();
            } else {
                this.b.animate().alpha(0.0f).setDuration(800L).setListener(null).start();
                this.d.animate().alpha(1.0f).setDuration(800L).setListener(null).start();
            }
            this.g = !this.g;
            android.os.Handler handler2 = this.h;
            if (handler2 != null) {
                handler2.postDelayed(new java.lang.Runnable() { // from class: com.facetec.sdk.di$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facetec.sdk.di.this.i();
                    }
                }, 800L);
            }
        }
        int i = com.facetec.sdk.FaceTecSDK.f3366a.g.retryScreenSlideshowInterval;
        if (this.e) {
            i /= 2;
            this.e = false;
        }
        int max = java.lang.Math.max(500, i);
        if (this.f3512a.length <= 1 || (handler = this.h) == null) {
            return;
        }
        handler.postDelayed(new java.lang.Runnable() { // from class: com.facetec.sdk.di$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.di.this.a();
            }
        }, max);
    }
}
