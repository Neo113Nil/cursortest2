package org.bouncycastle.jce.provider;

/* loaded from: classes17.dex */
public class JDKDSAPublicKey implements java.security.interfaces.DSAPublicKey {
    private static final long serialVersionUID = 1752452449903495175L;
    private java.security.interfaces.DSAParams Camera2StreamConfigurationMap;
    private java.math.BigInteger getHighSpeedVideoSizes;

    public java.lang.String toString() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("DSA Public Key");
        java.lang.String lineSeparator = org.bouncycastle.util.Strings.lineSeparator();
        stringBuffer.append(lineSeparator);
        stringBuffer.append("            y: ").append(getY().toString(16)).append(lineSeparator);
        return stringBuffer.toString();
    }

    public int hashCode() {
        return ((getY().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getQ().hashCode();
    }

    @Override // java.security.interfaces.DSAPublicKey
    public java.math.BigInteger getY() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // java.security.interfaces.DSAKey
    public java.security.interfaces.DSAParams getParams() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // java.security.Key
    public java.lang.String getFormat() {
        return "X.509";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return (this.Camera2StreamConfigurationMap == null ? new org.bouncycastle.asn1.x509.SubjectPublicKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.id_dsa), new org.bouncycastle.asn1.ASN1Integer(this.getHighSpeedVideoSizes)) : new org.bouncycastle.asn1.x509.SubjectPublicKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.id_dsa, new org.bouncycastle.asn1.x509.DSAParameter(this.Camera2StreamConfigurationMap.getP(), this.Camera2StreamConfigurationMap.getQ(), this.Camera2StreamConfigurationMap.getG())), new org.bouncycastle.asn1.ASN1Integer(this.getHighSpeedVideoSizes))).getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public java.lang.String getAlgorithm() {
        return "DSA";
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof java.security.interfaces.DSAPublicKey)) {
            return false;
        }
        java.security.interfaces.DSAPublicKey dSAPublicKey = (java.security.interfaces.DSAPublicKey) obj;
        return getY().equals(dSAPublicKey.getY()) && getParams().getG().equals(dSAPublicKey.getParams().getG()) && getParams().getP().equals(dSAPublicKey.getParams().getP()) && getParams().getQ().equals(dSAPublicKey.getParams().getQ());
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.writeObject(this.getHighSpeedVideoSizes);
        objectOutputStream.writeObject(this.Camera2StreamConfigurationMap.getP());
        objectOutputStream.writeObject(this.Camera2StreamConfigurationMap.getQ());
        objectOutputStream.writeObject(this.Camera2StreamConfigurationMap.getG());
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.getHighSpeedVideoSizes = (java.math.BigInteger) objectInputStream.readObject();
        this.Camera2StreamConfigurationMap = new java.security.spec.DSAParameterSpec((java.math.BigInteger) objectInputStream.readObject(), (java.math.BigInteger) objectInputStream.readObject(), (java.math.BigInteger) objectInputStream.readObject());
    }
}
