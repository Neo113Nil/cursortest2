package io.sentry.android.core;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import io.sentry.Breadcrumb;
import io.sentry.Hint;
import io.sentry.ILogger;
import io.sentry.IScopes;
import io.sentry.Integration;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.TypeCheckHint;
import io.sentry.android.core.internal.util.AndroidCurrentDateProvider;
import io.sentry.android.core.internal.util.Debouncer;
import io.sentry.android.core.internal.util.DeviceOrientations;
import io.sentry.protocol.Device;
import io.sentry.util.IntegrationUtils;
import io.sentry.util.Objects;
import java.io.Closeable;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class AppComponentsBreadcrumbsIntegration implements Integration, Closeable, ComponentCallbacks2 {
    private static final long DEBOUNCE_WAIT_TIME_MS = 60000;
    private static final Hint EMPTY_HINT = new Hint();
    private final Context context;
    private SentryAndroidOptions options;
    private IScopes scopes;
    private final Debouncer trimMemoryDebouncer = new Debouncer(AndroidCurrentDateProvider.getInstance(), DEBOUNCE_WAIT_TIME_MS, 0);

    public AppComponentsBreadcrumbsIntegration(Context context) {
        this.context = (Context) Objects.requireNonNull(ContextUtils.getApplicationContext(context), "Context is required");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: captureConfigurationChangedBreadcrumb, reason: merged with bridge method [inline-methods] */
    public void lambda$onConfigurationChanged$0(long j, Configuration configuration) {
        if (this.scopes != null) {
            Device.DeviceOrientation orientation = DeviceOrientations.getOrientation(this.context.getResources().getConfiguration().orientation);
            String lowerCase = orientation != null ? orientation.name().toLowerCase(Locale.ROOT) : "undefined";
            Breadcrumb breadcrumb = new Breadcrumb(j);
            breadcrumb.setType("navigation");
            breadcrumb.setCategory("device.orientation");
            breadcrumb.setData("position", lowerCase);
            breadcrumb.setLevel(SentryLevel.INFO);
            Hint hint = new Hint();
            hint.set(TypeCheckHint.ANDROID_CONFIGURATION, configuration);
            this.scopes.addBreadcrumb(breadcrumb, hint);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: captureLowMemoryBreadcrumb, reason: merged with bridge method [inline-methods] */
    public void lambda$onTrimMemory$1(long j, int i7) {
        if (this.scopes != null) {
            Breadcrumb breadcrumb = new Breadcrumb(j);
            breadcrumb.setType("system");
            breadcrumb.setCategory("device.event");
            breadcrumb.setMessage("Low memory");
            breadcrumb.setData("action", "LOW_MEMORY");
            breadcrumb.setData("level", Integer.valueOf(i7));
            breadcrumb.setLevel(SentryLevel.WARNING);
            this.scopes.addBreadcrumb(breadcrumb, EMPTY_HINT);
        }
    }

    private void executeInBackground(Runnable runnable) {
        SentryAndroidOptions sentryAndroidOptions = this.options;
        if (sentryAndroidOptions != null) {
            try {
                sentryAndroidOptions.getExecutorService().submit(runnable);
            } catch (Throwable th) {
                this.options.getLogger().log(SentryLevel.ERROR, th, "Failed to submit app components breadcrumb task", new Object[0]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.context.unregisterComponentCallbacks(this);
        } catch (Throwable th) {
            SentryAndroidOptions sentryAndroidOptions = this.options;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, th, "It was not possible to unregisterComponentCallbacks", new Object[0]);
            }
        }
        SentryAndroidOptions sentryAndroidOptions2 = this.options;
        if (sentryAndroidOptions2 != null) {
            sentryAndroidOptions2.getLogger().log(SentryLevel.DEBUG, "AppComponentsBreadcrumbsIntegration removed.", new Object[0]);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        executeInBackground(new m(this, System.currentTimeMillis(), configuration));
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(final int i7) {
        if (i7 >= 40 && !this.trimMemoryDebouncer.checkForDebounce()) {
            final long currentTimeMillis = System.currentTimeMillis();
            executeInBackground(new Runnable() { // from class: io.sentry.android.core.n
                @Override // java.lang.Runnable
                public final void run() {
                    AppComponentsBreadcrumbsIntegration.this.lambda$onTrimMemory$1(currentTimeMillis, i7);
                }
            });
        }
    }

    @Override // io.sentry.Integration
    public void register(IScopes iScopes, SentryOptions sentryOptions) {
        this.scopes = (IScopes) Objects.requireNonNull(iScopes, "Scopes are required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) Objects.requireNonNull(sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null, "SentryAndroidOptions is required");
        this.options = sentryAndroidOptions;
        ILogger logger = sentryAndroidOptions.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.log(sentryLevel, "AppComponentsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.options.isEnableAppComponentBreadcrumbs()));
        if (this.options.isEnableAppComponentBreadcrumbs()) {
            try {
                this.context.registerComponentCallbacks(this);
                sentryOptions.getLogger().log(sentryLevel, "AppComponentsBreadcrumbsIntegration installed.", new Object[0]);
                IntegrationUtils.addIntegrationToSdkVersion("AppComponentsBreadcrumbs");
            } catch (Throwable th) {
                this.options.setEnableAppComponentBreadcrumbs(false);
                sentryOptions.getLogger().log(SentryLevel.INFO, th, "ComponentCallbacks2 is not available.", new Object[0]);
            }
        }
    }
}
