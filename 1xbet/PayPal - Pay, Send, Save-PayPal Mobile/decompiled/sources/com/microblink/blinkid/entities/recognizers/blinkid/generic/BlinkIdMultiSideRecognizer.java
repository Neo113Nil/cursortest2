package com.microblink.blinkid.entities.recognizers.blinkid.generic;

/* loaded from: classes10.dex */
public final class BlinkIdMultiSideRecognizer extends com.microblink.blinkid.entities.recognizers.Recognizer<com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer.Result> implements com.microblink.blinkid.entities.recognizers.blinkid.CombinedRecognizer, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.FaceImageOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.dpi.FaceImageDpiOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.encode.EncodeFaceImageOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.FullDocumentImageOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.dpi.FullDocumentImageDpiOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.extension.FullDocumentImageExtensionOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.encode.EncodeFullDocumentImagesOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.SignatureImageOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.dpi.SignatureImageDpiOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.encode.EncodeSignatureImageOptions, com.microblink.blinkid.entities.recognizers.classifier.ClassifierCallbackOptions, com.microblink.blinkid.entities.recognizers.blinkid.generic.BarcodeScanningStartedCallbackOptions {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer> CREATOR;
    private com.microblink.blinkid.entities.recognizers.blinkid.generic.NativeBarcodeScanningStartedCallbackCallback Camera2StreamConfigurationMap;
    private com.microblink.blinkid.entities.recognizers.blinkid.generic.NativeDewarpedImageCallback getHighResolutionOutputSizeshNQ4ISI;
    private com.microblink.blinkid.entities.recognizers.blinkid.generic.NativeClassFilter getHighSpeedVideoFpsRangesFor;
    private com.microblink.blinkid.entities.recognizers.blinkid.generic.NativeClassifierCallback getHighSpeedVideoSizes;

    public static final class Result extends com.microblink.blinkid.entities.recognizers.Recognizer.Result implements com.microblink.blinkid.entities.recognizers.blinkid.CombinedResult, com.microblink.blinkid.entities.recognizers.blinkid.imageresult.FaceImageResult, com.microblink.blinkid.entities.recognizers.blinkid.imageresult.EncodedFaceImageResult, com.microblink.blinkid.entities.recognizers.blinkid.imageresult.CombinedFullDocumentImageResult, com.microblink.blinkid.entities.recognizers.blinkid.imageresult.EncodedCombinedFullDocumentImageResult, com.microblink.blinkid.entities.recognizers.blinkid.imageresult.SignatureImageResult, com.microblink.blinkid.entities.recognizers.blinkid.imageresult.EncodedSignatureImageResult, com.microblink.blinkid.entities.recognizers.blinkid.ProcessingStatusResult, com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.ClassInfoResult {
        public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer.Result> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer.Result>() { // from class: com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer.Result.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer.Result createFromParcel(android.os.Parcel parcel) {
                com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer.Result result = new com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer.Result(com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer.Result.nativeConstruct());
                result.llIIlIlIIl(parcel);
                return result;
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer.Result[] newArray(int i) {
                return new com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer.Result[i];
            }
        };

        protected Result(long j) {
            super(j);
        }

        private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult additionalAddressInformationNativeGet(long j);

        private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult additionalNameInformationNativeGet(long j);

        private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult additionalOptionalAddressInformationNativeGet(long j);

        private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult addressNativeGet(long j);

        private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.AdditionalProcessingInfo backAdditionalProcessingInfoNativeGet(long j);

        private static native long backCameraFrameNativeGet(long j);

        private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.ImageAnalysisResult backImageAnalysisResultNativeGet(long j);

        private static native int backProcessingStatusNativeGet(long j);

        private static native long backVizResultNativeGet(long j);

        private static native long barcodeCameraFrameNativeGet(long j);

        private static native long barcodeResultNativeGet(long j);

        private static native boolean barcodeStepUsedNativeGet(long j);

        private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult bloodTypeNativeGet(long j);

        private static native long classInfoNativeGet(long j);

        private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.datamatch.DataMatchResult dataMatchNativeGet(long j);

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

        private static native byte[] encodedBackFullDocumentImageNativeGet(long j);

        private static native byte[] encodedFaceImageNativeGet(long j);

        private static native byte[] encodedFrontFullDocumentImageNativeGet(long j);

        private static native byte[] encodedSignatureImageNativeGet(long j);

        private static native com.microblink.blinkid.geometry.Rectangle faceImageLocationNativeGet(long j);

        private static native long faceImageNativeGet(long j);

        private static native int faceImageSideNativeGet(long j);

        private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult fathersNameNativeGet(long j);

        private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult firstNameNativeGet(long j);

        private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.AdditionalProcessingInfo frontAdditionalProcessingInfoNativeGet(long j);

        private static native long frontCameraFrameNativeGet(long j);

        private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.ImageAnalysisResult frontImageAnalysisResultNativeGet(long j);

        private static native int frontProcessingStatusNativeGet(long j);

        private static native long frontVizResultNativeGet(long j);

        private static native long fullDocumentBackImageNativeGet(long j);

        private static native long fullDocumentFrontImageNativeGet(long j);

        private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult fullNameNativeGet(long j);

        private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult issuingAuthorityNativeGet(long j);

        private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult lastNameNativeGet(long j);

        private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult localizedNameNativeGet(long j);

        private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult manufacturingYearNativeGet(long j);

        private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult maritalStatusNativeGet(long j);

        private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult mothersNameNativeGet(long j);

        private static native long mrzResultNativeGet(long j);

        private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult nationalityNativeGet(long j);

        /* JADX INFO: Access modifiers changed from: private */
        public static native long nativeConstruct();

        private static native long nativeCopy(long j);

        private static native void nativeDeserialize(long j, byte[] bArr);

        private static native void nativeDestruct(long j);

        private static native byte[] nativeSerialize(long j);

        private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult personalIdNumberNativeGet(long j);

        private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult placeOfBirthNativeGet(long j);

        private static native int processingStatusNativeGet(long j);

        private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult professionNativeGet(long j);

        private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult raceNativeGet(long j);

        private static native int recognitionModeNativeGet(long j);

        private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult religionNativeGet(long j);

        private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult remarksNativeGet(long j);

        private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult residencePermitTypeNativeGet(long j);

        private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult residentialStatusNativeGet(long j);

        private static native boolean scanningFirstSideDoneNativeGet(long j);

        private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult sexNativeGet(long j);

        private static native long signatureImageNativeGet(long j);

        private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult specificDocumentValidityNativeGet(long j);

        private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult sponsorNativeGet(long j);

