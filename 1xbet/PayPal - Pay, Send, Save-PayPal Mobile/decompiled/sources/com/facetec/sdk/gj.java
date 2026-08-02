package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class gj {
    public static final com.facetec.sdk.fb A;
    public static final com.facetec.sdk.fb B;
    public static final com.facetec.sdk.fb C;
    public static final com.facetec.sdk.fb D;
    private static com.facetec.sdk.fd<java.lang.Class> E;
    private static com.facetec.sdk.fd<java.util.BitSet> F;
    private static com.facetec.sdk.fd<java.lang.Number> G;
    private static com.facetec.sdk.fd<java.lang.Number> H;
    private static com.facetec.sdk.fd<java.lang.Boolean> I;
    private static com.facetec.sdk.fd<java.util.concurrent.atomic.AtomicIntegerArray> J;
    private static com.facetec.sdk.fd<java.lang.Character> K;
    private static com.facetec.sdk.fd<java.util.concurrent.atomic.AtomicBoolean> L;
    private static com.facetec.sdk.fd<java.util.concurrent.atomic.AtomicInteger> M;
    private static com.facetec.sdk.fd<java.lang.Number> N;
    private static com.facetec.sdk.fd<java.lang.StringBuilder> O;
    private static com.facetec.sdk.fd<java.net.URI> P;
    private static com.facetec.sdk.fd<java.net.URL> Q;
    private static com.facetec.sdk.fd<java.lang.StringBuffer> R;
    private static com.facetec.sdk.fd<java.lang.String> S;
    private static com.facetec.sdk.fd<java.util.Locale> T;
    private static com.facetec.sdk.fd<java.util.UUID> U;
    private static com.facetec.sdk.fd<java.util.Currency> V;
    private static com.facetec.sdk.fd<java.util.Calendar> W;
    private static com.facetec.sdk.fd<java.net.InetAddress> X;

    /* renamed from: a, reason: collision with root package name */
    public static final com.facetec.sdk.fb f3599a;
    public static final com.facetec.sdk.fb b;
    public static final com.facetec.sdk.fb c;
    public static final com.facetec.sdk.fb d;
    public static final com.facetec.sdk.fd<java.lang.Boolean> e;
    public static final com.facetec.sdk.fb f;
    public static final com.facetec.sdk.fb g;
    public static final com.facetec.sdk.fb h;
    public static final com.facetec.sdk.fb i;
    public static final com.facetec.sdk.fb j;
    public static final com.facetec.sdk.fb k;
    public static final com.facetec.sdk.fd<java.lang.Number> l;
    public static final com.facetec.sdk.fd<java.math.BigDecimal> m;
    public static final com.facetec.sdk.fd<java.lang.Number> n;

    /* renamed from: o, reason: collision with root package name */
    public static final com.facetec.sdk.fd<java.lang.Number> f3600o;
    public static final com.facetec.sdk.fb p;
    public static final com.facetec.sdk.fb q;
    public static final com.facetec.sdk.fd<com.facetec.sdk.fo> r;
    public static final com.facetec.sdk.fd<java.math.BigInteger> s;
    public static final com.facetec.sdk.fb t;
    public static final com.facetec.sdk.fb u;
    public static final com.facetec.sdk.fb v;
    public static final com.facetec.sdk.fb w;
    public static final com.facetec.sdk.fb x;
    public static final com.facetec.sdk.fb y;
    public static final com.facetec.sdk.fd<com.facetec.sdk.es> z;

    static {
        com.facetec.sdk.fd<java.lang.Class> e2 = new com.facetec.sdk.fd<java.lang.Class>() { // from class: com.facetec.sdk.gj.1
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static int $10;
            private static int $11;

            /* renamed from: a, reason: collision with root package name */
            private static long f3601a;
            private static char[] b;
            private static long d;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:4:0x002b). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static java.lang.String $$c(byte b2, short s2, short s3) {
                int i2;
                int i3 = s3 * 2;
                byte[] bArr = $$a;
                int i4 = 110 - b2;
                int i5 = (s2 * 4) + 4;
                byte[] bArr2 = new byte[1 - i3];
                if (bArr == null) {
                    int i6 = i5;
                    int i7 = 0;
                    i4 += i5;
                    i5 = i6 + 1;
                    i2 = i7;
                    bArr2[i2] = (byte) i4;
                    if (i2 == 0 - i3) {
                        return new java.lang.String(bArr2, 0);
                    }
                    byte b3 = bArr[i5];
                    int i8 = i5;
                    i5 = i4;
                    i4 = b3;
                    i7 = i2 + 1;
                    i6 = i8;
                    i4 += i5;
                    i5 = i6 + 1;
                    i2 = i7;
                    bArr2[i2] = (byte) i4;
                    if (i2 == 0 - i3) {
                    }
                } else {
                    i2 = 0;
                    bArr2[i2] = (byte) i4;
                    if (i2 == 0 - i3) {
                    }
                }
            }

            static void init$0() {
                $$a = new byte[]{126, 75, -119, -91};
                $$b = 74;
            }

            private static void f(java.lang.String str, int i2, java.lang.Object[] objArr) {
                char[] cArr;
                if (str != null) {
                    $10 = ($11 + 61) % 128;
                    cArr = str.toCharArray();
                } else {
                    cArr = str;
                }
                com.facetec.sdk.hu huVar = new com.facetec.sdk.hu();
                char[] b2 = com.facetec.sdk.hu.b(d ^ 4732878740741522786L, cArr, i2);
                int i3 = 4;
                huVar.b = 4;
                while (huVar.b < b2.length) {
                    huVar.e = huVar.b - i3;
                    int i4 = huVar.b;
                    try {
                        java.lang.Object[] objArr2 = {java.lang.Long.valueOf(b2[huVar.b] ^ b2[huVar.b % i3]), java.lang.Long.valueOf(huVar.e), java.lang.Long.valueOf(d)};
                        java.lang.Object d2 = com.facetec.sdk.al.d(-474326228);
                        if (d2 == null) {
                            byte b3 = (byte) 1;
                            byte b4 = (byte) (b3 - 1);
                            d2 = com.facetec.sdk.al.c((char) (6935 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 2389 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 23, 1146429908, false, $$c(b3, b4, b4), new java.lang.Class[]{java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE});
                        }
                        b2[i4] = ((java.lang.Character) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).charValue();
                        java.lang.Object[] objArr3 = {huVar, huVar};
                        java.lang.Object d3 = com.facetec.sdk.al.d(-57140341);
                        if (d3 == null) {
                            byte b5 = (byte) 0;
                            d3 = com.facetec.sdk.al.c((char) (android.view.KeyEvent.getMaxKeyCode() >> 16), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 884, 32 - android.widget.ExpandableListView.getPackedPositionType(0L), 1534550387, false, $$c(b5, b5, b5), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                        }
                        ((java.lang.reflect.Method) d3).invoke(null, objArr3);
                        $11 = ($10 + 21) % 128;
                        i3 = 4;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                objArr[0] = new java.lang.String(b2, 4, b2.length - 4);
            }

            @Override // com.facetec.sdk.fd
            public final /* synthetic */ void a(com.facetec.sdk.gu guVar, java.lang.Class cls) throws java.io.IOException {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Attempted to serialize java.lang.Class: ");
                sb.append(cls.getName());
                sb.append(". Forgot to register a type adapter?");
                throw new java.lang.UnsupportedOperationException(sb.toString());
            }

            private static void g(char c2, int i2, int i3, java.lang.Object[] objArr) {
                com.facetec.sdk.hh hhVar = new com.facetec.sdk.hh();
                long[] jArr = new long[i3];
                hhVar.e = 0;
                while (hhVar.e < i3) {
                    int i4 = hhVar.e;
                    try {
                        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(b[i2 + i4])};
                        java.lang.Object d2 = com.facetec.sdk.al.d(-719238807);
                        if (d2 == null) {
                            byte b2 = (byte) 5;
                            byte b3 = (byte) (b2 - 5);
                            d2 = com.facetec.sdk.al.c((char) (45150 - android.graphics.Color.alpha(0)), 2150 - android.view.View.MeasureSpec.getSize(0), 23 - android.view.MotionEvent.axisFromString(""), 1926116241, false, $$c(b2, b3, b3), new java.lang.Class[]{java.lang.Integer.TYPE});
                        }
                        java.lang.Object[] objArr3 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(i4), java.lang.Long.valueOf(f3601a), java.lang.Integer.valueOf(c2)};
                        java.lang.Object d3 = com.facetec.sdk.al.d(671690243);
                        if (d3 == null) {
                            char scrollDefaultDelay = (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16);
                            float complexToFraction = android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f);
                            long uptimeMillis = android.os.SystemClock.uptimeMillis();
                            byte length = (byte) $$a.length;
                            byte b4 = (byte) (length - 4);
                            d3 = com.facetec.sdk.al.c(scrollDefaultDelay, 1834 - (complexToFraction > 0.0f ? 1 : (complexToFraction == 0.0f ? 0 : -1)), (uptimeMillis > 0L ? 1 : (uptimeMillis == 0L ? 0 : -1)) + 23, -1880730373, false, $$c(length, b4, b4), new java.lang.Class[]{java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE});
                        }
                        jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) d3).invoke(null, objArr3)).longValue();
                        java.lang.Object[] objArr4 = {hhVar, hhVar};
                        java.lang.Object d4 = com.facetec.sdk.al.d(898558648);
                        if (d4 == null) {
                            byte b5 = (byte) 0;
                            d4 = com.facetec.sdk.al.c((char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 2342, android.text.TextUtils.indexOf("", "", 0, 0) + 24, -1839099840, false, $$c((byte) ($$b & 60), b5, b5), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                        }
                        ((java.lang.reflect.Method) d4).invoke(null, objArr4);
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                char[] cArr = new char[i3];
                hhVar.e = 0;
                while (hhVar.e < i3) {
                    $11 = ($10 + 7) % 128;
                    cArr[hhVar.e] = (char) jArr[hhVar.e];
                    java.lang.Object[] objArr5 = {hhVar, hhVar};
                    java.lang.Object d5 = com.facetec.sdk.al.d(898558648);
                    if (d5 == null) {
                        byte b6 = (byte) 0;
                        d5 = com.facetec.sdk.al.c((char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), android.view.KeyEvent.getDeadChar(0, 0) + 2341, 24 - android.text.TextUtils.indexOf("", ""), -1839099840, false, $$c((byte) ($$b & 60), b6, b6), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                    }
                    ((java.lang.reflect.Method) d5).invoke(null, objArr5);
                    $11 = ($10 + 43) % 128;
                }
                objArr[0] = new java.lang.String(cArr);
            }

            @Override // com.facetec.sdk.fd
            public final /* synthetic */ java.lang.Class b(com.facetec.sdk.gt gtVar) throws java.io.IOException {
                throw new java.lang.UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            }

            static {
                init$0();
                $10 = 0;
                $11 = 1;
                d = -5271473856518861799L;
                b = new char[]{63153, 51015, 38201, 25410, 12656, 3953, 56674, 43840, 31043, 14149, 1308, 54143, 41299, 32559, 19773, 6944, 59758, 42774, 30057, 17170, 4352, 61185, 48402, 35600, 22803, 5909, 58784, 46024, 33211, 24520, 11723, 35608, 47773, 59640, 7929, 19611, 29427, 41092, 54983, 1261, 19180, 30951, 44797, 56566, 640, 12493, 26285, 38053, 56013, 2236, 16020, 27811, 37566, 49318, 63167, 9399, 27384, 39009, 52807, 64589, 8769, 20566, 43459, 38967, 51760, 15393, 28193, 20524, 33316, 62545, 9753, 26654, 23042, 35871, 65027, 8307, 4716, 17465, 46673, 63590, 10858, 7287, 20059, 45133, 57924, 41261, 37076, 49864, 13547, 26311, 22734, 35523, 64758, 12021, 24828, 21194, 34018, 63203, 10384, 27226, 23470, 2473, 65464, 44472, 37813, 16829, 14280, 58752, 43911, 39323, 20358, 15770, 58346, 53749, 34720, 30203, 15357, 59827, 57290, 36294, 29647, 8642, 6103, 50644, 35805, 30988, 12076, 7465, 49979, 27760, 23936, 3994, 63882, 43992, 38286, 18333, 12708, 58295, 44475, 40893, 18855, 15271, 58763, 55235, 33226, 29656, 15813, 61330, 55800, 35811, 30207, 10236, 4606, 50164, 36336, 32519, 10498, 6938, 50448, 46902, 24862, 21273, 7477, 53027, 47417, 27439, 8936, 4881, 16653, 46903, 58637, 56091, 2329, 32563, 44345, 58175, 53540, 27758, 23950, 4014, 63890, 43906, 38296, 18361, 12725, 58288, 44456, 40877, 49880, 62241, 41255, 22315, 1313, 15161, 59689, 40711, 19748, 777, 12547, 59138, 38162, 19302, 31084, 12137, 56686, 37728, 16764, 35886, 48599, 61387, 6635, 19408, 30156, 42945, 53745, 1010, 19950, 32735, 43445, 56253, 1478, 14243, 24974, 37776, 56716, 3980, 14721, 27557, 38335, 51127};
                f3601a = 5868467912842436065L;
            }

            public static java.lang.Object[] c(android.content.Context context, int i2, int i3) {
                if (context == null) {
                    java.lang.Object[] objArr = {null, new int[]{i2}, new int[]{i2}, new int[1]};
                    int i4 = ~new java.util.Random().nextInt();
                    int i5 = ~(302388164 | i4);
                    int i6 = ((522310431 | i5) * 764) + 694600395 + (((~(i4 | 522310431)) | 393408) * (-1528)) + ((220709083 | i5) * 764);
                    int a2 = com.facetec.sdk.ol.AnonymousClass3.a();
                    int i7 = (i6 * 465) + (i3 * (-463));
                    int i8 = ~i3;
                    int i9 = ~a2;
                    int i10 = ~((i8 ^ i6) | (i8 & i6));
                    int i11 = (~((i8 ^ i9) | (i8 & i9))) | i10;
                    int i12 = ~(i9 | i6);
                    int i13 = ((i12 ^ i11) | (i12 & i11)) * 464;
                    int i14 = (~i6) | a2;
                    int i15 = (((i7 ^ i13) + ((i7 & i13) << 1)) - (~(((i8 ^ i14) | (i8 & i14)) * (-464)))) - 1;
                    int i16 = ((~((a2 ^ i6) | (a2 & i6))) | i10) * 464;
                    int i17 = (i15 & i16) + (i16 | i15);
                    int i18 = (i17 << 13) ^ i17;
                    int i19 = i18 >>> 17;
                    int i20 = (~(i18 & i19)) & (i18 | i19);
                    ((int[]) objArr[3])[0] = i20 ^ (i20 << 5);
                    return objArr;
                }
                try {
                    int combineMeasuredStates = android.view.View.combineMeasuredStates(0, 0);
                    int a3 = com.facetec.sdk.ol.AnonymousClass3.a();
                    int i21 = (combineMeasuredStates * (-958)) - 958;
                    int i22 = ~a3;
                    int i23 = ~((i22 ^ (-2)) | (i22 & (-2)));
                    int i24 = ~combineMeasuredStates;
                    int i25 = ~((i24 ^ a3) | (i24 & a3));
                    int i26 = ((i23 & i25) | (i23 ^ i25) | (~((i22 ^ combineMeasuredStates) | (i22 & combineMeasuredStates)))) * 959;
                    int i27 = -(-((~((combineMeasuredStates ^ 1) | (combineMeasuredStates & 1))) * (-959)));
                    int i28 = ~((i22 ^ i24) | (i24 & i22));
                    int i29 = ~((a3 ^ (-2)) | (a3 & (-2)));
                    int i30 = (i28 ^ i29) | (i28 & i29);
                    int i31 = ~((combineMeasuredStates ^ a3) | (combineMeasuredStates & a3));
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    f("\u2e75ꄿ⸟맧雄栥⭧쫔\u0be1乶Ŷᓼ旎됙杛㻤必驹뵳墐린쁠錩拋鎑☝\ue945賹췓\u0c64쾬ꤍ✱玀◿\uf348Ż妇篘ᵥ筘뾔", ((((i21 ^ i26) + ((i21 & i26) << 1)) - (~i27)) - 1) + (((i31 ^ i30) | (i30 & i31)) * 959), objArr2);
                    java.lang.Object[] objArr3 = (java.lang.Object[]) java.lang.reflect.Array.newInstance(java.lang.Class.forName((java.lang.String) objArr2[0]), 2);
                    int i32 = -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                    int a4 = com.facetec.sdk.ol.AnonymousClass3.a();
                    int i33 = i32 * (-464);
                    int i34 = ((-36839495) & i33) + (i33 | (-36839495));
                    int i35 = ~i32;
                    int i36 = ~(a4 | 39655);
                    int i37 = -(-(((i36 & i35) | (i35 ^ i36)) * (-465)));
                    int i38 = -(-(((~(i35 | a4)) | 39655) * 930));
                    int i39 = (a4 & 39655) | (a4 ^ 39655);
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    g((char) ((((((i34 ^ i37) + ((i34 & i37) << 1)) - (~i38)) - 1) - (~(((i35 ^ i39) | (i35 & i39)) * 465))) - 1), android.widget.ExpandableListView.getPackedPositionGroup(0L), 31 - android.view.View.MeasureSpec.getMode(0), objArr4);
                    try {
                        java.lang.Object[] objArr5 = {(java.lang.String) objArr4[0]};
                        int i40 = -android.graphics.Color.blue(0);
                        int a5 = com.facetec.sdk.ol.AnonymousClass3.a();
                        int i41 = i40 * 46;
                        int i42 = (i41 & 46) + (i41 | 46);
                        int i43 = ~a5;
                        int i44 = ~((i43 ^ (-2)) | (i43 & (-2)));
                        int i45 = ((i40 ^ i44) | (i44 & i40)) * (-90);
                        int i46 = ((i42 | i45) << 1) - (i42 ^ i45);
                        int i47 = ~((a5 ^ (-2)) | (a5 & (-2)));
                        int i48 = ~((i40 ^ 1) | (i40 & 1));
                        int i49 = -(-(((i47 ^ i48) | (i48 & i47)) * (-45)));
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        f("\u2e75ꄿ⸟맧雄栥⭧쫔\u0be1乶Ŷᓼ旎됙杛㻤必驹뵳墐린쁠錩拋鎑☝\ue945賹췓\u0c64쾬ꤍ✱玀◿\uf348Ż妇篘ᵥ筘뾔", (i46 & i49) + (i46 | i49) + (((~((~i40) | a5)) | (-2) | (~((i40 & i43) | (i43 ^ i40)))) * 45), objArr6);
                        objArr3[0] = java.lang.Class.forName((java.lang.String) objArr6[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr5);
                        int rgb = android.graphics.Color.rgb(0, 0, 0);
                        int i50 = (rgb * (-755)) + 173407053;
                        int i51 = ~rgb;
                        int i52 = ~((i51 ^ (-16836418)) | ((-16836418) & i51));
                        int i53 = i52 * 1512;
                        int i54 = (rgb ^ 16836417) | (16836417 & rgb);
                        int i55 = ~((i54 ^ i2) | (i54 & i2));
                        int i56 = ((((i50 | i53) << 1) - (i50 ^ i53)) - (~(((i55 & i52) | (i52 ^ i55)) * (-756)))) - 1;
                        int i57 = ~i2;
                        int i58 = ((i54 ^ i57) | (i54 & i57)) * 756;
                        int indexOf = android.text.TextUtils.indexOf("", "", 0);
                        int i59 = -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        g((char) (((i56 | i58) << 1) - (i58 ^ i56)), indexOf + 31, (i59 & 30) + (i59 | 30), objArr7);
                        try {
                            java.lang.Object[] objArr8 = {(java.lang.String) objArr7[0]};
                            int i60 = -(-android.widget.ExpandableListView.getPackedPositionType(0L));
                            java.lang.Object[] objArr9 = new java.lang.Object[1];
                            f("\u2e75ꄿ⸟맧雄栥⭧쫔\u0be1乶Ŷᓼ旎됙杛㻤必驹뵳墐린쁠錩拋鎑☝\ue945賹췓\u0c64쾬ꤍ✱玀◿\uf348Ż妇篘ᵥ筘뾔", (i60 ^ 1) + ((i60 & 1) << 1), objArr9);
                            objArr3[1] = java.lang.Class.forName((java.lang.String) objArr9[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr8);
                            try {
                                int trimmedLength = android.text.TextUtils.getTrimmedLength("");
                                int a6 = com.facetec.sdk.ol.AnonymousClass3.a();
                                int i61 = (trimmedLength * com.knotapi.knot.utilities.Constants.ID_KROGER) + 18727920;
                                int i62 = (trimmedLength ^ 50616) | (trimmedLength & 50616);
                                int i63 = ~a6;
                                int i64 = -(-(((i62 & i63) | (i62 ^ i63)) * (-369)));
                                int i65 = ((i61 | i64) << 1) - (i61 ^ i64);
                                int i66 = ~trimmedLength;
                                int i67 = (i66 ^ i63) | (i63 & i66);
                                int i68 = ~i67;
                                int i69 = -(-(((i68 ^ 50616) | (i68 & 50616)) * (-369)));
                                int i70 = ~(((-50617) ^ trimmedLength) | (trimmedLength & (-50617)));
                                int i71 = ~(trimmedLength | a6);
                                int i72 = (i71 & i70) | (i70 ^ i71);
                                int i73 = ~((i67 & 50616) | (i67 ^ 50616));
                                char c2 = (char) ((i65 ^ i69) + ((i69 & i65) << 1) + (((i72 ^ i73) | (i72 & i73)) * 369));
                                int i74 = -(android.view.ViewConfiguration.getDoubleTapTimeout() >> 16);
                                int a7 = com.facetec.sdk.ol.AnonymousClass3.a();
                                int i75 = -(-(((i74 ^ a7) | (i74 & a7)) * (-50)));
                                int i76 = (~i74) | (-63);
                                int i77 = ~((i76 & a7) | (i76 ^ a7));
                                int i78 = ~a7;
                                int i79 = i78 | (-63);
                                int i80 = ~(i79 | i74);
                                int i81 = (((((i74 * 51) - 3038) - (~i75)) - 1) - (~(((i80 & i77) | (i77 ^ i80)) * 50))) - 1;
                                int i82 = ~i79;
                                int i83 = ~(i74 | (-63));
                                int i84 = (i82 & i83) | (i82 ^ i83);
                                int i85 = ~(i74 | i78);
                                int i86 = ((i84 ^ i85) | (i85 & i84)) * 50;
                                int i87 = -(android.view.KeyEvent.getMaxKeyCode() >> 16);
                                int i88 = i87 * 624;
                                int i89 = ((i88 | (-14306)) << 1) - (i88 ^ (-14306));
                                int i90 = (i87 ^ (-24)) | (i87 & (-24));
                                int i91 = i89 + ((~(i90 | i2)) * 623);
                                int i92 = ~i87;
                                int i93 = ~((i92 & 23) | (i92 ^ 23));
                                int i94 = -(-(((i93 & i57) | (i57 ^ i93)) * (-623)));
                                int i95 = (~i90) | (~(i2 | (-24)));
                                int i96 = ~(i87 | i2);
                                java.lang.Object[] objArr10 = new java.lang.Object[1];
                                g(c2, (i81 ^ i86) + ((i86 & i81) << 1), (((i91 | i94) << 1) - (i91 ^ i94)) + (((i96 ^ i95) | (i96 & i95)) * 623), objArr10);
                                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr10[0]);
                                java.lang.Object[] objArr11 = new java.lang.Object[1];
                                f("낑䔥냶銤濱谻&㏐锜ꨡ⨭\uedcdאַ倓䰧쟙섻繻陹ꆡ❓", -android.widget.ExpandableListView.getPackedPositionChild(0L), objArr11);
                                java.lang.Object invoke = cls.getMethod((java.lang.String) objArr11[0], null).invoke(context, null);
                                try {
                                    int i97 = -(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                    int a8 = com.facetec.sdk.ol.AnonymousClass3.a();
                                    int i98 = i97 * (-381);
                                    int i99 = (9718272 & i98) + (i98 | 9718272);
                                    int i100 = ~i97;
                                    int i101 = i100 * (-191);
                                    int i102 = (i99 ^ i101) + ((i99 & i101) << 1);
                                    int i103 = ~((a8 ^ 50616) | (a8 & 50616));
                                    int i104 = ((i97 & i103) | (i97 ^ i103)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE;
                                    int i105 = ~((i100 ^ 50616) | (i100 & 50616));
                                    int i106 = ~a8;
                                    int i107 = ~((i106 ^ 50616) | (i106 & 50616));
                                    char c3 = (char) ((((i102 | i104) << 1) - (i104 ^ i102)) + (((i105 & i107) | (i107 ^ i105)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE));
                                    int i108 = -(android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                    int i109 = (i108 * (-159)) - 10017;
                                    int i110 = ~i108;
                                    int i111 = ((i110 ^ 63) | (i110 & 63)) * 160;
                                    int i112 = ~((i57 ^ i108) | (i57 & i108));
                                    int i113 = ~((i108 ^ 63) | (i108 & 63));
                                    int i114 = -(-(((i112 & i113) | (i112 ^ i113)) * (-160)));
                                    int i115 = -(-android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                                    g(c3, ((((i109 ^ i111) + ((i109 & i111) << 1)) - (~i114)) - 1) + ((i108 | (~((i57 ^ (-64)) | (i57 & (-64))))) * 160), (i115 & 24) + (i115 | 24), objArr12);
                                    java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr12[0]);
                                    char blue = (char) (52560 - android.graphics.Color.blue(0));
                                    int i116 = -android.graphics.Color.rgb(0, 0, 0);
                                    int a9 = com.facetec.sdk.ol.AnonymousClass3.a();
                                    int i117 = i116 * 399;
                                    int i118 = (1895859323 & i117) + (i117 | 1895859323);
                                    int i119 = ~i116;
                                    int i120 = ~((i119 ^ (-16777131)) | (i119 & (-16777131)));
                                    int i121 = ~((i116 ^ 16777130) | (i116 & 16777130));
                                    int i122 = (i120 ^ i121) | (i120 & i121);
                                    int i123 = ~((a9 ^ 16777130) | (a9 & 16777130));
                                    int i124 = ((i122 ^ i123) | (i122 & i123)) * 398;
                                    int i125 = ((i118 | i124) << 1) - (i124 ^ i118);
                                    int i126 = ((i116 ^ (-16777131)) | (i116 & (-16777131))) * (-1194);
                                    int i127 = (i125 & i126) + (i126 | i125);
                                    int i128 = ~a9;
                                    int i129 = ~((i128 ^ 16777130) | (i128 & 16777130));
                                    int i130 = ~((-16777131) | i119);
                                    int i131 = (i129 ^ i130) | (i129 & i130);
                                    int i132 = ((i131 ^ i121) | (i131 & i121)) * 398;
                                    int i133 = -(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                                    g(blue, ((i127 | i132) << 1) - (i132 ^ i127), ((i133 | 15) << 1) - (i133 ^ 15), objArr13);
                                    try {
                                        java.lang.Object[] objArr14 = {cls2.getMethod((java.lang.String) objArr13[0], null).invoke(context, null), 64};
                                        int deadChar = android.view.KeyEvent.getDeadChar(0, 0);
                                        int i134 = ~((i57 ^ (-2)) | (i57 & (-2)));
                                        int i135 = ~((deadChar ^ (-2)) | (deadChar & (-2)));
                                        int i136 = (i134 ^ i135) | (i134 & i135);
                                        int i137 = ~(i57 | deadChar);
                                        int i138 = (i136 ^ i137) | (i136 & i137);
                                        int i139 = ~deadChar;
                                        int i140 = (i139 ^ 1) | (i139 & 1);
                                        int i141 = ~((i140 & i2) | (i140 ^ i2));
                                        int i142 = ~((i139 & i57) | (i139 ^ i57));
                                        int i143 = ~((i57 ^ 1) | (i57 & 1));
                                        java.lang.Object[] objArr15 = new java.lang.Object[1];
                                        f("좐瀳죱雊窿뤦ј⚼\ued13鼽⹌\uf8cc茫攏䡪튂뤱䭢鈄뒤彐ᅵ뱂軎畭\uf747옳惓⭿\udd55\ue0f9䔧솊ꊽેἿ\ue782", ((((deadChar * (-589)) + 591) - (~(((i141 & i138) | (i138 ^ i141)) * 590))) - 1) + (i138 * (-1180)) + (((i142 & i143) | (i142 ^ i143)) * 590), objArr15);
                                        java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr15[0]);
                                        java.lang.Object[] objArr16 = new java.lang.Object[1];
                                        f("玁䋡珦횠臆诿䐢\udde7嘌귥温Ϻ㠾埗ࠧ⧡ȣ禱", 0 - (~(-(android.view.ViewConfiguration.getEdgeSlop() >> 16))), objArr16);
                                        java.lang.Object invoke2 = cls3.getMethod((java.lang.String) objArr16[0], java.lang.String.class, java.lang.Integer.TYPE).invoke(invoke, objArr14);
                                        int i144 = -(-android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                                        int i145 = -(-android.widget.ExpandableListView.getPackedPositionGroup(0L));
                                        int i146 = (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                        int i147 = i146 * lib.android.paypal.com.magnessdk.g.e;
                                        int i148 = ~(i2 | (-31));
                                        int i149 = (i57 ^ i146) | (i57 & i146);
                                        int i150 = ~((i149 ^ 30) | (i149 & 30));
                                        int i151 = ((((i147 | 12210) << 1) - (i147 ^ 12210)) - (~(-(-(((i148 & i150) | (i148 ^ i150)) * (-406)))))) - 1;
                                        int i152 = (~((i57 & (-31)) | (i57 ^ (-31)) | i146)) * (-406);
                                        int i153 = (i151 & i152) + (i152 | i151);
                                        int i154 = ~i146;
                                        int i155 = -(-(((~((i154 ^ i2) | (i154 & i2))) | (~((i57 ^ 30) | (i57 & 30)))) * 406));
                                        java.lang.Object[] objArr17 = new java.lang.Object[1];
                                        g((char) ((i144 ^ 1569) + ((i144 & 1569) << 1)), 98 - (~i145), (i153 ^ i155) + ((i155 & i153) << 1), objArr17);
                                        java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr17[0]);
                                        java.lang.Object[] objArr18 = new java.lang.Object[1];
                                        f("涆몭淵켳瑔玿嶢⡋䠋喾瞤\uf67b☻꾍", -((byte) android.view.KeyEvent.getModifierMetaStateMask()), objArr18);
                                        java.lang.Object[] objArr19 = (java.lang.Object[]) cls4.getField((java.lang.String) objArr18[0]).get(invoke2);
                                        int length = objArr19.length;
                                        int i156 = 0;
                                        while (i156 < length) {
                                            java.lang.Object obj = objArr19[i156];
                                            int i157 = -android.text.TextUtils.getOffsetAfter("", 0);
                                            java.lang.Object[] objArr20 = new java.lang.Object[1];
                                            f("綇냬緟\uf6f8蹚禹搻툛塒", ((i157 | 1) << 1) - (i157 ^ 1), objArr20);
                                            try {
                                                java.lang.Object[] objArr21 = {(java.lang.String) objArr20[0]};
                                                int i158 = (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                                int a10 = com.facetec.sdk.ol.AnonymousClass3.a();
                                                int i159 = i158 * (-919);
                                                int i160 = (i159 & 919) + (i159 | 919);
                                                int i161 = ~i158;
                                                int i162 = ~(i161 | a10);
                                                int i163 = ~a10;
                                                java.lang.Object[] objArr22 = objArr19;
                                                int i164 = ~((i163 ^ i158) | (i163 & i158));
                                                int i165 = -(-(((i162 ^ i164) | (i164 & i162)) * 920));
                                                int i166 = (i160 & i165) + (i165 | i160);
                                                int i167 = ~i161;
                                                int i168 = ~((i161 & i163) | (i161 ^ i163));
                                                int i169 = ((i167 ^ i168) | (i167 & i168)) * 920;
                                                int i170 = ((i166 | i169) << 1) - (i169 ^ i166);
                                                int i171 = ~((a10 ^ (-1)) | a10);
                                                int i172 = (i171 ^ i168) | (i168 & i171);
                                                int i173 = ~((i158 ^ a10) | (i158 & a10));
                                                int i174 = -(-(((i172 ^ i173) | (i172 & i173)) * 920));
                                                int i175 = -android.view.View.resolveSizeAndState(0, 0, 0);
                                                int i176 = -(android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                                java.lang.Object[] objArr23 = new java.lang.Object[1];
                                                g((char) ((i170 & i174) + (i174 | i170)), 128 - (~i175), ((i176 | 37) << 1) - (i176 ^ 37), objArr23);
                                                java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr23[0]);
                                                char c4 = (char) (20116 - (~(android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))));
                                                char mirror = android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                int i177 = -android.view.Gravity.getAbsoluteGravity(0, 0);
                                                int a11 = com.facetec.sdk.ol.AnonymousClass3.a();
                                                int i178 = ~i177;
                                                int i179 = i178 | 11;
                                                int i180 = -(-((~((i177 ^ (-12)) | (i177 & (-12)))) * (-1042)));
                                                int i181 = length;
                                                int i182 = ~(i177 | (-12));
                                                int i183 = i156;
                                                int i184 = ~a11;
                                                int i185 = (i178 ^ i184) | (i184 & i178);
                                                int i186 = ~((i185 ^ 11) | (i185 & 11));
                                                java.lang.Object[] objArr24 = new java.lang.Object[1];
                                                g(c4, mirror + 'v', (((((i177 * (-520)) + 5742) + ((~((i179 & a11) | (i179 ^ a11))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL)) - (~i180)) - 1) + (((i182 ^ i186) | (i186 & i182)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL), objArr24);
                                                java.lang.Object invoke3 = cls5.getMethod((java.lang.String) objArr24[0], java.lang.String.class).invoke(null, objArr21);
                                                try {
                                                    java.lang.Object[] objArr25 = new java.lang.Object[1];
                                                    f("慬뭍愍燿䗞牘\ue36d\u19dd䓯呃쥹잭⫗깱꽟\uede3Ⴭ耜由诅\uf6ac\uda0b孷놬\udc99㰽℃徲芐ᘻ߳穂", -((byte) android.view.KeyEvent.getModifierMetaStateMask()), objArr25);
                                                    java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr25[0]);
                                                    char c5 = (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                    int indexOf2 = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                    int i187 = -(-android.view.View.resolveSize(0, 0));
                                                    java.lang.Object[] objArr26 = new java.lang.Object[1];
                                                    g(c5, 176 - indexOf2, (i187 & 11) + (i187 | 11), objArr26);
                                                    try {
                                                        java.lang.Object[] objArr27 = {new java.io.ByteArrayInputStream((byte[]) cls6.getMethod((java.lang.String) objArr26[0], null).invoke(obj, null))};
                                                        char pressedStateDuration = (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16);
                                                        int i188 = -(-android.view.View.MeasureSpec.getMode(0));
                                                        int i189 = -(android.os.Process.myTid() >> 22);
                                                        java.lang.Object[] objArr28 = new java.lang.Object[1];
                                                        g(pressedStateDuration, ((i188 | 129) << 1) - (i188 ^ 129), ((i189 | 37) << 1) - (i189 ^ 37), objArr28);
                                                        java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr28[0]);
                                                        int maxKeyCode = android.view.KeyEvent.getMaxKeyCode() >> 16;
                                                        int i190 = -android.text.TextUtils.indexOf("", "");
                                                        int a12 = com.facetec.sdk.ol.AnonymousClass3.a();
                                                        int i191 = i190 * 71;
                                                        int i192 = (i191 ^ (-12972)) + ((i191 & (-12972)) << 1);
                                                        int i193 = ~i190;
                                                        int i194 = ~((i193 & 188) | (i193 ^ 188));
                                                        int i195 = ~((a12 ^ 188) | (a12 & 188));
                                                        int i196 = -(-(((i195 ^ i194) | (i195 & i194)) * (-140)));
                                                        int i197 = (i190 ^ 188) | (i190 & 188);
                                                        int i198 = (i192 ^ i196) + ((i196 & i192) << 1) + ((~((i197 & a12) | (i197 ^ a12))) * 70);
                                                        int i199 = (~(i193 | 188)) | (~(i190 | (-189)));
                                                        int i200 = ~(i190 | a12);
                                                        int i201 = ((i200 ^ i199) | (i199 & i200)) * 70;
                                                        int i202 = -(-android.view.MotionEvent.axisFromString(""));
                                                        java.lang.Object[] objArr29 = new java.lang.Object[1];
                                                        g((char) ((44709 ^ maxKeyCode) + ((maxKeyCode & 44709) << 1)), (i198 & i201) + (i201 | i198), (i202 & 20) + (i202 | 20), objArr29);
                                                        java.lang.Object invoke4 = cls7.getMethod((java.lang.String) objArr29[0], java.io.InputStream.class).invoke(invoke3, objArr27);
                                                        int length2 = objArr3.length;
                                                        int i203 = 0;
                                                        for (int i204 = 2; i203 < i204; i204 = 2) {
                                                            java.lang.Object obj2 = objArr3[i203];
                                                            try {
                                                                int i205 = -(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                                java.lang.Object[] objArr30 = new java.lang.Object[1];
                                                                f("↹뚔⇓\ud928纨美䮨⊸ѻ妀憯ﲖ樔ꎵޏ횕倄超\uddf1냸뙻ퟋ\uf3a0諑鰐ㆳ覃擦쉔ᯥ꼢䄸⢫搒䔡ᬬອ个", ((i205 | 1) << 1) - (i205 ^ 1), objArr30);
                                                                java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr30[0]);
                                                                int longPressTimeout = android.view.ViewConfiguration.getLongPressTimeout() >> 16;
                                                                int i206 = longPressTimeout * (-495);
                                                                int i207 = ((-28426365) & i206) + (i206 | (-28426365));
                                                                int i208 = ~longPressTimeout;
                                                                int i209 = -(-(((~((i208 ^ i2) | (i208 & i2))) | (~((-57428) | i208))) * 992));
                                                                int i210 = (i207 & i209) + (i207 | i209);
                                                                int i211 = (~((i208 & (-57428)) | ((-57428) ^ i208))) | (~(i208 | i2));
                                                                int i212 = (longPressTimeout ^ i57) | (longPressTimeout & i57);
                                                                int i213 = ~((i212 ^ 57427) | (i212 & 57427));
                                                                int i214 = -(-(((i213 ^ i211) | (i213 & i211)) * (-496)));
                                                                char c6 = (char) ((i210 ^ i214) + ((i214 & i210) << 1) + (((i2 ^ 57427) | (57427 & i2)) * 496));
                                                                int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                                                int i215 = (i57 ^ lastIndexOf) | (i57 & lastIndexOf);
                                                                int i216 = ~((i57 ^ (-209)) | (i57 & (-209)));
                                                                int i217 = ~((lastIndexOf ^ (-209)) | (lastIndexOf & (-209)));
                                                                int i218 = (i216 & i217) | (i216 ^ i217);
                                                                int i219 = ~i215;
                                                                int i220 = (lastIndexOf * (-51)) + 11024 + ((~((i215 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOME_VALUE) | (i215 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOME_VALUE))) * 52) + (((i218 ^ i219) | (i218 & i219)) * (-52));
                                                                int i221 = ~lastIndexOf;
                                                                int i222 = ~((i221 ^ i57) | (i221 & i57));
                                                                int i223 = ~((i221 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOME_VALUE) | (i221 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOME_VALUE));
                                                                int i224 = -(-(((i223 ^ i222) | (i223 & i222)) * 52));
                                                                int i225 = -(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                                                int a13 = com.facetec.sdk.ol.AnonymousClass3.a();
                                                                int i226 = ~i225;
                                                                int i227 = ~a13;
                                                                int i228 = (i226 ^ i227) | (i227 & i226);
                                                                int i229 = ((((i225 * 483) + 5808) + (((~((i226 ^ (-25)) | (i226 & (-25)))) | (~i228)) * (-241))) - (~(-(-(((i225 ^ 24) | (i225 & 24)) * (-482)))))) - 1;
                                                                int i230 = ~((i225 & (-25)) | (i225 ^ (-25)));
                                                                int i231 = ~((i228 & 24) | (i228 ^ 24));
                                                                int i232 = -(-(((i230 ^ i231) | (i230 & i231)) * 241));
                                                                java.lang.Object[] objArr31 = new java.lang.Object[1];
                                                                g(c6, ((i220 | i224) << 1) - (i224 ^ i220), (i229 ^ i232) + ((i229 & i232) << 1), objArr31);
                                                                if (obj2.equals(cls8.getMethod((java.lang.String) objArr31[0], null).invoke(invoke4, null))) {
                                                                    java.lang.Object[] objArr32 = {null, new int[]{i2}, new int[]{(~(i2 & 1)) & (i2 | 1)}, new int[1]};
                                                                    int i233 = i3 + ((((~((-470461511) | r3)) | 354237085) * (-366)) - 724493157) + (((~(android.os.Process.myTid() | (-134382659))) | 18158233) * 366) + 16;
                                                                    int i234 = i233 << 13;
                                                                    int i235 = (~(i233 & i234)) & (i233 | i234);
                                                                    int i236 = i235 >>> 17;
                                                                    int i237 = (i235 & (~i236)) | ((~i235) & i236);
                                                                    int i238 = i237 << 5;
                                                                    ((int[]) objArr32[3])[0] = (~(i237 & i238)) & (i237 | i238);
                                                                    return objArr32;
                                                                }
                                                                i203++;
                                                            } catch (java.lang.Throwable th) {
                                                                java.lang.Throwable cause = th.getCause();
                                                                if (cause != null) {
                                                                    throw cause;
                                                                }
                                                                throw th;
                                                            }
                                                        }
                                                        i156 = (i183 ^ 1) + ((i183 & 1) << 1);
                                                        length = i181;
                                                        objArr19 = objArr22;
                                                    } catch (java.lang.Throwable th2) {
                                                        java.lang.Throwable cause2 = th2.getCause();
                                                        if (cause2 != null) {
                                                            throw cause2;
                                                        }
                                                        throw th2;
                                                    }
                                                } catch (java.lang.Throwable th3) {
                                                    java.lang.Throwable cause3 = th3.getCause();
                                                    if (cause3 != null) {
                                                        throw cause3;
                                                    }
                                                    throw th3;
                                                }
                                            } catch (java.lang.Throwable th4) {
                                                java.lang.Throwable cause4 = th4.getCause();
                                                if (cause4 != null) {
                                                    throw cause4;
                                                }
                                                throw th4;
                                            }
                                        }
                                    } catch (java.lang.Throwable th5) {
                                        java.lang.Throwable cause5 = th5.getCause();
                                        if (cause5 != null) {
                                            throw cause5;
                                        }
                                        throw th5;
                                    }
                                } catch (java.lang.Throwable th6) {
                                    java.lang.Throwable cause6 = th6.getCause();
                                    if (cause6 != null) {
                                        throw cause6;
                                    }
                                    throw th6;
                                }
                            } catch (java.lang.Throwable th7) {
                                java.lang.Throwable cause7 = th7.getCause();
                                if (cause7 != null) {
                                    throw cause7;
                                }
                                throw th7;
                            }
                        } catch (java.lang.Throwable th8) {
                            java.lang.Throwable cause8 = th8.getCause();
                            if (cause8 != null) {
                                throw cause8;
                            }
                            throw th8;
                        }
                    } catch (java.lang.Throwable th9) {
                        java.lang.Throwable cause9 = th9.getCause();
                        if (cause9 != null) {
                            throw cause9;
                        }
                        throw th9;
                    }
                } catch (java.lang.Throwable unused) {
                }
                java.lang.Object[] objArr33 = {null, new int[]{i2}, new int[]{i2}, new int[]{(~(r1 & r3)) & r4}};
                int i239 = ((((~i2) | 836249316) * 1444) - 1902200147) + (((~(i2 | 931387391)) | 5775360 | (~((-106688796) | i2))) * (-1444)) + 1818381862;
                int i240 = i3 + ((i239 << 1) - i239);
                int i241 = i240 ^ (i240 << 13);
                int i242 = i241 >>> 17;
                int i243 = (~(i241 & i242)) & (i241 | i242);
                int i244 = i243 << 5;
                int i245 = i243 | i244;
                return objArr33;
            }
        }.e();
        E = e2;
        d = d(java.lang.Class.class, e2);
        com.facetec.sdk.fd<java.util.BitSet> e3 = new com.facetec.sdk.fd<java.util.BitSet>() { // from class: com.facetec.sdk.gj.13
            @Override // com.facetec.sdk.fd
            public final /* synthetic */ void a(com.facetec.sdk.gu guVar, java.util.BitSet bitSet) throws java.io.IOException {
                java.util.BitSet bitSet2 = bitSet;
                guVar.a();
                int length = bitSet2.length();
                for (int i2 = 0; i2 < length; i2++) {
                    guVar.e(bitSet2.get(i2) ? 1L : 0L);
                }
                guVar.b();
            }

            @Override // com.facetec.sdk.fd
            public final /* synthetic */ java.util.BitSet b(com.facetec.sdk.gt gtVar) throws java.io.IOException {
                java.util.BitSet bitSet = new java.util.BitSet();
                gtVar.a();
                com.facetec.sdk.gs f2 = gtVar.f();
                int i2 = 0;
                while (f2 != com.facetec.sdk.gs.END_ARRAY) {
                    int i3 = com.facetec.sdk.gj.AnonymousClass28.d[f2.ordinal()];
                    if (i3 == 1 || i3 == 2) {
                        int o2 = gtVar.o();
                        if (o2 != 0) {
                            if (o2 != 1) {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid bitset value ");
                                sb.append(o2);
                                sb.append(", expected 0 or 1; at path ");
                                sb.append(gtVar.s());
                                throw new com.facetec.sdk.ev(sb.toString());
                            }
                            bitSet.set(i2);
                            i2++;
                            f2 = gtVar.f();
                        } else {
                            continue;
                            i2++;
                            f2 = gtVar.f();
                        }
                    } else if (i3 == 3) {
                        if (!gtVar.j()) {
                            i2++;
                            f2 = gtVar.f();
                        }
                        bitSet.set(i2);
                        i2++;
                        f2 = gtVar.f();
                    } else {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Invalid bitset value type: ");
                        sb2.append(f2);
                        sb2.append("; at path ");
                        sb2.append(gtVar.t());
                        throw new com.facetec.sdk.ev(sb2.toString());
                    }
                }
                gtVar.e();
                return bitSet;
            }
        }.e();
        F = e3;
        b = d(java.util.BitSet.class, e3);
        I = new com.facetec.sdk.fd<java.lang.Boolean>() { // from class: com.facetec.sdk.gj.25
            @Override // com.facetec.sdk.fd
            public final /* synthetic */ void a(com.facetec.sdk.gu guVar, java.lang.Boolean bool) throws java.io.IOException {
                guVar.d(bool);
            }

            @Override // com.facetec.sdk.fd
            public final /* synthetic */ java.lang.Boolean b(com.facetec.sdk.gt gtVar) throws java.io.IOException {
                com.facetec.sdk.gs f2 = gtVar.f();
                if (f2 == com.facetec.sdk.gs.NULL) {
                    gtVar.k();
                    return null;
                }
                if (f2 == com.facetec.sdk.gs.STRING) {
                    return java.lang.Boolean.valueOf(java.lang.Boolean.parseBoolean(gtVar.g()));
                }
                return java.lang.Boolean.valueOf(gtVar.j());
            }
        };
        e = new com.facetec.sdk.fd<java.lang.Boolean>() { // from class: com.facetec.sdk.gj.27
            @Override // com.facetec.sdk.fd
            public final /* synthetic */ void a(com.facetec.sdk.gu guVar, java.lang.Boolean bool) throws java.io.IOException {
                java.lang.Boolean bool2 = bool;
                guVar.d(bool2 == null ? "null" : bool2.toString());
            }

            @Override // com.facetec.sdk.fd
            public final /* synthetic */ java.lang.Boolean b(com.facetec.sdk.gt gtVar) throws java.io.IOException {
                if (gtVar.f() == com.facetec.sdk.gs.NULL) {
                    gtVar.k();
                    return null;
                }
                return java.lang.Boolean.valueOf(gtVar.g());
            }
        };
        f3599a = a(java.lang.Boolean.TYPE, java.lang.Boolean.class, I);
        G = new com.facetec.sdk.fd<java.lang.Number>() { // from class: com.facetec.sdk.gj.26
            public static int b;
            public static int d;

            @Override // com.facetec.sdk.fd
            public final /* synthetic */ void a(com.facetec.sdk.gu guVar, java.lang.Number number) throws java.io.IOException {
                if (number == null) {
                    guVar.g();
                } else {
                    guVar.e(r4.byteValue());
                }
            }

            @Override // com.facetec.sdk.fd
            public final /* synthetic */ java.lang.Number b(com.facetec.sdk.gt gtVar) throws java.io.IOException {
                return d(gtVar);
            }

            private static java.lang.Number d(com.facetec.sdk.gt gtVar) throws java.io.IOException {
                if (gtVar.f() == com.facetec.sdk.gs.NULL) {
                    gtVar.k();
                    return null;
                }
                try {
                    int o2 = gtVar.o();
                    if (o2 > 255 || o2 < -128) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Lossy conversion from ");
                        sb.append(o2);
                        sb.append(" to byte; at path ");
                        sb.append(gtVar.s());
                        throw new com.facetec.sdk.ev(sb.toString());
                    }
                    return java.lang.Byte.valueOf((byte) o2);
                } catch (java.lang.NumberFormatException e4) {
                    throw new com.facetec.sdk.ev(e4);
                }
            }

            public static int d() {
                int i2 = b;
                b = i2 + 1;
                if (i2 % 7303615 != 0) {
                    return d;
                }
                int nextInt = new java.util.Random().nextInt();
                d = nextInt;
                return nextInt;
            }
        };
        c = a(java.lang.Byte.TYPE, java.lang.Byte.class, G);
        H = new com.facetec.sdk.gj.AnonymousClass32();
        f = a(java.lang.Short.TYPE, java.lang.Short.class, H);
        N = new com.facetec.sdk.fd<java.lang.Number>() { // from class: com.facetec.sdk.gj.35
            @Override // com.facetec.sdk.fd
            public final /* synthetic */ void a(com.facetec.sdk.gu guVar, java.lang.Number number) throws java.io.IOException {
                if (number == null) {
                    guVar.g();
                } else {
                    guVar.e(r4.intValue());
                }
            }

            @Override // com.facetec.sdk.fd
            public final /* synthetic */ java.lang.Number b(com.facetec.sdk.gt gtVar) throws java.io.IOException {
                return e(gtVar);
            }

            private static java.lang.Number e(com.facetec.sdk.gt gtVar) throws java.io.IOException {
                if (gtVar.f() == com.facetec.sdk.gs.NULL) {
                    gtVar.k();
                    return null;
                }
                try {
                    return java.lang.Integer.valueOf(gtVar.o());
                } catch (java.lang.NumberFormatException e4) {
                    throw new com.facetec.sdk.ev(e4);
                }
            }
        };
        g = a(java.lang.Integer.TYPE, java.lang.Integer.class, N);
        com.facetec.sdk.fd<java.util.concurrent.atomic.AtomicInteger> e4 = new com.facetec.sdk.fd<java.util.concurrent.atomic.AtomicInteger>() { // from class: com.facetec.sdk.gj.34
            @Override // com.facetec.sdk.fd
            public final /* synthetic */ void a(com.facetec.sdk.gu guVar, java.util.concurrent.atomic.AtomicInteger atomicInteger) throws java.io.IOException {
                guVar.e(atomicInteger.get());
            }

            @Override // com.facetec.sdk.fd
            public final /* synthetic */ java.util.concurrent.atomic.AtomicInteger b(com.facetec.sdk.gt gtVar) throws java.io.IOException {
                return a(gtVar);
            }

            private static java.util.concurrent.atomic.AtomicInteger a(com.facetec.sdk.gt gtVar) throws java.io.IOException {
                try {
                    return new java.util.concurrent.atomic.AtomicInteger(gtVar.o());
                } catch (java.lang.NumberFormatException e5) {
                    throw new com.facetec.sdk.ev(e5);
                }
            }
        }.e();
        M = e4;
        j = d(java.util.concurrent.atomic.AtomicInteger.class, e4);
        com.facetec.sdk.fd<java.util.concurrent.atomic.AtomicBoolean> e5 = new com.facetec.sdk.fd<java.util.concurrent.atomic.AtomicBoolean>() { // from class: com.facetec.sdk.gj.31
            @Override // com.facetec.sdk.fd
            public final /* synthetic */ void a(com.facetec.sdk.gu guVar, java.util.concurrent.atomic.AtomicBoolean atomicBoolean) throws java.io.IOException {
                guVar.b(atomicBoolean.get());
            }

            @Override // com.facetec.sdk.fd
            public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean b(com.facetec.sdk.gt gtVar) throws java.io.IOException {
                return new java.util.concurrent.atomic.AtomicBoolean(gtVar.j());
            }
        }.e();
        L = e5;
        i = d(java.util.concurrent.atomic.AtomicBoolean.class, e5);
        com.facetec.sdk.fd<java.util.concurrent.atomic.AtomicIntegerArray> e6 = new com.facetec.sdk.fd<java.util.concurrent.atomic.AtomicIntegerArray>() { // from class: com.facetec.sdk.gj.2
            @Override // com.facetec.sdk.fd
            public final /* synthetic */ void a(com.facetec.sdk.gu guVar, java.util.concurrent.atomic.AtomicIntegerArray atomicIntegerArray) throws java.io.IOException {
                guVar.a();
                int length = atomicIntegerArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    guVar.e(r6.get(i2));
                }
                guVar.b();
            }

            @Override // com.facetec.sdk.fd
            public final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerArray b(com.facetec.sdk.gt gtVar) throws java.io.IOException {
                return a(gtVar);
            }

            private static java.util.concurrent.atomic.AtomicIntegerArray a(com.facetec.sdk.gt gtVar) throws java.io.IOException {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                gtVar.a();
                while (gtVar.d()) {
                    try {
                        arrayList.add(java.lang.Integer.valueOf(gtVar.o()));
                    } catch (java.lang.NumberFormatException e7) {
                        throw new com.facetec.sdk.ev(e7);
                    }
                }
                gtVar.e();
                int size = arrayList.size();
                java.util.concurrent.atomic.AtomicIntegerArray atomicIntegerArray = new java.util.concurrent.atomic.AtomicIntegerArray(size);
                for (int i2 = 0; i2 < size; i2++) {
                    atomicIntegerArray.set(i2, ((java.lang.Integer) arrayList.get(i2)).intValue());
                }
                return atomicIntegerArray;
            }
        }.e();
        J = e6;
        h = d(java.util.concurrent.atomic.AtomicIntegerArray.class, e6);
        l = new com.facetec.sdk.fd<java.lang.Number>() { // from class: com.facetec.sdk.gj.5
            @Override // com.facetec.sdk.fd
            public final /* synthetic */ void a(com.facetec.sdk.gu guVar, java.lang.Number number) throws java.io.IOException {
                java.lang.Number number2 = number;
                if (number2 == null) {
                    guVar.g();
                } else {
                    guVar.e(number2.longValue());
                }
            }

            @Override // com.facetec.sdk.fd
            public final /* synthetic */ java.lang.Number b(com.facetec.sdk.gt gtVar) throws java.io.IOException {
                return a(gtVar);
            }

            private static java.lang.Number a(com.facetec.sdk.gt gtVar) throws java.io.IOException {
                if (gtVar.f() == com.facetec.sdk.gs.NULL) {
                    gtVar.k();
                    return null;
                }
                try {
                    return java.lang.Long.valueOf(gtVar.l());
                } catch (java.lang.NumberFormatException e7) {
                    throw new com.facetec.sdk.ev(e7);
                }
            }
        };
        n = new com.facetec.sdk.fd<java.lang.Number>() { // from class: com.facetec.sdk.gj.3
            @Override // com.facetec.sdk.fd
            public final /* synthetic */ void a(com.facetec.sdk.gu guVar, java.lang.Number number) throws java.io.IOException {
                java.lang.Number number2 = number;
                if (number2 == null) {
                    guVar.g();
                    return;
                }
                if (!(number2 instanceof java.lang.Float)) {
                    number2 = java.lang.Float.valueOf(number2.floatValue());
                }
                guVar.e(number2);
            }

            @Override // com.facetec.sdk.fd
            public final /* synthetic */ java.lang.Number b(com.facetec.sdk.gt gtVar) throws java.io.IOException {
                if (gtVar.f() == com.facetec.sdk.gs.NULL) {
                    gtVar.k();
                    return null;
                }
                return java.lang.Float.valueOf((float) gtVar.m());
            }
        };
        f3600o = new com.facetec.sdk.fd<java.lang.Number>() { // from class: com.facetec.sdk.gj.4
            @Override // com.facetec.sdk.fd
            public final /* synthetic */ void a(com.facetec.sdk.gu guVar, java.lang.Number number) throws java.io.IOException {
                java.lang.Number number2 = number;
                if (number2 == null) {
                    guVar.g();
                } else {
                    guVar.d(number2.doubleValue());
                }
            }

            @Override // com.facetec.sdk.fd
            public final /* synthetic */ java.lang.Number b(com.facetec.sdk.gt gtVar) throws java.io.IOException {
                if (gtVar.f() == com.facetec.sdk.gs.NULL) {
                    gtVar.k();
                    return null;
                }
                return java.lang.Double.valueOf(gtVar.m());
            }
        };
        K = new com.facetec.sdk.fd<java.lang.Character>() { // from class: com.facetec.sdk.gj.10
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static final byte[] $$c = null;
            private static final int $$d = 0;
            private static int $10;
            private static int $11;

            /* renamed from: a, reason: collision with root package name */
            private static char f3602a;
            private static char b;
            private static int c;
            private static char d;
            private static char e;
            private static int i;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0029). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static java.lang.String $$e(short s2, byte b2, short s3) {
                int i2;
                int i3 = (b2 * 4) + 4;
                byte[] bArr = $$c;
                int i4 = s3 * 3;
                int i5 = (s2 * 4) + 112;
                byte[] bArr2 = new byte[1 - i4];
                int i6 = 0 - i4;
                if (bArr == null) {
                    int i7 = i5;
                    i5 = i6;
                    int i8 = 0;
                    i3++;
                    i5 += i7;
                    i2 = i8;
                    bArr2[i2] = (byte) i5;
                    i8 = i2 + 1;
                    if (i2 == i6) {
                        return new java.lang.String(bArr2, 0);
                    }
                    i7 = bArr[i3];
                    i3++;
                    i5 += i7;
                    i2 = i8;
                    bArr2[i2] = (byte) i5;
                    i8 = i2 + 1;
                    if (i2 == i6) {
                    }
                } else {
                    i2 = 0;
                    bArr2[i2] = (byte) i5;
                    i8 = i2 + 1;
                    if (i2 == i6) {
                    }
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002e). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void g(short s2, int i2, short s3, java.lang.Object[] objArr) {
                int i3;
                int i4 = 101 - i2;
                int i5 = 3 - (s2 * 3);
                byte[] bArr = $$a;
                int i6 = s3 * 3;
                byte[] bArr2 = new byte[1 - i6];
                if (bArr == null) {
                    int i7 = i4;
                    i3 = 0;
                    int i8 = i5;
                    int i9 = i8;
                    i4 = i5 + i7;
                    i5 = i9;
                    bArr2[i3] = (byte) i4;
                    if (i3 == 0 - i6) {
                        objArr[0] = new java.lang.String(bArr2, 0);
                        return;
                    }
                    int i10 = i5 + 1;
                    i3++;
                    i7 = bArr[i10];
                    int i11 = i4;
                    i8 = i10;
                    i5 = i11;
                    int i92 = i8;
                    i4 = i5 + i7;
                    i5 = i92;
                    bArr2[i3] = (byte) i4;
                    if (i3 == 0 - i6) {
                    }
                } else {
                    i3 = 0;
                    bArr2[i3] = (byte) i4;
                    if (i3 == 0 - i6) {
                    }
                }
            }

            static void init$0() {
                $$a = new byte[]{41, -22, -104, -77};
                $$b = 27;
            }

            static void init$1() {
                $$c = new byte[]{72, 8, -4, 77};
                $$d = 11;
            }

            private static void f(java.lang.String str, int i2, java.lang.Object[] objArr) {
                char[] charArray = str != null ? str.toCharArray() : str;
                com.facetec.sdk.ho hoVar = new com.facetec.sdk.ho();
                char[] cArr = new char[charArray.length];
                hoVar.b = 0;
                char[] cArr2 = new char[2];
                while (hoVar.b < charArray.length) {
                    cArr2[0] = charArray[hoVar.b];
                    cArr2[1] = charArray[hoVar.b + 1];
                    int i3 = 58224;
                    int i4 = 0;
                    while (i4 < 16) {
                        $10 = ($11 + 61) % 128;
                        char c2 = cArr2[1];
                        char c3 = cArr2[0];
                        try {
                            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c2), java.lang.Integer.valueOf(((c3 << 4) + ((char) (d ^ 2174069992062419062L))) ^ r13), java.lang.Integer.valueOf(c3 >>> 5), java.lang.Integer.valueOf(b)};
                            int i5 = c3 + i3;
                            java.lang.Object d2 = com.facetec.sdk.al.d(1497828241);
                            if (d2 == null) {
                                d2 = com.facetec.sdk.al.c((char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 211 - android.view.View.MeasureSpec.getSize(0), 24 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -22515351, false, lib.android.paypal.com.magnessdk.g.n2, new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                            }
                            char charValue = ((java.lang.Character) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).charValue();
                            cArr2[1] = charValue;
                            java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(cArr2[0]), java.lang.Integer.valueOf((charValue + i3) ^ ((charValue << 4) + ((char) (f3602a ^ 2174069992062419062L)))), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(e)};
                            java.lang.Object d3 = com.facetec.sdk.al.d(1497828241);
                            if (d3 == null) {
                                d3 = com.facetec.sdk.al.c((char) (android.graphics.Color.rgb(0, 0, 0) + 16777216), 211 - (android.os.Process.myTid() >> 22), android.view.View.resolveSize(0, 0) + 23, -22515351, false, lib.android.paypal.com.magnessdk.g.n2, new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                            }
                            cArr2[0] = ((java.lang.Character) ((java.lang.reflect.Method) d3).invoke(null, objArr3)).charValue();
                            i3 -= 40503;
                            i4++;
                            $11 = ($10 + 45) % 128;
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr[hoVar.b] = cArr2[0];
                    cArr[hoVar.b + 1] = cArr2[1];
                    java.lang.Object[] objArr4 = {hoVar, hoVar};
                    java.lang.Object d4 = com.facetec.sdk.al.d(-2113314280);
                    if (d4 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        d4 = com.facetec.sdk.al.c((char) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 31541), 1913 - android.view.View.MeasureSpec.getSize(0), 22 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 635836640, false, $$e(b2, b3, b3), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                    }
                    ((java.lang.reflect.Method) d4).invoke(null, objArr4);
                    $10 = ($11 + 59) % 128;
                }
                objArr[0] = new java.lang.String(cArr, 0, i2);
            }

            @Override // com.facetec.sdk.fd
            public final /* synthetic */ void a(com.facetec.sdk.gu guVar, java.lang.Character ch) throws java.io.IOException {
                int i2 = i + 103;
                int i3 = i2 % 128;
                c = i3;
                java.lang.Character ch2 = ch;
                java.lang.String str = null;
                if (i2 % 2 != 0) {
                    throw null;
                }
                if (ch2 == null) {
                    i = (i3 + 71) % 128;
                } else {
                    str = java.lang.String.valueOf(ch2);
                    i = (c + 43) % 128;
                }
                guVar.d(str);
            }

            @Override // com.facetec.sdk.fd
            public final /* synthetic */ java.lang.Character b(com.facetec.sdk.gt gtVar) throws java.io.IOException {
                if (gtVar.f() == com.facetec.sdk.gs.NULL) {
                    i = (c + 121) % 128;
                    gtVar.k();
                    int i2 = i + 77;
                    c = i2 % 128;
                    java.lang.Object obj = null;
                    if (i2 % 2 == 0) {
                        return null;
                    }
                    obj.hashCode();
                    throw null;
                }
                java.lang.String g2 = gtVar.g();
                if (g2.length() != 1) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Expecting character, got: ");
                    sb.append(g2);
                    sb.append("; at ");
                    sb.append(gtVar.s());
                    throw new com.facetec.sdk.ev(sb.toString());
                }
                char charAt = g2.charAt(0);
                int i3 = c + 35;
                i = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 17 / 0;
                }
                return java.lang.Character.valueOf(charAt);
            }

            static {
                init$1();
                $10 = 0;
                $11 = 1;
                init$0();
                c = 0;
                i = 1;
                f3602a = (char) 21220;
                e = (char) 10689;
                d = (char) 11110;
                b = (char) 22554;
            }

            /* JADX WARN: Code restructure failed: missing block: B:38:0x03f5, code lost:
            
                if (r0.contains(((java.lang.reflect.Field) r3).get(null)) != false) goto L38;
             */
            /* JADX WARN: Code restructure failed: missing block: B:80:0x066d, code lost:
            
                if (r0.equals((java.lang.String) r3[0]) != false) goto L77;
             */
            /* JADX WARN: Code restructure failed: missing block: B:92:0x0496, code lost:
            
                if (android.os.Build.VERSION.SDK_INT > 33) goto L52;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public static java.lang.Object[] a(android.content.Context context, int i2, int i3, int i4) {
                java.lang.Object[] objArr;
                int i5;
                int i6;
                java.lang.Object[] objArr2;
                int i7 = c;
                i = (i7 + 91) % 128;
                java.lang.Object obj = null;
                if (context == null) {
                    java.lang.Object[] objArr3 = {null, new int[]{i2}, new int[]{i2}, new int[]{(r1 & (~r2)) | r3}};
                    int i8 = ~i2;
                    int i9 = (((((~((-262177453) | i8)) | (-562521144)) | (~(262177452 | i2))) * (-564)) - 1065418585) + ((~((-537355284) | i2)) * 1128) + (((~((-562521144) | i8)) | (-799532736)) * 564);
                    int i10 = -(-(i9 * (-163)));
                    int i11 = ~i9;
                    int i12 = ~((i11 ^ (-1)) | i11);
                    int i13 = ~((i11 ^ i2) | (i11 & i2));
                    int i14 = (i13 ^ i12) | (i12 & i13);
                    int i15 = ~((i9 & i8) | (i8 ^ i9));
                    int i16 = (((((i10 << 1) - i10) + (i15 * (-328))) - (~(i2 * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE))) - 1) + (((i15 ^ i14) | (i14 & i15)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE);
                    int i17 = (i16 * 85) + (i4 * 85);
                    int i18 = ~i16;
                    int i19 = ~i4;
                    int i20 = ~(i18 | i19);
                    int i21 = ~((i18 ^ i8) | (i18 & i8));
                    int i22 = (i21 ^ i20) | (i21 & i20);
                    int i23 = ~(i8 | i19);
                    int i24 = (i22 ^ i23) | (i23 & i22);
                    int i25 = i16 | i4;
                    int i26 = ~((i25 ^ i2) | (i25 & i2));
                    int i27 = -(-(((i24 ^ i26) | (i24 & i26)) * (-84)));
                    int i28 = ~((i2 ^ i19) | (i19 & i2));
                    int i29 = (i28 ^ i16) | (i28 & i16);
                    int i30 = ~((i8 ^ i4) | (i8 & i4));
                    int i31 = ~((i4 ^ i16) | (i4 & i16));
                    int i32 = (((((i17 | i27) << 1) - (i17 ^ i27)) - (~(-(-(((i29 ^ i30) | (i29 & i30)) * (-84)))))) - 1) + (((i30 & i31) | (i31 ^ i30)) * 84);
                    int i33 = i32 << 13;
                    int i34 = ((~i33) & i32) | ((~i32) & i33);
                    int i35 = i34 ^ (i34 >>> 17);
                    int i36 = i35 << 5;
                    int i37 = (~i35) & i36;
                    return objArr3;
                }
                i = (((i7 | 7) << 1) - (i7 ^ 7)) % 128;
                try {
                    int i38 = -(android.view.ViewConfiguration.getEdgeSlop() >> 16);
                    int i39 = (i38 * 503) + 11569;
                    int i40 = (i38 | 23) * (-502);
                    int i41 = ~i38;
                    int i42 = ~((i41 & (-24)) | (i41 ^ (-24)));
                    int i43 = ~i2;
                    int i44 = ~(i41 | i43);
                    int i45 = (i42 & i44) | (i42 ^ i44);
                    int i46 = ~((i38 ^ 23) | (i38 & 23) | i2);
                    int i47 = ((((i39 | i40) << 1) - (i39 ^ i40)) - (~(((i45 & i46) | (i45 ^ i46)) * (-502)))) - 1;
                    int i48 = -(-((i46 | (~((i41 ^ i43) | (i41 & i43) | 23))) * 502));
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    f("䵉\ueeed斺즈ᡐ뉍ꭱ縩乺䜒馛쌴ి繬꧟떰귳\uef6f馛쌴䋍\uf392罨벍", (i47 ^ i48) + ((i48 & i47) << 1), objArr4);
                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
                    int blue = android.graphics.Color.blue(0);
                    int a2 = com.facetec.sdk.ol.AnonymousClass3.a();
                    int i49 = blue * 398;
                    int i50 = (i49 ^ (-7128)) + ((i49 & (-7128)) << 1);
                    int i51 = ~blue;
                    int i52 = ~a2;
                    int i53 = ~((i51 ^ i52) | (i51 & i52));
                    int i54 = ~((i51 & 18) | (i51 ^ 18));
                    int i55 = -(-(((~((i52 ^ 18) | (i52 & 18))) | (i53 & i54) | (i53 ^ i54)) * (-397)));
                    int i56 = ((((i50 | i55) << 1) - (i50 ^ i55)) - (~(i54 * (-397)))) - 1;
                    int i57 = (a2 ^ i54) | (i54 & a2);
                    int i58 = ~((blue ^ (-19)) | (blue & (-19)));
                    int i59 = -(-(((i58 ^ i57) | (i57 & i58)) * 397));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    f("\uf62bꬆ꾓ꩄ䚱༳\uf5ed\ueaa7ⶀĨ\ue0cf\ud9b3\ue1ca㘣霑躍ꎋ靍", ((i56 | i59) << 1) - (i59 ^ i56), objArr5);
                    java.lang.Object invoke = cls.getMethod((java.lang.String) objArr5[0], null).invoke(context, null);
                    int i60 = -android.graphics.Color.green(0);
                    int a3 = com.facetec.sdk.ol.AnonymousClass3.a();
                    int i61 = (i60 * (-167)) - 5678;
                    int i62 = ~i60;
                    int i63 = ~((i62 ^ (-35)) | (i62 & (-35)));
                    int i64 = ~((a3 ^ (-35)) | (a3 & (-35)));
                    int i65 = ((i63 ^ i64) | (i63 & i64)) * 336;
                    int i66 = (i61 ^ i65) + ((i61 & i65) << 1);
                    int i67 = ((~((i60 ^ 34) | (i60 & 34))) | (~((i60 ^ a3) | (i60 & a3)))) * (-168);
                    int i68 = (i66 ^ i67) + ((i67 & i66) << 1);
                    int i69 = ~a3;
                    int i70 = ~((i60 ^ i69) | (i60 & i69));
                    int i71 = -(-(((i70 ^ (-35)) | (i70 & (-35))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    f("䵉\ueeed斺즈ᡐ뉍ꭱ縩乺䜒馛쌴ి繬꧟떰蝴믒戾흐䚱༳\uf5ed\ueaa7ⶀĨ\ue0cf\ud9b3\ue1ca㘣霑躍ꎋ靍", ((i68 | i71) << 1) - (i71 ^ i68), objArr6);
                    java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr6[0]);
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    f("钀郤്㭎ꬿ읿", ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 5, objArr7);
                    if ((cls2.getField((java.lang.String) objArr7[0]).getInt(invoke) & 2) != 0) {
                        objArr = new java.lang.Object[]{null, new int[]{i2}, new int[]{(i2 & (-2)) | (i43 & 1)}, new int[1]};
                        int i72 = ((((-21497609) | (~r8)) * (-490)) - 1281876755) + (((~(android.os.Process.myTid() | (-63889290))) | 42391681) * 490) + 865594322;
                        int i73 = (i4 - (~((i72 ^ 16) + ((i72 & 16) << 1)))) - 1;
                        int i74 = i73 << 13;
                        int i75 = (~(i73 & i74)) & (i73 | i74);
                        int i76 = i75 >>> 17;
                        int i77 = (~(i75 & i76)) & (i75 | i76);
                        int i78 = i77 << 5;
                        ((int[]) objArr[3])[0] = (i77 & (~i78)) | ((~i77) & i78);
                    } else {
                        int i79 = c;
                        i = ((i79 ^ 101) + ((i79 & 101) << 1)) % 128;
                        objArr = new java.lang.Object[]{null, new int[]{i2}, new int[]{i2}, new int[1]};
                        int i80 = ~((int) android.os.Process.getElapsedCpuTime());
                        int i81 = -(-((((~((-318338198) | i80)) | (-506360399)) * (-933)) + 1493644198 + (((~(i80 | (-506360399))) | 201720394) * 933) + 116638112));
                        int i82 = (i4 ^ i81) + ((i81 & i4) << 1);
                        int i83 = i82 << 13;
                        int i84 = ((~i83) & i82) | ((~i82) & i83);
                        int i85 = i84 >>> 17;
                        int i86 = (i84 & (~i85)) | ((~i84) & i85);
                        int i87 = i86 << 5;
                        ((int[]) objArr[3])[0] = (~(i86 & i87)) & (i86 | i87);
                    }
                    if (((int[]) objArr[2])[0] != i2) {
                        int i88 = c;
                        int i89 = (i88 ^ 45) + ((i88 & 45) << 1);
                        int i90 = i89 % 128;
                        i = i90;
                        if (i89 % 2 == 0) {
                            int i91 = 8 / 0;
                        }
                        int i92 = (i90 & 1) + (i90 | 1);
                        c = i92 % 128;
                        if (i92 % 2 == 0) {
                            return objArr;
                        }
                        obj.hashCode();
                        throw null;
                    }
                    try {
                        java.lang.Object d2 = com.facetec.sdk.al.d(1023220397);
                        if (d2 == null) {
                            char combineMeasuredStates = (char) (android.view.View.combineMeasuredStates(0, 0) + 42581);
                            int red = android.graphics.Color.red(0);
                            int capsMode = android.text.TextUtils.getCapsMode("", 0, 0);
                            byte b2 = (byte) 0;
                            byte b3 = (byte) (b2 + 2);
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            g(b2, b3, (byte) (b3 - 2), objArr8);
                            d2 = com.facetec.sdk.al.c(combineMeasuredStates, 1552 - red, capsMode + 24, -1693294507, false, (java.lang.String) objArr8[0], new java.lang.Class[0]);
                        }
                        java.util.Set set = (java.util.Set) ((java.lang.reflect.Method) d2).invoke(null, null);
                        java.lang.Object d3 = com.facetec.sdk.al.d(-230269676);
                        if (d3 == null) {
                            char c2 = (char) (42582 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                            int maximumDrawingCacheSize = android.view.ViewConfiguration.getMaximumDrawingCacheSize();
                            long elapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            java.lang.Object[] objArr9 = new java.lang.Object[1];
                            g(b4, b5, b5, objArr9);
                            d3 = com.facetec.sdk.al.c(c2, 1552 - (maximumDrawingCacheSize >> 24), 25 - (elapsedRealtimeNanos > 0L ? 1 : (elapsedRealtimeNanos == 0L ? 0 : -1)), 1437149164, false, (java.lang.String) objArr9[0], null);
                        }
                        if (!set.contains(((java.lang.reflect.Field) d3).get(null))) {
                            java.lang.Object d4 = com.facetec.sdk.al.d(-233963760);
                            if (d4 == null) {
                                char c3 = (char) (42581 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                int offsetAfter = android.text.TextUtils.getOffsetAfter("", 0);
                                double convertQuartSecToDecDegrees = android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0);
                                byte length = (byte) $$a.length;
                                java.lang.Object[] objArr10 = new java.lang.Object[1];
                                g((byte) 0, length, (byte) (length - 4), objArr10);
                                d4 = com.facetec.sdk.al.c(c3, 1552 - offsetAfter, (convertQuartSecToDecDegrees > 0.0d ? 1 : (convertQuartSecToDecDegrees == 0.0d ? 0 : -1)) + 24, 1440908776, false, (java.lang.String) objArr10[0], null);
                            }
                        }
                        if (android.os.Build.VERSION.SDK_INT == 30) {
                            java.lang.Object[] objArr11 = {null, new int[]{i2}, new int[]{i2}, new int[]{r1 ^ (r1 << 5)}};
                            int i93 = ~(519875940 | i43);
                            int i94 = ((304822655 | i93) * 764) + 960376651 + (((~(304822655 | i43)) | 215254016) * (-1528)) + ((i93 | 215454747) * 764);
                            int i95 = i94 * (-493);
                            int i96 = ~i94;
                            int i97 = i96 * (-988);
                            int i98 = (i95 ^ i97) + ((i95 & i97) << 1);
                            int i99 = i96 | i94;
                            int i100 = -(-(((i99 ^ i43) | (i99 & i43)) * 494));
                            int i101 = (i98 & i100) + (i100 | i98);
                            int i102 = ~((i96 ^ (-1)) | i96);
                            int i103 = ~(i94 | i43);
                            int i104 = ((i102 ^ i103) | (i102 & i103) | i96) * 494;
                            int i105 = -(-((i101 & i104) + (i104 | i101)));
                            int i106 = (i4 ^ i105) + ((i105 & i4) << 1);
                            int i107 = i106 << 13;
                            int i108 = ((~i107) & i106) | ((~i106) & i107);
                            int i109 = i108 >>> 17;
                            int i110 = (~(i108 & i109)) & (i108 | i109);
                            return objArr11;
                        }
                        if ((i3 & 32) == 0) {
                            int i111 = c;
                            int i112 = (i111 & 73) + (i111 | 73);
                            i = i112 % 128;
                            try {
                            } catch (java.lang.Exception unused) {
                                i5 = i4;
                            }
                            if (i112 % 2 == 0) {
                                try {
                                    if (android.os.Build.VERSION.SDK_INT > 62) {
                                        i = (c + 5) % 128;
                                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                                        f("ꭺ帯맆\ue4b4눃摍ᒻ퐉䘺銮칯ꓡꚩ矀ၱᣐ訇\ue705ꏾ镟肵⓾\uffc8觌ꭟ䬿ྜ⡲", android.view.Gravity.getAbsoluteGravity(0, 0) + 28, objArr12);
                                        try {
                                            java.lang.Object[] objArr13 = {(java.lang.String) objArr12[0]};
                                            java.lang.Object d5 = com.facetec.sdk.al.d(1450487247);
                                            if (d5 == null) {
                                                char mirror = (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 6887);
                                                int absoluteGravity = android.view.Gravity.getAbsoluteGravity(0, 0);
                                                byte modifierMetaStateMask = (byte) android.view.KeyEvent.getModifierMetaStateMask();
                                                byte b6 = (byte) 0;
                                                byte b7 = (byte) (b6 + 3);
                                                java.lang.Object[] objArr14 = new java.lang.Object[1];
                                                g(b6, b7, (byte) (b7 - 3), objArr14);
                                                d5 = com.facetec.sdk.al.c(mirror, 2389 - absoluteGravity, 22 - modifierMetaStateMask, -241445065, false, (java.lang.String) objArr14[0], new java.lang.Class[]{java.lang.String.class});
                                            }
                                            long longValue = ((java.lang.Long) ((java.lang.reflect.Method) d5).invoke(null, objArr13)).longValue();
                                            long j2 = 1314793780;
                                            long j3 = 764;
                                            long j4 = -1;
                                            long j5 = i2 ^ j4;
                                            long j6 = (j5 | j2) ^ j4;
                                            long j7 = ((j2 ^ j4) | longValue) ^ j4;
                                            long j8 = (765 * j2) + ((-1527) * longValue) + ((longValue | j6) * j3) + ((-1528) * (j7 | ((j5 | longValue) ^ j4))) + (j3 * (j7 | (j4 ^ ((longValue ^ j4) | j2)) | j6)) + 536382861;
                                            int i113 = (int) (j8 >> 32);
                                            int i114 = (int) j8;
                                            int uptimeMillis = (int) android.os.SystemClock.uptimeMillis();
                                            int i115 = ~uptimeMillis;
                                            int i116 = (-1080569111) | i43;
                                            if (((i113 & ((((~i116) | (-1777171775)) * (-828)) + 1754752898 + (i116 * (-828)) + 1358025512)) | (i114 & ((((((~((-748078083) | i115)) | (~((-285737042) | uptimeMillis))) | (~((-1075847681) | uptimeMillis))) * 765) - 2065236403) + (((~((-1033815124) | i115)) | 748078082) * 1530) + (((~(uptimeMillis | (-1033815124))) | (~(i115 | (-1075847681)))) * 765)))) == 1) {
                                                int i117 = i;
                                                c = ((i117 ^ 67) + ((i117 & 67) << 1)) % 128;
                                                int i118 = c;
                                                i = (((i118 | 107) << 1) - (i118 ^ 107)) % 128;
                                                java.lang.Object[] objArr15 = {null, new int[]{i2}, new int[]{i2 ^ 10}, new int[1]};
                                                int i119 = ~(497125553 | i43);
                                                int i120 = ((33969666 | i119) * (-712)) + 362395051 + (((~((-33969667) | i43)) | (~(i2 | 531095219))) * (-712)) + ((i119 | (-327573043)) * 712);
                                                int a4 = com.facetec.sdk.ol.AnonymousClass3.a();
                                                int i121 = ~i120;
                                                int i122 = ~a4;
                                                int i123 = ~(i122 | i121);
                                                int i124 = ~((i121 ^ 16) | (i121 & 16));
                                                int i125 = (i120 & (-17)) | (i120 ^ (-17));
                                                int i126 = ~((i122 ^ 16) | (i122 & 16));
                                                int i127 = -(-(((~((a4 ^ i125) | (a4 & i125))) | (i123 ^ i124) | (i123 & i124) | i126) * 590));
                                                int i128 = ~((i121 & i122) | (i121 ^ i122));
                                                int i129 = (i128 ^ i124) | (i128 & i124);
                                                int i130 = (((((-9425) - (~(-(-(i120 * 591))))) - (~i127)) - 1) - (~(((i129 ^ i126) | (i129 & i126)) * (-1180)))) - 1;
                                                int i131 = ~((i122 & (-17)) | (i122 ^ (-17)));
                                                int i132 = ~(i120 | i122);
                                                int i133 = ((i131 ^ i132) | (i131 & i132)) * 590;
                                                int i134 = ((i130 | i133) << 1) - (i133 ^ i130);
                                                int i135 = i134 * com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.TransferFrameEnd;
                                                int i136 = i4 * (-987);
                                                int i137 = (i135 ^ i136) + ((i135 & i136) << 1);
                                                int i138 = ~i4;
                                                int i139 = i138 | i43;
                                                int i140 = (i134 ^ i4) | (i134 & i4);
                                                int i141 = -(-(((~((i139 ^ i134) | (i139 & i134))) | (~((i140 ^ i2) | (i140 & i2)))) * 988));
                                                int i142 = ((i137 | i141) << 1) - (i141 ^ i137);
                                                int i143 = ((i138 & i134) | (i134 ^ i138)) * (-988);
                                                int i144 = (i142 & i143) + (i143 | i142);
                                                int i145 = ~i134;
                                                int i146 = (~((i138 ^ i145) | (i145 & i138))) | (~((i138 & i2) | (i138 ^ i2)));
                                                int i147 = ~(i134 | i43 | i4);
                                                int i148 = ((i146 ^ i147) | (i146 & i147)) * 988;
                                                int i149 = ((i144 | i148) << 1) - (i148 ^ i144);
                                                int i150 = i149 << 13;
                                                int i151 = (~(i150 & i149)) & (i150 | i149);
                                                int i152 = i151 ^ (i151 >>> 17);
                                                int i153 = i152 << 5;
                                                ((int[]) objArr15[3])[0] = (i152 & (~i153)) | ((~i152) & i153);
                                                return objArr15;
                                            }
                                            c = (i + 111) % 128;
                                            i5 = i4;
                                            i6 = 1;
                                        } catch (java.lang.Throwable th) {
                                            java.lang.Throwable cause = th.getCause();
                                            if (cause != null) {
                                                throw cause;
                                            }
                                            throw th;
                                        }
                                    }
                                    java.lang.Object[] objArr16 = {(java.lang.String) objArr2[0]};
                                    java.lang.Object d6 = com.facetec.sdk.al.d(1590238701);
                                    if (d6 == null) {
                                        char argb = (char) android.graphics.Color.argb(0, 0, 0, 0);
                                        int myTid = android.os.Process.myTid();
                                        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                                        byte b8 = (byte) 0;
                                        byte b9 = b8;
                                        java.lang.Object[] objArr17 = new java.lang.Object[1];
                                        g(b8, b9, b9, objArr17);
                                        d6 = com.facetec.sdk.al.c(argb, (myTid >> 22) + 2078, 25 - (elapsedRealtime > 0L ? 1 : (elapsedRealtime == 0L ? 0 : -1)), -114923755, false, (java.lang.String) objArr17[0], new java.lang.Class[]{java.lang.String.class});
                                    }
                                    java.lang.Object invoke2 = ((java.lang.reflect.Method) d6).invoke(null, objArr16);
                                    java.lang.Object[] objArr18 = new java.lang.Object[1];
                                    f("ꆸ鯏", -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr18);
                                } catch (java.lang.Throwable th2) {
                                    i5 = i4;
                                    try {
                                        java.lang.Throwable cause2 = th2.getCause();
                                        if (cause2 != null) {
                                            throw cause2;
                                        }
                                        throw th2;
                                    } catch (java.lang.Exception unused2) {
                                    }
                                }
                                int i154 = -(android.view.ViewConfiguration.getScrollBarSize() >> 8);
                                int i155 = (i154 * 477) - 6175;
                                int i156 = ~i154;
                                int i157 = ~((i156 ^ 13) | (i156 & 13));
                                int i158 = (i154 & (-14)) | (i154 ^ (-14));
                                int i159 = ~(i158 | i2);
                                int i160 = -(-(((i157 ^ i159) | (i157 & i159)) * (-476)));
                                int i161 = (i155 ^ i160) + ((i155 & i160) << 1);
                                int i162 = -(-((~((i158 ^ i2) | (i158 & i2))) * 952));
                                objArr2 = new java.lang.Object[1];
                                f("Ⓐ\ued35͢楟訇\ue705ꏾ镟肵⓾\uffc8觌娕\ud858", (i161 ^ i162) + ((i162 & i161) << 1) + ((~(i154 | (i43 & (-14)) | (i43 ^ (-14)))) * 476), objArr2);
                            }
                        } else {
                            i5 = i4;
                            i6 = 1;
                        }
                        int[] iArr = new int[i6];
                        int[] iArr2 = new int[i6];
                        int[] iArr3 = new int[i6];
                        iArr[0] = i2;
                        iArr2[0] = i2;
                        java.lang.Object[] objArr19 = {null, iArr, iArr2, iArr3};
                        int i163 = (i5 - (~(-(-(((((~((-412830811) | i43)) | (~(i2 | 411867785))) * 959) - 98841421) + (((~(i2 | (-412830811))) | (~(411867785 | i43))) * 959)))))) - 1;
                        int i164 = i163 << 13;
                        int i165 = (~(i163 & i164)) & (i163 | i164);
                        int i166 = i165 >>> 17;
                        int i167 = (i165 & (~i166)) | ((~i165) & i166);
                        iArr3[0] = i167 ^ (i167 << 5);
                        return objArr19;
                    } catch (java.lang.Throwable th3) {
                        java.lang.Throwable cause3 = th3.getCause();
                        if (cause3 != null) {
                            throw cause3;
                        }
                        throw th3;
                    }
                } catch (java.lang.Throwable th4) {
                    java.lang.Throwable cause4 = th4.getCause();
                    if (cause4 != null) {
                        throw cause4;
                    }
                    throw th4;
                }
            }
        };
        k = a(java.lang.Character.TYPE, java.lang.Character.class, K);
        S = new com.facetec.sdk.fd<java.lang.String>() { // from class: com.facetec.sdk.gj.6
            @Override // com.facetec.sdk.fd
            public final /* synthetic */ void a(com.facetec.sdk.gu guVar, java.lang.String str) throws java.io.IOException {
                guVar.d(str);
            }

            @Override // com.facetec.sdk.fd
            public final /* synthetic */ java.lang.String b(com.facetec.sdk.gt gtVar) throws java.io.IOException {
                com.facetec.sdk.gs f2 = gtVar.f();
                if (f2 == com.facetec.sdk.gs.NULL) {
                    gtVar.k();
                    return null;
                }
                if (f2 == com.facetec.sdk.gs.BOOLEAN) {
                    return java.lang.Boolean.toString(gtVar.j());
                }
                return gtVar.g();
            }
        };
        m = new com.facetec.sdk.fd<java.math.BigDecimal>() { // from class: com.facetec.sdk.gj.9
            @Override // com.facetec.sdk.fd
            public final /* synthetic */ void a(com.facetec.sdk.gu guVar, java.math.BigDecimal bigDecimal) throws java.io.IOException {
                guVar.e(bigDecimal);
            }

            @Override // com.facetec.sdk.fd
            public final /* synthetic */ java.math.BigDecimal b(com.facetec.sdk.gt gtVar) throws java.io.IOException {
                return c(gtVar);
            }

            private static java.math.BigDecimal c(com.facetec.sdk.gt gtVar) throws java.io.IOException {
                if (gtVar.f() == com.facetec.sdk.gs.NULL) {
                    gtVar.k();
                    return null;
                }
                java.lang.String g2 = gtVar.g();
                try {
                    return new java.math.BigDecimal(g2);
                } catch (java.lang.NumberFormatException e7) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed parsing '");
                    sb.append(g2);
                    sb.append("' as BigDecimal; at path ");
                    sb.append(gtVar.s());
                    throw new com.facetec.sdk.ev(sb.toString(), e7);
                }
            }
        };
        s = new com.facetec.sdk.fd<java.math.BigInteger>() { // from class: com.facetec.sdk.gj.8
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static final byte[] $$c = null;
            private static final int $$d = 0;
            private static int $10;
            private static int $11;

            /* renamed from: a, reason: collision with root package name */
            private static int f3607a;
            private static int c;
            private static int d;

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
            /* JADX WARN: Type inference failed for: r9v2, types: [int] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002a). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static java.lang.String $$e(byte b2, short s2, byte b3) {
                int i2;
                int i3;
                int i4;
                int i5 = (b2 * 4) + 1;
                byte[] bArr = $$c;
                ?? r9 = 113 - (b3 * 4);
                int i6 = 4 - (s2 * 3);
                byte[] bArr2 = new byte[i5];
                if (bArr == null) {
                    byte b4 = r9;
                    i4 = 0;
                    int i7 = i6;
                    int i8 = i6 + (-b4);
                    int i9 = i7 + 1;
                    i2 = i4;
                    i3 = i8;
                    i6 = i9;
                    i4 = i2 + 1;
                    bArr2[i2] = (byte) i3;
                    if (i4 == i5) {
                        return new java.lang.String(bArr2, 0);
                    }
                    b4 = bArr[i6];
                    int i10 = i3;
                    i7 = i6;
                    i6 = i10;
                    int i82 = i6 + (-b4);
                    int i92 = i7 + 1;
                    i2 = i4;
                    i3 = i82;
                    i6 = i92;
                    i4 = i2 + 1;
                    bArr2[i2] = (byte) i3;
                    if (i4 == i5) {
                    }
                } else {
                    i2 = 0;
                    i3 = r9;
                    i4 = i2 + 1;
                    bArr2[i2] = (byte) i3;
                    if (i4 == i5) {
                    }
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002a). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void g(int i2, short s2, int i3, java.lang.Object[] objArr) {
                int i4;
                int i5;
                int i6 = i2 * 3;
                byte[] bArr = $$a;
                int i7 = (i3 * 4) + 4;
                byte[] bArr2 = new byte[i6 + 1];
                if (bArr == null) {
                    int i8 = i6;
                    i5 = i7;
                    i4 = 0;
                    i7 += -i8;
                    i5++;
                    bArr2[i4] = (byte) i7;
                    if (i4 == i6) {
                        objArr[0] = new java.lang.String(bArr2, 0);
                        return;
                    }
                    i4++;
                    i8 = bArr[i5];
                    i7 += -i8;
                    i5++;
                    bArr2[i4] = (byte) i7;
                    if (i4 == i6) {
                    }
                } else {
                    i4 = 0;
                    i7 = 101 - s2;
                    i5 = i7;
                    bArr2[i4] = (byte) i7;
                    if (i4 == i6) {
                    }
                }
            }

            static void init$0() {
                $$a = new byte[]{101, -63, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, 40};
                $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE;
            }

            static void init$1() {
                $$c = new byte[]{89, 125, 6, 47};
                $$d = 157;
            }

            private static void f(boolean z2, int i2, java.lang.String str, int i3, int i4, java.lang.Object[] objArr) {
                char[] cArr;
                if (str != null) {
                    int i5 = $10 + 31;
                    $11 = i5 % 128;
                    if (i5 % 2 == 0) {
                        str.toCharArray();
                        throw null;
                    }
                    cArr = str.toCharArray();
                } else {
                    cArr = str;
                }
                char[] cArr2 = cArr;
                com.facetec.sdk.hp hpVar = new com.facetec.sdk.hp();
                char[] cArr3 = new char[i2];
                hpVar.d = 0;
                while (hpVar.d < i2) {
                    hpVar.b = cArr2[hpVar.d];
                    cArr3[hpVar.d] = (char) (i3 + hpVar.b);
                    int i6 = hpVar.d;
                    try {
                        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i6]), java.lang.Integer.valueOf(d)};
                        java.lang.Object d2 = com.facetec.sdk.al.d(-1738479149);
                        if (d2 == null) {
                            byte b2 = (byte) 0;
                            d2 = com.facetec.sdk.al.c((char) (android.view.View.combineMeasuredStates(0, 0) + 19485), 729 - android.view.MotionEvent.axisFromString(""), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 23, 1066373931, false, $$e(b2, b2, b2), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                        }
                        cArr3[i6] = ((java.lang.Character) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).charValue();
                        java.lang.Object[] objArr3 = {hpVar, hpVar};
                        java.lang.Object d3 = com.facetec.sdk.al.d(1965925374);
                        if (d3 == null) {
                            d3 = com.facetec.sdk.al.c((char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 24339), 1621 - android.view.View.MeasureSpec.getMode(0), android.view.View.resolveSizeAndState(0, 0, 0) + 24, -758982394, false, "v", new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                        }
                        ((java.lang.reflect.Method) d3).invoke(null, objArr3);
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                if (i4 > 0) {
                    $11 = ($10 + 75) % 128;
                    hpVar.f3630a = i4;
                    char[] cArr4 = new char[i2];
                    java.lang.System.arraycopy(cArr3, 0, cArr4, 0, i2);
                    java.lang.System.arraycopy(cArr4, 0, cArr3, i2 - hpVar.f3630a, hpVar.f3630a);
                    java.lang.System.arraycopy(cArr4, hpVar.f3630a, cArr3, 0, i2 - hpVar.f3630a);
                }
                if (z2) {
                    $11 = ($10 + 19) % 128;
                    char[] cArr5 = new char[i2];
                    hpVar.d = 0;
                    while (hpVar.d < i2) {
                        cArr5[hpVar.d] = cArr3[(i2 - hpVar.d) - 1];
                        java.lang.Object[] objArr4 = {hpVar, hpVar};
                        java.lang.Object d4 = com.facetec.sdk.al.d(1965925374);
                        if (d4 == null) {
                            d4 = com.facetec.sdk.al.c((char) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 24338), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1620, ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + com.google.common.base.Ascii.EM, -758982394, false, "v", new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                        }
                        ((java.lang.reflect.Method) d4).invoke(null, objArr4);
                        $10 = ($11 + 11) % 128;
                    }
                    cArr3 = cArr5;
                }
                objArr[0] = new java.lang.String(cArr3);
            }

            @Override // com.facetec.sdk.fd
            public final /* synthetic */ void a(com.facetec.sdk.gu guVar, java.math.BigInteger bigInteger) throws java.io.IOException {
                f3607a = (c + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                guVar.e(bigInteger);
                c = (f3607a + 15) % 128;
            }

            @Override // com.facetec.sdk.fd
            public final /* synthetic */ java.math.BigInteger b(com.facetec.sdk.gt gtVar) throws java.io.IOException {
                int i2 = c + 93;
                f3607a = i2 % 128;
                java.math.BigInteger c2 = c(gtVar);
                if (i2 % 2 == 0) {
                    int i3 = 75 / 0;
                }
                return c2;
            }

            private static java.math.BigInteger c(com.facetec.sdk.gt gtVar) throws java.io.IOException {
                if (gtVar.f() != com.facetec.sdk.gs.NULL) {
                    java.lang.String g2 = gtVar.g();
                    try {
                        java.math.BigInteger bigInteger = new java.math.BigInteger(g2);
                        int i2 = f3607a + 99;
                        c = i2 % 128;
                        if (i2 % 2 != 0) {
                            int i3 = 38 / 0;
                        }
                        return bigInteger;
                    } catch (java.lang.NumberFormatException e7) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed parsing '");
                        sb.append(g2);
                        sb.append("' as BigInteger; at path ");
                        sb.append(gtVar.s());
                        throw new com.facetec.sdk.ev(sb.toString(), e7);
                    }
                }
                c = (f3607a + 89) % 128;
                gtVar.k();
                return null;
            }

            static {
                init$1();
                $10 = 0;
                $11 = 1;
                init$0();
                c = 0;
                f3607a = 1;
                d = 780577470;
            }

            /* JADX WARN: Code restructure failed: missing block: B:101:0x0b59, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:102:0x0b5a, code lost:
            
                r1 = r0.getCause();
             */
            /* JADX WARN: Code restructure failed: missing block: B:103:0x0b5e, code lost:
            
                if (r1 != null) goto L99;
             */
            /* JADX WARN: Code restructure failed: missing block: B:104:0x0b60, code lost:
            
                throw r1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:105:0x0b61, code lost:
            
                throw r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:106:0x0389, code lost:
            
                com.facetec.sdk.gj.AnonymousClass8.c = (com.facetec.sdk.gj.AnonymousClass8.f3607a + 69) % 128;
                r0 = new java.lang.Object[]{null, new int[]{r30}, new int[]{r30}, new int[]{(r4 & (~r6)) | r7}};
                r4 = (r32 - (~(-(-((((((~(154602957 | r11)) | 650170386) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + 463325803) + ((134677705 | r30) * (-184))) + ((~((-670095639) | r11)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE)))))) - 1;
                r6 = r4 << 13;
                r4 = (r4 & (~r6)) | ((~r4) & r6);
                r6 = r4 >>> 17;
                r4 = (~(r4 & r6)) & (r4 | r6);
                r6 = r4 << 5;
                r7 = (~r4) & r6;
             */
            /* JADX WARN: Code restructure failed: missing block: B:108:0x0b62, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:109:0x0b63, code lost:
            
                r1 = r0.getCause();
             */
            /* JADX WARN: Code restructure failed: missing block: B:10:0x02ba, code lost:
            
                r0 = com.facetec.sdk.gj.AnonymousClass8.f3607a;
                com.facetec.sdk.gj.AnonymousClass8.c = ((r0 ^ 99) + ((r0 & 99) << 1)) % 128;
                r0 = new java.lang.Object[]{null, new int[]{r30}, new int[]{(~(r30 & 1)) & (r30 | 1)}, new int[1]};
                r4 = ((((((~(30082694 | r11)) | 854781290) * 226) + 2123037872) + ((((~((-854781291) | r30)) | 12715010) | (~(872148974 | r11))) * (-113))) + ((~(30082694 | r30)) * 113)) + 16;
                r5 = com.facetec.sdk.gh.b.d();
                r6 = r4 * 85;
                r7 = -(-(r32 * 85));
                r8 = ~r32;
                r12 = ~r4;
                r13 = ~(r12 | r8);
                r14 = ~r5;
                r12 = ~((r12 & r14) | (r12 ^ r14));
                r12 = (r12 & r13) | (r13 ^ r12);
                r13 = ~((r8 ^ r14) | (r8 & r14));
                r12 = (r12 ^ r13) | (r12 & r13);
                r13 = (r4 ^ r32) | (r4 & r32);
                r15 = ~((r13 ^ r5) | (r13 & r5));
                r18 = ((r6 ^ r7) + ((r6 & r7) << 1)) + (((r12 ^ r15) | (r12 & r15)) * (-84));
                r5 = ~((r5 & r8) | (r8 ^ r5));
                r4 = (r4 ^ r5) | (r5 & r4);
                r5 = ~((r14 & r32) | (r14 ^ r32));
                r4 = ((r4 ^ r5) | (r4 & r5)) * (-84);
                r6 = (r18 & r4) + (r4 | r18);
                r4 = ~r13;
                r4 = ((r4 ^ r5) | (r5 & r4)) * 84;
                r5 = ((r6 | r4) << 1) - (r4 ^ r6);
                r4 = r5 << 13;
                r4 = ((~r4) & r5) | ((~r5) & r4);
                r5 = r4 >>> 17;
                r4 = (~(r4 & r5)) & (r4 | r5);
                ((int[]) r0[3])[0] = r4 ^ (r4 << 5);
             */
            /* JADX WARN: Code restructure failed: missing block: B:110:0x0b67, code lost:
            
                if (r1 != null) goto L104;
             */
            /* JADX WARN: Code restructure failed: missing block: B:111:0x0b69, code lost:
            
                throw r1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:112:0x0b6a, code lost:
            
                throw r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:113:0x0023, code lost:
            
                r0 = new java.lang.Object[]{null, new int[]{r30}, new int[]{r30}, new int[1]};
                r1 = (int) java.lang.Runtime.getRuntime().freeMemory();
                r3 = ~((-72794137) | r1);
                r4 = ((((713103619 | r3) * (-476)) + 669334487) + (r3 * 952)) + ((~((~r1) | (-72794137))) * 476);
                r1 = com.facetec.sdk.gh.b.d();
                r3 = ~r4;
                r5 = ~(r3 | r32);
                r5 = (r5 ^ r1) | (r5 & r1);
                r6 = ~r32;
                r8 = ~((r6 ^ r4) | (r6 & r4));
                r11 = (((r4 * 615) + (r32 * (-613))) - (~(-(-(((r5 ^ r8) | (r5 & r8)) * 614))))) - 1;
                r1 = ~r1;
                r5 = (~((r3 ^ r1) | (r3 & r1))) | (~((r3 & r32) | (r3 ^ r32)));
                r8 = ~(r1 | r32);
                r5 = -(-(((r5 ^ r8) | (r5 & r8)) * (-1228)));
                r8 = (r11 ^ r5) + ((r5 & r11) << 1);
                r3 = ~((r3 | r6) | r1);
                r1 = (r1 ^ r4) | (r1 & r4);
                r1 = ~((r1 ^ r32) | (r1 & r32));
                r1 = ((r1 ^ r3) | (r1 & r3)) * 614;
                r2 = (r8 ^ r1) + ((r1 & r8) << 1);
                r1 = r2 << 13;
                r1 = (~(r1 & r2)) & (r1 | r2);
                r2 = r1 >>> 17;
                r1 = (r1 & (~r2)) | ((~r1) & r2);
                r2 = r1 << 5;
                ((int[]) r0[3])[0] = (r1 & (~r2)) | ((~r1) & r2);
             */
            /* JADX WARN: Code restructure failed: missing block: B:114:0x00ce, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:115:0x0021, code lost:
            
                if (r29 == null) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x03ea, code lost:
            
                if (((int[]) r0[2])[0] == r30) goto L20;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x03ec, code lost:
            
                r1 = com.facetec.sdk.gj.AnonymousClass8.c;
                com.facetec.sdk.gj.AnonymousClass8.f3607a = ((r1 & 45) + (r1 | 45)) % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x03f7, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x03fb, code lost:
            
                r0 = com.facetec.sdk.al.d(1023220397);
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x03ff, code lost:
            
                if (r0 != null) goto L24;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0401, code lost:
            
                r0 = (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 42582);
                r4 = android.os.SystemClock.currentThreadTimeMillis();
                r6 = android.view.ViewConfiguration.getKeyRepeatTimeout();
                r7 = (byte) 0;
                r8 = (byte) (r7 + 2);
                r13 = new java.lang.Object[1];
                g(r7, r8, (byte) (r8 - 2), r13);
                r0 = com.facetec.sdk.al.c(r0, (r4 > (-1) ? 1 : (r4 == (-1) ? 0 : -1)) + 1551, 24 - (r6 >> 16), -1693294507, false, (java.lang.String) r13[0], new java.lang.Class[0]);
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0441, code lost:
            
                r0 = (java.util.Set) ((java.lang.reflect.Method) r0).invoke(null, null);
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x044a, code lost:
            
                r4 = com.facetec.sdk.al.d(-230269676);
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x0451, code lost:
            
                if (r4 != null) goto L28;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x0453, code lost:
            
                r4 = (char) ((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 42581);
                r6 = android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                r5 = android.text.TextUtils.indexOf("", "");
                r7 = (byte) 0;
                r8 = r7;
                r13 = new java.lang.Object[1];
                g(r7, r8, r8, r13);
                r4 = com.facetec.sdk.al.c(r4, r6 + 1504, 24 - r5, 1437149164, false, (java.lang.String) r13[0], null);
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x0495, code lost:
            
                if (r0.contains(((java.lang.reflect.Field) r4).get(null)) != false) goto L35;
             */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x0497, code lost:
            
                r4 = com.facetec.sdk.al.d(-233963760);
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x049e, code lost:
            
                if (r4 != null) goto L33;
             */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x04a0, code lost:
            
                r4 = (char) (42581 - android.view.View.resolveSize(0, 0));
                r5 = android.view.ViewConfiguration.getFadingEdgeLength();
                r6 = android.view.ViewConfiguration.getMaximumFlingVelocity();
                r8 = (byte) com.facetec.sdk.gj.AnonymousClass8.$$a.length;
                r13 = new java.lang.Object[1];
                g((byte) 0, r8, (byte) (r8 - 4), r13);
                r4 = com.facetec.sdk.al.c(r4, 1552 - (r5 >> 16), (r6 >> 16) + 24, 1440908776, false, (java.lang.String) r13[0], null);
             */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x04e6, code lost:
            
                if (r0.contains(((java.lang.reflect.Field) r4).get(null)) == false) goto L42;
             */
            /* JADX WARN: Code restructure failed: missing block: B:33:0x05e0, code lost:
            
                if ((r31 & 32) != 0) goto L93;
             */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x05e2, code lost:
            
                r0 = com.facetec.sdk.gj.AnonymousClass8.f3607a;
                r4 = (r0 & 43) + (r0 | 43);
                com.facetec.sdk.gj.AnonymousClass8.c = r4 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x05ef, code lost:
            
                if ((r4 % 2) == 0) goto L50;
             */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x05f5, code lost:
            
                if (android.os.Build.VERSION.SDK_INT <= 71) goto L49;
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x0603, code lost:
            
                r0 = -android.graphics.ImageFormat.getBitsPerPixel(0);
                r4 = com.facetec.sdk.gh.b.d();
                r5 = -(-((~((r4 ^ 27) | (r4 & 27))) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING));
                r6 = ~r0;
                r0 = (((((r0 * (-419)) + 11367) - (~r5)) - 1) - (~(((r6 ^ 27) | (r6 & 27)) * (-420)))) - 1;
                r5 = ~(r6 | (-28));
                r4 = ~r4;
                r4 = ~((r4 ^ 27) | (r4 & 27));
                r4 = -(-(((r4 ^ r5) | (r5 & r4)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING));
                r5 = android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16;
                r6 = (android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1));
                r7 = com.facetec.sdk.gh.b.d();
                r8 = r6 * 69;
                r12 = ((r8 | (-1675)) << 1) - (r8 ^ (-1675));
                r8 = ~r6;
                r13 = (r8 & (-26)) | (r8 ^ (-26));
                r14 = ~r7;
                r13 = ~((r13 ^ r14) | (r13 & r14));
                r6 = ~((r6 & 25) | (r6 ^ 25));
                r6 = (r6 ^ r13) | (r13 & r6);
                r7 = ~((r7 & 25) | (r7 ^ 25));
                r6 = ((r6 ^ r7) | (r6 & r7)) * (-68);
                r7 = ((r12 | r6) << 1) - (r6 ^ r12);
                r6 = (r14 & r8) | (r8 ^ r14);
                r6 = (~((r6 ^ 25) | (r6 & 25))) * (-68);
                r12 = (r7 & r6) + (r6 | r7);
                r6 = ~((r14 & (-26)) | (r14 ^ (-26)));
                r6 = ((r6 ^ r8) | (r8 & r6)) * 68;
                r7 = new java.lang.Object[1];
                f(true, (r0 & r4) + (r0 | r4), "\uffd0\u0007\u000e\u0004\u0003\t\t\u0017\u0004\u0007\u0006ￏ\u0006\r\u000e\u000e\uffd1\u0016\u000b\u0010\u000b\uffd1\u0005\u0016\u0007\uffd1\u0005\u0014", (r5 ^ 165) + ((r5 & 165) << 1), (r12 ^ r6) + ((r6 & r12) << 1), r7);
             */
            /* JADX WARN: Code restructure failed: missing block: B:42:0x06ba, code lost:
            
                r0 = new java.lang.Object[]{(java.lang.String) r7[0]};
                r4 = com.facetec.sdk.al.d(1450487247);
             */
            /* JADX WARN: Code restructure failed: missing block: B:43:0x06c5, code lost:
            
                if (r4 != null) goto L57;
             */
            /* JADX WARN: Code restructure failed: missing block: B:44:0x06c7, code lost:
            
                r4 = (char) (6936 - (android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1)));
                r5 = android.view.ViewConfiguration.getTouchSlop();
                r3 = android.view.KeyEvent.keyCodeFromString("");
                r6 = (byte) 0;
                r7 = (byte) (r6 + 3);
                r12 = new java.lang.Object[1];
                g(r6, r7, (byte) (r7 - 3), r12);
                r4 = com.facetec.sdk.al.c(r4, (r5 >> 8) + 2389, r3 + 23, -241445065, false, (java.lang.String) r12[0], new java.lang.Class[]{java.lang.String.class});
             */
            /* JADX WARN: Code restructure failed: missing block: B:45:0x0707, code lost:
            
                r3 = ((java.lang.Long) ((java.lang.reflect.Method) r4).invoke(null, r0)).longValue();
             */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x0714, code lost:
            
                r5 = 90094997;
             */
            /* JADX WARN: Code restructure failed: missing block: B:47:0x0718, code lost:
            
                r0 = (int) java.lang.Runtime.getRuntime().maxMemory();
                r20 = r11;
                r10 = -1;
                r22 = r5 ^ r10;
                r1 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE;
                r0 = r0;
                r7 = ((((((-381) * r5) + (192 * r3)) + ((-191) * r22)) + ((r5 | ((r3 | r0) ^ r10)) * r1)) + (r1 * ((((r0 ^ r10) | r3) ^ r10) | ((r22 | r3) ^ r10)))) + 1761081644;
                r1 = new java.util.Random().nextInt();
                r2 = ~r1;
                r0 = ((int) (r7 >> 32)) & (((((((~(r2 | (-1852899992))) | 138412164) | (~((-415673581) | r2))) * 464) + 1086076522) + (((-1714487828) | r1) * (-464))) + (((~(r1 | (-415673581))) | 138412164) * 464));
                r1 = (int) r7;
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x078f, code lost:
            
                r2 = (int) android.os.SystemClock.elapsedRealtime();
                r3 = ~r2;
                r1 = r1 & ((((((~(731013078 | r3)) | 368641) * 98) + 1237863695) + ((((~(r3 | 706213331)) | 731013078) | (~((-706213332) | r2))) * (-49))) + (((~(r2 | 731013078)) | 705844690) * 49));
             */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x07c4, code lost:
            
                if (((r0 ^ r1) | (r0 & r1)) != 1) goto L65;
             */
            /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
            
                if (r29 == null) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:50:0x07c6, code lost:
            
                r0 = com.facetec.sdk.gj.AnonymousClass8.c;
                r2 = ((r0 | 119) << 1) - (r0 ^ 119);
                com.facetec.sdk.gj.AnonymousClass8.f3607a = r2 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:51:0x07d4, code lost:
            
                if ((r2 % 2) != 0) goto L79;
             */
            /* JADX WARN: Code restructure failed: missing block: B:52:0x09a3, code lost:
            
                com.facetec.sdk.gj.AnonymousClass8.f3607a = (com.facetec.sdk.gj.AnonymousClass8.c + 103) % 128;
                r0 = new java.lang.Object[]{null, new int[]{r30}, new int[]{r30 ^ 10}, new int[1]};
                r1 = r20 | 754443987;
                r2 = (((((~r1) | 70254608) * (-828)) + 775335191) + (r1 * (-828))) - 1909364144;
                r3 = -(-(r2 * (-159)));
                r4 = (r3 ^ (-2544)) + ((r3 & (-2544)) << 1);
                r3 = -(-(((r2 ^ (-17)) | (r2 & (-17))) * 160));
                r5 = ((r4 | r3) << 1) - (r3 ^ r4);
                r1 = ~com.facetec.sdk.gh.b.d();
                r3 = ~((r1 ^ 16) | (r1 & 16));
                r4 = ~((r2 ^ 16) | (r2 & 16));
                r3 = -(-(((r3 ^ r4) | (r3 & r4)) * (-160)));
                r4 = (r5 & r3) + (r3 | r5);
                r1 = ~(r1 | (~r2));
                r1 = ((r1 ^ 16) | (r1 & 16)) * 160;
                r2 = ((r4 | r1) << 1) - (r1 ^ r4);
                r1 = (r2 * 306) + androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS;
                r4 = -(-(r32 * 306));
                r5 = ~r32;
                r6 = ~((r20 ^ r2) | (r20 & r2));
                r7 = ((((r1 & r4) + (r1 | r4)) - (~(((~((r2 ^ r32) | (r32 & r2))) | (~(r30 | r2))) * 305))) - 1) + (((r5 & r6) | (r5 ^ r6)) * 305);
                r1 = (r7 << 13) ^ r7;
                r1 = r1 ^ (r1 >>> 17);
                r2 = r1 << 5;
                ((int[]) r0[3])[0] = (r1 & (~r2)) | ((~r1) & r2);
                r1 = com.facetec.sdk.gj.AnonymousClass8.c;
                r2 = (r1 & 83) + (r1 | 83);
                com.facetec.sdk.gj.AnonymousClass8.f3607a = r2 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:53:0x0a70, code lost:
            
                if ((r2 % 2) == 0) goto L82;
             */
            /* JADX WARN: Code restructure failed: missing block: B:54:0x0a72, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:55:0x0a73, code lost:
            
                r1 = null;
                r1.hashCode();
             */
            /* JADX WARN: Code restructure failed: missing block: B:56:0x0a77, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x00cf, code lost:
            
                com.facetec.sdk.gj.AnonymousClass8.c = (r4 + 27) % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:61:0x07d8, code lost:
            
                com.facetec.sdk.gj.AnonymousClass8.f3607a = (com.facetec.sdk.gj.AnonymousClass8.c + 109) % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:63:0x07e2, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:64:0x07e3, code lost:
            
                r1 = r0.getCause();
             */
            /* JADX WARN: Code restructure failed: missing block: B:65:0x07e7, code lost:
            
                if (r1 != null) goto L69;
             */
            /* JADX WARN: Code restructure failed: missing block: B:66:0x07e9, code lost:
            
                throw r1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:67:0x07ea, code lost:
            
                throw r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:68:0x05f8, code lost:
            
                r1 = 0;
                r20 = r11;
             */
            /* JADX WARN: Code restructure failed: missing block: B:69:0x07ee, code lost:
            
                r2 = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, r1);
                r0 = r2 * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE;
                r1 = (r0 & (-3794)) + (r0 | (-3794));
                r0 = ~r2;
                r4 = ~((r0 | (-15)) | r20);
                r5 = ~(((r2 ^ 14) | (r2 & 14)) | r30);
                r4 = -(-(((r4 ^ r5) | (r4 & r5)) * (-272)));
                r5 = (r1 ^ r4) + ((r1 & r4) << 1);
                r0 = ((~(r0 | r30)) | (~((r0 & 14) | (r0 ^ 14)))) * (-272);
                r1 = (r5 ^ r0) + ((r0 & r5) << 1);
                r0 = ~((r2 & r30) | (r2 ^ r30));
                r0 = -(-(((r0 ^ 14) | (r0 & 14)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE));
                r2 = -android.view.View.resolveSizeAndState(0, 0, 0);
                r4 = com.facetec.sdk.gh.b.d();
                r5 = r2 * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE;
                r6 = ~r2;
                r7 = (r6 ^ (-171)) | (r6 & (-171));
                r8 = ~r4;
                r7 = ~((r7 ^ r8) | (r7 & r8));
                r8 = (r2 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE) | (r2 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE);
                r8 = ~((r8 ^ r4) | (r8 & r4));
                r9 = (((((-46070) | r5) << 1) - (r5 ^ (-46070))) - (~(((r7 & r8) | (r7 ^ r8)) * (-272)))) - 1;
                r5 = ~((r6 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE) | (r6 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE));
                r6 = ~((r6 ^ r4) | (r6 & r4));
                r5 = ((r5 ^ r6) | (r6 & r5)) * (-272);
                r2 = ~(r2 | r4);
                r4 = -android.view.View.resolveSize(0, 0);
                r7 = new java.lang.Object[1];
                f(true, (r1 ^ r0) + ((r0 & r1) << 1), "\u000f\u0002\t\uffff\ufffe\u0004\u0004\u0012\uffff\u0002\u0001ￋ\f", ((r9 & r5) + (r5 | r9)) + (((r2 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE) | (r2 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE), ((r4 | 1) << 1) - (r4 ^ 1), r7);
             */
            /* JADX WARN: Code restructure failed: missing block: B:71:0x08b2, code lost:
            
                r0 = new java.lang.Object[]{(java.lang.String) r7[0]};
                r2 = com.facetec.sdk.al.d(1590238701);
             */
            /* JADX WARN: Code restructure failed: missing block: B:72:0x08bd, code lost:
            
                if (r2 != null) goto L76;
             */
            /* JADX WARN: Code restructure failed: missing block: B:73:0x08bf, code lost:
            
                r5 = (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1);
                r2 = android.text.TextUtils.indexOf("", "");
                r6 = android.graphics.PointF.length(0.0f, 0.0f);
                r3 = (byte) 0;
                r7 = r3;
                r9 = new java.lang.Object[1];
                g(r3, r7, r7, r9);
                r2 = com.facetec.sdk.al.c(r5, 2078 - r2, (r6 > 0.0f ? 1 : (r6 == 0.0f ? 0 : -1)) + 24, -114923755, false, (java.lang.String) r9[0], new java.lang.Class[]{java.lang.String.class});
             */
            /* JADX WARN: Code restructure failed: missing block: B:74:0x08f4, code lost:
            
                r0 = ((java.lang.reflect.Method) r2).invoke(null, r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:75:0x08fb, code lost:
            
                r1 = -(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16);
                r2 = r1 * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE;
                r3 = ((r2 | (-219)) << 1) - (r2 ^ (-219));
                r2 = (r20 ^ r1) | (r20 & r1);
                r2 = -(-(((~((r2 ^ 1) | (r2 & 1))) | (~((~r1) | (-2)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE));
                r4 = ~((r20 ^ 1) | (r20 & 1));
                r5 = ((r3 ^ r2) + ((r2 & r3) << 1)) + (((r4 & r1) | (r4 ^ r1)) * (-440));
                r1 = -(-((((r1 ^ 1) | (r1 & 1)) | r30) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE));
                r2 = android.os.Process.myPid() >> 22;
                r3 = com.facetec.sdk.gh.b.d();
                r4 = (r2 * (-1939)) + 116520;
                r6 = ~((r2 ^ (-121)) | (r2 & (-121)));
                r3 = ~r3;
                r3 = ~((r3 ^ 120) | (r3 & 120));
                r6 = -(-(((r6 ^ r3) | (r6 & r3)) * (-970)));
                r7 = (r4 & r6) + (r4 | r6);
                r2 = ~r2;
                r4 = -(-((~(r2 | 120)) * 1940));
                r6 = ((r7 | r4) << 1) - (r4 ^ r7);
                r2 = ~(r2 | (-121));
                r2 = ((r2 ^ r3) | (r2 & r3)) * 970;
                r14 = new java.lang.Object[1];
                f(true, (r5 & r1) + (r1 | r5), "\u0000", ((r6 | r2) << 1) - (r2 ^ r6), (android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1)), r14);
             */
            /* JADX WARN: Code restructure failed: missing block: B:76:0x09a1, code lost:
            
                if (r0.equals((java.lang.String) r14[0]) == false) goto L84;
             */
            /* JADX WARN: Code restructure failed: missing block: B:78:0x0a7b, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:79:0x0a7c, code lost:
            
                r3 = r32;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x00d5, code lost:
            
                r4 = (byte) android.view.KeyEvent.getModifierMetaStateMask();
                r5 = (r4 * 371) + 8904;
                r11 = ~r30;
                r12 = ~((r11 & (-25)) | (r11 ^ (-25)));
                r13 = ~r4;
                r14 = ~((r13 & r30) | (r13 ^ r30));
                r12 = ((r12 ^ r14) | (r12 & r14)) * (-370);
                r14 = (r5 & r12) + (r5 | r12);
                r5 = ~((r13 & r11) | (r13 ^ r11));
                r12 = ~((r30 & (-25)) | (r30 ^ (-25)));
                r5 = (r5 ^ r12) | (r5 & r12);
                r4 = ~((r4 ^ com.google.common.base.Ascii.CAN) | (r4 & com.google.common.base.Ascii.CAN));
                r5 = -(-(((r5 ^ r4) | (r5 & r4)) * (-370)));
                r12 = -(android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                r15 = android.view.View.MeasureSpec.getSize(0);
                r13 = new java.lang.Object[1];
                f(false, ((r14 & r5) + (r5 | r14)) + (r4 * com.knotapi.knot.utilities.Constants.ID_KROGER), "\u000f\u0000\t\u000f\uffc9\uffde\n\t\u000f\u0000\u0013\u000f￼\t\uffff\r\n\u0004\uffff\uffc9\ufffe\n\t", (r12 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE) + ((r12 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE) << 1), (r15 & 12) + (r15 | 12), r13);
                r4 = java.lang.Class.forName((java.lang.String) r13[0]);
                r12 = -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                r13 = r12 * 677;
                r14 = ((r13 | (-11475)) << 1) - (r13 ^ (-11475));
                r13 = r12 | r30;
                r13 = ((r13 & (-18)) | (r13 ^ (-18))) * (-676);
                r15 = (r14 & r13) + (r13 | r14);
                r13 = ~((r12 ^ (-18)) | (r12 & (-18)));
                r14 = ~((r11 ^ r12) | (r11 & r12));
                r13 = -(-(((r13 ^ r14) | (r13 & r14)) * 676));
                r14 = (r15 ^ r13) + ((r13 & r15) << 1);
                r13 = ~r12;
                r13 = ~((r13 & (-18)) | (r13 ^ (-18)));
                r15 = ~((r11 ^ (-18)) | (r11 & (-18)));
                r13 = (r13 ^ r15) | (r13 & r15);
                r12 = (r12 & 17) | (r12 ^ 17);
                r12 = ~((r12 ^ r30) | (r12 & r30));
                r12 = -(-(((r12 ^ r13) | (r13 & r12)) * 676));
                r7 = new java.lang.Object[1];
                f(false, (r14 & r12) + (r12 | r14), "￼\ufffa\r\u0002\b\u0007￢\u0007\uffff\b\u0000\ufffe\rￚ\t\t\u0005\u0002", (android.view.ViewConfiguration.getTapTimeout() >> 16) + 174, 9 - (~(-(android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24))), r7);
                r0 = r4.getMethod((java.lang.String) r7[0], null).invoke(r29, null);
             */
            /* JADX WARN: Code restructure failed: missing block: B:81:0x0a7e, code lost:
            
                r1 = r0.getCause();
             */
            /* JADX WARN: Code restructure failed: missing block: B:82:0x0a82, code lost:
            
                if (r1 != null) goto L89;
             */
            /* JADX WARN: Code restructure failed: missing block: B:83:0x0a84, code lost:
            
                throw r1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:84:0x0a85, code lost:
            
                throw r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:88:0x0601, code lost:
            
                if (android.os.Build.VERSION.SDK_INT <= 33) goto L71;
             */
            /* JADX WARN: Code restructure failed: missing block: B:89:0x07eb, code lost:
            
                r20 = r11;
                r1 = 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x01d5, code lost:
            
                r4 = (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1));
                r7 = -((byte) android.view.KeyEvent.getModifierMetaStateMask());
                r12 = -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                r15 = new java.lang.Object[1];
                f(false, (r4 & 34) + (r4 | 34), "\u0002\u000b\u0011ￋ\r\nￋ\uffde\r\r\t\u0006\u0000\ufffe\u0011\u0006\f\u000b￦\u000b\u0003\f\ufffe\u000b\u0001\u000f\f\u0006\u0001ￋ\u0000\f\u000b\u0011", (r7 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE) + ((r7 & com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE) << 1), ((r12 | 21) << 1) - (r12 ^ 21), r15);
                r4 = java.lang.Class.forName((java.lang.String) r15[0]);
                r5 = -android.view.KeyEvent.getDeadChar(0, 0);
                r7 = (r5 * 934) - 4660;
                r12 = ~r5;
                r12 = ~((r12 ^ r11) | (r12 & r11));
                r12 = -(-(((r12 & (-6)) | (r12 ^ (-6))) * (-933)));
                r13 = ((r7 | r12) << 1) - (r7 ^ r12);
                r7 = ~(r11 | (-6));
                r12 = ~(r5 | (-6));
                r7 = -(-(((r7 ^ r12) | (r7 & r12)) * 933));
                r12 = -(-android.text.TextUtils.indexOf("", "", 0, 0));
                r14 = -(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1));
                r15 = ~r14;
                r15 = (r15 & r11) | (r15 ^ r11);
                r8 = (((r14 * (-518)) - 2072) - (~(-(-(((~r15) | 4) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE))))) - 1;
                r6 = ~((r15 & 4) | (r15 ^ 4));
                r15 = r14 | 4;
                r15 = ~((r15 ^ r30) | (r15 & r30));
                r6 = -(-(((r6 ^ r15) | (r6 & r15)) * (-519)));
                r15 = new java.lang.Object[1];
                f(true, ((r13 ^ r7) + ((r7 & r13) << 1)) + ((~((r5 ^ 5) | (r5 & 5))) * 933), "\ufff8\u0003�\n\ufffe", (r12 & 176) + (r12 | 176), ((((r8 | r6) << 1) - (r6 ^ r8)) - (~(-(-((r14 | (~((r30 ^ 4) | (r30 & 4)))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE))))) - 1, r15);
             */
            /* JADX WARN: Code restructure failed: missing block: B:91:0x0a86, code lost:
            
                r3 = r32;
             */
            /* JADX WARN: Code restructure failed: missing block: B:92:0x0a89, code lost:
            
                r3 = r32;
                r1 = 1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:94:0x04ec, code lost:
            
                if (android.os.Build.VERSION.SDK_INT != 30) goto L42;
             */
            /* JADX WARN: Code restructure failed: missing block: B:95:0x04ee, code lost:
            
                r0 = new java.lang.Object[]{null, new int[]{r30}, new int[]{r30}, new int[1]};
                r1 = (int) java.lang.Runtime.getRuntime().totalMemory();
                r1 = -(-((((((-838889509) | (~r1)) * (-490)) + 1954981457) + (((~(r1 | 215518667)) | (-1054408176)) * 490)) + 1394648864));
                r3 = (r32 & r1) + (r1 | r32);
                r1 = r3 << 13;
                r1 = ((~r1) & r3) | ((~r3) & r1);
                r2 = r1 >>> 17;
                r1 = (~(r1 & r2)) & (r1 | r2);
                ((int[]) r0[3])[0] = r1 ^ (r1 << 5);
                r1 = com.facetec.sdk.gh.b.d();
                r2 = ~r1;
                r3 = ~((2087402347 & r2) | (2087402347 ^ r2));
                r3 = ((r3 ^ (-1275974929)) | (r3 & (-1275974929))) * (-602);
                r1 = (~((r1 ^ 2087402347) | (2087402347 & r1))) | (-2087714684);
                r5 = ((-2087402348) & r2) | ((-2087402348) ^ r2);
                r5 = ~((r5 ^ (-1275974929)) | (r5 & (-1275974929)));
                r1 = -(-(((r1 ^ r5) | (r5 & r1)) * (-301)));
                r2 = -(-((~((r2 ^ (-1275974929)) | (r2 & (-1275974929)))) * 301));
                r4 = ~com.facetec.sdk.gh.b.d();
                r5 = -(-(((~(((-1827716505) & r4) | ((-1827716505) ^ r4))) | (-1845231103)) * (-970)));
                r6 = ((-759452309) & r5) + (r5 | (-759452309));
                r5 = ((816620352 | r6) << 1) - (r6 ^ 816620352);
                r4 = ~(r4 | (-1827716505));
                r4 = ((r4 ^ 17514598) | (17514598 & r4)) * 970;
             */
            /* JADX WARN: Code restructure failed: missing block: B:96:0x05d9, code lost:
            
                if (((((((350947213 ^ r3) + ((r3 & 350947213) << 1)) - (~r1)) - 1) - (~r2)) - 1) <= ((r5 & r4) + (r4 | r5))) goto L40;
             */
            /* JADX WARN: Code restructure failed: missing block: B:97:0x05db, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:99:0x05dd, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x02b8, code lost:
            
                if ((r4.getField((java.lang.String) r15[0]).getInt(r0) & 2) == 0) goto L15;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public static java.lang.Object[] a(android.content.Context context, int i2, int i3, int i4) {
                int i5 = c;
                int i6 = (i5 & 49) + (i5 | 49);
                int i7 = i6 % 128;
                f3607a = i7;
                if (i6 % 2 == 0) {
                    int i8 = 35 / 0;
                }
                int i9 = i4;
                int i10 = 1;
                int[] iArr = new int[i10];
                int[] iArr2 = new int[i10];
                iArr[0] = i2;
                iArr2[0] = i2;
                java.lang.Object[] objArr = {null, iArr, iArr2, new int[i10]};
                int i11 = (((((~((~r1) | (-578321833))) | 36202792) * 446) - 1918654615) + (((~(((int) java.lang.Runtime.getRuntime().freeMemory()) | (-542119041))) | 210173971) * 446)) - 1033423952;
                int d2 = com.facetec.sdk.gh.b.d();
                int i12 = ~i11;
                int i13 = ~((i12 ^ d2) | (i12 & d2));
                int i14 = ~d2;
                int i15 = ~((i11 ^ (-1)) | i11);
                int i16 = ~i12;
                int i17 = (i16 ^ i13) | (i16 & i13);
                int i18 = ((((((i11 * (-622)) - (~(-(-(i13 * 623))))) - 1) - (~(((i15 & i14) | (i15 ^ i14)) * (-623)))) - 1) - (~(((i14 ^ i17) | (i14 & i17)) * 623))) - 1;
                int d3 = com.facetec.sdk.gh.b.d();
                int i19 = i18 * (-112);
                int i20 = i9 * (-112);
                int i21 = ~i9;
                int i22 = ~d3;
                int i23 = (i22 & i21) | (i21 ^ i22);
                int i24 = ~i23;
                int i25 = -(-(((i24 ^ i18) | (i24 & i18)) * 226));
                int i26 = ~i18;
                int i27 = (~((i9 & i26) | (i26 ^ i9))) | (~((i26 & d3) | (i26 ^ d3)));
                int i28 = ~((i18 ^ i23) | (i23 & i18));
                int i29 = ((((((i19 ^ i20) + ((i19 & i20) << 1)) - (~i25)) - 1) + (((i28 ^ i27) | (i28 & i27)) * (-113))) - (~((~((d3 ^ i21) | (d3 & i21))) * 113))) - 1;
                int i30 = i29 << 13;
                int i31 = ((~i30) & i29) | ((~i29) & i30);
                int i32 = i31 >>> 17;
                int i33 = (~(i31 & i32)) & (i31 | i32);
                ((int[]) objArr[3])[0] = i33 ^ (i33 << 5);
                return objArr;
            }
        };
        r = new com.facetec.sdk.fd<com.facetec.sdk.fo>() { // from class: com.facetec.sdk.gj.7
            private static final byte[] $$a = null;
            private static final int $$b = 0;

            /* renamed from: a, reason: collision with root package name */
            private static int f3606a;
            private static int b;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002f). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void c(int i2, byte b2, int i3, java.lang.Object[] objArr) {
                int i4;
                int i5;
                int i6;
                int i7 = (i3 * 17) + 4;
                int i8 = (b2 * 2) + 99;
                byte[] bArr = $$a;
                int i9 = (i2 * 17) + 1;
                byte[] bArr2 = new byte[i9];
                if (bArr == null) {
                    int i10 = i7;
                    int i11 = 0;
                    i7 = i7 + (-i8) + 3;
                    i5 = i10 + 1;
                    i4 = i11;
                    bArr2[i4] = (byte) i7;
                    i6 = i4 + 1;
                    if (i6 == i9) {
                        objArr[0] = new java.lang.String(bArr2, 0);
                        return;
                    }
                    i10 = i5;
                    i8 = bArr[i5];
                    i11 = i6;
                    i7 = i7 + (-i8) + 3;
                    i5 = i10 + 1;
                    i4 = i11;
                    bArr2[i4] = (byte) i7;
                    i6 = i4 + 1;
                    if (i6 == i9) {
                    }
                } else {
                    i4 = 0;
                    i7 = i8;
                    i5 = i7;
                    bArr2[i4] = (byte) i7;
                    i6 = i4 + 1;
                    if (i6 == i9) {
                    }
                }
            }

            static void init$0() {
                $$a = new byte[]{33, -54, -92, 123, -9, 5, 66, -53, 8, 1, 1, -12, 18, 5, 56, -66, 18, -4, 64, com.visa.cbp.getEncExpo.kernelVersion, -20};
                $$b = 141;
            }

            public static void e(android.content.Context context, long j2, long j3) {
                int i2 = f3606a;
                int i3 = i2 & 1;
                int i4 = -(-((i2 ^ 1) | i3));
                b = ((i3 & i4) + (i3 | i4)) % 128;
                if (context == null) {
                    int i5 = i2 & 19;
                    int i6 = -(-((i2 ^ 19) | i5));
                    b = (((i5 | i6) << 1) - (i5 ^ i6)) % 128;
                    return;
                }
                java.lang.Object obj = com.facetec.sdk.by.e.class.getField("j").get(null);
                int i7 = f3606a;
                int i8 = i7 & 73;
                int i9 = -(-(i7 | 73));
                int i10 = (((i8 | i9) << 1) - (i9 ^ i8)) % 128;
                b = i10;
                int i11 = i10 + 10;
                f3606a = ((~i11) + (i11 << 1)) % 128;
                try {
                    java.lang.Object[] objArr = {context, obj};
                    byte[] bArr = $$a;
                    byte b2 = bArr[9];
                    byte b3 = (byte) (b2 - 1);
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    c(b2, b3, b3, objArr2);
                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr2[0]);
                    byte b4 = bArr[9];
                    byte b5 = (byte) (b4 - 1);
                    byte b6 = b4;
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    c(b5, b6, b6, objArr3);
                    java.lang.reflect.Method method = cls.getMethod((java.lang.String) objArr3[0], android.content.Context.class, com.facetec.sdk.by.e.class);
                    method.setAccessible(true);
                    method.invoke(null, objArr);
                    int i12 = b;
                    f3606a = ((i12 ^ 23) + ((i12 & 23) << 1)) % 128;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }

            @Override // com.facetec.sdk.fd
            public final /* synthetic */ void a(com.facetec.sdk.gu guVar, com.facetec.sdk.fo foVar) throws java.io.IOException {
                guVar.e(foVar);
            }

            @Override // com.facetec.sdk.fd
            public final /* synthetic */ com.facetec.sdk.fo b(com.facetec.sdk.gt gtVar) throws java.io.IOException {
                if (gtVar.f() == com.facetec.sdk.gs.NULL) {
                    gtVar.k();
                    return null;
                }
                return new com.facetec.sdk.fo(gtVar.g());
            }

            static {
                init$0();
                f3606a = 0;
                b = 1;
            }
        };
        t = d(java.lang.String.class, S);
        com.facetec.sdk.fd<java.lang.StringBuilder> fdVar = new com.facetec.sdk.fd<java.lang.StringBuilder>() { // from class: com.facetec.sdk.gj.11
            public static int c;
            public static int e;

            @Override // com.facetec.sdk.fd
            public final /* synthetic */ void a(com.facetec.sdk.gu guVar, java.lang.StringBuilder sb) throws java.io.IOException {
                java.lang.StringBuilder sb2 = sb;
                guVar.d(sb2 == null ? null : sb2.toString());
            }

            @Override // com.facetec.sdk.fd
            public final /* synthetic */ java.lang.StringBuilder b(com.facetec.sdk.gt gtVar) throws java.io.IOException {
                if (gtVar.f() == com.facetec.sdk.gs.NULL) {
                    gtVar.k();
                    return null;
                }
                return new java.lang.StringBuilder(gtVar.g());
            }

            public static int d() {
                int i2 = c;
                c = i2 + 1;
                if (i2 % 7672698 != 0) {
                    return e;
                }
                int i3 = (int) java.lang.Runtime.getRuntime().totalMemory();
                e = i3;
                return i3;
            }
        };
        O = fdVar;
        p = d(java.lang.StringBuilder.class, fdVar);
        com.facetec.sdk.fd<java.lang.StringBuffer> fdVar2 = new com.facetec.sdk.fd<java.lang.StringBuffer>() { // from class: com.facetec.sdk.gj.12
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static int b;
            private static int d;

            /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:4:0x0031). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void c(int i2, short s2, int i3, java.lang.Object[] objArr) {
                int i4;
                int i5 = 4 - (i2 * 4);
                int i6 = s2 * 4;
                byte[] bArr = $$a;
                byte[] bArr2 = new byte[i6 + 18];
                int i7 = 99 - (i3 * 2);
                if (bArr == null) {
                    int i8 = i7;
                    int i9 = 0;
                    int i10 = i5;
                    i5++;
                    i7 = i10 + i8 + 3;
                    i4 = i9;
                    int i11 = i7;
                    int i12 = i5;
                    bArr2[i4] = (byte) i11;
                    i9 = i4 + 1;
                    if (i4 == i6 + 17) {
                        objArr[0] = new java.lang.String(bArr2, 0);
                        return;
                    }
                    i8 = bArr[i12];
                    i10 = i11;
                    i5 = i12;
                    i5++;
                    i7 = i10 + i8 + 3;
                    i4 = i9;
                    int i112 = i7;
                    int i122 = i5;
                    bArr2[i4] = (byte) i112;
                    i9 = i4 + 1;
                    if (i4 == i6 + 17) {
                    }
                } else {
                    i4 = 0;
                    int i1122 = i7;
                    int i1222 = i5;
                    bArr2[i4] = (byte) i1122;
                    i9 = i4 + 1;
                    if (i4 == i6 + 17) {
                    }
                }
            }

            static void init$0() {
                $$a = new byte[]{92, 114, -9, 73, 9, -5, -66, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -8, -1, -1, com.google.common.base.Ascii.FF, -18, -5, -56, 66, -18, 4, com.visa.cbp.getEncExpo.startTransaction, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, com.google.common.base.Ascii.DC4};
                $$b = 102;
            }

            public static void b(long j2, long j3) {
                int i2 = b;
                d = ((i2 ^ 33) + ((i2 & 33) << 1)) % 128;
                byte[] bArr = $$a;
                byte b2 = (byte) (bArr[9] + 1);
                byte b3 = b2;
                java.lang.Object[] objArr = new java.lang.Object[1];
                c(b2, b3, b3, objArr);
                if (java.lang.Class.forName((java.lang.String) objArr[0]).getField("e").getBoolean(null)) {
                    int i3 = (-2) - (~(d + 108));
                    b = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 47 / 0;
                        return;
                    }
                    return;
                }
                byte b4 = (byte) (bArr[9] + 1);
                byte b5 = b4;
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                c(b4, b5, b5, objArr2);
                java.lang.Class.forName((java.lang.String) objArr2[0]).getField("e").setBoolean(null, true);
                int i5 = b;
                d = (((i5 ^ 18) + ((i5 & 18) << 1)) - 1) % 128;
                try {
                    java.lang.reflect.Constructor declaredConstructor = com.facetec.sdk.by.AnonymousClass3.class.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    java.lang.Object[] objArr3 = {declaredConstructor.newInstance(null)};
                    java.lang.reflect.Method method = com.facetec.sdk.dk.class.getMethod("e", java.lang.Runnable.class);
                    method.setAccessible(true);
                    method.invoke(null, objArr3);
                    int i6 = b;
                    int i7 = i6 & 61;
                    int i8 = -(-(i6 | 61));
                    d = (((i7 | i8) << 1) - (i8 ^ i7)) % 128;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }

            @Override // com.facetec.sdk.fd
            public final /* synthetic */ void a(com.facetec.sdk.gu guVar, java.lang.StringBuffer stringBuffer) throws java.io.IOException {
                java.lang.StringBuffer stringBuffer2 = stringBuffer;
                guVar.d(stringBuffer2 == null ? null : stringBuffer2.toString());
            }

            @Override // com.facetec.sdk.fd
            public final /* synthetic */ java.lang.StringBuffer b(com.facetec.sdk.gt gtVar) throws java.io.IOException {
                if (gtVar.f() == com.facetec.sdk.gs.NULL) {
                    gtVar.k();
                    return null;
                }
                return new java.lang.StringBuffer(gtVar.g());
            }

            static {
                init$0();
                b = 0;
                d = 1;
            }
        };
        R = fdVar2;
        q = d(java.lang.StringBuffer.class, fdVar2);
        com.facetec.sdk.fd<java.net.URL> fdVar3 = new com.facetec.sdk.fd<java.net.URL>() { // from class: com.facetec.sdk.gj.15
            @Override // com.facetec.sdk.fd
            public final /* synthetic */ void a(com.facetec.sdk.gu guVar, java.net.URL url) throws java.io.IOException {
                java.net.URL url2 = url;
                guVar.d(url2 == null ? null : url2.toExternalForm());
            }

            @Override // com.facetec.sdk.fd
            public final /* synthetic */ java.net.URL b(com.facetec.sdk.gt gtVar) throws java.io.IOException {
                if (gtVar.f() == com.facetec.sdk.gs.NULL) {
                    gtVar.k();
                    return null;
                }
                java.lang.String g2 = gtVar.g();
                if ("null".equals(g2)) {
                    return null;
                }
                return new java.net.URL(g2);
            }
        };
        Q = fdVar3;
        u = d(java.net.URL.class, fdVar3);
        com.facetec.sdk.fd<java.net.URI> fdVar4 = new com.facetec.sdk.fd<java.net.URI>() { // from class: com.facetec.sdk.gj.14
            @Override // com.facetec.sdk.fd
            public final /* synthetic */ void a(com.facetec.sdk.gu guVar, java.net.URI uri) throws java.io.IOException {
                java.net.URI uri2 = uri;
                guVar.d(uri2 == null ? null : uri2.toASCIIString());
            }

            @Override // com.facetec.sdk.fd
            public final /* synthetic */ java.net.URI b(com.facetec.sdk.gt gtVar) throws java.io.IOException {
                return c(gtVar);
            }

            private static java.net.URI c(com.facetec.sdk.gt gtVar) throws java.io.IOException {
                if (gtVar.f() == com.facetec.sdk.gs.NULL) {
                    gtVar.k();
                    return null;
                }
                try {
                    java.lang.String g2 = gtVar.g();
                    if ("null".equals(g2)) {
                        return null;
                    }
                    return new java.net.URI(g2);
                } catch (java.net.URISyntaxException e7) {
                    throw new com.facetec.sdk.et(e7);
                }
            }
        };
        P = fdVar4;
        x = d(java.net.URI.class, fdVar4);
        com.facetec.sdk.fd<java.net.InetAddress> fdVar5 = new com.facetec.sdk.fd<java.net.InetAddress>() { // from class: com.facetec.sdk.gj.17
            @Override // com.facetec.sdk.fd
            public final /* synthetic */ void a(com.facetec.sdk.gu guVar, java.net.InetAddress inetAddress) throws java.io.IOException {
                java.net.InetAddress inetAddress2 = inetAddress;
                guVar.d(inetAddress2 == null ? null : inetAddress2.getHostAddress());
            }

            @Override // com.facetec.sdk.fd
            public final /* synthetic */ java.net.InetAddress b(com.facetec.sdk.gt gtVar) throws java.io.IOException {
                if (gtVar.f() == com.facetec.sdk.gs.NULL) {
                    gtVar.k();
                    return null;
                }
                return java.net.InetAddress.getByName(gtVar.g());
            }
        };
        X = fdVar5;
        y = c(java.net.InetAddress.class, fdVar5);
        com.facetec.sdk.fd<java.util.UUID> fdVar6 = new com.facetec.sdk.fd<java.util.UUID>() { // from class: com.facetec.sdk.gj.20
            @Override // com.facetec.sdk.fd
            public final /* synthetic */ void a(com.facetec.sdk.gu guVar, java.util.UUID uuid) throws java.io.IOException {
                java.util.UUID uuid2 = uuid;
                guVar.d(uuid2 == null ? null : uuid2.toString());
            }

            @Override // com.facetec.sdk.fd
            public final /* synthetic */ java.util.UUID b(com.facetec.sdk.gt gtVar) throws java.io.IOException {
                return a(gtVar);
            }

            private static java.util.UUID a(com.facetec.sdk.gt gtVar) throws java.io.IOException {
                if (gtVar.f() == com.facetec.sdk.gs.NULL) {
                    gtVar.k();
                    return null;
                }
                java.lang.String g2 = gtVar.g();
                try {
                    return java.util.UUID.fromString(g2);
                } catch (java.lang.IllegalArgumentException e7) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed parsing '");
                    sb.append(g2);
                    sb.append("' as UUID; at path ");
                    sb.append(gtVar.s());
                    throw new com.facetec.sdk.ev(sb.toString(), e7);
                }
            }
        };
        U = fdVar6;
        v = d(java.util.UUID.class, fdVar6);
        com.facetec.sdk.fd<java.util.Currency> e7 = new com.facetec.sdk.gj.AnonymousClass19().e();
        V = e7;
        w = d(java.util.Currency.class, e7);
        final com.facetec.sdk.fd<java.util.Calendar> fdVar7 = new com.facetec.sdk.fd<java.util.Calendar>() { // from class: com.facetec.sdk.gj.16
            @Override // com.facetec.sdk.fd
            public final /* synthetic */ void a(com.facetec.sdk.gu guVar, java.util.Calendar calendar) throws java.io.IOException {
                if (calendar == null) {
                    guVar.g();
                    return;
                }
                guVar.e();
                guVar.c(com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.StringResourceConstants.YEAR);
                guVar.e(r4.get(1));
                guVar.c("month");
                guVar.e(r4.get(2));
                guVar.c("dayOfMonth");
                guVar.e(r4.get(5));
                guVar.c("hourOfDay");
                guVar.e(r4.get(11));
                guVar.c("minute");
                guVar.e(r4.get(12));
                guVar.c("second");
                guVar.e(r4.get(13));
                guVar.d();
            }

            @Override // com.facetec.sdk.fd
            public final /* synthetic */ java.util.Calendar b(com.facetec.sdk.gt gtVar) throws java.io.IOException {
                if (gtVar.f() == com.facetec.sdk.gs.NULL) {
                    gtVar.k();
                    return null;
                }
                gtVar.b();
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                while (gtVar.f() != com.facetec.sdk.gs.END_OBJECT) {
                    java.lang.String i8 = gtVar.i();
                    int o2 = gtVar.o();
                    if (com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.StringResourceConstants.YEAR.equals(i8)) {
                        i2 = o2;
                    } else if ("month".equals(i8)) {
                        i3 = o2;
                    } else if ("dayOfMonth".equals(i8)) {
                        i4 = o2;
                    } else if ("hourOfDay".equals(i8)) {
                        i5 = o2;
                    } else if ("minute".equals(i8)) {
                        i6 = o2;
                    } else if ("second".equals(i8)) {
                        i7 = o2;
                    }
                }
                gtVar.c();
                return new java.util.GregorianCalendar(i2, i3, i4, i5, i6, i7);
            }
        };
        W = fdVar7;
        final java.lang.Class<java.util.Calendar> cls = java.util.Calendar.class;
        final java.lang.Class<java.util.GregorianCalendar> cls2 = java.util.GregorianCalendar.class;
        A = new com.facetec.sdk.fb() { // from class: com.facetec.sdk.gj.29
            @Override // com.facetec.sdk.fb
            public final <T> com.facetec.sdk.fd<T> d(com.facetec.sdk.eo eoVar, com.facetec.sdk.gw<T> gwVar) {
                java.lang.Class<? super T> a2 = gwVar.a();
                if (a2 == cls || a2 == cls2) {
                    return fdVar7;
                }
                return null;
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Factory[type=");
                sb.append(cls.getName());
                sb.append("+");
                sb.append(cls2.getName());
                sb.append(",adapter=");
                sb.append(fdVar7);
                sb.append("]");
                return sb.toString();
            }
        };
        com.facetec.sdk.fd<java.util.Locale> fdVar8 = new com.facetec.sdk.fd<java.util.Locale>() { // from class: com.facetec.sdk.gj.18
            @Override // com.facetec.sdk.fd
            public final /* synthetic */ void a(com.facetec.sdk.gu guVar, java.util.Locale locale) throws java.io.IOException {
                java.util.Locale locale2 = locale;
                guVar.d(locale2 == null ? null : locale2.toString());
            }

            @Override // com.facetec.sdk.fd
            public final /* synthetic */ java.util.Locale b(com.facetec.sdk.gt gtVar) throws java.io.IOException {
                if (gtVar.f() == com.facetec.sdk.gs.NULL) {
                    gtVar.k();
                    return null;
                }
                java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(gtVar.g(), "_");
                java.lang.String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                java.lang.String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                java.lang.String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                if (nextToken2 == null && nextToken3 == null) {
                    return new java.util.Locale(nextToken);
                }
                if (nextToken3 == null) {
                    return new java.util.Locale(nextToken, nextToken2);
                }
                return new java.util.Locale(nextToken, nextToken2, nextToken3);
            }
        };
        T = fdVar8;
        D = d(java.util.Locale.class, fdVar8);
        com.facetec.sdk.fd<com.facetec.sdk.es> fdVar9 = new com.facetec.sdk.fd<com.facetec.sdk.es>() { // from class: com.facetec.sdk.gj.23
            private static com.facetec.sdk.es e(com.facetec.sdk.gt gtVar, com.facetec.sdk.gs gsVar) throws java.io.IOException {
                int i2 = com.facetec.sdk.gj.AnonymousClass28.d[gsVar.ordinal()];
                if (i2 == 4) {
                    gtVar.a();
                    return new com.facetec.sdk.en();
                }
                if (i2 != 5) {
                    return null;
                }
                gtVar.b();
                return new com.facetec.sdk.ep();
            }

            private static com.facetec.sdk.es c(com.facetec.sdk.gt gtVar, com.facetec.sdk.gs gsVar) throws java.io.IOException {
                int i2 = com.facetec.sdk.gj.AnonymousClass28.d[gsVar.ordinal()];
                if (i2 == 1) {
                    return new com.facetec.sdk.ex(new com.facetec.sdk.fo(gtVar.g()));
                }
                if (i2 == 2) {
                    return new com.facetec.sdk.ex(gtVar.g());
                }
                if (i2 == 3) {
                    return new com.facetec.sdk.ex(java.lang.Boolean.valueOf(gtVar.j()));
                }
                if (i2 == 6) {
                    gtVar.k();
                    return com.facetec.sdk.eq.b;
                }
                throw new java.lang.IllegalStateException("Unexpected token: ".concat(java.lang.String.valueOf(gsVar)));
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facetec.sdk.fd
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public void a(com.facetec.sdk.gu guVar, com.facetec.sdk.es esVar) throws java.io.IOException {
                if (esVar == null || esVar.i()) {
                    guVar.g();
                    return;
                }
                if (esVar.g()) {
                    com.facetec.sdk.ex n2 = esVar.n();
                    if (n2.o()) {
                        guVar.e(n2.b());
                        return;
                    } else if (n2.m()) {
                        guVar.b(n2.h());
                        return;
                    } else {
                        guVar.d(n2.c());
                        return;
                    }
                }
                if (esVar.j()) {
                    guVar.a();
                    if (esVar.j()) {
                        java.util.Iterator<com.facetec.sdk.es> it = ((com.facetec.sdk.en) esVar).iterator();
                        while (it.hasNext()) {
                            a(guVar, it.next());
                        }
                        guVar.b();
                        return;
                    }
                    throw new java.lang.IllegalStateException("Not a JSON Array: ".concat(java.lang.String.valueOf(esVar)));
                }
                if (esVar.f()) {
                    guVar.e();
                    if (esVar.f()) {
                        for (java.util.Map.Entry<java.lang.String, com.facetec.sdk.es> entry : ((com.facetec.sdk.ep) esVar).m()) {
                            guVar.c(entry.getKey());
                            a(guVar, entry.getValue());
                        }
                        guVar.d();
                        return;
                    }
                    throw new java.lang.IllegalStateException("Not a JSON Object: ".concat(java.lang.String.valueOf(esVar)));
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Couldn't write ");
                sb.append(esVar.getClass());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }

            @Override // com.facetec.sdk.fd
            public final /* synthetic */ com.facetec.sdk.es b(com.facetec.sdk.gt gtVar) throws java.io.IOException {
                if (gtVar instanceof com.facetec.sdk.fz) {
                    com.facetec.sdk.fz fzVar = (com.facetec.sdk.fz) gtVar;
                    com.facetec.sdk.gs f2 = fzVar.f();
                    if (f2 == com.facetec.sdk.gs.NAME || f2 == com.facetec.sdk.gs.END_ARRAY || f2 == com.facetec.sdk.gs.END_OBJECT || f2 == com.facetec.sdk.gs.END_DOCUMENT) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected ");
                        sb.append(f2);
                        sb.append(" when reading a JsonElement.");
                        throw new java.lang.IllegalStateException(sb.toString());
                    }
                    com.facetec.sdk.es esVar = (com.facetec.sdk.es) fzVar.h();
                    fzVar.n();
                    return esVar;
                }
                com.facetec.sdk.gs f3 = gtVar.f();
                com.facetec.sdk.es e8 = e(gtVar, f3);
                if (e8 == null) {
                    return c(gtVar, f3);
                }
                java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
                while (true) {
                    if (gtVar.d()) {
                        java.lang.String i2 = e8 instanceof com.facetec.sdk.ep ? gtVar.i() : null;
                        com.facetec.sdk.gs f4 = gtVar.f();
                        com.facetec.sdk.es e9 = e(gtVar, f4);
                        boolean z2 = e9 != null;
                        com.facetec.sdk.es c2 = e9 == null ? c(gtVar, f4) : e9;
                        if (e8 instanceof com.facetec.sdk.en) {
                            ((com.facetec.sdk.en) e8).c(c2);
                        } else {
                            ((com.facetec.sdk.ep) e8).b(i2, c2);
                        }
                        if (z2) {
                            arrayDeque.addLast(e8);
                            e8 = c2;
                        }
                    } else {
                        if (e8 instanceof com.facetec.sdk.en) {
                            gtVar.e();
                        } else {
                            gtVar.c();
                        }
                        if (arrayDeque.isEmpty()) {
                            return e8;
                        }
                        e8 = (com.facetec.sdk.es) arrayDeque.removeLast();
                    }
                }
            }
        };
        z = fdVar9;
        B = c(com.facetec.sdk.es.class, fdVar9);
        C = new com.facetec.sdk.fb() { // from class: com.facetec.sdk.gj.21
            @Override // com.facetec.sdk.fb
            public final <T> com.facetec.sdk.fd<T> d(com.facetec.sdk.eo eoVar, com.facetec.sdk.gw<T> gwVar) {
                java.lang.Class<? super T> a2 = gwVar.a();
                if (!java.lang.Enum.class.isAssignableFrom(a2) || a2 == java.lang.Enum.class) {
                    return null;
                }
                if (!a2.isEnum()) {
                    a2 = a2.getSuperclass();
                }
                return new com.facetec.sdk.gj.a(a2);
            }
        };
    }

    /* renamed from: com.facetec.sdk.gj$28, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass28 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[com.facetec.sdk.gs.values().length];
            d = iArr;
            try {
                iArr[com.facetec.sdk.gs.NUMBER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                d[com.facetec.sdk.gs.STRING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                d[com.facetec.sdk.gs.BOOLEAN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                d[com.facetec.sdk.gs.BEGIN_ARRAY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                d[com.facetec.sdk.gs.BEGIN_OBJECT.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                d[com.facetec.sdk.gs.NULL.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: com.facetec.sdk.gj$32, reason: invalid class name */
    final class AnonymousClass32 extends com.facetec.sdk.fd<java.lang.Number> {

        /* renamed from: a, reason: collision with root package name */
        public static int f3605a;
        public static int b;

        AnonymousClass32() {
        }

        @Override // com.facetec.sdk.fd
        public final /* synthetic */ void a(com.facetec.sdk.gu guVar, java.lang.Number number) throws java.io.IOException {
            if (number == null) {
                guVar.g();
            } else {
                guVar.e(r4.shortValue());
            }
        }

        @Override // com.facetec.sdk.fd
        public final /* synthetic */ java.lang.Number b(com.facetec.sdk.gt gtVar) throws java.io.IOException {
            return d(gtVar);
        }

        private static java.lang.Number d(com.facetec.sdk.gt gtVar) throws java.io.IOException {
            if (gtVar.f() == com.facetec.sdk.gs.NULL) {
                gtVar.k();
                return null;
            }
            try {
                int o2 = gtVar.o();
                if (o2 > 65535 || o2 < -32768) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Lossy conversion from ");
                    sb.append(o2);
                    sb.append(" to short; at path ");
                    sb.append(gtVar.s());
                    throw new com.facetec.sdk.ev(sb.toString());
                }
                return java.lang.Short.valueOf((short) o2);
            } catch (java.lang.NumberFormatException e) {
                throw new com.facetec.sdk.ev(e);
            }
        }

        public static int b() {
            int i = f3605a;
            f3605a = i + 1;
            if (i % 7338092 != 0) {
                return b;
            }
            int i2 = (int) java.lang.Runtime.getRuntime().totalMemory();
            b = i2;
            return i2;
        }
    }

    /* renamed from: com.facetec.sdk.gj$19, reason: invalid class name */
    final class AnonymousClass19 extends com.facetec.sdk.fd<java.util.Currency> {
        public static int d;
        public static int e;

        AnonymousClass19() {
        }

        @Override // com.facetec.sdk.fd
        public final /* synthetic */ void a(com.facetec.sdk.gu guVar, java.util.Currency currency) throws java.io.IOException {
            guVar.d(currency.getCurrencyCode());
        }

        @Override // com.facetec.sdk.fd
        public final /* synthetic */ java.util.Currency b(com.facetec.sdk.gt gtVar) throws java.io.IOException {
            return c(gtVar);
        }

        private static java.util.Currency c(com.facetec.sdk.gt gtVar) throws java.io.IOException {
            java.lang.String g = gtVar.g();
            try {
                return java.util.Currency.getInstance(g);
            } catch (java.lang.IllegalArgumentException e2) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed parsing '");
                sb.append(g);
                sb.append("' as Currency; at path ");
                sb.append(gtVar.s());
                throw new com.facetec.sdk.ev(sb.toString(), e2);
            }
        }

        public static int a() {
            int i = e;
            e = i + 1;
            if (i % 9658852 != 0) {
                return d;
            }
            int elapsedCpuTime = (int) android.os.Process.getElapsedCpuTime();
            d = elapsedCpuTime;
            return elapsedCpuTime;
        }
    }

    static final class a<T extends java.lang.Enum<T>> extends com.facetec.sdk.fd<T> {
        public static int c;
        public static int d;
        private final java.util.Map<java.lang.String, T> b = new java.util.HashMap();
        private final java.util.Map<java.lang.String, T> e = new java.util.HashMap();

        /* renamed from: a, reason: collision with root package name */
        private final java.util.Map<T, java.lang.String> f3608a = new java.util.HashMap();

        @Override // com.facetec.sdk.fd
        public final /* synthetic */ void a(com.facetec.sdk.gu guVar, java.lang.Object obj) throws java.io.IOException {
            java.lang.Enum r3 = (java.lang.Enum) obj;
            guVar.d(r3 == null ? null : this.f3608a.get(r3));
        }

        public a(final java.lang.Class<T> cls) {
            try {
                for (java.lang.reflect.Field field : (java.lang.reflect.Field[]) java.security.AccessController.doPrivileged(new java.security.PrivilegedAction<java.lang.reflect.Field[]>() { // from class: com.facetec.sdk.gj.a.4
                    @Override // java.security.PrivilegedAction
                    public final /* synthetic */ java.lang.reflect.Field[] run() {
                        java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
                        java.util.ArrayList arrayList = new java.util.ArrayList(declaredFields.length);
                        for (java.lang.reflect.Field field2 : declaredFields) {
                            if (field2.isEnumConstant()) {
                                arrayList.add(field2);
                            }
                        }
                        java.lang.reflect.Field[] fieldArr = (java.lang.reflect.Field[]) arrayList.toArray(new java.lang.reflect.Field[0]);
                        java.lang.reflect.AccessibleObject.setAccessible(fieldArr, true);
                        return fieldArr;
                    }
                })) {
                    java.lang.Enum r4 = (java.lang.Enum) field.get(null);
                    java.lang.String name2 = r4.name();
                    java.lang.String obj = r4.toString();
                    com.facetec.sdk.fg fgVar = (com.facetec.sdk.fg) field.getAnnotation(com.facetec.sdk.fg.class);
                    if (fgVar != null) {
                        name2 = fgVar.e();
                        for (java.lang.String str : fgVar.a()) {
                            this.b.put(str, r4);
                        }
                    }
                    this.b.put(name2, r4);
                    this.e.put(obj, r4);
                    this.f3608a.put(r4, name2);
                }
            } catch (java.lang.IllegalAccessException e) {
                throw new java.lang.AssertionError(e);
            }
        }

        @Override // com.facetec.sdk.fd
        public final /* synthetic */ java.lang.Object b(com.facetec.sdk.gt gtVar) throws java.io.IOException {
            if (gtVar.f() == com.facetec.sdk.gs.NULL) {
                gtVar.k();
                return null;
            }
            java.lang.String g = gtVar.g();
            T t = this.b.get(g);
            return t == null ? this.e.get(g) : t;
        }

        public static int d() {
            int i = d;
            d = i + 1;
            if (i % 9741916 != 0) {
                return c;
            }
            int myPid = android.os.Process.myPid();
            c = myPid;
            return myPid;
        }
    }

    public static <TT> com.facetec.sdk.fb d(final java.lang.Class<TT> cls, final com.facetec.sdk.fd<TT> fdVar) {
        return new com.facetec.sdk.fb() { // from class: com.facetec.sdk.gj.24
            @Override // com.facetec.sdk.fb
            public final <T> com.facetec.sdk.fd<T> d(com.facetec.sdk.eo eoVar, com.facetec.sdk.gw<T> gwVar) {
                if (gwVar.a() == cls) {
                    return fdVar;
                }
                return null;
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Factory[type=");
                sb.append(cls.getName());
                sb.append(",adapter=");
                sb.append(fdVar);
                sb.append("]");
                return sb.toString();
            }
        };
    }

    public static <TT> com.facetec.sdk.fb a(final java.lang.Class<TT> cls, final java.lang.Class<TT> cls2, final com.facetec.sdk.fd<? super TT> fdVar) {
        return new com.facetec.sdk.fb() { // from class: com.facetec.sdk.gj.22
            @Override // com.facetec.sdk.fb
            public final <T> com.facetec.sdk.fd<T> d(com.facetec.sdk.eo eoVar, com.facetec.sdk.gw<T> gwVar) {
                java.lang.Class<? super T> a2 = gwVar.a();
                if (a2 == cls || a2 == cls2) {
                    return fdVar;
                }
                return null;
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Factory[type=");
                sb.append(cls2.getName());
                sb.append("+");
                sb.append(cls.getName());
                sb.append(",adapter=");
                sb.append(fdVar);
                sb.append("]");
                return sb.toString();
            }
        };
    }

    private static <T1> com.facetec.sdk.fb c(final java.lang.Class<T1> cls, final com.facetec.sdk.fd<T1> fdVar) {
        return new com.facetec.sdk.fb() { // from class: com.facetec.sdk.gj.30
            @Override // com.facetec.sdk.fb
            public final <T2> com.facetec.sdk.fd<T2> d(com.facetec.sdk.eo eoVar, com.facetec.sdk.gw<T2> gwVar) {
                final java.lang.Class<? super T2> a2 = gwVar.a();
                if (cls.isAssignableFrom(a2)) {
                    return (com.facetec.sdk.fd<T2>) new com.facetec.sdk.fd<T1>() { // from class: com.facetec.sdk.gj.30.1
                        @Override // com.facetec.sdk.fd
                        public final void a(com.facetec.sdk.gu guVar, T1 t1) throws java.io.IOException {
                            fdVar.a(guVar, t1);
                        }

                        @Override // com.facetec.sdk.fd
                        public final T1 b(com.facetec.sdk.gt gtVar) throws java.io.IOException {
                            T1 t1 = (T1) fdVar.b(gtVar);
                            if (t1 == null || a2.isInstance(t1)) {
                                return t1;
                            }
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected a ");
                            sb.append(a2.getName());
                            sb.append(" but was ");
                            sb.append(t1.getClass().getName());
                            sb.append("; at path ");
                            sb.append(gtVar.s());
                            throw new com.facetec.sdk.ev(sb.toString());
                        }
                    };
                }
                return null;
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Factory[typeHierarchy=");
                sb.append(cls.getName());
                sb.append(",adapter=");
                sb.append(fdVar);
                sb.append("]");
                return sb.toString();
            }
        };
    }
}
