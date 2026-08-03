package com.unity3d.ads.core.data.repository;

/* compiled from: AndroidDiagnosticEventRepository.kt */
@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\fH\u0016J\b\u0010#\u001a\u00020!H\u0016J\u0010\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020!H\u0016R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010\r\u001a&\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000f0\u000f \u0010*\u0012\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000f0\u000f\u0018\u00010\u00110\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010\u0014\u001a&\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000f0\u000f \u0010*\u0012\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000f0\u000f\u0018\u00010\u00110\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u001aX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/unity3d/ads/core/data/repository/AndroidDiagnosticEventRepository;", "Lcom/unity3d/ads/core/data/repository/DiagnosticEventRepository;", "flushTimer", "Lcom/unity3d/ads/core/utils/CoroutineTimer;", "getDiagnosticEventRequest", "Lcom/unity3d/ads/core/domain/events/GetDiagnosticEventRequest;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/unity3d/ads/core/utils/CoroutineTimer;Lcom/unity3d/ads/core/domain/events/GetDiagnosticEventRequest;Lkotlinx/coroutines/CoroutineDispatcher;)V", "_diagnosticEvents", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEvent;", "allowedEvents", "", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventType;", "kotlin.jvm.PlatformType", "", "batch", "Lkotlinx/coroutines/flow/MutableStateFlow;", "blockedEvents", "configured", "", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "diagnosticEvents", "Lkotlinx/coroutines/flow/SharedFlow;", "getDiagnosticEvents", "()Lkotlinx/coroutines/flow/SharedFlow;", "enabled", "maxBatchSize", "", "addDiagnosticEvent", "", "diagnosticEvent", "clear", "configure", "diagnosticsEventsConfiguration", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$DiagnosticEventsConfiguration;", "flush", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidDiagnosticEventRepository implements com.unity3d.ads.core.data.repository.DiagnosticEventRepository {
    private final kotlinx.coroutines.flow.MutableSharedFlow<java.util.List<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent>> _diagnosticEvents;
    private final java.util.Set<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType> allowedEvents;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent>> batch;
    private final java.util.Set<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType> blockedEvents;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> configured;
    private final kotlinx.coroutines.CoroutineScope coroutineScope;
    private final kotlinx.coroutines.flow.SharedFlow<java.util.List<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent>> diagnosticEvents;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> enabled;
    private final com.unity3d.ads.core.utils.CoroutineTimer flushTimer;
    private final com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest getDiagnosticEventRequest;
    private int maxBatchSize;

    public AndroidDiagnosticEventRepository(com.unity3d.ads.core.utils.CoroutineTimer flushTimer, com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest getDiagnosticEventRequest, kotlinx.coroutines.CoroutineDispatcher dispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flushTimer, "flushTimer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getDiagnosticEventRequest, "getDiagnosticEventRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.flushTimer = flushTimer;
        this.getDiagnosticEventRequest = getDiagnosticEventRequest;
        this.coroutineScope = kotlinx.coroutines.CoroutineScopeKt.plus(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(dispatcher), new kotlinx.coroutines.CoroutineName("DiagnosticEventRepository"));
        this.batch = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(kotlin.collections.CollectionsKt.emptyList());
        this.maxBatchSize = Integer.MAX_VALUE;
        this.allowedEvents = java.util.Collections.synchronizedSet(new java.util.LinkedHashSet());
        this.blockedEvents = java.util.Collections.synchronizedSet(new java.util.LinkedHashSet());
        this.enabled = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(false);
        this.configured = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(false);
        kotlinx.coroutines.flow.MutableSharedFlow<java.util.List<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent>> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(100, 0, null, 6, null);
        this._diagnosticEvents = MutableSharedFlow$default;
        this.diagnosticEvents = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public kotlinx.coroutines.flow.SharedFlow<java.util.List<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent>> getDiagnosticEvents() {
        return this.diagnosticEvents;
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void addDiagnosticEvent(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
        java.util.List<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent> value;
        java.util.List<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent> value2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(diagnosticEvent, "diagnosticEvent");
        if (!this.configured.getValue().booleanValue()) {
            kotlinx.coroutines.flow.MutableStateFlow<java.util.List<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent>> mutableStateFlow = this.batch;
            do {
                value2 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value2, kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent>) value2, diagnosticEvent)));
        } else if (this.enabled.getValue().booleanValue()) {
            kotlinx.coroutines.flow.MutableStateFlow<java.util.List<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent>> mutableStateFlow2 = this.batch;
            do {
                value = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value, kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent>) value, diagnosticEvent)));
            if (this.batch.getValue().size() >= this.maxBatchSize) {
                flush();
            }
        }
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void flush() {
        java.util.List<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent> value;
        if (this.enabled.getValue().booleanValue()) {
            kotlinx.coroutines.flow.MutableStateFlow<java.util.List<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent>> mutableStateFlow = this.batch;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, kotlin.collections.CollectionsKt.emptyList()));
            final java.util.List list = kotlin.sequences.SequencesKt.toList(kotlin.sequences.SequencesKt.filter(kotlin.sequences.SequencesKt.filter(kotlin.sequences.SequencesKt.map(kotlin.collections.CollectionsKt.asSequence(value), new kotlin.jvm.functions.Function1<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent>() { // from class: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository$flush$events$2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent invoke(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
                    com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest getDiagnosticEventRequest;
                    if (diagnosticEvent != null) {
                        return diagnosticEvent;
                    }
                    getDiagnosticEventRequest = com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.this.getDiagnosticEventRequest;
                    return getDiagnosticEventRequest.invoke("null_diagnostic_event", null, null, null, null, null, null, null, null);
                }
            }), new kotlin.jvm.functions.Function1<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent, java.lang.Boolean>() { // from class: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository$flush$events$3
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Boolean invoke(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent it) {
                    java.util.Set set;
                    boolean z;
                    java.util.Set set2;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                    set = com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.this.allowedEvents;
                    if (!set.isEmpty()) {
                        set2 = com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.this.allowedEvents;
                        if (!set2.contains(it.getEventType())) {
                            z = false;
                            return java.lang.Boolean.valueOf(z);
                        }
                    }
                    z = true;
                    return java.lang.Boolean.valueOf(z);
                }
            }), new kotlin.jvm.functions.Function1<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent, java.lang.Boolean>() { // from class: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository$flush$events$4
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Boolean invoke(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent it) {
                    java.util.Set set;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                    set = com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.this.blockedEvents;
                    return java.lang.Boolean.valueOf(!set.contains(it.getEventType()));
                }
            }));
            if (!list.isEmpty()) {
                com.unity3d.services.core.log.DeviceLog.debug((java.util.concurrent.Callable<java.lang.String>) new java.util.concurrent.Callable() { // from class: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository$$ExternalSyntheticLambda0
                    @Override // java.util.concurrent.Callable
                    public final java.lang.Object call() {
                        java.lang.String flush$lambda$3;
                        flush$lambda$3 = com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.flush$lambda$3(com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.this, list);
                        return flush$lambda$3;
                    }
                });
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository$flush$2(this, list, null), 3, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String flush$lambda$3(com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository this$0, java.util.List events) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(events, "$events");
        return "Unity Ads Sending diagnostic batch enabled: " + this$0.enabled.getValue().booleanValue() + " size: " + events.size() + " :: " + events;
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void clear() {
        kotlinx.coroutines.flow.MutableStateFlow<java.util.List<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent>> mutableStateFlow = this.batch;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), kotlin.collections.CollectionsKt.emptyList())) {
        }
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void configure(gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticsEventsConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(diagnosticsEventsConfiguration, "diagnosticsEventsConfiguration");
        this.configured.setValue(true);
        this.enabled.setValue(java.lang.Boolean.valueOf(diagnosticsEventsConfiguration.getEnabled()));
        if (!this.enabled.getValue().booleanValue()) {
            clear();
            return;
        }
        this.maxBatchSize = diagnosticsEventsConfiguration.getMaxBatchSize();
        java.util.Set<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType> set = this.allowedEvents;
        java.util.List<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType> allowedEventsList = diagnosticsEventsConfiguration.getAllowedEventsList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(allowedEventsList, "diagnosticsEventsConfiguration.allowedEventsList");
        set.addAll(allowedEventsList);
        java.util.Set<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType> set2 = this.blockedEvents;
        java.util.List<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType> blockedEventsList = diagnosticsEventsConfiguration.getBlockedEventsList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(blockedEventsList, "diagnosticsEventsConfiguration.blockedEventsList");
        set2.addAll(blockedEventsList);
        this.flushTimer.start(0L, diagnosticsEventsConfiguration.getMaxBatchIntervalMs(), new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository$configure$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.this.flush();
            }
        });
    }
}
