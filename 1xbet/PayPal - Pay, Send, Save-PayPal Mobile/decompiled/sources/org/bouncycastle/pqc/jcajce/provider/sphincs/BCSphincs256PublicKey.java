package org.bouncycastle.pqc.jcajce.provider.sphincs;

/* loaded from: classes17.dex */
public class BCSphincs256PublicKey implements java.security.PublicKey, org.bouncycastle.pqc.jcajce.interfaces.SPHINCSKey {
    private static final long serialVersionUID = 1;
    transient org.bouncycastle.pqc.crypto.sphincs.SPHINCSPublicKeyParameters getHighSpeedVideoFpsRangesFor;
    transient org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoSizes;

    public BCSphincs256PublicKey(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) throws java.io.IOException {
        this.getHighSpeedVideoSizes = org.bouncycastle.pqc.asn1.SPHINCS256KeyParams.getInstance(subjectPublicKeyInfo.getAlgorithm().getParameters()).getTreeDigest().getAlgorithm();
        this.getHighSpeedVideoFpsRangesFor = (org.bouncycastle.pqc.crypto.sphincs.SPHINCSPublicKeyParameters) org.bouncycastle.pqc.crypto.util.PublicKeyFactory.createKey(subjectPublicKeyInfo);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        objectInputStream.defaultReadObject();
        org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo = org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance((byte[]) objectInputStream.readObject());
        this.getHighSpeedVideoSizes = org.bouncycastle.pqc.asn1.SPHINCS256KeyParams.getInstance(subjectPublicKeyInfo.getAlgorithm().getParameters()).getTreeDigest().getAlgorithm();
        this.getHighSpeedVideoFpsRangesFor = (org.bouncycastle.pqc.crypto.sphincs.SPHINCSPublicKeyParameters) org.bouncycastle.pqc.crypto.util.PublicKeyFactory.createKey(subjectPublicKeyInfo);
    }

    public int hashCode() {
        return this.getHighSpeedVideoSizes.hashCode() + (org.bouncycastle.util.Arrays.hashCode(this.getHighSpeedVideoFpsRangesFor.getKeyData()) * 37);
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.SPHINCSKey
    public byte[] getKeyData() {
        return this.getHighSpeedVideoFpsRangesFor.getKeyData();
    }

    @Override // java.security.Key
    public java.lang.String getFormat() {
        return "X.509";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return (this.getHighSpeedVideoFpsRangesFor.getTreeDigest() != null ? org.bouncycastle.pqc.crypto.util.SubjectPublicKeyInfoFactory.createSubjectPublicKeyInfo(this.getHighSpeedVideoFpsRangesFor) : new org.bouncycastle.asn1.x509.SubjectPublicKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.sphincs256, new org.bouncycastle.pqc.asn1.SPHINCS256KeyParams(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(this.getHighSpeedVideoSizes))), this.getHighSpeedVideoFpsRangesFor.getKeyData())).getEncoded();
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final java.lang.String getAlgorithm() {
        return "SPHINCS-256";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof org.bouncycastle.pqc.jcajce.provider.sphincs.BCSphincs256PublicKey)) {
            return false;
        }
        org.bouncycastle.pqc.jcajce.provider.sphincs.BCSphincs256PublicKey bCSphincs256PublicKey = (org.bouncycastle.pqc.jcajce.provider.sphincs.BCSphincs256PublicKey) obj;
        return this.getHighSpeedVideoSizes.equals((org.bouncycastle.asn1.ASN1Primitive) bCSphincs256PublicKey.getHighSpeedVideoSizes) && org.bouncycastle.util.Arrays.areEqual(this.getHighSpeedVideoFpsRangesFor.getKeyData(), bCSphincs256PublicKey.getHighSpeedVideoFpsRangesFor.getKeyData());
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public BCSphincs256PublicKey(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.pqc.crypto.sphincs.SPHINCSPublicKeyParameters sPHINCSPublicKeyParameters) {
        this.getHighSpeedVideoSizes = aSN1ObjectIdentifier;
        this.getHighSpeedVideoFpsRangesFor = sPHINCSPublicKeyParameters;
    }
}
