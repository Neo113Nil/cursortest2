package com.google.common.hash;

/* loaded from: classes9.dex */
final class LongAdder extends com.google.common.hash.Striped64 implements java.io.Serializable, com.google.common.hash.LongAddable {
    private static final long serialVersionUID = 7249069246863182397L;

    @Override // com.google.common.hash.Striped64
    final long fn(long j, long j2) {
        return j + j2;
    }

    @Override // com.google.common.hash.LongAddable
    public final void add(long j) {
        int length;
        com.google.common.hash.Striped64.Cell cell;
        com.google.common.hash.Striped64.Cell[] cellArr = this.cells;
        if (cellArr == null) {
            long j2 = this.base;
            if (casBase(j2, j2 + j)) {
                return;
            }
        }
        int[] iArr = threadHashCode.get();
        boolean z = true;
        if (iArr != null && cellArr != null && (length = cellArr.length) > 0 && (cell = cellArr[(length - 1) & iArr[0]]) != null) {
            long j3 = cell.value;
            z = cell.cas(j3, j3 + j);
            if (z) {
                return;
            }
        }
        retryUpdate(j, iArr, z);
    }

    @Override // com.google.common.hash.LongAddable
    public final void increment() {
        add(1L);
    }

    public final void decrement() {
        add(-1L);
    }

    @Override // com.google.common.hash.LongAddable
    public final long sum() {
        long j = this.base;
        com.google.common.hash.Striped64.Cell[] cellArr = this.cells;
        if (cellArr != null) {
            for (com.google.common.hash.Striped64.Cell cell : cellArr) {
                if (cell != null) {
                    j += cell.value;
                }
            }
        }
        return j;
    }

    public final void reset() {
        internalReset(0L);
    }

    public final long sumThenReset() {
        long j = this.base;
        com.google.common.hash.Striped64.Cell[] cellArr = this.cells;
        this.base = 0L;
        if (cellArr != null) {
            for (com.google.common.hash.Striped64.Cell cell : cellArr) {
                if (cell != null) {
                    j += cell.value;
                    cell.value = 0L;
                }
            }
        }
        return j;
    }

    public final java.lang.String toString() {
        return java.lang.Long.toString(sum());
    }

    @Override // java.lang.Number
    public final long longValue() {
        return sum();
    }

    @Override // java.lang.Number
    public final int intValue() {
        return (int) sum();
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return sum();
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return sum();
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeLong(sum());
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.busy = 0;
        this.cells = null;
        this.base = objectInputStream.readLong();
    }
}
