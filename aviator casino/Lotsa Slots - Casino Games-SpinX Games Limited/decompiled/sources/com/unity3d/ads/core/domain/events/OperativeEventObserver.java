package com.unity3d.ads.core.domain.events;

/* compiled from: OperativeEventObserver.kt */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u0011\u0010\u0016\u001a\u00020\u0017H\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\u0018R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lcom/unity3d/ads/core/domain/events/OperativeEventObserver;", "", "getUniversalRequestForPayLoad", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "operativeEventRepository", "Lcom/unity3d/ads/core/data/repository/OperativeEventRepository;", "universalRequestDataSource", "Lcom/unity3d/ads/core/data/datasource/UniversalRequestDataSource;", "backgroundWorker", "Lcom/unity3d/ads/core/domain/work/BackgroundWorker;", "universalRequestEventSender", "Lcom/unity3d/ads/core/domain/events/UniversalRequestEventSender;", "operativeRequestPolicy", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "(Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/unity3d/ads/core/data/repository/OperativeEventRepository;Lcom/unity3d/ads/core/data/datasource/UniversalRequestDataSource;Lcom/unity3d/ads/core/domain/work/BackgroundWorker;Lcom/unity3d/ads/core/domain/events/UniversalRequestEventSender;Lcom/unity3d/ads/core/domain/GetRequestPolicy;)V", "isRunning", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class OperativeEventObserver {
    private final com.unity3d.ads.core.domain.work.BackgroundWorker backgroundWorker;
    private final com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> isRunning;
    private final com.unity3d.ads.core.data.repository.OperativeEventRepository operativeEventRepository;
    private final com.unity3d.ads.core.domain.GetRequestPolicy operativeRequestPolicy;
    private final kotlinx.coroutines.CoroutineScope scope;
    private final com.unity3d.ads.core.data.datasource.UniversalRequestDataSource universalRequestDataSource;
    private final com.unity3d.ads.core.domain.events.UniversalRequestEventSender universalRequestEventSender;

    public OperativeEventObserver(com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, kotlinx.coroutines.CoroutineDispatcher defaultDispatcher, com.unity3d.ads.core.data.repository.OperativeEventRepository operativeEventRepository, com.unity3d.ads.core.data.datasource.UniversalRequestDataSource universalRequestDataSource, com.unity3d.ads.core.domain.work.BackgroundWorker backgroundWorker, com.unity3d.ads.core.domain.events.UniversalRequestEventSender universalRequestEventSender, com.unity3d.ads.core.domain.GetRequestPolicy operativeRequestPolicy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operativeEventRepository, "operativeEventRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(universalRequestDataSource, "universalRequestDataSource");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backgroundWorker, "backgroundWorker");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(universalRequestEventSender, "universalRequestEventSender");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operativeRequestPolicy, "operativeRequestPolicy");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.operativeEventRepository = operativeEventRepository;
        this.universalRequestDataSource = universalRequestDataSource;
        this.backgroundWorker = backgroundWorker;
        this.universalRequestEventSender = universalRequestEventSender;
        this.operativeRequestPolicy = operativeRequestPolicy;
        this.isRunning = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(false);
        this.scope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(defaultDispatcher.plus(new com.unity3d.ads.core.domain.events.OperativeEventObserver$special$$inlined$CoroutineExceptionHandler$1(kotlinx.coroutines.CoroutineExceptionHandler.INSTANCE)));
    }

    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(this.scope.getCoroutineContext(), new com.unity3d.ads.core.domain.events.OperativeEventObserver$invoke$2(this, null), continuation);
        return withContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : kotlin.Unit.INSTANCE;
    }
}
