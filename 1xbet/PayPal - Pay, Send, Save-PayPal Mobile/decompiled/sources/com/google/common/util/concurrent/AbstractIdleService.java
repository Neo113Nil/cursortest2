package com.google.common.util.concurrent;

/* loaded from: classes9.dex */
public abstract class AbstractIdleService implements com.google.common.util.concurrent.Service {
    private final com.google.common.util.concurrent.Service delegate;
    private final com.google.common.base.Supplier<java.lang.String> threadNameSupplier;

    protected abstract void shutDown() throws java.lang.Exception;

    protected abstract void startUp() throws java.lang.Exception;

    final class ThreadNameSupplier implements com.google.common.base.Supplier<java.lang.String> {
        private ThreadNameSupplier() {
        }

        @Override // com.google.common.base.Supplier
        public final java.lang.String get() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(com.google.common.util.concurrent.AbstractIdleService.this.serviceName());
            sb.append(" ");
            sb.append(com.google.common.util.concurrent.AbstractIdleService.this.state());
            return sb.toString();
        }
    }

    final class DelegateService extends com.google.common.util.concurrent.AbstractService {
        private DelegateService() {
        }

        @Override // com.google.common.util.concurrent.AbstractService
        protected final void doStart() {
            com.google.common.util.concurrent.MoreExecutors.renamingDecorator(com.google.common.util.concurrent.AbstractIdleService.this.executor(), (com.google.common.base.Supplier<java.lang.String>) com.google.common.util.concurrent.AbstractIdleService.this.threadNameSupplier).execute(new java.lang.Runnable() { // from class: com.google.common.util.concurrent.AbstractIdleService$DelegateService$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.common.util.concurrent.AbstractIdleService.DelegateService.this.m10346x2ed323e8();
                }
            });
        }

        /* renamed from: lambda$doStart$0$com-google-common-util-concurrent-AbstractIdleService$DelegateService, reason: not valid java name */
        final /* synthetic */ void m10346x2ed323e8() {
            try {
                com.google.common.util.concurrent.AbstractIdleService.this.startUp();
                notifyStarted();
            } catch (java.lang.Throwable th) {
                com.google.common.util.concurrent.Platform.restoreInterruptIfIsInterruptedException(th);
                notifyFailed(th);
            }
        }

        @Override // com.google.common.util.concurrent.AbstractService
        protected final void doStop() {
            com.google.common.util.concurrent.MoreExecutors.renamingDecorator(com.google.common.util.concurrent.AbstractIdleService.this.executor(), (com.google.common.base.Supplier<java.lang.String>) com.google.common.util.concurrent.AbstractIdleService.this.threadNameSupplier).execute(new java.lang.Runnable() { // from class: com.google.common.util.concurrent.AbstractIdleService$DelegateService$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.common.util.concurrent.AbstractIdleService.DelegateService.this.m10347xce12afd8();
                }
            });
        }

        /* renamed from: lambda$doStop$0$com-google-common-util-concurrent-AbstractIdleService$DelegateService, reason: not valid java name */
        final /* synthetic */ void m10347xce12afd8() {
            try {
                com.google.common.util.concurrent.AbstractIdleService.this.shutDown();
                notifyStopped();
            } catch (java.lang.Throwable th) {
                com.google.common.util.concurrent.Platform.restoreInterruptIfIsInterruptedException(th);
                notifyFailed(th);
            }
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public final java.lang.String toString() {
            return com.google.common.util.concurrent.AbstractIdleService.this.toString();
        }
    }

    protected AbstractIdleService() {
        this.threadNameSupplier = new com.google.common.util.concurrent.AbstractIdleService.ThreadNameSupplier();
        this.delegate = new com.google.common.util.concurrent.AbstractIdleService.DelegateService();
    }

    protected java.util.concurrent.Executor executor() {
        return new java.util.concurrent.Executor() { // from class: com.google.common.util.concurrent.AbstractIdleService$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Executor
            public final void execute(java.lang.Runnable runnable) {
                com.google.common.util.concurrent.AbstractIdleService.this.m10345xc998c392(runnable);
            }
        };
    }

    /* renamed from: lambda$executor$0$com-google-common-util-concurrent-AbstractIdleService, reason: not valid java name */
    /* synthetic */ void m10345xc998c392(java.lang.Runnable runnable) {
        com.google.common.util.concurrent.MoreExecutors.newThread(this.threadNameSupplier.get(), runnable).start();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(serviceName());
        sb.append(" [");
        sb.append(state());
        sb.append("]");
        return sb.toString();
    }

    @Override // com.google.common.util.concurrent.Service
    public final boolean isRunning() {
        return this.delegate.isRunning();
    }

    @Override // com.google.common.util.concurrent.Service
    public final com.google.common.util.concurrent.Service.State state() {
        return this.delegate.state();
    }

    @Override // com.google.common.util.concurrent.Service
    public final void addListener(com.google.common.util.concurrent.Service.Listener listener, java.util.concurrent.Executor executor) {
        this.delegate.addListener(listener, executor);
    }

    @Override // com.google.common.util.concurrent.Service
    public final java.lang.Throwable failureCause() {
        return this.delegate.failureCause();
    }

    @Override // com.google.common.util.concurrent.Service
    public final com.google.common.util.concurrent.Service startAsync() {
        this.delegate.startAsync();
        return this;
    }

    @Override // com.google.common.util.concurrent.Service
    public final com.google.common.util.concurrent.Service stopAsync() {
        this.delegate.stopAsync();
        return this;
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning() {
        this.delegate.awaitRunning();
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning(long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.TimeoutException {
        this.delegate.awaitRunning(j, timeUnit);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated() {
        this.delegate.awaitTerminated();
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated(long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.TimeoutException {
        this.delegate.awaitTerminated(j, timeUnit);
    }

    protected java.lang.String serviceName() {
        return getClass().getSimpleName();
    }
}
