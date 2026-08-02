package com.zettle.sdk.commons.state;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001!B9\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\u00020\u00052\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\r\u001a\u00020\u00052\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u0006\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000fJ\u001d\u0010\u0010\u001a\u00020\u00052\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ#\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00028\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR(\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001cR \u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010 "}, d2 = {"Lcom/zettle/sdk/commons/state/StateImpl;", "T", "Lcom/zettle/sdk/commons/state/MutableState;", "p0", "Lkotlin/Function2;", "", "p1", "Lkotlin/Function0;", "Lcom/zettle/sdk/commons/thread/EventsLoop;", "p2", "<init>", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "Lcom/zettle/sdk/commons/state/StateObserver;", "addObserver", "(Lcom/zettle/sdk/commons/state/StateObserver;)V", "(Lcom/zettle/sdk/commons/state/StateObserver;Lcom/zettle/sdk/commons/thread/EventsLoop;)V", "removeObserver", "Lkotlin/Function1;", "", "update", "(Lkotlin/jvm/functions/Function1;)Z", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "Z", "Lkotlin/jvm/functions/Function2;", "getHighResolutionOutputSizeshNQ4ISI", "", "Lcom/zettle/sdk/commons/state/StateImpl$ObserverRecord;", "Ljava/util/List;", "ObserverRecord"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
final class StateImpl<T> implements com.zettle.sdk.commons.state.MutableState<T> {
    private boolean Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.List<com.zettle.sdk.commons.state.StateImpl.ObserverRecord<T>> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function2<T, T, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    private T getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<com.zettle.sdk.commons.thread.EventsLoop> getHighSpeedVideoFpsRanges;

    /* JADX WARN: Multi-variable type inference failed */
    public StateImpl(T t, kotlin.jvm.functions.Function2<? super T, ? super T, kotlin.Unit> function2, kotlin.jvm.functions.Function0<? extends com.zettle.sdk.commons.thread.EventsLoop> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.getHighResolutionOutputSizeshNQ4ISI = function2;
        this.getHighSpeedVideoFpsRanges = function0;
        this.getHighSpeedVideoFpsRangesFor = t;
        this.getHighSpeedVideoSizes = new java.util.ArrayList();
    }

    @Override // com.zettle.sdk.commons.state.State
    public final void addObserver(com.zettle.sdk.commons.state.StateObserver<T> p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        addObserver(p0, this.getHighSpeedVideoFpsRanges.invoke());
    }

