package com.unity3d.ads.core.data.repository;

import gatewayprotocol.v1.AdRevenueEventRequestOuterClass;
import kotlin.Metadata;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* compiled from: AndroidAdRevenueRepository.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/unity3d/ads/core/data/repository/AndroidAdRevenueRepository;", "Lcom/unity3d/ads/core/data/repository/AdRevenueRepository;", "<init>", "()V", "adRevenueEvents", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueEventRequest;", "getAdRevenueEvents", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AndroidAdRevenueRepository implements AdRevenueRepository {
    private final MutableSharedFlow<AdRevenueEventRequestOuterClass.AdRevenueEventRequest> adRevenueEvents = SharedFlowKt.MutableSharedFlow(0, 64, BufferOverflow.DROP_OLDEST);

    @Override // com.unity3d.ads.core.data.repository.AdRevenueRepository
    public MutableSharedFlow<AdRevenueEventRequestOuterClass.AdRevenueEventRequest> getAdRevenueEvents() {
        return this.adRevenueEvents;
    }
}
