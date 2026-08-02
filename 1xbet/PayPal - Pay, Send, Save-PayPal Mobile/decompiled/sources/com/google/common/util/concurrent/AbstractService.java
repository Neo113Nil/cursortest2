package com.google.common.util.concurrent;

/* loaded from: classes9.dex */
public abstract class AbstractService implements com.google.common.util.concurrent.Service {
    private static final com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener> STARTING_EVENT = new com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener>() { // from class: com.google.common.util.concurrent.AbstractService.1
        @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
        public void call(com.google.common.util.concurrent.Service.Listener listener) {
            listener.starting();
        }

        public java.lang.String toString() {
            return "starting()";
        }
    };
    private static final com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener> RUNNING_EVENT = new com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener>() { // from class: com.google.common.util.concurrent.AbstractService.2
        @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
        public void call(com.google.common.util.concurrent.Service.Listener listener) {
            listener.running();
        }

        public java.lang.String toString() {
            return "running()";
        }
    };
    private static final com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener> STOPPING_FROM_STARTING_EVENT = stoppingEvent(com.google.common.util.concurrent.Service.State.STARTING);
    private static final com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener> STOPPING_FROM_RUNNING_EVENT = stoppingEvent(com.google.common.util.concurrent.Service.State.RUNNING);
    private static final com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener> TERMINATED_FROM_NEW_EVENT = terminatedEvent(com.google.common.util.concurrent.Service.State.NEW);
    private static final com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener> TERMINATED_FROM_STARTING_EVENT = terminatedEvent(com.google.common.util.concurrent.Service.State.STARTING);
    private static final com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener> TERMINATED_FROM_RUNNING_EVENT = terminatedEvent(com.google.common.util.concurrent.Service.State.RUNNING);
    private static final com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener> TERMINATED_FROM_STOPPING_EVENT = terminatedEvent(com.google.common.util.concurrent.Service.State.STOPPING);
    private final com.google.common.util.concurrent.Monitor monitor = new com.google.common.util.concurrent.Monitor();
    private final com.google.common.util.concurrent.Monitor.Guard isStartable = new com.google.common.util.concurrent.AbstractService.IsStartableGuard();
    private final com.google.common.util.concurrent.Monitor.Guard isStoppable = new com.google.common.util.concurrent.AbstractService.IsStoppableGuard();
    private final com.google.common.util.concurrent.Monitor.Guard hasReachedRunning = new com.google.common.util.concurrent.AbstractService.HasReachedRunningGuard();
    private final com.google.common.util.concurrent.Monitor.Guard isStopped = new com.google.common.util.concurrent.AbstractService.IsStoppedGuard();
    private final com.google.common.util.concurrent.ListenerCallQueue<com.google.common.util.concurrent.Service.Listener> listeners = new com.google.common.util.concurrent.ListenerCallQueue<>();
    private volatile com.google.common.util.concurrent.AbstractService.StateSnapshot snapshot = new com.google.common.util.concurrent.AbstractService.StateSnapshot(com.google.common.util.concurrent.Service.State.NEW);

    protected void doCancelStart() {
    }

    protected abstract void doStart();

    protected abstract void doStop();

