package com.daon.dmds.recognizers.documents;

/* loaded from: classes7.dex */
public class BlinkIDDocument implements com.daon.dmds.recognizers.DocumentRecognizer, com.daon.dmds.recognizers.IIdDocument, com.daon.dmds.recognizers.FaceExtractor, com.daon.dmds.recognizers.QualityAssessment {
    private static final java.lang.String getHighSpeedVideoSizes = "BlinkIDDocument";
    private com.daon.dmds.recognizers.IBarcodeScan Camera2StreamConfigurationMap;
    private com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdSingleSideRecognizer getHighResolutionOutputSizeshNQ4ISI;
    private com.daon.dmds.models.DMDSOptions getHighSpeedVideoFpsRanges;
    private com.daon.dmds.models.DMDSDocumentRotation getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.daon.dmds.recognizers.QualityAssessment
    public com.daon.dmds.models.DMDSDocumentDetectionIssues assessFrameQuality() {
        com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.ImageAnalysisResult imageAnalysisResult = ((com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdSingleSideRecognizer.Result) this.getHighResolutionOutputSizeshNQ4ISI.getResult()).getImageAnalysisResult();
        boolean isFaceMissingFromDocumentImage = com.daon.dmds.utils.DMDSDocumentUtils.isFaceMissingFromDocumentImage(((com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdSingleSideRecognizer.Result) this.getHighResolutionOutputSizeshNQ4ISI.getResult()).getAdditionalProcessingInfo());
        java.lang.String str = getHighSpeedVideoSizes;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Glare: ");
        sb.append(imageAnalysisResult.isGlareDetected());
        com.daon.dmds.utils.DobsLogUtils.logDebug(str, sb.toString());
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Blur: ");
        sb2.append(imageAnalysisResult.isBlurDetected());
        com.daon.dmds.utils.DobsLogUtils.logDebug(str, sb2.toString());
        com.daon.dmds.utils.DobsLogUtils.logDebug(str, "Face: ".concat(java.lang.String.valueOf(isFaceMissingFromDocumentImage)));
        com.daon.dmds.utils.DobsLogUtils.logDebug(str, "----------------------");
        com.daon.dmds.models.DMDSDocumentDetectionIssues dMDSDocumentDetectionIssues = new com.daon.dmds.models.DMDSDocumentDetectionIssues();
        dMDSDocumentDetectionIssues.setBlurDetected(imageAnalysisResult.isBlurDetected());
        dMDSDocumentDetectionIssues.setGlareDetected(imageAnalysisResult.isGlareDetected());
        dMDSDocumentDetectionIssues.setFaceNotFound(this.getHighSpeedVideoFpsRanges.isFaceDetection() && isFaceMissingFromDocumentImage);
        return dMDSDocumentDetectionIssues;
    }

