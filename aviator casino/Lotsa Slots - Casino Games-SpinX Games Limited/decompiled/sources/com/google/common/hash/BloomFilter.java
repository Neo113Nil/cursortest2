package com.google.common.hash;

@com.google.common.hash.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public final class BloomFilter<T> implements com.google.common.base.Predicate<T>, java.io.Serializable {
    private static final long serialVersionUID = 912559;
    private final com.google.common.hash.BloomFilterStrategies.LockFreeBitArray bits;
    private final com.google.common.hash.Funnel<? super T> funnel;
    private final int numHashFunctions;
    private final com.google.common.hash.BloomFilter.Strategy strategy;

    interface Strategy extends java.io.Serializable {
        <T> boolean mightContain(@com.google.common.hash.ParametricNullness T object, com.google.common.hash.Funnel<? super T> funnel, int numHashFunctions, com.google.common.hash.BloomFilterStrategies.LockFreeBitArray bits);

        int ordinal();

        <T> boolean put(@com.google.common.hash.ParametricNullness T object, com.google.common.hash.Funnel<? super T> funnel, int numHashFunctions, com.google.common.hash.BloomFilterStrategies.LockFreeBitArray bits);
    }

    private BloomFilter(com.google.common.hash.BloomFilterStrategies.LockFreeBitArray bits, int numHashFunctions, com.google.common.hash.Funnel<? super T> funnel, com.google.common.hash.BloomFilter.Strategy strategy) {
        com.google.common.base.Preconditions.checkArgument(numHashFunctions > 0, "numHashFunctions (%s) must be > 0", numHashFunctions);
        com.google.common.base.Preconditions.checkArgument(numHashFunctions <= 255, "numHashFunctions (%s) must be <= 255", numHashFunctions);
        this.bits = (com.google.common.hash.BloomFilterStrategies.LockFreeBitArray) com.google.common.base.Preconditions.checkNotNull(bits);
        this.numHashFunctions = numHashFunctions;
        this.funnel = (com.google.common.hash.Funnel) com.google.common.base.Preconditions.checkNotNull(funnel);
        this.strategy = (com.google.common.hash.BloomFilter.Strategy) com.google.common.base.Preconditions.checkNotNull(strategy);
    }

    public com.google.common.hash.BloomFilter<T> copy() {
        return new com.google.common.hash.BloomFilter<>(this.bits.copy(), this.numHashFunctions, this.funnel, this.strategy);
    }

    public boolean mightContain(@com.google.common.hash.ParametricNullness T object) {
        return this.strategy.mightContain(object, this.funnel, this.numHashFunctions, this.bits);
    }

    @Override // com.google.common.base.Predicate
    @java.lang.Deprecated
    public boolean apply(@com.google.common.hash.ParametricNullness T input) {
        return mightContain(input);
    }

    public boolean put(@com.google.common.hash.ParametricNullness T object) {
        return this.strategy.put(object, this.funnel, this.numHashFunctions, this.bits);
    }

    public double expectedFpp() {
        return java.lang.Math.pow(this.bits.bitCount() / bitSize(), this.numHashFunctions);
    }

    public long approximateElementCount() {
        double bitSize = this.bits.bitSize();
        return com.google.common.math.DoubleMath.roundToLong(((-java.lang.Math.log1p(-(this.bits.bitCount() / bitSize))) * bitSize) / this.numHashFunctions, java.math.RoundingMode.HALF_UP);
    }

    long bitSize() {
        return this.bits.bitSize();
    }

    public boolean isCompatible(com.google.common.hash.BloomFilter<T> that) {
        com.google.common.base.Preconditions.checkNotNull(that);
        return this != that && this.numHashFunctions == that.numHashFunctions && bitSize() == that.bitSize() && this.strategy.equals(that.strategy) && this.funnel.equals(that.funnel);
    }

    public void putAll(com.google.common.hash.BloomFilter<T> that) {
        com.google.common.base.Preconditions.checkNotNull(that);
        com.google.common.base.Preconditions.checkArgument(this != that, "Cannot combine a BloomFilter with itself.");
        int i = this.numHashFunctions;
        int i2 = that.numHashFunctions;
        com.google.common.base.Preconditions.checkArgument(i == i2, "BloomFilters must have the same number of hash functions (%s != %s)", i, i2);
        com.google.common.base.Preconditions.checkArgument(bitSize() == that.bitSize(), "BloomFilters must have the same size underlying bit arrays (%s != %s)", bitSize(), that.bitSize());
        com.google.common.base.Preconditions.checkArgument(this.strategy.equals(that.strategy), "BloomFilters must have equal strategies (%s != %s)", this.strategy, that.strategy);
        com.google.common.base.Preconditions.checkArgument(this.funnel.equals(that.funnel), "BloomFilters must have equal funnels (%s != %s)", this.funnel, that.funnel);
        this.bits.putAll(that.bits);
    }

    @Override // com.google.common.base.Predicate
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof com.google.common.hash.BloomFilter)) {
            return false;
        }
        com.google.common.hash.BloomFilter bloomFilter = (com.google.common.hash.BloomFilter) object;
        return this.numHashFunctions == bloomFilter.numHashFunctions && this.funnel.equals(bloomFilter.funnel) && this.bits.equals(bloomFilter.bits) && this.strategy.equals(bloomFilter.strategy);
    }

    public int hashCode() {
        return com.google.common.base.Objects.hashCode(java.lang.Integer.valueOf(this.numHashFunctions), this.funnel, this.strategy, this.bits);
    }

    public static <T> com.google.common.hash.BloomFilter<T> create(com.google.common.hash.Funnel<? super T> funnel, int expectedInsertions, double fpp) {
        return create(funnel, expectedInsertions, fpp);
    }

    public static <T> com.google.common.hash.BloomFilter<T> create(com.google.common.hash.Funnel<? super T> funnel, long expectedInsertions, double fpp) {
        return create(funnel, expectedInsertions, fpp, com.google.common.hash.BloomFilterStrategies.MURMUR128_MITZ_64);
    }

    static <T> com.google.common.hash.BloomFilter<T> create(com.google.common.hash.Funnel<? super T> funnel, long expectedInsertions, double fpp, com.google.common.hash.BloomFilter.Strategy strategy) {
        com.google.common.base.Preconditions.checkNotNull(funnel);
        com.google.common.base.Preconditions.checkArgument(expectedInsertions >= 0, "Expected insertions (%s) must be >= 0", expectedInsertions);
        com.google.common.base.Preconditions.checkArgument(fpp > 0.0d, "False positive probability (%s) must be > 0.0", java.lang.Double.valueOf(fpp));
        com.google.common.base.Preconditions.checkArgument(fpp < 1.0d, "False positive probability (%s) must be < 1.0", java.lang.Double.valueOf(fpp));
        com.google.common.base.Preconditions.checkNotNull(strategy);
        if (expectedInsertions == 0) {
            expectedInsertions = 1;
        }
        long optimalNumOfBits = optimalNumOfBits(expectedInsertions, fpp);
        try {
            return new com.google.common.hash.BloomFilter<>(new com.google.common.hash.BloomFilterStrategies.LockFreeBitArray(optimalNumOfBits), optimalNumOfHashFunctions(expectedInsertions, optimalNumOfBits), funnel, strategy);
        } catch (java.lang.IllegalArgumentException e) {
            throw new java.lang.IllegalArgumentException("Could not create BloomFilter of " + optimalNumOfBits + " bits", e);
        }
    }

    public static <T> com.google.common.hash.BloomFilter<T> create(com.google.common.hash.Funnel<? super T> funnel, int expectedInsertions) {
        return create(funnel, expectedInsertions);
    }

    public static <T> com.google.common.hash.BloomFilter<T> create(com.google.common.hash.Funnel<? super T> funnel, long expectedInsertions) {
        return create(funnel, expectedInsertions, 0.03d);
    }

    static int optimalNumOfHashFunctions(long n, long m) {
        return java.lang.Math.max(1, (int) java.lang.Math.round((m / n) * java.lang.Math.log(2.0d)));
    }

    static long optimalNumOfBits(long n, double p) {
        if (p == 0.0d) {
            p = Double.MIN_VALUE;
        }
        return (long) (((-n) * java.lang.Math.log(p)) / (java.lang.Math.log(2.0d) * java.lang.Math.log(2.0d)));
    }

    private java.lang.Object writeReplace() {
        return new com.google.common.hash.BloomFilter.SerialForm(this);
    }

    private void readObject(java.io.ObjectInputStream stream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use SerializedForm");
    }

    private static class SerialForm<T> implements java.io.Serializable {
        private static final long serialVersionUID = 1;
        final long[] data;
        final com.google.common.hash.Funnel<? super T> funnel;
        final int numHashFunctions;
        final com.google.common.hash.BloomFilter.Strategy strategy;

        SerialForm(com.google.common.hash.BloomFilter<T> bf) {
            this.data = com.google.common.hash.BloomFilterStrategies.LockFreeBitArray.toPlainArray(((com.google.common.hash.BloomFilter) bf).bits.data);
            this.numHashFunctions = ((com.google.common.hash.BloomFilter) bf).numHashFunctions;
            this.funnel = ((com.google.common.hash.BloomFilter) bf).funnel;
            this.strategy = ((com.google.common.hash.BloomFilter) bf).strategy;
        }

        java.lang.Object readResolve() {
            return new com.google.common.hash.BloomFilter(new com.google.common.hash.BloomFilterStrategies.LockFreeBitArray(this.data), this.numHashFunctions, this.funnel, this.strategy);
        }
    }

    public void writeTo(java.io.OutputStream out) throws java.io.IOException {
        java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(out);
        dataOutputStream.writeByte(com.google.common.primitives.SignedBytes.checkedCast(this.strategy.ordinal()));
        dataOutputStream.writeByte(com.google.common.primitives.UnsignedBytes.checkedCast(this.numHashFunctions));
        dataOutputStream.writeInt(this.bits.data.length());
        for (int i = 0; i < this.bits.data.length(); i++) {
            dataOutputStream.writeLong(this.bits.data.get(i));
        }
    }

    public static <T> com.google.common.hash.BloomFilter<T> readFrom(java.io.InputStream in, com.google.common.hash.Funnel<? super T> funnel) throws java.io.IOException {
        int i;
        int i2;
        int readInt;
        com.google.common.base.Preconditions.checkNotNull(in, "InputStream");
        com.google.common.base.Preconditions.checkNotNull(funnel, "Funnel");
        byte b = -1;
        try {
            try {
                java.io.DataInputStream dataInputStream = new java.io.DataInputStream(in);
                byte readByte = dataInputStream.readByte();
                try {
                    i2 = com.google.common.primitives.UnsignedBytes.toInt(dataInputStream.readByte());
                } catch (java.lang.Exception e) {
                    e = e;
                    i2 = -1;
                }
                try {
                    readInt = dataInputStream.readInt();
                } catch (java.lang.Exception e2) {
                    e = e2;
                    b = readByte;
                    i = -1;
                    throw new java.io.IOException("Unable to deserialize BloomFilter from InputStream. strategyOrdinal: " + ((int) b) + " numHashFunctions: " + i2 + " dataLength: " + i, e);
                }
                try {
                    com.google.common.hash.BloomFilterStrategies bloomFilterStrategies = com.google.common.hash.BloomFilterStrategies.values()[readByte];
                    com.google.common.hash.BloomFilterStrategies.LockFreeBitArray lockFreeBitArray = new com.google.common.hash.BloomFilterStrategies.LockFreeBitArray(com.google.common.math.LongMath.checkedMultiply(readInt, 64L));
                    for (int i3 = 0; i3 < readInt; i3++) {
                        lockFreeBitArray.putData(i3, dataInputStream.readLong());
                    }
                    return new com.google.common.hash.BloomFilter<>(lockFreeBitArray, i2, funnel, bloomFilterStrategies);
                } catch (java.lang.Exception e3) {
                    e = e3;
                    b = readByte;
                    i = readInt;
                    throw new java.io.IOException("Unable to deserialize BloomFilter from InputStream. strategyOrdinal: " + ((int) b) + " numHashFunctions: " + i2 + " dataLength: " + i, e);
                }
            } catch (java.io.IOException e4) {
                throw e4;
            }
        } catch (java.lang.Exception e5) {
            e = e5;
            i = -1;
            i2 = -1;
        }
    }
}
