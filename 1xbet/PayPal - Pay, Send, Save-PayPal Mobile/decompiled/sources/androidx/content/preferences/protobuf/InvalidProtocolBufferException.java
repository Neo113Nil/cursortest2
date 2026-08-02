package androidx.content.preferences.protobuf;

/* loaded from: classes3.dex */
public class InvalidProtocolBufferException extends java.io.IOException {
    private static final long serialVersionUID = -1616151763072450476L;
    private androidx.content.preferences.protobuf.MessageLite Camera2StreamConfigurationMap;
    boolean getHighSpeedVideoFpsRangesFor;

    public InvalidProtocolBufferException(java.lang.String str) {
        super(str);
        this.Camera2StreamConfigurationMap = null;
    }

    public InvalidProtocolBufferException(java.lang.Exception exc) {
        super(exc.getMessage(), exc);
        this.Camera2StreamConfigurationMap = null;
    }

    public InvalidProtocolBufferException(java.lang.String str, java.lang.Exception exc) {
        super(str, exc);
        this.Camera2StreamConfigurationMap = null;
    }

    public InvalidProtocolBufferException(java.io.IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.Camera2StreamConfigurationMap = null;
    }

    public InvalidProtocolBufferException(java.lang.String str, java.io.IOException iOException) {
        super(str, iOException);
        this.Camera2StreamConfigurationMap = null;
    }

    public androidx.content.preferences.protobuf.InvalidProtocolBufferException setUnfinishedMessage(androidx.content.preferences.protobuf.MessageLite messageLite) {
        this.Camera2StreamConfigurationMap = messageLite;
        return this;
    }

    public androidx.content.preferences.protobuf.MessageLite getUnfinishedMessage() {
        return this.Camera2StreamConfigurationMap;
    }

    public java.io.IOException unwrapIOException() {
        return getCause() instanceof java.io.IOException ? (java.io.IOException) getCause() : this;
    }

    static androidx.content.preferences.protobuf.InvalidProtocolBufferException getInputSizeshNQ4ISI() {
        return new androidx.content.preferences.protobuf.InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static androidx.content.preferences.protobuf.InvalidProtocolBufferException getInputFormats() {
        return new androidx.content.preferences.protobuf.InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static androidx.content.preferences.protobuf.InvalidProtocolBufferException Camera2StreamConfigurationMap() {
        return new androidx.content.preferences.protobuf.InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    static androidx.content.preferences.protobuf.InvalidProtocolBufferException getHighSpeedVideoFpsRanges() {
        return new androidx.content.preferences.protobuf.InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    static androidx.content.preferences.protobuf.InvalidProtocolBufferException getHighSpeedVideoFpsRangesFor() {
        return new androidx.content.preferences.protobuf.InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
    }

    static androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException getHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException("Protocol message tag had invalid wire type.");
    }

    public static class InvalidWireTypeException extends androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        private static final long serialVersionUID = 3283890091615336259L;

        public InvalidWireTypeException(java.lang.String str) {
            super(str);
        }
    }

    static androidx.content.preferences.protobuf.InvalidProtocolBufferException getOutputFormats() {
        return new androidx.content.preferences.protobuf.InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    static androidx.content.preferences.protobuf.InvalidProtocolBufferException getHighSpeedVideoSizesFor() {
        return new androidx.content.preferences.protobuf.InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static androidx.content.preferences.protobuf.InvalidProtocolBufferException getOutputMinFrameDuration() {
        return new androidx.content.preferences.protobuf.InvalidProtocolBufferException("Failed to parse the message.");
    }

    static androidx.content.preferences.protobuf.InvalidProtocolBufferException getHighSpeedVideoSizes() {
        return new androidx.content.preferences.protobuf.InvalidProtocolBufferException("Protocol message had invalid UTF-8.");
    }
}
