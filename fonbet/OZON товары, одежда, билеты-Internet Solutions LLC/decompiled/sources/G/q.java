package G;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public final class q {
    public static void a() {
        x2.i.f("Not in application's main thread", b());
    }

    public static boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static void c(@NonNull Runnable runnable) {
        if (b()) {
            runnable.run();
        } else {
            x2.i.f("Unable to post to main thread", new Handler(Looper.getMainLooper()).post(runnable));
        }
    }
}
