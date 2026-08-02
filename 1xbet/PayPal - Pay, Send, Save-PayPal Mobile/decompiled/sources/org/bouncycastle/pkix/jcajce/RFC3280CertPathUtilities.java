package org.bouncycastle.pkix.jcajce;

/* loaded from: classes17.dex */
class RFC3280CertPathUtilities {
    public static final java.lang.String getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.x509.Extension.issuingDistributionPoint.getId();
    public static final java.lang.String getHighSpeedVideoSizes = org.bouncycastle.asn1.x509.Extension.freshestCRL.getId();
    public static final java.lang.String Camera2StreamConfigurationMap = org.bouncycastle.asn1.x509.Extension.deltaCRLIndicator.getId();
    public static final java.lang.String getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.x509.Extension.basicConstraints.getId();
    public static final java.lang.String getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.x509.Extension.authorityKeyIdentifier.getId();

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0110, code lost:
    
        if (r18 == 0) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0112, code lost:
    
        r18 = r18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x036f A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r18v14 */
    /* JADX WARN: Type inference failed for: r18v15 */
    /* JADX WARN: Type inference failed for: r18v16 */
    /* JADX WARN: Type inference failed for: r18v17 */
    /* JADX WARN: Type inference failed for: r18v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.x509.DistributionPoint distributionPoint, org.bouncycastle.jcajce.PKIXExtendedParameters pKIXExtendedParameters, java.util.Date date, java.util.Date date2, java.security.cert.X509Certificate x509Certificate, java.security.cert.X509Certificate x509Certificate2, java.security.PublicKey publicKey, org.bouncycastle.pkix.jcajce.CertStatus certStatus, org.bouncycastle.pkix.jcajce.ReasonsMask reasonsMask, java.util.List list, org.bouncycastle.jcajce.util.JcaJceHelper jcaJceHelper) throws org.bouncycastle.pkix.jcajce.AnnotatedException, org.bouncycastle.pkix.jcajce.CRLNotFoundException {
        java.util.Iterator it;
        org.bouncycastle.pkix.jcajce.AnnotatedException annotatedException;
        java.util.Set<java.lang.String> criticalExtensionOIDs;
        org.bouncycastle.asn1.ASN1Primitive highSpeedVideoFpsRanges;
        int i;
        int i2;
        int i3;
        org.bouncycastle.asn1.x509.DistributionPoint distributionPoint2 = distributionPoint;
        if (date2.getTime() > date.getTime()) {
            throw new org.bouncycastle.pkix.jcajce.AnnotatedException("Validation time is in future.");
        }
        java.util.Iterator it2 = org.bouncycastle.pkix.jcajce.RevocationUtilities.getHighSpeedVideoFpsRanges(distributionPoint2, x509Certificate, date2, pKIXExtendedParameters.getCertStores(), pKIXExtendedParameters.getCRLStores()).iterator();
        org.bouncycastle.pkix.jcajce.AnnotatedException e = null;
        boolean z = false;
        while (it2.hasNext() && certStatus.getHighSpeedVideoFpsRangesFor == 11 && reasonsMask.getHighSpeedVideoSizes != org.bouncycastle.pkix.jcajce.ReasonsMask.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes) {
            try {
                java.security.cert.X509CRL x509crl = (java.security.cert.X509CRL) it2.next();
                org.bouncycastle.pkix.jcajce.ReasonsMask highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(x509crl, distributionPoint2);
                if ((highResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes | (reasonsMask.getHighSpeedVideoSizes ^ highResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes)) != 0) {
                    java.security.cert.X509CRL highResolutionOutputSizeshNQ4ISI2 = pKIXExtendedParameters.isUseDeltasEnabled() ? getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.pkix.jcajce.RevocationUtilities.getHighSpeedVideoFpsRanges(date2, x509crl, pKIXExtendedParameters.getCertStores(), pKIXExtendedParameters.getCRLStores()), getHighResolutionOutputSizeshNQ4ISI(x509crl, getHighSpeedVideoFpsRangesFor(x509crl, x509Certificate2, publicKey, pKIXExtendedParameters, list, jcaJceHelper))) : null;
                    if (pKIXExtendedParameters.getValidityModel() != 1 && x509Certificate.getNotAfter().getTime() < x509crl.getThisUpdate().getTime()) {
                        throw new org.bouncycastle.pkix.jcajce.AnnotatedException("No valid CRL for current time found.");
                    }
                    org.bouncycastle.asn1.ASN1Primitive highSpeedVideoFpsRanges2 = org.bouncycastle.pkix.jcajce.RevocationUtilities.getHighSpeedVideoFpsRanges(x509crl, org.bouncycastle.asn1.x509.Extension.issuingDistributionPoint);
                    boolean z2 = highSpeedVideoFpsRanges2 != null && org.bouncycastle.asn1.x509.IssuingDistributionPoint.getInstance(highSpeedVideoFpsRanges2).isIndirectCRL();
                    byte[] encoded = x509crl.getIssuerX500Principal().getEncoded();
                    if (distributionPoint.getCRLIssuer() != null) {
                        org.bouncycastle.asn1.x509.GeneralName[] names = distributionPoint.getCRLIssuer().getNames();
                        int i4 = 0;
                        ?? r18 = 0;
                        while (i4 < names.length) {
                            if (names[i4].getTagNo() == 4) {
                                try {
                                    if (org.bouncycastle.util.Arrays.areEqual(names[i4].getName().toASN1Primitive().getEncoded(), encoded)) {
                                        r18 = 1;
                                    }
                                } catch (java.io.IOException e2) {
                                    throw new org.bouncycastle.pkix.jcajce.AnnotatedException("CRL issuer information from distribution point cannot be decoded.", e2);
                                }
                            }
                            i4++;
                            r18 = r18;
                        }
                        if (r18 != 0 && !z2) {
                            throw new org.bouncycastle.pkix.jcajce.AnnotatedException("Distribution point contains cRLIssuer field but CRL is not indirect.");
                        }
                        throw new org.bouncycastle.pkix.jcajce.AnnotatedException("CRL issuer of CRL does not match CRL issuer of distribution point.");
                    }
                    java.security.cert.X509Certificate x509Certificate3 = x509Certificate;
                    it = it;
                    if (!x509crl.getIssuerX500Principal().equals(x509Certificate.getIssuerX500Principal())) {
                        throw new org.bouncycastle.pkix.jcajce.AnnotatedException("Cannot find matching CRL issuer for certificate.");
                    }
                    try {
                        org.bouncycastle.asn1.x509.IssuingDistributionPoint issuingDistributionPoint = org.bouncycastle.asn1.x509.IssuingDistributionPoint.getInstance(org.bouncycastle.pkix.jcajce.RevocationUtilities.getHighSpeedVideoFpsRanges(x509crl, org.bouncycastle.asn1.x509.Extension.issuingDistributionPoint));
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
                                        java.util.Enumeration objects = org.bouncycastle.asn1.ASN1Sequence.getInstance(x509crl.getIssuerX500Principal().getEncoded()).getObjects();
                                        while (objects.hasMoreElements()) {
                                            aSN1EncodableVector.add((org.bouncycastle.asn1.ASN1Encodable) objects.nextElement());
                                        }
                                        aSN1EncodableVector.add(distributionPoint3.getName());
                                        arrayList.add(new org.bouncycastle.asn1.x509.GeneralName(org.bouncycastle.asn1.x500.X500Name.getInstance(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector))));
                                    } catch (java.lang.Exception e3) {
                                        throw new org.bouncycastle.pkix.jcajce.AnnotatedException("Could not read CRL issuer.", e3);
                                    }
                                }
                                if (distributionPoint.getDistributionPoint() == null) {
                                    annotatedException = e;
                                    it = it2;
                                    if (distributionPoint.getCRLIssuer() == null) {
                                        throw new org.bouncycastle.pkix.jcajce.AnnotatedException("Either the cRLIssuer or the distributionPoint field must be contained in DistributionPoint.");
                                    }
                                    org.bouncycastle.asn1.x509.GeneralName[] names2 = distributionPoint.getCRLIssuer().getNames();
                                    while (i < names2.length) {
                                        i = arrayList.contains(names2[i]) ? 0 : i + 1;
                                    }
                                    throw new org.bouncycastle.pkix.jcajce.AnnotatedException("No match for certificate CRL issuing distribution point name to cRLIssuer CRL distribution point.");
                                }
                                org.bouncycastle.asn1.x509.DistributionPointName distributionPoint4 = distributionPoint.getDistributionPoint();
                                org.bouncycastle.asn1.x509.GeneralName[] names3 = distributionPoint4.getType() == 0 ? org.bouncycastle.asn1.x509.GeneralNames.getInstance(distributionPoint4.getName()).getNames() : null;
                                it = it2;
                                if (distributionPoint4.getType() == 1) {
                                    try {
                                        if (distributionPoint.getCRLIssuer() != null) {
                                            names3 = distributionPoint.getCRLIssuer().getNames();
                                            i2 = 0;
                                        } else {
                                            names3 = new org.bouncycastle.asn1.x509.GeneralName[1];
                                            try {
                                                java.security.cert.X509Certificate x509Certificate4 = x509Certificate;
                                                i2 = 0;
                                                names3[0] = new org.bouncycastle.asn1.x509.GeneralName(org.bouncycastle.asn1.x500.X500Name.getInstance(x509Certificate.getIssuerX500Principal().getEncoded()));
                                            } catch (java.lang.Exception e4) {
                                                throw new org.bouncycastle.pkix.jcajce.AnnotatedException("Could not read certificate issuer.", e4);
                                            }
                                        }
                                        int i5 = i2;
                                        while (i5 < names3.length) {
                                            org.bouncycastle.pkix.jcajce.AnnotatedException annotatedException2 = e;
                                            org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector2 = new org.bouncycastle.asn1.ASN1EncodableVector();
                                            for (java.util.Enumeration objects2 = org.bouncycastle.asn1.ASN1Sequence.getInstance(names3[i5].getName().toASN1Primitive()).getObjects(); objects2.hasMoreElements(); objects2 = objects2) {
                                                aSN1EncodableVector2.add((org.bouncycastle.asn1.ASN1Encodable) objects2.nextElement());
                                            }
                                            aSN1EncodableVector2.add(distributionPoint4.getName());
                                            names3[i5] = new org.bouncycastle.asn1.x509.GeneralName(org.bouncycastle.asn1.x500.X500Name.getInstance(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector2)));
                                            i5++;
                                            e = annotatedException2;
                                            distributionPoint4 = distributionPoint4;
                                        }
                                    } catch (org.bouncycastle.pkix.jcajce.AnnotatedException e5) {
                                        e = e5;
                                        distributionPoint2 = distributionPoint;
                                        it2 = it;
                                    }
                                }
                                annotatedException = e;
                                if (names3 != null) {
                                    while (i3 < names3.length) {
                                        it = it;
                                        i3 = arrayList.contains(names3[i3]) ? 0 : i3 + 1;
                                    }
                                }
                                throw new org.bouncycastle.pkix.jcajce.AnnotatedException("No match for certificate CRL issuing distribution point name to cRLIssuer CRL distribution point.");
                            }
                            annotatedException = e;
                            it = it2;
                            try {
                                org.bouncycastle.asn1.x509.BasicConstraints basicConstraints = org.bouncycastle.asn1.x509.BasicConstraints.getInstance(org.bouncycastle.pkix.jcajce.RevocationUtilities.getHighSpeedVideoFpsRanges(x509Certificate, org.bouncycastle.asn1.x509.Extension.basicConstraints));
                                if (x509Certificate instanceof java.security.cert.X509Certificate) {
                                    if (issuingDistributionPoint.onlyContainsUserCerts() && basicConstraints != null && basicConstraints.isCA()) {
                                        throw new org.bouncycastle.pkix.jcajce.AnnotatedException("CA Cert CRL only contains user certificates.");
                                    }
                                    if (issuingDistributionPoint.onlyContainsCACerts() && (basicConstraints == null || !basicConstraints.isCA())) {
                                        throw new org.bouncycastle.pkix.jcajce.AnnotatedException("End CRL only contains CA certificates.");
                                    }
                                }
                                if (issuingDistributionPoint.onlyContainsAttributeCerts()) {
                                    throw new org.bouncycastle.pkix.jcajce.AnnotatedException("onlyContainsAttributeCerts boolean is asserted.");
                                }
                                it = it;
                            } catch (java.lang.Exception e6) {
                                throw new org.bouncycastle.pkix.jcajce.AnnotatedException("Basic constraints extension could not be decoded.", e6);
                            }
                        } else {
                            annotatedException = e;
                            it = it2;
                        }
                        if (highResolutionOutputSizeshNQ4ISI2 != null) {
                            try {
                                org.bouncycastle.asn1.x509.IssuingDistributionPoint issuingDistributionPoint2 = org.bouncycastle.asn1.x509.IssuingDistributionPoint.getInstance(org.bouncycastle.pkix.jcajce.RevocationUtilities.getHighSpeedVideoFpsRanges(x509crl, org.bouncycastle.asn1.x509.Extension.issuingDistributionPoint));
                                if (pKIXExtendedParameters.isUseDeltasEnabled()) {
                                    if (!highResolutionOutputSizeshNQ4ISI2.getIssuerX500Principal().equals(x509crl.getIssuerX500Principal())) {
                                        throw new org.bouncycastle.pkix.jcajce.AnnotatedException("complete CRL issuer does not match delta CRL issuer");
                                    }
                                    try {
                                        org.bouncycastle.asn1.x509.IssuingDistributionPoint issuingDistributionPoint3 = org.bouncycastle.asn1.x509.IssuingDistributionPoint.getInstance(org.bouncycastle.pkix.jcajce.RevocationUtilities.getHighSpeedVideoFpsRanges(highResolutionOutputSizeshNQ4ISI2, org.bouncycastle.asn1.x509.Extension.issuingDistributionPoint));
                                        if (issuingDistributionPoint2 == null) {
                                            if (issuingDistributionPoint3 != null) {
                                                throw new org.bouncycastle.pkix.jcajce.AnnotatedException("Issuing distribution point extension from delta CRL and complete CRL does not match.");
                                            }
                                            try {
                                                highSpeedVideoFpsRanges = org.bouncycastle.pkix.jcajce.RevocationUtilities.getHighSpeedVideoFpsRanges(x509crl, org.bouncycastle.asn1.x509.Extension.authorityKeyIdentifier);
                                                try {
                                                    org.bouncycastle.asn1.ASN1Primitive highSpeedVideoFpsRanges3 = org.bouncycastle.pkix.jcajce.RevocationUtilities.getHighSpeedVideoFpsRanges(highResolutionOutputSizeshNQ4ISI2, org.bouncycastle.asn1.x509.Extension.authorityKeyIdentifier);
                                                    if (highSpeedVideoFpsRanges != null) {
                                                        throw new org.bouncycastle.pkix.jcajce.AnnotatedException("CRL authority key identifier is null.");
                                                    }
                                                    if (highSpeedVideoFpsRanges3 == null) {
                                                        throw new org.bouncycastle.pkix.jcajce.AnnotatedException("Delta CRL authority key identifier is null.");
                                                    }
                                                    if (!highSpeedVideoFpsRanges.equals(highSpeedVideoFpsRanges3)) {
                                                        throw new org.bouncycastle.pkix.jcajce.AnnotatedException("Delta CRL authority key identifier does not match complete CRL authority key identifier.");
                                                    }
                                                } catch (org.bouncycastle.pkix.jcajce.AnnotatedException e7) {
                                                    throw new org.bouncycastle.pkix.jcajce.AnnotatedException("Authority key identifier extension could not be extracted from delta CRL.", e7);
                                                }
                                            } catch (org.bouncycastle.pkix.jcajce.AnnotatedException e8) {
                                                throw new org.bouncycastle.pkix.jcajce.AnnotatedException("Authority key identifier extension could not be extracted from complete CRL.", e8);
                                            }
                                        } else {
                                            if (!issuingDistributionPoint2.equals(issuingDistributionPoint3)) {
                                                throw new org.bouncycastle.pkix.jcajce.AnnotatedException("Issuing distribution point extension from delta CRL and complete CRL does not match.");
                                            }
                                            highSpeedVideoFpsRanges = org.bouncycastle.pkix.jcajce.RevocationUtilities.getHighSpeedVideoFpsRanges(x509crl, org.bouncycastle.asn1.x509.Extension.authorityKeyIdentifier);
                                            org.bouncycastle.asn1.ASN1Primitive highSpeedVideoFpsRanges32 = org.bouncycastle.pkix.jcajce.RevocationUtilities.getHighSpeedVideoFpsRanges(highResolutionOutputSizeshNQ4ISI2, org.bouncycastle.asn1.x509.Extension.authorityKeyIdentifier);
                                            if (highSpeedVideoFpsRanges != null) {
                                            }
                                        }
                                    } catch (java.lang.Exception e9) {
                                        throw new org.bouncycastle.pkix.jcajce.AnnotatedException("Issuing distribution point extension from delta CRL could not be decoded.", e9);
                                    }
                                }
                            } catch (java.lang.Exception e10) {
                                throw new org.bouncycastle.pkix.jcajce.AnnotatedException("issuing distribution point extension could not be decoded.", e10);
                            }
                        }
                        if (pKIXExtendedParameters.isUseDeltasEnabled() && highResolutionOutputSizeshNQ4ISI2 != null) {
                            org.bouncycastle.pkix.jcajce.RevocationUtilities.Camera2StreamConfigurationMap(date2, highResolutionOutputSizeshNQ4ISI2, x509Certificate, certStatus);
                        }
                        if (certStatus.getHighSpeedVideoFpsRangesFor == 11) {
                            org.bouncycastle.pkix.jcajce.RevocationUtilities.Camera2StreamConfigurationMap(date2, x509crl, x509Certificate, certStatus);
                        }
                        if (certStatus.getHighSpeedVideoFpsRangesFor == 8) {
                            certStatus.getHighSpeedVideoFpsRangesFor = 11;
                        }
                        reasonsMask.getHighSpeedVideoSizes |= highResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
                        java.util.Set<java.lang.String> criticalExtensionOIDs2 = x509crl.getCriticalExtensionOIDs();
                        if (criticalExtensionOIDs2 != null) {
                            java.util.HashSet hashSet = new java.util.HashSet(criticalExtensionOIDs2);
                            hashSet.remove(org.bouncycastle.asn1.x509.Extension.issuingDistributionPoint.getId());
                            hashSet.remove(org.bouncycastle.asn1.x509.Extension.deltaCRLIndicator.getId());
                            if (!hashSet.isEmpty()) {
                                throw new org.bouncycastle.pkix.jcajce.AnnotatedException("CRL contains unsupported critical extensions.");
                            }
                        }
                        if (highResolutionOutputSizeshNQ4ISI2 != null && (criticalExtensionOIDs = highResolutionOutputSizeshNQ4ISI2.getCriticalExtensionOIDs()) != null) {
                            java.util.HashSet hashSet2 = new java.util.HashSet(criticalExtensionOIDs);
                            hashSet2.remove(org.bouncycastle.asn1.x509.Extension.issuingDistributionPoint.getId());
                            hashSet2.remove(org.bouncycastle.asn1.x509.Extension.deltaCRLIndicator.getId());
                            if (!hashSet2.isEmpty()) {
                                throw new org.bouncycastle.pkix.jcajce.AnnotatedException("Delta CRL contains unsupported critical extension.");
                            }
                        }
                        distributionPoint2 = distributionPoint;
                        it2 = it;
                        e = annotatedException;
                        z = true;
                    } catch (java.lang.Exception e11) {
                        throw new org.bouncycastle.pkix.jcajce.AnnotatedException("Issuing distribution point extension could not be decoded.", e11);
                    }
                } else {
                    distributionPoint2 = distributionPoint;
                }
            } catch (org.bouncycastle.pkix.jcajce.AnnotatedException e12) {
                e = e12;
                it = it2;
                distributionPoint2 = distributionPoint;
                it2 = it;
            }
        }
        org.bouncycastle.pkix.jcajce.AnnotatedException annotatedException3 = e;
        if (!z) {
            throw annotatedException3;
        }
    }

    private static org.bouncycastle.pkix.jcajce.ReasonsMask getHighResolutionOutputSizeshNQ4ISI(java.security.cert.X509CRL x509crl, org.bouncycastle.asn1.x509.DistributionPoint distributionPoint) throws org.bouncycastle.pkix.jcajce.AnnotatedException {
        try {
            org.bouncycastle.asn1.x509.IssuingDistributionPoint issuingDistributionPoint = org.bouncycastle.asn1.x509.IssuingDistributionPoint.getInstance(org.bouncycastle.pkix.jcajce.RevocationUtilities.getHighSpeedVideoFpsRanges(x509crl, org.bouncycastle.asn1.x509.Extension.issuingDistributionPoint));
            if (issuingDistributionPoint != null && issuingDistributionPoint.getOnlySomeReasons() != null && distributionPoint.getReasons() != null) {
                org.bouncycastle.pkix.jcajce.ReasonsMask reasonsMask = new org.bouncycastle.pkix.jcajce.ReasonsMask(distributionPoint.getReasons());
                org.bouncycastle.pkix.jcajce.ReasonsMask reasonsMask2 = new org.bouncycastle.pkix.jcajce.ReasonsMask(issuingDistributionPoint.getOnlySomeReasons());
                org.bouncycastle.pkix.jcajce.ReasonsMask reasonsMask3 = new org.bouncycastle.pkix.jcajce.ReasonsMask();
                reasonsMask3.getHighSpeedVideoSizes |= new org.bouncycastle.pkix.jcajce.ReasonsMask(reasonsMask2.getHighSpeedVideoSizes & reasonsMask.getHighSpeedVideoSizes).getHighSpeedVideoSizes;
                return reasonsMask3;
            }
            if ((issuingDistributionPoint == null || issuingDistributionPoint.getOnlySomeReasons() == null) && distributionPoint.getReasons() == null) {
                return org.bouncycastle.pkix.jcajce.ReasonsMask.getHighSpeedVideoFpsRangesFor;
            }
            org.bouncycastle.pkix.jcajce.ReasonsMask reasonsMask4 = distributionPoint.getReasons() == null ? org.bouncycastle.pkix.jcajce.ReasonsMask.getHighSpeedVideoFpsRangesFor : new org.bouncycastle.pkix.jcajce.ReasonsMask(distributionPoint.getReasons());
            org.bouncycastle.pkix.jcajce.ReasonsMask reasonsMask5 = issuingDistributionPoint == null ? org.bouncycastle.pkix.jcajce.ReasonsMask.getHighSpeedVideoFpsRangesFor : new org.bouncycastle.pkix.jcajce.ReasonsMask(issuingDistributionPoint.getOnlySomeReasons());
            org.bouncycastle.pkix.jcajce.ReasonsMask reasonsMask6 = new org.bouncycastle.pkix.jcajce.ReasonsMask();
            reasonsMask6.getHighSpeedVideoSizes |= new org.bouncycastle.pkix.jcajce.ReasonsMask(reasonsMask5.getHighSpeedVideoSizes & reasonsMask4.getHighSpeedVideoSizes).getHighSpeedVideoSizes;
            return reasonsMask6;
        } catch (java.lang.Exception e) {
            throw new org.bouncycastle.pkix.jcajce.AnnotatedException("Issuing distribution point extension could not be decoded.", e);
        }
    }

    private static java.security.cert.X509CRL getHighResolutionOutputSizeshNQ4ISI(java.util.Set set, java.security.PublicKey publicKey) throws org.bouncycastle.pkix.jcajce.AnnotatedException {
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
        throw new org.bouncycastle.pkix.jcajce.AnnotatedException("Cannot verify delta CRL.", e);
    }

    private static java.security.PublicKey getHighResolutionOutputSizeshNQ4ISI(java.security.cert.X509CRL x509crl, java.util.Set set) throws org.bouncycastle.pkix.jcajce.AnnotatedException {
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
        throw new org.bouncycastle.pkix.jcajce.AnnotatedException("Cannot verify CRL.", e);
    }

    private static java.util.Set getHighSpeedVideoFpsRangesFor(java.security.cert.X509CRL x509crl, java.security.cert.X509Certificate x509Certificate, java.security.PublicKey publicKey, org.bouncycastle.jcajce.PKIXExtendedParameters pKIXExtendedParameters, java.util.List list, org.bouncycastle.jcajce.util.JcaJceHelper jcaJceHelper) throws org.bouncycastle.pkix.jcajce.AnnotatedException {
        int i;
        java.security.cert.X509CertSelector x509CertSelector = new java.security.cert.X509CertSelector();
        try {
            x509CertSelector.setSubject(x509crl.getIssuerX500Principal().getEncoded());
            org.bouncycastle.jcajce.PKIXCertStoreSelector<? extends java.security.cert.Certificate> build = new org.bouncycastle.jcajce.PKIXCertStoreSelector.Builder(x509CertSelector).build();
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            try {
                org.bouncycastle.pkix.jcajce.RevocationUtilities.Camera2StreamConfigurationMap(linkedHashSet, build, pKIXExtendedParameters.getCertificateStores());
                org.bouncycastle.pkix.jcajce.RevocationUtilities.Camera2StreamConfigurationMap(linkedHashSet, build, pKIXExtendedParameters.getCertStores());
                linkedHashSet.add(x509Certificate);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it = linkedHashSet.iterator();
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
                            java.security.cert.CertPathBuilder createCertPathBuilder = jcaJceHelper.createCertPathBuilder("PKIX");
                            java.security.cert.X509CertSelector x509CertSelector2 = new java.security.cert.X509CertSelector();
                            x509CertSelector2.setCertificate(x509Certificate2);
                            org.bouncycastle.jcajce.PKIXExtendedParameters.Builder targetConstraints = new org.bouncycastle.jcajce.PKIXExtendedParameters.Builder(pKIXExtendedParameters).setTargetConstraints(new org.bouncycastle.jcajce.PKIXCertStoreSelector.Builder(x509CertSelector2).build());
                            if (list.contains(x509Certificate2)) {
                                targetConstraints.setRevocationEnabled(false);
                            } else {
                                targetConstraints.setRevocationEnabled(true);
                            }
                            java.util.List<? extends java.security.cert.Certificate> certificates = createCertPathBuilder.build(new org.bouncycastle.jcajce.PKIXExtendedBuilderParameters.Builder(targetConstraints.build()).build()).getCertPath().getCertificates();
                            arrayList.add(x509Certificate2);
                            arrayList2.add(org.bouncycastle.pkix.jcajce.RevocationUtilities.getHighSpeedVideoFpsRangesFor(certificates, 0, jcaJceHelper));
                        } catch (java.security.cert.CertPathBuilderException e) {
                            throw new org.bouncycastle.pkix.jcajce.AnnotatedException("CertPath for CRL signer failed to validate.", e);
                        } catch (java.security.cert.CertPathValidatorException e2) {
                            throw new org.bouncycastle.pkix.jcajce.AnnotatedException("Public key of issuer certificate of CRL could not be retrieved.", e2);
                        } catch (java.lang.Exception e3) {
                            throw new org.bouncycastle.pkix.jcajce.AnnotatedException(e3.getMessage());
                        }
                    }
                }
                java.util.HashSet hashSet = new java.util.HashSet();
                org.bouncycastle.pkix.jcajce.AnnotatedException annotatedException = null;
                for (i = 0; i < arrayList.size(); i++) {
                    boolean[] keyUsage = ((java.security.cert.X509Certificate) arrayList.get(i)).getKeyUsage();
                    if (keyUsage == null || (keyUsage.length > 6 && keyUsage[6])) {
                        hashSet.add(arrayList2.get(i));
                    } else {
                        annotatedException = new org.bouncycastle.pkix.jcajce.AnnotatedException("Issuer certificate key usage extension does not permit CRL signing.");
                    }
                }
                if (hashSet.isEmpty() && annotatedException == null) {
                    throw new org.bouncycastle.pkix.jcajce.AnnotatedException("Cannot find a valid issuer certificate.");
                }
                if (!hashSet.isEmpty() || annotatedException == null) {
                    return hashSet;
                }
                throw annotatedException;
            } catch (org.bouncycastle.pkix.jcajce.AnnotatedException e4) {
                throw new org.bouncycastle.pkix.jcajce.AnnotatedException("Issuer certificate for CRL cannot be searched.", e4);
            }
        } catch (java.io.IOException e5) {
            throw new org.bouncycastle.pkix.jcajce.AnnotatedException("subject criteria for certificate selector to find issuer certificate for CRL could not be set", e5);
        }
    }

    RFC3280CertPathUtilities() {
    }
}
