package com.google.common.util.concurrent;

/* loaded from: classes9.dex */
public final class ServiceManager implements com.google.common.util.concurrent.ServiceManagerBridge {
    private final com.google.common.collect.ImmutableList<com.google.common.util.concurrent.Service> services;
    private final com.google.common.util.concurrent.ServiceManager.ServiceManagerState state;
    private static final com.google.common.util.concurrent.LazyLogger logger = new com.google.common.util.concurrent.LazyLogger(com.google.common.util.concurrent.ServiceManager.class);
    private static final com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.ServiceManager.Listener> HEALTHY_EVENT = new com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.ServiceManager.Listener>() { // from class: com.google.common.util.concurrent.ServiceManager.1
        @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
        public void call(com.google.common.util.concurrent.ServiceManager.Listener listener) {
            listener.healthy();
        }

        public java.lang.String toString() {
            return "healthy()";
        }
    };
    private static final com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.ServiceManager.Listener> STOPPED_EVENT = new com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.ServiceManager.Listener>() { // from class: com.google.common.util.concurrent.ServiceManager.2
        @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
        public void call(com.google.common.util.concurrent.ServiceManager.Listener listener) {
            listener.stopped();
        }

        public java.lang.String toString() {
            return "stopped()";
        }
    };

    public static abstract class Listener {
        public void failure(com.google.common.util.concurrent.Service service) {
        }

        public void healthy() {
        }

        public void stopped() {
        }
    }

    public ServiceManager(java.lang.Iterable<? extends com.google.common.util.concurrent.Service> iterable) {
        com.google.common.collect.ImmutableList<com.google.common.util.concurrent.Service> copyOf = com.google.common.collect.ImmutableList.copyOf(iterable);
        if (copyOf.isEmpty()) {
            logger.get().log(java.util.logging.Level.WARNING, "ServiceManager configured with no services.  Is your application configured properly?", (java.lang.Throwable) new com.google.common.util.concurrent.ServiceManager.EmptyServiceManagerWarning());
            copyOf = com.google.common.collect.ImmutableList.of(new com.google.common.util.concurrent.ServiceManager.NoOpService());
        }
        com.google.common.util.concurrent.ServiceManager.ServiceManagerState serviceManagerState = new com.google.common.util.concurrent.ServiceManager.ServiceManagerState(copyOf);
        this.state = serviceManagerState;
        this.services = copyOf;
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(serviceManagerState);
        com.google.common.collect.UnmodifiableIterator<com.google.common.util.concurrent.Service> it = copyOf.iterator();
        while (it.hasNext()) {
            com.google.common.util.concurrent.Service next = it.next();
            next.addListener(new com.google.common.util.concurrent.ServiceManager.ServiceListener(next, weakReference), com.google.common.util.concurrent.MoreExecutors.directExecutor());
            com.google.common.base.Preconditions.checkArgument(next.state() == com.google.common.util.concurrent.Service.State.NEW, "Can only manage NEW services, %s", next);
        }
        this.state.markReady();
    }

    public final void addListener(com.google.common.util.concurrent.ServiceManager.Listener listener, java.util.concurrent.Executor executor) {
        this.state.addListener(listener, executor);
    }

    public final com.google.common.util.concurrent.ServiceManager startAsync() {
        com.google.common.collect.UnmodifiableIterator<com.google.common.util.concurrent.Service> it = this.services.iterator();
        while (it.hasNext()) {
            com.google.common.base.Preconditions.checkState(it.next().state() == com.google.common.util.concurrent.Service.State.NEW, "Not all services are NEW, cannot start %s", this);
        }
        com.google.common.collect.UnmodifiableIterator<com.google.common.util.concurrent.Service> it2 = this.services.iterator();
        while (it2.hasNext()) {
            com.google.common.util.concurrent.Service next = it2.next();
            try {
                this.state.tryStartTiming(next);
                next.startAsync();
            } catch (java.lang.IllegalStateException e) {
                logger.get().log(java.util.logging.Level.WARNING, "Unable to start Service ".concat(java.lang.String.valueOf(next)), (java.lang.Throwable) e);
            }
        }
        return this;
    }

