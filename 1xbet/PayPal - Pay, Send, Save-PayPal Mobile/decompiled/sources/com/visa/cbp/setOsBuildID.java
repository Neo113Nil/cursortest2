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
/* loaded from: classes16.dex */
public final class setOsBuildID {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    public static final com.visa.cbp.setOsBuildID BuildConfig;
    private static int Camera2StreamConfigurationMap;
    public static final com.visa.cbp.setOsBuildID ConfirmReplenishRequest;
    private static int getHighResolutionOutputSizeshNQ4ISI;
    private static int getHighSpeedVideoFpsRanges;
    private static int getHighSpeedVideoFpsRangesFor;
    private static int getHighSpeedVideoSizes;
    private static short[] getHighSpeedVideoSizesFor;
    private static final /* synthetic */ com.visa.cbp.setOsBuildID[] getInputFormats;
    private static int getInputSizeshNQ4ISI;
    private static byte[] getOutputFormats;
    private static int getOutputMinFrameDuration;

    private static void getHighSpeedVideoFpsRanges(byte b, java.lang.Object[] objArr) {
        int i = b * 8;
        int i2 = i + 113;
        byte[] bArr = new byte[1];
        if ($$a == null) {
            i2 = i + 110;
        }
        bArr[0] = (byte) i2;
        objArr[0] = new java.lang.String(bArr, 0);
    }

    private setOsBuildID(java.lang.String str, int i) {
    }

    public static com.visa.cbp.setOsBuildID valueOf(java.lang.String str) {
        int i = getOutputMinFrameDuration + 81;
        getHighSpeedVideoSizes = i % 128;
        com.visa.cbp.setOsBuildID setosbuildid = (com.visa.cbp.setOsBuildID) java.lang.Enum.valueOf(com.visa.cbp.setOsBuildID.class, str);
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        getOutputMinFrameDuration = (getHighSpeedVideoSizes + 117) % 128;
        return setosbuildid;
    }

    public static com.visa.cbp.setOsBuildID[] values() {
        int i = getHighSpeedVideoSizes + 103;
        getOutputMinFrameDuration = i % 128;
        com.visa.cbp.setOsBuildID[] setosbuildidArr = getInputFormats;
        if (i % 2 == 0) {
            return (com.visa.cbp.setOsBuildID[]) setosbuildidArr.clone();
        }
        throw null;
    }

