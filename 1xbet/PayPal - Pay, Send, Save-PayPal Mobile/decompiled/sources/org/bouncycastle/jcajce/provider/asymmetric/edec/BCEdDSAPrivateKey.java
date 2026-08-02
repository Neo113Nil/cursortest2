package org.bouncycastle.jcajce.provider.asymmetric.edec;

/* loaded from: classes17.dex */
public class BCEdDSAPrivateKey implements org.bouncycastle.jcajce.interfaces.EdDSAPrivateKey {
    static final long serialVersionUID = 1;
    private final boolean getHighSpeedVideoFpsRanges;
    private final byte[] getHighSpeedVideoFpsRangesFor;
    transient org.bouncycastle.crypto.params.AsymmetricKeyParameter getHighSpeedVideoSizes;

    public java.lang.String toString() {
        org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter = this.getHighSpeedVideoSizes;
        return org.bouncycastle.jcajce.provider.asymmetric.edec.Utils.getHighSpeedVideoSizes("Private Key", getAlgorithm(), asymmetricKeyParameter instanceof org.bouncycastle.crypto.params.Ed448PrivateKeyParameters ? ((org.bouncycastle.crypto.params.Ed448PrivateKeyParameters) asymmetricKeyParameter).generatePublicKey() : ((org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters) asymmetricKeyParameter).generatePublicKey());
    }

    public int hashCode() {
        return org.bouncycastle.util.Arrays.hashCode(getEncoded());
    }

    @Override // org.bouncycastle.jcajce.interfaces.EdDSAPrivateKey
    public org.bouncycastle.jcajce.interfaces.EdDSAPublicKey getPublicKey() {
        org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter = this.getHighSpeedVideoSizes;
        return asymmetricKeyParameter instanceof org.bouncycastle.crypto.params.Ed448PrivateKeyParameters ? new org.bouncycastle.jcajce.provider.asymmetric.edec.BCEdDSAPublicKey(((org.bouncycastle.crypto.params.Ed448PrivateKeyParameters) asymmetricKeyParameter).generatePublicKey()) : new org.bouncycastle.jcajce.provider.asymmetric.edec.BCEdDSAPublicKey(((org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters) asymmetricKeyParameter).generatePublicKey());
    }

    @Override // java.security.Key
    public java.lang.String getFormat() {
        return "PKCS#8";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            org.bouncycastle.asn1.ASN1Set aSN1Set = org.bouncycastle.asn1.ASN1Set.getInstance(this.getHighSpeedVideoFpsRangesFor);
            org.bouncycastle.asn1.pkcs.PrivateKeyInfo createPrivateKeyInfo = org.bouncycastle.crypto.util.PrivateKeyInfoFactory.createPrivateKeyInfo(this.getHighSpeedVideoSizes, aSN1Set);
            return (!this.getHighSpeedVideoFpsRanges || org.bouncycastle.util.Properties.isOverrideSet("org.bouncycastle.pkcs8.v1_info_only")) ? new org.bouncycastle.asn1.pkcs.PrivateKeyInfo(createPrivateKeyInfo.getPrivateKeyAlgorithm(), createPrivateKeyInfo.parsePrivateKey(), aSN1Set).getEncoded() : createPrivateKeyInfo.getEncoded();
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public java.lang.String getAlgorithm() {
        return this.getHighSpeedVideoSizes instanceof org.bouncycastle.crypto.params.Ed448PrivateKeyParameters ? "Ed448" : "Ed25519";
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
        Camera2StreamConfigurationMap(org.bouncycastle.asn1.pkcs.PrivateKeyInfo.getInstance((byte[]) objectInputStream.readObject()));
    }

    private void Camera2StreamConfigurationMap(org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo) throws java.io.IOException {
        byte[] octets = org.bouncycastle.asn1.ASN1OctetString.getInstance(privateKeyInfo.parsePrivateKey()).getOctets();
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_Ed448.equals((org.bouncycastle.asn1.ASN1Primitive) privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm()) ? new org.bouncycastle.crypto.params.Ed448PrivateKeyParameters(octets) : new org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters(octets);
    }

    BCEdDSAPrivateKey(org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter) {
        this.getHighSpeedVideoFpsRanges = true;
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighSpeedVideoSizes = asymmetricKeyParameter;
    }

    BCEdDSAPrivateKey(org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo) throws java.io.IOException {
        this.getHighSpeedVideoFpsRanges = privateKeyInfo.hasPublicKey();
        this.getHighSpeedVideoFpsRangesFor = privateKeyInfo.getAttributes() != null ? privateKeyInfo.getAttributes().getEncoded() : null;
        Camera2StreamConfigurationMap(privateKeyInfo);
    }
}
