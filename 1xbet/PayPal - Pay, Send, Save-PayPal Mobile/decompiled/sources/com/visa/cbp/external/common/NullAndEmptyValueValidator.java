package com.visa.cbp.external.common;

/* loaded from: classes5.dex */
public class NullAndEmptyValueValidator {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int ConfirmReplenishRequest;
    public static final java.lang.String TAG;
    private static int valueOf;
    private static int values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, byte b, byte b2, java.lang.Object[] objArr) {
        int i;
        int i2 = (b2 * 4) + 114;
        int i3 = (s * 2) + 4;
        byte[] bArr = $$a;
        int i4 = b * 4;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            i2 = i3;
            int i5 = i4;
            i = 0;
            i3++;
            i2 += -i5;
            bArr2[i] = (byte) i2;
            if (i == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i++;
            i5 = bArr[i3];
            i3++;
            i2 += -i5;
            bArr2[i] = (byte) i2;
            if (i == i4) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            if (i == i4) {
            }
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ConfirmReplenishRequest = 0;
        values = 1;
        ReplenishAckRequest();
        TAG = "NullAndEmptyValueValidator";
        int i = values + 109;
        ConfirmReplenishRequest = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static void processAnnotations(java.lang.Object obj) {
        java.lang.Class<?> cls;
        java.lang.Object obj2;
        if (obj == null) {
            com.visa.cbp.setDeviceCerts setdevicecerts = com.visa.cbp.setDeviceCerts.getEncryptionMetaData;
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(20 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), true, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 2, "\u0014￭\u0004\u0002\r\u0004\u0011\u0004\u0005\u0004\u0011\uffbf\u0013\u0002\u0004\t\u0001\u000e\uffbf\u000b\u000b", 257 - android.text.TextUtils.getCapsMode("", 0, 0), objArr);
            throw new com.visa.cbp.sdk.facade.exception.InvalidInputException(setdevicecerts, ((java.lang.String) objArr[0]).intern());
        }
        if (obj instanceof java.lang.reflect.Field) {
            int i = values + 55;
            ConfirmReplenishRequest = i % 128;
            if (i % 2 != 0) {
                ((java.lang.reflect.Field) obj).getType();
                throw null;
            }
            cls = ((java.lang.reflect.Field) obj).getType();
        } else {
            cls = obj.getClass();
        }
        java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
        int length = declaredFields.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = ConfirmReplenishRequest + 115;
            values = i3 % 128;
            if (i3 % 2 == 0) {
                java.lang.reflect.Field field = declaredFields[i2];
                throw null;
            }
            java.lang.reflect.Field field2 = declaredFields[i2];
            if (field2.isAnnotationPresent(com.visa.cbp.external.common.NullAndEmptyValueValidate.class) || field2.isAnnotationPresent(com.visa.cbp.external.common.NullValueValidate.class)) {
                field2.setAccessible(true);
                try {
                    obj2 = field2.get(obj);
                } catch (java.lang.IllegalAccessException e) {
                    e.getMessage();
                    obj2 = null;
                }
                if (obj2 == null) {
                    com.visa.cbp.setDeviceCerts setdevicecerts2 = com.visa.cbp.setDeviceCerts.getEncryptionMetaData;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    a(24 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), false, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 5, "\u0011\r\u0014\f\uffc8￼\u0010\r\uffc8\u001e\t\u0014\u001d\r\uffc8\u0017\u000e\uffc8\u001c\u0010\r\uffc8\u000e", 247 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr2);
                    sb.append(((java.lang.String) objArr2[0]).intern());
                    sb.append(field2.getName());
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    a(android.view.View.MeasureSpec.getSize(0) + 15, true, 11 - android.text.TextUtils.getTrimmedLength(""), "\u0004ￖ\u001b\u0018ￖ*\uffdd$\u0017\u0019ￖ￤\u0002\u0002\u000b", (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE, objArr3);
                    sb.append(((java.lang.String) objArr3[0]).intern());
                    throw new com.visa.cbp.sdk.facade.exception.InvalidInputException(setdevicecerts2, sb.toString());
                }
                if (field2.isAnnotationPresent(com.visa.cbp.external.common.NullAndEmptyValueValidate.class)) {
                    if (obj2 instanceof byte[]) {
                        int i4 = values + 61;
                        ConfirmReplenishRequest = i4 % 128;
                        if (i4 % 2 != 0) {
                            int length2 = ((byte[]) obj2).length;
                            throw new java.lang.ArithmeticException();
                        }
                        if (((byte[]) obj2).length == 0) {
                            com.visa.cbp.setDeviceCerts setdevicecerts3 = com.visa.cbp.setDeviceCerts.getEncryptionMetaData;
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                            java.lang.Object[] objArr4 = new java.lang.Object[1];
                            a(android.view.View.combineMeasuredStates(0, 0) + 23, false, android.text.TextUtils.getOffsetAfter("", 0) + 5, "\u0011\r\u0014\f\uffc8￼\u0010\r\uffc8\u001e\t\u0014\u001d\r\uffc8\u0017\u000e\uffc8\u001c\u0010\r\uffc8\u000e", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, objArr4);
                            sb2.append(((java.lang.String) objArr4[0]).intern());
                            sb2.append(field2.getName());
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            a(28 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), false, android.text.TextUtils.indexOf("", "", 0) + 19, "\u0004\u0019\bￃ\f\u0011\u0019\u0004\u000f\f\u0007ￃ\t\u0012\u0015\u0010\u0004\u0017\uffd1ￃ\u0006\u0004\u0011\u0011\u0012\u0017ￃ\u000b", (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, objArr5);
                            sb2.append(((java.lang.String) objArr5[0]).intern());
                            throw new com.visa.cbp.sdk.facade.exception.InvalidInputException(setdevicecerts3, sb2.toString());
                        }
                    } else if ((obj2 instanceof java.lang.String) && ((java.lang.String) obj2).isEmpty()) {
                        com.visa.cbp.setDeviceCerts setdevicecerts4 = com.visa.cbp.setDeviceCerts.getEncryptionMetaData;
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        a(23 - android.view.View.combineMeasuredStates(0, 0), false, 6 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), "\u0011\r\u0014\f\uffc8￼\u0010\r\uffc8\u001e\t\u0014\u001d\r\uffc8\u0017\u000e\uffc8\u001c\u0010\r\uffc8\u000e", 248 - (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr6);
                        sb3.append(((java.lang.String) objArr6[0]).intern());
                        sb3.append(field2.getName());
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        a(18 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), false, 9 - android.widget.ExpandableListView.getPackedPositionChild(0L), "ￆ\b\u000bￆ\u000b\u0013\u0016\u001a\u001fￔￆ\t\u0007\u0014\u0014\u0015\u001a", (android.view.KeyEvent.getMaxKeyCode() >> 16) + 250, objArr7);
                        sb3.append(((java.lang.String) objArr7[0]).intern());
                        throw new com.visa.cbp.sdk.facade.exception.InvalidInputException(setdevicecerts4, sb3.toString());
                    }
                }
            }
            java.lang.String name2 = field2.getType().getName();
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            a(9 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), true, -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), "\u0005\uffd0\u0003\u0015\u000b\u0018\uffd0\u000f\u0011", 253 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), objArr8);
            if (name2.startsWith(((java.lang.String) objArr8[0]).intern())) {
                field2.setAccessible(true);
                try {
                    processAnnotations(field2.get(obj));
                } catch (java.lang.IllegalAccessException e2) {
                    com.visa.cbp.setDeviceCerts setdevicecerts5 = com.visa.cbp.setDeviceCerts.ReplenishResponse;
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    a(33 - android.text.TextUtils.indexOf("", "", 0), false, android.text.TextUtils.indexOf("", "") + 18, "\u001aￇ\u0016\t\u0011\f\n\u001bￇ\r\u0010\f\u0013\u000b\u001aￇ￡ￇ￼\u0015\b\t\u0013\fￇ\u001b\u0016ￇ\b\n\n\f\u001a", android.view.Gravity.getAbsoluteGravity(0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE, objArr9);
                    sb4.append(((java.lang.String) objArr9[0]).intern());
                    sb4.append(e2.getMessage());
                    throw new com.visa.cbp.sdk.facade.exception.InvalidInputException(setdevicecerts5, sb4.toString());
                }
            }
        }
        int i5 = ConfirmReplenishRequest + 13;
        values = i5 % 128;
        if (i5 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    private static void a(int i, boolean z, int i2, java.lang.String str, int i3, java.lang.Object[] objArr) {
        char[] cArr;
        int i4 = $10;
        $11 = (i4 + 41) % 128;
        if (str != null) {
            $11 = (i4 + 27) % 128;
            cArr = str.toCharArray();
            $11 = ($10 + 69) % 128;
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.visa.cbp.setTvls settvls = new com.visa.cbp.setTvls();
        char[] cArr3 = new char[i];
        settvls.BuildConfig = 0;
        while (settvls.BuildConfig < i) {
            settvls.values = cArr2[settvls.BuildConfig];
            cArr3[settvls.BuildConfig] = (char) (i3 + settvls.values);
            int i5 = settvls.BuildConfig;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i5]), java.lang.Integer.valueOf(valueOf)};
                java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1140899376);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (17627 - android.graphics.ImageFormat.getBitsPerPixel(0)), 314 - android.widget.ExpandableListView.getPackedPositionChild(0L), 32 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b((short) 0, (byte) 0, (byte) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1140899376, obj);
                }
                cArr3[i5] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                try {
                    java.lang.Object[] objArr4 = {settvls, settvls};
                    java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1304551840);
                    if (obj2 == null) {
                        obj2 = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (30832 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1971, android.widget.ExpandableListView.getPackedPositionGroup(0L) + 29)).getMethod("p", java.lang.Object.class, java.lang.Object.class);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1304551840, obj2);
                    }
                    ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
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
        if (i2 > 0) {
            settvls.ReplenishAckRequest = i2;
            char[] cArr4 = new char[i];
            java.lang.System.arraycopy(cArr3, 0, cArr4, 0, i);
            java.lang.System.arraycopy(cArr4, 0, cArr3, i - settvls.ReplenishAckRequest, settvls.ReplenishAckRequest);
            java.lang.System.arraycopy(cArr4, settvls.ReplenishAckRequest, cArr3, 0, i - settvls.ReplenishAckRequest);
        }
        if (z) {
            $11 = ($10 + 11) % 128;
            char[] cArr5 = new char[i];
            settvls.BuildConfig = 0;
            while (settvls.BuildConfig < i) {
                cArr5[settvls.BuildConfig] = cArr3[(i - settvls.BuildConfig) - 1];
                try {
                    java.lang.Object[] objArr5 = {settvls, settvls};
                    java.lang.Object obj3 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1304551840);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 30832), android.text.TextUtils.indexOf("", "", 0, 0) + 1971, 29 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16))).getMethod("p", java.lang.Object.class, java.lang.Object.class);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1304551840, obj3);
                    }
                    ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                } catch (java.lang.Throwable th3) {
                    java.lang.Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            cArr3 = cArr5;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static void init$0() {
        $$a = new byte[]{120, -75, -4, -99};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE;
    }

    static void ReplenishAckRequest() {
        valueOf = -178298115;
    }
}
