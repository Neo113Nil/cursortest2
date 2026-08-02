package com.google.common.hash;

/* loaded from: classes9.dex */
public final class Hashing {
    static final int GOOD_FAST_HASH_SEED = (int) java.lang.System.currentTimeMillis();

    public static com.google.common.hash.HashFunction goodFastHash(int i) {
        int checkPositiveAndMakeMultipleOf32 = checkPositiveAndMakeMultipleOf32(i);
        if (checkPositiveAndMakeMultipleOf32 == 32) {
            return com.google.common.hash.Murmur3_32HashFunction.GOOD_FAST_HASH_32;
        }
        if (checkPositiveAndMakeMultipleOf32 <= 128) {
            return com.google.common.hash.Murmur3_128HashFunction.GOOD_FAST_HASH_128;
        }
        int i2 = (checkPositiveAndMakeMultipleOf32 + 127) / 128;
        com.google.common.hash.HashFunction[] hashFunctionArr = new com.google.common.hash.HashFunction[i2];
        hashFunctionArr[0] = com.google.common.hash.Murmur3_128HashFunction.GOOD_FAST_HASH_128;
        int i3 = GOOD_FAST_HASH_SEED;
        for (int i4 = 1; i4 < i2; i4++) {
            i3 += 1500450271;
            hashFunctionArr[i4] = murmur3_128(i3);
        }
        return new com.google.common.hash.Hashing.ConcatenatedHashFunction(hashFunctionArr);
    }

    @java.lang.Deprecated
    public static com.google.common.hash.HashFunction murmur3_32(int i) {
        return new com.google.common.hash.Murmur3_32HashFunction(i, false);
    }

    @java.lang.Deprecated
    public static com.google.common.hash.HashFunction murmur3_32() {
        return com.google.common.hash.Murmur3_32HashFunction.MURMUR3_32;
    }

    public static com.google.common.hash.HashFunction murmur3_32_fixed(int i) {
        return new com.google.common.hash.Murmur3_32HashFunction(i, true);
    }

    public static com.google.common.hash.HashFunction murmur3_32_fixed() {
        return com.google.common.hash.Murmur3_32HashFunction.MURMUR3_32_FIXED;
    }

    public static com.google.common.hash.HashFunction murmur3_128(int i) {
        return new com.google.common.hash.Murmur3_128HashFunction(i);
    }

    public static com.google.common.hash.HashFunction murmur3_128() {
        return com.google.common.hash.Murmur3_128HashFunction.MURMUR3_128;
    }

    public static com.google.common.hash.HashFunction sipHash24() {
        return com.google.common.hash.SipHashFunction.SIP_HASH_24;
    }

    public static com.google.common.hash.HashFunction sipHash24(long j, long j2) {
        return new com.google.common.hash.SipHashFunction(2, 4, j, j2);
    }

    @java.lang.Deprecated
    public static com.google.common.hash.HashFunction md5() {
        return com.google.common.hash.Hashing.Md5Holder.MD5;
    }

    static final class Md5Holder {
        static final com.google.common.hash.HashFunction MD5 = new com.google.common.hash.MessageDigestHashFunction("MD5", "Hashing.md5()");

        private Md5Holder() {
        }
    }

    @java.lang.Deprecated
    public static com.google.common.hash.HashFunction sha1() {
        return com.google.common.hash.Hashing.Sha1Holder.SHA_1;
    }

    static final class Sha1Holder {
        static final com.google.common.hash.HashFunction SHA_1 = new com.google.common.hash.MessageDigestHashFunction("SHA-1", "Hashing.sha1()");

        private Sha1Holder() {
        }
    }

    public static com.google.common.hash.HashFunction sha256() {
        return com.google.common.hash.Hashing.Sha256Holder.SHA_256;
    }

    static final class Sha256Holder {
        static final com.google.common.hash.HashFunction SHA_256 = new com.google.common.hash.MessageDigestHashFunction("SHA-256", "Hashing.sha256()");

        private Sha256Holder() {
        }
    }

    public static com.google.common.hash.HashFunction sha384() {
        return com.google.common.hash.Hashing.Sha384Holder.SHA_384;
    }

    static final class Sha384Holder {
        static final com.google.common.hash.HashFunction SHA_384 = new com.google.common.hash.MessageDigestHashFunction("SHA-384", "Hashing.sha384()");

        private Sha384Holder() {
        }
    }

    public static com.google.common.hash.HashFunction sha512() {
        return com.google.common.hash.Hashing.Sha512Holder.SHA_512;
    }

    static final class Sha512Holder {
        static final com.google.common.hash.HashFunction SHA_512 = new com.google.common.hash.MessageDigestHashFunction("SHA-512", "Hashing.sha512()");

        private Sha512Holder() {
        }
    }

    public static com.google.common.hash.HashFunction hmacMd5(java.security.Key key) {
        return new com.google.common.hash.MacHashFunction("HmacMD5", key, hmacToString("hmacMd5", key));
    }

