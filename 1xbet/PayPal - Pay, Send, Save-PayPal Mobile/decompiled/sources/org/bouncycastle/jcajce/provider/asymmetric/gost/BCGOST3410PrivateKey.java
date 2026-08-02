package org.bouncycastle.jcajce.provider.asymmetric.gost;

/* loaded from: classes17.dex */
public class BCGOST3410PrivateKey implements org.bouncycastle.jce.interfaces.GOST3410PrivateKey, org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier {
    static final long serialVersionUID = 8581661527592305464L;
    private transient org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
    private transient org.bouncycastle.jce.interfaces.GOST3410Params getHighSpeedVideoFpsRanges;
    private java.math.BigInteger getHighSpeedVideoSizes;

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof org.bouncycastle.jce.interfaces.GOST3410PrivateKey)) {
            return false;
        }
        org.bouncycastle.jce.interfaces.GOST3410PrivateKey gOST3410PrivateKey = (org.bouncycastle.jce.interfaces.GOST3410PrivateKey) obj;
        if (getX().equals(gOST3410PrivateKey.getX()) && getParameters().getPublicKeyParameters().equals(gOST3410PrivateKey.getParameters().getPublicKeyParameters()) && getParameters().getDigestParamSetOID().equals(gOST3410PrivateKey.getParameters().getDigestParamSetOID())) {
            java.lang.String encryptionParamSetOID = getParameters().getEncryptionParamSetOID();
            java.lang.String encryptionParamSetOID2 = gOST3410PrivateKey.getParameters().getEncryptionParamSetOID();
            if (encryptionParamSetOID == encryptionParamSetOID2) {
                return true;
            }
            if (encryptionParamSetOID != null && encryptionParamSetOID.equals(encryptionParamSetOID2)) {
                return true;
            }
        }
        return false;
    }

    public java.lang.String toString() {
        try {
            return org.bouncycastle.jcajce.provider.asymmetric.gost.GOSTUtil.getHighSpeedVideoFpsRanges("GOST3410", this.getHighSpeedVideoSizes, ((org.bouncycastle.crypto.params.GOST3410PrivateKeyParameters) org.bouncycastle.jcajce.provider.asymmetric.util.GOST3410Util.generatePrivateKeyParameter(this)).getParameters());
        } catch (java.security.InvalidKeyException e) {
            throw new java.lang.IllegalStateException(e.getMessage());
        }
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public void setBagAttribute(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.getHighResolutionOutputSizeshNQ4ISI.setBagAttribute(aSN1ObjectIdentifier, aSN1Encodable);
    }

    public int hashCode() {
        return getX().hashCode() ^ this.getHighSpeedVideoFpsRanges.hashCode();
    }

    @Override // org.bouncycastle.jce.interfaces.GOST3410PrivateKey
    public java.math.BigInteger getX() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // org.bouncycastle.jce.interfaces.GOST3410Key
    public org.bouncycastle.jce.interfaces.GOST3410Params getParameters() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // java.security.Key
    public java.lang.String getFormat() {
        return "PKCS#8";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        byte[] byteArray = getX().toByteArray();
        int length = byteArray[0] == 0 ? byteArray.length - 1 : byteArray.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr[i] = byteArray[(byteArray.length - 1) - i];
        }
        try {
            return (this.getHighSpeedVideoFpsRanges instanceof org.bouncycastle.jce.spec.GOST3410ParameterSpec ? new org.bouncycastle.asn1.pkcs.PrivateKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3410_94, new org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters(new org.bouncycastle.asn1.ASN1ObjectIdentifier(this.getHighSpeedVideoFpsRanges.getPublicKeyParamSetOID()), new org.bouncycastle.asn1.ASN1ObjectIdentifier(this.getHighSpeedVideoFpsRanges.getDigestParamSetOID()))), new org.bouncycastle.asn1.DEROctetString(bArr)) : new org.bouncycastle.asn1.pkcs.PrivateKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3410_94), new org.bouncycastle.asn1.DEROctetString(bArr))).getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public java.util.Enumeration getBagAttributeKeys() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getBagAttributeKeys();
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public org.bouncycastle.asn1.ASN1Encodable getBagAttribute(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return this.getHighResolutionOutputSizeshNQ4ISI.getBagAttribute(aSN1ObjectIdentifier);
    }

    @Override // java.security.Key
    public java.lang.String getAlgorithm() {
        return "GOST3410";
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
        } else {
            this.getHighSpeedVideoFpsRanges = new org.bouncycastle.jce.spec.GOST3410ParameterSpec(new org.bouncycastle.jce.spec.GOST3410PublicKeyParameterSetSpec((java.math.BigInteger) objectInputStream.readObject(), (java.math.BigInteger) objectInputStream.readObject(), (java.math.BigInteger) objectInputStream.readObject()));
            objectInputStream.readObject();
            objectInputStream.readObject();
        }
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
    }

    BCGOST3410PrivateKey(org.bouncycastle.jce.spec.GOST3410PrivateKeySpec gOST3410PrivateKeySpec) {
        this.getHighSpeedVideoSizes = gOST3410PrivateKeySpec.getX();
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.jce.spec.GOST3410ParameterSpec(new org.bouncycastle.jce.spec.GOST3410PublicKeyParameterSetSpec(gOST3410PrivateKeySpec.getP(), gOST3410PrivateKeySpec.getQ(), gOST3410PrivateKeySpec.getA()));
    }

    BCGOST3410PrivateKey(org.bouncycastle.jce.interfaces.GOST3410PrivateKey gOST3410PrivateKey) {
        this.getHighSpeedVideoSizes = gOST3410PrivateKey.getX();
        this.getHighSpeedVideoFpsRanges = gOST3410PrivateKey.getParameters();
    }

    BCGOST3410PrivateKey(org.bouncycastle.crypto.params.GOST3410PrivateKeyParameters gOST3410PrivateKeyParameters, org.bouncycastle.jce.spec.GOST3410ParameterSpec gOST3410ParameterSpec) {
        this.getHighSpeedVideoSizes = gOST3410PrivateKeyParameters.getX();
        this.getHighSpeedVideoFpsRanges = gOST3410ParameterSpec;
        if (gOST3410ParameterSpec == null) {
            throw new java.lang.IllegalArgumentException("spec is null");
        }
    }

    BCGOST3410PrivateKey(org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo) throws java.io.IOException {
        java.math.BigInteger bigInteger;
        org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters gOST3410PublicKeyAlgParameters = org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters.getInstance(privateKeyInfo.getPrivateKeyAlgorithm().getParameters());
        org.bouncycastle.asn1.ASN1Encodable parsePrivateKey = privateKeyInfo.parsePrivateKey();
        if (parsePrivateKey instanceof org.bouncycastle.asn1.ASN1Integer) {
            bigInteger = org.bouncycastle.asn1.ASN1Integer.getInstance(parsePrivateKey).getPositiveValue();
        } else {
            byte[] octets = org.bouncycastle.asn1.ASN1OctetString.getInstance(privateKeyInfo.parsePrivateKey()).getOctets();
            byte[] bArr = new byte[octets.length];
            for (int i = 0; i != octets.length; i++) {
                bArr[i] = octets[(octets.length - 1) - i];
            }
            bigInteger = new java.math.BigInteger(1, bArr);
        }
        this.getHighSpeedVideoSizes = bigInteger;
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.jce.spec.GOST3410ParameterSpec.fromPublicKeyAlg(gOST3410PublicKeyAlgParameters);
    }

    protected BCGOST3410PrivateKey() {
    }
}
