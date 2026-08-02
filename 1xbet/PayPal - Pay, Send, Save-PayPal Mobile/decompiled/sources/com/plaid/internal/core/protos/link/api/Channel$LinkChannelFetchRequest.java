package com.plaid.internal.core.protos.link.api;

/* loaded from: classes16.dex */
public final class Channel$LinkChannelFetchRequest extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchRequest, com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchRequest.a> implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int CHANNEL_ID_FIELD_NUMBER = 1;
    public static final int CHANNEL_SECRET_FIELD_NUMBER = 2;
    private static final com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchRequest DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchRequest> PARSER = null;
    public static final int PREVIOUS_FETCH_ID_FIELD_NUMBER = 3;
    public static final int WEBVIEW_FALLBACK_ID_FIELD_NUMBER = 4;
    private java.lang.String channelId_ = "";
    private java.lang.String channelSecret_ = "";
    private java.lang.String previousFetchId_ = "";
    private java.lang.String webviewFallbackId_ = "";

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchRequest, com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchRequest.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchRequest.DEFAULT_INSTANCE);
        }

        public final void a(java.lang.String str) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchRequest) this.instance).setChannelId(str);
        }

        public final void b(java.lang.String str) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchRequest) this.instance).setChannelSecret(str);
        }

        public final void c(java.lang.String str) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchRequest) this.instance).setPreviousFetchId(str);
        }
    }

    static {
        com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchRequest channel$LinkChannelFetchRequest = new com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchRequest();
        DEFAULT_INSTANCE = channel$LinkChannelFetchRequest;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchRequest.class, channel$LinkChannelFetchRequest);
    }

    private Channel$LinkChannelFetchRequest() {
    }

    private void clearChannelId() {
        this.channelId_ = getDefaultInstance().getChannelId();
    }

    private void clearChannelSecret() {
        this.channelSecret_ = getDefaultInstance().getChannelSecret();
    }

    private void clearPreviousFetchId() {
        this.previousFetchId_ = getDefaultInstance().getPreviousFetchId();
    }

    private void clearWebviewFallbackId() {
        this.webviewFallbackId_ = getDefaultInstance().getWebviewFallbackId();
    }

    public static com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchRequest.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchRequest parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchRequest) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchRequest parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setChannelIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.channelId_ = byteString.toStringUtf8();
    }

    private void setChannelSecretBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.channelSecret_ = byteString.toStringUtf8();
    }

    private void setPreviousFetchIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.previousFetchId_ = byteString.toStringUtf8();
    }

    private void setWebviewFallbackIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.webviewFallbackId_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.api.a.f6080a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchRequest();
            case 2:
                return new com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchRequest.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new java.lang.Object[]{"channelId_", "channelSecret_", "previousFetchId_", "webviewFallbackId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchRequest> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchRequest.class) {
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

    public final java.lang.String getChannelId() {
        return this.channelId_;
    }

    public final com.google.protobuf.ByteString getChannelIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.channelId_);
    }

    public final java.lang.String getChannelSecret() {
        return this.channelSecret_;
    }

    public final com.google.protobuf.ByteString getChannelSecretBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.channelSecret_);
    }

    public final java.lang.String getPreviousFetchId() {
        return this.previousFetchId_;
    }

    public final com.google.protobuf.ByteString getPreviousFetchIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.previousFetchId_);
    }

    public final java.lang.String getWebviewFallbackId() {
        return this.webviewFallbackId_;
    }

    public final com.google.protobuf.ByteString getWebviewFallbackIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.webviewFallbackId_);
    }

    public static com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchRequest.a newBuilder(com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchRequest channel$LinkChannelFetchRequest) {
        return DEFAULT_INSTANCE.createBuilder(channel$LinkChannelFetchRequest);
    }

    public static com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchRequest parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchRequest) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchRequest parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchRequest parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChannelId(java.lang.String str) {
        this.channelId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChannelSecret(java.lang.String str) {
        this.channelSecret_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreviousFetchId(java.lang.String str) {
        this.previousFetchId_ = str;
    }

    private void setWebviewFallbackId(java.lang.String str) {
        this.webviewFallbackId_ = str;
    }

    public static com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchRequest parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchRequest parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchRequest parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchRequest parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchRequest parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
