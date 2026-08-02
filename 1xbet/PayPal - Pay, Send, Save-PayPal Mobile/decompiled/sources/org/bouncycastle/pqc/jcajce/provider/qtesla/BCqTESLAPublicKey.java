package org.bouncycastle.pqc.jcajce.provider.qtesla;

/* loaded from: classes17.dex */
public class BCqTESLAPublicKey implements java.security.PublicKey, org.bouncycastle.pqc.jcajce.interfaces.QTESLAKey {
    private static final long serialVersionUID = 1;
    transient org.bouncycastle.pqc.crypto.qtesla.QTESLAPublicKeyParameters getHighResolutionOutputSizeshNQ4ISI;

    public BCqTESLAPublicKey(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) throws java.io.IOException {
        this.getHighResolutionOutputSizeshNQ4ISI = (org.bouncycastle.pqc.crypto.qtesla.QTESLAPublicKeyParameters) org.bouncycastle.pqc.crypto.util.PublicKeyFactory.createKey(subjectPublicKeyInfo);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.getHighResolutionOutputSizeshNQ4ISI = (org.bouncycastle.pqc.crypto.qtesla.QTESLAPublicKeyParameters) org.bouncycastle.pqc.crypto.util.PublicKeyFactory.createKey(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance((byte[]) objectInputStream.readObject()));
    }

    public int hashCode() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getSecurityCategory() + (org.bouncycastle.util.Arrays.hashCode(this.getHighResolutionOutputSizeshNQ4ISI.getPublicData()) * 37);
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.QTESLAKey
    public org.bouncycastle.pqc.jcajce.spec.QTESLAParameterSpec getParams() {
        return new org.bouncycastle.pqc.jcajce.spec.QTESLAParameterSpec(getAlgorithm());
    }

    @Override // java.security.Key
    public java.lang.String getFormat() {
        return "X.509";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return org.bouncycastle.pqc.crypto.util.SubjectPublicKeyInfoFactory.createSubjectPublicKeyInfo(this.getHighResolutionOutputSizeshNQ4ISI).getEncoded();
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final java.lang.String getAlgorithm() {
        return org.bouncycastle.pqc.crypto.qtesla.QTESLASecurityCategory.getName(this.getHighResolutionOutputSizeshNQ4ISI.getSecurityCategory());
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof org.bouncycastle.pqc.jcajce.provider.qtesla.BCqTESLAPublicKey)) {
            return false;
        }
        org.bouncycastle.pqc.jcajce.provider.qtesla.BCqTESLAPublicKey bCqTESLAPublicKey = (org.bouncycastle.pqc.jcajce.provider.qtesla.BCqTESLAPublicKey) obj;
        return this.getHighResolutionOutputSizeshNQ4ISI.getSecurityCategory() == bCqTESLAPublicKey.getHighResolutionOutputSizeshNQ4ISI.getSecurityCategory() && org.bouncycastle.util.Arrays.areEqual(this.getHighResolutionOutputSizeshNQ4ISI.getPublicData(), bCqTESLAPublicKey.getHighResolutionOutputSizeshNQ4ISI.getPublicData());
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public BCqTESLAPublicKey(org.bouncycastle.pqc.crypto.qtesla.QTESLAPublicKeyParameters qTESLAPublicKeyParameters) {
        this.getHighResolutionOutputSizeshNQ4ISI = qTESLAPublicKeyParameters;
    }
}
