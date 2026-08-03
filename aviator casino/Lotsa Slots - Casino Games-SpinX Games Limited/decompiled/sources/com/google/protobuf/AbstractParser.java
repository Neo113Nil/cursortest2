package com.google.protobuf;

/* loaded from: classes4.dex */
public abstract class AbstractParser<MessageType extends com.google.protobuf.MessageLite> implements com.google.protobuf.Parser<MessageType> {
    private static final com.google.protobuf.ExtensionRegistryLite EMPTY_REGISTRY = com.google.protobuf.ExtensionRegistryLite.getEmptyRegistry();

    private com.google.protobuf.UninitializedMessageException newUninitializedMessageException(MessageType message) {
        if (message instanceof com.google.protobuf.AbstractMessageLite) {
            return ((com.google.protobuf.AbstractMessageLite) message).newUninitializedMessageException();
        }
        return new com.google.protobuf.UninitializedMessageException(message);
    }

    private MessageType checkMessageInitialized(MessageType message) throws com.google.protobuf.InvalidProtocolBufferException {
        if (message == null || message.isInitialized()) {
            return message;
        }
        throw newUninitializedMessageException(message).asInvalidProtocolBufferException().setUnfinishedMessage(message);
    }

    @Override // com.google.protobuf.Parser
    public MessageType parsePartialFrom(com.google.protobuf.CodedInputStream input) throws com.google.protobuf.InvalidProtocolBufferException {
        return (MessageType) parsePartialFrom(input, EMPTY_REGISTRY);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.Parser
    public MessageType parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (MessageType) checkMessageInitialized((com.google.protobuf.MessageLite) parsePartialFrom(codedInputStream, extensionRegistryLite));
    }

    @Override // com.google.protobuf.Parser
    public MessageType parseFrom(com.google.protobuf.CodedInputStream input) throws com.google.protobuf.InvalidProtocolBufferException {
        return parseFrom(input, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.Parser
    public MessageType parsePartialFrom(com.google.protobuf.ByteString data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
        com.google.protobuf.CodedInputStream newCodedInput = data.newCodedInput();
        MessageType messagetype = (MessageType) parsePartialFrom(newCodedInput, extensionRegistry);
        try {
            newCodedInput.checkLastTagWas(0);
            return messagetype;
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(messagetype);
        }
    }

    @Override // com.google.protobuf.Parser
    public MessageType parsePartialFrom(com.google.protobuf.ByteString data) throws com.google.protobuf.InvalidProtocolBufferException {
        return parsePartialFrom(data, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.Parser
    public MessageType parseFrom(com.google.protobuf.ByteString data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialFrom(data, extensionRegistry));
    }

    @Override // com.google.protobuf.Parser
    public MessageType parseFrom(com.google.protobuf.ByteString data) throws com.google.protobuf.InvalidProtocolBufferException {
        return parseFrom(data, EMPTY_REGISTRY);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.Parser
    public MessageType parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        com.google.protobuf.CodedInputStream newInstance = com.google.protobuf.CodedInputStream.newInstance(byteBuffer);
        com.google.protobuf.MessageLite messageLite = (com.google.protobuf.MessageLite) parsePartialFrom(newInstance, extensionRegistryLite);
        try {
            newInstance.checkLastTagWas(0);
            return (MessageType) checkMessageInitialized(messageLite);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(messageLite);
        }
    }

    @Override // com.google.protobuf.Parser
    public MessageType parseFrom(java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
        return parseFrom(data, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.Parser
    public MessageType parsePartialFrom(byte[] data, int off, int len, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
        com.google.protobuf.CodedInputStream newInstance = com.google.protobuf.CodedInputStream.newInstance(data, off, len);
        MessageType messagetype = (MessageType) parsePartialFrom(newInstance, extensionRegistry);
        try {
            newInstance.checkLastTagWas(0);
            return messagetype;
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(messagetype);
        }
    }

    @Override // com.google.protobuf.Parser
    public MessageType parsePartialFrom(byte[] data, int off, int len) throws com.google.protobuf.InvalidProtocolBufferException {
        return parsePartialFrom(data, off, len, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.Parser
    public MessageType parsePartialFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
        return parsePartialFrom(data, 0, data.length, extensionRegistry);
    }

    @Override // com.google.protobuf.Parser
    public MessageType parsePartialFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
        return parsePartialFrom(data, 0, data.length, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.Parser
    public MessageType parseFrom(byte[] data, int off, int len, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialFrom(data, off, len, extensionRegistry));
    }

    @Override // com.google.protobuf.Parser
    public MessageType parseFrom(byte[] data, int off, int len) throws com.google.protobuf.InvalidProtocolBufferException {
        return parseFrom(data, off, len, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.Parser
    public MessageType parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
        return parseFrom(data, 0, data.length, extensionRegistry);
    }

    @Override // com.google.protobuf.Parser
    public MessageType parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
        return parseFrom(data, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.Parser
    public MessageType parsePartialFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
        com.google.protobuf.CodedInputStream newInstance = com.google.protobuf.CodedInputStream.newInstance(input);
        MessageType messagetype = (MessageType) parsePartialFrom(newInstance, extensionRegistry);
        try {
            newInstance.checkLastTagWas(0);
            return messagetype;
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(messagetype);
        }
    }

    @Override // com.google.protobuf.Parser
    public MessageType parsePartialFrom(java.io.InputStream input) throws com.google.protobuf.InvalidProtocolBufferException {
        return parsePartialFrom(input, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.Parser
    public MessageType parseFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialFrom(input, extensionRegistry));
    }

    @Override // com.google.protobuf.Parser
    public MessageType parseFrom(java.io.InputStream input) throws com.google.protobuf.InvalidProtocolBufferException {
        return parseFrom(input, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.Parser
    public MessageType parsePartialDelimitedFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
        try {
            int read = input.read();
            if (read == -1) {
                return null;
            }
            return parsePartialFrom((java.io.InputStream) new com.google.protobuf.AbstractMessageLite.Builder.LimitedInputStream(input, com.google.protobuf.CodedInputStream.readRawVarint32(read, input)), extensionRegistry);
        } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e);
        }
    }

    @Override // com.google.protobuf.Parser
    public MessageType parsePartialDelimitedFrom(java.io.InputStream input) throws com.google.protobuf.InvalidProtocolBufferException {
        return parsePartialDelimitedFrom(input, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.Parser
    public MessageType parseDelimitedFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialDelimitedFrom(input, extensionRegistry));
    }

    @Override // com.google.protobuf.Parser
    public MessageType parseDelimitedFrom(java.io.InputStream input) throws com.google.protobuf.InvalidProtocolBufferException {
        return parseDelimitedFrom(input, EMPTY_REGISTRY);
    }
}
