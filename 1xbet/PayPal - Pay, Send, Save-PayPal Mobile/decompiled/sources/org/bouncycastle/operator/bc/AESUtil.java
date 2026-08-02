package org.bouncycastle.operator.bc;

/* loaded from: classes17.dex */
class AESUtil {
    static org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.crypto.params.KeyParameter keyParameter) {
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier;
        int length = keyParameter.getKey().length * 8;
        if (length == 128) {
            aSN1ObjectIdentifier = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_wrap;
        } else if (length == 192) {
            aSN1ObjectIdentifier = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_wrap;
        } else {
            if (length != 256) {
                throw new java.lang.IllegalArgumentException("illegal keysize in AES");
            }
            aSN1ObjectIdentifier = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_wrap;
        }
        return new org.bouncycastle.asn1.x509.AlgorithmIdentifier(aSN1ObjectIdentifier);
    }

    AESUtil() {
    }
}
