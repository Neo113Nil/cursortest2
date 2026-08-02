package com.adobe.marketing.mobile.internal.eventhub;

@kotlin.Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\n\b\u0000\u0018\u0000 j2\u00020\u0001:\u0001jB+\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u0004\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ/\u0010\u0015\u001a\u00020\u00072\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00112\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0017\u001a\u00020\u00072\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00112\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J;\u0010!\u001a\u00020\u00072\u000e\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001b0\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001a0\u001fH\u0016¢\u0006\u0004\b!\u0010\"J5\u0010!\u001a\u00020\u00072\u000e\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001b0\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#H\u0017¢\u0006\u0004\b!\u0010&J3\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010'\u001a\u00020\u00122\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010(\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u00101\u001a\u0004\u0018\u0001002\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0012H\u0002¢\u0006\u0004\b3\u00104J3\u00105\u001a\u0004\u0018\u00010+2\u0006\u0010'\u001a\u00020\u00122\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010(\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b5\u0010-J%\u00106\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001fH\u0016¢\u0006\u0004\b6\u00107J'\u0010<\u001a\u00020\u00072\u0006\u00108\u001a\u00020\u00122\u0006\u00109\u001a\u00020\u00122\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020\u0007¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0007H\u0016¢\u0006\u0004\b@\u0010?J\u000f\u0010A\u001a\u00020\u0007H\u0016¢\u0006\u0004\bA\u0010?J\u000f\u0010B\u001a\u00020\u0007H\u0016¢\u0006\u0004\bB\u0010?R\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020\u000b0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020H0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010IR\u001d\u0010K\u001a\b\u0012\u0004\u0012\u00020\u000b0J8\u0007¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR(\u0010P\u001a\u0004\u0018\u00010\u00032\b\u0010O\u001a\u0004\u0018\u00010\u00038\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u001c\u0010D\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bT\u0010UR(\u0010V\u001a\u0004\u0018\u00010\u00122\b\u0010O\u001a\u0004\u0018\u00010\u00128\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u00104R\u0014\u0010[\u001a\u00020Y8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bF\u0010ZR(\u0010\\\u001a\u0004\u0018\u00010\u000b2\b\u0010O\u001a\u0004\u0018\u00010\u000b8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R@\u0010a\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u00010`2\u0014\u0010O\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u00010`8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR$\u0010T\u001a\u0010\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u000200\u0018\u00010`8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b[\u0010bR(\u0010e\u001a\u0004\u0018\u00010\u00122\b\u0010O\u001a\u0004\u0018\u00010\u00128\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\be\u0010W\u001a\u0004\bf\u00104R\u0014\u0010g\u001a\u00020Y8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bg\u0010ZR(\u0010h\u001a\u0004\u0018\u00010\u00122\b\u0010O\u001a\u0004\u0018\u00010\u00128\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\bh\u0010W\u001a\u0004\bi\u00104"}, d2 = {"Lcom/adobe/marketing/mobile/internal/eventhub/ExtensionContainer;", "Lcom/adobe/marketing/mobile/ExtensionApi;", "Ljava/lang/Class;", "Lcom/adobe/marketing/mobile/Extension;", "extensionClass", "Lkotlin/Function1;", "Lcom/adobe/marketing/mobile/internal/eventhub/EventHubError;", "", com.sun.jna.Callback.METHOD_NAME, "<init>", "(Ljava/lang/Class;Lkotlin/jvm/functions/Function1;)V", "Lcom/adobe/marketing/mobile/Event;", "event", "Lcom/adobe/marketing/mobile/SharedStateResolver;", "createPendingSharedState", "(Lcom/adobe/marketing/mobile/Event;)Lcom/adobe/marketing/mobile/SharedStateResolver;", "createPendingXDMSharedState", "", "", "", "state", "createSharedState", "(Ljava/util/Map;Lcom/adobe/marketing/mobile/Event;)V", "createXDMSharedState", "dispatch", "(Lcom/adobe/marketing/mobile/Event;)V", "", "Lcom/adobe/marketing/mobile/EventHistoryRequest;", "eventHistoryRequests", "", "enforceOrder", "Lcom/adobe/marketing/mobile/AdobeCallbackWithError;", "Lcom/adobe/marketing/mobile/EventHistoryResult;", "getHistoricalEvents", "([Lcom/adobe/marketing/mobile/EventHistoryRequest;ZLcom/adobe/marketing/mobile/AdobeCallbackWithError;)V", "Lcom/adobe/marketing/mobile/EventHistoryResultHandler;", "", "handler", "([Lcom/adobe/marketing/mobile/EventHistoryRequest;ZLcom/adobe/marketing/mobile/EventHistoryResultHandler;)V", "extensionName", "barrier", "Lcom/adobe/marketing/mobile/SharedStateResolution;", "resolution", "Lcom/adobe/marketing/mobile/SharedStateResult;", "getSharedState", "(Ljava/lang/String;Lcom/adobe/marketing/mobile/Event;ZLcom/adobe/marketing/mobile/SharedStateResolution;)Lcom/adobe/marketing/mobile/SharedStateResult;", "Lcom/adobe/marketing/mobile/internal/eventhub/SharedStateType;", "type", "Lcom/adobe/marketing/mobile/internal/eventhub/SharedStateManager;", "getSharedStateManager", "(Lcom/adobe/marketing/mobile/internal/eventhub/SharedStateType;)Lcom/adobe/marketing/mobile/internal/eventhub/SharedStateManager;", "getHighSpeedVideoFpsRanges", "()Ljava/lang/String;", "getXDMSharedState", "recordHistoricalEvent", "(Lcom/adobe/marketing/mobile/Event;Lcom/adobe/marketing/mobile/AdobeCallbackWithError;)V", "eventType", "eventSource", "Lcom/adobe/marketing/mobile/ExtensionEventListener;", "eventListener", "registerEventListener", "(Ljava/lang/String;Ljava/lang/String;Lcom/adobe/marketing/mobile/ExtensionEventListener;)V", "shutdown", "()V", "startEvents", "stopEvents", "unregisterExtension", "Lcom/adobe/marketing/mobile/util/SerialWorkDispatcher$WorkHandler;", "getHighSpeedVideoFpsRangesFor", "Lcom/adobe/marketing/mobile/util/SerialWorkDispatcher$WorkHandler;", "getHighSpeedVideoSizes", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Lcom/adobe/marketing/mobile/internal/eventhub/ExtensionListenerContainer;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Lcom/adobe/marketing/mobile/util/SerialWorkDispatcher;", "eventProcessor", "Lcom/adobe/marketing/mobile/util/SerialWorkDispatcher;", "getEventProcessor", "()Lcom/adobe/marketing/mobile/util/SerialWorkDispatcher;", "p0", "extension", "Lcom/adobe/marketing/mobile/Extension;", "getExtension", "()Lcom/adobe/marketing/mobile/Extension;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/Class;", com.adobe.marketing.mobile.internal.eventhub.EventHubConstants.EventDataKeys.FRIENDLY_NAME, "Ljava/lang/String;", "getFriendlyName", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "Camera2StreamConfigurationMap", "lastProcessedEvent", "Lcom/adobe/marketing/mobile/Event;", "getLastProcessedEvent", "()Lcom/adobe/marketing/mobile/Event;", "", "metadata", "Ljava/util/Map;", "getMetadata", "()Ljava/util/Map;", "sharedStateName", "getSharedStateName", "getInputSizeshNQ4ISI", "version", "getVersion", "Companion"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ExtensionContainer extends com.adobe.marketing.mobile.ExtensionApi {
    public static final java.lang.String LOG_TAG = "ExtensionContainer";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private java.util.Map<com.adobe.marketing.mobile.internal.eventhub.SharedStateType, com.adobe.marketing.mobile.internal.eventhub.SharedStateManager> getHighResolutionOutputSizeshNQ4ISI;
    private final com.adobe.marketing.mobile.util.SerialWorkDispatcher<com.adobe.marketing.mobile.Event> eventProcessor;
    private com.adobe.marketing.mobile.Extension extension;
    private java.lang.String friendlyName;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.Class<? extends com.adobe.marketing.mobile.Extension> getHighSpeedVideoFpsRangesFor;
    private final java.util.concurrent.ConcurrentLinkedQueue<com.adobe.marketing.mobile.internal.eventhub.ExtensionListenerContainer> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.adobe.marketing.mobile.util.SerialWorkDispatcher.WorkHandler<com.adobe.marketing.mobile.Event> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.Runnable Camera2StreamConfigurationMap;
    private final java.lang.Runnable getInputSizeshNQ4ISI;
    private com.adobe.marketing.mobile.Event lastProcessedEvent;
    private java.util.Map<java.lang.String, java.lang.String> metadata;
    private java.lang.String sharedStateName;
    private java.lang.String version;

    public ExtensionContainer(java.lang.Class<? extends com.adobe.marketing.mobile.Extension> cls, final kotlin.jvm.functions.Function1<? super com.adobe.marketing.mobile.internal.eventhub.EventHubError, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighSpeedVideoFpsRangesFor = cls;
        this.getHighSpeedVideoFpsRanges = new java.util.concurrent.ConcurrentLinkedQueue<>();
        com.adobe.marketing.mobile.util.SerialWorkDispatcher.WorkHandler<com.adobe.marketing.mobile.Event> workHandler = new com.adobe.marketing.mobile.util.SerialWorkDispatcher.WorkHandler<com.adobe.marketing.mobile.Event>() { // from class: com.adobe.marketing.mobile.internal.eventhub.ExtensionContainer$dispatchJob$1
            @Override // com.adobe.marketing.mobile.util.SerialWorkDispatcher.WorkHandler
            public final /* synthetic */ boolean doWork(com.adobe.marketing.mobile.Event event) {
                java.util.concurrent.ConcurrentLinkedQueue<com.adobe.marketing.mobile.internal.eventhub.ExtensionListenerContainer> concurrentLinkedQueue;
                com.adobe.marketing.mobile.Event event2 = event;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event2, "");
                com.adobe.marketing.mobile.Extension extension = com.adobe.marketing.mobile.internal.eventhub.ExtensionContainer.this.getExtension();
                if (extension == null || !extension.readyForEvent(event2)) {
                    return false;
                }
                concurrentLinkedQueue = com.adobe.marketing.mobile.internal.eventhub.ExtensionContainer.this.getHighSpeedVideoFpsRanges;
                for (com.adobe.marketing.mobile.internal.eventhub.ExtensionListenerContainer extensionListenerContainer : concurrentLinkedQueue) {
                    if (extensionListenerContainer.shouldNotify(event2)) {
                        extensionListenerContainer.notify(event2);
                    }
                }
                com.adobe.marketing.mobile.internal.eventhub.ExtensionContainer.this.lastProcessedEvent = event2;
                return true;
            }
        };
        this.getHighSpeedVideoSizes = workHandler;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.adobe.marketing.mobile.internal.eventhub.ExtensionContainer$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.adobe.marketing.mobile.internal.eventhub.ExtensionContainer.m9876$r8$lambda$AnNEVPtjA7kuuKLW4udICCFM(com.adobe.marketing.mobile.internal.eventhub.ExtensionContainer.this, function1);
            }
        };
        this.Camera2StreamConfigurationMap = runnable;
        java.lang.Runnable runnable2 = new java.lang.Runnable() { // from class: com.adobe.marketing.mobile.internal.eventhub.ExtensionContainer$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.adobe.marketing.mobile.internal.eventhub.ExtensionContainer.$r8$lambda$tUyO4IBzpHTZe9EQpSKTgVdlFHI(com.adobe.marketing.mobile.internal.eventhub.ExtensionContainer.this);
            }
        };
        this.getInputSizeshNQ4ISI = runnable2;
        java.lang.String extensionTypeName = com.adobe.marketing.mobile.internal.eventhub.ExtensionExtKt.getExtensionTypeName(cls);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(extensionTypeName, "");
        com.adobe.marketing.mobile.util.SerialWorkDispatcher<com.adobe.marketing.mobile.Event> serialWorkDispatcher = new com.adobe.marketing.mobile.util.SerialWorkDispatcher<>(extensionTypeName, workHandler);
        this.eventProcessor = serialWorkDispatcher;
        serialWorkDispatcher.setInitialJob(runnable);
        serialWorkDispatcher.setFinalJob(runnable2);
        serialWorkDispatcher.start();
    }

    public final java.lang.String getSharedStateName() {
        return this.sharedStateName;
    }

    public final java.lang.String getFriendlyName() {
        return this.friendlyName;
    }

    public final java.lang.String getVersion() {
        return this.version;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getMetadata() {
        return this.metadata;
    }

    public final com.adobe.marketing.mobile.Event getLastProcessedEvent() {
        return this.lastProcessedEvent;
    }

    public final com.adobe.marketing.mobile.Extension getExtension() {
        return this.extension;
    }

    public final com.adobe.marketing.mobile.util.SerialWorkDispatcher<com.adobe.marketing.mobile.Event> getEventProcessor() {
        return this.eventProcessor;
    }

    public final void shutdown() {
        this.eventProcessor.shutdown();
    }

    public final com.adobe.marketing.mobile.internal.eventhub.SharedStateManager getSharedStateManager(com.adobe.marketing.mobile.internal.eventhub.SharedStateType type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        java.util.Map<com.adobe.marketing.mobile.internal.eventhub.SharedStateType, com.adobe.marketing.mobile.internal.eventhub.SharedStateManager> map = this.getHighResolutionOutputSizeshNQ4ISI;
        if (map != null) {
            return map.get(type);
        }
        return null;
    }

    private final java.lang.String getHighSpeedVideoFpsRanges() {
        if (this.extension == null) {
            return LOG_TAG;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ExtensionContainer[");
        sb.append(this.sharedStateName);
        sb.append('(');
        sb.append(this.version);
        sb.append(")]");
        return sb.toString();
    }

    @Override // com.adobe.marketing.mobile.ExtensionApi
    public final void registerEventListener(java.lang.String eventType, java.lang.String eventSource, com.adobe.marketing.mobile.ExtensionEventListener eventListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventListener, "");
        this.getHighSpeedVideoFpsRanges.add(new com.adobe.marketing.mobile.internal.eventhub.ExtensionListenerContainer(eventType, eventSource, eventListener));
    }

    @Override // com.adobe.marketing.mobile.ExtensionApi
    public final void dispatch(com.adobe.marketing.mobile.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        com.adobe.marketing.mobile.internal.eventhub.EventHub.INSTANCE.getShared().dispatch(event);
    }

    @Override // com.adobe.marketing.mobile.ExtensionApi
    public final void startEvents() {
        this.eventProcessor.resume();
    }

    @Override // com.adobe.marketing.mobile.ExtensionApi
    public final void stopEvents() {
        this.eventProcessor.pause();
    }

    @Override // com.adobe.marketing.mobile.ExtensionApi
    public final void createSharedState(java.util.Map<java.lang.String, java.lang.Object> state, com.adobe.marketing.mobile.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        java.lang.String str = this.sharedStateName;
        if (str == null) {
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, getHighSpeedVideoFpsRanges(), "ExtensionContainer is not fully initialized. createSharedState should not be called from Extension constructor", new java.lang.Object[0]);
        } else {
            com.adobe.marketing.mobile.internal.eventhub.EventHub.INSTANCE.getShared().createSharedState(com.adobe.marketing.mobile.internal.eventhub.SharedStateType.STANDARD, str, state, event);
        }
    }

    @Override // com.adobe.marketing.mobile.ExtensionApi
    public final com.adobe.marketing.mobile.SharedStateResolver createPendingSharedState(com.adobe.marketing.mobile.Event event) {
        java.lang.String str = this.sharedStateName;
        if (str == null) {
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, getHighSpeedVideoFpsRanges(), "ExtensionContainer is not fully initialized. createPendingSharedState should not be called from 'Extension' constructor", new java.lang.Object[0]);
            return null;
        }
        return com.adobe.marketing.mobile.internal.eventhub.EventHub.INSTANCE.getShared().createPendingSharedState(com.adobe.marketing.mobile.internal.eventhub.SharedStateType.STANDARD, str, event);
    }

    @Override // com.adobe.marketing.mobile.ExtensionApi
    public final com.adobe.marketing.mobile.SharedStateResult getSharedState(java.lang.String extensionName, com.adobe.marketing.mobile.Event event, boolean barrier, com.adobe.marketing.mobile.SharedStateResolution resolution) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extensionName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resolution, "");
        return com.adobe.marketing.mobile.internal.eventhub.EventHub.INSTANCE.getShared().getSharedState(com.adobe.marketing.mobile.internal.eventhub.SharedStateType.STANDARD, extensionName, event, barrier, resolution);
    }

    @Override // com.adobe.marketing.mobile.ExtensionApi
    public final void createXDMSharedState(java.util.Map<java.lang.String, java.lang.Object> state, com.adobe.marketing.mobile.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        java.lang.String str = this.sharedStateName;
        if (str == null) {
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, getHighSpeedVideoFpsRanges(), "ExtensionContainer is not fully initialized. createXDMSharedState should not be called from Extension constructor", new java.lang.Object[0]);
        } else {
            com.adobe.marketing.mobile.internal.eventhub.EventHub.INSTANCE.getShared().createSharedState(com.adobe.marketing.mobile.internal.eventhub.SharedStateType.XDM, str, state, event);
        }
    }

    @Override // com.adobe.marketing.mobile.ExtensionApi
    public final com.adobe.marketing.mobile.SharedStateResolver createPendingXDMSharedState(com.adobe.marketing.mobile.Event event) {
        java.lang.String str = this.sharedStateName;
        if (str == null) {
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, getHighSpeedVideoFpsRanges(), "ExtensionContainer is not fully initialized. createPendingXDMSharedState should not be called from 'Extension' constructor", new java.lang.Object[0]);
            return null;
        }
        return com.adobe.marketing.mobile.internal.eventhub.EventHub.INSTANCE.getShared().createPendingSharedState(com.adobe.marketing.mobile.internal.eventhub.SharedStateType.XDM, str, event);
    }

    @Override // com.adobe.marketing.mobile.ExtensionApi
    public final com.adobe.marketing.mobile.SharedStateResult getXDMSharedState(java.lang.String extensionName, com.adobe.marketing.mobile.Event event, boolean barrier, com.adobe.marketing.mobile.SharedStateResolution resolution) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extensionName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resolution, "");
        return com.adobe.marketing.mobile.internal.eventhub.EventHub.INSTANCE.getShared().getSharedState(com.adobe.marketing.mobile.internal.eventhub.SharedStateType.XDM, extensionName, event, barrier, resolution);
    }

    @Override // com.adobe.marketing.mobile.ExtensionApi
    public final void unregisterExtension() {
        com.adobe.marketing.mobile.internal.eventhub.EventHub.INSTANCE.getShared().unregisterExtension(this.getHighSpeedVideoFpsRangesFor, new kotlin.jvm.functions.Function1<com.adobe.marketing.mobile.internal.eventhub.EventHubError, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.internal.eventhub.ExtensionContainer$unregisterExtension$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(com.adobe.marketing.mobile.internal.eventhub.EventHubError eventHubError) {
                getHighSpeedVideoFpsRanges(eventHubError);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoFpsRanges(com.adobe.marketing.mobile.internal.eventhub.EventHubError eventHubError) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventHubError, "");
            }
        });
    }

    @Override // com.adobe.marketing.mobile.ExtensionApi
    @kotlin.Deprecated(message = "Use getHistoricalEvents with AdobeCallback instead", replaceWith = @kotlin.ReplaceWith(expression = "getHistoricalEvents(eventHistoryRequests, enforceOrder, adobeCallback)", imports = {}))
    public final void getHistoricalEvents(com.adobe.marketing.mobile.EventHistoryRequest[] eventHistoryRequests, final boolean enforceOrder, final com.adobe.marketing.mobile.EventHistoryResultHandler<java.lang.Integer> handler) {
        kotlin.Unit unit;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventHistoryRequests, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "");
        com.adobe.marketing.mobile.internal.eventhub.history.EventHistory eventHistory = com.adobe.marketing.mobile.internal.eventhub.EventHub.INSTANCE.getShared().getEventHistory();
        if (eventHistory != null) {
            eventHistory.getEvents(eventHistoryRequests, enforceOrder, new com.adobe.marketing.mobile.AdobeCallbackWithError<com.adobe.marketing.mobile.EventHistoryResult[]>() { // from class: com.adobe.marketing.mobile.internal.eventhub.ExtensionContainer$getHistoricalEvents$1
                @Override // com.adobe.marketing.mobile.AdobeCallback
                public final void call(com.adobe.marketing.mobile.EventHistoryResult[] results) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(results, "");
                    handler.call(java.lang.Integer.valueOf(com.adobe.marketing.mobile.launch.rulesengine.HistoricalEventsQueryingKt.convertEventHistoryResultToInt(enforceOrder, results)));
                }

                @Override // com.adobe.marketing.mobile.AdobeCallbackWithError
                public final void fail(com.adobe.marketing.mobile.AdobeError error) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
                    handler.call(-1);
                }
            });
            unit = kotlin.Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            handler.call(-1);
        }
    }

    @Override // com.adobe.marketing.mobile.ExtensionApi
    public final void getHistoricalEvents(com.adobe.marketing.mobile.EventHistoryRequest[] eventHistoryRequests, boolean enforceOrder, com.adobe.marketing.mobile.AdobeCallbackWithError<com.adobe.marketing.mobile.EventHistoryResult[]> callback) {
        kotlin.Unit unit;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventHistoryRequests, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        com.adobe.marketing.mobile.internal.eventhub.history.EventHistory eventHistory = com.adobe.marketing.mobile.internal.eventhub.EventHub.INSTANCE.getShared().getEventHistory();
        if (eventHistory != null) {
            eventHistory.getEvents(eventHistoryRequests, enforceOrder, callback);
            unit = kotlin.Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            callback.fail(com.adobe.marketing.mobile.AdobeError.UNEXPECTED_ERROR);
        }
    }

    @Override // com.adobe.marketing.mobile.ExtensionApi
    public final void recordHistoricalEvent(com.adobe.marketing.mobile.Event event, com.adobe.marketing.mobile.AdobeCallbackWithError<java.lang.Boolean> callback) {
        kotlin.Unit unit;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        com.adobe.marketing.mobile.internal.eventhub.history.EventHistory eventHistory = com.adobe.marketing.mobile.internal.eventhub.EventHub.INSTANCE.getShared().getEventHistory();
        if (eventHistory != null) {
            eventHistory.recordEvent(event, callback);
            unit = kotlin.Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            callback.fail(com.adobe.marketing.mobile.AdobeError.UNEXPECTED_ERROR);
        }
    }

    /* renamed from: $r8$lambda$A-nNEVPtjA7kuuKLW4udIC--CFM, reason: not valid java name */
    public static /* synthetic */ void m9876$r8$lambda$AnNEVPtjA7kuuKLW4udICCFM(com.adobe.marketing.mobile.internal.eventhub.ExtensionContainer extensionContainer, kotlin.jvm.functions.Function1 function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extensionContainer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        com.adobe.marketing.mobile.Extension initWith = com.adobe.marketing.mobile.internal.eventhub.ExtensionExtKt.initWith(extensionContainer.getHighSpeedVideoFpsRangesFor, extensionContainer);
        if (initWith == null) {
            function1.invoke(com.adobe.marketing.mobile.internal.eventhub.EventHubError.ExtensionInitializationFailure);
            return;
        }
        java.lang.String extensionName = com.adobe.marketing.mobile.internal.eventhub.ExtensionExtKt.getExtensionName(initWith);
        java.lang.String str = extensionName;
        if (str == null || kotlin.text.StringsKt.isBlank(str)) {
            function1.invoke(com.adobe.marketing.mobile.internal.eventhub.EventHubError.InvalidExtensionName);
            return;
        }
        extensionContainer.extension = initWith;
        extensionContainer.sharedStateName = extensionName;
        extensionContainer.friendlyName = com.adobe.marketing.mobile.internal.eventhub.ExtensionExtKt.getExtensionFriendlyName(initWith);
        extensionContainer.version = com.adobe.marketing.mobile.internal.eventhub.ExtensionExtKt.getExtensionVersion(initWith);
        extensionContainer.metadata = com.adobe.marketing.mobile.internal.eventhub.ExtensionExtKt.getExtensionMetadata(initWith);
        extensionContainer.getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.adobe.marketing.mobile.internal.eventhub.SharedStateType.XDM, new com.adobe.marketing.mobile.internal.eventhub.SharedStateManager(extensionName)), kotlin.TuplesKt.to(com.adobe.marketing.mobile.internal.eventhub.SharedStateType.STANDARD, new com.adobe.marketing.mobile.internal.eventhub.SharedStateManager(extensionName)));
        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, extensionContainer.getHighSpeedVideoFpsRanges(), "Extension registered", new java.lang.Object[0]);
        function1.invoke(com.adobe.marketing.mobile.internal.eventhub.EventHubError.None);
        com.adobe.marketing.mobile.internal.eventhub.ExtensionExtKt.onExtensionRegistered(initWith);
    }

    public static /* synthetic */ void $r8$lambda$tUyO4IBzpHTZe9EQpSKTgVdlFHI(com.adobe.marketing.mobile.internal.eventhub.ExtensionContainer extensionContainer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extensionContainer, "");
        com.adobe.marketing.mobile.Extension extension = extensionContainer.extension;
        if (extension != null) {
            com.adobe.marketing.mobile.internal.eventhub.ExtensionExtKt.onExtensionUnregistered(extension);
        }
        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, extensionContainer.getHighSpeedVideoFpsRanges(), "Extension unregistered", new java.lang.Object[0]);
    }
}
