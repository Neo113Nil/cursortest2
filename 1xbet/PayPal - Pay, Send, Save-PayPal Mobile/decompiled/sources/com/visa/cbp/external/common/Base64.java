package com.visa.cbp.external.common;

/* loaded from: classes5.dex */
public class Base64 {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int BuildConfig;
    private static final com.visa.cbp.external.common.Encoder encoder;
    private static int[] valueOf;
    private static int values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, short s, java.lang.Object[] objArr) {
        int i3;
        int i4;
        int i5;
        byte[] bArr = $$a;
        int i6 = 4 - (i2 * 2);
        int i7 = (i * 3) + 1;
        byte[] bArr2 = new byte[i7];
        if (bArr == null) {
            int i8 = i7;
            i4 = i6;
            i5 = 0;
            i6 += i8;
            i4++;
            i3 = i5;
            i5 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i5 == i7) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i8 = bArr[i4];
            i6 += i8;
            i4++;
            i3 = i5;
            i5 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i5 == i7) {
            }
        } else {
            int i9 = s + 101;
            i3 = 0;
            i4 = i6;
            i6 = i9;
            i5 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i5 == i7) {
            }
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        values = 0;
        BuildConfig = 1;
        values();
        encoder = new com.visa.cbp.external.common.Base64Encoder();
        int i = values + 99;
        BuildConfig = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    public static byte[] encode(byte[] bArr) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(((bArr.length + 2) / 3) << 2);
        try {
            encoder.encode(bArr, 0, bArr.length, byteArrayOutputStream);
            values = (BuildConfig + 41) % 128;
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            BuildConfig = (values + 13) % 128;
            return byteArray;
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(new int[]{-1783762782, -1721873563, -1907677695, 612394100, 1513445034, 1438917454, 1250439652, -1320161323, -289631070, -643371560, -2023165046, 1279462927, 776579026, 968920322, -1160744987, -1608012109, -653312900, 330978172}, 33 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(e.getMessage());
            throw new com.visa.cbp.external.common.EncoderException(sb.toString(), e);
        }
    }

    public static int encode(byte[] bArr, java.io.OutputStream outputStream) throws java.io.IOException {
        BuildConfig = (values + 25) % 128;
        return encoder.encode(bArr, 0, bArr.length, outputStream);
    }

    public static int encode(byte[] bArr, int i, int i2, java.io.OutputStream outputStream) throws java.io.IOException {
        int i3 = values + 85;
        BuildConfig = i3 % 128;
        int encode = encoder.encode(bArr, i, i2, outputStream);
        if (i3 % 2 != 0) {
            return encode;
        }
        throw new java.lang.ArithmeticException();
    }

    public static byte[] decode(byte[] bArr) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream((bArr.length / 4) * 3);
        try {
            encoder.decode(bArr, 0, bArr.length, byteArrayOutputStream);
            int i = values;
            BuildConfig = (i + 7) % 128;
            BuildConfig = (i + 41) % 128;
            return byteArrayOutputStream.toByteArray();
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(new int[]{-1267241329, 829334900, 1502035136, -507383470, 1881016452, 1521895780, -603824994, -1029085481, -866144196, 1814676819, 508417030, -297030223, -1863233933, -1805224924, -653312900, 330978172}, android.text.TextUtils.getCapsMode("", 0, 0) + 30, objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(e.getMessage());
            throw new com.visa.cbp.external.common.DecoderException(sb.toString(), e);
        }
    }

    public static byte[] decode(java.lang.String str) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream((str.length() / 4) * 3);
        try {
            encoder.decode(str, byteArrayOutputStream);
            int i = (values + 89) % 128;
            BuildConfig = i;
            values = (i + 19) % 128;
            return byteArrayOutputStream.toByteArray();
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(new int[]{-1267241329, 829334900, 1502035136, -507383470, 1881016452, 1521895780, -603824994, -1029085481, -866144196, 1814676819, 508417030, -297030223, -1052358722, -1655045148, -1301916922, 1107486134}, (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 31, objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(e.getMessage());
            throw new com.visa.cbp.external.common.DecoderException(sb.toString(), e);
        }
    }

    public static int decode(java.lang.String str, java.io.OutputStream outputStream) throws java.io.IOException {
        values = (BuildConfig + 117) % 128;
        int decode = encoder.decode(str, outputStream);
        BuildConfig = (values + 73) % 128;
        return decode;
    }

    private static void a(int[] iArr, int i, java.lang.Object[] objArr) {
        int i2;
        int[] iArr2;
        com.visa.cbp.getTokenInfo gettokeninfo = new com.visa.cbp.getTokenInfo();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = valueOf;
        int i3 = 59818;
        int i4 = 1;
        int i5 = 0;
        if (iArr3 != null) {
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                $10 = ($11 + 73) % 128;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(iArr3[i6])};
                    java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(785952856);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (i3 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 999, ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 35);
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b(0, 0, (short) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(785952856, obj);
                    }
                    iArr4[i6] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                    i6++;
                    i3 = 59818;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = valueOf;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i7 = 0;
            while (i7 < length3) {
                $10 = ($11 + 59) % 128;
                try {
                    java.lang.Object[] objArr4 = new java.lang.Object[i4];
                    objArr4[i5] = java.lang.Integer.valueOf(iArr6[i7]);
                    java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(785952856);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.view.View.resolveSizeAndState(i5, i5, i5) + 59818), 999 - android.graphics.drawable.Drawable.resolveOpacity(i5, i5), 35 - android.text.TextUtils.indexOf("", ""));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b(0, 0, (short) 0, objArr5);
                        iArr2 = iArr6;
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(785952856, obj2);
                    } else {
                        iArr2 = iArr6;
                    }
                    iArr7[i7] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).intValue();
                    i7++;
                    iArr6 = iArr2;
                    i4 = 1;
                    i5 = 0;
                } catch (java.lang.Throwable th2) {
                    java.lang.Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            i2 = i5;
            iArr6 = iArr7;
        } else {
            i2 = 0;
        }
        java.lang.System.arraycopy(iArr6, i2, iArr5, i2, length2);
        gettokeninfo.valueOf = i2;
        while (gettokeninfo.valueOf < iArr.length) {
            $11 = ($10 + 53) % 128;
            cArr[0] = (char) (iArr[gettokeninfo.valueOf] >> 16);
            cArr[1] = (char) iArr[gettokeninfo.valueOf];
            cArr[2] = (char) (iArr[gettokeninfo.valueOf + 1] >> 16);
            cArr[3] = (char) iArr[gettokeninfo.valueOf + 1];
            gettokeninfo.BuildConfig = (cArr[0] << 16) + cArr[1];
            gettokeninfo.ReplenishAckRequest = (cArr[2] << 16) + cArr[3];
            com.visa.cbp.getTokenInfo.BuildConfig(iArr5);
            int i8 = 0;
            for (int i9 = 16; i8 < i9; i9 = 16) {
                gettokeninfo.BuildConfig ^= iArr5[i8];
                try {
                    java.lang.Object[] objArr6 = {gettokeninfo, java.lang.Integer.valueOf(com.visa.cbp.getTokenInfo.ReplenishAckRequest(gettokeninfo.BuildConfig)), gettokeninfo, gettokeninfo};
                    java.lang.Object obj3 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-206949328);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.os.Process.myTid() >> 22), 776 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 34 - android.widget.ExpandableListView.getPackedPositionChild(0L));
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        b(0, 0, (short) 1, objArr7);
                        obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-206949328, obj3);
                    }
                    int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).intValue();
                    gettokeninfo.BuildConfig = gettokeninfo.ReplenishAckRequest;
                    gettokeninfo.ReplenishAckRequest = intValue;
                    i8++;
                } catch (java.lang.Throwable th3) {
                    java.lang.Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            int i10 = gettokeninfo.BuildConfig;
            gettokeninfo.BuildConfig = gettokeninfo.ReplenishAckRequest;
            gettokeninfo.ReplenishAckRequest = i10;
            gettokeninfo.ReplenishAckRequest ^= iArr5[16];
            gettokeninfo.BuildConfig ^= iArr5[17];
            int i11 = gettokeninfo.BuildConfig;
            int i12 = gettokeninfo.ReplenishAckRequest;
            cArr[0] = (char) (gettokeninfo.BuildConfig >>> 16);
            cArr[1] = (char) gettokeninfo.BuildConfig;
            cArr[2] = (char) (gettokeninfo.ReplenishAckRequest >>> 16);
            cArr[3] = (char) gettokeninfo.ReplenishAckRequest;
            com.visa.cbp.getTokenInfo.BuildConfig(iArr5);
            cArr2[gettokeninfo.valueOf * 2] = cArr[0];
            cArr2[(gettokeninfo.valueOf * 2) + 1] = cArr[1];
            cArr2[(gettokeninfo.valueOf * 2) + 2] = cArr[2];
            cArr2[(gettokeninfo.valueOf * 2) + 3] = cArr[3];
            try {
                java.lang.Object[] objArr8 = {gettokeninfo, gettokeninfo};
                java.lang.Object obj4 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-1626240057);
                if (obj4 == null) {
                    java.lang.Class cls4 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1), 568 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 33 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    b(0, 0, (short) 2, objArr9);
                    obj4 = cls4.getMethod((java.lang.String) objArr9[0], java.lang.Object.class, java.lang.Object.class);
                    com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-1626240057, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
                $11 = ($10 + 83) % 128;
            } catch (java.lang.Throwable th4) {
                java.lang.Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    static void values() {
        valueOf = new int[]{-1226008840, 1580552518, -203573561, -1151874354, -508610744, -1982906741, 1086355823, 130713529, 1419791876, 1240262500, -746075338, -137325269, -711834497, 918016339, 868185757, 1243518608, -376322409, -1334540008};
    }

    static void init$0() {
        $$a = new byte[]{org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, com.google.common.base.Ascii.RS, -55, 87};
        $$b = 80;
    }
}
