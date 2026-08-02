package io.sentry.android.core;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC0745t;
import io.sentry.Breadcrumb;
import io.sentry.IScope;
import io.sentry.IScopes;
import io.sentry.ISentryLifecycleToken;
import io.sentry.SentryLevel;
import io.sentry.Session;
import io.sentry.protocol.SentryThread;
import io.sentry.transport.CurrentDateProvider;
import io.sentry.transport.ICurrentDateProvider;
import io.sentry.util.AutoClosableReentrantLock;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
final class LifecycleWatcher implements DefaultLifecycleObserver {
    private final ICurrentDateProvider currentDateProvider;
    private final boolean enableAppLifecycleBreadcrumbs;
    private final boolean enableSessionTracking;
    private final AtomicLong lastUpdatedSession;
    private final IScopes scopes;
    private final long sessionIntervalMillis;
    private final Timer timer;
    private final AutoClosableReentrantLock timerLock;
    private TimerTask timerTask;

    public LifecycleWatcher(IScopes iScopes, long j, boolean z4, boolean z7) {
        this(iScopes, j, z4, z7, CurrentDateProvider.getInstance());
    }

    private void addAppBreadcrumb(String str) {
        if (this.enableAppLifecycleBreadcrumbs) {
            Breadcrumb breadcrumb = new Breadcrumb();
            breadcrumb.setType("navigation");
            breadcrumb.setData(SentryThread.JsonKeys.STATE, str);
            breadcrumb.setCategory("app.lifecycle");
            breadcrumb.setLevel(SentryLevel.INFO);
            this.scopes.addBreadcrumb(breadcrumb);
        }
    }

    private void cancelTask() {
        ISentryLifecycleToken acquire = this.timerLock.acquire();
        try {
            TimerTask timerTask = this.timerTask;
            if (timerTask != null) {
                timerTask.cancel();
                this.timerTask = null;
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

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startSession$0(IScope iScope) {
        Session session;
        if (this.lastUpdatedSession.get() != 0 || (session = iScope.getSession()) == null || session.getStarted() == null) {
            return;
        }
        this.lastUpdatedSession.set(session.getStarted().getTime());
    }

    private void scheduleEndSession() {
        ISentryLifecycleToken acquire = this.timerLock.acquire();
        try {
            cancelTask();
            if (this.timer != null) {
                TimerTask timerTask = new TimerTask() { // from class: io.sentry.android.core.LifecycleWatcher.1
                    @Override // java.util.TimerTask, java.lang.Runnable
                    public void run() {
                        if (LifecycleWatcher.this.enableSessionTracking) {
                            LifecycleWatcher.this.scopes.endSession();
                        }
                        LifecycleWatcher.this.scopes.getOptions().getReplayController().stop();
                        LifecycleWatcher.this.scopes.getOptions().getContinuousProfiler().close(false);
                    }
                };
                this.timerTask = timerTask;
                this.timer.schedule(timerTask, this.sessionIntervalMillis);
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

    private void startSession() {
        cancelTask();
        long currentTimeMillis = this.currentDateProvider.getCurrentTimeMillis();
        this.scopes.configureScope(new i(this, 1));
        long j = this.lastUpdatedSession.get();
        if (j == 0 || j + this.sessionIntervalMillis <= currentTimeMillis) {
            if (this.enableSessionTracking) {
                this.scopes.startSession();
            }
            this.scopes.getOptions().getReplayController().start();
        }
        this.scopes.getOptions().getReplayController().resume();
        this.lastUpdatedSession.set(currentTimeMillis);
    }

    public Timer getTimer() {
        return this.timer;
    }

    public TimerTask getTimerTask() {
        return this.timerTask;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(InterfaceC0745t interfaceC0745t) {
        startSession();
        addAppBreadcrumb("foreground");
        AppState.getInstance().setInBackground(false);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(InterfaceC0745t interfaceC0745t) {
        this.lastUpdatedSession.set(this.currentDateProvider.getCurrentTimeMillis());
        this.scopes.getOptions().getReplayController().pause();
        scheduleEndSession();
        AppState.getInstance().setInBackground(true);
        addAppBreadcrumb("background");
    }

    public LifecycleWatcher(IScopes iScopes, long j, boolean z4, boolean z7, ICurrentDateProvider iCurrentDateProvider) {
        this.lastUpdatedSession = new AtomicLong(0L);
        this.timer = new Timer(true);
        this.timerLock = new AutoClosableReentrantLock();
        this.sessionIntervalMillis = j;
        this.enableSessionTracking = z4;
        this.enableAppLifecycleBreadcrumbs = z7;
        this.scopes = iScopes;
        this.currentDateProvider = iCurrentDateProvider;
    }
}
