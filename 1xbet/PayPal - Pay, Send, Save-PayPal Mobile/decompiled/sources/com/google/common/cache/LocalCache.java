package com.google.common.cache;

@org.jspecify.annotations.NullUnmarked
/* loaded from: classes9.dex */
final class LocalCache<K, V> extends java.util.AbstractMap<K, V> implements java.util.concurrent.ConcurrentMap<K, V> {
    static final int CONTAINS_VALUE_RETRIES = 3;
    static final int DRAIN_MAX = 16;
    static final int DRAIN_THRESHOLD = 63;
    static final int MAXIMUM_CAPACITY = 1073741824;
    static final int MAX_SEGMENTS = 65536;
    final int concurrencyLevel;
    final com.google.common.cache.CacheLoader<? super K, V> defaultLoader;
    final com.google.common.cache.LocalCache.EntryFactory entryFactory;

    @com.google.errorprone.annotations.concurrent.LazyInit
    java.util.Set<java.util.Map.Entry<K, V>> entrySet;
    final long expireAfterAccessNanos;
    final long expireAfterWriteNanos;
    final com.google.common.cache.AbstractCache.StatsCounter globalStatsCounter;
    final com.google.common.base.Equivalence<java.lang.Object> keyEquivalence;

    @com.google.errorprone.annotations.concurrent.LazyInit
    java.util.Set<K> keySet;
    final com.google.common.cache.LocalCache.Strength keyStrength;
    final long maxWeight;
    final long refreshNanos;
    final com.google.common.cache.RemovalListener<K, V> removalListener;
    final java.util.Queue<com.google.common.cache.RemovalNotification<K, V>> removalNotificationQueue;
    final int segmentMask;
    final int segmentShift;
    final com.google.common.cache.LocalCache.Segment<K, V>[] segments;
    final com.google.common.base.Ticker ticker;
    final com.google.common.base.Equivalence<java.lang.Object> valueEquivalence;
    final com.google.common.cache.LocalCache.Strength valueStrength;

