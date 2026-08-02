package androidx.content.preferences.protobuf;

/* loaded from: classes7.dex */
public final class Struct extends androidx.content.preferences.protobuf.GeneratedMessageLite<androidx.content.preferences.protobuf.Struct, androidx.datastore.preferences.protobuf.Struct.Builder> implements androidx.content.preferences.protobuf.StructOrBuilder {
    private static final androidx.content.preferences.protobuf.Struct DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile androidx.content.preferences.protobuf.Parser<androidx.content.preferences.protobuf.Struct> PARSER;
    private androidx.content.preferences.protobuf.MapFieldLite<java.lang.String, androidx.content.preferences.protobuf.Value> fields_ = androidx.content.preferences.protobuf.MapFieldLite.emptyMapField();

    private Struct() {
    }

    static final class FieldsDefaultEntryHolder {
        static final androidx.content.preferences.protobuf.MapEntryLite<java.lang.String, androidx.content.preferences.protobuf.Value> getHighSpeedVideoFpsRangesFor = androidx.content.preferences.protobuf.MapEntryLite.newDefaultInstance(androidx.datastore.preferences.protobuf.WireFormat.FieldType.STRING, "", androidx.datastore.preferences.protobuf.WireFormat.FieldType.MESSAGE, androidx.content.preferences.protobuf.Value.getDefaultInstance());

        private FieldsDefaultEntryHolder() {
        }
    }

    @Override // androidx.content.preferences.protobuf.StructOrBuilder
    @java.lang.Deprecated
    public final java.util.Map<java.lang.String, androidx.content.preferences.protobuf.Value> getFields() {
        return getFieldsMap();
    }

