package com.mastercard.upgrade.profile;

@com.payair.hce.setSelectionFromTop(valueOf = "cardProfile")
/* loaded from: classes4.dex */
public final class DigitizedCardProfile {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static int DigitizedCardProfile;
    private static char valueOf;
    private static int values;
    private static long writeReplace;

    @com.payair.hce.setSelectionFromTop(valueOf = "businessLogicModule")
    private com.mastercard.upgrade.profile.BusinessLogicModule businessLogicModule;

    @com.payair.hce.setSelectionFromTop(valueOf = "cardMetadata")
    private java.lang.String cardMetadata;

    @com.payair.hce.setSelectionFromTop(valueOf = "digitizedCardId")
    private com.payair.hce.isUiContext digitizedCardId;

    @com.payair.hce.setSelectionFromTop(valueOf = "mppLiteModule")
    private com.mastercard.upgrade.profile.MppLiteModule mppLiteModule;

    @com.payair.hce.setSelectionFromTop(valueOf = "maximumPinTry")
    private int maximumPinTry = 0;

    @com.payair.hce.setSelectionFromTop(valueOf = "mobilePinInitialConfiguration")
    private boolean mobilePinInitialConfiguration = true;

    @com.payair.hce.setSelectionFromTop(valueOf = "contactlessSupported")
    private boolean contactlessSupported = false;

