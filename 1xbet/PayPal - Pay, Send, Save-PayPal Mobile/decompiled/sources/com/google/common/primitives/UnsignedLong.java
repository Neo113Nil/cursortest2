package com.google.common.primitives;

/* loaded from: classes9.dex */
public final class UnsignedLong extends java.lang.Number implements java.lang.Comparable<com.google.common.primitives.UnsignedLong> {
    private static final long UNSIGNED_MASK = Long.MAX_VALUE;
    private final long value;
    public static final com.google.common.primitives.UnsignedLong ZERO = new com.google.common.primitives.UnsignedLong(0);
    public static final com.google.common.primitives.UnsignedLong ONE = new com.google.common.primitives.UnsignedLong(1);
    public static final com.google.common.primitives.UnsignedLong MAX_VALUE = new com.google.common.primitives.UnsignedLong(-1);

    private UnsignedLong(long j) {
        this.value = j;
    }

    public static com.google.common.primitives.UnsignedLong fromLongBits(long j) {
        return new com.google.common.primitives.UnsignedLong(j);
    }

    public static com.google.common.primitives.UnsignedLong valueOf(long j) {
        com.google.common.base.Preconditions.checkArgument(j >= 0, "value (%s) is outside the range for an unsigned long value", j);
        return fromLongBits(j);
    }

    public static com.google.common.primitives.UnsignedLong valueOf(java.math.BigInteger bigInteger) {
        com.google.common.base.Preconditions.checkNotNull(bigInteger);
        com.google.common.base.Preconditions.checkArgument(bigInteger.signum() >= 0 && bigInteger.bitLength() <= 64, "value (%s) is outside the range for an unsigned long value", bigInteger);
        return fromLongBits(bigInteger.longValue());
    }

    public static com.google.common.primitives.UnsignedLong valueOf(java.lang.String str) {
        return valueOf(str, 10);
    }

    public static com.google.common.primitives.UnsignedLong valueOf(java.lang.String str, int i) {
        return fromLongBits(com.google.common.primitives.UnsignedLongs.parseUnsignedLong(str, i));
    }

    public final com.google.common.primitives.UnsignedLong plus(com.google.common.primitives.UnsignedLong unsignedLong) {
        return fromLongBits(this.value + ((com.google.common.primitives.UnsignedLong) com.google.common.base.Preconditions.checkNotNull(unsignedLong)).value);
    }

    public final com.google.common.primitives.UnsignedLong minus(com.google.common.primitives.UnsignedLong unsignedLong) {
        return fromLongBits(this.value - ((com.google.common.primitives.UnsignedLong) com.google.common.base.Preconditions.checkNotNull(unsignedLong)).value);
    }

    public final com.google.common.primitives.UnsignedLong times(com.google.common.primitives.UnsignedLong unsignedLong) {
        return fromLongBits(this.value * ((com.google.common.primitives.UnsignedLong) com.google.common.base.Preconditions.checkNotNull(unsignedLong)).value);
    }

    public final com.google.common.primitives.UnsignedLong dividedBy(com.google.common.primitives.UnsignedLong unsignedLong) {
        return fromLongBits(com.google.common.primitives.UnsignedLongs.divide(this.value, ((com.google.common.primitives.UnsignedLong) com.google.common.base.Preconditions.checkNotNull(unsignedLong)).value));
    }

    public final com.google.common.primitives.UnsignedLong mod(com.google.common.primitives.UnsignedLong unsignedLong) {
        return fromLongBits(com.google.common.primitives.UnsignedLongs.remainder(this.value, ((com.google.common.primitives.UnsignedLong) com.google.common.base.Preconditions.checkNotNull(unsignedLong)).value));
    }

    @Override // java.lang.Number
    public final int intValue() {
        return (int) this.value;
    }

    @Override // java.lang.Number
    public final long longValue() {
        return this.value;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        long j = this.value;
        if (j >= 0) {
            return j;
        }
        return ((j >>> 1) | (1 & j)) * 2.0f;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        long j = this.value;
        if (j >= 0) {
            return j;
        }
        return ((j >>> 1) | (1 & j)) * 2.0d;
    }

    public final java.math.BigInteger bigIntegerValue() {
        java.math.BigInteger valueOf = java.math.BigInteger.valueOf(this.value & Long.MAX_VALUE);
        return this.value < 0 ? valueOf.setBit(63) : valueOf;
    }

    @Override // java.lang.Comparable
    public final int compareTo(com.google.common.primitives.UnsignedLong unsignedLong) {
        com.google.common.base.Preconditions.checkNotNull(unsignedLong);
        return com.google.common.primitives.UnsignedLongs.compare(this.value, unsignedLong.value);
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.value);
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof com.google.common.primitives.UnsignedLong) && this.value == ((com.google.common.primitives.UnsignedLong) obj).value;
    }

    public final java.lang.String toString() {
        return com.google.common.primitives.UnsignedLongs.toString(this.value);
    }

    public final java.lang.String toString(int i) {
        return com.google.common.primitives.UnsignedLongs.toString(this.value, i);
    }
}
