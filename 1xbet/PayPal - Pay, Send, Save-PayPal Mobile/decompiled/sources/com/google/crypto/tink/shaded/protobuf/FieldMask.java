package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes9.dex */
public final class FieldMask extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<com.google.crypto.tink.shaded.protobuf.FieldMask, com.google.crypto.tink.shaded.protobuf.FieldMask.Builder> implements com.google.crypto.tink.shaded.protobuf.FieldMaskOrBuilder {
    private static final com.google.crypto.tink.shaded.protobuf.FieldMask DEFAULT_INSTANCE;
    private static volatile com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.FieldMask> PARSER = null;
    public static final int PATHS_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<java.lang.String> paths_ = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.emptyProtobufList();

    private FieldMask() {
    }

    @Override // com.google.crypto.tink.shaded.protobuf.FieldMaskOrBuilder
    public final java.util.List<java.lang.String> getPathsList() {
        return this.paths_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.FieldMaskOrBuilder
    public final int getPathsCount() {
        return this.paths_.size();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.FieldMaskOrBuilder
    public final java.lang.String getPaths(int i) {
        return this.paths_.get(i);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.FieldMaskOrBuilder
    public final com.google.crypto.tink.shaded.protobuf.ByteString getPathsBytes(int i) {
        return com.google.crypto.tink.shaded.protobuf.ByteString.copyFromUtf8(this.paths_.get(i));
    }

    private void ensurePathsIsMutable() {
        com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<java.lang.String> protobufList = this.paths_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.paths_ = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPaths(int i, java.lang.String str) {
        ensurePathsIsMutable();
        this.paths_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPaths(java.lang.String str) {
        ensurePathsIsMutable();
        this.paths_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPaths(java.lang.Iterable<java.lang.String> iterable) {
        ensurePathsIsMutable();
        com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.addAll(iterable, this.paths_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPaths() {
        this.paths_ = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPathsBytes(com.google.crypto.tink.shaded.protobuf.ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        ensurePathsIsMutable();
        this.paths_.add(byteString.toStringUtf8());
    }

    public static com.google.crypto.tink.shaded.protobuf.FieldMask parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.shaded.protobuf.FieldMask) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.crypto.tink.shaded.protobuf.FieldMask parseFrom(java.nio.ByteBuffer byteBuffer, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.shaded.protobuf.FieldMask) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.google.crypto.tink.shaded.protobuf.FieldMask parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.shaded.protobuf.FieldMask) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.google.crypto.tink.shaded.protobuf.FieldMask parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.shaded.protobuf.FieldMask) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.google.crypto.tink.shaded.protobuf.FieldMask parseFrom(byte[] bArr) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.shaded.protobuf.FieldMask) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.google.crypto.tink.shaded.protobuf.FieldMask parseFrom(byte[] bArr, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.shaded.protobuf.FieldMask) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.google.crypto.tink.shaded.protobuf.FieldMask parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.google.crypto.tink.shaded.protobuf.FieldMask) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.crypto.tink.shaded.protobuf.FieldMask parseFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.shaded.protobuf.FieldMask) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.shaded.protobuf.FieldMask parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.google.crypto.tink.shaded.protobuf.FieldMask) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.crypto.tink.shaded.protobuf.FieldMask parseDelimitedFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.shaded.protobuf.FieldMask) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.shaded.protobuf.FieldMask parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
        return (com.google.crypto.tink.shaded.protobuf.FieldMask) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.google.crypto.tink.shaded.protobuf.FieldMask parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.shaded.protobuf.FieldMask) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.shaded.protobuf.FieldMask.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.google.crypto.tink.shaded.protobuf.FieldMask.Builder newBuilder(com.google.crypto.tink.shaded.protobuf.FieldMask fieldMask) {
        return DEFAULT_INSTANCE.createBuilder(fieldMask);
    }

    public static final class Builder extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<com.google.crypto.tink.shaded.protobuf.FieldMask, com.google.crypto.tink.shaded.protobuf.FieldMask.Builder> implements com.google.crypto.tink.shaded.protobuf.FieldMaskOrBuilder {
        /* synthetic */ Builder(com.google.crypto.tink.shaded.protobuf.FieldMask.AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(com.google.crypto.tink.shaded.protobuf.FieldMask.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldMaskOrBuilder
        public final java.util.List<java.lang.String> getPathsList() {
            return java.util.Collections.unmodifiableList(((com.google.crypto.tink.shaded.protobuf.FieldMask) this.instance).getPathsList());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldMaskOrBuilder
        public final int getPathsCount() {
            return ((com.google.crypto.tink.shaded.protobuf.FieldMask) this.instance).getPathsCount();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldMaskOrBuilder
        public final java.lang.String getPaths(int i) {
            return ((com.google.crypto.tink.shaded.protobuf.FieldMask) this.instance).getPaths(i);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldMaskOrBuilder
        public final com.google.crypto.tink.shaded.protobuf.ByteString getPathsBytes(int i) {
            return ((com.google.crypto.tink.shaded.protobuf.FieldMask) this.instance).getPathsBytes(i);
        }

        public final com.google.crypto.tink.shaded.protobuf.FieldMask.Builder setPaths(int i, java.lang.String str) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.FieldMask) this.instance).setPaths(i, str);
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.FieldMask.Builder addPaths(java.lang.String str) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.FieldMask) this.instance).addPaths(str);
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.FieldMask.Builder addAllPaths(java.lang.Iterable<java.lang.String> iterable) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.FieldMask) this.instance).addAllPaths(iterable);
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.FieldMask.Builder clearPaths() {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.FieldMask) this.instance).clearPaths();
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.FieldMask.Builder addPathsBytes(com.google.crypto.tink.shaded.protobuf.ByteString byteString) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.FieldMask) this.instance).addPathsBytes(byteString);
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.FieldMask$1, reason: invalid class name */
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
        com.google.crypto.tink.shaded.protobuf.FieldMask.AnonymousClass1 anonymousClass1 = null;
        switch (com.google.crypto.tink.shaded.protobuf.FieldMask.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new com.google.crypto.tink.shaded.protobuf.FieldMask();
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.FieldMask.Builder(anonymousClass1);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new java.lang.Object[]{"paths_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.FieldMask> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.google.crypto.tink.shaded.protobuf.FieldMask.class) {
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
        com.google.crypto.tink.shaded.protobuf.FieldMask fieldMask = new com.google.crypto.tink.shaded.protobuf.FieldMask();
        DEFAULT_INSTANCE = fieldMask;
        com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.registerDefaultInstance(com.google.crypto.tink.shaded.protobuf.FieldMask.class, fieldMask);
    }

    public static com.google.crypto.tink.shaded.protobuf.FieldMask getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.FieldMask> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
