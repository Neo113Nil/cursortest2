package androidx.content.preferences.protobuf;

/* loaded from: classes3.dex */
public class MapEntryLite<K, V> {
    private final K getHighSpeedVideoFpsRanges;
    final androidx.datastore.preferences.protobuf.MapEntryLite.Metadata<K, V> getHighSpeedVideoFpsRangesFor;
    private final V getHighSpeedVideoSizes;

    static class Metadata<K, V> {
        public final V Camera2StreamConfigurationMap;
        public final androidx.datastore.preferences.protobuf.WireFormat.FieldType getHighResolutionOutputSizeshNQ4ISI;
        public final androidx.datastore.preferences.protobuf.WireFormat.FieldType getHighSpeedVideoFpsRanges;
        public final K getHighSpeedVideoFpsRangesFor;

        public Metadata(androidx.datastore.preferences.protobuf.WireFormat.FieldType fieldType, K k, androidx.datastore.preferences.protobuf.WireFormat.FieldType fieldType2, V v) {
            this.getHighSpeedVideoFpsRanges = fieldType;
            this.getHighSpeedVideoFpsRangesFor = k;
            this.getHighResolutionOutputSizeshNQ4ISI = fieldType2;
            this.Camera2StreamConfigurationMap = v;
        }
    }

    private MapEntryLite(androidx.datastore.preferences.protobuf.WireFormat.FieldType fieldType, K k, androidx.datastore.preferences.protobuf.WireFormat.FieldType fieldType2, V v) {
        this.getHighSpeedVideoFpsRangesFor = new androidx.datastore.preferences.protobuf.MapEntryLite.Metadata<>(fieldType, k, fieldType2, v);
        this.getHighSpeedVideoFpsRanges = k;
        this.getHighSpeedVideoSizes = v;
    }

    public K getKey() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public V getValue() {
        return this.getHighSpeedVideoSizes;
    }

    public static <K, V> androidx.content.preferences.protobuf.MapEntryLite<K, V> newDefaultInstance(androidx.datastore.preferences.protobuf.WireFormat.FieldType fieldType, K k, androidx.datastore.preferences.protobuf.WireFormat.FieldType fieldType2, V v) {
        return new androidx.content.preferences.protobuf.MapEntryLite<>(fieldType, k, fieldType2, v);
    }

    static <K, V> void Camera2StreamConfigurationMap(androidx.content.preferences.protobuf.CodedOutputStream codedOutputStream, androidx.datastore.preferences.protobuf.MapEntryLite.Metadata<K, V> metadata, K k, V v) throws java.io.IOException {
        androidx.content.preferences.protobuf.FieldSet.getHighSpeedVideoSizes(codedOutputStream, metadata.getHighSpeedVideoFpsRanges, 1, k);
        androidx.content.preferences.protobuf.FieldSet.getHighSpeedVideoSizes(codedOutputStream, metadata.getHighResolutionOutputSizeshNQ4ISI, 2, v);
    }

    static <K, V> int getHighResolutionOutputSizeshNQ4ISI(androidx.datastore.preferences.protobuf.MapEntryLite.Metadata<K, V> metadata, K k, V v) {
        return androidx.content.preferences.protobuf.FieldSet.Camera2StreamConfigurationMap(metadata.getHighSpeedVideoFpsRanges, 1, k) + androidx.content.preferences.protobuf.FieldSet.Camera2StreamConfigurationMap(metadata.getHighResolutionOutputSizeshNQ4ISI, 2, v);
    }

