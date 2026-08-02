package com.visa.cbp.sdk.facade;

/* loaded from: classes5.dex */
public class DasDeviceInfo {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int BuildConfig;
    private static int ConfirmReplenishRequest;
    private static boolean ReplenishAckRequest;
    private static int getTvls;
    private static boolean valueOf;
    private static char[] values;
    private java.lang.String deviceBrand;
    private java.lang.String deviceManufacturer;
    private java.lang.String deviceModel;
    private java.lang.String deviceName;
    private java.lang.String deviceType;
    private java.lang.String osType;
    private java.lang.String osVersion;
    private java.lang.String phoneNumber;
    private java.lang.String productCode = com.visa.cbp.DeviceInfo.setTokenInfo;
    private java.lang.String productVersion;

    private static void b(int i, int i2, short s, java.lang.Object[] objArr) {
        int i3 = s * 2;
        byte[] bArr = $$a;
        int i4 = 116 - (i2 * 5);
        int i5 = i + 4;
        byte[] bArr2 = new byte[i3 + 1];
        int i6 = -1;
        if (bArr == null) {
            i4 = i5 + (-i3);
            i5 = i5;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i4;
            int i7 = i5 + 1;
            if (i6 == i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            } else {
                i4 += -bArr[i7];
                i5 = i7;
            }
        }
    }

