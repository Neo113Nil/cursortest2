package com.payair.hce;

/* loaded from: classes4.dex */
public final class getContent implements com.payair.hce.getCardholderValidators {
    private final com.payair.hce.buildRecords values;

    public getContent(com.payair.hce.buildRecords buildrecords) {
        this.values = buildrecords;
    }

    static com.payair.hce.getMagstripeCvmIssuerOptions<?> values(com.payair.hce.buildRecords buildrecords, com.payair.hce.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson, com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided<?> getpinalwaysrequiredifcurrencyprovided, com.payair.hce.SdkCoreCardRiskManagementDataImpl sdkCoreCardRiskManagementDataImpl) {
        com.payair.hce.getMagstripeCvmIssuerOptions<?> getpinpreentryallowed;
        java.lang.Object DigitizedCardProfile = buildrecords.values(new com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided(sdkCoreCardRiskManagementDataImpl.valueOf())).DigitizedCardProfile();
        if (DigitizedCardProfile instanceof com.payair.hce.getMagstripeCvmIssuerOptions) {
            getpinpreentryallowed = (com.payair.hce.getMagstripeCvmIssuerOptions) DigitizedCardProfile;
        } else if (DigitizedCardProfile instanceof com.payair.hce.getCardholderValidators) {
            getpinpreentryallowed = ((com.payair.hce.getCardholderValidators) DigitizedCardProfile).DigitizedCardProfile(iccPrivateKeyCrtComponentsJson, getpinalwaysrequiredifcurrencyprovided);
        } else {
            boolean z = DigitizedCardProfile instanceof com.payair.hce.getApplicationLifeCycleData;
            if (z || (DigitizedCardProfile instanceof com.payair.hce.getCvrMaskAnd)) {
                getpinpreentryallowed = new com.payair.hce.getPinPreEntryAllowed<>(z ? (com.payair.hce.getApplicationLifeCycleData) DigitizedCardProfile : null, DigitizedCardProfile instanceof com.payair.hce.getCvrMaskAnd ? (com.payair.hce.getCvrMaskAnd) DigitizedCardProfile : null, iccPrivateKeyCrtComponentsJson, getpinalwaysrequiredifcurrencyprovided);
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid attempt to bind an instance of ");
                sb.append(DigitizedCardProfile.getClass().getName());
                sb.append(" as a @JsonAdapter for ");
                sb.append(getpinalwaysrequiredifcurrencyprovided.toString());
                sb.append(". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }
        return (getpinpreentryallowed == null || !sdkCoreCardRiskManagementDataImpl.AlternateContactlessPaymentDataJson()) ? getpinpreentryallowed : new com.payair.hce.getMagstripeCvmIssuerOptions.AnonymousClass5();
    }

    @Override // com.payair.hce.getCardholderValidators
    public final <T> com.payair.hce.getMagstripeCvmIssuerOptions<T> DigitizedCardProfile(com.payair.hce.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson, com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided<T> getpinalwaysrequiredifcurrencyprovided) {
        com.payair.hce.SdkCoreCardRiskManagementDataImpl sdkCoreCardRiskManagementDataImpl = (com.payair.hce.SdkCoreCardRiskManagementDataImpl) getpinalwaysrequiredifcurrencyprovided.values.getAnnotation(com.payair.hce.SdkCoreCardRiskManagementDataImpl.class);
        if (sdkCoreCardRiskManagementDataImpl == null) {
            return null;
        }
        return (com.payair.hce.getMagstripeCvmIssuerOptions<T>) values(this.values, iccPrivateKeyCrtComponentsJson, getpinalwaysrequiredifcurrencyprovided, sdkCoreCardRiskManagementDataImpl);
    }
}
