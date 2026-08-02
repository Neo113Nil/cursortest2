package org.bouncycastle.x509;

/* loaded from: classes17.dex */
class CertPathValidatorUtilities {
    protected static final java.lang.String ANY_POLICY = "2.5.29.32.0";
    protected static final int CRL_SIGN = 6;
    protected static final int KEY_CERT_SIGN = 5;
    protected static final java.lang.String CERTIFICATE_POLICIES = org.bouncycastle.asn1.x509.Extension.certificatePolicies.getId();
    protected static final java.lang.String BASIC_CONSTRAINTS = org.bouncycastle.asn1.x509.Extension.basicConstraints.getId();
    protected static final java.lang.String POLICY_MAPPINGS = org.bouncycastle.asn1.x509.Extension.policyMappings.getId();
    protected static final java.lang.String SUBJECT_ALTERNATIVE_NAME = org.bouncycastle.asn1.x509.Extension.subjectAlternativeName.getId();
    protected static final java.lang.String NAME_CONSTRAINTS = org.bouncycastle.asn1.x509.Extension.nameConstraints.getId();
    protected static final java.lang.String KEY_USAGE = org.bouncycastle.asn1.x509.Extension.keyUsage.getId();
    protected static final java.lang.String INHIBIT_ANY_POLICY = org.bouncycastle.asn1.x509.Extension.inhibitAnyPolicy.getId();
    protected static final java.lang.String ISSUING_DISTRIBUTION_POINT = org.bouncycastle.asn1.x509.Extension.issuingDistributionPoint.getId();
    protected static final java.lang.String DELTA_CRL_INDICATOR = org.bouncycastle.asn1.x509.Extension.deltaCRLIndicator.getId();
    protected static final java.lang.String POLICY_CONSTRAINTS = org.bouncycastle.asn1.x509.Extension.policyConstraints.getId();
    protected static final java.lang.String CRL_NUMBER = org.bouncycastle.asn1.x509.Extension.cRLNumber.getId();
    protected static final java.lang.String[] crlReasons = {"unspecified", "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", "aACompromise"};

    protected static void getCertStatus(java.util.Date date, java.security.cert.X509CRL x509crl, java.lang.Object obj, org.bouncycastle.x509.CertStatus certStatus) throws org.bouncycastle.jce.provider.AnnotatedException {
        java.security.cert.X509CRLEntry revokedCertificate;
        org.bouncycastle.asn1.ASN1Enumerated aSN1Enumerated;
        try {
            if (getHighSpeedVideoFpsRanges(x509crl)) {
                revokedCertificate = x509crl.getRevokedCertificate(obj instanceof java.security.cert.X509Certificate ? ((java.security.cert.X509Certificate) obj).getSerialNumber() : ((org.bouncycastle.x509.X509AttributeCertificate) obj).getSerialNumber());
                if (revokedCertificate == null) {
                    return;
                }
                javax.security.auth.x500.X500Principal certificateIssuer = revokedCertificate.getCertificateIssuer();
                if (certificateIssuer == null) {
                    certificateIssuer = getIssuerPrincipal(x509crl);
                }
                if (!getEncodedIssuerPrincipal(obj).equals(certificateIssuer)) {
                    return;
                }
            } else {
                if (!getEncodedIssuerPrincipal(obj).equals(getIssuerPrincipal(x509crl))) {
                    return;
                }
                revokedCertificate = x509crl.getRevokedCertificate(obj instanceof java.security.cert.X509Certificate ? ((java.security.cert.X509Certificate) obj).getSerialNumber() : ((org.bouncycastle.x509.X509AttributeCertificate) obj).getSerialNumber());
                if (revokedCertificate == null) {
                    return;
                }
            }
            if (revokedCertificate.hasExtensions()) {
                try {
                    aSN1Enumerated = org.bouncycastle.asn1.ASN1Enumerated.getInstance(getExtensionValue(revokedCertificate, org.bouncycastle.asn1.x509.X509Extension.reasonCode.getId()));
                } catch (java.lang.Exception e) {
                    throw new org.bouncycastle.jce.provider.AnnotatedException("Reason code CRL entry extension could not be decoded.", e);
                }
            } else {
                aSN1Enumerated = null;
            }
            int intValueExact = aSN1Enumerated == null ? 0 : aSN1Enumerated.intValueExact();
            if (date.getTime() >= revokedCertificate.getRevocationDate().getTime() || intValueExact == 0 || intValueExact == 1 || intValueExact == 2 || intValueExact == 10) {
                certStatus.Camera2StreamConfigurationMap = intValueExact;
                certStatus.getHighResolutionOutputSizeshNQ4ISI = revokedCertificate.getRevocationDate();
            }
        } catch (java.security.cert.CRLException e2) {
            throw new org.bouncycastle.jce.provider.AnnotatedException("Failed check for indirect CRL.", e2);
        }
    }

