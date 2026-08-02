package org.bouncycastle.jcajce.provider.asymmetric.util;

/* loaded from: classes17.dex */
public class ECUtil {
    public static java.lang.String publicKeyToString(java.lang.String str, org.bouncycastle.math.ec.ECPoint eCPoint, org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpec) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.lang.String lineSeparator = org.bouncycastle.util.Strings.lineSeparator();
        stringBuffer.append(str);
        stringBuffer.append(" Public Key [").append(generateKeyFingerprint(eCPoint, eCParameterSpec)).append("]").append(lineSeparator);
        stringBuffer.append("            X: ").append(eCPoint.getAffineXCoord().toBigInteger().toString(16)).append(lineSeparator);
        stringBuffer.append("            Y: ").append(eCPoint.getAffineYCoord().toBigInteger().toString(16)).append(lineSeparator);
        return stringBuffer.toString();
    }

    public static java.lang.String privateKeyToString(java.lang.String str, java.math.BigInteger bigInteger, org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpec) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.lang.String lineSeparator = org.bouncycastle.util.Strings.lineSeparator();
        org.bouncycastle.math.ec.ECPoint normalize = new org.bouncycastle.math.ec.FixedPointCombMultiplier().multiply(eCParameterSpec.getG(), bigInteger).normalize();
        stringBuffer.append(str);
        stringBuffer.append(" Private Key [").append(generateKeyFingerprint(normalize, eCParameterSpec)).append("]").append(lineSeparator);
        stringBuffer.append("            X: ").append(normalize.getAffineXCoord().toBigInteger().toString(16)).append(lineSeparator);
        stringBuffer.append("            Y: ").append(normalize.getAffineYCoord().toBigInteger().toString(16)).append(lineSeparator);
        return stringBuffer.toString();
    }

    public static int getOrderBitLength(org.bouncycastle.jcajce.provider.config.ProviderConfiguration providerConfiguration, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        if (bigInteger != null) {
            return bigInteger.bitLength();
        }
        org.bouncycastle.jce.spec.ECParameterSpec ecImplicitlyCa = providerConfiguration.getEcImplicitlyCa();
        return ecImplicitlyCa == null ? bigInteger2.bitLength() : ecImplicitlyCa.getN().bitLength();
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

    public static org.bouncycastle.asn1.ASN1ObjectIdentifier getNamedCurveOid(org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpec) {
        java.util.Enumeration names = org.bouncycastle.asn1.x9.ECNamedCurveTable.getNames();
        while (names.hasMoreElements()) {
            java.lang.String str = (java.lang.String) names.nextElement();
            org.bouncycastle.asn1.x9.X9ECParameters byName = org.bouncycastle.asn1.x9.ECNamedCurveTable.getByName(str);
            if (byName.getN().equals(eCParameterSpec.getN()) && byName.getH().equals(eCParameterSpec.getH()) && byName.getCurve().equals(eCParameterSpec.getCurve()) && byName.getG().equals(eCParameterSpec.getG())) {
                return org.bouncycastle.asn1.x9.ECNamedCurveTable.getOID(str);
            }
        }
        return null;
    }

    public static org.bouncycastle.asn1.ASN1ObjectIdentifier getNamedCurveOid(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        int indexOf = str.indexOf(32);
        if (indexOf > 0) {
            str = str.substring(indexOf + 1);
        }
        org.bouncycastle.asn1.ASN1ObjectIdentifier highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(str);
        return highSpeedVideoFpsRanges != null ? highSpeedVideoFpsRanges : org.bouncycastle.asn1.x9.ECNamedCurveTable.getOID(str);
    }

    public static org.bouncycastle.asn1.x9.X9ECParameters getNamedCurveByOid(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        org.bouncycastle.asn1.x9.X9ECParameters byOID = org.bouncycastle.crypto.ec.CustomNamedCurves.getByOID(aSN1ObjectIdentifier);
        return byOID == null ? org.bouncycastle.asn1.x9.ECNamedCurveTable.getByOID(aSN1ObjectIdentifier) : byOID;
    }

    public static org.bouncycastle.asn1.x9.X9ECParameters getNamedCurveByName(java.lang.String str) {
        org.bouncycastle.asn1.x9.X9ECParameters byName = org.bouncycastle.crypto.ec.CustomNamedCurves.getByName(str);
        return byName == null ? org.bouncycastle.asn1.x9.ECNamedCurveTable.getByName(str) : byName;
    }

    public static java.lang.String getNameFrom(final java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) {
        return (java.lang.String) java.security.AccessController.doPrivileged(new java.security.PrivilegedAction() { // from class: org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.1
            @Override // java.security.PrivilegedAction
            public final java.lang.Object run() {
                try {
                    return algorithmParameterSpec.getClass().getMethod("getName", new java.lang.Class[0]).invoke(algorithmParameterSpec, new java.lang.Object[0]);
                } catch (java.lang.Exception unused) {
                    return null;
                }
            }
        });
    }

    public static org.bouncycastle.crypto.params.ECDomainParameters getDomainParameters(org.bouncycastle.jcajce.provider.config.ProviderConfiguration providerConfiguration, org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpec) {
        if (eCParameterSpec instanceof org.bouncycastle.jce.spec.ECNamedCurveParameterSpec) {
            org.bouncycastle.jce.spec.ECNamedCurveParameterSpec eCNamedCurveParameterSpec = (org.bouncycastle.jce.spec.ECNamedCurveParameterSpec) eCParameterSpec;
            return new org.bouncycastle.crypto.params.ECNamedDomainParameters(getNamedCurveOid(eCNamedCurveParameterSpec.getName()), eCNamedCurveParameterSpec.getCurve(), eCNamedCurveParameterSpec.getG(), eCNamedCurveParameterSpec.getN(), eCNamedCurveParameterSpec.getH(), eCNamedCurveParameterSpec.getSeed());
        }
        if (eCParameterSpec != null) {
            return new org.bouncycastle.crypto.params.ECDomainParameters(eCParameterSpec.getCurve(), eCParameterSpec.getG(), eCParameterSpec.getN(), eCParameterSpec.getH(), eCParameterSpec.getSeed());
        }
        org.bouncycastle.jce.spec.ECParameterSpec ecImplicitlyCa = providerConfiguration.getEcImplicitlyCa();
        return new org.bouncycastle.crypto.params.ECDomainParameters(ecImplicitlyCa.getCurve(), ecImplicitlyCa.getG(), ecImplicitlyCa.getN(), ecImplicitlyCa.getH(), ecImplicitlyCa.getSeed());
    }

    public static org.bouncycastle.crypto.params.ECDomainParameters getDomainParameters(org.bouncycastle.jcajce.provider.config.ProviderConfiguration providerConfiguration, org.bouncycastle.asn1.x9.X962Parameters x962Parameters) {
        if (x962Parameters.isNamedCurve()) {
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(x962Parameters.getParameters());
            org.bouncycastle.asn1.x9.X9ECParameters namedCurveByOid = getNamedCurveByOid(aSN1ObjectIdentifier);
            if (namedCurveByOid == null) {
                namedCurveByOid = (org.bouncycastle.asn1.x9.X9ECParameters) providerConfiguration.getAdditionalECParameters().get(aSN1ObjectIdentifier);
            }
            return new org.bouncycastle.crypto.params.ECNamedDomainParameters(aSN1ObjectIdentifier, namedCurveByOid);
        }
        if (x962Parameters.isImplicitlyCA()) {
            org.bouncycastle.jce.spec.ECParameterSpec ecImplicitlyCa = providerConfiguration.getEcImplicitlyCa();
            return new org.bouncycastle.crypto.params.ECDomainParameters(ecImplicitlyCa.getCurve(), ecImplicitlyCa.getG(), ecImplicitlyCa.getN(), ecImplicitlyCa.getH(), ecImplicitlyCa.getSeed());
        }
        org.bouncycastle.asn1.x9.X9ECParameters x9ECParameters = org.bouncycastle.asn1.x9.X9ECParameters.getInstance(x962Parameters.getParameters());
        return new org.bouncycastle.crypto.params.ECDomainParameters(x9ECParameters.getCurve(), x9ECParameters.getG(), x9ECParameters.getN(), x9ECParameters.getH(), x9ECParameters.getSeed());
    }

    public static java.lang.String getCurveName(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return org.bouncycastle.asn1.x9.ECNamedCurveTable.getName(aSN1ObjectIdentifier);
    }

    public static org.bouncycastle.crypto.params.AsymmetricKeyParameter generatePublicKeyParameter(java.security.PublicKey publicKey) throws java.security.InvalidKeyException {
        if (publicKey instanceof org.bouncycastle.jce.interfaces.ECPublicKey) {
            org.bouncycastle.jce.interfaces.ECPublicKey eCPublicKey = (org.bouncycastle.jce.interfaces.ECPublicKey) publicKey;
            org.bouncycastle.jce.spec.ECParameterSpec parameters = eCPublicKey.getParameters();
            return new org.bouncycastle.crypto.params.ECPublicKeyParameters(eCPublicKey.getQ(), new org.bouncycastle.crypto.params.ECDomainParameters(parameters.getCurve(), parameters.getG(), parameters.getN(), parameters.getH(), parameters.getSeed()));
        }
        if (publicKey instanceof java.security.interfaces.ECPublicKey) {
            java.security.interfaces.ECPublicKey eCPublicKey2 = (java.security.interfaces.ECPublicKey) publicKey;
            org.bouncycastle.jce.spec.ECParameterSpec convertSpec = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(eCPublicKey2.getParams());
            return new org.bouncycastle.crypto.params.ECPublicKeyParameters(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(eCPublicKey2.getParams(), eCPublicKey2.getW()), new org.bouncycastle.crypto.params.ECDomainParameters(convertSpec.getCurve(), convertSpec.getG(), convertSpec.getN(), convertSpec.getH(), convertSpec.getSeed()));
        }
        try {
            byte[] encoded = publicKey.getEncoded();
            if (encoded == null) {
                throw new java.security.InvalidKeyException("no encoding for EC public key");
            }
            java.security.PublicKey publicKey2 = org.bouncycastle.jce.provider.BouncyCastleProvider.getPublicKey(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(encoded));
            if (publicKey2 instanceof java.security.interfaces.ECPublicKey) {
                return generatePublicKeyParameter(publicKey2);
            }
            throw new java.security.InvalidKeyException("cannot identify EC public key.");
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot identify EC public key: ");
            sb.append(e.toString());
            throw new java.security.InvalidKeyException(sb.toString());
        }
    }

    public static org.bouncycastle.crypto.params.AsymmetricKeyParameter generatePrivateKeyParameter(java.security.PrivateKey privateKey) throws java.security.InvalidKeyException {
        if (privateKey instanceof org.bouncycastle.jce.interfaces.ECPrivateKey) {
            org.bouncycastle.jce.interfaces.ECPrivateKey eCPrivateKey = (org.bouncycastle.jce.interfaces.ECPrivateKey) privateKey;
            org.bouncycastle.jce.spec.ECParameterSpec parameters = eCPrivateKey.getParameters();
            if (parameters == null) {
                parameters = org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
            }
            if (!(eCPrivateKey.getParameters() instanceof org.bouncycastle.jce.spec.ECNamedCurveParameterSpec)) {
                return new org.bouncycastle.crypto.params.ECPrivateKeyParameters(eCPrivateKey.getD(), new org.bouncycastle.crypto.params.ECDomainParameters(parameters.getCurve(), parameters.getG(), parameters.getN(), parameters.getH(), parameters.getSeed()));
            }
            return new org.bouncycastle.crypto.params.ECPrivateKeyParameters(eCPrivateKey.getD(), new org.bouncycastle.crypto.params.ECNamedDomainParameters(org.bouncycastle.asn1.x9.ECNamedCurveTable.getOID(((org.bouncycastle.jce.spec.ECNamedCurveParameterSpec) eCPrivateKey.getParameters()).getName()), parameters.getCurve(), parameters.getG(), parameters.getN(), parameters.getH(), parameters.getSeed()));
        }
        if (privateKey instanceof java.security.interfaces.ECPrivateKey) {
            java.security.interfaces.ECPrivateKey eCPrivateKey2 = (java.security.interfaces.ECPrivateKey) privateKey;
            org.bouncycastle.jce.spec.ECParameterSpec convertSpec = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(eCPrivateKey2.getParams());
            return new org.bouncycastle.crypto.params.ECPrivateKeyParameters(eCPrivateKey2.getS(), new org.bouncycastle.crypto.params.ECDomainParameters(convertSpec.getCurve(), convertSpec.getG(), convertSpec.getN(), convertSpec.getH(), convertSpec.getSeed()));
        }
        try {
            byte[] encoded = privateKey.getEncoded();
            if (encoded == null) {
                throw new java.security.InvalidKeyException("no encoding for EC private key");
            }
            java.security.PrivateKey privateKey2 = org.bouncycastle.jce.provider.BouncyCastleProvider.getPrivateKey(org.bouncycastle.asn1.pkcs.PrivateKeyInfo.getInstance(encoded));
            if (privateKey2 instanceof java.security.interfaces.ECPrivateKey) {
                return generatePrivateKeyParameter(privateKey2);
            }
            throw new java.security.InvalidKeyException("can't identify EC private key.");
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot identify EC private key: ");
            sb.append(e.toString());
            throw new java.security.InvalidKeyException(sb.toString());
        }
    }

    public static java.lang.String generateKeyFingerprint(org.bouncycastle.math.ec.ECPoint eCPoint, org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpec) {
        org.bouncycastle.math.ec.ECCurve curve = eCParameterSpec.getCurve();
        return curve != null ? new org.bouncycastle.util.Fingerprint(org.bouncycastle.util.Arrays.concatenate(eCPoint.getEncoded(false), curve.getA().getEncoded(), curve.getB().getEncoded(), eCParameterSpec.getG().getEncoded(false))).toString() : new org.bouncycastle.util.Fingerprint(eCPoint.getEncoded(false)).toString();
    }

    static int[] Camera2StreamConfigurationMap(int[] iArr) {
        int i;
        int[] iArr2 = new int[3];
        if (iArr.length == 1) {
            iArr2[0] = iArr[0];
            return iArr2;
        }
        if (iArr.length != 3) {
            throw new java.lang.IllegalArgumentException("Only Trinomials and pentanomials supported");
        }
        int i2 = iArr[0];
        int i3 = iArr[1];
        if (i2 < i3 && i2 < (i = iArr[2])) {
            iArr2[0] = i2;
            if (i3 < i) {
                iArr2[1] = i3;
                iArr2[2] = i;
                return iArr2;
            }
            iArr2[1] = i;
            iArr2[2] = iArr[1];
            return iArr2;
        }
        int i4 = iArr[2];
        if (i3 < i4) {
            iArr2[0] = i3;
            int i5 = iArr[0];
            if (i5 < i4) {
                iArr2[1] = i5;
                iArr2[2] = i4;
                return iArr2;
            }
            iArr2[1] = i4;
            iArr2[2] = i5;
            return iArr2;
        }
        iArr2[0] = i4;
        int i6 = iArr[0];
        if (i6 < i3) {
            iArr2[1] = i6;
            iArr2[2] = iArr[1];
            return iArr2;
        }
        iArr2[1] = i3;
        iArr2[2] = i6;
        return iArr2;
    }
}
