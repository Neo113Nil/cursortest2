package androidx.core.os;

/* loaded from: classes.dex */
public final class MessageCompat {
    private static boolean sTryIsAsynchronous = true;
    private static boolean sTrySetAsynchronous = true;

    public static void setAsynchronous(android.os.Message message, boolean z) {
        if (android.os.Build.VERSION.SDK_INT >= 22) {
            androidx.core.os.MessageCompat.Api22Impl.setAsynchronous(message, z);
        } else if (sTrySetAsynchronous) {
            try {
                androidx.core.os.MessageCompat.Api22Impl.setAsynchronous(message, z);
            } catch (java.lang.NoSuchMethodError unused) {
                sTrySetAsynchronous = false;
            }
        }
    }

    public static boolean isAsynchronous(android.os.Message message) {
        if (android.os.Build.VERSION.SDK_INT >= 22) {
            return androidx.core.os.MessageCompat.Api22Impl.isAsynchronous(message);
        }
        if (sTryIsAsynchronous) {
            try {
                return androidx.core.os.MessageCompat.Api22Impl.isAsynchronous(message);
            } catch (java.lang.NoSuchMethodError unused) {
                sTryIsAsynchronous = false;
            }
        }
        return false;
    }

    private MessageCompat() {
    }

    static class Api22Impl {
        private Api22Impl() {
        }

        static boolean isAsynchronous(android.os.Message message) {
            return message.isAsynchronous();
        }

        static void setAsynchronous(android.os.Message message, boolean z) {
            message.setAsynchronous(z);
        }
    }
}
