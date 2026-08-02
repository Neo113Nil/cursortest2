package com.google.common.hash;

/* loaded from: classes9.dex */
abstract class Striped64 extends java.lang.Number {
    private static final long BASE_OFFSET;
    private static final long BUSY_OFFSET;
    private static final sun.misc.Unsafe UNSAFE;
    volatile transient long base;
    volatile transient int busy;
    volatile transient com.google.common.hash.Striped64.Cell[] cells;
    static final java.lang.ThreadLocal<int[]> threadHashCode = new java.lang.ThreadLocal<>();
    static final java.util.Random rng = new java.util.Random();
    static final int NCPU = java.lang.Runtime.getRuntime().availableProcessors();

    abstract long fn(long j, long j2);

    static final class Cell {
        private static final sun.misc.Unsafe UNSAFE;
        private static final long VALUE_OFFSET;
        volatile long p0;
        volatile long p1;
        volatile long p2;
        volatile long p3;
        volatile long p4;
        volatile long p5;
        volatile long p6;
        volatile long q0;
        volatile long q1;
        volatile long q2;
        volatile long q3;
        volatile long q4;
        volatile long q5;
        volatile long q6;
        volatile long value;

        Cell(long j) {
            this.value = j;
        }

        final boolean cas(long j, long j2) {
            return UNSAFE.compareAndSwapLong(this, VALUE_OFFSET, j, j2);
        }

        static {
            try {
                sun.misc.Unsafe unsafe = com.google.common.hash.Striped64.getUnsafe();
                UNSAFE = unsafe;
                VALUE_OFFSET = unsafe.objectFieldOffset(com.google.common.hash.Striped64.Cell.class.getDeclaredField(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE));
            } catch (java.lang.Exception e) {
                throw new java.lang.Error(e);
            }
        }
    }

    static {
        try {
            sun.misc.Unsafe unsafe = getUnsafe();
            UNSAFE = unsafe;
            BASE_OFFSET = unsafe.objectFieldOffset(com.google.common.hash.Striped64.class.getDeclaredField("base"));
            BUSY_OFFSET = unsafe.objectFieldOffset(com.google.common.hash.Striped64.class.getDeclaredField("busy"));
        } catch (java.lang.Exception e) {
            throw new java.lang.Error(e);
        }
    }

    Striped64() {
    }

    final boolean casBase(long j, long j2) {
        return UNSAFE.compareAndSwapLong(this, BASE_OFFSET, j, j2);
    }

    final boolean casBusy() {
        return UNSAFE.compareAndSwapInt(this, BUSY_OFFSET, 0, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x005b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0023 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void retryUpdate(long j, int[] iArr, boolean z) {
        int i;
        int[] iArr2;
        boolean z2;
        int length;
        boolean z3;
        int length2;
        if (iArr == null) {
            iArr2 = new int[1];
            threadHashCode.set(iArr2);
            i = rng.nextInt();
            if (i == 0) {
                i = 1;
            }
            iArr2[0] = i;
        } else {
            i = iArr[0];
            iArr2 = iArr;
        }
        boolean z4 = false;
        int i2 = i;
        boolean z5 = z;
        while (true) {
            com.google.common.hash.Striped64.Cell[] cellArr = this.cells;
            if (cellArr != null && (length = cellArr.length) > 0) {
                com.google.common.hash.Striped64.Cell cell = cellArr[(length - 1) & i2];
                if (cell == null) {
                    if (this.busy == 0) {
                        com.google.common.hash.Striped64.Cell cell2 = new com.google.common.hash.Striped64.Cell(j);
                        if (this.busy == 0 && casBusy()) {
                            try {
                                com.google.common.hash.Striped64.Cell[] cellArr2 = this.cells;
                                if (cellArr2 != null && (length2 = cellArr2.length) > 0) {
                                    int i3 = (length2 - 1) & i2;
                                    if (cellArr2[i3] == null) {
                                        cellArr2[i3] = cell2;
                                        z3 = true;
                                        if (!z3) {
                                            return;
                                        }
                                    }
                                }
                                z3 = false;
                                if (!z3) {
                                }
                            } finally {
                            }
                        }
                    }
                    z4 = false;
                } else if (z5) {
                    long j2 = cell.value;
                    if (cell.cas(j2, fn(j2, j))) {
                        return;
                    }
                    if (length < NCPU && this.cells == cellArr) {
                        if (!z4) {
                            z4 = true;
                        } else if (this.busy == 0 && casBusy()) {
                            try {
                                if (this.cells == cellArr) {
                                    com.google.common.hash.Striped64.Cell[] cellArr3 = new com.google.common.hash.Striped64.Cell[length << 1];
                                    for (int i4 = 0; i4 < length; i4++) {
                                        cellArr3[i4] = cellArr[i4];
                                    }
                                    this.cells = cellArr3;
                                }
                                this.busy = 0;
                                z4 = false;
                            } finally {
                            }
                        }
                    }
                    z4 = false;
                } else {
                    z5 = true;
                }
                int i5 = i2 ^ (i2 << 13);
                int i6 = i5 ^ (i5 >>> 17);
                i2 = i6 ^ (i6 << 5);
                iArr2[0] = i2;
            } else if (this.busy == 0 && this.cells == cellArr && casBusy()) {
                try {
                    if (this.cells == cellArr) {
                        com.google.common.hash.Striped64.Cell[] cellArr4 = new com.google.common.hash.Striped64.Cell[2];
                        cellArr4[i2 & 1] = new com.google.common.hash.Striped64.Cell(j);
                        this.cells = cellArr4;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        return;
                    }
                } finally {
                }
            } else {
                long j3 = this.base;
                if (casBase(j3, fn(j3, j))) {
                    return;
                }
            }
        }
    }

    final void internalReset(long j) {
        com.google.common.hash.Striped64.Cell[] cellArr = this.cells;
        this.base = j;
        if (cellArr != null) {
            for (com.google.common.hash.Striped64.Cell cell : cellArr) {
                if (cell != null) {
                    cell.value = j;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static sun.misc.Unsafe getUnsafe() {
        try {
            try {
                return sun.misc.Unsafe.getUnsafe();
            } catch (java.security.PrivilegedActionException e) {
                throw new java.lang.RuntimeException("Could not initialize intrinsics", e.getCause());
            }
        } catch (java.lang.SecurityException unused) {
            return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new java.security.PrivilegedExceptionAction<sun.misc.Unsafe>() { // from class: com.google.common.hash.Striped64.1
                @Override // java.security.PrivilegedExceptionAction
                public sun.misc.Unsafe run() throws java.lang.Exception {
                    for (java.lang.reflect.Field field : sun.misc.Unsafe.class.getDeclaredFields()) {
                        field.setAccessible(true);
                        java.lang.Object obj = field.get(null);
                        if (sun.misc.Unsafe.class.isInstance(obj)) {
                            return (sun.misc.Unsafe) sun.misc.Unsafe.class.cast(obj);
                        }
                    }
                    throw new java.lang.NoSuchFieldError("the Unsafe");
                }
            });
        }
    }
}
