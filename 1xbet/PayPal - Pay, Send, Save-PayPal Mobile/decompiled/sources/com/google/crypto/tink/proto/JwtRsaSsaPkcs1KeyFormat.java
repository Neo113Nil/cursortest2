package com.google.crypto.tink.proto;

/* loaded from: classes9.dex */
public final class JwtRsaSsaPkcs1KeyFormat extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat, com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.Builder> implements com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormatOrBuilder {
    public static final int ALGORITHM_FIELD_NUMBER = 2;
    private static final com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat DEFAULT_INSTANCE;
    public static final int MODULUS_SIZE_IN_BITS_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat> PARSER = null;
    public static final int PUBLIC_EXPONENT_FIELD_NUMBER = 4;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int algorithm_;
    private int modulusSizeInBits_;
    private com.google.crypto.tink.shaded.protobuf.ByteString publicExponent_ = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY;
    private int version_;

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

    private JwtRsaSsaPkcs1KeyFormat() {
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormatOrBuilder
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

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormatOrBuilder
    public final int getAlgorithmValue() {
        return this.algorithm_;
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormatOrBuilder
    public final com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm getAlgorithm() {
        com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm forNumber = com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm.forNumber(this.algorithm_);
        return forNumber == null ? com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm.UNRECOGNIZED : forNumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlgorithmValue(int i) {
        this.algorithm_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlgorithm(com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm jwtRsaSsaPkcs1Algorithm) {
        this.algorithm_ = jwtRsaSsaPkcs1Algorithm.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlgorithm() {
        this.algorithm_ = 0;
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormatOrBuilder
    public final int getModulusSizeInBits() {
        return this.modulusSizeInBits_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModulusSizeInBits(int i) {
        this.modulusSizeInBits_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearModulusSizeInBits() {
        this.modulusSizeInBits_ = 0;
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormatOrBuilder
    public final com.google.crypto.tink.shaded.protobuf.ByteString getPublicExponent() {
        return this.publicExponent_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublicExponent(com.google.crypto.tink.shaded.protobuf.ByteString byteString) {
        this.publicExponent_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPublicExponent() {
        this.publicExponent_ = getDefaultInstance().getPublicExponent();
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat parseFrom(java.nio.ByteBuffer byteBuffer, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat parseFrom(byte[] bArr) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat parseFrom(byte[] bArr, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat parseFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat parseDelimitedFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
        return (com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.Builder newBuilder(com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat jwtRsaSsaPkcs1KeyFormat) {
        return DEFAULT_INSTANCE.createBuilder(jwtRsaSsaPkcs1KeyFormat);
    }

    public static final class Builder extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat, com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.Builder> implements com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormatOrBuilder {
        /* synthetic */ Builder(com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.AnonymousClass1 anonymousClass1) {
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
            return super.internalMergeFrom((com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.Builder) abstractMessageLite);
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
            super(com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormatOrBuilder
        public final int getVersion() {
            return ((com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat) this.instance).getVersion();
        }

        public final com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.Builder setVersion(int i) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat) this.instance).setVersion(i);
            return this;
        }

        public final com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.Builder clearVersion() {
            copyOnWrite();
            ((com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat) this.instance).clearVersion();
            return this;
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormatOrBuilder
        public final int getAlgorithmValue() {
            return ((com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat) this.instance).getAlgorithmValue();
        }

        public final com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.Builder setAlgorithmValue(int i) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat) this.instance).setAlgorithmValue(i);
            return this;
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormatOrBuilder
        public final com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm getAlgorithm() {
            return ((com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat) this.instance).getAlgorithm();
        }

        public final com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.Builder setAlgorithm(com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm jwtRsaSsaPkcs1Algorithm) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat) this.instance).setAlgorithm(jwtRsaSsaPkcs1Algorithm);
            return this;
        }

        public final com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.Builder clearAlgorithm() {
            copyOnWrite();
            ((com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat) this.instance).clearAlgorithm();
            return this;
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormatOrBuilder
        public final int getModulusSizeInBits() {
            return ((com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat) this.instance).getModulusSizeInBits();
        }

        public final com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.Builder setModulusSizeInBits(int i) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat) this.instance).setModulusSizeInBits(i);
            return this;
        }

        public final com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.Builder clearModulusSizeInBits() {
            copyOnWrite();
            ((com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat) this.instance).clearModulusSizeInBits();
            return this;
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormatOrBuilder
        public final com.google.crypto.tink.shaded.protobuf.ByteString getPublicExponent() {
            return ((com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat) this.instance).getPublicExponent();
        }

        public final com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.Builder setPublicExponent(com.google.crypto.tink.shaded.protobuf.ByteString byteString) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat) this.instance).setPublicExponent(byteString);
            return this;
        }

        public final com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.Builder clearPublicExponent() {
            copyOnWrite();
            ((com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat) this.instance).clearPublicExponent();
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat$1, reason: invalid class name */
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
        com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.AnonymousClass1 anonymousClass1 = null;
        switch (com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat();
            case 2:
                return new com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.Builder(anonymousClass1);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\f\u0003\u000b\u0004\n", new java.lang.Object[]{"version_", "algorithm_", "modulusSizeInBits_", "publicExponent_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.class) {
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
        com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat jwtRsaSsaPkcs1KeyFormat = new com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat();
        DEFAULT_INSTANCE = jwtRsaSsaPkcs1KeyFormat;
        com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.registerDefaultInstance(com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.class, jwtRsaSsaPkcs1KeyFormat);
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
