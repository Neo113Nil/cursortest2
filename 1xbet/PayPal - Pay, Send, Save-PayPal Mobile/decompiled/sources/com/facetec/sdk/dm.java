package com.facetec.sdk;

/* loaded from: classes8.dex */
final class dm {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;

    /* renamed from: a, reason: collision with root package name */
    private static final com.facetec.sdk.f<java.lang.Float> f3514a;
    private static char b;
    private static char c;
    private static final com.facetec.sdk.f<java.lang.Float> d;
    private static final com.facetec.sdk.f<java.lang.Float> e;
    private static int f;
    private static int g;
    private static int h;
    private static char i;
    private static char j;
    private static int k;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Type inference failed for: r8v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$c(short s, short s2, byte b2) {
        int i2;
        int i3;
        byte[] bArr = $$a;
        ?? r8 = 112 - (b2 * 3);
        int i4 = 4 - (s * 2);
        int i5 = s2 * 3;
        byte[] bArr2 = new byte[1 - i5];
        if (bArr == null) {
            byte b3 = r8;
            i2 = 0;
            int i6 = i4;
            int i7 = i6 + 1;
            i3 = i4 + b3;
            i4 = i7;
            bArr2[i2] = (byte) i3;
            if (i2 == 0 - i5) {
                return new java.lang.String(bArr2, 0);
            }
            b3 = bArr[i4];
            i2++;
            int i8 = i3;
            i6 = i4;
            i4 = i8;
            int i72 = i6 + 1;
            i3 = i4 + b3;
            i4 = i72;
            bArr2[i2] = (byte) i3;
            if (i2 == 0 - i5) {
            }
        } else {
            i2 = 0;
            i3 = r8;
            bArr2[i2] = (byte) i3;
            if (i2 == 0 - i5) {
            }
        }
    }

    static void init$0() {
        $$a = new byte[]{104, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -78, -77};
        $$b = 11;
    }

    dm() {
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        g = 0;
        k = 1;
        h = 0;
        f = 1;
        bs();
        d = new com.facetec.sdk.f<>();
        e = new com.facetec.sdk.f<>();
        f3514a = new com.facetec.sdk.f<>();
        g = (k + 65) % 128;
    }

    private static com.facetec.sdk.FaceTecCustomization bq() {
        h = (f + 121) % 128;
        if (com.facetec.sdk.FaceTecSDK.e()) {
            com.facetec.sdk.FaceTecCustomization faceTecCustomization = com.facetec.sdk.FaceTecSDK.d;
            int i2 = h + 57;
            f = i2 % 128;
            if (i2 % 2 != 0) {
                return faceTecCustomization;
            }
            throw null;
        }
        if (com.facetec.sdk.FaceTecSDK.a()) {
            return com.facetec.sdk.FaceTecSDK.c;
        }
        return com.facetec.sdk.FaceTecSDK.f3366a;
    }

    static void e() {
        h = (f + 73) % 128;
        com.facetec.sdk.FaceTecCustomization faceTecCustomization = com.facetec.sdk.FaceTecSDK.f3366a;
        if (faceTecCustomization.k.progressRadialOffset == -1) {
            f = (h + 91) % 128;
            faceTecCustomization.k.progressRadialOffset = bv();
        }
        com.facetec.sdk.FaceTecSDK.f3366a = faceTecCustomization;
    }

