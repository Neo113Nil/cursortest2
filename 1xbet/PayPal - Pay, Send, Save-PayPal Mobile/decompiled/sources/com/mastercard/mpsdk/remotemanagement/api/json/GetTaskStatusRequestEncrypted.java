package com.mastercard.mpsdk.remotemanagement.api.json;

/* loaded from: classes4.dex */
public class GetTaskStatusRequestEncrypted extends com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiRequestEncrypted {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static long DigitizedCardProfile;
    private static char valueOf;
    private static int values;
    private static int writeReplace;
    private final com.payair.hce.checkPermission mLogUtils;

    @com.payair.hce.setSelectionFromTop(valueOf = "taskId")
    private java.lang.String taskId;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, byte b, byte b2, java.lang.Object[] objArr) {
        int i2;
        int i3 = i * 4;
        byte[] bArr = $$a;
        int i4 = b + 4;
        int i5 = b2 + 102;
        byte[] bArr2 = new byte[1 - i3];
        if (bArr == null) {
            int i6 = i5;
            int i7 = 0;
            int i8 = i4;
            int i9 = (-i4) + i6;
            i2 = i7;
            int i10 = i8;
            i5 = i9;
            i4 = i10;
            int i11 = i4 + 1;
            bArr2[i2] = (byte) i5;
            if (i2 == 0 - i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i12 = i5;
            i8 = i11;
            i4 = bArr[i11];
            i7 = i2 + 1;
            i6 = i12;
            int i92 = (-i4) + i6;
            i2 = i7;
            int i102 = i8;
            i5 = i92;
            i4 = i102;
            int i112 = i4 + 1;
            bArr2[i2] = (byte) i5;
            if (i2 == 0 - i3) {
            }
        } else {
            i2 = 0;
            int i1122 = i4 + 1;
            bArr2[i2] = (byte) i5;
            if (i2 == 0 - i3) {
            }
        }
    }

    public GetTaskStatusRequestEncrypted(java.lang.String str, java.lang.String str2) {
        super(str);
        this.mLogUtils = com.payair.hce.checkPermission.DigitizedCardProfile(com.payair.hce.registerReceiver.values);
        this.taskId = str2;
    }

    public java.lang.String getTaskId() {
        int i = (writeReplace + 73) % 128;
        values = i;
        java.lang.String str = this.taskId;
        writeReplace = (i + 107) % 128;
        return str;
    }

    public com.mastercard.mpsdk.remotemanagement.api.json.GetTaskStatusRequestEncrypted setTaskId(java.lang.String str) {
        int i = (writeReplace + 7) % 128;
        values = i;
        this.taskId = str;
        int i2 = i + 93;
        writeReplace = i2 % 128;
        if (i2 % 2 == 0) {
            return this;
        }
        throw null;
    }

    public java.lang.String buildAsJson() {
        com.payair.hce.setChildDivider setchilddivider = new com.payair.hce.setChildDivider();
        int maximumFlingVelocity = android.view.ViewConfiguration.getMaximumFlingVelocity();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("\u0000\u0000\u0000\u0000", "췂忴᪥ҍ硓ɟቐ", "쎲䂿\u1a8cｙ", (-1941913661) - (maximumFlingVelocity >> 16), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), objArr);
        setchilddivider.valueOf(((java.lang.String) objArr[0]).intern());
        setchilddivider.AlternateContactlessPaymentDataJson(new com.payair.hce.getSystemServiceName(), java.lang.Void.TYPE);
        java.lang.String DigitizedCardProfile2 = setchilddivider.DigitizedCardProfile(this);
        values = (writeReplace + 99) % 128;
        return DigitizedCardProfile2;
    }

    public java.lang.String toString() {
        int i = values + 35;
        writeReplace = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        java.lang.String simpleName = getClass().getSimpleName();
        int i2 = writeReplace + 23;
        values = i2 % 128;
        if (i2 % 2 != 0) {
            return simpleName;
        }
        throw null;
    }

    private static void a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, char c, java.lang.Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        int i2 = $10 + 1;
        $11 = i2 % 128;
        char c2 = 2;
        java.lang.Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (str3 != null) {
            cArr = str3.toCharArray();
            $10 = ($11 + 75) % 128;
        } else {
            cArr = str3;
        }
        char[] cArr3 = cArr;
        char[] charArray = str2 != null ? str2.toCharArray() : str2;
        if (str != null) {
            cArr2 = str.toCharArray();
            int i3 = $11 + 45;
            $10 = i3 % 128;
            int i4 = i3 % 2;
        } else {
            cArr2 = str;
        }
        char[] cArr4 = cArr2;
        com.payair.hce.getWalletData getwalletdata = new com.payair.hce.getWalletData();
        int length = cArr3.length;
        char[] cArr5 = new char[length];
        int length2 = cArr4.length;
        char[] cArr6 = new char[length2];
        byte b = 0;
        java.lang.System.arraycopy(cArr3, 0, cArr5, 0, length);
        java.lang.System.arraycopy(cArr4, 0, cArr6, 0, length2);
        cArr5[0] = (char) (cArr5[0] ^ c);
        cArr6[2] = (char) (cArr6[2] + ((char) i));
        int length3 = charArray.length;
        char[] cArr7 = new char[length3];
        getwalletdata.writeReplace = 0;
        while (getwalletdata.writeReplace < length3) {
            try {
                java.lang.Object[] objArr2 = {getwalletdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
                if (obj2 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(71 - android.view.View.resolveSizeAndState(b, b, b), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(b) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(b) == 0.0d ? 0 : -1)) + 1179, (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(b, (byte) -1, b, objArr3);
                    java.lang.String str4 = (java.lang.String) objArr3[b];
                    java.lang.Class<?>[] clsArr = new java.lang.Class[1];
                    clsArr[b] = java.lang.Object.class;
                    obj2 = cls.getMethod(str4, clsArr);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj2);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(obj, objArr2)).intValue();
                java.lang.Object[] objArr4 = {getwalletdata};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                if (obj3 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myPid() >> 22) + 30, 3443 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (android.graphics.Color.green((int) b) + 3831));
                    java.lang.Class<?>[] clsArr2 = new java.lang.Class[1];
                    clsArr2[b] = java.lang.Object.class;
                    obj3 = cls2.getMethod("g", clsArr2);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj3);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(obj, objArr4)).intValue();
                char c3 = cArr5[getwalletdata.writeReplace % 4];
                java.lang.Object[] objArr5 = new java.lang.Object[3];
                objArr5[c2] = java.lang.Integer.valueOf(cArr6[intValue]);
                objArr5[1] = java.lang.Integer.valueOf(c3 * 32718);
                objArr5[b] = getwalletdata;
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                if (obj4 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), 1864 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (41775 - android.text.TextUtils.getTrimmedLength("")));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    b(b, (byte) -1, (byte) 3, objArr6);
                    java.lang.String str5 = (java.lang.String) objArr6[b];
                    java.lang.Class<?>[] clsArr3 = new java.lang.Class[3];
                    clsArr3[b] = java.lang.Object.class;
                    clsArr3[1] = java.lang.Integer.TYPE;
                    clsArr3[2] = java.lang.Integer.TYPE;
                    obj4 = cls3.getMethod(str5, clsArr3);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr5);
                char c4 = cArr5[intValue2];
                java.lang.Object[] objArr7 = new java.lang.Object[2];
                objArr7[1] = java.lang.Integer.valueOf(cArr6[intValue]);
                objArr7[b] = java.lang.Integer.valueOf(c4 * 32718);
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                if (obj5 == null) {
                    java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(b) + 29, android.view.KeyEvent.keyCodeFromString("") + 3133, (char) android.view.KeyEvent.normalizeMetaState(b));
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    b(b, (byte) -1, (byte) $$a.length, objArr8);
                    java.lang.String str6 = (java.lang.String) objArr8[b];
                    java.lang.Class<?>[] clsArr4 = new java.lang.Class[2];
                    clsArr4[b] = java.lang.Integer.TYPE;
                    clsArr4[1] = java.lang.Integer.TYPE;
                    obj5 = cls4.getMethod(str6, clsArr4);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj5);
                }
                cArr6[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj5).invoke(null, objArr7)).charValue();
                cArr5[intValue2] = getwalletdata.values;
                cArr7[getwalletdata.writeReplace] = (char) ((((int) (AlternateContactlessPaymentDataJson ^ 1263759066225628708L)) ^ ((charArray[getwalletdata.writeReplace] ^ cArr5[intValue2]) ^ (DigitizedCardProfile ^ 1263759066225628708L))) ^ ((char) (valueOf ^ 1263759066225628708L)));
                getwalletdata.writeReplace++;
                c2 = 2;
                obj = null;
                b = 0;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new java.lang.String(cArr7);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        writeReplace = 0;
        values = 1;
        DigitizedCardProfile = 1263759066225628708L;
        AlternateContactlessPaymentDataJson = -804334044;
        valueOf = (char) 62334;
    }

    static void init$0() {
        $$a = new byte[]{106, 94, -55, -52};
        $$b = 181;
    }
}
