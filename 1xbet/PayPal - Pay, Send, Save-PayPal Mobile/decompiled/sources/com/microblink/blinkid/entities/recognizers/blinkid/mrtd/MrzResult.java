package com.microblink.blinkid.entities.recognizers.blinkid.mrtd;

/* loaded from: classes10.dex */
public final class MrzResult {
    private final java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    private final long getHighSpeedVideoSizes;

    public MrzResult(long j, java.lang.Object obj) {
        this.getHighSpeedVideoSizes = j;
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
    }

    private static native java.lang.String alienNumberNativeGet(long j);

    private static native java.lang.String applicationReceiptNumberNativeGet(long j);

    private static native com.microblink.blinkid.results.date.Date dateOfBirthNativeGet(long j);

    private static native com.microblink.blinkid.results.date.Date dateOfExpiryNativeGet(long j);

    private static native java.lang.String documentCodeNativeGet(long j);

    private static native java.lang.String documentNumberNativeGet(long j);

    private static native int documentTypeNativeGet(long j);

    private static native java.lang.String genderNativeGet(long j);

    private static native java.lang.String immigrantCaseNumberNativeGet(long j);

    private static native java.lang.String issuerNameNativeGet(long j);

    private static native java.lang.String issuerNativeGet(long j);

    private static native java.lang.String nationalityNameNativeGet(long j);

    private static native java.lang.String nationalityNativeGet(long j);

    private static native java.lang.String opt1NativeGet(long j);

    private static native java.lang.String opt2NativeGet(long j);

    private static native boolean parsedNativeGet(long j);

    private static native java.lang.String primaryIDNativeGet(long j);

    private static native java.lang.String rawMRZStringNativeGet(long j);

    private static native java.lang.String sanitizedDocumentCodeNativeGet(long j);

    private static native java.lang.String sanitizedDocumentNumberNativeGet(long j);

    private static native java.lang.String sanitizedIssuerNativeGet(long j);

    private static native java.lang.String sanitizedNationalityNativeGet(long j);

    private static native java.lang.String sanitizedOpt1NativeGet(long j);

    private static native java.lang.String sanitizedOpt2NativeGet(long j);

    private static native java.lang.String secondaryIDNativeGet(long j);

    private static native boolean verifiedNativeGet(long j);

    public final int getAge() {
        com.microblink.blinkid.results.date.SimpleDate date = getDateOfBirth().getDate();
        if (date == null) {
            return -1;
        }
        return com.microblink.blinkid.results.date.DateUtils.yearsPassedFrom(date);
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.AgeLimitStatus getAgeLimitStatus(int i) {
        int age = getAge();
        return age == -1 ? com.microblink.blinkid.entities.recognizers.blinkid.AgeLimitStatus.NotAvailable : age >= i ? com.microblink.blinkid.entities.recognizers.blinkid.AgeLimitStatus.OverAgeLimit : com.microblink.blinkid.entities.recognizers.blinkid.AgeLimitStatus.BelowAgeLimit;
    }

    public final java.lang.String getAlienNumber() {
        return alienNumberNativeGet(this.getHighSpeedVideoSizes);
    }

    public final java.lang.String getApplicationReceiptNumber() {
        return applicationReceiptNumberNativeGet(this.getHighSpeedVideoSizes);
    }

    public final com.microblink.blinkid.results.date.Date getDateOfBirth() {
        return dateOfBirthNativeGet(this.getHighSpeedVideoSizes);
    }

    public final com.microblink.blinkid.results.date.Date getDateOfExpiry() {
        return dateOfExpiryNativeGet(this.getHighSpeedVideoSizes);
    }

    public final java.lang.String getDocumentCode() {
        return documentCodeNativeGet(this.getHighSpeedVideoSizes);
    }

    public final java.lang.String getDocumentNumber() {
        return documentNumberNativeGet(this.getHighSpeedVideoSizes);
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdDocumentType getDocumentType() {
        return com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdDocumentType.values()[documentTypeNativeGet(this.getHighSpeedVideoSizes)];
    }

    public final java.lang.String getGender() {
        return genderNativeGet(this.getHighSpeedVideoSizes);
    }

    public final java.lang.String getImmigrantCaseNumber() {
        return immigrantCaseNumberNativeGet(this.getHighSpeedVideoSizes);
    }

    public final java.lang.String getIssuer() {
        return issuerNativeGet(this.getHighSpeedVideoSizes);
    }

    public final java.lang.String getIssuerName() {
        return issuerNameNativeGet(this.getHighSpeedVideoSizes);
    }

    public final java.lang.String getMrzText() {
        return rawMRZStringNativeGet(this.getHighSpeedVideoSizes);
    }

    public final java.lang.String getNationality() {
        return nationalityNativeGet(this.getHighSpeedVideoSizes);
    }

    public final java.lang.String getNationalityName() {
        return nationalityNameNativeGet(this.getHighSpeedVideoSizes);
    }

    public final java.lang.String getOpt1() {
        return opt1NativeGet(this.getHighSpeedVideoSizes);
    }

    public final java.lang.String getOpt2() {
        return opt2NativeGet(this.getHighSpeedVideoSizes);
    }

    public final java.lang.String getPrimaryId() {
        return primaryIDNativeGet(this.getHighSpeedVideoSizes);
    }

    public final java.lang.String getSanitizedDocumentCode() {
        return sanitizedDocumentCodeNativeGet(this.getHighSpeedVideoSizes);
    }

    public final java.lang.String getSanitizedDocumentNumber() {
        return sanitizedDocumentNumberNativeGet(this.getHighSpeedVideoSizes);
    }

    public final java.lang.String getSanitizedIssuer() {
        return sanitizedIssuerNativeGet(this.getHighSpeedVideoSizes);
    }

    public final java.lang.String getSanitizedNationality() {
        return sanitizedNationalityNativeGet(this.getHighSpeedVideoSizes);
    }

    public final java.lang.String getSanitizedOpt1() {
        return sanitizedOpt1NativeGet(this.getHighSpeedVideoSizes);
    }

    public final java.lang.String getSanitizedOpt2() {
        return sanitizedOpt2NativeGet(this.getHighSpeedVideoSizes);
    }

    public final java.lang.String getSecondaryId() {
        return secondaryIDNativeGet(this.getHighSpeedVideoSizes);
    }

    public final boolean isMrzParsed() {
        return parsedNativeGet(this.getHighSpeedVideoSizes);
    }

    public final boolean isMrzVerified() {
        return verifiedNativeGet(this.getHighSpeedVideoSizes);
    }
}