    @Override // com.daon.dmds.recognizers.DocumentRecognizer
    public com.microblink.blinkid.entities.recognizers.RecognizerBundle buildRecognizerBundle(com.daon.dmds.models.DMDSOptions dMDSOptions) {
        this.getHighSpeedVideoFpsRanges = dMDSOptions;
        com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdSingleSideRecognizer blinkIdSingleSideRecognizer = new com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdSingleSideRecognizer();
        this.getHighResolutionOutputSizeshNQ4ISI = blinkIdSingleSideRecognizer;
        blinkIdSingleSideRecognizer.setFullDocumentImageDpi(dMDSOptions.getFullDocumentImageDpi());
        this.getHighResolutionOutputSizeshNQ4ISI.setAllowUnverifiedMrzResults(dMDSOptions.isAllowUnverifiedMrzResults());
        this.getHighResolutionOutputSizeshNQ4ISI.setSaveCameraFrames(true);
        this.getHighResolutionOutputSizeshNQ4ISI.setPaddingEdge(dMDSOptions.getPaddingEdge() + com.daon.dmds.utils.DMDSDocumentUtils.getMaxExtensionValue(dMDSOptions.getImageExtensionFactors()).floatValue());
        this.getHighResolutionOutputSizeshNQ4ISI.setCombineFrameResults(!dMDSOptions.isSingleFrameMode());
        this.getHighResolutionOutputSizeshNQ4ISI.setBlurStrictnessLevel(com.daon.dmds.models.DMDSStrictnessLevel.toStrictnessLevel(dMDSOptions.getBlurStrictnessLevel()));
        this.getHighResolutionOutputSizeshNQ4ISI.setGlareStrictnessLevel(com.daon.dmds.models.DMDSStrictnessLevel.toStrictnessLevel(dMDSOptions.getGlareStrictnessLevel()));
        this.getHighResolutionOutputSizeshNQ4ISI.setBarcodeScanningStartedCallback(new com.microblink.blinkid.entities.recognizers.blinkid.generic.BarcodeScanningStartedCallback() { // from class: com.daon.dmds.recognizers.documents.BlinkIDDocument.1
            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.microblink.blinkid.entities.recognizers.blinkid.generic.BarcodeScanningStartedCallback
            public void onBarcodeScanningStarted() {
                if (com.daon.dmds.recognizers.documents.BlinkIDDocument.this.Camera2StreamConfigurationMap != null) {
                    com.daon.dmds.recognizers.documents.BlinkIDDocument.this.Camera2StreamConfigurationMap.onBarcodeScanningStarted();
                }
            }

            @Override // android.os.Parcelable
            public void writeToParcel(android.os.Parcel parcel, int i) {
            }
        });
        this.getHighResolutionOutputSizeshNQ4ISI.setClassifierCallback(new com.microblink.blinkid.entities.recognizers.classifier.ClassifierCallback() { // from class: com.daon.dmds.recognizers.documents.BlinkIDDocument.2
            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.microblink.blinkid.entities.recognizers.classifier.ClassifierCallback
            public void onDocumentSupportStatus(boolean z) {
                com.daon.dmds.utils.DobsLogUtils.logDebug(com.daon.dmds.recognizers.documents.BlinkIDDocument.getHighSpeedVideoSizes, "onDocumentSupportStatus: ".concat(java.lang.String.valueOf(z)));
            }

            @Override // android.os.Parcelable
            public void writeToParcel(android.os.Parcel parcel, int i) {
            }
        });
        if (dMDSOptions.isEnableAnonymization()) {
            this.getHighResolutionOutputSizeshNQ4ISI.setAnonymizationMode(com.microblink.blinkid.entities.recognizers.blinkid.generic.AnonymizationMode.FullResult);
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI.setAnonymizationMode(com.microblink.blinkid.entities.recognizers.blinkid.generic.AnonymizationMode.None);
        }
        this.getHighResolutionOutputSizeshNQ4ISI.setRecognitionModeFilter(new com.microblink.blinkid.entities.recognizers.blinkid.generic.RecognitionModeFilter(dMDSOptions.isRequireMrzIdRecognition(), dMDSOptions.isRequireMrzVisaRecognition(), dMDSOptions.isRequireMrzPassportRecognition(), dMDSOptions.isRequirePhotoIdRecognition(), dMDSOptions.isRequireBarcodeIdRecognition(), dMDSOptions.isRequireFullRecognition()));
        com.daon.dmds.utils.MBUtils.enableAllImages(dMDSOptions, this.getHighResolutionOutputSizeshNQ4ISI);
        return new com.microblink.blinkid.entities.recognizers.RecognizerBundle(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.daon.dmds.recognizers.DocumentRecognizer
    public com.daon.dmds.models.ResponseData buildResponseData() {
        com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdSingleSideRecognizer.Result result = (com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdSingleSideRecognizer.Result) this.getHighResolutionOutputSizeshNQ4ISI.getResult();
        if (result.getResultState() != com.microblink.blinkid.entities.recognizers.Recognizer.Result.State.Valid) {
            return null;
        }
        com.daon.dmds.models.DMDSDocument dMDSDocument = new com.daon.dmds.models.DMDSDocument();
        dMDSDocument.setDocumentType(com.daon.dmds.utils.DMDSDocumentUtils.extractDocumentType(this.getHighSpeedVideoFpsRanges.getDocumentTypes()).name());
        dMDSDocument.setRecognitionMode(com.daon.dmds.utils.MBUtils.mapRecognitionMode(result.getRecognitionMode()));
        com.daon.dmds.utils.MBUtils.extractResultImages(result, dMDSDocument);
        com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.CardRotation cardRotation = result.getImageAnalysisResult().getCardRotation();
        if (result.getCameraFrame() != null && cardRotation != null) {
            this.getHighSpeedVideoFpsRangesFor = com.daon.dmds.utils.MBUtils.rotateAndSetUnprocessedImage(cardRotation, dMDSDocument, result.getCameraFrame(), com.daon.dmds.models.DocumentSide.FIRST);
        }
        if (result.getBarcodeCameraFrame() != null) {
            dMDSDocument.setUnprocessedBarcodeImage(com.daon.dmds.utils.DMDSDocumentUtils.rotateImage(result.getBarcodeCameraFrame().convertToBitmap(), com.daon.dmds.utils.MBUtils.orientation2Rotation(result.getBarcodeCameraFrame().getImageOrientation())));
        }
        java.util.Map<java.lang.String, java.lang.String> extractResults = com.daon.dmds.utils.BlinkIdExtractor.extractResults(result);
        if (extractResults != null) {
            dMDSDocument.setTextExtracted(extractResults);
        }
        java.util.Map<java.lang.String, java.lang.String> extractVisualData = com.daon.dmds.utils.BlinkIdExtractor.extractVisualData(result.getVizResult());
        if (extractVisualData != null) {
            dMDSDocument.setVisualResult(extractVisualData);
        }
        java.util.Map<java.lang.String, java.lang.String> extractMrzData = com.daon.dmds.utils.BlinkIdExtractor.extractMrzData(result.getMrzResult());
        if (extractMrzData != null) {
            dMDSDocument.setMrzResult(extractMrzData);
        }
        java.util.Map<java.lang.String, java.lang.String> extractBarcodeData = com.daon.dmds.utils.BlinkIdExtractor.extractBarcodeData(result.getBarcodeResult());
        if (extractBarcodeData != null) {
            dMDSDocument.setBarcodeResult(extractBarcodeData);
        }
        com.daon.dmds.models.DMDSResult dMDSResult = new com.daon.dmds.models.DMDSResult();
        dMDSResult.setDocument(dMDSDocument);
        return new com.daon.dmds.models.ResponseData(dMDSResult, result.getCameraFrame());
    }

    public com.daon.dmds.models.DMDSDocumentRotation getDocumentRotation() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.daon.dmds.recognizers.FaceExtractor
    public android.graphics.Bitmap getFaceFromRecogniser() {
        if (((com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdSingleSideRecognizer.Result) this.getHighResolutionOutputSizeshNQ4ISI.getResult()).getFaceImage() != null) {
            return ((com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdSingleSideRecognizer.Result) this.getHighResolutionOutputSizeshNQ4ISI.getResult()).getFaceImage().convertToBitmap();
        }
        return null;
    }

    @Override // com.daon.dmds.recognizers.IIdDocument
    public void registerBarcodeScanCallback(com.daon.dmds.recognizers.IBarcodeScan iBarcodeScan) {
        this.Camera2StreamConfigurationMap = iBarcodeScan;
    }
}
