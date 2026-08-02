package com.google.common.hash;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
final class Murmur3_128HashFunction extends com.google.common.hash.AbstractHashFunction implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    private final int seed;
    static final com.google.common.hash.HashFunction MURMUR3_128 = new com.google.common.hash.Murmur3_128HashFunction(0);
    static final com.google.common.hash.HashFunction GOOD_FAST_HASH_128 = new com.google.common.hash.Murmur3_128HashFunction(com.google.common.hash.Hashing.GOOD_FAST_HASH_SEED);

    @Override // com.google.common.hash.HashFunction
    public final int bits() {
        return 128;
    }

    Murmur3_128HashFunction(int i) {
        this.seed = i;
    }

    @Override // com.google.common.hash.HashFunction
    public final com.google.common.hash.Hasher newHasher() {
        return new com.google.common.hash.Murmur3_128HashFunction.Murmur3_128Hasher(this.seed);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Hashing.murmur3_128(");
        sb.append(this.seed);
        sb.append(")");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof com.google.common.hash.Murmur3_128HashFunction) && this.seed == ((com.google.common.hash.Murmur3_128HashFunction) obj).seed;
    }

    public final int hashCode() {
        return getClass().hashCode() ^ this.seed;
    }

    static final class Murmur3_128Hasher extends com.google.common.hash.AbstractStreamingHasher {
        private static final long C1 = -8663945395140668459L;
        private static final long C2 = 5545529020109919103L;
        private static final int CHUNK_SIZE = 16;
        private long h1;
        private long h2;
        private int length;

        private static long fmix64(long j) {
            long j2 = (j ^ (j >>> 33)) * (-49064778989728563L);
            long j3 = (j2 ^ (j2 >>> 33)) * (-4265267296055464877L);
            return j3 ^ (j3 >>> 33);
        }

        Murmur3_128Hasher(int i) {
            super(16);
            long j = i;
            this.h1 = j;
            this.h2 = j;
            this.length = 0;
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        protected final void process(java.nio.ByteBuffer byteBuffer) {
            bmix64(byteBuffer.getLong(), byteBuffer.getLong());
            this.length += 16;
        }

        private void bmix64(long j, long j2) {
            long mixK1 = mixK1(j) ^ this.h1;
            this.h1 = mixK1;
            long rotateLeft = java.lang.Long.rotateLeft(mixK1, 27);
            long j3 = this.h2;
            this.h1 = ((rotateLeft + j3) * 5) + 1390208809;
            long mixK2 = mixK2(j2) ^ j3;
            this.h2 = mixK2;
            this.h2 = ((java.lang.Long.rotateLeft(mixK2, 31) + this.h1) * 5) + 944331445;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.google.common.hash.AbstractStreamingHasher
        protected final void processRemaining(java.nio.ByteBuffer byteBuffer) {
            long j;
            long j2;
            long j3;
            long j4;
            long j5;
            long j6;
            long unsignedInt;
            this.length += byteBuffer.remaining();
            long j7 = 0;
            switch (byteBuffer.remaining()) {
                case 1:
                    j = 0;
                    unsignedInt = j ^ java.lang.Byte.toUnsignedInt(byteBuffer.get(0));
                    this.h1 = mixK1(unsignedInt) ^ this.h1;
                    this.h2 ^= mixK2(j7);
                    return;
                case 2:
                    j2 = 0;
                    j = j2 ^ (java.lang.Byte.toUnsignedInt(byteBuffer.get(1)) << 8);
                    unsignedInt = j ^ java.lang.Byte.toUnsignedInt(byteBuffer.get(0));
                    this.h1 = mixK1(unsignedInt) ^ this.h1;
                    this.h2 ^= mixK2(j7);
                    return;
                case 3:
                    j3 = 0;
                    j2 = j3 ^ (java.lang.Byte.toUnsignedInt(byteBuffer.get(2)) << 16);
                    j = j2 ^ (java.lang.Byte.toUnsignedInt(byteBuffer.get(1)) << 8);
                    unsignedInt = j ^ java.lang.Byte.toUnsignedInt(byteBuffer.get(0));
                    this.h1 = mixK1(unsignedInt) ^ this.h1;
                    this.h2 ^= mixK2(j7);
                    return;
                case 4:
                    j4 = 0;
                    j3 = j4 ^ (java.lang.Byte.toUnsignedInt(byteBuffer.get(3)) << 24);
                    j2 = j3 ^ (java.lang.Byte.toUnsignedInt(byteBuffer.get(2)) << 16);
                    j = j2 ^ (java.lang.Byte.toUnsignedInt(byteBuffer.get(1)) << 8);
                    unsignedInt = j ^ java.lang.Byte.toUnsignedInt(byteBuffer.get(0));
                    this.h1 = mixK1(unsignedInt) ^ this.h1;
                    this.h2 ^= mixK2(j7);
                    return;
                case 5:
                    j5 = 0;
                    j4 = j5 ^ (java.lang.Byte.toUnsignedInt(byteBuffer.get(4)) << 32);
                    j3 = j4 ^ (java.lang.Byte.toUnsignedInt(byteBuffer.get(3)) << 24);
                    j2 = j3 ^ (java.lang.Byte.toUnsignedInt(byteBuffer.get(2)) << 16);
                    j = j2 ^ (java.lang.Byte.toUnsignedInt(byteBuffer.get(1)) << 8);
                    unsignedInt = j ^ java.lang.Byte.toUnsignedInt(byteBuffer.get(0));
                    this.h1 = mixK1(unsignedInt) ^ this.h1;
                    this.h2 ^= mixK2(j7);
                    return;
                case 6:
                    j6 = 0;
                    j5 = j6 ^ (java.lang.Byte.toUnsignedInt(byteBuffer.get(5)) << 40);
                    j4 = j5 ^ (java.lang.Byte.toUnsignedInt(byteBuffer.get(4)) << 32);
                    j3 = j4 ^ (java.lang.Byte.toUnsignedInt(byteBuffer.get(3)) << 24);
                    j2 = j3 ^ (java.lang.Byte.toUnsignedInt(byteBuffer.get(2)) << 16);
                    j = j2 ^ (java.lang.Byte.toUnsignedInt(byteBuffer.get(1)) << 8);
                    unsignedInt = j ^ java.lang.Byte.toUnsignedInt(byteBuffer.get(0));
                    this.h1 = mixK1(unsignedInt) ^ this.h1;
                    this.h2 ^= mixK2(j7);
                    return;
                case 7:
                    j6 = java.lang.Byte.toUnsignedInt(byteBuffer.get(6)) << 48;
                    j5 = j6 ^ (java.lang.Byte.toUnsignedInt(byteBuffer.get(5)) << 40);
                    j4 = j5 ^ (java.lang.Byte.toUnsignedInt(byteBuffer.get(4)) << 32);
                    j3 = j4 ^ (java.lang.Byte.toUnsignedInt(byteBuffer.get(3)) << 24);
                    j2 = j3 ^ (java.lang.Byte.toUnsignedInt(byteBuffer.get(2)) << 16);
                    j = j2 ^ (java.lang.Byte.toUnsignedInt(byteBuffer.get(1)) << 8);
                    unsignedInt = j ^ java.lang.Byte.toUnsignedInt(byteBuffer.get(0));
                    this.h1 = mixK1(unsignedInt) ^ this.h1;
                    this.h2 ^= mixK2(j7);
                    return;
                case 8:
                    unsignedInt = byteBuffer.getLong();
                    this.h1 = mixK1(unsignedInt) ^ this.h1;
                    this.h2 ^= mixK2(j7);
                    return;
                case 9:
                    j7 ^= java.lang.Byte.toUnsignedInt(byteBuffer.get(8));
                    unsignedInt = byteBuffer.getLong();
                    this.h1 = mixK1(unsignedInt) ^ this.h1;
                    this.h2 ^= mixK2(j7);
                    return;
                case 10:
                    j7 ^= java.lang.Byte.toUnsignedInt(byteBuffer.get(9)) << 8;
                    j7 ^= java.lang.Byte.toUnsignedInt(byteBuffer.get(8));
                    unsignedInt = byteBuffer.getLong();
                    this.h1 = mixK1(unsignedInt) ^ this.h1;
                    this.h2 ^= mixK2(j7);
                    return;
                case 11:
                    j7 ^= java.lang.Byte.toUnsignedInt(byteBuffer.get(10)) << 16;
                    j7 ^= java.lang.Byte.toUnsignedInt(byteBuffer.get(9)) << 8;
                    j7 ^= java.lang.Byte.toUnsignedInt(byteBuffer.get(8));
                    unsignedInt = byteBuffer.getLong();
                    this.h1 = mixK1(unsignedInt) ^ this.h1;
                    this.h2 ^= mixK2(j7);
                    return;
                case 12:
                    j7 ^= java.lang.Byte.toUnsignedInt(byteBuffer.get(11)) << 24;
                    j7 ^= java.lang.Byte.toUnsignedInt(byteBuffer.get(10)) << 16;
                    j7 ^= java.lang.Byte.toUnsignedInt(byteBuffer.get(9)) << 8;
                    j7 ^= java.lang.Byte.toUnsignedInt(byteBuffer.get(8));
                    unsignedInt = byteBuffer.getLong();
                    this.h1 = mixK1(unsignedInt) ^ this.h1;
                    this.h2 ^= mixK2(j7);
                    return;
                case 13:
                    j7 ^= java.lang.Byte.toUnsignedInt(byteBuffer.get(12)) << 32;
                    j7 ^= java.lang.Byte.toUnsignedInt(byteBuffer.get(11)) << 24;
                    j7 ^= java.lang.Byte.toUnsignedInt(byteBuffer.get(10)) << 16;
                    j7 ^= java.lang.Byte.toUnsignedInt(byteBuffer.get(9)) << 8;
                    j7 ^= java.lang.Byte.toUnsignedInt(byteBuffer.get(8));
                    unsignedInt = byteBuffer.getLong();
                    this.h1 = mixK1(unsignedInt) ^ this.h1;
                    this.h2 ^= mixK2(j7);
                    return;
                case 14:
                    j7 ^= java.lang.Byte.toUnsignedInt(byteBuffer.get(13)) << 40;
                    j7 ^= java.lang.Byte.toUnsignedInt(byteBuffer.get(12)) << 32;
                    j7 ^= java.lang.Byte.toUnsignedInt(byteBuffer.get(11)) << 24;
                    j7 ^= java.lang.Byte.toUnsignedInt(byteBuffer.get(10)) << 16;
                    j7 ^= java.lang.Byte.toUnsignedInt(byteBuffer.get(9)) << 8;
                    j7 ^= java.lang.Byte.toUnsignedInt(byteBuffer.get(8));
                    unsignedInt = byteBuffer.getLong();
                    this.h1 = mixK1(unsignedInt) ^ this.h1;
                    this.h2 ^= mixK2(j7);
                    return;
                case 15:
                    j7 = java.lang.Byte.toUnsignedInt(byteBuffer.get(14)) << 48;
                    j7 ^= java.lang.Byte.toUnsignedInt(byteBuffer.get(13)) << 40;
                    j7 ^= java.lang.Byte.toUnsignedInt(byteBuffer.get(12)) << 32;
                    j7 ^= java.lang.Byte.toUnsignedInt(byteBuffer.get(11)) << 24;
                    j7 ^= java.lang.Byte.toUnsignedInt(byteBuffer.get(10)) << 16;
                    j7 ^= java.lang.Byte.toUnsignedInt(byteBuffer.get(9)) << 8;
                    j7 ^= java.lang.Byte.toUnsignedInt(byteBuffer.get(8));
                    unsignedInt = byteBuffer.getLong();
                    this.h1 = mixK1(unsignedInt) ^ this.h1;
                    this.h2 ^= mixK2(j7);
                    return;
                default:
                    throw new java.lang.AssertionError("Should never get here.");
            }
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        protected final com.google.common.hash.HashCode makeHash() {
            long j = this.h1;
            long j2 = this.length;
            long j3 = this.h2 ^ j2;
            long j4 = (j ^ j2) + j3;
            this.h1 = j4;
            this.h2 = j3 + j4;
            this.h1 = fmix64(j4);
            long fmix64 = fmix64(this.h2);
            long j5 = this.h1 + fmix64;
            this.h1 = j5;
            this.h2 = fmix64 + j5;
            return com.google.common.hash.HashCode.fromBytesNoCopy(java.nio.ByteBuffer.wrap(new byte[16]).order(java.nio.ByteOrder.LITTLE_ENDIAN).putLong(this.h1).putLong(this.h2).array());
        }

        private static long mixK1(long j) {
            return java.lang.Long.rotateLeft(j * C1, 31) * C2;
        }

        private static long mixK2(long j) {
            return java.lang.Long.rotateLeft(j * C2, 33) * C1;
        }
    }
}
