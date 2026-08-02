package com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0010\u0011\u000fB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/usecase/ResolveRedeemEligibilityUseCase;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCase;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/usecase/ResolveRedeemEligibilityUseCase$Request;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/usecase/ResolveRedeemEligibilityUseCase$Response;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/utils/RewardsSummaryFeatureGates$Manager;", "rewardsConfigManager", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/utils/RewardsSummaryFeatureGates$Manager;)V", "request", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult;", "invoke", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/usecase/ResolveRedeemEligibilityUseCase$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/utils/RewardsSummaryFeatureGates$Manager;", "getHighResolutionOutputSizeshNQ4ISI", "Companion", "Request", "Response"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ResolveRedeemEligibilityUseCase implements com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase.Request, com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase.Response> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.utils.RewardsSummaryFeatureGates.Manager getHighResolutionOutputSizeshNQ4ISI;
    private static final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase.Companion Companion = new com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase.Companion(null);
    public static final int $stable = 8;
    private static final java.util.Map<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemType, kotlin.reflect.KFunction<java.lang.Boolean>> getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemType.REDEEM_TO_BALANCE, com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase$Companion$redeemFeatureGateMapping$1.Camera2StreamConfigurationMap), kotlin.TuplesKt.to(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemType.REDEEM_TO_SAVINGS, com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase$Companion$redeemFeatureGateMapping$2.getHighSpeedVideoFpsRanges), kotlin.TuplesKt.to(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemType.REDEEM_TO_GIVING, com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase$Companion$redeemFeatureGateMapping$3.getHighResolutionOutputSizeshNQ4ISI));

    @javax.inject.Inject
    public ResolveRedeemEligibilityUseCase(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.utils.RewardsSummaryFeatureGates.Manager manager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manager, "");
        this.getHighResolutionOutputSizeshNQ4ISI = manager;
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase.Request request, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<? extends com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase.Response>> continuation) {
        return invoke2(request, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase.Response>>) continuation);
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase
    public final /* bridge */ com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase.Response> onDataResultError(com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError dataResultError) {
        return super.onDataResultError(dataResultError);
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase
    public final /* bridge */ <T> com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase.Response> onResponseData(com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<T> dataResult, kotlin.jvm.functions.Function1<? super T, com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase.Response> function1) {
        return super.onResponseData(dataResult, function1);
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase
    public final /* bridge */ <T> com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase.Response> toUseCaseResult(arrow.core.Ior<? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError, ? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<T>> ior, kotlin.jvm.functions.Function1<? super T, com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase.Response> function1) {
        return super.toUseCaseResult(ior, function1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase.Request request, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase.Response>> continuation) {
        return new com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Success(null, new com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase.Response(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase.Companion.getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase.Companion.Camera2StreamConfigurationMap(request.getRedeemMethodsEligibility(), this.getHighResolutionOutputSizeshNQ4ISI), request.getRedeemDataItems())), 1, null);
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ0\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001a\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/usecase/ResolveRedeemEligibilityUseCase$Request;", "", "", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/RedeemContent$RedeemEligibility;", "redeemMethodsEligibility", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/RedeemContent$RedeemMethodData;", "redeemDataItems", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/usecase/ResolveRedeemEligibilityUseCase$Request;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getRedeemMethodsEligibility", "getRedeemDataItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Request {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemMethodData> redeemDataItems;
        private final java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemEligibility> redeemMethodsEligibility;

        public Request(java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemEligibility> list, java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemMethodData> list2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            this.redeemMethodsEligibility = list;
            this.redeemDataItems = list2;
        }

        public final java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemEligibility> getRedeemMethodsEligibility() {
            return this.redeemMethodsEligibility;
        }

        public final java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemMethodData> getRedeemDataItems() {
            return this.redeemDataItems;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemEligibility> list = this.redeemMethodsEligibility;
            java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemMethodData> list2 = this.redeemDataItems;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Request(redeemMethodsEligibility=");
            sb.append(list);
            sb.append(", redeemDataItems=");
            sb.append(list2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.redeemMethodsEligibility.hashCode() * 31) + this.redeemDataItems.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase.Request)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase.Request request = (com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase.Request) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.redeemMethodsEligibility, request.redeemMethodsEligibility) && kotlin.jvm.internal.Intrinsics.areEqual(this.redeemDataItems, request.redeemDataItems);
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase.Request copy(java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemEligibility> redeemMethodsEligibility, java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemMethodData> redeemDataItems) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemMethodsEligibility, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemDataItems, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase.Request(redeemMethodsEligibility, redeemDataItems);
        }

        public final java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemMethodData> component2() {
            return this.redeemDataItems;
        }

        public final java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemEligibility> component1() {
            return this.redeemMethodsEligibility;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase.Request copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase.Request request, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = request.redeemMethodsEligibility;
            }
            if ((i & 2) != 0) {
                list2 = request.redeemDataItems;
            }
            return request.copy(list, list2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/usecase/ResolveRedeemEligibilityUseCase$Response;", "", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/RedeemContent;", "redeemContent", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/RedeemContent;)V", "component1", "()Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/RedeemContent;", "copy", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/RedeemContent;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/usecase/ResolveRedeemEligibilityUseCase$Response;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/RedeemContent;", "getRedeemContent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Response {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent redeemContent;

        public Response(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent redeemContent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemContent, "");
            this.redeemContent = redeemContent;
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent getRedeemContent() {
            return this.redeemContent;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent redeemContent = this.redeemContent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Response(redeemContent=");
            sb.append(redeemContent);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.redeemContent.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase.Response) && kotlin.jvm.internal.Intrinsics.areEqual(this.redeemContent, ((com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase.Response) other).redeemContent);
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase.Response copy(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent redeemContent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemContent, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase.Response(redeemContent);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent getRedeemContent() {
            return this.redeemContent;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase.Response copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase.Response response, com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent redeemContent, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                redeemContent = response.redeemContent;
            }
            return response.copy(redeemContent);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R,\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/usecase/ResolveRedeemEligibilityUseCase$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/RedeemContent$RedeemType;", "Lkotlin/reflect/KFunction1;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/utils/RewardsSummaryFeatureGates$Manager;", "", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/Map;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public static final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent getHighSpeedVideoFpsRanges(java.util.List list, java.util.List list2) {
            java.util.List list3 = list;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10)), 16));
            for (java.lang.Object obj : list3) {
                linkedHashMap.put(((com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemEligibility) obj).getRedeemType(), obj);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemMethodData redeemMethodData = (com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemMethodData) it.next();
                com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemEligibility redeemEligibility = (com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemEligibility) linkedHashMap.get(redeemMethodData.getRedeemType());
                com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemMethod redeemMethod = null;
                if (redeemEligibility != null) {
                    if (!redeemEligibility.isEligible()) {
                        redeemEligibility = null;
                    }
                    if (redeemEligibility != null) {
                        redeemMethod = com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.DomainModelsKt.getRedeemMethod(redeemMethodData);
                    }
                }
                if (redeemMethod != null) {
                    arrayList.add(redeemMethod);
                }
            }
            return new com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent(arrayList);
        }

        public static final /* synthetic */ java.util.List Camera2StreamConfigurationMap(java.util.List list, com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.utils.RewardsSummaryFeatureGates.Manager manager) {
            java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemEligibility> list2 = list;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemEligibility redeemEligibility : list2) {
                kotlin.reflect.KFunction kFunction = (kotlin.reflect.KFunction) com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase.getHighResolutionOutputSizeshNQ4ISI.get(redeemEligibility.getRedeemType());
                if (kFunction != null) {
                    com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemEligibility copy$default = com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemEligibility.copy$default(redeemEligibility, null, ((java.lang.Boolean) ((kotlin.jvm.functions.Function1) kFunction).invoke(manager)).booleanValue() && redeemEligibility.isEligible(), 1, null);
                    if (copy$default != null) {
                        redeemEligibility = copy$default;
                    }
                }
                arrayList.add(redeemEligibility);
            }
            return arrayList;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
