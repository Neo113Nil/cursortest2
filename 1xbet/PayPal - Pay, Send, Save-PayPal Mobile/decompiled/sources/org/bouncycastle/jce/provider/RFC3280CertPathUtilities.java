package org.bouncycastle.jce.provider;

/* loaded from: classes17.dex */
class RFC3280CertPathUtilities {
    private static final java.lang.Class getValidOutputFormatsForInputhNQ4ISI = org.bouncycastle.jcajce.provider.symmetric.util.ClassUtil.loadClass(org.bouncycastle.jce.provider.RFC3280CertPathUtilities.class, "java.security.cert.PKIXRevocationChecker");
    public static final java.lang.String getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.x509.Extension.certificatePolicies.getId();
    public static final java.lang.String getOutputSizeshNQ4ISI = org.bouncycastle.asn1.x509.Extension.policyMappings.getId();
    public static final java.lang.String getInputFormats = org.bouncycastle.asn1.x509.Extension.inhibitAnyPolicy.getId();
    public static final java.lang.String getInputSizeshNQ4ISI = org.bouncycastle.asn1.x509.Extension.issuingDistributionPoint.getId();
    public static final java.lang.String getOutputFormats = org.bouncycastle.asn1.x509.Extension.freshestCRL.getId();
    public static final java.lang.String getHighSpeedVideoSizesFor = org.bouncycastle.asn1.x509.Extension.deltaCRLIndicator.getId();
    public static final java.lang.String getOutputMinFrameDurationlomOqCM = org.bouncycastle.asn1.x509.Extension.policyConstraints.getId();
    public static final java.lang.String Camera2StreamConfigurationMap = org.bouncycastle.asn1.x509.Extension.basicConstraints.getId();
    public static final java.lang.String getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.x509.Extension.cRLDistributionPoints.getId();
    public static final java.lang.String getOutputStallDurationlomOqCM = org.bouncycastle.asn1.x509.Extension.subjectAlternativeName.getId();
    public static final java.lang.String getOutputSizes = org.bouncycastle.asn1.x509.Extension.nameConstraints.getId();
    public static final java.lang.String getHighSpeedVideoSizes = org.bouncycastle.asn1.x509.Extension.authorityKeyIdentifier.getId();
    public static final java.lang.String getOutputMinFrameDuration = org.bouncycastle.asn1.x509.Extension.keyUsage.getId();
    public static final java.lang.String getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.x509.Extension.cRLNumber.getId();
    protected static final java.lang.String[] getOutputStallDuration = {"unspecified", "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", "aACompromise"};

