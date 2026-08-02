package org.jctools.maps;

/* loaded from: classes18.dex */
public class ConcurrentAutoTable implements java.io.Serializable {
    private static java.util.concurrent.atomic.AtomicReferenceFieldUpdater<org.jctools.maps.ConcurrentAutoTable, org.jctools.maps.ConcurrentAutoTable.CAT> _catUpdater = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(org.jctools.maps.ConcurrentAutoTable.class, org.jctools.maps.ConcurrentAutoTable.CAT.class, "_cat");
    private volatile org.jctools.maps.ConcurrentAutoTable.CAT _cat = new org.jctools.maps.ConcurrentAutoTable.CAT(null, 16, 0);

    public void add(long j) {
        add_if(j);
    }

    public void decrement() {
        add_if(-1L);
    }

    public void increment() {
        add_if(1L);
    }

    public void set(long j) {
        while (!CAS_cat(this._cat, new org.jctools.maps.ConcurrentAutoTable.CAT(null, 4, j))) {
        }
    }

    public long get() {
        return this._cat.sum();
    }

    public int intValue() {
        return (int) this._cat.sum();
    }

    public long longValue() {
        return this._cat.sum();
    }

    public long estimate_get() {
        return this._cat.estimate_sum();
    }

    public java.lang.String toString() {
        return this._cat.toString();
    }

    public void print() {
        this._cat.print();
    }

    public int internal_size() {
        return this._cat._t.length;
    }

    private long add_if(long j) {
        return this._cat.add_if(j, hash(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean CAS_cat(org.jctools.maps.ConcurrentAutoTable.CAT cat, org.jctools.maps.ConcurrentAutoTable.CAT cat2) {
        return androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_catUpdater, this, cat, cat2);
    }

    private static int hash() {
        return java.lang.System.identityHashCode(java.lang.Thread.currentThread()) << 3;
    }

    static class CAT implements java.io.Serializable {
        private static final int _Lbase = org.jctools.util.UnsafeAccess.UNSAFE.arrayBaseOffset(long[].class);
        private static final int _Lscale = org.jctools.util.UnsafeAccess.UNSAFE.arrayIndexScale(long[].class);
        private volatile long _fuzzy_sum_cache;
        private volatile long _fuzzy_time;
        private final org.jctools.maps.ConcurrentAutoTable.CAT _next;
        private final long[] _t;

        private static long rawIndex(long[] jArr, int i) {
            return _Lbase + (i * _Lscale);
        }

        private static boolean CAS(long[] jArr, int i, long j, long j2) {
            return org.jctools.util.UnsafeAccess.UNSAFE.compareAndSwapLong(jArr, rawIndex(jArr, i), j, j2);
        }

        CAT(org.jctools.maps.ConcurrentAutoTable.CAT cat, int i, long j) {
            this._next = cat;
            long[] jArr = new long[i];
            this._t = jArr;
            jArr[0] = j;
        }

        public long add_if(long j, int i, org.jctools.maps.ConcurrentAutoTable concurrentAutoTable) {
            long j2;
            long[] jArr = this._t;
            int length = i & (jArr.length - 1);
            long j3 = jArr[length];
            if (CAS(jArr, length, j3, j3 + j)) {
                return j3;
            }
            int i2 = 0;
            while (true) {
                j2 = jArr[length];
                if (CAS(jArr, length, j2, j2 + j)) {
                    break;
                }
                i2++;
            }
            if (i2 > 0 && jArr.length < 1048576 && concurrentAutoTable._cat == this) {
                org.jctools.maps.ConcurrentAutoTable.CAT cat = new org.jctools.maps.ConcurrentAutoTable.CAT(this, jArr.length * 2, 0L);
                while (concurrentAutoTable._cat == this && !concurrentAutoTable.CAS_cat(this, cat)) {
                }
            }
            return j2;
        }

        public long sum() {
            org.jctools.maps.ConcurrentAutoTable.CAT cat = this._next;
            long sum = cat == null ? 0L : cat.sum();
            for (long j : this._t) {
                sum += j;
            }
            return sum;
        }

        public long estimate_sum() {
            if (this._t.length <= 64) {
                return sum();
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (this._fuzzy_time != currentTimeMillis) {
                this._fuzzy_sum_cache = sum();
                this._fuzzy_time = currentTimeMillis;
            }
            return this._fuzzy_sum_cache;
        }

        public java.lang.String toString() {
            return java.lang.Long.toString(sum());
        }

        public void print() {
            long[] jArr = this._t;
            java.io.PrintStream printStream = java.lang.System.out;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
            sb.append(jArr[0]);
            printStream.print(sb.toString());
            for (int i = 1; i < jArr.length; i++) {
                java.io.PrintStream printStream2 = java.lang.System.out;
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(",");
                sb2.append(jArr[i]);
                printStream2.print(sb2.toString());
            }
            java.lang.System.out.print("]");
            org.jctools.maps.ConcurrentAutoTable.CAT cat = this._next;
            if (cat != null) {
                cat.print();
            }
        }
    }
}