    public DasDeviceInfo() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(126 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), null, null, "\u0084\u0082\u0083\u0082\u0081", objArr);
        this.productVersion = ((java.lang.String) objArr[0]).intern();
    }

    public java.lang.String getOsType() {
        int i = getTvls + 27;
        int i2 = i % 128;
        BuildConfig = i2;
        if (i % 2 != 0) {
            throw null;
        }
        java.lang.String str = this.osType;
        getTvls = (i2 + 11) % 128;
        return str;
    }

    public void setOsType(java.lang.String str) {
        int i = getTvls;
        BuildConfig = (i + 47) % 128;
        this.osType = str;
        int i2 = i + 97;
        BuildConfig = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    public java.lang.String getOsVersion() {
        int i = BuildConfig;
        int i2 = i + 7;
        getTvls = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        java.lang.String str = this.osVersion;
        int i3 = i + 97;
        getTvls = i3 % 128;
        if (i3 % 2 != 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    public void setOsVersion(java.lang.String str) {
        int i = BuildConfig;
        getTvls = (i + 95) % 128;
        this.osVersion = str;
        int i2 = i + 27;
        getTvls = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public java.lang.String getDeviceType() {
        int i = BuildConfig + 49;
        getTvls = i % 128;
        java.lang.String str = this.deviceType;
        if (i % 2 != 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    public void setDeviceType(java.lang.String str) {
        int i = (getTvls + 101) % 128;
        BuildConfig = i;
        this.deviceType = str;
        getTvls = (i + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
    }

    public java.lang.String getDeviceManufacturer() {
        int i = getTvls;
        BuildConfig = (i + 81) % 128;
        java.lang.String str = this.deviceManufacturer;
        BuildConfig = (i + 103) % 128;
        return str;
    }

    public void setDeviceManufacturer(java.lang.String str) {
        int i = (getTvls + 55) % 128;
        BuildConfig = i;
        this.deviceManufacturer = str;
        int i2 = i + 105;
        getTvls = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public java.lang.String getDeviceBrand() {
        int i = getTvls;
        BuildConfig = (i + 91) % 128;
        java.lang.String str = this.deviceBrand;
        BuildConfig = (i + 111) % 128;
        return str;
    }

    public void setDeviceBrand(java.lang.String str) {
        int i = getTvls;
        int i2 = i + 11;
        BuildConfig = i2 % 128;
        this.deviceBrand = str;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i3 = i + 93;
        BuildConfig = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public java.lang.String getDeviceModel() {
        int i = BuildConfig + 81;
        getTvls = i % 128;
        if (i % 2 != 0) {
            return this.deviceModel;
        }
        throw null;
    }

    public void setDeviceModel(java.lang.String str) {
        int i = BuildConfig + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        getTvls = i % 128;
        this.deviceModel = str;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    public java.lang.String getDeviceName() {
        int i = getTvls;
        int i2 = i + 63;
        BuildConfig = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        java.lang.String str = this.deviceName;
        BuildConfig = (i + 15) % 128;
        return str;
    }

    public void setDeviceName(java.lang.String str) {
        int i = BuildConfig + 79;
        getTvls = i % 128;
        this.deviceName = str;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    public java.lang.String getPhoneNumber() {
        int i = getTvls + 43;
        int i2 = i % 128;
        BuildConfig = i2;
        if (i % 2 != 0) {
            throw null;
        }
        java.lang.String str = this.phoneNumber;
        getTvls = (i2 + 29) % 128;
        return str;
    }

    public void setPhoneNumber(java.lang.String str) {
        int i = getTvls;
        BuildConfig = (i + 77) % 128;
        this.phoneNumber = str;
        int i2 = i + 5;
        BuildConfig = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static void a(int i, int[] iArr, java.lang.String str, java.lang.String str2, java.lang.Object[] objArr) {
        char[] cArr;
        java.lang.String str3 = str2;
        byte[] bArr = str3;
        if (str3 != null) {
            int i2 = $10 + 37;
            $11 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        if (str != null) {
            $10 = ($11 + 15) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.visa.cbp.setMac setmac = new com.visa.cbp.setMac();
        char[] cArr3 = values;
        long j = 0;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i3])};
                    java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1013896520);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.widget.ExpandableListView.getPackedPositionType(j) + 30832), 1971 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 29 - (android.view.ViewConfiguration.getTouchSlop() >> 8))).getMethod("m", java.lang.Integer.TYPE);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1013896520, obj);
                    }
                    cArr4[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i3++;
                    j = 0;
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
        try {
            java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(ConfirmReplenishRequest)};
            java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(892366433);
            if (obj2 == null) {
                java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 959, 19 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0));
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                b(-1, 1, (short) 0, objArr4);
                obj2 = cls.getMethod((java.lang.String) objArr4[0], java.lang.Integer.TYPE);
                com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(892366433, obj2);
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
            if (valueOf) {
                setmac.BuildConfig = bArr2.length;
                char[] cArr5 = new char[setmac.BuildConfig];
                setmac.valueOf = 0;
                $10 = ($11 + 29) % 128;
                while (setmac.valueOf < setmac.BuildConfig) {
                    cArr5[setmac.valueOf] = (char) (cArr3[bArr2[(setmac.BuildConfig - 1) - setmac.valueOf] + i] - intValue);
                    try {
                        java.lang.Object[] objArr5 = {setmac, setmac};
                        java.lang.Object obj3 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-2053037684);
                        if (obj3 == null) {
                            java.lang.Class cls2 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), 257 - android.view.View.combineMeasuredStates(0, 0), android.graphics.Color.red(0) + 25);
                            java.lang.Object[] objArr6 = new java.lang.Object[1];
                            b(-1, 0, (short) 0, objArr6);
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
                objArr[0] = new java.lang.String(cArr5);
                return;
            }
            if (!ReplenishAckRequest) {
                setmac.BuildConfig = iArr.length;
                char[] cArr6 = new char[setmac.BuildConfig];
                setmac.valueOf = 0;
                while (setmac.valueOf < setmac.BuildConfig) {
                    $10 = ($11 + 3) % 128;
                    cArr6[setmac.valueOf] = (char) (cArr3[iArr[(setmac.BuildConfig - 1) - setmac.valueOf] - i] - intValue);
                    setmac.valueOf++;
                }
                java.lang.String str4 = new java.lang.String(cArr6);
                int i4 = $10 + 59;
                $11 = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
                objArr[0] = str4;
                return;
            }
            setmac.BuildConfig = cArr2.length;
            char[] cArr7 = new char[setmac.BuildConfig];
            setmac.valueOf = 0;
            while (setmac.valueOf < setmac.BuildConfig) {
                cArr7[setmac.valueOf] = (char) (cArr3[cArr2[(setmac.BuildConfig - 1) - setmac.valueOf] - i] - intValue);
                try {
                    java.lang.Object[] objArr7 = {setmac, setmac};
                    java.lang.Object obj4 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-2053037684);
                    if (obj4 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) android.view.View.combineMeasuredStates(0, 0), 257 - android.text.TextUtils.getOffsetAfter("", 0), android.graphics.Color.alpha(0) + 25);
                        java.lang.Object[] objArr8 = new java.lang.Object[1];
                        b(-1, 0, (short) 0, objArr8);
                        obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Object.class, java.lang.Object.class);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-2053037684, obj4);
                    }
                    ((java.lang.reflect.Method) obj4).invoke(null, objArr7);
                    $10 = ($11 + 53) % 128;
                } catch (java.lang.Throwable th3) {
                    java.lang.Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            objArr[0] = new java.lang.String(cArr7);
        } catch (java.lang.Throwable th4) {
            java.lang.Throwable cause4 = th4.getCause();
            if (cause4 == null) {
                throw th4;
            }
            throw cause4;
        }
    }

    static void init$0() {
        $$a = new byte[]{com.google.common.base.Ascii.GS, 77, 63, -79};
        $$b = 49;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        BuildConfig = 0;
        getTvls = 1;
        ReplenishAckRequest = true;
        valueOf = true;
        ConfirmReplenishRequest = 514420535;
        values = new char[]{28669, 28421, 28667, 28423};
    }
}
