package org.bouncycastle.pkix.jcajce;

/* loaded from: classes17.dex */
class RevocationUtilities {
    protected static final java.lang.String getHighSpeedVideoSizes = org.bouncycastle.asn1.x509.Extension.issuingDistributionPoint.getId();

    protected static void Camera2StreamConfigurationMap(java.util.Date date, java.security.cert.X509CRL x509crl, java.lang.Object obj, org.bouncycastle.pkix.jcajce.CertStatus certStatus) throws org.bouncycastle.pkix.jcajce.AnnotatedException {
        java.security.cert.X509CRLEntry revokedCertificate;
        try {
            boolean highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(x509crl);
            java.security.cert.X509Certificate x509Certificate = (java.security.cert.X509Certificate) obj;
            org.bouncycastle.asn1.x500.X500Name x500Name = org.bouncycastle.asn1.x500.X500Name.getInstance(x509Certificate.getIssuerX500Principal().getEncoded());
            if ((highResolutionOutputSizeshNQ4ISI || x500Name.equals(org.bouncycastle.asn1.x500.X500Name.getInstance(x509crl.getIssuerX500Principal().getEncoded()))) && (revokedCertificate = x509crl.getRevokedCertificate(x509Certificate.getSerialNumber())) != null) {
                if (highResolutionOutputSizeshNQ4ISI) {
                    javax.security.auth.x500.X500Principal certificateIssuer = revokedCertificate.getCertificateIssuer();
                    if (!x500Name.equals(certificateIssuer == null ? org.bouncycastle.asn1.x500.X500Name.getInstance(x509crl.getIssuerX500Principal().getEncoded()) : org.bouncycastle.asn1.x500.X500Name.getInstance(certificateIssuer.getEncoded()))) {
                        return;
                    }
                }
                int i = 0;
                if (revokedCertificate.hasExtensions()) {
                    try {
                        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = org.bouncycastle.asn1.x509.Extension.reasonCode;
                        byte[] extensionValue = revokedCertificate.getExtensionValue(aSN1ObjectIdentifier.getId());
                        org.bouncycastle.asn1.ASN1Enumerated aSN1Enumerated = org.bouncycastle.asn1.ASN1Enumerated.getInstance(extensionValue == null ? null : getHighSpeedVideoSizes(aSN1ObjectIdentifier, extensionValue));
                        if (aSN1Enumerated != null) {
                            i = aSN1Enumerated.intValueExact();
                        }
                    } catch (java.lang.Exception e) {
                        throw new org.bouncycastle.pkix.jcajce.AnnotatedException("Reason code CRL entry extension could not be decoded.", e);
                    }
                }
                java.util.Date revocationDate = revokedCertificate.getRevocationDate();
                if (!date.before(revocationDate) || i == 0 || i == 1 || i == 2 || i == 10) {
                    certStatus.getHighSpeedVideoFpsRangesFor = i;
                    certStatus.getHighSpeedVideoSizes = revocationDate;
                }
            }
        } catch (java.security.cert.CRLException e2) {
            throw new org.bouncycastle.pkix.jcajce.AnnotatedException("Failed check for indirect CRL.", e2);
        }
    }

