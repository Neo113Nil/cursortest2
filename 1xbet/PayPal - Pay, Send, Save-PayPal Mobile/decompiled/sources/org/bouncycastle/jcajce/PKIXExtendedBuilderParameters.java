package org.bouncycastle.jcajce;

/* loaded from: classes17.dex */
public class PKIXExtendedBuilderParameters implements java.security.cert.CertPathParameters {
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.Set<java.security.cert.X509Certificate> getHighSpeedVideoFpsRangesFor;
    private final org.bouncycastle.jcajce.PKIXExtendedParameters getHighSpeedVideoSizes;

    @Override // java.security.cert.CertPathParameters
    public java.lang.Object clone() {
        return this;
    }

    public static class Builder {
        private final org.bouncycastle.jcajce.PKIXExtendedParameters Camera2StreamConfigurationMap;
        private java.util.Set<java.security.cert.X509Certificate> getHighResolutionOutputSizeshNQ4ISI;
        private int getHighSpeedVideoFpsRangesFor;

        public org.bouncycastle.jcajce.PKIXExtendedBuilderParameters.Builder setMaxPathLength(int i) {
            if (i < -1) {
                throw new java.security.InvalidParameterException("The maximum path length parameter can not be less than -1.");
            }
            this.getHighSpeedVideoFpsRangesFor = i;
            return this;
        }

        public org.bouncycastle.jcajce.PKIXExtendedBuilderParameters build() {
            return new org.bouncycastle.jcajce.PKIXExtendedBuilderParameters(this, (byte) 0);
        }

        public org.bouncycastle.jcajce.PKIXExtendedBuilderParameters.Builder addExcludedCerts(java.util.Set<java.security.cert.X509Certificate> set) {
            this.getHighResolutionOutputSizeshNQ4ISI.addAll(set);
            return this;
        }

        public Builder(org.bouncycastle.jcajce.PKIXExtendedParameters pKIXExtendedParameters) {
            this.getHighSpeedVideoFpsRangesFor = 5;
            this.getHighResolutionOutputSizeshNQ4ISI = new java.util.HashSet();
            this.Camera2StreamConfigurationMap = pKIXExtendedParameters;
        }

        public Builder(java.security.cert.PKIXBuilderParameters pKIXBuilderParameters) {
            this.getHighSpeedVideoFpsRangesFor = 5;
            this.getHighResolutionOutputSizeshNQ4ISI = new java.util.HashSet();
            this.Camera2StreamConfigurationMap = new org.bouncycastle.jcajce.PKIXExtendedParameters.Builder(pKIXBuilderParameters).build();
            this.getHighSpeedVideoFpsRangesFor = pKIXBuilderParameters.getMaxPathLength();
        }
    }

    public int getMaxPathLength() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.util.Set getExcludedCerts() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.jcajce.PKIXExtendedParameters getBaseParameters() {
        return this.getHighSpeedVideoSizes;
    }

    /* synthetic */ PKIXExtendedBuilderParameters(org.bouncycastle.jcajce.PKIXExtendedBuilderParameters.Builder builder, byte b) {
        this(builder);
    }

    private PKIXExtendedBuilderParameters(org.bouncycastle.jcajce.PKIXExtendedBuilderParameters.Builder builder) {
        this.getHighSpeedVideoSizes = builder.Camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRangesFor = java.util.Collections.unmodifiableSet(builder.getHighResolutionOutputSizeshNQ4ISI);
        this.getHighResolutionOutputSizeshNQ4ISI = builder.getHighSpeedVideoFpsRangesFor;
    }
}
