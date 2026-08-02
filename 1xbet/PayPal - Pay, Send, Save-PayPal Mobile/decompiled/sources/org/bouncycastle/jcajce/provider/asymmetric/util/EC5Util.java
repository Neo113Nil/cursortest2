package org.bouncycastle.jcajce.provider.asymmetric.util;

/* loaded from: classes17.dex */
public class EC5Util {
    private static java.util.Map getHighSpeedVideoFpsRangesFor = new java.util.HashMap();

    public static org.bouncycastle.crypto.params.ECDomainParameters getDomainParameters(org.bouncycastle.jcajce.provider.config.ProviderConfiguration providerConfiguration, java.security.spec.ECParameterSpec eCParameterSpec) {
        if (eCParameterSpec != null) {
            return org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getDomainParameters(providerConfiguration, convertSpec(eCParameterSpec));
        }
        org.bouncycastle.jce.spec.ECParameterSpec ecImplicitlyCa = providerConfiguration.getEcImplicitlyCa();
        return new org.bouncycastle.crypto.params.ECDomainParameters(ecImplicitlyCa.getCurve(), ecImplicitlyCa.getG(), ecImplicitlyCa.getN(), ecImplicitlyCa.getH(), ecImplicitlyCa.getSeed());
    }

    public static org.bouncycastle.math.ec.ECCurve getCurve(org.bouncycastle.jcajce.provider.config.ProviderConfiguration providerConfiguration, org.bouncycastle.asn1.x9.X962Parameters x962Parameters) {
        java.util.Set acceptableNamedCurves = providerConfiguration.getAcceptableNamedCurves();
        if (!x962Parameters.isNamedCurve()) {
            if (x962Parameters.isImplicitlyCA()) {
                return providerConfiguration.getEcImplicitlyCa().getCurve();
            }
            org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(x962Parameters.getParameters());
            if (acceptableNamedCurves.isEmpty()) {
                return aSN1Sequence.size() > 3 ? org.bouncycastle.asn1.x9.X9ECParameters.getInstance(aSN1Sequence).getCurve() : org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves.getByOIDX9(org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0))).getCurve();
            }
            throw new java.lang.IllegalStateException("encoded parameters not acceptable");
        }
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(x962Parameters.getParameters());
        if (!acceptableNamedCurves.isEmpty() && !acceptableNamedCurves.contains(aSN1ObjectIdentifier)) {
            throw new java.lang.IllegalStateException("named curve not acceptable");
        }
        org.bouncycastle.asn1.x9.X9ECParameters namedCurveByOid = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getNamedCurveByOid(aSN1ObjectIdentifier);
        if (namedCurveByOid == null) {
            namedCurveByOid = (org.bouncycastle.asn1.x9.X9ECParameters) providerConfiguration.getAdditionalECParameters().get(aSN1ObjectIdentifier);
        }
        return namedCurveByOid.getCurve();
    }

    public static java.security.spec.ECParameterSpec convertToSpec(org.bouncycastle.crypto.params.ECDomainParameters eCDomainParameters) {
        return new java.security.spec.ECParameterSpec(convertCurve(eCDomainParameters.getCurve(), null), convertPoint(eCDomainParameters.getG()), eCDomainParameters.getN(), eCDomainParameters.getH().intValue());
    }

    public static java.security.spec.ECParameterSpec convertToSpec(org.bouncycastle.asn1.x9.X9ECParameters x9ECParameters) {
        return new java.security.spec.ECParameterSpec(convertCurve(x9ECParameters.getCurve(), null), convertPoint(x9ECParameters.getG()), x9ECParameters.getN(), x9ECParameters.getH().intValue());
    }

    public static java.security.spec.ECParameterSpec convertToSpec(org.bouncycastle.asn1.x9.X962Parameters x962Parameters, org.bouncycastle.math.ec.ECCurve eCCurve) {
        if (x962Parameters.isNamedCurve()) {
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = (org.bouncycastle.asn1.ASN1ObjectIdentifier) x962Parameters.getParameters();
            org.bouncycastle.asn1.x9.X9ECParameters namedCurveByOid = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getNamedCurveByOid(aSN1ObjectIdentifier);
            if (namedCurveByOid == null) {
                java.util.Map additionalECParameters = org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION.getAdditionalECParameters();
                if (!additionalECParameters.isEmpty()) {
                    namedCurveByOid = (org.bouncycastle.asn1.x9.X9ECParameters) additionalECParameters.get(aSN1ObjectIdentifier);
                }
            }
            return new org.bouncycastle.jce.spec.ECNamedCurveSpec(org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getCurveName(aSN1ObjectIdentifier), convertCurve(eCCurve, namedCurveByOid.getSeed()), convertPoint(namedCurveByOid.getG()), namedCurveByOid.getN(), namedCurveByOid.getH());
        }
        if (x962Parameters.isImplicitlyCA()) {
            return null;
        }
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(x962Parameters.getParameters());
        if (aSN1Sequence.size() > 3) {
            org.bouncycastle.asn1.x9.X9ECParameters x9ECParameters = org.bouncycastle.asn1.x9.X9ECParameters.getInstance(aSN1Sequence);
            java.security.spec.EllipticCurve convertCurve = convertCurve(eCCurve, x9ECParameters.getSeed());
            return x9ECParameters.getH() != null ? new java.security.spec.ECParameterSpec(convertCurve, convertPoint(x9ECParameters.getG()), x9ECParameters.getN(), x9ECParameters.getH().intValue()) : new java.security.spec.ECParameterSpec(convertCurve, convertPoint(x9ECParameters.getG()), x9ECParameters.getN(), 1);
        }
        org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters gOST3410PublicKeyAlgParameters = org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters.getInstance(aSN1Sequence);
        org.bouncycastle.jce.spec.ECNamedCurveParameterSpec parameterSpec = org.bouncycastle.jce.ECGOST3410NamedCurveTable.getParameterSpec(org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves.getName(gOST3410PublicKeyAlgParameters.getPublicKeyParamSet()));
        return new org.bouncycastle.jce.spec.ECNamedCurveSpec(org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves.getName(gOST3410PublicKeyAlgParameters.getPublicKeyParamSet()), convertCurve(parameterSpec.getCurve(), parameterSpec.getSeed()), convertPoint(parameterSpec.getG()), parameterSpec.getN(), parameterSpec.getH());
    }

    public static org.bouncycastle.jce.spec.ECParameterSpec convertSpec(java.security.spec.ECParameterSpec eCParameterSpec) {
        org.bouncycastle.math.ec.ECCurve convertCurve = convertCurve(eCParameterSpec.getCurve());
        org.bouncycastle.math.ec.ECPoint convertPoint = convertPoint(convertCurve, eCParameterSpec.getGenerator());
        java.math.BigInteger order = eCParameterSpec.getOrder();
        java.math.BigInteger valueOf = java.math.BigInteger.valueOf(eCParameterSpec.getCofactor());
        byte[] seed = eCParameterSpec.getCurve().getSeed();
        return eCParameterSpec instanceof org.bouncycastle.jce.spec.ECNamedCurveSpec ? new org.bouncycastle.jce.spec.ECNamedCurveParameterSpec(((org.bouncycastle.jce.spec.ECNamedCurveSpec) eCParameterSpec).getName(), convertCurve, convertPoint, order, valueOf, seed) : new org.bouncycastle.jce.spec.ECParameterSpec(convertCurve, convertPoint, order, valueOf, seed);
    }

    public static java.security.spec.ECParameterSpec convertSpec(java.security.spec.EllipticCurve ellipticCurve, org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpec) {
        java.security.spec.ECPoint convertPoint = convertPoint(eCParameterSpec.getG());
        return eCParameterSpec instanceof org.bouncycastle.jce.spec.ECNamedCurveParameterSpec ? new org.bouncycastle.jce.spec.ECNamedCurveSpec(((org.bouncycastle.jce.spec.ECNamedCurveParameterSpec) eCParameterSpec).getName(), ellipticCurve, convertPoint, eCParameterSpec.getN(), eCParameterSpec.getH()) : new java.security.spec.ECParameterSpec(ellipticCurve, convertPoint, eCParameterSpec.getN(), eCParameterSpec.getH().intValue());
    }

    public static org.bouncycastle.math.ec.ECPoint convertPoint(org.bouncycastle.math.ec.ECCurve eCCurve, java.security.spec.ECPoint eCPoint) {
        return eCCurve.createPoint(eCPoint.getAffineX(), eCPoint.getAffineY());
    }

    public static org.bouncycastle.math.ec.ECPoint convertPoint(java.security.spec.ECParameterSpec eCParameterSpec, java.security.spec.ECPoint eCPoint) {
        return convertPoint(convertCurve(eCParameterSpec.getCurve()), eCPoint);
    }

    public static java.security.spec.ECPoint convertPoint(org.bouncycastle.math.ec.ECPoint eCPoint) {
        org.bouncycastle.math.ec.ECPoint normalize = eCPoint.normalize();
        return new java.security.spec.ECPoint(normalize.getAffineXCoord().toBigInteger(), normalize.getAffineYCoord().toBigInteger());
    }

    public static java.security.spec.ECField convertField(org.bouncycastle.math.field.FiniteField finiteField) {
        if (org.bouncycastle.math.ec.ECAlgorithms.isFpField(finiteField)) {
            return new java.security.spec.ECFieldFp(finiteField.getCharacteristic());
        }
        org.bouncycastle.math.field.Polynomial minimalPolynomial = ((org.bouncycastle.math.field.PolynomialExtensionField) finiteField).getMinimalPolynomial();
        int[] exponentsPresent = minimalPolynomial.getExponentsPresent();
        return new java.security.spec.ECFieldF2m(minimalPolynomial.getDegree(), org.bouncycastle.util.Arrays.reverseInPlace(org.bouncycastle.util.Arrays.copyOfRange(exponentsPresent, 1, exponentsPresent.length - 1)));
    }

    public static org.bouncycastle.math.ec.ECCurve convertCurve(java.security.spec.EllipticCurve ellipticCurve) {
        java.security.spec.ECField field = ellipticCurve.getField();
        java.math.BigInteger a2 = ellipticCurve.getA();
        java.math.BigInteger b = ellipticCurve.getB();
        if (field instanceof java.security.spec.ECFieldFp) {
            org.bouncycastle.math.ec.ECCurve.Fp fp = new org.bouncycastle.math.ec.ECCurve.Fp(((java.security.spec.ECFieldFp) field).getP(), a2, b);
            return getHighSpeedVideoFpsRangesFor.containsKey(fp) ? (org.bouncycastle.math.ec.ECCurve) getHighSpeedVideoFpsRangesFor.get(fp) : fp;
        }
        java.security.spec.ECFieldF2m eCFieldF2m = (java.security.spec.ECFieldF2m) field;
        int m = eCFieldF2m.getM();
        int[] Camera2StreamConfigurationMap = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.Camera2StreamConfigurationMap(eCFieldF2m.getMidTermsOfReductionPolynomial());
        return new org.bouncycastle.math.ec.ECCurve.F2m(m, Camera2StreamConfigurationMap[0], Camera2StreamConfigurationMap[1], Camera2StreamConfigurationMap[2], a2, b);
    }

    public static java.security.spec.EllipticCurve convertCurve(org.bouncycastle.math.ec.ECCurve eCCurve, byte[] bArr) {
        return new java.security.spec.EllipticCurve(convertField(eCCurve.getField()), eCCurve.getA().toBigInteger(), eCCurve.getB().toBigInteger(), null);
    }

    static {
        java.util.Enumeration names = org.bouncycastle.crypto.ec.CustomNamedCurves.getNames();
        while (names.hasMoreElements()) {
            java.lang.String str = (java.lang.String) names.nextElement();
            org.bouncycastle.asn1.x9.X9ECParameters byName = org.bouncycastle.asn1.x9.ECNamedCurveTable.getByName(str);
            if (byName != null) {
                getHighSpeedVideoFpsRangesFor.put(byName.getCurve(), org.bouncycastle.crypto.ec.CustomNamedCurves.getByName(str).getCurve());
            }
        }
        org.bouncycastle.math.ec.ECCurve curve = org.bouncycastle.crypto.ec.CustomNamedCurves.getByName("Curve25519").getCurve();
        getHighSpeedVideoFpsRangesFor.put(new org.bouncycastle.math.ec.ECCurve.Fp(curve.getField().getCharacteristic(), curve.getA().toBigInteger(), curve.getB().toBigInteger(), curve.getOrder(), curve.getCofactor()), curve);
    }
}