    @com.google.errorprone.annotations.concurrent.LazyInit
    java.util.Collection<V> values;
    final com.google.common.cache.Weigher<K, V> weigher;
    static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(com.google.common.cache.LocalCache.class.getName());
    static final com.google.common.cache.LocalCache.ValueReference<java.lang.Object, java.lang.Object> UNSET = new com.google.common.cache.LocalCache.ValueReference<java.lang.Object, java.lang.Object>() { // from class: com.google.common.cache.LocalCache.1
        @Override // com.google.common.cache.LocalCache.ValueReference
        public com.google.common.cache.LocalCache.ValueReference<java.lang.Object, java.lang.Object> copyFor(java.lang.ref.ReferenceQueue<java.lang.Object> referenceQueue, java.lang.Object obj, com.google.common.cache.ReferenceEntry<java.lang.Object, java.lang.Object> referenceEntry) {
            return this;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public java.lang.Object get() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public com.google.common.cache.ReferenceEntry<java.lang.Object, java.lang.Object> getEntry() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
            return 0;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isActive() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isLoading() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public void notifyNewValue(java.lang.Object obj) {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public java.lang.Object waitForValue() {
            return null;
        }
    };
    static final java.util.Queue<?> DISCARDING_QUEUE = new java.util.AbstractQueue<java.lang.Object>() { // from class: com.google.common.cache.LocalCache.2
        @Override // java.util.Queue
        public boolean offer(java.lang.Object obj) {
            return true;
        }

        @Override // java.util.Queue
        public java.lang.Object peek() {
            return null;
        }

        @Override // java.util.Queue
        public java.lang.Object poll() {
            return null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<java.lang.Object> iterator() {
            return com.google.common.collect.ImmutableSet.of().iterator();
        }
    };

    enum NullEntry implements com.google.common.cache.ReferenceEntry<java.lang.Object, java.lang.Object> {
        INSTANCE;

        @Override // com.google.common.cache.ReferenceEntry
        public final long getAccessTime() {
            return 0L;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final int getHash() {
            return 0;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final java.lang.Object getKey() {
            return null;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final com.google.common.cache.ReferenceEntry<java.lang.Object, java.lang.Object> getNext() {
            return null;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final com.google.common.cache.ReferenceEntry<java.lang.Object, java.lang.Object> getNextInAccessQueue() {
            return this;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final com.google.common.cache.ReferenceEntry<java.lang.Object, java.lang.Object> getNextInWriteQueue() {
            return this;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final com.google.common.cache.ReferenceEntry<java.lang.Object, java.lang.Object> getPreviousInAccessQueue() {
            return this;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final com.google.common.cache.ReferenceEntry<java.lang.Object, java.lang.Object> getPreviousInWriteQueue() {
            return this;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final com.google.common.cache.LocalCache.ValueReference<java.lang.Object, java.lang.Object> getValueReference() {
            return null;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final long getWriteTime() {
            return 0L;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final void setAccessTime(long j) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final void setNextInAccessQueue(com.google.common.cache.ReferenceEntry<java.lang.Object, java.lang.Object> referenceEntry) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final void setNextInWriteQueue(com.google.common.cache.ReferenceEntry<java.lang.Object, java.lang.Object> referenceEntry) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final void setPreviousInAccessQueue(com.google.common.cache.ReferenceEntry<java.lang.Object, java.lang.Object> referenceEntry) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final void setPreviousInWriteQueue(com.google.common.cache.ReferenceEntry<java.lang.Object, java.lang.Object> referenceEntry) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final void setValueReference(com.google.common.cache.LocalCache.ValueReference<java.lang.Object, java.lang.Object> valueReference) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final void setWriteTime(long j) {
        }
    }

    enum Strength {
        STRONG { // from class: com.google.common.cache.LocalCache.Strength.1
            @Override // com.google.common.cache.LocalCache.Strength
            final <K, V> com.google.common.cache.LocalCache.ValueReference<K, V> referenceValue(com.google.common.cache.LocalCache.Segment<K, V> segment, com.google.common.cache.ReferenceEntry<K, V> referenceEntry, V v, int i) {
                if (i == 1) {
                    return new com.google.common.cache.LocalCache.StrongValueReference(v);
                }
                return new com.google.common.cache.LocalCache.WeightedStrongValueReference(v, i);
            }

            @Override // com.google.common.cache.LocalCache.Strength
            final com.google.common.base.Equivalence<java.lang.Object> defaultEquivalence() {
                return com.google.common.base.Equivalence.equals();
            }
        },
        SOFT { // from class: com.google.common.cache.LocalCache.Strength.2
            @Override // com.google.common.cache.LocalCache.Strength
            final <K, V> com.google.common.cache.LocalCache.ValueReference<K, V> referenceValue(com.google.common.cache.LocalCache.Segment<K, V> segment, com.google.common.cache.ReferenceEntry<K, V> referenceEntry, V v, int i) {
                if (i == 1) {
                    return new com.google.common.cache.LocalCache.SoftValueReference(segment.valueReferenceQueue, v, referenceEntry);
                }
                return new com.google.common.cache.LocalCache.WeightedSoftValueReference(segment.valueReferenceQueue, v, referenceEntry, i);
            }

            @Override // com.google.common.cache.LocalCache.Strength
            final com.google.common.base.Equivalence<java.lang.Object> defaultEquivalence() {
                return com.google.common.base.Equivalence.identity();
            }
        },
        WEAK { // from class: com.google.common.cache.LocalCache.Strength.3
            @Override // com.google.common.cache.LocalCache.Strength
            final <K, V> com.google.common.cache.LocalCache.ValueReference<K, V> referenceValue(com.google.common.cache.LocalCache.Segment<K, V> segment, com.google.common.cache.ReferenceEntry<K, V> referenceEntry, V v, int i) {
                if (i == 1) {
                    return new com.google.common.cache.LocalCache.WeakValueReference(segment.valueReferenceQueue, v, referenceEntry);
                }
                return new com.google.common.cache.LocalCache.WeightedWeakValueReference(segment.valueReferenceQueue, v, referenceEntry, i);
            }

            @Override // com.google.common.cache.LocalCache.Strength
            final com.google.common.base.Equivalence<java.lang.Object> defaultEquivalence() {
                return com.google.common.base.Equivalence.identity();
            }
        };

        abstract com.google.common.base.Equivalence<java.lang.Object> defaultEquivalence();

        abstract <K, V> com.google.common.cache.LocalCache.ValueReference<K, V> referenceValue(com.google.common.cache.LocalCache.Segment<K, V> segment, com.google.common.cache.ReferenceEntry<K, V> referenceEntry, V v, int i);
    }

    interface ValueReference<K, V> {
        com.google.common.cache.LocalCache.ValueReference<K, V> copyFor(java.lang.ref.ReferenceQueue<V> referenceQueue, V v, com.google.common.cache.ReferenceEntry<K, V> referenceEntry);

        V get();

        com.google.common.cache.ReferenceEntry<K, V> getEntry();

        int getWeight();

        boolean isActive();

        boolean isLoading();

        void notifyNewValue(V v);

        V waitForValue() throws java.util.concurrent.ExecutionException;
    }

    static int rehash(int i) {
        int i2 = i + ((i << 15) ^ (-12931));
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = i5 + (i5 << 2) + (i5 << 14);
        return i6 ^ (i6 >>> 16);
    }

    LocalCache(com.google.common.cache.CacheBuilder<? super K, ? super V> cacheBuilder, com.google.common.cache.CacheLoader<? super K, V> cacheLoader) {
        java.util.Queue<com.google.common.cache.RemovalNotification<K, V>> concurrentLinkedQueue;
        this.concurrencyLevel = java.lang.Math.min(cacheBuilder.getConcurrencyLevel(), 65536);
        com.google.common.cache.LocalCache.Strength keyStrength = cacheBuilder.getKeyStrength();
        this.keyStrength = keyStrength;
        this.valueStrength = cacheBuilder.getValueStrength();
        this.keyEquivalence = cacheBuilder.getKeyEquivalence();
        this.valueEquivalence = cacheBuilder.getValueEquivalence();
        long maximumWeight = cacheBuilder.getMaximumWeight();
        this.maxWeight = maximumWeight;
        this.weigher = (com.google.common.cache.Weigher<K, V>) cacheBuilder.getWeigher();
        this.expireAfterAccessNanos = cacheBuilder.getExpireAfterAccessNanos();
        this.expireAfterWriteNanos = cacheBuilder.getExpireAfterWriteNanos();
        this.refreshNanos = cacheBuilder.getRefreshNanos();
        com.google.common.cache.CacheBuilder.NullListener nullListener = (com.google.common.cache.RemovalListener<K, V>) cacheBuilder.getRemovalListener();
        this.removalListener = nullListener;
        if (nullListener == com.google.common.cache.CacheBuilder.NullListener.INSTANCE) {
            concurrentLinkedQueue = discardingQueue();
        } else {
            concurrentLinkedQueue = new java.util.concurrent.ConcurrentLinkedQueue<>();
        }
        this.removalNotificationQueue = concurrentLinkedQueue;
        this.ticker = cacheBuilder.getTicker(recordsTime());
        this.entryFactory = com.google.common.cache.LocalCache.EntryFactory.getFactory(keyStrength, usesAccessEntries(), usesWriteEntries());
        this.globalStatsCounter = cacheBuilder.getStatsCounterSupplier().get();
        this.defaultLoader = cacheLoader;
        int min = java.lang.Math.min(cacheBuilder.getInitialCapacity(), 1073741824);
        if (evictsBySize() && !customWeigher()) {
            min = (int) java.lang.Math.min(min, maximumWeight);
        }
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        int i4 = 1;
        while (i4 < this.concurrencyLevel && (!evictsBySize() || i4 * 20 <= this.maxWeight)) {
            i3++;
            i4 <<= 1;
        }
        this.segmentShift = 32 - i3;
        this.segmentMask = i4 - 1;
        this.segments = newSegmentArray(i4);
        int i5 = min / i4;
        while (i2 < (i5 * i4 < min ? i5 + 1 : i5)) {
            i2 <<= 1;
        }
        if (evictsBySize()) {
            long j = this.maxWeight;
            long j2 = i4;
            long j3 = (j / j2) + 1;
            while (true) {
                com.google.common.cache.LocalCache.Segment<K, V>[] segmentArr = this.segments;
                if (i >= segmentArr.length) {
                    return;
                }
                if (i == j % j2) {
                    j3--;
                }
                segmentArr[i] = createSegment(i2, j3, cacheBuilder.getStatsCounterSupplier().get());
                i++;
            }
        } else {
            while (true) {
                com.google.common.cache.LocalCache.Segment<K, V>[] segmentArr2 = this.segments;
                if (i >= segmentArr2.length) {
                    return;
                }
                segmentArr2[i] = createSegment(i2, -1L, cacheBuilder.getStatsCounterSupplier().get());
                i++;
            }
        }
    }

    final boolean evictsBySize() {
        return this.maxWeight >= 0;
    }

    final boolean customWeigher() {
        return this.weigher != com.google.common.cache.CacheBuilder.OneWeigher.INSTANCE;
    }

    final boolean expires() {
        return expiresAfterWrite() || expiresAfterAccess();
    }

    final boolean expiresAfterWrite() {
        return this.expireAfterWriteNanos > 0;
    }

    final boolean expiresAfterAccess() {
        return this.expireAfterAccessNanos > 0;
    }

    final boolean refreshes() {
        return this.refreshNanos > 0;
    }

    final boolean usesAccessQueue() {
        return expiresAfterAccess() || evictsBySize();
    }

    final boolean usesWriteQueue() {
        return expiresAfterWrite();
    }

    final boolean recordsWrite() {
        return expiresAfterWrite() || refreshes();
    }

    final boolean recordsAccess() {
        return expiresAfterAccess();
    }

    final boolean recordsTime() {
        return recordsWrite() || recordsAccess();
    }

    final boolean usesWriteEntries() {
        return usesWriteQueue() || recordsWrite();
    }

    final boolean usesAccessEntries() {
        return usesAccessQueue() || recordsAccess();
    }

    final boolean usesKeyReferences() {
        return this.keyStrength != com.google.common.cache.LocalCache.Strength.STRONG;
    }

    final boolean usesValueReferences() {
        return this.valueStrength != com.google.common.cache.LocalCache.Strength.STRONG;
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 com.google.common.cache.LocalCache$EntryFactory, still in use, count: 1, list:
      (r0v0 com.google.common.cache.LocalCache$EntryFactory) from 0x0058: FILLED_NEW_ARRAY 
      (r0v0 com.google.common.cache.LocalCache$EntryFactory)
      (r1v1 com.google.common.cache.LocalCache$EntryFactory)
      (r3v1 com.google.common.cache.LocalCache$EntryFactory)
      (r5v1 com.google.common.cache.LocalCache$EntryFactory)
      (r7v1 com.google.common.cache.LocalCache$EntryFactory)
      (r9v1 com.google.common.cache.LocalCache$EntryFactory)
      (r11v1 com.google.common.cache.LocalCache$EntryFactory)
      (r13v1 com.google.common.cache.LocalCache$EntryFactory)
     A[WRAPPED] (LINE:577) elemType: com.google.common.cache.LocalCache$EntryFactory
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    static abstract class EntryFactory {
        STRONG { // from class: com.google.common.cache.LocalCache.EntryFactory.1
            @Override // com.google.common.cache.LocalCache.EntryFactory
            final <K, V> com.google.common.cache.ReferenceEntry<K, V> newEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, K k, int i, com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
                return new com.google.common.cache.LocalCache.StrongEntry(k, i, referenceEntry);
            }
        },
        STRONG_ACCESS { // from class: com.google.common.cache.LocalCache.EntryFactory.2
            @Override // com.google.common.cache.LocalCache.EntryFactory
            final <K, V> com.google.common.cache.ReferenceEntry<K, V> newEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, K k, int i, com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
                return new com.google.common.cache.LocalCache.StrongAccessEntry(k, i, referenceEntry);
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            final <K, V> com.google.common.cache.ReferenceEntry<K, V> copyEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, com.google.common.cache.ReferenceEntry<K, V> referenceEntry, com.google.common.cache.ReferenceEntry<K, V> referenceEntry2, K k) {
                com.google.common.cache.ReferenceEntry<K, V> copyEntry = super.copyEntry(segment, referenceEntry, referenceEntry2, k);
                copyAccessEntry(referenceEntry, copyEntry);
                return copyEntry;
            }
        },
        STRONG_WRITE { // from class: com.google.common.cache.LocalCache.EntryFactory.3
            @Override // com.google.common.cache.LocalCache.EntryFactory
            final <K, V> com.google.common.cache.ReferenceEntry<K, V> newEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, K k, int i, com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
                return new com.google.common.cache.LocalCache.StrongWriteEntry(k, i, referenceEntry);
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            final <K, V> com.google.common.cache.ReferenceEntry<K, V> copyEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, com.google.common.cache.ReferenceEntry<K, V> referenceEntry, com.google.common.cache.ReferenceEntry<K, V> referenceEntry2, K k) {
                com.google.common.cache.ReferenceEntry<K, V> copyEntry = super.copyEntry(segment, referenceEntry, referenceEntry2, k);
                copyWriteEntry(referenceEntry, copyEntry);
                return copyEntry;
            }
        },
        STRONG_ACCESS_WRITE { // from class: com.google.common.cache.LocalCache.EntryFactory.4
            @Override // com.google.common.cache.LocalCache.EntryFactory
            final <K, V> com.google.common.cache.ReferenceEntry<K, V> newEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, K k, int i, com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
                return new com.google.common.cache.LocalCache.StrongAccessWriteEntry(k, i, referenceEntry);
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            final <K, V> com.google.common.cache.ReferenceEntry<K, V> copyEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, com.google.common.cache.ReferenceEntry<K, V> referenceEntry, com.google.common.cache.ReferenceEntry<K, V> referenceEntry2, K k) {
                com.google.common.cache.ReferenceEntry<K, V> copyEntry = super.copyEntry(segment, referenceEntry, referenceEntry2, k);
                copyAccessEntry(referenceEntry, copyEntry);
                copyWriteEntry(referenceEntry, copyEntry);
                return copyEntry;
            }
        },
        WEAK { // from class: com.google.common.cache.LocalCache.EntryFactory.5
            @Override // com.google.common.cache.LocalCache.EntryFactory
            final <K, V> com.google.common.cache.ReferenceEntry<K, V> newEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, K k, int i, com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
                return new com.google.common.cache.LocalCache.WeakEntry(segment.keyReferenceQueue, k, i, referenceEntry);
            }
        },
        WEAK_ACCESS { // from class: com.google.common.cache.LocalCache.EntryFactory.6
            @Override // com.google.common.cache.LocalCache.EntryFactory
            final <K, V> com.google.common.cache.ReferenceEntry<K, V> newEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, K k, int i, com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
                return new com.google.common.cache.LocalCache.WeakAccessEntry(segment.keyReferenceQueue, k, i, referenceEntry);
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            final <K, V> com.google.common.cache.ReferenceEntry<K, V> copyEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, com.google.common.cache.ReferenceEntry<K, V> referenceEntry, com.google.common.cache.ReferenceEntry<K, V> referenceEntry2, K k) {
                com.google.common.cache.ReferenceEntry<K, V> copyEntry = super.copyEntry(segment, referenceEntry, referenceEntry2, k);
                copyAccessEntry(referenceEntry, copyEntry);
                return copyEntry;
            }
        },
        WEAK_WRITE { // from class: com.google.common.cache.LocalCache.EntryFactory.7
            @Override // com.google.common.cache.LocalCache.EntryFactory
            final <K, V> com.google.common.cache.ReferenceEntry<K, V> newEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, K k, int i, com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
                return new com.google.common.cache.LocalCache.WeakWriteEntry(segment.keyReferenceQueue, k, i, referenceEntry);
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            final <K, V> com.google.common.cache.ReferenceEntry<K, V> copyEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, com.google.common.cache.ReferenceEntry<K, V> referenceEntry, com.google.common.cache.ReferenceEntry<K, V> referenceEntry2, K k) {
                com.google.common.cache.ReferenceEntry<K, V> copyEntry = super.copyEntry(segment, referenceEntry, referenceEntry2, k);
                copyWriteEntry(referenceEntry, copyEntry);
                return copyEntry;
            }
        },
        WEAK_ACCESS_WRITE { // from class: com.google.common.cache.LocalCache.EntryFactory.8
            @Override // com.google.common.cache.LocalCache.EntryFactory
            final <K, V> com.google.common.cache.ReferenceEntry<K, V> newEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, K k, int i, com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
                return new com.google.common.cache.LocalCache.WeakAccessWriteEntry(segment.keyReferenceQueue, k, i, referenceEntry);
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            final <K, V> com.google.common.cache.ReferenceEntry<K, V> copyEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, com.google.common.cache.ReferenceEntry<K, V> referenceEntry, com.google.common.cache.ReferenceEntry<K, V> referenceEntry2, K k) {
                com.google.common.cache.ReferenceEntry<K, V> copyEntry = super.copyEntry(segment, referenceEntry, referenceEntry2, k);
                copyAccessEntry(referenceEntry, copyEntry);
                copyWriteEntry(referenceEntry, copyEntry);
                return copyEntry;
            }
        };

        static final int ACCESS_MASK = 1;
        static final int WEAK_MASK = 4;
        static final int WRITE_MASK = 2;
        static final com.google.common.cache.LocalCache.EntryFactory[] factories = {new com.google.common.cache.LocalCache.EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.1
            @Override // com.google.common.cache.LocalCache.EntryFactory
            final <K, V> com.google.common.cache.ReferenceEntry<K, V> newEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, K k, int i, com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
                return new com.google.common.cache.LocalCache.StrongEntry(k, i, referenceEntry);
            }
        }, new com.google.common.cache.LocalCache.EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.2
            @Override // com.google.common.cache.LocalCache.EntryFactory
            final <K, V> com.google.common.cache.ReferenceEntry<K, V> newEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, K k, int i, com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
                return new com.google.common.cache.LocalCache.StrongAccessEntry(k, i, referenceEntry);
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            final <K, V> com.google.common.cache.ReferenceEntry<K, V> copyEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, com.google.common.cache.ReferenceEntry<K, V> referenceEntry, com.google.common.cache.ReferenceEntry<K, V> referenceEntry2, K k) {
                com.google.common.cache.ReferenceEntry<K, V> copyEntry = super.copyEntry(segment, referenceEntry, referenceEntry2, k);
                copyAccessEntry(referenceEntry, copyEntry);
                return copyEntry;
            }
        }, new com.google.common.cache.LocalCache.EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.3
            @Override // com.google.common.cache.LocalCache.EntryFactory
            final <K, V> com.google.common.cache.ReferenceEntry<K, V> newEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, K k, int i, com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
                return new com.google.common.cache.LocalCache.StrongWriteEntry(k, i, referenceEntry);
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            final <K, V> com.google.common.cache.ReferenceEntry<K, V> copyEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, com.google.common.cache.ReferenceEntry<K, V> referenceEntry, com.google.common.cache.ReferenceEntry<K, V> referenceEntry2, K k) {
                com.google.common.cache.ReferenceEntry<K, V> copyEntry = super.copyEntry(segment, referenceEntry, referenceEntry2, k);
                copyWriteEntry(referenceEntry, copyEntry);
                return copyEntry;
            }
        }, new com.google.common.cache.LocalCache.EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.4
            @Override // com.google.common.cache.LocalCache.EntryFactory
            final <K, V> com.google.common.cache.ReferenceEntry<K, V> newEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, K k, int i, com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
                return new com.google.common.cache.LocalCache.StrongAccessWriteEntry(k, i, referenceEntry);
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            final <K, V> com.google.common.cache.ReferenceEntry<K, V> copyEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, com.google.common.cache.ReferenceEntry<K, V> referenceEntry, com.google.common.cache.ReferenceEntry<K, V> referenceEntry2, K k) {
                com.google.common.cache.ReferenceEntry<K, V> copyEntry = super.copyEntry(segment, referenceEntry, referenceEntry2, k);
                copyAccessEntry(referenceEntry, copyEntry);
                copyWriteEntry(referenceEntry, copyEntry);
                return copyEntry;
            }
        }, new com.google.common.cache.LocalCache.EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.5
            @Override // com.google.common.cache.LocalCache.EntryFactory
            final <K, V> com.google.common.cache.ReferenceEntry<K, V> newEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, K k, int i, com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
                return new com.google.common.cache.LocalCache.WeakEntry(segment.keyReferenceQueue, k, i, referenceEntry);
            }
        }, new com.google.common.cache.LocalCache.EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.6
            @Override // com.google.common.cache.LocalCache.EntryFactory
            final <K, V> com.google.common.cache.ReferenceEntry<K, V> newEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, K k, int i, com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
                return new com.google.common.cache.LocalCache.WeakAccessEntry(segment.keyReferenceQueue, k, i, referenceEntry);
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            final <K, V> com.google.common.cache.ReferenceEntry<K, V> copyEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, com.google.common.cache.ReferenceEntry<K, V> referenceEntry, com.google.common.cache.ReferenceEntry<K, V> referenceEntry2, K k) {
                com.google.common.cache.ReferenceEntry<K, V> copyEntry = super.copyEntry(segment, referenceEntry, referenceEntry2, k);
                copyAccessEntry(referenceEntry, copyEntry);
                return copyEntry;
            }
        }, new com.google.common.cache.LocalCache.EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.7
            @Override // com.google.common.cache.LocalCache.EntryFactory
            final <K, V> com.google.common.cache.ReferenceEntry<K, V> newEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, K k, int i, com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
                return new com.google.common.cache.LocalCache.WeakWriteEntry(segment.keyReferenceQueue, k, i, referenceEntry);
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            final <K, V> com.google.common.cache.ReferenceEntry<K, V> copyEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, com.google.common.cache.ReferenceEntry<K, V> referenceEntry, com.google.common.cache.ReferenceEntry<K, V> referenceEntry2, K k) {
                com.google.common.cache.ReferenceEntry<K, V> copyEntry = super.copyEntry(segment, referenceEntry, referenceEntry2, k);
                copyWriteEntry(referenceEntry, copyEntry);
                return copyEntry;
            }
        }, new com.google.common.cache.LocalCache.EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.8
            @Override // com.google.common.cache.LocalCache.EntryFactory
            final <K, V> com.google.common.cache.ReferenceEntry<K, V> newEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, K k, int i, com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
                return new com.google.common.cache.LocalCache.WeakAccessWriteEntry(segment.keyReferenceQueue, k, i, referenceEntry);
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            final <K, V> com.google.common.cache.ReferenceEntry<K, V> copyEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, com.google.common.cache.ReferenceEntry<K, V> referenceEntry, com.google.common.cache.ReferenceEntry<K, V> referenceEntry2, K k) {
                com.google.common.cache.ReferenceEntry<K, V> copyEntry = super.copyEntry(segment, referenceEntry, referenceEntry2, k);
                copyAccessEntry(referenceEntry, copyEntry);
                copyWriteEntry(referenceEntry, copyEntry);
                return copyEntry;
            }
        }};

        abstract <K, V> com.google.common.cache.ReferenceEntry<K, V> newEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, K k, int i, com.google.common.cache.ReferenceEntry<K, V> referenceEntry);

        private EntryFactory() {
        }

        public static com.google.common.cache.LocalCache.EntryFactory valueOf(java.lang.String str) {
            return (com.google.common.cache.LocalCache.EntryFactory) java.lang.Enum.valueOf(com.google.common.cache.LocalCache.EntryFactory.class, str);
        }

        public static com.google.common.cache.LocalCache.EntryFactory[] values() {
            return (com.google.common.cache.LocalCache.EntryFactory[]) $VALUES.clone();
        }

        static {
        }

        /* JADX WARN: Multi-variable type inference failed */
        static com.google.common.cache.LocalCache.EntryFactory getFactory(com.google.common.cache.LocalCache.Strength strength, boolean z, boolean z2) {
            return factories[(strength == com.google.common.cache.LocalCache.Strength.WEAK ? (char) 4 : (char) 0) | (z ? 1 : 0) | (z2 ? 2 : 0)];
        }

        <K, V> com.google.common.cache.ReferenceEntry<K, V> copyEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, com.google.common.cache.ReferenceEntry<K, V> referenceEntry, com.google.common.cache.ReferenceEntry<K, V> referenceEntry2, K k) {
            return newEntry(segment, k, referenceEntry.getHash(), referenceEntry2);
        }

        <K, V> void copyAccessEntry(com.google.common.cache.ReferenceEntry<K, V> referenceEntry, com.google.common.cache.ReferenceEntry<K, V> referenceEntry2) {
            referenceEntry2.setAccessTime(referenceEntry.getAccessTime());
            com.google.common.cache.LocalCache.connectAccessOrder(referenceEntry.getPreviousInAccessQueue(), referenceEntry2);
            com.google.common.cache.LocalCache.connectAccessOrder(referenceEntry2, referenceEntry.getNextInAccessQueue());
            com.google.common.cache.LocalCache.nullifyAccessOrder(referenceEntry);
        }

        <K, V> void copyWriteEntry(com.google.common.cache.ReferenceEntry<K, V> referenceEntry, com.google.common.cache.ReferenceEntry<K, V> referenceEntry2) {
            referenceEntry2.setWriteTime(referenceEntry.getWriteTime());
            com.google.common.cache.LocalCache.connectWriteOrder(referenceEntry.getPreviousInWriteQueue(), referenceEntry2);
            com.google.common.cache.LocalCache.connectWriteOrder(referenceEntry2, referenceEntry.getNextInWriteQueue());
            com.google.common.cache.LocalCache.nullifyWriteOrder(referenceEntry);
        }
    }

    static <K, V> com.google.common.cache.LocalCache.ValueReference<K, V> unset() {
        return (com.google.common.cache.LocalCache.ValueReference<K, V>) UNSET;
    }

    static abstract class AbstractReferenceEntry<K, V> implements com.google.common.cache.ReferenceEntry<K, V> {
        AbstractReferenceEntry() {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public com.google.common.cache.LocalCache.ValueReference<K, V> getValueReference() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setValueReference(com.google.common.cache.LocalCache.ValueReference<K, V> valueReference) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getNext() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public int getHash() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public K getKey() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setAccessTime(long j) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getNextInAccessQueue() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getPreviousInAccessQueue() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setWriteTime(long j) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getNextInWriteQueue() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getPreviousInWriteQueue() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    static <K, V> com.google.common.cache.ReferenceEntry<K, V> nullEntry() {
        return com.google.common.cache.LocalCache.NullEntry.INSTANCE;
    }

    static <E> java.util.Queue<E> discardingQueue() {
        return (java.util.Queue<E>) DISCARDING_QUEUE;
    }

    static class StrongEntry<K, V> extends com.google.common.cache.LocalCache.AbstractReferenceEntry<K, V> {
        final int hash;
        final K key;
        final com.google.common.cache.ReferenceEntry<K, V> next;
        volatile com.google.common.cache.LocalCache.ValueReference<K, V> valueReference = com.google.common.cache.LocalCache.unset();

        StrongEntry(K k, int i, com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
            this.key = k;
            this.hash = i;
            this.next = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public K getKey() {
            return this.key;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public com.google.common.cache.LocalCache.ValueReference<K, V> getValueReference() {
            return this.valueReference;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setValueReference(com.google.common.cache.LocalCache.ValueReference<K, V> valueReference) {
            this.valueReference = valueReference;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public int getHash() {
            return this.hash;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getNext() {
            return this.next;
        }
    }

    static final class StrongAccessEntry<K, V> extends com.google.common.cache.LocalCache.StrongEntry<K, V> {
        volatile long accessTime;
        com.google.common.cache.ReferenceEntry<K, V> nextAccess;
        com.google.common.cache.ReferenceEntry<K, V> previousAccess;

        StrongAccessEntry(K k, int i, com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
            super(k, i, referenceEntry);
            this.accessTime = Long.MAX_VALUE;
            this.nextAccess = com.google.common.cache.LocalCache.nullEntry();
            this.previousAccess = com.google.common.cache.LocalCache.nullEntry();
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final long getAccessTime() {
            return this.accessTime;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final void setAccessTime(long j) {
            this.accessTime = j;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final com.google.common.cache.ReferenceEntry<K, V> getNextInAccessQueue() {
            return this.nextAccess;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final void setNextInAccessQueue(com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
            this.nextAccess = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final com.google.common.cache.ReferenceEntry<K, V> getPreviousInAccessQueue() {
            return this.previousAccess;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final void setPreviousInAccessQueue(com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
            this.previousAccess = referenceEntry;
        }
    }

    static final class StrongWriteEntry<K, V> extends com.google.common.cache.LocalCache.StrongEntry<K, V> {
        com.google.common.cache.ReferenceEntry<K, V> nextWrite;
        com.google.common.cache.ReferenceEntry<K, V> previousWrite;
        volatile long writeTime;

        StrongWriteEntry(K k, int i, com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
            super(k, i, referenceEntry);
            this.writeTime = Long.MAX_VALUE;
            this.nextWrite = com.google.common.cache.LocalCache.nullEntry();
            this.previousWrite = com.google.common.cache.LocalCache.nullEntry();
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final long getWriteTime() {
            return this.writeTime;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final void setWriteTime(long j) {
            this.writeTime = j;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final com.google.common.cache.ReferenceEntry<K, V> getNextInWriteQueue() {
            return this.nextWrite;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final void setNextInWriteQueue(com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
            this.nextWrite = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final com.google.common.cache.ReferenceEntry<K, V> getPreviousInWriteQueue() {
            return this.previousWrite;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final void setPreviousInWriteQueue(com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
            this.previousWrite = referenceEntry;
        }
    }

    static final class StrongAccessWriteEntry<K, V> extends com.google.common.cache.LocalCache.StrongEntry<K, V> {
        volatile long accessTime;
        com.google.common.cache.ReferenceEntry<K, V> nextAccess;
        com.google.common.cache.ReferenceEntry<K, V> nextWrite;
        com.google.common.cache.ReferenceEntry<K, V> previousAccess;
        com.google.common.cache.ReferenceEntry<K, V> previousWrite;
        volatile long writeTime;

        StrongAccessWriteEntry(K k, int i, com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
            super(k, i, referenceEntry);
            this.accessTime = Long.MAX_VALUE;
            this.nextAccess = com.google.common.cache.LocalCache.nullEntry();
            this.previousAccess = com.google.common.cache.LocalCache.nullEntry();
            this.writeTime = Long.MAX_VALUE;
            this.nextWrite = com.google.common.cache.LocalCache.nullEntry();
            this.previousWrite = com.google.common.cache.LocalCache.nullEntry();
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final long getAccessTime() {
            return this.accessTime;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final void setAccessTime(long j) {
            this.accessTime = j;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final com.google.common.cache.ReferenceEntry<K, V> getNextInAccessQueue() {
            return this.nextAccess;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final void setNextInAccessQueue(com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
            this.nextAccess = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final com.google.common.cache.ReferenceEntry<K, V> getPreviousInAccessQueue() {
            return this.previousAccess;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final void setPreviousInAccessQueue(com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
            this.previousAccess = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final long getWriteTime() {
            return this.writeTime;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final void setWriteTime(long j) {
            this.writeTime = j;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final com.google.common.cache.ReferenceEntry<K, V> getNextInWriteQueue() {
            return this.nextWrite;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final void setNextInWriteQueue(com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
            this.nextWrite = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final com.google.common.cache.ReferenceEntry<K, V> getPreviousInWriteQueue() {
            return this.previousWrite;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final void setPreviousInWriteQueue(com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
            this.previousWrite = referenceEntry;
        }
    }

    static class WeakEntry<K, V> extends java.lang.ref.WeakReference<K> implements com.google.common.cache.ReferenceEntry<K, V> {
        final int hash;
        final com.google.common.cache.ReferenceEntry<K, V> next;
        volatile com.google.common.cache.LocalCache.ValueReference<K, V> valueReference;

        WeakEntry(java.lang.ref.ReferenceQueue<K> referenceQueue, K k, int i, com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
            super(k, referenceQueue);
            this.valueReference = com.google.common.cache.LocalCache.unset();
            this.hash = i;
            this.next = referenceEntry;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public K getKey() {
            return get();
        }

        public long getAccessTime() {
            throw new java.lang.UnsupportedOperationException();
        }

        public void setAccessTime(long j) {
            throw new java.lang.UnsupportedOperationException();
        }

        public com.google.common.cache.ReferenceEntry<K, V> getNextInAccessQueue() {
            throw new java.lang.UnsupportedOperationException();
        }

        public void setNextInAccessQueue(com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
            throw new java.lang.UnsupportedOperationException();
        }

        public com.google.common.cache.ReferenceEntry<K, V> getPreviousInAccessQueue() {
            throw new java.lang.UnsupportedOperationException();
        }

        public void setPreviousInAccessQueue(com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
            throw new java.lang.UnsupportedOperationException();
        }

        public long getWriteTime() {
            throw new java.lang.UnsupportedOperationException();
        }

        public void setWriteTime(long j) {
            throw new java.lang.UnsupportedOperationException();
        }

        public com.google.common.cache.ReferenceEntry<K, V> getNextInWriteQueue() {
            throw new java.lang.UnsupportedOperationException();
        }

        public void setNextInWriteQueue(com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
            throw new java.lang.UnsupportedOperationException();
        }

        public com.google.common.cache.ReferenceEntry<K, V> getPreviousInWriteQueue() {
            throw new java.lang.UnsupportedOperationException();
        }

        public void setPreviousInWriteQueue(com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public com.google.common.cache.LocalCache.ValueReference<K, V> getValueReference() {
            return this.valueReference;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setValueReference(com.google.common.cache.LocalCache.ValueReference<K, V> valueReference) {
            this.valueReference = valueReference;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public int getHash() {
            return this.hash;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getNext() {
            return this.next;
        }
    }

    static final class WeakAccessEntry<K, V> extends com.google.common.cache.LocalCache.WeakEntry<K, V> {
        volatile long accessTime;
        com.google.common.cache.ReferenceEntry<K, V> nextAccess;
        com.google.common.cache.ReferenceEntry<K, V> previousAccess;

        WeakAccessEntry(java.lang.ref.ReferenceQueue<K> referenceQueue, K k, int i, com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
            super(referenceQueue, k, i, referenceEntry);
            this.accessTime = Long.MAX_VALUE;
            this.nextAccess = com.google.common.cache.LocalCache.nullEntry();
            this.previousAccess = com.google.common.cache.LocalCache.nullEntry();
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final long getAccessTime() {
            return this.accessTime;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final void setAccessTime(long j) {
            this.accessTime = j;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final com.google.common.cache.ReferenceEntry<K, V> getNextInAccessQueue() {
            return this.nextAccess;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final void setNextInAccessQueue(com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
            this.nextAccess = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final com.google.common.cache.ReferenceEntry<K, V> getPreviousInAccessQueue() {
            return this.previousAccess;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final void setPreviousInAccessQueue(com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
            this.previousAccess = referenceEntry;
        }
    }

    static final class WeakWriteEntry<K, V> extends com.google.common.cache.LocalCache.WeakEntry<K, V> {
        com.google.common.cache.ReferenceEntry<K, V> nextWrite;
        com.google.common.cache.ReferenceEntry<K, V> previousWrite;
        volatile long writeTime;

        WeakWriteEntry(java.lang.ref.ReferenceQueue<K> referenceQueue, K k, int i, com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
            super(referenceQueue, k, i, referenceEntry);
            this.writeTime = Long.MAX_VALUE;
            this.nextWrite = com.google.common.cache.LocalCache.nullEntry();
            this.previousWrite = com.google.common.cache.LocalCache.nullEntry();
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final long getWriteTime() {
            return this.writeTime;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final void setWriteTime(long j) {
            this.writeTime = j;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final com.google.common.cache.ReferenceEntry<K, V> getNextInWriteQueue() {
            return this.nextWrite;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final void setNextInWriteQueue(com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
            this.nextWrite = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final com.google.common.cache.ReferenceEntry<K, V> getPreviousInWriteQueue() {
            return this.previousWrite;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final void setPreviousInWriteQueue(com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
            this.previousWrite = referenceEntry;
        }
    }

    static final class WeakAccessWriteEntry<K, V> extends com.google.common.cache.LocalCache.WeakEntry<K, V> {
        volatile long accessTime;
        com.google.common.cache.ReferenceEntry<K, V> nextAccess;
        com.google.common.cache.ReferenceEntry<K, V> nextWrite;
        com.google.common.cache.ReferenceEntry<K, V> previousAccess;
        com.google.common.cache.ReferenceEntry<K, V> previousWrite;
        volatile long writeTime;

        WeakAccessWriteEntry(java.lang.ref.ReferenceQueue<K> referenceQueue, K k, int i, com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
            super(referenceQueue, k, i, referenceEntry);
            this.accessTime = Long.MAX_VALUE;
            this.nextAccess = com.google.common.cache.LocalCache.nullEntry();
            this.previousAccess = com.google.common.cache.LocalCache.nullEntry();
            this.writeTime = Long.MAX_VALUE;
            this.nextWrite = com.google.common.cache.LocalCache.nullEntry();
            this.previousWrite = com.google.common.cache.LocalCache.nullEntry();
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final long getAccessTime() {
            return this.accessTime;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final void setAccessTime(long j) {
            this.accessTime = j;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final com.google.common.cache.ReferenceEntry<K, V> getNextInAccessQueue() {
            return this.nextAccess;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final void setNextInAccessQueue(com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
            this.nextAccess = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final com.google.common.cache.ReferenceEntry<K, V> getPreviousInAccessQueue() {
            return this.previousAccess;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final void setPreviousInAccessQueue(com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
            this.previousAccess = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final long getWriteTime() {
            return this.writeTime;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final void setWriteTime(long j) {
            this.writeTime = j;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final com.google.common.cache.ReferenceEntry<K, V> getNextInWriteQueue() {
            return this.nextWrite;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final void setNextInWriteQueue(com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
            this.nextWrite = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final com.google.common.cache.ReferenceEntry<K, V> getPreviousInWriteQueue() {
            return this.previousWrite;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final void setPreviousInWriteQueue(com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
            this.previousWrite = referenceEntry;
        }
    }

    static class WeakValueReference<K, V> extends java.lang.ref.WeakReference<V> implements com.google.common.cache.LocalCache.ValueReference<K, V> {
        final com.google.common.cache.ReferenceEntry<K, V> entry;

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
            return 1;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isActive() {
            return true;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isLoading() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public void notifyNewValue(V v) {
        }

        WeakValueReference(java.lang.ref.ReferenceQueue<V> referenceQueue, V v, com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
            super(v, referenceQueue);
            this.entry = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public com.google.common.cache.ReferenceEntry<K, V> getEntry() {
            return this.entry;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public com.google.common.cache.LocalCache.ValueReference<K, V> copyFor(java.lang.ref.ReferenceQueue<V> referenceQueue, V v, com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
            return new com.google.common.cache.LocalCache.WeakValueReference(referenceQueue, v, referenceEntry);
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V waitForValue() {
            return get();
        }
    }

    static class SoftValueReference<K, V> extends java.lang.ref.SoftReference<V> implements com.google.common.cache.LocalCache.ValueReference<K, V> {
        final com.google.common.cache.ReferenceEntry<K, V> entry;

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
            return 1;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isActive() {
            return true;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isLoading() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public void notifyNewValue(V v) {
        }

        SoftValueReference(java.lang.ref.ReferenceQueue<V> referenceQueue, V v, com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
            super(v, referenceQueue);
            this.entry = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public com.google.common.cache.ReferenceEntry<K, V> getEntry() {
            return this.entry;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public com.google.common.cache.LocalCache.ValueReference<K, V> copyFor(java.lang.ref.ReferenceQueue<V> referenceQueue, V v, com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
            return new com.google.common.cache.LocalCache.SoftValueReference(referenceQueue, v, referenceEntry);
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V waitForValue() {
            return get();
        }
    }

    static class StrongValueReference<K, V> implements com.google.common.cache.LocalCache.ValueReference<K, V> {
        final V referent;

        @Override // com.google.common.cache.LocalCache.ValueReference
        public com.google.common.cache.LocalCache.ValueReference<K, V> copyFor(java.lang.ref.ReferenceQueue<V> referenceQueue, V v, com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
            return this;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public com.google.common.cache.ReferenceEntry<K, V> getEntry() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
            return 1;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isActive() {
            return true;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isLoading() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public void notifyNewValue(V v) {
        }

        StrongValueReference(V v) {
            this.referent = v;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V get() {
            return this.referent;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V waitForValue() {
            return get();
        }
    }

    static final class WeightedWeakValueReference<K, V> extends com.google.common.cache.LocalCache.WeakValueReference<K, V> {
        final int weight;

        WeightedWeakValueReference(java.lang.ref.ReferenceQueue<V> referenceQueue, V v, com.google.common.cache.ReferenceEntry<K, V> referenceEntry, int i) {
            super(referenceQueue, v, referenceEntry);
            this.weight = i;
        }

        @Override // com.google.common.cache.LocalCache.WeakValueReference, com.google.common.cache.LocalCache.ValueReference
        public final int getWeight() {
            return this.weight;
        }

        @Override // com.google.common.cache.LocalCache.WeakValueReference, com.google.common.cache.LocalCache.ValueReference
        public final com.google.common.cache.LocalCache.ValueReference<K, V> copyFor(java.lang.ref.ReferenceQueue<V> referenceQueue, V v, com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
            return new com.google.common.cache.LocalCache.WeightedWeakValueReference(referenceQueue, v, referenceEntry, this.weight);
        }
    }

    static final class WeightedSoftValueReference<K, V> extends com.google.common.cache.LocalCache.SoftValueReference<K, V> {
        final int weight;

        WeightedSoftValueReference(java.lang.ref.ReferenceQueue<V> referenceQueue, V v, com.google.common.cache.ReferenceEntry<K, V> referenceEntry, int i) {
            super(referenceQueue, v, referenceEntry);
            this.weight = i;
        }

        @Override // com.google.common.cache.LocalCache.SoftValueReference, com.google.common.cache.LocalCache.ValueReference
        public final int getWeight() {
            return this.weight;
        }

        @Override // com.google.common.cache.LocalCache.SoftValueReference, com.google.common.cache.LocalCache.ValueReference
        public final com.google.common.cache.LocalCache.ValueReference<K, V> copyFor(java.lang.ref.ReferenceQueue<V> referenceQueue, V v, com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
            return new com.google.common.cache.LocalCache.WeightedSoftValueReference(referenceQueue, v, referenceEntry, this.weight);
        }
    }

    static final class WeightedStrongValueReference<K, V> extends com.google.common.cache.LocalCache.StrongValueReference<K, V> {
        final int weight;

        WeightedStrongValueReference(V v, int i) {
            super(v);
            this.weight = i;
        }

        @Override // com.google.common.cache.LocalCache.StrongValueReference, com.google.common.cache.LocalCache.ValueReference
        public final int getWeight() {
            return this.weight;
        }
    }

    final com.google.common.cache.ReferenceEntry<K, V> newEntry(K k, int i, com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
        com.google.common.cache.LocalCache.Segment<K, V> segmentFor = segmentFor(i);
        segmentFor.lock();
        try {
            return segmentFor.newEntry(k, i, referenceEntry);
        } finally {
            segmentFor.unlock();
        }
    }

    final com.google.common.cache.ReferenceEntry<K, V> copyEntry(com.google.common.cache.ReferenceEntry<K, V> referenceEntry, com.google.common.cache.ReferenceEntry<K, V> referenceEntry2) {
        return segmentFor(referenceEntry.getHash()).copyEntry(referenceEntry, referenceEntry2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final com.google.common.cache.LocalCache.ValueReference<K, V> newValueReference(com.google.common.cache.ReferenceEntry<K, V> referenceEntry, V v, int i) {
        return this.valueStrength.referenceValue(segmentFor(referenceEntry.getHash()), referenceEntry, com.google.common.base.Preconditions.checkNotNull(v), i);
    }

    final int hash(java.lang.Object obj) {
        return rehash(this.keyEquivalence.hash(obj));
    }

    final void reclaimValue(com.google.common.cache.LocalCache.ValueReference<K, V> valueReference) {
        com.google.common.cache.ReferenceEntry<K, V> entry = valueReference.getEntry();
        int hash = entry.getHash();
        segmentFor(hash).reclaimValue(entry.getKey(), hash, valueReference);
    }

    final void reclaimKey(com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
        int hash = referenceEntry.getHash();
        segmentFor(hash).reclaimKey(referenceEntry, hash);
    }

    final boolean isLive(com.google.common.cache.ReferenceEntry<K, V> referenceEntry, long j) {
        return segmentFor(referenceEntry.getHash()).getLiveValue(referenceEntry, j) != null;
    }

    final com.google.common.cache.LocalCache.Segment<K, V> segmentFor(int i) {
        return this.segments[(i >>> this.segmentShift) & this.segmentMask];
    }

    final com.google.common.cache.LocalCache.Segment<K, V> createSegment(int i, long j, com.google.common.cache.AbstractCache.StatsCounter statsCounter) {
        return new com.google.common.cache.LocalCache.Segment<>(this, i, j, statsCounter);
    }

    final V getLiveValue(com.google.common.cache.ReferenceEntry<K, V> referenceEntry, long j) {
        V v;
        if (referenceEntry.getKey() == null || (v = referenceEntry.getValueReference().get()) == null || isExpired(referenceEntry, j)) {
            return null;
        }
        return v;
    }

    final boolean isExpired(com.google.common.cache.ReferenceEntry<K, V> referenceEntry, long j) {
        com.google.common.base.Preconditions.checkNotNull(referenceEntry);
        if (!expiresAfterAccess() || j - referenceEntry.getAccessTime() < this.expireAfterAccessNanos) {
            return expiresAfterWrite() && j - referenceEntry.getWriteTime() >= this.expireAfterWriteNanos;
        }
        return true;
    }

    static <K, V> void connectAccessOrder(com.google.common.cache.ReferenceEntry<K, V> referenceEntry, com.google.common.cache.ReferenceEntry<K, V> referenceEntry2) {
        referenceEntry.setNextInAccessQueue(referenceEntry2);
        referenceEntry2.setPreviousInAccessQueue(referenceEntry);
    }

    static <K, V> void nullifyAccessOrder(com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
        com.google.common.cache.ReferenceEntry<K, V> nullEntry = nullEntry();
        referenceEntry.setNextInAccessQueue(nullEntry);
        referenceEntry.setPreviousInAccessQueue(nullEntry);
    }

    static <K, V> void connectWriteOrder(com.google.common.cache.ReferenceEntry<K, V> referenceEntry, com.google.common.cache.ReferenceEntry<K, V> referenceEntry2) {
        referenceEntry.setNextInWriteQueue(referenceEntry2);
        referenceEntry2.setPreviousInWriteQueue(referenceEntry);
    }

    static <K, V> void nullifyWriteOrder(com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
        com.google.common.cache.ReferenceEntry<K, V> nullEntry = nullEntry();
        referenceEntry.setNextInWriteQueue(nullEntry);
        referenceEntry.setPreviousInWriteQueue(nullEntry);
    }

    final void processPendingNotifications() {
        while (true) {
            com.google.common.cache.RemovalNotification<K, V> poll = this.removalNotificationQueue.poll();
            if (poll == null) {
                return;
            }
            try {
                this.removalListener.onRemoval(poll);
            } catch (java.lang.Throwable th) {
                logger.log(java.util.logging.Level.WARNING, "Exception thrown by removal listener", th);
            }
        }
    }

    final com.google.common.cache.LocalCache.Segment<K, V>[] newSegmentArray(int i) {
        return new com.google.common.cache.LocalCache.Segment[i];
    }

    static final class Segment<K, V> extends java.util.concurrent.locks.ReentrantLock {
        final java.util.Queue<com.google.common.cache.ReferenceEntry<K, V>> accessQueue;
        volatile int count;
        final java.lang.ref.ReferenceQueue<K> keyReferenceQueue;
        final com.google.common.cache.LocalCache<K, V> map;
        final long maxSegmentWeight;
        int modCount;
        final java.util.concurrent.atomic.AtomicInteger readCount = new java.util.concurrent.atomic.AtomicInteger();
        final java.util.Queue<com.google.common.cache.ReferenceEntry<K, V>> recencyQueue;
        final com.google.common.cache.AbstractCache.StatsCounter statsCounter;
        volatile java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> table;
        int threshold;
        long totalWeight;
        final java.lang.ref.ReferenceQueue<V> valueReferenceQueue;
        final java.util.Queue<com.google.common.cache.ReferenceEntry<K, V>> writeQueue;

        Segment(com.google.common.cache.LocalCache<K, V> localCache, int i, long j, com.google.common.cache.AbstractCache.StatsCounter statsCounter) {
            this.map = localCache;
            this.maxSegmentWeight = j;
            this.statsCounter = (com.google.common.cache.AbstractCache.StatsCounter) com.google.common.base.Preconditions.checkNotNull(statsCounter);
            initTable(newEntryArray(i));
            this.keyReferenceQueue = localCache.usesKeyReferences() ? new java.lang.ref.ReferenceQueue<>() : null;
            this.valueReferenceQueue = localCache.usesValueReferences() ? new java.lang.ref.ReferenceQueue<>() : null;
            this.recencyQueue = localCache.usesAccessQueue() ? new java.util.concurrent.ConcurrentLinkedQueue<>() : com.google.common.cache.LocalCache.discardingQueue();
            this.writeQueue = localCache.usesWriteQueue() ? new com.google.common.cache.LocalCache.WriteQueue<>() : com.google.common.cache.LocalCache.discardingQueue();
            this.accessQueue = localCache.usesAccessQueue() ? new com.google.common.cache.LocalCache.AccessQueue<>() : com.google.common.cache.LocalCache.discardingQueue();
        }

        final java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> newEntryArray(int i) {
            return new java.util.concurrent.atomic.AtomicReferenceArray<>(i);
        }

        final void initTable(java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> atomicReferenceArray) {
            this.threshold = (atomicReferenceArray.length() * 3) / 4;
            if (!this.map.customWeigher()) {
                int i = this.threshold;
                if (i == this.maxSegmentWeight) {
                    this.threshold = i + 1;
                }
            }
            this.table = atomicReferenceArray;
        }

        /* JADX WARN: Multi-variable type inference failed */
        final com.google.common.cache.ReferenceEntry<K, V> newEntry(K k, int i, com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
            return this.map.entryFactory.newEntry(this, com.google.common.base.Preconditions.checkNotNull(k), i, referenceEntry);
        }

        final com.google.common.cache.ReferenceEntry<K, V> copyEntry(com.google.common.cache.ReferenceEntry<K, V> referenceEntry, com.google.common.cache.ReferenceEntry<K, V> referenceEntry2) {
            K key = referenceEntry.getKey();
            if (key == null) {
                return null;
            }
            com.google.common.cache.LocalCache.ValueReference<K, V> valueReference = referenceEntry.getValueReference();
            V v = valueReference.get();
            if (v == null && valueReference.isActive()) {
                return null;
            }
            com.google.common.cache.ReferenceEntry<K, V> copyEntry = this.map.entryFactory.copyEntry(this, referenceEntry, referenceEntry2, key);
            copyEntry.setValueReference(valueReference.copyFor(this.valueReferenceQueue, v, copyEntry));
            return copyEntry;
        }

        final void setValue(com.google.common.cache.ReferenceEntry<K, V> referenceEntry, K k, V v, long j) {
            com.google.common.cache.LocalCache.ValueReference<K, V> valueReference = referenceEntry.getValueReference();
            int weigh = this.map.weigher.weigh(k, v);
            com.google.common.base.Preconditions.checkState(weigh >= 0, "Weights must be non-negative");
            referenceEntry.setValueReference(this.map.valueStrength.referenceValue(this, referenceEntry, v, weigh));
            recordWrite(referenceEntry, weigh, j);
            valueReference.notifyNewValue(v);
        }

        final V get(K k, int i, com.google.common.cache.CacheLoader<? super K, V> cacheLoader) throws java.util.concurrent.ExecutionException {
            com.google.common.cache.ReferenceEntry<K, V> entry;
            com.google.common.base.Preconditions.checkNotNull(k);
            com.google.common.base.Preconditions.checkNotNull(cacheLoader);
            try {
                try {
                    if (this.count != 0 && (entry = getEntry(k, i)) != null) {
                        long read = this.map.ticker.read();
                        V liveValue = getLiveValue(entry, read);
                        if (liveValue != null) {
                            recordRead(entry, read);
                            this.statsCounter.recordHits(1);
                            return scheduleRefresh(entry, k, i, liveValue, read, cacheLoader);
                        }
                        com.google.common.cache.LocalCache.ValueReference<K, V> valueReference = entry.getValueReference();
                        if (valueReference.isLoading()) {
                            return waitForLoadingValue(entry, k, valueReference);
                        }
                    }
                    return lockedGetOrLoad(k, i, cacheLoader);
                } catch (java.util.concurrent.ExecutionException e) {
                    java.lang.Throwable cause = e.getCause();
                    if (cause instanceof java.lang.Error) {
                        throw new com.google.common.util.concurrent.ExecutionError((java.lang.Error) cause);
                    }
                    if (cause instanceof java.lang.RuntimeException) {
                        throw new com.google.common.util.concurrent.UncheckedExecutionException(cause);
                    }
                    throw e;
                }
            } finally {
                postReadCleanup();
            }
        }

        final V get(java.lang.Object obj, int i) {
            try {
                if (this.count != 0) {
                    long read = this.map.ticker.read();
                    com.google.common.cache.ReferenceEntry<K, V> liveEntry = getLiveEntry(obj, i, read);
                    if (liveEntry == null) {
                        return null;
                    }
                    V v = liveEntry.getValueReference().get();
                    if (v != null) {
                        recordRead(liveEntry, read);
                        return scheduleRefresh(liveEntry, liveEntry.getKey(), i, v, read, this.map.defaultLoader);
                    }
                    tryDrainReferenceQueues();
                }
                return null;
            } finally {
                postReadCleanup();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x009f, code lost:
        
            if (r1 == false) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x00a1, code lost:
        
            r15 = new com.google.common.cache.LocalCache.LoadingValueReference<>();
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x00a6, code lost:
        
            if (r14 != null) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00a8, code lost:
        
            r14 = newEntry(r18, r19, r13);
            r14.setValueReference(r15);
            r10.set(r12, r14);
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00b3, code lost:
        
            r14.setValueReference(r15);
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00bc, code lost:
        
            if (r1 == false) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00da, code lost:
        
            return waitForLoadingValue(r14, r18, r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00be, code lost:
        
            monitor-enter(r14);
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00c1, code lost:
        
            r0 = loadSync(r18, r19, r15, r20);
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00c5, code lost:
        
            monitor-exit(r14);
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00cb, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00cf, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00d0, code lost:
        
            r17.statsCounter.recordMisses(1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00d5, code lost:
        
            throw r0;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final V lockedGetOrLoad(K k, int i, com.google.common.cache.CacheLoader<? super K, V> cacheLoader) throws java.util.concurrent.ExecutionException {
            boolean z;
            com.google.common.cache.LocalCache.ValueReference<K, V> valueReference;
            lock();
            try {
                long read = this.map.ticker.read();
                preWriteCleanup(read);
                int i2 = this.count;
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                int length = i & (atomicReferenceArray.length() - 1);
                com.google.common.cache.ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
                com.google.common.cache.ReferenceEntry<K, V> referenceEntry2 = referenceEntry;
                while (true) {
                    com.google.common.cache.LocalCache.LoadingValueReference<K, V> loadingValueReference = null;
                    if (referenceEntry2 == null) {
                        z = true;
                        valueReference = null;
                        break;
                    }
                    K key = referenceEntry2.getKey();
                    if (referenceEntry2.getHash() != i || key == null || !this.map.keyEquivalence.equivalent(k, key)) {
                        referenceEntry2 = referenceEntry2.getNext();
                    } else {
                        com.google.common.cache.LocalCache.ValueReference<K, V> valueReference2 = referenceEntry2.getValueReference();
                        if (valueReference2.isLoading()) {
                            z = false;
                        } else {
                            V v = valueReference2.get();
                            if (v == null) {
                                enqueueNotification(key, i, v, valueReference2.getWeight(), com.google.common.cache.RemovalCause.COLLECTED);
                            } else if (this.map.isExpired(referenceEntry2, read)) {
                                enqueueNotification(key, i, v, valueReference2.getWeight(), com.google.common.cache.RemovalCause.EXPIRED);
                            } else {
                                recordLockedRead(referenceEntry2, read);
                                this.statsCounter.recordHits(1);
                                return v;
                            }
                            this.writeQueue.remove(referenceEntry2);
                            this.accessQueue.remove(referenceEntry2);
                            this.count = i2 - 1;
                            z = true;
                        }
                        valueReference = valueReference2;
                    }
                }
            } finally {
                unlock();
                postWriteCleanup();
            }
        }

        final V waitForLoadingValue(com.google.common.cache.ReferenceEntry<K, V> referenceEntry, K k, com.google.common.cache.LocalCache.ValueReference<K, V> valueReference) throws java.util.concurrent.ExecutionException {
            if (!valueReference.isLoading()) {
                throw new java.lang.AssertionError();
            }
            com.google.common.base.Preconditions.checkState(!java.lang.Thread.holdsLock(referenceEntry), "Recursive load of: %s", k);
            try {
                V waitForValue = valueReference.waitForValue();
                if (waitForValue == null) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("CacheLoader returned null for key ");
                    sb.append(k);
                    sb.append(".");
                    throw new com.google.common.cache.CacheLoader.InvalidCacheLoadException(sb.toString());
                }
                recordRead(referenceEntry, this.map.ticker.read());
                return waitForValue;
            } finally {
                this.statsCounter.recordMisses(1);
            }
        }

        final V loadSync(K k, int i, com.google.common.cache.LocalCache.LoadingValueReference<K, V> loadingValueReference, com.google.common.cache.CacheLoader<? super K, V> cacheLoader) throws java.util.concurrent.ExecutionException {
            return getAndRecordStats(k, i, loadingValueReference, loadingValueReference.loadFuture(k, cacheLoader));
        }

        final com.google.common.util.concurrent.ListenableFuture<V> loadAsync(final K k, final int i, final com.google.common.cache.LocalCache.LoadingValueReference<K, V> loadingValueReference, com.google.common.cache.CacheLoader<? super K, V> cacheLoader) {
            final com.google.common.util.concurrent.ListenableFuture<V> loadFuture = loadingValueReference.loadFuture(k, cacheLoader);
            loadFuture.addListener(new java.lang.Runnable() { // from class: com.google.common.cache.LocalCache$Segment$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.common.cache.LocalCache.Segment.this.m10309lambda$loadAsync$0$comgooglecommoncacheLocalCache$Segment(k, i, loadingValueReference, loadFuture);
                }
            }, com.google.common.util.concurrent.MoreExecutors.directExecutor());
            return loadFuture;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: lambda$loadAsync$0$com-google-common-cache-LocalCache$Segment, reason: not valid java name */
        final /* synthetic */ void m10309lambda$loadAsync$0$comgooglecommoncacheLocalCache$Segment(java.lang.Object obj, int i, com.google.common.cache.LocalCache.LoadingValueReference loadingValueReference, com.google.common.util.concurrent.ListenableFuture listenableFuture) {
            try {
                getAndRecordStats(obj, i, loadingValueReference, listenableFuture);
            } catch (java.lang.Throwable th) {
                com.google.common.cache.LocalCache.logger.log(java.util.logging.Level.WARNING, "Exception thrown during refresh", th);
                loadingValueReference.setException(th);
            }
        }

        final V getAndRecordStats(K k, int i, com.google.common.cache.LocalCache.LoadingValueReference<K, V> loadingValueReference, com.google.common.util.concurrent.ListenableFuture<V> listenableFuture) throws java.util.concurrent.ExecutionException {
            V v;
            try {
                v = (V) com.google.common.util.concurrent.Uninterruptibles.getUninterruptibly(listenableFuture);
                try {
                    if (v == null) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("CacheLoader returned null for key ");
                        sb.append(k);
                        sb.append(".");
                        throw new com.google.common.cache.CacheLoader.InvalidCacheLoadException(sb.toString());
                    }
                    this.statsCounter.recordLoadSuccess(loadingValueReference.elapsedNanos());
                    storeLoadedValue(k, i, loadingValueReference, v);
                    if (v == null) {
                        this.statsCounter.recordLoadException(loadingValueReference.elapsedNanos());
                        removeLoadingValue(k, i, loadingValueReference);
                    }
                    return v;
                } catch (java.lang.Throwable th) {
                    th = th;
                    if (v == null) {
                        this.statsCounter.recordLoadException(loadingValueReference.elapsedNanos());
                        removeLoadingValue(k, i, loadingValueReference);
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                v = null;
            }
        }

        final V scheduleRefresh(com.google.common.cache.ReferenceEntry<K, V> referenceEntry, K k, int i, V v, long j, com.google.common.cache.CacheLoader<? super K, V> cacheLoader) {
            V refresh;
            return (!this.map.refreshes() || j - referenceEntry.getWriteTime() <= this.map.refreshNanos || referenceEntry.getValueReference().isLoading() || (refresh = refresh(k, i, cacheLoader, true)) == null) ? v : refresh;
        }

        final V refresh(K k, int i, com.google.common.cache.CacheLoader<? super K, V> cacheLoader, boolean z) {
            com.google.common.cache.LocalCache.LoadingValueReference<K, V> insertLoadingValueReference = insertLoadingValueReference(k, i, z);
            if (insertLoadingValueReference == null) {
                return null;
            }
            com.google.common.util.concurrent.ListenableFuture<V> loadAsync = loadAsync(k, i, insertLoadingValueReference, cacheLoader);
            if (loadAsync.isDone()) {
                try {
                    return (V) com.google.common.util.concurrent.Uninterruptibles.getUninterruptibly(loadAsync);
                } catch (java.lang.Throwable unused) {
                }
            }
            return null;
        }

        final com.google.common.cache.LocalCache.LoadingValueReference<K, V> insertLoadingValueReference(K k, int i, boolean z) {
            lock();
            try {
                long read = this.map.ticker.read();
                preWriteCleanup(read);
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                com.google.common.cache.ReferenceEntry<K, V> referenceEntry = (com.google.common.cache.ReferenceEntry) atomicReferenceArray.get(length);
                for (com.google.common.cache.ReferenceEntry referenceEntry2 = referenceEntry; referenceEntry2 != null; referenceEntry2 = referenceEntry2.getNext()) {
                    java.lang.Object key = referenceEntry2.getKey();
                    if (referenceEntry2.getHash() == i && key != null && this.map.keyEquivalence.equivalent(k, key)) {
                        com.google.common.cache.LocalCache.ValueReference<K, V> valueReference = referenceEntry2.getValueReference();
                        if (!valueReference.isLoading() && (!z || read - referenceEntry2.getWriteTime() >= this.map.refreshNanos)) {
                            this.modCount++;
                            com.google.common.cache.LocalCache.LoadingValueReference<K, V> loadingValueReference = new com.google.common.cache.LocalCache.LoadingValueReference<>(valueReference);
                            referenceEntry2.setValueReference(loadingValueReference);
                            return loadingValueReference;
                        }
                        unlock();
                        postWriteCleanup();
                        return null;
                    }
                }
                this.modCount++;
                com.google.common.cache.LocalCache.LoadingValueReference<K, V> loadingValueReference2 = new com.google.common.cache.LocalCache.LoadingValueReference<>();
                com.google.common.cache.ReferenceEntry<K, V> newEntry = newEntry(k, i, referenceEntry);
                newEntry.setValueReference(loadingValueReference2);
                atomicReferenceArray.set(length, newEntry);
                return loadingValueReference2;
            } finally {
                unlock();
                postWriteCleanup();
            }
        }

        final void tryDrainReferenceQueues() {
            if (tryLock()) {
                try {
                    drainReferenceQueues();
                } finally {
                    unlock();
                }
            }
        }

        final void drainReferenceQueues() {
            if (this.map.usesKeyReferences()) {
                drainKeyReferenceQueue();
            }
            if (this.map.usesValueReferences()) {
                drainValueReferenceQueue();
            }
        }

        final void drainKeyReferenceQueue() {
            int i = 0;
            do {
                java.lang.ref.Reference<? extends K> poll = this.keyReferenceQueue.poll();
                if (poll == null) {
                    return;
                }
                this.map.reclaimKey((com.google.common.cache.ReferenceEntry) poll);
                i++;
            } while (i != 16);
        }

        final void drainValueReferenceQueue() {
            int i = 0;
            do {
                java.lang.ref.Reference<? extends V> poll = this.valueReferenceQueue.poll();
                if (poll == null) {
                    return;
                }
                this.map.reclaimValue((com.google.common.cache.LocalCache.ValueReference) poll);
                i++;
            } while (i != 16);
        }

        final void clearReferenceQueues() {
            if (this.map.usesKeyReferences()) {
                clearKeyReferenceQueue();
            }
            if (this.map.usesValueReferences()) {
                clearValueReferenceQueue();
            }
        }

        final void clearKeyReferenceQueue() {
            while (this.keyReferenceQueue.poll() != null) {
            }
        }

        final void clearValueReferenceQueue() {
            while (this.valueReferenceQueue.poll() != null) {
            }
        }

        final void recordRead(com.google.common.cache.ReferenceEntry<K, V> referenceEntry, long j) {
            if (this.map.recordsAccess()) {
                referenceEntry.setAccessTime(j);
            }
            this.recencyQueue.add(referenceEntry);
        }

        final void recordLockedRead(com.google.common.cache.ReferenceEntry<K, V> referenceEntry, long j) {
            if (this.map.recordsAccess()) {
                referenceEntry.setAccessTime(j);
            }
            this.accessQueue.add(referenceEntry);
        }

        final void recordWrite(com.google.common.cache.ReferenceEntry<K, V> referenceEntry, int i, long j) {
            drainRecencyQueue();
            this.totalWeight += i;
            if (this.map.recordsAccess()) {
                referenceEntry.setAccessTime(j);
            }
            if (this.map.recordsWrite()) {
                referenceEntry.setWriteTime(j);
            }
            this.accessQueue.add(referenceEntry);
            this.writeQueue.add(referenceEntry);
        }

        final void drainRecencyQueue() {
            while (true) {
                com.google.common.cache.ReferenceEntry<K, V> poll = this.recencyQueue.poll();
                if (poll == null) {
                    return;
                }
                if (this.accessQueue.contains(poll)) {
                    this.accessQueue.add(poll);
                }
            }
        }

        final void tryExpireEntries(long j) {
            if (tryLock()) {
                try {
                    expireEntries(j);
                } finally {
                    unlock();
                }
            }
        }

        final void expireEntries(long j) {
            com.google.common.cache.ReferenceEntry<K, V> peek;
            com.google.common.cache.ReferenceEntry<K, V> peek2;
            drainRecencyQueue();
            do {
                peek = this.writeQueue.peek();
                if (peek == null || !this.map.isExpired(peek, j)) {
                    do {
                        peek2 = this.accessQueue.peek();
                        if (peek2 == null || !this.map.isExpired(peek2, j)) {
                            return;
                        }
                    } while (removeEntry(peek2, peek2.getHash(), com.google.common.cache.RemovalCause.EXPIRED));
                    throw new java.lang.AssertionError();
                }
            } while (removeEntry(peek, peek.getHash(), com.google.common.cache.RemovalCause.EXPIRED));
            throw new java.lang.AssertionError();
        }

        final void enqueueNotification(K k, int i, V v, int i2, com.google.common.cache.RemovalCause removalCause) {
            this.totalWeight -= i2;
            if (removalCause.wasEvicted()) {
                this.statsCounter.recordEviction();
            }
            if (this.map.removalNotificationQueue != com.google.common.cache.LocalCache.DISCARDING_QUEUE) {
                this.map.removalNotificationQueue.offer(com.google.common.cache.RemovalNotification.create(k, v, removalCause));
            }
        }

        final void evictEntries(com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
            if (this.map.evictsBySize()) {
                drainRecencyQueue();
                if (referenceEntry.getValueReference().getWeight() > this.maxSegmentWeight && !removeEntry(referenceEntry, referenceEntry.getHash(), com.google.common.cache.RemovalCause.SIZE)) {
                    throw new java.lang.AssertionError();
                }
                while (this.totalWeight > this.maxSegmentWeight) {
                    com.google.common.cache.ReferenceEntry<K, V> nextEvictable = getNextEvictable();
                    if (!removeEntry(nextEvictable, nextEvictable.getHash(), com.google.common.cache.RemovalCause.SIZE)) {
                        throw new java.lang.AssertionError();
                    }
                }
            }
        }

        final com.google.common.cache.ReferenceEntry<K, V> getNextEvictable() {
            for (com.google.common.cache.ReferenceEntry<K, V> referenceEntry : this.accessQueue) {
                if (referenceEntry.getValueReference().getWeight() > 0) {
                    return referenceEntry;
                }
            }
            throw new java.lang.AssertionError();
        }

        final com.google.common.cache.ReferenceEntry<K, V> getFirst(int i) {
            return this.table.get(i & (r0.length() - 1));
        }

        final com.google.common.cache.ReferenceEntry<K, V> getEntry(java.lang.Object obj, int i) {
            for (com.google.common.cache.ReferenceEntry<K, V> first = getFirst(i); first != null; first = first.getNext()) {
                if (first.getHash() == i) {
                    K key = first.getKey();
                    if (key == null) {
                        tryDrainReferenceQueues();
                    } else if (this.map.keyEquivalence.equivalent(obj, key)) {
                        return first;
                    }
                }
            }
            return null;
        }

        final com.google.common.cache.ReferenceEntry<K, V> getLiveEntry(java.lang.Object obj, int i, long j) {
            com.google.common.cache.ReferenceEntry<K, V> entry = getEntry(obj, i);
            if (entry == null) {
                return null;
            }
            if (!this.map.isExpired(entry, j)) {
                return entry;
            }
            tryExpireEntries(j);
            return null;
        }

        final V getLiveValue(com.google.common.cache.ReferenceEntry<K, V> referenceEntry, long j) {
            if (referenceEntry.getKey() == null) {
                tryDrainReferenceQueues();
                return null;
            }
            V v = referenceEntry.getValueReference().get();
            if (v == null) {
                tryDrainReferenceQueues();
                return null;
            }
            if (!this.map.isExpired(referenceEntry, j)) {
                return v;
            }
            tryExpireEntries(j);
            return null;
        }

        final boolean containsKey(java.lang.Object obj, int i) {
            try {
                if (this.count == 0) {
                    return false;
                }
                com.google.common.cache.ReferenceEntry<K, V> liveEntry = getLiveEntry(obj, i, this.map.ticker.read());
                if (liveEntry == null) {
                    return false;
                }
                return liveEntry.getValueReference().get() != null;
            } finally {
                postReadCleanup();
            }
        }

        final boolean containsValue(java.lang.Object obj) {
            try {
                if (this.count != 0) {
                    long read = this.map.ticker.read();
                    java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                    int length = atomicReferenceArray.length();
                    for (int i = 0; i < length; i++) {
                        for (com.google.common.cache.ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(i); referenceEntry != null; referenceEntry = referenceEntry.getNext()) {
                            V liveValue = getLiveValue(referenceEntry, read);
                            if (liveValue != null && this.map.valueEquivalence.equivalent(obj, liveValue)) {
                                postReadCleanup();
                                return true;
                            }
                        }
                    }
                }
                return false;
            } finally {
                postReadCleanup();
            }
        }

        final V put(K k, int i, V v, boolean z) {
            int i2;
            lock();
            try {
                long read = this.map.ticker.read();
                preWriteCleanup(read);
                if (this.count + 1 > this.threshold) {
                    expand();
                }
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                int length = i & (atomicReferenceArray.length() - 1);
                com.google.common.cache.ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
                com.google.common.cache.ReferenceEntry<K, V> referenceEntry2 = referenceEntry;
                while (true) {
                    if (referenceEntry2 != null) {
                        K key = referenceEntry2.getKey();
                        if (referenceEntry2.getHash() != i || key == null || !this.map.keyEquivalence.equivalent(k, key)) {
                            referenceEntry2 = referenceEntry2.getNext();
                        } else {
                            com.google.common.cache.LocalCache.ValueReference<K, V> valueReference = referenceEntry2.getValueReference();
                            V v2 = valueReference.get();
                            if (v2 != null) {
                                if (z) {
                                    recordLockedRead(referenceEntry2, read);
                                } else {
                                    this.modCount++;
                                    enqueueNotification(k, i, v2, valueReference.getWeight(), com.google.common.cache.RemovalCause.REPLACED);
                                    setValue(referenceEntry2, k, v, read);
                                    evictEntries(referenceEntry2);
                                }
                                return v2;
                            }
                            this.modCount++;
                            if (valueReference.isActive()) {
                                enqueueNotification(k, i, v2, valueReference.getWeight(), com.google.common.cache.RemovalCause.COLLECTED);
                                setValue(referenceEntry2, k, v, read);
                                i2 = this.count;
                            } else {
                                setValue(referenceEntry2, k, v, read);
                                i2 = this.count + 1;
                            }
                            this.count = i2;
                            evictEntries(referenceEntry2);
                        }
                    } else {
                        this.modCount++;
                        com.google.common.cache.ReferenceEntry<K, V> newEntry = newEntry(k, i, referenceEntry);
                        setValue(newEntry, k, v, read);
                        atomicReferenceArray.set(length, newEntry);
                        this.count++;
                        evictEntries(newEntry);
                        break;
                    }
                }
                unlock();
                postWriteCleanup();
                return null;
            } finally {
                unlock();
                postWriteCleanup();
            }
        }

        final void expand() {
            java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> atomicReferenceArray = this.table;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i = this.count;
            java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> newEntryArray = newEntryArray(length << 1);
            this.threshold = (newEntryArray.length() * 3) / 4;
            int length2 = newEntryArray.length() - 1;
            for (int i2 = 0; i2 < length; i2++) {
                com.google.common.cache.ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(i2);
                if (referenceEntry != null) {
                    com.google.common.cache.ReferenceEntry<K, V> next = referenceEntry.getNext();
                    int hash = referenceEntry.getHash() & length2;
                    if (next == null) {
                        newEntryArray.set(hash, referenceEntry);
                    } else {
                        com.google.common.cache.ReferenceEntry<K, V> referenceEntry2 = referenceEntry;
                        while (next != null) {
                            int hash2 = next.getHash() & length2;
                            if (hash2 != hash) {
                                referenceEntry2 = next;
                                hash = hash2;
                            }
                            next = next.getNext();
                        }
                        newEntryArray.set(hash, referenceEntry2);
                        while (referenceEntry != referenceEntry2) {
                            int hash3 = referenceEntry.getHash() & length2;
                            com.google.common.cache.ReferenceEntry<K, V> copyEntry = copyEntry(referenceEntry, newEntryArray.get(hash3));
                            if (copyEntry != null) {
                                newEntryArray.set(hash3, copyEntry);
                            } else {
                                removeCollectedEntry(referenceEntry);
                                i--;
                            }
                            referenceEntry = referenceEntry.getNext();
                        }
                    }
                }
            }
            this.table = newEntryArray;
            this.count = i;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x00ad, code lost:
        
            unlock();
            postWriteCleanup();
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x00b4, code lost:
        
            return false;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final boolean replace(K k, int i, V v, V v2) {
            lock();
            try {
                long read = this.map.ticker.read();
                preWriteCleanup(read);
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                int length = i & (atomicReferenceArray.length() - 1);
                com.google.common.cache.ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
                com.google.common.cache.ReferenceEntry<K, V> referenceEntry2 = referenceEntry;
                while (true) {
                    if (referenceEntry2 == null) {
                        break;
                    }
                    K key = referenceEntry2.getKey();
                    if (referenceEntry2.getHash() == i && key != null) {
                        if (this.map.keyEquivalence.equivalent(k, key)) {
                            com.google.common.cache.LocalCache.ValueReference<K, V> valueReference = referenceEntry2.getValueReference();
                            V v3 = valueReference.get();
                            if (v3 == null) {
                                if (valueReference.isActive()) {
                                    this.modCount++;
                                    com.google.common.cache.ReferenceEntry<K, V> removeValueFromChain = removeValueFromChain(referenceEntry, referenceEntry2, key, i, v3, valueReference, com.google.common.cache.RemovalCause.COLLECTED);
                                    int i2 = this.count;
                                    atomicReferenceArray.set(length, removeValueFromChain);
                                    this.count = i2 - 1;
                                }
                            } else {
                                if (this.map.valueEquivalence.equivalent(v, v3)) {
                                    this.modCount++;
                                    enqueueNotification(k, i, v3, valueReference.getWeight(), com.google.common.cache.RemovalCause.REPLACED);
                                    setValue(referenceEntry2, k, v2, read);
                                    evictEntries(referenceEntry2);
                                    return true;
                                }
                                recordLockedRead(referenceEntry2, read);
                            }
                        }
                    }
                    referenceEntry2 = referenceEntry2.getNext();
                }
            } finally {
                unlock();
                postWriteCleanup();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x009d, code lost:
        
            unlock();
            postWriteCleanup();
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x00a4, code lost:
        
            return null;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final V replace(K k, int i, V v) {
            lock();
            try {
                long read = this.map.ticker.read();
                preWriteCleanup(read);
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                int length = i & (atomicReferenceArray.length() - 1);
                com.google.common.cache.ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
                com.google.common.cache.ReferenceEntry<K, V> referenceEntry2 = referenceEntry;
                while (true) {
                    if (referenceEntry2 == null) {
                        break;
                    }
                    K key = referenceEntry2.getKey();
                    if (referenceEntry2.getHash() == i && key != null) {
                        if (this.map.keyEquivalence.equivalent(k, key)) {
                            com.google.common.cache.LocalCache.ValueReference<K, V> valueReference = referenceEntry2.getValueReference();
                            V v2 = valueReference.get();
                            if (v2 == null) {
                                if (valueReference.isActive()) {
                                    this.modCount++;
                                    com.google.common.cache.ReferenceEntry<K, V> removeValueFromChain = removeValueFromChain(referenceEntry, referenceEntry2, key, i, v2, valueReference, com.google.common.cache.RemovalCause.COLLECTED);
                                    int i2 = this.count;
                                    atomicReferenceArray.set(length, removeValueFromChain);
                                    this.count = i2 - 1;
                                }
                            } else {
                                this.modCount++;
                                enqueueNotification(k, i, v2, valueReference.getWeight(), com.google.common.cache.RemovalCause.REPLACED);
                                setValue(referenceEntry2, k, v, read);
                                evictEntries(referenceEntry2);
                                return v2;
                            }
                        }
                    }
                    referenceEntry2 = referenceEntry2.getNext();
                }
            } finally {
                unlock();
                postWriteCleanup();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
        
            r9 = r5.getValueReference();
            r12 = r9.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
        
            if (r12 == null) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
        
            r2 = com.google.common.cache.RemovalCause.EXPLICIT;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
        
            r10 = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
        
            r11.modCount++;
            r13 = removeValueFromChain(r4, r5, r6, r13, r12, r9, r10);
            r2 = r11.count;
            r0.set(r1, r13);
            r11.count = r2 - 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0066, code lost:
        
            unlock();
            postWriteCleanup();
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x006c, code lost:
        
            return r12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
        
            if (r9.isActive() == false) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
        
            r2 = com.google.common.cache.RemovalCause.COLLECTED;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final V remove(java.lang.Object obj, int i) {
            lock();
            try {
                preWriteCleanup(this.map.ticker.read());
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                com.google.common.cache.ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
                com.google.common.cache.ReferenceEntry<K, V> referenceEntry2 = referenceEntry;
                while (true) {
                    if (referenceEntry2 == null) {
                        break;
                    }
                    K key = referenceEntry2.getKey();
                    if (referenceEntry2.getHash() == i && key != null && this.map.keyEquivalence.equivalent(obj, key)) {
                        break;
                    }
                    referenceEntry2 = referenceEntry2.getNext();
                }
                unlock();
                postWriteCleanup();
                return null;
            } catch (java.lang.Throwable th) {
                unlock();
                postWriteCleanup();
                throw th;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
        
            r10 = r6.getValueReference();
            r9 = r10.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
        
            if (r12.map.valueEquivalence.equivalent(r15, r9) == false) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
        
            r13 = com.google.common.cache.RemovalCause.EXPLICIT;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
        
            r12.modCount++;
            r14 = removeValueFromChain(r5, r6, r7, r14, r9, r10, r13);
            r15 = r12.count;
            r0.set(r1, r14);
            r12.count = r15 - 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x006f, code lost:
        
            if (r13 == com.google.common.cache.RemovalCause.EXPLICIT) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0071, code lost:
        
            r2 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0072, code lost:
        
            unlock();
            postWriteCleanup();
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0078, code lost:
        
            return r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
        
            if (r9 != null) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
        
            if (r10.isActive() == false) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
        
            r13 = com.google.common.cache.RemovalCause.COLLECTED;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final boolean remove(java.lang.Object obj, int i, java.lang.Object obj2) {
            lock();
            try {
                preWriteCleanup(this.map.ticker.read());
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                boolean z = true;
                int length = (atomicReferenceArray.length() - 1) & i;
                com.google.common.cache.ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
                com.google.common.cache.ReferenceEntry<K, V> referenceEntry2 = referenceEntry;
                while (true) {
                    if (referenceEntry2 == null) {
                        break;
                    }
                    K key = referenceEntry2.getKey();
                    if (referenceEntry2.getHash() == i && key != null && this.map.keyEquivalence.equivalent(obj, key)) {
                        break;
                    }
                    referenceEntry2 = referenceEntry2.getNext();
                }
                unlock();
                postWriteCleanup();
                return false;
            } catch (java.lang.Throwable th) {
                unlock();
                postWriteCleanup();
                throw th;
            }
        }

        final boolean storeLoadedValue(K k, int i, com.google.common.cache.LocalCache.LoadingValueReference<K, V> loadingValueReference, V v) {
            lock();
            try {
                long read = this.map.ticker.read();
                preWriteCleanup(read);
                int i2 = this.count + 1;
                if (i2 > this.threshold) {
                    expand();
                    i2 = this.count + 1;
                }
                int i3 = i2;
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                int length = i & (atomicReferenceArray.length() - 1);
                com.google.common.cache.ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
                com.google.common.cache.ReferenceEntry<K, V> referenceEntry2 = referenceEntry;
                while (true) {
                    if (referenceEntry2 != null) {
                        K key = referenceEntry2.getKey();
                        if (referenceEntry2.getHash() != i || key == null || !this.map.keyEquivalence.equivalent(k, key)) {
                            referenceEntry2 = referenceEntry2.getNext();
                        } else {
                            com.google.common.cache.LocalCache.ValueReference<K, V> valueReference = referenceEntry2.getValueReference();
                            V v2 = valueReference.get();
                            if (loadingValueReference != valueReference && (v2 != null || valueReference == com.google.common.cache.LocalCache.UNSET)) {
                                enqueueNotification(k, i, v, 0, com.google.common.cache.RemovalCause.REPLACED);
                                unlock();
                                postWriteCleanup();
                                return false;
                            }
                            this.modCount++;
                            if (loadingValueReference.isActive()) {
                                enqueueNotification(k, i, v2, loadingValueReference.getWeight(), v2 == null ? com.google.common.cache.RemovalCause.COLLECTED : com.google.common.cache.RemovalCause.REPLACED);
                                i3--;
                            }
                            setValue(referenceEntry2, k, v, read);
                            this.count = i3;
                            evictEntries(referenceEntry2);
                        }
                    } else {
                        this.modCount++;
                        com.google.common.cache.ReferenceEntry<K, V> newEntry = newEntry(k, i, referenceEntry);
                        setValue(newEntry, k, v, read);
                        atomicReferenceArray.set(length, newEntry);
                        this.count = i3;
                        evictEntries(newEntry);
                        break;
                    }
                }
                return true;
            } finally {
                unlock();
                postWriteCleanup();
            }
        }

        final void clear() {
            if (this.count != 0) {
                lock();
                try {
                    preWriteCleanup(this.map.ticker.read());
                    java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                    for (int i = 0; i < atomicReferenceArray.length(); i++) {
                        for (com.google.common.cache.ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(i); referenceEntry != null; referenceEntry = referenceEntry.getNext()) {
                            if (referenceEntry.getValueReference().isActive()) {
                                K key = referenceEntry.getKey();
                                V v = referenceEntry.getValueReference().get();
                                enqueueNotification(key, referenceEntry.getHash(), v, referenceEntry.getValueReference().getWeight(), (key == null || v == null) ? com.google.common.cache.RemovalCause.COLLECTED : com.google.common.cache.RemovalCause.EXPLICIT);
                            }
                        }
                    }
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        atomicReferenceArray.set(i2, null);
                    }
                    clearReferenceQueues();
                    this.writeQueue.clear();
                    this.accessQueue.clear();
                    this.readCount.set(0);
                    this.modCount++;
                    this.count = 0;
                } finally {
                    unlock();
                    postWriteCleanup();
                }
            }
        }

        final com.google.common.cache.ReferenceEntry<K, V> removeValueFromChain(com.google.common.cache.ReferenceEntry<K, V> referenceEntry, com.google.common.cache.ReferenceEntry<K, V> referenceEntry2, K k, int i, V v, com.google.common.cache.LocalCache.ValueReference<K, V> valueReference, com.google.common.cache.RemovalCause removalCause) {
            enqueueNotification(k, i, v, valueReference.getWeight(), removalCause);
            this.writeQueue.remove(referenceEntry2);
            this.accessQueue.remove(referenceEntry2);
            if (valueReference.isLoading()) {
                valueReference.notifyNewValue(null);
                return referenceEntry;
            }
            return removeEntryFromChain(referenceEntry, referenceEntry2);
        }

        final com.google.common.cache.ReferenceEntry<K, V> removeEntryFromChain(com.google.common.cache.ReferenceEntry<K, V> referenceEntry, com.google.common.cache.ReferenceEntry<K, V> referenceEntry2) {
            int i = this.count;
            com.google.common.cache.ReferenceEntry<K, V> next = referenceEntry2.getNext();
            while (referenceEntry != referenceEntry2) {
                com.google.common.cache.ReferenceEntry<K, V> copyEntry = copyEntry(referenceEntry, next);
                if (copyEntry != null) {
                    next = copyEntry;
                } else {
                    removeCollectedEntry(referenceEntry);
                    i--;
                }
                referenceEntry = referenceEntry.getNext();
            }
            this.count = i;
            return next;
        }

        final void removeCollectedEntry(com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
            enqueueNotification(referenceEntry.getKey(), referenceEntry.getHash(), referenceEntry.getValueReference().get(), referenceEntry.getValueReference().getWeight(), com.google.common.cache.RemovalCause.COLLECTED);
            this.writeQueue.remove(referenceEntry);
            this.accessQueue.remove(referenceEntry);
        }

        final boolean reclaimKey(com.google.common.cache.ReferenceEntry<K, V> referenceEntry, int i) {
            lock();
            try {
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                com.google.common.cache.ReferenceEntry<K, V> referenceEntry2 = atomicReferenceArray.get(length);
                for (com.google.common.cache.ReferenceEntry<K, V> referenceEntry3 = referenceEntry2; referenceEntry3 != null; referenceEntry3 = referenceEntry3.getNext()) {
                    if (referenceEntry3 == referenceEntry) {
                        this.modCount++;
                        com.google.common.cache.ReferenceEntry<K, V> removeValueFromChain = removeValueFromChain(referenceEntry2, referenceEntry3, referenceEntry3.getKey(), i, referenceEntry3.getValueReference().get(), referenceEntry3.getValueReference(), com.google.common.cache.RemovalCause.COLLECTED);
                        int i2 = this.count;
                        atomicReferenceArray.set(length, removeValueFromChain);
                        this.count = i2 - 1;
                        return true;
                    }
                }
                unlock();
                postWriteCleanup();
                return false;
            } finally {
                unlock();
                postWriteCleanup();
            }
        }

        final boolean reclaimValue(K k, int i, com.google.common.cache.LocalCache.ValueReference<K, V> valueReference) {
            lock();
            try {
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                com.google.common.cache.ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
                for (com.google.common.cache.ReferenceEntry<K, V> referenceEntry2 = referenceEntry; referenceEntry2 != null; referenceEntry2 = referenceEntry2.getNext()) {
                    K key = referenceEntry2.getKey();
                    if (referenceEntry2.getHash() == i && key != null && this.map.keyEquivalence.equivalent(k, key)) {
                        if (referenceEntry2.getValueReference() != valueReference) {
                            unlock();
                            if (!isHeldByCurrentThread()) {
                                postWriteCleanup();
                            }
                            return false;
                        }
                        this.modCount++;
                        com.google.common.cache.ReferenceEntry<K, V> removeValueFromChain = removeValueFromChain(referenceEntry, referenceEntry2, key, i, valueReference.get(), valueReference, com.google.common.cache.RemovalCause.COLLECTED);
                        int i2 = this.count;
                        atomicReferenceArray.set(length, removeValueFromChain);
                        this.count = i2 - 1;
                        return true;
                    }
                }
                unlock();
                if (!isHeldByCurrentThread()) {
                    postWriteCleanup();
                }
                return false;
            } finally {
                unlock();
                if (!isHeldByCurrentThread()) {
                    postWriteCleanup();
                }
            }
        }

        final boolean removeLoadingValue(K k, int i, com.google.common.cache.LocalCache.LoadingValueReference<K, V> loadingValueReference) {
            lock();
            try {
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                com.google.common.cache.ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
                com.google.common.cache.ReferenceEntry<K, V> referenceEntry2 = referenceEntry;
                while (true) {
                    if (referenceEntry2 == null) {
                        break;
                    }
                    K key = referenceEntry2.getKey();
                    if (referenceEntry2.getHash() != i || key == null || !this.map.keyEquivalence.equivalent(k, key)) {
                        referenceEntry2 = referenceEntry2.getNext();
                    } else if (referenceEntry2.getValueReference() == loadingValueReference) {
                        if (loadingValueReference.isActive()) {
                            referenceEntry2.setValueReference(loadingValueReference.getOldValue());
                        } else {
                            atomicReferenceArray.set(length, removeEntryFromChain(referenceEntry, referenceEntry2));
                        }
                        return true;
                    }
                }
                unlock();
                postWriteCleanup();
                return false;
            } finally {
                unlock();
                postWriteCleanup();
            }
        }

        final boolean removeEntry(com.google.common.cache.ReferenceEntry<K, V> referenceEntry, int i, com.google.common.cache.RemovalCause removalCause) {
            java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> atomicReferenceArray = this.table;
            int length = (atomicReferenceArray.length() - 1) & i;
            com.google.common.cache.ReferenceEntry<K, V> referenceEntry2 = atomicReferenceArray.get(length);
            for (com.google.common.cache.ReferenceEntry<K, V> referenceEntry3 = referenceEntry2; referenceEntry3 != null; referenceEntry3 = referenceEntry3.getNext()) {
                if (referenceEntry3 == referenceEntry) {
                    this.modCount++;
                    com.google.common.cache.ReferenceEntry<K, V> removeValueFromChain = removeValueFromChain(referenceEntry2, referenceEntry3, referenceEntry3.getKey(), i, referenceEntry3.getValueReference().get(), referenceEntry3.getValueReference(), removalCause);
                    int i2 = this.count;
                    atomicReferenceArray.set(length, removeValueFromChain);
                    this.count = i2 - 1;
                    return true;
                }
            }
            return false;
        }

        final void postReadCleanup() {
            if ((this.readCount.incrementAndGet() & 63) == 0) {
                cleanUp();
            }
        }

        final void preWriteCleanup(long j) {
            runLockedCleanup(j);
        }

        final void postWriteCleanup() {
            runUnlockedCleanup();
        }

        final void cleanUp() {
            runLockedCleanup(this.map.ticker.read());
            runUnlockedCleanup();
        }

        final void runLockedCleanup(long j) {
            if (tryLock()) {
                try {
                    drainReferenceQueues();
                    expireEntries(j);
                    this.readCount.set(0);
                } finally {
                    unlock();
                }
            }
        }

        final void runUnlockedCleanup() {
            if (isHeldByCurrentThread()) {
                return;
            }
            this.map.processPendingNotifications();
        }
    }

    static class LoadingValueReference<K, V> implements com.google.common.cache.LocalCache.ValueReference<K, V> {
        final com.google.common.util.concurrent.SettableFuture<V> futureValue;
        volatile com.google.common.cache.LocalCache.ValueReference<K, V> oldValue;
        final com.google.common.base.Stopwatch stopwatch;

        @Override // com.google.common.cache.LocalCache.ValueReference
        public com.google.common.cache.LocalCache.ValueReference<K, V> copyFor(java.lang.ref.ReferenceQueue<V> referenceQueue, V v, com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
            return this;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public com.google.common.cache.ReferenceEntry<K, V> getEntry() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isLoading() {
            return true;
        }

        public LoadingValueReference() {
            this(com.google.common.cache.LocalCache.unset());
        }

        public LoadingValueReference(com.google.common.cache.LocalCache.ValueReference<K, V> valueReference) {
            this.futureValue = com.google.common.util.concurrent.SettableFuture.create();
            this.stopwatch = com.google.common.base.Stopwatch.createUnstarted();
            this.oldValue = valueReference;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isActive() {
            return this.oldValue.isActive();
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
            return this.oldValue.getWeight();
        }

        public boolean set(V v) {
            return this.futureValue.set(v);
        }

        public boolean setException(java.lang.Throwable th) {
            return this.futureValue.setException(th);
        }

        private com.google.common.util.concurrent.ListenableFuture<V> fullyFailedFuture(java.lang.Throwable th) {
            return com.google.common.util.concurrent.Futures.immediateFailedFuture(th);
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public void notifyNewValue(V v) {
            if (v != null) {
                set(v);
            } else {
                this.oldValue = com.google.common.cache.LocalCache.unset();
            }
        }

        public com.google.common.util.concurrent.ListenableFuture<V> loadFuture(K k, com.google.common.cache.CacheLoader<? super K, V> cacheLoader) {
            try {
                this.stopwatch.start();
                V v = this.oldValue.get();
                if (v == null) {
                    V load = cacheLoader.load(k);
                    return set(load) ? this.futureValue : com.google.common.util.concurrent.Futures.immediateFuture(load);
                }
                com.google.common.util.concurrent.ListenableFuture<V> reload = cacheLoader.reload(k, v);
                if (reload == null) {
                    return com.google.common.util.concurrent.Futures.immediateFuture(null);
                }
                return com.google.common.util.concurrent.Futures.transform(reload, new com.google.common.base.Function() { // from class: com.google.common.cache.LocalCache$LoadingValueReference$$ExternalSyntheticLambda0
                    @Override // com.google.common.base.Function
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return com.google.common.cache.LocalCache.LoadingValueReference.this.m10308x59597480(obj);
                    }
                }, com.google.common.util.concurrent.MoreExecutors.directExecutor());
            } catch (java.lang.Throwable th) {
                com.google.common.util.concurrent.ListenableFuture<V> fullyFailedFuture = setException(th) ? this.futureValue : fullyFailedFuture(th);
                if (th instanceof java.lang.InterruptedException) {
                    java.lang.Thread.currentThread().interrupt();
                }
                return fullyFailedFuture;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: lambda$loadFuture$0$com-google-common-cache-LocalCache$LoadingValueReference, reason: not valid java name */
        /* synthetic */ java.lang.Object m10308x59597480(java.lang.Object obj) {
            set(obj);
            return obj;
        }

        public long elapsedNanos() {
            return this.stopwatch.elapsed(java.util.concurrent.TimeUnit.NANOSECONDS);
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V waitForValue() throws java.util.concurrent.ExecutionException {
            return (V) com.google.common.util.concurrent.Uninterruptibles.getUninterruptibly(this.futureValue);
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V get() {
            return this.oldValue.get();
        }

        public com.google.common.cache.LocalCache.ValueReference<K, V> getOldValue() {
            return this.oldValue;
        }
    }

    static final class WriteQueue<K, V> extends java.util.AbstractQueue<com.google.common.cache.ReferenceEntry<K, V>> {
        final com.google.common.cache.ReferenceEntry<K, V> head = new com.google.common.cache.LocalCache.AbstractReferenceEntry<K, V>() { // from class: com.google.common.cache.LocalCache.WriteQueue.1
            com.google.common.cache.ReferenceEntry<K, V> nextWrite = this;
            com.google.common.cache.ReferenceEntry<K, V> previousWrite = this;

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public long getWriteTime() {
                return Long.MAX_VALUE;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public void setWriteTime(long j) {
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public com.google.common.cache.ReferenceEntry<K, V> getNextInWriteQueue() {
                return this.nextWrite;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public void setNextInWriteQueue(com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
                this.nextWrite = referenceEntry;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public com.google.common.cache.ReferenceEntry<K, V> getPreviousInWriteQueue() {
                return this.previousWrite;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public void setPreviousInWriteQueue(com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
                this.previousWrite = referenceEntry;
            }
        };

        WriteQueue() {
        }

        @Override // java.util.Queue
        public final boolean offer(com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
            com.google.common.cache.LocalCache.connectWriteOrder(referenceEntry.getPreviousInWriteQueue(), referenceEntry.getNextInWriteQueue());
            com.google.common.cache.LocalCache.connectWriteOrder(this.head.getPreviousInWriteQueue(), referenceEntry);
            com.google.common.cache.LocalCache.connectWriteOrder(referenceEntry, this.head);
            return true;
        }

        @Override // java.util.Queue
        public final com.google.common.cache.ReferenceEntry<K, V> peek() {
            com.google.common.cache.ReferenceEntry<K, V> nextInWriteQueue = this.head.getNextInWriteQueue();
            if (nextInWriteQueue == this.head) {
                return null;
            }
            return nextInWriteQueue;
        }

        @Override // java.util.Queue
        public final com.google.common.cache.ReferenceEntry<K, V> poll() {
            com.google.common.cache.ReferenceEntry<K, V> nextInWriteQueue = this.head.getNextInWriteQueue();
            if (nextInWriteQueue == this.head) {
                return null;
            }
            remove(nextInWriteQueue);
            return nextInWriteQueue;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(java.lang.Object obj) {
            com.google.common.cache.ReferenceEntry referenceEntry = (com.google.common.cache.ReferenceEntry) obj;
            com.google.common.cache.ReferenceEntry<K, V> previousInWriteQueue = referenceEntry.getPreviousInWriteQueue();
            com.google.common.cache.ReferenceEntry<K, V> nextInWriteQueue = referenceEntry.getNextInWriteQueue();
            com.google.common.cache.LocalCache.connectWriteOrder(previousInWriteQueue, nextInWriteQueue);
            com.google.common.cache.LocalCache.nullifyWriteOrder(referenceEntry);
            return nextInWriteQueue != com.google.common.cache.LocalCache.NullEntry.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(java.lang.Object obj) {
            return ((com.google.common.cache.ReferenceEntry) obj).getNextInWriteQueue() != com.google.common.cache.LocalCache.NullEntry.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return this.head.getNextInWriteQueue() == this.head;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            int i = 0;
            for (com.google.common.cache.ReferenceEntry<K, V> nextInWriteQueue = this.head.getNextInWriteQueue(); nextInWriteQueue != this.head; nextInWriteQueue = nextInWriteQueue.getNextInWriteQueue()) {
                i++;
            }
            return i;
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            com.google.common.cache.ReferenceEntry<K, V> nextInWriteQueue = this.head.getNextInWriteQueue();
            while (true) {
                com.google.common.cache.ReferenceEntry<K, V> referenceEntry = this.head;
                if (nextInWriteQueue != referenceEntry) {
                    com.google.common.cache.ReferenceEntry<K, V> nextInWriteQueue2 = nextInWriteQueue.getNextInWriteQueue();
                    com.google.common.cache.LocalCache.nullifyWriteOrder(nextInWriteQueue);
                    nextInWriteQueue = nextInWriteQueue2;
                } else {
                    referenceEntry.setNextInWriteQueue(referenceEntry);
                    com.google.common.cache.ReferenceEntry<K, V> referenceEntry2 = this.head;
                    referenceEntry2.setPreviousInWriteQueue(referenceEntry2);
                    return;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final java.util.Iterator<com.google.common.cache.ReferenceEntry<K, V>> iterator() {
            return new com.google.common.collect.AbstractSequentialIterator<com.google.common.cache.ReferenceEntry<K, V>>(peek()) { // from class: com.google.common.cache.LocalCache.WriteQueue.2
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractSequentialIterator
                public com.google.common.cache.ReferenceEntry<K, V> computeNext(com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
                    com.google.common.cache.ReferenceEntry<K, V> nextInWriteQueue = referenceEntry.getNextInWriteQueue();
                    if (nextInWriteQueue == com.google.common.cache.LocalCache.WriteQueue.this.head) {
                        return null;
                    }
                    return nextInWriteQueue;
                }
            };
        }
    }

    static final class AccessQueue<K, V> extends java.util.AbstractQueue<com.google.common.cache.ReferenceEntry<K, V>> {
        final com.google.common.cache.ReferenceEntry<K, V> head = new com.google.common.cache.LocalCache.AbstractReferenceEntry<K, V>() { // from class: com.google.common.cache.LocalCache.AccessQueue.1
            com.google.common.cache.ReferenceEntry<K, V> nextAccess = this;
            com.google.common.cache.ReferenceEntry<K, V> previousAccess = this;

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public long getAccessTime() {
                return Long.MAX_VALUE;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public void setAccessTime(long j) {
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public com.google.common.cache.ReferenceEntry<K, V> getNextInAccessQueue() {
                return this.nextAccess;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public void setNextInAccessQueue(com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
                this.nextAccess = referenceEntry;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public com.google.common.cache.ReferenceEntry<K, V> getPreviousInAccessQueue() {
                return this.previousAccess;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public void setPreviousInAccessQueue(com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
                this.previousAccess = referenceEntry;
            }
        };

        AccessQueue() {
        }

        @Override // java.util.Queue
        public final boolean offer(com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
            com.google.common.cache.LocalCache.connectAccessOrder(referenceEntry.getPreviousInAccessQueue(), referenceEntry.getNextInAccessQueue());
            com.google.common.cache.LocalCache.connectAccessOrder(this.head.getPreviousInAccessQueue(), referenceEntry);
            com.google.common.cache.LocalCache.connectAccessOrder(referenceEntry, this.head);
            return true;
        }

        @Override // java.util.Queue
        public final com.google.common.cache.ReferenceEntry<K, V> peek() {
            com.google.common.cache.ReferenceEntry<K, V> nextInAccessQueue = this.head.getNextInAccessQueue();
            if (nextInAccessQueue == this.head) {
                return null;
            }
            return nextInAccessQueue;
        }

        @Override // java.util.Queue
        public final com.google.common.cache.ReferenceEntry<K, V> poll() {
            com.google.common.cache.ReferenceEntry<K, V> nextInAccessQueue = this.head.getNextInAccessQueue();
            if (nextInAccessQueue == this.head) {
                return null;
            }
            remove(nextInAccessQueue);
            return nextInAccessQueue;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(java.lang.Object obj) {
            com.google.common.cache.ReferenceEntry referenceEntry = (com.google.common.cache.ReferenceEntry) obj;
            com.google.common.cache.ReferenceEntry<K, V> previousInAccessQueue = referenceEntry.getPreviousInAccessQueue();
            com.google.common.cache.ReferenceEntry<K, V> nextInAccessQueue = referenceEntry.getNextInAccessQueue();
            com.google.common.cache.LocalCache.connectAccessOrder(previousInAccessQueue, nextInAccessQueue);
            com.google.common.cache.LocalCache.nullifyAccessOrder(referenceEntry);
            return nextInAccessQueue != com.google.common.cache.LocalCache.NullEntry.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(java.lang.Object obj) {
            return ((com.google.common.cache.ReferenceEntry) obj).getNextInAccessQueue() != com.google.common.cache.LocalCache.NullEntry.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return this.head.getNextInAccessQueue() == this.head;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            int i = 0;
            for (com.google.common.cache.ReferenceEntry<K, V> nextInAccessQueue = this.head.getNextInAccessQueue(); nextInAccessQueue != this.head; nextInAccessQueue = nextInAccessQueue.getNextInAccessQueue()) {
                i++;
            }
            return i;
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            com.google.common.cache.ReferenceEntry<K, V> nextInAccessQueue = this.head.getNextInAccessQueue();
            while (true) {
                com.google.common.cache.ReferenceEntry<K, V> referenceEntry = this.head;
                if (nextInAccessQueue != referenceEntry) {
                    com.google.common.cache.ReferenceEntry<K, V> nextInAccessQueue2 = nextInAccessQueue.getNextInAccessQueue();
                    com.google.common.cache.LocalCache.nullifyAccessOrder(nextInAccessQueue);
                    nextInAccessQueue = nextInAccessQueue2;
                } else {
                    referenceEntry.setNextInAccessQueue(referenceEntry);
                    com.google.common.cache.ReferenceEntry<K, V> referenceEntry2 = this.head;
                    referenceEntry2.setPreviousInAccessQueue(referenceEntry2);
                    return;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final java.util.Iterator<com.google.common.cache.ReferenceEntry<K, V>> iterator() {
            return new com.google.common.collect.AbstractSequentialIterator<com.google.common.cache.ReferenceEntry<K, V>>(peek()) { // from class: com.google.common.cache.LocalCache.AccessQueue.2
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractSequentialIterator
                public com.google.common.cache.ReferenceEntry<K, V> computeNext(com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
                    com.google.common.cache.ReferenceEntry<K, V> nextInAccessQueue = referenceEntry.getNextInAccessQueue();
                    if (nextInAccessQueue == com.google.common.cache.LocalCache.AccessQueue.this.head) {
                        return null;
                    }
                    return nextInAccessQueue;
                }
            };
        }
    }

    public final void cleanUp() {
        for (com.google.common.cache.LocalCache.Segment<K, V> segment : this.segments) {
            segment.cleanUp();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        com.google.common.cache.LocalCache.Segment<K, V>[] segmentArr = this.segments;
        long j = 0;
        for (com.google.common.cache.LocalCache.Segment<K, V> segment : segmentArr) {
            if (segment.count != 0) {
                return false;
            }
            j += r8.modCount;
        }
        if (j == 0) {
            return true;
        }
        for (com.google.common.cache.LocalCache.Segment<K, V> segment2 : segmentArr) {
            if (segment2.count != 0) {
                return false;
            }
            j -= r9.modCount;
        }
        return j == 0;
    }

    final long longSize() {
        long j = 0;
        for (int i = 0; i < this.segments.length; i++) {
            j += java.lang.Math.max(0, r0[i].count);
        }
        return j;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return com.google.common.primitives.Ints.saturatedCast(longSize());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        int hash = hash(obj);
        return segmentFor(hash).get(obj, hash);
    }

    final V get(K k, com.google.common.cache.CacheLoader<? super K, V> cacheLoader) throws java.util.concurrent.ExecutionException {
        int hash = hash(com.google.common.base.Preconditions.checkNotNull(k));
        return segmentFor(hash).get(k, hash, cacheLoader);
    }

    public final V getIfPresent(java.lang.Object obj) {
        int hash = hash(com.google.common.base.Preconditions.checkNotNull(obj));
        V v = segmentFor(hash).get(obj, hash);
        if (v == null) {
            this.globalStatsCounter.recordMisses(1);
            return v;
        }
        this.globalStatsCounter.recordHits(1);
        return v;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final V getOrDefault(java.lang.Object obj, V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    final V getOrLoad(K k) throws java.util.concurrent.ExecutionException {
        return get(k, this.defaultLoader);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final com.google.common.collect.ImmutableMap<K, V> getAllPresent(java.lang.Iterable<?> iterable) {
        com.google.common.collect.ImmutableMap.Builder builder = com.google.common.collect.ImmutableMap.builder();
        int i = 0;
        int i2 = 0;
        for (java.lang.Object obj : iterable) {
            V v = get(obj);
            if (v == null) {
                i2++;
            } else {
                builder.put(obj, v);
                i++;
            }
        }
        this.globalStatsCounter.recordHits(i);
        this.globalStatsCounter.recordMisses(i2);
        return builder.buildKeepingLast();
    }

    /* JADX WARN: Multi-variable type inference failed */
    final com.google.common.collect.ImmutableMap<K, V> getAll(java.lang.Iterable<? extends K> iterable) throws java.util.concurrent.ExecutionException {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        int i = 0;
        int i2 = 0;
        for (K k : iterable) {
            java.lang.Object obj = get(k);
            if (!linkedHashMap.containsKey(k)) {
                linkedHashMap.put(k, obj);
                if (obj == null) {
                    i++;
                    linkedHashSet.add(k);
                } else {
                    i2++;
                }
            }
        }
        try {
            if (!linkedHashSet.isEmpty()) {
                try {
                    java.util.Map loadAll = loadAll(java.util.Collections.unmodifiableSet(linkedHashSet), this.defaultLoader);
                    for (java.lang.Object obj2 : linkedHashSet) {
                        java.lang.Object obj3 = loadAll.get(obj2);
                        if (obj3 == null) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            sb.append("loadAll failed to return a value for ");
                            sb.append(obj2);
                            throw new com.google.common.cache.CacheLoader.InvalidCacheLoadException(sb.toString());
                        }
                        linkedHashMap.put(obj2, obj3);
                    }
                } catch (com.google.common.cache.CacheLoader.UnsupportedLoadingOperationException unused) {
                    for (java.lang.Object obj4 : linkedHashSet) {
                        i--;
                        linkedHashMap.put(obj4, get(obj4, this.defaultLoader));
                    }
                }
            }
            return com.google.common.collect.ImmutableMap.copyOf((java.util.Map) linkedHashMap);
        } finally {
            this.globalStatsCounter.recordHits(i2);
            this.globalStatsCounter.recordMisses(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final java.util.Map<K, V> loadAll(java.util.Set<? extends K> set, com.google.common.cache.CacheLoader<? super K, V> cacheLoader) throws java.util.concurrent.ExecutionException {
        com.google.common.base.Preconditions.checkNotNull(cacheLoader);
        com.google.common.base.Preconditions.checkNotNull(set);
        com.google.common.base.Stopwatch createStarted = com.google.common.base.Stopwatch.createStarted();
        boolean z = false;
        try {
            try {
                try {
                    java.util.Map<? super K, V> loadAll = cacheLoader.loadAll(set);
                    if (loadAll == null) {
                        this.globalStatsCounter.recordLoadException(createStarted.elapsed(java.util.concurrent.TimeUnit.NANOSECONDS));
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(cacheLoader);
                        sb.append(" returned null map from loadAll");
                        throw new com.google.common.cache.CacheLoader.InvalidCacheLoadException(sb.toString());
                    }
                    createStarted.stop();
                    for (java.util.Map.Entry<K, V> entry : loadAll.entrySet()) {
                        K key = entry.getKey();
                        V value = entry.getValue();
                        if (key == null || value == null) {
                            z = true;
                        } else {
                            put(key, value);
                        }
                    }
                    if (z) {
                        this.globalStatsCounter.recordLoadException(createStarted.elapsed(java.util.concurrent.TimeUnit.NANOSECONDS));
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        sb2.append(cacheLoader);
                        sb2.append(" returned null keys or values from loadAll");
                        throw new com.google.common.cache.CacheLoader.InvalidCacheLoadException(sb2.toString());
                    }
                    this.globalStatsCounter.recordLoadSuccess(createStarted.elapsed(java.util.concurrent.TimeUnit.NANOSECONDS));
                    return loadAll;
                } catch (java.lang.RuntimeException e) {
                    throw new com.google.common.util.concurrent.UncheckedExecutionException(e);
                } catch (java.lang.Exception e2) {
                    throw new java.util.concurrent.ExecutionException(e2);
                }
            } catch (com.google.common.cache.CacheLoader.UnsupportedLoadingOperationException e3) {
                try {
                    throw e3;
                } catch (java.lang.Throwable th) {
                    th = th;
                    z = true;
                    if (!z) {
                        this.globalStatsCounter.recordLoadException(createStarted.elapsed(java.util.concurrent.TimeUnit.NANOSECONDS));
                    }
                    throw th;
                }
            } catch (java.lang.Error e4) {
                throw new com.google.common.util.concurrent.ExecutionError(e4);
            } catch (java.lang.InterruptedException e5) {
                java.lang.Thread.currentThread().interrupt();
                throw new java.util.concurrent.ExecutionException(e5);
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (!z) {
            }
            throw th;
        }
    }

    final com.google.common.cache.ReferenceEntry<K, V> getEntry(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        int hash = hash(obj);
        return segmentFor(hash).getEntry(obj, hash);
    }

    final void refresh(K k) {
        int hash = hash(com.google.common.base.Preconditions.checkNotNull(k));
        segmentFor(hash).refresh(k, hash, this.defaultLoader, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        int hash = hash(obj);
        return segmentFor(hash).containsKey(obj, hash);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        boolean z = false;
        if (obj == null) {
            return false;
        }
        long read = this.ticker.read();
        com.google.common.cache.LocalCache.Segment<K, V>[] segmentArr = this.segments;
        long j = -1;
        int i = 0;
        while (i < 3) {
            int length = segmentArr.length;
            long j2 = 0;
            for (?? r12 = z; r12 < length; r12++) {
                com.google.common.cache.LocalCache.Segment<K, V> segment = segmentArr[r12];
                int i2 = segment.count;
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> atomicReferenceArray = segment.table;
                for (?? r15 = z; r15 < atomicReferenceArray.length(); r15++) {
                    com.google.common.cache.ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(r15);
                    while (referenceEntry != null) {
                        com.google.common.cache.LocalCache.Segment<K, V>[] segmentArr2 = segmentArr;
                        V liveValue = segment.getLiveValue(referenceEntry, read);
                        long j3 = read;
                        if (liveValue != null && this.valueEquivalence.equivalent(obj, liveValue)) {
                            return true;
                        }
                        referenceEntry = referenceEntry.getNext();
                        segmentArr = segmentArr2;
                        read = j3;
                    }
                }
                j2 += segment.modCount;
                read = read;
                z = false;
            }
            long j4 = read;
            com.google.common.cache.LocalCache.Segment<K, V>[] segmentArr3 = segmentArr;
            if (j2 == j) {
                return false;
            }
            i++;
            j = j2;
            segmentArr = segmentArr3;
            read = j4;
            z = false;
        }
        return z;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        com.google.common.base.Preconditions.checkNotNull(k);
        com.google.common.base.Preconditions.checkNotNull(v);
        int hash = hash(k);
        return segmentFor(hash).put(k, hash, v, false);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final V putIfAbsent(K k, V v) {
        com.google.common.base.Preconditions.checkNotNull(k);
        com.google.common.base.Preconditions.checkNotNull(v);
        int hash = hash(k);
        return segmentFor(hash).put(k, hash, v, true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        for (java.util.Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        int hash = hash(obj);
        return segmentFor(hash).remove(obj, hash);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int hash = hash(obj);
        return segmentFor(hash).remove(obj, hash, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean replace(K k, V v, V v2) {
        com.google.common.base.Preconditions.checkNotNull(k);
        com.google.common.base.Preconditions.checkNotNull(v2);
        if (v == null) {
            return false;
        }
        int hash = hash(k);
        return segmentFor(hash).replace(k, hash, v, v2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final V replace(K k, V v) {
        com.google.common.base.Preconditions.checkNotNull(k);
        com.google.common.base.Preconditions.checkNotNull(v);
        int hash = hash(k);
        return segmentFor(hash).replace(k, hash, v);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        for (com.google.common.cache.LocalCache.Segment<K, V> segment : this.segments) {
            segment.clear();
        }
    }

    final void invalidateAll(java.lang.Iterable<?> iterable) {
        java.util.Iterator<?> it = iterable.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set<K> keySet() {
        java.util.Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        com.google.common.cache.LocalCache.KeySet keySet = new com.google.common.cache.LocalCache.KeySet();
        this.keySet = keySet;
        return keySet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Collection<V> values() {
        java.util.Collection<V> collection = this.values;
        if (collection != null) {
            return collection;
        }
        com.google.common.cache.LocalCache.Values values = new com.google.common.cache.LocalCache.Values();
        this.values = values;
        return values;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        java.util.Set<java.util.Map.Entry<K, V>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        com.google.common.cache.LocalCache.EntrySet entrySet = new com.google.common.cache.LocalCache.EntrySet();
        this.entrySet = entrySet;
        return entrySet;
    }

    abstract class HashIterator<T> implements java.util.Iterator<T> {
        com.google.common.cache.LocalCache.Segment<K, V> currentSegment;
        java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> currentTable;
        com.google.common.cache.LocalCache<K, V>.WriteThroughEntry lastReturned;
        com.google.common.cache.ReferenceEntry<K, V> nextEntry;
        com.google.common.cache.LocalCache<K, V>.WriteThroughEntry nextExternal;
        int nextSegmentIndex;
        int nextTableIndex = -1;

        @Override // java.util.Iterator
        public abstract T next();

        HashIterator() {
            this.nextSegmentIndex = com.google.common.cache.LocalCache.this.segments.length - 1;
            advance();
        }

        final void advance() {
            this.nextExternal = null;
            if (nextInChain() || nextInTable()) {
                return;
            }
            while (this.nextSegmentIndex >= 0) {
                com.google.common.cache.LocalCache.Segment<K, V>[] segmentArr = com.google.common.cache.LocalCache.this.segments;
                int i = this.nextSegmentIndex;
                this.nextSegmentIndex = i - 1;
                com.google.common.cache.LocalCache.Segment<K, V> segment = segmentArr[i];
                this.currentSegment = segment;
                if (segment.count != 0) {
                    this.currentTable = this.currentSegment.table;
                    this.nextTableIndex = r0.length() - 1;
                    if (nextInTable()) {
                        return;
                    }
                }
            }
        }

        boolean nextInChain() {
            com.google.common.cache.ReferenceEntry<K, V> referenceEntry = this.nextEntry;
            if (referenceEntry == null) {
                return false;
            }
            while (true) {
                com.google.common.cache.ReferenceEntry<K, V> next = referenceEntry.getNext();
                this.nextEntry = next;
                if (next == null) {
                    return false;
                }
                if (advanceTo(next)) {
                    return true;
                }
                referenceEntry = this.nextEntry;
            }
        }

        boolean nextInTable() {
            while (true) {
                int i = this.nextTableIndex;
                if (i < 0) {
                    return false;
                }
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> atomicReferenceArray = this.currentTable;
                this.nextTableIndex = i - 1;
                com.google.common.cache.ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(i);
                this.nextEntry = referenceEntry;
                if (referenceEntry != null && (advanceTo(referenceEntry) || nextInChain())) {
                    return true;
                }
            }
        }

        boolean advanceTo(com.google.common.cache.ReferenceEntry<K, V> referenceEntry) {
            try {
                long read = com.google.common.cache.LocalCache.this.ticker.read();
                K key = referenceEntry.getKey();
                java.lang.Object liveValue = com.google.common.cache.LocalCache.this.getLiveValue(referenceEntry, read);
                if (liveValue == null) {
                    this.currentSegment.postReadCleanup();
                    return false;
                }
                this.nextExternal = new com.google.common.cache.LocalCache.WriteThroughEntry(key, liveValue);
                this.currentSegment.postReadCleanup();
                return true;
            } catch (java.lang.Throwable th) {
                this.currentSegment.postReadCleanup();
                throw th;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.nextExternal != null;
        }

        com.google.common.cache.LocalCache<K, V>.WriteThroughEntry nextEntry() {
            com.google.common.cache.LocalCache<K, V>.WriteThroughEntry writeThroughEntry = this.nextExternal;
            if (writeThroughEntry == null) {
                throw new java.util.NoSuchElementException();
            }
            this.lastReturned = writeThroughEntry;
            advance();
            return this.lastReturned;
        }

        @Override // java.util.Iterator
        public void remove() {
            com.google.common.base.Preconditions.checkState(this.lastReturned != null);
            com.google.common.cache.LocalCache.this.remove(this.lastReturned.getKey());
            this.lastReturned = null;
        }
    }

    final class KeyIterator extends com.google.common.cache.LocalCache<K, V>.HashIterator<K> {
        KeyIterator() {
            super();
        }

        @Override // com.google.common.cache.LocalCache.HashIterator, java.util.Iterator
        public final K next() {
            return nextEntry().getKey();
        }
    }

    final class ValueIterator extends com.google.common.cache.LocalCache<K, V>.HashIterator<V> {
        ValueIterator() {
            super();
        }

        @Override // com.google.common.cache.LocalCache.HashIterator, java.util.Iterator
        public final V next() {
            return nextEntry().getValue();
        }
    }

    final class WriteThroughEntry implements java.util.Map.Entry<K, V> {
        final K key;
        V value;

        WriteThroughEntry(K k, V v) {
            this.key = k;
            this.value = v;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.key;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.value;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(java.lang.Object obj) {
            if (!(obj instanceof java.util.Map.Entry)) {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            return this.key.equals(entry.getKey()) && this.value.equals(entry.getValue());
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            return this.key.hashCode() ^ this.value.hashCode();
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            V put = com.google.common.cache.LocalCache.this.put(this.key, v);
            this.value = v;
            return put;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(getKey());
            sb.append("=");
            sb.append(getValue());
            return sb.toString();
        }
    }

    final class EntryIterator extends com.google.common.cache.LocalCache<K, V>.HashIterator<java.util.Map.Entry<K, V>> {
        EntryIterator() {
            super();
        }

        @Override // com.google.common.cache.LocalCache.HashIterator, java.util.Iterator
        public final java.util.Map.Entry<K, V> next() {
            return nextEntry();
        }
    }

    abstract class AbstractCacheSet<T> extends java.util.AbstractSet<T> {
        AbstractCacheSet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return com.google.common.cache.LocalCache.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return com.google.common.cache.LocalCache.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            com.google.common.cache.LocalCache.this.clear();
        }
    }

    final class KeySet extends com.google.common.cache.LocalCache<K, V>.AbstractCacheSet<K> {
        KeySet() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final java.util.Iterator<K> iterator() {
            return new com.google.common.cache.LocalCache.KeyIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(java.lang.Object obj) {
            return com.google.common.cache.LocalCache.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(java.lang.Object obj) {
            return com.google.common.cache.LocalCache.this.remove(obj) != null;
        }
    }

    final class Values extends java.util.AbstractCollection<V> {
        Values() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return com.google.common.cache.LocalCache.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return com.google.common.cache.LocalCache.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            com.google.common.cache.LocalCache.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final java.util.Iterator<V> iterator() {
            return new com.google.common.cache.LocalCache.ValueIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(java.lang.Object obj) {
            return com.google.common.cache.LocalCache.this.containsValue(obj);
        }
    }

    final class EntrySet extends com.google.common.cache.LocalCache<K, V>.AbstractCacheSet<java.util.Map.Entry<K, V>> {
        EntrySet() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
            return new com.google.common.cache.LocalCache.EntryIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(java.lang.Object obj) {
            java.util.Map.Entry entry;
            java.lang.Object key;
            V v;
            return (obj instanceof java.util.Map.Entry) && (key = (entry = (java.util.Map.Entry) obj).getKey()) != null && (v = com.google.common.cache.LocalCache.this.get(key)) != null && com.google.common.cache.LocalCache.this.valueEquivalence.equivalent(entry.getValue(), v);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(java.lang.Object obj) {
            java.util.Map.Entry entry;
            java.lang.Object key;
            return (obj instanceof java.util.Map.Entry) && (key = (entry = (java.util.Map.Entry) obj).getKey()) != null && com.google.common.cache.LocalCache.this.remove(key, entry.getValue());
        }
    }

    static class ManualSerializationProxy<K, V> extends com.google.common.cache.ForwardingCache<K, V> implements java.io.Serializable {
        private static final long serialVersionUID = 1;
        final int concurrencyLevel;
        transient com.google.common.cache.Cache<K, V> delegate;
        final long expireAfterAccessNanos;
        final long expireAfterWriteNanos;
        final com.google.common.base.Equivalence<java.lang.Object> keyEquivalence;
        final com.google.common.cache.LocalCache.Strength keyStrength;
        final com.google.common.cache.CacheLoader<? super K, V> loader;
        final long maxWeight;
        final com.google.common.cache.RemovalListener<? super K, ? super V> removalListener;
        final com.google.common.base.Ticker ticker;
        final com.google.common.base.Equivalence<java.lang.Object> valueEquivalence;
        final com.google.common.cache.LocalCache.Strength valueStrength;
        final com.google.common.cache.Weigher<K, V> weigher;

        ManualSerializationProxy(com.google.common.cache.LocalCache<K, V> localCache) {
            this(localCache.keyStrength, localCache.valueStrength, localCache.keyEquivalence, localCache.valueEquivalence, localCache.expireAfterWriteNanos, localCache.expireAfterAccessNanos, localCache.maxWeight, localCache.weigher, localCache.concurrencyLevel, localCache.removalListener, localCache.ticker, localCache.defaultLoader);
        }

        private ManualSerializationProxy(com.google.common.cache.LocalCache.Strength strength, com.google.common.cache.LocalCache.Strength strength2, com.google.common.base.Equivalence<java.lang.Object> equivalence, com.google.common.base.Equivalence<java.lang.Object> equivalence2, long j, long j2, long j3, com.google.common.cache.Weigher<K, V> weigher, int i, com.google.common.cache.RemovalListener<? super K, ? super V> removalListener, com.google.common.base.Ticker ticker, com.google.common.cache.CacheLoader<? super K, V> cacheLoader) {
            this.keyStrength = strength;
            this.valueStrength = strength2;
            this.keyEquivalence = equivalence;
            this.valueEquivalence = equivalence2;
            this.expireAfterWriteNanos = j;
            this.expireAfterAccessNanos = j2;
            this.maxWeight = j3;
            this.weigher = weigher;
            this.concurrencyLevel = i;
            this.removalListener = removalListener;
            this.ticker = (ticker == com.google.common.base.Ticker.systemTicker() || ticker == com.google.common.cache.CacheBuilder.NULL_TICKER) ? null : ticker;
            this.loader = cacheLoader;
        }

        com.google.common.cache.CacheBuilder<K, V> recreateCacheBuilder() {
            com.google.common.cache.CacheBuilder<K, V> cacheBuilder = (com.google.common.cache.CacheBuilder<K, V>) com.google.common.cache.CacheBuilder.newBuilder().setKeyStrength(this.keyStrength).setValueStrength(this.valueStrength).keyEquivalence(this.keyEquivalence).valueEquivalence(this.valueEquivalence).concurrencyLevel(this.concurrencyLevel).removalListener(this.removalListener);
            cacheBuilder.strictParsing = false;
            long j = this.expireAfterWriteNanos;
            if (j > 0) {
                cacheBuilder.expireAfterWrite(j, java.util.concurrent.TimeUnit.NANOSECONDS);
            }
            long j2 = this.expireAfterAccessNanos;
            if (j2 > 0) {
                cacheBuilder.expireAfterAccess(j2, java.util.concurrent.TimeUnit.NANOSECONDS);
            }
            if (this.weigher != com.google.common.cache.CacheBuilder.OneWeigher.INSTANCE) {
                cacheBuilder.weigher(this.weigher);
                long j3 = this.maxWeight;
                if (j3 != -1) {
                    cacheBuilder.maximumWeight(j3);
                }
            } else {
                long j4 = this.maxWeight;
                if (j4 != -1) {
                    cacheBuilder.maximumSize(j4);
                }
            }
            com.google.common.base.Ticker ticker = this.ticker;
            if (ticker != null) {
                cacheBuilder.ticker(ticker);
            }
            return cacheBuilder;
        }

        private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.delegate = (com.google.common.cache.Cache<K, V>) recreateCacheBuilder().build();
        }

        private java.lang.Object readResolve() {
            return this.delegate;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.cache.ForwardingCache, com.google.common.collect.ForwardingObject
        public com.google.common.cache.Cache<K, V> delegate() {
            return this.delegate;
        }
    }

    static final class LoadingSerializationProxy<K, V> extends com.google.common.cache.LocalCache.ManualSerializationProxy<K, V> implements com.google.common.cache.LoadingCache<K, V> {
        private static final long serialVersionUID = 1;
        transient com.google.common.cache.LoadingCache<K, V> autoDelegate;

        LoadingSerializationProxy(com.google.common.cache.LocalCache<K, V> localCache) {
            super(localCache);
        }

        private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.autoDelegate = (com.google.common.cache.LoadingCache<K, V>) recreateCacheBuilder().build(this.loader);
        }

        @Override // com.google.common.cache.LoadingCache
        public final V get(K k) throws java.util.concurrent.ExecutionException {
            return this.autoDelegate.get(k);
        }

        @Override // com.google.common.cache.LoadingCache
        public final V getUnchecked(K k) {
            return this.autoDelegate.getUnchecked(k);
        }

        @Override // com.google.common.cache.LoadingCache
        public final com.google.common.collect.ImmutableMap<K, V> getAll(java.lang.Iterable<? extends K> iterable) throws java.util.concurrent.ExecutionException {
            return this.autoDelegate.getAll(iterable);
        }

        @Override // com.google.common.cache.LoadingCache, com.google.common.base.Function
        public final V apply(K k) {
            return this.autoDelegate.apply(k);
        }

        @Override // com.google.common.cache.LoadingCache
        public final void refresh(K k) {
            this.autoDelegate.refresh(k);
        }

        private java.lang.Object readResolve() {
            return this.autoDelegate;
        }
    }

    static class LocalManualCache<K, V> implements com.google.common.cache.Cache<K, V>, java.io.Serializable {
        private static final long serialVersionUID = 1;
        final com.google.common.cache.LocalCache<K, V> localCache;

        LocalManualCache(com.google.common.cache.CacheBuilder<? super K, ? super V> cacheBuilder) {
            this(new com.google.common.cache.LocalCache(cacheBuilder, null));
        }

        private LocalManualCache(com.google.common.cache.LocalCache<K, V> localCache) {
            this.localCache = localCache;
        }

        @Override // com.google.common.cache.Cache
        public V getIfPresent(java.lang.Object obj) {
            return this.localCache.getIfPresent(obj);
        }

        @Override // com.google.common.cache.Cache
        public V get(K k, final java.util.concurrent.Callable<? extends V> callable) throws java.util.concurrent.ExecutionException {
            com.google.common.base.Preconditions.checkNotNull(callable);
            return this.localCache.get(k, new com.google.common.cache.CacheLoader<java.lang.Object, V>(this) { // from class: com.google.common.cache.LocalCache.LocalManualCache.1
                final /* synthetic */ com.google.common.cache.LocalCache.LocalManualCache this$0;

                {
                    this.this$0 = this;
                }

                @Override // com.google.common.cache.CacheLoader
                public V load(java.lang.Object obj) throws java.lang.Exception {
                    return (V) callable.call();
                }
            });
        }

        @Override // com.google.common.cache.Cache
        public com.google.common.collect.ImmutableMap<K, V> getAllPresent(java.lang.Iterable<?> iterable) {
            return this.localCache.getAllPresent(iterable);
        }

        @Override // com.google.common.cache.Cache
        public void put(K k, V v) {
            this.localCache.put(k, v);
        }

        @Override // com.google.common.cache.Cache
        public void putAll(java.util.Map<? extends K, ? extends V> map) {
            this.localCache.putAll(map);
        }

        @Override // com.google.common.cache.Cache
        public void invalidate(java.lang.Object obj) {
            com.google.common.base.Preconditions.checkNotNull(obj);
            this.localCache.remove(obj);
        }

        @Override // com.google.common.cache.Cache
        public void invalidateAll(java.lang.Iterable<?> iterable) {
            this.localCache.invalidateAll(iterable);
        }

        @Override // com.google.common.cache.Cache
        public void invalidateAll() {
            this.localCache.clear();
        }

        @Override // com.google.common.cache.Cache
        public long size() {
            return this.localCache.longSize();
        }

        @Override // com.google.common.cache.Cache
        public java.util.concurrent.ConcurrentMap<K, V> asMap() {
            return this.localCache;
        }

        @Override // com.google.common.cache.Cache
        public com.google.common.cache.CacheStats stats() {
            com.google.common.cache.AbstractCache.SimpleStatsCounter simpleStatsCounter = new com.google.common.cache.AbstractCache.SimpleStatsCounter();
            simpleStatsCounter.incrementBy(this.localCache.globalStatsCounter);
            for (com.google.common.cache.LocalCache.Segment<K, V> segment : this.localCache.segments) {
                simpleStatsCounter.incrementBy(segment.statsCounter);
            }
            return simpleStatsCounter.snapshot();
        }

        @Override // com.google.common.cache.Cache
        public void cleanUp() {
            this.localCache.cleanUp();
        }

        java.lang.Object writeReplace() {
            return new com.google.common.cache.LocalCache.ManualSerializationProxy(this.localCache);
        }

        private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
            throw new java.io.InvalidObjectException("Use ManualSerializationProxy");
        }
    }

    static class LocalLoadingCache<K, V> extends com.google.common.cache.LocalCache.LocalManualCache<K, V> implements com.google.common.cache.LoadingCache<K, V> {
        private static final long serialVersionUID = 1;

        LocalLoadingCache(com.google.common.cache.CacheBuilder<? super K, ? super V> cacheBuilder, com.google.common.cache.CacheLoader<? super K, V> cacheLoader) {
            super();
        }

        @Override // com.google.common.cache.LoadingCache
        public V get(K k) throws java.util.concurrent.ExecutionException {
            return this.localCache.getOrLoad(k);
        }

        @Override // com.google.common.cache.LoadingCache
        public V getUnchecked(K k) {
            try {
                return get(k);
            } catch (java.util.concurrent.ExecutionException e) {
                throw new com.google.common.util.concurrent.UncheckedExecutionException(e.getCause());
            }
        }

        @Override // com.google.common.cache.LoadingCache
        public com.google.common.collect.ImmutableMap<K, V> getAll(java.lang.Iterable<? extends K> iterable) throws java.util.concurrent.ExecutionException {
            return this.localCache.getAll(iterable);
        }

        @Override // com.google.common.cache.LoadingCache
        public void refresh(K k) {
            this.localCache.refresh(k);
        }

        @Override // com.google.common.cache.LoadingCache, com.google.common.base.Function
        public final V apply(K k) {
            return getUnchecked(k);
        }

        @Override // com.google.common.cache.LocalCache.LocalManualCache
        java.lang.Object writeReplace() {
            return new com.google.common.cache.LocalCache.LoadingSerializationProxy(this.localCache);
        }

        private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
            throw new java.io.InvalidObjectException("Use LoadingSerializationProxy");
        }
    }
}