        private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult vehicleOwnerNativeGet(long j);

        private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult vehicleTypeNativeGet(long j);

        private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult visaTypeNativeGet(long j);

        @Override // com.microblink.blinkid.entities.Entity.Result
        public final byte[] IlIllIlIIl() {
            return nativeSerialize(getNativeContext());
        }

        public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getAdditionalAddressInformation() {
            return additionalAddressInformationNativeGet(getNativeContext());
        }

        public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getAdditionalNameInformation() {
            return additionalNameInformationNativeGet(getNativeContext());
        }

        public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getAdditionalOptionalAddressInformation() {
            return additionalOptionalAddressInformationNativeGet(getNativeContext());
        }

        public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getAddress() {
            return addressNativeGet(getNativeContext());
        }

        public final int getAge() {
            com.microblink.blinkid.entities.recognizers.blinkid.generic.DateResult dateOfBirth = getDateOfBirth();
            if (dateOfBirth == null || dateOfBirth.getDate() == null) {
                return -1;
            }
            return com.microblink.blinkid.results.date.DateUtils.yearsPassedFrom(dateOfBirth.getDate());
        }

        public final com.microblink.blinkid.entities.recognizers.blinkid.AgeLimitStatus getAgeLimitStatus(int i) {
            int age = getAge();
            return age == -1 ? com.microblink.blinkid.entities.recognizers.blinkid.AgeLimitStatus.NotAvailable : age >= i ? com.microblink.blinkid.entities.recognizers.blinkid.AgeLimitStatus.OverAgeLimit : com.microblink.blinkid.entities.recognizers.blinkid.AgeLimitStatus.BelowAgeLimit;
        }

        public final com.microblink.blinkid.entities.recognizers.blinkid.generic.AdditionalProcessingInfo getBackAdditionalProcessingInfo() {
            return backAdditionalProcessingInfoNativeGet(getNativeContext());
        }

        public final com.microblink.blinkid.image.Image getBackCameraFrame() {
            long backCameraFrameNativeGet = backCameraFrameNativeGet(getNativeContext());
            if (backCameraFrameNativeGet != 0) {
                return com.microblink.blinkid.image.ImageBuilder.buildImageFromNativeContext(backCameraFrameNativeGet, true, this);
            }
            return null;
        }

        public final com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.ImageAnalysisResult getBackImageAnalysisResult() {
            return backImageAnalysisResultNativeGet(getNativeContext());
        }

        public final com.microblink.blinkid.entities.recognizers.blinkid.generic.ProcessingStatus getBackProcessingStatus() {
            return com.microblink.blinkid.entities.recognizers.blinkid.generic.ProcessingStatus.values()[backProcessingStatusNativeGet(getNativeContext())];
        }

        public final com.microblink.blinkid.entities.recognizers.blinkid.generic.viz.VizResult getBackVizResult() {
            long backVizResultNativeGet = backVizResultNativeGet(getNativeContext());
            if (backVizResultNativeGet != 0) {
                return new com.microblink.blinkid.entities.recognizers.blinkid.generic.viz.VizResult(backVizResultNativeGet, this);
            }
            throw new java.lang.RuntimeException("Invalid native context for backVizResult");
        }

        public final com.microblink.blinkid.image.Image getBarcodeCameraFrame() {
            long barcodeCameraFrameNativeGet = barcodeCameraFrameNativeGet(getNativeContext());
            if (barcodeCameraFrameNativeGet != 0) {
                return com.microblink.blinkid.image.ImageBuilder.buildImageFromNativeContext(barcodeCameraFrameNativeGet, true, this);
            }
            return null;
        }

        public final com.microblink.blinkid.entities.recognizers.blinkid.generic.barcode.BarcodeResult getBarcodeResult() {
            long barcodeResultNativeGet = barcodeResultNativeGet(getNativeContext());
            if (barcodeResultNativeGet != 0) {
                return new com.microblink.blinkid.entities.recognizers.blinkid.generic.barcode.BarcodeResult(barcodeResultNativeGet, this);
            }
            throw new java.lang.RuntimeException("Invalid native context for barcodeResult");
        }

        public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getBloodType() {
            return bloodTypeNativeGet(getNativeContext());
        }

        @Override // com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.ClassInfoResult
        public final com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.ClassInfo getClassInfo() {
            long classInfoNativeGet = classInfoNativeGet(getNativeContext());
            if (classInfoNativeGet != 0) {
                return new com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.ClassInfo(classInfoNativeGet, this);
            }
            throw new java.lang.RuntimeException("Invalid native context for classInfo");
        }

        public final com.microblink.blinkid.entities.recognizers.blinkid.generic.datamatch.DataMatchResult getDataMatch() {
            return dataMatchNativeGet(getNativeContext());
        }

        public final com.microblink.blinkid.entities.recognizers.blinkid.generic.DateResult getDateOfBirth() {
            return dateOfBirthNativeGet(getNativeContext());
        }

        public final com.microblink.blinkid.entities.recognizers.blinkid.generic.DateResult getDateOfExpiry() {
            return dateOfExpiryNativeGet(getNativeContext());
        }

        public final com.microblink.blinkid.entities.recognizers.blinkid.generic.DateResult getDateOfIssue() {
            return dateOfIssueNativeGet(getNativeContext());
        }

        public final com.microblink.blinkid.entities.recognizers.blinkid.generic.DependentInfo[] getDependentsInfo() {
            return dependentsInfoNativeGet(getNativeContext());
        }

        public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getDocumentAdditionalNumber() {
            return documentAdditionalNumberNativeGet(getNativeContext());
        }

        public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getDocumentNumber() {
            return documentNumberNativeGet(getNativeContext());
        }

        public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getDocumentOptionalAdditionalNumber() {
            return documentOptionalAdditionalNumberNativeGet(getNativeContext());
        }

        public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getDocumentSubtype() {
            return documentSubtypeNativeGet(getNativeContext());
        }

        public final com.microblink.blinkid.entities.recognizers.blinkid.generic.DriverLicenseDetailedInfo getDriverLicenseDetailedInfo() {
            return driverLicenseDetailedInfoNativeGet(getNativeContext());
        }

        public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getEligibilityCategory() {
            return eligibilityCategoryNativeGet(getNativeContext());
        }

        public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getEmployer() {
            return employerNativeGet(getNativeContext());
        }

        @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageresult.EncodedCombinedFullDocumentImageResult
        public final byte[] getEncodedBackFullDocumentImage() {
            return encodedBackFullDocumentImageNativeGet(getNativeContext());
        }

        @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageresult.EncodedFaceImageResult
        public final byte[] getEncodedFaceImage() {
            return encodedFaceImageNativeGet(getNativeContext());
        }

