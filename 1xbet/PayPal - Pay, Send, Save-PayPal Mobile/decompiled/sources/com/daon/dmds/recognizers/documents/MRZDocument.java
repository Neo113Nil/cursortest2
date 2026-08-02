package com.daon.dmds.recognizers.documents;

/* loaded from: classes7.dex */
public class MRZDocument implements com.daon.dmds.recognizers.DocumentRecognizer {
    private com.microblink.blinkid.entities.recognizers.RecognizerBundle Camera2StreamConfigurationMap;
    private com.daon.dmds.models.DMDSOptions getHighResolutionOutputSizeshNQ4ISI;
    private com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdRecognizer getHighSpeedVideoFpsRangesFor;
    private com.microblink.blinkid.entities.recognizers.successframe.SuccessFrameGrabberRecognizer getHighSpeedVideoSizes;

    @Override // com.daon.dmds.recognizers.DocumentRecognizer
    public com.microblink.blinkid.entities.recognizers.RecognizerBundle buildRecognizerBundle(com.daon.dmds.models.DMDSOptions dMDSOptions) {
        this.getHighResolutionOutputSizeshNQ4ISI = dMDSOptions;
        com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle = this.Camera2StreamConfigurationMap;
        if (recognizerBundle != null) {
            return recognizerBundle;
        }
        com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdRecognizer mrtdRecognizer = new com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdRecognizer();
        this.getHighSpeedVideoFpsRangesFor = mrtdRecognizer;
        mrtdRecognizer.setFullDocumentImageDpi(dMDSOptions.getFullDocumentImageDpi());
        this.getHighSpeedVideoFpsRangesFor.setAllowUnverifiedResults(dMDSOptions.isAllowUnverifiedMrzResults());
        com.daon.dmds.utils.MBUtils.enableAllImages(dMDSOptions, this.getHighSpeedVideoFpsRangesFor);
        com.microblink.blinkid.entities.recognizers.successframe.SuccessFrameGrabberRecognizer successFrameGrabberRecognizer = new com.microblink.blinkid.entities.recognizers.successframe.SuccessFrameGrabberRecognizer(this.getHighSpeedVideoFpsRangesFor);
        this.getHighSpeedVideoSizes = successFrameGrabberRecognizer;
        com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle2 = new com.microblink.blinkid.entities.recognizers.RecognizerBundle(successFrameGrabberRecognizer);
        this.Camera2StreamConfigurationMap = recognizerBundle2;
        return recognizerBundle2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.daon.dmds.recognizers.DocumentRecognizer
    public com.daon.dmds.models.ResponseData buildResponseData() {
        com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdRecognizer.Result result = (com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdRecognizer.Result) this.getHighSpeedVideoFpsRangesFor.getResult();
        if (result.getResultState() != com.microblink.blinkid.entities.recognizers.Recognizer.Result.State.Valid) {
            return null;
        }
        com.daon.dmds.models.DMDSDocument dMDSDocument = new com.daon.dmds.models.DMDSDocument();
        dMDSDocument.setDocumentType(com.daon.dmds.utils.DMDSDocumentUtils.extractDocumentType(this.getHighResolutionOutputSizeshNQ4ISI.getDocumentTypes()).name());
        com.daon.dmds.utils.MBUtils.extractResultImages((com.microblink.blinkid.entities.recognizers.Recognizer.Result) this.getHighSpeedVideoSizes.getResult(), dMDSDocument);
        java.util.Map<java.lang.String, java.lang.String> extractMrzData = com.daon.dmds.utils.BlinkIdExtractor.extractMrzData(result.getMrzResult());
        if (extractMrzData != null) {
            dMDSDocument.setMrzResult(extractMrzData);
        }
        com.daon.dmds.models.DMDSResult dMDSResult = new com.daon.dmds.models.DMDSResult();
        dMDSResult.setDocument(dMDSDocument);
        return new com.daon.dmds.models.ResponseData(dMDSResult, ((com.microblink.blinkid.entities.recognizers.successframe.SuccessFrameGrabberRecognizer.Result) this.getHighSpeedVideoSizes.getResult()).getSuccessFrame());
    }
}