    protected static void verifyX509Certificate(java.security.cert.X509Certificate x509Certificate, java.security.PublicKey publicKey, java.lang.String str) throws java.security.GeneralSecurityException {
        if (str == null) {
            x509Certificate.verify(publicKey);
        } else {
            x509Certificate.verify(publicKey, str);
        }
    }

    private static void getHighSpeedVideoSizes(java.util.List[] listArr, org.bouncycastle.jce.provider.PKIXPolicyNode pKIXPolicyNode) {
        listArr[pKIXPolicyNode.getDepth()].remove(pKIXPolicyNode);
        if (pKIXPolicyNode.hasChildren()) {
            java.util.Iterator children = pKIXPolicyNode.getChildren();
            while (children.hasNext()) {
                getHighSpeedVideoSizes(listArr, (org.bouncycastle.jce.provider.PKIXPolicyNode) children.next());
            }
        }
    }

    protected static org.bouncycastle.jce.provider.PKIXPolicyNode removePolicyNode(org.bouncycastle.jce.provider.PKIXPolicyNode pKIXPolicyNode, java.util.List[] listArr, org.bouncycastle.jce.provider.PKIXPolicyNode pKIXPolicyNode2) {
        org.bouncycastle.jce.provider.PKIXPolicyNode pKIXPolicyNode3 = (org.bouncycastle.jce.provider.PKIXPolicyNode) pKIXPolicyNode2.getParent();
        if (pKIXPolicyNode == null) {
            return null;
        }
        if (pKIXPolicyNode3 != null) {
            pKIXPolicyNode3.removeChild(pKIXPolicyNode2);
            getHighSpeedVideoSizes(listArr, pKIXPolicyNode2);
            return pKIXPolicyNode;
        }
        for (int i = 0; i < listArr.length; i++) {
            listArr[i] = new java.util.ArrayList();
        }
        return null;
    }

    protected static void processCertD1ii(int i, java.util.List[] listArr, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.util.Set set) {
        java.util.List list = listArr[i - 1];
        for (int i2 = 0; i2 < list.size(); i2++) {
            org.bouncycastle.jce.provider.PKIXPolicyNode pKIXPolicyNode = (org.bouncycastle.jce.provider.PKIXPolicyNode) list.get(i2);
            if (ANY_POLICY.equals(pKIXPolicyNode.getValidPolicy())) {
                java.util.HashSet hashSet = new java.util.HashSet();
                hashSet.add(aSN1ObjectIdentifier.getId());
                org.bouncycastle.jce.provider.PKIXPolicyNode pKIXPolicyNode2 = new org.bouncycastle.jce.provider.PKIXPolicyNode(new java.util.ArrayList(), i, hashSet, pKIXPolicyNode, set, aSN1ObjectIdentifier.getId(), false);
                pKIXPolicyNode.addChild(pKIXPolicyNode2);
                listArr[i].add(pKIXPolicyNode2);
                return;
            }
        }
    }

