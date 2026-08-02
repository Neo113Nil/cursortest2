package kotlin.reflect.jvm.internal.impl.protobuf;

/* loaded from: classes5.dex */
public abstract class AbstractParser<MessageType extends kotlin.reflect.jvm.internal.impl.protobuf.MessageLite> implements kotlin.reflect.jvm.internal.impl.protobuf.Parser<MessageType> {
    private static final kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite getHighSpeedVideoFpsRanges = kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite.getEmptyRegistry();

    private static MessageType getHighSpeedVideoFpsRangesFor(MessageType messagetype) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
        kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException uninitializedMessageException;
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        if (!(messagetype instanceof kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite)) {
            uninitializedMessageException = new kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException(messagetype);
        } else {
            uninitializedMessageException = new kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException((kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite) messagetype);
        }
        throw uninitializedMessageException.asInvalidProtocolBufferException().setUnfinishedMessage(messagetype);
    }

    public MessageType parsePartialFrom(kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
        kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream newCodedInput = byteString.newCodedInput();
        MessageType messagetype = (MessageType) parsePartialFrom(newCodedInput, extensionRegistryLite);
        try {
            newCodedInput.checkLastTagWas(0);
            return messagetype;
        } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(messagetype);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
    public MessageType parseFrom(kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
        return (MessageType) getHighSpeedVideoFpsRangesFor(parsePartialFrom(byteString, extensionRegistryLite));
    }

    public MessageType parsePartialFrom(java.io.InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
        kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream newInstance = kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream.newInstance(inputStream);
        MessageType messagetype = (MessageType) parsePartialFrom(newInstance, extensionRegistryLite);
        try {
            newInstance.checkLastTagWas(0);
            return messagetype;
        } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(messagetype);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
    public MessageType parseFrom(java.io.InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
        return (MessageType) getHighSpeedVideoFpsRangesFor(parsePartialFrom(inputStream, extensionRegistryLite));
    }

    public MessageType parsePartialDelimitedFrom(java.io.InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            return parsePartialFrom(new kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.LimitedInputStream(inputStream, kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream.readRawVarint32(read, inputStream)), extensionRegistryLite);
        } catch (java.io.IOException e) {
            throw new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException(e.getMessage());
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
    public MessageType parseDelimitedFrom(java.io.InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
        return (MessageType) getHighSpeedVideoFpsRangesFor(parsePartialDelimitedFrom(inputStream, extensionRegistryLite));
    }
}