    private static com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener> terminatedEvent(final com.google.common.util.concurrent.Service.State state) {
        return new com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener>() { // from class: com.google.common.util.concurrent.AbstractService.3
            @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
            public void call(com.google.common.util.concurrent.Service.Listener listener) {
                listener.terminated(com.google.common.util.concurrent.Service.State.this);
            }

            public java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("terminated({from = ");
                sb.append(com.google.common.util.concurrent.Service.State.this);
                sb.append("})");
                return sb.toString();
            }
        };
    }

    private static com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener> stoppingEvent(final com.google.common.util.concurrent.Service.State state) {
        return new com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener>() { // from class: com.google.common.util.concurrent.AbstractService.4
            @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
            public void call(com.google.common.util.concurrent.Service.Listener listener) {
                listener.stopping(com.google.common.util.concurrent.Service.State.this);
            }

            public java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("stopping({from = ");
                sb.append(com.google.common.util.concurrent.Service.State.this);
                sb.append("})");
                return sb.toString();
            }
        };
    }

    final class IsStartableGuard extends com.google.common.util.concurrent.Monitor.Guard {
        IsStartableGuard() {
            super(com.google.common.util.concurrent.AbstractService.this.monitor);
        }

        @Override // com.google.common.util.concurrent.Monitor.Guard
        public final boolean isSatisfied() {
            return com.google.common.util.concurrent.AbstractService.this.state() == com.google.common.util.concurrent.Service.State.NEW;
        }
    }

    final class IsStoppableGuard extends com.google.common.util.concurrent.Monitor.Guard {
        IsStoppableGuard() {
            super(com.google.common.util.concurrent.AbstractService.this.monitor);
        }

        @Override // com.google.common.util.concurrent.Monitor.Guard
        public final boolean isSatisfied() {
            return com.google.common.util.concurrent.AbstractService.this.state().compareTo(com.google.common.util.concurrent.Service.State.RUNNING) <= 0;
        }
    }

    final class HasReachedRunningGuard extends com.google.common.util.concurrent.Monitor.Guard {
        HasReachedRunningGuard() {
            super(com.google.common.util.concurrent.AbstractService.this.monitor);
        }

        @Override // com.google.common.util.concurrent.Monitor.Guard
        public final boolean isSatisfied() {
            return com.google.common.util.concurrent.AbstractService.this.state().compareTo(com.google.common.util.concurrent.Service.State.RUNNING) >= 0;
        }
    }

    final class IsStoppedGuard extends com.google.common.util.concurrent.Monitor.Guard {
        IsStoppedGuard() {
            super(com.google.common.util.concurrent.AbstractService.this.monitor);
        }

        @Override // com.google.common.util.concurrent.Monitor.Guard
        public final boolean isSatisfied() {
            return com.google.common.util.concurrent.AbstractService.this.state().compareTo(com.google.common.util.concurrent.Service.State.TERMINATED) >= 0;
        }
    }

    protected AbstractService() {
    }

    @Override // com.google.common.util.concurrent.Service
    public final com.google.common.util.concurrent.Service startAsync() {
        if (this.monitor.enterIf(this.isStartable)) {
            try {
                this.snapshot = new com.google.common.util.concurrent.AbstractService.StateSnapshot(com.google.common.util.concurrent.Service.State.STARTING);
                enqueueStartingEvent();
                doStart();
            } finally {
                try {
                    return this;
                } finally {
                }
            }
            return this;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Service ");
        sb.append(this);
        sb.append(" has already been started");
        throw new java.lang.IllegalStateException(sb.toString());
    }

    @Override // com.google.common.util.concurrent.Service
    public final com.google.common.util.concurrent.Service stopAsync() {
        if (!this.monitor.enterIf(this.isStoppable)) {
            return this;
        }
        try {
            com.google.common.util.concurrent.Service.State state = state();
            switch (com.google.common.util.concurrent.AbstractService.AnonymousClass6.$SwitchMap$com$google$common$util$concurrent$Service$State[state.ordinal()]) {
                case 1:
                    this.snapshot = new com.google.common.util.concurrent.AbstractService.StateSnapshot(com.google.common.util.concurrent.Service.State.TERMINATED);
                    enqueueTerminatedEvent(com.google.common.util.concurrent.Service.State.NEW);
                    break;
                case 2:
                    this.snapshot = new com.google.common.util.concurrent.AbstractService.StateSnapshot(com.google.common.util.concurrent.Service.State.STARTING, true, null);
                    enqueueStoppingEvent(com.google.common.util.concurrent.Service.State.STARTING);
                    doCancelStart();
                    break;
                case 3:
                    this.snapshot = new com.google.common.util.concurrent.AbstractService.StateSnapshot(com.google.common.util.concurrent.Service.State.STOPPING);
                    enqueueStoppingEvent(com.google.common.util.concurrent.Service.State.RUNNING);
                    doStop();
                    break;
                case 4:
                case 5:
                case 6:
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("isStoppable is incorrectly implemented, saw: ");
                    sb.append(state);
                    throw new java.lang.AssertionError(sb.toString());
            }
        } finally {
            try {
                return this;
            } finally {
            }
        }
        return this;
    }

    /* renamed from: com.google.common.util.concurrent.AbstractService$6, reason: invalid class name */
    static /* synthetic */ class AnonymousClass6 {
        static final /* synthetic */ int[] $SwitchMap$com$google$common$util$concurrent$Service$State;

        static {
            int[] iArr = new int[com.google.common.util.concurrent.Service.State.values().length];
            $SwitchMap$com$google$common$util$concurrent$Service$State = iArr;
            try {
                iArr[com.google.common.util.concurrent.Service.State.NEW.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$common$util$concurrent$Service$State[com.google.common.util.concurrent.Service.State.STARTING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$common$util$concurrent$Service$State[com.google.common.util.concurrent.Service.State.RUNNING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$common$util$concurrent$Service$State[com.google.common.util.concurrent.Service.State.STOPPING.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$common$util$concurrent$Service$State[com.google.common.util.concurrent.Service.State.TERMINATED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$common$util$concurrent$Service$State[com.google.common.util.concurrent.Service.State.FAILED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning() {
        this.monitor.enterWhenUninterruptibly(this.hasReachedRunning);
        try {
            checkCurrentState(com.google.common.util.concurrent.Service.State.RUNNING);
        } finally {
            this.monitor.leave();
        }
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning(long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.TimeoutException {
        if (this.monitor.enterWhenUninterruptibly(this.hasReachedRunning, j, timeUnit)) {
            try {
                checkCurrentState(com.google.common.util.concurrent.Service.State.RUNNING);
            } finally {
                this.monitor.leave();
            }
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Timed out waiting for ");
            sb.append(this);
            sb.append(" to reach the RUNNING state.");
            throw new java.util.concurrent.TimeoutException(sb.toString());
        }
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated() {
        this.monitor.enterWhenUninterruptibly(this.isStopped);
        try {
            checkCurrentState(com.google.common.util.concurrent.Service.State.TERMINATED);
        } finally {
            this.monitor.leave();
        }
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated(long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.TimeoutException {
        if (this.monitor.enterWhenUninterruptibly(this.isStopped, j, timeUnit)) {
            try {
                checkCurrentState(com.google.common.util.concurrent.Service.State.TERMINATED);
            } finally {
                this.monitor.leave();
            }
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Timed out waiting for ");
            sb.append(this);
            sb.append(" to reach a terminal state. Current state: ");
            sb.append(state());
            throw new java.util.concurrent.TimeoutException(sb.toString());
        }
    }

    private void checkCurrentState(com.google.common.util.concurrent.Service.State state) {
        com.google.common.util.concurrent.Service.State state2 = state();
        if (state2 != state) {
            if (state2 == com.google.common.util.concurrent.Service.State.FAILED) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected the service ");
                sb.append(this);
                sb.append(" to be ");
                sb.append(state);
                sb.append(", but the service has FAILED");
                throw new java.lang.IllegalStateException(sb.toString(), failureCause());
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Expected the service ");
            sb2.append(this);
            sb2.append(" to be ");
            sb2.append(state);
            sb2.append(", but was ");
            sb2.append(state2);
            throw new java.lang.IllegalStateException(sb2.toString());
        }
    }

    protected final void notifyStarted() {
        this.monitor.enter();
        try {
            if (this.snapshot.state != com.google.common.util.concurrent.Service.State.STARTING) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot notifyStarted() when the service is ");
                sb.append(this.snapshot.state);
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException(sb.toString());
                notifyFailed(illegalStateException);
                throw illegalStateException;
            }
            if (this.snapshot.shutdownWhenStartupFinishes) {
                this.snapshot = new com.google.common.util.concurrent.AbstractService.StateSnapshot(com.google.common.util.concurrent.Service.State.STOPPING);
                doStop();
            } else {
                this.snapshot = new com.google.common.util.concurrent.AbstractService.StateSnapshot(com.google.common.util.concurrent.Service.State.RUNNING);
                enqueueRunningEvent();
            }
        } finally {
            this.monitor.leave();
            dispatchListenerEvents();
        }
    }

    protected final void notifyStopped() {
        this.monitor.enter();
        try {
            com.google.common.util.concurrent.Service.State state = state();
            switch (com.google.common.util.concurrent.AbstractService.AnonymousClass6.$SwitchMap$com$google$common$util$concurrent$Service$State[state.ordinal()]) {
                case 1:
                case 5:
                case 6:
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot notifyStopped() when the service is ");
                    sb.append(state);
                    throw new java.lang.IllegalStateException(sb.toString());
                case 2:
                case 3:
                case 4:
                    this.snapshot = new com.google.common.util.concurrent.AbstractService.StateSnapshot(com.google.common.util.concurrent.Service.State.TERMINATED);
                    enqueueTerminatedEvent(state);
                    break;
            }
        } finally {
            this.monitor.leave();
            dispatchListenerEvents();
        }
    }

    protected final void notifyFailed(java.lang.Throwable th) {
        com.google.common.base.Preconditions.checkNotNull(th);
        this.monitor.enter();
        try {
            com.google.common.util.concurrent.Service.State state = state();
            int i = com.google.common.util.concurrent.AbstractService.AnonymousClass6.$SwitchMap$com$google$common$util$concurrent$Service$State[state.ordinal()];
            if (i != 1) {
                if (i == 2 || i == 3 || i == 4) {
                    this.snapshot = new com.google.common.util.concurrent.AbstractService.StateSnapshot(com.google.common.util.concurrent.Service.State.FAILED, false, th);
                    enqueueFailedEvent(state, th);
                } else if (i != 5) {
                }
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed while in state:");
            sb.append(state);
            throw new java.lang.IllegalStateException(sb.toString(), th);
        } finally {
            this.monitor.leave();
            dispatchListenerEvents();
        }
    }

    @Override // com.google.common.util.concurrent.Service
    public final boolean isRunning() {
        return state() == com.google.common.util.concurrent.Service.State.RUNNING;
    }

    @Override // com.google.common.util.concurrent.Service
    public final com.google.common.util.concurrent.Service.State state() {
        return this.snapshot.externalState();
    }

    @Override // com.google.common.util.concurrent.Service
    public final java.lang.Throwable failureCause() {
        return this.snapshot.failureCause();
    }

    @Override // com.google.common.util.concurrent.Service
    public final void addListener(com.google.common.util.concurrent.Service.Listener listener, java.util.concurrent.Executor executor) {
        this.listeners.addListener(listener, executor);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(state());
        sb.append("]");
        return sb.toString();
    }

    private void dispatchListenerEvents() {
        if (this.monitor.isOccupiedByCurrentThread()) {
            return;
        }
        this.listeners.dispatch();
    }

    private void enqueueStartingEvent() {
        this.listeners.enqueue(STARTING_EVENT);
    }

    private void enqueueRunningEvent() {
        this.listeners.enqueue(RUNNING_EVENT);
    }

    private void enqueueStoppingEvent(com.google.common.util.concurrent.Service.State state) {
        if (state == com.google.common.util.concurrent.Service.State.STARTING) {
            this.listeners.enqueue(STOPPING_FROM_STARTING_EVENT);
        } else {
            if (state == com.google.common.util.concurrent.Service.State.RUNNING) {
                this.listeners.enqueue(STOPPING_FROM_RUNNING_EVENT);
                return;
            }
            throw new java.lang.AssertionError();
        }
    }

    private void enqueueTerminatedEvent(com.google.common.util.concurrent.Service.State state) {
        switch (com.google.common.util.concurrent.AbstractService.AnonymousClass6.$SwitchMap$com$google$common$util$concurrent$Service$State[state.ordinal()]) {
            case 1:
                this.listeners.enqueue(TERMINATED_FROM_NEW_EVENT);
                return;
            case 2:
                this.listeners.enqueue(TERMINATED_FROM_STARTING_EVENT);
                return;
            case 3:
                this.listeners.enqueue(TERMINATED_FROM_RUNNING_EVENT);
                return;
            case 4:
                this.listeners.enqueue(TERMINATED_FROM_STOPPING_EVENT);
                return;
            case 5:
            case 6:
                throw new java.lang.AssertionError();
            default:
                return;
        }
    }

    private void enqueueFailedEvent(final com.google.common.util.concurrent.Service.State state, final java.lang.Throwable th) {
        this.listeners.enqueue(new com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener>(this) { // from class: com.google.common.util.concurrent.AbstractService.5
            final /* synthetic */ com.google.common.util.concurrent.AbstractService this$0;

            {
                this.this$0 = this;
            }

            @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
            public void call(com.google.common.util.concurrent.Service.Listener listener) {
                listener.failed(state, th);
            }

            public java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("failed({from = ");
                sb.append(state);
                sb.append(", cause = ");
                sb.append(th);
                sb.append("})");
                return sb.toString();
            }
        });
    }

    static final class StateSnapshot {
        final java.lang.Throwable failure;
        final boolean shutdownWhenStartupFinishes;
        final com.google.common.util.concurrent.Service.State state;

        StateSnapshot(com.google.common.util.concurrent.Service.State state) {
            this(state, false, null);
        }

        StateSnapshot(com.google.common.util.concurrent.Service.State state, boolean z, java.lang.Throwable th) {
            com.google.common.base.Preconditions.checkArgument(!z || state == com.google.common.util.concurrent.Service.State.STARTING, "shutdownWhenStartupFinishes can only be set if state is STARTING. Got %s instead.", state);
            com.google.common.base.Preconditions.checkArgument((th != null) == (state == com.google.common.util.concurrent.Service.State.FAILED), "A failure cause should be set if and only if the state is failed.  Got %s and %s instead.", state, th);
            this.state = state;
            this.shutdownWhenStartupFinishes = z;
            this.failure = th;
        }

        final com.google.common.util.concurrent.Service.State externalState() {
            if (this.shutdownWhenStartupFinishes && this.state == com.google.common.util.concurrent.Service.State.STARTING) {
                return com.google.common.util.concurrent.Service.State.STOPPING;
            }
            return this.state;
        }

        final java.lang.Throwable failureCause() {
            com.google.common.base.Preconditions.checkState(this.state == com.google.common.util.concurrent.Service.State.FAILED, "failureCause() is only valid if the service has failed, service is %s", this.state);
            return (java.lang.Throwable) java.util.Objects.requireNonNull(this.failure);
        }
    }
}