    protected static boolean processCertD1i(int i, java.util.List[] listArr, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.util.Set set) {
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

    protected static org.bouncycastle.jce.provider.PKIXPolicyNode prepareNextCertB2(int i, java.util.List[] listArr, java.lang.String str, org.bouncycastle.jce.provider.PKIXPolicyNode pKIXPolicyNode) {
        int i2;
        java.util.Iterator it = listArr[i].iterator();
        while (it.hasNext()) {
            org.bouncycastle.jce.provider.PKIXPolicyNode pKIXPolicyNode2 = (org.bouncycastle.jce.provider.PKIXPolicyNode) it.next();
            if (pKIXPolicyNode2.getValidPolicy().equals(str)) {
                ((org.bouncycastle.jce.provider.PKIXPolicyNode) pKIXPolicyNode2.getParent()).removeChild(pKIXPolicyNode2);
                it.remove();
                for (int i3 = i - 1; i3 >= 0; i3--) {
                    java.util.List list = listArr[i3];
                    while (i2 < list.size()) {
                        org.bouncycastle.jce.provider.PKIXPolicyNode pKIXPolicyNode3 = (org.bouncycastle.jce.provider.PKIXPolicyNode) list.get(i2);
                        i2 = (pKIXPolicyNode3.hasChildren() || (pKIXPolicyNode = removePolicyNode(pKIXPolicyNode, listArr, pKIXPolicyNode3)) != null) ? i2 + 1 : 0;
                    }
                }
            }
        }
        return pKIXPolicyNode;
    }

    protected static void prepareNextCertB1(int i, java.util.List[] listArr, java.lang.String str, java.util.Map map, java.security.cert.X509Certificate x509Certificate) throws org.bouncycastle.jce.provider.AnnotatedException, java.security.cert.CertPathValidatorException {
        java.util.Set set;
        for (org.bouncycastle.jce.provider.PKIXPolicyNode pKIXPolicyNode : listArr[i]) {
            if (pKIXPolicyNode.getValidPolicy().equals(str)) {
                pKIXPolicyNode.setExpectedPolicies((java.util.Set) map.get(str));
                return;
            }
        }
        for (org.bouncycastle.jce.provider.PKIXPolicyNode pKIXPolicyNode2 : listArr[i]) {
            if (ANY_POLICY.equals(pKIXPolicyNode2.getValidPolicy())) {
                try {
                    java.util.Enumeration objects = org.bouncycastle.asn1.DERSequence.getInstance(getExtensionValue(x509Certificate, CERTIFICATE_POLICIES)).getObjects();
                    while (true) {
                        if (!objects.hasMoreElements()) {
                            set = null;
                            break;
                        }
                        try {
                            org.bouncycastle.asn1.x509.PolicyInformation policyInformation = org.bouncycastle.asn1.x509.PolicyInformation.getInstance(objects.nextElement());
                            if (ANY_POLICY.equals(policyInformation.getPolicyIdentifier().getId())) {
                                try {
                                    set = getQualifierSet(policyInformation.getPolicyQualifiers());
                                    break;
                                } catch (java.security.cert.CertPathValidatorException e) {
                                    throw new org.bouncycastle.jce.exception.ExtCertPathValidatorException("Policy qualifier info set could not be built.", e);
                                }
                            }
                        } catch (java.lang.Exception e2) {
                            throw new org.bouncycastle.jce.provider.AnnotatedException("Policy information cannot be decoded.", e2);
                        }
                    }
                    java.util.Set set2 = set;
                    boolean contains = x509Certificate.getCriticalExtensionOIDs() != null ? x509Certificate.getCriticalExtensionOIDs().contains(CERTIFICATE_POLICIES) : false;
                    org.bouncycastle.jce.provider.PKIXPolicyNode pKIXPolicyNode3 = (org.bouncycastle.jce.provider.PKIXPolicyNode) pKIXPolicyNode2.getParent();
                    if (ANY_POLICY.equals(pKIXPolicyNode3.getValidPolicy())) {
                        org.bouncycastle.jce.provider.PKIXPolicyNode pKIXPolicyNode4 = new org.bouncycastle.jce.provider.PKIXPolicyNode(new java.util.ArrayList(), i, (java.util.Set) map.get(str), pKIXPolicyNode3, set2, str, contains);
                        pKIXPolicyNode3.addChild(pKIXPolicyNode4);
                        listArr[i].add(pKIXPolicyNode4);
                        return;
                    }
                    return;
                } catch (java.lang.Exception e3) {
                    throw new org.bouncycastle.jce.provider.AnnotatedException("Certificate policies cannot be decoded.", e3);
                }
            }
        }
    }

    protected static boolean isSelfIssued(java.security.cert.X509Certificate x509Certificate) {
        return x509Certificate.getSubjectDN().equals(x509Certificate.getIssuerDN());
    }

    private static boolean getHighSpeedVideoFpsRanges(java.security.cert.X509CRL x509crl) throws java.security.cert.CRLException {
        try {
            byte[] extensionValue = x509crl.getExtensionValue(org.bouncycastle.asn1.x509.Extension.issuingDistributionPoint.getId());
            if (extensionValue != null) {
                return org.bouncycastle.asn1.x509.IssuingDistributionPoint.getInstance(org.bouncycastle.asn1.ASN1OctetString.getInstance(extensionValue).getOctets()).isIndirectCRL();
            }
            return false;
        } catch (java.lang.Exception e) {
            throw new java.security.cert.CRLException("Exception reading IssuingDistributionPoint: ".concat(java.lang.String.valueOf(e)));
        }
    }

    protected static boolean isAnyPolicy(java.util.Set set) {
        return set == null || set.contains(ANY_POLICY) || set.isEmpty();
    }

    protected static java.util.Date getValidityDate(java.security.cert.PKIXParameters pKIXParameters, java.util.Date date) {
        java.util.Date date2 = pKIXParameters.getDate();
        return date2 == null ? date : date2;
    }

    protected static javax.security.auth.x500.X500Principal getSubjectPrincipal(java.security.cert.X509Certificate x509Certificate) {
        return x509Certificate.getSubjectX500Principal();
    }

    protected static final java.util.Set getQualifierSet(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) throws java.security.cert.CertPathValidatorException {
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
            return new org.bouncycastle.asn1.ASN1InputStream(((org.bouncycastle.asn1.ASN1OctetString) new org.bouncycastle.asn1.ASN1InputStream(bArr).readObject()).getOctets()).readObject();
        } catch (java.lang.Exception e) {
            throw new org.bouncycastle.jce.provider.AnnotatedException("exception processing extension ".concat(java.lang.String.valueOf(str)), e);
        }
    }

