package org.bouncycastle.eac.jcajce;

/* loaded from: classes17.dex */
public class JcaPublicKeyConverter {
    private org.bouncycastle.eac.jcajce.EACHelper getHighSpeedVideoSizes = new org.bouncycastle.eac.jcajce.DefaultEACHelper();

    private java.security.PublicKey getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.eac.ECDSAPublicKey eCDSAPublicKey) throws org.bouncycastle.eac.EACException, java.security.spec.InvalidKeySpecException {
        java.security.spec.ECField eCFieldF2m;
        if (!eCDSAPublicKey.hasParameters()) {
            throw new java.lang.IllegalArgumentException("Public key does not contains EC Params");
        }
        org.bouncycastle.math.ec.ECCurve.Fp fp = new org.bouncycastle.math.ec.ECCurve.Fp(eCDSAPublicKey.getPrimeModulusP(), eCDSAPublicKey.getFirstCoefA(), eCDSAPublicKey.getSecondCoefB(), eCDSAPublicKey.getOrderOfBasePointR(), eCDSAPublicKey.getCofactorF());
        org.bouncycastle.math.ec.ECPoint decodePoint = fp.decodePoint(eCDSAPublicKey.getBasePointG());
        java.math.BigInteger orderOfBasePointR = eCDSAPublicKey.getOrderOfBasePointR();
        java.math.BigInteger cofactorF = eCDSAPublicKey.getCofactorF();
        org.bouncycastle.math.field.FiniteField field = fp.getField();
        if (org.bouncycastle.math.ec.ECAlgorithms.isFpField(field)) {
            eCFieldF2m = new java.security.spec.ECFieldFp(field.getCharacteristic());
        } else {
            org.bouncycastle.math.field.Polynomial minimalPolynomial = ((org.bouncycastle.math.field.PolynomialExtensionField) field).getMinimalPolynomial();
            int[] exponentsPresent = minimalPolynomial.getExponentsPresent();
            eCFieldF2m = new java.security.spec.ECFieldF2m(minimalPolynomial.getDegree(), org.bouncycastle.util.Arrays.reverseInPlace(org.bouncycastle.util.Arrays.copyOfRange(exponentsPresent, 1, exponentsPresent.length - 1)));
        }
        java.security.spec.ECParameterSpec eCParameterSpec = new java.security.spec.ECParameterSpec(new java.security.spec.EllipticCurve(eCFieldF2m, fp.getA().toBigInteger(), fp.getB().toBigInteger(), null), new java.security.spec.ECPoint(decodePoint.getAffineXCoord().toBigInteger(), decodePoint.getAffineYCoord().toBigInteger()), orderOfBasePointR, cofactorF.intValue());
        if (!eCDSAPublicKey.hasParameters()) {
            throw new java.lang.IllegalArgumentException("Public key does not contains EC Params");
        }
        org.bouncycastle.math.ec.ECPoint.Fp fp2 = (org.bouncycastle.math.ec.ECPoint.Fp) new org.bouncycastle.math.ec.ECCurve.Fp(eCDSAPublicKey.getPrimeModulusP(), eCDSAPublicKey.getFirstCoefA(), eCDSAPublicKey.getSecondCoefB(), eCDSAPublicKey.getOrderOfBasePointR(), eCDSAPublicKey.getCofactorF()).decodePoint(eCDSAPublicKey.getPublicPointY());
        try {
            return this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap("ECDSA").generatePublic(new java.security.spec.ECPublicKeySpec(new java.security.spec.ECPoint(fp2.getAffineXCoord().toBigInteger(), fp2.getAffineYCoord().toBigInteger()), eCParameterSpec));
        } catch (java.security.NoSuchAlgorithmException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot find algorithm ECDSA: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.eac.EACException(sb.toString(), e);
        } catch (java.security.NoSuchProviderException e2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("cannot find provider: ");
            sb2.append(e2.getMessage());
            throw new org.bouncycastle.eac.EACException(sb2.toString(), e2);
        }
    }

    public org.bouncycastle.asn1.eac.PublicKeyDataObject getPublicKeyDataObject(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.security.PublicKey publicKey) {
        if (publicKey instanceof java.security.interfaces.RSAPublicKey) {
            java.security.interfaces.RSAPublicKey rSAPublicKey = (java.security.interfaces.RSAPublicKey) publicKey;
            return new org.bouncycastle.asn1.eac.RSAPublicKey(aSN1ObjectIdentifier, rSAPublicKey.getModulus(), rSAPublicKey.getPublicExponent());
        }
        java.security.interfaces.ECPublicKey eCPublicKey = (java.security.interfaces.ECPublicKey) publicKey;
        java.security.spec.ECParameterSpec params = eCPublicKey.getParams();
        java.security.spec.EllipticCurve curve = params.getCurve();
        java.math.BigInteger order = params.getOrder();
        int cofactor = params.getCofactor();
        java.security.spec.ECField field = curve.getField();
        java.math.BigInteger a2 = curve.getA();
        java.math.BigInteger b = curve.getB();
        if (!(field instanceof java.security.spec.ECFieldFp)) {
            throw new java.lang.IllegalStateException("not implemented yet!!!");
        }
        org.bouncycastle.math.ec.ECCurve.Fp fp = new org.bouncycastle.math.ec.ECCurve.Fp(((java.security.spec.ECFieldFp) field).getP(), a2, b, order, java.math.BigInteger.valueOf(cofactor));
        java.security.spec.ECPoint generator = params.getGenerator();
        org.bouncycastle.math.ec.ECPoint createPoint = fp.createPoint(generator.getAffineX(), generator.getAffineY());
        java.security.spec.ECPoint w = eCPublicKey.getW();
        return new org.bouncycastle.asn1.eac.ECDSAPublicKey(aSN1ObjectIdentifier, ((java.security.spec.ECFieldFp) curve.getField()).getP(), curve.getA(), curve.getB(), createPoint.getEncoded(false), params.getOrder(), fp.createPoint(w.getAffineX(), w.getAffineY()).getEncoded(false), params.getCofactor());
    }

    public org.bouncycastle.eac.jcajce.JcaPublicKeyConverter setProvider(java.security.Provider provider) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.eac.jcajce.ProviderEACHelper(provider);
        return this;
    }

    public org.bouncycastle.eac.jcajce.JcaPublicKeyConverter setProvider(java.lang.String str) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.eac.jcajce.NamedEACHelper(str);
        return this;
    }

    public java.security.PublicKey getKey(org.bouncycastle.asn1.eac.PublicKeyDataObject publicKeyDataObject) throws org.bouncycastle.eac.EACException, java.security.spec.InvalidKeySpecException {
        if (publicKeyDataObject.getUsage().on(org.bouncycastle.asn1.eac.EACObjectIdentifiers.id_TA_ECDSA)) {
            return getHighSpeedVideoFpsRanges((org.bouncycastle.asn1.eac.ECDSAPublicKey) publicKeyDataObject);
        }
        org.bouncycastle.asn1.eac.RSAPublicKey rSAPublicKey = (org.bouncycastle.asn1.eac.RSAPublicKey) publicKeyDataObject;
        try {
            return this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap("RSA").generatePublic(new java.security.spec.RSAPublicKeySpec(rSAPublicKey.getModulus(), rSAPublicKey.getPublicExponent()));
        } catch (java.security.NoSuchAlgorithmException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot find algorithm ECDSA: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.eac.EACException(sb.toString(), e);
        } catch (java.security.NoSuchProviderException e2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("cannot find provider: ");
            sb2.append(e2.getMessage());
            throw new org.bouncycastle.eac.EACException(sb2.toString(), e2);
        }
    }
}
