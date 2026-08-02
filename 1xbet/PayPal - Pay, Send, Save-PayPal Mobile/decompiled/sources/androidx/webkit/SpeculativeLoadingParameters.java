package androidx.webkit;

/* loaded from: classes7.dex */
public final class SpeculativeLoadingParameters {
    private final java.util.Map<java.lang.String, java.lang.String> Camera2StreamConfigurationMap;
    private final androidx.webkit.NoVarySearchHeader getHighResolutionOutputSizeshNQ4ISI;
    private final boolean getHighSpeedVideoFpsRangesFor;

    /* synthetic */ SpeculativeLoadingParameters(java.util.Map map, androidx.webkit.NoVarySearchHeader noVarySearchHeader, boolean z, byte b) {
        this(map, noVarySearchHeader, z);
    }

    private SpeculativeLoadingParameters(java.util.Map<java.lang.String, java.lang.String> map, androidx.webkit.NoVarySearchHeader noVarySearchHeader, boolean z) {
        this.Camera2StreamConfigurationMap = map;
        this.getHighResolutionOutputSizeshNQ4ISI = noVarySearchHeader;
        this.getHighSpeedVideoFpsRangesFor = z;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getAdditionalHeaders() {
        return this.Camera2StreamConfigurationMap;
    }

    public final androidx.webkit.NoVarySearchHeader getExpectedNoVarySearchData() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final boolean isJavaScriptEnabled() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static final class Builder {
        private final java.util.Map<java.lang.String, java.lang.String> Camera2StreamConfigurationMap = new java.util.HashMap();
        private androidx.webkit.NoVarySearchHeader getHighSpeedVideoFpsRanges = null;
        private boolean getHighSpeedVideoSizes = false;

        public final androidx.webkit.SpeculativeLoadingParameters build() {
            return new androidx.webkit.SpeculativeLoadingParameters(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, (byte) 0);
        }

        public final androidx.webkit.SpeculativeLoadingParameters.Builder addAdditionalHeader(java.lang.String str, java.lang.String str2) {
            this.Camera2StreamConfigurationMap.put(str, str2);
            return this;
        }

        public final androidx.webkit.SpeculativeLoadingParameters.Builder addAdditionalHeaders(java.util.Map<java.lang.String, java.lang.String> map) {
            this.Camera2StreamConfigurationMap.putAll(map);
            return this;
        }

        public final androidx.webkit.SpeculativeLoadingParameters.Builder setExpectedNoVarySearchData(androidx.webkit.NoVarySearchHeader noVarySearchHeader) {
            this.getHighSpeedVideoFpsRanges = noVarySearchHeader;
            return this;
        }

        public final androidx.webkit.SpeculativeLoadingParameters.Builder setJavaScriptEnabled(boolean z) {
            this.getHighSpeedVideoSizes = z;
            return this;
        }
    }
}
