package org.bouncycastle.jce.provider;

/* loaded from: classes17.dex */
public class PKIXAttrCertPathValidatorSpi extends java.security.cert.CertPathValidatorSpi {
    private final org.bouncycastle.jcajce.util.JcaJceHelper getHighSpeedVideoSizes = new org.bouncycastle.jcajce.util.BCJcaJceHelper();

    @Override // java.security.cert.CertPathValidatorSpi
    public java.security.cert.CertPathValidatorResult engineValidate(java.security.cert.CertPath certPath, java.security.cert.CertPathParameters certPathParameters) throws java.security.cert.CertPathValidatorException, java.security.InvalidAlgorithmParameterException {
        org.bouncycastle.jcajce.PKIXExtendedParameters pKIXExtendedParameters;
        boolean z = certPathParameters instanceof org.bouncycastle.x509.ExtendedPKIXParameters;
        if (!z && !(certPathParameters instanceof org.bouncycastle.jcajce.PKIXExtendedParameters)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Parameters must be a ");
            sb.append(org.bouncycastle.x509.ExtendedPKIXParameters.class.getName());
            sb.append(" instance.");
            throw new java.security.InvalidAlgorithmParameterException(sb.toString());
        }
        new java.util.HashSet();
        new java.util.HashSet();
        new java.util.HashSet();
        new java.util.HashSet();
        if (certPathParameters instanceof java.security.cert.PKIXParameters) {
            org.bouncycastle.jcajce.PKIXExtendedParameters.Builder builder = new org.bouncycastle.jcajce.PKIXExtendedParameters.Builder((java.security.cert.PKIXParameters) certPathParameters);
            if (z) {
                org.bouncycastle.x509.ExtendedPKIXParameters extendedPKIXParameters = (org.bouncycastle.x509.ExtendedPKIXParameters) certPathParameters;
                builder.setUseDeltasEnabled(extendedPKIXParameters.isUseDeltasEnabled());
                builder.setValidityModel(extendedPKIXParameters.getValidityModel());
                extendedPKIXParameters.getAttrCertCheckers();
                extendedPKIXParameters.getProhibitedACAttributes();
                extendedPKIXParameters.getNecessaryACAttributes();
            }
            pKIXExtendedParameters = builder.build();
        } else {
            pKIXExtendedParameters = (org.bouncycastle.jcajce.PKIXExtendedParameters) certPathParameters;
        }
        org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighSpeedVideoFpsRangesFor(pKIXExtendedParameters, new java.util.Date());
        pKIXExtendedParameters.getTargetConstraints();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("TargetConstraints must be an instance of ");
        sb2.append(org.bouncycastle.x509.X509AttributeCertStoreSelector.class.getName());
        sb2.append(" for ");
        sb2.append(getClass().getName());
        sb2.append(" class.");
        throw new java.security.InvalidAlgorithmParameterException(sb2.toString());
    }
}
