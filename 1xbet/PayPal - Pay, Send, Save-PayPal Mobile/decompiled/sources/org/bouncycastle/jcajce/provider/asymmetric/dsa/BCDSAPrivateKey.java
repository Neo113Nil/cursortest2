package org.bouncycastle.jcajce.provider.asymmetric.dsa;

/* loaded from: classes17.dex */
public class BCDSAPrivateKey implements java.security.interfaces.DSAPrivateKey, org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier {
    private static final long serialVersionUID = -4677259546958385734L;
    private transient java.security.interfaces.DSAParams getHighResolutionOutputSizeshNQ4ISI;
    private java.math.BigInteger getHighSpeedVideoFpsRanges;
    private transient org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl getHighSpeedVideoSizes = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();

    public java.lang.String toString() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("DSA Private Key [");
        java.lang.String lineSeparator = org.bouncycastle.util.Strings.lineSeparator();
        java.math.BigInteger modPow = getParams().getG().modPow(this.getHighSpeedVideoFpsRanges, getParams().getP());
        stringBuffer.append(org.bouncycastle.jcajce.provider.asymmetric.dsa.DSAUtil.getHighSpeedVideoSizes(modPow, getParams())).append("]").append(lineSeparator);
        stringBuffer.append("            Y: ").append(modPow.toString(16)).append(lineSeparator);
        return stringBuffer.toString();
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public void setBagAttribute(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.getHighSpeedVideoSizes.setBagAttribute(aSN1ObjectIdentifier, aSN1Encodable);
    }

    public int hashCode() {
        return ((getX().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getQ().hashCode();
    }

    @Override // java.security.interfaces.DSAPrivateKey
    public java.math.BigInteger getX() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // java.security.interfaces.DSAKey
    public java.security.interfaces.DSAParams getParams() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // java.security.Key
    public java.lang.String getFormat() {
        return "PKCS#8";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil.getEncodedPrivateKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.id_dsa, new org.bouncycastle.asn1.x509.DSAParameter(this.getHighResolutionOutputSizeshNQ4ISI.getP(), this.getHighResolutionOutputSizeshNQ4ISI.getQ(), this.getHighResolutionOutputSizeshNQ4ISI.getG()).toASN1Primitive()), new org.bouncycastle.asn1.ASN1Integer(getX()));
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public java.util.Enumeration getBagAttributeKeys() {
        return this.getHighSpeedVideoSizes.getBagAttributeKeys();
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public org.bouncycastle.asn1.ASN1Encodable getBagAttribute(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return this.getHighSpeedVideoSizes.getBagAttribute(aSN1ObjectIdentifier);
    }

    @Override // java.security.Key
    public java.lang.String getAlgorithm() {
        return "DSA";
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof java.security.interfaces.DSAPrivateKey)) {
            return false;
        }
        java.security.interfaces.DSAPrivateKey dSAPrivateKey = (java.security.interfaces.DSAPrivateKey) obj;
        return getX().equals(dSAPrivateKey.getX()) && getParams().getG().equals(dSAPrivateKey.getParams().getG()) && getParams().getP().equals(dSAPrivateKey.getParams().getP()) && getParams().getQ().equals(dSAPrivateKey.getParams().getQ());
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.getHighResolutionOutputSizeshNQ4ISI.getP());
        objectOutputStream.writeObject(this.getHighResolutionOutputSizeshNQ4ISI.getQ());
        objectOutputStream.writeObject(this.getHighResolutionOutputSizeshNQ4ISI.getG());
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.getHighResolutionOutputSizeshNQ4ISI = new java.security.spec.DSAParameterSpec((java.math.BigInteger) objectInputStream.readObject(), (java.math.BigInteger) objectInputStream.readObject(), (java.math.BigInteger) objectInputStream.readObject());
        this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
    }

    BCDSAPrivateKey(org.bouncycastle.crypto.params.DSAPrivateKeyParameters dSAPrivateKeyParameters) {
        this.getHighSpeedVideoFpsRanges = dSAPrivateKeyParameters.getX();
        this.getHighResolutionOutputSizeshNQ4ISI = new java.security.spec.DSAParameterSpec(dSAPrivateKeyParameters.getParameters().getP(), dSAPrivateKeyParameters.getParameters().getQ(), dSAPrivateKeyParameters.getParameters().getG());
    }

    public BCDSAPrivateKey(org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo) throws java.io.IOException {
        org.bouncycastle.asn1.x509.DSAParameter dSAParameter = org.bouncycastle.asn1.x509.DSAParameter.getInstance(privateKeyInfo.getPrivateKeyAlgorithm().getParameters());
        this.getHighSpeedVideoFpsRanges = ((org.bouncycastle.asn1.ASN1Integer) privateKeyInfo.parsePrivateKey()).getValue();
        this.getHighResolutionOutputSizeshNQ4ISI = new java.security.spec.DSAParameterSpec(dSAParameter.getP(), dSAParameter.getQ(), dSAParameter.getG());
    }

    BCDSAPrivateKey(java.security.spec.DSAPrivateKeySpec dSAPrivateKeySpec) {
        this.getHighSpeedVideoFpsRanges = dSAPrivateKeySpec.getX();
        this.getHighResolutionOutputSizeshNQ4ISI = new java.security.spec.DSAParameterSpec(dSAPrivateKeySpec.getP(), dSAPrivateKeySpec.getQ(), dSAPrivateKeySpec.getG());
    }

    BCDSAPrivateKey(java.security.interfaces.DSAPrivateKey dSAPrivateKey) {
        this.getHighSpeedVideoFpsRanges = dSAPrivateKey.getX();
        this.getHighResolutionOutputSizeshNQ4ISI = dSAPrivateKey.getParams();
    }

    protected BCDSAPrivateKey() {
    }
}
