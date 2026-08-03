package com.google.protobuf;

/* loaded from: classes4.dex */
public final class ListValue extends com.google.protobuf.GeneratedMessageLite<com.google.protobuf.ListValue, com.google.protobuf.ListValue.Builder> implements com.google.protobuf.ListValueOrBuilder {
    private static final com.google.protobuf.ListValue DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<com.google.protobuf.ListValue> PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private com.google.protobuf.Internal.ProtobufList<com.google.protobuf.Value> values_ = emptyProtobufList();

    private ListValue() {
    }

    @Override // com.google.protobuf.ListValueOrBuilder
    public java.util.List<com.google.protobuf.Value> getValuesList() {
        return this.values_;
    }

    public java.util.List<? extends com.google.protobuf.ValueOrBuilder> getValuesOrBuilderList() {
        return this.values_;
    }

    @Override // com.google.protobuf.ListValueOrBuilder
    public int getValuesCount() {
        return this.values_.size();
    }

    @Override // com.google.protobuf.ListValueOrBuilder
    public com.google.protobuf.Value getValues(int index) {
        return this.values_.get(index);
    }

    public com.google.protobuf.ValueOrBuilder getValuesOrBuilder(int index) {
        return this.values_.get(index);
    }

    private void ensureValuesIsMutable() {
        com.google.protobuf.Internal.ProtobufList<com.google.protobuf.Value> protobufList = this.values_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.values_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValues(int index, com.google.protobuf.Value value) {
        value.getClass();
        ensureValuesIsMutable();
        this.values_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValues(com.google.protobuf.Value value) {
        value.getClass();
        ensureValuesIsMutable();
        this.values_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValues(int index, com.google.protobuf.Value value) {
        value.getClass();
        ensureValuesIsMutable();
        this.values_.add(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllValues(java.lang.Iterable<? extends com.google.protobuf.Value> values) {
        ensureValuesIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) values, (java.util.List) this.values_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValues() {
        this.values_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeValues(int index) {
        ensureValuesIsMutable();
        this.values_.remove(index);
    }

    public static com.google.protobuf.ListValue parseFrom(java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.ListValue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static com.google.protobuf.ListValue parseFrom(java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.ListValue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static com.google.protobuf.ListValue parseFrom(com.google.protobuf.ByteString data) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.ListValue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static com.google.protobuf.ListValue parseFrom(com.google.protobuf.ByteString data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.ListValue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static com.google.protobuf.ListValue parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.ListValue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static com.google.protobuf.ListValue parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.ListValue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static com.google.protobuf.ListValue parseFrom(java.io.InputStream input) throws java.io.IOException {
        return (com.google.protobuf.ListValue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static com.google.protobuf.ListValue parseFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (com.google.protobuf.ListValue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static com.google.protobuf.ListValue parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
        return (com.google.protobuf.ListValue) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static com.google.protobuf.ListValue parseDelimitedFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (com.google.protobuf.ListValue) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static com.google.protobuf.ListValue parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
        return (com.google.protobuf.ListValue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static com.google.protobuf.ListValue parseFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (com.google.protobuf.ListValue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static com.google.protobuf.ListValue.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.google.protobuf.ListValue.Builder newBuilder(com.google.protobuf.ListValue prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.google.protobuf.ListValue, com.google.protobuf.ListValue.Builder> implements com.google.protobuf.ListValueOrBuilder {
        /* synthetic */ Builder(com.google.protobuf.ListValue.AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(com.google.protobuf.ListValue.DEFAULT_INSTANCE);
        }

        @Override // com.google.protobuf.ListValueOrBuilder
        public java.util.List<com.google.protobuf.Value> getValuesList() {
            return java.util.Collections.unmodifiableList(((com.google.protobuf.ListValue) this.instance).getValuesList());
        }

        @Override // com.google.protobuf.ListValueOrBuilder
        public int getValuesCount() {
            return ((com.google.protobuf.ListValue) this.instance).getValuesCount();
        }

        @Override // com.google.protobuf.ListValueOrBuilder
        public com.google.protobuf.Value getValues(int index) {
            return ((com.google.protobuf.ListValue) this.instance).getValues(index);
        }

        public com.google.protobuf.ListValue.Builder setValues(int index, com.google.protobuf.Value value) {
            copyOnWrite();
            ((com.google.protobuf.ListValue) this.instance).setValues(index, value);
            return this;
        }

        public com.google.protobuf.ListValue.Builder setValues(int index, com.google.protobuf.Value.Builder builderForValue) {
            copyOnWrite();
            ((com.google.protobuf.ListValue) this.instance).setValues(index, builderForValue.build());
            return this;
        }

        public com.google.protobuf.ListValue.Builder addValues(com.google.protobuf.Value value) {
            copyOnWrite();
            ((com.google.protobuf.ListValue) this.instance).addValues(value);
            return this;
        }

        public com.google.protobuf.ListValue.Builder addValues(int index, com.google.protobuf.Value value) {
            copyOnWrite();
            ((com.google.protobuf.ListValue) this.instance).addValues(index, value);
            return this;
        }

        public com.google.protobuf.ListValue.Builder addValues(com.google.protobuf.Value.Builder builderForValue) {
            copyOnWrite();
            ((com.google.protobuf.ListValue) this.instance).addValues(builderForValue.build());
            return this;
        }

        public com.google.protobuf.ListValue.Builder addValues(int index, com.google.protobuf.Value.Builder builderForValue) {
            copyOnWrite();
            ((com.google.protobuf.ListValue) this.instance).addValues(index, builderForValue.build());
            return this;
        }

        public com.google.protobuf.ListValue.Builder addAllValues(java.lang.Iterable<? extends com.google.protobuf.Value> values) {
            copyOnWrite();
            ((com.google.protobuf.ListValue) this.instance).addAllValues(values);
            return this;
        }

        public com.google.protobuf.ListValue.Builder clearValues() {
            copyOnWrite();
            ((com.google.protobuf.ListValue) this.instance).clearValues();
            return this;
        }

        public com.google.protobuf.ListValue.Builder removeValues(int index) {
            copyOnWrite();
            ((com.google.protobuf.ListValue) this.instance).removeValues(index);
            return this;
        }
    }

    /* renamed from: com.google.protobuf.ListValue$1, reason: invalid class name */
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
        com.google.protobuf.ListValue.AnonymousClass1 anonymousClass1 = null;
        switch (com.google.protobuf.ListValue.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
            case 1:
                return new com.google.protobuf.ListValue();
            case 2:
                return new com.google.protobuf.ListValue.Builder(anonymousClass1);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"values_", com.google.protobuf.Value.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.google.protobuf.ListValue> parser = PARSER;
                if (parser == null) {
                    synchronized (com.google.protobuf.ListValue.class) {
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
        com.google.protobuf.ListValue listValue = new com.google.protobuf.ListValue();
        DEFAULT_INSTANCE = listValue;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.google.protobuf.ListValue.class, listValue);
    }

    public static com.google.protobuf.ListValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.google.protobuf.Parser<com.google.protobuf.ListValue> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
