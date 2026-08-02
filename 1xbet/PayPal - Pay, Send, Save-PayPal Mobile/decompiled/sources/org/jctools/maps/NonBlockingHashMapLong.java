package org.jctools.maps;

/* loaded from: classes18.dex */
public class NonBlockingHashMapLong<TypeV> extends java.util.AbstractMap<java.lang.Long, TypeV> implements java.util.concurrent.ConcurrentMap<java.lang.Long, TypeV>, java.io.Serializable {
    private static final org.jctools.maps.NonBlockingHashMapLong.Prime TOMBPRIME;
    private static final java.lang.Object TOMBSTONE;
    private static final long serialVersionUID = 1234123412341234124L;
    private transient org.jctools.maps.NonBlockingHashMapLong.CHM _chm;
    private transient long _last_resize_milli;
    private final boolean _opt_for_space;
    private transient java.lang.Object _val_1;
    private static final int _Obase = org.jctools.util.UnsafeAccess.UNSAFE.arrayBaseOffset(java.lang.Object[].class);
    private static final int _Oscale = org.jctools.util.UnsafeAccess.UNSAFE.arrayIndexScale(java.lang.Object[].class);
    private static final int _Lbase = org.jctools.util.UnsafeAccess.UNSAFE.arrayBaseOffset(long[].class);
    private static final int _Lscale = org.jctools.util.UnsafeAccess.UNSAFE.arrayIndexScale(long[].class);
    private static final long _chm_offset = org.jctools.util.UnsafeAccess.fieldOffset(org.jctools.maps.NonBlockingHashMapLong.class, "_chm");
    private static final long _val_1_offset = org.jctools.util.UnsafeAccess.fieldOffset(org.jctools.maps.NonBlockingHashMapLong.class, "_val_1");
    private static final java.lang.Object NO_MATCH_OLD = new java.lang.Object();
    private static final java.lang.Object MATCH_ANY = new java.lang.Object();

