package org.bouncycastle.jcajce.provider.asymmetric.rsa;

/* loaded from: classes17.dex */
public class RSAUtil {
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier[] rsaOids = {org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.rsaEncryption, org.bouncycastle.asn1.x509.X509ObjectIdentifiers.id_ea_rsa, org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_RSAES_OAEP, org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_RSASSA_PSS};

    static org.bouncycastle.crypto.params.RSAKeyParameters getHighSpeedVideoFpsRangesFor(java.security.interfaces.RSAPublicKey rSAPublicKey) {
        return rSAPublicKey instanceof org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPublicKey ? ((org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPublicKey) rSAPublicKey).getHighSpeedVideoFpsRanges : new org.bouncycastle.crypto.params.RSAKeyParameters(false, rSAPublicKey.getModulus(), rSAPublicKey.getPublicExponent());
    }

    public static boolean isRsaOid(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        int i = 0;
        while (true) {
            org.bouncycastle.asn1.ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = rsaOids;
            if (i == aSN1ObjectIdentifierArr.length) {
                return false;
            }
            if (aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifierArr[i])) {
                return true;
            }
            i++;
        }
    }

    static org.bouncycastle.crypto.params.RSAKeyParameters getHighSpeedVideoSizes(java.security.interfaces.RSAPrivateKey rSAPrivateKey) {
        if (rSAPrivateKey instanceof org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateKey) {
            return ((org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateKey) rSAPrivateKey).Camera2StreamConfigurationMap();
        }
        if (!(rSAPrivateKey instanceof java.security.interfaces.RSAPrivateCrtKey)) {
            return new org.bouncycastle.crypto.params.RSAKeyParameters(true, rSAPrivateKey.getModulus(), rSAPrivateKey.getPrivateExponent());
        }
        java.security.interfaces.RSAPrivateCrtKey rSAPrivateCrtKey = (java.security.interfaces.RSAPrivateCrtKey) rSAPrivateKey;
        return new org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent(), rSAPrivateCrtKey.getPrivateExponent(), rSAPrivateCrtKey.getPrimeP(), rSAPrivateCrtKey.getPrimeQ(), rSAPrivateCrtKey.getPrimeExponentP(), rSAPrivateCrtKey.getPrimeExponentQ(), rSAPrivateCrtKey.getCrtCoefficient());
    }

    static java.lang.String getHighSpeedVideoFpsRangesFor(java.math.BigInteger bigInteger) {
        return new org.bouncycastle.util.Fingerprint(bigInteger.toByteArray()).toString();
    }

    static java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.math.BigInteger bigInteger) {
        return new org.bouncycastle.util.Fingerprint(bigInteger.toByteArray(), 32).toString();
    }
}
