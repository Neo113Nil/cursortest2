package com.facetec.sdk;

/* loaded from: classes8.dex */
public class w {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10;
    private static int $11;
    private static char f;
    private static int i;
    private static char j;
    private static char m;

    /* renamed from: o, reason: collision with root package name */
    private static char f3771o;
    java.util.List<java.util.List<java.lang.Integer>> e = new java.util.ArrayList();

    /* renamed from: a, reason: collision with root package name */
    int f3772a = 0;
    java.util.List<com.facetec.sdk.q> c = new java.util.ArrayList();
    java.util.List<java.util.List<java.lang.Integer>> b = new java.util.ArrayList();
    java.util.List<com.facetec.sdk.q> d = new java.util.ArrayList();
    java.util.List<java.util.List<java.util.List<java.lang.Integer>>> h = new java.util.ArrayList();
    java.util.List<java.util.List<java.lang.Integer>> g = new java.util.ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$e(int i2, byte b, byte b2) {
        int i3;
        int i4 = 113 - b;
        int i5 = b2 * 4;
        byte[] bArr = $$c;
        int i6 = (i2 * 2) + 4;
        byte[] bArr2 = new byte[1 - i5];
        int i7 = 0 - i5;
        if (bArr == null) {
            int i8 = i6;
            i4 = i7;
            int i9 = 0;
            i6++;
            i4 += i8;
            i3 = i9;
            bArr2[i3] = (byte) i4;
            i9 = i3 + 1;
            if (i3 == i7) {
                return new java.lang.String(bArr2, 0);
            }
            i8 = bArr[i6];
            i6++;
            i4 += i8;
            i3 = i9;
            bArr2[i3] = (byte) i4;
            i9 = i3 + 1;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i4;
            i9 = i3 + 1;
            if (i3 == i7) {
            }
        }
    }

    static void init$0() {
        $$a = new byte[]{com.google.common.base.Ascii.EM, 104, com.google.common.base.Ascii.SI, -25};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE;
    }

