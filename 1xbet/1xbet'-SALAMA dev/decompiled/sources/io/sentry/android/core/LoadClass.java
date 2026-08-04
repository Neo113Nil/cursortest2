package io.sentry.android.core;

import io.sentry.ILogger;
import io.sentry.SentryOptions;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class LoadClass extends io.sentry.util.LoadClass {
    private final io.sentry.util.LoadClass delegate = new io.sentry.util.LoadClass();

    @Override // io.sentry.util.LoadClass
    public boolean isClassAvailable(String str, ILogger iLogger) {
        return this.delegate.isClassAvailable(str, iLogger);
    }

    @Override // io.sentry.util.LoadClass
    public Class<?> loadClass(String str, ILogger iLogger) {
        return this.delegate.loadClass(str, iLogger);
    }

    @Override // io.sentry.util.LoadClass
    public boolean isClassAvailable(String str, SentryOptions sentryOptions) {
        return this.delegate.isClassAvailable(str, sentryOptions);
    }
}
