package org.bouncycastle.pqc.jcajce.provider.newhope;

/* loaded from: classes17.dex */
public class BCNHPublicKey implements org.bouncycastle.pqc.jcajce.interfaces.NHPublicKey {
    private static final long serialVersionUID = 1;
    transient org.bouncycastle.pqc.crypto.newhope.NHPublicKeyParameters Camera2StreamConfigurationMap;

    public BCNHPublicKey(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) throws java.io.IOException {
        this.Camera2StreamConfigurationMap = (org.bouncycastle.pqc.crypto.newhope.NHPublicKeyParameters) org.bouncycastle.pqc.crypto.util.PublicKeyFactory.createKey(subjectPublicKeyInfo);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.Camera2StreamConfigurationMap = (org.bouncycastle.pqc.crypto.newhope.NHPublicKeyParameters) org.bouncycastle.pqc.crypto.util.PublicKeyFactory.createKey(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance((byte[]) objectInputStream.readObject()));
    }

    public int hashCode() {
        return org.bouncycastle.util.Arrays.hashCode(this.Camera2StreamConfigurationMap.getPubData());
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.NHPublicKey
    public byte[] getPublicData() {
        return this.Camera2StreamConfigurationMap.getPubData();
    }

    @Override // java.security.Key
    public java.lang.String getFormat() {
        return "X.509";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return org.bouncycastle.pqc.crypto.util.SubjectPublicKeyInfoFactory.createSubjectPublicKeyInfo(this.Camera2StreamConfigurationMap).getEncoded();
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final java.lang.String getAlgorithm() {
        return "NH";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof org.bouncycastle.pqc.jcajce.provider.newhope.BCNHPublicKey)) {
            return false;
        }
        return org.bouncycastle.util.Arrays.areEqual(this.Camera2StreamConfigurationMap.getPubData(), ((org.bouncycastle.pqc.jcajce.provider.newhope.BCNHPublicKey) obj).Camera2StreamConfigurationMap.getPubData());
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public BCNHPublicKey(org.bouncycastle.pqc.crypto.newhope.NHPublicKeyParameters nHPublicKeyParameters) {
        this.Camera2StreamConfigurationMap = nHPublicKeyParameters;
    }
}
