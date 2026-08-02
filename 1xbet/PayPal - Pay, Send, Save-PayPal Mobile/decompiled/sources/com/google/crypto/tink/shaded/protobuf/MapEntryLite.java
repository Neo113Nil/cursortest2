package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes4.dex */
public class MapEntryLite<K, V> {
    private static final int KEY_FIELD_NUMBER = 1;
    private static final int VALUE_FIELD_NUMBER = 2;
    private final K key;
    private final com.google.crypto.tink.shaded.protobuf.MapEntryLite.Metadata<K, V> metadata;
    private final V value;

    static class Metadata<K, V> {
        public final K defaultKey;
        public final V defaultValue;
        public final com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType keyType;
        public final com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType valueType;

        public Metadata(com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType fieldType, K k, com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType fieldType2, V v) {
            this.keyType = fieldType;
            this.defaultKey = k;
            this.valueType = fieldType2;
            this.defaultValue = v;
        }
    }

    private MapEntryLite(com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType fieldType, K k, com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType fieldType2, V v) {
        this.metadata = new com.google.crypto.tink.shaded.protobuf.MapEntryLite.Metadata<>(fieldType, k, fieldType2, v);
        this.key = k;
        this.value = v;
    }

    private MapEntryLite(com.google.crypto.tink.shaded.protobuf.MapEntryLite.Metadata<K, V> metadata, K k, V v) {
        this.metadata = metadata;
        this.key = k;
        this.value = v;
    }

    public K getKey() {
        return this.key;
    }

    public V getValue() {
        return this.value;
    }

    public static <K, V> com.google.crypto.tink.shaded.protobuf.MapEntryLite<K, V> newDefaultInstance(com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType fieldType, K k, com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType fieldType2, V v) {
        return new com.google.crypto.tink.shaded.protobuf.MapEntryLite<>(fieldType, k, fieldType2, v);
    }

    static <K, V> void writeTo(com.google.crypto.tink.shaded.protobuf.CodedOutputStream codedOutputStream, com.google.crypto.tink.shaded.protobuf.MapEntryLite.Metadata<K, V> metadata, K k, V v) throws java.io.IOException {
        com.google.crypto.tink.shaded.protobuf.FieldSet.writeElement(codedOutputStream, metadata.keyType, 1, k);
        com.google.crypto.tink.shaded.protobuf.FieldSet.writeElement(codedOutputStream, metadata.valueType, 2, v);
    }

    static <K, V> int computeSerializedSize(com.google.crypto.tink.shaded.protobuf.MapEntryLite.Metadata<K, V> metadata, K k, V v) {
        return com.google.crypto.tink.shaded.protobuf.FieldSet.computeElementSize(metadata.keyType, 1, k) + com.google.crypto.tink.shaded.protobuf.FieldSet.computeElementSize(metadata.valueType, 2, v);
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.MapEntryLite$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.MESSAGE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.ENUM.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.GROUP.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    static <T> T parseField(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite, com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType fieldType, T t) throws java.io.IOException {
        int i = com.google.crypto.tink.shaded.protobuf.MapEntryLite.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()];
        if (i == 1) {
            com.google.crypto.tink.shaded.protobuf.MessageLite.Builder builder = ((com.google.crypto.tink.shaded.protobuf.MessageLite) t).toBuilder();
            codedInputStream.readMessage(builder, extensionRegistryLite);
            return (T) builder.buildPartial();
        }
        if (i == 2) {
            return (T) java.lang.Integer.valueOf(codedInputStream.readEnum());
        }
        if (i == 3) {
            throw new java.lang.RuntimeException("Groups are not allowed in maps.");
        }
        return (T) com.google.crypto.tink.shaded.protobuf.FieldSet.readPrimitiveField(codedInputStream, fieldType, true);
    }

    public void serializeTo(com.google.crypto.tink.shaded.protobuf.CodedOutputStream codedOutputStream, int i, K k, V v) throws java.io.IOException {
        codedOutputStream.writeTag(i, 2);
        codedOutputStream.writeUInt32NoTag(computeSerializedSize(this.metadata, k, v));
        writeTo(codedOutputStream, this.metadata, k, v);
    }

    public int computeMessageSize(int i, K k, V v) {
        return com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(i) + com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeLengthDelimitedFieldSize(computeSerializedSize(this.metadata, k, v));
    }

    public java.util.Map.Entry<K, V> parseEntry(com.google.crypto.tink.shaded.protobuf.ByteString byteString, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return parseEntry(byteString.newCodedInput(), this.metadata, extensionRegistryLite);
    }

    static <K, V> java.util.Map.Entry<K, V> parseEntry(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream, com.google.crypto.tink.shaded.protobuf.MapEntryLite.Metadata<K, V> metadata, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        java.lang.Object obj = metadata.defaultKey;
        java.lang.Object obj2 = metadata.defaultValue;
        while (true) {
            int readTag = codedInputStream.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(1, metadata.keyType.getWireType())) {
                obj = parseField(codedInputStream, extensionRegistryLite, metadata.keyType, obj);
            } else if (readTag == com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(2, metadata.valueType.getWireType())) {
                obj2 = parseField(codedInputStream, extensionRegistryLite, metadata.valueType, obj2);
            } else if (!codedInputStream.skipField(readTag)) {
                break;
            }
        }
        return new java.util.AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void parseInto(com.google.crypto.tink.shaded.protobuf.MapFieldLite<K, V> mapFieldLite, com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
        java.lang.Object obj = this.metadata.defaultKey;
        java.lang.Object obj2 = this.metadata.defaultValue;
        while (true) {
            int readTag = codedInputStream.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(1, this.metadata.keyType.getWireType())) {
                obj = parseField(codedInputStream, extensionRegistryLite, this.metadata.keyType, obj);
            } else if (readTag == com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(2, this.metadata.valueType.getWireType())) {
                obj2 = parseField(codedInputStream, extensionRegistryLite, this.metadata.valueType, obj2);
            } else if (!codedInputStream.skipField(readTag)) {
                break;
            }
        }
        codedInputStream.checkLastTagWas(0);
        codedInputStream.popLimit(pushLimit);
        mapFieldLite.put(obj, obj2);
    }

    com.google.crypto.tink.shaded.protobuf.MapEntryLite.Metadata<K, V> getMetadata() {
        return this.metadata;
    }
}
