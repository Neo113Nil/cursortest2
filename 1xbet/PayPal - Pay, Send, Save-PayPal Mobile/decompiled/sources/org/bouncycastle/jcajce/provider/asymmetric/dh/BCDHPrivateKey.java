package org.bouncycastle.jcajce.provider.asymmetric.dh;

/* loaded from: classes17.dex */
public class BCDHPrivateKey implements javax.crypto.interfaces.DHPrivateKey, org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier {
    static final long serialVersionUID = 311058815616901812L;
    private transient org.bouncycastle.asn1.pkcs.PrivateKeyInfo Camera2StreamConfigurationMap;
    java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI;
    private transient org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl getHighSpeedVideoFpsRanges = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
    transient org.bouncycastle.crypto.params.DHPrivateKeyParameters getHighSpeedVideoFpsRangesFor;
    transient javax.crypto.spec.DHParameterSpec getHighSpeedVideoSizes;

    public java.lang.String toString() {
        return org.bouncycastle.jcajce.provider.asymmetric.dh.DHUtil.Camera2StreamConfigurationMap("DH", this.getHighResolutionOutputSizeshNQ4ISI, new org.bouncycastle.crypto.params.DHParameters(this.getHighSpeedVideoSizes.getP(), this.getHighSpeedVideoSizes.getG()));
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public void setBagAttribute(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.getHighSpeedVideoFpsRanges.setBagAttribute(aSN1ObjectIdentifier, aSN1Encodable);
    }

    public int hashCode() {
        return ((getX().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getL();
    }

    @Override // javax.crypto.interfaces.DHPrivateKey
    public java.math.BigInteger getX() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // javax.crypto.interfaces.DHKey
    public javax.crypto.spec.DHParameterSpec getParams() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // java.security.Key
    public java.lang.String getFormat() {
        return "PKCS#8";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo;
        try {
            org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo2 = this.Camera2StreamConfigurationMap;
            if (privateKeyInfo2 != null) {
                return privateKeyInfo2.getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
            }
            javax.crypto.spec.DHParameterSpec dHParameterSpec = this.getHighSpeedVideoSizes;
            if (!(dHParameterSpec instanceof org.bouncycastle.jcajce.spec.DHDomainParameterSpec) || ((org.bouncycastle.jcajce.spec.DHDomainParameterSpec) dHParameterSpec).getQ() == null) {
                privateKeyInfo = new org.bouncycastle.asn1.pkcs.PrivateKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.dhKeyAgreement, new org.bouncycastle.asn1.pkcs.DHParameter(this.getHighSpeedVideoSizes.getP(), this.getHighSpeedVideoSizes.getG(), this.getHighSpeedVideoSizes.getL()).toASN1Primitive()), new org.bouncycastle.asn1.ASN1Integer(getX()));
            } else {
                org.bouncycastle.crypto.params.DHParameters domainParameters = ((org.bouncycastle.jcajce.spec.DHDomainParameterSpec) this.getHighSpeedVideoSizes).getDomainParameters();
                org.bouncycastle.crypto.params.DHValidationParameters validationParameters = domainParameters.getValidationParameters();
                privateKeyInfo = new org.bouncycastle.asn1.pkcs.PrivateKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.dhpublicnumber, new org.bouncycastle.asn1.x9.DomainParameters(domainParameters.getP(), domainParameters.getG(), domainParameters.getQ(), domainParameters.getJ(), validationParameters != null ? new org.bouncycastle.asn1.x9.ValidationParams(validationParameters.getSeed(), validationParameters.getCounter()) : null).toASN1Primitive()), new org.bouncycastle.asn1.ASN1Integer(getX()));
            }
            return privateKeyInfo.getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public java.util.Enumeration getBagAttributeKeys() {
        return this.getHighSpeedVideoFpsRanges.getBagAttributeKeys();
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public org.bouncycastle.asn1.ASN1Encodable getBagAttribute(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return this.getHighSpeedVideoFpsRanges.getBagAttribute(aSN1ObjectIdentifier);
    }

    @Override // java.security.Key
    public java.lang.String getAlgorithm() {
        return "DH";
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof javax.crypto.interfaces.DHPrivateKey)) {
            return false;
        }
        javax.crypto.interfaces.DHPrivateKey dHPrivateKey = (javax.crypto.interfaces.DHPrivateKey) obj;
        return getX().equals(dHPrivateKey.getX()) && getParams().getG().equals(dHPrivateKey.getParams().getG()) && getParams().getP().equals(dHPrivateKey.getParams().getP()) && getParams().getL() == dHPrivateKey.getParams().getL();
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.getHighSpeedVideoSizes.getP());
        objectOutputStream.writeObject(this.getHighSpeedVideoSizes.getG());
        objectOutputStream.writeInt(this.getHighSpeedVideoSizes.getL());
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.getHighSpeedVideoSizes = new javax.crypto.spec.DHParameterSpec((java.math.BigInteger) objectInputStream.readObject(), (java.math.BigInteger) objectInputStream.readObject(), objectInputStream.readInt());
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
    }

    BCDHPrivateKey(org.bouncycastle.crypto.params.DHPrivateKeyParameters dHPrivateKeyParameters) {
        this.getHighResolutionOutputSizeshNQ4ISI = dHPrivateKeyParameters.getX();
        this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.spec.DHDomainParameterSpec(dHPrivateKeyParameters.getParameters());
    }

    public BCDHPrivateKey(org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo) throws java.io.IOException {
        org.bouncycastle.crypto.params.DHPrivateKeyParameters dHPrivateKeyParameters;
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(privateKeyInfo.getPrivateKeyAlgorithm().getParameters());
        org.bouncycastle.asn1.ASN1Integer aSN1Integer = (org.bouncycastle.asn1.ASN1Integer) privateKeyInfo.parsePrivateKey();
        org.bouncycastle.asn1.ASN1ObjectIdentifier algorithm = privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm();
        this.Camera2StreamConfigurationMap = privateKeyInfo;
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1Integer.getValue();
        if (algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.dhKeyAgreement)) {
            org.bouncycastle.asn1.pkcs.DHParameter dHParameter = org.bouncycastle.asn1.pkcs.DHParameter.getInstance(aSN1Sequence);
            if (dHParameter.getL() != null) {
                this.getHighSpeedVideoSizes = new javax.crypto.spec.DHParameterSpec(dHParameter.getP(), dHParameter.getG(), dHParameter.getL().intValue());
                dHPrivateKeyParameters = new org.bouncycastle.crypto.params.DHPrivateKeyParameters(this.getHighResolutionOutputSizeshNQ4ISI, new org.bouncycastle.crypto.params.DHParameters(dHParameter.getP(), dHParameter.getG(), null, dHParameter.getL().intValue()));
            } else {
                this.getHighSpeedVideoSizes = new javax.crypto.spec.DHParameterSpec(dHParameter.getP(), dHParameter.getG());
                dHPrivateKeyParameters = new org.bouncycastle.crypto.params.DHPrivateKeyParameters(this.getHighResolutionOutputSizeshNQ4ISI, new org.bouncycastle.crypto.params.DHParameters(dHParameter.getP(), dHParameter.getG()));
            }
        } else {
            if (!algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.x9.X9ObjectIdentifiers.dhpublicnumber)) {
                throw new java.lang.IllegalArgumentException("unknown algorithm type: ".concat(java.lang.String.valueOf(algorithm)));
            }
            org.bouncycastle.asn1.x9.DomainParameters domainParameters = org.bouncycastle.asn1.x9.DomainParameters.getInstance(aSN1Sequence);
            this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.spec.DHDomainParameterSpec(domainParameters.getP(), domainParameters.getQ(), domainParameters.getG(), domainParameters.getJ(), 0);
            dHPrivateKeyParameters = new org.bouncycastle.crypto.params.DHPrivateKeyParameters(this.getHighResolutionOutputSizeshNQ4ISI, new org.bouncycastle.crypto.params.DHParameters(domainParameters.getP(), domainParameters.getG(), domainParameters.getQ(), domainParameters.getJ(), (org.bouncycastle.crypto.params.DHValidationParameters) null));
        }
        this.getHighSpeedVideoFpsRangesFor = dHPrivateKeyParameters;
    }

    BCDHPrivateKey(javax.crypto.spec.DHPrivateKeySpec dHPrivateKeySpec) {
        this.getHighResolutionOutputSizeshNQ4ISI = dHPrivateKeySpec.getX();
        if (dHPrivateKeySpec instanceof org.bouncycastle.jcajce.spec.DHExtendedPrivateKeySpec) {
            this.getHighSpeedVideoSizes = ((org.bouncycastle.jcajce.spec.DHExtendedPrivateKeySpec) dHPrivateKeySpec).getParams();
        } else {
            this.getHighSpeedVideoSizes = new javax.crypto.spec.DHParameterSpec(dHPrivateKeySpec.getP(), dHPrivateKeySpec.getG());
        }
    }

    BCDHPrivateKey(javax.crypto.interfaces.DHPrivateKey dHPrivateKey) {
        this.getHighResolutionOutputSizeshNQ4ISI = dHPrivateKey.getX();
        this.getHighSpeedVideoSizes = dHPrivateKey.getParams();
    }

    protected BCDHPrivateKey() {
    }
}
