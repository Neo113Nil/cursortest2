package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes9.dex */
public final class Option extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<com.google.crypto.tink.shaded.protobuf.Option, com.google.crypto.tink.shaded.protobuf.Option.Builder> implements com.google.crypto.tink.shaded.protobuf.OptionOrBuilder {
    private static final com.google.crypto.tink.shaded.protobuf.Option DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.Option> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int bitField0_;
    private java.lang.String name_ = "";
    private com.google.crypto.tink.shaded.protobuf.Any value_;

    private Option() {
    }

    @Override // com.google.crypto.tink.shaded.protobuf.OptionOrBuilder
    public final java.lang.String getName() {
        return this.name_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.OptionOrBuilder
    public final com.google.crypto.tink.shaded.protobuf.ByteString getNameBytes() {
        return com.google.crypto.tink.shaded.protobuf.ByteString.copyFromUtf8(this.name_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(java.lang.String str) {
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(com.google.crypto.tink.shaded.protobuf.ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.OptionOrBuilder
    public final boolean hasValue() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.OptionOrBuilder
    public final com.google.crypto.tink.shaded.protobuf.Any getValue() {
        com.google.crypto.tink.shaded.protobuf.Any any = this.value_;
        return any == null ? com.google.crypto.tink.shaded.protobuf.Any.getDefaultInstance() : any;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(com.google.crypto.tink.shaded.protobuf.Any any) {
        this.value_ = any;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeValue(com.google.crypto.tink.shaded.protobuf.Any any) {
        com.google.crypto.tink.shaded.protobuf.Any any2 = this.value_;
        if (any2 != null && any2 != com.google.crypto.tink.shaded.protobuf.Any.getDefaultInstance()) {
            this.value_ = com.google.crypto.tink.shaded.protobuf.Any.newBuilder(this.value_).mergeFrom((com.google.crypto.tink.shaded.protobuf.Any.Builder) any).buildPartial();
        } else {
            this.value_ = any;
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = null;
        this.bitField0_ &= -2;
    }

    public static com.google.crypto.tink.shaded.protobuf.Option parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.shaded.protobuf.Option) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.crypto.tink.shaded.protobuf.Option parseFrom(java.nio.ByteBuffer byteBuffer, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.shaded.protobuf.Option) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.google.crypto.tink.shaded.protobuf.Option parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.shaded.protobuf.Option) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.google.crypto.tink.shaded.protobuf.Option parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.shaded.protobuf.Option) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.google.crypto.tink.shaded.protobuf.Option parseFrom(byte[] bArr) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.shaded.protobuf.Option) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.google.crypto.tink.shaded.protobuf.Option parseFrom(byte[] bArr, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.shaded.protobuf.Option) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.google.crypto.tink.shaded.protobuf.Option parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.google.crypto.tink.shaded.protobuf.Option) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.crypto.tink.shaded.protobuf.Option parseFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.shaded.protobuf.Option) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.shaded.protobuf.Option parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.google.crypto.tink.shaded.protobuf.Option) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.crypto.tink.shaded.protobuf.Option parseDelimitedFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.shaded.protobuf.Option) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.shaded.protobuf.Option parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
        return (com.google.crypto.tink.shaded.protobuf.Option) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.google.crypto.tink.shaded.protobuf.Option parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.shaded.protobuf.Option) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.shaded.protobuf.Option.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.google.crypto.tink.shaded.protobuf.Option.Builder newBuilder(com.google.crypto.tink.shaded.protobuf.Option option) {
        return DEFAULT_INSTANCE.createBuilder(option);
    }

    public static final class Builder extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<com.google.crypto.tink.shaded.protobuf.Option, com.google.crypto.tink.shaded.protobuf.Option.Builder> implements com.google.crypto.tink.shaded.protobuf.OptionOrBuilder {
        /* synthetic */ Builder(com.google.crypto.tink.shaded.protobuf.Option.AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(com.google.crypto.tink.shaded.protobuf.Option.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.OptionOrBuilder
        public final java.lang.String getName() {
            return ((com.google.crypto.tink.shaded.protobuf.Option) this.instance).getName();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.OptionOrBuilder
        public final com.google.crypto.tink.shaded.protobuf.ByteString getNameBytes() {
            return ((com.google.crypto.tink.shaded.protobuf.Option) this.instance).getNameBytes();
        }

        public final com.google.crypto.tink.shaded.protobuf.Option.Builder setName(java.lang.String str) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Option) this.instance).setName(str);
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Option.Builder clearName() {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Option) this.instance).clearName();
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Option.Builder setNameBytes(com.google.crypto.tink.shaded.protobuf.ByteString byteString) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Option) this.instance).setNameBytes(byteString);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.OptionOrBuilder
        public final boolean hasValue() {
            return ((com.google.crypto.tink.shaded.protobuf.Option) this.instance).hasValue();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.OptionOrBuilder
        public final com.google.crypto.tink.shaded.protobuf.Any getValue() {
            return ((com.google.crypto.tink.shaded.protobuf.Option) this.instance).getValue();
        }

        public final com.google.crypto.tink.shaded.protobuf.Option.Builder setValue(com.google.crypto.tink.shaded.protobuf.Any any) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Option) this.instance).setValue(any);
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Option.Builder setValue(com.google.crypto.tink.shaded.protobuf.Any.Builder builder) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Option) this.instance).setValue(builder.build());
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Option.Builder mergeValue(com.google.crypto.tink.shaded.protobuf.Any any) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Option) this.instance).mergeValue(any);
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Option.Builder clearValue() {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Option) this.instance).clearValue();
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.Option$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final java.lang.Object dynamicMethod(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.crypto.tink.shaded.protobuf.Parser parser;
        com.google.crypto.tink.shaded.protobuf.Option.AnonymousClass1 anonymousClass1 = null;
        switch (com.google.crypto.tink.shaded.protobuf.Option.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new com.google.crypto.tink.shaded.protobuf.Option();
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.Option.Builder(anonymousClass1);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new java.lang.Object[]{"bitField0_", "name_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.Option> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.google.crypto.tink.shaded.protobuf.Option.class) {
                    parser = PARSER;
                    if (parser == null) {
                        parser = new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
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
        com.google.crypto.tink.shaded.protobuf.Option option = new com.google.crypto.tink.shaded.protobuf.Option();
        DEFAULT_INSTANCE = option;
        com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.registerDefaultInstance(com.google.crypto.tink.shaded.protobuf.Option.class, option);
    }

    public static com.google.crypto.tink.shaded.protobuf.Option getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.Option> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
