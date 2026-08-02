package com.visa.cbp;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'values' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class getCertValue {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    public static final com.visa.cbp.getCertValue BuildConfig;
    private static long Camera2StreamConfigurationMap;
    public static final com.visa.cbp.getCertValue ConfirmReplenishRequest;
    public static final com.visa.cbp.getCertValue ReplenishAckRequest;
    public static final com.visa.cbp.getCertValue ReplenishRequest;
    private static int getHighResolutionOutputSizeshNQ4ISI;
    private static int getHighSpeedVideoFpsRanges;
    private static int getHighSpeedVideoFpsRangesFor;
    private static int getHighSpeedVideoSizesFor;
    private static char[] getInputFormats;
    private static final java.util.HashMap<java.lang.String, com.visa.cbp.getCertValue> getInputSizeshNQ4ISI;
    private static final /* synthetic */ com.visa.cbp.getCertValue[] getOutputFormats;
    public static final com.visa.cbp.getCertValue setTokenInfo;
    public static final com.visa.cbp.getCertValue valueOf;
    public static final com.visa.cbp.getCertValue values;
    java.lang.String getHighSpeedVideoSizes;

    private static void Camera2StreamConfigurationMap(int i, java.lang.Object[] objArr) {
        int i2 = 106 - i;
        byte[] bArr = new byte[1];
        if ($$a == null) {
            i2 = 3;
        }
        bArr[0] = (byte) i2;
        objArr[0] = new java.lang.String(bArr, 0);
    }

    public static com.visa.cbp.getCertValue valueOf(java.lang.String str) {
        int i = getHighSpeedVideoFpsRanges + 79;
        getHighSpeedVideoSizesFor = i % 128;
        com.visa.cbp.getCertValue getcertvalue = (com.visa.cbp.getCertValue) java.lang.Enum.valueOf(com.visa.cbp.getCertValue.class, str);
        if (i % 2 == 0) {
            return getcertvalue;
        }
        throw null;
    }

    public static com.visa.cbp.getCertValue[] values() {
        int i = getHighSpeedVideoFpsRanges + 91;
        getHighSpeedVideoSizesFor = i % 128;
        com.visa.cbp.getCertValue[] getcertvalueArr = getOutputFormats;
        if (i % 2 == 0) {
            return (com.visa.cbp.getCertValue[]) getcertvalueArr.clone();
        }
        throw null;
    }

    static {
        Camera2StreamConfigurationMap();
        getHighResolutionOutputSizeshNQ4ISI = 0;
        getHighSpeedVideoFpsRangesFor = 1;
        getHighSpeedVideoSizesFor = 0;
        getHighSpeedVideoFpsRanges = 1;
        getHighSpeedVideoFpsRanges();
        com.visa.cbp.getCertValue getcertvalue = new com.visa.cbp.getCertValue("DEV", 0, "DEV");
        ReplenishAckRequest = getcertvalue;
        com.visa.cbp.getCertValue getcertvalue2 = new com.visa.cbp.getCertValue("QA", 1, "QA");
        ConfirmReplenishRequest = getcertvalue2;
        com.visa.cbp.getCertValue getcertvalue3 = new com.visa.cbp.getCertValue("CERT", 2, "CERT");
        BuildConfig = getcertvalue3;
        com.visa.cbp.getCertValue getcertvalue4 = new com.visa.cbp.getCertValue("AACERT", 3, "AACERT");
        valueOf = getcertvalue4;
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap((char) android.view.View.resolveSize(0, 0), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1, 2 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        Camera2StreamConfigurationMap((char) android.graphics.drawable.Drawable.resolveOpacity(0, 0), 1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), android.view.View.resolveSizeAndState(0, 0, 0) + 3, objArr2);
        com.visa.cbp.getCertValue getcertvalue5 = new com.visa.cbp.getCertValue(intern, 4, ((java.lang.String) objArr2[0]).intern());
        values = getcertvalue5;
        com.visa.cbp.getCertValue getcertvalue6 = new com.visa.cbp.getCertValue("PROD", 5, "PROD");
        ReplenishRequest = getcertvalue6;
        com.visa.cbp.getCertValue getcertvalue7 = new com.visa.cbp.getCertValue("TEST", 6, "QA");
        setTokenInfo = getcertvalue7;
        getOutputFormats = new com.visa.cbp.getCertValue[]{getcertvalue, getcertvalue2, getcertvalue3, getcertvalue4, getcertvalue5, getcertvalue6, getcertvalue7};
        getInputSizeshNQ4ISI = new java.util.HashMap<>();
        int i = getHighSpeedVideoFpsRanges + 15;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private getCertValue(java.lang.String str, int i, java.lang.String str2) {
        this.getHighSpeedVideoSizes = str2;
    }

    public static com.visa.cbp.getCertValue ReplenishAckRequest(java.lang.String str) {
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizesFor + 37) % 128;
        com.visa.cbp.getCertValue getcertvalue = getInputSizeshNQ4ISI.get(str);
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizesFor + 99) % 128;
        return getcertvalue;
    }

    public static java.util.ArrayList<com.visa.cbp.getCertValue> BuildConfig(java.lang.String str) {
        java.util.ArrayList<com.visa.cbp.getCertValue> arrayList = new java.util.ArrayList<>();
        for (com.visa.cbp.getCertValue getcertvalue : values()) {
            getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRanges + 105) % 128;
            if (getcertvalue.getHighSpeedVideoSizes.equalsIgnoreCase(str)) {
                arrayList.add(getcertvalue);
                int i = getHighSpeedVideoSizesFor + 13;
                getHighSpeedVideoFpsRanges = i % 128;
                if (i % 2 == 0) {
                    int i2 = 3 / 2;
                }
            }
        }
        return arrayList;
    }

    private static void Camera2StreamConfigurationMap(char c, int i, int i2, java.lang.Object[] objArr) {
        com.visa.cbp.ReplenishRequest replenishRequest = new com.visa.cbp.ReplenishRequest();
        long[] jArr = new long[i2];
        replenishRequest.ConfirmReplenishRequest = 0;
        while (replenishRequest.ConfirmReplenishRequest < i2) {
            int i3 = replenishRequest.ConfirmReplenishRequest;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(getInputFormats[i + replenishRequest.ConfirmReplenishRequest])};
                java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(892187687);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.graphics.Color.rgb(0, 0, 0) + 16777216), android.view.View.combineMeasuredStates(0, 0) + 959, android.graphics.Color.argb(0, 0, 0, 0) + 20);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap(1, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                    com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(892187687, obj);
                }
                try {
                    java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(replenishRequest.ConfirmReplenishRequest), java.lang.Long.valueOf(Camera2StreamConfigurationMap), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1110765441);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ('0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), android.view.View.MeasureSpec.getSize(0) + 257, (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 25);
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap(2, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1110765441, obj2);
                    }
                    jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                    try {
                        java.lang.Object[] objArr6 = {replenishRequest, replenishRequest};
                        java.lang.Object obj3 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1527286825);
                        if (obj3 == null) {
                            java.lang.Class cls3 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (((android.os.Process.getThreadPriority(0) + 20) >> 6) + 44626), 1566 - android.text.TextUtils.getCapsMode("", 0, 0), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 18);
                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap(0, objArr7);
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
        char[] cArr = new char[i2];
        replenishRequest.ConfirmReplenishRequest = 0;
        while (replenishRequest.ConfirmReplenishRequest < i2) {
            cArr[replenishRequest.ConfirmReplenishRequest] = (char) jArr[replenishRequest.ConfirmReplenishRequest];
            try {
                java.lang.Object[] objArr8 = {replenishRequest, replenishRequest};
                java.lang.Object obj4 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1527286825);
                if (obj4 == null) {
                    java.lang.Class cls4 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 44625), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 1566, 19 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap(0, objArr9);
                    obj4 = cls4.getMethod((java.lang.String) objArr9[0], java.lang.Object.class, java.lang.Object.class);
                    com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1527286825, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 77) % 128;
            } catch (java.lang.Throwable th4) {
                java.lang.Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        java.lang.String str = new java.lang.String(cArr);
        int i4 = getHighResolutionOutputSizeshNQ4ISI + 45;
        getHighSpeedVideoFpsRangesFor = i4 % 128;
        if (i4 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        objArr[0] = str;
    }

    static void getHighSpeedVideoFpsRanges() {
        getInputFormats = new char[]{44133, 33848, 64758};
        Camera2StreamConfigurationMap = -6386023908417829766L;
    }

    static void Camera2StreamConfigurationMap() {
        $$a = new byte[]{com.google.common.base.Ascii.DC4, -102, 91, -113};
        $$b = 8;
    }
}
