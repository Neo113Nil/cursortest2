package com.zettle.sdk.analytics;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0002,-B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R \u0010&\u001a\b\u0012\u0004\u0012\u00020\u00140%8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010*"}, d2 = {"Lcom/zettle/sdk/analytics/AnalyticsManagerImpl;", "Lcom/zettle/sdk/analytics/AnalyticsManager;", "", "Lcom/zettle/sdk/analytics/AnalyticsClient;", "clients", "Lcom/zettle/sdk/analytics/EventStorage;", com.google.android.libraries.places.api.model.PlaceTypes.STORAGE, "Lcom/zettle/sdk/commons/thread/EventsLoop;", "eventsLoop", "<init>", "(Ljava/util/List;Lcom/zettle/sdk/analytics/EventStorage;Lcom/zettle/sdk/commons/thread/EventsLoop;)V", "", "tag", "Lorg/json/JSONObject;", "json", "Lcom/zettle/sdk/analytics/Scheduler;", "scheduler", "", "dispatch", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/zettle/sdk/analytics/Scheduler;)V", "Lcom/zettle/sdk/analytics/AnalyticsManager$State;", "old", "new", "mutate$core_publicRelease", "(Lcom/zettle/sdk/analytics/AnalyticsManager$State;Lcom/zettle/sdk/analytics/AnalyticsManager$State;)V", "current", "Lcom/zettle/sdk/analytics/AnalyticsManagerImpl$Action;", "action", "reduce$core_publicRelease", "(Lcom/zettle/sdk/analytics/AnalyticsManager$State;Lcom/zettle/sdk/analytics/AnalyticsManagerImpl$Action;)Lcom/zettle/sdk/analytics/AnalyticsManager$State;", "startDispatching", "()V", "Camera2StreamConfigurationMap", "Ljava/util/List;", "getHighSpeedVideoFpsRangesFor", "Lcom/zettle/sdk/commons/thread/EventsLoop;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/zettle/sdk/commons/state/MutableState;", "state", "Lcom/zettle/sdk/commons/state/MutableState;", "getState", "()Lcom/zettle/sdk/commons/state/MutableState;", "Lcom/zettle/sdk/analytics/EventStorage;", "getHighSpeedVideoFpsRanges", "Action", "Observer"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AnalyticsManagerImpl implements com.zettle.sdk.analytics.AnalyticsManager {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.List<com.zettle.sdk.analytics.AnalyticsClient> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.zettle.sdk.analytics.EventStorage getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.zettle.sdk.commons.thread.EventsLoop getHighResolutionOutputSizeshNQ4ISI;
    private final com.zettle.sdk.commons.state.MutableState<com.zettle.sdk.analytics.AnalyticsManager.State> state;

    /* JADX WARN: Multi-variable type inference failed */
    public AnalyticsManagerImpl(java.util.List<? extends com.zettle.sdk.analytics.AnalyticsClient> list, com.zettle.sdk.analytics.EventStorage eventStorage, com.zettle.sdk.commons.thread.EventsLoop eventsLoop) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventsLoop, "");
        this.getHighSpeedVideoFpsRangesFor = list;
        this.getHighSpeedVideoFpsRanges = eventStorage;
        this.getHighResolutionOutputSizeshNQ4ISI = eventsLoop;
        this.state = com.zettle.sdk.commons.state.MutableState.INSTANCE.create(com.zettle.sdk.analytics.AnalyticsManager.State.Ready.INSTANCE, new com.zettle.sdk.analytics.AnalyticsManagerImpl$state$1(this));
    }

    @Override // com.zettle.sdk.analytics.AnalyticsManager
    public final com.zettle.sdk.commons.state.MutableState<com.zettle.sdk.analytics.AnalyticsManager.State> getState() {
        return this.state;
    }

    @Override // com.zettle.sdk.analytics.AnalyticsManager
    public final void startDispatching() {
        java.util.List<com.zettle.sdk.analytics.AnalyticsClient> list = this.getHighSpeedVideoFpsRangesFor;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.zettle.sdk.analytics.DispatcherImpl((com.zettle.sdk.analytics.AnalyticsClient) it.next(), this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, null, 8, null));
        }
        java.util.ArrayList<com.zettle.sdk.analytics.DispatcherImpl> arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (com.zettle.sdk.analytics.DispatcherImpl dispatcherImpl : arrayList2) {
            arrayList3.add(kotlin.TuplesKt.to(dispatcherImpl, new com.zettle.sdk.analytics.AnalyticsManagerImpl.Observer(this, dispatcherImpl)));
        }
        this.getHighResolutionOutputSizeshNQ4ISI.post(new com.zettle.sdk.analytics.AnalyticsManagerImpl$action$1(this, new com.zettle.sdk.analytics.AnalyticsManagerImpl.Action.Start(arrayList3)));
    }

    @Override // com.zettle.sdk.analytics.AnalyticsManager
    public final void dispatch(final java.lang.String tag, final org.json.JSONObject json, final com.zettle.sdk.analytics.Scheduler scheduler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scheduler, "");
        this.getHighResolutionOutputSizeshNQ4ISI.post(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.zettle.sdk.analytics.AnalyticsManagerImpl$dispatch$1
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ kotlin.Unit invoke() {
                getHighSpeedVideoFpsRanges();
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoFpsRanges() {
                java.util.List<com.zettle.sdk.analytics.AnalyticsClient> list;
                com.zettle.sdk.analytics.EventStorage eventStorage;
                list = com.zettle.sdk.analytics.AnalyticsManagerImpl.this.getHighSpeedVideoFpsRangesFor;
                java.lang.String str = tag;
                for (com.zettle.sdk.analytics.AnalyticsClient analyticsClient : list) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(analyticsClient.getTag(), str)) {
                        eventStorage = com.zettle.sdk.analytics.AnalyticsManagerImpl.this.getHighSpeedVideoFpsRanges;
                        if (eventStorage.put(tag, json, analyticsClient.getMaxBatchSize())) {
                            scheduler.schedule();
                            com.zettle.sdk.commons.util.Log analytics = com.zettle.sdk.analytics.AnalyticsKt.getAnalytics(com.zettle.sdk.commons.util.Log.INSTANCE);
                            java.lang.String str2 = tag;
                            org.json.JSONObject jSONObject = json;
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Scheduling ");
                            sb.append(str2);
                            sb.append(" event -> ");
                            sb.append(jSONObject);
                            com.zettle.sdk.commons.util.Log.DefaultImpls.d$default(analytics, sb.toString(), null, 2, null);
                            return;
                        }
                        com.zettle.sdk.commons.util.Log analytics2 = com.zettle.sdk.analytics.AnalyticsKt.getAnalytics(com.zettle.sdk.commons.util.Log.INSTANCE);
                        java.lang.String str3 = tag;
                        org.json.JSONObject jSONObject2 = json;
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Failed to schedule ");
                        sb2.append(str3);
                        sb2.append(" event -> ");
                        sb2.append(jSONObject2);
                        com.zettle.sdk.commons.util.Log.DefaultImpls.d$default(analytics2, sb2.toString(), null, 2, null);
                        return;
                    }
                }
                throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    public final com.zettle.sdk.analytics.AnalyticsManager.State reduce$core_publicRelease(com.zettle.sdk.analytics.AnalyticsManager.State current, com.zettle.sdk.analytics.AnalyticsManagerImpl.Action action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(current, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        if (!(current instanceof com.zettle.sdk.analytics.AnalyticsManager.State.Ready)) {
            if (!(current instanceof com.zettle.sdk.analytics.AnalyticsManager.State.Working)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.zettle.sdk.analytics.AnalyticsManager.State.Working working = (com.zettle.sdk.analytics.AnalyticsManager.State.Working) current;
            if (action instanceof com.zettle.sdk.analytics.AnalyticsManagerImpl.Action.Start) {
                return working;
            }
            if (action instanceof com.zettle.sdk.analytics.AnalyticsManagerImpl.Action.Stop) {
                return com.zettle.sdk.analytics.AnalyticsManager.State.Ready.INSTANCE;
            }
            if (!(action instanceof com.zettle.sdk.analytics.AnalyticsManagerImpl.Action.Done)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            java.util.List<kotlin.Pair<com.zettle.sdk.analytics.Dispatcher, com.zettle.sdk.commons.state.StateObserver<com.zettle.sdk.analytics.Dispatcher.State>>> observers = working.getObservers();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : observers) {
                if (((kotlin.Pair) obj).getFirst() != ((com.zettle.sdk.analytics.AnalyticsManagerImpl.Action.Done) action).getDispatcher()) {
                    arrayList.add(obj);
                }
            }
            java.util.ArrayList arrayList2 = arrayList;
            if (arrayList2.isEmpty()) {
                return com.zettle.sdk.analytics.AnalyticsManager.State.Ready.INSTANCE;
            }
            return new com.zettle.sdk.analytics.AnalyticsManager.State.Working(arrayList2);
        }
        com.zettle.sdk.analytics.AnalyticsManager.State.Ready ready = (com.zettle.sdk.analytics.AnalyticsManager.State.Ready) current;
        if (action instanceof com.zettle.sdk.analytics.AnalyticsManagerImpl.Action.Start) {
            return new com.zettle.sdk.analytics.AnalyticsManager.State.Working(((com.zettle.sdk.analytics.AnalyticsManagerImpl.Action.Start) action).getObservers());
        }
        if (!(action instanceof com.zettle.sdk.analytics.AnalyticsManagerImpl.Action.Stop) && !(action instanceof com.zettle.sdk.analytics.AnalyticsManagerImpl.Action.Done)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return ready;
    }

    public final void mutate$core_publicRelease(com.zettle.sdk.analytics.AnalyticsManager.State old, com.zettle.sdk.analytics.AnalyticsManager.State r6) {
        final java.util.List<kotlin.Pair<com.zettle.sdk.analytics.Dispatcher, com.zettle.sdk.commons.state.StateObserver<com.zettle.sdk.analytics.Dispatcher.State>>> observers;
        final java.util.List<kotlin.Pair<com.zettle.sdk.analytics.Dispatcher, com.zettle.sdk.commons.state.StateObserver<com.zettle.sdk.analytics.Dispatcher.State>>> observers2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(old, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, "");
        if (old instanceof com.zettle.sdk.analytics.AnalyticsManager.State.Ready) {
            observers = kotlin.collections.CollectionsKt.emptyList();
        } else {
            if (!(old instanceof com.zettle.sdk.analytics.AnalyticsManager.State.Working)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            observers = ((com.zettle.sdk.analytics.AnalyticsManager.State.Working) old).getObservers();
        }
        if (r6 instanceof com.zettle.sdk.analytics.AnalyticsManager.State.Ready) {
            observers2 = kotlin.collections.CollectionsKt.emptyList();
        } else {
            if (!(r6 instanceof com.zettle.sdk.analytics.AnalyticsManager.State.Working)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            observers2 = ((com.zettle.sdk.analytics.AnalyticsManager.State.Working) r6).getObservers();
        }
        for (kotlin.Pair pair : kotlin.sequences.SequencesKt.filterNot(kotlin.collections.CollectionsKt.asSequence(observers), new kotlin.jvm.functions.Function1<kotlin.Pair<? extends com.zettle.sdk.analytics.Dispatcher, ? extends com.zettle.sdk.commons.state.StateObserver<com.zettle.sdk.analytics.Dispatcher.State>>, java.lang.Boolean>() { // from class: com.zettle.sdk.analytics.AnalyticsManagerImpl$mutate$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean invoke(kotlin.Pair<? extends com.zettle.sdk.analytics.Dispatcher, ? extends com.zettle.sdk.commons.state.StateObserver<com.zettle.sdk.analytics.Dispatcher.State>> pair2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pair2, "");
                java.util.List<kotlin.Pair<com.zettle.sdk.analytics.Dispatcher, com.zettle.sdk.commons.state.StateObserver<com.zettle.sdk.analytics.Dispatcher.State>>> list = observers2;
                boolean z = false;
                if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                    java.util.Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (pair2.getFirst() == ((kotlin.Pair) it.next()).getFirst()) {
                            z = true;
                            break;
                        }
                    }
                }
                return java.lang.Boolean.valueOf(z);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }
        })) {
            ((com.zettle.sdk.analytics.Dispatcher) pair.getFirst()).getState().removeObserver((com.zettle.sdk.commons.state.StateObserver) pair.getSecond());
            ((com.zettle.sdk.analytics.Dispatcher) pair.getFirst()).stopDispatching();
        }
        for (kotlin.Pair pair2 : kotlin.sequences.SequencesKt.filterNot(kotlin.collections.CollectionsKt.asSequence(observers2), new kotlin.jvm.functions.Function1<kotlin.Pair<? extends com.zettle.sdk.analytics.Dispatcher, ? extends com.zettle.sdk.commons.state.StateObserver<com.zettle.sdk.analytics.Dispatcher.State>>, java.lang.Boolean>() { // from class: com.zettle.sdk.analytics.AnalyticsManagerImpl$mutate$3
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean invoke(kotlin.Pair<? extends com.zettle.sdk.analytics.Dispatcher, ? extends com.zettle.sdk.commons.state.StateObserver<com.zettle.sdk.analytics.Dispatcher.State>> pair3) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pair3, "");
                java.util.List<kotlin.Pair<com.zettle.sdk.analytics.Dispatcher, com.zettle.sdk.commons.state.StateObserver<com.zettle.sdk.analytics.Dispatcher.State>>> list = observers;
                boolean z = false;
                if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                    java.util.Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (pair3.getFirst() == ((kotlin.Pair) it.next()).getFirst()) {
                            z = true;
                            break;
                        }
                    }
                }
                return java.lang.Boolean.valueOf(z);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }
        })) {
            ((com.zettle.sdk.analytics.Dispatcher) pair2.getFirst()).getState().addObserver((com.zettle.sdk.commons.state.StateObserver) pair2.getSecond(), this.getHighResolutionOutputSizeshNQ4ISI);
            ((com.zettle.sdk.analytics.Dispatcher) pair2.getFirst()).startDispatching();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/zettle/sdk/analytics/AnalyticsManagerImpl$Observer;", "Lcom/zettle/sdk/commons/state/StateObserver;", "Lcom/zettle/sdk/analytics/Dispatcher$State;", "Lcom/zettle/sdk/analytics/Dispatcher;", "dispatcher", "<init>", "(Lcom/zettle/sdk/analytics/AnalyticsManagerImpl;Lcom/zettle/sdk/analytics/Dispatcher;)V", "state", "", "onNext", "(Lcom/zettle/sdk/analytics/Dispatcher$State;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/zettle/sdk/analytics/Dispatcher;", "Camera2StreamConfigurationMap"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class Observer implements com.zettle.sdk.commons.state.StateObserver<com.zettle.sdk.analytics.Dispatcher.State> {

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final com.zettle.sdk.analytics.Dispatcher Camera2StreamConfigurationMap;
        final /* synthetic */ com.zettle.sdk.analytics.AnalyticsManagerImpl getHighSpeedVideoSizes;

        public Observer(com.zettle.sdk.analytics.AnalyticsManagerImpl analyticsManagerImpl, com.zettle.sdk.analytics.Dispatcher dispatcher) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatcher, "");
            this.getHighSpeedVideoSizes = analyticsManagerImpl;
            this.Camera2StreamConfigurationMap = dispatcher;
        }

        @Override // com.zettle.sdk.commons.state.StateObserver
        public final void onNext(com.zettle.sdk.analytics.Dispatcher.State state) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
            if (state instanceof com.zettle.sdk.analytics.Dispatcher.State.Done) {
                com.zettle.sdk.analytics.AnalyticsManagerImpl.access$action(this.getHighSpeedVideoSizes, new com.zettle.sdk.analytics.AnalyticsManagerImpl.Action.Done(this.Camera2StreamConfigurationMap));
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/zettle/sdk/analytics/AnalyticsManagerImpl$Action;", "", "<init>", "()V", "Done", "Start", "Stop", "Lcom/zettle/sdk/analytics/AnalyticsManagerImpl$Action$Done;", "Lcom/zettle/sdk/analytics/AnalyticsManagerImpl$Action$Start;", "Lcom/zettle/sdk/analytics/AnalyticsManagerImpl$Action$Stop;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Action {

        @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\u001e\u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00030\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR/\u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/zettle/sdk/analytics/AnalyticsManagerImpl$Action$Start;", "Lcom/zettle/sdk/analytics/AnalyticsManagerImpl$Action;", "", "Lkotlin/Pair;", "Lcom/zettle/sdk/analytics/Dispatcher;", "Lcom/zettle/sdk/commons/state/StateObserver;", "Lcom/zettle/sdk/analytics/Dispatcher$State;", "observers", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getObservers", "()Ljava/util/List;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Start extends com.zettle.sdk.analytics.AnalyticsManagerImpl.Action {
            private final java.util.List<kotlin.Pair<com.zettle.sdk.analytics.Dispatcher, com.zettle.sdk.commons.state.StateObserver<com.zettle.sdk.analytics.Dispatcher.State>>> observers;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public Start(java.util.List<? extends kotlin.Pair<? extends com.zettle.sdk.analytics.Dispatcher, ? extends com.zettle.sdk.commons.state.StateObserver<com.zettle.sdk.analytics.Dispatcher.State>>> list) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
                this.observers = list;
            }

            public final java.util.List<kotlin.Pair<com.zettle.sdk.analytics.Dispatcher, com.zettle.sdk.commons.state.StateObserver<com.zettle.sdk.analytics.Dispatcher.State>>> getObservers() {
                return this.observers;
            }

            public final java.lang.String toString() {
                return "Start";
            }
        }

        private Action() {
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/analytics/AnalyticsManagerImpl$Action$Stop;", "Lcom/zettle/sdk/analytics/AnalyticsManagerImpl$Action;", "<init>", "()V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Stop extends com.zettle.sdk.analytics.AnalyticsManagerImpl.Action {
            public static final com.zettle.sdk.analytics.AnalyticsManagerImpl.Action.Stop INSTANCE = new com.zettle.sdk.analytics.AnalyticsManagerImpl.Action.Stop();

            private Stop() {
                super(null);
            }

            public final java.lang.String toString() {
                return "Stop";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/zettle/sdk/analytics/AnalyticsManagerImpl$Action$Done;", "Lcom/zettle/sdk/analytics/AnalyticsManagerImpl$Action;", "Lcom/zettle/sdk/analytics/Dispatcher;", "dispatcher", "<init>", "(Lcom/zettle/sdk/analytics/Dispatcher;)V", "", "toString", "()Ljava/lang/String;", "Lcom/zettle/sdk/analytics/Dispatcher;", "getDispatcher", "()Lcom/zettle/sdk/analytics/Dispatcher;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Done extends com.zettle.sdk.analytics.AnalyticsManagerImpl.Action {
            private final com.zettle.sdk.analytics.Dispatcher dispatcher;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Done(com.zettle.sdk.analytics.Dispatcher dispatcher) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatcher, "");
                this.dispatcher = dispatcher;
            }

            public final com.zettle.sdk.analytics.Dispatcher getDispatcher() {
                return this.dispatcher;
            }

            public final java.lang.String toString() {
                return "Done";
            }
        }

        public /* synthetic */ Action(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final /* synthetic */ void access$action(com.zettle.sdk.analytics.AnalyticsManagerImpl analyticsManagerImpl, com.zettle.sdk.analytics.AnalyticsManagerImpl.Action action) {
        analyticsManagerImpl.getHighResolutionOutputSizeshNQ4ISI.post(new com.zettle.sdk.analytics.AnalyticsManagerImpl$action$1(analyticsManagerImpl, action));
    }
}
