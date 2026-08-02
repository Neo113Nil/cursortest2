package com.paypal.oslo.feature.oneonboarding.domain.repository;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J<\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\f\u0010\rÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/domain/repository/FlowStepRepository;", "", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "intentId", "", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/CollectedItem;", "collectedItems", "", "isFlowStart", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/oneonboarding/domain/error/FlowStepError;", "Lcom/paypal/oslo/feature/oneonboarding/domain/Flow;", "getFlow", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface FlowStepRepository {
    java.lang.Object getFlow(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, java.util.List<? extends com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem> list, boolean z, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError, com.paypal.oslo.feature.oneonboarding.domain.Flow>> continuation);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ java.lang.Object getFlow$default(com.paypal.oslo.feature.oneonboarding.domain.repository.FlowStepRepository flowStepRepository, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, java.util.List list, boolean z, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFlow");
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return flowStepRepository.getFlow(intentId, list, z, continuation);
    }
}
