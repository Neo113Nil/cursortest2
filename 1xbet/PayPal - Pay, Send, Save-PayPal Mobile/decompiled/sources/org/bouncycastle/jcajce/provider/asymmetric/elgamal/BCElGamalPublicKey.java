package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

/* loaded from: classes17.dex */
public class BCElGamalPublicKey implements org.bouncycastle.jce.interfaces.ElGamalPublicKey, javax.crypto.interfaces.DHPublicKey {
    static final long serialVersionUID = 8712728417091216948L;
    private transient org.bouncycastle.jce.spec.ElGamalParameterSpec Camera2StreamConfigurationMap;
    private java.math.BigInteger getHighSpeedVideoFpsRangesFor;

    public int hashCode() {
        return ((getY().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getL();
    }

    @Override // org.bouncycastle.jce.interfaces.ElGamalPublicKey, javax.crypto.interfaces.DHPublicKey
    public java.math.BigInteger getY() {
        return this.getHighSpeedVideoFpsRangesFor;
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
        return "X.509";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new org.bouncycastle.asn1.x509.SubjectPublicKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.elGamalAlgorithm, new org.bouncycastle.asn1.oiw.ElGamalParameter(this.Camera2StreamConfigurationMap.getP(), this.Camera2StreamConfigurationMap.getG())), new org.bouncycastle.asn1.ASN1Integer(this.getHighSpeedVideoFpsRangesFor)).getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public java.lang.String getAlgorithm() {
        return "ElGamal";
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof javax.crypto.interfaces.DHPublicKey)) {
            return false;
        }
        javax.crypto.interfaces.DHPublicKey dHPublicKey = (javax.crypto.interfaces.DHPublicKey) obj;
        return getY().equals(dHPublicKey.getY()) && getParams().getG().equals(dHPublicKey.getParams().getG()) && getParams().getP().equals(dHPublicKey.getParams().getP()) && getParams().getL() == dHPublicKey.getParams().getL();
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.Camera2StreamConfigurationMap.getP());
        objectOutputStream.writeObject(this.Camera2StreamConfigurationMap.getG());
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.Camera2StreamConfigurationMap = new org.bouncycastle.jce.spec.ElGamalParameterSpec((java.math.BigInteger) objectInputStream.readObject(), (java.math.BigInteger) objectInputStream.readObject());
    }

    BCElGamalPublicKey(org.bouncycastle.jce.spec.ElGamalPublicKeySpec elGamalPublicKeySpec) {
        this.getHighSpeedVideoFpsRangesFor = elGamalPublicKeySpec.getY();
        this.Camera2StreamConfigurationMap = new org.bouncycastle.jce.spec.ElGamalParameterSpec(elGamalPublicKeySpec.getParams().getP(), elGamalPublicKeySpec.getParams().getG());
    }

    BCElGamalPublicKey(org.bouncycastle.jce.interfaces.ElGamalPublicKey elGamalPublicKey) {
        this.getHighSpeedVideoFpsRangesFor = elGamalPublicKey.getY();
        this.Camera2StreamConfigurationMap = elGamalPublicKey.getParameters();
    }

    BCElGamalPublicKey(org.bouncycastle.crypto.params.ElGamalPublicKeyParameters elGamalPublicKeyParameters) {
        this.getHighSpeedVideoFpsRangesFor = elGamalPublicKeyParameters.getY();
        this.Camera2StreamConfigurationMap = new org.bouncycastle.jce.spec.ElGamalParameterSpec(elGamalPublicKeyParameters.getParameters().getP(), elGamalPublicKeyParameters.getParameters().getG());
    }

    BCElGamalPublicKey(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) {
        org.bouncycastle.asn1.oiw.ElGamalParameter elGamalParameter = org.bouncycastle.asn1.oiw.ElGamalParameter.getInstance(subjectPublicKeyInfo.getAlgorithm().getParameters());
        try {
            this.getHighSpeedVideoFpsRangesFor = ((org.bouncycastle.asn1.ASN1Integer) subjectPublicKeyInfo.parsePublicKey()).getValue();
            this.Camera2StreamConfigurationMap = new org.bouncycastle.jce.spec.ElGamalParameterSpec(elGamalParameter.getP(), elGamalParameter.getG());
        } catch (java.io.IOException unused) {
            throw new java.lang.IllegalArgumentException("invalid info structure in DSA public key");
        }
    }

    BCElGamalPublicKey(javax.crypto.spec.DHPublicKeySpec dHPublicKeySpec) {
        this.getHighSpeedVideoFpsRangesFor = dHPublicKeySpec.getY();
        this.Camera2StreamConfigurationMap = new org.bouncycastle.jce.spec.ElGamalParameterSpec(dHPublicKeySpec.getP(), dHPublicKeySpec.getG());
    }

    BCElGamalPublicKey(javax.crypto.interfaces.DHPublicKey dHPublicKey) {
        this.getHighSpeedVideoFpsRangesFor = dHPublicKey.getY();
        this.Camera2StreamConfigurationMap = new org.bouncycastle.jce.spec.ElGamalParameterSpec(dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG());
    }
}
