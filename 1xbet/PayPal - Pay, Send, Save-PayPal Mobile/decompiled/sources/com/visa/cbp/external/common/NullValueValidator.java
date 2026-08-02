package com.visa.cbp.external.common;

/* loaded from: classes16.dex */
public class NullValueValidator {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int BuildConfig;
    private static short[] ConfirmReplenishRequest;
    private static int ReplenishAckRequest;
    public static final java.lang.String TAG;
    private static int getTokenInfo;
    private static int getTvls;
    private static byte[] valueOf;
    private static int values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, short s, short s2, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = 121 - (i * 8);
        int i5 = 3 - (s * 4);
        byte[] bArr = $$a;
        int i6 = 1 - (s2 * 4);
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i7 = i5;
            i4 = i6;
            i3 = 0;
            i4 += -i5;
            i5 = i7;
            i2 = i3;
            int i8 = i5 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = i8;
            i5 = bArr[i8];
            i4 += -i5;
            i5 = i7;
            i2 = i3;
            int i82 = i5 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
            }
        } else {
            i2 = 0;
            int i822 = i5 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
            }
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getTvls = 0;
        getTokenInfo = 1;
        ConfirmReplenishRequest();
        TAG = "NullValueValidator";
        int i = getTvls + 71;
        getTokenInfo = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    public static void processAnnotations(java.lang.Object obj) {
        getTvls = (getTokenInfo + 83) % 128;
        char c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
        try {
            if (obj == null) {
                com.visa.cbp.setDeviceCerts setdevicecerts = com.visa.cbp.setDeviceCerts.getEncryptionMetaData;
                java.lang.Object[] objArr = new java.lang.Object[1];
                a((short) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), (-815876387) - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (byte) android.text.TextUtils.indexOf("", "", 0), (-165227692) - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (-65) - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
                throw new com.visa.cbp.sdk.facade.exception.InvalidInputException(setdevicecerts, ((java.lang.String) objArr[0]).intern());
            }
            java.lang.reflect.Field[] declaredFields = (obj instanceof java.lang.reflect.Field ? ((java.lang.reflect.Field) obj).getType() : obj.getClass()).getDeclaredFields();
            int length = declaredFields.length;
            int i = 0;
            while (i < length) {
                java.lang.reflect.Field field = declaredFields[i];
                if (field.isAnnotationPresent(com.visa.cbp.external.common.NullValueValidate.class)) {
                    getTvls = (getTokenInfo + 67) % 128;
                    field.setAccessible(true);
                    if (field.get(obj) == null) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        a((short) android.widget.ExpandableListView.getPackedPositionType(0L), (-815876382) - android.text.TextUtils.lastIndexOf("", c, 0, 0), (byte) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), (-165227671) - android.graphics.Color.alpha(0), (-65) - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr2);
                        sb.append(((java.lang.String) objArr2[0]).intern());
                        sb.append(field.getName());
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        a((short) (android.os.Process.getGidForName("") + 1), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 815876434, (byte) (android.view.ViewConfiguration.getTapTimeout() >> 16), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) - 165227648, android.graphics.Color.green(0) - 65, objArr3);
                        sb.append(((java.lang.String) objArr3[0]).intern());
                        throw new java.lang.NullPointerException(sb.toString());
                    }
                }
                java.lang.String name2 = field.getType().getName();
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                a((short) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (-815876365) - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (byte) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), android.widget.ExpandableListView.getPackedPositionType(0L) - 165227633, (-64) - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr4);
                if (name2.startsWith(((java.lang.String) objArr4[0]).intern())) {
                    int i2 = getTvls + 51;
                    getTokenInfo = i2 % 128;
                    if (i2 % 2 == 0) {
                        field.setAccessible(false);
                    } else {
                        field.setAccessible(true);
                    }
                    processAnnotations(field.get(obj));
                }
                i++;
                c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
            }
        } catch (java.lang.Exception e) {
            throw new java.lang.NullPointerException(e.getMessage());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x026a, code lost:
    
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0268, code lost:
    
        if (r11 != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0257, code lost:
    
        if (r11 != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x026c, code lost:
    
        r8 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, int i, byte b, int i2, int i3, java.lang.Object[] objArr) {
        int i4;
        int i5;
        int i6;
        int length;
        byte[] bArr;
        int i7;
        com.visa.cbp.getEncryptionMetaData getencryptionmetadata = new com.visa.cbp.getEncryptionMetaData();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(values)};
            java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1873336951);
            if (obj == null) {
                java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) android.view.KeyEvent.normalizeMetaState(0), android.graphics.Color.red(0) + 205, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 20);
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                b(1, (short) 0, (short) 0, objArr3);
                obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1873336951, obj);
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
            boolean z = intValue == -1;
            if (z) {
                byte[] bArr2 = valueOf;
                if (bArr2 != null) {
                    int i8 = $11 + 5;
                    $10 = i8 % 128;
                    if (i8 % 2 != 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i7 = 1;
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i7 = 0;
                    }
                    while (i7 < length) {
                        try {
                            java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(bArr2[i7])};
                            java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1365177175);
                            if (obj2 == null) {
                                obj2 = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) android.view.KeyEvent.keyCodeFromString(""), android.view.View.combineMeasuredStates(0, 0) + 1837, 25 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)))).getMethod(lib.android.paypal.com.magnessdk.g.n2, java.lang.Integer.TYPE);
                                com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1365177175, obj2);
                            }
                            bArr[i7] = ((java.lang.Byte) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).byteValue();
                            i7++;
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    int i9 = $10 + 39;
                    $11 = i9 % 128;
                    if (i9 % 2 == 0) {
                        byte[] bArr3 = valueOf;
                        try {
                            java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(ReplenishAckRequest)};
                            java.lang.Object obj3 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1873336951);
                            if (obj3 == null) {
                                java.lang.Class cls2 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), 204 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), android.view.View.resolveSize(0, 0) + 19);
                                java.lang.Object[] objArr6 = new java.lang.Object[1];
                                b(1, (short) 0, (short) 0, objArr6);
                                obj3 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1873336951, obj3);
                            }
                            i6 = ((byte) (bArr3[((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr5)).intValue()] % 2302704661859114486L)) << ((int) (values % 2302704661859114486L));
                        } catch (java.lang.Throwable th2) {
                            java.lang.Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } else {
                        byte[] bArr4 = valueOf;
                        try {
                            java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(ReplenishAckRequest)};
                            java.lang.Object obj4 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1873336951);
                            if (obj4 == null) {
                                java.lang.Class cls3 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 205 - android.view.KeyEvent.keyCodeFromString(""), 19 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                                java.lang.Object[] objArr8 = new java.lang.Object[1];
                                b(1, (short) 0, (short) 0, objArr8);
                                obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1873336951, obj4);
                            }
                            i6 = ((byte) (bArr4[((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).intValue()] ^ 2302704661859114486L)) + ((int) (values ^ 2302704661859114486L));
                        } catch (java.lang.Throwable th3) {
                            java.lang.Throwable cause3 = th3.getCause();
                            if (cause3 == null) {
                                throw th3;
                            }
                            throw cause3;
                        }
                    }
                    intValue = (byte) i6;
                } else {
                    intValue = (short) (((short) (ConfirmReplenishRequest[i2 + ((int) (ReplenishAckRequest ^ 2302704661859114486L))] ^ 2302704661859114486L)) + ((int) (values ^ 2302704661859114486L)));
                }
            }
            if (intValue > 0) {
                int i10 = $11 + 87;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    i4 = ((i2 % intValue) << 3) + ((int) (ReplenishAckRequest | 2302704661859114486L));
                } else {
                    i4 = ((i2 + intValue) - 2) + ((int) (ReplenishAckRequest ^ 2302704661859114486L));
                }
                getencryptionmetadata.values = i4 + i5;
                try {
                    java.lang.Object[] objArr9 = {getencryptionmetadata, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(BuildConfig), sb};
                    java.lang.Object obj5 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-437174028);
                    if (obj5 == null) {
                        java.lang.Class cls4 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) android.view.KeyEvent.keyCodeFromString(""), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1171, (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 19);
                        java.lang.Object[] objArr10 = new java.lang.Object[1];
                        b(0, (short) 0, (short) 0, objArr10);
                        obj5 = cls4.getMethod((java.lang.String) objArr10[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-437174028, obj5);
                    }
                    ((java.lang.StringBuilder) ((java.lang.reflect.Method) obj5).invoke(null, objArr9)).append(getencryptionmetadata.valueOf);
                    getencryptionmetadata.ConfirmReplenishRequest = getencryptionmetadata.valueOf;
                    byte[] bArr5 = valueOf;
                    if (bArr5 != null) {
                        int length2 = bArr5.length;
                        byte[] bArr6 = new byte[length2];
                        for (int i11 = 0; i11 < length2; i11++) {
                            bArr6[i11] = (byte) (bArr5[i11] ^ 2302704661859114486L);
                        }
                        bArr5 = bArr6;
                    }
                    boolean z2 = bArr5 != null;
                    getencryptionmetadata.ReplenishAckRequest = 1;
                    while (getencryptionmetadata.ReplenishAckRequest < intValue) {
                        if (z2) {
                            byte[] bArr7 = valueOf;
                            getencryptionmetadata.values = getencryptionmetadata.values - 1;
                            getencryptionmetadata.valueOf = (char) (getencryptionmetadata.ConfirmReplenishRequest + (((byte) (((byte) (bArr7[r8] ^ 2302704661859114486L)) + s)) ^ b));
                        } else {
                            short[] sArr = ConfirmReplenishRequest;
                            getencryptionmetadata.values = getencryptionmetadata.values - 1;
                            getencryptionmetadata.valueOf = (char) (getencryptionmetadata.ConfirmReplenishRequest + (((short) (((short) (sArr[r8] ^ 2302704661859114486L)) + s)) ^ b));
                            $11 = ($10 + 37) % 128;
                        }
                        sb.append(getencryptionmetadata.valueOf);
                        getencryptionmetadata.ConfirmReplenishRequest = getencryptionmetadata.valueOf;
                        getencryptionmetadata.ReplenishAckRequest++;
                    }
                } catch (java.lang.Throwable th4) {
                    java.lang.Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
            java.lang.String obj6 = sb.toString();
            int i12 = $10 + 25;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            objArr[0] = obj6;
        } catch (java.lang.Throwable th5) {
            java.lang.Throwable cause5 = th5.getCause();
            if (cause5 == null) {
                throw th5;
            }
            throw cause5;
        }
    }

    static void init$0() {
        $$a = new byte[]{58, -63, 121, -14};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_EXTERNAL_VALUE;
    }

    static void ConfirmReplenishRequest() {
        ReplenishAckRequest = -1721323174;
        values = -1866490442;
        BuildConfig = -1608592249;
        valueOf = new byte[]{35, -12, 3, -1, 5, -5, 9, -9, 5, -92, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, -25, 8, 13, -2, 5, -71, 66, -10, 1, -47, 33, 74, 14, -15, 10, -11, -80, 77, com.google.common.base.Ascii.VT, 2, -94, 76, 1, -71, 77, 6, -1, -3, com.google.common.base.Ascii.GS, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, 77, com.google.common.base.Ascii.VT, -30, 57, com.google.common.base.Ascii.DC4, -10, 1, -15, -40, 77, -11, -76, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, -69, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -5, 8, -75, 63, 59, com.google.common.base.Ascii.CAN, -4, 5, -66, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 8, -6};
    }
}
