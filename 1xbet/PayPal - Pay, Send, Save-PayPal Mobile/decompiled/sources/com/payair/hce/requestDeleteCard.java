package com.payair.hce;

/* loaded from: classes4.dex */
public final class requestDeleteCard implements com.payair.hce.removeCard {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int SdkCoreBusinessLogicModuleImpl;
    private static int[] getCiacDecline;
    private static long getCvrMaskAnd;
    private static int getPaymentFci;
    private com.payair.hce.unRegisterDevice AlternateContactlessPaymentDataJson;
    private com.payair.hce.transactionCanBeResumed DigitizedCardProfile;
    private com.payair.hce.getAppVersion IccPrivateKeyCrtComponentsJson;
    private com.payair.hce.activateVisaCardForToken RecordsJson;
    private com.payair.hce.getAppVersion SdkCoreAlternateContactlessPaymentDataImpl;
    private com.payair.hce.replenishAllCards getAid;
    private com.payair.hce.clearHCEData getProfileVersion;
    private com.payair.hce.transactionCanBeResumed valueOf;
    private com.payair.hce.transactionCanBeResumed values;
    private com.payair.hce.setNewDefaultCardForContactlessPayments writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, byte b2, int i, java.lang.Object[] objArr) {
        int i2;
        int i3 = 119 - (b * 2);
        byte[] bArr = $$a;
        int i4 = i * 4;
        int i5 = 3 - (b2 * 3);
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        if (bArr == null) {
            int i7 = i5;
            i3 = i6;
            int i8 = 0;
            i3 += -i5;
            i5 = i7;
            i2 = i8;
            int i9 = i5 + 1;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i10 = i2 + 1;
            i7 = i9;
            i5 = bArr[i9];
            i8 = i10;
            i3 += -i5;
            i5 = i7;
            i2 = i8;
            int i92 = i5 + 1;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            int i922 = i5 + 1;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        return AlternateContactlessPaymentDataJson(objArr);
    }

    public requestDeleteCard(com.payair.hce.transactionCanBeResumed transactioncanberesumed, com.payair.hce.transactionCanBeResumed transactioncanberesumed2, com.payair.hce.transactionCanBeResumed transactioncanberesumed3, com.payair.hce.setNewDefaultCardForContactlessPayments setnewdefaultcardforcontactlesspayments, com.payair.hce.unRegisterDevice unregisterdevice, com.payair.hce.replenishAllCards replenishallcards, com.payair.hce.clearHCEData clearhcedata, com.payair.hce.activateVisaCardForToken activatevisacardfortoken, com.payair.hce.getAppVersion getappversion, com.payair.hce.getAppVersion getappversion2) {
        this.valueOf = transactioncanberesumed;
        this.DigitizedCardProfile = transactioncanberesumed2;
        this.values = transactioncanberesumed3;
        this.writeReplace = setnewdefaultcardforcontactlesspayments;
        this.AlternateContactlessPaymentDataJson = unregisterdevice;
        this.getAid = replenishallcards;
        this.getProfileVersion = clearhcedata;
        this.RecordsJson = activatevisacardfortoken;
        this.SdkCoreAlternateContactlessPaymentDataImpl = getappversion;
        this.IccPrivateKeyCrtComponentsJson = getappversion2;
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        $11 = ($10 + 19) % 128;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
        char[] writeReplace = com.payair.hce.getCardholderValidator.writeReplace(getCvrMaskAnd ^ (-3824242241614154557L), cArr, i);
        getcardholdervalidator.valueOf = 4;
        $11 = ($10 + 59) % 128;
        while (getcardholdervalidator.valueOf < writeReplace.length) {
            getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - 4;
            int i2 = getcardholdervalidator.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace[getcardholdervalidator.valueOf] ^ writeReplace[getcardholdervalidator.valueOf % 4]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(getCvrMaskAnd)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.text.TextUtils.getCapsMode("", 0, 0), 1921 - android.graphics.Color.alpha(0), (char) android.text.TextUtils.getTrimmedLength(""));
                    byte b = (byte) ($$b & 3);
                    byte b2 = $$a[2];
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(b, b2, b2, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                }
                writeReplace[i2] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 27, 428 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) (android.graphics.Color.blue(0) + 31610));
                    byte b3 = $$a[2];
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b(b3, b3, b3, objArr5);
                    obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1228006564, obj2);
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
        objArr[0] = new java.lang.String(writeReplace, 4, writeReplace.length - 4);
    }

    @Override // com.payair.hce.removeCard
    public final byte[] values() {
        SdkCoreBusinessLogicModuleImpl = (getPaymentFci + 39) % 128;
        byte[] valueOf = com.payair.hce.transactionCanBeResumed.DigitizedCardProfile(this.valueOf).valueOf();
        int i = getPaymentFci + 77;
        SdkCoreBusinessLogicModuleImpl = i % 128;
        if (i % 2 != 0) {
            return valueOf;
        }
        throw null;
    }

    @Override // com.payair.hce.removeCard
    public final byte[] AlternateContactlessPaymentDataJson() {
        int i = SdkCoreBusinessLogicModuleImpl + 89;
        getPaymentFci = i % 128;
        byte[] valueOf = this.DigitizedCardProfile.valueOf();
        if (i % 2 == 0) {
            return valueOf;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.requestDeleteCard requestdeletecard = (com.payair.hce.requestDeleteCard) objArr[0];
        int i = getPaymentFci;
        int i2 = i + 73;
        SdkCoreBusinessLogicModuleImpl = i2 % 128;
        com.payair.hce.setNewDefaultCardForContactlessPayments setnewdefaultcardforcontactlesspayments = requestdeletecard.writeReplace;
        if (i2 % 2 == 0) {
            throw null;
        }
        SdkCoreBusinessLogicModuleImpl = (i + 39) % 128;
        return setnewdefaultcardforcontactlesspayments;
    }

    @Override // com.payair.hce.removeCard
    public final com.payair.hce.unRegisterDevice writeReplace() {
        int i = getPaymentFci + 21;
        SdkCoreBusinessLogicModuleImpl = i % 128;
        if (i % 2 != 0) {
            return this.AlternateContactlessPaymentDataJson;
        }
        throw null;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        com.payair.hce.setMaximumPinTry.valueOf();
        java.lang.Object obj = "";
        android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
        android.view.ViewConfiguration.getLongPressTimeout();
        com.payair.hce.transactionCanBeResumed transactioncanberesumed = this.valueOf;
        if (transactioncanberesumed != null) {
            SdkCoreBusinessLogicModuleImpl = (getPaymentFci + 83) % 128;
            str = transactioncanberesumed.writeReplace();
        } else {
            str = "";
        }
        new java.lang.Object[]{str};
        android.view.View.getDefaultSize(0, 0);
        com.payair.hce.transactionCanBeResumed transactioncanberesumed2 = this.DigitizedCardProfile;
        new java.lang.Object[]{transactioncanberesumed2 != null ? transactioncanberesumed2.writeReplace() : ""};
        android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        com.payair.hce.transactionCanBeResumed transactioncanberesumed3 = this.values;
        new java.lang.Object[]{transactioncanberesumed3 != null ? transactioncanberesumed3.writeReplace() : ""};
        android.os.Process.getElapsedCpuTime();
        java.lang.Object obj2 = this.writeReplace;
        if (obj2 == null) {
            obj2 = "";
        }
        new java.lang.Object[]{obj2};
        android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f);
        java.lang.Object obj3 = this.AlternateContactlessPaymentDataJson;
        if (obj3 == null) {
            obj3 = "";
        }
        new java.lang.Object[]{obj3};
        android.view.ViewConfiguration.getMaximumFlingVelocity();
        java.lang.Object obj4 = this.getAid;
        if (obj4 == null) {
            obj4 = "";
        }
        new java.lang.Object[]{obj4};
        android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
        java.lang.Object obj5 = this.getProfileVersion;
        if (obj5 != null) {
            SdkCoreBusinessLogicModuleImpl = (getPaymentFci + 51) % 128;
        } else {
            obj5 = "";
        }
        new java.lang.Object[]{obj5};
        android.view.ViewConfiguration.getMinimumFlingVelocity();
        java.lang.Object obj6 = this.RecordsJson;
        if (obj6 == null) {
            obj6 = "";
        }
        new java.lang.Object[]{obj6};
        android.view.ViewConfiguration.getGlobalActionKeyTimeout();
        java.lang.Object obj7 = this.SdkCoreAlternateContactlessPaymentDataImpl;
        if (obj7 == null) {
            obj7 = "";
        }
        new java.lang.Object[]{obj7};
        android.os.SystemClock.elapsedRealtime();
        java.lang.Object obj8 = this.IccPrivateKeyCrtComponentsJson;
        if (obj8 != null) {
            getPaymentFci = (SdkCoreBusinessLogicModuleImpl + 21) % 128;
            obj = obj8;
        }
        new java.lang.Object[]{obj};
        android.graphics.Color.green(0);
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("턕馎텁퇟\udd04䴣啯\uf1ea\uf140ﶒ痩赨遤ლ鰓钠냟〯벦뜗午厼弡힘珆猿", 1 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr);
        return ((java.lang.String) objArr[0]).intern();
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getPaymentFci = 0;
        SdkCoreBusinessLogicModuleImpl = 1;
        getCvrMaskAnd = -4079837778695209760L;
        getCiacDecline = new int[]{121527715, 1311029287, -1691146062, -370917842, 1030691985, 354862206, 253670822, 1147969291, -501081234, 1241913157, 2073351976, -1094170766, 335971322, 401023333, -748879454, -1038178314, 397690423, -798823803};
    }

    static void init$0() {
        $$a = new byte[]{com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 106, 0, 124};
        $$b = 77;
    }

    @Override // com.payair.hce.removeCard
    public final com.payair.hce.setNewDefaultCardForContactlessPayments DigitizedCardProfile() {
        return (com.payair.hce.setNewDefaultCardForContactlessPayments) valueOf(new java.lang.Object[]{this}, 171565837, -171565837, java.lang.System.identityHashCode(this));
    }
}
