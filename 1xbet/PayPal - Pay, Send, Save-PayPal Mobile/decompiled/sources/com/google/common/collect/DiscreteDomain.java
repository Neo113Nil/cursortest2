package com.google.common.collect;

/* loaded from: classes9.dex */
public abstract class DiscreteDomain<C extends java.lang.Comparable> {
    final boolean supportsFastOffset;

    public abstract long distance(C c, C c2);

    public abstract C next(C c);

    public abstract C previous(C c);

    public static com.google.common.collect.DiscreteDomain<java.lang.Integer> integers() {
        return com.google.common.collect.DiscreteDomain.IntegerDomain.INSTANCE;
    }

    static final class IntegerDomain extends com.google.common.collect.DiscreteDomain<java.lang.Integer> implements java.io.Serializable {
        private static final com.google.common.collect.DiscreteDomain.IntegerDomain INSTANCE = new com.google.common.collect.DiscreteDomain.IntegerDomain();
        private static final long serialVersionUID = 0;

        IntegerDomain() {
            super(true);
        }

        @Override // com.google.common.collect.DiscreteDomain
        public final java.lang.Integer next(java.lang.Integer num) {
            int intValue = num.intValue();
            if (intValue == Integer.MAX_VALUE) {
                return null;
            }
            return java.lang.Integer.valueOf(intValue + 1);
        }

        @Override // com.google.common.collect.DiscreteDomain
        public final java.lang.Integer previous(java.lang.Integer num) {
            int intValue = num.intValue();
            if (intValue == Integer.MIN_VALUE) {
                return null;
            }
            return java.lang.Integer.valueOf(intValue - 1);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.DiscreteDomain
        public final java.lang.Integer offset(java.lang.Integer num, long j) {
            com.google.common.collect.CollectPreconditions.checkNonnegative(j, "distance");
            return java.lang.Integer.valueOf(com.google.common.primitives.Ints.checkedCast(num.longValue() + j));
        }

        @Override // com.google.common.collect.DiscreteDomain
        public final long distance(java.lang.Integer num, java.lang.Integer num2) {
            return num2.intValue() - num.intValue();
        }

        @Override // com.google.common.collect.DiscreteDomain
        public final java.lang.Integer minValue() {
            return Integer.MIN_VALUE;
        }

        @Override // com.google.common.collect.DiscreteDomain
        public final java.lang.Integer maxValue() {
            return Integer.MAX_VALUE;
        }

        private java.lang.Object readResolve() {
            return INSTANCE;
        }

        public final java.lang.String toString() {
            return "DiscreteDomain.integers()";
        }
    }

    public static com.google.common.collect.DiscreteDomain<java.lang.Long> longs() {
        return com.google.common.collect.DiscreteDomain.LongDomain.INSTANCE;
    }

    static final class LongDomain extends com.google.common.collect.DiscreteDomain<java.lang.Long> implements java.io.Serializable {
        private static final com.google.common.collect.DiscreteDomain.LongDomain INSTANCE = new com.google.common.collect.DiscreteDomain.LongDomain();
        private static final long serialVersionUID = 0;

        LongDomain() {
            super(true);
        }

        @Override // com.google.common.collect.DiscreteDomain
        public final java.lang.Long next(java.lang.Long l) {
            long longValue = l.longValue();
            if (longValue == Long.MAX_VALUE) {
                return null;
            }
            return java.lang.Long.valueOf(longValue + 1);
        }

        @Override // com.google.common.collect.DiscreteDomain
        public final java.lang.Long previous(java.lang.Long l) {
            long longValue = l.longValue();
            if (longValue == Long.MIN_VALUE) {
                return null;
            }
            return java.lang.Long.valueOf(longValue - 1);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.DiscreteDomain
        public final java.lang.Long offset(java.lang.Long l, long j) {
            com.google.common.collect.CollectPreconditions.checkNonnegative(j, "distance");
            long longValue = l.longValue() + j;
            if (longValue < 0) {
                com.google.common.base.Preconditions.checkArgument(l.longValue() < 0, "overflow");
            }
            return java.lang.Long.valueOf(longValue);
        }

        @Override // com.google.common.collect.DiscreteDomain
        public final long distance(java.lang.Long l, java.lang.Long l2) {
            long longValue = l2.longValue() - l.longValue();
            if (l2.longValue() > l.longValue() && longValue < 0) {
                return Long.MAX_VALUE;
            }
            if (l2.longValue() >= l.longValue() || longValue <= 0) {
                return longValue;
            }
            return Long.MIN_VALUE;
        }

        @Override // com.google.common.collect.DiscreteDomain
        public final java.lang.Long minValue() {
            return Long.MIN_VALUE;
        }

        @Override // com.google.common.collect.DiscreteDomain
        public final java.lang.Long maxValue() {
            return Long.MAX_VALUE;
        }

        private java.lang.Object readResolve() {
            return INSTANCE;
        }

        public final java.lang.String toString() {
            return "DiscreteDomain.longs()";
        }
    }

    public static com.google.common.collect.DiscreteDomain<java.math.BigInteger> bigIntegers() {
        return com.google.common.collect.DiscreteDomain.BigIntegerDomain.INSTANCE;
    }

    static final class BigIntegerDomain extends com.google.common.collect.DiscreteDomain<java.math.BigInteger> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        private static final com.google.common.collect.DiscreteDomain.BigIntegerDomain INSTANCE = new com.google.common.collect.DiscreteDomain.BigIntegerDomain();
        private static final java.math.BigInteger MIN_LONG = java.math.BigInteger.valueOf(Long.MIN_VALUE);
        private static final java.math.BigInteger MAX_LONG = java.math.BigInteger.valueOf(Long.MAX_VALUE);

        BigIntegerDomain() {
            super(true);
        }

        @Override // com.google.common.collect.DiscreteDomain
        public final java.math.BigInteger next(java.math.BigInteger bigInteger) {
            return bigInteger.add(java.math.BigInteger.ONE);
        }

        @Override // com.google.common.collect.DiscreteDomain
        public final java.math.BigInteger previous(java.math.BigInteger bigInteger) {
            return bigInteger.subtract(java.math.BigInteger.ONE);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.DiscreteDomain
        public final java.math.BigInteger offset(java.math.BigInteger bigInteger, long j) {
            com.google.common.collect.CollectPreconditions.checkNonnegative(j, "distance");
            return bigInteger.add(java.math.BigInteger.valueOf(j));
        }

        @Override // com.google.common.collect.DiscreteDomain
        public final long distance(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
            return bigInteger2.subtract(bigInteger).max(MIN_LONG).min(MAX_LONG).longValue();
        }

        private java.lang.Object readResolve() {
            return INSTANCE;
        }

        public final java.lang.String toString() {
            return "DiscreteDomain.bigIntegers()";
        }
    }

    protected DiscreteDomain() {
        this(false);
    }

    private DiscreteDomain(boolean z) {
        this.supportsFastOffset = z;
    }

    C offset(C c, long j) {
        com.google.common.collect.CollectPreconditions.checkNonnegative(j, "distance");
        C c2 = c;
        for (long j2 = 0; j2 < j; j2++) {
            c2 = next(c2);
            if (c2 == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("overflowed computing offset(");
                sb.append(c);
                sb.append(", ");
                sb.append(j);
                sb.append(")");
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }
        return c2;
    }

    public C minValue() {
        throw new java.util.NoSuchElementException();
    }

    public C maxValue() {
        throw new java.util.NoSuchElementException();
    }
}
