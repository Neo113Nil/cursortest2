package org.bouncycastle.jce.provider;

/* loaded from: classes17.dex */
public class JCEECPublicKey implements java.security.interfaces.ECPublicKey, org.bouncycastle.jce.interfaces.ECPublicKey, org.bouncycastle.jce.interfaces.ECPointEncoder {
    private org.bouncycastle.math.ec.ECPoint Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.String getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters getHighSpeedVideoFpsRangesFor;
    private java.security.spec.ECParameterSpec getHighSpeedVideoSizes;

    public JCEECPublicKey(java.lang.String str, org.bouncycastle.crypto.params.ECPublicKeyParameters eCPublicKeyParameters, java.security.spec.ECParameterSpec eCParameterSpec) {
        this.getHighSpeedVideoFpsRanges = "EC";
        org.bouncycastle.crypto.params.ECDomainParameters parameters = eCPublicKeyParameters.getParameters();
        this.getHighSpeedVideoFpsRanges = str;
        this.Camera2StreamConfigurationMap = eCPublicKeyParameters.getQ();
        if (eCParameterSpec == null) {
            this.getHighSpeedVideoSizes = new java.security.spec.ECParameterSpec(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(parameters.getG()), parameters.getN(), parameters.getH().intValue());
        } else {
            this.getHighSpeedVideoSizes = eCParameterSpec;
        }
    }

