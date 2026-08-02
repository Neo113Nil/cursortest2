package org.jctools.maps;

/* loaded from: classes18.dex */
public class NonBlockingHashMap<TypeK, TypeV> extends java.util.AbstractMap<TypeK, TypeV> implements java.util.concurrent.ConcurrentMap<TypeK, TypeV>, java.lang.Cloneable, java.io.Serializable {
    static volatile int DUMMY_VOLATILE = 0;
    private static final java.lang.Object MATCH_ANY;
    private static final java.lang.Object NO_MATCH_OLD;
    private static final org.jctools.maps.NonBlockingHashMap.Prime TOMBPRIME;
    public static final java.lang.Object TOMBSTONE;
    private static final int _Obase = org.jctools.util.UnsafeAccess.UNSAFE.arrayBaseOffset(java.lang.Object[].class);
    private static final int _Olog;
    private static final int _Oscale;
    private static final long _kvs_offset;
    private static final long serialVersionUID = 1234123412341234123L;
    private transient java.lang.Object[] _kvs;
    private transient long _last_resize_milli;
    private transient org.jctools.maps.ConcurrentAutoTable _reprobes;

    /* JADX INFO: Access modifiers changed from: private */
    public static int reprobe_limit(int i) {
        return (i >> 4) + 10;
    }

    protected void rehash() {
    }

    static {
        int arrayIndexScale = org.jctools.util.UnsafeAccess.UNSAFE.arrayIndexScale(java.lang.Object[].class);
        _Oscale = arrayIndexScale;
        _Olog = arrayIndexScale == 4 ? 2 : arrayIndexScale == 8 ? 3 : org.threeten.bp.chrono.HijrahDate.MAX_VALUE_OF_ERA;
        _kvs_offset = org.jctools.util.UnsafeAccess.fieldOffset(org.jctools.maps.NonBlockingHashMap.class, "_kvs");
        NO_MATCH_OLD = new java.lang.Object();
        MATCH_ANY = new java.lang.Object();
        java.lang.Object obj = new java.lang.Object();
        TOMBSTONE = obj;
        TOMBPRIME = new org.jctools.maps.NonBlockingHashMap.Prime(obj);
    }

