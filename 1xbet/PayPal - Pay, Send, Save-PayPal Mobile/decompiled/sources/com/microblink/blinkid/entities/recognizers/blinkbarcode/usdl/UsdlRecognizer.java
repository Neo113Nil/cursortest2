package com.microblink.blinkid.entities.recognizers.blinkbarcode.usdl;

@java.lang.Deprecated
/* loaded from: classes9.dex */
public final class UsdlRecognizer extends com.microblink.blinkid.entities.recognizers.Recognizer<com.microblink.blinkid.entities.recognizers.blinkbarcode.usdl.UsdlRecognizer.Result> {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkbarcode.usdl.UsdlRecognizer> CREATOR;

    public static final class Result extends com.microblink.blinkid.entities.recognizers.Recognizer.Result {
        public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkbarcode.usdl.UsdlRecognizer.Result> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkbarcode.usdl.UsdlRecognizer.Result>() { // from class: com.microblink.blinkid.entities.recognizers.blinkbarcode.usdl.UsdlRecognizer.Result.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkbarcode.usdl.UsdlRecognizer.Result createFromParcel(android.os.Parcel parcel) {
                com.microblink.blinkid.entities.recognizers.blinkbarcode.usdl.UsdlRecognizer.Result result = new com.microblink.blinkid.entities.recognizers.blinkbarcode.usdl.UsdlRecognizer.Result(com.microblink.blinkid.entities.recognizers.blinkbarcode.usdl.UsdlRecognizer.Result.nativeConstruct());
                result.llIIlIlIIl(parcel);
                return result;
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkbarcode.usdl.UsdlRecognizer.Result[] newArray(int i) {
                return new com.microblink.blinkid.entities.recognizers.blinkbarcode.usdl.UsdlRecognizer.Result[i];
            }
        };

        protected Result(long j) {
            super(j);
        }

        private static native java.lang.String addressNativeGet(long j);

        private static native java.lang.String cityNativeGet(long j);

        private static native boolean dataIsUncertainNativeGet(long j);

        private static native com.microblink.blinkid.results.date.Date dateOfBirthNativeGet(long j);

        private static native com.microblink.blinkid.results.date.Date dateOfExpiryNativeGet(long j);

        private static native com.microblink.blinkid.results.date.Date dateOfIssueNativeGet(long j);

        private static native java.lang.String documentNumberNativeGet(long j);

        private static native byte[][] dynamicElementsNativeGet(long j);

        private static native byte[] elementNativeGet(long j, int i);

        private static native java.lang.String endorsementsNativeGet(long j);

        private static native java.lang.String firstNameNativeGet(long j);

        private static native java.lang.String fullNameNativeGet(long j);

        private static native java.lang.String jurisdictionNativeGet(long j);

        private static native java.lang.String lastNameNativeGet(long j);

        private static native java.lang.String middleNameNativeGet(long j);

        private static native java.lang.String nameSuffixNativeGet(long j);

        /* JADX INFO: Access modifiers changed from: private */
        public static native long nativeConstruct();

        private static native long nativeCopy(long j);

        private static native void nativeDeserialize(long j, byte[] bArr);

        private static native void nativeDestruct(long j);

        private static native byte[] nativeSerialize(long j);

        private static native java.lang.String pdf417NativeGet(long j);

        private static native java.lang.String postalCodeNativeGet(long j);

        private static native byte[] rawBytesNativeGet(long j);

        private static native java.lang.String restrictionsNativeGet(long j);

        private static native java.lang.String sexNativeGet(long j);

        private static native java.lang.String streetNativeGet(long j);

        private static native java.lang.String vehicleClassNativeGet(long j);

