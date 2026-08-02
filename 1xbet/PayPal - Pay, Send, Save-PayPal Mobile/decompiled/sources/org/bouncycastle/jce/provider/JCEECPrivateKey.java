package org.bouncycastle.jce.provider;

/* loaded from: classes17.dex */
public class JCEECPrivateKey implements java.security.interfaces.ECPrivateKey, org.bouncycastle.jce.interfaces.ECPrivateKey, org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier, org.bouncycastle.jce.interfaces.ECPointEncoder {
    private org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl Camera2StreamConfigurationMap;
    private java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private java.math.BigInteger getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.ASN1BitString getHighSpeedVideoFpsRangesFor;
    private java.security.spec.ECParameterSpec getHighSpeedVideoSizes;
    private boolean getOutputFormats;

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        org.bouncycastle.jce.spec.ECNamedCurveSpec eCNamedCurveSpec;
        org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo = org.bouncycastle.asn1.pkcs.PrivateKeyInfo.getInstance(org.bouncycastle.asn1.ASN1Primitive.fromByteArray((byte[]) objectInputStream.readObject()));
        org.bouncycastle.asn1.x9.X962Parameters x962Parameters = org.bouncycastle.asn1.x9.X962Parameters.getInstance(privateKeyInfo.getPrivateKeyAlgorithm().getParameters());
        if (x962Parameters.isNamedCurve()) {
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(x962Parameters.getParameters());
            org.bouncycastle.asn1.x9.X9ECParameters namedCurveByOid = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getNamedCurveByOid(aSN1ObjectIdentifier);
            if (namedCurveByOid == null) {
                org.bouncycastle.crypto.params.ECDomainParameters byOID = org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves.getByOID(aSN1ObjectIdentifier);
                eCNamedCurveSpec = new org.bouncycastle.jce.spec.ECNamedCurveSpec(org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves.getName(aSN1ObjectIdentifier), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(byOID.getCurve(), byOID.getSeed()), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(byOID.getG()), byOID.getN(), byOID.getH());
            } else {
                eCNamedCurveSpec = new org.bouncycastle.jce.spec.ECNamedCurveSpec(org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getCurveName(aSN1ObjectIdentifier), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(namedCurveByOid.getCurve(), namedCurveByOid.getSeed()), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(namedCurveByOid.getG()), namedCurveByOid.getN(), namedCurveByOid.getH());
            }
            this.getHighSpeedVideoSizes = eCNamedCurveSpec;
        } else if (x962Parameters.isImplicitlyCA()) {
            this.getHighSpeedVideoSizes = null;
        } else {
            org.bouncycastle.asn1.x9.X9ECParameters x9ECParameters = org.bouncycastle.asn1.x9.X9ECParameters.getInstance(x962Parameters.getParameters());
            this.getHighSpeedVideoSizes = new java.security.spec.ECParameterSpec(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(x9ECParameters.getCurve(), x9ECParameters.getSeed()), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(x9ECParameters.getG()), x9ECParameters.getN(), x9ECParameters.getH().intValue());
        }
        org.bouncycastle.asn1.ASN1Encodable parsePrivateKey = privateKeyInfo.parsePrivateKey();
        if (parsePrivateKey instanceof org.bouncycastle.asn1.ASN1Integer) {
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1Integer.getInstance(parsePrivateKey).getValue();
        } else {
            org.bouncycastle.asn1.sec.ECPrivateKeyStructure eCPrivateKeyStructure = new org.bouncycastle.asn1.sec.ECPrivateKeyStructure((org.bouncycastle.asn1.ASN1Sequence) parsePrivateKey);
            this.getHighSpeedVideoFpsRanges = eCPrivateKeyStructure.getKey();
            this.getHighSpeedVideoFpsRangesFor = eCPrivateKeyStructure.getPublicKey();
        }
        this.getHighResolutionOutputSizeshNQ4ISI = (java.lang.String) objectInputStream.readObject();
        this.getOutputFormats = objectInputStream.readBoolean();
        org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl pKCS12BagAttributeCarrierImpl = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
        this.Camera2StreamConfigurationMap = pKCS12BagAttributeCarrierImpl;
        pKCS12BagAttributeCarrierImpl.readObject(objectInputStream);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof org.bouncycastle.jce.provider.JCEECPrivateKey)) {
            return false;
        }
        org.bouncycastle.jce.provider.JCEECPrivateKey jCEECPrivateKey = (org.bouncycastle.jce.provider.JCEECPrivateKey) obj;
        if (getD().equals(jCEECPrivateKey.getD())) {
            java.security.spec.ECParameterSpec eCParameterSpec = this.getHighSpeedVideoSizes;
            org.bouncycastle.jce.spec.ECParameterSpec convertSpec = eCParameterSpec != null ? org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(eCParameterSpec) : org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
            java.security.spec.ECParameterSpec eCParameterSpec2 = jCEECPrivateKey.getHighSpeedVideoSizes;
            if (convertSpec.equals(eCParameterSpec2 != null ? org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(eCParameterSpec2) : org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = getD().hashCode();
        java.security.spec.ECParameterSpec eCParameterSpec = this.getHighSpeedVideoSizes;
        return hashCode ^ (eCParameterSpec != null ? org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(eCParameterSpec) : org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa()).hashCode();
    }

    public java.lang.String toString() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("EC Private Key");
        java.lang.String lineSeparator = org.bouncycastle.util.Strings.lineSeparator();
        stringBuffer.append(lineSeparator);
        stringBuffer.append("             S: ").append(this.getHighSpeedVideoFpsRanges.toString(16)).append(lineSeparator);
        return stringBuffer.toString();
    }

    @Override // org.bouncycastle.jce.interfaces.ECPointEncoder
    public void setPointFormat(java.lang.String str) {
        this.getOutputFormats = !"UNCOMPRESSED".equalsIgnoreCase(str);
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public void setBagAttribute(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.Camera2StreamConfigurationMap.setBagAttribute(aSN1ObjectIdentifier, aSN1Encodable);
    }

    @Override // java.security.interfaces.ECPrivateKey
    public java.math.BigInteger getS() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // java.security.interfaces.ECKey
    public java.security.spec.ECParameterSpec getParams() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // org.bouncycastle.jce.interfaces.ECKey
    public org.bouncycastle.jce.spec.ECParameterSpec getParameters() {
        java.security.spec.ECParameterSpec eCParameterSpec = this.getHighSpeedVideoSizes;
        if (eCParameterSpec == null) {
            return null;
        }
        return org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(eCParameterSpec);
    }

    @Override // java.security.Key
    public java.lang.String getFormat() {
        return "PKCS#8";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        org.bouncycastle.asn1.x9.X962Parameters x962Parameters;
        java.security.spec.ECParameterSpec eCParameterSpec = this.getHighSpeedVideoSizes;
        if (eCParameterSpec instanceof org.bouncycastle.jce.spec.ECNamedCurveSpec) {
            org.bouncycastle.asn1.ASN1ObjectIdentifier namedCurveOid = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getNamedCurveOid(((org.bouncycastle.jce.spec.ECNamedCurveSpec) eCParameterSpec).getName());
            if (namedCurveOid == null) {
                namedCurveOid = new org.bouncycastle.asn1.ASN1ObjectIdentifier(((org.bouncycastle.jce.spec.ECNamedCurveSpec) this.getHighSpeedVideoSizes).getName());
            }
            x962Parameters = new org.bouncycastle.asn1.x9.X962Parameters(namedCurveOid);
        } else if (eCParameterSpec == null) {
            x962Parameters = new org.bouncycastle.asn1.x9.X962Parameters((org.bouncycastle.asn1.ASN1Null) org.bouncycastle.asn1.DERNull.INSTANCE);
        } else {
            org.bouncycastle.math.ec.ECCurve convertCurve = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(eCParameterSpec.getCurve());
            x962Parameters = new org.bouncycastle.asn1.x9.X962Parameters(new org.bouncycastle.asn1.x9.X9ECParameters(convertCurve, new org.bouncycastle.asn1.x9.X9ECPoint(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(convertCurve, this.getHighSpeedVideoSizes.getGenerator()), this.getOutputFormats), this.getHighSpeedVideoSizes.getOrder(), java.math.BigInteger.valueOf(this.getHighSpeedVideoSizes.getCofactor()), this.getHighSpeedVideoSizes.getCurve().getSeed()));
        }
        org.bouncycastle.asn1.sec.ECPrivateKeyStructure eCPrivateKeyStructure = this.getHighSpeedVideoFpsRangesFor != null ? new org.bouncycastle.asn1.sec.ECPrivateKeyStructure(getS(), this.getHighSpeedVideoFpsRangesFor, x962Parameters) : new org.bouncycastle.asn1.sec.ECPrivateKeyStructure(getS(), x962Parameters);
        try {
            return (this.getHighResolutionOutputSizeshNQ4ISI.equals("ECGOST3410") ? new org.bouncycastle.asn1.pkcs.PrivateKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3410_2001, x962Parameters.toASN1Primitive()), eCPrivateKeyStructure.toASN1Primitive()) : new org.bouncycastle.asn1.pkcs.PrivateKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.id_ecPublicKey, x962Parameters.toASN1Primitive()), eCPrivateKeyStructure.toASN1Primitive())).getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    @Override // org.bouncycastle.jce.interfaces.ECPrivateKey
    public java.math.BigInteger getD() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public java.util.Enumeration getBagAttributeKeys() {
        return this.Camera2StreamConfigurationMap.getBagAttributeKeys();
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public org.bouncycastle.asn1.ASN1Encodable getBagAttribute(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return this.Camera2StreamConfigurationMap.getBagAttribute(aSN1ObjectIdentifier);
    }

    @Override // java.security.Key
    public java.lang.String getAlgorithm() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.writeObject(getEncoded());
        objectOutputStream.writeObject(this.getHighResolutionOutputSizeshNQ4ISI);
        objectOutputStream.writeBoolean(this.getOutputFormats);
        this.Camera2StreamConfigurationMap.writeObject(objectOutputStream);
    }

    private static org.bouncycastle.asn1.ASN1BitString Camera2StreamConfigurationMap(org.bouncycastle.jce.provider.JCEECPublicKey jCEECPublicKey) {
        try {
            return org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(org.bouncycastle.asn1.ASN1Primitive.fromByteArray(jCEECPublicKey.getEncoded())).getPublicKeyData();
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    public JCEECPrivateKey(java.security.interfaces.ECPrivateKey eCPrivateKey) {
        this.getHighResolutionOutputSizeshNQ4ISI = "EC";
        this.Camera2StreamConfigurationMap = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
        this.getHighSpeedVideoFpsRanges = eCPrivateKey.getS();
        this.getHighResolutionOutputSizeshNQ4ISI = eCPrivateKey.getAlgorithm();
        this.getHighSpeedVideoSizes = eCPrivateKey.getParams();
    }

    public JCEECPrivateKey(java.lang.String str, org.bouncycastle.jce.spec.ECPrivateKeySpec eCPrivateKeySpec) {
        this.getHighResolutionOutputSizeshNQ4ISI = "EC";
        this.Camera2StreamConfigurationMap = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoFpsRanges = eCPrivateKeySpec.getD();
        this.getHighSpeedVideoSizes = eCPrivateKeySpec.getParams() != null ? org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(eCPrivateKeySpec.getParams().getCurve(), eCPrivateKeySpec.getParams().getSeed()), eCPrivateKeySpec.getParams()) : null;
    }

    public JCEECPrivateKey(java.lang.String str, org.bouncycastle.jce.provider.JCEECPrivateKey jCEECPrivateKey) {
        this.getHighResolutionOutputSizeshNQ4ISI = "EC";
        this.Camera2StreamConfigurationMap = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoFpsRanges = jCEECPrivateKey.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoSizes = jCEECPrivateKey.getHighSpeedVideoSizes;
        this.getOutputFormats = jCEECPrivateKey.getOutputFormats;
        this.Camera2StreamConfigurationMap = jCEECPrivateKey.Camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRangesFor = jCEECPrivateKey.getHighSpeedVideoFpsRangesFor;
    }

    public JCEECPrivateKey(java.lang.String str, org.bouncycastle.crypto.params.ECPrivateKeyParameters eCPrivateKeyParameters, org.bouncycastle.jce.provider.JCEECPublicKey jCEECPublicKey, org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpec) {
        this.getHighResolutionOutputSizeshNQ4ISI = "EC";
        this.Camera2StreamConfigurationMap = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoFpsRanges = eCPrivateKeyParameters.getD();
        if (eCParameterSpec == null) {
            org.bouncycastle.crypto.params.ECDomainParameters parameters = eCPrivateKeyParameters.getParameters();
            this.getHighSpeedVideoSizes = new java.security.spec.ECParameterSpec(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(parameters.getG()), parameters.getN(), parameters.getH().intValue());
        } else {
            this.getHighSpeedVideoSizes = new java.security.spec.ECParameterSpec(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(eCParameterSpec.getCurve(), eCParameterSpec.getSeed()), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(eCParameterSpec.getG()), eCParameterSpec.getN(), eCParameterSpec.getH().intValue());
        }
        this.getHighSpeedVideoFpsRangesFor = Camera2StreamConfigurationMap(jCEECPublicKey);
    }

    public JCEECPrivateKey(java.lang.String str, org.bouncycastle.crypto.params.ECPrivateKeyParameters eCPrivateKeyParameters, org.bouncycastle.jce.provider.JCEECPublicKey jCEECPublicKey, java.security.spec.ECParameterSpec eCParameterSpec) {
        this.getHighResolutionOutputSizeshNQ4ISI = "EC";
        this.Camera2StreamConfigurationMap = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoFpsRanges = eCPrivateKeyParameters.getD();
        if (eCParameterSpec == null) {
            org.bouncycastle.crypto.params.ECDomainParameters parameters = eCPrivateKeyParameters.getParameters();
            eCParameterSpec = new java.security.spec.ECParameterSpec(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(parameters.getG()), parameters.getN(), parameters.getH().intValue());
        }
        this.getHighSpeedVideoSizes = eCParameterSpec;
        this.getHighSpeedVideoFpsRangesFor = Camera2StreamConfigurationMap(jCEECPublicKey);
    }

    public JCEECPrivateKey(java.lang.String str, org.bouncycastle.crypto.params.ECPrivateKeyParameters eCPrivateKeyParameters) {
        this.getHighResolutionOutputSizeshNQ4ISI = "EC";
        this.Camera2StreamConfigurationMap = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoFpsRanges = eCPrivateKeyParameters.getD();
        this.getHighSpeedVideoSizes = null;
    }

    public JCEECPrivateKey(java.lang.String str, java.security.spec.ECPrivateKeySpec eCPrivateKeySpec) {
        this.getHighResolutionOutputSizeshNQ4ISI = "EC";
        this.Camera2StreamConfigurationMap = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoFpsRanges = eCPrivateKeySpec.getS();
        this.getHighSpeedVideoSizes = eCPrivateKeySpec.getParams();
    }

    protected JCEECPrivateKey() {
        this.getHighResolutionOutputSizeshNQ4ISI = "EC";
        this.Camera2StreamConfigurationMap = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
    }
}
