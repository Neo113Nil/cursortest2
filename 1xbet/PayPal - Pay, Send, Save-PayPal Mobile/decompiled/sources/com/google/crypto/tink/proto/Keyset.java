package com.google.crypto.tink.proto;

/* loaded from: classes4.dex */
public final class Keyset extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<com.google.crypto.tink.proto.Keyset, com.google.crypto.tink.proto.Keyset.Builder> implements com.google.crypto.tink.proto.KeysetOrBuilder {
    private static final com.google.crypto.tink.proto.Keyset DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.Keyset> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<com.google.crypto.tink.proto.Keyset.Key> key_ = emptyProtobufList();
    private int primaryKeyId_;

    public interface KeyOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
        com.google.crypto.tink.proto.KeyData getKeyData();

        int getKeyId();

        com.google.crypto.tink.proto.OutputPrefixType getOutputPrefixType();

        int getOutputPrefixTypeValue();

        com.google.crypto.tink.proto.KeyStatusType getStatus();

        int getStatusValue();

        boolean hasKeyData();
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

    private Keyset() {
    }

    public static final class Key extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<com.google.crypto.tink.proto.Keyset.Key, com.google.crypto.tink.proto.Keyset.Key.Builder> implements com.google.crypto.tink.proto.Keyset.KeyOrBuilder {
        private static final com.google.crypto.tink.proto.Keyset.Key DEFAULT_INSTANCE;
        public static final int KEY_DATA_FIELD_NUMBER = 1;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.Keyset.Key> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        private int bitField0_;
        private com.google.crypto.tink.proto.KeyData keyData_;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;

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

        private Key() {
        }

