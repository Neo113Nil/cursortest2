package org.bouncycastle.jcajce.provider.asymmetric.ecgost;

/* loaded from: classes17.dex */
public class BCECGOST3410PublicKey implements java.security.interfaces.ECPublicKey, org.bouncycastle.jce.interfaces.ECPublicKey, org.bouncycastle.jce.interfaces.ECPointEncoder {
    static final long serialVersionUID = 7026240464295649314L;
    private transient java.security.spec.ECParameterSpec Camera2StreamConfigurationMap;
    transient org.bouncycastle.crypto.params.ECPublicKeyParameters getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRanges;
    private java.lang.String getHighSpeedVideoFpsRangesFor;
    private transient org.bouncycastle.asn1.ASN1Encodable getHighSpeedVideoSizes;

    public BCECGOST3410PublicKey(java.lang.String str, org.bouncycastle.crypto.params.ECPublicKeyParameters eCPublicKeyParameters, java.security.spec.ECParameterSpec eCParameterSpec) {
        this.getHighSpeedVideoFpsRangesFor = "ECGOST3410";
        org.bouncycastle.crypto.params.ECDomainParameters parameters = eCPublicKeyParameters.getParameters();
        if (parameters instanceof org.bouncycastle.crypto.params.ECGOST3410Parameters) {
            org.bouncycastle.crypto.params.ECGOST3410Parameters eCGOST3410Parameters = (org.bouncycastle.crypto.params.ECGOST3410Parameters) parameters;
            this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters(eCGOST3410Parameters.getPublicKeyParamSet(), eCGOST3410Parameters.getDigestParamSet(), eCGOST3410Parameters.getEncryptionParamSet());
        }
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighResolutionOutputSizeshNQ4ISI = eCPublicKeyParameters;
        if (eCParameterSpec == null) {
            this.Camera2StreamConfigurationMap = new java.security.spec.ECParameterSpec(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(parameters.getG()), parameters.getN(), parameters.getH().intValue());
        } else {
            this.Camera2StreamConfigurationMap = eCParameterSpec;
        }
    }

