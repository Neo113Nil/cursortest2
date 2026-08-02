package org.bouncycastle.jcajce.provider.asymmetric.gost;

/* loaded from: classes17.dex */
public class BCGOST3410PublicKey implements org.bouncycastle.jce.interfaces.GOST3410PublicKey {
    static final long serialVersionUID = -6251023343619275990L;
    private java.math.BigInteger Camera2StreamConfigurationMap;
    private transient org.bouncycastle.jce.interfaces.GOST3410Params getHighSpeedVideoFpsRanges;

    public java.lang.String toString() {
        try {
            return org.bouncycastle.jcajce.provider.asymmetric.gost.GOSTUtil.getHighSpeedVideoFpsRangesFor("GOST3410", this.Camera2StreamConfigurationMap, ((org.bouncycastle.crypto.params.GOST3410PublicKeyParameters) org.bouncycastle.jcajce.provider.asymmetric.util.GOST3410Util.generatePublicKeyParameter(this)).getParameters());
        } catch (java.security.InvalidKeyException e) {
            throw new java.lang.IllegalStateException(e.getMessage());
        }
    }

    public int hashCode() {
        return this.Camera2StreamConfigurationMap.hashCode() ^ this.getHighSpeedVideoFpsRanges.hashCode();
    }

    @Override // org.bouncycastle.jce.interfaces.GOST3410PublicKey
    public java.math.BigInteger getY() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // org.bouncycastle.jce.interfaces.GOST3410Key
    public org.bouncycastle.jce.interfaces.GOST3410Params getParameters() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // java.security.Key
    public java.lang.String getFormat() {
        return "X.509";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo;
        org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo2;
        byte[] byteArray = getY().toByteArray();
        int length = byteArray[0] == 0 ? byteArray.length - 1 : byteArray.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr[i] = byteArray[(byteArray.length - 1) - i];
        }
        try {
            org.bouncycastle.jce.interfaces.GOST3410Params gOST3410Params = this.getHighSpeedVideoFpsRanges;
            if (!(gOST3410Params instanceof org.bouncycastle.jce.spec.GOST3410ParameterSpec)) {
                subjectPublicKeyInfo = new org.bouncycastle.asn1.x509.SubjectPublicKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3410_94), new org.bouncycastle.asn1.DEROctetString(bArr));
            } else {
                if (gOST3410Params.getEncryptionParamSetOID() != null) {
                    subjectPublicKeyInfo2 = new org.bouncycastle.asn1.x509.SubjectPublicKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3410_94, new org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters(new org.bouncycastle.asn1.ASN1ObjectIdentifier(this.getHighSpeedVideoFpsRanges.getPublicKeyParamSetOID()), new org.bouncycastle.asn1.ASN1ObjectIdentifier(this.getHighSpeedVideoFpsRanges.getDigestParamSetOID()), new org.bouncycastle.asn1.ASN1ObjectIdentifier(this.getHighSpeedVideoFpsRanges.getEncryptionParamSetOID()))), new org.bouncycastle.asn1.DEROctetString(bArr));
                    return org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil.getEncodedSubjectPublicKeyInfo(subjectPublicKeyInfo2);
                }
                subjectPublicKeyInfo = new org.bouncycastle.asn1.x509.SubjectPublicKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3410_94, new org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters(new org.bouncycastle.asn1.ASN1ObjectIdentifier(this.getHighSpeedVideoFpsRanges.getPublicKeyParamSetOID()), new org.bouncycastle.asn1.ASN1ObjectIdentifier(this.getHighSpeedVideoFpsRanges.getDigestParamSetOID()))), new org.bouncycastle.asn1.DEROctetString(bArr));
            }
            subjectPublicKeyInfo2 = subjectPublicKeyInfo;
            return org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil.getEncodedSubjectPublicKeyInfo(subjectPublicKeyInfo2);
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public java.lang.String getAlgorithm() {
        return "GOST3410";
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof org.bouncycastle.jcajce.provider.asymmetric.gost.BCGOST3410PublicKey)) {
            return false;
        }
        org.bouncycastle.jcajce.provider.asymmetric.gost.BCGOST3410PublicKey bCGOST3410PublicKey = (org.bouncycastle.jcajce.provider.asymmetric.gost.BCGOST3410PublicKey) obj;
        return this.Camera2StreamConfigurationMap.equals(bCGOST3410PublicKey.Camera2StreamConfigurationMap) && this.getHighSpeedVideoFpsRanges.equals(bCGOST3410PublicKey.getHighSpeedVideoFpsRanges);
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        java.lang.Object a2;
        objectOutputStream.defaultWriteObject();
        if (this.getHighSpeedVideoFpsRanges.getPublicKeyParamSetOID() != null) {
            a2 = this.getHighSpeedVideoFpsRanges.getPublicKeyParamSetOID();
        } else {
            objectOutputStream.writeObject(null);
            objectOutputStream.writeObject(this.getHighSpeedVideoFpsRanges.getPublicKeyParameters().getP());
            objectOutputStream.writeObject(this.getHighSpeedVideoFpsRanges.getPublicKeyParameters().getQ());
            a2 = this.getHighSpeedVideoFpsRanges.getPublicKeyParameters().getA();
        }
        objectOutputStream.writeObject(a2);
        objectOutputStream.writeObject(this.getHighSpeedVideoFpsRanges.getDigestParamSetOID());
        objectOutputStream.writeObject(this.getHighSpeedVideoFpsRanges.getEncryptionParamSetOID());
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        objectInputStream.defaultReadObject();
        java.lang.String str = (java.lang.String) objectInputStream.readObject();
        if (str != null) {
            this.getHighSpeedVideoFpsRanges = new org.bouncycastle.jce.spec.GOST3410ParameterSpec(str, (java.lang.String) objectInputStream.readObject(), (java.lang.String) objectInputStream.readObject());
            return;
        }
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.jce.spec.GOST3410ParameterSpec(new org.bouncycastle.jce.spec.GOST3410PublicKeyParameterSetSpec((java.math.BigInteger) objectInputStream.readObject(), (java.math.BigInteger) objectInputStream.readObject(), (java.math.BigInteger) objectInputStream.readObject()));
        objectInputStream.readObject();
        objectInputStream.readObject();
    }

    BCGOST3410PublicKey(org.bouncycastle.jce.spec.GOST3410PublicKeySpec gOST3410PublicKeySpec) {
        this.Camera2StreamConfigurationMap = gOST3410PublicKeySpec.getY();
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.jce.spec.GOST3410ParameterSpec(new org.bouncycastle.jce.spec.GOST3410PublicKeyParameterSetSpec(gOST3410PublicKeySpec.getP(), gOST3410PublicKeySpec.getQ(), gOST3410PublicKeySpec.getA()));
    }

    BCGOST3410PublicKey(org.bouncycastle.jce.interfaces.GOST3410PublicKey gOST3410PublicKey) {
        this.Camera2StreamConfigurationMap = gOST3410PublicKey.getY();
        this.getHighSpeedVideoFpsRanges = gOST3410PublicKey.getParameters();
    }

    BCGOST3410PublicKey(org.bouncycastle.crypto.params.GOST3410PublicKeyParameters gOST3410PublicKeyParameters, org.bouncycastle.jce.spec.GOST3410ParameterSpec gOST3410ParameterSpec) {
        this.Camera2StreamConfigurationMap = gOST3410PublicKeyParameters.getY();
        this.getHighSpeedVideoFpsRanges = gOST3410ParameterSpec;
    }

    BCGOST3410PublicKey(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) {
        org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters gOST3410PublicKeyAlgParameters = org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters.getInstance(subjectPublicKeyInfo.getAlgorithm().getParameters());
        try {
            byte[] octets = ((org.bouncycastle.asn1.DEROctetString) subjectPublicKeyInfo.parsePublicKey()).getOctets();
            byte[] bArr = new byte[octets.length];
            for (int i = 0; i != octets.length; i++) {
                bArr[i] = octets[(octets.length - 1) - i];
            }
            this.Camera2StreamConfigurationMap = new java.math.BigInteger(1, bArr);
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.jce.spec.GOST3410ParameterSpec.fromPublicKeyAlg(gOST3410PublicKeyAlgParameters);
        } catch (java.io.IOException unused) {
            throw new java.lang.IllegalArgumentException("invalid info structure in GOST3410 public key");
        }
    }
}
