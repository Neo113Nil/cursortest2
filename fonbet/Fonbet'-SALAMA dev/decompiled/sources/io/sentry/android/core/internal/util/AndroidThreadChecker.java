package io.sentry.android.core.internal.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import io.sentry.protocol.SentryThread;
import io.sentry.util.thread.IThreadChecker;

/* loaded from: classes2.dex */
public final class AndroidThreadChecker implements IThreadChecker {
    private static final AndroidThreadChecker instance = new AndroidThreadChecker();
    public static volatile long mainThreadSystemId = Process.myTid();

    private AndroidThreadChecker() {
        new Handler(Looper.getMainLooper()).post(new a(0));
    }

    public static AndroidThreadChecker getInstance() {
        return instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$0() {
        mainThreadSystemId = Process.myTid();
    }

    @Override // io.sentry.util.thread.IThreadChecker
    public long currentThreadSystemId() {
        return Process.myTid();
    }

    @Override // io.sentry.util.thread.IThreadChecker
    public String getCurrentThreadName() {
        return isMainThread() ? SentryThread.JsonKeys.MAIN : Thread.currentThread().getName();
    }

    @Override // io.sentry.util.thread.IThreadChecker
    public boolean isMainThread(long j) {
        return Looper.getMainLooper().getThread().getId() == j;
    }

    @Override // io.sentry.util.thread.IThreadChecker
    public boolean isMainThread(Thread thread) {
        return isMainThread(thread.getId());
    }

    @Override // io.sentry.util.thread.IThreadChecker
    public boolean isMainThread() {
        return isMainThread(Thread.currentThread());
    }

    @Override // io.sentry.util.thread.IThreadChecker
    public boolean isMainThread(SentryThread sentryThread) {
        Long id = sentryThread.getId();
        return id != null && isMainThread(id.longValue());
    }
}
