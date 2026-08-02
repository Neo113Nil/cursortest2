package com.mastercard.mpsdk.remotemanagement.api.json;

/* loaded from: classes4.dex */
public class GetTaskStatusResponseEncrypted extends com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiResponseEncrypted {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] AlternateContactlessPaymentDataJson;
    private static int valueOf;
    private static char values;
    private static int writeReplace;

    @com.payair.hce.setSelectionFromTop(valueOf = "status")
    private java.lang.String status;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, short s, short s2, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = (s * 4) + 1;
        int i5 = (i * 4) + 4;
        int i6 = 73 - (s2 * 8);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i7 = i4;
            i3 = 0;
            i5++;
            i6 = (-i6) + i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = i6;
            i6 = bArr[i5];
            i5++;
            i6 = (-i6) + i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i4) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i4) {
            }
        }
    }

    public GetTaskStatusResponseEncrypted() {
    }

    public GetTaskStatusResponseEncrypted(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        super(str, str2, str3, str4);
        this.status = str5;
    }

    public java.lang.String getStatus() {
        int i = writeReplace + 7;
        valueOf = i % 128;
        java.lang.String str = this.status;
        if (i % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    public void setStatus(java.lang.String str) {
        int i = valueOf + 87;
        writeReplace = i % 128;
        if (i % 2 != 0) {
            this.status = str;
        } else {
            this.status = str;
            throw null;
        }
    }

    public static com.mastercard.mpsdk.remotemanagement.api.json.GetTaskStatusResponseEncrypted valueOf(byte[] bArr) {
        java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(new java.io.ByteArrayInputStream(bArr));
        com.payair.hce.setOnItemSelectedListener setonitemselectedlistener = new com.payair.hce.setOnItemSelectedListener();
        com.mastercard.mpsdk.remotemanagement.api.json.GetTaskStatusResponseEncrypted getTaskStatusResponseEncrypted = (com.mastercard.mpsdk.remotemanagement.api.json.GetTaskStatusResponseEncrypted) com.payair.hce.setOnItemSelectedListener.values(new java.lang.Object[]{setonitemselectedlistener, inputStreamReader, com.mastercard.mpsdk.remotemanagement.api.json.GetTaskStatusResponseEncrypted.class}, 509207078, -509207074, java.lang.System.identityHashCode(setonitemselectedlistener));
        int i = writeReplace + 121;
        valueOf = i % 128;
        if (i % 2 == 0) {
            return getTaskStatusResponseEncrypted;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiResponseEncrypted
    public java.lang.String toJsonString() {
        com.payair.hce.setChildDivider setchilddivider = new com.payair.hce.setChildDivider();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("\u0006\b\u0003\u0000\u0004\u0002㘦", android.text.TextUtils.getTrimmedLength("") + 7, (byte) (60 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), objArr);
        setchilddivider.valueOf(((java.lang.String) objArr[0]).intern());
        setchilddivider.AlternateContactlessPaymentDataJson(new com.payair.hce.getSystemServiceName(), java.lang.Void.TYPE);
        java.lang.String DigitizedCardProfile = setchilddivider.DigitizedCardProfile(this);
        valueOf = (writeReplace + 53) % 128;
        return DigitizedCardProfile;
    }

    @Override // com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiResponseEncrypted
    public java.lang.String toString() {
        int i = writeReplace + 7;
        valueOf = i % 128;
        if (i % 2 == 0) {
            return "GetTaskStatusResponseEncrypted";
        }
        throw null;
    }

    private static void a(java.lang.String str, int i, byte b, java.lang.Object[] objArr) {
        char[] cArr;
        int i2;
        java.lang.Object obj;
        if (str != null) {
            $11 = ($10 + 31) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.DigitizedCardJson12 digitizedCardJson12 = new com.payair.hce.DigitizedCardJson12();
        char[] cArr3 = AlternateContactlessPaymentDataJson;
        java.lang.Object obj2 = null;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i3])};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                    if (obj3 == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), android.view.View.MeasureSpec.getMode(0) + 2508, (char) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 6802));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b(0, (short) 0, (short) 1, objArr3);
                        obj3 = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj3);
                    }
                    cArr4[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr2)).charValue();
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(values)};
        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
        if (obj4 == null) {
            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), android.view.View.getDefaultSize(0, 0) + 2508, (char) (6802 - android.text.TextUtils.getTrimmedLength("")));
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            b(0, (short) 0, (short) 1, objArr5);
            obj4 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj4);
        }
        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr4)).charValue();
        char[] cArr5 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr5[i2] = (char) (cArr2[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i4 = $11 + 73;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                digitizedCardJson12.values = 1;
            } else {
                digitizedCardJson12.values = 0;
            }
            while (digitizedCardJson12.values < i2) {
                digitizedCardJson12.valueOf = cArr2[digitizedCardJson12.values];
                digitizedCardJson12.writeReplace = cArr2[digitizedCardJson12.values + 1];
                if (digitizedCardJson12.valueOf == digitizedCardJson12.writeReplace) {
                    $10 = ($11 + 25) % 128;
                    cArr5[digitizedCardJson12.values] = (char) (digitizedCardJson12.valueOf - b);
                    cArr5[digitizedCardJson12.values + 1] = (char) (digitizedCardJson12.writeReplace - b);
                    obj = obj2;
                } else {
                    java.lang.Object[] objArr6 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                    java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1553139325);
                    if (obj5 == null) {
                        obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 3596, (char) (android.os.Process.myTid() >> 22))).getMethod(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1553139325, obj5);
                    }
                    if (((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr6)).intValue() == digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl) {
                        java.lang.Object[] objArr7 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                        java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(737480198);
                        if (obj6 == null) {
                            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.view.View.resolveSize(0, 0), android.widget.ExpandableListView.getPackedPositionType(0L) + 2665, (char) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 18889));
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            b(0, (short) 0, (short) 0, objArr8);
                            obj6 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(737480198, obj6);
                        }
                        obj = null;
                        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr7)).intValue();
                        int i5 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i6 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr5[digitizedCardJson12.values] = cArr3[intValue];
                        cArr5[digitizedCardJson12.values + 1] = cArr3[(i5 * charValue) + i6];
                        $11 = ($10 + 29) % 128;
                    } else {
                        obj = null;
                        if (digitizedCardJson12.DigitizedCardProfile == digitizedCardJson12.AlternateContactlessPaymentDataJson) {
                            $10 = ($11 + 53) % 128;
                            digitizedCardJson12.RecordsJson = ((digitizedCardJson12.RecordsJson + charValue) - 1) % charValue;
                            digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl = ((digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl + charValue) - 1) % charValue;
                            int i7 = digitizedCardJson12.DigitizedCardProfile;
                            int i8 = digitizedCardJson12.RecordsJson;
                            int i9 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                            int i10 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                            cArr5[digitizedCardJson12.values] = cArr3[(i7 * charValue) + i8];
                            cArr5[digitizedCardJson12.values + 1] = cArr3[(i9 * charValue) + i10];
                        } else {
                            int i11 = digitizedCardJson12.DigitizedCardProfile;
                            int i12 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                            int i13 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                            int i14 = digitizedCardJson12.RecordsJson;
                            cArr5[digitizedCardJson12.values] = cArr3[(i11 * charValue) + i12];
                            cArr5[digitizedCardJson12.values + 1] = cArr3[(i13 * charValue) + i14];
                        }
                    }
                }
                digitizedCardJson12.values += 2;
                obj2 = obj;
            }
        }
        int i15 = 0;
        while (i15 < i) {
            cArr5[i15] = (char) (cArr5[i15] ^ 13722);
            i15++;
            $11 = ($10 + 119) % 128;
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        valueOf = 0;
        writeReplace = 1;
        AlternateContactlessPaymentDataJson = new char[]{12329, 12345, 12332, 12330, 12333, 12331, 12326, 12388, 12384};
        values = (char) 1491;
    }

    static void init$0() {
        $$a = new byte[]{16, 120, -82, 58};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_UP_VALUE;
    }
}
