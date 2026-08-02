package io.sentry;

import io.sentry.util.IntegrationUtils;
import io.sentry.util.Objects;
import java.io.Closeable;

/* loaded from: classes2.dex */
public final class ShutdownHookIntegration implements Integration, Closeable {
    private final Runtime runtime;
    private Thread thread;

    public ShutdownHookIntegration(Runtime runtime) {
        this.runtime = (Runtime) Objects.requireNonNull(runtime, "Runtime is required");
    }

    private void handleShutdownInProgress(Runnable runnable) {
        try {
            runnable.run();
        } catch (IllegalStateException e7) {
            String message = e7.getMessage();
            if (message == null || !(message.equals("Shutdown in progress") || message.equals("VM already shutting down"))) {
                throw e7;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$close$2() {
        this.runtime.removeShutdownHook(this.thread);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$register$0(IScopes iScopes, SentryOptions sentryOptions) {
        iScopes.flush(sentryOptions.getFlushTimeoutMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$register$1(SentryOptions sentryOptions) {
        this.runtime.addShutdownHook(this.thread);
        sentryOptions.getLogger().log(SentryLevel.DEBUG, "ShutdownHookIntegration installed.", new Object[0]);
        IntegrationUtils.addIntegrationToSdkVersion("ShutdownHook");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.thread != null) {
            handleShutdownInProgress(new k(this, 1));
        }
    }

    public Thread getHook() {
        return this.thread;
    }

    @Override // io.sentry.Integration
    public void register(IScopes iScopes, SentryOptions sentryOptions) {
        Objects.requireNonNull(iScopes, "Scopes are required");
        Objects.requireNonNull(sentryOptions, "SentryOptions is required");
        if (!sentryOptions.isEnableShutdownHook()) {
            sentryOptions.getLogger().log(SentryLevel.INFO, "enableShutdownHook is disabled.", new Object[0]);
        } else {
            this.thread = new Thread(new a(3, iScopes, sentryOptions));
            handleShutdownInProgress(new a(4, this, sentryOptions));
        }
    }

    public ShutdownHookIntegration() {
        this(Runtime.getRuntime());
    }
}
