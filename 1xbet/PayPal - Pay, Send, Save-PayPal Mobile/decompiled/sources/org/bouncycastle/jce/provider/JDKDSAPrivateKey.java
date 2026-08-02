package org.bouncycastle.jce.provider;

/* loaded from: classes17.dex */
public class JDKDSAPrivateKey implements java.security.interfaces.DSAPrivateKey, org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier {
    private static final long serialVersionUID = -4677259546958385734L;
    java.math.BigInteger Camera2StreamConfigurationMap;
    private org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl getHighSpeedVideoFpsRanges = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
    java.security.interfaces.DSAParams getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public void setBagAttribute(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.getHighSpeedVideoFpsRanges.setBagAttribute(aSN1ObjectIdentifier, aSN1Encodable);
    }

    public int hashCode() {
        return ((getX().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getQ().hashCode();
    }

    @Override // java.security.interfaces.DSAPrivateKey
    public java.math.BigInteger getX() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // java.security.interfaces.DSAKey
    public java.security.interfaces.DSAParams getParams() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // java.security.Key
    public java.lang.String getFormat() {
        return "PKCS#8";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new org.bouncycastle.asn1.pkcs.PrivateKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.id_dsa, new org.bouncycastle.asn1.x509.DSAParameter(this.getHighSpeedVideoFpsRangesFor.getP(), this.getHighSpeedVideoFpsRangesFor.getQ(), this.getHighSpeedVideoFpsRangesFor.getG())), new org.bouncycastle.asn1.ASN1Integer(getX())).getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
        } catch (java.io.IOException unused) {
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
        objectOutputStream.writeObject(this.Camera2StreamConfigurationMap);
        objectOutputStream.writeObject(this.getHighSpeedVideoFpsRangesFor.getP());
        objectOutputStream.writeObject(this.getHighSpeedVideoFpsRangesFor.getQ());
        objectOutputStream.writeObject(this.getHighSpeedVideoFpsRangesFor.getG());
        this.getHighSpeedVideoFpsRanges.writeObject(objectOutputStream);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.Camera2StreamConfigurationMap = (java.math.BigInteger) objectInputStream.readObject();
        this.getHighSpeedVideoFpsRangesFor = new java.security.spec.DSAParameterSpec((java.math.BigInteger) objectInputStream.readObject(), (java.math.BigInteger) objectInputStream.readObject(), (java.math.BigInteger) objectInputStream.readObject());
        org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl pKCS12BagAttributeCarrierImpl = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
        this.getHighSpeedVideoFpsRanges = pKCS12BagAttributeCarrierImpl;
        pKCS12BagAttributeCarrierImpl.readObject(objectInputStream);
    }

    protected JDKDSAPrivateKey() {
    }
}
