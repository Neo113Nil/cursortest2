package org.bouncycastle.crypto.util;

/* loaded from: classes17.dex */
public class PrivateKeyInfoFactory {
    private static java.util.Set getHighSpeedVideoFpsRangesFor;

    public static org.bouncycastle.asn1.pkcs.PrivateKeyInfo createPrivateKeyInfo(org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter, org.bouncycastle.asn1.ASN1Set aSN1Set) throws java.io.IOException {
        org.bouncycastle.asn1.x9.X962Parameters x962Parameters;
        java.math.BigInteger n;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier;
        if (asymmetricKeyParameter instanceof org.bouncycastle.crypto.params.RSAKeyParameters) {
            org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters rSAPrivateCrtKeyParameters = (org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters) asymmetricKeyParameter;
            return new org.bouncycastle.asn1.pkcs.PrivateKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.rsaEncryption, org.bouncycastle.asn1.DERNull.INSTANCE), new org.bouncycastle.asn1.pkcs.RSAPrivateKey(rSAPrivateCrtKeyParameters.getModulus(), rSAPrivateCrtKeyParameters.getPublicExponent(), rSAPrivateCrtKeyParameters.getExponent(), rSAPrivateCrtKeyParameters.getP(), rSAPrivateCrtKeyParameters.getQ(), rSAPrivateCrtKeyParameters.getDP(), rSAPrivateCrtKeyParameters.getDQ(), rSAPrivateCrtKeyParameters.getQInv()), aSN1Set);
        }
        if (asymmetricKeyParameter instanceof org.bouncycastle.crypto.params.DSAPrivateKeyParameters) {
            org.bouncycastle.crypto.params.DSAPrivateKeyParameters dSAPrivateKeyParameters = (org.bouncycastle.crypto.params.DSAPrivateKeyParameters) asymmetricKeyParameter;
            org.bouncycastle.crypto.params.DSAParameters parameters = dSAPrivateKeyParameters.getParameters();
            return new org.bouncycastle.asn1.pkcs.PrivateKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.id_dsa, new org.bouncycastle.asn1.x509.DSAParameter(parameters.getP(), parameters.getQ(), parameters.getG())), new org.bouncycastle.asn1.ASN1Integer(dSAPrivateKeyParameters.getX()), aSN1Set);
        }
        if (!(asymmetricKeyParameter instanceof org.bouncycastle.crypto.params.ECPrivateKeyParameters)) {
            if (asymmetricKeyParameter instanceof org.bouncycastle.crypto.params.X448PrivateKeyParameters) {
                org.bouncycastle.crypto.params.X448PrivateKeyParameters x448PrivateKeyParameters = (org.bouncycastle.crypto.params.X448PrivateKeyParameters) asymmetricKeyParameter;
                return new org.bouncycastle.asn1.pkcs.PrivateKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_X448), new org.bouncycastle.asn1.DEROctetString(x448PrivateKeyParameters.getEncoded()), aSN1Set, x448PrivateKeyParameters.generatePublicKey().getEncoded());
            }
            if (asymmetricKeyParameter instanceof org.bouncycastle.crypto.params.X25519PrivateKeyParameters) {
                org.bouncycastle.crypto.params.X25519PrivateKeyParameters x25519PrivateKeyParameters = (org.bouncycastle.crypto.params.X25519PrivateKeyParameters) asymmetricKeyParameter;
                return new org.bouncycastle.asn1.pkcs.PrivateKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_X25519), new org.bouncycastle.asn1.DEROctetString(x25519PrivateKeyParameters.getEncoded()), aSN1Set, x25519PrivateKeyParameters.generatePublicKey().getEncoded());
            }
            if (asymmetricKeyParameter instanceof org.bouncycastle.crypto.params.Ed448PrivateKeyParameters) {
                org.bouncycastle.crypto.params.Ed448PrivateKeyParameters ed448PrivateKeyParameters = (org.bouncycastle.crypto.params.Ed448PrivateKeyParameters) asymmetricKeyParameter;
                return new org.bouncycastle.asn1.pkcs.PrivateKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_Ed448), new org.bouncycastle.asn1.DEROctetString(ed448PrivateKeyParameters.getEncoded()), aSN1Set, ed448PrivateKeyParameters.generatePublicKey().getEncoded());
            }
            if (!(asymmetricKeyParameter instanceof org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters)) {
                throw new java.io.IOException("key parameters not recognized");
            }
            org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters ed25519PrivateKeyParameters = (org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters) asymmetricKeyParameter;
            return new org.bouncycastle.asn1.pkcs.PrivateKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_Ed25519), new org.bouncycastle.asn1.DEROctetString(ed25519PrivateKeyParameters.getEncoded()), aSN1Set, ed25519PrivateKeyParameters.generatePublicKey().getEncoded());
        }
        org.bouncycastle.crypto.params.ECPrivateKeyParameters eCPrivateKeyParameters = (org.bouncycastle.crypto.params.ECPrivateKeyParameters) asymmetricKeyParameter;
        org.bouncycastle.crypto.params.ECDomainParameters parameters2 = eCPrivateKeyParameters.getParameters();
        if (parameters2 == null) {
            x962Parameters = new org.bouncycastle.asn1.x9.X962Parameters((org.bouncycastle.asn1.ASN1Null) org.bouncycastle.asn1.DERNull.INSTANCE);
            n = eCPrivateKeyParameters.getD();
        } else {
            if (parameters2 instanceof org.bouncycastle.crypto.params.ECGOST3410Parameters) {
                org.bouncycastle.crypto.params.ECGOST3410Parameters eCGOST3410Parameters = (org.bouncycastle.crypto.params.ECGOST3410Parameters) parameters2;
                org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters gOST3410PublicKeyAlgParameters = new org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters(eCGOST3410Parameters.getPublicKeyParamSet(), eCGOST3410Parameters.getDigestParamSet(), eCGOST3410Parameters.getEncryptionParamSet());
                if (getHighSpeedVideoFpsRangesFor.contains(gOST3410PublicKeyAlgParameters.getPublicKeyParamSet())) {
                    aSN1ObjectIdentifier = org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3410_2001;
                } else {
                    boolean z = eCPrivateKeyParameters.getD().bitLength() > 256;
                    org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier2 = z ? org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3410_12_512 : org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3410_12_256;
                    r3 = z ? 64 : 32;
                    aSN1ObjectIdentifier = aSN1ObjectIdentifier2;
                }
                byte[] bArr = new byte[r3];
                byte[] byteArray = eCPrivateKeyParameters.getD().toByteArray();
                if (byteArray.length < r3) {
                    byte[] bArr2 = new byte[r3];
                    java.lang.System.arraycopy(byteArray, 0, bArr2, r3 - byteArray.length, byteArray.length);
                    byteArray = bArr2;
                }
                for (int i = 0; i != r3; i++) {
                    bArr[i] = byteArray[(byteArray.length - 1) - i];
                }
                return new org.bouncycastle.asn1.pkcs.PrivateKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(aSN1ObjectIdentifier, gOST3410PublicKeyAlgParameters), new org.bouncycastle.asn1.DEROctetString(bArr));
            }
            x962Parameters = parameters2 instanceof org.bouncycastle.crypto.params.ECNamedDomainParameters ? new org.bouncycastle.asn1.x9.X962Parameters(((org.bouncycastle.crypto.params.ECNamedDomainParameters) parameters2).getName()) : new org.bouncycastle.asn1.x9.X962Parameters(new org.bouncycastle.asn1.x9.X9ECParameters(parameters2.getCurve(), new org.bouncycastle.asn1.x9.X9ECPoint(parameters2.getG(), false), parameters2.getN(), parameters2.getH(), parameters2.getSeed()));
            n = parameters2.getN();
        }
        return new org.bouncycastle.asn1.pkcs.PrivateKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.id_ecPublicKey, x962Parameters), new org.bouncycastle.asn1.sec.ECPrivateKey(n.bitLength(), eCPrivateKeyParameters.getD(), new org.bouncycastle.asn1.DERBitString(new org.bouncycastle.math.ec.FixedPointCombMultiplier().multiply(parameters2.getG(), eCPrivateKeyParameters.getD()).getEncoded(false)), x962Parameters), aSN1Set);
    }

    public static org.bouncycastle.asn1.pkcs.PrivateKeyInfo createPrivateKeyInfo(org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter) throws java.io.IOException {
        return createPrivateKeyInfo(asymmetricKeyParameter, null);
    }

    private PrivateKeyInfoFactory() {
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
