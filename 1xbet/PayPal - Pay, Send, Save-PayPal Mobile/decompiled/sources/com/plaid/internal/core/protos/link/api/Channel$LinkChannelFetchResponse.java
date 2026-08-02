package com.plaid.internal.core.protos.link.api;

/* loaded from: classes16.dex */
public final class Channel$LinkChannelFetchResponse extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchResponse, com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchResponse.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchResponse DEFAULT_INSTANCE;
    public static final int FETCH_ID_FIELD_NUMBER = 3;
    public static final int MESSAGES_FIELD_NUMBER = 2;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchResponse> PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 1;
    private java.lang.String requestId_ = "";
    private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.channel.Channel$Message> messages_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    private java.lang.String fetchId_ = "";

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchResponse, com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchResponse.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchResponse channel$LinkChannelFetchResponse = new com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchResponse();
        DEFAULT_INSTANCE = channel$LinkChannelFetchResponse;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchResponse.class, channel$LinkChannelFetchResponse);
    }

    private Channel$LinkChannelFetchResponse() {
    }

    private void addAllMessages(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.channel.Channel$Message> iterable) {
        ensureMessagesIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.messages_);
    }

    private void clearFetchId() {
        this.fetchId_ = getDefaultInstance().getFetchId();
    }

    private void clearMessages() {
        this.messages_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }

    private void clearRequestId() {
        this.requestId_ = getDefaultInstance().getRequestId();
    }

    private void ensureMessagesIsMutable() {
        com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.channel.Channel$Message> protobufList = this.messages_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.messages_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchResponse.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchResponse parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchResponse) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchResponse parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeMessages(int i) {
        ensureMessagesIsMutable();
        this.messages_.remove(i);
    }

    private void setFetchIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.fetchId_ = byteString.toStringUtf8();
    }

    private void setRequestIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.requestId_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.api.a.f6080a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchResponse();
            case 2:
                return new com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchResponse.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003Ȉ", new java.lang.Object[]{"requestId_", "messages_", com.plaid.internal.core.protos.link.channel.Channel$Message.class, "fetchId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchResponse> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchResponse.class) {
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

    public final java.lang.String getFetchId() {
        return this.fetchId_;
    }

    public final com.google.protobuf.ByteString getFetchIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.fetchId_);
    }

    public final com.plaid.internal.core.protos.link.channel.Channel$Message getMessages(int i) {
        return this.messages_.get(i);
    }

    public final int getMessagesCount() {
        return this.messages_.size();
    }

    public final java.util.List<com.plaid.internal.core.protos.link.channel.Channel$Message> getMessagesList() {
        return this.messages_;
    }

    public final com.plaid.internal.core.protos.link.channel.b getMessagesOrBuilder(int i) {
        return this.messages_.get(i);
    }

    public final java.util.List<? extends com.plaid.internal.core.protos.link.channel.b> getMessagesOrBuilderList() {
        return this.messages_;
    }

    public final java.lang.String getRequestId() {
        return this.requestId_;
    }

    public final com.google.protobuf.ByteString getRequestIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.requestId_);
    }

    private void addMessages(com.plaid.internal.core.protos.link.channel.Channel$Message channel$Message) {
        ensureMessagesIsMutable();
        this.messages_.add(channel$Message);
    }

    public static com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchResponse.a newBuilder(com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchResponse channel$LinkChannelFetchResponse) {
        return DEFAULT_INSTANCE.createBuilder(channel$LinkChannelFetchResponse);
    }

    public static com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchResponse parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchResponse) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchResponse parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setMessages(int i, com.plaid.internal.core.protos.link.channel.Channel$Message channel$Message) {
        ensureMessagesIsMutable();
        this.messages_.set(i, channel$Message);
    }

    public static com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchResponse parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void setFetchId(java.lang.String str) {
        this.fetchId_ = str;
    }

    private void setRequestId(java.lang.String str) {
        this.requestId_ = str;
    }

    public static com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchResponse parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    private void addMessages(int i, com.plaid.internal.core.protos.link.channel.Channel$Message channel$Message) {
        ensureMessagesIsMutable();
        this.messages_.add(i, channel$Message);
    }

    public static com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchResponse parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchResponse parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchResponse parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchResponse parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchResponse parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchResponse parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