    public final void awaitHealthy() {
        this.state.awaitHealthy();
    }

    public final void awaitHealthy(java.time.Duration duration) throws java.util.concurrent.TimeoutException {
        awaitHealthy(com.google.common.util.concurrent.Internal.toNanosSaturated(duration), java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public final void awaitHealthy(long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.TimeoutException {
        this.state.awaitHealthy(j, timeUnit);
    }

    public final com.google.common.util.concurrent.ServiceManager stopAsync() {
        com.google.common.collect.UnmodifiableIterator<com.google.common.util.concurrent.Service> it = this.services.iterator();
        while (it.hasNext()) {
            it.next().stopAsync();
        }
        return this;
    }

    public final void awaitStopped() {
        this.state.awaitStopped();
    }

    public final void awaitStopped(java.time.Duration duration) throws java.util.concurrent.TimeoutException {
        awaitStopped(com.google.common.util.concurrent.Internal.toNanosSaturated(duration), java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public final void awaitStopped(long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.TimeoutException {
        this.state.awaitStopped(j, timeUnit);
    }

    public final boolean isHealthy() {
        com.google.common.collect.UnmodifiableIterator<com.google.common.util.concurrent.Service> it = this.services.iterator();
        while (it.hasNext()) {
            if (!it.next().isRunning()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.common.util.concurrent.ServiceManagerBridge
    public final com.google.common.collect.ImmutableSetMultimap<com.google.common.util.concurrent.Service.State, com.google.common.util.concurrent.Service> servicesByState() {
        return this.state.servicesByState();
    }

    public final com.google.common.collect.ImmutableMap<com.google.common.util.concurrent.Service, java.lang.Long> startupTimes() {
        return this.state.startupTimes();
    }

    public final com.google.common.collect.ImmutableMap<com.google.common.util.concurrent.Service, java.time.Duration> startupDurations() {
        return com.google.common.collect.ImmutableMap.copyOf(com.google.common.collect.Maps.transformValues(startupTimes(), new com.google.common.base.Function() { // from class: com.google.common.util.concurrent.ServiceManager$$ExternalSyntheticLambda0
            @Override // com.google.common.base.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.time.Duration ofMillis;
                ofMillis = java.time.Duration.ofMillis(((java.lang.Long) obj).longValue());
                return ofMillis;
            }
        }));
    }

    public final java.lang.String toString() {
        return com.google.common.base.MoreObjects.toStringHelper((java.lang.Class<?>) com.google.common.util.concurrent.ServiceManager.class).add(com.paypal.oslo.feature.businessinventory.analytics.UiContextValues.ModuleName.Services, com.google.common.collect.Collections2.filter(this.services, com.google.common.base.Predicates.not(com.google.common.base.Predicates.instanceOf(com.google.common.util.concurrent.ServiceManager.NoOpService.class)))).toString();
    }

    static final class ServiceManagerState {
        final com.google.common.util.concurrent.Monitor.Guard awaitHealthGuard;
        final com.google.common.util.concurrent.ListenerCallQueue<com.google.common.util.concurrent.ServiceManager.Listener> listeners;
        final com.google.common.util.concurrent.Monitor monitor = new com.google.common.util.concurrent.Monitor();
        final int numberOfServices;
        boolean ready;
        final com.google.common.collect.SetMultimap<com.google.common.util.concurrent.Service.State, com.google.common.util.concurrent.Service> servicesByState;
        final java.util.IdentityHashMap<com.google.common.util.concurrent.Service, com.google.common.base.Stopwatch> startupTimers;
        final com.google.common.collect.Multiset<com.google.common.util.concurrent.Service.State> states;
        final com.google.common.util.concurrent.Monitor.Guard stoppedGuard;
        boolean transitioned;

        final class AwaitHealthGuard extends com.google.common.util.concurrent.Monitor.Guard {
            AwaitHealthGuard() {
                super(com.google.common.util.concurrent.ServiceManager.ServiceManagerState.this.monitor);
            }

            @Override // com.google.common.util.concurrent.Monitor.Guard
            public final boolean isSatisfied() {
                return com.google.common.util.concurrent.ServiceManager.ServiceManagerState.this.states.count(com.google.common.util.concurrent.Service.State.RUNNING) == com.google.common.util.concurrent.ServiceManager.ServiceManagerState.this.numberOfServices || com.google.common.util.concurrent.ServiceManager.ServiceManagerState.this.states.contains(com.google.common.util.concurrent.Service.State.STOPPING) || com.google.common.util.concurrent.ServiceManager.ServiceManagerState.this.states.contains(com.google.common.util.concurrent.Service.State.TERMINATED) || com.google.common.util.concurrent.ServiceManager.ServiceManagerState.this.states.contains(com.google.common.util.concurrent.Service.State.FAILED);
            }
        }

        final class StoppedGuard extends com.google.common.util.concurrent.Monitor.Guard {
            StoppedGuard() {
                super(com.google.common.util.concurrent.ServiceManager.ServiceManagerState.this.monitor);
            }

            @Override // com.google.common.util.concurrent.Monitor.Guard
            public final boolean isSatisfied() {
                return com.google.common.util.concurrent.ServiceManager.ServiceManagerState.this.states.count(com.google.common.util.concurrent.Service.State.TERMINATED) + com.google.common.util.concurrent.ServiceManager.ServiceManagerState.this.states.count(com.google.common.util.concurrent.Service.State.FAILED) == com.google.common.util.concurrent.ServiceManager.ServiceManagerState.this.numberOfServices;
            }
        }

        ServiceManagerState(com.google.common.collect.ImmutableCollection<com.google.common.util.concurrent.Service> immutableCollection) {
            com.google.common.collect.SetMultimap<com.google.common.util.concurrent.Service.State, com.google.common.util.concurrent.Service> build = com.google.common.collect.MultimapBuilder.enumKeys(com.google.common.util.concurrent.Service.State.class).linkedHashSetValues().build();
            this.servicesByState = build;
            this.states = build.keys();
            this.startupTimers = new java.util.IdentityHashMap<>();
            this.awaitHealthGuard = new com.google.common.util.concurrent.ServiceManager.ServiceManagerState.AwaitHealthGuard();
            this.stoppedGuard = new com.google.common.util.concurrent.ServiceManager.ServiceManagerState.StoppedGuard();
            this.listeners = new com.google.common.util.concurrent.ListenerCallQueue<>();
            this.numberOfServices = immutableCollection.size();
            build.putAll(com.google.common.util.concurrent.Service.State.NEW, immutableCollection);
        }

        final void tryStartTiming(com.google.common.util.concurrent.Service service) {
            this.monitor.enter();
            try {
                if (this.startupTimers.get(service) == null) {
                    this.startupTimers.put(service, com.google.common.base.Stopwatch.createStarted());
                }
            } finally {
                this.monitor.leave();
            }
        }

        final void markReady() {
            this.monitor.enter();
            try {
                if (!this.transitioned) {
                    this.ready = true;
                    return;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                com.google.common.collect.UnmodifiableIterator<com.google.common.util.concurrent.Service> it = servicesByState().values().iterator();
                while (it.hasNext()) {
                    com.google.common.util.concurrent.Service next = it.next();
                    if (next.state() != com.google.common.util.concurrent.Service.State.NEW) {
                        arrayList.add(next);
                    }
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append("Services started transitioning asynchronously before the ServiceManager was constructed: ");
                sb.append(arrayList);
                throw new java.lang.IllegalArgumentException(sb.toString());
            } finally {
                this.monitor.leave();
            }
        }

        final void addListener(com.google.common.util.concurrent.ServiceManager.Listener listener, java.util.concurrent.Executor executor) {
            this.listeners.addListener(listener, executor);
        }

        final void awaitHealthy() {
            this.monitor.enterWhenUninterruptibly(this.awaitHealthGuard);
            try {
                checkHealthy();
            } finally {
                this.monitor.leave();
            }
        }

        final void awaitHealthy(long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.TimeoutException {
            this.monitor.enter();
            try {
                if (!this.monitor.waitForUninterruptibly(this.awaitHealthGuard, j, timeUnit)) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Timeout waiting for the services to become healthy. The following services have not started: ");
                    sb.append(com.google.common.collect.Multimaps.filterKeys((com.google.common.collect.SetMultimap) this.servicesByState, com.google.common.base.Predicates.in(com.google.common.collect.ImmutableSet.of(com.google.common.util.concurrent.Service.State.NEW, com.google.common.util.concurrent.Service.State.STARTING))));
                    throw new java.util.concurrent.TimeoutException(sb.toString());
                }
                checkHealthy();
            } finally {
                this.monitor.leave();
            }
        }

        final void awaitStopped() {
            this.monitor.enterWhenUninterruptibly(this.stoppedGuard);
            this.monitor.leave();
        }

        final void awaitStopped(long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.TimeoutException {
            this.monitor.enter();
            try {
                if (this.monitor.waitForUninterruptibly(this.stoppedGuard, j, timeUnit)) {
                    return;
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Timeout waiting for the services to stop. The following services have not stopped: ");
                sb.append(com.google.common.collect.Multimaps.filterKeys((com.google.common.collect.SetMultimap) this.servicesByState, com.google.common.base.Predicates.not(com.google.common.base.Predicates.in(java.util.EnumSet.of(com.google.common.util.concurrent.Service.State.TERMINATED, com.google.common.util.concurrent.Service.State.FAILED)))));
                throw new java.util.concurrent.TimeoutException(sb.toString());
            } finally {
                this.monitor.leave();
            }
        }

        final com.google.common.collect.ImmutableSetMultimap<com.google.common.util.concurrent.Service.State, com.google.common.util.concurrent.Service> servicesByState() {
            com.google.common.collect.ImmutableSetMultimap.Builder builder = com.google.common.collect.ImmutableSetMultimap.builder();
            this.monitor.enter();
            try {
                for (java.util.Map.Entry<com.google.common.util.concurrent.Service.State, com.google.common.util.concurrent.Service> entry : this.servicesByState.entries()) {
                    if (!(entry.getValue() instanceof com.google.common.util.concurrent.ServiceManager.NoOpService)) {
                        builder.put((java.util.Map.Entry) entry);
                    }
                }
                this.monitor.leave();
                return builder.build();
            } catch (java.lang.Throwable th) {
                this.monitor.leave();
                throw th;
            }
        }

        final com.google.common.collect.ImmutableMap<com.google.common.util.concurrent.Service, java.lang.Long> startupTimes() {
            this.monitor.enter();
            try {
                java.util.ArrayList newArrayListWithCapacity = com.google.common.collect.Lists.newArrayListWithCapacity(this.startupTimers.size());
                for (java.util.Map.Entry<com.google.common.util.concurrent.Service, com.google.common.base.Stopwatch> entry : this.startupTimers.entrySet()) {
                    com.google.common.util.concurrent.Service key = entry.getKey();
                    com.google.common.base.Stopwatch value = entry.getValue();
                    if (!value.isRunning() && !(key instanceof com.google.common.util.concurrent.ServiceManager.NoOpService)) {
                        newArrayListWithCapacity.add(com.google.common.collect.Maps.immutableEntry(key, java.lang.Long.valueOf(value.elapsed(java.util.concurrent.TimeUnit.MILLISECONDS))));
                    }
                }
                this.monitor.leave();
                java.util.Collections.sort(newArrayListWithCapacity, com.google.common.collect.Ordering.natural().onResultOf(new com.google.common.base.Function() { // from class: com.google.common.util.concurrent.ServiceManager$ServiceManagerState$$ExternalSyntheticLambda0
                    @Override // com.google.common.base.Function
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return (java.lang.Comparable) ((java.util.Map.Entry) obj).getValue();
                    }
                }));
                return com.google.common.collect.ImmutableMap.copyOf(newArrayListWithCapacity);
            } catch (java.lang.Throwable th) {
                this.monitor.leave();
                throw th;
            }
        }

        final void transitionService(com.google.common.util.concurrent.Service service, com.google.common.util.concurrent.Service.State state, com.google.common.util.concurrent.Service.State state2) {
            com.google.common.base.Preconditions.checkNotNull(service);
            com.google.common.base.Preconditions.checkArgument(state != state2);
            this.monitor.enter();
            try {
                this.transitioned = true;
                if (this.ready) {
                    com.google.common.base.Preconditions.checkState(this.servicesByState.remove(state, service), "Service %s not at the expected location in the state map %s", service, state);
                    com.google.common.base.Preconditions.checkState(this.servicesByState.put(state2, service), "Service %s in the state map unexpectedly at %s", service, state2);
                    com.google.common.base.Stopwatch stopwatch = this.startupTimers.get(service);
                    if (stopwatch == null) {
                        stopwatch = com.google.common.base.Stopwatch.createStarted();
                        this.startupTimers.put(service, stopwatch);
                    }
                    if (state2.compareTo(com.google.common.util.concurrent.Service.State.RUNNING) >= 0 && stopwatch.isRunning()) {
                        stopwatch.stop();
                        if (!(service instanceof com.google.common.util.concurrent.ServiceManager.NoOpService)) {
                            com.google.common.util.concurrent.ServiceManager.logger.get().log(java.util.logging.Level.FINE, "Started {0} in {1}.", new java.lang.Object[]{service, stopwatch});
                        }
                    }
                    if (state2 == com.google.common.util.concurrent.Service.State.FAILED) {
                        enqueueFailedEvent(service);
                    }
                    if (this.states.count(com.google.common.util.concurrent.Service.State.RUNNING) == this.numberOfServices) {
                        enqueueHealthyEvent();
                    } else if (this.states.count(com.google.common.util.concurrent.Service.State.TERMINATED) + this.states.count(com.google.common.util.concurrent.Service.State.FAILED) == this.numberOfServices) {
                        enqueueStoppedEvent();
                    }
                }
            } finally {
                this.monitor.leave();
                dispatchListenerEvents();
            }
        }

        final void enqueueStoppedEvent() {
            this.listeners.enqueue(com.google.common.util.concurrent.ServiceManager.STOPPED_EVENT);
        }

        final void enqueueHealthyEvent() {
            this.listeners.enqueue(com.google.common.util.concurrent.ServiceManager.HEALTHY_EVENT);
        }

        final void enqueueFailedEvent(final com.google.common.util.concurrent.Service service) {
            this.listeners.enqueue(new com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.ServiceManager.Listener>(this) { // from class: com.google.common.util.concurrent.ServiceManager.ServiceManagerState.1
                final /* synthetic */ com.google.common.util.concurrent.ServiceManager.ServiceManagerState this$0;

                {
                    this.this$0 = this;
                }

                @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
                public void call(com.google.common.util.concurrent.ServiceManager.Listener listener) {
                    listener.failure(service);
                }

                public java.lang.String toString() {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("failed({service=");
                    sb.append(service);
                    sb.append("})");
                    return sb.toString();
                }
            });
        }

        final void dispatchListenerEvents() {
            com.google.common.base.Preconditions.checkState(!this.monitor.isOccupiedByCurrentThread(), "It is incorrect to execute listeners with the monitor held.");
            this.listeners.dispatch();
        }

        final void checkHealthy() {
            if (this.states.count(com.google.common.util.concurrent.Service.State.RUNNING) != this.numberOfServices) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected to be healthy after starting. The following services are not running: ");
                sb.append(com.google.common.collect.Multimaps.filterKeys((com.google.common.collect.SetMultimap) this.servicesByState, com.google.common.base.Predicates.not(com.google.common.base.Predicates.equalTo(com.google.common.util.concurrent.Service.State.RUNNING))));
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException(sb.toString());
                java.util.Iterator<com.google.common.util.concurrent.Service> it = this.servicesByState.get((com.google.common.collect.SetMultimap<com.google.common.util.concurrent.Service.State, com.google.common.util.concurrent.Service>) com.google.common.util.concurrent.Service.State.FAILED).iterator();
                while (it.hasNext()) {
                    illegalStateException.addSuppressed(new com.google.common.util.concurrent.ServiceManager.FailedService(it.next()));
                }
                throw illegalStateException;
            }
        }
    }

    static final class ServiceListener extends com.google.common.util.concurrent.Service.Listener {
        final com.google.common.util.concurrent.Service service;
        final java.lang.ref.WeakReference<com.google.common.util.concurrent.ServiceManager.ServiceManagerState> state;

        ServiceListener(com.google.common.util.concurrent.Service service, java.lang.ref.WeakReference<com.google.common.util.concurrent.ServiceManager.ServiceManagerState> weakReference) {
            this.service = service;
            this.state = weakReference;
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public final void starting() {
            com.google.common.util.concurrent.ServiceManager.ServiceManagerState serviceManagerState = this.state.get();
            if (serviceManagerState != null) {
                serviceManagerState.transitionService(this.service, com.google.common.util.concurrent.Service.State.NEW, com.google.common.util.concurrent.Service.State.STARTING);
                if (this.service instanceof com.google.common.util.concurrent.ServiceManager.NoOpService) {
                    return;
                }
                com.google.common.util.concurrent.ServiceManager.logger.get().log(java.util.logging.Level.FINE, "Starting {0}.", this.service);
            }
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public final void running() {
            com.google.common.util.concurrent.ServiceManager.ServiceManagerState serviceManagerState = this.state.get();
            if (serviceManagerState != null) {
                serviceManagerState.transitionService(this.service, com.google.common.util.concurrent.Service.State.STARTING, com.google.common.util.concurrent.Service.State.RUNNING);
            }
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public final void stopping(com.google.common.util.concurrent.Service.State state) {
            com.google.common.util.concurrent.ServiceManager.ServiceManagerState serviceManagerState = this.state.get();
            if (serviceManagerState != null) {
                serviceManagerState.transitionService(this.service, state, com.google.common.util.concurrent.Service.State.STOPPING);
            }
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public final void terminated(com.google.common.util.concurrent.Service.State state) {
            com.google.common.util.concurrent.ServiceManager.ServiceManagerState serviceManagerState = this.state.get();
            if (serviceManagerState != null) {
                if (!(this.service instanceof com.google.common.util.concurrent.ServiceManager.NoOpService)) {
                    com.google.common.util.concurrent.ServiceManager.logger.get().log(java.util.logging.Level.FINE, "Service {0} has terminated. Previous state was: {1}", new java.lang.Object[]{this.service, state});
                }
                serviceManagerState.transitionService(this.service, state, com.google.common.util.concurrent.Service.State.TERMINATED);
            }
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public final void failed(com.google.common.util.concurrent.Service.State state, java.lang.Throwable th) {
            com.google.common.util.concurrent.ServiceManager.ServiceManagerState serviceManagerState = this.state.get();
            if (serviceManagerState != null) {
                if ((!(this.service instanceof com.google.common.util.concurrent.ServiceManager.NoOpService)) & (state != com.google.common.util.concurrent.Service.State.STARTING)) {
                    java.util.logging.Logger logger = com.google.common.util.concurrent.ServiceManager.logger.get();
                    java.util.logging.Level level = java.util.logging.Level.SEVERE;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Service ");
                    sb.append(this.service);
                    sb.append(" has failed in the ");
                    sb.append(state);
                    sb.append(" state.");
                    logger.log(level, sb.toString(), th);
                }
                serviceManagerState.transitionService(this.service, state, com.google.common.util.concurrent.Service.State.FAILED);
            }
        }
    }

    static final class NoOpService extends com.google.common.util.concurrent.AbstractService {
        private NoOpService() {
        }

        @Override // com.google.common.util.concurrent.AbstractService
        protected final void doStart() {
            notifyStarted();
        }

        @Override // com.google.common.util.concurrent.AbstractService
        protected final void doStop() {
            notifyStopped();
        }
    }

    static final class EmptyServiceManagerWarning extends java.lang.Throwable {
        private EmptyServiceManagerWarning() {
        }
    }

    static final class FailedService extends java.lang.Throwable {
        FailedService(com.google.common.util.concurrent.Service service) {
            super(service.toString(), service.failureCause(), false, false);
        }
    }
}
