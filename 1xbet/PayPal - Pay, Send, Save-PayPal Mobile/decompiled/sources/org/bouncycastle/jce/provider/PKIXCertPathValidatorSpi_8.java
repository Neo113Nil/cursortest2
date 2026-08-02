package org.bouncycastle.jce.provider;

/* loaded from: classes17.dex */
public class PKIXCertPathValidatorSpi_8 extends java.security.cert.CertPathValidatorSpi {
    private final boolean Camera2StreamConfigurationMap;
    private final org.bouncycastle.jcajce.util.JcaJceHelper getHighSpeedVideoFpsRanges;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.security.cert.CertPathValidatorSpi
    public java.security.cert.CertPathValidatorResult engineValidate(java.security.cert.CertPath certPath, java.security.cert.CertPathParameters certPathParameters) throws java.security.cert.CertPathValidatorException, java.security.InvalidAlgorithmParameterException {
        org.bouncycastle.jcajce.PKIXExtendedParameters pKIXExtendedParameters;
        int i;
        java.util.List<? extends java.security.cert.Certificate> list;
        org.bouncycastle.asn1.x500.X500Name Camera2StreamConfigurationMap;
        java.security.PublicKey cAPublicKey;
        java.util.HashSet hashSet;
        java.util.ArrayList arrayList;
        int i2;
        java.util.HashSet hashSet2;
        if (certPathParameters instanceof java.security.cert.PKIXParameters) {
            org.bouncycastle.jcajce.PKIXExtendedParameters.Builder builder = new org.bouncycastle.jcajce.PKIXExtendedParameters.Builder((java.security.cert.PKIXParameters) certPathParameters);
            if (certPathParameters instanceof org.bouncycastle.x509.ExtendedPKIXParameters) {
                org.bouncycastle.x509.ExtendedPKIXParameters extendedPKIXParameters = (org.bouncycastle.x509.ExtendedPKIXParameters) certPathParameters;
                builder.setUseDeltasEnabled(extendedPKIXParameters.isUseDeltasEnabled());
                builder.setValidityModel(extendedPKIXParameters.getValidityModel());
            }
            pKIXExtendedParameters = builder.build();
        } else if (certPathParameters instanceof org.bouncycastle.jcajce.PKIXExtendedBuilderParameters) {
            pKIXExtendedParameters = ((org.bouncycastle.jcajce.PKIXExtendedBuilderParameters) certPathParameters).getBaseParameters();
        } else {
            if (!(certPathParameters instanceof org.bouncycastle.jcajce.PKIXExtendedParameters)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Parameters must be a ");
                sb.append(java.security.cert.PKIXParameters.class.getName());
                sb.append(" instance.");
                throw new java.security.InvalidAlgorithmParameterException(sb.toString());
            }
            pKIXExtendedParameters = (org.bouncycastle.jcajce.PKIXExtendedParameters) certPathParameters;
        }
        if (pKIXExtendedParameters.getTrustAnchors() == null) {
            throw new java.security.InvalidAlgorithmParameterException("trustAnchors is null, this is not allowed for certification path validation.");
        }
        java.util.List<? extends java.security.cert.Certificate> certificates = certPath.getCertificates();
        int size = certificates.size();
        if (certificates.isEmpty()) {
            throw new java.security.cert.CertPathValidatorException("Certification path is empty.", null, certPath, -1);
        }
        java.util.Date highSpeedVideoFpsRangesFor = org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighSpeedVideoFpsRangesFor(pKIXExtendedParameters, new java.util.Date());
        java.util.Set initialPolicies = pKIXExtendedParameters.getInitialPolicies();
        try {
            java.security.cert.TrustAnchor highSpeedVideoFpsRanges = org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighSpeedVideoFpsRanges((java.security.cert.X509Certificate) certificates.get(certificates.size() - 1), pKIXExtendedParameters.getTrustAnchors(), pKIXExtendedParameters.getSigProvider());
            if (highSpeedVideoFpsRanges == null) {
                i = 1;
                list = certificates;
                try {
                    throw new java.security.cert.CertPathValidatorException("Trust anchor for certification path not found.", null, certPath, -1);
                } catch (org.bouncycastle.jce.provider.AnnotatedException e) {
                    e = e;
                    throw new java.security.cert.CertPathValidatorException(e.getMessage(), e.getHighResolutionOutputSizeshNQ4ISI, certPath, list.size() - i);
                }
            }
            getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRanges.getTrustedCert());
            org.bouncycastle.jcajce.PKIXExtendedParameters build = new org.bouncycastle.jcajce.PKIXExtendedParameters.Builder(pKIXExtendedParameters).setTrustAnchor(highSpeedVideoFpsRanges).build();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            org.bouncycastle.jcajce.PKIXCertRevocationChecker pKIXCertRevocationChecker = null;
            for (java.security.cert.PKIXCertPathChecker pKIXCertPathChecker : build.getCertPathCheckers()) {
                pKIXCertPathChecker.init(false);
                if (!(pKIXCertPathChecker instanceof java.security.cert.PKIXRevocationChecker)) {
                    arrayList2.add(pKIXCertPathChecker);
                } else {
                    if (pKIXCertRevocationChecker != null) {
                        throw new java.security.cert.CertPathValidatorException("only one PKIXRevocationChecker allowed");
                    }
                    pKIXCertRevocationChecker = pKIXCertPathChecker instanceof org.bouncycastle.jcajce.PKIXCertRevocationChecker ? (org.bouncycastle.jcajce.PKIXCertRevocationChecker) pKIXCertPathChecker : new org.bouncycastle.jce.provider.WrappedRevocationChecker(pKIXCertPathChecker);
                }
            }
            if (build.isRevocationEnabled() && pKIXCertRevocationChecker == null) {
                pKIXCertRevocationChecker = new org.bouncycastle.jce.provider.ProvRevocationChecker(this.getHighSpeedVideoFpsRanges);
            }
            org.bouncycastle.jcajce.PKIXCertRevocationChecker pKIXCertRevocationChecker2 = pKIXCertRevocationChecker;
            int i3 = size + 1;
            java.util.ArrayList[] arrayListArr = new java.util.ArrayList[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                arrayListArr[i4] = new java.util.ArrayList();
            }
            java.util.HashSet hashSet3 = new java.util.HashSet();
            hashSet3.add("2.5.29.32.0");
            org.bouncycastle.jce.provider.PKIXPolicyNode pKIXPolicyNode = new org.bouncycastle.jce.provider.PKIXPolicyNode(new java.util.ArrayList(), 0, hashSet3, null, new java.util.HashSet(), "2.5.29.32.0", false);
            arrayListArr[0].add(pKIXPolicyNode);
            org.bouncycastle.jce.provider.PKIXNameConstraintValidator pKIXNameConstraintValidator = new org.bouncycastle.jce.provider.PKIXNameConstraintValidator();
            java.util.HashSet hashSet4 = new java.util.HashSet();
            int i5 = build.isExplicitPolicyRequired() ? 0 : i3;
            int i6 = build.isAnyPolicyInhibited() ? 0 : i3;
            if (build.isPolicyMappingInhibited()) {
                i3 = 0;
            }
            java.security.cert.X509Certificate trustedCert = highSpeedVideoFpsRanges.getTrustedCert();
            try {
                if (trustedCert != null) {
                    Camera2StreamConfigurationMap = org.bouncycastle.jce.provider.PrincipalUtils.getHighSpeedVideoFpsRanges(trustedCert);
                    cAPublicKey = trustedCert.getPublicKey();
                } else {
                    Camera2StreamConfigurationMap = org.bouncycastle.jce.provider.PrincipalUtils.Camera2StreamConfigurationMap(highSpeedVideoFpsRanges);
                    cAPublicKey = highSpeedVideoFpsRanges.getCAPublicKey();
                }
                try {
                    org.bouncycastle.asn1.x509.AlgorithmIdentifier highSpeedVideoSizes = org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighSpeedVideoSizes(cAPublicKey);
                    highSpeedVideoSizes.getAlgorithm();
                    highSpeedVideoSizes.getParameters();
                    if (build.getTargetConstraints() != null && !build.getTargetConstraints().match((java.security.cert.Certificate) certificates.get(0))) {
                        throw new org.bouncycastle.jce.exception.ExtCertPathValidatorException("Target certificate in certification path does not match targetConstraints.", null, certPath, 0);
                    }
                    int i7 = i3;
                    int i8 = size;
                    java.security.cert.X509Certificate x509Certificate = null;
                    int i9 = i6;
                    int size2 = certificates.size() - 1;
                    int i10 = i5;
                    org.bouncycastle.jce.provider.PKIXPolicyNode pKIXPolicyNode2 = pKIXPolicyNode;
                    while (size2 >= 0) {
                        int i11 = size - size2;
                        int i12 = size;
                        java.security.cert.X509Certificate x509Certificate2 = (java.security.cert.X509Certificate) certificates.get(size2);
                        boolean z = size2 == certificates.size() + (-1);
                        try {
                            getHighResolutionOutputSizeshNQ4ISI(x509Certificate2);
                            int i13 = i9;
                            java.util.List<? extends java.security.cert.Certificate> list2 = certificates;
                            int i14 = i10;
                            org.bouncycastle.jcajce.PKIXExtendedParameters pKIXExtendedParameters2 = build;
                            org.bouncycastle.jcajce.PKIXExtendedParameters pKIXExtendedParameters3 = build;
                            org.bouncycastle.jce.provider.PKIXNameConstraintValidator pKIXNameConstraintValidator2 = pKIXNameConstraintValidator;
                            int i15 = size2;
                            java.util.ArrayList[] arrayListArr2 = arrayListArr;
                            java.util.Date date = highSpeedVideoFpsRangesFor;
                            java.util.ArrayList arrayList3 = arrayList2;
                            boolean z2 = z;
                            java.security.cert.TrustAnchor trustAnchor = highSpeedVideoFpsRanges;
                            int i16 = i7;
                            org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getHighSpeedVideoFpsRangesFor(certPath, pKIXExtendedParameters2, highSpeedVideoFpsRangesFor, pKIXCertRevocationChecker2, i15, cAPublicKey, z2, Camera2StreamConfigurationMap, trustedCert);
                            org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getHighSpeedVideoSizes(certPath, i15, pKIXNameConstraintValidator2, this.Camera2StreamConfigurationMap);
                            org.bouncycastle.jce.provider.PKIXPolicyNode highSpeedVideoFpsRangesFor2 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getHighSpeedVideoFpsRangesFor(certPath, i15, org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getHighSpeedVideoFpsRangesFor(certPath, i15, hashSet4, pKIXPolicyNode2, arrayListArr2, i13, this.Camera2StreamConfigurationMap));
                            org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getHighSpeedVideoFpsRangesFor(certPath, i15, highSpeedVideoFpsRangesFor2, i14);
                            if (i11 != i12) {
                                if (x509Certificate2 == null || x509Certificate2.getVersion() != 1) {
                                    org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getHighSpeedVideoFpsRanges(certPath, i15);
                                    arrayListArr = arrayListArr2;
                                    org.bouncycastle.jce.provider.PKIXPolicyNode highSpeedVideoFpsRanges2 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getHighSpeedVideoFpsRanges(certPath, i15, arrayListArr, highSpeedVideoFpsRangesFor2, i16);
                                    org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getHighSpeedVideoFpsRangesFor(certPath, i15, pKIXNameConstraintValidator2);
                                    int Camera2StreamConfigurationMap2 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.Camera2StreamConfigurationMap(certPath, i15, i14);
                                    int highSpeedVideoFpsRanges3 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getHighSpeedVideoFpsRanges(certPath, i15, i16);
                                    int highSpeedVideoSizes2 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getHighSpeedVideoSizes(certPath, i15, i13);
                                    i2 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getHighSpeedVideoFpsRangesFor(certPath, i15, Camera2StreamConfigurationMap2);
                                    int highResolutionOutputSizeshNQ4ISI = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getHighResolutionOutputSizeshNQ4ISI(certPath, i15, highSpeedVideoFpsRanges3);
                                    int inputSizeshNQ4ISI = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getInputSizeshNQ4ISI(certPath, i15, highSpeedVideoSizes2);
                                    org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getHighResolutionOutputSizeshNQ4ISI(certPath, i15);
                                    i8 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getOutputFormats(certPath, i15, org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getHighSpeedVideoSizesFor(certPath, i15, i8));
                                    org.bouncycastle.jce.provider.RFC3280CertPathUtilities.Camera2StreamConfigurationMap(certPath, i15);
                                    java.util.Set<java.lang.String> criticalExtensionOIDs = x509Certificate2.getCriticalExtensionOIDs();
                                    if (criticalExtensionOIDs != null) {
                                        hashSet2 = new java.util.HashSet(criticalExtensionOIDs);
                                        hashSet2.remove(org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getOutputMinFrameDuration);
                                        hashSet2.remove(org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getHighSpeedVideoFpsRangesFor);
                                        hashSet2.remove(org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getOutputSizeshNQ4ISI);
                                        hashSet2.remove(org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getInputFormats);
                                        hashSet2.remove(org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getInputSizeshNQ4ISI);
                                        hashSet2.remove(org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getHighSpeedVideoSizesFor);
                                        hashSet2.remove(org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getOutputMinFrameDurationlomOqCM);
                                        hashSet2.remove(org.bouncycastle.jce.provider.RFC3280CertPathUtilities.Camera2StreamConfigurationMap);
                                        hashSet2.remove(org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getOutputStallDurationlomOqCM);
                                        hashSet2.remove(org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getOutputSizes);
                                    } else {
                                        hashSet2 = new java.util.HashSet();
                                    }
                                    arrayList = arrayList3;
                                    org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getHighResolutionOutputSizeshNQ4ISI(certPath, i15, hashSet2, arrayList);
                                    org.bouncycastle.asn1.x500.X500Name highSpeedVideoFpsRanges4 = org.bouncycastle.jce.provider.PrincipalUtils.getHighSpeedVideoFpsRanges(x509Certificate2);
                                    try {
                                        java.security.PublicKey highResolutionOutputSizeshNQ4ISI2 = org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighResolutionOutputSizeshNQ4ISI(certPath.getCertificates(), i15, this.getHighSpeedVideoFpsRanges);
                                        org.bouncycastle.asn1.x509.AlgorithmIdentifier highSpeedVideoSizes3 = org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighSpeedVideoSizes(highResolutionOutputSizeshNQ4ISI2);
                                        highSpeedVideoSizes3.getAlgorithm();
                                        highSpeedVideoSizes3.getParameters();
                                        pKIXPolicyNode2 = highSpeedVideoFpsRanges2;
                                        i9 = inputSizeshNQ4ISI;
                                        Camera2StreamConfigurationMap = highSpeedVideoFpsRanges4;
                                        cAPublicKey = highResolutionOutputSizeshNQ4ISI2;
                                        trustedCert = x509Certificate2;
                                        i7 = highResolutionOutputSizeshNQ4ISI;
                                        highSpeedVideoFpsRangesFor = date;
                                        x509Certificate = x509Certificate2;
                                        arrayList2 = arrayList;
                                        highSpeedVideoFpsRanges = trustAnchor;
                                        certificates = list2;
                                        size = i12;
                                        i10 = i2;
                                        size2 = i15 - 1;
                                        pKIXNameConstraintValidator = pKIXNameConstraintValidator2;
                                        build = pKIXExtendedParameters3;
                                    } catch (java.security.cert.CertPathValidatorException e2) {
                                        throw new java.security.cert.CertPathValidatorException("Next working key could not be retrieved.", e2, certPath, i15);
                                    }
                                } else if (i11 != 1 || !x509Certificate2.equals(trustAnchor.getTrustedCert())) {
                                    throw new java.security.cert.CertPathValidatorException("Version 1 certificates can't be used as CA ones.", null, certPath, i15);
                                }
                            }
                            arrayListArr = arrayListArr2;
                            arrayList = arrayList3;
                            pKIXPolicyNode2 = highSpeedVideoFpsRangesFor2;
                            i7 = i16;
                            i9 = i13;
                            i8 = i8;
                            i2 = i14;
                            highSpeedVideoFpsRangesFor = date;
                            x509Certificate = x509Certificate2;
                            arrayList2 = arrayList;
                            highSpeedVideoFpsRanges = trustAnchor;
                            certificates = list2;
                            size = i12;
                            i10 = i2;
                            size2 = i15 - 1;
                            pKIXNameConstraintValidator = pKIXNameConstraintValidator2;
                            build = pKIXExtendedParameters3;
                        } catch (org.bouncycastle.jce.provider.AnnotatedException e3) {
                            throw new java.security.cert.CertPathValidatorException(e3.getMessage(), e3.getHighResolutionOutputSizeshNQ4ISI, certPath, size2);
                        }
                    }
                    org.bouncycastle.jcajce.PKIXExtendedParameters pKIXExtendedParameters4 = build;
                    java.util.ArrayList arrayList4 = arrayList2;
                    java.security.cert.TrustAnchor trustAnchor2 = highSpeedVideoFpsRanges;
                    java.security.cert.X509Certificate x509Certificate3 = x509Certificate;
                    int i17 = size2;
                    int i18 = i17 + 1;
                    int inputFormats = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getInputFormats(certPath, i18, org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getHighSpeedVideoFpsRanges(i10, x509Certificate3));
                    java.util.Set<java.lang.String> criticalExtensionOIDs2 = x509Certificate3.getCriticalExtensionOIDs();
                    if (criticalExtensionOIDs2 != null) {
                        hashSet = new java.util.HashSet(criticalExtensionOIDs2);
                        hashSet.remove(org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getOutputMinFrameDuration);
                        hashSet.remove(org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getHighSpeedVideoFpsRangesFor);
                        hashSet.remove(org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getOutputSizeshNQ4ISI);
                        hashSet.remove(org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getInputFormats);
                        hashSet.remove(org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getInputSizeshNQ4ISI);
                        hashSet.remove(org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getHighSpeedVideoSizesFor);
                        hashSet.remove(org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getOutputMinFrameDurationlomOqCM);
                        hashSet.remove(org.bouncycastle.jce.provider.RFC3280CertPathUtilities.Camera2StreamConfigurationMap);
                        hashSet.remove(org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getOutputStallDurationlomOqCM);
                        hashSet.remove(org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getOutputSizes);
                        hashSet.remove(org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getHighSpeedVideoFpsRanges);
                        hashSet.remove(org.bouncycastle.asn1.x509.Extension.extendedKeyUsage.getId());
                    } else {
                        hashSet = new java.util.HashSet();
                    }
                    org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getHighSpeedVideoFpsRanges(certPath, i18, arrayList4, hashSet);
                    org.bouncycastle.jce.provider.PKIXPolicyNode highSpeedVideoFpsRanges5 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getHighSpeedVideoFpsRanges(certPath, pKIXExtendedParameters4, initialPolicies, i18, arrayListArr, pKIXPolicyNode2, hashSet4);
                    if (inputFormats > 0 || highSpeedVideoFpsRanges5 != null) {
                        return new java.security.cert.PKIXCertPathValidatorResult(trustAnchor2, highSpeedVideoFpsRanges5, x509Certificate3.getPublicKey());
                    }
                    throw new java.security.cert.CertPathValidatorException("Path processing failed on policy.", null, certPath, i17);
                } catch (java.security.cert.CertPathValidatorException e4) {
                    throw new org.bouncycastle.jce.exception.ExtCertPathValidatorException("Algorithm identifier of public key of trust anchor could not be read.", e4, certPath, -1);
                }
            } catch (java.lang.RuntimeException e5) {
                throw new org.bouncycastle.jce.exception.ExtCertPathValidatorException("Subject of trust anchor could not be (re)encoded.", e5, certPath, -1);
            }
        } catch (org.bouncycastle.jce.provider.AnnotatedException e6) {
            e = e6;
            i = 1;
            list = certificates;
        }
    }

    @Override // java.security.cert.CertPathValidatorSpi
    public java.security.cert.PKIXCertPathChecker engineGetRevocationChecker() {
        return new org.bouncycastle.jce.provider.ProvRevocationChecker(this.getHighSpeedVideoFpsRanges);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void getHighResolutionOutputSizeshNQ4ISI(java.security.cert.X509Certificate x509Certificate) throws org.bouncycastle.jce.provider.AnnotatedException {
        if (x509Certificate instanceof org.bouncycastle.jcajce.interfaces.BCX509Certificate) {
            try {
            } catch (java.lang.RuntimeException e) {
                e = e;
            }
            if (((org.bouncycastle.jcajce.interfaces.BCX509Certificate) x509Certificate).getTBSCertificateNative() != null) {
                return;
            }
            e = null;
            throw new org.bouncycastle.jce.provider.AnnotatedException("unable to process TBSCertificate", e);
        }
        try {
            org.bouncycastle.asn1.x509.TBSCertificate.getInstance(x509Certificate.getTBSCertificate());
        } catch (java.lang.IllegalArgumentException e2) {
            throw new org.bouncycastle.jce.provider.AnnotatedException(e2.getMessage());
        } catch (java.security.cert.CertificateEncodingException e3) {
            throw new org.bouncycastle.jce.provider.AnnotatedException("unable to process TBSCertificate", e3);
        }
    }

    public PKIXCertPathValidatorSpi_8(boolean z) {
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.jcajce.util.BCJcaJceHelper();
        this.Camera2StreamConfigurationMap = z;
    }

    public PKIXCertPathValidatorSpi_8() {
        this(false);
    }
}