    protected static java.util.Set getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.x509.DistributionPoint distributionPoint, java.lang.Object obj, java.util.Date date, java.util.List list, java.util.List list2) throws org.bouncycastle.pkix.jcajce.AnnotatedException, org.bouncycastle.pkix.jcajce.CRLNotFoundException {
        java.security.cert.X509CRLSelector x509CRLSelector = new java.security.cert.X509CRLSelector();
        try {
            java.util.HashSet hashSet = new java.util.HashSet();
            hashSet.add(org.bouncycastle.asn1.x500.X500Name.getInstance(((java.security.cert.X509Certificate) obj).getIssuerX500Principal().getEncoded()));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (distributionPoint.getCRLIssuer() != null) {
                org.bouncycastle.asn1.x509.GeneralName[] names = distributionPoint.getCRLIssuer().getNames();
                for (int i = 0; i < names.length; i++) {
                    if (names[i].getTagNo() == 4) {
                        try {
                            arrayList.add(org.bouncycastle.asn1.x500.X500Name.getInstance(names[i].getName()));
                        } catch (java.lang.IllegalArgumentException e) {
                            throw new org.bouncycastle.pkix.jcajce.AnnotatedException("CRL issuer information from distribution point cannot be decoded.", e);
                        }
                    }
                }
            } else {
                if (distributionPoint.getDistributionPoint() == null) {
                    throw new org.bouncycastle.pkix.jcajce.AnnotatedException("CRL issuer is omitted from distribution point but no distributionPoint field present.");
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
                    throw new org.bouncycastle.pkix.jcajce.AnnotatedException("Cannot decode CRL issuer information.", e2);
                }
            }
            if (obj instanceof java.security.cert.X509Certificate) {
                x509CRLSelector.setCertificateChecking((java.security.cert.X509Certificate) obj);
            }
            java.util.Set highSpeedVideoSizes = org.bouncycastle.pkix.jcajce.PKIXCRLUtil.getHighSpeedVideoSizes(new org.bouncycastle.jcajce.PKIXCRLStoreSelector.Builder(x509CRLSelector).setCompleteCRLEnabled(true).build(), date, list, list2);
            if (!highSpeedVideoSizes.isEmpty()) {
                return highSpeedVideoSizes;
            }
            org.bouncycastle.asn1.x500.X500Name x500Name = org.bouncycastle.asn1.x500.X500Name.getInstance(((java.security.cert.X509Certificate) obj).getIssuerX500Principal().getEncoded());
            java.lang.StringBuilder sb = new java.lang.StringBuilder("No CRLs found for issuer \"");
            sb.append(org.bouncycastle.asn1.x500.style.RFC4519Style.INSTANCE.toString(x500Name));
            sb.append("\"");
            throw new org.bouncycastle.pkix.jcajce.CRLNotFoundException(sb.toString());
        } catch (org.bouncycastle.pkix.jcajce.AnnotatedException e3) {
            throw new org.bouncycastle.pkix.jcajce.AnnotatedException("Could not get issuer information from distribution point.", e3);
        }
    }

    protected static java.util.Set getHighSpeedVideoFpsRanges(java.util.Date date, java.security.cert.X509CRL x509crl, java.util.List<java.security.cert.CertStore> list, java.util.List<org.bouncycastle.jcajce.PKIXCRLStore> list2) throws org.bouncycastle.pkix.jcajce.AnnotatedException {
        java.security.cert.X509CRLSelector x509CRLSelector = new java.security.cert.X509CRLSelector();
        try {
            x509CRLSelector.addIssuerName(x509crl.getIssuerX500Principal().getEncoded());
            try {
                org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = org.bouncycastle.asn1.x509.Extension.cRLNumber;
                byte[] extensionValue = x509crl.getExtensionValue(aSN1ObjectIdentifier.getId());
                org.bouncycastle.asn1.ASN1Primitive highSpeedVideoSizes = extensionValue == null ? null : getHighSpeedVideoSizes(aSN1ObjectIdentifier, extensionValue);
                java.math.BigInteger positiveValue = highSpeedVideoSizes != null ? org.bouncycastle.asn1.ASN1Integer.getInstance(highSpeedVideoSizes).getPositiveValue() : null;
                try {
                    byte[] extensionValue2 = x509crl.getExtensionValue(getHighSpeedVideoSizes);
                    x509CRLSelector.setMinCRLNumber(positiveValue != null ? positiveValue.add(java.math.BigInteger.valueOf(1L)) : null);
                    org.bouncycastle.jcajce.PKIXCRLStoreSelector.Builder builder = new org.bouncycastle.jcajce.PKIXCRLStoreSelector.Builder(x509CRLSelector);
                    builder.setIssuingDistributionPoint(extensionValue2);
                    builder.setIssuingDistributionPointEnabled(true);
                    builder.setMaxBaseCRLNumber(positiveValue);
                    java.util.Set<java.security.cert.X509CRL> highSpeedVideoSizes2 = org.bouncycastle.pkix.jcajce.PKIXCRLUtil.getHighSpeedVideoSizes(builder.build(), date, list, list2);
                    java.util.HashSet hashSet = new java.util.HashSet();
                    for (java.security.cert.X509CRL x509crl2 : highSpeedVideoSizes2) {
                        java.util.Set<java.lang.String> criticalExtensionOIDs = x509crl2.getCriticalExtensionOIDs();
                        if (criticalExtensionOIDs != null && criticalExtensionOIDs.contains(org.bouncycastle.pkix.jcajce.RFC3280CertPathUtilities.Camera2StreamConfigurationMap)) {
                            hashSet.add(x509crl2);
                        }
                    }
                    return hashSet;
                } catch (java.lang.Exception e) {
                    throw new org.bouncycastle.pkix.jcajce.AnnotatedException("issuing distribution point extension value could not be read", e);
                }
            } catch (java.lang.Exception e2) {
                throw new org.bouncycastle.pkix.jcajce.AnnotatedException("cannot extract CRL number extension from CRL", e2);
            }
        } catch (java.io.IOException e3) {
            throw new org.bouncycastle.pkix.jcajce.AnnotatedException("cannot extract issuer from CRL.", e3);
        }
    }

    private static boolean getHighResolutionOutputSizeshNQ4ISI(java.security.cert.X509CRL x509crl) throws java.security.cert.CRLException {
        try {
            byte[] extensionValue = x509crl.getExtensionValue(org.bouncycastle.asn1.x509.Extension.issuingDistributionPoint.getId());
            if (extensionValue != null) {
                return org.bouncycastle.asn1.x509.IssuingDistributionPoint.getInstance(org.bouncycastle.asn1.ASN1OctetString.getInstance(extensionValue).getOctets()).isIndirectCRL();
            }
            return false;
        } catch (java.lang.Exception e) {
            throw new java.security.cert.CRLException("exception reading IssuingDistributionPoint", e);
        }
    }

    protected static java.util.Date getHighSpeedVideoSizes(org.bouncycastle.jcajce.PKIXExtendedParameters pKIXExtendedParameters, java.util.Date date) {
        java.util.Date validityDate = pKIXExtendedParameters.getValidityDate();
        return validityDate == null ? date : validityDate;
    }

    private static org.bouncycastle.asn1.ASN1Primitive getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, byte[] bArr) throws org.bouncycastle.pkix.jcajce.AnnotatedException {
        try {
            return org.bouncycastle.asn1.ASN1Primitive.fromByteArray(org.bouncycastle.asn1.ASN1OctetString.getInstance(bArr).getOctets());
        } catch (java.lang.Exception e) {
            throw new org.bouncycastle.pkix.jcajce.AnnotatedException("exception processing extension ".concat(java.lang.String.valueOf(aSN1ObjectIdentifier)), e);
        }
    }

    protected static java.security.PublicKey getHighSpeedVideoFpsRangesFor(java.util.List list, int i, org.bouncycastle.jcajce.util.JcaJceHelper jcaJceHelper) throws java.security.cert.CertPathValidatorException {
        java.security.interfaces.DSAPublicKey dSAPublicKey;
        java.security.PublicKey publicKey = ((java.security.cert.Certificate) list.get(0)).getPublicKey();
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

    protected static org.bouncycastle.asn1.ASN1Primitive getHighSpeedVideoFpsRanges(java.security.cert.X509Extension x509Extension, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) throws org.bouncycastle.pkix.jcajce.AnnotatedException {
        byte[] extensionValue = x509Extension.getExtensionValue(aSN1ObjectIdentifier.getId());
        if (extensionValue == null) {
            return null;
        }
        return getHighSpeedVideoSizes(aSN1ObjectIdentifier, extensionValue);
    }

    protected static void Camera2StreamConfigurationMap(java.util.LinkedHashSet linkedHashSet, org.bouncycastle.jcajce.PKIXCertStoreSelector pKIXCertStoreSelector, java.util.List list) throws org.bouncycastle.pkix.jcajce.AnnotatedException {
        for (java.lang.Object obj : list) {
            if (obj instanceof org.bouncycastle.util.Store) {
                try {
                    linkedHashSet.addAll(((org.bouncycastle.util.Store) obj).getMatches(pKIXCertStoreSelector));
                } catch (org.bouncycastle.util.StoreException e) {
                    throw new org.bouncycastle.pkix.jcajce.AnnotatedException("Problem while picking certificates from X.509 store.", e);
                }
            } else {
                try {
                    linkedHashSet.addAll(org.bouncycastle.jcajce.PKIXCertStoreSelector.getCertificates(pKIXCertStoreSelector, (java.security.cert.CertStore) obj));
                } catch (java.security.cert.CertStoreException e2) {
                    throw new org.bouncycastle.pkix.jcajce.AnnotatedException("Problem while picking certificates from certificate store.", e2);
                }
            }
        }
    }

    RevocationUtilities() {
    }
}
