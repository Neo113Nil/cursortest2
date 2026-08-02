package com.plaid.internal.core.protos.link.api;

/* loaded from: classes16.dex */
public final class TrustedAuth$TrustedAuthVerifyResponse extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyResponse, com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyResponse.a> implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int CLIENT_CONFIG_FIELD_NUMBER = 2;
    private static final com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyResponse DEFAULT_INSTANCE;
    public static final int INSTITUTION_CONFIG_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyResponse> PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 3;
    public static final int SESSION_ID_FIELD_NUMBER = 4;
    private int bitField0_;
    private com.plaid.internal.core.protos.link.api.TrustedAuth$ClientConfig clientConfig_;
    private com.plaid.internal.core.protos.link.api.TrustedAuth$InstitutionConfig institutionConfig_;
    private java.lang.String requestId_ = "";
    private java.lang.String sessionId_ = "";

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyResponse, com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyResponse.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyResponse trustedAuth$TrustedAuthVerifyResponse = new com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyResponse();
        DEFAULT_INSTANCE = trustedAuth$TrustedAuthVerifyResponse;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyResponse.class, trustedAuth$TrustedAuthVerifyResponse);
    }

    private TrustedAuth$TrustedAuthVerifyResponse() {
    }

    private void clearClientConfig() {
        this.clientConfig_ = null;
        this.bitField0_ &= -3;
    }

    private void clearInstitutionConfig() {
        this.institutionConfig_ = null;
        this.bitField0_ &= -2;
    }

    private void clearRequestId() {
        this.requestId_ = getDefaultInstance().getRequestId();
    }

    private void clearSessionId() {
        this.sessionId_ = getDefaultInstance().getSessionId();
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyResponse.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyResponse parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyResponse) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyResponse parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setRequestIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.requestId_ = byteString.toStringUtf8();
    }

    private void setSessionIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.sessionId_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.api.f.f6084a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyResponse();
            case 2:
                return new com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyResponse.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004Ȉ", new java.lang.Object[]{"bitField0_", "institutionConfig_", "clientConfig_", "requestId_", "sessionId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyResponse> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyResponse.class) {
                    parser = PARSER;
                    if (parser == null) {
                        parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
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

    public final com.plaid.internal.core.protos.link.api.TrustedAuth$ClientConfig getClientConfig() {
        com.plaid.internal.core.protos.link.api.TrustedAuth$ClientConfig trustedAuth$ClientConfig = this.clientConfig_;
        return trustedAuth$ClientConfig == null ? com.plaid.internal.core.protos.link.api.TrustedAuth$ClientConfig.getDefaultInstance() : trustedAuth$ClientConfig;
    }

    public final com.plaid.internal.core.protos.link.api.TrustedAuth$InstitutionConfig getInstitutionConfig() {
        com.plaid.internal.core.protos.link.api.TrustedAuth$InstitutionConfig trustedAuth$InstitutionConfig = this.institutionConfig_;
        return trustedAuth$InstitutionConfig == null ? com.plaid.internal.core.protos.link.api.TrustedAuth$InstitutionConfig.getDefaultInstance() : trustedAuth$InstitutionConfig;
    }

    public final java.lang.String getRequestId() {
        return this.requestId_;
    }

    public final com.google.protobuf.ByteString getRequestIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.requestId_);
    }

    public final java.lang.String getSessionId() {
        return this.sessionId_;
    }

    public final com.google.protobuf.ByteString getSessionIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.sessionId_);
    }

    public final boolean hasClientConfig() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean hasInstitutionConfig() {
        return (this.bitField0_ & 1) != 0;
    }

    private void mergeClientConfig(com.plaid.internal.core.protos.link.api.TrustedAuth$ClientConfig trustedAuth$ClientConfig) {
        com.plaid.internal.core.protos.link.api.TrustedAuth$ClientConfig trustedAuth$ClientConfig2 = this.clientConfig_;
        if (trustedAuth$ClientConfig2 == null || trustedAuth$ClientConfig2 == com.plaid.internal.core.protos.link.api.TrustedAuth$ClientConfig.getDefaultInstance()) {
            this.clientConfig_ = trustedAuth$ClientConfig;
        } else {
            this.clientConfig_ = com.plaid.internal.core.protos.link.api.TrustedAuth$ClientConfig.newBuilder(this.clientConfig_).mergeFrom((com.plaid.internal.core.protos.link.api.TrustedAuth$ClientConfig.a) trustedAuth$ClientConfig).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    private void mergeInstitutionConfig(com.plaid.internal.core.protos.link.api.TrustedAuth$InstitutionConfig trustedAuth$InstitutionConfig) {
        com.plaid.internal.core.protos.link.api.TrustedAuth$InstitutionConfig trustedAuth$InstitutionConfig2 = this.institutionConfig_;
        if (trustedAuth$InstitutionConfig2 == null || trustedAuth$InstitutionConfig2 == com.plaid.internal.core.protos.link.api.TrustedAuth$InstitutionConfig.getDefaultInstance()) {
            this.institutionConfig_ = trustedAuth$InstitutionConfig;
        } else {
            this.institutionConfig_ = com.plaid.internal.core.protos.link.api.TrustedAuth$InstitutionConfig.newBuilder(this.institutionConfig_).mergeFrom((com.plaid.internal.core.protos.link.api.TrustedAuth$InstitutionConfig.a) trustedAuth$InstitutionConfig).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyResponse.a newBuilder(com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyResponse trustedAuth$TrustedAuthVerifyResponse) {
        return DEFAULT_INSTANCE.createBuilder(trustedAuth$TrustedAuthVerifyResponse);
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyResponse parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyResponse) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyResponse parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setClientConfig(com.plaid.internal.core.protos.link.api.TrustedAuth$ClientConfig trustedAuth$ClientConfig) {
        this.clientConfig_ = trustedAuth$ClientConfig;
        this.bitField0_ |= 2;
    }

    private void setInstitutionConfig(com.plaid.internal.core.protos.link.api.TrustedAuth$InstitutionConfig trustedAuth$InstitutionConfig) {
        this.institutionConfig_ = trustedAuth$InstitutionConfig;
        this.bitField0_ |= 1;
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyResponse parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void setRequestId(java.lang.String str) {
        this.requestId_ = str;
    }

    private void setSessionId(java.lang.String str) {
        this.sessionId_ = str;
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyResponse parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyResponse parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyResponse parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyResponse parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyResponse parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyResponse parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyResponse parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
