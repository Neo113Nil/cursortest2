package androidx.core.os;

/* loaded from: classes.dex */
public class UserManagerCompat {
    private UserManagerCompat() {
    }

    public static boolean isUserUnlocked(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            return androidx.core.os.UserManagerCompat.Api24Impl.isUserUnlocked(context);
        }
        return true;
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static boolean isUserUnlocked(android.content.Context context) {
            return ((android.os.UserManager) context.getSystemService(android.os.UserManager.class)).isUserUnlocked();
        }
    }
}