        @Override // com.google.crypto.tink.proto.Keyset.KeyOrBuilder
        public final boolean hasKeyData() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.crypto.tink.proto.Keyset.KeyOrBuilder
        public final com.google.crypto.tink.proto.KeyData getKeyData() {
            com.google.crypto.tink.proto.KeyData keyData = this.keyData_;
            return keyData == null ? com.google.crypto.tink.proto.KeyData.getDefaultInstance() : keyData;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setKeyData(com.google.crypto.tink.proto.KeyData keyData) {
            this.keyData_ = keyData;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeKeyData(com.google.crypto.tink.proto.KeyData keyData) {
            com.google.crypto.tink.proto.KeyData keyData2 = this.keyData_;
            if (keyData2 != null && keyData2 != com.google.crypto.tink.proto.KeyData.getDefaultInstance()) {
                this.keyData_ = com.google.crypto.tink.proto.KeyData.newBuilder(this.keyData_).mergeFrom((com.google.crypto.tink.proto.KeyData.Builder) keyData).buildPartial();
            } else {
                this.keyData_ = keyData;
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearKeyData() {
            this.keyData_ = null;
            this.bitField0_ &= -2;
        }

        @Override // com.google.crypto.tink.proto.Keyset.KeyOrBuilder
        public final int getStatusValue() {
            return this.status_;
        }

        @Override // com.google.crypto.tink.proto.Keyset.KeyOrBuilder
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

        @Override // com.google.crypto.tink.proto.Keyset.KeyOrBuilder
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

        @Override // com.google.crypto.tink.proto.Keyset.KeyOrBuilder
        public final int getOutputPrefixTypeValue() {
            return this.outputPrefixType_;
        }

        @Override // com.google.crypto.tink.proto.Keyset.KeyOrBuilder
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

        public static com.google.crypto.tink.proto.Keyset.Key parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            return (com.google.crypto.tink.proto.Keyset.Key) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.crypto.tink.proto.Keyset.Key parseFrom(java.nio.ByteBuffer byteBuffer, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            return (com.google.crypto.tink.proto.Keyset.Key) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.google.crypto.tink.proto.Keyset.Key parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            return (com.google.crypto.tink.proto.Keyset.Key) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.google.crypto.tink.proto.Keyset.Key parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            return (com.google.crypto.tink.proto.Keyset.Key) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.google.crypto.tink.proto.Keyset.Key parseFrom(byte[] bArr) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            return (com.google.crypto.tink.proto.Keyset.Key) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.google.crypto.tink.proto.Keyset.Key parseFrom(byte[] bArr, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            return (com.google.crypto.tink.proto.Keyset.Key) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.google.crypto.tink.proto.Keyset.Key parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.google.crypto.tink.proto.Keyset.Key) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.google.crypto.tink.proto.Keyset.Key parseFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.google.crypto.tink.proto.Keyset.Key) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.google.crypto.tink.proto.Keyset.Key parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.google.crypto.tink.proto.Keyset.Key) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.google.crypto.tink.proto.Keyset.Key parseDelimitedFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.google.crypto.tink.proto.Keyset.Key) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.google.crypto.tink.proto.Keyset.Key parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (com.google.crypto.tink.proto.Keyset.Key) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.google.crypto.tink.proto.Keyset.Key parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.google.crypto.tink.proto.Keyset.Key) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static com.google.crypto.tink.proto.Keyset.Key.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.google.crypto.tink.proto.Keyset.Key.Builder newBuilder(com.google.crypto.tink.proto.Keyset.Key key) {
            return DEFAULT_INSTANCE.createBuilder(key);
        }

        public static final class Builder extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<com.google.crypto.tink.proto.Keyset.Key, com.google.crypto.tink.proto.Keyset.Key.Builder> implements com.google.crypto.tink.proto.Keyset.KeyOrBuilder {
            /* synthetic */ Builder(com.google.crypto.tink.proto.Keyset.AnonymousClass1 anonymousClass1) {
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
                return super.internalMergeFrom((com.google.crypto.tink.proto.Keyset.Key.Builder) abstractMessageLite);
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
                super(com.google.crypto.tink.proto.Keyset.Key.DEFAULT_INSTANCE);
            }

            @Override // com.google.crypto.tink.proto.Keyset.KeyOrBuilder
            public final boolean hasKeyData() {
                return ((com.google.crypto.tink.proto.Keyset.Key) this.instance).hasKeyData();
            }

            @Override // com.google.crypto.tink.proto.Keyset.KeyOrBuilder
            public final com.google.crypto.tink.proto.KeyData getKeyData() {
                return ((com.google.crypto.tink.proto.Keyset.Key) this.instance).getKeyData();
            }

            public final com.google.crypto.tink.proto.Keyset.Key.Builder setKeyData(com.google.crypto.tink.proto.KeyData keyData) {
                copyOnWrite();
                ((com.google.crypto.tink.proto.Keyset.Key) this.instance).setKeyData(keyData);
                return this;
            }

            public final com.google.crypto.tink.proto.Keyset.Key.Builder setKeyData(com.google.crypto.tink.proto.KeyData.Builder builder) {
                copyOnWrite();
                ((com.google.crypto.tink.proto.Keyset.Key) this.instance).setKeyData(builder.build());
                return this;
            }

            public final com.google.crypto.tink.proto.Keyset.Key.Builder mergeKeyData(com.google.crypto.tink.proto.KeyData keyData) {
                copyOnWrite();
                ((com.google.crypto.tink.proto.Keyset.Key) this.instance).mergeKeyData(keyData);
                return this;
            }

            public final com.google.crypto.tink.proto.Keyset.Key.Builder clearKeyData() {
                copyOnWrite();
                ((com.google.crypto.tink.proto.Keyset.Key) this.instance).clearKeyData();
                return this;
            }

            @Override // com.google.crypto.tink.proto.Keyset.KeyOrBuilder
            public final int getStatusValue() {
                return ((com.google.crypto.tink.proto.Keyset.Key) this.instance).getStatusValue();
            }

            public final com.google.crypto.tink.proto.Keyset.Key.Builder setStatusValue(int i) {
                copyOnWrite();
                ((com.google.crypto.tink.proto.Keyset.Key) this.instance).setStatusValue(i);
                return this;
            }

            @Override // com.google.crypto.tink.proto.Keyset.KeyOrBuilder
            public final com.google.crypto.tink.proto.KeyStatusType getStatus() {
                return ((com.google.crypto.tink.proto.Keyset.Key) this.instance).getStatus();
            }

            public final com.google.crypto.tink.proto.Keyset.Key.Builder setStatus(com.google.crypto.tink.proto.KeyStatusType keyStatusType) {
                copyOnWrite();
                ((com.google.crypto.tink.proto.Keyset.Key) this.instance).setStatus(keyStatusType);
                return this;
            }

            public final com.google.crypto.tink.proto.Keyset.Key.Builder clearStatus() {
                copyOnWrite();
                ((com.google.crypto.tink.proto.Keyset.Key) this.instance).clearStatus();
                return this;
            }

            @Override // com.google.crypto.tink.proto.Keyset.KeyOrBuilder
            public final int getKeyId() {
                return ((com.google.crypto.tink.proto.Keyset.Key) this.instance).getKeyId();
            }

            public final com.google.crypto.tink.proto.Keyset.Key.Builder setKeyId(int i) {
                copyOnWrite();
                ((com.google.crypto.tink.proto.Keyset.Key) this.instance).setKeyId(i);
                return this;
            }

            public final com.google.crypto.tink.proto.Keyset.Key.Builder clearKeyId() {
                copyOnWrite();
                ((com.google.crypto.tink.proto.Keyset.Key) this.instance).clearKeyId();
                return this;
            }

            @Override // com.google.crypto.tink.proto.Keyset.KeyOrBuilder
            public final int getOutputPrefixTypeValue() {
                return ((com.google.crypto.tink.proto.Keyset.Key) this.instance).getOutputPrefixTypeValue();
            }

            public final com.google.crypto.tink.proto.Keyset.Key.Builder setOutputPrefixTypeValue(int i) {
                copyOnWrite();
                ((com.google.crypto.tink.proto.Keyset.Key) this.instance).setOutputPrefixTypeValue(i);
                return this;
            }

            @Override // com.google.crypto.tink.proto.Keyset.KeyOrBuilder
            public final com.google.crypto.tink.proto.OutputPrefixType getOutputPrefixType() {
                return ((com.google.crypto.tink.proto.Keyset.Key) this.instance).getOutputPrefixType();
            }

            public final com.google.crypto.tink.proto.Keyset.Key.Builder setOutputPrefixType(com.google.crypto.tink.proto.OutputPrefixType outputPrefixType) {
                copyOnWrite();
                ((com.google.crypto.tink.proto.Keyset.Key) this.instance).setOutputPrefixType(outputPrefixType);
                return this;
            }

            public final com.google.crypto.tink.proto.Keyset.Key.Builder clearOutputPrefixType() {
                copyOnWrite();
                ((com.google.crypto.tink.proto.Keyset.Key) this.instance).clearOutputPrefixType();
                return this;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.crypto.tink.shaded.protobuf.Parser parser;
            com.google.crypto.tink.proto.Keyset.AnonymousClass1 anonymousClass1 = null;
            switch (com.google.crypto.tink.proto.Keyset.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.google.crypto.tink.proto.Keyset.Key();
                case 2:
                    return new com.google.crypto.tink.proto.Keyset.Key.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new java.lang.Object[]{"bitField0_", "keyData_", "status_", "keyId_", "outputPrefixType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.Keyset.Key> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.google.crypto.tink.proto.Keyset.Key.class) {
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
            com.google.crypto.tink.proto.Keyset.Key key = new com.google.crypto.tink.proto.Keyset.Key();
            DEFAULT_INSTANCE = key;
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.registerDefaultInstance(com.google.crypto.tink.proto.Keyset.Key.class, key);
        }

        public static com.google.crypto.tink.proto.Keyset.Key getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.Keyset.Key> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* renamed from: com.google.crypto.tink.proto.Keyset$1, reason: invalid class name */
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

    @Override // com.google.crypto.tink.proto.KeysetOrBuilder
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

    @Override // com.google.crypto.tink.proto.KeysetOrBuilder
    public final java.util.List<com.google.crypto.tink.proto.Keyset.Key> getKeyList() {
        return this.key_;
    }

    public final java.util.List<? extends com.google.crypto.tink.proto.Keyset.KeyOrBuilder> getKeyOrBuilderList() {
        return this.key_;
    }

    @Override // com.google.crypto.tink.proto.KeysetOrBuilder
    public final int getKeyCount() {
        return this.key_.size();
    }

    @Override // com.google.crypto.tink.proto.KeysetOrBuilder
    public final com.google.crypto.tink.proto.Keyset.Key getKey(int i) {
        return this.key_.get(i);
    }

    public final com.google.crypto.tink.proto.Keyset.KeyOrBuilder getKeyOrBuilder(int i) {
        return this.key_.get(i);
    }

    private void ensureKeyIsMutable() {
        com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<com.google.crypto.tink.proto.Keyset.Key> protobufList = this.key_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.key_ = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKey(int i, com.google.crypto.tink.proto.Keyset.Key key) {
        ensureKeyIsMutable();
        this.key_.set(i, key);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addKey(com.google.crypto.tink.proto.Keyset.Key key) {
        ensureKeyIsMutable();
        this.key_.add(key);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addKey(int i, com.google.crypto.tink.proto.Keyset.Key key) {
        ensureKeyIsMutable();
        this.key_.add(i, key);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllKey(java.lang.Iterable<? extends com.google.crypto.tink.proto.Keyset.Key> iterable) {
        ensureKeyIsMutable();
        com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.addAll(iterable, this.key_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKey() {
        this.key_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeKey(int i) {
        ensureKeyIsMutable();
        this.key_.remove(i);
    }

    public static com.google.crypto.tink.proto.Keyset parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.Keyset) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.crypto.tink.proto.Keyset parseFrom(java.nio.ByteBuffer byteBuffer, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.Keyset) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.Keyset parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.Keyset) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.google.crypto.tink.proto.Keyset parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.Keyset) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.Keyset parseFrom(byte[] bArr) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.Keyset) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.google.crypto.tink.proto.Keyset parseFrom(byte[] bArr, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.Keyset) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.Keyset parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.google.crypto.tink.proto.Keyset) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.crypto.tink.proto.Keyset parseFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.proto.Keyset) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.Keyset parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.google.crypto.tink.proto.Keyset) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.crypto.tink.proto.Keyset parseDelimitedFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.proto.Keyset) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.Keyset parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
        return (com.google.crypto.tink.proto.Keyset) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.google.crypto.tink.proto.Keyset parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.proto.Keyset) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.Keyset.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.google.crypto.tink.proto.Keyset.Builder newBuilder(com.google.crypto.tink.proto.Keyset keyset) {
        return DEFAULT_INSTANCE.createBuilder(keyset);
    }

    public static final class Builder extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<com.google.crypto.tink.proto.Keyset, com.google.crypto.tink.proto.Keyset.Builder> implements com.google.crypto.tink.proto.KeysetOrBuilder {
        /* synthetic */ Builder(com.google.crypto.tink.proto.Keyset.AnonymousClass1 anonymousClass1) {
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
            return super.internalMergeFrom((com.google.crypto.tink.proto.Keyset.Builder) abstractMessageLite);
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
            super(com.google.crypto.tink.proto.Keyset.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.proto.KeysetOrBuilder
        public final int getPrimaryKeyId() {
            return ((com.google.crypto.tink.proto.Keyset) this.instance).getPrimaryKeyId();
        }

        public final com.google.crypto.tink.proto.Keyset.Builder setPrimaryKeyId(int i) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.Keyset) this.instance).setPrimaryKeyId(i);
            return this;
        }

        public final com.google.crypto.tink.proto.Keyset.Builder clearPrimaryKeyId() {
            copyOnWrite();
            ((com.google.crypto.tink.proto.Keyset) this.instance).clearPrimaryKeyId();
            return this;
        }

        @Override // com.google.crypto.tink.proto.KeysetOrBuilder
        public final java.util.List<com.google.crypto.tink.proto.Keyset.Key> getKeyList() {
            return java.util.Collections.unmodifiableList(((com.google.crypto.tink.proto.Keyset) this.instance).getKeyList());
        }

        @Override // com.google.crypto.tink.proto.KeysetOrBuilder
        public final int getKeyCount() {
            return ((com.google.crypto.tink.proto.Keyset) this.instance).getKeyCount();
        }

        @Override // com.google.crypto.tink.proto.KeysetOrBuilder
        public final com.google.crypto.tink.proto.Keyset.Key getKey(int i) {
            return ((com.google.crypto.tink.proto.Keyset) this.instance).getKey(i);
        }

        public final com.google.crypto.tink.proto.Keyset.Builder setKey(int i, com.google.crypto.tink.proto.Keyset.Key key) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.Keyset) this.instance).setKey(i, key);
            return this;
        }

