package io.sentry;

/* JADX INFO: loaded from: classes2.dex */
public interface IScopesStorage {
    void close();

    IScopes get();

    void init();

    ISentryLifecycleToken set(IScopes iScopes);
}
