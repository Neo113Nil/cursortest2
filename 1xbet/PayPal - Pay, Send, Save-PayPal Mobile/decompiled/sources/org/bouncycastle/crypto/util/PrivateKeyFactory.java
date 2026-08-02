package org.bouncycastle.crypto.util;

/* loaded from: classes17.dex */
public class PrivateKeyFactory {
    public static org.bouncycastle.crypto.params.AsymmetricKeyParameter createKey(org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo) throws java.io.IOException {
        java.math.BigInteger value;
        org.bouncycastle.crypto.params.ECGOST3410Parameters eCGOST3410Parameters;
        org.bouncycastle.crypto.params.ECDomainParameters eCDomainParameters;
        org.bouncycastle.asn1.x509.AlgorithmIdentifier privateKeyAlgorithm = privateKeyInfo.getPrivateKeyAlgorithm();
        org.bouncycastle.asn1.ASN1ObjectIdentifier algorithm = privateKeyAlgorithm.getAlgorithm();
        if (algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.rsaEncryption) || algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_RSASSA_PSS) || algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.x509.X509ObjectIdentifiers.id_ea_rsa)) {
            org.bouncycastle.asn1.pkcs.RSAPrivateKey rSAPrivateKey = org.bouncycastle.asn1.pkcs.RSAPrivateKey.getInstance(privateKeyInfo.parsePrivateKey());
            return new org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters(rSAPrivateKey.getModulus(), rSAPrivateKey.getPublicExponent(), rSAPrivateKey.getPrivateExponent(), rSAPrivateKey.getPrime1(), rSAPrivateKey.getPrime2(), rSAPrivateKey.getExponent1(), rSAPrivateKey.getExponent2(), rSAPrivateKey.getCoefficient());
        }
        org.bouncycastle.crypto.params.ECGOST3410Parameters eCGOST3410Parameters2 = null;
        org.bouncycastle.crypto.params.DSAParameters dSAParameters = null;
        if (algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.dhKeyAgreement)) {
            org.bouncycastle.asn1.pkcs.DHParameter dHParameter = org.bouncycastle.asn1.pkcs.DHParameter.getInstance(privateKeyAlgorithm.getParameters());
            org.bouncycastle.asn1.ASN1Integer aSN1Integer = (org.bouncycastle.asn1.ASN1Integer) privateKeyInfo.parsePrivateKey();
            java.math.BigInteger l = dHParameter.getL();
            return new org.bouncycastle.crypto.params.DHPrivateKeyParameters(aSN1Integer.getValue(), new org.bouncycastle.crypto.params.DHParameters(dHParameter.getP(), dHParameter.getG(), null, l == null ? 0 : l.intValue()));
        }
        if (algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.elGamalAlgorithm)) {
            org.bouncycastle.asn1.oiw.ElGamalParameter elGamalParameter = org.bouncycastle.asn1.oiw.ElGamalParameter.getInstance(privateKeyAlgorithm.getParameters());
            return new org.bouncycastle.crypto.params.ElGamalPrivateKeyParameters(((org.bouncycastle.asn1.ASN1Integer) privateKeyInfo.parsePrivateKey()).getValue(), new org.bouncycastle.crypto.params.ElGamalParameters(elGamalParameter.getP(), elGamalParameter.getG()));
        }
        if (algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.x9.X9ObjectIdentifiers.id_dsa)) {
            org.bouncycastle.asn1.ASN1Integer aSN1Integer2 = (org.bouncycastle.asn1.ASN1Integer) privateKeyInfo.parsePrivateKey();
            org.bouncycastle.asn1.ASN1Encodable parameters = privateKeyAlgorithm.getParameters();
            if (parameters != null) {
                org.bouncycastle.asn1.x509.DSAParameter dSAParameter = org.bouncycastle.asn1.x509.DSAParameter.getInstance(parameters.toASN1Primitive());
                dSAParameters = new org.bouncycastle.crypto.params.DSAParameters(dSAParameter.getP(), dSAParameter.getQ(), dSAParameter.getG());
            }
            return new org.bouncycastle.crypto.params.DSAPrivateKeyParameters(aSN1Integer2.getValue(), dSAParameters);
        }
        if (algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.x9.X9ObjectIdentifiers.id_ecPublicKey)) {
            org.bouncycastle.asn1.x9.X962Parameters x962Parameters = org.bouncycastle.asn1.x9.X962Parameters.getInstance(privateKeyAlgorithm.getParameters());
            boolean isNamedCurve = x962Parameters.isNamedCurve();
            org.bouncycastle.asn1.ASN1Primitive parameters2 = x962Parameters.getParameters();
            if (isNamedCurve) {
                org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = (org.bouncycastle.asn1.ASN1ObjectIdentifier) parameters2;
                org.bouncycastle.asn1.x9.X9ECParameters byOID = org.bouncycastle.crypto.ec.CustomNamedCurves.getByOID(aSN1ObjectIdentifier);
                if (byOID == null) {
                    byOID = org.bouncycastle.asn1.x9.ECNamedCurveTable.getByOID(aSN1ObjectIdentifier);
                }
                eCDomainParameters = new org.bouncycastle.crypto.params.ECNamedDomainParameters(aSN1ObjectIdentifier, byOID);
            } else {
                org.bouncycastle.asn1.x9.X9ECParameters x9ECParameters = org.bouncycastle.asn1.x9.X9ECParameters.getInstance(parameters2);
                eCDomainParameters = new org.bouncycastle.crypto.params.ECDomainParameters(x9ECParameters.getCurve(), x9ECParameters.getG(), x9ECParameters.getN(), x9ECParameters.getH(), x9ECParameters.getSeed());
            }
            return new org.bouncycastle.crypto.params.ECPrivateKeyParameters(org.bouncycastle.asn1.sec.ECPrivateKey.getInstance(privateKeyInfo.parsePrivateKey()).getKey(), eCDomainParameters);
        }
        if (algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_X25519)) {
            return new org.bouncycastle.crypto.params.X25519PrivateKeyParameters(org.bouncycastle.asn1.ASN1OctetString.getInstance(privateKeyInfo.parsePrivateKey()).getOctets());
        }
        if (algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_X448)) {
            return new org.bouncycastle.crypto.params.X448PrivateKeyParameters(org.bouncycastle.asn1.ASN1OctetString.getInstance(privateKeyInfo.parsePrivateKey()).getOctets());
        }
        if (algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_Ed25519)) {
            return new org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters(org.bouncycastle.asn1.ASN1OctetString.getInstance(privateKeyInfo.parsePrivateKey()).getOctets());
        }
        if (algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_Ed448)) {
            return new org.bouncycastle.crypto.params.Ed448PrivateKeyParameters(org.bouncycastle.asn1.ASN1OctetString.getInstance(privateKeyInfo.parsePrivateKey()).getOctets());
        }
        if (!algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3410_2001) && !algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3410_12_512) && !algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3410_12_256)) {
            throw new java.lang.RuntimeException("algorithm identifier in private key not recognised");
        }
        org.bouncycastle.asn1.ASN1Encodable parameters3 = privateKeyAlgorithm.getParameters();
        org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters gOST3410PublicKeyAlgParameters = org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters.getInstance(parameters3);
        org.bouncycastle.asn1.ASN1Primitive aSN1Primitive = parameters3.toASN1Primitive();
        if ((aSN1Primitive instanceof org.bouncycastle.asn1.ASN1Sequence) && (org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1Primitive).size() == 2 || org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1Primitive).size() == 3)) {
            eCGOST3410Parameters = new org.bouncycastle.crypto.params.ECGOST3410Parameters(new org.bouncycastle.crypto.params.ECNamedDomainParameters(gOST3410PublicKeyAlgParameters.getPublicKeyParamSet(), org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves.getByOIDX9(gOST3410PublicKeyAlgParameters.getPublicKeyParamSet())), gOST3410PublicKeyAlgParameters.getPublicKeyParamSet(), gOST3410PublicKeyAlgParameters.getDigestParamSet(), gOST3410PublicKeyAlgParameters.getEncryptionParamSet());
            org.bouncycastle.asn1.ASN1OctetString privateKey = privateKeyInfo.getPrivateKey();
            if (privateKey.getOctets().length == 32 || privateKey.getOctets().length == 64) {
                value = new java.math.BigInteger(1, org.bouncycastle.util.Arrays.reverse(privateKey.getOctets()));
            } else {
                org.bouncycastle.asn1.ASN1Encodable parsePrivateKey = privateKeyInfo.parsePrivateKey();
                value = parsePrivateKey instanceof org.bouncycastle.asn1.ASN1Integer ? org.bouncycastle.asn1.ASN1Integer.getInstance(parsePrivateKey).getPositiveValue() : new java.math.BigInteger(1, org.bouncycastle.util.Arrays.reverse(org.bouncycastle.asn1.ASN1OctetString.getInstance(parsePrivateKey).getOctets()));
            }
        } else {
            org.bouncycastle.asn1.x9.X962Parameters x962Parameters2 = org.bouncycastle.asn1.x9.X962Parameters.getInstance(privateKeyAlgorithm.getParameters());
            if (x962Parameters2.isNamedCurve()) {
                org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier2 = org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(x962Parameters2.getParameters());
                eCGOST3410Parameters2 = new org.bouncycastle.crypto.params.ECGOST3410Parameters(new org.bouncycastle.crypto.params.ECNamedDomainParameters(aSN1ObjectIdentifier2, org.bouncycastle.asn1.x9.ECNamedCurveTable.getByOID(aSN1ObjectIdentifier2)), gOST3410PublicKeyAlgParameters.getPublicKeyParamSet(), gOST3410PublicKeyAlgParameters.getDigestParamSet(), gOST3410PublicKeyAlgParameters.getEncryptionParamSet());
            } else if (!x962Parameters2.isImplicitlyCA()) {
                eCGOST3410Parameters2 = new org.bouncycastle.crypto.params.ECGOST3410Parameters(new org.bouncycastle.crypto.params.ECNamedDomainParameters(algorithm, org.bouncycastle.asn1.x9.X9ECParameters.getInstance(x962Parameters2.getParameters())), gOST3410PublicKeyAlgParameters.getPublicKeyParamSet(), gOST3410PublicKeyAlgParameters.getDigestParamSet(), gOST3410PublicKeyAlgParameters.getEncryptionParamSet());
            }
            org.bouncycastle.asn1.ASN1Encodable parsePrivateKey2 = privateKeyInfo.parsePrivateKey();
            value = parsePrivateKey2 instanceof org.bouncycastle.asn1.ASN1Integer ? org.bouncycastle.asn1.ASN1Integer.getInstance(parsePrivateKey2).getValue() : org.bouncycastle.asn1.sec.ECPrivateKey.getInstance(parsePrivateKey2).getKey();
            eCGOST3410Parameters = eCGOST3410Parameters2;
        }
        return new org.bouncycastle.crypto.params.ECPrivateKeyParameters(value, new org.bouncycastle.crypto.params.ECGOST3410Parameters(eCGOST3410Parameters, gOST3410PublicKeyAlgParameters.getPublicKeyParamSet(), gOST3410PublicKeyAlgParameters.getDigestParamSet(), gOST3410PublicKeyAlgParameters.getEncryptionParamSet()));
    }

    public static org.bouncycastle.crypto.params.AsymmetricKeyParameter createKey(byte[] bArr) throws java.io.IOException {
        return createKey(org.bouncycastle.asn1.pkcs.PrivateKeyInfo.getInstance(org.bouncycastle.asn1.ASN1Primitive.fromByteArray(bArr)));
    }

    public static org.bouncycastle.crypto.params.AsymmetricKeyParameter createKey(java.io.InputStream inputStream) throws java.io.IOException {
        return createKey(org.bouncycastle.asn1.pkcs.PrivateKeyInfo.getInstance(new org.bouncycastle.asn1.ASN1InputStream(inputStream).readObject()));
    }
}
