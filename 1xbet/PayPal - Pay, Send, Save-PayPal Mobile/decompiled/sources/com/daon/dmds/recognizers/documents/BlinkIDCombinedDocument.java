package com.daon.dmds.recognizers.documents;

/* loaded from: classes7.dex */
public class BlinkIDCombinedDocument implements com.daon.dmds.recognizers.DocumentRecognizer, com.daon.dmds.recognizers.DocumentFrontRecognizer, com.daon.dmds.recognizers.IIdDocument, com.daon.dmds.recognizers.FaceExtractor, com.daon.dmds.recognizers.QualityAssessment {
    private static final java.lang.String getHighSpeedVideoFpsRanges = "BlinkIDCombinedDocument";
    private com.daon.dmds.recognizers.IBarcodeScan Camera2StreamConfigurationMap;
    private com.daon.dmds.models.DMDSDocumentRotation getHighResolutionOutputSizeshNQ4ISI;
    private com.daon.dmds.models.DMDSDocumentRotation getHighSpeedVideoFpsRangesFor;
    private com.daon.dmds.models.DMDSDocument getHighSpeedVideoSizes;
    private com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer getHighSpeedVideoSizesFor;
    private com.daon.dmds.models.DMDSOptions getInputFormats;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.daon.dmds.recognizers.QualityAssessment
    public com.daon.dmds.models.DMDSDocumentDetectionIssues assessFrameQuality() {
        com.microblink.blinkid.entities.recognizers.blinkid.generic.ProcessingStatus processingStatus = ((com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer.Result) this.getHighSpeedVideoSizesFor.getResult()).getProcessingStatus();
        java.lang.String str = getHighSpeedVideoFpsRanges;
        com.daon.dmds.utils.DobsLogUtils.logDebug(str, "assessFrameQuality: ".concat(java.lang.String.valueOf(processingStatus)));
        com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.ImageAnalysisResult backImageAnalysisResult = ((com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer.Result) this.getHighSpeedVideoSizesFor.getResult()).getBackImageAnalysisResult();
        com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.ImageAnalysisResult frontImageAnalysisResult = ((com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer.Result) this.getHighSpeedVideoSizesFor.getResult()).getFrontImageAnalysisResult();
        boolean z = frontImageAnalysisResult.isGlareDetected() || backImageAnalysisResult.isGlareDetected();
        boolean z2 = frontImageAnalysisResult.isBlurDetected() || backImageAnalysisResult.isBlurDetected();
        boolean isFaceMissingFromDocumentImage = com.daon.dmds.utils.DMDSDocumentUtils.isFaceMissingFromDocumentImage(((com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer.Result) this.getHighSpeedVideoSizesFor.getResult()).getFrontAdditionalProcessingInfo(), ((com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer.Result) this.getHighSpeedVideoSizesFor.getResult()).getBackAdditionalProcessingInfo());
        com.daon.dmds.utils.DobsLogUtils.logDebug(str, "Glare: ".concat(java.lang.String.valueOf(z)));
        com.daon.dmds.utils.DobsLogUtils.logDebug(str, "Blur: ".concat(java.lang.String.valueOf(z2)));
        com.daon.dmds.utils.DobsLogUtils.logDebug(str, "Face: ".concat(java.lang.String.valueOf(isFaceMissingFromDocumentImage)));
        com.daon.dmds.utils.DobsLogUtils.logDebug(str, "----------------------");
        com.daon.dmds.models.DMDSDocumentDetectionIssues dMDSDocumentDetectionIssues = new com.daon.dmds.models.DMDSDocumentDetectionIssues();
        dMDSDocumentDetectionIssues.setBlurDetected(z);
        dMDSDocumentDetectionIssues.setGlareDetected(z2);
        dMDSDocumentDetectionIssues.setWrongSideDetected(processingStatus == com.microblink.blinkid.entities.recognizers.blinkid.generic.ProcessingStatus.ScanningWrongSide);
        dMDSDocumentDetectionIssues.setFaceNotFound(this.getInputFormats.isFaceDetection() && isFaceMissingFromDocumentImage);
        return dMDSDocumentDetectionIssues;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.daon.dmds.recognizers.DocumentFrontRecognizer
    public com.daon.dmds.models.DMDSDocument buildFrontResult() {
        com.daon.dmds.models.DMDSDocument dMDSDocument = new com.daon.dmds.models.DMDSDocument();
        this.getHighSpeedVideoSizes = dMDSDocument;
        dMDSDocument.setDocumentType(com.daon.dmds.utils.DMDSDocumentUtils.extractDocumentType(this.getInputFormats.getDocumentTypes()).name());
        if (((com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer.Result) this.getHighSpeedVideoSizesFor.getResult()).getFullDocumentFrontImage() != null) {
            this.getHighSpeedVideoSizes.setProcessedImage(((com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer.Result) this.getHighSpeedVideoSizesFor.getResult()).getFullDocumentFrontImage().convertToBitmap());
        }
        com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.CardRotation cardRotation = ((com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer.Result) this.getHighSpeedVideoSizesFor.getResult()).getFrontImageAnalysisResult().getCardRotation();
        if (((com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer.Result) this.getHighSpeedVideoSizesFor.getResult()).getFrontCameraFrame() != null && cardRotation != null) {
            this.getHighSpeedVideoFpsRangesFor = com.daon.dmds.utils.MBUtils.rotateAndSetUnprocessedImage(cardRotation, this.getHighSpeedVideoSizes, ((com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer.Result) this.getHighSpeedVideoSizesFor.getResult()).getFrontCameraFrame(), com.daon.dmds.models.DocumentSide.FIRST);
        }
        this.getHighSpeedVideoSizes.setRecognitionMode(com.daon.dmds.utils.MBUtils.mapRecognitionMode(((com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer.Result) this.getHighSpeedVideoSizesFor.getResult()).getRecognitionMode()));
        return this.getHighSpeedVideoSizes;
    }

    @Override // com.daon.dmds.recognizers.DocumentRecognizer
    public com.microblink.blinkid.entities.recognizers.RecognizerBundle buildRecognizerBundle(com.daon.dmds.models.DMDSOptions dMDSOptions) {
        this.getInputFormats = dMDSOptions;
        com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer blinkIdMultiSideRecognizer = new com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer();
        this.getHighSpeedVideoSizesFor = blinkIdMultiSideRecognizer;
        blinkIdMultiSideRecognizer.setFullDocumentImageDpi(dMDSOptions.getFullDocumentImageDpi());
        this.getHighSpeedVideoSizesFor.setAllowUnverifiedMrzResults(dMDSOptions.isAllowUnverifiedMrzResults());
        this.getHighSpeedVideoSizesFor.setSaveCameraFrames(true);
        this.getHighSpeedVideoSizesFor.setPaddingEdge(dMDSOptions.getPaddingEdge() + com.daon.dmds.utils.DMDSDocumentUtils.getMaxExtensionValue(dMDSOptions.getImageExtensionFactors()).floatValue());
        this.getHighSpeedVideoSizesFor.setCombineFrameResults(!dMDSOptions.isSingleFrameMode());
        this.getHighSpeedVideoSizesFor.setBlurStrictnessLevel(com.daon.dmds.models.DMDSStrictnessLevel.toStrictnessLevel(dMDSOptions.getBlurStrictnessLevel()));
        this.getHighSpeedVideoSizesFor.setGlareStrictnessLevel(com.daon.dmds.models.DMDSStrictnessLevel.toStrictnessLevel(dMDSOptions.getGlareStrictnessLevel()));
        this.getHighSpeedVideoSizesFor.setBarcodeScanningStartedCallback(new com.microblink.blinkid.entities.recognizers.blinkid.generic.BarcodeScanningStartedCallback() { // from class: com.daon.dmds.recognizers.documents.BlinkIDCombinedDocument.1
            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.microblink.blinkid.entities.recognizers.blinkid.generic.BarcodeScanningStartedCallback
            public void onBarcodeScanningStarted() {
                if (com.daon.dmds.recognizers.documents.BlinkIDCombinedDocument.this.Camera2StreamConfigurationMap != null) {
                    com.daon.dmds.recognizers.documents.BlinkIDCombinedDocument.this.Camera2StreamConfigurationMap.onBarcodeScanningStarted();
                }
            }

            @Override // android.os.Parcelable
            public void writeToParcel(android.os.Parcel parcel, int i) {
            }
        });
        this.getHighSpeedVideoSizesFor.setClassifierCallback(new com.microblink.blinkid.entities.recognizers.classifier.ClassifierCallback() { // from class: com.daon.dmds.recognizers.documents.BlinkIDCombinedDocument.2
            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.microblink.blinkid.entities.recognizers.classifier.ClassifierCallback
            public void onDocumentSupportStatus(boolean z) {
                com.daon.dmds.utils.DobsLogUtils.logDebug(com.daon.dmds.recognizers.documents.BlinkIDCombinedDocument.getHighSpeedVideoFpsRanges, "onDocumentSupportStatus: ".concat(java.lang.String.valueOf(z)));
            }

            @Override // android.os.Parcelable
            public void writeToParcel(android.os.Parcel parcel, int i) {
            }
        });
        if (dMDSOptions.isEnableAnonymization()) {
            this.getHighSpeedVideoSizesFor.setAnonymizationMode(com.microblink.blinkid.entities.recognizers.blinkid.generic.AnonymizationMode.FullResult);
        } else {
            this.getHighSpeedVideoSizesFor.setAnonymizationMode(com.microblink.blinkid.entities.recognizers.blinkid.generic.AnonymizationMode.None);
        }
        this.getHighSpeedVideoSizesFor.setRecognitionModeFilter(new com.microblink.blinkid.entities.recognizers.blinkid.generic.RecognitionModeFilter(dMDSOptions.isRequireMrzIdRecognition(), dMDSOptions.isRequireMrzVisaRecognition(), dMDSOptions.isRequireMrzPassportRecognition(), dMDSOptions.isRequirePhotoIdRecognition(), dMDSOptions.isRequireBarcodeIdRecognition(), dMDSOptions.isRequireFullRecognition()));
        com.daon.dmds.utils.MBUtils.enableAllImages(dMDSOptions, this.getHighSpeedVideoSizesFor);
        return new com.microblink.blinkid.entities.recognizers.RecognizerBundle(this.getHighSpeedVideoSizesFor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.daon.dmds.recognizers.DocumentRecognizer
    public com.daon.dmds.models.ResponseData buildResponseData() {
        com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer.Result result = (com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer.Result) this.getHighSpeedVideoSizesFor.getResult();
        if (result.getResultState() != com.microblink.blinkid.entities.recognizers.Recognizer.Result.State.Valid) {
            return null;
        }
        this.getHighSpeedVideoSizes = new com.daon.dmds.models.DMDSDocument();
        this.getHighSpeedVideoSizes.setRecognitionMode(com.daon.dmds.utils.MBUtils.mapRecognitionMode(result.getRecognitionMode()));
        this.getHighSpeedVideoSizes.setDocumentType(com.daon.dmds.utils.DMDSDocumentUtils.extractDocumentType(this.getInputFormats.getDocumentTypes()).name());
        if (((com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer.Result) this.getHighSpeedVideoSizesFor.getResult()).getFullDocumentFrontImage() != null) {
            this.getHighSpeedVideoSizes.setProcessedImage(((com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer.Result) this.getHighSpeedVideoSizesFor.getResult()).getFullDocumentFrontImage().convertToBitmap());
        }
        if (result.getFullDocumentBackImage() != null) {
            this.getHighSpeedVideoSizes.setProcessedBackImage(result.getFullDocumentBackImage().convertToBitmap());
        }
        com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.CardRotation cardRotation = result.getFrontImageAnalysisResult().getCardRotation();
        com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.CardRotation cardRotation2 = result.getBackImageAnalysisResult().getCardRotation();
        if (result.getFrontCameraFrame() != null && cardRotation != null) {
            this.getHighSpeedVideoFpsRangesFor = com.daon.dmds.utils.MBUtils.rotateAndSetUnprocessedImage(cardRotation, this.getHighSpeedVideoSizes, result.getFrontCameraFrame(), com.daon.dmds.models.DocumentSide.FIRST);
        }
        if (result.getBackCameraFrame() != null && cardRotation2 != null) {
            this.getHighResolutionOutputSizeshNQ4ISI = com.daon.dmds.utils.MBUtils.rotateAndSetUnprocessedImage(cardRotation2, this.getHighSpeedVideoSizes, result.getBackCameraFrame(), com.daon.dmds.models.DocumentSide.SECOND);
        }
        if (((com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer.Result) this.getHighSpeedVideoSizesFor.getResult()).getBarcodeCameraFrame() != null) {
            this.getHighSpeedVideoSizes.setUnprocessedBarcodeImage(com.daon.dmds.utils.DMDSDocumentUtils.rotateImage(((com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer.Result) this.getHighSpeedVideoSizesFor.getResult()).getBarcodeCameraFrame().convertToBitmap(), com.daon.dmds.utils.MBUtils.orientation2Rotation(((com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer.Result) this.getHighSpeedVideoSizesFor.getResult()).getBarcodeCameraFrame().getImageOrientation())));
        }
        com.microblink.blinkid.image.Image signatureImage = result.getSignatureImage();
        if (signatureImage != null) {
            this.getHighSpeedVideoSizes.setSignatureImage(signatureImage.convertToBitmap());
        }
        java.util.Map<java.lang.String, java.lang.String> extractResults = com.daon.dmds.utils.BlinkIdExtractor.extractResults(result);
        if (extractResults != null) {
            this.getHighSpeedVideoSizes.setTextExtracted(extractResults);
        }
        java.util.Map<java.lang.String, java.lang.String> extractVisualData = com.daon.dmds.utils.BlinkIdExtractor.extractVisualData(result.getFrontVizResult());
        if (extractVisualData != null) {
            this.getHighSpeedVideoSizes.setFrontVisualResult(extractVisualData);
        }
        java.util.Map<java.lang.String, java.lang.String> extractVisualData2 = com.daon.dmds.utils.BlinkIdExtractor.extractVisualData(result.getBackVizResult());
        if (extractVisualData2 != null) {
            this.getHighSpeedVideoSizes.setBackVisualResult(extractVisualData2);
        }
        java.util.Map<java.lang.String, java.lang.String> extractMrzData = com.daon.dmds.utils.BlinkIdExtractor.extractMrzData(result.getMrzResult());
        if (extractMrzData != null) {
            this.getHighSpeedVideoSizes.setMrzResult(extractMrzData);
        }
        java.util.Map<java.lang.String, java.lang.String> extractBarcodeData = com.daon.dmds.utils.BlinkIdExtractor.extractBarcodeData(result.getBarcodeResult());
        if (extractBarcodeData != null) {
            this.getHighSpeedVideoSizes.setBarcodeResult(extractBarcodeData);
        }
        com.daon.dmds.models.DMDSResult dMDSResult = new com.daon.dmds.models.DMDSResult();
        dMDSResult.setDocument(this.getHighSpeedVideoSizes);
        return new com.daon.dmds.models.ResponseData(dMDSResult, result.getFrontCameraFrame());
    }

    public com.daon.dmds.models.DMDSDocumentRotation getDocumentRotation() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public com.daon.dmds.models.DMDSDocumentRotation getDocumentRotationBack() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.daon.dmds.recognizers.FaceExtractor
    public android.graphics.Bitmap getFaceFromRecogniser() {
        if (((com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer.Result) this.getHighSpeedVideoSizesFor.getResult()).getFaceImage() != null) {
            return ((com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer.Result) this.getHighSpeedVideoSizesFor.getResult()).getFaceImage().convertToBitmap();
        }
        return null;
    }

    @Override // com.daon.dmds.recognizers.IIdDocument
    public void registerBarcodeScanCallback(com.daon.dmds.recognizers.IBarcodeScan iBarcodeScan) {
        this.Camera2StreamConfigurationMap = iBarcodeScan;
    }
}
