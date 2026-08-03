package com.unity3d.ads.core.domain.events;

/* compiled from: DiagnosticEventObserver.kt */
@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\u0011\u0010\u0018\u001a\u00020\u0019H\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\u001aR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lcom/unity3d/ads/core/domain/events/DiagnosticEventObserver;", "", "getUniversalRequestForPayLoad", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "getDiagnosticEventBatchRequest", "Lcom/unity3d/ads/core/domain/events/GetDiagnosticEventBatchRequest;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "diagnosticEventRepository", "Lcom/unity3d/ads/core/data/repository/DiagnosticEventRepository;", "universalRequestDataSource", "Lcom/unity3d/ads/core/data/datasource/UniversalRequestDataSource;", "backgroundWorker", "Lcom/unity3d/ads/core/domain/work/BackgroundWorker;", "universalRequestEventSender", "Lcom/unity3d/ads/core/domain/events/UniversalRequestEventSender;", "diagnosticRequestPolicy", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "(Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;Lcom/unity3d/ads/core/domain/events/GetDiagnosticEventBatchRequest;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/unity3d/ads/core/data/repository/DiagnosticEventRepository;Lcom/unity3d/ads/core/data/datasource/UniversalRequestDataSource;Lcom/unity3d/ads/core/domain/work/BackgroundWorker;Lcom/unity3d/ads/core/domain/events/UniversalRequestEventSender;Lcom/unity3d/ads/core/domain/GetRequestPolicy;)V", "isRunning", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DiagnosticEventObserver {
    private final com.unity3d.ads.core.domain.work.BackgroundWorker backgroundWorker;
    private final com.unity3d.ads.core.data.repository.DiagnosticEventRepository diagnosticEventRepository;
    private final com.unity3d.ads.core.domain.GetRequestPolicy diagnosticRequestPolicy;
    private final com.unity3d.ads.core.domain.events.GetDiagnosticEventBatchRequest getDiagnosticEventBatchRequest;
    private final com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> isRunning;
    private final kotlinx.coroutines.CoroutineScope scope;
    private final com.unity3d.ads.core.data.datasource.UniversalRequestDataSource universalRequestDataSource;
    private final com.unity3d.ads.core.domain.events.UniversalRequestEventSender universalRequestEventSender;

    public DiagnosticEventObserver(com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, com.unity3d.ads.core.domain.events.GetDiagnosticEventBatchRequest getDiagnosticEventBatchRequest, kotlinx.coroutines.CoroutineDispatcher defaultDispatcher, com.unity3d.ads.core.data.repository.DiagnosticEventRepository diagnosticEventRepository, com.unity3d.ads.core.data.datasource.UniversalRequestDataSource universalRequestDataSource, com.unity3d.ads.core.domain.work.BackgroundWorker backgroundWorker, com.unity3d.ads.core.domain.events.UniversalRequestEventSender universalRequestEventSender, com.unity3d.ads.core.domain.GetRequestPolicy diagnosticRequestPolicy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getDiagnosticEventBatchRequest, "getDiagnosticEventBatchRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(diagnosticEventRepository, "diagnosticEventRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(universalRequestDataSource, "universalRequestDataSource");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backgroundWorker, "backgroundWorker");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(universalRequestEventSender, "universalRequestEventSender");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(diagnosticRequestPolicy, "diagnosticRequestPolicy");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.getDiagnosticEventBatchRequest = getDiagnosticEventBatchRequest;
        this.diagnosticEventRepository = diagnosticEventRepository;
        this.universalRequestDataSource = universalRequestDataSource;
        this.backgroundWorker = backgroundWorker;
        this.universalRequestEventSender = universalRequestEventSender;
        this.diagnosticRequestPolicy = diagnosticRequestPolicy;
        this.isRunning = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(false);
        this.scope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(defaultDispatcher.plus(new com.unity3d.ads.core.domain.events.DiagnosticEventObserver$special$$inlined$CoroutineExceptionHandler$1(kotlinx.coroutines.CoroutineExceptionHandler.INSTANCE)));
    }

    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(this.scope.getCoroutineContext(), new com.unity3d.ads.core.domain.events.DiagnosticEventObserver$invoke$2(this, null), continuation);
        return withContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : kotlin.Unit.INSTANCE;
    }
}
