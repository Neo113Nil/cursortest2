package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CommonTokenNumberProvider.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0007H\u0096\u0002R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonTokenNumberProvider;", "Lcom/unity3d/ads/core/domain/TokenNumberProvider;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "<init>", "(Lcom/unity3d/ads/core/data/repository/SessionRepository;)V", "number", "", "getNumber", "()I", "number$delegate", "Lkotlin/Lazy;", "invoke", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CommonTokenNumberProvider implements TokenNumberProvider {

    /* renamed from: number$delegate, reason: from kotlin metadata */
    private final Lazy number;

    public CommonTokenNumberProvider(final SessionRepository sessionRepository) {
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        this.number = LazyKt.lazy(new Function0() { // from class: com.unity3d.ads.core.domain.CommonTokenNumberProvider$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int headerBiddingTokenCounter;
                headerBiddingTokenCounter = SessionRepository.this.getHeaderBiddingTokenCounter();
                return Integer.valueOf(headerBiddingTokenCounter);
            }
        });
    }

    private final int getNumber() {
        return ((Number) this.number.getValue()).intValue();
    }

    @Override // com.unity3d.ads.core.domain.TokenNumberProvider
    public int invoke() {
        return getNumber();
    }
}