        @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageresult.EncodedCombinedFullDocumentImageResult
        public final byte[] getEncodedFrontFullDocumentImage() {
            return encodedFrontFullDocumentImageNativeGet(getNativeContext());
        }

        @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageresult.EncodedSignatureImageResult
        public final byte[] getEncodedSignatureImage() {
            return encodedSignatureImageNativeGet(getNativeContext());
        }

        @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageresult.FaceImageResult
        public final com.microblink.blinkid.image.Image getFaceImage() {
            long faceImageNativeGet = faceImageNativeGet(getNativeContext());
            if (faceImageNativeGet != 0) {
                return com.microblink.blinkid.image.ImageBuilder.buildImageFromNativeContext(faceImageNativeGet, true, this);
            }
            return null;
        }

        public final com.microblink.blinkid.geometry.Rectangle getFaceImageLocation() {
            return faceImageLocationNativeGet(getNativeContext());
        }

        public final com.microblink.blinkid.entities.recognizers.blinkid.generic.Side getFaceImageSide() {
            if (faceImageSideNativeGet(getNativeContext()) == -1) {
                return null;
            }
            return com.microblink.blinkid.entities.recognizers.blinkid.generic.Side.values()[faceImageSideNativeGet(getNativeContext())];
        }

        public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getFathersName() {
            return fathersNameNativeGet(getNativeContext());
        }

        public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getFirstName() {
            return firstNameNativeGet(getNativeContext());
        }

        public final com.microblink.blinkid.entities.recognizers.blinkid.generic.AdditionalProcessingInfo getFrontAdditionalProcessingInfo() {
            return frontAdditionalProcessingInfoNativeGet(getNativeContext());
        }

        public final com.microblink.blinkid.image.Image getFrontCameraFrame() {
            long frontCameraFrameNativeGet = frontCameraFrameNativeGet(getNativeContext());
            if (frontCameraFrameNativeGet != 0) {
                return com.microblink.blinkid.image.ImageBuilder.buildImageFromNativeContext(frontCameraFrameNativeGet, true, this);
            }
            return null;
        }

        public final com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.ImageAnalysisResult getFrontImageAnalysisResult() {
            return frontImageAnalysisResultNativeGet(getNativeContext());
        }

        public final com.microblink.blinkid.entities.recognizers.blinkid.generic.ProcessingStatus getFrontProcessingStatus() {
            return com.microblink.blinkid.entities.recognizers.blinkid.generic.ProcessingStatus.values()[frontProcessingStatusNativeGet(getNativeContext())];
        }

        public final com.microblink.blinkid.entities.recognizers.blinkid.generic.viz.VizResult getFrontVizResult() {
            long frontVizResultNativeGet = frontVizResultNativeGet(getNativeContext());
            if (frontVizResultNativeGet != 0) {
                return new com.microblink.blinkid.entities.recognizers.blinkid.generic.viz.VizResult(frontVizResultNativeGet, this);
            }
            throw new java.lang.RuntimeException("Invalid native context for frontVizResult");
        }

        @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageresult.CombinedFullDocumentImageResult
        public final com.microblink.blinkid.image.Image getFullDocumentBackImage() {
            long fullDocumentBackImageNativeGet = fullDocumentBackImageNativeGet(getNativeContext());
            if (fullDocumentBackImageNativeGet != 0) {
                return com.microblink.blinkid.image.ImageBuilder.buildImageFromNativeContext(fullDocumentBackImageNativeGet, true, this);
            }
            return null;
        }

        @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageresult.CombinedFullDocumentImageResult
        public final com.microblink.blinkid.image.Image getFullDocumentFrontImage() {
            long fullDocumentFrontImageNativeGet = fullDocumentFrontImageNativeGet(getNativeContext());
            if (fullDocumentFrontImageNativeGet != 0) {
                return com.microblink.blinkid.image.ImageBuilder.buildImageFromNativeContext(fullDocumentFrontImageNativeGet, true, this);
            }
            return null;
        }

        public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getFullName() {
            return fullNameNativeGet(getNativeContext());
        }

        public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getIssuingAuthority() {
            return issuingAuthorityNativeGet(getNativeContext());
        }

        public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getLastName() {
            return lastNameNativeGet(getNativeContext());
        }

        public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getLocalizedName() {
            return localizedNameNativeGet(getNativeContext());
        }

        public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getManufacturingYear() {
            return manufacturingYearNativeGet(getNativeContext());
        }

        public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getMaritalStatus() {
            return maritalStatusNativeGet(getNativeContext());
        }

        public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getMothersName() {
            return mothersNameNativeGet(getNativeContext());
        }

        public final com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrzResult getMrzResult() {
            long mrzResultNativeGet = mrzResultNativeGet(getNativeContext());
            if (mrzResultNativeGet != 0) {
                return new com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrzResult(mrzResultNativeGet, this);
            }
            throw new java.lang.RuntimeException("Invalid native context for mrzResult");
        }

        public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getNationality() {
            return nationalityNativeGet(getNativeContext());
        }

        public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getPersonalIdNumber() {
            return personalIdNumberNativeGet(getNativeContext());
        }

        public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getPlaceOfBirth() {
            return placeOfBirthNativeGet(getNativeContext());
        }

        @Override // com.microblink.blinkid.entities.recognizers.blinkid.ProcessingStatusResult
        public final com.microblink.blinkid.entities.recognizers.blinkid.generic.ProcessingStatus getProcessingStatus() {
            return com.microblink.blinkid.entities.recognizers.blinkid.generic.ProcessingStatus.values()[processingStatusNativeGet(getNativeContext())];
        }

        public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getProfession() {
            return professionNativeGet(getNativeContext());
        }

        public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getRace() {
            return raceNativeGet(getNativeContext());
        }

        public final com.microblink.blinkid.entities.recognizers.blinkid.generic.RecognitionMode getRecognitionMode() {
            return com.microblink.blinkid.entities.recognizers.blinkid.generic.RecognitionMode.values()[recognitionModeNativeGet(getNativeContext())];
        }

        public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getReligion() {
            return religionNativeGet(getNativeContext());
        }

        public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getRemarks() {
            return remarksNativeGet(getNativeContext());
        }

        public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getResidencePermitType() {
            return residencePermitTypeNativeGet(getNativeContext());
        }

        public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getResidentialStatus() {
            return residentialStatusNativeGet(getNativeContext());
        }

        public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getSex() {
            return sexNativeGet(getNativeContext());
        }

