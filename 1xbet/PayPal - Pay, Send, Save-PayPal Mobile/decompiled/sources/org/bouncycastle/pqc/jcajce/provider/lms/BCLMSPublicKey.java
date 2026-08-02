package org.bouncycastle.pqc.jcajce.provider.lms;

/* loaded from: classes17.dex */
public class BCLMSPublicKey implements java.security.PublicKey, org.bouncycastle.pqc.jcajce.interfaces.LMSKey {
    private static final long serialVersionUID = -5617456225328969766L;
    transient org.bouncycastle.pqc.crypto.lms.LMSKeyParameters Camera2StreamConfigurationMap;

    public BCLMSPublicKey(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) throws java.io.IOException {
        this.Camera2StreamConfigurationMap = (org.bouncycastle.pqc.crypto.lms.LMSKeyParameters) org.bouncycastle.pqc.crypto.util.PublicKeyFactory.createKey(subjectPublicKeyInfo);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.Camera2StreamConfigurationMap = (org.bouncycastle.pqc.crypto.lms.LMSKeyParameters) org.bouncycastle.pqc.crypto.util.PublicKeyFactory.createKey(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance((byte[]) objectInputStream.readObject()));
    }

    public int hashCode() {
        try {
            return org.bouncycastle.util.Arrays.hashCode(this.Camera2StreamConfigurationMap.getEncoded());
        } catch (java.io.IOException unused) {
            return -1;
        }
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.LMSKey
    public int getLevels() {
        org.bouncycastle.pqc.crypto.lms.LMSKeyParameters lMSKeyParameters = this.Camera2StreamConfigurationMap;
        if (lMSKeyParameters instanceof org.bouncycastle.pqc.crypto.lms.LMSPublicKeyParameters) {
            return 1;
        }
        return ((org.bouncycastle.pqc.crypto.lms.HSSPublicKeyParameters) lMSKeyParameters).getL();
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
        return "LMS";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof org.bouncycastle.pqc.jcajce.provider.lms.BCLMSPublicKey)) {
            return false;
        }
        try {
            return org.bouncycastle.util.Arrays.areEqual(this.Camera2StreamConfigurationMap.getEncoded(), ((org.bouncycastle.pqc.jcajce.provider.lms.BCLMSPublicKey) obj).Camera2StreamConfigurationMap.getEncoded());
        } catch (java.io.IOException unused) {
            return false;
        }
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public BCLMSPublicKey(org.bouncycastle.pqc.crypto.lms.LMSKeyParameters lMSKeyParameters) {
        this.Camera2StreamConfigurationMap = lMSKeyParameters;
    }
}
