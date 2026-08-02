package com.google.crypto.tink.proto;

/* loaded from: classes9.dex */
public final class EciesAeadHkdfParams extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<com.google.crypto.tink.proto.EciesAeadHkdfParams, com.google.crypto.tink.proto.EciesAeadHkdfParams.Builder> implements com.google.crypto.tink.proto.EciesAeadHkdfParamsOrBuilder {
    private static final com.google.crypto.tink.proto.EciesAeadHkdfParams DEFAULT_INSTANCE;
    public static final int DEM_PARAMS_FIELD_NUMBER = 2;
    public static final int EC_POINT_FORMAT_FIELD_NUMBER = 3;
    public static final int KEM_PARAMS_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.EciesAeadHkdfParams> PARSER;
    private int bitField0_;
    private com.google.crypto.tink.proto.EciesAeadDemParams demParams_;
    private int ecPointFormat_;
    private com.google.crypto.tink.proto.EciesHkdfKemParams kemParams_;

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

    private EciesAeadHkdfParams() {
    }

    @Override // com.google.crypto.tink.proto.EciesAeadHkdfParamsOrBuilder
    public final boolean hasKemParams() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.crypto.tink.proto.EciesAeadHkdfParamsOrBuilder
    public final com.google.crypto.tink.proto.EciesHkdfKemParams getKemParams() {
        com.google.crypto.tink.proto.EciesHkdfKemParams eciesHkdfKemParams = this.kemParams_;
        return eciesHkdfKemParams == null ? com.google.crypto.tink.proto.EciesHkdfKemParams.getDefaultInstance() : eciesHkdfKemParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKemParams(com.google.crypto.tink.proto.EciesHkdfKemParams eciesHkdfKemParams) {
        this.kemParams_ = eciesHkdfKemParams;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeKemParams(com.google.crypto.tink.proto.EciesHkdfKemParams eciesHkdfKemParams) {
        com.google.crypto.tink.proto.EciesHkdfKemParams eciesHkdfKemParams2 = this.kemParams_;
        if (eciesHkdfKemParams2 != null && eciesHkdfKemParams2 != com.google.crypto.tink.proto.EciesHkdfKemParams.getDefaultInstance()) {
            this.kemParams_ = com.google.crypto.tink.proto.EciesHkdfKemParams.newBuilder(this.kemParams_).mergeFrom((com.google.crypto.tink.proto.EciesHkdfKemParams.Builder) eciesHkdfKemParams).buildPartial();
        } else {
            this.kemParams_ = eciesHkdfKemParams;
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKemParams() {
        this.kemParams_ = null;
        this.bitField0_ &= -2;
    }

    @Override // com.google.crypto.tink.proto.EciesAeadHkdfParamsOrBuilder
    public final boolean hasDemParams() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.crypto.tink.proto.EciesAeadHkdfParamsOrBuilder
    public final com.google.crypto.tink.proto.EciesAeadDemParams getDemParams() {
        com.google.crypto.tink.proto.EciesAeadDemParams eciesAeadDemParams = this.demParams_;
        return eciesAeadDemParams == null ? com.google.crypto.tink.proto.EciesAeadDemParams.getDefaultInstance() : eciesAeadDemParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDemParams(com.google.crypto.tink.proto.EciesAeadDemParams eciesAeadDemParams) {
        this.demParams_ = eciesAeadDemParams;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDemParams(com.google.crypto.tink.proto.EciesAeadDemParams eciesAeadDemParams) {
        com.google.crypto.tink.proto.EciesAeadDemParams eciesAeadDemParams2 = this.demParams_;
        if (eciesAeadDemParams2 != null && eciesAeadDemParams2 != com.google.crypto.tink.proto.EciesAeadDemParams.getDefaultInstance()) {
            this.demParams_ = com.google.crypto.tink.proto.EciesAeadDemParams.newBuilder(this.demParams_).mergeFrom((com.google.crypto.tink.proto.EciesAeadDemParams.Builder) eciesAeadDemParams).buildPartial();
        } else {
            this.demParams_ = eciesAeadDemParams;
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDemParams() {
        this.demParams_ = null;
        this.bitField0_ &= -3;
    }

    @Override // com.google.crypto.tink.proto.EciesAeadHkdfParamsOrBuilder
    public final int getEcPointFormatValue() {
        return this.ecPointFormat_;
    }

    @Override // com.google.crypto.tink.proto.EciesAeadHkdfParamsOrBuilder
    public final com.google.crypto.tink.proto.EcPointFormat getEcPointFormat() {
        com.google.crypto.tink.proto.EcPointFormat forNumber = com.google.crypto.tink.proto.EcPointFormat.forNumber(this.ecPointFormat_);
        return forNumber == null ? com.google.crypto.tink.proto.EcPointFormat.UNRECOGNIZED : forNumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEcPointFormatValue(int i) {
        this.ecPointFormat_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEcPointFormat(com.google.crypto.tink.proto.EcPointFormat ecPointFormat) {
        this.ecPointFormat_ = ecPointFormat.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEcPointFormat() {
        this.ecPointFormat_ = 0;
    }

    public static com.google.crypto.tink.proto.EciesAeadHkdfParams parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.EciesAeadHkdfParams) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.crypto.tink.proto.EciesAeadHkdfParams parseFrom(java.nio.ByteBuffer byteBuffer, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.EciesAeadHkdfParams) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.EciesAeadHkdfParams parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.EciesAeadHkdfParams) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.google.crypto.tink.proto.EciesAeadHkdfParams parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.EciesAeadHkdfParams) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.EciesAeadHkdfParams parseFrom(byte[] bArr) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.EciesAeadHkdfParams) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.google.crypto.tink.proto.EciesAeadHkdfParams parseFrom(byte[] bArr, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.EciesAeadHkdfParams) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.EciesAeadHkdfParams parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.google.crypto.tink.proto.EciesAeadHkdfParams) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.crypto.tink.proto.EciesAeadHkdfParams parseFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.proto.EciesAeadHkdfParams) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.EciesAeadHkdfParams parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.google.crypto.tink.proto.EciesAeadHkdfParams) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.crypto.tink.proto.EciesAeadHkdfParams parseDelimitedFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.proto.EciesAeadHkdfParams) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.EciesAeadHkdfParams parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
        return (com.google.crypto.tink.proto.EciesAeadHkdfParams) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.google.crypto.tink.proto.EciesAeadHkdfParams parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.proto.EciesAeadHkdfParams) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.EciesAeadHkdfParams.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.google.crypto.tink.proto.EciesAeadHkdfParams.Builder newBuilder(com.google.crypto.tink.proto.EciesAeadHkdfParams eciesAeadHkdfParams) {
        return DEFAULT_INSTANCE.createBuilder(eciesAeadHkdfParams);
    }

    public static final class Builder extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<com.google.crypto.tink.proto.EciesAeadHkdfParams, com.google.crypto.tink.proto.EciesAeadHkdfParams.Builder> implements com.google.crypto.tink.proto.EciesAeadHkdfParamsOrBuilder {
        /* synthetic */ Builder(com.google.crypto.tink.proto.EciesAeadHkdfParams.AnonymousClass1 anonymousClass1) {
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
            return super.internalMergeFrom((com.google.crypto.tink.proto.EciesAeadHkdfParams.Builder) abstractMessageLite);
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
            super(com.google.crypto.tink.proto.EciesAeadHkdfParams.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.proto.EciesAeadHkdfParamsOrBuilder
        public final boolean hasKemParams() {
            return ((com.google.crypto.tink.proto.EciesAeadHkdfParams) this.instance).hasKemParams();
        }

        @Override // com.google.crypto.tink.proto.EciesAeadHkdfParamsOrBuilder
        public final com.google.crypto.tink.proto.EciesHkdfKemParams getKemParams() {
            return ((com.google.crypto.tink.proto.EciesAeadHkdfParams) this.instance).getKemParams();
        }

        public final com.google.crypto.tink.proto.EciesAeadHkdfParams.Builder setKemParams(com.google.crypto.tink.proto.EciesHkdfKemParams eciesHkdfKemParams) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.EciesAeadHkdfParams) this.instance).setKemParams(eciesHkdfKemParams);
            return this;
        }

        public final com.google.crypto.tink.proto.EciesAeadHkdfParams.Builder setKemParams(com.google.crypto.tink.proto.EciesHkdfKemParams.Builder builder) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.EciesAeadHkdfParams) this.instance).setKemParams(builder.build());
            return this;
        }

        public final com.google.crypto.tink.proto.EciesAeadHkdfParams.Builder mergeKemParams(com.google.crypto.tink.proto.EciesHkdfKemParams eciesHkdfKemParams) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.EciesAeadHkdfParams) this.instance).mergeKemParams(eciesHkdfKemParams);
            return this;
        }

        public final com.google.crypto.tink.proto.EciesAeadHkdfParams.Builder clearKemParams() {
            copyOnWrite();
            ((com.google.crypto.tink.proto.EciesAeadHkdfParams) this.instance).clearKemParams();
            return this;
        }

        @Override // com.google.crypto.tink.proto.EciesAeadHkdfParamsOrBuilder
        public final boolean hasDemParams() {
            return ((com.google.crypto.tink.proto.EciesAeadHkdfParams) this.instance).hasDemParams();
        }

        @Override // com.google.crypto.tink.proto.EciesAeadHkdfParamsOrBuilder
        public final com.google.crypto.tink.proto.EciesAeadDemParams getDemParams() {
            return ((com.google.crypto.tink.proto.EciesAeadHkdfParams) this.instance).getDemParams();
        }

        public final com.google.crypto.tink.proto.EciesAeadHkdfParams.Builder setDemParams(com.google.crypto.tink.proto.EciesAeadDemParams eciesAeadDemParams) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.EciesAeadHkdfParams) this.instance).setDemParams(eciesAeadDemParams);
            return this;
        }

        public final com.google.crypto.tink.proto.EciesAeadHkdfParams.Builder setDemParams(com.google.crypto.tink.proto.EciesAeadDemParams.Builder builder) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.EciesAeadHkdfParams) this.instance).setDemParams(builder.build());
            return this;
        }

        public final com.google.crypto.tink.proto.EciesAeadHkdfParams.Builder mergeDemParams(com.google.crypto.tink.proto.EciesAeadDemParams eciesAeadDemParams) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.EciesAeadHkdfParams) this.instance).mergeDemParams(eciesAeadDemParams);
            return this;
        }

        public final com.google.crypto.tink.proto.EciesAeadHkdfParams.Builder clearDemParams() {
            copyOnWrite();
            ((com.google.crypto.tink.proto.EciesAeadHkdfParams) this.instance).clearDemParams();
            return this;
        }

        @Override // com.google.crypto.tink.proto.EciesAeadHkdfParamsOrBuilder
        public final int getEcPointFormatValue() {
            return ((com.google.crypto.tink.proto.EciesAeadHkdfParams) this.instance).getEcPointFormatValue();
        }

        public final com.google.crypto.tink.proto.EciesAeadHkdfParams.Builder setEcPointFormatValue(int i) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.EciesAeadHkdfParams) this.instance).setEcPointFormatValue(i);
            return this;
        }

        @Override // com.google.crypto.tink.proto.EciesAeadHkdfParamsOrBuilder
        public final com.google.crypto.tink.proto.EcPointFormat getEcPointFormat() {
            return ((com.google.crypto.tink.proto.EciesAeadHkdfParams) this.instance).getEcPointFormat();
        }

        public final com.google.crypto.tink.proto.EciesAeadHkdfParams.Builder setEcPointFormat(com.google.crypto.tink.proto.EcPointFormat ecPointFormat) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.EciesAeadHkdfParams) this.instance).setEcPointFormat(ecPointFormat);
            return this;
        }

        public final com.google.crypto.tink.proto.EciesAeadHkdfParams.Builder clearEcPointFormat() {
            copyOnWrite();
            ((com.google.crypto.tink.proto.EciesAeadHkdfParams) this.instance).clearEcPointFormat();
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.proto.EciesAeadHkdfParams$1, reason: invalid class name */
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
        com.google.crypto.tink.proto.EciesAeadHkdfParams.AnonymousClass1 anonymousClass1 = null;
        switch (com.google.crypto.tink.proto.EciesAeadHkdfParams.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new com.google.crypto.tink.proto.EciesAeadHkdfParams();
            case 2:
                return new com.google.crypto.tink.proto.EciesAeadHkdfParams.Builder(anonymousClass1);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f", new java.lang.Object[]{"bitField0_", "kemParams_", "demParams_", "ecPointFormat_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.EciesAeadHkdfParams> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.google.crypto.tink.proto.EciesAeadHkdfParams.class) {
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
        com.google.crypto.tink.proto.EciesAeadHkdfParams eciesAeadHkdfParams = new com.google.crypto.tink.proto.EciesAeadHkdfParams();
        DEFAULT_INSTANCE = eciesAeadHkdfParams;
        com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.registerDefaultInstance(com.google.crypto.tink.proto.EciesAeadHkdfParams.class, eciesAeadHkdfParams);
    }

    public static com.google.crypto.tink.proto.EciesAeadHkdfParams getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.EciesAeadHkdfParams> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
