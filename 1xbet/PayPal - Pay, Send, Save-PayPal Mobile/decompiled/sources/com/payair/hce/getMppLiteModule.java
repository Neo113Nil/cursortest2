package com.payair.hce;

/* loaded from: classes4.dex */
public final class getMppLiteModule extends com.payair.hce.getMagstripeCvmIssuerOptions<java.util.Date> {
    public static final com.payair.hce.getCardholderValidators AlternateContactlessPaymentDataJson = new com.payair.hce.getCardholderValidators() { // from class: com.payair.hce.getMppLiteModule.4
        @Override // com.payair.hce.getCardholderValidators
        public final <T> com.payair.hce.getMagstripeCvmIssuerOptions<T> DigitizedCardProfile(com.payair.hce.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson, com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided<T> getpinalwaysrequiredifcurrencyprovided) {
            if (getpinalwaysrequiredifcurrencyprovided.values == java.util.Date.class) {
                return new com.payair.hce.getMppLiteModule();
            }
            return null;
        }
    };
    private final java.util.List<java.text.DateFormat> DigitizedCardProfile;

    public getMppLiteModule() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.DigitizedCardProfile = arrayList;
        arrayList.add(java.text.DateFormat.getDateTimeInstance(2, 2, java.util.Locale.US));
        if (!java.util.Locale.getDefault().equals(java.util.Locale.US)) {
            arrayList.add(java.text.DateFormat.getDateTimeInstance(2, 2));
        }
        if (com.payair.hce.getIccPrivateKeyCrtComponents.DigitizedCardProfile()) {
            arrayList.add(new java.text.SimpleDateFormat("MMM d, yyyy h:mm:ss a", java.util.Locale.US));
        }
    }

    private java.util.Date AlternateContactlessPaymentDataJson(java.lang.String str) {
        synchronized (this) {
            java.util.Iterator<java.text.DateFormat> it = this.DigitizedCardProfile.iterator();
            while (it.hasNext()) {
                try {
                    return it.next().parse(str);
                } catch (java.text.ParseException unused) {
                }
            }
            try {
                return com.payair.hce.getAckAlwaysRequiredIfCurrencyProvided.values(str, new java.text.ParsePosition(0));
            } catch (java.text.ParseException e) {
                throw new com.payair.hce.getDualTapResetTimeout(str, e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.payair.hce.getMagstripeCvmIssuerOptions
    /* renamed from: values, reason: merged with bridge method [inline-methods] */
    public void writeReplace(com.payair.hce.getRemotePaymentData getremotepaymentdata, java.util.Date date) throws java.io.IOException {
        synchronized (this) {
            if (date == null) {
                getremotepaymentdata.writeReplace();
            } else {
                getremotepaymentdata.DigitizedCardProfile(this.DigitizedCardProfile.get(0).format(date));
            }
        }
    }

    @Override // com.payair.hce.getMagstripeCvmIssuerOptions
    public final /* synthetic */ java.util.Date AlternateContactlessPaymentDataJson(com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication) throws java.io.IOException {
        if (getackautomaticallyresetbyapplication.getProfileVersion() == com.payair.hce.getAckPreEntryAllowed.NULL) {
            getackautomaticallyresetbyapplication.RecordsJson();
            return null;
        }
        return AlternateContactlessPaymentDataJson(getackautomaticallyresetbyapplication.getAid());
    }
}
