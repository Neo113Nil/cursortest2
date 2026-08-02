package com.microblink.blinkid.entities.recognizers.blinkid.generic;

/* loaded from: classes10.dex */
public class ExpirationCheckResultEntityInterface {
    public static final java.lang.String CLASS_NAME = "com.microblink.blinkid.entities.recognizers.blinkid.generic.ExpirationCheckResultEntityInterface";

    public com.microblink.blinkid.results.date.SimpleDateResult getDateOfExpiry() {
        return null;
    }

    public boolean isDateOfExpiryPermanent() {
        return false;
    }

    public boolean isExpired() {
        com.microblink.blinkid.results.date.SimpleDateResult dateOfExpiry = getDateOfExpiry();
        if (isDateOfExpiryPermanent() || dateOfExpiry == null || dateOfExpiry.getDate() == null) {
            return false;
        }
        return com.microblink.blinkid.results.date.DateUtils.isDatePassed(dateOfExpiry.getDate());
    }
}