    public JCEECPublicKey(java.lang.String str, org.bouncycastle.crypto.params.ECPublicKeyParameters eCPublicKeyParameters, org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpec) {
        this.getHighSpeedVideoFpsRanges = "EC";
        org.bouncycastle.crypto.params.ECDomainParameters parameters = eCPublicKeyParameters.getParameters();
        this.getHighSpeedVideoFpsRanges = str;
        this.Camera2StreamConfigurationMap = eCPublicKeyParameters.getQ();
        this.getHighSpeedVideoSizes = eCParameterSpec == null ? new java.security.spec.ECParameterSpec(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(parameters.getG()), parameters.getN(), parameters.getH().intValue()) : org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(eCParameterSpec.getCurve(), eCParameterSpec.getSeed()), eCParameterSpec);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        org.bouncycastle.math.ec.ECCurve curve;
        byte b;
        org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo = org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(org.bouncycastle.asn1.ASN1Primitive.fromByteArray((byte[]) objectInputStream.readObject()));
        org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithm = subjectPublicKeyInfo.getAlgorithm();
        if (algorithm.getAlgorithm().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3410_2001)) {
            org.bouncycastle.asn1.ASN1BitString publicKeyData = subjectPublicKeyInfo.getPublicKeyData();
            this.getHighSpeedVideoFpsRanges = "ECGOST3410";
            try {
                byte[] octets = ((org.bouncycastle.asn1.ASN1OctetString) org.bouncycastle.asn1.ASN1Primitive.fromByteArray(publicKeyData.getBytes())).getOctets();
                byte[] bArr = new byte[65];
                bArr[0] = 4;
                for (int i = 1; i <= 32; i++) {
                    bArr[i] = octets[32 - i];
                    bArr[i + 32] = octets[64 - i];
                }
                org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters gOST3410PublicKeyAlgParameters = org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters.getInstance(algorithm.getParameters());
                this.getHighSpeedVideoFpsRangesFor = gOST3410PublicKeyAlgParameters;
                org.bouncycastle.jce.spec.ECNamedCurveParameterSpec parameterSpec = org.bouncycastle.jce.ECGOST3410NamedCurveTable.getParameterSpec(org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves.getName(gOST3410PublicKeyAlgParameters.getPublicKeyParamSet()));
                org.bouncycastle.math.ec.ECCurve curve2 = parameterSpec.getCurve();
                java.security.spec.EllipticCurve convertCurve = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(curve2, parameterSpec.getSeed());
                this.Camera2StreamConfigurationMap = curve2.decodePoint(bArr);
                this.getHighSpeedVideoSizes = new org.bouncycastle.jce.spec.ECNamedCurveSpec(org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves.getName(this.getHighSpeedVideoFpsRangesFor.getPublicKeyParamSet()), convertCurve, org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(parameterSpec.getG()), parameterSpec.getN(), parameterSpec.getH());
            } catch (java.io.IOException unused) {
                throw new java.lang.IllegalArgumentException("error recovering public key");
            }
        } else {
            org.bouncycastle.asn1.x9.X962Parameters x962Parameters = org.bouncycastle.asn1.x9.X962Parameters.getInstance(algorithm.getParameters());
            if (x962Parameters.isNamedCurve()) {
                org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = (org.bouncycastle.asn1.ASN1ObjectIdentifier) x962Parameters.getParameters();
                org.bouncycastle.asn1.x9.X9ECParameters namedCurveByOid = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getNamedCurveByOid(aSN1ObjectIdentifier);
                curve = namedCurveByOid.getCurve();
                this.getHighSpeedVideoSizes = new org.bouncycastle.jce.spec.ECNamedCurveSpec(org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getCurveName(aSN1ObjectIdentifier), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(curve, namedCurveByOid.getSeed()), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(namedCurveByOid.getG()), namedCurveByOid.getN(), namedCurveByOid.getH());
            } else if (x962Parameters.isImplicitlyCA()) {
                this.getHighSpeedVideoSizes = null;
                curve = org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa().getCurve();
            } else {
                org.bouncycastle.asn1.x9.X9ECParameters x9ECParameters = org.bouncycastle.asn1.x9.X9ECParameters.getInstance(x962Parameters.getParameters());
                curve = x9ECParameters.getCurve();
                this.getHighSpeedVideoSizes = new java.security.spec.ECParameterSpec(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(curve, x9ECParameters.getSeed()), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(x9ECParameters.getG()), x9ECParameters.getN(), x9ECParameters.getH().intValue());
            }
            byte[] bytes = subjectPublicKeyInfo.getPublicKeyData().getBytes();
            org.bouncycastle.asn1.ASN1OctetString dEROctetString = new org.bouncycastle.asn1.DEROctetString(bytes);
            if (bytes[0] == 4 && bytes[1] == bytes.length - 2 && (((b = bytes[2]) == 2 || b == 3) && new org.bouncycastle.asn1.x9.X9IntegerConverter().getByteLength(curve) >= bytes.length - 3)) {
                try {
                    dEROctetString = (org.bouncycastle.asn1.ASN1OctetString) org.bouncycastle.asn1.ASN1Primitive.fromByteArray(bytes);
                } catch (java.io.IOException unused2) {
                    throw new java.lang.IllegalArgumentException("error recovering public key");
                }
            }
            this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.x9.X9ECPoint(curve, dEROctetString).getPoint();
        }
        this.getHighSpeedVideoFpsRanges = (java.lang.String) objectInputStream.readObject();
        this.getHighResolutionOutputSizeshNQ4ISI = objectInputStream.readBoolean();
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof org.bouncycastle.jce.provider.JCEECPublicKey)) {
            return false;
        }
        org.bouncycastle.jce.provider.JCEECPublicKey jCEECPublicKey = (org.bouncycastle.jce.provider.JCEECPublicKey) obj;
        if (engineGetQ().equals(jCEECPublicKey.engineGetQ())) {
            java.security.spec.ECParameterSpec eCParameterSpec = this.getHighSpeedVideoSizes;
            org.bouncycastle.jce.spec.ECParameterSpec convertSpec = eCParameterSpec != null ? org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(eCParameterSpec) : org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
            java.security.spec.ECParameterSpec eCParameterSpec2 = jCEECPublicKey.getHighSpeedVideoSizes;
            if (convertSpec.equals(eCParameterSpec2 != null ? org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(eCParameterSpec2) : org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = engineGetQ().hashCode();
        java.security.spec.ECParameterSpec eCParameterSpec = this.getHighSpeedVideoSizes;
        return hashCode ^ (eCParameterSpec != null ? org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(eCParameterSpec) : org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa()).hashCode();
    }

    public java.lang.String toString() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("EC Public Key");
        java.lang.String lineSeparator = org.bouncycastle.util.Strings.lineSeparator();
        stringBuffer.append(lineSeparator);
        stringBuffer.append("            X: ").append(this.Camera2StreamConfigurationMap.getAffineXCoord().toBigInteger().toString(16)).append(lineSeparator);
        stringBuffer.append("            Y: ").append(this.Camera2StreamConfigurationMap.getAffineYCoord().toBigInteger().toString(16)).append(lineSeparator);
        return stringBuffer.toString();
    }

    @Override // org.bouncycastle.jce.interfaces.ECPointEncoder
    public void setPointFormat(java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI = !"UNCOMPRESSED".equalsIgnoreCase(str);
    }

    @Override // java.security.interfaces.ECPublicKey
    public java.security.spec.ECPoint getW() {
        return org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(this.Camera2StreamConfigurationMap);
    }

    @Override // org.bouncycastle.jce.interfaces.ECPublicKey
    public org.bouncycastle.math.ec.ECPoint getQ() {
        return this.getHighSpeedVideoSizes == null ? this.Camera2StreamConfigurationMap.getDetachedPoint() : this.Camera2StreamConfigurationMap;
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
        return "X.509";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        org.bouncycastle.asn1.x9.X962Parameters x962Parameters;
        org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo;
        if (this.getHighSpeedVideoFpsRanges.equals("ECGOST3410")) {
            org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = this.getHighSpeedVideoFpsRangesFor;
            if (aSN1Encodable == null) {
                java.security.spec.ECParameterSpec eCParameterSpec = this.getHighSpeedVideoSizes;
                if (eCParameterSpec instanceof org.bouncycastle.jce.spec.ECNamedCurveSpec) {
                    aSN1Encodable = new org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters(org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves.getOID(((org.bouncycastle.jce.spec.ECNamedCurveSpec) eCParameterSpec).getName()), org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411_94_CryptoProParamSet);
                } else {
                    org.bouncycastle.math.ec.ECCurve convertCurve = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(eCParameterSpec.getCurve());
                    aSN1Encodable = new org.bouncycastle.asn1.x9.X962Parameters(new org.bouncycastle.asn1.x9.X9ECParameters(convertCurve, new org.bouncycastle.asn1.x9.X9ECPoint(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(convertCurve, this.getHighSpeedVideoSizes.getGenerator()), this.getHighResolutionOutputSizeshNQ4ISI), this.getHighSpeedVideoSizes.getOrder(), java.math.BigInteger.valueOf(this.getHighSpeedVideoSizes.getCofactor()), this.getHighSpeedVideoSizes.getCurve().getSeed()));
                }
            }
            java.math.BigInteger bigInteger = this.Camera2StreamConfigurationMap.getAffineXCoord().toBigInteger();
            java.math.BigInteger bigInteger2 = this.Camera2StreamConfigurationMap.getAffineYCoord().toBigInteger();
            byte[] bArr = new byte[64];
            getHighSpeedVideoFpsRangesFor(bArr, 0, bigInteger);
            getHighSpeedVideoFpsRangesFor(bArr, 32, bigInteger2);
            try {
                subjectPublicKeyInfo = new org.bouncycastle.asn1.x509.SubjectPublicKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3410_2001, aSN1Encodable), new org.bouncycastle.asn1.DEROctetString(bArr));
            } catch (java.io.IOException unused) {
                return null;
            }
        } else {
            java.security.spec.ECParameterSpec eCParameterSpec2 = this.getHighSpeedVideoSizes;
            if (eCParameterSpec2 instanceof org.bouncycastle.jce.spec.ECNamedCurveSpec) {
                org.bouncycastle.asn1.ASN1ObjectIdentifier namedCurveOid = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getNamedCurveOid(((org.bouncycastle.jce.spec.ECNamedCurveSpec) eCParameterSpec2).getName());
                if (namedCurveOid == null) {
                    namedCurveOid = new org.bouncycastle.asn1.ASN1ObjectIdentifier(((org.bouncycastle.jce.spec.ECNamedCurveSpec) this.getHighSpeedVideoSizes).getName());
                }
                x962Parameters = new org.bouncycastle.asn1.x9.X962Parameters(namedCurveOid);
            } else if (eCParameterSpec2 == null) {
                x962Parameters = new org.bouncycastle.asn1.x9.X962Parameters((org.bouncycastle.asn1.ASN1Null) org.bouncycastle.asn1.DERNull.INSTANCE);
            } else {
                org.bouncycastle.math.ec.ECCurve convertCurve2 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(eCParameterSpec2.getCurve());
                x962Parameters = new org.bouncycastle.asn1.x9.X962Parameters(new org.bouncycastle.asn1.x9.X9ECParameters(convertCurve2, new org.bouncycastle.asn1.x9.X9ECPoint(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(convertCurve2, this.getHighSpeedVideoSizes.getGenerator()), this.getHighResolutionOutputSizeshNQ4ISI), this.getHighSpeedVideoSizes.getOrder(), java.math.BigInteger.valueOf(this.getHighSpeedVideoSizes.getCofactor()), this.getHighSpeedVideoSizes.getCurve().getSeed()));
            }
            subjectPublicKeyInfo = new org.bouncycastle.asn1.x509.SubjectPublicKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.id_ecPublicKey, x962Parameters), getQ().getEncoded(this.getHighResolutionOutputSizeshNQ4ISI));
        }
        return org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil.getEncodedSubjectPublicKeyInfo(subjectPublicKeyInfo);
    }

    @Override // java.security.Key
    public java.lang.String getAlgorithm() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.math.ec.ECPoint engineGetQ() {
        return this.Camera2StreamConfigurationMap;
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.writeObject(getEncoded());
        objectOutputStream.writeObject(this.getHighSpeedVideoFpsRanges);
        objectOutputStream.writeBoolean(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    private static void getHighSpeedVideoFpsRangesFor(byte[] bArr, int i, java.math.BigInteger bigInteger) {
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

    public JCEECPublicKey(java.security.interfaces.ECPublicKey eCPublicKey) {
        this.getHighSpeedVideoFpsRanges = "EC";
        this.getHighSpeedVideoFpsRanges = eCPublicKey.getAlgorithm();
        java.security.spec.ECParameterSpec params = eCPublicKey.getParams();
        this.getHighSpeedVideoSizes = params;
        this.Camera2StreamConfigurationMap = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(params, eCPublicKey.getW());
    }

    public JCEECPublicKey(java.lang.String str, org.bouncycastle.jce.spec.ECPublicKeySpec eCPublicKeySpec) {
        java.security.spec.ECParameterSpec eCParameterSpec;
        this.getHighSpeedVideoFpsRanges = str;
        this.Camera2StreamConfigurationMap = eCPublicKeySpec.getQ();
        if (eCPublicKeySpec.getParams() != null) {
            eCParameterSpec = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(eCPublicKeySpec.getParams().getCurve(), eCPublicKeySpec.getParams().getSeed()), eCPublicKeySpec.getParams());
        } else {
            if (this.Camera2StreamConfigurationMap.getCurve() == null) {
                this.Camera2StreamConfigurationMap = org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa().getCurve().createPoint(this.Camera2StreamConfigurationMap.getAffineXCoord().toBigInteger(), this.Camera2StreamConfigurationMap.getAffineYCoord().toBigInteger());
            }
            eCParameterSpec = null;
        }
        this.getHighSpeedVideoSizes = eCParameterSpec;
    }

    public JCEECPublicKey(java.lang.String str, org.bouncycastle.jce.provider.JCEECPublicKey jCEECPublicKey) {
        this.getHighSpeedVideoFpsRanges = str;
        this.Camera2StreamConfigurationMap = jCEECPublicKey.Camera2StreamConfigurationMap;
        this.getHighSpeedVideoSizes = jCEECPublicKey.getHighSpeedVideoSizes;
        this.getHighResolutionOutputSizeshNQ4ISI = jCEECPublicKey.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoFpsRangesFor = jCEECPublicKey.getHighSpeedVideoFpsRangesFor;
    }

    public JCEECPublicKey(java.lang.String str, org.bouncycastle.crypto.params.ECPublicKeyParameters eCPublicKeyParameters) {
        this.getHighSpeedVideoFpsRanges = str;
        this.Camera2StreamConfigurationMap = eCPublicKeyParameters.getQ();
        this.getHighSpeedVideoSizes = null;
    }

    public JCEECPublicKey(java.lang.String str, java.security.spec.ECPublicKeySpec eCPublicKeySpec) {
        this.getHighSpeedVideoFpsRanges = str;
        java.security.spec.ECParameterSpec params = eCPublicKeySpec.getParams();
        this.getHighSpeedVideoSizes = params;
        this.Camera2StreamConfigurationMap = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(params, eCPublicKeySpec.getW());
    }
}
