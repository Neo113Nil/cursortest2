package org.bouncycastle.jcajce.provider.asymmetric.ec;

/* loaded from: classes17.dex */
class ECUtils {
    static org.bouncycastle.crypto.params.AsymmetricKeyParameter getHighResolutionOutputSizeshNQ4ISI(java.security.PublicKey publicKey) throws java.security.InvalidKeyException {
        return publicKey instanceof org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPublicKey ? ((org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPublicKey) publicKey).getHighSpeedVideoFpsRanges : org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.generatePublicKeyParameter(publicKey);
    }

    private static org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoFpsRanges(java.lang.String str) {
        char charAt = str.charAt(0);
        if (charAt < '0' || charAt > '2') {
            return null;
        }
        try {
            return new org.bouncycastle.asn1.ASN1ObjectIdentifier(str);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    static org.bouncycastle.asn1.x9.X9ECParameters getHighSpeedVideoFpsRangesFor(java.lang.String str, org.bouncycastle.jcajce.provider.config.ProviderConfiguration providerConfiguration) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        int indexOf = str.indexOf(32);
        if (indexOf > 0) {
            str = str.substring(indexOf + 1);
        }
        org.bouncycastle.asn1.ASN1ObjectIdentifier highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(str);
        if (highSpeedVideoFpsRanges == null) {
            return org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getNamedCurveByName(str);
        }
        org.bouncycastle.asn1.x9.X9ECParameters namedCurveByOid = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getNamedCurveByOid(highSpeedVideoFpsRanges);
        return (namedCurveByOid != null || providerConfiguration == null) ? namedCurveByOid : (org.bouncycastle.asn1.x9.X9ECParameters) providerConfiguration.getAdditionalECParameters().get(highSpeedVideoFpsRanges);
    }

    static org.bouncycastle.asn1.x9.X962Parameters getHighSpeedVideoFpsRangesFor(java.security.spec.ECParameterSpec eCParameterSpec, boolean z) {
        if (!(eCParameterSpec instanceof org.bouncycastle.jce.spec.ECNamedCurveSpec)) {
            if (eCParameterSpec == null) {
                return new org.bouncycastle.asn1.x9.X962Parameters((org.bouncycastle.asn1.ASN1Null) org.bouncycastle.asn1.DERNull.INSTANCE);
            }
            org.bouncycastle.math.ec.ECCurve convertCurve = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(eCParameterSpec.getCurve());
            return new org.bouncycastle.asn1.x9.X962Parameters(new org.bouncycastle.asn1.x9.X9ECParameters(convertCurve, new org.bouncycastle.asn1.x9.X9ECPoint(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(convertCurve, eCParameterSpec.getGenerator()), z), eCParameterSpec.getOrder(), java.math.BigInteger.valueOf(eCParameterSpec.getCofactor()), eCParameterSpec.getCurve().getSeed()));
        }
        org.bouncycastle.jce.spec.ECNamedCurveSpec eCNamedCurveSpec = (org.bouncycastle.jce.spec.ECNamedCurveSpec) eCParameterSpec;
        org.bouncycastle.asn1.ASN1ObjectIdentifier namedCurveOid = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getNamedCurveOid(eCNamedCurveSpec.getName());
        if (namedCurveOid == null) {
            namedCurveOid = new org.bouncycastle.asn1.ASN1ObjectIdentifier(eCNamedCurveSpec.getName());
        }
        return new org.bouncycastle.asn1.x9.X962Parameters(namedCurveOid);
    }

    static org.bouncycastle.asn1.x9.X9ECParameters getHighResolutionOutputSizeshNQ4ISI(java.security.spec.ECGenParameterSpec eCGenParameterSpec, org.bouncycastle.jcajce.provider.config.ProviderConfiguration providerConfiguration) {
        return getHighSpeedVideoFpsRangesFor(eCGenParameterSpec.getName(), providerConfiguration);
    }

    ECUtils() {
    }
}
