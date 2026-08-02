package com.plaid.internal.core.protos.link.api;

/* loaded from: classes16.dex */
public final class TrustedAuth$TrustedAuthVerifyRequest extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyRequest, com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyRequest.a> implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int CLIENT_MEASUREMENT_FIELD_NUMBER = 1;
    private static final com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyRequest DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyRequest> PARSER = null;
    public static final int PLAID_TRUSTED_AUTH_TOKEN_FIELD_NUMBER = 2;
    private int bitField0_;
    private com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement clientMeasurement_;
    private java.lang.String plaidTrustedAuthToken_ = "";

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyRequest, com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyRequest.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyRequest.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyRequest trustedAuth$TrustedAuthVerifyRequest = new com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyRequest();
        DEFAULT_INSTANCE = trustedAuth$TrustedAuthVerifyRequest;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyRequest.class, trustedAuth$TrustedAuthVerifyRequest);
    }

    private TrustedAuth$TrustedAuthVerifyRequest() {
    }

    private void clearClientMeasurement() {
        this.clientMeasurement_ = null;
        this.bitField0_ &= -2;
    }

    private void clearPlaidTrustedAuthToken() {
        this.plaidTrustedAuthToken_ = getDefaultInstance().getPlaidTrustedAuthToken();
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyRequest.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyRequest parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyRequest) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyRequest parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setPlaidTrustedAuthTokenBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.plaidTrustedAuthToken_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.api.f.f6084a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyRequest();
            case 2:
                return new com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyRequest.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ", new java.lang.Object[]{"bitField0_", "clientMeasurement_", "plaidTrustedAuthToken_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyRequest> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyRequest.class) {
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

    public final com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement getClientMeasurement() {
        com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement authorizationNoticeOuterClass$ClientMeasurement = this.clientMeasurement_;
        return authorizationNoticeOuterClass$ClientMeasurement == null ? com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement.getDefaultInstance() : authorizationNoticeOuterClass$ClientMeasurement;
    }

    public final java.lang.String getPlaidTrustedAuthToken() {
        return this.plaidTrustedAuthToken_;
    }

    public final com.google.protobuf.ByteString getPlaidTrustedAuthTokenBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.plaidTrustedAuthToken_);
    }

    public final boolean hasClientMeasurement() {
        return (this.bitField0_ & 1) != 0;
    }

    private void mergeClientMeasurement(com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement authorizationNoticeOuterClass$ClientMeasurement) {
        com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement authorizationNoticeOuterClass$ClientMeasurement2 = this.clientMeasurement_;
        if (authorizationNoticeOuterClass$ClientMeasurement2 == null || authorizationNoticeOuterClass$ClientMeasurement2 == com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement.getDefaultInstance()) {
            this.clientMeasurement_ = authorizationNoticeOuterClass$ClientMeasurement;
        } else {
            this.clientMeasurement_ = com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement.newBuilder(this.clientMeasurement_).mergeFrom((com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement.a) authorizationNoticeOuterClass$ClientMeasurement).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyRequest.a newBuilder(com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyRequest trustedAuth$TrustedAuthVerifyRequest) {
        return DEFAULT_INSTANCE.createBuilder(trustedAuth$TrustedAuthVerifyRequest);
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyRequest parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyRequest) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyRequest parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setClientMeasurement(com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement authorizationNoticeOuterClass$ClientMeasurement) {
        this.clientMeasurement_ = authorizationNoticeOuterClass$ClientMeasurement;
        this.bitField0_ |= 1;
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyRequest parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void setPlaidTrustedAuthToken(java.lang.String str) {
        this.plaidTrustedAuthToken_ = str;
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyRequest parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyRequest parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyRequest parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyRequest parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyRequest parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
