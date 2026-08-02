package com.google.crypto.tink.proto;

/* loaded from: classes4.dex */
public final class AesCtrHmacAeadKeyFormat extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat, com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.Builder> implements com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormatOrBuilder {
    public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
    private static final com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat> PARSER;
    private com.google.crypto.tink.proto.AesCtrKeyFormat aesCtrKeyFormat_;
    private int bitField0_;
    private com.google.crypto.tink.proto.HmacKeyFormat hmacKeyFormat_;

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

    private AesCtrHmacAeadKeyFormat() {
    }

    @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormatOrBuilder
    public final boolean hasAesCtrKeyFormat() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormatOrBuilder
    public final com.google.crypto.tink.proto.AesCtrKeyFormat getAesCtrKeyFormat() {
        com.google.crypto.tink.proto.AesCtrKeyFormat aesCtrKeyFormat = this.aesCtrKeyFormat_;
        return aesCtrKeyFormat == null ? com.google.crypto.tink.proto.AesCtrKeyFormat.getDefaultInstance() : aesCtrKeyFormat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAesCtrKeyFormat(com.google.crypto.tink.proto.AesCtrKeyFormat aesCtrKeyFormat) {
        this.aesCtrKeyFormat_ = aesCtrKeyFormat;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAesCtrKeyFormat(com.google.crypto.tink.proto.AesCtrKeyFormat aesCtrKeyFormat) {
        com.google.crypto.tink.proto.AesCtrKeyFormat aesCtrKeyFormat2 = this.aesCtrKeyFormat_;
        if (aesCtrKeyFormat2 != null && aesCtrKeyFormat2 != com.google.crypto.tink.proto.AesCtrKeyFormat.getDefaultInstance()) {
            this.aesCtrKeyFormat_ = com.google.crypto.tink.proto.AesCtrKeyFormat.newBuilder(this.aesCtrKeyFormat_).mergeFrom((com.google.crypto.tink.proto.AesCtrKeyFormat.Builder) aesCtrKeyFormat).buildPartial();
        } else {
            this.aesCtrKeyFormat_ = aesCtrKeyFormat;
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAesCtrKeyFormat() {
        this.aesCtrKeyFormat_ = null;
        this.bitField0_ &= -2;
    }

    @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormatOrBuilder
    public final boolean hasHmacKeyFormat() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormatOrBuilder
    public final com.google.crypto.tink.proto.HmacKeyFormat getHmacKeyFormat() {
        com.google.crypto.tink.proto.HmacKeyFormat hmacKeyFormat = this.hmacKeyFormat_;
        return hmacKeyFormat == null ? com.google.crypto.tink.proto.HmacKeyFormat.getDefaultInstance() : hmacKeyFormat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHmacKeyFormat(com.google.crypto.tink.proto.HmacKeyFormat hmacKeyFormat) {
        this.hmacKeyFormat_ = hmacKeyFormat;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHmacKeyFormat(com.google.crypto.tink.proto.HmacKeyFormat hmacKeyFormat) {
        com.google.crypto.tink.proto.HmacKeyFormat hmacKeyFormat2 = this.hmacKeyFormat_;
        if (hmacKeyFormat2 != null && hmacKeyFormat2 != com.google.crypto.tink.proto.HmacKeyFormat.getDefaultInstance()) {
            this.hmacKeyFormat_ = com.google.crypto.tink.proto.HmacKeyFormat.newBuilder(this.hmacKeyFormat_).mergeFrom((com.google.crypto.tink.proto.HmacKeyFormat.Builder) hmacKeyFormat).buildPartial();
        } else {
            this.hmacKeyFormat_ = hmacKeyFormat;
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHmacKeyFormat() {
        this.hmacKeyFormat_ = null;
        this.bitField0_ &= -3;
    }

    public static com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat parseFrom(java.nio.ByteBuffer byteBuffer, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat parseFrom(byte[] bArr) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat parseFrom(byte[] bArr, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat parseFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat parseDelimitedFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
        return (com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.Builder newBuilder(com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat aesCtrHmacAeadKeyFormat) {
        return DEFAULT_INSTANCE.createBuilder(aesCtrHmacAeadKeyFormat);
    }

    public static final class Builder extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat, com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.Builder> implements com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormatOrBuilder {
        /* synthetic */ Builder(com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.AnonymousClass1 anonymousClass1) {
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
            return super.internalMergeFrom((com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.Builder) abstractMessageLite);
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
            super(com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormatOrBuilder
        public final boolean hasAesCtrKeyFormat() {
            return ((com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat) this.instance).hasAesCtrKeyFormat();
        }

        @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormatOrBuilder
        public final com.google.crypto.tink.proto.AesCtrKeyFormat getAesCtrKeyFormat() {
            return ((com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat) this.instance).getAesCtrKeyFormat();
        }

        public final com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.Builder setAesCtrKeyFormat(com.google.crypto.tink.proto.AesCtrKeyFormat aesCtrKeyFormat) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat) this.instance).setAesCtrKeyFormat(aesCtrKeyFormat);
            return this;
        }

        public final com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.Builder setAesCtrKeyFormat(com.google.crypto.tink.proto.AesCtrKeyFormat.Builder builder) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat) this.instance).setAesCtrKeyFormat(builder.build());
            return this;
        }

        public final com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.Builder mergeAesCtrKeyFormat(com.google.crypto.tink.proto.AesCtrKeyFormat aesCtrKeyFormat) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat) this.instance).mergeAesCtrKeyFormat(aesCtrKeyFormat);
            return this;
        }

        public final com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.Builder clearAesCtrKeyFormat() {
            copyOnWrite();
            ((com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat) this.instance).clearAesCtrKeyFormat();
            return this;
        }

        @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormatOrBuilder
        public final boolean hasHmacKeyFormat() {
            return ((com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat) this.instance).hasHmacKeyFormat();
        }

        @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormatOrBuilder
        public final com.google.crypto.tink.proto.HmacKeyFormat getHmacKeyFormat() {
            return ((com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat) this.instance).getHmacKeyFormat();
        }

        public final com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.Builder setHmacKeyFormat(com.google.crypto.tink.proto.HmacKeyFormat hmacKeyFormat) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat) this.instance).setHmacKeyFormat(hmacKeyFormat);
            return this;
        }

        public final com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.Builder setHmacKeyFormat(com.google.crypto.tink.proto.HmacKeyFormat.Builder builder) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat) this.instance).setHmacKeyFormat(builder.build());
            return this;
        }

        public final com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.Builder mergeHmacKeyFormat(com.google.crypto.tink.proto.HmacKeyFormat hmacKeyFormat) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat) this.instance).mergeHmacKeyFormat(hmacKeyFormat);
            return this;
        }

        public final com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.Builder clearHmacKeyFormat() {
            copyOnWrite();
            ((com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat) this.instance).clearHmacKeyFormat();
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat$1, reason: invalid class name */
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
        com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.AnonymousClass1 anonymousClass1 = null;
        switch (com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat();
            case 2:
                return new com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.Builder(anonymousClass1);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new java.lang.Object[]{"bitField0_", "aesCtrKeyFormat_", "hmacKeyFormat_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.class) {
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
        com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat aesCtrHmacAeadKeyFormat = new com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat();
        DEFAULT_INSTANCE = aesCtrHmacAeadKeyFormat;
        com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.registerDefaultInstance(com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.class, aesCtrHmacAeadKeyFormat);
    }

    public static com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
