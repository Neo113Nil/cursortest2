package com.mastercard.mpsdk.remotemanagement.api.json;

/* loaded from: classes4.dex */
public class DeleteCardResponseEncrypted extends com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiResponseEncrypted {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] AlternateContactlessPaymentDataJson;
    private static int values;
    private static int writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, short s, byte b, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = (s * 3) + 1;
        int i5 = 111 - (i * 2);
        int i6 = 4 - (b * 2);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i7 = i4;
            i5 = i6;
            i3 = 0;
            i6++;
            i5 += -i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i6];
            i6++;
            i5 += -i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
            }
        }
    }

    public DeleteCardResponseEncrypted() {
    }

    public DeleteCardResponseEncrypted(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        super(str, str2, str3, str4);
    }

    @Override // com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiResponseEncrypted
    public java.lang.String toJsonString() {
        com.payair.hce.setChildDivider setchilddivider = new com.payair.hce.setChildDivider();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(new int[]{0, 7, 107, 2}, "\u0001\u0000\u0001\u0000\u0000\u0001\u0001", true, objArr);
        setchilddivider.valueOf(((java.lang.String) objArr[0]).intern());
        setchilddivider.AlternateContactlessPaymentDataJson(new com.payair.hce.getSystemServiceName(), java.lang.Void.TYPE);
        java.lang.String DigitizedCardProfile = setchilddivider.DigitizedCardProfile(this);
        values = (writeReplace + 17) % 128;
        return DigitizedCardProfile;
    }

    @Override // com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiResponseEncrypted
    public java.lang.String toString() {
        int i = (writeReplace + 119) % 128;
        values = i;
        int i2 = i + 13;
        writeReplace = i2 % 128;
        if (i2 % 2 == 0) {
            return "NotifyProvisionResponseEncrypted";
        }
        throw new java.lang.ArithmeticException();
    }

    private static void a(int[] iArr, java.lang.String str, boolean z, java.lang.Object[] objArr) {
        char[] cArr;
        int i;
        char[] cArr2;
        int i2;
        java.lang.String str2 = str;
        $11 = ($10 + 83) % 128;
        byte[] bArr = str2;
        if (str2 != null) {
            byte[] bytes = str2.getBytes("ISO-8859-1");
            $11 = ($10 + 15) % 128;
            bArr = bytes;
        }
        byte[] bArr2 = bArr;
        com.payair.hce.getAccountType getaccounttype = new com.payair.hce.getAccountType();
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = 1;
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr3 = AlternateContactlessPaymentDataJson;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[i5];
                    objArr2[i3] = java.lang.Integer.valueOf(cArr3[i9]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getTrimmedLength("") + 29, 2807 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) android.text.TextUtils.getOffsetBefore("", i3));
                        byte b = (byte) ($$b & 7);
                        byte b2 = (byte) (b - 1);
                        cArr2 = cArr3;
                        i2 = length;
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b(b, b2, b2, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj);
                    } else {
                        cArr2 = cArr3;
                        i2 = length;
                    }
                    cArr4[i9] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i9++;
                    cArr3 = cArr2;
                    length = i2;
                    i3 = 0;
                    i5 = 1;
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
        char[] cArr5 = new char[i6];
        java.lang.System.arraycopy(cArr3, i4, cArr5, 0, i6);
        if (bArr2 != null) {
            int i10 = $11 + 43;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                cArr = new char[i6];
                i = 1;
            } else {
                cArr = new char[i6];
                i = 0;
            }
            getaccounttype.writeReplace = i;
            char c = 0;
            while (getaccounttype.writeReplace < i6) {
                if (bArr2[getaccounttype.writeReplace] == 1) {
                    int i11 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr5[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), android.text.TextUtils.getCapsMode("", 0, 0) + 2836, (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b(2, (short) 0, (byte) 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj2);
                    }
                    cArr[i11] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                } else {
                    int i12 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr5[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2110984860);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 42, (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2879, (char) (android.view.KeyEvent.getMaxKeyCode() >> 16));
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        b(0, (short) 0, (byte) 0, objArr7);
                        obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2110984860, obj3);
                    }
                    cArr[i12] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                }
                c = cArr[getaccounttype.writeReplace];
                java.lang.Object[] objArr8 = {getaccounttype, getaccounttype};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 211, (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16))).getMethod("l", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1714689752, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
                $11 = ($10 + 51) % 128;
            }
            cArr5 = cArr;
        }
        if (i8 > 0) {
            char[] cArr6 = new char[i6];
            java.lang.System.arraycopy(cArr5, 0, cArr6, 0, i6);
            int i13 = i6 - i8;
            java.lang.System.arraycopy(cArr6, 0, cArr5, i13, i8);
            java.lang.System.arraycopy(cArr6, i8, cArr5, 0, i13);
        }
        if (z) {
            $10 = ($11 + 9) % 128;
            char[] cArr7 = new char[i6];
            int i14 = 0;
            while (true) {
                getaccounttype.writeReplace = i14;
                if (getaccounttype.writeReplace >= i6) {
                    break;
                }
                cArr7[getaccounttype.writeReplace] = cArr5[(i6 - getaccounttype.writeReplace) - 1];
                i14 = getaccounttype.writeReplace + 1;
            }
            cArr5 = cArr7;
        }
        if (i7 > 0) {
            int i15 = 0;
            while (true) {
                getaccounttype.writeReplace = i15;
                if (getaccounttype.writeReplace >= i6) {
                    break;
                }
                int i16 = $11 + 115;
                $10 = i16 % 128;
                if (i16 % 2 != 0) {
                    cArr5[getaccounttype.writeReplace] = (char) (cArr5[getaccounttype.writeReplace] - iArr[5]);
                    i15 = getaccounttype.writeReplace % 1;
                } else {
                    cArr5[getaccounttype.writeReplace] = (char) (cArr5[getaccounttype.writeReplace] - iArr[2]);
                    i15 = getaccounttype.writeReplace + 1;
                }
            }
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        writeReplace = 0;
        values = 1;
        AlternateContactlessPaymentDataJson = new char[]{16770, 16729, 16759, 16656, 16667, 16671, 16668};
    }

    static void init$0() {
        $$a = new byte[]{org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -77, -89, 4};
        $$b = 81;
    }
}
