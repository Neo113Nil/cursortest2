package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes4.dex */
public class InvalidProtocolBufferException extends java.io.IOException {
    private static final long serialVersionUID = -1616151763072450476L;
    private com.google.crypto.tink.shaded.protobuf.MessageLite unfinishedMessage;
    private boolean wasThrownFromInputStream;

    public InvalidProtocolBufferException(java.lang.String str) {
        super(str);
        this.unfinishedMessage = null;
    }

    public InvalidProtocolBufferException(java.lang.Exception exc) {
        super(exc.getMessage(), exc);
        this.unfinishedMessage = null;
    }

    public InvalidProtocolBufferException(java.lang.String str, java.lang.Exception exc) {
        super(str, exc);
        this.unfinishedMessage = null;
    }

    public InvalidProtocolBufferException(java.io.IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.unfinishedMessage = null;
    }

    public InvalidProtocolBufferException(java.lang.String str, java.io.IOException iOException) {
        super(str, iOException);
        this.unfinishedMessage = null;
    }

    public com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException setUnfinishedMessage(com.google.crypto.tink.shaded.protobuf.MessageLite messageLite) {
        this.unfinishedMessage = messageLite;
        return this;
    }

    public com.google.crypto.tink.shaded.protobuf.MessageLite getUnfinishedMessage() {
        return this.unfinishedMessage;
    }

    void setThrownFromInputStream() {
        this.wasThrownFromInputStream = true;
    }

    boolean getThrownFromInputStream() {
        return this.wasThrownFromInputStream;
    }

    public java.io.IOException unwrapIOException() {
        return getCause() instanceof java.io.IOException ? (java.io.IOException) getCause() : this;
    }

    static com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException truncatedMessage() {
        return new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException negativeSize() {
        return new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException malformedVarint() {
        return new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    static com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException invalidTag() {
        return new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    static com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException invalidEndTag() {
        return new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
    }

    static com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException invalidWireType() {
        return new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException("Protocol message tag had invalid wire type.");
    }

    public static class InvalidWireTypeException extends com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        private static final long serialVersionUID = 3283890091615336259L;

        public InvalidWireTypeException(java.lang.String str) {
            super(str);
        }
    }

    static com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException recursionLimitExceeded() {
        return new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    static com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException sizeLimitExceeded() {
        return new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException parseFailure() {
        return new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException("Failed to parse the message.");
    }

    static com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException invalidUtf8() {
        return new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException("Protocol message had invalid UTF-8.");
    }
}
