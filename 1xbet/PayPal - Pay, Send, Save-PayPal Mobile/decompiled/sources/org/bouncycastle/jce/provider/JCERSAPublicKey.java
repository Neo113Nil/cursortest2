package org.bouncycastle.jce.provider;

/* loaded from: classes17.dex */
public class JCERSAPublicKey implements java.security.interfaces.RSAPublicKey {
    static final long serialVersionUID = 2675817738516720772L;
    private java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI;
    private java.math.BigInteger getHighSpeedVideoSizes;

    public java.lang.String toString() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("RSA Public Key");
        java.lang.String lineSeparator = org.bouncycastle.util.Strings.lineSeparator();
        stringBuffer.append(lineSeparator);
        stringBuffer.append("            modulus: ").append(getModulus().toString(16)).append(lineSeparator);
        stringBuffer.append("    public exponent: ").append(getPublicExponent().toString(16)).append(lineSeparator);
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
        return org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil.getEncodedSubjectPublicKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.rsaEncryption, org.bouncycastle.asn1.DERNull.INSTANCE), new org.bouncycastle.asn1.pkcs.RSAPublicKey(getModulus(), getPublicExponent()));
    }

    @Override // java.security.Key
    public java.lang.String getAlgorithm() {
        return "RSA";
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
}