    static float c() {
        float floatValue;
        synchronized (com.facetec.sdk.dm.class) {
            h = (f + 51) % 128;
            floatValue = e.d(new com.facetec.sdk.f.d() { // from class: com.facetec.sdk.dm$$ExternalSyntheticLambda1
                @Override // com.facetec.sdk.f.d
                public final java.lang.Object create() {
                    float br;
                    br = com.facetec.sdk.dm.br();
                    return java.lang.Float.valueOf(br);
                }
            }).floatValue();
            h = (f + 83) % 128;
        }
        return floatValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float br() {
        int i2 = h + 75;
        f = i2 % 128;
        if (i2 % 2 != 0) {
            if (com.facetec.sdk.ai.h() != null) {
                return r0.b / r0.c;
            }
            h = (f + 57) % 128;
            return 1.7777778f;
        }
        com.facetec.sdk.ai.h();
        throw null;
    }

    static float a() {
        float floatValue;
        synchronized (com.facetec.sdk.dm.class) {
            int i2 = h + 97;
            f = i2 % 128;
            if (i2 % 2 == 0) {
                f3514a.d(new com.facetec.sdk.f.d() { // from class: com.facetec.sdk.dm$$ExternalSyntheticLambda2
                    @Override // com.facetec.sdk.f.d
                    public final java.lang.Object create() {
                        float bu;
                        bu = com.facetec.sdk.dm.bu();
                        return java.lang.Float.valueOf(bu);
                    }
                }).floatValue();
                java.lang.Object obj = null;
                obj.hashCode();
                throw null;
            }
            floatValue = f3514a.d(new com.facetec.sdk.f.d() { // from class: com.facetec.sdk.dm$$ExternalSyntheticLambda2
                @Override // com.facetec.sdk.f.d
                public final java.lang.Object create() {
                    float bu;
                    bu = com.facetec.sdk.dm.bu();
                    return java.lang.Float.valueOf(bu);
                }
            }).floatValue();
        }
        return floatValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float bu() {
        h = (f + 97) % 128;
        float c2 = c() / 1.7777778f;
        float d2 = com.facetec.sdk.dp.b().width / com.facetec.sdk.ay.d(340);
        h = (f + 89) % 128;
        return d2 * c2;
    }

    static float b() {
        float floatValue;
        synchronized (com.facetec.sdk.dm.class) {
            h = (f + 77) % 128;
            floatValue = d.d(new com.facetec.sdk.f.d() { // from class: com.facetec.sdk.dm$$ExternalSyntheticLambda0
                @Override // com.facetec.sdk.f.d
                public final java.lang.Object create() {
                    float bx;
                    bx = com.facetec.sdk.dm.bx();
                    return java.lang.Float.valueOf(bx);
                }
            }).floatValue();
            int i2 = f + 105;
            h = i2 % 128;
            if (i2 % 2 != 0) {
                java.lang.Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        return floatValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float bx() {
        float f2;
        int i2;
        android.util.DisplayMetrics d2 = com.facetec.sdk.dp.d();
        float f3 = com.facetec.sdk.dp.b().width;
        float f4 = com.facetec.sdk.dp.b().height;
        int i3 = 0;
        if (c() < 1.4d) {
            int i4 = f + 31;
            h = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 78 / 0;
            }
            f2 = 0.94f;
        } else {
            f2 = 0.88f;
        }
        float f5 = f3 * f2;
        float f6 = d2.density * 340.0f;
        if (f5 > f6) {
            f = (h + 115) % 128;
            f2 = f6 / f3;
            f5 = f6;
        }
        android.content.res.Resources e2 = com.facetec.sdk.dp.e();
        java.lang.Object[] objArr = new java.lang.Object[1];
        ce("ᾖ鸶繛뷶榡ꇠꢦ㽡", 8 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr);
        int identifier = e2.getIdentifier("status_bar_height", "dimen", ((java.lang.String) objArr[0]).intern());
        if (identifier > 0) {
            h = (f + 101) % 128;
            i2 = android.content.res.Resources.getSystem().getDimensionPixelSize(identifier);
            f = (h + 59) % 128;
        } else {
            i2 = 0;
        }
        android.content.res.Resources e3 = com.facetec.sdk.dp.e();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        ce("ᾖ鸶繛뷶榡ꇠꢦ㽡", android.view.View.MeasureSpec.getSize(0) + 7, objArr2);
        int identifier2 = e3.getIdentifier("navigation_bar_height", "dimen", ((java.lang.String) objArr2[0]).intern());
        if (identifier2 > 0) {
            h = (f + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            i3 = com.facetec.sdk.dp.e().getDimensionPixelSize(identifier2);
        }
        float c2 = c();
        float f7 = (((f4 - ((d2.density * 10.0f) * 3.0f)) - 10.0f) - i3) - i2;
        return c2 * f5 > f7 ? f7 / (c() * f3) : f2;
    }

    private static void ce(java.lang.String str, int i2, java.lang.Object[] objArr) {
        char[] cArr;
        int i3;
        int i4;
        int i5 = $11 + 81;
        int i6 = i5 % 128;
        $10 = i6;
        int i7 = 2;
        if (i5 % 2 != 0) {
            java.lang.Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (str != null) {
            $11 = (i6 + 101) % 128;
            cArr = str.toCharArray();
            $10 = ($11 + 21) % 128;
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.facetec.sdk.ho hoVar = new com.facetec.sdk.ho();
        char[] cArr3 = new char[cArr2.length];
        hoVar.b = 0;
        char[] cArr4 = new char[2];
        while (hoVar.b < cArr2.length) {
            int i8 = $10 + 113;
            $11 = i8 % 128;
            int i9 = 58224;
            if (i8 % i7 == 0) {
                cArr4[1] = cArr2[hoVar.b];
                cArr4[1] = cArr2[hoVar.b];
                i3 = 1;
            } else {
                cArr4[0] = cArr2[hoVar.b];
                cArr4[1] = cArr2[hoVar.b + 1];
                i3 = 0;
            }
            while (i3 < 16) {
                $11 = ($10 + 15) % 128;
                char c2 = cArr4[1];
                char c3 = cArr4[0];
                char c4 = (char) (j ^ 2174069992062419062L);
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[4];
                    objArr2[3] = java.lang.Integer.valueOf(i);
                    objArr2[i7] = java.lang.Integer.valueOf(c3 >>> 5);
                    objArr2[1] = java.lang.Integer.valueOf(((c3 << 4) + c4) ^ (c3 + i9));
                    objArr2[0] = java.lang.Integer.valueOf(c2);
                    java.lang.Object d2 = com.facetec.sdk.al.d(1497828241);
                    if (d2 == null) {
                        char rgb = (char) (android.graphics.Color.rgb(0, 0, 0) + 16777216);
                        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                        int packedPositionGroup = android.widget.ExpandableListView.getPackedPositionGroup(0L);
                        java.lang.Class[] clsArr = new java.lang.Class[4];
                        clsArr[0] = java.lang.Integer.TYPE;
                        clsArr[1] = java.lang.Integer.TYPE;
                        clsArr[i7] = java.lang.Integer.TYPE;
                        clsArr[3] = java.lang.Integer.TYPE;
                        d2 = com.facetec.sdk.al.c(rgb, (elapsedRealtime > 0L ? 1 : (elapsedRealtime == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, packedPositionGroup + 23, -22515351, false, lib.android.paypal.com.magnessdk.g.n2, clsArr);
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).charValue();
                    cArr4[1] = charValue;
                    java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(cArr4[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (b ^ 2174069992062419062L))) ^ r13), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(c)};
                    int i10 = charValue + i9;
                    java.lang.Object d3 = com.facetec.sdk.al.d(1497828241);
                    if (d3 == null) {
                        d3 = com.facetec.sdk.al.c((char) ((-1) - android.os.Process.getGidForName("")), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 211, 24 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -22515351, false, lib.android.paypal.com.magnessdk.g.n2, new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                    }
                    cArr4[0] = ((java.lang.Character) ((java.lang.reflect.Method) d3).invoke(null, objArr3)).charValue();
                    i9 -= 40503;
                    i3++;
                    i7 = 2;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3[hoVar.b] = cArr4[0];
            cArr3[hoVar.b + 1] = cArr4[1];
            java.lang.Object[] objArr4 = {hoVar, hoVar};
            java.lang.Object d4 = com.facetec.sdk.al.d(-2113314280);
            if (d4 == null) {
                char red = (char) (android.graphics.Color.red(0) + 31541);
                int resolveSize = android.view.View.resolveSize(0, 0);
                int indexOf = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                byte b2 = (byte) 0;
                byte b3 = b2;
                java.lang.String $$c = $$c(b2, b3, b3);
                i4 = 2;
                d4 = com.facetec.sdk.al.c(red, resolveSize + 1913, 22 - indexOf, 635836640, false, $$c, new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
            } else {
                i4 = 2;
            }
            ((java.lang.reflect.Method) d4).invoke(null, objArr4);
            i7 = i4;
        }
        objArr[0] = new java.lang.String(cArr3, 0, i2);
    }

    static int d() {
        float a2;
        int i2;
        int i3 = f + 107;
        h = i3 % 128;
        if (i3 % 2 != 0) {
            a2 = a() + b();
            i2 = 31;
        } else {
            a2 = a() * b();
            i2 = 15;
        }
        return java.lang.Math.round(com.facetec.sdk.ay.d(i2) * a2);
    }

    static int j() {
        int i2 = f;
        h = (i2 + 45) % 128;
        h = (i2 + 51) % 128;
        return 10;
    }

    private static int bv() {
        int C;
        int i2 = h + 5;
        f = i2 % 128;
        if (i2 % 2 != 0) {
            C = C() + A();
        } else {
            C = C() % A();
        }
        int i3 = h + 37;
        f = i3 % 128;
        if (i3 % 2 != 0) {
            return C;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object m(java.lang.Object[] objArr) {
        int i2 = f;
        h = (i2 + 101) % 128;
        int i3 = i2 + 13;
        h = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 20 / 0;
        }
        return -1;
    }

    static com.facetec.sdk.FaceTecSize g() {
        com.facetec.sdk.FaceTecSize faceTecSize = new com.facetec.sdk.FaceTecSize(java.lang.Math.round(com.facetec.sdk.ay.b(com.facetec.sdk.dp.b().width) - (a() * 20.0f)), java.lang.Math.round(a() * 60.0f));
        int i2 = f + 119;
        h = i2 % 128;
        if (i2 % 2 == 0) {
            return faceTecSize;
        }
        throw null;
    }

    static int m() {
        h = (f + 35) % 128;
        return (int) (java.lang.Math.min(java.lang.Math.max(com.facetec.sdk.FaceTecSDK.f3366a.i.additionalReviewScreenAnimationDisplayTime, 1.5d), 3.0d) * 1000.0d);
    }

    static int n() {
        f = (h + 65) % 128;
        int min = (int) (java.lang.Math.min(java.lang.Math.max(com.facetec.sdk.FaceTecSDK.f3366a.i.idFeedbackScreenAnimationDisplayTime, 1.5d), 3.0d) * 1000.0d);
        f = (h + 35) % 128;
        return min;
    }

    static int o() {
        h = (f + 119) % 128;
        int c2 = c(com.facetec.sdk.FaceTecSDK.f3366a.n.borderWidth, 2);
        int i2 = f + 55;
        h = i2 % 128;
        if (i2 % 2 == 0) {
            return c2;
        }
        throw null;
    }

    static int k() {
        f = (h + 111) % 128;
        int c2 = c(com.facetec.sdk.FaceTecSDK.f3366a.g.retryScreenImageBorderWidth, 1);
        f = (h + 29) % 128;
        return c2;
    }

    static int s() {
        int i2;
        int i3;
        int i4 = h + 85;
        f = i4 % 128;
        if (i4 % 2 == 0) {
            i2 = com.facetec.sdk.FaceTecSDK.f3366a.f.inputFieldBorderWidth;
            i3 = 0;
        } else {
            i2 = com.facetec.sdk.FaceTecSDK.f3366a.f.inputFieldBorderWidth;
            i3 = 1;
        }
        int c2 = c(i2, i3);
        h = (f + 81) % 128;
        return c2;
    }

    static int w() {
        h = (f + 11) % 128;
        int c2 = c(com.facetec.sdk.FaceTecSDK.f3366a.i.captureScreenTextBackgroundBorderWidth, 0);
        int i2 = h + 101;
        f = i2 % 128;
        if (i2 % 2 != 0) {
            return c2;
        }
        throw null;
    }

    static int u() {
        int i2 = f + 97;
        h = i2 % 128;
        return c(com.facetec.sdk.FaceTecSDK.f3366a.i.reviewScreenTextBackgroundBorderWidth, i2 % 2 != 0 ? 1 : 0);
    }

    static int x() {
        h = (f + 91) % 128;
        int c2 = c(com.facetec.sdk.FaceTecSDK.f3366a.i.captureFrameStrokeWidth, 2);
        f = (h + 23) % 128;
        return c2;
    }

    static int y() {
        h = (f + 113) % 128;
        int c2 = c(com.facetec.sdk.FaceTecSDK.f3366a.f.scrollIndicatorBorderWidth, 0);
        int i2 = h + 47;
        f = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 68 / 0;
        }
        return c2;
    }

    static int v() {
        int i2 = h + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        f = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = com.facetec.sdk.FaceTecSDK.f3366a.f.scrollIndicatorCornerRadius == -1 ? -1 : com.facetec.sdk.FaceTecSDK.f3366a.f.scrollIndicatorCornerRadius;
            if (i3 == -1) {
                return i3;
            }
            int round = java.lang.Math.round(i3 * a());
            h = (f + 99) % 128;
            return round;
        }
        int i4 = com.facetec.sdk.FaceTecSDK.f3366a.f.scrollIndicatorCornerRadius;
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    static int C() {
        int i2;
        int i3;
        int i4 = h + 41;
        f = i4 % 128;
        if (i4 % 2 == 0) {
            i2 = com.facetec.sdk.FaceTecSDK.f3366a.k.strokeWidth;
            i3 = 7;
        } else {
            i2 = com.facetec.sdk.FaceTecSDK.f3366a.k.strokeWidth;
            i3 = 6;
        }
        int c2 = c(i2, i3);
        int i5 = f + 1;
        h = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 9 / 0;
        }
        return c2;
    }

    static int A() {
        int i2 = h + 47;
        f = i2 % 128;
        return c(com.facetec.sdk.FaceTecSDK.f3366a.k.progressStrokeWidth, i2 % 2 == 0 ? 11 : 6);
    }

    static int B() {
        int i2 = h + 15;
        f = i2 % 128;
        return c(com.facetec.sdk.FaceTecSDK.f3366a.n.cornerRadius, i2 % 2 == 0 ? 93 : 20);
    }

    private static int bz() {
        int i2;
        int i3 = f + 71;
        h = i3 % 128;
        int i4 = 2;
        if (i3 % 2 != 0) {
            i2 = com.facetec.sdk.FaceTecSDK.f3366a.l.cornerRadius;
        } else {
            i2 = com.facetec.sdk.FaceTecSDK.f3366a.l.cornerRadius;
            i4 = 3;
        }
        return c(i2, i4);
    }

    static int D() {
        int i2;
        int i3;
        int i4 = h + 89;
        f = i4 % 128;
        if (i4 % 2 == 0) {
            i2 = com.facetec.sdk.FaceTecSDK.f3366a.g.readyScreenTextBackgroundCornerRadius;
            i3 = 16;
        } else {
            i2 = com.facetec.sdk.FaceTecSDK.f3366a.g.readyScreenTextBackgroundCornerRadius;
            i3 = 6;
        }
        int c2 = c(i2, i3);
        h = (f + 29) % 128;
        return c2;
    }

    static int z() {
        int i2 = h + 1;
        f = i2 % 128;
        return c(com.facetec.sdk.FaceTecSDK.f3366a.g.retryScreenImageCornerRadius, i2 % 2 == 0 ? 36 : 10);
    }

    static int H() {
        int i2;
        int i3;
        int i4 = h + 117;
        f = i4 % 128;
        if (i4 % 2 == 0) {
            i2 = com.facetec.sdk.FaceTecSDK.f3366a.i.captureScreenTextBackgroundCornerRadius;
            i3 = 92;
        } else {
            i2 = com.facetec.sdk.FaceTecSDK.f3366a.i.captureScreenTextBackgroundCornerRadius;
            i3 = 6;
        }
        int c2 = c(i2, i3);
        int i5 = h + 3;
        f = i5 % 128;
        if (i5 % 2 != 0) {
            return c2;
        }
        throw null;
    }

    static int F() {
        int i2;
        int i3;
        int i4 = f + 95;
        h = i4 % 128;
        if (i4 % 2 != 0) {
            i2 = com.facetec.sdk.FaceTecSDK.f3366a.i.reviewScreenTextBackgroundCornerRadius;
            i3 = 70;
        } else {
            i2 = com.facetec.sdk.FaceTecSDK.f3366a.i.reviewScreenTextBackgroundCornerRadius;
            i3 = 6;
        }
        int c2 = c(i2, i3);
        f = (h + 13) % 128;
        return c2;
    }

    static int G() {
        h = (f + 69) % 128;
        int c2 = c(com.facetec.sdk.FaceTecSDK.f3366a.g.buttonCornerRadius, 8);
        f = (h + 29) % 128;
        return c2;
    }

    static int E() {
        int i2 = h + 37;
        f = i2 % 128;
        return c(com.facetec.sdk.FaceTecSDK.f3366a.i.buttonCornerRadius, i2 % 2 == 0 ? 51 : 8);
    }

    static int I() {
        h = (f + 121) % 128;
        int c2 = c(com.facetec.sdk.FaceTecSDK.f3366a.f.buttonCornerRadius, 8);
        int i2 = f + 105;
        h = i2 % 128;
        if (i2 % 2 == 0) {
            return c2;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    static int L() {
        f = (h + 99) % 128;
        int c2 = c(com.facetec.sdk.FaceTecSDK.f3366a.f.inputFieldCornerRadius, 3);
        f = (h + 101) % 128;
        return c2;
    }

    static int M() {
        int i2 = h + 69;
        f = i2 % 128;
        return c(com.facetec.sdk.FaceTecSDK.f3366a.i.captureFrameCornerRadius, i2 % 2 == 0 ? 66 : 12);
    }

    static android.graphics.Typeface N() {
        h = (f + 97) % 128;
        java.lang.Object[] objArr = {com.facetec.sdk.FaceTecSDK.f3366a.g.readyScreenHeaderFont, com.facetec.sdk.FaceTecSDK.f3366a.g.headerFont};
        android.graphics.Typeface typeface = (android.graphics.Typeface) b(com.facetec.sdk.gj.AnonymousClass19.a(), 613290749, com.facetec.sdk.gj.AnonymousClass19.a(), objArr, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -613290732);
        h = (f + 29) % 128;
        return typeface;
    }

    static android.graphics.Typeface K() {
        int i2 = f + 71;
        h = i2 % 128;
        android.graphics.Typeface typeface = com.facetec.sdk.FaceTecSDK.f3366a.g.readyScreenSubtextFont;
        if (i2 % 2 == 0) {
            java.lang.Object[] objArr = {typeface, com.facetec.sdk.FaceTecSDK.f3366a.g.subtextFont};
            return (android.graphics.Typeface) b(com.facetec.sdk.gj.AnonymousClass19.a(), 613290749, com.facetec.sdk.gj.AnonymousClass19.a(), objArr, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -613290732);
        }
        java.lang.Object[] objArr2 = {typeface, com.facetec.sdk.FaceTecSDK.f3366a.g.subtextFont};
        throw null;
    }

    static android.graphics.Typeface J() {
        f = (h + 89) % 128;
        java.lang.Object[] objArr = {com.facetec.sdk.FaceTecSDK.f3366a.g.retryScreenHeaderFont, com.facetec.sdk.FaceTecSDK.f3366a.g.headerFont};
        android.graphics.Typeface typeface = (android.graphics.Typeface) b(com.facetec.sdk.gj.AnonymousClass19.a(), 613290749, com.facetec.sdk.gj.AnonymousClass19.a(), objArr, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -613290732);
        int i2 = f + 89;
        h = i2 % 128;
        if (i2 % 2 == 0) {
            return typeface;
        }
        throw null;
    }

    static android.graphics.Typeface P() {
        int i2 = h + 85;
        f = i2 % 128;
        android.graphics.Typeface typeface = com.facetec.sdk.FaceTecSDK.f3366a.g.retryScreenSubtextFont;
        if (i2 % 2 != 0) {
            java.lang.Object[] objArr = {typeface, com.facetec.sdk.FaceTecSDK.f3366a.g.subtextFont};
            return (android.graphics.Typeface) b(com.facetec.sdk.gj.AnonymousClass19.a(), 613290749, com.facetec.sdk.gj.AnonymousClass19.a(), objArr, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -613290732);
        }
        java.lang.Object[] objArr2 = {typeface, com.facetec.sdk.FaceTecSDK.f3366a.g.subtextFont};
        int i3 = 43 / 0;
        return (android.graphics.Typeface) b(com.facetec.sdk.gj.AnonymousClass19.a(), 613290749, com.facetec.sdk.gj.AnonymousClass19.a(), objArr2, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -613290732);
    }

    static com.facetec.sdk.FaceTecCustomization a(com.facetec.sdk.FaceTecCustomization faceTecCustomization) {
        android.graphics.Typeface typeface = android.graphics.Typeface.DEFAULT_BOLD;
        android.graphics.Typeface typeface2 = android.graphics.Typeface.DEFAULT;
        java.lang.Object obj = null;
        if (faceTecCustomization.l.textFont == null) {
            int i2 = f + 41;
            h = i2 % 128;
            if (i2 % 2 != 0) {
                faceTecCustomization.l.textFont = typeface2;
                obj.hashCode();
                throw null;
            }
            faceTecCustomization.l.textFont = typeface2;
        }
        if (faceTecCustomization.g.headerFont == null) {
            f = (h + 85) % 128;
            faceTecCustomization.g.headerFont = typeface;
        }
        if (faceTecCustomization.g.subtextFont == null) {
            faceTecCustomization.g.subtextFont = typeface2;
        }
        if (faceTecCustomization.g.buttonFont == null) {
            int i3 = f + 107;
            h = i3 % 128;
            if (i3 % 2 != 0) {
                faceTecCustomization.g.buttonFont = typeface2;
                obj.hashCode();
                throw null;
            }
            faceTecCustomization.g.buttonFont = typeface2;
        }
        if (faceTecCustomization.h.messageFont == null) {
            f = (h + 53) % 128;
            faceTecCustomization.h.messageFont = typeface2;
        }
        if (faceTecCustomization.i.headerFont == null) {
            faceTecCustomization.i.headerFont = typeface;
            int i4 = h + 23;
            f = i4 % 128;
            int i5 = i4 % 2;
        }
        if (faceTecCustomization.i.subtextFont == null) {
            int i6 = h + 83;
            f = i6 % 128;
            if (i6 % 2 == 0) {
                faceTecCustomization.i.subtextFont = typeface2;
                int i7 = 88 / 0;
            } else {
                faceTecCustomization.i.subtextFont = typeface2;
            }
        }
        if (faceTecCustomization.i.buttonFont == null) {
            faceTecCustomization.i.buttonFont = typeface2;
        }
        if (faceTecCustomization.i.captureScreenFocusMessageFont == null) {
            faceTecCustomization.i.captureScreenFocusMessageFont = typeface2;
        }
        if (faceTecCustomization.f.buttonFont == null) {
            int i8 = f + 71;
            h = i8 % 128;
            if (i8 % 2 != 0) {
                faceTecCustomization.f.buttonFont = typeface2;
                obj.hashCode();
                throw null;
            }
            faceTecCustomization.f.buttonFont = typeface2;
        }
        if (faceTecCustomization.f.mainHeaderFont == null) {
            f = (h + 69) % 128;
            faceTecCustomization.f.mainHeaderFont = typeface;
        }
        if (faceTecCustomization.f.sectionHeaderFont == null) {
            int i9 = f + 55;
            h = i9 % 128;
            if (i9 % 2 != 0) {
                faceTecCustomization.f.sectionHeaderFont = typeface;
                int i10 = 51 / 0;
            } else {
                faceTecCustomization.f.sectionHeaderFont = typeface;
            }
        }
        if (faceTecCustomization.f.fieldLabelFont == null) {
            faceTecCustomization.f.fieldLabelFont = typeface2;
        }
        if (faceTecCustomization.f.fieldValueFont == null) {
            faceTecCustomization.f.fieldValueFont = typeface2;
            int i11 = f + 65;
            h = i11 % 128;
            int i12 = i11 % 2;
        }
        if (faceTecCustomization.f.inputFieldFont == null) {
            faceTecCustomization.f.inputFieldFont = faceTecCustomization.f.fieldValueFont;
        }
        if (faceTecCustomization.f.inputFieldPlaceholderFont == null) {
            faceTecCustomization.f.inputFieldPlaceholderFont = faceTecCustomization.f.inputFieldFont;
        }
        if (faceTecCustomization.f.scrollIndicatorFont == null) {
            faceTecCustomization.f.scrollIndicatorFont = typeface2;
        }
        return faceTecCustomization;
    }

    private static /* synthetic */ java.lang.Object d(java.lang.Object[] objArr) {
        int intValue = ((java.lang.Number) objArr[0]).intValue();
        if (!com.facetec.sdk.FaceTecSDK.b()) {
            if (com.facetec.sdk.FaceTecSDK.e == com.facetec.sdk.FaceTecSDK.b.BRIGHT_LIGHT) {
                int i2 = h + 33;
                f = i2 % 128;
                if (i2 % 2 != 0) {
                    return -16777216;
                }
                int i3 = 84 / 0;
                return -16777216;
            }
            return java.lang.Integer.valueOf(intValue);
        }
        int i4 = h + 47;
        f = i4 % 128;
        if (i4 % 2 != 0) {
            return -1;
        }
        throw null;
    }

    static int Q() {
        if (ci()) {
            f = (h + 95) % 128;
            java.lang.Object[] objArr = {java.lang.Integer.valueOf(com.facetec.sdk.FaceTecSDK.f3366a.h.backgroundColors)};
            return ((java.lang.Integer) b(com.facetec.sdk.gj.AnonymousClass19.a(), -224477218, com.facetec.sdk.gj.AnonymousClass19.a(), objArr, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 224477221)).intValue();
        }
        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(com.facetec.sdk.FaceTecSDK.f3366a.i.idFeedbackScreenBackgroundColors)};
        int intValue = ((java.lang.Integer) b(com.facetec.sdk.gj.AnonymousClass19.a(), -224477218, com.facetec.sdk.gj.AnonymousClass19.a(), objArr2, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 224477221)).intValue();
        int i2 = h + 39;
        f = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 98 / 0;
        }
        return intValue;
    }

    private static int bw() {
        h = (f + 73) % 128;
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(com.facetec.sdk.FaceTecSDK.f3366a.i.additionalReviewScreenBackgroundColors)};
        int intValue = ((java.lang.Integer) b(com.facetec.sdk.gj.AnonymousClass19.a(), -224477218, com.facetec.sdk.gj.AnonymousClass19.a(), objArr, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 224477221)).intValue();
        f = (h + 11) % 128;
        return intValue;
    }

    static int O() {
        h = (f + 67) % 128;
        int i2 = bq().i.additionalReviewScreenForegroundColor;
        int i3 = f + 13;
        h = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 40 / 0;
        }
        return i2;
    }

    private static int by() {
        h = (f + 57) % 128;
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(com.facetec.sdk.FaceTecSDK.f3366a.h.backgroundColors)};
        int intValue = ((java.lang.Integer) b(com.facetec.sdk.gj.AnonymousClass19.a(), -224477218, com.facetec.sdk.gj.AnonymousClass19.a(), objArr, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 224477221)).intValue();
        h = (f + 121) % 128;
        return intValue;
    }

    static int S() {
        int i2 = f + 77;
        h = i2 % 128;
        int i3 = bq().h.foregroundColor;
        if (i2 % 2 == 0) {
            return i3;
        }
        throw null;
    }

    static int X() {
        h = (f + 83) % 128;
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(com.facetec.sdk.FaceTecSDK.f3366a.g.backgroundColors)};
        int intValue = ((java.lang.Integer) b(com.facetec.sdk.gj.AnonymousClass19.a(), -224477218, com.facetec.sdk.gj.AnonymousClass19.a(), objArr, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 224477221)).intValue();
        h = (f + 89) % 128;
        return intValue;
    }

    private static int bE() {
        h = (f + 77) % 128;
        int i2 = bq().g.foregroundColor;
        f = (h + 107) % 128;
        return i2;
    }

    private static int bD() {
        int i2 = f + 119;
        h = i2 % 128;
        int i3 = bq().g.readyScreenHeaderTextColor;
        if (i2 % 2 == 0) {
            return i3;
        }
        throw null;
    }

    private static int bB() {
        int i2 = f + 117;
        h = i2 % 128;
        java.lang.Object obj = null;
        if (i2 % 2 != 0) {
            int i3 = bq().g.readyScreenSubtextTextColor;
            obj.hashCode();
            throw null;
        }
        int i4 = bq().g.readyScreenSubtextTextColor;
        int i5 = f + 91;
        h = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        throw null;
    }

    private static int bA() {
        h = (f + 55) % 128;
        int i2 = bq().g.retryScreenHeaderTextColor;
        f = (h + 11) % 128;
        return i2;
    }

    private static int bC() {
        int i2 = f + 81;
        h = i2 % 128;
        int i3 = bq().g.retryScreenSubtextTextColor;
        if (i2 % 2 != 0) {
            int i4 = 10 / 0;
        }
        return i3;
    }

    private static int bI() {
        int i2 = h + 111;
        f = i2 % 128;
        java.lang.Object obj = null;
        if (i2 % 2 == 0) {
            java.lang.Object[] objArr = {java.lang.Integer.valueOf(com.facetec.sdk.FaceTecSDK.f3366a.n.backgroundColor)};
            ((java.lang.Integer) b(com.facetec.sdk.gj.AnonymousClass19.a(), -224477218, com.facetec.sdk.gj.AnonymousClass19.a(), objArr, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 224477221)).intValue();
            obj.hashCode();
            throw null;
        }
        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(com.facetec.sdk.FaceTecSDK.f3366a.n.backgroundColor)};
        int intValue = ((java.lang.Integer) b(com.facetec.sdk.gj.AnonymousClass19.a(), -224477218, com.facetec.sdk.gj.AnonymousClass19.a(), objArr2, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 224477221)).intValue();
        int i3 = h + 97;
        f = i3 % 128;
        if (i3 % 2 != 0) {
            return intValue;
        }
        obj.hashCode();
        throw null;
    }

    private static int bH() {
        int i2 = f + 113;
        h = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = bq().n.borderColor;
            java.lang.Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = bq().n.borderColor;
        int i5 = h + 59;
        f = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 87 / 0;
        }
        return i4;
    }

    private static int bF() {
        int i2 = h + 15;
        f = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = bq().k.strokeColor;
            h = (f + 47) % 128;
            return i3;
        }
        int i4 = bq().k.strokeColor;
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ java.lang.Object b(java.lang.Object[] objArr) {
        int i2;
        int i3 = h + 21;
        f = i3 % 128;
        if (i3 % 2 == 0) {
            i2 = bq().g.readyScreenOvalFillColor;
            int i4 = 21 / 0;
        } else {
            i2 = bq().g.readyScreenOvalFillColor;
        }
        int i5 = f + 115;
        h = i5 % 128;
        if (i5 % 2 == 0) {
            return java.lang.Integer.valueOf(i2);
        }
        throw null;
    }

    static int V() {
        h = (f + 57) % 128;
        int i2 = bq().g.readyScreenTextBackgroundColor;
        f = (h + 117) % 128;
        return i2;
    }

    static int U() {
        int i2 = h + 9;
        f = i2 % 128;
        if (i2 % 2 == 0) {
            java.lang.Object[] objArr = {java.lang.Integer.valueOf(com.facetec.sdk.FaceTecSDK.f3366a.j.backgroundColor)};
            ((java.lang.Integer) b(com.facetec.sdk.gj.AnonymousClass19.a(), -224477218, com.facetec.sdk.gj.AnonymousClass19.a(), objArr, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 224477221)).intValue();
            throw null;
        }
        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(com.facetec.sdk.FaceTecSDK.f3366a.j.backgroundColor)};
        int intValue = ((java.lang.Integer) b(com.facetec.sdk.gj.AnonymousClass19.a(), -224477218, com.facetec.sdk.gj.AnonymousClass19.a(), objArr2, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 224477221)).intValue();
        f = (h + 17) % 128;
        return intValue;
    }

    private static int bJ() {
        int i2 = f + 73;
        h = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = bq().m.defaultAnimationBackgroundColor;
            throw null;
        }
        int i4 = bq().m.defaultAnimationBackgroundColor;
        int i5 = h + 87;
        f = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 87 / 0;
        }
        return i4;
    }

