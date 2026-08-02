package com.payair.hce;

/* loaded from: classes4.dex */
public class CardProfileMdesCmsCV2 {
    private static int AlternateContactlessPaymentDataJson = 1;
    private static int writeReplace;
    public com.mastercard.mpsdk.card.profile.v2.DigitizedCardProfileV2Json cardProfile;
    private com.payair.hce.initializeVisaPaymentSdk encryptedIccKey;
    public java.lang.String iccKek;
    public java.lang.String kekId;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0038, code lost:
    
        if (r0 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.payair.hce.checkForSuccess getDigitizedCard(java.lang.String str, com.payair.hce.setTransitionAlpha settransitionalpha) {
        com.payair.hce.CardProfileMdesCmsCV2 cardProfileMdesCmsCV2 = (com.payair.hce.CardProfileMdesCmsCV2) new com.payair.hce.IccPrivateKeyCrtComponentsJson().writeReplace(str, com.payair.hce.CardProfileMdesCmsCV2.class);
        java.lang.String AlternateContactlessPaymentDataJson2 = com.payair.hce.setAnimationMatrix.AlternateContactlessPaymentDataJson(cardProfileMdesCmsCV2.kekId);
        if (cardProfileMdesCmsCV2.kekId != null) {
            int i = AlternateContactlessPaymentDataJson;
            int i2 = i & 125;
            int i3 = i | 125;
            int i4 = ((i2 & i3) + (i3 | i2)) % 128;
            writeReplace = i4;
            if (cardProfileMdesCmsCV2.iccKek != null) {
                int i5 = i4 & 67;
                int i6 = i5 + ((i4 ^ 67) | i5);
                AlternateContactlessPaymentDataJson = i6 % 128;
                if (i6 % 2 == 0) {
                    throw null;
                }
            }
        }
        if (cardProfileMdesCmsCV2.cardProfile == null) {
            int i7 = AlternateContactlessPaymentDataJson;
            int i8 = (i7 & (-30)) | ((~i7) & 29);
            int i9 = -(-((i7 & 29) << 1));
            int i10 = (i8 & i9) + (i9 | i8);
            int i11 = i10 % 128;
            writeReplace = i11;
            if (i10 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            int i12 = ((i11 & 90) + (i11 | 90)) - 1;
            AlternateContactlessPaymentDataJson = i12 % 128;
            if (i12 % 2 != 0) {
                return null;
            }
            throw new java.lang.ArithmeticException();
        }
        try {
            java.lang.String str2 = cardProfileMdesCmsCV2.iccKek;
            if (str2 != null) {
                int i13 = writeReplace;
                int i14 = ((i13 ^ 67) | (i13 & 67)) << 1;
                int i15 = -((i13 & (-68)) | ((~i13) & 67));
                int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
                int i17 = i16 % 128;
                AlternateContactlessPaymentDataJson = i17;
                if (i16 % 2 == 0) {
                    throw null;
                }
                if (AlternateContactlessPaymentDataJson2 != null) {
                    writeReplace = ((i17 & 75) + (i17 | 75)) % 128;
                    this.encryptedIccKey = (com.payair.hce.initializeVisaPaymentSdk) com.payair.hce.setTransitionAlpha.values(new java.lang.Object[]{settransitionalpha, (byte[]) com.payair.hce.setTransitionAlpha.values(new java.lang.Object[]{settransitionalpha, com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(str2).DigitizedCardProfile(), com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(AlternateContactlessPaymentDataJson2).DigitizedCardProfile()}, 1273890719, -1273890707, java.lang.System.identityHashCode(settransitionalpha))}, 202220383, -202220375, java.lang.System.identityHashCode(settransitionalpha));
                    int i18 = writeReplace;
                    AlternateContactlessPaymentDataJson = ((i18 & 83) + (i18 | 83)) % 128;
                }
            }
            com.mastercard.mpsdk.card.profile.v2.DigitizedCardProfileV2Json digitizedCardProfileV2Json = cardProfileMdesCmsCV2.cardProfile;
            this.cardProfile = digitizedCardProfileV2Json;
            int i19 = (writeReplace + 37) % 128;
            AlternateContactlessPaymentDataJson = i19;
            int i20 = (i19 & 85) + (i19 | 85);
            writeReplace = i20 % 128;
            if (i20 % 2 == 0) {
                return (com.payair.hce.checkForSuccess) com.payair.hce.setFocusableInTouchMode.valueOf(new java.lang.Object[]{digitizedCardProfileV2Json, this.encryptedIccKey, settransitionalpha}, -2013748298, 2013748300, (int) java.lang.System.currentTimeMillis());
            }
            throw null;
        } catch (java.security.GeneralSecurityException unused) {
            return null;
        }
    }

    public final /* synthetic */ void valueOf(com.payair.hce.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson, com.payair.hce.getRemotePaymentData getremotepaymentdata, com.payair.hce.getTrack2Equivalent gettrack2equivalent) {
        getremotepaymentdata.AlternateContactlessPaymentDataJson();
        if (this != this.cardProfile) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 38);
            com.mastercard.mpsdk.card.profile.v2.DigitizedCardProfileV2Json digitizedCardProfileV2Json = this.cardProfile;
            com.payair.hce.getApplicationExpiryDate.values(iccPrivateKeyCrtComponentsJson, com.mastercard.mpsdk.card.profile.v2.DigitizedCardProfileV2Json.class, digitizedCardProfileV2Json).writeReplace(getremotepaymentdata, digitizedCardProfileV2Json);
        }
        if (this != this.iccKek) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 81);
            getremotepaymentdata.DigitizedCardProfile(this.iccKek);
        }
        if (this != this.kekId) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 2);
            getremotepaymentdata.DigitizedCardProfile(this.kekId);
        }
        if (this != this.encryptedIccKey) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 65);
            com.payair.hce.initializeVisaPaymentSdk initializevisapaymentsdk = this.encryptedIccKey;
            com.payair.hce.getApplicationExpiryDate.values(iccPrivateKeyCrtComponentsJson, com.payair.hce.initializeVisaPaymentSdk.class, initializevisapaymentsdk).writeReplace(getremotepaymentdata, initializevisapaymentsdk);
        }
        getremotepaymentdata.values();
    }

    public final /* synthetic */ void writeReplace(com.payair.hce.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson, com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication, com.payair.hce.getPan getpan) {
        getackautomaticallyresetbyapplication.writeReplace();
        while (getackautomaticallyresetbyapplication.values()) {
            int AlternateContactlessPaymentDataJson2 = getpan.AlternateContactlessPaymentDataJson(getackautomaticallyresetbyapplication);
            boolean z = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.NULL;
            if (AlternateContactlessPaymentDataJson2 != 2) {
                if (AlternateContactlessPaymentDataJson2 != 10) {
                    if (AlternateContactlessPaymentDataJson2 != 15) {
                        if (AlternateContactlessPaymentDataJson2 != 30) {
                            getackautomaticallyresetbyapplication.getCvrMaskAnd();
                        } else if (z) {
                            this.cardProfile = (com.mastercard.mpsdk.card.profile.v2.DigitizedCardProfileV2Json) iccPrivateKeyCrtComponentsJson.valueOf(new com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided(com.mastercard.mpsdk.card.profile.v2.DigitizedCardProfileV2Json.class)).AlternateContactlessPaymentDataJson(getackautomaticallyresetbyapplication);
                        } else {
                            this.cardProfile = null;
                            getackautomaticallyresetbyapplication.RecordsJson();
                        }
                    } else if (z) {
                        this.iccKek = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
                    } else {
                        this.iccKek = null;
                        getackautomaticallyresetbyapplication.RecordsJson();
                    }
                } else if (z) {
                    this.kekId = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
                } else {
                    this.kekId = null;
                    getackautomaticallyresetbyapplication.RecordsJson();
                }
            } else if (z) {
                this.encryptedIccKey = (com.payair.hce.initializeVisaPaymentSdk) iccPrivateKeyCrtComponentsJson.valueOf(new com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided(com.payair.hce.initializeVisaPaymentSdk.class)).AlternateContactlessPaymentDataJson(getackautomaticallyresetbyapplication);
            } else {
                this.encryptedIccKey = null;
                getackautomaticallyresetbyapplication.RecordsJson();
            }
        }
        getackautomaticallyresetbyapplication.DigitizedCardProfile();
    }
}
