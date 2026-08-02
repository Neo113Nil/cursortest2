package com.google.common.util.concurrent;

/* loaded from: classes9.dex */
public final class AtomicLongMap<K> implements java.io.Serializable {

    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.util.Map<K, java.lang.Long> asMap;
    private final java.util.concurrent.ConcurrentHashMap<K, java.util.concurrent.atomic.AtomicLong> map;

    private AtomicLongMap(java.util.concurrent.ConcurrentHashMap<K, java.util.concurrent.atomic.AtomicLong> concurrentHashMap) {
        this.map = (java.util.concurrent.ConcurrentHashMap) com.google.common.base.Preconditions.checkNotNull(concurrentHashMap);
    }

    public static <K> com.google.common.util.concurrent.AtomicLongMap<K> create() {
        return new com.google.common.util.concurrent.AtomicLongMap<>(new java.util.concurrent.ConcurrentHashMap());
    }

    public static <K> com.google.common.util.concurrent.AtomicLongMap<K> create(java.util.Map<? extends K, ? extends java.lang.Long> map) {
        com.google.common.util.concurrent.AtomicLongMap<K> create = create();
        create.putAll(map);
        return create;
    }

    public final long get(K k) {
        java.util.concurrent.atomic.AtomicLong atomicLong = this.map.get(k);
        if (atomicLong == null) {
            return 0L;
        }
        return atomicLong.get();
    }

    public final long incrementAndGet(K k) {
        return addAndGet(k, 1L);
    }

    public final long decrementAndGet(K k) {
        return addAndGet(k, -1L);
    }

    public final long addAndGet(K k, long j) {
        java.util.concurrent.atomic.AtomicLong atomicLong;
        long j2;
        long j3;
        do {
            atomicLong = this.map.get(k);
            if (atomicLong == null && (atomicLong = this.map.putIfAbsent(k, new java.util.concurrent.atomic.AtomicLong(j))) == null) {
                break;
            }
            do {
                j2 = atomicLong.get();
                if (j2 != 0) {
                    j3 = j2 + j;
                }
            } while (!atomicLong.compareAndSet(j2, j3));
            return j3;
        } while (!this.map.replace(k, atomicLong, new java.util.concurrent.atomic.AtomicLong(j)));
        return j;
    }

    public final long getAndIncrement(K k) {
        return getAndAdd(k, 1L);
    }

    public final long getAndDecrement(K k) {
        return getAndAdd(k, -1L);
    }

    public final long getAndAdd(K k, long j) {
        java.util.concurrent.atomic.AtomicLong atomicLong;
        long j2;
        do {
            atomicLong = this.map.get(k);
            if (atomicLong == null && (atomicLong = this.map.putIfAbsent(k, new java.util.concurrent.atomic.AtomicLong(j))) == null) {
                return 0L;
            }
            do {
                j2 = atomicLong.get();
                if (j2 == 0) {
                }
            } while (!atomicLong.compareAndSet(j2, j2 + j));
            return j2;
        } while (!this.map.replace(k, atomicLong, new java.util.concurrent.atomic.AtomicLong(j)));
        return 0L;
    }

    public final long put(K k, long j) {
        java.util.concurrent.atomic.AtomicLong atomicLong;
        long j2;
        do {
            atomicLong = this.map.get(k);
            if (atomicLong == null && (atomicLong = this.map.putIfAbsent(k, new java.util.concurrent.atomic.AtomicLong(j))) == null) {
                return 0L;
            }
            do {
                j2 = atomicLong.get();
                if (j2 == 0) {
                }
            } while (!atomicLong.compareAndSet(j2, j));
            return j2;
        } while (!this.map.replace(k, atomicLong, new java.util.concurrent.atomic.AtomicLong(j)));
        return 0L;
    }

    public final void putAll(java.util.Map<? extends K, ? extends java.lang.Long> map) {
        for (java.util.Map.Entry<? extends K, ? extends java.lang.Long> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue().longValue());
        }
    }

    public final long remove(K k) {
        long j;
        java.util.concurrent.atomic.AtomicLong atomicLong = this.map.get(k);
        if (atomicLong == null) {
            return 0L;
        }
        do {
            j = atomicLong.get();
            if (j == 0) {
                break;
            }
        } while (!atomicLong.compareAndSet(j, 0L));
        this.map.remove(k, atomicLong);
        return j;
    }

    final boolean remove(K k, long j) {
        java.util.concurrent.atomic.AtomicLong atomicLong = this.map.get(k);
        if (atomicLong == null) {
            return false;
        }
        long j2 = atomicLong.get();
        if (j2 != j) {
            return false;
        }
        if (j2 != 0 && !atomicLong.compareAndSet(j2, 0L)) {
            return false;
        }
        this.map.remove(k, atomicLong);
        return true;
    }

    public final boolean removeIfZero(K k) {
        return remove(k, 0L);
    }

    public final void removeAllZeros() {
        java.util.Iterator<java.util.Map.Entry<K, java.util.concurrent.atomic.AtomicLong>> it = this.map.entrySet().iterator();
        while (it.hasNext()) {
            java.util.concurrent.atomic.AtomicLong value = it.next().getValue();
            if (value != null && value.get() == 0) {
                it.remove();
            }
        }
    }

    public final long sum() {
        java.util.Iterator<java.util.concurrent.atomic.AtomicLong> it = this.map.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            j += it.next().get();
        }
        return j;
    }

    public final java.util.Map<K, java.lang.Long> asMap() {
        java.util.Map<K, java.lang.Long> map = this.asMap;
        if (map != null) {
            return map;
        }
        java.util.Map<K, java.lang.Long> createAsMap = createAsMap();
        this.asMap = createAsMap;
        return createAsMap;
    }

    private java.util.Map<K, java.lang.Long> createAsMap() {
        return java.util.Collections.unmodifiableMap(com.google.common.collect.Maps.transformValues(this.map, new com.google.common.base.Function<java.util.concurrent.atomic.AtomicLong, java.lang.Long>() { // from class: com.google.common.util.concurrent.AtomicLongMap.1
            @Override // com.google.common.base.Function
            public java.lang.Long apply(java.util.concurrent.atomic.AtomicLong atomicLong) {
                return java.lang.Long.valueOf(atomicLong.get());
            }
        }));
    }

    public final boolean containsKey(java.lang.Object obj) {
        return this.map.containsKey(obj);
    }

    public final int size() {
        return this.map.size();
    }

    public final boolean isEmpty() {
        return this.map.isEmpty();
    }

    public final void clear() {
        this.map.clear();
    }

    public final java.lang.String toString() {
        return this.map.toString();
    }

    final long putIfAbsent(K k, long j) {
        java.util.concurrent.atomic.AtomicLong atomicLong;
        do {
            atomicLong = this.map.get(k);
            if (atomicLong == null && (atomicLong = this.map.putIfAbsent(k, new java.util.concurrent.atomic.AtomicLong(j))) == null) {
                return 0L;
            }
            long j2 = atomicLong.get();
            if (j2 != 0) {
                return j2;
            }
        } while (!this.map.replace(k, atomicLong, new java.util.concurrent.atomic.AtomicLong(j)));
        return 0L;
    }

    final boolean replace(K k, long j, long j2) {
        if (j == 0) {
            return putIfAbsent(k, j2) == 0;
        }
        java.util.concurrent.atomic.AtomicLong atomicLong = this.map.get(k);
        if (atomicLong == null) {
            return false;
        }
        return atomicLong.compareAndSet(j, j2);
    }
}
