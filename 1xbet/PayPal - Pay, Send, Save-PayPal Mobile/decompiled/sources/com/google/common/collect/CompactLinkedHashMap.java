package com.google.common.collect;

/* loaded from: classes9.dex */
final class CompactLinkedHashMap<K, V> extends com.google.common.collect.CompactHashMap<K, V> {
    private static final int ENDPOINT = -2;
    private final boolean accessOrder;
    private transient int firstEntry;
    private transient int lastEntry;
    transient long[] links;

    public static <K, V> com.google.common.collect.CompactLinkedHashMap<K, V> create() {
        return new com.google.common.collect.CompactLinkedHashMap<>();
    }

    public static <K, V> com.google.common.collect.CompactLinkedHashMap<K, V> createWithExpectedSize(int i) {
        return new com.google.common.collect.CompactLinkedHashMap<>(i);
    }

    CompactLinkedHashMap() {
        this(3);
    }

    CompactLinkedHashMap(int i) {
        this(i, false);
    }

    CompactLinkedHashMap(int i, boolean z) {
        super(i);
        this.accessOrder = z;
    }

    @Override // com.google.common.collect.CompactHashMap
    final void init(int i) {
        super.init(i);
        this.firstEntry = -2;
        this.lastEntry = -2;
    }

    @Override // com.google.common.collect.CompactHashMap
    final int allocArrays() {
        int allocArrays = super.allocArrays();
        this.links = new long[allocArrays];
        return allocArrays;
    }

    @Override // com.google.common.collect.CompactHashMap
    final java.util.Map<K, V> createHashFloodingResistantDelegate(int i) {
        return new java.util.LinkedHashMap(i, 1.0f, this.accessOrder);
    }

    @Override // com.google.common.collect.CompactHashMap
    final java.util.Map<K, V> convertToHashFloodingResistantImplementation() {
        java.util.Map<K, V> convertToHashFloodingResistantImplementation = super.convertToHashFloodingResistantImplementation();
        this.links = null;
        return convertToHashFloodingResistantImplementation;
    }

    private int getPredecessor(int i) {
        return ((int) (link(i) >>> 32)) - 1;
    }

    @Override // com.google.common.collect.CompactHashMap
    final int getSuccessor(int i) {
        return ((int) link(i)) - 1;
    }

    private void setSuccessor(int i, int i2) {
        setLink(i, (link(i) & (-4294967296L)) | ((i2 + 1) & 4294967295L));
    }

    private void setPredecessor(int i, int i2) {
        setLink(i, (link(i) & 4294967295L) | ((i2 + 1) << 32));
    }

    private void setSucceeds(int i, int i2) {
        if (i == -2) {
            this.firstEntry = i2;
        } else {
            setSuccessor(i, i2);
        }
        if (i2 == -2) {
            this.lastEntry = i;
        } else {
            setPredecessor(i2, i);
        }
    }

    @Override // com.google.common.collect.CompactHashMap
    final void insertEntry(int i, K k, V v, int i2, int i3) {
        super.insertEntry(i, k, v, i2, i3);
        setSucceeds(this.lastEntry, i);
        setSucceeds(i, -2);
    }

    @Override // com.google.common.collect.CompactHashMap
    final void accessEntry(int i) {
        if (this.accessOrder) {
            setSucceeds(getPredecessor(i), getSuccessor(i));
            setSucceeds(this.lastEntry, i);
            setSucceeds(i, -2);
            incrementModCount();
        }
    }

    @Override // com.google.common.collect.CompactHashMap
    final void moveLastEntry(int i, int i2) {
        int size = size() - 1;
        super.moveLastEntry(i, i2);
        setSucceeds(getPredecessor(i), getSuccessor(i));
        if (i < size) {
            setSucceeds(getPredecessor(size), i);
            setSucceeds(i, getSuccessor(size));
        }
        setLink(size, 0L);
    }

    @Override // com.google.common.collect.CompactHashMap
    final void resizeEntries(int i) {
        super.resizeEntries(i);
        this.links = java.util.Arrays.copyOf(requireLinks(), i);
    }

    @Override // com.google.common.collect.CompactHashMap
    final int firstEntryIndex() {
        return this.firstEntry;
    }

    @Override // com.google.common.collect.CompactHashMap
    final int adjustAfterRemove(int i, int i2) {
        return i >= size() ? i2 : i;
    }

    @Override // com.google.common.collect.CompactHashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (needsAllocArrays()) {
            return;
        }
        this.firstEntry = -2;
        this.lastEntry = -2;
        long[] jArr = this.links;
        if (jArr != null) {
            java.util.Arrays.fill(jArr, 0, size(), 0L);
        }
        super.clear();
    }

    private long[] requireLinks() {
        return (long[]) java.util.Objects.requireNonNull(this.links);
    }

    private long link(int i) {
        return requireLinks()[i];
    }

    private void setLink(int i, long j) {
        requireLinks()[i] = j;
    }
}
