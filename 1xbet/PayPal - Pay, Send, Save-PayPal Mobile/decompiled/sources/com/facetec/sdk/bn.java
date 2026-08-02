package com.facetec.sdk;

/* loaded from: classes8.dex */
final class bn {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final char[] b;
    private static char c;
    private static char[] d;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$c(short s, short s2, short s3) {
        int i;
        int i2 = 3 - (s2 * 3);
        int i3 = s * 3;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i3 + 1];
        int i4 = -1;
        if (bArr == null) {
            int i5 = i3;
            i = i2;
            i2 += i5;
            i4++;
            bArr2[i4] = (byte) i2;
            i++;
            if (i4 == i3) {
                return new java.lang.String(bArr2, 0);
            }
            i5 = bArr[i];
            i2 += i5;
            i4++;
            bArr2[i4] = (byte) i2;
            i++;
            if (i4 == i3) {
            }
        } else {
            int i6 = 121 - (s3 * 2);
            i = i2;
            i2 = i6;
            i4++;
            bArr2[i4] = (byte) i2;
            i++;
            if (i4 == i3) {
            }
        }
    }

    static void init$0() {
        $$a = new byte[]{4, 82, 123, 32};
        $$b = 55;
    }

    bn() {
    }

    static java.lang.String c(java.lang.String str) throws java.lang.Exception {
        return e(b(str.getBytes(java.nio.charset.StandardCharsets.UTF_8)));
    }

    static byte[] d(java.lang.String str) throws java.lang.Exception {
        return b(str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    static byte[] b(byte[]... bArr) throws java.lang.Exception {
        return java.security.MessageDigest.getInstance("SHA-256").digest(c(bArr));
    }

    static java.lang.String b(byte[] bArr, java.lang.String str) throws java.lang.Exception {
        return e(d(bArr, str.getBytes(java.nio.charset.StandardCharsets.UTF_8)));
    }

    static byte[] d(byte[] bArr, java.lang.String str) throws java.lang.Exception {
        return d(bArr, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    private static byte[] d(byte[] bArr, byte[]... bArr2) throws java.lang.Exception {
        javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(bArr, org.jose4j.mac.MacUtil.HMAC_SHA256);
        javax.crypto.Mac mac = javax.crypto.Mac.getInstance(org.jose4j.mac.MacUtil.HMAC_SHA256);
        mac.init(secretKeySpec);
        return mac.doFinal(c(bArr2));
    }

    private static byte[] c(byte[]... bArr) {
        int i = 0;
        for (byte[] bArr2 : bArr) {
            i += bArr2.length;
        }
        byte[] bArr3 = new byte[i];
        int i2 = 0;
        for (byte[] bArr4 : bArr) {
            try {
                java.lang.Object[] objArr = {bArr4, 0, bArr3, java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(bArr4.length)};
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a(android.widget.ExpandableListView.getPackedPositionType(0L) + 16, "\r\u0001\u0003\u0004\u000f\u0011\u0004\u0000\u0018\u0011\u0002\u000f\b\n\t\f", (byte) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 93), objArr2);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr2[0]);
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                a(8 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), "\u0004\b\b\u0004\u0013\u0016\u0012\u0014㗫", (byte) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 9), objArr3);
                cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr);
                i2 += bArr4.length;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        return bArr3;
    }

    static {
        init$0();
        e();
        b = "0123456789ABCDEF".toCharArray();
    }

    static java.lang.String e(byte[] bArr) {
        char[] cArr = new char[bArr.length << 1];
        for (int i = 0; i < bArr.length; i++) {
            byte b2 = bArr[i];
            int i2 = i << 1;
            char[] cArr2 = b;
            cArr[i2] = cArr2[(b2 & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b2 & com.google.common.base.Ascii.SI];
        }
        return new java.lang.String(cArr);
    }

    private static void a(int i, java.lang.String str, byte b2, java.lang.Object[] objArr) {
        int i2;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.facetec.sdk.hr hrVar = new com.facetec.sdk.hr();
        char[] cArr = d;
        char c2 = 0;
        int i3 = -1887519861;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i4])};
                    java.lang.Object d2 = com.facetec.sdk.al.d(i3);
                    if (d2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        d2 = com.facetec.sdk.al.c((char) android.graphics.Color.red(0), android.os.Process.getGidForName("") + 1859, 32 - android.graphics.Color.red(0), 680640883, false, $$c(b3, b4, b4), new java.lang.Class[]{java.lang.Integer.TYPE});
                    }
                    cArr2[i4] = ((java.lang.Character) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).charValue();
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
            cArr = cArr2;
        }
        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(c)};
        java.lang.Object d3 = com.facetec.sdk.al.d(-1887519861);
        if (d3 == null) {
            byte b5 = (byte) 0;
            byte b6 = b5;
            d3 = com.facetec.sdk.al.c((char) android.graphics.Color.red(0), (android.view.ViewConfiguration.getTapTimeout() >> 16) + 1858, 32 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 680640883, false, $$c(b5, b6, b6), new java.lang.Class[]{java.lang.Integer.TYPE});
        }
        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) d3).invoke(null, objArr3)).charValue();
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr3[i2] = (char) (charArray[i2] - b2);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            hrVar.c = 0;
            while (hrVar.c < i2) {
                hrVar.f3631a = charArray[hrVar.c];
                hrVar.d = charArray[hrVar.c + 1];
                if (hrVar.f3631a == hrVar.d) {
                    cArr3[hrVar.c] = (char) (hrVar.f3631a - b2);
                    cArr3[hrVar.c + 1] = (char) (hrVar.d - b2);
                } else {
                    java.lang.Object[] objArr4 = new java.lang.Object[13];
                    objArr4[12] = hrVar;
                    objArr4[11] = java.lang.Integer.valueOf(charValue);
                    objArr4[10] = hrVar;
                    objArr4[9] = hrVar;
                    objArr4[8] = java.lang.Integer.valueOf(charValue);
                    objArr4[7] = hrVar;
                    objArr4[6] = hrVar;
                    objArr4[5] = java.lang.Integer.valueOf(charValue);
                    objArr4[4] = hrVar;
                    objArr4[3] = hrVar;
                    objArr4[2] = java.lang.Integer.valueOf(charValue);
                    objArr4[1] = hrVar;
                    objArr4[c2] = hrVar;
                    java.lang.Object d4 = com.facetec.sdk.al.d(1053249030);
                    if (d4 == null) {
                        char scrollDefaultDelay = (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int scrollBarFadeDuration = android.view.ViewConfiguration.getScrollBarFadeDuration();
                        int packedPositionChild = android.widget.ExpandableListView.getPackedPositionChild(0L);
                        java.lang.Class[] clsArr = new java.lang.Class[13];
                        clsArr[c2] = java.lang.Object.class;
                        clsArr[1] = java.lang.Object.class;
                        clsArr[2] = java.lang.Integer.TYPE;
                        clsArr[3] = java.lang.Object.class;
                        clsArr[4] = java.lang.Object.class;
                        clsArr[5] = java.lang.Integer.TYPE;
                        clsArr[6] = java.lang.Object.class;
                        clsArr[7] = java.lang.Object.class;
                        clsArr[8] = java.lang.Integer.TYPE;
                        clsArr[9] = java.lang.Object.class;
                        clsArr[10] = java.lang.Object.class;
                        clsArr[11] = java.lang.Integer.TYPE;
                        clsArr[12] = java.lang.Object.class;
                        d4 = com.facetec.sdk.al.c(scrollDefaultDelay, (scrollBarFadeDuration >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE, packedPositionChild + 25, -1725418242, false, "u", clsArr);
                    }
                    if (((java.lang.Integer) ((java.lang.reflect.Method) d4).invoke(null, objArr4)).intValue() == hrVar.i) {
                        java.lang.Object[] objArr5 = {hrVar, hrVar, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), hrVar, hrVar, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), hrVar, java.lang.Integer.valueOf(charValue), hrVar};
                        java.lang.Object d5 = com.facetec.sdk.al.d(764455884);
                        if (d5 == null) {
                            d5 = com.facetec.sdk.al.c((char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 140 - android.graphics.ImageFormat.getBitsPerPixel(0), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 24, -1971334860, false, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class});
                        }
                        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) d5).invoke(null, objArr5)).intValue();
                        int i5 = hrVar.e;
                        int i6 = hrVar.i;
                        cArr3[hrVar.c] = cArr[intValue];
                        cArr3[hrVar.c + 1] = cArr[(i5 * charValue) + i6];
                    } else if (hrVar.b == hrVar.e) {
                        hrVar.j = ((hrVar.j + charValue) - 1) % charValue;
                        hrVar.i = ((hrVar.i + charValue) - 1) % charValue;
                        int i7 = hrVar.b;
                        int i8 = hrVar.j;
                        int i9 = hrVar.e;
                        int i10 = hrVar.i;
                        cArr3[hrVar.c] = cArr[(i7 * charValue) + i8];
                        cArr3[hrVar.c + 1] = cArr[(i9 * charValue) + i10];
                    } else {
                        int i11 = hrVar.b;
                        int i12 = hrVar.i;
                        int i13 = hrVar.e;
                        int i14 = hrVar.j;
                        cArr3[hrVar.c] = cArr[(i11 * charValue) + i12];
                        cArr3[hrVar.c + 1] = cArr[(i13 * charValue) + i14];
                    }
                }
                hrVar.c += 2;
                c2 = 0;
            }
        }
        for (int i15 = 0; i15 < i; i15++) {
            cArr3[i15] = (char) (cArr3[i15] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static void e() {
        d = new char[]{4453, 4448, 4416, 4439, 4440, 4421, 4476, 4435, 4455, 4420, 4451, 4444, 4450, 4418, 4443, 4441, 4442, 4431, 4449, 4376, 4454, 4477, 4433, 4422, 4437};
        c = (char) 9385;
    }
}
