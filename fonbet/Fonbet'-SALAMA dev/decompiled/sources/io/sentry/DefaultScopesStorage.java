package io.sentry;

/* loaded from: classes2.dex */
public final class DefaultScopesStorage implements IScopesStorage {
    private static final ThreadLocal<IScopes> currentScopes = new ThreadLocal<>();

    public static final class DefaultScopesLifecycleToken implements ISentryLifecycleToken {
        private final IScopes oldValue;

        public DefaultScopesLifecycleToken(IScopes iScopes) {
            this.oldValue = iScopes;
        }

        @Override // io.sentry.ISentryLifecycleToken, java.lang.AutoCloseable
        public void close() {
            DefaultScopesStorage.currentScopes.set(this.oldValue);
        }
    }

    @Override // io.sentry.IScopesStorage
    public void close() {
        currentScopes.remove();
    }

    @Override // io.sentry.IScopesStorage
    public IScopes get() {
        return currentScopes.get();
    }

    @Override // io.sentry.IScopesStorage
    public void init() {
    }

    @Override // io.sentry.IScopesStorage
    public ISentryLifecycleToken set(IScopes iScopes) {
        IScopes iScopes2 = get();
        currentScopes.set(iScopes);
        return new DefaultScopesLifecycleToken(iScopes2);
    }
}