    public static com.google.common.hash.HashFunction hmacMd5(byte[] bArr) {
        return hmacMd5(new javax.crypto.spec.SecretKeySpec((byte[]) com.google.common.base.Preconditions.checkNotNull(bArr), "HmacMD5"));
    }

    public static com.google.common.hash.HashFunction hmacSha1(java.security.Key key) {
        return new com.google.common.hash.MacHashFunction("HmacSHA1", key, hmacToString("hmacSha1", key));
    }

    public static com.google.common.hash.HashFunction hmacSha1(byte[] bArr) {
        return hmacSha1(new javax.crypto.spec.SecretKeySpec((byte[]) com.google.common.base.Preconditions.checkNotNull(bArr), "HmacSHA1"));
    }

    public static com.google.common.hash.HashFunction hmacSha256(java.security.Key key) {
        return new com.google.common.hash.MacHashFunction(org.jose4j.mac.MacUtil.HMAC_SHA256, key, hmacToString("hmacSha256", key));
    }

    public static com.google.common.hash.HashFunction hmacSha256(byte[] bArr) {
        return hmacSha256(new javax.crypto.spec.SecretKeySpec((byte[]) com.google.common.base.Preconditions.checkNotNull(bArr), org.jose4j.mac.MacUtil.HMAC_SHA256));
    }

    public static com.google.common.hash.HashFunction hmacSha512(java.security.Key key) {
        return new com.google.common.hash.MacHashFunction(org.jose4j.mac.MacUtil.HMAC_SHA512, key, hmacToString("hmacSha512", key));
    }

    public static com.google.common.hash.HashFunction hmacSha512(byte[] bArr) {
        return hmacSha512(new javax.crypto.spec.SecretKeySpec((byte[]) com.google.common.base.Preconditions.checkNotNull(bArr), org.jose4j.mac.MacUtil.HMAC_SHA512));
    }