        @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageresult.SignatureImageResult
        public final com.microblink.blinkid.image.Image getSignatureImage() {
            long signatureImageNativeGet = signatureImageNativeGet(getNativeContext());
            if (signatureImageNativeGet != 0) {
                return com.microblink.blinkid.image.ImageBuilder.buildImageFromNativeContext(signatureImageNativeGet, true, this);
            }
            return null;
        }

        public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getSpecificDocumentValidity() {
            return specificDocumentValidityNativeGet(getNativeContext());
        }

        public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getSponsor() {
            return sponsorNativeGet(getNativeContext());
        }

        public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getVehicleOwner() {
            return vehicleOwnerNativeGet(getNativeContext());
        }

        public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getVehicleType() {
            return vehicleTypeNativeGet(getNativeContext());
        }

        public final com.microblink.blinkid.entities.recognizers.blinkid.generic.StringResult getVisaType() {
            return visaTypeNativeGet(getNativeContext());
        }

        public final boolean isBarcodeStepUsed() {
            return barcodeStepUsedNativeGet(getNativeContext());
        }

        public final boolean isDateOfExpiryPermanent() {
            return dateOfExpiryPermanentNativeGet(getNativeContext());
        }

        public final boolean isExpired() {
            com.microblink.blinkid.entities.recognizers.blinkid.generic.DateResult dateOfExpiry = getDateOfExpiry();
            if (isDateOfExpiryPermanent() || dateOfExpiry == null || dateOfExpiry.getDate() == null) {
                return false;
            }
            return com.microblink.blinkid.results.date.DateUtils.isDatePassed(dateOfExpiry.getDate());
        }

        @Override // com.microblink.blinkid.entities.recognizers.blinkid.CombinedResult
        public final boolean isScanningFirstSideDone() {
            return scanningFirstSideDoneNativeGet(getNativeContext());
        }

        public final java.lang.String toString() {
            return "Blink Id Multi Side Recognizer";
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
        public final com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer.Result mo10870clone() {
            return new com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer.Result(nativeCopy(getNativeContext()));
        }
    }

    public static final class VerificationConstants {
        public static final java.lang.String AdditionalAddressInformation = "additionalAddressInformation";
        public static final java.lang.String AdditionalNameInformation = "additionalNameInformation";
        public static final java.lang.String AdditionalOptionalAddressInformation = "additionalOptionalAddressInformation";
        public static final java.lang.String Address = "address";
        public static final java.lang.String BackAdditionalProcessingInfo = "backAdditionalProcessingInfo";
        public static final java.lang.String BackCameraFrame = "backCameraFrame";
        public static final java.lang.String BackImageAnalysisResult = "backImageAnalysisResult";
        public static final java.lang.String BackProcessingStatus = "backProcessingStatus";
        public static final java.lang.String BackVizResult = "backVizResult";
        public static final java.lang.String BarcodeCameraFrame = "barcodeCameraFrame";
        public static final java.lang.String BarcodeResult = "barcodeResult";
        public static final java.lang.String BarcodeStepUsed = "barcodeStepUsed";
        public static final java.lang.String BloodType = "bloodType";
        public static final java.lang.String ClassInfo = "classInfo";
        public static final java.lang.String DataMatch = "dataMatch";
        public static final java.lang.String DateOfBirth = "dateOfBirth";
        public static final java.lang.String DateOfExpiry = "dateOfExpiry";
        public static final java.lang.String DateOfExpiryPermanent = "dateOfExpiryPermanent";
        public static final java.lang.String DateOfIssue = "dateOfIssue";
        public static final java.lang.String DependentsInfo = "dependentsInfo";
        public static final java.lang.String DocumentAdditionalNumber = "documentAdditionalNumber";
        public static final java.lang.String DocumentNumber = "documentNumber";
        public static final java.lang.String DocumentOptionalAdditionalNumber = "documentOptionalAdditionalNumber";
        public static final java.lang.String DocumentSubtype = "documentSubtype";
        public static final java.lang.String DriverLicenseDetailedInfo = "driverLicenseDetailedInfo";
        public static final java.lang.String EligibilityCategory = "eligibilityCategory";
        public static final java.lang.String Employer = "employer";
        public static final java.lang.String EncodedBackFullDocumentImage = "encodedBackFullDocumentImage";
        public static final java.lang.String EncodedFaceImage = "encodedFaceImage";
        public static final java.lang.String EncodedFrontFullDocumentImage = "encodedFrontFullDocumentImage";
        public static final java.lang.String EncodedSignatureImage = "encodedSignatureImage";
        public static final java.lang.String FaceImage = "faceImage";
        public static final java.lang.String FaceImageLocation = "faceImageLocation";
        public static final java.lang.String FaceImageSide = "faceImageSide";
        public static final java.lang.String FathersName = "fathersName";
        public static final java.lang.String FirstName = "firstName";
        public static final java.lang.String FrontAdditionalProcessingInfo = "frontAdditionalProcessingInfo";
        public static final java.lang.String FrontCameraFrame = "frontCameraFrame";
        public static final java.lang.String FrontImageAnalysisResult = "frontImageAnalysisResult";
        public static final java.lang.String FrontProcessingStatus = "frontProcessingStatus";
        public static final java.lang.String FrontVizResult = "frontVizResult";
        public static final java.lang.String FullDocumentBackImage = "fullDocumentBackImage";
        public static final java.lang.String FullDocumentFrontImage = "fullDocumentFrontImage";
        public static final java.lang.String FullName = "fullName";
        public static final java.lang.String IssuingAuthority = "issuingAuthority";
        public static final java.lang.String LastName = "lastName";
        public static final java.lang.String LocalizedName = "localizedName";
        public static final java.lang.String ManufacturingYear = "manufacturingYear";
        public static final java.lang.String MaritalStatus = "maritalStatus";
        public static final java.lang.String MothersName = "mothersName";
        public static final java.lang.String MrzResult = "mrzResult";
        public static final java.lang.String Nationality = "nationality";
        public static final java.lang.String PersonalIdNumber = "personalIdNumber";
        public static final java.lang.String PlaceOfBirth = "placeOfBirth";
        public static final java.lang.String ProcessingStatus = "processingStatus";
        public static final java.lang.String Profession = "profession";
        public static final java.lang.String Race = "race";
        public static final java.lang.String RecognitionMode = "recognitionMode";
        public static final java.lang.String Religion = "religion";
        public static final java.lang.String Remarks = "remarks";
        public static final java.lang.String ResidencePermitType = "residencePermitType";
        public static final java.lang.String ResidentialStatus = "residentialStatus";
        public static final java.lang.String ScanningFirstSideDone = "scanningFirstSideDone";
        public static final java.lang.String Sex = "sex";
        public static final java.lang.String SignatureImage = "signatureImage";
        public static final java.lang.String SpecificDocumentValidity = "specificDocumentValidity";
        public static final java.lang.String Sponsor = "sponsor";
        public static final java.lang.String VehicleOwner = "vehicleOwner";
        public static final java.lang.String VehicleType = "vehicleType";
        public static final java.lang.String VisaType = "visaType";
    }

