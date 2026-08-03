package com.google.protobuf;

/* loaded from: classes4.dex */
public final class Value extends com.google.protobuf.GeneratedMessageLite<com.google.protobuf.Value, com.google.protobuf.Value.Builder> implements com.google.protobuf.ValueOrBuilder {
    public static final int BOOL_VALUE_FIELD_NUMBER = 4;
    private static final com.google.protobuf.Value DEFAULT_INSTANCE;
    public static final int LIST_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 1;
    public static final int NUMBER_VALUE_FIELD_NUMBER = 2;
    private static volatile com.google.protobuf.Parser<com.google.protobuf.Value> PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 3;
    public static final int STRUCT_VALUE_FIELD_NUMBER = 5;
    private int kindCase_ = 0;
    private java.lang.Object kind_;

    private Value() {
    }

    public enum KindCase {
        NULL_VALUE(1),
        NUMBER_VALUE(2),
        STRING_VALUE(3),
        BOOL_VALUE(4),
        STRUCT_VALUE(5),
        LIST_VALUE(6),
        KIND_NOT_SET(0);

        private final int value;

        KindCase(int value) {
            this.value = value;
        }

        @java.lang.Deprecated
        public static com.google.protobuf.Value.KindCase valueOf(int value) {
            return forNumber(value);
        }

        public static com.google.protobuf.Value.KindCase forNumber(int value) {
            switch (value) {
                case 0:
                    return KIND_NOT_SET;
                case 1:
                    return NULL_VALUE;
                case 2:
                    return NUMBER_VALUE;
                case 3:
                    return STRING_VALUE;
                case 4:
                    return BOOL_VALUE;
                case 5:
                    return STRUCT_VALUE;
                case 6:
                    return LIST_VALUE;
                default:
                    return null;
            }
        }

        public int getNumber() {
            return this.value;
        }
    }

