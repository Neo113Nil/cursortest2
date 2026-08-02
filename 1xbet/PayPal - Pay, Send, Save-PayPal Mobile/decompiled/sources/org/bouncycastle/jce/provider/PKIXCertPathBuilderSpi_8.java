package org.bouncycastle.jce.provider;

/* loaded from: classes17.dex */
public class PKIXCertPathBuilderSpi_8 extends java.security.cert.CertPathBuilderSpi {
    private final boolean getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.Exception getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.jcajce.util.JcaJceHelper getHighSpeedVideoFpsRangesFor;

    @Override // java.security.cert.CertPathBuilderSpi
    public java.security.cert.PKIXCertPathChecker engineGetRevocationChecker() {
        return new org.bouncycastle.jce.provider.ProvRevocationChecker(this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // java.security.cert.CertPathBuilderSpi
    public java.security.cert.CertPathBuilderResult engineBuild(java.security.cert.CertPathParameters certPathParameters) throws java.security.cert.CertPathBuilderException, java.security.InvalidAlgorithmParameterException {
        org.bouncycastle.jcajce.PKIXExtendedBuilderParameters pKIXExtendedBuilderParameters;
        java.lang.Exception exc;
        org.bouncycastle.jcajce.PKIXExtendedBuilderParameters.Builder builder;
        if (certPathParameters instanceof java.security.cert.PKIXBuilderParameters) {
            java.security.cert.PKIXBuilderParameters pKIXBuilderParameters = (java.security.cert.PKIXBuilderParameters) certPathParameters;
            org.bouncycastle.jcajce.PKIXExtendedParameters.Builder builder2 = new org.bouncycastle.jcajce.PKIXExtendedParameters.Builder(pKIXBuilderParameters);
            if (certPathParameters instanceof org.bouncycastle.x509.ExtendedPKIXParameters) {
                org.bouncycastle.x509.ExtendedPKIXBuilderParameters extendedPKIXBuilderParameters = (org.bouncycastle.x509.ExtendedPKIXBuilderParameters) certPathParameters;
                java.util.Iterator it = extendedPKIXBuilderParameters.getAdditionalStores().iterator();
                while (it.hasNext()) {
                    builder2.addCertificateStore((org.bouncycastle.jcajce.PKIXCertStore) it.next());
                }
                builder = new org.bouncycastle.jcajce.PKIXExtendedBuilderParameters.Builder(builder2.build());
                builder.addExcludedCerts(extendedPKIXBuilderParameters.getExcludedCerts());
                builder.setMaxPathLength(extendedPKIXBuilderParameters.getMaxPathLength());
            } else {
                builder = new org.bouncycastle.jcajce.PKIXExtendedBuilderParameters.Builder(pKIXBuilderParameters);
            }
            pKIXExtendedBuilderParameters = builder.build();
        } else {
            if (!(certPathParameters instanceof org.bouncycastle.jcajce.PKIXExtendedBuilderParameters)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Parameters must be an instance of ");
                sb.append(java.security.cert.PKIXBuilderParameters.class.getName());
                sb.append(" or ");
                sb.append(org.bouncycastle.jcajce.PKIXExtendedBuilderParameters.class.getName());
                sb.append(".");
                throw new java.security.InvalidAlgorithmParameterException(sb.toString());
            }
            pKIXExtendedBuilderParameters = (org.bouncycastle.jcajce.PKIXExtendedBuilderParameters) certPathParameters;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it2 = org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighSpeedVideoFpsRangesFor(pKIXExtendedBuilderParameters).iterator();
        java.security.cert.CertPathBuilderResult certPathBuilderResult = null;
        while (it2.hasNext() && certPathBuilderResult == null) {
            certPathBuilderResult = build((java.security.cert.X509Certificate) it2.next(), pKIXExtendedBuilderParameters, arrayList);
        }
        if (certPathBuilderResult == null && (exc = this.getHighSpeedVideoFpsRanges) != null) {
            if (exc instanceof org.bouncycastle.jce.provider.AnnotatedException) {
                throw new java.security.cert.CertPathBuilderException(this.getHighSpeedVideoFpsRanges.getMessage(), this.getHighSpeedVideoFpsRanges.getCause());
            }
            throw new java.security.cert.CertPathBuilderException("Possible certificate chain could not be validated.", this.getHighSpeedVideoFpsRanges);
        }
        if (certPathBuilderResult == null && this.getHighSpeedVideoFpsRanges == null) {
            throw new java.security.cert.CertPathBuilderException("Unable to find certificate chain.");
        }
        return certPathBuilderResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected java.security.cert.CertPathBuilderResult build(java.security.cert.X509Certificate x509Certificate, org.bouncycastle.jcajce.PKIXExtendedBuilderParameters pKIXExtendedBuilderParameters, java.util.List list) {
        org.bouncycastle.jcajce.provider.asymmetric.x509.CertificateFactory certificateFactory;
        org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi_8 pKIXCertPathValidatorSpi_8;
        java.security.cert.CertPathBuilderResult certPathBuilderResult = null;
        if (list.contains(x509Certificate) || pKIXExtendedBuilderParameters.getExcludedCerts().contains(x509Certificate)) {
            return null;
        }
        if (pKIXExtendedBuilderParameters.getMaxPathLength() != -1 && list.size() - 1 > pKIXExtendedBuilderParameters.getMaxPathLength()) {
            return null;
        }
        list.add(x509Certificate);
        try {
            try {
                certificateFactory = new org.bouncycastle.jcajce.provider.asymmetric.x509.CertificateFactory();
                pKIXCertPathValidatorSpi_8 = new org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi_8(this.getHighResolutionOutputSizeshNQ4ISI);
            } catch (java.lang.Exception unused) {
                throw new java.lang.RuntimeException("Exception creating support classes.");
            }
        } catch (org.bouncycastle.jce.provider.AnnotatedException e) {
            this.getHighSpeedVideoFpsRanges = e;
        }
        if (org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighSpeedVideoSizes(x509Certificate, pKIXExtendedBuilderParameters.getBaseParameters().getTrustAnchors(), pKIXExtendedBuilderParameters.getBaseParameters().getSigProvider())) {
            try {
                java.security.cert.CertPath engineGenerateCertPath = certificateFactory.engineGenerateCertPath((java.util.List<? extends java.security.cert.Certificate>) list);
                try {
                    java.security.cert.PKIXCertPathValidatorResult pKIXCertPathValidatorResult = (java.security.cert.PKIXCertPathValidatorResult) pKIXCertPathValidatorSpi_8.engineValidate(engineGenerateCertPath, pKIXExtendedBuilderParameters);
                    return new java.security.cert.PKIXCertPathBuilderResult(engineGenerateCertPath, pKIXCertPathValidatorResult.getTrustAnchor(), pKIXCertPathValidatorResult.getPolicyTree(), pKIXCertPathValidatorResult.getPublicKey());
                } catch (java.lang.Exception e2) {
                    throw new org.bouncycastle.jce.provider.AnnotatedException("Certification path could not be validated.", e2);
                }
            } catch (java.lang.Exception e3) {
                throw new org.bouncycastle.jce.provider.AnnotatedException("Certification path could not be constructed from certificate list.", e3);
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(pKIXExtendedBuilderParameters.getBaseParameters().getCertificateStores());
        try {
            arrayList.addAll(org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighSpeedVideoFpsRanges(x509Certificate.getExtensionValue(org.bouncycastle.asn1.x509.Extension.issuerAlternativeName.getId()), pKIXExtendedBuilderParameters.getBaseParameters().getNamedCertificateStoreMap()));
            java.util.HashSet hashSet = new java.util.HashSet();
            try {
                hashSet.addAll(org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighSpeedVideoFpsRangesFor(x509Certificate, pKIXExtendedBuilderParameters.getBaseParameters().getCertStores(), arrayList));
                if (hashSet.isEmpty()) {
                    throw new org.bouncycastle.jce.provider.AnnotatedException("No issuer certificate for certificate in certification path found.");
                }
                java.util.Iterator it = hashSet.iterator();
                while (it.hasNext() && certPathBuilderResult == null) {
                    certPathBuilderResult = build((java.security.cert.X509Certificate) it.next(), pKIXExtendedBuilderParameters, list);
                }
                if (certPathBuilderResult == null) {
                    list.remove(x509Certificate);
                }
                return certPathBuilderResult;
            } catch (org.bouncycastle.jce.provider.AnnotatedException e4) {
                throw new org.bouncycastle.jce.provider.AnnotatedException("Cannot find issuer certificate for certificate in certification path.", e4);
            }
        } catch (java.security.cert.CertificateParsingException e5) {
            throw new org.bouncycastle.jce.provider.AnnotatedException("No additional X.509 stores can be added from certificate locations.", e5);
        }
        this.getHighSpeedVideoFpsRanges = e;
        if (certPathBuilderResult == null) {
        }
        return certPathBuilderResult;
    }

    PKIXCertPathBuilderSpi_8(boolean z) {
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.jcajce.util.BCJcaJceHelper();
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }

    public PKIXCertPathBuilderSpi_8() {
        this(false);
    }
}
