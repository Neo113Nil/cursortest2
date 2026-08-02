package com.visa.cbp;

/* loaded from: classes5.dex */
public class getDeviceType {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 0;
    static final int getHighSpeedVideoFpsRangesFor = 1152;
    private static final int getHighSpeedVideoSizes = 8;
    private static byte[] getHighSpeedVideoSizesFor;
    private static int getInputFormats;
    private static short[] getInputSizeshNQ4ISI;
    private static int getOutputFormats;
    private static int getOutputMinFrameDuration;
    private static int getOutputStallDurationlomOqCM;
    private final java.lang.String getOutputMinFrameDurationlomOqCM;
    private byte[] getOutputSizes;
    private byte[] getOutputSizeshNQ4ISI;
    private byte[] getOutputStallDuration;
    private final java.lang.String isOutputSupportedForhNQ4ISI;
    private byte[] toString;
    private byte[] unwrapAs;

    private static void Camera2StreamConfigurationMap(short s, java.lang.Object[] objArr) {
        int i = s * 8;
        int i2 = i + 113;
        byte[] bArr = new byte[1];
        if ($$a == null) {
            i2 = i + 116;
        }
        bArr[0] = (byte) i2;
        objArr[0] = new java.lang.String(bArr, 0);
    }

    public getDeviceType(byte[] bArr, java.lang.String str) {
        int i;
        int i2;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes((short) android.text.TextUtils.getOffsetAfter("", 0), 1453244399 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (byte) (android.view.View.resolveSize(0, 0) - 107), (-1049490069) - android.text.TextUtils.getTrimmedLength(""), (-15) - android.view.Gravity.getAbsoluteGravity(0, 0), objArr);
        this.isOutputSupportedForhNQ4ISI = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoSizes((short) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 1453244437 + android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (byte) (28 - android.view.View.MeasureSpec.getMode(0)), (android.view.KeyEvent.getMaxKeyCode() >> 16) - 1049490054, (-15) - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr2);
        this.getOutputMinFrameDurationlomOqCM = ((java.lang.String) objArr2[0]).intern();
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoSizes((short) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), android.graphics.Color.red(0) + 1453244399, (byte) (android.widget.ExpandableListView.getPackedPositionChild(0L) - 106), (-1049490070) - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (android.os.Process.myPid() >> 22) - 15, objArr3);
        byte[] bytes = ((java.lang.String) objArr3[0]).intern().getBytes(java.nio.charset.StandardCharsets.UTF_8);
        byte[] bytes2 = str.getBytes(java.nio.charset.StandardCharsets.UTF_8);
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighSpeedVideoSizes((short) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), android.widget.ExpandableListView.getPackedPositionType(0L) + 1453244436, (byte) (28 - (android.view.ViewConfiguration.getEdgeSlop() >> 16)), (-1049490054) - android.view.View.MeasureSpec.getSize(0), (-15) - android.view.KeyEvent.keyCodeFromString(""), objArr4);
        byte[] bArr2 = new byte[144];
        com.visa.cbp.getContactName getcontactname = new com.visa.cbp.getContactName(bArr, new com.visa.cbp.setDeviceType(bytes, bytes2, ((java.lang.String) objArr4[0]).intern().getBytes(java.nio.charset.StandardCharsets.UTF_8), java.nio.ByteBuffer.allocate(4).putInt(getHighSpeedVideoFpsRangesFor).array()).BuildConfig());
        com.visa.cbp.setBackgroundColor setbackgroundcolor = new com.visa.cbp.setBackgroundColor(new com.visa.cbp.setLabelColor());
        setbackgroundcolor.ReplenishAckRequest = getcontactname.BuildConfig;
        setbackgroundcolor.ConfirmReplenishRequest = getcontactname.ConfirmReplenishRequest;
        byte[] bArr3 = new byte[setbackgroundcolor.valueOf];
        byte[] bArr4 = new byte[4];
        setbackgroundcolor.values.ReplenishAckRequest();
        if (144 > setbackgroundcolor.valueOf) {
            i = 0;
            int i3 = 1;
            while (true) {
                bArr4[0] = (byte) (i3 >>> 24);
                bArr4[1] = (byte) (i3 >>> 16);
                bArr4[2] = (byte) (i3 >>> 8);
                bArr4[3] = (byte) i3;
                setbackgroundcolor.values.valueOf(bArr4, 4);
                setbackgroundcolor.values.valueOf(setbackgroundcolor.ReplenishAckRequest, setbackgroundcolor.ReplenishAckRequest.length);
                setbackgroundcolor.values.valueOf(setbackgroundcolor.ConfirmReplenishRequest, setbackgroundcolor.ConfirmReplenishRequest.length);
                setbackgroundcolor.values.values(bArr3);
                java.lang.System.arraycopy(bArr3, 0, bArr2, i, setbackgroundcolor.valueOf);
                i += setbackgroundcolor.valueOf;
                i2 = i3 + 1;
                if (i3 >= 144 / setbackgroundcolor.valueOf) {
                    break;
                } else {
                    i3 = i2;
                }
            }
        } else {
            i = 0;
            i2 = 1;
        }
        if (i < 144) {
            bArr4[0] = (byte) (i2 >>> 24);
            bArr4[1] = (byte) (i2 >>> 16);
            bArr4[2] = (byte) (i2 >>> 8);
            bArr4[3] = (byte) i2;
            setbackgroundcolor.values.valueOf(bArr4, 4);
            setbackgroundcolor.values.valueOf(setbackgroundcolor.ReplenishAckRequest, setbackgroundcolor.ReplenishAckRequest.length);
            setbackgroundcolor.values.valueOf(setbackgroundcolor.ConfirmReplenishRequest, setbackgroundcolor.ConfirmReplenishRequest.length);
            setbackgroundcolor.values.values(bArr3);
            java.lang.System.arraycopy(bArr3, 0, bArr2, i, 144 - i);
        }
        byte[] bArr5 = new byte[16];
        java.lang.System.arraycopy(bArr2, 0, bArr5, 0, 16);
        this.getOutputSizeshNQ4ISI = bArr5;
        byte[] bArr6 = new byte[32];
        java.lang.System.arraycopy(bArr2, 16, bArr6, 0, 32);
        this.getOutputSizes = bArr6;
        byte[] bArr7 = new byte[32];
        java.lang.System.arraycopy(bArr2, 48, bArr7, 0, 32);
        this.toString = bArr7;
        byte[] bArr8 = new byte[32];
        java.lang.System.arraycopy(bArr2, 80, bArr8, 0, 32);
        this.getOutputStallDuration = bArr8;
        byte[] bArr9 = new byte[32];
        java.lang.System.arraycopy(bArr2, 112, bArr9, 0, 32);
        this.unwrapAs = bArr9;
    }

    public byte[] ConfirmReplenishRequest() {
        int i = (getOutputMinFrameDuration + 27) % 128;
        getHighSpeedVideoFpsRanges = i;
        byte[] bArr = this.getOutputSizeshNQ4ISI;
        getOutputMinFrameDuration = (i + 5) % 128;
        return bArr;
    }

    public byte[] ReplenishAckRequest() {
        int i = getHighSpeedVideoFpsRanges + 5;
        int i2 = i % 128;
        getOutputMinFrameDuration = i2;
        if (i % 2 != 0) {
            throw null;
        }
        byte[] bArr = this.getOutputSizes;
        getHighSpeedVideoFpsRanges = (i2 + 9) % 128;
        return bArr;
    }

    public byte[] values() {
        int i = getOutputMinFrameDuration;
        int i2 = i + 101;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        byte[] bArr = this.toString;
        int i3 = i + 59;
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    public byte[] BuildConfig() {
        int i = getHighSpeedVideoFpsRanges;
        getOutputMinFrameDuration = (i + 105) % 128;
        byte[] bArr = this.getOutputStallDuration;
        int i2 = i + 101;
        getOutputMinFrameDuration = i2 % 128;
        if (i2 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    public byte[] valueOf() {
        int i = getHighSpeedVideoFpsRanges + 3;
        getOutputMinFrameDuration = i % 128;
        byte[] bArr = this.unwrapAs;
        if (i % 2 == 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    public void ReplenishAckRequest(byte[] bArr) {
        int i = (getHighSpeedVideoFpsRanges + 105) % 128;
        getOutputMinFrameDuration = i;
        this.unwrapAs = bArr;
        int i2 = i + 45;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01f1 A[Catch: all -> 0x02e3, TryCatch #1 {all -> 0x02e3, blocks: (B:55:0x01d0, B:57:0x01f1, B:58:0x0233), top: B:54:0x01d0 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0281  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void getHighSpeedVideoSizes(short s, int i, byte b, int i2, int i3, java.lang.Object[] objArr) {
        int i4;
        java.lang.Object obj;
        byte[] bArr;
        boolean z;
        int length;
        byte[] bArr2;
        int i5;
        com.visa.cbp.getEncryptionMetaData getencryptionmetadata = new com.visa.cbp.getEncryptionMetaData();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(getInputFormats)};
            java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1873336951);
            if (obj2 == null) {
                java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), android.view.View.MeasureSpec.getSize(0) + 205, 19 - android.text.TextUtils.indexOf("", "", 0));
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                Camera2StreamConfigurationMap((short) 0, objArr3);
                obj2 = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1873336951, obj2);
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr2)).intValue();
            boolean z2 = intValue == -1;
            if (z2) {
                getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 25) % 128;
                byte[] bArr3 = getHighSpeedVideoSizesFor;
                if (bArr3 != null) {
                    int length2 = bArr3.length;
                    byte[] bArr4 = new byte[length2];
                    for (int i6 = 0; i6 < length2; i6++) {
                        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 57) % 128;
                        try {
                            java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(bArr3[i6])};
                            java.lang.Object obj3 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1365177175);
                            if (obj3 == null) {
                                obj3 = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 1836 - android.view.MotionEvent.axisFromString(""), android.view.MotionEvent.axisFromString("") + 26)).getMethod(lib.android.paypal.com.magnessdk.g.n2, java.lang.Integer.TYPE);
                                com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1365177175, obj3);
                            }
                            bArr4[i6] = ((java.lang.Byte) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).byteValue();
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr3 = bArr4;
                }
                if (bArr3 != null) {
                    byte[] bArr5 = getHighSpeedVideoSizesFor;
                    try {
                        java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(getOutputStallDurationlomOqCM)};
                        java.lang.Object obj4 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1873336951);
                        if (obj4 == null) {
                            java.lang.Class cls2 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), 205 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), android.graphics.Color.argb(0, 0, 0, 0) + 19);
                            java.lang.Object[] objArr6 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap((short) 0, objArr6);
                            obj4 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1873336951, obj4);
                        }
                        intValue = (byte) (((byte) (bArr5[((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr5)).intValue()] ^ 2302704661859114486L)) + ((int) (getInputFormats ^ 2302704661859114486L)));
                    } catch (java.lang.Throwable th2) {
                        java.lang.Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    intValue = (short) (((short) (getInputSizeshNQ4ISI[i2 + ((int) (getOutputStallDurationlomOqCM ^ 2302704661859114486L))] ^ 2302704661859114486L)) + ((int) (getInputFormats ^ 2302704661859114486L)));
                }
            }
            if (intValue > 0) {
                int i7 = (getHighResolutionOutputSizeshNQ4ISI + 15) % 128;
                Camera2StreamConfigurationMap = i7;
                int i8 = (int) (getOutputStallDurationlomOqCM ^ 2302704661859114486L);
                try {
                    if (z2) {
                        int i9 = i7 + 3;
                        getHighResolutionOutputSizeshNQ4ISI = i9 % 128;
                        if (i9 % 2 != 0) {
                            i4 = 1;
                            getencryptionmetadata.values = ((i2 + intValue) - 2) + i8 + i4;
                            java.lang.Object[] objArr7 = {getencryptionmetadata, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(getOutputFormats), sb};
                            obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-437174028);
                            if (obj == null) {
                                java.lang.Class cls3 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) android.view.View.getDefaultSize(0, 0), 1170 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 20 - android.graphics.Color.alpha(0));
                                java.lang.Object[] objArr8 = new java.lang.Object[1];
                                Camera2StreamConfigurationMap((short) 1, objArr8);
                                obj = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class);
                                com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-437174028, obj);
                            }
                            ((java.lang.StringBuilder) ((java.lang.reflect.Method) obj).invoke(null, objArr7)).append(getencryptionmetadata.valueOf);
                            getencryptionmetadata.ConfirmReplenishRequest = getencryptionmetadata.valueOf;
                            bArr = getHighSpeedVideoSizesFor;
                            if (bArr != null) {
                                int i10 = getHighResolutionOutputSizeshNQ4ISI;
                                int i11 = i10 + 15;
                                Camera2StreamConfigurationMap = i11 % 128;
                                if (i11 % 2 != 0) {
                                    length = bArr.length;
                                    bArr2 = new byte[length];
                                    i5 = 1;
                                } else {
                                    length = bArr.length;
                                    bArr2 = new byte[length];
                                    i5 = 0;
                                }
                                Camera2StreamConfigurationMap = (i10 + 63) % 128;
                                while (i5 < length) {
                                    bArr2[i5] = (byte) (bArr[i5] ^ 2302704661859114486L);
                                    i5++;
                                }
                                bArr = bArr2;
                            }
                            if (bArr == null) {
                                Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 91) % 128;
                                z = true;
                            } else {
                                z = false;
                            }
                            getencryptionmetadata.ReplenishAckRequest = 1;
                            Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 29) % 128;
                            while (getencryptionmetadata.ReplenishAckRequest < intValue) {
                                if (z) {
                                    byte[] bArr6 = getHighSpeedVideoSizesFor;
                                    getencryptionmetadata.values = getencryptionmetadata.values - 1;
                                    getencryptionmetadata.valueOf = (char) (getencryptionmetadata.ConfirmReplenishRequest + (((byte) (((byte) (bArr6[r7] ^ 2302704661859114486L)) + s)) ^ b));
                                } else {
                                    short[] sArr = getInputSizeshNQ4ISI;
                                    getencryptionmetadata.values = getencryptionmetadata.values - 1;
                                    getencryptionmetadata.valueOf = (char) (getencryptionmetadata.ConfirmReplenishRequest + (((short) (((short) (sArr[r7] ^ 2302704661859114486L)) + s)) ^ b));
                                }
                                sb.append(getencryptionmetadata.valueOf);
                                getencryptionmetadata.ConfirmReplenishRequest = getencryptionmetadata.valueOf;
                                getencryptionmetadata.ReplenishAckRequest++;
                            }
                        }
                    }
                    java.lang.Object[] objArr72 = {getencryptionmetadata, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(getOutputFormats), sb};
                    obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-437174028);
                    if (obj == null) {
                    }
                    ((java.lang.StringBuilder) ((java.lang.reflect.Method) obj).invoke(null, objArr72)).append(getencryptionmetadata.valueOf);
                    getencryptionmetadata.ConfirmReplenishRequest = getencryptionmetadata.valueOf;
                    bArr = getHighSpeedVideoSizesFor;
                    if (bArr != null) {
                    }
                    if (bArr == null) {
                    }
                    getencryptionmetadata.ReplenishAckRequest = 1;
                    Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 29) % 128;
                    while (getencryptionmetadata.ReplenishAckRequest < intValue) {
                    }
                } catch (java.lang.Throwable th3) {
                    java.lang.Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
                i4 = 0;
                getencryptionmetadata.values = ((i2 + intValue) - 2) + i8 + i4;
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

    static void Camera2StreamConfigurationMap() {
        $$a = new byte[]{org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -93, 75};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE;
    }

    static {
        Camera2StreamConfigurationMap();
        Camera2StreamConfigurationMap = 0;
        getHighResolutionOutputSizeshNQ4ISI = 1;
        getOutputMinFrameDuration = 0;
        getHighSpeedVideoFpsRanges = 1;
        getOutputStallDurationlomOqCM = -1372426397;
        getInputFormats = -1866490376;
        getOutputFormats = 970907042;
        getHighSpeedVideoSizesFor = new byte[]{-9, 98, com.visa.cbp.getEncExpo.IResultReceiver2, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 75, -122, 97, -102, 125, -70, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, -99, -106, -100, 111, com.visa.cbp.getEncExpo.onUnminimized, com.google.common.base.Ascii.DC4, -26, -33, 39, 4, -32, com.google.common.base.Ascii.EM, -94, 93, -22, -22, -94, -22, com.google.common.base.Ascii.US, 45, -23, com.google.common.base.Ascii.SYN, -22, -26};
    }
}
