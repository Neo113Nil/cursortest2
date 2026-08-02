package org.bouncycastle.jcajce.provider.asymmetric.ecgost12;

/* loaded from: classes17.dex */
public class BCECGOST3410_2012PublicKey implements java.security.interfaces.ECPublicKey, org.bouncycastle.jce.interfaces.ECPublicKey, org.bouncycastle.jce.interfaces.ECPointEncoder {
    static final long serialVersionUID = 7026240464295649314L;
    private boolean Camera2StreamConfigurationMap;
    private transient org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters getHighResolutionOutputSizeshNQ4ISI;
    private transient java.security.spec.ECParameterSpec getHighSpeedVideoFpsRanges;
    private java.lang.String getHighSpeedVideoFpsRangesFor;
    transient org.bouncycastle.crypto.params.ECPublicKeyParameters getHighSpeedVideoSizes;

    public BCECGOST3410_2012PublicKey(java.lang.String str, org.bouncycastle.crypto.params.ECPublicKeyParameters eCPublicKeyParameters, java.security.spec.ECParameterSpec eCParameterSpec) {
        this.getHighSpeedVideoFpsRangesFor = "ECGOST3410-2012";
        org.bouncycastle.crypto.params.ECDomainParameters parameters = eCPublicKeyParameters.getParameters();
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoSizes = eCPublicKeyParameters;
        if (parameters instanceof org.bouncycastle.crypto.params.ECGOST3410Parameters) {
            org.bouncycastle.crypto.params.ECGOST3410Parameters eCGOST3410Parameters = (org.bouncycastle.crypto.params.ECGOST3410Parameters) parameters;
            this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters(eCGOST3410Parameters.getPublicKeyParamSet(), eCGOST3410Parameters.getDigestParamSet(), eCGOST3410Parameters.getEncryptionParamSet());
        }
        if (eCParameterSpec == null) {
            this.getHighSpeedVideoFpsRanges = new java.security.spec.ECParameterSpec(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(parameters.getG()), parameters.getN(), parameters.getH().intValue());
        } else {
            this.getHighSpeedVideoFpsRanges = eCParameterSpec;
        }
    }

