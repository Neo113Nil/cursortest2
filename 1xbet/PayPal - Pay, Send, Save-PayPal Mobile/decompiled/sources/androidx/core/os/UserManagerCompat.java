package androidx.core.os;

/* loaded from: classes3.dex */
public class UserManagerCompat {
    private UserManagerCompat() {
    }

    public static boolean isUserUnlocked(android.content.Context context) {
        return androidx.core.os.UserManagerCompat.Api24Impl.getHighSpeedVideoFpsRanges(context);
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static boolean getHighSpeedVideoFpsRanges(android.content.Context context) {
            return ((android.os.UserManager) context.getSystemService(android.os.UserManager.class)).isUserUnlocked();
        }
    }
}
