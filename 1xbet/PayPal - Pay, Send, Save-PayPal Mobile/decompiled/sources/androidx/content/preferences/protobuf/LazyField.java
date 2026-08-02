package androidx.content.preferences.protobuf;

/* loaded from: classes3.dex */
public class LazyField extends androidx.content.preferences.protobuf.LazyFieldLite {
    private final androidx.content.preferences.protobuf.MessageLite getHighSpeedVideoFpsRanges;

    public LazyField(androidx.content.preferences.protobuf.MessageLite messageLite, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite, androidx.content.preferences.protobuf.ByteString byteString) {
        super(extensionRegistryLite, byteString);
        this.getHighSpeedVideoFpsRanges = messageLite;
    }

    @Override // androidx.content.preferences.protobuf.LazyFieldLite
    public boolean containsDefaultInstance() {
        return super.containsDefaultInstance() || this.value == this.getHighSpeedVideoFpsRanges;
    }

    public androidx.content.preferences.protobuf.MessageLite getValue() {
        return getValue(this.getHighSpeedVideoFpsRanges);
    }

    @Override // androidx.content.preferences.protobuf.LazyFieldLite
    public int hashCode() {
        return getValue().hashCode();
    }

    @Override // androidx.content.preferences.protobuf.LazyFieldLite
    public boolean equals(java.lang.Object obj) {
        return getValue().equals(obj);
    }

    public java.lang.String toString() {
        return getValue().toString();
    }

    static class LazyEntry<K> implements java.util.Map.Entry<K, java.lang.Object> {
        java.util.Map.Entry<K, androidx.content.preferences.protobuf.LazyField> getHighSpeedVideoSizes;

        /* synthetic */ LazyEntry(java.util.Map.Entry entry, byte b) {
            this(entry);
        }

        private LazyEntry(java.util.Map.Entry<K, androidx.content.preferences.protobuf.LazyField> entry) {
            this.getHighSpeedVideoSizes = entry;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.getHighSpeedVideoSizes.getKey();
        }

        @Override // java.util.Map.Entry
        public java.lang.Object getValue() {
            androidx.content.preferences.protobuf.LazyField value = this.getHighSpeedVideoSizes.getValue();
            if (value == null) {
                return null;
            }
            return value.getValue();
        }

        @Override // java.util.Map.Entry
        public java.lang.Object setValue(java.lang.Object obj) {
            if (!(obj instanceof androidx.content.preferences.protobuf.MessageLite)) {
                throw new java.lang.IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            }
            return this.getHighSpeedVideoSizes.getValue().setValue((androidx.content.preferences.protobuf.MessageLite) obj);
        }
    }

    static class LazyIterator<K> implements java.util.Iterator<java.util.Map.Entry<K, java.lang.Object>> {
        private java.util.Iterator<java.util.Map.Entry<K, java.lang.Object>> Camera2StreamConfigurationMap;

        public LazyIterator(java.util.Iterator<java.util.Map.Entry<K, java.lang.Object>> it) {
            this.Camera2StreamConfigurationMap = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.Camera2StreamConfigurationMap.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.Camera2StreamConfigurationMap.remove();
        }

        @Override // java.util.Iterator
        public /* synthetic */ java.lang.Object next() {
            java.util.Map.Entry<K, java.lang.Object> next = this.Camera2StreamConfigurationMap.next();
            return next.getValue() instanceof androidx.content.preferences.protobuf.LazyField ? new androidx.datastore.preferences.protobuf.LazyField.LazyEntry(next, (byte) 0) : next;
        }
    }
}
