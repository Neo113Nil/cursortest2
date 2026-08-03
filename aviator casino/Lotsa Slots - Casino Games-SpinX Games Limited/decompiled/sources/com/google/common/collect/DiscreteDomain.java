package com.google.common.collect;

@com.google.common.collect.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public abstract class DiscreteDomain<C extends java.lang.Comparable> {
    final boolean supportsFastOffset;

    public abstract long distance(C start, C end);

    @javax.annotation.CheckForNull
    public abstract C next(C value);

    @javax.annotation.CheckForNull
    public abstract C previous(C value);

    public static com.google.common.collect.DiscreteDomain<java.lang.Integer> integers() {
        return com.google.common.collect.DiscreteDomain.IntegerDomain.INSTANCE;
    }

    private static final class IntegerDomain extends com.google.common.collect.DiscreteDomain<java.lang.Integer> implements java.io.Serializable {
        private static final com.google.common.collect.DiscreteDomain.IntegerDomain INSTANCE = new com.google.common.collect.DiscreteDomain.IntegerDomain();
        private static final long serialVersionUID = 0;

        IntegerDomain() {
            super(true);
        }

        @Override // com.google.common.collect.DiscreteDomain
        @javax.annotation.CheckForNull
        public java.lang.Integer next(java.lang.Integer value) {
            int intValue = value.intValue();
            if (intValue == Integer.MAX_VALUE) {
                return null;
            }
            return java.lang.Integer.valueOf(intValue + 1);
        }

        @Override // com.google.common.collect.DiscreteDomain
        @javax.annotation.CheckForNull
        public java.lang.Integer previous(java.lang.Integer value) {
            int intValue = value.intValue();
            if (intValue == Integer.MIN_VALUE) {
                return null;
            }
            return java.lang.Integer.valueOf(intValue - 1);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.DiscreteDomain
        public java.lang.Integer offset(java.lang.Integer origin, long distance) {
            com.google.common.collect.CollectPreconditions.checkNonnegative(distance, "distance");
            return java.lang.Integer.valueOf(com.google.common.primitives.Ints.checkedCast(origin.longValue() + distance));
        }

        @Override // com.google.common.collect.DiscreteDomain
        public long distance(java.lang.Integer start, java.lang.Integer end) {
            return end.intValue() - start.intValue();
        }

        @Override // com.google.common.collect.DiscreteDomain
        public java.lang.Integer minValue() {
            return Integer.MIN_VALUE;
        }

        @Override // com.google.common.collect.DiscreteDomain
        public java.lang.Integer maxValue() {
            return Integer.MAX_VALUE;
        }

        private java.lang.Object readResolve() {
            return INSTANCE;
        }

        public java.lang.String toString() {
            return "DiscreteDomain.integers()";
        }
    }

    public static com.google.common.collect.DiscreteDomain<java.lang.Long> longs() {
        return com.google.common.collect.DiscreteDomain.LongDomain.INSTANCE;
    }

    private static final class LongDomain extends com.google.common.collect.DiscreteDomain<java.lang.Long> implements java.io.Serializable {
        private static final com.google.common.collect.DiscreteDomain.LongDomain INSTANCE = new com.google.common.collect.DiscreteDomain.LongDomain();
        private static final long serialVersionUID = 0;

        LongDomain() {
            super(true);
        }

        @Override // com.google.common.collect.DiscreteDomain
        @javax.annotation.CheckForNull
        public java.lang.Long next(java.lang.Long value) {
            long longValue = value.longValue();
            if (longValue == Long.MAX_VALUE) {
                return null;
            }
            return java.lang.Long.valueOf(longValue + 1);
        }

        @Override // com.google.common.collect.DiscreteDomain
        @javax.annotation.CheckForNull
        public java.lang.Long previous(java.lang.Long value) {
            long longValue = value.longValue();
            if (longValue == Long.MIN_VALUE) {
                return null;
            }
            return java.lang.Long.valueOf(longValue - 1);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.DiscreteDomain
        public java.lang.Long offset(java.lang.Long origin, long distance) {
            com.google.common.collect.CollectPreconditions.checkNonnegative(distance, "distance");
            long longValue = origin.longValue() + distance;
            if (longValue < 0) {
                com.google.common.base.Preconditions.checkArgument(origin.longValue() < 0, com.helpshift.proactive.InAppViewConstants.OVERFLOW);
            }
            return java.lang.Long.valueOf(longValue);
        }

        @Override // com.google.common.collect.DiscreteDomain
        public long distance(java.lang.Long start, java.lang.Long end) {
            long longValue = end.longValue() - start.longValue();
            if (end.longValue() > start.longValue() && longValue < 0) {
                return Long.MAX_VALUE;
            }
            if (end.longValue() >= start.longValue() || longValue <= 0) {
                return longValue;
            }
            return Long.MIN_VALUE;
        }

        @Override // com.google.common.collect.DiscreteDomain
        public java.lang.Long minValue() {
            return Long.MIN_VALUE;
        }

        @Override // com.google.common.collect.DiscreteDomain
        public java.lang.Long maxValue() {
            return Long.MAX_VALUE;
        }

        private java.lang.Object readResolve() {
            return INSTANCE;
        }

        public java.lang.String toString() {
            return "DiscreteDomain.longs()";
        }
    }

    public static com.google.common.collect.DiscreteDomain<java.math.BigInteger> bigIntegers() {
        return com.google.common.collect.DiscreteDomain.BigIntegerDomain.INSTANCE;
    }

    private static final class BigIntegerDomain extends com.google.common.collect.DiscreteDomain<java.math.BigInteger> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        private static final com.google.common.collect.DiscreteDomain.BigIntegerDomain INSTANCE = new com.google.common.collect.DiscreteDomain.BigIntegerDomain();
        private static final java.math.BigInteger MIN_LONG = java.math.BigInteger.valueOf(Long.MIN_VALUE);
        private static final java.math.BigInteger MAX_LONG = java.math.BigInteger.valueOf(Long.MAX_VALUE);

        BigIntegerDomain() {
            super(true);
        }

        @Override // com.google.common.collect.DiscreteDomain
        public java.math.BigInteger next(java.math.BigInteger value) {
            return value.add(java.math.BigInteger.ONE);
        }

        @Override // com.google.common.collect.DiscreteDomain
        public java.math.BigInteger previous(java.math.BigInteger value) {
            return value.subtract(java.math.BigInteger.ONE);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.DiscreteDomain
        public java.math.BigInteger offset(java.math.BigInteger origin, long distance) {
            com.google.common.collect.CollectPreconditions.checkNonnegative(distance, "distance");
            return origin.add(java.math.BigInteger.valueOf(distance));
        }

        @Override // com.google.common.collect.DiscreteDomain
        public long distance(java.math.BigInteger start, java.math.BigInteger end) {
            return end.subtract(start).max(MIN_LONG).min(MAX_LONG).longValue();
        }

        private java.lang.Object readResolve() {
            return INSTANCE;
        }

        public java.lang.String toString() {
            return "DiscreteDomain.bigIntegers()";
        }
    }

    protected DiscreteDomain() {
        this(false);
    }

    private DiscreteDomain(boolean supportsFastOffset) {
        this.supportsFastOffset = supportsFastOffset;
    }

    C offset(C origin, long distance) {
        com.google.common.collect.CollectPreconditions.checkNonnegative(distance, "distance");
        C c = origin;
        for (long j = 0; j < distance; j++) {
            c = next(c);
            if (c == null) {
                throw new java.lang.IllegalArgumentException("overflowed computing offset(" + origin + ", " + distance + ")");
            }
        }
        return c;
    }

    public C minValue() {
        throw new java.util.NoSuchElementException();
    }

    public C maxValue() {
        throw new java.util.NoSuchElementException();
    }
}
