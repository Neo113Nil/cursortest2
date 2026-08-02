package com.visa.cbp.external.common;

/* loaded from: classes5.dex */
public class Base64Encoder implements com.visa.cbp.external.common.Encoder {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int BuildConfig;
    private static long ConfirmReplenishRequest;
    private static char[] ReplenishAckRequest;
    private static int values;
    protected final byte[] encodeTable = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 113, 114, 115, 116, 117, 118, com.visa.cbp.getEncExpo.IResultReceiver, 120, 121, 122, 48, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 56, 57, 43, 47};
    protected byte padding = kotlin.io.encoding.Base64.padSymbol;
    protected final byte[] decodeTable = new byte[128];

    private static void b(byte b, int i, int i2, java.lang.Object[] objArr) {
        int i3 = i2 * 2;
        int i4 = b + 104;
        byte[] bArr = $$a;
        int i5 = 3 - (i * 3);
        byte[] bArr2 = new byte[i3 + 1];
        int i6 = -1;
        if (bArr == null) {
            i4 += i3;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i4;
            if (i6 == i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            } else {
                i5++;
                i4 += bArr[i5];
            }
        }
    }

    protected void initialiseDecodeTable() {
        values = (BuildConfig + 1) % 128;
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.decodeTable;
            if (i2 >= bArr.length) {
                break;
            }
            BuildConfig = (values + 111) % 128;
            bArr[i2] = -1;
            i2++;
        }
        while (true) {
            byte[] bArr2 = this.encodeTable;
            if (i >= bArr2.length) {
                break;
            }
            this.decodeTable[bArr2[i]] = (byte) i;
            i++;
        }
        int i3 = values + 93;
        BuildConfig = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public Base64Encoder() {
        initialiseDecodeTable();
    }

    @Override // com.visa.cbp.external.common.Encoder
    public int encode(byte[] bArr, int i, int i2, java.io.OutputStream outputStream) throws java.io.IOException {
        int i3;
        int i4;
        int i5;
        int i6 = values + 83;
        BuildConfig = i6 % 128;
        if (i6 % 2 != 0) {
            i3 = i2 * 2;
            i4 = i2 << i3;
        } else {
            i3 = i2 % 3;
            i4 = i2 - i3;
        }
        int i7 = i;
        while (true) {
            i5 = i + i4;
            if (i7 >= i5) {
                break;
            }
            values = (BuildConfig + 15) % 128;
            int i8 = bArr[i7] & 255;
            int i9 = bArr[i7 + 1] & 255;
            byte b = bArr[i7 + 2];
            outputStream.write(this.encodeTable[(i8 >>> 2) & 63]);
            outputStream.write(this.encodeTable[((i8 << 4) | (i9 >>> 4)) & 63]);
            outputStream.write(this.encodeTable[((i9 << 2) | ((b & 255) >>> 6)) & 63]);
            outputStream.write(this.encodeTable[b & 63]);
            i7 += 3;
        }
        if (i3 == 1) {
            int i10 = bArr[i5] & 255;
            outputStream.write(this.encodeTable[(i10 >>> 2) & 63]);
            outputStream.write(this.encodeTable[(i10 << 4) & 63]);
            outputStream.write(this.padding);
            outputStream.write(this.padding);
        } else if (i3 == 2) {
            int i11 = bArr[i5] & 255;
            int i12 = bArr[i5 + 1] & 255;
            outputStream.write(this.encodeTable[(i11 >>> 2) & 63]);
            outputStream.write(this.encodeTable[((i11 << 4) | (i12 >>> 4)) & 63]);
            outputStream.write(this.encodeTable[(i12 << 2) & 63]);
            outputStream.write(this.padding);
        }
        return ((i4 / 3) << 2) + (i3 == 0 ? 0 : 4);
    }

    private boolean ignore(char c) {
        int i = BuildConfig;
        values = (i + 97) % 128;
        if (c == '\n') {
            return true;
        }
        values = (i + 57) % 128;
        if (c == '\r' || c == '\t' || c == ' ') {
            return true;
        }
        int i2 = i + 5;
        values = i2 % 128;
        if (i2 % 2 != 0) {
            return false;
        }
        throw null;
    }

    @Override // com.visa.cbp.external.common.Encoder
    public int decode(byte[] bArr, int i, int i2, java.io.OutputStream outputStream) throws java.io.IOException {
        int i3 = BuildConfig;
        values = (i3 + 69) % 128;
        int i4 = i2 + i;
        int i5 = i3 + 117;
        while (true) {
            values = i5 % 128;
            if (i4 <= i || !ignore((char) bArr[i4 - 1])) {
                break;
            }
            i4--;
            i5 = BuildConfig + 43;
        }
        int i6 = i4 - 4;
        int nextI = nextI(bArr, i, i6);
        int i7 = 0;
        while (nextI < i6) {
            byte b = this.decodeTable[bArr[nextI]];
            int nextI2 = nextI(bArr, nextI + 1, i6);
            byte b2 = this.decodeTable[bArr[nextI2]];
            int nextI3 = nextI(bArr, nextI2 + 1, i6);
            byte b3 = this.decodeTable[bArr[nextI3]];
            int nextI4 = nextI(bArr, nextI3 + 1, i6);
            byte b4 = this.decodeTable[bArr[nextI4]];
            if ((b | b2 | b3 | b4) < 0) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                a(46 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), android.view.KeyEvent.getMaxKeyCode() >> 16, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 8812), objArr);
                throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
            }
            outputStream.write((b << 2) | (b2 >> 4));
            outputStream.write((b2 << 4) | (b3 >> 2));
            outputStream.write((b3 << 6) | b4);
            i7 += 3;
            nextI = nextI(bArr, nextI4 + 1, i6);
            BuildConfig = (values + 47) % 128;
        }
        return i7 + decodeLastBlock(outputStream, (char) bArr[i6], (char) bArr[i4 - 3], (char) bArr[i4 - 2], (char) bArr[i4 - 1]);
    }

    private int nextI(byte[] bArr, int i, int i2) {
        while (i < i2 && ignore((char) bArr[i])) {
            i++;
            BuildConfig = (values + 99) % 128;
        }
        int i3 = BuildConfig + 75;
        values = i3 % 128;
        if (i3 % 2 != 0) {
            return i;
        }
        throw null;
    }

    @Override // com.visa.cbp.external.common.Encoder
    public int decode(java.lang.String str, java.io.OutputStream outputStream) throws java.io.IOException {
        values = (BuildConfig + 125) % 128;
        int length = str.length();
        while (length > 0 && ignore(str.charAt(length - 1))) {
            length--;
            BuildConfig = (values + 27) % 128;
        }
        int i = length - 4;
        int nextI = nextI(str, 0, i);
        int i2 = 0;
        while (nextI < i) {
            byte b = this.decodeTable[str.charAt(nextI)];
            int nextI2 = nextI(str, nextI + 1, i);
            byte b2 = this.decodeTable[str.charAt(nextI2)];
            int nextI3 = nextI(str, nextI2 + 1, i);
            byte b3 = this.decodeTable[str.charAt(nextI3)];
            int nextI4 = nextI(str, nextI3 + 1, i);
            byte b4 = this.decodeTable[str.charAt(nextI4)];
            if ((b | b2 | b3 | b4) < 0) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                a(45 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), android.view.KeyEvent.getMaxKeyCode() >> 16, (char) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 8811), objArr);
                throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
            }
            outputStream.write((b << 2) | (b2 >> 4));
            outputStream.write((b2 << 4) | (b3 >> 2));
            outputStream.write((b3 << 6) | b4);
            i2 += 3;
            nextI = nextI(str, nextI4 + 1, i);
        }
        return i2 + decodeLastBlock(outputStream, str.charAt(i), str.charAt(length - 3), str.charAt(length - 2), str.charAt(length - 1));
    }

    private int decodeLastBlock(java.io.OutputStream outputStream, char c, char c2, char c3, char c4) throws java.io.IOException {
        int i = BuildConfig;
        values = (i + 107) % 128;
        char c5 = this.padding;
        if (c3 == c5) {
            values = (i + 73) % 128;
            byte[] bArr = this.decodeTable;
            byte b = bArr[c];
            byte b2 = bArr[c2];
            if ((b | b2) < 0) {
                int bitsPerPixel = android.graphics.ImageFormat.getBitsPerPixel(0);
                java.lang.Object[] objArr = new java.lang.Object[1];
                a(bitsPerPixel + 53, 44 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 43662), objArr);
                throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
            }
            outputStream.write((b << 2) | (b2 >> 4));
            return 1;
        }
        if (c4 == c5) {
            byte[] bArr2 = this.decodeTable;
            byte b3 = bArr2[c];
            byte b4 = bArr2[c2];
            byte b5 = bArr2[c3];
            if ((b3 | b4 | b5) < 0) {
                float complexToFraction = android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f);
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a(52 - (complexToFraction > 0.0f ? 1 : (complexToFraction == 0.0f ? 0 : -1)), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 45, (char) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 43661), objArr2);
                throw new java.io.IOException(((java.lang.String) objArr2[0]).intern());
            }
            outputStream.write((b3 << 2) | (b4 >> 4));
            outputStream.write((b4 << 4) | (b5 >> 2));
            return 2;
        }
        byte[] bArr3 = this.decodeTable;
        byte b6 = bArr3[c];
        byte b7 = bArr3[c2];
        byte b8 = bArr3[c3];
        byte b9 = bArr3[c4];
        if ((b6 | b7 | b8 | b9) < 0) {
            int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a(lastIndexOf + 53, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 45, (char) (android.view.View.MeasureSpec.getMode(0) + 43661), objArr3);
            throw new java.io.IOException(((java.lang.String) objArr3[0]).intern());
        }
        outputStream.write((b6 << 2) | (b7 >> 4));
        outputStream.write((b7 << 4) | (b8 >> 2));
        outputStream.write((b8 << 6) | b9);
        return 3;
    }

    private int nextI(java.lang.String str, int i, int i2) {
        while (i < i2) {
            BuildConfig = (values + 33) % 128;
            if (!ignore(str.charAt(i))) {
                break;
            }
            values = (BuildConfig + 103) % 128;
            i++;
        }
        return i;
    }

    private static void a(int i, int i2, char c, java.lang.Object[] objArr) {
        com.visa.cbp.ReplenishRequest replenishRequest = new com.visa.cbp.ReplenishRequest();
        long[] jArr = new long[i];
        replenishRequest.ConfirmReplenishRequest = 0;
        while (replenishRequest.ConfirmReplenishRequest < i) {
            $10 = ($11 + 41) % 128;
            int i3 = replenishRequest.ConfirmReplenishRequest;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(ReplenishAckRequest[i2 + replenishRequest.ConfirmReplenishRequest])};
                java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(892187687);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), 959 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 20 - (android.view.KeyEvent.getMaxKeyCode() >> 16));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b((byte) 1, 0, 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                    com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(892187687, obj);
                }
                try {
                    java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(replenishRequest.ConfirmReplenishRequest), java.lang.Long.valueOf(ConfirmReplenishRequest), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1110765441);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) android.graphics.Color.red(0), 257 - android.widget.ExpandableListView.getPackedPositionGroup(0L), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + com.google.common.base.Ascii.SUB);
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b((byte) 0, 0, 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1110765441, obj2);
                    }
                    jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                    try {
                        java.lang.Object[] objArr6 = {replenishRequest, replenishRequest};
                        java.lang.Object obj3 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1527286825);
                        if (obj3 == null) {
                            java.lang.Class cls3 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 44626), 1566 - android.text.TextUtils.indexOf("", "", 0), android.view.MotionEvent.axisFromString("") + 20);
                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                            b((byte) 2, 0, 0, objArr7);
                            obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                            com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1527286825, obj3);
                        }
                        ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (java.lang.Throwable th2) {
                    java.lang.Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } catch (java.lang.Throwable th3) {
                java.lang.Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        char[] cArr = new char[i];
        replenishRequest.ConfirmReplenishRequest = 0;
        $10 = ($11 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        while (replenishRequest.ConfirmReplenishRequest < i) {
            $10 = ($11 + 77) % 128;
            cArr[replenishRequest.ConfirmReplenishRequest] = (char) jArr[replenishRequest.ConfirmReplenishRequest];
            try {
                java.lang.Object[] objArr8 = {replenishRequest, replenishRequest};
                java.lang.Object obj4 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1527286825);
                if (obj4 == null) {
                    java.lang.Class cls4 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 44626), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1566, (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 19);
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    b((byte) 2, 0, 0, objArr9);
                    obj4 = cls4.getMethod((java.lang.String) objArr9[0], java.lang.Object.class, java.lang.Object.class);
                    com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1527286825, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
            } catch (java.lang.Throwable th4) {
                java.lang.Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new java.lang.String(cArr);
    }

    static void init$0() {
        $$a = new byte[]{109, -40, -30, -8};
        $$b = 132;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        BuildConfig = 0;
        values = 1;
        ReplenishAckRequest = new char[]{36404, 14546, 58345, 43679, 21941, 7249, 51071, 36442, 14646, 58332, 43766, 21892, 7344, 51027, 36455, 14615, 57407, 43743, 21935, 7307, 51111, 36427, 14692, 57375, 43819, 21968, 7394, 51092, 36516, 14660, 57379, 43787, 21011, 7548, 51165, 36607, 14730, 57533, 43789, 21038, 7509, 50224, 36566, 14818, 57488, 1746, 45108, 27407, 8825, 56659, 38071, 20377, 1724, 45520, 27450, 8720, 56674, 37974, 20405, 1665, 45553, 26841, 8761, 56649, 37997, 20289, 1709, 45442, 26873, 9165, 56630, 37892, 20338, 1602, 45474, 26821, 9189, 56047, 38298, 20284, 1558, 45435, 26654, 9138, 55962, 38323, 19664, 1584, 45315, 26738, 8960, 56033, 38356, 19695, 1995, 45373, 26633};
        ConfirmReplenishRequest = 7208752034950290135L;
    }
}
