package androidx.media3.common.util;

import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

@UnstableApi
/* loaded from: classes3.dex */
public final class BackgroundExecutor {

    @Nullable
    private static Executor staticInstance;

    private BackgroundExecutor() {
    }

    public static synchronized Executor get() {
        Executor executor;
        synchronized (BackgroundExecutor.class) {
            try {
                if (staticInstance == null) {
                    staticInstance = Util.newSingleThreadExecutor("ExoPlayer:BackgroundExecutor");
                }
                executor = staticInstance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return executor;
    }

    public static synchronized void set(Executor executor) {
        synchronized (BackgroundExecutor.class) {
            staticInstance = executor;
        }
    }
}
