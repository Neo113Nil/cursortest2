package com.paypal.oslo.feature.oneonboarding.domain.usecase;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J>\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0086B¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/domain/usecase/GetFlowUseCase;", "", "Lcom/paypal/oslo/feature/oneonboarding/domain/repository/FlowStepRepository;", "flowStepRepository", "<init>", "(Lcom/paypal/oslo/feature/oneonboarding/domain/repository/FlowStepRepository;)V", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "intentId", "", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/CollectedItem;", "collectedItems", "", "isFlowStart", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/oneonboarding/domain/error/FlowStepError;", "Lcom/paypal/oslo/feature/oneonboarding/domain/Flow;", "invoke", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/oneonboarding/domain/repository/FlowStepRepository;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GetFlowUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.oneonboarding.domain.repository.FlowStepRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public GetFlowUseCase(com.paypal.oslo.feature.oneonboarding.domain.repository.FlowStepRepository flowStepRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowStepRepository, "");
        this.getHighSpeedVideoFpsRangesFor = flowStepRepository;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object invoke$default(com.paypal.oslo.feature.oneonboarding.domain.usecase.GetFlowUseCase getFlowUseCase, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, java.util.List list, boolean z, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return getFlowUseCase.invoke(intentId, list, z, continuation);
    }

    public final java.lang.Object invoke(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, java.util.List<? extends com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem> list, boolean z, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError, com.paypal.oslo.feature.oneonboarding.domain.Flow>> continuation) {
        return this.getHighSpeedVideoFpsRangesFor.getFlow(intentId, list, z, continuation);
    }
}