    public static androidx.content.preferences.protobuf.Struct parseFrom(java.nio.ByteBuffer byteBuffer) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Struct) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static androidx.content.preferences.protobuf.Struct parseFrom(java.nio.ByteBuffer byteBuffer, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Struct) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.Struct parseFrom(androidx.content.preferences.protobuf.ByteString byteString) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Struct) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static androidx.content.preferences.protobuf.Struct parseFrom(androidx.content.preferences.protobuf.ByteString byteString, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Struct) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.Struct parseFrom(byte[] bArr) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Struct) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static androidx.content.preferences.protobuf.Struct parseFrom(byte[] bArr, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Struct) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.Struct parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Struct) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static androidx.content.preferences.protobuf.Struct parseFrom(java.io.InputStream inputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Struct) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.Struct parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Struct) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static androidx.content.preferences.protobuf.Struct parseDelimitedFrom(java.io.InputStream inputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Struct) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.Struct parseFrom(androidx.content.preferences.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Struct) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static androidx.content.preferences.protobuf.Struct parseFrom(androidx.content.preferences.protobuf.CodedInputStream codedInputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Struct) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static androidx.datastore.preferences.protobuf.Struct.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static androidx.datastore.preferences.protobuf.Struct.Builder newBuilder(androidx.content.preferences.protobuf.Struct struct) {
        return DEFAULT_INSTANCE.createBuilder(struct);
    }

    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder<androidx.content.preferences.protobuf.Struct, androidx.datastore.preferences.protobuf.Struct.Builder> implements androidx.content.preferences.protobuf.StructOrBuilder {
        /* synthetic */ Builder(byte b) {
            this();
        }

        private Builder() {
            super(androidx.content.preferences.protobuf.Struct.DEFAULT_INSTANCE);
        }

        @Override // androidx.content.preferences.protobuf.StructOrBuilder
        public final int getFieldsCount() {
            return ((androidx.content.preferences.protobuf.Struct) this.instance).getFieldsMap().size();
        }

        @Override // androidx.content.preferences.protobuf.StructOrBuilder
        public final boolean containsFields(java.lang.String str) {
            return ((androidx.content.preferences.protobuf.Struct) this.instance).getFieldsMap().containsKey(str);
        }

        public final androidx.datastore.preferences.protobuf.Struct.Builder clearFields() {
            copyOnWrite();
            androidx.content.preferences.protobuf.Struct.getHighSpeedVideoSizes((androidx.content.preferences.protobuf.Struct) this.instance).clear();
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Struct.Builder removeFields(java.lang.String str) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Struct.getHighSpeedVideoSizes((androidx.content.preferences.protobuf.Struct) this.instance).remove(str);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.StructOrBuilder
        @java.lang.Deprecated
        public final java.util.Map<java.lang.String, androidx.content.preferences.protobuf.Value> getFields() {
            return getFieldsMap();
        }

        @Override // androidx.content.preferences.protobuf.StructOrBuilder
        public final java.util.Map<java.lang.String, androidx.content.preferences.protobuf.Value> getFieldsMap() {
            return java.util.Collections.unmodifiableMap(((androidx.content.preferences.protobuf.Struct) this.instance).getFieldsMap());
        }

        @Override // androidx.content.preferences.protobuf.StructOrBuilder
        public final androidx.content.preferences.protobuf.Value getFieldsOrDefault(java.lang.String str, androidx.content.preferences.protobuf.Value value) {
            java.util.Map<java.lang.String, androidx.content.preferences.protobuf.Value> fieldsMap = ((androidx.content.preferences.protobuf.Struct) this.instance).getFieldsMap();
            return fieldsMap.containsKey(str) ? fieldsMap.get(str) : value;
        }

        @Override // androidx.content.preferences.protobuf.StructOrBuilder
        public final androidx.content.preferences.protobuf.Value getFieldsOrThrow(java.lang.String str) {
            java.util.Map<java.lang.String, androidx.content.preferences.protobuf.Value> fieldsMap = ((androidx.content.preferences.protobuf.Struct) this.instance).getFieldsMap();
            if (!fieldsMap.containsKey(str)) {
                throw new java.lang.IllegalArgumentException();
            }
            return fieldsMap.get(str);
        }

        public final androidx.datastore.preferences.protobuf.Struct.Builder putFields(java.lang.String str, androidx.content.preferences.protobuf.Value value) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Struct.getHighSpeedVideoSizes((androidx.content.preferences.protobuf.Struct) this.instance).put(str, value);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Struct.Builder putAllFields(java.util.Map<java.lang.String, androidx.content.preferences.protobuf.Value> map) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Struct.getHighSpeedVideoSizes((androidx.content.preferences.protobuf.Struct) this.instance).putAll(map);
            return this;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.Struct$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Camera2StreamConfigurationMap;

        static {
            int[] iArr = new int[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.values().length];
            Camera2StreamConfigurationMap = iArr;
            try {
                iArr[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                Camera2StreamConfigurationMap[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                Camera2StreamConfigurationMap[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                Camera2StreamConfigurationMap[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                Camera2StreamConfigurationMap[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                Camera2StreamConfigurationMap[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                Camera2StreamConfigurationMap[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    @Override // androidx.content.preferences.protobuf.GeneratedMessageLite
    protected final java.lang.Object dynamicMethod(androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        androidx.content.preferences.protobuf.Parser parser;
        switch (androidx.content.preferences.protobuf.Struct.AnonymousClass1.Camera2StreamConfigurationMap[methodToInvoke.ordinal()]) {
            case 1:
                return new androidx.content.preferences.protobuf.Struct();
            case 2:
                return new androidx.datastore.preferences.protobuf.Struct.Builder((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new java.lang.Object[]{"fields_", androidx.datastore.preferences.protobuf.Struct.FieldsDefaultEntryHolder.getHighSpeedVideoFpsRangesFor});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                androidx.content.preferences.protobuf.Parser<androidx.content.preferences.protobuf.Struct> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (androidx.content.preferences.protobuf.Struct.class) {
                    parser = PARSER;
                    if (parser == null) {
                        parser = new androidx.datastore.preferences.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                        PARSER = parser;
                    }
                }
                return parser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    static {
        androidx.content.preferences.protobuf.Struct struct = new androidx.content.preferences.protobuf.Struct();
        DEFAULT_INSTANCE = struct;
        androidx.content.preferences.protobuf.GeneratedMessageLite.registerDefaultInstance(androidx.content.preferences.protobuf.Struct.class, struct);
    }

    public static androidx.content.preferences.protobuf.Struct getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static androidx.content.preferences.protobuf.Parser<androidx.content.preferences.protobuf.Struct> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    static /* synthetic */ java.util.Map getHighSpeedVideoSizes(androidx.content.preferences.protobuf.Struct struct) {
        if (!struct.fields_.isMutable()) {
            struct.fields_ = struct.fields_.mutableCopy();
        }
        return struct.fields_;
    }

    @Override // androidx.content.preferences.protobuf.StructOrBuilder
    public final boolean containsFields(java.lang.String str) {
        return this.fields_.containsKey(str);
    }

    @Override // androidx.content.preferences.protobuf.StructOrBuilder
    public final int getFieldsCount() {
        return this.fields_.size();
    }

    @Override // androidx.content.preferences.protobuf.StructOrBuilder
    public final java.util.Map<java.lang.String, androidx.content.preferences.protobuf.Value> getFieldsMap() {
        return java.util.Collections.unmodifiableMap(this.fields_);
    }

    @Override // androidx.content.preferences.protobuf.StructOrBuilder
    public final androidx.content.preferences.protobuf.Value getFieldsOrDefault(java.lang.String str, androidx.content.preferences.protobuf.Value value) {
        androidx.content.preferences.protobuf.MapFieldLite<java.lang.String, androidx.content.preferences.protobuf.Value> mapFieldLite = this.fields_;
        return mapFieldLite.containsKey(str) ? mapFieldLite.get(str) : value;
    }

    @Override // androidx.content.preferences.protobuf.StructOrBuilder
    public final androidx.content.preferences.protobuf.Value getFieldsOrThrow(java.lang.String str) {
        androidx.content.preferences.protobuf.MapFieldLite<java.lang.String, androidx.content.preferences.protobuf.Value> mapFieldLite = this.fields_;
        if (!mapFieldLite.containsKey(str)) {
            throw new java.lang.IllegalArgumentException();
        }
        return mapFieldLite.get(str);
    }
}
