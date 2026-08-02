package org.bouncycastle.jcajce.provider.asymmetric.ec;

/* loaded from: classes17.dex */
public class BCECPublicKey implements java.security.interfaces.ECPublicKey, org.bouncycastle.jce.interfaces.ECPublicKey, org.bouncycastle.jce.interfaces.ECPointEncoder {
    static final long serialVersionUID = 2422789860422731812L;
    private transient java.security.spec.ECParameterSpec Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    transient org.bouncycastle.crypto.params.ECPublicKeyParameters getHighSpeedVideoFpsRanges;
    private java.lang.String getHighSpeedVideoFpsRangesFor;
    private transient org.bouncycastle.jcajce.provider.config.ProviderConfiguration getHighSpeedVideoSizes;

    public BCECPublicKey(java.lang.String str, org.bouncycastle.crypto.params.ECPublicKeyParameters eCPublicKeyParameters, java.security.spec.ECParameterSpec eCParameterSpec, org.bouncycastle.jcajce.provider.config.ProviderConfiguration providerConfiguration) {
        this.getHighSpeedVideoFpsRangesFor = "EC";
        org.bouncycastle.crypto.params.ECDomainParameters parameters = eCPublicKeyParameters.getParameters();
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoFpsRanges = eCPublicKeyParameters;
        if (eCParameterSpec == null) {
            this.Camera2StreamConfigurationMap = new java.security.spec.ECParameterSpec(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(parameters.getG()), parameters.getN(), parameters.getH().intValue());
        } else {
            this.Camera2StreamConfigurationMap = eCParameterSpec;
        }
        this.getHighSpeedVideoSizes = providerConfiguration;
    }

