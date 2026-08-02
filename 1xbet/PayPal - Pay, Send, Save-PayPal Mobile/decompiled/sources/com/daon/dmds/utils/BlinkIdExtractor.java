package com.daon.dmds.utils;

/* loaded from: classes7.dex */
public class BlinkIdExtractor {

    /* renamed from: com.daon.dmds.utils.BlinkIdExtractor$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Camera2StreamConfigurationMap;

        static {
            int[] iArr = new int[com.microblink.blinkid.entities.recognizers.blinkid.DataMatchState.values().length];
            Camera2StreamConfigurationMap = iArr;
            try {
                iArr[com.microblink.blinkid.entities.recognizers.blinkid.DataMatchState.Success.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                Camera2StreamConfigurationMap[com.microblink.blinkid.entities.recognizers.blinkid.DataMatchState.Failed.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    public static java.util.Map<java.lang.String, java.lang.String> extractBarcodeData(com.microblink.blinkid.entities.recognizers.blinkid.generic.barcode.BarcodeResult barcodeResult) {
        if (barcodeResult == null) {
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String additionalNameInformation = barcodeResult.getAdditionalNameInformation();
        if (additionalNameInformation != null && !additionalNameInformation.isEmpty() && !additionalNameInformation.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.AdditionalNameInformation, additionalNameInformation);
        }
        java.lang.String address = barcodeResult.getAddress();
        if (address != null && !address.isEmpty() && !address.equalsIgnoreCase("none")) {
            hashMap.put("Address", address);
        }
        java.lang.String name2 = barcodeResult.getBarcodeType().name();
        if (name2 != null && !name2.isEmpty() && !name2.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.BarcodeType, name2);
        }
        java.lang.String city = barcodeResult.getCity();
        if (city != null && !city.isEmpty() && !city.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.AddressCity, city);
        }
        java.lang.String dateToString = com.daon.dmds.utils.DMDSDocumentUtils.dateToString(barcodeResult.getDateOfBirth());
        if (dateToString != null && !dateToString.isEmpty() && !dateToString.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.DateOfBirth, dateToString);
        }
        java.lang.String dateToString2 = com.daon.dmds.utils.DMDSDocumentUtils.dateToString(barcodeResult.getDateOfExpiry());
        if (dateToString2 != null && !dateToString2.isEmpty() && !dateToString2.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.DateOfExpiry, dateToString2);
        }
        java.lang.String dateToString3 = com.daon.dmds.utils.DMDSDocumentUtils.dateToString(barcodeResult.getDateOfIssue());
        if (dateToString3 != null && !dateToString3.isEmpty() && !dateToString3.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.DateOfIssue, dateToString3);
        }
        java.lang.String documentAdditionalNumber = barcodeResult.getDocumentAdditionalNumber();
        if (documentAdditionalNumber != null && !documentAdditionalNumber.isEmpty() && !documentAdditionalNumber.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.DocumentAdditionalNumber, documentAdditionalNumber);
        }
        java.lang.String documentNumber = barcodeResult.getDocumentNumber();
        if (documentNumber != null && !documentNumber.isEmpty() && !documentNumber.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.DocumentNumber, documentNumber);
        }
        com.microblink.blinkid.entities.recognizers.blinkid.generic.barcode.BarcodeDriverLicenseDetailedInfo driverLicenseDetailedInfo = barcodeResult.getDriverLicenseDetailedInfo();
        if (!driverLicenseDetailedInfo.isEmpty()) {
            java.lang.String conditions = driverLicenseDetailedInfo.getConditions();
            if (conditions != null && !conditions.isEmpty() && !conditions.equalsIgnoreCase("none")) {
                hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.Conditions, conditions);
            }
            java.lang.String endorsements = driverLicenseDetailedInfo.getEndorsements();
            if (endorsements != null && !endorsements.isEmpty() && !endorsements.equalsIgnoreCase("none")) {
                hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.DlEndorsed, endorsements);
            }
            java.lang.String restrictions = driverLicenseDetailedInfo.getRestrictions();
            if (restrictions != null && !restrictions.isEmpty() && !restrictions.equalsIgnoreCase("none")) {
                hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.Restriction, restrictions);
            }
            java.lang.String vehicleClass = driverLicenseDetailedInfo.getVehicleClass();
            if (vehicleClass != null && !vehicleClass.isEmpty() && !vehicleClass.equalsIgnoreCase("none")) {
                hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.DLClass, vehicleClass);
            }
            int i = 0;
            for (com.microblink.blinkid.entities.recognizers.blinkid.generic.barcode.BarcodeVehicleClassInfo barcodeVehicleClassInfo : driverLicenseDetailedInfo.getVehicleClassesInfo()) {
                java.lang.String concat = i == 0 ? "" : " ".concat(java.lang.String.valueOf(i));
                java.lang.String concat2 = com.daon.dmds.recognizers.IDMDSResultCreatorFields.EffectiveDate.concat(java.lang.String.valueOf(concat));
                java.lang.String dateToString4 = com.daon.dmds.utils.DMDSDocumentUtils.dateToString(barcodeVehicleClassInfo.getEffectiveDate());
                if (dateToString4 != null && !dateToString4.isEmpty() && !dateToString4.equalsIgnoreCase("none")) {
                    hashMap.put(concat2, dateToString4);
                }
                java.lang.String concat3 = com.daon.dmds.recognizers.IDMDSResultCreatorFields.DateOfExpiry.concat(java.lang.String.valueOf(concat));
                java.lang.String dateToString5 = com.daon.dmds.utils.DMDSDocumentUtils.dateToString(barcodeVehicleClassInfo.getExpiryDate());
                if (dateToString5 != null && !dateToString5.isEmpty() && !dateToString5.equalsIgnoreCase("none")) {
                    hashMap.put(concat3, dateToString5);
                }
                java.lang.String concat4 = com.daon.dmds.recognizers.IDMDSResultCreatorFields.LicenceType.concat(java.lang.String.valueOf(concat));
                java.lang.String licenceType = barcodeVehicleClassInfo.getLicenceType();
                if (licenceType != null && !licenceType.isEmpty() && !licenceType.equalsIgnoreCase("none")) {
                    hashMap.put(concat4, licenceType);
                }
                java.lang.String concat5 = com.daon.dmds.recognizers.IDMDSResultCreatorFields.VehicleClass.concat(java.lang.String.valueOf(concat));
                java.lang.String vehicleClass2 = barcodeVehicleClassInfo.getVehicleClass();
                if (vehicleClass2 != null && !vehicleClass2.isEmpty() && !vehicleClass2.equalsIgnoreCase("none")) {
                    hashMap.put(concat5, vehicleClass2);
                }
                i++;
            }
        }
        java.lang.String employer = barcodeResult.getEmployer();
        if (employer != null && !employer.isEmpty() && !employer.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.Employer, employer);
        }
        java.lang.String firstName = barcodeResult.getFirstName();
        if (firstName != null && !firstName.isEmpty() && !firstName.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.GivenNames, firstName);
        }
        java.lang.String fullName = barcodeResult.getFullName();
        if (fullName != null && !fullName.isEmpty() && !fullName.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.SurnameAndGivenNames, fullName);
        }
        java.lang.String issuingAuthority = barcodeResult.getIssuingAuthority();
        if (issuingAuthority != null && !issuingAuthority.isEmpty() && !issuingAuthority.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.IssuerAuthority, issuingAuthority);
        }
        java.lang.String jurisdiction = barcodeResult.getJurisdiction();
        if (jurisdiction != null && !jurisdiction.isEmpty() && !jurisdiction.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.AddressJurisdictionCode, jurisdiction);
        }
        java.lang.String lastName = barcodeResult.getLastName();
        if (lastName != null && !lastName.isEmpty() && !lastName.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.Surname, lastName);
        }
        java.lang.String maritalStatus = barcodeResult.getMaritalStatus();
        if (maritalStatus != null && !maritalStatus.isEmpty() && !maritalStatus.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.MaritalStatus, maritalStatus);
        }
        java.lang.String middleName = barcodeResult.getMiddleName();
        if (middleName != null && !middleName.isEmpty() && !middleName.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.MiddleName, middleName);
        }
        java.lang.String nationality = barcodeResult.getNationality();
        if (nationality != null && !nationality.isEmpty() && !nationality.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.Nationality, nationality);
        }
        java.lang.String personalIdNumber = barcodeResult.getPersonalIdNumber();
        if (personalIdNumber != null && !personalIdNumber.isEmpty() && !personalIdNumber.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.PersonalNumber, personalIdNumber);
        }
        java.lang.String placeOfBirth = barcodeResult.getPlaceOfBirth();
        if (placeOfBirth != null && !placeOfBirth.isEmpty() && !placeOfBirth.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.PlaceOfBirth, placeOfBirth);
        }
        java.lang.String postalCode = barcodeResult.getPostalCode();
        if (postalCode != null && !postalCode.isEmpty() && !postalCode.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.AddressPostalCode, postalCode);
        }
        java.lang.String profession = barcodeResult.getProfession();
        if (profession != null && !profession.isEmpty() && !profession.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.Profession, profession);
        }
        java.lang.String race = barcodeResult.getRace();
        if (race != null && !race.isEmpty() && !race.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.Race, race);
        }
        java.lang.String religion = barcodeResult.getReligion();
        if (religion != null && !religion.isEmpty() && !religion.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.Religion, religion);
        }
        java.lang.String residentialStatus = barcodeResult.getResidentialStatus();
        if (residentialStatus != null && !residentialStatus.isEmpty() && !residentialStatus.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.ResidentialStatus, residentialStatus);
        }
        java.lang.String sex = barcodeResult.getSex();
        if (sex != null && !sex.isEmpty() && !sex.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.Sex, sex);
        }
        java.lang.String street = barcodeResult.getStreet();
        if (street != null && !street.isEmpty() && !street.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.AddressStreet, street);
        }
        return hashMap;
    }

    public static java.util.Map<java.lang.String, java.lang.String> extractIdBarcodeResults(com.microblink.blinkid.entities.recognizers.blinkid.idbarcode.IdBarcodeRecognizer.Result result) {
        java.lang.String str;
        if (result == null) {
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String additionalNameInformation = result.getAdditionalNameInformation();
        if (additionalNameInformation != null && !additionalNameInformation.isEmpty() && !additionalNameInformation.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.AdditionalNameInformation, additionalNameInformation);
        }
        java.lang.String address = result.getAddress();
        if (address != null && !address.isEmpty() && !address.equalsIgnoreCase("none")) {
            hashMap.put("Address", address);
        }
        if (result.getAge() != -1) {
            if (result.getAge() != 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(result.getAge());
                str = sb.toString();
            } else {
                str = "";
            }
            if (str != null && !str.isEmpty() && !str.equalsIgnoreCase("none")) {
                hashMap.put("Age", str);
            }
        }
        java.lang.String name2 = result.getBarcodeType().name();
        if (name2 != null && !name2.isEmpty() && !name2.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.BarcodeType, name2);
        }
        java.lang.String city = result.getCity();
        if (city != null && !city.isEmpty() && !city.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.AddressCity, city);
        }
        java.lang.String dateToString = com.daon.dmds.utils.DMDSDocumentUtils.dateToString(result.getDateOfBirth());
        if (dateToString != null && !dateToString.isEmpty() && !dateToString.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.DateOfBirth, dateToString);
        }
        java.lang.String dateToString2 = com.daon.dmds.utils.DMDSDocumentUtils.dateToString(result.getDateOfExpiry());
        if (dateToString2 != null && !dateToString2.isEmpty() && !dateToString2.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.DateOfExpiry, dateToString2);
        }
        java.lang.String dateToString3 = com.daon.dmds.utils.DMDSDocumentUtils.dateToString(result.getDateOfIssue());
        if (dateToString3 != null && !dateToString3.isEmpty() && !dateToString3.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.DateOfIssue, dateToString3);
        }
        java.lang.String documentAdditionalNumber = result.getDocumentAdditionalNumber();
        if (documentAdditionalNumber != null && !documentAdditionalNumber.isEmpty() && !documentAdditionalNumber.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.DocumentAdditionalNumber, documentAdditionalNumber);
        }
        java.lang.String documentNumber = result.getDocumentNumber();
        if (documentNumber != null && !documentNumber.isEmpty() && !documentNumber.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.DocumentNumber, documentNumber);
        }
        java.lang.String name3 = result.getDocumentType().name();
        if (name3 != null && !name3.isEmpty() && !name3.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.DocumentType, name3);
        }
        java.lang.String employer = result.getEmployer();
        if (employer != null && !employer.isEmpty() && !employer.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.Employer, employer);
        }
        java.lang.String endorsements = result.getEndorsements();
        if (endorsements != null && !endorsements.isEmpty() && !endorsements.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.DlEndorsed, endorsements);
        }
        java.lang.String firstName = result.getFirstName();
        if (firstName != null && !firstName.isEmpty() && !firstName.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.GivenNames, firstName);
        }
        java.lang.String fullName = result.getFullName();
        if (fullName != null && !fullName.isEmpty() && !fullName.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.SurnameAndGivenNames, fullName);
        }
        java.lang.String issuingAuthority = result.getIssuingAuthority();
        if (issuingAuthority != null && !issuingAuthority.isEmpty() && !issuingAuthority.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.IssuerAuthority, issuingAuthority);
        }
        java.lang.String jurisdiction = result.getJurisdiction();
        if (jurisdiction != null && !jurisdiction.isEmpty() && !jurisdiction.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.AddressJurisdictionCode, jurisdiction);
        }
        java.lang.String lastName = result.getLastName();
        if (lastName != null && !lastName.isEmpty() && !lastName.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.Surname, lastName);
        }
        java.lang.String maritalStatus = result.getMaritalStatus();
        if (maritalStatus != null && !maritalStatus.isEmpty() && !maritalStatus.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.MaritalStatus, maritalStatus);
        }
        java.lang.String middleName = result.getMiddleName();
        if (middleName != null && !middleName.isEmpty() && !middleName.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.MiddleName, middleName);
        }
        java.lang.String nationality = result.getNationality();
        if (nationality != null && !nationality.isEmpty() && !nationality.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.Nationality, nationality);
        }
        java.lang.String personalIdNumber = result.getPersonalIdNumber();
        if (personalIdNumber != null && !personalIdNumber.isEmpty() && !personalIdNumber.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.PersonalNumber, personalIdNumber);
        }
        java.lang.String placeOfBirth = result.getPlaceOfBirth();
        if (placeOfBirth != null && !placeOfBirth.isEmpty() && !placeOfBirth.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.PlaceOfBirth, placeOfBirth);
        }
        java.lang.String postalCode = result.getPostalCode();
        if (postalCode != null && !postalCode.isEmpty() && !postalCode.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.AddressPostalCode, postalCode);
        }
        java.lang.String profession = result.getProfession();
        if (profession != null && !profession.isEmpty() && !profession.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.Profession, profession);
        }
        java.lang.String race = result.getRace();
        if (race != null && !race.isEmpty() && !race.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.Race, race);
        }
        java.lang.String religion = result.getReligion();
        if (religion != null && !religion.isEmpty() && !religion.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.Religion, religion);
        }
        java.lang.String residentialStatus = result.getResidentialStatus();
        if (residentialStatus != null && !residentialStatus.isEmpty() && !residentialStatus.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.ResidentialStatus, residentialStatus);
        }
        java.lang.String restrictions = result.getRestrictions();
        if (restrictions != null && !restrictions.isEmpty() && !restrictions.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.Restriction, restrictions);
        }
        java.lang.String sex = result.getSex();
        if (sex != null && !sex.isEmpty() && !sex.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.Sex, sex);
        }
        java.lang.String street = result.getStreet();
        if (street != null && !street.isEmpty() && !street.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.AddressStreet, street);
        }
        java.lang.String vehicleClass = result.getVehicleClass();
        if (vehicleClass != null && !vehicleClass.isEmpty() && !vehicleClass.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.DLClass, vehicleClass);
        }
        java.lang.String stringData = result.getStringData();
        if (stringData != null && !stringData.isEmpty() && !stringData.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.BarcodeData, stringData);
        }
        java.lang.String bool = java.lang.Boolean.toString(result.isUncertain());
        if (bool != null && !bool.isEmpty() && !bool.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.UncertainData, bool);
        }
        java.lang.String arrays = java.util.Arrays.toString(result.getRawData());
        if (arrays != null && !arrays.isEmpty() && !arrays.equalsIgnoreCase("none")) {
            hashMap.put("rawBarcodeData", arrays);
        }
        return hashMap;
    }

    public static java.util.Map<java.lang.String, java.lang.String> extractMrzData(com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrzResult mrzResult) {
        java.lang.String str;
        if (mrzResult == null || !mrzResult.isMrzParsed()) {
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        if (mrzResult.getAge() != -1) {
            if (mrzResult.getAge() != 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(mrzResult.getAge());
                str = sb.toString();
            } else {
                str = "";
            }
            if (str != null && !str.isEmpty() && !str.equalsIgnoreCase("none")) {
                hashMap.put("Age", str);
            }
        }
        java.lang.String alienNumber = mrzResult.getAlienNumber();
        if (alienNumber != null && !alienNumber.isEmpty() && !alienNumber.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.AlienNumber, alienNumber);
        }
        java.lang.String applicationReceiptNumber = mrzResult.getApplicationReceiptNumber();
        if (applicationReceiptNumber != null && !applicationReceiptNumber.isEmpty() && !applicationReceiptNumber.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.ApplicationReceiptNumber, applicationReceiptNumber);
        }
        java.lang.String dateToString = com.daon.dmds.utils.DMDSDocumentUtils.dateToString(mrzResult.getDateOfBirth());
        if (dateToString != null && !dateToString.isEmpty() && !dateToString.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.DateOfBirth, dateToString);
        }
        java.lang.String dateToString2 = com.daon.dmds.utils.DMDSDocumentUtils.dateToString(mrzResult.getDateOfExpiry());
        if (dateToString2 != null && !dateToString2.isEmpty() && !dateToString2.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.DateOfExpiry, dateToString2);
        }
        java.lang.String documentCode = mrzResult.getDocumentCode();
        if (documentCode != null && !documentCode.isEmpty() && !documentCode.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.DocumentClassCode, documentCode);
        }
        java.lang.String documentNumber = mrzResult.getDocumentNumber();
        if (documentNumber != null && !documentNumber.isEmpty() && !documentNumber.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.DocumentNumber, documentNumber);
        }
        java.lang.String name2 = mrzResult.getDocumentType().name();
        if (name2 != null && !name2.isEmpty() && !name2.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.DocumentType, name2);
        }
        java.lang.String gender = mrzResult.getGender();
        if (gender != null && !gender.isEmpty() && !gender.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.Sex, gender);
        }
        java.lang.String immigrantCaseNumber = mrzResult.getImmigrantCaseNumber();
        if (immigrantCaseNumber != null && !immigrantCaseNumber.isEmpty() && !immigrantCaseNumber.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.ImmigrantCaseNumber, immigrantCaseNumber);
        }
        java.lang.String issuer = mrzResult.getIssuer();
        if (issuer != null && !issuer.isEmpty() && !issuer.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.IssuingStateCode, issuer);
        }
        java.lang.String issuerName = mrzResult.getIssuerName();
        if (issuerName != null && !issuerName.isEmpty() && !issuerName.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.IssuerName, issuerName);
        }
        java.lang.String mrzText = mrzResult.getMrzText();
        if (mrzText != null && !mrzText.isEmpty() && !mrzText.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.MRZStrings, mrzText);
        }
        java.lang.String nationality = mrzResult.getNationality();
        if (nationality != null && !nationality.isEmpty() && !nationality.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.Nationality, nationality);
        }
        java.lang.String nationalityName = mrzResult.getNationalityName();
        if (nationalityName != null && !nationalityName.isEmpty() && !nationalityName.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.NationalityName, nationalityName);
        }
        java.lang.String opt1 = mrzResult.getOpt1();
        if (opt1 != null && !opt1.isEmpty() && !opt1.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.Opt1, opt1);
        }
        java.lang.String opt2 = mrzResult.getOpt2();
        if (opt2 != null && !opt2.isEmpty() && !opt2.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.Opt2, opt2);
        }
        java.lang.String primaryId = mrzResult.getPrimaryId();
        if (primaryId != null && !primaryId.isEmpty() && !primaryId.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.Surname, primaryId);
        }
        java.lang.String sanitizedDocumentCode = mrzResult.getSanitizedDocumentCode();
        if (sanitizedDocumentCode != null && !sanitizedDocumentCode.isEmpty() && !sanitizedDocumentCode.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.SanitizedDocumentClassCode, sanitizedDocumentCode);
        }
        java.lang.String sanitizedDocumentNumber = mrzResult.getSanitizedDocumentNumber();
        if (sanitizedDocumentNumber != null && !sanitizedDocumentNumber.isEmpty() && !sanitizedDocumentNumber.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.SanitizedDocumentNumber, sanitizedDocumentNumber);
        }
        java.lang.String sanitizedIssuer = mrzResult.getSanitizedIssuer();
        if (sanitizedIssuer != null && !sanitizedIssuer.isEmpty() && !sanitizedIssuer.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.SanitizedIssuingStateCode, sanitizedIssuer);
        }
        java.lang.String sanitizedNationality = mrzResult.getSanitizedNationality();
        if (sanitizedNationality != null && !sanitizedNationality.isEmpty() && !sanitizedNationality.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.SanitizedNationality, sanitizedNationality);
        }
        java.lang.String sanitizedOpt1 = mrzResult.getSanitizedOpt1();
        if (sanitizedOpt1 != null && !sanitizedOpt1.isEmpty() && !sanitizedOpt1.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.SanitizedOpt1, sanitizedOpt1);
        }
        java.lang.String sanitizedOpt2 = mrzResult.getSanitizedOpt2();
        if (sanitizedOpt2 != null && !sanitizedOpt2.isEmpty() && !sanitizedOpt2.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.SanitizedOpt2, sanitizedOpt2);
        }
        java.lang.String secondaryId = mrzResult.getSecondaryId();
        if (secondaryId != null && !secondaryId.isEmpty() && !secondaryId.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.GivenNames, secondaryId);
        }
        java.lang.String valueOf = java.lang.String.valueOf(mrzResult.isMrzParsed());
        if (valueOf != null && !valueOf.isEmpty() && !valueOf.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.MrzParsed, valueOf);
        }
        java.lang.String valueOf2 = java.lang.String.valueOf(mrzResult.isMrzVerified());
        if (valueOf2 != null && !valueOf2.isEmpty() && !valueOf2.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.MrzVerified, valueOf2);
        }
        return hashMap;
    }

    public static java.util.Map<java.lang.String, java.lang.String> extractResults(com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdSingleSideRecognizer.Result result) {
        java.lang.String valueOf;
        java.lang.String str;
        if (result == null) {
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.AdditionalAddressInformation, result.getAdditionalAddressInformation());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.AdditionalNameInformation, result.getAdditionalNameInformation());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.AdditionalOptionalAddressInformation, result.getAdditionalOptionalAddressInformation());
        getHighSpeedVideoFpsRanges(hashMap, "Address", result.getAddress());
        if (result.getAge() != -1) {
            if (result.getAge() != 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(result.getAge());
                str = sb.toString();
            } else {
                str = "";
            }
            if (str != null && !str.isEmpty() && !str.equalsIgnoreCase("none")) {
                hashMap.put("Age", str);
            }
        }
        java.lang.String name2 = result.getClassInfo().getCountry().name();
        if (name2 != null && !name2.isEmpty() && !name2.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.ClassCountryName, name2);
        }
        java.lang.String name3 = result.getClassInfo().getRegion().name();
        if (name3 != null && !name3.isEmpty() && !name3.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.ClassRegionName, name3);
        }
        java.lang.String name4 = result.getClassInfo().getType().name();
        if (name4 != null && !name4.isEmpty() && !name4.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.ClassTypeName, name4);
        }
        java.lang.String dateToString = com.daon.dmds.utils.DMDSDocumentUtils.dateToString(result.getDateOfBirth());
        if (dateToString != null && !dateToString.isEmpty() && !dateToString.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.DateOfBirth, dateToString);
        }
        java.lang.String dateToString2 = com.daon.dmds.utils.DMDSDocumentUtils.dateToString(result.getDateOfExpiry());
        if (dateToString2 != null && !dateToString2.isEmpty() && !dateToString2.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.DateOfExpiry, dateToString2);
        }
        java.lang.String dateToString3 = com.daon.dmds.utils.DMDSDocumentUtils.dateToString(result.getDateOfIssue());
        if (dateToString3 != null && !dateToString3.isEmpty() && !dateToString3.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.DateOfIssue, dateToString3);
        }
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.DocumentAdditionalNumber, result.getDocumentAdditionalNumber());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.DocumentNumber, result.getDocumentNumber());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.DocumentOptionalAdditionalNumber, result.getDocumentOptionalAdditionalNumber());
        getHighResolutionOutputSizeshNQ4ISI(hashMap, result.getDriverLicenseDetailedInfo());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.Employer, result.getEmployer());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.FathersName, result.getFathersName());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.GivenNames, result.getFirstName());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.SurnameAndGivenNames, result.getFullName());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.IssuerAuthority, result.getIssuingAuthority());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.Surname, result.getLastName());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.LocalizedName, result.getLocalizedName());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.MaritalStatus, result.getMaritalStatus());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.MothersName, result.getMothersName());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.Nationality, result.getNationality());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.PersonalIdNumber, result.getPersonalIdNumber());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.PlaceOfBirth, result.getPlaceOfBirth());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.Profession, result.getProfession());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.Race, result.getRace());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.Religion, result.getReligion());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.ResidentialStatus, result.getResidentialStatus());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.Sex, result.getSex());
        if (!hashMap.isEmpty() && (valueOf = java.lang.String.valueOf(result.isDateOfExpiryPermanent())) != null && !valueOf.isEmpty() && !valueOf.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.ValidUntilPermanent, valueOf);
        }
        return hashMap;
    }

    public static java.util.Map<java.lang.String, java.lang.String> extractVisualData(com.microblink.blinkid.entities.recognizers.blinkid.generic.viz.VizResult vizResult) {
        java.lang.String valueOf;
        if (vizResult == null) {
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.AdditionalAddressInformation, vizResult.getAdditionalAddressInformation());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.AdditionalNameInformation, vizResult.getAdditionalNameInformation());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.AdditionalOptionalAddressInformation, vizResult.getAdditionalOptionalAddressInformation());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.PersonalAdditionalNumber, vizResult.getAdditionalPersonalIdNumber());
        getHighSpeedVideoFpsRanges(hashMap, "Address", vizResult.getAddress());
        java.lang.String dateToString = com.daon.dmds.utils.DMDSDocumentUtils.dateToString(vizResult.getDateOfBirth());
        if (dateToString != null && !dateToString.isEmpty() && !dateToString.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.DateOfBirth, dateToString);
        }
        java.lang.String dateToString2 = com.daon.dmds.utils.DMDSDocumentUtils.dateToString(vizResult.getDateOfExpiry());
        if (dateToString2 != null && !dateToString2.isEmpty() && !dateToString2.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.DateOfExpiry, dateToString2);
        }
        java.lang.String dateToString3 = com.daon.dmds.utils.DMDSDocumentUtils.dateToString(vizResult.getDateOfIssue());
        if (dateToString3 != null && !dateToString3.isEmpty() && !dateToString3.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.DateOfIssue, dateToString3);
        }
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.DocumentAdditionalNumber, vizResult.getDocumentAdditionalNumber());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.DocumentNumber, vizResult.getDocumentNumber());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.DocumentOptionalAdditionalNumber, vizResult.getDocumentOptionalAdditionalNumber());
        getHighResolutionOutputSizeshNQ4ISI(hashMap, vizResult.getDriverLicenseDetailedInfo());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.Employer, vizResult.getEmployer());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.FathersName, vizResult.getFathersName());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.GivenNames, vizResult.getFirstName());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.SurnameAndGivenNames, vizResult.getFullName());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.IssuerAuthority, vizResult.getIssuingAuthority());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.Surname, vizResult.getLastName());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.LocalizedName, vizResult.getLocalizedName());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.MaritalStatus, vizResult.getMaritalStatus());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.MothersName, vizResult.getMothersName());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.Nationality, vizResult.getNationality());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.PersonalNumber, vizResult.getPersonalIdNumber());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.PlaceOfBirth, vizResult.getPlaceOfBirth());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.Profession, vizResult.getProfession());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.Race, vizResult.getRace());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.Religion, vizResult.getReligion());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.ResidentialStatus, vizResult.getResidentialStatus());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.Sex, vizResult.getSex());
        if (!hashMap.isEmpty() && (valueOf = java.lang.String.valueOf(vizResult.isDateOfExpiryPermanent())) != null && !valueOf.isEmpty() && !valueOf.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.ValidUntilPermanent, valueOf);
        }
        return hashMap;
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.util.Map<java.lang.String, java.lang.String> map, com.microblink.blinkid.entities.recognizers.blinkid.generic.DriverLicenseDetailedInfo driverLicenseDetailedInfo) {
        if (driverLicenseDetailedInfo.isEmpty()) {
            return;
        }
        getHighSpeedVideoFpsRanges(map, com.daon.dmds.recognizers.IDMDSResultCreatorFields.Conditions, driverLicenseDetailedInfo.getConditions());
        getHighSpeedVideoFpsRanges(map, com.daon.dmds.recognizers.IDMDSResultCreatorFields.DlEndorsed, driverLicenseDetailedInfo.getEndorsements());
        getHighSpeedVideoFpsRanges(map, com.daon.dmds.recognizers.IDMDSResultCreatorFields.Restriction, driverLicenseDetailedInfo.getRestrictions());
        getHighSpeedVideoFpsRanges(map, com.daon.dmds.recognizers.IDMDSResultCreatorFields.DLClass, driverLicenseDetailedInfo.getVehicleClass());
        int i = 0;
        for (com.microblink.blinkid.entities.recognizers.blinkid.generic.VehicleClassInfo vehicleClassInfo : driverLicenseDetailedInfo.getVehicleClassesInfo()) {
            getHighSpeedVideoSizes(map, i == 0 ? "" : " ".concat(java.lang.String.valueOf(i)), vehicleClassInfo);
            i++;
        }
    }

    private static void getHighSpeedVideoFpsRanges(java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str, com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult stringResult) {
        java.lang.String obj;
        if (stringResult == null || (obj = stringResult.toString()) == null || obj.isEmpty() || obj.equalsIgnoreCase("none")) {
            return;
        }
        map.put(str, obj);
    }

    private static void getHighSpeedVideoSizes(java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str, com.microblink.blinkid.entities.recognizers.blinkid.generic.VehicleClassInfo vehicleClassInfo) {
        java.lang.String concat = com.daon.dmds.recognizers.IDMDSResultCreatorFields.EffectiveDate.concat(java.lang.String.valueOf(str));
        java.lang.String dateToString = com.daon.dmds.utils.DMDSDocumentUtils.dateToString(vehicleClassInfo.getEffectiveDate());
        if (dateToString != null && !dateToString.isEmpty() && !dateToString.equalsIgnoreCase("none")) {
            map.put(concat, dateToString);
        }
        java.lang.String concat2 = com.daon.dmds.recognizers.IDMDSResultCreatorFields.DateOfExpiry.concat(java.lang.String.valueOf(str));
        java.lang.String dateToString2 = com.daon.dmds.utils.DMDSDocumentUtils.dateToString(vehicleClassInfo.getExpiryDate());
        if (dateToString2 != null && !dateToString2.isEmpty() && !dateToString2.equalsIgnoreCase("none")) {
            map.put(concat2, dateToString2);
        }
        getHighSpeedVideoFpsRanges(map, com.daon.dmds.recognizers.IDMDSResultCreatorFields.LicenceType.concat(java.lang.String.valueOf(str)), vehicleClassInfo.getLicenceType());
        getHighSpeedVideoFpsRanges(map, com.daon.dmds.recognizers.IDMDSResultCreatorFields.VehicleClass.concat(java.lang.String.valueOf(str)), vehicleClassInfo.getVehicleClass());
    }

    public static java.util.Map<java.lang.String, java.lang.String> extractResults(com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer.Result result) {
        java.lang.String str;
        java.lang.String str2;
        if (result == null) {
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.AdditionalAddressInformation, result.getAdditionalAddressInformation());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.AdditionalNameInformation, result.getAdditionalNameInformation());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.AdditionalOptionalAddressInformation, result.getAdditionalOptionalAddressInformation());
        getHighSpeedVideoFpsRanges(hashMap, "Address", result.getAddress());
        if (result.getAge() != -1) {
            if (result.getAge() != 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(result.getAge());
                str2 = sb.toString();
            } else {
                str2 = "";
            }
            if (str2 != null && !str2.isEmpty() && !str2.equalsIgnoreCase("none")) {
                hashMap.put("Age", str2);
            }
        }
        java.lang.String name2 = result.getClassInfo().getCountry().name();
        if (name2 != null && !name2.isEmpty() && !name2.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.ClassCountryName, name2);
        }
        java.lang.String name3 = result.getClassInfo().getRegion().name();
        if (name3 != null && !name3.isEmpty() && !name3.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.ClassRegionName, name3);
        }
        java.lang.String name4 = result.getClassInfo().getType().name();
        if (name4 != null && !name4.isEmpty() && !name4.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.ClassTypeName, name4);
        }
        java.lang.String dateToString = com.daon.dmds.utils.DMDSDocumentUtils.dateToString(result.getDateOfBirth());
        if (dateToString != null && !dateToString.isEmpty() && !dateToString.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.DateOfBirth, dateToString);
        }
        java.lang.String dateToString2 = com.daon.dmds.utils.DMDSDocumentUtils.dateToString(result.getDateOfExpiry());
        if (dateToString2 != null && !dateToString2.isEmpty() && !dateToString2.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.DateOfExpiry, dateToString2);
        }
        java.lang.String dateToString3 = com.daon.dmds.utils.DMDSDocumentUtils.dateToString(result.getDateOfIssue());
        if (dateToString3 != null && !dateToString3.isEmpty() && !dateToString3.equalsIgnoreCase("none")) {
            hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.DateOfIssue, dateToString3);
        }
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.DocumentAdditionalNumber, result.getDocumentAdditionalNumber());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.DocumentNumber, result.getDocumentNumber());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.DocumentOptionalAdditionalNumber, result.getDocumentOptionalAdditionalNumber());
        getHighResolutionOutputSizeshNQ4ISI(hashMap, result.getDriverLicenseDetailedInfo());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.Employer, result.getEmployer());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.FathersName, result.getFathersName());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.GivenNames, result.getFirstName());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.SurnameAndGivenNames, result.getFullName());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.IssuerAuthority, result.getIssuingAuthority());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.Surname, result.getLastName());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.LocalizedName, result.getLocalizedName());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.MaritalStatus, result.getMaritalStatus());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.MothersName, result.getMothersName());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.Nationality, result.getNationality());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.PersonalIdNumber, result.getPersonalIdNumber());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.PlaceOfBirth, result.getPlaceOfBirth());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.Profession, result.getProfession());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.Race, result.getRace());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.Religion, result.getReligion());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.ResidentialStatus, result.getResidentialStatus());
        getHighSpeedVideoFpsRanges(hashMap, com.daon.dmds.recognizers.IDMDSResultCreatorFields.Sex, result.getSex());
        if (!hashMap.isEmpty()) {
            java.lang.String valueOf = java.lang.String.valueOf(result.isDateOfExpiryPermanent());
            if (valueOf != null && !valueOf.isEmpty() && !valueOf.equalsIgnoreCase("none")) {
                hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.ValidUntilPermanent, valueOf);
            }
            int i = com.daon.dmds.utils.BlinkIdExtractor.AnonymousClass1.Camera2StreamConfigurationMap[result.getDataMatch().getStateForWholeDocument().ordinal()];
            if (i == 1) {
                str = com.daon.dmds.recognizers.IDMDSResultCreatorFields.DataMatchSuccess;
            } else if (i != 2) {
                str = com.daon.dmds.recognizers.IDMDSResultCreatorFields.DataMatchNotPerformed;
            } else {
                str = com.daon.dmds.recognizers.IDMDSResultCreatorFields.DataMatchFailed;
            }
            if (!str.isEmpty() && !str.equalsIgnoreCase("none")) {
                hashMap.put(com.daon.dmds.recognizers.IDMDSResultCreatorFields.DocumentDataMatch, str);
            }
        }
        return hashMap;
    }
}
