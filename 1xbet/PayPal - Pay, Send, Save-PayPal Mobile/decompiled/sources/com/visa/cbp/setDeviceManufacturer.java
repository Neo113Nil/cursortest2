package com.visa.cbp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes16.dex */
public final class setDeviceManufacturer {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    public static final com.visa.cbp.setDeviceManufacturer BuildConfig;
    private static int Camera2StreamConfigurationMap;
    private static int getHighResolutionOutputSizeshNQ4ISI;
    private static long getHighSpeedVideoFpsRanges;
    private static int getHighSpeedVideoFpsRangesFor;
    private static int getHighSpeedVideoSizes;
    private static final /* synthetic */ com.visa.cbp.setDeviceManufacturer[] getOutputFormats;

    private static void getHighSpeedVideoSizes(int i, java.lang.Object[] objArr) {
        int i2 = (i * 56) + 66;
        byte[] bArr = new byte[1];
        if ($$a == null) {
            i2 = 4;
        }
        bArr[0] = (byte) i2;
        objArr[0] = new java.lang.String(bArr, 0);
    }

    private setDeviceManufacturer(java.lang.String str, int i) {
    }

    public static com.visa.cbp.setDeviceManufacturer valueOf(java.lang.String str) {
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 33) % 128;
        com.visa.cbp.setDeviceManufacturer setdevicemanufacturer = (com.visa.cbp.setDeviceManufacturer) java.lang.Enum.valueOf(com.visa.cbp.setDeviceManufacturer.class, str);
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 109) % 128;
        return setdevicemanufacturer;
    }

    public static com.visa.cbp.setDeviceManufacturer[] values() {
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 63) % 128;
        com.visa.cbp.setDeviceManufacturer[] setdevicemanufacturerArr = (com.visa.cbp.setDeviceManufacturer[]) getOutputFormats.clone();
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 111) % 128;
        return setdevicemanufacturerArr;
    }

    static {
        getHighSpeedVideoFpsRanges();
        getHighSpeedVideoSizes = 0;
        getHighResolutionOutputSizeshNQ4ISI = 1;
        getHighSpeedVideoFpsRangesFor = 0;
        Camera2StreamConfigurationMap = 1;
        getHighResolutionOutputSizeshNQ4ISI();
        int i = -android.os.Process.getGidForName("");
        int i2 = getHighSpeedVideoSizes;
        getHighResolutionOutputSizeshNQ4ISI = (i2 + 81) % 128;
        getHighResolutionOutputSizeshNQ4ISI = (i2 + 121) % 128;
        char[] charArray = "쫷\uf440ꃁ齲쪿ꎌྚ".toCharArray();
        com.visa.cbp.getSignature getsignature = new com.visa.cbp.getSignature();
        char[] valueOf = com.visa.cbp.getSignature.valueOf(getHighSpeedVideoFpsRanges ^ 525091148651277305L, charArray, i);
        getsignature.valueOf = 4;
        while (getsignature.valueOf < valueOf.length) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 39) % 128;
            getsignature.ConfirmReplenishRequest = getsignature.valueOf - 4;
            int i3 = getsignature.valueOf;
            try {
                java.lang.Object[] objArr = {java.lang.Long.valueOf(valueOf[getsignature.valueOf] ^ valueOf[getsignature.valueOf % 4]), java.lang.Long.valueOf(getsignature.ConfirmReplenishRequest), java.lang.Long.valueOf(getHighSpeedVideoFpsRanges)};
                java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-330680783);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) android.graphics.Color.green(0), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1467, android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 28);
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(1, objArr2);
                    obj = cls.getMethod((java.lang.String) objArr2[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                    com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-330680783, obj);
                }
                valueOf[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr)).charValue();
                try {
                    java.lang.Object[] objArr3 = {getsignature, getsignature};
                    java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(81232025);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.view.KeyEvent.getDeadChar(0, 0) + 49745), (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, 29 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        getHighSpeedVideoSizes(0, objArr4);
                        obj2 = cls2.getMethod((java.lang.String) objArr4[0], java.lang.Object.class, java.lang.Object.class);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(81232025, obj2);
                    }
                    ((java.lang.reflect.Method) obj2).invoke(null, objArr3);
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
        }
        com.visa.cbp.setDeviceManufacturer setdevicemanufacturer = new com.visa.cbp.setDeviceManufacturer(new java.lang.String(valueOf, 4, valueOf.length - 4).intern(), 0);
        BuildConfig = setdevicemanufacturer;
        getOutputFormats = new com.visa.cbp.setDeviceManufacturer[]{setdevicemanufacturer};
        int i4 = Camera2StreamConfigurationMap + 19;
        getHighSpeedVideoFpsRangesFor = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        getHighSpeedVideoFpsRanges = 6552108211887144054L;
    }

    static void getHighSpeedVideoFpsRanges() {
        $$a = new byte[]{6, -27, -117, -14};
        $$b = 70;
    }
}
