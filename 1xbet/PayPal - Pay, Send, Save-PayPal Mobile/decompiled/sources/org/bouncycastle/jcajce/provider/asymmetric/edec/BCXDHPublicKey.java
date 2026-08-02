package org.bouncycastle.jcajce.provider.asymmetric.edec;

/* loaded from: classes17.dex */
public class BCXDHPublicKey implements org.bouncycastle.jcajce.interfaces.XDHPublicKey {
    static final long serialVersionUID = 1;
    transient org.bouncycastle.crypto.params.AsymmetricKeyParameter getHighResolutionOutputSizeshNQ4ISI;

    public java.lang.String toString() {
        return org.bouncycastle.jcajce.provider.asymmetric.edec.Utils.getHighSpeedVideoSizes("Public Key", getAlgorithm(), this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public int hashCode() {
        return org.bouncycastle.util.Arrays.hashCode(getEncoded());
    }

    @Override // org.bouncycastle.jcajce.interfaces.XDHPublicKey
    public byte[] getUEncoding() {
        org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter = this.getHighResolutionOutputSizeshNQ4ISI;
        return asymmetricKeyParameter instanceof org.bouncycastle.crypto.params.X448PublicKeyParameters ? ((org.bouncycastle.crypto.params.X448PublicKeyParameters) asymmetricKeyParameter).getEncoded() : ((org.bouncycastle.crypto.params.X25519PublicKeyParameters) asymmetricKeyParameter).getEncoded();
    }

    @Override // org.bouncycastle.jcajce.interfaces.XDHPublicKey
    public java.math.BigInteger getU() {
        byte[] uEncoding = getUEncoding();
        org.bouncycastle.util.Arrays.reverseInPlace(uEncoding);
        return new java.math.BigInteger(1, uEncoding);
    }

    @Override // java.security.Key
    public java.lang.String getFormat() {
        return "X.509";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        if (this.getHighResolutionOutputSizeshNQ4ISI instanceof org.bouncycastle.crypto.params.X448PublicKeyParameters) {
            byte[] bArr = new byte[org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi.getHighSpeedVideoFpsRanges.length + 56];
            java.lang.System.arraycopy(org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi.getHighSpeedVideoFpsRanges, 0, bArr, 0, org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi.getHighSpeedVideoFpsRanges.length);
            ((org.bouncycastle.crypto.params.X448PublicKeyParameters) this.getHighResolutionOutputSizeshNQ4ISI).encode(bArr, org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi.getHighSpeedVideoFpsRanges.length);
            return bArr;
        }
        byte[] bArr2 = new byte[org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi.getHighSpeedVideoSizes.length + 32];
        java.lang.System.arraycopy(org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi.getHighSpeedVideoSizes, 0, bArr2, 0, org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi.getHighSpeedVideoSizes.length);
        ((org.bouncycastle.crypto.params.X25519PublicKeyParameters) this.getHighResolutionOutputSizeshNQ4ISI).encode(bArr2, org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi.getHighSpeedVideoSizes.length);
        return bArr2;
    }

    @Override // java.security.Key
    public java.lang.String getAlgorithm() {
        return this.getHighResolutionOutputSizeshNQ4ISI instanceof org.bouncycastle.crypto.params.X448PublicKeyParameters ? "X448" : "X25519";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof java.security.PublicKey) {
            return org.bouncycastle.util.Arrays.areEqual(((java.security.PublicKey) obj).getEncoded(), getEncoded());
        }
        return false;
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        objectInputStream.defaultReadObject();
        getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance((byte[]) objectInputStream.readObject()));
    }

    private void getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) {
        byte[] octets = subjectPublicKeyInfo.getPublicKeyData().getOctets();
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_X448.equals((org.bouncycastle.asn1.ASN1Primitive) subjectPublicKeyInfo.getAlgorithm().getAlgorithm()) ? new org.bouncycastle.crypto.params.X448PublicKeyParameters(octets) : new org.bouncycastle.crypto.params.X25519PublicKeyParameters(octets);
    }

    BCXDHPublicKey(byte[] bArr, byte[] bArr2) throws java.security.spec.InvalidKeySpecException {
        org.bouncycastle.crypto.params.AsymmetricKeyParameter x25519PublicKeyParameters;
        int length = bArr.length;
        if (!org.bouncycastle.jcajce.provider.asymmetric.edec.Utils.getHighSpeedVideoSizes(bArr, bArr2)) {
            throw new java.security.spec.InvalidKeySpecException("raw key data not recognised");
        }
        if (bArr2.length - length == 56) {
            x25519PublicKeyParameters = new org.bouncycastle.crypto.params.X448PublicKeyParameters(bArr2, length);
        } else {
            if (bArr2.length - length != 32) {
                throw new java.security.spec.InvalidKeySpecException("raw key data not recognised");
            }
            x25519PublicKeyParameters = new org.bouncycastle.crypto.params.X25519PublicKeyParameters(bArr2, length);
        }
        this.getHighResolutionOutputSizeshNQ4ISI = x25519PublicKeyParameters;
    }

    BCXDHPublicKey(org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter) {
        this.getHighResolutionOutputSizeshNQ4ISI = asymmetricKeyParameter;
    }

    BCXDHPublicKey(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) {
        getHighResolutionOutputSizeshNQ4ISI(subjectPublicKeyInfo);
    }
}
