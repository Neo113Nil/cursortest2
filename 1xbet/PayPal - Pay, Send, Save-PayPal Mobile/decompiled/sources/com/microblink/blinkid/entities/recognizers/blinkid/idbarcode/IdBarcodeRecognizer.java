package com.microblink.blinkid.entities.recognizers.blinkid.idbarcode;

@java.lang.Deprecated
/* loaded from: classes10.dex */
public final class IdBarcodeRecognizer extends com.microblink.blinkid.entities.recognizers.Recognizer<com.microblink.blinkid.entities.recognizers.blinkid.idbarcode.IdBarcodeRecognizer.Result> {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.idbarcode.IdBarcodeRecognizer> CREATOR;

    public static final class Result extends com.microblink.blinkid.entities.recognizers.Recognizer.Result {
        public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.idbarcode.IdBarcodeRecognizer.Result> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.idbarcode.IdBarcodeRecognizer.Result>() { // from class: com.microblink.blinkid.entities.recognizers.blinkid.idbarcode.IdBarcodeRecognizer.Result.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.idbarcode.IdBarcodeRecognizer.Result createFromParcel(android.os.Parcel parcel) {
                com.microblink.blinkid.entities.recognizers.blinkid.idbarcode.IdBarcodeRecognizer.Result result = new com.microblink.blinkid.entities.recognizers.blinkid.idbarcode.IdBarcodeRecognizer.Result(com.microblink.blinkid.entities.recognizers.blinkid.idbarcode.IdBarcodeRecognizer.Result.nativeConstruct());
                result.llIIlIlIIl(parcel);
                return result;
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.idbarcode.IdBarcodeRecognizer.Result[] newArray(int i) {
                return new com.microblink.blinkid.entities.recognizers.blinkid.idbarcode.IdBarcodeRecognizer.Result[i];
            }
        };

