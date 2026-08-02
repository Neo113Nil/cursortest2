package org.bouncycastle.jce.provider;

/* loaded from: classes17.dex */
class CertPathValidatorUtilities {
    protected static final java.lang.String getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.x509.Extension.certificatePolicies.getId();
    protected static final java.lang.String Camera2StreamConfigurationMap = org.bouncycastle.asn1.x509.Extension.basicConstraints.getId();
    protected static final java.lang.String getOutputStallDurationlomOqCM = org.bouncycastle.asn1.x509.Extension.policyMappings.getId();
    protected static final java.lang.String getOutputSizes = org.bouncycastle.asn1.x509.Extension.subjectAlternativeName.getId();
    protected static final java.lang.String getOutputStallDuration = org.bouncycastle.asn1.x509.Extension.nameConstraints.getId();
    protected static final java.lang.String getHighSpeedVideoSizesFor = org.bouncycastle.asn1.x509.Extension.keyUsage.getId();
    protected static final java.lang.String getOutputMinFrameDuration = org.bouncycastle.asn1.x509.Extension.inhibitAnyPolicy.getId();
    protected static final java.lang.String getInputSizeshNQ4ISI = org.bouncycastle.asn1.x509.Extension.issuingDistributionPoint.getId();
    protected static final java.lang.String getOutputFormats = org.bouncycastle.asn1.x509.Extension.deltaCRLIndicator.getId();
    protected static final java.lang.String getOutputMinFrameDurationlomOqCM = org.bouncycastle.asn1.x509.Extension.policyConstraints.getId();
    protected static final java.lang.String getInputFormats = org.bouncycastle.asn1.x509.Extension.freshestCRL.getId();
    protected static final java.lang.String getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.x509.Extension.cRLDistributionPoints.getId();
    protected static final java.lang.String getHighSpeedVideoSizes = org.bouncycastle.asn1.x509.Extension.authorityKeyIdentifier.getId();
    protected static final java.lang.String getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.x509.Extension.cRLNumber.getId();
    protected static final java.lang.String[] getOutputSizeshNQ4ISI = {"unspecified", "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", "aACompromise"};

    protected static java.security.cert.TrustAnchor getHighSpeedVideoFpsRanges(java.security.cert.X509Certificate x509Certificate, java.util.Set set, java.lang.String str) throws org.bouncycastle.jce.provider.AnnotatedException {
        java.security.cert.X509CertSelector x509CertSelector = new java.security.cert.X509CertSelector();
        javax.security.auth.x500.X500Principal issuerX500Principal = x509Certificate.getIssuerX500Principal();
        x509CertSelector.setSubject(issuerX500Principal);
        java.util.Iterator it = set.iterator();
        java.security.cert.TrustAnchor trustAnchor = null;
        java.lang.Exception exc = null;
        org.bouncycastle.asn1.x500.X500Name x500Name = null;
        java.security.PublicKey publicKey = null;
        while (it.hasNext() && trustAnchor == null) {
            trustAnchor = (java.security.cert.TrustAnchor) it.next();
            if (trustAnchor.getTrustedCert() != null) {
                if (x509CertSelector.match(trustAnchor.getTrustedCert())) {
                    publicKey = trustAnchor.getTrustedCert().getPublicKey();
                }
                trustAnchor = null;
            } else {
                if (trustAnchor.getCA() != null && trustAnchor.getCAName() != null && trustAnchor.getCAPublicKey() != null) {
                    if (x500Name == null) {
                        x500Name = org.bouncycastle.asn1.x500.X500Name.getInstance(issuerX500Principal.getEncoded());
                    }
                    try {
                        if (x500Name.equals(org.bouncycastle.asn1.x500.X500Name.getInstance(trustAnchor.getCA().getEncoded()))) {
                            publicKey = trustAnchor.getCAPublicKey();
                        }
                    } catch (java.lang.IllegalArgumentException unused) {
                    }
                }
                trustAnchor = null;
            }
            if (publicKey != null) {
                if (str == null) {
                    try {
                        x509Certificate.verify(publicKey);
                    } catch (java.lang.Exception e) {
                        exc = e;
                        trustAnchor = null;
                        publicKey = null;
                    }
                } else {
                    x509Certificate.verify(publicKey, str);
                }
            }
        }
        if (trustAnchor != null || exc == null) {
            return trustAnchor;
        }
        throw new org.bouncycastle.jce.provider.AnnotatedException("TrustAnchor found but certificate validation failed.", exc);
    }