    /* JADX INFO: Access modifiers changed from: private */
    public static int reprobe_limit(int i) {
        return (i >> 4) + 10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public /* bridge */ /* synthetic */ java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        return put((java.lang.Long) obj, (java.lang.Long) obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public /* bridge */ /* synthetic */ java.lang.Object putIfAbsent(java.lang.Object obj, java.lang.Object obj2) {
        return putIfAbsent((java.lang.Long) obj, (java.lang.Long) obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public /* bridge */ /* synthetic */ java.lang.Object replace(java.lang.Object obj, java.lang.Object obj2) {
        return replace((java.lang.Long) obj, (java.lang.Long) obj2);
    }

    static {
        java.lang.Object obj = new java.lang.Object();
        TOMBSTONE = obj;
        TOMBPRIME = new org.jctools.maps.NonBlockingHashMapLong.Prime(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long rawIndex(java.lang.Object[] objArr, int i) {
        return _Obase + (i * _Oscale);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long rawIndex(long[] jArr, int i) {
        return _Lbase + (i * _Lscale);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean CAS(long j, java.lang.Object obj, java.lang.Object obj2) {
        return com.google.android.gms.internal.mlkit_vision_barcode.zzec$$ExternalSyntheticBackportWithForwarding0.m(org.jctools.util.UnsafeAccess.UNSAFE, this, j, obj, obj2);
    }

    static final class Prime {
        final java.lang.Object _V;

        Prime(java.lang.Object obj) {
            this._V = obj;
        }

        static java.lang.Object unbox(java.lang.Object obj) {
            return obj instanceof org.jctools.maps.NonBlockingHashMapLong.Prime ? ((org.jctools.maps.NonBlockingHashMapLong.Prime) obj)._V : obj;
        }
    }

    public final void print() {
        java.lang.System.out.println("=========");
        print_impl(-99, 0L, this._val_1);
        this._chm.print();
        java.lang.System.out.println("=========");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void print_impl(int i, long j, java.lang.Object obj) {
        java.lang.String str = obj instanceof org.jctools.maps.NonBlockingHashMapLong.Prime ? "prime_" : "";
        java.lang.Object unbox = org.jctools.maps.NonBlockingHashMapLong.Prime.unbox(obj);
        java.lang.String obj2 = unbox == TOMBSTONE ? com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TOMBSTONE : unbox.toString();
        java.io.PrintStream printStream = java.lang.System.out;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
        sb.append(i);
        sb.append("]=(");
        sb.append(j);
        sb.append(",");
        sb.append(str);
        sb.append(obj2);
        sb.append(")");
        printStream.println(sb.toString());
    }

    public NonBlockingHashMapLong() {
        this(16, true);
    }

    public NonBlockingHashMapLong(int i) {
        this(i, true);
    }

    public NonBlockingHashMapLong(boolean z) {
        this(1, z);
    }

    public NonBlockingHashMapLong(int i, boolean z) {
        this._opt_for_space = z;
        initialize(i);
    }

    private void initialize(int i) {
        org.jctools.util.RangeUtil.checkPositiveOrZero(i, "initial_sz");
        int i2 = 4;
        while ((1 << i2) < i) {
            i2++;
        }
        this._chm = new org.jctools.maps.NonBlockingHashMapLong.CHM(this, new org.jctools.maps.ConcurrentAutoTable(), i2);
        this._val_1 = TOMBSTONE;
        this._last_resize_milli = java.lang.System.currentTimeMillis();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return (this._val_1 == TOMBSTONE ? 0 : 1) + this._chm.size();
    }

    public boolean containsKey(long j) {
        return get(j) != null;
    }

    public boolean contains(java.lang.Object obj) {
        return containsValue(obj);
    }

    public TypeV put(long j, TypeV typev) {
        return putIfMatch(j, typev, NO_MATCH_OLD);
    }

    public TypeV putIfAbsent(long j, TypeV typev) {
        return putIfMatch(j, typev, TOMBSTONE);
    }

    public TypeV remove(long j) {
        return putIfMatch(j, TOMBSTONE, NO_MATCH_OLD);
    }

    public boolean remove(long j, java.lang.Object obj) {
        return putIfMatch(j, TOMBSTONE, obj) == obj;
    }

    public TypeV replace(long j, TypeV typev) {
        return putIfMatch(j, typev, MATCH_ANY);
    }

    public boolean replace(long j, TypeV typev, TypeV typev2) {
        return putIfMatch(j, typev2, typev) == typev;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TypeV putIfMatch(long j, java.lang.Object obj, java.lang.Object obj2) {
        if (obj2 == null) {
            throw null;
        }
        if (obj == null) {
            throw null;
        }
        if (j == 0) {
            TypeV typev = (TypeV) this._val_1;
            if ((obj2 == NO_MATCH_OLD || typev == obj2 || ((obj2 == MATCH_ANY && typev != TOMBSTONE) || obj2.equals(typev))) && !CAS(_val_1_offset, typev, obj)) {
                typev = (TypeV) this._val_1;
            }
            if (typev == TOMBSTONE) {
                return null;
            }
            return typev;
        }
        TypeV typev2 = (TypeV) this._chm.putIfMatch(j, obj, obj2);
        if (typev2 == TOMBSTONE) {
            return null;
        }
        return typev2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        while (!CAS(_chm_offset, this._chm, new org.jctools.maps.NonBlockingHashMapLong.CHM(this, new org.jctools.maps.ConcurrentAutoTable(), 4))) {
        }
        CAS(_val_1_offset, this._val_1, TOMBSTONE);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this._val_1) {
            return true;
        }
        for (TypeV typev : values()) {
            if (typev == obj || typev.equals(obj)) {
                return true;
            }
        }
        return false;
    }

    public final TypeV get(long j) {
        if (j == 0) {
            TypeV typev = (TypeV) this._val_1;
            if (typev == TOMBSTONE) {
                return null;
            }
            return typev;
        }
        return (TypeV) this._chm.get_impl(j);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public TypeV get(java.lang.Object obj) {
        if (obj instanceof java.lang.Long) {
            return get(((java.lang.Long) obj).longValue());
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public TypeV remove(java.lang.Object obj) {
        if (obj instanceof java.lang.Long) {
            return remove(((java.lang.Long) obj).longValue());
        }
        return null;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        return (obj instanceof java.lang.Long) && remove(((java.lang.Long) obj).longValue(), obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        return (obj instanceof java.lang.Long) && containsKey(((java.lang.Long) obj).longValue());
    }

    public TypeV putIfAbsent(java.lang.Long l, TypeV typev) {
        return putIfAbsent(l.longValue(), (long) typev);
    }

    public TypeV replace(java.lang.Long l, TypeV typev) {
        return replace(l.longValue(), (long) typev);
    }

    public TypeV put(java.lang.Long l, TypeV typev) {
        return put(l.longValue(), (long) typev);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(java.lang.Long l, TypeV typev, TypeV typev2) {
        return replace(l.longValue(), typev, typev2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void help_copy() {
        org.jctools.maps.NonBlockingHashMapLong.CHM chm = this._chm;
        if (chm._newchm == null) {
            return;
        }
        chm.help_copy_impl(false);
    }

    static final class CHM implements java.io.Serializable {
        final long[] _keys;
        final org.jctools.maps.NonBlockingHashMapLong _nbhml;
        volatile org.jctools.maps.NonBlockingHashMapLong.CHM _newchm;
        volatile long _resizers;
        private final org.jctools.maps.ConcurrentAutoTable _size;
        final java.lang.Object[] _vals;
        private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<org.jctools.maps.NonBlockingHashMapLong.CHM, org.jctools.maps.NonBlockingHashMapLong.CHM> _newchmUpdater = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(org.jctools.maps.NonBlockingHashMapLong.CHM.class, org.jctools.maps.NonBlockingHashMapLong.CHM.class, "_newchm");
        private static final java.util.concurrent.atomic.AtomicLongFieldUpdater<org.jctools.maps.NonBlockingHashMapLong.CHM> _resizerUpdater = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(org.jctools.maps.NonBlockingHashMapLong.CHM.class, "_resizers");
        private static final java.util.concurrent.atomic.AtomicLongFieldUpdater<org.jctools.maps.NonBlockingHashMapLong.CHM> _copyIdxUpdater = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(org.jctools.maps.NonBlockingHashMapLong.CHM.class, "_copyIdx");
        private static final java.util.concurrent.atomic.AtomicLongFieldUpdater<org.jctools.maps.NonBlockingHashMapLong.CHM> _copyDoneUpdater = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(org.jctools.maps.NonBlockingHashMapLong.CHM.class, "_copyDone");
        volatile long _copyIdx = 0;
        volatile long _copyDone = 0;
        private final org.jctools.maps.ConcurrentAutoTable _slots = new org.jctools.maps.ConcurrentAutoTable();

        public final int size() {
            return (int) this._size.get();
        }

        final boolean CAS_newchm(org.jctools.maps.NonBlockingHashMapLong.CHM chm) {
            return androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_newchmUpdater, this, null, chm);
        }

        private boolean CAS_key(int i, long j, long j2) {
            sun.misc.Unsafe unsafe = org.jctools.util.UnsafeAccess.UNSAFE;
            long[] jArr = this._keys;
            return unsafe.compareAndSwapLong(jArr, org.jctools.maps.NonBlockingHashMapLong.rawIndex(jArr, i), j, j2);
        }

        private boolean CAS_val(int i, java.lang.Object obj, java.lang.Object obj2) {
            sun.misc.Unsafe unsafe = org.jctools.util.UnsafeAccess.UNSAFE;
            java.lang.Object[] objArr = this._vals;
            return com.google.android.gms.internal.mlkit_vision_barcode.zzec$$ExternalSyntheticBackportWithForwarding0.m(unsafe, objArr, org.jctools.maps.NonBlockingHashMapLong.rawIndex(objArr, i), obj, obj2);
        }

        CHM(org.jctools.maps.NonBlockingHashMapLong nonBlockingHashMapLong, org.jctools.maps.ConcurrentAutoTable concurrentAutoTable, int i) {
            this._nbhml = nonBlockingHashMapLong;
            this._size = concurrentAutoTable;
            int i2 = 1 << i;
            this._keys = new long[i2];
            this._vals = new java.lang.Object[i2];
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void print() {
            org.jctools.maps.NonBlockingHashMapLong.CHM chm = this;
            while (true) {
                int i = 0;
                while (true) {
                    long[] jArr = chm._keys;
                    if (i >= jArr.length) {
                        break;
                    }
                    long j = jArr[i];
                    if (j != 0) {
                        org.jctools.maps.NonBlockingHashMapLong.print_impl(i, j, chm._vals[i]);
                    }
                    i++;
                }
                chm = chm._newchm;
                if (chm == null) {
                    return;
                } else {
                    java.lang.System.out.println("----");
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public java.lang.Object get_impl(long j) {
            org.jctools.maps.NonBlockingHashMapLong.CHM chm = this;
            while (true) {
                int length = chm._keys.length;
                int i = length - 1;
                int i2 = (int) (i & j);
                int i3 = 0;
                while (true) {
                    long j2 = chm._keys[i2];
                    java.lang.Object obj = chm._vals[i2];
                    if (j2 == 0) {
                        return null;
                    }
                    if (j != j2) {
                        i3++;
                        if (i3 < org.jctools.maps.NonBlockingHashMapLong.reprobe_limit(length)) {
                            i2 = (i2 + 1) & i;
                        } else {
                            if (chm._newchm == null) {
                                return null;
                            }
                            chm = chm.copy_slot_and_check(i2, java.lang.Long.valueOf(j));
                        }
                    } else {
                        if (!(obj instanceof org.jctools.maps.NonBlockingHashMapLong.Prime)) {
                            if (obj == org.jctools.maps.NonBlockingHashMapLong.TOMBSTONE) {
                                return null;
                            }
                            return obj;
                        }
                        chm = chm.copy_slot_and_check(i2, java.lang.Long.valueOf(j));
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
        
            if (r19 == r13) goto L77;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
        
            if (r13 != null) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
        
            if (r8.tableFull(r12, r9) != false) goto L83;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
        
            r8.resize();
            r8 = r8.copy_slot_and_check(r11, r20);
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
        
            if ((r13 instanceof org.jctools.maps.NonBlockingHashMapLong.Prime) == false) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
        
            if (r20 == org.jctools.maps.NonBlockingHashMapLong.NO_MATCH_OLD) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
        
            if (r13 == r20) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
        
            if (r20 != org.jctools.maps.NonBlockingHashMapLong.MATCH_ANY) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x007a, code lost:
        
            if (r13 == org.jctools.maps.NonBlockingHashMapLong.TOMBSTONE) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
        
            if (r13 != null) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x007e, code lost:
        
            if (r13 != null) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0084, code lost:
        
            if (r20 == org.jctools.maps.NonBlockingHashMapLong.TOMBSTONE) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:
        
            if (r20 == null) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x008c, code lost:
        
            if (r20.equals(r13) != false) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x008e, code lost:
        
            if (r13 != null) goto L67;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0094, code lost:
        
            return org.jctools.maps.NonBlockingHashMapLong.TOMBSTONE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0099, code lost:
        
            if (r8.CAS_val(r11, r13, r19) == false) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00ce, code lost:
        
            r13 = r8._vals[r11];
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00d4, code lost:
        
            if ((r13 instanceof org.jctools.maps.NonBlockingHashMapLong.Prime) == false) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00dc, code lost:
        
            r0 = org.jctools.maps.NonBlockingHashMap.DUMMY_VOLATILE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00d6, code lost:
        
            r8 = r8.copy_slot_and_check(r11, r20);
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x009b, code lost:
        
            if (r20 == null) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x009d, code lost:
        
            if (r13 == null) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00a3, code lost:
        
            if (r13 != org.jctools.maps.NonBlockingHashMapLong.TOMBSTONE) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00b0, code lost:
        
            if (r13 == null) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x00b6, code lost:
        
            if (r13 == org.jctools.maps.NonBlockingHashMapLong.TOMBSTONE) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x00bc, code lost:
        
            if (r19 != org.jctools.maps.NonBlockingHashMapLong.TOMBSTONE) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x00be, code lost:
        
            r8._size.add(-1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x00a9, code lost:
        
            if (r19 == org.jctools.maps.NonBlockingHashMapLong.TOMBSTONE) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x00ab, code lost:
        
            r8._size.add(1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x00c5, code lost:
        
            if (r13 != null) goto L67;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x00c7, code lost:
        
            if (r20 == null) goto L67;
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x00cd, code lost:
        
            return org.jctools.maps.NonBlockingHashMapLong.TOMBSTONE;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public java.lang.Object putIfMatch(long j, java.lang.Object obj, java.lang.Object obj2) {
            java.lang.Object obj3;
            org.jctools.maps.NonBlockingHashMapLong.CHM chm = this;
            loop0: while (true) {
                int length = chm._keys.length;
                int i = length - 1;
                int i2 = (int) (j & i);
                int i3 = 0;
                while (true) {
                    obj3 = chm._vals[i2];
                    long j2 = chm._keys[i2];
                    if (j2 == 0) {
                        if (obj != org.jctools.maps.NonBlockingHashMapLong.TOMBSTONE && obj2 != org.jctools.maps.NonBlockingHashMapLong.MATCH_ANY) {
                            if (chm.CAS_key(i2, 0L, j)) {
                                chm._slots.add(1L);
                                break;
                            }
                            j2 = chm._keys[i2];
                        }
                        return org.jctools.maps.NonBlockingHashMapLong.TOMBSTONE;
                    }
                    if (j2 == j) {
                        break;
                    }
                    i3++;
                    if (i3 >= org.jctools.maps.NonBlockingHashMapLong.reprobe_limit(length)) {
                        org.jctools.maps.NonBlockingHashMapLong.CHM resize = chm.resize();
                        if (obj2 != null) {
                            chm._nbhml.help_copy();
                        }
                        chm = resize;
                    } else {
                        i2 = (i2 + 1) & i;
                    }
                }
            }
            return obj3;
        }

        private final boolean tableFull(int i, int i2) {
            if (i >= 10) {
                return i >= org.jctools.maps.NonBlockingHashMapLong.reprobe_limit(i2) || this._slots.estimate_get() >= ((long) (i2 >> 1));
            }
            return false;
        }

        private final org.jctools.maps.NonBlockingHashMapLong.CHM resize() {
            int i;
            long j;
            org.jctools.maps.NonBlockingHashMapLong.CHM chm = this._newchm;
            if (chm != null) {
                return chm;
            }
            int length = this._keys.length;
            int size = size();
            if (this._nbhml._opt_for_space) {
                if (size >= (length >> 1)) {
                    i = length << 1;
                }
                i = size;
            } else {
                if (size >= (length >> 2)) {
                    i = length << 1;
                    if (size >= (length >> 1)) {
                        i = length << 2;
                    }
                }
                i = size;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (i <= length && currentTimeMillis <= this._nbhml._last_resize_milli + 10000) {
                i = length << 1;
            }
            if (i >= length) {
                length = i;
            }
            int i2 = 4;
            while ((1 << i2) < length) {
                i2++;
            }
            if (((int) r3) != ((1 << i2) << 1) + 2) {
                if (size > 805306369) {
                    throw new java.lang.RuntimeException("Table is full.");
                }
                i2 = 30;
            }
            int i3 = i2;
            do {
                j = this._resizers;
            } while (!_resizerUpdater.compareAndSet(this, j, j + 1));
            long j2 = ((((1 << i3) << 1) + 8) << 3) >> 20;
            if (j >= 2 && j2 > 0) {
                org.jctools.maps.NonBlockingHashMapLong.CHM chm2 = this._newchm;
                if (chm2 != null) {
                    return chm2;
                }
                try {
                    java.lang.Thread.sleep(j2);
                } catch (java.lang.Exception unused) {
                }
            }
            org.jctools.maps.NonBlockingHashMapLong.CHM chm3 = this._newchm;
            if (chm3 != null) {
                return chm3;
            }
            org.jctools.maps.NonBlockingHashMapLong.CHM chm4 = new org.jctools.maps.NonBlockingHashMapLong.CHM(this._nbhml, this._size, i3);
            if (this._newchm != null) {
                return this._newchm;
            }
            return !CAS_newchm(chm4) ? this._newchm : chm4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void help_copy_impl(boolean z) {
            int length = this._keys.length;
            int min = java.lang.Math.min(length, 1024);
            int i = -9999;
            int i2 = -1;
            while (true) {
                if (this._copyDone >= length) {
                    copy_check_and_promote(0);
                    return;
                }
                if (i2 == -1) {
                    long j = this._copyIdx;
                    while (true) {
                        i = (int) j;
                        if (_copyIdxUpdater.compareAndSet(this, i, i + min)) {
                            break;
                        } else {
                            j = this._copyIdx;
                        }
                    }
                    if (i >= (length << 1)) {
                        i2 = i;
                    }
                }
                int i3 = 0;
                for (int i4 = 0; i4 < min; i4++) {
                    if (copy_slot((i + i4) & (length - 1))) {
                        i3++;
                    }
                }
                if (i3 > 0) {
                    copy_check_and_promote(i3);
                }
                i += min;
                if (!z && i2 == -1) {
                    return;
                }
            }
        }

        private org.jctools.maps.NonBlockingHashMapLong.CHM copy_slot_and_check(int i, java.lang.Object obj) {
            if (copy_slot(i)) {
                copy_check_and_promote(1);
            }
            if (obj != null) {
                this._nbhml.help_copy();
            }
            return this._newchm;
        }

        private final void copy_check_and_promote(int i) {
            int length = this._keys.length;
            long j = this._copyDone;
            if (i > 0) {
                while (!_copyDoneUpdater.compareAndSet(this, j, j + i)) {
                    j = this._copyDone;
                }
            }
            if (j + i == length && this._nbhml._chm == this && this._nbhml.CAS(org.jctools.maps.NonBlockingHashMapLong._chm_offset, this, this._newchm)) {
                this._nbhml._last_resize_milli = java.lang.System.currentTimeMillis();
            }
        }

        private boolean copy_slot(int i) {
            long j;
            while (true) {
                j = this._keys[i];
                if (j != 0) {
                    break;
                }
                CAS_key(i, 0L, r0.length + i);
            }
            java.lang.Object obj = this._vals[i];
            while (true) {
                if (obj instanceof org.jctools.maps.NonBlockingHashMapLong.Prime) {
                    break;
                }
                org.jctools.maps.NonBlockingHashMapLong.Prime prime = (obj == null || obj == org.jctools.maps.NonBlockingHashMapLong.TOMBSTONE) ? org.jctools.maps.NonBlockingHashMapLong.TOMBPRIME : new org.jctools.maps.NonBlockingHashMapLong.Prime(obj);
                if (CAS_val(i, obj, prime)) {
                    if (prime == org.jctools.maps.NonBlockingHashMapLong.TOMBPRIME) {
                        return true;
                    }
                    obj = prime;
                } else {
                    obj = this._vals[i];
                }
            }
            if (obj == org.jctools.maps.NonBlockingHashMapLong.TOMBPRIME) {
                return false;
            }
            this._newchm.putIfMatch(j, ((org.jctools.maps.NonBlockingHashMapLong.Prime) obj)._V, null);
            while (obj != org.jctools.maps.NonBlockingHashMapLong.TOMBPRIME && !CAS_val(i, obj, org.jctools.maps.NonBlockingHashMapLong.TOMBPRIME)) {
                obj = this._vals[i];
            }
            return obj != org.jctools.maps.NonBlockingHashMapLong.TOMBPRIME;
        }
    }

    class SnapshotV implements java.util.Iterator<TypeV>, java.util.Enumeration<TypeV> {
        private int _idx;
        private long _nextK;
        private TypeV _nextV;
        private long _prevK;
        private TypeV _prevV;
        final org.jctools.maps.NonBlockingHashMapLong.CHM _sschm;

        public SnapshotV() {
            while (true) {
                org.jctools.maps.NonBlockingHashMapLong.CHM chm = org.jctools.maps.NonBlockingHashMapLong.this._chm;
                if (chm._newchm != null) {
                    chm.help_copy_impl(true);
                } else {
                    this._sschm = chm;
                    this._idx = -1;
                    next();
                    return;
                }
            }
        }

        int length() {
            return this._sschm._keys.length;
        }

        long key(int i) {
            return this._sschm._keys[i];
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this._nextV != null;
        }

        @Override // java.util.Iterator
        public TypeV next() {
            int i = this._idx;
            if (i != -1 && this._nextV == null) {
                throw new java.util.NoSuchElementException();
            }
            this._prevK = this._nextK;
            this._prevV = this._nextV;
            this._nextV = null;
            if (i == -1) {
                this._idx = 0;
                this._nextK = 0L;
                TypeV typev = (TypeV) org.jctools.maps.NonBlockingHashMapLong.this.get(0L);
                this._nextV = typev;
                if (typev != null) {
                    return this._prevV;
                }
            }
            while (this._idx < length()) {
                int i2 = this._idx;
                this._idx = i2 + 1;
                long key = key(i2);
                this._nextK = key;
                if (key != 0) {
                    TypeV typev2 = (TypeV) org.jctools.maps.NonBlockingHashMapLong.this.get(key);
                    this._nextV = typev2;
                    if (typev2 != null) {
                        break;
                    }
                }
            }
            return this._prevV;
        }

        public void removeKey() {
            if (this._prevV != null) {
                org.jctools.maps.NonBlockingHashMapLong.this.putIfMatch(this._prevK, org.jctools.maps.NonBlockingHashMapLong.TOMBSTONE, org.jctools.maps.NonBlockingHashMapLong.NO_MATCH_OLD);
                this._prevV = null;
                return;
            }
            throw new java.lang.IllegalStateException();
        }

        @Override // java.util.Iterator
        public void remove() {
            removeKey();
        }

        @Override // java.util.Enumeration
        public TypeV nextElement() {
            return (TypeV) next();
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return hasNext();
        }
    }

    public java.util.Enumeration<TypeV> elements() {
        return new org.jctools.maps.NonBlockingHashMapLong.SnapshotV();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Collection<TypeV> values() {
        return new java.util.AbstractCollection<TypeV>() { // from class: org.jctools.maps.NonBlockingHashMapLong.1
            @Override // java.util.AbstractCollection, java.util.Collection
            public void clear() {
                org.jctools.maps.NonBlockingHashMapLong.this.clear();
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public int size() {
                return org.jctools.maps.NonBlockingHashMapLong.this.size();
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public boolean contains(java.lang.Object obj) {
                return org.jctools.maps.NonBlockingHashMapLong.this.containsValue(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
            public java.util.Iterator<TypeV> iterator() {
                return new org.jctools.maps.NonBlockingHashMapLong.SnapshotV();
            }
        };
    }

    public class IteratorLong implements java.util.Iterator<java.lang.Long>, java.util.Enumeration<java.lang.Long> {
        private final org.jctools.maps.NonBlockingHashMapLong<TypeV>.SnapshotV _ss;

        public IteratorLong() {
            this._ss = new org.jctools.maps.NonBlockingHashMapLong.SnapshotV();
        }

        @Override // java.util.Iterator
        public void remove() {
            this._ss.removeKey();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public java.lang.Long next() {
            this._ss.next();
            return java.lang.Long.valueOf(((org.jctools.maps.NonBlockingHashMapLong.SnapshotV) this._ss)._prevK);
        }

        public long nextLong() {
            this._ss.next();
            return ((org.jctools.maps.NonBlockingHashMapLong.SnapshotV) this._ss)._prevK;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this._ss.hasNext();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Enumeration
        public java.lang.Long nextElement() {
            return next();
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return hasNext();
        }
    }

    public java.util.Enumeration<java.lang.Long> keys() {
        return new org.jctools.maps.NonBlockingHashMapLong.IteratorLong();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set<java.lang.Long> keySet() {
        return new java.util.AbstractSet<java.lang.Long>() { // from class: org.jctools.maps.NonBlockingHashMapLong.2
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public void clear() {
                org.jctools.maps.NonBlockingHashMapLong.this.clear();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return org.jctools.maps.NonBlockingHashMapLong.this.size();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(java.lang.Object obj) {
                return org.jctools.maps.NonBlockingHashMapLong.this.containsKey(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(java.lang.Object obj) {
                return org.jctools.maps.NonBlockingHashMapLong.this.remove(obj) != null;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public org.jctools.maps.NonBlockingHashMapLong<TypeV>.IteratorLong iterator() {
                return new org.jctools.maps.NonBlockingHashMapLong.IteratorLong();
            }
        };
    }

    public long[] keySetLong() {
        int size = size();
        long[] jArr = new long[size];
        org.jctools.maps.NonBlockingHashMapLong.IteratorLong iteratorLong = (org.jctools.maps.NonBlockingHashMapLong.IteratorLong) keySet().iterator();
        for (int i = 0; i < size && iteratorLong.hasNext(); i++) {
            jArr[i] = iteratorLong.nextLong();
        }
        return jArr;
    }

    class NBHMLEntry extends org.jctools.maps.AbstractEntry<java.lang.Long, TypeV> {
        NBHMLEntry(java.lang.Long l, TypeV typev) {
            super(l, typev);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Map.Entry
        public TypeV setValue(TypeV typev) {
            this._val = typev;
            return (TypeV) org.jctools.maps.NonBlockingHashMapLong.this.put((java.lang.Long) this._key, (java.lang.Long) typev);
        }
    }

    class SnapshotE implements java.util.Iterator<java.util.Map.Entry<java.lang.Long, TypeV>> {
        final org.jctools.maps.NonBlockingHashMapLong<TypeV>.SnapshotV _ss;

        public SnapshotE() {
            this._ss = new org.jctools.maps.NonBlockingHashMapLong.SnapshotV();
        }

        @Override // java.util.Iterator
        public void remove() {
            this._ss.removeKey();
        }

        @Override // java.util.Iterator
        public java.util.Map.Entry<java.lang.Long, TypeV> next() {
            this._ss.next();
            return new org.jctools.maps.NonBlockingHashMapLong.NBHMLEntry(java.lang.Long.valueOf(((org.jctools.maps.NonBlockingHashMapLong.SnapshotV) this._ss)._prevK), ((org.jctools.maps.NonBlockingHashMapLong.SnapshotV) this._ss)._prevV);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this._ss.hasNext();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set<java.util.Map.Entry<java.lang.Long, TypeV>> entrySet() {
        return new java.util.AbstractSet<java.util.Map.Entry<java.lang.Long, TypeV>>() { // from class: org.jctools.maps.NonBlockingHashMapLong.3
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public void clear() {
                org.jctools.maps.NonBlockingHashMapLong.this.clear();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return org.jctools.maps.NonBlockingHashMapLong.this.size();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(java.lang.Object obj) {
                if (!(obj instanceof java.util.Map.Entry)) {
                    return false;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                return org.jctools.maps.NonBlockingHashMapLong.this.remove(entry.getKey(), entry.getValue());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(java.lang.Object obj) {
                if (!(obj instanceof java.util.Map.Entry)) {
                    return false;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                TypeV typev = org.jctools.maps.NonBlockingHashMapLong.this.get(entry.getKey());
                return typev != null && typev.equals(entry.getValue());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public java.util.Iterator<java.util.Map.Entry<java.lang.Long, TypeV>> iterator() {
                return new org.jctools.maps.NonBlockingHashMapLong.SnapshotE();
            }
        };
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        java.util.Iterator<java.lang.Long> it = keySet().iterator();
        while (it.hasNext()) {
            long longValue = it.next().longValue();
            TypeV typev = get(longValue);
            objectOutputStream.writeLong(longValue);
            objectOutputStream.writeObject(typev);
        }
        objectOutputStream.writeLong(0L);
        objectOutputStream.writeObject(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        objectInputStream.defaultReadObject();
        initialize(16);
        while (true) {
            long readLong = objectInputStream.readLong();
            java.lang.Object readObject = objectInputStream.readObject();
            if (readLong == 0 && readObject == null) {
                return;
            } else {
                put(readLong, (long) readObject);
            }
        }
    }
}
