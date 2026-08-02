package org.bouncycastle.jce.provider;

/* loaded from: classes17.dex */
public class JCEDHPrivateKey implements javax.crypto.interfaces.DHPrivateKey, org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier {
    static final long serialVersionUID = 311058815616901812L;
    private org.bouncycastle.asn1.pkcs.PrivateKeyInfo Camera2StreamConfigurationMap;
    java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI;
    private javax.crypto.spec.DHParameterSpec getHighSpeedVideoFpsRanges;
    private org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier getHighSpeedVideoSizes = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public void setBagAttribute(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.getHighSpeedVideoSizes.setBagAttribute(aSN1ObjectIdentifier, aSN1Encodable);
    }

    @Override // javax.crypto.interfaces.DHPrivateKey
    public java.math.BigInteger getX() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // javax.crypto.interfaces.DHKey
    public javax.crypto.spec.DHParameterSpec getParams() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // java.security.Key
    public java.lang.String getFormat() {
        return "PKCS#8";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo = this.Camera2StreamConfigurationMap;
            if (privateKeyInfo == null) {
                privateKeyInfo = new org.bouncycastle.asn1.pkcs.PrivateKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.dhKeyAgreement, new org.bouncycastle.asn1.pkcs.DHParameter(this.getHighSpeedVideoFpsRanges.getP(), this.getHighSpeedVideoFpsRanges.getG(), this.getHighSpeedVideoFpsRanges.getL())), new org.bouncycastle.asn1.ASN1Integer(getX()));
            }
            return privateKeyInfo.getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
        } catch (java.io.IOException unused) {
            return null;
        }
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
        return "DH";
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.writeObject(getX());
        objectOutputStream.writeObject(this.getHighSpeedVideoFpsRanges.getP());
        objectOutputStream.writeObject(this.getHighSpeedVideoFpsRanges.getG());
        objectOutputStream.writeInt(this.getHighSpeedVideoFpsRanges.getL());
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.getHighResolutionOutputSizeshNQ4ISI = (java.math.BigInteger) objectInputStream.readObject();
        this.getHighSpeedVideoFpsRanges = new javax.crypto.spec.DHParameterSpec((java.math.BigInteger) objectInputStream.readObject(), (java.math.BigInteger) objectInputStream.readObject(), objectInputStream.readInt());
    }

    protected JCEDHPrivateKey() {
    }
}