    static {
        getHighSpeedVideoFpsRangesFor();
        getHighSpeedVideoFpsRanges = 0;
        getHighResolutionOutputSizeshNQ4ISI = 1;
        getOutputMinFrameDuration = 0;
        getHighSpeedVideoSizes = 1;
        getHighSpeedVideoFpsRanges();
        int minimumFlingVelocity = android.view.ViewConfiguration.getMinimumFlingVelocity();
        double convertQuartSecToDecDegrees = android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0);
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(1840495634 - (minimumFlingVelocity >> 16), 1909382117 - (convertQuartSecToDecDegrees > 0.0d ? 1 : (convertQuartSecToDecDegrees == 0.0d ? 0 : -1)), (short) android.widget.ExpandableListView.getPackedPositionGroup(0L), (-105) - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (byte) (40 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr);
        com.visa.cbp.setOsBuildID setosbuildid = new com.visa.cbp.setOsBuildID(((java.lang.String) objArr[0]).intern(), 0);
        ConfirmReplenishRequest = setosbuildid;
        int scrollDefaultDelay = android.view.ViewConfiguration.getScrollDefaultDelay();
        int keyRepeatDelay = android.view.ViewConfiguration.getKeyRepeatDelay();
        short s = (short) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
        int pressedStateDuration = android.view.ViewConfiguration.getPressedStateDuration();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(1840495620 + (scrollDefaultDelay >> 16), (keyRepeatDelay >> 16) + 1909382124, s, (pressedStateDuration >> 16) - 107, (byte) (82 - android.os.Process.getGidForName("")), objArr2);
        com.visa.cbp.setOsBuildID setosbuildid2 = new com.visa.cbp.setOsBuildID(((java.lang.String) objArr2[0]).intern(), 1);
        BuildConfig = setosbuildid2;
        getInputFormats = new com.visa.cbp.setOsBuildID[]{setosbuildid, setosbuildid2};
        int i = getOutputMinFrameDuration + 121;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void getHighResolutionOutputSizeshNQ4ISI(int i, int i2, short s, int i3, byte b, java.lang.Object[] objArr) {
        boolean z;
        long j;
        int i4;
        boolean z2;
        com.visa.cbp.getEncryptionMetaData getencryptionmetadata = new com.visa.cbp.getEncryptionMetaData();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(getInputSizeshNQ4ISI)};
            java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1873336951);
            if (obj == null) {
                java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) android.view.View.resolveSize(0, 0), 205 - (android.view.KeyEvent.getMaxKeyCode() >> 16), android.view.View.combineMeasuredStates(0, 0) + 19);
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges((byte) 0, objArr3);
                obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1873336951, obj);
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
            if (intValue == -1) {
                int i5 = getHighResolutionOutputSizeshNQ4ISI + 75;
                getHighSpeedVideoFpsRanges = i5 % 128;
                if (i5 % 2 == 0) {
                    z = true;
                    if (z) {
                        int i6 = getHighSpeedVideoFpsRanges;
                        getHighResolutionOutputSizeshNQ4ISI = (i6 + 23) % 128;
                        byte[] bArr = getOutputFormats;
                        if (bArr != null) {
                            getHighResolutionOutputSizeshNQ4ISI = (i6 + 51) % 128;
                            int length = bArr.length;
                            byte[] bArr2 = new byte[length];
                            int i7 = 0;
                            while (i7 < length) {
                                try {
                                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(bArr[i7])};
                                    java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1365177175);
                                    if (obj2 == null) {
                                        obj2 = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), 1837 - android.text.TextUtils.getOffsetAfter("", 0), android.view.View.getDefaultSize(0, 0) + 25)).getMethod(lib.android.paypal.com.magnessdk.g.n2, java.lang.Integer.TYPE);
                                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1365177175, obj2);
                                    }
                                    bArr2[i7] = ((java.lang.Byte) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).byteValue();
                                    i7++;
                                    getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 41) % 128;
                                } catch (java.lang.Throwable th) {
                                    java.lang.Throwable cause = th.getCause();
                                    if (cause == null) {
                                        throw th;
                                    }
                                    throw cause;
                                }
                            }
                            bArr = bArr2;
                        }
                        if (bArr == null) {
                            j = 2302704661859114486L;
                            intValue = (short) (((short) (getHighSpeedVideoSizesFor[i2 + ((int) (getHighSpeedVideoFpsRangesFor ^ 2302704661859114486L))] ^ 2302704661859114486L)) + ((int) (getInputSizeshNQ4ISI ^ 2302704661859114486L)));
                            if (intValue > 0) {
                                int i8 = (int) (getHighSpeedVideoFpsRangesFor ^ j);
                                if (z) {
                                    getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 19) % 128;
                                    i4 = 1;
                                } else {
                                    i4 = 0;
                                }
                                getencryptionmetadata.values = ((i2 + intValue) - 2) + i8 + i4;
                                try {
                                    java.lang.Object[] objArr5 = {getencryptionmetadata, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(Camera2StreamConfigurationMap), sb};
                                    java.lang.Object obj3 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-437174028);
                                    if (obj3 == null) {
                                        java.lang.Class cls2 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 1171 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 20 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRanges((byte) 1, objArr6);
                                        obj3 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class);
                                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-437174028, obj3);
                                    }
                                    ((java.lang.StringBuilder) ((java.lang.reflect.Method) obj3).invoke(null, objArr5)).append(getencryptionmetadata.valueOf);
                                    getencryptionmetadata.ConfirmReplenishRequest = getencryptionmetadata.valueOf;
                                    byte[] bArr3 = getOutputFormats;
                                    if (bArr3 != null) {
                                        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 9) % 128;
                                        int length2 = bArr3.length;
                                        byte[] bArr4 = new byte[length2];
                                        for (int i9 = 0; i9 < length2; i9++) {
                                            bArr4[i9] = (byte) (bArr3[i9] ^ 2302704661859114486L);
                                        }
                                        bArr3 = bArr4;
                                    }
                                    if (bArr3 != null) {
                                        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 21) % 128;
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    getencryptionmetadata.ReplenishAckRequest = 1;
                                    while (getencryptionmetadata.ReplenishAckRequest < intValue) {
                                        if (z2) {
                                            byte[] bArr5 = getOutputFormats;
                                            getencryptionmetadata.values = getencryptionmetadata.values - 1;
                                            getencryptionmetadata.valueOf = (char) (getencryptionmetadata.ConfirmReplenishRequest + (((byte) (((byte) (bArr5[r5] ^ 2302704661859114486L)) + s)) ^ b));
                                        } else {
                                            short[] sArr = getHighSpeedVideoSizesFor;
                                            getencryptionmetadata.values = getencryptionmetadata.values - 1;
                                            getencryptionmetadata.valueOf = (char) (getencryptionmetadata.ConfirmReplenishRequest + (((short) (((short) (sArr[r5] ^ 2302704661859114486L)) + s)) ^ b));
                                        }
                                        sb.append(getencryptionmetadata.valueOf);
                                        getencryptionmetadata.ConfirmReplenishRequest = getencryptionmetadata.valueOf;
                                        getencryptionmetadata.ReplenishAckRequest++;
                                    }
                                } catch (java.lang.Throwable th2) {
                                    java.lang.Throwable cause2 = th2.getCause();
                                    if (cause2 == null) {
                                        throw th2;
                                    }
                                    throw cause2;
                                }
                            }
                            objArr[0] = sb.toString();
                        }
                        byte[] bArr6 = getOutputFormats;
                        try {
                            java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(getHighSpeedVideoFpsRangesFor)};
                            java.lang.Object obj4 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1873336951);
                            if (obj4 == null) {
                                java.lang.Class cls3 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) android.view.KeyEvent.normalizeMetaState(0), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 205, 20 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                                java.lang.Object[] objArr8 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges((byte) 0, objArr8);
                                obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1873336951, obj4);
                            }
                            intValue = (byte) (((byte) (bArr6[((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).intValue()] ^ 2302704661859114486L)) + ((int) (getInputSizeshNQ4ISI ^ 2302704661859114486L)));
                        } catch (java.lang.Throwable th3) {
                            java.lang.Throwable cause3 = th3.getCause();
                            if (cause3 == null) {
                                throw th3;
                            }
                            throw cause3;
                        }
                    }
                    j = 2302704661859114486L;
                    if (intValue > 0) {
                    }
                    objArr[0] = sb.toString();
                }
            }
            z = false;
            if (z) {
            }
            j = 2302704661859114486L;
            if (intValue > 0) {
            }
            objArr[0] = sb.toString();
        } catch (java.lang.Throwable th4) {
            java.lang.Throwable cause4 = th4.getCause();
            if (cause4 == null) {
                throw th4;
            }
            throw cause4;
        }
    }

    static void getHighSpeedVideoFpsRangesFor() {
        $$a = new byte[]{com.google.common.base.Ascii.DC4, -102, 91, -113};
        $$b = 67;
    }

    static void getHighSpeedVideoFpsRanges() {
        getHighSpeedVideoFpsRangesFor = 512670189;
        getInputSizeshNQ4ISI = -1866490489;
        Camera2StreamConfigurationMap = 49535435;
        getOutputFormats = new byte[]{47, -47, 39, 35, 34, com.visa.cbp.getEncExpo.kernelVersion, 45, 74, -88, 80, -76, -89, -10, -10};
    }
}
