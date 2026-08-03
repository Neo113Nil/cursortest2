package com.google.protobuf;

/* loaded from: classes4.dex */
public final class FieldMask extends com.google.protobuf.GeneratedMessageLite<com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder> implements com.google.protobuf.FieldMaskOrBuilder {
    private static final com.google.protobuf.FieldMask DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<com.google.protobuf.FieldMask> PARSER = null;
    public static final int PATHS_FIELD_NUMBER = 1;
    private com.google.protobuf.Internal.ProtobufList<java.lang.String> paths_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

    private FieldMask() {
    }

    @Override // com.google.protobuf.FieldMaskOrBuilder
    public java.util.List<java.lang.String> getPathsList() {
        return this.paths_;
    }

    @Override // com.google.protobuf.FieldMaskOrBuilder
    public int getPathsCount() {
        return this.paths_.size();
    }

    @Override // com.google.protobuf.FieldMaskOrBuilder
    public java.lang.String getPaths(int index) {
        return this.paths_.get(index);
    }

    @Override // com.google.protobuf.FieldMaskOrBuilder
    public com.google.protobuf.ByteString getPathsBytes(int index) {
        return com.google.protobuf.ByteString.copyFromUtf8(this.paths_.get(index));
    }

    private void ensurePathsIsMutable() {
        com.google.protobuf.Internal.ProtobufList<java.lang.String> protobufList = this.paths_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.paths_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPaths(int index, java.lang.String value) {
        value.getClass();
        ensurePathsIsMutable();
        this.paths_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPaths(java.lang.String value) {
        value.getClass();
        ensurePathsIsMutable();
        this.paths_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPaths(java.lang.Iterable<java.lang.String> values) {
        ensurePathsIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) values, (java.util.List) this.paths_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPaths() {
        this.paths_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPathsBytes(com.google.protobuf.ByteString value) {
        checkByteStringIsUtf8(value);
        ensurePathsIsMutable();
        this.paths_.add(value.toStringUtf8());
    }

    public static com.google.protobuf.FieldMask parseFrom(java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.FieldMask) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static com.google.protobuf.FieldMask parseFrom(java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.FieldMask) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static com.google.protobuf.FieldMask parseFrom(com.google.protobuf.ByteString data) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.FieldMask) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static com.google.protobuf.FieldMask parseFrom(com.google.protobuf.ByteString data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.FieldMask) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static com.google.protobuf.FieldMask parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.FieldMask) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static com.google.protobuf.FieldMask parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.FieldMask) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static com.google.protobuf.FieldMask parseFrom(java.io.InputStream input) throws java.io.IOException {
        return (com.google.protobuf.FieldMask) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static com.google.protobuf.FieldMask parseFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (com.google.protobuf.FieldMask) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static com.google.protobuf.FieldMask parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
        return (com.google.protobuf.FieldMask) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static com.google.protobuf.FieldMask parseDelimitedFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (com.google.protobuf.FieldMask) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static com.google.protobuf.FieldMask parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
        return (com.google.protobuf.FieldMask) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static com.google.protobuf.FieldMask parseFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (com.google.protobuf.FieldMask) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static com.google.protobuf.FieldMask.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.google.protobuf.FieldMask.Builder newBuilder(com.google.protobuf.FieldMask prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder> implements com.google.protobuf.FieldMaskOrBuilder {
        /* synthetic */ Builder(com.google.protobuf.FieldMask.AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(com.google.protobuf.FieldMask.DEFAULT_INSTANCE);
        }

        @Override // com.google.protobuf.FieldMaskOrBuilder
        public java.util.List<java.lang.String> getPathsList() {
            return java.util.Collections.unmodifiableList(((com.google.protobuf.FieldMask) this.instance).getPathsList());
        }

        @Override // com.google.protobuf.FieldMaskOrBuilder
        public int getPathsCount() {
            return ((com.google.protobuf.FieldMask) this.instance).getPathsCount();
        }

        @Override // com.google.protobuf.FieldMaskOrBuilder
        public java.lang.String getPaths(int index) {
            return ((com.google.protobuf.FieldMask) this.instance).getPaths(index);
        }

        @Override // com.google.protobuf.FieldMaskOrBuilder
        public com.google.protobuf.ByteString getPathsBytes(int index) {
            return ((com.google.protobuf.FieldMask) this.instance).getPathsBytes(index);
        }

        public com.google.protobuf.FieldMask.Builder setPaths(int index, java.lang.String value) {
            copyOnWrite();
            ((com.google.protobuf.FieldMask) this.instance).setPaths(index, value);
            return this;
        }

        public com.google.protobuf.FieldMask.Builder addPaths(java.lang.String value) {
            copyOnWrite();
            ((com.google.protobuf.FieldMask) this.instance).addPaths(value);
            return this;
        }

        public com.google.protobuf.FieldMask.Builder addAllPaths(java.lang.Iterable<java.lang.String> values) {
            copyOnWrite();
            ((com.google.protobuf.FieldMask) this.instance).addAllPaths(values);
            return this;
        }

        public com.google.protobuf.FieldMask.Builder clearPaths() {
            copyOnWrite();
            ((com.google.protobuf.FieldMask) this.instance).clearPaths();
            return this;
        }

        public com.google.protobuf.FieldMask.Builder addPathsBytes(com.google.protobuf.ByteString value) {
            copyOnWrite();
            ((com.google.protobuf.FieldMask) this.instance).addPathsBytes(value);
            return this;
        }
    }

    /* renamed from: com.google.protobuf.FieldMask$1, reason: invalid class name */
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
        com.google.protobuf.FieldMask.AnonymousClass1 anonymousClass1 = null;
        switch (com.google.protobuf.FieldMask.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
            case 1:
                return new com.google.protobuf.FieldMask();
            case 2:
                return new com.google.protobuf.FieldMask.Builder(anonymousClass1);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new java.lang.Object[]{"paths_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.google.protobuf.FieldMask> parser = PARSER;
                if (parser == null) {
                    synchronized (com.google.protobuf.FieldMask.class) {
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
        com.google.protobuf.FieldMask fieldMask = new com.google.protobuf.FieldMask();
        DEFAULT_INSTANCE = fieldMask;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.google.protobuf.FieldMask.class, fieldMask);
    }

    public static com.google.protobuf.FieldMask getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.google.protobuf.Parser<com.google.protobuf.FieldMask> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
