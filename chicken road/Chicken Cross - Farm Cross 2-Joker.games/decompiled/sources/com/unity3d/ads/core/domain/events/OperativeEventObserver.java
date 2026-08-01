package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.data.repository.OperativeEventRepository;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.work.BackgroundWorker;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: OperativeEventObserver.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0019\u001a\u00020\u001aH\u0086B¢\u0006\u0002\u0010\u001bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/unity3d/ads/core/domain/events/OperativeEventObserver;", "", "getUniversalRequestForPayLoad", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "operativeEventRepository", "Lcom/unity3d/ads/core/data/repository/OperativeEventRepository;", "universalRequestDataSource", "Lcom/unity3d/ads/core/data/datasource/UniversalRequestDataSource;", "backgroundWorker", "Lcom/unity3d/ads/core/domain/work/BackgroundWorker;", "universalRequestEventSender", "Lcom/unity3d/ads/core/domain/events/UniversalRequestEventSender;", "operativeRequestPolicy", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "<init>", "(Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/unity3d/ads/core/data/repository/OperativeEventRepository;Lcom/unity3d/ads/core/data/datasource/UniversalRequestDataSource;Lcom/unity3d/ads/core/domain/work/BackgroundWorker;Lcom/unity3d/ads/core/domain/events/UniversalRequestEventSender;Lcom/unity3d/ads/core/domain/GetRequestPolicy;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "isRunning", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OperativeEventObserver {
    private final BackgroundWorker backgroundWorker;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final MutableStateFlow<Boolean> isRunning;
    private final OperativeEventRepository operativeEventRepository;
    private final GetRequestPolicy operativeRequestPolicy;
    private final CoroutineScope scope;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final UniversalRequestDataSource universalRequestDataSource;
    private final UniversalRequestEventSender universalRequestEventSender;

    public OperativeEventObserver(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, CoroutineDispatcher defaultDispatcher, OperativeEventRepository operativeEventRepository, UniversalRequestDataSource universalRequestDataSource, BackgroundWorker backgroundWorker, UniversalRequestEventSender universalRequestEventSender, GetRequestPolicy operativeRequestPolicy, SendDiagnosticEvent sendDiagnosticEvent) {
        Intrinsics.checkNotNullParameter(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        Intrinsics.checkNotNullParameter(operativeEventRepository, "operativeEventRepository");
        Intrinsics.checkNotNullParameter(universalRequestDataSource, "universalRequestDataSource");
        Intrinsics.checkNotNullParameter(backgroundWorker, "backgroundWorker");
        Intrinsics.checkNotNullParameter(universalRequestEventSender, "universalRequestEventSender");
        Intrinsics.checkNotNullParameter(operativeRequestPolicy, "operativeRequestPolicy");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.operativeEventRepository = operativeEventRepository;
        this.universalRequestDataSource = universalRequestDataSource;
        this.backgroundWorker = backgroundWorker;
        this.universalRequestEventSender = universalRequestEventSender;
        this.operativeRequestPolicy = operativeRequestPolicy;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.isRunning = StateFlowKt.MutableStateFlow(false);
        this.scope = CoroutineScopeKt.CoroutineScope(defaultDispatcher.plus(new OperativeEventObserver$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.INSTANCE)));
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(this.scope.getCoroutineContext(), new OperativeEventObserver$invoke$2(this, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }
}
