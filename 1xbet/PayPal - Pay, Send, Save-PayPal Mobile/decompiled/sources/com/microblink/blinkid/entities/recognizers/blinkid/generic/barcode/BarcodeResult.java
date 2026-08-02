package com.microblink.blinkid.entities.recognizers.blinkid.generic.barcode;

/* loaded from: classes10.dex */
public final class BarcodeResult {
    private final java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    private final long getHighSpeedVideoFpsRangesFor;

    public BarcodeResult(long j, java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = j;
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
    }

    private static native java.lang.String additionalNameInformationNativeGet(long j);

    private static native java.lang.String addressNativeGet(long j);

    private static native int barcodeTypeNativeGet(long j);

    private static native java.lang.String cityNativeGet(long j);

    private static native com.microblink.blinkid.results.date.Date dateOfBirthNativeGet(long j);

    private static native com.microblink.blinkid.results.date.Date dateOfExpiryNativeGet(long j);

    private static native com.microblink.blinkid.results.date.Date dateOfIssueNativeGet(long j);

    private static native java.lang.String documentAdditionalNumberNativeGet(long j);

    private static native java.lang.String documentNumberNativeGet(long j);

    private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.barcode.BarcodeDriverLicenseDetailedInfo driverLicenseDetailedInfoNativeGet(long j);

    private static native java.lang.String employerNativeGet(long j);

    private static native boolean emptyNativeGet(long j);

    private static native long extendedElementsNativeGet(long j);

    private static native java.lang.String firstNameNativeGet(long j);

    private static native java.lang.String fullNameNativeGet(long j);

    private static native java.lang.String issuingAuthorityNativeGet(long j);

    private static native java.lang.String jurisdictionNativeGet(long j);

    private static native java.lang.String lastNameNativeGet(long j);

    private static native java.lang.String maritalStatusNativeGet(long j);

    private static native java.lang.String middleNameNativeGet(long j);

    private static native java.lang.String nationalityNativeGet(long j);

    private static native java.lang.String personalIdNumberNativeGet(long j);

    private static native java.lang.String placeOfBirthNativeGet(long j);

    private static native java.lang.String postalCodeNativeGet(long j);

    private static native java.lang.String professionNativeGet(long j);

    private static native java.lang.String raceNativeGet(long j);

    private static native byte[] rawBytesNativeGet(long j);

    private static native java.lang.String religionNativeGet(long j);

    private static native java.lang.String residentialStatusNativeGet(long j);

    private static native java.lang.String sexNativeGet(long j);

    private static native java.lang.String streetNativeGet(long j);

    private static native java.lang.String stringDataNativeGet(long j);

    private static native boolean uncertainNativeGet(long j);

    public final java.lang.String getAdditionalNameInformation() {
        return additionalNameInformationNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final java.lang.String getAddress() {
        return addressNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final com.microblink.blinkid.entities.recognizers.blinkbarcode.BarcodeType getBarcodeType() {
        return com.microblink.blinkid.entities.recognizers.blinkbarcode.BarcodeType.values()[barcodeTypeNativeGet(this.getHighSpeedVideoFpsRangesFor)];
    }

    public final java.lang.String getCity() {
        return cityNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final com.microblink.blinkid.results.date.Date getDateOfBirth() {
        return dateOfBirthNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final com.microblink.blinkid.results.date.Date getDateOfExpiry() {
        return dateOfExpiryNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final com.microblink.blinkid.results.date.Date getDateOfIssue() {
        return dateOfIssueNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final java.lang.String getDocumentAdditionalNumber() {
        return documentAdditionalNumberNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final java.lang.String getDocumentNumber() {
        return documentNumberNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.barcode.BarcodeDriverLicenseDetailedInfo getDriverLicenseDetailedInfo() {
        return driverLicenseDetailedInfoNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final java.lang.String getEmployer() {
        return employerNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.idbarcode.BarcodeElements getExtendedElements() {
        long extendedElementsNativeGet = extendedElementsNativeGet(this.getHighSpeedVideoFpsRangesFor);
        if (extendedElementsNativeGet != 0) {
            return new com.microblink.blinkid.entities.recognizers.blinkid.idbarcode.BarcodeElements(extendedElementsNativeGet, this);
        }
        throw new java.lang.RuntimeException("Invalid native context for extendedElements");
    }

    public final java.lang.String getFirstName() {
        return firstNameNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final java.lang.String getFullName() {
        return fullNameNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final java.lang.String getIssuingAuthority() {
        return issuingAuthorityNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final java.lang.String getJurisdiction() {
        return jurisdictionNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final java.lang.String getLastName() {
        return lastNameNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final java.lang.String getMaritalStatus() {
        return maritalStatusNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final java.lang.String getMiddleName() {
        return middleNameNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final java.lang.String getNationality() {
        return nationalityNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final java.lang.String getPersonalIdNumber() {
        return personalIdNumberNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final java.lang.String getPlaceOfBirth() {
        return placeOfBirthNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final java.lang.String getPostalCode() {
        return postalCodeNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final java.lang.String getProfession() {
        return professionNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final java.lang.String getRace() {
        return raceNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final byte[] getRawData() {
        return rawBytesNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final java.lang.String getReligion() {
        return religionNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final java.lang.String getResidentialStatus() {
        return residentialStatusNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final java.lang.String getSex() {
        return sexNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final java.lang.String getStreet() {
        return streetNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final java.lang.String getStringData() {
        return stringDataNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final boolean isEmpty() {
        return emptyNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final boolean isUncertain() {
        return uncertainNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }
}
