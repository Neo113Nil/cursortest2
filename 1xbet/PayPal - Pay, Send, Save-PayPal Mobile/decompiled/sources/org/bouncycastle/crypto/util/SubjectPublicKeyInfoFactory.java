package org.bouncycastle.crypto.util;

/* loaded from: classes17.dex */
public class SubjectPublicKeyInfoFactory {
    private static java.util.Set getHighSpeedVideoFpsRangesFor;

    private static void Camera2StreamConfigurationMap(byte[] bArr, int i, int i2, java.math.BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length < i) {
            byte[] bArr2 = new byte[i];
            java.lang.System.arraycopy(byteArray, 0, bArr2, i - byteArray.length, byteArray.length);
            byteArray = bArr2;
        }
        for (int i3 = 0; i3 != i; i3++) {
            bArr[i2 + i3] = byteArray[(byteArray.length - 1) - i3];
        }
    }

    public static org.bouncycastle.asn1.x509.SubjectPublicKeyInfo createSubjectPublicKeyInfo(org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter) throws java.io.IOException {
        org.bouncycastle.asn1.x9.X962Parameters x962Parameters;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier;
        if (asymmetricKeyParameter instanceof org.bouncycastle.crypto.params.RSAKeyParameters) {
            org.bouncycastle.crypto.params.RSAKeyParameters rSAKeyParameters = (org.bouncycastle.crypto.params.RSAKeyParameters) asymmetricKeyParameter;
            return new org.bouncycastle.asn1.x509.SubjectPublicKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.rsaEncryption, org.bouncycastle.asn1.DERNull.INSTANCE), new org.bouncycastle.asn1.pkcs.RSAPublicKey(rSAKeyParameters.getModulus(), rSAKeyParameters.getExponent()));
        }
        if (asymmetricKeyParameter instanceof org.bouncycastle.crypto.params.DSAPublicKeyParameters) {
            org.bouncycastle.crypto.params.DSAPublicKeyParameters dSAPublicKeyParameters = (org.bouncycastle.crypto.params.DSAPublicKeyParameters) asymmetricKeyParameter;
            org.bouncycastle.crypto.params.DSAParameters parameters = dSAPublicKeyParameters.getParameters();
            return new org.bouncycastle.asn1.x509.SubjectPublicKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.id_dsa, parameters != null ? new org.bouncycastle.asn1.x509.DSAParameter(parameters.getP(), parameters.getQ(), parameters.getG()) : null), new org.bouncycastle.asn1.ASN1Integer(dSAPublicKeyParameters.getY()));
        }
        if (!(asymmetricKeyParameter instanceof org.bouncycastle.crypto.params.ECPublicKeyParameters)) {
            if (asymmetricKeyParameter instanceof org.bouncycastle.crypto.params.X448PublicKeyParameters) {
                return new org.bouncycastle.asn1.x509.SubjectPublicKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_X448), ((org.bouncycastle.crypto.params.X448PublicKeyParameters) asymmetricKeyParameter).getEncoded());
            }
            if (asymmetricKeyParameter instanceof org.bouncycastle.crypto.params.X25519PublicKeyParameters) {
                return new org.bouncycastle.asn1.x509.SubjectPublicKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_X25519), ((org.bouncycastle.crypto.params.X25519PublicKeyParameters) asymmetricKeyParameter).getEncoded());
            }
            if (asymmetricKeyParameter instanceof org.bouncycastle.crypto.params.Ed448PublicKeyParameters) {
                return new org.bouncycastle.asn1.x509.SubjectPublicKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_Ed448), ((org.bouncycastle.crypto.params.Ed448PublicKeyParameters) asymmetricKeyParameter).getEncoded());
            }
            if (asymmetricKeyParameter instanceof org.bouncycastle.crypto.params.Ed25519PublicKeyParameters) {
                return new org.bouncycastle.asn1.x509.SubjectPublicKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_Ed25519), ((org.bouncycastle.crypto.params.Ed25519PublicKeyParameters) asymmetricKeyParameter).getEncoded());
            }
            throw new java.io.IOException("key parameters not recognized");
        }
        org.bouncycastle.crypto.params.ECPublicKeyParameters eCPublicKeyParameters = (org.bouncycastle.crypto.params.ECPublicKeyParameters) asymmetricKeyParameter;
        org.bouncycastle.crypto.params.ECDomainParameters parameters2 = eCPublicKeyParameters.getParameters();
        if (parameters2 == null) {
            x962Parameters = new org.bouncycastle.asn1.x9.X962Parameters((org.bouncycastle.asn1.ASN1Null) org.bouncycastle.asn1.DERNull.INSTANCE);
        } else {
            if (parameters2 instanceof org.bouncycastle.crypto.params.ECGOST3410Parameters) {
                org.bouncycastle.crypto.params.ECGOST3410Parameters eCGOST3410Parameters = (org.bouncycastle.crypto.params.ECGOST3410Parameters) parameters2;
                java.math.BigInteger bigInteger = eCPublicKeyParameters.getQ().getAffineXCoord().toBigInteger();
                java.math.BigInteger bigInteger2 = eCPublicKeyParameters.getQ().getAffineYCoord().toBigInteger();
                org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters gOST3410PublicKeyAlgParameters = new org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters(eCGOST3410Parameters.getPublicKeyParamSet(), eCGOST3410Parameters.getDigestParamSet());
                int i = 64;
                int i2 = 32;
                if (getHighSpeedVideoFpsRangesFor.contains(eCGOST3410Parameters.getPublicKeyParamSet())) {
                    aSN1ObjectIdentifier = org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3410_2001;
                } else if (bigInteger.bitLength() > 256) {
                    aSN1ObjectIdentifier = org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3410_12_512;
                    i2 = 64;
                    i = 128;
                } else {
                    aSN1ObjectIdentifier = org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3410_12_256;
                }
                byte[] bArr = new byte[i];
                int i3 = i / 2;
                Camera2StreamConfigurationMap(bArr, i3, 0, bigInteger);
                Camera2StreamConfigurationMap(bArr, i3, i2, bigInteger2);
                try {
                    return new org.bouncycastle.asn1.x509.SubjectPublicKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(aSN1ObjectIdentifier, gOST3410PublicKeyAlgParameters), new org.bouncycastle.asn1.DEROctetString(bArr));
                } catch (java.io.IOException unused) {
                    return null;
                }
            }
            x962Parameters = parameters2 instanceof org.bouncycastle.crypto.params.ECNamedDomainParameters ? new org.bouncycastle.asn1.x9.X962Parameters(((org.bouncycastle.crypto.params.ECNamedDomainParameters) parameters2).getName()) : new org.bouncycastle.asn1.x9.X962Parameters(new org.bouncycastle.asn1.x9.X9ECParameters(parameters2.getCurve(), new org.bouncycastle.asn1.x9.X9ECPoint(parameters2.getG(), false), parameters2.getN(), parameters2.getH(), parameters2.getSeed()));
        }
        return new org.bouncycastle.asn1.x509.SubjectPublicKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.id_ecPublicKey, x962Parameters), eCPublicKeyParameters.getQ().getEncoded(false));
    }

    private SubjectPublicKeyInfoFactory() {
    }

    static {
        java.util.HashSet hashSet = new java.util.HashSet(5);
        getHighSpeedVideoFpsRangesFor = hashSet;
        hashSet.add(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_A);
        getHighSpeedVideoFpsRangesFor.add(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_B);
        getHighSpeedVideoFpsRangesFor.add(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_C);
        getHighSpeedVideoFpsRangesFor.add(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_XchA);
        getHighSpeedVideoFpsRangesFor.add(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_XchB);
    }
}
