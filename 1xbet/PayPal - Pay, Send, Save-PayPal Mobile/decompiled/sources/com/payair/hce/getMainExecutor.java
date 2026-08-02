package com.payair.hce;

/* loaded from: classes4.dex */
public class getMainExecutor {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int IccPrivateKeyCrtComponentsJson;
    private static char[] RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static long getAid;
    private byte[] AlternateContactlessPaymentDataJson;
    private byte[] DigitizedCardProfile;
    private byte[] valueOf;
    private com.payair.hce.checkPermission values;
    private byte[] writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, int i, short s2, java.lang.Object[] objArr) {
        int i2;
        int i3 = s * 3;
        byte[] bArr = $$a;
        int i4 = 99 - (s2 * 4);
        int i5 = i + 4;
        byte[] bArr2 = new byte[1 - i3];
        int i6 = 0 - i3;
        if (bArr == null) {
            int i7 = i4;
            i2 = 0;
            i4 = i6;
            i4 += i7;
            bArr2[i2] = (byte) i4;
            i5++;
            if (i2 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i2++;
            i7 = bArr[i5];
            i4 += i7;
            bArr2[i2] = (byte) i4;
            i5++;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            i5++;
            if (i2 == i6) {
            }
        }
    }

    public getMainExecutor(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) ((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 44854), 6 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(((java.lang.String) objArr[0]).intern());
        sb.append(com.payair.hce.getMainExecutor.class.getName());
        this.values = com.payair.hce.checkPermission.DigitizedCardProfile(sb.toString());
        this.valueOf = com.payair.hce.startService.writeReplace(bArr);
        this.writeReplace = com.payair.hce.startService.writeReplace(bArr2);
        this.AlternateContactlessPaymentDataJson = com.payair.hce.startService.writeReplace(bArr3);
        this.DigitizedCardProfile = com.payair.hce.startService.writeReplace(bArr4);
    }

    public final byte[] values() {
        int i = IccPrivateKeyCrtComponentsJson + 61;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 == 0) {
            com.payair.hce.stopService.AlternateContactlessPaymentDataJson(this.valueOf);
            byte[] bArr = this.valueOf;
            int i2 = IccPrivateKeyCrtComponentsJson + 1;
            SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
            if (i2 % 2 == 0) {
                return bArr;
            }
            throw new java.lang.ArithmeticException();
        }
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson(this.valueOf);
        throw null;
    }

    public final byte[] writeReplace() {
        SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 105) % 128;
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson(this.writeReplace);
        byte[] bArr = this.writeReplace;
        IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 117) % 128;
        return bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x023f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, char c, int i2, java.lang.Object[] objArr) {
        float f;
        java.lang.Throwable cause;
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i2];
        getcvmmodel.valueOf = 0;
        while (true) {
            f = 0.0f;
            if (getcvmmodel.valueOf >= i2) {
                break;
            }
            $11 = ($10 + 7) % 128;
            int i3 = getcvmmodel.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(RecordsJson[i + getcvmmodel.valueOf])};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 48, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 382, (char) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 62388));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b((short) 0, -1, (short) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                }
                java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(getAid), java.lang.Integer.valueOf(c)};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 3966, (char) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 40223))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                }
                jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 33, android.os.Process.getGidForName("") + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE, (char) (android.view.ViewConfiguration.getTouchSlop() >> 8))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
            } catch (java.lang.Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i2];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            int i4 = $11 + 29;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
                java.lang.Object[] objArr6 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE, (char) android.widget.ExpandableListView.getPackedPositionGroup(0L))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
                throw new java.lang.ArithmeticException();
            }
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr7 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj5 == null) {
                obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) (1 - (android.view.ViewConfiguration.getScrollFriction() > f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == f ? 0 : -1))))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj5);
            }
            ((java.lang.reflect.Method) obj5).invoke(null, objArr7);
            f = 0.0f;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    public final byte[] AlternateContactlessPaymentDataJson() {
        SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 71) % 128;
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson(this.AlternateContactlessPaymentDataJson);
        byte[] bArr = this.AlternateContactlessPaymentDataJson;
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 59;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    public final byte[] valueOf() {
        SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 59) % 128;
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson(this.DigitizedCardProfile);
        byte[] bArr = this.DigitizedCardProfile;
        IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 33) % 128;
        return bArr;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        SdkCoreAlternateContactlessPaymentDataImpl = 0;
        IccPrivateKeyCrtComponentsJson = 1;
        RecordsJson = new char[]{61898, 14128, 31752, 42366, 59985, 4888};
        getAid = -4023639746876827582L;
    }

    static void init$0() {
        $$a = new byte[]{98, 74, -39, 82};
        $$b = 70;
    }
}
