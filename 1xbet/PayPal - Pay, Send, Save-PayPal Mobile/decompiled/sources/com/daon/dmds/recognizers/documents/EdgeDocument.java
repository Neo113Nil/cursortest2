package com.daon.dmds.recognizers.documents;

/* loaded from: classes7.dex */
public class EdgeDocument implements com.daon.dmds.recognizers.DocumentRecognizer {
    private com.microblink.blinkid.entities.processors.imageReturn.ImageReturnProcessor Camera2StreamConfigurationMap;
    private com.daon.dmds.models.DMDSOptions getHighResolutionOutputSizeshNQ4ISI;
    private com.microblink.blinkid.entities.recognizers.successframe.SuccessFrameGrabberRecognizer getHighSpeedVideoFpsRanges;
    private com.microblink.blinkid.entities.recognizers.detector.DetectorRecognizer getHighSpeedVideoFpsRangesFor;

    @Override // com.daon.dmds.recognizers.DocumentRecognizer
    public com.microblink.blinkid.entities.recognizers.RecognizerBundle buildRecognizerBundle(com.daon.dmds.models.DMDSOptions dMDSOptions) {
        this.getHighResolutionOutputSizeshNQ4ISI = dMDSOptions;
        com.microblink.blinkid.geometry.Rectangle buildProcessingLocation = com.daon.dmds.utils.DMDSDocumentUtils.buildProcessingLocation(dMDSOptions);
        com.microblink.blinkid.entities.recognizers.templating.DewarpPolicy buildDewarpPolicy = com.daon.dmds.utils.DMDSDocumentUtils.buildDewarpPolicy(this.getHighResolutionOutputSizeshNQ4ISI);
        com.microblink.blinkid.entities.processors.imageReturn.ImageReturnProcessor imageReturnProcessor = new com.microblink.blinkid.entities.processors.imageReturn.ImageReturnProcessor();
        this.Camera2StreamConfigurationMap = imageReturnProcessor;
        com.microblink.blinkid.entities.recognizers.templating.ProcessorGroup processorGroup = new com.microblink.blinkid.entities.recognizers.templating.ProcessorGroup(buildProcessingLocation, buildDewarpPolicy, imageReturnProcessor);
        com.microblink.blinkid.entities.recognizers.templating.TemplatingClass templatingClass = new com.microblink.blinkid.entities.recognizers.templating.TemplatingClass();
        templatingClass.setClassificationProcessorGroups(processorGroup);
        com.microblink.blinkid.entities.recognizers.detector.DetectorRecognizer detectorRecognizer = new com.microblink.blinkid.entities.recognizers.detector.DetectorRecognizer(com.daon.dmds.utils.DMDSDocumentUtils.buildDocumentDetector(this.getHighResolutionOutputSizeshNQ4ISI));
        this.getHighSpeedVideoFpsRangesFor = detectorRecognizer;
        detectorRecognizer.setTemplatingClasses(templatingClass);
        com.microblink.blinkid.entities.recognizers.successframe.SuccessFrameGrabberRecognizer successFrameGrabberRecognizer = new com.microblink.blinkid.entities.recognizers.successframe.SuccessFrameGrabberRecognizer(this.getHighSpeedVideoFpsRangesFor);
        this.getHighSpeedVideoFpsRanges = successFrameGrabberRecognizer;
        return new com.microblink.blinkid.entities.recognizers.RecognizerBundle(successFrameGrabberRecognizer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.daon.dmds.recognizers.DocumentRecognizer
    public com.daon.dmds.models.ResponseData buildResponseData() {
        if (((com.microblink.blinkid.entities.recognizers.detector.DetectorRecognizer.Result) this.getHighSpeedVideoFpsRangesFor.getResult()).getResultState() != com.microblink.blinkid.entities.recognizers.Recognizer.Result.State.Valid) {
            return null;
        }
        com.daon.dmds.models.DMDSDocument dMDSDocument = new com.daon.dmds.models.DMDSDocument();
        dMDSDocument.setDocumentType(com.daon.dmds.utils.DMDSDocumentUtils.extractDocumentType(this.getHighResolutionOutputSizeshNQ4ISI.getDocumentTypes()).name());
        com.microblink.blinkid.image.Image rawImage = ((com.microblink.blinkid.entities.processors.imageReturn.ImageReturnProcessor.Result) this.Camera2StreamConfigurationMap.getResult()).getRawImage();
        if (rawImage == null) {
            return null;
        }
        dMDSDocument.setProcessedImage(rawImage.convertToBitmap());
        com.microblink.blinkid.image.Image successFrame = ((com.microblink.blinkid.entities.recognizers.successframe.SuccessFrameGrabberRecognizer.Result) this.getHighSpeedVideoFpsRanges.getResult()).getSuccessFrame();
        if (successFrame != null) {
            dMDSDocument.setUnprocessedImage(com.daon.dmds.utils.DMDSDocumentUtils.rotateImage(successFrame.convertToBitmap(), com.daon.dmds.utils.MBUtils.orientation2Rotation(successFrame.getImageOrientation())));
        }
        com.daon.dmds.models.DMDSResult dMDSResult = new com.daon.dmds.models.DMDSResult();
        dMDSResult.setDocument(dMDSDocument);
        return new com.daon.dmds.models.ResponseData(dMDSResult, successFrame);
    }
}
