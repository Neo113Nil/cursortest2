package org.bouncycastle.jcajce.provider.asymmetric.rsa;

/* loaded from: classes17.dex */
public class BCRSAPublicKey implements java.security.interfaces.RSAPublicKey {
    static final org.bouncycastle.asn1.x509.AlgorithmIdentifier Camera2StreamConfigurationMap = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.rsaEncryption, org.bouncycastle.asn1.DERNull.INSTANCE);
    static final long serialVersionUID = 2675817738516720772L;
    private java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI;
    transient org.bouncycastle.crypto.params.RSAKeyParameters getHighSpeedVideoFpsRanges;
    private transient org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRangesFor;
    private java.math.BigInteger getHighSpeedVideoSizes;

    BCRSAPublicKey(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) {
        try {
            org.bouncycastle.asn1.pkcs.RSAPublicKey rSAPublicKey = org.bouncycastle.asn1.pkcs.RSAPublicKey.getInstance(subjectPublicKeyInfo.parsePublicKey());
            this.getHighSpeedVideoFpsRangesFor = subjectPublicKeyInfo.getAlgorithm();
            this.getHighResolutionOutputSizeshNQ4ISI = rSAPublicKey.getModulus();
            this.getHighSpeedVideoSizes = rSAPublicKey.getPublicExponent();
            this.getHighSpeedVideoFpsRanges = new org.bouncycastle.crypto.params.RSAKeyParameters(false, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes);
        } catch (java.io.IOException unused) {
            throw new java.lang.IllegalArgumentException("invalid info structure in RSA public key");
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("RSA Public Key [");
        java.lang.String lineSeparator = org.bouncycastle.util.Strings.lineSeparator();
        stringBuffer.append(org.bouncycastle.jcajce.provider.asymmetric.rsa.RSAUtil.getHighSpeedVideoFpsRangesFor(getModulus())).append("],[").append(org.bouncycastle.jcajce.provider.asymmetric.rsa.RSAUtil.getHighResolutionOutputSizeshNQ4ISI(getPublicExponent())).append("]").append(lineSeparator);
        stringBuffer.append("        modulus: ").append(getModulus().toString(16)).append(lineSeparator);
        stringBuffer.append("public exponent: ").append(getPublicExponent().toString(16)).append(lineSeparator);
        return stringBuffer.toString();
    }

    public int hashCode() {
        return getModulus().hashCode() ^ getPublicExponent().hashCode();
    }

    @Override // java.security.interfaces.RSAPublicKey
    public java.math.BigInteger getPublicExponent() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // java.security.interfaces.RSAKey
    public java.math.BigInteger getModulus() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // java.security.Key
    public java.lang.String getFormat() {
        return "X.509";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil.getEncodedSubjectPublicKeyInfo(this.getHighSpeedVideoFpsRangesFor, new org.bouncycastle.asn1.pkcs.RSAPublicKey(getModulus(), getPublicExponent()));
    }

    @Override // java.security.Key
    public java.lang.String getAlgorithm() {
        return this.getHighSpeedVideoFpsRangesFor.getAlgorithm().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_RSASSA_PSS) ? org.jose4j.jws.RsaUsingShaAlgorithm.RSASSA_PSS : "RSA";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.security.interfaces.RSAPublicKey)) {
            return false;
        }
        java.security.interfaces.RSAPublicKey rSAPublicKey = (java.security.interfaces.RSAPublicKey) obj;
        return getModulus().equals(rSAPublicKey.getModulus()) && getPublicExponent().equals(rSAPublicKey.getPublicExponent());
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        if (this.getHighSpeedVideoFpsRangesFor.equals(Camera2StreamConfigurationMap)) {
            return;
        }
        objectOutputStream.writeObject(this.getHighSpeedVideoFpsRangesFor.getEncoded());
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        objectInputStream.defaultReadObject();
        try {
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(objectInputStream.readObject());
        } catch (java.lang.Exception unused) {
            this.getHighSpeedVideoFpsRangesFor = Camera2StreamConfigurationMap;
        }
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.crypto.params.RSAKeyParameters(false, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes);
    }

    BCRSAPublicKey(org.bouncycastle.crypto.params.RSAKeyParameters rSAKeyParameters) {
        this(Camera2StreamConfigurationMap, rSAKeyParameters);
    }

    BCRSAPublicKey(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.crypto.params.RSAKeyParameters rSAKeyParameters) {
        this.getHighSpeedVideoFpsRangesFor = algorithmIdentifier;
        this.getHighResolutionOutputSizeshNQ4ISI = rSAKeyParameters.getModulus();
        this.getHighSpeedVideoSizes = rSAKeyParameters.getExponent();
        this.getHighSpeedVideoFpsRanges = rSAKeyParameters;
    }

    BCRSAPublicKey(java.security.spec.RSAPublicKeySpec rSAPublicKeySpec) {
        this.getHighSpeedVideoFpsRangesFor = Camera2StreamConfigurationMap;
        this.getHighResolutionOutputSizeshNQ4ISI = rSAPublicKeySpec.getModulus();
        this.getHighSpeedVideoSizes = rSAPublicKeySpec.getPublicExponent();
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.crypto.params.RSAKeyParameters(false, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes);
    }

    BCRSAPublicKey(java.security.interfaces.RSAPublicKey rSAPublicKey) {
        this.getHighSpeedVideoFpsRangesFor = Camera2StreamConfigurationMap;
        this.getHighResolutionOutputSizeshNQ4ISI = rSAPublicKey.getModulus();
        this.getHighSpeedVideoSizes = rSAPublicKey.getPublicExponent();
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.crypto.params.RSAKeyParameters(false, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes);
    }
}
