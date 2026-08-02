package com.visa.cbp.external.common;

/* loaded from: classes5.dex */
public class DeviceCert {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static boolean BuildConfig;
    private static char[] ConfirmReplenishRequest;
    private static boolean ReplenishAckRequest;
    private static int setTokenInfo;
    private static int valueOf;
    private static int values;
    private java.lang.String certFormat;
    private java.lang.String certUsage;
    private java.lang.String certValue;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:4:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, int i, short s, java.lang.Object[] objArr) {
        int i2;
        int i3 = 3 - (i * 4);
        int i4 = 116 - (b * 5);
        int i5 = s * 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        if (bArr == null) {
            int i7 = i3;
            int i8 = i6;
            int i9 = 0;
            i4 = (-i4) + i8;
            i3 = i7;
            i2 = i9;
            int i10 = i3 + 1;
            bArr2[i2] = (byte) i4;
            i9 = i2 + 1;
            if (i2 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i11 = bArr[i10];
            i8 = i4;
            i4 = i11;
            i7 = i10;
            i4 = (-i4) + i8;
            i3 = i7;
            i2 = i9;
            int i102 = i3 + 1;
            bArr2[i2] = (byte) i4;
            i9 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            int i1022 = i3 + 1;
            bArr2[i2] = (byte) i4;
            i9 = i2 + 1;
            if (i2 == i6) {
            }
        }
    }

    public void init(java.lang.String str, java.lang.String str2) {
        java.lang.Object obj;
        int i = setTokenInfo + 1;
        values = i % 128;
        if (i % 2 != 0) {
            this.certUsage = str;
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(61 - (android.view.ViewConfiguration.getScrollBarFadeDuration() % 45), null, null, "\u0084\u0083\u0082\u0081", objArr);
            obj = objArr[0];
        } else {
            this.certUsage = str;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 127, null, null, "\u0084\u0083\u0082\u0081", objArr2);
            obj = objArr2[0];
        }
        this.certFormat = ((java.lang.String) obj).intern();
        this.certValue = str2;
        int i2 = setTokenInfo + 73;
        values = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public java.lang.String getCertUsage() {
        int i = setTokenInfo;
        values = (i + 37) % 128;
        java.lang.String str = this.certUsage;
        values = (i + 83) % 128;
        return str;
    }

    public void setCertUsage(java.lang.String str) {
        int i = (values + 65) % 128;
        setTokenInfo = i;
        this.certUsage = str;
        values = (i + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
    }

    public java.lang.String getCertFormat() {
        int i = setTokenInfo + 55;
        int i2 = i % 128;
        values = i2;
        if (i % 2 != 0) {
            throw null;
        }
        java.lang.String str = this.certFormat;
        int i3 = i2 + 81;
        setTokenInfo = i3 % 128;
        if (i3 % 2 != 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    public void setCertFormat(java.lang.String str) {
        int i = setTokenInfo + 115;
        values = i % 128;
        this.certFormat = str;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public java.lang.String getCertValue() {
        int i = values + 103;
        setTokenInfo = i % 128;
        java.lang.String str = this.certValue;
        if (i % 2 != 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    public void setCertValue(java.lang.String str) {
        int i = values;
        setTokenInfo = (i + 17) % 128;
        this.certValue = str;
        int i2 = i + 125;
        setTokenInfo = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    private static void a(int i, int[] iArr, java.lang.String str, java.lang.String str2, java.lang.Object[] objArr) {
        java.lang.String str3 = str2;
        byte[] bArr = str3;
        if (str3 != null) {
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.visa.cbp.setMac setmac = new com.visa.cbp.setMac();
        char[] cArr = ConfirmReplenishRequest;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i2 = 0; i2 < length; i2++) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i2])};
                    java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1013896520);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (30832 - android.view.View.MeasureSpec.getSize(0)), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1971, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 29)).getMethod("m", java.lang.Integer.TYPE);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1013896520, obj);
                    }
                    cArr2[i2] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
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
            java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(valueOf)};
            java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(892366433);
            long j = 0;
            if (obj2 == null) {
                java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) android.widget.ExpandableListView.getPackedPositionType(0L), 959 - android.view.KeyEvent.keyCodeFromString(""), android.view.View.MeasureSpec.getSize(0) + 20);
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                b((byte) 1, 0, (short) 0, objArr4);
                obj2 = cls.getMethod((java.lang.String) objArr4[0], java.lang.Integer.TYPE);
                com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(892366433, obj2);
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
            if (ReplenishAckRequest) {
                $11 = ($10 + 9) % 128;
                setmac.BuildConfig = bArr2.length;
                char[] cArr3 = new char[setmac.BuildConfig];
                setmac.valueOf = 0;
                $11 = ($10 + 79) % 128;
                while (setmac.valueOf < setmac.BuildConfig) {
                    cArr3[setmac.valueOf] = (char) (cArr[bArr2[(setmac.BuildConfig - 1) - setmac.valueOf] + i] - intValue);
                    try {
                        java.lang.Object[] objArr5 = {setmac, setmac};
                        java.lang.Object obj3 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-2053037684);
                        if (obj3 == null) {
                            java.lang.Class cls2 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 257 - android.graphics.Color.red(0), android.graphics.Color.alpha(0) + 25);
                            java.lang.Object[] objArr6 = new java.lang.Object[1];
                            b((byte) 0, 0, (short) 0, objArr6);
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
            if (!BuildConfig) {
                setmac.BuildConfig = iArr.length;
                char[] cArr4 = new char[setmac.BuildConfig];
                setmac.valueOf = 0;
                while (setmac.valueOf < setmac.BuildConfig) {
                    cArr4[setmac.valueOf] = (char) (cArr[iArr[(setmac.BuildConfig - 1) - setmac.valueOf] - i] - intValue);
                    setmac.valueOf++;
                }
                java.lang.String str4 = new java.lang.String(cArr4);
                int i3 = $11 + 105;
                $10 = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
                objArr[0] = str4;
                return;
            }
            setmac.BuildConfig = charArray.length;
            char[] cArr5 = new char[setmac.BuildConfig];
            setmac.valueOf = 0;
            while (setmac.valueOf < setmac.BuildConfig) {
                int i4 = $11 + 21;
                $10 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = setmac.valueOf;
                    int i6 = setmac.BuildConfig;
                    int i7 = setmac.valueOf;
                    cArr5[i5] = (char) (cArr[charArray[0] - i] / intValue);
                    try {
                        java.lang.Object[] objArr7 = {setmac, setmac};
                        java.lang.Object obj4 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-2053037684);
                        if (obj4 == null) {
                            java.lang.Class cls3 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) android.graphics.Color.alpha(0), 257 - android.text.TextUtils.getOffsetAfter("", 0), 24 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)));
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            b((byte) 0, 0, (short) 0, objArr8);
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
                            java.lang.Class cls4 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1), 257 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 26);
                            java.lang.Object[] objArr10 = new java.lang.Object[1];
                            b((byte) 0, 0, (short) 0, objArr10);
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
                $11 = ($10 + 33) % 128;
                j = 0;
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
        $$a = new byte[]{56, com.google.common.base.Ascii.DC4, com.visa.cbp.getEncExpo.IResultReceiver2, -51};
        $$b = 18;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        values = 0;
        setTokenInfo = 1;
        BuildConfig = true;
        ReplenishAckRequest = true;
        valueOf = 514420519;
        ConfirmReplenishRequest = new char[]{28623, 28650, 28663, 28654};
    }
}
