package org.bouncycastle.jce.provider;

/* loaded from: classes17.dex */
public class PKIXAttrCertPathBuilderSpi extends java.security.cert.CertPathBuilderSpi {
    @Override // java.security.cert.CertPathBuilderSpi
    public java.security.cert.CertPathBuilderResult engineBuild(java.security.cert.CertPathParameters certPathParameters) throws java.security.cert.CertPathBuilderException, java.security.InvalidAlgorithmParameterException {
        org.bouncycastle.jcajce.PKIXExtendedBuilderParameters pKIXExtendedBuilderParameters;
        boolean z = certPathParameters instanceof java.security.cert.PKIXBuilderParameters;
        if (!z && !(certPathParameters instanceof org.bouncycastle.x509.ExtendedPKIXBuilderParameters) && !(certPathParameters instanceof org.bouncycastle.jcajce.PKIXExtendedBuilderParameters)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Parameters must be an instance of ");
            sb.append(java.security.cert.PKIXBuilderParameters.class.getName());
            sb.append(" or ");
            sb.append(org.bouncycastle.jcajce.PKIXExtendedBuilderParameters.class.getName());
            sb.append(".");
            throw new java.security.InvalidAlgorithmParameterException(sb.toString());
        }
        new java.util.ArrayList();
        if (z) {
            org.bouncycastle.jcajce.PKIXExtendedBuilderParameters.Builder builder = new org.bouncycastle.jcajce.PKIXExtendedBuilderParameters.Builder((java.security.cert.PKIXBuilderParameters) certPathParameters);
            if (certPathParameters instanceof org.bouncycastle.x509.ExtendedPKIXParameters) {
                org.bouncycastle.x509.ExtendedPKIXBuilderParameters extendedPKIXBuilderParameters = (org.bouncycastle.x509.ExtendedPKIXBuilderParameters) certPathParameters;
                builder.addExcludedCerts(extendedPKIXBuilderParameters.getExcludedCerts());
                builder.setMaxPathLength(extendedPKIXBuilderParameters.getMaxPathLength());
                extendedPKIXBuilderParameters.getStores();
            }
            pKIXExtendedBuilderParameters = builder.build();
        } else {
            pKIXExtendedBuilderParameters = (org.bouncycastle.jcajce.PKIXExtendedBuilderParameters) certPathParameters;
        }
        new java.util.ArrayList();
        pKIXExtendedBuilderParameters.getBaseParameters().getTargetConstraints();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("TargetConstraints must be an instance of ");
        sb2.append(org.bouncycastle.x509.X509AttributeCertStoreSelector.class.getName());
        sb2.append(" for ");
        sb2.append(getClass().getName());
        sb2.append(" class.");
        throw new java.security.cert.CertPathBuilderException(sb2.toString());
    }

    protected static java.util.Collection findCertificates(org.bouncycastle.x509.X509AttributeCertStoreSelector x509AttributeCertStoreSelector, java.util.List list) throws org.bouncycastle.jce.provider.AnnotatedException {
        java.util.HashSet hashSet = new java.util.HashSet();
        for (java.lang.Object obj : list) {
            if (obj instanceof org.bouncycastle.util.Store) {
                try {
                    hashSet.addAll(((org.bouncycastle.util.Store) obj).getMatches(x509AttributeCertStoreSelector));
                } catch (org.bouncycastle.util.StoreException e) {
                    throw new org.bouncycastle.jce.provider.AnnotatedException("Problem while picking certificates from X.509 store.", e);
                }
            }
        }
        return hashSet;
    }
}
