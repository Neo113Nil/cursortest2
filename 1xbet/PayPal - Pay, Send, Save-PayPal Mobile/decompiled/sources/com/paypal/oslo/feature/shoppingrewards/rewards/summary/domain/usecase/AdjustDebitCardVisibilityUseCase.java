package com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000e\u000fB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/usecase/AdjustDebitCardVisibilityUseCase;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCase;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/usecase/AdjustDebitCardVisibilityUseCase$Request;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/usecase/AdjustDebitCardVisibilityUseCase$Response;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/utils/RewardsSummaryFeatureGates$Manager;", "rewardsConfigManager", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/utils/RewardsSummaryFeatureGates$Manager;)V", "request", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult;", "invoke", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/usecase/AdjustDebitCardVisibilityUseCase$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/utils/RewardsSummaryFeatureGates$Manager;", "Request", "Response"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AdjustDebitCardVisibilityUseCase implements com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.AdjustDebitCardVisibilityUseCase.Request, com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.AdjustDebitCardVisibilityUseCase.Response> {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.utils.RewardsSummaryFeatureGates.Manager Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public AdjustDebitCardVisibilityUseCase(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.utils.RewardsSummaryFeatureGates.Manager manager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manager, "");
        this.Camera2StreamConfigurationMap = manager;
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.AdjustDebitCardVisibilityUseCase.Request request, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<? extends com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.AdjustDebitCardVisibilityUseCase.Response>> continuation) {
        return invoke2(request, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.AdjustDebitCardVisibilityUseCase.Response>>) continuation);
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase
    public final /* bridge */ com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.AdjustDebitCardVisibilityUseCase.Response> onDataResultError(com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError dataResultError) {
        return super.onDataResultError(dataResultError);
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase
    public final /* bridge */ <T> com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.AdjustDebitCardVisibilityUseCase.Response> onResponseData(com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<T> dataResult, kotlin.jvm.functions.Function1<? super T, com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.AdjustDebitCardVisibilityUseCase.Response> function1) {
        return super.onResponseData(dataResult, function1);
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase
    public final /* bridge */ <T> com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.AdjustDebitCardVisibilityUseCase.Response> toUseCaseResult(arrow.core.Ior<? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError, ? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<T>> ior, kotlin.jvm.functions.Function1<? super T, com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.AdjustDebitCardVisibilityUseCase.Response> function1) {
        return super.toUseCaseResult(ior, function1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.AdjustDebitCardVisibilityUseCase.Request request, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.AdjustDebitCardVisibilityUseCase.Response>> continuation) {
        com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.EarnContent copy$default;
        if (request.getEarnContent().isPpdcEligible() && this.Camera2StreamConfigurationMap.isCategorySelectionEnabled()) {
            copy$default = request.getEarnContent();
        } else {
            copy$default = com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.EarnContent.copy$default(request.getEarnContent(), null, null, null, false, null, 15, null);
        }
        return new com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Success(null, new com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.AdjustDebitCardVisibilityUseCase.Response(copy$default), 1, null);
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/usecase/AdjustDebitCardVisibilityUseCase$Request;", "", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/EarnContent;", "earnContent", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/EarnContent;)V", "component1", "()Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/EarnContent;", "copy", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/EarnContent;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/usecase/AdjustDebitCardVisibilityUseCase$Request;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/EarnContent;", "getEarnContent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Request {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.EarnContent earnContent;

        public Request(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.EarnContent earnContent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(earnContent, "");
            this.earnContent = earnContent;
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.EarnContent getEarnContent() {
            return this.earnContent;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.EarnContent earnContent = this.earnContent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Request(earnContent=");
            sb.append(earnContent);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.earnContent.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.AdjustDebitCardVisibilityUseCase.Request) && kotlin.jvm.internal.Intrinsics.areEqual(this.earnContent, ((com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.AdjustDebitCardVisibilityUseCase.Request) other).earnContent);
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.AdjustDebitCardVisibilityUseCase.Request copy(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.EarnContent earnContent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(earnContent, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.AdjustDebitCardVisibilityUseCase.Request(earnContent);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.EarnContent getEarnContent() {
            return this.earnContent;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.AdjustDebitCardVisibilityUseCase.Request copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.AdjustDebitCardVisibilityUseCase.Request request, com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.EarnContent earnContent, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                earnContent = request.earnContent;
            }
            return request.copy(earnContent);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/usecase/AdjustDebitCardVisibilityUseCase$Response;", "", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/EarnContent;", "earnContent", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/EarnContent;)V", "component1", "()Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/EarnContent;", "copy", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/EarnContent;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/usecase/AdjustDebitCardVisibilityUseCase$Response;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/EarnContent;", "getEarnContent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Response {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.EarnContent earnContent;

        public Response(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.EarnContent earnContent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(earnContent, "");
            this.earnContent = earnContent;
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.EarnContent getEarnContent() {
            return this.earnContent;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.EarnContent earnContent = this.earnContent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Response(earnContent=");
            sb.append(earnContent);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.earnContent.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.AdjustDebitCardVisibilityUseCase.Response) && kotlin.jvm.internal.Intrinsics.areEqual(this.earnContent, ((com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.AdjustDebitCardVisibilityUseCase.Response) other).earnContent);
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.AdjustDebitCardVisibilityUseCase.Response copy(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.EarnContent earnContent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(earnContent, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.AdjustDebitCardVisibilityUseCase.Response(earnContent);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.EarnContent getEarnContent() {
            return this.earnContent;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.AdjustDebitCardVisibilityUseCase.Response copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.AdjustDebitCardVisibilityUseCase.Response response, com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.EarnContent earnContent, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                earnContent = response.earnContent;
            }
            return response.copy(earnContent);
        }
    }
}
