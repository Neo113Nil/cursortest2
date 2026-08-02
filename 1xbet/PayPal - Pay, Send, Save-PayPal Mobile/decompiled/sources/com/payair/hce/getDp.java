package com.payair.hce;

/* loaded from: classes4.dex */
public final class getDp extends com.payair.hce.getMagstripeCvmIssuerOptions<java.sql.Time> {
    public static final com.payair.hce.getCardholderValidators DigitizedCardProfile = new com.payair.hce.getCardholderValidators() { // from class: com.payair.hce.getDp.1
        @Override // com.payair.hce.getCardholderValidators
        public final <T> com.payair.hce.getMagstripeCvmIssuerOptions<T> DigitizedCardProfile(com.payair.hce.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson, com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided<T> getpinalwaysrequiredifcurrencyprovided) {
            if (getpinalwaysrequiredifcurrencyprovided.values == java.sql.Time.class) {
                return new com.payair.hce.getDp();
            }
            return null;
        }
    };
    private final java.text.DateFormat AlternateContactlessPaymentDataJson = new java.text.SimpleDateFormat("hh:mm:ss a");

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.payair.hce.getMagstripeCvmIssuerOptions
    /* renamed from: DigitizedCardProfile, reason: merged with bridge method [inline-methods] */
    public java.sql.Time AlternateContactlessPaymentDataJson(com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication) throws java.io.IOException {
        synchronized (this) {
            if (getackautomaticallyresetbyapplication.getProfileVersion() == com.payair.hce.getAckPreEntryAllowed.NULL) {
                getackautomaticallyresetbyapplication.RecordsJson();
                return null;
            }
            try {
                return new java.sql.Time(this.AlternateContactlessPaymentDataJson.parse(getackautomaticallyresetbyapplication.getAid()).getTime());
            } catch (java.text.ParseException e) {
                throw new com.payair.hce.getDualTapResetTimeout(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.payair.hce.getMagstripeCvmIssuerOptions
    /* renamed from: valueOf, reason: merged with bridge method [inline-methods] */
    public void writeReplace(com.payair.hce.getRemotePaymentData getremotepaymentdata, java.sql.Time time) throws java.io.IOException {
        synchronized (this) {
            getremotepaymentdata.DigitizedCardProfile(time == null ? null : this.AlternateContactlessPaymentDataJson.format((java.util.Date) time));
        }
    }
}
