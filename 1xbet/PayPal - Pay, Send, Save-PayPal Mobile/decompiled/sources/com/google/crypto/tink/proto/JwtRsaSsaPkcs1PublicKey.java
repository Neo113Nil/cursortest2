package com.google.crypto.tink.proto;

/* loaded from: classes9.dex */
public final class JwtRsaSsaPkcs1PublicKey extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey, com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.Builder> implements com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKeyOrBuilder {
    public static final int ALGORITHM_FIELD_NUMBER = 2;
    public static final int CUSTOM_KID_FIELD_NUMBER = 5;
    private static final com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey DEFAULT_INSTANCE;
    public static final int E_FIELD_NUMBER = 4;
    public static final int N_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int algorithm_;
    private int bitField0_;
    private com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid customKid_;
    private int version_;
    private com.google.crypto.tink.shaded.protobuf.ByteString n_ = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY;
    private com.google.crypto.tink.shaded.protobuf.ByteString e_ = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY;

    public interface CustomKidOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
        java.lang.String getValue();

        com.google.crypto.tink.shaded.protobuf.ByteString getValueBytes();
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

    private JwtRsaSsaPkcs1PublicKey() {
    }

    public static final class CustomKid extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid, com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid.Builder> implements com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKidOrBuilder {
        private static final com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid DEFAULT_INSTANCE;
        private static volatile com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid> PARSER = null;
        public static final int VALUE_FIELD_NUMBER = 1;
        private java.lang.String value_ = "";

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

