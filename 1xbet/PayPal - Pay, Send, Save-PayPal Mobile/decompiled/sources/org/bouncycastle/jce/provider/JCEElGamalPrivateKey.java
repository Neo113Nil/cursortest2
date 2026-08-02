package org.bouncycastle.jce.provider;

/* loaded from: classes17.dex */
public class JCEElGamalPrivateKey implements org.bouncycastle.jce.interfaces.ElGamalPrivateKey, javax.crypto.interfaces.DHPrivateKey, org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier {
    static final long serialVersionUID = 4819350091141529678L;
    org.bouncycastle.jce.spec.ElGamalParameterSpec Camera2StreamConfigurationMap;
    private org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl getHighSpeedVideoFpsRangesFor = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
    java.math.BigInteger getHighSpeedVideoSizes;

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public void setBagAttribute(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.getHighSpeedVideoFpsRangesFor.setBagAttribute(aSN1ObjectIdentifier, aSN1Encodable);
    }

    @Override // org.bouncycastle.jce.interfaces.ElGamalPrivateKey, javax.crypto.interfaces.DHPrivateKey
    public java.math.BigInteger getX() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // javax.crypto.interfaces.DHKey
    public javax.crypto.spec.DHParameterSpec getParams() {
        return new javax.crypto.spec.DHParameterSpec(this.Camera2StreamConfigurationMap.getP(), this.Camera2StreamConfigurationMap.getG());
    }

    @Override // org.bouncycastle.jce.interfaces.ElGamalKey
    public org.bouncycastle.jce.spec.ElGamalParameterSpec getParameters() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // java.security.Key
    public java.lang.String getFormat() {
        return "PKCS#8";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil.getEncodedPrivateKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.elGamalAlgorithm, new org.bouncycastle.asn1.oiw.ElGamalParameter(this.Camera2StreamConfigurationMap.getP(), this.Camera2StreamConfigurationMap.getG())), new org.bouncycastle.asn1.ASN1Integer(getX()));
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
        return "ElGamal";
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.writeObject(getX());
        objectOutputStream.writeObject(this.Camera2StreamConfigurationMap.getP());
        objectOutputStream.writeObject(this.Camera2StreamConfigurationMap.getG());
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.getHighSpeedVideoSizes = (java.math.BigInteger) objectInputStream.readObject();
        this.Camera2StreamConfigurationMap = new org.bouncycastle.jce.spec.ElGamalParameterSpec((java.math.BigInteger) objectInputStream.readObject(), (java.math.BigInteger) objectInputStream.readObject());
    }

    protected JCEElGamalPrivateKey() {
    }
}
