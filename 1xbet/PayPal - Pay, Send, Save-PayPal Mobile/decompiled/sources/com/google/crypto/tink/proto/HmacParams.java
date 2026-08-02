package com.google.crypto.tink.proto;

/* loaded from: classes4.dex */
public final class HmacParams extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<com.google.crypto.tink.proto.HmacParams, com.google.crypto.tink.proto.HmacParams.Builder> implements com.google.crypto.tink.proto.HmacParamsOrBuilder {
    private static final com.google.crypto.tink.proto.HmacParams DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.HmacParams> PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 2;
    private int hash_;
    private int tagSize_;

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
    public final /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLite
    public final /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder newBuilderForType() {
        return super.newBuilderForType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLite
    public final /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder toBuilder() {
        return super.toBuilder();
    }

    private HmacParams() {
    }

    @Override // com.google.crypto.tink.proto.HmacParamsOrBuilder
    public final int getHashValue() {
        return this.hash_;
    }

    @Override // com.google.crypto.tink.proto.HmacParamsOrBuilder
    public final com.google.crypto.tink.proto.HashType getHash() {
        com.google.crypto.tink.proto.HashType forNumber = com.google.crypto.tink.proto.HashType.forNumber(this.hash_);
        return forNumber == null ? com.google.crypto.tink.proto.HashType.UNRECOGNIZED : forNumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHashValue(int i) {
        this.hash_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHash(com.google.crypto.tink.proto.HashType hashType) {
        this.hash_ = hashType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHash() {
        this.hash_ = 0;
    }

    @Override // com.google.crypto.tink.proto.HmacParamsOrBuilder
    public final int getTagSize() {
        return this.tagSize_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTagSize(int i) {
        this.tagSize_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTagSize() {
        this.tagSize_ = 0;
    }

    public static com.google.crypto.tink.proto.HmacParams parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.HmacParams) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.crypto.tink.proto.HmacParams parseFrom(java.nio.ByteBuffer byteBuffer, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.HmacParams) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.HmacParams parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.HmacParams) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.google.crypto.tink.proto.HmacParams parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.HmacParams) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.HmacParams parseFrom(byte[] bArr) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.HmacParams) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.google.crypto.tink.proto.HmacParams parseFrom(byte[] bArr, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.HmacParams) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.HmacParams parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.google.crypto.tink.proto.HmacParams) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.crypto.tink.proto.HmacParams parseFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.proto.HmacParams) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.HmacParams parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.google.crypto.tink.proto.HmacParams) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.crypto.tink.proto.HmacParams parseDelimitedFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.proto.HmacParams) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.HmacParams parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
        return (com.google.crypto.tink.proto.HmacParams) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.google.crypto.tink.proto.HmacParams parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.proto.HmacParams) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.HmacParams.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.google.crypto.tink.proto.HmacParams.Builder newBuilder(com.google.crypto.tink.proto.HmacParams hmacParams) {
        return DEFAULT_INSTANCE.createBuilder(hmacParams);
    }

    public static final class Builder extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<com.google.crypto.tink.proto.HmacParams, com.google.crypto.tink.proto.HmacParams.Builder> implements com.google.crypto.tink.proto.HmacParamsOrBuilder {
        /* synthetic */ Builder(com.google.crypto.tink.proto.HmacParams.AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public final /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite build() {
            return super.build();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public final /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite buildPartial() {
            return super.buildPartial();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public final /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder clear() {
            return super.clear();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        /* renamed from: clone */
        public final /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder mo10407clone() {
            return super.mo10407clone();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        /* renamed from: clone */
        public final /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mo10407clone() {
            return super.mo10407clone();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder
        /* renamed from: clone */
        public final /* bridge */ /* synthetic */ java.lang.Object mo10407clone() throws java.lang.CloneNotSupportedException {
            return super.mo10407clone();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public final /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder
        public final /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder internalMergeFrom(com.google.crypto.tink.shaded.protobuf.AbstractMessageLite abstractMessageLite) {
            return super.internalMergeFrom((com.google.crypto.tink.proto.HmacParams.Builder) abstractMessageLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public final /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder mergeFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return super.mergeFrom(codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public final /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder mergeFrom(byte[] bArr, int i, int i2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            return super.mergeFrom(bArr, i, i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public final /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder mergeFrom(byte[] bArr, int i, int i2, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            return super.mergeFrom(bArr, i, i2, extensionRegistryLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public final /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            return super.mergeFrom(byteString);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public final /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            return super.mergeFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public final /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return super.mergeFrom(codedInputStream);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public final /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return super.mergeFrom(codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public final /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(com.google.crypto.tink.shaded.protobuf.MessageLite messageLite) {
            return super.mergeFrom(messageLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public final /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return super.mergeFrom(inputStream);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public final /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return super.mergeFrom(inputStream, extensionRegistryLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public final /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(byte[] bArr) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            return super.mergeFrom(bArr);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public final /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(byte[] bArr, int i, int i2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            return super.mergeFrom(bArr, i, i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public final /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(byte[] bArr, int i, int i2, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            return super.mergeFrom(bArr, i, i2, extensionRegistryLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public final /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(byte[] bArr, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            return super.mergeFrom(bArr, extensionRegistryLite);
        }

        private Builder() {
            super(com.google.crypto.tink.proto.HmacParams.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.proto.HmacParamsOrBuilder
        public final int getHashValue() {
            return ((com.google.crypto.tink.proto.HmacParams) this.instance).getHashValue();
        }

        public final com.google.crypto.tink.proto.HmacParams.Builder setHashValue(int i) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.HmacParams) this.instance).setHashValue(i);
            return this;
        }

        @Override // com.google.crypto.tink.proto.HmacParamsOrBuilder
        public final com.google.crypto.tink.proto.HashType getHash() {
            return ((com.google.crypto.tink.proto.HmacParams) this.instance).getHash();
        }

        public final com.google.crypto.tink.proto.HmacParams.Builder setHash(com.google.crypto.tink.proto.HashType hashType) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.HmacParams) this.instance).setHash(hashType);
            return this;
        }

        public final com.google.crypto.tink.proto.HmacParams.Builder clearHash() {
            copyOnWrite();
            ((com.google.crypto.tink.proto.HmacParams) this.instance).clearHash();
            return this;
        }

        @Override // com.google.crypto.tink.proto.HmacParamsOrBuilder
        public final int getTagSize() {
            return ((com.google.crypto.tink.proto.HmacParams) this.instance).getTagSize();
        }

        public final com.google.crypto.tink.proto.HmacParams.Builder setTagSize(int i) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.HmacParams) this.instance).setTagSize(i);
            return this;
        }

        public final com.google.crypto.tink.proto.HmacParams.Builder clearTagSize() {
            copyOnWrite();
            ((com.google.crypto.tink.proto.HmacParams) this.instance).clearTagSize();
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.proto.HmacParams$1, reason: invalid class name */
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
    public final java.lang.Object dynamicMethod(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.crypto.tink.shaded.protobuf.Parser parser;
        com.google.crypto.tink.proto.HmacParams.AnonymousClass1 anonymousClass1 = null;
        switch (com.google.crypto.tink.proto.HmacParams.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new com.google.crypto.tink.proto.HmacParams();
            case 2:
                return new com.google.crypto.tink.proto.HmacParams.Builder(anonymousClass1);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new java.lang.Object[]{"hash_", "tagSize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.HmacParams> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.google.crypto.tink.proto.HmacParams.class) {
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
        com.google.crypto.tink.proto.HmacParams hmacParams = new com.google.crypto.tink.proto.HmacParams();
        DEFAULT_INSTANCE = hmacParams;
        com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.registerDefaultInstance(com.google.crypto.tink.proto.HmacParams.class, hmacParams);
    }

    public static com.google.crypto.tink.proto.HmacParams getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.HmacParams> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
