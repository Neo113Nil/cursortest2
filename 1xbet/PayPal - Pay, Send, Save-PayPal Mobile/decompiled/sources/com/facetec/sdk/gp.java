package com.facetec.sdk;

/* loaded from: classes8.dex */
final class gp extends com.facetec.sdk.fd<java.sql.Timestamp> {

    /* renamed from: a, reason: collision with root package name */
    static final com.facetec.sdk.fb f3611a = new com.facetec.sdk.fb() { // from class: com.facetec.sdk.gp.5
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;

        /* renamed from: a, reason: collision with root package name */
        private static char f3612a;
        private static char b;
        private static char c;
        private static char[] d;
        private static char e;
        private static int i;
        private static int j;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x0028). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static java.lang.String $$c(int i2, byte b2, int i3) {
            int i4;
            int i5;
            byte[] bArr = $$a;
            int i6 = (i3 * 3) + 1;
            int i7 = 112 - i2;
            int i8 = b2 + 4;
            byte[] bArr2 = new byte[i6];
            if (bArr == null) {
                int i9 = i8;
                i7 = i6;
                i5 = 0;
                i7 += i8;
                i8 = i9;
                i4 = i5;
                int i10 = i8 + 1;
                i5 = i4 + 1;
                bArr2[i4] = (byte) i7;
                if (i5 == i6) {
                    return new java.lang.String(bArr2, 0);
                }
                i9 = i10;
                i8 = bArr[i10];
                i7 += i8;
                i8 = i9;
                i4 = i5;
                int i102 = i8 + 1;
                i5 = i4 + 1;
                bArr2[i4] = (byte) i7;
                if (i5 == i6) {
                }
            } else {
                i4 = 0;
                int i1022 = i8 + 1;
                i5 = i4 + 1;
                bArr2[i4] = (byte) i7;
                if (i5 == i6) {
                }
            }
        }

        static void init$0() {
            $$a = new byte[]{com.google.common.base.Ascii.EM, 104, com.google.common.base.Ascii.SI, -25};
            $$b = 29;
        }

