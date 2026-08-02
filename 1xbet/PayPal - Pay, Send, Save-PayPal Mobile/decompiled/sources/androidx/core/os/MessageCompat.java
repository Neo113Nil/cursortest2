package androidx.core.os;

/* loaded from: classes7.dex */
public final class MessageCompat {
    public static void setAsynchronous(android.os.Message message, boolean z) {
        message.setAsynchronous(z);
    }

    public static boolean isAsynchronous(android.os.Message message) {
        return message.isAsynchronous();
    }

    private MessageCompat() {
    }
}
