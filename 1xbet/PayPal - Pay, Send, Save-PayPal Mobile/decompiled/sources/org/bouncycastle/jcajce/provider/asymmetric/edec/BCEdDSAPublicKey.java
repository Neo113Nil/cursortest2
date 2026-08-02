package org.bouncycastle.jcajce.provider.asymmetric.edec;

/* loaded from: classes17.dex */
public class BCEdDSAPublicKey implements org.bouncycastle.jcajce.interfaces.EdDSAPublicKey {
    static final long serialVersionUID = 1;
    transient org.bouncycastle.crypto.params.AsymmetricKeyParameter getHighSpeedVideoFpsRanges;

    public java.lang.String toString() {
        return org.bouncycastle.jcajce.provider.asymmetric.edec.Utils.getHighSpeedVideoSizes("Public Key", getAlgorithm(), this.getHighSpeedVideoFpsRanges);
    }

    public int hashCode() {
        return org.bouncycastle.util.Arrays.hashCode(getEncoded());
    }

    @Override // org.bouncycastle.jcajce.interfaces.EdDSAPublicKey
    public byte[] getPointEncoding() {
        org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter = this.getHighSpeedVideoFpsRanges;
        return asymmetricKeyParameter instanceof org.bouncycastle.crypto.params.Ed448PublicKeyParameters ? ((org.bouncycastle.crypto.params.Ed448PublicKeyParameters) asymmetricKeyParameter).getEncoded() : ((org.bouncycastle.crypto.params.Ed25519PublicKeyParameters) asymmetricKeyParameter).getEncoded();
    }

    @Override // java.security.Key
    public java.lang.String getFormat() {
        return "X.509";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        if (this.getHighSpeedVideoFpsRanges instanceof org.bouncycastle.crypto.params.Ed448PublicKeyParameters) {
            byte[] bArr = new byte[org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi.getHighSpeedVideoFpsRangesFor.length + 57];
            java.lang.System.arraycopy(org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi.getHighSpeedVideoFpsRangesFor, 0, bArr, 0, org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi.getHighSpeedVideoFpsRangesFor.length);
            ((org.bouncycastle.crypto.params.Ed448PublicKeyParameters) this.getHighSpeedVideoFpsRanges).encode(bArr, org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi.getHighSpeedVideoFpsRangesFor.length);
            return bArr;
        }
        byte[] bArr2 = new byte[org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi.getHighResolutionOutputSizeshNQ4ISI.length + 32];
        java.lang.System.arraycopy(org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi.getHighResolutionOutputSizeshNQ4ISI, 0, bArr2, 0, org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi.getHighResolutionOutputSizeshNQ4ISI.length);
        ((org.bouncycastle.crypto.params.Ed25519PublicKeyParameters) this.getHighSpeedVideoFpsRanges).encode(bArr2, org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi.getHighResolutionOutputSizeshNQ4ISI.length);
        return bArr2;
    }

    @Override // java.security.Key
    public java.lang.String getAlgorithm() {
        return this.getHighSpeedVideoFpsRanges instanceof org.bouncycastle.crypto.params.Ed448PublicKeyParameters ? "Ed448" : "Ed25519";
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
        getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance((byte[]) objectInputStream.readObject()));
    }

    private void getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) {
        byte[] octets = subjectPublicKeyInfo.getPublicKeyData().getOctets();
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_Ed448.equals((org.bouncycastle.asn1.ASN1Primitive) subjectPublicKeyInfo.getAlgorithm().getAlgorithm()) ? new org.bouncycastle.crypto.params.Ed448PublicKeyParameters(octets) : new org.bouncycastle.crypto.params.Ed25519PublicKeyParameters(octets);
    }

    BCEdDSAPublicKey(byte[] bArr, byte[] bArr2) throws java.security.spec.InvalidKeySpecException {
        org.bouncycastle.crypto.params.AsymmetricKeyParameter ed25519PublicKeyParameters;
        int length = bArr.length;
        if (!org.bouncycastle.jcajce.provider.asymmetric.edec.Utils.getHighSpeedVideoSizes(bArr, bArr2)) {
            throw new java.security.spec.InvalidKeySpecException("raw key data not recognised");
        }
        if (bArr2.length - length == 57) {
            ed25519PublicKeyParameters = new org.bouncycastle.crypto.params.Ed448PublicKeyParameters(bArr2, length);
        } else {
            if (bArr2.length - length != 32) {
                throw new java.security.spec.InvalidKeySpecException("raw key data not recognised");
            }
            ed25519PublicKeyParameters = new org.bouncycastle.crypto.params.Ed25519PublicKeyParameters(bArr2, length);
        }
        this.getHighSpeedVideoFpsRanges = ed25519PublicKeyParameters;
    }

    BCEdDSAPublicKey(org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter) {
        this.getHighSpeedVideoFpsRanges = asymmetricKeyParameter;
    }

    BCEdDSAPublicKey(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) {
        getHighSpeedVideoFpsRanges(subjectPublicKeyInfo);
    }
}
