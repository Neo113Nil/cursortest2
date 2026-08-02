package com.visa.cbp.external.common;

/* loaded from: classes16.dex */
public class TrackData {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    private static char[] BuildConfig = null;
    private static int ConfirmReplenishRequest = 0;
    private static boolean ReplenishAckRequest = false;
    private static int ReplenishRequest = 0;
    public static final int VISA_PAY_APP_TRANSACTION_COUNTER_LEN = 4;
    public static final int VISA_PAY_CVV_LEN = 3;
    public static final int VISA_PAY_RESERVED_BYTES_MAX_LEN = 8;
    public static final int VISA_PAY_SEQUENCE_COUNTER_LEN = 2;
    public static final int VISA_PAY_SERVICE_CODE_LEN = 3;
    public static final int VISA_PAY_TIMESTAMP_LEN = 4;
    public static final int VISA_PAY_TOKEN_EXPIRATION_DATE_LEN = 4;
    public static final int VISA_PAY_TOKEN_LEN = 16;
    private static int getTokenInfo;
    private static boolean valueOf;
    private static int[] values;
    private java.lang.String AppTransactionCounter;
    private java.lang.String CVV;
    private java.lang.String SequenceCounter;
    private java.lang.String ServiceCode;
    private java.lang.String Timestamp;
    private java.lang.String Token;
    private java.lang.String TokenExpirationDate;
    private java.lang.String VISAResevedBytes;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(short s, short s2, short s3, java.lang.Object[] objArr) {
        int i;
        int i2 = s3 * 3;
        int i3 = 4 - (s * 4);
        int i4 = 116 - s2;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i2 + 1];
        if (bArr == null) {
            int i5 = i4;
            int i6 = 0;
            int i7 = i3;
            int i8 = i3 + i5;
            int i9 = i7 + 1;
            i = i6;
            i4 = i8;
            i3 = i9;
            bArr2[i] = (byte) i4;
            if (i == i2) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i10 = i4;
            i7 = i3;
            i3 = bArr[i3];
            i6 = i + 1;
            i5 = i10;
            int i82 = i3 + i5;
            int i92 = i7 + 1;
            i = i6;
            i4 = i82;
            i3 = i92;
            bArr2[i] = (byte) i4;
            if (i == i2) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i4;
            if (i == i2) {
            }
        }
    }

    public TrackData() {
        java.util.Locale locale = java.util.Locale.US;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(new int[]{461448779, 1864306786, 1095277630, 586949378}, 5 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr);
        this.Token = java.lang.String.format(locale, ((java.lang.String) objArr[0]).intern(), 0);
        java.util.Locale locale2 = java.util.Locale.US;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        b(null, android.graphics.Color.blue(0) + 127, null, "\u0084\u0083\u0082\u0081", objArr2);
        this.TokenExpirationDate = java.lang.String.format(locale2, ((java.lang.String) objArr2[0]).intern(), 0);
        java.util.Locale locale3 = java.util.Locale.US;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        b(null, android.view.KeyEvent.getDeadChar(0, 0) + 127, null, "\u0084\u0085\u0082\u0081", objArr3);
        this.ServiceCode = java.lang.String.format(locale3, ((java.lang.String) objArr3[0]).intern(), 0);
        java.util.Locale locale4 = java.util.Locale.US;
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        b(null, android.view.View.MeasureSpec.getMode(0) + 127, null, "\u0084\u0083\u0082\u0081", objArr4);
        this.Timestamp = java.lang.String.format(locale4, ((java.lang.String) objArr4[0]).intern(), 0);
        java.util.Locale locale5 = java.util.Locale.US;
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        a(new int[]{-2140327065, -1574236910}, 4 - android.view.KeyEvent.getDeadChar(0, 0), objArr5);
        this.SequenceCounter = java.lang.String.format(locale5, ((java.lang.String) objArr5[0]).intern(), 0);
        java.util.Locale locale6 = java.util.Locale.US;
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        b(null, 126 - android.graphics.ImageFormat.getBitsPerPixel(0), null, "\u0084\u0083\u0082\u0081", objArr6);
        this.AppTransactionCounter = java.lang.String.format(locale6, ((java.lang.String) objArr6[0]).intern(), 0);
        java.util.Locale locale7 = java.util.Locale.US;
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        b(null, (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 127, null, "\u0084\u0085\u0082\u0081", objArr7);
        this.CVV = java.lang.String.format(locale7, ((java.lang.String) objArr7[0]).intern(), 0);
        java.util.Locale locale8 = java.util.Locale.US;
        java.lang.Object[] objArr8 = new java.lang.Object[1];
        a(new int[]{2078188957, -1014618346}, android.graphics.Color.rgb(0, 0, 0) + 16777220, objArr8);
        this.VISAResevedBytes = java.lang.String.format(locale8, ((java.lang.String) objArr8[0]).intern(), 0);
    }

    public void setToken(java.lang.String str) {
        ReplenishRequest = (getTokenInfo + 83) % 128;
        if (str.length() != 16) {
            java.util.Locale locale = java.util.Locale.US;
            java.lang.Object[] objArr = new java.lang.Object[1];
            b(null, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, null, "\u0093\u008a\u0087\u0092\u008b\u008f\u0089\u0086\u0091\u0090\u008b\u0084\u0081\u008b\u0089\u0090\u008b\u0086\u008f\u008e\u008d\u008b\u008c\u0086\u008c\u0084\u008b\u008a\u0089\u0088\u0087\u0086", objArr);
            throw new java.security.InvalidParameterException(java.lang.String.format(locale, ((java.lang.String) objArr[0]).intern(), 16));
        }
        this.Token = str;
        getTokenInfo = (ReplenishRequest + 77) % 128;
    }

    public void setTokenExpirationDate(java.lang.String str) {
        ReplenishRequest = (getTokenInfo + 3) % 128;
        if (str.length() != 4) {
            java.util.Locale locale = java.util.Locale.US;
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(new int[]{1822489512, -1943905328, -2103836481, 221596385, 2012621891, -1513012527, 2127175042, -506522682, -1924597135, 1643864966, -1439628688, 483392762, 123090395, -45652124, -534313762, 2046700675, -1984164662, -1958530729, -1178740329, -1316105881, 1723869606, -1583465842, 863288214, -1510211789, -1886930402, -1082416482, 55695462, -1858915007, -374072622, -1127154826, -2036547566, 1560438112, 2035442009, -42830146}, 66 - android.graphics.Color.green(0), objArr);
            throw new java.security.InvalidParameterException(java.lang.String.format(locale, ((java.lang.String) objArr[0]).intern(), 4));
        }
        this.TokenExpirationDate = str;
        int i = getTokenInfo + 1;
        ReplenishRequest = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public void setServiceCode(java.lang.String str) {
        int i = getTokenInfo + 57;
        ReplenishRequest = i % 128;
        if (i % 2 == 0 ? str.length() != 3 : str.length() != 3) {
            java.util.Locale locale = java.util.Locale.US;
            java.lang.Object[] objArr = new java.lang.Object[1];
            b(null, android.text.TextUtils.getOffsetAfter("", 0) + 127, null, "\u0093\u008a\u0087\u0092\u008b\u008f\u0089\u0086\u0091\u0090\u008b\u0084\u0081\u008b\u0089\u0090\u008b\u0086\u008f\u008e\u008d\u008b\u0089\u0084\u0087\u0098\u008b\u0089\u0098\u0097\u0096\u0095\u0089\u0094", objArr);
            throw new java.security.InvalidParameterException(java.lang.String.format(locale, ((java.lang.String) objArr[0]).intern(), 3));
        }
        this.ServiceCode = str;
        int i2 = ReplenishRequest + 43;
        getTokenInfo = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public void setTimestamp(java.lang.String str) {
        getTokenInfo = (ReplenishRequest + 27) % 128;
        if (str.length() != 4) {
            java.util.Locale locale = java.util.Locale.US;
            java.lang.Object[] objArr = new java.lang.Object[1];
            b(null, android.view.View.MeasureSpec.getMode(0) + 127, null, "\u009d\u009d\u009d\u009d\u008b\u0086\u008c\u008d\u0095\u0087\u009b\u008b\u0089\u009c\u0086\u008b\u009b\u0087\u008b\u0084\u008a\u008c\u008b\u0093\u008a\u0087\u0092\u008b\u008f\u0089\u0086\u0091\u0090\u008b\u0084\u0081\u008b\u0089\u0090\u008b\u0086\u008f\u008e\u008d\u008b\u009a\u008d\u008c\u0086\u008f\u0089\u008d\u0097\u0099", objArr);
            throw new java.security.InvalidParameterException(java.lang.String.format(locale, ((java.lang.String) objArr[0]).intern(), 4));
        }
        this.Timestamp = str;
        int i = ReplenishRequest + 75;
        getTokenInfo = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    public void setSequenceCounter(java.lang.String str) {
        int i = getTokenInfo + 69;
        ReplenishRequest = i % 128;
        if (i % 2 == 0 ? str.length() != 2 : str.length() != 3) {
            java.util.Locale locale = java.util.Locale.US;
            java.lang.Object[] objArr = new java.lang.Object[1];
            b(null, 127 - (android.os.Process.myTid() >> 22), null, "\u009f\u009f\u008b\u0086\u008c\u008d\u0095\u0087\u009b\u008b\u0089\u009c\u0086\u008b\u009b\u0087\u008b\u0084\u008a\u008c\u008b\u0093\u008a\u0087\u0092\u008b\u008f\u0089\u0086\u0091\u0090\u008b\u0084\u0081\u008b\u0089\u0090\u008b\u0086\u008f\u008e\u008d\u008b\u0095\u0089\u0086\u008a\u008e\u0087\u0098\u008b\u0089\u0098\u008a\u0089\u008e\u009e\u0089\u0094", objArr);
            throw new java.security.InvalidParameterException(java.lang.String.format(locale, ((java.lang.String) objArr[0]).intern(), 2));
        }
        this.SequenceCounter = str;
        int i2 = ReplenishRequest + 15;
        getTokenInfo = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public void setAppTransactionCounter(java.lang.String str) {
        ReplenishRequest = (getTokenInfo + 85) % 128;
        if (str.length() != 4) {
            java.util.Locale locale = java.util.Locale.US;
            java.lang.Object[] objArr = new java.lang.Object[1];
            b(null, 128 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), null, "    \u008b\u0086\u008c\u008d\u0095\u0087\u009b\u008b\u0089\u009c\u0086\u008b\u009b\u0087\u008b\u0084\u008a\u008c\u008b\u0093\u008a\u0087\u0092\u008b\u008f\u0089\u0086\u0091\u0090\u008b\u0084\u0081\u008b\u0089\u0090\u008b\u0086\u008f\u008e\u008d\u008b\u009f\u0099 ", objArr);
            throw new java.security.InvalidParameterException(java.lang.String.format(locale, ((java.lang.String) objArr[0]).intern(), 4));
        }
        this.AppTransactionCounter = str;
        int i = ReplenishRequest + 13;
        getTokenInfo = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public void setCVV(java.lang.String str) {
        getTokenInfo = (ReplenishRequest + 11) % 128;
        if (str.length() != 3) {
            java.util.Locale locale = java.util.Locale.US;
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(new int[]{-517088139, -2059620601, -1678254515, 1092278771, 1714481137, 226190975, 196612256, 671172326, -979034577, -993799068, 208566025, 1569282525, 189695095, -1604867075}, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 25, objArr);
            throw new java.security.InvalidParameterException(java.lang.String.format(locale, ((java.lang.String) objArr[0]).intern(), 3));
        }
        this.CVV = str;
        getTokenInfo = (ReplenishRequest + 35) % 128;
    }

    public void setReservedBytes(java.lang.String str) {
        int i = getTokenInfo + 69;
        ReplenishRequest = i % 128;
        if (i % 2 == 0 ? str.length() != 8 : str.length() != 88) {
            java.util.Locale locale = java.util.Locale.US;
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(new int[]{1408172088, -2048966685, -2007954964, 749683549, -1847835046, 926006222, 1389074406, -905791493, -834541327, 1795054950, -979753193, 352044403}, (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 22, objArr);
            throw new java.security.InvalidParameterException(java.lang.String.format(locale, ((java.lang.String) objArr[0]).intern(), 8));
        }
        this.VISAResevedBytes = str;
        getTokenInfo = (ReplenishRequest + 25) % 128;
    }

    public java.lang.String getToken() {
        int i = getTokenInfo;
        ReplenishRequest = (i + 7) % 128;
        java.lang.String str = this.Token;
        ReplenishRequest = (i + 71) % 128;
        return str;
    }

    public java.lang.String getTokenExpirationDate() {
        int i = (getTokenInfo + 49) % 128;
        ReplenishRequest = i;
        java.lang.String str = this.TokenExpirationDate;
        getTokenInfo = (i + 91) % 128;
        return str;
    }

    public java.lang.String getServiceCode() {
        int i = getTokenInfo;
        ReplenishRequest = (i + 17) % 128;
        java.lang.String str = this.ServiceCode;
        int i2 = i + 107;
        ReplenishRequest = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    public java.lang.String getTimestamp() {
        int i = getTokenInfo + 31;
        int i2 = i % 128;
        ReplenishRequest = i2;
        if (i % 2 != 0) {
            throw null;
        }
        java.lang.String str = this.Timestamp;
        getTokenInfo = (i2 + 97) % 128;
        return str;
    }

    public java.lang.String getSequenceCounter() {
        int i = getTokenInfo;
        ReplenishRequest = (i + 7) % 128;
        java.lang.String str = this.SequenceCounter;
        ReplenishRequest = (i + 3) % 128;
        return str;
    }

    public java.lang.String getAppTransactionCounter() {
        int i = ReplenishRequest + 45;
        getTokenInfo = i % 128;
        if (i % 2 != 0) {
            return this.AppTransactionCounter;
        }
        throw null;
    }

    public java.lang.String getCVV() {
        int i = ReplenishRequest + 93;
        getTokenInfo = i % 128;
        java.lang.String str = this.CVV;
        if (i % 2 != 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    public java.lang.String getReservedBytes() {
        int i = ReplenishRequest;
        getTokenInfo = (i + 9) % 128;
        java.lang.String str = this.VISAResevedBytes;
        getTokenInfo = (i + 71) % 128;
        return str;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(new int[]{2013763977, -616228835, 1512002805, 84260353}, 6 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(this.Token);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(new int[]{884768918, 1074791165, -727465335, 2045669908, 112884616, -1530804283, 786499962, 297916455, 2138100415, 614556323, 2107895340, 1961141619}, 24 - android.text.TextUtils.getOffsetAfter("", 0), objArr2);
        sb.append(((java.lang.String) objArr2[0]).intern());
        sb.append(this.TokenExpirationDate);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a(new int[]{1598494234, -1333739203, 581767857, 1039565285, 1970128288, -8270718, -1336940043, 1329351492}, android.graphics.Color.argb(0, 0, 0, 0) + 16, objArr3);
        sb.append(((java.lang.String) objArr3[0]).intern());
        sb.append(this.ServiceCode);
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a(new int[]{884768918, 1074791165, 578960621, 1023608586, 1033396136, 1224528990, -122518542, 1120070139}, android.graphics.ImageFormat.getBitsPerPixel(0) + 15, objArr4);
        sb.append(((java.lang.String) objArr4[0]).intern());
        sb.append(this.Timestamp);
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        a(new int[]{1598494234, -1333739203, -1711337815, 1333326330, 1855276158, -1449752410, 2022104778, 1301063132, -1474623006, -467357428}, 20 - (android.os.Process.myPid() >> 22), objArr5);
        sb.append(((java.lang.String) objArr5[0]).intern());
        sb.append(this.SequenceCounter);
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        a(new int[]{177688898, -47375064, -846890663, -1430322944, 2119762525, 2118254375, 1938018663, 1587537073, 664634492, 366441778, -2058385423, 548471963, -122518542, 1120070139}, android.graphics.ImageFormat.getBitsPerPixel(0) + 27, objArr6);
        sb.append(((java.lang.String) objArr6[0]).intern());
        sb.append(this.AppTransactionCounter);
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        b(null, 127 - android.view.View.resolveSizeAndState(0, 0, 0), null, "\u008b£¢¢\u009f\u008b¡\u008b", objArr7);
        sb.append(((java.lang.String) objArr7[0]).intern());
        sb.append(this.CVV);
        java.lang.Object[] objArr8 = new java.lang.Object[1];
        a(new int[]{-1310047240, 64052873, -288030815, 1446060804, -1956574725, -1915385966, 1448150459, -1685632936, 668259215, 553226404, -262474932, -716230130}, 21 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr8);
        sb.append(((java.lang.String) objArr8[0]).intern());
        sb.append(this.VISAResevedBytes);
        java.lang.String obj = sb.toString();
        int i = getTokenInfo + 23;
        ReplenishRequest = i % 128;
        if (i % 2 == 0) {
            return obj;
        }
        throw new java.lang.ArithmeticException();
    }

    private static void a(int[] iArr, int i, java.lang.Object[] objArr) {
        int i2;
        int[] iArr2;
        int length;
        int[] iArr3;
        com.visa.cbp.getTokenInfo gettokeninfo = new com.visa.cbp.getTokenInfo();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr4 = values;
        int i3 = 1;
        int i4 = 0;
        if (iArr4 != null) {
            int i5 = $10 + 1;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                length = iArr4.length;
                iArr3 = new int[length];
            } else {
                length = iArr4.length;
                iArr3 = new int[length];
            }
            for (int i6 = 0; i6 < length; i6++) {
                $11 = ($10 + 63) % 128;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(iArr4[i6])};
                    java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(785952856);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (59818 - ((android.os.Process.getThreadPriority(0) + 20) >> 6)), 999 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), android.graphics.Color.red(0) + 35);
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        c((short) 0, (short) 15, (short) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(785952856, obj);
                    }
                    iArr3[i6] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr4 = iArr3;
        }
        int length2 = iArr4.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = values;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i7 = 0;
            while (i7 < length3) {
                try {
                    java.lang.Object[] objArr4 = new java.lang.Object[i3];
                    objArr4[i4] = java.lang.Integer.valueOf(iArr6[i7]);
                    java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(785952856);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (59817 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i4)), 1000 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), android.graphics.Color.alpha(i4) + 35);
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        iArr2 = iArr6;
                        c((short) 0, (short) 15, (short) 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(785952856, obj2);
                    } else {
                        iArr2 = iArr6;
                    }
                    iArr7[i7] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).intValue();
                    i7++;
                    iArr6 = iArr2;
                    i3 = 1;
                    i4 = 0;
                } catch (java.lang.Throwable th2) {
                    java.lang.Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            i2 = i4;
            iArr6 = iArr7;
        } else {
            i2 = 0;
        }
        java.lang.System.arraycopy(iArr6, i2, iArr5, i2, length2);
        gettokeninfo.valueOf = i2;
        while (gettokeninfo.valueOf < iArr.length) {
            $11 = ($10 + 39) % 128;
            cArr[0] = (char) (iArr[gettokeninfo.valueOf] >> 16);
            cArr[1] = (char) iArr[gettokeninfo.valueOf];
            cArr[2] = (char) (iArr[gettokeninfo.valueOf + 1] >> 16);
            cArr[3] = (char) iArr[gettokeninfo.valueOf + 1];
            gettokeninfo.BuildConfig = (cArr[0] << 16) + cArr[1];
            gettokeninfo.ReplenishAckRequest = (cArr[2] << 16) + cArr[3];
            com.visa.cbp.getTokenInfo.BuildConfig(iArr5);
            int i8 = 0;
            while (i8 < 16) {
                gettokeninfo.BuildConfig ^= iArr5[i8];
                try {
                    java.lang.Object[] objArr6 = {gettokeninfo, java.lang.Integer.valueOf(com.visa.cbp.getTokenInfo.ReplenishAckRequest(gettokeninfo.BuildConfig)), gettokeninfo, gettokeninfo};
                    java.lang.Object obj3 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-206949328);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((-16777216) - android.graphics.Color.rgb(0, 0, 0)), 727 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 35 - android.text.TextUtils.getOffsetAfter("", 0));
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        c((short) 0, (short) 14, (short) 0, objArr7);
                        obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-206949328, obj3);
                    }
                    int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).intValue();
                    gettokeninfo.BuildConfig = gettokeninfo.ReplenishAckRequest;
                    gettokeninfo.ReplenishAckRequest = intValue;
                    i8++;
                    $11 = ($10 + 29) % 128;
                } catch (java.lang.Throwable th3) {
                    java.lang.Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            int i9 = gettokeninfo.BuildConfig;
            gettokeninfo.BuildConfig = gettokeninfo.ReplenishAckRequest;
            gettokeninfo.ReplenishAckRequest = i9;
            gettokeninfo.ReplenishAckRequest ^= iArr5[16];
            gettokeninfo.BuildConfig ^= iArr5[17];
            int i10 = gettokeninfo.BuildConfig;
            int i11 = gettokeninfo.ReplenishAckRequest;
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
                    java.lang.Class cls4 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.view.ViewConfiguration.getTapTimeout() >> 16), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 567, 33 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    c((short) 0, (short) 13, (short) 0, objArr9);
                    obj4 = cls4.getMethod((java.lang.String) objArr9[0], java.lang.Object.class, java.lang.Object.class);
                    com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-1626240057, obj4);
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
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    private static void b(java.lang.String str, int i, int[] iArr, java.lang.String str2, java.lang.Object[] objArr) {
        java.lang.String str3 = str2;
        int i2 = $10 + 69;
        $11 = i2 % 128;
        byte[] bArr = str3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (str3 != null) {
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.visa.cbp.setMac setmac = new com.visa.cbp.setMac();
        char[] cArr = BuildConfig;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i3])};
                    java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1013896520);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((android.os.Process.myTid() >> 22) + 30832), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 1971, 29 - android.view.View.MeasureSpec.getSize(0))).getMethod("m", java.lang.Integer.TYPE);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1013896520, obj);
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
            java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(ConfirmReplenishRequest)};
            java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(892366433);
            if (obj2 == null) {
                java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) android.graphics.Color.argb(0, 0, 0, 0), 959 - android.view.KeyEvent.getDeadChar(0, 0), 21 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                c((short) 0, (short) 5, (short) 0, objArr4);
                obj2 = cls.getMethod((java.lang.String) objArr4[0], java.lang.Integer.TYPE);
                com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(892366433, obj2);
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
            if (valueOf) {
                $10 = ($11 + 87) % 128;
                setmac.BuildConfig = bArr2.length;
                char[] cArr3 = new char[setmac.BuildConfig];
                setmac.valueOf = 0;
                while (setmac.valueOf < setmac.BuildConfig) {
                    $10 = ($11 + 61) % 128;
                    cArr3[setmac.valueOf] = (char) (cArr[bArr2[(setmac.BuildConfig - 1) - setmac.valueOf] + i] - intValue);
                    try {
                        java.lang.Object[] objArr5 = {setmac, setmac};
                        java.lang.Object obj3 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-2053037684);
                        if (obj3 == null) {
                            java.lang.Class cls2 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) android.view.KeyEvent.getDeadChar(0, 0), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 257, android.os.Process.getGidForName("") + 26);
                            java.lang.Object[] objArr6 = new java.lang.Object[1];
                            c((short) 0, (short) 0, (short) 0, objArr6);
                            obj3 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Object.class);
                            com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-2053037684, obj3);
                        }
                        ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                    } catch (java.lang.Throwable th2) {
                        java.lang.Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                objArr[0] = new java.lang.String(cArr3);
                return;
            }
            if (!ReplenishAckRequest) {
                setmac.BuildConfig = iArr.length;
                char[] cArr4 = new char[setmac.BuildConfig];
                setmac.valueOf = 0;
                $10 = ($11 + 5) % 128;
                while (setmac.valueOf < setmac.BuildConfig) {
                    cArr4[setmac.valueOf] = (char) (cArr[iArr[(setmac.BuildConfig - 1) - setmac.valueOf] - i] - intValue);
                    setmac.valueOf++;
                }
                objArr[0] = new java.lang.String(cArr4);
                return;
            }
            setmac.BuildConfig = charArray.length;
            char[] cArr5 = new char[setmac.BuildConfig];
            setmac.valueOf = 0;
            while (setmac.valueOf < setmac.BuildConfig) {
                int i4 = $11 + 45;
                $10 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = setmac.valueOf;
                    int i6 = setmac.BuildConfig;
                    cArr5[i5] = (char) (cArr[charArray[0 % setmac.valueOf] >> i] * intValue);
                    try {
                        java.lang.Object[] objArr7 = {setmac, setmac};
                        java.lang.Object obj4 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-2053037684);
                        if (obj4 == null) {
                            java.lang.Class cls3 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) android.text.TextUtils.getOffsetAfter("", 0), 257 - android.view.KeyEvent.normalizeMetaState(0), android.view.MotionEvent.axisFromString("") + 26);
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            c((short) 0, (short) 0, (short) 0, objArr8);
                            obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Object.class, java.lang.Object.class);
                            com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-2053037684, obj4);
                        }
                        ((java.lang.reflect.Method) obj4).invoke(null, objArr7);
                    } catch (java.lang.Throwable th3) {
                        java.lang.Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } else {
                    cArr5[setmac.valueOf] = (char) (cArr[charArray[(setmac.BuildConfig - 1) - setmac.valueOf] - i] - intValue);
                    try {
                        java.lang.Object[] objArr9 = {setmac, setmac};
                        java.lang.Object obj5 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-2053037684);
                        if (obj5 == null) {
                            java.lang.Class cls4 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.view.ViewConfiguration.getTapTimeout() >> 16), 257 - (android.os.Process.myTid() >> 22), android.view.View.resolveSizeAndState(0, 0, 0) + 25);
                            java.lang.Object[] objArr10 = new java.lang.Object[1];
                            c((short) 0, (short) 0, (short) 0, objArr10);
                            obj5 = cls4.getMethod((java.lang.String) objArr10[0], java.lang.Object.class, java.lang.Object.class);
                            com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-2053037684, obj5);
                        }
                        ((java.lang.reflect.Method) obj5).invoke(null, objArr9);
                    } catch (java.lang.Throwable th4) {
                        java.lang.Throwable cause4 = th4.getCause();
                        if (cause4 == null) {
                            throw th4;
                        }
                        throw cause4;
                    }
                }
            }
            objArr[0] = new java.lang.String(cArr5);
        } catch (java.lang.Throwable th5) {
            java.lang.Throwable cause5 = th5.getCause();
            if (cause5 == null) {
                throw th5;
            }
            throw cause5;
        }
    }

    static void init$0() {
        $$a = new byte[]{com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -77, -6, 88};
        $$b = 31;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ReplenishRequest = 0;
        getTokenInfo = 1;
        values = new int[]{335778182, 142544602, -2136758082, 783224162, -1550300536, -1772117283, -1771885918, 1711555836, -1035222047, 1014538786, -1296286314, 1224248044, 1183034747, -512985500, -315401600, 956078792, 842927950, -1484171170};
        ReplenishAckRequest = true;
        valueOf = true;
        ConfirmReplenishRequest = 514420710;
        BuildConfig = new char[]{28605, 28598, 28586, 28282, 28587, 28266, 28279, 28275, 28285, 28276, 28614, 28281, 28277, 28269, 28267, 28280, 28257, 28274, 28287, 28555, 28264, 28268, 28273, 28283, 28554, 28278, 28284, 28286, 28574, 28265, 28571, 28569, 28258, 28556, 28576};
    }
}
