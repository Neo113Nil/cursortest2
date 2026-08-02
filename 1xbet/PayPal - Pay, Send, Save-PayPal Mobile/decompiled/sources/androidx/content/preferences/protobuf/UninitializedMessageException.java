package androidx.content.preferences.protobuf;

/* loaded from: classes3.dex */
public class UninitializedMessageException extends java.lang.RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;
    private final java.util.List<java.lang.String> getHighSpeedVideoFpsRanges;

    public UninitializedMessageException(androidx.content.preferences.protobuf.MessageLite messageLite) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.getHighSpeedVideoFpsRanges = null;
    }

    public UninitializedMessageException(java.util.List<java.lang.String> list) {
        super(getHighSpeedVideoFpsRanges(list));
        this.getHighSpeedVideoFpsRanges = list;
    }

    public java.util.List<java.lang.String> getMissingFields() {
        return java.util.Collections.unmodifiableList(this.getHighSpeedVideoFpsRanges);
    }

    public androidx.content.preferences.protobuf.InvalidProtocolBufferException asInvalidProtocolBufferException() {
        return new androidx.content.preferences.protobuf.InvalidProtocolBufferException(getMessage());
    }

    private static java.lang.String getHighSpeedVideoFpsRanges(java.util.List<java.lang.String> list) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Message missing required fields: ");
        boolean z = true;
        for (java.lang.String str : list) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
