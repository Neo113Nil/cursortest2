package androidx.camera.core.internal;

/* loaded from: classes6.dex */
public interface ThreadConfig extends androidx.camera.core.impl.ReadableConfig {
    public static final androidx.camera.core.impl.Config.Option<java.util.concurrent.Executor> OPTION_BACKGROUND_EXECUTOR = androidx.camera.core.impl.Config.Option.create("camerax.core.thread.backgroundExecutor", java.util.concurrent.Executor.class);

    public interface Builder<B> {
        B setBackgroundExecutor(java.util.concurrent.Executor executor);
    }

    default java.util.concurrent.Executor getBackgroundExecutor(java.util.concurrent.Executor executor) {
        return (java.util.concurrent.Executor) retrieveOption(OPTION_BACKGROUND_EXECUTOR, executor);
    }

    default java.util.concurrent.Executor getBackgroundExecutor() {
        return (java.util.concurrent.Executor) retrieveOption(OPTION_BACKGROUND_EXECUTOR);
    }
}
