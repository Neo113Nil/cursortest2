package androidx.camera.core.internal;

/* loaded from: classes6.dex */
public interface IoConfig extends androidx.camera.core.impl.ReadableConfig {
    public static final androidx.camera.core.impl.Config.Option<java.util.concurrent.Executor> OPTION_IO_EXECUTOR = androidx.camera.core.impl.Config.Option.create("camerax.core.io.ioExecutor", java.util.concurrent.Executor.class);

    public interface Builder<B> {
        B setIoExecutor(java.util.concurrent.Executor executor);
    }

    default java.util.concurrent.Executor getIoExecutor(java.util.concurrent.Executor executor) {
        return (java.util.concurrent.Executor) retrieveOption(OPTION_IO_EXECUTOR, executor);
    }

    default java.util.concurrent.Executor getIoExecutor() {
        return (java.util.concurrent.Executor) retrieveOption(OPTION_IO_EXECUTOR);
    }
}
