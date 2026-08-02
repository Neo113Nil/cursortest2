package com.microblink.blinkid.fragment.overlay.components.feedback;

/* loaded from: classes10.dex */
public class OcrDotsFeedbackHandler implements com.microblink.blinkid.fragment.overlay.components.feedback.RecognitionFeedbackHandler {
    private com.microblink.blinkid.view.ocrResult.OcrResultDotsView getHighSpeedVideoFpsRangesFor;

    @Override // com.microblink.blinkid.fragment.overlay.components.feedback.RecognitionFeedbackHandler
    public void clear() {
        this.getHighSpeedVideoFpsRangesFor.clearDisplayedContent();
    }

    @Override // com.microblink.blinkid.fragment.overlay.components.feedback.RecognitionFeedbackHandler
    public void onOrientationChange(int i) {
        this.getHighSpeedVideoFpsRangesFor.setHostActivityOrientation(i);
    }

    @Override // com.microblink.blinkid.fragment.overlay.components.feedback.RecognitionFeedbackHandler
    public void onPointsDetection(com.microblink.blinkid.metadata.detection.points.DisplayablePointsDetection displayablePointsDetection) {
        if (displayablePointsDetection.getPointsType() == com.microblink.blinkid.metadata.detection.points.PointsType.OCR_RESULT) {
            this.getHighSpeedVideoFpsRangesFor.addDisplayablePointsDetection(displayablePointsDetection);
        }
    }

    @Override // com.microblink.blinkid.fragment.overlay.components.feedback.RecognitionFeedbackHandler
    public android.view.View createView(com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView, com.microblink.blinkid.metadata.MetadataCallbacks metadataCallbacks) {
        com.microblink.blinkid.view.ocrResult.OcrResultDotsView ocrResultDotsView = new com.microblink.blinkid.view.ocrResult.OcrResultDotsView(recognizerRunnerView.getContext(), recognizerRunnerView.getHostScreenOrientation(), recognizerRunnerView.getInitialOrientation());
        this.getHighSpeedVideoFpsRangesFor = ocrResultDotsView;
        recognizerRunnerView.addOrientationChangeListener(ocrResultDotsView);
        metadataCallbacks.setOcrCallback(new com.microblink.blinkid.metadata.ocr.OcrCallback() { // from class: com.microblink.blinkid.fragment.overlay.components.feedback.OcrDotsFeedbackHandler$$ExternalSyntheticLambda0
            @Override // com.microblink.blinkid.metadata.ocr.OcrCallback
            public final void onOcrResult(com.microblink.blinkid.metadata.ocr.DisplayableOcrResult displayableOcrResult) {
                com.microblink.blinkid.fragment.overlay.components.feedback.OcrDotsFeedbackHandler.this.getHighSpeedVideoFpsRangesFor.addOcrResult(displayableOcrResult);
            }
        });
        return this.getHighSpeedVideoFpsRangesFor;
    }
}
