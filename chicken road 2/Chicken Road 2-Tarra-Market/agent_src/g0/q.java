package g0;

import android.os.Build;

/* loaded from: classes.dex */
public abstract class q {
    public static long a(Thread thread) {
        return Build.VERSION.SDK_INT >= 36 ? thread.threadId() : thread.getId();
    }
}
