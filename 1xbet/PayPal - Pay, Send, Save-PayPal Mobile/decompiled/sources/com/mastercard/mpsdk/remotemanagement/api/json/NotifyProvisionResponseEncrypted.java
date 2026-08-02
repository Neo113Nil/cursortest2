package com.mastercard.mpsdk.remotemanagement.api.json;

/* loaded from: classes9.dex */
public class NotifyProvisionResponseEncrypted extends com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiResponseEncrypted {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char AlternateContactlessPaymentDataJson;
    private static char DigitizedCardProfile;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static int valueOf;
    private static char values;
    private static char writeReplace;

    private static void b(int i, int i2, byte b, java.lang.Object[] objArr) {
        int i3 = (b * 3) + 4;
        int i4 = i2 * 4;
        int i5 = 110 - (i * 4);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        int i7 = -1;
        if (bArr == null) {
            i5 = i6 + (-i3);
            i3++;
            i7 = -1;
        }
        while (true) {
            int i8 = i7 + 1;
            bArr2[i8] = (byte) i5;
            if (i8 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i9 = i3;
            i5 += -bArr[i3];
            i3 = i9 + 1;
            i7 = i8;
        }
    }

    public NotifyProvisionResponseEncrypted() {
    }

    public NotifyProvisionResponseEncrypted(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        super(str, str2, str3, str4);
    }

    @Override // com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiResponseEncrypted
    public java.lang.String toJsonString() {
        com.payair.hce.setChildDivider setchilddivider = new com.payair.hce.setChildDivider();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("ꃻ\uee0a\ueed0있彇ꛥ늂ɚ", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 6, objArr);
        setchilddivider.valueOf(((java.lang.String) objArr[0]).intern());
        setchilddivider.AlternateContactlessPaymentDataJson(new com.payair.hce.getSystemServiceName(), java.lang.Void.TYPE);
        java.lang.String DigitizedCardProfile2 = setchilddivider.DigitizedCardProfile(this);
        valueOf = (SdkCoreAlternateContactlessPaymentDataImpl + 85) % 128;
        return DigitizedCardProfile2;
    }

    public static com.mastercard.mpsdk.remotemanagement.api.json.NotifyProvisionResponseEncrypted valueOf(byte[] bArr) {
        java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(new java.io.ByteArrayInputStream(bArr));
        com.payair.hce.setOnItemSelectedListener setonitemselectedlistener = new com.payair.hce.setOnItemSelectedListener();
        com.mastercard.mpsdk.remotemanagement.api.json.NotifyProvisionResponseEncrypted notifyProvisionResponseEncrypted = (com.mastercard.mpsdk.remotemanagement.api.json.NotifyProvisionResponseEncrypted) com.payair.hce.setOnItemSelectedListener.values(new java.lang.Object[]{setonitemselectedlistener, inputStreamReader, com.mastercard.mpsdk.remotemanagement.api.json.NotifyProvisionResponseEncrypted.class}, 509207078, -509207074, java.lang.System.identityHashCode(setonitemselectedlistener));
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 61;
        valueOf = i % 128;
        if (i % 2 == 0) {
            return notifyProvisionResponseEncrypted;
        }
        throw null;
    }

    @Override // com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiResponseEncrypted
    public java.lang.String toString() {
        int i = valueOf;
        int i2 = i + 81;
        SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        SdkCoreAlternateContactlessPaymentDataImpl = (i + 79) % 128;
        return "NotifyProvisionResponseEncrypted";
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            $11 = ($10 + 113) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.getProductType getproducttype = new com.payair.hce.getProductType();
        char[] cArr3 = new char[cArr2.length];
        getproducttype.AlternateContactlessPaymentDataJson = 0;
        char[] cArr4 = new char[2];
        while (getproducttype.AlternateContactlessPaymentDataJson < cArr2.length) {
            cArr4[0] = cArr2[getproducttype.AlternateContactlessPaymentDataJson];
            cArr4[1] = cArr2[getproducttype.AlternateContactlessPaymentDataJson + 1];
            $11 = ($10 + 19) % 128;
            int i2 = 58224;
            for (int i3 = 0; i3 < 16; i3++) {
                $11 = ($10 + 33) % 128;
                char c = cArr4[1];
                char c2 = cArr4[0];
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf((c2 + i2) ^ ((c2 << 4) + ((char) (DigitizedCardProfile ^ 2144259807102049818L)))), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson)};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(63 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 1335 - android.view.View.resolveSizeAndState(0, 0, 0), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b(0, 0, (byte) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj);
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    cArr4[1] = charValue;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr4[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (writeReplace ^ 2144259807102049818L))) ^ r15), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(values)};
                    int i4 = charValue + i2;
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(61 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), android.view.MotionEvent.axisFromString("") + 1336, (char) android.graphics.Color.green(0));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b(0, 0, (byte) 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                    }
                    cArr4[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i2 -= 40503;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3[getproducttype.AlternateContactlessPaymentDataJson] = cArr4[0];
            cArr3[getproducttype.AlternateContactlessPaymentDataJson + 1] = cArr4[1];
            java.lang.Object[] objArr6 = {getproducttype, getproducttype};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1765331150);
            if (obj3 == null) {
                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionChild(0L) + 54, android.widget.ExpandableListView.getPackedPositionType(0L) + 3543, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
            int i5 = $10 + 85;
            $11 = i5 % 128;
            int i6 = i5 % 2;
        }
        objArr[0] = new java.lang.String(cArr3, 0, i);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        valueOf = 0;
        SdkCoreAlternateContactlessPaymentDataImpl = 1;
        writeReplace = (char) 1454;
        values = (char) 50975;
        DigitizedCardProfile = (char) 54230;
        AlternateContactlessPaymentDataJson = (char) 34850;
    }

    static void init$0() {
        $$a = new byte[]{73, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -116, -114};
        $$b = 91;
    }
}
