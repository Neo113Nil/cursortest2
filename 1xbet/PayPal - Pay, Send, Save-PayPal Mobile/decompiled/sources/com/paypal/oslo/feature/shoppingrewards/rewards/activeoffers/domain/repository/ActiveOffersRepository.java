package com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.repository;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\nJ*\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\b\u0010\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/domain/repository/ActiveOffersRepository;", "", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/domain/repository/ActiveOffersRepository$ActiveOfferGraphQLRequest;", "input", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResultError;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResult;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/domain/usecase/GetActiveOffersUseCase$Response;", "getActiveOffers", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/domain/repository/ActiveOffersRepository$ActiveOfferGraphQLRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ActiveOfferGraphQLRequest"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ActiveOffersRepository {
    java.lang.Object getActiveOffers(com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.repository.ActiveOffersRepository.ActiveOfferGraphQLRequest activeOfferGraphQLRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError, ? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase.GetActiveOffersUseCase.Response>>> continuation);

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/domain/repository/ActiveOffersRepository$ActiveOfferGraphQLRequest;", "", "Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/activeoffers/navigation/ActiveOffersOrigin;", "origin", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/activeoffers/navigation/ActiveOffersOrigin;)V", "component1", "()Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/activeoffers/navigation/ActiveOffersOrigin;", "copy", "(Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/activeoffers/navigation/ActiveOffersOrigin;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/domain/repository/ActiveOffersRepository$ActiveOfferGraphQLRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/activeoffers/navigation/ActiveOffersOrigin;", "getOrigin"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ActiveOfferGraphQLRequest {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.shoppingrewards.api.rewards.activeoffers.navigation.ActiveOffersOrigin origin;

        public ActiveOfferGraphQLRequest(com.paypal.oslo.feature.shoppingrewards.api.rewards.activeoffers.navigation.ActiveOffersOrigin activeOffersOrigin) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activeOffersOrigin, "");
            this.origin = activeOffersOrigin;
        }

        public final com.paypal.oslo.feature.shoppingrewards.api.rewards.activeoffers.navigation.ActiveOffersOrigin getOrigin() {
            return this.origin;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.shoppingrewards.api.rewards.activeoffers.navigation.ActiveOffersOrigin activeOffersOrigin = this.origin;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ActiveOfferGraphQLRequest(origin=");
            sb.append(activeOffersOrigin);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.origin.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.repository.ActiveOffersRepository.ActiveOfferGraphQLRequest) && this.origin == ((com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.repository.ActiveOffersRepository.ActiveOfferGraphQLRequest) other).origin;
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.repository.ActiveOffersRepository.ActiveOfferGraphQLRequest copy(com.paypal.oslo.feature.shoppingrewards.api.rewards.activeoffers.navigation.ActiveOffersOrigin origin) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(origin, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.repository.ActiveOffersRepository.ActiveOfferGraphQLRequest(origin);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.api.rewards.activeoffers.navigation.ActiveOffersOrigin getOrigin() {
            return this.origin;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.repository.ActiveOffersRepository.ActiveOfferGraphQLRequest copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.repository.ActiveOffersRepository.ActiveOfferGraphQLRequest activeOfferGraphQLRequest, com.paypal.oslo.feature.shoppingrewards.api.rewards.activeoffers.navigation.ActiveOffersOrigin activeOffersOrigin, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activeOffersOrigin = activeOfferGraphQLRequest.origin;
            }
            return activeOfferGraphQLRequest.copy(activeOffersOrigin);
        }
    }
}