    public BCECPublicKey(java.lang.String str, org.bouncycastle.crypto.params.ECPublicKeyParameters eCPublicKeyParameters, org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpec, org.bouncycastle.jcajce.provider.config.ProviderConfiguration providerConfiguration) {
        this.getHighSpeedVideoFpsRangesFor = "EC";
        org.bouncycastle.crypto.params.ECDomainParameters parameters = eCPublicKeyParameters.getParameters();
        this.getHighSpeedVideoFpsRangesFor = str;
        this.Camera2StreamConfigurationMap = eCParameterSpec == null ? new java.security.spec.ECParameterSpec(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(parameters.getG()), parameters.getN(), parameters.getH().intValue()) : org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(eCParameterSpec.getCurve(), eCParameterSpec.getSeed()), eCParameterSpec);
        this.getHighSpeedVideoFpsRanges = eCPublicKeyParameters;
        this.getHighSpeedVideoSizes = providerConfiguration;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPublicKey)) {
            return false;
        }
        org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPublicKey bCECPublicKey = (org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPublicKey) obj;
        if (this.getHighSpeedVideoFpsRanges.getQ().equals(bCECPublicKey.getHighSpeedVideoFpsRanges.getQ())) {
            java.security.spec.ECParameterSpec eCParameterSpec = this.Camera2StreamConfigurationMap;
            org.bouncycastle.jce.spec.ECParameterSpec convertSpec = eCParameterSpec != null ? org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(eCParameterSpec) : this.getHighSpeedVideoSizes.getEcImplicitlyCa();
            java.security.spec.ECParameterSpec eCParameterSpec2 = bCECPublicKey.Camera2StreamConfigurationMap;
            if (convertSpec.equals(eCParameterSpec2 != null ? org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(eCParameterSpec2) : bCECPublicKey.getHighSpeedVideoSizes.getEcImplicitlyCa())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.getHighSpeedVideoFpsRanges.getQ().hashCode();
        java.security.spec.ECParameterSpec eCParameterSpec = this.Camera2StreamConfigurationMap;
        return hashCode ^ (eCParameterSpec != null ? org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(eCParameterSpec) : this.getHighSpeedVideoSizes.getEcImplicitlyCa()).hashCode();
    }

    public java.lang.String toString() {
        org.bouncycastle.math.ec.ECPoint q = this.getHighSpeedVideoFpsRanges.getQ();
        java.security.spec.ECParameterSpec eCParameterSpec = this.Camera2StreamConfigurationMap;
        return org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.publicKeyToString("EC", q, eCParameterSpec != null ? org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(eCParameterSpec) : this.getHighSpeedVideoSizes.getEcImplicitlyCa());
    }

    @Override // org.bouncycastle.jce.interfaces.ECPointEncoder
    public void setPointFormat(java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI = !"UNCOMPRESSED".equalsIgnoreCase(str);
    }

    @Override // java.security.interfaces.ECPublicKey
    public java.security.spec.ECPoint getW() {
        return org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(this.getHighSpeedVideoFpsRanges.getQ());
    }

    @Override // org.bouncycastle.jce.interfaces.ECPublicKey
    public org.bouncycastle.math.ec.ECPoint getQ() {
        org.bouncycastle.math.ec.ECPoint q = this.getHighSpeedVideoFpsRanges.getQ();
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
        boolean z = this.getHighResolutionOutputSizeshNQ4ISI || org.bouncycastle.util.Properties.isOverrideSet("org.bouncycastle.ec.enable_pc");
        return org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil.getEncodedSubjectPublicKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.id_ecPublicKey, org.bouncycastle.jcajce.provider.asymmetric.ec.ECUtils.getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap, z)), this.getHighSpeedVideoFpsRanges.getQ().getEncoded(z));
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
        byte[] bArr = (byte[]) objectInputStream.readObject();
        this.getHighSpeedVideoSizes = org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION;
        Camera2StreamConfigurationMap(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(org.bouncycastle.asn1.ASN1Primitive.fromByteArray(bArr)));
    }

    private void Camera2StreamConfigurationMap(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) {
        byte b;
        org.bouncycastle.asn1.x9.X962Parameters x962Parameters = org.bouncycastle.asn1.x9.X962Parameters.getInstance(subjectPublicKeyInfo.getAlgorithm().getParameters());
        org.bouncycastle.math.ec.ECCurve curve = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.getCurve(this.getHighSpeedVideoSizes, x962Parameters);
        this.Camera2StreamConfigurationMap = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertToSpec(x962Parameters, curve);
        byte[] bytes = subjectPublicKeyInfo.getPublicKeyData().getBytes();
        org.bouncycastle.asn1.ASN1OctetString dEROctetString = new org.bouncycastle.asn1.DEROctetString(bytes);
        if (bytes[0] == 4 && bytes[1] == bytes.length - 2 && (((b = bytes[2]) == 2 || b == 3) && new org.bouncycastle.asn1.x9.X9IntegerConverter().getByteLength(curve) >= bytes.length - 3)) {
            try {
                dEROctetString = (org.bouncycastle.asn1.ASN1OctetString) org.bouncycastle.asn1.ASN1Primitive.fromByteArray(bytes);
            } catch (java.io.IOException unused) {
                throw new java.lang.IllegalArgumentException("error recovering public key");
            }
        }
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.crypto.params.ECPublicKeyParameters(new org.bouncycastle.asn1.x9.X9ECPoint(curve, dEROctetString).getPoint(), org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getDomainParameters(this.getHighSpeedVideoSizes, x962Parameters));
    }

    public BCECPublicKey(java.security.interfaces.ECPublicKey eCPublicKey, org.bouncycastle.jcajce.provider.config.ProviderConfiguration providerConfiguration) {
        this.getHighSpeedVideoFpsRangesFor = "EC";
        this.getHighSpeedVideoFpsRangesFor = eCPublicKey.getAlgorithm();
        java.security.spec.ECParameterSpec params = eCPublicKey.getParams();
        this.Camera2StreamConfigurationMap = params;
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.crypto.params.ECPublicKeyParameters(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(params, eCPublicKey.getW()), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.getDomainParameters(providerConfiguration, eCPublicKey.getParams()));
        this.getHighSpeedVideoSizes = providerConfiguration;
    }

    public BCECPublicKey(java.lang.String str, org.bouncycastle.jce.spec.ECPublicKeySpec eCPublicKeySpec, org.bouncycastle.jcajce.provider.config.ProviderConfiguration providerConfiguration) {
        this.getHighSpeedVideoFpsRangesFor = str;
        if (eCPublicKeySpec.getParams() != null) {
            java.security.spec.EllipticCurve convertCurve = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(eCPublicKeySpec.getParams().getCurve(), eCPublicKeySpec.getParams().getSeed());
            this.getHighSpeedVideoFpsRanges = new org.bouncycastle.crypto.params.ECPublicKeyParameters(eCPublicKeySpec.getQ(), org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getDomainParameters(providerConfiguration, eCPublicKeySpec.getParams()));
            this.Camera2StreamConfigurationMap = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(convertCurve, eCPublicKeySpec.getParams());
        } else {
            this.getHighSpeedVideoFpsRanges = new org.bouncycastle.crypto.params.ECPublicKeyParameters(providerConfiguration.getEcImplicitlyCa().getCurve().createPoint(eCPublicKeySpec.getQ().getAffineXCoord().toBigInteger(), eCPublicKeySpec.getQ().getAffineYCoord().toBigInteger()), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.getDomainParameters(providerConfiguration, null));
            this.Camera2StreamConfigurationMap = null;
        }
        this.getHighSpeedVideoSizes = providerConfiguration;
    }

    public BCECPublicKey(java.lang.String str, org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPublicKey bCECPublicKey) {
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoFpsRanges = bCECPublicKey.getHighSpeedVideoFpsRanges;
        this.Camera2StreamConfigurationMap = bCECPublicKey.Camera2StreamConfigurationMap;
        this.getHighResolutionOutputSizeshNQ4ISI = bCECPublicKey.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoSizes = bCECPublicKey.getHighSpeedVideoSizes;
    }

    public BCECPublicKey(java.lang.String str, org.bouncycastle.crypto.params.ECPublicKeyParameters eCPublicKeyParameters, org.bouncycastle.jcajce.provider.config.ProviderConfiguration providerConfiguration) {
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoFpsRanges = eCPublicKeyParameters;
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoSizes = providerConfiguration;
    }

    BCECPublicKey(java.lang.String str, org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo, org.bouncycastle.jcajce.provider.config.ProviderConfiguration providerConfiguration) {
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoSizes = providerConfiguration;
        Camera2StreamConfigurationMap(subjectPublicKeyInfo);
    }

    public BCECPublicKey(java.lang.String str, java.security.spec.ECPublicKeySpec eCPublicKeySpec, org.bouncycastle.jcajce.provider.config.ProviderConfiguration providerConfiguration) {
        this.getHighSpeedVideoFpsRangesFor = str;
        java.security.spec.ECParameterSpec params = eCPublicKeySpec.getParams();
        this.Camera2StreamConfigurationMap = params;
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.crypto.params.ECPublicKeyParameters(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(params, eCPublicKeySpec.getW()), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.getDomainParameters(providerConfiguration, eCPublicKeySpec.getParams()));
        this.getHighSpeedVideoSizes = providerConfiguration;
    }
}
