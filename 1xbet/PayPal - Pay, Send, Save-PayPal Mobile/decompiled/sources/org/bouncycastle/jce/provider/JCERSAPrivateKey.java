package org.bouncycastle.jce.provider;

/* loaded from: classes17.dex */
public class JCERSAPrivateKey implements java.security.interfaces.RSAPrivateKey, org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier {
    private static java.math.BigInteger Camera2StreamConfigurationMap = java.math.BigInteger.valueOf(0);
    static final long serialVersionUID = 5110188922551353628L;
    private transient org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl getHighSpeedVideoFpsRangesFor = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
    protected java.math.BigInteger modulus;
    protected java.math.BigInteger privateExponent;

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public void setBagAttribute(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.getHighSpeedVideoFpsRangesFor.setBagAttribute(aSN1ObjectIdentifier, aSN1Encodable);
    }

    public int hashCode() {
        return getModulus().hashCode() ^ getPrivateExponent().hashCode();
    }

    @Override // java.security.interfaces.RSAPrivateKey
    public java.math.BigInteger getPrivateExponent() {
        return this.privateExponent;
    }

    @Override // java.security.interfaces.RSAKey
    public java.math.BigInteger getModulus() {
        return this.modulus;
    }

    @Override // java.security.Key
    public java.lang.String getFormat() {
        return "PKCS#8";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.rsaEncryption, org.bouncycastle.asn1.DERNull.INSTANCE);
        java.math.BigInteger modulus = getModulus();
        java.math.BigInteger bigInteger = Camera2StreamConfigurationMap;
        java.math.BigInteger privateExponent = getPrivateExponent();
        java.math.BigInteger bigInteger2 = Camera2StreamConfigurationMap;
        return org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil.getEncodedPrivateKeyInfo(algorithmIdentifier, new org.bouncycastle.asn1.pkcs.RSAPrivateKey(modulus, bigInteger, privateExponent, bigInteger2, bigInteger2, bigInteger2, bigInteger2, bigInteger2));
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public java.util.Enumeration getBagAttributeKeys() {
        return this.getHighSpeedVideoFpsRangesFor.getBagAttributeKeys();
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public org.bouncycastle.asn1.ASN1Encodable getBagAttribute(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return this.getHighSpeedVideoFpsRangesFor.getBagAttribute(aSN1ObjectIdentifier);
    }

    @Override // java.security.Key
    public java.lang.String getAlgorithm() {
        return "RSA";
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof java.security.interfaces.RSAPrivateKey)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        java.security.interfaces.RSAPrivateKey rSAPrivateKey = (java.security.interfaces.RSAPrivateKey) obj;
        return getModulus().equals(rSAPrivateKey.getModulus()) && getPrivateExponent().equals(rSAPrivateKey.getPrivateExponent());
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.writeObject(this.modulus);
        this.getHighSpeedVideoFpsRangesFor.writeObject(objectOutputStream);
        objectOutputStream.writeObject(this.privateExponent);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.modulus = (java.math.BigInteger) objectInputStream.readObject();
        org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl pKCS12BagAttributeCarrierImpl = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
        this.getHighSpeedVideoFpsRangesFor = pKCS12BagAttributeCarrierImpl;
        pKCS12BagAttributeCarrierImpl.readObject(objectInputStream);
        this.privateExponent = (java.math.BigInteger) objectInputStream.readObject();
    }

    protected JCERSAPrivateKey() {
    }
}
