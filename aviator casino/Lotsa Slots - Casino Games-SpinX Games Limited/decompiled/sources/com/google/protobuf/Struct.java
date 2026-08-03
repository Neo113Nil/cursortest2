package com.google.protobuf;

/* loaded from: classes4.dex */
public final class Struct extends com.google.protobuf.GeneratedMessageLite<com.google.protobuf.Struct, com.google.protobuf.Struct.Builder> implements com.google.protobuf.StructOrBuilder {
    private static final com.google.protobuf.Struct DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.Parser<com.google.protobuf.Struct> PARSER;
    private com.google.protobuf.MapFieldLite<java.lang.String, com.google.protobuf.Value> fields_ = com.google.protobuf.MapFieldLite.emptyMapField();

    private Struct() {
    }

    private static final class FieldsDefaultEntryHolder {
        static final com.google.protobuf.MapEntryLite<java.lang.String, com.google.protobuf.Value> defaultEntry = com.google.protobuf.MapEntryLite.newDefaultInstance(com.google.protobuf.WireFormat.FieldType.STRING, "", com.google.protobuf.WireFormat.FieldType.MESSAGE, com.google.protobuf.Value.getDefaultInstance());

        private FieldsDefaultEntryHolder() {
        }
    }

    private com.google.protobuf.MapFieldLite<java.lang.String, com.google.protobuf.Value> internalGetFields() {
        return this.fields_;
    }

    private com.google.protobuf.MapFieldLite<java.lang.String, com.google.protobuf.Value> internalGetMutableFields() {
        if (!this.fields_.isMutable()) {
            this.fields_ = this.fields_.mutableCopy();
        }
        return this.fields_;
    }

    @Override // com.google.protobuf.StructOrBuilder
    public int getFieldsCount() {
        return internalGetFields().size();
    }

    @Override // com.google.protobuf.StructOrBuilder
    public boolean containsFields(java.lang.String key) {
        key.getClass();
        return internalGetFields().containsKey(key);
    }

    @Override // com.google.protobuf.StructOrBuilder
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.protobuf.Value> getFields() {
        return getFieldsMap();
    }

    @Override // com.google.protobuf.StructOrBuilder
    public java.util.Map<java.lang.String, com.google.protobuf.Value> getFieldsMap() {
        return java.util.Collections.unmodifiableMap(internalGetFields());
    }

    @Override // com.google.protobuf.StructOrBuilder
    public com.google.protobuf.Value getFieldsOrDefault(java.lang.String key, com.google.protobuf.Value defaultValue) {
        key.getClass();
        com.google.protobuf.MapFieldLite<java.lang.String, com.google.protobuf.Value> internalGetFields = internalGetFields();
        return internalGetFields.containsKey(key) ? internalGetFields.get(key) : defaultValue;
    }

