package org.jctools.maps;

/* loaded from: classes18.dex */
public class NonBlockingIdentityHashMap<TypeK, TypeV> extends java.util.AbstractMap<TypeK, TypeV> implements java.util.concurrent.ConcurrentMap<TypeK, TypeV>, java.lang.Cloneable, java.io.Serializable {
    private static final org.jctools.maps.NonBlockingIdentityHashMap.Prime TOMBPRIME;
    private static final java.lang.Object TOMBSTONE;
    private static final long serialVersionUID = 1234123412341234123L;
    private transient java.lang.Object[] _kvs;
    private transient long _last_resize_milli;
    private transient org.jctools.maps.ConcurrentAutoTable _reprobes;
    private static final int _Obase = org.jctools.util.UnsafeAccess.UNSAFE.arrayBaseOffset(java.lang.Object[].class);
    private static final int _Oscale = org.jctools.util.UnsafeAccess.UNSAFE.arrayIndexScale(java.lang.Object[].class);
    private static final long _kvs_offset = org.jctools.util.UnsafeAccess.fieldOffset(org.jctools.maps.NonBlockingHashMap.class, "_kvs");
    private static final java.lang.Object NO_MATCH_OLD = new java.lang.Object();
    private static final java.lang.Object MATCH_ANY = new java.lang.Object();

    /* JADX INFO: Access modifiers changed from: private */
    public static final int reprobe_limit(int i) {
        return (i >> 2) + 10;
    }

    protected void rehash() {
    }

    static {
        java.lang.Object obj = new java.lang.Object();
        TOMBSTONE = obj;
        TOMBPRIME = new org.jctools.maps.NonBlockingIdentityHashMap.Prime(obj);
    }

