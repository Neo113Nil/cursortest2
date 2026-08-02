package org.bouncycastle.jcajce.provider.asymmetric.ec;

/* loaded from: classes17.dex */
public class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {
    private java.security.spec.ECParameterSpec getHighSpeedVideoFpsRangesFor;
    private java.lang.String getHighSpeedVideoSizes;

    protected boolean isASN1FormatString(java.lang.String str) {
        return str == null || str.equals("ASN.1");
    }

    @Override // java.security.AlgorithmParametersSpi
    protected java.lang.String engineToString() {
        return "EC Parameters";
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr, java.lang.String str) throws java.io.IOException {
        if (!isASN1FormatString(str)) {
            throw new java.io.IOException("Unknown encoded parameters format in AlgorithmParameters object: ".concat(java.lang.String.valueOf(str)));
        }
        org.bouncycastle.asn1.x9.X962Parameters x962Parameters = org.bouncycastle.asn1.x9.X962Parameters.getInstance(bArr);
        org.bouncycastle.math.ec.ECCurve curve = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.getCurve(org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION, x962Parameters);
        if (x962Parameters.isNamedCurve()) {
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(x962Parameters.getParameters());
            java.lang.String name2 = org.bouncycastle.asn1.x9.ECNamedCurveTable.getName(aSN1ObjectIdentifier);
            this.getHighSpeedVideoSizes = name2;
            if (name2 == null) {
                this.getHighSpeedVideoSizes = aSN1ObjectIdentifier.getId();
            }
        }
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertToSpec(x962Parameters, curve);
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr) throws java.io.IOException {
        engineInit(bArr, "ASN.1");
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) throws java.security.spec.InvalidParameterSpecException {
        if (!(algorithmParameterSpec instanceof java.security.spec.ECGenParameterSpec)) {
            if (algorithmParameterSpec instanceof java.security.spec.ECParameterSpec) {
                this.getHighSpeedVideoSizes = algorithmParameterSpec instanceof org.bouncycastle.jce.spec.ECNamedCurveSpec ? ((org.bouncycastle.jce.spec.ECNamedCurveSpec) algorithmParameterSpec).getName() : null;
                this.getHighSpeedVideoFpsRangesFor = (java.security.spec.ECParameterSpec) algorithmParameterSpec;
                return;
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("AlgorithmParameterSpec class not recognized: ");
                sb.append(algorithmParameterSpec.getClass().getName());
                throw new java.security.spec.InvalidParameterSpecException(sb.toString());
            }
        }
        java.security.spec.ECGenParameterSpec eCGenParameterSpec = (java.security.spec.ECGenParameterSpec) algorithmParameterSpec;
        org.bouncycastle.asn1.x9.X9ECParameters highResolutionOutputSizeshNQ4ISI = org.bouncycastle.jcajce.provider.asymmetric.ec.ECUtils.getHighResolutionOutputSizeshNQ4ISI(eCGenParameterSpec, org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION);
        if (highResolutionOutputSizeshNQ4ISI == null) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("EC curve name not recognized: ");
            sb2.append(eCGenParameterSpec.getName());
            throw new java.security.spec.InvalidParameterSpecException(sb2.toString());
        }
        this.getHighSpeedVideoSizes = eCGenParameterSpec.getName();
        java.security.spec.ECParameterSpec convertToSpec = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertToSpec(highResolutionOutputSizeshNQ4ISI);
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.jce.spec.ECNamedCurveSpec(this.getHighSpeedVideoSizes, convertToSpec.getCurve(), convertToSpec.getGenerator(), convertToSpec.getOrder(), java.math.BigInteger.valueOf(convertToSpec.getCofactor()));
    }

    @Override // java.security.AlgorithmParametersSpi
    protected <T extends java.security.spec.AlgorithmParameterSpec> T engineGetParameterSpec(java.lang.Class<T> cls) throws java.security.spec.InvalidParameterSpecException {
        if (java.security.spec.ECParameterSpec.class.isAssignableFrom(cls) || cls == java.security.spec.AlgorithmParameterSpec.class) {
            return this.getHighSpeedVideoFpsRangesFor;
        }
        if (java.security.spec.ECGenParameterSpec.class.isAssignableFrom(cls)) {
            java.lang.String str = this.getHighSpeedVideoSizes;
            if (str != null) {
                org.bouncycastle.asn1.ASN1ObjectIdentifier namedCurveOid = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getNamedCurveOid(str);
                return namedCurveOid != null ? new java.security.spec.ECGenParameterSpec(namedCurveOid.getId()) : new java.security.spec.ECGenParameterSpec(this.getHighSpeedVideoSizes);
            }
            org.bouncycastle.asn1.ASN1ObjectIdentifier namedCurveOid2 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getNamedCurveOid(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(this.getHighSpeedVideoFpsRangesFor));
            if (namedCurveOid2 != null) {
                return new java.security.spec.ECGenParameterSpec(namedCurveOid2.getId());
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EC AlgorithmParameters cannot convert to ");
        sb.append(cls.getName());
        throw new java.security.spec.InvalidParameterSpecException(sb.toString());
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded(java.lang.String str) throws java.io.IOException {
        org.bouncycastle.asn1.x9.X962Parameters x962Parameters;
        if (!isASN1FormatString(str)) {
            throw new java.io.IOException("Unknown parameters format in AlgorithmParameters object: ".concat(java.lang.String.valueOf(str)));
        }
        java.security.spec.ECParameterSpec eCParameterSpec = this.getHighSpeedVideoFpsRangesFor;
        if (eCParameterSpec == null) {
            x962Parameters = new org.bouncycastle.asn1.x9.X962Parameters((org.bouncycastle.asn1.ASN1Null) org.bouncycastle.asn1.DERNull.INSTANCE);
        } else {
            java.lang.String str2 = this.getHighSpeedVideoSizes;
            if (str2 != null) {
                x962Parameters = new org.bouncycastle.asn1.x9.X962Parameters(org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getNamedCurveOid(str2));
            } else {
                org.bouncycastle.jce.spec.ECParameterSpec convertSpec = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(eCParameterSpec);
                x962Parameters = new org.bouncycastle.asn1.x9.X962Parameters(new org.bouncycastle.asn1.x9.X9ECParameters(convertSpec.getCurve(), new org.bouncycastle.asn1.x9.X9ECPoint(convertSpec.getG(), false), convertSpec.getN(), convertSpec.getH(), convertSpec.getSeed()));
            }
        }
        return x962Parameters.getEncoded();
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded() throws java.io.IOException {
        return engineGetEncoded("ASN.1");
    }
}
