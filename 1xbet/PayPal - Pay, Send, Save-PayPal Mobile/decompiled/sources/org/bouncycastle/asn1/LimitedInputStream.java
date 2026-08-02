package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
abstract class LimitedInputStream extends java.io.InputStream {
    protected final java.io.InputStream Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRangesFor;

    protected final void getHighResolutionOutputSizeshNQ4ISI() {
        java.io.InputStream inputStream = this.Camera2StreamConfigurationMap;
        if (inputStream instanceof org.bouncycastle.asn1.IndefiniteLengthInputStream) {
            ((org.bouncycastle.asn1.IndefiniteLengthInputStream) inputStream).getHighSpeedVideoFpsRanges(true);
        }
    }

    LimitedInputStream(java.io.InputStream inputStream, int i) {
        this.Camera2StreamConfigurationMap = inputStream;
        this.getHighSpeedVideoFpsRangesFor = i;
    }
}
