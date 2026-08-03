package com.unity3d.services.core.domain.task;

/* compiled from: InitializeStateNetworkError.kt */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u001cB\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0003H\u0016J\b\u0010\u0018\u001a\u00020\u0003H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u0016\u0010\u001b\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lcom/unity3d/services/core/domain/task/InitializeStateNetworkError;", "Lcom/unity3d/services/core/domain/task/MetricTask;", "Lcom/unity3d/services/core/domain/task/InitializeStateNetworkError$Params;", "", "Lcom/unity3d/services/core/connectivity/IConnectivityListener;", "dispatchers", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "(Lcom/unity3d/services/core/domain/ISDKDispatchers;)V", "connectedEventThreshold", "", "continuation", "Lkotlin/coroutines/Continuation;", "lastConnectedEventTimeMs", "", "maximumConnectedEvents", "receivedConnectedEvents", "doWork", "Lkotlin/Result;", "params", "doWork-gIAlu-s", "(Lcom/unity3d/services/core/domain/task/InitializeStateNetworkError$Params;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMetricName", "", "onConnected", "onDisconnected", "shouldHandleConnectedEvent", "", "startListening", "Params", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InitializeStateNetworkError extends com.unity3d.services.core.domain.task.MetricTask<com.unity3d.services.core.domain.task.InitializeStateNetworkError.Params, kotlin.Unit> implements com.unity3d.services.core.connectivity.IConnectivityListener {
    private int connectedEventThreshold;
    private kotlin.coroutines.Continuation<? super kotlin.Unit> continuation;
    private final com.unity3d.services.core.domain.ISDKDispatchers dispatchers;
    private long lastConnectedEventTimeMs;
    private int maximumConnectedEvents;
    private int receivedConnectedEvents;

    @Override // com.unity3d.services.core.domain.task.BaseTask
    /* renamed from: doWork-gIAlu-s */
    public /* bridge */ /* synthetic */ java.lang.Object mo10358doWorkgIAlus(com.unity3d.services.core.domain.task.BaseParams baseParams, kotlin.coroutines.Continuation continuation) {
        return m10373doWorkgIAlus((com.unity3d.services.core.domain.task.InitializeStateNetworkError.Params) baseParams, (kotlin.coroutines.Continuation<? super kotlin.Result<kotlin.Unit>>) continuation);
    }

    public InitializeStateNetworkError(com.unity3d.services.core.domain.ISDKDispatchers dispatchers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.dispatchers = dispatchers;
        this.maximumConnectedEvents = 500;
        this.connectedEventThreshold = 10000;
    }

    @Override // com.unity3d.services.core.domain.task.MetricTask
    public java.lang.String getMetricName() {
        return getMetricNameForInitializeTask("error_network");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: doWork-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object m10373doWorkgIAlus(com.unity3d.services.core.domain.task.InitializeStateNetworkError.Params params, kotlin.coroutines.Continuation<? super kotlin.Result<kotlin.Unit>> continuation) {
        com.unity3d.services.core.domain.task.InitializeStateNetworkError$doWork$1 initializeStateNetworkError$doWork$1;
        int i;
        if (continuation instanceof com.unity3d.services.core.domain.task.InitializeStateNetworkError$doWork$1) {
            initializeStateNetworkError$doWork$1 = (com.unity3d.services.core.domain.task.InitializeStateNetworkError$doWork$1) continuation;
            if ((initializeStateNetworkError$doWork$1.label & Integer.MIN_VALUE) != 0) {
                initializeStateNetworkError$doWork$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = initializeStateNetworkError$doWork$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = initializeStateNetworkError$doWork$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher = this.dispatchers.getDefault();
                    com.unity3d.services.core.domain.task.InitializeStateNetworkError$doWork$2 initializeStateNetworkError$doWork$2 = new com.unity3d.services.core.domain.task.InitializeStateNetworkError$doWork$2(this, params, null);
                    initializeStateNetworkError$doWork$1.label = 1;
                    obj = kotlinx.coroutines.BuildersKt.withContext(coroutineDispatcher, initializeStateNetworkError$doWork$2, initializeStateNetworkError$doWork$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return ((kotlin.Result) obj).getValue();
            }
        }
        initializeStateNetworkError$doWork$1 = new com.unity3d.services.core.domain.task.InitializeStateNetworkError$doWork$1(this, continuation);
        java.lang.Object obj2 = initializeStateNetworkError$doWork$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = initializeStateNetworkError$doWork$1.label;
        if (i != 0) {
        }
        return ((kotlin.Result) obj2).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startListening(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        this.continuation = continuation;
        com.unity3d.services.core.connectivity.ConnectivityMonitor.addListener(this);
    }

    @Override // com.unity3d.services.core.connectivity.IConnectivityListener
    public void onConnected() {
        this.receivedConnectedEvents++;
        com.unity3d.services.core.log.DeviceLog.debug("Unity Ads init got connected event");
        if (shouldHandleConnectedEvent()) {
            kotlin.coroutines.Continuation<? super kotlin.Unit> continuation = this.continuation;
            if (continuation != null) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                continuation.resumeWith(kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE));
            }
            this.continuation = null;
        }
        if (this.receivedConnectedEvents > this.maximumConnectedEvents) {
            com.unity3d.services.core.connectivity.ConnectivityMonitor.removeListener(this);
        }
        this.lastConnectedEventTimeMs = java.lang.System.currentTimeMillis();
    }

    @Override // com.unity3d.services.core.connectivity.IConnectivityListener
    public void onDisconnected() {
        com.unity3d.services.core.log.DeviceLog.debug("Unity Ads init got disconnected event");
    }

    private final boolean shouldHandleConnectedEvent() {
        return java.lang.System.currentTimeMillis() - this.lastConnectedEventTimeMs >= ((long) this.connectedEventThreshold) && this.receivedConnectedEvents <= this.maximumConnectedEvents;
    }

    /* compiled from: InitializeStateNetworkError.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/unity3d/services/core/domain/task/InitializeStateNetworkError$Params;", "Lcom/unity3d/services/core/domain/task/BaseParams;", com.helpshift.proactive.InAppViewConstants.CONFIG, "Lcom/unity3d/services/core/configuration/Configuration;", "(Lcom/unity3d/services/core/configuration/Configuration;)V", "getConfig", "()Lcom/unity3d/services/core/configuration/Configuration;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Params implements com.unity3d.services.core.domain.task.BaseParams {
        private final com.unity3d.services.core.configuration.Configuration config;

        public static /* synthetic */ com.unity3d.services.core.domain.task.InitializeStateNetworkError.Params copy$default(com.unity3d.services.core.domain.task.InitializeStateNetworkError.Params params, com.unity3d.services.core.configuration.Configuration configuration, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                configuration = params.config;
            }
            return params.copy(configuration);
        }

        /* renamed from: component1, reason: from getter */
        public final com.unity3d.services.core.configuration.Configuration getConfig() {
            return this.config;
        }

        public final com.unity3d.services.core.domain.task.InitializeStateNetworkError.Params copy(com.unity3d.services.core.configuration.Configuration config) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
            return new com.unity3d.services.core.domain.task.InitializeStateNetworkError.Params(config);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.unity3d.services.core.domain.task.InitializeStateNetworkError.Params) && kotlin.jvm.internal.Intrinsics.areEqual(this.config, ((com.unity3d.services.core.domain.task.InitializeStateNetworkError.Params) other).config);
        }

        public int hashCode() {
            return this.config.hashCode();
        }

        public java.lang.String toString() {
            return "Params(config=" + this.config + ')';
        }

        public Params(com.unity3d.services.core.configuration.Configuration config) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
            this.config = config;
        }

        public final com.unity3d.services.core.configuration.Configuration getConfig() {
            return this.config;
        }
    }
}
