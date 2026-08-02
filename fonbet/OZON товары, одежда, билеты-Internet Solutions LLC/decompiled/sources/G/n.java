package G;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private static volatile Handler f9646a;

    private n() {
    }

    @NonNull
    public static Handler a() {
        if (f9646a != null) {
            return f9646a;
        }
        synchronized (n.class) {
            try {
                if (f9646a == null) {
                    f9646a = androidx.core.os.h.a(Looper.getMainLooper());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f9646a;
    }
}
