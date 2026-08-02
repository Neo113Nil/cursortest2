package androidx.webkit;

/* loaded from: classes7.dex */
public final class UserAgentMetadata {
    public static final int BITNESS_DEFAULT = 0;
    public static final java.lang.String FORM_FACTOR_MOBILE = "Mobile";
    private final java.util.List<androidx.webkit.UserAgentMetadata.BrandVersion> getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.List<java.lang.String> getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private final java.lang.String getHighSpeedVideoSizes;
    private final java.lang.String getHighSpeedVideoSizesFor;
    private boolean getInputFormats;
    private final java.lang.String getInputSizeshNQ4ISI;
    private final java.lang.String getOutputFormats;
    private final java.lang.String getOutputMinFrameDuration;
    private boolean getOutputStallDurationlomOqCM;
    public static final java.lang.String FORM_FACTOR_DESKTOP = "Desktop";
    public static final java.lang.String FORM_FACTOR_AUTOMOTIVE = "Automotive";
    public static final java.lang.String FORM_FACTOR_TABLET = "Tablet";
    public static final java.lang.String FORM_FACTOR_XR = "XR";
    public static final java.lang.String FORM_FACTOR_EINK = "EInk";
    public static final java.lang.String FORM_FACTOR_WATCH = "Watch";
    private static final java.util.Set<java.lang.String> Camera2StreamConfigurationMap = java.util.Collections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList(FORM_FACTOR_DESKTOP, FORM_FACTOR_AUTOMOTIVE, "Mobile", FORM_FACTOR_TABLET, FORM_FACTOR_XR, FORM_FACTOR_EINK, FORM_FACTOR_WATCH)));

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface FormFactors {
    }

    /* synthetic */ UserAgentMetadata(java.util.List list, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z, int i, boolean z2, java.util.List list2, byte b) {
        this(list, str, str2, str3, str4, str5, z, i, z2, list2);
    }

    private UserAgentMetadata(java.util.List<androidx.webkit.UserAgentMetadata.BrandVersion> list, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z, int i, boolean z2, java.util.List<java.lang.String> list2) {
        this.getHighResolutionOutputSizeshNQ4ISI = list;
        this.getOutputFormats = str;
        this.getHighSpeedVideoSizesFor = str2;
        this.getOutputMinFrameDuration = str3;
        this.getHighSpeedVideoSizes = str4;
        this.getInputSizeshNQ4ISI = str5;
        this.getInputFormats = z;
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getOutputStallDurationlomOqCM = z2;
        this.getHighSpeedVideoFpsRanges = list2;
    }

    public final java.util.List<androidx.webkit.UserAgentMetadata.BrandVersion> getBrandVersionList() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final java.lang.String getFullVersion() {
        return this.getOutputFormats;
    }

    public final java.lang.String getPlatform() {
        return this.getHighSpeedVideoSizesFor;
    }

    public final java.lang.String getPlatformVersion() {
        return this.getOutputMinFrameDuration;
    }

    public final java.lang.String getArchitecture() {
        return this.getHighSpeedVideoSizes;
    }

    public final java.lang.String getModel() {
        return this.getInputSizeshNQ4ISI;
    }

    public final boolean isMobile() {
        return this.getInputFormats;
    }

    public final int getBitness() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final boolean isWow64() {
        return this.getOutputStallDurationlomOqCM;
    }

    public final java.util.List<java.lang.String> getFormFactors() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.webkit.UserAgentMetadata)) {
            return false;
        }
        androidx.webkit.UserAgentMetadata userAgentMetadata = (androidx.webkit.UserAgentMetadata) obj;
        return this.getInputFormats == userAgentMetadata.getInputFormats && this.getHighSpeedVideoFpsRangesFor == userAgentMetadata.getHighSpeedVideoFpsRangesFor && this.getOutputStallDurationlomOqCM == userAgentMetadata.getOutputStallDurationlomOqCM && java.util.Objects.equals(this.getHighResolutionOutputSizeshNQ4ISI, userAgentMetadata.getHighResolutionOutputSizeshNQ4ISI) && java.util.Objects.equals(this.getOutputFormats, userAgentMetadata.getOutputFormats) && java.util.Objects.equals(this.getHighSpeedVideoSizesFor, userAgentMetadata.getHighSpeedVideoSizesFor) && java.util.Objects.equals(this.getOutputMinFrameDuration, userAgentMetadata.getOutputMinFrameDuration) && java.util.Objects.equals(this.getHighSpeedVideoSizes, userAgentMetadata.getHighSpeedVideoSizes) && java.util.Objects.equals(this.getInputSizeshNQ4ISI, userAgentMetadata.getInputSizeshNQ4ISI) && java.util.Objects.equals(this.getHighSpeedVideoFpsRanges, userAgentMetadata.getHighSpeedVideoFpsRanges);
    }

    public final int hashCode() {
        java.util.List<androidx.webkit.UserAgentMetadata.BrandVersion> list = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.String str = this.getOutputFormats;
        java.lang.String str2 = this.getHighSpeedVideoSizesFor;
        java.lang.String str3 = this.getOutputMinFrameDuration;
        java.lang.String str4 = this.getHighSpeedVideoSizes;
        java.lang.String str5 = this.getInputSizeshNQ4ISI;
        boolean z = this.getInputFormats;
        int i = this.getHighSpeedVideoFpsRangesFor;
        boolean z2 = this.getOutputStallDurationlomOqCM;
        return java.util.Objects.hash(list, str, str2, str3, str4, str5, java.lang.Boolean.valueOf(z), java.lang.Integer.valueOf(i), java.lang.Boolean.valueOf(z2), this.getHighSpeedVideoFpsRanges);
    }

    public static final class BrandVersion {
        private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        private final java.lang.String getHighSpeedVideoFpsRanges;
        private final java.lang.String getHighSpeedVideoSizes;

        /* synthetic */ BrandVersion(java.lang.String str, java.lang.String str2, java.lang.String str3, byte b) {
            this(str, str2, str3);
        }

        private BrandVersion(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this.getHighSpeedVideoSizes = str;
            this.getHighSpeedVideoFpsRanges = str2;
            this.getHighResolutionOutputSizeshNQ4ISI = str3;
        }

        public final java.lang.String getBrand() {
            return this.getHighSpeedVideoSizes;
        }

        public final java.lang.String getMajorVersion() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public final java.lang.String getFullVersion() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.getHighSpeedVideoSizes);
            sb.append(",");
            sb.append(this.getHighSpeedVideoFpsRanges);
            sb.append(",");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            return sb.toString();
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.webkit.UserAgentMetadata.BrandVersion)) {
                return false;
            }
            androidx.webkit.UserAgentMetadata.BrandVersion brandVersion = (androidx.webkit.UserAgentMetadata.BrandVersion) obj;
            return java.util.Objects.equals(this.getHighSpeedVideoSizes, brandVersion.getHighSpeedVideoSizes) && java.util.Objects.equals(this.getHighSpeedVideoFpsRanges, brandVersion.getHighSpeedVideoFpsRanges) && java.util.Objects.equals(this.getHighResolutionOutputSizeshNQ4ISI, brandVersion.getHighResolutionOutputSizeshNQ4ISI);
        }

        public final int hashCode() {
            return java.util.Objects.hash(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI);
        }

        public static final class Builder {
            private java.lang.String getHighResolutionOutputSizeshNQ4ISI;
            private java.lang.String getHighSpeedVideoFpsRanges;
            private java.lang.String getHighSpeedVideoFpsRangesFor;

            public Builder() {
            }

            public Builder(androidx.webkit.UserAgentMetadata.BrandVersion brandVersion) {
                this.getHighResolutionOutputSizeshNQ4ISI = brandVersion.getBrand();
                this.getHighSpeedVideoFpsRangesFor = brandVersion.getMajorVersion();
                this.getHighSpeedVideoFpsRanges = brandVersion.getFullVersion();
            }

            public final androidx.webkit.UserAgentMetadata.BrandVersion build() {
                java.lang.String str;
                java.lang.String str2;
                java.lang.String str3 = this.getHighResolutionOutputSizeshNQ4ISI;
                if (str3 == null || str3.trim().isEmpty() || (str = this.getHighSpeedVideoFpsRangesFor) == null || str.trim().isEmpty() || (str2 = this.getHighSpeedVideoFpsRanges) == null || str2.trim().isEmpty()) {
                    throw new java.lang.IllegalStateException("Brand name, major version and full version should not be null or blank.");
                }
                return new androidx.webkit.UserAgentMetadata.BrandVersion(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, (byte) 0);
            }

            public final androidx.webkit.UserAgentMetadata.BrandVersion.Builder setBrand(java.lang.String str) {
                if (str.trim().isEmpty()) {
                    throw new java.lang.IllegalArgumentException("Brand should not be blank.");
                }
                this.getHighResolutionOutputSizeshNQ4ISI = str;
                return this;
            }

            public final androidx.webkit.UserAgentMetadata.BrandVersion.Builder setMajorVersion(java.lang.String str) {
                if (str.trim().isEmpty()) {
                    throw new java.lang.IllegalArgumentException("MajorVersion should not be blank.");
                }
                this.getHighSpeedVideoFpsRangesFor = str;
                return this;
            }

            public final androidx.webkit.UserAgentMetadata.BrandVersion.Builder setFullVersion(java.lang.String str) {
                if (str.trim().isEmpty()) {
                    throw new java.lang.IllegalArgumentException("FullVersion should not be blank.");
                }
                this.getHighSpeedVideoFpsRanges = str;
                return this;
            }
        }
    }

    public static final class Builder {
        private java.util.List<java.lang.String> Camera2StreamConfigurationMap;
        private int getHighResolutionOutputSizeshNQ4ISI;
        private java.lang.String getHighSpeedVideoFpsRanges;
        private java.util.List<androidx.webkit.UserAgentMetadata.BrandVersion> getHighSpeedVideoFpsRangesFor;
        private java.lang.String getHighSpeedVideoSizes;
        private boolean getHighSpeedVideoSizesFor;
        private java.lang.String getInputFormats;
        private java.lang.String getInputSizeshNQ4ISI;
        private java.lang.String getOutputFormats;
        private boolean getOutputMinFrameDuration;

        public Builder() {
            this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();
            this.getOutputMinFrameDuration = true;
            this.getHighResolutionOutputSizeshNQ4ISI = 0;
            this.getHighSpeedVideoSizesFor = false;
            this.Camera2StreamConfigurationMap = new java.util.ArrayList();
        }

        public Builder(androidx.webkit.UserAgentMetadata userAgentMetadata) {
            this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();
            this.getOutputMinFrameDuration = true;
            this.getHighResolutionOutputSizeshNQ4ISI = 0;
            this.getHighSpeedVideoSizesFor = false;
            this.Camera2StreamConfigurationMap = new java.util.ArrayList();
            this.getHighSpeedVideoFpsRangesFor = userAgentMetadata.getBrandVersionList();
            this.getHighSpeedVideoSizes = userAgentMetadata.getFullVersion();
            this.getOutputFormats = userAgentMetadata.getPlatform();
            this.getInputSizeshNQ4ISI = userAgentMetadata.getPlatformVersion();
            this.getHighSpeedVideoFpsRanges = userAgentMetadata.getArchitecture();
            this.getInputFormats = userAgentMetadata.getModel();
            this.getOutputMinFrameDuration = userAgentMetadata.isMobile();
            this.getHighResolutionOutputSizeshNQ4ISI = userAgentMetadata.getBitness();
            this.getHighSpeedVideoSizesFor = userAgentMetadata.isWow64();
            this.Camera2StreamConfigurationMap = userAgentMetadata.getFormFactors();
        }

        public final androidx.webkit.UserAgentMetadata build() {
            return new androidx.webkit.UserAgentMetadata(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getOutputFormats, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getInputFormats, this.getOutputMinFrameDuration, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor, this.Camera2StreamConfigurationMap, (byte) 0);
        }

        public final androidx.webkit.UserAgentMetadata.Builder setBrandVersionList(java.util.List<androidx.webkit.UserAgentMetadata.BrandVersion> list) {
            this.getHighSpeedVideoFpsRangesFor = list;
            return this;
        }

        public final androidx.webkit.UserAgentMetadata.Builder setFullVersion(java.lang.String str) {
            if (str == null) {
                this.getHighSpeedVideoSizes = null;
                return this;
            }
            if (str.trim().isEmpty()) {
                throw new java.lang.IllegalArgumentException("Full version should not be blank.");
            }
            this.getHighSpeedVideoSizes = str;
            return this;
        }

        public final androidx.webkit.UserAgentMetadata.Builder setPlatform(java.lang.String str) {
            if (str == null) {
                this.getOutputFormats = null;
                return this;
            }
            if (str.trim().isEmpty()) {
                throw new java.lang.IllegalArgumentException("Platform should not be blank.");
            }
            this.getOutputFormats = str;
            return this;
        }

        public final androidx.webkit.UserAgentMetadata.Builder setPlatformVersion(java.lang.String str) {
            this.getInputSizeshNQ4ISI = str;
            return this;
        }

        public final androidx.webkit.UserAgentMetadata.Builder setArchitecture(java.lang.String str) {
            this.getHighSpeedVideoFpsRanges = str;
            return this;
        }

        public final androidx.webkit.UserAgentMetadata.Builder setModel(java.lang.String str) {
            this.getInputFormats = str;
            return this;
        }

        public final androidx.webkit.UserAgentMetadata.Builder setMobile(boolean z) {
            this.getOutputMinFrameDuration = z;
            return this;
        }

        public final androidx.webkit.UserAgentMetadata.Builder setBitness(int i) {
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            return this;
        }

        public final androidx.webkit.UserAgentMetadata.Builder setWow64(boolean z) {
            this.getHighSpeedVideoSizesFor = z;
            return this;
        }

        public final androidx.webkit.UserAgentMetadata.Builder setFormFactors(java.util.List<java.lang.String> list) {
            if (!androidx.webkit.internal.WebViewFeatureInternal.USER_AGENT_METADATA_FORM_FACTORS.isSupportedByWebView()) {
                throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
            }
            for (java.lang.String str : list) {
                if (!androidx.webkit.UserAgentMetadata.Camera2StreamConfigurationMap.contains(str)) {
                    throw new java.lang.IllegalArgumentException("Invalid form factor: ".concat(java.lang.String.valueOf(str)));
                }
            }
            this.Camera2StreamConfigurationMap = list;
            return this;
        }
    }
}
