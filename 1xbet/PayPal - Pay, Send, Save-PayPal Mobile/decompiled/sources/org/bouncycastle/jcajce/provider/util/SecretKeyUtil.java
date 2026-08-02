package org.bouncycastle.jcajce.provider.util;

/* loaded from: classes17.dex */
public class SecretKeyUtil {
    private static java.util.Map getHighResolutionOutputSizeshNQ4ISI;

    public static int getKeySize(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        java.lang.Integer num = (java.lang.Integer) getHighResolutionOutputSizeshNQ4ISI.get(aSN1ObjectIdentifier);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        getHighResolutionOutputSizeshNQ4ISI = hashMap;
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.des_EDE3_CBC.getId(), org.bouncycastle.util.Integers.valueOf(192));
        getHighResolutionOutputSizeshNQ4ISI.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_CBC, org.bouncycastle.util.Integers.valueOf(128));
        getHighResolutionOutputSizeshNQ4ISI.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_CBC, org.bouncycastle.util.Integers.valueOf(192));
        getHighResolutionOutputSizeshNQ4ISI.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_CBC, org.bouncycastle.util.Integers.valueOf(256));
        getHighResolutionOutputSizeshNQ4ISI.put(org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia128_cbc, org.bouncycastle.util.Integers.valueOf(128));
        getHighResolutionOutputSizeshNQ4ISI.put(org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia192_cbc, org.bouncycastle.util.Integers.valueOf(192));
        getHighResolutionOutputSizeshNQ4ISI.put(org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia256_cbc, org.bouncycastle.util.Integers.valueOf(256));
    }
}