    /* JADX WARN: Code restructure failed: missing block: B:69:0x011f, code lost:
    
        if (r19 == false) goto L297;
     */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x037e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.jcajce.PKIXCertRevocationCheckerParameters pKIXCertRevocationCheckerParameters, org.bouncycastle.asn1.x509.DistributionPoint distributionPoint, org.bouncycastle.jcajce.PKIXExtendedParameters pKIXExtendedParameters, java.util.Date date, java.util.Date date2, java.security.cert.X509Certificate x509Certificate, java.security.cert.X509Certificate x509Certificate2, java.security.PublicKey publicKey, org.bouncycastle.jce.provider.CertStatus certStatus, org.bouncycastle.jce.provider.ReasonsMask reasonsMask, java.util.List list, org.bouncycastle.jcajce.util.JcaJceHelper jcaJceHelper) throws org.bouncycastle.jce.provider.AnnotatedException, org.bouncycastle.jce.provider.RecoverableCertPathValidatorException {
        java.util.Iterator it;
        java.security.cert.X509CRL highSpeedVideoSizes;
        org.bouncycastle.jce.provider.AnnotatedException annotatedException;
        java.util.Set<java.lang.String> criticalExtensionOIDs;
        org.bouncycastle.asn1.ASN1Primitive highSpeedVideoSizes2;
        org.bouncycastle.asn1.x509.GeneralName[] generalNameArr;
        org.bouncycastle.asn1.x509.DistributionPoint distributionPoint2 = distributionPoint;
        if (date2.getTime() > date.getTime()) {
            throw new org.bouncycastle.jce.provider.AnnotatedException("Validation time is in future.");
        }
        java.util.Iterator it2 = org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighSpeedVideoSizes(pKIXCertRevocationCheckerParameters, distributionPoint2, x509Certificate, pKIXExtendedParameters, date2).iterator();
        boolean z = false;
        org.bouncycastle.jce.provider.AnnotatedException e = null;
        while (it2.hasNext() && certStatus.getHighResolutionOutputSizeshNQ4ISI == 11 && reasonsMask.getHighResolutionOutputSizeshNQ4ISI != org.bouncycastle.jce.provider.ReasonsMask.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI) {
            try {
                java.security.cert.X509CRL x509crl = (java.security.cert.X509CRL) it2.next();
                org.bouncycastle.jce.provider.ReasonsMask highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(x509crl, distributionPoint2);
                if ((highSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI | (reasonsMask.getHighResolutionOutputSizeshNQ4ISI ^ highSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI)) != 0) {
                    try {
                        java.security.PublicKey highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(x509crl, getHighResolutionOutputSizeshNQ4ISI(x509crl, x509Certificate2, publicKey, pKIXExtendedParameters, list, jcaJceHelper));
                        if (pKIXExtendedParameters.isUseDeltasEnabled()) {
                            try {
                                highSpeedVideoSizes = getHighSpeedVideoSizes(org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighSpeedVideoSizes(date2, x509crl, pKIXExtendedParameters.getCertStores(), pKIXExtendedParameters.getCRLStores(), jcaJceHelper), highSpeedVideoFpsRangesFor);
                            } catch (org.bouncycastle.jce.provider.AnnotatedException e2) {
                                e = e2;
                                it = it2;
                                distributionPoint2 = distributionPoint;
                                it2 = it;
                            }
                        } else {
                            highSpeedVideoSizes = null;
                        }
                        if (pKIXExtendedParameters.getValidityModel() != 1 && x509Certificate.getNotAfter().getTime() < x509crl.getThisUpdate().getTime()) {
                            throw new org.bouncycastle.jce.provider.AnnotatedException("No valid CRL for current time found.");
                        }
                        org.bouncycastle.asn1.ASN1Primitive highSpeedVideoSizes3 = org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighSpeedVideoSizes(x509crl, getInputSizeshNQ4ISI);
                        boolean z2 = highSpeedVideoSizes3 != null && org.bouncycastle.asn1.x509.IssuingDistributionPoint.getInstance(highSpeedVideoSizes3).isIndirectCRL();
                        try {
                            byte[] encoded = org.bouncycastle.jce.provider.PrincipalUtils.getHighResolutionOutputSizeshNQ4ISI(x509crl).getEncoded();
                            if (distributionPoint.getCRLIssuer() != null) {
                                org.bouncycastle.asn1.x509.GeneralName[] names = distributionPoint.getCRLIssuer().getNames();
                                boolean z3 = false;
                                for (int i = 0; i < names.length; i++) {
                                    if (names[i].getTagNo() == 4) {
                                        try {
                                            if (org.bouncycastle.util.Arrays.areEqual(names[i].getName().toASN1Primitive().getEncoded(), encoded)) {
                                                z3 = true;
                                            }
                                        } catch (java.io.IOException e3) {
                                            throw new org.bouncycastle.jce.provider.AnnotatedException("CRL issuer information from distribution point cannot be decoded.", e3);
                                        }
                                    }
                                }
                                if (z3 && !z2) {
                                    throw new org.bouncycastle.jce.provider.AnnotatedException("Distribution point contains cRLIssuer field but CRL is not indirect.");
                                }
                                throw new org.bouncycastle.jce.provider.AnnotatedException("CRL issuer of CRL does not match CRL issuer of distribution point.");
                            }
                            if (!org.bouncycastle.jce.provider.PrincipalUtils.getHighResolutionOutputSizeshNQ4ISI(x509crl).equals(org.bouncycastle.jce.provider.PrincipalUtils.getHighSpeedVideoSizes(x509Certificate))) {
                                throw new org.bouncycastle.jce.provider.AnnotatedException("Cannot find matching CRL issuer for certificate.");
                            }
                            try {
                                org.bouncycastle.asn1.x509.IssuingDistributionPoint issuingDistributionPoint = org.bouncycastle.asn1.x509.IssuingDistributionPoint.getInstance(org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighSpeedVideoSizes(x509crl, getInputSizeshNQ4ISI));
                                if (issuingDistributionPoint != null) {
                                    if (issuingDistributionPoint.getDistributionPoint() != null) {
                                        org.bouncycastle.asn1.x509.DistributionPointName distributionPoint3 = org.bouncycastle.asn1.x509.IssuingDistributionPoint.getInstance(issuingDistributionPoint).getDistributionPoint();
                                        java.util.ArrayList arrayList = new java.util.ArrayList();
                                        if (distributionPoint3.getType() == 0) {
                                            for (org.bouncycastle.asn1.x509.GeneralName generalName : org.bouncycastle.asn1.x509.GeneralNames.getInstance(distributionPoint3.getName()).getNames()) {
                                                arrayList.add(generalName);
                                            }
                                        }
                                        if (distributionPoint3.getType() == 1) {
                                            org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
                                            try {
                                                java.util.Enumeration objects = org.bouncycastle.asn1.ASN1Sequence.getInstance(org.bouncycastle.jce.provider.PrincipalUtils.getHighResolutionOutputSizeshNQ4ISI(x509crl)).getObjects();
                                                while (objects.hasMoreElements()) {
                                                    aSN1EncodableVector.add((org.bouncycastle.asn1.ASN1Encodable) objects.nextElement());
                                                }
                                                aSN1EncodableVector.add(distributionPoint3.getName());
                                                arrayList.add(new org.bouncycastle.asn1.x509.GeneralName(org.bouncycastle.asn1.x500.X500Name.getInstance(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector))));
                                            } catch (java.lang.Exception e4) {
                                                throw new org.bouncycastle.jce.provider.AnnotatedException("Could not read CRL issuer.", e4);
                                            }
                                        }
                                        if (distributionPoint.getDistributionPoint() == null) {
                                            annotatedException = e;
                                            it = it2;
                                            if (distributionPoint.getCRLIssuer() == null) {
                                                throw new org.bouncycastle.jce.provider.AnnotatedException("Either the cRLIssuer or the distributionPoint field must be contained in DistributionPoint.");
                                            }
                                            for (org.bouncycastle.asn1.x509.GeneralName generalName2 : distributionPoint.getCRLIssuer().getNames()) {
                                                int i2 = arrayList.contains(generalName2) ? 0 : i2 + 1;
                                            }
                                            throw new org.bouncycastle.jce.provider.AnnotatedException("No match for certificate CRL issuing distribution point name to cRLIssuer CRL distribution point.");
                                        }
                                        org.bouncycastle.asn1.x509.DistributionPointName distributionPoint4 = distributionPoint.getDistributionPoint();
                                        org.bouncycastle.asn1.x509.GeneralName[] names2 = distributionPoint4.getType() == 0 ? org.bouncycastle.asn1.x509.GeneralNames.getInstance(distributionPoint4.getName()).getNames() : null;
                                        if (distributionPoint4.getType() == 1) {
                                            if (distributionPoint.getCRLIssuer() != null) {
                                                generalNameArr = distributionPoint.getCRLIssuer().getNames();
                                                it = it2;
                                            } else {
                                                org.bouncycastle.asn1.x509.GeneralName[] generalNameArr2 = new org.bouncycastle.asn1.x509.GeneralName[1];
                                                try {
                                                    it = it2;
                                                } catch (java.lang.Exception e5) {
                                                    e = e5;
                                                }
                                                try {
                                                    generalNameArr2[0] = new org.bouncycastle.asn1.x509.GeneralName(org.bouncycastle.jce.provider.PrincipalUtils.getHighSpeedVideoSizes(x509Certificate));
                                                    generalNameArr = generalNameArr2;
                                                } catch (java.lang.Exception e6) {
                                                    e = e6;
                                                    throw new org.bouncycastle.jce.provider.AnnotatedException("Could not read certificate issuer.", e);
                                                }
                                            }
                                            int i3 = 0;
                                            while (i3 < generalNameArr.length) {
                                                try {
                                                    org.bouncycastle.jce.provider.AnnotatedException annotatedException2 = e;
                                                    org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector2 = new org.bouncycastle.asn1.ASN1EncodableVector();
                                                    for (java.util.Enumeration objects2 = org.bouncycastle.asn1.ASN1Sequence.getInstance(generalNameArr[i3].getName().toASN1Primitive()).getObjects(); objects2.hasMoreElements(); objects2 = objects2) {
                                                        aSN1EncodableVector2.add((org.bouncycastle.asn1.ASN1Encodable) objects2.nextElement());
                                                    }
                                                    aSN1EncodableVector2.add(distributionPoint4.getName());
                                                    generalNameArr[i3] = new org.bouncycastle.asn1.x509.GeneralName(org.bouncycastle.asn1.x500.X500Name.getInstance(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector2)));
                                                    i3++;
                                                    e = annotatedException2;
                                                    distributionPoint4 = distributionPoint4;
                                                } catch (org.bouncycastle.jce.provider.AnnotatedException e7) {
                                                    e = e7;
                                                    distributionPoint2 = distributionPoint;
                                                    it2 = it;
                                                }
                                            }
                                            annotatedException = e;
                                        } else {
                                            annotatedException = e;
                                            it = it2;
                                            generalNameArr = names2;
                                        }
                                        if (generalNameArr != null) {
                                            for (org.bouncycastle.asn1.x509.GeneralName generalName3 : generalNameArr) {
                                                int i4 = arrayList.contains(generalName3) ? 0 : i4 + 1;
                                            }
                                        }
                                        throw new org.bouncycastle.jce.provider.AnnotatedException("No match for certificate CRL issuing distribution point name to cRLIssuer CRL distribution point.");
                                    }
                                    annotatedException = e;
                                    it = it2;
                                    try {
                                        org.bouncycastle.asn1.x509.BasicConstraints basicConstraints = org.bouncycastle.asn1.x509.BasicConstraints.getInstance(org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighSpeedVideoSizes(x509Certificate, Camera2StreamConfigurationMap));
                                        if (x509Certificate instanceof java.security.cert.X509Certificate) {
                                            if (issuingDistributionPoint.onlyContainsUserCerts() && basicConstraints != null && basicConstraints.isCA()) {
                                                throw new org.bouncycastle.jce.provider.AnnotatedException("CA Cert CRL only contains user certificates.");
                                            }
                                            if (issuingDistributionPoint.onlyContainsCACerts() && (basicConstraints == null || !basicConstraints.isCA())) {
                                                throw new org.bouncycastle.jce.provider.AnnotatedException("End CRL only contains CA certificates.");
                                            }
                                        }
                                        if (issuingDistributionPoint.onlyContainsAttributeCerts()) {
                                            throw new org.bouncycastle.jce.provider.AnnotatedException("onlyContainsAttributeCerts boolean is asserted.");
                                        }
                                    } catch (java.lang.Exception e8) {
                                        throw new org.bouncycastle.jce.provider.AnnotatedException("Basic constraints extension could not be decoded.", e8);
                                    }
                                } else {
                                    annotatedException = e;
                                    it = it2;
                                }
                                if (highSpeedVideoSizes != null) {
                                    if (highSpeedVideoSizes.hasUnsupportedCriticalExtension()) {
                                        throw new org.bouncycastle.jce.provider.AnnotatedException("delta CRL has unsupported critical extensions");
                                    }
                                    try {
                                        java.lang.String str = getInputSizeshNQ4ISI;
                                        org.bouncycastle.asn1.x509.IssuingDistributionPoint issuingDistributionPoint2 = org.bouncycastle.asn1.x509.IssuingDistributionPoint.getInstance(org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighSpeedVideoSizes(x509crl, str));
                                        if (pKIXExtendedParameters.isUseDeltasEnabled()) {
                                            if (!org.bouncycastle.jce.provider.PrincipalUtils.getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes).equals(org.bouncycastle.jce.provider.PrincipalUtils.getHighResolutionOutputSizeshNQ4ISI(x509crl))) {
                                                throw new org.bouncycastle.jce.provider.AnnotatedException("Complete CRL issuer does not match delta CRL issuer.");
                                            }
                                            try {
                                                org.bouncycastle.asn1.x509.IssuingDistributionPoint issuingDistributionPoint3 = org.bouncycastle.asn1.x509.IssuingDistributionPoint.getInstance(org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighSpeedVideoSizes(highSpeedVideoSizes, str));
                                                if (issuingDistributionPoint2 == null) {
                                                    if (issuingDistributionPoint3 != null) {
                                                        throw new org.bouncycastle.jce.provider.AnnotatedException("Issuing distribution point extension from delta CRL and complete CRL does not match.");
                                                    }
                                                    try {
                                                        java.lang.String str2 = getHighSpeedVideoSizes;
                                                        highSpeedVideoSizes2 = org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighSpeedVideoSizes(x509crl, str2);
                                                        try {
                                                            org.bouncycastle.asn1.ASN1Primitive highSpeedVideoSizes4 = org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighSpeedVideoSizes(highSpeedVideoSizes, str2);
                                                            if (highSpeedVideoSizes2 != null) {
                                                                throw new org.bouncycastle.jce.provider.AnnotatedException("CRL authority key identifier is null.");
                                                            }
                                                            if (highSpeedVideoSizes4 == null) {
                                                                throw new org.bouncycastle.jce.provider.AnnotatedException("Delta CRL authority key identifier is null.");
                                                            }
                                                            if (!highSpeedVideoSizes2.equals(highSpeedVideoSizes4)) {
                                                                throw new org.bouncycastle.jce.provider.AnnotatedException("Delta CRL authority key identifier does not match complete CRL authority key identifier.");
                                                            }
                                                        } catch (org.bouncycastle.jce.provider.AnnotatedException e9) {
                                                            throw new org.bouncycastle.jce.provider.AnnotatedException("Authority key identifier extension could not be extracted from delta CRL.", e9);
                                                        }
                                                    } catch (org.bouncycastle.jce.provider.AnnotatedException e10) {
                                                        throw new org.bouncycastle.jce.provider.AnnotatedException("Authority key identifier extension could not be extracted from complete CRL.", e10);
                                                    }
                                                } else {
                                                    if (!issuingDistributionPoint2.equals(issuingDistributionPoint3)) {
                                                        throw new org.bouncycastle.jce.provider.AnnotatedException("Issuing distribution point extension from delta CRL and complete CRL does not match.");
                                                    }
                                                    java.lang.String str22 = getHighSpeedVideoSizes;
                                                    highSpeedVideoSizes2 = org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighSpeedVideoSizes(x509crl, str22);
                                                    org.bouncycastle.asn1.ASN1Primitive highSpeedVideoSizes42 = org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighSpeedVideoSizes(highSpeedVideoSizes, str22);
                                                    if (highSpeedVideoSizes2 != null) {
                                                    }
                                                }
                                            } catch (java.lang.Exception e11) {
                                                throw new org.bouncycastle.jce.provider.AnnotatedException("Issuing distribution point extension from delta CRL could not be decoded.", e11);
                                            }
                                        }
                                    } catch (java.lang.Exception e12) {
                                        throw new org.bouncycastle.jce.provider.AnnotatedException("Issuing distribution point extension could not be decoded.", e12);
                                    }
                                }
                                if (pKIXExtendedParameters.isUseDeltasEnabled() && highSpeedVideoSizes != null) {
                                    org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighSpeedVideoFpsRangesFor(date2, highSpeedVideoSizes, x509Certificate, certStatus);
                                }
                                if (certStatus.getHighResolutionOutputSizeshNQ4ISI == 11) {
                                    org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighSpeedVideoFpsRangesFor(date2, x509crl, x509Certificate, certStatus);
                                }
                                if (certStatus.getHighResolutionOutputSizeshNQ4ISI == 8) {
                                    certStatus.getHighResolutionOutputSizeshNQ4ISI = 11;
                                }
                                reasonsMask.getHighResolutionOutputSizeshNQ4ISI |= highSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI;
                                java.util.Set<java.lang.String> criticalExtensionOIDs2 = x509crl.getCriticalExtensionOIDs();
                                if (criticalExtensionOIDs2 != null) {
                                    java.util.HashSet hashSet = new java.util.HashSet(criticalExtensionOIDs2);
                                    hashSet.remove(org.bouncycastle.asn1.x509.Extension.issuingDistributionPoint.getId());
                                    hashSet.remove(org.bouncycastle.asn1.x509.Extension.deltaCRLIndicator.getId());
                                    if (!hashSet.isEmpty()) {
                                        throw new org.bouncycastle.jce.provider.AnnotatedException("CRL contains unsupported critical extensions.");
                                    }
                                }
                                if (highSpeedVideoSizes != null && (criticalExtensionOIDs = highSpeedVideoSizes.getCriticalExtensionOIDs()) != null) {
                                    java.util.HashSet hashSet2 = new java.util.HashSet(criticalExtensionOIDs);
                                    hashSet2.remove(org.bouncycastle.asn1.x509.Extension.issuingDistributionPoint.getId());
                                    hashSet2.remove(org.bouncycastle.asn1.x509.Extension.deltaCRLIndicator.getId());
                                    if (!hashSet2.isEmpty()) {
                                        throw new org.bouncycastle.jce.provider.AnnotatedException("Delta CRL contains unsupported critical extension.");
                                    }
                                }
                                distributionPoint2 = distributionPoint;
                                it2 = it;
                                e = annotatedException;
                                z = true;
                            } catch (java.lang.Exception e13) {
                                throw new org.bouncycastle.jce.provider.AnnotatedException("Issuing distribution point extension could not be decoded.", e13);
                            }
                        } catch (java.io.IOException e14) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Exception encoding CRL issuer: ");
                            sb.append(e14.getMessage());
                            throw new org.bouncycastle.jce.provider.AnnotatedException(sb.toString(), e14);
                        }
                    } catch (org.bouncycastle.jce.provider.AnnotatedException e15) {
                        e = e15;
                    }
                } else {
                    distributionPoint2 = distributionPoint;
                }
            } catch (org.bouncycastle.jce.provider.AnnotatedException e16) {
                e = e16;
            }
        }
        org.bouncycastle.jce.provider.AnnotatedException annotatedException3 = e;
        if (!z) {
            throw annotatedException3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected static void getHighSpeedVideoSizes(org.bouncycastle.jcajce.PKIXCertRevocationCheckerParameters pKIXCertRevocationCheckerParameters, org.bouncycastle.jcajce.PKIXExtendedParameters pKIXExtendedParameters, java.util.Date date, java.util.Date date2, java.security.cert.X509Certificate x509Certificate, java.security.cert.X509Certificate x509Certificate2, java.security.PublicKey publicKey, java.util.List list, org.bouncycastle.jcajce.util.JcaJceHelper jcaJceHelper) throws org.bouncycastle.jce.provider.AnnotatedException, org.bouncycastle.jce.provider.RecoverableCertPathValidatorException {
        boolean z;
        org.bouncycastle.jce.provider.AnnotatedException e;
        org.bouncycastle.jcajce.PKIXExtendedParameters pKIXExtendedParameters2;
        org.bouncycastle.jce.provider.CertStatus certStatus;
        int i;
        org.bouncycastle.asn1.x509.DistributionPoint[] distributionPointArr;
        java.lang.Object obj;
        org.bouncycastle.jce.provider.CertStatus certStatus2;
        org.bouncycastle.jce.provider.ReasonsMask reasonsMask;
        try {
            org.bouncycastle.asn1.x509.CRLDistPoint cRLDistPoint = org.bouncycastle.asn1.x509.CRLDistPoint.getInstance(org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighSpeedVideoSizes(x509Certificate, getHighSpeedVideoFpsRanges));
            org.bouncycastle.jcajce.PKIXExtendedParameters pKIXExtendedParameters3 = pKIXExtendedParameters;
            org.bouncycastle.jcajce.PKIXExtendedParameters.Builder builder = new org.bouncycastle.jcajce.PKIXExtendedParameters.Builder(pKIXExtendedParameters3);
            try {
                java.util.Iterator<org.bouncycastle.jcajce.PKIXCRLStore> it = org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighSpeedVideoFpsRangesFor(cRLDistPoint, pKIXExtendedParameters.getNamedCRLStoreMap(), date2, jcaJceHelper).iterator();
                while (it.hasNext()) {
                    builder.addCRLStore(it.next());
                }
                org.bouncycastle.jce.provider.CertStatus certStatus3 = new org.bouncycastle.jce.provider.CertStatus();
                org.bouncycastle.jce.provider.ReasonsMask reasonsMask2 = new org.bouncycastle.jce.provider.ReasonsMask();
                org.bouncycastle.jcajce.PKIXExtendedParameters build = builder.build();
                boolean z2 = true;
                boolean z3 = false;
                if (cRLDistPoint != null) {
                    try {
                        org.bouncycastle.asn1.x509.DistributionPoint[] distributionPoints = cRLDistPoint.getDistributionPoints();
                        if (distributionPoints != null) {
                            int i2 = 0;
                            z = false;
                            e = null;
                            for (int i3 = 11; i2 < distributionPoints.length && certStatus3.getHighResolutionOutputSizeshNQ4ISI == i3 && reasonsMask2.getHighResolutionOutputSizeshNQ4ISI != org.bouncycastle.jce.provider.ReasonsMask.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI; i3 = 11) {
                                try {
                                    i = i2;
                                    distributionPointArr = distributionPoints;
                                    obj = reasonsMask2;
                                    certStatus2 = certStatus3;
                                    try {
                                        getHighResolutionOutputSizeshNQ4ISI(pKIXCertRevocationCheckerParameters, distributionPoints[i2], build, date, date2, x509Certificate, x509Certificate2, publicKey, certStatus3, reasonsMask2, list, jcaJceHelper);
                                        z = true;
                                    } catch (org.bouncycastle.jce.provider.AnnotatedException e2) {
                                        e = e2;
                                    }
                                } catch (org.bouncycastle.jce.provider.AnnotatedException e3) {
                                    e = e3;
                                    i = i2;
                                    distributionPointArr = distributionPoints;
                                    obj = reasonsMask2;
                                    certStatus2 = certStatus3;
                                }
                                i2 = i + 1;
                                certStatus3 = certStatus2;
                                distributionPoints = distributionPointArr;
                                reasonsMask2 = obj;
                                z3 = false;
                            }
                            pKIXExtendedParameters2 = reasonsMask2;
                            certStatus = certStatus3;
                            if (certStatus.getHighResolutionOutputSizeshNQ4ISI != 11) {
                                org.bouncycastle.jce.provider.ReasonsMask reasonsMask3 = pKIXExtendedParameters2;
                                if (reasonsMask3.getHighResolutionOutputSizeshNQ4ISI != org.bouncycastle.jce.provider.ReasonsMask.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI) {
                                    try {
                                        try {
                                            try {
                                                reasonsMask = reasonsMask3;
                                                getHighResolutionOutputSizeshNQ4ISI(pKIXCertRevocationCheckerParameters, new org.bouncycastle.asn1.x509.DistributionPoint(new org.bouncycastle.asn1.x509.DistributionPointName(0, new org.bouncycastle.asn1.x509.GeneralNames(new org.bouncycastle.asn1.x509.GeneralName(4, org.bouncycastle.jce.provider.PrincipalUtils.getHighResolutionOutputSizeshNQ4ISI(x509Certificate)))), null, null), (org.bouncycastle.jcajce.PKIXExtendedParameters) pKIXExtendedParameters.clone(), date, date2, x509Certificate, x509Certificate2, publicKey, certStatus, reasonsMask3, list, jcaJceHelper);
                                            } catch (java.lang.RuntimeException e4) {
                                                throw new org.bouncycastle.jce.provider.AnnotatedException("Issuer from certificate for CRL could not be reencoded.", e4);
                                            }
                                        } catch (org.bouncycastle.jce.provider.AnnotatedException e5) {
                                            e = e5;
                                        }
                                    } catch (org.bouncycastle.jce.provider.AnnotatedException e6) {
                                        e = e6;
                                    }
                                    if (!z2) {
                                        if (!(e instanceof org.bouncycastle.jce.provider.AnnotatedException)) {
                                            throw new org.bouncycastle.jce.provider.AnnotatedException("No valid CRL found.", e);
                                        }
                                        throw e;
                                    }
                                    if (certStatus.getHighResolutionOutputSizeshNQ4ISI == 11) {
                                        if (reasonsMask.getHighResolutionOutputSizeshNQ4ISI != org.bouncycastle.jce.provider.ReasonsMask.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI && certStatus.getHighResolutionOutputSizeshNQ4ISI == 11) {
                                            certStatus.getHighResolutionOutputSizeshNQ4ISI = 12;
                                        }
                                        if (certStatus.getHighResolutionOutputSizeshNQ4ISI == 12) {
                                            throw new org.bouncycastle.jce.provider.AnnotatedException("Certificate status could not be determined.");
                                        }
                                        return;
                                    }
                                    java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
                                    simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TIMEZONE_UTC));
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Certificate revocation after ");
                                    sb.append(simpleDateFormat.format(certStatus.getHighSpeedVideoFpsRanges));
                                    java.lang.String obj2 = sb.toString();
                                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                    sb2.append(obj2);
                                    sb2.append(", reason: ");
                                    sb2.append(getOutputStallDuration[certStatus.getHighResolutionOutputSizeshNQ4ISI]);
                                    throw new org.bouncycastle.jce.provider.AnnotatedException(sb2.toString());
                                }
                                pKIXExtendedParameters3 = reasonsMask3;
                            } else {
                                pKIXExtendedParameters3 = pKIXExtendedParameters2;
                            }
                            z2 = z;
                            reasonsMask = pKIXExtendedParameters3;
                            if (!z2) {
                            }
                        }
                    } catch (java.lang.Exception e7) {
                        throw new org.bouncycastle.jce.provider.AnnotatedException("Distribution points could not be read.", e7);
                    }
                }
                pKIXExtendedParameters2 = reasonsMask2;
                certStatus = certStatus3;
                e = null;
                z = false;
                if (certStatus.getHighResolutionOutputSizeshNQ4ISI != 11) {
                }
                z2 = z;
                reasonsMask = pKIXExtendedParameters3;
                if (!z2) {
                }
            } catch (org.bouncycastle.jce.provider.AnnotatedException e8) {
                throw new org.bouncycastle.jce.provider.AnnotatedException("No additional CRL locations could be decoded from CRL distribution point extension.", e8);
            }
        } catch (java.lang.Exception e9) {
            throw new org.bouncycastle.jce.provider.AnnotatedException("CRL distribution point extension could not be read.", e9);
        }
    }

    private static org.bouncycastle.jce.provider.ReasonsMask getHighSpeedVideoFpsRanges(java.security.cert.X509CRL x509crl, org.bouncycastle.asn1.x509.DistributionPoint distributionPoint) throws org.bouncycastle.jce.provider.AnnotatedException {
        try {
            org.bouncycastle.asn1.x509.IssuingDistributionPoint issuingDistributionPoint = org.bouncycastle.asn1.x509.IssuingDistributionPoint.getInstance(org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighSpeedVideoSizes(x509crl, getInputSizeshNQ4ISI));
            if (issuingDistributionPoint != null && issuingDistributionPoint.getOnlySomeReasons() != null && distributionPoint.getReasons() != null) {
                org.bouncycastle.jce.provider.ReasonsMask reasonsMask = new org.bouncycastle.jce.provider.ReasonsMask(distributionPoint.getReasons());
                org.bouncycastle.jce.provider.ReasonsMask reasonsMask2 = new org.bouncycastle.jce.provider.ReasonsMask(issuingDistributionPoint.getOnlySomeReasons());
                org.bouncycastle.jce.provider.ReasonsMask reasonsMask3 = new org.bouncycastle.jce.provider.ReasonsMask();
                reasonsMask3.getHighResolutionOutputSizeshNQ4ISI |= new org.bouncycastle.jce.provider.ReasonsMask(reasonsMask2.getHighResolutionOutputSizeshNQ4ISI & reasonsMask.getHighResolutionOutputSizeshNQ4ISI).getHighResolutionOutputSizeshNQ4ISI;
                return reasonsMask3;
            }
            if ((issuingDistributionPoint == null || issuingDistributionPoint.getOnlySomeReasons() == null) && distributionPoint.getReasons() == null) {
                return org.bouncycastle.jce.provider.ReasonsMask.getHighSpeedVideoFpsRanges;
            }
            org.bouncycastle.jce.provider.ReasonsMask reasonsMask4 = distributionPoint.getReasons() == null ? org.bouncycastle.jce.provider.ReasonsMask.getHighSpeedVideoFpsRanges : new org.bouncycastle.jce.provider.ReasonsMask(distributionPoint.getReasons());
            org.bouncycastle.jce.provider.ReasonsMask reasonsMask5 = issuingDistributionPoint == null ? org.bouncycastle.jce.provider.ReasonsMask.getHighSpeedVideoFpsRanges : new org.bouncycastle.jce.provider.ReasonsMask(issuingDistributionPoint.getOnlySomeReasons());
            org.bouncycastle.jce.provider.ReasonsMask reasonsMask6 = new org.bouncycastle.jce.provider.ReasonsMask();
            reasonsMask6.getHighResolutionOutputSizeshNQ4ISI |= new org.bouncycastle.jce.provider.ReasonsMask(reasonsMask5.getHighResolutionOutputSizeshNQ4ISI & reasonsMask4.getHighResolutionOutputSizeshNQ4ISI).getHighResolutionOutputSizeshNQ4ISI;
            return reasonsMask6;
        } catch (java.lang.Exception e) {
            throw new org.bouncycastle.jce.provider.AnnotatedException("Issuing distribution point extension could not be decoded.", e);
        }
    }

    protected static org.bouncycastle.jce.provider.PKIXPolicyNode getHighSpeedVideoFpsRanges(java.security.cert.CertPath certPath, org.bouncycastle.jcajce.PKIXExtendedParameters pKIXExtendedParameters, java.util.Set set, int i, java.util.List[] listArr, org.bouncycastle.jce.provider.PKIXPolicyNode pKIXPolicyNode, java.util.Set set2) throws java.security.cert.CertPathValidatorException {
        int size = certPath.getCertificates().size();
        if (pKIXPolicyNode == null) {
            if (pKIXExtendedParameters.isExplicitPolicyRequired()) {
                throw new org.bouncycastle.jce.exception.ExtCertPathValidatorException("Explicit policy requested but none available.", null, certPath, i);
            }
            return null;
        }
        if (org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighSpeedVideoFpsRanges(set)) {
            if (pKIXExtendedParameters.isExplicitPolicyRequired()) {
                if (set2.isEmpty()) {
                    throw new org.bouncycastle.jce.exception.ExtCertPathValidatorException("Explicit policy requested but none available.", null, certPath, i);
                }
                java.util.HashSet hashSet = new java.util.HashSet();
                for (java.util.List list : listArr) {
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        org.bouncycastle.jce.provider.PKIXPolicyNode pKIXPolicyNode2 = (org.bouncycastle.jce.provider.PKIXPolicyNode) list.get(i2);
                        if ("2.5.29.32.0".equals(pKIXPolicyNode2.getValidPolicy())) {
                            java.util.Iterator children = pKIXPolicyNode2.getChildren();
                            while (children.hasNext()) {
                                hashSet.add(children.next());
                            }
                        }
                    }
                }
                java.util.Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    set2.contains(((org.bouncycastle.jce.provider.PKIXPolicyNode) it.next()).getValidPolicy());
                }
                if (pKIXPolicyNode != null) {
                    for (int i3 = size - 1; i3 >= 0; i3--) {
                        java.util.List list2 = listArr[i3];
                        for (int i4 = 0; i4 < list2.size(); i4++) {
                            org.bouncycastle.jce.provider.PKIXPolicyNode pKIXPolicyNode3 = (org.bouncycastle.jce.provider.PKIXPolicyNode) list2.get(i4);
                            if (!pKIXPolicyNode3.hasChildren()) {
                                pKIXPolicyNode = org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighResolutionOutputSizeshNQ4ISI(pKIXPolicyNode, listArr, pKIXPolicyNode3);
                            }
                        }
                    }
                    return pKIXPolicyNode;
                }
            }
            return pKIXPolicyNode;
        }
        java.util.HashSet<org.bouncycastle.jce.provider.PKIXPolicyNode> hashSet2 = new java.util.HashSet();
        for (java.util.List list3 : listArr) {
            for (int i5 = 0; i5 < list3.size(); i5++) {
                org.bouncycastle.jce.provider.PKIXPolicyNode pKIXPolicyNode4 = (org.bouncycastle.jce.provider.PKIXPolicyNode) list3.get(i5);
                if ("2.5.29.32.0".equals(pKIXPolicyNode4.getValidPolicy())) {
                    java.util.Iterator children2 = pKIXPolicyNode4.getChildren();
                    while (children2.hasNext()) {
                        org.bouncycastle.jce.provider.PKIXPolicyNode pKIXPolicyNode5 = (org.bouncycastle.jce.provider.PKIXPolicyNode) children2.next();
                        if (!"2.5.29.32.0".equals(pKIXPolicyNode5.getValidPolicy())) {
                            hashSet2.add(pKIXPolicyNode5);
                        }
                    }
                }
            }
        }
        for (org.bouncycastle.jce.provider.PKIXPolicyNode pKIXPolicyNode6 : hashSet2) {
            if (!set.contains(pKIXPolicyNode6.getValidPolicy())) {
                pKIXPolicyNode = org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighResolutionOutputSizeshNQ4ISI(pKIXPolicyNode, listArr, pKIXPolicyNode6);
            }
        }
        if (pKIXPolicyNode != null) {
            for (int i6 = size - 1; i6 >= 0; i6--) {
                java.util.List list4 = listArr[i6];
                for (int i7 = 0; i7 < list4.size(); i7++) {
                    org.bouncycastle.jce.provider.PKIXPolicyNode pKIXPolicyNode7 = (org.bouncycastle.jce.provider.PKIXPolicyNode) list4.get(i7);
                    if (!pKIXPolicyNode7.hasChildren()) {
                        pKIXPolicyNode = org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighResolutionOutputSizeshNQ4ISI(pKIXPolicyNode, listArr, pKIXPolicyNode7);
                    }
                }
            }
        }
        return pKIXPolicyNode;
    }

    protected static void getHighSpeedVideoFpsRanges(java.security.cert.CertPath certPath, int i, java.util.List list, java.util.Set set) throws java.security.cert.CertPathValidatorException {
        java.security.cert.X509Certificate x509Certificate = (java.security.cert.X509Certificate) certPath.getCertificates().get(i);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((java.security.cert.PKIXCertPathChecker) it.next()).check(x509Certificate, set);
            } catch (java.security.cert.CertPathValidatorException e) {
                throw new org.bouncycastle.jce.exception.ExtCertPathValidatorException(e.getMessage(), e, certPath, i);
            } catch (java.lang.Exception e2) {
                throw new java.security.cert.CertPathValidatorException("Additional certificate path checker failed.", e2, certPath, i);
            }
        }
        if (!set.isEmpty()) {
            throw new org.bouncycastle.jce.exception.ExtCertPathValidatorException("Certificate has unsupported critical extension: ".concat(java.lang.String.valueOf(set)), null, certPath, i);
        }
    }

    protected static int getInputFormats(java.security.cert.CertPath certPath, int i, int i2) throws java.security.cert.CertPathValidatorException {
        try {
            org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighSpeedVideoSizes((java.security.cert.X509Certificate) certPath.getCertificates().get(i), getOutputMinFrameDurationlomOqCM));
            if (aSN1Sequence != null) {
                java.util.Enumeration objects = aSN1Sequence.getObjects();
                while (objects.hasMoreElements()) {
                    org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = (org.bouncycastle.asn1.ASN1TaggedObject) objects.nextElement();
                    if (aSN1TaggedObject.getTagNo() == 0) {
                        try {
                            if (org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1TaggedObject, false).intValueExact() == 0) {
                                return 0;
                            }
                        } catch (java.lang.Exception e) {
                            throw new org.bouncycastle.jce.exception.ExtCertPathValidatorException("Policy constraints requireExplicitPolicy field could not be decoded.", e, certPath, i);
                        }
                    }
                }
            }
            return i2;
        } catch (org.bouncycastle.jce.provider.AnnotatedException e2) {
            throw new org.bouncycastle.jce.exception.ExtCertPathValidatorException("Policy constraints could not be decoded.", e2, certPath, i);
        }
    }

    protected static int getHighSpeedVideoFpsRanges(int i, java.security.cert.X509Certificate x509Certificate) {
        return (org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighResolutionOutputSizeshNQ4ISI(x509Certificate) || i == 0) ? i : i - 1;
    }

    protected static void getHighSpeedVideoFpsRangesFor(java.security.cert.CertPath certPath, int i, org.bouncycastle.jce.provider.PKIXPolicyNode pKIXPolicyNode, int i2) throws java.security.cert.CertPathValidatorException {
        if (i2 <= 0 && pKIXPolicyNode == null) {
            throw new org.bouncycastle.jce.exception.ExtCertPathValidatorException("No valid policy tree found when one expected.", null, certPath, i);
        }
    }

    protected static org.bouncycastle.jce.provider.PKIXPolicyNode getHighSpeedVideoFpsRangesFor(java.security.cert.CertPath certPath, int i, org.bouncycastle.jce.provider.PKIXPolicyNode pKIXPolicyNode) throws java.security.cert.CertPathValidatorException {
        try {
            if (org.bouncycastle.asn1.ASN1Sequence.getInstance(org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighSpeedVideoSizes((java.security.cert.X509Certificate) certPath.getCertificates().get(i), getHighSpeedVideoFpsRangesFor)) == null) {
                return null;
            }
            return pKIXPolicyNode;
        } catch (org.bouncycastle.jce.provider.AnnotatedException e) {
            throw new org.bouncycastle.jce.exception.ExtCertPathValidatorException("Could not read certificate policies extension from certificate.", e, certPath, i);
        }
    }

    protected static org.bouncycastle.jce.provider.PKIXPolicyNode getHighSpeedVideoFpsRangesFor(java.security.cert.CertPath certPath, int i, java.util.Set set, org.bouncycastle.jce.provider.PKIXPolicyNode pKIXPolicyNode, java.util.List[] listArr, int i2, boolean z) throws java.security.cert.CertPathValidatorException {
        java.lang.String str;
        int i3;
        java.util.List<? extends java.security.cert.Certificate> certificates = certPath.getCertificates();
        java.security.cert.X509Certificate x509Certificate = (java.security.cert.X509Certificate) certificates.get(i);
        int size = certificates.size();
        int i4 = size - i;
        try {
            org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighSpeedVideoSizes(x509Certificate, getHighSpeedVideoFpsRangesFor));
            if (aSN1Sequence == null || pKIXPolicyNode == null) {
                return null;
            }
            java.util.Enumeration objects = aSN1Sequence.getObjects();
            java.util.HashSet hashSet = new java.util.HashSet();
            while (objects.hasMoreElements()) {
                org.bouncycastle.asn1.x509.PolicyInformation policyInformation = org.bouncycastle.asn1.x509.PolicyInformation.getInstance(objects.nextElement());
                org.bouncycastle.asn1.ASN1ObjectIdentifier policyIdentifier = policyInformation.getPolicyIdentifier();
                hashSet.add(policyIdentifier.getId());
                if (!"2.5.29.32.0".equals(policyIdentifier.getId())) {
                    try {
                        java.util.Set highSpeedVideoSizes = org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighSpeedVideoSizes(policyInformation.getPolicyQualifiers());
                        if (!org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighSpeedVideoSizes(i4, listArr, policyIdentifier, highSpeedVideoSizes)) {
                            org.bouncycastle.jce.provider.CertPathValidatorUtilities.Camera2StreamConfigurationMap(i4, listArr, policyIdentifier, highSpeedVideoSizes);
                        }
                    } catch (java.security.cert.CertPathValidatorException e) {
                        throw new org.bouncycastle.jce.exception.ExtCertPathValidatorException("Policy qualifier info set could not be build.", e, certPath, i);
                    }
                }
            }
            if (set.isEmpty() || set.contains("2.5.29.32.0")) {
                set.clear();
                set.addAll(hashSet);
            } else {
                java.util.HashSet hashSet2 = new java.util.HashSet();
                for (java.lang.Object obj : set) {
                    if (hashSet.contains(obj)) {
                        hashSet2.add(obj);
                    }
                }
                set.clear();
                set.addAll(hashSet2);
            }
            if (i2 > 0 || ((i4 < size || z) && org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighResolutionOutputSizeshNQ4ISI(x509Certificate))) {
                java.util.Enumeration objects2 = aSN1Sequence.getObjects();
                while (true) {
                    if (!objects2.hasMoreElements()) {
                        break;
                    }
                    org.bouncycastle.asn1.x509.PolicyInformation policyInformation2 = org.bouncycastle.asn1.x509.PolicyInformation.getInstance(objects2.nextElement());
                    if ("2.5.29.32.0".equals(policyInformation2.getPolicyIdentifier().getId())) {
                        java.util.Set highSpeedVideoSizes2 = org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighSpeedVideoSizes(policyInformation2.getPolicyQualifiers());
                        java.util.List list = listArr[i4 - 1];
                        for (int i5 = 0; i5 < list.size(); i5++) {
                            org.bouncycastle.jce.provider.PKIXPolicyNode pKIXPolicyNode2 = (org.bouncycastle.jce.provider.PKIXPolicyNode) list.get(i5);
                            for (java.lang.Object obj2 : pKIXPolicyNode2.getExpectedPolicies()) {
                                if (obj2 instanceof java.lang.String) {
                                    str = (java.lang.String) obj2;
                                } else if (obj2 instanceof org.bouncycastle.asn1.ASN1ObjectIdentifier) {
                                    str = ((org.bouncycastle.asn1.ASN1ObjectIdentifier) obj2).getId();
                                }
                                java.lang.String str2 = str;
                                java.util.Iterator children = pKIXPolicyNode2.getChildren();
                                boolean z2 = false;
                                while (children.hasNext()) {
                                    if (str2.equals(((org.bouncycastle.jce.provider.PKIXPolicyNode) children.next()).getValidPolicy())) {
                                        z2 = true;
                                    }
                                }
                                if (!z2) {
                                    java.util.HashSet hashSet3 = new java.util.HashSet();
                                    hashSet3.add(str2);
                                    org.bouncycastle.jce.provider.PKIXPolicyNode pKIXPolicyNode3 = new org.bouncycastle.jce.provider.PKIXPolicyNode(new java.util.ArrayList(), i4, hashSet3, pKIXPolicyNode2, highSpeedVideoSizes2, str2, false);
                                    pKIXPolicyNode2.addChild(pKIXPolicyNode3);
                                    listArr[i4].add(pKIXPolicyNode3);
                                }
                            }
                        }
                    }
                }
            }
            org.bouncycastle.jce.provider.PKIXPolicyNode pKIXPolicyNode4 = pKIXPolicyNode;
            for (int i6 = i4 - 1; i6 >= 0; i6--) {
                java.util.List list2 = listArr[i6];
                while (i3 < list2.size()) {
                    org.bouncycastle.jce.provider.PKIXPolicyNode pKIXPolicyNode5 = (org.bouncycastle.jce.provider.PKIXPolicyNode) list2.get(i3);
                    i3 = (pKIXPolicyNode5.hasChildren() || (pKIXPolicyNode4 = org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighResolutionOutputSizeshNQ4ISI(pKIXPolicyNode4, listArr, pKIXPolicyNode5)) != null) ? i3 + 1 : 0;
                }
            }
            java.util.Set<java.lang.String> criticalExtensionOIDs = x509Certificate.getCriticalExtensionOIDs();
            if (criticalExtensionOIDs != null) {
                boolean contains = criticalExtensionOIDs.contains(getHighSpeedVideoFpsRangesFor);
                java.util.List list3 = listArr[i4];
                for (int i7 = 0; i7 < list3.size(); i7++) {
                    ((org.bouncycastle.jce.provider.PKIXPolicyNode) list3.get(i7)).setCritical(contains);
                }
            }
            return pKIXPolicyNode4;
        } catch (org.bouncycastle.jce.provider.AnnotatedException e2) {
            throw new org.bouncycastle.jce.exception.ExtCertPathValidatorException("Could not read certificate policies extension from certificate.", e2, certPath, i);
        }
    }

    protected static void getHighSpeedVideoSizes(java.security.cert.CertPath certPath, int i, org.bouncycastle.jce.provider.PKIXNameConstraintValidator pKIXNameConstraintValidator, boolean z) throws java.security.cert.CertPathValidatorException {
        java.util.List<? extends java.security.cert.Certificate> certificates = certPath.getCertificates();
        java.security.cert.X509Certificate x509Certificate = (java.security.cert.X509Certificate) certificates.get(i);
        int size = certificates.size();
        if (!org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighResolutionOutputSizeshNQ4ISI(x509Certificate) || (size - i >= size && !z)) {
            try {
                org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(org.bouncycastle.jce.provider.PrincipalUtils.getHighSpeedVideoFpsRanges(x509Certificate));
                try {
                    pKIXNameConstraintValidator.checkPermittedDN(aSN1Sequence);
                    pKIXNameConstraintValidator.checkExcludedDN(aSN1Sequence);
                    try {
                        org.bouncycastle.asn1.x509.GeneralNames generalNames = org.bouncycastle.asn1.x509.GeneralNames.getInstance(org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighSpeedVideoSizes(x509Certificate, getOutputStallDurationlomOqCM));
                        org.bouncycastle.asn1.x500.RDN[] rDNs = org.bouncycastle.asn1.x500.X500Name.getInstance(aSN1Sequence).getRDNs(org.bouncycastle.asn1.x500.style.BCStyle.EmailAddress);
                        for (int i2 = 0; i2 != rDNs.length; i2++) {
                            org.bouncycastle.asn1.x509.GeneralName generalName = new org.bouncycastle.asn1.x509.GeneralName(1, ((org.bouncycastle.asn1.ASN1String) rDNs[i2].getFirst().getValue()).getString());
                            try {
                                pKIXNameConstraintValidator.checkPermitted(generalName);
                                pKIXNameConstraintValidator.checkExcluded(generalName);
                            } catch (org.bouncycastle.jce.provider.PKIXNameConstraintValidatorException e) {
                                throw new java.security.cert.CertPathValidatorException("Subtree check for certificate subject alternative email failed.", e, certPath, i);
                            }
                        }
                        if (generalNames != null) {
                            try {
                                org.bouncycastle.asn1.x509.GeneralName[] names = generalNames.getNames();
                                for (int i3 = 0; i3 < names.length; i3++) {
                                    try {
                                        pKIXNameConstraintValidator.checkPermitted(names[i3]);
                                        pKIXNameConstraintValidator.checkExcluded(names[i3]);
                                    } catch (org.bouncycastle.jce.provider.PKIXNameConstraintValidatorException e2) {
                                        throw new java.security.cert.CertPathValidatorException("Subtree check for certificate subject alternative name failed.", e2, certPath, i);
                                    }
                                }
                            } catch (java.lang.Exception e3) {
                                throw new java.security.cert.CertPathValidatorException("Subject alternative name contents could not be decoded.", e3, certPath, i);
                            }
                        }
                    } catch (java.lang.Exception e4) {
                        throw new java.security.cert.CertPathValidatorException("Subject alternative name extension could not be decoded.", e4, certPath, i);
                    }
                } catch (org.bouncycastle.jce.provider.PKIXNameConstraintValidatorException e5) {
                    throw new java.security.cert.CertPathValidatorException("Subtree check for certificate subject failed.", e5, certPath, i);
                }
            } catch (java.lang.Exception e6) {
                throw new java.security.cert.CertPathValidatorException("Exception extracting subject name when checking subtrees.", e6, certPath, i);
            }
        }
    }

    protected static void getHighSpeedVideoFpsRangesFor(java.security.cert.CertPath certPath, org.bouncycastle.jcajce.PKIXExtendedParameters pKIXExtendedParameters, java.util.Date date, org.bouncycastle.jcajce.PKIXCertRevocationChecker pKIXCertRevocationChecker, int i, java.security.PublicKey publicKey, boolean z, org.bouncycastle.asn1.x500.X500Name x500Name, java.security.cert.X509Certificate x509Certificate) throws java.security.cert.CertPathValidatorException {
        java.security.cert.X509Certificate x509Certificate2 = (java.security.cert.X509Certificate) certPath.getCertificates().get(i);
        if (!z) {
            try {
                org.bouncycastle.jce.provider.CertPathValidatorUtilities.Camera2StreamConfigurationMap(x509Certificate2, publicKey, pKIXExtendedParameters.getSigProvider());
            } catch (java.security.GeneralSecurityException e) {
                throw new org.bouncycastle.jce.exception.ExtCertPathValidatorException("Could not validate certificate signature.", e, certPath, i);
            }
        }
        try {
            java.util.Date highSpeedVideoFpsRanges = org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighSpeedVideoFpsRanges(date, pKIXExtendedParameters.getValidityModel(), certPath, i);
            try {
                x509Certificate2.checkValidity(highSpeedVideoFpsRanges);
                if (pKIXCertRevocationChecker != null) {
                    pKIXCertRevocationChecker.initialize(new org.bouncycastle.jcajce.PKIXCertRevocationCheckerParameters(pKIXExtendedParameters, highSpeedVideoFpsRanges, certPath, i, x509Certificate, publicKey));
                    pKIXCertRevocationChecker.check(x509Certificate2);
                }
                org.bouncycastle.asn1.x500.X500Name highResolutionOutputSizeshNQ4ISI = org.bouncycastle.jce.provider.PrincipalUtils.getHighResolutionOutputSizeshNQ4ISI(x509Certificate2);
                if (highResolutionOutputSizeshNQ4ISI.equals(x500Name)) {
                    return;
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("IssuerName(");
                sb.append(highResolutionOutputSizeshNQ4ISI);
                sb.append(") does not match SubjectName(");
                sb.append(x500Name);
                sb.append(") of signing certificate.");
                throw new org.bouncycastle.jce.exception.ExtCertPathValidatorException(sb.toString(), null, certPath, i);
            } catch (java.security.cert.CertificateExpiredException e2) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Could not validate certificate: ");
                sb2.append(e2.getMessage());
                throw new org.bouncycastle.jce.exception.ExtCertPathValidatorException(sb2.toString(), e2, certPath, i);
            } catch (java.security.cert.CertificateNotYetValidException e3) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Could not validate certificate: ");
                sb3.append(e3.getMessage());
                throw new org.bouncycastle.jce.exception.ExtCertPathValidatorException(sb3.toString(), e3, certPath, i);
            }
        } catch (org.bouncycastle.jce.provider.AnnotatedException e4) {
            throw new org.bouncycastle.jce.exception.ExtCertPathValidatorException("Could not validate time of certificate.", e4, certPath, i);
        }
    }

    private static java.security.cert.X509CRL getHighSpeedVideoSizes(java.util.Set set, java.security.PublicKey publicKey) throws org.bouncycastle.jce.provider.AnnotatedException {
        java.util.Iterator it = set.iterator();
        java.lang.Exception e = null;
        while (it.hasNext()) {
            java.security.cert.X509CRL x509crl = (java.security.cert.X509CRL) it.next();
            try {
                x509crl.verify(publicKey);
                return x509crl;
            } catch (java.lang.Exception e2) {
                e = e2;
            }
        }
        if (e == null) {
            return null;
        }
        throw new org.bouncycastle.jce.provider.AnnotatedException("Cannot verify delta CRL.", e);
    }

    private static java.security.PublicKey getHighSpeedVideoFpsRangesFor(java.security.cert.X509CRL x509crl, java.util.Set set) throws org.bouncycastle.jce.provider.AnnotatedException {
        java.util.Iterator it = set.iterator();
        java.lang.Exception e = null;
        while (it.hasNext()) {
            java.security.PublicKey publicKey = (java.security.PublicKey) it.next();
            try {
                x509crl.verify(publicKey);
                return publicKey;
            } catch (java.lang.Exception e2) {
                e = e2;
            }
        }
        throw new org.bouncycastle.jce.provider.AnnotatedException("Cannot verify CRL.", e);
    }

    private static java.util.Set getHighResolutionOutputSizeshNQ4ISI(java.security.cert.X509CRL x509crl, java.security.cert.X509Certificate x509Certificate, java.security.PublicKey publicKey, org.bouncycastle.jcajce.PKIXExtendedParameters pKIXExtendedParameters, java.util.List list, org.bouncycastle.jcajce.util.JcaJceHelper jcaJceHelper) throws org.bouncycastle.jce.provider.AnnotatedException {
        int i;
        java.security.cert.X509CertSelector x509CertSelector = new java.security.cert.X509CertSelector();
        try {
            x509CertSelector.setSubject(org.bouncycastle.jce.provider.PrincipalUtils.getHighResolutionOutputSizeshNQ4ISI(x509crl).getEncoded());
            org.bouncycastle.jcajce.PKIXCertStoreSelector<? extends java.security.cert.Certificate> build = new org.bouncycastle.jcajce.PKIXCertStoreSelector.Builder(x509CertSelector).build();
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            try {
                org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighSpeedVideoFpsRangesFor(linkedHashSet, build, pKIXExtendedParameters.getCertificateStores());
                org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighSpeedVideoFpsRangesFor(linkedHashSet, build, pKIXExtendedParameters.getCertStores());
                linkedHashSet.add(x509Certificate);
                java.util.Iterator it = linkedHashSet.iterator();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.security.cert.X509Certificate x509Certificate2 = (java.security.cert.X509Certificate) it.next();
                    if (x509Certificate2.equals(x509Certificate)) {
                        arrayList.add(x509Certificate2);
                        arrayList2.add(publicKey);
                    } else {
                        try {
                            java.security.cert.CertPathBuilderSpi pKIXCertPathBuilderSpi_8 = getValidOutputFormatsForInputhNQ4ISI != null ? new org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi_8(true) : new org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi(true);
                            java.security.cert.X509CertSelector x509CertSelector2 = new java.security.cert.X509CertSelector();
                            x509CertSelector2.setCertificate(x509Certificate2);
                            org.bouncycastle.jcajce.PKIXExtendedParameters.Builder targetConstraints = new org.bouncycastle.jcajce.PKIXExtendedParameters.Builder(pKIXExtendedParameters).setTargetConstraints(new org.bouncycastle.jcajce.PKIXCertStoreSelector.Builder(x509CertSelector2).build());
                            if (list.contains(x509Certificate2)) {
                                targetConstraints.setRevocationEnabled(false);
                            } else {
                                targetConstraints.setRevocationEnabled(true);
                            }
                            java.util.List<? extends java.security.cert.Certificate> certificates = pKIXCertPathBuilderSpi_8.engineBuild(new org.bouncycastle.jcajce.PKIXExtendedBuilderParameters.Builder(targetConstraints.build()).build()).getCertPath().getCertificates();
                            arrayList.add(x509Certificate2);
                            arrayList2.add(org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighResolutionOutputSizeshNQ4ISI(certificates, 0, jcaJceHelper));
                        } catch (java.security.cert.CertPathBuilderException e) {
                            throw new org.bouncycastle.jce.provider.AnnotatedException("CertPath for CRL signer failed to validate.", e);
                        } catch (java.security.cert.CertPathValidatorException e2) {
                            throw new org.bouncycastle.jce.provider.AnnotatedException("Public key of issuer certificate of CRL could not be retrieved.", e2);
                        } catch (java.lang.Exception e3) {
                            throw new org.bouncycastle.jce.provider.AnnotatedException(e3.getMessage());
                        }
                    }
                }
                java.util.HashSet hashSet = new java.util.HashSet();
                org.bouncycastle.jce.provider.AnnotatedException annotatedException = null;
                for (i = 0; i < arrayList.size(); i++) {
                    boolean[] keyUsage = ((java.security.cert.X509Certificate) arrayList.get(i)).getKeyUsage();
                    if (keyUsage == null || (keyUsage.length > 6 && keyUsage[6])) {
                        hashSet.add(arrayList2.get(i));
                    } else {
                        annotatedException = new org.bouncycastle.jce.provider.AnnotatedException("Issuer certificate key usage extension does not permit CRL signing.");
                    }
                }
                if (hashSet.isEmpty() && annotatedException == null) {
                    throw new org.bouncycastle.jce.provider.AnnotatedException("Cannot find a valid issuer certificate.");
                }
                if (!hashSet.isEmpty() || annotatedException == null) {
                    return hashSet;
                }
                throw annotatedException;
            } catch (org.bouncycastle.jce.provider.AnnotatedException e4) {
                throw new org.bouncycastle.jce.provider.AnnotatedException("Issuer certificate for CRL cannot be searched.", e4);
            }
        } catch (java.io.IOException e5) {
            throw new org.bouncycastle.jce.provider.AnnotatedException("Subject criteria for certificate selector to find issuer certificate for CRL could not be set.", e5);
        }
    }

    protected static void getHighResolutionOutputSizeshNQ4ISI(java.security.cert.CertPath certPath, int i, java.util.Set set, java.util.List list) throws java.security.cert.CertPathValidatorException {
        java.security.cert.X509Certificate x509Certificate = (java.security.cert.X509Certificate) certPath.getCertificates().get(i);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((java.security.cert.PKIXCertPathChecker) it.next()).check(x509Certificate, set);
            } catch (java.security.cert.CertPathValidatorException e) {
                throw new java.security.cert.CertPathValidatorException(e.getMessage(), e.getCause(), certPath, i);
            }
        }
        if (!set.isEmpty()) {
            throw new org.bouncycastle.jce.exception.ExtCertPathValidatorException("Certificate has unsupported critical extension: ".concat(java.lang.String.valueOf(set)), null, certPath, i);
        }
    }

    protected static void Camera2StreamConfigurationMap(java.security.cert.CertPath certPath, int i) throws java.security.cert.CertPathValidatorException {
        boolean[] keyUsage = ((java.security.cert.X509Certificate) certPath.getCertificates().get(i)).getKeyUsage();
        if (keyUsage != null) {
            if (keyUsage.length <= 5 || !keyUsage[5]) {
                throw new org.bouncycastle.jce.exception.ExtCertPathValidatorException("Issuer certificate keyusage extension is critical and does not permit key signing.", null, certPath, i);
            }
        }
    }

    protected static int getOutputFormats(java.security.cert.CertPath certPath, int i, int i2) throws java.security.cert.CertPathValidatorException {
        java.math.BigInteger pathLenConstraint;
        int intValue;
        try {
            org.bouncycastle.asn1.x509.BasicConstraints basicConstraints = org.bouncycastle.asn1.x509.BasicConstraints.getInstance(org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighSpeedVideoSizes((java.security.cert.X509Certificate) certPath.getCertificates().get(i), Camera2StreamConfigurationMap));
            return (basicConstraints == null || (pathLenConstraint = basicConstraints.getPathLenConstraint()) == null || (intValue = pathLenConstraint.intValue()) >= i2) ? i2 : intValue;
        } catch (java.lang.Exception e) {
            throw new org.bouncycastle.jce.exception.ExtCertPathValidatorException("Basic constraints extension cannot be decoded.", e, certPath, i);
        }
    }

    protected static int getHighSpeedVideoSizesFor(java.security.cert.CertPath certPath, int i, int i2) throws java.security.cert.CertPathValidatorException {
        if (org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighResolutionOutputSizeshNQ4ISI((java.security.cert.X509Certificate) certPath.getCertificates().get(i))) {
            return i2;
        }
        if (i2 > 0) {
            return i2 - 1;
        }
        throw new org.bouncycastle.jce.exception.ExtCertPathValidatorException("Max path length not greater than zero", null, certPath, i);
    }

    protected static void getHighResolutionOutputSizeshNQ4ISI(java.security.cert.CertPath certPath, int i) throws java.security.cert.CertPathValidatorException {
        try {
            org.bouncycastle.asn1.x509.BasicConstraints basicConstraints = org.bouncycastle.asn1.x509.BasicConstraints.getInstance(org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighSpeedVideoSizes((java.security.cert.X509Certificate) certPath.getCertificates().get(i), Camera2StreamConfigurationMap));
            if (basicConstraints == null) {
                throw new java.security.cert.CertPathValidatorException("Intermediate certificate lacks BasicConstraints", null, certPath, i);
            }
            if (!basicConstraints.isCA()) {
                throw new java.security.cert.CertPathValidatorException("Not a CA certificate", null, certPath, i);
            }
        } catch (java.lang.Exception e) {
            throw new org.bouncycastle.jce.exception.ExtCertPathValidatorException("Basic constraints extension cannot be decoded.", e, certPath, i);
        }
    }

    protected static int getInputSizeshNQ4ISI(java.security.cert.CertPath certPath, int i, int i2) throws java.security.cert.CertPathValidatorException {
        int intValueExact;
        try {
            org.bouncycastle.asn1.ASN1Integer aSN1Integer = org.bouncycastle.asn1.ASN1Integer.getInstance(org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighSpeedVideoSizes((java.security.cert.X509Certificate) certPath.getCertificates().get(i), getInputFormats));
            return (aSN1Integer == null || (intValueExact = aSN1Integer.intValueExact()) >= i2) ? i2 : intValueExact;
        } catch (java.lang.Exception e) {
            throw new org.bouncycastle.jce.exception.ExtCertPathValidatorException("Inhibit any-policy extension cannot be decoded.", e, certPath, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        r4 = org.bouncycastle.asn1.ASN1Integer.getInstance(r1, false).intValueExact();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        if (r4 >= r6) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected static int getHighResolutionOutputSizeshNQ4ISI(java.security.cert.CertPath certPath, int i, int i2) throws java.security.cert.CertPathValidatorException {
        try {
            org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighSpeedVideoSizes((java.security.cert.X509Certificate) certPath.getCertificates().get(i), getOutputMinFrameDurationlomOqCM));
            if (aSN1Sequence != null) {
                java.util.Enumeration objects = aSN1Sequence.getObjects();
                while (true) {
                    if (!objects.hasMoreElements()) {
                        break;
                    }
                    try {
                        org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(objects.nextElement());
                        if (aSN1TaggedObject.getTagNo() == 1) {
                            break;
                        }
                    } catch (java.lang.IllegalArgumentException e) {
                        throw new org.bouncycastle.jce.exception.ExtCertPathValidatorException("Policy constraints extension contents cannot be decoded.", e, certPath, i);
                    }
                }
            }
            return i2;
        } catch (java.lang.Exception e2) {
            throw new org.bouncycastle.jce.exception.ExtCertPathValidatorException("Policy constraints extension cannot be decoded.", e2, certPath, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        r3 = org.bouncycastle.asn1.ASN1Integer.getInstance(r1, false).intValueExact();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (r3 >= r5) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected static int getHighSpeedVideoFpsRangesFor(java.security.cert.CertPath certPath, int i, int i2) throws java.security.cert.CertPathValidatorException {
        try {
            org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighSpeedVideoSizes((java.security.cert.X509Certificate) certPath.getCertificates().get(i), getOutputMinFrameDurationlomOqCM));
            if (aSN1Sequence != null) {
                java.util.Enumeration objects = aSN1Sequence.getObjects();
                while (true) {
                    if (!objects.hasMoreElements()) {
                        break;
                    }
                    try {
                        org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(objects.nextElement());
                        if (aSN1TaggedObject.getTagNo() == 0) {
                            break;
                        }
                    } catch (java.lang.IllegalArgumentException e) {
                        throw new org.bouncycastle.jce.exception.ExtCertPathValidatorException("Policy constraints extension contents cannot be decoded.", e, certPath, i);
                    }
                }
            }
            return i2;
        } catch (java.lang.Exception e2) {
            throw new org.bouncycastle.jce.exception.ExtCertPathValidatorException("Policy constraints extension cannot be decoded.", e2, certPath, i);
        }
    }

    protected static int getHighSpeedVideoSizes(java.security.cert.CertPath certPath, int i, int i2) {
        return (org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighResolutionOutputSizeshNQ4ISI((java.security.cert.X509Certificate) certPath.getCertificates().get(i)) || i2 == 0) ? i2 : i2 - 1;
    }

    protected static int getHighSpeedVideoFpsRanges(java.security.cert.CertPath certPath, int i, int i2) {
        return (org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighResolutionOutputSizeshNQ4ISI((java.security.cert.X509Certificate) certPath.getCertificates().get(i)) || i2 == 0) ? i2 : i2 - 1;
    }

    protected static int Camera2StreamConfigurationMap(java.security.cert.CertPath certPath, int i, int i2) {
        return (org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighResolutionOutputSizeshNQ4ISI((java.security.cert.X509Certificate) certPath.getCertificates().get(i)) || i2 == 0) ? i2 : i2 - 1;
    }

    protected static void getHighSpeedVideoFpsRangesFor(java.security.cert.CertPath certPath, int i, org.bouncycastle.jce.provider.PKIXNameConstraintValidator pKIXNameConstraintValidator) throws java.security.cert.CertPathValidatorException {
        try {
            org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighSpeedVideoSizes((java.security.cert.X509Certificate) certPath.getCertificates().get(i), getOutputSizes));
            org.bouncycastle.asn1.x509.NameConstraints nameConstraints = aSN1Sequence != null ? org.bouncycastle.asn1.x509.NameConstraints.getInstance(aSN1Sequence) : null;
            if (nameConstraints != null) {
                org.bouncycastle.asn1.x509.GeneralSubtree[] permittedSubtrees = nameConstraints.getPermittedSubtrees();
                if (permittedSubtrees != null) {
                    try {
                        pKIXNameConstraintValidator.intersectPermittedSubtree(permittedSubtrees);
                    } catch (java.lang.Exception e) {
                        throw new org.bouncycastle.jce.exception.ExtCertPathValidatorException("Permitted subtrees cannot be build from name constraints extension.", e, certPath, i);
                    }
                }
                org.bouncycastle.asn1.x509.GeneralSubtree[] excludedSubtrees = nameConstraints.getExcludedSubtrees();
                if (excludedSubtrees != null) {
                    for (int i2 = 0; i2 != excludedSubtrees.length; i2++) {
                        try {
                            pKIXNameConstraintValidator.addExcludedSubtree(excludedSubtrees[i2]);
                        } catch (java.lang.Exception e2) {
                            throw new org.bouncycastle.jce.exception.ExtCertPathValidatorException("Excluded subtrees cannot be build from name constraints extension.", e2, certPath, i);
                        }
                    }
                }
            }
        } catch (java.lang.Exception e3) {
            throw new org.bouncycastle.jce.exception.ExtCertPathValidatorException("Name constraints extension could not be decoded.", e3, certPath, i);
        }
    }

    protected static void getHighSpeedVideoFpsRanges(java.security.cert.CertPath certPath, int i) throws java.security.cert.CertPathValidatorException {
        try {
            org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighSpeedVideoSizes((java.security.cert.X509Certificate) certPath.getCertificates().get(i), getOutputSizeshNQ4ISI));
            if (aSN1Sequence != null) {
                for (int i2 = 0; i2 < aSN1Sequence.size(); i2++) {
                    try {
                        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence2 = org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(i2));
                        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(aSN1Sequence2.getObjectAt(0));
                        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier2 = org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(aSN1Sequence2.getObjectAt(1));
                        if ("2.5.29.32.0".equals(aSN1ObjectIdentifier.getId())) {
                            throw new java.security.cert.CertPathValidatorException("IssuerDomainPolicy is anyPolicy", null, certPath, i);
                        }
                        if ("2.5.29.32.0".equals(aSN1ObjectIdentifier2.getId())) {
                            throw new java.security.cert.CertPathValidatorException("SubjectDomainPolicy is anyPolicy", null, certPath, i);
                        }
                    } catch (java.lang.Exception e) {
                        throw new org.bouncycastle.jce.exception.ExtCertPathValidatorException("Policy mappings extension contents could not be decoded.", e, certPath, i);
                    }
                }
            }
        } catch (org.bouncycastle.jce.provider.AnnotatedException e2) {
            throw new org.bouncycastle.jce.exception.ExtCertPathValidatorException("Policy mappings extension could not be decoded.", e2, certPath, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00aa, code lost:
    
        r5 = r20[r3].iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b4, code lost:
    
        if (r5.hasNext() == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b6, code lost:
    
        r6 = (org.bouncycastle.jce.provider.PKIXPolicyNode) r5.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c6, code lost:
    
        if ("2.5.29.32.0".equals(r6.getValidPolicy()) == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d0, code lost:
    
        r5 = ((org.bouncycastle.asn1.ASN1Sequence) org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighSpeedVideoSizes(r4, org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getHighSpeedVideoFpsRangesFor)).getObjects();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d8, code lost:
    
        if (r5.hasMoreElements() == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00da, code lost:
    
        r7 = org.bouncycastle.asn1.x509.PolicyInformation.getInstance(r5.nextElement());
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ee, code lost:
    
        if ("2.5.29.32.0".equals(r7.getPolicyIdentifier().getId()) == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f0, code lost:
    
        r5 = org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighSpeedVideoSizes(r7.getPolicyQualifiers());
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x010c, code lost:
    
        r10 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0111, code lost:
    
        if (r4.getCriticalExtensionOIDs() == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0113, code lost:
    
        r12 = r4.getCriticalExtensionOIDs().contains(org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getHighSpeedVideoFpsRangesFor);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0120, code lost:
    
        r9 = (org.bouncycastle.jce.provider.PKIXPolicyNode) r6.getParent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x012f, code lost:
    
        if ("2.5.29.32.0".equals(r9.getValidPolicy()) == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0131, code lost:
    
        r8 = new org.bouncycastle.jce.provider.PKIXPolicyNode(new java.util.ArrayList(), r3, (java.util.Set) r13.get(r11), r9, r10, r11, r12);
        r9.addChild(r8);
        r20[r3].add(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x011f, code lost:
    
        r12 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0101, code lost:
    
        throw new org.bouncycastle.jce.exception.ExtCertPathValidatorException("Policy qualifier info set could not be decoded.", r0, r18, r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0102, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x010a, code lost:
    
        throw new java.security.cert.CertPathValidatorException("Policy information could not be decoded.", r0, r18, r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x010b, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0155, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x015d, code lost:
    
        throw new org.bouncycastle.jce.exception.ExtCertPathValidatorException("Certificate policies extension could not be decoded.", r0, r18, r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01b2, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected static org.bouncycastle.jce.provider.PKIXPolicyNode getHighSpeedVideoFpsRanges(java.security.cert.CertPath certPath, int i, java.util.List[] listArr, org.bouncycastle.jce.provider.PKIXPolicyNode pKIXPolicyNode, int i2) throws java.security.cert.CertPathValidatorException {
        int i3;
        java.util.List<? extends java.security.cert.Certificate> certificates = certPath.getCertificates();
        java.security.cert.X509Certificate x509Certificate = (java.security.cert.X509Certificate) certificates.get(i);
        int size = certificates.size() - i;
        try {
            org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighSpeedVideoSizes(x509Certificate, getOutputSizeshNQ4ISI));
            if (aSN1Sequence == null) {
                return pKIXPolicyNode;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.HashSet<java.lang.String> hashSet = new java.util.HashSet();
            boolean z = false;
            for (int i4 = 0; i4 < aSN1Sequence.size(); i4++) {
                org.bouncycastle.asn1.ASN1Sequence aSN1Sequence2 = (org.bouncycastle.asn1.ASN1Sequence) aSN1Sequence.getObjectAt(i4);
                java.lang.String id = ((org.bouncycastle.asn1.ASN1ObjectIdentifier) aSN1Sequence2.getObjectAt(0)).getId();
                java.lang.String id2 = ((org.bouncycastle.asn1.ASN1ObjectIdentifier) aSN1Sequence2.getObjectAt(1)).getId();
                if (hashMap.containsKey(id)) {
                    ((java.util.Set) hashMap.get(id)).add(id2);
                } else {
                    java.util.HashSet hashSet2 = new java.util.HashSet();
                    hashSet2.add(id2);
                    hashMap.put(id, hashSet2);
                    hashSet.add(id);
                }
            }
            org.bouncycastle.jce.provider.PKIXPolicyNode pKIXPolicyNode2 = pKIXPolicyNode;
            for (java.lang.String str : hashSet) {
                if (i2 > 0) {
                    java.util.Iterator it = listArr[size].iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        org.bouncycastle.jce.provider.PKIXPolicyNode pKIXPolicyNode3 = (org.bouncycastle.jce.provider.PKIXPolicyNode) it.next();
                        if (pKIXPolicyNode3.getValidPolicy().equals(str)) {
                            pKIXPolicyNode3.expectedPolicies = (java.util.Set) hashMap.get(str);
                            break;
                        }
                    }
                } else if (i2 <= 0) {
                    java.util.Iterator it2 = listArr[size].iterator();
                    while (it2.hasNext()) {
                        org.bouncycastle.jce.provider.PKIXPolicyNode pKIXPolicyNode4 = (org.bouncycastle.jce.provider.PKIXPolicyNode) it2.next();
                        if (pKIXPolicyNode4.getValidPolicy().equals(str)) {
                            ((org.bouncycastle.jce.provider.PKIXPolicyNode) pKIXPolicyNode4.getParent()).removeChild(pKIXPolicyNode4);
                            it2.remove();
                            for (int i5 = size - 1; i5 >= 0; i5--) {
                                java.util.List list = listArr[i5];
                                org.bouncycastle.jce.provider.PKIXPolicyNode pKIXPolicyNode5 = pKIXPolicyNode2;
                                while (i3 < list.size()) {
                                    org.bouncycastle.jce.provider.PKIXPolicyNode pKIXPolicyNode6 = (org.bouncycastle.jce.provider.PKIXPolicyNode) list.get(i3);
                                    i3 = (pKIXPolicyNode6.hasChildren() || (pKIXPolicyNode5 = org.bouncycastle.jce.provider.CertPathValidatorUtilities.getHighResolutionOutputSizeshNQ4ISI(pKIXPolicyNode5, listArr, pKIXPolicyNode6)) != null) ? i3 + 1 : 0;
                                }
                                pKIXPolicyNode2 = pKIXPolicyNode5;
                            }
                        }
                    }
                }
                z = false;
            }
            return pKIXPolicyNode2;
        } catch (org.bouncycastle.jce.provider.AnnotatedException e) {
            throw new org.bouncycastle.jce.exception.ExtCertPathValidatorException("Policy mappings extension could not be decoded.", e, certPath, i);
        }
    }

    RFC3280CertPathUtilities() {
    }
}
