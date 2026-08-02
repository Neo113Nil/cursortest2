package com.facetec.sdk;

/* loaded from: classes8.dex */
class dc extends android.view.View {
    private static final int t = (int) com.facetec.sdk.ay.d(10);

    /* renamed from: a, reason: collision with root package name */
    protected android.graphics.Paint f3498a;
    android.graphics.RectF b;
    private boolean c;
    protected android.graphics.Paint d;
    protected android.graphics.RectF e;
    protected final float f;
    protected android.graphics.RectF g;
    protected android.graphics.RectF h;
    android.animation.AnimatorSet i;
    protected final float j;
    private android.graphics.Paint k;
    private com.facetec.sdk.dc.d l;
    android.animation.AnimatorSet m;
    android.animation.AnimatorSet n;

    /* renamed from: o, reason: collision with root package name */
    private android.animation.AnimatorSet f3499o;
    private final android.os.Handler p;
    private boolean q;
    private android.animation.Animator s;

    public dc(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.s = null;
        this.q = false;
        this.p = new android.os.Handler();
        this.j = com.facetec.sdk.ay.d(com.facetec.sdk.dm.C()) * com.facetec.sdk.dm.b();
        this.f = com.facetec.sdk.ay.d(com.facetec.sdk.dm.A()) * com.facetec.sdk.dm.b();
        post(new java.lang.Runnable() { // from class: com.facetec.sdk.dc$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.dc.this.e();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        d(false);
        d();
        float width = this.b.width() / this.e.width();
        float height = this.b.height() / this.e.height();
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this, (android.util.Property<com.facetec.sdk.dc, java.lang.Float>) android.view.View.SCALE_X, 1.0f, width);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(this, (android.util.Property<com.facetec.sdk.dc, java.lang.Float>) android.view.View.SCALE_Y, 1.0f, height);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        this.i = animatorSet;
        animatorSet.setInterpolator(new android.view.animation.OvershootInterpolator(0.8f));
        this.i.setDuration(1600L);
        this.i.playTogether(ofFloat, ofFloat2);
        android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
        this.f3499o = animatorSet2;
        animatorSet2.setDuration(0L);
        this.f3499o.playTogether(ofFloat, ofFloat2);
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(this, (android.util.Property<com.facetec.sdk.dc, java.lang.Float>) android.view.View.SCALE_X, 1.0f, width);
        android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(this, (android.util.Property<com.facetec.sdk.dc, java.lang.Float>) android.view.View.SCALE_Y, 1.0f, height);
        android.animation.AnimatorSet animatorSet3 = new android.animation.AnimatorSet();
        this.m = animatorSet3;
        animatorSet3.setInterpolator(new android.view.animation.OvershootInterpolator(1.5f));
        this.m.setDuration(com.paypal.pds.core.ConstantsKt.MotionDuration1200);
        this.m.playTogether(ofFloat3, ofFloat4);
        android.animation.ObjectAnimator ofFloat5 = android.animation.ObjectAnimator.ofFloat(this, (android.util.Property<com.facetec.sdk.dc, java.lang.Float>) android.view.View.SCALE_X, width, 1.0f);
        android.animation.ObjectAnimator ofFloat6 = android.animation.ObjectAnimator.ofFloat(this, (android.util.Property<com.facetec.sdk.dc, java.lang.Float>) android.view.View.SCALE_Y, height, 1.0f);
        android.animation.AnimatorSet animatorSet4 = new android.animation.AnimatorSet();
        this.n = animatorSet4;
        animatorSet4.setDuration(700L);
        this.n.playTogether(ofFloat5, ofFloat6);
    }

    public final void a() {
        com.facetec.sdk.dc.d dVar = this.l;
        if (dVar != null) {
            dVar.c();
        }
    }

    public final void c() {
        b();
        invalidate();
    }

    public void setTransparentBackground() {
        if (this.k == null) {
            d();
            b();
        }
        this.k.setColor(0);
        invalidate();
    }

    public void setOvalStrokeWidth(int i) {
        if (this.f3498a == null) {
            d();
            b();
        }
        this.f3498a.setStrokeWidth(i);
        invalidate();
    }

    public final android.graphics.RectF j() {
        d(false);
        return this.e;
    }

    public final int g() {
        return (int) this.e.bottom;
    }

    final boolean h() {
        return this.c;
    }

    public void setOvalHasExpanded(boolean z) {
        this.c = z;
    }

    public final void f() {
        setOvalHasExpanded(false);
        a(this.n);
    }

    final void a(final android.animation.AnimatorSet animatorSet) {
        this.s = animatorSet;
        this.p.post(new java.lang.Runnable() { // from class: com.facetec.sdk.dc$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.dc.this.d(animatorSet);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(android.animation.AnimatorSet animatorSet) {
        if (animatorSet != null) {
            animatorSet.start();
        } else {
            com.facetec.sdk.t.c(getContext(), com.facetec.sdk.c.NON_FATAL_ERROR, "animatorSet is null unexpectedly.", (java.lang.Throwable) null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(final java.lang.Runnable runnable, boolean z) {
        float f;
        float f2;
        c();
        com.facetec.sdk.FaceTecExitAnimationStyle faceTecExitAnimationStyle = z ? com.facetec.sdk.FaceTecSDK.f3366a.s : com.facetec.sdk.FaceTecSDK.f3366a.r;
        int i = com.facetec.sdk.dc.AnonymousClass1.d[faceTecExitAnimationStyle.ordinal()];
        int i2 = com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MIN_TABLET_WIDTH_DP;
        if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    this.f3498a.setColor(com.facetec.sdk.dm.m(getContext()));
                    i2 = 1000;
                }
            }
            f = 2.1f;
            f2 = 1.8f;
            if (faceTecExitAnimationStyle == com.facetec.sdk.FaceTecExitAnimationStyle.NONE) {
                android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this, (android.util.Property<com.facetec.sdk.dc, java.lang.Float>) android.view.View.SCALE_X, getScaleX(), f2);
                android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(this, (android.util.Property<com.facetec.sdk.dc, java.lang.Float>) android.view.View.SCALE_Y, getScaleY(), f);
                android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
                animatorSet.setDuration(i2);
                animatorSet.setInterpolator(new android.view.animation.DecelerateInterpolator());
                animatorSet.playTogether(ofFloat, ofFloat2);
                animatorSet.addListener(new com.facetec.sdk.b() { // from class: com.facetec.sdk.dc$$ExternalSyntheticLambda1
                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(android.animation.Animator animator) {
                        com.facetec.sdk.dc.this.c(runnable, animator);
                    }
                });
                animatorSet.addListener(new android.animation.Animator.AnimatorListener() { // from class: com.facetec.sdk.dc.2
                    private static final byte[] $$a = null;
                    private static final int $$b = 0;
                    private static int[] d;

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0028). Please report as a decompilation issue!!! */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    private static java.lang.String $$c(byte b, short s, short s2) {
                        int i3;
                        int i4 = 3 - (s2 * 2);
                        byte[] bArr = $$a;
                        int i5 = s * 4;
                        int i6 = 73 - (b * 3);
                        byte[] bArr2 = new byte[i5 + 1];
                        if (bArr == null) {
                            int i7 = i5;
                            int i8 = 0;
                            i6 += -i7;
                            i3 = i8;
                            bArr2[i3] = (byte) i6;
                            i8 = i3 + 1;
                            if (i3 == i5) {
                                return new java.lang.String(bArr2, 0);
                            }
                            i4++;
                            i7 = bArr[i4];
                            i6 += -i7;
                            i3 = i8;
                            bArr2[i3] = (byte) i6;
                            i8 = i3 + 1;
                            if (i3 == i5) {
                            }
                        } else {
                            i3 = 0;
                            bArr2[i3] = (byte) i6;
                            i8 = i3 + 1;
                            if (i3 == i5) {
                            }
                        }
                    }

                    static void init$0() {
                        $$a = new byte[]{102, com.google.common.base.Ascii.EM, -112, 77};
                        $$b = 141;
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationCancel(android.animation.Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationRepeat(android.animation.Animator animator) {
                    }

                    private static void b(int[] iArr, int i3, java.lang.Object[] objArr) {
                        int i4;
                        com.facetec.sdk.hl hlVar = new com.facetec.sdk.hl();
                        char[] cArr = new char[4];
                        char[] cArr2 = new char[iArr.length * 2];
                        int[] iArr2 = d;
                        int i5 = 16;
                        int i6 = -915298838;
                        int i7 = 0;
                        if (iArr2 != null) {
                            int length = iArr2.length;
                            int[] iArr3 = new int[length];
                            int i8 = 0;
                            while (i8 < length) {
                                try {
                                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(iArr2[i8])};
                                    java.lang.Object d2 = com.facetec.sdk.al.d(-915298838);
                                    if (d2 == null) {
                                        d2 = com.facetec.sdk.al.c((char) ((android.view.ViewConfiguration.getJumpTapTimeout() >> i5) + 28976), android.graphics.Color.red(0) + 1693, 24 - android.view.View.resolveSizeAndState(0, 0, 0), 1855905554, false, "H", new java.lang.Class[]{java.lang.Integer.TYPE});
                                    }
                                    iArr3[i8] = ((java.lang.Integer) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).intValue();
                                    i8++;
                                    i5 = 16;
                                } catch (java.lang.Throwable th) {
                                    java.lang.Throwable cause = th.getCause();
                                    if (cause == null) {
                                        throw th;
                                    }
                                    throw cause;
                                }
                            }
                            iArr2 = iArr3;
                        }
                        int length2 = iArr2.length;
                        int[] iArr4 = new int[length2];
                        int[] iArr5 = d;
                        float f3 = 0.0f;
                        if (iArr5 != null) {
                            int length3 = iArr5.length;
                            int[] iArr6 = new int[length3];
                            int i9 = 0;
                            while (i9 < length3) {
                                java.lang.Object[] objArr3 = new java.lang.Object[1];
                                objArr3[i7] = java.lang.Integer.valueOf(iArr5[i9]);
                                java.lang.Object d3 = com.facetec.sdk.al.d(i6);
                                if (d3 == null) {
                                    d3 = com.facetec.sdk.al.c((char) (28976 - (android.media.AudioTrack.getMinVolume() > f3 ? 1 : (android.media.AudioTrack.getMinVolume() == f3 ? 0 : -1))), 1692 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 24, 1855905554, false, "H", new java.lang.Class[]{java.lang.Integer.TYPE});
                                }
                                iArr6[i9] = ((java.lang.Integer) ((java.lang.reflect.Method) d3).invoke(null, objArr3)).intValue();
                                i9++;
                                i6 = -915298838;
                                i7 = 0;
                                f3 = 0.0f;
                            }
                            i4 = i7;
                            iArr5 = iArr6;
                        } else {
                            i4 = 0;
                        }
                        java.lang.System.arraycopy(iArr5, i4, iArr4, i4, length2);
                        hlVar.d = i4;
                        while (hlVar.d < iArr.length) {
                            int i10 = 16;
                            cArr[i4] = (char) (iArr[hlVar.d] >> 16);
                            cArr[1] = (char) iArr[hlVar.d];
                            cArr[2] = (char) (iArr[hlVar.d + 1] >> 16);
                            int i11 = 3;
                            cArr[3] = (char) iArr[hlVar.d + 1];
                            hlVar.c = (cArr[0] << 16) + cArr[1];
                            hlVar.e = (cArr[2] << 16) + cArr[3];
                            com.facetec.sdk.hl.d(iArr4);
                            int i12 = 0;
                            while (i12 < i10) {
                                hlVar.c ^= iArr4[i12];
                                int c = com.facetec.sdk.hl.c(hlVar.c);
                                java.lang.Object[] objArr4 = new java.lang.Object[4];
                                objArr4[i11] = hlVar;
                                objArr4[2] = hlVar;
                                objArr4[1] = java.lang.Integer.valueOf(c);
                                objArr4[0] = hlVar;
                                java.lang.Object d4 = com.facetec.sdk.al.d(-1807501612);
                                if (d4 == null) {
                                    char c2 = (char) (1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                                    long packedPositionForGroup = android.widget.ExpandableListView.getPackedPositionForGroup(0);
                                    int trimmedLength = android.text.TextUtils.getTrimmedLength("");
                                    byte b = (byte) ($$b & i11);
                                    byte b2 = (byte) (b - 1);
                                    d4 = com.facetec.sdk.al.c(c2, (packedPositionForGroup > 0L ? 1 : (packedPositionForGroup == 0L ? 0 : -1)) + 407, 24 - trimmedLength, 866962476, false, $$c(b, b2, b2), new java.lang.Class[]{java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class});
                                }
                                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) d4).invoke(null, objArr4)).intValue();
                                hlVar.c = hlVar.e;
                                hlVar.e = intValue;
                                i12++;
                                i10 = 16;
                                i11 = 3;
                            }
                            int i13 = hlVar.c;
                            hlVar.c = hlVar.e;
                            hlVar.e = i13;
                            hlVar.e ^= iArr4[16];
                            hlVar.c ^= iArr4[17];
                            int i14 = hlVar.c;
                            int i15 = hlVar.e;
                            cArr[0] = (char) (hlVar.c >>> 16);
                            cArr[1] = (char) hlVar.c;
                            cArr[2] = (char) (hlVar.e >>> 16);
                            cArr[3] = (char) hlVar.e;
                            com.facetec.sdk.hl.d(iArr4);
                            cArr2[hlVar.d * 2] = cArr[0];
                            cArr2[(hlVar.d * 2) + 1] = cArr[1];
                            cArr2[(hlVar.d * 2) + 2] = cArr[2];
                            cArr2[(hlVar.d * 2) + 3] = cArr[3];
                            java.lang.Object[] objArr5 = {hlVar, hlVar};
                            java.lang.Object d5 = com.facetec.sdk.al.d(-260749244);
                            if (d5 == null) {
                                byte b3 = (byte) 0;
                                d5 = com.facetec.sdk.al.c((char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 18696), android.graphics.Color.rgb(0, 0, 0) + 16779003, 24 - android.text.TextUtils.getCapsMode("", 0, 0), 1469723324, false, $$c(b3, b3, b3), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                            }
                            ((java.lang.reflect.Method) d5).invoke(null, objArr5);
                            i4 = 0;
                        }
                        objArr[0] = new java.lang.String(cArr2, 0, i3);
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(android.animation.Animator animator) {
                        try {
                            java.lang.Object[] objArr = new java.lang.Object[1];
                            b(new int[]{1691935678, -1079155475, 618003789, 1208238636, -1134543486, 2005871626, 1414553313, -963019655}, (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 16, objArr);
                            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr[0]);
                            b(new int[]{-1710113176, -1496969575, 53736788, -1541893482, -2096358375, -410514560, -1887439610, 710048152, -1531870476, -2075820928}, (-16777199) - android.graphics.Color.rgb(0, 0, 0), new java.lang.Object[1]);
                            com.facetec.sdk.cq.K("brsts", ((java.lang.Long) cls.getMethod((java.lang.String) r1[0], null).invoke(null, null)).longValue());
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(android.animation.Animator animator) {
                        try {
                            java.lang.Object[] objArr = new java.lang.Object[1];
                            b(new int[]{1691935678, -1079155475, 618003789, 1208238636, -1134543486, 2005871626, 1414553313, -963019655}, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 16, objArr);
                            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr[0]);
                            b(new int[]{-1710113176, -1496969575, 53736788, -1541893482, -2096358375, -410514560, -1887439610, 710048152, -1531870476, -2075820928}, 17 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), new java.lang.Object[1]);
                            com.facetec.sdk.cq.K("brets", ((java.lang.Long) cls.getMethod((java.lang.String) r1[0], null).invoke(null, null)).longValue());
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }

                    static {
                        init$0();
                        d = new int[]{-1798185642, 504584127, 1264994679, 2079417522, 827347808, 1430701762, 485655922, -65022309, 1421657012, -2129469917, -1706508900, -1640911996, -831048902, 111586445, -913460198, -536086576, -971773126, 1453025018};
                    }
                });
                a(animatorSet);
                return;
            }
            return;
        }
        f = 1.0f;
        f2 = 1.0f;
        if (faceTecExitAnimationStyle == com.facetec.sdk.FaceTecExitAnimationStyle.NONE) {
        }
    }

    /* renamed from: com.facetec.sdk.dc$1, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[com.facetec.sdk.FaceTecExitAnimationStyle.values().length];
            d = iArr;
            try {
                iArr[com.facetec.sdk.FaceTecExitAnimationStyle.NONE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                d[com.facetec.sdk.FaceTecExitAnimationStyle.RIPPLE_IN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                d[com.facetec.sdk.FaceTecExitAnimationStyle.RIPPLE_OUT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                d[com.facetec.sdk.FaceTecExitAnimationStyle.CIRCLE_FADE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(java.lang.Runnable runnable, android.animation.Animator animator) {
        setVisibility(4);
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (this.e != null) {
            canvas.drawRect(-400.0f, -400.0f, getWidth() + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MIN_TABLET_WIDTH_DP, getHeight() + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MIN_TABLET_WIDTH_DP, this.k);
            canvas.drawOval(this.e, this.d);
            canvas.drawOval(this.h, this.f3498a);
        }
        com.facetec.sdk.dc.d dVar = this.l;
        if (dVar == null || dVar.c == null) {
            return;
        }
        float f = -(dVar.e - dVar.g);
        canvas.drawArc(dVar.f3501a, dVar.e, f, false, dVar.d);
        canvas.drawArc(dVar.f3501a, (dVar.e + 180.0f) % 360.0f, f, false, dVar.b);
    }

    private void d() {
        setLayerType(1, null);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.d = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.d.setAlpha(0);
        this.d.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
        setLayerType(2, null);
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        this.f3498a = paint2;
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        this.f3498a.setStrokeWidth(this.j);
        java.lang.String[] strArr = {"Nokia 2.2", "Nokia_2_2", "G5", "G5_Plus", "LM-X320", "LM-X420", "LM-X520", "LM-X525", "JAT-L29", "Infinix X650B", "moto e(6) plus", "Multilaser_G_Max"};
        for (int i = 0; i < 12; i++) {
            if (android.os.Build.MODEL.equals(strArr[i])) {
                this.f3498a.setAntiAlias(false);
            }
        }
        android.graphics.Paint paint3 = new android.graphics.Paint(1);
        this.k = paint3;
        paint3.setStyle(android.graphics.Paint.Style.FILL);
        b();
    }

    final void d(boolean z) {
        synchronized (this) {
            if (!this.q || z) {
                this.q = true;
                int width = getWidth();
                int height = com.facetec.sdk.dm.b() < 1.0f ? com.facetec.sdk.dp.d().heightPixels : getHeight();
                float f = width;
                float f2 = 0.65f * f;
                float f3 = (f - f2) / 2.0f;
                float height2 = (getHeight() - (f2 * 1.48f)) / 2.0f;
                android.graphics.RectF rectF = new android.graphics.RectF();
                this.e = rectF;
                rectF.set(f3, height2, f - f3, getHeight() - height2);
                android.graphics.RectF rectF2 = new android.graphics.RectF();
                this.h = rectF2;
                rectF2.set(this.e.left + (this.j / 2.0f), this.e.top + (this.j / 2.0f), this.e.right - (this.j / 2.0f), this.e.bottom - (this.j / 2.0f));
                android.graphics.RectF rectF3 = new android.graphics.RectF();
                this.g = rectF3;
                rectF3.set(this.e.left + this.j, this.e.top + this.j, this.e.right - this.j, this.e.bottom - this.j);
                float f4 = 0.98f * f;
                float f5 = (f - f4) / 2.0f;
                float f6 = f4 * 1.7f;
                float f7 = height - (t << 1);
                if (f7 <= f6) {
                    f6 = f7;
                }
                float height3 = (getHeight() - f6) / 2.0f;
                android.graphics.RectF rectF4 = new android.graphics.RectF();
                this.b = rectF4;
                rectF4.set(f5, height3, f - f5, getHeight() - height3);
                this.l = new com.facetec.sdk.dc.d(getContext());
            }
        }
    }

    private void b() {
        if (this.k != null) {
            android.content.Context context = getContext();
            this.f3498a.setColor(com.facetec.sdk.dm.n(context));
            this.k.setColor(com.facetec.sdk.dm.m(context));
        }
    }

    final class d {
        final android.graphics.Paint b;
        final android.graphics.Paint d;
        private final int h;
        private final int i;
        private final android.animation.TimeInterpolator j;
        android.animation.AnimatorSet c = null;

        /* renamed from: a, reason: collision with root package name */
        android.graphics.RectF f3501a = null;
        float e = 0.0f;
        float g = 0.0f;
        private final android.animation.ValueAnimator.AnimatorUpdateListener f = new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.dc$d$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.facetec.sdk.dc.d.this.a(valueAnimator);
            }
        };

        d(android.content.Context context) {
            int e = com.facetec.sdk.dp.e(context, com.facetec.sdk.FaceTecSDK.f3366a.k.progressColor1);
            int e2 = com.facetec.sdk.dp.e(context, com.facetec.sdk.FaceTecSDK.f3366a.k.progressColor2);
            this.b = b(e);
            this.d = b(e2);
            this.h = com.facetec.sdk.dm.d(context, com.facetec.sdk.FaceTecSDK.f3366a.k.progressColor1);
            this.i = com.facetec.sdk.dm.d(context, com.facetec.sdk.FaceTecSDK.f3366a.k.progressColor2);
            this.j = new android.view.animation.AccelerateDecelerateInterpolator();
        }

        public final void setStartStrokePosition(float f) {
            this.e = f;
        }

        public final void setEndStrokePosition(float f) {
            this.g = f;
        }

        private android.animation.ObjectAnimator c(android.graphics.Paint paint, int i) {
            paint.setAlpha(java.lang.Math.max(0, i - 50));
            double d = i;
            android.animation.ObjectAnimator ofInt = android.animation.ObjectAnimator.ofInt(paint, "alpha", (int) (0.8d * d), (int) (d * 0.24d));
            ofInt.setDuration(500L);
            ofInt.setInterpolator(new android.view.animation.DecelerateInterpolator());
            ofInt.setStartDelay(com.facetec.sdk.dc.this.h() ? 600L : 400L);
            return ofInt;
        }

        private android.graphics.Paint b(int i) {
            android.graphics.Paint paint = new android.graphics.Paint(1);
            paint.setStyle(android.graphics.Paint.Style.STROKE);
            paint.setStrokeWidth(com.facetec.sdk.dc.this.f);
            paint.setStrokeJoin(android.graphics.Paint.Join.ROUND);
            paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
            paint.setColor(i);
            return paint;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(android.animation.ValueAnimator valueAnimator) {
            com.facetec.sdk.dc.this.invalidate();
        }

        final void c() {
            android.animation.AnimatorSet animatorSet = this.c;
            if (animatorSet == null || !animatorSet.isStarted()) {
                if (this.f3501a == null) {
                    float d = com.facetec.sdk.FaceTecSDK.f3366a.k.progressRadialOffset == 0 ? com.facetec.sdk.dc.this.f + com.facetec.sdk.dc.this.j : com.facetec.sdk.ay.d((int) (com.facetec.sdk.FaceTecSDK.f3366a.k.progressRadialOffset * com.facetec.sdk.dm.b()));
                    this.f3501a = new android.graphics.RectF(com.facetec.sdk.dc.this.h.left + d, com.facetec.sdk.dc.this.h.top + d, com.facetec.sdk.dc.this.h.right - d, com.facetec.sdk.dc.this.h.bottom - d);
                }
                android.animation.ObjectAnimator c = c(this.b, this.h);
                android.animation.ObjectAnimator c2 = c(this.d, this.i);
                android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this, "startStrokePosition", 0.0f, 360.0f);
                boolean h = com.facetec.sdk.dc.this.h();
                ofFloat.addUpdateListener(this.f);
                ofFloat.setInterpolator(this.j);
                ofFloat.setDuration(h ? 1000L : 800L);
                this.g = 0.0f;
                android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(this, "endStrokePosition", 0.0f, 360.0f);
                ofFloat2.setDuration(h ? 1000L : 800L);
                ofFloat2.addUpdateListener(this.f);
                ofFloat2.setInterpolator(this.j);
                ofFloat2.setStartDelay(h ? 200L : 100L);
                android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
                this.c = animatorSet2;
                animatorSet2.playTogether(ofFloat, ofFloat2, c, c2);
                this.c.start();
            }
        }
    }
}
