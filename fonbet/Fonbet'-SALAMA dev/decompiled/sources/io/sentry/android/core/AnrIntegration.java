package io.sentry.android.core;

import android.content.Context;
import io.sentry.ILogger;
import io.sentry.IScopes;
import io.sentry.ISentryLifecycleToken;
import io.sentry.Integration;
import io.sentry.SentryEvent;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.exception.ExceptionMechanismException;
import io.sentry.hints.AbnormalExit;
import io.sentry.hints.TransactionEnd;
import io.sentry.protocol.Mechanism;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.HintUtils;
import io.sentry.util.IntegrationUtils;
import io.sentry.util.Objects;
import java.io.Closeable;
import w1.L;

/* loaded from: classes2.dex */
public final class AnrIntegration implements Integration, Closeable {
    private static ANRWatchDog anrWatchDog;
    protected static final AutoClosableReentrantLock watchDogLock = new AutoClosableReentrantLock();
    private final Context context;
    private SentryOptions options;
    private boolean isClosed = false;
    private final AutoClosableReentrantLock startLock = new AutoClosableReentrantLock();

    public static final class AnrHint implements AbnormalExit, TransactionEnd {
        private final boolean isBackgroundAnr;

        public AnrHint(boolean z4) {
            this.isBackgroundAnr = z4;
        }

        @Override // io.sentry.hints.AbnormalExit
        public boolean ignoreCurrentThread() {
            return true;
        }

        @Override // io.sentry.hints.AbnormalExit
        public String mechanism() {
            return this.isBackgroundAnr ? "anr_background" : "anr_foreground";
        }

        @Override // io.sentry.hints.AbnormalExit
        public Long timestamp() {
            return null;
        }
    }

    public AnrIntegration(Context context) {
        this.context = ContextUtils.getApplicationContext(context);
    }

    private Throwable buildAnrThrowable(boolean z4, SentryAndroidOptions sentryAndroidOptions, ApplicationNotResponding applicationNotResponding) {
        String str = "ANR for at least " + sentryAndroidOptions.getAnrTimeoutIntervalMillis() + " ms.";
        if (z4) {
            str = L.i("Background ", str);
        }
        ApplicationNotResponding applicationNotResponding2 = new ApplicationNotResponding(str, applicationNotResponding.getThread());
        Mechanism mechanism = new Mechanism();
        mechanism.setType("ANR");
        return new ExceptionMechanismException(mechanism, applicationNotResponding2, applicationNotResponding2.getThread(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$register$0(IScopes iScopes, SentryAndroidOptions sentryAndroidOptions) {
        ISentryLifecycleToken acquire = this.startLock.acquire();
        try {
            if (!this.isClosed) {
                startAnrWatchdog(iScopes, sentryAndroidOptions);
            }
            if (acquire != null) {
                acquire.close();
            }
        } catch (Throwable th) {
            if (acquire != null) {
                try {
                    acquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private void startAnrWatchdog(IScopes iScopes, SentryAndroidOptions sentryAndroidOptions) {
        ISentryLifecycleToken acquire = watchDogLock.acquire();
        try {
            if (anrWatchDog == null) {
                ILogger logger = sentryAndroidOptions.getLogger();
                SentryLevel sentryLevel = SentryLevel.DEBUG;
                logger.log(sentryLevel, "ANR timeout in milliseconds: %d", Long.valueOf(sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                ANRWatchDog aNRWatchDog = new ANRWatchDog(sentryAndroidOptions.getAnrTimeoutIntervalMillis(), sentryAndroidOptions.isAnrReportInDebug(), new e(this, iScopes, sentryAndroidOptions), sentryAndroidOptions.getLogger(), this.context);
                anrWatchDog = aNRWatchDog;
                aNRWatchDog.start();
                sentryAndroidOptions.getLogger().log(sentryLevel, "AnrIntegration installed.", new Object[0]);
            }
            if (acquire != null) {
                acquire.close();
            }
        } catch (Throwable th) {
            if (acquire != null) {
                try {
                    acquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ISentryLifecycleToken acquire = this.startLock.acquire();
        try {
            this.isClosed = true;
            if (acquire != null) {
                acquire.close();
            }
            acquire = watchDogLock.acquire();
            try {
                ANRWatchDog aNRWatchDog = anrWatchDog;
                if (aNRWatchDog != null) {
                    aNRWatchDog.interrupt();
                    anrWatchDog = null;
                    SentryOptions sentryOptions = this.options;
                    if (sentryOptions != null) {
                        sentryOptions.getLogger().log(SentryLevel.DEBUG, "AnrIntegration removed.", new Object[0]);
                    }
                }
                if (acquire != null) {
                    acquire.close();
                }
            } finally {
            }
        } finally {
        }
    }

    public ANRWatchDog getANRWatchDog() {
        return anrWatchDog;
    }

    @Override // io.sentry.Integration
    public final void register(IScopes iScopes, SentryOptions sentryOptions) {
        this.options = (SentryOptions) Objects.requireNonNull(sentryOptions, "SentryOptions is required");
        register(iScopes, (SentryAndroidOptions) sentryOptions);
    }

    /* renamed from: reportANR, reason: merged with bridge method [inline-methods] */
    public void lambda$startAnrWatchdog$1(IScopes iScopes, SentryAndroidOptions sentryAndroidOptions, ApplicationNotResponding applicationNotResponding) {
        sentryAndroidOptions.getLogger().log(SentryLevel.INFO, "ANR triggered with message: %s", applicationNotResponding.getMessage());
        boolean equals = Boolean.TRUE.equals(AppState.getInstance().isInBackground());
        SentryEvent sentryEvent = new SentryEvent(buildAnrThrowable(equals, sentryAndroidOptions, applicationNotResponding));
        sentryEvent.setLevel(SentryLevel.ERROR);
        iScopes.captureEvent(sentryEvent, HintUtils.createWithTypeCheckHint(new AnrHint(equals)));
    }

    private void register(IScopes iScopes, SentryAndroidOptions sentryAndroidOptions) {
        sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, "AnrIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isAnrEnabled()));
        if (sentryAndroidOptions.isAnrEnabled()) {
            IntegrationUtils.addIntegrationToSdkVersion("Anr");
            try {
                sentryAndroidOptions.getExecutorService().submit(new q(this, iScopes, sentryAndroidOptions));
            } catch (Throwable th) {
                sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, "Failed to start AnrIntegration on executor thread.", th);
            }
        }
    }
}
