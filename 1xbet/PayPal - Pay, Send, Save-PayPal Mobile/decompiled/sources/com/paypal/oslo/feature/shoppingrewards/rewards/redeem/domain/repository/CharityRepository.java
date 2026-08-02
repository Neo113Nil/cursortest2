package com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.repository;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J<\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H¦@¢\u0006\u0004\b\u000b\u0010\fÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/repository/CharityRepository;", "", "Lcom/paypal/oslo/api/graphql/schema/type/CharityListType;", "listType", "", "limit", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResultError;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResult;", "", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/model/Charity;", "getCharities", "(Lcom/paypal/oslo/api/graphql/schema/type/CharityListType;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface CharityRepository {
    java.lang.Object getCharities(com.paypal.oslo.api.graphql.schema.type.CharityListType charityListType, java.lang.Integer num, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError, ? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.model.Charity>>>> continuation);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ java.lang.Object getCharities$default(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.repository.CharityRepository charityRepository, com.paypal.oslo.api.graphql.schema.type.CharityListType charityListType, java.lang.Integer num, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCharities");
        }
        if ((i & 2) != 0) {
            num = null;
        }
        return charityRepository.getCharities(charityListType, num, continuation);
    }
}
