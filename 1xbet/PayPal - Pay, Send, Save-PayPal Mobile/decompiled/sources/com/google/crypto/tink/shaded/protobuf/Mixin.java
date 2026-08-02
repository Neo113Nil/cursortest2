package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes9.dex */
public final class Mixin extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<com.google.crypto.tink.shaded.protobuf.Mixin, com.google.crypto.tink.shaded.protobuf.Mixin.Builder> implements com.google.crypto.tink.shaded.protobuf.MixinOrBuilder {
    private static final com.google.crypto.tink.shaded.protobuf.Mixin DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.Mixin> PARSER = null;
    public static final int ROOT_FIELD_NUMBER = 2;
    private java.lang.String name_ = "";
    private java.lang.String root_ = "";

    private Mixin() {
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MixinOrBuilder
    public final java.lang.String getName() {
        return this.name_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MixinOrBuilder
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

    @Override // com.google.crypto.tink.shaded.protobuf.MixinOrBuilder
    public final java.lang.String getRoot() {
        return this.root_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MixinOrBuilder
    public final com.google.crypto.tink.shaded.protobuf.ByteString getRootBytes() {
        return com.google.crypto.tink.shaded.protobuf.ByteString.copyFromUtf8(this.root_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoot(java.lang.String str) {
        this.root_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoot() {
        this.root_ = getDefaultInstance().getRoot();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRootBytes(com.google.crypto.tink.shaded.protobuf.ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        this.root_ = byteString.toStringUtf8();
    }

    public static com.google.crypto.tink.shaded.protobuf.Mixin parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.shaded.protobuf.Mixin) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.crypto.tink.shaded.protobuf.Mixin parseFrom(java.nio.ByteBuffer byteBuffer, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.shaded.protobuf.Mixin) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.google.crypto.tink.shaded.protobuf.Mixin parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.shaded.protobuf.Mixin) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.google.crypto.tink.shaded.protobuf.Mixin parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.shaded.protobuf.Mixin) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.google.crypto.tink.shaded.protobuf.Mixin parseFrom(byte[] bArr) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.shaded.protobuf.Mixin) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.google.crypto.tink.shaded.protobuf.Mixin parseFrom(byte[] bArr, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.shaded.protobuf.Mixin) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.google.crypto.tink.shaded.protobuf.Mixin parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.google.crypto.tink.shaded.protobuf.Mixin) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.crypto.tink.shaded.protobuf.Mixin parseFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.shaded.protobuf.Mixin) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.shaded.protobuf.Mixin parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.google.crypto.tink.shaded.protobuf.Mixin) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.crypto.tink.shaded.protobuf.Mixin parseDelimitedFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.shaded.protobuf.Mixin) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.shaded.protobuf.Mixin parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
        return (com.google.crypto.tink.shaded.protobuf.Mixin) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.google.crypto.tink.shaded.protobuf.Mixin parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.shaded.protobuf.Mixin) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.shaded.protobuf.Mixin.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.google.crypto.tink.shaded.protobuf.Mixin.Builder newBuilder(com.google.crypto.tink.shaded.protobuf.Mixin mixin) {
        return DEFAULT_INSTANCE.createBuilder(mixin);
    }

    public static final class Builder extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<com.google.crypto.tink.shaded.protobuf.Mixin, com.google.crypto.tink.shaded.protobuf.Mixin.Builder> implements com.google.crypto.tink.shaded.protobuf.MixinOrBuilder {
        /* synthetic */ Builder(com.google.crypto.tink.shaded.protobuf.Mixin.AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(com.google.crypto.tink.shaded.protobuf.Mixin.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MixinOrBuilder
        public final java.lang.String getName() {
            return ((com.google.crypto.tink.shaded.protobuf.Mixin) this.instance).getName();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MixinOrBuilder
        public final com.google.crypto.tink.shaded.protobuf.ByteString getNameBytes() {
            return ((com.google.crypto.tink.shaded.protobuf.Mixin) this.instance).getNameBytes();
        }

        public final com.google.crypto.tink.shaded.protobuf.Mixin.Builder setName(java.lang.String str) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Mixin) this.instance).setName(str);
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Mixin.Builder clearName() {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Mixin) this.instance).clearName();
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Mixin.Builder setNameBytes(com.google.crypto.tink.shaded.protobuf.ByteString byteString) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Mixin) this.instance).setNameBytes(byteString);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MixinOrBuilder
        public final java.lang.String getRoot() {
            return ((com.google.crypto.tink.shaded.protobuf.Mixin) this.instance).getRoot();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MixinOrBuilder
        public final com.google.crypto.tink.shaded.protobuf.ByteString getRootBytes() {
            return ((com.google.crypto.tink.shaded.protobuf.Mixin) this.instance).getRootBytes();
        }

        public final com.google.crypto.tink.shaded.protobuf.Mixin.Builder setRoot(java.lang.String str) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Mixin) this.instance).setRoot(str);
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Mixin.Builder clearRoot() {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Mixin) this.instance).clearRoot();
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Mixin.Builder setRootBytes(com.google.crypto.tink.shaded.protobuf.ByteString byteString) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Mixin) this.instance).setRootBytes(byteString);
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.Mixin$1, reason: invalid class name */
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
        com.google.crypto.tink.shaded.protobuf.Mixin.AnonymousClass1 anonymousClass1 = null;
        switch (com.google.crypto.tink.shaded.protobuf.Mixin.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new com.google.crypto.tink.shaded.protobuf.Mixin();
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.Mixin.Builder(anonymousClass1);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new java.lang.Object[]{"name_", "root_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.Mixin> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.google.crypto.tink.shaded.protobuf.Mixin.class) {
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
        com.google.crypto.tink.shaded.protobuf.Mixin mixin = new com.google.crypto.tink.shaded.protobuf.Mixin();
        DEFAULT_INSTANCE = mixin;
        com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.registerDefaultInstance(com.google.crypto.tink.shaded.protobuf.Mixin.class, mixin);
    }

    public static com.google.crypto.tink.shaded.protobuf.Mixin getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.Mixin> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
