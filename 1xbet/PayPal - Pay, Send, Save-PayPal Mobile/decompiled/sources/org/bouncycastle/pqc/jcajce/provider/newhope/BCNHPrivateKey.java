package org.bouncycastle.pqc.jcajce.provider.newhope;

/* loaded from: classes17.dex */
public class BCNHPrivateKey implements org.bouncycastle.pqc.jcajce.interfaces.NHPrivateKey {
    private static final long serialVersionUID = 1;
    private transient org.bouncycastle.asn1.ASN1Set getHighResolutionOutputSizeshNQ4ISI;
    transient org.bouncycastle.pqc.crypto.newhope.NHPrivateKeyParameters getHighSpeedVideoFpsRanges;

    public BCNHPrivateKey(org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo) throws java.io.IOException {
        this.getHighResolutionOutputSizeshNQ4ISI = privateKeyInfo.getAttributes();
        this.getHighSpeedVideoFpsRanges = (org.bouncycastle.pqc.crypto.newhope.NHPrivateKeyParameters) org.bouncycastle.pqc.crypto.util.PrivateKeyFactory.createKey(privateKeyInfo);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        objectInputStream.defaultReadObject();
        org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo = org.bouncycastle.asn1.pkcs.PrivateKeyInfo.getInstance((byte[]) objectInputStream.readObject());
        this.getHighResolutionOutputSizeshNQ4ISI = privateKeyInfo.getAttributes();
        this.getHighSpeedVideoFpsRanges = (org.bouncycastle.pqc.crypto.newhope.NHPrivateKeyParameters) org.bouncycastle.pqc.crypto.util.PrivateKeyFactory.createKey(privateKeyInfo);
    }

    public int hashCode() {
        return org.bouncycastle.util.Arrays.hashCode(this.getHighSpeedVideoFpsRanges.getSecData());
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.NHPrivateKey
    public short[] getSecretData() {
        return this.getHighSpeedVideoFpsRanges.getSecData();
    }

    @Override // java.security.Key
    public java.lang.String getFormat() {
        return "PKCS#8";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return org.bouncycastle.pqc.crypto.util.PrivateKeyInfoFactory.createPrivateKeyInfo(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI).getEncoded();
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final java.lang.String getAlgorithm() {
        return "NH";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.pqc.jcajce.provider.newhope.BCNHPrivateKey) {
            return org.bouncycastle.util.Arrays.areEqual(this.getHighSpeedVideoFpsRanges.getSecData(), ((org.bouncycastle.pqc.jcajce.provider.newhope.BCNHPrivateKey) obj).getHighSpeedVideoFpsRanges.getSecData());
        }
        return false;
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public BCNHPrivateKey(org.bouncycastle.pqc.crypto.newhope.NHPrivateKeyParameters nHPrivateKeyParameters) {
        this.getHighSpeedVideoFpsRanges = nHPrivateKeyParameters;
    }
}
