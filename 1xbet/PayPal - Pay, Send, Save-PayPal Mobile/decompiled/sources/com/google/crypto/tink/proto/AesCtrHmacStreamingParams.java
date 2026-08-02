package com.google.crypto.tink.proto;

/* loaded from: classes9.dex */
public final class AesCtrHmacStreamingParams extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<com.google.crypto.tink.proto.AesCtrHmacStreamingParams, com.google.crypto.tink.proto.AesCtrHmacStreamingParams.Builder> implements com.google.crypto.tink.proto.AesCtrHmacStreamingParamsOrBuilder {
    public static final int CIPHERTEXT_SEGMENT_SIZE_FIELD_NUMBER = 1;
    private static final com.google.crypto.tink.proto.AesCtrHmacStreamingParams DEFAULT_INSTANCE;
    public static final int DERIVED_KEY_SIZE_FIELD_NUMBER = 2;
    public static final int HKDF_HASH_TYPE_FIELD_NUMBER = 3;
    public static final int HMAC_PARAMS_FIELD_NUMBER = 4;
    private static volatile com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.AesCtrHmacStreamingParams> PARSER;
    private int bitField0_;
    private int ciphertextSegmentSize_;
    private int derivedKeySize_;
    private int hkdfHashType_;
    private com.google.crypto.tink.proto.HmacParams hmacParams_;

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

    private AesCtrHmacStreamingParams() {
    }

