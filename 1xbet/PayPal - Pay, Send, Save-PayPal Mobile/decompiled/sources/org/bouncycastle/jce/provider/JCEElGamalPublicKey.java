package org.bouncycastle.jce.provider;

/* loaded from: classes17.dex */
public class JCEElGamalPublicKey implements org.bouncycastle.jce.interfaces.ElGamalPublicKey, javax.crypto.interfaces.DHPublicKey {
    static final long serialVersionUID = 8712728417091216948L;
    private java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.jce.spec.ElGamalParameterSpec getHighSpeedVideoSizes;

    @Override // org.bouncycastle.jce.interfaces.ElGamalPublicKey, javax.crypto.interfaces.DHPublicKey
    public java.math.BigInteger getY() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // javax.crypto.interfaces.DHKey
    public javax.crypto.spec.DHParameterSpec getParams() {
        return new javax.crypto.spec.DHParameterSpec(this.getHighSpeedVideoSizes.getP(), this.getHighSpeedVideoSizes.getG());
    }

    @Override // org.bouncycastle.jce.interfaces.ElGamalKey
    public org.bouncycastle.jce.spec.ElGamalParameterSpec getParameters() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // java.security.Key
    public java.lang.String getFormat() {
        return "X.509";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil.getEncodedSubjectPublicKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.elGamalAlgorithm, new org.bouncycastle.asn1.oiw.ElGamalParameter(this.getHighSpeedVideoSizes.getP(), this.getHighSpeedVideoSizes.getG())), new org.bouncycastle.asn1.ASN1Integer(this.getHighResolutionOutputSizeshNQ4ISI));
    }

    @Override // java.security.Key
    public java.lang.String getAlgorithm() {
        return "ElGamal";
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.writeObject(getY());
        objectOutputStream.writeObject(this.getHighSpeedVideoSizes.getP());
        objectOutputStream.writeObject(this.getHighSpeedVideoSizes.getG());
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.getHighResolutionOutputSizeshNQ4ISI = (java.math.BigInteger) objectInputStream.readObject();
        this.getHighSpeedVideoSizes = new org.bouncycastle.jce.spec.ElGamalParameterSpec((java.math.BigInteger) objectInputStream.readObject(), (java.math.BigInteger) objectInputStream.readObject());
    }
}