        private CustomKid() {
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKidOrBuilder
        public final java.lang.String getValue() {
            return this.value_;
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKidOrBuilder
        public final com.google.crypto.tink.shaded.protobuf.ByteString getValueBytes() {
            return com.google.crypto.tink.shaded.protobuf.ByteString.copyFromUtf8(this.value_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValue(java.lang.String str) {
            this.value_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.value_ = getDefaultInstance().getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValueBytes(com.google.crypto.tink.shaded.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.value_ = byteString.toStringUtf8();
        }

        public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            return (com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid parseFrom(java.nio.ByteBuffer byteBuffer, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            return (com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            return (com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            return (com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid parseFrom(byte[] bArr) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            return (com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid parseFrom(byte[] bArr, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            return (com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid parseFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid parseDelimitedFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid.Builder newBuilder(com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid customKid) {
            return DEFAULT_INSTANCE.createBuilder(customKid);
        }

        public static final class Builder extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid, com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid.Builder> implements com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKidOrBuilder {
            /* synthetic */ Builder(com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.AnonymousClass1 anonymousClass1) {
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
                return super.internalMergeFrom((com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid.Builder) abstractMessageLite);
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
                super(com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid.DEFAULT_INSTANCE);
            }

            @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKidOrBuilder
            public final java.lang.String getValue() {
                return ((com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid) this.instance).getValue();
            }

            @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKidOrBuilder
            public final com.google.crypto.tink.shaded.protobuf.ByteString getValueBytes() {
                return ((com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid) this.instance).getValueBytes();
            }

            public final com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid.Builder setValue(java.lang.String str) {
                copyOnWrite();
                ((com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid) this.instance).setValue(str);
                return this;
            }

            public final com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid.Builder clearValue() {
                copyOnWrite();
                ((com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid) this.instance).clearValue();
                return this;
            }

            public final com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid.Builder setValueBytes(com.google.crypto.tink.shaded.protobuf.ByteString byteString) {
                copyOnWrite();
                ((com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid) this.instance).setValueBytes(byteString);
                return this;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.crypto.tink.shaded.protobuf.Parser parser;
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.AnonymousClass1 anonymousClass1 = null;
            switch (com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid();
                case 2:
                    return new com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new java.lang.Object[]{"value_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid.class) {
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
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid customKid = new com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid();
            DEFAULT_INSTANCE = customKid;
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.registerDefaultInstance(com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid.class, customKid);
        }

        public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* renamed from: com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey$1, reason: invalid class name */
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

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKeyOrBuilder
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

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKeyOrBuilder
    public final int getAlgorithmValue() {
        return this.algorithm_;
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKeyOrBuilder
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

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKeyOrBuilder
    public final com.google.crypto.tink.shaded.protobuf.ByteString getN() {
        return this.n_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setN(com.google.crypto.tink.shaded.protobuf.ByteString byteString) {
        this.n_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearN() {
        this.n_ = getDefaultInstance().getN();
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKeyOrBuilder
    public final com.google.crypto.tink.shaded.protobuf.ByteString getE() {
        return this.e_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setE(com.google.crypto.tink.shaded.protobuf.ByteString byteString) {
        this.e_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearE() {
        this.e_ = getDefaultInstance().getE();
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKeyOrBuilder
    public final boolean hasCustomKid() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKeyOrBuilder
    public final com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid getCustomKid() {
        com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid customKid = this.customKid_;
        return customKid == null ? com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid.getDefaultInstance() : customKid;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCustomKid(com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid customKid) {
        this.customKid_ = customKid;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCustomKid(com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid customKid) {
        com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid customKid2 = this.customKid_;
        if (customKid2 != null && customKid2 != com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid.getDefaultInstance()) {
            this.customKid_ = com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid.newBuilder(this.customKid_).mergeFrom((com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid.Builder) customKid).buildPartial();
        } else {
            this.customKid_ = customKid;
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCustomKid() {
        this.customKid_ = null;
        this.bitField0_ &= -2;
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey parseFrom(java.nio.ByteBuffer byteBuffer, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey parseFrom(byte[] bArr) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey parseFrom(byte[] bArr, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey parseFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey parseDelimitedFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
        return (com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.Builder newBuilder(com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey jwtRsaSsaPkcs1PublicKey) {
        return DEFAULT_INSTANCE.createBuilder(jwtRsaSsaPkcs1PublicKey);
    }

    public static final class Builder extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey, com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.Builder> implements com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKeyOrBuilder {
        /* synthetic */ Builder(com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.AnonymousClass1 anonymousClass1) {
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
            return super.internalMergeFrom((com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.Builder) abstractMessageLite);
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
            super(com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKeyOrBuilder
        public final int getVersion() {
            return ((com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey) this.instance).getVersion();
        }

        public final com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.Builder setVersion(int i) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey) this.instance).setVersion(i);
            return this;
        }

        public final com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.Builder clearVersion() {
            copyOnWrite();
            ((com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey) this.instance).clearVersion();
            return this;
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKeyOrBuilder
        public final int getAlgorithmValue() {
            return ((com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey) this.instance).getAlgorithmValue();
        }

        public final com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.Builder setAlgorithmValue(int i) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey) this.instance).setAlgorithmValue(i);
            return this;
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKeyOrBuilder
        public final com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm getAlgorithm() {
            return ((com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey) this.instance).getAlgorithm();
        }

        public final com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.Builder setAlgorithm(com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm jwtRsaSsaPkcs1Algorithm) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey) this.instance).setAlgorithm(jwtRsaSsaPkcs1Algorithm);
            return this;
        }

        public final com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.Builder clearAlgorithm() {
            copyOnWrite();
            ((com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey) this.instance).clearAlgorithm();
            return this;
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKeyOrBuilder
        public final com.google.crypto.tink.shaded.protobuf.ByteString getN() {
            return ((com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey) this.instance).getN();
        }

        public final com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.Builder setN(com.google.crypto.tink.shaded.protobuf.ByteString byteString) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey) this.instance).setN(byteString);
            return this;
        }

        public final com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.Builder clearN() {
            copyOnWrite();
            ((com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey) this.instance).clearN();
            return this;
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKeyOrBuilder
        public final com.google.crypto.tink.shaded.protobuf.ByteString getE() {
            return ((com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey) this.instance).getE();
        }

        public final com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.Builder setE(com.google.crypto.tink.shaded.protobuf.ByteString byteString) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey) this.instance).setE(byteString);
            return this;
        }

        public final com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.Builder clearE() {
            copyOnWrite();
            ((com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey) this.instance).clearE();
            return this;
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKeyOrBuilder
        public final boolean hasCustomKid() {
            return ((com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey) this.instance).hasCustomKid();
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKeyOrBuilder
        public final com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid getCustomKid() {
            return ((com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey) this.instance).getCustomKid();
        }

        public final com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.Builder setCustomKid(com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid customKid) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey) this.instance).setCustomKid(customKid);
            return this;
        }

        public final com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.Builder setCustomKid(com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid.Builder builder) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey) this.instance).setCustomKid(builder.build());
            return this;
        }

        public final com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.Builder mergeCustomKid(com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid customKid) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey) this.instance).mergeCustomKid(customKid);
            return this;
        }

        public final com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.Builder clearCustomKid() {
            copyOnWrite();
            ((com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey) this.instance).clearCustomKid();
            return this;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.crypto.tink.shaded.protobuf.Parser parser;
        com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.AnonymousClass1 anonymousClass1 = null;
        switch (com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey();
            case 2:
                return new com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.Builder(anonymousClass1);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u000b\u0002\f\u0003\n\u0004\n\u0005ဉ\u0000", new java.lang.Object[]{"bitField0_", "version_", "algorithm_", "n_", "e_", "customKid_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.class) {
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
        com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey jwtRsaSsaPkcs1PublicKey = new com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey();
        DEFAULT_INSTANCE = jwtRsaSsaPkcs1PublicKey;
        com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.registerDefaultInstance(com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.class, jwtRsaSsaPkcs1PublicKey);
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