        @Override // com.microblink.blinkid.entities.Entity.Result
        public final byte[] IlIllIlIIl() {
            return nativeSerialize(getNativeContext());
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

        public final java.lang.String getDocumentNumber() {
            return documentNumberNativeGet(getNativeContext());
        }

        public final java.lang.String getEndorsements() {
            return endorsementsNativeGet(getNativeContext());
        }

        public final java.lang.String getField(com.microblink.blinkid.entities.recognizers.blinkbarcode.usdl.UsdlKeys usdlKeys) {
            return com.microblink.blinkid.util.StringUtils.convertByteArrayToString(elementNativeGet(getNativeContext(), usdlKeys.ordinal()));
        }

        public final java.lang.String getFirstName() {
            return firstNameNativeGet(getNativeContext());
        }

        public final java.lang.String getFullName() {
            return fullNameNativeGet(getNativeContext());
        }

        public final java.lang.String getJurisdiction() {
            return jurisdictionNativeGet(getNativeContext());
        }

        public final java.lang.String getLastName() {
            return lastNameNativeGet(getNativeContext());
        }

        public final java.lang.String getMiddleName() {
            return middleNameNativeGet(getNativeContext());
        }

        public final java.lang.String getNameSuffix() {
            return nameSuffixNativeGet(getNativeContext());
        }

        @java.lang.Deprecated
        public final java.lang.String[] getOptionalElements() {
            byte[][] dynamicElementsNativeGet = dynamicElementsNativeGet(getNativeContext());
            java.lang.String[] strArr = new java.lang.String[dynamicElementsNativeGet.length];
            for (int i = 0; i < dynamicElementsNativeGet.length; i++) {
                strArr[i] = com.microblink.blinkid.util.StringUtils.convertByteArrayToString(dynamicElementsNativeGet[i]);
            }
            return strArr;
        }

        public final java.lang.String getPostalCode() {
            return postalCodeNativeGet(getNativeContext());
        }

        public final byte[] getRawData() {
            return rawBytesNativeGet(getNativeContext());
        }

        public final java.lang.String getRawStringData() {
            return pdf417NativeGet(getNativeContext());
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

        public final java.lang.String getVehicleClass() {
            return vehicleClassNativeGet(getNativeContext());
        }

        public final boolean isUncertain() {
            return dataIsUncertainNativeGet(getNativeContext());
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("US Driver's License\n\n");
            sb.append(getRawStringData());
            return sb.toString();
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
        public final com.microblink.blinkid.entities.recognizers.blinkbarcode.usdl.UsdlRecognizer.Result mo10870clone() {
            return new com.microblink.blinkid.entities.recognizers.blinkbarcode.usdl.UsdlRecognizer.Result(nativeCopy(getNativeContext()));
        }
    }

    static {
        com.microblink.blinkid.secured.lIIllllIIl.llIIlIlIIl();
        CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkbarcode.usdl.UsdlRecognizer>() { // from class: com.microblink.blinkid.entities.recognizers.blinkbarcode.usdl.UsdlRecognizer.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkbarcode.usdl.UsdlRecognizer createFromParcel(android.os.Parcel parcel) {
                return new com.microblink.blinkid.entities.recognizers.blinkbarcode.usdl.UsdlRecognizer(parcel, com.microblink.blinkid.entities.recognizers.blinkbarcode.usdl.UsdlRecognizer.nativeConstruct());
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkbarcode.usdl.UsdlRecognizer[] newArray(int i) {
                return new com.microblink.blinkid.entities.recognizers.blinkbarcode.usdl.UsdlRecognizer[i];
            }
        };
    }

    /* synthetic */ UsdlRecognizer(android.os.Parcel parcel, long j) {
        this(j, parcel);
    }

    private static native boolean enableCompactParserNativeGet(long j);

    private static native void enableCompactParserNativeSet(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nativeConstruct();

    private static native void nativeConsumeResult(long j, long j2);

    private static native long nativeCopy(long j);

    private static native void nativeDeserialize(long j, byte[] bArr);

    private static native void nativeDestruct(long j);

    private static native byte[] nativeSerialize(long j);

    private static native boolean nullQuietZoneAllowedNativeGet(long j);

    private static native void nullQuietZoneAllowedNativeSet(long j, boolean z);

    private static native boolean uncertainDecodingNativeGet(long j);

    private static native void uncertainDecodingNativeSet(long j, boolean z);

    @Override // com.microblink.blinkid.entities.Entity
    public final void consumeResultFrom(com.microblink.blinkid.entities.Entity entity) {
        if (this != entity) {
            if (!(entity instanceof com.microblink.blinkid.entities.recognizers.blinkbarcode.usdl.UsdlRecognizer)) {
                throw new java.lang.IllegalArgumentException("Parameter type has to be UsdlRecognizer");
            }
            nativeConsumeResult(getNativeContext(), entity.getResult().getNativeContext());
        }
    }

    public final boolean isEnableCompactParser() {
        return enableCompactParserNativeGet(getNativeContext());
    }

    public final boolean isNullQuietZoneAllowed() {
        return nullQuietZoneAllowedNativeGet(getNativeContext());
    }

    public final boolean isUncertainDecoding() {
        return uncertainDecodingNativeGet(getNativeContext());
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final void llIIlIlIIl(long j) {
        nativeDestruct(j);
    }

    public final void setEnableCompactParser(boolean z) {
        enableCompactParserNativeSet(getNativeContext(), z);
    }

    public final void setNullQuietZoneAllowed(boolean z) {
        nullQuietZoneAllowedNativeSet(getNativeContext(), z);
    }

    public final void setUncertainDecoding(boolean z) {
        uncertainDecodingNativeSet(getNativeContext(), z);
    }

    public UsdlRecognizer() {
        this(nativeConstruct());
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final byte[] llIIlIlIIl() {
        return nativeSerialize(getNativeContext());
    }

    private UsdlRecognizer(long j) {
        super(j, new com.microblink.blinkid.entities.recognizers.blinkbarcode.usdl.UsdlRecognizer.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)));
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final void llIIlIlIIl(byte[] bArr) {
        nativeDeserialize(getNativeContext(), bArr);
    }

    private UsdlRecognizer(long j, android.os.Parcel parcel) {
        super(j, new com.microblink.blinkid.entities.recognizers.blinkbarcode.usdl.UsdlRecognizer.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)), parcel);
    }

    @Override // com.microblink.blinkid.entities.recognizers.Recognizer, com.microblink.blinkid.entities.Entity
    /* renamed from: clone */
    public final com.microblink.blinkid.entities.recognizers.blinkbarcode.usdl.UsdlRecognizer mo10869clone() {
        return new com.microblink.blinkid.entities.recognizers.blinkbarcode.usdl.UsdlRecognizer(nativeCopy(getNativeContext()));
    }
}
