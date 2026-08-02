package org.bouncycastle.jcajce;

/* loaded from: classes17.dex */
public class PKIXExtendedParameters implements java.security.cert.CertPathParameters {
    public static final int CHAIN_VALIDITY_MODEL = 1;
    public static final int PKIX_VALIDITY_MODEL = 0;
    private final java.util.List<org.bouncycastle.jcajce.PKIXCRLStore> Camera2StreamConfigurationMap;
    private final java.security.cert.PKIXParameters getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.Map<org.bouncycastle.asn1.x509.GeneralName, org.bouncycastle.jcajce.PKIXCRLStore> getHighSpeedVideoFpsRanges;
    private final java.util.Date getHighSpeedVideoFpsRangesFor;
    private final java.util.List<org.bouncycastle.jcajce.PKIXCertStore> getHighSpeedVideoSizes;
    private final java.util.Set<java.security.cert.TrustAnchor> getHighSpeedVideoSizesFor;
    private final boolean getInputFormats;
    private final java.util.Map<org.bouncycastle.asn1.x509.GeneralName, org.bouncycastle.jcajce.PKIXCertStore> getInputSizeshNQ4ISI;
    private final boolean getOutputFormats;
    private final org.bouncycastle.jcajce.PKIXCertStoreSelector getOutputMinFrameDuration;
    private final java.util.Date getOutputMinFrameDurationlomOqCM;
    private final int getOutputSizeshNQ4ISI;

    @Override // java.security.cert.CertPathParameters
    public java.lang.Object clone() {
        return this;
    }

    public boolean isUseDeltasEnabled() {
        return this.getInputFormats;
    }

    public boolean isRevocationEnabled() {
        return this.getOutputFormats;
    }