    /* renamed from: androidx.datastore.preferences.protobuf.MapEntryLite$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRangesFor;

        static {
            int[] iArr = new int[androidx.datastore.preferences.protobuf.WireFormat.FieldType.values().length];
            getHighSpeedVideoFpsRangesFor = iArr;
            try {
                iArr[androidx.datastore.preferences.protobuf.WireFormat.FieldType.MESSAGE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.datastore.preferences.protobuf.WireFormat.FieldType.ENUM.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.datastore.preferences.protobuf.WireFormat.FieldType.GROUP.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    private static <T> T getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.CodedInputStream codedInputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite, androidx.datastore.preferences.protobuf.WireFormat.FieldType fieldType, T t) throws java.io.IOException {
        int i = androidx.content.preferences.protobuf.MapEntryLite.AnonymousClass1.getHighSpeedVideoFpsRangesFor[fieldType.ordinal()];
        if (i == 1) {
            androidx.datastore.preferences.protobuf.MessageLite.Builder builder = ((androidx.content.preferences.protobuf.MessageLite) t).toBuilder();
            codedInputStream.readMessage(builder, extensionRegistryLite);
            return (T) builder.buildPartial();
        }
        if (i == 2) {
            return (T) java.lang.Integer.valueOf(codedInputStream.readEnum());
        }
        if (i == 3) {
            throw new java.lang.RuntimeException("Groups are not allowed in maps.");
        }
        return (T) androidx.content.preferences.protobuf.FieldSet.getHighSpeedVideoFpsRangesFor(codedInputStream, fieldType, true);
    }

    public void serializeTo(androidx.content.preferences.protobuf.CodedOutputStream codedOutputStream, int i, K k, V v) throws java.io.IOException {
        codedOutputStream.writeTag(i, 2);
        androidx.datastore.preferences.protobuf.MapEntryLite.Metadata<K, V> metadata = this.getHighSpeedVideoFpsRangesFor;
        codedOutputStream.writeUInt32NoTag(androidx.content.preferences.protobuf.FieldSet.Camera2StreamConfigurationMap(metadata.getHighSpeedVideoFpsRanges, 1, k) + androidx.content.preferences.protobuf.FieldSet.Camera2StreamConfigurationMap(metadata.getHighResolutionOutputSizeshNQ4ISI, 2, v));
        androidx.datastore.preferences.protobuf.MapEntryLite.Metadata<K, V> metadata2 = this.getHighSpeedVideoFpsRangesFor;
        androidx.content.preferences.protobuf.FieldSet.getHighSpeedVideoSizes(codedOutputStream, metadata2.getHighSpeedVideoFpsRanges, 1, k);
        androidx.content.preferences.protobuf.FieldSet.getHighSpeedVideoSizes(codedOutputStream, metadata2.getHighResolutionOutputSizeshNQ4ISI, 2, v);
    }

    public int computeMessageSize(int i, K k, V v) {
        int computeTagSize = androidx.content.preferences.protobuf.CodedOutputStream.computeTagSize(i);
        androidx.datastore.preferences.protobuf.MapEntryLite.Metadata<K, V> metadata = this.getHighSpeedVideoFpsRangesFor;
        return computeTagSize + androidx.content.preferences.protobuf.CodedOutputStream.getHighResolutionOutputSizeshNQ4ISI(androidx.content.preferences.protobuf.FieldSet.Camera2StreamConfigurationMap(metadata.getHighSpeedVideoFpsRanges, 1, k) + androidx.content.preferences.protobuf.FieldSet.Camera2StreamConfigurationMap(metadata.getHighResolutionOutputSizeshNQ4ISI, 2, v));
    }

    public java.util.Map.Entry<K, V> parseEntry(androidx.content.preferences.protobuf.ByteString byteString, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        androidx.content.preferences.protobuf.CodedInputStream newCodedInput = byteString.newCodedInput();
        androidx.datastore.preferences.protobuf.MapEntryLite.Metadata<K, V> metadata = this.getHighSpeedVideoFpsRangesFor;
        java.lang.Object obj = metadata.getHighSpeedVideoFpsRangesFor;
        java.lang.Object obj2 = metadata.Camera2StreamConfigurationMap;
        while (true) {
            int readTag = newCodedInput.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(1, metadata.getHighSpeedVideoFpsRanges.getWireType())) {
                obj = getHighSpeedVideoFpsRanges(newCodedInput, extensionRegistryLite, metadata.getHighSpeedVideoFpsRanges, obj);
            } else if (readTag == androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(2, metadata.getHighResolutionOutputSizeshNQ4ISI.getWireType())) {
                obj2 = getHighSpeedVideoFpsRanges(newCodedInput, extensionRegistryLite, metadata.getHighResolutionOutputSizeshNQ4ISI, obj2);
            } else if (!newCodedInput.skipField(readTag)) {
                break;
            }
        }
        return new java.util.AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void parseInto(androidx.content.preferences.protobuf.MapFieldLite<K, V> mapFieldLite, androidx.content.preferences.protobuf.CodedInputStream codedInputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
        java.lang.Object obj = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor;
        java.lang.Object obj2 = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
        while (true) {
            int readTag = codedInputStream.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(1, this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges.getWireType())) {
                obj = getHighSpeedVideoFpsRanges(codedInputStream, extensionRegistryLite, this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges, obj);
            } else if (readTag == androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(2, this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI.getWireType())) {
                obj2 = getHighSpeedVideoFpsRanges(codedInputStream, extensionRegistryLite, this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI, obj2);
            } else if (!codedInputStream.skipField(readTag)) {
                break;
            }
        }
        codedInputStream.checkLastTagWas(0);
        codedInputStream.popLimit(pushLimit);
        mapFieldLite.put(obj, obj2);
    }
}