    @Override // com.google.crypto.tink.proto.AesCtrHmacStreamingParamsOrBuilder
    public final int getCiphertextSegmentSize() {
        return this.ciphertextSegmentSize_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCiphertextSegmentSize(int i) {
        this.ciphertextSegmentSize_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCiphertextSegmentSize() {
        this.ciphertextSegmentSize_ = 0;
    }

    @Override // com.google.crypto.tink.proto.AesCtrHmacStreamingParamsOrBuilder
    public final int getDerivedKeySize() {
        return this.derivedKeySize_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDerivedKeySize(int i) {
        this.derivedKeySize_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDerivedKeySize() {
        this.derivedKeySize_ = 0;
    }

    @Override // com.google.crypto.tink.proto.AesCtrHmacStreamingParamsOrBuilder
    public final int getHkdfHashTypeValue() {
        return this.hkdfHashType_;
    }

    @Override // com.google.crypto.tink.proto.AesCtrHmacStreamingParamsOrBuilder
    public final com.google.crypto.tink.proto.HashType getHkdfHashType() {
        com.google.crypto.tink.proto.HashType forNumber = com.google.crypto.tink.proto.HashType.forNumber(this.hkdfHashType_);
        return forNumber == null ? com.google.crypto.tink.proto.HashType.UNRECOGNIZED : forNumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHkdfHashTypeValue(int i) {
        this.hkdfHashType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHkdfHashType(com.google.crypto.tink.proto.HashType hashType) {
        this.hkdfHashType_ = hashType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHkdfHashType() {
        this.hkdfHashType_ = 0;
    }

    @Override // com.google.crypto.tink.proto.AesCtrHmacStreamingParamsOrBuilder
    public final boolean hasHmacParams() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.crypto.tink.proto.AesCtrHmacStreamingParamsOrBuilder
    public final com.google.crypto.tink.proto.HmacParams getHmacParams() {
        com.google.crypto.tink.proto.HmacParams hmacParams = this.hmacParams_;
        return hmacParams == null ? com.google.crypto.tink.proto.HmacParams.getDefaultInstance() : hmacParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHmacParams(com.google.crypto.tink.proto.HmacParams hmacParams) {
        this.hmacParams_ = hmacParams;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHmacParams(com.google.crypto.tink.proto.HmacParams hmacParams) {
        com.google.crypto.tink.proto.HmacParams hmacParams2 = this.hmacParams_;
        if (hmacParams2 != null && hmacParams2 != com.google.crypto.tink.proto.HmacParams.getDefaultInstance()) {
            this.hmacParams_ = com.google.crypto.tink.proto.HmacParams.newBuilder(this.hmacParams_).mergeFrom((com.google.crypto.tink.proto.HmacParams.Builder) hmacParams).buildPartial();
        } else {
            this.hmacParams_ = hmacParams;
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHmacParams() {
        this.hmacParams_ = null;
        this.bitField0_ &= -2;
    }

    public static com.google.crypto.tink.proto.AesCtrHmacStreamingParams parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.AesCtrHmacStreamingParams) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.crypto.tink.proto.AesCtrHmacStreamingParams parseFrom(java.nio.ByteBuffer byteBuffer, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.AesCtrHmacStreamingParams) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.AesCtrHmacStreamingParams parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.AesCtrHmacStreamingParams) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.google.crypto.tink.proto.AesCtrHmacStreamingParams parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.AesCtrHmacStreamingParams) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.AesCtrHmacStreamingParams parseFrom(byte[] bArr) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.AesCtrHmacStreamingParams) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.google.crypto.tink.proto.AesCtrHmacStreamingParams parseFrom(byte[] bArr, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.AesCtrHmacStreamingParams) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.AesCtrHmacStreamingParams parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.google.crypto.tink.proto.AesCtrHmacStreamingParams) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.crypto.tink.proto.AesCtrHmacStreamingParams parseFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.proto.AesCtrHmacStreamingParams) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.AesCtrHmacStreamingParams parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.google.crypto.tink.proto.AesCtrHmacStreamingParams) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.crypto.tink.proto.AesCtrHmacStreamingParams parseDelimitedFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.proto.AesCtrHmacStreamingParams) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.AesCtrHmacStreamingParams parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
        return (com.google.crypto.tink.proto.AesCtrHmacStreamingParams) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.google.crypto.tink.proto.AesCtrHmacStreamingParams parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.proto.AesCtrHmacStreamingParams) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.AesCtrHmacStreamingParams.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.google.crypto.tink.proto.AesCtrHmacStreamingParams.Builder newBuilder(com.google.crypto.tink.proto.AesCtrHmacStreamingParams aesCtrHmacStreamingParams) {
        return DEFAULT_INSTANCE.createBuilder(aesCtrHmacStreamingParams);
    }

    public static final class Builder extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<com.google.crypto.tink.proto.AesCtrHmacStreamingParams, com.google.crypto.tink.proto.AesCtrHmacStreamingParams.Builder> implements com.google.crypto.tink.proto.AesCtrHmacStreamingParamsOrBuilder {
        /* synthetic */ Builder(com.google.crypto.tink.proto.AesCtrHmacStreamingParams.AnonymousClass1 anonymousClass1) {
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
            return super.internalMergeFrom((com.google.crypto.tink.proto.AesCtrHmacStreamingParams.Builder) abstractMessageLite);
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
            super(com.google.crypto.tink.proto.AesCtrHmacStreamingParams.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.proto.AesCtrHmacStreamingParamsOrBuilder
        public final int getCiphertextSegmentSize() {
            return ((com.google.crypto.tink.proto.AesCtrHmacStreamingParams) this.instance).getCiphertextSegmentSize();
        }

        public final com.google.crypto.tink.proto.AesCtrHmacStreamingParams.Builder setCiphertextSegmentSize(int i) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.AesCtrHmacStreamingParams) this.instance).setCiphertextSegmentSize(i);
            return this;
        }

        public final com.google.crypto.tink.proto.AesCtrHmacStreamingParams.Builder clearCiphertextSegmentSize() {
            copyOnWrite();
            ((com.google.crypto.tink.proto.AesCtrHmacStreamingParams) this.instance).clearCiphertextSegmentSize();
            return this;
        }

        @Override // com.google.crypto.tink.proto.AesCtrHmacStreamingParamsOrBuilder
        public final int getDerivedKeySize() {
            return ((com.google.crypto.tink.proto.AesCtrHmacStreamingParams) this.instance).getDerivedKeySize();
        }

        public final com.google.crypto.tink.proto.AesCtrHmacStreamingParams.Builder setDerivedKeySize(int i) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.AesCtrHmacStreamingParams) this.instance).setDerivedKeySize(i);
            return this;
        }

        public final com.google.crypto.tink.proto.AesCtrHmacStreamingParams.Builder clearDerivedKeySize() {
            copyOnWrite();
            ((com.google.crypto.tink.proto.AesCtrHmacStreamingParams) this.instance).clearDerivedKeySize();
            return this;
        }

        @Override // com.google.crypto.tink.proto.AesCtrHmacStreamingParamsOrBuilder
        public final int getHkdfHashTypeValue() {
            return ((com.google.crypto.tink.proto.AesCtrHmacStreamingParams) this.instance).getHkdfHashTypeValue();
        }

        public final com.google.crypto.tink.proto.AesCtrHmacStreamingParams.Builder setHkdfHashTypeValue(int i) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.AesCtrHmacStreamingParams) this.instance).setHkdfHashTypeValue(i);
            return this;
        }

        @Override // com.google.crypto.tink.proto.AesCtrHmacStreamingParamsOrBuilder
        public final com.google.crypto.tink.proto.HashType getHkdfHashType() {
            return ((com.google.crypto.tink.proto.AesCtrHmacStreamingParams) this.instance).getHkdfHashType();
        }

        public final com.google.crypto.tink.proto.AesCtrHmacStreamingParams.Builder setHkdfHashType(com.google.crypto.tink.proto.HashType hashType) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.AesCtrHmacStreamingParams) this.instance).setHkdfHashType(hashType);
            return this;
        }

        public final com.google.crypto.tink.proto.AesCtrHmacStreamingParams.Builder clearHkdfHashType() {
            copyOnWrite();
            ((com.google.crypto.tink.proto.AesCtrHmacStreamingParams) this.instance).clearHkdfHashType();
            return this;
        }

        @Override // com.google.crypto.tink.proto.AesCtrHmacStreamingParamsOrBuilder
        public final boolean hasHmacParams() {
            return ((com.google.crypto.tink.proto.AesCtrHmacStreamingParams) this.instance).hasHmacParams();
        }

        @Override // com.google.crypto.tink.proto.AesCtrHmacStreamingParamsOrBuilder
        public final com.google.crypto.tink.proto.HmacParams getHmacParams() {
            return ((com.google.crypto.tink.proto.AesCtrHmacStreamingParams) this.instance).getHmacParams();
        }

        public final com.google.crypto.tink.proto.AesCtrHmacStreamingParams.Builder setHmacParams(com.google.crypto.tink.proto.HmacParams hmacParams) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.AesCtrHmacStreamingParams) this.instance).setHmacParams(hmacParams);
            return this;
        }

        public final com.google.crypto.tink.proto.AesCtrHmacStreamingParams.Builder setHmacParams(com.google.crypto.tink.proto.HmacParams.Builder builder) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.AesCtrHmacStreamingParams) this.instance).setHmacParams(builder.build());
            return this;
        }

        public final com.google.crypto.tink.proto.AesCtrHmacStreamingParams.Builder mergeHmacParams(com.google.crypto.tink.proto.HmacParams hmacParams) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.AesCtrHmacStreamingParams) this.instance).mergeHmacParams(hmacParams);
            return this;
        }

        public final com.google.crypto.tink.proto.AesCtrHmacStreamingParams.Builder clearHmacParams() {
            copyOnWrite();
            ((com.google.crypto.tink.proto.AesCtrHmacStreamingParams) this.instance).clearHmacParams();
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.proto.AesCtrHmacStreamingParams$1, reason: invalid class name */
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
        com.google.crypto.tink.proto.AesCtrHmacStreamingParams.AnonymousClass1 anonymousClass1 = null;
        switch (com.google.crypto.tink.proto.AesCtrHmacStreamingParams.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new com.google.crypto.tink.proto.AesCtrHmacStreamingParams();
            case 2:
                return new com.google.crypto.tink.proto.AesCtrHmacStreamingParams.Builder(anonymousClass1);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\f\u0004ဉ\u0000", new java.lang.Object[]{"bitField0_", "ciphertextSegmentSize_", "derivedKeySize_", "hkdfHashType_", "hmacParams_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.AesCtrHmacStreamingParams> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.google.crypto.tink.proto.AesCtrHmacStreamingParams.class) {
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
        com.google.crypto.tink.proto.AesCtrHmacStreamingParams aesCtrHmacStreamingParams = new com.google.crypto.tink.proto.AesCtrHmacStreamingParams();
        DEFAULT_INSTANCE = aesCtrHmacStreamingParams;
        com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.registerDefaultInstance(com.google.crypto.tink.proto.AesCtrHmacStreamingParams.class, aesCtrHmacStreamingParams);
    }

    public static com.google.crypto.tink.proto.AesCtrHmacStreamingParams getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.AesCtrHmacStreamingParams> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