    protected static void getHighSpeedVideoFpsRangesFor(java.util.Date date, java.security.cert.X509CRL x509crl, java.lang.Object obj, org.bouncycastle.jce.provider.CertStatus certStatus) throws org.bouncycastle.jce.provider.AnnotatedException {
        java.security.cert.X509CRLEntry revokedCertificate;
        try {
            if (org.bouncycastle.jce.provider.X509CRLObject.isIndirectCRL(x509crl)) {
                revokedCertificate = x509crl.getRevokedCertificate(((java.security.cert.X509Certificate) obj).getSerialNumber());
                if (revokedCertificate == null) {
                    return;
                }
                javax.security.auth.x500.X500Principal certificateIssuer = revokedCertificate.getCertificateIssuer();
                if (!org.bouncycastle.jce.provider.PrincipalUtils.getHighSpeedVideoSizes(obj).equals(certificateIssuer == null ? org.bouncycastle.jce.provider.PrincipalUtils.getHighResolutionOutputSizeshNQ4ISI(x509crl) : org.bouncycastle.jce.provider.PrincipalUtils.getHighSpeedVideoSizes(certificateIssuer))) {
                    return;
                }
            } else if (!org.bouncycastle.jce.provider.PrincipalUtils.getHighSpeedVideoSizes(obj).equals(org.bouncycastle.jce.provider.PrincipalUtils.getHighResolutionOutputSizeshNQ4ISI(x509crl)) || (revokedCertificate = x509crl.getRevokedCertificate(((java.security.cert.X509Certificate) obj).getSerialNumber())) == null) {
                return;
            }
            org.bouncycastle.asn1.ASN1Enumerated aSN1Enumerated = null;
            org.bouncycastle.asn1.ASN1Primitive highResolutionOutputSizeshNQ4ISI = null;
            if (revokedCertificate.hasExtensions()) {
                if (revokedCertificate.hasUnsupportedCriticalExtension()) {
                    throw new org.bouncycastle.jce.provider.AnnotatedException("CRL entry has unsupported critical extensions.");
                }
                try {
                    java.lang.String id = org.bouncycastle.asn1.x509.Extension.reasonCode.getId();
                    byte[] extensionValue = revokedCertificate.getExtensionValue(id);
                    if (extensionValue != null) {
                        highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(id, extensionValue);
                    }
                    aSN1Enumerated = org.bouncycastle.asn1.ASN1Enumerated.getInstance(highResolutionOutputSizeshNQ4ISI);
                } catch (java.lang.Exception e) {
                    throw new org.bouncycastle.jce.provider.AnnotatedException("Reason code CRL entry extension could not be decoded.", e);
                }
            }
            int intValueExact = aSN1Enumerated == null ? 0 : aSN1Enumerated.intValueExact();
            if (date.getTime() >= revokedCertificate.getRevocationDate().getTime() || intValueExact == 0 || intValueExact == 1 || intValueExact == 2 || intValueExact == 10) {
                certStatus.getHighResolutionOutputSizeshNQ4ISI = intValueExact;
                certStatus.getHighSpeedVideoFpsRanges = revokedCertificate.getRevocationDate();
            }
        } catch (java.security.cert.CRLException e2) {
            throw new org.bouncycastle.jce.provider.AnnotatedException("Failed check for indirect CRL.", e2);
        }
    }

