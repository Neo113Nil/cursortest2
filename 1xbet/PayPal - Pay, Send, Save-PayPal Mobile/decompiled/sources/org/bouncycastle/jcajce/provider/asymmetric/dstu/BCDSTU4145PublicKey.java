package org.bouncycastle.jcajce.provider.asymmetric.dstu;

/* loaded from: classes17.dex */
public class BCDSTU4145PublicKey implements java.security.interfaces.ECPublicKey, org.bouncycastle.jce.interfaces.ECPublicKey, org.bouncycastle.jce.interfaces.ECPointEncoder {
    static final long serialVersionUID = 7026240464295649314L;
    private transient java.security.spec.ECParameterSpec Camera2StreamConfigurationMap;
    transient org.bouncycastle.crypto.params.ECPublicKeyParameters getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRanges;
    private transient org.bouncycastle.asn1.ua.DSTU4145Params getHighSpeedVideoFpsRangesFor;
    private java.lang.String getHighSpeedVideoSizes;

    public BCDSTU4145PublicKey(java.lang.String str, org.bouncycastle.crypto.params.ECPublicKeyParameters eCPublicKeyParameters, java.security.spec.ECParameterSpec eCParameterSpec) {
        this.getHighSpeedVideoSizes = "DSTU4145";
        org.bouncycastle.crypto.params.ECDomainParameters parameters = eCPublicKeyParameters.getParameters();
        this.getHighSpeedVideoSizes = str;
        this.getHighResolutionOutputSizeshNQ4ISI = eCPublicKeyParameters;
        if (eCParameterSpec == null) {
            this.Camera2StreamConfigurationMap = new java.security.spec.ECParameterSpec(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(parameters.getG()), parameters.getN(), parameters.getH().intValue());
        } else {
            this.Camera2StreamConfigurationMap = eCParameterSpec;
        }
    }

