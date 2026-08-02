package com.google.crypto.tink.proto;

/* loaded from: classes9.dex */
public final class JwtRsaSsaPssPrivateKey extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey, com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.Builder> implements com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder {
    public static final int CRT_FIELD_NUMBER = 8;
    private static final com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey DEFAULT_INSTANCE;
    public static final int DP_FIELD_NUMBER = 6;
    public static final int DQ_FIELD_NUMBER = 7;
    public static final int D_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey> PARSER = null;
    public static final int PUBLIC_KEY_FIELD_NUMBER = 2;
    public static final int P_FIELD_NUMBER = 4;
    public static final int Q_FIELD_NUMBER = 5;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey publicKey_;
    private int version_;
    private com.google.crypto.tink.shaded.protobuf.ByteString d_ = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY;
    private com.google.crypto.tink.shaded.protobuf.ByteString p_ = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY;
    private com.google.crypto.tink.shaded.protobuf.ByteString q_ = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY;
    private com.google.crypto.tink.shaded.protobuf.ByteString dp_ = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY;
    private com.google.crypto.tink.shaded.protobuf.ByteString dq_ = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY;
    private com.google.crypto.tink.shaded.protobuf.ByteString crt_ = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY;

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

    private JwtRsaSsaPssPrivateKey() {
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
    public final int getVersion() {
        return this.version_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(int i) {
        this.version_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = 0;
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
    public final boolean hasPublicKey() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
    public final com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey getPublicKey() {
        com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey jwtRsaSsaPssPublicKey = this.publicKey_;
        return jwtRsaSsaPssPublicKey == null ? com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey.getDefaultInstance() : jwtRsaSsaPssPublicKey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublicKey(com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey jwtRsaSsaPssPublicKey) {
        this.publicKey_ = jwtRsaSsaPssPublicKey;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePublicKey(com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey jwtRsaSsaPssPublicKey) {
        com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey jwtRsaSsaPssPublicKey2 = this.publicKey_;
        if (jwtRsaSsaPssPublicKey2 != null && jwtRsaSsaPssPublicKey2 != com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey.getDefaultInstance()) {
            this.publicKey_ = com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey.newBuilder(this.publicKey_).mergeFrom((com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey.Builder) jwtRsaSsaPssPublicKey).buildPartial();
        } else {
            this.publicKey_ = jwtRsaSsaPssPublicKey;
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPublicKey() {
        this.publicKey_ = null;
        this.bitField0_ &= -2;
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
    public final com.google.crypto.tink.shaded.protobuf.ByteString getD() {
        return this.d_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setD(com.google.crypto.tink.shaded.protobuf.ByteString byteString) {
        this.d_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearD() {
        this.d_ = getDefaultInstance().getD();
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
    public final com.google.crypto.tink.shaded.protobuf.ByteString getP() {
        return this.p_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setP(com.google.crypto.tink.shaded.protobuf.ByteString byteString) {
        this.p_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearP() {
        this.p_ = getDefaultInstance().getP();
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
    public final com.google.crypto.tink.shaded.protobuf.ByteString getQ() {
        return this.q_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQ(com.google.crypto.tink.shaded.protobuf.ByteString byteString) {
        this.q_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQ() {
        this.q_ = getDefaultInstance().getQ();
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
    public final com.google.crypto.tink.shaded.protobuf.ByteString getDp() {
        return this.dp_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDp(com.google.crypto.tink.shaded.protobuf.ByteString byteString) {
        this.dp_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDp() {
        this.dp_ = getDefaultInstance().getDp();
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
    public final com.google.crypto.tink.shaded.protobuf.ByteString getDq() {
        return this.dq_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDq(com.google.crypto.tink.shaded.protobuf.ByteString byteString) {
        this.dq_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDq() {
        this.dq_ = getDefaultInstance().getDq();
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
    public final com.google.crypto.tink.shaded.protobuf.ByteString getCrt() {
        return this.crt_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCrt(com.google.crypto.tink.shaded.protobuf.ByteString byteString) {
        this.crt_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCrt() {
        this.crt_ = getDefaultInstance().getCrt();
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey parseFrom(java.nio.ByteBuffer byteBuffer, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey parseFrom(byte[] bArr) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey parseFrom(byte[] bArr, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey parseFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey parseDelimitedFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
        return (com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.Builder newBuilder(com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey jwtRsaSsaPssPrivateKey) {
        return DEFAULT_INSTANCE.createBuilder(jwtRsaSsaPssPrivateKey);
    }

    public static final class Builder extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey, com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.Builder> implements com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder {
        /* synthetic */ Builder(com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.AnonymousClass1 anonymousClass1) {
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
            return super.internalMergeFrom((com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.Builder) abstractMessageLite);
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
            super(com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
        public final int getVersion() {
            return ((com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) this.instance).getVersion();
        }

        public final com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.Builder setVersion(int i) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) this.instance).setVersion(i);
            return this;
        }

        public final com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.Builder clearVersion() {
            copyOnWrite();
            ((com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) this.instance).clearVersion();
            return this;
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
        public final boolean hasPublicKey() {
            return ((com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) this.instance).hasPublicKey();
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
        public final com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey getPublicKey() {
            return ((com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) this.instance).getPublicKey();
        }

        public final com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.Builder setPublicKey(com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey jwtRsaSsaPssPublicKey) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) this.instance).setPublicKey(jwtRsaSsaPssPublicKey);
            return this;
        }

        public final com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.Builder setPublicKey(com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey.Builder builder) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) this.instance).setPublicKey(builder.build());
            return this;
        }

        public final com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.Builder mergePublicKey(com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey jwtRsaSsaPssPublicKey) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) this.instance).mergePublicKey(jwtRsaSsaPssPublicKey);
            return this;
        }

        public final com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.Builder clearPublicKey() {
            copyOnWrite();
            ((com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) this.instance).clearPublicKey();
            return this;
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
        public final com.google.crypto.tink.shaded.protobuf.ByteString getD() {
            return ((com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) this.instance).getD();
        }

        public final com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.Builder setD(com.google.crypto.tink.shaded.protobuf.ByteString byteString) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) this.instance).setD(byteString);
            return this;
        }

        public final com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.Builder clearD() {
            copyOnWrite();
            ((com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) this.instance).clearD();
            return this;
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
        public final com.google.crypto.tink.shaded.protobuf.ByteString getP() {
            return ((com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) this.instance).getP();
        }

        public final com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.Builder setP(com.google.crypto.tink.shaded.protobuf.ByteString byteString) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) this.instance).setP(byteString);
            return this;
        }

        public final com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.Builder clearP() {
            copyOnWrite();
            ((com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) this.instance).clearP();
            return this;
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
        public final com.google.crypto.tink.shaded.protobuf.ByteString getQ() {
            return ((com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) this.instance).getQ();
        }

        public final com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.Builder setQ(com.google.crypto.tink.shaded.protobuf.ByteString byteString) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) this.instance).setQ(byteString);
            return this;
        }

        public final com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.Builder clearQ() {
            copyOnWrite();
            ((com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) this.instance).clearQ();
            return this;
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
        public final com.google.crypto.tink.shaded.protobuf.ByteString getDp() {
            return ((com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) this.instance).getDp();
        }

        public final com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.Builder setDp(com.google.crypto.tink.shaded.protobuf.ByteString byteString) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) this.instance).setDp(byteString);
            return this;
        }

        public final com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.Builder clearDp() {
            copyOnWrite();
            ((com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) this.instance).clearDp();
            return this;
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
        public final com.google.crypto.tink.shaded.protobuf.ByteString getDq() {
            return ((com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) this.instance).getDq();
        }

        public final com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.Builder setDq(com.google.crypto.tink.shaded.protobuf.ByteString byteString) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) this.instance).setDq(byteString);
            return this;
        }

        public final com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.Builder clearDq() {
            copyOnWrite();
            ((com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) this.instance).clearDq();
            return this;
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
        public final com.google.crypto.tink.shaded.protobuf.ByteString getCrt() {
            return ((com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) this.instance).getCrt();
        }

        public final com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.Builder setCrt(com.google.crypto.tink.shaded.protobuf.ByteString byteString) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) this.instance).setCrt(byteString);
            return this;
        }

        public final com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.Builder clearCrt() {
            copyOnWrite();
            ((com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) this.instance).clearCrt();
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey$1, reason: invalid class name */
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
        com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.AnonymousClass1 anonymousClass1 = null;
        switch (com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey();
            case 2:
                return new com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.Builder(anonymousClass1);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n", new java.lang.Object[]{"bitField0_", "version_", "publicKey_", "d_", "p_", "q_", "dp_", "dq_", "crt_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.class) {
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
        com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey jwtRsaSsaPssPrivateKey = new com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey();
        DEFAULT_INSTANCE = jwtRsaSsaPssPrivateKey;
        com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.registerDefaultInstance(com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.class, jwtRsaSsaPssPrivateKey);
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