    public BCECGOST3410PublicKey(java.lang.String str, org.bouncycastle.crypto.params.ECPublicKeyParameters eCPublicKeyParameters, org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpec) {
        this.getHighSpeedVideoFpsRangesFor = "ECGOST3410";
        org.bouncycastle.crypto.params.ECDomainParameters parameters = eCPublicKeyParameters.getParameters();
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighResolutionOutputSizeshNQ4ISI = eCPublicKeyParameters;
        this.Camera2StreamConfigurationMap = eCParameterSpec == null ? new java.security.spec.ECParameterSpec(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(parameters.getG()), parameters.getN(), parameters.getH().intValue()) : org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(eCParameterSpec.getCurve(), eCParameterSpec.getSeed()), eCParameterSpec);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof org.bouncycastle.jcajce.provider.asymmetric.ecgost.BCECGOST3410PublicKey)) {
            return false;
        }
        org.bouncycastle.jcajce.provider.asymmetric.ecgost.BCECGOST3410PublicKey bCECGOST3410PublicKey = (org.bouncycastle.jcajce.provider.asymmetric.ecgost.BCECGOST3410PublicKey) obj;
        if (this.getHighResolutionOutputSizeshNQ4ISI.getQ().equals(bCECGOST3410PublicKey.getHighResolutionOutputSizeshNQ4ISI.getQ())) {
            java.security.spec.ECParameterSpec eCParameterSpec = this.Camera2StreamConfigurationMap;
            org.bouncycastle.jce.spec.ECParameterSpec convertSpec = eCParameterSpec != null ? org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(eCParameterSpec) : org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
            java.security.spec.ECParameterSpec eCParameterSpec2 = bCECGOST3410PublicKey.Camera2StreamConfigurationMap;
            if (convertSpec.equals(eCParameterSpec2 != null ? org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(eCParameterSpec2) : org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.getHighResolutionOutputSizeshNQ4ISI.getQ().hashCode();
        java.security.spec.ECParameterSpec eCParameterSpec = this.Camera2StreamConfigurationMap;
        return hashCode ^ (eCParameterSpec != null ? org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(eCParameterSpec) : org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa()).hashCode();
    }

    public java.lang.String toString() {
        java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
        org.bouncycastle.math.ec.ECPoint q = this.getHighResolutionOutputSizeshNQ4ISI.getQ();
        java.security.spec.ECParameterSpec eCParameterSpec = this.Camera2StreamConfigurationMap;
        return org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.publicKeyToString(str, q, eCParameterSpec != null ? org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(eCParameterSpec) : org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa());
    }

    @Override // org.bouncycastle.jce.interfaces.ECPointEncoder
    public void setPointFormat(java.lang.String str) {
        this.getHighSpeedVideoFpsRanges = !"UNCOMPRESSED".equalsIgnoreCase(str);
    }

    @Override // java.security.interfaces.ECPublicKey
    public java.security.spec.ECPoint getW() {
        return org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(this.getHighResolutionOutputSizeshNQ4ISI.getQ());
    }

    @Override // org.bouncycastle.jce.interfaces.ECPublicKey
    public org.bouncycastle.math.ec.ECPoint getQ() {
        return this.Camera2StreamConfigurationMap == null ? this.getHighResolutionOutputSizeshNQ4ISI.getQ().getDetachedPoint() : this.getHighResolutionOutputSizeshNQ4ISI.getQ();
    }

    @Override // java.security.interfaces.ECKey
    public java.security.spec.ECParameterSpec getParams() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // org.bouncycastle.jce.interfaces.ECKey
    public org.bouncycastle.jce.spec.ECParameterSpec getParameters() {
        java.security.spec.ECParameterSpec eCParameterSpec = this.Camera2StreamConfigurationMap;
        if (eCParameterSpec == null) {
            return null;
        }
        return org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(eCParameterSpec);
    }

    final org.bouncycastle.asn1.ASN1Encodable getHighSpeedVideoFpsRangesFor() {
        if (this.getHighSpeedVideoSizes == null) {
            java.security.spec.ECParameterSpec eCParameterSpec = this.Camera2StreamConfigurationMap;
            if (eCParameterSpec instanceof org.bouncycastle.jce.spec.ECNamedCurveSpec) {
                this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters(org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves.getOID(((org.bouncycastle.jce.spec.ECNamedCurveSpec) eCParameterSpec).getName()), org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411_94_CryptoProParamSet);
            }
        }
        return this.getHighSpeedVideoSizes;
    }

    @Override // java.security.Key
    public java.lang.String getFormat() {
        return "X.509";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        org.bouncycastle.asn1.ASN1Encodable highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
        if (highSpeedVideoFpsRangesFor == null) {
            java.security.spec.ECParameterSpec eCParameterSpec = this.Camera2StreamConfigurationMap;
            if (eCParameterSpec instanceof org.bouncycastle.jce.spec.ECNamedCurveSpec) {
                highSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters(org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves.getOID(((org.bouncycastle.jce.spec.ECNamedCurveSpec) eCParameterSpec).getName()), org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411_94_CryptoProParamSet);
            } else {
                org.bouncycastle.math.ec.ECCurve convertCurve = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(eCParameterSpec.getCurve());
                highSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.x9.X962Parameters(new org.bouncycastle.asn1.x9.X9ECParameters(convertCurve, new org.bouncycastle.asn1.x9.X9ECPoint(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(convertCurve, this.Camera2StreamConfigurationMap.getGenerator()), this.getHighSpeedVideoFpsRanges), this.Camera2StreamConfigurationMap.getOrder(), java.math.BigInteger.valueOf(this.Camera2StreamConfigurationMap.getCofactor()), this.Camera2StreamConfigurationMap.getCurve().getSeed()));
            }
        }
        java.math.BigInteger bigInteger = this.getHighResolutionOutputSizeshNQ4ISI.getQ().getAffineXCoord().toBigInteger();
        java.math.BigInteger bigInteger2 = this.getHighResolutionOutputSizeshNQ4ISI.getQ().getAffineYCoord().toBigInteger();
        byte[] bArr = new byte[64];
        Camera2StreamConfigurationMap(bArr, 0, bigInteger);
        Camera2StreamConfigurationMap(bArr, 32, bigInteger2);
        try {
            return org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil.getEncodedSubjectPublicKeyInfo(new org.bouncycastle.asn1.x509.SubjectPublicKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3410_2001, highSpeedVideoFpsRangesFor), new org.bouncycastle.asn1.DEROctetString(bArr)));
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public java.lang.String getAlgorithm() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        objectInputStream.defaultReadObject();
        getHighSpeedVideoSizes(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(org.bouncycastle.asn1.ASN1Primitive.fromByteArray((byte[]) objectInputStream.readObject())));
    }

    private void getHighSpeedVideoSizes(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) {
        org.bouncycastle.asn1.ASN1ObjectIdentifier publicKeyParamSet;
        org.bouncycastle.asn1.ASN1BitString publicKeyData = subjectPublicKeyInfo.getPublicKeyData();
        this.getHighSpeedVideoFpsRangesFor = "ECGOST3410";
        try {
            byte[] octets = ((org.bouncycastle.asn1.ASN1OctetString) org.bouncycastle.asn1.ASN1Primitive.fromByteArray(publicKeyData.getBytes())).getOctets();
            byte[] bArr = new byte[65];
            bArr[0] = 4;
            for (int i = 1; i <= 32; i++) {
                bArr[i] = octets[32 - i];
                bArr[i + 32] = octets[64 - i];
            }
            boolean z = subjectPublicKeyInfo.getAlgorithm().getParameters() instanceof org.bouncycastle.asn1.ASN1ObjectIdentifier;
            org.bouncycastle.asn1.ASN1Encodable parameters = subjectPublicKeyInfo.getAlgorithm().getParameters();
            if (z) {
                publicKeyParamSet = org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(parameters);
                this.getHighSpeedVideoSizes = publicKeyParamSet;
            } else {
                org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters gOST3410PublicKeyAlgParameters = org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters.getInstance(parameters);
                this.getHighSpeedVideoSizes = gOST3410PublicKeyAlgParameters;
                publicKeyParamSet = gOST3410PublicKeyAlgParameters.getPublicKeyParamSet();
            }
            org.bouncycastle.jce.spec.ECNamedCurveParameterSpec parameterSpec = org.bouncycastle.jce.ECGOST3410NamedCurveTable.getParameterSpec(org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves.getName(publicKeyParamSet));
            org.bouncycastle.math.ec.ECCurve curve = parameterSpec.getCurve();
            java.security.spec.EllipticCurve convertCurve = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(curve, parameterSpec.getSeed());
            this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.crypto.params.ECPublicKeyParameters(curve.decodePoint(bArr), org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getDomainParameters((org.bouncycastle.jcajce.provider.config.ProviderConfiguration) null, parameterSpec));
            this.Camera2StreamConfigurationMap = new org.bouncycastle.jce.spec.ECNamedCurveSpec(org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves.getName(publicKeyParamSet), convertCurve, org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(parameterSpec.getG()), parameterSpec.getN(), parameterSpec.getH());
        } catch (java.io.IOException unused) {
            throw new java.lang.IllegalArgumentException("error recovering public key");
        }
    }

    private static void Camera2StreamConfigurationMap(byte[] bArr, int i, java.math.BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length < 32) {
            byte[] bArr2 = new byte[32];
            java.lang.System.arraycopy(byteArray, 0, bArr2, 32 - byteArray.length, byteArray.length);
            byteArray = bArr2;
        }
        for (int i2 = 0; i2 != 32; i2++) {
            bArr[i + i2] = byteArray[(byteArray.length - 1) - i2];
        }
    }

    public BCECGOST3410PublicKey(org.bouncycastle.jce.spec.ECPublicKeySpec eCPublicKeySpec, org.bouncycastle.jcajce.provider.config.ProviderConfiguration providerConfiguration) {
        this.getHighSpeedVideoFpsRangesFor = "ECGOST3410";
        if (eCPublicKeySpec.getParams() == null) {
            this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.crypto.params.ECPublicKeyParameters(providerConfiguration.getEcImplicitlyCa().getCurve().createPoint(eCPublicKeySpec.getQ().getAffineXCoord().toBigInteger(), eCPublicKeySpec.getQ().getAffineYCoord().toBigInteger()), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.getDomainParameters(providerConfiguration, null));
            this.Camera2StreamConfigurationMap = null;
        } else {
            java.security.spec.EllipticCurve convertCurve = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(eCPublicKeySpec.getParams().getCurve(), eCPublicKeySpec.getParams().getSeed());
            this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.crypto.params.ECPublicKeyParameters(eCPublicKeySpec.getQ(), org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getDomainParameters(providerConfiguration, eCPublicKeySpec.getParams()));
            this.Camera2StreamConfigurationMap = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(convertCurve, eCPublicKeySpec.getParams());
        }
    }

    public BCECGOST3410PublicKey(org.bouncycastle.jcajce.provider.asymmetric.ecgost.BCECGOST3410PublicKey bCECGOST3410PublicKey) {
        this.getHighSpeedVideoFpsRangesFor = "ECGOST3410";
        this.getHighResolutionOutputSizeshNQ4ISI = bCECGOST3410PublicKey.getHighResolutionOutputSizeshNQ4ISI;
        this.Camera2StreamConfigurationMap = bCECGOST3410PublicKey.Camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRanges = bCECGOST3410PublicKey.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoSizes = bCECGOST3410PublicKey.getHighSpeedVideoSizes;
    }

    BCECGOST3410PublicKey(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) {
        this.getHighSpeedVideoFpsRangesFor = "ECGOST3410";
        getHighSpeedVideoSizes(subjectPublicKeyInfo);
    }

    public BCECGOST3410PublicKey(java.security.spec.ECPublicKeySpec eCPublicKeySpec) {
        this.getHighSpeedVideoFpsRangesFor = "ECGOST3410";
        java.security.spec.ECParameterSpec params = eCPublicKeySpec.getParams();
        this.Camera2StreamConfigurationMap = params;
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.crypto.params.ECPublicKeyParameters(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(params, eCPublicKeySpec.getW()), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.getDomainParameters(null, eCPublicKeySpec.getParams()));
    }

    public BCECGOST3410PublicKey(java.security.interfaces.ECPublicKey eCPublicKey) {
        this.getHighSpeedVideoFpsRangesFor = "ECGOST3410";
        this.getHighSpeedVideoFpsRangesFor = eCPublicKey.getAlgorithm();
        java.security.spec.ECParameterSpec params = eCPublicKey.getParams();
        this.Camera2StreamConfigurationMap = params;
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.crypto.params.ECPublicKeyParameters(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(params, eCPublicKey.getW()), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.getDomainParameters(null, eCPublicKey.getParams()));
    }

    public BCECGOST3410PublicKey(java.lang.String str, org.bouncycastle.crypto.params.ECPublicKeyParameters eCPublicKeyParameters) {
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighResolutionOutputSizeshNQ4ISI = eCPublicKeyParameters;
        this.Camera2StreamConfigurationMap = null;
    }
}
