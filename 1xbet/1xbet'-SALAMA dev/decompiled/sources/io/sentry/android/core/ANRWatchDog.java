package io.sentry.android.core;

import W5.AbstractC0486a1;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.transport.ICurrentDateProvider;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
final class ANRWatchDog extends Thread {
    private final ANRListener anrListener;
    private final Context context;
    private volatile long lastKnownActiveUiTimestampMs;
    private final ILogger logger;
    private long pollingIntervalMs;
    private final boolean reportInDebug;
    private final AtomicBoolean reported;
    private final Runnable ticker;
    private final ICurrentDateProvider timeProvider;
    private final long timeoutIntervalMillis;
    private final MainLooperHandler uiHandler;

    public interface ANRListener {
        void onAppNotResponding(ApplicationNotResponding applicationNotResponding);
    }

    public ANRWatchDog(long j, boolean z4, ANRListener aNRListener, ILogger iLogger, Context context) {
        this(new a(0), j, 500L, z4, aNRListener, iLogger, new MainLooperHandler(), context);
    }

    private boolean isProcessNotResponding() {
        List<ActivityManager.ProcessErrorStateInfo> processesInErrorState;
        ActivityManager activityManager = (ActivityManager) this.context.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        try {
            processesInErrorState = activityManager.getProcessesInErrorState();
        } catch (Throwable th) {
            this.logger.log(SentryLevel.ERROR, "Error getting ActivityManager#getProcessesInErrorState.", th);
            processesInErrorState = null;
        }
        if (processesInErrorState == null) {
            return false;
        }
        Iterator<ActivityManager.ProcessErrorStateInfo> it = processesInErrorState.iterator();
        while (it.hasNext()) {
            if (it.next().condition == 2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(ICurrentDateProvider iCurrentDateProvider) {
        this.lastKnownActiveUiTimestampMs = iCurrentDateProvider.getCurrentTimeMillis();
        this.reported.set(false);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        this.ticker.run();
        while (!isInterrupted()) {
            this.uiHandler.post(this.ticker);
            try {
                Thread.sleep(this.pollingIntervalMs);
                if (this.timeProvider.getCurrentTimeMillis() - this.lastKnownActiveUiTimestampMs > this.timeoutIntervalMillis) {
                    if (!this.reportInDebug && (Debug.isDebuggerConnected() || Debug.waitingForDebugger())) {
                        this.logger.log(SentryLevel.DEBUG, "An ANR was detected but ignored because the debugger is connected.", new Object[0]);
                        this.reported.set(true);
                    } else if (isProcessNotResponding() && this.reported.compareAndSet(false, true)) {
                        this.anrListener.onAppNotResponding(new ApplicationNotResponding(AbstractC0486a1.i(new StringBuilder("Application Not Responding for at least "), this.timeoutIntervalMillis, " ms."), this.uiHandler.getThread()));
                    }
                }
            } catch (InterruptedException e7) {
                try {
                    Thread.currentThread().interrupt();
                    this.logger.log(SentryLevel.WARNING, "Interrupted: %s", e7.getMessage());
                    return;
                } catch (SecurityException unused) {
                    this.logger.log(SentryLevel.WARNING, "Failed to interrupt due to SecurityException: %s", e7.getMessage());
                    return;
                }
            }
        }
    }

    public ANRWatchDog(ICurrentDateProvider iCurrentDateProvider, long j, long j3, boolean z4, ANRListener aNRListener, ILogger iLogger, MainLooperHandler mainLooperHandler, Context context) {
        super("|ANR-WatchDog|");
        this.lastKnownActiveUiTimestampMs = 0L;
        this.reported = new AtomicBoolean(false);
        this.timeProvider = iCurrentDateProvider;
        this.timeoutIntervalMillis = j;
        this.pollingIntervalMs = j3;
        this.reportInDebug = z4;
        this.anrListener = aNRListener;
        this.logger = iLogger;
        this.uiHandler = mainLooperHandler;
        this.context = context;
        this.ticker = new b(0, this, iCurrentDateProvider);
        if (j < j3 * 2) {
            throw new IllegalArgumentException(String.format("ANRWatchDog: timeoutIntervalMillis has to be at least %d ms", Long.valueOf(this.pollingIntervalMs * 2)));
        }
    }
}
