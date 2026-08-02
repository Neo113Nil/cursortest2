package org.bouncycastle.jcajce.provider.asymmetric.dstu;

/* loaded from: classes17.dex */
public class BCDSTU4145PrivateKey implements java.security.interfaces.ECPrivateKey, org.bouncycastle.jce.interfaces.ECPrivateKey, org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier, org.bouncycastle.jce.interfaces.ECPointEncoder {
    static final long serialVersionUID = 7245981689601667138L;
    private java.lang.String Camera2StreamConfigurationMap;
    private transient java.security.spec.ECParameterSpec getHighResolutionOutputSizeshNQ4ISI;
    private transient org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl getHighSpeedVideoFpsRanges;
    private transient java.math.BigInteger getHighSpeedVideoFpsRangesFor;
    private transient org.bouncycastle.asn1.ASN1BitString getHighSpeedVideoSizes;
    private boolean getOutputFormats;

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof org.bouncycastle.jcajce.provider.asymmetric.dstu.BCDSTU4145PrivateKey)) {
            return false;
        }
        org.bouncycastle.jcajce.provider.asymmetric.dstu.BCDSTU4145PrivateKey bCDSTU4145PrivateKey = (org.bouncycastle.jcajce.provider.asymmetric.dstu.BCDSTU4145PrivateKey) obj;
        if (getD().equals(bCDSTU4145PrivateKey.getD())) {
            java.security.spec.ECParameterSpec eCParameterSpec = this.getHighResolutionOutputSizeshNQ4ISI;
            org.bouncycastle.jce.spec.ECParameterSpec convertSpec = eCParameterSpec != null ? org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(eCParameterSpec) : org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
            java.security.spec.ECParameterSpec eCParameterSpec2 = bCDSTU4145PrivateKey.getHighResolutionOutputSizeshNQ4ISI;
            if (convertSpec.equals(eCParameterSpec2 != null ? org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(eCParameterSpec2) : org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = getD().hashCode();
        java.security.spec.ECParameterSpec eCParameterSpec = this.getHighResolutionOutputSizeshNQ4ISI;
        return hashCode ^ (eCParameterSpec != null ? org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(eCParameterSpec) : org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa()).hashCode();
    }

    public java.lang.String toString() {
        java.lang.String str = this.Camera2StreamConfigurationMap;
        java.math.BigInteger bigInteger = this.getHighSpeedVideoFpsRangesFor;
        java.security.spec.ECParameterSpec eCParameterSpec = this.getHighResolutionOutputSizeshNQ4ISI;
        return org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.privateKeyToString(str, bigInteger, eCParameterSpec != null ? org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(eCParameterSpec) : org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa());
    }

    @Override // org.bouncycastle.jce.interfaces.ECPointEncoder
    public void setPointFormat(java.lang.String str) {
        this.getOutputFormats = !"UNCOMPRESSED".equalsIgnoreCase(str);
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public void setBagAttribute(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.getHighSpeedVideoFpsRanges.setBagAttribute(aSN1ObjectIdentifier, aSN1Encodable);
    }

    @Override // java.security.interfaces.ECPrivateKey
    public java.math.BigInteger getS() {
        return this.getHighSpeedVideoFpsRangesFor;
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00af A[Catch: IOException -> 0x00e0, TryCatch #0 {IOException -> 0x00e0, blocks: (B:12:0x00a5, B:14:0x00af, B:15:0x00d9, B:19:0x00c4), top: B:11:0x00a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c4 A[Catch: IOException -> 0x00e0, TryCatch #0 {IOException -> 0x00e0, blocks: (B:12:0x00a5, B:14:0x00af, B:15:0x00d9, B:19:0x00c4), top: B:11:0x00a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009c  */
    @Override // java.security.Key
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] getEncoded() {
        org.bouncycastle.asn1.x9.X962Parameters x962Parameters;
        org.bouncycastle.asn1.x9.X962Parameters x962Parameters2;
        int orderBitLength;
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
                    org.bouncycastle.asn1.sec.ECPrivateKey eCPrivateKey = this.getHighSpeedVideoSizes == null ? new org.bouncycastle.asn1.sec.ECPrivateKey(orderBitLength, getS(), this.getHighSpeedVideoSizes, x962Parameters2) : new org.bouncycastle.asn1.sec.ECPrivateKey(orderBitLength, getS(), x962Parameters2);
                    return (!this.Camera2StreamConfigurationMap.equals("DSTU4145") ? new org.bouncycastle.asn1.pkcs.PrivateKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu4145be, x962Parameters2.toASN1Primitive()), eCPrivateKey.toASN1Primitive()) : new org.bouncycastle.asn1.pkcs.PrivateKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.id_ecPublicKey, x962Parameters2.toASN1Primitive()), eCPrivateKey.toASN1Primitive())).getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
                }
                org.bouncycastle.math.ec.ECCurve convertCurve = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(eCParameterSpec.getCurve());
                x962Parameters = new org.bouncycastle.asn1.x9.X962Parameters(new org.bouncycastle.asn1.x9.X9ECParameters(convertCurve, new org.bouncycastle.asn1.x9.X9ECPoint(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(convertCurve, this.getHighResolutionOutputSizeshNQ4ISI.getGenerator()), this.getOutputFormats), this.getHighResolutionOutputSizeshNQ4ISI.getOrder(), java.math.BigInteger.valueOf(this.getHighResolutionOutputSizeshNQ4ISI.getCofactor()), this.getHighResolutionOutputSizeshNQ4ISI.getCurve().getSeed()));
            }
            return (!this.Camera2StreamConfigurationMap.equals("DSTU4145") ? new org.bouncycastle.asn1.pkcs.PrivateKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu4145be, x962Parameters2.toASN1Primitive()), eCPrivateKey.toASN1Primitive()) : new org.bouncycastle.asn1.pkcs.PrivateKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.id_ecPublicKey, x962Parameters2.toASN1Primitive()), eCPrivateKey.toASN1Primitive())).getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
        } catch (java.io.IOException unused) {
            return null;
        }
        org.bouncycastle.asn1.x9.X962Parameters x962Parameters3 = x962Parameters;
        orderBitLength = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getOrderBitLength(org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION, this.getHighResolutionOutputSizeshNQ4ISI.getOrder(), getS());
        x962Parameters2 = x962Parameters3;
        if (this.getHighSpeedVideoSizes == null) {
        }
    }

    @Override // org.bouncycastle.jce.interfaces.ECPrivateKey
    public java.math.BigInteger getD() {
        return this.getHighSpeedVideoFpsRangesFor;
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
        return this.Camera2StreamConfigurationMap;
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    private static void getHighSpeedVideoSizes(byte[] bArr) {
        for (int i = 0; i < bArr.length / 2; i++) {
            byte b = bArr[i];
            bArr[i] = bArr[(bArr.length - 1) - i];
            bArr[(bArr.length - 1) - i] = b;
        }
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        objectInputStream.defaultReadObject();
        getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.pkcs.PrivateKeyInfo.getInstance(org.bouncycastle.asn1.ASN1Primitive.fromByteArray((byte[]) objectInputStream.readObject())));
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
    }

    private void getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo) throws java.io.IOException {
        org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpec;
        java.security.spec.ECParameterSpec eCParameterSpec2;
        org.bouncycastle.jce.spec.ECNamedCurveSpec eCNamedCurveSpec;
        org.bouncycastle.asn1.x9.X962Parameters x962Parameters = org.bouncycastle.asn1.x9.X962Parameters.getInstance(privateKeyInfo.getPrivateKeyAlgorithm().getParameters());
        if (x962Parameters.isNamedCurve()) {
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(x962Parameters.getParameters());
            org.bouncycastle.asn1.x9.X9ECParameters namedCurveByOid = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getNamedCurveByOid(aSN1ObjectIdentifier);
            if (namedCurveByOid == null) {
                org.bouncycastle.crypto.params.ECDomainParameters byOID = org.bouncycastle.asn1.ua.DSTU4145NamedCurves.getByOID(aSN1ObjectIdentifier);
                eCNamedCurveSpec = new org.bouncycastle.jce.spec.ECNamedCurveSpec(aSN1ObjectIdentifier.getId(), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(byOID.getCurve(), byOID.getSeed()), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(byOID.getG()), byOID.getN(), byOID.getH());
            } else {
                eCNamedCurveSpec = new org.bouncycastle.jce.spec.ECNamedCurveSpec(org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getCurveName(aSN1ObjectIdentifier), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(namedCurveByOid.getCurve(), namedCurveByOid.getSeed()), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(namedCurveByOid.getG()), namedCurveByOid.getN(), namedCurveByOid.getH());
            }
            this.getHighResolutionOutputSizeshNQ4ISI = eCNamedCurveSpec;
        } else {
            if (x962Parameters.isImplicitlyCA()) {
                eCParameterSpec2 = null;
            } else {
                org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(x962Parameters.getParameters());
                if (aSN1Sequence.getObjectAt(0) instanceof org.bouncycastle.asn1.ASN1Integer) {
                    org.bouncycastle.asn1.x9.X9ECParameters x9ECParameters = org.bouncycastle.asn1.x9.X9ECParameters.getInstance(x962Parameters.getParameters());
                    this.getHighResolutionOutputSizeshNQ4ISI = new java.security.spec.ECParameterSpec(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(x9ECParameters.getCurve(), x9ECParameters.getSeed()), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(x9ECParameters.getG()), x9ECParameters.getN(), x9ECParameters.getH().intValue());
                } else {
                    org.bouncycastle.asn1.ua.DSTU4145Params dSTU4145Params = org.bouncycastle.asn1.ua.DSTU4145Params.getInstance(aSN1Sequence);
                    if (dSTU4145Params.isNamedCurve()) {
                        org.bouncycastle.asn1.ASN1ObjectIdentifier namedCurve = dSTU4145Params.getNamedCurve();
                        org.bouncycastle.crypto.params.ECDomainParameters byOID2 = org.bouncycastle.asn1.ua.DSTU4145NamedCurves.getByOID(namedCurve);
                        eCParameterSpec = new org.bouncycastle.jce.spec.ECNamedCurveParameterSpec(namedCurve.getId(), byOID2.getCurve(), byOID2.getG(), byOID2.getN(), byOID2.getH(), byOID2.getSeed());
                    } else {
                        org.bouncycastle.asn1.ua.DSTU4145ECBinary eCBinary = dSTU4145Params.getECBinary();
                        byte[] b = eCBinary.getB();
                        if (privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu4145le)) {
                            getHighSpeedVideoSizes(b);
                        }
                        org.bouncycastle.asn1.ua.DSTU4145BinaryField field = eCBinary.getField();
                        org.bouncycastle.math.ec.ECCurve.F2m f2m = new org.bouncycastle.math.ec.ECCurve.F2m(field.getM(), field.getK1(), field.getK2(), field.getK3(), eCBinary.getA(), new java.math.BigInteger(1, b));
                        byte[] g = eCBinary.getG();
                        if (privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu4145le)) {
                            getHighSpeedVideoSizes(g);
                        }
                        eCParameterSpec = new org.bouncycastle.jce.spec.ECParameterSpec(f2m, org.bouncycastle.asn1.ua.DSTU4145PointEncoder.decodePoint(f2m, g), eCBinary.getN());
                    }
                    eCParameterSpec2 = new java.security.spec.ECParameterSpec(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(eCParameterSpec.getCurve(), eCParameterSpec.getSeed()), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(eCParameterSpec.getG()), eCParameterSpec.getN(), eCParameterSpec.getH().intValue());
                }
            }
            this.getHighResolutionOutputSizeshNQ4ISI = eCParameterSpec2;
        }
        org.bouncycastle.asn1.ASN1Encodable parsePrivateKey = privateKeyInfo.parsePrivateKey();
        if (parsePrivateKey instanceof org.bouncycastle.asn1.ASN1Integer) {
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1Integer.getInstance(parsePrivateKey).getValue();
            return;
        }
        org.bouncycastle.asn1.sec.ECPrivateKey eCPrivateKey = org.bouncycastle.asn1.sec.ECPrivateKey.getInstance(parsePrivateKey);
        this.getHighSpeedVideoFpsRangesFor = eCPrivateKey.getKey();
        this.getHighSpeedVideoSizes = eCPrivateKey.getPublicKey();
    }

    private static org.bouncycastle.asn1.ASN1BitString Camera2StreamConfigurationMap(org.bouncycastle.jcajce.provider.asymmetric.dstu.BCDSTU4145PublicKey bCDSTU4145PublicKey) {
        try {
            return org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(org.bouncycastle.asn1.ASN1Primitive.fromByteArray(bCDSTU4145PublicKey.getEncoded())).getPublicKeyData();
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    public BCDSTU4145PrivateKey(org.bouncycastle.jce.spec.ECPrivateKeySpec eCPrivateKeySpec) {
        this.Camera2StreamConfigurationMap = "DSTU4145";
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
        this.getHighSpeedVideoFpsRangesFor = eCPrivateKeySpec.getD();
        this.getHighResolutionOutputSizeshNQ4ISI = eCPrivateKeySpec.getParams() != null ? org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(eCPrivateKeySpec.getParams().getCurve(), eCPrivateKeySpec.getParams().getSeed()), eCPrivateKeySpec.getParams()) : null;
    }

    public BCDSTU4145PrivateKey(org.bouncycastle.jcajce.provider.asymmetric.dstu.BCDSTU4145PrivateKey bCDSTU4145PrivateKey) {
        this.Camera2StreamConfigurationMap = "DSTU4145";
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
        this.getHighSpeedVideoFpsRangesFor = bCDSTU4145PrivateKey.getHighSpeedVideoFpsRangesFor;
        this.getHighResolutionOutputSizeshNQ4ISI = bCDSTU4145PrivateKey.getHighResolutionOutputSizeshNQ4ISI;
        this.getOutputFormats = bCDSTU4145PrivateKey.getOutputFormats;
        this.getHighSpeedVideoFpsRanges = bCDSTU4145PrivateKey.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoSizes = bCDSTU4145PrivateKey.getHighSpeedVideoSizes;
    }

    BCDSTU4145PrivateKey(org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo) throws java.io.IOException {
        this.Camera2StreamConfigurationMap = "DSTU4145";
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
        getHighResolutionOutputSizeshNQ4ISI(privateKeyInfo);
    }

    public BCDSTU4145PrivateKey(java.security.spec.ECPrivateKeySpec eCPrivateKeySpec) {
        this.Camera2StreamConfigurationMap = "DSTU4145";
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
        this.getHighSpeedVideoFpsRangesFor = eCPrivateKeySpec.getS();
        this.getHighResolutionOutputSizeshNQ4ISI = eCPrivateKeySpec.getParams();
    }

    public BCDSTU4145PrivateKey(java.security.interfaces.ECPrivateKey eCPrivateKey) {
        this.Camera2StreamConfigurationMap = "DSTU4145";
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
        this.getHighSpeedVideoFpsRangesFor = eCPrivateKey.getS();
        this.Camera2StreamConfigurationMap = eCPrivateKey.getAlgorithm();
        this.getHighResolutionOutputSizeshNQ4ISI = eCPrivateKey.getParams();
    }

    public BCDSTU4145PrivateKey(java.lang.String str, org.bouncycastle.crypto.params.ECPrivateKeyParameters eCPrivateKeyParameters, org.bouncycastle.jcajce.provider.asymmetric.dstu.BCDSTU4145PublicKey bCDSTU4145PublicKey, org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpec) {
        this.Camera2StreamConfigurationMap = "DSTU4145";
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
        org.bouncycastle.crypto.params.ECDomainParameters parameters = eCPrivateKeyParameters.getParameters();
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoFpsRangesFor = eCPrivateKeyParameters.getD();
        this.getHighResolutionOutputSizeshNQ4ISI = eCParameterSpec == null ? new java.security.spec.ECParameterSpec(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(parameters.getG()), parameters.getN(), parameters.getH().intValue()) : new java.security.spec.ECParameterSpec(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(eCParameterSpec.getCurve(), eCParameterSpec.getSeed()), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(eCParameterSpec.getG()), eCParameterSpec.getN(), eCParameterSpec.getH().intValue());
        this.getHighSpeedVideoSizes = Camera2StreamConfigurationMap(bCDSTU4145PublicKey);
    }

    public BCDSTU4145PrivateKey(java.lang.String str, org.bouncycastle.crypto.params.ECPrivateKeyParameters eCPrivateKeyParameters, org.bouncycastle.jcajce.provider.asymmetric.dstu.BCDSTU4145PublicKey bCDSTU4145PublicKey, java.security.spec.ECParameterSpec eCParameterSpec) {
        this.Camera2StreamConfigurationMap = "DSTU4145";
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
        org.bouncycastle.crypto.params.ECDomainParameters parameters = eCPrivateKeyParameters.getParameters();
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoFpsRangesFor = eCPrivateKeyParameters.getD();
        if (eCParameterSpec == null) {
            this.getHighResolutionOutputSizeshNQ4ISI = new java.security.spec.ECParameterSpec(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(parameters.getG()), parameters.getN(), parameters.getH().intValue());
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI = eCParameterSpec;
        }
        this.getHighSpeedVideoSizes = Camera2StreamConfigurationMap(bCDSTU4145PublicKey);
    }

    public BCDSTU4145PrivateKey(java.lang.String str, org.bouncycastle.crypto.params.ECPrivateKeyParameters eCPrivateKeyParameters) {
        this.Camera2StreamConfigurationMap = "DSTU4145";
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoFpsRangesFor = eCPrivateKeyParameters.getD();
        this.getHighResolutionOutputSizeshNQ4ISI = null;
    }

    protected BCDSTU4145PrivateKey() {
        this.Camera2StreamConfigurationMap = "DSTU4145";
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
    }
}
