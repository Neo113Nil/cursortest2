package com.facetec.sdk;

/* loaded from: classes8.dex */
public class ak extends java.lang.Exception {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10;
    private static int $11;

    /* renamed from: a, reason: collision with root package name */
    private static int f3390a;
    private static int d;
    private static long e;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$e(byte b, short s, int i) {
        int i2;
        int i3;
        int i4 = (b * 2) + 4;
        int i5 = 1 - (i * 4);
        int i6 = s + 119;
        byte[] bArr = $$c;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i6;
            i3 = 0;
            int i8 = i4;
            int i9 = i4 + i7;
            int i10 = i8 + 1;
            i2 = i3;
            i6 = i9;
            i4 = i10;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
                return new java.lang.String(bArr2, 0);
            }
            int i11 = i6;
            i8 = i4;
            i4 = bArr[i4];
            i7 = i11;
            int i92 = i4 + i7;
            int i102 = i8 + 1;
            i2 = i3;
            i6 = i92;
            i4 = i102;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void f(short s, byte b, byte b2, java.lang.Object[] objArr) {
        int i;
        byte[] bArr = $$a;
        int i2 = (b * 4) + 99;
        int i3 = (s * 2) + 4;
        int i4 = b2 * 4;
        byte[] bArr2 = new byte[1 - i4];
        if (bArr == null) {
            int i5 = i2;
            int i6 = 0;
            int i7 = i3;
            int i8 = (-i3) + i5;
            int i9 = i7 + 1;
            i = i6;
            i2 = i8;
            i3 = i9;
            bArr2[i] = (byte) i2;
            if (i == 0 - i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i10 = i2;
            i7 = i3;
            i3 = bArr[i3];
            i6 = i + 1;
            i5 = i10;
            int i82 = (-i3) + i5;
            int i92 = i7 + 1;
            i = i6;
            i2 = i82;
            i3 = i92;
            bArr2[i] = (byte) i2;
            if (i == 0 - i4) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            if (i == 0 - i4) {
            }
        }
    }

    static void init$0() {
        $$a = new byte[]{19, -36, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 34};
        $$b = 95;
    }

    static void init$1() {
        $$c = new byte[]{89, 125, 6, 47};
        $$d = 58;
    }

    ak(com.facetec.sdk.ak.e eVar) {
        this(eVar, "");
    }

    ak(com.facetec.sdk.ak.e eVar, java.lang.String str) {
        super(e(eVar, str));
    }

    ak(java.lang.Throwable th) {
        super(e(com.facetec.sdk.ak.e.UNKNOWN, ""), th);
    }

    ak(com.facetec.sdk.ak.e eVar, java.lang.Throwable th) {
        super(e(eVar, ""), th);
    }

    private static java.lang.String e(com.facetec.sdk.ak.e eVar, java.lang.String str) {
        d = (f3390a + 109) % 128;
        java.lang.String format = java.lang.String.format(java.util.Locale.US, "Camera error (%d)", java.lang.Integer.valueOf(eVar.j));
        if (!str.isEmpty()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(format);
            sb.append(": ");
            sb.append(str);
            format = sb.toString();
        }
        int i = f3390a + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        d = i % 128;
        if (i % 2 == 0) {
            return format;
        }
        throw null;
    }

    enum e {
        UNKNOWN(0),
        PERMISSION_DENIED(1),
        OPEN_TIMEOUT(2),
        LOCK_OPEN_TIMEOUT(3),
        CLOSE_ERROR(4),
        FRONT_FACING_NOT_FOUND(5),
        NO_OUTPUT_SIZES(6),
        ACCESS_ERROR(7);

        final int j;

        e(int i2) {
            this.j = i2;
        }
    }

    private static void c(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        java.lang.Object obj = null;
        if (str != null) {
            int i2 = $10 + 29;
            $11 = i2 % 128;
            if (i2 % 2 == 0) {
                str.toCharArray();
                obj.hashCode();
                throw null;
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.facetec.sdk.hv hvVar = new com.facetec.sdk.hv();
        hvVar.d = i;
        int length = cArr2.length;
        long[] jArr = new long[length];
        hvVar.c = 0;
        while (hvVar.c < cArr2.length) {
            int i3 = hvVar.c;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[hvVar.c]), hvVar, hvVar};
                java.lang.Object d2 = com.facetec.sdk.al.d(-1009843105);
                if (d2 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b + 1);
                    d2 = com.facetec.sdk.al.c((char) (android.graphics.Color.blue(0) + 33463), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 478, 'H' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 1679851175, false, $$e(b, b2, (byte) (b2 - 1)), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class});
                }
                jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).longValue() ^ (e ^ 2966223176042272838L);
                java.lang.Object[] objArr3 = {hvVar, hvVar};
                java.lang.Object d3 = com.facetec.sdk.al.d(95517984);
                if (d3 == null) {
                    byte b3 = (byte) 0;
                    d3 = com.facetec.sdk.al.c((char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), 590 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), android.text.TextUtils.indexOf("", "", 0) + 24, -1570895912, false, $$e(b3, b3, b3), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
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
        char[] cArr3 = new char[length];
        hvVar.c = 0;
        while (hvVar.c < cArr2.length) {
            int i4 = $11 + 105;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                cArr3[hvVar.c] = (char) jArr[hvVar.c];
                java.lang.Object[] objArr4 = {hvVar, hvVar};
                java.lang.Object d4 = com.facetec.sdk.al.d(95517984);
                if (d4 == null) {
                    byte b4 = (byte) 0;
                    d4 = com.facetec.sdk.al.c((char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), 592 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 24 - android.view.KeyEvent.getDeadChar(0, 0), -1570895912, false, $$e(b4, b4, b4), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                java.lang.Object obj2 = null;
                ((java.lang.reflect.Method) d4).invoke(null, objArr4);
                obj2.hashCode();
                throw null;
            }
            cArr3[hvVar.c] = (char) jArr[hvVar.c];
            java.lang.Object[] objArr5 = {hvVar, hvVar};
            java.lang.Object d5 = com.facetec.sdk.al.d(95517984);
            if (d5 == null) {
                byte b5 = (byte) 0;
                d5 = com.facetec.sdk.al.c((char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), 592 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 24 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -1570895912, false, $$e(b5, b5, b5), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
            }
            ((java.lang.reflect.Method) d5).invoke(null, objArr5);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        d = 0;
        f3390a = 1;
        e = 8010912178228807533L;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(2:32|33)|(1:35)(4:69|70|71|(6:73|37|38|(1:40)(5:43|44|45|46|(3:48|(1:50)(4:55|56|57|58)|(2:53|54)))|41|42)(1:74))|36|37|38|(0)(0)|41|42) */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0676, code lost:
    
        if ((r0 % 2) != 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x06ee, code lost:
    
        if (r0.equals((java.lang.String) r15[0]) != false) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0617 A[Catch: Exception -> 0x07aa, TRY_LEAVE, TryCatch #1 {Exception -> 0x07aa, blocks: (B:38:0x05b2, B:43:0x0617, B:46:0x0640, B:48:0x0648, B:55:0x0679, B:58:0x06e8, B:62:0x079b, B:63:0x07a1, B:66:0x07a3, B:67:0x07a9, B:45:0x0621, B:57:0x0683), top: B:37:0x05b2, inners: #0, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] b(int i, int i2) {
        java.lang.Object[] objArr;
        java.lang.Object[] objArr2;
        char c;
        java.lang.String str;
        java.io.File file;
        java.io.File file2;
        int i3 = d;
        f3390a = ((i3 & 27) + (i3 | 27)) % 128;
        try {
            int myPid = android.os.Process.myPid() >> 22;
            int d2 = com.facetec.sdk.mt.c.d();
            int i4 = myPid * 491;
            int i5 = (((-26854413) | i4) << 1) - (i4 ^ (-26854413));
            int i6 = ~myPid;
            int i7 = (i6 ^ (-54918)) | (i6 & (-54918));
            int i8 = ~d2;
            int i9 = -(-(((i7 & i8) | (i7 ^ i8)) * (-490)));
            int i10 = ~(myPid | (-54918));
            int i11 = ~((d2 & (-54918)) | (d2 ^ (-54918)));
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            c("ὂ짝뉥鳁䕝⿇ᡒ싯ꭦ间繚⣳ᅹﮄꐈ躃眏↛ਕ", ((((i5 ^ i9) + ((i5 & i9) << 1)) + (((i10 & i11) | (i10 ^ i11)) * 490)) - (~(-(-(i6 * 490))))) - 1, objArr3);
            int resolveSize = android.view.View.resolveSize(0, 0);
            int d3 = com.facetec.sdk.mt.c.d();
            int i12 = ~resolveSize;
            int i13 = ~d3;
            int i14 = ~((i13 ^ i12) | (i13 & i12));
            int i15 = ~((resolveSize & (-55292)) | (resolveSize ^ (-55292)));
            int i16 = ((((resolveSize * (-344)) - 19020104) - (~(((~((i12 ^ d3) | (i12 & d3))) | (~((i12 ^ (-55292)) | (i12 & (-55292))))) * 345))) - 1) + (((i14 ^ i15) | (i14 & i15)) * 345);
            int i17 = i12 | (-55292);
            int i18 = -(-((~((d3 ^ i17) | (i17 & d3))) * 345));
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            c("\u1f5c좱내颮䂮⢢Ⴎ\uf8b0ꂜ袊炡墇\u008d\ue8e1탶룹惾䣲", (i16 ^ i18) + ((i16 & i18) << 1), objArr4);
            java.lang.String[] strArr = {(java.lang.String) objArr3[0], (java.lang.String) objArr4[0]};
            int i19 = f3390a;
            d = ((i19 & 35) + (i19 | 35)) % 128;
            int i20 = 0;
            while (true) {
                if (i20 >= 2) {
                    objArr = new java.lang.Object[]{null, new int[]{i}, new int[]{i}, new int[1]};
                    int elapsedRealtime = (int) android.os.SystemClock.elapsedRealtime();
                    int i21 = (((~((-96498466) | elapsedRealtime)) | 782696675) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) + 1801217087 + (((~((~elapsedRealtime) | (-96498466))) | 782696675) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE);
                    int i22 = (i2 & i21) + (i21 | i2);
                    int i23 = i22 ^ (i22 << 13);
                    int i24 = i23 ^ (i23 >>> 17);
                    ((int[]) objArr[3])[0] = i24 ^ (i24 << 5);
                    break;
                }
                java.lang.String str2 = strArr[i20];
                int i25 = -(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                c("Ὂ䀂ꇁʌ托쌡ⓥ藴\ue57c䘧ꟃݢ栚짒⪼詥", (i25 & 24391) + (i25 | 24391), objArr5);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr5[0]);
                if (((java.lang.Boolean) cls.getMethod(str2, new java.lang.Class[0]).invoke(cls, null)).booleanValue()) {
                    com.facetec.sdk.mt.c.d();
                    com.facetec.sdk.mt.c.d();
                    objArr = new java.lang.Object[]{null, new int[]{i}, new int[]{i ^ 1}, new int[1]};
                    int myUid = android.os.Process.myUid();
                    int i26 = ((((~((-579954410) | myUid)) | 43017960) * 336) - 285711893) + (((~(244744186 | myUid)) | (-781680636)) * (-168)) + (((~((~myUid) | 244744186)) | (-579954410)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE);
                    int d4 = com.facetec.sdk.mt.c.d();
                    int i27 = i26 * 832;
                    int i28 = ~i26;
                    int i29 = ~d4;
                    int i30 = ~((i28 & i29) | (i28 ^ i29));
                    int i31 = (i26 ^ 16) | (i26 & 16);
                    int i32 = ~((i31 ^ d4) | (i31 & d4));
                    int i33 = ~(i29 | (-17));
                    int i34 = ~((d4 ^ 16) | (d4 & 16));
                    int i35 = (i33 & i34) | (i33 ^ i34);
                    int i36 = ~((i26 ^ d4) | (d4 & i26));
                    int i37 = ((((i27 ^ (-13280)) + ((i27 & (-13280)) << 1)) - (~(((i30 & i32) | (i30 ^ i32)) * (-831)))) - 1) + ((~(d4 | (i28 & 16) | (i28 ^ 16))) * (-1662)) + (((i36 & i35) | (i36 ^ i35)) * 831);
                    int i38 = ~i2;
                    int i39 = ~i;
                    int i40 = ((((i37 * (-830)) - (~(i2 * 832))) - 1) - (~(-(-(((~((i39 & i38) | (i38 ^ i39))) | (~(((i37 ^ i2) | (i37 & i2)) | i))) * (-831)))))) - 1;
                    int i41 = i38 | i37;
                    int i42 = -(-((~((i41 ^ i) | (i41 & i))) * (-1662)));
                    int i43 = ~i37;
                    int i44 = ~((i39 ^ i43) | (i43 & i39));
                    int i45 = ~((i37 ^ i) | (i37 & i));
                    int i46 = (i44 ^ i45) | (i44 & i45);
                    int i47 = ~((i2 ^ i) | (i2 & i));
                    int i48 = (((i40 & i42) + (i42 | i40)) - (~(((i46 & i47) | (i46 ^ i47)) * 831))) - 1;
                    int i49 = i48 << 13;
                    int i50 = (~(i49 & i48)) & (i49 | i48);
                    int i51 = i50 >>> 17;
                    int i52 = (i50 & (~i51)) | ((~i50) & i51);
                    int i53 = i52 << 5;
                    ((int[]) objArr[3])[0] = (~(i52 & i53)) & (i52 | i53);
                    break;
                }
                i20++;
                d = (f3390a + 79) % 128;
            }
        } catch (java.lang.Exception unused) {
            int i54 = ~i;
            java.lang.Object[] objArr6 = {null, new int[]{i}, new int[]{(i & (-3)) | (i54 & 2)}, new int[]{(r0 & (~r9)) | r11}};
            int i55 = -(-(((((~((-744312404) | i54)) | 71829520) * (-241)) - 1106414221) + (((~(i54 | (-672482884))) | 8556672) * 241) + 16));
            int i56 = ((i2 | i55) << 1) - (i55 ^ i2);
            int i57 = i56 << 13;
            int i58 = ((~i57) & i56) | ((~i56) & i57);
            int i59 = i58 ^ (i58 >>> 17);
            int i60 = i59 << 5;
            int i61 = (~i59) & i60;
            objArr = objArr6;
        }
        if (i != ((int[]) objArr[2])[0]) {
            int i62 = f3390a;
            int i63 = (i62 & 77) + (i62 | 77);
            d = i63 % 128;
            if (i63 % 2 == 0) {
                return objArr;
            }
            throw null;
        }
        try {
            java.lang.Object d5 = com.facetec.sdk.al.d(-1447165611);
            if (d5 == null) {
                char c2 = (char) (18952 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                int blue = android.graphics.Color.blue(0);
                int indexOf = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                byte b = (byte) 0;
                byte b2 = b;
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                f(b, b2, b2, objArr7);
                d5 = com.facetec.sdk.al.c(c2, 2102 - blue, 23 - indexOf, 240221101, false, (java.lang.String) objArr7[0], new java.lang.Class[0]);
            }
            long longValue = ((java.lang.Long) ((java.lang.reflect.Method) d5).invoke(null, null)).longValue();
            long j = -613138828;
            long j2 = -167;
            long j3 = -1;
            long j4 = longValue ^ j3;
            long uptimeMillis = (int) android.os.SystemClock.uptimeMillis();
            long j5 = (((((j2 * j) + (j2 * longValue)) + (336 * ((((j ^ j3) | j4) ^ j3) | ((j4 | uptimeMillis) ^ j3)))) + ((-168) * (((longValue | j) ^ j3) | ((j | uptimeMillis) ^ j3)))) + (com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE * (j4 | (j3 ^ ((uptimeMillis ^ j3) | j))))) - 1152905492;
            int elapsedRealtime2 = (int) android.os.SystemClock.elapsedRealtime();
            int i64 = ((int) (j5 >> 32)) & (((~(2077753079 | elapsedRealtime2)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + 1332762306 + (((~((~elapsedRealtime2) | 2077753079)) | 25272480) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL));
            int i65 = ~i;
            int i66 = ((int) j5) & ((((-521219257) | i) * (-50)) + 1122299255 + (((~(1067003129 | i)) | (~((-150995977) | i65))) * 50) + (((~((-521219257) | i65)) | (~(916007153 | i65)) | 150995976) * 50));
            if (((i64 ^ i66) | (i64 & i66)) == 1) {
                int i67 = d;
                f3390a = ((i67 ^ 21) + ((i67 & 21) << 1)) % 128;
                objArr2 = new java.lang.Object[]{null, new int[]{i}, new int[]{(~(i & 10)) & (i | 10)}, new int[]{(r3 & (~r7)) | r9}};
                int i68 = -(-((((-295137) | i) * (-381)) + 1575884282 + (((~(819158787 | i65)) | (-814209252)) * 381) + 112446832));
                int i69 = ((i2 | i68) << 1) - (i68 ^ i2);
                int i70 = i69 << 13;
                int i71 = (~(i70 & i69)) & (i70 | i69);
                int i72 = i71 >>> 17;
                int i73 = (i71 & (~i72)) | ((~i71) & i72);
                int i74 = i73 << 5;
                int i75 = (~i73) & i74;
                f3390a = ((i67 ^ 17) + ((i67 & 17) << 1)) % 128;
                c = 2;
            } else {
                objArr2 = new java.lang.Object[]{null, new int[]{i}, new int[]{i}, new int[1]};
                int i76 = (((((~((~r0) | (-509581971))) | 306710544) * 446) - 1918654615) + (((~(new java.util.Random().nextInt(652605586) | (-202871427))) | 8406081) * 446)) - 646050848;
                int d6 = com.facetec.sdk.mt.c.d();
                int i77 = i76 * (-195);
                int i78 = ~i76;
                int i79 = ~i78;
                int i80 = ~(i76 | d6);
                int i81 = -(-(((i79 ^ i80) | (i79 & i80)) * (-196)));
                int i82 = (i77 & i81) + (i77 | i81);
                int i83 = -(-(i76 * my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY));
                int i84 = ((i82 | i83) << 1) - (i83 ^ i82);
                int i85 = ~((i78 ^ (-1)) | i78);
                int i86 = ~((d6 ^ i76) | (d6 & i76));
                int i87 = ((i86 ^ i85) | (i86 & i85)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE;
                int i88 = i2 + (((i84 | i87) << 1) - (i87 ^ i84));
                int i89 = i88 << 13;
                int i90 = (i88 & (~i89)) | ((~i88) & i89);
                int i91 = i90 >>> 17;
                int i92 = (~(i90 & i91)) & (i90 | i91);
                ((int[]) objArr2[3])[0] = i92 ^ (i92 << 5);
                int i93 = f3390a + 69;
                d = i93 % 128;
                c = 2;
                if (i93 % 2 != 0) {
                    int i94 = 3 / 2;
                }
            }
            if (i != ((int[]) objArr2[c])[0]) {
                return objArr2;
            }
            try {
                int i95 = -(android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                int i96 = ~i95;
                int i97 = (i95 * (-716)) + 26744095 + (((i96 ^ 18637) | (i96 & 18637)) * (-1434));
                int i98 = ~((i65 & 18637) | (i65 ^ 18637));
                int i99 = ~(i95 | 18637);
                int i100 = (i96 & (-18638)) | (i96 ^ (-18638));
                int i101 = -(-(((i98 ^ i99) | (i98 & i99) | (~(i100 | i))) * 717));
                int i102 = ~(i100 | i65);
                int i103 = ~((i95 ^ 18637) | (i95 & 18637));
                int i104 = (i103 ^ i102) | (i103 & i102);
                int i105 = ~((i ^ 18637) | (i & 18637));
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                c("ἄ垕軈씿㰰獁ꮀ\ue2c2夭遻읅㿋盓괧\ue47f孝鎜쪙ĵ确꽎\ue799廜键챴́箚닁\ue935\u2060靈쾖ۿ紙둥\ueb5e⎞髩턠ࡢ", (i97 ^ i101) + ((i97 & i101) << 1) + (((i104 ^ i105) | (i104 & i105)) * 717), objArr8);
                file2 = new java.io.File((java.lang.String) objArr8[0]);
            } catch (java.lang.Exception unused2) {
            }
            if (file2.canRead()) {
                java.io.FileReader fileReader = new java.io.FileReader(file2);
                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(fileReader);
                try {
                    java.lang.String readLine = bufferedReader.readLine();
                    int i106 = -(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    int i107 = (i106 * 398) - 23064624;
                    int i108 = ~i106;
                    int i109 = ~((i108 ^ i65) | (i108 & i65));
                    int i110 = ~((i108 & 58244) | (i108 ^ 58244));
                    int i111 = -(-(((i109 & i110) | (i109 ^ i110) | (~(58244 | i65))) * (-397)));
                    int i112 = (i110 & i) | (i ^ i110);
                    int i113 = ~((i106 ^ (-58245)) | ((-58245) & i106));
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    c("ὅﳇ\ud85d", (((((i107 & i111) + (i107 | i111)) - (~(i110 * (-397)))) - 1) - (~(-(-(((i113 ^ i112) | (i113 & i112)) * 397))))) - 1, objArr9);
                    if (!readLine.equals((java.lang.String) objArr9[0])) {
                        fileReader.close();
                        bufferedReader.close();
                        str = readLine;
                        int absoluteGravity = android.view.Gravity.getAbsoluteGravity(0, 0);
                        int d7 = com.facetec.sdk.mt.c.d();
                        int i114 = absoluteGravity * 236;
                        int i115 = (8187393 ^ i114) + ((i114 & 8187393) << 1);
                        int i116 = ~absoluteGravity;
                        int i117 = ((~((~d7) | i116)) | 17383) * (-235);
                        int i118 = ((i115 | i117) << 1) - (i115 ^ i117);
                        int i119 = ~((i116 & d7) | (i116 ^ d7));
                        int i120 = ((i119 ^ 17383) | (i119 & 17383)) * (-470);
                        int i121 = ((i118 | i120) << 1) - (i120 ^ i118);
                        int i122 = i116 | 17383;
                        int i123 = ((~((absoluteGravity ^ (-17384)) | (absoluteGravity & (-17384)))) | (~((d7 ^ i122) | (d7 & i122)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE;
                        java.lang.Object[] objArr10 = new java.lang.Object[1];
                        c("ἄ岼颗퓱ე䲇蠲쐃`簛롆\uf5a3ㆍ淾ꧬ\ue5ceⅴ鴚\ud961ᕼ兆躻쪔ڵ䋦뻊屮㘔爃깥\uea5d", (i121 ^ i123) + ((i123 & i121) << 1), objArr10);
                        file = new java.io.File((java.lang.String) objArr10[0]);
                        if (!file.canRead()) {
                            try {
                                java.lang.String readLine2 = new java.io.BufferedReader(new java.io.FileReader(file)).readLine();
                                java.lang.Object[] objArr11 = new java.lang.Object[1];
                                c("Ἒ", 43951 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr11);
                                if (readLine2.equals((java.lang.String) objArr11[0])) {
                                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                                    c("ἄꏛ晔⫑\ued08뇏瑜㣌ﭝ뿕䉙ڥ쥫跩偣ᓳ흼鮷幩\ue2e0ꕶ槷Ⰰ\uf080댄矏㨑ﺈ脞䖟࠘처輬厗ᘢ\udaac", 48258 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr12);
                                    java.io.File file3 = new java.io.File((java.lang.String) objArr12[0]);
                                    if (file3.canRead()) {
                                        try {
                                            java.lang.String readLine3 = new java.io.BufferedReader(new java.io.FileReader(file3)).readLine();
                                            int i124 = (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                            int d8 = com.facetec.sdk.mt.c.d();
                                            int i125 = i124 * 624;
                                            int i126 = (i124 & (-43951)) | (i124 ^ (-43951));
                                            int i127 = ~(i124 | (-43951));
                                            int i128 = ~((-43951) | d8);
                                            java.lang.Object[] objArr13 = new java.lang.Object[1];
                                            c("Ἒ", (((((i125 ^ (-27336900)) + ((i125 & (-27336900)) << 1)) + ((~((i126 & d8) | (i126 ^ d8))) * 623)) + (((~d8) | (~((~i124) | 43950))) * (-623))) - (~(((~((i124 ^ d8) | (i124 & d8))) | ((i128 & i127) | (i127 ^ i128))) * 623))) - 1, objArr13);
                                        } finally {
                                        }
                                    } else {
                                        int i129 = f3390a + 55;
                                        d = i129 % 128;
                                    }
                                    if (str != null) {
                                        java.lang.Object[] objArr14 = {str, new int[]{i}, new int[]{i ^ 20}, new int[1]};
                                        int uptimeMillis2 = (int) android.os.SystemClock.uptimeMillis();
                                        int i130 = ~uptimeMillis2;
                                        int i131 = ((~(uptimeMillis2 | 183303136)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE) + 661004635 + (((-605159428) | i130) * (-216)) + (((~(i130 | 183303136)) | 641395459) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE);
                                        int d9 = com.facetec.sdk.mt.c.d();
                                        int i132 = -(-(i131 * 399));
                                        int i133 = ((i132 | 6384) << 1) - (i132 ^ 6384);
                                        int i134 = ~(i131 | (-17));
                                        int i135 = ~i131;
                                        int i136 = ~((i135 ^ 16) | (i135 & 16));
                                        int i137 = (i134 ^ i136) | (i134 & i136);
                                        int i138 = ~(i135 | d9);
                                        int i139 = ((i137 ^ i138) | (i137 & i138)) * 398;
                                        int i140 = ((((i133 ^ i139) + ((i139 & i133) << 1)) + (((i131 ^ 16) | (i131 & 16)) * (-1194))) - (~(-(-((((~((i131 ^ (-17)) | (i131 & (-17)))) | (~((~d9) | i135))) | (~(i135 | 16))) * 398))))) - 1;
                                        int i141 = (i2 & i140) + (i2 | i140);
                                        int i142 = i141 << 13;
                                        int i143 = (~(i141 & i142)) & (i141 | i142);
                                        int i144 = i143 >>> 17;
                                        int i145 = (i143 & (~i144)) | ((~i143) & i144);
                                        int i146 = i145 << 5;
                                        ((int[]) objArr14[3])[0] = (~(i145 & i146)) & (i145 | i146);
                                        return objArr14;
                                    }
                                }
                            } finally {
                            }
                        }
                        java.lang.Object[] objArr15 = {null, new int[]{i}, new int[]{i}, new int[1]};
                        int i147 = ~(((int) java.lang.Runtime.getRuntime().freeMemory()) | 549784758);
                        int i148 = (((545588370 | i147) * (-196)) - 436655333) + ((i147 | 4196388) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE);
                        int i149 = ~i148;
                        int i150 = ((-(-(i148 * (-493)))) - (~(-(-(i149 * (-988)))))) - 1;
                        int i151 = (i149 | i148 | i65) * 494;
                        int i152 = (i150 & i151) + (i150 | i151);
                        int i153 = ~(i65 | i148);
                        int i154 = -(-(((i153 ^ i149) | (i153 & i149)) * 494));
                        int i155 = -(-(((i152 | i154) << 1) - (i154 ^ i152)));
                        int i156 = ((i2 | i155) << 1) - (i155 ^ i2);
                        int i157 = (i156 << 13) ^ i156;
                        int i158 = i157 >>> 17;
                        int i159 = (~(i157 & i158)) & (i157 | i158);
                        int i160 = i159 << 5;
                        ((int[]) objArr15[3])[0] = (i159 & (~i160)) | ((~i159) & i160);
                        return objArr15;
                    }
                    fileReader.close();
                    bufferedReader.close();
                } finally {
                }
            }
            str = null;
            int absoluteGravity2 = android.view.Gravity.getAbsoluteGravity(0, 0);
            int d72 = com.facetec.sdk.mt.c.d();
            int i1142 = absoluteGravity2 * 236;
            int i1152 = (8187393 ^ i1142) + ((i1142 & 8187393) << 1);
            int i1162 = ~absoluteGravity2;
            int i1172 = ((~((~d72) | i1162)) | 17383) * (-235);
            int i1182 = ((i1152 | i1172) << 1) - (i1152 ^ i1172);
            int i1192 = ~((i1162 & d72) | (i1162 ^ d72));
            int i1202 = ((i1192 ^ 17383) | (i1192 & 17383)) * (-470);
            int i1212 = ((i1182 | i1202) << 1) - (i1202 ^ i1182);
            int i1222 = i1162 | 17383;
            int i1232 = ((~((absoluteGravity2 ^ (-17384)) | (absoluteGravity2 & (-17384)))) | (~((d72 ^ i1222) | (d72 & i1222)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE;
            java.lang.Object[] objArr102 = new java.lang.Object[1];
            c("ἄ岼颗퓱ე䲇蠲쐃`簛롆\uf5a3ㆍ淾ꧬ\ue5ceⅴ鴚\ud961ᕼ兆躻쪔ڵ䋦뻊屮㘔爃깥\uea5d", (i1212 ^ i1232) + ((i1232 & i1212) << 1), objArr102);
            file = new java.io.File((java.lang.String) objArr102[0]);
            if (!file.canRead()) {
            }
            java.lang.Object[] objArr152 = {null, new int[]{i}, new int[]{i}, new int[1]};
            int i1472 = ~(((int) java.lang.Runtime.getRuntime().freeMemory()) | 549784758);
            int i1482 = (((545588370 | i1472) * (-196)) - 436655333) + ((i1472 | 4196388) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE);
            int i1492 = ~i1482;
            int i1502 = ((-(-(i1482 * (-493)))) - (~(-(-(i1492 * (-988)))))) - 1;
            int i1512 = (i1492 | i1482 | i65) * 494;
            int i1522 = (i1502 & i1512) + (i1502 | i1512);
            int i1532 = ~(i65 | i1482);
            int i1542 = -(-(((i1532 ^ i1492) | (i1532 & i1492)) * 494));
            int i1552 = -(-(((i1522 | i1542) << 1) - (i1542 ^ i1522)));
            int i1562 = ((i2 | i1552) << 1) - (i1552 ^ i2);
            int i1572 = (i1562 << 13) ^ i1562;
            int i1582 = i1572 >>> 17;
            int i1592 = (~(i1572 & i1582)) & (i1572 | i1582);
            int i1602 = i1592 << 5;
            ((int[]) objArr152[3])[0] = (i1592 & (~i1602)) | ((~i1592) & i1602);
            return objArr152;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
