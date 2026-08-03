package com.google.common.util.concurrent;

@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public class AtomicDoubleArray implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    private transient java.util.concurrent.atomic.AtomicLongArray longs;

    public AtomicDoubleArray(int length) {
        this.longs = new java.util.concurrent.atomic.AtomicLongArray(length);
    }

    public AtomicDoubleArray(double[] array) {
        int length = array.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = java.lang.Double.doubleToRawLongBits(array[i]);
        }
        this.longs = new java.util.concurrent.atomic.AtomicLongArray(jArr);
    }

    public final int length() {
        return this.longs.length();
    }

    public final double get(int i) {
        return java.lang.Double.longBitsToDouble(this.longs.get(i));
    }

    public final void set(int i, double newValue) {
        this.longs.set(i, java.lang.Double.doubleToRawLongBits(newValue));
    }

    public final void lazySet(int i, double newValue) {
        this.longs.lazySet(i, java.lang.Double.doubleToRawLongBits(newValue));
    }

    public final double getAndSet(int i, double newValue) {
        return java.lang.Double.longBitsToDouble(this.longs.getAndSet(i, java.lang.Double.doubleToRawLongBits(newValue)));
    }

    public final boolean compareAndSet(int i, double expect, double update) {
        return this.longs.compareAndSet(i, java.lang.Double.doubleToRawLongBits(expect), java.lang.Double.doubleToRawLongBits(update));
    }

    public final boolean weakCompareAndSet(int i, double expect, double update) {
        return this.longs.weakCompareAndSet(i, java.lang.Double.doubleToRawLongBits(expect), java.lang.Double.doubleToRawLongBits(update));
    }

    public final double getAndAdd(int i, double delta) {
        long j;
        double longBitsToDouble;
        do {
            j = this.longs.get(i);
            longBitsToDouble = java.lang.Double.longBitsToDouble(j);
        } while (!this.longs.compareAndSet(i, j, java.lang.Double.doubleToRawLongBits(longBitsToDouble + delta)));
        return longBitsToDouble;
    }

    public double addAndGet(int i, double delta) {
        long j;
        double longBitsToDouble;
        do {
            j = this.longs.get(i);
            longBitsToDouble = java.lang.Double.longBitsToDouble(j) + delta;
        } while (!this.longs.compareAndSet(i, j, java.lang.Double.doubleToRawLongBits(longBitsToDouble)));
        return longBitsToDouble;
    }

    public java.lang.String toString() {
        int length = length();
        int i = length - 1;
        if (i == -1) {
            return okhttp3.HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length * 19);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
        int i2 = 0;
        while (true) {
            sb.append(java.lang.Double.longBitsToDouble(this.longs.get(i2)));
            if (i2 == i) {
                sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
                return sb.toString();
            }
            sb.append(", ");
            i2++;
        }
    }

    private void writeObject(java.io.ObjectOutputStream s) throws java.io.IOException {
        s.defaultWriteObject();
        int length = length();
        s.writeInt(length);
        for (int i = 0; i < length; i++) {
            s.writeDouble(get(i));
        }
    }

    private void readObject(java.io.ObjectInputStream s) throws java.io.IOException, java.lang.ClassNotFoundException {
        s.defaultReadObject();
        int readInt = s.readInt();
        com.google.common.primitives.ImmutableLongArray.Builder builder = com.google.common.primitives.ImmutableLongArray.builder();
        for (int i = 0; i < readInt; i++) {
            builder.add(java.lang.Double.doubleToRawLongBits(s.readDouble()));
        }
        this.longs = new java.util.concurrent.atomic.AtomicLongArray(builder.build().toArray());
    }
}
