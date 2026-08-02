package kotlin.reflect.jvm.internal.impl.protobuf;

/* loaded from: classes5.dex */
public class LazyField extends kotlin.reflect.jvm.internal.impl.protobuf.LazyFieldLite {
    private final kotlin.reflect.jvm.internal.impl.protobuf.MessageLite getHighSpeedVideoFpsRanges;

    public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite getValue() {
        return getValue(this.getHighSpeedVideoFpsRanges);
    }

    public int hashCode() {
        return getValue().hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        return getValue().equals(obj);
    }

    public java.lang.String toString() {
        return getValue().toString();
    }

    static class LazyEntry<K> implements java.util.Map.Entry<K, java.lang.Object> {
        private java.util.Map.Entry<K, kotlin.reflect.jvm.internal.impl.protobuf.LazyField> getHighSpeedVideoFpsRangesFor;

        /* synthetic */ LazyEntry(java.util.Map.Entry entry, byte b) {
            this(entry);
        }

        private LazyEntry(java.util.Map.Entry<K, kotlin.reflect.jvm.internal.impl.protobuf.LazyField> entry) {
            this.getHighSpeedVideoFpsRangesFor = entry;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.getHighSpeedVideoFpsRangesFor.getKey();
        }

        @Override // java.util.Map.Entry
        public java.lang.Object getValue() {
            kotlin.reflect.jvm.internal.impl.protobuf.LazyField value = this.getHighSpeedVideoFpsRangesFor.getValue();
            if (value == null) {
                return null;
            }
            return value.getValue();
        }

        @Override // java.util.Map.Entry
        public java.lang.Object setValue(java.lang.Object obj) {
            if (!(obj instanceof kotlin.reflect.jvm.internal.impl.protobuf.MessageLite)) {
                throw new java.lang.IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            }
            return this.getHighSpeedVideoFpsRangesFor.getValue().setValue((kotlin.reflect.jvm.internal.impl.protobuf.MessageLite) obj);
        }
    }

    static class LazyIterator<K> implements java.util.Iterator<java.util.Map.Entry<K, java.lang.Object>> {
        private java.util.Iterator<java.util.Map.Entry<K, java.lang.Object>> getHighResolutionOutputSizeshNQ4ISI;

        public LazyIterator(java.util.Iterator<java.util.Map.Entry<K, java.lang.Object>> it) {
            this.getHighResolutionOutputSizeshNQ4ISI = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.getHighResolutionOutputSizeshNQ4ISI.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.getHighResolutionOutputSizeshNQ4ISI.remove();
        }

        @Override // java.util.Iterator
        public /* synthetic */ java.lang.Object next() {
            java.util.Map.Entry<K, java.lang.Object> next = this.getHighResolutionOutputSizeshNQ4ISI.next();
            return next.getValue() instanceof kotlin.reflect.jvm.internal.impl.protobuf.LazyField ? new kotlin.reflect.jvm.internal.impl.protobuf.LazyField.LazyEntry(next, (byte) 0) : next;
        }
    }
}
