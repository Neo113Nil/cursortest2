package org.bouncycastle.cert;

/* loaded from: classes17.dex */
public class AttributeCertificateHolder implements org.bouncycastle.util.Selector {
    private static org.bouncycastle.operator.DigestCalculatorProvider Camera2StreamConfigurationMap;
    final org.bouncycastle.asn1.x509.Holder getHighResolutionOutputSizeshNQ4ISI;

    public AttributeCertificateHolder(org.bouncycastle.asn1.x500.X500Name x500Name) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.x509.Holder(new org.bouncycastle.asn1.x509.GeneralNames(new org.bouncycastle.asn1.x509.GeneralName(x500Name)));
    }

    public AttributeCertificateHolder(org.bouncycastle.asn1.x500.X500Name x500Name, java.math.BigInteger bigInteger) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.x509.Holder(new org.bouncycastle.asn1.x509.IssuerSerial(new org.bouncycastle.asn1.x509.GeneralNames(new org.bouncycastle.asn1.x509.GeneralName(x500Name)), new org.bouncycastle.asn1.ASN1Integer(bigInteger)));
    }

    public AttributeCertificateHolder(org.bouncycastle.cert.X509CertificateHolder x509CertificateHolder) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.x509.Holder(new org.bouncycastle.asn1.x509.IssuerSerial(new org.bouncycastle.asn1.x509.GeneralNames(new org.bouncycastle.asn1.x509.GeneralName(x509CertificateHolder.getIssuer())), new org.bouncycastle.asn1.ASN1Integer(x509CertificateHolder.getSerialNumber())));
    }

    @Override // org.bouncycastle.util.Selector
    public boolean match(java.lang.Object obj) {
        if (!(obj instanceof org.bouncycastle.cert.X509CertificateHolder)) {
            return false;
        }
        org.bouncycastle.cert.X509CertificateHolder x509CertificateHolder = (org.bouncycastle.cert.X509CertificateHolder) obj;
        if (this.getHighResolutionOutputSizeshNQ4ISI.getBaseCertificateID() != null) {
            return this.getHighResolutionOutputSizeshNQ4ISI.getBaseCertificateID().getSerial().hasValue(x509CertificateHolder.getSerialNumber()) && getHighSpeedVideoFpsRanges(x509CertificateHolder.getIssuer(), this.getHighResolutionOutputSizeshNQ4ISI.getBaseCertificateID().getIssuer());
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI.getEntityName() != null && getHighSpeedVideoFpsRanges(x509CertificateHolder.getSubject(), this.getHighResolutionOutputSizeshNQ4ISI.getEntityName())) {
            return true;
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI.getObjectDigestInfo() != null) {
            try {
                org.bouncycastle.operator.DigestCalculator digestCalculator = Camera2StreamConfigurationMap.get(this.getHighResolutionOutputSizeshNQ4ISI.getObjectDigestInfo().getDigestAlgorithm());
                java.io.OutputStream outputStream = digestCalculator.getOutputStream();
                int digestedObjectType = getDigestedObjectType();
                if (digestedObjectType == 0) {
                    outputStream.write(x509CertificateHolder.getSubjectPublicKeyInfo().getEncoded());
                } else if (digestedObjectType == 1) {
                    outputStream.write(x509CertificateHolder.getEncoded());
                }
                outputStream.close();
                org.bouncycastle.util.Arrays.areEqual(digestCalculator.getDigest(), getObjectDigest());
            } catch (java.lang.Exception unused) {
            }
        }
        return false;
    }

    public int hashCode() {
        return this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
    }

    public java.math.BigInteger getSerialNumber() {
        if (this.getHighResolutionOutputSizeshNQ4ISI.getBaseCertificateID() != null) {
            return this.getHighResolutionOutputSizeshNQ4ISI.getBaseCertificateID().getSerial().getValue();
        }
        return null;
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getOtherObjectTypeID() {
        if (this.getHighResolutionOutputSizeshNQ4ISI.getObjectDigestInfo() == null) {
            return null;
        }
        new org.bouncycastle.asn1.ASN1ObjectIdentifier(this.getHighResolutionOutputSizeshNQ4ISI.getObjectDigestInfo().getOtherObjectTypeID().getId());
        return null;
    }

    public byte[] getObjectDigest() {
        if (this.getHighResolutionOutputSizeshNQ4ISI.getObjectDigestInfo() != null) {
            return this.getHighResolutionOutputSizeshNQ4ISI.getObjectDigestInfo().getObjectDigest().getBytes();
        }
        return null;
    }

    public org.bouncycastle.asn1.x500.X500Name[] getIssuer() {
        if (this.getHighResolutionOutputSizeshNQ4ISI.getBaseCertificateID() != null) {
            return getHighSpeedVideoFpsRanges(this.getHighResolutionOutputSizeshNQ4ISI.getBaseCertificateID().getIssuer().getNames());
        }
        return null;
    }

    public org.bouncycastle.asn1.x500.X500Name[] getEntityNames() {
        if (this.getHighResolutionOutputSizeshNQ4ISI.getEntityName() != null) {
            return getHighSpeedVideoFpsRanges(this.getHighResolutionOutputSizeshNQ4ISI.getEntityName().getNames());
        }
        return null;
    }

    public int getDigestedObjectType() {
        if (this.getHighResolutionOutputSizeshNQ4ISI.getObjectDigestInfo() != null) {
            return this.getHighResolutionOutputSizeshNQ4ISI.getObjectDigestInfo().getDigestedObjectType().intValueExact();
        }
        return -1;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getDigestAlgorithm() {
        if (this.getHighResolutionOutputSizeshNQ4ISI.getObjectDigestInfo() != null) {
            return this.getHighResolutionOutputSizeshNQ4ISI.getObjectDigestInfo().getDigestAlgorithm();
        }
        return null;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof org.bouncycastle.cert.AttributeCertificateHolder) {
            return this.getHighResolutionOutputSizeshNQ4ISI.equals(((org.bouncycastle.cert.AttributeCertificateHolder) obj).getHighResolutionOutputSizeshNQ4ISI);
        }
        return false;
    }

    @Override // org.bouncycastle.util.Selector
    public java.lang.Object clone() {
        return new org.bouncycastle.cert.AttributeCertificateHolder((org.bouncycastle.asn1.ASN1Sequence) this.getHighResolutionOutputSizeshNQ4ISI.toASN1Primitive());
    }

    public static void setDigestCalculatorProvider(org.bouncycastle.operator.DigestCalculatorProvider digestCalculatorProvider) {
        Camera2StreamConfigurationMap = digestCalculatorProvider;
    }

    private static boolean getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.x500.X500Name x500Name, org.bouncycastle.asn1.x509.GeneralNames generalNames) {
        org.bouncycastle.asn1.x509.GeneralName[] names = generalNames.getNames();
        for (int i = 0; i != names.length; i++) {
            org.bouncycastle.asn1.x509.GeneralName generalName = names[i];
            if (generalName.getTagNo() == 4 && org.bouncycastle.asn1.x500.X500Name.getInstance(generalName.getName()).equals(x500Name)) {
                return true;
            }
        }
        return false;
    }

    private static org.bouncycastle.asn1.x500.X500Name[] getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.x509.GeneralName[] generalNameArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList(generalNameArr.length);
        for (int i = 0; i != generalNameArr.length; i++) {
            if (generalNameArr[i].getTagNo() == 4) {
                arrayList.add(org.bouncycastle.asn1.x500.X500Name.getInstance(generalNameArr[i].getName()));
            }
        }
        return (org.bouncycastle.asn1.x500.X500Name[]) arrayList.toArray(new org.bouncycastle.asn1.x500.X500Name[arrayList.size()]);
    }

    AttributeCertificateHolder(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.x509.Holder.getInstance(aSN1Sequence);
    }

    public AttributeCertificateHolder(int i, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier2, byte[] bArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.x509.Holder(new org.bouncycastle.asn1.x509.ObjectDigestInfo(i, aSN1ObjectIdentifier2, new org.bouncycastle.asn1.x509.AlgorithmIdentifier(aSN1ObjectIdentifier), org.bouncycastle.util.Arrays.clone(bArr)));
    }
}
