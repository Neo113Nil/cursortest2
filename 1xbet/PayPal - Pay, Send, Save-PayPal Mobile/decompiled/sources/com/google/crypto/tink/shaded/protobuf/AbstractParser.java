package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes4.dex */
public abstract class AbstractParser<MessageType extends com.google.crypto.tink.shaded.protobuf.MessageLite> implements com.google.crypto.tink.shaded.protobuf.Parser<MessageType> {
    private static final com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite EMPTY_REGISTRY = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry();

    private com.google.crypto.tink.shaded.protobuf.UninitializedMessageException newUninitializedMessageException(MessageType messagetype) {
        if (messagetype instanceof com.google.crypto.tink.shaded.protobuf.AbstractMessageLite) {
            return ((com.google.crypto.tink.shaded.protobuf.AbstractMessageLite) messagetype).newUninitializedMessageException();
        }
        return new com.google.crypto.tink.shaded.protobuf.UninitializedMessageException(messagetype);
    }

    private MessageType checkMessageInitialized(MessageType messagetype) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        throw newUninitializedMessageException(messagetype).asInvalidProtocolBufferException().setUnfinishedMessage(messagetype);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parsePartialFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (MessageType) parsePartialFrom(codedInputStream, EMPTY_REGISTRY);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (MessageType) checkMessageInitialized((com.google.crypto.tink.shaded.protobuf.MessageLite) parsePartialFrom(codedInputStream, extensionRegistryLite));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return parseFrom(codedInputStream, EMPTY_REGISTRY);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parsePartialFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        com.google.crypto.tink.shaded.protobuf.CodedInputStream newCodedInput = byteString.newCodedInput();
        MessageType messagetype = (MessageType) parsePartialFrom(newCodedInput, extensionRegistryLite);
        try {
            newCodedInput.checkLastTagWas(0);
            return messagetype;
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(messagetype);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parsePartialFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return parsePartialFrom(byteString, EMPTY_REGISTRY);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialFrom(byteString, extensionRegistryLite));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return parseFrom(byteString, EMPTY_REGISTRY);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parseFrom(java.nio.ByteBuffer byteBuffer, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        com.google.crypto.tink.shaded.protobuf.CodedInputStream newInstance = com.google.crypto.tink.shaded.protobuf.CodedInputStream.newInstance(byteBuffer);
        com.google.crypto.tink.shaded.protobuf.MessageLite messageLite = (com.google.crypto.tink.shaded.protobuf.MessageLite) parsePartialFrom(newInstance, extensionRegistryLite);
        try {
            newInstance.checkLastTagWas(0);
            return (MessageType) checkMessageInitialized(messageLite);
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(messageLite);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return parseFrom(byteBuffer, EMPTY_REGISTRY);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parsePartialFrom(byte[] bArr, int i, int i2, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        com.google.crypto.tink.shaded.protobuf.CodedInputStream newInstance = com.google.crypto.tink.shaded.protobuf.CodedInputStream.newInstance(bArr, i, i2);
        MessageType messagetype = (MessageType) parsePartialFrom(newInstance, extensionRegistryLite);
        try {
            newInstance.checkLastTagWas(0);
            return messagetype;
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(messagetype);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parsePartialFrom(byte[] bArr, int i, int i2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return parsePartialFrom(bArr, i, i2, EMPTY_REGISTRY);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parsePartialFrom(byte[] bArr, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return parsePartialFrom(bArr, 0, bArr.length, extensionRegistryLite);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parsePartialFrom(byte[] bArr) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return parsePartialFrom(bArr, 0, bArr.length, EMPTY_REGISTRY);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parseFrom(byte[] bArr, int i, int i2, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialFrom(bArr, i, i2, extensionRegistryLite));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parseFrom(byte[] bArr, int i, int i2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return parseFrom(bArr, i, i2, EMPTY_REGISTRY);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parseFrom(byte[] bArr, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return parseFrom(bArr, 0, bArr.length, extensionRegistryLite);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parseFrom(byte[] bArr) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return parseFrom(bArr, EMPTY_REGISTRY);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parsePartialFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        com.google.crypto.tink.shaded.protobuf.CodedInputStream newInstance = com.google.crypto.tink.shaded.protobuf.CodedInputStream.newInstance(inputStream);
        MessageType messagetype = (MessageType) parsePartialFrom(newInstance, extensionRegistryLite);
        try {
            newInstance.checkLastTagWas(0);
            return messagetype;
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(messagetype);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parsePartialFrom(java.io.InputStream inputStream) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return parsePartialFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parseFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialFrom(inputStream, extensionRegistryLite));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parseFrom(java.io.InputStream inputStream) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return parseFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parsePartialDelimitedFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            return parsePartialFrom((java.io.InputStream) new com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder.LimitedInputStream(inputStream, com.google.crypto.tink.shaded.protobuf.CodedInputStream.readRawVarint32(read, inputStream)), extensionRegistryLite);
        } catch (java.io.IOException e) {
            throw new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException(e);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parsePartialDelimitedFrom(java.io.InputStream inputStream) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return parsePartialDelimitedFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parseDelimitedFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialDelimitedFrom(inputStream, extensionRegistryLite));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parseDelimitedFrom(java.io.InputStream inputStream) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return parseDelimitedFrom(inputStream, EMPTY_REGISTRY);
    }
}
