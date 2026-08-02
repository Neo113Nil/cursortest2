package androidx.arch.core.internal;

/* loaded from: classes.dex */
public class SafeIterableMap<K, V> implements java.lang.Iterable<java.util.Map.Entry<K, V>> {
    private androidx.arch.core.internal.SafeIterableMap.Entry<K, V> getHighResolutionOutputSizeshNQ4ISI;
    androidx.arch.core.internal.SafeIterableMap.Entry<K, V> getHighSpeedVideoFpsRanges;
    private final java.util.WeakHashMap<androidx.arch.core.internal.SafeIterableMap.SupportRemove<K, V>, java.lang.Boolean> getHighSpeedVideoSizes = new java.util.WeakHashMap<>();
    private int getHighSpeedVideoFpsRangesFor = 0;

    /* loaded from: classes3.dex */
    public static abstract class SupportRemove<K, V> {
        abstract void getHighSpeedVideoFpsRanges(androidx.arch.core.internal.SafeIterableMap.Entry<K, V> entry);
    }

    protected androidx.arch.core.internal.SafeIterableMap.Entry<K, V> get(K k) {
        androidx.arch.core.internal.SafeIterableMap.Entry<K, V> entry = this.getHighSpeedVideoFpsRanges;
        while (entry != null && !entry.getHighResolutionOutputSizeshNQ4ISI.equals(k)) {
            entry = entry.getHighSpeedVideoFpsRanges;
        }
        return entry;
    }

    public V putIfAbsent(K k, V v) {
        androidx.arch.core.internal.SafeIterableMap.Entry<K, V> entry = get(k);
        if (entry != null) {
            return entry.getHighSpeedVideoFpsRangesFor;
        }
        getHighSpeedVideoFpsRanges(k, v);
        return null;
    }

    final androidx.arch.core.internal.SafeIterableMap.Entry<K, V> getHighSpeedVideoFpsRanges(K k, V v) {
        androidx.arch.core.internal.SafeIterableMap.Entry<K, V> entry = new androidx.arch.core.internal.SafeIterableMap.Entry<>(k, v);
        this.getHighSpeedVideoFpsRangesFor++;
        androidx.arch.core.internal.SafeIterableMap.Entry<K, V> entry2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (entry2 == null) {
            this.getHighSpeedVideoFpsRanges = entry;
            this.getHighResolutionOutputSizeshNQ4ISI = entry;
            return entry;
        }
        entry2.getHighSpeedVideoFpsRanges = entry;
        entry.getHighSpeedVideoSizes = this.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighResolutionOutputSizeshNQ4ISI = entry;
        return entry;
    }

    public V remove(K k) {
        androidx.arch.core.internal.SafeIterableMap.Entry<K, V> entry = get(k);
        if (entry == null) {
            return null;
        }
        this.getHighSpeedVideoFpsRangesFor--;
        if (!this.getHighSpeedVideoSizes.isEmpty()) {
            java.util.Iterator<androidx.arch.core.internal.SafeIterableMap.SupportRemove<K, V>> it = this.getHighSpeedVideoSizes.keySet().iterator();
            while (it.hasNext()) {
                it.next().getHighSpeedVideoFpsRanges(entry);
            }
        }
        if (entry.getHighSpeedVideoSizes != null) {
            entry.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges = entry.getHighSpeedVideoFpsRanges;
        } else {
            this.getHighSpeedVideoFpsRanges = entry.getHighSpeedVideoFpsRanges;
        }
        if (entry.getHighSpeedVideoFpsRanges != null) {
            entry.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes = entry.getHighSpeedVideoSizes;
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI = entry.getHighSpeedVideoSizes;
        }
        entry.getHighSpeedVideoFpsRanges = null;
        entry.getHighSpeedVideoSizes = null;
        return entry.getHighSpeedVideoFpsRangesFor;
    }

