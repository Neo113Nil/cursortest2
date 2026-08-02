package com.google.crypto.tink.proto;

/* loaded from: classes9.dex */
public final class HpkeParams extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<com.google.crypto.tink.proto.HpkeParams, com.google.crypto.tink.proto.HpkeParams.Builder> implements com.google.crypto.tink.proto.HpkeParamsOrBuilder {
    public static final int AEAD_FIELD_NUMBER = 3;
    private static final com.google.crypto.tink.proto.HpkeParams DEFAULT_INSTANCE;
    public static final int KDF_FIELD_NUMBER = 2;
    public static final int KEM_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.HpkeParams> PARSER;
    private int aead_;
    private int kdf_;
    private int kem_;

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

    private HpkeParams() {
    }

    @Override // com.google.crypto.tink.proto.HpkeParamsOrBuilder
    public final int getKemValue() {
        return this.kem_;
    }

    @Override // com.google.crypto.tink.proto.HpkeParamsOrBuilder
    public final com.google.crypto.tink.proto.HpkeKem getKem() {
        com.google.crypto.tink.proto.HpkeKem forNumber = com.google.crypto.tink.proto.HpkeKem.forNumber(this.kem_);
        return forNumber == null ? com.google.crypto.tink.proto.HpkeKem.UNRECOGNIZED : forNumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKemValue(int i) {
        this.kem_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKem(com.google.crypto.tink.proto.HpkeKem hpkeKem) {
        this.kem_ = hpkeKem.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKem() {
        this.kem_ = 0;
    }

    @Override // com.google.crypto.tink.proto.HpkeParamsOrBuilder
    public final int getKdfValue() {
        return this.kdf_;
    }

    @Override // com.google.crypto.tink.proto.HpkeParamsOrBuilder
    public final com.google.crypto.tink.proto.HpkeKdf getKdf() {
        com.google.crypto.tink.proto.HpkeKdf forNumber = com.google.crypto.tink.proto.HpkeKdf.forNumber(this.kdf_);
        return forNumber == null ? com.google.crypto.tink.proto.HpkeKdf.UNRECOGNIZED : forNumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKdfValue(int i) {
        this.kdf_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKdf(com.google.crypto.tink.proto.HpkeKdf hpkeKdf) {
        this.kdf_ = hpkeKdf.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKdf() {
        this.kdf_ = 0;
    }

    @Override // com.google.crypto.tink.proto.HpkeParamsOrBuilder
    public final int getAeadValue() {
        return this.aead_;
    }

    @Override // com.google.crypto.tink.proto.HpkeParamsOrBuilder
    public final com.google.crypto.tink.proto.HpkeAead getAead() {
        com.google.crypto.tink.proto.HpkeAead forNumber = com.google.crypto.tink.proto.HpkeAead.forNumber(this.aead_);
        return forNumber == null ? com.google.crypto.tink.proto.HpkeAead.UNRECOGNIZED : forNumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAeadValue(int i) {
        this.aead_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAead(com.google.crypto.tink.proto.HpkeAead hpkeAead) {
        this.aead_ = hpkeAead.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAead() {
        this.aead_ = 0;
    }

    public static com.google.crypto.tink.proto.HpkeParams parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.HpkeParams) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.crypto.tink.proto.HpkeParams parseFrom(java.nio.ByteBuffer byteBuffer, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.HpkeParams) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.HpkeParams parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.HpkeParams) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.google.crypto.tink.proto.HpkeParams parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.HpkeParams) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.HpkeParams parseFrom(byte[] bArr) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.HpkeParams) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.google.crypto.tink.proto.HpkeParams parseFrom(byte[] bArr, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.HpkeParams) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.HpkeParams parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.google.crypto.tink.proto.HpkeParams) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.crypto.tink.proto.HpkeParams parseFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.proto.HpkeParams) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.HpkeParams parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.google.crypto.tink.proto.HpkeParams) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.crypto.tink.proto.HpkeParams parseDelimitedFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.proto.HpkeParams) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.HpkeParams parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
        return (com.google.crypto.tink.proto.HpkeParams) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.google.crypto.tink.proto.HpkeParams parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.proto.HpkeParams) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.HpkeParams.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.google.crypto.tink.proto.HpkeParams.Builder newBuilder(com.google.crypto.tink.proto.HpkeParams hpkeParams) {
        return DEFAULT_INSTANCE.createBuilder(hpkeParams);
    }

