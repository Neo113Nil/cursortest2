package com.visa.cbp.external;

/* loaded from: classes16.dex */
public final class BuildConfig {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    public static final java.lang.String BUILD_TYPE;
    private static char[] BuildConfig = null;
    private static int ConfirmReplenishRequest = 0;
    public static final boolean DEBUG = false;
    public static final java.lang.String LIBRARY_PACKAGE_NAME;
    public static final java.lang.String jarEnvironment;
    public static final boolean jarForExternalLab = false;
    public static final java.lang.String jarHead;
    public static final java.lang.String jarTimestamp;
    public static final java.lang.String jarType;
    public static final java.lang.String jarVersion;
    public static final boolean showLogs = false;
    private static int valueOf;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, byte b2, byte b3, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3;
        int i4 = 1 - (b2 * 3);
        int i5 = 4 - (b * 2);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            i2 = i5;
            int i6 = i4;
            i3 = 0;
            i5 += i6;
            i2++;
            i = i3;
            i3 = i + 1;
            bArr2[i] = (byte) i5;
            if (i3 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = bArr[i2];
            i5 += i6;
            i2++;
            i = i3;
            i3 = i + 1;
            bArr2[i] = (byte) i5;
            if (i3 == i4) {
            }
        } else {
            int i7 = 100 - b3;
            i = 0;
            i2 = i5;
            i5 = i7;
            i3 = i + 1;
            bArr2[i] = (byte) i5;
            if (i3 == i4) {
            }
        }
    }

    private static void a(boolean z, int[] iArr, java.lang.String str, java.lang.Object[] objArr) {
        int i;
        char[] cArr;
        char c;
        java.lang.String str2 = str;
        byte[] bArr = str2;
        if (str2 != null) {
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        com.visa.cbp.ReplenishResponse replenishResponse = new com.visa.cbp.ReplenishResponse();
        int i2 = 0;
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = BuildConfig;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                $10 = ($11 + 83) % 128;
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    objArr2[i2] = java.lang.Integer.valueOf(cArr2[i7]);
                    java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-586396651);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) android.text.TextUtils.indexOf("", "", i2), 1701 - android.view.KeyEvent.getDeadChar(i2, i2), android.graphics.drawable.Drawable.resolveOpacity(i2, i2) + 19);
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b((byte) 0, (byte) 0, (byte) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-586396651, obj);
                    }
                    cArr3[i7] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i7++;
                    i2 = 0;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i4];
        java.lang.System.arraycopy(cArr2, i3, cArr4, 0, i4);
        if (bArr2 != null) {
            int i8 = $11 + 53;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                cArr = new char[i4];
                replenishResponse.ConfirmReplenishRequest = 1;
                c = 1;
            } else {
                cArr = new char[i4];
                replenishResponse.ConfirmReplenishRequest = 0;
                c = 0;
            }
            while (replenishResponse.ConfirmReplenishRequest < i4) {
                if (bArr2[replenishResponse.ConfirmReplenishRequest] == 1) {
                    int i9 = replenishResponse.ConfirmReplenishRequest;
                    try {
                        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr4[replenishResponse.ConfirmReplenishRequest]), java.lang.Integer.valueOf(c)};
                        java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-718164716);
                        if (obj2 == null) {
                            java.lang.Class cls2 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 1656 - android.graphics.Color.blue(0), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 21);
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            b((byte) 0, (byte) 0, (byte) 1, objArr5);
                            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-718164716, obj2);
                        }
                        cArr[i9] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    } catch (java.lang.Throwable th2) {
                        java.lang.Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i10 = replenishResponse.ConfirmReplenishRequest;
                    try {
                        java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr4[replenishResponse.ConfirmReplenishRequest]), java.lang.Integer.valueOf(c)};
                        java.lang.Object obj3 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-1678831086);
                        if (obj3 == null) {
                            java.lang.Class cls3 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (21017 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16)), 348 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 32);
                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                            b((byte) 0, (byte) 0, (byte) 3, objArr7);
                            obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-1678831086, obj3);
                        }
                        cArr[i10] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                    } catch (java.lang.Throwable th3) {
                        java.lang.Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                c = cArr[replenishResponse.ConfirmReplenishRequest];
                try {
                    java.lang.Object[] objArr8 = {replenishResponse, replenishResponse};
                    java.lang.Object obj4 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(116191609);
                    if (obj4 == null) {
                        obj4 = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.text.TextUtils.getOffsetBefore("", 0) + 59971), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1741, android.view.View.resolveSize(0, 0) + 40)).getMethod(util.h.xy.cb.b.f1091, java.lang.Object.class, java.lang.Object.class);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(116191609, obj4);
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
            cArr4 = cArr;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            i = 0;
            java.lang.System.arraycopy(cArr4, 0, cArr5, 0, i4);
            int i11 = i4 - i6;
            java.lang.System.arraycopy(cArr5, 0, cArr4, i11, i6);
            java.lang.System.arraycopy(cArr5, i6, cArr4, 0, i11);
        } else {
            i = 0;
        }
        if (z) {
            $10 = ($11 + 9) % 128;
            char[] cArr6 = new char[i4];
            while (true) {
                replenishResponse.ConfirmReplenishRequest = i;
                if (replenishResponse.ConfirmReplenishRequest >= i4) {
                    break;
                }
                cArr6[replenishResponse.ConfirmReplenishRequest] = cArr4[(i4 - replenishResponse.ConfirmReplenishRequest) - 1];
                i = replenishResponse.ConfirmReplenishRequest + 1;
            }
            cArr4 = cArr6;
        }
        if (i5 > 0) {
            int i12 = 0;
            while (true) {
                replenishResponse.ConfirmReplenishRequest = i12;
                if (replenishResponse.ConfirmReplenishRequest >= i4) {
                    break;
                }
                cArr4[replenishResponse.ConfirmReplenishRequest] = (char) (cArr4[replenishResponse.ConfirmReplenishRequest] - iArr[2]);
                i12 = replenishResponse.ConfirmReplenishRequest + 1;
            }
        }
        objArr[0] = new java.lang.String(cArr4);
    }

    static void init$0() {
        $$a = new byte[]{116, 57, 7, com.google.common.base.Ascii.ESC};
        $$b = 147;
    }

    static void ConfirmReplenishRequest() {
        BuildConfig = new char[]{26548, 26527, 26526, 26525, 26525, 26562, 26548, 26520, 26520, 26524, 26524, 26521, 26523, 26521, 26520, 26522, 26550, 26523, 26517, 26520, 26598, 26594, 26517, 26594, 26599, 26496, 26593, 26598, 26571, 26475, 26474, 26474, 26479, 26479, 26386, 26566, 26487, 26444, 26387, 26472, 26445, 26444, 26480, 26389, 26390, 26488, 26487, 26477, 26391, 26444, 26436, 26482, 26481, 26446, 26485, 26484};
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        valueOf = 0;
        ConfirmReplenishRequest = 1;
        ConfirmReplenishRequest();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(false, new int[]{0, 5, 0, 1}, "\u0000\u0000\u0000\u0000\u0000", objArr);
        jarVersion = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(true, new int[]{5, 1, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, 1}, "\u0001", objArr2);
        jarType = ((java.lang.String) objArr2[0]).intern();
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a(false, new int[]{6, 10, 0, 0}, "\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000", objArr3);
        jarTimestamp = ((java.lang.String) objArr3[0]).intern();
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a(true, new int[]{16, 9, 0, 5}, "\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001", objArr4);
        jarHead = ((java.lang.String) objArr4[0]).intern();
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        a(true, new int[]{25, 3, 0, 0}, "\u0000\u0000\u0001", objArr5);
        jarEnvironment = ((java.lang.String) objArr5[0]).intern();
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        a(false, new int[]{28, 7, 91, 2}, "\u0000\u0000\u0001\u0001\u0001\u0001\u0000", objArr6);
        BUILD_TYPE = ((java.lang.String) objArr6[0]).intern();
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        a(false, new int[]{35, 21, 114, 0}, "\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001", objArr7);
        LIBRARY_PACKAGE_NAME = ((java.lang.String) objArr7[0]).intern();
        ConfirmReplenishRequest = (valueOf + 65) % 128;
    }
}
