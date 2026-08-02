package org.bouncycastle.jcajce.provider.asymmetric.ecgost12;

/* loaded from: classes17.dex */
public class BCECGOST3410_2012PrivateKey implements java.security.interfaces.ECPrivateKey, org.bouncycastle.jce.interfaces.ECPrivateKey, org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier, org.bouncycastle.jce.interfaces.ECPointEncoder {
    static final long serialVersionUID = 7245981689601667138L;
    private java.lang.String Camera2StreamConfigurationMap;
    private transient java.security.spec.ECParameterSpec getHighResolutionOutputSizeshNQ4ISI;
    private transient org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters getHighSpeedVideoFpsRanges;
    private transient org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl getHighSpeedVideoFpsRangesFor;
    private transient java.math.BigInteger getHighSpeedVideoSizes;
    private transient org.bouncycastle.asn1.ASN1BitString getOutputFormats;
    private boolean getOutputMinFrameDuration;

    public BCECGOST3410_2012PrivateKey(java.lang.String str, org.bouncycastle.crypto.params.ECPrivateKeyParameters eCPrivateKeyParameters, org.bouncycastle.jcajce.provider.asymmetric.ecgost12.BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey, java.security.spec.ECParameterSpec eCParameterSpec) {
        this.Camera2StreamConfigurationMap = "ECGOST3410-2012";
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
        org.bouncycastle.crypto.params.ECDomainParameters parameters = eCPrivateKeyParameters.getParameters();
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoSizes = eCPrivateKeyParameters.getD();
        if (eCParameterSpec == null) {
            this.getHighResolutionOutputSizeshNQ4ISI = new java.security.spec.ECParameterSpec(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(parameters.getG()), parameters.getN(), parameters.getH().intValue());
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI = eCParameterSpec;
        }
        this.getHighSpeedVideoFpsRanges = bCECGOST3410_2012PublicKey.getGostParams();
        this.getOutputFormats = org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(bCECGOST3410_2012PublicKey.getEncoded()).getPublicKeyData();
    }

