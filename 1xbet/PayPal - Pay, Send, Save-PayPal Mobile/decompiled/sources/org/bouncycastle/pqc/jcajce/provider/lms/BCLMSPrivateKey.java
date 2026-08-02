package org.bouncycastle.pqc.jcajce.provider.lms;

/* loaded from: classes17.dex */
public class BCLMSPrivateKey implements java.security.PrivateKey, org.bouncycastle.pqc.jcajce.interfaces.LMSPrivateKey {
    private static final long serialVersionUID = 8568701712864512338L;
    transient org.bouncycastle.pqc.crypto.lms.LMSKeyParameters getHighSpeedVideoFpsRangesFor;
    private transient org.bouncycastle.asn1.ASN1Set getHighSpeedVideoSizes;

    public BCLMSPrivateKey(org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo) throws java.io.IOException {
        this.getHighSpeedVideoSizes = privateKeyInfo.getAttributes();
        this.getHighSpeedVideoFpsRangesFor = (org.bouncycastle.pqc.crypto.lms.LMSKeyParameters) org.bouncycastle.pqc.crypto.util.PrivateKeyFactory.createKey(privateKeyInfo);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        objectInputStream.defaultReadObject();
        org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo = org.bouncycastle.asn1.pkcs.PrivateKeyInfo.getInstance((byte[]) objectInputStream.readObject());
        this.getHighSpeedVideoSizes = privateKeyInfo.getAttributes();
        this.getHighSpeedVideoFpsRangesFor = (org.bouncycastle.pqc.crypto.lms.LMSKeyParameters) org.bouncycastle.pqc.crypto.util.PrivateKeyFactory.createKey(privateKeyInfo);
    }

    public int hashCode() {
        try {
            return org.bouncycastle.util.Arrays.hashCode(this.getHighSpeedVideoFpsRangesFor.getEncoded());
        } catch (java.io.IOException unused) {
            throw new java.lang.IllegalStateException("unable to calculate hashCode");
        }
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.LMSPrivateKey
    public long getUsagesRemaining() {
        org.bouncycastle.pqc.crypto.lms.LMSKeyParameters lMSKeyParameters = this.getHighSpeedVideoFpsRangesFor;
        return lMSKeyParameters instanceof org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters ? ((org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters) lMSKeyParameters).getUsagesRemaining() : ((org.bouncycastle.pqc.crypto.lms.HSSPrivateKeyParameters) lMSKeyParameters).getUsagesRemaining();
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.LMSKey
    public int getLevels() {
        org.bouncycastle.pqc.crypto.lms.LMSKeyParameters lMSKeyParameters = this.getHighSpeedVideoFpsRangesFor;
        if (lMSKeyParameters instanceof org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters) {
            return 1;
        }
        return ((org.bouncycastle.pqc.crypto.lms.HSSPrivateKeyParameters) lMSKeyParameters).getL();
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.LMSPrivateKey
    public long getIndex() {
        if (getUsagesRemaining() == 0) {
            throw new java.lang.IllegalStateException("key exhausted");
        }
        org.bouncycastle.pqc.crypto.lms.LMSKeyParameters lMSKeyParameters = this.getHighSpeedVideoFpsRangesFor;
        return lMSKeyParameters instanceof org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters ? ((org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters) lMSKeyParameters).getIndex() : ((org.bouncycastle.pqc.crypto.lms.HSSPrivateKeyParameters) lMSKeyParameters).getIndex();
    }

    @Override // java.security.Key
    public java.lang.String getFormat() {
        return "PKCS#8";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return org.bouncycastle.pqc.crypto.util.PrivateKeyInfoFactory.createPrivateKeyInfo(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes).getEncoded();
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public java.lang.String getAlgorithm() {
        return "LMS";
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.LMSPrivateKey
    public org.bouncycastle.pqc.jcajce.interfaces.LMSPrivateKey extractKeyShard(int i) {
        org.bouncycastle.pqc.crypto.lms.LMSKeyParameters lMSKeyParameters = this.getHighSpeedVideoFpsRangesFor;
        return lMSKeyParameters instanceof org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters ? new org.bouncycastle.pqc.jcajce.provider.lms.BCLMSPrivateKey(((org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters) lMSKeyParameters).extractKeyShard(i)) : new org.bouncycastle.pqc.jcajce.provider.lms.BCLMSPrivateKey(((org.bouncycastle.pqc.crypto.lms.HSSPrivateKeyParameters) lMSKeyParameters).extractKeyShard(i));
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof org.bouncycastle.pqc.jcajce.provider.lms.BCLMSPrivateKey)) {
            return false;
        }
        try {
            return org.bouncycastle.util.Arrays.areEqual(this.getHighSpeedVideoFpsRangesFor.getEncoded(), ((org.bouncycastle.pqc.jcajce.provider.lms.BCLMSPrivateKey) obj).getHighSpeedVideoFpsRangesFor.getEncoded());
        } catch (java.io.IOException unused) {
            throw new java.lang.IllegalStateException("unable to perform equals");
        }
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public BCLMSPrivateKey(org.bouncycastle.pqc.crypto.lms.LMSKeyParameters lMSKeyParameters) {
        this.getHighSpeedVideoFpsRangesFor = lMSKeyParameters;
    }
}
