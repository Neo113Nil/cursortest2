package com.microblink.blinkid.entities.recognizers.blinkcard;

/* loaded from: classes9.dex */
public final class BlinkCardAnonymizationSettings {
    private com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardAnonymizationMode Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardAnonymizationMode getHighSpeedVideoFpsRanges;
    private com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardAnonymizationMode getHighSpeedVideoFpsRangesFor;
    private com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardAnonymizationMode getHighSpeedVideoSizes;
    private com.microblink.blinkid.entities.recognizers.blinkcard.CardNumberAnonymizationSettings getHighSpeedVideoSizesFor = new com.microblink.blinkid.entities.recognizers.blinkcard.CardNumberAnonymizationSettings();

    public BlinkCardAnonymizationSettings() {
        com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardAnonymizationMode blinkCardAnonymizationMode = com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardAnonymizationMode.None;
        this.getHighSpeedVideoFpsRangesFor = blinkCardAnonymizationMode;
        this.getHighSpeedVideoFpsRanges = blinkCardAnonymizationMode;
        this.getHighSpeedVideoSizes = blinkCardAnonymizationMode;
        this.Camera2StreamConfigurationMap = blinkCardAnonymizationMode;
        this.getHighResolutionOutputSizeshNQ4ISI = false;
    }

    public final com.microblink.blinkid.entities.recognizers.blinkcard.CardNumberAnonymizationSettings getCardNumberAnonymizationSettings() {
        return this.getHighSpeedVideoSizesFor;
    }

    public final com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardAnonymizationMode getCardNumberPrefixAnonymizationMode() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardAnonymizationMode getCvvAnonymizationMode() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final boolean getFallbackAnonymization() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardAnonymizationMode getIbanAnonymizationMode() {
        return this.getHighSpeedVideoSizes;
    }

    public final com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardAnonymizationMode getOwnerAnonymizationMode() {
        return this.Camera2StreamConfigurationMap;
    }

    public final void setCardNumberAnonymizationSettings(com.microblink.blinkid.entities.recognizers.blinkcard.CardNumberAnonymizationSettings cardNumberAnonymizationSettings) {
        this.getHighSpeedVideoSizesFor = cardNumberAnonymizationSettings;
    }

    public final void setCardNumberPrefixAnonymizationMode(com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardAnonymizationMode blinkCardAnonymizationMode) {
        this.getHighSpeedVideoFpsRangesFor = blinkCardAnonymizationMode;
    }

    public final void setCvvAnonymizationMode(com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardAnonymizationMode blinkCardAnonymizationMode) {
        this.getHighSpeedVideoFpsRanges = blinkCardAnonymizationMode;
    }

    public final void setFallbackAnonymization(boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }

    public final void setIbanAnonymizationMode(com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardAnonymizationMode blinkCardAnonymizationMode) {
        this.getHighSpeedVideoSizes = blinkCardAnonymizationMode;
    }

    public final void setOwnerAnonymizationMode(com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardAnonymizationMode blinkCardAnonymizationMode) {
        this.Camera2StreamConfigurationMap = blinkCardAnonymizationMode;
    }
}