    static {
        com.microblink.blinkid.secured.lIIllllIIl.llIIlIlIIl();
        CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer>() { // from class: com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer createFromParcel(android.os.Parcel parcel) {
                return new com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer(parcel, com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer.nativeConstruct());
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer[] newArray(int i) {
                return new com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer[i];
            }
        };
    }

    /* synthetic */ BlinkIdMultiSideRecognizer(android.os.Parcel parcel, long j) {
        this(j, parcel);
    }

    private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.ClassAnonymizationSettings[] additionalAnonymizationNativeGet(long j);

    private static native void additionalAnonymizationNativeSet(long j, int[] iArr);

    private static native boolean allowBarcodeScanOnlyNativeGet(long j);

    private static native void allowBarcodeScanOnlyNativeSet(long j, boolean z);

    private static native boolean allowUncertainFrontSideScanNativeGet(long j);

    private static native void allowUncertainFrontSideScanNativeSet(long j, boolean z);

    private static native boolean allowUnparsedMrzResultsNativeGet(long j);

    private static native void allowUnparsedMrzResultsNativeSet(long j, boolean z);

    private static native boolean allowUnverifiedMrzResultsNativeGet(long j);

    private static native void allowUnverifiedMrzResultsNativeSet(long j, boolean z);

    private static native int anonymizationModeNativeGet(long j);

    private static native void anonymizationModeNativeSet(long j, int i);

    private static native void barcodeScanningStartedCallbackNativeSet(long j, com.microblink.blinkid.entities.recognizers.blinkid.generic.NativeBarcodeScanningStartedCallbackCallback nativeBarcodeScanningStartedCallbackCallback);

    private static native int blurStrictnessLevelNativeGet(long j);

    private static native void blurStrictnessLevelNativeSet(long j, int i);

    private static native void classFilterNativeSet(long j, com.microblink.blinkid.entities.recognizers.blinkid.generic.NativeClassFilter nativeClassFilter);

    private static native void classifierCallbackNativeSet(long j, com.microblink.blinkid.entities.recognizers.blinkid.generic.NativeClassifierCallback nativeClassifierCallback);

    private static native boolean combineFrameResultsNativeGet(long j);

    private static native void combineFrameResultsNativeSet(long j, boolean z);

    private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.CustomClassRules[] customClassRulesNativeGet(long j);

    private static native void customClassRulesNativeSet(long j, int[] iArr);

    private static native void dewarpedImageCallbackNativeSet(long j, com.microblink.blinkid.entities.recognizers.blinkid.generic.NativeDewarpedImageCallback nativeDewarpedImageCallback);

    private static native boolean enableBlurFilterNativeGet(long j);

    private static native void enableBlurFilterNativeSet(long j, boolean z);

    private static native boolean enableGlareFilterNativeGet(long j);

    private static native void enableGlareFilterNativeSet(long j, boolean z);

    private static native boolean encodeFaceImageNativeGet(long j);

    private static native void encodeFaceImageNativeSet(long j, boolean z);

    private static native boolean encodeFullDocumentImageNativeGet(long j);

    private static native void encodeFullDocumentImageNativeSet(long j, boolean z);

    private static native boolean encodeSignatureImageNativeGet(long j);

    private static native void encodeSignatureImageNativeSet(long j, boolean z);

    private static native int faceImageDpiNativeGet(long j);

    private static native void faceImageDpiNativeSet(long j, int i);

    private static native int fullDocumentImageDpiNativeGet(long j);

    private static native void fullDocumentImageDpiNativeSet(long j, int i);

    private static native float[] fullDocumentImageExtensionFactorsNativeGet(long j);

    private static native void fullDocumentImageExtensionFactorsNativeSet(long j, float[] fArr);

    private static native int glareStrictnessLevelNativeGet(long j);

    private static native void glareStrictnessLevelNativeSet(long j, int i);

    private static native int maxAllowedMismatchesPerFieldNativeGet(long j);

