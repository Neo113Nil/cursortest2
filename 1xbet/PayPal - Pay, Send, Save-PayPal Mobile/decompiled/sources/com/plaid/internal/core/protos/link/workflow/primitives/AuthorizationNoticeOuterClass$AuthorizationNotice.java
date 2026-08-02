package com.plaid.internal.core.protos.link.workflow.primitives;

/* loaded from: classes16.dex */
public final class AuthorizationNoticeOuterClass$AuthorizationNotice extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$AuthorizationNotice, com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$AuthorizationNotice.a> implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int AUTH_TOKEN_FIELD_NUMBER = 2;
    public static final int CLIENT_MEASUREMENT_FIELD_NUMBER = 4;
    public static final int CREATED_AT_FIELD_NUMBER = 1;
    private static final com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$AuthorizationNotice DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$AuthorizationNotice> PARSER = null;
    public static final int USER_ID_FIELD_NUMBER = 3;
    private int bitField0_;
    private com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement clientMeasurement_;
    private com.google.protobuf.Timestamp createdAt_;
    private java.lang.String authToken_ = "";
    private java.lang.String userId_ = "";

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$AuthorizationNotice, com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$AuthorizationNotice.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$AuthorizationNotice.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$AuthorizationNotice authorizationNoticeOuterClass$AuthorizationNotice = new com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$AuthorizationNotice();
        DEFAULT_INSTANCE = authorizationNoticeOuterClass$AuthorizationNotice;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$AuthorizationNotice.class, authorizationNoticeOuterClass$AuthorizationNotice);
    }

    private AuthorizationNoticeOuterClass$AuthorizationNotice() {
    }

    private void clearAuthToken() {
        this.authToken_ = getDefaultInstance().getAuthToken();
    }

    private void clearClientMeasurement() {
        this.clientMeasurement_ = null;
        this.bitField0_ &= -3;
    }

    private void clearCreatedAt() {
        this.createdAt_ = null;
        this.bitField0_ &= -2;
    }

    private void clearUserId() {
        this.userId_ = getDefaultInstance().getUserId();
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$AuthorizationNotice getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$AuthorizationNotice.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$AuthorizationNotice parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$AuthorizationNotice) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$AuthorizationNotice parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$AuthorizationNotice) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$AuthorizationNotice> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAuthTokenBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.authToken_ = byteString.toStringUtf8();
    }

    private void setUserIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.userId_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.primitives.a.f6355a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$AuthorizationNotice();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$AuthorizationNotice.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003Ȉ\u0004ဉ\u0001", new java.lang.Object[]{"bitField0_", "createdAt_", "authToken_", "userId_", "clientMeasurement_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$AuthorizationNotice> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$AuthorizationNotice.class) {
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

    public final java.lang.String getAuthToken() {
        return this.authToken_;
    }

    public final com.google.protobuf.ByteString getAuthTokenBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.authToken_);
    }

    public final com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement getClientMeasurement() {
        com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement authorizationNoticeOuterClass$ClientMeasurement = this.clientMeasurement_;
        return authorizationNoticeOuterClass$ClientMeasurement == null ? com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement.getDefaultInstance() : authorizationNoticeOuterClass$ClientMeasurement;
    }

    public final com.google.protobuf.Timestamp getCreatedAt() {
        com.google.protobuf.Timestamp timestamp = this.createdAt_;
        return timestamp == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timestamp;
    }

    public final java.lang.String getUserId() {
        return this.userId_;
    }

    public final com.google.protobuf.ByteString getUserIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.userId_);
    }

    public final boolean hasClientMeasurement() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean hasCreatedAt() {
        return (this.bitField0_ & 1) != 0;
    }

    private void mergeClientMeasurement(com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement authorizationNoticeOuterClass$ClientMeasurement) {
        com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement authorizationNoticeOuterClass$ClientMeasurement2 = this.clientMeasurement_;
        if (authorizationNoticeOuterClass$ClientMeasurement2 == null || authorizationNoticeOuterClass$ClientMeasurement2 == com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement.getDefaultInstance()) {
            this.clientMeasurement_ = authorizationNoticeOuterClass$ClientMeasurement;
        } else {
            this.clientMeasurement_ = com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement.newBuilder(this.clientMeasurement_).mergeFrom((com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement.a) authorizationNoticeOuterClass$ClientMeasurement).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    private void mergeCreatedAt(com.google.protobuf.Timestamp timestamp) {
        com.google.protobuf.Timestamp timestamp2 = this.createdAt_;
        if (timestamp2 == null || timestamp2 == com.google.protobuf.Timestamp.getDefaultInstance()) {
            this.createdAt_ = timestamp;
        } else {
            this.createdAt_ = com.google.protobuf.Timestamp.newBuilder(this.createdAt_).mergeFrom((com.google.protobuf.Timestamp.Builder) timestamp).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$AuthorizationNotice.a newBuilder(com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$AuthorizationNotice authorizationNoticeOuterClass$AuthorizationNotice) {
        return DEFAULT_INSTANCE.createBuilder(authorizationNoticeOuterClass$AuthorizationNotice);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$AuthorizationNotice parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$AuthorizationNotice) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$AuthorizationNotice parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$AuthorizationNotice) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setClientMeasurement(com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement authorizationNoticeOuterClass$ClientMeasurement) {
        this.clientMeasurement_ = authorizationNoticeOuterClass$ClientMeasurement;
        this.bitField0_ |= 2;
    }

    private void setCreatedAt(com.google.protobuf.Timestamp timestamp) {
        this.createdAt_ = timestamp;
        this.bitField0_ |= 1;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$AuthorizationNotice parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$AuthorizationNotice) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void setAuthToken(java.lang.String str) {
        this.authToken_ = str;
    }

    private void setUserId(java.lang.String str) {
        this.userId_ = str;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$AuthorizationNotice parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$AuthorizationNotice) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$AuthorizationNotice parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$AuthorizationNotice) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$AuthorizationNotice parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$AuthorizationNotice) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$AuthorizationNotice parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$AuthorizationNotice) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$AuthorizationNotice parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$AuthorizationNotice) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$AuthorizationNotice parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$AuthorizationNotice) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$AuthorizationNotice parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$AuthorizationNotice) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
