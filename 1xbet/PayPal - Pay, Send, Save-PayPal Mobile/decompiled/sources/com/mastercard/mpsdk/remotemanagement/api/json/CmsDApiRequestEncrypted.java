package com.mastercard.mpsdk.remotemanagement.api.json;

/* loaded from: classes4.dex */
public class CmsDApiRequestEncrypted {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static int values;
    private static int writeReplace;
    protected final com.payair.hce.checkPermission mLogUtils = com.payair.hce.checkPermission.DigitizedCardProfile(com.payair.hce.registerReceiver.values);

    @com.payair.hce.setSelectionFromTop(valueOf = "requestId")
    protected java.lang.String requestId;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(byte b, byte b2, byte b3, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3 = 3 - (b3 * 4);
        int i4 = (b2 * 2) + 115;
        int i5 = 1 - (b * 2);
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i6 = i5;
            i2 = 0;
            i4 += i6;
            i = i2;
            i2 = i + 1;
            i3++;
            bArr2[i] = (byte) i4;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = bArr[i3];
            i4 += i6;
            i = i2;
            i2 = i + 1;
            i3++;
            bArr2[i] = (byte) i4;
            if (i2 == i5) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            i3++;
            bArr2[i] = (byte) i4;
            if (i2 == i5) {
            }
        }
    }

    public CmsDApiRequestEncrypted(java.lang.String str) {
        this.requestId = str;
    }

    public java.lang.String getRequestId() {
        int i = (AlternateContactlessPaymentDataJson + 83) % 128;
        values = i;
        java.lang.String str = this.requestId;
        AlternateContactlessPaymentDataJson = (i + 51) % 128;
        return str;
    }

    public com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiRequestEncrypted setRequestId(java.lang.String str) {
        int i = (values + 75) % 128;
        AlternateContactlessPaymentDataJson = i;
        this.requestId = str;
        int i2 = i + 1;
        values = i2 % 128;
        if (i2 % 2 == 0) {
            return this;
        }
        throw null;
    }

    public static com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiRequestEncrypted valueOf(byte[] bArr) {
        java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(new java.io.ByteArrayInputStream(bArr));
        com.payair.hce.setOnItemSelectedListener setonitemselectedlistener = new com.payair.hce.setOnItemSelectedListener();
        com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiRequestEncrypted cmsDApiRequestEncrypted = (com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiRequestEncrypted) com.payair.hce.setOnItemSelectedListener.values(new java.lang.Object[]{setonitemselectedlistener, inputStreamReader, com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiRequestEncrypted.class}, 509207078, -509207074, java.lang.System.identityHashCode(setonitemselectedlistener));
        int i = values + 3;
        AlternateContactlessPaymentDataJson = i % 128;
        if (i % 2 != 0) {
            return cmsDApiRequestEncrypted;
        }
        throw null;
    }

    public final java.lang.String toJsonString() {
        com.payair.hce.setChildDivider setchilddivider = new com.payair.hce.setChildDivider();
        java.lang.Object[] objArr = new java.lang.Object[1];
        c('7' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), true, "\u001b\u001b\t\u0014\u000bￖￒ", android.view.View.resolveSize(0, 0) + 103, android.view.KeyEvent.getDeadChar(0, 0) + 7, objArr);
        setchilddivider.valueOf(((java.lang.String) objArr[0]).intern());
        java.lang.String DigitizedCardProfile = setchilddivider.DigitizedCardProfile(this);
        int i = AlternateContactlessPaymentDataJson + 57;
        values = i % 128;
        if (i % 2 == 0) {
            return DigitizedCardProfile;
        }
        throw null;
    }

    private static void c(int i, boolean z, java.lang.String str, int i2, int i3, java.lang.Object[] objArr) {
        char[] cArr;
        int i4 = $11;
        $10 = (i4 + 31) % 128;
        if (str != null) {
            $10 = (i4 + 65) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.DigitizedCardJson11 digitizedCardJson11 = new com.payair.hce.DigitizedCardJson11();
        char[] cArr3 = new char[i];
        digitizedCardJson11.DigitizedCardProfile = 0;
        while (digitizedCardJson11.DigitizedCardProfile < i) {
            digitizedCardJson11.values = cArr2[digitizedCardJson11.DigitizedCardProfile];
            cArr3[digitizedCardJson11.DigitizedCardProfile] = (char) (i2 + digitizedCardJson11.values);
            int i5 = digitizedCardJson11.DigitizedCardProfile;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i5]), java.lang.Integer.valueOf(writeReplace)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(42 - android.view.MotionEvent.axisFromString(""), 2072 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (60037 - android.text.TextUtils.indexOf("", "", 0, 0)));
                    byte b = (byte) ($$e - 5);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    d(b, b, b, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                }
                cArr3[i5] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 53, android.text.TextUtils.getOffsetAfter("", 0) + 3543, (char) android.widget.ExpandableListView.getPackedPositionGroup(0L))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj2);
                }
                ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
                $11 = ($10 + 51) % 128;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i3 > 0) {
            digitizedCardJson11.AlternateContactlessPaymentDataJson = i3;
            char[] cArr4 = new char[i];
            java.lang.System.arraycopy(cArr3, 0, cArr4, 0, i);
            java.lang.System.arraycopy(cArr4, 0, cArr3, i - digitizedCardJson11.AlternateContactlessPaymentDataJson, digitizedCardJson11.AlternateContactlessPaymentDataJson);
            java.lang.System.arraycopy(cArr4, digitizedCardJson11.AlternateContactlessPaymentDataJson, cArr3, 0, i - digitizedCardJson11.AlternateContactlessPaymentDataJson);
        }
        if (z) {
            $10 = ($11 + 49) % 128;
            char[] cArr5 = new char[i];
            digitizedCardJson11.DigitizedCardProfile = 0;
            while (digitizedCardJson11.DigitizedCardProfile < i) {
                cArr5[digitizedCardJson11.DigitizedCardProfile] = cArr3[(i - digitizedCardJson11.DigitizedCardProfile) - 1];
                java.lang.Object[] objArr5 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 52, 3591 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.text.TextUtils.getTrimmedLength(""))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
            }
            cArr3 = cArr5;
        }
        java.lang.String str2 = new java.lang.String(cArr3);
        int i6 = $10 + 71;
        $11 = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        values = 0;
        AlternateContactlessPaymentDataJson = 1;
        writeReplace = 1889207150;
    }

    static void init$0() {
        $$d = new byte[]{76, 91, 9, -2};
        $$e = 5;
    }
}
