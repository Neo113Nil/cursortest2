package org.bouncycastle.jcajce.provider.asymmetric.ec;

/* loaded from: classes17.dex */
public class BCECPrivateKey implements java.security.interfaces.ECPrivateKey, org.bouncycastle.jce.interfaces.ECPrivateKey, org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier, org.bouncycastle.jce.interfaces.ECPointEncoder {
    static final long serialVersionUID = 994553197664784084L;
    private transient java.security.spec.ECParameterSpec Camera2StreamConfigurationMap;
    private transient java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.String getHighSpeedVideoFpsRanges;
    private transient org.bouncycastle.jcajce.provider.config.ProviderConfiguration getHighSpeedVideoFpsRangesFor;
    private transient org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl getHighSpeedVideoSizes;
    private transient org.bouncycastle.asn1.ASN1BitString getHighSpeedVideoSizesFor;
    private boolean getInputFormats;

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPrivateKey)) {
            return false;
        }
        org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPrivateKey bCECPrivateKey = (org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPrivateKey) obj;
        if (getD().equals(bCECPrivateKey.getD())) {
            java.security.spec.ECParameterSpec eCParameterSpec = this.Camera2StreamConfigurationMap;
            org.bouncycastle.jce.spec.ECParameterSpec convertSpec = eCParameterSpec != null ? org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(eCParameterSpec) : this.getHighSpeedVideoFpsRangesFor.getEcImplicitlyCa();
            java.security.spec.ECParameterSpec eCParameterSpec2 = bCECPrivateKey.Camera2StreamConfigurationMap;
            if (convertSpec.equals(eCParameterSpec2 != null ? org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(eCParameterSpec2) : bCECPrivateKey.getHighSpeedVideoFpsRangesFor.getEcImplicitlyCa())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = getD().hashCode();
        java.security.spec.ECParameterSpec eCParameterSpec = this.Camera2StreamConfigurationMap;
        return hashCode ^ (eCParameterSpec != null ? org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(eCParameterSpec) : this.getHighSpeedVideoFpsRangesFor.getEcImplicitlyCa()).hashCode();
    }

    public java.lang.String toString() {
        java.math.BigInteger bigInteger = this.getHighResolutionOutputSizeshNQ4ISI;
        java.security.spec.ECParameterSpec eCParameterSpec = this.Camera2StreamConfigurationMap;
        return org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.privateKeyToString("EC", bigInteger, eCParameterSpec != null ? org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(eCParameterSpec) : this.getHighSpeedVideoFpsRangesFor.getEcImplicitlyCa());
    }

    @Override // org.bouncycastle.jce.interfaces.ECPointEncoder
    public void setPointFormat(java.lang.String str) {
        this.getInputFormats = !"UNCOMPRESSED".equalsIgnoreCase(str);
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public void setBagAttribute(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.getHighSpeedVideoSizes.setBagAttribute(aSN1ObjectIdentifier, aSN1Encodable);
    }

    @Override // java.security.interfaces.ECPrivateKey
    public java.math.BigInteger getS() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
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
        return "PKCS#8";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        org.bouncycastle.asn1.x9.X962Parameters highSpeedVideoFpsRangesFor = org.bouncycastle.jcajce.provider.asymmetric.ec.ECUtils.getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap, this.getInputFormats);
        java.security.spec.ECParameterSpec eCParameterSpec = this.Camera2StreamConfigurationMap;
        int orderBitLength = eCParameterSpec == null ? org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getOrderBitLength(this.getHighSpeedVideoFpsRangesFor, null, getS()) : org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getOrderBitLength(this.getHighSpeedVideoFpsRangesFor, eCParameterSpec.getOrder(), getS());
        try {
            return new org.bouncycastle.asn1.pkcs.PrivateKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.id_ecPublicKey, highSpeedVideoFpsRangesFor), this.getHighSpeedVideoSizesFor != null ? new org.bouncycastle.asn1.sec.ECPrivateKey(orderBitLength, getS(), this.getHighSpeedVideoSizesFor, highSpeedVideoFpsRangesFor) : new org.bouncycastle.asn1.sec.ECPrivateKey(orderBitLength, getS(), highSpeedVideoFpsRangesFor)).getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    @Override // org.bouncycastle.jce.interfaces.ECPrivateKey
    public java.math.BigInteger getD() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public java.util.Enumeration getBagAttributeKeys() {
        return this.getHighSpeedVideoSizes.getBagAttributeKeys();
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public org.bouncycastle.asn1.ASN1Encodable getBagAttribute(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return this.getHighSpeedVideoSizes.getBagAttribute(aSN1ObjectIdentifier);
    }

    @Override // java.security.Key
    public java.lang.String getAlgorithm() {
        return this.getHighSpeedVideoFpsRanges;
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        objectInputStream.defaultReadObject();
        byte[] bArr = (byte[]) objectInputStream.readObject();
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION;
        Camera2StreamConfigurationMap(org.bouncycastle.asn1.pkcs.PrivateKeyInfo.getInstance(org.bouncycastle.asn1.ASN1Primitive.fromByteArray(bArr)));
        this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
    }

    private void Camera2StreamConfigurationMap(org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo) throws java.io.IOException {
        org.bouncycastle.asn1.x9.X962Parameters x962Parameters = org.bouncycastle.asn1.x9.X962Parameters.getInstance(privateKeyInfo.getPrivateKeyAlgorithm().getParameters());
        this.Camera2StreamConfigurationMap = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertToSpec(x962Parameters, org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.getCurve(this.getHighSpeedVideoFpsRangesFor, x962Parameters));
        org.bouncycastle.asn1.ASN1Encodable parsePrivateKey = privateKeyInfo.parsePrivateKey();
        if (parsePrivateKey instanceof org.bouncycastle.asn1.ASN1Integer) {
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1Integer.getInstance(parsePrivateKey).getValue();
            return;
        }
        org.bouncycastle.asn1.sec.ECPrivateKey eCPrivateKey = org.bouncycastle.asn1.sec.ECPrivateKey.getInstance(parsePrivateKey);
        this.getHighResolutionOutputSizeshNQ4ISI = eCPrivateKey.getKey();
        this.getHighSpeedVideoSizesFor = eCPrivateKey.getPublicKey();
    }

    private static org.bouncycastle.asn1.ASN1BitString Camera2StreamConfigurationMap(org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPublicKey bCECPublicKey) {
        try {
            return org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(org.bouncycastle.asn1.ASN1Primitive.fromByteArray(bCECPublicKey.getEncoded())).getPublicKeyData();
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    public BCECPrivateKey(java.security.interfaces.ECPrivateKey eCPrivateKey, org.bouncycastle.jcajce.provider.config.ProviderConfiguration providerConfiguration) {
        this.getHighSpeedVideoFpsRanges = "EC";
        this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
        this.getHighResolutionOutputSizeshNQ4ISI = eCPrivateKey.getS();
        this.getHighSpeedVideoFpsRanges = eCPrivateKey.getAlgorithm();
        this.Camera2StreamConfigurationMap = eCPrivateKey.getParams();
        this.getHighSpeedVideoFpsRangesFor = providerConfiguration;
    }

    public BCECPrivateKey(java.lang.String str, org.bouncycastle.jce.spec.ECPrivateKeySpec eCPrivateKeySpec, org.bouncycastle.jcajce.provider.config.ProviderConfiguration providerConfiguration) {
        this.getHighSpeedVideoFpsRanges = "EC";
        this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighResolutionOutputSizeshNQ4ISI = eCPrivateKeySpec.getD();
        this.Camera2StreamConfigurationMap = eCPrivateKeySpec.getParams() != null ? org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(eCPrivateKeySpec.getParams().getCurve(), eCPrivateKeySpec.getParams().getSeed()), eCPrivateKeySpec.getParams()) : null;
        this.getHighSpeedVideoFpsRangesFor = providerConfiguration;
    }

    public BCECPrivateKey(java.lang.String str, org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPrivateKey bCECPrivateKey) {
        this.getHighSpeedVideoFpsRanges = "EC";
        this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighResolutionOutputSizeshNQ4ISI = bCECPrivateKey.getHighResolutionOutputSizeshNQ4ISI;
        this.Camera2StreamConfigurationMap = bCECPrivateKey.Camera2StreamConfigurationMap;
        this.getInputFormats = bCECPrivateKey.getInputFormats;
        this.getHighSpeedVideoSizes = bCECPrivateKey.getHighSpeedVideoSizes;
        this.getHighSpeedVideoSizesFor = bCECPrivateKey.getHighSpeedVideoSizesFor;
        this.getHighSpeedVideoFpsRangesFor = bCECPrivateKey.getHighSpeedVideoFpsRangesFor;
    }

    public BCECPrivateKey(java.lang.String str, org.bouncycastle.crypto.params.ECPrivateKeyParameters eCPrivateKeyParameters, org.bouncycastle.jcajce.provider.config.ProviderConfiguration providerConfiguration) {
        this.getHighSpeedVideoFpsRanges = "EC";
        this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighResolutionOutputSizeshNQ4ISI = eCPrivateKeyParameters.getD();
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoFpsRangesFor = providerConfiguration;
    }

    public BCECPrivateKey(java.lang.String str, org.bouncycastle.crypto.params.ECPrivateKeyParameters eCPrivateKeyParameters, org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPublicKey bCECPublicKey, org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpec, org.bouncycastle.jcajce.provider.config.ProviderConfiguration providerConfiguration) {
        this.getHighSpeedVideoFpsRanges = "EC";
        this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighResolutionOutputSizeshNQ4ISI = eCPrivateKeyParameters.getD();
        this.getHighSpeedVideoFpsRangesFor = providerConfiguration;
        if (eCParameterSpec == null) {
            org.bouncycastle.crypto.params.ECDomainParameters parameters = eCPrivateKeyParameters.getParameters();
            this.Camera2StreamConfigurationMap = new java.security.spec.ECParameterSpec(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(parameters.getG()), parameters.getN(), parameters.getH().intValue());
        } else {
            this.Camera2StreamConfigurationMap = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(eCParameterSpec.getCurve(), eCParameterSpec.getSeed()), eCParameterSpec);
        }
        try {
            this.getHighSpeedVideoSizesFor = Camera2StreamConfigurationMap(bCECPublicKey);
        } catch (java.lang.Exception unused) {
            this.getHighSpeedVideoSizesFor = null;
        }
    }

    public BCECPrivateKey(java.lang.String str, org.bouncycastle.crypto.params.ECPrivateKeyParameters eCPrivateKeyParameters, org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPublicKey bCECPublicKey, java.security.spec.ECParameterSpec eCParameterSpec, org.bouncycastle.jcajce.provider.config.ProviderConfiguration providerConfiguration) {
        this.getHighSpeedVideoFpsRanges = "EC";
        this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighResolutionOutputSizeshNQ4ISI = eCPrivateKeyParameters.getD();
        this.getHighSpeedVideoFpsRangesFor = providerConfiguration;
        if (eCParameterSpec == null) {
            org.bouncycastle.crypto.params.ECDomainParameters parameters = eCPrivateKeyParameters.getParameters();
            eCParameterSpec = new java.security.spec.ECParameterSpec(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(parameters.getG()), parameters.getN(), parameters.getH().intValue());
        }
        this.Camera2StreamConfigurationMap = eCParameterSpec;
        this.getHighSpeedVideoSizesFor = Camera2StreamConfigurationMap(bCECPublicKey);
    }

    BCECPrivateKey(java.lang.String str, org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo, org.bouncycastle.jcajce.provider.config.ProviderConfiguration providerConfiguration) throws java.io.IOException {
        this.getHighSpeedVideoFpsRanges = "EC";
        this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighSpeedVideoFpsRangesFor = providerConfiguration;
        Camera2StreamConfigurationMap(privateKeyInfo);
    }

    public BCECPrivateKey(java.lang.String str, java.security.spec.ECPrivateKeySpec eCPrivateKeySpec, org.bouncycastle.jcajce.provider.config.ProviderConfiguration providerConfiguration) {
        this.getHighSpeedVideoFpsRanges = "EC";
        this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighResolutionOutputSizeshNQ4ISI = eCPrivateKeySpec.getS();
        this.Camera2StreamConfigurationMap = eCPrivateKeySpec.getParams();
        this.getHighSpeedVideoFpsRangesFor = providerConfiguration;
    }

    protected BCECPrivateKey() {
        this.getHighSpeedVideoFpsRanges = "EC";
        this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
    }
}
