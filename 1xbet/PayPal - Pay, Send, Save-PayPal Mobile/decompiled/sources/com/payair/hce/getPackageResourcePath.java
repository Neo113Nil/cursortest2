package com.payair.hce;

/* loaded from: classes4.dex */
public final class getPackageResourcePath {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getProfileVersion;
    private int AlternateContactlessPaymentDataJson;
    private com.mastercard.mpsdk.remotemanagement.api.json.CmsDSessionData DigitizedCardProfile;
    private boolean IccPrivateKeyCrtComponentsJson = false;
    private final com.payair.hce.checkPermission getAid = com.payair.hce.checkPermission.DigitizedCardProfile(com.payair.hce.registerReceiver.values);
    private java.lang.String valueOf;
    private java.lang.String values;
    private int writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, int i3, java.lang.Object[] objArr) {
        int i4;
        int i5;
        int i6 = 1 - (i3 * 2);
        int i7 = 3 - (i2 * 2);
        byte[] bArr = $$a;
        int i8 = i + 112;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i9 = i7;
            int i10 = i6;
            i5 = 0;
            int i11 = i7 + (-i10);
            i4 = i5;
            i7 = i9;
            i8 = i11;
            int i12 = i7 + 1;
            i5 = i4 + 1;
            bArr2[i4] = (byte) i8;
            if (i5 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i10 = bArr[i12];
            i7 = i8;
            i9 = i12;
            int i112 = i7 + (-i10);
            i4 = i5;
            i7 = i9;
            i8 = i112;
            int i122 = i7 + 1;
            i5 = i4 + 1;
            bArr2[i4] = (byte) i8;
            if (i5 == i6) {
            }
        } else {
            i4 = 0;
            int i1222 = i7 + 1;
            i5 = i4 + 1;
            bArr2[i4] = (byte) i8;
            if (i5 == i6) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        return DigitizedCardProfile(objArr);
    }

    public getPackageResourcePath(java.lang.String str, com.mastercard.mpsdk.remotemanagement.api.json.CmsDSessionData cmsDSessionData) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("毲ׇ랼↑팄䵸ｃ", android.view.View.resolveSize(0, 0) + 28201, objArr);
        if (!str.startsWith(((java.lang.String) objArr[0]).intern())) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a("毲\udb95ଘ窛ꨅᧇ䥗루", 45179 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr2);
            if (!str.startsWith(((java.lang.String) objArr2[0]).intern())) {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                a("毲\udb95ଘ窛ꨅᧇ䥗루", android.text.TextUtils.getCapsMode("", 0, 0) + 45179, objArr3);
                this.values = ((java.lang.String) objArr3[0]).intern().concat(java.lang.String.valueOf(str));
                this.DigitizedCardProfile = cmsDSessionData;
                this.writeReplace = 0;
                this.AlternateContactlessPaymentDataJson = 0;
            }
        }
        this.values = str;
        this.DigitizedCardProfile = cmsDSessionData;
        this.writeReplace = 0;
        this.AlternateContactlessPaymentDataJson = 0;
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = $10 + 63;
        $11 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getDsrpData getdsrpdata = new com.payair.hce.getDsrpData();
        getdsrpdata.values = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        getdsrpdata.valueOf = 0;
        while (getdsrpdata.valueOf < charArray.length) {
            $10 = ($11 + 83) % 128;
            int i3 = getdsrpdata.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(charArray[getdsrpdata.valueOf]), getdsrpdata, getdsrpdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getSize(0) + 31, 1890 - android.text.TextUtils.indexOf("", "", 0, 0), (char) (3600 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)));
                    byte b = (byte) ($$b & 7);
                    byte b2 = (byte) (b - 1);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(b, b2, b2, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj);
                }
                jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue() ^ (RecordsJson ^ (-4761752123935132024L));
                java.lang.Object[] objArr4 = {getdsrpdata, getdsrpdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 65, 1443 - android.graphics.Color.argb(0, 0, 0, 0), (char) (android.view.KeyEvent.keyCodeFromString("") + 29682));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b(0, 0, 0, objArr5);
                    obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj2);
                }
                ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[length];
        getdsrpdata.valueOf = 0;
        $10 = ($11 + 83) % 128;
        while (getdsrpdata.valueOf < charArray.length) {
            cArr[getdsrpdata.valueOf] = (char) jArr[getdsrpdata.valueOf];
            java.lang.Object[] objArr6 = {getdsrpdata, getdsrpdata};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
            if (obj3 == null) {
                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 64, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1443, (char) ((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 29682));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                b(0, 0, 0, objArr7);
                obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
            $11 = ($10 + 29) % 128;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    public final java.lang.String AlternateContactlessPaymentDataJson() {
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 111;
        getProfileVersion = i % 128;
        java.lang.String str = this.values;
        if (i % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.getPackageResourcePath getpackageresourcepath = (com.payair.hce.getPackageResourcePath) objArr[0];
        int i = getProfileVersion + 65;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 == 0) {
            boolean z = getpackageresourcepath.IccPrivateKeyCrtComponentsJson;
            throw new java.lang.ArithmeticException();
        }
        if (!getpackageresourcepath.IccPrivateKeyCrtComponentsJson) {
            getpackageresourcepath.valueOf = com.payair.hce.bindService.DigitizedCardProfile(new java.util.Date(new java.util.Date().getTime() + (getpackageresourcepath.DigitizedCardProfile.getValidForSeconds() * 1000)));
            getpackageresourcepath.IccPrivateKeyCrtComponentsJson = true;
        }
        int i2 = SdkCoreAlternateContactlessPaymentDataImpl + 17;
        getProfileVersion = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public final boolean values() {
        com.mastercard.mpsdk.remotemanagement.api.json.CmsDSessionData cmsDSessionData = this.DigitizedCardProfile;
        if (cmsDSessionData != null) {
            getProfileVersion = (SdkCoreAlternateContactlessPaymentDataImpl + 61) % 128;
            if (com.payair.hce.bindService.valueOf(cmsDSessionData.getExpiryTimestamp())) {
                int i = SdkCoreAlternateContactlessPaymentDataImpl + 73;
                getProfileVersion = i % 128;
                if (i % 2 == 0) {
                    return !this.IccPrivateKeyCrtComponentsJson || com.payair.hce.bindService.valueOf(this.valueOf);
                }
                throw new java.lang.ArithmeticException();
            }
        }
        return false;
    }

    public final com.mastercard.mpsdk.remotemanagement.api.json.CmsDSessionData writeReplace() {
        int i = (getProfileVersion + 53) % 128;
        SdkCoreAlternateContactlessPaymentDataImpl = i;
        com.mastercard.mpsdk.remotemanagement.api.json.CmsDSessionData cmsDSessionData = this.DigitizedCardProfile;
        int i2 = i + 99;
        getProfileVersion = i2 % 128;
        if (i2 % 2 == 0) {
            return cmsDSessionData;
        }
        throw null;
    }

    public final int DigitizedCardProfile() {
        int i = (SdkCoreAlternateContactlessPaymentDataImpl + 59) % 128;
        getProfileVersion = i;
        int i2 = this.writeReplace;
        int i3 = i + 95;
        SdkCoreAlternateContactlessPaymentDataImpl = i3 % 128;
        if (i3 % 2 != 0) {
            return i2;
        }
        throw null;
    }

    public final void valueOf(int i) {
        int i2 = SdkCoreAlternateContactlessPaymentDataImpl + 15;
        int i3 = i2 % 128;
        getProfileVersion = i3;
        if (i2 % 2 == 0) {
            this.writeReplace = i;
            int i4 = i3 + 45;
            SdkCoreAlternateContactlessPaymentDataImpl = i4 % 128;
            if (i4 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            return;
        }
        this.writeReplace = i;
        throw new java.lang.ArithmeticException();
    }

    public final int IccPrivateKeyCrtComponentsJson() {
        int i = getProfileVersion;
        SdkCoreAlternateContactlessPaymentDataImpl = (i + 105) % 128;
        int i2 = this.AlternateContactlessPaymentDataJson;
        int i3 = i + 37;
        SdkCoreAlternateContactlessPaymentDataImpl = i3 % 128;
        if (i3 % 2 != 0) {
            return i2;
        }
        throw new java.lang.ArithmeticException();
    }

    public final void getAid() {
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 83;
        getProfileVersion = i % 128;
        this.AlternateContactlessPaymentDataJson = i % 2 != 0 ? this.AlternateContactlessPaymentDataJson >>> 1 : this.AlternateContactlessPaymentDataJson + 1;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getProfileVersion = 0;
        SdkCoreAlternateContactlessPaymentDataImpl = 1;
        RecordsJson = 6674255979370454290L;
    }

    static void init$0() {
        $$a = new byte[]{com.google.common.base.Ascii.SI, -31, 80, -73};
        $$b = 145;
    }

    public final void valueOf() {
        writeReplace(new java.lang.Object[]{this}, 1982198121, -1982198121, java.lang.System.identityHashCode(this));
    }
}
