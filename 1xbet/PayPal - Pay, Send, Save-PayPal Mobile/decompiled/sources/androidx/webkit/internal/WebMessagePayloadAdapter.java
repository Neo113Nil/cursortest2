package androidx.webkit.internal;

/* loaded from: classes7.dex */
public class WebMessagePayloadAdapter implements org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface {
    private final int getHighSpeedVideoFpsRanges;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;
    private final byte[] getHighSpeedVideoSizes;

    public WebMessagePayloadAdapter(java.lang.String str) {
        this.getHighSpeedVideoFpsRanges = 0;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoSizes = null;
    }

    public WebMessagePayloadAdapter(byte[] bArr) {
        this.getHighSpeedVideoFpsRanges = 1;
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighSpeedVideoSizes = bArr;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public java.lang.String[] getSupportedFeatures() {
        return new java.lang.String[0];
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public int getType() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public java.lang.String getAsString() {
        getHighSpeedVideoFpsRanges(0);
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public byte[] getAsArrayBuffer() {
        getHighSpeedVideoFpsRanges(1);
        return (byte[]) java.util.Objects.requireNonNull(this.getHighSpeedVideoSizes);
    }

    private void getHighSpeedVideoFpsRanges(int i) {
        if (this.getHighSpeedVideoFpsRanges == i) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
        sb.append(i);
        sb.append(", but type is ");
        sb.append(this.getHighSpeedVideoFpsRanges);
        throw new java.lang.IllegalStateException(sb.toString());
    }
}
