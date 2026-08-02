package org.bouncycastle.jcajce.provider.asymmetric.rsa;

/* loaded from: classes17.dex */
public class BCRSAPrivateKey implements java.security.interfaces.RSAPrivateKey, org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier {
    private static java.math.BigInteger getHighSpeedVideoSizes = java.math.BigInteger.valueOf(0);
    static final long serialVersionUID = 5110188922551353628L;
    protected transient org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier;
    protected transient org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl attrCarrier;
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    protected java.math.BigInteger modulus;
    protected java.math.BigInteger privateExponent;
    protected transient org.bouncycastle.crypto.params.RSAKeyParameters rsaPrivateKey;

    public java.lang.String toString() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("RSA Private Key [");
        java.lang.String lineSeparator = org.bouncycastle.util.Strings.lineSeparator();
        stringBuffer.append(org.bouncycastle.jcajce.provider.asymmetric.rsa.RSAUtil.getHighSpeedVideoFpsRangesFor(getModulus())).append("],[]").append(lineSeparator);
        stringBuffer.append("            modulus: ").append(getModulus().toString(16)).append(lineSeparator);
        return stringBuffer.toString();
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public void setBagAttribute(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.attrCarrier.setBagAttribute(aSN1ObjectIdentifier, aSN1Encodable);
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
        org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier = this.algorithmIdentifier;
        java.math.BigInteger modulus = getModulus();
        java.math.BigInteger bigInteger = getHighSpeedVideoSizes;
        java.math.BigInteger privateExponent = getPrivateExponent();
        java.math.BigInteger bigInteger2 = getHighSpeedVideoSizes;
        return org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil.getEncodedPrivateKeyInfo(algorithmIdentifier, new org.bouncycastle.asn1.pkcs.RSAPrivateKey(modulus, bigInteger, privateExponent, bigInteger2, bigInteger2, bigInteger2, bigInteger2, bigInteger2));
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public java.util.Enumeration getBagAttributeKeys() {
        return this.attrCarrier.getBagAttributeKeys();
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public org.bouncycastle.asn1.ASN1Encodable getBagAttribute(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return this.attrCarrier.getBagAttribute(aSN1ObjectIdentifier);
    }

    @Override // java.security.Key
    public java.lang.String getAlgorithm() {
        return this.algorithmIdentifier.getAlgorithm().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_RSASSA_PSS) ? org.jose4j.jws.RsaUsingShaAlgorithm.RSASSA_PSS : "RSA";
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

    final org.bouncycastle.crypto.params.RSAKeyParameters Camera2StreamConfigurationMap() {
        return this.rsaPrivateKey;
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        objectInputStream.defaultReadObject();
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            this.getHighResolutionOutputSizeshNQ4ISI = Camera2StreamConfigurationMap(org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPublicKey.Camera2StreamConfigurationMap);
        }
        this.algorithmIdentifier = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(this.getHighResolutionOutputSizeshNQ4ISI);
        this.attrCarrier = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
        this.rsaPrivateKey = new org.bouncycastle.crypto.params.RSAKeyParameters(true, this.modulus, this.privateExponent);
    }

    private static byte[] Camera2StreamConfigurationMap(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
        try {
            return algorithmIdentifier.getEncoded();
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    BCRSAPrivateKey(org.bouncycastle.crypto.params.RSAKeyParameters rSAKeyParameters) {
        this.getHighResolutionOutputSizeshNQ4ISI = Camera2StreamConfigurationMap(org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPublicKey.Camera2StreamConfigurationMap);
        this.algorithmIdentifier = org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPublicKey.Camera2StreamConfigurationMap;
        this.attrCarrier = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
        this.modulus = rSAKeyParameters.getModulus();
        this.privateExponent = rSAKeyParameters.getExponent();
        this.rsaPrivateKey = rSAKeyParameters;
    }

    BCRSAPrivateKey(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.crypto.params.RSAKeyParameters rSAKeyParameters) {
        this.getHighResolutionOutputSizeshNQ4ISI = Camera2StreamConfigurationMap(org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPublicKey.Camera2StreamConfigurationMap);
        this.algorithmIdentifier = org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPublicKey.Camera2StreamConfigurationMap;
        this.attrCarrier = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
        this.algorithmIdentifier = algorithmIdentifier;
        this.getHighResolutionOutputSizeshNQ4ISI = Camera2StreamConfigurationMap(algorithmIdentifier);
        this.modulus = rSAKeyParameters.getModulus();
        this.privateExponent = rSAKeyParameters.getExponent();
        this.rsaPrivateKey = rSAKeyParameters;
    }

    BCRSAPrivateKey(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.pkcs.RSAPrivateKey rSAPrivateKey) {
        this.getHighResolutionOutputSizeshNQ4ISI = Camera2StreamConfigurationMap(org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPublicKey.Camera2StreamConfigurationMap);
        this.algorithmIdentifier = org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPublicKey.Camera2StreamConfigurationMap;
        this.attrCarrier = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
        this.algorithmIdentifier = algorithmIdentifier;
        this.getHighResolutionOutputSizeshNQ4ISI = Camera2StreamConfigurationMap(algorithmIdentifier);
        this.modulus = rSAPrivateKey.getModulus();
        this.privateExponent = rSAPrivateKey.getPrivateExponent();
        this.rsaPrivateKey = new org.bouncycastle.crypto.params.RSAKeyParameters(true, this.modulus, this.privateExponent);
    }

    BCRSAPrivateKey(java.security.spec.RSAPrivateKeySpec rSAPrivateKeySpec) {
        this.getHighResolutionOutputSizeshNQ4ISI = Camera2StreamConfigurationMap(org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPublicKey.Camera2StreamConfigurationMap);
        this.algorithmIdentifier = org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPublicKey.Camera2StreamConfigurationMap;
        this.attrCarrier = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
        this.modulus = rSAPrivateKeySpec.getModulus();
        this.privateExponent = rSAPrivateKeySpec.getPrivateExponent();
        this.rsaPrivateKey = new org.bouncycastle.crypto.params.RSAKeyParameters(true, this.modulus, this.privateExponent);
    }

    BCRSAPrivateKey(java.security.interfaces.RSAPrivateKey rSAPrivateKey) {
        this.getHighResolutionOutputSizeshNQ4ISI = Camera2StreamConfigurationMap(org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPublicKey.Camera2StreamConfigurationMap);
        this.algorithmIdentifier = org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPublicKey.Camera2StreamConfigurationMap;
        this.attrCarrier = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
        this.modulus = rSAPrivateKey.getModulus();
        this.privateExponent = rSAPrivateKey.getPrivateExponent();
        this.rsaPrivateKey = new org.bouncycastle.crypto.params.RSAKeyParameters(true, this.modulus, this.privateExponent);
    }
}