        public final com.google.crypto.tink.proto.Keyset.Builder setKey(int i, com.google.crypto.tink.proto.Keyset.Key.Builder builder) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.Keyset) this.instance).setKey(i, builder.build());
            return this;
        }

        public final com.google.crypto.tink.proto.Keyset.Builder addKey(com.google.crypto.tink.proto.Keyset.Key key) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.Keyset) this.instance).addKey(key);
            return this;
        }

        public final com.google.crypto.tink.proto.Keyset.Builder addKey(int i, com.google.crypto.tink.proto.Keyset.Key key) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.Keyset) this.instance).addKey(i, key);
            return this;
        }

        public final com.google.crypto.tink.proto.Keyset.Builder addKey(com.google.crypto.tink.proto.Keyset.Key.Builder builder) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.Keyset) this.instance).addKey(builder.build());
            return this;
        }

        public final com.google.crypto.tink.proto.Keyset.Builder addKey(int i, com.google.crypto.tink.proto.Keyset.Key.Builder builder) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.Keyset) this.instance).addKey(i, builder.build());
            return this;
        }

        public final com.google.crypto.tink.proto.Keyset.Builder addAllKey(java.lang.Iterable<? extends com.google.crypto.tink.proto.Keyset.Key> iterable) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.Keyset) this.instance).addAllKey(iterable);
            return this;
        }

        public final com.google.crypto.tink.proto.Keyset.Builder clearKey() {
            copyOnWrite();
            ((com.google.crypto.tink.proto.Keyset) this.instance).clearKey();
            return this;
        }

        public final com.google.crypto.tink.proto.Keyset.Builder removeKey(int i) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.Keyset) this.instance).removeKey(i);
            return this;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.crypto.tink.shaded.protobuf.Parser parser;
        com.google.crypto.tink.proto.Keyset.AnonymousClass1 anonymousClass1 = null;
        switch (com.google.crypto.tink.proto.Keyset.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new com.google.crypto.tink.proto.Keyset();
            case 2:
                return new com.google.crypto.tink.proto.Keyset.Builder(anonymousClass1);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new java.lang.Object[]{"primaryKeyId_", "key_", com.google.crypto.tink.proto.Keyset.Key.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.Keyset> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.google.crypto.tink.proto.Keyset.class) {
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
        com.google.crypto.tink.proto.Keyset keyset = new com.google.crypto.tink.proto.Keyset();
        DEFAULT_INSTANCE = keyset;
        com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.registerDefaultInstance(com.google.crypto.tink.proto.Keyset.class, keyset);
    }

    public static com.google.crypto.tink.proto.Keyset getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.Keyset> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
