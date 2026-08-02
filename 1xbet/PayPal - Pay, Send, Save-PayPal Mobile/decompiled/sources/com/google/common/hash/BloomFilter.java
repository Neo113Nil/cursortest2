package com.google.common.hash;

/* loaded from: classes9.dex */
public final class BloomFilter<T> implements com.google.common.base.Predicate<T>, java.io.Serializable {
    private static final double LOG_TWO;
    private static final double SQUARED_LOG_TWO;
    private static final long serialVersionUID = 912559;
    private final com.google.common.hash.BloomFilterStrategies.LockFreeBitArray bits;
    private final com.google.common.hash.Funnel<? super T> funnel;
    private final int numHashFunctions;
    private final com.google.common.hash.BloomFilter.Strategy strategy;

    interface Strategy extends java.io.Serializable {
        <T> boolean mightContain(T t, com.google.common.hash.Funnel<? super T> funnel, int i, com.google.common.hash.BloomFilterStrategies.LockFreeBitArray lockFreeBitArray);

        int ordinal();

        <T> boolean put(T t, com.google.common.hash.Funnel<? super T> funnel, int i, com.google.common.hash.BloomFilterStrategies.LockFreeBitArray lockFreeBitArray);
    }

    static {
        double log = java.lang.Math.log(2.0d);
        LOG_TWO = log;
        SQUARED_LOG_TWO = log * log;
    }

    private BloomFilter(com.google.common.hash.BloomFilterStrategies.LockFreeBitArray lockFreeBitArray, int i, com.google.common.hash.Funnel<? super T> funnel, com.google.common.hash.BloomFilter.Strategy strategy) {
        com.google.common.base.Preconditions.checkArgument(i > 0, "numHashFunctions (%s) must be > 0", i);
        com.google.common.base.Preconditions.checkArgument(i <= 255, "numHashFunctions (%s) must be <= 255", i);
        this.bits = (com.google.common.hash.BloomFilterStrategies.LockFreeBitArray) com.google.common.base.Preconditions.checkNotNull(lockFreeBitArray);
        this.numHashFunctions = i;
        this.funnel = (com.google.common.hash.Funnel) com.google.common.base.Preconditions.checkNotNull(funnel);
        this.strategy = (com.google.common.hash.BloomFilter.Strategy) com.google.common.base.Preconditions.checkNotNull(strategy);
    }

    public final com.google.common.hash.BloomFilter<T> copy() {
        return new com.google.common.hash.BloomFilter<>(this.bits.copy(), this.numHashFunctions, this.funnel, this.strategy);
    }

    public final boolean mightContain(T t) {
        return this.strategy.mightContain(t, this.funnel, this.numHashFunctions, this.bits);
    }

    @Override // com.google.common.base.Predicate
    @java.lang.Deprecated
    public final boolean apply(T t) {
        return mightContain(t);
    }

    public final boolean put(T t) {
        return this.strategy.put(t, this.funnel, this.numHashFunctions, this.bits);
    }

    public final double expectedFpp() {
        return java.lang.Math.pow(this.bits.bitCount() / bitSize(), this.numHashFunctions);
    }

    public final long approximateElementCount() {
        double bitSize = this.bits.bitSize();
        return com.google.common.math.DoubleMath.roundToLong(((-java.lang.Math.log1p(-(this.bits.bitCount() / bitSize))) * bitSize) / this.numHashFunctions, java.math.RoundingMode.HALF_UP);
    }

    final long bitSize() {
        return this.bits.bitSize();
    }

    public final boolean isCompatible(com.google.common.hash.BloomFilter<T> bloomFilter) {
        com.google.common.base.Preconditions.checkNotNull(bloomFilter);
        return this != bloomFilter && this.numHashFunctions == bloomFilter.numHashFunctions && bitSize() == bloomFilter.bitSize() && this.strategy.equals(bloomFilter.strategy) && this.funnel.equals(bloomFilter.funnel);
    }

    public final void putAll(com.google.common.hash.BloomFilter<T> bloomFilter) {
        com.google.common.base.Preconditions.checkNotNull(bloomFilter);
        com.google.common.base.Preconditions.checkArgument(this != bloomFilter, "Cannot combine a BloomFilter with itself.");
        int i = this.numHashFunctions;
        int i2 = bloomFilter.numHashFunctions;
        com.google.common.base.Preconditions.checkArgument(i == i2, "BloomFilters must have the same number of hash functions (%s != %s)", i, i2);
        com.google.common.base.Preconditions.checkArgument(bitSize() == bloomFilter.bitSize(), "BloomFilters must have the same size underlying bit arrays (%s != %s)", bitSize(), bloomFilter.bitSize());
        com.google.common.base.Preconditions.checkArgument(this.strategy.equals(bloomFilter.strategy), "BloomFilters must have equal strategies (%s != %s)", this.strategy, bloomFilter.strategy);
        com.google.common.base.Preconditions.checkArgument(this.funnel.equals(bloomFilter.funnel), "BloomFilters must have equal funnels (%s != %s)", this.funnel, bloomFilter.funnel);
        this.bits.putAll(bloomFilter.bits);
    }

