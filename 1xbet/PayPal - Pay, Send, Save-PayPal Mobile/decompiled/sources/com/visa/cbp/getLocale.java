package com.visa.cbp;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ConfirmReplenishRequest' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class getLocale {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    private static final /* synthetic */ com.visa.cbp.getLocale[] Camera2StreamConfigurationMap;
    public static final com.visa.cbp.getLocale ConfirmReplenishRequest;
    private static boolean getHighResolutionOutputSizeshNQ4ISI;
    private static int getHighSpeedVideoFpsRanges;
    private static int getHighSpeedVideoFpsRangesFor;
    private static char[] getHighSpeedVideoSizes;
    private static int getInputFormats;
    private static int getInputSizeshNQ4ISI;
    private static int getOutputFormats;
    private static boolean getOutputMinFrameDuration;
    public static final com.visa.cbp.getLocale valueOf;

    private static void getHighResolutionOutputSizeshNQ4ISI(int i, java.lang.Object[] objArr) {
        int i2 = 116 - (i * 5);
        byte[] bArr = new byte[1];
        if ($$a == null) {
            i2 = -i2;
        }
        bArr[0] = (byte) i2;
        objArr[0] = new java.lang.String(bArr, 0);
    }

    private getLocale(java.lang.String str, int i) {
    }

    public static com.visa.cbp.getLocale valueOf(java.lang.String str) {
        getInputSizeshNQ4ISI = (getOutputFormats + 35) % 128;
        com.visa.cbp.getLocale getlocale = (com.visa.cbp.getLocale) java.lang.Enum.valueOf(com.visa.cbp.getLocale.class, str);
        getOutputFormats = (getInputSizeshNQ4ISI + 79) % 128;
        return getlocale;
    }

    public static com.visa.cbp.getLocale[] values() {
        int i = getOutputFormats + 101;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        com.visa.cbp.getLocale[] getlocaleArr = (com.visa.cbp.getLocale[]) Camera2StreamConfigurationMap.clone();
        int i2 = getOutputFormats + 67;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            return getlocaleArr;
        }
        throw new java.lang.ArithmeticException();
    }

    static {
        getHighSpeedVideoSizes();
        getHighSpeedVideoFpsRanges = 0;
        getHighSpeedVideoFpsRangesFor = 1;
        getInputSizeshNQ4ISI = 0;
        getOutputFormats = 1;
        getHighSpeedVideoFpsRangesFor();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(128 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), "\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
        com.visa.cbp.getLocale getlocale = new com.visa.cbp.getLocale(((java.lang.String) objArr[0]).intern(), 0);
        ConfirmReplenishRequest = getlocale;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(android.view.View.resolveSizeAndState(0, 0, 0) + 127, "\u0082\u0089\u0081\u0088\u0085\u0084\u0082", objArr2);
        com.visa.cbp.getLocale getlocale2 = new com.visa.cbp.getLocale(((java.lang.String) objArr2[0]).intern(), 1);
        valueOf = getlocale2;
        Camera2StreamConfigurationMap = new com.visa.cbp.getLocale[]{getlocale, getlocale2};
        getOutputFormats = (getInputSizeshNQ4ISI + 97) % 128;
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(int i, java.lang.String str, java.lang.Object[] objArr) {
        int i2 = getHighSpeedVideoFpsRanges + 45;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        byte[] bytes = str.getBytes("ISO-8859-1");
        com.visa.cbp.setMac setmac = new com.visa.cbp.setMac();
        char[] cArr = getHighSpeedVideoSizes;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i3])};
                    java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1013896520);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.view.View.resolveSize(0, 0) + 30832), android.os.Process.getGidForName("") + 1972, 29 - android.text.TextUtils.getOffsetAfter("", 0))).getMethod("m", java.lang.Integer.TYPE);
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
            java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(getInputFormats)};
            java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(892366433);
            if (obj2 == null) {
                java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.os.Process.getGidForName("") + 1), 959 - android.graphics.Color.blue(0), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 20);
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(1, objArr4);
                obj2 = cls.getMethod((java.lang.String) objArr4[0], java.lang.Integer.TYPE);
                com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(892366433, obj2);
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
            if (!getOutputMinFrameDuration) {
                if (!getHighResolutionOutputSizeshNQ4ISI) {
                    throw null;
                }
                throw null;
            }
            setmac.BuildConfig = bytes.length;
            char[] cArr3 = new char[setmac.BuildConfig];
            setmac.valueOf = 0;
            while (setmac.valueOf < setmac.BuildConfig) {
                int i4 = getHighSpeedVideoFpsRanges + 49;
                getHighSpeedVideoFpsRangesFor = i4 % 128;
                if (i4 % 2 == 0) {
                    cArr3[setmac.valueOf] = (char) (cArr[bytes[(setmac.BuildConfig + 1) >>> setmac.valueOf] * i] % intValue);
                    try {
                        java.lang.Object[] objArr5 = {setmac, setmac};
                        java.lang.Object obj3 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-2053037684);
                        if (obj3 == null) {
                            java.lang.Class cls2 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) android.view.KeyEvent.getDeadChar(0, 0), 257 - android.view.Gravity.getAbsoluteGravity(0, 0), 25 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                            java.lang.Object[] objArr6 = new java.lang.Object[1];
                            getHighResolutionOutputSizeshNQ4ISI(0, objArr6);
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
                } else {
                    cArr3[setmac.valueOf] = (char) (cArr[bytes[(setmac.BuildConfig - 1) - setmac.valueOf] + i] - intValue);
                    try {
                        java.lang.Object[] objArr7 = {setmac, setmac};
                        java.lang.Object obj4 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-2053037684);
                        if (obj4 == null) {
                            java.lang.Class cls3 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) android.text.TextUtils.getOffsetBefore("", 0), 257 - android.widget.ExpandableListView.getPackedPositionType(0L), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 25);
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            getHighResolutionOutputSizeshNQ4ISI(0, objArr8);
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
                }
                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 51) % 128;
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

    static void getHighSpeedVideoSizes() {
        $$a = new byte[]{32, -41, 59, -83};
        $$b = 136;
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getHighResolutionOutputSizeshNQ4ISI = true;
        getOutputMinFrameDuration = true;
        getInputFormats = 514420717;
        getHighSpeedVideoSizes = new char[]{28574, 28561, 28570, 28575, 28588, 28578, 28576, 28571, 28580};
    }
}
