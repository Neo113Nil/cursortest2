package com.microblink.blinkid.fragment.overlay.components.feedback;

/* loaded from: classes10.dex */
public class OcrCharsFeedbackHandler implements com.microblink.blinkid.fragment.overlay.components.feedback.RecognitionFeedbackHandler {
    private com.microblink.blinkid.view.ocrResult.OcrResultCharsView getHighResolutionOutputSizeshNQ4ISI;

    @Override // com.microblink.blinkid.fragment.overlay.components.feedback.RecognitionFeedbackHandler
    public void clear() {
        this.getHighResolutionOutputSizeshNQ4ISI.clearDisplayedContent();
    }

    @Override // com.microblink.blinkid.fragment.overlay.components.feedback.RecognitionFeedbackHandler
    public android.view.View createView(com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView, com.microblink.blinkid.metadata.MetadataCallbacks metadataCallbacks) {
        this.getHighResolutionOutputSizeshNQ4ISI = new com.microblink.blinkid.view.ocrResult.OcrResultCharsView(recognizerRunnerView.getContext(), null, recognizerRunnerView.getHostScreenOrientation());
        metadataCallbacks.setOcrCallback(new com.microblink.blinkid.metadata.ocr.OcrCallback() { // from class: com.microblink.blinkid.fragment.overlay.components.feedback.OcrCharsFeedbackHandler$$ExternalSyntheticLambda0
            @Override // com.microblink.blinkid.metadata.ocr.OcrCallback
            public final void onOcrResult(com.microblink.blinkid.metadata.ocr.DisplayableOcrResult displayableOcrResult) {
                com.microblink.blinkid.fragment.overlay.components.feedback.OcrCharsFeedbackHandler.this.getHighResolutionOutputSizeshNQ4ISI.addOcrResult(displayableOcrResult);
            }
        });
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // com.microblink.blinkid.fragment.overlay.components.feedback.RecognitionFeedbackHandler
    public void onOrientationChange(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI.setHostActivityOrientation(i);
    }

    @Override // com.microblink.blinkid.fragment.overlay.components.feedback.RecognitionFeedbackHandler
    public void onPointsDetection(com.microblink.blinkid.metadata.detection.points.DisplayablePointsDetection displayablePointsDetection) {
    }
}