    @com.payair.hce.setSelectionFromTop(valueOf = "remoteSupported")
    private boolean remotePaymentSupported = false;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, byte b, java.lang.Object[] objArr) {
        int i3;
        int i4;
        int i5 = 3 - (i2 * 4);
        int i6 = (i * 3) + 1;
        byte[] bArr = $$a;
        int i7 = 106 - b;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i8 = i6;
            int i9 = 0;
            i7 = (-i7) + i8;
            i3 = i9;
            i5++;
            bArr2[i3] = (byte) i7;
            i4 = i3 + 1;
            if (i4 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i8 = i7;
            i7 = bArr[i5];
            i9 = i4;
            i7 = (-i7) + i8;
            i3 = i9;
            i5++;
            bArr2[i3] = (byte) i7;
            i4 = i3 + 1;
            if (i4 == i6) {
            }
        } else {
            i3 = 0;
            i5++;
            bArr2[i3] = (byte) i7;
            i4 = i3 + 1;
            if (i4 == i6) {
            }
        }
    }

    public static com.mastercard.upgrade.profile.DigitizedCardProfile valueOf(byte[] bArr) {
        java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(new java.io.ByteArrayInputStream(bArr));
        com.payair.hce.setOnItemSelectedListener setonitemselectedlistener = new com.payair.hce.setOnItemSelectedListener();
        com.payair.hce.setOnItemSelectedListener setonitemselectedlistener2 = (com.payair.hce.setOnItemSelectedListener) com.payair.hce.setOnItemSelectedListener.values(new java.lang.Object[]{setonitemselectedlistener, com.payair.hce.isUiContext.class, new com.payair.hce.createWindowContext()}, -976499511, 976499513, java.lang.System.identityHashCode(setonitemselectedlistener));
        com.mastercard.upgrade.profile.DigitizedCardProfile digitizedCardProfile = (com.mastercard.upgrade.profile.DigitizedCardProfile) com.payair.hce.setOnItemSelectedListener.values(new java.lang.Object[]{setonitemselectedlistener2, inputStreamReader, com.mastercard.upgrade.profile.DigitizedCardProfile.class}, 509207078, -509207074, java.lang.System.identityHashCode(setonitemselectedlistener2));
        AlternateContactlessPaymentDataJson = (DigitizedCardProfile + 105) % 128;
        return digitizedCardProfile;
    }

    public final boolean isMobilePinInitialConfiguration() {
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i + 3;
        DigitizedCardProfile = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        boolean z = this.mobilePinInitialConfiguration;
        DigitizedCardProfile = (i + 1) % 128;
        return z;
    }

    public final void setMobilePinInitialConfiguration(boolean z) {
        int i = AlternateContactlessPaymentDataJson + 121;
        DigitizedCardProfile = i % 128;
        if (i % 2 == 0) {
            this.mobilePinInitialConfiguration = z;
        } else {
            this.mobilePinInitialConfiguration = z;
            throw null;
        }
    }

    public final int getMaximumPinTry() {
        int i = DigitizedCardProfile + 15;
        AlternateContactlessPaymentDataJson = i % 128;
        int i2 = this.maximumPinTry;
        if (i % 2 != 0) {
            return i2;
        }
        throw new java.lang.ArithmeticException();
    }

    private static void a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, char c, java.lang.Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        char c2;
        if (str3 != null) {
            $10 = ($11 + 71) % 128;
            cArr = str3.toCharArray();
        } else {
            cArr = str3;
        }
        char[] cArr3 = cArr;
        char[] charArray = str2 != null ? str2.toCharArray() : str2;
        java.lang.Object obj = null;
        if (str != null) {
            int i2 = $10 + 1;
            $11 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            cArr2 = str.toCharArray();
        } else {
            cArr2 = str;
        }
        char[] cArr4 = cArr2;
        com.payair.hce.getWalletData getwalletdata = new com.payair.hce.getWalletData();
        int length = cArr3.length;
        char[] cArr5 = new char[length];
        int length2 = cArr4.length;
        char[] cArr6 = new char[length2];
        java.lang.System.arraycopy(cArr3, 0, cArr5, 0, length);
        java.lang.System.arraycopy(cArr4, 0, cArr6, 0, length2);
        cArr5[0] = (char) (cArr5[0] ^ c);
        cArr6[2] = (char) (cArr6[2] + ((char) i));
        int length3 = charArray.length;
        char[] cArr7 = new char[length3];
        getwalletdata.writeReplace = 0;
        $10 = ($11 + 39) % 128;
        while (getwalletdata.writeReplace < length3) {
            try {
                java.lang.Object[] objArr2 = {getwalletdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
                if (obj2 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getCapsMode("", 0, 0) + 71, (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 1179, (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(0, 0, (byte) $$a.length, objArr3);
                    obj2 = cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj2);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(obj, objArr2)).intValue();
                java.lang.Object[] objArr4 = {getwalletdata};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 30, (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3442, (char) (3832 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))))).getMethod("g", java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj3);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(obj, objArr4)).intValue();
                java.lang.Object[] objArr5 = {getwalletdata, java.lang.Integer.valueOf(cArr5[getwalletdata.writeReplace % 4] * 32718), java.lang.Integer.valueOf(cArr6[intValue])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                if (obj4 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(25 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 1864 - android.view.View.MeasureSpec.getMode(0), (char) (41775 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    b(0, 0, (byte) 1, objArr6);
                    obj4 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr5);
                java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(cArr5[intValue2] * 32718), java.lang.Integer.valueOf(cArr6[intValue])};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                if (obj5 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - android.text.TextUtils.getTrimmedLength(""), 3133 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (android.os.Process.myTid() >> 22));
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    b(0, 0, (byte) 0, objArr8);
                    c2 = 2;
                    obj5 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj5);
                } else {
                    c2 = 2;
                }
                cArr6[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj5).invoke(null, objArr7)).charValue();
                cArr5[intValue2] = getwalletdata.values;
                cArr7[getwalletdata.writeReplace] = (char) ((((int) (values ^ 1263759066225628708L)) ^ ((cArr5[intValue2] ^ charArray[getwalletdata.writeReplace]) ^ (writeReplace ^ 1263759066225628708L))) ^ ((char) (valueOf ^ 1263759066225628708L)));
                getwalletdata.writeReplace++;
                cArr5 = cArr5;
                obj = null;
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

    public final void setMaximumPinTry(int i) {
        int i2 = AlternateContactlessPaymentDataJson + 125;
        DigitizedCardProfile = i2 % 128;
        if (i2 % 2 == 0) {
            this.maximumPinTry = i;
        } else {
            this.maximumPinTry = i;
            throw null;
        }
    }

    public final boolean getRemotePaymentSupported() {
        int i = AlternateContactlessPaymentDataJson + 97;
        DigitizedCardProfile = i % 128;
        boolean z = this.remotePaymentSupported;
        if (i % 2 == 0) {
            return z;
        }
        throw new java.lang.ArithmeticException();
    }

    public final void setRemotePaymentSupported(boolean z) {
        int i = (AlternateContactlessPaymentDataJson + 33) % 128;
        DigitizedCardProfile = i;
        this.remotePaymentSupported = z;
        int i2 = i + 113;
        AlternateContactlessPaymentDataJson = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public final boolean getContactlessSupported() {
        int i = DigitizedCardProfile + 7;
        AlternateContactlessPaymentDataJson = i % 128;
        if (i % 2 != 0) {
            return this.contactlessSupported;
        }
        throw null;
    }

    public final void setContactlessSupported(boolean z) {
        int i = (DigitizedCardProfile + 53) % 128;
        AlternateContactlessPaymentDataJson = i;
        this.contactlessSupported = z;
        DigitizedCardProfile = (i + 117) % 128;
    }

    public final com.mastercard.upgrade.profile.MppLiteModule getMppLiteModule() {
        int i = AlternateContactlessPaymentDataJson;
        DigitizedCardProfile = (i + 87) % 128;
        com.mastercard.upgrade.profile.MppLiteModule mppLiteModule = this.mppLiteModule;
        DigitizedCardProfile = (i + 47) % 128;
        return mppLiteModule;
    }

    public final void setMppLiteModule(com.mastercard.upgrade.profile.MppLiteModule mppLiteModule) {
        int i = (DigitizedCardProfile + 111) % 128;
        AlternateContactlessPaymentDataJson = i;
        this.mppLiteModule = mppLiteModule;
        int i2 = i + 95;
        DigitizedCardProfile = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    public final com.mastercard.upgrade.profile.BusinessLogicModule getBusinessLogicModule() {
        int i = (AlternateContactlessPaymentDataJson + 1) % 128;
        DigitizedCardProfile = i;
        com.mastercard.upgrade.profile.BusinessLogicModule businessLogicModule = this.businessLogicModule;
        AlternateContactlessPaymentDataJson = (i + 77) % 128;
        return businessLogicModule;
    }

    public final void setBusinessLogicModule(com.mastercard.upgrade.profile.BusinessLogicModule businessLogicModule) {
        int i = AlternateContactlessPaymentDataJson;
        DigitizedCardProfile = (i + 61) % 128;
        this.businessLogicModule = businessLogicModule;
        int i2 = i + 117;
        DigitizedCardProfile = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public final com.payair.hce.isUiContext getDigitizedCardId() {
        int i = DigitizedCardProfile + 21;
        int i2 = i % 128;
        AlternateContactlessPaymentDataJson = i2;
        if (i % 2 == 0) {
            throw null;
        }
        com.payair.hce.isUiContext isuicontext = this.digitizedCardId;
        int i3 = i2 + 1;
        DigitizedCardProfile = i3 % 128;
        if (i3 % 2 == 0) {
            return isuicontext;
        }
        throw null;
    }

    public final void setDigitizedCardId(com.payair.hce.isUiContext isuicontext) {
        int i = (AlternateContactlessPaymentDataJson + 111) % 128;
        DigitizedCardProfile = i;
        this.digitizedCardId = isuicontext;
        AlternateContactlessPaymentDataJson = (i + 109) % 128;
    }

    public final java.lang.String getCardMetadata() {
        int i = (AlternateContactlessPaymentDataJson + 55) % 128;
        DigitizedCardProfile = i;
        java.lang.String str = this.cardMetadata;
        int i2 = i + 109;
        AlternateContactlessPaymentDataJson = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final void setCardMetadata(java.lang.String str) {
        int i = DigitizedCardProfile;
        int i2 = i + 107;
        AlternateContactlessPaymentDataJson = i2 % 128;
        if (i2 % 2 != 0) {
            this.cardMetadata = str;
            AlternateContactlessPaymentDataJson = (i + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        } else {
            this.cardMetadata = str;
            throw null;
        }
    }

    public final java.lang.String getCardId() {
        DigitizedCardProfile = (AlternateContactlessPaymentDataJson + 55) % 128;
        com.payair.hce.isUiContext isuicontext = this.digitizedCardId;
        java.lang.String str = (java.lang.String) com.payair.hce.isUiContext.DigitizedCardProfile(new java.lang.Object[]{isuicontext}, -669572456, 669572456, java.lang.System.identityHashCode(isuicontext));
        int i = AlternateContactlessPaymentDataJson + 73;
        DigitizedCardProfile = i % 128;
        if (i % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final java.lang.String toJsonString() {
        com.payair.hce.setChildDivider setchilddivider = new com.payair.hce.setChildDivider();
        int bitsPerPixel = android.graphics.ImageFormat.getBitsPerPixel(0);
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("㈃鴰\uefbb嶙", "嬥\ud95f軭ዲ뎽൹镙", "ℑ\ue15eᄶﻸ", 920739362 + bitsPerPixel, (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr);
        setchilddivider.valueOf(((java.lang.String) objArr[0]).intern());
        setchilddivider.AlternateContactlessPaymentDataJson(new com.payair.hce.getDisplay(), com.payair.hce.isUiContext.class);
        setchilddivider.AlternateContactlessPaymentDataJson(new com.payair.hce.getDeviceId(), java.lang.Void.TYPE);
        java.lang.String DigitizedCardProfile2 = setchilddivider.DigitizedCardProfile(this);
        int i = DigitizedCardProfile + 119;
        AlternateContactlessPaymentDataJson = i % 128;
        if (i % 2 != 0) {
            return DigitizedCardProfile2;
        }
        throw null;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        DigitizedCardProfile = 0;
        AlternateContactlessPaymentDataJson = 1;
        writeReplace = 5480926476322661415L;
        values = -804334044;
        valueOf = (char) 54820;
    }

    static void init$0() {
        $$a = new byte[]{107, 115, 84, 3};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE;
    }
}
