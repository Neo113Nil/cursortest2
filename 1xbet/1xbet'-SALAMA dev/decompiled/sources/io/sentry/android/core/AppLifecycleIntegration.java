package io.sentry.android.core;

import androidx.lifecycle.ProcessLifecycleOwner;
import io.sentry.ILogger;
import io.sentry.IScopes;
import io.sentry.Integration;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.core.internal.util.AndroidThreadChecker;
import io.sentry.util.IntegrationUtils;
import io.sentry.util.Objects;
import java.io.Closeable;

/* JADX INFO: loaded from: classes2.dex */
public final class AppLifecycleIntegration implements Integration, Closeable {
    private final MainLooperHandler handler;
    private SentryAndroidOptions options;
    volatile LifecycleWatcher watcher;

    public AppLifecycleIntegration() {
        this(new MainLooperHandler());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: addObserver, reason: merged with bridge method [inline-methods] */
    public void lambda$register$0(IScopes iScopes) {
        SentryAndroidOptions sentryAndroidOptions = this.options;
        if (sentryAndroidOptions == null) {
            return;
        }
        this.watcher = new LifecycleWatcher(iScopes, sentryAndroidOptions.getSessionTrackingIntervalMillis(), this.options.isEnableAutoSessionTracking(), this.options.isEnableAppLifecycleBreadcrumbs());
        try {
            ProcessLifecycleOwner.f9594z.f9600f.a(this.watcher);
            this.options.getLogger().log(SentryLevel.DEBUG, "AppLifecycleIntegration installed.", new Object[0]);
            IntegrationUtils.addIntegrationToSdkVersion("AppLifecycle");
        } catch (Throwable th) {
            this.watcher = null;
            this.options.getLogger().log(SentryLevel.ERROR, "AppLifecycleIntegration failed to get Lifecycle and could not be installed.", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: removeObserver, reason: merged with bridge method [inline-methods] */
    public void lambda$close$1() {
        LifecycleWatcher lifecycleWatcher = this.watcher;
        if (lifecycleWatcher != null) {
            ProcessLifecycleOwner.f9594z.f9600f.b(lifecycleWatcher);
            SentryAndroidOptions sentryAndroidOptions = this.options;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, "AppLifecycleIntegration removed.", new Object[0]);
            }
        }
        this.watcher = null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.watcher == null) {
            return;
        }
        if (AndroidThreadChecker.getInstance().isMainThread()) {
            lambda$close$1();
        } else {
            this.handler.post(new d(this, 3));
        }
    }

    @Override // io.sentry.Integration
    public void register(IScopes iScopes, SentryOptions sentryOptions) {
        Objects.requireNonNull(iScopes, "Scopes are required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) Objects.requireNonNull(sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null, "SentryAndroidOptions is required");
        this.options = sentryAndroidOptions;
        ILogger logger = sentryAndroidOptions.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.log(sentryLevel, "enableSessionTracking enabled: %s", Boolean.valueOf(this.options.isEnableAutoSessionTracking()));
        this.options.getLogger().log(sentryLevel, "enableAppLifecycleBreadcrumbs enabled: %s", Boolean.valueOf(this.options.isEnableAppLifecycleBreadcrumbs()));
        if (this.options.isEnableAutoSessionTracking() || this.options.isEnableAppLifecycleBreadcrumbs()) {
            try {
                ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.f9594z;
                if (AndroidThreadChecker.getInstance().isMainThread()) {
                    lambda$register$0(iScopes);
                } else {
                    this.handler.post(new b(1, this, iScopes));
                }
            } catch (ClassNotFoundException unused) {
                sentryOptions.getLogger().log(SentryLevel.WARNING, "androidx.lifecycle is not available, AppLifecycleIntegration won't be installed", new Object[0]);
            } catch (IllegalStateException e7) {
                sentryOptions.getLogger().log(SentryLevel.ERROR, "AppLifecycleIntegration could not be installed", e7);
            }
        }
    }

    public AppLifecycleIntegration(MainLooperHandler mainLooperHandler) {
        this.handler = mainLooperHandler;
    }
}
