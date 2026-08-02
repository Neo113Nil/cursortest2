package com.plaid.internal.core.protos.link.api;

/* loaded from: classes16.dex */
public final class Channel$LinkChannelPushRequest extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.Channel$LinkChannelPushRequest, com.plaid.internal.core.protos.link.api.Channel$LinkChannelPushRequest.a> implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int CHANNEL_ID_FIELD_NUMBER = 1;
    private static final com.plaid.internal.core.protos.link.api.Channel$LinkChannelPushRequest DEFAULT_INSTANCE;
    public static final int MESSAGES_FIELD_NUMBER = 4;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Channel$LinkChannelPushRequest> PARSER = null;
    public static final int WORKFLOW_SESSION_ID_FIELD_NUMBER = 3;
    private int bitField0_;
    private com.plaid.internal.core.protos.link.channel.Channel$Message message_;
    private java.lang.String channelId_ = "";
    private java.lang.String workflowSessionId_ = "";
    private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.channel.Channel$Message> messages_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.Channel$LinkChannelPushRequest, com.plaid.internal.core.protos.link.api.Channel$LinkChannelPushRequest.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.api.Channel$LinkChannelPushRequest.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.api.Channel$LinkChannelPushRequest channel$LinkChannelPushRequest = new com.plaid.internal.core.protos.link.api.Channel$LinkChannelPushRequest();
        DEFAULT_INSTANCE = channel$LinkChannelPushRequest;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.Channel$LinkChannelPushRequest.class, channel$LinkChannelPushRequest);
    }

    private Channel$LinkChannelPushRequest() {
    }

    private void addAllMessages(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.channel.Channel$Message> iterable) {
        ensureMessagesIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.messages_);
    }

    private void clearChannelId() {
        this.channelId_ = getDefaultInstance().getChannelId();
    }

    private void clearMessage() {
        this.message_ = null;
        this.bitField0_ &= -2;
    }

    private void clearMessages() {
        this.messages_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }

    private void clearWorkflowSessionId() {
        this.workflowSessionId_ = getDefaultInstance().getWorkflowSessionId();
    }

    private void ensureMessagesIsMutable() {
        com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.channel.Channel$Message> protobufList = this.messages_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.messages_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static com.plaid.internal.core.protos.link.api.Channel$LinkChannelPushRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.api.Channel$LinkChannelPushRequest.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.api.Channel$LinkChannelPushRequest parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.api.Channel$LinkChannelPushRequest) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.api.Channel$LinkChannelPushRequest parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.api.Channel$LinkChannelPushRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Channel$LinkChannelPushRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeMessages(int i) {
        ensureMessagesIsMutable();
        this.messages_.remove(i);
    }

    private void setChannelIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.channelId_ = byteString.toStringUtf8();
    }

    private void setWorkflowSessionIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.workflowSessionId_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.api.a.f6080a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.api.Channel$LinkChannelPushRequest();
            case 2:
                return new com.plaid.internal.core.protos.link.api.Channel$LinkChannelPushRequest.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ȉ\u0004\u001b", new java.lang.Object[]{"bitField0_", "channelId_", "message_", "workflowSessionId_", "messages_", com.plaid.internal.core.protos.link.channel.Channel$Message.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Channel$LinkChannelPushRequest> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.api.Channel$LinkChannelPushRequest.class) {
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

    public final com.plaid.internal.core.protos.link.channel.Channel$Message getMessage() {
        com.plaid.internal.core.protos.link.channel.Channel$Message channel$Message = this.message_;
        return channel$Message == null ? com.plaid.internal.core.protos.link.channel.Channel$Message.getDefaultInstance() : channel$Message;
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

    public final java.lang.String getWorkflowSessionId() {
        return this.workflowSessionId_;
    }

    public final com.google.protobuf.ByteString getWorkflowSessionIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.workflowSessionId_);
    }

    public final boolean hasMessage() {
        return (this.bitField0_ & 1) != 0;
    }

    private void addMessages(com.plaid.internal.core.protos.link.channel.Channel$Message channel$Message) {
        ensureMessagesIsMutable();
        this.messages_.add(channel$Message);
    }

    private void mergeMessage(com.plaid.internal.core.protos.link.channel.Channel$Message channel$Message) {
        com.plaid.internal.core.protos.link.channel.Channel$Message channel$Message2 = this.message_;
        if (channel$Message2 == null || channel$Message2 == com.plaid.internal.core.protos.link.channel.Channel$Message.getDefaultInstance()) {
            this.message_ = channel$Message;
        } else {
            this.message_ = com.plaid.internal.core.protos.link.channel.Channel$Message.newBuilder(this.message_).mergeFrom((com.plaid.internal.core.protos.link.channel.Channel$Message.a) channel$Message).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static com.plaid.internal.core.protos.link.api.Channel$LinkChannelPushRequest.a newBuilder(com.plaid.internal.core.protos.link.api.Channel$LinkChannelPushRequest channel$LinkChannelPushRequest) {
        return DEFAULT_INSTANCE.createBuilder(channel$LinkChannelPushRequest);
    }

    public static com.plaid.internal.core.protos.link.api.Channel$LinkChannelPushRequest parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Channel$LinkChannelPushRequest) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.Channel$LinkChannelPushRequest parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Channel$LinkChannelPushRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setMessage(com.plaid.internal.core.protos.link.channel.Channel$Message channel$Message) {
        this.message_ = channel$Message;
        this.bitField0_ |= 1;
    }

    private void setMessages(int i, com.plaid.internal.core.protos.link.channel.Channel$Message channel$Message) {
        ensureMessagesIsMutable();
        this.messages_.set(i, channel$Message);
    }

    public static com.plaid.internal.core.protos.link.api.Channel$LinkChannelPushRequest parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.api.Channel$LinkChannelPushRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void setChannelId(java.lang.String str) {
        this.channelId_ = str;
    }

    private void setWorkflowSessionId(java.lang.String str) {
        this.workflowSessionId_ = str;
    }

    public static com.plaid.internal.core.protos.link.api.Channel$LinkChannelPushRequest parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Channel$LinkChannelPushRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    private void addMessages(int i, com.plaid.internal.core.protos.link.channel.Channel$Message channel$Message) {
        ensureMessagesIsMutable();
        this.messages_.add(i, channel$Message);
    }

    public static com.plaid.internal.core.protos.link.api.Channel$LinkChannelPushRequest parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.api.Channel$LinkChannelPushRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.api.Channel$LinkChannelPushRequest parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Channel$LinkChannelPushRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.Channel$LinkChannelPushRequest parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.api.Channel$LinkChannelPushRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.api.Channel$LinkChannelPushRequest parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Channel$LinkChannelPushRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.Channel$LinkChannelPushRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.api.Channel$LinkChannelPushRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.api.Channel$LinkChannelPushRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Channel$LinkChannelPushRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
