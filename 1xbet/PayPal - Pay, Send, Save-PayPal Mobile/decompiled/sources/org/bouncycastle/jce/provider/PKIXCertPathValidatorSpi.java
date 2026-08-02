package org.bouncycastle.jce.provider;

/* loaded from: classes17.dex */
public class PKIXCertPathValidatorSpi extends java.security.cert.CertPathValidatorSpi {
    private final org.bouncycastle.jcajce.util.JcaJceHelper Camera2StreamConfigurationMap;
    private final boolean getHighSpeedVideoFpsRanges;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v8, types: [org.bouncycastle.asn1.x509.AlgorithmIdentifier] */
    @Override // java.security.cert.CertPathValidatorSpi
    public java.security.cert.CertPathValidatorResult engineValidate(java.security.cert.CertPath certPath, java.security.cert.CertPathParameters certPathParameters) throws java.security.cert.CertPathValidatorException, java.security.InvalidAlgorithmParameterException {
        org.bouncycastle.jcajce.PKIXExtendedParameters pKIXExtendedParameters;
        int i;
        java.util.List<? extends java.security.cert.Certificate> list;
        org.bouncycastle.asn1.x500.X500Name Camera2StreamConfigurationMap;
        java.security.PublicKey cAPublicKey;
        java.util.HashSet hashSet;
        int i2;
        java.util.ArrayList[] arrayListArr;
        java.util.List list2;
        int i3;
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
        int i4 = -1;
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
            Camera2StreamConfigurationMap(highSpeedVideoFpsRanges.getTrustedCert());
            org.bouncycastle.jcajce.PKIXExtendedParameters build = new org.bouncycastle.jcajce.PKIXExtendedParameters.Builder(pKIXExtendedParameters).setTrustAnchor(highSpeedVideoFpsRanges).build();
            int i5 = size + 1;
            java.util.ArrayList[] arrayListArr2 = new java.util.ArrayList[i5];
            for (int i6 = 0; i6 < i5; i6++) {
                arrayListArr2[i6] = new java.util.ArrayList();
            }
            java.util.HashSet hashSet3 = new java.util.HashSet();
            hashSet3.add("2.5.29.32.0");
            org.bouncycastle.jce.provider.PKIXPolicyNode pKIXPolicyNode = new org.bouncycastle.jce.provider.PKIXPolicyNode(new java.util.ArrayList(), 0, hashSet3, null, new java.util.HashSet(), "2.5.29.32.0", false);
            arrayListArr2[0].add(pKIXPolicyNode);
            org.bouncycastle.jce.provider.PKIXNameConstraintValidator pKIXNameConstraintValidator = new org.bouncycastle.jce.provider.PKIXNameConstraintValidator();
            java.util.HashSet hashSet4 = new java.util.HashSet();
            int i7 = build.isExplicitPolicyRequired() ? 0 : i5;
            int i8 = build.isAnyPolicyInhibited() ? 0 : i5;
            if (build.isPolicyMappingInhibited()) {
                i5 = 0;
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
                    i4 = org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighSpeedVideoSizes(cAPublicKey);
                    i4.getAlgorithm();
                    i4.getParameters();
                    if (build.getTargetConstraints() != null && !build.getTargetConstraints().match((java.security.cert.Certificate) certificates.get(0))) {
                        throw new org.bouncycastle.jce.exception.ExtCertPathValidatorException("Target certificate in certification path does not match targetConstraints.", null, certPath, 0);
                    }
                    java.util.List certPathCheckers = build.getCertPathCheckers();
                    java.util.Iterator it = certPathCheckers.iterator();
                    while (it.hasNext()) {
                        ((java.security.cert.PKIXCertPathChecker) it.next()).init(false);
                    }
                    org.bouncycastle.jce.provider.ProvCrlRevocationChecker provCrlRevocationChecker = build.isRevocationEnabled() ? new org.bouncycastle.jce.provider.ProvCrlRevocationChecker(this.Camera2StreamConfigurationMap) : null;
                    int i9 = 1;
                    java.security.cert.TrustAnchor trustAnchor = highSpeedVideoFpsRanges;
                    int i10 = size;
                    java.security.cert.X509Certificate x509Certificate = null;
                    int i11 = i5;
                    int i12 = i8;
                    org.bouncycastle.jce.provider.PKIXPolicyNode pKIXPolicyNode2 = pKIXPolicyNode;
                    int i13 = i7;
                    int size2 = certificates.size() - 1;
                    int i14 = i13;
                    while (size2 >= 0) {
                        int i15 = size - size2;
                        int i16 = size;
                        java.security.cert.X509Certificate x509Certificate2 = (java.security.cert.X509Certificate) certificates.get(size2);
                        int i17 = size2 == certificates.size() + (-1) ? i9 : 0;
                        try {
                            Camera2StreamConfigurationMap(x509Certificate2);
                            int i18 = i12;
                            java.util.List<? extends java.security.cert.Certificate> list3 = certificates;
                            int i19 = i14;
                            int i20 = size2;
                            java.util.Date date = highSpeedVideoFpsRangesFor;
                            java.util.Date date2 = highSpeedVideoFpsRangesFor;
                            int i21 = i11;
                            org.bouncycastle.jce.provider.ProvCrlRevocationChecker provCrlRevocationChecker2 = provCrlRevocationChecker;
                            org.bouncycastle.jce.provider.ProvCrlRevocationChecker provCrlRevocationChecker3 = provCrlRevocationChecker;
                            org.bouncycastle.jce.provider.PKIXNameConstraintValidator pKIXNameConstraintValidator2 = pKIXNameConstraintValidator;
                            java.util.ArrayList[] arrayListArr3 = arrayListArr2;
                            boolean z = i17;
                            java.security.cert.TrustAnchor trustAnchor2 = trustAnchor;
                            org.bouncycastle.jcajce.PKIXExtendedParameters pKIXExtendedParameters2 = build;
                            java.util.List list4 = certPathCheckers;
                            int i22 = i9;
                            org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getHighSpeedVideoFpsRangesFor(certPath, build, date, provCrlRevocationChecker2, i20, cAPublicKey, z, Camera2StreamConfigurationMap, trustedCert);
                            org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getHighSpeedVideoSizes(certPath, i20, pKIXNameConstraintValidator2, this.getHighSpeedVideoFpsRanges);
                            org.bouncycastle.jce.provider.PKIXPolicyNode highSpeedVideoFpsRangesFor2 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getHighSpeedVideoFpsRangesFor(certPath, i20, org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getHighSpeedVideoFpsRangesFor(certPath, i20, hashSet4, pKIXPolicyNode2, arrayListArr3, i18, this.getHighSpeedVideoFpsRanges));
                            org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getHighSpeedVideoFpsRangesFor(certPath, i20, highSpeedVideoFpsRangesFor2, i19);
                            if (i15 != i16) {
                                if (x509Certificate2 == null || x509Certificate2.getVersion() != i22) {
                                    org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getHighSpeedVideoFpsRanges(certPath, i20);
                                    arrayListArr = arrayListArr3;
                                    org.bouncycastle.jce.provider.PKIXPolicyNode highSpeedVideoFpsRanges2 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getHighSpeedVideoFpsRanges(certPath, i20, arrayListArr, highSpeedVideoFpsRangesFor2, i21);
                                    org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getHighSpeedVideoFpsRangesFor(certPath, i20, pKIXNameConstraintValidator2);
                                    int Camera2StreamConfigurationMap2 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.Camera2StreamConfigurationMap(certPath, i20, i19);
                                    int highSpeedVideoFpsRanges3 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getHighSpeedVideoFpsRanges(certPath, i20, i21);
                                    int highSpeedVideoSizes = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getHighSpeedVideoSizes(certPath, i20, i18);
                                    i3 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getHighSpeedVideoFpsRangesFor(certPath, i20, Camera2StreamConfigurationMap2);
                                    i2 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getHighResolutionOutputSizeshNQ4ISI(certPath, i20, highSpeedVideoFpsRanges3);
                                    int inputSizeshNQ4ISI = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getInputSizeshNQ4ISI(certPath, i20, highSpeedVideoSizes);
                                    org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getHighResolutionOutputSizeshNQ4ISI(certPath, i20);
                                    i10 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getOutputFormats(certPath, i20, org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getHighSpeedVideoSizesFor(certPath, i20, i10));
                                    org.bouncycastle.jce.provider.RFC3280CertPathUtilities.Camera2StreamConfigurationMap(certPath, i20);
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
                                    list2 = list4;
                                    org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getHighResolutionOutputSizeshNQ4ISI(certPath, i20, hashSet2, list2);
                                    org.bouncycastle.asn1.x500.X500Name highSpeedVideoFpsRanges4 = org.bouncycastle.jce.provider.PrincipalUtils.getHighSpeedVideoFpsRanges(x509Certificate2);
                                    try {
                                        java.security.PublicKey highResolutionOutputSizeshNQ4ISI = org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighResolutionOutputSizeshNQ4ISI(certPath.getCertificates(), i20, this.Camera2StreamConfigurationMap);
                                        org.bouncycastle.asn1.x509.AlgorithmIdentifier highSpeedVideoSizes2 = org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighSpeedVideoSizes(highResolutionOutputSizeshNQ4ISI);
                                        highSpeedVideoSizes2.getAlgorithm();
                                        highSpeedVideoSizes2.getParameters();
                                        pKIXPolicyNode2 = highSpeedVideoFpsRanges2;
                                        i12 = inputSizeshNQ4ISI;
                                        Camera2StreamConfigurationMap = highSpeedVideoFpsRanges4;
                                        cAPublicKey = highResolutionOutputSizeshNQ4ISI;
                                        trustedCert = x509Certificate2;
                                        arrayListArr2 = arrayListArr;
                                        certPathCheckers = list2;
                                        x509Certificate = x509Certificate2;
                                        i9 = i22;
                                        certificates = list3;
                                        highSpeedVideoFpsRangesFor = date2;
                                        build = pKIXExtendedParameters2;
                                        size = i16;
                                        i14 = i3;
                                        trustAnchor = trustAnchor2;
                                        i11 = i2;
                                        size2 = i20 - 1;
                                        pKIXNameConstraintValidator = pKIXNameConstraintValidator2;
                                        provCrlRevocationChecker = provCrlRevocationChecker3;
                                    } catch (java.security.cert.CertPathValidatorException e2) {
                                        throw new java.security.cert.CertPathValidatorException("Next working key could not be retrieved.", e2, certPath, i20);
                                    }
                                } else if (i15 != i22 || !x509Certificate2.equals(trustAnchor2.getTrustedCert())) {
                                    throw new java.security.cert.CertPathValidatorException("Version 1 certificates can't be used as CA ones.", null, certPath, i20);
                                }
                            }
                            i2 = i21;
                            arrayListArr = arrayListArr3;
                            list2 = list4;
                            pKIXPolicyNode2 = highSpeedVideoFpsRangesFor2;
                            i12 = i18;
                            i10 = i10;
                            i3 = i19;
                            arrayListArr2 = arrayListArr;
                            certPathCheckers = list2;
                            x509Certificate = x509Certificate2;
                            i9 = i22;
                            certificates = list3;
                            highSpeedVideoFpsRangesFor = date2;
                            build = pKIXExtendedParameters2;
                            size = i16;
                            i14 = i3;
                            trustAnchor = trustAnchor2;
                            i11 = i2;
                            size2 = i20 - 1;
                            pKIXNameConstraintValidator = pKIXNameConstraintValidator2;
                            provCrlRevocationChecker = provCrlRevocationChecker3;
                        } catch (org.bouncycastle.jce.provider.AnnotatedException e3) {
                            throw new java.security.cert.CertPathValidatorException(e3.getMessage(), e3.getHighResolutionOutputSizeshNQ4ISI, certPath, size2);
                        }
                    }
                    java.security.cert.TrustAnchor trustAnchor3 = trustAnchor;
                    org.bouncycastle.jcajce.PKIXExtendedParameters pKIXExtendedParameters3 = build;
                    java.util.ArrayList[] arrayListArr4 = arrayListArr2;
                    java.util.List list5 = certPathCheckers;
                    int i23 = size2;
                    int i24 = i23 + 1;
                    int inputFormats = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getInputFormats(certPath, i24, org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getHighSpeedVideoFpsRanges(i14, x509Certificate));
                    java.util.Set<java.lang.String> criticalExtensionOIDs2 = x509Certificate.getCriticalExtensionOIDs();
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
                    org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getHighSpeedVideoFpsRanges(certPath, i24, list5, hashSet);
                    org.bouncycastle.jce.provider.PKIXPolicyNode highSpeedVideoFpsRanges5 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getHighSpeedVideoFpsRanges(certPath, pKIXExtendedParameters3, initialPolicies, i24, arrayListArr4, pKIXPolicyNode2, hashSet4);
                    if (inputFormats > 0 || highSpeedVideoFpsRanges5 != null) {
                        return new java.security.cert.PKIXCertPathValidatorResult(trustAnchor3, highSpeedVideoFpsRanges5, x509Certificate.getPublicKey());
                    }
                    throw new java.security.cert.CertPathValidatorException("Path processing failed on policy.", null, certPath, i23);
                } catch (java.security.cert.CertPathValidatorException e4) {
                    throw new org.bouncycastle.jce.exception.ExtCertPathValidatorException("Algorithm identifier of public key of trust anchor could not be read.", e4, certPath, -1);
                }
            } catch (java.lang.RuntimeException e5) {
                throw new org.bouncycastle.jce.exception.ExtCertPathValidatorException("Subject of trust anchor could not be (re)encoded.", e5, certPath, i4);
            }
        } catch (org.bouncycastle.jce.provider.AnnotatedException e6) {
            e = e6;
            i = 1;
            list = certificates;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void Camera2StreamConfigurationMap(java.security.cert.X509Certificate x509Certificate) throws org.bouncycastle.jce.provider.AnnotatedException {
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

    public PKIXCertPathValidatorSpi(boolean z) {
        this.Camera2StreamConfigurationMap = new org.bouncycastle.jcajce.util.BCJcaJceHelper();
        this.getHighSpeedVideoFpsRanges = z;
    }

    public PKIXCertPathValidatorSpi() {
        this(false);
    }
}
