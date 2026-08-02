package com.visa.cbp.external.common;

/* loaded from: classes16.dex */
public class Base64Url {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char BuildConfig;
    private static int ConfirmReplenishRequest;
    private static final com.visa.cbp.external.common.Encoder encoder;
    public static final java.nio.charset.Charset utf8;
    private static char[] valueOf;
    private static int values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, int i, byte b, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = 4 - (s * 4);
        int i5 = 1 - (i * 2);
        int i6 = (b * 2) + 108;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i6;
            i3 = 0;
            i6 = i5;
            i4++;
            i6 += i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i4];
            i4++;
            i6 += i7;
            i2 = i3;
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

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ConfirmReplenishRequest = 0;
        values = 1;
        ReplenishAckRequest();
        encoder = new com.visa.cbp.external.common.Base64UrlEncoder();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a((byte) (106 - android.text.TextUtils.getCapsMode("", 0, 0)), "\u0005\u0014\u0014\u0017㘌", 4 - android.graphics.ImageFormat.getBitsPerPixel(0), objArr);
        utf8 = java.nio.charset.Charset.forName(((java.lang.String) objArr[0]).intern());
        int i = ConfirmReplenishRequest + 37;
        values = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    public static byte[] encode(byte[] bArr) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            encoder.encode(bArr, 0, bArr.length, byteArrayOutputStream);
            ConfirmReplenishRequest = (values + 69) % 128;
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            values = (ConfirmReplenishRequest + 115) % 128;
            return byteArray;
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr = new java.lang.Object[1];
            a((byte) (android.view.KeyEvent.getDeadChar(0, 0) + 75), "\u0003#\u0017\u000b\u0019\"\r\u0018\b\r\u0001\u000b\r\u001d\u001e\u000e\u0006\u001f\u0014\b\u0016\u0013\u0014 \u001a\u0006\u0002\u0011\u0006\u001b\u001d\u0002\u0015\u001a\u0014\u0002\u0019\u001e\u0019\u0018㘅", (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 41, objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(e.getMessage());
            throw new com.visa.cbp.external.common.EncoderException(sb.toString(), e);
        }
    }

    public static int encode(byte[] bArr, java.io.OutputStream outputStream) throws java.io.IOException {
        int i = values + 5;
        ConfirmReplenishRequest = i % 128;
        return encoder.encode(bArr, i % 2 != 0 ? 1 : 0, bArr.length, outputStream);
    }

    public static byte[] decode(byte[] bArr) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            encoder.decode(bArr, 0, bArr.length, byteArrayOutputStream);
            int i = values + 77;
            ConfirmReplenishRequest = i % 128;
            int i2 = i % 2;
            return byteArrayOutputStream.toByteArray();
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr = new java.lang.Object[1];
            a((byte) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 98), "\u0003#\u0017\u000b\u0019\"\r\u0018\b\r#\u0002\r\u001d\u001e\u000e\u0006\u001f\u0014\b\u0016\u0013\u0014 \u001a\u0006\u0002\u0011\u0006\u001b\u001d\u0002\u0015\u001a\u0014 #\u0007\r\u0006#\u0018㘜", ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 43, objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(e.getMessage());
            throw new com.visa.cbp.external.common.DecoderException(sb.toString(), e);
        }
    }

    public static int decode(byte[] bArr, java.io.OutputStream outputStream) throws java.io.IOException {
        ConfirmReplenishRequest = (values + 73) % 128;
        return encoder.decode(bArr, 0, bArr.length, outputStream);
    }

    public static byte[] decode(java.lang.String str) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            encoder.decode(str, byteArrayOutputStream);
            values = (ConfirmReplenishRequest + 83) % 128;
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            int i = values + 63;
            ConfirmReplenishRequest = i % 128;
            if (i % 2 == 0) {
                return byteArray;
            }
            throw null;
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr = new java.lang.Object[1];
            a((byte) (98 - android.view.View.MeasureSpec.getMode(0)), "\u0003#\u0017\u000b\u0019\"\r\u0018\b\r#\u0002\r\u001d\u001e\u000e\u0006\u001f\u0014\b\u0016\u0013\u0014 \u001a\u0006\u0002\u0011\u0006\u001b\u001d\u0002\u0015\u001a\u0014 #\u0007\r\u0006#\u0018㘜", (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 42, objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(e.getMessage());
            throw new com.visa.cbp.external.common.DecoderException(sb.toString(), e);
        }
    }

    public static int decode(java.lang.String str, java.io.OutputStream outputStream) throws java.io.IOException {
        int i = ConfirmReplenishRequest + 57;
        values = i % 128;
        if (i % 2 == 0) {
            encoder.decode(str, outputStream);
            throw new java.lang.ArithmeticException();
        }
        int decode = encoder.decode(str, outputStream);
        int i2 = values + 59;
        ConfirmReplenishRequest = i2 % 128;
        if (i2 % 2 == 0) {
            return decode;
        }
        throw null;
    }

    public static final java.lang.String bs64Encode(byte[] bArr) {
        int i;
        java.lang.String str = new java.lang.String(encode(bArr), utf8);
        int length = str.length();
        if (length > 2) {
            if (str.charAt(length - 1) == '.') {
                int i2 = values + 83;
                ConfirmReplenishRequest = i2 % 128;
                i = i2 % 2 != 0 ? 72 : 1;
            } else {
                i = 0;
            }
            if (str.charAt(length - 2) == '.') {
                i++;
                ConfirmReplenishRequest = (values + 21) % 128;
            }
            if (i > 0) {
                return str.substring(0, length - i);
            }
        }
        return str;
    }

    public static final byte[] bs64Decode(java.lang.String str) {
        int i = ConfirmReplenishRequest + 41;
        values = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        if (str.length() == 0) {
            return new byte[0];
        }
        int length = 4 - (str.length() % 4);
        if (length == 4) {
            length = 0;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        java.lang.Object[] objArr = new java.lang.Object[1];
        a((byte) (3 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), "㖶㖶㖶", 2 - android.view.MotionEvent.axisFromString(""), objArr);
        sb.append(((java.lang.String) objArr[0]).intern().substring(0, length));
        byte[] decode = decode(sb.toString().getBytes(utf8));
        ConfirmReplenishRequest = (values + 97) % 128;
        return decode;
    }

    private static void a(byte b, java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        char c;
        $10 = ($11 + 91) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.visa.cbp.Signature signature = new com.visa.cbp.Signature();
        char[] cArr = valueOf;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i3])};
                    java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(314573188);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 21401), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1782, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 25)).getMethod("k", java.lang.Integer.TYPE);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(314573188, obj);
                    }
                    cArr2[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
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
        try {
            java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(BuildConfig)};
            java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(314573188);
            long j = 0;
            if (obj2 == null) {
                obj2 = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (21401 - android.graphics.drawable.Drawable.resolveOpacity(0, 0)), 1781 - android.graphics.Color.green(0), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 25)).getMethod("k", java.lang.Integer.TYPE);
                com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(314573188, obj2);
            }
            char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).charValue();
            char[] cArr3 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr3[i2] = (char) (charArray[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                signature.BuildConfig = 0;
                int i4 = $10 + 35;
                $11 = i4 % 128;
                char c2 = 5;
                if (i4 % 2 == 0) {
                    int i5 = 3 / 5;
                }
                while (signature.BuildConfig < i2) {
                    signature.valueOf = charArray[signature.BuildConfig];
                    signature.ReplenishAckRequest = charArray[signature.BuildConfig + 1];
                    if (signature.valueOf == signature.ReplenishAckRequest) {
                        cArr3[signature.BuildConfig] = (char) (signature.valueOf - b);
                        cArr3[signature.BuildConfig + 1] = (char) (signature.ReplenishAckRequest - b);
                        c = c2;
                    } else {
                        try {
                            java.lang.Object[] objArr4 = new java.lang.Object[13];
                            objArr4[12] = signature;
                            objArr4[11] = java.lang.Integer.valueOf(charValue);
                            objArr4[10] = signature;
                            objArr4[9] = signature;
                            objArr4[8] = java.lang.Integer.valueOf(charValue);
                            objArr4[7] = signature;
                            objArr4[6] = signature;
                            objArr4[c2] = java.lang.Integer.valueOf(charValue);
                            objArr4[4] = signature;
                            objArr4[3] = signature;
                            objArr4[2] = java.lang.Integer.valueOf(charValue);
                            objArr4[1] = signature;
                            objArr4[0] = signature;
                            java.lang.Object obj3 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-1991430142);
                            if (obj3 == null) {
                                java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)) + 1), (android.os.Process.getElapsedCpuTime() > j ? 1 : (android.os.Process.getElapsedCpuTime() == j ? 0 : -1)) + 204, 20 - (android.os.SystemClock.uptimeMillis() > j ? 1 : (android.os.SystemClock.uptimeMillis() == j ? 0 : -1)));
                                java.lang.Object[] objArr5 = new java.lang.Object[1];
                                b((short) 0, 0, (byte) 0, objArr5);
                                obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                                com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-1991430142, obj3);
                            }
                            if (((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue() == signature.getTvls) {
                                try {
                                    java.lang.Object[] objArr6 = {signature, signature, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), signature, signature, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), signature, java.lang.Integer.valueOf(charValue), signature};
                                    java.lang.Object obj4 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-693002299);
                                    if (obj4 == null) {
                                        java.lang.Class cls2 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 39551), 653 - android.text.TextUtils.indexOf("", "", 0, 0), android.os.Process.getGidForName("") + 21);
                                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                                        b((short) 0, 0, (byte) 1, objArr7);
                                        c = 5;
                                        obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-693002299, obj4);
                                    } else {
                                        c = 5;
                                    }
                                    int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr6)).intValue();
                                    int i6 = signature.values;
                                    int i7 = signature.getTvls;
                                    cArr3[signature.BuildConfig] = cArr[intValue];
                                    cArr3[signature.BuildConfig + 1] = cArr[(i6 * charValue) + i7];
                                } catch (java.lang.Throwable th2) {
                                    java.lang.Throwable cause2 = th2.getCause();
                                    if (cause2 == null) {
                                        throw th2;
                                    }
                                    throw cause2;
                                }
                            } else {
                                c = 5;
                                if (signature.ConfirmReplenishRequest == signature.values) {
                                    $11 = ($10 + 105) % 128;
                                    signature.getTokenInfo = ((signature.getTokenInfo + charValue) - 1) % charValue;
                                    signature.getTvls = ((signature.getTvls + charValue) - 1) % charValue;
                                    int i8 = signature.ConfirmReplenishRequest;
                                    int i9 = signature.getTokenInfo;
                                    int i10 = signature.values;
                                    int i11 = signature.getTvls;
                                    cArr3[signature.BuildConfig] = cArr[(i8 * charValue) + i9];
                                    cArr3[signature.BuildConfig + 1] = cArr[(i10 * charValue) + i11];
                                } else {
                                    int i12 = signature.ConfirmReplenishRequest;
                                    int i13 = signature.getTvls;
                                    int i14 = signature.values;
                                    int i15 = signature.getTokenInfo;
                                    cArr3[signature.BuildConfig] = cArr[(i12 * charValue) + i13];
                                    cArr3[signature.BuildConfig + 1] = cArr[(i14 * charValue) + i15];
                                }
                            }
                        } catch (java.lang.Throwable th3) {
                            java.lang.Throwable cause3 = th3.getCause();
                            if (cause3 == null) {
                                throw th3;
                            }
                            throw cause3;
                        }
                    }
                    signature.BuildConfig += 2;
                    c2 = c;
                    j = 0;
                }
            }
            int i16 = 0;
            while (i16 < i) {
                int i17 = $11 + 49;
                $10 = i17 % 128;
                if (i17 % 2 != 0) {
                    cArr3[i16] = (char) (cArr3[i16] & 18090);
                    i16 += 58;
                } else {
                    cArr3[i16] = (char) (cArr3[i16] ^ 13722);
                    i16++;
                }
            }
            objArr[0] = new java.lang.String(cArr3);
        } catch (java.lang.Throwable th4) {
            java.lang.Throwable cause4 = th4.getCause();
            if (cause4 == null) {
                throw th4;
            }
            throw cause4;
        }
    }

    static void init$0() {
        $$a = new byte[]{91, -31, 6, -40};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE;
    }

    static void ReplenishAckRequest() {
        valueOf = new char[]{34873, 34866, 34882, 34875, 34870, 34930, 34869, 34937, 34929, 34933, 34868, 34917, 34942, 34863, 34871, 34864, 34865, 34932, 34907, 34897, 34849, 34885, 34874, 34883, 34934, 34936, 34916, 34851, 34919, 34861, 34928, 34915, 34931, 34927, 34872, 34867};
        BuildConfig = (char) 48523;
    }
}