    protected static java.security.PublicKey getNextWorkingKey(java.util.List list, int i) throws java.security.cert.CertPathValidatorException {
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
            return java.security.KeyFactory.getInstance("DSA", org.bouncycastle.jce.provider.BouncyCastleProvider.PROVIDER_NAME).generatePublic(new java.security.spec.DSAPublicKeySpec(dSAPublicKey2.getY(), params.getP(), params.getQ(), params.getG()));
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException(e.getMessage());
        }
    }

    protected static javax.security.auth.x500.X500Principal getIssuerPrincipal(java.security.cert.X509CRL x509crl) {
        return x509crl.getIssuerX500Principal();
    }

    protected static org.bouncycastle.asn1.ASN1Primitive getExtensionValue(java.security.cert.X509Extension x509Extension, java.lang.String str) throws org.bouncycastle.jce.provider.AnnotatedException {
        byte[] extensionValue = x509Extension.getExtensionValue(str);
        if (extensionValue == null) {
            return null;
        }
        return getHighResolutionOutputSizeshNQ4ISI(str, extensionValue);
    }

    protected static javax.security.auth.x500.X500Principal getEncodedIssuerPrincipal(java.lang.Object obj) {
        return obj instanceof java.security.cert.X509Certificate ? ((java.security.cert.X509Certificate) obj).getIssuerX500Principal() : (javax.security.auth.x500.X500Principal) ((org.bouncycastle.x509.X509AttributeCertificate) obj).getIssuer().getPrincipals()[0];
    }

    protected static org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier(java.security.PublicKey publicKey) throws java.security.cert.CertPathValidatorException {
        try {
            return org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(new org.bouncycastle.asn1.ASN1InputStream(publicKey.getEncoded()).readObject()).getAlgorithmId();
        } catch (java.lang.Exception e) {
            throw new org.bouncycastle.jce.exception.ExtCertPathValidatorException("Subject public key cannot be decoded.", e);
        }
    }

    protected static java.util.Collection findCertificates(org.bouncycastle.x509.X509CertStoreSelector x509CertStoreSelector, java.util.List list) throws org.bouncycastle.jce.provider.AnnotatedException {
        java.util.HashSet hashSet = new java.util.HashSet();
        org.bouncycastle.jcajce.provider.asymmetric.x509.CertificateFactory certificateFactory = new org.bouncycastle.jcajce.provider.asymmetric.x509.CertificateFactory();
        for (java.lang.Object obj : list) {
            if (obj instanceof org.bouncycastle.util.Store) {
                try {
                    for (java.lang.Object obj2 : ((org.bouncycastle.util.Store) obj).getMatches(x509CertStoreSelector)) {
                        if (obj2 instanceof org.bouncycastle.util.Encodable) {
                            obj2 = certificateFactory.engineGenerateCertificate(new java.io.ByteArrayInputStream(((org.bouncycastle.util.Encodable) obj2).getEncoded()));
                        } else if (!(obj2 instanceof java.security.cert.Certificate)) {
                            throw new org.bouncycastle.jce.provider.AnnotatedException("Unknown object found in certificate store.");
                        }
                        hashSet.add(obj2);
                    }
                } catch (java.io.IOException e) {
                    throw new org.bouncycastle.jce.provider.AnnotatedException("Problem while extracting certificates from X.509 store.", e);
                } catch (java.security.cert.CertificateException e2) {
                    throw new org.bouncycastle.jce.provider.AnnotatedException("Problem while extracting certificates from X.509 store.", e2);
                } catch (org.bouncycastle.util.StoreException e3) {
                    throw new org.bouncycastle.jce.provider.AnnotatedException("Problem while picking certificates from X.509 store.", e3);
                }
            } else {
                try {
                    hashSet.addAll(((java.security.cert.CertStore) obj).getCertificates(x509CertStoreSelector));
                } catch (java.security.cert.CertStoreException e4) {
                    throw new org.bouncycastle.jce.provider.AnnotatedException("Problem while picking certificates from certificate store.", e4);
                }
            }
        }
        return hashSet;
    }

    protected static java.util.Collection findCertificates(org.bouncycastle.x509.X509AttributeCertStoreSelector x509AttributeCertStoreSelector, java.util.List list) throws org.bouncycastle.jce.provider.AnnotatedException {
        java.util.HashSet hashSet = new java.util.HashSet();
        for (java.lang.Object obj : list) {
            if (obj instanceof org.bouncycastle.x509.X509Store) {
                try {
                    hashSet.addAll(((org.bouncycastle.x509.X509Store) obj).getMatches(x509AttributeCertStoreSelector));
                } catch (org.bouncycastle.util.StoreException e) {
                    throw new org.bouncycastle.jce.provider.AnnotatedException("Problem while picking certificates from X.509 store.", e);
                }
            }
        }
        return hashSet;
    }

    protected static java.util.Collection findCertificates(org.bouncycastle.jcajce.PKIXCertStoreSelector pKIXCertStoreSelector, java.util.List list) throws org.bouncycastle.jce.provider.AnnotatedException {
        java.util.HashSet hashSet = new java.util.HashSet();
        for (java.lang.Object obj : list) {
            if (obj instanceof org.bouncycastle.util.Store) {
                try {
                    hashSet.addAll(((org.bouncycastle.util.Store) obj).getMatches(pKIXCertStoreSelector));
                } catch (org.bouncycastle.util.StoreException e) {
                    throw new org.bouncycastle.jce.provider.AnnotatedException("Problem while picking certificates from X.509 store.", e);
                }
            } else {
                try {
                    hashSet.addAll(org.bouncycastle.jcajce.PKIXCertStoreSelector.getCertificates(pKIXCertStoreSelector, (java.security.cert.CertStore) obj));
                } catch (java.security.cert.CertStoreException e2) {
                    throw new org.bouncycastle.jce.provider.AnnotatedException("Problem while picking certificates from certificate store.", e2);
                }
            }
        }
        return hashSet;
    }

    CertPathValidatorUtilities() {
    }
}
