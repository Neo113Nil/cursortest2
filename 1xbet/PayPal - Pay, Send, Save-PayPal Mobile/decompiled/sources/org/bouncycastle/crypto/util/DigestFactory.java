package org.bouncycastle.crypto.util;

/* loaded from: classes17.dex */
public final class DigestFactory {
    private static final java.util.Map getHighSpeedVideoSizes;

    interface Cloner {
        org.bouncycastle.crypto.Digest getHighSpeedVideoFpsRanges(org.bouncycastle.crypto.Digest digest);
    }

    public static org.bouncycastle.crypto.Digest createSHAKE256() {
        return new org.bouncycastle.crypto.digests.SHAKEDigest(256);
    }

    public static org.bouncycastle.crypto.Digest createSHAKE128() {
        return new org.bouncycastle.crypto.digests.SHAKEDigest(128);
    }

    public static org.bouncycastle.crypto.Digest createSHA512_256() {
        return new org.bouncycastle.crypto.digests.SHA512tDigest(256);
    }

    public static org.bouncycastle.crypto.Digest createSHA512_224() {
        return new org.bouncycastle.crypto.digests.SHA512tDigest(224);
    }

    public static org.bouncycastle.crypto.Digest createSHA512() {
        return new org.bouncycastle.crypto.digests.SHA512Digest();
    }

    public static org.bouncycastle.crypto.Digest createSHA3_512() {
        return new org.bouncycastle.crypto.digests.SHA3Digest(512);
    }

    public static org.bouncycastle.crypto.Digest createSHA3_384() {
        return new org.bouncycastle.crypto.digests.SHA3Digest(384);
    }

    public static org.bouncycastle.crypto.Digest createSHA3_256() {
        return new org.bouncycastle.crypto.digests.SHA3Digest(256);
    }

    public static org.bouncycastle.crypto.Digest createSHA3_224() {
        return new org.bouncycastle.crypto.digests.SHA3Digest(224);
    }

    public static org.bouncycastle.crypto.Digest createSHA384() {
        return new org.bouncycastle.crypto.digests.SHA384Digest();
    }

    public static org.bouncycastle.crypto.Digest createSHA256() {
        return new org.bouncycastle.crypto.digests.SHA256Digest();
    }

    public static org.bouncycastle.crypto.Digest createSHA224() {
        return new org.bouncycastle.crypto.digests.SHA224Digest();
    }

    public static org.bouncycastle.crypto.Digest createSHA1() {
        return new org.bouncycastle.crypto.digests.SHA1Digest();
    }

    public static org.bouncycastle.crypto.Digest createMD5() {
        return new org.bouncycastle.crypto.digests.MD5Digest();
    }