    private static java.lang.String hmacToString(java.lang.String str, java.security.Key key) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Hashing.");
        sb.append(str);
        sb.append("(Key[algorithm=");
        sb.append(key.getAlgorithm());
        sb.append(", format=");
        sb.append(key.getFormat());
        sb.append("])");
        return sb.toString();
    }

    public static com.google.common.hash.HashFunction crc32c() {
        return com.google.common.hash.Crc32cHashFunction.CRC_32_C;
    }

    public static com.google.common.hash.HashFunction crc32() {
        return com.google.common.hash.Hashing.ChecksumType.CRC_32.hashFunction;
    }

    public static com.google.common.hash.HashFunction adler32() {
        return com.google.common.hash.Hashing.ChecksumType.ADLER_32.hashFunction;
    }

    @com.google.errorprone.annotations.Immutable
    enum ChecksumType implements com.google.common.hash.ImmutableSupplier<java.util.zip.Checksum> {
        CRC_32("Hashing.crc32()") { // from class: com.google.common.hash.Hashing.ChecksumType.1
            @Override // com.google.common.base.Supplier
            public final java.util.zip.Checksum get() {
                return new java.util.zip.CRC32();
            }
        },
        ADLER_32("Hashing.adler32()") { // from class: com.google.common.hash.Hashing.ChecksumType.2
            @Override // com.google.common.base.Supplier
            public final java.util.zip.Checksum get() {
                return new java.util.zip.Adler32();
            }
        };

        public final com.google.common.hash.HashFunction hashFunction;

        ChecksumType(java.lang.String str) {
            this.hashFunction = new com.google.common.hash.ChecksumHashFunction(this, 32, str);
        }
    }

    public static com.google.common.hash.HashFunction farmHashFingerprint64() {
        return com.google.common.hash.FarmHashFingerprint64.FARMHASH_FINGERPRINT_64;
    }

    public static com.google.common.hash.HashFunction fingerprint2011() {
        return com.google.common.hash.Fingerprint2011.FINGERPRINT_2011;
    }

    public static int consistentHash(com.google.common.hash.HashCode hashCode, int i) {
        return consistentHash(hashCode.padToLong(), i);
    }

    public static int consistentHash(long j, int i) {
        int i2 = 0;
        com.google.common.base.Preconditions.checkArgument(i > 0, "buckets must be positive: %s", i);
        com.google.common.hash.Hashing.LinearCongruentialGenerator linearCongruentialGenerator = new com.google.common.hash.Hashing.LinearCongruentialGenerator(j);
        while (true) {
            int nextDouble = (int) ((i2 + 1) / linearCongruentialGenerator.nextDouble());
            if (nextDouble < 0 || nextDouble >= i) {
                break;
            }
            i2 = nextDouble;
        }
        return i2;
    }

    public static com.google.common.hash.HashCode combineOrdered(java.lang.Iterable<com.google.common.hash.HashCode> iterable) {
        java.util.Iterator<com.google.common.hash.HashCode> it = iterable.iterator();
        com.google.common.base.Preconditions.checkArgument(it.hasNext(), "Must be at least 1 hash code to combine.");
        int bits = it.next().bits() / 8;
        byte[] bArr = new byte[bits];
        java.util.Iterator<com.google.common.hash.HashCode> it2 = iterable.iterator();
        while (it2.hasNext()) {
            byte[] asBytes = it2.next().asBytes();
            com.google.common.base.Preconditions.checkArgument(asBytes.length == bits, "All hashcodes must have the same bit length.");
            for (int i = 0; i < asBytes.length; i++) {
                bArr[i] = (byte) ((bArr[i] * 37) ^ asBytes[i]);
            }
        }
        return com.google.common.hash.HashCode.fromBytesNoCopy(bArr);
    }

    public static com.google.common.hash.HashCode combineUnordered(java.lang.Iterable<com.google.common.hash.HashCode> iterable) {
        java.util.Iterator<com.google.common.hash.HashCode> it = iterable.iterator();
        com.google.common.base.Preconditions.checkArgument(it.hasNext(), "Must be at least 1 hash code to combine.");
        int bits = it.next().bits() / 8;
        byte[] bArr = new byte[bits];
        java.util.Iterator<com.google.common.hash.HashCode> it2 = iterable.iterator();
        while (it2.hasNext()) {
            byte[] asBytes = it2.next().asBytes();
            com.google.common.base.Preconditions.checkArgument(asBytes.length == bits, "All hashcodes must have the same bit length.");
            for (int i = 0; i < asBytes.length; i++) {
                bArr[i] = (byte) (bArr[i] + asBytes[i]);
            }
        }
        return com.google.common.hash.HashCode.fromBytesNoCopy(bArr);
    }

    static int checkPositiveAndMakeMultipleOf32(int i) {
        com.google.common.base.Preconditions.checkArgument(i > 0, "Number of bits must be positive");
        return (i + 31) & (-32);
    }

    public static com.google.common.hash.HashFunction concatenating(com.google.common.hash.HashFunction hashFunction, com.google.common.hash.HashFunction hashFunction2, com.google.common.hash.HashFunction... hashFunctionArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(hashFunction);
        arrayList.add(hashFunction2);
        java.util.Collections.addAll(arrayList, hashFunctionArr);
        return new com.google.common.hash.Hashing.ConcatenatedHashFunction((com.google.common.hash.HashFunction[]) arrayList.toArray(new com.google.common.hash.HashFunction[0]));
    }

    public static com.google.common.hash.HashFunction concatenating(java.lang.Iterable<com.google.common.hash.HashFunction> iterable) {
        com.google.common.base.Preconditions.checkNotNull(iterable);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<com.google.common.hash.HashFunction> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        com.google.common.base.Preconditions.checkArgument(!arrayList.isEmpty(), "number of hash functions (%s) must be > 0", arrayList.size());
        return new com.google.common.hash.Hashing.ConcatenatedHashFunction((com.google.common.hash.HashFunction[]) arrayList.toArray(new com.google.common.hash.HashFunction[0]));
    }

    static final class ConcatenatedHashFunction extends com.google.common.hash.AbstractCompositeHashFunction {
        private ConcatenatedHashFunction(com.google.common.hash.HashFunction... hashFunctionArr) {
            super(hashFunctionArr);
            for (com.google.common.hash.HashFunction hashFunction : hashFunctionArr) {
                com.google.common.base.Preconditions.checkArgument(hashFunction.bits() % 8 == 0, "the number of bits (%s) in hashFunction (%s) must be divisible by 8", hashFunction.bits(), (java.lang.Object) hashFunction);
            }
        }

        @Override // com.google.common.hash.AbstractCompositeHashFunction
        final com.google.common.hash.HashCode makeHash(com.google.common.hash.Hasher[] hasherArr) {
            byte[] bArr = new byte[bits() / 8];
            int i = 0;
            for (com.google.common.hash.Hasher hasher : hasherArr) {
                com.google.common.hash.HashCode hash = hasher.hash();
                i += hash.writeBytesTo(bArr, i, hash.bits() / 8);
            }
            return com.google.common.hash.HashCode.fromBytesNoCopy(bArr);
        }

        @Override // com.google.common.hash.HashFunction
        public final int bits() {
            int i = 0;
            for (com.google.common.hash.HashFunction hashFunction : this.functions) {
                i += hashFunction.bits();
            }
            return i;
        }

        public final boolean equals(java.lang.Object obj) {
            if (obj instanceof com.google.common.hash.Hashing.ConcatenatedHashFunction) {
                return java.util.Arrays.equals(this.functions, ((com.google.common.hash.Hashing.ConcatenatedHashFunction) obj).functions);
            }
            return false;
        }

        public final int hashCode() {
            return java.util.Arrays.hashCode(this.functions);
        }
    }

    static final class LinearCongruentialGenerator {
        private long state;

        LinearCongruentialGenerator(long j) {
            this.state = j;
        }

        final double nextDouble() {
            this.state = (this.state * 2862933555777941757L) + 1;
            return (((int) (r0 >>> 33)) + 1) / 2.147483648E9d;
        }
    }

    private Hashing() {
    }
}