        protected Result(long j) {
            super(j);
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

        private static native int documentTypeNativeGet(long j);

        private static native java.lang.String employerNativeGet(long j);

        private static native java.lang.String endorsementsNativeGet(long j);

        private static native long extendedElementsNativeGet(long j);

        private static native java.lang.String firstNameNativeGet(long j);

        private static native java.lang.String fullNameNativeGet(long j);

        private static native java.lang.String issuingAuthorityNativeGet(long j);

        private static native java.lang.String jurisdictionNativeGet(long j);

        private static native java.lang.String lastNameNativeGet(long j);

        private static native java.lang.String maritalStatusNativeGet(long j);

        private static native java.lang.String middleNameNativeGet(long j);

        private static native java.lang.String nationalityNativeGet(long j);

        /* JADX INFO: Access modifiers changed from: private */
        public static native long nativeConstruct();

        private static native long nativeCopy(long j);

        private static native void nativeDeserialize(long j, byte[] bArr);

        private static native void nativeDestruct(long j);

        private static native byte[] nativeSerialize(long j);

        private static native java.lang.String personalIdNumberNativeGet(long j);

        private static native java.lang.String placeOfBirthNativeGet(long j);

        private static native java.lang.String postalCodeNativeGet(long j);

        private static native java.lang.String professionNativeGet(long j);

        private static native java.lang.String raceNativeGet(long j);

        private static native byte[] rawBytesNativeGet(long j);

        private static native java.lang.String religionNativeGet(long j);

        private static native java.lang.String residentialStatusNativeGet(long j);

        private static native java.lang.String restrictionsNativeGet(long j);

        private static native java.lang.String sexNativeGet(long j);

        private static native java.lang.String streetNativeGet(long j);

        private static native java.lang.String stringDataNativeGet(long j);

        private static native boolean uncertainNativeGet(long j);

        private static native java.lang.String vehicleClassNativeGet(long j);

        @Override // com.microblink.blinkid.entities.Entity.Result
        public final byte[] IlIllIlIIl() {
            return nativeSerialize(getNativeContext());
        }

        public final java.lang.String getAdditionalNameInformation() {
            return additionalNameInformationNativeGet(getNativeContext());
        }

        public final java.lang.String getAddress() {
            return addressNativeGet(getNativeContext());
        }

        public final int getAge() {
            com.microblink.blinkid.results.date.Date dateOfBirth = getDateOfBirth();
            if (dateOfBirth == null || dateOfBirth.getDate() == null) {
                return -1;
            }
            return com.microblink.blinkid.results.date.DateUtils.yearsPassedFrom(dateOfBirth.getDate());
        }

        public final com.microblink.blinkid.entities.recognizers.blinkid.AgeLimitStatus getAgeLimitStatus(int i) {
            int age = getAge();
            return age == -1 ? com.microblink.blinkid.entities.recognizers.blinkid.AgeLimitStatus.NotAvailable : age >= i ? com.microblink.blinkid.entities.recognizers.blinkid.AgeLimitStatus.OverAgeLimit : com.microblink.blinkid.entities.recognizers.blinkid.AgeLimitStatus.BelowAgeLimit;
        }

        public final com.microblink.blinkid.entities.recognizers.blinkbarcode.BarcodeType getBarcodeType() {
            return com.microblink.blinkid.entities.recognizers.blinkbarcode.BarcodeType.values()[barcodeTypeNativeGet(getNativeContext())];
        }

        public final java.lang.String getCity() {
            return cityNativeGet(getNativeContext());
        }

        public final com.microblink.blinkid.results.date.Date getDateOfBirth() {
            return dateOfBirthNativeGet(getNativeContext());
        }

        public final com.microblink.blinkid.results.date.Date getDateOfExpiry() {
            return dateOfExpiryNativeGet(getNativeContext());
        }

        public final com.microblink.blinkid.results.date.Date getDateOfIssue() {
            return dateOfIssueNativeGet(getNativeContext());
        }

        public final java.lang.String getDocumentAdditionalNumber() {
            return documentAdditionalNumberNativeGet(getNativeContext());
        }

        public final java.lang.String getDocumentNumber() {
            return documentNumberNativeGet(getNativeContext());
        }

        public final com.microblink.blinkid.entities.recognizers.blinkid.idbarcode.IdBarcodeDocumentType getDocumentType() {
            return com.microblink.blinkid.entities.recognizers.blinkid.idbarcode.IdBarcodeDocumentType.values()[documentTypeNativeGet(getNativeContext())];
        }

        public final java.lang.String getEmployer() {
            return employerNativeGet(getNativeContext());
        }

        public final java.lang.String getEndorsements() {
            return endorsementsNativeGet(getNativeContext());
        }

        public final com.microblink.blinkid.entities.recognizers.blinkid.idbarcode.BarcodeElements getExtendedElements() {
            long extendedElementsNativeGet = extendedElementsNativeGet(getNativeContext());
            if (extendedElementsNativeGet != 0) {
                return new com.microblink.blinkid.entities.recognizers.blinkid.idbarcode.BarcodeElements(extendedElementsNativeGet, this);
            }
            throw new java.lang.RuntimeException("Invalid native context for extendedElements");
        }

        public final java.lang.String getFirstName() {
            return firstNameNativeGet(getNativeContext());
        }

        public final java.lang.String getFullName() {
            return fullNameNativeGet(getNativeContext());
        }

        public final java.lang.String getIssuingAuthority() {
            return issuingAuthorityNativeGet(getNativeContext());
        }

        public final java.lang.String getJurisdiction() {
            return jurisdictionNativeGet(getNativeContext());
        }

        public final java.lang.String getLastName() {
            return lastNameNativeGet(getNativeContext());
        }

        public final java.lang.String getMaritalStatus() {
            return maritalStatusNativeGet(getNativeContext());
        }

        public final java.lang.String getMiddleName() {
            return middleNameNativeGet(getNativeContext());
        }

        public final java.lang.String getNationality() {
            return nationalityNativeGet(getNativeContext());
        }

        public final java.lang.String getPersonalIdNumber() {
            return personalIdNumberNativeGet(getNativeContext());
        }

        public final java.lang.String getPlaceOfBirth() {
            return placeOfBirthNativeGet(getNativeContext());
        }

        public final java.lang.String getPostalCode() {
            return postalCodeNativeGet(getNativeContext());
        }

        public final java.lang.String getProfession() {
            return professionNativeGet(getNativeContext());
        }

        public final java.lang.String getRace() {
            return raceNativeGet(getNativeContext());
        }

        public final byte[] getRawData() {
            return rawBytesNativeGet(getNativeContext());
        }

        public final java.lang.String getReligion() {
            return religionNativeGet(getNativeContext());
        }

        public final java.lang.String getResidentialStatus() {
            return residentialStatusNativeGet(getNativeContext());
        }

        public final java.lang.String getRestrictions() {
            return restrictionsNativeGet(getNativeContext());
        }

        public final java.lang.String getSex() {
            return sexNativeGet(getNativeContext());
        }

        public final java.lang.String getStreet() {
            return streetNativeGet(getNativeContext());
        }

        public final java.lang.String getStringData() {
            return stringDataNativeGet(getNativeContext());
        }

        public final java.lang.String getVehicleClass() {
            return vehicleClassNativeGet(getNativeContext());
        }

        public final boolean isExpired() {
            com.microblink.blinkid.results.date.SimpleDate date = getDateOfExpiry().getDate();
            if (date == null) {
                return false;
            }
            return com.microblink.blinkid.results.date.DateUtils.isDatePassed(date);
        }

        public final boolean isUncertain() {
            return uncertainNativeGet(getNativeContext());
        }

        public final java.lang.String toString() {
            return "ID Barcode Recognizer";
        }

        @Override // com.microblink.blinkid.entities.Entity.Result
        public final void llIIlIlIIl(byte[] bArr) {
            nativeDeserialize(getNativeContext(), bArr);
        }

        @Override // com.microblink.blinkid.entities.Entity.Result
        public final void llIIlIlIIl(long j) {
            nativeDestruct(j);
        }

        @Override // com.microblink.blinkid.entities.recognizers.Recognizer.Result, com.microblink.blinkid.entities.Entity.Result
        /* renamed from: clone */
        public final com.microblink.blinkid.entities.recognizers.blinkid.idbarcode.IdBarcodeRecognizer.Result mo10870clone() {
            return new com.microblink.blinkid.entities.recognizers.blinkid.idbarcode.IdBarcodeRecognizer.Result(nativeCopy(getNativeContext()));
        }
    }

