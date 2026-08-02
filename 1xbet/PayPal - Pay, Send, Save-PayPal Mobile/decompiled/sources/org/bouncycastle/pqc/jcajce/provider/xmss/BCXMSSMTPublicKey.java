package org.bouncycastle.pqc.jcajce.provider.xmss;

/* loaded from: classes17.dex */
public class BCXMSSMTPublicKey implements java.security.PublicKey, org.bouncycastle.pqc.jcajce.interfaces.XMSSMTKey {
    private static final long serialVersionUID = 3230324130542413475L;
    private transient org.bouncycastle.asn1.ASN1ObjectIdentifier getHighResolutionOutputSizeshNQ4ISI;
    transient org.bouncycastle.pqc.crypto.xmss.XMSSMTPublicKeyParameters getHighSpeedVideoFpsRanges;

    public BCXMSSMTPublicKey(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) throws java.io.IOException {
        org.bouncycastle.pqc.crypto.xmss.XMSSMTPublicKeyParameters xMSSMTPublicKeyParameters = (org.bouncycastle.pqc.crypto.xmss.XMSSMTPublicKeyParameters) org.bouncycastle.pqc.crypto.util.PublicKeyFactory.createKey(subjectPublicKeyInfo);
        this.getHighSpeedVideoFpsRanges = xMSSMTPublicKeyParameters;
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.pqc.jcajce.provider.xmss.DigestUtil.getHighResolutionOutputSizeshNQ4ISI(xMSSMTPublicKeyParameters.getTreeDigest());
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        objectInputStream.defaultReadObject();
        org.bouncycastle.pqc.crypto.xmss.XMSSMTPublicKeyParameters xMSSMTPublicKeyParameters = (org.bouncycastle.pqc.crypto.xmss.XMSSMTPublicKeyParameters) org.bouncycastle.pqc.crypto.util.PublicKeyFactory.createKey(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance((byte[]) objectInputStream.readObject()));
        this.getHighSpeedVideoFpsRanges = xMSSMTPublicKeyParameters;
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.pqc.jcajce.provider.xmss.DigestUtil.getHighResolutionOutputSizeshNQ4ISI(xMSSMTPublicKeyParameters.getTreeDigest());
    }

    public int hashCode() {
        return this.getHighResolutionOutputSizeshNQ4ISI.hashCode() + (org.bouncycastle.util.Arrays.hashCode(this.getHighSpeedVideoFpsRanges.toByteArray()) * 37);
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.XMSSMTKey
    public java.lang.String getTreeDigest() {
        return org.bouncycastle.pqc.jcajce.provider.xmss.DigestUtil.getHighSpeedVideoFpsRangesFor(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.XMSSMTKey
    public int getLayers() {
        return this.getHighSpeedVideoFpsRanges.getParameters().getLayers();
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.XMSSMTKey
    public int getHeight() {
        return this.getHighSpeedVideoFpsRanges.getParameters().getHeight();
    }

    @Override // java.security.Key
    public java.lang.String getFormat() {
        return "X.509";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return org.bouncycastle.pqc.crypto.util.SubjectPublicKeyInfoFactory.createSubjectPublicKeyInfo(this.getHighSpeedVideoFpsRanges).getEncoded();
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final java.lang.String getAlgorithm() {
        return "XMSSMT";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof org.bouncycastle.pqc.jcajce.provider.xmss.BCXMSSMTPublicKey)) {
            return false;
        }
        org.bouncycastle.pqc.jcajce.provider.xmss.BCXMSSMTPublicKey bCXMSSMTPublicKey = (org.bouncycastle.pqc.jcajce.provider.xmss.BCXMSSMTPublicKey) obj;
        return this.getHighResolutionOutputSizeshNQ4ISI.equals((org.bouncycastle.asn1.ASN1Primitive) bCXMSSMTPublicKey.getHighResolutionOutputSizeshNQ4ISI) && org.bouncycastle.util.Arrays.areEqual(this.getHighSpeedVideoFpsRanges.toByteArray(), bCXMSSMTPublicKey.getHighSpeedVideoFpsRanges.toByteArray());
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public BCXMSSMTPublicKey(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.pqc.crypto.xmss.XMSSMTPublicKeyParameters xMSSMTPublicKeyParameters) {
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1ObjectIdentifier;
        this.getHighSpeedVideoFpsRanges = xMSSMTPublicKeyParameters;
    }
}
