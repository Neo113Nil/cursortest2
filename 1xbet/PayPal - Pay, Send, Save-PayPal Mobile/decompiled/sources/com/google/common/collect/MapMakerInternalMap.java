package com.google.common.collect;

@org.jspecify.annotations.NullUnmarked
/* loaded from: classes9.dex */
final class MapMakerInternalMap<K, V, E extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap.Segment<K, V, E, S>> extends java.util.AbstractMap<K, V> implements java.util.concurrent.ConcurrentMap<K, V>, java.io.Serializable {
    static final int CONTAINS_VALUE_RETRIES = 3;
    static final int DRAIN_MAX = 16;
    static final int DRAIN_THRESHOLD = 63;
    static final int MAXIMUM_CAPACITY = 1073741824;
    static final int MAX_SEGMENTS = 65536;
    static final com.google.common.collect.MapMakerInternalMap.WeakValueReference<java.lang.Object, java.lang.Object, com.google.common.collect.MapMakerInternalMap.DummyInternalEntry> UNSET_WEAK_VALUE_REFERENCE = new com.google.common.collect.MapMakerInternalMap.WeakValueReference<java.lang.Object, java.lang.Object, com.google.common.collect.MapMakerInternalMap.DummyInternalEntry>() { // from class: com.google.common.collect.MapMakerInternalMap.1
        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public void clear() {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public com.google.common.collect.MapMakerInternalMap.WeakValueReference<java.lang.Object, java.lang.Object, com.google.common.collect.MapMakerInternalMap.DummyInternalEntry> copyFor(java.lang.ref.ReferenceQueue<java.lang.Object> referenceQueue, com.google.common.collect.MapMakerInternalMap.DummyInternalEntry dummyInternalEntry) {
            return this;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public java.lang.Object get() {
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public com.google.common.collect.MapMakerInternalMap.DummyInternalEntry getEntry() {
            return null;
        }
    };
    private static final long serialVersionUID = 5;
    final int concurrencyLevel;
    final transient com.google.common.collect.MapMakerInternalMap.InternalEntryHelper<K, V, E, S> entryHelper;

    @com.google.errorprone.annotations.concurrent.LazyInit
    transient java.util.Set<java.util.Map.Entry<K, V>> entrySet;
    final com.google.common.base.Equivalence<java.lang.Object> keyEquivalence;

    @com.google.errorprone.annotations.concurrent.LazyInit
    transient java.util.Set<K> keySet;
    final transient int segmentMask;
    final transient int segmentShift;
    final transient com.google.common.collect.MapMakerInternalMap.Segment<K, V, E, S>[] segments;

    @com.google.errorprone.annotations.concurrent.LazyInit
    transient java.util.Collection<V> values;

    interface InternalEntry<K, V, E extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E>> {
        int getHash();

        K getKey();

        E getNext();

        V getValue();
    }

    interface InternalEntryHelper<K, V, E extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap.Segment<K, V, E, S>> {
        E copy(S s, E e, E e2);

        com.google.common.collect.MapMakerInternalMap.Strength keyStrength();

        E newEntry(S s, K k, int i, E e);

        S newSegment(com.google.common.collect.MapMakerInternalMap<K, V, E, S> mapMakerInternalMap, int i);

        void setValue(S s, E e, V v);

        com.google.common.collect.MapMakerInternalMap.Strength valueStrength();
    }

    enum Strength {
        STRONG { // from class: com.google.common.collect.MapMakerInternalMap.Strength.1
            @Override // com.google.common.collect.MapMakerInternalMap.Strength
            final com.google.common.base.Equivalence<java.lang.Object> defaultEquivalence() {
                return com.google.common.base.Equivalence.equals();
            }
        },
        WEAK { // from class: com.google.common.collect.MapMakerInternalMap.Strength.2
            @Override // com.google.common.collect.MapMakerInternalMap.Strength
            final com.google.common.base.Equivalence<java.lang.Object> defaultEquivalence() {
                return com.google.common.base.Equivalence.identity();
            }
        };

        abstract com.google.common.base.Equivalence<java.lang.Object> defaultEquivalence();
    }

    interface StrongValueEntry<K, V, E extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E>> extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E> {
    }

    interface WeakValueEntry<K, V, E extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E>> extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E> {
        com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, E> getValueReference();
    }

    interface WeakValueReference<K, V, E extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E>> {
        void clear();

        com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, E> copyFor(java.lang.ref.ReferenceQueue<V> referenceQueue, E e);

        V get();

        E getEntry();
    }

    static int rehash(int i) {
        int i2 = i + ((i << 15) ^ (-12931));
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = i5 + (i5 << 2) + (i5 << 14);
        return i6 ^ (i6 >>> 16);
    }

    private MapMakerInternalMap(com.google.common.collect.MapMaker mapMaker, com.google.common.collect.MapMakerInternalMap.InternalEntryHelper<K, V, E, S> internalEntryHelper) {
        this.concurrencyLevel = java.lang.Math.min(mapMaker.getConcurrencyLevel(), 65536);
        this.keyEquivalence = mapMaker.getKeyEquivalence();
        this.entryHelper = internalEntryHelper;
        int min = java.lang.Math.min(mapMaker.getInitialCapacity(), 1073741824);
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        int i4 = 1;
        while (i4 < this.concurrencyLevel) {
            i3++;
            i4 <<= 1;
        }
        this.segmentShift = 32 - i3;
        this.segmentMask = i4 - 1;
        this.segments = newSegmentArray(i4);
        int i5 = min / i4;
        while (i2 < (i4 * i5 < min ? i5 + 1 : i5)) {
            i2 <<= 1;
        }
        while (true) {
            com.google.common.collect.MapMakerInternalMap.Segment<K, V, E, S>[] segmentArr = this.segments;
            if (i >= segmentArr.length) {
                return;
            }
            segmentArr[i] = createSegment(i2);
            i++;
        }
    }

    static <K, V> com.google.common.collect.MapMakerInternalMap<K, V, ? extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?>, ?> create(com.google.common.collect.MapMaker mapMaker) {
        if (mapMaker.getKeyStrength() == com.google.common.collect.MapMakerInternalMap.Strength.STRONG && mapMaker.getValueStrength() == com.google.common.collect.MapMakerInternalMap.Strength.STRONG) {
            return new com.google.common.collect.MapMakerInternalMap<>(mapMaker, com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry.Helper.instance());
        }
        if (mapMaker.getKeyStrength() == com.google.common.collect.MapMakerInternalMap.Strength.STRONG && mapMaker.getValueStrength() == com.google.common.collect.MapMakerInternalMap.Strength.WEAK) {
            return new com.google.common.collect.MapMakerInternalMap<>(mapMaker, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry.Helper.instance());
        }
        if (mapMaker.getKeyStrength() == com.google.common.collect.MapMakerInternalMap.Strength.WEAK && mapMaker.getValueStrength() == com.google.common.collect.MapMakerInternalMap.Strength.STRONG) {
            return new com.google.common.collect.MapMakerInternalMap<>(mapMaker, com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry.Helper.instance());
        }
        if (mapMaker.getKeyStrength() == com.google.common.collect.MapMakerInternalMap.Strength.WEAK && mapMaker.getValueStrength() == com.google.common.collect.MapMakerInternalMap.Strength.WEAK) {
            return new com.google.common.collect.MapMakerInternalMap<>(mapMaker, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry.Helper.instance());
        }
        throw new java.lang.AssertionError();
    }

    static <K> com.google.common.collect.MapMakerInternalMap<K, com.google.common.collect.MapMaker.Dummy, ? extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, com.google.common.collect.MapMaker.Dummy, ?>, ?> createWithDummyValues(com.google.common.collect.MapMaker mapMaker) {
        if (mapMaker.getKeyStrength() == com.google.common.collect.MapMakerInternalMap.Strength.STRONG && mapMaker.getValueStrength() == com.google.common.collect.MapMakerInternalMap.Strength.STRONG) {
            return new com.google.common.collect.MapMakerInternalMap<>(mapMaker, com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry.Helper.instance());
        }
        if (mapMaker.getKeyStrength() == com.google.common.collect.MapMakerInternalMap.Strength.WEAK && mapMaker.getValueStrength() == com.google.common.collect.MapMakerInternalMap.Strength.STRONG) {
            return new com.google.common.collect.MapMakerInternalMap<>(mapMaker, com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry.Helper.instance());
        }
        if (mapMaker.getValueStrength() == com.google.common.collect.MapMakerInternalMap.Strength.WEAK) {
            throw new java.lang.IllegalArgumentException("Map cannot have both weak and dummy values");
        }
        throw new java.lang.AssertionError();
    }

    static abstract class AbstractStrongKeyEntry<K, V, E extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E>> implements com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E> {
        final int hash;
        final K key;

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public E getNext() {
            return null;
        }

        AbstractStrongKeyEntry(K k, int i) {
            this.key = k;
            this.hash = i;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final K getKey() {
            return this.key;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final int getHash() {
            return this.hash;
        }
    }

    static <K, V, E extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E>> com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, E> unsetWeakValueReference() {
        return (com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, E>) UNSET_WEAK_VALUE_REFERENCE;
    }

    static class StrongKeyStrongValueEntry<K, V> extends com.google.common.collect.MapMakerInternalMap.AbstractStrongKeyEntry<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V>> implements com.google.common.collect.MapMakerInternalMap.StrongValueEntry<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V>> {
        private volatile V value;

        private StrongKeyStrongValueEntry(K k, int i) {
            super(k, i);
            this.value = null;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final V getValue() {
            return this.value;
        }

        static final class LinkedStrongKeyStrongValueEntry<K, V> extends com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V> {
            private final com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V> next;

            LinkedStrongKeyStrongValueEntry(K k, int i, com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V> strongKeyStrongValueEntry) {
                super(k, i);
                this.next = strongKeyStrongValueEntry;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.AbstractStrongKeyEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry
            public final com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V> getNext() {
                return this.next;
            }
        }

        static final class Helper<K, V> implements com.google.common.collect.MapMakerInternalMap.InternalEntryHelper<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueSegment<K, V>> {
            private static final com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry.Helper<?, ?> INSTANCE = new com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry.Helper<>();

            Helper() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.InternalEntry newEntry(com.google.common.collect.MapMakerInternalMap.Segment segment, java.lang.Object obj, int i, com.google.common.collect.MapMakerInternalMap.InternalEntry internalEntry) {
                return newEntry((com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueSegment<com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueSegment<K, V>, V>) segment, (com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueSegment<K, V>) obj, i, (com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueSegment<K, V>, V>) internalEntry);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final /* bridge */ /* synthetic */ void setValue(com.google.common.collect.MapMakerInternalMap.Segment segment, com.google.common.collect.MapMakerInternalMap.InternalEntry internalEntry, java.lang.Object obj) {
                setValue((com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueSegment<K, com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V>>) segment, (com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V>>) internalEntry, (com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V>) obj);
            }

            static <K, V> com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry.Helper<K, V> instance() {
                return (com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry.Helper<K, V>) INSTANCE;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final com.google.common.collect.MapMakerInternalMap.Strength keyStrength() {
                return com.google.common.collect.MapMakerInternalMap.Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final com.google.common.collect.MapMakerInternalMap.Strength valueStrength() {
                return com.google.common.collect.MapMakerInternalMap.Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueSegment<K, V> newSegment(com.google.common.collect.MapMakerInternalMap<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i) {
                return new com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueSegment<>(mapMakerInternalMap, i);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V> copy(com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueSegment<K, V> strongKeyStrongValueSegment, com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V> strongKeyStrongValueEntry, com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V> strongKeyStrongValueEntry2) {
                com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V> newEntry = newEntry((com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueSegment<com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueSegment<K, V>, V>) strongKeyStrongValueSegment, (com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueSegment<K, V>) strongKeyStrongValueEntry.key, strongKeyStrongValueEntry.hash, (com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueSegment<K, V>, V>) strongKeyStrongValueEntry2);
                ((com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry) newEntry).value = ((com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry) strongKeyStrongValueEntry).value;
                return newEntry;
            }

            public final void setValue(com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueSegment<K, V> strongKeyStrongValueSegment, com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V> strongKeyStrongValueEntry, V v) {
                ((com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry) strongKeyStrongValueEntry).value = v;
            }

            public final com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V> newEntry(com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueSegment<K, V> strongKeyStrongValueSegment, K k, int i, com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V> strongKeyStrongValueEntry) {
                if (strongKeyStrongValueEntry == null) {
                    return new com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<>(k, i);
                }
                return new com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry.LinkedStrongKeyStrongValueEntry(k, i, strongKeyStrongValueEntry);
            }
        }
    }

    static class StrongKeyWeakValueEntry<K, V> extends com.google.common.collect.MapMakerInternalMap.AbstractStrongKeyEntry<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V>> implements com.google.common.collect.MapMakerInternalMap.WeakValueEntry<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V>> {
        private volatile com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V>> valueReference;

        private StrongKeyWeakValueEntry(K k, int i) {
            super(k, i);
            this.valueReference = com.google.common.collect.MapMakerInternalMap.unsetWeakValueReference();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final V getValue() {
            return this.valueReference.get();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueEntry
        public final com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V>> getValueReference() {
            return this.valueReference;
        }

        static final class LinkedStrongKeyWeakValueEntry<K, V> extends com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V> {
            private final com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V> next;

            LinkedStrongKeyWeakValueEntry(K k, int i, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V> strongKeyWeakValueEntry) {
                super(k, i);
                this.next = strongKeyWeakValueEntry;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.AbstractStrongKeyEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry
            public final com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V> getNext() {
                return this.next;
            }
        }

        static final class Helper<K, V> implements com.google.common.collect.MapMakerInternalMap.InternalEntryHelper<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment<K, V>> {
            private static final com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry.Helper<?, ?> INSTANCE = new com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry.Helper<>();

            Helper() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.InternalEntry newEntry(com.google.common.collect.MapMakerInternalMap.Segment segment, java.lang.Object obj, int i, com.google.common.collect.MapMakerInternalMap.InternalEntry internalEntry) {
                return newEntry((com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment<com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment<K, V>, V>) segment, (com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment<K, V>) obj, i, (com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment<K, V>, V>) internalEntry);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final /* bridge */ /* synthetic */ void setValue(com.google.common.collect.MapMakerInternalMap.Segment segment, com.google.common.collect.MapMakerInternalMap.InternalEntry internalEntry, java.lang.Object obj) {
                setValue((com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment<K, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V>>) segment, (com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V>>) internalEntry, (com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V>) obj);
            }

            static <K, V> com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry.Helper<K, V> instance() {
                return (com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry.Helper<K, V>) INSTANCE;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final com.google.common.collect.MapMakerInternalMap.Strength keyStrength() {
                return com.google.common.collect.MapMakerInternalMap.Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final com.google.common.collect.MapMakerInternalMap.Strength valueStrength() {
                return com.google.common.collect.MapMakerInternalMap.Strength.WEAK;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment<K, V> newSegment(com.google.common.collect.MapMakerInternalMap<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i) {
                return new com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment<>(mapMakerInternalMap, i);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V> copy(com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment<K, V> strongKeyWeakValueSegment, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V> strongKeyWeakValueEntry, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V> strongKeyWeakValueEntry2) {
                if (com.google.common.collect.MapMakerInternalMap.Segment.isCollected(strongKeyWeakValueEntry)) {
                    return null;
                }
                com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V> newEntry = newEntry((com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment<com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment<K, V>, V>) strongKeyWeakValueSegment, (com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment<K, V>) strongKeyWeakValueEntry.key, strongKeyWeakValueEntry.hash, (com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment<K, V>, V>) strongKeyWeakValueEntry2);
                ((com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry) newEntry).valueReference = ((com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry) strongKeyWeakValueEntry).valueReference.copyFor(((com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment) strongKeyWeakValueSegment).queueForValues, newEntry);
                return newEntry;
            }

            public final void setValue(com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment<K, V> strongKeyWeakValueSegment, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V> strongKeyWeakValueEntry, V v) {
                com.google.common.collect.MapMakerInternalMap.WeakValueReference weakValueReference = ((com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry) strongKeyWeakValueEntry).valueReference;
                ((com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry) strongKeyWeakValueEntry).valueReference = new com.google.common.collect.MapMakerInternalMap.WeakValueReferenceImpl(((com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment) strongKeyWeakValueSegment).queueForValues, v, strongKeyWeakValueEntry);
                weakValueReference.clear();
            }

            public final com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V> newEntry(com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment<K, V> strongKeyWeakValueSegment, K k, int i, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V> strongKeyWeakValueEntry) {
                if (strongKeyWeakValueEntry == null) {
                    return new com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<>(k, i);
                }
                return new com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry.LinkedStrongKeyWeakValueEntry(k, i, strongKeyWeakValueEntry);
            }
        }
    }

    static class StrongKeyDummyValueEntry<K> extends com.google.common.collect.MapMakerInternalMap.AbstractStrongKeyEntry<K, com.google.common.collect.MapMaker.Dummy, com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K>> implements com.google.common.collect.MapMakerInternalMap.StrongValueEntry<K, com.google.common.collect.MapMaker.Dummy, com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K>> {
        private StrongKeyDummyValueEntry(K k, int i) {
            super(k, i);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final com.google.common.collect.MapMaker.Dummy getValue() {
            return com.google.common.collect.MapMaker.Dummy.VALUE;
        }

        static final class LinkedStrongKeyDummyValueEntry<K> extends com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K> {
            private final com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K> next;

            @Override // com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry
            public final /* bridge */ /* synthetic */ java.lang.Object getValue() {
                return super.getValue();
            }

            LinkedStrongKeyDummyValueEntry(K k, int i, com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K> strongKeyDummyValueEntry) {
                super(k, i);
                this.next = strongKeyDummyValueEntry;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.AbstractStrongKeyEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry
            public final com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K> getNext() {
                return this.next;
            }
        }

        static final class Helper<K> implements com.google.common.collect.MapMakerInternalMap.InternalEntryHelper<K, com.google.common.collect.MapMaker.Dummy, com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K>, com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueSegment<K>> {
            private static final com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry.Helper<?> INSTANCE = new com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry.Helper<>();

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final void setValue(com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueSegment<K> strongKeyDummyValueSegment, com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K> strongKeyDummyValueEntry, com.google.common.collect.MapMaker.Dummy dummy) {
            }

            Helper() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.InternalEntry newEntry(com.google.common.collect.MapMakerInternalMap.Segment segment, java.lang.Object obj, int i, com.google.common.collect.MapMakerInternalMap.InternalEntry internalEntry) {
                return newEntry((com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueSegment<com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueSegment<K>>) segment, (com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueSegment<K>) obj, i, (com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueSegment<K>>) internalEntry);
            }

            static <K> com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry.Helper<K> instance() {
                return (com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry.Helper<K>) INSTANCE;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final com.google.common.collect.MapMakerInternalMap.Strength keyStrength() {
                return com.google.common.collect.MapMakerInternalMap.Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final com.google.common.collect.MapMakerInternalMap.Strength valueStrength() {
                return com.google.common.collect.MapMakerInternalMap.Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueSegment<K> newSegment(com.google.common.collect.MapMakerInternalMap<K, com.google.common.collect.MapMaker.Dummy, com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K>, com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueSegment<K>> mapMakerInternalMap, int i) {
                return new com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueSegment<>(mapMakerInternalMap, i);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K> copy(com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueSegment<K> strongKeyDummyValueSegment, com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K> strongKeyDummyValueEntry, com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K> strongKeyDummyValueEntry2) {
                return newEntry((com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueSegment<com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueSegment<K>>) strongKeyDummyValueSegment, (com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueSegment<K>) strongKeyDummyValueEntry.key, strongKeyDummyValueEntry.hash, (com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueSegment<K>>) strongKeyDummyValueEntry2);
            }

            public final com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K> newEntry(com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueSegment<K> strongKeyDummyValueSegment, K k, int i, com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K> strongKeyDummyValueEntry) {
                if (strongKeyDummyValueEntry == null) {
                    return new com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<>(k, i);
                }
                return new com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry.LinkedStrongKeyDummyValueEntry(k, i, strongKeyDummyValueEntry);
            }
        }
    }

    static abstract class AbstractWeakKeyEntry<K, V, E extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E>> extends java.lang.ref.WeakReference<K> implements com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E> {
        final int hash;

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public E getNext() {
            return null;
        }

        AbstractWeakKeyEntry(java.lang.ref.ReferenceQueue<K> referenceQueue, K k, int i) {
            super(k, referenceQueue);
            this.hash = i;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final K getKey() {
            return get();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final int getHash() {
            return this.hash;
        }
    }

    static class WeakKeyDummyValueEntry<K> extends com.google.common.collect.MapMakerInternalMap.AbstractWeakKeyEntry<K, com.google.common.collect.MapMaker.Dummy, com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K>> implements com.google.common.collect.MapMakerInternalMap.StrongValueEntry<K, com.google.common.collect.MapMaker.Dummy, com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K>> {
        private WeakKeyDummyValueEntry(java.lang.ref.ReferenceQueue<K> referenceQueue, K k, int i) {
            super(referenceQueue, k, i);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final com.google.common.collect.MapMaker.Dummy getValue() {
            return com.google.common.collect.MapMaker.Dummy.VALUE;
        }

        static final class LinkedWeakKeyDummyValueEntry<K> extends com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K> {
            private final com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K> next;

            @Override // com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry
            public final /* bridge */ /* synthetic */ java.lang.Object getValue() {
                return super.getValue();
            }

            private LinkedWeakKeyDummyValueEntry(java.lang.ref.ReferenceQueue<K> referenceQueue, K k, int i, com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K> weakKeyDummyValueEntry) {
                super(referenceQueue, k, i);
                this.next = weakKeyDummyValueEntry;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.AbstractWeakKeyEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry
            public final com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K> getNext() {
                return this.next;
            }
        }

        static final class Helper<K> implements com.google.common.collect.MapMakerInternalMap.InternalEntryHelper<K, com.google.common.collect.MapMaker.Dummy, com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K>, com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment<K>> {
            private static final com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry.Helper<?> INSTANCE = new com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry.Helper<>();

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final void setValue(com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment<K> weakKeyDummyValueSegment, com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K> weakKeyDummyValueEntry, com.google.common.collect.MapMaker.Dummy dummy) {
            }

            Helper() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.InternalEntry newEntry(com.google.common.collect.MapMakerInternalMap.Segment segment, java.lang.Object obj, int i, com.google.common.collect.MapMakerInternalMap.InternalEntry internalEntry) {
                return newEntry((com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment<com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment<K>>) segment, (com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment<K>) obj, i, (com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment<K>>) internalEntry);
            }

            static <K> com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry.Helper<K> instance() {
                return (com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry.Helper<K>) INSTANCE;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final com.google.common.collect.MapMakerInternalMap.Strength keyStrength() {
                return com.google.common.collect.MapMakerInternalMap.Strength.WEAK;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final com.google.common.collect.MapMakerInternalMap.Strength valueStrength() {
                return com.google.common.collect.MapMakerInternalMap.Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment<K> newSegment(com.google.common.collect.MapMakerInternalMap<K, com.google.common.collect.MapMaker.Dummy, com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K>, com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment<K>> mapMakerInternalMap, int i) {
                return new com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment<>(mapMakerInternalMap, i);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K> copy(com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment<K> weakKeyDummyValueSegment, com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K> weakKeyDummyValueEntry, com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K> weakKeyDummyValueEntry2) {
                K key = weakKeyDummyValueEntry.getKey();
                if (key == null) {
                    return null;
                }
                return newEntry((com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment<com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment<K>>) weakKeyDummyValueSegment, (com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment<K>) key, weakKeyDummyValueEntry.hash, (com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment<K>>) weakKeyDummyValueEntry2);
            }

            public final com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K> newEntry(com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment<K> weakKeyDummyValueSegment, K k, int i, com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K> weakKeyDummyValueEntry) {
                if (weakKeyDummyValueEntry == null) {
                    return new com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<>(((com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment) weakKeyDummyValueSegment).queueForKeys, k, i);
                }
                return new com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry.LinkedWeakKeyDummyValueEntry(((com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment) weakKeyDummyValueSegment).queueForKeys, k, i, weakKeyDummyValueEntry);
            }
        }
    }

    static class WeakKeyStrongValueEntry<K, V> extends com.google.common.collect.MapMakerInternalMap.AbstractWeakKeyEntry<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V>> implements com.google.common.collect.MapMakerInternalMap.StrongValueEntry<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V>> {
        private volatile V value;

        private WeakKeyStrongValueEntry(java.lang.ref.ReferenceQueue<K> referenceQueue, K k, int i) {
            super(referenceQueue, k, i);
            this.value = null;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final V getValue() {
            return this.value;
        }

        static final class LinkedWeakKeyStrongValueEntry<K, V> extends com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V> {
            private final com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V> next;

            private LinkedWeakKeyStrongValueEntry(java.lang.ref.ReferenceQueue<K> referenceQueue, K k, int i, com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V> weakKeyStrongValueEntry) {
                super(referenceQueue, k, i);
                this.next = weakKeyStrongValueEntry;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.AbstractWeakKeyEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry
            public final com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V> getNext() {
                return this.next;
            }
        }

        static final class Helper<K, V> implements com.google.common.collect.MapMakerInternalMap.InternalEntryHelper<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment<K, V>> {
            private static final com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry.Helper<?, ?> INSTANCE = new com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry.Helper<>();

            Helper() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.InternalEntry newEntry(com.google.common.collect.MapMakerInternalMap.Segment segment, java.lang.Object obj, int i, com.google.common.collect.MapMakerInternalMap.InternalEntry internalEntry) {
                return newEntry((com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment<com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment<K, V>, V>) segment, (com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment<K, V>) obj, i, (com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment<K, V>, V>) internalEntry);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final /* bridge */ /* synthetic */ void setValue(com.google.common.collect.MapMakerInternalMap.Segment segment, com.google.common.collect.MapMakerInternalMap.InternalEntry internalEntry, java.lang.Object obj) {
                setValue((com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment<K, com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V>>) segment, (com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V>>) internalEntry, (com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V>) obj);
            }

            static <K, V> com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry.Helper<K, V> instance() {
                return (com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry.Helper<K, V>) INSTANCE;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final com.google.common.collect.MapMakerInternalMap.Strength keyStrength() {
                return com.google.common.collect.MapMakerInternalMap.Strength.WEAK;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final com.google.common.collect.MapMakerInternalMap.Strength valueStrength() {
                return com.google.common.collect.MapMakerInternalMap.Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment<K, V> newSegment(com.google.common.collect.MapMakerInternalMap<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i) {
                return new com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment<>(mapMakerInternalMap, i);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V> copy(com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment<K, V> weakKeyStrongValueSegment, com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V> weakKeyStrongValueEntry, com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V> weakKeyStrongValueEntry2) {
                K key = weakKeyStrongValueEntry.getKey();
                if (key == null) {
                    return null;
                }
                com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V> newEntry = newEntry((com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment<com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment<K, V>, V>) weakKeyStrongValueSegment, (com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment<K, V>) key, weakKeyStrongValueEntry.hash, (com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment<K, V>, V>) weakKeyStrongValueEntry2);
                ((com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry) newEntry).value = ((com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry) weakKeyStrongValueEntry).value;
                return newEntry;
            }

            public final void setValue(com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment<K, V> weakKeyStrongValueSegment, com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V> weakKeyStrongValueEntry, V v) {
                ((com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry) weakKeyStrongValueEntry).value = v;
            }

            public final com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V> newEntry(com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment<K, V> weakKeyStrongValueSegment, K k, int i, com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V> weakKeyStrongValueEntry) {
                if (weakKeyStrongValueEntry == null) {
                    return new com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<>(((com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment) weakKeyStrongValueSegment).queueForKeys, k, i);
                }
                return new com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry.LinkedWeakKeyStrongValueEntry(((com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment) weakKeyStrongValueSegment).queueForKeys, k, i, weakKeyStrongValueEntry);
            }
        }
    }

    static class WeakKeyWeakValueEntry<K, V> extends com.google.common.collect.MapMakerInternalMap.AbstractWeakKeyEntry<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V>> implements com.google.common.collect.MapMakerInternalMap.WeakValueEntry<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V>> {
        private volatile com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V>> valueReference;

        WeakKeyWeakValueEntry(java.lang.ref.ReferenceQueue<K> referenceQueue, K k, int i) {
            super(referenceQueue, k, i);
            this.valueReference = com.google.common.collect.MapMakerInternalMap.unsetWeakValueReference();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final V getValue() {
            return this.valueReference.get();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueEntry
        public final com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V>> getValueReference() {
            return this.valueReference;
        }

        static final class LinkedWeakKeyWeakValueEntry<K, V> extends com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V> {
            private final com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V> next;

            LinkedWeakKeyWeakValueEntry(java.lang.ref.ReferenceQueue<K> referenceQueue, K k, int i, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V> weakKeyWeakValueEntry) {
                super(referenceQueue, k, i);
                this.next = weakKeyWeakValueEntry;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.AbstractWeakKeyEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry
            public final com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V> getNext() {
                return this.next;
            }
        }

        static final class Helper<K, V> implements com.google.common.collect.MapMakerInternalMap.InternalEntryHelper<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment<K, V>> {
            private static final com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry.Helper<?, ?> INSTANCE = new com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry.Helper<>();

            Helper() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.InternalEntry newEntry(com.google.common.collect.MapMakerInternalMap.Segment segment, java.lang.Object obj, int i, com.google.common.collect.MapMakerInternalMap.InternalEntry internalEntry) {
                return newEntry((com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment<com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment<K, V>, V>) segment, (com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment<K, V>) obj, i, (com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment<K, V>, V>) internalEntry);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final /* bridge */ /* synthetic */ void setValue(com.google.common.collect.MapMakerInternalMap.Segment segment, com.google.common.collect.MapMakerInternalMap.InternalEntry internalEntry, java.lang.Object obj) {
                setValue((com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment<K, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V>>) segment, (com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V>>) internalEntry, (com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V>) obj);
            }

            static <K, V> com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry.Helper<K, V> instance() {
                return (com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry.Helper<K, V>) INSTANCE;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final com.google.common.collect.MapMakerInternalMap.Strength keyStrength() {
                return com.google.common.collect.MapMakerInternalMap.Strength.WEAK;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final com.google.common.collect.MapMakerInternalMap.Strength valueStrength() {
                return com.google.common.collect.MapMakerInternalMap.Strength.WEAK;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment<K, V> newSegment(com.google.common.collect.MapMakerInternalMap<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i) {
                return new com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment<>(mapMakerInternalMap, i);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V> copy(com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment<K, V> weakKeyWeakValueSegment, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V> weakKeyWeakValueEntry, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V> weakKeyWeakValueEntry2) {
                K key = weakKeyWeakValueEntry.getKey();
                if (key == null || com.google.common.collect.MapMakerInternalMap.Segment.isCollected(weakKeyWeakValueEntry)) {
                    return null;
                }
                com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V> newEntry = newEntry((com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment<com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment<K, V>, V>) weakKeyWeakValueSegment, (com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment<K, V>) key, weakKeyWeakValueEntry.hash, (com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment<K, V>, V>) weakKeyWeakValueEntry2);
                ((com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry) newEntry).valueReference = ((com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry) weakKeyWeakValueEntry).valueReference.copyFor(((com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment) weakKeyWeakValueSegment).queueForValues, newEntry);
                return newEntry;
            }

            public final void setValue(com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment<K, V> weakKeyWeakValueSegment, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V> weakKeyWeakValueEntry, V v) {
                com.google.common.collect.MapMakerInternalMap.WeakValueReference weakValueReference = ((com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry) weakKeyWeakValueEntry).valueReference;
                ((com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry) weakKeyWeakValueEntry).valueReference = new com.google.common.collect.MapMakerInternalMap.WeakValueReferenceImpl(((com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment) weakKeyWeakValueSegment).queueForValues, v, weakKeyWeakValueEntry);
                weakValueReference.clear();
            }

            public final com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V> newEntry(com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment<K, V> weakKeyWeakValueSegment, K k, int i, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V> weakKeyWeakValueEntry) {
                if (weakKeyWeakValueEntry == null) {
                    return new com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<>(((com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment) weakKeyWeakValueSegment).queueForKeys, k, i);
                }
                return new com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry.LinkedWeakKeyWeakValueEntry(((com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment) weakKeyWeakValueSegment).queueForKeys, k, i, weakKeyWeakValueEntry);
            }
        }
    }

    static final class DummyInternalEntry implements com.google.common.collect.MapMakerInternalMap.InternalEntry<java.lang.Object, java.lang.Object, com.google.common.collect.MapMakerInternalMap.DummyInternalEntry> {
        private DummyInternalEntry() {
            throw new java.lang.AssertionError();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final com.google.common.collect.MapMakerInternalMap.DummyInternalEntry getNext() {
            throw new java.lang.AssertionError();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final int getHash() {
            throw new java.lang.AssertionError();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final java.lang.Object getKey() {
            throw new java.lang.AssertionError();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final java.lang.Object getValue() {
            throw new java.lang.AssertionError();
        }
    }

    static final class WeakValueReferenceImpl<K, V, E extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E>> extends java.lang.ref.WeakReference<V> implements com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, E> {
        final E entry;

        WeakValueReferenceImpl(java.lang.ref.ReferenceQueue<V> referenceQueue, V v, E e) {
            super(v, referenceQueue);
            this.entry = e;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public final E getEntry() {
            return this.entry;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public final com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, E> copyFor(java.lang.ref.ReferenceQueue<V> referenceQueue, E e) {
            return new com.google.common.collect.MapMakerInternalMap.WeakValueReferenceImpl(referenceQueue, get(), e);
        }
    }

    final E copyEntry(E e, E e2) {
        return segmentFor(e.getHash()).copyEntry(e, e2);
    }

    final int hash(java.lang.Object obj) {
        return rehash(this.keyEquivalence.hash(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void reclaimValue(com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, E> weakValueReference) {
        E entry = weakValueReference.getEntry();
        int hash = entry.getHash();
        segmentFor(hash).reclaimValue(entry.getKey(), hash, weakValueReference);
    }

    final void reclaimKey(E e) {
        int hash = e.getHash();
        segmentFor(hash).reclaimKey(e, hash);
    }

    final boolean isLiveForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> internalEntry) {
        return segmentFor(internalEntry.getHash()).getLiveValueForTesting(internalEntry) != null;
    }

    final com.google.common.collect.MapMakerInternalMap.Segment<K, V, E, S> segmentFor(int i) {
        return this.segments[(i >>> this.segmentShift) & this.segmentMask];
    }

    final com.google.common.collect.MapMakerInternalMap.Segment<K, V, E, S> createSegment(int i) {
        return this.entryHelper.newSegment(this, i);
    }

    final V getLiveValue(E e) {
        if (e.getKey() == null) {
            return null;
        }
        return (V) e.getValue();
    }

    final com.google.common.collect.MapMakerInternalMap.Segment<K, V, E, S>[] newSegmentArray(int i) {
        return new com.google.common.collect.MapMakerInternalMap.Segment[i];
    }

    static abstract class Segment<K, V, E extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap.Segment<K, V, E, S>> extends java.util.concurrent.locks.ReentrantLock {
        volatile int count;
        final com.google.common.collect.MapMakerInternalMap<K, V, E, S> map;
        int modCount;
        final java.util.concurrent.atomic.AtomicInteger readCount = new java.util.concurrent.atomic.AtomicInteger();
        volatile java.util.concurrent.atomic.AtomicReferenceArray<E> table;
        int threshold;

        abstract E castForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> internalEntry);

        void maybeClearReferenceQueues() {
        }

        void maybeDrainReferenceQueues() {
        }

        abstract S self();

        Segment(com.google.common.collect.MapMakerInternalMap<K, V, E, S> mapMakerInternalMap, int i) {
            this.map = mapMakerInternalMap;
            initTable(newEntryArray(i));
        }

        void setValue(E e, V v) {
            this.map.entryHelper.setValue(self(), e, v);
        }

        E copyEntry(E e, E e2) {
            return this.map.entryHelper.copy(self(), e, e2);
        }

        java.util.concurrent.atomic.AtomicReferenceArray<E> newEntryArray(int i) {
            return new java.util.concurrent.atomic.AtomicReferenceArray<>(i);
        }

        void initTable(java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray) {
            this.threshold = (atomicReferenceArray.length() * 3) / 4;
            this.table = atomicReferenceArray;
        }

        java.lang.ref.ReferenceQueue<K> getKeyReferenceQueueForTesting() {
            throw new java.lang.AssertionError();
        }

        java.lang.ref.ReferenceQueue<V> getValueReferenceQueueForTesting() {
            throw new java.lang.AssertionError();
        }

        com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, E> getWeakValueReferenceForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> internalEntry) {
            throw new java.lang.AssertionError();
        }

        com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, E> newWeakValueReferenceForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> internalEntry, V v) {
            throw new java.lang.AssertionError();
        }

        void setWeakValueReferenceForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> internalEntry, com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, ? extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?>> weakValueReference) {
            throw new java.lang.AssertionError();
        }

        void setTableEntryForTesting(int i, com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> internalEntry) {
            this.table.set(i, castForTesting(internalEntry));
        }

        E copyForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> internalEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> internalEntry2) {
            return this.map.entryHelper.copy(self(), castForTesting(internalEntry), castForTesting(internalEntry2));
        }

        void setValueForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> internalEntry, V v) {
            this.map.entryHelper.setValue(self(), castForTesting(internalEntry), v);
        }

        E newEntryForTesting(K k, int i, com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> internalEntry) {
            return this.map.entryHelper.newEntry(self(), k, i, castForTesting(internalEntry));
        }

        boolean removeTableEntryForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> internalEntry) {
            return removeEntryForTesting(castForTesting(internalEntry));
        }

        E removeFromChainForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> internalEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> internalEntry2) {
            return removeFromChain(castForTesting(internalEntry), castForTesting(internalEntry2));
        }

        V getLiveValueForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> internalEntry) {
            return getLiveValue(castForTesting(internalEntry));
        }

        void tryDrainReferenceQueues() {
            if (tryLock()) {
                try {
                    maybeDrainReferenceQueues();
                } finally {
                    unlock();
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        void drainKeyReferenceQueue(java.lang.ref.ReferenceQueue<K> referenceQueue) {
            int i = 0;
            do {
                java.lang.ref.Reference<? extends K> poll = referenceQueue.poll();
                if (poll == null) {
                    return;
                }
                this.map.reclaimKey((com.google.common.collect.MapMakerInternalMap.InternalEntry) poll);
                i++;
            } while (i != 16);
        }

        void drainValueReferenceQueue(java.lang.ref.ReferenceQueue<V> referenceQueue) {
            int i = 0;
            do {
                java.lang.ref.Reference<? extends V> poll = referenceQueue.poll();
                if (poll == null) {
                    return;
                }
                this.map.reclaimValue((com.google.common.collect.MapMakerInternalMap.WeakValueReference) poll);
                i++;
            } while (i != 16);
        }

        <T> void clearReferenceQueue(java.lang.ref.ReferenceQueue<T> referenceQueue) {
            while (referenceQueue.poll() != null) {
            }
        }

        E getFirst(int i) {
            return this.table.get(i & (r0.length() - 1));
        }

        E getEntry(java.lang.Object obj, int i) {
            if (this.count == 0) {
                return null;
            }
            for (E first = getFirst(i); first != null; first = (E) first.getNext()) {
                if (first.getHash() == i) {
                    java.lang.Object key = first.getKey();
                    if (key == null) {
                        tryDrainReferenceQueues();
                    } else if (this.map.keyEquivalence.equivalent(obj, key)) {
                        return first;
                    }
                }
            }
            return null;
        }

        E getLiveEntry(java.lang.Object obj, int i) {
            return getEntry(obj, i);
        }

        V get(java.lang.Object obj, int i) {
            try {
                E liveEntry = getLiveEntry(obj, i);
                if (liveEntry != null) {
                    V v = (V) liveEntry.getValue();
                    if (v == null) {
                        tryDrainReferenceQueues();
                    }
                    return v;
                }
                postReadCleanup();
                return null;
            } finally {
                postReadCleanup();
            }
        }

        boolean containsKey(java.lang.Object obj, int i) {
            try {
                boolean z = false;
                if (this.count == 0) {
                    return false;
                }
                E liveEntry = getLiveEntry(obj, i);
                if (liveEntry != null) {
                    if (liveEntry.getValue() != null) {
                        z = true;
                    }
                }
                return z;
            } finally {
                postReadCleanup();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        boolean containsValue(java.lang.Object obj) {
            try {
                if (this.count != 0) {
                    java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray = this.table;
                    int length = atomicReferenceArray.length();
                    for (int i = 0; i < length; i++) {
                        for (E e = atomicReferenceArray.get(i); e != null; e = e.getNext()) {
                            java.lang.Object liveValue = getLiveValue(e);
                            if (liveValue != null && this.map.valueEquivalence().equivalent(obj, liveValue)) {
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

        /* JADX WARN: Multi-variable type inference failed */
        V put(K k, int i, V v, boolean z) {
            lock();
            try {
                preWriteCleanup();
                int i2 = this.count + 1;
                if (i2 > this.threshold) {
                    expand();
                    i2 = this.count + 1;
                }
                java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                com.google.common.collect.MapMakerInternalMap.InternalEntry internalEntry = (com.google.common.collect.MapMakerInternalMap.InternalEntry) atomicReferenceArray.get(length);
                for (com.google.common.collect.MapMakerInternalMap.InternalEntry internalEntry2 = internalEntry; internalEntry2 != null; internalEntry2 = internalEntry2.getNext()) {
                    java.lang.Object key = internalEntry2.getKey();
                    if (internalEntry2.getHash() == i && key != null && this.map.keyEquivalence.equivalent(k, key)) {
                        V v2 = (V) internalEntry2.getValue();
                        if (v2 == null) {
                            this.modCount++;
                            setValue(internalEntry2, v);
                            this.count = this.count;
                            return null;
                        }
                        if (z) {
                            return v2;
                        }
                        this.modCount++;
                        setValue(internalEntry2, v);
                        return v2;
                    }
                }
                this.modCount++;
                com.google.common.collect.MapMakerInternalMap.InternalEntry newEntry = this.map.entryHelper.newEntry(self(), k, i, internalEntry);
                setValue(newEntry, v);
                atomicReferenceArray.set(length, newEntry);
                this.count = i2;
                return null;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        void expand() {
            java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray = this.table;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i = this.count;
            rx.internal.util.atomic.SpscExactAtomicArrayQueue spscExactAtomicArrayQueue = (java.util.concurrent.atomic.AtomicReferenceArray<E>) newEntryArray(length << 1);
            this.threshold = (spscExactAtomicArrayQueue.length() * 3) / 4;
            int length2 = spscExactAtomicArrayQueue.length() - 1;
            for (int i2 = 0; i2 < length; i2++) {
                E e = atomicReferenceArray.get(i2);
                if (e != null) {
                    com.google.common.collect.MapMakerInternalMap.InternalEntry next = e.getNext();
                    int hash = e.getHash() & length2;
                    if (next == null) {
                        spscExactAtomicArrayQueue.set(hash, e);
                    } else {
                        com.google.common.collect.MapMakerInternalMap.InternalEntry internalEntry = e;
                        while (next != null) {
                            int hash2 = next.getHash() & length2;
                            if (hash2 != hash) {
                                internalEntry = next;
                                hash = hash2;
                            }
                            next = next.getNext();
                        }
                        spscExactAtomicArrayQueue.set(hash, internalEntry);
                        while (e != internalEntry) {
                            int hash3 = e.getHash() & length2;
                            com.google.common.collect.MapMakerInternalMap.InternalEntry copyEntry = copyEntry(e, (com.google.common.collect.MapMakerInternalMap.InternalEntry) spscExactAtomicArrayQueue.get(hash3));
                            if (copyEntry != null) {
                                spscExactAtomicArrayQueue.set(hash3, copyEntry);
                            } else {
                                i--;
                            }
                            e = e.getNext();
                        }
                    }
                }
            }
            this.table = spscExactAtomicArrayQueue;
            this.count = i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        boolean replace(K k, int i, V v, V v2) {
            lock();
            try {
                preWriteCleanup();
                java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                com.google.common.collect.MapMakerInternalMap.InternalEntry internalEntry = (com.google.common.collect.MapMakerInternalMap.InternalEntry) atomicReferenceArray.get(length);
                for (com.google.common.collect.MapMakerInternalMap.InternalEntry internalEntry2 = internalEntry; internalEntry2 != null; internalEntry2 = internalEntry2.getNext()) {
                    java.lang.Object key = internalEntry2.getKey();
                    if (internalEntry2.getHash() == i && key != null && this.map.keyEquivalence.equivalent(k, key)) {
                        java.lang.Object value = internalEntry2.getValue();
                        if (value == null) {
                            if (isCollected(internalEntry2)) {
                                this.modCount++;
                                com.google.common.collect.MapMakerInternalMap.InternalEntry removeFromChain = removeFromChain(internalEntry, internalEntry2);
                                int i2 = this.count;
                                atomicReferenceArray.set(length, removeFromChain);
                                this.count = i2 - 1;
                            }
                            return false;
                        }
                        if (!this.map.valueEquivalence().equivalent(v, value)) {
                            return false;
                        }
                        this.modCount++;
                        setValue(internalEntry2, v2);
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        V replace(K k, int i, V v) {
            lock();
            try {
                preWriteCleanup();
                java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                com.google.common.collect.MapMakerInternalMap.InternalEntry internalEntry = (com.google.common.collect.MapMakerInternalMap.InternalEntry) atomicReferenceArray.get(length);
                for (com.google.common.collect.MapMakerInternalMap.InternalEntry internalEntry2 = internalEntry; internalEntry2 != null; internalEntry2 = internalEntry2.getNext()) {
                    java.lang.Object key = internalEntry2.getKey();
                    if (internalEntry2.getHash() == i && key != null && this.map.keyEquivalence.equivalent(k, key)) {
                        V v2 = (V) internalEntry2.getValue();
                        if (v2 == null) {
                            if (isCollected(internalEntry2)) {
                                this.modCount++;
                                com.google.common.collect.MapMakerInternalMap.InternalEntry removeFromChain = removeFromChain(internalEntry, internalEntry2);
                                int i2 = this.count;
                                atomicReferenceArray.set(length, removeFromChain);
                                this.count = i2 - 1;
                            }
                            return null;
                        }
                        this.modCount++;
                        setValue(internalEntry2, v);
                        return v2;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        V remove(java.lang.Object obj, int i) {
            lock();
            try {
                preWriteCleanup();
                java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                com.google.common.collect.MapMakerInternalMap.InternalEntry internalEntry = (com.google.common.collect.MapMakerInternalMap.InternalEntry) atomicReferenceArray.get(length);
                for (com.google.common.collect.MapMakerInternalMap.InternalEntry internalEntry2 = internalEntry; internalEntry2 != null; internalEntry2 = internalEntry2.getNext()) {
                    java.lang.Object key = internalEntry2.getKey();
                    if (internalEntry2.getHash() == i && key != null && this.map.keyEquivalence.equivalent(obj, key)) {
                        V v = (V) internalEntry2.getValue();
                        if (v == null && !isCollected(internalEntry2)) {
                            return null;
                        }
                        this.modCount++;
                        com.google.common.collect.MapMakerInternalMap.InternalEntry removeFromChain = removeFromChain(internalEntry, internalEntry2);
                        int i2 = this.count;
                        atomicReferenceArray.set(length, removeFromChain);
                        this.count = i2 - 1;
                        return v;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
        
            if (r8.map.valueEquivalence().equivalent(r11, r4.getValue()) == false) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
        
            r5 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
        
            r8.modCount++;
            r9 = removeFromChain(r3, r4);
            r10 = r8.count;
            r0.set(r1, r9);
            r8.count = r10 - 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
        
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
        
            if (isCollected(r4) == false) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
        
            return false;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        boolean remove(java.lang.Object obj, int i, java.lang.Object obj2) {
            lock();
            try {
                preWriteCleanup();
                java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                com.google.common.collect.MapMakerInternalMap.InternalEntry internalEntry = (com.google.common.collect.MapMakerInternalMap.InternalEntry) atomicReferenceArray.get(length);
                com.google.common.collect.MapMakerInternalMap.InternalEntry internalEntry2 = internalEntry;
                while (true) {
                    boolean z = false;
                    if (internalEntry2 == null) {
                        return false;
                    }
                    java.lang.Object key = internalEntry2.getKey();
                    if (internalEntry2.getHash() == i && key != null && this.map.keyEquivalence.equivalent(obj, key)) {
                        break;
                    }
                    internalEntry2 = internalEntry2.getNext();
                }
            } finally {
                unlock();
            }
        }

        void clear() {
            if (this.count != 0) {
                lock();
                try {
                    java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray = this.table;
                    for (int i = 0; i < atomicReferenceArray.length(); i++) {
                        atomicReferenceArray.set(i, null);
                    }
                    maybeClearReferenceQueues();
                    this.readCount.set(0);
                    this.modCount++;
                    this.count = 0;
                } finally {
                    unlock();
                }
            }
        }

        E removeFromChain(E e, E e2) {
            int i = this.count;
            E e3 = (E) e2.getNext();
            while (e != e2) {
                E copyEntry = copyEntry(e, e3);
                if (copyEntry != null) {
                    e3 = copyEntry;
                } else {
                    i--;
                }
                e = (E) e.getNext();
            }
            this.count = i;
            return e3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        boolean reclaimKey(E e, int i) {
            lock();
            try {
                java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = i & (atomicReferenceArray.length() - 1);
                com.google.common.collect.MapMakerInternalMap.InternalEntry internalEntry = (com.google.common.collect.MapMakerInternalMap.InternalEntry) atomicReferenceArray.get(length);
                for (com.google.common.collect.MapMakerInternalMap.InternalEntry internalEntry2 = internalEntry; internalEntry2 != null; internalEntry2 = internalEntry2.getNext()) {
                    if (internalEntry2 == e) {
                        this.modCount++;
                        com.google.common.collect.MapMakerInternalMap.InternalEntry removeFromChain = removeFromChain(internalEntry, internalEntry2);
                        int i2 = this.count;
                        atomicReferenceArray.set(length, removeFromChain);
                        this.count = i2 - 1;
                        return true;
                    }
                }
                unlock();
                return false;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        boolean reclaimValue(K k, int i, com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, E> weakValueReference) {
            lock();
            try {
                java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                com.google.common.collect.MapMakerInternalMap.InternalEntry internalEntry = (com.google.common.collect.MapMakerInternalMap.InternalEntry) atomicReferenceArray.get(length);
                for (com.google.common.collect.MapMakerInternalMap.InternalEntry internalEntry2 = internalEntry; internalEntry2 != null; internalEntry2 = internalEntry2.getNext()) {
                    java.lang.Object key = internalEntry2.getKey();
                    if (internalEntry2.getHash() == i && key != null && this.map.keyEquivalence.equivalent(k, key)) {
                        if (((com.google.common.collect.MapMakerInternalMap.WeakValueEntry) internalEntry2).getValueReference() != weakValueReference) {
                            return false;
                        }
                        this.modCount++;
                        com.google.common.collect.MapMakerInternalMap.InternalEntry removeFromChain = removeFromChain(internalEntry, internalEntry2);
                        int i2 = this.count;
                        atomicReferenceArray.set(length, removeFromChain);
                        this.count = i2 - 1;
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        boolean clearValueForTesting(K k, int i, com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, ? extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?>> weakValueReference) {
            lock();
            try {
                java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                com.google.common.collect.MapMakerInternalMap.InternalEntry internalEntry = (com.google.common.collect.MapMakerInternalMap.InternalEntry) atomicReferenceArray.get(length);
                for (com.google.common.collect.MapMakerInternalMap.InternalEntry internalEntry2 = internalEntry; internalEntry2 != null; internalEntry2 = internalEntry2.getNext()) {
                    java.lang.Object key = internalEntry2.getKey();
                    if (internalEntry2.getHash() == i && key != null && this.map.keyEquivalence.equivalent(k, key)) {
                        if (((com.google.common.collect.MapMakerInternalMap.WeakValueEntry) internalEntry2).getValueReference() != weakValueReference) {
                            return false;
                        }
                        atomicReferenceArray.set(length, removeFromChain(internalEntry, internalEntry2));
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        boolean removeEntryForTesting(E e) {
            int hash = e.getHash();
            java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray = this.table;
            int length = hash & (atomicReferenceArray.length() - 1);
            com.google.common.collect.MapMakerInternalMap.InternalEntry internalEntry = (com.google.common.collect.MapMakerInternalMap.InternalEntry) atomicReferenceArray.get(length);
            for (com.google.common.collect.MapMakerInternalMap.InternalEntry internalEntry2 = internalEntry; internalEntry2 != null; internalEntry2 = internalEntry2.getNext()) {
                if (internalEntry2 == e) {
                    this.modCount++;
                    com.google.common.collect.MapMakerInternalMap.InternalEntry removeFromChain = removeFromChain(internalEntry, internalEntry2);
                    int i = this.count;
                    atomicReferenceArray.set(length, removeFromChain);
                    this.count = i - 1;
                    return true;
                }
            }
            return false;
        }

        static <K, V, E extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E>> boolean isCollected(E e) {
            return e.getValue() == null;
        }

        V getLiveValue(E e) {
            if (e.getKey() == null) {
                tryDrainReferenceQueues();
                return null;
            }
            V v = (V) e.getValue();
            if (v != null) {
                return v;
            }
            tryDrainReferenceQueues();
            return null;
        }

        void postReadCleanup() {
            if ((this.readCount.incrementAndGet() & 63) == 0) {
                runCleanup();
            }
        }

        void preWriteCleanup() {
            runLockedCleanup();
        }

        void runCleanup() {
            runLockedCleanup();
        }

        void runLockedCleanup() {
            if (tryLock()) {
                try {
                    maybeDrainReferenceQueues();
                    this.readCount.set(0);
                } finally {
                    unlock();
                }
            }
        }
    }

    static final class StrongKeyStrongValueSegment<K, V> extends com.google.common.collect.MapMakerInternalMap.Segment<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueSegment<K, V>> {
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueSegment<K, V> self() {
            return this;
        }

        StrongKeyStrongValueSegment(com.google.common.collect.MapMakerInternalMap<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i) {
            super(mapMakerInternalMap, i);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V> castForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> internalEntry) {
            return (com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry) internalEntry;
        }
    }

    static final class StrongKeyWeakValueSegment<K, V> extends com.google.common.collect.MapMakerInternalMap.Segment<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment<K, V>> {
        private final java.lang.ref.ReferenceQueue<V> queueForValues;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment<K, V> self() {
            return this;
        }

        StrongKeyWeakValueSegment(com.google.common.collect.MapMakerInternalMap<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i) {
            super(mapMakerInternalMap, i);
            this.queueForValues = new java.lang.ref.ReferenceQueue<>();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        final java.lang.ref.ReferenceQueue<V> getValueReferenceQueueForTesting() {
            return this.queueForValues;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V> castForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> internalEntry) {
            return (com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry) internalEntry;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V>> getWeakValueReferenceForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> internalEntry) {
            return castForTesting((com.google.common.collect.MapMakerInternalMap.InternalEntry) internalEntry).getValueReference();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V>> newWeakValueReferenceForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> internalEntry, V v) {
            return new com.google.common.collect.MapMakerInternalMap.WeakValueReferenceImpl(this.queueForValues, v, castForTesting((com.google.common.collect.MapMakerInternalMap.InternalEntry) internalEntry));
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final void setWeakValueReferenceForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> internalEntry, com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, ? extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?>> weakValueReference) {
            com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V> castForTesting = castForTesting((com.google.common.collect.MapMakerInternalMap.InternalEntry) internalEntry);
            com.google.common.collect.MapMakerInternalMap.WeakValueReference weakValueReference2 = ((com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry) castForTesting).valueReference;
            ((com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry) castForTesting).valueReference = weakValueReference;
            weakValueReference2.clear();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        final void maybeDrainReferenceQueues() {
            drainValueReferenceQueue(this.queueForValues);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        final void maybeClearReferenceQueues() {
            clearReferenceQueue(this.queueForValues);
        }
    }

    static final class StrongKeyDummyValueSegment<K> extends com.google.common.collect.MapMakerInternalMap.Segment<K, com.google.common.collect.MapMaker.Dummy, com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K>, com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueSegment<K>> {
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueSegment<K> self() {
            return this;
        }

        StrongKeyDummyValueSegment(com.google.common.collect.MapMakerInternalMap<K, com.google.common.collect.MapMaker.Dummy, com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K>, com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueSegment<K>> mapMakerInternalMap, int i) {
            super(mapMakerInternalMap, i);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K> castForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, com.google.common.collect.MapMaker.Dummy, ?> internalEntry) {
            return (com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry) internalEntry;
        }
    }

    static final class WeakKeyStrongValueSegment<K, V> extends com.google.common.collect.MapMakerInternalMap.Segment<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment<K, V>> {
        private final java.lang.ref.ReferenceQueue<K> queueForKeys;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment<K, V> self() {
            return this;
        }

        WeakKeyStrongValueSegment(com.google.common.collect.MapMakerInternalMap<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i) {
            super(mapMakerInternalMap, i);
            this.queueForKeys = new java.lang.ref.ReferenceQueue<>();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        final java.lang.ref.ReferenceQueue<K> getKeyReferenceQueueForTesting() {
            return this.queueForKeys;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V> castForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> internalEntry) {
            return (com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry) internalEntry;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        final void maybeDrainReferenceQueues() {
            drainKeyReferenceQueue(this.queueForKeys);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        final void maybeClearReferenceQueues() {
            clearReferenceQueue(this.queueForKeys);
        }
    }

    static final class WeakKeyWeakValueSegment<K, V> extends com.google.common.collect.MapMakerInternalMap.Segment<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment<K, V>> {
        private final java.lang.ref.ReferenceQueue<K> queueForKeys;
        private final java.lang.ref.ReferenceQueue<V> queueForValues;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment<K, V> self() {
            return this;
        }

        WeakKeyWeakValueSegment(com.google.common.collect.MapMakerInternalMap<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i) {
            super(mapMakerInternalMap, i);
            this.queueForKeys = new java.lang.ref.ReferenceQueue<>();
            this.queueForValues = new java.lang.ref.ReferenceQueue<>();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        final java.lang.ref.ReferenceQueue<K> getKeyReferenceQueueForTesting() {
            return this.queueForKeys;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        final java.lang.ref.ReferenceQueue<V> getValueReferenceQueueForTesting() {
            return this.queueForValues;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V> castForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> internalEntry) {
            return (com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry) internalEntry;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V>> getWeakValueReferenceForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> internalEntry) {
            return castForTesting((com.google.common.collect.MapMakerInternalMap.InternalEntry) internalEntry).getValueReference();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V>> newWeakValueReferenceForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> internalEntry, V v) {
            return new com.google.common.collect.MapMakerInternalMap.WeakValueReferenceImpl(this.queueForValues, v, castForTesting((com.google.common.collect.MapMakerInternalMap.InternalEntry) internalEntry));
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final void setWeakValueReferenceForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> internalEntry, com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, ? extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?>> weakValueReference) {
            com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V> castForTesting = castForTesting((com.google.common.collect.MapMakerInternalMap.InternalEntry) internalEntry);
            com.google.common.collect.MapMakerInternalMap.WeakValueReference weakValueReference2 = ((com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry) castForTesting).valueReference;
            ((com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry) castForTesting).valueReference = weakValueReference;
            weakValueReference2.clear();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        final void maybeDrainReferenceQueues() {
            drainKeyReferenceQueue(this.queueForKeys);
            drainValueReferenceQueue(this.queueForValues);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        final void maybeClearReferenceQueues() {
            clearReferenceQueue(this.queueForKeys);
        }
    }

    static final class WeakKeyDummyValueSegment<K> extends com.google.common.collect.MapMakerInternalMap.Segment<K, com.google.common.collect.MapMaker.Dummy, com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K>, com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment<K>> {
        private final java.lang.ref.ReferenceQueue<K> queueForKeys;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment<K> self() {
            return this;
        }

        WeakKeyDummyValueSegment(com.google.common.collect.MapMakerInternalMap<K, com.google.common.collect.MapMaker.Dummy, com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K>, com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment<K>> mapMakerInternalMap, int i) {
            super(mapMakerInternalMap, i);
            this.queueForKeys = new java.lang.ref.ReferenceQueue<>();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        final java.lang.ref.ReferenceQueue<K> getKeyReferenceQueueForTesting() {
            return this.queueForKeys;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K> castForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, com.google.common.collect.MapMaker.Dummy, ?> internalEntry) {
            return (com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry) internalEntry;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        final void maybeDrainReferenceQueues() {
            drainKeyReferenceQueue(this.queueForKeys);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        final void maybeClearReferenceQueues() {
            clearReferenceQueue(this.queueForKeys);
        }
    }

    static final class CleanupMapTask implements java.lang.Runnable {
        final java.lang.ref.WeakReference<com.google.common.collect.MapMakerInternalMap<?, ?, ?, ?>> mapReference;

        public CleanupMapTask(com.google.common.collect.MapMakerInternalMap<?, ?, ?, ?> mapMakerInternalMap) {
            this.mapReference = new java.lang.ref.WeakReference<>(mapMakerInternalMap);
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.google.common.collect.MapMakerInternalMap<?, ?, ?, ?> mapMakerInternalMap = this.mapReference.get();
            if (mapMakerInternalMap == null) {
                throw new java.util.concurrent.CancellationException();
            }
            for (com.google.common.collect.MapMakerInternalMap.Segment<?, ?, ?, ?> segment : mapMakerInternalMap.segments) {
                segment.runCleanup();
            }
        }
    }

    final com.google.common.collect.MapMakerInternalMap.Strength keyStrength() {
        return this.entryHelper.keyStrength();
    }

    final com.google.common.collect.MapMakerInternalMap.Strength valueStrength() {
        return this.entryHelper.valueStrength();
    }

    final com.google.common.base.Equivalence<java.lang.Object> valueEquivalence() {
        return this.entryHelper.valueStrength().defaultEquivalence();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        com.google.common.collect.MapMakerInternalMap.Segment<K, V, E, S>[] segmentArr = this.segments;
        long j = 0;
        for (int i = 0; i < segmentArr.length; i++) {
            if (segmentArr[i].count != 0) {
                return false;
            }
            j += segmentArr[i].modCount;
        }
        if (j == 0) {
            return true;
        }
        for (int i2 = 0; i2 < segmentArr.length; i2++) {
            if (segmentArr[i2].count != 0) {
                return false;
            }
            j -= segmentArr[i2].modCount;
        }
        return j == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        long j = 0;
        for (int i = 0; i < this.segments.length; i++) {
            j += r0[i].count;
        }
        return com.google.common.primitives.Ints.saturatedCast(j);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        int hash = hash(obj);
        return segmentFor(hash).get(obj, hash);
    }

    final E getEntry(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        int hash = hash(obj);
        return segmentFor(hash).getEntry(obj, hash);
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
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.google.common.collect.MapMakerInternalMap$Segment] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.common.collect.MapMakerInternalMap$Segment<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>>[]] */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        boolean z = false;
        if (obj == null) {
            return false;
        }
        com.google.common.collect.MapMakerInternalMap.Segment<K, V, E, S>[] segmentArr = this.segments;
        long j = -1;
        int i = 0;
        while (i < 3) {
            int length = segmentArr.length;
            long j2 = 0;
            for (?? r10 = z; r10 < length; r10++) {
                ?? r11 = segmentArr[r10];
                int i2 = r11.count;
                java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray = r11.table;
                for (?? r13 = z; r13 < atomicReferenceArray.length(); r13++) {
                    for (E e = atomicReferenceArray.get(r13); e != null; e = e.getNext()) {
                        java.lang.Object liveValue = r11.getLiveValue(e);
                        if (liveValue != null && valueEquivalence().equivalent(obj, liveValue)) {
                            return true;
                        }
                    }
                }
                j2 += r11.modCount;
                z = false;
            }
            if (j2 == j) {
                return false;
            }
            i++;
            j = j2;
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
        for (com.google.common.collect.MapMakerInternalMap.Segment<K, V, E, S> segment : this.segments) {
            segment.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set<K> keySet() {
        java.util.Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        com.google.common.collect.MapMakerInternalMap.KeySet keySet = new com.google.common.collect.MapMakerInternalMap.KeySet();
        this.keySet = keySet;
        return keySet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Collection<V> values() {
        java.util.Collection<V> collection = this.values;
        if (collection != null) {
            return collection;
        }
        com.google.common.collect.MapMakerInternalMap.Values values = new com.google.common.collect.MapMakerInternalMap.Values();
        this.values = values;
        return values;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        java.util.Set<java.util.Map.Entry<K, V>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        com.google.common.collect.MapMakerInternalMap.EntrySet entrySet = new com.google.common.collect.MapMakerInternalMap.EntrySet();
        this.entrySet = entrySet;
        return entrySet;
    }

    abstract class HashIterator<T> implements java.util.Iterator<T> {
        com.google.common.collect.MapMakerInternalMap.Segment<K, V, E, S> currentSegment;
        java.util.concurrent.atomic.AtomicReferenceArray<E> currentTable;
        com.google.common.collect.MapMakerInternalMap<K, V, E, S>.WriteThroughEntry lastReturned;
        E nextEntry;
        com.google.common.collect.MapMakerInternalMap<K, V, E, S>.WriteThroughEntry nextExternal;
        int nextSegmentIndex;
        int nextTableIndex = -1;

        @Override // java.util.Iterator
        public abstract T next();

        HashIterator() {
            this.nextSegmentIndex = com.google.common.collect.MapMakerInternalMap.this.segments.length - 1;
            advance();
        }

        final void advance() {
            this.nextExternal = null;
            if (nextInChain() || nextInTable()) {
                return;
            }
            while (this.nextSegmentIndex >= 0) {
                com.google.common.collect.MapMakerInternalMap.Segment<K, V, E, S>[] segmentArr = com.google.common.collect.MapMakerInternalMap.this.segments;
                int i = this.nextSegmentIndex;
                this.nextSegmentIndex = i - 1;
                com.google.common.collect.MapMakerInternalMap.Segment<K, V, E, S> segment = segmentArr[i];
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
            E e = this.nextEntry;
            if (e == null) {
                return false;
            }
            while (true) {
                E e2 = (E) e.getNext();
                this.nextEntry = e2;
                if (e2 == null) {
                    return false;
                }
                if (advanceTo(e2)) {
                    return true;
                }
                e = this.nextEntry;
            }
        }

        boolean nextInTable() {
            while (true) {
                int i = this.nextTableIndex;
                if (i < 0) {
                    return false;
                }
                java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray = this.currentTable;
                this.nextTableIndex = i - 1;
                E e = atomicReferenceArray.get(i);
                this.nextEntry = e;
                if (e != null && (advanceTo(e) || nextInChain())) {
                    return true;
                }
            }
        }

        boolean advanceTo(E e) {
            try {
                java.lang.Object key = e.getKey();
                java.lang.Object liveValue = com.google.common.collect.MapMakerInternalMap.this.getLiveValue(e);
                if (liveValue == null) {
                    this.currentSegment.postReadCleanup();
                    return false;
                }
                this.nextExternal = new com.google.common.collect.MapMakerInternalMap.WriteThroughEntry(key, liveValue);
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

        com.google.common.collect.MapMakerInternalMap<K, V, E, S>.WriteThroughEntry nextEntry() {
            com.google.common.collect.MapMakerInternalMap<K, V, E, S>.WriteThroughEntry writeThroughEntry = this.nextExternal;
            if (writeThroughEntry == null) {
                throw new java.util.NoSuchElementException();
            }
            this.lastReturned = writeThroughEntry;
            advance();
            return this.lastReturned;
        }

        @Override // java.util.Iterator
        public void remove() {
            com.google.common.collect.CollectPreconditions.checkRemove(this.lastReturned != null);
            com.google.common.collect.MapMakerInternalMap.this.remove(this.lastReturned.getKey());
            this.lastReturned = null;
        }
    }

    final class KeyIterator extends com.google.common.collect.MapMakerInternalMap<K, V, E, S>.HashIterator<K> {
        KeyIterator() {
            super();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.HashIterator, java.util.Iterator
        public final K next() {
            return nextEntry().getKey();
        }
    }

    final class ValueIterator extends com.google.common.collect.MapMakerInternalMap<K, V, E, S>.HashIterator<V> {
        ValueIterator() {
            super();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.HashIterator, java.util.Iterator
        public final V next() {
            return nextEntry().getValue();
        }
    }

    final class WriteThroughEntry extends java.util.AbstractMap.SimpleEntry<K, V> {
        WriteThroughEntry(K k, V v) {
            super(k, v);
        }

        @Override // java.util.AbstractMap.SimpleEntry, java.util.Map.Entry
        public final V setValue(V v) {
            com.google.common.collect.MapMakerInternalMap.this.put(getKey(), v);
            return (V) super.setValue(v);
        }
    }

    final class EntryIterator extends com.google.common.collect.MapMakerInternalMap<K, V, E, S>.HashIterator<java.util.Map.Entry<K, V>> {
        EntryIterator() {
            super();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.HashIterator, java.util.Iterator
        public final java.util.Map.Entry<K, V> next() {
            return nextEntry();
        }
    }

    final class KeySet extends java.util.AbstractSet<K> {
        KeySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final java.util.Iterator<K> iterator() {
            return new com.google.common.collect.MapMakerInternalMap.KeyIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return com.google.common.collect.MapMakerInternalMap.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return com.google.common.collect.MapMakerInternalMap.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(java.lang.Object obj) {
            return com.google.common.collect.MapMakerInternalMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(java.lang.Object obj) {
            return com.google.common.collect.MapMakerInternalMap.this.remove(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            com.google.common.collect.MapMakerInternalMap.this.clear();
        }
    }

    final class Values extends java.util.AbstractCollection<V> {
        Values() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final java.util.Iterator<V> iterator() {
            return new com.google.common.collect.MapMakerInternalMap.ValueIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return com.google.common.collect.MapMakerInternalMap.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return com.google.common.collect.MapMakerInternalMap.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(java.lang.Object obj) {
            return com.google.common.collect.MapMakerInternalMap.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            com.google.common.collect.MapMakerInternalMap.this.clear();
        }
    }

    final class EntrySet extends java.util.AbstractSet<java.util.Map.Entry<K, V>> {
        EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
            return new com.google.common.collect.MapMakerInternalMap.EntryIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(java.lang.Object obj) {
            java.util.Map.Entry entry;
            java.lang.Object key;
            V v;
            return (obj instanceof java.util.Map.Entry) && (key = (entry = (java.util.Map.Entry) obj).getKey()) != null && (v = com.google.common.collect.MapMakerInternalMap.this.get(key)) != null && com.google.common.collect.MapMakerInternalMap.this.valueEquivalence().equivalent(entry.getValue(), v);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(java.lang.Object obj) {
            java.util.Map.Entry entry;
            java.lang.Object key;
            return (obj instanceof java.util.Map.Entry) && (key = (entry = (java.util.Map.Entry) obj).getKey()) != null && com.google.common.collect.MapMakerInternalMap.this.remove(key, entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return com.google.common.collect.MapMakerInternalMap.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return com.google.common.collect.MapMakerInternalMap.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            com.google.common.collect.MapMakerInternalMap.this.clear();
        }
    }

    final java.lang.Object writeReplace() {
        return new com.google.common.collect.MapMakerInternalMap.SerializationProxy(this.entryHelper.keyStrength(), this.entryHelper.valueStrength(), this.keyEquivalence, this.entryHelper.valueStrength().defaultEquivalence(), this.concurrencyLevel, this);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use SerializationProxy");
    }

    static abstract class AbstractSerializationProxy<K, V> extends com.google.common.collect.ForwardingConcurrentMap<K, V> implements java.io.Serializable {
        private static final long serialVersionUID = 3;
        final int concurrencyLevel;
        transient java.util.concurrent.ConcurrentMap<K, V> delegate;
        final com.google.common.base.Equivalence<java.lang.Object> keyEquivalence;
        final com.google.common.collect.MapMakerInternalMap.Strength keyStrength;
        final com.google.common.base.Equivalence<java.lang.Object> valueEquivalence;
        final com.google.common.collect.MapMakerInternalMap.Strength valueStrength;

        AbstractSerializationProxy(com.google.common.collect.MapMakerInternalMap.Strength strength, com.google.common.collect.MapMakerInternalMap.Strength strength2, com.google.common.base.Equivalence<java.lang.Object> equivalence, com.google.common.base.Equivalence<java.lang.Object> equivalence2, int i, java.util.concurrent.ConcurrentMap<K, V> concurrentMap) {
            this.keyStrength = strength;
            this.valueStrength = strength2;
            this.keyEquivalence = equivalence;
            this.valueEquivalence = equivalence2;
            this.concurrencyLevel = i;
            this.delegate = concurrentMap;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingConcurrentMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public java.util.concurrent.ConcurrentMap<K, V> delegate() {
            return this.delegate;
        }

        void writeMapTo(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
            objectOutputStream.writeInt(this.delegate.size());
            for (java.util.Map.Entry<K, V> entry : this.delegate.entrySet()) {
                objectOutputStream.writeObject(entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            objectOutputStream.writeObject(null);
        }

        com.google.common.collect.MapMaker readMapMaker(java.io.ObjectInputStream objectInputStream) throws java.io.IOException {
            return new com.google.common.collect.MapMaker().initialCapacity(objectInputStream.readInt()).setKeyStrength(this.keyStrength).setValueStrength(this.valueStrength).keyEquivalence(this.keyEquivalence).concurrencyLevel(this.concurrencyLevel);
        }

        /* JADX WARN: Multi-variable type inference failed */
        void readEntries(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
            while (true) {
                java.lang.Object readObject = objectInputStream.readObject();
                if (readObject == null) {
                    return;
                }
                this.delegate.put(readObject, objectInputStream.readObject());
            }
        }
    }

    static final class SerializationProxy<K, V> extends com.google.common.collect.MapMakerInternalMap.AbstractSerializationProxy<K, V> {
        private static final long serialVersionUID = 3;

        SerializationProxy(com.google.common.collect.MapMakerInternalMap.Strength strength, com.google.common.collect.MapMakerInternalMap.Strength strength2, com.google.common.base.Equivalence<java.lang.Object> equivalence, com.google.common.base.Equivalence<java.lang.Object> equivalence2, int i, java.util.concurrent.ConcurrentMap<K, V> concurrentMap) {
            super(strength, strength2, equivalence, equivalence2, i, concurrentMap);
        }

        private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
            objectOutputStream.defaultWriteObject();
            writeMapTo(objectOutputStream);
        }

        private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.delegate = readMapMaker(objectInputStream).makeMap();
            readEntries(objectInputStream);
        }

        private java.lang.Object readResolve() {
            return this.delegate;
        }
    }
}
