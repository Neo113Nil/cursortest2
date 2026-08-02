package org.bouncycastle.jcajce.provider.asymmetric.edec;

/* loaded from: classes17.dex */
public class BCXDHPrivateKey implements org.bouncycastle.jcajce.interfaces.XDHPrivateKey {
    static final long serialVersionUID = 1;
    private final boolean getHighResolutionOutputSizeshNQ4ISI;
    private final byte[] getHighSpeedVideoFpsRanges;
    transient org.bouncycastle.crypto.params.AsymmetricKeyParameter getHighSpeedVideoSizes;

    public java.lang.String toString() {
        org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter = this.getHighSpeedVideoSizes;
        return org.bouncycastle.jcajce.provider.asymmetric.edec.Utils.getHighSpeedVideoSizes("Private Key", getAlgorithm(), asymmetricKeyParameter instanceof org.bouncycastle.crypto.params.X448PrivateKeyParameters ? ((org.bouncycastle.crypto.params.X448PrivateKeyParameters) asymmetricKeyParameter).generatePublicKey() : ((org.bouncycastle.crypto.params.X25519PrivateKeyParameters) asymmetricKeyParameter).generatePublicKey());
    }

    public int hashCode() {
        return org.bouncycastle.util.Arrays.hashCode(getEncoded());
    }

    @Override // org.bouncycastle.jcajce.interfaces.XDHPrivateKey
    public org.bouncycastle.jcajce.interfaces.XDHPublicKey getPublicKey() {
        org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter = this.getHighSpeedVideoSizes;
        return asymmetricKeyParameter instanceof org.bouncycastle.crypto.params.X448PrivateKeyParameters ? new org.bouncycastle.jcajce.provider.asymmetric.edec.BCXDHPublicKey(((org.bouncycastle.crypto.params.X448PrivateKeyParameters) asymmetricKeyParameter).generatePublicKey()) : new org.bouncycastle.jcajce.provider.asymmetric.edec.BCXDHPublicKey(((org.bouncycastle.crypto.params.X25519PrivateKeyParameters) asymmetricKeyParameter).generatePublicKey());
    }

    @Override // java.security.Key
    public java.lang.String getFormat() {
        return "PKCS#8";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            org.bouncycastle.asn1.ASN1Set aSN1Set = org.bouncycastle.asn1.ASN1Set.getInstance(this.getHighSpeedVideoFpsRanges);
            org.bouncycastle.asn1.pkcs.PrivateKeyInfo createPrivateKeyInfo = org.bouncycastle.crypto.util.PrivateKeyInfoFactory.createPrivateKeyInfo(this.getHighSpeedVideoSizes, aSN1Set);
            return (!this.getHighResolutionOutputSizeshNQ4ISI || org.bouncycastle.util.Properties.isOverrideSet("org.bouncycastle.pkcs8.v1_info_only")) ? new org.bouncycastle.asn1.pkcs.PrivateKeyInfo(createPrivateKeyInfo.getPrivateKeyAlgorithm(), createPrivateKeyInfo.parsePrivateKey(), aSN1Set).getEncoded() : createPrivateKeyInfo.getEncoded();
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public java.lang.String getAlgorithm() {
        return this.getHighSpeedVideoSizes instanceof org.bouncycastle.crypto.params.X448PrivateKeyParameters ? "X448" : "X25519";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof java.security.PrivateKey) {
            return org.bouncycastle.util.Arrays.areEqual(((java.security.PrivateKey) obj).getEncoded(), getEncoded());
        }
        return false;
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        objectInputStream.defaultReadObject();
        getHighSpeedVideoSizes(org.bouncycastle.asn1.pkcs.PrivateKeyInfo.getInstance((byte[]) objectInputStream.readObject()));
    }

    private void getHighSpeedVideoSizes(org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo) throws java.io.IOException {
        byte[] octets = privateKeyInfo.getPrivateKey().getOctets();
        if (octets.length != 32 && octets.length != 56) {
            octets = org.bouncycastle.asn1.ASN1OctetString.getInstance(privateKeyInfo.parsePrivateKey()).getOctets();
        }
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_X448.equals((org.bouncycastle.asn1.ASN1Primitive) privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm()) ? new org.bouncycastle.crypto.params.X448PrivateKeyParameters(octets) : new org.bouncycastle.crypto.params.X25519PrivateKeyParameters(octets);
    }

    BCXDHPrivateKey(org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter) {
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        this.getHighSpeedVideoFpsRanges = null;
        this.getHighSpeedVideoSizes = asymmetricKeyParameter;
    }

    BCXDHPrivateKey(org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo) throws java.io.IOException {
        this.getHighResolutionOutputSizeshNQ4ISI = privateKeyInfo.hasPublicKey();
        this.getHighSpeedVideoFpsRanges = privateKeyInfo.getAttributes() != null ? privateKeyInfo.getAttributes().getEncoded() : null;
        getHighSpeedVideoSizes(privateKeyInfo);
    }
}
