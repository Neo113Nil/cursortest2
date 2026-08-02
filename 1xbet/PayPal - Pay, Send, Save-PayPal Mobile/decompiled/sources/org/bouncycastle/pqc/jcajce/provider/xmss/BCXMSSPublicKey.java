package org.bouncycastle.pqc.jcajce.provider.xmss;

/* loaded from: classes17.dex */
public class BCXMSSPublicKey implements java.security.PublicKey, org.bouncycastle.pqc.jcajce.interfaces.XMSSKey {
    private static final long serialVersionUID = -5617456225328969766L;
    private transient org.bouncycastle.asn1.ASN1ObjectIdentifier Camera2StreamConfigurationMap;
    transient org.bouncycastle.pqc.crypto.xmss.XMSSPublicKeyParameters getHighSpeedVideoSizes;

    public BCXMSSPublicKey(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) throws java.io.IOException {
        org.bouncycastle.pqc.crypto.xmss.XMSSPublicKeyParameters xMSSPublicKeyParameters = (org.bouncycastle.pqc.crypto.xmss.XMSSPublicKeyParameters) org.bouncycastle.pqc.crypto.util.PublicKeyFactory.createKey(subjectPublicKeyInfo);
        this.getHighSpeedVideoSizes = xMSSPublicKeyParameters;
        this.Camera2StreamConfigurationMap = org.bouncycastle.pqc.jcajce.provider.xmss.DigestUtil.getHighResolutionOutputSizeshNQ4ISI(xMSSPublicKeyParameters.getTreeDigest());
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        objectInputStream.defaultReadObject();
        org.bouncycastle.pqc.crypto.xmss.XMSSPublicKeyParameters xMSSPublicKeyParameters = (org.bouncycastle.pqc.crypto.xmss.XMSSPublicKeyParameters) org.bouncycastle.pqc.crypto.util.PublicKeyFactory.createKey(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance((byte[]) objectInputStream.readObject()));
        this.getHighSpeedVideoSizes = xMSSPublicKeyParameters;
        this.Camera2StreamConfigurationMap = org.bouncycastle.pqc.jcajce.provider.xmss.DigestUtil.getHighResolutionOutputSizeshNQ4ISI(xMSSPublicKeyParameters.getTreeDigest());
    }

    public int hashCode() {
        try {
            return this.Camera2StreamConfigurationMap.hashCode() + (org.bouncycastle.util.Arrays.hashCode(this.getHighSpeedVideoSizes.getEncoded()) * 37);
        } catch (java.io.IOException unused) {
            return this.Camera2StreamConfigurationMap.hashCode();
        }
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.XMSSKey
    public java.lang.String getTreeDigest() {
        return org.bouncycastle.pqc.jcajce.provider.xmss.DigestUtil.getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap);
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.XMSSKey
    public int getHeight() {
        return this.getHighSpeedVideoSizes.getParameters().getHeight();
    }

    @Override // java.security.Key
    public java.lang.String getFormat() {
        return "X.509";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return org.bouncycastle.pqc.crypto.util.SubjectPublicKeyInfoFactory.createSubjectPublicKeyInfo(this.getHighSpeedVideoSizes).getEncoded();
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final java.lang.String getAlgorithm() {
        return "XMSS";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof org.bouncycastle.pqc.jcajce.provider.xmss.BCXMSSPublicKey)) {
            return false;
        }
        org.bouncycastle.pqc.jcajce.provider.xmss.BCXMSSPublicKey bCXMSSPublicKey = (org.bouncycastle.pqc.jcajce.provider.xmss.BCXMSSPublicKey) obj;
        try {
            if (this.Camera2StreamConfigurationMap.equals((org.bouncycastle.asn1.ASN1Primitive) bCXMSSPublicKey.Camera2StreamConfigurationMap)) {
                return org.bouncycastle.util.Arrays.areEqual(this.getHighSpeedVideoSizes.getEncoded(), bCXMSSPublicKey.getHighSpeedVideoSizes.getEncoded());
            }
            return false;
        } catch (java.io.IOException unused) {
            return false;
        }
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public BCXMSSPublicKey(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.pqc.crypto.xmss.XMSSPublicKeyParameters xMSSPublicKeyParameters) {
        this.Camera2StreamConfigurationMap = aSN1ObjectIdentifier;
        this.getHighSpeedVideoSizes = xMSSPublicKeyParameters;
    }
}
