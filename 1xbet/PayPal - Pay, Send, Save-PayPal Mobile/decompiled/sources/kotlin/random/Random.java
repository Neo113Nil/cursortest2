package kotlin.random;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\t\b&\u0018\u0000 &2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u0010J\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0018J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010!\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020\u0004H\u0017¢\u0006\u0004\b!\u0010\"J\u0017\u0010!\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0017¢\u0006\u0004\b!\u0010#J\u0017\u0010!\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u0004H\u0016¢\u0006\u0004\b!\u0010%"}, d2 = {"Lkotlin/random/Random;", "", "<init>", "()V", "", "bitCount", "nextBits", "(I)I", "nextInt", "()I", "until", "from", "(II)I", "", "nextLong", "()J", "(J)J", "(JJ)J", "", "nextBoolean", "()Z", "", "nextDouble", "()D", "(D)D", "(DD)D", "", "nextFloat", "()F", "", "array", "fromIndex", "toIndex", "nextBytes", "([BII)[B", "([B)[B", io.ktor.http.ContentDisposition.Parameters.Size, "(I)[B", "Default"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class Random {

    /* renamed from: Default, reason: from kotlin metadata */
    public static final kotlin.random.Random.Companion INSTANCE = new kotlin.random.Random.Companion(null);
    private static final kotlin.random.Random getHighSpeedVideoSizes = kotlin.internal.PlatformImplementationsKt.IMPLEMENTATIONS.defaultPlatformRandom();

    public abstract int nextBits(int bitCount);

    public int nextInt() {
        return nextBits(32);
    }

    public int nextInt(int until) {
        return nextInt(0, until);
    }

    public int nextInt(int from, int until) {
        int nextInt;
        int i;
        int i2;
        kotlin.random.RandomKt.checkRangeBounds(from, until);
        int i3 = until - from;
        if (i3 > 0 || i3 == Integer.MIN_VALUE) {
            if (((-i3) & i3) == i3) {
                i2 = nextBits(kotlin.random.RandomKt.fastLog2(i3));
            } else {
                do {
                    nextInt = nextInt() >>> 1;
                    i = nextInt % i3;
                } while ((nextInt - i) + (i3 - 1) < 0);
                i2 = i;
            }
            return from + i2;
        }
        while (true) {
            int nextInt2 = nextInt();
            if (from <= nextInt2 && nextInt2 < until) {
                return nextInt2;
            }
        }
    }

    public long nextLong() {
        return (nextInt() << 32) + nextInt();
    }

    public long nextLong(long until) {
        return nextLong(0L, until);
    }

    public long nextLong(long from, long until) {
        long nextLong;
        long j;
        long j2;
        int nextInt;
        kotlin.random.RandomKt.checkRangeBounds(from, until);
        long j3 = until - from;
        if (j3 > 0) {
            if (((-j3) & j3) == j3) {
                int i = (int) j3;
                int i2 = (int) (j3 >>> 32);
                if (i != 0) {
                    nextInt = nextBits(kotlin.random.RandomKt.fastLog2(i));
                } else if (i2 == 1) {
                    nextInt = nextInt();
                } else {
                    j2 = (nextBits(kotlin.random.RandomKt.fastLog2(i2)) << 32) + (nextInt() & 4294967295L);
                }
                j2 = nextInt & 4294967295L;
            } else {
                do {
                    nextLong = nextLong() >>> 1;
                    j = nextLong % j3;
                } while ((nextLong - j) + (j3 - 1) < 0);
                j2 = j;
            }
            return from + j2;
        }
        while (true) {
            long nextLong2 = nextLong();
            if (from <= nextLong2 && nextLong2 < until) {
                return nextLong2;
            }
        }
    }

    public boolean nextBoolean() {
        return nextBits(1) != 0;
    }

    public double nextDouble() {
        return kotlin.random.PlatformRandomKt.doubleFromParts(nextBits(26), nextBits(27));
    }

    public double nextDouble(double until) {
        return nextDouble(0.0d, until);
    }

    public double nextDouble(double from, double until) {
        double nextDouble;
        kotlin.random.RandomKt.checkRangeBounds(from, until);
        double d = until - from;
        if (java.lang.Double.isInfinite(d) && java.lang.Math.abs(from) <= Double.MAX_VALUE && java.lang.Math.abs(until) <= Double.MAX_VALUE) {
            double nextDouble2 = nextDouble() * ((until / 2.0d) - (from / 2.0d));
            nextDouble = from + nextDouble2 + nextDouble2;
        } else {
            nextDouble = from + (nextDouble() * d);
        }
        return nextDouble >= until ? java.lang.Math.nextAfter(until, Double.NEGATIVE_INFINITY) : nextDouble;
    }

    public float nextFloat() {
        return nextBits(24) / 1.6777216E7f;
    }

    public static /* synthetic */ byte[] nextBytes$default(kotlin.random.Random random, byte[] bArr, int i, int i2, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nextBytes");
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        return random.nextBytes(bArr, i, i2);
    }

    @kotlin.IgnorableReturnValue
    public byte[] nextBytes(byte[] array, int fromIndex, int toIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "");
        if (fromIndex < 0 || fromIndex > array.length || toIndex < 0 || toIndex > array.length) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("fromIndex (");
            sb.append(fromIndex);
            sb.append(") or toIndex (");
            sb.append(toIndex);
            sb.append(") are out of range: 0..");
            sb.append(array.length);
            sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        if (fromIndex > toIndex) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("fromIndex (");
            sb2.append(fromIndex);
            sb2.append(") must be not greater than toIndex (");
            sb2.append(toIndex);
            sb2.append(").");
            throw new java.lang.IllegalArgumentException(sb2.toString().toString());
        }
        int i = (toIndex - fromIndex) / 4;
        for (int i2 = 0; i2 < i; i2++) {
            int nextInt = nextInt();
            array[fromIndex] = (byte) nextInt;
            array[fromIndex + 1] = (byte) (nextInt >>> 8);
            array[fromIndex + 2] = (byte) (nextInt >>> 16);
            array[fromIndex + 3] = (byte) (nextInt >>> 24);
            fromIndex += 4;
        }
        int i3 = toIndex - fromIndex;
        int nextBits = nextBits(i3 * 8);
        for (int i4 = 0; i4 < i3; i4++) {
            array[fromIndex + i4] = (byte) (nextBits >>> (i4 * 8));
        }
        return array;
    }

    @kotlin.IgnorableReturnValue
    public byte[] nextBytes(byte[] array) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "");
        return nextBytes(array, 0, array.length);
    }

    public byte[] nextBytes(int size) {
        return nextBytes(new byte[size]);
    }

    @kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u00014B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001bJ\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010!\u001a\u00020 2\u0006\u0010\u0015\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010#J\u001f\u0010!\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020 2\u0006\u0010\u0015\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020(2\u0006\u0010)\u001a\u00020(H\u0017¢\u0006\u0004\b*\u0010+J\u0017\u0010*\u001a\u00020(2\u0006\u0010,\u001a\u00020\u000fH\u0016¢\u0006\u0004\b*\u0010-J'\u0010*\u001a\u00020(2\u0006\u0010)\u001a\u00020(2\u0006\u0010.\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\u000fH\u0016¢\u0006\u0004\b*\u00100R\u0014\u00103\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102"}, d2 = {"Lkotlin/random/Random$Default;", "Lkotlin/random/Random;", "Ljava/io/Serializable;", "Lkotlin/io/Camera2StreamConfigurationMap;", "<init>", "()V", "", "writeReplace", "()Ljava/lang/Object;", "Ljava/io/ObjectInputStream;", "Lkotlin/internal/getHighSpeedVideoSizes;", "input", "", "readObject", "(Ljava/io/ObjectInputStream;)V", "", "bitCount", "nextBits", "(I)I", "nextInt", "()I", "until", "from", "(II)I", "", "nextLong", "()J", "(J)J", "(JJ)J", "", "nextBoolean", "()Z", "", "nextDouble", "()D", "(D)D", "(DD)D", "", "nextFloat", "()F", "", "array", "nextBytes", "([B)[B", io.ktor.http.ContentDisposition.Parameters.Size, "(I)[B", "fromIndex", "toIndex", "([BII)[B", "getHighSpeedVideoSizes", "Lkotlin/random/Random;", "getHighSpeedVideoFpsRanges", "Serialized"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: kotlin.random.Random$Default, reason: from kotlin metadata */
    /* loaded from: classes5.dex */
    public static final class Companion extends kotlin.random.Random implements java.io.Serializable {
        private Companion() {
        }

        @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lkotlin/random/Random$Default$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Camera2StreamConfigurationMap;", "<init>", "()V", "", "readResolve", "()Ljava/lang/Object;", "", "serialVersionUID", "J"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: kotlin.random.Random$Default$Serialized */
        /* loaded from: classes17.dex */
        static final class Serialized implements java.io.Serializable {
            public static final kotlin.random.Random.Companion.Serialized INSTANCE = new kotlin.random.Random.Companion.Serialized();
            private static final long serialVersionUID = 0;

            private Serialized() {
            }

            private final java.lang.Object readResolve() {
                return kotlin.random.Random.INSTANCE;
            }
        }

        private final java.lang.Object writeReplace() {
            return kotlin.random.Random.Companion.Serialized.INSTANCE;
        }

        private final void readObject(java.io.ObjectInputStream input) {
            throw new java.io.InvalidObjectException("Deserialization is supported via proxy only");
        }

        @Override // kotlin.random.Random
        public final int nextBits(int bitCount) {
            return kotlin.random.Random.getHighSpeedVideoSizes.nextBits(bitCount);
        }

        @Override // kotlin.random.Random
        public final int nextInt() {
            return kotlin.random.Random.getHighSpeedVideoSizes.nextInt();
        }

        @Override // kotlin.random.Random
        public final int nextInt(int until) {
            return kotlin.random.Random.getHighSpeedVideoSizes.nextInt(until);
        }

        @Override // kotlin.random.Random
        public final int nextInt(int from, int until) {
            return kotlin.random.Random.getHighSpeedVideoSizes.nextInt(from, until);
        }

        @Override // kotlin.random.Random
        public final long nextLong() {
            return kotlin.random.Random.getHighSpeedVideoSizes.nextLong();
        }

        @Override // kotlin.random.Random
        public final long nextLong(long until) {
            return kotlin.random.Random.getHighSpeedVideoSizes.nextLong(until);
        }

        @Override // kotlin.random.Random
        public final long nextLong(long from, long until) {
            return kotlin.random.Random.getHighSpeedVideoSizes.nextLong(from, until);
        }

        @Override // kotlin.random.Random
        public final boolean nextBoolean() {
            return kotlin.random.Random.getHighSpeedVideoSizes.nextBoolean();
        }

        @Override // kotlin.random.Random
        public final double nextDouble() {
            return kotlin.random.Random.getHighSpeedVideoSizes.nextDouble();
        }

        @Override // kotlin.random.Random
        public final double nextDouble(double until) {
            return kotlin.random.Random.getHighSpeedVideoSizes.nextDouble(until);
        }

        @Override // kotlin.random.Random
        public final double nextDouble(double from, double until) {
            return kotlin.random.Random.getHighSpeedVideoSizes.nextDouble(from, until);
        }

        @Override // kotlin.random.Random
        public final float nextFloat() {
            return kotlin.random.Random.getHighSpeedVideoSizes.nextFloat();
        }

        @Override // kotlin.random.Random
        @kotlin.IgnorableReturnValue
        public final byte[] nextBytes(byte[] array) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "");
            return kotlin.random.Random.getHighSpeedVideoSizes.nextBytes(array);
        }

        @Override // kotlin.random.Random
        public final byte[] nextBytes(int size) {
            return kotlin.random.Random.getHighSpeedVideoSizes.nextBytes(size);
        }

        @Override // kotlin.random.Random
        public final byte[] nextBytes(byte[] array, int fromIndex, int toIndex) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "");
            return kotlin.random.Random.getHighSpeedVideoSizes.nextBytes(array, fromIndex, toIndex);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
