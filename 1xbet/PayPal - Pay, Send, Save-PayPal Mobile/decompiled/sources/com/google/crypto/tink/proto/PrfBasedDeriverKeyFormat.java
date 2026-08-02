package com.google.crypto.tink.proto;

/* loaded from: classes9.dex */
public final class PrfBasedDeriverKeyFormat extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat, com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat.Builder> implements com.google.crypto.tink.proto.PrfBasedDeriverKeyFormatOrBuilder {
    private static final com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat> PARSER = null;
    public static final int PRF_KEY_TEMPLATE_FIELD_NUMBER = 1;
    private int bitField0_;
    private com.google.crypto.tink.proto.PrfBasedDeriverParams params_;
    private com.google.crypto.tink.proto.KeyTemplate prfKeyTemplate_;

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

    private PrfBasedDeriverKeyFormat() {
    }

    @Override // com.google.crypto.tink.proto.PrfBasedDeriverKeyFormatOrBuilder
    public final boolean hasPrfKeyTemplate() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.crypto.tink.proto.PrfBasedDeriverKeyFormatOrBuilder
    public final com.google.crypto.tink.proto.KeyTemplate getPrfKeyTemplate() {
        com.google.crypto.tink.proto.KeyTemplate keyTemplate = this.prfKeyTemplate_;
        return keyTemplate == null ? com.google.crypto.tink.proto.KeyTemplate.getDefaultInstance() : keyTemplate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrfKeyTemplate(com.google.crypto.tink.proto.KeyTemplate keyTemplate) {
        this.prfKeyTemplate_ = keyTemplate;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePrfKeyTemplate(com.google.crypto.tink.proto.KeyTemplate keyTemplate) {
        com.google.crypto.tink.proto.KeyTemplate keyTemplate2 = this.prfKeyTemplate_;
        if (keyTemplate2 != null && keyTemplate2 != com.google.crypto.tink.proto.KeyTemplate.getDefaultInstance()) {
            this.prfKeyTemplate_ = com.google.crypto.tink.proto.KeyTemplate.newBuilder(this.prfKeyTemplate_).mergeFrom((com.google.crypto.tink.proto.KeyTemplate.Builder) keyTemplate).buildPartial();
        } else {
            this.prfKeyTemplate_ = keyTemplate;
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrfKeyTemplate() {
        this.prfKeyTemplate_ = null;
        this.bitField0_ &= -2;
    }

    @Override // com.google.crypto.tink.proto.PrfBasedDeriverKeyFormatOrBuilder
    public final boolean hasParams() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.crypto.tink.proto.PrfBasedDeriverKeyFormatOrBuilder
    public final com.google.crypto.tink.proto.PrfBasedDeriverParams getParams() {
        com.google.crypto.tink.proto.PrfBasedDeriverParams prfBasedDeriverParams = this.params_;
        return prfBasedDeriverParams == null ? com.google.crypto.tink.proto.PrfBasedDeriverParams.getDefaultInstance() : prfBasedDeriverParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParams(com.google.crypto.tink.proto.PrfBasedDeriverParams prfBasedDeriverParams) {
        this.params_ = prfBasedDeriverParams;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParams(com.google.crypto.tink.proto.PrfBasedDeriverParams prfBasedDeriverParams) {
        com.google.crypto.tink.proto.PrfBasedDeriverParams prfBasedDeriverParams2 = this.params_;
        if (prfBasedDeriverParams2 != null && prfBasedDeriverParams2 != com.google.crypto.tink.proto.PrfBasedDeriverParams.getDefaultInstance()) {
            this.params_ = com.google.crypto.tink.proto.PrfBasedDeriverParams.newBuilder(this.params_).mergeFrom((com.google.crypto.tink.proto.PrfBasedDeriverParams.Builder) prfBasedDeriverParams).buildPartial();
        } else {
            this.params_ = prfBasedDeriverParams;
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParams() {
        this.params_ = null;
        this.bitField0_ &= -3;
    }

    public static com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat parseFrom(java.nio.ByteBuffer byteBuffer, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat parseFrom(byte[] bArr) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat parseFrom(byte[] bArr, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat parseFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat parseDelimitedFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
        return (com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat.Builder newBuilder(com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat prfBasedDeriverKeyFormat) {
        return DEFAULT_INSTANCE.createBuilder(prfBasedDeriverKeyFormat);
    }

    public static final class Builder extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat, com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat.Builder> implements com.google.crypto.tink.proto.PrfBasedDeriverKeyFormatOrBuilder {
        /* synthetic */ Builder(com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat.AnonymousClass1 anonymousClass1) {
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
            return super.internalMergeFrom((com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat.Builder) abstractMessageLite);
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
            super(com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.proto.PrfBasedDeriverKeyFormatOrBuilder
        public final boolean hasPrfKeyTemplate() {
            return ((com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat) this.instance).hasPrfKeyTemplate();
        }

        @Override // com.google.crypto.tink.proto.PrfBasedDeriverKeyFormatOrBuilder
        public final com.google.crypto.tink.proto.KeyTemplate getPrfKeyTemplate() {
            return ((com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat) this.instance).getPrfKeyTemplate();
        }

        public final com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat.Builder setPrfKeyTemplate(com.google.crypto.tink.proto.KeyTemplate keyTemplate) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat) this.instance).setPrfKeyTemplate(keyTemplate);
            return this;
        }

        public final com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat.Builder setPrfKeyTemplate(com.google.crypto.tink.proto.KeyTemplate.Builder builder) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat) this.instance).setPrfKeyTemplate(builder.build());
            return this;
        }

        public final com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat.Builder mergePrfKeyTemplate(com.google.crypto.tink.proto.KeyTemplate keyTemplate) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat) this.instance).mergePrfKeyTemplate(keyTemplate);
            return this;
        }

        public final com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat.Builder clearPrfKeyTemplate() {
            copyOnWrite();
            ((com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat) this.instance).clearPrfKeyTemplate();
            return this;
        }

        @Override // com.google.crypto.tink.proto.PrfBasedDeriverKeyFormatOrBuilder
        public final boolean hasParams() {
            return ((com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat) this.instance).hasParams();
        }

        @Override // com.google.crypto.tink.proto.PrfBasedDeriverKeyFormatOrBuilder
        public final com.google.crypto.tink.proto.PrfBasedDeriverParams getParams() {
            return ((com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat) this.instance).getParams();
        }

        public final com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat.Builder setParams(com.google.crypto.tink.proto.PrfBasedDeriverParams prfBasedDeriverParams) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat) this.instance).setParams(prfBasedDeriverParams);
            return this;
        }

        public final com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat.Builder setParams(com.google.crypto.tink.proto.PrfBasedDeriverParams.Builder builder) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat) this.instance).setParams(builder.build());
            return this;
        }

        public final com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat.Builder mergeParams(com.google.crypto.tink.proto.PrfBasedDeriverParams prfBasedDeriverParams) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat) this.instance).mergeParams(prfBasedDeriverParams);
            return this;
        }

        public final com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat.Builder clearParams() {
            copyOnWrite();
            ((com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat) this.instance).clearParams();
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat$1, reason: invalid class name */
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
        com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat.AnonymousClass1 anonymousClass1 = null;
        switch (com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat();
            case 2:
                return new com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat.Builder(anonymousClass1);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new java.lang.Object[]{"bitField0_", "prfKeyTemplate_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat.class) {
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
        com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat prfBasedDeriverKeyFormat = new com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat();
        DEFAULT_INSTANCE = prfBasedDeriverKeyFormat;
        com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.registerDefaultInstance(com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat.class, prfBasedDeriverKeyFormat);
    }

    public static com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
