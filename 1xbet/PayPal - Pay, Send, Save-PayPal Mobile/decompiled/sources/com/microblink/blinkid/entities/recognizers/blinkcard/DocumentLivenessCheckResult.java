package com.microblink.blinkid.entities.recognizers.blinkcard;

/* loaded from: classes9.dex */
public final class DocumentLivenessCheckResult {
    private final java.lang.Object Camera2StreamConfigurationMap;
    private final long getHighResolutionOutputSizeshNQ4ISI;

    public DocumentLivenessCheckResult(long j, java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = j;
        this.Camera2StreamConfigurationMap = obj;
    }

    private static native com.microblink.blinkid.entities.recognizers.blinkcard.DocumentLivenessCheckSingleSideResult backNativeGet(long j);

    private static native com.microblink.blinkid.entities.recognizers.blinkcard.DocumentLivenessCheckSingleSideResult frontNativeGet(long j);

    public final com.microblink.blinkid.entities.recognizers.blinkcard.DocumentLivenessCheckSingleSideResult getBack() {
        return backNativeGet(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final com.microblink.blinkid.entities.recognizers.blinkcard.DocumentLivenessCheckSingleSideResult getFront() {
        return frontNativeGet(this.getHighResolutionOutputSizeshNQ4ISI);
    }
}
