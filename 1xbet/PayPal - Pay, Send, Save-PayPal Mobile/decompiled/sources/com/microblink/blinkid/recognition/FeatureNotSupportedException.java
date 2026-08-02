package com.microblink.blinkid.recognition;

/* loaded from: classes.dex */
public class FeatureNotSupportedException extends java.lang.Exception {
    private final com.microblink.blinkid.view.NotSupportedReason getHighResolutionOutputSizeshNQ4ISI;

    public FeatureNotSupportedException(com.microblink.blinkid.view.NotSupportedReason notSupportedReason) {
        super(notSupportedReason.getDescription());
        this.getHighResolutionOutputSizeshNQ4ISI = notSupportedReason;
    }

    public com.microblink.blinkid.view.NotSupportedReason getReason() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public FeatureNotSupportedException(com.microblink.blinkid.view.NotSupportedReason notSupportedReason, java.lang.Throwable th) {
        super(notSupportedReason.getDescription(), th);
        this.getHighResolutionOutputSizeshNQ4ISI = notSupportedReason;
    }
}