    private static long rawIndex(java.lang.Object[] objArr, int i) {
        return _Obase + (i << _Olog);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean CAS_kvs(java.lang.Object[] objArr, java.lang.Object[] objArr2) {
        return com.google.android.gms.internal.mlkit_vision_barcode.zzec$$ExternalSyntheticBackportWithForwarding0.m(org.jctools.util.UnsafeAccess.UNSAFE, this, _kvs_offset, objArr, objArr2);
    }

    static final class Prime {
        final java.lang.Object _V;

        Prime(java.lang.Object obj) {
            this._V = obj;
        }

        static java.lang.Object unbox(java.lang.Object obj) {
            return obj instanceof org.jctools.maps.NonBlockingHashMap.Prime ? ((org.jctools.maps.NonBlockingHashMap.Prime) obj)._V : obj;
        }
    }

    private static final int hash(java.lang.Object obj) {
        int hashCode = obj.hashCode();
        int i = hashCode ^ ((hashCode >>> 20) ^ (hashCode >>> 12));
        int i2 = i ^ ((i >>> 7) ^ (i >>> 4));
        return i2 + (i2 << 7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final org.jctools.maps.NonBlockingHashMap.CHM chm(java.lang.Object[] objArr) {
        return (org.jctools.maps.NonBlockingHashMap.CHM) objArr[0];
    }

    private static final int[] hashes(java.lang.Object[] objArr) {
        return (int[]) objArr[1];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int len(java.lang.Object[] objArr) {
        return (objArr.length - 2) >> 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object key(java.lang.Object[] objArr, int i) {
        return objArr[(i << 1) + 2];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object val(java.lang.Object[] objArr, int i) {
        return objArr[(i << 1) + 3];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CAS_key(java.lang.Object[] objArr, int i, java.lang.Object obj, java.lang.Object obj2) {
        return com.google.android.gms.internal.mlkit_vision_barcode.zzec$$ExternalSyntheticBackportWithForwarding0.m(org.jctools.util.UnsafeAccess.UNSAFE, objArr, rawIndex(objArr, (i << 1) + 2), obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CAS_val(java.lang.Object[] objArr, int i, java.lang.Object obj, java.lang.Object obj2) {
        return com.google.android.gms.internal.mlkit_vision_barcode.zzec$$ExternalSyntheticBackportWithForwarding0.m(org.jctools.util.UnsafeAccess.UNSAFE, objArr, rawIndex(objArr, (i << 1) + 3), obj, obj2);
    }

    public final void print() {
        java.lang.System.out.println("=========");
        print2(this._kvs);
        java.lang.System.out.println("=========");
    }

    private final void print2(java.lang.Object[] objArr) {
        java.lang.Object obj;
        while (true) {
            for (int i = 0; i < len(objArr); i++) {
                java.lang.Object key = key(objArr, i);
                java.lang.Object val = val(objArr, i);
                java.lang.Object unbox = org.jctools.maps.NonBlockingHashMap.Prime.unbox(val);
                if (key != null && key != (obj = TOMBSTONE) && val != null && unbox != obj) {
                    java.lang.String str = val == unbox ? "" : "prime_";
                    java.io.PrintStream printStream = java.lang.System.out;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("");
                    sb.append(i);
                    sb.append(" (");
                    sb.append(key);
                    sb.append(",");
                    sb.append(str);
                    sb.append(val);
                    sb.append(")");
                    printStream.println(sb.toString());
                }
            }
            objArr = chm(objArr)._newkvs;
            if (objArr == null) {
                return;
            } else {
                java.lang.System.out.println("----");
            }
        }
    }

    public long reprobes() {
        long j = this._reprobes.get();
        this._reprobes = new org.jctools.maps.ConcurrentAutoTable();
        return j;
    }

    public NonBlockingHashMap() {
        this(8);
    }

    public NonBlockingHashMap(int i) {
        this._reprobes = new org.jctools.maps.ConcurrentAutoTable();
        initialize(i);
    }

    private final void initialize(int i) {
        org.jctools.util.RangeUtil.checkPositiveOrZero(i, "initial_sz");
        if (i > 1048576) {
            i = 1048576;
        }
        int i2 = 3;
        while (true) {
            int i3 = 1 << i2;
            if (i3 >= (i << 2)) {
                java.lang.Object[] objArr = new java.lang.Object[(i3 << 1) + 2];
                this._kvs = objArr;
                objArr[0] = new org.jctools.maps.NonBlockingHashMap.CHM(new org.jctools.maps.ConcurrentAutoTable());
                this._kvs[1] = new int[i3];
                this._last_resize_milli = java.lang.System.currentTimeMillis();
                return;
            }
            i2++;
        }
    }

    protected final void initialize() {
        initialize(8);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return chm(this._kvs).size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        return get(obj) != null;
    }

    public boolean contains(java.lang.Object obj) {
        return containsValue(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public TypeV put(TypeK typek, TypeV typev) {
        return putIfMatch(typek, typev, NO_MATCH_OLD);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public TypeV putIfAbsent(TypeK typek, TypeV typev) {
        return putIfMatch(typek, typev, TOMBSTONE);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public TypeV remove(java.lang.Object obj) {
        return putIfMatch(obj, TOMBSTONE, NO_MATCH_OLD);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        return objectsEquals(putIfMatch(obj, TOMBSTONE, obj2), obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public TypeV replace(TypeK typek, TypeV typev) {
        return putIfMatch(typek, typev, MATCH_ANY);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(TypeK typek, TypeV typev, TypeV typev2) {
        return objectsEquals(putIfMatch(typek, typev2, typev), typev);
    }

    private static boolean objectsEquals(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public final TypeV putIfMatchAllowNull(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        if (obj3 == null) {
            obj3 = TOMBSTONE;
        }
        if (obj2 == null) {
            obj2 = TOMBSTONE;
        }
        TypeV typev = (TypeV) putIfMatch0(this, this._kvs, obj, obj2, obj3);
        if (typev == TOMBSTONE) {
            return null;
        }
        return typev;
    }

    public final TypeV putIfMatch(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        if (obj3 == null) {
            throw null;
        }
        if (obj2 == null) {
            throw null;
        }
        TypeV typev = (TypeV) putIfMatch0(this, this._kvs, obj, obj2, obj3);
        if (typev == TOMBSTONE) {
            return null;
        }
        return typev;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(java.util.Map<? extends TypeK, ? extends TypeV> map) {
        for (java.util.Map.Entry<? extends TypeK, ? extends TypeV> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        while (!CAS_kvs(this._kvs, new org.jctools.maps.NonBlockingHashMap(8)._kvs)) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(java.lang.Object obj) {
        for (TypeV typev : values()) {
            if (typev == obj || typev.equals(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap
    public java.lang.Object clone() {
        try {
            org.jctools.maps.NonBlockingHashMap nonBlockingHashMap = (org.jctools.maps.NonBlockingHashMap) super.clone();
            nonBlockingHashMap.clear();
            for (TypeK typek : keySet()) {
                nonBlockingHashMap.put(typek, get(typek));
            }
            return nonBlockingHashMap;
        } catch (java.lang.CloneNotSupportedException unused) {
            throw new java.lang.InternalError();
        }
    }

    @Override // java.util.AbstractMap
    public java.lang.String toString() {
        java.util.Iterator<java.util.Map.Entry<TypeK, TypeV>> it = entrySet().iterator();
        if (!it.hasNext()) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{");
        while (true) {
            java.util.Map.Entry<TypeK, TypeV> next = it.next();
            java.lang.Object key = next.getKey();
            java.lang.Object value = next.getValue();
            if (key == this) {
                key = "(this Map)";
            }
            sb.append(key);
            sb.append('=');
            if (value == this) {
                value = "(this Map)";
            }
            sb.append(value);
            if (!it.hasNext()) {
                sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
                return sb.toString();
            }
            sb.append(", ");
        }
    }

    private static boolean keyeq(java.lang.Object obj, java.lang.Object obj2, int[] iArr, int i, int i2) {
        if (obj == obj2) {
            return true;
        }
        int i3 = iArr[i];
        return (i3 == 0 || i3 == i2) && obj != TOMBSTONE && obj2.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public TypeV get(java.lang.Object obj) {
        return (TypeV) get_impl(this, this._kvs, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        if (r10 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        r13 = r12.help_copy(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final java.lang.Object get_impl(org.jctools.maps.NonBlockingHashMap nonBlockingHashMap, java.lang.Object[] objArr, java.lang.Object obj) {
        while (true) {
            int hash = hash(obj);
            int len = len(objArr);
            org.jctools.maps.NonBlockingHashMap.CHM chm = chm(objArr);
            int[] hashes = hashes(objArr);
            int i = len - 1;
            int i2 = hash & i;
            int i3 = 0;
            while (true) {
                java.lang.Object key = key(objArr, i2);
                java.lang.Object val = val(objArr, i2);
                if (key == null) {
                    return null;
                }
                java.lang.Object[] objArr2 = chm._newkvs;
                if (keyeq(key, obj, hashes, i2, hash)) {
                    if (!(val instanceof org.jctools.maps.NonBlockingHashMap.Prime)) {
                        if (val == TOMBSTONE) {
                            return null;
                        }
                        return val;
                    }
                    objArr = chm.copy_slot_and_check(nonBlockingHashMap, objArr, i2, obj);
                } else {
                    i3++;
                    if (i3 >= reprobe_limit(len) || key == TOMBSTONE) {
                        break;
                    }
                    i2 = (i2 + 1) & i;
                }
            }
        }
    }

    public TypeK getk(TypeK typek) {
        return (TypeK) getk_impl(this, this._kvs, typek);
    }

    private static final java.lang.Object getk_impl(org.jctools.maps.NonBlockingHashMap nonBlockingHashMap, java.lang.Object[] objArr, java.lang.Object obj) {
        java.lang.Object[] objArr2;
        while (true) {
            int hash = hash(obj);
            int len = len(objArr);
            org.jctools.maps.NonBlockingHashMap.CHM chm = chm(objArr);
            int[] hashes = hashes(objArr);
            int i = len - 1;
            int i2 = hash & i;
            int i3 = 0;
            while (true) {
                java.lang.Object key = key(objArr, i2);
                if (key == null) {
                    return null;
                }
                objArr2 = chm._newkvs;
                if (keyeq(key, obj, hashes, i2, hash)) {
                    return key;
                }
                i3++;
                if (i3 >= reprobe_limit(len) || key == TOMBSTONE) {
                    break;
                }
                i2 = (i2 + 1) & i;
            }
            if (objArr2 == null) {
                return null;
            }
            objArr = nonBlockingHashMap.help_copy(objArr2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00f1, code lost:
    
        r4 = r7.resize(r17, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00f5, code lost:
    
        if (r21 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00f7, code lost:
    
        r17.help_copy(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0091, code lost:
    
        if (r14 != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0095, code lost:
    
        return org.jctools.maps.NonBlockingHashMap.TOMBSTONE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x004b, code lost:
    
        return r15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object putIfMatch0(org.jctools.maps.NonBlockingHashMap nonBlockingHashMap, java.lang.Object[] objArr, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.Object val;
        int i;
        java.lang.Object obj4;
        java.lang.Object[] objArr2 = objArr;
        loop0: while (true) {
            int hash = hash(obj);
            int len = len(objArr2);
            org.jctools.maps.NonBlockingHashMap.CHM chm = chm(objArr2);
            int[] hashes = hashes(objArr2);
            int i2 = len - 1;
            int i3 = hash & i2;
            int i4 = 0;
            java.lang.Object[] objArr3 = null;
            while (true) {
                val = val(objArr2, i3);
                java.lang.Object key = key(objArr2, i3);
                i = i4;
                if (key == null) {
                    java.lang.Object obj5 = TOMBSTONE;
                    if (obj2 == obj5 || obj3 == MATCH_ANY) {
                        break loop0;
                    }
                    if (CAS_key(objArr2, i3, null, obj)) {
                        chm._slots.add(1L);
                        hashes[i3] = hash;
                        break;
                    }
                    i4 = i;
                } else {
                    objArr3 = chm._newkvs;
                    if (keyeq(key, obj, hashes, i3, hash)) {
                        break;
                    }
                    i4 = i + 1;
                    if (i4 >= reprobe_limit(len) || key == TOMBSTONE) {
                        break;
                    }
                    i3 = (i3 + 1) & i2;
                }
            }
            while (true) {
                if (obj2 == val) {
                    break loop0;
                }
                int i5 = i;
                if (objArr3 == null && ((val == null && chm.tableFull(i5, len)) || (val instanceof org.jctools.maps.NonBlockingHashMap.Prime))) {
                    objArr3 = chm.resize(nonBlockingHashMap, objArr2);
                }
                if (objArr3 == null) {
                    if (obj3 == NO_MATCH_OLD || val == obj3 || ((obj3 == MATCH_ANY && val != TOMBSTONE && val != null) || ((val == null && obj3 == TOMBSTONE) || (obj3 != null && obj3.equals(val))))) {
                        if (CAS_val(objArr2, i3, val, obj2)) {
                            if (obj3 != null) {
                                if ((val == null || val == TOMBSTONE) && obj2 != TOMBSTONE) {
                                    chm._size.add(1L);
                                }
                                if (val != null && val != (obj4 = TOMBSTONE) && obj2 == obj4) {
                                    chm._size.add(-1L);
                                }
                            }
                            if (val == null && obj3 != null) {
                                return TOMBSTONE;
                            }
                        } else {
                            val = val(objArr2, i3);
                            if (val instanceof org.jctools.maps.NonBlockingHashMap.Prime) {
                                objArr2 = chm.copy_slot_and_check(nonBlockingHashMap, objArr2, i3, obj3);
                                break;
                            }
                            i = i5;
                        }
                    }
                } else {
                    objArr2 = chm.copy_slot_and_check(nonBlockingHashMap, objArr2, i3, obj3);
                    break;
                }
            }
        }
        return val;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object[] help_copy(java.lang.Object[] objArr) {
        java.lang.Object[] objArr2 = this._kvs;
        org.jctools.maps.NonBlockingHashMap.CHM chm = chm(objArr2);
        if (chm._newkvs == null) {
            return objArr;
        }
        chm.help_copy_impl(this, objArr2, false);
        return objArr;
    }

    static final class CHM<TypeK, TypeV> {
        volatile java.lang.Object[] _newkvs;
        volatile long _resizers;
        private final org.jctools.maps.ConcurrentAutoTable _size;
        private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<org.jctools.maps.NonBlockingHashMap.CHM, java.lang.Object[]> _newkvsUpdater = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(org.jctools.maps.NonBlockingHashMap.CHM.class, java.lang.Object[].class, "_newkvs");
        private static final java.util.concurrent.atomic.AtomicLongFieldUpdater<org.jctools.maps.NonBlockingHashMap.CHM> _resizerUpdater = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(org.jctools.maps.NonBlockingHashMap.CHM.class, "_resizers");
        private static final java.util.concurrent.atomic.AtomicLongFieldUpdater<org.jctools.maps.NonBlockingHashMap.CHM> _copyIdxUpdater = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(org.jctools.maps.NonBlockingHashMap.CHM.class, "_copyIdx");
        private static final java.util.concurrent.atomic.AtomicLongFieldUpdater<org.jctools.maps.NonBlockingHashMap.CHM> _copyDoneUpdater = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(org.jctools.maps.NonBlockingHashMap.CHM.class, "_copyDone");
        volatile long _copyIdx = 0;
        volatile long _copyDone = 0;
        private final org.jctools.maps.ConcurrentAutoTable _slots = new org.jctools.maps.ConcurrentAutoTable();

        public final int size() {
            return (int) this._size.get();
        }

        final boolean CAS_newkvs(java.lang.Object[] objArr) {
            while (this._newkvs == null) {
                if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_newkvsUpdater, this, null, objArr)) {
                    return true;
                }
            }
            return false;
        }

        CHM(org.jctools.maps.ConcurrentAutoTable concurrentAutoTable) {
            this._size = concurrentAutoTable;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean tableFull(int i, int i2) {
            if (i >= 10) {
                return i >= org.jctools.maps.NonBlockingHashMap.reprobe_limit(i2) || this._slots.estimate_get() >= ((long) (i2 >> 1));
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final java.lang.Object[] resize(org.jctools.maps.NonBlockingHashMap nonBlockingHashMap, java.lang.Object[] objArr) {
            int i;
            long j;
            java.lang.Object[] objArr2 = this._newkvs;
            if (objArr2 != null) {
                return objArr2;
            }
            int len = org.jctools.maps.NonBlockingHashMap.len(objArr);
            int size = size();
            if (size >= (len >> 2)) {
                i = len << 1;
                if (size * 4 >= ((len >> 20) != 0 ? 3L : 2L) * len) {
                    i = len << 2;
                }
            } else {
                i = size;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (i <= len && currentTimeMillis <= nonBlockingHashMap._last_resize_milli + 10000) {
                i = len << 1;
            }
            if (i >= len) {
                len = i;
            }
            int i2 = 3;
            while ((1 << i2) < len) {
                i2++;
            }
            long j2 = ((1 << i2) << 1) + 2;
            if (((int) j2) != j2) {
                if (size > 805306369) {
                    throw new java.lang.RuntimeException("Table is full.");
                }
                i2 = 30;
                j2 = 1073741826;
            }
            int i3 = i2;
            long j3 = j2;
            do {
                j = this._resizers;
            } while (!_resizerUpdater.compareAndSet(this, j, j + 1));
            long j4 = ((((1 << i3) << 1) + 8) << 3) >> 20;
            if (j >= 2 && j4 > 0) {
                java.lang.Object[] objArr3 = this._newkvs;
                if (objArr3 != null) {
                    return objArr3;
                }
                try {
                    java.lang.Thread.sleep(j4);
                } catch (java.lang.Exception unused) {
                }
            }
            java.lang.Object[] objArr4 = this._newkvs;
            if (objArr4 != null) {
                return objArr4;
            }
            java.lang.Object[] objArr5 = new java.lang.Object[(int) j3];
            objArr5[0] = new org.jctools.maps.NonBlockingHashMap.CHM(this._size);
            objArr5[1] = new int[1 << i3];
            if (this._newkvs != null) {
                return this._newkvs;
            }
            if (CAS_newkvs(objArr5)) {
                nonBlockingHashMap.rehash();
                return objArr5;
            }
            return this._newkvs;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void help_copy_impl(org.jctools.maps.NonBlockingHashMap nonBlockingHashMap, java.lang.Object[] objArr, boolean z) {
            java.lang.Object[] objArr2 = this._newkvs;
            int len = org.jctools.maps.NonBlockingHashMap.len(objArr);
            int min = java.lang.Math.min(len, 1024);
            int i = -9999;
            int i2 = -1;
            while (true) {
                if (this._copyDone >= len) {
                    copy_check_and_promote(nonBlockingHashMap, objArr, 0);
                    return;
                }
                if (i2 == -1) {
                    int i3 = (int) this._copyIdx;
                    while (!_copyIdxUpdater.compareAndSet(this, i3, i3 + min)) {
                        i3 = (int) this._copyIdx;
                    }
                    if (i3 >= (len << 1)) {
                        i = i3;
                        i2 = i;
                    } else {
                        i = i3;
                    }
                }
                int i4 = 0;
                for (int i5 = 0; i5 < min; i5++) {
                    if (copy_slot(nonBlockingHashMap, (i + i5) & (len - 1), objArr, objArr2)) {
                        i4++;
                    }
                }
                if (i4 > 0) {
                    copy_check_and_promote(nonBlockingHashMap, objArr, i4);
                }
                i += min;
                if (!z && i2 == -1) {
                    return;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final java.lang.Object[] copy_slot_and_check(org.jctools.maps.NonBlockingHashMap nonBlockingHashMap, java.lang.Object[] objArr, int i, java.lang.Object obj) {
            java.lang.Object[] objArr2 = this._newkvs;
            if (copy_slot(nonBlockingHashMap, i, objArr, this._newkvs)) {
                copy_check_and_promote(nonBlockingHashMap, objArr, 1);
            }
            return obj == null ? objArr2 : nonBlockingHashMap.help_copy(objArr2);
        }

        private final void copy_check_and_promote(org.jctools.maps.NonBlockingHashMap nonBlockingHashMap, java.lang.Object[] objArr, int i) {
            int len = org.jctools.maps.NonBlockingHashMap.len(objArr);
            long j = this._copyDone;
            if (i > 0) {
                while (!_copyDoneUpdater.compareAndSet(this, j, j + i)) {
                    j = this._copyDone;
                }
            }
            if (j + i == len && nonBlockingHashMap._kvs == objArr && nonBlockingHashMap.CAS_kvs(objArr, this._newkvs)) {
                nonBlockingHashMap._last_resize_milli = java.lang.System.currentTimeMillis();
            }
        }

        private boolean copy_slot(org.jctools.maps.NonBlockingHashMap nonBlockingHashMap, int i, java.lang.Object[] objArr, java.lang.Object[] objArr2) {
            java.lang.Object key;
            while (true) {
                key = org.jctools.maps.NonBlockingHashMap.key(objArr, i);
                if (key != null) {
                    break;
                }
                org.jctools.maps.NonBlockingHashMap.CAS_key(objArr, i, null, org.jctools.maps.NonBlockingHashMap.TOMBSTONE);
            }
            java.lang.Object val = org.jctools.maps.NonBlockingHashMap.val(objArr, i);
            while (true) {
                if (val instanceof org.jctools.maps.NonBlockingHashMap.Prime) {
                    break;
                }
                org.jctools.maps.NonBlockingHashMap.Prime prime = (val == null || val == org.jctools.maps.NonBlockingHashMap.TOMBSTONE) ? org.jctools.maps.NonBlockingHashMap.TOMBPRIME : new org.jctools.maps.NonBlockingHashMap.Prime(val);
                if (org.jctools.maps.NonBlockingHashMap.CAS_val(objArr, i, val, prime)) {
                    if (prime == org.jctools.maps.NonBlockingHashMap.TOMBPRIME) {
                        return true;
                    }
                    val = prime;
                } else {
                    val = org.jctools.maps.NonBlockingHashMap.val(objArr, i);
                }
            }
            if (val == org.jctools.maps.NonBlockingHashMap.TOMBPRIME) {
                return false;
            }
            org.jctools.maps.NonBlockingHashMap.putIfMatch0(nonBlockingHashMap, objArr2, key, ((org.jctools.maps.NonBlockingHashMap.Prime) val)._V, null);
            while (val != org.jctools.maps.NonBlockingHashMap.TOMBPRIME && !org.jctools.maps.NonBlockingHashMap.CAS_val(objArr, i, val, org.jctools.maps.NonBlockingHashMap.TOMBPRIME)) {
                val = org.jctools.maps.NonBlockingHashMap.val(objArr, i);
            }
            return val != org.jctools.maps.NonBlockingHashMap.TOMBPRIME;
        }
    }

    class SnapshotV implements java.util.Iterator<TypeV>, java.util.Enumeration<TypeV> {
        private int _idx;
        private java.lang.Object _nextK;
        private TypeV _nextV;
        private java.lang.Object _prevK;
        private TypeV _prevV;
        final java.lang.Object[] _sskvs;

        public SnapshotV() {
            while (true) {
                java.lang.Object[] objArr = org.jctools.maps.NonBlockingHashMap.this._kvs;
                org.jctools.maps.NonBlockingHashMap.CHM chm = org.jctools.maps.NonBlockingHashMap.chm(objArr);
                if (chm._newkvs != null) {
                    chm.help_copy_impl(org.jctools.maps.NonBlockingHashMap.this, objArr, true);
                } else {
                    this._sskvs = objArr;
                    next();
                    return;
                }
            }
        }

        int length() {
            return org.jctools.maps.NonBlockingHashMap.len(this._sskvs);
        }

        java.lang.Object key(int i) {
            return org.jctools.maps.NonBlockingHashMap.key(this._sskvs, i);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this._nextV != null;
        }

        @Override // java.util.Iterator
        public TypeV next() {
            if (this._idx != 0 && this._nextV == null) {
                throw new java.util.NoSuchElementException();
            }
            this._prevK = this._nextK;
            this._prevV = this._nextV;
            this._nextV = null;
            while (this._idx < length()) {
                int i = this._idx;
                this._idx = i + 1;
                java.lang.Object key = key(i);
                this._nextK = key;
                if (key != null && key != org.jctools.maps.NonBlockingHashMap.TOMBSTONE) {
                    TypeV typev = org.jctools.maps.NonBlockingHashMap.this.get(this._nextK);
                    this._nextV = typev;
                    if (typev != null) {
                        break;
                    }
                }
            }
            return this._prevV;
        }

        public void removeKey() {
            if (this._prevV != null) {
                org.jctools.maps.NonBlockingHashMap.this.putIfMatch(this._prevK, org.jctools.maps.NonBlockingHashMap.TOMBSTONE, org.jctools.maps.NonBlockingHashMap.NO_MATCH_OLD);
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

    public java.lang.Object[] raw_array() {
        return new org.jctools.maps.NonBlockingHashMap.SnapshotV()._sskvs;
    }

    public java.util.Enumeration<TypeV> elements() {
        return new org.jctools.maps.NonBlockingHashMap.SnapshotV();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Collection<TypeV> values() {
        return new java.util.AbstractCollection<TypeV>() { // from class: org.jctools.maps.NonBlockingHashMap.1
            @Override // java.util.AbstractCollection, java.util.Collection
            public void clear() {
                org.jctools.maps.NonBlockingHashMap.this.clear();
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public int size() {
                return org.jctools.maps.NonBlockingHashMap.this.size();
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public boolean contains(java.lang.Object obj) {
                return org.jctools.maps.NonBlockingHashMap.this.containsValue(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
            public java.util.Iterator<TypeV> iterator() {
                return new org.jctools.maps.NonBlockingHashMap.SnapshotV();
            }
        };
    }

    class SnapshotK implements java.util.Iterator<TypeK>, java.util.Enumeration<TypeK> {
        final org.jctools.maps.NonBlockingHashMap<TypeK, TypeV>.SnapshotV _ss;

        public SnapshotK() {
            this._ss = new org.jctools.maps.NonBlockingHashMap.SnapshotV();
        }

        @Override // java.util.Iterator
        public void remove() {
            this._ss.removeKey();
        }

        @Override // java.util.Iterator
        public TypeK next() {
            this._ss.next();
            return (TypeK) ((org.jctools.maps.NonBlockingHashMap.SnapshotV) this._ss)._prevK;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this._ss.hasNext();
        }

        @Override // java.util.Enumeration
        public TypeK nextElement() {
            return (TypeK) next();
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return hasNext();
        }
    }

    public java.util.Enumeration<TypeK> keys() {
        return new org.jctools.maps.NonBlockingHashMap.SnapshotK();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set<TypeK> keySet() {
        return new java.util.AbstractSet<TypeK>() { // from class: org.jctools.maps.NonBlockingHashMap.2
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public void clear() {
                org.jctools.maps.NonBlockingHashMap.this.clear();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return org.jctools.maps.NonBlockingHashMap.this.size();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(java.lang.Object obj) {
                return org.jctools.maps.NonBlockingHashMap.this.containsKey(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(java.lang.Object obj) {
                return org.jctools.maps.NonBlockingHashMap.this.remove(obj) != null;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public java.util.Iterator<TypeK> iterator() {
                return new org.jctools.maps.NonBlockingHashMap.SnapshotK();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public <T> T[] toArray(T[] tArr) {
                java.lang.Object[] raw_array = org.jctools.maps.NonBlockingHashMap.this.raw_array();
                int size = size();
                java.lang.Object[] objArr = tArr.length >= size ? tArr : (java.lang.Object[]) java.lang.reflect.Array.newInstance(tArr.getClass().getComponentType(), size);
                int i = 0;
                for (int i2 = 0; i2 < org.jctools.maps.NonBlockingHashMap.len(raw_array); i2++) {
                    java.lang.Object key = org.jctools.maps.NonBlockingHashMap.key(raw_array, i2);
                    java.lang.Object unbox = org.jctools.maps.NonBlockingHashMap.Prime.unbox(org.jctools.maps.NonBlockingHashMap.val(raw_array, i2));
                    if (key != null && key != org.jctools.maps.NonBlockingHashMap.TOMBSTONE && unbox != null && unbox != org.jctools.maps.NonBlockingHashMap.TOMBSTONE) {
                        if (i >= objArr.length) {
                            int min = (int) java.lang.Math.min(2147483639L, i << 1);
                            if (min <= objArr.length) {
                                throw new java.lang.OutOfMemoryError("Required array size too large");
                            }
                            objArr = java.util.Arrays.copyOf(objArr, min);
                        }
                        objArr[i] = key;
                        i++;
                    }
                }
                if (i <= tArr.length) {
                    if (tArr != objArr) {
                        java.lang.System.arraycopy(objArr, 0, tArr, 0, i);
                    }
                    if (i < tArr.length) {
                        objArr[i] = null;
                    }
                    return tArr;
                }
                return (T[]) java.util.Arrays.copyOf(objArr, i);
            }
        };
    }

    class NBHMEntry extends org.jctools.maps.AbstractEntry<TypeK, TypeV> {
        NBHMEntry(TypeK typek, TypeV typev) {
            super(typek, typev);
        }

        @Override // java.util.Map.Entry
        public TypeV setValue(TypeV typev) {
            this._val = typev;
            return org.jctools.maps.NonBlockingHashMap.this.put(this._key, typev);
        }
    }

    class SnapshotE implements java.util.Iterator<java.util.Map.Entry<TypeK, TypeV>> {
        final org.jctools.maps.NonBlockingHashMap<TypeK, TypeV>.SnapshotV _ss;

        public SnapshotE() {
            this._ss = new org.jctools.maps.NonBlockingHashMap.SnapshotV();
        }

        @Override // java.util.Iterator
        public void remove() {
            this._ss.removeKey();
        }

        @Override // java.util.Iterator
        public java.util.Map.Entry<TypeK, TypeV> next() {
            this._ss.next();
            return new org.jctools.maps.NonBlockingHashMap.NBHMEntry(((org.jctools.maps.NonBlockingHashMap.SnapshotV) this._ss)._prevK, ((org.jctools.maps.NonBlockingHashMap.SnapshotV) this._ss)._prevV);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this._ss.hasNext();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set<java.util.Map.Entry<TypeK, TypeV>> entrySet() {
        return new java.util.AbstractSet<java.util.Map.Entry<TypeK, TypeV>>() { // from class: org.jctools.maps.NonBlockingHashMap.3
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public void clear() {
                org.jctools.maps.NonBlockingHashMap.this.clear();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return org.jctools.maps.NonBlockingHashMap.this.size();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(java.lang.Object obj) {
                if (!(obj instanceof java.util.Map.Entry)) {
                    return false;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                return org.jctools.maps.NonBlockingHashMap.this.remove(entry.getKey(), entry.getValue());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(java.lang.Object obj) {
                if (!(obj instanceof java.util.Map.Entry)) {
                    return false;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                TypeV typev = org.jctools.maps.NonBlockingHashMap.this.get(entry.getKey());
                return typev != null && typev.equals(entry.getValue());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public java.util.Iterator<java.util.Map.Entry<TypeK, TypeV>> iterator() {
                return new org.jctools.maps.NonBlockingHashMap.SnapshotE();
            }
        };
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        for (TypeK typek : keySet()) {
            TypeV typev = get(typek);
            objectOutputStream.writeObject(typek);
            objectOutputStream.writeObject(typev);
        }
        objectOutputStream.writeObject(null);
        objectOutputStream.writeObject(null);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        objectInputStream.defaultReadObject();
        initialize(8);
        while (true) {
            java.lang.Object readObject = objectInputStream.readObject();
            java.lang.Object readObject2 = objectInputStream.readObject();
            if (readObject == null) {
                return;
            } else {
                put(readObject, readObject2);
            }
        }
    }
}
