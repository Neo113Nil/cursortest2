package com.google.common.hash;

@com.google.errorprone.annotations.Immutable
@com.google.common.hash.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
final class Murmur3_32HashFunction extends com.google.common.hash.AbstractHashFunction implements java.io.Serializable {
    private static final int C1 = -862048943;
    private static final int C2 = 461845907;
    private static final int CHUNK_SIZE = 4;
    private static final long serialVersionUID = 0;
    private final int seed;
    private final boolean supplementaryPlaneFix;
    static final com.google.common.hash.HashFunction MURMUR3_32 = new com.google.common.hash.Murmur3_32HashFunction(0, false);
    static final com.google.common.hash.HashFunction MURMUR3_32_FIXED = new com.google.common.hash.Murmur3_32HashFunction(0, true);
    static final com.google.common.hash.HashFunction GOOD_FAST_HASH_32 = new com.google.common.hash.Murmur3_32HashFunction(com.google.common.hash.Hashing.GOOD_FAST_HASH_SEED, true);

    /* JADX INFO: Access modifiers changed from: private */
    public static long charToThreeUtf8Bytes(char c) {
        return (c >>> '\f') | 224 | ((((c >>> 6) & 63) | 128) << 8) | (((c & '?') | 128) << 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long charToTwoUtf8Bytes(char c) {
        return (c >>> 6) | 192 | (((c & '?') | 128) << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long codePointToFourUtf8Bytes(int codePoint) {
        return (codePoint >>> 18) | 240 | ((((codePoint >>> 12) & 63) | 128) << 8) | ((((codePoint >>> 6) & 63) | 128) << 16) | (((codePoint & 63) | 128) << 24);
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return 32;
    }

    Murmur3_32HashFunction(int seed, boolean supplementaryPlaneFix) {
        this.seed = seed;
        this.supplementaryPlaneFix = supplementaryPlaneFix;
    }

    @Override // com.google.common.hash.HashFunction
    public com.google.common.hash.Hasher newHasher() {
        return new com.google.common.hash.Murmur3_32HashFunction.Murmur3_32Hasher(this.seed);
    }

    public java.lang.String toString() {
        return "Hashing.murmur3_32(" + this.seed + ")";
    }

    public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
        if (!(object instanceof com.google.common.hash.Murmur3_32HashFunction)) {
            return false;
        }
        com.google.common.hash.Murmur3_32HashFunction murmur3_32HashFunction = (com.google.common.hash.Murmur3_32HashFunction) object;
        return this.seed == murmur3_32HashFunction.seed && this.supplementaryPlaneFix == murmur3_32HashFunction.supplementaryPlaneFix;
    }

    public int hashCode() {
        return getClass().hashCode() ^ this.seed;
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public com.google.common.hash.HashCode hashInt(int input) {
        return fmix(mixH1(this.seed, mixK1(input)), 4);
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public com.google.common.hash.HashCode hashLong(long input) {
        int i = (int) (input >>> 32);
        return fmix(mixH1(mixH1(this.seed, mixK1((int) input)), mixK1(i)), 8);
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public com.google.common.hash.HashCode hashUnencodedChars(java.lang.CharSequence input) {
        int i = this.seed;
        for (int i2 = 1; i2 < input.length(); i2 += 2) {
            i = mixH1(i, mixK1(input.charAt(i2 - 1) | (input.charAt(i2) << 16)));
        }
        if ((input.length() & 1) == 1) {
            i ^= mixK1(input.charAt(input.length() - 1));
        }
        return fmix(i, input.length() * 2);
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public com.google.common.hash.HashCode hashString(java.lang.CharSequence input, java.nio.charset.Charset charset) {
        if (com.google.common.base.Charsets.UTF_8.equals(charset)) {
            int length = input.length();
            int i = this.seed;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                int i5 = i3 + 4;
                if (i5 > length) {
                    break;
                }
                char charAt = input.charAt(i3);
                char charAt2 = input.charAt(i3 + 1);
                char charAt3 = input.charAt(i3 + 2);
                char charAt4 = input.charAt(i3 + 3);
                if (charAt >= 128 || charAt2 >= 128 || charAt3 >= 128 || charAt4 >= 128) {
                    break;
                }
                i = mixH1(i, mixK1((charAt2 << '\b') | charAt | (charAt3 << 16) | (charAt4 << 24)));
                i4 += 4;
                i3 = i5;
            }
            long j = 0;
            while (i3 < length) {
                char charAt5 = input.charAt(i3);
                if (charAt5 < 128) {
                    j |= charAt5 << i2;
                    i2 += 8;
                    i4++;
                } else if (charAt5 < 2048) {
                    j |= charToTwoUtf8Bytes(charAt5) << i2;
                    i2 += 16;
                    i4 += 2;
                } else if (charAt5 < 55296 || charAt5 > 57343) {
                    j |= charToThreeUtf8Bytes(charAt5) << i2;
                    i2 += 24;
                    i4 += 3;
                } else {
                    int codePointAt = java.lang.Character.codePointAt(input, i3);
                    if (codePointAt == charAt5) {
                        return hashBytes(input.toString().getBytes(charset));
                    }
                    i3++;
                    j |= codePointToFourUtf8Bytes(codePointAt) << i2;
                    if (this.supplementaryPlaneFix) {
                        i2 += 32;
                    }
                    i4 += 4;
                }
                if (i2 >= 32) {
                    i = mixH1(i, mixK1((int) j));
                    j >>>= 32;
                    i2 -= 32;
                }
                i3++;
            }
            return fmix(mixK1((int) j) ^ i, i4);
        }
        return hashBytes(input.toString().getBytes(charset));
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public com.google.common.hash.HashCode hashBytes(byte[] input, int off, int len) {
        com.google.common.base.Preconditions.checkPositionIndexes(off, off + len, input.length);
        int i = this.seed;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = i3 + 4;
            if (i4 > len) {
                break;
            }
            i = mixH1(i, mixK1(getIntLittleEndian(input, i3 + off)));
            i3 = i4;
        }
        int i5 = i3;
        int i6 = 0;
        while (i5 < len) {
            i2 ^= com.google.common.primitives.UnsignedBytes.toInt(input[off + i5]) << i6;
            i5++;
            i6 += 8;
        }
        return fmix(mixK1(i2) ^ i, len);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getIntLittleEndian(byte[] input, int offset) {
        return com.google.common.primitives.Ints.fromBytes(input[offset + 3], input[offset + 2], input[offset + 1], input[offset]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int mixK1(int k1) {
        return java.lang.Integer.rotateLeft(k1 * (-862048943), 15) * C2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int mixH1(int h1, int k1) {
        return (java.lang.Integer.rotateLeft(h1 ^ k1, 13) * 5) - 430675100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.common.hash.HashCode fmix(int h1, int length) {
        int i = h1 ^ length;
        int i2 = (i ^ (i >>> 16)) * (-2048144789);
        int i3 = (i2 ^ (i2 >>> 13)) * (-1028477387);
        return com.google.common.hash.HashCode.fromInt(i3 ^ (i3 >>> 16));
    }

    private static final class Murmur3_32Hasher extends com.google.common.hash.AbstractHasher {
        private long buffer;
        private int h1;
        private int shift;
        private int length = 0;
        private boolean isDone = false;

        Murmur3_32Hasher(int seed) {
            this.h1 = seed;
        }

        private void update(int nBytes, long update) {
            long j = this.buffer;
            int i = this.shift;
            long j2 = ((update & 4294967295L) << i) | j;
            this.buffer = j2;
            int i2 = i + (nBytes * 8);
            this.shift = i2;
            this.length += nBytes;
            if (i2 >= 32) {
                this.h1 = com.google.common.hash.Murmur3_32HashFunction.mixH1(this.h1, com.google.common.hash.Murmur3_32HashFunction.mixK1((int) j2));
                this.buffer >>>= 32;
                this.shift -= 32;
            }
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public com.google.common.hash.Hasher putByte(byte b) {
            update(1, b & 255);
            return this;
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.PrimitiveSink
        public com.google.common.hash.Hasher putBytes(byte[] bytes, int off, int len) {
            com.google.common.base.Preconditions.checkPositionIndexes(off, off + len, bytes.length);
            int i = 0;
            while (true) {
                int i2 = i + 4;
                if (i2 > len) {
                    break;
                }
                update(4, com.google.common.hash.Murmur3_32HashFunction.getIntLittleEndian(bytes, i + off));
                i = i2;
            }
            while (i < len) {
                putByte(bytes[off + i]);
                i++;
            }
            return this;
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.PrimitiveSink
        public com.google.common.hash.Hasher putBytes(java.nio.ByteBuffer buffer) {
            java.nio.ByteOrder order = buffer.order();
            buffer.order(java.nio.ByteOrder.LITTLE_ENDIAN);
            while (buffer.remaining() >= 4) {
                putInt(buffer.getInt());
            }
            while (buffer.hasRemaining()) {
                putByte(buffer.get());
            }
            buffer.order(order);
            return this;
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.PrimitiveSink
        public com.google.common.hash.Hasher putInt(int i) {
            update(4, i);
            return this;
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.PrimitiveSink
        public com.google.common.hash.Hasher putLong(long l) {
            update(4, (int) l);
            update(4, l >>> 32);
            return this;
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.PrimitiveSink
        public com.google.common.hash.Hasher putChar(char c) {
            update(2, c);
            return this;
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.PrimitiveSink
        public com.google.common.hash.Hasher putString(java.lang.CharSequence input, java.nio.charset.Charset charset) {
            if (com.google.common.base.Charsets.UTF_8.equals(charset)) {
                int length = input.length();
                int i = 0;
                while (true) {
                    int i2 = i + 4;
                    if (i2 > length) {
                        break;
                    }
                    char charAt = input.charAt(i);
                    char charAt2 = input.charAt(i + 1);
                    char charAt3 = input.charAt(i + 2);
                    char charAt4 = input.charAt(i + 3);
                    if (charAt >= 128 || charAt2 >= 128 || charAt3 >= 128 || charAt4 >= 128) {
                        break;
                    }
                    update(4, (charAt2 << '\b') | charAt | (charAt3 << 16) | (charAt4 << 24));
                    i = i2;
                }
                while (i < length) {
                    char charAt5 = input.charAt(i);
                    if (charAt5 < 128) {
                        update(1, charAt5);
                    } else if (charAt5 < 2048) {
                        update(2, com.google.common.hash.Murmur3_32HashFunction.charToTwoUtf8Bytes(charAt5));
                    } else if (charAt5 < 55296 || charAt5 > 57343) {
                        update(3, com.google.common.hash.Murmur3_32HashFunction.charToThreeUtf8Bytes(charAt5));
                    } else {
                        int codePointAt = java.lang.Character.codePointAt(input, i);
                        if (codePointAt != charAt5) {
                            i++;
                            update(4, com.google.common.hash.Murmur3_32HashFunction.codePointToFourUtf8Bytes(codePointAt));
                        } else {
                            putBytes(input.subSequence(i, length).toString().getBytes(charset));
                            return this;
                        }
                    }
                    i++;
                }
                return this;
            }
            return super.putString(input, charset);
        }

        @Override // com.google.common.hash.Hasher
        public com.google.common.hash.HashCode hash() {
            com.google.common.base.Preconditions.checkState(!this.isDone);
            this.isDone = true;
            int mixK1 = this.h1 ^ com.google.common.hash.Murmur3_32HashFunction.mixK1((int) this.buffer);
            this.h1 = mixK1;
            return com.google.common.hash.Murmur3_32HashFunction.fmix(mixK1, this.length);
        }
    }
}
