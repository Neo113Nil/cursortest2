package com.mastercard.mpsdk.remotemanagement.api.json;

/* loaded from: classes4.dex */
public class ChangeMobilePinResponseEncrypted extends com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiResponseEncrypted {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] AlternateContactlessPaymentDataJson;
    private static char DigitizedCardProfile;
    private static int valueOf;
    private static int values;

    @com.payair.hce.setSelectionFromTop(valueOf = "mobilePinTriesRemaining")
    private int mobilePinTriesRemaining;

    @com.payair.hce.setSelectionFromTop(valueOf = "result")
    private java.lang.String result;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, int i3, java.lang.Object[] objArr) {
        int i4;
        int i5 = 3 - (i3 * 3);
        byte[] bArr = $$a;
        int i6 = i2 * 2;
        int i7 = 73 - (i * 8);
        byte[] bArr2 = new byte[i6 + 1];
        if (bArr == null) {
            int i8 = i5;
            int i9 = 0;
            i7 += i5;
            i5 = i8;
            i4 = i9;
            int i10 = i5 + 1;
            bArr2[i4] = (byte) i7;
            if (i4 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i11 = i4 + 1;
            i8 = i10;
            i5 = bArr[i10];
            i9 = i11;
            i7 += i5;
            i5 = i8;
            i4 = i9;
            int i102 = i5 + 1;
            bArr2[i4] = (byte) i7;
            if (i4 == i6) {
            }
        } else {
            i4 = 0;
            int i1022 = i5 + 1;
            bArr2[i4] = (byte) i7;
            if (i4 == i6) {
            }
        }
    }

    public ChangeMobilePinResponseEncrypted() {
    }

    public ChangeMobilePinResponseEncrypted(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i) {
        super(str, str2, str3, str4);
        this.result = str5;
        this.mobilePinTriesRemaining = i;
    }

    public java.lang.String getResult() {
        int i = values;
        int i2 = i + 91;
        valueOf = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        java.lang.String str = this.result;
        valueOf = (i + 75) % 128;
        return str;
    }

    public void setResult(java.lang.String str) {
        int i = valueOf;
        values = (i + 5) % 128;
        this.result = str;
        values = (i + 11) % 128;
    }

    public int getMobilePinTriesRemaining() {
        int i = (valueOf + 63) % 128;
        values = i;
        int i2 = this.mobilePinTriesRemaining;
        valueOf = (i + 79) % 128;
        return i2;
    }

    public void setMobilePinTriesRemaining(int i) {
        int i2 = valueOf;
        values = (i2 + 57) % 128;
        this.mobilePinTriesRemaining = i;
        int i3 = i2 + 75;
        values = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiResponseEncrypted
    public java.lang.String toJsonString() {
        com.payair.hce.setChildDivider setchilddivider = new com.payair.hce.setChildDivider();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("\u0000\b\b\u0004\u0007\u0002㗲", 7 - android.view.KeyEvent.keyCodeFromString(""), (byte) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 8), objArr);
        setchilddivider.valueOf(((java.lang.String) objArr[0]).intern());
        setchilddivider.AlternateContactlessPaymentDataJson(new com.payair.hce.getSystemServiceName(), java.lang.Void.TYPE);
        java.lang.String DigitizedCardProfile2 = setchilddivider.DigitizedCardProfile(this);
        int i = values + 21;
        valueOf = i % 128;
        if (i % 2 == 0) {
            return DigitizedCardProfile2;
        }
        throw null;
    }

    public static com.mastercard.mpsdk.remotemanagement.api.json.ChangeMobilePinResponseEncrypted valueOf(byte[] bArr) {
        java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(new java.io.ByteArrayInputStream(bArr));
        com.payair.hce.setOnItemSelectedListener setonitemselectedlistener = new com.payair.hce.setOnItemSelectedListener();
        com.mastercard.mpsdk.remotemanagement.api.json.ChangeMobilePinResponseEncrypted changeMobilePinResponseEncrypted = (com.mastercard.mpsdk.remotemanagement.api.json.ChangeMobilePinResponseEncrypted) com.payair.hce.setOnItemSelectedListener.values(new java.lang.Object[]{setonitemselectedlistener, inputStreamReader, com.mastercard.mpsdk.remotemanagement.api.json.ChangeMobilePinResponseEncrypted.class}, 509207078, -509207074, java.lang.System.identityHashCode(setonitemselectedlistener));
        valueOf = (values + 31) % 128;
        return changeMobilePinResponseEncrypted;
    }

    @Override // com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiResponseEncrypted
    public java.lang.String toString() {
        int i = values + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        int i2 = i % 128;
        valueOf = i2;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        int i3 = i2 + 113;
        values = i3 % 128;
        if (i3 % 2 != 0) {
            return "ChangeMobilePinResponseEncrypted";
        }
        throw new java.lang.ArithmeticException();
    }

    private static void a(java.lang.String str, int i, byte b, java.lang.Object[] objArr) {
        int i2;
        $10 = ($11 + 69) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.DigitizedCardJson12 digitizedCardJson12 = new com.payair.hce.DigitizedCardJson12();
        char[] cArr = AlternateContactlessPaymentDataJson;
        float f = 0.0f;
        int i3 = 48;
        int i4 = -1497284274;
        int i5 = 5;
        int i6 = 1;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                $11 = ($10 + 77) % 128;
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[i6];
                    objArr2[0] = java.lang.Integer.valueOf(cArr[i7]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(java.lang.Integer.valueOf(i4));
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMaxVolume() > f ? 1 : (android.media.AudioTrack.getMaxVolume() == f ? 0 : -1)) + i3, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2508, (char) (android.text.TextUtils.getCapsMode("", 0, 0) + 6802));
                        byte b2 = (byte) ($$b & i5);
                        byte b3 = (byte) (b2 - 1);
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b(b2, b3, b3, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj);
                    }
                    cArr2[i7] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i7++;
                    f = 0.0f;
                    i3 = 48;
                    i4 = -1497284274;
                    i5 = 5;
                    i6 = 1;
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
        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(DigitizedCardProfile)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
        long j = 0;
        if (obj2 == null) {
            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 2508, (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 6803));
            byte b4 = (byte) ($$b & 5);
            byte b5 = (byte) (b4 - 1);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            b(b4, b5, b5, objArr5);
            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj2);
        }
        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr3[i2] = (char) (charArray[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            $11 = ($10 + 49) % 128;
            digitizedCardJson12.values = 0;
            while (digitizedCardJson12.values < i2) {
                digitizedCardJson12.valueOf = charArray[digitizedCardJson12.values];
                digitizedCardJson12.writeReplace = charArray[digitizedCardJson12.values + 1];
                if (digitizedCardJson12.valueOf == digitizedCardJson12.writeReplace) {
                    cArr3[digitizedCardJson12.values] = (char) (digitizedCardJson12.valueOf - b);
                    cArr3[digitizedCardJson12.values + 1] = (char) (digitizedCardJson12.writeReplace - b);
                    $10 = ($11 + 79) % 128;
                } else {
                    java.lang.Object[] objArr6 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1553139325);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)) + 29, 3597 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)), (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)))).getMethod(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1553139325, obj3);
                    }
                    if (((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).intValue() == digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl) {
                        java.lang.Object[] objArr7 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(737480198);
                        if (obj4 == null) {
                            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.view.View.resolveSize(0, 0), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 2664, (char) (18889 - android.view.Gravity.getAbsoluteGravity(0, 0)));
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            b(0, 0, 0, objArr8);
                            obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(737480198, obj4);
                        }
                        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).intValue();
                        int i8 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i9 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr3[digitizedCardJson12.values] = cArr[intValue];
                        cArr3[digitizedCardJson12.values + 1] = cArr[(i8 * charValue) + i9];
                    } else if (digitizedCardJson12.DigitizedCardProfile == digitizedCardJson12.AlternateContactlessPaymentDataJson) {
                        $11 = ($10 + 75) % 128;
                        digitizedCardJson12.RecordsJson = ((digitizedCardJson12.RecordsJson + charValue) - 1) % charValue;
                        digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl = ((digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl + charValue) - 1) % charValue;
                        int i10 = digitizedCardJson12.DigitizedCardProfile;
                        int i11 = digitizedCardJson12.RecordsJson;
                        int i12 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i13 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr3[digitizedCardJson12.values] = cArr[(i10 * charValue) + i11];
                        cArr3[digitizedCardJson12.values + 1] = cArr[(i12 * charValue) + i13];
                    } else {
                        int i14 = digitizedCardJson12.DigitizedCardProfile;
                        int i15 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        int i16 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i17 = digitizedCardJson12.RecordsJson;
                        cArr3[digitizedCardJson12.values] = cArr[(i14 * charValue) + i15];
                        cArr3[digitizedCardJson12.values + 1] = cArr[(i16 * charValue) + i17];
                    }
                }
                digitizedCardJson12.values += 2;
                j = 0;
            }
        }
        int i18 = 0;
        while (i18 < i) {
            cArr3[i18] = (char) (cArr3[i18] ^ 13722);
            i18++;
            $11 = ($10 + 7) % 128;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        valueOf = 0;
        values = 1;
        AlternateContactlessPaymentDataJson = new char[]{1489, 12345, 12384, 1490, 1491, 12326, 12388, 12329, 12331};
        DigitizedCardProfile = (char) 1491;
    }

    static void init$0() {
        $$a = new byte[]{117, -82, -100, com.visa.cbp.getEncExpo.onUnminimized};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE;
    }
}
