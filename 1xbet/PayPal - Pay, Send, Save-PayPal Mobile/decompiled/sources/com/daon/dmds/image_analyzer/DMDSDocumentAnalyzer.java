package com.daon.dmds.image_analyzer;

/* loaded from: classes7.dex */
public class DMDSDocumentAnalyzer {
    private static final java.lang.String Camera2StreamConfigurationMap = "DMDSDocumentAnalyzer";
    private static com.daon.dmds.image_analyzer.DMDSDocumentAnalyzer getHighSpeedVideoFpsRangesFor;
    com.daon.dmds.managers.DMDSDefaultScanListener getHighResolutionOutputSizeshNQ4ISI;
    private android.graphics.Bitmap getHighSpeedVideoFpsRanges;
    private com.daon.dmds.utils.face.FaceFinder getHighSpeedVideoSizesFor;
    private com.daon.dmds.models.ResponseData getInputSizeshNQ4ISI;
    private com.daon.dmds.recognizers.DocumentRecognizer getOutputFormats;
    private com.microblink.blinkid.directApi.RecognizerRunner getOutputMinFrameDuration;
    private com.daon.dmds.models.DMDSOptions getOutputSizeshNQ4ISI;
    private java.lang.ref.WeakReference<android.content.Context> getOutputStallDuration;
    private final android.os.Handler getOutputMinFrameDurationlomOqCM = new android.os.Handler(android.os.Looper.getMainLooper());
    boolean getHighSpeedVideoSizes = false;
    private boolean getOutputSizes = false;
    private boolean getInputFormats = false;

