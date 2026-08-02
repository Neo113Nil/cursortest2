package org.bouncycastle.pqc.crypto.mceliece;

/* loaded from: classes17.dex */
class Utils {
    static org.bouncycastle.crypto.Digest Camera2StreamConfigurationMap(java.lang.String str) {
        if (str.equals("SHA-1")) {
            return new org.bouncycastle.crypto.digests.SHA1Digest();
        }
        if (str.equals("SHA-224")) {
            return new org.bouncycastle.crypto.digests.SHA224Digest();
        }
        if (str.equals("SHA-256")) {
            return new org.bouncycastle.crypto.digests.SHA256Digest();
        }
        if (str.equals("SHA-384")) {
            return new org.bouncycastle.crypto.digests.SHA384Digest();
        }
        if (str.equals("SHA-512")) {
            return new org.bouncycastle.crypto.digests.SHA512Digest();
        }
        throw new java.lang.IllegalArgumentException("unrecognised digest algorithm: ".concat(java.lang.String.valueOf(str)));
    }

    Utils() {
    }
}
