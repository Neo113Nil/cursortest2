package androidx.datastore.preferences.protobuf;

/* loaded from: classes2.dex */
public abstract class AbstractParser<MessageType extends androidx.datastore.preferences.protobuf.MessageLite> implements androidx.datastore.preferences.protobuf.Parser<MessageType> {
    private static final androidx.datastore.preferences.protobuf.ExtensionRegistryLite EMPTY_REGISTRY = androidx.datastore.preferences.protobuf.ExtensionRegistryLite.getEmptyRegistry();

    private androidx.datastore.preferences.protobuf.UninitializedMessageException newUninitializedMessageException(MessageType message) {
        if (message instanceof androidx.datastore.preferences.protobuf.AbstractMessageLite) {
            return ((androidx.datastore.preferences.protobuf.AbstractMessageLite) message).newUninitializedMessageException();
        }
        return new androidx.datastore.preferences.protobuf.UninitializedMessageException(message);
    }

    private MessageType checkMessageInitialized(MessageType message) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        if (message == null || message.isInitialized()) {
            return message;
        }
        throw newUninitializedMessageException(message).asInvalidProtocolBufferException().setUnfinishedMessage(message);
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public MessageType parsePartialFrom(androidx.datastore.preferences.protobuf.CodedInputStream input) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (MessageType) parsePartialFrom(input, EMPTY_REGISTRY);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.Parser
    public MessageType parseFrom(androidx.datastore.preferences.protobuf.CodedInputStream codedInputStream, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (MessageType) checkMessageInitialized((androidx.datastore.preferences.protobuf.MessageLite) parsePartialFrom(codedInputStream, extensionRegistryLite));
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public MessageType parseFrom(androidx.datastore.preferences.protobuf.CodedInputStream input) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return parseFrom(input, EMPTY_REGISTRY);
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public MessageType parsePartialFrom(androidx.datastore.preferences.protobuf.ByteString data, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        androidx.datastore.preferences.protobuf.CodedInputStream newCodedInput = data.newCodedInput();
        MessageType messagetype = (MessageType) parsePartialFrom(newCodedInput, extensionRegistry);
        try {
            newCodedInput.checkLastTagWas(0);
            return messagetype;
        } catch (androidx.datastore.preferences.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(messagetype);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public MessageType parsePartialFrom(androidx.datastore.preferences.protobuf.ByteString data) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return parsePartialFrom(data, EMPTY_REGISTRY);
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public MessageType parseFrom(androidx.datastore.preferences.protobuf.ByteString data, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialFrom(data, extensionRegistry));
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public MessageType parseFrom(androidx.datastore.preferences.protobuf.ByteString data) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return parseFrom(data, EMPTY_REGISTRY);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.Parser
    public MessageType parseFrom(java.nio.ByteBuffer byteBuffer, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        androidx.datastore.preferences.protobuf.CodedInputStream newInstance = androidx.datastore.preferences.protobuf.CodedInputStream.newInstance(byteBuffer);
        androidx.datastore.preferences.protobuf.MessageLite messageLite = (androidx.datastore.preferences.protobuf.MessageLite) parsePartialFrom(newInstance, extensionRegistryLite);
        try {
            newInstance.checkLastTagWas(0);
            return (MessageType) checkMessageInitialized(messageLite);
        } catch (androidx.datastore.preferences.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(messageLite);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public MessageType parseFrom(java.nio.ByteBuffer data) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return parseFrom(data, EMPTY_REGISTRY);
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public MessageType parsePartialFrom(byte[] data, int off, int len, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        androidx.datastore.preferences.protobuf.CodedInputStream newInstance = androidx.datastore.preferences.protobuf.CodedInputStream.newInstance(data, off, len);
        MessageType messagetype = (MessageType) parsePartialFrom(newInstance, extensionRegistry);
        try {
            newInstance.checkLastTagWas(0);
            return messagetype;
        } catch (androidx.datastore.preferences.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(messagetype);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public MessageType parsePartialFrom(byte[] data, int off, int len) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return parsePartialFrom(data, off, len, EMPTY_REGISTRY);
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public MessageType parsePartialFrom(byte[] data, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return parsePartialFrom(data, 0, data.length, extensionRegistry);
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public MessageType parsePartialFrom(byte[] data) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return parsePartialFrom(data, 0, data.length, EMPTY_REGISTRY);
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public MessageType parseFrom(byte[] data, int off, int len, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialFrom(data, off, len, extensionRegistry));
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public MessageType parseFrom(byte[] data, int off, int len) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return parseFrom(data, off, len, EMPTY_REGISTRY);
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public MessageType parseFrom(byte[] data, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return parseFrom(data, 0, data.length, extensionRegistry);
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public MessageType parseFrom(byte[] data) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return parseFrom(data, EMPTY_REGISTRY);
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public MessageType parsePartialFrom(java.io.InputStream input, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        androidx.datastore.preferences.protobuf.CodedInputStream newInstance = androidx.datastore.preferences.protobuf.CodedInputStream.newInstance(input);
        MessageType messagetype = (MessageType) parsePartialFrom(newInstance, extensionRegistry);
        try {
            newInstance.checkLastTagWas(0);
            return messagetype;
        } catch (androidx.datastore.preferences.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(messagetype);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public MessageType parsePartialFrom(java.io.InputStream input) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return parsePartialFrom(input, EMPTY_REGISTRY);
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public MessageType parseFrom(java.io.InputStream input, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialFrom(input, extensionRegistry));
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public MessageType parseFrom(java.io.InputStream input) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return parseFrom(input, EMPTY_REGISTRY);
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public MessageType parsePartialDelimitedFrom(java.io.InputStream input, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        try {
            int read = input.read();
            if (read == -1) {
                return null;
            }
            return parsePartialFrom((java.io.InputStream) new androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder.LimitedInputStream(input, androidx.datastore.preferences.protobuf.CodedInputStream.readRawVarint32(read, input)), extensionRegistry);
        } catch (java.io.IOException e) {
            throw new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException(e);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public MessageType parsePartialDelimitedFrom(java.io.InputStream input) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return parsePartialDelimitedFrom(input, EMPTY_REGISTRY);
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public MessageType parseDelimitedFrom(java.io.InputStream input, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialDelimitedFrom(input, extensionRegistry));
    }

    @Override // androidx.datastore.preferences.protobuf.Parser
    public MessageType parseDelimitedFrom(java.io.InputStream input) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return parseDelimitedFrom(input, EMPTY_REGISTRY);
    }
}
