package com.google.common.primitives;

/* loaded from: classes9.dex */
public final class UnsignedInteger extends java.lang.Number implements java.lang.Comparable<com.google.common.primitives.UnsignedInteger> {
    private final int value;
    public static final com.google.common.primitives.UnsignedInteger ZERO = fromIntBits(0);
    public static final com.google.common.primitives.UnsignedInteger ONE = fromIntBits(1);
    public static final com.google.common.primitives.UnsignedInteger MAX_VALUE = fromIntBits(-1);

    private UnsignedInteger(int i) {
        this.value = i;
    }

    public static com.google.common.primitives.UnsignedInteger fromIntBits(int i) {
        return new com.google.common.primitives.UnsignedInteger(i);
    }

    public static com.google.common.primitives.UnsignedInteger valueOf(long j) {
        com.google.common.base.Preconditions.checkArgument((4294967295L & j) == j, "value (%s) is outside the range for an unsigned integer value", j);
        return fromIntBits((int) j);
    }

    public static com.google.common.primitives.UnsignedInteger valueOf(java.math.BigInteger bigInteger) {
        com.google.common.base.Preconditions.checkNotNull(bigInteger);
        com.google.common.base.Preconditions.checkArgument(bigInteger.signum() >= 0 && bigInteger.bitLength() <= 32, "value (%s) is outside the range for an unsigned integer value", bigInteger);
        return fromIntBits(bigInteger.intValue());
    }

    public static com.google.common.primitives.UnsignedInteger valueOf(java.lang.String str) {
        return valueOf(str, 10);
    }

    public static com.google.common.primitives.UnsignedInteger valueOf(java.lang.String str, int i) {
        return fromIntBits(com.google.common.primitives.UnsignedInts.parseUnsignedInt(str, i));
    }

    public final com.google.common.primitives.UnsignedInteger plus(com.google.common.primitives.UnsignedInteger unsignedInteger) {
        return fromIntBits(this.value + ((com.google.common.primitives.UnsignedInteger) com.google.common.base.Preconditions.checkNotNull(unsignedInteger)).value);
    }

    public final com.google.common.primitives.UnsignedInteger minus(com.google.common.primitives.UnsignedInteger unsignedInteger) {
        return fromIntBits(this.value - ((com.google.common.primitives.UnsignedInteger) com.google.common.base.Preconditions.checkNotNull(unsignedInteger)).value);
    }

    public final com.google.common.primitives.UnsignedInteger times(com.google.common.primitives.UnsignedInteger unsignedInteger) {
        return fromIntBits(this.value * ((com.google.common.primitives.UnsignedInteger) com.google.common.base.Preconditions.checkNotNull(unsignedInteger)).value);
    }

    public final com.google.common.primitives.UnsignedInteger dividedBy(com.google.common.primitives.UnsignedInteger unsignedInteger) {
        return fromIntBits(com.google.common.primitives.UnsignedInts.divide(this.value, ((com.google.common.primitives.UnsignedInteger) com.google.common.base.Preconditions.checkNotNull(unsignedInteger)).value));
    }

    public final com.google.common.primitives.UnsignedInteger mod(com.google.common.primitives.UnsignedInteger unsignedInteger) {
        return fromIntBits(com.google.common.primitives.UnsignedInts.remainder(this.value, ((com.google.common.primitives.UnsignedInteger) com.google.common.base.Preconditions.checkNotNull(unsignedInteger)).value));
    }

    @Override // java.lang.Number
    public final int intValue() {
        return this.value;
    }

    @Override // java.lang.Number
    public final long longValue() {
        return com.google.common.primitives.UnsignedInts.toLong(this.value);
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return longValue();
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return longValue();
    }

    public final java.math.BigInteger bigIntegerValue() {
        return java.math.BigInteger.valueOf(longValue());
    }

    @Override // java.lang.Comparable
    public final int compareTo(com.google.common.primitives.UnsignedInteger unsignedInteger) {
        com.google.common.base.Preconditions.checkNotNull(unsignedInteger);
        return com.google.common.primitives.UnsignedInts.compare(this.value, unsignedInteger.value);
    }

    public final int hashCode() {
        return this.value;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof com.google.common.primitives.UnsignedInteger) && this.value == ((com.google.common.primitives.UnsignedInteger) obj).value;
    }

    public final java.lang.String toString() {
        return toString(10);
    }

    public final java.lang.String toString(int i) {
        return com.google.common.primitives.UnsignedInts.toString(this.value, i);
    }
}
