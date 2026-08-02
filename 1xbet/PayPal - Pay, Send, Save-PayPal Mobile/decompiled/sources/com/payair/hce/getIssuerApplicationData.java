package com.payair.hce;

/* loaded from: classes4.dex */
public final class getIssuerApplicationData implements com.payair.hce.getCardholderValidators, java.lang.Cloneable {
    public static final com.payair.hce.getIssuerApplicationData DigitizedCardProfile = new com.payair.hce.getIssuerApplicationData();
    public boolean writeReplace;
    public double AlternateContactlessPaymentDataJson = -1.0d;
    public int values = 136;
    public boolean valueOf = true;
    public java.util.List<com.payair.hce.valueOf> RecordsJson = java.util.Collections.emptyList();
    public java.util.List<com.payair.hce.valueOf> getProfileVersion = java.util.Collections.emptyList();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: valueOf, reason: merged with bridge method [inline-methods] */
    public com.payair.hce.getIssuerApplicationData clone() {
        try {
            return (com.payair.hce.getIssuerApplicationData) super.clone();
        } catch (java.lang.CloneNotSupportedException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    public final boolean valueOf(java.lang.Class<?> cls) {
        if (this.AlternateContactlessPaymentDataJson != -1.0d) {
            com.payair.hce.getCrmCountryCode getcrmcountrycode = (com.payair.hce.getCrmCountryCode) cls.getAnnotation(com.payair.hce.getCrmCountryCode.class);
            com.payair.hce.getPpseFci getppsefci = (com.payair.hce.getPpseFci) cls.getAnnotation(com.payair.hce.getPpseFci.class);
            if ((getcrmcountrycode != null && getcrmcountrycode.DigitizedCardProfile() > this.AlternateContactlessPaymentDataJson) || (getppsefci != null && getppsefci.writeReplace() <= this.AlternateContactlessPaymentDataJson)) {
                return true;
            }
        }
        if (!this.valueOf && cls.isMemberClass() && (cls.getModifiers() & 8) == 0) {
            return true;
        }
        if (java.lang.Enum.class.isAssignableFrom(cls)) {
            return false;
        }
        return cls.isAnonymousClass() || cls.isLocalClass();
    }

    public final boolean DigitizedCardProfile(boolean z) {
        java.util.Iterator<com.payair.hce.valueOf> it = (z ? this.RecordsJson : this.getProfileVersion).iterator();
        while (it.hasNext()) {
            if (it.next().writeReplace()) {
                return true;
            }
        }
        return false;
    }

    public static boolean writeReplace(java.lang.Class<?> cls) {
        if (java.lang.Enum.class.isAssignableFrom(cls)) {
            return false;
        }
        return cls.isAnonymousClass() || cls.isLocalClass();
    }

    public static boolean AlternateContactlessPaymentDataJson(java.lang.Class<?> cls) {
        return cls.isMemberClass() && (cls.getModifiers() & 8) == 0;
    }

    @Override // com.payair.hce.getCardholderValidators
    public final <T> com.payair.hce.getMagstripeCvmIssuerOptions<T> DigitizedCardProfile(final com.payair.hce.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson, final com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided<T> getpinalwaysrequiredifcurrencyprovided) {
        boolean valueOf = valueOf(getpinalwaysrequiredifcurrencyprovided.values);
        final boolean z = valueOf || DigitizedCardProfile(true);
        final boolean z2 = valueOf || DigitizedCardProfile(false);
        if (z || z2) {
            return new com.payair.hce.getMagstripeCvmIssuerOptions<T>() { // from class: com.payair.hce.getIssuerApplicationData.1
                private com.payair.hce.getMagstripeCvmIssuerOptions<T> values;

                @Override // com.payair.hce.getMagstripeCvmIssuerOptions
                public final T AlternateContactlessPaymentDataJson(com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication) throws java.io.IOException {
                    if (z2) {
                        getackautomaticallyresetbyapplication.getCvrMaskAnd();
                        return null;
                    }
                    com.payair.hce.getMagstripeCvmIssuerOptions<T> getmagstripecvmissueroptions = this.values;
                    if (getmagstripecvmissueroptions == null) {
                        getmagstripecvmissueroptions = iccPrivateKeyCrtComponentsJson.DigitizedCardProfile(com.payair.hce.getIssuerApplicationData.this, getpinalwaysrequiredifcurrencyprovided);
                        this.values = getmagstripecvmissueroptions;
                    }
                    return getmagstripecvmissueroptions.AlternateContactlessPaymentDataJson(getackautomaticallyresetbyapplication);
                }

                @Override // com.payair.hce.getMagstripeCvmIssuerOptions
                public final void writeReplace(com.payair.hce.getRemotePaymentData getremotepaymentdata, T t) throws java.io.IOException {
                    if (z) {
                        getremotepaymentdata.writeReplace();
                        return;
                    }
                    com.payair.hce.getMagstripeCvmIssuerOptions<T> getmagstripecvmissueroptions = this.values;
                    if (getmagstripecvmissueroptions == null) {
                        getmagstripecvmissueroptions = iccPrivateKeyCrtComponentsJson.DigitizedCardProfile(com.payair.hce.getIssuerApplicationData.this, getpinalwaysrequiredifcurrencyprovided);
                        this.values = getmagstripecvmissueroptions;
                    }
                    getmagstripecvmissueroptions.writeReplace(getremotepaymentdata, t);
                }
            };
        }
        return null;
    }
}
