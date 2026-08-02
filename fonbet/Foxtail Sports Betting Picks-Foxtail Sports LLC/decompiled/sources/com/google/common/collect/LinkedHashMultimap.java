package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.Sets;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public final class LinkedHashMultimap<K, V> extends AbstractSetMultimap<K, V> {
    private static final int DEFAULT_KEY_CAPACITY = 16;
    private static final int DEFAULT_VALUE_SET_CAPACITY = 2;
    static final double VALUE_SET_LOAD_FACTOR = 1.0d;
    private static final long serialVersionUID = 1;
    private transient MultimapIterationChain<K, V> multimapIterationChain;
    transient int valueSetCapacity;

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ Map asMap() {
        return super.asMap();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean containsEntry(Object key, Object value) {
        return super.containsEntry(key, value);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean containsKey(Object key) {
        return super.containsKey(key);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean containsValue(Object value) {
        return super.containsValue(value);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ boolean equals(Object object) {
        return super.equals(object);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ Set get(Object key) {
        return super.get((LinkedHashMultimap<K, V>) key);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ Multiset keys() {
        return super.keys();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean put(Object key, Object value) {
        return super.put(key, value);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean putAll(Multimap multimap) {
        return super.putAll(multimap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean putAll(Object key, Iterable values) {
        return super.putAll(key, values);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean remove(Object key, Object value) {
        return super.remove(key, value);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ Set removeAll(Object key) {
        return super.removeAll(key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ Collection replaceValues(Object key, Iterable values) {
        return replaceValues((LinkedHashMultimap<K, V>) key, values);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // com.google.common.collect.AbstractMultimap
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public static <K, V> LinkedHashMultimap<K, V> create() {
        return new LinkedHashMultimap<>(16, 2);
    }

    public static <K, V> LinkedHashMultimap<K, V> create(int expectedKeys, int expectedValuesPerKey) {
        return new LinkedHashMultimap<>(Maps.capacity(expectedKeys), Maps.capacity(expectedValuesPerKey));
    }

    public static <K, V> LinkedHashMultimap<K, V> create(Multimap<? extends K, ? extends V> multimap) {
        LinkedHashMultimap<K, V> create = create(multimap.keySet().size(), 2);
        create.putAll(multimap);
        return create;
    }

    static final class ValueEntry<K, V> extends AbstractMap.SimpleImmutableEntry<K, V> {
        ValueEntry<K, V> nextInValueBucket;
        private ValueEntry<K, V> predecessorInMultimap;
        private ValueEntry<K, V> predecessorInValueSet;
        final int smearedValueHash;
        private ValueEntry<K, V> successorInMultimap;
        private ValueEntry<K, V> successorInValueSet;

        ValueEntry(K key, V value, int smearedValueHash, ValueEntry<K, V> nextInValueBucket) {
            super(key, value);
            this.smearedValueHash = smearedValueHash;
            this.nextInValueBucket = nextInValueBucket;
        }

        boolean matchesValue(Object v, int smearedVHash) {
            return this.smearedValueHash == smearedVHash && Objects.equals(getValue(), v);
        }
    }

    private LinkedHashMultimap(int keyCapacity, int valueSetCapacity) {
        super(Platform.newLinkedHashMapWithExpectedSize(keyCapacity));
        this.multimapIterationChain = new MultimapIterationChain<>();
        CollectPreconditions.checkNonnegative(valueSetCapacity, "expectedValuesPerKey");
        this.valueSetCapacity = valueSetCapacity;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    public Set<V> createCollection() {
        return Platform.newLinkedHashSetWithExpectedSize(this.valueSetCapacity);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    Collection<V> createCollection(K key) {
        return new ValueSet(key, this.valueSetCapacity);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public Set<V> replaceValues(K key, Iterable<? extends V> values) {
        return super.replaceValues((LinkedHashMultimap<K, V>) key, (Iterable) values);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public Set<Map.Entry<K, V>> entries() {
        return super.entries();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public Set<K> keySet() {
        return super.keySet();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public Collection<V> values() {
        return super.values();
    }

    final class ValueSet extends Sets.ImprovedAbstractSet<V> {
        private ValueEntry<K, V> firstEntry;
        ValueEntry<K, V>[] hashTable;
        private final K key;
        private ValueEntry<K, V> lastEntry;
        private int size = 0;
        private int modCount = 0;

        ValueSet(K key, int expectedValues) {
            this.key = key;
            this.hashTable = new ValueEntry[Hashing.closedTableSize(expectedValues, LinkedHashMultimap.VALUE_SET_LOAD_FACTOR)];
        }

        private void succeedsInValueSet(ValueEntry<K, V> pred, ValueEntry<K, V> succ) {
            if (pred != null) {
                ((ValueEntry) pred).successorInValueSet = succ;
            } else {
                this.firstEntry = succ;
            }
            if (succ != null) {
                ((ValueEntry) succ).predecessorInValueSet = pred;
            } else {
                this.lastEntry = pred;
            }
        }

        private void deleteFromValueSet(ValueEntry<K, V> entry) {
            succeedsInValueSet(((ValueEntry) entry).predecessorInValueSet, ((ValueEntry) entry).successorInValueSet);
        }

        private void appendToValueSet(ValueEntry<K, V> newEntry) {
            succeedsInValueSet(this.lastEntry, newEntry);
            this.lastEntry = newEntry;
        }

        private int mask() {
            return this.hashTable.length - 1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<V> iterator() {
            return new Iterator<V>() { // from class: com.google.common.collect.LinkedHashMultimap.ValueSet.1
                int expectedModCount;
                ValueEntry<K, V> nextEntry;
                ValueEntry<K, V> toRemove;

                {
                    this.nextEntry = ValueSet.this.firstEntry;
                    this.expectedModCount = ValueSet.this.modCount;
                }

                private void checkForComodification() {
                    if (ValueSet.this.modCount != this.expectedModCount) {
                        throw new ConcurrentModificationException();
                    }
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    checkForComodification();
                    return this.nextEntry != null;
                }

                @Override // java.util.Iterator
                public V next() {
                    checkForComodification();
                    ValueEntry<K, V> valueEntry = this.nextEntry;
                    if (valueEntry == null) {
                        throw new NoSuchElementException();
                    }
                    V value = valueEntry.getValue();
                    this.toRemove = valueEntry;
                    this.nextEntry = ((ValueEntry) valueEntry).successorInValueSet;
                    return value;
                }

                @Override // java.util.Iterator
                public void remove() {
                    checkForComodification();
                    Preconditions.checkState(this.toRemove != null, "no calls to next() since the last call to remove()");
                    ValueSet.this.remove(this.toRemove.getValue());
                    this.expectedModCount = ValueSet.this.modCount;
                    this.toRemove = null;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.size;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object o) {
            int smearedHash = Hashing.smearedHash(o);
            for (ValueEntry<K, V> valueEntry = this.hashTable[mask() & smearedHash]; valueEntry != null; valueEntry = valueEntry.nextInValueBucket) {
                if (valueEntry.matchesValue(o, smearedHash)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(V value) {
            int smearedHash = Hashing.smearedHash(value);
            int mask = mask() & smearedHash;
            ValueEntry<K, V> valueEntry = this.hashTable[mask];
            for (ValueEntry<K, V> valueEntry2 = valueEntry; valueEntry2 != null; valueEntry2 = valueEntry2.nextInValueBucket) {
                if (valueEntry2.matchesValue(value, smearedHash)) {
                    return false;
                }
            }
            ValueEntry<K, V> valueEntry3 = new ValueEntry<>(this.key, value, smearedHash, valueEntry);
            appendToValueSet(valueEntry3);
            LinkedHashMultimap.this.multimapIterationChain.append(valueEntry3);
            this.hashTable[mask] = valueEntry3;
            this.size++;
            this.modCount++;
            rehashIfNecessary();
            return true;
        }

        private void rehashIfNecessary() {
            if (Hashing.needsResizing(this.size, this.hashTable.length, LinkedHashMultimap.VALUE_SET_LOAD_FACTOR)) {
                int length = this.hashTable.length * 2;
                ValueEntry<K, V>[] valueEntryArr = new ValueEntry[length];
                this.hashTable = valueEntryArr;
                int i = length - 1;
                for (ValueEntry<K, V> valueEntry = this.firstEntry; valueEntry != null; valueEntry = ((ValueEntry) valueEntry).successorInValueSet) {
                    int i2 = valueEntry.smearedValueHash & i;
                    valueEntry.nextInValueBucket = valueEntryArr[i2];
                    valueEntryArr[i2] = valueEntry;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object o) {
            int smearedHash = Hashing.smearedHash(o);
            int mask = mask() & smearedHash;
            ValueEntry<K, V> valueEntry = null;
            for (ValueEntry<K, V> valueEntry2 = this.hashTable[mask]; valueEntry2 != null; valueEntry2 = valueEntry2.nextInValueBucket) {
                if (!valueEntry2.matchesValue(o, smearedHash)) {
                    valueEntry = valueEntry2;
                } else {
                    if (valueEntry == null) {
                        this.hashTable[mask] = valueEntry2.nextInValueBucket;
                    } else {
                        valueEntry.nextInValueBucket = valueEntry2.nextInValueBucket;
                    }
                    deleteFromValueSet(valueEntry2);
                    LinkedHashMultimap.this.multimapIterationChain.delete(valueEntry2);
                    this.size--;
                    this.modCount++;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            Arrays.fill(this.hashTable, (Object) null);
            this.size = 0;
            for (ValueEntry<K, V> valueEntry = this.firstEntry; valueEntry != null; valueEntry = ((ValueEntry) valueEntry).successorInValueSet) {
                LinkedHashMultimap.this.multimapIterationChain.delete(valueEntry);
            }
            this.firstEntry = null;
            this.lastEntry = null;
            this.modCount++;
        }
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
    Iterator<Map.Entry<K, V>> entryIterator() {
        return new Iterator<Map.Entry<K, V>>() { // from class: com.google.common.collect.LinkedHashMultimap.1
            ValueEntry<K, V> nextEntry;
            ValueEntry<K, V> toRemove;

            {
                this.nextEntry = LinkedHashMultimap.this.multimapIterationChain.firstEntry;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.nextEntry != null;
            }

            @Override // java.util.Iterator
            public Map.Entry<K, V> next() {
                ValueEntry<K, V> valueEntry = this.nextEntry;
                if (valueEntry == null) {
                    throw new NoSuchElementException();
                }
                this.toRemove = valueEntry;
                this.nextEntry = ((ValueEntry) valueEntry).successorInMultimap;
                return valueEntry;
            }

            @Override // java.util.Iterator
            public void remove() {
                Preconditions.checkState(this.toRemove != null, "no calls to next() since the last call to remove()");
                LinkedHashMultimap.this.remove(this.toRemove.getKey(), this.toRemove.getValue());
                this.toRemove = null;
            }
        };
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
    Iterator<V> valueIterator() {
        return Maps.valueIterator(entryIterator());
    }

    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeInt(keySet().size());
        Iterator<K> it = keySet().iterator();
        while (it.hasNext()) {
            stream.writeObject(it.next());
        }
        stream.writeInt(size());
        for (Map.Entry<K, V> entry : entries()) {
            stream.writeObject(entry.getKey());
            stream.writeObject(entry.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
        stream.defaultReadObject();
        this.multimapIterationChain = new MultimapIterationChain<>();
        this.valueSetCapacity = 2;
        int readInt = stream.readInt();
        Map newLinkedHashMapWithExpectedSize = Platform.newLinkedHashMapWithExpectedSize(12);
        for (int i = 0; i < readInt; i++) {
            Object readObject = stream.readObject();
            newLinkedHashMapWithExpectedSize.put(readObject, createCollection(readObject));
        }
        int readInt2 = stream.readInt();
        for (int i2 = 0; i2 < readInt2; i2++) {
            ((Collection) Objects.requireNonNull((Collection) newLinkedHashMapWithExpectedSize.get(stream.readObject()))).add(stream.readObject());
        }
        setMap(newLinkedHashMapWithExpectedSize);
    }

    private static final class MultimapIterationChain<K, V> {
        ValueEntry<K, V> firstEntry;
        ValueEntry<K, V> lastEntry;

        private MultimapIterationChain() {
        }

        void succeeds(ValueEntry<K, V> pred, ValueEntry<K, V> succ) {
            if (pred != null) {
                ((ValueEntry) pred).successorInMultimap = succ;
            } else {
                this.firstEntry = succ;
            }
            if (succ != null) {
                ((ValueEntry) succ).predecessorInMultimap = pred;
            } else {
                this.lastEntry = pred;
            }
        }

        void delete(ValueEntry<K, V> entry) {
            succeeds(((ValueEntry) entry).predecessorInMultimap, ((ValueEntry) entry).successorInMultimap);
        }

        void append(ValueEntry<K, V> newEntry) {
            succeeds(this.lastEntry, newEntry);
            this.lastEntry = newEntry;
        }
    }
}