    public static org.bouncycastle.crypto.Digest cloneDigest(org.bouncycastle.crypto.Digest digest) {
        return ((org.bouncycastle.crypto.util.DigestFactory.Cloner) getHighSpeedVideoSizes.get(digest.getAlgorithmName())).getHighSpeedVideoFpsRanges(digest);
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        getHighSpeedVideoSizes = hashMap;
        hashMap.put(createMD5().getAlgorithmName(), new org.bouncycastle.crypto.util.DigestFactory.Cloner() { // from class: org.bouncycastle.crypto.util.DigestFactory.1
            @Override // org.bouncycastle.crypto.util.DigestFactory.Cloner
            public final org.bouncycastle.crypto.Digest getHighSpeedVideoFpsRanges(org.bouncycastle.crypto.Digest digest) {
                return new org.bouncycastle.crypto.digests.MD5Digest((org.bouncycastle.crypto.digests.MD5Digest) digest);
            }
        });
        hashMap.put(createSHA1().getAlgorithmName(), new org.bouncycastle.crypto.util.DigestFactory.Cloner() { // from class: org.bouncycastle.crypto.util.DigestFactory.2
            @Override // org.bouncycastle.crypto.util.DigestFactory.Cloner
            public final org.bouncycastle.crypto.Digest getHighSpeedVideoFpsRanges(org.bouncycastle.crypto.Digest digest) {
                return new org.bouncycastle.crypto.digests.MD5Digest((org.bouncycastle.crypto.digests.MD5Digest) digest);
            }
        });
        hashMap.put(createSHA224().getAlgorithmName(), new org.bouncycastle.crypto.util.DigestFactory.Cloner() { // from class: org.bouncycastle.crypto.util.DigestFactory.3
            @Override // org.bouncycastle.crypto.util.DigestFactory.Cloner
            public final org.bouncycastle.crypto.Digest getHighSpeedVideoFpsRanges(org.bouncycastle.crypto.Digest digest) {
                return new org.bouncycastle.crypto.digests.SHA224Digest((org.bouncycastle.crypto.digests.SHA224Digest) digest);
            }
        });
        hashMap.put(createSHA256().getAlgorithmName(), new org.bouncycastle.crypto.util.DigestFactory.Cloner() { // from class: org.bouncycastle.crypto.util.DigestFactory.4
            @Override // org.bouncycastle.crypto.util.DigestFactory.Cloner
            public final org.bouncycastle.crypto.Digest getHighSpeedVideoFpsRanges(org.bouncycastle.crypto.Digest digest) {
                return new org.bouncycastle.crypto.digests.SHA256Digest((org.bouncycastle.crypto.digests.SHA256Digest) digest);
            }
        });
        hashMap.put(createSHA384().getAlgorithmName(), new org.bouncycastle.crypto.util.DigestFactory.Cloner() { // from class: org.bouncycastle.crypto.util.DigestFactory.5
            @Override // org.bouncycastle.crypto.util.DigestFactory.Cloner
            public final org.bouncycastle.crypto.Digest getHighSpeedVideoFpsRanges(org.bouncycastle.crypto.Digest digest) {
                return new org.bouncycastle.crypto.digests.SHA384Digest((org.bouncycastle.crypto.digests.SHA384Digest) digest);
            }
        });
        hashMap.put(createSHA512().getAlgorithmName(), new org.bouncycastle.crypto.util.DigestFactory.Cloner() { // from class: org.bouncycastle.crypto.util.DigestFactory.6
            @Override // org.bouncycastle.crypto.util.DigestFactory.Cloner
            public final org.bouncycastle.crypto.Digest getHighSpeedVideoFpsRanges(org.bouncycastle.crypto.Digest digest) {
                return new org.bouncycastle.crypto.digests.SHA512Digest((org.bouncycastle.crypto.digests.SHA512Digest) digest);
            }
        });
        hashMap.put(createSHA3_224().getAlgorithmName(), new org.bouncycastle.crypto.util.DigestFactory.Cloner() { // from class: org.bouncycastle.crypto.util.DigestFactory.7
            @Override // org.bouncycastle.crypto.util.DigestFactory.Cloner
            public final org.bouncycastle.crypto.Digest getHighSpeedVideoFpsRanges(org.bouncycastle.crypto.Digest digest) {
                return new org.bouncycastle.crypto.digests.SHA3Digest((org.bouncycastle.crypto.digests.SHA3Digest) digest);
            }
        });
        hashMap.put(createSHA3_256().getAlgorithmName(), new org.bouncycastle.crypto.util.DigestFactory.Cloner() { // from class: org.bouncycastle.crypto.util.DigestFactory.8
            @Override // org.bouncycastle.crypto.util.DigestFactory.Cloner
            public final org.bouncycastle.crypto.Digest getHighSpeedVideoFpsRanges(org.bouncycastle.crypto.Digest digest) {
                return new org.bouncycastle.crypto.digests.SHA3Digest((org.bouncycastle.crypto.digests.SHA3Digest) digest);
            }
        });
        hashMap.put(createSHA3_384().getAlgorithmName(), new org.bouncycastle.crypto.util.DigestFactory.Cloner() { // from class: org.bouncycastle.crypto.util.DigestFactory.9
            @Override // org.bouncycastle.crypto.util.DigestFactory.Cloner
            public final org.bouncycastle.crypto.Digest getHighSpeedVideoFpsRanges(org.bouncycastle.crypto.Digest digest) {
                return new org.bouncycastle.crypto.digests.SHA3Digest((org.bouncycastle.crypto.digests.SHA3Digest) digest);
            }
        });
        hashMap.put(createSHA3_512().getAlgorithmName(), new org.bouncycastle.crypto.util.DigestFactory.Cloner() { // from class: org.bouncycastle.crypto.util.DigestFactory.10
            @Override // org.bouncycastle.crypto.util.DigestFactory.Cloner
            public final org.bouncycastle.crypto.Digest getHighSpeedVideoFpsRanges(org.bouncycastle.crypto.Digest digest) {
                return new org.bouncycastle.crypto.digests.SHA3Digest((org.bouncycastle.crypto.digests.SHA3Digest) digest);
            }
        });
        hashMap.put(createSHAKE128().getAlgorithmName(), new org.bouncycastle.crypto.util.DigestFactory.Cloner() { // from class: org.bouncycastle.crypto.util.DigestFactory.11
            @Override // org.bouncycastle.crypto.util.DigestFactory.Cloner
            public final org.bouncycastle.crypto.Digest getHighSpeedVideoFpsRanges(org.bouncycastle.crypto.Digest digest) {
                return new org.bouncycastle.crypto.digests.SHAKEDigest((org.bouncycastle.crypto.digests.SHAKEDigest) digest);
            }
        });
        hashMap.put(createSHAKE256().getAlgorithmName(), new org.bouncycastle.crypto.util.DigestFactory.Cloner() { // from class: org.bouncycastle.crypto.util.DigestFactory.12
            @Override // org.bouncycastle.crypto.util.DigestFactory.Cloner
            public final org.bouncycastle.crypto.Digest getHighSpeedVideoFpsRanges(org.bouncycastle.crypto.Digest digest) {
                return new org.bouncycastle.crypto.digests.SHAKEDigest((org.bouncycastle.crypto.digests.SHAKEDigest) digest);
            }
        });
    }
}
