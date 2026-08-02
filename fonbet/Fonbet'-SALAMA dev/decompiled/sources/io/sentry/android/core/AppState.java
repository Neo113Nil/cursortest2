package io.sentry.android.core;

import io.sentry.ISentryLifecycleToken;
import io.sentry.util.AutoClosableReentrantLock;

/* loaded from: classes2.dex */
public final class AppState {
    private static AppState instance = new AppState();
    private final AutoClosableReentrantLock lock = new AutoClosableReentrantLock();
    private Boolean inBackground = null;

    private AppState() {
    }

    public static AppState getInstance() {
        return instance;
    }

    public Boolean isInBackground() {
        return this.inBackground;
    }

    public void resetInstance() {
        instance = new AppState();
    }

    public void setInBackground(boolean z4) {
        ISentryLifecycleToken acquire = this.lock.acquire();
        try {
            this.inBackground = Boolean.valueOf(z4);
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
}