    private static long rawIndex(java.lang.Object[] objArr, int i) {
        return _Obase + (i * _Oscale);
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
            return obj instanceof org.jctools.maps.NonBlockingIdentityHashMap.Prime ? ((org.jctools.maps.NonBlockingIdentityHashMap.Prime) obj)._V : obj;
        }
    }

    private static final int hash(java.lang.Object obj) {
        return java.lang.System.identityHashCode(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final org.jctools.maps.NonBlockingIdentityHashMap.CHM chm(java.lang.Object[] objArr) {
        return (org.jctools.maps.NonBlockingIdentityHashMap.CHM) objArr[0];
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
                java.lang.Object unbox = org.jctools.maps.NonBlockingIdentityHashMap.Prime.unbox(val);
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

    public NonBlockingIdentityHashMap() {
        this(8);
    }

    public NonBlockingIdentityHashMap(int i) {
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
                objArr[0] = new org.jctools.maps.NonBlockingIdentityHashMap.CHM(new org.jctools.maps.ConcurrentAutoTable());
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

    /* JADX INFO: Access modifiers changed from: private */
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
        while (!CAS_kvs(this._kvs, new org.jctools.maps.NonBlockingIdentityHashMap(8)._kvs)) {
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
            org.jctools.maps.NonBlockingIdentityHashMap nonBlockingIdentityHashMap = (org.jctools.maps.NonBlockingIdentityHashMap) super.clone();
            nonBlockingIdentityHashMap.clear();
            for (TypeK typek : keySet()) {
                nonBlockingIdentityHashMap.put(typek, get(typek));
            }
            return nonBlockingIdentityHashMap;
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

    @Override // java.util.AbstractMap, java.util.Map
    public TypeV get(java.lang.Object obj) {
        return (TypeV) get_impl(this, this._kvs, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        if (r8 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        r10 = r9.help_copy(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final java.lang.Object get_impl(org.jctools.maps.NonBlockingIdentityHashMap nonBlockingIdentityHashMap, java.lang.Object[] objArr, java.lang.Object obj) {
        while (true) {
            int hash = hash(obj);
            int len = len(objArr);
            org.jctools.maps.NonBlockingIdentityHashMap.CHM chm = chm(objArr);
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
                if (key == obj) {
                    if (!(val instanceof org.jctools.maps.NonBlockingIdentityHashMap.Prime)) {
                        if (val == TOMBSTONE) {
                            return null;
                        }
                        return val;
                    }
                    objArr = chm.copy_slot_and_check(nonBlockingIdentityHashMap, objArr, i2, obj);
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0046, code lost:
    
        if (r18 == r12) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0048, code lost:
    
        if (r11 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004a, code lost:
    
        if (r12 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0050, code lost:
    
        if (r7.tableFull(r10, r6) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
    
        r11 = r7.resize(r15, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0054, code lost:
    
        if ((r12 instanceof org.jctools.maps.NonBlockingIdentityHashMap.Prime) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005b, code lost:
    
        if (r11 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0064, code lost:
    
        if (r19 == org.jctools.maps.NonBlockingIdentityHashMap.NO_MATCH_OLD) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0066, code lost:
    
        if (r12 == r19) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006a, code lost:
    
        if (r19 != org.jctools.maps.NonBlockingIdentityHashMap.MATCH_ANY) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006e, code lost:
    
        if (r12 == org.jctools.maps.NonBlockingIdentityHashMap.TOMBSTONE) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0070, code lost:
    
        if (r12 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0072, code lost:
    
        if (r12 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0076, code lost:
    
        if (r19 == org.jctools.maps.NonBlockingIdentityHashMap.TOMBSTONE) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0078, code lost:
    
        if (r19 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x007e, code lost:
    
        if (r19.equals(r12) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0089, code lost:
    
        if (CAS_val(r4, r5, r12, r18) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b8, code lost:
    
        r12 = val(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c0, code lost:
    
        if ((r12 instanceof org.jctools.maps.NonBlockingIdentityHashMap.Prime) == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c8, code lost:
    
        r13 = org.jctools.maps.NonBlockingHashMap.DUMMY_VOLATILE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c2, code lost:
    
        r4 = r7.copy_slot_and_check(r15, r4, r5, r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x008b, code lost:
    
        if (r19 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x008d, code lost:
    
        if (r12 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0091, code lost:
    
        if (r12 != org.jctools.maps.NonBlockingIdentityHashMap.TOMBSTONE) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00a0, code lost:
    
        if (r12 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00a2, code lost:
    
        r0 = org.jctools.maps.NonBlockingIdentityHashMap.TOMBSTONE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00a4, code lost:
    
        if (r12 == r0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00a6, code lost:
    
        if (r18 != r0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00a8, code lost:
    
        r7._size.add(-1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0095, code lost:
    
        if (r18 == org.jctools.maps.NonBlockingIdentityHashMap.TOMBSTONE) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0097, code lost:
    
        r7._size.add(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00b1, code lost:
    
        if (r12 != null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00b3, code lost:
    
        if (r19 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00b7, code lost:
    
        return org.jctools.maps.NonBlockingIdentityHashMap.TOMBSTONE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x005d, code lost:
    
        r4 = r7.copy_slot_and_check(r15, r4, r5, r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0041, code lost:
    
        return r13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object putIfMatch0(org.jctools.maps.NonBlockingIdentityHashMap nonBlockingIdentityHashMap, java.lang.Object[] objArr, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.Object val;
        java.lang.Object[] objArr2 = objArr;
        loop0: while (true) {
            int hash = hash(obj);
            int len = len(objArr2);
            org.jctools.maps.NonBlockingIdentityHashMap.CHM chm = chm(objArr2);
            int i = len - 1;
            int i2 = hash & i;
            int i3 = 0;
            java.lang.Object[] objArr3 = null;
            while (true) {
                val = val(objArr2, i2);
                java.lang.Object key = key(objArr2, i2);
                if (key == null) {
                    java.lang.Object obj4 = TOMBSTONE;
                    if (obj2 == obj4 || obj3 == MATCH_ANY) {
                        break loop0;
                    }
                    if (!CAS_key(objArr2, i2, null, obj)) {
                        int i4 = org.jctools.maps.NonBlockingHashMap.DUMMY_VOLATILE;
                    } else {
                        chm._slots.add(1L);
                        break;
                    }
                } else {
                    objArr3 = chm._newkvs;
                    if (key == obj) {
                        break;
                    }
                    i3++;
                    if (i3 >= reprobe_limit(len) || key == TOMBSTONE) {
                        break;
                    }
                    i2 = (i2 + 1) & i;
                }
            }
            objArr2 = chm.resize(nonBlockingIdentityHashMap, objArr2);
            if (obj3 != null) {
                nonBlockingIdentityHashMap.help_copy(objArr2);
            }
        }
        if (val == null) {
            return TOMBSTONE;
        }
        return val;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object[] help_copy(java.lang.Object[] objArr) {
        java.lang.Object[] objArr2 = this._kvs;
        org.jctools.maps.NonBlockingIdentityHashMap.CHM chm = chm(objArr2);
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
        private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<org.jctools.maps.NonBlockingIdentityHashMap.CHM, java.lang.Object[]> _newkvsUpdater = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(org.jctools.maps.NonBlockingIdentityHashMap.CHM.class, java.lang.Object[].class, "_newkvs");
        private static final java.util.concurrent.atomic.AtomicLongFieldUpdater<org.jctools.maps.NonBlockingIdentityHashMap.CHM> _resizerUpdater = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(org.jctools.maps.NonBlockingIdentityHashMap.CHM.class, "_resizers");
        private static final java.util.concurrent.atomic.AtomicLongFieldUpdater<org.jctools.maps.NonBlockingIdentityHashMap.CHM> _copyIdxUpdater = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(org.jctools.maps.NonBlockingIdentityHashMap.CHM.class, "_copyIdx");
        private static final java.util.concurrent.atomic.AtomicLongFieldUpdater<org.jctools.maps.NonBlockingIdentityHashMap.CHM> _copyDoneUpdater = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(org.jctools.maps.NonBlockingIdentityHashMap.CHM.class, "_copyDone");
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
            return i >= 10 && this._slots.estimate_get() >= ((long) org.jctools.maps.NonBlockingIdentityHashMap.reprobe_limit(i2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final java.lang.Object[] resize(org.jctools.maps.NonBlockingIdentityHashMap nonBlockingIdentityHashMap, java.lang.Object[] objArr) {
            int i;
            int i2;
            long j;
            java.lang.Object[] objArr2 = this._newkvs;
            if (objArr2 != null) {
                return objArr2;
            }
            int len = org.jctools.maps.NonBlockingIdentityHashMap.len(objArr);
            int size = size();
            if (size >= (len >> 2)) {
                i = len << 1;
                if (size >= (len >> 1)) {
                    i = len << 2;
                }
            } else {
                i = size;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (i <= len && currentTimeMillis <= nonBlockingIdentityHashMap._last_resize_milli + 10000 && this._slots.estimate_get() >= (size << 1)) {
                i = len << 1;
            }
            if (i >= len) {
                len = i;
            }
            int i3 = 3;
            while (true) {
                i2 = 1 << i3;
                if (i2 >= len) {
                    break;
                }
                i3++;
            }
            do {
                j = this._resizers;
            } while (!_resizerUpdater.compareAndSet(this, j, j + 1));
            int i4 = i2 << 1;
            int i5 = ((i4 + 4) << 3) >> 20;
            if (j >= 2 && i5 > 0) {
                java.lang.Object[] objArr3 = this._newkvs;
                if (objArr3 != null) {
                    return objArr3;
                }
                try {
                    java.lang.Thread.sleep(i5 * 8);
                } catch (java.lang.Exception unused) {
                }
            }
            java.lang.Object[] objArr4 = this._newkvs;
            if (objArr4 != null) {
                return objArr4;
            }
            java.lang.Object[] objArr5 = new java.lang.Object[i4 + 2];
            objArr5[0] = new org.jctools.maps.NonBlockingIdentityHashMap.CHM(this._size);
            objArr5[1] = new int[i2];
            if (this._newkvs != null) {
                return this._newkvs;
            }
            if (CAS_newkvs(objArr5)) {
                nonBlockingIdentityHashMap.rehash();
                return objArr5;
            }
            return this._newkvs;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void help_copy_impl(org.jctools.maps.NonBlockingIdentityHashMap nonBlockingIdentityHashMap, java.lang.Object[] objArr, boolean z) {
            int i;
            int i2;
            java.lang.Object[] objArr2 = this._newkvs;
            int len = org.jctools.maps.NonBlockingIdentityHashMap.len(objArr);
            int min = java.lang.Math.min(len, 1024);
            int i3 = -9999;
            int i4 = -1;
            int i5 = -1;
            while (this._copyDone < len) {
                if (i5 == i4) {
                    int i6 = (int) this._copyIdx;
                    while (true) {
                        int i7 = len << 1;
                        if (i6 >= i7) {
                            i = i7;
                            i2 = i5;
                            break;
                        }
                        i2 = i5;
                        i = i7;
                        if (_copyIdxUpdater.compareAndSet(this, i6, i6 + min)) {
                            break;
                        }
                        i6 = (int) this._copyIdx;
                        i5 = i2;
                    }
                    i3 = i6;
                    i5 = i6 >= i ? i3 : i2;
                }
                int i8 = 0;
                for (int i9 = 0; i9 < min; i9++) {
                    if (copy_slot(nonBlockingIdentityHashMap, (i3 + i9) & (len - 1), objArr, objArr2)) {
                        i8++;
                    }
                }
                if (i8 > 0) {
                    copy_check_and_promote(nonBlockingIdentityHashMap, objArr, i8);
                }
                i3 += min;
                if (!z && i5 == -1) {
                    return;
                } else {
                    i4 = -1;
                }
            }
            copy_check_and_promote(nonBlockingIdentityHashMap, objArr, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final java.lang.Object[] copy_slot_and_check(org.jctools.maps.NonBlockingIdentityHashMap nonBlockingIdentityHashMap, java.lang.Object[] objArr, int i, java.lang.Object obj) {
            java.lang.Object[] objArr2 = this._newkvs;
            if (copy_slot(nonBlockingIdentityHashMap, i, objArr, this._newkvs)) {
                copy_check_and_promote(nonBlockingIdentityHashMap, objArr, 1);
            }
            return obj == null ? objArr2 : nonBlockingIdentityHashMap.help_copy(objArr2);
        }

        private final void copy_check_and_promote(org.jctools.maps.NonBlockingIdentityHashMap nonBlockingIdentityHashMap, java.lang.Object[] objArr, int i) {
            int len = org.jctools.maps.NonBlockingIdentityHashMap.len(objArr);
            long j = this._copyDone;
            if (i > 0) {
                while (!_copyDoneUpdater.compareAndSet(this, j, j + i)) {
                    j = this._copyDone;
                }
            }
            if (j + i == len && nonBlockingIdentityHashMap._kvs == objArr && nonBlockingIdentityHashMap.CAS_kvs(objArr, this._newkvs)) {
                nonBlockingIdentityHashMap._last_resize_milli = java.lang.System.currentTimeMillis();
            }
        }

        private boolean copy_slot(org.jctools.maps.NonBlockingIdentityHashMap nonBlockingIdentityHashMap, int i, java.lang.Object[] objArr, java.lang.Object[] objArr2) {
            java.lang.Object key;
            while (true) {
                key = org.jctools.maps.NonBlockingIdentityHashMap.key(objArr, i);
                if (key != null) {
                    break;
                }
                org.jctools.maps.NonBlockingIdentityHashMap.CAS_key(objArr, i, null, org.jctools.maps.NonBlockingIdentityHashMap.TOMBSTONE);
            }
            java.lang.Object val = org.jctools.maps.NonBlockingIdentityHashMap.val(objArr, i);
            while (true) {
                if (val instanceof org.jctools.maps.NonBlockingIdentityHashMap.Prime) {
                    break;
                }
                org.jctools.maps.NonBlockingIdentityHashMap.Prime prime = (val == null || val == org.jctools.maps.NonBlockingIdentityHashMap.TOMBSTONE) ? org.jctools.maps.NonBlockingIdentityHashMap.TOMBPRIME : new org.jctools.maps.NonBlockingIdentityHashMap.Prime(val);
                if (org.jctools.maps.NonBlockingIdentityHashMap.CAS_val(objArr, i, val, prime)) {
                    if (prime == org.jctools.maps.NonBlockingIdentityHashMap.TOMBPRIME) {
                        return true;
                    }
                    val = prime;
                } else {
                    val = org.jctools.maps.NonBlockingIdentityHashMap.val(objArr, i);
                }
            }
            if (val == org.jctools.maps.NonBlockingIdentityHashMap.TOMBPRIME) {
                return false;
            }
            org.jctools.maps.NonBlockingIdentityHashMap.putIfMatch0(nonBlockingIdentityHashMap, objArr2, key, ((org.jctools.maps.NonBlockingIdentityHashMap.Prime) val)._V, null);
            while (val != org.jctools.maps.NonBlockingIdentityHashMap.TOMBPRIME && !org.jctools.maps.NonBlockingIdentityHashMap.CAS_val(objArr, i, val, org.jctools.maps.NonBlockingIdentityHashMap.TOMBPRIME)) {
                val = org.jctools.maps.NonBlockingIdentityHashMap.val(objArr, i);
            }
            return val != org.jctools.maps.NonBlockingIdentityHashMap.TOMBPRIME;
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
                java.lang.Object[] objArr = org.jctools.maps.NonBlockingIdentityHashMap.this._kvs;
                org.jctools.maps.NonBlockingIdentityHashMap.CHM chm = org.jctools.maps.NonBlockingIdentityHashMap.chm(objArr);
                if (chm._newkvs != null) {
                    chm.help_copy_impl(org.jctools.maps.NonBlockingIdentityHashMap.this, objArr, true);
                } else {
                    this._sskvs = objArr;
                    next();
                    return;
                }
            }
        }

        int length() {
            return org.jctools.maps.NonBlockingIdentityHashMap.len(this._sskvs);
        }

        java.lang.Object key(int i) {
            return org.jctools.maps.NonBlockingIdentityHashMap.key(this._sskvs, i);
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
                if (key != null && key != org.jctools.maps.NonBlockingIdentityHashMap.TOMBSTONE) {
                    TypeV typev = org.jctools.maps.NonBlockingIdentityHashMap.this.get(this._nextK);
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
                org.jctools.maps.NonBlockingIdentityHashMap.this.putIfMatch(this._prevK, org.jctools.maps.NonBlockingIdentityHashMap.TOMBSTONE, org.jctools.maps.NonBlockingIdentityHashMap.NO_MATCH_OLD);
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
        return new org.jctools.maps.NonBlockingIdentityHashMap.SnapshotV();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Collection<TypeV> values() {
        return new java.util.AbstractCollection<TypeV>() { // from class: org.jctools.maps.NonBlockingIdentityHashMap.1
            @Override // java.util.AbstractCollection, java.util.Collection
            public void clear() {
                org.jctools.maps.NonBlockingIdentityHashMap.this.clear();
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public int size() {
                return org.jctools.maps.NonBlockingIdentityHashMap.this.size();
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public boolean contains(java.lang.Object obj) {
                return org.jctools.maps.NonBlockingIdentityHashMap.this.containsValue(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
            public java.util.Iterator<TypeV> iterator() {
                return new org.jctools.maps.NonBlockingIdentityHashMap.SnapshotV();
            }
        };
    }

    class SnapshotK implements java.util.Iterator<TypeK>, java.util.Enumeration<TypeK> {
        final org.jctools.maps.NonBlockingIdentityHashMap<TypeK, TypeV>.SnapshotV _ss;

        public SnapshotK() {
            this._ss = new org.jctools.maps.NonBlockingIdentityHashMap.SnapshotV();
        }

        @Override // java.util.Iterator
        public void remove() {
            this._ss.removeKey();
        }

        @Override // java.util.Iterator
        public TypeK next() {
            this._ss.next();
            return (TypeK) ((org.jctools.maps.NonBlockingIdentityHashMap.SnapshotV) this._ss)._prevK;
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
        return new org.jctools.maps.NonBlockingIdentityHashMap.SnapshotK();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set<TypeK> keySet() {
        return new java.util.AbstractSet<TypeK>() { // from class: org.jctools.maps.NonBlockingIdentityHashMap.2
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public void clear() {
                org.jctools.maps.NonBlockingIdentityHashMap.this.clear();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return org.jctools.maps.NonBlockingIdentityHashMap.this.size();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(java.lang.Object obj) {
                return org.jctools.maps.NonBlockingIdentityHashMap.this.containsKey(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(java.lang.Object obj) {
                return org.jctools.maps.NonBlockingIdentityHashMap.this.remove(obj) != null;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public java.util.Iterator<TypeK> iterator() {
                return new org.jctools.maps.NonBlockingIdentityHashMap.SnapshotK();
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
            return org.jctools.maps.NonBlockingIdentityHashMap.this.put(this._key, typev);
        }
    }

    class SnapshotE implements java.util.Iterator<java.util.Map.Entry<TypeK, TypeV>> {
        final org.jctools.maps.NonBlockingIdentityHashMap<TypeK, TypeV>.SnapshotV _ss;

        public SnapshotE() {
            this._ss = new org.jctools.maps.NonBlockingIdentityHashMap.SnapshotV();
        }

        @Override // java.util.Iterator
        public void remove() {
            this._ss.removeKey();
        }

        @Override // java.util.Iterator
        public java.util.Map.Entry<TypeK, TypeV> next() {
            this._ss.next();
            return new org.jctools.maps.NonBlockingIdentityHashMap.NBHMEntry(((org.jctools.maps.NonBlockingIdentityHashMap.SnapshotV) this._ss)._prevK, ((org.jctools.maps.NonBlockingIdentityHashMap.SnapshotV) this._ss)._prevV);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this._ss.hasNext();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set<java.util.Map.Entry<TypeK, TypeV>> entrySet() {
        return new java.util.AbstractSet<java.util.Map.Entry<TypeK, TypeV>>() { // from class: org.jctools.maps.NonBlockingIdentityHashMap.3
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public void clear() {
                org.jctools.maps.NonBlockingIdentityHashMap.this.clear();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return org.jctools.maps.NonBlockingIdentityHashMap.this.size();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(java.lang.Object obj) {
                if (!(obj instanceof java.util.Map.Entry)) {
                    return false;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                return org.jctools.maps.NonBlockingIdentityHashMap.this.remove(entry.getKey(), entry.getValue());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(java.lang.Object obj) {
                if (!(obj instanceof java.util.Map.Entry)) {
                    return false;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                TypeV typev = org.jctools.maps.NonBlockingIdentityHashMap.this.get(entry.getKey());
                return typev != null && typev.equals(entry.getValue());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public java.util.Iterator<java.util.Map.Entry<TypeK, TypeV>> iterator() {
                return new org.jctools.maps.NonBlockingIdentityHashMap.SnapshotE();
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
