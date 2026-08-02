package org.bouncycastle.jcajce.provider.asymmetric.util;

/* loaded from: classes17.dex */
public class DESUtil {
    private static final java.util.Set<java.lang.String> getHighResolutionOutputSizeshNQ4ISI;

    public static void setOddParity(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            bArr[i] = (byte) ((b & 254) | ((((b >> 7) ^ ((((((b >> 1) ^ (b >> 2)) ^ (b >> 3)) ^ (b >> 4)) ^ (b >> 5)) ^ (b >> 6))) ^ 1) & 1));
        }
    }

    public static boolean isDES(java.lang.String str) {
        return getHighResolutionOutputSizeshNQ4ISI.contains(org.bouncycastle.util.Strings.toUpperCase(str));
    }

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        getHighResolutionOutputSizeshNQ4ISI = hashSet;
        hashSet.add("DES");
        hashSet.add("DESEDE");
        hashSet.add(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.desCBC.getId());
        hashSet.add(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.des_EDE3_CBC.getId());
        hashSet.add(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_alg_CMS3DESwrap.getId());
    }
}
