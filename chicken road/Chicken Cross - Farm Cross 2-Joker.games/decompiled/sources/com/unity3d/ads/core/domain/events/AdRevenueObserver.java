package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.repository.AdRevenueRepository;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.ads.gatewayclient.GatewayClient;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: AdRevenueObserver.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0013\u001a\u00020\u0014H\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/unity3d/ads/core/domain/events/AdRevenueObserver;", "", "getUniversalRequestForPayLoad", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "adRevenueRepository", "Lcom/unity3d/ads/core/data/repository/AdRevenueRepository;", "gatewayClient", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "getRequestPolicy", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "logger", "Lcom/unity3d/ads/core/log/Logger;", "<init>", "(Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;Lkotlinx/coroutines/CoroutineScope;Lcom/unity3d/ads/core/data/repository/AdRevenueRepository;Lcom/unity3d/ads/gatewayclient/GatewayClient;Lcom/unity3d/ads/core/domain/GetRequestPolicy;Lcom/unity3d/ads/core/log/Logger;)V", "isRunning", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "invoke", "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AdRevenueObserver {
    private final AdRevenueRepository adRevenueRepository;
    private final GatewayClient gatewayClient;
    private final GetRequestPolicy getRequestPolicy;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final MutableStateFlow<Boolean> isRunning;
    private final Logger logger;
    private final CoroutineScope scope;

    public AdRevenueObserver(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, CoroutineScope scope, AdRevenueRepository adRevenueRepository, GatewayClient gatewayClient, GetRequestPolicy getRequestPolicy, Logger logger) {
        Intrinsics.checkNotNullParameter(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(adRevenueRepository, "adRevenueRepository");
        Intrinsics.checkNotNullParameter(gatewayClient, "gatewayClient");
        Intrinsics.checkNotNullParameter(getRequestPolicy, "getRequestPolicy");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.scope = scope;
        this.adRevenueRepository = adRevenueRepository;
        this.gatewayClient = gatewayClient;
        this.getRequestPolicy = getRequestPolicy;
        this.logger = logger;
        this.isRunning = StateFlowKt.MutableStateFlow(false);
    }

    public final void invoke() {
        Boolean value;
        Boolean bool;
        MutableStateFlow<Boolean> mutableStateFlow = this.isRunning;
        do {
            value = mutableStateFlow.getValue();
            bool = value;
            bool.booleanValue();
        } while (!mutableStateFlow.compareAndSet(value, true));
        if (bool.booleanValue()) {
            return;
        }
        FlowKt.launchIn(FlowKt.onEach(this.adRevenueRepository.getAdRevenueEvents(), new AdRevenueObserver$invoke$2(this, null)), this.scope).invokeOnCompletion(new Function1() { // from class: com.unity3d.ads.core.domain.events.AdRevenueObserver$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$1;
                invoke$lambda$1 = AdRevenueObserver.invoke$lambda$1(AdRevenueObserver.this, (Throwable) obj);
                return invoke$lambda$1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1(AdRevenueObserver adRevenueObserver, Throwable th) {
        adRevenueObserver.isRunning.setValue(false);
        return Unit.INSTANCE;
    }
}
