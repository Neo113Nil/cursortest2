package com.plaid.internal.core.protos.link.api;

/* loaded from: classes16.dex */
public final class SilentNetworkAuth$LinkSNAProveStartRequest extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartRequest, com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartRequest.a> implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int CELLULAR_DEVICE_IP_FIELD_NUMBER = 2;
    private static final com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartRequest DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartRequest> PARSER = null;
    public static final int VERIFICATION_ID_FIELD_NUMBER = 1;
    private java.lang.String verificationId_ = "";
    private java.lang.String cellularDeviceIp_ = "";

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartRequest, com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartRequest.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartRequest.DEFAULT_INSTANCE);
        }

        public final com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartRequest.a a(java.lang.String str) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartRequest) this.instance).setCellularDeviceIp(str);
            return this;
        }

        public final com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartRequest.a b(java.lang.String str) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartRequest) this.instance).setVerificationId(str);
            return this;
        }
    }

    static {
        com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartRequest silentNetworkAuth$LinkSNAProveStartRequest = new com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartRequest();
        DEFAULT_INSTANCE = silentNetworkAuth$LinkSNAProveStartRequest;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartRequest.class, silentNetworkAuth$LinkSNAProveStartRequest);
    }

    private SilentNetworkAuth$LinkSNAProveStartRequest() {
    }

    private void clearCellularDeviceIp() {
        this.cellularDeviceIp_ = getDefaultInstance().getCellularDeviceIp();
    }

    private void clearVerificationId() {
        this.verificationId_ = getDefaultInstance().getVerificationId();
    }

    public static com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartRequest.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartRequest parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartRequest) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartRequest parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setCellularDeviceIpBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.cellularDeviceIp_ = byteString.toStringUtf8();
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
                return new com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartRequest();
            case 2:
                return new com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartRequest.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new java.lang.Object[]{"verificationId_", "cellularDeviceIp_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartRequest> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartRequest.class) {
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

    public final java.lang.String getCellularDeviceIp() {
        return this.cellularDeviceIp_;
    }

    public final com.google.protobuf.ByteString getCellularDeviceIpBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.cellularDeviceIp_);
    }

    public final java.lang.String getVerificationId() {
        return this.verificationId_;
    }

    public final com.google.protobuf.ByteString getVerificationIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.verificationId_);
    }

    public static com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartRequest.a newBuilder(com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartRequest silentNetworkAuth$LinkSNAProveStartRequest) {
        return DEFAULT_INSTANCE.createBuilder(silentNetworkAuth$LinkSNAProveStartRequest);
    }

    public static com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartRequest parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartRequest) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartRequest parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartRequest parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCellularDeviceIp(java.lang.String str) {
        this.cellularDeviceIp_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVerificationId(java.lang.String str) {
        this.verificationId_ = str;
    }

    public static com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartRequest parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartRequest parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartRequest parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartRequest parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartRequest parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
