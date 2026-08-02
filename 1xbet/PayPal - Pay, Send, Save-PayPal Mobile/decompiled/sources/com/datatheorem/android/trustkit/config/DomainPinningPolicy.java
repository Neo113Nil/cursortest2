package com.datatheorem.android.trustkit.config;

/* loaded from: classes8.dex */
public final class DomainPinningPolicy {
    private static final java.net.URL getHighSpeedVideoFpsRangesFor;
    private final java.util.Set<com.datatheorem.android.trustkit.config.PublicKeyPin> Camera2StreamConfigurationMap;
    private final java.util.Set<java.net.URL> getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private final java.util.Date getHighSpeedVideoSizes;
    private final boolean getInputSizeshNQ4ISI;
    private final boolean getOutputMinFrameDuration;

    static {
        try {
            getHighSpeedVideoFpsRangesFor = new java.net.URL("https://overmind.datatheorem.com/trustkit/report");
        } catch (java.net.MalformedURLException unused) {
            throw new java.lang.IllegalStateException("Bad DEFAULT_REPORTING_URL");
        }
    }

    DomainPinningPolicy(java.lang.String str, java.lang.Boolean bool, java.util.Set<java.lang.String> set, java.lang.Boolean bool2, java.util.Date date, java.util.Set<java.lang.String> set2, java.lang.Boolean bool3) throws java.net.MalformedURLException {
        if (!com.datatheorem.android.trustkit.config.DomainValidator.getHighResolutionOutputSizeshNQ4ISI().getHighSpeedVideoFpsRanges(str)) {
            throw new com.datatheorem.android.trustkit.config.ConfigurationException("Tried to pin an invalid domain: ".concat(java.lang.String.valueOf(str)));
        }
        java.lang.String trim = str.trim();
        this.getHighSpeedVideoFpsRanges = trim;
        set = set == null ? new java.util.HashSet<>() : set;
        if (bool2 == null) {
            this.getOutputMinFrameDuration = false;
        } else {
            this.getOutputMinFrameDuration = bool2.booleanValue();
        }
        if (bool == null) {
            this.getInputSizeshNQ4ISI = false;
        } else {
            this.getInputSizeshNQ4ISI = bool.booleanValue();
        }
        if (set.isEmpty() && this.getOutputMinFrameDuration) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("An empty pin-set was supplied for domain ");
            sb.append(trim);
            sb.append(" with the enforcePinning set to true. An empty pin-set disables pinning and can't be use with enforcePinning set to true.");
            throw new com.datatheorem.android.trustkit.config.ConfigurationException(sb.toString());
        }
        if (set.size() < 2 && this.getOutputMinFrameDuration) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Less than two pins were supplied for domain ");
            sb2.append(trim);
            sb2.append(". This might brick your App; please review the Getting Started guide in ./docs/getting-started.md");
            throw new com.datatheorem.android.trustkit.config.ConfigurationException(sb2.toString());
        }
        this.Camera2StreamConfigurationMap = new java.util.HashSet();
        java.util.Iterator<java.lang.String> it = set.iterator();
        while (it.hasNext()) {
            this.Camera2StreamConfigurationMap.add(new com.datatheorem.android.trustkit.config.PublicKeyPin(it.next()));
        }
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.HashSet();
        if (set2 != null) {
            java.util.Iterator<java.lang.String> it2 = set2.iterator();
            while (it2.hasNext()) {
                this.getHighResolutionOutputSizeshNQ4ISI.add(new java.net.URL(it2.next()));
            }
        }
        if (bool3 == null || !bool3.booleanValue()) {
            this.getHighResolutionOutputSizeshNQ4ISI.add(getHighSpeedVideoFpsRangesFor);
        }
        this.getHighSpeedVideoSizes = date;
    }

    public final java.lang.String getHostname() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final java.util.Set<com.datatheorem.android.trustkit.config.PublicKeyPin> getPublicKeyPins() {
        return this.Camera2StreamConfigurationMap;
    }

    public final boolean shouldEnforcePinning() {
        return this.getOutputMinFrameDuration;
    }

    public final java.util.Set<java.net.URL> getReportUris() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final boolean shouldIncludeSubdomains() {
        return this.getInputSizeshNQ4ISI;
    }

    public final java.util.Date getExpirationDate() {
        return this.getHighSpeedVideoSizes;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DomainPinningPolicy{hostname = ");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append("\nknownPins = ");
        sb.append(java.util.Arrays.toString(this.Camera2StreamConfigurationMap.toArray()));
        sb.append("\nshouldEnforcePinning = ");
        sb.append(this.getOutputMinFrameDuration);
        sb.append("\nreportUris = ");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append("\nshouldIncludeSubdomains = ");
        sb.append(this.getInputSizeshNQ4ISI);
        sb.append("\n}");
        return sb.toString();
    }

    public static final class Builder {
        private com.datatheorem.android.trustkit.config.DomainPinningPolicy.Builder Camera2StreamConfigurationMap = null;
        private java.util.Set<java.lang.String> getHighResolutionOutputSizeshNQ4ISI;
        private java.util.Set<java.lang.String> getHighSpeedVideoFpsRanges;
        private java.util.Date getHighSpeedVideoFpsRangesFor;
        private java.lang.String getHighSpeedVideoSizes;
        private java.lang.Boolean getHighSpeedVideoSizesFor;
        private java.lang.Boolean getInputFormats;
        private java.lang.Boolean getInputSizeshNQ4ISI;

        public final com.datatheorem.android.trustkit.config.DomainPinningPolicy build() throws java.net.MalformedURLException {
            com.datatheorem.android.trustkit.config.DomainPinningPolicy.Builder builder = this.Camera2StreamConfigurationMap;
            if (builder != null) {
                if (this.getHighSpeedVideoSizesFor == null) {
                    this.getHighSpeedVideoSizesFor = builder.getHighSpeedVideoSizesFor;
                }
                if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                    this.getHighResolutionOutputSizeshNQ4ISI = builder.getHighResolutionOutputSizeshNQ4ISI;
                }
                if (this.getHighSpeedVideoFpsRangesFor == null) {
                    this.getHighSpeedVideoFpsRangesFor = builder.getHighSpeedVideoFpsRangesFor;
                }
                if (this.getInputFormats == null) {
                    this.getInputFormats = builder.getInputFormats;
                }
                if (this.getHighSpeedVideoFpsRanges == null) {
                    this.getHighSpeedVideoFpsRanges = builder.getHighSpeedVideoFpsRanges;
                }
                if (this.getInputSizeshNQ4ISI == null) {
                    this.getInputSizeshNQ4ISI = builder.getInputSizeshNQ4ISI;
                }
            }
            if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                return null;
            }
            return new com.datatheorem.android.trustkit.config.DomainPinningPolicy(this.getHighSpeedVideoSizes, this.getHighSpeedVideoSizesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getInputFormats, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getInputSizeshNQ4ISI);
        }

        public final com.datatheorem.android.trustkit.config.DomainPinningPolicy.Builder setParent(com.datatheorem.android.trustkit.config.DomainPinningPolicy.Builder builder) {
            for (com.datatheorem.android.trustkit.config.DomainPinningPolicy.Builder builder2 = builder; builder2 != null; builder2 = builder2.Camera2StreamConfigurationMap) {
                if (builder2 == this) {
                    throw new java.lang.IllegalArgumentException("Loops are not allowed in Builder parents");
                }
            }
            this.Camera2StreamConfigurationMap = builder;
            return this;
        }

        public final com.datatheorem.android.trustkit.config.DomainPinningPolicy.Builder setHostname(java.lang.String str) {
            this.getHighSpeedVideoSizes = str;
            return this;
        }

        public final com.datatheorem.android.trustkit.config.DomainPinningPolicy.Builder setShouldIncludeSubdomains(java.lang.Boolean bool) {
            this.getHighSpeedVideoSizesFor = bool;
            return this;
        }

        public final com.datatheorem.android.trustkit.config.DomainPinningPolicy.Builder setPublicKeyHashes(java.util.Set<java.lang.String> set) {
            this.getHighResolutionOutputSizeshNQ4ISI = set;
            return this;
        }

        public final com.datatheorem.android.trustkit.config.DomainPinningPolicy.Builder setExpirationDate(java.util.Date date) {
            this.getHighSpeedVideoFpsRangesFor = date;
            return this;
        }

        public final com.datatheorem.android.trustkit.config.DomainPinningPolicy.Builder setShouldEnforcePinning(java.lang.Boolean bool) {
            this.getInputFormats = bool;
            return this;
        }

        public final com.datatheorem.android.trustkit.config.DomainPinningPolicy.Builder setReportUris(java.util.Set<java.lang.String> set) {
            this.getHighSpeedVideoFpsRanges = set;
            return this;
        }

        public final com.datatheorem.android.trustkit.config.DomainPinningPolicy.Builder setShouldDisableDefaultReportUri(java.lang.Boolean bool) {
            this.getInputSizeshNQ4ISI = bool;
            return this;
        }
    }
}
