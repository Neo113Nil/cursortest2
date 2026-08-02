package io.sentry.android.core;

import androidx.lifecycle.ProcessLifecycleOwner;
import io.sentry.IScopes;
import io.sentry.Integration;
import io.sentry.SentryLevel;
import io.sentry.android.core.internal.util.AndroidThreadChecker;
import io.sentry.util.IntegrationUtils;
import java.io.Closeable;

/* loaded from: classes2.dex */
public final class AppLifecycleIntegration implements Integration, Closeable {
    private final MainLooperHandler handler;
    private SentryAndroidOptions options;
    volatile LifecycleWatcher watcher;

    public AppLifecycleIntegration() {
        this(new MainLooperHandler());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: addObserver, reason: merged with bridge method [inline-methods] */
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
    /* renamed from: removeObserver, reason: merged with bridge method [inline-methods] */
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

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:18:0x0084
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [io.sentry.ILogger] */
    /* JADX WARN: Type inference failed for: r5v3, types: [io.sentry.ILogger] */
    /* JADX WARN: Type inference failed for: r6v0, types: [io.sentry.SentryOptions] */
    /* JADX WARN: Type inference failed for: r6v1, types: [io.sentry.SentryLevel] */
    /* JADX WARN: Type inference failed for: r6v2, types: [io.sentry.SentryOptions] */
    /* JADX WARN: Type inference failed for: r6v3, types: [io.sentry.ILogger] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [io.sentry.SentryOptions] */
    /* JADX WARN: Type inference failed for: r6v6, types: [io.sentry.SentryLevel] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0078 -> B:14:0x0092). Please report as a decompilation issue!!! */
    @Override // io.sentry.Integration
    public void register(io.sentry.IScopes r5, io.sentry.SentryOptions r6) {
        /*
            r4 = this;
            java.lang.String r0 = "Scopes are required"
            io.sentry.util.Objects.requireNonNull(r5, r0)
            boolean r0 = r6 instanceof io.sentry.android.core.SentryAndroidOptions
            if (r0 == 0) goto Ld
            r0 = r6
            io.sentry.android.core.SentryAndroidOptions r0 = (io.sentry.android.core.SentryAndroidOptions) r0
            goto Le
        Ld:
            r0 = 0
        Le:
            java.lang.String r1 = "SentryAndroidOptions is required"
            java.lang.Object r0 = io.sentry.util.Objects.requireNonNull(r0, r1)
            io.sentry.android.core.SentryAndroidOptions r0 = (io.sentry.android.core.SentryAndroidOptions) r0
            r4.options = r0
            io.sentry.ILogger r0 = r0.getLogger()
            io.sentry.SentryLevel r1 = io.sentry.SentryLevel.DEBUG
            io.sentry.android.core.SentryAndroidOptions r2 = r4.options
            boolean r2 = r2.isEnableAutoSessionTracking()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r3 = "enableSessionTracking enabled: %s"
            r0.log(r1, r3, r2)
            io.sentry.android.core.SentryAndroidOptions r0 = r4.options
            io.sentry.ILogger r0 = r0.getLogger()
            io.sentry.android.core.SentryAndroidOptions r2 = r4.options
            boolean r2 = r2.isEnableAppLifecycleBreadcrumbs()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r3 = "enableAppLifecycleBreadcrumbs enabled: %s"
            r0.log(r1, r3, r2)
            io.sentry.android.core.SentryAndroidOptions r0 = r4.options
            boolean r0 = r0.isEnableAutoSessionTracking()
            if (r0 != 0) goto L5a
            io.sentry.android.core.SentryAndroidOptions r0 = r4.options
            boolean r0 = r0.isEnableAppLifecycleBreadcrumbs()
            if (r0 == 0) goto L92
        L5a:
            androidx.lifecycle.ProcessLifecycleOwner r0 = androidx.lifecycle.ProcessLifecycleOwner.f9594z     // Catch: java.lang.IllegalStateException -> L6a java.lang.ClassNotFoundException -> L84
            io.sentry.android.core.internal.util.AndroidThreadChecker r0 = io.sentry.android.core.internal.util.AndroidThreadChecker.getInstance()     // Catch: java.lang.IllegalStateException -> L6a java.lang.ClassNotFoundException -> L84
            boolean r0 = r0.isMainThread()     // Catch: java.lang.IllegalStateException -> L6a java.lang.ClassNotFoundException -> L84
            if (r0 == 0) goto L6c
            r4.lambda$register$0(r5)     // Catch: java.lang.IllegalStateException -> L6a java.lang.ClassNotFoundException -> L84
            goto L92
        L6a:
            r5 = move-exception
            goto L78
        L6c:
            io.sentry.android.core.MainLooperHandler r0 = r4.handler     // Catch: java.lang.IllegalStateException -> L6a java.lang.ClassNotFoundException -> L84
            io.sentry.android.core.b r1 = new io.sentry.android.core.b     // Catch: java.lang.IllegalStateException -> L6a java.lang.ClassNotFoundException -> L84
            r2 = 1
            r1.<init>(r2, r4, r5)     // Catch: java.lang.IllegalStateException -> L6a java.lang.ClassNotFoundException -> L84
            r0.post(r1)     // Catch: java.lang.IllegalStateException -> L6a java.lang.ClassNotFoundException -> L84
            goto L92
        L78:
            io.sentry.ILogger r6 = r6.getLogger()
            io.sentry.SentryLevel r0 = io.sentry.SentryLevel.ERROR
            java.lang.String r1 = "AppLifecycleIntegration could not be installed"
            r6.log(r0, r1, r5)
            goto L92
        L84:
            io.sentry.ILogger r5 = r6.getLogger()
            io.sentry.SentryLevel r6 = io.sentry.SentryLevel.WARNING
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "androidx.lifecycle is not available, AppLifecycleIntegration won't be installed"
            r5.log(r6, r1, r0)
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.AppLifecycleIntegration.register(io.sentry.IScopes, io.sentry.SentryOptions):void");
    }

    public AppLifecycleIntegration(MainLooperHandler mainLooperHandler) {
        this.handler = mainLooperHandler;
    }
}