    @Override // com.google.protobuf.StructOrBuilder
    public com.google.protobuf.Value getFieldsOrThrow(java.lang.String key) {
        key.getClass();
        com.google.protobuf.MapFieldLite<java.lang.String, com.google.protobuf.Value> internalGetFields = internalGetFields();
        if (!internalGetFields.containsKey(key)) {
            throw new java.lang.IllegalArgumentException();
        }
        return internalGetFields.get(key);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.util.Map<java.lang.String, com.google.protobuf.Value> getMutableFieldsMap() {
        return internalGetMutableFields();
    }

    public static com.google.protobuf.Struct parseFrom(java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Struct) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static com.google.protobuf.Struct parseFrom(java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Struct) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static com.google.protobuf.Struct parseFrom(com.google.protobuf.ByteString data) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Struct) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static com.google.protobuf.Struct parseFrom(com.google.protobuf.ByteString data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Struct) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static com.google.protobuf.Struct parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Struct) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static com.google.protobuf.Struct parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Struct) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static com.google.protobuf.Struct parseFrom(java.io.InputStream input) throws java.io.IOException {
        return (com.google.protobuf.Struct) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static com.google.protobuf.Struct parseFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (com.google.protobuf.Struct) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static com.google.protobuf.Struct parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
        return (com.google.protobuf.Struct) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static com.google.protobuf.Struct parseDelimitedFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (com.google.protobuf.Struct) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static com.google.protobuf.Struct parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
        return (com.google.protobuf.Struct) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static com.google.protobuf.Struct parseFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (com.google.protobuf.Struct) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static com.google.protobuf.Struct.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.google.protobuf.Struct.Builder newBuilder(com.google.protobuf.Struct prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.google.protobuf.Struct, com.google.protobuf.Struct.Builder> implements com.google.protobuf.StructOrBuilder {
        /* synthetic */ Builder(com.google.protobuf.Struct.AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(com.google.protobuf.Struct.DEFAULT_INSTANCE);
        }

        @Override // com.google.protobuf.StructOrBuilder
        public int getFieldsCount() {
            return ((com.google.protobuf.Struct) this.instance).getFieldsMap().size();
        }

        @Override // com.google.protobuf.StructOrBuilder
        public boolean containsFields(java.lang.String key) {
            key.getClass();
            return ((com.google.protobuf.Struct) this.instance).getFieldsMap().containsKey(key);
        }

        public com.google.protobuf.Struct.Builder clearFields() {
            copyOnWrite();
            ((com.google.protobuf.Struct) this.instance).getMutableFieldsMap().clear();
            return this;
        }

        public com.google.protobuf.Struct.Builder removeFields(java.lang.String key) {
            key.getClass();
            copyOnWrite();
            ((com.google.protobuf.Struct) this.instance).getMutableFieldsMap().remove(key);
            return this;
        }

        @Override // com.google.protobuf.StructOrBuilder
        @java.lang.Deprecated
        public java.util.Map<java.lang.String, com.google.protobuf.Value> getFields() {
            return getFieldsMap();
        }

        @Override // com.google.protobuf.StructOrBuilder
        public java.util.Map<java.lang.String, com.google.protobuf.Value> getFieldsMap() {
            return java.util.Collections.unmodifiableMap(((com.google.protobuf.Struct) this.instance).getFieldsMap());
        }

        @Override // com.google.protobuf.StructOrBuilder
        public com.google.protobuf.Value getFieldsOrDefault(java.lang.String key, com.google.protobuf.Value defaultValue) {
            key.getClass();
            java.util.Map<java.lang.String, com.google.protobuf.Value> fieldsMap = ((com.google.protobuf.Struct) this.instance).getFieldsMap();
            return fieldsMap.containsKey(key) ? fieldsMap.get(key) : defaultValue;
        }

        @Override // com.google.protobuf.StructOrBuilder
        public com.google.protobuf.Value getFieldsOrThrow(java.lang.String key) {
            key.getClass();
            java.util.Map<java.lang.String, com.google.protobuf.Value> fieldsMap = ((com.google.protobuf.Struct) this.instance).getFieldsMap();
            if (!fieldsMap.containsKey(key)) {
                throw new java.lang.IllegalArgumentException();
            }
            return fieldsMap.get(key);
        }

        public com.google.protobuf.Struct.Builder putFields(java.lang.String key, com.google.protobuf.Value value) {
            key.getClass();
            value.getClass();
            copyOnWrite();
            ((com.google.protobuf.Struct) this.instance).getMutableFieldsMap().put(key, value);
            return this;
        }

        public com.google.protobuf.Struct.Builder putAllFields(java.util.Map<java.lang.String, com.google.protobuf.Value> values) {
            copyOnWrite();
            ((com.google.protobuf.Struct) this.instance).getMutableFieldsMap().putAll(values);
            return this;
        }
    }

    /* renamed from: com.google.protobuf.Struct$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke method, java.lang.Object arg0, java.lang.Object arg1) {
        com.google.protobuf.Struct.AnonymousClass1 anonymousClass1 = null;
        switch (com.google.protobuf.Struct.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
            case 1:
                return new com.google.protobuf.Struct();
            case 2:
                return new com.google.protobuf.Struct.Builder(anonymousClass1);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new java.lang.Object[]{"fields_", com.google.protobuf.Struct.FieldsDefaultEntryHolder.defaultEntry});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.google.protobuf.Struct> parser = PARSER;
                if (parser == null) {
                    synchronized (com.google.protobuf.Struct.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
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
        com.google.protobuf.Struct struct = new com.google.protobuf.Struct();
        DEFAULT_INSTANCE = struct;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.google.protobuf.Struct.class, struct);
    }

    public static com.google.protobuf.Struct getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.google.protobuf.Parser<com.google.protobuf.Struct> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
