package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class nn implements com.facetec.sdk.mu {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;

    /* renamed from: a, reason: collision with root package name */
    private static long f3686a;
    private static long b;
    private static int c;
    private static char e;
    private static int f;
    private static int g;
    private com.facetec.sdk.ms d;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$c(int i, byte b2, short s) {
        int i2;
        int i3 = 116 - s;
        int i4 = b2 * 2;
        int i5 = (i * 4) + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i6 = i3;
            i2 = 0;
            int i7 = i5;
            int i8 = i7 + 1;
            i3 = i5 + i6;
            i5 = i8;
            bArr2[i2] = (byte) i3;
            if (i2 == i4) {
                return new java.lang.String(bArr2, 0);
            }
            i2++;
            i6 = bArr[i5];
            int i9 = i3;
            i7 = i5;
            i5 = i9;
            int i82 = i7 + 1;
            i3 = i5 + i6;
            i5 = i82;
            bArr2[i2] = (byte) i3;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            if (i2 == i4) {
            }
        }
    }

    static void init$0() {
        $$a = new byte[]{120, com.google.common.base.Ascii.ETB, -59, 3};
        $$b = 92;
    }

    public nn(com.facetec.sdk.ms msVar) {
        this.d = msVar;
    }

    @Override // com.facetec.sdk.mu
    public final com.facetec.sdk.mw e(com.facetec.sdk.mu.e eVar) throws java.io.IOException {
        boolean z;
        int i = f + 21;
        g = i % 128;
        if (i % 2 == 0) {
            com.facetec.sdk.oc ocVar = (com.facetec.sdk.oc) eVar;
            com.facetec.sdk.mx a2 = ocVar.a();
            com.facetec.sdk.nu d = ocVar.d();
            if (a2.a().equals("GET")) {
                f = (g + 59) % 128;
            } else {
                int i2 = g + 51;
                f = i2 % 128;
                if (i2 % 2 != 0) {
                    z = true;
                    return ocVar.c(a2, d, d.a(this.d, eVar, z), d.a());
                }
            }
            z = false;
            return ocVar.c(a2, d, d.a(this.d, eVar, z), d.a());
        }
        com.facetec.sdk.oc ocVar2 = (com.facetec.sdk.oc) eVar;
        com.facetec.sdk.mx a3 = ocVar2.a();
        ocVar2.d();
        a3.a().equals("GET");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0015, code lost:
    
        r0 = r21.toCharArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0013, code lost:
    
        if (r21 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r21 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        r0 = r21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void i(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray;
        int i2 = $11 + 69;
        $10 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 58 / 0;
        }
        com.facetec.sdk.hu huVar = new com.facetec.sdk.hu();
        char[] b2 = com.facetec.sdk.hu.b(b ^ 4732878740741522786L, charArray, i);
        huVar.b = 4;
        while (huVar.b < b2.length) {
            huVar.e = huVar.b - 4;
            int i4 = huVar.b;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(b2[huVar.b] ^ b2[huVar.b % 4]), java.lang.Long.valueOf(huVar.e), java.lang.Long.valueOf(b)};
                java.lang.Object d = com.facetec.sdk.al.d(-474326228);
                if (d == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    d = com.facetec.sdk.al.c((char) (6935 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16)), 2390 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 23 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), 1146429908, false, $$c(b3, b4, (byte) (b4 | 7)), new java.lang.Class[]{java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE});
                }
                b2[i4] = ((java.lang.Character) ((java.lang.reflect.Method) d).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr3 = {huVar, huVar};
                java.lang.Object d2 = com.facetec.sdk.al.d(-57140341);
                if (d2 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    d2 = com.facetec.sdk.al.c((char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), android.text.TextUtils.getOffsetAfter("", 0) + 885, (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 31, 1534550387, false, $$c(b5, b6, (byte) (b6 | 6)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d2).invoke(null, objArr3);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        java.lang.String str2 = new java.lang.String(b2, 4, b2.length - 4);
        $11 = ($10 + 17) % 128;
        objArr[0] = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void h(java.lang.String str, char c2, java.lang.String str2, java.lang.String str3, int i, java.lang.Object[] objArr) {
        char[] cArr;
        char c3;
        int i2 = $10 + 5;
        $11 = i2 % 128;
        if (i2 % 2 == 0) {
            java.lang.Object obj = null;
            obj.hashCode();
            throw null;
        }
        char[] charArray = str3 != null ? str3.toCharArray() : str3;
        if (str2 != 0) {
            $10 = ($11 + 83) % 128;
            cArr = str2.toCharArray();
        } else {
            cArr = str2;
        }
        char[] cArr2 = cArr;
        char[] charArray2 = str != null ? str.toCharArray() : str;
        com.facetec.sdk.hs hsVar = new com.facetec.sdk.hs();
        int length = charArray.length;
        char[] cArr3 = new char[length];
        int length2 = charArray2.length;
        char[] cArr4 = new char[length2];
        int i3 = 0;
        java.lang.System.arraycopy(charArray, 0, cArr3, 0, length);
        java.lang.System.arraycopy(charArray2, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c2);
        cArr4[2] = (char) (cArr4[2] + ((char) i));
        int length3 = cArr2.length;
        char[] cArr5 = new char[length3];
        hsVar.d = 0;
        $11 = ($10 + 29) % 128;
        while (hsVar.d < length3) {
            try {
                java.lang.Object[] objArr2 = {hsVar};
                java.lang.Object d = com.facetec.sdk.al.d(-1265265027);
                if (d == null) {
                    char myPid = (char) (android.os.Process.myPid() >> 22);
                    int resolveSize = android.view.View.resolveSize(i3, i3);
                    int rgb = android.graphics.Color.rgb(i3, i3, i3);
                    byte b2 = (byte) i3;
                    byte b3 = b2;
                    java.lang.String $$c = $$c(b2, b3, (byte) (b3 + 5));
                    java.lang.Class[] clsArr = new java.lang.Class[1];
                    clsArr[i3] = java.lang.Object.class;
                    d = com.facetec.sdk.al.c(myPid, 988 - resolveSize, (-16777192) - rgb, 326823045, false, $$c, clsArr);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) d).invoke(null, objArr2)).intValue();
                java.lang.Object[] objArr3 = {hsVar};
                java.lang.Object d2 = com.facetec.sdk.al.d(1957241543);
                if (d2 == null) {
                    byte b4 = (byte) i3;
                    byte b5 = b4;
                    d2 = com.facetec.sdk.al.c((char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1505, (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 24, -750364609, false, $$c(b4, b5, (byte) (b5 | 8)), new java.lang.Class[]{java.lang.Object.class});
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) d2).invoke(null, objArr3)).intValue();
                java.lang.Object[] objArr4 = {hsVar, java.lang.Integer.valueOf(cArr3[hsVar.d % 4] * 32718), java.lang.Integer.valueOf(cArr4[intValue])};
                java.lang.Object d3 = com.facetec.sdk.al.d(-1182647832);
                if (d3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    d3 = com.facetec.sdk.al.c((char) ((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 26699), 639 - android.graphics.Color.alpha(0), 24 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 510477072, false, $$c(b6, b7, (byte) (b7 + 2)), new java.lang.Class[]{java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                }
                ((java.lang.reflect.Method) d3).invoke(null, objArr4);
                java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(cArr3[intValue2] * 32718), java.lang.Integer.valueOf(cArr4[intValue])};
                java.lang.Object d4 = com.facetec.sdk.al.d(1279455729);
                if (d4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    c3 = 2;
                    d4 = com.facetec.sdk.al.c((char) (408 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), android.text.TextUtils.getTrimmedLength("") + 2198, (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 24, -340948215, false, $$c(b8, b9, b9), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                } else {
                    c3 = 2;
                }
                cArr4[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) d4).invoke(null, objArr5)).charValue();
                cArr3[intValue2] = hsVar.b;
                cArr5[hsVar.d] = (char) ((((cArr3[intValue2] ^ cArr2[hsVar.d]) ^ (f3686a ^ 9010024738234916139L)) ^ ((int) (c ^ 9010024738234916139L))) ^ ((char) (e ^ 9010024738234916139L)));
                hsVar.d++;
                i3 = 0;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        g = 0;
        f = 1;
        f3686a = 9010024738234916139L;
        c = 603544875;
        e = (char) 33778;
        b = -8630839581137157007L;
    }

    public static java.lang.Object[] c(android.content.Context context, int i, int i2) {
        int i3;
        int i4 = 1;
        if (context == null) {
            java.lang.Object[] objArr = {null, new int[]{i}, new int[]{i}, new int[1]};
            int elapsedCpuTime = (int) android.os.Process.getElapsedCpuTime();
            int i5 = (((~((~elapsedCpuTime) | 791142111)) * (-116)) - 351057913) + ((50400260 | elapsedCpuTime) * 116) + (((~(elapsedCpuTime | (-774298336))) | 33556484) * 116);
            int i6 = (i2 & i5) + (i2 | i5);
            int i7 = i6 << 13;
            int i8 = (~(i6 & i7)) & (i6 | i7);
            int i9 = i8 ^ (i8 >>> 17);
            int i10 = i9 << 5;
            ((int[]) objArr[3])[0] = (i9 & (~i10)) | ((~i9) & i10);
            return objArr;
        }
        try {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            h("\u0000\u0000\u0000\u0000", (char) (android.view.ViewConfiguration.getTouchSlop() >> 8), "澅䅜絯㱔\uef56灏놯\uf6c8瘮\uffc9婯䀞솉皉뼟\ue274閆ﾰ䳇盄\ue999൴푢䕖뜛伯ዺ哥ﱩ惱䧥撬긥ᄼ밹妐\ue2e1琗", "綶丟㥯瘒", android.text.TextUtils.indexOf("", "", 0), objArr2);
            java.lang.Object[] objArr3 = (java.lang.Object[]) java.lang.reflect.Array.newInstance(java.lang.Class.forName((java.lang.String) objArr2[0]), 2);
            int i11 = -android.text.TextUtils.indexOf("", "");
            int b2 = com.facetec.sdk.fm.AnonymousClass3.b();
            int i12 = (i11 * (-743)) - 9367001;
            int i13 = (i11 ^ 12607) | (i11 & 12607);
            int i14 = (~((i11 ^ b2) | (i11 & b2))) | (~i13);
            int i15 = ~((b2 & 12607) | (b2 ^ 12607));
            int i16 = -(-(((i14 ^ i15) | (i15 & i14)) * (-744)));
            int i17 = ~i11;
            char c2 = (char) ((((i12 | i16) << 1) - (i12 ^ i16)) + (((~((i17 ^ (-12608)) | (i17 & (-12608)))) | (~b2)) * 744) + (((i13 ^ b2) | (b2 & i13)) * 744));
            int size = android.view.View.MeasureSpec.getSize(0);
            int i18 = size * 624;
            int i19 = ((1387326696 | i18) << 1) - (i18 ^ 1387326696);
            int i20 = (672024363 ^ size) | (672024363 & size);
            int i21 = -(-((~((i20 ^ i) | (i20 & i))) * 623));
            int i22 = (i19 ^ i21) + ((i19 & i21) << 1);
            int i23 = ~i;
            int i24 = -(-(((~((~size) | (-672024364))) | i23) * (-623)));
            int i25 = (~i20) | (~(672024363 | i));
            int i26 = ~(size | i);
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            h("\u0000\u0000\u0000\u0000", c2, "ᡕ咭䑆夘묺ꉭ켃\uf4ea￦ᘎ펇䠵ᣝꩿ鰵\uf46a槌\udcfeⲠ\ued0e䃳嶙\ud903\u0018悁સ\uec5d掩⻮䷢諒", "퓤\uf1b8㿗輱", (i22 ^ i24) + ((i24 & i22) << 1) + (((i26 ^ i25) | (i26 & i25)) * 623), objArr4);
            try {
                java.lang.Object[] objArr5 = {(java.lang.String) objArr4[0]};
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                h("\u0000\u0000\u0000\u0000", (char) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), "澅䅜絯㱔\uef56灏놯\uf6c8瘮\uffc9婯䀞솉皉뼟\ue274閆ﾰ䳇盄\ue999൴푢䕖뜛伯ዺ哥ﱩ惱䧥撬긥ᄼ밹妐\ue2e1琗", "綶丟㥯瘒", android.text.TextUtils.indexOf("", "", 0), objArr6);
                objArr3[0] = java.lang.Class.forName((java.lang.String) objArr6[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr5);
                int resolveSize = android.view.View.resolveSize(0, 0);
                int b3 = com.facetec.sdk.fm.AnonymousClass3.b();
                int i27 = resolveSize * (-183);
                int i28 = (10017750 ^ i27) + ((i27 & 10017750) << 1);
                int i29 = ~resolveSize;
                int i30 = -(-(((i29 & 54150) | (i29 ^ 54150)) * (-368)));
                int i31 = (resolveSize ^ (-54151)) | (resolveSize & (-54151));
                int i32 = ~b3;
                int i33 = (i28 ^ i30) + ((i30 & i28) << 1) + (((i31 ^ i32) | (i32 & i31)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE);
                int i34 = ~((i29 & (-54151)) | (i29 ^ (-54151)));
                int i35 = ~((i32 ^ resolveSize) | (i32 & resolveSize));
                int i36 = (i34 ^ i35) | (i35 & i34);
                int i37 = ~((resolveSize ^ 54150) | (resolveSize & 54150));
                int i38 = ((i36 ^ i37) | (i37 & i36)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE;
                int offsetAfter = android.text.TextUtils.getOffsetAfter("", 0);
                int i39 = ~offsetAfter;
                int i40 = (offsetAfter * (-751)) + 484050545 + (((~((i39 ^ i) | (i39 & i))) | (~((i39 ^ 177933470) | (i39 & 177933470)))) * 1504);
                int i41 = (i39 & (-177933471)) | ((-177933471) ^ i39);
                int i42 = -(-((~(i41 | i)) * (-1504)));
                int i43 = ~i41;
                int i44 = ~((offsetAfter ^ 177933470) | (offsetAfter & 177933470));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                h("\u0000\u0000\u0000\u0000", (char) ((i33 & i38) + (i38 | i33)), "ˀ빗ṙ䡞칄稻\ud8c8碐ⴎ\u086c\ue921밖韠拎蟉〩鹋㶊棒罁ꎇ㹅ﻭ廙ఖꈟ\u2efa\u0d51㔻뎿ᵠ", "慥擳蛵쯓", (((i40 ^ i42) + ((i42 & i40) << 1)) - (~(((i44 ^ i43) | (i44 & i43)) * 752))) - 1, objArr7);
                try {
                    java.lang.Object[] objArr8 = {(java.lang.String) objArr7[0]};
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    h("\u0000\u0000\u0000\u0000", (char) android.text.TextUtils.getCapsMode("", 0, 0), "澅䅜絯㱔\uef56灏놯\uf6c8瘮\uffc9婯䀞솉皉뼟\ue274閆ﾰ䳇盄\ue999൴푢䕖뜛伯ዺ哥ﱩ惱䧥撬긥ᄼ밹妐\ue2e1琗", "綶丟㥯瘒", android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16, objArr9);
                    objArr3[1] = java.lang.Class.forName((java.lang.String) objArr9[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr8);
                    try {
                        int i45 = -(android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int i46 = i45 * 628;
                        int i47 = (i46 ^ 628) + ((i46 & 628) << 1);
                        int i48 = i ^ 1;
                        int i49 = (i & 1) | i48;
                        int i50 = ~i45;
                        int i51 = ((i49 ^ i50) | (i49 & i50)) * (-627);
                        int i52 = (i47 ^ i51) + ((i47 & i51) << 1);
                        int i53 = ~((i ^ (-2)) | (i & (-2)));
                        int i54 = ((i53 ^ i45) | (i53 & i45)) * (-627);
                        int i55 = (i52 & i54) + (i54 | i52);
                        int i56 = ~((i23 ^ 1) | (i23 & 1));
                        int i57 = ~(i45 | i);
                        int i58 = ((i57 ^ i56) | (i57 & i56)) * 627;
                        java.lang.Object[] objArr10 = new java.lang.Object[1];
                        i("\uf03f뵬\uf05e簑湬\uec2e\ude22\uf41c鵩硚\ue87a\udac2\uf8c4璨\ue4bc훌ﲾ烵\ue112쵚\ue14c潀ﵔ쥴\ue526殛了", (i55 ^ i58) + ((i58 & i55) << 1), objArr10);
                        java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr10[0]);
                        int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                        int b4 = com.facetec.sdk.fm.AnonymousClass3.b();
                        int i59 = (lastIndexOf * 371) + 17472616;
                        int i60 = ~b4;
                        int i61 = ~((i60 ^ (-47097)) | (i60 & (-47097)));
                        int i62 = ~lastIndexOf;
                        int i63 = ~((i62 ^ b4) | (i62 & b4));
                        int i64 = ((i61 ^ i63) | (i63 & i61)) * (-370);
                        int i65 = (i59 & i64) + (i64 | i59);
                        int i66 = ~((i62 & i60) | (i62 ^ i60));
                        int i67 = ~((b4 & (-47097)) | (b4 ^ (-47097)));
                        int i68 = (i66 ^ i67) | (i66 & i67);
                        int i69 = ~((47096 & lastIndexOf) | (lastIndexOf ^ 47096));
                        int i70 = -(-(((i68 ^ i69) | (i68 & i69)) * (-370)));
                        int i71 = ((i65 | i70) << 1) - (i70 ^ i65);
                        int i72 = -(-(i69 * com.knotapi.knot.utilities.Constants.ID_KROGER));
                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                        h("\u0000\u0000\u0000\u0000", (char) (((i71 | i72) << 1) - (i72 ^ i71)), "꠲뙈䛾忘\uee38馿涐㗺\udbb4ꮼ碗腆୫뙷琇☑땺", "륫\udb49\uf7e5龷", (-438613575) - (~(-(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))), objArr11);
                        java.lang.Object invoke = cls.getMethod((java.lang.String) objArr11[0], null).invoke(context, null);
                        try {
                            int i73 = -(android.view.ViewConfiguration.getTouchSlop() >> 8);
                            int i74 = i73 * 860;
                            int i75 = ((i74 | (-858)) << 1) - (i74 ^ (-858));
                            int i76 = -(-(((i73 ^ i) | (i73 & i)) * (-859)));
                            int i77 = (i75 ^ i76) + ((i76 & i75) << 1);
                            int i78 = ~((i23 ^ i73) | (i23 & i73));
                            int i79 = ~i73;
                            int i80 = ~((i79 ^ (-2)) | (i79 & (-2)) | i);
                            int i81 = -(-(((i78 ^ i80) | (i78 & i80)) * 859));
                            int i82 = (i77 & i81) + (i81 | i77);
                            int i83 = -(-(((~((i73 ^ (-2)) | (i73 & (-2)))) | (~((i23 ^ (-2)) | (i23 & (-2))))) * 859));
                            java.lang.Object[] objArr12 = new java.lang.Object[1];
                            i("\uf03f뵬\uf05e簑湬\uec2e\ude22\uf41c鵩硚\ue87a\udac2\uf8c4璨\ue4bc훌ﲾ烵\ue112쵚\ue14c潀ﵔ쥴\ue526殛了", ((i82 | i83) << 1) - (i83 ^ i82), objArr12);
                            java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr12[0]);
                            int resolveSizeAndState = android.view.View.resolveSizeAndState(0, 0, 0);
                            int i84 = ~resolveSizeAndState;
                            int i85 = (resolveSizeAndState * (-381)) + 3607680 + (i84 * (-191));
                            int i86 = ~((i ^ 18790) | (i & 18790));
                            int i87 = -(-(((resolveSizeAndState ^ i86) | (i86 & resolveSizeAndState)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE));
                            int i88 = ~((i84 ^ 18790) | (i84 & 18790));
                            int i89 = ~((i23 ^ 18790) | (i23 & 18790));
                            java.lang.Object[] objArr13 = new java.lang.Object[1];
                            h("\u0000\u0000\u0000\u0000", (char) ((((i85 | i87) << 1) - (i85 ^ i87)) + (((i88 & i89) | (i88 ^ i89)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE)), "ᛂ庙잩曛㔇卶䕉⡘⹉ሷ哜\ueb56낌\ue40e", "\ufaed磊昧杉", android.view.KeyEvent.getDeadChar(0, 0), objArr13);
                            try {
                                java.lang.Object[] objArr14 = {cls2.getMethod((java.lang.String) objArr13[0], null).invoke(context, null), 64};
                                java.lang.Object[] objArr15 = new java.lang.Object[1];
                                i("꜃\uef51Ꝣ⸬ᮝ駟ィꌠ珨⩧鶋㑃꿸⚕配㡍ꮂ⋈铣⏛뙃㵿裥⟑눞㦽豔⬼뺬㗯耾⺈륹〗므ዀ蔑", (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr15);
                                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr15[0]);
                                int gidForName = android.os.Process.getGidForName("");
                                java.lang.Object[] objArr16 = new java.lang.Object[1];
                                h("\u0000\u0000\u0000\u0000", (char) ((36085 & gidForName) + (gidForName | 36085)), "튟\uf02e嵷둍\ua62f姷곷긱啱絺\ude69滝叺䬐", "\ue0a8蚄\uf415抌", android.text.TextUtils.indexOf("", "", 0, 0), objArr16);
                                java.lang.Object invoke2 = cls3.getMethod((java.lang.String) objArr16[0], java.lang.String.class, java.lang.Integer.TYPE).invoke(invoke, objArr14);
                                int i90 = -(android.view.ViewConfiguration.getJumpTapTimeout() >> 16);
                                int i91 = i90 * 615;
                                int i92 = ~i90;
                                int i93 = ~((i92 ^ 9702) | (i92 & 9702));
                                int i94 = (i93 & i) | (i ^ i93);
                                int i95 = ~((i90 & (-9703)) | (i90 ^ (-9703)));
                                int i96 = ~((i92 ^ i23) | (i92 & i23));
                                int i97 = (i93 ^ i96) | (i96 & i93);
                                int i98 = ~((i23 ^ 9702) | (i23 & 9702));
                                int i99 = (i92 ^ (-9703)) | (i92 & (-9703));
                                int i100 = ~((i99 ^ i23) | (i99 & i23));
                                int i101 = i90 | i23;
                                int i102 = ~((i101 ^ 9702) | (i101 & 9702));
                                char c3 = (char) (((-5947326) ^ i91) + ((i91 & (-5947326)) << 1) + (((i94 & i95) | (i94 ^ i95)) * 614) + (((i97 & i98) | (i97 ^ i98)) * (-1228)) + (((i102 ^ i100) | (i102 & i100)) * 614));
                                java.lang.Object[] objArr17 = new java.lang.Object[1];
                                h("\u0000\u0000\u0000\u0000", c3, "칶\uf7dc쐙ḵ\u2e68㼘େ\ua4c7悻웶\u0eff\uf3d3刧왰麘椐ኟ蕒⏸緼䡽⧡찐ঙ⏬湒볢퍶\ueb80꯬", "礦î\ue689꼥", (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr17);
                                java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr17[0]);
                                int i103 = (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                java.lang.Object[] objArr18 = new java.lang.Object[1];
                                i("邂荒郱䈨\uf1a6珧ꔞ钯\ue649䙹瞡ꆾ顿䪊", ((i103 | 1) << 1) - (i103 ^ 1), objArr18);
                                java.lang.Object[] objArr19 = (java.lang.Object[]) cls4.getField((java.lang.String) objArr18[0]).get(invoke2);
                                int length = objArr19.length;
                                int i104 = 0;
                                while (i104 < length) {
                                    java.lang.Object obj = objArr19[i104];
                                    int i105 = -android.view.View.resolveSizeAndState(0, 0, 0);
                                    java.lang.Object[] objArr20 = new java.lang.Object[i4];
                                    i("뻑攳뺉ꐎ賏ໜ쭯몤衦", (i105 & 1) + (i105 | i4), objArr20);
                                    try {
                                        java.lang.Object[] objArr21 = {(java.lang.String) objArr20[0]};
                                        char indexOf = (char) android.text.TextUtils.indexOf("", "", 0);
                                        int i106 = -android.os.Process.getGidForName("");
                                        java.lang.Object[] objArr22 = new java.lang.Object[i4];
                                        h("\u0000\u0000\u0000\u0000", indexOf, "읖傔嫫ፎ瀀꜇굽㎙腤ꯙ㳼樦ṡ댄༤甿䤺ڨ则䝥컃픠懲䭺俁뫑톭⻍뽞̑\uedd0䡀쑔ᮻ\ue32c㨸\uf1d7", "醫鿄奍\ue5bb", (i106 & 1302316176) + (i106 | 1302316176), objArr22);
                                        java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr22[0]);
                                        char fadingEdgeLength = (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16);
                                        int i107 = -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                        int i108 = ~((~i107) | (-1845396247));
                                        int i109 = (i107 ^ 1845396246) | (i107 & 1845396246);
                                        int i110 = ~((i109 ^ i) | (i109 & i));
                                        int i111 = (i107 * 477) + 389888941 + (((i108 ^ i110) | (i110 & i108)) * (-476));
                                        int i112 = -(-((~(i109 | i)) * 952));
                                        int i113 = (i111 & i112) + (i111 | i112);
                                        int i114 = (i23 ^ 1845396246) | (i23 & 1845396246);
                                        int i115 = (~((i114 ^ i107) | (i114 & i107))) * 476;
                                        java.lang.Object[] objArr23 = new java.lang.Object[1];
                                        h("\u0000\u0000\u0000\u0000", fadingEdgeLength, "킒싊㳑鶩桫\ue547倏쯝햇ᡡꑣ", "\ueaf6ż澒찮", (i113 & i115) + (i115 | i113), objArr23);
                                        java.lang.Object invoke3 = cls5.getMethod((java.lang.String) objArr23[0], java.lang.String.class).invoke(null, objArr21);
                                        try {
                                            int i116 = (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                            int b5 = com.facetec.sdk.fm.AnonymousClass3.b();
                                            int i117 = i116 * (-495);
                                            int i118 = (((-6838425) | i117) << 1) - (i117 ^ (-6838425));
                                            int i119 = ~i116;
                                            java.lang.Object[] objArr24 = objArr19;
                                            int i120 = ~((i119 ^ (-13816)) | (i119 & (-13816)));
                                            int i121 = ~((i119 ^ b5) | (i119 & b5));
                                            int i122 = ((i120 ^ i121) | (i121 & i120)) * 992;
                                            int i123 = i120 | (~(i119 | b5));
                                            int i124 = ~b5;
                                            int i125 = (i116 & i124) | (i116 ^ i124);
                                            int i126 = ~((i125 ^ 13815) | (i125 & 13815));
                                            int i127 = (i118 & i122) + (i118 | i122) + (((i123 ^ i126) | (i123 & i126)) * (-496));
                                            int i128 = (b5 | 13815) * 496;
                                            java.lang.Object[] objArr25 = new java.lang.Object[1];
                                            h("\u0000\u0000\u0000\u0000", (char) ((i127 ^ i128) + ((i128 & i127) << 1)), "끅ک馘캸沮⬃ຈ浉\udb00䠷柽鋗愑\uf05e忐ኟ䪾\u0b58俐삜홱晶䜲즜誘த㱮嫩", "鶔మ\uf880昵", android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr25);
                                            java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr25[0]);
                                            java.lang.Object[] objArr26 = new java.lang.Object[1];
                                            h("\u0000\u0000\u0000\u0000", (char) android.view.Gravity.getAbsoluteGravity(0, 0), "⻒虝Ṻ쿕ꧧ狖鋙野沽≔ꕜ", "ᱺ⑲冹쩈", (-1188793829) - (~android.text.TextUtils.getOffsetAfter("", 0)), objArr26);
                                            try {
                                                java.lang.Object[] objArr27 = {new java.io.ByteArrayInputStream((byte[]) cls6.getMethod((java.lang.String) objArr26[0], null).invoke(obj, null))};
                                                char myPid = (char) (android.os.Process.myPid() >> 22);
                                                int i129 = -(-(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                                                java.lang.Object[] objArr28 = new java.lang.Object[1];
                                                h("\u0000\u0000\u0000\u0000", myPid, "읖傔嫫ፎ瀀꜇굽㎙腤ꯙ㳼樦ṡ댄༤甿䤺ڨ则䝥컃픠懲䭺俁뫑톭⻍뽞̑\uedd0䡀쑔ᮻ\ue32c㨸\uf1d7", "醫鿄奍\ue5bb", (i129 ^ 1302316176) + ((i129 & 1302316176) << 1), objArr28);
                                                java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr28[0]);
                                                int i130 = -android.text.TextUtils.indexOf("", "", 0, 0);
                                                java.lang.Object[] objArr29 = new java.lang.Object[1];
                                                i("갴ꭑ걓樧改\ue771☤ꠊ數湯\ue33f⊘ꓯ抟\ueff5⻝ꂹ曀\uea5a㔆뵥祦\uf60a", (i130 & 1) + (i130 | 1), objArr29);
                                                java.lang.Object invoke4 = cls7.getMethod((java.lang.String) objArr29[0], java.io.InputStream.class).invoke(invoke3, objArr27);
                                                int length2 = objArr3.length;
                                                int i131 = 0;
                                                int i132 = 2;
                                                while (i131 < i132) {
                                                    java.lang.Object obj2 = objArr3[i131];
                                                    try {
                                                        int i133 = -(android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                                        int b6 = com.facetec.sdk.fm.AnonymousClass3.b();
                                                        int i134 = i133 * 881;
                                                        int i135 = ~i133;
                                                        int i136 = (~(i135 | b6)) | (~(i135 | (-2)));
                                                        int i137 = ~(b6 | (-2));
                                                        int i138 = length;
                                                        int i139 = ((((i134 | 881) << 1) - (i134 ^ 881)) - (~(-(-(((i136 ^ i137) | (i136 & i137)) * (-880)))))) - 1;
                                                        int i140 = ~b6;
                                                        int i141 = ~((i140 ^ i135) | (i140 & i135));
                                                        int i142 = ~((i133 ^ b6) | (i133 & b6));
                                                        int i143 = -(-(((i141 & 1) | (i141 ^ 1) | i142) * (-880)));
                                                        java.lang.Object[] objArr30 = new java.lang.Object[1];
                                                        i("ᩬ菟ᨆ䊭录\udd05\uf81fḎ뭇䛳\ud942ﲡኁ䨆햂\uf0e2ᛱ丆퀼\ueb3fମ凨찭\uef76༥啠죎\ue3b1ρ奶쓏\ue62fО岑，\uda6b㡸惉", (((i139 | i143) << 1) - (i139 ^ i143)) + (i142 * 880), objArr30);
                                                        java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr30[0]);
                                                        java.lang.Object[] objArr31 = new java.lang.Object[1];
                                                        i("⛵髹⚒宏\u1afe颬භ⋌仝忄鳦ऽ⸎匦逘Թ⨡圾閤Ẳ㞬䣔觋\u1add㏹䰗贰", -android.view.MotionEvent.axisFromString(""), objArr31);
                                                        if (obj2.equals(cls8.getMethod((java.lang.String) objArr31[0], null).invoke(invoke4, null))) {
                                                            java.lang.Object[] objArr32 = {null, new int[]{i}, new int[]{i48}, new int[]{(~(r2 & r3)) & r4}};
                                                            int i144 = (((578929298 | i) * 988) - 45532177) + (((~(598330010 | i23)) | 206967873) * (-1976)) + (((~((-226368586) | i)) | 578929298 | (~(226368585 | i23))) * 988);
                                                            int i145 = (i144 ^ 16) + ((i144 & 16) << 1);
                                                            int i146 = ~((i145 ^ i) | (i145 & i));
                                                            int i147 = ((((i145 * (-55)) - (~(-(-(i2 * (-55)))))) - 1) - (~(-(-(((i2 ^ i146) | (i2 & i146)) * 56))))) - 1;
                                                            int i148 = (~((i145 ^ i2) | (i145 & i2))) * (-56);
                                                            int i149 = (i147 & i148) + (i148 | i147) + (((~(i23 | i2)) | i145) * 56);
                                                            int i150 = i149 << 13;
                                                            int i151 = ((~i150) & i149) | ((~i149) & i150);
                                                            int i152 = i151 >>> 17;
                                                            int i153 = (i151 & (~i152)) | ((~i151) & i152);
                                                            int i154 = i153 << 5;
                                                            int i155 = i153 | i154;
                                                            return objArr32;
                                                        }
                                                        i132 = 2;
                                                        int i156 = i131 + 69;
                                                        i131 = (i156 & (-68)) + (i156 | (-68));
                                                        length = i138;
                                                    } catch (java.lang.Throwable th) {
                                                        java.lang.Throwable cause = th.getCause();
                                                        if (cause != null) {
                                                            throw cause;
                                                        }
                                                        throw th;
                                                    }
                                                }
                                                i104++;
                                                objArr19 = objArr24;
                                                i4 = 1;
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
                                i3 = i4;
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
            i3 = 1;
        }
        int[] iArr = new int[i3];
        int[] iArr2 = new int[i3];
        iArr[0] = i;
        iArr2[0] = i;
        java.lang.Object[] objArr33 = {null, iArr, iArr2, new int[i3]};
        int nextInt = new java.util.Random().nextInt(1836951956);
        int i157 = (((~((-267066204) | nextInt)) | 785895635) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) + 544025807 + (((~((~nextInt) | (-267066204))) | 785895635) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE);
        int i158 = (i2 ^ i157) + ((i2 & i157) << 1);
        int i159 = i158 << 13;
        int i160 = (i158 & (~i159)) | ((~i158) & i159);
        int i161 = i160 >>> 17;
        int i162 = (~(i160 & i161)) & (i160 | i161);
        int i163 = i162 << 5;
        ((int[]) objArr33[3])[0] = (~(i162 & i163)) & (i162 | i163);
        return objArr33;
    }
}