    private static native void maxAllowedMismatchesPerFieldNativeSet(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nativeConstruct();

    private static native void nativeConsumeResult(long j, long j2);

    private static native long nativeCopy(long j);

    private static native void nativeDeserialize(long j, byte[] bArr);

    private static native void nativeDestruct(long j);

    private static native byte[] nativeSerialize(long j);

    private static native float paddingEdgeNativeGet(long j);

    private static native void paddingEdgeNativeSet(long j, float f);

    private static native boolean[] recognitionModeFilterNativeGet(long j);

    private static native void recognitionModeFilterNativeSet(long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6);

    private static native boolean returnFaceImageNativeGet(long j);

    private static native void returnFaceImageNativeSet(long j, boolean z);

    private static native boolean returnFullDocumentImageNativeGet(long j);

    private static native void returnFullDocumentImageNativeSet(long j, boolean z);

    private static native boolean returnSignatureImageNativeGet(long j);

    private static native void returnSignatureImageNativeSet(long j, boolean z);

    private static native boolean saveCameraFramesNativeGet(long j);

    private static native void saveCameraFramesNativeSet(long j, boolean z);

    private static native boolean scanCroppedDocumentImageNativeGet(long j);

    private static native void scanCroppedDocumentImageNativeSet(long j, boolean z);

    private static native boolean scanPassportDataPageOnlyNativeGet(long j);

    private static native void scanPassportDataPageOnlyNativeSet(long j, boolean z);

    private static native int signatureImageDpiNativeGet(long j);

    private static native void signatureImageDpiNativeSet(long j, int i);

    private static native boolean skipUnsupportedBackNativeGet(long j);

    private static native void skipUnsupportedBackNativeSet(long j, boolean z);

    private static native boolean validateResultCharactersNativeGet(long j);

    private static native void validateResultCharactersNativeSet(long j, boolean z);

    @Override // com.microblink.blinkid.entities.Entity
    public final void consumeResultFrom(com.microblink.blinkid.entities.Entity entity) {
        if (this != entity) {
            if (!(entity instanceof com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer)) {
                throw new java.lang.IllegalArgumentException("Parameter type has to be BlinkIdMultiSideRecognizer");
            }
            nativeConsumeResult(getNativeContext(), entity.getResult().getNativeContext());
        }
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.ClassAnonymizationSettings[] getAdditionalAnonymization() {
        return additionalAnonymizationNativeGet(getNativeContext());
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.AnonymizationMode getAnonymizationMode() {
        return com.microblink.blinkid.entities.recognizers.blinkid.generic.AnonymizationMode.values()[anonymizationModeNativeGet(getNativeContext())];
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.StrictnessLevel getBlurStrictnessLevel() {
        return com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.StrictnessLevel.values()[blurStrictnessLevelNativeGet(getNativeContext())];
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.CombinedRecognizer
    public final com.microblink.blinkid.entities.recognizers.blinkid.CombinedResult getCombinedResult() {
        return (com.microblink.blinkid.entities.recognizers.blinkid.CombinedResult) getResult();
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.CustomClassRules[] getCustomClassRules() {
        return customClassRulesNativeGet(getNativeContext());
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.dpi.FaceImageDpiOptions
    public final int getFaceImageDpi() {
        return faceImageDpiNativeGet(getNativeContext());
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.dpi.FullDocumentImageDpiOptions
    public final int getFullDocumentImageDpi() {
        return fullDocumentImageDpiNativeGet(getNativeContext());
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.extension.FullDocumentImageExtensionOptions
    public final com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.extension.ImageExtensionFactors getFullDocumentImageExtensionFactors() {
        return com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.extension.ImageExtensionFactors.createFromArray(fullDocumentImageExtensionFactorsNativeGet(getNativeContext()));
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.StrictnessLevel getGlareStrictnessLevel() {
        return com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.StrictnessLevel.values()[glareStrictnessLevelNativeGet(getNativeContext())];
    }

    public final int getMaxAllowedMismatchesPerField() {
        return maxAllowedMismatchesPerFieldNativeGet(getNativeContext());
    }

    public final float getPaddingEdge() {
        return paddingEdgeNativeGet(getNativeContext());
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.RecognitionModeFilter getRecognitionModeFilter() {
        boolean[] recognitionModeFilterNativeGet = recognitionModeFilterNativeGet(getNativeContext());
        return recognitionModeFilterNativeGet.length == 6 ? new com.microblink.blinkid.entities.recognizers.blinkid.generic.RecognitionModeFilter(recognitionModeFilterNativeGet[0], recognitionModeFilterNativeGet[1], recognitionModeFilterNativeGet[2], recognitionModeFilterNativeGet[3], recognitionModeFilterNativeGet[4], recognitionModeFilterNativeGet[5]) : new com.microblink.blinkid.entities.recognizers.blinkid.generic.RecognitionModeFilter();
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.dpi.SignatureImageDpiOptions
    public final int getSignatureImageDpi() {
        return signatureImageDpiNativeGet(getNativeContext());
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final void llIIlIlIIl(android.os.Parcel parcel) {
        com.microblink.blinkid.entities.recognizers.blinkid.generic.DewarpedImageCallback dewarpedImageCallback = (com.microblink.blinkid.entities.recognizers.blinkid.generic.DewarpedImageCallback) parcel.readParcelable(com.microblink.blinkid.entities.recognizers.blinkid.generic.DewarpedImageCallback.class.getClassLoader());
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        if (dewarpedImageCallback != null) {
            this.getHighResolutionOutputSizeshNQ4ISI = new com.microblink.blinkid.entities.recognizers.blinkid.generic.NativeDewarpedImageCallback(dewarpedImageCallback);
        }
        dewarpedImageCallbackNativeSet(getNativeContext(), this.getHighResolutionOutputSizeshNQ4ISI);
        com.microblink.blinkid.entities.recognizers.classifier.ClassifierCallback classifierCallback = (com.microblink.blinkid.entities.recognizers.classifier.ClassifierCallback) parcel.readParcelable(com.microblink.blinkid.entities.recognizers.classifier.ClassifierCallback.class.getClassLoader());
        this.getHighSpeedVideoSizes = null;
        if (classifierCallback != null) {
            this.getHighSpeedVideoSizes = new com.microblink.blinkid.entities.recognizers.blinkid.generic.NativeClassifierCallback(classifierCallback);
        }
        classifierCallbackNativeSet(getNativeContext(), this.getHighSpeedVideoSizes);
        com.microblink.blinkid.entities.recognizers.blinkid.generic.BarcodeScanningStartedCallback barcodeScanningStartedCallback = (com.microblink.blinkid.entities.recognizers.blinkid.generic.BarcodeScanningStartedCallback) parcel.readParcelable(com.microblink.blinkid.entities.recognizers.blinkid.generic.BarcodeScanningStartedCallback.class.getClassLoader());
        this.Camera2StreamConfigurationMap = null;
        if (barcodeScanningStartedCallback != null) {
            this.Camera2StreamConfigurationMap = new com.microblink.blinkid.entities.recognizers.blinkid.generic.NativeBarcodeScanningStartedCallbackCallback(barcodeScanningStartedCallback);
        }
        barcodeScanningStartedCallbackNativeSet(getNativeContext(), this.Camera2StreamConfigurationMap);
        com.microblink.blinkid.entities.recognizers.blinkid.generic.ClassFilter classFilter = (com.microblink.blinkid.entities.recognizers.blinkid.generic.ClassFilter) parcel.readParcelable(com.microblink.blinkid.entities.recognizers.blinkid.generic.ClassFilter.class.getClassLoader());
        this.getHighSpeedVideoFpsRangesFor = null;
        if (classFilter != null) {
            this.getHighSpeedVideoFpsRangesFor = new com.microblink.blinkid.entities.recognizers.blinkid.generic.NativeClassFilter(classFilter);
        }
        classFilterNativeSet(getNativeContext(), this.getHighSpeedVideoFpsRangesFor);
        super.llIIlIlIIl(parcel);
    }

    public final void setAdditionalAnonymization(com.microblink.blinkid.entities.recognizers.blinkid.generic.ClassAnonymizationSettings[] classAnonymizationSettingsArr) {
        additionalAnonymizationNativeSet(getNativeContext(), com.microblink.blinkid.entities.recognizers.blinkid.generic.ClassAnonymizationSettings.serializeToArray(classAnonymizationSettingsArr));
    }

    public final void setAllowBarcodeScanOnly(boolean z) {
        allowBarcodeScanOnlyNativeSet(getNativeContext(), z);
    }

    public final void setAllowUncertainFrontSideScan(boolean z) {
        allowUncertainFrontSideScanNativeSet(getNativeContext(), z);
    }

    public final void setAllowUnparsedMrzResults(boolean z) {
        allowUnparsedMrzResultsNativeSet(getNativeContext(), z);
    }

    public final void setAllowUnverifiedMrzResults(boolean z) {
        allowUnverifiedMrzResultsNativeSet(getNativeContext(), z);
    }

    public final void setAnonymizationMode(com.microblink.blinkid.entities.recognizers.blinkid.generic.AnonymizationMode anonymizationMode) {
        anonymizationModeNativeSet(getNativeContext(), anonymizationMode.ordinal());
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.generic.BarcodeScanningStartedCallbackOptions
    public final void setBarcodeScanningStartedCallback(com.microblink.blinkid.entities.recognizers.blinkid.generic.BarcodeScanningStartedCallback barcodeScanningStartedCallback) {
        com.microblink.blinkid.entities.recognizers.blinkid.generic.NativeBarcodeScanningStartedCallbackCallback nativeBarcodeScanningStartedCallbackCallback = this.Camera2StreamConfigurationMap;
        if (nativeBarcodeScanningStartedCallbackCallback != null) {
            nativeBarcodeScanningStartedCallbackCallback.getHighSpeedVideoFpsRanges = barcodeScanningStartedCallback;
        } else {
            this.Camera2StreamConfigurationMap = new com.microblink.blinkid.entities.recognizers.blinkid.generic.NativeBarcodeScanningStartedCallbackCallback(barcodeScanningStartedCallback);
            barcodeScanningStartedCallbackNativeSet(getNativeContext(), this.Camera2StreamConfigurationMap);
        }
    }

    public final void setBlurStrictnessLevel(com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.StrictnessLevel strictnessLevel) {
        blurStrictnessLevelNativeSet(getNativeContext(), strictnessLevel.ordinal());
    }

    public final void setClassFilter(com.microblink.blinkid.entities.recognizers.blinkid.generic.ClassFilter classFilter) {
        com.microblink.blinkid.entities.recognizers.blinkid.generic.NativeClassFilter nativeClassFilter = this.getHighSpeedVideoFpsRangesFor;
        if (nativeClassFilter != null) {
            nativeClassFilter.getHighSpeedVideoFpsRangesFor = classFilter;
        } else {
            this.getHighSpeedVideoFpsRangesFor = new com.microblink.blinkid.entities.recognizers.blinkid.generic.NativeClassFilter(classFilter);
            classFilterNativeSet(getNativeContext(), this.getHighSpeedVideoFpsRangesFor);
        }
    }

    @Override // com.microblink.blinkid.entities.recognizers.classifier.ClassifierCallbackOptions
    public final void setClassifierCallback(com.microblink.blinkid.entities.recognizers.classifier.ClassifierCallback classifierCallback) {
        com.microblink.blinkid.entities.recognizers.blinkid.generic.NativeClassifierCallback nativeClassifierCallback = this.getHighSpeedVideoSizes;
        if (nativeClassifierCallback != null) {
            nativeClassifierCallback.getHighSpeedVideoFpsRangesFor = classifierCallback;
        } else {
            this.getHighSpeedVideoSizes = new com.microblink.blinkid.entities.recognizers.blinkid.generic.NativeClassifierCallback(classifierCallback);
            classifierCallbackNativeSet(getNativeContext(), this.getHighSpeedVideoSizes);
        }
    }

    public final void setCombineFrameResults(boolean z) {
        combineFrameResultsNativeSet(getNativeContext(), z);
    }

    public final void setCustomClassRules(com.microblink.blinkid.entities.recognizers.blinkid.generic.CustomClassRules[] customClassRulesArr) {
        customClassRulesNativeSet(getNativeContext(), com.microblink.blinkid.entities.recognizers.blinkid.generic.CustomClassRules.serializeToArray(customClassRulesArr));
    }

    public final void setDewarpedImageCallback(com.microblink.blinkid.entities.recognizers.blinkid.generic.DewarpedImageCallback dewarpedImageCallback) {
        com.microblink.blinkid.entities.recognizers.blinkid.generic.NativeDewarpedImageCallback nativeDewarpedImageCallback = this.getHighResolutionOutputSizeshNQ4ISI;
        if (nativeDewarpedImageCallback != null) {
            nativeDewarpedImageCallback.Camera2StreamConfigurationMap = dewarpedImageCallback;
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI = new com.microblink.blinkid.entities.recognizers.blinkid.generic.NativeDewarpedImageCallback(dewarpedImageCallback);
            dewarpedImageCallbackNativeSet(getNativeContext(), this.getHighResolutionOutputSizeshNQ4ISI);
        }
    }

    public final void setEnableBlurFilter(boolean z) {
        enableBlurFilterNativeSet(getNativeContext(), z);
    }

    public final void setEnableGlareFilter(boolean z) {
        enableGlareFilterNativeSet(getNativeContext(), z);
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.encode.EncodeFaceImageOptions
    public final void setEncodeFaceImage(boolean z) {
        encodeFaceImageNativeSet(getNativeContext(), z);
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.encode.EncodeFullDocumentImagesOptions
    public final void setEncodeFullDocumentImage(boolean z) {
        encodeFullDocumentImageNativeSet(getNativeContext(), z);
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.encode.EncodeSignatureImageOptions
    public final void setEncodeSignatureImage(boolean z) {
        encodeSignatureImageNativeSet(getNativeContext(), z);
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.dpi.FaceImageDpiOptions
    public final void setFaceImageDpi(int i) {
        com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.dpi.DpiOptionsUtils.checkDpiRange(i);
        faceImageDpiNativeSet(getNativeContext(), i);
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.dpi.FullDocumentImageDpiOptions
    public final void setFullDocumentImageDpi(int i) {
        com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.dpi.DpiOptionsUtils.checkDpiRange(i);
        fullDocumentImageDpiNativeSet(getNativeContext(), i);
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.extension.FullDocumentImageExtensionOptions
    public final void setFullDocumentImageExtensionFactors(com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.extension.ImageExtensionFactors imageExtensionFactors) {
        fullDocumentImageExtensionFactorsNativeSet(getNativeContext(), imageExtensionFactors.serializeToArray());
    }

    public final void setGlareStrictnessLevel(com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.StrictnessLevel strictnessLevel) {
        glareStrictnessLevelNativeSet(getNativeContext(), strictnessLevel.ordinal());
    }

    public final void setMaxAllowedMismatchesPerField(int i) {
        maxAllowedMismatchesPerFieldNativeSet(getNativeContext(), i);
    }

    public final void setPaddingEdge(float f) {
        paddingEdgeNativeSet(getNativeContext(), f);
    }

    public final void setRecognitionModeFilter(com.microblink.blinkid.entities.recognizers.blinkid.generic.RecognitionModeFilter recognitionModeFilter) {
        recognitionModeFilterNativeSet(getNativeContext(), recognitionModeFilter.enableMrzId, recognitionModeFilter.enableMrzVisa, recognitionModeFilter.enableMrzPassport, recognitionModeFilter.enablePhotoId, recognitionModeFilter.enableBarcodeId, recognitionModeFilter.enableFullDocumentRecognition);
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.FaceImageOptions
    public final void setReturnFaceImage(boolean z) {
        returnFaceImageNativeSet(getNativeContext(), z);
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.FullDocumentImageOptions
    public final void setReturnFullDocumentImage(boolean z) {
        returnFullDocumentImageNativeSet(getNativeContext(), z);
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.SignatureImageOptions
    public final void setReturnSignatureImage(boolean z) {
        returnSignatureImageNativeSet(getNativeContext(), z);
    }

    public final void setSaveCameraFrames(boolean z) {
        saveCameraFramesNativeSet(getNativeContext(), z);
    }

    public final void setScanCroppedDocumentImage(boolean z) {
        scanCroppedDocumentImageNativeSet(getNativeContext(), z);
    }

    public final void setScanPassportDataPageOnly(boolean z) {
        scanPassportDataPageOnlyNativeSet(getNativeContext(), z);
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.dpi.SignatureImageDpiOptions
    public final void setSignatureImageDpi(int i) {
        com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.dpi.DpiOptionsUtils.checkDpiRange(i);
        signatureImageDpiNativeSet(getNativeContext(), i);
    }

    public final void setSkipUnsupportedBack(boolean z) {
        skipUnsupportedBackNativeSet(getNativeContext(), z);
    }

    public final void setValidateResultCharacters(boolean z) {
        validateResultCharactersNativeSet(getNativeContext(), z);
    }

    public final boolean shouldAllowBarcodeScanOnly() {
        return allowBarcodeScanOnlyNativeGet(getNativeContext());
    }

    public final boolean shouldAllowUncertainFrontSideScan() {
        return allowUncertainFrontSideScanNativeGet(getNativeContext());
    }

    public final boolean shouldAllowUnparsedMrzResults() {
        return allowUnparsedMrzResultsNativeGet(getNativeContext());
    }

    public final boolean shouldAllowUnverifiedMrzResults() {
        return allowUnverifiedMrzResultsNativeGet(getNativeContext());
    }

    public final boolean shouldCombineFrameResults() {
        return combineFrameResultsNativeGet(getNativeContext());
    }

    public final boolean shouldEnableBlurFilter() {
        return enableBlurFilterNativeGet(getNativeContext());
    }

    public final boolean shouldEnableGlareFilter() {
        return enableGlareFilterNativeGet(getNativeContext());
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.encode.EncodeFaceImageOptions
    public final boolean shouldEncodeFaceImage() {
        return encodeFaceImageNativeGet(getNativeContext());
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.encode.EncodeFullDocumentImagesOptions
    public final boolean shouldEncodeFullDocumentImage() {
        return encodeFullDocumentImageNativeGet(getNativeContext());
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.encode.EncodeSignatureImageOptions
    public final boolean shouldEncodeSignatureImage() {
        return encodeSignatureImageNativeGet(getNativeContext());
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.FaceImageOptions
    public final boolean shouldReturnFaceImage() {
        return returnFaceImageNativeGet(getNativeContext());
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.FullDocumentImageOptions
    public final boolean shouldReturnFullDocumentImage() {
        return returnFullDocumentImageNativeGet(getNativeContext());
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.SignatureImageOptions
    public final boolean shouldReturnSignatureImage() {
        return returnSignatureImageNativeGet(getNativeContext());
    }

    public final boolean shouldSaveCameraFrames() {
        return saveCameraFramesNativeGet(getNativeContext());
    }

    public final boolean shouldScanCroppedDocumentImage() {
        return scanCroppedDocumentImageNativeGet(getNativeContext());
    }

    public final boolean shouldScanPassportDataPageOnly() {
        return scanPassportDataPageOnlyNativeGet(getNativeContext());
    }

    public final boolean shouldSkipUnsupportedBack() {
        return skipUnsupportedBackNativeGet(getNativeContext());
    }

    public final boolean shouldValidateResultCharacters() {
        return validateResultCharactersNativeGet(getNativeContext());
    }

    @Override // com.microblink.blinkid.entities.Entity, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        com.microblink.blinkid.entities.recognizers.blinkid.generic.NativeDewarpedImageCallback nativeDewarpedImageCallback = this.getHighResolutionOutputSizeshNQ4ISI;
        if (nativeDewarpedImageCallback != null) {
            parcel.writeParcelable(nativeDewarpedImageCallback.Camera2StreamConfigurationMap, i);
        } else {
            parcel.writeParcelable(null, i);
        }
        com.microblink.blinkid.entities.recognizers.blinkid.generic.NativeClassifierCallback nativeClassifierCallback = this.getHighSpeedVideoSizes;
        if (nativeClassifierCallback != null) {
            parcel.writeParcelable(nativeClassifierCallback.getHighSpeedVideoFpsRangesFor, i);
        } else {
            parcel.writeParcelable(null, i);
        }
        com.microblink.blinkid.entities.recognizers.blinkid.generic.NativeBarcodeScanningStartedCallbackCallback nativeBarcodeScanningStartedCallbackCallback = this.Camera2StreamConfigurationMap;
        if (nativeBarcodeScanningStartedCallbackCallback != null) {
            parcel.writeParcelable(nativeBarcodeScanningStartedCallbackCallback.getHighSpeedVideoFpsRanges, i);
        } else {
            parcel.writeParcelable(null, i);
        }
        com.microblink.blinkid.entities.recognizers.blinkid.generic.NativeClassFilter nativeClassFilter = this.getHighSpeedVideoFpsRangesFor;
        if (nativeClassFilter != null) {
            parcel.writeParcelable(nativeClassFilter.getHighSpeedVideoFpsRangesFor, i);
        } else {
            parcel.writeParcelable(null, i);
        }
        super.writeToParcel(parcel, i);
    }

    public BlinkIdMultiSideRecognizer() {
        this(nativeConstruct());
    }

    private BlinkIdMultiSideRecognizer(long j) {
        super(j, new com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)));
    }

    private BlinkIdMultiSideRecognizer(long j, android.os.Parcel parcel) {
        super(j, new com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)), parcel);
    }

    @Override // com.microblink.blinkid.entities.recognizers.Recognizer, com.microblink.blinkid.entities.Entity
    /* renamed from: clone */
    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer mo10869clone() {
        return new com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer(nativeCopy(getNativeContext()));
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final void llIIlIlIIl(long j) {
        nativeDestruct(j);
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final byte[] llIIlIlIIl() {
        return nativeSerialize(getNativeContext());
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final void llIIlIlIIl(byte[] bArr) {
        nativeDeserialize(getNativeContext(), bArr);
    }
}