    private static /* synthetic */ java.lang.Object q(java.lang.Object[] objArr) {
        f = (h + 45) % 128;
        int i2 = bq().m.defaultAnimationForegroundColor;
        int i3 = h + 117;
        f = i3 % 128;
        if (i3 % 2 != 0) {
            return java.lang.Integer.valueOf(i2);
        }
        int i4 = 6 / 0;
        return java.lang.Integer.valueOf(i2);
    }

    private static int bK() {
        h = (f + 41) % 128;
        int i2 = bq().h.resultAnimationBackgroundColor;
        f = (h + 5) % 128;
        return i2;
    }

    private static int bM() {
        int i2 = f + 27;
        h = i2 % 128;
        int i3 = bq().h.resultAnimationForegroundColor;
        if (i2 % 2 == 0) {
            return i3;
        }
        throw null;
    }

    private static int bL() {
        int i2 = h + 45;
        f = i2 % 128;
        int i3 = bq().h.uploadProgressTrackColor;
        if (i2 % 2 != 0) {
            return i3;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static int bO() {
        h = (f + 99) % 128;
        int i2 = bq().h.uploadProgressFillColor;
        int i3 = f + 73;
        h = i3 % 128;
        if (i3 % 2 == 0) {
            return i2;
        }
        throw null;
    }

    private static int bP() {
        f = (h + 81) % 128;
        int i2 = bq().l.textColor;
        h = (f + 79) % 128;
        return i2;
    }

    private static int bQ() {
        int i2 = h + 83;
        f = i2 % 128;
        int i3 = bq().l.backgroundColors;
        if (i2 % 2 != 0) {
            return i3;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static int bR() {
        f = (h + 93) % 128;
        int i2 = bq().g.retryScreenImageBorderColor;
        int i3 = h + 33;
        f = i3 % 128;
        if (i3 % 2 != 0) {
            return i2;
        }
        throw null;
    }

    private static int bT() {
        f = (h + 63) % 128;
        int i2 = bq().g.retryScreenOvalStrokeColor;
        int i3 = h + 109;
        f = i3 % 128;
        if (i3 % 2 != 0) {
            return i2;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ java.lang.Object x(java.lang.Object[] objArr) {
        f = (h + 17) % 128;
        int i2 = bq().g.buttonTextNormalColor;
        int i3 = h + 61;
        f = i3 % 128;
        if (i3 % 2 != 0) {
            return java.lang.Integer.valueOf(i2);
        }
        throw null;
    }

    static int Z() {
        f = (h + 17) % 128;
        int i2 = bq().g.buttonTextHighlightColor;
        f = (h + 53) % 128;
        return i2;
    }

    static int ab() {
        h = (f + 5) % 128;
        int i2 = bq().g.buttonTextDisabledColor;
        h = (f + 89) % 128;
        return i2;
    }

    static int Y() {
        int i2 = h + 57;
        f = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = bq().g.buttonBackgroundNormalColor;
            throw null;
        }
        int i4 = bq().g.buttonBackgroundNormalColor;
        f = (h + 105) % 128;
        return i4;
    }

    static int ac() {
        int i2 = h + 9;
        f = i2 % 128;
        int i3 = bq().g.buttonBackgroundDisabledColor;
        if (i2 % 2 != 0) {
            return i3;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    static int af() {
        f = (h + 55) % 128;
        int i2 = bq().g.buttonBorderColor;
        f = (h + 113) % 128;
        return i2;
    }

    private static /* synthetic */ java.lang.Object w(java.lang.Object[] objArr) {
        int i2 = f + 7;
        h = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = bq().i.buttonTextNormalColor;
            throw null;
        }
        int i4 = bq().i.buttonTextNormalColor;
        h = (f + 67) % 128;
        return java.lang.Integer.valueOf(i4);
    }

    private static /* synthetic */ java.lang.Object l(java.lang.Object[] objArr) {
        int i2 = h + 89;
        f = i2 % 128;
        int i3 = bq().i.buttonTextHighlightColor;
        if (i2 % 2 == 0) {
            int i4 = 66 / 0;
        }
        return java.lang.Integer.valueOf(i3);
    }

    static int ag() {
        h = (f + 125) % 128;
        int i2 = bq().i.buttonTextDisabledColor;
        f = (h + 53) % 128;
        return i2;
    }

    static int ad() {
        int i2;
        int i3 = h + 71;
        f = i3 % 128;
        if (i3 % 2 == 0) {
            i2 = bq().i.buttonBackgroundNormalColor;
            int i4 = 4 / 0;
        } else {
            i2 = bq().i.buttonBackgroundNormalColor;
        }
        int i5 = h + 55;
        f = i5 % 128;
        if (i5 % 2 != 0) {
            return i2;
        }
        throw null;
    }

    static int am() {
        int i2 = f + 79;
        h = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = bq().i.buttonBackgroundHighlightColor;
            throw null;
        }
        int i4 = bq().i.buttonBackgroundHighlightColor;
        int i5 = f + 105;
        h = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        throw null;
    }

    static int ai() {
        int i2 = f + 55;
        h = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = bq().i.buttonBackgroundDisabledColor;
            java.lang.Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = bq().i.buttonBackgroundDisabledColor;
        int i5 = h + 41;
        f = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 42 / 0;
        }
        return i4;
    }

    static int aj() {
        f = (h + 79) % 128;
        int i2 = bq().i.buttonBorderColor;
        int i3 = h + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        f = i3 % 128;
        if (i3 % 2 != 0) {
            return i2;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    static int al() {
        int i2;
        int i3 = h + 77;
        f = i3 % 128;
        if (i3 % 2 == 0) {
            i2 = bq().f.buttonTextNormalColor;
            int i4 = 42 / 0;
        } else {
            i2 = bq().f.buttonTextNormalColor;
        }
        h = (f + 45) % 128;
        return i2;
    }

    static int ak() {
        int i2 = h + 25;
        f = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = bq().f.buttonTextHighlightColor;
            java.lang.Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = bq().f.buttonTextHighlightColor;
        int i5 = f + 97;
        h = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 50 / 0;
        }
        return i4;
    }

    static int aq() {
        int i2 = h + 57;
        f = i2 % 128;
        int i3 = bq().f.buttonTextDisabledColor;
        if (i2 % 2 != 0) {
            return i3;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ java.lang.Object u(java.lang.Object[] objArr) {
        int i2 = f + 103;
        h = i2 % 128;
        int i3 = bq().f.buttonBackgroundNormalColor;
        if (i2 % 2 != 0) {
            int i4 = 44 / 0;
        }
        return java.lang.Integer.valueOf(i3);
    }

    static int ap() {
        f = (h + 121) % 128;
        int i2 = bq().f.buttonBackgroundHighlightColor;
        int i3 = f + 125;
        h = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 12 / 0;
        }
        return i2;
    }

    static int ao() {
        int i2 = f + 35;
        h = i2 % 128;
        int i3 = bq().f.buttonBackgroundDisabledColor;
        if (i2 % 2 == 0) {
            return i3;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    static int ar() {
        int i2 = h + 61;
        f = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = bq().f.buttonBorderColor;
            h = (f + 7) % 128;
            return i3;
        }
        int i4 = bq().f.buttonBorderColor;
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static int bS() {
        h = (f + 81) % 128;
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(com.facetec.sdk.FaceTecSDK.f3366a.f.backgroundColors)};
        int intValue = ((java.lang.Integer) b(com.facetec.sdk.gj.AnonymousClass19.a(), -224477218, com.facetec.sdk.gj.AnonymousClass19.a(), objArr, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 224477221)).intValue();
        int i2 = h + 89;
        f = i2 % 128;
        if (i2 % 2 != 0) {
            return intValue;
        }
        throw null;
    }

    static int au() {
        h = (f + 57) % 128;
        int i2 = bq().f.mainHeaderDividerLineColor;
        h = (f + 47) % 128;
        return i2;
    }

    private static /* synthetic */ java.lang.Object i(java.lang.Object[] objArr) {
        f = (h + 43) % 128;
        int i2 = bq().f.mainHeaderTextColor;
        int i3 = f + 3;
        h = i3 % 128;
        if (i3 % 2 == 0) {
            return java.lang.Integer.valueOf(i2);
        }
        int i4 = 31 / 0;
        return java.lang.Integer.valueOf(i2);
    }

    static int av() {
        f = (h + 113) % 128;
        int i2 = bq().f.sectionHeaderTextColor;
        f = (h + 97) % 128;
        return i2;
    }

    static int at() {
        int i2;
        int i3 = h + 13;
        f = i3 % 128;
        if (i3 % 2 == 0) {
            i2 = bq().f.fieldLabelTextColor;
            int i4 = 7 / 0;
        } else {
            i2 = bq().f.fieldLabelTextColor;
        }
        int i5 = f + 27;
        h = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 21 / 0;
        }
        return i2;
    }

    private static int bW() {
        h = (f + 65) % 128;
        int i2 = bq().f.fieldValueTextColor;
        f = (h + 11) % 128;
        return i2;
    }

    private static /* synthetic */ java.lang.Object j(java.lang.Object[] objArr) {
        int b2;
        int i2 = f + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        h = i2 % 128;
        if (i2 % 2 != 0) {
            b2 = b(bq().f.inputFieldTextColor, bW());
            int i3 = 28 / 0;
        } else {
            b2 = b(bq().f.inputFieldTextColor, bW());
        }
        int i4 = h + 79;
        f = i4 % 128;
        if (i4 % 2 != 0) {
            return java.lang.Integer.valueOf(b2);
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    static int c(android.content.Context context) {
        h = (f + 83) % 128;
        int b2 = b(bq().f.inputFieldPlaceholderTextColor, com.facetec.sdk.dp.d(com.facetec.sdk.dp.e(context, ((java.lang.Integer) b(com.facetec.sdk.gj.AnonymousClass19.a(), -1969056405, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 1969056421)).intValue()), 102));
        f = (h + 63) % 128;
        return b2;
    }

    static int aB() {
        f = (h + 5) % 128;
        int i2 = bq().f.inputFieldBackgroundColor;
        h = (f + 51) % 128;
        return i2;
    }

    static int aA() {
        f = (h + 75) % 128;
        int i2 = bq().f.inputFieldBorderColor;
        int i3 = f + 89;
        h = i3 % 128;
        if (i3 % 2 == 0) {
            return i2;
        }
        throw null;
    }

    static int ax() {
        int i2 = h + 105;
        f = i2 % 128;
        int i3 = bq().f.scrollIndicatorBorderColor;
        if (i2 % 2 != 0) {
            return i3;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    static int ay() {
        f = (h + 125) % 128;
        int i2 = bq().f.scrollIndicatorBackgroundNormalColor;
        int i3 = h + 79;
        f = i3 % 128;
        if (i3 % 2 != 0) {
            return i2;
        }
        throw null;
    }

    static int az() {
        h = (f + 43) % 128;
        int i2 = bq().f.scrollIndicatorBackgroundHighlightColor;
        h = (f + 73) % 128;
        return i2;
    }

    static int aC() {
        int i2 = h + 31;
        f = i2 % 128;
        int i3 = bq().f.scrollIndicatorForegroundNormalColor;
        if (i2 % 2 == 0) {
            int i4 = 89 / 0;
        }
        return i3;
    }

    private static int bY() {
        h = (f + 57) % 128;
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(com.facetec.sdk.FaceTecSDK.f3366a.i.selectionScreenBackgroundColors)};
        int intValue = ((java.lang.Integer) b(com.facetec.sdk.gj.AnonymousClass19.a(), -224477218, com.facetec.sdk.gj.AnonymousClass19.a(), objArr, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 224477221)).intValue();
        h = (f + 61) % 128;
        return intValue;
    }

    private static int bX() {
        f = (h + 119) % 128;
        int i2 = bq().i.selectionScreenForegroundColor;
        f = (h + 23) % 128;
        return i2;
    }

    private static /* synthetic */ java.lang.Object c(java.lang.Object[] objArr) {
        int i2;
        int i3 = h + 75;
        f = i3 % 128;
        if (i3 % 2 == 0) {
            i2 = bq().i.reviewScreenForegroundColor;
            int i4 = 72 / 0;
        } else {
            i2 = bq().i.reviewScreenForegroundColor;
        }
        h = (f + 95) % 128;
        return java.lang.Integer.valueOf(i2);
    }

    private static int bV() {
        int i2 = f + 117;
        h = i2 % 128;
        int i3 = bq().i.captureScreenForegroundColor;
        if (i2 % 2 == 0) {
            return i3;
        }
        throw null;
    }

    private static int cc() {
        f = (h + 45) % 128;
        int i2 = bq().i.captureScreenFocusMessageTextColor;
        int i3 = f + 11;
        h = i3 % 128;
        if (i3 % 2 == 0) {
            return i2;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object a(java.lang.Object[] objArr) {
        h = (f + 9) % 128;
        int i2 = bq().i.reviewScreenTextBackgroundColor;
        int i3 = h + 51;
        f = i3 % 128;
        if (i3 % 2 != 0) {
            return java.lang.Integer.valueOf(i2);
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    static int aG() {
        int i2 = h + 21;
        f = i2 % 128;
        int i3 = bq().i.reviewScreenTextBackgroundBorderColor;
        if (i2 % 2 == 0) {
            int i4 = 48 / 0;
        }
        return i3;
    }

    static int aE() {
        int i2 = f + 103;
        h = i2 % 128;
        int i3 = bq().i.captureScreenTextBackgroundColor;
        if (i2 % 2 != 0) {
            int i4 = 33 / 0;
        }
        return i3;
    }

    static int aJ() {
        int i2 = h + 43;
        f = i2 % 128;
        java.lang.Object obj = null;
        if (i2 % 2 == 0) {
            int i3 = bq().i.captureScreenTextBackgroundBorderColor;
            throw null;
        }
        int i4 = bq().i.captureScreenTextBackgroundBorderColor;
        int i5 = h + 77;
        f = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        obj.hashCode();
        throw null;
    }

    private static int bZ() {
        f = (h + 107) % 128;
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(com.facetec.sdk.FaceTecSDK.f3366a.i.captureScreenBackgroundColor)};
        int intValue = ((java.lang.Integer) b(com.facetec.sdk.gj.AnonymousClass19.a(), -224477218, com.facetec.sdk.gj.AnonymousClass19.a(), objArr, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 224477221)).intValue();
        int i2 = h + 23;
        f = i2 % 128;
        if (i2 % 2 != 0) {
            return intValue;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static int cd() {
        int i2 = h + 95;
        f = i2 % 128;
        int i3 = bq().i.captureFrameStrokeColor;
        if (i2 % 2 == 0) {
            int i4 = 56 / 0;
        }
        return i3;
    }

    private static int e(int i2, int i3) {
        if (i2 != 0) {
            h = (f + 69) % 128;
            return i2;
        }
        h = (f + 63) % 128;
        return i3;
    }

    static int aI() {
        int i2 = h + 29;
        f = i2 % 128;
        int i3 = bq().j.brandingImage;
        if (i2 % 2 != 0) {
            return b(i3, com.facetec.sdk.FaceTecSDK.f3366a.j.brandingImage);
        }
        int b2 = b(i3, com.facetec.sdk.FaceTecSDK.f3366a.j.brandingImage);
        int i4 = 39 / 0;
        return b2;
    }

    static int aL() {
        f = (h + 31) % 128;
        int b2 = b(bq().i.inactiveTorchButtonImage, com.facetec.sdk.FaceTecSDK.f3366a.i.inactiveTorchButtonImage);
        h = (f + 71) % 128;
        return b2;
    }

    static int aH() {
        h = (f + 63) % 128;
        int b2 = b(bq().i.activeTorchButtonImage, com.facetec.sdk.FaceTecSDK.f3366a.i.activeTorchButtonImage);
        f = (h + 121) % 128;
        return b2;
    }

    static int a(android.content.Context context) {
        h = (f + 47) % 128;
        int b2 = b(bq().i.faceMatchToIDBrandingImage, com.facetec.sdk.FaceTecSDK.f3366a.i.faceMatchToIDBrandingImage);
        if (b2 == 0) {
            int i2 = f + 65;
            h = i2 % 128;
            if (i2 % 2 == 0) {
                b2 = com.facetec.sdk.dp.a(context).getIdentifier("facetec_face_match_to_id_branding_logo", "drawable", context.getPackageName());
            } else {
                com.facetec.sdk.dp.a(context).getIdentifier("facetec_face_match_to_id_branding_logo", "drawable", context.getPackageName());
                throw null;
            }
        }
        return b2 == 0 ? com.facetec.sdk.R.drawable.facetec_internal_id_scan_watermark : b2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static int b(android.content.Context context) {
        int i2;
        int b2;
        int i3 = f + 35;
        h = i3 % 128;
        if (i3 % 2 != 0) {
            if (!com.facetec.sdk.FaceTecSDK.f3366a.b) {
                i2 = 1;
            }
            b2 = b(bq().i.standaloneIDScanWatermark, com.facetec.sdk.FaceTecSDK.f3366a.i.standaloneIDScanWatermark);
            if (b2 != 0) {
                h = (f + 37) % 128;
                i2 = com.facetec.sdk.dp.a(context).getIdentifier("facetec_standalone_id_scan_watermark", "drawable", context.getPackageName());
            } else {
                i2 = b2;
            }
        } else {
            if (!com.facetec.sdk.FaceTecSDK.f3366a.b) {
                i2 = 0;
            }
            b2 = b(bq().i.standaloneIDScanWatermark, com.facetec.sdk.FaceTecSDK.f3366a.i.standaloneIDScanWatermark);
            if (b2 != 0) {
            }
        }
        if (i2 != 0) {
            return i2;
        }
        f = (h + 107) % 128;
        return com.facetec.sdk.R.drawable.facetec_internal_id_scan_watermark;
    }

    static int aK() {
        int i2 = f + 65;
        h = i2 % 128;
        int i3 = bq().i.selectionScreenDocumentImage;
        if (i2 % 2 == 0) {
            return b(i3, com.facetec.sdk.FaceTecSDK.f3366a.i.selectionScreenDocumentImage);
        }
        b(i3, com.facetec.sdk.FaceTecSDK.f3366a.i.selectionScreenDocumentImage);
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    static int aQ() {
        h = (f + 17) % 128;
        int e2 = e(bq().m.customAnimation, com.facetec.sdk.FaceTecSDK.f3366a.m.customAnimation);
        int i2 = f + 37;
        h = i2 % 128;
        if (i2 % 2 == 0) {
            return e2;
        }
        throw null;
    }

    static int aM() {
        h = (f + 125) % 128;
        int e2 = e(bq().m.customAnimationImage, com.facetec.sdk.FaceTecSDK.f3366a.m.customAnimationImage);
        h = (f + 93) % 128;
        return e2;
    }

    static int aO() {
        int i2 = h + 69;
        f = i2 % 128;
        int i3 = bq().f.customScrollIndicatorAnimation;
        if (i2 % 2 != 0) {
            return b(i3, com.facetec.sdk.FaceTecSDK.f3366a.f.customScrollIndicatorAnimation);
        }
        b(i3, com.facetec.sdk.FaceTecSDK.f3366a.f.customScrollIndicatorAnimation);
        throw null;
    }

    private static /* synthetic */ java.lang.Object s(java.lang.Object[] objArr) {
        int i2 = h + 113;
        f = i2 % 128;
        int i3 = bq().h.customActivityIndicatorImage;
        if (i2 % 2 != 0) {
            return java.lang.Integer.valueOf(b(i3, com.facetec.sdk.FaceTecSDK.f3366a.h.customActivityIndicatorImage));
        }
        b(i3, com.facetec.sdk.FaceTecSDK.f3366a.h.customActivityIndicatorImage);
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    static int aV() {
        int i2 = h + 9;
        f = i2 % 128;
        int i3 = bq().h.resultAnimationSuccessBackgroundImage;
        if (i2 % 2 != 0) {
            return b(i3, com.facetec.sdk.FaceTecSDK.f3366a.h.resultAnimationSuccessBackgroundImage);
        }
        int b2 = b(i3, com.facetec.sdk.FaceTecSDK.f3366a.h.resultAnimationSuccessBackgroundImage);
        int i4 = 97 / 0;
        return b2;
    }

    static int aT() {
        int b2;
        int i2 = h + 111;
        f = i2 % 128;
        if (i2 % 2 == 0) {
            b2 = b(bq().h.resultAnimationUnsuccessBackgroundImage, com.facetec.sdk.FaceTecSDK.f3366a.h.resultAnimationUnsuccessBackgroundImage);
            int i3 = 57 / 0;
        } else {
            b2 = b(bq().h.resultAnimationUnsuccessBackgroundImage, com.facetec.sdk.FaceTecSDK.f3366a.h.resultAnimationUnsuccessBackgroundImage);
        }
        f = (h + 11) % 128;
        return b2;
    }

    private static /* synthetic */ java.lang.Object e(java.lang.Object[] objArr) {
        h = (f + 39) % 128;
        int b2 = b(bq().g.retryScreenIdealImage, com.facetec.sdk.FaceTecSDK.f3366a.g.retryScreenIdealImage);
        if (b2 == 0) {
            int i2 = f + 91;
            h = i2 % 128;
            if (i2 % 2 == 0) {
                b2 = com.facetec.sdk.R.drawable.facetec_ideal_pose_image;
            } else {
                int i3 = com.facetec.sdk.R.drawable.facetec_ideal_pose_image;
                throw null;
            }
        }
        return java.lang.Integer.valueOf(b2);
    }

    static int aS() {
        h = (f + 59) % 128;
        int b2 = b(com.facetec.sdk.FaceTecSDK.f3366a.g.cameraPermissionsScreenImage, com.facetec.sdk.R.drawable.facetec_camera);
        f = (h + 113) % 128;
        return b2;
    }

    private static /* synthetic */ java.lang.Object k(java.lang.Object[] objArr) {
        h = (f + 11) % 128;
        int b2 = b(bq().i.additionalReviewScreenImage, com.facetec.sdk.R.drawable.facetec_review);
        int i2 = h + 59;
        f = i2 % 128;
        if (i2 % 2 != 0) {
            return java.lang.Integer.valueOf(b2);
        }
        throw null;
    }

    static int aX() {
        int i2 = f + 25;
        h = i2 % 128;
        int i3 = bq().i.idFeedbackScreenFlipIDFrontImage;
        if (i2 % 2 == 0) {
            return b(i3, com.facetec.sdk.R.drawable.facetec_internal_id_card_front);
        }
        b(i3, com.facetec.sdk.R.drawable.facetec_internal_id_card_front);
        throw null;
    }

    private static /* synthetic */ java.lang.Object f(java.lang.Object[] objArr) {
        int i2 = f + 3;
        h = i2 % 128;
        int i3 = bq().i.idFeedbackScreenFlipIDBackImage;
        if (i2 % 2 == 0) {
            return java.lang.Integer.valueOf(b(i3, com.facetec.sdk.R.drawable.facetec_internal_id_card_back));
        }
        b(i3, com.facetec.sdk.R.drawable.facetec_internal_id_card_back);
        throw null;
    }

    static int d(android.content.Context context) {
        int i2 = h + 81;
        f = i2 % 128;
        int bZ = bZ();
        if (i2 % 2 != 0) {
            return com.facetec.sdk.dp.e(context, bZ);
        }
        com.facetec.sdk.dp.e(context, bZ);
        throw null;
    }

    private static /* synthetic */ java.lang.Object v(java.lang.Object[] objArr) {
        android.content.Context context = (android.content.Context) objArr[0];
        int i2 = h + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        f = i2 % 128;
        java.lang.Object obj = null;
        if (i2 % 2 == 0) {
            com.facetec.sdk.dp.e(context, bH());
            throw null;
        }
        int e2 = com.facetec.sdk.dp.e(context, bH());
        int i3 = f + 39;
        h = i3 % 128;
        if (i3 % 2 == 0) {
            return java.lang.Integer.valueOf(e2);
        }
        obj.hashCode();
        throw null;
    }

    static void e(android.view.View view) {
        int i2 = h + 63;
        f = i2 % 128;
        if (i2 % 2 != 0) {
            int bI = bI();
            int i3 = com.facetec.sdk.dm.AnonymousClass5.b[com.facetec.sdk.dp.c(view.getContext(), bI).ordinal()];
            if (i3 == 1) {
                view.setBackgroundResource(bI);
                h = (f + 49) % 128;
                return;
            } else {
                if (i3 != 2) {
                    return;
                }
                view.setBackgroundColor(bI);
                return;
            }
        }
        int i4 = com.facetec.sdk.dm.AnonymousClass5.b[com.facetec.sdk.dp.c(view.getContext(), bI()).ordinal()];
        throw null;
    }

    static void c(android.widget.TextView textView) {
        f = (h + 97) % 128;
        textView.getContext();
        com.facetec.sdk.dp.e(textView, bE());
        f = (h + 29) % 128;
    }

    static int h(android.content.Context context) {
        f = (h + 69) % 128;
        int b2 = b(com.facetec.sdk.dp.e(context, bD()), ((java.lang.Integer) b(com.facetec.sdk.gj.AnonymousClass19.a(), 1190349338, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[]{context}, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -1190349323)).intValue());
        h = (f + 21) % 128;
        return b2;
    }

    static int f(android.content.Context context) {
        int i2 = f + 31;
        h = i2 % 128;
        int e2 = com.facetec.sdk.dp.e(context, bB());
        java.lang.Object[] objArr = {context};
        int i3 = i2 % 2;
        int a2 = com.facetec.sdk.gj.AnonymousClass19.a();
        int a3 = com.facetec.sdk.gj.AnonymousClass19.a();
        int a4 = com.facetec.sdk.gj.AnonymousClass19.a();
        int a5 = com.facetec.sdk.gj.AnonymousClass19.a();
        if (i3 == 0) {
            return b(e2, ((java.lang.Integer) b(a2, 1190349338, a3, objArr, a5, a4, -1190349323)).intValue());
        }
        b(e2, ((java.lang.Integer) b(a2, 1190349338, a3, objArr, a5, a4, -1190349323)).intValue());
        throw null;
    }

    static int j(android.content.Context context) {
        int b2;
        int i2 = f + 65;
        h = i2 % 128;
        if (i2 % 2 != 0) {
            b2 = b(com.facetec.sdk.dp.e(context, bA()), ((java.lang.Integer) b(com.facetec.sdk.gj.AnonymousClass19.a(), 1190349338, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[]{context}, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -1190349323)).intValue());
            int i3 = 53 / 0;
        } else {
            b2 = b(com.facetec.sdk.dp.e(context, bA()), ((java.lang.Integer) b(com.facetec.sdk.gj.AnonymousClass19.a(), 1190349338, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[]{context}, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -1190349323)).intValue());
        }
        int i4 = f + 97;
        h = i4 % 128;
        if (i4 % 2 == 0) {
            return b2;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    static int i(android.content.Context context) {
        h = (f + 29) % 128;
        int b2 = b(com.facetec.sdk.dp.e(context, bC()), ((java.lang.Integer) b(com.facetec.sdk.gj.AnonymousClass19.a(), 1190349338, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[]{context}, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -1190349323)).intValue());
        int i2 = h + 101;
        f = i2 % 128;
        if (i2 % 2 != 0) {
            return b2;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object n(java.lang.Object[] objArr) {
        android.view.View view = (android.view.View) objArr[0];
        h = (f + 81) % 128;
        int U = U();
        int i2 = com.facetec.sdk.dm.AnonymousClass5.b[com.facetec.sdk.dp.c(view.getContext(), U).ordinal()];
        java.lang.Object obj = null;
        if (i2 == 1) {
            view.setBackgroundColor(androidx.core.content.ContextCompat.getColor(view.getContext(), U));
            return null;
        }
        if (i2 == 2) {
            view.setBackgroundColor(U);
            return null;
        }
        view.setBackgroundColor(0);
        int i3 = f + 17;
        h = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0045, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        if (r4 != 2) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0027, code lost:
    
        if (r4 != 2) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0046, code lost:
    
        r6.setBackgroundColor(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0049, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0042, code lost:
    
        r6.setBackgroundColor(0);
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void d(android.view.View view) {
        int X;
        int i2;
        int i3 = h + 77;
        f = i3 % 128;
        if (i3 % 2 == 0) {
            X = X();
            int i4 = com.facetec.sdk.dm.AnonymousClass5.b[com.facetec.sdk.dp.c(view.getContext(), X).ordinal()];
            int i5 = 34 / 0;
            if (i4 != 1) {
            }
            view.setBackgroundResource(X);
            i2 = f + 45;
            h = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            java.lang.Object obj = null;
            obj.hashCode();
            throw null;
        }
        X = X();
        int i6 = com.facetec.sdk.dm.AnonymousClass5.b[com.facetec.sdk.dp.c(view.getContext(), X).ordinal()];
        if (i6 != 1) {
        }
        view.setBackgroundResource(X);
        i2 = f + 45;
        h = i2 % 128;
        if (i2 % 2 != 0) {
        }
    }

    static void c(android.view.View view) {
        int i2 = h + 121;
        f = i2 % 128;
        if (i2 % 2 != 0) {
            int bS = bS();
            int i3 = com.facetec.sdk.dm.AnonymousClass5.b[com.facetec.sdk.dp.c(view.getContext(), bS).ordinal()];
            if (i3 == 1) {
                view.setBackgroundResource(bS);
                return;
            } else if (i3 == 2) {
                view.setBackgroundColor(bS);
                f = (h + 31) % 128;
                return;
            } else {
                view.setBackgroundColor(0);
                return;
            }
        }
        int i4 = com.facetec.sdk.dm.AnonymousClass5.b[com.facetec.sdk.dp.c(view.getContext(), bS()).ordinal()];
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void a(android.view.View view) {
        int i2 = f + 33;
        h = i2 % 128;
        java.lang.Object obj = null;
        if (i2 % 2 == 0) {
            int bw = bw();
            int i3 = com.facetec.sdk.dm.AnonymousClass5.b[com.facetec.sdk.dp.c(view.getContext(), bw).ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    view.setBackgroundColor(bw);
                    return;
                } else {
                    view.setBackgroundColor(0);
                    return;
                }
            }
            view.setBackgroundResource(bw);
            int i4 = h + 37;
            f = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            return;
        }
        int i5 = com.facetec.sdk.dm.AnonymousClass5.b[com.facetec.sdk.dp.c(view.getContext(), bw()).ordinal()];
        obj.hashCode();
        throw null;
    }

    static int n(android.content.Context context) {
        int e2;
        int i2;
        int i3 = f + 125;
        h = i3 % 128;
        if (i3 % 2 != 0) {
            e2 = com.facetec.sdk.dp.e(context, bF());
            i2 = 25158;
        } else {
            e2 = com.facetec.sdk.dp.e(context, bF());
            i2 = 255;
        }
        int d2 = com.facetec.sdk.dp.d(e2, i2);
        h = (f + 5) % 128;
        return d2;
    }

    static int k(android.content.Context context) {
        int i2 = f + 43;
        h = i2 % 128;
        if (i2 % 2 == 0) {
            return com.facetec.sdk.dp.e(context, ((java.lang.Integer) b(com.facetec.sdk.gj.AnonymousClass19.a(), 476507855, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -476507847)).intValue());
        }
        com.facetec.sdk.dp.e(context, ((java.lang.Integer) b(com.facetec.sdk.gj.AnonymousClass19.a(), 476507855, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -476507847)).intValue());
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    static int m(android.content.Context context) {
        f = (h + 45) % 128;
        int d2 = com.facetec.sdk.dp.d(com.facetec.sdk.dp.e(context, bI()), 255);
        f = (h + 105) % 128;
        return d2;
    }

    private static /* synthetic */ java.lang.Object y(java.lang.Object[] objArr) {
        android.content.Context context = (android.content.Context) objArr[0];
        int i2 = h + 77;
        f = i2 % 128;
        int bK = bK();
        if (i2 % 2 != 0) {
            return java.lang.Integer.valueOf(com.facetec.sdk.dp.e(context, bK));
        }
        com.facetec.sdk.dp.e(context, bK);
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    static int o(android.content.Context context) {
        int i2 = f + 43;
        h = i2 % 128;
        if (i2 % 2 == 0) {
            int e2 = com.facetec.sdk.dp.e(context, bM());
            h = (f + 59) % 128;
            return e2;
        }
        com.facetec.sdk.dp.e(context, bM());
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    static int r(android.content.Context context) {
        int i2 = f + 103;
        h = i2 % 128;
        if (i2 % 2 != 0) {
            com.facetec.sdk.dp.e(context, bR());
            throw null;
        }
        int e2 = com.facetec.sdk.dp.e(context, bR());
        f = (h + 15) % 128;
        return e2;
    }

    static int t(android.content.Context context) {
        int i2 = f + 71;
        h = i2 % 128;
        int bT = bT();
        if (i2 % 2 == 0) {
            return com.facetec.sdk.dp.e(context, bT);
        }
        com.facetec.sdk.dp.e(context, bT);
        throw null;
    }

    static int q(android.content.Context context) {
        int i2 = h + 29;
        f = i2 % 128;
        int bJ = bJ();
        if (i2 % 2 != 0) {
            return com.facetec.sdk.dp.e(context, bJ);
        }
        com.facetec.sdk.dp.e(context, bJ);
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    static int p(android.content.Context context) {
        int i2 = h + 63;
        f = i2 % 128;
        java.lang.Object[] objArr = new java.lang.Object[0];
        int a2 = com.facetec.sdk.gj.AnonymousClass19.a();
        int a3 = com.facetec.sdk.gj.AnonymousClass19.a();
        int a4 = com.facetec.sdk.gj.AnonymousClass19.a();
        int a5 = com.facetec.sdk.gj.AnonymousClass19.a();
        if (i2 % 2 != 0) {
            return com.facetec.sdk.dp.e(context, ((java.lang.Integer) b(a2, -1649048056, a3, objArr, a5, a4, 1649048093)).intValue());
        }
        int i3 = 31 / 0;
        return com.facetec.sdk.dp.e(context, ((java.lang.Integer) b(a2, -1649048056, a3, objArr, a5, a4, 1649048093)).intValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0052, code lost:
    
        if ((r1 instanceof android.graphics.drawable.GradientDrawable) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005a, code lost:
    
        return d(r5, (android.graphics.drawable.GradientDrawable) r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005d, code lost:
    
        if ((r1 instanceof android.graphics.drawable.ColorDrawable) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
    
        r1.setAlpha(255);
        r5 = com.facetec.sdk.dm.f + 9;
        com.facetec.sdk.dm.h = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006c, code lost:
    
        if ((r5 % 2) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
    
        ((android.graphics.drawable.ShapeDrawable) r1).getPaint().setAlpha(255);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
    
        if ((r1 instanceof android.graphics.drawable.ShapeDrawable) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0036, code lost:
    
        if ((r1 instanceof android.graphics.drawable.ShapeDrawable) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static android.graphics.drawable.Drawable s(android.content.Context context) {
        android.graphics.drawable.Drawable mutate;
        int X = X();
        if (com.facetec.sdk.dm.AnonymousClass5.b[com.facetec.sdk.dp.c(context, X).ordinal()] == 1) {
            if (androidx.core.content.ContextCompat.getDrawable(context, X) == null) {
                android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
                gradientDrawable.setColor(com.facetec.sdk.dp.d(androidx.core.content.ContextCompat.getColor(context, X), 255));
                return gradientDrawable;
            }
            int i2 = f + 71;
            h = i2 % 128;
            if (i2 % 2 != 0) {
                mutate = androidx.core.content.ContextCompat.getDrawable(context, X).mutate();
                int i3 = 80 / 0;
            } else {
                mutate = androidx.core.content.ContextCompat.getDrawable(context, X).mutate();
            }
        }
        android.graphics.drawable.GradientDrawable gradientDrawable2 = new android.graphics.drawable.GradientDrawable();
        gradientDrawable2.setColor(com.facetec.sdk.dp.d(X, 255));
        f = (h + 45) % 128;
        return gradientDrawable2;
    }

    static int aW() {
        int i2 = h + 37;
        f = i2 % 128;
        return i2 % 2 == 0 ? 602 : 255;
    }

    static void i(android.view.View view) {
        int i2 = h + 113;
        f = i2 % 128;
        java.lang.Object obj = null;
        if (i2 % 2 != 0) {
            java.lang.Object[] objArr = {view, java.lang.Integer.valueOf(by())};
            b(com.facetec.sdk.gj.AnonymousClass19.a(), -1818774409, com.facetec.sdk.gj.AnonymousClass19.a(), objArr, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 1818774431);
            int i3 = h + 69;
            f = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        java.lang.Object[] objArr2 = {view, java.lang.Integer.valueOf(by())};
        b(com.facetec.sdk.gj.AnonymousClass19.a(), -1818774409, com.facetec.sdk.gj.AnonymousClass19.a(), objArr2, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 1818774431);
        throw null;
    }

    static void d(android.widget.TextView textView) {
        int i2 = h + 119;
        f = i2 % 128;
        if (i2 % 2 != 0) {
            com.facetec.sdk.dp.e(textView, S());
            h = (f + 27) % 128;
        } else {
            com.facetec.sdk.dp.e(textView, S());
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void b(android.widget.ProgressBar progressBar, android.graphics.drawable.Drawable drawable) {
        int bL;
        int i2;
        int i3 = h + 99;
        f = i3 % 128;
        if (i3 % 2 == 0) {
            bL = bL();
            int i4 = com.facetec.sdk.dm.AnonymousClass5.b[com.facetec.sdk.dp.c(progressBar.getContext(), bL).ordinal()];
            int i5 = 79 / 0;
            if (i4 != 1) {
                if (i4 != 2) {
                    return;
                }
                ((android.graphics.drawable.GradientDrawable) drawable).setColor(bL);
                return;
            }
            ((android.graphics.drawable.GradientDrawable) drawable).setColor(androidx.core.content.ContextCompat.getColor(progressBar.getContext(), bL));
            i2 = f + 59;
            h = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            java.lang.Object obj = null;
            obj.hashCode();
            throw null;
        }
        bL = bL();
        int i6 = com.facetec.sdk.dm.AnonymousClass5.b[com.facetec.sdk.dp.c(progressBar.getContext(), bL).ordinal()];
        if (i6 != 1) {
            if (i6 != 2) {
                return;
            }
            ((android.graphics.drawable.GradientDrawable) drawable).setColor(bL);
            return;
        }
        ((android.graphics.drawable.GradientDrawable) drawable).setColor(androidx.core.content.ContextCompat.getColor(progressBar.getContext(), bL));
        i2 = f + 59;
        h = i2 % 128;
        if (i2 % 2 != 0) {
        }
    }

    static void b(android.widget.ProgressBar progressBar, android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2) {
        f = (h + 93) % 128;
        int bO = bO();
        int i2 = com.facetec.sdk.dm.AnonymousClass5.b[com.facetec.sdk.dp.c(progressBar.getContext(), bO).ordinal()];
        if (i2 == 1) {
            ((android.graphics.drawable.GradientDrawable) drawable).setColor(androidx.core.content.ContextCompat.getColor(progressBar.getContext(), bO));
            ((android.graphics.drawable.GradientDrawable) drawable2).setColor(com.facetec.sdk.dp.a(androidx.core.content.ContextCompat.getColor(progressBar.getContext(), bO)));
            f = (h + 49) % 128;
            return;
        }
        if (i2 != 2) {
            return;
        }
        ((android.graphics.drawable.GradientDrawable) drawable).setColor(bO);
        ((android.graphics.drawable.GradientDrawable) drawable2).setColor(com.facetec.sdk.dp.a(bO));
    }

    static void a(android.widget.TextView textView) {
        int i2 = h + 125;
        f = i2 % 128;
        if (i2 % 2 != 0) {
            com.facetec.sdk.dp.e(textView, bP());
        } else {
            com.facetec.sdk.dp.e(textView, bP());
            throw null;
        }
    }

    static void h(android.view.View view) {
        f = (h + 117) % 128;
        java.lang.Object[] objArr = {view, java.lang.Integer.valueOf(bY())};
        b(com.facetec.sdk.gj.AnonymousClass19.a(), -1818774409, com.facetec.sdk.gj.AnonymousClass19.a(), objArr, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 1818774431);
        int i2 = h + 95;
        f = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 99 / 0;
        }
    }

    static void e(android.widget.TextView textView) {
        h = (f + 53) % 128;
        com.facetec.sdk.dp.e(textView, bX());
        int i2 = h + 71;
        f = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void g(android.widget.TextView textView) {
        f = (h + 37) % 128;
        com.facetec.sdk.dp.e(textView, bV());
        f = (h + 121) % 128;
    }

    static void i(android.widget.TextView textView) {
        h = (f + 83) % 128;
        com.facetec.sdk.dp.e(textView, cc());
        int i2 = h + 85;
        f = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 34 / 0;
        }
    }

    static android.graphics.drawable.GradientDrawable x(android.content.Context context) {
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        int bQ = bQ();
        int i2 = com.facetec.sdk.dm.AnonymousClass5.b[com.facetec.sdk.dp.c(context, bQ).ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                gradientDrawable.setColor(bQ);
            }
        } else if (!(androidx.core.content.ContextCompat.getDrawable(context, bQ) instanceof android.graphics.drawable.GradientDrawable)) {
            gradientDrawable.setColor(androidx.core.content.ContextCompat.getColor(context, bQ));
        } else {
            h = (f + 55) % 128;
            gradientDrawable = (android.graphics.drawable.GradientDrawable) androidx.core.content.ContextCompat.getDrawable(context, bQ);
        }
        if (gradientDrawable != null) {
            gradientDrawable.setCornerRadius(com.facetec.sdk.ay.d((int) (bz() * b())));
        }
        int i3 = f + 125;
        h = i3 % 128;
        if (i3 % 2 == 0) {
            return gradientDrawable;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        if (r0.contains(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
    
        r0 = r0.substring(0, r0.indexOf(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE));
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        if (r0.contains(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (r0.contains(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002b, code lost:
    
        r0 = r0.substring(0, r0.indexOf(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE));
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        if (r0.contains(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static java.lang.String c(boolean z, boolean z2) {
        java.lang.String str = com.facetec.sdk.FaceTecSDK.f3366a.g.readyScreenHeaderAttributedString;
        if (!str.isEmpty()) {
            int i2 = f + 75;
            h = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 19 / 0;
            }
        }
        if (!z2 && str.isEmpty()) {
            int i4 = h + 51;
            f = i4 % 128;
            if (i4 % 2 == 0) {
                str = com.facetec.sdk.dl.d(com.facetec.sdk.R.string.FaceTec_instructions_header_ready_1);
                int i5 = 10 / 0;
            } else {
                str = com.facetec.sdk.dl.d(com.facetec.sdk.R.string.FaceTec_instructions_header_ready_1);
            }
        }
        if (!z || com.facetec.sdk.FaceTecSDK.f3366a.e || str.length() <= 30) {
            return str;
        }
        f = (h + 35) % 128;
        return str.substring(0, 30);
    }

    static java.lang.String b(boolean z, boolean z2) {
        h = (f + 65) % 128;
        java.lang.String str = com.facetec.sdk.FaceTecSDK.f3366a.g.readyScreenHeaderAttributedString;
        if (!str.isEmpty()) {
            f = (h + 109) % 128;
            if (str.contains(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE)) {
                str = str.substring(str.indexOf(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE) + 1);
            }
        }
        if (!z2) {
            f = (h + 111) % 128;
            if (str.isEmpty()) {
                f = (h + 53) % 128;
                str = com.facetec.sdk.dl.d(com.facetec.sdk.R.string.FaceTec_instructions_header_ready_2);
                if (str.contains(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE)) {
                    h = (f + 103) % 128;
                    str = str.substring(str.indexOf(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE) + 1);
                }
            }
        }
        if (z && !com.facetec.sdk.FaceTecSDK.f3366a.e) {
            f = (h + 77) % 128;
            if (str.length() > 30) {
                f = (h + 71) % 128;
                return str.substring(0, 30);
            }
        }
        return str;
    }

    static java.lang.String a(boolean z, boolean z2) {
        java.lang.String str = com.facetec.sdk.FaceTecSDK.f3366a.g.readyScreenSubtextAttributedString;
        if (!str.isEmpty()) {
            f = (h + 83) % 128;
            if (str.contains(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE)) {
                str = str.substring(0, str.indexOf(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE));
            }
        }
        if (!z2 && str.isEmpty()) {
            int i2 = h + 121;
            f = i2 % 128;
            if (i2 % 2 == 0) {
                com.facetec.sdk.dl.d(com.facetec.sdk.R.string.FaceTec_instructions_message_ready_1).contains(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
                java.lang.Object obj = null;
                obj.hashCode();
                throw null;
            }
            str = com.facetec.sdk.dl.d(com.facetec.sdk.R.string.FaceTec_instructions_message_ready_1);
            if (str.contains(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE)) {
                str = str.substring(0, str.indexOf(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE));
            }
        }
        if (z) {
            h = (f + 67) % 128;
            if (!com.facetec.sdk.FaceTecSDK.f3366a.e) {
                f = (h + 81) % 128;
                if (str.length() > 50) {
                    str = str.substring(0, 50);
                }
            }
        }
        f = (h + 107) % 128;
        return str;
    }

    static java.lang.String e(boolean z, boolean z2) {
        java.lang.String str = com.facetec.sdk.FaceTecSDK.f3366a.g.readyScreenSubtextAttributedString;
        if (!str.isEmpty() && str.contains(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE)) {
            str = str.substring(str.indexOf(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE) + 1);
        }
        if (!z2 && str.isEmpty()) {
            str = com.facetec.sdk.dl.d(com.facetec.sdk.R.string.FaceTec_instructions_message_ready_2);
            if (str.contains(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE)) {
                str = str.substring(str.indexOf(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE) + 1);
            }
        }
        if (z && !com.facetec.sdk.FaceTecSDK.f3366a.e) {
            int i2 = f + 11;
            h = i2 % 128;
            if (i2 % 2 == 0 ? str.length() > 50 : str.length() > 101) {
                int i3 = h + 59;
                f = i3 % 128;
                java.lang.String substring = i3 % 2 == 0 ? str.substring(1, 8) : str.substring(0, 50);
                f = (h + 73) % 128;
                return substring;
            }
        }
        return str;
    }

    static java.lang.String h(boolean z, boolean z2) {
        int i2;
        java.lang.String str = com.facetec.sdk.FaceTecSDK.f3366a.g.retryScreenSubtextAttributedString;
        if (!z2 && str.isEmpty()) {
            int i3 = f + 31;
            h = i3 % 128;
            if (i3 % 2 != 0) {
                com.facetec.sdk.dl.d(com.facetec.sdk.R.string.FaceTec_retry_subheader_message);
                java.lang.Object obj = null;
                obj.hashCode();
                throw null;
            }
            str = com.facetec.sdk.dl.d(com.facetec.sdk.R.string.FaceTec_retry_subheader_message);
        }
        if (z) {
            h = (f + 11) % 128;
            if (!com.facetec.sdk.FaceTecSDK.f3366a.e) {
                f = (h + 53) % 128;
                int i4 = 40;
                if (str.length() > 40) {
                    int i5 = h;
                    f = (i5 + 23) % 128;
                    int i6 = i5 + 109;
                    f = i6 % 128;
                    if (i6 % 2 == 0) {
                        i2 = 1;
                        i4 = 29;
                    } else {
                        i2 = 0;
                    }
                    return str.substring(i2, i4);
                }
            }
        }
        return str;
    }

    static java.lang.String c(boolean z) {
        java.lang.String d2 = com.facetec.sdk.dl.d(com.facetec.sdk.R.string.FaceTec_retry_instruction_message_1);
        if (z && !com.facetec.sdk.FaceTecSDK.f3366a.e && d2.length() > 40) {
            int i2 = f;
            h = (i2 + 57) % 128;
            h = (i2 + 97) % 128;
            int i3 = i2 + 21;
            h = i3 % 128;
            d2 = i3 % 2 != 0 ? d2.substring(0, 79) : d2.substring(0, 40);
        }
        h = (f + 69) % 128;
        return d2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static java.lang.String a(boolean z) {
        int i2;
        java.lang.String d2 = com.facetec.sdk.dl.d(com.facetec.sdk.R.string.FaceTec_retry_instruction_message_2);
        if (z && !com.facetec.sdk.FaceTecSDK.f3366a.e) {
            int i3 = h + 85;
            f = i3 % 128;
            if (i3 % 2 != 0 ? d2.length() > 40 : d2.length() > 66) {
                int i4 = f + 27;
                h = i4 % 128;
                d2 = i4 % 2 != 0 ? d2.substring(0, 81) : d2.substring(0, 40);
                i2 = h + 5;
                f = i2 % 128;
                if (i2 % 2 == 0) {
                    return d2;
                }
                throw null;
            }
        }
        h = (f + 63) % 128;
        i2 = h + 5;
        f = i2 % 128;
        if (i2 % 2 == 0) {
        }
    }

    static java.lang.String d(boolean z) {
        java.lang.String d2 = com.facetec.sdk.dl.d(com.facetec.sdk.R.string.FaceTec_retry_ideal_image_label);
        if (z) {
            int i2 = f + 45;
            h = i2 % 128;
            if (i2 % 2 == 0) {
                if (!com.facetec.sdk.FaceTecSDK.f3366a.e && d2.length() > 21) {
                    f = (h + 17) % 128;
                    return d2.substring(0, 21);
                }
            } else {
                boolean z2 = com.facetec.sdk.FaceTecSDK.f3366a.e;
                throw null;
            }
        }
        return d2;
    }

    static java.lang.String aZ() {
        java.lang.String d2 = com.facetec.sdk.dl.d(com.facetec.sdk.R.string.FaceTec_retry_official_id_photo_subheader_message);
        if (com.facetec.sdk.FaceTecSDK.f3366a.e) {
            return d2;
        }
        h = (f + 119) % 128;
        if (d2.length() <= 40) {
            return d2;
        }
        int i2 = f;
        h = (i2 + 1) % 128;
        h = (i2 + 27) % 128;
        return d2.substring(0, 40);
    }

    static java.lang.String bb() {
        java.lang.String d2;
        int i2 = h + 23;
        f = i2 % 128;
        if (i2 % 2 == 0) {
            d2 = com.facetec.sdk.dl.d(com.facetec.sdk.R.string.FaceTec_retry_official_id_photo_instruction_message);
            int i3 = 25 / 0;
        } else {
            d2 = com.facetec.sdk.dl.d(com.facetec.sdk.R.string.FaceTec_retry_official_id_photo_instruction_message);
        }
        int i4 = h + 7;
        f = i4 % 128;
        if (i4 % 2 != 0) {
            return d2;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    static java.lang.String bc() {
        int i2 = f + 97;
        h = i2 % 128;
        if (i2 % 2 == 0) {
            java.lang.String d2 = com.facetec.sdk.dl.d(com.facetec.sdk.R.string.FaceTec_retry_official_id_photo_ideal_image_label);
            if (com.facetec.sdk.FaceTecSDK.f3366a.e) {
                return d2;
            }
            int i3 = f + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
            h = i3 % 128;
            if (i3 % 2 != 0) {
                if (d2.length() <= 16) {
                    return d2;
                }
            } else if (d2.length() <= 21) {
                return d2;
            }
            int i4 = h + 101;
            f = i4 % 128;
            return i4 % 2 == 0 ? d2.substring(0, 35) : d2.substring(0, 21);
        }
        com.facetec.sdk.dl.d(com.facetec.sdk.R.string.FaceTec_retry_official_id_photo_ideal_image_label);
        boolean z = com.facetec.sdk.FaceTecSDK.f3366a.e;
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    static java.lang.String bf() {
        h = (f + 37) % 128;
        java.lang.String d2 = com.facetec.sdk.dl.d(com.facetec.sdk.R.string.FaceTec_retry_official_id_photo_your_image_label);
        if (com.facetec.sdk.FaceTecSDK.f3366a.e) {
            return d2;
        }
        int i2 = h + 49;
        f = i2 % 128;
        if (i2 % 2 == 0) {
            if (d2.length() <= 66) {
                return d2;
            }
        } else if (d2.length() <= 21) {
            return d2;
        }
        int i3 = h + 1;
        f = i3 % 128;
        return i3 % 2 == 0 ? d2.substring(1, 26) : d2.substring(0, 21);
    }

    static int be() {
        f = (h + 87) % 128;
        int i2 = bq().i.idFeedbackScreenFlipIDToBackAnimation;
        int i3 = h + 39;
        f = i3 % 128;
        if (i3 % 2 != 0) {
            return i2;
        }
        throw null;
    }

    static int bd() {
        int i2;
        int i3 = h + 31;
        f = i3 % 128;
        if (i3 % 2 == 0) {
            i2 = bq().i.additionalReviewScreenAnimation;
            int i4 = 44 / 0;
        } else {
            i2 = bq().i.additionalReviewScreenAnimation;
        }
        f = (h + 125) % 128;
        return i2;
    }

    static int bh() {
        int i2 = h + 3;
        f = i2 % 128;
        int i3 = bq().i.customNFCStartingAnimation;
        if (i2 % 2 != 0) {
            return i3;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object g(java.lang.Object[] objArr) {
        int i2 = h + 85;
        f = i2 % 128;
        int i3 = bq().i.customNFCScanningAnimation;
        if (i2 % 2 != 0) {
            return java.lang.Integer.valueOf(i3);
        }
        throw null;
    }

    static int bi() {
        int i2 = h + 33;
        f = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = bq().i.customNFCCardStartingAnimation;
            throw null;
        }
        int i4 = bq().i.customNFCCardStartingAnimation;
        int i5 = h + 107;
        f = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        throw null;
    }

    static int bk() {
        int i2;
        int i3 = h + 13;
        f = i3 % 128;
        if (i3 % 2 == 0) {
            i2 = bq().i.customNFCCardScanningAnimation;
            int i4 = 68 / 0;
        } else {
            i2 = bq().i.customNFCCardScanningAnimation;
        }
        int i5 = f + 43;
        h = i5 % 128;
        if (i5 % 2 == 0) {
            return i2;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    static int bg() {
        int i2 = h + 45;
        f = i2 % 128;
        int i3 = bq().i.customNFCSkipOrErrorAnimation;
        if (i2 % 2 != 0) {
            return i3;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    static int bl() {
        h = (f + 25) % 128;
        int i2 = bq().h.customActivityIndicatorAnimation;
        int i3 = f + 53;
        h = i3 % 128;
        if (i3 % 2 == 0) {
            return i2;
        }
        throw null;
    }

    static int bo() {
        h = (f + 79) % 128;
        int i2 = bq().h.customResultAnimationSuccess;
        int i3 = h + 113;
        f = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 73 / 0;
        }
        return i2;
    }

    private static /* synthetic */ java.lang.Object t(java.lang.Object[] objArr) {
        int i2 = f + 15;
        h = i2 % 128;
        int i3 = bq().h.customResultAnimationUnsuccess;
        if (i2 % 2 == 0) {
            return java.lang.Integer.valueOf(i3);
        }
        throw null;
    }

    static float bp() {
        h = (f + 97) % 128;
        return java.lang.Math.min(java.lang.Math.max(com.facetec.sdk.FaceTecSDK.f3366a.h.animationRelativeScale, 0.5f), 2.0f);
    }

    static java.lang.String a(com.facetec.sdk.cz czVar) {
        java.lang.String str;
        java.util.HashMap<com.facetec.sdk.cz, java.lang.String> hashMap = com.facetec.sdk.FaceTecCustomization.t;
        java.lang.Object obj = null;
        if (hashMap != null) {
            f = (h + 33) % 128;
            str = hashMap.get(czVar);
        } else {
            str = null;
        }
        if (str != null) {
            return str;
        }
        int i2 = h + 59;
        f = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = com.facetec.sdk.dm.AnonymousClass5.e[czVar.ordinal()];
            obj.hashCode();
            throw null;
        }
        switch (com.facetec.sdk.dm.AnonymousClass5.e[czVar.ordinal()]) {
            case 1:
                return com.facetec.sdk.dl.d(com.facetec.sdk.R.string.FaceTec_result_idscan_unsuccess_message);
            case 2:
                return com.facetec.sdk.dl.d(com.facetec.sdk.R.string.FaceTec_result_idscan_retry_face_did_not_match_message);
            case 3:
                return com.facetec.sdk.dl.d(com.facetec.sdk.R.string.FaceTec_result_idscan_retry_id_not_fully_visible_message);
            case 4:
                return com.facetec.sdk.dl.d(com.facetec.sdk.R.string.FaceTec_result_idscan_retry_ocr_results_not_good_enough_message);
            case 5:
                return com.facetec.sdk.dl.d(com.facetec.sdk.R.string.FaceTec_result_idscan_retry_id_type_not_supported_message);
            case 6:
                return com.facetec.sdk.dl.d(com.facetec.sdk.R.string.FaceTec_result_idscan_retry_barcode_not_read_message);
            case 7:
            default:
                return str;
            case 8:
                return com.facetec.sdk.dl.d(com.facetec.sdk.R.string.FaceTec_result_idscan_skip_or_error_nfc_message);
            case 9:
                return com.facetec.sdk.dl.d(com.facetec.sdk.R.string.FaceTec_result_idscan_success_front_side_message);
            case 10:
                return com.facetec.sdk.dl.d(com.facetec.sdk.R.string.FaceTec_result_idscan_success_front_side_back_next_message);
            case 11:
                return com.facetec.sdk.dl.d(com.facetec.sdk.R.string.FaceTec_result_idscan_success_front_side_nfc_next_message);
            case 12:
                return com.facetec.sdk.dl.d(com.facetec.sdk.R.string.FaceTec_result_idscan_success_back_side_message);
            case 13:
                return com.facetec.sdk.dl.d(com.facetec.sdk.R.string.FaceTec_result_idscan_success_back_side_nfc_next_message);
            case 14:
                return com.facetec.sdk.dl.d(com.facetec.sdk.R.string.FaceTec_result_idscan_success_passport_message);
            case 15:
                return com.facetec.sdk.dl.d(com.facetec.sdk.R.string.FaceTec_result_idscan_success_passport_nfc_next_message);
            case 16:
                return com.facetec.sdk.dl.d(com.facetec.sdk.R.string.FaceTec_result_idscan_success_user_confirmation_message);
            case 17:
                return com.facetec.sdk.dl.d(com.facetec.sdk.R.string.FaceTec_result_idscan_success_nfc_message);
            case 18:
                return com.facetec.sdk.dl.d(com.facetec.sdk.R.string.FaceTec_result_idscan_success_additional_review_message);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001a, code lost:
    
        r3 = com.facetec.sdk.FaceTecCustomization.q.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:
    
        if (com.facetec.sdk.FaceTecCustomization.q != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (com.facetec.sdk.FaceTecCustomization.q != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static java.lang.String d(com.facetec.sdk.dt dtVar) {
        java.lang.String str;
        int i2 = h + 7;
        f = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 46 / 0;
        }
        int i4 = h + 51;
        f = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: com.facetec.sdk.dm$5, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] b;
        static final /* synthetic */ int[] d;
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[com.facetec.sdk.cc.values().length];
            d = iArr;
            try {
                iArr[com.facetec.sdk.cc.UNKNOWN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                d[com.facetec.sdk.cc.STARTING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                d[com.facetec.sdk.cc.SCANNING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                d[com.facetec.sdk.cc.WEAK_CONNECTION.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                d[com.facetec.sdk.cc.FINISHED_WITH_SUCCESS.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                d[com.facetec.sdk.cc.FINISHED_WITH_ERROR.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                d[com.facetec.sdk.cc.SKIPPED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                d[com.facetec.sdk.cc.DISABLED.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[com.facetec.sdk.cz.values().length];
            e = iArr2;
            try {
                iArr2[com.facetec.sdk.cz.UNKNOWN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                e[com.facetec.sdk.cz.IDSCAN_RETRY_FACE_DID_NOT_MATCH.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                e[com.facetec.sdk.cz.IDSCAN_RETRY_ID_NOT_FULLY_VISIBLE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                e[com.facetec.sdk.cz.IDSCAN_RETRY_OCR_RESULTS_NOT_GOOD_ENOUGH.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                e[com.facetec.sdk.cz.IDSCAN_RETRY_ID_TYPE_NOT_SUPPORTED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                e[com.facetec.sdk.cz.IDSCAN_RETRY_BARCODE_NOT_READ.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                e[com.facetec.sdk.cz.IDSCAN_RETRY_USER_CONFIRMATION.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                e[com.facetec.sdk.cz.IDSCAN_SKIP_OR_ERROR_NFC.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                e[com.facetec.sdk.cz.IDSCAN_SUCCESS_FRONT_SIDE.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                e[com.facetec.sdk.cz.IDSCAN_SUCCESS_FRONT_SIDE_BACK_NEXT.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                e[com.facetec.sdk.cz.IDSCAN_SUCCESS_FRONT_SIDE_NFC_NEXT.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                e[com.facetec.sdk.cz.IDSCAN_SUCCESS_BACK_SIDE.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                e[com.facetec.sdk.cz.IDSCAN_SUCCESS_BACK_SIDE_NFC_NEXT.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            try {
                e[com.facetec.sdk.cz.IDSCAN_SUCCESS_PASSPORT.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
            try {
                e[com.facetec.sdk.cz.IDSCAN_SUCCESS_PASSPORT_NFC_NEXT.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused23) {
            }
            try {
                e[com.facetec.sdk.cz.IDSCAN_SUCCESS_USER_CONFIRMATION.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused24) {
            }
            try {
                e[com.facetec.sdk.cz.IDSCAN_SUCCESS_NFC.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused25) {
            }
            try {
                e[com.facetec.sdk.cz.IDSCAN_SUCCESS_ADDITIONAL_REVIEW.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused26) {
            }
            int[] iArr3 = new int[com.facetec.sdk.dp.d.values().length];
            b = iArr3;
            try {
                iArr3[com.facetec.sdk.dp.d.RESOURCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused27) {
            }
            try {
                b[com.facetec.sdk.dp.d.COLOR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused28) {
            }
        }
    }

    static boolean bm() {
        if (com.facetec.sdk.FaceTecSDK.f3366a.f3361o.d != com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.DISABLED) {
            int i2 = h + 79;
            f = i2 % 128;
            if (i2 % 2 == 0) {
                com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation buttonLocation = com.facetec.sdk.FaceTecSDK.f3366a.f3361o.d;
                com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation buttonLocation2 = com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM;
                java.lang.Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (com.facetec.sdk.FaceTecSDK.f3366a.f3361o.d != com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM) {
                return true;
            }
        }
        h = (f + 111) % 128;
        return false;
    }

    static void bt() {
        f = (h + 101) % 128;
        b(com.facetec.sdk.gj.AnonymousClass19.a(), -1814743289, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[]{false}, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 1814743322);
        h(false);
        i(false);
        j(false);
        if (!com.facetec.sdk.FaceTecSDK.f3366a.enableOfficialIDPhoto) {
            h = (f + 121) % 128;
            ca();
        }
        b(com.facetec.sdk.gj.AnonymousClass19.a(), -2139918444, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 2139918480);
        int i2 = h + 45;
        f = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 96 / 0;
        }
    }

    private static /* synthetic */ java.lang.Object r(java.lang.Object[] objArr) {
        boolean booleanValue = ((java.lang.Boolean) objArr[0]).booleanValue();
        f = (h + 5) % 128;
        java.lang.String c2 = c(false, booleanValue);
        java.lang.String b2 = b(false, booleanValue);
        if (c2.length() > 30) {
            d("Ready Screen Header Line 1");
        }
        if (b2.length() > 30) {
            d("Ready Screen Header Line 2");
        }
        int i2 = f + 77;
        h = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        throw null;
    }

    static void h(boolean z) {
        java.lang.String a2 = a(false, z);
        java.lang.String e2 = e(false, z);
        if (a2.length() > 50) {
            d("Ready Screen Subtext Line 1");
            h = (f + 59) % 128;
        }
        if (e2.length() > 50) {
            int i2 = f + 103;
            h = i2 % 128;
            if (i2 % 2 == 0) {
                d("Ready Screen Subtext Line 2");
            } else {
                d("Ready Screen Subtext Line 2");
                throw null;
            }
        }
    }

    static void i(boolean z) {
        java.lang.Object[] objArr = {false, java.lang.Boolean.valueOf(z)};
        java.lang.String str = (java.lang.String) b(com.facetec.sdk.gj.AnonymousClass19.a(), 372156401, com.facetec.sdk.gj.AnonymousClass19.a(), objArr, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -372156376);
        if (str.length() <= 30) {
            if (str.length() > 20) {
                a("Retry Screen Header");
                return;
            }
            return;
        }
        f = (h + 97) % 128;
        d("Retry Screen Header");
        int i2 = f + 69;
        h = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void j(boolean z) {
        f = (h + 29) % 128;
        if (h(false, z).length() > 40) {
            d("Retry Screen Sub-Header Message");
        }
        int i2 = f + 89;
        h = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static void ca() {
        h = (f + 45) % 128;
        java.lang.String c2 = c(false);
        java.lang.String a2 = a(false);
        java.lang.String str = (java.lang.String) b(com.facetec.sdk.gj.AnonymousClass19.a(), 1345253994, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[]{false}, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -1345253982);
        if (c2 != null && c2.length() > 40) {
            int i2 = f + 67;
            h = i2 % 128;
            if (i2 % 2 != 0) {
                d("Retry Screen Instruction Message 1");
                int i3 = 51 / 0;
            } else {
                d("Retry Screen Instruction Message 1");
            }
        }
        if (a2 != null && a2.length() > 40) {
            d("Retry Screen Instruction Message 2");
        }
        if (str == null || str.length() <= 40) {
            return;
        }
        d("Retry Screen Instruction Message 3");
        f = (h + 109) % 128;
    }

    private static /* synthetic */ java.lang.Object p(java.lang.Object[] objArr) {
        f = (h + 31) % 128;
        java.lang.String str = (java.lang.String) b(com.facetec.sdk.gj.AnonymousClass19.a(), -1728136911, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[]{false}, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 1728136916);
        java.lang.String d2 = d(false);
        java.lang.Object obj = null;
        if (str != null && str.length() > 21) {
            int i2 = f + 115;
            h = i2 % 128;
            if (i2 % 2 == 0) {
                d("Retry Screen Your Image Label");
            } else {
                d("Retry Screen Your Image Label");
                obj.hashCode();
                throw null;
            }
        }
        if (d2 != null) {
            int i3 = h + 15;
            f = i3 % 128;
            if (i3 % 2 != 0 ? d2.length() > 21 : d2.length() > 92) {
                d("Retry Screen Ideal Image Label");
            }
        }
        int i4 = h + 77;
        f = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 27 / 0;
        }
        return null;
    }

    private static void a(java.lang.String str) {
        f = (h + 43) % 128;
        com.facetec.sdk.at.a(java.lang.String.format(java.util.Locale.getDefault(), "Your %s text has been configured to use more than %d characters.  %d or less characters is recommended for this text in order to render well on all devices and OS versions.", str, 20, 20));
        h = (f + 91) % 128;
    }

    private static void d(java.lang.String str) {
        java.lang.String format;
        int i2 = f + 95;
        h = i2 % 128;
        if (i2 % 2 != 0) {
            java.util.Locale locale = java.util.Locale.getDefault();
            java.lang.Object[] objArr = new java.lang.Object[0];
            objArr[1] = str;
            format = java.lang.String.format(locale, "FaceTec SDK Text Customization Alert: Your text is too long for the %s text element to render correctly on a significant portion of supported devices. Please update this text string to short, concise text, based on our default text element for optimal User Experience and Success Rates. If you continue with too many characters, the FaceTec SDK will not show the excess characters, and this will likely impact User Experience and Success Rates. These character limitations must be in place to ensure compatibility with the 1,000,000+ Device/Model/Platform/Version/Screen Size/Camera Res combinations that FaceTec supports.", objArr);
        } else {
            format = java.lang.String.format(java.util.Locale.getDefault(), "FaceTec SDK Text Customization Alert: Your text is too long for the %s text element to render correctly on a significant portion of supported devices. Please update this text string to short, concise text, based on our default text element for optimal User Experience and Success Rates. If you continue with too many characters, the FaceTec SDK will not show the excess characters, and this will likely impact User Experience and Success Rates. These character limitations must be in place to ensure compatibility with the 1,000,000+ Device/Model/Platform/Version/Screen Size/Camera Res combinations that FaceTec supports.", str);
        }
        com.facetec.sdk.at.a(format);
        h = (f + 95) % 128;
    }

    private static boolean ci() {
        if (new com.facetec.sdk.FaceTecIDScanCustomization().idFeedbackScreenForegroundColor != com.facetec.sdk.FaceTecSDK.f3366a.i.idFeedbackScreenForegroundColor) {
            return false;
        }
        int i2 = h;
        f = (i2 + 75) % 128;
        f = (i2 + 95) % 128;
        return true;
    }

    private static android.graphics.drawable.GradientDrawable d(android.content.Context context, android.graphics.drawable.GradientDrawable gradientDrawable) {
        int i2 = h + 47;
        f = i2 % 128;
        int m = m(context);
        if (i2 % 2 != 0) {
            return com.facetec.sdk.dp.c(context, gradientDrawable, m);
        }
        com.facetec.sdk.dp.c(context, gradientDrawable, m);
        throw null;
    }

    private static /* synthetic */ java.lang.Object o(java.lang.Object[] objArr) {
        android.view.View view = (android.view.View) objArr[0];
        int intValue = ((java.lang.Number) objArr[1]).intValue();
        int i2 = f + 23;
        h = i2 % 128;
        if (i2 % 2 == 0) {
            com.facetec.sdk.dp.a(view, intValue, m(view.getContext()));
            f = (h + 81) % 128;
            return null;
        }
        com.facetec.sdk.dp.a(view, intValue, m(view.getContext()));
        throw null;
    }

    static int d(android.content.Context context, int i2) {
        f = (h + 43) % 128;
        int b2 = com.facetec.sdk.dp.b(context, i2, m(context));
        h = (f + 75) % 128;
        return b2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if ((r3 % 2) == 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int c(int i2, int i3) {
        int i4 = 0;
        if (i2 == -1) {
            int i5 = h + 49;
            f = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 / 0;
            }
            i2 = i3;
        }
        int i7 = h;
        if (i2 == 0) {
            int i8 = i7 + 89;
            f = i8 % 128;
        } else {
            f = (i7 + 81) % 128;
        }
        i4 = 1;
        int max = java.lang.Math.max(i4, java.lang.Math.round(i2 * a()));
        f = (h + 19) % 128;
        return max;
    }

    private static int b(int i2, int i3) {
        int i4 = f + 113;
        int i5 = i4 % 128;
        h = i5;
        if (i4 % 2 != 0) {
            throw null;
        }
        if (i2 == 0) {
            return i3;
        }
        int i6 = i5 + 83;
        f = i6 % 128;
        if (i6 % 2 != 0) {
            return i2;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object h(java.lang.Object[] objArr) {
        java.lang.Object obj = objArr[0];
        java.lang.Object obj2 = objArr[1];
        int i2 = h + 59;
        int i3 = i2 % 128;
        f = i3;
        if (i2 % 2 == 0) {
            java.lang.Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        if (obj != null) {
            return obj;
        }
        h = (i3 + 71) % 128;
        return obj2;
    }

    static boolean d(android.content.Context context, java.util.List<java.lang.Integer> list) {
        if (list.size() >= 2) {
            for (int i2 = 1; i2 < list.size(); i2++) {
                f = (h + 121) % 128;
                int e2 = com.facetec.sdk.dp.e(context, list.get(i2 - 1).intValue());
                int e3 = com.facetec.sdk.dp.e(context, list.get(i2).intValue());
                if (java.lang.Math.abs(android.graphics.Color.red(e2) - android.graphics.Color.red(e3)) + java.lang.Math.abs(android.graphics.Color.green(e2) - android.graphics.Color.green(e3)) + java.lang.Math.abs(android.graphics.Color.blue(e2) - android.graphics.Color.blue(e3)) > 30) {
                    return false;
                }
            }
            return true;
        }
        h = (f + 113) % 128;
        return false;
    }

    public static /* synthetic */ java.lang.Object b(int i2, int i3, int i4, java.lang.Object[] objArr, int i5, int i6, int i7) {
        int i8 = ~i2;
        int i9 = ~(i8 | i7);
        int i10 = (~(i3 | i2)) | i9;
        int i11 = (~(i2 | (~i7))) | (~((~i3) | i8)) | i9;
        int i12 = i8 | i3 | i7;
        int i13 = i3 + i7 + i4 + (1050315579 * i6) + (2086215248 * i5);
        int i14 = i13 * i13;
        int i15 = ((i3 * (-961373039)) - 1316831794) + ((-961373039) * i7) + (i10 * (-990)) + (i11 * com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.LastFrameStart) + (i12 * com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.LastFrameStart) + ((-961372049) * i4) + (755842709 * i6) + ((-1858722640) * i5) + ((-2040987648) * i14);
        int i16 = 0;
        switch ((i3 * (-1156115713)) + 1671168000 + (i7 * (-1156115713)) + (i10 * (-1856302338)) + (i11 * 1856302338) + (i12 * 1856302338) + (700186624 * i4) + ((-1303117824) * i6) + (314572800 * i5) + (i14 * 431423488) + (i15 * i15 * 1361641472)) {
            case 1:
                f = (h + 125) % 128;
                int i17 = bq().f.scrollIndicatorForegroundHighlightColor;
                f = (h + 67) % 128;
                return java.lang.Integer.valueOf(i17);
            case 2:
                return a(objArr);
            case 3:
                return d(objArr);
            case 4:
                android.widget.TextView textView = (android.widget.TextView) objArr[0];
                f = (h + 15) % 128;
                com.facetec.sdk.dp.e(textView, ((java.lang.Integer) b(com.facetec.sdk.gj.AnonymousClass19.a(), -571270936, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 571270947)).intValue());
                f = (h + 17) % 128;
                return null;
            case 5:
                boolean booleanValue = ((java.lang.Boolean) objArr[0]).booleanValue();
                java.lang.String d2 = com.facetec.sdk.dl.d(com.facetec.sdk.R.string.FaceTec_retry_your_image_label);
                if (booleanValue) {
                    f = (h + 15) % 128;
                    if (!com.facetec.sdk.FaceTecSDK.f3366a.e && d2.length() > 21) {
                        f = (h + 115) % 128;
                        java.lang.String substring = d2.substring(0, 21);
                        h = (f + 99) % 128;
                        return substring;
                    }
                }
                return d2;
            case 6:
                h = (f + 73) % 128;
                int i18 = bq().g.buttonBackgroundHighlightColor;
                h = (f + 67) % 128;
                return java.lang.Integer.valueOf(i18);
            case 7:
                com.facetec.sdk.cc ccVar = (com.facetec.sdk.cc) objArr[0];
                boolean booleanValue2 = ((java.lang.Boolean) objArr[1]).booleanValue();
                f = (h + 101) % 128;
                switch (com.facetec.sdk.dm.AnonymousClass5.d[ccVar.ordinal()]) {
                    case 1:
                        f = (h + 87) % 128;
                        return "";
                    case 2:
                        if (booleanValue2) {
                            return com.facetec.sdk.dl.d(com.facetec.sdk.R.string.FaceTec_idscan_nfc_card_status_starting_message);
                        }
                        java.lang.String d3 = com.facetec.sdk.dl.d(com.facetec.sdk.R.string.FaceTec_idscan_nfc_status_starting_message);
                        h = (f + 69) % 128;
                        return d3;
                    case 3:
                        return com.facetec.sdk.dl.d(com.facetec.sdk.R.string.FaceTec_idscan_nfc_status_scanning_message);
                    case 4:
                        return com.facetec.sdk.dl.d(com.facetec.sdk.R.string.FaceTec_idscan_nfc_status_weak_connection_message);
                    case 5:
                        return com.facetec.sdk.dl.d(com.facetec.sdk.R.string.FaceTec_idscan_nfc_status_finished_with_success_message);
                    case 6:
                        if (!booleanValue2) {
                            return com.facetec.sdk.dl.d(com.facetec.sdk.R.string.FaceTec_idscan_nfc_status_finished_with_error_message);
                        }
                        f = (h + 101) % 128;
                        return com.facetec.sdk.dl.d(com.facetec.sdk.R.string.FaceTec_idscan_nfc_card_status_finished_with_error_message);
                    case 7:
                        return com.facetec.sdk.dl.d(com.facetec.sdk.R.string.FaceTec_idscan_nfc_status_skipped_message);
                    case 8:
                        return com.facetec.sdk.dl.d(com.facetec.sdk.R.string.FaceTec_idscan_nfc_status_disabled_message);
                    default:
                        return null;
                }
            case 8:
                return b(objArr);
            case 9:
                return e(objArr);
            case 10:
                h = (f + 39) % 128;
                int[] iArr = bq().g.retryScreenSlideshowImages;
                if (iArr.length != 0) {
                    return iArr;
                }
                h = (f + 109) % 128;
                int[] iArr2 = com.facetec.sdk.FaceTecSDK.f3366a.g.retryScreenSlideshowImages;
                h = (f + 93) % 128;
                return iArr2;
            case 11:
                return c(objArr);
            case 12:
                boolean booleanValue3 = ((java.lang.Boolean) objArr[0]).booleanValue();
                h = (f + 61) % 128;
                java.lang.String d4 = com.facetec.sdk.dl.d(com.facetec.sdk.R.string.FaceTec_retry_instruction_message_3);
                if (!booleanValue3 || com.facetec.sdk.FaceTecSDK.f3366a.e || d4.length() <= 40) {
                    return d4;
                }
                java.lang.String substring2 = d4.substring(0, 40);
                h = (f + 61) % 128;
                return substring2;
            case 13:
                h = (f + 83) % 128;
                int b2 = b(bq().f3361o.customImage, com.facetec.sdk.FaceTecSDK.f3366a.f3361o.customImage);
                f = (h + 41) % 128;
                return java.lang.Integer.valueOf(b2);
            case 14:
                h = (f + 15) % 128;
                if (ci()) {
                    return java.lang.Integer.valueOf(bq().h.foregroundColor);
                }
                int i19 = bq().i.idFeedbackScreenForegroundColor;
                f = (h + 13) % 128;
                return java.lang.Integer.valueOf(i19);
            case 15:
                android.content.Context context = (android.content.Context) objArr[0];
                h = (f + 77) % 128;
                int e2 = com.facetec.sdk.dp.e(context, bE());
                h = (f + 61) % 128;
                return java.lang.Integer.valueOf(e2);
            case 16:
                return j(objArr);
            case 17:
                return h(objArr);
            case 18:
                h = (f + 17) % 128;
                float a2 = a();
                float b3 = b();
                if (com.facetec.sdk.dl.d(com.facetec.sdk.R.string.FaceTec_idscan_type_selection_header).length() > 36) {
                    int i20 = h + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                    f = i20 % 128;
                    i16 = i20 % 2 == 0 ? 102 : -4;
                }
                return java.lang.Integer.valueOf(java.lang.Math.round((i16 + 28) * a2 * b3));
            case 19:
                return g(objArr);
            case 20:
                return f(objArr);
            case 21:
                return i(objArr);
            case 22:
                return o(objArr);
            case 23:
                f = (h + 29) % 128;
                int c2 = c(com.facetec.sdk.FaceTecSDK.f3366a.f.mainHeaderDividerLineWidth, 2);
                f = (h + 21) % 128;
                return java.lang.Integer.valueOf(c2);
            case 24:
                return l(objArr);
            case 25:
                boolean booleanValue4 = ((java.lang.Boolean) objArr[0]).booleanValue();
                boolean booleanValue5 = ((java.lang.Boolean) objArr[1]).booleanValue();
                h = (f + 7) % 128;
                java.lang.String str = com.facetec.sdk.FaceTecSDK.f3366a.g.retryScreenHeaderAttributedString;
                if (!booleanValue5) {
                    h = (f + 113) % 128;
                    if (str.isEmpty()) {
                        str = com.facetec.sdk.dl.d(com.facetec.sdk.R.string.FaceTec_retry_header);
                    }
                }
                if (!booleanValue4 || com.facetec.sdk.FaceTecSDK.f3366a.e || str.length() <= 30) {
                    return str;
                }
                h = (f + 33) % 128;
                return str.substring(0, 30);
            case 26:
                int i21 = f + 17;
                h = i21 % 128;
                return java.lang.Integer.valueOf((int) (i21 % 2 != 0 ? java.lang.Math.min(java.lang.Math.max(com.facetec.sdk.FaceTecSDK.f3366a.h.resultAnimationDisplayTime, 1.5d), 3.0d) - 1000.0d : java.lang.Math.min(java.lang.Math.max(com.facetec.sdk.FaceTecSDK.f3366a.h.resultAnimationDisplayTime, 1.5d), 3.0d) * 1000.0d));
            case 27:
                f = (h + 73) % 128;
                int c3 = c(com.facetec.sdk.FaceTecSDK.f3366a.i.buttonBorderWidth, 0);
                h = (f + 97) % 128;
                return java.lang.Integer.valueOf(c3);
            case 28:
                return m(objArr);
            case 29:
                android.content.Context context2 = (android.content.Context) objArr[0];
                f = (h + 39) % 128;
                int e3 = com.facetec.sdk.dp.e(context2, cd());
                f = (h + 115) % 128;
                return java.lang.Integer.valueOf(e3);
            case 30:
                return n(objArr);
            case 31:
                return k(objArr);
            case 32:
                int i22 = h + 29;
                f = i22 % 128;
                return java.lang.Integer.valueOf((int) (i22 % 2 == 0 ? java.lang.Math.min(java.lang.Math.max(com.facetec.sdk.FaceTecSDK.f3366a.i.nfcScreenAnimationDisplayTime, 1.5d), 3.0d) / 1000.0d : java.lang.Math.min(java.lang.Math.max(com.facetec.sdk.FaceTecSDK.f3366a.i.nfcScreenAnimationDisplayTime, 1.5d), 3.0d) * 1000.0d));
            case 33:
                return r(objArr);
            case 34:
                return s(objArr);
            case 35:
                h = (f + 29) % 128;
                int c4 = c(com.facetec.sdk.FaceTecSDK.f3366a.f.buttonBorderWidth, 0);
                f = (h + 7) % 128;
                return java.lang.Integer.valueOf(c4);
            case 36:
                return p(objArr);
            case 37:
                return q(objArr);
            case 38:
                return t(objArr);
            case 39:
                h = (f + 117) % 128;
                int i23 = bq().h.activityIndicatorColor;
                h = (f + 121) % 128;
                return java.lang.Integer.valueOf(i23);
            case 40:
                return v(objArr);
            case 41:
                return w(objArr);
            case 42:
                return u(objArr);
            case 43:
                return y(objArr);
            case 44:
                return x(objArr);
            default:
                int i24 = h + 85;
                f = i24 % 128;
                return java.lang.Integer.valueOf(i24 % 2 == 0 ? c(com.facetec.sdk.FaceTecSDK.f3366a.g.buttonBorderWidth, 1) : c(com.facetec.sdk.FaceTecSDK.f3366a.g.buttonBorderWidth, 0));
        }
    }

    static void bs() {
        b = (char) 5788;
        c = (char) 3785;
        j = (char) 15529;
        i = (char) 63718;
    }

    private static <T> T e(T t, T t2) {
        return (T) b(com.facetec.sdk.gj.AnonymousClass19.a(), 613290749, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[]{t, t2}, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -613290732);
    }

    static void d(android.view.View view, int i2) {
        java.lang.Object[] objArr = {view, java.lang.Integer.valueOf(i2)};
        b(com.facetec.sdk.gj.AnonymousClass19.a(), -1818774409, com.facetec.sdk.gj.AnonymousClass19.a(), objArr, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 1818774431);
    }

    private static void cb() {
        b(com.facetec.sdk.gj.AnonymousClass19.a(), -2139918444, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 2139918480);
    }

    static void f(boolean z) {
        java.lang.Object[] objArr = {java.lang.Boolean.valueOf(z)};
        b(com.facetec.sdk.gj.AnonymousClass19.a(), -1814743289, com.facetec.sdk.gj.AnonymousClass19.a(), objArr, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 1814743322);
    }

    static java.lang.String c(com.facetec.sdk.cc ccVar, boolean z) {
        java.lang.Object[] objArr = {ccVar, java.lang.Boolean.valueOf(z)};
        return (java.lang.String) b(com.facetec.sdk.gj.AnonymousClass19.a(), 1451195755, com.facetec.sdk.gj.AnonymousClass19.a(), objArr, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -1451195748);
    }

    static int bn() {
        return ((java.lang.Integer) b(com.facetec.sdk.gj.AnonymousClass19.a(), 2112962249, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -2112962211)).intValue();
    }

    static int bj() {
        return ((java.lang.Integer) b(com.facetec.sdk.gj.AnonymousClass19.a(), 397802709, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -397802690)).intValue();
    }

    static java.lang.String b(boolean z) {
        java.lang.Object[] objArr = {java.lang.Boolean.valueOf(z)};
        return (java.lang.String) b(com.facetec.sdk.gj.AnonymousClass19.a(), -1728136911, com.facetec.sdk.gj.AnonymousClass19.a(), objArr, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 1728136916);
    }

    static java.lang.String e(boolean z) {
        java.lang.Object[] objArr = {java.lang.Boolean.valueOf(z)};
        return (java.lang.String) b(com.facetec.sdk.gj.AnonymousClass19.a(), 1345253994, com.facetec.sdk.gj.AnonymousClass19.a(), objArr, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -1345253982);
    }

    static java.lang.String d(boolean z, boolean z2) {
        java.lang.Object[] objArr = {java.lang.Boolean.valueOf(z), java.lang.Boolean.valueOf(z2)};
        return (java.lang.String) b(com.facetec.sdk.gj.AnonymousClass19.a(), 372156401, com.facetec.sdk.gj.AnonymousClass19.a(), objArr, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -372156376);
    }

    static void b(android.widget.TextView textView) {
        b(com.facetec.sdk.gj.AnonymousClass19.a(), 1682670321, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[]{textView}, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -1682670317);
    }

    static int l(android.content.Context context) {
        return ((java.lang.Integer) b(com.facetec.sdk.gj.AnonymousClass19.a(), -672508872, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[]{context}, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 672508915)).intValue();
    }

    static void b(android.view.View view) {
        b(com.facetec.sdk.gj.AnonymousClass19.a(), -1264052119, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[]{view}, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 1264052149);
    }

    private static int v(android.content.Context context) {
        return ((java.lang.Integer) b(com.facetec.sdk.gj.AnonymousClass19.a(), 1190349338, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[]{context}, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -1190349323)).intValue();
    }

    static int g(android.content.Context context) {
        return ((java.lang.Integer) b(com.facetec.sdk.gj.AnonymousClass19.a(), 817839405, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[]{context}, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -817839365)).intValue();
    }

    static int e(android.content.Context context) {
        return ((java.lang.Integer) b(com.facetec.sdk.gj.AnonymousClass19.a(), -454362248, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[]{context}, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 454362277)).intValue();
    }

    static int ba() {
        return ((java.lang.Integer) b(com.facetec.sdk.gj.AnonymousClass19.a(), 210173370, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -210173350)).intValue();
    }

    static int aY() {
        return ((java.lang.Integer) b(com.facetec.sdk.gj.AnonymousClass19.a(), -122880092, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 122880123)).intValue();
    }

    static int aU() {
        return ((java.lang.Integer) b(com.facetec.sdk.gj.AnonymousClass19.a(), 1872583944, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -1872583935)).intValue();
    }

    static int[] aR() {
        return (int[]) b(com.facetec.sdk.gj.AnonymousClass19.a(), -230834020, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 230834030);
    }

    static int aN() {
        return ((java.lang.Integer) b(com.facetec.sdk.gj.AnonymousClass19.a(), 1593082181, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -1593082147)).intValue();
    }

    static int aP() {
        return ((java.lang.Integer) b(com.facetec.sdk.gj.AnonymousClass19.a(), 958631300, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -958631287)).intValue();
    }

    static int aD() {
        return ((java.lang.Integer) b(com.facetec.sdk.gj.AnonymousClass19.a(), -1950723692, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 1950723694)).intValue();
    }

    private static int bU() {
        return ((java.lang.Integer) b(com.facetec.sdk.gj.AnonymousClass19.a(), -571270936, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 571270947)).intValue();
    }

    static int aF() {
        return ((java.lang.Integer) b(com.facetec.sdk.gj.AnonymousClass19.a(), -1553326369, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 1553326370)).intValue();
    }

    static int aw() {
        return ((java.lang.Integer) b(com.facetec.sdk.gj.AnonymousClass19.a(), -1969056405, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 1969056421)).intValue();
    }

    static int as() {
        return ((java.lang.Integer) b(com.facetec.sdk.gj.AnonymousClass19.a(), -1308371391, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 1308371412)).intValue();
    }

    static int an() {
        return ((java.lang.Integer) b(com.facetec.sdk.gj.AnonymousClass19.a(), 676273973, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -676273931)).intValue();
    }

    static int ah() {
        return ((java.lang.Integer) b(com.facetec.sdk.gj.AnonymousClass19.a(), 1648131984, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -1648131960)).intValue();
    }

    static int ae() {
        return ((java.lang.Integer) b(com.facetec.sdk.gj.AnonymousClass19.a(), -721444267, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 721444308)).intValue();
    }

    static int aa() {
        return ((java.lang.Integer) b(com.facetec.sdk.gj.AnonymousClass19.a(), 258885347, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -258885341)).intValue();
    }

    static int T() {
        return ((java.lang.Integer) b(com.facetec.sdk.gj.AnonymousClass19.a(), 267803742, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -267803698)).intValue();
    }

    static int W() {
        return ((java.lang.Integer) b(com.facetec.sdk.gj.AnonymousClass19.a(), 1666036405, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -1666036366)).intValue();
    }

    private static int bN() {
        return ((java.lang.Integer) b(com.facetec.sdk.gj.AnonymousClass19.a(), -1649048056, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 1649048093)).intValue();
    }

    private static int bG() {
        return ((java.lang.Integer) b(com.facetec.sdk.gj.AnonymousClass19.a(), 476507855, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -476507847)).intValue();
    }

    static int R() {
        return ((java.lang.Integer) b(com.facetec.sdk.gj.AnonymousClass19.a(), -2099501144, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 2099501158)).intValue();
    }

    private static int e(int i2) {
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(i2)};
        return ((java.lang.Integer) b(com.facetec.sdk.gj.AnonymousClass19.a(), -224477218, com.facetec.sdk.gj.AnonymousClass19.a(), objArr, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 224477221)).intValue();
    }

    static int p() {
        return ((java.lang.Integer) b(com.facetec.sdk.gj.AnonymousClass19.a(), 731013102, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -731013079)).intValue();
    }

    static int r() {
        return ((java.lang.Integer) b(com.facetec.sdk.gj.AnonymousClass19.a(), 2053843160, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -2053843125)).intValue();
    }

    static int t() {
        return ((java.lang.Integer) b(com.facetec.sdk.gj.AnonymousClass19.a(), -1664573873, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 1664573900)).intValue();
    }

    static int q() {
        return ((java.lang.Integer) b(com.facetec.sdk.gj.AnonymousClass19.a(), 1135720948, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -1135720948)).intValue();
    }

    static int l() {
        return ((java.lang.Integer) b(com.facetec.sdk.gj.AnonymousClass19.a(), 1907064309, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -1907064277)).intValue();
    }

    static int f() {
        return ((java.lang.Integer) b(com.facetec.sdk.gj.AnonymousClass19.a(), -519311050, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 519311076)).intValue();
    }

    static int i() {
        return ((java.lang.Integer) b(com.facetec.sdk.gj.AnonymousClass19.a(), 212228493, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -212228465)).intValue();
    }

    static int h() {
        return ((java.lang.Integer) b(com.facetec.sdk.gj.AnonymousClass19.a(), 2144492993, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -2144492975)).intValue();
    }
}