    public BCECGOST3410_2012PublicKey(java.lang.String str, org.bouncycastle.crypto.params.ECPublicKeyParameters eCPublicKeyParameters, org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpec) {
        this.getHighSpeedVideoFpsRangesFor = "ECGOST3410-2012";
        org.bouncycastle.crypto.params.ECDomainParameters parameters = eCPublicKeyParameters.getParameters();
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoSizes = eCPublicKeyParameters;
        this.getHighSpeedVideoFpsRanges = eCParameterSpec == null ? new java.security.spec.ECParameterSpec(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(parameters.getG()), parameters.getN(), parameters.getH().intValue()) : org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(eCParameterSpec.getCurve(), eCParameterSpec.getSeed()), eCParameterSpec);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof org.bouncycastle.jcajce.provider.asymmetric.ecgost12.BCECGOST3410_2012PublicKey)) {
            return false;
        }
        org.bouncycastle.jcajce.provider.asymmetric.ecgost12.BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey = (org.bouncycastle.jcajce.provider.asymmetric.ecgost12.BCECGOST3410_2012PublicKey) obj;
        if (this.getHighSpeedVideoSizes.getQ().equals(bCECGOST3410_2012PublicKey.getHighSpeedVideoSizes.getQ())) {
            java.security.spec.ECParameterSpec eCParameterSpec = this.getHighSpeedVideoFpsRanges;
            org.bouncycastle.jce.spec.ECParameterSpec convertSpec = eCParameterSpec != null ? org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(eCParameterSpec) : org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
            java.security.spec.ECParameterSpec eCParameterSpec2 = bCECGOST3410_2012PublicKey.getHighSpeedVideoFpsRanges;
            if (convertSpec.equals(eCParameterSpec2 != null ? org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(eCParameterSpec2) : org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.getHighSpeedVideoSizes.getQ().hashCode();
        java.security.spec.ECParameterSpec eCParameterSpec = this.getHighSpeedVideoFpsRanges;
        return hashCode ^ (eCParameterSpec != null ? org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(eCParameterSpec) : org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa()).hashCode();
    }

    public java.lang.String toString() {
        java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
        org.bouncycastle.math.ec.ECPoint q = this.getHighSpeedVideoSizes.getQ();
        java.security.spec.ECParameterSpec eCParameterSpec = this.getHighSpeedVideoFpsRanges;
        return org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.publicKeyToString(str, q, eCParameterSpec != null ? org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(eCParameterSpec) : org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa());
    }

    @Override // org.bouncycastle.jce.interfaces.ECPointEncoder
    public void setPointFormat(java.lang.String str) {
        this.Camera2StreamConfigurationMap = !"UNCOMPRESSED".equalsIgnoreCase(str);
    }

    @Override // java.security.interfaces.ECPublicKey
    public java.security.spec.ECPoint getW() {
        return org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(this.getHighSpeedVideoSizes.getQ());
    }

    @Override // org.bouncycastle.jce.interfaces.ECPublicKey
    public org.bouncycastle.math.ec.ECPoint getQ() {
        return this.getHighSpeedVideoFpsRanges == null ? this.getHighSpeedVideoSizes.getQ().getDetachedPoint() : this.getHighSpeedVideoSizes.getQ();
    }

    @Override // java.security.interfaces.ECKey
    public java.security.spec.ECParameterSpec getParams() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // org.bouncycastle.jce.interfaces.ECKey
    public org.bouncycastle.jce.spec.ECParameterSpec getParameters() {
        java.security.spec.ECParameterSpec eCParameterSpec = this.getHighSpeedVideoFpsRanges;
        if (eCParameterSpec == null) {
            return null;
        }
        return org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(eCParameterSpec);
    }

    public org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters getGostParams() {
        if (this.getHighResolutionOutputSizeshNQ4ISI == null && (this.getHighSpeedVideoFpsRanges instanceof org.bouncycastle.jce.spec.ECNamedCurveSpec)) {
            this.getHighResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoSizes.getQ().getAffineXCoord().toBigInteger().bitLength() > 256 ? new org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters(org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves.getOID(((org.bouncycastle.jce.spec.ECNamedCurveSpec) this.getHighSpeedVideoFpsRanges).getName()), org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3411_12_512) : new org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters(org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves.getOID(((org.bouncycastle.jce.spec.ECNamedCurveSpec) this.getHighSpeedVideoFpsRanges).getName()), org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3411_12_256);
        }
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // java.security.Key
    public java.lang.String getFormat() {
        return "X.509";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier;
        int i;
        java.math.BigInteger bigInteger = this.getHighSpeedVideoSizes.getQ().getAffineXCoord().toBigInteger();
        java.math.BigInteger bigInteger2 = this.getHighSpeedVideoSizes.getQ().getAffineYCoord().toBigInteger();
        boolean z = bigInteger.bitLength() > 256;
        org.bouncycastle.asn1.ASN1Encodable gostParams = getGostParams();
        if (gostParams == null) {
            java.security.spec.ECParameterSpec eCParameterSpec = this.getHighSpeedVideoFpsRanges;
            if (eCParameterSpec instanceof org.bouncycastle.jce.spec.ECNamedCurveSpec) {
                gostParams = new org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters(org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves.getOID(((org.bouncycastle.jce.spec.ECNamedCurveSpec) eCParameterSpec).getName()), z ? org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3411_12_512 : org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3411_12_256);
            } else {
                org.bouncycastle.math.ec.ECCurve convertCurve = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(eCParameterSpec.getCurve());
                gostParams = new org.bouncycastle.asn1.x9.X962Parameters(new org.bouncycastle.asn1.x9.X9ECParameters(convertCurve, new org.bouncycastle.asn1.x9.X9ECPoint(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(convertCurve, this.getHighSpeedVideoFpsRanges.getGenerator()), this.Camera2StreamConfigurationMap), this.getHighSpeedVideoFpsRanges.getOrder(), java.math.BigInteger.valueOf(this.getHighSpeedVideoFpsRanges.getCofactor()), this.getHighSpeedVideoFpsRanges.getCurve().getSeed()));
            }
        }
        int i2 = 64;
        if (z) {
            aSN1ObjectIdentifier = org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3410_12_512;
            i = 64;
            i2 = 128;
        } else {
            aSN1ObjectIdentifier = org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3410_12_256;
            i = 32;
        }
        byte[] bArr = new byte[i2];
        int i3 = i2 / 2;
        getHighSpeedVideoFpsRangesFor(bArr, i3, 0, bigInteger);
        getHighSpeedVideoFpsRangesFor(bArr, i3, i, bigInteger2);
        try {
            return org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil.getEncodedSubjectPublicKeyInfo(new org.bouncycastle.asn1.x509.SubjectPublicKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(aSN1ObjectIdentifier, gostParams), new org.bouncycastle.asn1.DEROctetString(bArr)));
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
        org.bouncycastle.asn1.ASN1ObjectIdentifier algorithm = subjectPublicKeyInfo.getAlgorithm().getAlgorithm();
        org.bouncycastle.asn1.ASN1BitString publicKeyData = subjectPublicKeyInfo.getPublicKeyData();
        this.getHighSpeedVideoFpsRangesFor = "ECGOST3410-2012";
        try {
            byte[] octets = ((org.bouncycastle.asn1.ASN1OctetString) org.bouncycastle.asn1.ASN1Primitive.fromByteArray(publicKeyData.getBytes())).getOctets();
            int i = algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3410_12_512) ? 64 : 32;
            int i2 = i * 2;
            byte[] bArr = new byte[i2 + 1];
            bArr[0] = 4;
            for (int i3 = 1; i3 <= i; i3++) {
                bArr[i3] = octets[i - i3];
                bArr[i3 + i] = octets[i2 - i3];
            }
            org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters gOST3410PublicKeyAlgParameters = org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters.getInstance(subjectPublicKeyInfo.getAlgorithm().getParameters());
            this.getHighResolutionOutputSizeshNQ4ISI = gOST3410PublicKeyAlgParameters;
            org.bouncycastle.jce.spec.ECNamedCurveParameterSpec parameterSpec = org.bouncycastle.jce.ECGOST3410NamedCurveTable.getParameterSpec(org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves.getName(gOST3410PublicKeyAlgParameters.getPublicKeyParamSet()));
            org.bouncycastle.math.ec.ECCurve curve = parameterSpec.getCurve();
            java.security.spec.EllipticCurve convertCurve = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(curve, parameterSpec.getSeed());
            this.getHighSpeedVideoSizes = new org.bouncycastle.crypto.params.ECPublicKeyParameters(curve.decodePoint(bArr), org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getDomainParameters((org.bouncycastle.jcajce.provider.config.ProviderConfiguration) null, parameterSpec));
            this.getHighSpeedVideoFpsRanges = new org.bouncycastle.jce.spec.ECNamedCurveSpec(org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves.getName(this.getHighResolutionOutputSizeshNQ4ISI.getPublicKeyParamSet()), convertCurve, org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(parameterSpec.getG()), parameterSpec.getN(), parameterSpec.getH());
        } catch (java.io.IOException unused) {
            throw new java.lang.IllegalArgumentException("error recovering public key");
        }
    }

    private static void getHighSpeedVideoFpsRangesFor(byte[] bArr, int i, int i2, java.math.BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length < i) {
            byte[] bArr2 = new byte[i];
            java.lang.System.arraycopy(byteArray, 0, bArr2, i - byteArray.length, byteArray.length);
            byteArray = bArr2;
        }
        for (int i3 = 0; i3 != i; i3++) {
            bArr[i2 + i3] = byteArray[(byteArray.length - 1) - i3];
        }
    }

    public BCECGOST3410_2012PublicKey(org.bouncycastle.jce.spec.ECPublicKeySpec eCPublicKeySpec, org.bouncycastle.jcajce.provider.config.ProviderConfiguration providerConfiguration) {
        this.getHighSpeedVideoFpsRangesFor = "ECGOST3410-2012";
        if (eCPublicKeySpec.getParams() == null) {
            this.getHighSpeedVideoSizes = new org.bouncycastle.crypto.params.ECPublicKeyParameters(providerConfiguration.getEcImplicitlyCa().getCurve().createPoint(eCPublicKeySpec.getQ().getAffineXCoord().toBigInteger(), eCPublicKeySpec.getQ().getAffineYCoord().toBigInteger()), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.getDomainParameters(providerConfiguration, null));
            this.getHighSpeedVideoFpsRanges = null;
        } else {
            java.security.spec.EllipticCurve convertCurve = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(eCPublicKeySpec.getParams().getCurve(), eCPublicKeySpec.getParams().getSeed());
            this.getHighSpeedVideoSizes = new org.bouncycastle.crypto.params.ECPublicKeyParameters(eCPublicKeySpec.getQ(), org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getDomainParameters(providerConfiguration, eCPublicKeySpec.getParams()));
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(convertCurve, eCPublicKeySpec.getParams());
        }
    }

    public BCECGOST3410_2012PublicKey(org.bouncycastle.jcajce.provider.asymmetric.ecgost12.BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey) {
        this.getHighSpeedVideoFpsRangesFor = "ECGOST3410-2012";
        this.getHighSpeedVideoSizes = bCECGOST3410_2012PublicKey.getHighSpeedVideoSizes;
        this.getHighSpeedVideoFpsRanges = bCECGOST3410_2012PublicKey.getHighSpeedVideoFpsRanges;
        this.Camera2StreamConfigurationMap = bCECGOST3410_2012PublicKey.Camera2StreamConfigurationMap;
        this.getHighResolutionOutputSizeshNQ4ISI = bCECGOST3410_2012PublicKey.getHighResolutionOutputSizeshNQ4ISI;
    }

    BCECGOST3410_2012PublicKey(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) {
        this.getHighSpeedVideoFpsRangesFor = "ECGOST3410-2012";
        getHighSpeedVideoSizes(subjectPublicKeyInfo);
    }

    public BCECGOST3410_2012PublicKey(java.security.spec.ECPublicKeySpec eCPublicKeySpec) {
        this.getHighSpeedVideoFpsRangesFor = "ECGOST3410-2012";
        java.security.spec.ECParameterSpec params = eCPublicKeySpec.getParams();
        this.getHighSpeedVideoFpsRanges = params;
        this.getHighSpeedVideoSizes = new org.bouncycastle.crypto.params.ECPublicKeyParameters(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(params, eCPublicKeySpec.getW()), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.getDomainParameters(null, eCPublicKeySpec.getParams()));
    }

    public BCECGOST3410_2012PublicKey(java.security.interfaces.ECPublicKey eCPublicKey) {
        this.getHighSpeedVideoFpsRangesFor = "ECGOST3410-2012";
        this.getHighSpeedVideoFpsRangesFor = eCPublicKey.getAlgorithm();
        java.security.spec.ECParameterSpec params = eCPublicKey.getParams();
        this.getHighSpeedVideoFpsRanges = params;
        this.getHighSpeedVideoSizes = new org.bouncycastle.crypto.params.ECPublicKeyParameters(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(params, eCPublicKey.getW()), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.getDomainParameters(null, eCPublicKey.getParams()));
    }

    public BCECGOST3410_2012PublicKey(java.lang.String str, org.bouncycastle.crypto.params.ECPublicKeyParameters eCPublicKeyParameters) {
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoSizes = eCPublicKeyParameters;
        this.getHighSpeedVideoFpsRanges = null;
    }
}
