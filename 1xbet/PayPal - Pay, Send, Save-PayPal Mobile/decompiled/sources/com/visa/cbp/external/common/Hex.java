package com.visa.cbp.external.common;

/* loaded from: classes5.dex */
public class Hex {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int ConfirmReplenishRequest;
    private static final com.visa.cbp.external.common.Encoder encoder;
    private static int valueOf;
    private static char[] values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, short s2, byte b, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3 = s + 4;
        byte[] bArr = $$a;
        int i4 = b + 97;
        int i5 = 1 - (s2 * 2);
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i6 = i4;
            i2 = 0;
            i4 = i5;
            i4 += i6;
            i = i2;
            i3++;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = bArr[i3];
            i4 += i6;
            i = i2;
            i3++;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i5) {
            }
        } else {
            i = 0;
            i3++;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i5) {
            }
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ConfirmReplenishRequest = 0;
        valueOf = 1;
        BuildConfig();
        encoder = new com.visa.cbp.external.common.HexEncoder();
        int i = ConfirmReplenishRequest + 17;
        valueOf = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    public static byte[] encode(byte[] bArr) {
        ConfirmReplenishRequest = (valueOf + 79) % 128;
        byte[] encode = encode(bArr, 0, bArr.length);
        valueOf = (ConfirmReplenishRequest + 37) % 128;
        return encode;
    }

    public static byte[] encode(byte[] bArr, int i, int i2) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            encoder.encode(bArr, i, i2, byteArrayOutputStream);
            int i3 = ConfirmReplenishRequest;
            valueOf = (i3 + 1) % 128;
            valueOf = (i3 + 103) % 128;
            return byteArrayOutputStream.toByteArray();
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(true, new int[]{0, 31, 0, 18}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000", objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(e);
            throw new java.lang.RuntimeException(sb.toString());
        }
    }

    public static int encode(byte[] bArr, java.io.OutputStream outputStream) throws java.io.IOException {
        valueOf = (ConfirmReplenishRequest + 17) % 128;
        int encode = encoder.encode(bArr, 0, bArr.length, outputStream);
        int i = valueOf + 75;
        ConfirmReplenishRequest = i % 128;
        if (i % 2 == 0) {
            return encode;
        }
        throw null;
    }

    public static int encode(byte[] bArr, int i, int i2, java.io.OutputStream outputStream) throws java.io.IOException {
        int i3 = valueOf + 45;
        ConfirmReplenishRequest = i3 % 128;
        if (i3 % 2 != 0) {
            encoder.encode(bArr, i, i2, outputStream);
            throw new java.lang.ArithmeticException();
        }
        int encode = encoder.encode(bArr, i, i2, outputStream);
        int i4 = valueOf + 121;
        ConfirmReplenishRequest = i4 % 128;
        if (i4 % 2 == 0) {
            return encode;
        }
        throw null;
    }

    public static byte[] decode(byte[] bArr) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            encoder.decode(bArr, 0, bArr.length, byteArrayOutputStream);
            int i = (valueOf + 1) % 128;
            ConfirmReplenishRequest = i;
            int i2 = i + 81;
            valueOf = i2 % 128;
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i2 % 2 != 0) {
                return byteArray;
            }
            throw new java.lang.ArithmeticException();
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(true, new int[]{31, 31, 0, 0}, "\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001", objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(e);
            throw new java.lang.RuntimeException(sb.toString());
        }
    }

    public static byte[] decode(java.lang.String str) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            encoder.decode(str, byteArrayOutputStream);
            int i = valueOf;
            ConfirmReplenishRequest = (i + 45) % 128;
            ConfirmReplenishRequest = (i + 121) % 128;
            return byteArrayOutputStream.toByteArray();
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(true, new int[]{31, 31, 0, 0}, "\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001", objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(e);
            throw new java.lang.RuntimeException(sb.toString());
        }
    }

    public static int decode(java.lang.String str, java.io.OutputStream outputStream) throws java.io.IOException {
        int i = ConfirmReplenishRequest + 59;
        valueOf = i % 128;
        com.visa.cbp.external.common.Encoder encoder2 = encoder;
        if (i % 2 != 0) {
            return encoder2.decode(str, outputStream);
        }
        encoder2.decode(str, outputStream);
        throw null;
    }

    private static void a(boolean z, int[] iArr, java.lang.String str, java.lang.Object[] objArr) {
        java.lang.String str2 = str;
        byte[] bArr = str2;
        if (str2 != null) {
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        com.visa.cbp.ReplenishResponse replenishResponse = new com.visa.cbp.ReplenishResponse();
        int i = iArr[0];
        int i2 = 1;
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = values;
        long j = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                $11 = ($10 + 105) % 128;
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[i2];
                    objArr2[0] = java.lang.Integer.valueOf(cArr[i6]);
                    java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-586396651);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) android.widget.ExpandableListView.getPackedPositionType(j), 1701 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), 19 - android.graphics.Color.argb(0, 0, 0, 0));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b((short) -1, (short) 0, (byte) 3, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-586396651, obj);
                    }
                    cArr2[i6] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i6++;
                    i2 = 1;
                    j = 0;
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
        char[] cArr3 = new char[i3];
        java.lang.System.arraycopy(cArr, i, cArr3, 0, i3);
        if (bArr2 != null) {
            char[] cArr4 = new char[i3];
            replenishResponse.ConfirmReplenishRequest = 0;
            char c = 0;
            while (replenishResponse.ConfirmReplenishRequest < i3) {
                if (bArr2[replenishResponse.ConfirmReplenishRequest] == 1) {
                    int i7 = replenishResponse.ConfirmReplenishRequest;
                    try {
                        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr3[replenishResponse.ConfirmReplenishRequest]), java.lang.Integer.valueOf(c)};
                        java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-718164716);
                        if (obj2 == null) {
                            java.lang.Class cls2 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1657, 21 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            b((short) -1, (short) 0, (byte) 2, objArr5);
                            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-718164716, obj2);
                        }
                        cArr4[i7] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    } catch (java.lang.Throwable th2) {
                        java.lang.Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i8 = replenishResponse.ConfirmReplenishRequest;
                    try {
                        java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr3[replenishResponse.ConfirmReplenishRequest]), java.lang.Integer.valueOf(c)};
                        java.lang.Object obj3 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-1678831086);
                        if (obj3 == null) {
                            java.lang.Class cls3 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (21018 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 346, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 33);
                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                            b((short) -1, (short) 0, (byte) 0, objArr7);
                            obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-1678831086, obj3);
                        }
                        cArr4[i8] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                    } catch (java.lang.Throwable th3) {
                        java.lang.Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                c = cArr4[replenishResponse.ConfirmReplenishRequest];
                try {
                    java.lang.Object[] objArr8 = {replenishResponse, replenishResponse};
                    java.lang.Object obj4 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(116191609);
                    if (obj4 == null) {
                        obj4 = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (59971 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)), 1741 - android.graphics.Color.green(0), android.text.TextUtils.indexOf("", "", 0, 0) + 40)).getMethod(util.h.xy.cb.b.f1091, java.lang.Object.class, java.lang.Object.class);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(116191609, obj4);
                    }
                    ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
                    $11 = ($10 + 77) % 128;
                } catch (java.lang.Throwable th4) {
                    java.lang.Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            $10 = ($11 + 37) % 128;
            char[] cArr5 = new char[i3];
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i9 = i3 - i5;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i9, i5);
            java.lang.System.arraycopy(cArr5, i5, cArr3, 0, i9);
        }
        if (z) {
            int i10 = $10 + 9;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            char[] cArr6 = new char[i3];
            replenishResponse.ConfirmReplenishRequest = 0;
            while (replenishResponse.ConfirmReplenishRequest < i3) {
                cArr6[replenishResponse.ConfirmReplenishRequest] = cArr3[(i3 - replenishResponse.ConfirmReplenishRequest) - 1];
                replenishResponse.ConfirmReplenishRequest++;
                $11 = ($10 + 109) % 128;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            replenishResponse.ConfirmReplenishRequest = 0;
            while (replenishResponse.ConfirmReplenishRequest < i3) {
                cArr3[replenishResponse.ConfirmReplenishRequest] = (char) (cArr3[replenishResponse.ConfirmReplenishRequest] - iArr[2]);
                replenishResponse.ConfirmReplenishRequest++;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static void init$0() {
        $$a = new byte[]{9, 38, -6, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE};
        $$b = 108;
    }

    static void BuildConfig() {
        values = new char[]{26527, 26566, 26567, 26570, 26565, 26565, 26564, 26565, 26606, 26603, 26562, 26560, 26562, 26590, 26566, 26568, 26561, 26562, 26606, 26497, 26620, 26566, 26567, 26561, 26591, 26591, 26597, 26592, 26562, 26618, 26520, 26556, 26497, 26620, 26566, 26567, 26561, 26591, 26591, 26597, 26592, 26562, 26618, 26520, 26607, 26566, 26567, 26570, 26565, 26565, 26568, 26568, 26606, 26603, 26562, 26560, 26562, 26590, 26566, 26568, 26561, 26562};
    }
}
