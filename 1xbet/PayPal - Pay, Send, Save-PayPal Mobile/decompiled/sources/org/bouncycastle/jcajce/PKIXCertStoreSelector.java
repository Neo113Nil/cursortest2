package org.bouncycastle.jcajce;

/* loaded from: classes17.dex */
public class PKIXCertStoreSelector<T extends java.security.cert.Certificate> implements org.bouncycastle.util.Selector<T> {
    private final java.security.cert.CertSelector getHighResolutionOutputSizeshNQ4ISI;

    @Override // org.bouncycastle.util.Selector
    public boolean match(java.security.cert.Certificate certificate) {
        return this.getHighResolutionOutputSizeshNQ4ISI.match(certificate);
    }

    public java.security.cert.Certificate getCertificate() {
        java.security.cert.CertSelector certSelector = this.getHighResolutionOutputSizeshNQ4ISI;
        if (certSelector instanceof java.security.cert.X509CertSelector) {
            return ((java.security.cert.X509CertSelector) certSelector).getCertificate();
        }
        return null;
    }

    @Override // org.bouncycastle.util.Selector
    public java.lang.Object clone() {
        return new org.bouncycastle.jcajce.PKIXCertStoreSelector(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public static java.util.Collection<? extends java.security.cert.Certificate> getCertificates(org.bouncycastle.jcajce.PKIXCertStoreSelector pKIXCertStoreSelector, java.security.cert.CertStore certStore) throws java.security.cert.CertStoreException {
        return certStore.getCertificates(new org.bouncycastle.jcajce.PKIXCertStoreSelector.SelectorClone(pKIXCertStoreSelector));
    }

    public static class Builder {
        private final java.security.cert.CertSelector getHighSpeedVideoSizes;

        public org.bouncycastle.jcajce.PKIXCertStoreSelector<? extends java.security.cert.Certificate> build() {
            return new org.bouncycastle.jcajce.PKIXCertStoreSelector<>(this.getHighSpeedVideoSizes, (byte) 0);
        }

        public Builder(java.security.cert.CertSelector certSelector) {
            this.getHighSpeedVideoSizes = (java.security.cert.CertSelector) certSelector.clone();
        }
    }

    static class SelectorClone extends java.security.cert.X509CertSelector {
        private final org.bouncycastle.jcajce.PKIXCertStoreSelector getHighResolutionOutputSizeshNQ4ISI;

        @Override // java.security.cert.X509CertSelector, java.security.cert.CertSelector
        public boolean match(java.security.cert.Certificate certificate) {
            org.bouncycastle.jcajce.PKIXCertStoreSelector pKIXCertStoreSelector = this.getHighResolutionOutputSizeshNQ4ISI;
            return pKIXCertStoreSelector == null ? certificate != null : pKIXCertStoreSelector.match(certificate);
        }

        SelectorClone(org.bouncycastle.jcajce.PKIXCertStoreSelector pKIXCertStoreSelector) {
            this.getHighResolutionOutputSizeshNQ4ISI = pKIXCertStoreSelector;
            if (pKIXCertStoreSelector.getHighResolutionOutputSizeshNQ4ISI instanceof java.security.cert.X509CertSelector) {
                java.security.cert.X509CertSelector x509CertSelector = (java.security.cert.X509CertSelector) pKIXCertStoreSelector.getHighResolutionOutputSizeshNQ4ISI;
                setAuthorityKeyIdentifier(x509CertSelector.getAuthorityKeyIdentifier());
                setBasicConstraints(x509CertSelector.getBasicConstraints());
                setCertificate(x509CertSelector.getCertificate());
                setCertificateValid(x509CertSelector.getCertificateValid());
                setKeyUsage(x509CertSelector.getKeyUsage());
                setMatchAllSubjectAltNames(x509CertSelector.getMatchAllSubjectAltNames());
                setPrivateKeyValid(x509CertSelector.getPrivateKeyValid());
                setSerialNumber(x509CertSelector.getSerialNumber());
                setSubjectKeyIdentifier(x509CertSelector.getSubjectKeyIdentifier());
                setSubjectPublicKey(x509CertSelector.getSubjectPublicKey());
                try {
                    setExtendedKeyUsage(x509CertSelector.getExtendedKeyUsage());
                    setIssuer(x509CertSelector.getIssuerAsBytes());
                    setNameConstraints(x509CertSelector.getNameConstraints());
                    setPathToNames(x509CertSelector.getPathToNames());
                    setPolicy(x509CertSelector.getPolicy());
                    setSubject(x509CertSelector.getSubjectAsBytes());
                    setSubjectAlternativeNames(x509CertSelector.getSubjectAlternativeNames());
                    setSubjectPublicKeyAlgID(x509CertSelector.getSubjectPublicKeyAlgID());
                } catch (java.io.IOException e) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("base selector invalid: ");
                    sb.append(e.getMessage());
                    throw new java.lang.IllegalStateException(sb.toString(), e);
                }
            }
        }
    }

    /* synthetic */ PKIXCertStoreSelector(java.security.cert.CertSelector certSelector, byte b) {
        this(certSelector);
    }

    private PKIXCertStoreSelector(java.security.cert.CertSelector certSelector) {
        this.getHighResolutionOutputSizeshNQ4ISI = certSelector;
    }
}
