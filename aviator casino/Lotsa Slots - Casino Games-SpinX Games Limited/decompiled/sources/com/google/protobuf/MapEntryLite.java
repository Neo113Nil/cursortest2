package com.google.protobuf;

/* loaded from: classes4.dex */
public class MapEntryLite<K, V> {
    private static final int KEY_FIELD_NUMBER = 1;
    private static final int VALUE_FIELD_NUMBER = 2;
    private final K key;
    private final com.google.protobuf.MapEntryLite.Metadata<K, V> metadata;
    private final V value;

    static class Metadata<K, V> {
        public final K defaultKey;
        public final V defaultValue;
        public final com.google.protobuf.WireFormat.FieldType keyType;
        public final com.google.protobuf.WireFormat.FieldType valueType;

        public Metadata(com.google.protobuf.WireFormat.FieldType keyType, K defaultKey, com.google.protobuf.WireFormat.FieldType valueType, V defaultValue) {
            this.keyType = keyType;
            this.defaultKey = defaultKey;
            this.valueType = valueType;
            this.defaultValue = defaultValue;
        }
    }

    private MapEntryLite(com.google.protobuf.WireFormat.FieldType keyType, K defaultKey, com.google.protobuf.WireFormat.FieldType valueType, V defaultValue) {
        this.metadata = new com.google.protobuf.MapEntryLite.Metadata<>(keyType, defaultKey, valueType, defaultValue);
        this.key = defaultKey;
        this.value = defaultValue;
    }

    private MapEntryLite(com.google.protobuf.MapEntryLite.Metadata<K, V> metadata, K key, V value) {
        this.metadata = metadata;
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return this.key;
    }

    public V getValue() {
        return this.value;
    }

    public static <K, V> com.google.protobuf.MapEntryLite<K, V> newDefaultInstance(com.google.protobuf.WireFormat.FieldType keyType, K defaultKey, com.google.protobuf.WireFormat.FieldType valueType, V defaultValue) {
        return new com.google.protobuf.MapEntryLite<>(keyType, defaultKey, valueType, defaultValue);
    }

    static <K, V> void writeTo(com.google.protobuf.CodedOutputStream output, com.google.protobuf.MapEntryLite.Metadata<K, V> metadata, K key, V value) throws java.io.IOException {
        com.google.protobuf.FieldSet.writeElement(output, metadata.keyType, 1, key);
        com.google.protobuf.FieldSet.writeElement(output, metadata.valueType, 2, value);
    }

    static <K, V> int computeSerializedSize(com.google.protobuf.MapEntryLite.Metadata<K, V> metadata, K key, V value) {
        return com.google.protobuf.FieldSet.computeElementSize(metadata.keyType, 1, key) + com.google.protobuf.FieldSet.computeElementSize(metadata.valueType, 2, value);
    }

    /* renamed from: com.google.protobuf.MapEntryLite$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[com.google.protobuf.WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[com.google.protobuf.WireFormat.FieldType.MESSAGE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.ENUM.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.GROUP.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    static <T> T parseField(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite, com.google.protobuf.WireFormat.FieldType fieldType, T t) throws java.io.IOException {
        int i = com.google.protobuf.MapEntryLite.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()];
        if (i == 1) {
            com.google.protobuf.MessageLite.Builder builder = ((com.google.protobuf.MessageLite) t).toBuilder();
            codedInputStream.readMessage(builder, extensionRegistryLite);
            return (T) builder.buildPartial();
        }
        if (i == 2) {
            return (T) java.lang.Integer.valueOf(codedInputStream.readEnum());
        }
        if (i == 3) {
            throw new java.lang.RuntimeException("Groups are not allowed in maps.");
        }
        return (T) com.google.protobuf.FieldSet.readPrimitiveField(codedInputStream, fieldType, true);
    }

    public void serializeTo(com.google.protobuf.CodedOutputStream output, int fieldNumber, K key, V value) throws java.io.IOException {
        output.writeTag(fieldNumber, 2);
        output.writeUInt32NoTag(computeSerializedSize(this.metadata, key, value));
        writeTo(output, this.metadata, key, value);
    }

    public int computeMessageSize(int fieldNumber, K key, V value) {
        return com.google.protobuf.CodedOutputStream.computeTagSize(fieldNumber) + com.google.protobuf.CodedOutputStream.computeLengthDelimitedFieldSize(computeSerializedSize(this.metadata, key, value));
    }

    public java.util.Map.Entry<K, V> parseEntry(com.google.protobuf.ByteString bytes, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return parseEntry(bytes.newCodedInput(), this.metadata, extensionRegistry);
    }

    static <K, V> java.util.Map.Entry<K, V> parseEntry(com.google.protobuf.CodedInputStream input, com.google.protobuf.MapEntryLite.Metadata<K, V> metadata, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        java.lang.Object obj = metadata.defaultKey;
        java.lang.Object obj2 = metadata.defaultValue;
        while (true) {
            int readTag = input.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == com.google.protobuf.WireFormat.makeTag(1, metadata.keyType.getWireType())) {
                obj = parseField(input, extensionRegistry, metadata.keyType, obj);
            } else if (readTag == com.google.protobuf.WireFormat.makeTag(2, metadata.valueType.getWireType())) {
                obj2 = parseField(input, extensionRegistry, metadata.valueType, obj2);
            } else if (!input.skipField(readTag)) {
                break;
            }
        }
        return new java.util.AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void parseInto(com.google.protobuf.MapFieldLite<K, V> map, com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        int pushLimit = input.pushLimit(input.readRawVarint32());
        java.lang.Object obj = this.metadata.defaultKey;
        java.lang.Object obj2 = this.metadata.defaultValue;
        while (true) {
            int readTag = input.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == com.google.protobuf.WireFormat.makeTag(1, this.metadata.keyType.getWireType())) {
                obj = parseField(input, extensionRegistry, this.metadata.keyType, obj);
            } else if (readTag == com.google.protobuf.WireFormat.makeTag(2, this.metadata.valueType.getWireType())) {
                obj2 = parseField(input, extensionRegistry, this.metadata.valueType, obj2);
            } else if (!input.skipField(readTag)) {
                break;
            }
        }
        input.checkLastTagWas(0);
        input.popLimit(pushLimit);
        map.put(obj, obj2);
    }

    com.google.protobuf.MapEntryLite.Metadata<K, V> getMetadata() {
        return this.metadata;
    }
}
