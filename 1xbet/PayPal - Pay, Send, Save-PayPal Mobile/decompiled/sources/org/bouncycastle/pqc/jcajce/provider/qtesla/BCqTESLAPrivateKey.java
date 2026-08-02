package org.bouncycastle.pqc.jcajce.provider.qtesla;

/* loaded from: classes17.dex */
public class BCqTESLAPrivateKey implements java.security.PrivateKey, org.bouncycastle.pqc.jcajce.interfaces.QTESLAKey {
    private static final long serialVersionUID = 1;
    private transient org.bouncycastle.asn1.ASN1Set getHighResolutionOutputSizeshNQ4ISI;
    transient org.bouncycastle.pqc.crypto.qtesla.QTESLAPrivateKeyParameters getHighSpeedVideoSizes;

    public BCqTESLAPrivateKey(org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo) throws java.io.IOException {
        this.getHighResolutionOutputSizeshNQ4ISI = privateKeyInfo.getAttributes();
        this.getHighSpeedVideoSizes = (org.bouncycastle.pqc.crypto.qtesla.QTESLAPrivateKeyParameters) org.bouncycastle.pqc.crypto.util.PrivateKeyFactory.createKey(privateKeyInfo);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        objectInputStream.defaultReadObject();
        org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo = org.bouncycastle.asn1.pkcs.PrivateKeyInfo.getInstance((byte[]) objectInputStream.readObject());
        this.getHighResolutionOutputSizeshNQ4ISI = privateKeyInfo.getAttributes();
        this.getHighSpeedVideoSizes = (org.bouncycastle.pqc.crypto.qtesla.QTESLAPrivateKeyParameters) org.bouncycastle.pqc.crypto.util.PrivateKeyFactory.createKey(privateKeyInfo);
    }

    public int hashCode() {
        return this.getHighSpeedVideoSizes.getSecurityCategory() + (org.bouncycastle.util.Arrays.hashCode(this.getHighSpeedVideoSizes.getSecret()) * 37);
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.QTESLAKey
    public org.bouncycastle.pqc.jcajce.spec.QTESLAParameterSpec getParams() {
        return new org.bouncycastle.pqc.jcajce.spec.QTESLAParameterSpec(getAlgorithm());
    }

    @Override // java.security.Key
    public java.lang.String getFormat() {
        return "PKCS#8";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return org.bouncycastle.pqc.crypto.util.PrivateKeyInfoFactory.createPrivateKeyInfo(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI).getEncoded();
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final java.lang.String getAlgorithm() {
        return org.bouncycastle.pqc.crypto.qtesla.QTESLASecurityCategory.getName(this.getHighSpeedVideoSizes.getSecurityCategory());
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof org.bouncycastle.pqc.jcajce.provider.qtesla.BCqTESLAPrivateKey)) {
            return false;
        }
        org.bouncycastle.pqc.jcajce.provider.qtesla.BCqTESLAPrivateKey bCqTESLAPrivateKey = (org.bouncycastle.pqc.jcajce.provider.qtesla.BCqTESLAPrivateKey) obj;
        return this.getHighSpeedVideoSizes.getSecurityCategory() == bCqTESLAPrivateKey.getHighSpeedVideoSizes.getSecurityCategory() && org.bouncycastle.util.Arrays.areEqual(this.getHighSpeedVideoSizes.getSecret(), bCqTESLAPrivateKey.getHighSpeedVideoSizes.getSecret());
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public BCqTESLAPrivateKey(org.bouncycastle.pqc.crypto.qtesla.QTESLAPrivateKeyParameters qTESLAPrivateKeyParameters) {
        this.getHighSpeedVideoSizes = qTESLAPrivateKeyParameters;
    }
}
