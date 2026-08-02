package com.microblink.blinkid.fragment.overlay.components.feedback;

/* loaded from: classes10.dex */
public interface RecognitionFeedbackHandler {
    public static final com.microblink.blinkid.fragment.overlay.components.feedback.RecognitionFeedbackHandler EMPTY = new com.microblink.blinkid.fragment.overlay.components.feedback.RecognitionFeedbackHandler() { // from class: com.microblink.blinkid.fragment.overlay.components.feedback.RecognitionFeedbackHandler.1
        @Override // com.microblink.blinkid.fragment.overlay.components.feedback.RecognitionFeedbackHandler
        public void clear() {
        }

        @Override // com.microblink.blinkid.fragment.overlay.components.feedback.RecognitionFeedbackHandler
        public android.view.View createView(com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView, com.microblink.blinkid.metadata.MetadataCallbacks metadataCallbacks) {
            return null;
        }

        @Override // com.microblink.blinkid.fragment.overlay.components.feedback.RecognitionFeedbackHandler
        public void onOrientationChange(int i) {
        }

        @Override // com.microblink.blinkid.fragment.overlay.components.feedback.RecognitionFeedbackHandler
        public void onPointsDetection(com.microblink.blinkid.metadata.detection.points.DisplayablePointsDetection displayablePointsDetection) {
        }
    };

    void clear();

    android.view.View createView(com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView, com.microblink.blinkid.metadata.MetadataCallbacks metadataCallbacks);

    void onOrientationChange(int i);

    void onPointsDetection(com.microblink.blinkid.metadata.detection.points.DisplayablePointsDetection displayablePointsDetection);
}
