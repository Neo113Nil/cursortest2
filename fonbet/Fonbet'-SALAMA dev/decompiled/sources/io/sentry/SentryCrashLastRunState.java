package io.sentry;

import io.sentry.cache.EnvelopeCache;
import io.sentry.util.AutoClosableReentrantLock;
import java.io.File;

/* loaded from: classes2.dex */
public final class SentryCrashLastRunState {
    private static final SentryCrashLastRunState INSTANCE = new SentryCrashLastRunState();
    private Boolean crashedLastRun;
    private final AutoClosableReentrantLock crashedLastRunLock = new AutoClosableReentrantLock();
    private boolean readCrashedLastRun;

    private SentryCrashLastRunState() {
    }

    public static SentryCrashLastRunState getInstance() {
        return INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Boolean isCrashedLastRun(String str, boolean z4) {
        ISentryLifecycleToken acquire = this.crashedLastRunLock.acquire();
        try {
            if (this.readCrashedLastRun) {
                Boolean bool = this.crashedLastRun;
                if (acquire != null) {
                    acquire.close();
                }
                return bool;
            }
            if (str == null) {
                if (acquire == null) {
                    return null;
                }
                acquire.close();
                return null;
            }
            boolean z7 = true;
            this.readCrashedLastRun = true;
            File file = new File(str, EnvelopeCache.CRASH_MARKER_FILE);
            File file2 = new File(str, EnvelopeCache.NATIVE_CRASH_MARKER_FILE);
            if (!file.exists()) {
                if (file2.exists()) {
                    if (z4) {
                        file2.delete();
                    }
                    this.crashedLastRun = Boolean.valueOf(z7);
                    if (acquire != null) {
                        acquire.close();
                    }
                    return this.crashedLastRun;
                }
                z7 = false;
                this.crashedLastRun = Boolean.valueOf(z7);
                if (acquire != null) {
                }
                return this.crashedLastRun;
            }
            file.delete();
            this.crashedLastRun = Boolean.valueOf(z7);
            if (acquire != null) {
            }
            return this.crashedLastRun;
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

    public void reset() {
        ISentryLifecycleToken acquire = this.crashedLastRunLock.acquire();
        try {
            this.readCrashedLastRun = false;
            this.crashedLastRun = null;
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

    public void setCrashedLastRun(boolean z4) {
        ISentryLifecycleToken acquire = this.crashedLastRunLock.acquire();
        try {
            if (!this.readCrashedLastRun) {
                this.crashedLastRun = Boolean.valueOf(z4);
                this.readCrashedLastRun = true;
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
}