    private void Camera2StreamConfigurationMap(com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle) {
        com.microblink.blinkid.directApi.RecognizerRunner.getSingletonInstance().recognizeBitmapWithRecognizers(this.getHighSpeedVideoFpsRanges, com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_LANDSCAPE_RIGHT, new com.microblink.blinkid.view.recognition.ScanResultListener() { // from class: com.daon.dmds.image_analyzer.DMDSDocumentAnalyzer.1
            @Override // com.microblink.blinkid.view.recognition.ScanResultListener
            public void onScanningDone(com.microblink.blinkid.recognition.RecognitionSuccessType recognitionSuccessType) {
                com.daon.dmds.image_analyzer.DMDSDocumentAnalyzer.getHighSpeedVideoFpsRanges(com.daon.dmds.image_analyzer.DMDSDocumentAnalyzer.this);
            }

            @Override // com.microblink.blinkid.view.recognition.ScanResultListener
            public void onUnrecoverableError(java.lang.Throwable th) {
            }
        }, recognizerBundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getHighSpeedVideoSizes() {
        com.daon.dmds.models.DMDSResult result = this.getInputSizeshNQ4ISI.getResult();
        if (result != null) {
            com.daon.dmds.utils.DMDSDocumentUtils.formatUnprocessedImage(result, this.getInputSizeshNQ4ISI.getImageOrientation());
            com.daon.dmds.utils.DMDSDocumentUtils.padProcessedBitmap(result, this.getOutputSizeshNQ4ISI);
            result.getDocument().setDocumentCaptureType(com.daon.dmds.models.DMDSDocumentCaptureType.DMDSDocumentCaptureTypeUnknown);
        }
        getHighResolutionOutputSizeshNQ4ISI(this.getInputSizeshNQ4ISI.getResult());
    }

    public static com.daon.dmds.image_analyzer.DMDSDocumentAnalyzer getInstance() {
        if (getHighSpeedVideoFpsRangesFor == null) {
            getHighSpeedVideoFpsRangesFor = new com.daon.dmds.image_analyzer.DMDSDocumentAnalyzer();
        }
        return getHighSpeedVideoFpsRangesFor;
    }

    public void init(com.daon.dmds.models.DMDSOptions dMDSOptions, android.content.Context context, com.daon.dmds.managers.DMDSDefaultScanListener dMDSDefaultScanListener) throws java.lang.IllegalArgumentException {
        if (android.text.TextUtils.isEmpty(dMDSOptions.getLicenseKey())) {
            throw new java.lang.IllegalArgumentException("Invalid licence key");
        }
        if (context == null) {
            throw new java.lang.IllegalArgumentException("Invalid context object");
        }
        if (dMDSDefaultScanListener == null) {
            throw new java.lang.IllegalArgumentException("Invalid scan listener");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = dMDSDefaultScanListener;
        if (this.getHighSpeedVideoSizes) {
            return;
        }
        this.getOutputStallDuration = new java.lang.ref.WeakReference<>(context);
        if (!com.daon.dmds.utils.MBUtils.setupLicense(dMDSOptions.getLicenseKey(), context)) {
            com.daon.dmds.utils.DobsLogUtils.logError(Camera2StreamConfigurationMap, "Invalid licence key");
            this.getHighResolutionOutputSizeshNQ4ISI.documentScannedFailed(Camera2StreamConfigurationMap(com.daon.dmds.models.DMDSErrorCode.DMDSErrorCodeLicenseNotValid), null);
            return;
        }
        if (this.getOutputMinFrameDuration == null) {
            this.getOutputMinFrameDuration = com.microblink.blinkid.directApi.RecognizerRunner.getSingletonInstance();
            this.getOutputMinFrameDuration.initialize(context, com.daon.dmds.recognizers.DMDSDocumentFactory.getDocument(com.daon.dmds.models.DocTypeEnum.IdDocument).buildRecognizerBundle(new com.daon.dmds.models.DMDSOptions()), new com.microblink.blinkid.directApi.DirectApiErrorListener() { // from class: com.daon.dmds.image_analyzer.DMDSDocumentAnalyzer$$ExternalSyntheticLambda0
                @Override // com.microblink.blinkid.directApi.DirectApiErrorListener
                public final void onRecognizerError(java.lang.Throwable th) {
                    com.daon.dmds.image_analyzer.DMDSDocumentAnalyzer dMDSDocumentAnalyzer = com.daon.dmds.image_analyzer.DMDSDocumentAnalyzer.this;
                    com.daon.dmds.utils.DobsLogUtils.getStackTrace(th);
                    dMDSDocumentAnalyzer.getHighResolutionOutputSizeshNQ4ISI.documentScannedFailed(dMDSDocumentAnalyzer.Camera2StreamConfigurationMap(com.daon.dmds.models.DMDSErrorCode.DMDSErrorCodeUnknownInitialisationError), null);
                    dMDSDocumentAnalyzer.getHighSpeedVideoSizes = false;
                }
            });
        }
        this.getHighSpeedVideoSizes = true;
    }

    public boolean scan(android.graphics.Bitmap bitmap, com.daon.dmds.models.DMDSOptions dMDSOptions) {
        if (!this.getHighSpeedVideoSizes) {
            com.daon.dmds.managers.DMDSDefaultScanListener dMDSDefaultScanListener = this.getHighResolutionOutputSizeshNQ4ISI;
            com.daon.dmds.models.DMDSErrorCode dMDSErrorCode = com.daon.dmds.models.DMDSErrorCode.DMDSErrorCodeUnknownInitialisationError;
            android.content.Context context = this.getOutputStallDuration.get();
            dMDSDefaultScanListener.documentScannedFailed(context != null ? com.daon.dmds.models.DMDSError.errorForCode(context, dMDSErrorCode) : new com.daon.dmds.models.DMDSError("DMDSDocumentAnalyzer not initialised", dMDSErrorCode), null);
            return false;
        }
        com.daon.dmds.models.DMDSError validateOptions = com.daon.dmds.utils.DMDSValidator.validateOptions(dMDSOptions, this.getOutputStallDuration.get());
        if (validateOptions != null) {
            getHighSpeedVideoFpsRangesFor(validateOptions, null);
            return false;
        }
        if (!com.daon.dmds.utils.DMDSValidator.validateDependencies(dMDSOptions)) {
            com.daon.dmds.managers.DMDSDefaultScanListener dMDSDefaultScanListener2 = this.getHighResolutionOutputSizeshNQ4ISI;
            com.daon.dmds.models.DMDSErrorCode dMDSErrorCode2 = com.daon.dmds.models.DMDSErrorCode.DMDSErrorCodeUnknownInitialisationError;
            android.content.Context context2 = this.getOutputStallDuration.get();
            dMDSDefaultScanListener2.documentScannedFailed(context2 != null ? com.daon.dmds.models.DMDSError.errorForCode(context2, dMDSErrorCode2) : new com.daon.dmds.models.DMDSError("Missing SDK dependencies", dMDSErrorCode2), null);
            return false;
        }
        if (this.getOutputSizes) {
            com.daon.dmds.utils.DobsLogUtils.logError(Camera2StreamConfigurationMap, "Ignore scan due to active one");
            return false;
        }
        com.daon.dmds.models.DMDSOptions dMDSOptions2 = new com.daon.dmds.models.DMDSOptions(dMDSOptions);
        this.getOutputSizeshNQ4ISI = dMDSOptions2;
        com.daon.dmds.recognizers.DocumentRecognizer document = com.daon.dmds.recognizers.DMDSDocumentFactory.getDocument(dMDSOptions2.getDocumentTypes());
        this.getOutputFormats = document;
        try {
            com.microblink.blinkid.entities.recognizers.RecognizerBundle buildRecognizerBundle = document.buildRecognizerBundle(this.getOutputSizeshNQ4ISI);
            this.getHighSpeedVideoFpsRanges = bitmap;
            this.getOutputSizes = true;
            Camera2StreamConfigurationMap(buildRecognizerBundle);
            return true;
        } catch (com.microblink.blinkid.licence.exception.InvalidLicenceKeyException | java.lang.UnsatisfiedLinkError e) {
            com.daon.dmds.utils.DobsLogUtils.getStackTrace(e);
            getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap(com.daon.dmds.models.DMDSErrorCode.DMDSErrorCodeDocumentNotRecognized), null);
            return false;
        }
    }

    public void terminate() {
        this.getHighSpeedVideoSizes = false;
        this.getOutputMinFrameDuration.terminate();
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        com.daon.dmds.utils.face.FaceFinder faceFinder = this.getHighSpeedVideoSizesFor;
        if (faceFinder != null) {
            faceFinder.clear();
            this.getHighSpeedVideoSizesFor = null;
        }
    }

    public void scan(android.graphics.Bitmap bitmap, com.daon.dmds.models.DMDSOptions dMDSOptions, com.daon.dmds.recognizers.DocumentRecognizer documentRecognizer) {
        com.daon.dmds.models.DMDSError dMDSError;
        com.daon.dmds.models.DMDSError dMDSError2;
        com.daon.dmds.models.DMDSError dMDSError3;
        if (!this.getHighSpeedVideoSizes) {
            com.daon.dmds.managers.DMDSDefaultScanListener dMDSDefaultScanListener = this.getHighResolutionOutputSizeshNQ4ISI;
            com.daon.dmds.models.DMDSErrorCode dMDSErrorCode = com.daon.dmds.models.DMDSErrorCode.DMDSErrorCodeUnknownInitialisationError;
            android.content.Context context = this.getOutputStallDuration.get();
            if (context != null) {
                dMDSError3 = com.daon.dmds.models.DMDSError.errorForCode(context, dMDSErrorCode);
            } else {
                dMDSError3 = new com.daon.dmds.models.DMDSError("DMDSDocumentAnalyzer not initialised", dMDSErrorCode);
            }
            dMDSDefaultScanListener.documentScannedFailed(dMDSError3, null);
            return;
        }
        com.daon.dmds.models.DMDSError validateOptions = com.daon.dmds.utils.DMDSValidator.validateOptions(dMDSOptions, this.getOutputStallDuration.get());
        if (validateOptions != null) {
            getHighSpeedVideoFpsRangesFor(validateOptions, null);
            return;
        }
        if (!com.daon.dmds.utils.DMDSValidator.validateDependencies(dMDSOptions)) {
            com.daon.dmds.models.DMDSErrorCode dMDSErrorCode2 = com.daon.dmds.models.DMDSErrorCode.DMDSErrorCodeUnknownInitialisationError;
            android.content.Context context2 = this.getOutputStallDuration.get();
            if (context2 != null) {
                dMDSError2 = com.daon.dmds.models.DMDSError.errorForCode(context2, dMDSErrorCode2);
            } else {
                dMDSError2 = new com.daon.dmds.models.DMDSError("Missing SDK dependencies", dMDSErrorCode2);
            }
            getHighSpeedVideoFpsRangesFor(dMDSError2, null);
            return;
        }
        java.lang.String validateLicense = com.daon.dmds.utils.DMDSValidator.validateLicense(dMDSOptions, this.getOutputStallDuration.get());
        if (!validateLicense.isEmpty()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(validateLicense);
            sb.append(" invalid license");
            java.lang.String obj = sb.toString();
            com.daon.dmds.models.DMDSErrorCode dMDSErrorCode3 = com.daon.dmds.models.DMDSErrorCode.DMDSErrorCodeLicenseNotValid;
            android.content.Context context3 = this.getOutputStallDuration.get();
            if (context3 != null) {
                dMDSError = com.daon.dmds.models.DMDSError.errorForCode(context3, dMDSErrorCode3);
            } else {
                dMDSError = new com.daon.dmds.models.DMDSError(obj, dMDSErrorCode3);
            }
            getHighSpeedVideoFpsRangesFor(dMDSError, null);
            return;
        }
        if (this.getOutputSizes) {
            com.daon.dmds.utils.DobsLogUtils.logError(Camera2StreamConfigurationMap, "Ignore scan due to active one");
            return;
        }
        this.getOutputSizes = true;
        this.getHighSpeedVideoFpsRanges = bitmap;
        com.daon.dmds.models.DMDSOptions dMDSOptions2 = new com.daon.dmds.models.DMDSOptions(dMDSOptions);
        this.getOutputSizeshNQ4ISI = dMDSOptions2;
        this.getOutputFormats = documentRecognizer;
        Camera2StreamConfigurationMap(documentRecognizer.buildRecognizerBundle(dMDSOptions2));
    }

    static /* synthetic */ void getHighSpeedVideoFpsRanges(com.daon.dmds.image_analyzer.DMDSDocumentAnalyzer dMDSDocumentAnalyzer) {
        android.graphics.Bitmap unprocessedImage;
        com.daon.dmds.models.DMDSError dMDSError;
        com.daon.dmds.models.DMDSError dMDSError2;
        com.daon.dmds.models.ResponseData buildResponseData = dMDSDocumentAnalyzer.getOutputFormats.buildResponseData();
        if (buildResponseData == null) {
            com.daon.dmds.models.DMDSErrorCode dMDSErrorCode = com.daon.dmds.models.DMDSErrorCode.DMDSErrorCodeDocumentNotRecognized;
            android.content.Context context = dMDSDocumentAnalyzer.getOutputStallDuration.get();
            if (context != null) {
                dMDSError2 = com.daon.dmds.models.DMDSError.errorForCode(context, dMDSErrorCode);
            } else {
                dMDSError2 = new com.daon.dmds.models.DMDSError("Scan failed", dMDSErrorCode);
            }
            dMDSDocumentAnalyzer.getHighSpeedVideoFpsRangesFor(dMDSError2, null);
            dMDSDocumentAnalyzer.getInputSizeshNQ4ISI = null;
            dMDSDocumentAnalyzer.getOutputSizes = false;
            dMDSDocumentAnalyzer.getInputFormats = false;
            dMDSDocumentAnalyzer.getHighSpeedVideoFpsRanges = null;
            return;
        }
        if (!dMDSDocumentAnalyzer.getInputFormats) {
            dMDSDocumentAnalyzer.getInputFormats = true;
            dMDSDocumentAnalyzer.getInputSizeshNQ4ISI = buildResponseData;
            com.daon.dmds.models.DocTypeEnum isSecondRecognitionRequired = com.daon.dmds.utils.DMDSDocumentUtils.isSecondRecognitionRequired(dMDSDocumentAnalyzer.getOutputSizeshNQ4ISI);
            if (isSecondRecognitionRequired != com.daon.dmds.models.DocTypeEnum.None) {
                dMDSDocumentAnalyzer.getOutputSizeshNQ4ISI.getUiOptions().setAllowManualCroppingEdgeDetection(dMDSDocumentAnalyzer.getOutputSizeshNQ4ISI.getUiOptions().isAllowManualCroppingDocumentRecognition());
                com.daon.dmds.recognizers.DocumentRecognizer document = com.daon.dmds.recognizers.DMDSDocumentFactory.getDocument(isSecondRecognitionRequired);
                dMDSDocumentAnalyzer.getOutputFormats = document;
                dMDSDocumentAnalyzer.Camera2StreamConfigurationMap(document.buildRecognizerBundle(dMDSDocumentAnalyzer.getOutputSizeshNQ4ISI));
                return;
            }
        } else {
            dMDSDocumentAnalyzer.getInputSizeshNQ4ISI = com.daon.dmds.utils.DMDSDocumentUtils.processSecondStageResults(dMDSDocumentAnalyzer.getInputSizeshNQ4ISI, buildResponseData);
        }
        if (dMDSDocumentAnalyzer.getOutputSizeshNQ4ISI.isFaceDetection()) {
            if (dMDSDocumentAnalyzer.getInputSizeshNQ4ISI.getResult().getDocument().getProcessedImage() != null) {
                unprocessedImage = dMDSDocumentAnalyzer.getInputSizeshNQ4ISI.getResult().getDocument().getProcessedImage();
            } else {
                unprocessedImage = dMDSDocumentAnalyzer.getInputSizeshNQ4ISI.getResult().getDocument().getUnprocessedImage();
            }
            java.lang.String str = dMDSDocumentAnalyzer.getInputSizeshNQ4ISI.getResult().getDocument().getTextExtracted().get(com.daon.dmds.recognizers.IDMDSResultCreatorFields.ClassTypeName);
            try {
                dMDSDocumentAnalyzer.getHighSpeedVideoSizesFor = new com.daon.dmds.utils.face.FaceFinderImpl(dMDSDocumentAnalyzer.getOutputStallDuration.get(), dMDSDocumentAnalyzer.getOutputSizeshNQ4ISI.getFaceLicenceKey());
            } catch (java.lang.Exception e) {
                java.lang.String localizedMessage = e.getLocalizedMessage();
                com.daon.dmds.models.DMDSErrorCode dMDSErrorCode2 = com.daon.dmds.models.DMDSErrorCode.DMDSErrorCodeLicenseNotValid;
                android.content.Context context2 = dMDSDocumentAnalyzer.getOutputStallDuration.get();
                if (context2 != null) {
                    dMDSError = com.daon.dmds.models.DMDSError.errorForCode(context2, dMDSErrorCode2);
                } else {
                    dMDSError = new com.daon.dmds.models.DMDSError(localizedMessage, dMDSErrorCode2);
                }
                dMDSDocumentAnalyzer.getHighSpeedVideoFpsRangesFor(dMDSError, null);
            }
            dMDSDocumentAnalyzer.getHighSpeedVideoSizesFor.findBestFace(unprocessedImage, dMDSDocumentAnalyzer.getOutputSizeshNQ4ISI, str, new com.daon.dmds.utils.face.FaceResultListener() { // from class: com.daon.dmds.image_analyzer.DMDSDocumentAnalyzer.2
                @Override // com.daon.dmds.utils.face.FaceResultListener
                public void onFailure(com.daon.dmds.models.DMDSFaceQualityInfo dMDSFaceQualityInfo) {
                    com.daon.dmds.utils.DobsLogUtils.logError(com.daon.dmds.image_analyzer.DMDSDocumentAnalyzer.Camera2StreamConfigurationMap, "Fail to extract face");
                    com.daon.dmds.image_analyzer.DMDSDocumentAnalyzer dMDSDocumentAnalyzer2 = com.daon.dmds.image_analyzer.DMDSDocumentAnalyzer.this;
                    dMDSDocumentAnalyzer2.getHighSpeedVideoFpsRangesFor(com.daon.dmds.models.DMDSError.errorForCode((android.content.Context) dMDSDocumentAnalyzer2.getOutputStallDuration.get(), com.daon.dmds.models.DMDSErrorCode.DMDSErrorCodeFaceNotFound), com.daon.dmds.image_analyzer.DMDSDocumentAnalyzer.this.getInputSizeshNQ4ISI.getResult());
                }

                @Override // com.daon.dmds.utils.face.FaceResultListener
                public void onSuccess(com.daon.dmds.models.DMDSFace dMDSFace) {
                    if (com.daon.dmds.utils.DMDSDocumentUtils.isDocTypeFromEdgeGroup(com.daon.dmds.utils.DMDSDocumentUtils.extractDocumentType(com.daon.dmds.image_analyzer.DMDSDocumentAnalyzer.this.getOutputSizeshNQ4ISI.getDocumentTypes()).name()) && dMDSFace.getQualityData().getFaceRotation() != 0) {
                        com.daon.dmds.image_analyzer.DMDSDocumentAnalyzer.this.getInputSizeshNQ4ISI.getResult().getDocument().setProcessedImage(com.daon.dmds.utils.DMDSDocumentUtils.rotateImage(com.daon.dmds.image_analyzer.DMDSDocumentAnalyzer.this.getInputSizeshNQ4ISI.getResult().getDocument().getProcessedImage(), dMDSFace.getQualityData().getFaceRotation()));
                    }
                    com.daon.dmds.image_analyzer.DMDSDocumentAnalyzer.this.getInputSizeshNQ4ISI.getResult().setFace(dMDSFace);
                    com.daon.dmds.image_analyzer.DMDSDocumentAnalyzer.this.getHighSpeedVideoSizes();
                }
            });
            return;
        }
        dMDSDocumentAnalyzer.getHighSpeedVideoSizes();
    }

    final com.daon.dmds.models.DMDSError Camera2StreamConfigurationMap(com.daon.dmds.models.DMDSErrorCode dMDSErrorCode) {
        android.content.Context context = this.getOutputStallDuration.get();
        if (context != null) {
            return com.daon.dmds.models.DMDSError.errorForCode(context, dMDSErrorCode);
        }
        return new com.daon.dmds.models.DMDSError("Scan failed", dMDSErrorCode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getHighSpeedVideoFpsRangesFor(final com.daon.dmds.models.DMDSError dMDSError, final com.daon.dmds.models.DMDSResult dMDSResult) {
        this.getInputSizeshNQ4ISI = null;
        this.getOutputSizes = false;
        this.getInputFormats = false;
        this.getHighSpeedVideoFpsRanges = null;
        if (!com.daon.dmds.utils.DMDSDocumentUtils.isUiThread()) {
            this.getOutputMinFrameDurationlomOqCM.post(new java.lang.Runnable() { // from class: com.daon.dmds.image_analyzer.DMDSDocumentAnalyzer$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.daon.dmds.image_analyzer.DMDSDocumentAnalyzer dMDSDocumentAnalyzer = com.daon.dmds.image_analyzer.DMDSDocumentAnalyzer.this;
                    com.daon.dmds.models.DMDSError dMDSError2 = dMDSError;
                    com.daon.dmds.models.DMDSResult dMDSResult2 = dMDSResult;
                    com.daon.dmds.managers.DMDSDefaultScanListener dMDSDefaultScanListener = dMDSDocumentAnalyzer.getHighResolutionOutputSizeshNQ4ISI;
                    if (dMDSDefaultScanListener != null) {
                        dMDSDefaultScanListener.documentScannedFailed(dMDSError2, dMDSResult2);
                    }
                }
            });
            return;
        }
        com.daon.dmds.managers.DMDSDefaultScanListener dMDSDefaultScanListener = this.getHighResolutionOutputSizeshNQ4ISI;
        if (dMDSDefaultScanListener != null) {
            dMDSDefaultScanListener.documentScannedFailed(dMDSError, dMDSResult);
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI(final com.daon.dmds.models.DMDSResult dMDSResult) {
        this.getInputSizeshNQ4ISI = null;
        this.getOutputSizes = false;
        this.getInputFormats = false;
        this.getHighSpeedVideoFpsRanges = null;
        if (!com.daon.dmds.utils.DMDSDocumentUtils.isUiThread()) {
            this.getOutputMinFrameDurationlomOqCM.post(new java.lang.Runnable() { // from class: com.daon.dmds.image_analyzer.DMDSDocumentAnalyzer$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    com.daon.dmds.image_analyzer.DMDSDocumentAnalyzer dMDSDocumentAnalyzer = com.daon.dmds.image_analyzer.DMDSDocumentAnalyzer.this;
                    com.daon.dmds.models.DMDSResult dMDSResult2 = dMDSResult;
                    com.daon.dmds.managers.DMDSDefaultScanListener dMDSDefaultScanListener = dMDSDocumentAnalyzer.getHighResolutionOutputSizeshNQ4ISI;
                    if (dMDSDefaultScanListener != null) {
                        dMDSDefaultScanListener.documentScanned(dMDSResult2);
                    }
                }
            });
            return;
        }
        com.daon.dmds.managers.DMDSDefaultScanListener dMDSDefaultScanListener = this.getHighResolutionOutputSizeshNQ4ISI;
        if (dMDSDefaultScanListener != null) {
            dMDSDefaultScanListener.documentScanned(dMDSResult);
        }
    }
}
