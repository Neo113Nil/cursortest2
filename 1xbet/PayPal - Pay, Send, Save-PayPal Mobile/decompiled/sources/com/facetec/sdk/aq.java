package com.facetec.sdk;

/* loaded from: classes8.dex */
abstract class aq {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;

    /* renamed from: a, reason: collision with root package name */
    private static char[] f3396a;
    private static int c;
    private static int d;
    private static char e;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$f(byte b, short s, byte b2) {
        int i;
        int i2;
        int i3 = 121 - (s * 3);
        byte[] bArr = $$d;
        int i4 = (b2 * 3) + 1;
        int i5 = (b * 3) + 4;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i6 = i3;
            i2 = 0;
            int i7 = i5;
            int i8 = (-i5) + i6;
            int i9 = i7 + 1;
            i = i2;
            i3 = i8;
            i5 = i9;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i4) {
                return new java.lang.String(bArr2, 0);
            }
            int i10 = i3;
            i7 = i5;
            i5 = bArr[i5];
            i6 = i10;
            int i82 = (-i5) + i6;
            int i92 = i7 + 1;
            i = i2;
            i3 = i82;
            i5 = i92;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i4) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i4) {
            }
        }
    }

    static void init$0() {
        $$d = new byte[]{43, 4, 36, -84};
        $$e = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE;
    }

    protected aq() {
    }

    protected static byte[] a(javax.crypto.Cipher cipher, byte[] bArr) throws java.lang.Exception {
        c = (d + 41) % 128;
        try {
            byte[] doFinal = cipher.doFinal(bArr);
            int i = c + 93;
            d = i % 128;
            if (i % 2 != 0) {
                int i2 = 96 / 0;
            }
            return doFinal;
        } catch (java.lang.Exception e2) {
            com.facetec.sdk.n.b(e2);
            return null;
        }
    }

    protected static byte[] e(javax.crypto.Cipher cipher, byte[] bArr) throws java.lang.Exception {
        int i = d + 119;
        c = i % 128;
        java.lang.Object obj = null;
        try {
            if (i % 2 != 0) {
                return cipher.doFinal(bArr);
            }
            cipher.doFinal(bArr);
            obj.hashCode();
            throw null;
        } catch (java.lang.Exception e2) {
            com.facetec.sdk.n.b(e2);
            return null;
        }
    }

    protected static byte[] a() throws java.lang.Exception {
        java.security.SecureRandom secureRandom = new java.security.SecureRandom();
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            l((byte) ((android.os.Process.myTid() >> 22) + 40), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 4, "\u0000\u0002㗱", objArr);
            javax.crypto.KeyGenerator keyGenerator = javax.crypto.KeyGenerator.getInstance(((java.lang.String) objArr[0]).intern());
            keyGenerator.init(128, secureRandom);
            byte[] encoded = keyGenerator.generateKey().getEncoded();
            int i = c + 9;
            d = i % 128;
            if (i % 2 == 0) {
                return encoded;
            }
            throw null;
        } catch (java.security.NoSuchAlgorithmException e2) {
            throw new java.lang.Exception(com.facetec.sdk.ay.c(e2.getMessage()));
        }
    }

    private static void l(byte b, int i, java.lang.String str, java.lang.Object[] objArr) {
        char[] cArr;
        int i2;
        long j;
        if (str != null) {
            cArr = str.toCharArray();
            $10 = ($11 + 23) % 128;
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.facetec.sdk.hr hrVar = new com.facetec.sdk.hr();
        char[] cArr3 = f3396a;
        int i3 = -1887519861;
        if (cArr3 != null) {
            $11 = ($10 + 109) % 128;
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i4])};
                    java.lang.Object d2 = com.facetec.sdk.al.d(i3);
                    if (d2 == null) {
                        byte b2 = (byte) 0;
                        d2 = com.facetec.sdk.al.c((char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), 1858 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 32 - android.text.TextUtils.getTrimmedLength(""), 680640883, false, $$f(b2, b2, b2), new java.lang.Class[]{java.lang.Integer.TYPE});
                    }
                    cArr4[i4] = ((java.lang.Character) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).charValue();
                    i4++;
                    i3 = -1887519861;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(e)};
        java.lang.Object d3 = com.facetec.sdk.al.d(-1887519861);
        long j2 = 0;
        char c2 = 6;
        if (d3 == null) {
            byte b3 = (byte) 0;
            d3 = com.facetec.sdk.al.c((char) android.widget.ExpandableListView.getPackedPositionGroup(0L), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 1858, 32 - android.view.View.resolveSizeAndState(0, 0, 0), 680640883, false, $$f(b3, b3, b3), new java.lang.Class[]{java.lang.Integer.TYPE});
        }
        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) d3).invoke(null, objArr3)).charValue();
        char[] cArr5 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr5[i2] = (char) (cArr2[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            $10 = ($11 + 11) % 128;
            hrVar.c = 0;
            while (hrVar.c < i2) {
                $11 = ($10 + 85) % 128;
                hrVar.f3631a = cArr2[hrVar.c];
                hrVar.d = cArr2[hrVar.c + 1];
                if (hrVar.f3631a == hrVar.d) {
                    cArr5[hrVar.c] = (char) (hrVar.f3631a - b);
                    cArr5[hrVar.c + 1] = (char) (hrVar.d - b);
                    j = j2;
                } else {
                    java.lang.Object[] objArr4 = new java.lang.Object[13];
                    objArr4[12] = hrVar;
                    objArr4[11] = java.lang.Integer.valueOf(charValue);
                    objArr4[10] = hrVar;
                    objArr4[9] = hrVar;
                    objArr4[8] = java.lang.Integer.valueOf(charValue);
                    objArr4[7] = hrVar;
                    objArr4[c2] = hrVar;
                    objArr4[5] = java.lang.Integer.valueOf(charValue);
                    objArr4[4] = hrVar;
                    objArr4[3] = hrVar;
                    objArr4[2] = java.lang.Integer.valueOf(charValue);
                    objArr4[1] = hrVar;
                    objArr4[0] = hrVar;
                    java.lang.Object d4 = com.facetec.sdk.al.d(1053249030);
                    if (d4 == null) {
                        char green = (char) android.graphics.Color.green(0);
                        int keyRepeatTimeout = android.view.ViewConfiguration.getKeyRepeatTimeout();
                        int capsMode = android.text.TextUtils.getCapsMode("", 0, 0);
                        java.lang.Class[] clsArr = new java.lang.Class[13];
                        clsArr[0] = java.lang.Object.class;
                        clsArr[1] = java.lang.Object.class;
                        clsArr[2] = java.lang.Integer.TYPE;
                        clsArr[3] = java.lang.Object.class;
                        clsArr[4] = java.lang.Object.class;
                        clsArr[5] = java.lang.Integer.TYPE;
                        clsArr[c2] = java.lang.Object.class;
                        clsArr[7] = java.lang.Object.class;
                        clsArr[8] = java.lang.Integer.TYPE;
                        clsArr[9] = java.lang.Object.class;
                        clsArr[10] = java.lang.Object.class;
                        clsArr[11] = java.lang.Integer.TYPE;
                        clsArr[12] = java.lang.Object.class;
                        d4 = com.facetec.sdk.al.c(green, 234 - (keyRepeatTimeout >> 16), capsMode + 24, -1725418242, false, "u", clsArr);
                    }
                    if (((java.lang.Integer) ((java.lang.reflect.Method) d4).invoke(null, objArr4)).intValue() == hrVar.i) {
                        java.lang.Object[] objArr5 = new java.lang.Object[11];
                        objArr5[10] = hrVar;
                        objArr5[9] = java.lang.Integer.valueOf(charValue);
                        objArr5[8] = hrVar;
                        objArr5[7] = java.lang.Integer.valueOf(charValue);
                        objArr5[c2] = java.lang.Integer.valueOf(charValue);
                        objArr5[5] = hrVar;
                        objArr5[4] = hrVar;
                        objArr5[3] = java.lang.Integer.valueOf(charValue);
                        objArr5[2] = java.lang.Integer.valueOf(charValue);
                        objArr5[1] = hrVar;
                        objArr5[0] = hrVar;
                        java.lang.Object d5 = com.facetec.sdk.al.d(764455884);
                        if (d5 == null) {
                            char windowTouchSlop = (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8);
                            int maxKeyCode = android.view.KeyEvent.getMaxKeyCode();
                            long uptimeMillis = android.os.SystemClock.uptimeMillis();
                            java.lang.Class[] clsArr2 = new java.lang.Class[11];
                            clsArr2[0] = java.lang.Object.class;
                            clsArr2[1] = java.lang.Object.class;
                            clsArr2[2] = java.lang.Integer.TYPE;
                            clsArr2[3] = java.lang.Integer.TYPE;
                            clsArr2[4] = java.lang.Object.class;
                            clsArr2[5] = java.lang.Object.class;
                            clsArr2[c2] = java.lang.Integer.TYPE;
                            clsArr2[7] = java.lang.Integer.TYPE;
                            clsArr2[8] = java.lang.Object.class;
                            clsArr2[9] = java.lang.Integer.TYPE;
                            clsArr2[10] = java.lang.Object.class;
                            j = 0;
                            d5 = com.facetec.sdk.al.c(windowTouchSlop, (maxKeyCode >> 16) + 141, (uptimeMillis > 0L ? 1 : (uptimeMillis == 0L ? 0 : -1)) + 23, -1971334860, false, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, clsArr2);
                        } else {
                            j = 0;
                        }
                        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) d5).invoke(null, objArr5)).intValue();
                        int i5 = hrVar.e;
                        int i6 = hrVar.i;
                        cArr5[hrVar.c] = cArr3[intValue];
                        cArr5[hrVar.c + 1] = cArr3[(i5 * charValue) + i6];
                    } else {
                        j = 0;
                        if (hrVar.b == hrVar.e) {
                            $11 = ($10 + 17) % 128;
                            hrVar.j = ((hrVar.j + charValue) - 1) % charValue;
                            hrVar.i = ((hrVar.i + charValue) - 1) % charValue;
                            int i7 = hrVar.b;
                            int i8 = hrVar.j;
                            int i9 = hrVar.e;
                            int i10 = hrVar.i;
                            cArr5[hrVar.c] = cArr3[(i7 * charValue) + i8];
                            cArr5[hrVar.c + 1] = cArr3[(i9 * charValue) + i10];
                        } else {
                            int i11 = hrVar.b;
                            int i12 = hrVar.i;
                            int i13 = hrVar.e;
                            int i14 = hrVar.j;
                            cArr5[hrVar.c] = cArr3[(i11 * charValue) + i12];
                            cArr5[hrVar.c + 1] = cArr3[(i13 * charValue) + i14];
                            int i15 = $11 + 125;
                            $10 = i15 % 128;
                            if (i15 % 2 != 0) {
                                int i16 = 2 / 4;
                            }
                        }
                    }
                }
                hrVar.c += 2;
                j2 = j;
                c2 = 6;
            }
        }
        int i17 = 0;
        while (i17 < i) {
            cArr5[i17] = (char) (cArr5[i17] ^ 13722);
            i17++;
            $10 = ($11 + 17) % 128;
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        d = 0;
        c = 1;
        f3396a = new char[]{4467, 4453, 4471, 4428};
        e = (char) 9390;
    }
}
