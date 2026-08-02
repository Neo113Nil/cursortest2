package com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.repository;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\nJ*\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\b\u0010\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/domain/repository/CategorySelectionRepository;", "", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/domain/repository/CategorySelectionRepository$CategorySelectionGraphQLRequest;", "input", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResultError;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResult;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/domain/models/CategorySelectionResponse;", "getSelectionCategories", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/domain/repository/CategorySelectionRepository$CategorySelectionGraphQLRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "CategorySelectionGraphQLRequest"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface CategorySelectionRepository {
    java.lang.Object getSelectionCategories(com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.repository.CategorySelectionRepository.CategorySelectionGraphQLRequest categorySelectionGraphQLRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError, ? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.CategorySelectionResponse>>> continuation);

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/domain/repository/CategorySelectionRepository$CategorySelectionGraphQLRequest;", "", "<init>", "()V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CategorySelectionGraphQLRequest {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.repository.CategorySelectionRepository.CategorySelectionGraphQLRequest INSTANCE = new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.repository.CategorySelectionRepository.CategorySelectionGraphQLRequest();

        public final int hashCode() {
            return -1730781449;
        }

        private CategorySelectionGraphQLRequest() {
        }

        public final java.lang.String toString() {
            return "CategorySelectionGraphQLRequest";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.repository.CategorySelectionRepository.CategorySelectionGraphQLRequest)) {
                return false;
            }
            return true;
        }
    }
}
