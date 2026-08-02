package com.google.common.util.concurrent;

/* loaded from: classes9.dex */
public class AtomicDouble extends java.lang.Number {
    private static final long serialVersionUID = 0;
    private transient java.util.concurrent.atomic.AtomicLong value;

    public AtomicDouble(double d) {
        this.value = new java.util.concurrent.atomic.AtomicLong(java.lang.Double.doubleToRawLongBits(d));
    }

    public AtomicDouble() {
        this(0.0d);
    }

    public final double get() {
        return java.lang.Double.longBitsToDouble(this.value.get());
    }

    public final void set(double d) {
        this.value.set(java.lang.Double.doubleToRawLongBits(d));
    }

    public final void lazySet(double d) {
        this.value.lazySet(java.lang.Double.doubleToRawLongBits(d));
    }

    public final double getAndSet(double d) {
        return java.lang.Double.longBitsToDouble(this.value.getAndSet(java.lang.Double.doubleToRawLongBits(d)));
    }

    public final boolean compareAndSet(double d, double d2) {
        return this.value.compareAndSet(java.lang.Double.doubleToRawLongBits(d), java.lang.Double.doubleToRawLongBits(d2));
    }

    public final boolean weakCompareAndSet(double d, double d2) {
        return this.value.weakCompareAndSet(java.lang.Double.doubleToRawLongBits(d), java.lang.Double.doubleToRawLongBits(d2));
    }

    public final double getAndAdd(double d) {
        long j;
        double longBitsToDouble;
        do {
            j = this.value.get();
            longBitsToDouble = java.lang.Double.longBitsToDouble(j);
        } while (!this.value.compareAndSet(j, java.lang.Double.doubleToRawLongBits(longBitsToDouble + d)));
        return longBitsToDouble;
    }

    public final double addAndGet(double d) {
        long j;
        double longBitsToDouble;
        do {
            j = this.value.get();
            longBitsToDouble = java.lang.Double.longBitsToDouble(j) + d;
        } while (!this.value.compareAndSet(j, java.lang.Double.doubleToRawLongBits(longBitsToDouble)));
        return longBitsToDouble;
    }

    public java.lang.String toString() {
        return java.lang.Double.toString(get());
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) get();
    }

    @Override // java.lang.Number
    public long longValue() {
        return (long) get();
    }

    @Override // java.lang.Number
    public float floatValue() {
        return (float) get();
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return get();
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeDouble(get());
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.value = new java.util.concurrent.atomic.AtomicLong();
        set(objectInputStream.readDouble());
    }
}
