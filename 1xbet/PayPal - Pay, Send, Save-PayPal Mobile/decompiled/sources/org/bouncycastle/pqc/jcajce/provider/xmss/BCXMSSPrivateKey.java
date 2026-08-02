package org.bouncycastle.pqc.jcajce.provider.xmss;

/* loaded from: classes17.dex */
public class BCXMSSPrivateKey implements java.security.PrivateKey, org.bouncycastle.pqc.jcajce.interfaces.XMSSPrivateKey {
    private static final long serialVersionUID = 8568701712864512338L;
    transient org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters Camera2StreamConfigurationMap;
    private transient org.bouncycastle.asn1.ASN1Set getHighSpeedVideoFpsRangesFor;
    transient org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoSizes;

    public int hashCode() {
        return this.getHighSpeedVideoSizes.hashCode() + (org.bouncycastle.util.Arrays.hashCode(this.Camera2StreamConfigurationMap.toByteArray()) * 37);
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.XMSSPrivateKey
    public long getUsagesRemaining() {
        return this.Camera2StreamConfigurationMap.getUsagesRemaining();
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.XMSSKey
    public java.lang.String getTreeDigest() {
        return org.bouncycastle.pqc.jcajce.provider.xmss.DigestUtil.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes);
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.XMSSPrivateKey
    public long getIndex() {
        if (getUsagesRemaining() != 0) {
            return this.Camera2StreamConfigurationMap.getIndex();
        }
        throw new java.lang.IllegalStateException("key exhausted");
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.XMSSKey
    public int getHeight() {
        return this.Camera2StreamConfigurationMap.getParameters().getHeight();
    }

    @Override // java.security.Key
    public java.lang.String getFormat() {
        return "PKCS#8";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return org.bouncycastle.pqc.crypto.util.PrivateKeyInfoFactory.createPrivateKeyInfo(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor).getEncoded();
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public java.lang.String getAlgorithm() {
        return "XMSS";
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.XMSSPrivateKey
    public org.bouncycastle.pqc.jcajce.interfaces.XMSSPrivateKey extractKeyShard(int i) {
        return new org.bouncycastle.pqc.jcajce.provider.xmss.BCXMSSPrivateKey(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap.extractKeyShard(i));
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof org.bouncycastle.pqc.jcajce.provider.xmss.BCXMSSPrivateKey)) {
            return false;
        }
        org.bouncycastle.pqc.jcajce.provider.xmss.BCXMSSPrivateKey bCXMSSPrivateKey = (org.bouncycastle.pqc.jcajce.provider.xmss.BCXMSSPrivateKey) obj;
        return this.getHighSpeedVideoSizes.equals((org.bouncycastle.asn1.ASN1Primitive) bCXMSSPrivateKey.getHighSpeedVideoSizes) && org.bouncycastle.util.Arrays.areEqual(this.Camera2StreamConfigurationMap.toByteArray(), bCXMSSPrivateKey.Camera2StreamConfigurationMap.toByteArray());
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        objectInputStream.defaultReadObject();
        Camera2StreamConfigurationMap(org.bouncycastle.asn1.pkcs.PrivateKeyInfo.getInstance((byte[]) objectInputStream.readObject()));
    }

    private void Camera2StreamConfigurationMap(org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo) throws java.io.IOException {
        this.getHighSpeedVideoFpsRangesFor = privateKeyInfo.getAttributes();
        this.getHighSpeedVideoSizes = org.bouncycastle.pqc.asn1.XMSSKeyParams.getInstance(privateKeyInfo.getPrivateKeyAlgorithm().getParameters()).getTreeDigest().getAlgorithm();
        this.Camera2StreamConfigurationMap = (org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters) org.bouncycastle.pqc.crypto.util.PrivateKeyFactory.createKey(privateKeyInfo);
    }

    public BCXMSSPrivateKey(org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo) throws java.io.IOException {
        Camera2StreamConfigurationMap(privateKeyInfo);
    }

    public BCXMSSPrivateKey(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters xMSSPrivateKeyParameters) {
        this.getHighSpeedVideoSizes = aSN1ObjectIdentifier;
        this.Camera2StreamConfigurationMap = xMSSPrivateKeyParameters;
    }
}
