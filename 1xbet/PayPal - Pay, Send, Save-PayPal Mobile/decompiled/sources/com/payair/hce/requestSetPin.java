package com.payair.hce;

/* loaded from: classes4.dex */
public final class requestSetPin extends com.payair.hce.requestSetWalletPin {
    private static int AlternateContactlessPaymentDataJson = 0;
    private static int DigitizedCardProfile = 1;
    private static int valueOf = 1889207248;
    private com.payair.hce.onContactlessPaymentCompleted writeReplace;

    public requestSetPin(com.payair.hce.onContactlessPaymentCompleted oncontactlesspaymentcompleted) {
        super(oncontactlesspaymentcompleted);
        this.writeReplace = oncontactlesspaymentcompleted;
    }

    @Override // com.payair.hce.requestSetWalletPin
    public final com.payair.hce.activateVisaCardForToken values() {
        try {
            com.payair.hce.onContactlessPaymentCompleted oncontactlesspaymentcompleted = this.writeReplace;
            if (((com.payair.hce.onDeleteCardFailed) com.payair.hce.onContactlessPaymentCompleted.valueOf(new java.lang.Object[]{oncontactlesspaymentcompleted}, -691731172, 691731173, java.lang.System.identityHashCode(oncontactlesspaymentcompleted))).IccPrivateKeyCrtComponentsJson() != null) {
                AlternateContactlessPaymentDataJson = (DigitizedCardProfile + 53) % 128;
                com.payair.hce.onContactlessPaymentCompleted oncontactlesspaymentcompleted2 = this.writeReplace;
                if (((com.payair.hce.onDeleteCardFailed) com.payair.hce.onContactlessPaymentCompleted.valueOf(new java.lang.Object[]{oncontactlesspaymentcompleted2}, -691731172, 691731173, java.lang.System.identityHashCode(oncontactlesspaymentcompleted2))).IccPrivateKeyCrtComponentsJson().length != 0) {
                    com.payair.hce.onContactlessPaymentCompleted oncontactlesspaymentcompleted3 = this.writeReplace;
                    com.payair.hce.getDigitizedCardProfile values = ((com.payair.hce.access400) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{oncontactlesspaymentcompleted3}, -2078363504, 2078363507, java.lang.System.identityHashCode(oncontactlesspaymentcompleted3))).values();
                    com.payair.hce.onContactlessPaymentCompleted oncontactlesspaymentcompleted4 = this.writeReplace;
                    com.payair.hce.getCodeCacheDir getcodecachedir = (com.payair.hce.getCodeCacheDir) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{oncontactlesspaymentcompleted4}, -1529917445, 1529917464, java.lang.System.identityHashCode(oncontactlesspaymentcompleted4));
                    long AlternateContactlessPaymentDataJson2 = com.payair.hce.onSignUser.AlternateContactlessPaymentDataJson(((com.payair.hce.setTrack2EquivalentData) com.payair.hce.getCodeCacheDir.valueOf(new java.lang.Object[]{getcodecachedir}, 1387703596, -1387703595, java.lang.System.identityHashCode(getcodecachedir))).getAid().valueOf());
                    com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track2 = this.values;
                    android.media.AudioTrack.getMaxVolume();
                    android.view.View.MeasureSpec.getSize(0);
                    android.os.SystemClock.currentThreadTimeMillis();
                    values.getAid();
                    java.lang.Long.valueOf(AlternateContactlessPaymentDataJson2);
                    if (values.getAid().longValue() == AlternateContactlessPaymentDataJson2) {
                        return com.payair.hce.activateVisaCardForToken.writeReplace;
                    }
                    int i = DigitizedCardProfile + 29;
                    AlternateContactlessPaymentDataJson = i % 128;
                    if (i % 2 == 0) {
                        return com.payair.hce.activateVisaCardForToken.valueOf;
                    }
                    com.payair.hce.activateVisaCardForToken activatevisacardfortoken = com.payair.hce.activateVisaCardForToken.valueOf;
                    throw new java.lang.NullPointerException();
                }
            }
            return com.payair.hce.activateVisaCardForToken.DigitizedCardProfile;
        } catch (com.payair.hce.getSetPinRequestData unused) {
            return com.payair.hce.activateVisaCardForToken.DigitizedCardProfile;
        }
    }

    @Override // com.payair.hce.requestSetWalletPin
    public final com.payair.hce.replenishAllCards writeReplace() {
        DigitizedCardProfile = (AlternateContactlessPaymentDataJson + 49) % 128;
        com.payair.hce.replenishAllCards valueOf2 = com.payair.hce.replenishAllCards.valueOf();
        DigitizedCardProfile = (AlternateContactlessPaymentDataJson + 103) % 128;
        return valueOf2;
    }
}
