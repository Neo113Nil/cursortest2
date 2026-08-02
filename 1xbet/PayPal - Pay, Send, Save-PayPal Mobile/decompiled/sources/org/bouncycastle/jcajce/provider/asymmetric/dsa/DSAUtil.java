package org.bouncycastle.jcajce.provider.asymmetric.dsa;

/* loaded from: classes17.dex */
public class DSAUtil {
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier[] dsaOids = {org.bouncycastle.asn1.x9.X9ObjectIdentifiers.id_dsa, org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.dsaWithSHA1, org.bouncycastle.asn1.x9.X9ObjectIdentifiers.id_dsa_with_sha1};

    public static org.bouncycastle.crypto.params.AsymmetricKeyParameter generatePublicKeyParameter(java.security.PublicKey publicKey) throws java.security.InvalidKeyException {
        if (publicKey instanceof org.bouncycastle.jcajce.provider.asymmetric.dsa.BCDSAPublicKey) {
            return ((org.bouncycastle.jcajce.provider.asymmetric.dsa.BCDSAPublicKey) publicKey).getHighResolutionOutputSizeshNQ4ISI;
        }
        if (publicKey instanceof java.security.interfaces.DSAPublicKey) {
            return new org.bouncycastle.jcajce.provider.asymmetric.dsa.BCDSAPublicKey((java.security.interfaces.DSAPublicKey) publicKey).getHighResolutionOutputSizeshNQ4ISI;
        }
        try {
            return new org.bouncycastle.jcajce.provider.asymmetric.dsa.BCDSAPublicKey(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(publicKey.getEncoded())).getHighResolutionOutputSizeshNQ4ISI;
        } catch (java.lang.Exception unused) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("can't identify DSA public key: ");
            sb.append(publicKey.getClass().getName());
            throw new java.security.InvalidKeyException(sb.toString());
        }
    }

    static org.bouncycastle.crypto.params.DSAParameters getHighSpeedVideoSizes(java.security.interfaces.DSAParams dSAParams) {
        if (dSAParams != null) {
            return new org.bouncycastle.crypto.params.DSAParameters(dSAParams.getP(), dSAParams.getQ(), dSAParams.getG());
        }
        return null;
    }

    public static boolean isDsaOid(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        int i = 0;
        while (true) {
            org.bouncycastle.asn1.ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = dsaOids;
            if (i == aSN1ObjectIdentifierArr.length) {
                return false;
            }
            if (aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifierArr[i])) {
                return true;
            }
            i++;
        }
    }

    public static org.bouncycastle.crypto.params.AsymmetricKeyParameter generatePrivateKeyParameter(java.security.PrivateKey privateKey) throws java.security.InvalidKeyException {
        if (!(privateKey instanceof java.security.interfaces.DSAPrivateKey)) {
            throw new java.security.InvalidKeyException("can't identify DSA private key.");
        }
        java.security.interfaces.DSAPrivateKey dSAPrivateKey = (java.security.interfaces.DSAPrivateKey) privateKey;
        return new org.bouncycastle.crypto.params.DSAPrivateKeyParameters(dSAPrivateKey.getX(), new org.bouncycastle.crypto.params.DSAParameters(dSAPrivateKey.getParams().getP(), dSAPrivateKey.getParams().getQ(), dSAPrivateKey.getParams().getG()));
    }

    static java.lang.String getHighSpeedVideoSizes(java.math.BigInteger bigInteger, java.security.interfaces.DSAParams dSAParams) {
        return new org.bouncycastle.util.Fingerprint(org.bouncycastle.util.Arrays.concatenate(bigInteger.toByteArray(), dSAParams.getP().toByteArray(), dSAParams.getQ().toByteArray(), dSAParams.getG().toByteArray())).toString();
    }
}
