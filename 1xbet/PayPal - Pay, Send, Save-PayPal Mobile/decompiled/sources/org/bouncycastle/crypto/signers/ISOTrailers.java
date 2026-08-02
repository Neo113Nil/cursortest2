package org.bouncycastle.crypto.signers;

/* loaded from: classes17.dex */
public class ISOTrailers {
    public static final int TRAILER_IMPLICIT = 188;
    public static final int TRAILER_RIPEMD128 = 13004;
    public static final int TRAILER_RIPEMD160 = 12748;
    public static final int TRAILER_SHA1 = 13260;
    public static final int TRAILER_SHA224 = 14540;
    public static final int TRAILER_SHA256 = 13516;
    public static final int TRAILER_SHA384 = 14028;
    public static final int TRAILER_SHA512 = 13772;
    public static final int TRAILER_SHA512_224 = 14796;
    public static final int TRAILER_SHA512_256 = 15052;
    public static final int TRAILER_WHIRLPOOL = 14284;
    private static final java.util.Map<java.lang.String, java.lang.Integer> getHighResolutionOutputSizeshNQ4ISI;

    public static boolean noTrailerAvailable(org.bouncycastle.crypto.Digest digest) {
        return !getHighResolutionOutputSizeshNQ4ISI.containsKey(digest.getAlgorithmName());
    }

    public static java.lang.Integer getTrailer(org.bouncycastle.crypto.Digest digest) {
        return getHighResolutionOutputSizeshNQ4ISI.get(digest.getAlgorithmName());
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("RIPEMD128", org.bouncycastle.util.Integers.valueOf(13004));
        hashMap.put("RIPEMD160", org.bouncycastle.util.Integers.valueOf(12748));
        hashMap.put("SHA-1", org.bouncycastle.util.Integers.valueOf(13260));
        hashMap.put("SHA-224", org.bouncycastle.util.Integers.valueOf(14540));
        hashMap.put("SHA-256", org.bouncycastle.util.Integers.valueOf(13516));
        hashMap.put("SHA-384", org.bouncycastle.util.Integers.valueOf(14028));
        hashMap.put("SHA-512", org.bouncycastle.util.Integers.valueOf(13772));
        hashMap.put(org.apache.commons.codec.digest.MessageDigestAlgorithms.SHA_512_224, org.bouncycastle.util.Integers.valueOf(TRAILER_SHA512_224));
        hashMap.put("SHA-512/256", org.bouncycastle.util.Integers.valueOf(TRAILER_SHA512_256));
        hashMap.put("Whirlpool", org.bouncycastle.util.Integers.valueOf(14284));
        getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.unmodifiableMap(hashMap);
    }
}
