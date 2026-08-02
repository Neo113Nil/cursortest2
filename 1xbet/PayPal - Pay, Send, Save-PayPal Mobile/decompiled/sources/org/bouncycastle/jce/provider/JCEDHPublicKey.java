package org.bouncycastle.jce.provider;

/* loaded from: classes17.dex */
public class JCEDHPublicKey implements javax.crypto.interfaces.DHPublicKey {
    static final long serialVersionUID = -216691575254424324L;
    private org.bouncycastle.asn1.x509.SubjectPublicKeyInfo getHighResolutionOutputSizeshNQ4ISI;
    private javax.crypto.spec.DHParameterSpec getHighSpeedVideoFpsRanges;
    private java.math.BigInteger getHighSpeedVideoFpsRangesFor;

    @Override // javax.crypto.interfaces.DHPublicKey
    public java.math.BigInteger getY() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // javax.crypto.interfaces.DHKey
    public javax.crypto.spec.DHParameterSpec getParams() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // java.security.Key
    public java.lang.String getFormat() {
        return "X.509";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo = this.getHighResolutionOutputSizeshNQ4ISI;
        return subjectPublicKeyInfo != null ? org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil.getEncodedSubjectPublicKeyInfo(subjectPublicKeyInfo) : org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil.getEncodedSubjectPublicKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.dhKeyAgreement, new org.bouncycastle.asn1.pkcs.DHParameter(this.getHighSpeedVideoFpsRanges.getP(), this.getHighSpeedVideoFpsRanges.getG(), this.getHighSpeedVideoFpsRanges.getL())), new org.bouncycastle.asn1.ASN1Integer(this.getHighSpeedVideoFpsRangesFor));
    }

    @Override // java.security.Key
    public java.lang.String getAlgorithm() {
        return "DH";
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.writeObject(getY());
        objectOutputStream.writeObject(this.getHighSpeedVideoFpsRanges.getP());
        objectOutputStream.writeObject(this.getHighSpeedVideoFpsRanges.getG());
        objectOutputStream.writeInt(this.getHighSpeedVideoFpsRanges.getL());
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.getHighSpeedVideoFpsRangesFor = (java.math.BigInteger) objectInputStream.readObject();
        this.getHighSpeedVideoFpsRanges = new javax.crypto.spec.DHParameterSpec((java.math.BigInteger) objectInputStream.readObject(), (java.math.BigInteger) objectInputStream.readObject(), objectInputStream.readInt());
    }
}
