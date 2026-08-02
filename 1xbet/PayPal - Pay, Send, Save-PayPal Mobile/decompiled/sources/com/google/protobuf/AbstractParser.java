package com.google.protobuf;

/* loaded from: classes9.dex */
public abstract class AbstractParser<MessageType extends com.google.protobuf.MessageLite> implements com.google.protobuf.Parser<MessageType> {
    private static final com.google.protobuf.ExtensionRegistryLite EMPTY_REGISTRY = com.google.protobuf.ExtensionRegistryLite.getEmptyRegistry();

    private com.google.protobuf.UninitializedMessageException newUninitializedMessageException(MessageType messagetype) {
        if (messagetype instanceof com.google.protobuf.AbstractMessageLite) {
            return ((com.google.protobuf.AbstractMessageLite) messagetype).newUninitializedMessageException();
        }
        return new com.google.protobuf.UninitializedMessageException(messagetype);
    }

    private MessageType checkMessageInitialized(MessageType messagetype) throws com.google.protobuf.InvalidProtocolBufferException {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        throw newUninitializedMessageException(messagetype).asInvalidProtocolBufferException().setUnfinishedMessage(messagetype);
    }

    @Override // com.google.protobuf.Parser
    public MessageType parsePartialFrom(com.google.protobuf.CodedInputStream codedInputStream) throws com.google.protobuf.InvalidProtocolBufferException {
        return (MessageType) parsePartialFrom(codedInputStream, EMPTY_REGISTRY);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.Parser
    public MessageType parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (MessageType) checkMessageInitialized((com.google.protobuf.MessageLite) parsePartialFrom(codedInputStream, extensionRegistryLite));
    }

    @Override // com.google.protobuf.Parser
    public MessageType parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws com.google.protobuf.InvalidProtocolBufferException {
        return parseFrom(codedInputStream, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.Parser
    public MessageType parsePartialFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        com.google.protobuf.CodedInputStream newCodedInput = byteString.newCodedInput();
        MessageType messagetype = (MessageType) parsePartialFrom(newCodedInput, extensionRegistryLite);
        try {
            newCodedInput.checkLastTagWas(0);
            return messagetype;
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(messagetype);
        }
    }

    @Override // com.google.protobuf.Parser
    public MessageType parsePartialFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
        return parsePartialFrom(byteString, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.Parser
    public MessageType parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialFrom(byteString, extensionRegistryLite));
    }

    @Override // com.google.protobuf.Parser
    public MessageType parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
        return parseFrom(byteString, EMPTY_REGISTRY);
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
    public MessageType parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
        return parseFrom(byteBuffer, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.Parser
    public MessageType parsePartialFrom(byte[] bArr, int i, int i2, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        com.google.protobuf.CodedInputStream newInstance = com.google.protobuf.CodedInputStream.newInstance(bArr, i, i2);
        MessageType messagetype = (MessageType) parsePartialFrom(newInstance, extensionRegistryLite);
        try {
            newInstance.checkLastTagWas(0);
            return messagetype;
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(messagetype);
        }
    }

    @Override // com.google.protobuf.Parser
    public MessageType parsePartialFrom(byte[] bArr, int i, int i2) throws com.google.protobuf.InvalidProtocolBufferException {
        return parsePartialFrom(bArr, i, i2, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.Parser
    public MessageType parsePartialFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return parsePartialFrom(bArr, 0, bArr.length, extensionRegistryLite);
    }

    @Override // com.google.protobuf.Parser
    public MessageType parsePartialFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
        return parsePartialFrom(bArr, 0, bArr.length, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.Parser
    public MessageType parseFrom(byte[] bArr, int i, int i2, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialFrom(bArr, i, i2, extensionRegistryLite));
    }

    @Override // com.google.protobuf.Parser
    public MessageType parseFrom(byte[] bArr, int i, int i2) throws com.google.protobuf.InvalidProtocolBufferException {
        return parseFrom(bArr, i, i2, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.Parser
    public MessageType parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return parseFrom(bArr, 0, bArr.length, extensionRegistryLite);
    }

    @Override // com.google.protobuf.Parser
    public MessageType parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
        return parseFrom(bArr, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.Parser
    public MessageType parsePartialFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        com.google.protobuf.CodedInputStream newInstance = com.google.protobuf.CodedInputStream.newInstance(inputStream);
        MessageType messagetype = (MessageType) parsePartialFrom(newInstance, extensionRegistryLite);
        try {
            newInstance.checkLastTagWas(0);
            return messagetype;
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(messagetype);
        }
    }

    @Override // com.google.protobuf.Parser
    public MessageType parsePartialFrom(java.io.InputStream inputStream) throws com.google.protobuf.InvalidProtocolBufferException {
        return parsePartialFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.Parser
    public MessageType parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialFrom(inputStream, extensionRegistryLite));
    }

    @Override // com.google.protobuf.Parser
    public MessageType parseFrom(java.io.InputStream inputStream) throws com.google.protobuf.InvalidProtocolBufferException {
        return parseFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.Parser
    public MessageType parsePartialDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            return parsePartialFrom((java.io.InputStream) new com.google.protobuf.AbstractMessageLite.Builder.LimitedInputStream(inputStream, com.google.protobuf.CodedInputStream.readRawVarint32(read, inputStream)), extensionRegistryLite);
        } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e);
        }
    }

    @Override // com.google.protobuf.Parser
    public MessageType parsePartialDelimitedFrom(java.io.InputStream inputStream) throws com.google.protobuf.InvalidProtocolBufferException {
        return parsePartialDelimitedFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.Parser
    public MessageType parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialDelimitedFrom(inputStream, extensionRegistryLite));
    }

    @Override // com.google.protobuf.Parser
    public MessageType parseDelimitedFrom(java.io.InputStream inputStream) throws com.google.protobuf.InvalidProtocolBufferException {
        return parseDelimitedFrom(inputStream, EMPTY_REGISTRY);
    }
}
