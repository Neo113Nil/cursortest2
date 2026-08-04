package io.sentry.util.thread;

import io.sentry.protocol.SentryThread;

/* JADX INFO: loaded from: classes2.dex */
public interface IThreadChecker {
    long currentThreadSystemId();

    String getCurrentThreadName();

    boolean isMainThread();

    boolean isMainThread(long j);

    boolean isMainThread(SentryThread sentryThread);

    boolean isMainThread(Thread thread);
}
