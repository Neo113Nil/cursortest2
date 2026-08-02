package org.bouncycastle.x509;

/* loaded from: classes17.dex */
public class AttributeCertificateHolder implements java.security.cert.CertSelector, org.bouncycastle.util.Selector {
    final org.bouncycastle.asn1.x509.Holder getHighSpeedVideoFpsRanges;

    public AttributeCertificateHolder(java.security.cert.X509Certificate x509Certificate) throws java.security.cert.CertificateParsingException {
        try {
            this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.x509.Holder(new org.bouncycastle.asn1.x509.IssuerSerial(org.bouncycastle.asn1.x509.GeneralNames.getInstance(new org.bouncycastle.asn1.DERSequence(new org.bouncycastle.asn1.x509.GeneralName(org.bouncycastle.jce.PrincipalUtil.getIssuerX509Principal(x509Certificate)))), new org.bouncycastle.asn1.ASN1Integer(x509Certificate.getSerialNumber())));
        } catch (java.lang.Exception e) {
            throw new java.security.cert.CertificateParsingException(e.getMessage());
        }
    }

    public AttributeCertificateHolder(org.bouncycastle.jce.X509Principal x509Principal) {
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.x509.Holder(org.bouncycastle.asn1.x509.GeneralNames.getInstance(new org.bouncycastle.asn1.DERSequence(new org.bouncycastle.asn1.x509.GeneralName(x509Principal))));
    }

    @Override // java.security.cert.CertSelector
    public boolean match(java.security.cert.Certificate certificate) {
        if (!(certificate instanceof java.security.cert.X509Certificate)) {
            return false;
        }
        java.security.cert.X509Certificate x509Certificate = (java.security.cert.X509Certificate) certificate;
        if (this.getHighSpeedVideoFpsRanges.getBaseCertificateID() != null) {
            return this.getHighSpeedVideoFpsRanges.getBaseCertificateID().getSerial().hasValue(x509Certificate.getSerialNumber()) && getHighSpeedVideoFpsRanges(org.bouncycastle.jce.PrincipalUtil.getIssuerX509Principal(x509Certificate), this.getHighSpeedVideoFpsRanges.getBaseCertificateID().getIssuer());
        }
        if (this.getHighSpeedVideoFpsRanges.getEntityName() != null && getHighSpeedVideoFpsRanges(org.bouncycastle.jce.PrincipalUtil.getSubjectX509Principal(x509Certificate), this.getHighSpeedVideoFpsRanges.getEntityName())) {
            return true;
        }
        if (this.getHighSpeedVideoFpsRanges.getObjectDigestInfo() != null) {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance(getDigestAlgorithm(), org.bouncycastle.jce.provider.BouncyCastleProvider.PROVIDER_NAME);
            int digestedObjectType = getDigestedObjectType();
            if (digestedObjectType == 0) {
                messageDigest.update(certificate.getPublicKey().getEncoded());
            } else if (digestedObjectType == 1) {
                messageDigest.update(certificate.getEncoded());
            }
            org.bouncycastle.util.Arrays.areEqual(messageDigest.digest(), getObjectDigest());
        }
        return false;
    }

    @Override // org.bouncycastle.util.Selector
    public boolean match(java.lang.Object obj) {
        if (obj instanceof java.security.cert.X509Certificate) {
            return match((java.security.cert.Certificate) obj);
        }
        return false;
    }

    public int hashCode() {
        return this.getHighSpeedVideoFpsRanges.hashCode();
    }

    public java.math.BigInteger getSerialNumber() {
        if (this.getHighSpeedVideoFpsRanges.getBaseCertificateID() != null) {
            return this.getHighSpeedVideoFpsRanges.getBaseCertificateID().getSerial().getValue();
        }
        return null;
    }

    public java.lang.String getOtherObjectTypeID() {
        if (this.getHighSpeedVideoFpsRanges.getObjectDigestInfo() == null) {
            return null;
        }
        this.getHighSpeedVideoFpsRanges.getObjectDigestInfo().getOtherObjectTypeID().getId();
        return null;
    }

    public byte[] getObjectDigest() {
        if (this.getHighSpeedVideoFpsRanges.getObjectDigestInfo() != null) {
            return this.getHighSpeedVideoFpsRanges.getObjectDigestInfo().getObjectDigest().getBytes();
        }
        return null;
    }

