package com.microblink.blinkid.fragment.overlay.blinkid.reticleui;

/* loaded from: classes10.dex */
public enum MandatoryFieldType {
    AdditionalAddressInformation(com.microblink.blinkid.library.R.string.mb_blinkid_mf_additional_address_information),
    AdditionalNameInformation(com.microblink.blinkid.library.R.string.mb_blinkid_mf_additional_name_information),
    AdditionalOptionalAddressInformation(com.microblink.blinkid.library.R.string.mb_blinkid_mf_additional_optional_address_information),
    AdditionalPersonalIdNumber(com.microblink.blinkid.library.R.string.mb_blinkid_mf_additional_personal_id_number),
    Address(com.microblink.blinkid.library.R.string.mb_blinkid_mf_address),
    ClassEffectiveDate(com.microblink.blinkid.library.R.string.mb_blinkid_mf_class_effective_date),
    ClassExpiryDate(com.microblink.blinkid.library.R.string.mb_blinkid_mf_class_expiry_date),
    Conditions(com.microblink.blinkid.library.R.string.mb_blinkid_mf_conditions),
    DateOfBirth(com.microblink.blinkid.library.R.string.mb_blinkid_mf_date_of_birth),
    DateOfExpiry(com.microblink.blinkid.library.R.string.mb_blinkid_mf_date_of_expiry),
    DateOfIssue(com.microblink.blinkid.library.R.string.mb_blinkid_mf_date_of_issue),
    DocumentAdditionalNumber(com.microblink.blinkid.library.R.string.mb_blinkid_mf_document_additional_number),
    DocumentOptionalAdditionalNumber(com.microblink.blinkid.library.R.string.mb_blinkid_mf_document_optional_additional_number),
    DocumentNumber(com.microblink.blinkid.library.R.string.mb_blinkid_mf_document_number),
    Employer(com.microblink.blinkid.library.R.string.mb_blinkid_mf_employer),
    Endorsements(com.microblink.blinkid.library.R.string.mb_blinkid_mf_endorsements),
    FathersName(com.microblink.blinkid.library.R.string.mb_blinkid_mf_fathers_name),
    FirstName(com.microblink.blinkid.library.R.string.mb_blinkid_mf_first_name),
    FullName(com.microblink.blinkid.library.R.string.mb_blinkid_mf_name),
    IssuingAuthority(com.microblink.blinkid.library.R.string.mb_blinkid_mf_issuing_authority),
    LastName(com.microblink.blinkid.library.R.string.mb_blinkid_mf_last_name),
    LicenceType(com.microblink.blinkid.library.R.string.mb_blinkid_mf_license_type),
    LocalizedName(com.microblink.blinkid.library.R.string.mb_blinkid_mf_localized_name),
    MaritalStatus(com.microblink.blinkid.library.R.string.mb_blinkid_mf_marital_status),
    MothersName(com.microblink.blinkid.library.R.string.mb_blinkid_mf_mothers_name),
    Mrz(com.microblink.blinkid.library.R.string.mb_blinkid_mf_mrz),
    Nationality(com.microblink.blinkid.library.R.string.mb_blinkid_mf_nationality),
    PersonalIdNumber(com.microblink.blinkid.library.R.string.mb_blinkid_mf_personal_id_number),
    PlaceOfBirth(com.microblink.blinkid.library.R.string.mb_blinkid_mf_place_of_birth),
    Profession(com.microblink.blinkid.library.R.string.mb_blinkid_mf_profession),
    Race(com.microblink.blinkid.library.R.string.mb_blinkid_mf_race),
    Religion(com.microblink.blinkid.library.R.string.mb_blinkid_mf_religion),
    ResidentialStatus(com.microblink.blinkid.library.R.string.mb_blinkid_mf_residential_status),
    Restrictions(com.microblink.blinkid.library.R.string.mb_blinkid_mf_restrictions),
    Sex(com.microblink.blinkid.library.R.string.mb_blinkid_mf_sex),
    VehicleClass(com.microblink.blinkid.library.R.string.mb_blinkid_mf_vehicle_class),
    BloodType(com.microblink.blinkid.library.R.string.mb_blinkid_mf_blood_type),
    Sponsor(com.microblink.blinkid.library.R.string.mb_blinkid_mf_sponsor),
    VisaType(com.microblink.blinkid.library.R.string.mb_blinkid_mf_visa_type),
    DocumentSubtype(com.microblink.blinkid.library.R.string.mb_blinkid_mf_document_subtype),
    Remarks(com.microblink.blinkid.library.R.string.mb_blinkid_mf_remarks),
    ResidencePermitType(com.microblink.blinkid.library.R.string.mb_blinkid_mf_residence_permit_type),
    ManufacturingYear(com.microblink.blinkid.library.R.string.mb_blinkid_mf_manufacturing_year),
    VehicleType(com.microblink.blinkid.library.R.string.mb_blinkid_mf_vehicle_type),
    DependentDateOfBirth(com.microblink.blinkid.library.R.string.mb_blinkid_mf_dependent_dob),
    DependentSex(com.microblink.blinkid.library.R.string.mb_blinkid_mf_dependent_sex),
    DependentDocumentNumber(com.microblink.blinkid.library.R.string.mb_blinkid_mf_dependent_document_number),
    DependentFullName(com.microblink.blinkid.library.R.string.mb_blinkid_mf_dependent_full_name),
    EligibilityCategory(com.microblink.blinkid.library.R.string.mb_blinkid_mf_eligibility_category),
    SpecificDocumentValidity(com.microblink.blinkid.library.R.string.mb_blinkid_mf_specific_document_validity),
    VehicleOwner(com.microblink.blinkid.library.R.string.mb_blinkid_mf_vehicle_owner);

    public final int mandatoryFieldMissingTooltipStringResource;

    MandatoryFieldType(int i) {
        this.mandatoryFieldMissingTooltipStringResource = i;
    }

    public static com.microblink.blinkid.fragment.overlay.blinkid.reticleui.MandatoryFieldType[] fieldTypeToMandatoryFieldTypeArray(com.microblink.blinkid.entities.recognizers.blinkid.generic.FieldType[] fieldTypeArr) {
        com.microblink.blinkid.fragment.overlay.blinkid.reticleui.MandatoryFieldType[] mandatoryFieldTypeArr = new com.microblink.blinkid.fragment.overlay.blinkid.reticleui.MandatoryFieldType[fieldTypeArr.length];
        for (int i = 0; i < fieldTypeArr.length; i++) {
            mandatoryFieldTypeArr[i] = values()[fieldTypeArr[i].ordinal()];
        }
        return mandatoryFieldTypeArr;
    }

    public static com.microblink.blinkid.entities.recognizers.blinkid.generic.FieldType[] mandatoryFieldTypeToFieldTypeArray(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.MandatoryFieldType[] mandatoryFieldTypeArr) {
        com.microblink.blinkid.entities.recognizers.blinkid.generic.FieldType[] fieldTypeArr = new com.microblink.blinkid.entities.recognizers.blinkid.generic.FieldType[mandatoryFieldTypeArr.length];
        for (int i = 0; i < mandatoryFieldTypeArr.length; i++) {
            fieldTypeArr[i] = com.microblink.blinkid.entities.recognizers.blinkid.generic.FieldType.values()[mandatoryFieldTypeArr[i].ordinal()];
        }
        return fieldTypeArr;
    }
}
