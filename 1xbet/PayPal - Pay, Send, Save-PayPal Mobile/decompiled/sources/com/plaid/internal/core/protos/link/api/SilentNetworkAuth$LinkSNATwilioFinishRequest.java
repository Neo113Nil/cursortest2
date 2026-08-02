package com.plaid.internal.core.protos.link.api;

/* loaded from: classes16.dex */
public final class SilentNetworkAuth$LinkSNATwilioFinishRequest extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishRequest, com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishRequest.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishRequest DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishRequest> PARSER = null;
    public static final int VERIFICATION_ID_FIELD_NUMBER = 1;
    private java.lang.String verificationId_ = "";

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishRequest, com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishRequest.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishRequest.DEFAULT_INSTANCE);
        }

        public final com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishRequest.a a(java.lang.String str) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishRequest) this.instance).setVerificationId(str);
            return this;
        }
    }

    static {
        com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishRequest silentNetworkAuth$LinkSNATwilioFinishRequest = new com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishRequest();
        DEFAULT_INSTANCE = silentNetworkAuth$LinkSNATwilioFinishRequest;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishRequest.class, silentNetworkAuth$LinkSNATwilioFinishRequest);
    }

    private SilentNetworkAuth$LinkSNATwilioFinishRequest() {
    }

    private void clearVerificationId() {
        this.verificationId_ = getDefaultInstance().getVerificationId();
    }

    public static com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishRequest.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishRequest parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishRequest) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishRequest parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setVerificationIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.verificationId_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.api.e.f6083a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishRequest();
            case 2:
                return new com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishRequest.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new java.lang.Object[]{"verificationId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishRequest> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishRequest.class) {
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

    public final java.lang.String getVerificationId() {
        return this.verificationId_;
    }

    public final com.google.protobuf.ByteString getVerificationIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.verificationId_);
    }

    public static com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishRequest.a newBuilder(com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishRequest silentNetworkAuth$LinkSNATwilioFinishRequest) {
        return DEFAULT_INSTANCE.createBuilder(silentNetworkAuth$LinkSNATwilioFinishRequest);
    }

    public static com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishRequest parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishRequest) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishRequest parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishRequest parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVerificationId(java.lang.String str) {
        this.verificationId_ = str;
    }

    public static com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishRequest parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishRequest parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishRequest parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishRequest parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishRequest parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