    public static final class Builder extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<com.google.crypto.tink.proto.HpkeParams, com.google.crypto.tink.proto.HpkeParams.Builder> implements com.google.crypto.tink.proto.HpkeParamsOrBuilder {
        /* synthetic */ Builder(com.google.crypto.tink.proto.HpkeParams.AnonymousClass1 anonymousClass1) {
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
            return super.internalMergeFrom((com.google.crypto.tink.proto.HpkeParams.Builder) abstractMessageLite);
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
            super(com.google.crypto.tink.proto.HpkeParams.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.proto.HpkeParamsOrBuilder
        public final int getKemValue() {
            return ((com.google.crypto.tink.proto.HpkeParams) this.instance).getKemValue();
        }

        public final com.google.crypto.tink.proto.HpkeParams.Builder setKemValue(int i) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.HpkeParams) this.instance).setKemValue(i);
            return this;
        }

        @Override // com.google.crypto.tink.proto.HpkeParamsOrBuilder
        public final com.google.crypto.tink.proto.HpkeKem getKem() {
            return ((com.google.crypto.tink.proto.HpkeParams) this.instance).getKem();
        }

        public final com.google.crypto.tink.proto.HpkeParams.Builder setKem(com.google.crypto.tink.proto.HpkeKem hpkeKem) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.HpkeParams) this.instance).setKem(hpkeKem);
            return this;
        }

        public final com.google.crypto.tink.proto.HpkeParams.Builder clearKem() {
            copyOnWrite();
            ((com.google.crypto.tink.proto.HpkeParams) this.instance).clearKem();
            return this;
        }

        @Override // com.google.crypto.tink.proto.HpkeParamsOrBuilder
        public final int getKdfValue() {
            return ((com.google.crypto.tink.proto.HpkeParams) this.instance).getKdfValue();
        }

        public final com.google.crypto.tink.proto.HpkeParams.Builder setKdfValue(int i) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.HpkeParams) this.instance).setKdfValue(i);
            return this;
        }

        @Override // com.google.crypto.tink.proto.HpkeParamsOrBuilder
        public final com.google.crypto.tink.proto.HpkeKdf getKdf() {
            return ((com.google.crypto.tink.proto.HpkeParams) this.instance).getKdf();
        }

        public final com.google.crypto.tink.proto.HpkeParams.Builder setKdf(com.google.crypto.tink.proto.HpkeKdf hpkeKdf) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.HpkeParams) this.instance).setKdf(hpkeKdf);
            return this;
        }

        public final com.google.crypto.tink.proto.HpkeParams.Builder clearKdf() {
            copyOnWrite();
            ((com.google.crypto.tink.proto.HpkeParams) this.instance).clearKdf();
            return this;
        }

        @Override // com.google.crypto.tink.proto.HpkeParamsOrBuilder
        public final int getAeadValue() {
            return ((com.google.crypto.tink.proto.HpkeParams) this.instance).getAeadValue();
        }

        public final com.google.crypto.tink.proto.HpkeParams.Builder setAeadValue(int i) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.HpkeParams) this.instance).setAeadValue(i);
            return this;
        }

        @Override // com.google.crypto.tink.proto.HpkeParamsOrBuilder
        public final com.google.crypto.tink.proto.HpkeAead getAead() {
            return ((com.google.crypto.tink.proto.HpkeParams) this.instance).getAead();
        }

        public final com.google.crypto.tink.proto.HpkeParams.Builder setAead(com.google.crypto.tink.proto.HpkeAead hpkeAead) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.HpkeParams) this.instance).setAead(hpkeAead);
            return this;
        }

        public final com.google.crypto.tink.proto.HpkeParams.Builder clearAead() {
            copyOnWrite();
            ((com.google.crypto.tink.proto.HpkeParams) this.instance).clearAead();
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.proto.HpkeParams$1, reason: invalid class name */
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
        com.google.crypto.tink.proto.HpkeParams.AnonymousClass1 anonymousClass1 = null;
        switch (com.google.crypto.tink.proto.HpkeParams.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new com.google.crypto.tink.proto.HpkeParams();
            case 2:
                return new com.google.crypto.tink.proto.HpkeParams.Builder(anonymousClass1);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new java.lang.Object[]{"kem_", "kdf_", "aead_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.HpkeParams> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.google.crypto.tink.proto.HpkeParams.class) {
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
        com.google.crypto.tink.proto.HpkeParams hpkeParams = new com.google.crypto.tink.proto.HpkeParams();
        DEFAULT_INSTANCE = hpkeParams;
        com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.registerDefaultInstance(com.google.crypto.tink.proto.HpkeParams.class, hpkeParams);
    }

    public static com.google.crypto.tink.proto.HpkeParams getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.HpkeParams> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
