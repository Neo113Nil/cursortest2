package com.microblink.blinkid.fragment.overlay;

/* loaded from: classes10.dex */
public class PingSessionFlowManager {
    private final com.microblink.blinkid.secured.llIIIllIlI Camera2StreamConfigurationMap = com.microblink.blinkid.secured.llIIIllIlI.llIIlIlIIl();
    private com.microblink.blinkid.view.recognition.DetectionStatus getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRangesFor;
    private com.microblink.blinkid.entities.recognizers.Recognizer.Result.State getHighSpeedVideoSizes;

    public void recordDetectionStatus(com.microblink.blinkid.view.recognition.DetectionStatus detectionStatus) {
        if (detectionStatus != this.getHighResolutionOutputSizeshNQ4ISI) {
            this.Camera2StreamConfigurationMap.llIIlIlIIl("sessionFlow-detectionStatus", java.lang.Integer.toString(detectionStatus.ordinal()));
        }
        this.getHighResolutionOutputSizeshNQ4ISI = detectionStatus;
    }

    public void recordProcessingStatus(int i) {
        if (i != this.getHighSpeedVideoFpsRangesFor) {
            this.Camera2StreamConfigurationMap.llIIlIlIIl("sessionFlow-processingStatus", java.lang.Integer.toString(i));
        }
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    public void recordResultState(com.microblink.blinkid.entities.recognizers.Recognizer.Result.State state) {
        if (state != this.getHighSpeedVideoSizes) {
            this.Camera2StreamConfigurationMap.llIIlIlIIl("sessionFlow-recognizerState", java.lang.Integer.toString(state.ordinal()));
        }
        this.getHighSpeedVideoSizes = state;
    }
}