        @Override // com.facetec.sdk.fb
        public final <T> com.facetec.sdk.fd<T> d(com.facetec.sdk.eo eoVar, com.facetec.sdk.gw<T> gwVar) {
            j = (i + 93) % 128;
            if (gwVar.a() != java.sql.Timestamp.class) {
                return null;
            }
            com.facetec.sdk.gp gpVar = new com.facetec.sdk.gp(eoVar.e(java.util.Date.class), (byte) 0);
            int i2 = i + 49;
            j = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 32 / 0;
            }
            return gpVar;
        }

        private static void f(java.lang.String str, int i2, java.lang.Object[] objArr) {
            char[] cArr;
            int i3;
            if (str != null) {
                int i4 = $11 + 81;
                $10 = i4 % 128;
                if (i4 % 2 != 0) {
                    str.toCharArray();
                    throw null;
                }
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
                int i5 = $11 + 1;
                $10 = i5 % 128;
                int i6 = 58224;
                if (i5 % 2 != 0) {
                    cArr4[0] = cArr2[hoVar.b];
                    cArr4[1] = cArr2[hoVar.b];
                    i3 = 1;
                } else {
                    cArr4[0] = cArr2[hoVar.b];
                    cArr4[1] = cArr2[hoVar.b + 1];
                    i3 = 0;
                }
                while (i3 < 16) {
                    char c2 = cArr4[1];
                    char c3 = cArr4[0];
                    try {
                        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c2), java.lang.Integer.valueOf(((c3 << 4) + ((char) (c ^ 2174069992062419062L))) ^ r15), java.lang.Integer.valueOf(c3 >>> 5), java.lang.Integer.valueOf(b)};
                        int i7 = c3 + i6;
                        java.lang.Object d2 = com.facetec.sdk.al.d(1497828241);
                        if (d2 == null) {
                            d2 = com.facetec.sdk.al.c((char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), 211 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 23, -22515351, false, lib.android.paypal.com.magnessdk.g.n2, new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                        }
                        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).charValue();
                        cArr4[1] = charValue;
                        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(cArr4[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (f3612a ^ 2174069992062419062L))) ^ r14), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(e)};
                        int i8 = charValue + i6;
                        java.lang.Object d3 = com.facetec.sdk.al.d(1497828241);
                        if (d3 == null) {
                            d3 = com.facetec.sdk.al.c((char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), 211 - android.text.TextUtils.indexOf("", "", 0), 23 - android.text.TextUtils.indexOf("", "", 0, 0), -22515351, false, lib.android.paypal.com.magnessdk.g.n2, new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                        }
                        cArr4[0] = ((java.lang.Character) ((java.lang.reflect.Method) d3).invoke(null, objArr3)).charValue();
                        i6 -= 40503;
                        i3++;
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
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 - 1);
                    d4 = com.facetec.sdk.al.c((char) (31541 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1913, android.graphics.Color.rgb(0, 0, 0) + 16777239, 635836640, false, $$c(b2, b3, (byte) (b3 + 1)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d4).invoke(null, objArr4);
            }
            java.lang.String str2 = new java.lang.String(cArr3, 0, i2);
            int i9 = $10 + 75;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                throw null;
            }
            objArr[0] = str2;
        }

        private static void g(java.lang.String str, int[] iArr, boolean z, java.lang.Object[] objArr) {
            int i2;
            char[] cArr;
            char[] cArr2;
            char c2;
            byte[] bArr;
            char[] cArr3;
            java.lang.String str2 = str;
            int i3 = $10;
            $11 = (i3 + 97) % 128;
            byte[] bArr2 = str2;
            if (str2 != null) {
                $11 = (i3 + 85) % 128;
                byte[] bytes = str2.getBytes("ISO-8859-1");
                $10 = ($11 + 3) % 128;
                bArr2 = bytes;
            }
            byte[] bArr3 = bArr2;
            com.facetec.sdk.hj hjVar = new com.facetec.sdk.hj();
            int i4 = 0;
            int i5 = iArr[0];
            byte b2 = 1;
            int i6 = iArr[1];
            int i7 = iArr[2];
            int i8 = iArr[3];
            char[] cArr4 = d;
            if (cArr4 != null) {
                int length = cArr4.length;
                char[] cArr5 = new char[length];
                int i9 = 0;
                while (i9 < length) {
                    try {
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        objArr2[i4] = java.lang.Integer.valueOf(cArr4[i9]);
                        java.lang.Object d2 = com.facetec.sdk.al.d(-1287922392);
                        if (d2 == null) {
                            cArr3 = cArr4;
                            d2 = com.facetec.sdk.al.c((char) (android.graphics.Color.rgb(i4, i4, i4) + 16777216), 2460 - android.text.TextUtils.getOffsetBefore("", i4), 23 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), 349480912, false, "c", new java.lang.Class[]{java.lang.Integer.TYPE});
                        } else {
                            cArr3 = cArr4;
                        }
                        cArr5[i9] = ((java.lang.Character) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).charValue();
                        i9++;
                        cArr4 = cArr3;
                        i4 = 0;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr4 = cArr5;
            }
            char[] cArr6 = new char[i6];
            java.lang.System.arraycopy(cArr4, i5, cArr6, 0, i6);
            if (bArr3 != null) {
                int i10 = $10 + 25;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    cArr2 = new char[i6];
                    hjVar.c = 1;
                    c2 = 1;
                } else {
                    cArr2 = new char[i6];
                    hjVar.c = 0;
                    c2 = 0;
                }
                while (hjVar.c < i6) {
                    if (bArr3[hjVar.c] == b2) {
                        $10 = ($11 + 29) % 128;
                        int i11 = hjVar.c;
                        char c3 = cArr6[hjVar.c];
                        java.lang.Object[] objArr3 = new java.lang.Object[2];
                        objArr3[b2] = java.lang.Integer.valueOf(c2);
                        objArr3[0] = java.lang.Integer.valueOf(c3);
                        java.lang.Object d3 = com.facetec.sdk.al.d(966199657);
                        if (d3 == null) {
                            char green = (char) android.graphics.Color.green(0);
                            int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                            int indexOf = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                            byte b3 = (byte) ($$b >>> b2);
                            byte b4 = (byte) (-1);
                            d3 = com.facetec.sdk.al.c(green, 2053 - lastIndexOf, 23 - indexOf, -1636273263, false, $$c(b3, b4, (byte) (b4 + 1)), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                        }
                        cArr2[i11] = ((java.lang.Character) ((java.lang.reflect.Method) d3).invoke(null, objArr3)).charValue();
                    } else {
                        int i12 = hjVar.c;
                        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr6[hjVar.c]), java.lang.Integer.valueOf(c2)};
                        java.lang.Object d4 = com.facetec.sdk.al.d(-1755423365);
                        if (d4 == null) {
                            byte b5 = (byte) (-1);
                            d4 = com.facetec.sdk.al.c((char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), android.view.View.MeasureSpec.getMode(0) + 964, 24 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), 816916355, false, $$c((byte) ($$b & 42), b5, (byte) (b5 + 1)), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                        }
                        cArr2[i12] = ((java.lang.Character) ((java.lang.reflect.Method) d4).invoke(null, objArr4)).charValue();
                    }
                    c2 = cArr2[hjVar.c];
                    java.lang.Object[] objArr5 = {hjVar, hjVar};
                    java.lang.Object d5 = com.facetec.sdk.al.d(-1890346561);
                    if (d5 == null) {
                        byte b6 = (byte) (-1);
                        bArr = bArr3;
                        d5 = com.facetec.sdk.al.c((char) (58395 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1762, 24 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 683467591, false, $$c((byte) ($$b & 43), b6, (byte) (b6 + 1)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                    } else {
                        bArr = bArr3;
                    }
                    ((java.lang.reflect.Method) d5).invoke(null, objArr5);
                    bArr3 = bArr;
                    b2 = 1;
                }
                cArr6 = cArr2;
            }
            if (i8 > 0) {
                $10 = ($11 + 65) % 128;
                char[] cArr7 = new char[i6];
                java.lang.System.arraycopy(cArr6, 0, cArr7, 0, i6);
                int i13 = i6 - i8;
                java.lang.System.arraycopy(cArr7, 0, cArr6, i13, i8);
                java.lang.System.arraycopy(cArr7, i8, cArr6, 0, i13);
            }
            if (z) {
                int i14 = $11 + 109;
                $10 = i14 % 128;
                if (i14 % 2 != 0) {
                    cArr = new char[i6];
                    i2 = 1;
                    hjVar.c = 1;
                } else {
                    i2 = 1;
                    cArr = new char[i6];
                    hjVar.c = 0;
                }
                while (hjVar.c < i6) {
                    cArr[hjVar.c] = cArr6[(i6 - hjVar.c) - i2];
                    hjVar.c += i2;
                    i2 = 1;
                }
                cArr6 = cArr;
            }
            if (i7 > 0) {
                int i15 = 0;
                while (true) {
                    hjVar.c = i15;
                    if (hjVar.c >= i6) {
                        break;
                    }
                    $11 = ($10 + 9) % 128;
                    cArr6[hjVar.c] = (char) (cArr6[hjVar.c] - iArr[2]);
                    i15 = hjVar.c + 1;
                }
            }
            objArr[0] = new java.lang.String(cArr6);
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            i = 0;
            j = 1;
            f3612a = (char) 63786;
            e = (char) 62188;
            c = (char) 37047;
            b = (char) 40994;
            d = new char[]{47269, 47308, 47297, 47291, 47315, 47341, 47343, 47348, 47336, 47330, 47302, 47286, 47312, 47335, 47343, 47338, 47309, 47289, 47298, 47291, 47315, 47341, 47343, 47348, 47336, 47330, 47308, 47283, 47300, 47309, 47312, 47269, 47300, 47309, 47312, 47291, 47289, 47298, 47291, 47315, 47341, 47343, 47348, 47336, 47330, 47308, 47283, 47308, 47297, 47291, 47315, 47341, 47343, 47348, 47336, 47330, 47302, 47286, 47312, 47335, 47343, 47338, 47286, 47341, 47331, 47342, 47346, 47338, 47336, 47349, 47338, 47325, 47292, 47317, 47349, 47341, 47336, 47349, 47338, 47341, 47308, 47309, 47330, 47336, 47348, 47293, 47343, 47330, 47328, 47331, 47331, 47315, 47325, 47330, 47328, 47330, 47331, 47334, 47324, 47334, 47336, 47330, 47353, 47203, 47207, 47222, 47220, 47222, 47223, 47210, 47200, 47210, 47228, 47222, 47219, 47218, 47264, 47327, 47342, 47342, 47340, 47331, 47341, 47343, 47348, 47336, 47330, 47309, 47308, 47341, 47338, 47349, 47336, 47341, 47349, 47317, 47307, 47338, 47305, 47291, 47324, 47334, 47331, 47330, 47328, 47330, 47335, 47171, 47177, 47190, 47183, 47182, 47190, 47191, 47181, 47170, 47298, 47356, 47330, 47331, 47341, 47294, 47336, 47313, 47319, 47334, 47343, 47349, 47348, 47345, 47349, 47329, 47343, 47343, 47299, 47316, 47336, 47328, 47336, 47351, 47337, 47338, 47346, 47319, 47308, 47328, 47343, 47351, 47317, 47292, 47312, 47343, 47351, 47338, 47331, 47331, 47330, 47334, 47284, 47331, 47341, 47343, 47348, 47336, 47330, 47309, 47308, 47341, 47338, 47349, 47336, 47341, 47349, 47317, 47307, 47338, 47305, 47300, 47322, 47340, 47342, 47331, 47342, 47344, 47351, 47343, 47294, 47349, 47324, 47321, 47346, 47336, 47319, 47325, 47350, 47341, 47337, 47282, 47339, 47348, 47348, 47347, 47352, 47344, 47321, 47321, 47345, 47351, 47350, 47344, 47350, 47350, 47339, 47339, 47345, 47351};
        }

        /* JADX WARN: Type inference failed for: r6v0 */
        /* JADX WARN: Type inference failed for: r6v20 */
        public static java.lang.Object[] a(android.content.Context context, int i2, int i3) {
            int i4;
            int i5 = 1;
            int i6 = 0;
            if (context == null) {
                java.lang.Object[] objArr = {null, new int[]{i2}, new int[]{i2}, new int[]{(~(r1 & r2)) & r4}};
                int i7 = ~i2;
                int i8 = (i3 - (~(((((((~(i2 | (-48746697))) | 37752840) | (~(786945755 | i7))) * 886) + 1182029207) + (((~(48746696 | i7)) | 775951899) * (-1772))) + ((~(i7 | 775951899)) * 886)))) - 1;
                int i9 = i8 << 13;
                int i10 = (~(i8 & i9)) & (i8 | i9);
                int i11 = i10 >>> 17;
                int i12 = (i10 & (~i11)) | ((~i10) & i11);
                int i13 = i12 << 5;
                int i14 = i12 | i13;
                return objArr;
            }
            try {
                int gidForName = android.os.Process.getGidForName("");
                int i15 = (gidForName * (-1939)) + 37869;
                int i16 = ~i2;
                int i17 = ~(i16 | 39);
                int i18 = -(-(((~((gidForName ^ (-40)) | (gidForName & (-40)))) | i17) * (-970)));
                int i19 = (i15 & i18) + (i15 | i18);
                int i20 = ~gidForName;
                int i21 = -(-((~((i20 ^ 39) | (i20 & 39))) * 1940));
                int i22 = (i19 & i21) + (i21 | i19);
                int i23 = ~(i20 | (-40));
                int i24 = ((i23 ^ i17) | (i23 & i17)) * 970;
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                f("\uf393\ue671䶾⾢㹲\ue4da뚗龾諶県\u1c3a\udb4f켙엡㹈\ude14됺맸㢭鉗Ᾰ乿씀ﳄ팈肐⥶讶\udd38椔\u1c3a\udb4fㅝ䉗툎旰瓙⟦", ((i22 | i24) << 1) - (i24 ^ i22), objArr2);
                java.lang.Object[] objArr3 = (java.lang.Object[]) java.lang.reflect.Array.newInstance(java.lang.Class.forName((java.lang.String) objArr2[0]), 2);
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                g("\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000", new int[]{0, 31, 0, 0}, false, objArr4);
                try {
                    java.lang.Object[] objArr5 = {(java.lang.String) objArr4[0]};
                    int combineMeasuredStates = android.view.View.combineMeasuredStates(0, 0);
                    int a2 = com.facetec.sdk.ol.AnonymousClass1.a();
                    int i25 = ~a2;
                    int i26 = ~((i25 ^ (-39)) | (i25 & (-39)));
                    int i27 = ~((combineMeasuredStates ^ 38) | (combineMeasuredStates & 38) | a2);
                    int i28 = (combineMeasuredStates * (-830)) + 31616 + (((i26 ^ i27) | (i27 & i26)) * (-831));
                    int i29 = (combineMeasuredStates ^ (-39)) | (combineMeasuredStates & (-39));
                    int i30 = (~((i29 ^ a2) | (i29 & a2))) * (-1662);
                    int i31 = (i28 ^ i30) + ((i30 & i28) << 1);
                    int i32 = ~combineMeasuredStates;
                    int i33 = ~((i32 ^ i25) | (i32 & i25));
                    int i34 = ~((combineMeasuredStates ^ a2) | (combineMeasuredStates & a2));
                    int i35 = (i33 ^ i34) | (i33 & i34);
                    int i36 = ~((a2 ^ 38) | (a2 & 38));
                    int i37 = -(-(((i35 ^ i36) | (i35 & i36)) * 831));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    f("\uf393\ue671䶾⾢㹲\ue4da뚗龾諶県\u1c3a\udb4f켙엡㹈\ude14됺맸㢭鉗Ᾰ乿씀ﳄ팈肐⥶讶\udd38椔\u1c3a\udb4fㅝ䉗툎旰瓙⟦", (i31 & i37) + (i37 | i31), objArr6);
                    objArr3[0] = java.lang.Class.forName((java.lang.String) objArr6[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr5);
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    g("\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000", new int[]{31, 31, 0, 0}, false, objArr7);
                    try {
                        java.lang.Object[] objArr8 = {(java.lang.String) objArr7[0]};
                        int gidForName2 = android.os.Process.getGidForName("");
                        int i38 = gidForName2 * 714;
                        int i39 = ((i38 | (-27768)) << 1) - (i38 ^ (-27768));
                        int i40 = ~gidForName2;
                        int i41 = (~((i40 & i16) | (i40 ^ i16))) | (~((i40 & 39) | (i40 ^ 39)));
                        int i42 = (gidForName2 & (-40)) | (gidForName2 ^ (-40));
                        int i43 = ~((i42 ^ i2) | (i42 & i2));
                        int i44 = ((i41 ^ i43) | (i41 & i43)) * (-713);
                        int i45 = (i39 ^ i44) + ((i44 & i39) << 1);
                        int i46 = i43 * 1426;
                        int i47 = (i45 & i46) + (i46 | i45);
                        int i48 = (~((i16 ^ (-40)) | (i16 & (-40)))) * 713;
                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                        f("\uf393\ue671䶾⾢㹲\ue4da뚗龾諶県\u1c3a\udb4f켙엡㹈\ude14됺맸㢭鉗Ᾰ乿씀ﳄ팈肐⥶讶\udd38椔\u1c3a\udb4fㅝ䉗툎旰瓙⟦", (i47 & i48) + (i48 | i47), objArr9);
                        objArr3[1] = java.lang.Class.forName((java.lang.String) objArr9[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr8);
                        try {
                            java.lang.Object[] objArr10 = new java.lang.Object[1];
                            g("\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001", new int[]{62, 23, 0, 3}, true, objArr10);
                            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr10[0]);
                            java.lang.Object[] objArr11 = new java.lang.Object[1];
                            g("\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000", new int[]{85, 17, 0, 0}, true, objArr11);
                            java.lang.Object invoke = cls.getMethod((java.lang.String) objArr11[0], null).invoke(context, null);
                            try {
                                java.lang.Object[] objArr12 = new java.lang.Object[1];
                                g("\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001", new int[]{62, 23, 0, 3}, true, objArr12);
                                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr12[0]);
                                int i49 = -(-android.view.View.MeasureSpec.getSize(0));
                                java.lang.Object[] objArr13 = new java.lang.Object[1];
                                f("鍮ꮆ⣚祀\uf800銑䇄稗鍮ꮆ貿\uf117㴬钦", ((i49 | 14) << 1) - (i49 ^ 14), objArr13);
                                try {
                                    java.lang.Object[] objArr14 = {cls2.getMethod((java.lang.String) objArr13[0], null).invoke(context, null), 64};
                                    int i50 = -android.graphics.ImageFormat.getBitsPerPixel(0);
                                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                                    f("獵뿡킅ⅇᲸ졺\ued99尺襺鱖ᝫꚋﳻ娠ꢐ챳ဩ䎩쟌\ue554\uf800銑䇄稗鍮ꮆ\uded9\ue484鑢⥈鍮ꮆꮥ묱", (i50 & 32) + (i50 | 32), objArr15);
                                    java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr15[0]);
                                    java.lang.Object[] objArr16 = new java.lang.Object[1];
                                    g("\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001", new int[]{102, 14, 140, 12}, true, objArr16);
                                    java.lang.Object invoke2 = cls3.getMethod((java.lang.String) objArr16[0], java.lang.String.class, java.lang.Integer.TYPE).invoke(invoke, objArr14);
                                    java.lang.Object[] objArr17 = new java.lang.Object[1];
                                    g("\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000", new int[]{116, 30, 0, 4}, false, objArr17);
                                    java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr17[0]);
                                    java.lang.Object[] objArr18 = new java.lang.Object[1];
                                    g("\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001", new int[]{146, 10, 95, 3}, true, objArr18);
                                    java.lang.Object[] objArr19 = (java.lang.Object[]) cls4.getField((java.lang.String) objArr18[0]).get(invoke2);
                                    int length = objArr19.length;
                                    int i51 = 0;
                                    while (i51 < length) {
                                        java.lang.Object obj = objArr19[i51];
                                        java.lang.Object[] objArr20 = new java.lang.Object[i5];
                                        g("\u0001\u0000\u0001\u0001\u0001", new int[]{156, 5, 53, i6}, i6, objArr20);
                                        try {
                                            java.lang.Object[] objArr21 = {(java.lang.String) objArr20[i6]};
                                            java.lang.Object[] objArr22 = new java.lang.Object[i5];
                                            g("\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000", new int[]{161, 37, i6, 9}, i6, objArr22);
                                            java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr22[i6]);
                                            int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i6, i6);
                                            int a3 = com.facetec.sdk.ol.AnonymousClass1.a();
                                            int i52 = ~makeMeasureSpec;
                                            int i53 = ~a3;
                                            int i54 = ~((i52 ^ i53) | (i52 & i53));
                                            int i55 = ~(a3 | (-12));
                                            java.lang.Object[] objArr23 = objArr19;
                                            int i56 = ~((a3 ^ (-12)) | (a3 & (-12)));
                                            int i57 = length;
                                            int i58 = ~((i53 ^ 11) | (i53 & 11));
                                            int i59 = ~((i52 ^ a3) | (i52 & a3));
                                            int i60 = ~((i53 ^ makeMeasureSpec) | (makeMeasureSpec & i53));
                                            int i61 = i51;
                                            java.lang.Object[] objArr24 = new java.lang.Object[1];
                                            f("鍮ꮆ\u2e76ㆆ\u1aec놗믇秣ㅝ䉗›\udfb6", (((((makeMeasureSpec * (-574)) - 6314) + (((i54 ^ i55) | (i55 & i54)) * 1150)) + (((i56 & i58) | (i56 ^ i58)) * (-575))) - (~(((i59 & i60) | (i59 ^ i60)) * 575))) - 1, objArr24);
                                            java.lang.Object invoke3 = cls5.getMethod((java.lang.String) objArr24[0], java.lang.String.class).invoke(null, objArr21);
                                            try {
                                                java.lang.Object[] objArr25 = new java.lang.Object[1];
                                                g("\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001", new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_UP_VALUE, 28, 0, 0}, false, objArr25);
                                                java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr25[0]);
                                                java.lang.Object[] objArr26 = new java.lang.Object[1];
                                                g("\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000", new int[]{226, 11, 0, 11}, false, objArr26);
                                                try {
                                                    java.lang.Object[] objArr27 = {new java.io.ByteArrayInputStream((byte[]) cls6.getMethod((java.lang.String) objArr26[0], null).invoke(obj, null))};
                                                    java.lang.Object[] objArr28 = new java.lang.Object[1];
                                                    g("\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000", new int[]{161, 37, 0, 9}, false, objArr28);
                                                    java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr28[0]);
                                                    java.lang.Object[] objArr29 = new java.lang.Object[1];
                                                    g("\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001", new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, 19, 9, 16}, true, objArr29);
                                                    java.lang.Object invoke4 = cls7.getMethod((java.lang.String) objArr29[0], java.io.InputStream.class).invoke(invoke3, objArr27);
                                                    int length2 = objArr3.length;
                                                    int i62 = 0;
                                                    for (int i63 = 2; i62 < i63; i63 = 2) {
                                                        java.lang.Object obj2 = objArr3[i62];
                                                        try {
                                                            int i64 = -android.text.TextUtils.indexOf("", "");
                                                            int a4 = com.facetec.sdk.ol.AnonymousClass1.a();
                                                            int i65 = (i64 * 367) + 12478;
                                                            int i66 = -(-(((i64 ^ 34) | (i64 & 34)) * (-366)));
                                                            int i67 = ((((i65 | i66) << 1) - (i65 ^ i66)) - (~(((~((a4 & (-35)) | (a4 ^ (-35)))) | i64) * (-366)))) - 1;
                                                            int i68 = ~i64;
                                                            int i69 = ~((i68 ^ 34) | (i68 & 34));
                                                            int i70 = (i64 & (-35)) | (i64 ^ (-35));
                                                            int i71 = ~((i70 ^ a4) | (i70 & a4));
                                                            int i72 = ((i71 ^ i69) | (i71 & i69)) * 366;
                                                            java.lang.Object[] objArr30 = new java.lang.Object[1];
                                                            f("\uf393\ue671䶾⾢͙㊪룊딺࿙ꠀ옾䷔ᵪ﨧굔뗓ᱱ줶팈肐⥶讶౩᷹\ud8d4갨\uf606哳믠≆\ude29쬿㙠㵗", ((i67 | i72) << 1) - (i72 ^ i67), objArr30);
                                                            java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr30[0]);
                                                            int jumpTapTimeout = android.view.ViewConfiguration.getJumpTapTimeout() >> 16;
                                                            int a5 = com.facetec.sdk.ol.AnonymousClass1.a();
                                                            int i73 = (jumpTapTimeout * (-500)) - 11500;
                                                            int i74 = ~((jumpTapTimeout ^ (-24)) | (jumpTapTimeout & (-24)));
                                                            int i75 = ~jumpTapTimeout;
                                                            int i76 = (i75 ^ 23) | (i75 & 23);
                                                            int i77 = ~((i76 & a5) | (i76 ^ a5));
                                                            int i78 = -(-(((i74 & i77) | (i74 ^ i77)) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING));
                                                            int i79 = ((i73 | i78) << 1) - (i73 ^ i78);
                                                            int i80 = -(-((~((i75 & (-24)) | (i75 ^ (-24)))) * 1002));
                                                            int i81 = i75 | (~a5);
                                                            java.lang.Object[] objArr31 = new java.lang.Object[1];
                                                            f("鍮ꮆ\udbd1桏堫ౘ晊좯䠭ųꢖ\uec27씀ﳄ쎦⫦\u12d7穏㌭徆ԥ㙍◇턤", (((i79 | i80) << 1) - (i80 ^ i79)) + ((~((i81 ^ 23) | (i81 & 23))) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING), objArr31);
                                                            if (obj2.equals(cls8.getMethod((java.lang.String) objArr31[0], null).invoke(invoke4, null))) {
                                                                java.lang.Object[] objArr32 = {null, new int[]{i2}, new int[]{(~(i2 & 1)) & (i2 | 1)}, new int[]{r2 ^ (r2 << 5)}};
                                                                int i82 = -(-((((~(387371421 | i16)) * (-560)) - 1264850797) + ((~((-134284355) | i2)) * (-560)) + (((~(437327174 | i16)) | 84328601) * 560) + 16));
                                                                int i83 = (i3 & i82) + (i3 | i82);
                                                                int i84 = i83 << 13;
                                                                int i85 = (~(i84 & i83)) & (i84 | i83);
                                                                int i86 = i85 >>> 17;
                                                                int i87 = (~(i85 & i86)) & (i85 | i86);
                                                                return objArr32;
                                                            }
                                                            int i88 = i62 + 22;
                                                            i62 = (i88 ^ (-21)) + ((i88 & (-21)) << 1);
                                                        } catch (java.lang.Throwable th) {
                                                            java.lang.Throwable cause = th.getCause();
                                                            if (cause != null) {
                                                                throw cause;
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                    i51 = (i61 ^ 1) + ((i61 & 1) << 1);
                                                    objArr19 = objArr23;
                                                    length = i57;
                                                    i5 = 1;
                                                    i6 = 0;
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
                                    i4 = i5;
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
                i4 = 1;
            }
            int[] iArr = new int[i4];
            int[] iArr2 = new int[i4];
            iArr[0] = i2;
            iArr2[0] = i2;
            java.lang.Object[] objArr33 = {null, iArr, iArr2, new int[i4]};
            int i89 = (int) java.lang.Runtime.getRuntime().totalMemory();
            int i90 = ~i89;
            int i91 = (((~((-101711898) | i90)) | (~(530578431 | i89))) * 988) + 810126967 + (((~(i89 | (-395832062))) | 294120164 | (~(i90 | 530578431))) * 988);
            int a6 = com.facetec.sdk.ol.AnonymousClass1.a();
            int i92 = i91 * (-755);
            int i93 = ~i91;
            int i94 = (i92 << 1) - i92;
            int i95 = ~((i93 ^ (-1)) | i93);
            int i96 = (i94 - (~(i95 * 1512))) - 1;
            int i97 = ~(i91 | a6);
            int i98 = ((i95 ^ i97) | (i95 & i97)) * (-756);
            int i99 = (i96 ^ i98) + ((i98 & i96) << 1);
            int i100 = ~a6;
            int i101 = ((i100 ^ i91) | (i100 & i91)) * 756;
            int i102 = i3 + (i99 & i101) + (i101 | i99);
            int i103 = i102 << 13;
            int i104 = (~(i102 & i103)) & (i102 | i103);
            int i105 = i104 >>> 17;
            int i106 = (~(i104 & i105)) & (i104 | i105);
            ((int[]) objArr33[3])[0] = i106 ^ (i106 << 5);
            return objArr33;
        }
    };
    private final com.facetec.sdk.fd<java.util.Date> d;

    /* synthetic */ gp(com.facetec.sdk.fd fdVar, byte b) {
        this(fdVar);
    }

    @Override // com.facetec.sdk.fd
    public final /* bridge */ /* synthetic */ void a(com.facetec.sdk.gu guVar, java.sql.Timestamp timestamp) throws java.io.IOException {
        this.d.a(guVar, timestamp);
    }

    private gp(com.facetec.sdk.fd<java.util.Date> fdVar) {
        this.d = fdVar;
    }

    @Override // com.facetec.sdk.fd
    public final /* synthetic */ java.sql.Timestamp b(com.facetec.sdk.gt gtVar) throws java.io.IOException {
        java.util.Date b = this.d.b(gtVar);
        if (b != null) {
            return new java.sql.Timestamp(b.getTime());
        }
        return null;
    }
}
