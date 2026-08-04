package io.sentry;

import java.util.concurrent.Callable;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public final class SentryWrapper {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$wrapCallable$0(IScopes iScopes, Callable callable) {
        ISentryLifecycleToken iSentryLifecycleTokenMakeCurrent = iScopes.makeCurrent();
        try {
            Object objCall = callable.call();
            if (iSentryLifecycleTokenMakeCurrent != null) {
                iSentryLifecycleTokenMakeCurrent.close();
            }
            return objCall;
        } catch (Throwable th) {
            if (iSentryLifecycleTokenMakeCurrent != null) {
                try {
                    iSentryLifecycleTokenMakeCurrent.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$wrapRunnable$2(IScopes iScopes, Runnable runnable) {
        ISentryLifecycleToken iSentryLifecycleTokenMakeCurrent = iScopes.makeCurrent();
        try {
            runnable.run();
            if (iSentryLifecycleTokenMakeCurrent != null) {
                iSentryLifecycleTokenMakeCurrent.close();
            }
        } catch (Throwable th) {
            if (iSentryLifecycleTokenMakeCurrent != null) {
                try {
                    iSentryLifecycleTokenMakeCurrent.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$wrapSupplier$1(IScopes iScopes, Supplier supplier) {
        ISentryLifecycleToken iSentryLifecycleTokenMakeCurrent = iScopes.makeCurrent();
        try {
            Object obj = supplier.get();
            if (iSentryLifecycleTokenMakeCurrent != null) {
                iSentryLifecycleTokenMakeCurrent.close();
            }
            return obj;
        } catch (Throwable th) {
            if (iSentryLifecycleTokenMakeCurrent != null) {
                try {
                    iSentryLifecycleTokenMakeCurrent.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static <U> Callable<U> wrapCallable(Callable<U> callable) {
        return new p(6, Sentry.getCurrentScopes().forkedScopes("SentryWrapper.wrapCallable"), callable);
    }

    public static Runnable wrapRunnable(Runnable runnable) {
        return new a(2, Sentry.forkedScopes("SentryWrapper.wrapRunnable"), runnable);
    }

    public static <U> Supplier<U> wrapSupplier(final Supplier<U> supplier) {
        final IScopes iScopesForkedScopes = Sentry.forkedScopes("SentryWrapper.wrapSupplier");
        return new Supplier() { // from class: io.sentry.u
            @Override // java.util.function.Supplier
            public final Object get() {
                return SentryWrapper.lambda$wrapSupplier$1(iScopesForkedScopes, supplier);
            }
        };
    }
}
