package androidx.camera.core.impl;

import android.os.Handler;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* loaded from: classes8.dex */
public abstract class N {
    @NonNull
    public static N a(@NonNull Executor executor, @NonNull Handler handler) {
        return new C5085c(executor, handler);
    }

    @NonNull
    public abstract Executor b();

    @NonNull
    public abstract Handler c();
}