    @Override // com.google.common.base.Predicate
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.common.hash.BloomFilter)) {
            return false;
        }
        com.google.common.hash.BloomFilter bloomFilter = (com.google.common.hash.BloomFilter) obj;
        return this.numHashFunctions == bloomFilter.numHashFunctions && this.funnel.equals(bloomFilter.funnel) && this.bits.equals(bloomFilter.bits) && this.strategy.equals(bloomFilter.strategy);
    }

    public final int hashCode() {
        int i = this.numHashFunctions;
        return java.util.Objects.hash(java.lang.Integer.valueOf(i), this.funnel, this.strategy, this.bits);
    }

    public static <T> java.util.stream.Collector<T, ?, com.google.common.hash.BloomFilter<T>> toBloomFilter(com.google.common.hash.Funnel<? super T> funnel, long j) {
        return toBloomFilter(funnel, j, 0.03d);
    }

    public static <T> java.util.stream.Collector<T, ?, com.google.common.hash.BloomFilter<T>> toBloomFilter(final com.google.common.hash.Funnel<? super T> funnel, final long j, final double d) {
        com.google.common.base.Preconditions.checkNotNull(funnel);
        com.google.common.base.Preconditions.checkArgument(j >= 0, "Expected insertions (%s) must be >= 0", j);
        com.google.common.base.Preconditions.checkArgument(d > 0.0d, "False positive probability (%s) must be > 0.0", java.lang.Double.valueOf(d));
        com.google.common.base.Preconditions.checkArgument(d < 1.0d, "False positive probability (%s) must be < 1.0", java.lang.Double.valueOf(d));
        return java.util.stream.Collector.of(new java.util.function.Supplier() { // from class: com.google.common.hash.BloomFilter$$ExternalSyntheticLambda0
            @Override // java.util.function.Supplier
            public final java.lang.Object get() {
                com.google.common.hash.BloomFilter create;
                create = com.google.common.hash.BloomFilter.create(com.google.common.hash.Funnel.this, j, d);
                return create;
            }
        }, new java.util.function.BiConsumer() { // from class: com.google.common.hash.BloomFilter$$ExternalSyntheticLambda1
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.common.hash.BloomFilter) obj).put(obj2);
            }
        }, new java.util.function.BinaryOperator() { // from class: com.google.common.hash.BloomFilter$$ExternalSyntheticLambda2
            @Override // java.util.function.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return com.google.common.hash.BloomFilter.lambda$toBloomFilter$1((com.google.common.hash.BloomFilter) obj, (com.google.common.hash.BloomFilter) obj2);
            }
        }, java.util.stream.Collector.Characteristics.UNORDERED, java.util.stream.Collector.Characteristics.CONCURRENT);
    }

    static /* synthetic */ com.google.common.hash.BloomFilter lambda$toBloomFilter$1(com.google.common.hash.BloomFilter bloomFilter, com.google.common.hash.BloomFilter bloomFilter2) {
        bloomFilter.putAll(bloomFilter2);
        return bloomFilter;
    }

    public static <T> com.google.common.hash.BloomFilter<T> create(com.google.common.hash.Funnel<? super T> funnel, int i, double d) {
        return create(funnel, i, d);
    }

    public static <T> com.google.common.hash.BloomFilter<T> create(com.google.common.hash.Funnel<? super T> funnel, long j, double d) {
        return create(funnel, j, d, com.google.common.hash.BloomFilterStrategies.MURMUR128_MITZ_64);
    }

    static <T> com.google.common.hash.BloomFilter<T> create(com.google.common.hash.Funnel<? super T> funnel, long j, double d, com.google.common.hash.BloomFilter.Strategy strategy) {
        com.google.common.base.Preconditions.checkNotNull(funnel);
        com.google.common.base.Preconditions.checkArgument(j >= 0, "Expected insertions (%s) must be >= 0", j);
        com.google.common.base.Preconditions.checkArgument(d > 0.0d, "False positive probability (%s) must be > 0.0", java.lang.Double.valueOf(d));
        com.google.common.base.Preconditions.checkArgument(d < 1.0d, "False positive probability (%s) must be < 1.0", java.lang.Double.valueOf(d));
        com.google.common.base.Preconditions.checkNotNull(strategy);
        if (j == 0) {
            j = 1;
        }
        long optimalNumOfBits = optimalNumOfBits(j, d);
        try {
            return new com.google.common.hash.BloomFilter<>(new com.google.common.hash.BloomFilterStrategies.LockFreeBitArray(optimalNumOfBits), optimalNumOfHashFunctions(d), funnel, strategy);
        } catch (java.lang.IllegalArgumentException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Could not create BloomFilter of ");
            sb.append(optimalNumOfBits);
            sb.append(" bits");
            throw new java.lang.IllegalArgumentException(sb.toString(), e);
        }
    }

    public static <T> com.google.common.hash.BloomFilter<T> create(com.google.common.hash.Funnel<? super T> funnel, int i) {
        return create(funnel, i);
    }

    public static <T> com.google.common.hash.BloomFilter<T> create(com.google.common.hash.Funnel<? super T> funnel, long j) {
        return create(funnel, j, 0.03d);
    }

    static int optimalNumOfHashFunctions(double d) {
        return java.lang.Math.max(1, (int) java.lang.Math.round((-java.lang.Math.log(d)) / LOG_TWO));
    }

    static long optimalNumOfBits(long j, double d) {
        if (d == 0.0d) {
            d = Double.MIN_VALUE;
        }
        return (long) (((-j) * java.lang.Math.log(d)) / SQUARED_LOG_TWO);
    }

    private java.lang.Object writeReplace() {
        return new com.google.common.hash.BloomFilter.SerialForm(this);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use SerializedForm");
    }

    static final class SerialForm<T> implements java.io.Serializable {
        private static final long serialVersionUID = 1;
        final long[] data;
        final com.google.common.hash.Funnel<? super T> funnel;
        final int numHashFunctions;
        final com.google.common.hash.BloomFilter.Strategy strategy;

        SerialForm(com.google.common.hash.BloomFilter<T> bloomFilter) {
            this.data = com.google.common.hash.BloomFilterStrategies.LockFreeBitArray.toPlainArray(((com.google.common.hash.BloomFilter) bloomFilter).bits.data);
            this.numHashFunctions = ((com.google.common.hash.BloomFilter) bloomFilter).numHashFunctions;
            this.funnel = ((com.google.common.hash.BloomFilter) bloomFilter).funnel;
            this.strategy = ((com.google.common.hash.BloomFilter) bloomFilter).strategy;
        }

        final java.lang.Object readResolve() {
            return new com.google.common.hash.BloomFilter(new com.google.common.hash.BloomFilterStrategies.LockFreeBitArray(this.data), this.numHashFunctions, this.funnel, this.strategy);
        }
    }

    public final void writeTo(java.io.OutputStream outputStream) throws java.io.IOException {
        java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(outputStream);
        dataOutputStream.writeByte(com.google.common.primitives.SignedBytes.checkedCast(this.strategy.ordinal()));
        dataOutputStream.writeByte(com.google.common.primitives.UnsignedBytes.checkedCast(this.numHashFunctions));
        dataOutputStream.writeInt(this.bits.data.length());
        for (int i = 0; i < this.bits.data.length(); i++) {
            dataOutputStream.writeLong(this.bits.data.get(i));
        }
    }

    public static <T> com.google.common.hash.BloomFilter<T> readFrom(java.io.InputStream inputStream, com.google.common.hash.Funnel<? super T> funnel) throws java.io.IOException {
        java.lang.Exception e;
        int i;
        int i2;
        java.io.DataInputStream dataInputStream;
        byte readByte;
        com.google.common.base.Preconditions.checkNotNull(inputStream, "InputStream");
        com.google.common.base.Preconditions.checkNotNull(funnel, "Funnel");
        int i3 = -1;
        try {
            try {
                dataInputStream = new java.io.DataInputStream(inputStream);
                readByte = dataInputStream.readByte();
                try {
                    i2 = java.lang.Byte.toUnsignedInt(dataInputStream.readByte());
                } catch (java.lang.Exception e2) {
                    e = e2;
                    i2 = -1;
                    i3 = readByte;
                    i = -1;
                }
            } catch (java.lang.Exception e3) {
                e = e3;
                i = -1;
                i2 = -1;
            }
            try {
                i3 = dataInputStream.readInt();
                com.google.common.hash.BloomFilterStrategies bloomFilterStrategies = com.google.common.hash.BloomFilterStrategies.values()[readByte];
                com.google.common.hash.BloomFilterStrategies.LockFreeBitArray lockFreeBitArray = new com.google.common.hash.BloomFilterStrategies.LockFreeBitArray(java.lang.Math.multiplyExact(i3, 64L));
                for (int i4 = 0; i4 < i3; i4++) {
                    lockFreeBitArray.putData(i4, dataInputStream.readLong());
                }
                return new com.google.common.hash.BloomFilter<>(lockFreeBitArray, i2, funnel, bloomFilterStrategies);
            } catch (java.lang.Exception e4) {
                e = e4;
                int i5 = i3;
                i3 = readByte;
                i = i5;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to deserialize BloomFilter from InputStream. strategyOrdinal: ");
                sb.append(i3);
                sb.append(" numHashFunctions: ");
                sb.append(i2);
                sb.append(" dataLength: ");
                sb.append(i);
                throw new java.io.IOException(sb.toString(), e);
            }
        } catch (java.io.IOException e5) {
            throw e5;
        }
    }
}
