package org.bouncycastle.jcajce.provider.asymmetric.ecgost;

/* loaded from: classes17.dex */
public class BCECGOST3410PrivateKey implements java.security.interfaces.ECPrivateKey, org.bouncycastle.jce.interfaces.ECPrivateKey, org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier, org.bouncycastle.jce.interfaces.ECPointEncoder {
    static final long serialVersionUID = 7245981689601667138L;
    private transient java.math.BigInteger Camera2StreamConfigurationMap;
    private transient java.security.spec.ECParameterSpec getHighResolutionOutputSizeshNQ4ISI;
    private transient org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl getHighSpeedVideoFpsRanges;
    private java.lang.String getHighSpeedVideoFpsRangesFor;
    private transient org.bouncycastle.asn1.ASN1Encodable getHighSpeedVideoSizes;
    private boolean getInputSizeshNQ4ISI;
    private transient org.bouncycastle.asn1.ASN1BitString getOutputFormats;

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof org.bouncycastle.jcajce.provider.asymmetric.ecgost.BCECGOST3410PrivateKey)) {
            return false;
        }
        org.bouncycastle.jcajce.provider.asymmetric.ecgost.BCECGOST3410PrivateKey bCECGOST3410PrivateKey = (org.bouncycastle.jcajce.provider.asymmetric.ecgost.BCECGOST3410PrivateKey) obj;
        if (getD().equals(bCECGOST3410PrivateKey.getD())) {
            java.security.spec.ECParameterSpec eCParameterSpec = this.getHighResolutionOutputSizeshNQ4ISI;
            org.bouncycastle.jce.spec.ECParameterSpec convertSpec = eCParameterSpec != null ? org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(eCParameterSpec) : org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
            java.security.spec.ECParameterSpec eCParameterSpec2 = bCECGOST3410PrivateKey.getHighResolutionOutputSizeshNQ4ISI;
            if (convertSpec.equals(eCParameterSpec2 != null ? org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(eCParameterSpec2) : org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        org.bouncycastle.asn1.x9.X962Parameters x962Parameters;
        int orderBitLength;
        if (this.getHighSpeedVideoSizes != null) {
            byte[] bArr = new byte[32];
            byte[] byteArray = getS().toByteArray();
            if (byteArray.length < 32) {
                byte[] bArr2 = new byte[32];
                java.lang.System.arraycopy(byteArray, 0, bArr2, 32 - byteArray.length, byteArray.length);
                byteArray = bArr2;
            }
            for (int i = 0; i != 32; i++) {
                bArr[i] = byteArray[(byteArray.length - 1) - i];
            }
            try {
                return new org.bouncycastle.asn1.pkcs.PrivateKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3410_2001, this.getHighSpeedVideoSizes), new org.bouncycastle.asn1.DEROctetString(bArr)).getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
            } catch (java.io.IOException unused) {
                return null;
            }
        }
        java.security.spec.ECParameterSpec eCParameterSpec = this.getHighResolutionOutputSizeshNQ4ISI;
        if (eCParameterSpec instanceof org.bouncycastle.jce.spec.ECNamedCurveSpec) {
            org.bouncycastle.asn1.ASN1ObjectIdentifier namedCurveOid = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getNamedCurveOid(((org.bouncycastle.jce.spec.ECNamedCurveSpec) eCParameterSpec).getName());
            if (namedCurveOid == null) {
                namedCurveOid = new org.bouncycastle.asn1.ASN1ObjectIdentifier(((org.bouncycastle.jce.spec.ECNamedCurveSpec) this.getHighResolutionOutputSizeshNQ4ISI).getName());
            }
            x962Parameters = new org.bouncycastle.asn1.x9.X962Parameters(namedCurveOid);
            orderBitLength = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getOrderBitLength(org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION, this.getHighResolutionOutputSizeshNQ4ISI.getOrder(), getS());
        } else if (eCParameterSpec == null) {
            x962Parameters = new org.bouncycastle.asn1.x9.X962Parameters((org.bouncycastle.asn1.ASN1Null) org.bouncycastle.asn1.DERNull.INSTANCE);
            orderBitLength = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getOrderBitLength(org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION, null, getS());
        } else {
            org.bouncycastle.math.ec.ECCurve convertCurve = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(eCParameterSpec.getCurve());
            x962Parameters = new org.bouncycastle.asn1.x9.X962Parameters(new org.bouncycastle.asn1.x9.X9ECParameters(convertCurve, new org.bouncycastle.asn1.x9.X9ECPoint(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(convertCurve, this.getHighResolutionOutputSizeshNQ4ISI.getGenerator()), this.getInputSizeshNQ4ISI), this.getHighResolutionOutputSizeshNQ4ISI.getOrder(), java.math.BigInteger.valueOf(this.getHighResolutionOutputSizeshNQ4ISI.getCofactor()), this.getHighResolutionOutputSizeshNQ4ISI.getCurve().getSeed()));
            orderBitLength = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getOrderBitLength(org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION, this.getHighResolutionOutputSizeshNQ4ISI.getOrder(), getS());
        }
        try {
            return new org.bouncycastle.asn1.pkcs.PrivateKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3410_2001, x962Parameters.toASN1Primitive()), (this.getOutputFormats != null ? new org.bouncycastle.asn1.sec.ECPrivateKey(orderBitLength, getS(), this.getOutputFormats, x962Parameters) : new org.bouncycastle.asn1.sec.ECPrivateKey(orderBitLength, getS(), x962Parameters)).toASN1Primitive()).getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
        } catch (java.io.IOException unused2) {
            return null;
        }
    }

    public int hashCode() {
        int hashCode = getD().hashCode();
        java.security.spec.ECParameterSpec eCParameterSpec = this.getHighResolutionOutputSizeshNQ4ISI;
        return hashCode ^ (eCParameterSpec != null ? org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(eCParameterSpec) : org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa()).hashCode();
    }

    public java.lang.String toString() {
        java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
        java.math.BigInteger bigInteger = this.Camera2StreamConfigurationMap;
        java.security.spec.ECParameterSpec eCParameterSpec = this.getHighResolutionOutputSizeshNQ4ISI;
        return org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.privateKeyToString(str, bigInteger, eCParameterSpec != null ? org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(eCParameterSpec) : org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa());
    }

    @Override // org.bouncycastle.jce.interfaces.ECPointEncoder
    public void setPointFormat(java.lang.String str) {
        this.getInputSizeshNQ4ISI = !"UNCOMPRESSED".equalsIgnoreCase(str);
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public void setBagAttribute(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.getHighSpeedVideoFpsRanges.setBagAttribute(aSN1ObjectIdentifier, aSN1Encodable);
    }

    @Override // java.security.interfaces.ECPrivateKey
    public java.math.BigInteger getS() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // java.security.interfaces.ECKey
    public java.security.spec.ECParameterSpec getParams() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // org.bouncycastle.jce.interfaces.ECKey
    public org.bouncycastle.jce.spec.ECParameterSpec getParameters() {
        java.security.spec.ECParameterSpec eCParameterSpec = this.getHighResolutionOutputSizeshNQ4ISI;
        if (eCParameterSpec == null) {
            return null;
        }
        return org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(eCParameterSpec);
    }

    @Override // java.security.Key
    public java.lang.String getFormat() {
        return "PKCS#8";
    }

    @Override // org.bouncycastle.jce.interfaces.ECPrivateKey
    public java.math.BigInteger getD() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public java.util.Enumeration getBagAttributeKeys() {
        return this.getHighSpeedVideoFpsRanges.getBagAttributeKeys();
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public org.bouncycastle.asn1.ASN1Encodable getBagAttribute(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return this.getHighSpeedVideoFpsRanges.getBagAttribute(aSN1ObjectIdentifier);
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
        Camera2StreamConfigurationMap(org.bouncycastle.asn1.pkcs.PrivateKeyInfo.getInstance(org.bouncycastle.asn1.ASN1Primitive.fromByteArray((byte[]) objectInputStream.readObject())));
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void Camera2StreamConfigurationMap(org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo) throws java.io.IOException {
        java.security.spec.ECParameterSpec eCParameterSpec;
        org.bouncycastle.asn1.ASN1Encodable parsePrivateKey;
        org.bouncycastle.asn1.ASN1Encodable parameters = privateKeyInfo.getPrivateKeyAlgorithm().getParameters();
        org.bouncycastle.asn1.ASN1Primitive aSN1Primitive = parameters.toASN1Primitive();
        if ((aSN1Primitive instanceof org.bouncycastle.asn1.ASN1Sequence) && (org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1Primitive).size() == 2 || org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1Primitive).size() == 3)) {
            org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters gOST3410PublicKeyAlgParameters = org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters.getInstance(parameters);
            this.getHighSpeedVideoSizes = gOST3410PublicKeyAlgParameters;
            org.bouncycastle.jce.spec.ECNamedCurveParameterSpec parameterSpec = org.bouncycastle.jce.ECGOST3410NamedCurveTable.getParameterSpec(org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves.getName(gOST3410PublicKeyAlgParameters.getPublicKeyParamSet()));
            this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.jce.spec.ECNamedCurveSpec(org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves.getName(gOST3410PublicKeyAlgParameters.getPublicKeyParamSet()), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(parameterSpec.getCurve(), parameterSpec.getSeed()), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(parameterSpec.getG()), parameterSpec.getN(), parameterSpec.getH());
            org.bouncycastle.asn1.ASN1Encodable parsePrivateKey2 = privateKeyInfo.parsePrivateKey();
            if (parsePrivateKey2 instanceof org.bouncycastle.asn1.ASN1Integer) {
                this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.ASN1Integer.getInstance(parsePrivateKey2).getPositiveValue();
                return;
            }
            byte[] octets = org.bouncycastle.asn1.ASN1OctetString.getInstance(parsePrivateKey2).getOctets();
            byte[] bArr = new byte[octets.length];
            for (int i = 0; i != octets.length; i++) {
                bArr[i] = octets[(octets.length - 1) - i];
            }
            this.Camera2StreamConfigurationMap = new java.math.BigInteger(1, bArr);
            return;
        }
        org.bouncycastle.asn1.x9.X962Parameters x962Parameters = org.bouncycastle.asn1.x9.X962Parameters.getInstance(parameters);
        if (x962Parameters.isNamedCurve()) {
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(x962Parameters.getParameters());
            org.bouncycastle.asn1.x9.X9ECParameters namedCurveByOid = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getNamedCurveByOid(aSN1ObjectIdentifier);
            if (namedCurveByOid == null) {
                throw new java.lang.IllegalStateException();
            }
            eCParameterSpec = new org.bouncycastle.jce.spec.ECNamedCurveSpec(org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getCurveName(aSN1ObjectIdentifier), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(namedCurveByOid.getCurve(), namedCurveByOid.getSeed()), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(namedCurveByOid.getG()), namedCurveByOid.getN(), namedCurveByOid.getH());
        } else {
            if (x962Parameters.isImplicitlyCA()) {
                this.getHighResolutionOutputSizeshNQ4ISI = null;
                parsePrivateKey = privateKeyInfo.parsePrivateKey();
                if (!(parsePrivateKey instanceof org.bouncycastle.asn1.ASN1Integer)) {
                    this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.ASN1Integer.getInstance(parsePrivateKey).getValue();
                    return;
                }
                org.bouncycastle.asn1.sec.ECPrivateKey eCPrivateKey = org.bouncycastle.asn1.sec.ECPrivateKey.getInstance(parsePrivateKey);
                this.Camera2StreamConfigurationMap = eCPrivateKey.getKey();
                this.getOutputFormats = eCPrivateKey.getPublicKey();
                return;
            }
            org.bouncycastle.asn1.x9.X9ECParameters x9ECParameters = org.bouncycastle.asn1.x9.X9ECParameters.getInstance(x962Parameters.getParameters());
            eCParameterSpec = new java.security.spec.ECParameterSpec(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(x9ECParameters.getCurve(), x9ECParameters.getSeed()), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(x9ECParameters.getG()), x9ECParameters.getN(), x9ECParameters.getH().intValue());
        }
        this.getHighResolutionOutputSizeshNQ4ISI = eCParameterSpec;
        parsePrivateKey = privateKeyInfo.parsePrivateKey();
        if (!(parsePrivateKey instanceof org.bouncycastle.asn1.ASN1Integer)) {
        }
    }

    private static org.bouncycastle.asn1.ASN1BitString getHighSpeedVideoSizes(org.bouncycastle.jcajce.provider.asymmetric.ecgost.BCECGOST3410PublicKey bCECGOST3410PublicKey) {
        try {
            return org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(org.bouncycastle.asn1.ASN1Primitive.fromByteArray(bCECGOST3410PublicKey.getEncoded())).getPublicKeyData();
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    public BCECGOST3410PrivateKey(org.bouncycastle.jce.spec.ECPrivateKeySpec eCPrivateKeySpec) {
        this.getHighSpeedVideoFpsRangesFor = "ECGOST3410";
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
        this.Camera2StreamConfigurationMap = eCPrivateKeySpec.getD();
        this.getHighResolutionOutputSizeshNQ4ISI = eCPrivateKeySpec.getParams() != null ? org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(eCPrivateKeySpec.getParams().getCurve(), eCPrivateKeySpec.getParams().getSeed()), eCPrivateKeySpec.getParams()) : null;
    }

    public BCECGOST3410PrivateKey(org.bouncycastle.jcajce.provider.asymmetric.ecgost.BCECGOST3410PrivateKey bCECGOST3410PrivateKey) {
        this.getHighSpeedVideoFpsRangesFor = "ECGOST3410";
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
        this.Camera2StreamConfigurationMap = bCECGOST3410PrivateKey.Camera2StreamConfigurationMap;
        this.getHighResolutionOutputSizeshNQ4ISI = bCECGOST3410PrivateKey.getHighResolutionOutputSizeshNQ4ISI;
        this.getInputSizeshNQ4ISI = bCECGOST3410PrivateKey.getInputSizeshNQ4ISI;
        this.getHighSpeedVideoFpsRanges = bCECGOST3410PrivateKey.getHighSpeedVideoFpsRanges;
        this.getOutputFormats = bCECGOST3410PrivateKey.getOutputFormats;
        this.getHighSpeedVideoSizes = bCECGOST3410PrivateKey.getHighSpeedVideoSizes;
    }

    BCECGOST3410PrivateKey(org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo) throws java.io.IOException {
        this.getHighSpeedVideoFpsRangesFor = "ECGOST3410";
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
        Camera2StreamConfigurationMap(privateKeyInfo);
    }

    public BCECGOST3410PrivateKey(java.security.spec.ECPrivateKeySpec eCPrivateKeySpec) {
        this.getHighSpeedVideoFpsRangesFor = "ECGOST3410";
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
        this.Camera2StreamConfigurationMap = eCPrivateKeySpec.getS();
        this.getHighResolutionOutputSizeshNQ4ISI = eCPrivateKeySpec.getParams();
    }

    public BCECGOST3410PrivateKey(java.security.interfaces.ECPrivateKey eCPrivateKey) {
        this.getHighSpeedVideoFpsRangesFor = "ECGOST3410";
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
        this.Camera2StreamConfigurationMap = eCPrivateKey.getS();
        this.getHighSpeedVideoFpsRangesFor = eCPrivateKey.getAlgorithm();
        this.getHighResolutionOutputSizeshNQ4ISI = eCPrivateKey.getParams();
    }

    public BCECGOST3410PrivateKey(java.lang.String str, org.bouncycastle.crypto.params.ECPrivateKeyParameters eCPrivateKeyParameters, org.bouncycastle.jcajce.provider.asymmetric.ecgost.BCECGOST3410PublicKey bCECGOST3410PublicKey, org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpec) {
        this.getHighSpeedVideoFpsRangesFor = "ECGOST3410";
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
        this.getHighSpeedVideoFpsRangesFor = str;
        this.Camera2StreamConfigurationMap = eCPrivateKeyParameters.getD();
        if (eCParameterSpec == null) {
            org.bouncycastle.crypto.params.ECDomainParameters parameters = eCPrivateKeyParameters.getParameters();
            this.getHighResolutionOutputSizeshNQ4ISI = new java.security.spec.ECParameterSpec(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(parameters.getG()), parameters.getN(), parameters.getH().intValue());
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI = new java.security.spec.ECParameterSpec(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(eCParameterSpec.getCurve(), eCParameterSpec.getSeed()), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(eCParameterSpec.getG()), eCParameterSpec.getN(), eCParameterSpec.getH().intValue());
        }
        this.getHighSpeedVideoSizes = bCECGOST3410PublicKey.getHighSpeedVideoFpsRangesFor();
        this.getOutputFormats = getHighSpeedVideoSizes(bCECGOST3410PublicKey);
    }

    public BCECGOST3410PrivateKey(java.lang.String str, org.bouncycastle.crypto.params.ECPrivateKeyParameters eCPrivateKeyParameters, org.bouncycastle.jcajce.provider.asymmetric.ecgost.BCECGOST3410PublicKey bCECGOST3410PublicKey, java.security.spec.ECParameterSpec eCParameterSpec) {
        this.getHighSpeedVideoFpsRangesFor = "ECGOST3410";
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
        this.getHighSpeedVideoFpsRangesFor = str;
        this.Camera2StreamConfigurationMap = eCPrivateKeyParameters.getD();
        if (eCParameterSpec == null) {
            org.bouncycastle.crypto.params.ECDomainParameters parameters = eCPrivateKeyParameters.getParameters();
            eCParameterSpec = new java.security.spec.ECParameterSpec(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(parameters.getG()), parameters.getN(), parameters.getH().intValue());
        }
        this.getHighResolutionOutputSizeshNQ4ISI = eCParameterSpec;
        this.getHighSpeedVideoSizes = bCECGOST3410PublicKey.getHighSpeedVideoFpsRangesFor();
        this.getOutputFormats = getHighSpeedVideoSizes(bCECGOST3410PublicKey);
    }

    public BCECGOST3410PrivateKey(java.lang.String str, org.bouncycastle.crypto.params.ECPrivateKeyParameters eCPrivateKeyParameters) {
        this.getHighSpeedVideoFpsRangesFor = "ECGOST3410";
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
        this.getHighSpeedVideoFpsRangesFor = str;
        this.Camera2StreamConfigurationMap = eCPrivateKeyParameters.getD();
        this.getHighResolutionOutputSizeshNQ4ISI = null;
    }

    protected BCECGOST3410PrivateKey() {
        this.getHighSpeedVideoFpsRangesFor = "ECGOST3410";
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
    }
}
