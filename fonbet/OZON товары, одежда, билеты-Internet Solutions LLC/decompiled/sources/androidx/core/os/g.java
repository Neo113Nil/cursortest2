package androidx.core.os;

import android.os.Handler;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes8.dex */
public final class g {

    private static class a implements Executor {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f42183a;

        a(@NonNull Handler handler) {
            this.f42183a = handler;
        }

        @Override // java.util.concurrent.Executor
        public final void execute(@NonNull Runnable runnable) {
            runnable.getClass();
            Handler handler = this.f42183a;
            if (handler.post(runnable)) {
                return;
            }
            throw new RejectedExecutionException(handler + " is shutting down");
        }
    }

    @NonNull
    public static Executor a(@NonNull Handler handler) {
        return new a(handler);
    }
}
