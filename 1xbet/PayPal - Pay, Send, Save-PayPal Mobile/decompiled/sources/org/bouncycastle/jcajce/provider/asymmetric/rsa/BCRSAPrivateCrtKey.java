package org.bouncycastle.jcajce.provider.asymmetric.rsa;

/* loaded from: classes17.dex */
public class BCRSAPrivateCrtKey extends org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateKey implements java.security.interfaces.RSAPrivateCrtKey {
    static final long serialVersionUID = 7834723820638524718L;
    private java.math.BigInteger Camera2StreamConfigurationMap;
    private java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI;
    private java.math.BigInteger getHighSpeedVideoFpsRanges;
    private java.math.BigInteger getHighSpeedVideoFpsRangesFor;
    private java.math.BigInteger getHighSpeedVideoSizes;
    private java.math.BigInteger getOutputFormats;

    @Override // org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateKey
    public java.lang.String toString() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("RSA Private CRT Key [");
        java.lang.String lineSeparator = org.bouncycastle.util.Strings.lineSeparator();
        stringBuffer.append(org.bouncycastle.jcajce.provider.asymmetric.rsa.RSAUtil.getHighSpeedVideoFpsRangesFor(getModulus())).append("],[").append(org.bouncycastle.jcajce.provider.asymmetric.rsa.RSAUtil.getHighResolutionOutputSizeshNQ4ISI(getPublicExponent())).append("]").append(lineSeparator);
        stringBuffer.append("             modulus: ").append(getModulus().toString(16)).append(lineSeparator);
        stringBuffer.append("     public exponent: ").append(getPublicExponent().toString(16)).append(lineSeparator);
        return stringBuffer.toString();
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateKey
    public int hashCode() {
        return (getModulus().hashCode() ^ getPublicExponent().hashCode()) ^ getPrivateExponent().hashCode();
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public java.math.BigInteger getPublicExponent() {
        return this.getOutputFormats;
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public java.math.BigInteger getPrimeQ() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public java.math.BigInteger getPrimeP() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public java.math.BigInteger getPrimeExponentQ() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public java.math.BigInteger getPrimeExponentP() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateKey, java.security.Key
    public java.lang.String getFormat() {
        return "PKCS#8";
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateKey, java.security.Key
    public byte[] getEncoded() {
        return org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil.getEncodedPrivateKeyInfo(this.algorithmIdentifier, new org.bouncycastle.asn1.pkcs.RSAPrivateKey(getModulus(), getPublicExponent(), getPrivateExponent(), getPrimeP(), getPrimeQ(), getPrimeExponentP(), getPrimeExponentQ(), getCrtCoefficient()));
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public java.math.BigInteger getCrtCoefficient() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateKey
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.security.interfaces.RSAPrivateCrtKey)) {
            return false;
        }
        java.security.interfaces.RSAPrivateCrtKey rSAPrivateCrtKey = (java.security.interfaces.RSAPrivateCrtKey) obj;
        return getModulus().equals(rSAPrivateCrtKey.getModulus()) && getPublicExponent().equals(rSAPrivateCrtKey.getPublicExponent()) && getPrivateExponent().equals(rSAPrivateCrtKey.getPrivateExponent()) && getPrimeP().equals(rSAPrivateCrtKey.getPrimeP()) && getPrimeQ().equals(rSAPrivateCrtKey.getPrimeQ()) && getPrimeExponentP().equals(rSAPrivateCrtKey.getPrimeExponentP()) && getPrimeExponentQ().equals(rSAPrivateCrtKey.getPrimeExponentQ()) && getCrtCoefficient().equals(rSAPrivateCrtKey.getCrtCoefficient());
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.attrCarrier = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
        this.rsaPrivateKey = new org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters(getModulus(), getPublicExponent(), getPrivateExponent(), getPrimeP(), getPrimeQ(), getPrimeExponentP(), getPrimeExponentQ(), getCrtCoefficient());
    }

    BCRSAPrivateCrtKey(org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters rSAPrivateCrtKeyParameters) {
        super(rSAPrivateCrtKeyParameters);
        this.getOutputFormats = rSAPrivateCrtKeyParameters.getPublicExponent();
        this.getHighSpeedVideoSizes = rSAPrivateCrtKeyParameters.getP();
        this.getHighSpeedVideoFpsRangesFor = rSAPrivateCrtKeyParameters.getQ();
        this.getHighSpeedVideoFpsRanges = rSAPrivateCrtKeyParameters.getDP();
        this.Camera2StreamConfigurationMap = rSAPrivateCrtKeyParameters.getDQ();
        this.getHighResolutionOutputSizeshNQ4ISI = rSAPrivateCrtKeyParameters.getQInv();
    }

    BCRSAPrivateCrtKey(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters rSAPrivateCrtKeyParameters) {
        super(algorithmIdentifier, rSAPrivateCrtKeyParameters);
        this.getOutputFormats = rSAPrivateCrtKeyParameters.getPublicExponent();
        this.getHighSpeedVideoSizes = rSAPrivateCrtKeyParameters.getP();
        this.getHighSpeedVideoFpsRangesFor = rSAPrivateCrtKeyParameters.getQ();
        this.getHighSpeedVideoFpsRanges = rSAPrivateCrtKeyParameters.getDP();
        this.Camera2StreamConfigurationMap = rSAPrivateCrtKeyParameters.getDQ();
        this.getHighResolutionOutputSizeshNQ4ISI = rSAPrivateCrtKeyParameters.getQInv();
    }

    private BCRSAPrivateCrtKey(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.pkcs.RSAPrivateKey rSAPrivateKey) {
        super(algorithmIdentifier, new org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters(rSAPrivateKey.getModulus(), rSAPrivateKey.getPublicExponent(), rSAPrivateKey.getPrivateExponent(), rSAPrivateKey.getPrime1(), rSAPrivateKey.getPrime2(), rSAPrivateKey.getExponent1(), rSAPrivateKey.getExponent2(), rSAPrivateKey.getCoefficient()));
        this.modulus = rSAPrivateKey.getModulus();
        this.getOutputFormats = rSAPrivateKey.getPublicExponent();
        this.privateExponent = rSAPrivateKey.getPrivateExponent();
        this.getHighSpeedVideoSizes = rSAPrivateKey.getPrime1();
        this.getHighSpeedVideoFpsRangesFor = rSAPrivateKey.getPrime2();
        this.getHighSpeedVideoFpsRanges = rSAPrivateKey.getExponent1();
        this.Camera2StreamConfigurationMap = rSAPrivateKey.getExponent2();
        this.getHighResolutionOutputSizeshNQ4ISI = rSAPrivateKey.getCoefficient();
    }

    BCRSAPrivateCrtKey(org.bouncycastle.asn1.pkcs.RSAPrivateKey rSAPrivateKey) {
        this(org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPublicKey.Camera2StreamConfigurationMap, rSAPrivateKey);
    }

    BCRSAPrivateCrtKey(org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo) throws java.io.IOException {
        this(privateKeyInfo.getPrivateKeyAlgorithm(), org.bouncycastle.asn1.pkcs.RSAPrivateKey.getInstance(privateKeyInfo.parsePrivateKey()));
    }

    BCRSAPrivateCrtKey(java.security.spec.RSAPrivateCrtKeySpec rSAPrivateCrtKeySpec) {
        super(new org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters(rSAPrivateCrtKeySpec.getModulus(), rSAPrivateCrtKeySpec.getPublicExponent(), rSAPrivateCrtKeySpec.getPrivateExponent(), rSAPrivateCrtKeySpec.getPrimeP(), rSAPrivateCrtKeySpec.getPrimeQ(), rSAPrivateCrtKeySpec.getPrimeExponentP(), rSAPrivateCrtKeySpec.getPrimeExponentQ(), rSAPrivateCrtKeySpec.getCrtCoefficient()));
        this.modulus = rSAPrivateCrtKeySpec.getModulus();
        this.getOutputFormats = rSAPrivateCrtKeySpec.getPublicExponent();
        this.privateExponent = rSAPrivateCrtKeySpec.getPrivateExponent();
        this.getHighSpeedVideoSizes = rSAPrivateCrtKeySpec.getPrimeP();
        this.getHighSpeedVideoFpsRangesFor = rSAPrivateCrtKeySpec.getPrimeQ();
        this.getHighSpeedVideoFpsRanges = rSAPrivateCrtKeySpec.getPrimeExponentP();
        this.Camera2StreamConfigurationMap = rSAPrivateCrtKeySpec.getPrimeExponentQ();
        this.getHighResolutionOutputSizeshNQ4ISI = rSAPrivateCrtKeySpec.getCrtCoefficient();
    }

    BCRSAPrivateCrtKey(java.security.interfaces.RSAPrivateCrtKey rSAPrivateCrtKey) {
        super(new org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent(), rSAPrivateCrtKey.getPrivateExponent(), rSAPrivateCrtKey.getPrimeP(), rSAPrivateCrtKey.getPrimeQ(), rSAPrivateCrtKey.getPrimeExponentP(), rSAPrivateCrtKey.getPrimeExponentQ(), rSAPrivateCrtKey.getCrtCoefficient()));
        this.modulus = rSAPrivateCrtKey.getModulus();
        this.getOutputFormats = rSAPrivateCrtKey.getPublicExponent();
        this.privateExponent = rSAPrivateCrtKey.getPrivateExponent();
        this.getHighSpeedVideoSizes = rSAPrivateCrtKey.getPrimeP();
        this.getHighSpeedVideoFpsRangesFor = rSAPrivateCrtKey.getPrimeQ();
        this.getHighSpeedVideoFpsRanges = rSAPrivateCrtKey.getPrimeExponentP();
        this.Camera2StreamConfigurationMap = rSAPrivateCrtKey.getPrimeExponentQ();
        this.getHighResolutionOutputSizeshNQ4ISI = rSAPrivateCrtKey.getCrtCoefficient();
    }
}
