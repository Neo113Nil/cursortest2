package org.bouncycastle.pqc.jcajce.provider.xmss;

/* loaded from: classes17.dex */
public class BCXMSSMTPrivateKey implements java.security.PrivateKey, org.bouncycastle.pqc.jcajce.interfaces.XMSSMTPrivateKey {
    private static final long serialVersionUID = 7682140473044521395L;
    private transient org.bouncycastle.asn1.ASN1Set getHighResolutionOutputSizeshNQ4ISI;
    transient org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters getHighSpeedVideoFpsRanges;
    transient org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoFpsRangesFor;

    public int hashCode() {
        return this.getHighSpeedVideoFpsRangesFor.hashCode() + (org.bouncycastle.util.Arrays.hashCode(this.getHighSpeedVideoFpsRanges.toByteArray()) * 37);
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.XMSSMTPrivateKey
    public long getUsagesRemaining() {
        return this.getHighSpeedVideoFpsRanges.getUsagesRemaining();
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.XMSSMTKey
    public java.lang.String getTreeDigest() {
        return org.bouncycastle.pqc.jcajce.provider.xmss.DigestUtil.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.XMSSMTKey
    public int getLayers() {
        return this.getHighSpeedVideoFpsRanges.getParameters().getLayers();
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.XMSSMTPrivateKey
    public long getIndex() {
        if (getUsagesRemaining() != 0) {
            return this.getHighSpeedVideoFpsRanges.getIndex();
        }
        throw new java.lang.IllegalStateException("key exhausted");
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.XMSSMTKey
    public int getHeight() {
        return this.getHighSpeedVideoFpsRanges.getParameters().getHeight();
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
    public java.lang.String getAlgorithm() {
        return "XMSSMT";
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.XMSSMTPrivateKey
    public org.bouncycastle.pqc.jcajce.interfaces.XMSSMTPrivateKey extractKeyShard(int i) {
        return new org.bouncycastle.pqc.jcajce.provider.xmss.BCXMSSMTPrivateKey(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges.extractKeyShard(i));
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof org.bouncycastle.pqc.jcajce.provider.xmss.BCXMSSMTPrivateKey)) {
            return false;
        }
        org.bouncycastle.pqc.jcajce.provider.xmss.BCXMSSMTPrivateKey bCXMSSMTPrivateKey = (org.bouncycastle.pqc.jcajce.provider.xmss.BCXMSSMTPrivateKey) obj;
        return this.getHighSpeedVideoFpsRangesFor.equals((org.bouncycastle.asn1.ASN1Primitive) bCXMSSMTPrivateKey.getHighSpeedVideoFpsRangesFor) && org.bouncycastle.util.Arrays.areEqual(this.getHighSpeedVideoFpsRanges.toByteArray(), bCXMSSMTPrivateKey.getHighSpeedVideoFpsRanges.toByteArray());
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        objectInputStream.defaultReadObject();
        getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.pkcs.PrivateKeyInfo.getInstance((byte[]) objectInputStream.readObject()));
    }

    private void getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo) throws java.io.IOException {
        this.getHighResolutionOutputSizeshNQ4ISI = privateKeyInfo.getAttributes();
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.pqc.asn1.XMSSMTKeyParams.getInstance(privateKeyInfo.getPrivateKeyAlgorithm().getParameters()).getTreeDigest().getAlgorithm();
        this.getHighSpeedVideoFpsRanges = (org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters) org.bouncycastle.pqc.crypto.util.PrivateKeyFactory.createKey(privateKeyInfo);
    }

    public BCXMSSMTPrivateKey(org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo) throws java.io.IOException {
        getHighSpeedVideoFpsRangesFor(privateKeyInfo);
    }

    public BCXMSSMTPrivateKey(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters xMSSMTPrivateKeyParameters) {
        this.getHighSpeedVideoFpsRangesFor = aSN1ObjectIdentifier;
        this.getHighSpeedVideoFpsRanges = xMSSMTPrivateKeyParameters;
    }
}
