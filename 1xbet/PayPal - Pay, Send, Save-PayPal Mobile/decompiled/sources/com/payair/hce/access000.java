package com.payair.hce;

/* loaded from: classes4.dex */
public final class access000 extends com.payair.hce.access202 {
    private static char[] IccPrivateKeyCrtComponentsJson = {16882, 16823, 16823, 16804, 16714, 16745, 16745, 16737, 16743, 16744, 16747, 16816, 16829, 16722, 16744, 16742, 16740, 16745, 16739, 16737, 16720, 16731, 16749, 16730, 16730, 16743, 16738, 16745, 16743, 16767, 16715, 16787, 16713, 16892, 16812, 16813, 16805, 16801, 16808, 16782, 16775, 16800, 16778, 16772, 16824, 16800, 16802, 16831, 16800, 16791, 16791, 16806, 16788, 16813, 16826, 16828, 16802, 16801, 16803, 16805, 16815, 16815, 16775, 16865, 16880, 16880, 16791, 16802, 16802, 16775, 16770, 16887, 16803, 16805, 16804, 16781, 16886, 16815, 16805, 16803, 16801, 16802, 16828, 16826, 16813, 16788, 16806, 16791, 16791, 16800, 16831, 16802, 16800, 16824, 16791, 16880, 16880, 16865, 16783, 16809, 16806, 16813};
    private static int SdkCoreAlternateContactlessPaymentDataImpl = 0;
    private static int getAid = 1;
    private static com.payair.hce.onReplenishFailed writeReplace;
    private java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> AlternateContactlessPaymentDataJson;
    private com.payair.hce.transactionCanBeResumed DigitizedCardProfile;
    private com.payair.hce.clearHCEData valueOf = com.payair.hce.clearHCEData.writeReplace;
    private com.payair.hce.transactionCanBeResumed values;

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~(i4 | i3);
        return ((((i * (-244)) + (i2 * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE)) + (((~((~i3) | i4)) | (~(i4 | i))) * (-245))) + (i5 * (-245))) + ((i | i5) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE) != 1 ? DigitizedCardProfile(objArr) : valueOf(objArr);
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 121;
        getAid = i % 128;
        if (i % 2 == 0) {
            com.payair.hce.activateCardForToken activatecardfortoken = com.payair.hce.activateCardForToken.writeReplace;
            throw null;
        }
        com.payair.hce.activateCardForToken activatecardfortoken2 = com.payair.hce.activateCardForToken.writeReplace;
        int i2 = getAid + 119;
        SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
        if (i2 % 2 == 0) {
            return activatecardfortoken2;
        }
        throw new java.lang.ArithmeticException();
    }

    public final java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> valueOf() {
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 31;
        getAid = i % 128;
        if (i % 2 != 0) {
            if (((com.payair.hce.requestChangePin) RecordsJson()).valueOf()) {
                com.payair.hce.getCodeCacheDir SdkCoreAlternateContactlessPaymentDataImpl2 = SdkCoreAlternateContactlessPaymentDataImpl();
                com.payair.hce.RemotePaymentData AlternateContactlessPaymentDataJson = ((com.payair.hce.setPanSequenceNumber) com.payair.hce.getCodeCacheDir.valueOf(new java.lang.Object[]{SdkCoreAlternateContactlessPaymentDataImpl2}, -687040266, 687040266, java.lang.System.identityHashCode(SdkCoreAlternateContactlessPaymentDataImpl2))).AlternateContactlessPaymentDataJson();
                return ((com.payair.hce.setAip) com.payair.hce.RemotePaymentData.values(new java.lang.Object[]{AlternateContactlessPaymentDataJson}, 447738352, -447738345, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson))).writeReplace();
            }
            com.payair.hce.getCodeCacheDir SdkCoreAlternateContactlessPaymentDataImpl3 = SdkCoreAlternateContactlessPaymentDataImpl();
            com.payair.hce.RemotePaymentData writeReplace2 = ((com.payair.hce.setPanSequenceNumber) com.payair.hce.getCodeCacheDir.valueOf(new java.lang.Object[]{SdkCoreAlternateContactlessPaymentDataImpl3}, -687040266, 687040266, java.lang.System.identityHashCode(SdkCoreAlternateContactlessPaymentDataImpl3))).writeReplace();
            java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> writeReplace3 = ((com.payair.hce.setAip) com.payair.hce.RemotePaymentData.values(new java.lang.Object[]{writeReplace2}, 447738352, -447738345, java.lang.System.identityHashCode(writeReplace2))).writeReplace();
            SdkCoreAlternateContactlessPaymentDataImpl = (getAid + 99) % 128;
            return writeReplace3;
        }
        ((com.payair.hce.requestChangePin) RecordsJson()).valueOf();
        throw new java.lang.ArithmeticException();
    }

    public final void writeReplace(java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> list) {
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 25;
        getAid = i % 128;
        if (i % 2 != 0) {
            this.AlternateContactlessPaymentDataJson = list;
        } else {
            this.AlternateContactlessPaymentDataJson = list;
            throw null;
        }
    }

    public final java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> getSecurityWord() {
        int i = SdkCoreAlternateContactlessPaymentDataImpl;
        getAid = (i + 53) % 128;
        java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> list = this.AlternateContactlessPaymentDataJson;
        int i2 = i + 115;
        getAid = i2 % 128;
        if (i2 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public static com.payair.hce.onReplenishFailed getMchipCvmIssuerOptions() {
        int i = (SdkCoreAlternateContactlessPaymentDataImpl + 99) % 128;
        getAid = i;
        com.payair.hce.onReplenishFailed onreplenishfailed = writeReplace;
        int i2 = i + 45;
        SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
        if (i2 % 2 == 0) {
            return onreplenishfailed;
        }
        throw new java.lang.ArithmeticException();
    }

    public static void AlternateContactlessPaymentDataJson(com.payair.hce.onReplenishFailed onreplenishfailed) {
        SdkCoreAlternateContactlessPaymentDataImpl = (getAid + 95) % 128;
        com.payair.hce.setMaximumPinTry.valueOf();
        if (writeReplace == null) {
            writeReplace = onreplenishfailed;
            new java.lang.Object[]{onreplenishfailed};
        } else {
            getAid = (SdkCoreAlternateContactlessPaymentDataImpl + 17) % 128;
        }
    }

    public static void SdkCoreCardRiskManagementDataImpl() {
        int i;
        int i2 = SdkCoreAlternateContactlessPaymentDataImpl + 33;
        getAid = i2 % 128;
        if (i2 % 2 == 0) {
            writeReplace = null;
            com.payair.hce.setMaximumPinTry.valueOf();
            i = 1;
        } else {
            writeReplace = null;
            com.payair.hce.setMaximumPinTry.valueOf();
            i = 0;
        }
        java.lang.Object[] objArr = new java.lang.Object[i];
    }

    public final com.payair.hce.transactionCanBeResumed getAdditionalCheckTable() {
        int i = SdkCoreAlternateContactlessPaymentDataImpl;
        getAid = (i + 3) % 128;
        com.payair.hce.transactionCanBeResumed transactioncanberesumed = this.values;
        int i2 = i + 107;
        getAid = i2 % 128;
        if (i2 % 2 != 0) {
            return transactioncanberesumed;
        }
        throw null;
    }

    public final void AlternateContactlessPaymentDataJson(byte[] bArr) {
        SdkCoreAlternateContactlessPaymentDataImpl = (getAid + 69) % 128;
        this.values = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(bArr);
        SdkCoreAlternateContactlessPaymentDataImpl = (getAid + 83) % 128;
    }

    public final com.payair.hce.transactionCanBeResumed getCardholderValidators() {
        int i = (getAid + 99) % 128;
        SdkCoreAlternateContactlessPaymentDataImpl = i;
        com.payair.hce.transactionCanBeResumed transactioncanberesumed = this.DigitizedCardProfile;
        getAid = (i + 19) % 128;
        return transactioncanberesumed;
    }

    public final void values(com.payair.hce.transactionCanBeResumed transactioncanberesumed) {
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 69;
        getAid = i % 128;
        if (i % 2 != 0) {
            this.DigitizedCardProfile = transactioncanberesumed;
        } else {
            this.DigitizedCardProfile = transactioncanberesumed;
            throw new java.lang.ArithmeticException();
        }
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.access000 access000Var = (com.payair.hce.access000) objArr[0];
        int i = getAid + 77;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        com.payair.hce.clearHCEData clearhcedata = access000Var.valueOf;
        if (i % 2 == 0) {
            return clearhcedata;
        }
        throw null;
    }

    public final void getCrmCountryCode() {
        int i = getAid + 71;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 == 0) {
            this.valueOf = com.payair.hce.clearHCEData.values;
        } else {
            this.valueOf = com.payair.hce.clearHCEData.values;
            throw null;
        }
    }

    public final void getCdol1RelatedDataLength() {
        SdkCoreAlternateContactlessPaymentDataImpl = (getAid + 63) % 128;
        this.valueOf = com.payair.hce.clearHCEData.AlternateContactlessPaymentDataJson;
        getAid = (SdkCoreAlternateContactlessPaymentDataImpl + 65) % 128;
    }

    public final com.payair.hce.clearHCEData getMagstripeCvmIssuerOptions() {
        return (com.payair.hce.clearHCEData) valueOf(new java.lang.Object[]{this}, -339322648, 339322649, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.access202
    public final com.payair.hce.activateCardForToken writeReplace() {
        return (com.payair.hce.activateCardForToken) valueOf(new java.lang.Object[]{this}, 2086347591, -2086347591, java.lang.System.identityHashCode(this));
    }
}