    protected static java.util.Set getHighSpeedVideoSizes(org.bouncycastle.jcajce.PKIXCertRevocationCheckerParameters pKIXCertRevocationCheckerParameters, org.bouncycastle.asn1.x509.DistributionPoint distributionPoint, java.lang.Object obj, org.bouncycastle.jcajce.PKIXExtendedParameters pKIXExtendedParameters, java.util.Date date) throws org.bouncycastle.jce.provider.AnnotatedException, org.bouncycastle.jce.provider.RecoverableCertPathValidatorException {
        java.security.cert.X509CRLSelector x509CRLSelector = new java.security.cert.X509CRLSelector();
        try {
            java.util.HashSet hashSet = new java.util.HashSet();
            hashSet.add(org.bouncycastle.jce.provider.PrincipalUtils.getHighSpeedVideoSizes(obj));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (distributionPoint.getCRLIssuer() != null) {
                org.bouncycastle.asn1.x509.GeneralName[] names = distributionPoint.getCRLIssuer().getNames();
                for (int i = 0; i < names.length; i++) {
                    if (names[i].getTagNo() == 4) {
                        try {
                            arrayList.add(org.bouncycastle.asn1.x500.X500Name.getInstance(names[i].getName().toASN1Primitive().getEncoded()));
                        } catch (java.io.IOException e) {
                            throw new org.bouncycastle.jce.provider.AnnotatedException("CRL issuer information from distribution point cannot be decoded.", e);
                        }
                    }
                }
            } else {
                if (distributionPoint.getDistributionPoint() == null) {
                    throw new org.bouncycastle.jce.provider.AnnotatedException("CRL issuer is omitted from distribution point but no distributionPoint field present.");
                }
                java.util.Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
            }
            java.util.Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                try {
                    x509CRLSelector.addIssuerName(((org.bouncycastle.asn1.x500.X500Name) it2.next()).getEncoded());
                } catch (java.io.IOException e2) {
                    throw new org.bouncycastle.jce.provider.AnnotatedException("Cannot decode CRL issuer information.", e2);
                }
            }
            if (obj instanceof java.security.cert.X509Certificate) {
                x509CRLSelector.setCertificateChecking((java.security.cert.X509Certificate) obj);
            }
            java.util.Set highResolutionOutputSizeshNQ4ISI = org.bouncycastle.jce.provider.PKIXCRLUtil.getHighResolutionOutputSizeshNQ4ISI(new org.bouncycastle.jcajce.PKIXCRLStoreSelector.Builder(x509CRLSelector).setCompleteCRLEnabled(true).build(), date, pKIXExtendedParameters.getCertStores(), pKIXExtendedParameters.getCRLStores());
            if (!highResolutionOutputSizeshNQ4ISI.isEmpty()) {
                return highResolutionOutputSizeshNQ4ISI;
            }
            if (obj instanceof org.bouncycastle.x509.X509AttributeCertificate) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("No CRLs found for issuer \"");
                sb.append(((org.bouncycastle.x509.X509AttributeCertificate) obj).getIssuer().getPrincipals()[0]);
                sb.append("\"");
                throw new org.bouncycastle.jce.provider.RecoverableCertPathValidatorException(sb.toString(), pKIXCertRevocationCheckerParameters.getCertPath(), pKIXCertRevocationCheckerParameters.getIndex());
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("No CRLs found for issuer \"");
            sb2.append(org.bouncycastle.asn1.x500.style.RFC4519Style.INSTANCE.toString(org.bouncycastle.jce.provider.PrincipalUtils.getHighResolutionOutputSizeshNQ4ISI((java.security.cert.X509Certificate) obj)));
            sb2.append("\"");
            throw new org.bouncycastle.jce.provider.RecoverableCertPathValidatorException(sb2.toString(), pKIXCertRevocationCheckerParameters.getCertPath(), pKIXCertRevocationCheckerParameters.getIndex());
        } catch (org.bouncycastle.jce.provider.AnnotatedException e3) {
            throw new org.bouncycastle.jce.provider.AnnotatedException("Could not get issuer information from distribution point.", e3);
        }
    }

    protected static java.util.Set getHighSpeedVideoSizes(java.util.Date date, java.security.cert.X509CRL x509crl, java.util.List<java.security.cert.CertStore> list, java.util.List<org.bouncycastle.jcajce.PKIXCRLStore> list2, org.bouncycastle.jcajce.util.JcaJceHelper jcaJceHelper) throws org.bouncycastle.jce.provider.AnnotatedException {
        java.security.cert.X509CRLSelector x509CRLSelector = new java.security.cert.X509CRLSelector();
        try {
            x509CRLSelector.addIssuerName(org.bouncycastle.jce.provider.PrincipalUtils.getHighResolutionOutputSizeshNQ4ISI(x509crl).getEncoded());
            try {
                java.lang.String str = getHighSpeedVideoFpsRangesFor;
                byte[] extensionValue = x509crl.getExtensionValue(str);
                org.bouncycastle.asn1.ASN1Primitive highResolutionOutputSizeshNQ4ISI = extensionValue == null ? null : getHighResolutionOutputSizeshNQ4ISI(str, extensionValue);
                java.math.BigInteger positiveValue = highResolutionOutputSizeshNQ4ISI != null ? org.bouncycastle.asn1.ASN1Integer.getInstance(highResolutionOutputSizeshNQ4ISI).getPositiveValue() : null;
                try {
                    byte[] extensionValue2 = x509crl.getExtensionValue(getInputSizeshNQ4ISI);
                    x509CRLSelector.setMinCRLNumber(positiveValue != null ? positiveValue.add(java.math.BigInteger.valueOf(1L)) : null);
                    org.bouncycastle.jcajce.PKIXCRLStoreSelector.Builder builder = new org.bouncycastle.jcajce.PKIXCRLStoreSelector.Builder(x509CRLSelector);
                    builder.setIssuingDistributionPoint(extensionValue2);
                    builder.setIssuingDistributionPointEnabled(true);
                    builder.setMaxBaseCRLNumber(positiveValue);
                    org.bouncycastle.jcajce.PKIXCRLStoreSelector<? extends java.security.cert.CRL> build = builder.build();
                    java.util.Set<java.security.cert.X509CRL> highResolutionOutputSizeshNQ4ISI2 = org.bouncycastle.jce.provider.PKIXCRLUtil.getHighResolutionOutputSizeshNQ4ISI(build, date, list, list2);
                    if (highResolutionOutputSizeshNQ4ISI2.isEmpty() && org.bouncycastle.util.Properties.isOverrideSet("org.bouncycastle.x509.enableCRLDP")) {
                        try {
                            java.security.cert.CertificateFactory createCertificateFactory = jcaJceHelper.createCertificateFactory("X.509");
                            org.bouncycastle.asn1.x509.DistributionPoint[] distributionPoints = org.bouncycastle.asn1.x509.CRLDistPoint.getInstance(extensionValue2).getDistributionPoints();
                            for (int i = 0; i < distributionPoints.length; i++) {
                                org.bouncycastle.asn1.x509.DistributionPointName distributionPoint = distributionPoints[i].getDistributionPoint();
                                if (distributionPoint != null && distributionPoint.getType() == 0) {
                                    org.bouncycastle.asn1.x509.GeneralName[] names = org.bouncycastle.asn1.x509.GeneralNames.getInstance(distributionPoint.getName()).getNames();
                                    int i2 = 0;
                                    while (true) {
                                        if (i2 < names.length) {
                                            org.bouncycastle.asn1.x509.GeneralName generalName = names[i];
                                            if (generalName.getTagNo() == 6) {
                                                try {
                                                    org.bouncycastle.jcajce.PKIXCRLStore highSpeedVideoFpsRanges = org.bouncycastle.jce.provider.CrlCache.getHighSpeedVideoFpsRanges(createCertificateFactory, date, new java.net.URI(((org.bouncycastle.asn1.ASN1String) generalName.getName()).getString()));
                                                    if (highSpeedVideoFpsRanges != null) {
                                                        highResolutionOutputSizeshNQ4ISI2 = org.bouncycastle.jce.provider.PKIXCRLUtil.getHighResolutionOutputSizeshNQ4ISI(build, date, java.util.Collections.EMPTY_LIST, java.util.Collections.singletonList(highSpeedVideoFpsRanges));
                                                    }
                                                } catch (java.lang.Exception unused) {
                                                    continue;
                                                }
                                            }
                                            i2++;
                                        }
                                    }
                                }
                            }
                        } catch (java.lang.Exception e) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot create certificate factory: ");
                            sb.append(e.getMessage());
                            throw new org.bouncycastle.jce.provider.AnnotatedException(sb.toString(), e);
                        }
                    }
                    java.util.HashSet hashSet = new java.util.HashSet();
                    for (java.security.cert.X509CRL x509crl2 : highResolutionOutputSizeshNQ4ISI2) {
                        java.util.Set<java.lang.String> criticalExtensionOIDs = x509crl2.getCriticalExtensionOIDs();
                        if (criticalExtensionOIDs != null && criticalExtensionOIDs.contains(org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getHighSpeedVideoSizesFor)) {
                            hashSet.add(x509crl2);
                        }
                    }
                    return hashSet;
                } catch (java.lang.Exception e2) {
                    throw new org.bouncycastle.jce.provider.AnnotatedException("Issuing distribution point extension value could not be read.", e2);
                }
            } catch (java.lang.Exception e3) {
                throw new org.bouncycastle.jce.provider.AnnotatedException("CRL number extension could not be extracted from CRL.", e3);
            }
        } catch (java.io.IOException e4) {
            throw new org.bouncycastle.jce.provider.AnnotatedException("Cannot extract issuer from CRL.", e4);
        }
    }

    protected static void Camera2StreamConfigurationMap(java.security.cert.X509Certificate x509Certificate, java.security.PublicKey publicKey, java.lang.String str) throws java.security.GeneralSecurityException {
        if (str == null) {
            x509Certificate.verify(publicKey);
        } else {
            x509Certificate.verify(publicKey, str);
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.util.List[] listArr, org.bouncycastle.jce.provider.PKIXPolicyNode pKIXPolicyNode) {
        listArr[pKIXPolicyNode.getDepth()].remove(pKIXPolicyNode);
        if (pKIXPolicyNode.hasChildren()) {
            java.util.Iterator children = pKIXPolicyNode.getChildren();
            while (children.hasNext()) {
                getHighResolutionOutputSizeshNQ4ISI(listArr, (org.bouncycastle.jce.provider.PKIXPolicyNode) children.next());
            }
        }
    }

    protected static org.bouncycastle.jce.provider.PKIXPolicyNode getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.jce.provider.PKIXPolicyNode pKIXPolicyNode, java.util.List[] listArr, org.bouncycastle.jce.provider.PKIXPolicyNode pKIXPolicyNode2) {
        org.bouncycastle.jce.provider.PKIXPolicyNode pKIXPolicyNode3 = (org.bouncycastle.jce.provider.PKIXPolicyNode) pKIXPolicyNode2.getParent();
        if (pKIXPolicyNode == null) {
            return null;
        }
        if (pKIXPolicyNode3 != null) {
            pKIXPolicyNode3.removeChild(pKIXPolicyNode2);
            getHighResolutionOutputSizeshNQ4ISI(listArr, pKIXPolicyNode2);
            return pKIXPolicyNode;
        }
        for (int i = 0; i < listArr.length; i++) {
            listArr[i] = new java.util.ArrayList();
        }
        return null;
    }

    protected static void Camera2StreamConfigurationMap(int i, java.util.List[] listArr, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.util.Set set) {
        java.util.List list = listArr[i - 1];
        for (int i2 = 0; i2 < list.size(); i2++) {
            org.bouncycastle.jce.provider.PKIXPolicyNode pKIXPolicyNode = (org.bouncycastle.jce.provider.PKIXPolicyNode) list.get(i2);
            if ("2.5.29.32.0".equals(pKIXPolicyNode.getValidPolicy())) {
                java.util.HashSet hashSet = new java.util.HashSet();
                hashSet.add(aSN1ObjectIdentifier.getId());
                org.bouncycastle.jce.provider.PKIXPolicyNode pKIXPolicyNode2 = new org.bouncycastle.jce.provider.PKIXPolicyNode(new java.util.ArrayList(), i, hashSet, pKIXPolicyNode, set, aSN1ObjectIdentifier.getId(), false);
                pKIXPolicyNode.addChild(pKIXPolicyNode2);
                listArr[i].add(pKIXPolicyNode2);
                return;
            }
        }
    }

    protected static boolean getHighSpeedVideoSizes(int i, java.util.List[] listArr, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.util.Set set) {
        java.util.List list = listArr[i - 1];
        for (int i2 = 0; i2 < list.size(); i2++) {
            org.bouncycastle.jce.provider.PKIXPolicyNode pKIXPolicyNode = (org.bouncycastle.jce.provider.PKIXPolicyNode) list.get(i2);
            if (pKIXPolicyNode.getExpectedPolicies().contains(aSN1ObjectIdentifier.getId())) {
                java.util.HashSet hashSet = new java.util.HashSet();
                hashSet.add(aSN1ObjectIdentifier.getId());
                org.bouncycastle.jce.provider.PKIXPolicyNode pKIXPolicyNode2 = new org.bouncycastle.jce.provider.PKIXPolicyNode(new java.util.ArrayList(), i, hashSet, pKIXPolicyNode, set, aSN1ObjectIdentifier.getId(), false);
                pKIXPolicyNode.addChild(pKIXPolicyNode2);
                listArr[i].add(pKIXPolicyNode2);
                return true;
            }
        }
        return false;
    }

    protected static boolean getHighResolutionOutputSizeshNQ4ISI(java.security.cert.X509Certificate x509Certificate) {
        return x509Certificate.getSubjectDN().equals(x509Certificate.getIssuerDN());
    }

    static boolean getHighSpeedVideoSizes(java.security.cert.X509Certificate x509Certificate, java.util.Set set, java.lang.String str) throws org.bouncycastle.jce.provider.AnnotatedException {
        try {
            return getHighSpeedVideoFpsRanges(x509Certificate, set, str) != null;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    protected static boolean getHighSpeedVideoFpsRanges(java.util.Set set) {
        return set == null || set.contains("2.5.29.32.0") || set.isEmpty();
    }

    protected static java.util.Date getHighSpeedVideoFpsRangesFor(org.bouncycastle.jcajce.PKIXExtendedParameters pKIXExtendedParameters, java.util.Date date) {
        java.util.Date validityDate = pKIXExtendedParameters.getValidityDate();
        return validityDate == null ? date : validityDate;
    }

    protected static java.util.Date getHighSpeedVideoFpsRanges(java.util.Date date, int i, java.security.cert.CertPath certPath, int i2) throws org.bouncycastle.jce.provider.AnnotatedException {
        if (1 != i || i2 <= 0) {
            return date;
        }
        int i3 = i2 - 1;
        java.security.cert.X509Certificate x509Certificate = (java.security.cert.X509Certificate) certPath.getCertificates().get(i3);
        if (i3 == 0) {
            try {
                byte[] extensionValue = ((java.security.cert.X509Certificate) certPath.getCertificates().get(i3)).getExtensionValue(org.bouncycastle.internal.asn1.isismtt.ISISMTTObjectIdentifiers.id_isismtt_at_dateOfCertGen.getId());
                org.bouncycastle.asn1.ASN1GeneralizedTime aSN1GeneralizedTime = extensionValue != null ? org.bouncycastle.asn1.ASN1GeneralizedTime.getInstance(org.bouncycastle.asn1.ASN1Primitive.fromByteArray(extensionValue)) : null;
                if (aSN1GeneralizedTime != null) {
                    try {
                        return aSN1GeneralizedTime.getDate();
                    } catch (java.text.ParseException e) {
                        throw new org.bouncycastle.jce.provider.AnnotatedException("Date from date of cert gen extension could not be parsed.", e);
                    }
                }
            } catch (java.io.IOException unused) {
                throw new org.bouncycastle.jce.provider.AnnotatedException("Date of cert gen extension could not be read.");
            } catch (java.lang.IllegalArgumentException unused2) {
                throw new org.bouncycastle.jce.provider.AnnotatedException("Date of cert gen extension could not be read.");
            }
        }
        return x509Certificate.getNotBefore();
    }

    protected static final java.util.Set getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) throws java.security.cert.CertPathValidatorException {
        java.util.HashSet hashSet = new java.util.HashSet();
        if (aSN1Sequence != null) {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            org.bouncycastle.asn1.ASN1OutputStream create = org.bouncycastle.asn1.ASN1OutputStream.create(byteArrayOutputStream);
            java.util.Enumeration objects = aSN1Sequence.getObjects();
            while (objects.hasMoreElements()) {
                try {
                    create.writeObject((org.bouncycastle.asn1.ASN1Encodable) objects.nextElement());
                    hashSet.add(new java.security.cert.PolicyQualifierInfo(byteArrayOutputStream.toByteArray()));
                    byteArrayOutputStream.reset();
                } catch (java.io.IOException e) {
                    throw new org.bouncycastle.jce.exception.ExtCertPathValidatorException("Policy qualifier info cannot be decoded.", e);
                }
            }
        }
        return hashSet;
    }

    private static org.bouncycastle.asn1.ASN1Primitive getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, byte[] bArr) throws org.bouncycastle.jce.provider.AnnotatedException {
        try {
            return org.bouncycastle.asn1.ASN1Primitive.fromByteArray(org.bouncycastle.asn1.ASN1OctetString.getInstance(bArr).getOctets());
        } catch (java.lang.Exception e) {
            throw new org.bouncycastle.jce.provider.AnnotatedException("exception processing extension ".concat(java.lang.String.valueOf(str)), e);
        }
    }

    protected static java.security.PublicKey getHighResolutionOutputSizeshNQ4ISI(java.util.List list, int i, org.bouncycastle.jcajce.util.JcaJceHelper jcaJceHelper) throws java.security.cert.CertPathValidatorException {
        java.security.interfaces.DSAPublicKey dSAPublicKey;
        java.security.PublicKey publicKey = ((java.security.cert.Certificate) list.get(i)).getPublicKey();
        if (!(publicKey instanceof java.security.interfaces.DSAPublicKey)) {
            return publicKey;
        }
        java.security.interfaces.DSAPublicKey dSAPublicKey2 = (java.security.interfaces.DSAPublicKey) publicKey;
        if (dSAPublicKey2.getParams() != null) {
            return dSAPublicKey2;
        }
        do {
            i++;
            if (i >= list.size()) {
                throw new java.security.cert.CertPathValidatorException("DSA parameters cannot be inherited from previous certificate.");
            }
            java.security.PublicKey publicKey2 = ((java.security.cert.X509Certificate) list.get(i)).getPublicKey();
            if (!(publicKey2 instanceof java.security.interfaces.DSAPublicKey)) {
                throw new java.security.cert.CertPathValidatorException("DSA parameters cannot be inherited from previous certificate.");
            }
            dSAPublicKey = (java.security.interfaces.DSAPublicKey) publicKey2;
        } while (dSAPublicKey.getParams() == null);
        java.security.interfaces.DSAParams params = dSAPublicKey.getParams();
        try {
            return jcaJceHelper.createKeyFactory("DSA").generatePublic(new java.security.spec.DSAPublicKeySpec(dSAPublicKey2.getY(), params.getP(), params.getQ(), params.getG()));
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException(e.getMessage());
        }
    }

    protected static org.bouncycastle.asn1.ASN1Primitive getHighSpeedVideoSizes(java.security.cert.X509Extension x509Extension, java.lang.String str) throws org.bouncycastle.jce.provider.AnnotatedException {
        byte[] extensionValue = x509Extension.getExtensionValue(str);
        if (extensionValue == null) {
            return null;
        }
        return getHighResolutionOutputSizeshNQ4ISI(str, extensionValue);
    }

    protected static org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoSizes(java.security.PublicKey publicKey) throws java.security.cert.CertPathValidatorException {
        try {
            return org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(publicKey.getEncoded()).getAlgorithm();
        } catch (java.lang.Exception e) {
            throw new org.bouncycastle.jce.exception.ExtCertPathValidatorException("Subject public key cannot be decoded.", e);
        }
    }

    static java.util.List<org.bouncycastle.jcajce.PKIXCRLStore> getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.x509.CRLDistPoint cRLDistPoint, java.util.Map<org.bouncycastle.asn1.x509.GeneralName, org.bouncycastle.jcajce.PKIXCRLStore> map, java.util.Date date, org.bouncycastle.jcajce.util.JcaJceHelper jcaJceHelper) throws org.bouncycastle.jce.provider.AnnotatedException {
        if (cRLDistPoint == null) {
            return java.util.Collections.EMPTY_LIST;
        }
        try {
            org.bouncycastle.asn1.x509.DistributionPoint[] distributionPoints = cRLDistPoint.getDistributionPoints();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (org.bouncycastle.asn1.x509.DistributionPoint distributionPoint : distributionPoints) {
                org.bouncycastle.asn1.x509.DistributionPointName distributionPoint2 = distributionPoint.getDistributionPoint();
                if (distributionPoint2 != null && distributionPoint2.getType() == 0) {
                    for (org.bouncycastle.asn1.x509.GeneralName generalName : org.bouncycastle.asn1.x509.GeneralNames.getInstance(distributionPoint2.getName()).getNames()) {
                        org.bouncycastle.jcajce.PKIXCRLStore pKIXCRLStore = map.get(generalName);
                        if (pKIXCRLStore != null) {
                            arrayList.add(pKIXCRLStore);
                        }
                    }
                }
            }
            if (arrayList.isEmpty() && org.bouncycastle.util.Properties.isOverrideSet("org.bouncycastle.x509.enableCRLDP")) {
                try {
                    java.security.cert.CertificateFactory createCertificateFactory = jcaJceHelper.createCertificateFactory("X.509");
                    for (int i = 0; i < distributionPoints.length; i++) {
                        org.bouncycastle.asn1.x509.DistributionPointName distributionPoint3 = distributionPoints[i].getDistributionPoint();
                        if (distributionPoint3 != null && distributionPoint3.getType() == 0) {
                            org.bouncycastle.asn1.x509.GeneralName[] names = org.bouncycastle.asn1.x509.GeneralNames.getInstance(distributionPoint3.getName()).getNames();
                            int i2 = 0;
                            while (true) {
                                if (i2 < names.length) {
                                    org.bouncycastle.asn1.x509.GeneralName generalName2 = names[i];
                                    if (generalName2.getTagNo() == 6) {
                                        try {
                                            org.bouncycastle.jcajce.PKIXCRLStore highSpeedVideoFpsRanges = org.bouncycastle.jce.provider.CrlCache.getHighSpeedVideoFpsRanges(createCertificateFactory, date, new java.net.URI(((org.bouncycastle.asn1.ASN1String) generalName2.getName()).getString()));
                                            if (highSpeedVideoFpsRanges != null) {
                                                arrayList.add(highSpeedVideoFpsRanges);
                                            }
                                        } catch (java.lang.Exception unused) {
                                            continue;
                                        }
                                    }
                                    i2++;
                                }
                            }
                        }
                    }
                } catch (java.lang.Exception e) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot create certificate factory: ");
                    sb.append(e.getMessage());
                    throw new org.bouncycastle.jce.provider.AnnotatedException(sb.toString(), e);
                }
            }
            return arrayList;
        } catch (java.lang.Exception e2) {
            throw new org.bouncycastle.jce.provider.AnnotatedException("Distribution points could not be read.", e2);
        }
    }

    static java.util.List<org.bouncycastle.jcajce.PKIXCertStore> getHighSpeedVideoFpsRanges(byte[] bArr, java.util.Map<org.bouncycastle.asn1.x509.GeneralName, org.bouncycastle.jcajce.PKIXCertStore> map) throws java.security.cert.CertificateParsingException {
        if (bArr == null) {
            return java.util.Collections.EMPTY_LIST;
        }
        org.bouncycastle.asn1.x509.GeneralName[] names = org.bouncycastle.asn1.x509.GeneralNames.getInstance(org.bouncycastle.asn1.ASN1OctetString.getInstance(bArr).getOctets()).getNames();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i != names.length; i++) {
            org.bouncycastle.jcajce.PKIXCertStore pKIXCertStore = map.get(names[i]);
            if (pKIXCertStore != null) {
                arrayList.add(pKIXCertStore);
            }
        }
        return arrayList;
    }

    static java.util.Collection getHighSpeedVideoFpsRangesFor(org.bouncycastle.jcajce.PKIXExtendedBuilderParameters pKIXExtendedBuilderParameters) throws java.security.cert.CertPathBuilderException {
        org.bouncycastle.jcajce.PKIXExtendedParameters baseParameters = pKIXExtendedBuilderParameters.getBaseParameters();
        org.bouncycastle.jcajce.PKIXCertStoreSelector targetConstraints = baseParameters.getTargetConstraints();
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        try {
            getHighSpeedVideoFpsRangesFor(linkedHashSet, targetConstraints, baseParameters.getCertificateStores());
            getHighSpeedVideoFpsRangesFor(linkedHashSet, targetConstraints, baseParameters.getCertStores());
            if (!linkedHashSet.isEmpty()) {
                return linkedHashSet;
            }
            java.security.cert.Certificate certificate = targetConstraints.getCertificate();
            if (certificate != null) {
                return java.util.Collections.singleton(certificate);
            }
            throw new java.security.cert.CertPathBuilderException("No certificate found matching targetConstraints.");
        } catch (org.bouncycastle.jce.provider.AnnotatedException e) {
            throw new org.bouncycastle.jce.exception.ExtCertPathBuilderException("Error finding target certificate.", e);
        }
    }

    static java.util.Collection getHighSpeedVideoFpsRangesFor(java.security.cert.X509Certificate x509Certificate, java.util.List<java.security.cert.CertStore> list, java.util.List<org.bouncycastle.jcajce.PKIXCertStore> list2) throws org.bouncycastle.jce.provider.AnnotatedException {
        byte[] keyIdentifier;
        java.security.cert.X509CertSelector x509CertSelector = new java.security.cert.X509CertSelector();
        try {
            x509CertSelector.setSubject(org.bouncycastle.jce.provider.PrincipalUtils.getHighResolutionOutputSizeshNQ4ISI(x509Certificate).getEncoded());
            try {
                byte[] extensionValue = x509Certificate.getExtensionValue(getHighSpeedVideoSizes);
                if (extensionValue != null && (keyIdentifier = org.bouncycastle.asn1.x509.AuthorityKeyIdentifier.getInstance(org.bouncycastle.asn1.ASN1OctetString.getInstance(extensionValue).getOctets()).getKeyIdentifier()) != null) {
                    x509CertSelector.setSubjectKeyIdentifier(new org.bouncycastle.asn1.DEROctetString(keyIdentifier).getEncoded());
                }
            } catch (java.lang.Exception unused) {
            }
            org.bouncycastle.jcajce.PKIXCertStoreSelector<? extends java.security.cert.Certificate> build = new org.bouncycastle.jcajce.PKIXCertStoreSelector.Builder(x509CertSelector).build();
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            try {
                getHighSpeedVideoFpsRangesFor(linkedHashSet, build, list);
                getHighSpeedVideoFpsRangesFor(linkedHashSet, build, list2);
                return linkedHashSet;
            } catch (org.bouncycastle.jce.provider.AnnotatedException e) {
                throw new org.bouncycastle.jce.provider.AnnotatedException("Issuer certificate cannot be searched.", e);
            }
        } catch (java.lang.Exception e2) {
            throw new org.bouncycastle.jce.provider.AnnotatedException("Subject criteria for certificate selector to find issuer certificate could not be set.", e2);
        }
    }

    protected static void getHighSpeedVideoFpsRangesFor(java.util.LinkedHashSet linkedHashSet, org.bouncycastle.jcajce.PKIXCertStoreSelector pKIXCertStoreSelector, java.util.List list) throws org.bouncycastle.jce.provider.AnnotatedException {
        for (java.lang.Object obj : list) {
            if (obj instanceof org.bouncycastle.util.Store) {
                try {
                    linkedHashSet.addAll(((org.bouncycastle.util.Store) obj).getMatches(pKIXCertStoreSelector));
                } catch (org.bouncycastle.util.StoreException e) {
                    throw new org.bouncycastle.jce.provider.AnnotatedException("Problem while picking certificates from X.509 store.", e);
                }
            } else {
                try {
                    linkedHashSet.addAll(org.bouncycastle.jcajce.PKIXCertStoreSelector.getCertificates(pKIXCertStoreSelector, (java.security.cert.CertStore) obj));
                } catch (java.security.cert.CertStoreException e2) {
                    throw new org.bouncycastle.jce.provider.AnnotatedException("Problem while picking certificates from certificate store.", e2);
                }
            }
        }
    }

    CertPathValidatorUtilities() {
    }
}
