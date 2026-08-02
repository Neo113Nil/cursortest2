package com.mastercard.mpsdk.remotemanagement.api.json;

/* loaded from: classes4.dex */
public class CmsDApiRequest {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static char[] valueOf;
    private static int writeReplace;

    @com.payair.hce.setSelectionFromTop(valueOf = "authenticationCode")
    private byte[] authenticationCode;

    @com.payair.hce.setSelectionFromTop(valueOf = "encryptedData")
    private java.lang.String encryptedData;
    private final com.payair.hce.checkPermission mLogUtils = com.payair.hce.checkPermission.DigitizedCardProfile(com.payair.hce.registerReceiver.values);

    @com.payair.hce.setSelectionFromTop(valueOf = "mobileKeysetId")
    private java.lang.String mobileKeysetId;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, int i, byte b2, java.lang.Object[] objArr) {
        int i2;
        byte[] bArr = $$a;
        int i3 = 3 - (b2 * 2);
        int i4 = b * 4;
        int i5 = 111 - (i * 2);
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i6 = i3;
            int i7 = 0;
            i5 += i3;
            i3 = i6;
            i2 = i7;
            bArr2[i2] = (byte) i5;
            int i8 = i3 + 1;
            i7 = i2 + 1;
            if (i2 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = i8;
            i3 = bArr[i8];
            i5 += i3;
            i3 = i6;
            i2 = i7;
            bArr2[i2] = (byte) i5;
            int i82 = i3 + 1;
            i7 = i2 + 1;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            int i822 = i3 + 1;
            i7 = i2 + 1;
            if (i2 == i4) {
            }
        }
    }

    public CmsDApiRequest(java.lang.String str, byte[] bArr, java.lang.String str2) {
        this.mobileKeysetId = str;
        this.authenticationCode = bArr;
        this.encryptedData = str2;
    }

    public static com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiRequest valueOf(java.lang.String str) {
        com.payair.hce.setOnItemSelectedListener setonitemselectedlistener = new com.payair.hce.setOnItemSelectedListener();
        com.payair.hce.bindServiceAsUser bindserviceasuser = new com.payair.hce.bindServiceAsUser();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(new int[]{0, 18, 0, 4}, "\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001", true, objArr);
        com.payair.hce.setOnItemSelectedListener setonitemselectedlistener2 = (com.payair.hce.setOnItemSelectedListener) com.payair.hce.setOnItemSelectedListener.values(new java.lang.Object[]{setonitemselectedlistener, bindserviceasuser, new java.lang.String[]{((java.lang.String) objArr[0]).intern()}}, 1908633719, -1908633716, java.lang.System.identityHashCode(setonitemselectedlistener));
        com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiRequest cmsDApiRequest = (com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiRequest) com.payair.hce.setOnItemSelectedListener.values(new java.lang.Object[]{setonitemselectedlistener2, str, com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiRequest.class}, -982165709, 982165716, java.lang.System.identityHashCode(setonitemselectedlistener2));
        AlternateContactlessPaymentDataJson = (writeReplace + 41) % 128;
        return cmsDApiRequest;
    }

    public java.lang.String getMobileKeysetId() {
        int i = (writeReplace + 69) % 128;
        AlternateContactlessPaymentDataJson = i;
        java.lang.String str = this.mobileKeysetId;
        int i2 = i + 53;
        writeReplace = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiRequest setMobileKeysetId(java.lang.String str) {
        int i = AlternateContactlessPaymentDataJson;
        writeReplace = (i + 59) % 128;
        this.mobileKeysetId = str;
        int i2 = i + 105;
        writeReplace = i2 % 128;
        if (i2 % 2 != 0) {
            return this;
        }
        throw null;
    }

    public byte[] getAuthenticationCode() {
        int i = writeReplace + 53;
        AlternateContactlessPaymentDataJson = i % 128;
        if (i % 2 == 0) {
            return this.authenticationCode;
        }
        throw null;
    }

    public com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiRequest setAuthenticationCode(byte[] bArr) {
        int i = writeReplace;
        int i2 = i + 7;
        AlternateContactlessPaymentDataJson = i2 % 128;
        if (i2 % 2 == 0) {
            this.authenticationCode = bArr;
            AlternateContactlessPaymentDataJson = (i + 67) % 128;
            return this;
        }
        this.authenticationCode = bArr;
        throw null;
    }

    public java.lang.String getEncryptedData() {
        int i = writeReplace;
        AlternateContactlessPaymentDataJson = (i + 21) % 128;
        java.lang.String str = this.encryptedData;
        int i2 = i + 3;
        AlternateContactlessPaymentDataJson = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiRequest setEncryptedData(java.lang.String str) {
        int i = writeReplace + 117;
        int i2 = i % 128;
        AlternateContactlessPaymentDataJson = i2;
        if (i % 2 == 0) {
            this.encryptedData = str;
            int i3 = i2 + 79;
            writeReplace = i3 % 128;
            if (i3 % 2 != 0) {
                return this;
            }
            throw new java.lang.ArithmeticException();
        }
        this.encryptedData = str;
        throw new java.lang.ArithmeticException();
    }

    public java.lang.String buildAsJson() {
        com.payair.hce.setChildDivider setchilddivider = new com.payair.hce.setChildDivider();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(new int[]{18, 7, 0, 7}, "\u0000\u0000\u0001\u0001\u0001\u0000\u0000", false, objArr);
        setchilddivider.valueOf(((java.lang.String) objArr[0]).intern());
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(new int[]{0, 18, 0, 4}, "\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001", true, objArr2);
        setchilddivider.values(((java.lang.String) objArr2[0]).intern());
        setchilddivider.AlternateContactlessPaymentDataJson(new com.payair.hce.checkCallingOrSelfPermission(), byte[].class);
        setchilddivider.AlternateContactlessPaymentDataJson(new com.payair.hce.getSystemServiceName(), java.lang.Void.TYPE);
        java.lang.String DigitizedCardProfile = setchilddivider.DigitizedCardProfile(this);
        writeReplace = (AlternateContactlessPaymentDataJson + 59) % 128;
        return DigitizedCardProfile;
    }

    public java.lang.String toString() {
        writeReplace = (AlternateContactlessPaymentDataJson + 59) % 128;
        com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(this.authenticationCode).writeReplace();
        int i = writeReplace + 81;
        AlternateContactlessPaymentDataJson = i % 128;
        if (i % 2 == 0) {
            return "CmsDApiRequest";
        }
        throw null;
    }

    private static void a(int[] iArr, java.lang.String str, boolean z, java.lang.Object[] objArr) {
        int i;
        int i2;
        java.lang.String str2 = str;
        byte[] bArr = str2;
        if (str2 != null) {
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        com.payair.hce.getAccountType getaccounttype = new com.payair.hce.getAccountType();
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = 1;
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr = valueOf;
        char c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
        if (cArr != null) {
            $11 = ($10 + 119) % 128;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[i5];
                    objArr2[i3] = java.lang.Integer.valueOf(cArr[i9]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - android.widget.ExpandableListView.getPackedPositionChild(0L), 2807 - android.view.View.resolveSize(i3, i3), (char) (android.text.TextUtils.indexOf("", c, i3) + 1));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b((byte) 0, 1, (byte) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj);
                    }
                    cArr2[i9] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i9++;
                    i3 = 0;
                    i5 = 1;
                    c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
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
        char[] cArr3 = new char[i6];
        java.lang.System.arraycopy(cArr, i4, cArr3, 0, i6);
        if (bArr2 != null) {
            char[] cArr4 = new char[i6];
            getaccounttype.writeReplace = 0;
            char c2 = 0;
            while (getaccounttype.writeReplace < i6) {
                if (bArr2[getaccounttype.writeReplace] == 1) {
                    int i10 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c2)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 45, 2836 - android.graphics.Color.blue(0), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b((byte) 0, 2, (byte) 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj2);
                    }
                    cArr4[i10] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                } else {
                    int i11 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c2)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2110984860);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson('[' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 2880, (char) android.text.TextUtils.indexOf("", ""));
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        b((byte) 0, 0, (byte) 0, objArr7);
                        obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2110984860, obj3);
                    }
                    cArr4[i11] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                }
                c2 = cArr4[getaccounttype.writeReplace];
                java.lang.Object[] objArr8 = {getaccounttype, getaccounttype};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), android.text.TextUtils.indexOf("", "", 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))))).getMethod("l", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1714689752, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
            }
            cArr3 = cArr4;
        }
        if (i8 > 0) {
            int i12 = $11 + 55;
            $10 = i12 % 128;
            if (i12 % 2 != 0) {
                char[] cArr5 = new char[i6];
                i = 0;
                java.lang.System.arraycopy(cArr3, 1, cArr5, 0, i6);
                java.lang.System.arraycopy(cArr5, 0, cArr3, i6 + i8, i8);
                java.lang.System.arraycopy(cArr5, i8, cArr3, 1, i6 >> i8);
            } else {
                i = 0;
                char[] cArr6 = new char[i6];
                java.lang.System.arraycopy(cArr3, 0, cArr6, 0, i6);
                int i13 = i6 - i8;
                java.lang.System.arraycopy(cArr6, 0, cArr3, i13, i8);
                java.lang.System.arraycopy(cArr6, i8, cArr3, 0, i13);
            }
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr7 = new char[i6];
            getaccounttype.writeReplace = i;
            while (getaccounttype.writeReplace < i6) {
                int i14 = $10 + 119;
                $11 = i14 % 128;
                if (i14 % 2 == 0) {
                    cArr7[getaccounttype.writeReplace] = cArr3[(i6 << getaccounttype.writeReplace) - 1];
                    i2 = getaccounttype.writeReplace >> 1;
                } else {
                    cArr7[getaccounttype.writeReplace] = cArr3[(i6 - getaccounttype.writeReplace) - 1];
                    i2 = getaccounttype.writeReplace + 1;
                }
                getaccounttype.writeReplace = i2;
            }
            cArr3 = cArr7;
        }
        if (i7 > 0) {
            getaccounttype.writeReplace = 0;
            $11 = ($10 + 99) % 128;
            while (getaccounttype.writeReplace < i6) {
                $10 = ($11 + 87) % 128;
                cArr3[getaccounttype.writeReplace] = (char) (cArr3[getaccounttype.writeReplace] - iArr[2]);
                getaccounttype.writeReplace++;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        AlternateContactlessPaymentDataJson = 0;
        writeReplace = 1;
        valueOf = new char[]{16890, 16800, 16826, 16805, 16813, 16810, 16807, 16791, 16790, 16800, 16802, 16800, 16804, 16812, 16808, 16800, 16831, 16807, 16859, 16866, 16774, 16809, 16808, 16804, 16829};
    }

    static void init$0() {
        $$a = new byte[]{125, -89, 109, 76};
        $$b = 150;
    }
}
