package com.google.crypto.tink.proto;

/* loaded from: classes4.dex */
public final class KeysetInfo extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<com.google.crypto.tink.proto.KeysetInfo, com.google.crypto.tink.proto.KeysetInfo.Builder> implements com.google.crypto.tink.proto.KeysetInfoOrBuilder {
    private static final com.google.crypto.tink.proto.KeysetInfo DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.KeysetInfo> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<com.google.crypto.tink.proto.KeysetInfo.KeyInfo> keyInfo_ = emptyProtobufList();
    private int primaryKeyId_;

    public interface KeyInfoOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
        int getKeyId();

        com.google.crypto.tink.proto.OutputPrefixType getOutputPrefixType();

        int getOutputPrefixTypeValue();

        com.google.crypto.tink.proto.KeyStatusType getStatus();

        int getStatusValue();

        java.lang.String getTypeUrl();

        com.google.crypto.tink.shaded.protobuf.ByteString getTypeUrlBytes();
    }

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

    private KeysetInfo() {
    }

    public static final class KeyInfo extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<com.google.crypto.tink.proto.KeysetInfo.KeyInfo, com.google.crypto.tink.proto.KeysetInfo.KeyInfo.Builder> implements com.google.crypto.tink.proto.KeysetInfo.KeyInfoOrBuilder {
        private static final com.google.crypto.tink.proto.KeysetInfo.KeyInfo DEFAULT_INSTANCE;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.KeysetInfo.KeyInfo> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        public static final int TYPE_URL_FIELD_NUMBER = 1;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;
        private java.lang.String typeUrl_ = "";

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

        private KeyInfo() {
        }

        @Override // com.google.crypto.tink.proto.KeysetInfo.KeyInfoOrBuilder
        public final java.lang.String getTypeUrl() {
            return this.typeUrl_;
        }

        @Override // com.google.crypto.tink.proto.KeysetInfo.KeyInfoOrBuilder
        public final com.google.crypto.tink.shaded.protobuf.ByteString getTypeUrlBytes() {
            return com.google.crypto.tink.shaded.protobuf.ByteString.copyFromUtf8(this.typeUrl_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeUrl(java.lang.String str) {
            this.typeUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTypeUrl() {
            this.typeUrl_ = getDefaultInstance().getTypeUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeUrlBytes(com.google.crypto.tink.shaded.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.typeUrl_ = byteString.toStringUtf8();
        }

        @Override // com.google.crypto.tink.proto.KeysetInfo.KeyInfoOrBuilder
        public final int getStatusValue() {
            return this.status_;
        }

        @Override // com.google.crypto.tink.proto.KeysetInfo.KeyInfoOrBuilder
        public final com.google.crypto.tink.proto.KeyStatusType getStatus() {
            com.google.crypto.tink.proto.KeyStatusType forNumber = com.google.crypto.tink.proto.KeyStatusType.forNumber(this.status_);
            return forNumber == null ? com.google.crypto.tink.proto.KeyStatusType.UNRECOGNIZED : forNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatusValue(int i) {
            this.status_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatus(com.google.crypto.tink.proto.KeyStatusType keyStatusType) {
            this.status_ = keyStatusType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatus() {
            this.status_ = 0;
        }

        @Override // com.google.crypto.tink.proto.KeysetInfo.KeyInfoOrBuilder
        public final int getKeyId() {
            return this.keyId_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setKeyId(int i) {
            this.keyId_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearKeyId() {
            this.keyId_ = 0;
        }

        @Override // com.google.crypto.tink.proto.KeysetInfo.KeyInfoOrBuilder
        public final int getOutputPrefixTypeValue() {
            return this.outputPrefixType_;
        }

        @Override // com.google.crypto.tink.proto.KeysetInfo.KeyInfoOrBuilder
        public final com.google.crypto.tink.proto.OutputPrefixType getOutputPrefixType() {
            com.google.crypto.tink.proto.OutputPrefixType forNumber = com.google.crypto.tink.proto.OutputPrefixType.forNumber(this.outputPrefixType_);
            return forNumber == null ? com.google.crypto.tink.proto.OutputPrefixType.UNRECOGNIZED : forNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOutputPrefixTypeValue(int i) {
            this.outputPrefixType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOutputPrefixType(com.google.crypto.tink.proto.OutputPrefixType outputPrefixType) {
            this.outputPrefixType_ = outputPrefixType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOutputPrefixType() {
            this.outputPrefixType_ = 0;
        }

        public static com.google.crypto.tink.proto.KeysetInfo.KeyInfo parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            return (com.google.crypto.tink.proto.KeysetInfo.KeyInfo) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.crypto.tink.proto.KeysetInfo.KeyInfo parseFrom(java.nio.ByteBuffer byteBuffer, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            return (com.google.crypto.tink.proto.KeysetInfo.KeyInfo) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.google.crypto.tink.proto.KeysetInfo.KeyInfo parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            return (com.google.crypto.tink.proto.KeysetInfo.KeyInfo) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.google.crypto.tink.proto.KeysetInfo.KeyInfo parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            return (com.google.crypto.tink.proto.KeysetInfo.KeyInfo) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.google.crypto.tink.proto.KeysetInfo.KeyInfo parseFrom(byte[] bArr) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            return (com.google.crypto.tink.proto.KeysetInfo.KeyInfo) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.google.crypto.tink.proto.KeysetInfo.KeyInfo parseFrom(byte[] bArr, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            return (com.google.crypto.tink.proto.KeysetInfo.KeyInfo) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.google.crypto.tink.proto.KeysetInfo.KeyInfo parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.google.crypto.tink.proto.KeysetInfo.KeyInfo) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.google.crypto.tink.proto.KeysetInfo.KeyInfo parseFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.google.crypto.tink.proto.KeysetInfo.KeyInfo) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.google.crypto.tink.proto.KeysetInfo.KeyInfo parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.google.crypto.tink.proto.KeysetInfo.KeyInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.google.crypto.tink.proto.KeysetInfo.KeyInfo parseDelimitedFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.google.crypto.tink.proto.KeysetInfo.KeyInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.google.crypto.tink.proto.KeysetInfo.KeyInfo parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (com.google.crypto.tink.proto.KeysetInfo.KeyInfo) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.google.crypto.tink.proto.KeysetInfo.KeyInfo parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.google.crypto.tink.proto.KeysetInfo.KeyInfo) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static com.google.crypto.tink.proto.KeysetInfo.KeyInfo.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.google.crypto.tink.proto.KeysetInfo.KeyInfo.Builder newBuilder(com.google.crypto.tink.proto.KeysetInfo.KeyInfo keyInfo) {
            return DEFAULT_INSTANCE.createBuilder(keyInfo);
        }

        public static final class Builder extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<com.google.crypto.tink.proto.KeysetInfo.KeyInfo, com.google.crypto.tink.proto.KeysetInfo.KeyInfo.Builder> implements com.google.crypto.tink.proto.KeysetInfo.KeyInfoOrBuilder {
            /* synthetic */ Builder(com.google.crypto.tink.proto.KeysetInfo.AnonymousClass1 anonymousClass1) {
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
                return super.internalMergeFrom((com.google.crypto.tink.proto.KeysetInfo.KeyInfo.Builder) abstractMessageLite);
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
                super(com.google.crypto.tink.proto.KeysetInfo.KeyInfo.DEFAULT_INSTANCE);
            }

            @Override // com.google.crypto.tink.proto.KeysetInfo.KeyInfoOrBuilder
            public final java.lang.String getTypeUrl() {
                return ((com.google.crypto.tink.proto.KeysetInfo.KeyInfo) this.instance).getTypeUrl();
            }

            @Override // com.google.crypto.tink.proto.KeysetInfo.KeyInfoOrBuilder
            public final com.google.crypto.tink.shaded.protobuf.ByteString getTypeUrlBytes() {
                return ((com.google.crypto.tink.proto.KeysetInfo.KeyInfo) this.instance).getTypeUrlBytes();
            }

            public final com.google.crypto.tink.proto.KeysetInfo.KeyInfo.Builder setTypeUrl(java.lang.String str) {
                copyOnWrite();
                ((com.google.crypto.tink.proto.KeysetInfo.KeyInfo) this.instance).setTypeUrl(str);
                return this;
            }

            public final com.google.crypto.tink.proto.KeysetInfo.KeyInfo.Builder clearTypeUrl() {
                copyOnWrite();
                ((com.google.crypto.tink.proto.KeysetInfo.KeyInfo) this.instance).clearTypeUrl();
                return this;
            }

            public final com.google.crypto.tink.proto.KeysetInfo.KeyInfo.Builder setTypeUrlBytes(com.google.crypto.tink.shaded.protobuf.ByteString byteString) {
                copyOnWrite();
                ((com.google.crypto.tink.proto.KeysetInfo.KeyInfo) this.instance).setTypeUrlBytes(byteString);
                return this;
            }

            @Override // com.google.crypto.tink.proto.KeysetInfo.KeyInfoOrBuilder
            public final int getStatusValue() {
                return ((com.google.crypto.tink.proto.KeysetInfo.KeyInfo) this.instance).getStatusValue();
            }

            public final com.google.crypto.tink.proto.KeysetInfo.KeyInfo.Builder setStatusValue(int i) {
                copyOnWrite();
                ((com.google.crypto.tink.proto.KeysetInfo.KeyInfo) this.instance).setStatusValue(i);
                return this;
            }

            @Override // com.google.crypto.tink.proto.KeysetInfo.KeyInfoOrBuilder
            public final com.google.crypto.tink.proto.KeyStatusType getStatus() {
                return ((com.google.crypto.tink.proto.KeysetInfo.KeyInfo) this.instance).getStatus();
            }

            public final com.google.crypto.tink.proto.KeysetInfo.KeyInfo.Builder setStatus(com.google.crypto.tink.proto.KeyStatusType keyStatusType) {
                copyOnWrite();
                ((com.google.crypto.tink.proto.KeysetInfo.KeyInfo) this.instance).setStatus(keyStatusType);
                return this;
            }

            public final com.google.crypto.tink.proto.KeysetInfo.KeyInfo.Builder clearStatus() {
                copyOnWrite();
                ((com.google.crypto.tink.proto.KeysetInfo.KeyInfo) this.instance).clearStatus();
                return this;
            }

            @Override // com.google.crypto.tink.proto.KeysetInfo.KeyInfoOrBuilder
            public final int getKeyId() {
                return ((com.google.crypto.tink.proto.KeysetInfo.KeyInfo) this.instance).getKeyId();
            }

            public final com.google.crypto.tink.proto.KeysetInfo.KeyInfo.Builder setKeyId(int i) {
                copyOnWrite();
                ((com.google.crypto.tink.proto.KeysetInfo.KeyInfo) this.instance).setKeyId(i);
                return this;
            }

            public final com.google.crypto.tink.proto.KeysetInfo.KeyInfo.Builder clearKeyId() {
                copyOnWrite();
                ((com.google.crypto.tink.proto.KeysetInfo.KeyInfo) this.instance).clearKeyId();
                return this;
            }

            @Override // com.google.crypto.tink.proto.KeysetInfo.KeyInfoOrBuilder
            public final int getOutputPrefixTypeValue() {
                return ((com.google.crypto.tink.proto.KeysetInfo.KeyInfo) this.instance).getOutputPrefixTypeValue();
            }

            public final com.google.crypto.tink.proto.KeysetInfo.KeyInfo.Builder setOutputPrefixTypeValue(int i) {
                copyOnWrite();
                ((com.google.crypto.tink.proto.KeysetInfo.KeyInfo) this.instance).setOutputPrefixTypeValue(i);
                return this;
            }

            @Override // com.google.crypto.tink.proto.KeysetInfo.KeyInfoOrBuilder
            public final com.google.crypto.tink.proto.OutputPrefixType getOutputPrefixType() {
                return ((com.google.crypto.tink.proto.KeysetInfo.KeyInfo) this.instance).getOutputPrefixType();
            }

            public final com.google.crypto.tink.proto.KeysetInfo.KeyInfo.Builder setOutputPrefixType(com.google.crypto.tink.proto.OutputPrefixType outputPrefixType) {
                copyOnWrite();
                ((com.google.crypto.tink.proto.KeysetInfo.KeyInfo) this.instance).setOutputPrefixType(outputPrefixType);
                return this;
            }

            public final com.google.crypto.tink.proto.KeysetInfo.KeyInfo.Builder clearOutputPrefixType() {
                copyOnWrite();
                ((com.google.crypto.tink.proto.KeysetInfo.KeyInfo) this.instance).clearOutputPrefixType();
                return this;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.crypto.tink.shaded.protobuf.Parser parser;
            com.google.crypto.tink.proto.KeysetInfo.AnonymousClass1 anonymousClass1 = null;
            switch (com.google.crypto.tink.proto.KeysetInfo.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.google.crypto.tink.proto.KeysetInfo.KeyInfo();
                case 2:
                    return new com.google.crypto.tink.proto.KeysetInfo.KeyInfo.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new java.lang.Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.KeysetInfo.KeyInfo> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.google.crypto.tink.proto.KeysetInfo.KeyInfo.class) {
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
            com.google.crypto.tink.proto.KeysetInfo.KeyInfo keyInfo = new com.google.crypto.tink.proto.KeysetInfo.KeyInfo();
            DEFAULT_INSTANCE = keyInfo;
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.registerDefaultInstance(com.google.crypto.tink.proto.KeysetInfo.KeyInfo.class, keyInfo);
        }

        public static com.google.crypto.tink.proto.KeysetInfo.KeyInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.KeysetInfo.KeyInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* renamed from: com.google.crypto.tink.proto.KeysetInfo$1, reason: invalid class name */
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

    @Override // com.google.crypto.tink.proto.KeysetInfoOrBuilder
    public final int getPrimaryKeyId() {
        return this.primaryKeyId_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrimaryKeyId(int i) {
        this.primaryKeyId_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrimaryKeyId() {
        this.primaryKeyId_ = 0;
    }

    @Override // com.google.crypto.tink.proto.KeysetInfoOrBuilder
    public final java.util.List<com.google.crypto.tink.proto.KeysetInfo.KeyInfo> getKeyInfoList() {
        return this.keyInfo_;
    }

    public final java.util.List<? extends com.google.crypto.tink.proto.KeysetInfo.KeyInfoOrBuilder> getKeyInfoOrBuilderList() {
        return this.keyInfo_;
    }

    @Override // com.google.crypto.tink.proto.KeysetInfoOrBuilder
    public final int getKeyInfoCount() {
        return this.keyInfo_.size();
    }

    @Override // com.google.crypto.tink.proto.KeysetInfoOrBuilder
    public final com.google.crypto.tink.proto.KeysetInfo.KeyInfo getKeyInfo(int i) {
        return this.keyInfo_.get(i);
    }

    public final com.google.crypto.tink.proto.KeysetInfo.KeyInfoOrBuilder getKeyInfoOrBuilder(int i) {
        return this.keyInfo_.get(i);
    }

    private void ensureKeyInfoIsMutable() {
        com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<com.google.crypto.tink.proto.KeysetInfo.KeyInfo> protobufList = this.keyInfo_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.keyInfo_ = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyInfo(int i, com.google.crypto.tink.proto.KeysetInfo.KeyInfo keyInfo) {
        ensureKeyInfoIsMutable();
        this.keyInfo_.set(i, keyInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addKeyInfo(com.google.crypto.tink.proto.KeysetInfo.KeyInfo keyInfo) {
        ensureKeyInfoIsMutable();
        this.keyInfo_.add(keyInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addKeyInfo(int i, com.google.crypto.tink.proto.KeysetInfo.KeyInfo keyInfo) {
        ensureKeyInfoIsMutable();
        this.keyInfo_.add(i, keyInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllKeyInfo(java.lang.Iterable<? extends com.google.crypto.tink.proto.KeysetInfo.KeyInfo> iterable) {
        ensureKeyInfoIsMutable();
        com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.addAll(iterable, this.keyInfo_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeyInfo() {
        this.keyInfo_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeKeyInfo(int i) {
        ensureKeyInfoIsMutable();
        this.keyInfo_.remove(i);
    }

    public static com.google.crypto.tink.proto.KeysetInfo parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.KeysetInfo) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.crypto.tink.proto.KeysetInfo parseFrom(java.nio.ByteBuffer byteBuffer, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.KeysetInfo) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.KeysetInfo parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.KeysetInfo) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.google.crypto.tink.proto.KeysetInfo parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.KeysetInfo) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.KeysetInfo parseFrom(byte[] bArr) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.KeysetInfo) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.google.crypto.tink.proto.KeysetInfo parseFrom(byte[] bArr, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.KeysetInfo) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.KeysetInfo parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.google.crypto.tink.proto.KeysetInfo) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.crypto.tink.proto.KeysetInfo parseFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.proto.KeysetInfo) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.KeysetInfo parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.google.crypto.tink.proto.KeysetInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.crypto.tink.proto.KeysetInfo parseDelimitedFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.proto.KeysetInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.KeysetInfo parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
        return (com.google.crypto.tink.proto.KeysetInfo) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.google.crypto.tink.proto.KeysetInfo parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.proto.KeysetInfo) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.KeysetInfo.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.google.crypto.tink.proto.KeysetInfo.Builder newBuilder(com.google.crypto.tink.proto.KeysetInfo keysetInfo) {
        return DEFAULT_INSTANCE.createBuilder(keysetInfo);
    }

    public static final class Builder extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<com.google.crypto.tink.proto.KeysetInfo, com.google.crypto.tink.proto.KeysetInfo.Builder> implements com.google.crypto.tink.proto.KeysetInfoOrBuilder {
        /* synthetic */ Builder(com.google.crypto.tink.proto.KeysetInfo.AnonymousClass1 anonymousClass1) {
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
            return super.internalMergeFrom((com.google.crypto.tink.proto.KeysetInfo.Builder) abstractMessageLite);
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
            super(com.google.crypto.tink.proto.KeysetInfo.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.proto.KeysetInfoOrBuilder
        public final int getPrimaryKeyId() {
            return ((com.google.crypto.tink.proto.KeysetInfo) this.instance).getPrimaryKeyId();
        }

        public final com.google.crypto.tink.proto.KeysetInfo.Builder setPrimaryKeyId(int i) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.KeysetInfo) this.instance).setPrimaryKeyId(i);
            return this;
        }

        public final com.google.crypto.tink.proto.KeysetInfo.Builder clearPrimaryKeyId() {
            copyOnWrite();
            ((com.google.crypto.tink.proto.KeysetInfo) this.instance).clearPrimaryKeyId();
            return this;
        }

        @Override // com.google.crypto.tink.proto.KeysetInfoOrBuilder
        public final java.util.List<com.google.crypto.tink.proto.KeysetInfo.KeyInfo> getKeyInfoList() {
            return java.util.Collections.unmodifiableList(((com.google.crypto.tink.proto.KeysetInfo) this.instance).getKeyInfoList());
        }

        @Override // com.google.crypto.tink.proto.KeysetInfoOrBuilder
        public final int getKeyInfoCount() {
            return ((com.google.crypto.tink.proto.KeysetInfo) this.instance).getKeyInfoCount();
        }

        @Override // com.google.crypto.tink.proto.KeysetInfoOrBuilder
        public final com.google.crypto.tink.proto.KeysetInfo.KeyInfo getKeyInfo(int i) {
            return ((com.google.crypto.tink.proto.KeysetInfo) this.instance).getKeyInfo(i);
        }

        public final com.google.crypto.tink.proto.KeysetInfo.Builder setKeyInfo(int i, com.google.crypto.tink.proto.KeysetInfo.KeyInfo keyInfo) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.KeysetInfo) this.instance).setKeyInfo(i, keyInfo);
            return this;
        }

        public final com.google.crypto.tink.proto.KeysetInfo.Builder setKeyInfo(int i, com.google.crypto.tink.proto.KeysetInfo.KeyInfo.Builder builder) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.KeysetInfo) this.instance).setKeyInfo(i, builder.build());
            return this;
        }

        public final com.google.crypto.tink.proto.KeysetInfo.Builder addKeyInfo(com.google.crypto.tink.proto.KeysetInfo.KeyInfo keyInfo) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.KeysetInfo) this.instance).addKeyInfo(keyInfo);
            return this;
        }

        public final com.google.crypto.tink.proto.KeysetInfo.Builder addKeyInfo(int i, com.google.crypto.tink.proto.KeysetInfo.KeyInfo keyInfo) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.KeysetInfo) this.instance).addKeyInfo(i, keyInfo);
            return this;
        }

        public final com.google.crypto.tink.proto.KeysetInfo.Builder addKeyInfo(com.google.crypto.tink.proto.KeysetInfo.KeyInfo.Builder builder) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.KeysetInfo) this.instance).addKeyInfo(builder.build());
            return this;
        }

        public final com.google.crypto.tink.proto.KeysetInfo.Builder addKeyInfo(int i, com.google.crypto.tink.proto.KeysetInfo.KeyInfo.Builder builder) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.KeysetInfo) this.instance).addKeyInfo(i, builder.build());
            return this;
        }

        public final com.google.crypto.tink.proto.KeysetInfo.Builder addAllKeyInfo(java.lang.Iterable<? extends com.google.crypto.tink.proto.KeysetInfo.KeyInfo> iterable) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.KeysetInfo) this.instance).addAllKeyInfo(iterable);
            return this;
        }

        public final com.google.crypto.tink.proto.KeysetInfo.Builder clearKeyInfo() {
            copyOnWrite();
            ((com.google.crypto.tink.proto.KeysetInfo) this.instance).clearKeyInfo();
            return this;
        }

        public final com.google.crypto.tink.proto.KeysetInfo.Builder removeKeyInfo(int i) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.KeysetInfo) this.instance).removeKeyInfo(i);
            return this;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.crypto.tink.shaded.protobuf.Parser parser;
        com.google.crypto.tink.proto.KeysetInfo.AnonymousClass1 anonymousClass1 = null;
        switch (com.google.crypto.tink.proto.KeysetInfo.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new com.google.crypto.tink.proto.KeysetInfo();
            case 2:
                return new com.google.crypto.tink.proto.KeysetInfo.Builder(anonymousClass1);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new java.lang.Object[]{"primaryKeyId_", "keyInfo_", com.google.crypto.tink.proto.KeysetInfo.KeyInfo.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.KeysetInfo> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.google.crypto.tink.proto.KeysetInfo.class) {
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
        com.google.crypto.tink.proto.KeysetInfo keysetInfo = new com.google.crypto.tink.proto.KeysetInfo();
        DEFAULT_INSTANCE = keysetInfo;
        com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.registerDefaultInstance(com.google.crypto.tink.proto.KeysetInfo.class, keysetInfo);
    }

    public static com.google.crypto.tink.proto.KeysetInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.KeysetInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
