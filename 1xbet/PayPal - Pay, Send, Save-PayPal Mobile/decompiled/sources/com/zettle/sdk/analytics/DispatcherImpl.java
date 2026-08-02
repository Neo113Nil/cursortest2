package com.zettle.sdk.analytics;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0002()B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R \u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\"8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010'"}, d2 = {"Lcom/zettle/sdk/analytics/DispatcherImpl;", "Lcom/zettle/sdk/analytics/Dispatcher;", "Lcom/zettle/sdk/analytics/AnalyticsClient;", "client", "Lcom/zettle/sdk/analytics/EventStorage;", com.google.android.libraries.places.api.model.PlaceTypes.STORAGE, "Lcom/zettle/sdk/commons/thread/EventsLoop;", "eventsLoop", "Lcom/zettle/sdk/analytics/Dispatcher$State;", "initialState", "<init>", "(Lcom/zettle/sdk/analytics/AnalyticsClient;Lcom/zettle/sdk/analytics/EventStorage;Lcom/zettle/sdk/commons/thread/EventsLoop;Lcom/zettle/sdk/analytics/Dispatcher$State;)V", "old", "new", "", "mutate$core_publicRelease", "(Lcom/zettle/sdk/analytics/Dispatcher$State;Lcom/zettle/sdk/analytics/Dispatcher$State;)V", "current", "Lcom/zettle/sdk/analytics/DispatcherImpl$Action;", "action", "reduce$core_publicRelease", "(Lcom/zettle/sdk/analytics/Dispatcher$State;Lcom/zettle/sdk/analytics/DispatcherImpl$Action;)Lcom/zettle/sdk/analytics/Dispatcher$State;", "startDispatching", "()V", "stopDispatching", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/zettle/sdk/analytics/AnalyticsClient;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Lcom/zettle/sdk/commons/thread/EventsLoop;", "Lcom/zettle/sdk/commons/util/Log;", "getHighSpeedVideoFpsRanges", "Lcom/zettle/sdk/commons/util/Log;", "Camera2StreamConfigurationMap", "Lcom/zettle/sdk/commons/state/MutableState;", "state", "Lcom/zettle/sdk/commons/state/MutableState;", "getState", "()Lcom/zettle/sdk/commons/state/MutableState;", "Lcom/zettle/sdk/analytics/EventStorage;", "Action", "Callback"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class DispatcherImpl implements com.zettle.sdk.analytics.Dispatcher {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.zettle.sdk.analytics.EventStorage getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.zettle.sdk.analytics.AnalyticsClient getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.zettle.sdk.commons.util.Log Camera2StreamConfigurationMap;
    private final com.zettle.sdk.commons.thread.EventsLoop getHighSpeedVideoFpsRangesFor;
    private final com.zettle.sdk.commons.state.MutableState<com.zettle.sdk.analytics.Dispatcher.State> state;

    public DispatcherImpl(com.zettle.sdk.analytics.AnalyticsClient analyticsClient, com.zettle.sdk.analytics.EventStorage eventStorage, com.zettle.sdk.commons.thread.EventsLoop eventsLoop, com.zettle.sdk.analytics.Dispatcher.State state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventsLoop, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        this.getHighSpeedVideoSizes = analyticsClient;
        this.getHighResolutionOutputSizeshNQ4ISI = eventStorage;
        this.getHighSpeedVideoFpsRangesFor = eventsLoop;
        com.zettle.sdk.commons.util.Log analytics = com.zettle.sdk.analytics.AnalyticsKt.getAnalytics(com.zettle.sdk.commons.util.Log.INSTANCE);
        java.lang.String tag = analyticsClient.getTag();
        int hashCode = hashCode();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(tag);
        sb.append(io.ktor.sse.ServerSentEventKt.COLON);
        sb.append(hashCode);
        this.Camera2StreamConfigurationMap = analytics.get(sb.toString());
        this.state = com.zettle.sdk.commons.state.MutableState.INSTANCE.create(state, new com.zettle.sdk.analytics.DispatcherImpl$state$1(this));
    }

    public /* synthetic */ DispatcherImpl(com.zettle.sdk.analytics.AnalyticsClient analyticsClient, com.zettle.sdk.analytics.EventStorage eventStorage, com.zettle.sdk.commons.thread.EventsLoop eventsLoop, com.zettle.sdk.analytics.Dispatcher.State.Initial initial, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(analyticsClient, eventStorage, eventsLoop, (i & 8) != 0 ? com.zettle.sdk.analytics.Dispatcher.State.Initial.INSTANCE : initial);
    }

    @Override // com.zettle.sdk.analytics.Dispatcher
    public final com.zettle.sdk.commons.state.MutableState<com.zettle.sdk.analytics.Dispatcher.State> getState() {
        return this.state;
    }

    @Override // com.zettle.sdk.analytics.Dispatcher
    public final void startDispatching() {
        this.getHighSpeedVideoFpsRangesFor.post(new com.zettle.sdk.analytics.DispatcherImpl$action$1(this, com.zettle.sdk.analytics.DispatcherImpl.Action.Start.INSTANCE));
    }

    @Override // com.zettle.sdk.analytics.Dispatcher
    public final void stopDispatching() {
        this.getHighSpeedVideoFpsRangesFor.post(new com.zettle.sdk.analytics.DispatcherImpl$action$1(this, com.zettle.sdk.analytics.DispatcherImpl.Action.Stop.INSTANCE));
    }

    public final com.zettle.sdk.analytics.Dispatcher.State reduce$core_publicRelease(com.zettle.sdk.analytics.Dispatcher.State current, com.zettle.sdk.analytics.DispatcherImpl.Action action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(current, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        if (!(current instanceof com.zettle.sdk.analytics.Dispatcher.State.Initial)) {
            if (!(current instanceof com.zettle.sdk.analytics.Dispatcher.State.Dispatching)) {
                if (!(current instanceof com.zettle.sdk.analytics.Dispatcher.State.Done)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return (com.zettle.sdk.analytics.Dispatcher.State.Done) current;
            }
            com.zettle.sdk.analytics.Dispatcher.State.Dispatching dispatching = (com.zettle.sdk.analytics.Dispatcher.State.Dispatching) current;
            if (action instanceof com.zettle.sdk.analytics.DispatcherImpl.Action.Start) {
                throw new java.lang.AssertionError();
            }
            if (action instanceof com.zettle.sdk.analytics.DispatcherImpl.Action.Stop) {
                return com.zettle.sdk.analytics.Dispatcher.State.Done.INSTANCE;
            }
            if (action instanceof com.zettle.sdk.analytics.DispatcherImpl.Action.Success) {
                return new com.zettle.sdk.analytics.Dispatcher.State.Dispatching(0);
            }
            if (action instanceof com.zettle.sdk.analytics.DispatcherImpl.Action.Failed) {
                return new com.zettle.sdk.analytics.Dispatcher.State.Dispatching(dispatching.getAttempt() + 1);
            }
            if (action instanceof com.zettle.sdk.analytics.DispatcherImpl.Action.Done) {
                return com.zettle.sdk.analytics.Dispatcher.State.Done.INSTANCE;
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
        if (action instanceof com.zettle.sdk.analytics.DispatcherImpl.Action.Start) {
            return new com.zettle.sdk.analytics.Dispatcher.State.Dispatching(0);
        }
        if (action instanceof com.zettle.sdk.analytics.DispatcherImpl.Action.Stop) {
            return com.zettle.sdk.analytics.Dispatcher.State.Done.INSTANCE;
        }
        if (action instanceof com.zettle.sdk.analytics.DispatcherImpl.Action.Success) {
            throw new java.lang.AssertionError();
        }
        if (action instanceof com.zettle.sdk.analytics.DispatcherImpl.Action.Failed) {
            throw new java.lang.AssertionError();
        }
        if (action instanceof com.zettle.sdk.analytics.DispatcherImpl.Action.Done) {
            throw new java.lang.AssertionError();
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public final void mutate$core_publicRelease(com.zettle.sdk.analytics.Dispatcher.State old, com.zettle.sdk.analytics.Dispatcher.State r10) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(old, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, "");
        if (r10 instanceof com.zettle.sdk.analytics.Dispatcher.State.Dispatching) {
            com.zettle.sdk.analytics.Dispatcher.State.Dispatching dispatching = (com.zettle.sdk.analytics.Dispatcher.State.Dispatching) r10;
            if (dispatching.getAttempt() <= 10) {
                int attempt = dispatching.getAttempt();
                kotlin.Pair<java.lang.String, java.util.List<org.json.JSONObject>> query = this.getHighResolutionOutputSizeshNQ4ISI.query(this.getHighSpeedVideoSizes.getTag());
                if (query == null) {
                    this.getHighSpeedVideoFpsRangesFor.post(new com.zettle.sdk.analytics.DispatcherImpl$action$1(this, com.zettle.sdk.analytics.DispatcherImpl.Action.Done.INSTANCE));
                    return;
                } else {
                    this.getHighSpeedVideoSizes.request(query.getSecond(), new com.zettle.sdk.analytics.DispatcherImpl.Callback(this.getHighSpeedVideoSizes.getTag(), query.getFirst(), this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, new com.zettle.sdk.analytics.DispatcherImpl$dispatch$callback$1(this), attempt));
                    return;
                }
            }
            this.getHighSpeedVideoFpsRangesFor.post(new com.zettle.sdk.analytics.DispatcherImpl$action$1(this, com.zettle.sdk.analytics.DispatcherImpl.Action.Done.INSTANCE));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010 \u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\"R\u0014\u0010$\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010!"}, d2 = {"Lcom/zettle/sdk/analytics/DispatcherImpl$Callback;", "Lcom/zettle/sdk/commons/network/NetworkClient$Callback;", "", "tag", "path", "Lcom/zettle/sdk/analytics/EventStorage;", com.google.android.libraries.places.api.model.PlaceTypes.STORAGE, "Lcom/zettle/sdk/commons/thread/EventsLoop;", "eventsLoop", "Lkotlin/Function1;", "Lcom/zettle/sdk/analytics/DispatcherImpl$Action;", "", "action", "", "attempt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/zettle/sdk/analytics/EventStorage;Lcom/zettle/sdk/commons/thread/EventsLoop;Lkotlin/jvm/functions/Function1;I)V", "Ljava/io/IOException;", "e", "onFailure", "(Ljava/io/IOException;)V", "Lcom/zettle/sdk/commons/network/NetworkClient$Response;", "response", "onResponse", "(Lcom/zettle/sdk/commons/network/NetworkClient$Response;)V", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function1;", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Lcom/zettle/sdk/commons/thread/EventsLoop;", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;", "Lcom/zettle/sdk/analytics/EventStorage;", "getHighSpeedVideoSizesFor", "getInputSizeshNQ4ISI"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Callback implements com.zettle.sdk.commons.network.NetworkClient.Callback {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final int getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final com.zettle.sdk.analytics.EventStorage getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final java.lang.String Camera2StreamConfigurationMap;
        private final kotlin.jvm.functions.Function1<com.zettle.sdk.analytics.DispatcherImpl.Action, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
        private final com.zettle.sdk.commons.thread.EventsLoop getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
        private final java.lang.String getInputSizeshNQ4ISI;

        /* JADX WARN: Multi-variable type inference failed */
        public Callback(java.lang.String str, java.lang.String str2, com.zettle.sdk.analytics.EventStorage eventStorage, com.zettle.sdk.commons.thread.EventsLoop eventsLoop, kotlin.jvm.functions.Function1<? super com.zettle.sdk.analytics.DispatcherImpl.Action, kotlin.Unit> function1, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventStorage, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventsLoop, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            this.getInputSizeshNQ4ISI = str;
            this.Camera2StreamConfigurationMap = str2;
            this.getHighSpeedVideoFpsRanges = eventStorage;
            this.getHighSpeedVideoSizes = eventsLoop;
            this.getHighSpeedVideoFpsRangesFor = function1;
            this.getHighResolutionOutputSizeshNQ4ISI = i;
        }

        @Override // com.zettle.sdk.commons.network.NetworkClient.Callback
        public final void onFailure(final java.io.IOException e) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "");
            this.getHighSpeedVideoSizes.post(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.zettle.sdk.analytics.DispatcherImpl$Callback$onFailure$1
                @Override // kotlin.jvm.functions.Function0
                public final /* synthetic */ kotlin.Unit invoke() {
                    getHighSpeedVideoFpsRangesFor();
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighSpeedVideoFpsRangesFor() {
                    java.lang.String str;
                    kotlin.jvm.functions.Function1 function1;
                    com.zettle.sdk.commons.util.Log analytics = com.zettle.sdk.analytics.AnalyticsKt.getAnalytics(com.zettle.sdk.commons.util.Log.INSTANCE);
                    str = com.zettle.sdk.analytics.DispatcherImpl.Callback.this.getInputSizeshNQ4ISI;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to report ");
                    sb.append(str);
                    sb.append(" events");
                    analytics.e(sb.toString(), e);
                    function1 = com.zettle.sdk.analytics.DispatcherImpl.Callback.this.getHighSpeedVideoFpsRangesFor;
                    function1.invoke(com.zettle.sdk.analytics.DispatcherImpl.Action.Failed.INSTANCE);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            });
        }

        @Override // com.zettle.sdk.commons.network.NetworkClient.Callback
        public final void onResponse(final com.zettle.sdk.commons.network.NetworkClient.Response response) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
            this.getHighSpeedVideoSizes.post(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.zettle.sdk.analytics.DispatcherImpl$Callback$onResponse$1
                @Override // kotlin.jvm.functions.Function0
                public final /* synthetic */ kotlin.Unit invoke() {
                    Camera2StreamConfigurationMap();
                    return kotlin.Unit.INSTANCE;
                }

                public final void Camera2StreamConfigurationMap() {
                    java.lang.String str;
                    kotlin.jvm.functions.Function1 function1;
                    int i;
                    java.lang.String str2;
                    java.lang.String str3;
                    com.zettle.sdk.analytics.EventStorage eventStorage;
                    java.lang.String str4;
                    kotlin.jvm.functions.Function1 function12;
                    com.zettle.sdk.analytics.EventStorage eventStorage2;
                    java.lang.String str5;
                    kotlin.jvm.functions.Function1 function13;
                    if (com.zettle.sdk.commons.network.NetworkClient.Response.this.getIsSuccessful()) {
                        eventStorage2 = this.getHighSpeedVideoFpsRanges;
                        str5 = this.Camera2StreamConfigurationMap;
                        eventStorage2.delete(str5);
                        function13 = this.getHighSpeedVideoFpsRangesFor;
                        function13.invoke(com.zettle.sdk.analytics.DispatcherImpl.Action.Success.INSTANCE);
                        return;
                    }
                    com.zettle.sdk.commons.util.Log analytics = com.zettle.sdk.analytics.AnalyticsKt.getAnalytics(com.zettle.sdk.commons.util.Log.INSTANCE);
                    str = this.getInputSizeshNQ4ISI;
                    int code = com.zettle.sdk.commons.network.NetworkClient.Response.this.getCode();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to report ");
                    sb.append(str);
                    sb.append(" events, code ");
                    sb.append(code);
                    com.zettle.sdk.commons.util.Log.DefaultImpls.e$default(analytics, sb.toString(), null, 2, null);
                    if (com.zettle.sdk.commons.network.NetworkClient.Response.this.getCode() == 400) {
                        i = this.getHighResolutionOutputSizeshNQ4ISI;
                        if (i == 10) {
                            com.zettle.sdk.commons.util.Log analytics2 = com.zettle.sdk.analytics.AnalyticsKt.getAnalytics(com.zettle.sdk.commons.util.Log.INSTANCE);
                            str2 = this.getInputSizeshNQ4ISI;
                            java.lang.String errorBody = com.zettle.sdk.commons.network.NetworkClient.Response.this.errorBody();
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Max push attempt for ");
                            sb2.append(str2);
                            sb2.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
                            sb2.append(errorBody);
                            java.lang.String obj = sb2.toString();
                            str3 = this.getInputSizeshNQ4ISI;
                            analytics2.e(obj, new com.zettle.sdk.core.NonFatalException("Analytics", "Max push attempt for ".concat(java.lang.String.valueOf(str3))));
                            eventStorage = this.getHighSpeedVideoFpsRanges;
                            str4 = this.Camera2StreamConfigurationMap;
                            eventStorage.delete(str4);
                            function12 = this.getHighSpeedVideoFpsRangesFor;
                            function12.invoke(com.zettle.sdk.analytics.DispatcherImpl.Action.Success.INSTANCE);
                            return;
                        }
                    }
                    function1 = this.getHighSpeedVideoFpsRangesFor;
                    function1.invoke(com.zettle.sdk.analytics.DispatcherImpl.Action.Failed.INSTANCE);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            });
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r"}, d2 = {"Lcom/zettle/sdk/analytics/DispatcherImpl$Action;", "", "<init>", "()V", "Done", "Failed", "Start", "Stop", "Success", "Lcom/zettle/sdk/analytics/DispatcherImpl$Action$Done;", "Lcom/zettle/sdk/analytics/DispatcherImpl$Action$Failed;", "Lcom/zettle/sdk/analytics/DispatcherImpl$Action$Start;", "Lcom/zettle/sdk/analytics/DispatcherImpl$Action$Stop;", "Lcom/zettle/sdk/analytics/DispatcherImpl$Action$Success;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Action {

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/analytics/DispatcherImpl$Action$Start;", "Lcom/zettle/sdk/analytics/DispatcherImpl$Action;", "<init>", "()V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Start extends com.zettle.sdk.analytics.DispatcherImpl.Action {
            public static final com.zettle.sdk.analytics.DispatcherImpl.Action.Start INSTANCE = new com.zettle.sdk.analytics.DispatcherImpl.Action.Start();

            private Start() {
                super(null);
            }

            public final java.lang.String toString() {
                return "Start";
            }
        }

        private Action() {
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/analytics/DispatcherImpl$Action$Stop;", "Lcom/zettle/sdk/analytics/DispatcherImpl$Action;", "<init>", "()V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Stop extends com.zettle.sdk.analytics.DispatcherImpl.Action {
            public static final com.zettle.sdk.analytics.DispatcherImpl.Action.Stop INSTANCE = new com.zettle.sdk.analytics.DispatcherImpl.Action.Stop();

            private Stop() {
                super(null);
            }

            public final java.lang.String toString() {
                return "Stop";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/analytics/DispatcherImpl$Action$Done;", "Lcom/zettle/sdk/analytics/DispatcherImpl$Action;", "<init>", "()V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Done extends com.zettle.sdk.analytics.DispatcherImpl.Action {
            public static final com.zettle.sdk.analytics.DispatcherImpl.Action.Done INSTANCE = new com.zettle.sdk.analytics.DispatcherImpl.Action.Done();

            private Done() {
                super(null);
            }

            public final java.lang.String toString() {
                return "Done";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/analytics/DispatcherImpl$Action$Failed;", "Lcom/zettle/sdk/analytics/DispatcherImpl$Action;", "<init>", "()V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Failed extends com.zettle.sdk.analytics.DispatcherImpl.Action {
            public static final com.zettle.sdk.analytics.DispatcherImpl.Action.Failed INSTANCE = new com.zettle.sdk.analytics.DispatcherImpl.Action.Failed();

            private Failed() {
                super(null);
            }

            public final java.lang.String toString() {
                return "Failed";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/analytics/DispatcherImpl$Action$Success;", "Lcom/zettle/sdk/analytics/DispatcherImpl$Action;", "<init>", "()V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Success extends com.zettle.sdk.analytics.DispatcherImpl.Action {
            public static final com.zettle.sdk.analytics.DispatcherImpl.Action.Success INSTANCE = new com.zettle.sdk.analytics.DispatcherImpl.Action.Success();

            private Success() {
                super(null);
            }

            public final java.lang.String toString() {
                return "Success";
            }
        }

        public /* synthetic */ Action(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
