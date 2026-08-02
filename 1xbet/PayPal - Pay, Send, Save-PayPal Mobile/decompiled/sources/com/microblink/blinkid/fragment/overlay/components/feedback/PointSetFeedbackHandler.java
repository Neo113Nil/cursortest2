package com.microblink.blinkid.fragment.overlay.components.feedback;

/* loaded from: classes10.dex */
public class PointSetFeedbackHandler implements com.microblink.blinkid.fragment.overlay.components.feedback.RecognitionFeedbackHandler {
    private final com.microblink.blinkid.metadata.detection.points.PointsType Camera2StreamConfigurationMap;
    private com.microblink.blinkid.view.viewfinder.points.PointSetView getHighSpeedVideoFpsRangesFor;

    public PointSetFeedbackHandler(com.microblink.blinkid.metadata.detection.points.PointsType pointsType) {
        this.Camera2StreamConfigurationMap = pointsType;
    }

    @Override // com.microblink.blinkid.fragment.overlay.components.feedback.RecognitionFeedbackHandler
    public void clear() {
        this.getHighSpeedVideoFpsRangesFor.clearDisplayedContent();
    }

    @Override // com.microblink.blinkid.fragment.overlay.components.feedback.RecognitionFeedbackHandler
    public android.view.View createView(com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView, com.microblink.blinkid.metadata.MetadataCallbacks metadataCallbacks) {
        android.content.Context context = recognizerRunnerView.getContext();
        if (this.Camera2StreamConfigurationMap == com.microblink.blinkid.metadata.detection.points.PointsType.MRTD_DETECTION) {
            this.getHighSpeedVideoFpsRangesFor = new com.microblink.blinkid.view.viewfinder.points.PointSetView(context, null, recognizerRunnerView.getHostScreenOrientation(), 7, context.getResources().getColor(com.microblink.blinkid.library.R.color.mb_mrz_point_color));
        } else {
            this.getHighSpeedVideoFpsRangesFor = new com.microblink.blinkid.view.viewfinder.points.PointSetView(context, null, recognizerRunnerView.getHostScreenOrientation());
        }
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // com.microblink.blinkid.fragment.overlay.components.feedback.RecognitionFeedbackHandler
    public void onOrientationChange(int i) {
        this.getHighSpeedVideoFpsRangesFor.setHostActivityOrientation(i);
    }

    @Override // com.microblink.blinkid.fragment.overlay.components.feedback.RecognitionFeedbackHandler
    public void onPointsDetection(com.microblink.blinkid.metadata.detection.points.DisplayablePointsDetection displayablePointsDetection) {
        if (displayablePointsDetection.getPointsType() == this.Camera2StreamConfigurationMap) {
            this.getHighSpeedVideoFpsRangesFor.addDisplayablePointsDetection(displayablePointsDetection);
        }
    }
}
