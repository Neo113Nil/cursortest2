package androidx.core.os;

/* loaded from: classes7.dex */
public class UserHandleCompat {
    private UserHandleCompat() {
    }

    public static android.os.UserHandle getUserHandleForUid(int i) {
        return androidx.core.os.UserHandleCompat.Api24Impl.getHighResolutionOutputSizeshNQ4ISI(i);
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static android.os.UserHandle getHighResolutionOutputSizeshNQ4ISI(int i) {
            return android.os.UserHandle.getUserHandleForUid(i);
        }
    }
}
