package com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000f\u0010B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/domain/usecase/GetRewardsLandingUseCase;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCase;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/domain/usecase/GetRewardsLandingUseCase$Request;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/domain/usecase/GetRewardsLandingUseCase$Response;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/domain/repository/RewardsLandingRepository;", "rewardsLandingRepository", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/domain/repository/RewardsLandingRepository;)V", "request", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult;", "invoke", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/domain/usecase/GetRewardsLandingUseCase$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/domain/repository/RewardsLandingRepository;", "getHighSpeedVideoFpsRanges", "Request", "Response"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GetRewardsLandingUseCase implements com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase<com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.usecase.GetRewardsLandingUseCase.Request, com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.usecase.GetRewardsLandingUseCase.Response> {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.repository.RewardsLandingRepository getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public GetRewardsLandingUseCase(com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.repository.RewardsLandingRepository rewardsLandingRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardsLandingRepository, "");
        this.getHighSpeedVideoFpsRanges = rewardsLandingRepository;
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.usecase.GetRewardsLandingUseCase.Request request, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<? extends com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.usecase.GetRewardsLandingUseCase.Response>> continuation) {
        return invoke2(request, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.usecase.GetRewardsLandingUseCase.Response>>) continuation);
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase
    public final /* bridge */ com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.usecase.GetRewardsLandingUseCase.Response> onDataResultError(com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError dataResultError) {
        return super.onDataResultError(dataResultError);
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase
    public final /* bridge */ <T> com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.usecase.GetRewardsLandingUseCase.Response> onResponseData(com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<T> dataResult, kotlin.jvm.functions.Function1<? super T, com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.usecase.GetRewardsLandingUseCase.Response> function1) {
        return super.onResponseData(dataResult, function1);
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase
    public final /* bridge */ <T> com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.usecase.GetRewardsLandingUseCase.Response> toUseCaseResult(arrow.core.Ior<? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError, ? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<T>> ior, kotlin.jvm.functions.Function1<? super T, com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.usecase.GetRewardsLandingUseCase.Response> function1) {
        return super.toUseCaseResult(ior, function1);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke2(com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.usecase.GetRewardsLandingUseCase.Request request, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.usecase.GetRewardsLandingUseCase.Response>> continuation) {
        com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.usecase.GetRewardsLandingUseCase$invoke$1 getRewardsLandingUseCase$invoke$1;
        int i;
        com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.usecase.GetRewardsLandingUseCase getRewardsLandingUseCase;
        if (continuation instanceof com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.usecase.GetRewardsLandingUseCase$invoke$1) {
            getRewardsLandingUseCase$invoke$1 = (com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.usecase.GetRewardsLandingUseCase$invoke$1) continuation;
            if ((getRewardsLandingUseCase$invoke$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                getRewardsLandingUseCase$invoke$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = getRewardsLandingUseCase$invoke$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getRewardsLandingUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.repository.RewardsLandingRepository rewardsLandingRepository = this.getHighSpeedVideoFpsRanges;
                    getRewardsLandingUseCase$invoke$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(request);
                    getRewardsLandingUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = this;
                    getRewardsLandingUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = rewardsLandingRepository.getRewardsLandingData(getRewardsLandingUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    getRewardsLandingUseCase = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    getRewardsLandingUseCase = (com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.usecase.GetRewardsLandingUseCase) getRewardsLandingUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return getRewardsLandingUseCase.toUseCaseResult((arrow.core.Ior) obj, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.usecase.GetRewardsLandingUseCase$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.usecase.GetRewardsLandingUseCase.m19438$r8$lambda$WY96sc0TvWgDIe4QbLPtuX9z2A((com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.models.RewardsLandingData) obj2);
                    }
                });
            }
        }
        getRewardsLandingUseCase$invoke$1 = new com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.usecase.GetRewardsLandingUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = getRewardsLandingUseCase$invoke$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getRewardsLandingUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        return getRewardsLandingUseCase.toUseCaseResult((arrow.core.Ior) obj2, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.usecase.GetRewardsLandingUseCase$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj22) {
                return com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.usecase.GetRewardsLandingUseCase.m19438$r8$lambda$WY96sc0TvWgDIe4QbLPtuX9z2A((com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.models.RewardsLandingData) obj22);
            }
        });
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/domain/usecase/GetRewardsLandingUseCase$Request;", "", "<init>", "()V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Request {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.usecase.GetRewardsLandingUseCase.Request INSTANCE = new com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.usecase.GetRewardsLandingUseCase.Request();

        public final int hashCode() {
            return -982703092;
        }

        private Request() {
        }

        public final java.lang.String toString() {
            return "Request";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.usecase.GetRewardsLandingUseCase.Request)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/domain/usecase/GetRewardsLandingUseCase$Response;", "", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/domain/models/RewardsLandingData;", "rewardsLandingData", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/domain/models/RewardsLandingData;)V", "component1", "()Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/domain/models/RewardsLandingData;", "copy", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/domain/models/RewardsLandingData;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/domain/usecase/GetRewardsLandingUseCase$Response;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/domain/models/RewardsLandingData;", "getRewardsLandingData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Response {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.models.RewardsLandingData rewardsLandingData;

        public Response(com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.models.RewardsLandingData rewardsLandingData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardsLandingData, "");
            this.rewardsLandingData = rewardsLandingData;
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.models.RewardsLandingData getRewardsLandingData() {
            return this.rewardsLandingData;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.models.RewardsLandingData rewardsLandingData = this.rewardsLandingData;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Response(rewardsLandingData=");
            sb.append(rewardsLandingData);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.rewardsLandingData.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.usecase.GetRewardsLandingUseCase.Response) && kotlin.jvm.internal.Intrinsics.areEqual(this.rewardsLandingData, ((com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.usecase.GetRewardsLandingUseCase.Response) other).rewardsLandingData);
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.usecase.GetRewardsLandingUseCase.Response copy(com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.models.RewardsLandingData rewardsLandingData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardsLandingData, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.usecase.GetRewardsLandingUseCase.Response(rewardsLandingData);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.models.RewardsLandingData getRewardsLandingData() {
            return this.rewardsLandingData;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.usecase.GetRewardsLandingUseCase.Response copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.usecase.GetRewardsLandingUseCase.Response response, com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.models.RewardsLandingData rewardsLandingData, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                rewardsLandingData = response.rewardsLandingData;
            }
            return response.copy(rewardsLandingData);
        }
    }

    /* renamed from: $r8$lambda$WY96sc0TvWgDIe4QbLPtuX9z2-A, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.usecase.GetRewardsLandingUseCase.Response m19438$r8$lambda$WY96sc0TvWgDIe4QbLPtuX9z2A(com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.models.RewardsLandingData rewardsLandingData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardsLandingData, "");
        return new com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.usecase.GetRewardsLandingUseCase.Response(rewardsLandingData);
    }
}
