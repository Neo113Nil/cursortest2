package com.microblink.blinkid.entities.recognizers.blinkid.generic.viz;

/* loaded from: classes10.dex */
public final class VizResult {
    private final java.lang.Object getHighSpeedVideoFpsRanges;
    private final long getHighSpeedVideoFpsRangesFor;

    public VizResult(long j, java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = j;
        this.getHighSpeedVideoFpsRanges = obj;
    }

    private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult additionalAddressInformationNativeGet(long j);

    private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult additionalNameInformationNativeGet(long j);

    private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult additionalOptionalAddressInformationNativeGet(long j);

    private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult additionalPersonalIdNumberNativeGet(long j);

    private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult addressNativeGet(long j);

    private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult bloodTypeNativeGet(long j);

    private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.DateResult dateOfBirthNativeGet(long j);

    private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.DateResult dateOfExpiryNativeGet(long j);

    private static native boolean dateOfExpiryPermanentNativeGet(long j);

    private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.DateResult dateOfIssueNativeGet(long j);

    private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.DependentInfo[] dependentsInfoNativeGet(long j);

    private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult documentAdditionalNumberNativeGet(long j);

    private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult documentNumberNativeGet(long j);

    private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult documentOptionalAdditionalNumberNativeGet(long j);

    private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult documentSubtypeNativeGet(long j);

    private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.DriverLicenseDetailedInfo driverLicenseDetailedInfoNativeGet(long j);

    private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult eligibilityCategoryNativeGet(long j);

    private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult employerNativeGet(long j);

    private static native boolean emptyNativeGet(long j);

    private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult fathersNameNativeGet(long j);

    private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult firstNameNativeGet(long j);

    private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult fullNameNativeGet(long j);

    private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult issuingAuthorityNativeGet(long j);

    private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult lastNameNativeGet(long j);

    private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult localizedNameNativeGet(long j);

    private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult manufacturingYearNativeGet(long j);

    private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult maritalStatusNativeGet(long j);

    private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult mothersNameNativeGet(long j);

    private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult nationalityNativeGet(long j);

    private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult personalIdNumberNativeGet(long j);

    private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult placeOfBirthNativeGet(long j);

    private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult professionNativeGet(long j);

    private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult raceNativeGet(long j);

    private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult religionNativeGet(long j);

    private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult remarksNativeGet(long j);

    private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult residencePermitTypeNativeGet(long j);

    private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult residentialStatusNativeGet(long j);

    private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult sexNativeGet(long j);

    private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult specificDocumentValidityNativeGet(long j);

    private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult sponsorNativeGet(long j);

    private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult vehicleOwnerNativeGet(long j);

    private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult vehicleTypeNativeGet(long j);

    private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult visaTypeNativeGet(long j);

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getAdditionalAddressInformation() {
        return additionalAddressInformationNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getAdditionalNameInformation() {
        return additionalNameInformationNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getAdditionalOptionalAddressInformation() {
        return additionalOptionalAddressInformationNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getAdditionalPersonalIdNumber() {
        return additionalPersonalIdNumberNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getAddress() {
        return addressNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getBloodType() {
        return bloodTypeNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.DateResult getDateOfBirth() {
        return dateOfBirthNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.DateResult getDateOfExpiry() {
        return dateOfExpiryNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.DateResult getDateOfIssue() {
        return dateOfIssueNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.DependentInfo[] getDependentsInfo() {
        return dependentsInfoNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getDocumentAdditionalNumber() {
        return documentAdditionalNumberNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getDocumentNumber() {
        return documentNumberNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getDocumentOptionalAdditionalNumber() {
        return documentOptionalAdditionalNumberNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getDocumentSubtype() {
        return documentSubtypeNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.DriverLicenseDetailedInfo getDriverLicenseDetailedInfo() {
        return driverLicenseDetailedInfoNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getEligibilityCategory() {
        return eligibilityCategoryNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getEmployer() {
        return employerNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getFathersName() {
        return fathersNameNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getFirstName() {
        return firstNameNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getFullName() {
        return fullNameNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getIssuingAuthority() {
        return issuingAuthorityNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getLastName() {
        return lastNameNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getLocalizedName() {
        return localizedNameNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getManufacturingYear() {
        return manufacturingYearNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getMaritalStatus() {
        return maritalStatusNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getMothersName() {
        return mothersNameNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getNationality() {
        return nationalityNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getPersonalIdNumber() {
        return personalIdNumberNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getPlaceOfBirth() {
        return placeOfBirthNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getProfession() {
        return professionNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getRace() {
        return raceNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getReligion() {
        return religionNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getRemarks() {
        return remarksNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getResidencePermitType() {
        return residencePermitTypeNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getResidentialStatus() {
        return residentialStatusNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getSex() {
        return sexNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getSpecificDocumentValidity() {
        return specificDocumentValidityNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getSponsor() {
        return sponsorNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getVehicleOwner() {
        return vehicleOwnerNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getVehicleType() {
        return vehicleTypeNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getVisaType() {
        return visaTypeNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final boolean isDateOfExpiryPermanent() {
        return dateOfExpiryPermanentNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }

    public final boolean isEmpty() {
        return emptyNativeGet(this.getHighSpeedVideoFpsRangesFor);
    }
}