    @Override // com.google.protobuf.ValueOrBuilder
    public com.google.protobuf.Value.KindCase getKindCase() {
        return com.google.protobuf.Value.KindCase.forNumber(this.kindCase_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKind() {
        this.kindCase_ = 0;
        this.kind_ = null;
    }

    @Override // com.google.protobuf.ValueOrBuilder
    public boolean hasNullValue() {
        return this.kindCase_ == 1;
    }

    @Override // com.google.protobuf.ValueOrBuilder
    public int getNullValueValue() {
        if (this.kindCase_ == 1) {
            return ((java.lang.Integer) this.kind_).intValue();
        }
        return 0;
    }

    @Override // com.google.protobuf.ValueOrBuilder
    public com.google.protobuf.NullValue getNullValue() {
        if (this.kindCase_ == 1) {
            com.google.protobuf.NullValue forNumber = com.google.protobuf.NullValue.forNumber(((java.lang.Integer) this.kind_).intValue());
            return forNumber == null ? com.google.protobuf.NullValue.UNRECOGNIZED : forNumber;
        }
        return com.google.protobuf.NullValue.NULL_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNullValueValue(int value) {
        this.kindCase_ = 1;
        this.kind_ = java.lang.Integer.valueOf(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNullValue(com.google.protobuf.NullValue value) {
        this.kind_ = java.lang.Integer.valueOf(value.getNumber());
        this.kindCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNullValue() {
        if (this.kindCase_ == 1) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    @Override // com.google.protobuf.ValueOrBuilder
    public boolean hasNumberValue() {
        return this.kindCase_ == 2;
    }

    @Override // com.google.protobuf.ValueOrBuilder
    public double getNumberValue() {
        if (this.kindCase_ == 2) {
            return ((java.lang.Double) this.kind_).doubleValue();
        }
        return 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumberValue(double value) {
        this.kindCase_ = 2;
        this.kind_ = java.lang.Double.valueOf(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumberValue() {
        if (this.kindCase_ == 2) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    @Override // com.google.protobuf.ValueOrBuilder
    public boolean hasStringValue() {
        return this.kindCase_ == 3;
    }

    @Override // com.google.protobuf.ValueOrBuilder
    public java.lang.String getStringValue() {
        if (this.kindCase_ != 3) {
            return "";
        }
        return (java.lang.String) this.kind_;
    }

    @Override // com.google.protobuf.ValueOrBuilder
    public com.google.protobuf.ByteString getStringValueBytes() {
        java.lang.String str;
        if (this.kindCase_ != 3) {
            str = "";
        } else {
            str = (java.lang.String) this.kind_;
        }
        return com.google.protobuf.ByteString.copyFromUtf8(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStringValue(java.lang.String value) {
        value.getClass();
        this.kindCase_ = 3;
        this.kind_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStringValue() {
        if (this.kindCase_ == 3) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStringValueBytes(com.google.protobuf.ByteString value) {
        checkByteStringIsUtf8(value);
        this.kind_ = value.toStringUtf8();
        this.kindCase_ = 3;
    }

    @Override // com.google.protobuf.ValueOrBuilder
    public boolean hasBoolValue() {
        return this.kindCase_ == 4;
    }

    @Override // com.google.protobuf.ValueOrBuilder
    public boolean getBoolValue() {
        if (this.kindCase_ == 4) {
            return ((java.lang.Boolean) this.kind_).booleanValue();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBoolValue(boolean value) {
        this.kindCase_ = 4;
        this.kind_ = java.lang.Boolean.valueOf(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBoolValue() {
        if (this.kindCase_ == 4) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    @Override // com.google.protobuf.ValueOrBuilder
    public boolean hasStructValue() {
        return this.kindCase_ == 5;
    }

    @Override // com.google.protobuf.ValueOrBuilder
    public com.google.protobuf.Struct getStructValue() {
        if (this.kindCase_ == 5) {
            return (com.google.protobuf.Struct) this.kind_;
        }
        return com.google.protobuf.Struct.getDefaultInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStructValue(com.google.protobuf.Struct value) {
        value.getClass();
        this.kind_ = value;
        this.kindCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStructValue(com.google.protobuf.Struct value) {
        value.getClass();
        if (this.kindCase_ == 5 && this.kind_ != com.google.protobuf.Struct.getDefaultInstance()) {
            this.kind_ = com.google.protobuf.Struct.newBuilder((com.google.protobuf.Struct) this.kind_).mergeFrom((com.google.protobuf.Struct.Builder) value).buildPartial();
        } else {
            this.kind_ = value;
        }
        this.kindCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStructValue() {
        if (this.kindCase_ == 5) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    @Override // com.google.protobuf.ValueOrBuilder
    public boolean hasListValue() {
        return this.kindCase_ == 6;
    }

    @Override // com.google.protobuf.ValueOrBuilder
    public com.google.protobuf.ListValue getListValue() {
        if (this.kindCase_ == 6) {
            return (com.google.protobuf.ListValue) this.kind_;
        }
        return com.google.protobuf.ListValue.getDefaultInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setListValue(com.google.protobuf.ListValue value) {
        value.getClass();
        this.kind_ = value;
        this.kindCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeListValue(com.google.protobuf.ListValue value) {
        value.getClass();
        if (this.kindCase_ == 6 && this.kind_ != com.google.protobuf.ListValue.getDefaultInstance()) {
            this.kind_ = com.google.protobuf.ListValue.newBuilder((com.google.protobuf.ListValue) this.kind_).mergeFrom((com.google.protobuf.ListValue.Builder) value).buildPartial();
        } else {
            this.kind_ = value;
        }
        this.kindCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearListValue() {
        if (this.kindCase_ == 6) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    public static com.google.protobuf.Value parseFrom(java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Value) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static com.google.protobuf.Value parseFrom(java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Value) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static com.google.protobuf.Value parseFrom(com.google.protobuf.ByteString data) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Value) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static com.google.protobuf.Value parseFrom(com.google.protobuf.ByteString data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Value) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static com.google.protobuf.Value parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Value) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static com.google.protobuf.Value parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Value) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static com.google.protobuf.Value parseFrom(java.io.InputStream input) throws java.io.IOException {
        return (com.google.protobuf.Value) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static com.google.protobuf.Value parseFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (com.google.protobuf.Value) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static com.google.protobuf.Value parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
        return (com.google.protobuf.Value) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static com.google.protobuf.Value parseDelimitedFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (com.google.protobuf.Value) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static com.google.protobuf.Value parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
        return (com.google.protobuf.Value) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static com.google.protobuf.Value parseFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (com.google.protobuf.Value) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static com.google.protobuf.Value.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.google.protobuf.Value.Builder newBuilder(com.google.protobuf.Value prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.google.protobuf.Value, com.google.protobuf.Value.Builder> implements com.google.protobuf.ValueOrBuilder {
        /* synthetic */ Builder(com.google.protobuf.Value.AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(com.google.protobuf.Value.DEFAULT_INSTANCE);
        }

        @Override // com.google.protobuf.ValueOrBuilder
        public com.google.protobuf.Value.KindCase getKindCase() {
            return ((com.google.protobuf.Value) this.instance).getKindCase();
        }

        public com.google.protobuf.Value.Builder clearKind() {
            copyOnWrite();
            ((com.google.protobuf.Value) this.instance).clearKind();
            return this;
        }

        @Override // com.google.protobuf.ValueOrBuilder
        public boolean hasNullValue() {
            return ((com.google.protobuf.Value) this.instance).hasNullValue();
        }

        @Override // com.google.protobuf.ValueOrBuilder
        public int getNullValueValue() {
            return ((com.google.protobuf.Value) this.instance).getNullValueValue();
        }

        public com.google.protobuf.Value.Builder setNullValueValue(int value) {
            copyOnWrite();
            ((com.google.protobuf.Value) this.instance).setNullValueValue(value);
            return this;
        }

        @Override // com.google.protobuf.ValueOrBuilder
        public com.google.protobuf.NullValue getNullValue() {
            return ((com.google.protobuf.Value) this.instance).getNullValue();
        }

        public com.google.protobuf.Value.Builder setNullValue(com.google.protobuf.NullValue value) {
            copyOnWrite();
            ((com.google.protobuf.Value) this.instance).setNullValue(value);
            return this;
        }

        public com.google.protobuf.Value.Builder clearNullValue() {
            copyOnWrite();
            ((com.google.protobuf.Value) this.instance).clearNullValue();
            return this;
        }

        @Override // com.google.protobuf.ValueOrBuilder
        public boolean hasNumberValue() {
            return ((com.google.protobuf.Value) this.instance).hasNumberValue();
        }

        @Override // com.google.protobuf.ValueOrBuilder
        public double getNumberValue() {
            return ((com.google.protobuf.Value) this.instance).getNumberValue();
        }

        public com.google.protobuf.Value.Builder setNumberValue(double value) {
            copyOnWrite();
            ((com.google.protobuf.Value) this.instance).setNumberValue(value);
            return this;
        }

        public com.google.protobuf.Value.Builder clearNumberValue() {
            copyOnWrite();
            ((com.google.protobuf.Value) this.instance).clearNumberValue();
            return this;
        }

        @Override // com.google.protobuf.ValueOrBuilder
        public boolean hasStringValue() {
            return ((com.google.protobuf.Value) this.instance).hasStringValue();
        }

        @Override // com.google.protobuf.ValueOrBuilder
        public java.lang.String getStringValue() {
            return ((com.google.protobuf.Value) this.instance).getStringValue();
        }

        @Override // com.google.protobuf.ValueOrBuilder
        public com.google.protobuf.ByteString getStringValueBytes() {
            return ((com.google.protobuf.Value) this.instance).getStringValueBytes();
        }

        public com.google.protobuf.Value.Builder setStringValue(java.lang.String value) {
            copyOnWrite();
            ((com.google.protobuf.Value) this.instance).setStringValue(value);
            return this;
        }

        public com.google.protobuf.Value.Builder clearStringValue() {
            copyOnWrite();
            ((com.google.protobuf.Value) this.instance).clearStringValue();
            return this;
        }

        public com.google.protobuf.Value.Builder setStringValueBytes(com.google.protobuf.ByteString value) {
            copyOnWrite();
            ((com.google.protobuf.Value) this.instance).setStringValueBytes(value);
            return this;
        }

        @Override // com.google.protobuf.ValueOrBuilder
        public boolean hasBoolValue() {
            return ((com.google.protobuf.Value) this.instance).hasBoolValue();
        }

        @Override // com.google.protobuf.ValueOrBuilder
        public boolean getBoolValue() {
            return ((com.google.protobuf.Value) this.instance).getBoolValue();
        }

        public com.google.protobuf.Value.Builder setBoolValue(boolean value) {
            copyOnWrite();
            ((com.google.protobuf.Value) this.instance).setBoolValue(value);
            return this;
        }

        public com.google.protobuf.Value.Builder clearBoolValue() {
            copyOnWrite();
            ((com.google.protobuf.Value) this.instance).clearBoolValue();
            return this;
        }

        @Override // com.google.protobuf.ValueOrBuilder
        public boolean hasStructValue() {
            return ((com.google.protobuf.Value) this.instance).hasStructValue();
        }

        @Override // com.google.protobuf.ValueOrBuilder
        public com.google.protobuf.Struct getStructValue() {
            return ((com.google.protobuf.Value) this.instance).getStructValue();
        }

        public com.google.protobuf.Value.Builder setStructValue(com.google.protobuf.Struct value) {
            copyOnWrite();
            ((com.google.protobuf.Value) this.instance).setStructValue(value);
            return this;
        }

        public com.google.protobuf.Value.Builder setStructValue(com.google.protobuf.Struct.Builder builderForValue) {
            copyOnWrite();
            ((com.google.protobuf.Value) this.instance).setStructValue(builderForValue.build());
            return this;
        }

        public com.google.protobuf.Value.Builder mergeStructValue(com.google.protobuf.Struct value) {
            copyOnWrite();
            ((com.google.protobuf.Value) this.instance).mergeStructValue(value);
            return this;
        }

        public com.google.protobuf.Value.Builder clearStructValue() {
            copyOnWrite();
            ((com.google.protobuf.Value) this.instance).clearStructValue();
            return this;
        }

        @Override // com.google.protobuf.ValueOrBuilder
        public boolean hasListValue() {
            return ((com.google.protobuf.Value) this.instance).hasListValue();
        }

        @Override // com.google.protobuf.ValueOrBuilder
        public com.google.protobuf.ListValue getListValue() {
            return ((com.google.protobuf.Value) this.instance).getListValue();
        }

        public com.google.protobuf.Value.Builder setListValue(com.google.protobuf.ListValue value) {
            copyOnWrite();
            ((com.google.protobuf.Value) this.instance).setListValue(value);
            return this;
        }

        public com.google.protobuf.Value.Builder setListValue(com.google.protobuf.ListValue.Builder builderForValue) {
            copyOnWrite();
            ((com.google.protobuf.Value) this.instance).setListValue(builderForValue.build());
            return this;
        }

        public com.google.protobuf.Value.Builder mergeListValue(com.google.protobuf.ListValue value) {
            copyOnWrite();
            ((com.google.protobuf.Value) this.instance).mergeListValue(value);
            return this;
        }

        public com.google.protobuf.Value.Builder clearListValue() {
            copyOnWrite();
            ((com.google.protobuf.Value) this.instance).clearListValue();
            return this;
        }
    }

    /* renamed from: com.google.protobuf.Value$1, reason: invalid class name */
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
        com.google.protobuf.Value.AnonymousClass1 anonymousClass1 = null;
        switch (com.google.protobuf.Value.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
            case 1:
                return new com.google.protobuf.Value();
            case 2:
                return new com.google.protobuf.Value.Builder(anonymousClass1);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001?\u0000\u00023\u0000\u0003Ȼ\u0000\u0004:\u0000\u0005<\u0000\u0006<\u0000", new java.lang.Object[]{"kind_", "kindCase_", com.google.protobuf.Struct.class, com.google.protobuf.ListValue.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.google.protobuf.Value> parser = PARSER;
                if (parser == null) {
                    synchronized (com.google.protobuf.Value.class) {
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
        com.google.protobuf.Value value = new com.google.protobuf.Value();
        DEFAULT_INSTANCE = value;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.google.protobuf.Value.class, value);
    }

    public static com.google.protobuf.Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.google.protobuf.Parser<com.google.protobuf.Value> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