    public BCECGOST3410_2012PrivateKey(java.lang.String str, org.bouncycastle.crypto.params.ECPrivateKeyParameters eCPrivateKeyParameters, org.bouncycastle.jcajce.provider.asymmetric.ecgost12.BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey, org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpec) {
        this.Camera2StreamConfigurationMap = "ECGOST3410-2012";
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
        org.bouncycastle.crypto.params.ECDomainParameters parameters = eCPrivateKeyParameters.getParameters();
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoSizes = eCPrivateKeyParameters.getD();
        this.getHighResolutionOutputSizeshNQ4ISI = eCParameterSpec == null ? new java.security.spec.ECParameterSpec(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(parameters.getG()), parameters.getN(), parameters.getH().intValue()) : new java.security.spec.ECParameterSpec(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(eCParameterSpec.getCurve(), eCParameterSpec.getSeed()), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(eCParameterSpec.getG()), eCParameterSpec.getN(), eCParameterSpec.getH().intValue());
        this.getHighSpeedVideoFpsRanges = bCECGOST3410_2012PublicKey.getGostParams();
        this.getOutputFormats = org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(bCECGOST3410_2012PublicKey.getEncoded()).getPublicKeyData();
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof org.bouncycastle.jcajce.provider.asymmetric.ecgost12.BCECGOST3410_2012PrivateKey)) {
            return false;
        }
        org.bouncycastle.jcajce.provider.asymmetric.ecgost12.BCECGOST3410_2012PrivateKey bCECGOST3410_2012PrivateKey = (org.bouncycastle.jcajce.provider.asymmetric.ecgost12.BCECGOST3410_2012PrivateKey) obj;
        if (getD().equals(bCECGOST3410_2012PrivateKey.getD())) {
            java.security.spec.ECParameterSpec eCParameterSpec = this.getHighResolutionOutputSizeshNQ4ISI;
            org.bouncycastle.jce.spec.ECParameterSpec convertSpec = eCParameterSpec != null ? org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(eCParameterSpec) : org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
            java.security.spec.ECParameterSpec eCParameterSpec2 = bCECGOST3410_2012PrivateKey.getHighResolutionOutputSizeshNQ4ISI;
            if (convertSpec.equals(eCParameterSpec2 != null ? org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(eCParameterSpec2) : org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f9  */
    @Override // java.security.Key
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] getEncoded() {
        org.bouncycastle.asn1.x9.X962Parameters x962Parameters;
        org.bouncycastle.asn1.x9.X962Parameters x962Parameters2;
        int orderBitLength;
        boolean z = this.getHighSpeedVideoSizes.bitLength() > 256;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = z ? org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3410_12_512 : org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3410_12_256;
        int i = z ? 64 : 32;
        if (this.getHighSpeedVideoFpsRanges != null) {
            byte[] bArr = new byte[i];
            byte[] byteArray = getS().toByteArray();
            if (byteArray.length < i) {
                byte[] bArr2 = new byte[i];
                java.lang.System.arraycopy(byteArray, 0, bArr2, i - byteArray.length, byteArray.length);
                byteArray = bArr2;
            }
            for (int i2 = 0; i2 != i; i2++) {
                bArr[i2] = byteArray[(byteArray.length - 1) - i2];
            }
            try {
                return new org.bouncycastle.asn1.pkcs.PrivateKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(aSN1ObjectIdentifier, this.getHighSpeedVideoFpsRanges), new org.bouncycastle.asn1.DEROctetString(bArr)).getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
            } catch (java.io.IOException unused) {
                return null;
            }
        }
        java.security.spec.ECParameterSpec eCParameterSpec = this.getHighResolutionOutputSizeshNQ4ISI;
        try {
            if (eCParameterSpec instanceof org.bouncycastle.jce.spec.ECNamedCurveSpec) {
                org.bouncycastle.asn1.ASN1ObjectIdentifier namedCurveOid = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getNamedCurveOid(((org.bouncycastle.jce.spec.ECNamedCurveSpec) eCParameterSpec).getName());
                if (namedCurveOid == null) {
                    namedCurveOid = new org.bouncycastle.asn1.ASN1ObjectIdentifier(((org.bouncycastle.jce.spec.ECNamedCurveSpec) this.getHighResolutionOutputSizeshNQ4ISI).getName());
                }
                x962Parameters = new org.bouncycastle.asn1.x9.X962Parameters(namedCurveOid);
            } else {
                if (eCParameterSpec == null) {
                    x962Parameters2 = new org.bouncycastle.asn1.x9.X962Parameters((org.bouncycastle.asn1.ASN1Null) org.bouncycastle.asn1.DERNull.INSTANCE);
                    orderBitLength = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getOrderBitLength(org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION, null, getS());
                    return new org.bouncycastle.asn1.pkcs.PrivateKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(aSN1ObjectIdentifier, x962Parameters2.toASN1Primitive()), (this.getOutputFormats == null ? new org.bouncycastle.asn1.sec.ECPrivateKey(orderBitLength, getS(), this.getOutputFormats, x962Parameters2) : new org.bouncycastle.asn1.sec.ECPrivateKey(orderBitLength, getS(), x962Parameters2)).toASN1Primitive()).getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
                }
                org.bouncycastle.math.ec.ECCurve convertCurve = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(eCParameterSpec.getCurve());
                x962Parameters = new org.bouncycastle.asn1.x9.X962Parameters(new org.bouncycastle.asn1.x9.X9ECParameters(convertCurve, new org.bouncycastle.asn1.x9.X9ECPoint(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(convertCurve, this.getHighResolutionOutputSizeshNQ4ISI.getGenerator()), this.getOutputMinFrameDuration), this.getHighResolutionOutputSizeshNQ4ISI.getOrder(), java.math.BigInteger.valueOf(this.getHighResolutionOutputSizeshNQ4ISI.getCofactor()), this.getHighResolutionOutputSizeshNQ4ISI.getCurve().getSeed()));
            }
            return new org.bouncycastle.asn1.pkcs.PrivateKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(aSN1ObjectIdentifier, x962Parameters2.toASN1Primitive()), (this.getOutputFormats == null ? new org.bouncycastle.asn1.sec.ECPrivateKey(orderBitLength, getS(), this.getOutputFormats, x962Parameters2) : new org.bouncycastle.asn1.sec.ECPrivateKey(orderBitLength, getS(), x962Parameters2)).toASN1Primitive()).getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
        } catch (java.io.IOException unused2) {
            return null;
        }
        org.bouncycastle.asn1.x9.X962Parameters x962Parameters3 = x962Parameters;
        orderBitLength = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getOrderBitLength(org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION, this.getHighResolutionOutputSizeshNQ4ISI.getOrder(), getS());
        x962Parameters2 = x962Parameters3;
    }

    public int hashCode() {
        int hashCode = getD().hashCode();
        java.security.spec.ECParameterSpec eCParameterSpec = this.getHighResolutionOutputSizeshNQ4ISI;
        return hashCode ^ (eCParameterSpec != null ? org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(eCParameterSpec) : org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa()).hashCode();
    }

    public java.lang.String toString() {
        java.lang.String str = this.Camera2StreamConfigurationMap;
        java.math.BigInteger bigInteger = this.getHighSpeedVideoSizes;
        java.security.spec.ECParameterSpec eCParameterSpec = this.getHighResolutionOutputSizeshNQ4ISI;
        return org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.privateKeyToString(str, bigInteger, eCParameterSpec != null ? org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(eCParameterSpec) : org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa());
    }

    @Override // org.bouncycastle.jce.interfaces.ECPointEncoder
    public void setPointFormat(java.lang.String str) {
        this.getOutputMinFrameDuration = !"UNCOMPRESSED".equalsIgnoreCase(str);
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public void setBagAttribute(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.getHighSpeedVideoFpsRangesFor.setBagAttribute(aSN1ObjectIdentifier, aSN1Encodable);
    }

    @Override // java.security.interfaces.ECPrivateKey
    public java.math.BigInteger getS() {
        return this.getHighSpeedVideoSizes;
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
        return this.getHighSpeedVideoSizes;
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public java.util.Enumeration getBagAttributeKeys() {
        return this.getHighSpeedVideoFpsRangesFor.getBagAttributeKeys();
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public org.bouncycastle.asn1.ASN1Encodable getBagAttribute(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return this.getHighSpeedVideoFpsRangesFor.getBagAttribute(aSN1ObjectIdentifier);
    }

    @Override // java.security.Key
    public java.lang.String getAlgorithm() {
        return this.Camera2StreamConfigurationMap;
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        objectInputStream.defaultReadObject();
        Camera2StreamConfigurationMap(org.bouncycastle.asn1.pkcs.PrivateKeyInfo.getInstance(org.bouncycastle.asn1.ASN1Primitive.fromByteArray((byte[]) objectInputStream.readObject())));
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
    }

    private void Camera2StreamConfigurationMap(org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo) throws java.io.IOException {
        org.bouncycastle.jce.spec.ECNamedCurveSpec eCNamedCurveSpec;
        org.bouncycastle.asn1.ASN1Primitive aSN1Primitive = privateKeyInfo.getPrivateKeyAlgorithm().getParameters().toASN1Primitive();
        if ((aSN1Primitive instanceof org.bouncycastle.asn1.ASN1Sequence) && (org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1Primitive).size() == 2 || org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1Primitive).size() == 3)) {
            org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters gOST3410PublicKeyAlgParameters = org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters.getInstance(privateKeyInfo.getPrivateKeyAlgorithm().getParameters());
            this.getHighSpeedVideoFpsRanges = gOST3410PublicKeyAlgParameters;
            org.bouncycastle.jce.spec.ECNamedCurveParameterSpec parameterSpec = org.bouncycastle.jce.ECGOST3410NamedCurveTable.getParameterSpec(org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves.getName(gOST3410PublicKeyAlgParameters.getPublicKeyParamSet()));
            this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.jce.spec.ECNamedCurveSpec(org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves.getName(this.getHighSpeedVideoFpsRanges.getPublicKeyParamSet()), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(parameterSpec.getCurve(), parameterSpec.getSeed()), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(parameterSpec.getG()), parameterSpec.getN(), parameterSpec.getH());
            org.bouncycastle.asn1.ASN1OctetString privateKey = privateKeyInfo.getPrivateKey();
            if (privateKey.getOctets().length == 32 || privateKey.getOctets().length == 64) {
                this.getHighSpeedVideoSizes = new java.math.BigInteger(1, org.bouncycastle.util.Arrays.reverse(privateKey.getOctets()));
                return;
            }
            org.bouncycastle.asn1.ASN1Encodable parsePrivateKey = privateKeyInfo.parsePrivateKey();
            if (parsePrivateKey instanceof org.bouncycastle.asn1.ASN1Integer) {
                this.getHighSpeedVideoSizes = org.bouncycastle.asn1.ASN1Integer.getInstance(parsePrivateKey).getPositiveValue();
                return;
            } else {
                this.getHighSpeedVideoSizes = new java.math.BigInteger(1, org.bouncycastle.util.Arrays.reverse(org.bouncycastle.asn1.ASN1OctetString.getInstance(parsePrivateKey).getOctets()));
                return;
            }
        }
        org.bouncycastle.asn1.x9.X962Parameters x962Parameters = org.bouncycastle.asn1.x9.X962Parameters.getInstance(privateKeyInfo.getPrivateKeyAlgorithm().getParameters());
        if (x962Parameters.isNamedCurve()) {
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(x962Parameters.getParameters());
            org.bouncycastle.asn1.x9.X9ECParameters namedCurveByOid = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getNamedCurveByOid(aSN1ObjectIdentifier);
            if (namedCurveByOid == null) {
                org.bouncycastle.asn1.x9.X9ECParameters byOIDX9 = org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves.getByOIDX9(aSN1ObjectIdentifier);
                eCNamedCurveSpec = new org.bouncycastle.jce.spec.ECNamedCurveSpec(org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves.getName(aSN1ObjectIdentifier), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(byOIDX9.getCurve(), byOIDX9.getSeed()), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(byOIDX9.getG()), byOIDX9.getN(), byOIDX9.getH());
            } else {
                eCNamedCurveSpec = new org.bouncycastle.jce.spec.ECNamedCurveSpec(org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getCurveName(aSN1ObjectIdentifier), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(namedCurveByOid.getCurve(), namedCurveByOid.getSeed()), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(namedCurveByOid.getG()), namedCurveByOid.getN(), namedCurveByOid.getH());
            }
            this.getHighResolutionOutputSizeshNQ4ISI = eCNamedCurveSpec;
        } else if (x962Parameters.isImplicitlyCA()) {
            this.getHighResolutionOutputSizeshNQ4ISI = null;
        } else {
            org.bouncycastle.asn1.x9.X9ECParameters x9ECParameters = org.bouncycastle.asn1.x9.X9ECParameters.getInstance(x962Parameters.getParameters());
            this.getHighResolutionOutputSizeshNQ4ISI = new java.security.spec.ECParameterSpec(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(x9ECParameters.getCurve(), x9ECParameters.getSeed()), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(x9ECParameters.getG()), x9ECParameters.getN(), x9ECParameters.getH().intValue());
        }
        org.bouncycastle.asn1.ASN1Encodable parsePrivateKey2 = privateKeyInfo.parsePrivateKey();
        if (parsePrivateKey2 instanceof org.bouncycastle.asn1.ASN1Integer) {
            this.getHighSpeedVideoSizes = org.bouncycastle.asn1.ASN1Integer.getInstance(parsePrivateKey2).getValue();
            return;
        }
        org.bouncycastle.asn1.sec.ECPrivateKey eCPrivateKey = org.bouncycastle.asn1.sec.ECPrivateKey.getInstance(parsePrivateKey2);
        this.getHighSpeedVideoSizes = eCPrivateKey.getKey();
        this.getOutputFormats = eCPrivateKey.getPublicKey();
    }

    public BCECGOST3410_2012PrivateKey(org.bouncycastle.jce.spec.ECPrivateKeySpec eCPrivateKeySpec) {
        this.Camera2StreamConfigurationMap = "ECGOST3410-2012";
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
        this.getHighSpeedVideoSizes = eCPrivateKeySpec.getD();
        this.getHighResolutionOutputSizeshNQ4ISI = eCPrivateKeySpec.getParams() != null ? org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(eCPrivateKeySpec.getParams().getCurve(), eCPrivateKeySpec.getParams().getSeed()), eCPrivateKeySpec.getParams()) : null;
    }

    public BCECGOST3410_2012PrivateKey(org.bouncycastle.jcajce.provider.asymmetric.ecgost12.BCECGOST3410_2012PrivateKey bCECGOST3410_2012PrivateKey) {
        this.Camera2StreamConfigurationMap = "ECGOST3410-2012";
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
        this.getHighSpeedVideoSizes = bCECGOST3410_2012PrivateKey.getHighSpeedVideoSizes;
        this.getHighResolutionOutputSizeshNQ4ISI = bCECGOST3410_2012PrivateKey.getHighResolutionOutputSizeshNQ4ISI;
        this.getOutputMinFrameDuration = bCECGOST3410_2012PrivateKey.getOutputMinFrameDuration;
        this.getHighSpeedVideoFpsRangesFor = bCECGOST3410_2012PrivateKey.getHighSpeedVideoFpsRangesFor;
        this.getOutputFormats = bCECGOST3410_2012PrivateKey.getOutputFormats;
        this.getHighSpeedVideoFpsRanges = bCECGOST3410_2012PrivateKey.getHighSpeedVideoFpsRanges;
    }

    BCECGOST3410_2012PrivateKey(org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo) throws java.io.IOException {
        this.Camera2StreamConfigurationMap = "ECGOST3410-2012";
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
        Camera2StreamConfigurationMap(privateKeyInfo);
    }

    public BCECGOST3410_2012PrivateKey(java.security.spec.ECPrivateKeySpec eCPrivateKeySpec) {
        this.Camera2StreamConfigurationMap = "ECGOST3410-2012";
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
        this.getHighSpeedVideoSizes = eCPrivateKeySpec.getS();
        this.getHighResolutionOutputSizeshNQ4ISI = eCPrivateKeySpec.getParams();
    }

    public BCECGOST3410_2012PrivateKey(java.security.interfaces.ECPrivateKey eCPrivateKey) {
        this.Camera2StreamConfigurationMap = "ECGOST3410-2012";
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
        this.getHighSpeedVideoSizes = eCPrivateKey.getS();
        this.Camera2StreamConfigurationMap = eCPrivateKey.getAlgorithm();
        this.getHighResolutionOutputSizeshNQ4ISI = eCPrivateKey.getParams();
    }

    public BCECGOST3410_2012PrivateKey(java.lang.String str, org.bouncycastle.crypto.params.ECPrivateKeyParameters eCPrivateKeyParameters) {
        this.Camera2StreamConfigurationMap = "ECGOST3410-2012";
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoSizes = eCPrivateKeyParameters.getD();
        this.getHighResolutionOutputSizeshNQ4ISI = null;
    }

    protected BCECGOST3410_2012PrivateKey() {
        this.Camera2StreamConfigurationMap = "ECGOST3410-2012";
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
    }
}