    public boolean isPolicyMappingInhibited() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isPolicyMappingInhibited();
    }

    public boolean isExplicitPolicyRequired() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isExplicitPolicyRequired();
    }

    public boolean isAnyPolicyInhibited() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isAnyPolicyInhibited();
    }

    public int getValidityModel() {
        return this.getOutputSizeshNQ4ISI;
    }

    public static class Builder {
        private final java.util.Date Camera2StreamConfigurationMap;
        private final java.security.cert.PKIXParameters getHighResolutionOutputSizeshNQ4ISI;
        private java.util.List<org.bouncycastle.jcajce.PKIXCertStore> getHighSpeedVideoFpsRanges;
        private java.util.Map<org.bouncycastle.asn1.x509.GeneralName, org.bouncycastle.jcajce.PKIXCRLStore> getHighSpeedVideoFpsRangesFor;
        private java.util.List<org.bouncycastle.jcajce.PKIXCRLStore> getHighSpeedVideoSizes;
        private boolean getHighSpeedVideoSizesFor;
        private boolean getInputFormats;
        private java.util.Map<org.bouncycastle.asn1.x509.GeneralName, org.bouncycastle.jcajce.PKIXCertStore> getInputSizeshNQ4ISI;
        private java.util.Set<java.security.cert.TrustAnchor> getOutputFormats;
        private org.bouncycastle.jcajce.PKIXCertStoreSelector getOutputMinFrameDuration;
        private int getOutputSizes;
        private final java.util.Date getOutputStallDuration;

        public org.bouncycastle.jcajce.PKIXExtendedParameters.Builder setValidityModel(int i) {
            this.getOutputSizes = i;
            return this;
        }

        public org.bouncycastle.jcajce.PKIXExtendedParameters.Builder setUseDeltasEnabled(boolean z) {
            this.getHighSpeedVideoSizesFor = z;
            return this;
        }

        public org.bouncycastle.jcajce.PKIXExtendedParameters.Builder setTrustAnchors(java.util.Set<java.security.cert.TrustAnchor> set) {
            this.getOutputFormats = set;
            return this;
        }

        public org.bouncycastle.jcajce.PKIXExtendedParameters.Builder setTrustAnchor(java.security.cert.TrustAnchor trustAnchor) {
            this.getOutputFormats = java.util.Collections.singleton(trustAnchor);
            return this;
        }

        public org.bouncycastle.jcajce.PKIXExtendedParameters.Builder setTargetConstraints(org.bouncycastle.jcajce.PKIXCertStoreSelector pKIXCertStoreSelector) {
            this.getOutputMinFrameDuration = pKIXCertStoreSelector;
            return this;
        }

        public void setRevocationEnabled(boolean z) {
            this.getInputFormats = z;
        }

        public org.bouncycastle.jcajce.PKIXExtendedParameters build() {
            return new org.bouncycastle.jcajce.PKIXExtendedParameters(this, (byte) 0);
        }

        public org.bouncycastle.jcajce.PKIXExtendedParameters.Builder addNamedCertificateStore(org.bouncycastle.asn1.x509.GeneralName generalName, org.bouncycastle.jcajce.PKIXCertStore pKIXCertStore) {
            this.getInputSizeshNQ4ISI.put(generalName, pKIXCertStore);
            return this;
        }

        public org.bouncycastle.jcajce.PKIXExtendedParameters.Builder addNamedCRLStore(org.bouncycastle.asn1.x509.GeneralName generalName, org.bouncycastle.jcajce.PKIXCRLStore pKIXCRLStore) {
            this.getHighSpeedVideoFpsRangesFor.put(generalName, pKIXCRLStore);
            return this;
        }

        public org.bouncycastle.jcajce.PKIXExtendedParameters.Builder addCertificateStore(org.bouncycastle.jcajce.PKIXCertStore pKIXCertStore) {
            this.getHighSpeedVideoFpsRanges.add(pKIXCertStore);
            return this;
        }

        public org.bouncycastle.jcajce.PKIXExtendedParameters.Builder addCRLStore(org.bouncycastle.jcajce.PKIXCRLStore pKIXCRLStore) {
            this.getHighSpeedVideoSizes.add(pKIXCRLStore);
            return this;
        }

        public Builder(org.bouncycastle.jcajce.PKIXExtendedParameters pKIXExtendedParameters) {
            this.getHighSpeedVideoFpsRanges = new java.util.ArrayList();
            this.getInputSizeshNQ4ISI = new java.util.HashMap();
            this.getHighSpeedVideoSizes = new java.util.ArrayList();
            this.getHighSpeedVideoFpsRangesFor = new java.util.HashMap();
            this.getOutputSizes = 0;
            this.getHighSpeedVideoSizesFor = false;
            this.getHighResolutionOutputSizeshNQ4ISI = pKIXExtendedParameters.getHighResolutionOutputSizeshNQ4ISI;
            this.getOutputStallDuration = pKIXExtendedParameters.getOutputMinFrameDurationlomOqCM;
            this.Camera2StreamConfigurationMap = pKIXExtendedParameters.getHighSpeedVideoFpsRangesFor;
            this.getOutputMinFrameDuration = pKIXExtendedParameters.getOutputMinFrameDuration;
            this.getHighSpeedVideoFpsRanges = new java.util.ArrayList(pKIXExtendedParameters.getHighSpeedVideoSizes);
            this.getInputSizeshNQ4ISI = new java.util.HashMap(pKIXExtendedParameters.getInputSizeshNQ4ISI);
            this.getHighSpeedVideoSizes = new java.util.ArrayList(pKIXExtendedParameters.Camera2StreamConfigurationMap);
            this.getHighSpeedVideoFpsRangesFor = new java.util.HashMap(pKIXExtendedParameters.getHighSpeedVideoFpsRanges);
            this.getHighSpeedVideoSizesFor = pKIXExtendedParameters.getInputFormats;
            this.getOutputSizes = pKIXExtendedParameters.getOutputSizeshNQ4ISI;
            this.getInputFormats = pKIXExtendedParameters.isRevocationEnabled();
            this.getOutputFormats = pKIXExtendedParameters.getTrustAnchors();
        }

        public Builder(java.security.cert.PKIXParameters pKIXParameters) {
            this.getHighSpeedVideoFpsRanges = new java.util.ArrayList();
            this.getInputSizeshNQ4ISI = new java.util.HashMap();
            this.getHighSpeedVideoSizes = new java.util.ArrayList();
            this.getHighSpeedVideoFpsRangesFor = new java.util.HashMap();
            this.getOutputSizes = 0;
            this.getHighSpeedVideoSizesFor = false;
            this.getHighResolutionOutputSizeshNQ4ISI = (java.security.cert.PKIXParameters) pKIXParameters.clone();
            java.security.cert.CertSelector targetCertConstraints = pKIXParameters.getTargetCertConstraints();
            if (targetCertConstraints != null) {
                this.getOutputMinFrameDuration = new org.bouncycastle.jcajce.PKIXCertStoreSelector.Builder(targetCertConstraints).build();
            }
            java.util.Date date = pKIXParameters.getDate();
            this.getOutputStallDuration = date;
            this.Camera2StreamConfigurationMap = date == null ? new java.util.Date() : date;
            this.getInputFormats = pKIXParameters.isRevocationEnabled();
            this.getOutputFormats = pKIXParameters.getTrustAnchors();
        }
    }

    public java.util.Date getValidityDate() {
        if (this.getOutputMinFrameDurationlomOqCM == null) {
            return null;
        }
        return new java.util.Date(this.getOutputMinFrameDurationlomOqCM.getTime());
    }

    public java.util.Set getTrustAnchors() {
        return this.getHighSpeedVideoSizesFor;
    }

    public org.bouncycastle.jcajce.PKIXCertStoreSelector getTargetConstraints() {
        return this.getOutputMinFrameDuration;
    }

    public java.lang.String getSigProvider() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getSigProvider();
    }

    public boolean getPolicyQualifiersRejected() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getPolicyQualifiersRejected();
    }

    public java.util.Map<org.bouncycastle.asn1.x509.GeneralName, org.bouncycastle.jcajce.PKIXCertStore> getNamedCertificateStoreMap() {
        return this.getInputSizeshNQ4ISI;
    }

    public java.util.Map<org.bouncycastle.asn1.x509.GeneralName, org.bouncycastle.jcajce.PKIXCRLStore> getNamedCRLStoreMap() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public java.util.Set getInitialPolicies() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getInitialPolicies();
    }

    public java.util.Date getDate() {
        return new java.util.Date(this.getHighSpeedVideoFpsRangesFor.getTime());
    }

    public java.util.List<org.bouncycastle.jcajce.PKIXCertStore> getCertificateStores() {
        return this.getHighSpeedVideoSizes;
    }

    public java.util.List<java.security.cert.CertStore> getCertStores() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getCertStores();
    }

    public java.util.List getCertPathCheckers() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getCertPathCheckers();
    }

    public java.util.List<org.bouncycastle.jcajce.PKIXCRLStore> getCRLStores() {
        return this.Camera2StreamConfigurationMap;
    }

    /* synthetic */ PKIXExtendedParameters(org.bouncycastle.jcajce.PKIXExtendedParameters.Builder builder, byte b) {
        this(builder);
    }

    private PKIXExtendedParameters(org.bouncycastle.jcajce.PKIXExtendedParameters.Builder builder) {
        this.getHighResolutionOutputSizeshNQ4ISI = builder.getHighResolutionOutputSizeshNQ4ISI;
        this.getOutputMinFrameDurationlomOqCM = builder.getOutputStallDuration;
        this.getHighSpeedVideoFpsRangesFor = builder.Camera2StreamConfigurationMap;
        this.getHighSpeedVideoSizes = java.util.Collections.unmodifiableList(builder.getHighSpeedVideoFpsRanges);
        this.getInputSizeshNQ4ISI = java.util.Collections.unmodifiableMap(new java.util.HashMap(builder.getInputSizeshNQ4ISI));
        this.Camera2StreamConfigurationMap = java.util.Collections.unmodifiableList(builder.getHighSpeedVideoSizes);
        this.getHighSpeedVideoFpsRanges = java.util.Collections.unmodifiableMap(new java.util.HashMap(builder.getHighSpeedVideoFpsRangesFor));
        this.getOutputMinFrameDuration = builder.getOutputMinFrameDuration;
        this.getOutputFormats = builder.getInputFormats;
        this.getInputFormats = builder.getHighSpeedVideoSizesFor;
        this.getOutputSizeshNQ4ISI = builder.getOutputSizes;
        this.getHighSpeedVideoSizesFor = java.util.Collections.unmodifiableSet(builder.getOutputFormats);
    }
}
