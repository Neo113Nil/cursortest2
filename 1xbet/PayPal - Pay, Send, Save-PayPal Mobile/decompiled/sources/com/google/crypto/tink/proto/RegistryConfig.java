package com.google.crypto.tink.proto;

@java.lang.Deprecated
/* loaded from: classes4.dex */
public final class RegistryConfig extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<com.google.crypto.tink.proto.RegistryConfig, com.google.crypto.tink.proto.RegistryConfig.Builder> implements com.google.crypto.tink.proto.RegistryConfigOrBuilder {
    public static final int CONFIG_NAME_FIELD_NUMBER = 1;
    private static final com.google.crypto.tink.proto.RegistryConfig DEFAULT_INSTANCE;
    public static final int ENTRY_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.RegistryConfig> PARSER;
    private java.lang.String configName_ = "";
    private com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<com.google.crypto.tink.proto.KeyTypeEntry> entry_ = emptyProtobufList();

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

    private RegistryConfig() {
    }

    @Override // com.google.crypto.tink.proto.RegistryConfigOrBuilder
    public final java.lang.String getConfigName() {
        return this.configName_;
    }

    @Override // com.google.crypto.tink.proto.RegistryConfigOrBuilder
    public final com.google.crypto.tink.shaded.protobuf.ByteString getConfigNameBytes() {
        return com.google.crypto.tink.shaded.protobuf.ByteString.copyFromUtf8(this.configName_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConfigName(java.lang.String str) {
        this.configName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConfigName() {
        this.configName_ = getDefaultInstance().getConfigName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConfigNameBytes(com.google.crypto.tink.shaded.protobuf.ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        this.configName_ = byteString.toStringUtf8();
    }

    @Override // com.google.crypto.tink.proto.RegistryConfigOrBuilder
    public final java.util.List<com.google.crypto.tink.proto.KeyTypeEntry> getEntryList() {
        return this.entry_;
    }

    public final java.util.List<? extends com.google.crypto.tink.proto.KeyTypeEntryOrBuilder> getEntryOrBuilderList() {
        return this.entry_;
    }

    @Override // com.google.crypto.tink.proto.RegistryConfigOrBuilder
    public final int getEntryCount() {
        return this.entry_.size();
    }

    @Override // com.google.crypto.tink.proto.RegistryConfigOrBuilder
    public final com.google.crypto.tink.proto.KeyTypeEntry getEntry(int i) {
        return this.entry_.get(i);
    }

    public final com.google.crypto.tink.proto.KeyTypeEntryOrBuilder getEntryOrBuilder(int i) {
        return this.entry_.get(i);
    }

    private void ensureEntryIsMutable() {
        com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<com.google.crypto.tink.proto.KeyTypeEntry> protobufList = this.entry_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.entry_ = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEntry(int i, com.google.crypto.tink.proto.KeyTypeEntry keyTypeEntry) {
        ensureEntryIsMutable();
        this.entry_.set(i, keyTypeEntry);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEntry(com.google.crypto.tink.proto.KeyTypeEntry keyTypeEntry) {
        ensureEntryIsMutable();
        this.entry_.add(keyTypeEntry);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEntry(int i, com.google.crypto.tink.proto.KeyTypeEntry keyTypeEntry) {
        ensureEntryIsMutable();
        this.entry_.add(i, keyTypeEntry);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEntry(java.lang.Iterable<? extends com.google.crypto.tink.proto.KeyTypeEntry> iterable) {
        ensureEntryIsMutable();
        com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.addAll(iterable, this.entry_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEntry() {
        this.entry_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEntry(int i) {
        ensureEntryIsMutable();
        this.entry_.remove(i);
    }

    public static com.google.crypto.tink.proto.RegistryConfig parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.RegistryConfig) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.crypto.tink.proto.RegistryConfig parseFrom(java.nio.ByteBuffer byteBuffer, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.RegistryConfig) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.RegistryConfig parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.RegistryConfig) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.google.crypto.tink.proto.RegistryConfig parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.RegistryConfig) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.RegistryConfig parseFrom(byte[] bArr) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.RegistryConfig) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.google.crypto.tink.proto.RegistryConfig parseFrom(byte[] bArr, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.RegistryConfig) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.RegistryConfig parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.google.crypto.tink.proto.RegistryConfig) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.crypto.tink.proto.RegistryConfig parseFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.proto.RegistryConfig) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.RegistryConfig parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.google.crypto.tink.proto.RegistryConfig) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.crypto.tink.proto.RegistryConfig parseDelimitedFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.proto.RegistryConfig) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.RegistryConfig parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
        return (com.google.crypto.tink.proto.RegistryConfig) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.google.crypto.tink.proto.RegistryConfig parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.proto.RegistryConfig) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.RegistryConfig.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.google.crypto.tink.proto.RegistryConfig.Builder newBuilder(com.google.crypto.tink.proto.RegistryConfig registryConfig) {
        return DEFAULT_INSTANCE.createBuilder(registryConfig);
    }

    public static final class Builder extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<com.google.crypto.tink.proto.RegistryConfig, com.google.crypto.tink.proto.RegistryConfig.Builder> implements com.google.crypto.tink.proto.RegistryConfigOrBuilder {
        /* synthetic */ Builder(com.google.crypto.tink.proto.RegistryConfig.AnonymousClass1 anonymousClass1) {
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
            return super.internalMergeFrom((com.google.crypto.tink.proto.RegistryConfig.Builder) abstractMessageLite);
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
            super(com.google.crypto.tink.proto.RegistryConfig.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.proto.RegistryConfigOrBuilder
        public final java.lang.String getConfigName() {
            return ((com.google.crypto.tink.proto.RegistryConfig) this.instance).getConfigName();
        }

        @Override // com.google.crypto.tink.proto.RegistryConfigOrBuilder
        public final com.google.crypto.tink.shaded.protobuf.ByteString getConfigNameBytes() {
            return ((com.google.crypto.tink.proto.RegistryConfig) this.instance).getConfigNameBytes();
        }

        public final com.google.crypto.tink.proto.RegistryConfig.Builder setConfigName(java.lang.String str) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.RegistryConfig) this.instance).setConfigName(str);
            return this;
        }

        public final com.google.crypto.tink.proto.RegistryConfig.Builder clearConfigName() {
            copyOnWrite();
            ((com.google.crypto.tink.proto.RegistryConfig) this.instance).clearConfigName();
            return this;
        }

        public final com.google.crypto.tink.proto.RegistryConfig.Builder setConfigNameBytes(com.google.crypto.tink.shaded.protobuf.ByteString byteString) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.RegistryConfig) this.instance).setConfigNameBytes(byteString);
            return this;
        }

        @Override // com.google.crypto.tink.proto.RegistryConfigOrBuilder
        public final java.util.List<com.google.crypto.tink.proto.KeyTypeEntry> getEntryList() {
            return java.util.Collections.unmodifiableList(((com.google.crypto.tink.proto.RegistryConfig) this.instance).getEntryList());
        }

        @Override // com.google.crypto.tink.proto.RegistryConfigOrBuilder
        public final int getEntryCount() {
            return ((com.google.crypto.tink.proto.RegistryConfig) this.instance).getEntryCount();
        }

        @Override // com.google.crypto.tink.proto.RegistryConfigOrBuilder
        public final com.google.crypto.tink.proto.KeyTypeEntry getEntry(int i) {
            return ((com.google.crypto.tink.proto.RegistryConfig) this.instance).getEntry(i);
        }

        public final com.google.crypto.tink.proto.RegistryConfig.Builder setEntry(int i, com.google.crypto.tink.proto.KeyTypeEntry keyTypeEntry) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.RegistryConfig) this.instance).setEntry(i, keyTypeEntry);
            return this;
        }

        public final com.google.crypto.tink.proto.RegistryConfig.Builder setEntry(int i, com.google.crypto.tink.proto.KeyTypeEntry.Builder builder) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.RegistryConfig) this.instance).setEntry(i, builder.build());
            return this;
        }

        public final com.google.crypto.tink.proto.RegistryConfig.Builder addEntry(com.google.crypto.tink.proto.KeyTypeEntry keyTypeEntry) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.RegistryConfig) this.instance).addEntry(keyTypeEntry);
            return this;
        }

        public final com.google.crypto.tink.proto.RegistryConfig.Builder addEntry(int i, com.google.crypto.tink.proto.KeyTypeEntry keyTypeEntry) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.RegistryConfig) this.instance).addEntry(i, keyTypeEntry);
            return this;
        }

        public final com.google.crypto.tink.proto.RegistryConfig.Builder addEntry(com.google.crypto.tink.proto.KeyTypeEntry.Builder builder) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.RegistryConfig) this.instance).addEntry(builder.build());
            return this;
        }

        public final com.google.crypto.tink.proto.RegistryConfig.Builder addEntry(int i, com.google.crypto.tink.proto.KeyTypeEntry.Builder builder) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.RegistryConfig) this.instance).addEntry(i, builder.build());
            return this;
        }

        public final com.google.crypto.tink.proto.RegistryConfig.Builder addAllEntry(java.lang.Iterable<? extends com.google.crypto.tink.proto.KeyTypeEntry> iterable) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.RegistryConfig) this.instance).addAllEntry(iterable);
            return this;
        }

        public final com.google.crypto.tink.proto.RegistryConfig.Builder clearEntry() {
            copyOnWrite();
            ((com.google.crypto.tink.proto.RegistryConfig) this.instance).clearEntry();
            return this;
        }

        public final com.google.crypto.tink.proto.RegistryConfig.Builder removeEntry(int i) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.RegistryConfig) this.instance).removeEntry(i);
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.proto.RegistryConfig$1, reason: invalid class name */
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
        com.google.crypto.tink.proto.RegistryConfig.AnonymousClass1 anonymousClass1 = null;
        switch (com.google.crypto.tink.proto.RegistryConfig.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new com.google.crypto.tink.proto.RegistryConfig();
            case 2:
                return new com.google.crypto.tink.proto.RegistryConfig.Builder(anonymousClass1);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new java.lang.Object[]{"configName_", "entry_", com.google.crypto.tink.proto.KeyTypeEntry.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.RegistryConfig> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.google.crypto.tink.proto.RegistryConfig.class) {
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
        com.google.crypto.tink.proto.RegistryConfig registryConfig = new com.google.crypto.tink.proto.RegistryConfig();
        DEFAULT_INSTANCE = registryConfig;
        com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.registerDefaultInstance(com.google.crypto.tink.proto.RegistryConfig.class, registryConfig);
    }

    public static com.google.crypto.tink.proto.RegistryConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.RegistryConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
