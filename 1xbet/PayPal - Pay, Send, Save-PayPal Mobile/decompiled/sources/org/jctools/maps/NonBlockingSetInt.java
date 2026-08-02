package org.jctools.maps;

/* loaded from: classes18.dex */
public class NonBlockingSetInt extends java.util.AbstractSet<java.lang.Integer> implements java.io.Serializable {
    private static final long _nbsi_offset = org.jctools.util.UnsafeAccess.fieldOffset(org.jctools.maps.NonBlockingSetInt.class, "_nbsi");
    private static final long serialVersionUID = 1234123412341234123L;
    private transient org.jctools.maps.NonBlockingSetInt.NBSI _nbsi = new org.jctools.maps.NonBlockingSetInt.NBSI(63, new org.jctools.maps.ConcurrentAutoTable(), this);

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean CAS_nbsi(org.jctools.maps.NonBlockingSetInt.NBSI nbsi, org.jctools.maps.NonBlockingSetInt.NBSI nbsi2) {
        return com.google.android.gms.internal.mlkit_vision_barcode.zzec$$ExternalSyntheticBackportWithForwarding0.m(org.jctools.util.UnsafeAccess.UNSAFE, this, _nbsi_offset, nbsi, nbsi2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(java.lang.Integer num) {
        return add(num.intValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object obj) {
        return (obj instanceof java.lang.Integer) && contains(((java.lang.Integer) obj).intValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(java.lang.Object obj) {
        return (obj instanceof java.lang.Integer) && remove(((java.lang.Integer) obj).intValue());
    }

    public boolean add(int i) {
        org.jctools.util.RangeUtil.checkPositiveOrZero(i, "i");
        return this._nbsi.add(i);
    }

    public boolean contains(int i) {
        return i >= 0 && this._nbsi.contains(i);
    }

    public boolean remove(int i) {
        return i >= 0 && this._nbsi.remove(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this._nbsi.size();
    }

    public int length() {
        return this._nbsi._bits.length << 6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        while (!CAS_nbsi(this._nbsi, new org.jctools.maps.NonBlockingSetInt.NBSI(63, new org.jctools.maps.ConcurrentAutoTable(), this))) {
        }
    }

    public void print() {
        this._nbsi.print(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator<java.lang.Integer> iterator() {
        return new org.jctools.maps.NonBlockingSetInt.iter();
    }

    class iter implements java.util.Iterator<java.lang.Integer> {
        org.jctools.maps.NonBlockingSetInt.NBSI _nbsi2;
        int _idx = -1;
        int _prev = -1;

        iter() {
            this._nbsi2 = org.jctools.maps.NonBlockingSetInt.this._nbsi;
            advance();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this._idx != -2;
        }

        private void advance() {
            do {
                this._idx++;
                while ((this._idx >> 6) >= this._nbsi2._bits.length) {
                    if (this._nbsi2._new == null) {
                        this._idx = -2;
                        return;
                    }
                    this._nbsi2 = this._nbsi2._new;
                }
            } while (!this._nbsi2.contains(this._idx));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public java.lang.Integer next() {
            int i = this._idx;
            if (i == -1) {
                throw new java.util.NoSuchElementException();
            }
            this._prev = i;
            advance();
            return java.lang.Integer.valueOf(this._prev);
        }

        @Override // java.util.Iterator
        public void remove() {
            int i = this._prev;
            if (i == -1) {
                throw new java.lang.IllegalStateException();
            }
            this._nbsi2.remove(i);
            this._prev = -1;
        }
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        int length = this._nbsi._bits.length << 6;
        objectOutputStream.writeInt(length);
        for (int i = 0; i < length; i++) {
            objectOutputStream.writeBoolean(this._nbsi.contains(i));
        }
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        this._nbsi = new org.jctools.maps.NonBlockingSetInt.NBSI(readInt, new org.jctools.maps.ConcurrentAutoTable(), this);
        for (int i = 0; i < readInt; i++) {
            if (objectInputStream.readBoolean()) {
                this._nbsi.add(i);
            }
        }
    }

    static final class NBSI {
        private static final int _Lbase = org.jctools.util.UnsafeAccess.UNSAFE.arrayBaseOffset(long[].class);
        private static final int _Lscale = org.jctools.util.UnsafeAccess.UNSAFE.arrayIndexScale(long[].class);
        private static final long _new_offset = org.jctools.util.UnsafeAccess.fieldOffset(org.jctools.maps.NonBlockingSetInt.NBSI.class, "_new");
        private final long[] _bits;
        private final transient java.util.concurrent.atomic.AtomicInteger _copyDone;
        private final transient java.util.concurrent.atomic.AtomicInteger _copyIdx;
        private final org.jctools.maps.NonBlockingSetInt.NBSI _nbsi64;
        private org.jctools.maps.NonBlockingSetInt.NBSI _new;
        private final transient org.jctools.maps.NonBlockingSetInt _non_blocking_set_int;
        private final transient org.jctools.maps.ConcurrentAutoTable _size;
        private final transient int _sum_bits_length;

        private static final long mask(int i) {
            return 1 << (i & 63);
        }

        private static long rawIndex(long[] jArr, int i) {
            return _Lbase + (i * _Lscale);
        }

        private final boolean CAS(int i, long j, long j2) {
            sun.misc.Unsafe unsafe = org.jctools.util.UnsafeAccess.UNSAFE;
            long[] jArr = this._bits;
            return unsafe.compareAndSwapLong(jArr, rawIndex(jArr, i), j, j2);
        }

        private final boolean CAS_new(org.jctools.maps.NonBlockingSetInt.NBSI nbsi) {
            return com.google.android.gms.internal.mlkit_vision_barcode.zzec$$ExternalSyntheticBackportWithForwarding0.m(org.jctools.util.UnsafeAccess.UNSAFE, this, _new_offset, null, nbsi);
        }

        private NBSI(int i, org.jctools.maps.ConcurrentAutoTable concurrentAutoTable, org.jctools.maps.NonBlockingSetInt nonBlockingSetInt) {
            this._non_blocking_set_int = nonBlockingSetInt;
            this._size = concurrentAutoTable;
            this._copyIdx = concurrentAutoTable == null ? null : new java.util.concurrent.atomic.AtomicInteger();
            this._copyDone = concurrentAutoTable == null ? null : new java.util.concurrent.atomic.AtomicInteger();
            int i2 = (int) ((i + 63) >>> 6);
            this._bits = new long[i2];
            int i3 = (i + 1) >>> 6;
            org.jctools.maps.NonBlockingSetInt.NBSI nbsi = i3 != 0 ? new org.jctools.maps.NonBlockingSetInt.NBSI(i3, null, null) : null;
            this._nbsi64 = nbsi;
            this._sum_bits_length = i2 + (nbsi == null ? 0 : nbsi._sum_bits_length);
        }

        public final boolean add(int i) {
            int i2;
            long j;
            org.jctools.maps.NonBlockingSetInt.NBSI nbsi = this;
            while (true) {
                if ((i >> 6) >= nbsi._bits.length) {
                    nbsi = nbsi.install_larger_new_bits(i).help_copy();
                } else {
                    int i3 = i;
                    org.jctools.maps.NonBlockingSetInt.NBSI nbsi2 = nbsi;
                    while ((i3 & 63) == 63) {
                        nbsi2 = nbsi2._nbsi64;
                        i3 >>= 6;
                    }
                    long mask = mask(i3);
                    do {
                        i2 = i3 >> 6;
                        j = nbsi2._bits[i2];
                        if (j < 0) {
                            nbsi = nbsi.help_copy_impl(i).help_copy();
                        } else {
                            if ((j & mask) != 0) {
                                return false;
                            }
                        }
                    } while (!nbsi2.CAS(i2, j, j | mask));
                    nbsi._size.add(1L);
                    return true;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x003a, code lost:
        
            r1 = r1.help_copy_impl(r17).help_copy();
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean remove(int i) {
            int i2;
            long j;
            org.jctools.maps.NonBlockingSetInt.NBSI nbsi = this;
            while ((i >> 6) < nbsi._bits.length) {
                int i3 = i;
                org.jctools.maps.NonBlockingSetInt.NBSI nbsi2 = nbsi;
                while ((i3 & 63) == 63) {
                    nbsi2 = nbsi2._nbsi64;
                    i3 >>= 6;
                }
                long mask = mask(i3);
                do {
                    i2 = i3 >> 6;
                    j = nbsi2._bits[i2];
                    if (j < 0) {
                        break;
                    }
                    if ((j & mask) == 0) {
                        return false;
                    }
                } while (!nbsi2.CAS(i2, j, (~mask) & j));
                nbsi._size.add(-1L);
                return true;
            }
            return nbsi._new != null && nbsi.help_copy().remove(i);
        }

        public final boolean contains(int i) {
            org.jctools.maps.NonBlockingSetInt.NBSI nbsi = this;
            while ((i >> 6) < nbsi._bits.length) {
                int i2 = i;
                org.jctools.maps.NonBlockingSetInt.NBSI nbsi2 = nbsi;
                while ((i2 & 63) == 63) {
                    nbsi2 = nbsi2._nbsi64;
                    i2 >>= 6;
                }
                long mask = mask(i2);
                long j = nbsi2._bits[i2 >> 6];
                if (j >= 0) {
                    return (j & mask) != 0;
                }
                nbsi = nbsi.help_copy_impl(i).help_copy();
            }
            return nbsi._new != null && nbsi.help_copy().contains(i);
        }

        public final int size() {
            return (int) this._size.get();
        }

        private org.jctools.maps.NonBlockingSetInt.NBSI install_larger_new_bits(int i) {
            if (this._new == null) {
                CAS_new(new org.jctools.maps.NonBlockingSetInt.NBSI(this._bits.length << 7, this._size, this._non_blocking_set_int));
            }
            return this;
        }

        private org.jctools.maps.NonBlockingSetInt.NBSI help_copy() {
            org.jctools.maps.NonBlockingSetInt.NBSI nbsi = this._non_blocking_set_int._nbsi;
            int andAdd = nbsi._copyIdx.getAndAdd(512);
            for (int i = 0; i < 8; i++) {
                int length = ((i * 64) + andAdd) % (nbsi._bits.length << 6);
                nbsi.help_copy_impl(length);
                nbsi.help_copy_impl(length + 63);
            }
            if (nbsi._copyDone.get() == nbsi._sum_bits_length) {
                this._non_blocking_set_int.CAS_nbsi(nbsi, nbsi._new);
            }
            return this._new;
        }

        private org.jctools.maps.NonBlockingSetInt.NBSI help_copy_impl(int i) {
            long j;
            org.jctools.maps.NonBlockingSetInt.NBSI nbsi = this._new;
            if (nbsi != null) {
                org.jctools.maps.NonBlockingSetInt.NBSI nbsi2 = this;
                org.jctools.maps.NonBlockingSetInt.NBSI nbsi3 = nbsi;
                int i2 = i;
                while ((i2 & 63) == 63) {
                    nbsi2 = nbsi2._nbsi64;
                    nbsi3 = nbsi3._nbsi64;
                    i2 >>= 6;
                }
                int i3 = i2 >> 6;
                long j2 = nbsi2._bits[i3];
                while (true) {
                    if (j2 < 0) {
                        j = j2;
                        break;
                    }
                    j = mask(63) | j2;
                    if (!nbsi2.CAS(i3, j2, j)) {
                        j2 = nbsi2._bits[i3];
                    } else if (j2 == 0) {
                        this._copyDone.addAndGet(1);
                    }
                }
                if (j != mask(63)) {
                    if (nbsi3._bits[i3] == 0) {
                        if (!nbsi3.CAS(i3, 0L, j & (~mask(63)))) {
                            long j3 = nbsi3._bits[i3];
                        }
                    }
                    if (nbsi2.CAS(i3, j, mask(63))) {
                        this._copyDone.addAndGet(1);
                    }
                }
            }
            return this;
        }

        private void print(int i, java.lang.String str) {
            for (int i2 = 0; i2 < i; i2++) {
                java.lang.System.out.print("  ");
            }
            java.lang.System.out.println(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void print(int i) {
            org.jctools.maps.NonBlockingSetInt.NBSI nbsi = this;
            while (true) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("NBSI - _bits.len=");
                for (org.jctools.maps.NonBlockingSetInt.NBSI nbsi2 = nbsi; nbsi2 != null; nbsi2 = nbsi2._nbsi64) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder(" ");
                    sb2.append(nbsi2._bits.length);
                    sb.append(sb2.toString());
                }
                nbsi.print(i, sb.toString());
                org.jctools.maps.NonBlockingSetInt.NBSI nbsi3 = nbsi;
                while (nbsi3 != null) {
                    for (int i2 = 0; i2 < nbsi3._bits.length; i2++) {
                        java.io.PrintStream printStream = java.lang.System.out;
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                        sb3.append(java.lang.Long.toHexString(nbsi3._bits[i2]));
                        sb3.append(" ");
                        printStream.print(sb3.toString());
                    }
                    nbsi3 = nbsi3._nbsi64;
                    java.lang.System.out.println();
                }
                if (nbsi._copyIdx.get() != 0 || nbsi._copyDone.get() != 0) {
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder("_copyIdx=");
                    sb4.append(nbsi._copyIdx.get());
                    sb4.append(" _copyDone=");
                    sb4.append(nbsi._copyDone.get());
                    sb4.append(" _words_to_cpy=");
                    sb4.append(nbsi._sum_bits_length);
                    nbsi.print(i, sb4.toString());
                }
                if (nbsi._new == null) {
                    return;
                }
                nbsi.print(i, "__has_new - ");
                nbsi = nbsi._new;
                i++;
            }
        }
    }
}
