package io.sentry.android.replay.util;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.runtime.internal.StabilityInferred;
import t6.e;
import t6.h;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class MainLooperHandler {
    public static final int $stable = 8;
    private final Handler handler;

    /* JADX WARN: Multi-variable type inference failed */
    public MainLooperHandler() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Handler getHandler() {
        return this.handler;
    }

    public final void post(Runnable runnable) {
        h.e(runnable, "runnable");
        this.handler.post(runnable);
    }

    public MainLooperHandler(Looper looper) {
        h.e(looper, "looper");
        this.handler = new Handler(looper);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MainLooperHandler(Looper looper, int i7, e eVar) {
        if ((i7 & 1) != 0) {
            looper = Looper.getMainLooper();
            h.d(looper, "getMainLooper()");
        }
        this(looper);
    }
}
