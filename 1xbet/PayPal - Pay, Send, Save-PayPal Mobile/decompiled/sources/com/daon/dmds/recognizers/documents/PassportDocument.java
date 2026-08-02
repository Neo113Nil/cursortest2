package com.daon.dmds.recognizers.documents;

/* loaded from: classes7.dex */
public class PassportDocument implements com.daon.dmds.recognizers.DocumentRecognizer {
    private com.microblink.blinkid.entities.recognizers.blinkid.passport.PassportRecognizer Camera2StreamConfigurationMap;
    private com.microblink.blinkid.entities.recognizers.successframe.SuccessFrameGrabberRecognizer getHighResolutionOutputSizeshNQ4ISI;
    private com.daon.dmds.models.DMDSOptions getHighSpeedVideoFpsRangesFor;
    private com.microblink.blinkid.entities.recognizers.RecognizerBundle getHighSpeedVideoSizes;

    @Override // com.daon.dmds.recognizers.DocumentRecognizer
    public com.microblink.blinkid.entities.recognizers.RecognizerBundle buildRecognizerBundle(com.daon.dmds.models.DMDSOptions dMDSOptions) {
        this.getHighSpeedVideoFpsRangesFor = dMDSOptions;
        com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle = this.getHighSpeedVideoSizes;
        if (recognizerBundle != null) {
            return recognizerBundle;
        }
        com.microblink.blinkid.entities.recognizers.blinkid.passport.PassportRecognizer passportRecognizer = new com.microblink.blinkid.entities.recognizers.blinkid.passport.PassportRecognizer();
        this.Camera2StreamConfigurationMap = passportRecognizer;
        passportRecognizer.setFullDocumentImageDpi(dMDSOptions.getFullDocumentImageDpi());
        this.Camera2StreamConfigurationMap.setAnonymizeNetherlandsMrz(dMDSOptions.isEnableAnonymization());
        com.daon.dmds.utils.MBUtils.enableAllImages(dMDSOptions, this.Camera2StreamConfigurationMap);
        com.microblink.blinkid.entities.recognizers.successframe.SuccessFrameGrabberRecognizer successFrameGrabberRecognizer = new com.microblink.blinkid.entities.recognizers.successframe.SuccessFrameGrabberRecognizer(this.Camera2StreamConfigurationMap);
        this.getHighResolutionOutputSizeshNQ4ISI = successFrameGrabberRecognizer;
        com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle2 = new com.microblink.blinkid.entities.recognizers.RecognizerBundle(successFrameGrabberRecognizer);
        this.getHighSpeedVideoSizes = recognizerBundle2;
        return recognizerBundle2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.daon.dmds.recognizers.DocumentRecognizer
    public com.daon.dmds.models.ResponseData buildResponseData() {
        com.microblink.blinkid.entities.recognizers.blinkid.passport.PassportRecognizer.Result result = (com.microblink.blinkid.entities.recognizers.blinkid.passport.PassportRecognizer.Result) this.Camera2StreamConfigurationMap.getResult();
        if (result.getResultState() != com.microblink.blinkid.entities.recognizers.Recognizer.Result.State.Valid) {
            return null;
        }
        com.daon.dmds.models.DMDSDocument dMDSDocument = new com.daon.dmds.models.DMDSDocument();
        dMDSDocument.setDocumentType(com.daon.dmds.utils.DMDSDocumentUtils.extractDocumentType(this.getHighSpeedVideoFpsRangesFor.getDocumentTypes()).name());
        com.daon.dmds.utils.MBUtils.extractResultImages((com.microblink.blinkid.entities.recognizers.Recognizer.Result) this.getHighResolutionOutputSizeshNQ4ISI.getResult(), dMDSDocument);
        java.util.Map<java.lang.String, java.lang.String> extractMrzData = com.daon.dmds.utils.BlinkIdExtractor.extractMrzData(result.getMrzResult());
        if (extractMrzData != null) {
            dMDSDocument.setMrzResult(extractMrzData);
        }
        com.daon.dmds.models.DMDSResult dMDSResult = new com.daon.dmds.models.DMDSResult();
        dMDSResult.setDocument(dMDSDocument);
        return new com.daon.dmds.models.ResponseData(dMDSResult, ((com.microblink.blinkid.entities.recognizers.successframe.SuccessFrameGrabberRecognizer.Result) this.getHighResolutionOutputSizeshNQ4ISI.getResult()).getSuccessFrame());
    }
}