    @Override // com.zettle.sdk.commons.state.State
    public final void addObserver(com.zettle.sdk.commons.state.StateObserver<T> p0, com.zettle.sdk.commons.thread.EventsLoop p1) {
        T t;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        synchronized (this) {
            java.util.Iterator<T> it = this.getHighSpeedVideoSizes.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = (T) null;
                    break;
                } else {
                    t = it.next();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(((com.zettle.sdk.commons.state.StateImpl.ObserverRecord) t).getObserver(), p0)) {
                        break;
                    }
                }
            }
            if (t != null) {
                return;
            }
            objectRef.element = (T) new com.zettle.sdk.commons.state.StateImpl.ObserverRecord(p0, p1);
            this.getHighSpeedVideoSizes.add(objectRef.element);
            final T t2 = this.getHighSpeedVideoFpsRangesFor;
            p1.post(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.zettle.sdk.commons.state.StateImpl$addObserver$2$1
                @Override // kotlin.jvm.functions.Function0
                public final /* synthetic */ kotlin.Unit invoke() {
                    getHighResolutionOutputSizeshNQ4ISI();
                    return kotlin.Unit.INSTANCE;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final void getHighResolutionOutputSizeshNQ4ISI() {
                    com.zettle.sdk.commons.state.StateObserver observer = ((com.zettle.sdk.commons.state.StateImpl.ObserverRecord) objectRef.element).getObserver();
                    if (observer != null) {
                        observer.onNext(t2);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            });
        }
    }

    @Override // com.zettle.sdk.commons.state.State
    public final void removeObserver(final com.zettle.sdk.commons.state.StateObserver<T> p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        synchronized (this) {
            kotlin.collections.CollectionsKt.removeAll((java.util.List) this.getHighSpeedVideoSizes, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.zettle.sdk.commons.state.StateImpl.ObserverRecord<T>, java.lang.Boolean>() { // from class: com.zettle.sdk.commons.state.StateImpl$removeObserver$1$1
                @Override // kotlin.jvm.functions.Function1
                /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                public final java.lang.Boolean invoke(com.zettle.sdk.commons.state.StateImpl.ObserverRecord<T> observerRecord) {
                    boolean z;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(observerRecord, "");
                    if (kotlin.jvm.internal.Intrinsics.areEqual(observerRecord.getObserver(), p0)) {
                        observerRecord.setObserver(null);
                        z = true;
                    } else {
                        z = false;
                    }
                    return java.lang.Boolean.valueOf(z);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            });
        }
    }

    @Override // com.zettle.sdk.commons.state.MutableState
    public final boolean update(kotlin.jvm.functions.Function1<? super T, ? extends T> p0) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        synchronized (this) {
            if (this.Camera2StreamConfigurationMap) {
                throw new java.lang.AssertionError("Nested changes are not allowed");
            }
            T t = this.getHighSpeedVideoFpsRangesFor;
            final T invoke = p0.invoke(t);
            z = false;
            if (t != invoke) {
                this.getHighSpeedVideoFpsRangesFor = invoke;
                this.Camera2StreamConfigurationMap = true;
                kotlin.jvm.functions.Function2<T, T, kotlin.Unit> function2 = this.getHighResolutionOutputSizeshNQ4ISI;
                if (function2 != null) {
                    function2.invoke(t, invoke);
                }
                this.Camera2StreamConfigurationMap = false;
                java.util.Iterator<T> it = this.getHighSpeedVideoSizes.iterator();
                while (it.hasNext()) {
                    final com.zettle.sdk.commons.state.StateImpl.ObserverRecord observerRecord = (com.zettle.sdk.commons.state.StateImpl.ObserverRecord) it.next();
                    observerRecord.getProcessor().post(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.zettle.sdk.commons.state.StateImpl$update$1$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public final /* synthetic */ kotlin.Unit invoke() {
                            getHighSpeedVideoSizes();
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void getHighSpeedVideoSizes() {
                            com.zettle.sdk.commons.state.StateObserver observer = observerRecord.getObserver();
                            if (observer != null) {
                                observer.onNext(invoke);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    });
                }
                z = true;
            }
        }
        return z;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u001f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR*\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00038\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/zettle/sdk/commons/state/StateImpl$ObserverRecord;", "T", "", "Lcom/zettle/sdk/commons/state/StateObserver;", "observer", "Lcom/zettle/sdk/commons/thread/EventsLoop;", "processor", "<init>", "(Lcom/zettle/sdk/commons/state/StateObserver;Lcom/zettle/sdk/commons/thread/EventsLoop;)V", "Lcom/zettle/sdk/commons/state/StateObserver;", "getObserver", "()Lcom/zettle/sdk/commons/state/StateObserver;", "setObserver", "(Lcom/zettle/sdk/commons/state/StateObserver;)V", "Lcom/zettle/sdk/commons/thread/EventsLoop;", "getProcessor", "()Lcom/zettle/sdk/commons/thread/EventsLoop;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ObserverRecord<T> {
        private volatile com.zettle.sdk.commons.state.StateObserver<T> observer;
        private final com.zettle.sdk.commons.thread.EventsLoop processor;

        public ObserverRecord(com.zettle.sdk.commons.state.StateObserver<T> stateObserver, com.zettle.sdk.commons.thread.EventsLoop eventsLoop) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventsLoop, "");
            this.observer = stateObserver;
            this.processor = eventsLoop;
        }

        public final com.zettle.sdk.commons.state.StateObserver<T> getObserver() {
            return this.observer;
        }

        public final void setObserver(com.zettle.sdk.commons.state.StateObserver<T> stateObserver) {
            this.observer = stateObserver;
        }

        public final com.zettle.sdk.commons.thread.EventsLoop getProcessor() {
            return this.processor;
        }
    }
}
