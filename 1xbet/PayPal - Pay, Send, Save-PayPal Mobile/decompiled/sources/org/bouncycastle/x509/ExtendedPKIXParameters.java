package org.bouncycastle.x509;

/* loaded from: classes17.dex */
public class ExtendedPKIXParameters extends java.security.cert.PKIXParameters {
    public static final int CHAIN_VALIDITY_MODEL = 1;
    public static final int PKIX_VALIDITY_MODEL = 0;
    private java.util.Set Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private java.util.Set getHighSpeedVideoFpsRanges;
    private java.util.Set getHighSpeedVideoFpsRangesFor;
    private java.util.List getHighSpeedVideoSizes;
    private java.util.List getHighSpeedVideoSizesFor;
    private java.util.Set getInputFormats;
    private int getInputSizeshNQ4ISI;
    private org.bouncycastle.util.Selector getOutputFormats;
    private boolean getOutputMinFrameDuration;

    public void setValidityModel(int i) {
        this.getInputSizeshNQ4ISI = i;
    }

    public void setUseDeltasEnabled(boolean z) {
        this.getOutputMinFrameDuration = z;
    }

    public void setTrustedACIssuers(java.util.Set set) {
        if (set == null) {
            this.getInputFormats.clear();
            return;
        }
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!(it.next() instanceof java.security.cert.TrustAnchor)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("All elements of set must be of type ");
                sb.append(java.security.cert.TrustAnchor.class.getName());
                sb.append(".");
                throw new java.lang.ClassCastException(sb.toString());
            }
        }
        this.getInputFormats.clear();
        this.getInputFormats.addAll(set);
    }

    public void setTargetConstraints(org.bouncycastle.util.Selector selector) {
        this.getOutputFormats = selector != null ? (org.bouncycastle.util.Selector) selector.clone() : null;
    }

    @Override // java.security.cert.PKIXParameters
    public void setTargetCertConstraints(java.security.cert.CertSelector certSelector) {
        super.setTargetCertConstraints(certSelector);
        this.getOutputFormats = certSelector != null ? org.bouncycastle.x509.X509CertStoreSelector.getInstance((java.security.cert.X509CertSelector) certSelector) : null;
    }

    public void setStores(java.util.List list) {
        if (list == null) {
            this.getHighSpeedVideoSizesFor = new java.util.ArrayList();
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!(it.next() instanceof org.bouncycastle.util.Store)) {
                throw new java.lang.ClassCastException("All elements of list must be of type org.bouncycastle.util.Store.");
            }
        }
        this.getHighSpeedVideoSizesFor = new java.util.ArrayList(list);
    }

    public void setProhibitedACAttributes(java.util.Set set) {
        if (set == null) {
            this.getHighSpeedVideoFpsRangesFor.clear();
            return;
        }
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!(it.next() instanceof java.lang.String)) {
                throw new java.lang.ClassCastException("All elements of set must be of type String.");
            }
        }
        this.getHighSpeedVideoFpsRangesFor.clear();
        this.getHighSpeedVideoFpsRangesFor.addAll(set);
    }

    protected void setParams(java.security.cert.PKIXParameters pKIXParameters) {
        setDate(pKIXParameters.getDate());
        setCertPathCheckers(pKIXParameters.getCertPathCheckers());
        setCertStores(pKIXParameters.getCertStores());
        setAnyPolicyInhibited(pKIXParameters.isAnyPolicyInhibited());
        setExplicitPolicyRequired(pKIXParameters.isExplicitPolicyRequired());
        setPolicyMappingInhibited(pKIXParameters.isPolicyMappingInhibited());
        setRevocationEnabled(pKIXParameters.isRevocationEnabled());
        setInitialPolicies(pKIXParameters.getInitialPolicies());
        setPolicyQualifiersRejected(pKIXParameters.getPolicyQualifiersRejected());
        setSigProvider(pKIXParameters.getSigProvider());
        setTargetCertConstraints(pKIXParameters.getTargetCertConstraints());
        try {
            setTrustAnchors(pKIXParameters.getTrustAnchors());
            if (pKIXParameters instanceof org.bouncycastle.x509.ExtendedPKIXParameters) {
                org.bouncycastle.x509.ExtendedPKIXParameters extendedPKIXParameters = (org.bouncycastle.x509.ExtendedPKIXParameters) pKIXParameters;
                this.getInputSizeshNQ4ISI = extendedPKIXParameters.getInputSizeshNQ4ISI;
                this.getOutputMinFrameDuration = extendedPKIXParameters.getOutputMinFrameDuration;
                this.getHighResolutionOutputSizeshNQ4ISI = extendedPKIXParameters.getHighResolutionOutputSizeshNQ4ISI;
                org.bouncycastle.util.Selector selector = extendedPKIXParameters.getOutputFormats;
                this.getOutputFormats = selector == null ? null : (org.bouncycastle.util.Selector) selector.clone();
                this.getHighSpeedVideoSizesFor = new java.util.ArrayList(extendedPKIXParameters.getHighSpeedVideoSizesFor);
                this.getHighSpeedVideoSizes = new java.util.ArrayList(extendedPKIXParameters.getHighSpeedVideoSizes);
                this.getInputFormats = new java.util.HashSet(extendedPKIXParameters.getInputFormats);
                this.getHighSpeedVideoFpsRangesFor = new java.util.HashSet(extendedPKIXParameters.getHighSpeedVideoFpsRangesFor);
                this.getHighSpeedVideoFpsRanges = new java.util.HashSet(extendedPKIXParameters.getHighSpeedVideoFpsRanges);
                this.Camera2StreamConfigurationMap = new java.util.HashSet(extendedPKIXParameters.Camera2StreamConfigurationMap);
            }
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException(e.getMessage());
        }
    }

    public void setNecessaryACAttributes(java.util.Set set) {
        if (set == null) {
            this.getHighSpeedVideoFpsRanges.clear();
            return;
        }
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!(it.next() instanceof java.lang.String)) {
                throw new java.lang.ClassCastException("All elements of set must be of type String.");
            }
        }
        this.getHighSpeedVideoFpsRanges.clear();
        this.getHighSpeedVideoFpsRanges.addAll(set);
    }

    @Override // java.security.cert.PKIXParameters
    public void setCertStores(java.util.List list) {
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                addCertStore((java.security.cert.CertStore) it.next());
            }
        }
    }

    public void setAttrCertCheckers(java.util.Set set) {
        if (set == null) {
            this.Camera2StreamConfigurationMap.clear();
            return;
        }
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!(it.next() instanceof org.bouncycastle.x509.PKIXAttrCertChecker)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("All elements of set must be of type ");
                sb.append(org.bouncycastle.x509.PKIXAttrCertChecker.class.getName());
                sb.append(".");
                throw new java.lang.ClassCastException(sb.toString());
            }
        }
        this.Camera2StreamConfigurationMap.clear();
        this.Camera2StreamConfigurationMap.addAll(set);
    }

    public void setAdditionalLocationsEnabled(boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }

    public boolean isUseDeltasEnabled() {
        return this.getOutputMinFrameDuration;
    }

    public boolean isAdditionalLocationsEnabled() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public int getValidityModel() {
        return this.getInputSizeshNQ4ISI;
    }

    public java.util.Set getTrustedACIssuers() {
        return java.util.Collections.unmodifiableSet(this.getInputFormats);
    }

    public org.bouncycastle.util.Selector getTargetConstraints() {
        org.bouncycastle.util.Selector selector = this.getOutputFormats;
        if (selector != null) {
            return (org.bouncycastle.util.Selector) selector.clone();
        }
        return null;
    }

    public java.util.List getStores() {
        return java.util.Collections.unmodifiableList(new java.util.ArrayList(this.getHighSpeedVideoSizesFor));
    }

    public java.util.Set getProhibitedACAttributes() {
        return java.util.Collections.unmodifiableSet(this.getHighSpeedVideoFpsRangesFor);
    }

    public java.util.Set getNecessaryACAttributes() {
        return java.util.Collections.unmodifiableSet(this.getHighSpeedVideoFpsRanges);
    }

    public java.util.Set getAttrCertCheckers() {
        return java.util.Collections.unmodifiableSet(this.Camera2StreamConfigurationMap);
    }

    public java.util.List getAdditionalStores() {
        return java.util.Collections.unmodifiableList(this.getHighSpeedVideoSizes);
    }

    @Override // java.security.cert.PKIXParameters, java.security.cert.CertPathParameters
    public java.lang.Object clone() {
        try {
            org.bouncycastle.x509.ExtendedPKIXParameters extendedPKIXParameters = new org.bouncycastle.x509.ExtendedPKIXParameters(getTrustAnchors());
            extendedPKIXParameters.setParams(this);
            return extendedPKIXParameters;
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException(e.getMessage());
        }
    }

    public void addStore(org.bouncycastle.util.Store store) {
        if (store != null) {
            this.getHighSpeedVideoSizesFor.add(store);
        }
    }

    public void addAdditionalStore(org.bouncycastle.util.Store store) {
        if (store != null) {
            this.getHighSpeedVideoSizes.add(store);
        }
    }

    public void addAddionalStore(org.bouncycastle.util.Store store) {
        addAdditionalStore(store);
    }

    public static org.bouncycastle.x509.ExtendedPKIXParameters getInstance(java.security.cert.PKIXParameters pKIXParameters) {
        try {
            org.bouncycastle.x509.ExtendedPKIXParameters extendedPKIXParameters = new org.bouncycastle.x509.ExtendedPKIXParameters(pKIXParameters.getTrustAnchors());
            extendedPKIXParameters.setParams(pKIXParameters);
            return extendedPKIXParameters;
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException(e.getMessage());
        }
    }

    public ExtendedPKIXParameters(java.util.Set set) throws java.security.InvalidAlgorithmParameterException {
        super((java.util.Set<java.security.cert.TrustAnchor>) set);
        this.getInputSizeshNQ4ISI = 0;
        this.getOutputMinFrameDuration = false;
        this.getHighSpeedVideoSizesFor = new java.util.ArrayList();
        this.getHighSpeedVideoSizes = new java.util.ArrayList();
        this.getInputFormats = new java.util.HashSet();
        this.getHighSpeedVideoFpsRanges = new java.util.HashSet();
        this.getHighSpeedVideoFpsRangesFor = new java.util.HashSet();
        this.Camera2StreamConfigurationMap = new java.util.HashSet();
    }
}