    static void init$1() {
        $$c = new byte[]{5, com.google.common.base.Ascii.RS, -111, 10};
        $$d = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_REJECTED_REC_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void n(int i2, int i3, short s, java.lang.Object[] objArr) {
        int i4;
        int i5 = s * 4;
        int i6 = 3 - (i3 * 2);
        int i7 = i2 + 97;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i5];
        if (bArr == null) {
            int i8 = i6;
            int i9 = 0;
            i7 += -i6;
            i6 = i8;
            i4 = i9;
            bArr2[i4] = (byte) i7;
            if (i4 == 0 - i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i10 = i6 + 1;
            int i11 = i4 + 1;
            i8 = i10;
            i6 = bArr[i10];
            i9 = i11;
            i7 += -i6;
            i6 = i8;
            i4 = i9;
            bArr2[i4] = (byte) i7;
            if (i4 == 0 - i5) {
            }
        } else {
            i4 = 0;
            bArr2[i4] = (byte) i7;
            if (i4 == 0 - i5) {
            }
        }
    }

    w() {
    }

    private static void k(java.lang.String str, int i2, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            $11 = ($10 + 1) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.facetec.sdk.ho hoVar = new com.facetec.sdk.ho();
        char[] cArr3 = new char[cArr2.length];
        hoVar.b = 0;
        char[] cArr4 = new char[2];
        while (hoVar.b < cArr2.length) {
            cArr4[0] = cArr2[hoVar.b];
            cArr4[1] = cArr2[hoVar.b + 1];
            int i3 = 58224;
            for (int i4 = 0; i4 < 16; i4++) {
                $10 = ($11 + 29) % 128;
                char c = cArr4[1];
                char c2 = cArr4[0];
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf(((c2 << 4) + ((char) (f3771o ^ 2174069992062419062L))) ^ r14), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(m)};
                    int i5 = c2 + i3;
                    java.lang.Object d = com.facetec.sdk.al.d(1497828241);
                    if (d == null) {
                        d = com.facetec.sdk.al.c((char) android.text.TextUtils.indexOf("", ""), android.view.KeyEvent.getDeadChar(0, 0) + 211, android.graphics.Color.argb(0, 0, 0, 0) + 23, -22515351, false, lib.android.paypal.com.magnessdk.g.n2, new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) d).invoke(null, objArr2)).charValue();
                    cArr4[1] = charValue;
                    java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(cArr4[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (j ^ 2174069992062419062L))) ^ r13), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(f)};
                    int i6 = charValue + i3;
                    java.lang.Object d2 = com.facetec.sdk.al.d(1497828241);
                    if (d2 == null) {
                        d2 = com.facetec.sdk.al.c((char) android.text.TextUtils.indexOf("", "", 0), 211 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 23 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -22515351, false, lib.android.paypal.com.magnessdk.g.n2, new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                    }
                    cArr4[0] = ((java.lang.Character) ((java.lang.reflect.Method) d2).invoke(null, objArr3)).charValue();
                    i3 -= 40503;
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
            java.lang.Object d3 = com.facetec.sdk.al.d(-2113314280);
            if (d3 == null) {
                byte b = (byte) 0;
                byte b2 = (byte) (b + 1);
                d3 = com.facetec.sdk.al.c((char) (31540 - android.os.Process.getGidForName("")), 1913 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 22, 635836640, false, $$e(b, b2, (byte) (b2 - 1)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
            }
            ((java.lang.reflect.Method) d3).invoke(null, objArr4);
            $11 = ($10 + 23) % 128;
        }
        java.lang.String str2 = new java.lang.String(cArr3, 0, i2);
        int i7 = $10 + 117;
        $11 = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    private static void l(boolean z, int i2, java.lang.String str, int i3, int i4, java.lang.Object[] objArr) {
        char[] charArray = str != null ? str.toCharArray() : str;
        com.facetec.sdk.hp hpVar = new com.facetec.sdk.hp();
        char[] cArr = new char[i2];
        hpVar.d = 0;
        while (hpVar.d < i2) {
            $10 = ($11 + 73) % 128;
            hpVar.b = charArray[hpVar.d];
            cArr[hpVar.d] = (char) (i3 + hpVar.b);
            int i5 = hpVar.d;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i5]), java.lang.Integer.valueOf(i)};
                java.lang.Object d = com.facetec.sdk.al.d(-1738479149);
                if (d == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    d = com.facetec.sdk.al.c((char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + com.google.common.base.Ascii.RS), 730 - android.widget.ExpandableListView.getPackedPositionGroup(0L), 24 - (android.view.ViewConfiguration.getTouchSlop() >> 8), 1066373931, false, $$e(b, b2, b2), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                }
                cArr[i5] = ((java.lang.Character) ((java.lang.reflect.Method) d).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr3 = {hpVar, hpVar};
                java.lang.Object d2 = com.facetec.sdk.al.d(1965925374);
                if (d2 == null) {
                    d2 = com.facetec.sdk.al.c((char) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 24338), 1621 - android.graphics.Color.alpha(0), android.view.View.getDefaultSize(0, 0) + 24, -758982394, false, "v", new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d2).invoke(null, objArr3);
                int i6 = $11 + 19;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 3 / 2;
                }
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i4 > 0) {
            $10 = ($11 + 111) % 128;
            hpVar.f3630a = i4;
            char[] cArr2 = new char[i2];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i2);
            java.lang.System.arraycopy(cArr2, 0, cArr, i2 - hpVar.f3630a, hpVar.f3630a);
            java.lang.System.arraycopy(cArr2, hpVar.f3630a, cArr, 0, i2 - hpVar.f3630a);
        }
        if (z) {
            char[] cArr3 = new char[i2];
            hpVar.d = 0;
            while (hpVar.d < i2) {
                cArr3[hpVar.d] = cArr[(i2 - hpVar.d) - 1];
                java.lang.Object[] objArr4 = {hpVar, hpVar};
                java.lang.Object d3 = com.facetec.sdk.al.d(1965925374);
                if (d3 == null) {
                    d3 = com.facetec.sdk.al.c((char) (24337 - android.view.MotionEvent.axisFromString("")), 1621 - android.text.TextUtils.indexOf("", ""), 24 - android.text.TextUtils.indexOf("", ""), -758982394, false, "v", new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d3).invoke(null, objArr4);
            }
            cArr = cArr3;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        i = 780577528;
        j = (char) 4683;
        f = (char) 4450;
        f3771o = (char) 64952;
        m = (char) 48824;
    }

    /* JADX WARN: Code restructure failed: missing block: B:273:0x14be, code lost:
    
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x14cd, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x14c3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:284:0x1596  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x15eb A[Catch: IOException -> 0x1580, Exception -> 0x15cd, all -> 0x192c, TRY_ENTER, TRY_LEAVE, TryCatch #11 {, blocks: (B:220:0x117f, B:223:0x11cd, B:225:0x11df, B:236:0x1909, B:238:0x190f, B:239:0x1910, B:241:0x124f, B:250:0x12ae, B:263:0x134a, B:280:0x157c, B:282:0x1588, B:286:0x1598, B:289:0x1911, B:290:0x192b, B:291:0x15d5, B:293:0x15eb, B:294:0x161a, B:296:0x162c, B:298:0x1668, B:300:0x168d, B:302:0x16f7, B:304:0x1717, B:306:0x174e, B:309:0x1756, B:349:0x189d, B:350:0x18a0, B:408:0x18ba, B:410:0x18c1, B:411:0x18c2, B:419:0x18cf, B:421:0x18d5, B:422:0x18d6, B:434:0x18e8, B:436:0x18ee, B:437:0x18ef), top: B:219:0x117f }] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x1668 A[Catch: IOException -> 0x1839, all -> 0x192c, TryCatch #0 {IOException -> 0x1839, blocks: (B:282:0x1588, B:291:0x15d5, B:294:0x161a, B:296:0x162c, B:298:0x1668, B:300:0x168d, B:302:0x16f7, B:304:0x1717, B:306:0x174e), top: B:281:0x1588 }] */
    /* JADX WARN: Removed duplicated region for block: B:436:0x18ee A[Catch: Exception -> 0x1911, all -> 0x192c, IOException -> 0x1933, TryCatch #4 {IOException -> 0x1933, blocks: (B:236:0x1909, B:238:0x190f, B:239:0x1910, B:289:0x1911, B:290:0x192b, B:349:0x189d, B:350:0x18a0, B:408:0x18ba, B:410:0x18c1, B:411:0x18c2, B:419:0x18cf, B:421:0x18d5, B:422:0x18d6, B:434:0x18e8, B:436:0x18ee, B:437:0x18ef), top: B:222:0x11cd }] */
    /* JADX WARN: Removed duplicated region for block: B:437:0x18ef A[Catch: Exception -> 0x1911, all -> 0x192c, IOException -> 0x1933, TryCatch #4 {IOException -> 0x1933, blocks: (B:236:0x1909, B:238:0x190f, B:239:0x1910, B:289:0x1911, B:290:0x192b, B:349:0x189d, B:350:0x18a0, B:408:0x18ba, B:410:0x18c1, B:411:0x18c2, B:419:0x18cf, B:421:0x18d5, B:422:0x18d6, B:434:0x18e8, B:436:0x18ee, B:437:0x18ef), top: B:222:0x11cd }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x19be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x19bf  */
    /* JADX WARN: Type inference failed for: r13v110 */
    /* JADX WARN: Type inference failed for: r13v112 */
    /* JADX WARN: Type inference failed for: r13v49 */
    /* JADX WARN: Type inference failed for: r13v50 */
    /* JADX WARN: Type inference failed for: r13v51 */
    /* JADX WARN: Type inference failed for: r13v52 */
    /* JADX WARN: Type inference failed for: r13v56 */
    /* JADX WARN: Type inference failed for: r13v87 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v20, types: [int] */
    /* JADX WARN: Type inference failed for: r15v46 */
    /* JADX WARN: Type inference failed for: r15v64 */
    /* JADX WARN: Type inference failed for: r15v66 */
    /* JADX WARN: Type inference failed for: r6v239, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v244, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r7v357, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v358 */
    /* JADX WARN: Type inference failed for: r7v359 */
    /* JADX WARN: Type inference failed for: r7v361, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v365, types: [java.lang.reflect.Method] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] c(android.content.Context context, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        char c;
        java.lang.Object[] objArr;
        int i8;
        int i9;
        int i10;
        java.lang.Object[] objArr2;
        int i11;
        int i12;
        java.lang.Object[] objArr3;
        int i13;
        java.lang.Object[] objArr4;
        int i14;
        java.lang.Object[] objArr5;
        char c2;
        java.lang.Object[] objArr6;
        char c3;
        int length;
        java.lang.Object obj;
        java.util.Iterator it;
        java.lang.String str;
        java.lang.String str2;
        java.lang.Object obj2;
        int i15;
        int i16;
        java.lang.String[] split;
        int length2;
        int i17;
        java.lang.String[] strArr;
        int i18;
        int i19;
        ?? r15;
        int i20;
        ?? r13;
        java.lang.String str3;
        java.lang.Process exec;
        java.lang.Throwable th;
        java.lang.Object newInstance;
        java.lang.Throwable th2;
        java.lang.Throwable cause;
        java.lang.Object[] objArr7;
        java.lang.Object d;
        java.lang.Object newInstance2;
        java.lang.Object obj3;
        ?? r7;
        java.lang.InterruptedException interruptedException;
        java.lang.Throwable th3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.Object d2;
        java.lang.Object d3;
        int length3;
        int i21;
        int i22;
        java.lang.String str6;
        int i23;
        int i24;
        java.lang.String str7;
        java.lang.String str8;
        int i25;
        int i26;
        long j2;
        java.lang.Object[] objArr8;
        int i27;
        long j3;
        long j4;
        int i28;
        java.lang.Object[] objArr9;
        char c4;
        java.lang.Object[] objArr10;
        char c5;
        java.lang.Object[] objArr11;
        char c6;
        int i29 = i4;
        java.lang.Object[] objArr12 = new java.lang.Object[1];
        k("䒝尥捄㏡̘吩\ueb55憜␛ᅱ쒩瓫핤玻씌Ƕꐺ溼畅ଳ≸\u12b1Ꙍ豒㴂\u0b0e៸┘몣鰱殄㬐ꯐ뽷", 34 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr12);
        java.lang.String str9 = (java.lang.String) objArr12[0];
        int i30 = -(-(android.view.ViewConfiguration.getTouchSlop() >> 8));
        int i31 = -(-(android.view.ViewConfiguration.getTouchSlop() >> 8));
        int i32 = -(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1));
        java.lang.Object[] objArr13 = new java.lang.Object[1];
        l(false, (i30 ^ 7) + ((i30 & 7) << 1), "￡\u0006\u000f\u0001\ufffe\u0011\ufffe", (i31 & 100) + (i31 | 100), ((i32 | 4) << 1) - (i32 ^ 4), objArr13);
        java.lang.String str10 = (java.lang.String) objArr13[0];
        int pressedStateDuration = android.view.ViewConfiguration.getPressedStateDuration();
        int i33 = -(android.os.Process.myTid() >> 22);
        java.lang.Object[] objArr14 = new java.lang.Object[1];
        l(true, 16 - (pressedStateDuration >> 16), "\u0002\u0017\u0002\u000b\u0005\u0002\u0006\u0013\t\ufff5ￏ\b\u000f\u0002\rￏ", ((i33 | 96) << 1) - (i33 ^ 96), 3 - (~(android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), objArr14);
        java.lang.String str11 = (java.lang.String) objArr14[0];
        try {
            if (context == null) {
                int i34 = -(-android.widget.ExpandableListView.getPackedPositionType(0L));
                int i35 = -android.graphics.Color.rgb(0, 0, 0);
                int blue = android.graphics.Color.blue(0);
                java.lang.Object[] objArr15 = new java.lang.Object[1];
                l(true, (i34 ^ 12) + ((i34 & 12) << 1), "￩\ufff3\uffef\u0014\u0013\u0005\u0015\u0007ￏ\u000f\u0006\u000e", ((-16777119) ^ i35) + ((i35 & (-16777119)) << 1), ((blue | 9) << 1) - (blue ^ 9), objArr15);
                java.lang.Object[] objArr16 = {(java.lang.String) objArr15[0]};
                java.lang.Object d4 = com.facetec.sdk.al.d(2084539986);
                if (d4 == null) {
                    char packedPositionGroup = (char) (android.widget.ExpandableListView.getPackedPositionGroup(0L) + 6935);
                    long uptimeMillis = android.os.SystemClock.uptimeMillis();
                    int size = android.view.View.MeasureSpec.getSize(0);
                    byte length4 = (byte) $$a.length;
                    byte b = (byte) (length4 - 4);
                    java.lang.Object[] objArr17 = new java.lang.Object[1];
                    n(length4, b, b, objArr17);
                    d4 = com.facetec.sdk.al.c(packedPositionGroup, 2390 - (uptimeMillis > 0L ? 1 : (uptimeMillis == 0L ? 0 : -1)), size + 23, -607062870, false, (java.lang.String) objArr17[0], new java.lang.Class[]{java.lang.String.class});
                }
                long longValue = ((java.lang.Long) ((java.lang.reflect.Method) d4).invoke(null, objArr16)).longValue();
                long j5 = -440599557;
                long j6 = -575;
                long j7 = 576;
                long j8 = -1;
                long j9 = j5 ^ j8;
                long j10 = longValue ^ j8;
                long j11 = (j9 | j10) ^ j8;
                long j12 = (int) java.lang.Runtime.getRuntime().totalMemory();
                long j13 = (j6 * j5) + (j6 * longValue) + ((j11 | ((j10 | j12) ^ j8)) * j7) + (((((j10 | (j12 ^ j8)) | j5) ^ j8) | ((j9 | longValue) ^ j8)) * j7) + (j11 * j7) + 1412748899;
                int i36 = ~((int) java.lang.Runtime.getRuntime().freeMemory());
                int i37 = ((int) (j13 >> 32)) & ((((~(1463421476 | i36)) | 8762457) * (-160)) + 620017354 + (((~(i36 | 26195065)) | 1463421476) * 160));
                int i38 = ~i2;
                int i39 = ((int) j13) & (((((~(2123697896 | i38)) | (~((-1444218561) | i2))) * (-831)) - 225774660) + ((~(2130690046 | i2)) * (-1662)) + (((~((-686471487) | i38)) | (~(686471486 | i2)) | (~((-2123697897) | i2))) * 831));
                if (((i39 ^ i37) | (i39 & i37)) != 0) {
                    objArr8 = new java.lang.Object[]{null, new int[]{i2 ^ 50}, new int[]{i2}, new int[1], null};
                    int freeMemory = (int) java.lang.Runtime.getRuntime().freeMemory();
                    int i40 = (~((-1060232953) | freeMemory)) | 320865008;
                    int i41 = (i40 * 992) + 85612477 + ((i40 | (~((~freeMemory) | (-3)))) * (-496)) + ((freeMemory | (-739367947)) * 496);
                    j2 = j8;
                    int i42 = (i41 ^ 16) + ((i41 & 16) << 1) + i4;
                    int i43 = i42 << 13;
                    int i44 = (i42 | i43) & (~(i43 & i42));
                    int i45 = i44 >>> 17;
                    int i46 = (i44 | i45) & (~(i44 & i45));
                    int i47 = i46 << 5;
                    int[] iArr = (int[]) objArr8[3];
                    int i48 = (i46 & (~i47)) | ((~i46) & i47);
                    i27 = 0;
                    iArr[0] = i48;
                } else {
                    j2 = j8;
                    objArr8 = new java.lang.Object[]{null, new int[]{i2}, new int[]{i2}, new int[]{r4}, null};
                    int i49 = (i4 - (~((((((-535063996) | r4) * (-814)) - 1963079685) + (((~(520382617 | i2)) | ((~(i38 | 199517611)) | 184836233)) * 407)) + ((((~((-520382618) | i2)) | 184836233) | (~((-199517612) | i2))) * 407)))) - 1;
                    int i50 = i49 << 13;
                    int i51 = (i49 | i50) & (~(i49 & i50));
                    int i52 = i51 >>> 17;
                    int i53 = (i51 & (~i52)) | ((~i51) & i52);
                    int i54 = i53 << 5;
                    int i55 = (i53 & (~i54)) | ((~i53) & i54);
                    i27 = 0;
                }
                if (((int[]) objArr8[1])[i27] != i2) {
                    return objArr8;
                }
                java.lang.Object[] objArr18 = new java.lang.Object[1];
                k("\uf067흂⸭⼨㖲⌙될\ue284梴袂׃볁ॸ䗛⊤휦ﰡᲫℵ밪", 19 - (~android.text.TextUtils.indexOf("", "", i27, i27)), objArr18);
                java.lang.Object[] objArr19 = {(java.lang.String) objArr18[i27]};
                java.lang.Object d5 = com.facetec.sdk.al.d(2084539986);
                if (d5 == null) {
                    char maximumFlingVelocity = (char) (6935 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16));
                    int scrollBarFadeDuration = android.view.ViewConfiguration.getScrollBarFadeDuration();
                    int scrollBarFadeDuration2 = android.view.ViewConfiguration.getScrollBarFadeDuration();
                    byte length5 = (byte) $$a.length;
                    byte b2 = (byte) (length5 - 4);
                    j3 = j7;
                    j4 = j6;
                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                    n(length5, b2, b2, objArr20);
                    d5 = com.facetec.sdk.al.c(maximumFlingVelocity, (scrollBarFadeDuration >> 16) + 2389, (scrollBarFadeDuration2 >> 16) + 23, -607062870, false, (java.lang.String) objArr20[0], new java.lang.Class[]{java.lang.String.class});
                } else {
                    j3 = j7;
                    j4 = j6;
                }
                long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) d5).invoke(null, objArr19)).longValue();
                long j14 = 820203756;
                long j15 = 464;
                long j16 = longValue2 ^ j2;
                long uptimeMillis2 = (int) android.os.SystemClock.uptimeMillis();
                long j17 = uptimeMillis2 ^ j2;
                long j18 = (j16 | j14) ^ j2;
                long j19 = (465 * j14) + ((-463) * longValue2) + ((((j16 | j17) ^ j2) | j18 | ((j17 | j14) ^ j2)) * j15) + ((-464) * ((j14 ^ j2) | uptimeMillis2 | j16)) + ((j18 | ((uptimeMillis2 | j14) ^ j2)) * j15) + 151945586;
                int i56 = ((int) (j19 >> 32)) & ((((271130912 | r2) * (-814)) - 1479252009) + (((~(629202501 | i2)) | (~((-808023910) | i38)) | 92309504) * 407) + (((~((-629202502) | i2)) | 92309504 | (~(808023909 | i2))) * 407));
                int nextInt = new java.util.Random().nextInt();
                int i57 = ~nextInt;
                int i58 = ((int) j19) & ((((~(1526548500 | i57)) | (~(89322090 | nextInt))) * 959) + 1994444757 + (((~(nextInt | 1526548500)) | (~(i57 | 89322090))) * 959));
                if (((i56 ^ i58) | (i56 & i58)) != 0) {
                    objArr9 = new java.lang.Object[]{null, new int[]{(i2 & (-61)) | (i38 & 60)}, new int[]{i2}, new int[1], null};
                    int myUid = android.os.Process.myUid();
                    int i59 = ((((~(184367578 | r4)) | (~((-505232585) | myUid))) * (-370)) - 1218167433) + (((~(myUid | 184367578)) | (~((~myUid) | (-505232585))) | 14680338) * (-370)) + 1136757764;
                    int i60 = -(-((i59 ^ 16) + ((i59 & 16) << 1)));
                    i28 = i4;
                    int i61 = (i28 ^ i60) + ((i60 & i28) << 1);
                    int i62 = (i61 << 13) ^ i61;
                    int i63 = i62 >>> 17;
                    int i64 = (i62 & (~i63)) | ((~i62) & i63);
                    int i65 = i64 << 5;
                    int[] iArr2 = (int[]) objArr9[3];
                    int i66 = (i64 & (~i65)) | ((~i64) & i65);
                    c4 = 0;
                    iArr2[0] = i66;
                } else {
                    i28 = i4;
                    objArr9 = new java.lang.Object[]{null, new int[]{i2}, new int[]{i2}, new int[1], null};
                    int nextInt2 = new java.util.Random().nextInt(17052377);
                    int i67 = ~nextInt2;
                    int i68 = (i28 - (~(-(-(((((((~((-637207264) | i67)) | 622919694) | (~(316342257 | i67))) * (-1136)) - 2111405883) + ((((~((-637207264) | nextInt2)) | (~(316342257 | nextInt2))) | (~((-302054689) | i67))) * (-568))) + (((~(nextInt2 | (-622919695))) | ((~(i67 | 637207263)) | (~((-316342258) | i67)))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION)))))) - 1;
                    int i69 = i68 << 13;
                    int i70 = (~(i68 & i69)) & (i68 | i69);
                    int i71 = i70 >>> 17;
                    int i72 = (~(i70 & i71)) & (i70 | i71);
                    int i73 = i72 << 5;
                    int[] iArr3 = (int[]) objArr9[3];
                    int i74 = (i72 & (~i73)) | ((~i72) & i73);
                    c4 = 0;
                    iArr3[0] = i74;
                }
                if (((int[]) objArr9[1])[c4] != i2) {
                    return objArr9;
                }
                int i75 = -(android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1));
                int packedPositionType = android.widget.ExpandableListView.getPackedPositionType(0L);
                int i76 = (packedPositionType * (-721)) - 69216;
                int i77 = ~packedPositionType;
                int i78 = ~((i77 & (-97)) | (i77 ^ (-97)));
                int i79 = (i78 ^ i38) | (i38 & i78);
                int i80 = ~(packedPositionType | 96);
                int i81 = ((i79 ^ i80) | (i79 & i80)) * 1444;
                int i82 = (i76 & i81) + (i76 | i81);
                int i83 = ~((packedPositionType ^ 96) | (packedPositionType & 96));
                int i84 = ~((packedPositionType ^ i2) | (packedPositionType & i2));
                int i85 = (i83 ^ i84) | (i83 & i84);
                int i86 = ~((i2 ^ 96) | (i2 & 96));
                int i87 = ((i85 ^ i86) | (i85 & i86)) * (-1444);
                int i88 = ((i82 | i87) << 1) - (i87 ^ i82);
                int i89 = ~((i77 & 96) | (i77 ^ 96));
                int i90 = ~((packedPositionType ^ (-97)) | (packedPositionType & (-97)));
                int i91 = ((i90 ^ i89) | (i90 & i89)) * 722;
                java.lang.Object[] objArr21 = new java.lang.Object[1];
                l(false, (i75 & 37) + (i75 | 37), "\u0010\u000eￏ\b\u0003\u0010\u0019ￏ\u0002\u000f\u0005\u0013\u0010\n\u0005\uffd0\u0017\u0007\u0014\u0000\u0005\u0002\u0015\u0002\uffd0\u0005\u0002\u0015\u0002\uffd0\u0005\u0002\u0015\u0002\uffd0\u0004", (i88 & i91) + (i91 | i88), 24 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr21);
                java.lang.Object[] objArr22 = {(java.lang.String) objArr21[0]};
                java.lang.Object d6 = com.facetec.sdk.al.d(1873189073);
                if (d6 == null) {
                    char c7 = (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 6936);
                    int size2 = android.view.View.MeasureSpec.getSize(0);
                    int resolveOpacity = android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                    byte b3 = (byte) 3;
                    byte b4 = (byte) (b3 - 3);
                    java.lang.Object[] objArr23 = new java.lang.Object[1];
                    n(b3, b4, b4, objArr23);
                    d6 = com.facetec.sdk.al.c(c7, 2389 - size2, resolveOpacity + 23, -934682071, false, (java.lang.String) objArr23[0], new java.lang.Class[]{java.lang.String.class});
                }
                long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) d6).invoke(null, objArr22)).longValue();
                long j20 = 215687343;
                long j21 = j20 ^ j2;
                long j22 = longValue3 ^ j2;
                long j23 = (j21 | j22) ^ j2;
                long elapsedRealtime = (int) android.os.SystemClock.elapsedRealtime();
                long j24 = (j4 * j20) + (j4 * longValue3) + ((j23 | ((j22 | elapsedRealtime) ^ j2)) * j3) + ((((longValue3 | j21) ^ j2) | ((j20 | (j22 | (elapsedRealtime ^ j2))) ^ j2)) * j3) + (j3 * j23) + 721392300;
                int i92 = ~((int) android.os.Process.getElapsedCpuTime());
                int i93 = ((int) (j24 >> 32)) & ((((~(1034550270 | i92)) * 52) - 1156428414) + (((~(950041006 | i92)) | (~((-487185405) | i92)) | 84509264) * (-52)) + (((~(i92 | (-950041007))) | 547364866) * 52));
                int i94 = ((int) j24) & ((((~((-83887233) | i38)) * 130) - 1895656277) + (((~((-83887233) | i2)) | 547365141) * 130));
                if (((i94 ^ i93) | (i94 & i93)) != 0) {
                    objArr10 = new java.lang.Object[]{null, new int[]{i2 ^ 80}, new int[]{i2}, new int[]{r1}, null};
                    int i95 = -(-((((~((-584300026) | i38)) | 550744289) * (-108)) + 635029791 + (((~((-905165032) | i2)) | (-938720768) | (~(905165031 | i38))) * 54) + (((-938720768) | i2) * 54) + 16));
                    int i96 = ((i28 | i95) << 1) - (i95 ^ i28);
                    int i97 = i96 << 13;
                    int i98 = ((~i97) & i96) | ((~i96) & i97);
                    int i99 = i98 ^ (i98 >>> 17);
                    int i100 = i99 ^ (i99 << 5);
                    c5 = 0;
                } else {
                    objArr10 = new java.lang.Object[]{null, new int[]{i2}, new int[]{i2}, new int[1], null};
                    int myUid2 = android.os.Process.myUid();
                    int i101 = i28 + ((((~(153020741 | r5)) | (~((-473885748) | myUid2))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) - 450818681) + (((~(myUid2 | 490663287)) | (~((~myUid2) | (-136243202)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE);
                    int i102 = i101 ^ (i101 << 13);
                    int i103 = i102 ^ (i102 >>> 17);
                    int i104 = i103 << 5;
                    int[] iArr4 = (int[]) objArr10[3];
                    int i105 = (i103 & (~i104)) | ((~i103) & i104);
                    c5 = 0;
                    iArr4[0] = i105;
                }
                if (((int[]) objArr10[1])[c5] != i2) {
                    return objArr10;
                }
                int i106 = -(android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
                java.lang.Object[] objArr24 = new java.lang.Object[1];
                k("ꊯ웈\uf292纛Ⴑꃶ泓ﾇ햫佾㚟緳嫐\ua7ce㘗퉗⼃쮲ॸ䗛㩘煿獆\udebb䣑얤㗅咋塃㝌聥霰ㄈ뜳䛳虨\ufdccˬￄ嚵\udba5㽹", (i106 & 42) + (i106 | 42), objArr24);
                java.lang.Object[] objArr25 = {(java.lang.String) objArr24[0]};
                java.lang.Object d7 = com.facetec.sdk.al.d(1873189073);
                if (d7 == null) {
                    char maximumFlingVelocity2 = (char) (6935 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16));
                    float maxVolume = android.media.AudioTrack.getMaxVolume();
                    int indexOf = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                    byte b5 = (byte) 3;
                    byte b6 = (byte) (b5 - 3);
                    java.lang.Object[] objArr26 = new java.lang.Object[1];
                    n(b5, b6, b6, objArr26);
                    d7 = com.facetec.sdk.al.c(maximumFlingVelocity2, 2390 - (maxVolume > 0.0f ? 1 : (maxVolume == 0.0f ? 0 : -1)), 22 - indexOf, -934682071, false, (java.lang.String) objArr26[0], new java.lang.Class[]{java.lang.String.class});
                }
                long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) d7).invoke(null, objArr25)).longValue();
                long j25 = -38152875;
                long j26 = 959;
                long j27 = longValue4 ^ j2;
                long nextInt3 = new java.util.Random().nextInt(1100019291);
                long j28 = nextInt3 ^ j2;
                long j29 = (960 * j25) + ((-1917) * longValue4) + ((((j27 | j28) ^ j2) | ((j25 | nextInt3) ^ j2)) * j26) + ((-959) * j27) + (j26 * (((j27 | nextInt3) ^ j2) | ((j28 | j25) ^ j2))) + 975232518;
                int i107 = ((int) (j29 >> 32)) & (((((2147221463 | i2) * (-381)) + 308485276) + (((~(1945875842 | i38)) | 1839917653) * 381)) - 2047591544);
                int nextInt4 = new java.util.Random().nextInt();
                int i108 = ((int) j29) & ((((1098925124 | r5) * (-814)) - 476248861) + (((~((-1200966767) | nextInt4)) | (~((~nextInt4) | 236259643)) | 134218001) * 407) + (((~(nextInt4 | 1200966766)) | 134218001 | (~((-236259644) | nextInt4))) * 407));
                if (((i107 ^ i108) | (i107 & i108)) != 0) {
                    objArr11 = new java.lang.Object[]{null, new int[]{(~(i2 & 90)) & (i2 | 90)}, new int[]{i2}, new int[1], null};
                    int i109 = ~new java.util.Random().nextInt(707800803);
                    int i110 = -(-((((~((-269769729) | i109)) | (~((-34316498) | i109))) * (-184)) + 1411246229 + (((~(i109 | (-278159119))) | (~((-42705888) | i109)) | 8389390) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + 1660938328));
                    int i111 = ((i4 | i110) << 1) - (i110 ^ i4);
                    int i112 = (i111 << 13) ^ i111;
                    int i113 = i112 >>> 17;
                    int i114 = (~(i112 & i113)) & (i112 | i113);
                    int i115 = i114 << 5;
                    int[] iArr5 = (int[]) objArr11[3];
                    int i116 = (~(i114 & i115)) & (i114 | i115);
                    c6 = 0;
                    iArr5[0] = i116;
                } else {
                    objArr11 = new java.lang.Object[]{null, new int[]{i2}, new int[]{i2}, new int[]{r1}, null};
                    int i117 = (((((~((-240585192) | i38)) | 169279713) | (~(80279814 | i38))) * 464) - 1046385891) + (((-71305479) | i2) * (-464)) + (((~(80279814 | i2)) | 169279713) * 464);
                    int i118 = (i4 & i117) + (i117 | i4);
                    int i119 = i118 << 13;
                    int i120 = ((~i119) & i118) | ((~i118) & i119);
                    int i121 = i120 >>> 17;
                    int i122 = (~(i120 & i121)) & (i120 | i121);
                    int i123 = i122 << 5;
                    int i124 = (~(i122 & i123)) & (i122 | i123);
                    c6 = 0;
                }
                if (((int[]) objArr11[1])[c6] != i2) {
                    return objArr11;
                }
                int i125 = -android.widget.ExpandableListView.getPackedPositionType(0L);
                java.lang.Object[] objArr27 = new java.lang.Object[1];
                k("ू⽎숉ᵂꯪ₅Ⰻ쌧씌Ƕ៸┘햫佾ᷞ璸殠랚", (i125 ^ 18) + ((i125 & 18) << 1), objArr27);
                java.lang.Object[] objArr28 = {(java.lang.String) objArr27[0]};
                java.lang.Object d8 = com.facetec.sdk.al.d(1873189073);
                if (d8 == null) {
                    char pressedStateDuration2 = (char) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 6935);
                    int bitsPerPixel = android.graphics.ImageFormat.getBitsPerPixel(0);
                    int offsetBefore = android.text.TextUtils.getOffsetBefore("", 0);
                    byte b7 = (byte) 3;
                    byte b8 = (byte) (b7 - 3);
                    java.lang.Object[] objArr29 = new java.lang.Object[1];
                    n(b7, b8, b8, objArr29);
                    d8 = com.facetec.sdk.al.c(pressedStateDuration2, 2388 - bitsPerPixel, offsetBefore + 23, -934682071, false, (java.lang.String) objArr29[0], new java.lang.Class[]{java.lang.String.class});
                }
                long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) d8).invoke(null, objArr28)).longValue();
                long j30 = -828914687;
                long j31 = my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CERTIFICATE;
                long j32 = longValue5 ^ j2;
                long j33 = i2;
                long j34 = j33 ^ j2;
                long j35 = (j34 | longValue5) ^ j2;
                long j36 = my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR;
                long j37 = j30 ^ j2;
                long j38 = ((-515) * j30) + (j31 * longValue5) + ((((j34 | j30) ^ j2) | ((j32 | j33) ^ j2) | j35) * (-516)) + (((((j37 | j32) | j33) ^ j2) | (((j37 | j34) | longValue5) ^ j2)) * j36) + (j36 * (((longValue5 | j37) ^ j2) | j35)) + 1765994330;
                int i126 = (-1350709270) | i38;
                int i127 = ((int) (j38 >> 32)) & ((((~i126) | (-1507031616)) * (-828)) + 1754752898 + (i126 * (-828)) + 1695777772);
                int i128 = ((int) j38) & (((((~((-1510433438) | i2)) | (-1347307449)) * (-318)) - 1102769461) + (((~((-1347307449) | i2)) | (~(1515153341 | i38))) * 318) + (((~((-4719905) | i38)) | (~(1515153341 | i2))) * 318));
                if (((i127 ^ i128) | (i127 & i128)) == 0) {
                    java.lang.Object[] objArr30 = {null, new int[]{i2}, new int[]{i2}, new int[]{(~(r3 & r4)) & r5}, null};
                    int i129 = i4 + (((325059374 | i2) * 376) - 65292587) + (((~(466989023 | i38)) | 2097184) * (-376)) + (((~(i2 | (-466989024))) | (-146124018)) * 376);
                    int i130 = i129 << 13;
                    int i131 = (~(i129 & i130)) & (i129 | i130);
                    int i132 = i131 >>> 17;
                    int i133 = (~(i131 & i132)) & (i131 | i132);
                    int i134 = i133 << 5;
                    int i135 = i133 | i134;
                    return objArr30;
                }
                java.lang.Object[] objArr31 = {null, new int[]{i2 ^ 100}, new int[]{i2}, new int[1], null};
                int i136 = (((14385793 | r2) * (-814)) - 1204200564) + (((~(287600700 | i2)) | (~((-33264306) | i38)) | 268722188) * 407) + (((~((-287600701) | i2)) | 268722188 | (~(i2 | 33264305))) * 407);
                int c8 = com.facetec.sdk.fl.AnonymousClass16.c();
                int i137 = (i136 * (-932)) + 14944;
                int i138 = ~i136;
                int i139 = ~c8;
                int i140 = ~((i139 & (-17)) | (i139 ^ (-17)));
                int i141 = ((i140 ^ i138) | (i140 & i138)) * (-933);
                int i142 = (i137 ^ i141) + ((i137 & i141) << 1) + (((~((i139 ^ i138) | (i139 & i138))) | (~((i138 & 16) | (i138 ^ 16)))) * 933);
                int i143 = -(-((~(i136 | 16)) * 933));
                int i144 = (i4 - (~((i142 & i143) + (i143 | i142)))) - 1;
                int i145 = i144 ^ (i144 << 13);
                int i146 = i145 >>> 17;
                int i147 = (i145 & (~i146)) | ((~i145) & i146);
                ((int[]) objArr31[3])[0] = i147 ^ (i147 << 5);
                return objArr31;
            }
            int i148 = i2;
            try {
                int i149 = -(-android.graphics.ImageFormat.getBitsPerPixel(0));
                java.lang.Object[] objArr32 = new java.lang.Object[1];
                k("䒝尥捄㏡̘吩\ueb55憜␛ᅱ쒩瓫핤玻씌Ƕ\ue066씤쒩瓫㢾\ue04a㌶―", (i149 ^ 24) + ((i149 & 24) << 1), objArr32);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr32[0]);
                java.lang.Object[] objArr33 = new java.lang.Object[1];
                k("啄㲜\u3104뗥\ufdccˬ锻턲啄㲜ꂼง\u09d2龡", 14 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr33);
                java.lang.String str12 = (java.lang.String) cls.getMethod((java.lang.String) objArr33[0], null).invoke(context, null);
                int jumpTapTimeout = android.view.ViewConfiguration.getJumpTapTimeout() >> 16;
                int c9 = com.facetec.sdk.fl.AnonymousClass16.c();
                int i150 = jumpTapTimeout * 567;
                int i151 = ~jumpTapTimeout;
                int i152 = ((((i150 ^ (-12995)) + ((i150 & (-12995)) << 1)) + (((~((i151 ^ c9) | (i151 & c9))) | (~((i151 ^ 23) | (i151 & 23)))) * (-566))) - (~(-(-((~((jumpTapTimeout ^ (-24)) | (jumpTapTimeout & (-24)))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST))))) - 1;
                int i153 = (i151 ^ (-24)) | (i151 & (-24));
                int i154 = -(-((~((i153 ^ c9) | (i153 & c9))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST));
                java.lang.Object[] objArr34 = new java.lang.Object[1];
                k("䒝尥捄㏡̘吩\ueb55憜␛ᅱ쒩瓫핤玻씌Ƕ\ue066씤쒩瓫㢾\ue04a㌶―", (i152 & i154) + (i154 | i152), objArr34);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr34[0]);
                int gidForName = android.os.Process.getGidForName("");
                int i155 = -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                int i156 = i155 * (-519);
                int i157 = (53663 & i156) + (i156 | 53663);
                int i158 = ~i155;
                int i159 = (i158 & (-104)) | (i158 ^ (-104));
                int i160 = ~i148;
                int i161 = ~((i159 & i160) | (i159 ^ i160));
                int i162 = ~((i148 ^ 103) | (i148 & 103));
                int i163 = ((i161 ^ i162) | (i161 & i162)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL;
                int i164 = ((i157 | i163) << 1) - (i157 ^ i163);
                int i165 = ~((i160 ^ (-104)) | (i160 & (-104)));
                int i166 = ~((i155 ^ i148) | (i155 & i148));
                int i167 = -(-(((i165 & i166) | (i165 ^ i166)) * (-1040)));
                int i168 = (i164 & i167) + (i167 | i164);
                int i169 = (~((i155 & (-104)) | (i155 ^ (-104)))) | (~(i158 | i160));
                int i170 = ((i169 ^ i166) | (i169 & i166)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL;
                int i171 = -(android.view.ViewConfiguration.getJumpTapTimeout() >> 16);
                int i172 = (i171 * 866) - 12960;
                int i173 = ~i171;
                int i174 = ~((i173 & i160) | (i173 ^ i160));
                int i175 = ((i174 & (-16)) | (i174 ^ (-16))) * (-865);
                int i176 = (i172 & i175) + (i172 | i175) + ((~((i171 ^ i148) | (i171 & i148))) * 865);
                int i177 = ~((i160 ^ (-16)) | (i160 & (-16)));
                int i178 = ~(i171 | i160);
                int i179 = ((i178 ^ i177) | (i178 & i177)) * 865;
                java.lang.Object[] objArr35 = new java.lang.Object[1];
                l(true, 17 - gidForName, "￢\u0007\b\u0002\r\ufffa￼\u0002\u0005\t\tￚ\r\ufffe\u0000\b\uffff\u0007", (i168 ^ i170) + ((i170 & i168) << 1), (i176 & i179) + (i179 | i176), objArr35);
                java.lang.Object invoke = cls2.getMethod((java.lang.String) objArr35[0], null).invoke(context, null);
                int indexOf2 = ((java.lang.String) java.lang.Class.forName(str9).getField(str10).get(invoke)).indexOf(str12);
                int i180 = 2;
                if (indexOf2 > 0) {
                    java.lang.String str13 = (java.lang.String) java.lang.Class.forName(str9).getField(str10).get(invoke);
                    int length6 = str13.length();
                    int i181 = ((length6 | (-16)) << 1) - (length6 ^ (-16));
                    if (i181 >= 0) {
                        int i182 = 0;
                        while (i182 <= i181) {
                            java.lang.String substring = str13.substring(i182, i182 + 16);
                            java.lang.Object[] objArr36 = new java.lang.Object[i180];
                            objArr36[1] = 931995;
                            objArr36[0] = substring;
                            java.lang.Object d9 = com.facetec.sdk.al.d(-582857820);
                            if (d9 == null) {
                                char lastIndexOf = (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                                str7 = str13;
                                int offsetBefore2 = android.text.TextUtils.getOffsetBefore("", 0);
                                float scrollFriction = android.view.ViewConfiguration.getScrollFriction();
                                i25 = i181;
                                byte b9 = (byte) 3;
                                byte b10 = (byte) (b9 - 3);
                                str8 = str11;
                                i24 = indexOf2;
                                i26 = i182;
                                java.lang.Object[] objArr37 = new java.lang.Object[1];
                                n(b9, b10, b10, objArr37);
                                d9 = com.facetec.sdk.al.c(lastIndexOf, offsetBefore2 + 2365, 25 - (scrollFriction > 0.0f ? 1 : (scrollFriction == 0.0f ? 0 : -1)), 2058170716, false, (java.lang.String) objArr37[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                            } else {
                                i24 = indexOf2;
                                str7 = str13;
                                str8 = str11;
                                i25 = i181;
                                i26 = i182;
                            }
                            long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) d9).invoke(null, objArr36)).longValue();
                            long j39 = 511138965;
                            java.lang.String str14 = str10;
                            long j40 = -272;
                            java.lang.Object obj4 = invoke;
                            java.lang.String str15 = str9;
                            long j41 = -1;
                            long j42 = j39 ^ j41;
                            long j43 = i148;
                            long j44 = (com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE * j39) + ((-271) * longValue6) + (((((j42 | (longValue6 ^ j41)) | (j43 ^ j41)) ^ j41) | (((j39 | longValue6) | j43) ^ j41)) * j40) + ((((j42 | longValue6) ^ j41) | ((j42 | j43) ^ j41)) * j40) + (com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE * ((j41 ^ (j43 | j39)) | longValue6)) + 648058433;
                            int myUid3 = android.os.Process.myUid();
                            int i183 = ((int) (j44 >> 32)) & ((((~((-933548839) | myUid3)) | (-1924192047)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE) + 1671518305 + (((~((~myUid3) | (-933548839))) | 84148224) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE));
                            int i184 = ~((-380262403) | i148);
                            int i185 = ((int) j44) & ((((~(1056626854 | i160)) | (-1056964008) | i184) * (-502)) + 542786277 + ((i184 | (~((-337154) | i160))) * 502));
                            if (((i183 ^ i185) | (i183 & i185)) == -725904754) {
                                java.lang.String str16 = (java.lang.String) java.lang.Class.forName(str15).getField(str14).get(obj4);
                                ((int[]) objArr[2])[0] = i148;
                                ((int[]) objArr[1])[0] = i148 ^ 20;
                                objArr = new java.lang.Object[]{str16, new int[1], new int[1], new int[1], null};
                                int i186 = (((((~((-152532859) | i160)) | (~((-168332148) | i148))) * (-370)) - 1218167433) + ((((~((-152532859) | i148)) | (~((-168332148) | i160))) | (-186646396)) * (-370))) - 339689784;
                                int i187 = (i186 ^ 16) + ((i186 & 16) << 1);
                                int c10 = com.facetec.sdk.fl.AnonymousClass16.c();
                                int i188 = i187 * (-317);
                                i22 = i4;
                                int i189 = -(-(i22 * 319));
                                int i190 = ((i188 | i189) << 1) - (i188 ^ i189);
                                int i191 = ~i187;
                                int i192 = ~i22;
                                int i193 = (i191 ^ i192) | (i191 & i192);
                                int i194 = ~((i193 ^ c10) | (i193 & c10));
                                int i195 = ~c10;
                                int i196 = (i195 ^ i187) | (i195 & i187);
                                int i197 = ~((i196 ^ i22) | (i196 & i22));
                                int i198 = ((i194 ^ i197) | (i194 & i197)) * (-318);
                                int i199 = (i190 & i198) + (i198 | i190);
                                int i200 = ~((i192 ^ i187) | (i192 & i187));
                                int i201 = ~((i187 ^ c10) | (i187 & c10));
                                int i202 = -(-(((i201 ^ i200) | (i201 & i200)) * (-318)));
                                int i203 = (i199 ^ i202) + ((i202 & i199) << 1);
                                int i204 = ~((c10 & i191) | (i191 ^ c10));
                                int i205 = -(-(((i204 ^ i192) | (i204 & i192)) * 318));
                                int i206 = (i203 ^ i205) + ((i205 & i203) << 1);
                                int i207 = i206 << 13;
                                int i208 = ((~i207) & i206) | ((~i206) & i207);
                                int i209 = i208 >>> 17;
                                int i210 = (~(i208 & i209)) & (i208 | i209);
                                ((int[]) objArr[3])[0] = i210 ^ (i210 << 5);
                                i6 = i148;
                                i7 = i160;
                                break;
                            }
                            str10 = str14;
                            i182 = (i26 ^ 1) + ((i26 & 1) << 1);
                            invoke = obj4;
                            i29 = i4;
                            str9 = str15;
                            str13 = str7;
                            i181 = i25;
                            str11 = str8;
                            indexOf2 = i24;
                            i180 = 2;
                        }
                    }
                    int i211 = indexOf2;
                    int i212 = i29;
                    str = str9;
                    str2 = str11;
                    obj2 = invoke;
                    java.lang.String str17 = (java.lang.String) java.lang.Class.forName(str).getField(str10).get(obj2);
                    int length7 = str17.length();
                    int i213 = (length7 ^ (-6)) + ((length7 & (-6)) << 1);
                    if (i213 >= 0) {
                        int i214 = 0;
                        while (i214 <= i213) {
                            int c11 = com.facetec.sdk.fl.AnonymousClass16.c();
                            int i215 = (i214 ^ 6) | (i214 & 6);
                            int i216 = (((i214 * 302) - 1800) - (~((~((i215 ^ c11) | (i215 & c11))) * (-301)))) - 1;
                            int i217 = ~i214;
                            int i218 = ~(i217 | c11);
                            int i219 = ~c11;
                            int i220 = ~((i219 ^ 6) | (i219 & 6));
                            int i221 = -(-(((i218 ^ i220) | (i218 & i220)) * (-301)));
                            int i222 = (i216 & i221) + (i216 | i221);
                            int i223 = ~((c11 ^ (-7)) | (c11 & (-7)));
                            int i224 = ((i223 ^ i217) | (i223 & i217)) * 301;
                            java.lang.Object[] objArr38 = {str17.substring(i214, (i222 ^ i224) + ((i224 & i222) << 1)), 931995};
                            java.lang.Object d10 = com.facetec.sdk.al.d(-582857820);
                            if (d10 == null) {
                                char c12 = (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                int fadingEdgeLength = android.view.ViewConfiguration.getFadingEdgeLength();
                                int maximumFlingVelocity3 = android.view.ViewConfiguration.getMaximumFlingVelocity();
                                byte b11 = (byte) 3;
                                byte b12 = (byte) (b11 - 3);
                                str6 = str17;
                                i23 = i213;
                                java.lang.Object[] objArr39 = new java.lang.Object[1];
                                n(b11, b12, b12, objArr39);
                                d10 = com.facetec.sdk.al.c(c12, (fadingEdgeLength >> 16) + 2365, (maximumFlingVelocity3 >> 16) + 24, 2058170716, false, (java.lang.String) objArr39[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                            } else {
                                str6 = str17;
                                i23 = i213;
                            }
                            long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) d10).invoke(null, objArr38)).longValue();
                            long j45 = 833165731;
                            java.lang.Object obj5 = obj2;
                            int i225 = i214;
                            long j46 = i148;
                            java.lang.String str18 = str10;
                            long j47 = 859;
                            i7 = i160;
                            long j48 = -1;
                            long j49 = j46 ^ j48;
                            long j50 = longValue7 ^ j48;
                            long j51 = (860 * j45) + ((-858) * longValue7) + ((-859) * (j45 | j46)) + ((((j46 | ((j45 ^ j48) | j50)) ^ j48) | ((j49 | j45) ^ j48)) * j47) + (j47 * (((j50 | j49) ^ j48) | (j48 ^ (j50 | j45)))) + 326031667;
                            int nextInt5 = new java.util.Random().nextInt(1171597773);
                            int i226 = ~nextInt5;
                            int i227 = ~(1368374819 | i226);
                            int i228 = ((int) (j51 >> 32)) & ((((~((-1368374820) | nextInt5)) | (~(68851591 | i226)) | i227) * (-516)) + 1976313882 + (((~(nextInt5 | (-693764))) | (~(i226 | (-68157829)))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR) + ((68157828 | i227) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR));
                            i6 = i2;
                            int i229 = ((int) j51) & ((((i7 | (-838067153)) * (-757)) - 1901876494) + ((~((-272728577) | i6)) * 1514) + (((~(i7 | 599159257)) | (-871887834) | (~((-565338577) | i6))) * 757));
                            if (((i229 ^ i228) | (i228 & i229)) == -2096167706) {
                                java.lang.String str19 = (java.lang.String) java.lang.Class.forName(str).getField(str18).get(obj5);
                                ((int[]) objArr[2])[0] = i6;
                                ((int[]) objArr[1])[0] = (i6 & (-21)) | (i7 & 20);
                                objArr = new java.lang.Object[]{str19, new int[1], new int[1], new int[1], null};
                                int i230 = (i4 - (~(((((i7 | (-327160065)) * (-490)) + 340755519) + (((~(545189563 | i6)) | (-872349628)) * 490)) + 835023020))) - 1;
                                int i231 = i230 << 13;
                                int i232 = (i230 & (~i231)) | ((~i230) & i231);
                                int i233 = i232 ^ (i232 >>> 17);
                                int i234 = i233 << 5;
                                ((int[]) objArr[3])[0] = (i233 & (~i234)) | ((~i233) & i234);
                                i22 = i4;
                                break;
                            }
                            obj2 = obj5;
                            str10 = str18;
                            int i235 = ((i225 | 37) << 1) - (i225 ^ 37);
                            i214 = (i235 & (-36)) + (i235 | (-36));
                            i212 = i4;
                            i148 = i6;
                            i213 = i23;
                            str17 = str6;
                            i160 = i7;
                        }
                    }
                    i6 = i148;
                    i15 = i212;
                    i7 = i160;
                    java.lang.String substring2 = ((java.lang.String) java.lang.Class.forName(str).getField(str10).get(obj2)).substring(0, i211);
                    java.lang.Object[] objArr40 = new java.lang.Object[1];
                    l(true, (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), "\u0000", 47 - (~(-(android.view.ViewConfiguration.getScrollBarSize() >> 8))), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 1, objArr40);
                    i16 = 0;
                    split = substring2.split((java.lang.String) objArr40[0]);
                    length2 = split.length;
                    i17 = 0;
                    loop4: while (i17 < length2) {
                        java.lang.String str20 = split[i17];
                        int i236 = -((byte) android.view.KeyEvent.getModifierMetaStateMask());
                        int i237 = -(-android.graphics.Color.red(i16));
                        int i238 = -(-android.graphics.Color.argb(i16, i16, i16, i16));
                        java.lang.Object[] objArr41 = new java.lang.Object[1];
                        l(false, 1 - (~i236), "￢\u0011\u000f", (i237 ^ 77) + ((i237 & 77) << 1), (i238 & 2) + (i238 | 2), objArr41);
                        if (str20.split((java.lang.String) objArr41[0]).length > 1) {
                            synchronized (((java.lang.Class) com.facetec.sdk.al.b((char) android.text.TextUtils.indexOf("", "", 0), (android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1)) + 1435, android.graphics.Color.green(0) + 23))) {
                                try {
                                    int keyRepeatDelay = android.view.ViewConfiguration.getKeyRepeatDelay() >> 16;
                                    int c13 = com.facetec.sdk.fl.AnonymousClass16.c();
                                    int i239 = keyRepeatDelay * (-949);
                                    int i240 = (i239 & (-15184)) + (i239 | (-15184));
                                    int i241 = ~c13;
                                    int i242 = ~keyRepeatDelay;
                                    int i243 = ((~(i241 | (-17))) | (~((i242 ^ c13) | (i242 & c13)))) * 1900;
                                    r15 = ~(i241 | keyRepeatDelay);
                                    strArr = split;
                                    int i244 = ~((c13 ^ 16) | (c13 & 16));
                                    i19 = 1;
                                    int i245 = ((i240 | i243) << 1) - (i240 ^ i243);
                                    r13 = r15 ^ i244;
                                    i20 = (i245 - (~(((i244 & r15) | r13) * (-950)))) - 1;
                                    int i246 = ~(i241 | 16);
                                    int i247 = ~((keyRepeatDelay & c13) | (keyRepeatDelay ^ c13));
                                    int i248 = ((i246 ^ i247) | (i246 & i247)) * 950;
                                    i18 = 1;
                                    try {
                                        try {
                                            java.lang.Object[] objArr42 = new java.lang.Object[1];
                                            k("ꐺ溼崦︄\ue190\uaaf9쭻⛣ﰡᲫ㞊̴廃ᬶਜ਼꩒", ((i20 | i248) << 1) - (i20 ^ i248), objArr42);
                                            str3 = (java.lang.String) objArr42[0];
                                            try {
                                                try {
                                                    java.lang.Runtime runtime = java.lang.Runtime.getRuntime();
                                                    java.lang.Object[] objArr43 = new java.lang.Object[1];
                                                    k("殠랚", 2 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr43);
                                                    exec = runtime.exec((java.lang.String) objArr43[0], (java.lang.String[]) null, (java.io.File) null);
                                                    try {
                                                        java.lang.Object[] objArr44 = {exec.getInputStream()};
                                                        java.lang.Object d11 = com.facetec.sdk.al.d(1647730903);
                                                        if (d11 == null) {
                                                            try {
                                                                d11 = com.facetec.sdk.al.c((char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 1340 - android.view.KeyEvent.getDeadChar(0, 0), 23 - android.os.Process.getGidForName(""), -975627729, false, null, new java.lang.Class[]{java.io.InputStream.class});
                                                            } catch (java.lang.Throwable th4) {
                                                                th = th4;
                                                                java.lang.Throwable cause2 = th.getCause();
                                                                if (cause2 != null) {
                                                                    throw cause2;
                                                                }
                                                                throw th;
                                                            }
                                                        }
                                                        newInstance = ((java.lang.reflect.Constructor) d11).newInstance(objArr44);
                                                        try {
                                                            objArr7 = new java.lang.Object[]{exec.getErrorStream()};
                                                            d = com.facetec.sdk.al.d(1647730903);
                                                            if (d == null) {
                                                                try {
                                                                    i19 = length2;
                                                                } catch (java.lang.Throwable th5) {
                                                                    th = th5;
                                                                }
                                                                try {
                                                                    d = com.facetec.sdk.al.c((char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 1340 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), android.view.View.getDefaultSize(0, 0) + 24, -975627729, false, null, new java.lang.Class[]{java.io.InputStream.class});
                                                                } catch (java.lang.Throwable th6) {
                                                                    th = th6;
                                                                    th2 = th;
                                                                    cause = th2.getCause();
                                                                    if (cause == null) {
                                                                        throw cause;
                                                                    }
                                                                    throw th2;
                                                                }
                                                            } else {
                                                                i19 = length2;
                                                            }
                                                        } catch (java.lang.Throwable th7) {
                                                            th = th7;
                                                        }
                                                    } catch (java.lang.Throwable th8) {
                                                        th = th8;
                                                    }
                                                } catch (java.lang.Exception unused) {
                                                }
                                            } catch (java.lang.Exception unused2) {
                                            }
                                        } catch (java.io.IOException unused3) {
                                        }
                                    } catch (java.io.IOException unused4) {
                                        i18 = i15;
                                        i19 = length2;
                                        r15 = obj2;
                                        i20 = i17;
                                        r13 = str10;
                                        i17 = i20 + 1;
                                        i15 = i18;
                                        str10 = r13;
                                        obj2 = r15;
                                        length2 = i19;
                                        split = strArr;
                                        i16 = 0;
                                    }
                                } catch (java.io.IOException unused5) {
                                    strArr = split;
                                }
                                try {
                                    newInstance2 = ((java.lang.reflect.Constructor) d).newInstance(objArr7);
                                    try {
                                        java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(exec.getOutputStream());
                                        try {
                                            java.lang.Class<?> cls3 = java.lang.Class.forName(str2);
                                            int i249 = -android.graphics.Color.argb(0, 0, 0, 0);
                                            i20 = i17;
                                            try {
                                                java.lang.Object[] objArr45 = new java.lang.Object[1];
                                                k("纽⍋쵎繂㌶―", (i249 ^ 5) + ((i249 & 5) << 1), objArr45);
                                                cls3.getMethod((java.lang.String) objArr45[0], null).invoke(newInstance, null);
                                                try {
                                                    java.lang.Class<?> cls4 = java.lang.Class.forName(str2);
                                                    int i250 = -((byte) android.view.KeyEvent.getModifierMetaStateMask());
                                                    int i251 = ~((i250 ^ i6) | (i250 & i6));
                                                    int i252 = ~i250;
                                                    int i253 = ~((i252 ^ i7) | (i252 & i7));
                                                    int i254 = ~((i6 ^ 4) | (i6 & 4));
                                                    obj3 = obj2;
                                                    int i255 = ((((i250 * 673) - 5372) + (((i251 ^ 4) | (i251 & 4)) * 672)) - (~(((i254 & i253) | (i253 ^ i254)) * (-672)))) - 1;
                                                    int i256 = ~((i7 ^ (-5)) | (i7 & (-5)));
                                                    int i257 = ~((i250 & (-5)) | (i250 ^ (-5)));
                                                    int i258 = ((i256 & i257) | (i256 ^ i257)) * 672;
                                                    try {
                                                        java.lang.Object[] objArr46 = new java.lang.Object[1];
                                                        k("纽⍋쵎繂㌶―", (i255 & i258) + (i258 | i255), objArr46);
                                                        cls4.getMethod((java.lang.String) objArr46[0], null).invoke(newInstance2, null);
                                                        try {
                                                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                            sb.append(str3);
                                                            int i259 = -android.os.Process.getGidForName("");
                                                            float length8 = android.graphics.PointF.length(0.0f, 0.0f);
                                                            int i260 = -android.view.View.getDefaultSize(0, 0);
                                                            java.lang.Object[] objArr47 = new java.lang.Object[1];
                                                            l(false, i259, "\u0000", 11 - (length8 > 0.0f ? 1 : (length8 == 0.0f ? 0 : -1)), (i260 & 1) + (i260 | 1), objArr47);
                                                            sb.append((java.lang.String) objArr47[0]);
                                                            java.lang.String obj6 = sb.toString();
                                                            int defaultSize = android.view.View.getDefaultSize(0, 0);
                                                            int i261 = -android.view.KeyEvent.getDeadChar(0, 0);
                                                            java.lang.Object[] objArr48 = new java.lang.Object[1];
                                                            l(true, ((defaultSize | 5) << 1) - (defaultSize ^ 5), "\u0011\ufff4￩\u0002\u0010", (i261 ^ 69) + ((i261 & 69) << 1), -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr48);
                                                            dataOutputStream.write(obj6.getBytes((java.lang.String) objArr48[0]));
                                                            dataOutputStream.flush();
                                                            java.lang.Object[] objArr49 = new java.lang.Object[1];
                                                            k("㢾\ue04aᓹ受ﲉ珕", android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 6, objArr49);
                                                            ?? r6 = (java.lang.String) objArr49[0];
                                                            int i262 = -android.graphics.ImageFormat.getBitsPerPixel(0);
                                                            int i263 = -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                            java.lang.Object[] objArr50 = new java.lang.Object[1];
                                                            l(true, (i262 ^ 4) + ((i262 & 4) << 1), "\u0011\ufff4￩\u0002\u0010", ((i263 | 68) << 1) - (i263 ^ 68), -android.os.Process.getGidForName(""), objArr50);
                                                            r7 = (java.lang.String) objArr50[0];
                                                            dataOutputStream.write(r6.getBytes(r7));
                                                            dataOutputStream.flush();
                                                            try {
                                                                long nanoTime = java.lang.System.nanoTime();
                                                                long nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(2000L);
                                                                while (true) {
                                                                    try {
                                                                        exec.exitValue();
                                                                        str4 = str10;
                                                                        str5 = str20;
                                                                        break;
                                                                    } catch (java.lang.IllegalThreadStateException unused6) {
                                                                        if (nanos > 0) {
                                                                            try {
                                                                                str4 = str10;
                                                                                str5 = str20;
                                                                                try {
                                                                                    java.lang.Object[] objArr51 = {java.lang.Long.valueOf(java.lang.Math.min(java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(nanos) + 1, 3L))};
                                                                                    java.lang.Class<?> cls5 = java.lang.Class.forName(str2);
                                                                                    java.lang.Object[] objArr52 = new java.lang.Object[1];
                                                                                    k("돶銥ꎨ薒磊\u0b51", 5 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr52);
                                                                                    cls5.getMethod((java.lang.String) objArr52[0], java.lang.Long.TYPE).invoke(null, objArr51);
                                                                                } catch (java.lang.Throwable th9) {
                                                                                    java.lang.Throwable cause3 = th9.getCause();
                                                                                    if (cause3 != null) {
                                                                                        throw cause3;
                                                                                    }
                                                                                    throw th9;
                                                                                }
                                                                            } catch (java.lang.InterruptedException e) {
                                                                                e = e;
                                                                                str4 = str10;
                                                                                interruptedException = e;
                                                                                try {
                                                                                    throw interruptedException;
                                                                                } catch (java.lang.Throwable th10) {
                                                                                    th = th10;
                                                                                    th3 = th;
                                                                                    try {
                                                                                        exec.destroy();
                                                                                        throw th3;
                                                                                    } catch (java.lang.Exception unused7) {
                                                                                        throw th3;
                                                                                    }
                                                                                }
                                                                            } catch (java.lang.Throwable th11) {
                                                                                th = th11;
                                                                                str4 = str10;
                                                                                th3 = th;
                                                                                exec.destroy();
                                                                                throw th3;
                                                                            }
                                                                        } else {
                                                                            str4 = str10;
                                                                            str5 = str20;
                                                                        }
                                                                        try {
                                                                            long nanos2 = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(2000L) - (java.lang.System.nanoTime() - nanoTime);
                                                                            if (nanos2 > 0) {
                                                                                nanos = nanos2;
                                                                                str10 = str4;
                                                                                str20 = str5;
                                                                            }
                                                                        } catch (java.lang.InterruptedException e2) {
                                                                            e = e2;
                                                                            interruptedException = e;
                                                                            throw interruptedException;
                                                                        } catch (java.lang.Throwable th12) {
                                                                            th = th12;
                                                                            th3 = th;
                                                                            exec.destroy();
                                                                            throw th3;
                                                                        }
                                                                    } catch (java.lang.InterruptedException e3) {
                                                                        interruptedException = e3;
                                                                        throw interruptedException;
                                                                    } catch (java.lang.Throwable th13) {
                                                                        th3 = th13;
                                                                        exec.destroy();
                                                                        throw th3;
                                                                    }
                                                                }
                                                            } catch (java.lang.InterruptedException e4) {
                                                                e = e4;
                                                            } catch (java.lang.Throwable th14) {
                                                                th = th14;
                                                            }
                                                        } catch (java.io.IOException unused8) {
                                                            i18 = i4;
                                                            r13 = str10;
                                                            r15 = obj3;
                                                        } catch (java.lang.Exception unused9) {
                                                        }
                                                    } catch (java.lang.Throwable th15) {
                                                        th = th15;
                                                        java.lang.Throwable th16 = th;
                                                        java.lang.Throwable cause4 = th16.getCause();
                                                        if (cause4 != null) {
                                                            throw cause4;
                                                        }
                                                        throw th16;
                                                    }
                                                } catch (java.lang.Throwable th17) {
                                                    th = th17;
                                                }
                                            } catch (java.lang.Throwable th18) {
                                                th = th18;
                                                java.lang.Throwable th19 = th;
                                                java.lang.Throwable cause5 = th19.getCause();
                                                if (cause5 != null) {
                                                    throw cause5;
                                                }
                                                throw th19;
                                            }
                                        } catch (java.lang.Throwable th20) {
                                            th = th20;
                                        }
                                    } catch (java.io.IOException unused10) {
                                        i18 = i15;
                                        r15 = obj2;
                                        i20 = i17;
                                        r13 = str10;
                                        i17 = i20 + 1;
                                        i15 = i18;
                                        str10 = r13;
                                        obj2 = r15;
                                        length2 = i19;
                                        split = strArr;
                                        i16 = 0;
                                    } catch (java.lang.Exception unused11) {
                                        java.lang.Object[] objArr53 = new java.lang.Object[1];
                                        k("ⶫ㹞⣤械逐ꓸ\u0df5Ⱦ轚齆\uf624뿤檊蘇㖲⌙랩綫\udc98ⵧ䣑얤ℵ밪뫼휴灬㐡", android.graphics.Color.rgb(0, 0, 0) + 16777243, objArr53);
                                        throw new java.io.IOException((java.lang.String) objArr53[0]);
                                    }
                                } catch (java.lang.Throwable th21) {
                                    th = th21;
                                    th2 = th;
                                    cause = th2.getCause();
                                    if (cause == null) {
                                    }
                                }
                            }
                        } else {
                            strArr = split;
                            i18 = i15;
                            i19 = length2;
                            r15 = obj2;
                            i20 = i17;
                            r13 = str10;
                        }
                        i17 = i20 + 1;
                        i15 = i18;
                        str10 = r13;
                        obj2 = r15;
                        length2 = i19;
                        split = strArr;
                        i16 = 0;
                    }
                    i5 = i15;
                } else {
                    i5 = i29;
                    i6 = i148;
                    i7 = i160;
                }
                java.lang.Object[] objArr54 = {null, new int[]{i6}, new int[]{i6}, new int[1], null};
                int myUid4 = android.os.Process.myUid();
                int i264 = ~myUid4;
                int i265 = ~(692201980 | myUid4);
                int i266 = (i5 - (~(-(-((((((~((-1013066987) | i264)) | i265) * 1150) + 507080858) + ((i265 | (~((-692201981) | i264))) * (-575))) + (((~(myUid4 | (-1013066987))) | (~(i264 | 1013066986))) * 575)))))) - 1;
                int i267 = i266 ^ (i266 << 13);
                int i268 = i267 >>> 17;
                int i269 = (~(i267 & i268)) & (i267 | i268);
                int i270 = i269 << 5;
                int[] iArr6 = (int[]) objArr54[3];
                int i271 = (~(i269 & i270)) & (i269 | i270);
                c = 0;
                iArr6[0] = i271;
                objArr = objArr54;
                i8 = 1;
                if (((int[]) objArr[i8])[c] == i6) {
                    return objArr;
                }
                int[] iArr7 = new int[i8];
                int[] iArr8 = new int[i8];
                iArr8[c] = i6;
                iArr7[c] = i6;
                java.lang.Object[] objArr55 = {null, iArr7, iArr8, new int[i8], null};
                int nextInt6 = new java.util.Random().nextInt();
                int i272 = ~nextInt6;
                int i273 = i5 + (((-18530434) | nextInt6) * (-676)) + 2114254585 + (((~(168112476 | i272)) | 18530433) * 676) + (((~(nextInt6 | 186642909)) | (~(i272 | (-152752530))) | 134222096) * 676);
                int i274 = i273 ^ (i273 << 13);
                int i275 = i274 >>> 17;
                int i276 = (i274 & (~i275)) | ((~i274) & i275);
                int i277 = i276 << 5;
                ((int[]) objArr55[3])[0] = (~(i276 & i277)) & (i276 | i277);
                if (((int[]) objArr55[1])[0] != i6) {
                    return objArr55;
                }
                if ((i3 & 1) == 0) {
                    int i278 = -(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    java.lang.Object[] objArr56 = new java.lang.Object[1];
                    k("ያ8ꓢ遐ℵ밪昜壝ळ왂嚆\ue523豝饞", (i278 & 14) + (i278 | 14), objArr56);
                    try {
                        java.lang.Object[] objArr57 = {(java.lang.String) objArr56[0]};
                        int packedPositionChild = android.widget.ExpandableListView.getPackedPositionChild(0L);
                        java.lang.Object[] objArr58 = new java.lang.Object[1];
                        k("䒝尥捄㏡̘吩\ueb55憜␛ᅱ쒩瓫핤玻씌Ƕ\ue066씤쒩瓫㢾\ue04a㌶―", (packedPositionChild & 24) + (packedPositionChild | 24), objArr58);
                        java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr58[0]);
                        int i279 = -android.graphics.Color.green(0);
                        java.lang.Object[] objArr59 = new java.lang.Object[1];
                        k("啄㲜陇괔⸭⼨㖲⌙娂\uecb3전\uab1dꓢ遐ℵ밪", (i279 & 16) + (i279 | 16), objArr59);
                        java.lang.Object invoke2 = cls6.getMethod((java.lang.String) objArr59[0], java.lang.String.class).invoke(context, objArr57);
                        if (invoke2 != null) {
                            int i280 = -(android.view.ViewConfiguration.getTouchSlop() >> 8);
                            int i281 = i280 * (-167);
                            int i282 = (i281 ^ (-6179)) + ((i281 & (-6179)) << 1);
                            int i283 = ~i280;
                            int i284 = i283 | (-38);
                            int i285 = ~i284;
                            int i286 = ~(i7 | (-38));
                            int i287 = ((i285 ^ i286) | (i285 & i286)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE;
                            int i288 = ((i282 | i287) << 1) - (i282 ^ i287);
                            int i289 = -(-((~(i284 | i6)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE));
                            int i290 = ~((i283 ^ i7) | (i283 & i7));
                            int i291 = ~((i283 ^ 37) | (i283 & 37));
                            int i292 = (i291 ^ i290) | (i291 & i290);
                            int i293 = (i280 ^ (-38)) | (i280 & (-38));
                            int i294 = ~((i293 ^ i6) | (i293 & i6));
                            int i295 = -android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                            byte modifierMetaStateMask = (byte) android.view.KeyEvent.getModifierMetaStateMask();
                            java.lang.Object[] objArr60 = new java.lang.Object[1];
                            l(false, ((((i288 | i289) << 1) - (i289 ^ i288)) - (~(((i294 ^ i292) | (i294 & i292)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE))) - 1, "\u0005\u0003\u0010\uffff\f\u0002\u0010\r\u0007\u0002ￌ\uffff\u000e\u000eￌ\uffff\u0002\u000b\u0007\fￌ￢\u0003\u0014\u0007\u0001\u0003￮\r\n\u0007\u0001\u0017￫\uffff\f\uffff", (i295 ^ 147) + ((i295 & 147) << 1), ((modifierMetaStateMask | 4) << 1) - (4 ^ modifierMetaStateMask), objArr60);
                            java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr60[0]);
                            java.lang.Object[] objArr61 = new java.lang.Object[1];
                            k("啄㲜밥⓸랦荓⬦莬켁言뵂\ue0ac녔윸䓬Ⲃ", 15 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr61);
                            java.util.List list = (java.util.List) cls7.getMethod((java.lang.String) objArr61[0], null).invoke(invoke2, null);
                            if (list != null) {
                                java.util.Iterator it2 = list.iterator();
                                loop1: while (it2.hasNext()) {
                                    java.lang.Object next = it2.next();
                                    int i296 = -(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16);
                                    int i297 = (((i296 * 471) + 13659) - (~(-(-(((i296 ^ 29) | (i296 & 29)) * (-470)))))) - 1;
                                    int i298 = ~i296;
                                    int i299 = i7 | i296;
                                    int i300 = ((~((i298 ^ (-30)) | (i298 & (-30)))) | (~(i6 | (-30))) | (~((i299 ^ 29) | (i299 & 29)))) * (-470);
                                    int i301 = (i297 ^ i300) + ((i297 & i300) << 1);
                                    int i302 = (i296 ^ (-30)) | (i296 & (-30));
                                    int i303 = ~((i302 ^ i6) | (i302 & i6));
                                    int i304 = ~((i7 ^ i296) | (i7 & i296) | 29);
                                    int i305 = ((i304 ^ i303) | (i304 & i303)) * 470;
                                    java.lang.Object[] objArr62 = new java.lang.Object[1];
                                    k("䒝尥捄㏡̘吩\ueb55憜␛ᅱ쒩瓫핤玻씌Ƕ\ue066씤\ue987뵚몣鰱핤玻㳱\uf036謔\udec9萋뜈", (i301 & i305) + (i305 | i301), objArr62);
                                    java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr62[0]);
                                    int fadingEdgeLength2 = android.view.ViewConfiguration.getFadingEdgeLength() >> 16;
                                    java.lang.Object[] objArr63 = new java.lang.Object[1];
                                    k("啄㲜\u3104뗥\ufdccˬ锻턲啄㲜ꂼง\u09d2龡", ((fadingEdgeLength2 | 14) << 1) - (fadingEdgeLength2 ^ 14), objArr63);
                                    java.lang.String str21 = (java.lang.String) cls8.getMethod((java.lang.String) objArr63[0], null).invoke(next, null);
                                    int i306 = -(-android.view.View.MeasureSpec.getSize(0));
                                    int i307 = -(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                    int i308 = (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                    java.lang.Object[] objArr64 = new java.lang.Object[1];
                                    l(false, (i306 & 37) + (i306 | 37), "\u0005\u0003\u0010\uffff\f\u0002\u0010\r\u0007\u0002ￌ\uffff\u000e\u000eￌ\uffff\u0002\u000b\u0007\fￌ￢\u0003\u0014\u0007\u0001\u0003￮\r\n\u0007\u0001\u0017￫\uffff\f\uffff", 99 - (~i307), (i308 ^ 2) + ((i308 & 2) << 1), objArr64);
                                    java.lang.Class<?> cls9 = java.lang.Class.forName((java.lang.String) objArr64[0]);
                                    int i309 = -(-(android.view.ViewConfiguration.getTapTimeout() >> 16));
                                    java.lang.Object[] objArr65 = new java.lang.Object[1];
                                    k("\ue190\uaaf9碇腅栗䈂⣤械\u0c51\ue268茫뇙전\uab1d↗㏻磊\u0b51", (i309 & 17) + (i309 | 17), objArr65);
                                    if (((java.lang.Boolean) cls9.getMethod((java.lang.String) objArr65[0], java.lang.String.class).invoke(invoke2, str21)).booleanValue() && str21.length() - 20 >= 0) {
                                        int i310 = 0;
                                        while (i310 <= length) {
                                            java.lang.Object[] objArr66 = {str21.substring(i310, i310 + 20), 931995};
                                            java.lang.Object d12 = com.facetec.sdk.al.d(-582857820);
                                            if (d12 == null) {
                                                char modifierMetaStateMask2 = (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1);
                                                int jumpTapTimeout2 = android.view.ViewConfiguration.getJumpTapTimeout();
                                                long zoomControlsTimeout = android.view.ViewConfiguration.getZoomControlsTimeout();
                                                byte b13 = (byte) 3;
                                                byte b14 = (byte) (b13 - 3);
                                                obj = invoke2;
                                                it = it2;
                                                java.lang.Object[] objArr67 = new java.lang.Object[1];
                                                n(b13, b14, b14, objArr67);
                                                d12 = com.facetec.sdk.al.c(modifierMetaStateMask2, (jumpTapTimeout2 >> 16) + 2365, 25 - (zoomControlsTimeout > 0L ? 1 : (zoomControlsTimeout == 0L ? 0 : -1)), 2058170716, false, (java.lang.String) objArr67[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                                            } else {
                                                obj = invoke2;
                                                it = it2;
                                            }
                                            long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) d12).invoke(null, objArr66)).longValue();
                                            long j52 = 591522652;
                                            java.lang.String str22 = str21;
                                            long j53 = 464;
                                            int i311 = length;
                                            long j54 = -1;
                                            long j55 = longValue8 ^ j54;
                                            long myPid = android.os.Process.myPid();
                                            long j56 = myPid ^ j54;
                                            long j57 = (j55 | j52) ^ j54;
                                            long j58 = (465 * j52) + ((-463) * longValue8) + ((((j55 | j56) ^ j54) | j57 | ((j56 | j52) ^ j54)) * j53) + ((-464) * ((j52 ^ j54) | myPid | j55)) + ((j57 | (j54 ^ (j52 | myPid))) * j53) + 567674746;
                                            int i312 = ~((int) java.lang.Runtime.getRuntime().freeMemory());
                                            int i313 = ((int) (j58 >> 32)) & ((((1609799216 | r5) * 764) - 316319934) + (((~(i312 | 1609799216)) | (-1610340022)) * (-1528)) + (((-1438308022) | (~((-172572806) | i312))) * 764));
                                            i9 = i2;
                                            int i314 = ((int) j58) & ((((335548577 | r3) * (-476)) - 1909018047) + ((~((-1076429061) | i9)) * 952) + ((~(i7 | (-1076429061))) * 476));
                                            if (((i313 ^ i314) | (i313 & i314)) == 1245577864) {
                                                objArr6 = new java.lang.Object[]{null, new int[]{(~(i9 & 70)) & (i9 | 70)}, new int[]{i9}, new int[1], null};
                                                int freeMemory2 = (int) java.lang.Runtime.getRuntime().freeMemory();
                                                int i315 = ~freeMemory2;
                                                int i316 = ((((~((-363573760) | i315)) | (-42708754)) * (-602)) - 1853449364) + (((~(freeMemory2 | (-363573760))) | 354423022 | (~((-33558017) | i315))) * (-301)) + ((~((-42708754) | i315)) * 301);
                                                int i317 = -(-(i316 * (-495)));
                                                int i318 = ~i316;
                                                int i319 = ~((i318 ^ (-17)) | (i318 & (-17)));
                                                int i320 = ~((i9 ^ (-17)) | (i9 & (-17)));
                                                int i321 = -(-((i319 | i320) * 992));
                                                int i322 = (i319 ^ i320) | (i319 & i320);
                                                int i323 = (i7 ^ 16) | (i7 & 16);
                                                int i324 = ~((i323 ^ i316) | (i323 & i316));
                                                int i325 = -(-(((((i317 ^ (-7920)) + ((i317 & (-7920)) << 1)) - (~i321)) - 1) + (((i322 & i324) | (i322 ^ i324)) * (-496)) + ((i316 | i9) * 496)));
                                                i10 = i4;
                                                int i326 = (i10 & i325) + (i325 | i10);
                                                int i327 = (i326 << 13) ^ i326;
                                                int i328 = i327 >>> 17;
                                                int i329 = (i327 & (~i328)) | ((~i327) & i328);
                                                int i330 = i329 << 5;
                                                int[] iArr9 = (int[]) objArr6[3];
                                                int i331 = (i329 & (~i330)) | ((~i329) & i330);
                                                c3 = 0;
                                                iArr9[0] = i331;
                                                break loop1;
                                            }
                                            i310++;
                                            invoke2 = obj;
                                            it2 = it;
                                            i5 = i4;
                                            i6 = i9;
                                            str21 = str22;
                                            length = i311;
                                        }
                                    }
                                    invoke2 = invoke2;
                                    it2 = it2;
                                    i5 = i5;
                                    i6 = i6;
                                }
                            }
                        }
                        i9 = i6;
                        i10 = i5;
                        objArr6 = new java.lang.Object[]{null, new int[]{i9}, new int[]{i9}, new int[]{r1}, null};
                        int i332 = (((~((-627225558) | i9)) | 948090563) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE) + 83196805 + (((~(i7 | (-627225558))) | 537047745) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE);
                        int i333 = ((i10 | i332) << 1) - (i332 ^ i10);
                        int i334 = i333 << 13;
                        int i335 = ((~i334) & i333) | ((~i333) & i334);
                        int i336 = i335 ^ (i335 >>> 17);
                        int i337 = i336 << 5;
                        int i338 = (~(i336 & i337)) & (i336 | i337);
                        c3 = 0;
                        if (((int[]) objArr6[1])[c3] != i9) {
                            return objArr6;
                        }
                    } catch (java.lang.Throwable th22) {
                        java.lang.Throwable cause6 = th22.getCause();
                        if (cause6 != null) {
                            throw cause6;
                        }
                        throw th22;
                    }
                } else {
                    i9 = i6;
                    i10 = i5;
                }
                int i339 = -android.graphics.Color.alpha(0);
                int i340 = -(-(android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                int i341 = -android.view.View.MeasureSpec.getMode(0);
                java.lang.Object[] objArr68 = new java.lang.Object[1];
                l(true, 11 - (~i339), "￩\ufff3\uffef\u0014\u0013\u0005\u0015\u0007ￏ\u000f\u0006\u000e", (i340 ^ 97) + ((i340 & 97) << 1), ((i341 | 9) << 1) - (i341 ^ 9), objArr68);
                java.lang.Object[] objArr69 = {(java.lang.String) objArr68[0]};
                java.lang.Object d13 = com.facetec.sdk.al.d(2084539986);
                if (d13 == null) {
                    char indexOf3 = (char) (android.text.TextUtils.indexOf("", "") + 6935);
                    float minVolume = android.media.AudioTrack.getMinVolume();
                    int deadChar = android.view.KeyEvent.getDeadChar(0, 0);
                    byte length9 = (byte) $$a.length;
                    byte b15 = (byte) (length9 - 4);
                    java.lang.Object[] objArr70 = new java.lang.Object[1];
                    n(length9, b15, b15, objArr70);
                    d13 = com.facetec.sdk.al.c(indexOf3, 2389 - (minVolume > 0.0f ? 1 : (minVolume == 0.0f ? 0 : -1)), 23 - deadChar, -607062870, false, (java.lang.String) objArr70[0], new java.lang.Class[]{java.lang.String.class});
                }
                long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) d13).invoke(null, objArr69)).longValue();
                long j59 = -664456033;
                long j60 = -783;
                long j61 = -1;
                long j62 = j59 ^ j61;
                long j63 = i9;
                long j64 = j63 ^ j61;
                long j65 = (784 * j59) + ((-782) * longValue9) + ((longValue9 ^ j61) * j60) + ((((j62 | j64) | longValue9) ^ j61) * j60) + (783 * (((j64 | longValue9) ^ j61) | j62)) + 1636605375;
                int i342 = ((int) (j65 >> 32)) & ((((~(i7 | 1538722091)) | (-1606396204)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + 501358106 + ((~(1606396203 | i9)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + (((~(i7 | 1319018793)) | 287377410 | (~((-67674113) | i9))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE));
                int i343 = ((int) j65) & ((((~(i7 | (-815901135))) | 536914378) * (-160)) + 264890869 + (((~(i7 | 621325275)) | (-815901135)) * 160));
                if (((i342 ^ i343) | (i342 & i343)) != 0) {
                    objArr2 = new java.lang.Object[]{null, new int[]{i9 ^ 50}, new int[]{i9}, new int[1], null};
                    int i344 = ((((-304054926) | i9) * 376) - 65292587) + (((~(i7 | 43008692)) | (-312459966)) * (-376)) + (((~((-43008693) | i9)) | 277856313) * 376);
                    int i345 = (i344 & 16) + (i344 | 16);
                    int c14 = com.facetec.sdk.fl.AnonymousClass16.c();
                    int i346 = i345 * 491;
                    int i347 = i10 * (-489);
                    int i348 = (i346 ^ i347) + ((i346 & i347) << 1);
                    int i349 = ~i345;
                    int i350 = ~i10;
                    int i351 = (i349 & i350) | (i349 ^ i350);
                    int i352 = ~c14;
                    int i353 = -(-(((i351 & i352) | (i351 ^ i352)) * (-490)));
                    int i354 = (i348 & i353) + (i348 | i353);
                    int i355 = ~((i345 ^ i350) | (i350 & i345));
                    int i356 = ~((c14 ^ i350) | (c14 & i350));
                    int i357 = ((i356 ^ i355) | (i356 & i355)) * 490;
                    int i358 = (((i354 | i357) << 1) - (i357 ^ i354)) + (i349 * 490);
                    int i359 = i358 << 13;
                    int i360 = (~(i359 & i358)) & (i359 | i358);
                    int i361 = i360 >>> 17;
                    int i362 = (i360 & (~i361)) | ((~i360) & i361);
                    int i363 = i362 << 5;
                    int[] iArr10 = (int[]) objArr2[3];
                    int i364 = (i362 & (~i363)) | ((~i362) & i363);
                    i11 = 0;
                    iArr10[0] = i364;
                } else {
                    objArr2 = new java.lang.Object[]{null, new int[]{i9}, new int[]{i9}, new int[]{r5}, null};
                    int i365 = (((~(i7 | 314304753)) | (-939256832)) * 98) + 2116506944 + (((~(i7 | (-635169760))) | 314304753 | (~(635169759 | i9))) * (-49)) + (((~(314304753 | i9)) | 304087072) * 49);
                    int i366 = (i365 << 1) - i365;
                    int i367 = (i10 ^ i366) + ((i366 & i10) << 1);
                    int i368 = i367 << 13;
                    int i369 = (~(i367 & i368)) & (i368 | i367);
                    int i370 = i369 ^ (i369 >>> 17);
                    int i371 = i370 ^ (i370 << 5);
                    i11 = 0;
                }
                if (((int[]) objArr2[1])[i11] != i9) {
                    return objArr2;
                }
                int i372 = -android.view.View.MeasureSpec.makeMeasureSpec(i11, i11);
                java.lang.Object[] objArr71 = new java.lang.Object[1];
                k("\uf067흂⸭⼨㖲⌙될\ue284梴袂׃볁ॸ䗛⊤휦ﰡᲫℵ밪", ((i372 | 20) << 1) - (i372 ^ 20), objArr71);
                java.lang.Object[] objArr72 = {(java.lang.String) objArr71[i11]};
                java.lang.Object d14 = com.facetec.sdk.al.d(2084539986);
                if (d14 == null) {
                    char size3 = (char) (android.view.View.MeasureSpec.getSize(i11) + 6935);
                    int myTid = android.os.Process.myTid();
                    int resolveOpacity2 = android.graphics.drawable.Drawable.resolveOpacity(i11, i11);
                    byte length10 = (byte) $$a.length;
                    byte b16 = (byte) (length10 - 4);
                    java.lang.Object[] objArr73 = new java.lang.Object[1];
                    n(length10, b16, b16, objArr73);
                    d14 = com.facetec.sdk.al.c(size3, 2389 - (myTid >> 22), 23 - resolveOpacity2, -607062870, false, (java.lang.String) objArr73[0], new java.lang.Class[]{java.lang.String.class});
                }
                long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) d14).invoke(null, objArr72)).longValue();
                long j66 = -503532322;
                long j67 = 52;
                long j68 = j64 | j66;
                long j69 = longValue10 ^ j61;
                long j70 = j66 ^ j61;
                long j71 = ((-51) * j66) + (53 * longValue10) + (((j68 | longValue10) ^ j61) * j67) + ((-52) * (((j69 | j64) ^ j61) | ((j69 | j66) ^ j61) | (j68 ^ j61))) + (j67 * (((longValue10 | j70) ^ j61) | ((j70 | j64) ^ j61))) + 1475681664;
                int i373 = ((int) (j71 >> 32)) & (((i7 | (-1556988702)) * (-757)) + 739710604 + ((~((-273154057) | i2)) * 1514) + (((~(i7 | 1300752183)) | (-1573906240) | (~((-1283834646) | i2))) * 757));
                int i374 = ((int) j71) & ((((((~(i7 | (-252371664))) | 185254534) | (~(i7 | 1689598073))) * (-1136)) - 1738041619) + (((~((-252371664) | i2)) | (~(1689598073 | i2)) | (~(i7 | (-1622480945)))) * (-568)) + (((~(i7 | 252371663)) | (~(i7 | (-1689598074))) | (~((-185254535) | i2))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION));
                if (((i373 ^ i374) | (i373 & i374)) != 0) {
                    objArr3 = new java.lang.Object[]{null, new int[]{(~(i2 & 60)) & (i2 | 60)}, new int[]{i2}, new int[]{(~(r3 & r7)) & r8}, null};
                    int i375 = -(-((((308737669 | i2) * (-50)) - 2028487529) + (((~((-2098177) | i2)) | (~(i7 | (-10029161)))) * 50) + (((~(i7 | 308737669)) | (~(i7 | (-12127337))) | 10029160) * 50) + 16));
                    i12 = i4;
                    int i376 = (i12 & i375) + (i375 | i12);
                    int i377 = i376 << 13;
                    int i378 = (~(i377 & i376)) & (i377 | i376);
                    int i379 = i378 ^ (i378 >>> 17);
                    int i380 = i379 << 5;
                    int i381 = i379 | i380;
                    i13 = 0;
                } else {
                    i12 = i4;
                    objArr3 = new java.lang.Object[]{null, new int[]{i2}, new int[]{i2}, new int[1], null};
                    int elapsedCpuTime = (int) android.os.Process.getElapsedCpuTime();
                    int i382 = (((1021313842 | elapsedCpuTime) * 376) - 65292587) + (((~((~elapsedCpuTime) | 672657240)) | 350224418) * (-376)) + (((~(elapsedCpuTime | (-672657241))) | (-351792235)) * 376);
                    int c15 = com.facetec.sdk.fl.AnonymousClass16.c();
                    int i383 = i382 * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE;
                    int i384 = i12 * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE;
                    int i385 = (i383 & i384) + (i383 | i384);
                    int i386 = ~i382;
                    int i387 = ~i12;
                    int i388 = ~((i386 ^ i387) | (i386 & i387));
                    int i389 = ~c15;
                    int i390 = (i387 ^ i389) | (i387 & i389);
                    int i391 = ~i390;
                    int i392 = (i388 ^ i391) | (i388 & i391);
                    int i393 = (i382 ^ i12) | (i382 & i12);
                    int i394 = ~(i393 | c15);
                    int i395 = ((i392 ^ i394) | (i392 & i394)) * (-252);
                    int i396 = (i385 & i395) + (i395 | i385) + (i393 * (-252));
                    int i397 = ~((i390 & i382) | (i390 ^ i382));
                    int i398 = i382 | i12;
                    int i399 = ~((c15 ^ i398) | (c15 & i398));
                    int i400 = -(-(((i399 ^ i397) | (i399 & i397)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE));
                    int i401 = (i396 ^ i400) + ((i400 & i396) << 1);
                    int i402 = (i401 << 13) ^ i401;
                    int i403 = i402 >>> 17;
                    int i404 = (i402 & (~i403)) | ((~i402) & i403);
                    int i405 = i404 << 5;
                    int[] iArr11 = (int[]) objArr3[3];
                    int i406 = (~(i404 & i405)) & (i404 | i405);
                    i13 = 0;
                    iArr11[0] = i406;
                }
                if (((int[]) objArr3[1])[i13] != i2) {
                    return objArr3;
                }
                int i407 = -(android.view.ViewConfiguration.getTouchSlop() >> 8);
                int i408 = -android.view.KeyEvent.normalizeMetaState(i13);
                int offsetAfter = android.text.TextUtils.getOffsetAfter("", i13);
                int c16 = com.facetec.sdk.fl.AnonymousClass16.c();
                int i409 = offsetAfter * 367;
                int i410 = ~((c16 & (-25)) | (c16 ^ (-25)));
                int i411 = (((((i409 | 8808) << 1) - (i409 ^ 8808)) - (~(((offsetAfter ^ 24) | (offsetAfter & 24)) * (-366)))) - 1) + (((i410 & offsetAfter) | (i410 ^ offsetAfter)) * (-366));
                int i412 = ~offsetAfter;
                int i413 = ~((i412 ^ 24) | (i412 & 24));
                int i414 = (offsetAfter ^ (-25)) | (offsetAfter & (-25));
                int i415 = ~((c16 ^ i414) | (i414 & c16));
                int i416 = -(-(((i415 ^ i413) | (i415 & i413)) * 366));
                java.lang.Object[] objArr74 = new java.lang.Object[1];
                l(false, 35 - (~i407), "\u0010\u000eￏ\b\u0003\u0010\u0019ￏ\u0002\u000f\u0005\u0013\u0010\n\u0005\uffd0\u0017\u0007\u0014\u0000\u0005\u0002\u0015\u0002\uffd0\u0005\u0002\u0015\u0002\uffd0\u0005\u0002\u0015\u0002\uffd0\u0004", (i408 & 96) + (i408 | 96), ((i411 | i416) << 1) - (i416 ^ i411), objArr74);
                java.lang.Object[] objArr75 = {(java.lang.String) objArr74[0]};
                java.lang.Object d15 = com.facetec.sdk.al.d(1873189073);
                if (d15 == null) {
                    char lastIndexOf2 = (char) (6934 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                    int combineMeasuredStates = android.view.View.combineMeasuredStates(0, 0);
                    int axisFromString = android.view.MotionEvent.axisFromString("");
                    byte b17 = (byte) 3;
                    byte b18 = (byte) (b17 - 3);
                    java.lang.Object[] objArr76 = new java.lang.Object[1];
                    n(b17, b18, b18, objArr76);
                    d15 = com.facetec.sdk.al.c(lastIndexOf2, combineMeasuredStates + 2389, 22 - axisFromString, -934682071, false, (java.lang.String) objArr76[0], new java.lang.Class[]{java.lang.String.class});
                }
                long longValue11 = ((java.lang.Long) ((java.lang.reflect.Method) d15).invoke(null, objArr75)).longValue();
                long j72 = 330312838;
                long j73 = 306;
                long j74 = 305;
                long j75 = androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS + (j73 * j72) + (j73 * longValue11) + ((((j72 | longValue11) ^ j61) | ((j72 | j63) ^ j61)) * j74) + (j74 * (((j64 | j72) ^ j61) | (longValue11 ^ j61))) + 606766805;
                int i417 = (~(i7 | 1251393121)) | 354959762 | (~(i7 | (-1606347764)));
                int i418 = ((int) (j75 >> 32)) & ((((~(i2 | (-5121))) | i417) * 590) + 407067686 + (i417 * (-1180)) + (((~(i7 | 1606347763)) | (~(i7 | (-1251393122)))) * 590));
                int elapsedCpuTime2 = (int) android.os.Process.getElapsedCpuTime();
                int i419 = ((int) j75) & (((((~(471462349 | r5)) | (-1033499614)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) - 501357939) + ((~(1033499613 | elapsedCpuTime2)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + (((~(elapsedCpuTime2 | (-562037265))) | (~((~elapsedCpuTime2) | 965764060)) | 67735553) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE));
                if (((i418 ^ i419) | (i418 & i419)) != 0) {
                    objArr4 = new java.lang.Object[]{null, new int[]{i2 ^ 80}, new int[]{i2}, new int[1], null};
                    int maxMemory = (int) java.lang.Runtime.getRuntime().maxMemory();
                    int i420 = (i12 - (~(-(-((((((~(243955102 | r5)) | (~((-564820109) | maxMemory))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) - 1893454717) + (((~(maxMemory | 799702430)) | (~((~maxMemory) | (-9072781)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE)) + 16))))) - 1;
                    int i421 = i420 << 13;
                    int i422 = (i420 & (~i421)) | ((~i420) & i421);
                    int i423 = i422 >>> 17;
                    int i424 = (i422 & (~i423)) | ((~i422) & i423);
                    int i425 = i424 << 5;
                    int[] iArr12 = (int[]) objArr4[3];
                    int i426 = (i424 & (~i425)) | ((~i424) & i425);
                    i14 = 0;
                    iArr12[0] = i426;
                } else {
                    objArr4 = new java.lang.Object[]{null, new int[]{i2}, new int[]{i2}, new int[1], null};
                    int i427 = ~new java.util.Random().nextInt(1372237182);
                    int i428 = -(-(((~((-9207825) | i427)) * (-783)) + 1940197054 + (((~(i427 | (-246186033))) | (-567051039)) * 783)));
                    int i429 = (i12 ^ i428) + ((i428 & i12) << 1);
                    int i430 = i429 << 13;
                    int i431 = ((~i430) & i429) | ((~i429) & i430);
                    int i432 = i431 >>> 17;
                    int i433 = (~(i431 & i432)) & (i431 | i432);
                    int i434 = i433 << 5;
                    int[] iArr13 = (int[]) objArr4[3];
                    int i435 = (~(i433 & i434)) & (i433 | i434);
                    i14 = 0;
                    iArr13[0] = i435;
                }
                if (((int[]) objArr4[1])[i14] != i2) {
                    return objArr4;
                }
                int i436 = -android.graphics.Color.alpha(i14);
                java.lang.Object[] objArr77 = new java.lang.Object[1];
                k("ꊯ웈\uf292纛Ⴑꃶ泓ﾇ햫佾㚟緳嫐\ua7ce㘗퉗⼃쮲ॸ䗛㩘煿獆\udebb䣑얤㗅咋塃㝌聥霰ㄈ뜳䛳虨\ufdccˬￄ嚵\udba5㽹", (i436 ^ 42) + ((i436 & 42) << 1), objArr77);
                java.lang.Object[] objArr78 = {(java.lang.String) objArr77[i14]};
                java.lang.Object d16 = com.facetec.sdk.al.d(1873189073);
                if (d16 == null) {
                    char myTid2 = (char) ((android.os.Process.myTid() >> 22) + 6935);
                    int maximumDrawingCacheSize = android.view.ViewConfiguration.getMaximumDrawingCacheSize();
                    int longPressTimeout = android.view.ViewConfiguration.getLongPressTimeout();
                    byte b19 = (byte) 3;
                    byte b20 = (byte) (b19 - 3);
                    java.lang.Object[] objArr79 = new java.lang.Object[1];
                    n(b19, b20, b20, objArr79);
                    d16 = com.facetec.sdk.al.c(myTid2, 2389 - (maximumDrawingCacheSize >> 24), 23 - (longPressTimeout >> 16), -934682071, false, (java.lang.String) objArr79[0], new java.lang.Class[]{java.lang.String.class});
                }
                long longValue12 = ((java.lang.Long) ((java.lang.reflect.Method) d16).invoke(null, objArr78)).longValue();
                long j76 = 619232865;
                long j77 = 530;
                long j78 = 529;
                long j79 = org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_EXIFINFO + (j77 * j76) + (j77 * longValue12) + ((((j64 | j76) ^ j61) | ((j76 | longValue12) ^ j61)) * j78) + (j78 * (((j76 | j63) ^ j61) | (longValue12 ^ j61))) + 317846778;
                int i437 = ((int) (j79 >> 32)) & ((((~((-258783620) | i2)) | 174633089 | (~(1696010030 | i2))) * (-744)) + 1587634074 + ((i7 | 1611859500) * 744) + (((-174633090) | i2) * 744));
                int i438 = ((int) j79) & ((((~(i7 | (-1610896949))) * 52) - 837065951) + (((~(i7 | 184166795)) | (~(i7 | 1621393205)) | (-1795063744)) * (-52)) + (((~(i7 | (-184166796))) | 10496257) * 52));
                if (((i437 ^ i438) | (i437 & i438)) != 0) {
                    objArr5 = new java.lang.Object[]{null, new int[]{(~(i2 & 90)) & (i2 | 90)}, new int[]{i2}, new int[1], null};
                    int elapsedRealtime2 = (int) android.os.SystemClock.elapsedRealtime();
                    int i439 = ((((~((-603980657) | (~elapsedRealtime2))) | (~((-283115651) | elapsedRealtime2))) * (-272)) - 675104963) + (((~((-790214514) | elapsedRealtime2)) | 186233857) * (-272)) + (((~(elapsedRealtime2 | 790214513)) | (-469349508)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE);
                    int i440 = (i439 & 16) + (i439 | 16) + i12;
                    int i441 = i440 << 13;
                    int i442 = (i440 & (~i441)) | ((~i440) & i441);
                    int i443 = i442 ^ (i442 >>> 17);
                    int i444 = i443 << 5;
                    int[] iArr14 = (int[]) objArr5[3];
                    int i445 = (~(i443 & i444)) & (i443 | i444);
                    c2 = 0;
                    iArr14[0] = i445;
                } else {
                    objArr5 = new java.lang.Object[]{null, new int[]{i2}, new int[]{i2}, new int[]{r3}, null};
                    int i446 = -(-((((~(232652283 | i2)) | (-232783356) | (~(88212722 | i2))) * (-744)) + 2115469861 + ((i7 | 88081650) * 744) + ((232783355 | i2) * 744)));
                    int i447 = (i12 & i446) + (i446 | i12);
                    int i448 = i447 << 13;
                    int i449 = (~(i448 & i447)) & (i448 | i447);
                    int i450 = i449 >>> 17;
                    int i451 = (~(i449 & i450)) & (i449 | i450);
                    int i452 = i451 << 5;
                    int i453 = (~(i451 & i452)) & (i451 | i452);
                    c2 = 0;
                }
                if (((int[]) objArr5[1])[c2] != i2) {
                    return objArr5;
                }
                int i454 = -(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1));
                java.lang.Object[] objArr80 = new java.lang.Object[1];
                k("ू⽎숉ᵂꯪ₅Ⰻ쌧씌Ƕ៸┘햫佾ᷞ璸殠랚", (i454 & 19) + (i454 | 19), objArr80);
                java.lang.Object[] objArr81 = {(java.lang.String) objArr80[0]};
                java.lang.Object d17 = com.facetec.sdk.al.d(1873189073);
                if (d17 == null) {
                    char defaultSize2 = (char) (6935 - android.view.View.getDefaultSize(0, 0));
                    int deadChar2 = android.view.KeyEvent.getDeadChar(0, 0);
                    int indexOf4 = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                    byte b21 = (byte) 3;
                    byte b22 = (byte) (b21 - 3);
                    java.lang.Object[] objArr82 = new java.lang.Object[1];
                    n(b21, b22, b22, objArr82);
                    d17 = com.facetec.sdk.al.c(defaultSize2, 2389 - deadChar2, 22 - indexOf4, -934682071, false, (java.lang.String) objArr82[0], new java.lang.Class[]{java.lang.String.class});
                }
                long longValue13 = ((java.lang.Long) ((java.lang.reflect.Method) d17).invoke(null, objArr81)).longValue();
                long j80 = -146292256;
                long j81 = 46;
                long j82 = longValue13 ^ j61;
                long j83 = (j81 * j80) + (j81 * longValue13) + ((-90) * (((j82 | j64) ^ j61) | j80)) + ((-45) * (((longValue13 | j80) ^ j61) | ((j82 | j63) ^ j61))) + (45 * ((((j80 ^ j61) | j63) ^ j61) | j82 | ((j64 | j80) ^ j61))) + 1083371899;
                int elapsedCpuTime3 = (int) android.os.Process.getElapsedCpuTime();
                int i455 = ~elapsedCpuTime3;
                int i456 = ~(elapsedCpuTime3 | 1436532055);
                int i457 = ((int) (j83 >> 32)) & ((((~((-1419754836) | i455)) | 694355 | i456) * (-252)) + 1612203870 + ((i456 | (~(i455 | (-1419060481)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE));
                int i458 = ((int) j83) & (((((~((-296450091) | i2)) | 279588906) * 336) - 501357939) + (((~((-1733676501) | i2)) | 1716815316) * (-168)) + (((~(i7 | (-1733676501))) | (-296450091)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE));
                if (((i458 ^ i457) | (i457 & i458)) == 0) {
                    java.lang.Object[] objArr83 = {null, new int[]{i2}, new int[]{i2}, new int[]{r2 ^ (r2 << 5)}, null};
                    int i459 = -(-(((~(i7 | 251658203)) * (-116)) + 1755230089 + ((83436498 | i2) * 116) + (((~((-237428508) | i2)) | 69206802) * 116)));
                    int i460 = (i12 ^ i459) + ((i459 & i12) << 1);
                    int i461 = i460 << 13;
                    int i462 = ((~i461) & i460) | ((~i460) & i461);
                    int i463 = i462 >>> 17;
                    int i464 = (i462 & (~i463)) | ((~i462) & i463);
                    return objArr83;
                }
                java.lang.Object[] objArr84 = {null, new int[]{(i2 & (-101)) | (i7 & 100)}, new int[]{i2}, new int[1], null};
                int i465 = ((~(i7 | (-291504405))) * 52) + 82373185 + (((~(i7 | 782192130)) | (~(i7 | 461327124)) | (-1073696535)) * (-52)) + (((~(i7 | (-782192131))) | 169822720) * 52);
                int c17 = com.facetec.sdk.fl.AnonymousClass16.c();
                int i466 = -(-(i465 * (-565)));
                int i467 = (i466 ^ 9072) + ((i466 & 9072) << 1);
                int i468 = ~(i465 | (-17));
                int i469 = ~((c17 ^ (-17)) | (c17 & (-17)));
                int i470 = -(-(((i468 ^ i469) | (i468 & i469)) * (-566)));
                int i471 = (i467 ^ i470) + ((i470 & i467) << 1);
                int i472 = ~i465;
                int i473 = (~((i472 & 16) | (i472 ^ 16))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST;
                int i474 = (i471 ^ i473) + ((i473 & i471) << 1);
                int i475 = (i472 ^ (-17)) | (i472 & (-17));
                int i476 = -(-((~((i475 ^ c17) | (c17 & i475))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST));
                int i477 = -(-(((i474 | i476) << 1) - (i476 ^ i474)));
                int i478 = (i12 & i477) + (i477 | i12);
                int i479 = i478 << 13;
                int i480 = ((~i479) & i478) | ((~i478) & i479);
                int i481 = i480 >>> 17;
                int i482 = (i480 & (~i481)) | ((~i480) & i481);
                ((int[]) objArr84[3])[0] = i482 ^ (i482 << 5);
                return objArr84;
            } catch (java.lang.Throwable th23) {
                java.lang.Throwable cause7 = th23.getCause();
                if (cause7 != null) {
                    throw cause7;
                }
                throw th23;
            }
            try {
                r7 = new java.lang.Object[]{100L};
                java.lang.Class<?> cls10 = java.lang.Class.forName(str2);
                java.lang.Object[] objArr85 = new java.lang.Object[1];
                k("臘䂌녔윸", 3 - (~(-(android.view.ViewConfiguration.getFadingEdgeLength() >> 16))), objArr85);
                cls10.getMethod((java.lang.String) objArr85[0], java.lang.Long.TYPE).invoke(newInstance, r7);
                try {
                    try {
                        java.lang.Class<?> cls11 = java.lang.Class.forName(str2);
                        int indexOf5 = android.text.TextUtils.indexOf("", "", 0, 0);
                        int i483 = indexOf5 * 934;
                        int i484 = ((i483 | (-3728)) << 1) - (i483 ^ (-3728));
                        int i485 = ~com.facetec.sdk.fl.AnonymousClass16.c();
                        int i486 = ~((~indexOf5) | i485);
                        int i487 = -(-(((i486 & (-5)) | (i486 ^ (-5))) * (-933)));
                        int i488 = ((i484 | i487) << 1) - (i487 ^ i484);
                        int i489 = ((~((i485 ^ (-5)) | (i485 & (-5)))) | (~((indexOf5 ^ (-5)) | (indexOf5 & (-5))))) * 933;
                        java.lang.Object[] objArr86 = new java.lang.Object[1];
                        k("臘䂌녔윸", (i488 ^ i489) + ((i489 & i488) << 1) + ((~((indexOf5 ^ 4) | (indexOf5 & 4))) * 933), objArr86);
                        r7 = cls11.getMethod((java.lang.String) objArr86[0], java.lang.Long.TYPE);
                        r7.invoke(newInstance2, 10L);
                        try {
                            try {
                                exec.destroy();
                            } catch (java.io.IOException unused12) {
                                i18 = i4;
                                r15 = obj3;
                                r13 = str4;
                            }
                        } catch (java.lang.Exception unused13) {
                        }
                        try {
                            try {
                                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                d2 = com.facetec.sdk.al.d(785456562);
                                if (d2 == null) {
                                    try {
                                        char mirror = (char) ('0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                                        int combineMeasuredStates2 = android.view.View.combineMeasuredStates(0, 0);
                                        byte modifierMetaStateMask3 = (byte) android.view.KeyEvent.getModifierMetaStateMask();
                                        byte b23 = (byte) 0;
                                        byte b24 = b23;
                                        java.lang.Object[] objArr87 = new java.lang.Object[1];
                                        n(b23, b24, b24, objArr87);
                                        d2 = com.facetec.sdk.al.c(mirror, combineMeasuredStates2 + 1340, 23 - modifierMetaStateMask3, -1992399030, false, (java.lang.String) objArr87[0], null);
                                    } catch (java.lang.Exception unused14) {
                                        java.lang.Object[] objArr532 = new java.lang.Object[1];
                                        k("ⶫ㹞⣤械逐ꓸ\u0df5Ⱦ轚齆\uf624뿤檊蘇㖲⌙랩綫\udc98ⵧ䣑얤ℵ밪뫼휴灬㐡", android.graphics.Color.rgb(0, 0, 0) + 16777243, objArr532);
                                        throw new java.io.IOException((java.lang.String) objArr532[0]);
                                    }
                                }
                                sb2.append(((java.lang.reflect.Field) d2).get(newInstance).toString());
                                d3 = com.facetec.sdk.al.d(785456562);
                                if (d3 == null) {
                                    char windowTouchSlop = (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8);
                                    int windowTouchSlop2 = android.view.ViewConfiguration.getWindowTouchSlop();
                                    byte modifierMetaStateMask4 = (byte) android.view.KeyEvent.getModifierMetaStateMask();
                                    byte b25 = (byte) 0;
                                    byte b26 = b25;
                                    java.lang.Object[] objArr88 = new java.lang.Object[1];
                                    n(b25, b26, b26, objArr88);
                                    d3 = com.facetec.sdk.al.c(windowTouchSlop, 1340 - (windowTouchSlop2 >> 8), modifierMetaStateMask4 + com.google.common.base.Ascii.EM, -1992399030, false, (java.lang.String) objArr88[0], null);
                                }
                                sb2.append(((java.lang.reflect.Field) d3).get(newInstance2).toString());
                                java.lang.String obj7 = sb2.toString();
                                int i490 = -(-android.view.View.MeasureSpec.getSize(0));
                                int i491 = -(-android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0));
                                int i492 = -android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                                java.lang.Object[] objArr89 = new java.lang.Object[1];
                                l(false, 0 - (~i490), "\u0000", 11 - (~i491), (i492 ^ 1) + ((i492 & 1) << 1), objArr89);
                                java.lang.String[] split2 = obj7.split((java.lang.String) objArr89[0]);
                                length3 = split2.length;
                                i21 = 0;
                                while (i21 < length3) {
                                    java.lang.String str23 = split2[i21];
                                    int i493 = -(android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                    java.lang.Object[] objArr90 = new java.lang.Object[1];
                                    k("ﰡᲫ㞊̴廃ᬶ༻䠍␛ᅱ橊聈\uf6a5袝秹䚝륿┣灬㐡", (i493 ^ 19) + ((i493 & 19) << 1), objArr90);
                                    if (!str23.startsWith((java.lang.String) objArr90[0])) {
                                        int i494 = -(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                        int i495 = (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                        int i496 = (i495 * (-947)) + 91104;
                                        int i497 = ~i495;
                                        int i498 = ~((i6 ^ (-97)) | (i6 & (-97)));
                                        int i499 = ((i498 & i497) | (i497 ^ i498)) * (-948);
                                        int i500 = (i496 & i499) + (i496 | i499);
                                        int i501 = (i497 & (-97)) | (i497 ^ (-97));
                                        int i502 = (~((i501 ^ i7) | (i501 & i7))) * (-948);
                                        int gidForName2 = android.os.Process.getGidForName("");
                                        java.lang.Object[] objArr91 = new java.lang.Object[1];
                                        l(true, 20 - (~i494), "\u0001\u0010ￎ\u0004\t\u000f\u0012\u0004\u000e\u0001ￎ\r\u000f\u0003ￚ\u0005\u0007\u0001\u000b\u0003", (i500 ^ i502) + ((i502 & i500) << 1) + (((i495 ^ (-97)) | (i495 & (-97))) * 948), (gidForName2 ^ 3) + ((gidForName2 & 3) << 1), objArr91);
                                        if (str23.startsWith((java.lang.String) objArr91[0])) {
                                            continue;
                                        } else {
                                            int i503 = -android.text.TextUtils.getOffsetAfter("", 0);
                                            java.lang.Object[] objArr92 = new java.lang.Object[1];
                                            k("ﰡᲫ㞊̴廃ᬶ༻䠍", (i503 ^ 8) + ((i503 & 8) << 1), objArr92);
                                            if (str23.startsWith((java.lang.String) objArr92[0])) {
                                                int maxKeyCode = android.view.KeyEvent.getMaxKeyCode() >> 16;
                                                java.lang.Object[] objArr93 = new java.lang.Object[1];
                                                l(false, ((maxKeyCode | 1) << 1) - (maxKeyCode ^ 1), "\u0000", (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 59, 0 - (~(android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), objArr93);
                                                java.lang.String[] split3 = str23.split((java.lang.String) objArr93[0]);
                                                if (split3.length > 1 && split3[1].equalsIgnoreCase(str5)) {
                                                    java.lang.String str24 = (java.lang.String) java.lang.Class.forName(str).getField(str4).get(obj3);
                                                    ((int[]) objArr[2])[0] = i6;
                                                    ((int[]) objArr[1])[0] = (~(i6 & 20)) & (i6 | 20);
                                                    objArr = new java.lang.Object[]{str24, new int[1], new int[1], new int[1], null};
                                                    int i504 = ((~(1038188023 | i6)) * 623) + 1639226340 + ((i7 | 549550081) * (-623)) + (((~(633436549 | i6)) | (-1038188024) | (~(954301555 | i6))) * 623);
                                                    int i505 = -(-(i504 * (-69)));
                                                    int i506 = ~((i504 & (-17)) | (i504 ^ (-17)));
                                                    int i507 = ~((i504 ^ i6) | (i504 & i6));
                                                    int i508 = (i504 ^ 16) | (i504 & 16);
                                                    int i509 = (((((i505 ^ 1136) + ((i505 & 1136) << 1)) - (~(-(-(((i507 ^ i506) | (i506 & i507)) * (-140)))))) - 1) - (~(-(-((~((i508 & i6) | (i508 ^ i6))) * 70))))) - 1;
                                                    int i510 = ~i504;
                                                    int i511 = (~((i510 ^ 16) | (i510 & 16))) | i506;
                                                    int i512 = ~((i6 ^ 16) | (i6 & 16));
                                                    int i513 = -(-(((i511 ^ i512) | (i511 & i512)) * 70));
                                                    int i514 = -(-((i509 & i513) + (i513 | i509)));
                                                    i22 = i4;
                                                    int i515 = ((i22 | i514) << 1) - (i514 ^ i22);
                                                    int i516 = i515 << 13;
                                                    int i517 = ((~i516) & i515) | ((~i515) & i516);
                                                    int i518 = i517 ^ (i517 >>> 17);
                                                    ((int[]) objArr[3])[0] = i518 ^ (i518 << 5);
                                                    i5 = i22;
                                                    i8 = 1;
                                                    c = 0;
                                                    if (((int[]) objArr[i8])[c] == i6) {
                                                    }
                                                }
                                            } else {
                                                continue;
                                            }
                                        }
                                    }
                                    i21++;
                                    str4 = str4;
                                    obj3 = obj3;
                                }
                            } catch (java.io.IOException unused15) {
                            }
                            r15 = obj3;
                            r13 = str4;
                            i18 = i4;
                            i17 = i20 + 1;
                            i15 = i18;
                            str10 = r13;
                            obj2 = r15;
                            length2 = i19;
                            split = strArr;
                            i16 = 0;
                        } catch (java.lang.Exception unused16) {
                        }
                    } catch (java.lang.Throwable th24) {
                        java.lang.Throwable cause8 = th24.getCause();
                        if (cause8 != null) {
                            throw cause8;
                        }
                        throw th24;
                    }
                } catch (java.lang.InterruptedException e5) {
                    interruptedException = e5;
                    throw interruptedException;
                } catch (java.lang.Throwable th25) {
                    th3 = th25;
                    exec.destroy();
                    throw th3;
                }
            } catch (java.lang.Throwable th26) {
                java.lang.Throwable cause9 = th26.getCause();
                if (cause9 != null) {
                    throw cause9;
                }
                throw th26;
            }
            java.lang.StringBuilder sb22 = new java.lang.StringBuilder();
            d2 = com.facetec.sdk.al.d(785456562);
            if (d2 == null) {
            }
            sb22.append(((java.lang.reflect.Field) d2).get(newInstance).toString());
            d3 = com.facetec.sdk.al.d(785456562);
            if (d3 == null) {
            }
            sb22.append(((java.lang.reflect.Field) d3).get(newInstance2).toString());
            java.lang.String obj72 = sb22.toString();
            int i4902 = -(-android.view.View.MeasureSpec.getSize(0));
            int i4912 = -(-android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0));
            int i4922 = -android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            java.lang.Object[] objArr892 = new java.lang.Object[1];
            l(false, 0 - (~i4902), "\u0000", 11 - (~i4912), (i4922 ^ 1) + ((i4922 & 1) << 1), objArr892);
            java.lang.String[] split22 = obj72.split((java.lang.String) objArr892[0]);
            length3 = split22.length;
            i21 = 0;
            while (i21 < length3) {
            }
            r15 = obj3;
            r13 = str4;
            i18 = i4;
            i17 = i20 + 1;
            i15 = i18;
            str10 = r13;
            obj2 = r15;
            length2 = i19;
            split = strArr;
            i16 = 0;
            r15 = obj3;
            r13 = str4;
            i18 = i4;
            i17 = i20 + 1;
            i15 = i18;
            str10 = r13;
            obj2 = r15;
            length2 = i19;
            split = strArr;
            i16 = 0;
        } catch (java.lang.Throwable th27) {
            java.lang.Throwable cause10 = th27.getCause();
            if (cause10 != null) {
                throw cause10;
            }
            throw th27;
        }
    }
}
