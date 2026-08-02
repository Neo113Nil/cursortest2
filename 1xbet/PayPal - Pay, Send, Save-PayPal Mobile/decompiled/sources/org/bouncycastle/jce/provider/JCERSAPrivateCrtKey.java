package org.bouncycastle.jce.provider;

/* loaded from: classes17.dex */
public class JCERSAPrivateCrtKey extends org.bouncycastle.jce.provider.JCERSAPrivateKey implements java.security.interfaces.RSAPrivateCrtKey {
    static final long serialVersionUID = 7834723820638524718L;
    private java.math.BigInteger Camera2StreamConfigurationMap;
    private java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI;
    private java.math.BigInteger getHighSpeedVideoFpsRanges;
    private java.math.BigInteger getHighSpeedVideoFpsRangesFor;
    private java.math.BigInteger getHighSpeedVideoSizes;
    private java.math.BigInteger getOutputFormats;

    public java.lang.String toString() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("RSA Private CRT Key");
        java.lang.String lineSeparator = org.bouncycastle.util.Strings.lineSeparator();
        stringBuffer.append(lineSeparator);
        stringBuffer.append("            modulus: ").append(getModulus().toString(16)).append(lineSeparator);
        stringBuffer.append("    public exponent: ").append(getPublicExponent().toString(16)).append(lineSeparator);
        stringBuffer.append("   private exponent: ").append(getPrivateExponent().toString(16)).append(lineSeparator);
        stringBuffer.append("             primeP: ").append(getPrimeP().toString(16)).append(lineSeparator);
        stringBuffer.append("             primeQ: ").append(getPrimeQ().toString(16)).append(lineSeparator);
        stringBuffer.append("     primeExponentP: ").append(getPrimeExponentP().toString(16)).append(lineSeparator);
        stringBuffer.append("     primeExponentQ: ").append(getPrimeExponentQ().toString(16)).append(lineSeparator);
        stringBuffer.append("     crtCoefficient: ").append(getCrtCoefficient().toString(16)).append(lineSeparator);
        return stringBuffer.toString();
    }

    @Override // org.bouncycastle.jce.provider.JCERSAPrivateKey
    public int hashCode() {
        return (getModulus().hashCode() ^ getPublicExponent().hashCode()) ^ getPrivateExponent().hashCode();
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public java.math.BigInteger getPublicExponent() {
        return this.getOutputFormats;
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public java.math.BigInteger getPrimeQ() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public java.math.BigInteger getPrimeP() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public java.math.BigInteger getPrimeExponentQ() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public java.math.BigInteger getPrimeExponentP() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // org.bouncycastle.jce.provider.JCERSAPrivateKey, java.security.Key
    public java.lang.String getFormat() {
        return "PKCS#8";
    }

    @Override // org.bouncycastle.jce.provider.JCERSAPrivateKey, java.security.Key
    public byte[] getEncoded() {
        return org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil.getEncodedPrivateKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.rsaEncryption, org.bouncycastle.asn1.DERNull.INSTANCE), new org.bouncycastle.asn1.pkcs.RSAPrivateKey(getModulus(), getPublicExponent(), getPrivateExponent(), getPrimeP(), getPrimeQ(), getPrimeExponentP(), getPrimeExponentQ(), getCrtCoefficient()));
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public java.math.BigInteger getCrtCoefficient() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // org.bouncycastle.jce.provider.JCERSAPrivateKey
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
}
