package com.daon.dmds.recognizers.documents;

/* loaded from: classes7.dex */
public class IdBarcodeCombinedDocument implements com.daon.dmds.recognizers.DocumentRecognizer, com.daon.dmds.recognizers.IIdDocument, com.daon.dmds.recognizers.FaceExtractor {
    private com.microblink.blinkid.entities.recognizers.blinkid.idbarcode.IdBarcodeRecognizer Camera2StreamConfigurationMap;
    private com.microblink.blinkid.entities.recognizers.RecognizerBundle getHighResolutionOutputSizeshNQ4ISI;
    private com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdSingleSideRecognizer getHighSpeedVideoFpsRanges;
    private com.daon.dmds.models.DMDSOptions getHighSpeedVideoFpsRangesFor;
    private com.daon.dmds.recognizers.IBarcodeScan getHighSpeedVideoSizes;

    @Override // com.daon.dmds.recognizers.DocumentRecognizer
    public com.microblink.blinkid.entities.recognizers.RecognizerBundle buildRecognizerBundle(com.daon.dmds.models.DMDSOptions dMDSOptions) {
        this.getHighSpeedVideoFpsRangesFor = dMDSOptions;
        com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle = this.getHighResolutionOutputSizeshNQ4ISI;
        if (recognizerBundle != null) {
            return recognizerBundle;
        }
        com.microblink.blinkid.entities.recognizers.blinkid.idbarcode.IdBarcodeRecognizer idBarcodeRecognizer = new com.microblink.blinkid.entities.recognizers.blinkid.idbarcode.IdBarcodeRecognizer();
        this.Camera2StreamConfigurationMap = idBarcodeRecognizer;
        com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdSingleSideRecognizer blinkIdSingleSideRecognizer = new com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdSingleSideRecognizer();
        this.getHighSpeedVideoFpsRanges = blinkIdSingleSideRecognizer;
        blinkIdSingleSideRecognizer.setFullDocumentImageDpi(this.getHighSpeedVideoFpsRangesFor.getFullDocumentImageDpi());
        this.getHighSpeedVideoFpsRanges.setAllowUnverifiedMrzResults(this.getHighSpeedVideoFpsRangesFor.isAllowUnverifiedMrzResults());
        this.getHighSpeedVideoFpsRanges.setSaveCameraFrames(true);
        this.getHighSpeedVideoFpsRanges.setPaddingEdge(this.getHighSpeedVideoFpsRangesFor.getPaddingEdge());
        this.getHighSpeedVideoFpsRanges.setCombineFrameResults(!this.getHighSpeedVideoFpsRangesFor.isSingleFrameMode());
        this.getHighSpeedVideoFpsRanges.setBarcodeScanningStartedCallback(new com.microblink.blinkid.entities.recognizers.blinkid.generic.BarcodeScanningStartedCallback() { // from class: com.daon.dmds.recognizers.documents.IdBarcodeCombinedDocument.1
            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.microblink.blinkid.entities.recognizers.blinkid.generic.BarcodeScanningStartedCallback
            public void onBarcodeScanningStarted() {
                if (com.daon.dmds.recognizers.documents.IdBarcodeCombinedDocument.this.getHighSpeedVideoSizes != null) {
                    com.daon.dmds.recognizers.documents.IdBarcodeCombinedDocument.this.getHighSpeedVideoSizes.onBarcodeScanningStarted();
                }
            }

            @Override // android.os.Parcelable
            public void writeToParcel(android.os.Parcel parcel, int i) {
            }
        });
        if (this.getHighSpeedVideoFpsRangesFor.isEnableAnonymization()) {
            this.getHighSpeedVideoFpsRanges.setAnonymizationMode(com.microblink.blinkid.entities.recognizers.blinkid.generic.AnonymizationMode.FullResult);
        } else {
            this.getHighSpeedVideoFpsRanges.setAnonymizationMode(com.microblink.blinkid.entities.recognizers.blinkid.generic.AnonymizationMode.None);
        }
        this.getHighSpeedVideoFpsRanges.setRecognitionModeFilter(new com.microblink.blinkid.entities.recognizers.blinkid.generic.RecognitionModeFilter(this.getHighSpeedVideoFpsRangesFor.isRequireMrzIdRecognition(), this.getHighSpeedVideoFpsRangesFor.isRequireMrzPassportRecognition(), this.getHighSpeedVideoFpsRangesFor.isRequireMrzVisaRecognition(), this.getHighSpeedVideoFpsRangesFor.isRequirePhotoIdRecognition(), this.getHighSpeedVideoFpsRangesFor.isRequireBarcodeIdRecognition(), this.getHighSpeedVideoFpsRangesFor.isRequireFullRecognition()));
        com.daon.dmds.utils.MBUtils.enableAllImages(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges);
        com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle2 = new com.microblink.blinkid.entities.recognizers.RecognizerBundle(idBarcodeRecognizer, this.getHighSpeedVideoFpsRanges);
        this.getHighResolutionOutputSizeshNQ4ISI = recognizerBundle2;
        return recognizerBundle2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.daon.dmds.recognizers.DocumentRecognizer
    public com.daon.dmds.models.ResponseData buildResponseData() {
        com.microblink.blinkid.entities.recognizers.blinkid.idbarcode.IdBarcodeRecognizer.Result result = (com.microblink.blinkid.entities.recognizers.blinkid.idbarcode.IdBarcodeRecognizer.Result) this.Camera2StreamConfigurationMap.getResult();
        if (result.getResultState() == com.microblink.blinkid.entities.recognizers.Recognizer.Result.State.Valid) {
            com.daon.dmds.models.DMDSDocument dMDSDocument = new com.daon.dmds.models.DMDSDocument();
            dMDSDocument.setDocumentType(com.daon.dmds.models.DocTypeEnum.IdBarcodeDocument.name());
            dMDSDocument.setTextExtracted(com.daon.dmds.utils.BlinkIdExtractor.extractIdBarcodeResults(result));
            com.daon.dmds.models.DMDSResult dMDSResult = new com.daon.dmds.models.DMDSResult();
            dMDSResult.setDocument(dMDSDocument);
            return new com.daon.dmds.models.ResponseData(dMDSResult, null);
        }
        com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdSingleSideRecognizer.Result result2 = (com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdSingleSideRecognizer.Result) this.getHighSpeedVideoFpsRanges.getResult();
        if (result2.getResultState() != com.microblink.blinkid.entities.recognizers.Recognizer.Result.State.Valid) {
            return null;
        }
        com.daon.dmds.models.DMDSDocument dMDSDocument2 = new com.daon.dmds.models.DMDSDocument();
        dMDSDocument2.setDocumentType(com.daon.dmds.models.DocTypeEnum.IdDocument.name());
        dMDSDocument2.setRecognitionMode(com.daon.dmds.utils.MBUtils.mapRecognitionMode(result2.getRecognitionMode()));
        com.daon.dmds.utils.MBUtils.extractResultImages((com.microblink.blinkid.entities.recognizers.Recognizer.Result) this.getHighSpeedVideoFpsRanges.getResult(), dMDSDocument2);
        if (((com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdSingleSideRecognizer.Result) this.getHighSpeedVideoFpsRanges.getResult()).getBarcodeCameraFrame() != null) {
            dMDSDocument2.setUnprocessedBarcodeImage(com.daon.dmds.utils.DMDSDocumentUtils.rotateImage(((com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdSingleSideRecognizer.Result) this.getHighSpeedVideoFpsRanges.getResult()).getBarcodeCameraFrame().convertToBitmap(), com.daon.dmds.utils.MBUtils.orientation2Rotation(((com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdSingleSideRecognizer.Result) this.getHighSpeedVideoFpsRanges.getResult()).getBarcodeCameraFrame().getImageOrientation())));
        }
        java.util.Map<java.lang.String, java.lang.String> extractResults = com.daon.dmds.utils.BlinkIdExtractor.extractResults(result2);
        if (extractResults != null) {
            dMDSDocument2.setTextExtracted(extractResults);
        }
        java.util.Map<java.lang.String, java.lang.String> extractVisualData = com.daon.dmds.utils.BlinkIdExtractor.extractVisualData(result2.getVizResult());
        if (extractVisualData != null) {
            dMDSDocument2.setVisualResult(extractVisualData);
        }
        java.util.Map<java.lang.String, java.lang.String> extractMrzData = com.daon.dmds.utils.BlinkIdExtractor.extractMrzData(result2.getMrzResult());
        if (extractMrzData != null) {
            dMDSDocument2.setMrzResult(extractMrzData);
        }
        java.util.Map<java.lang.String, java.lang.String> extractBarcodeData = com.daon.dmds.utils.BlinkIdExtractor.extractBarcodeData(result2.getBarcodeResult());
        if (extractBarcodeData != null) {
            dMDSDocument2.setBarcodeResult(extractBarcodeData);
        }
        com.daon.dmds.models.DMDSResult dMDSResult2 = new com.daon.dmds.models.DMDSResult();
        dMDSResult2.setDocument(dMDSDocument2);
        return new com.daon.dmds.models.ResponseData(dMDSResult2, ((com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdSingleSideRecognizer.Result) this.getHighSpeedVideoFpsRanges.getResult()).getCameraFrame());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.daon.dmds.recognizers.FaceExtractor
    public android.graphics.Bitmap getFaceFromRecogniser() {
        if (((com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdSingleSideRecognizer.Result) this.getHighSpeedVideoFpsRanges.getResult()).getFaceImage() != null) {
            return ((com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdSingleSideRecognizer.Result) this.getHighSpeedVideoFpsRanges.getResult()).getFaceImage().convertToBitmap();
        }
        return null;
    }

    @Override // com.daon.dmds.recognizers.IIdDocument
    public void registerBarcodeScanCallback(com.daon.dmds.recognizers.IBarcodeScan iBarcodeScan) {
        this.getHighSpeedVideoSizes = iBarcodeScan;
    }
}
