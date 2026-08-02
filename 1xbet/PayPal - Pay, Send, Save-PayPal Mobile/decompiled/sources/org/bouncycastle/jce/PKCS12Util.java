package org.bouncycastle.jce;

/* loaded from: classes17.dex */
public class PKCS12Util {
    public static byte[] convertToDefiniteLength(byte[] bArr, char[] cArr, java.lang.String str) throws java.io.IOException {
        org.bouncycastle.asn1.pkcs.Pfx pfx = org.bouncycastle.asn1.pkcs.Pfx.getInstance(bArr);
        org.bouncycastle.asn1.pkcs.ContentInfo authSafe = pfx.getAuthSafe();
        org.bouncycastle.asn1.pkcs.ContentInfo contentInfo = new org.bouncycastle.asn1.pkcs.ContentInfo(authSafe.getContentType(), new org.bouncycastle.asn1.DEROctetString(org.bouncycastle.asn1.ASN1Primitive.fromByteArray(org.bouncycastle.asn1.ASN1OctetString.getInstance(authSafe.getContent()).getOctets()).getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER)));
        org.bouncycastle.asn1.pkcs.MacData macData = pfx.getMacData();
        try {
            int intValue = macData.getIterationCount().intValue();
            byte[] octets = org.bouncycastle.asn1.ASN1OctetString.getInstance(contentInfo.getContent()).getOctets();
            org.bouncycastle.asn1.ASN1ObjectIdentifier algorithm = macData.getMac().getAlgorithmId().getAlgorithm();
            byte[] salt = macData.getSalt();
            javax.crypto.SecretKeyFactory secretKeyFactory = javax.crypto.SecretKeyFactory.getInstance(algorithm.getId(), str);
            javax.crypto.spec.PBEParameterSpec pBEParameterSpec = new javax.crypto.spec.PBEParameterSpec(salt, intValue);
            javax.crypto.SecretKey generateSecret = secretKeyFactory.generateSecret(new javax.crypto.spec.PBEKeySpec(cArr));
            javax.crypto.Mac mac = javax.crypto.Mac.getInstance(algorithm.getId(), str);
            mac.init(generateSecret, pBEParameterSpec);
            mac.update(octets);
            return new org.bouncycastle.asn1.pkcs.Pfx(contentInfo, new org.bouncycastle.asn1.pkcs.MacData(new org.bouncycastle.asn1.x509.DigestInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(macData.getMac().getAlgorithmId().getAlgorithm(), org.bouncycastle.asn1.DERNull.INSTANCE), mac.doFinal()), macData.getSalt(), intValue)).getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("error constructing MAC: ");
            sb.append(e.toString());
            throw new java.io.IOException(sb.toString());
        }
    }

    public static byte[] convertToDefiniteLength(byte[] bArr) throws java.io.IOException {
        return org.bouncycastle.asn1.pkcs.Pfx.getInstance(bArr).getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
    }
}
