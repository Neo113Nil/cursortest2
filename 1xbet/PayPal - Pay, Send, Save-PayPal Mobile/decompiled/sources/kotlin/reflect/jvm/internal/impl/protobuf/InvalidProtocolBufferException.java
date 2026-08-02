package kotlin.reflect.jvm.internal.impl.protobuf;

/* loaded from: classes5.dex */
public class InvalidProtocolBufferException extends java.io.IOException {
    private kotlin.reflect.jvm.internal.impl.protobuf.MessageLite getHighSpeedVideoSizes;

    public InvalidProtocolBufferException(java.lang.String str) {
        super(str);
        this.getHighSpeedVideoSizes = null;
    }

    public kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException setUnfinishedMessage(kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite) {
        this.getHighSpeedVideoSizes = messageLite;
        return this;
    }

    public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite getUnfinishedMessage() {
        return this.getHighSpeedVideoSizes;
    }

    static kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException getOutputMinFrameDuration() {
        return new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    static kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException getOutputFormats() {
        return new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException getHighSpeedVideoSizes() {
        return new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    static kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException getHighSpeedVideoFpsRanges() {
        return new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    static kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException getHighResolutionOutputSizeshNQ4ISI() {
        return new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
    }

    static kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException Camera2StreamConfigurationMap() {
        return new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException("Protocol message tag had invalid wire type.");
    }

    static kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException getInputFormats() {
        return new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    static kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException getInputSizeshNQ4ISI() {
        return new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException getHighSpeedVideoFpsRangesFor() {
        return new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException("Protocol message had invalid UTF-8.");
    }
}