    public int size() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
        androidx.arch.core.internal.SafeIterableMap.AscendingIterator ascendingIterator = new androidx.arch.core.internal.SafeIterableMap.AscendingIterator(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI);
        this.getHighSpeedVideoSizes.put(ascendingIterator, java.lang.Boolean.FALSE);
        return ascendingIterator;
    }

    public java.util.Iterator<java.util.Map.Entry<K, V>> descendingIterator() {
        androidx.arch.core.internal.SafeIterableMap.DescendingIterator descendingIterator = new androidx.arch.core.internal.SafeIterableMap.DescendingIterator(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges);
        this.getHighSpeedVideoSizes.put(descendingIterator, java.lang.Boolean.FALSE);
        return descendingIterator;
    }

    public androidx.arch.core.internal.SafeIterableMap<K, V>.IteratorWithAdditions iteratorWithAdditions() {
        androidx.arch.core.internal.SafeIterableMap<K, V>.IteratorWithAdditions iteratorWithAdditions = new androidx.arch.core.internal.SafeIterableMap.IteratorWithAdditions();
        this.getHighSpeedVideoSizes.put(iteratorWithAdditions, java.lang.Boolean.FALSE);
        return iteratorWithAdditions;
    }

    public java.util.Map.Entry<K, V> eldest() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public java.util.Map.Entry<K, V> newest() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.arch.core.internal.SafeIterableMap)) {
            return false;
        }
        androidx.arch.core.internal.SafeIterableMap safeIterableMap = (androidx.arch.core.internal.SafeIterableMap) obj;
        if (size() != safeIterableMap.size()) {
            return false;
        }
        java.util.Iterator<java.util.Map.Entry<K, V>> it = iterator();
        java.util.Iterator<java.util.Map.Entry<K, V>> it2 = safeIterableMap.iterator();
        while (it.hasNext() && it2.hasNext()) {
            java.util.Map.Entry<K, V> next = it.next();
            java.util.Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public int hashCode() {
        java.util.Iterator<java.util.Map.Entry<K, V>> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().hashCode();
        }
        return i;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
        java.util.Iterator<java.util.Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* loaded from: classes3.dex */
    static abstract class ListIterator<K, V> extends androidx.arch.core.internal.SafeIterableMap.SupportRemove<K, V> implements java.util.Iterator<java.util.Map.Entry<K, V>> {
        androidx.arch.core.internal.SafeIterableMap.Entry<K, V> getHighResolutionOutputSizeshNQ4ISI;
        androidx.arch.core.internal.SafeIterableMap.Entry<K, V> getHighSpeedVideoFpsRangesFor;

        abstract androidx.arch.core.internal.SafeIterableMap.Entry<K, V> Camera2StreamConfigurationMap(androidx.arch.core.internal.SafeIterableMap.Entry<K, V> entry);

        abstract androidx.arch.core.internal.SafeIterableMap.Entry<K, V> getHighSpeedVideoFpsRangesFor(androidx.arch.core.internal.SafeIterableMap.Entry<K, V> entry);

        ListIterator(androidx.arch.core.internal.SafeIterableMap.Entry<K, V> entry, androidx.arch.core.internal.SafeIterableMap.Entry<K, V> entry2) {
            this.getHighResolutionOutputSizeshNQ4ISI = entry2;
            this.getHighSpeedVideoFpsRangesFor = entry;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.getHighSpeedVideoFpsRangesFor != null;
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.SupportRemove
        public final void getHighSpeedVideoFpsRanges(androidx.arch.core.internal.SafeIterableMap.Entry<K, V> entry) {
            androidx.arch.core.internal.SafeIterableMap.Entry<K, V> entry2 = null;
            if (this.getHighResolutionOutputSizeshNQ4ISI == entry && entry == this.getHighSpeedVideoFpsRangesFor) {
                this.getHighSpeedVideoFpsRangesFor = null;
                this.getHighResolutionOutputSizeshNQ4ISI = null;
            }
            androidx.arch.core.internal.SafeIterableMap.Entry<K, V> entry3 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (entry3 == entry) {
                this.getHighResolutionOutputSizeshNQ4ISI = getHighSpeedVideoFpsRangesFor(entry3);
            }
            androidx.arch.core.internal.SafeIterableMap.Entry<K, V> entry4 = this.getHighSpeedVideoFpsRangesFor;
            if (entry4 == entry) {
                androidx.arch.core.internal.SafeIterableMap.Entry<K, V> entry5 = this.getHighResolutionOutputSizeshNQ4ISI;
                if (entry4 != entry5 && entry5 != null) {
                    entry2 = Camera2StreamConfigurationMap(entry4);
                }
                this.getHighSpeedVideoFpsRangesFor = entry2;
            }
        }

        @Override // java.util.Iterator
        public /* synthetic */ java.lang.Object next() {
            androidx.arch.core.internal.SafeIterableMap.Entry<K, V> entry = this.getHighSpeedVideoFpsRangesFor;
            androidx.arch.core.internal.SafeIterableMap.Entry<K, V> entry2 = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRangesFor = (entry == entry2 || entry2 == null) ? null : Camera2StreamConfigurationMap(entry);
            return entry;
        }
    }

    /* loaded from: classes3.dex */
    static class AscendingIterator<K, V> extends androidx.arch.core.internal.SafeIterableMap.ListIterator<K, V> {
        AscendingIterator(androidx.arch.core.internal.SafeIterableMap.Entry<K, V> entry, androidx.arch.core.internal.SafeIterableMap.Entry<K, V> entry2) {
            super(entry, entry2);
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.ListIterator
        final androidx.arch.core.internal.SafeIterableMap.Entry<K, V> Camera2StreamConfigurationMap(androidx.arch.core.internal.SafeIterableMap.Entry<K, V> entry) {
            return entry.getHighSpeedVideoFpsRanges;
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.ListIterator
        final androidx.arch.core.internal.SafeIterableMap.Entry<K, V> getHighSpeedVideoFpsRangesFor(androidx.arch.core.internal.SafeIterableMap.Entry<K, V> entry) {
            return entry.getHighSpeedVideoSizes;
        }
    }

    /* loaded from: classes3.dex */
    static class DescendingIterator<K, V> extends androidx.arch.core.internal.SafeIterableMap.ListIterator<K, V> {
        DescendingIterator(androidx.arch.core.internal.SafeIterableMap.Entry<K, V> entry, androidx.arch.core.internal.SafeIterableMap.Entry<K, V> entry2) {
            super(entry, entry2);
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.ListIterator
        final androidx.arch.core.internal.SafeIterableMap.Entry<K, V> Camera2StreamConfigurationMap(androidx.arch.core.internal.SafeIterableMap.Entry<K, V> entry) {
            return entry.getHighSpeedVideoSizes;
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.ListIterator
        final androidx.arch.core.internal.SafeIterableMap.Entry<K, V> getHighSpeedVideoFpsRangesFor(androidx.arch.core.internal.SafeIterableMap.Entry<K, V> entry) {
            return entry.getHighSpeedVideoFpsRanges;
        }
    }

    /* loaded from: classes3.dex */
    public class IteratorWithAdditions extends androidx.arch.core.internal.SafeIterableMap.SupportRemove<K, V> implements java.util.Iterator<java.util.Map.Entry<K, V>> {
        private boolean Camera2StreamConfigurationMap = true;
        private androidx.arch.core.internal.SafeIterableMap.Entry<K, V> getHighSpeedVideoSizes;

        IteratorWithAdditions() {
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.SupportRemove
        final void getHighSpeedVideoFpsRanges(androidx.arch.core.internal.SafeIterableMap.Entry<K, V> entry) {
            androidx.arch.core.internal.SafeIterableMap.Entry<K, V> entry2 = this.getHighSpeedVideoSizes;
            if (entry == entry2) {
                androidx.arch.core.internal.SafeIterableMap.Entry<K, V> entry3 = entry2.getHighSpeedVideoSizes;
                this.getHighSpeedVideoSizes = entry3;
                this.Camera2StreamConfigurationMap = entry3 == null;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.Camera2StreamConfigurationMap) {
                return androidx.arch.core.internal.SafeIterableMap.this.getHighSpeedVideoFpsRanges != null;
            }
            androidx.arch.core.internal.SafeIterableMap.Entry<K, V> entry = this.getHighSpeedVideoSizes;
            return (entry == null || entry.getHighSpeedVideoFpsRanges == null) ? false : true;
        }

        @Override // java.util.Iterator
        public java.util.Map.Entry<K, V> next() {
            if (this.Camera2StreamConfigurationMap) {
                this.Camera2StreamConfigurationMap = false;
                this.getHighSpeedVideoSizes = androidx.arch.core.internal.SafeIterableMap.this.getHighSpeedVideoFpsRanges;
            } else {
                androidx.arch.core.internal.SafeIterableMap.Entry<K, V> entry = this.getHighSpeedVideoSizes;
                this.getHighSpeedVideoSizes = entry != null ? entry.getHighSpeedVideoFpsRanges : null;
            }
            return this.getHighSpeedVideoSizes;
        }
    }

    /* loaded from: classes3.dex */
    static class Entry<K, V> implements java.util.Map.Entry<K, V> {
        final K getHighResolutionOutputSizeshNQ4ISI;
        androidx.arch.core.internal.SafeIterableMap.Entry<K, V> getHighSpeedVideoFpsRanges;
        final V getHighSpeedVideoFpsRangesFor;
        androidx.arch.core.internal.SafeIterableMap.Entry<K, V> getHighSpeedVideoSizes;

        Entry(K k, V v) {
            this.getHighResolutionOutputSizeshNQ4ISI = k;
            this.getHighSpeedVideoFpsRangesFor = v;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new java.lang.UnsupportedOperationException("An entry modification is not supported");
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append("=");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            return sb.toString();
        }

        @Override // java.util.Map.Entry
        public boolean equals(java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof androidx.arch.core.internal.SafeIterableMap.Entry)) {
                return false;
            }
            androidx.arch.core.internal.SafeIterableMap.Entry entry = (androidx.arch.core.internal.SafeIterableMap.Entry) obj;
            return this.getHighResolutionOutputSizeshNQ4ISI.equals(entry.getHighResolutionOutputSizeshNQ4ISI) && this.getHighSpeedVideoFpsRangesFor.equals(entry.getHighSpeedVideoFpsRangesFor);
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.getHighResolutionOutputSizeshNQ4ISI.hashCode() ^ this.getHighSpeedVideoFpsRangesFor.hashCode();
        }
    }
}
