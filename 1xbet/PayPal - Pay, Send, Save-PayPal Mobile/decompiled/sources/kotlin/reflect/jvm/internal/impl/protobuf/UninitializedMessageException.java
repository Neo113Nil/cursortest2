package kotlin.reflect.jvm.internal.impl.protobuf;

/* loaded from: classes5.dex */
public class UninitializedMessageException extends java.lang.RuntimeException {
    private final java.util.List<java.lang.String> getHighSpeedVideoSizes;

    public UninitializedMessageException(kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.getHighSpeedVideoSizes = null;
    }

    public kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException asInvalidProtocolBufferException() {
        return new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException(getMessage());
    }
}