    public BCDSTU4145PublicKey(java.lang.String str, org.bouncycastle.crypto.params.ECPublicKeyParameters eCPublicKeyParameters, org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpec) {
        this.getHighSpeedVideoSizes = "DSTU4145";
        org.bouncycastle.crypto.params.ECDomainParameters parameters = eCPublicKeyParameters.getParameters();
        this.getHighSpeedVideoSizes = str;
        this.Camera2StreamConfigurationMap = eCParameterSpec == null ? new java.security.spec.ECParameterSpec(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(parameters.getG()), parameters.getN(), parameters.getH().intValue()) : org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(eCParameterSpec.getCurve(), eCParameterSpec.getSeed()), eCParameterSpec);
        this.getHighResolutionOutputSizeshNQ4ISI = eCPublicKeyParameters;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof org.bouncycastle.jcajce.provider.asymmetric.dstu.BCDSTU4145PublicKey)) {
            return false;
        }
        org.bouncycastle.jcajce.provider.asymmetric.dstu.BCDSTU4145PublicKey bCDSTU4145PublicKey = (org.bouncycastle.jcajce.provider.asymmetric.dstu.BCDSTU4145PublicKey) obj;
        if (this.getHighResolutionOutputSizeshNQ4ISI.getQ().equals(bCDSTU4145PublicKey.getHighResolutionOutputSizeshNQ4ISI.getQ())) {
            java.security.spec.ECParameterSpec eCParameterSpec = this.Camera2StreamConfigurationMap;
            org.bouncycastle.jce.spec.ECParameterSpec convertSpec = eCParameterSpec != null ? org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(eCParameterSpec) : org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
            java.security.spec.ECParameterSpec eCParameterSpec2 = bCDSTU4145PublicKey.Camera2StreamConfigurationMap;
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
        java.lang.String str = this.getHighSpeedVideoSizes;
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

    public byte[] getSbox() {
        org.bouncycastle.asn1.ua.DSTU4145Params dSTU4145Params = this.getHighSpeedVideoFpsRangesFor;
        return dSTU4145Params != null ? dSTU4145Params.getDKE() : org.bouncycastle.asn1.ua.DSTU4145Params.getDefaultDKE();
    }

    @Override // org.bouncycastle.jce.interfaces.ECPublicKey
    public org.bouncycastle.math.ec.ECPoint getQ() {
        org.bouncycastle.math.ec.ECPoint q = this.getHighResolutionOutputSizeshNQ4ISI.getQ();
        return this.Camera2StreamConfigurationMap == null ? q.getDetachedPoint() : q;
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

    @Override // java.security.Key
    public java.lang.String getFormat() {
        return "X.509";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = this.getHighSpeedVideoFpsRangesFor;
        if (aSN1Encodable == null) {
            java.security.spec.ECParameterSpec eCParameterSpec = this.Camera2StreamConfigurationMap;
            if (eCParameterSpec instanceof org.bouncycastle.jce.spec.ECNamedCurveSpec) {
                aSN1Encodable = new org.bouncycastle.asn1.ua.DSTU4145Params(new org.bouncycastle.asn1.ASN1ObjectIdentifier(((org.bouncycastle.jce.spec.ECNamedCurveSpec) this.Camera2StreamConfigurationMap).getName()));
            } else {
                org.bouncycastle.math.ec.ECCurve convertCurve = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(eCParameterSpec.getCurve());
                aSN1Encodable = new org.bouncycastle.asn1.x9.X962Parameters(new org.bouncycastle.asn1.x9.X9ECParameters(convertCurve, new org.bouncycastle.asn1.x9.X9ECPoint(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(convertCurve, this.Camera2StreamConfigurationMap.getGenerator()), this.getHighSpeedVideoFpsRanges), this.Camera2StreamConfigurationMap.getOrder(), java.math.BigInteger.valueOf(this.Camera2StreamConfigurationMap.getCofactor()), this.Camera2StreamConfigurationMap.getCurve().getSeed()));
            }
        }
        try {
            return org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil.getEncodedSubjectPublicKeyInfo(new org.bouncycastle.asn1.x509.SubjectPublicKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu4145be, aSN1Encodable), new org.bouncycastle.asn1.DEROctetString(org.bouncycastle.asn1.ua.DSTU4145PointEncoder.encodePoint(this.getHighResolutionOutputSizeshNQ4ISI.getQ()))));
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public java.lang.String getAlgorithm() {
        return this.getHighSpeedVideoSizes;
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    private static void getHighSpeedVideoFpsRangesFor(byte[] bArr) {
        for (int i = 0; i < bArr.length / 2; i++) {
            byte b = bArr[i];
            bArr[i] = bArr[(bArr.length - 1) - i];
            bArr[(bArr.length - 1) - i] = b;
        }
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        objectInputStream.defaultReadObject();
        getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(org.bouncycastle.asn1.ASN1Primitive.fromByteArray((byte[]) objectInputStream.readObject())));
    }

    private void getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) {
        org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpec;
        org.bouncycastle.asn1.x9.X9ECParameters x9ECParameters;
        java.security.spec.ECParameterSpec convertToSpec;
        org.bouncycastle.asn1.ASN1BitString publicKeyData = subjectPublicKeyInfo.getPublicKeyData();
        this.getHighSpeedVideoSizes = "DSTU4145";
        try {
            byte[] octets = ((org.bouncycastle.asn1.ASN1OctetString) org.bouncycastle.asn1.ASN1Primitive.fromByteArray(publicKeyData.getBytes())).getOctets();
            if (subjectPublicKeyInfo.getAlgorithm().getAlgorithm().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu4145le)) {
                getHighSpeedVideoFpsRangesFor(octets);
            }
            org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(subjectPublicKeyInfo.getAlgorithm().getParameters());
            if (aSN1Sequence.getObjectAt(0) instanceof org.bouncycastle.asn1.ASN1Integer) {
                x9ECParameters = org.bouncycastle.asn1.x9.X9ECParameters.getInstance(aSN1Sequence);
                eCParameterSpec = new org.bouncycastle.jce.spec.ECParameterSpec(x9ECParameters.getCurve(), x9ECParameters.getG(), x9ECParameters.getN(), x9ECParameters.getH(), x9ECParameters.getSeed());
            } else {
                org.bouncycastle.asn1.ua.DSTU4145Params dSTU4145Params = org.bouncycastle.asn1.ua.DSTU4145Params.getInstance(aSN1Sequence);
                this.getHighSpeedVideoFpsRangesFor = dSTU4145Params;
                if (dSTU4145Params.isNamedCurve()) {
                    org.bouncycastle.asn1.ASN1ObjectIdentifier namedCurve = this.getHighSpeedVideoFpsRangesFor.getNamedCurve();
                    org.bouncycastle.crypto.params.ECDomainParameters byOID = org.bouncycastle.asn1.ua.DSTU4145NamedCurves.getByOID(namedCurve);
                    eCParameterSpec = new org.bouncycastle.jce.spec.ECNamedCurveParameterSpec(namedCurve.getId(), byOID.getCurve(), byOID.getG(), byOID.getN(), byOID.getH(), byOID.getSeed());
                } else {
                    org.bouncycastle.asn1.ua.DSTU4145ECBinary eCBinary = this.getHighSpeedVideoFpsRangesFor.getECBinary();
                    byte[] b = eCBinary.getB();
                    if (subjectPublicKeyInfo.getAlgorithm().getAlgorithm().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu4145le)) {
                        getHighSpeedVideoFpsRangesFor(b);
                    }
                    org.bouncycastle.asn1.ua.DSTU4145BinaryField field = eCBinary.getField();
                    org.bouncycastle.math.ec.ECCurve.F2m f2m = new org.bouncycastle.math.ec.ECCurve.F2m(field.getM(), field.getK1(), field.getK2(), field.getK3(), eCBinary.getA(), new java.math.BigInteger(1, b));
                    byte[] g = eCBinary.getG();
                    if (subjectPublicKeyInfo.getAlgorithm().getAlgorithm().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu4145le)) {
                        getHighSpeedVideoFpsRangesFor(g);
                    }
                    eCParameterSpec = new org.bouncycastle.jce.spec.ECParameterSpec(f2m, org.bouncycastle.asn1.ua.DSTU4145PointEncoder.decodePoint(f2m, g), eCBinary.getN());
                }
                x9ECParameters = null;
            }
            org.bouncycastle.math.ec.ECCurve curve = eCParameterSpec.getCurve();
            java.security.spec.EllipticCurve convertCurve = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(curve, eCParameterSpec.getSeed());
            if (this.getHighSpeedVideoFpsRangesFor != null) {
                java.security.spec.ECPoint convertPoint = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(eCParameterSpec.getG());
                convertToSpec = this.getHighSpeedVideoFpsRangesFor.isNamedCurve() ? new org.bouncycastle.jce.spec.ECNamedCurveSpec(this.getHighSpeedVideoFpsRangesFor.getNamedCurve().getId(), convertCurve, convertPoint, eCParameterSpec.getN(), eCParameterSpec.getH()) : new java.security.spec.ECParameterSpec(convertCurve, convertPoint, eCParameterSpec.getN(), eCParameterSpec.getH().intValue());
            } else {
                convertToSpec = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertToSpec(x9ECParameters);
            }
            this.Camera2StreamConfigurationMap = convertToSpec;
            this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.crypto.params.ECPublicKeyParameters(org.bouncycastle.asn1.ua.DSTU4145PointEncoder.decodePoint(curve, octets), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.getDomainParameters(null, this.Camera2StreamConfigurationMap));
        } catch (java.io.IOException unused) {
            throw new java.lang.IllegalArgumentException("error recovering public key");
        }
    }

    public BCDSTU4145PublicKey(org.bouncycastle.jce.spec.ECPublicKeySpec eCPublicKeySpec, org.bouncycastle.jcajce.provider.config.ProviderConfiguration providerConfiguration) {
        this.getHighSpeedVideoSizes = "DSTU4145";
        if (eCPublicKeySpec.getParams() == null) {
            this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.crypto.params.ECPublicKeyParameters(providerConfiguration.getEcImplicitlyCa().getCurve().createPoint(eCPublicKeySpec.getQ().getAffineXCoord().toBigInteger(), eCPublicKeySpec.getQ().getAffineYCoord().toBigInteger()), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.getDomainParameters(providerConfiguration, null));
            this.Camera2StreamConfigurationMap = null;
        } else {
            java.security.spec.EllipticCurve convertCurve = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(eCPublicKeySpec.getParams().getCurve(), eCPublicKeySpec.getParams().getSeed());
            this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.crypto.params.ECPublicKeyParameters(eCPublicKeySpec.getQ(), org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getDomainParameters(providerConfiguration, eCPublicKeySpec.getParams()));
            this.Camera2StreamConfigurationMap = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(convertCurve, eCPublicKeySpec.getParams());
        }
    }

    public BCDSTU4145PublicKey(org.bouncycastle.jcajce.provider.asymmetric.dstu.BCDSTU4145PublicKey bCDSTU4145PublicKey) {
        this.getHighSpeedVideoSizes = "DSTU4145";
        this.getHighResolutionOutputSizeshNQ4ISI = bCDSTU4145PublicKey.getHighResolutionOutputSizeshNQ4ISI;
        this.Camera2StreamConfigurationMap = bCDSTU4145PublicKey.Camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRanges = bCDSTU4145PublicKey.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoFpsRangesFor = bCDSTU4145PublicKey.getHighSpeedVideoFpsRangesFor;
    }

    BCDSTU4145PublicKey(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) {
        this.getHighSpeedVideoSizes = "DSTU4145";
        getHighResolutionOutputSizeshNQ4ISI(subjectPublicKeyInfo);
    }

    public BCDSTU4145PublicKey(java.security.spec.ECPublicKeySpec eCPublicKeySpec) {
        this.getHighSpeedVideoSizes = "DSTU4145";
        java.security.spec.ECParameterSpec params = eCPublicKeySpec.getParams();
        this.Camera2StreamConfigurationMap = params;
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.crypto.params.ECPublicKeyParameters(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(params, eCPublicKeySpec.getW()), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.getDomainParameters(null, this.Camera2StreamConfigurationMap));
    }

    public BCDSTU4145PublicKey(java.lang.String str, org.bouncycastle.crypto.params.ECPublicKeyParameters eCPublicKeyParameters) {
        this.getHighSpeedVideoSizes = str;
        this.getHighResolutionOutputSizeshNQ4ISI = eCPublicKeyParameters;
        this.Camera2StreamConfigurationMap = null;
    }
}