    static {
        com.microblink.blinkid.secured.lIIllllIIl.llIIlIlIIl();
        CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.idbarcode.IdBarcodeRecognizer>() { // from class: com.microblink.blinkid.entities.recognizers.blinkid.idbarcode.IdBarcodeRecognizer.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.idbarcode.IdBarcodeRecognizer createFromParcel(android.os.Parcel parcel) {
                return new com.microblink.blinkid.entities.recognizers.blinkid.idbarcode.IdBarcodeRecognizer(parcel, com.microblink.blinkid.entities.recognizers.blinkid.idbarcode.IdBarcodeRecognizer.nativeConstruct());
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.idbarcode.IdBarcodeRecognizer[] newArray(int i) {
                return new com.microblink.blinkid.entities.recognizers.blinkid.idbarcode.IdBarcodeRecognizer[i];
            }
        };
    }

    /* synthetic */ IdBarcodeRecognizer(android.os.Parcel parcel, long j) {
        this(j, parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nativeConstruct();

    private static native void nativeConsumeResult(long j, long j2);

    private static native void nativeDestruct(long j);

    @Override // com.microblink.blinkid.entities.Entity
    public final void consumeResultFrom(com.microblink.blinkid.entities.Entity entity) {
        if (this != entity) {
            if (!(entity instanceof com.microblink.blinkid.entities.recognizers.blinkid.idbarcode.IdBarcodeRecognizer)) {
                throw new java.lang.IllegalArgumentException("Parameter type has to be IdBarcodeRecognizer");
            }
            nativeConsumeResult(getNativeContext(), entity.getResult().getNativeContext());
        }
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final void llIIlIlIIl(byte[] bArr) {
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final byte[] llIIlIlIIl() {
        return null;
    }

    public IdBarcodeRecognizer() {
        this(nativeConstruct());
    }

    private IdBarcodeRecognizer(long j) {
        super(j, new com.microblink.blinkid.entities.recognizers.blinkid.idbarcode.IdBarcodeRecognizer.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)));
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final void llIIlIlIIl(long j) {
        nativeDestruct(j);
    }

    private IdBarcodeRecognizer(long j, android.os.Parcel parcel) {
        super(j, new com.microblink.blinkid.entities.recognizers.blinkid.idbarcode.IdBarcodeRecognizer.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)), parcel);
    }

    @Override // com.microblink.blinkid.entities.recognizers.Recognizer, com.microblink.blinkid.entities.Entity
    /* renamed from: clone */
    public final com.microblink.blinkid.entities.recognizers.blinkid.idbarcode.IdBarcodeRecognizer mo10869clone() {
        return new com.microblink.blinkid.entities.recognizers.blinkid.idbarcode.IdBarcodeRecognizer(nativeConstruct());
    }
}