    public java.security.Principal[] getIssuer() {
        if (this.getHighSpeedVideoFpsRanges.getBaseCertificateID() != null) {
            return getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges.getBaseCertificateID().getIssuer());
        }
        return null;
    }

    public java.security.Principal[] getEntityNames() {
        if (this.getHighSpeedVideoFpsRanges.getEntityName() != null) {
            return getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges.getEntityName());
        }
        return null;
    }

    public int getDigestedObjectType() {
        if (this.getHighSpeedVideoFpsRanges.getObjectDigestInfo() != null) {
            return this.getHighSpeedVideoFpsRanges.getObjectDigestInfo().getDigestedObjectType().intValueExact();
        }
        return -1;
    }

    public java.lang.String getDigestAlgorithm() {
        if (this.getHighSpeedVideoFpsRanges.getObjectDigestInfo() != null) {
            return this.getHighSpeedVideoFpsRanges.getObjectDigestInfo().getDigestAlgorithm().getAlgorithm().getId();
        }
        return null;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof org.bouncycastle.x509.AttributeCertificateHolder) {
            return this.getHighSpeedVideoFpsRanges.equals(((org.bouncycastle.x509.AttributeCertificateHolder) obj).getHighSpeedVideoFpsRanges);
        }
        return false;
    }

    @Override // java.security.cert.CertSelector, org.bouncycastle.util.Selector
    public java.lang.Object clone() {
        return new org.bouncycastle.x509.AttributeCertificateHolder((org.bouncycastle.asn1.ASN1Sequence) this.getHighSpeedVideoFpsRanges.toASN1Primitive());
    }

    private static boolean getHighSpeedVideoFpsRanges(org.bouncycastle.jce.X509Principal x509Principal, org.bouncycastle.asn1.x509.GeneralNames generalNames) {
        org.bouncycastle.asn1.x509.GeneralName[] names = generalNames.getNames();
        for (int i = 0; i != names.length; i++) {
            org.bouncycastle.asn1.x509.GeneralName generalName = names[i];
            if (generalName.getTagNo() == 4) {
                try {
                    if (new org.bouncycastle.jce.X509Principal(generalName.getName().toASN1Primitive().getEncoded()).equals(x509Principal)) {
                        return true;
                    }
                } catch (java.io.IOException unused) {
                    continue;
                }
            }
        }
        return false;
    }

    private static java.security.Principal[] getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.x509.GeneralNames generalNames) {
        java.lang.Object[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(generalNames.getNames());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i != highSpeedVideoFpsRanges.length; i++) {
            java.lang.Object obj = highSpeedVideoFpsRanges[i];
            if (obj instanceof java.security.Principal) {
                arrayList.add(obj);
            }
        }
        return (java.security.Principal[]) arrayList.toArray(new java.security.Principal[arrayList.size()]);
    }

    private static java.lang.Object[] getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.x509.GeneralName[] generalNameArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList(generalNameArr.length);
        for (int i = 0; i != generalNameArr.length; i++) {
            if (generalNameArr[i].getTagNo() == 4) {
                try {
                    arrayList.add(new javax.security.auth.x500.X500Principal(generalNameArr[i].getName().toASN1Primitive().getEncoded()));
                } catch (java.io.IOException unused) {
                    throw new java.lang.RuntimeException("badly formed Name object");
                }
            }
        }
        return arrayList.toArray(new java.lang.Object[arrayList.size()]);
    }

    public AttributeCertificateHolder(org.bouncycastle.jce.X509Principal x509Principal, java.math.BigInteger bigInteger) {
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.x509.Holder(new org.bouncycastle.asn1.x509.IssuerSerial(org.bouncycastle.asn1.x509.GeneralNames.getInstance(new org.bouncycastle.asn1.DERSequence(new org.bouncycastle.asn1.x509.GeneralName(x509Principal))), new org.bouncycastle.asn1.ASN1Integer(bigInteger)));
    }

    AttributeCertificateHolder(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.x509.Holder.getInstance(aSN1Sequence);
    }

    public AttributeCertificateHolder(javax.security.auth.x500.X500Principal x500Principal, java.math.BigInteger bigInteger) {
        this(org.bouncycastle.x509.X509Util.getHighSpeedVideoSizes(x500Principal), bigInteger);
    }

    public AttributeCertificateHolder(javax.security.auth.x500.X500Principal x500Principal) {
        this(org.bouncycastle.x509.X509Util.getHighSpeedVideoSizes(x500Principal));
    }

    public AttributeCertificateHolder(int i, java.lang.String str, java.lang.String str2, byte[] bArr) {
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.x509.Holder(new org.bouncycastle.asn1.x509.ObjectDigestInfo(i, new org.bouncycastle.asn1.ASN1ObjectIdentifier(str2), new org.bouncycastle.asn1.x509.AlgorithmIdentifier(new org.bouncycastle.asn1.ASN1ObjectIdentifier(str)), org.bouncycastle.util.Arrays.clone(bArr)));
    }
}
