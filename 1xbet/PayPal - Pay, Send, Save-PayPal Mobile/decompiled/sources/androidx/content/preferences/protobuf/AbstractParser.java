package androidx.content.preferences.protobuf;

/* loaded from: classes3.dex */
public abstract class AbstractParser<MessageType extends androidx.content.preferences.protobuf.MessageLite> implements androidx.content.preferences.protobuf.Parser<MessageType> {
    private static final androidx.content.preferences.protobuf.ExtensionRegistryLite Camera2StreamConfigurationMap = androidx.content.preferences.protobuf.ExtensionRegistryLite.getEmptyRegistry();

    private static MessageType getHighSpeedVideoSizes(MessageType messagetype) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        androidx.content.preferences.protobuf.UninitializedMessageException uninitializedMessageException;
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        if (messagetype instanceof androidx.content.preferences.protobuf.AbstractMessageLite) {
            uninitializedMessageException = ((androidx.content.preferences.protobuf.AbstractMessageLite) messagetype).getHighResolutionOutputSizeshNQ4ISI();
        } else {
            uninitializedMessageException = new androidx.content.preferences.protobuf.UninitializedMessageException(messagetype);
        }
        throw uninitializedMessageException.asInvalidProtocolBufferException().setUnfinishedMessage(messagetype);
    }

    @Override // androidx.content.preferences.protobuf.Parser
    public MessageType parsePartialFrom(androidx.content.preferences.protobuf.CodedInputStream codedInputStream) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (MessageType) parsePartialFrom(codedInputStream, Camera2StreamConfigurationMap);
    }

    @Override // androidx.content.preferences.protobuf.Parser
    public MessageType parseFrom(androidx.content.preferences.protobuf.CodedInputStream codedInputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (MessageType) getHighSpeedVideoSizes((androidx.content.preferences.protobuf.MessageLite) parsePartialFrom(codedInputStream, extensionRegistryLite));
    }

    @Override // androidx.content.preferences.protobuf.Parser
    public MessageType parseFrom(androidx.content.preferences.protobuf.CodedInputStream codedInputStream) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return parseFrom(codedInputStream, Camera2StreamConfigurationMap);
    }

    @Override // androidx.content.preferences.protobuf.Parser
    public MessageType parsePartialFrom(androidx.content.preferences.protobuf.ByteString byteString, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        androidx.content.preferences.protobuf.CodedInputStream newCodedInput = byteString.newCodedInput();
        MessageType messagetype = (MessageType) parsePartialFrom(newCodedInput, extensionRegistryLite);
        try {
            newCodedInput.checkLastTagWas(0);
            return messagetype;
        } catch (androidx.content.preferences.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(messagetype);
        }
    }

    @Override // androidx.content.preferences.protobuf.Parser
    public MessageType parsePartialFrom(androidx.content.preferences.protobuf.ByteString byteString) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return parsePartialFrom(byteString, Camera2StreamConfigurationMap);
    }

    @Override // androidx.content.preferences.protobuf.Parser
    public MessageType parseFrom(androidx.content.preferences.protobuf.ByteString byteString, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (MessageType) getHighSpeedVideoSizes(parsePartialFrom(byteString, extensionRegistryLite));
    }

    @Override // androidx.content.preferences.protobuf.Parser
    public MessageType parseFrom(androidx.content.preferences.protobuf.ByteString byteString) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return parseFrom(byteString, Camera2StreamConfigurationMap);
    }

    @Override // androidx.content.preferences.protobuf.Parser
    public MessageType parseFrom(java.nio.ByteBuffer byteBuffer, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        androidx.content.preferences.protobuf.CodedInputStream newInstance = androidx.content.preferences.protobuf.CodedInputStream.newInstance(byteBuffer);
        androidx.content.preferences.protobuf.MessageLite messageLite = (androidx.content.preferences.protobuf.MessageLite) parsePartialFrom(newInstance, extensionRegistryLite);
        try {
            newInstance.checkLastTagWas(0);
            return (MessageType) getHighSpeedVideoSizes(messageLite);
        } catch (androidx.content.preferences.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(messageLite);
        }
    }

    @Override // androidx.content.preferences.protobuf.Parser
    public MessageType parseFrom(java.nio.ByteBuffer byteBuffer) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return parseFrom(byteBuffer, Camera2StreamConfigurationMap);
    }

    @Override // androidx.content.preferences.protobuf.Parser
    public MessageType parsePartialFrom(byte[] bArr, int i, int i2, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        androidx.content.preferences.protobuf.CodedInputStream newInstance = androidx.content.preferences.protobuf.CodedInputStream.newInstance(bArr, i, i2);
        MessageType messagetype = (MessageType) parsePartialFrom(newInstance, extensionRegistryLite);
        try {
            newInstance.checkLastTagWas(0);
            return messagetype;
        } catch (androidx.content.preferences.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(messagetype);
        }
    }

    @Override // androidx.content.preferences.protobuf.Parser
    public MessageType parsePartialFrom(byte[] bArr, int i, int i2) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return parsePartialFrom(bArr, i, i2, Camera2StreamConfigurationMap);
    }

    @Override // androidx.content.preferences.protobuf.Parser
    public MessageType parsePartialFrom(byte[] bArr, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return parsePartialFrom(bArr, 0, bArr.length, extensionRegistryLite);
    }

    @Override // androidx.content.preferences.protobuf.Parser
    public MessageType parsePartialFrom(byte[] bArr) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return parsePartialFrom(bArr, 0, bArr.length, Camera2StreamConfigurationMap);
    }

    @Override // androidx.content.preferences.protobuf.Parser
    public MessageType parseFrom(byte[] bArr, int i, int i2, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (MessageType) getHighSpeedVideoSizes(parsePartialFrom(bArr, i, i2, extensionRegistryLite));
    }

    @Override // androidx.content.preferences.protobuf.Parser
    public MessageType parseFrom(byte[] bArr, int i, int i2) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return parseFrom(bArr, i, i2, Camera2StreamConfigurationMap);
    }

    @Override // androidx.content.preferences.protobuf.Parser
    public MessageType parseFrom(byte[] bArr, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return parseFrom(bArr, 0, bArr.length, extensionRegistryLite);
    }

    @Override // androidx.content.preferences.protobuf.Parser
    public MessageType parseFrom(byte[] bArr) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return parseFrom(bArr, Camera2StreamConfigurationMap);
    }

    @Override // androidx.content.preferences.protobuf.Parser
    public MessageType parsePartialFrom(java.io.InputStream inputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        androidx.content.preferences.protobuf.CodedInputStream newInstance = androidx.content.preferences.protobuf.CodedInputStream.newInstance(inputStream);
        MessageType messagetype = (MessageType) parsePartialFrom(newInstance, extensionRegistryLite);
        try {
            newInstance.checkLastTagWas(0);
            return messagetype;
        } catch (androidx.content.preferences.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(messagetype);
        }
    }

    @Override // androidx.content.preferences.protobuf.Parser
    public MessageType parsePartialFrom(java.io.InputStream inputStream) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return parsePartialFrom(inputStream, Camera2StreamConfigurationMap);
    }

    @Override // androidx.content.preferences.protobuf.Parser
    public MessageType parseFrom(java.io.InputStream inputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (MessageType) getHighSpeedVideoSizes(parsePartialFrom(inputStream, extensionRegistryLite));
    }

    @Override // androidx.content.preferences.protobuf.Parser
    public MessageType parseFrom(java.io.InputStream inputStream) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return parseFrom(inputStream, Camera2StreamConfigurationMap);
    }

    @Override // androidx.content.preferences.protobuf.Parser
    public MessageType parsePartialDelimitedFrom(java.io.InputStream inputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            return parsePartialFrom((java.io.InputStream) new androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder.LimitedInputStream(inputStream, androidx.content.preferences.protobuf.CodedInputStream.readRawVarint32(read, inputStream)), extensionRegistryLite);
        } catch (java.io.IOException e) {
            throw new androidx.content.preferences.protobuf.InvalidProtocolBufferException(e);
        }
    }

    @Override // androidx.content.preferences.protobuf.Parser
    public MessageType parsePartialDelimitedFrom(java.io.InputStream inputStream) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return parsePartialDelimitedFrom(inputStream, Camera2StreamConfigurationMap);
    }

    @Override // androidx.content.preferences.protobuf.Parser
    public MessageType parseDelimitedFrom(java.io.InputStream inputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (MessageType) getHighSpeedVideoSizes(parsePartialDelimitedFrom(inputStream, extensionRegistryLite));
    }

    @Override // androidx.content.preferences.protobuf.Parser
    public MessageType parseDelimitedFrom(java.io.InputStream inputStream) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return parseDelimitedFrom(inputStream, Camera2StreamConfigurationMap);
    }
}
