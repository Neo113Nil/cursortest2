package com.google.protobuf;

/* loaded from: classes4.dex */
public final class BytesValue extends com.google.protobuf.GeneratedMessageLite<com.google.protobuf.BytesValue, com.google.protobuf.BytesValue.Builder> implements com.google.protobuf.BytesValueOrBuilder {
    private static final com.google.protobuf.BytesValue DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<com.google.protobuf.BytesValue> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString value_ = com.google.protobuf.ByteString.EMPTY;

    private BytesValue() {
    }

    @Override // com.google.protobuf.BytesValueOrBuilder
    public com.google.protobuf.ByteString getValue() {
        return this.value_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(com.google.protobuf.ByteString value) {
        value.getClass();
        this.value_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = getDefaultInstance().getValue();
    }

    public static com.google.protobuf.BytesValue parseFrom(java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.BytesValue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static com.google.protobuf.BytesValue parseFrom(java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.BytesValue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static com.google.protobuf.BytesValue parseFrom(com.google.protobuf.ByteString data) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.BytesValue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static com.google.protobuf.BytesValue parseFrom(com.google.protobuf.ByteString data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.BytesValue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static com.google.protobuf.BytesValue parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.BytesValue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static com.google.protobuf.BytesValue parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.BytesValue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static com.google.protobuf.BytesValue parseFrom(java.io.InputStream input) throws java.io.IOException {
        return (com.google.protobuf.BytesValue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static com.google.protobuf.BytesValue parseFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (com.google.protobuf.BytesValue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static com.google.protobuf.BytesValue parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
        return (com.google.protobuf.BytesValue) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static com.google.protobuf.BytesValue parseDelimitedFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (com.google.protobuf.BytesValue) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static com.google.protobuf.BytesValue parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
        return (com.google.protobuf.BytesValue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static com.google.protobuf.BytesValue parseFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (com.google.protobuf.BytesValue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static com.google.protobuf.BytesValue.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.google.protobuf.BytesValue.Builder newBuilder(com.google.protobuf.BytesValue prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.google.protobuf.BytesValue, com.google.protobuf.BytesValue.Builder> implements com.google.protobuf.BytesValueOrBuilder {
        /* synthetic */ Builder(com.google.protobuf.BytesValue.AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(com.google.protobuf.BytesValue.DEFAULT_INSTANCE);
        }

        @Override // com.google.protobuf.BytesValueOrBuilder
        public com.google.protobuf.ByteString getValue() {
            return ((com.google.protobuf.BytesValue) this.instance).getValue();
        }

        public com.google.protobuf.BytesValue.Builder setValue(com.google.protobuf.ByteString value) {
            copyOnWrite();
            ((com.google.protobuf.BytesValue) this.instance).setValue(value);
            return this;
        }

        public com.google.protobuf.BytesValue.Builder clearValue() {
            copyOnWrite();
            ((com.google.protobuf.BytesValue) this.instance).clearValue();
            return this;
        }
    }

    /* renamed from: com.google.protobuf.BytesValue$1, reason: invalid class name */
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
        com.google.protobuf.BytesValue.AnonymousClass1 anonymousClass1 = null;
        switch (com.google.protobuf.BytesValue.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
            case 1:
                return new com.google.protobuf.BytesValue();
            case 2:
                return new com.google.protobuf.BytesValue.Builder(anonymousClass1);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new java.lang.Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.google.protobuf.BytesValue> parser = PARSER;
                if (parser == null) {
                    synchronized (com.google.protobuf.BytesValue.class) {
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
        com.google.protobuf.BytesValue bytesValue = new com.google.protobuf.BytesValue();
        DEFAULT_INSTANCE = bytesValue;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.google.protobuf.BytesValue.class, bytesValue);
    }

    public static com.google.protobuf.BytesValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.google.protobuf.BytesValue of(com.google.protobuf.ByteString value) {
        return newBuilder().setValue(value).build();
    }

    public static com.google.protobuf.Parser<com.google.protobuf.BytesValue> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
