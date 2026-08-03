package com.google.protobuf;

/* loaded from: classes4.dex */
public final class EnumValue extends com.google.protobuf.GeneratedMessageLite<com.google.protobuf.EnumValue, com.google.protobuf.EnumValue.Builder> implements com.google.protobuf.EnumValueOrBuilder {
    private static final com.google.protobuf.EnumValue DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NUMBER_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile com.google.protobuf.Parser<com.google.protobuf.EnumValue> PARSER;
    private int number_;
    private java.lang.String name_ = "";
    private com.google.protobuf.Internal.ProtobufList<com.google.protobuf.Option> options_ = emptyProtobufList();

    private EnumValue() {
    }

    @Override // com.google.protobuf.EnumValueOrBuilder
    public java.lang.String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.EnumValueOrBuilder
    public com.google.protobuf.ByteString getNameBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.name_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(java.lang.String value) {
        value.getClass();
        this.name_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(com.google.protobuf.ByteString value) {
        checkByteStringIsUtf8(value);
        this.name_ = value.toStringUtf8();
    }

    @Override // com.google.protobuf.EnumValueOrBuilder
    public int getNumber() {
        return this.number_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumber(int value) {
        this.number_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumber() {
        this.number_ = 0;
    }

    @Override // com.google.protobuf.EnumValueOrBuilder
    public java.util.List<com.google.protobuf.Option> getOptionsList() {
        return this.options_;
    }

    public java.util.List<? extends com.google.protobuf.OptionOrBuilder> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // com.google.protobuf.EnumValueOrBuilder
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // com.google.protobuf.EnumValueOrBuilder
    public com.google.protobuf.Option getOptions(int index) {
        return this.options_.get(index);
    }

    public com.google.protobuf.OptionOrBuilder getOptionsOrBuilder(int index) {
        return this.options_.get(index);
    }

    private void ensureOptionsIsMutable() {
        com.google.protobuf.Internal.ProtobufList<com.google.protobuf.Option> protobufList = this.options_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.options_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOptions(int index, com.google.protobuf.Option value) {
        value.getClass();
        ensureOptionsIsMutable();
        this.options_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(com.google.protobuf.Option value) {
        value.getClass();
        ensureOptionsIsMutable();
        this.options_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(int index, com.google.protobuf.Option value) {
        value.getClass();
        ensureOptionsIsMutable();
        this.options_.add(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOptions(java.lang.Iterable<? extends com.google.protobuf.Option> values) {
        ensureOptionsIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) values, (java.util.List) this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptions() {
        this.options_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOptions(int index) {
        ensureOptionsIsMutable();
        this.options_.remove(index);
    }

    public static com.google.protobuf.EnumValue parseFrom(java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.EnumValue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static com.google.protobuf.EnumValue parseFrom(java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.EnumValue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static com.google.protobuf.EnumValue parseFrom(com.google.protobuf.ByteString data) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.EnumValue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static com.google.protobuf.EnumValue parseFrom(com.google.protobuf.ByteString data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.EnumValue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static com.google.protobuf.EnumValue parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.EnumValue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static com.google.protobuf.EnumValue parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.EnumValue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static com.google.protobuf.EnumValue parseFrom(java.io.InputStream input) throws java.io.IOException {
        return (com.google.protobuf.EnumValue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static com.google.protobuf.EnumValue parseFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (com.google.protobuf.EnumValue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static com.google.protobuf.EnumValue parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
        return (com.google.protobuf.EnumValue) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static com.google.protobuf.EnumValue parseDelimitedFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (com.google.protobuf.EnumValue) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static com.google.protobuf.EnumValue parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
        return (com.google.protobuf.EnumValue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static com.google.protobuf.EnumValue parseFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (com.google.protobuf.EnumValue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static com.google.protobuf.EnumValue.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.google.protobuf.EnumValue.Builder newBuilder(com.google.protobuf.EnumValue prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.google.protobuf.EnumValue, com.google.protobuf.EnumValue.Builder> implements com.google.protobuf.EnumValueOrBuilder {
        /* synthetic */ Builder(com.google.protobuf.EnumValue.AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(com.google.protobuf.EnumValue.DEFAULT_INSTANCE);
        }

        @Override // com.google.protobuf.EnumValueOrBuilder
        public java.lang.String getName() {
            return ((com.google.protobuf.EnumValue) this.instance).getName();
        }

        @Override // com.google.protobuf.EnumValueOrBuilder
        public com.google.protobuf.ByteString getNameBytes() {
            return ((com.google.protobuf.EnumValue) this.instance).getNameBytes();
        }

        public com.google.protobuf.EnumValue.Builder setName(java.lang.String value) {
            copyOnWrite();
            ((com.google.protobuf.EnumValue) this.instance).setName(value);
            return this;
        }

        public com.google.protobuf.EnumValue.Builder clearName() {
            copyOnWrite();
            ((com.google.protobuf.EnumValue) this.instance).clearName();
            return this;
        }

        public com.google.protobuf.EnumValue.Builder setNameBytes(com.google.protobuf.ByteString value) {
            copyOnWrite();
            ((com.google.protobuf.EnumValue) this.instance).setNameBytes(value);
            return this;
        }

        @Override // com.google.protobuf.EnumValueOrBuilder
        public int getNumber() {
            return ((com.google.protobuf.EnumValue) this.instance).getNumber();
        }

        public com.google.protobuf.EnumValue.Builder setNumber(int value) {
            copyOnWrite();
            ((com.google.protobuf.EnumValue) this.instance).setNumber(value);
            return this;
        }

        public com.google.protobuf.EnumValue.Builder clearNumber() {
            copyOnWrite();
            ((com.google.protobuf.EnumValue) this.instance).clearNumber();
            return this;
        }

        @Override // com.google.protobuf.EnumValueOrBuilder
        public java.util.List<com.google.protobuf.Option> getOptionsList() {
            return java.util.Collections.unmodifiableList(((com.google.protobuf.EnumValue) this.instance).getOptionsList());
        }

        @Override // com.google.protobuf.EnumValueOrBuilder
        public int getOptionsCount() {
            return ((com.google.protobuf.EnumValue) this.instance).getOptionsCount();
        }

        @Override // com.google.protobuf.EnumValueOrBuilder
        public com.google.protobuf.Option getOptions(int index) {
            return ((com.google.protobuf.EnumValue) this.instance).getOptions(index);
        }

        public com.google.protobuf.EnumValue.Builder setOptions(int index, com.google.protobuf.Option value) {
            copyOnWrite();
            ((com.google.protobuf.EnumValue) this.instance).setOptions(index, value);
            return this;
        }

        public com.google.protobuf.EnumValue.Builder setOptions(int index, com.google.protobuf.Option.Builder builderForValue) {
            copyOnWrite();
            ((com.google.protobuf.EnumValue) this.instance).setOptions(index, builderForValue.build());
            return this;
        }

        public com.google.protobuf.EnumValue.Builder addOptions(com.google.protobuf.Option value) {
            copyOnWrite();
            ((com.google.protobuf.EnumValue) this.instance).addOptions(value);
            return this;
        }

        public com.google.protobuf.EnumValue.Builder addOptions(int index, com.google.protobuf.Option value) {
            copyOnWrite();
            ((com.google.protobuf.EnumValue) this.instance).addOptions(index, value);
            return this;
        }

        public com.google.protobuf.EnumValue.Builder addOptions(com.google.protobuf.Option.Builder builderForValue) {
            copyOnWrite();
            ((com.google.protobuf.EnumValue) this.instance).addOptions(builderForValue.build());
            return this;
        }

        public com.google.protobuf.EnumValue.Builder addOptions(int index, com.google.protobuf.Option.Builder builderForValue) {
            copyOnWrite();
            ((com.google.protobuf.EnumValue) this.instance).addOptions(index, builderForValue.build());
            return this;
        }

        public com.google.protobuf.EnumValue.Builder addAllOptions(java.lang.Iterable<? extends com.google.protobuf.Option> values) {
            copyOnWrite();
            ((com.google.protobuf.EnumValue) this.instance).addAllOptions(values);
            return this;
        }

        public com.google.protobuf.EnumValue.Builder clearOptions() {
            copyOnWrite();
            ((com.google.protobuf.EnumValue) this.instance).clearOptions();
            return this;
        }

        public com.google.protobuf.EnumValue.Builder removeOptions(int index) {
            copyOnWrite();
            ((com.google.protobuf.EnumValue) this.instance).removeOptions(index);
            return this;
        }
    }

    /* renamed from: com.google.protobuf.EnumValue$1, reason: invalid class name */
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
        com.google.protobuf.EnumValue.AnonymousClass1 anonymousClass1 = null;
        switch (com.google.protobuf.EnumValue.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
            case 1:
                return new com.google.protobuf.EnumValue();
            case 2:
                return new com.google.protobuf.EnumValue.Builder(anonymousClass1);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u0004\u0003\u001b", new java.lang.Object[]{"name_", "number_", "options_", com.google.protobuf.Option.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.google.protobuf.EnumValue> parser = PARSER;
                if (parser == null) {
                    synchronized (com.google.protobuf.EnumValue.class) {
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
        com.google.protobuf.EnumValue enumValue = new com.google.protobuf.EnumValue();
        DEFAULT_INSTANCE = enumValue;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.google.protobuf.EnumValue.class, enumValue);
    }

    public static com.google.protobuf.EnumValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.google.protobuf.Parser<com.google.protobuf.EnumValue> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
