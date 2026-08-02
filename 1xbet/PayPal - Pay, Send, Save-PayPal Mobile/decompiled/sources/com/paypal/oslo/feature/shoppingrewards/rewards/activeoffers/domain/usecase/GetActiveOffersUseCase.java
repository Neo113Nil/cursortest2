package com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000f\u0010B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/domain/usecase/GetActiveOffersUseCase;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCase;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/domain/usecase/GetActiveOffersUseCase$Request;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/domain/usecase/GetActiveOffersUseCase$Response;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/domain/repository/ActiveOffersRepository;", "activeOfferRepository", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/domain/repository/ActiveOffersRepository;)V", "request", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult;", "invoke", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/domain/usecase/GetActiveOffersUseCase$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/domain/repository/ActiveOffersRepository;", "getHighSpeedVideoSizes", "Request", "Response"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GetActiveOffersUseCase implements com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase<com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase.GetActiveOffersUseCase.Request, com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase.GetActiveOffersUseCase.Response> {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.repository.ActiveOffersRepository getHighSpeedVideoSizes;

    @javax.inject.Inject
    public GetActiveOffersUseCase(com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.repository.ActiveOffersRepository activeOffersRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activeOffersRepository, "");
        this.getHighSpeedVideoSizes = activeOffersRepository;
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase.GetActiveOffersUseCase.Request request, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<? extends com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase.GetActiveOffersUseCase.Response>> continuation) {
        return invoke2(request, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase.GetActiveOffersUseCase.Response>>) continuation);
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase
    public final /* bridge */ com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase.GetActiveOffersUseCase.Response> onDataResultError(com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError dataResultError) {
        return super.onDataResultError(dataResultError);
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase
    public final /* bridge */ <T> com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase.GetActiveOffersUseCase.Response> onResponseData(com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<T> dataResult, kotlin.jvm.functions.Function1<? super T, com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase.GetActiveOffersUseCase.Response> function1) {
        return super.onResponseData(dataResult, function1);
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase
    public final /* bridge */ <T> com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase.GetActiveOffersUseCase.Response> toUseCaseResult(arrow.core.Ior<? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError, ? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<T>> ior, kotlin.jvm.functions.Function1<? super T, com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase.GetActiveOffersUseCase.Response> function1) {
        return super.toUseCaseResult(ior, function1);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke2(com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase.GetActiveOffersUseCase.Request request, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase.GetActiveOffersUseCase.Response>> continuation) {
        com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase.GetActiveOffersUseCase$invoke$1 getActiveOffersUseCase$invoke$1;
        int i;
        com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase.GetActiveOffersUseCase getActiveOffersUseCase;
        if (continuation instanceof com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase.GetActiveOffersUseCase$invoke$1) {
            getActiveOffersUseCase$invoke$1 = (com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase.GetActiveOffersUseCase$invoke$1) continuation;
            if ((getActiveOffersUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                getActiveOffersUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = getActiveOffersUseCase$invoke$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getActiveOffersUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.repository.ActiveOffersRepository activeOffersRepository = this.getHighSpeedVideoSizes;
                    com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.repository.ActiveOffersRepository.ActiveOfferGraphQLRequest activeOfferGraphQLRequest = new com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.repository.ActiveOffersRepository.ActiveOfferGraphQLRequest(request.getOrigin());
                    getActiveOffersUseCase$invoke$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(request);
                    getActiveOffersUseCase$invoke$1.getHighSpeedVideoFpsRanges = this;
                    getActiveOffersUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = activeOffersRepository.getActiveOffers(activeOfferGraphQLRequest, getActiveOffersUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    getActiveOffersUseCase = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    getActiveOffersUseCase = (com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase.GetActiveOffersUseCase) getActiveOffersUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return getActiveOffersUseCase.toUseCaseResult((arrow.core.Ior) obj, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase.GetActiveOffersUseCase$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase.GetActiveOffersUseCase.$r8$lambda$JL8wVQN7IbV1D_20Z14xc1xDteQ((com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase.GetActiveOffersUseCase.Response) obj2);
                    }
                });
            }
        }
        getActiveOffersUseCase$invoke$1 = new com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase.GetActiveOffersUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = getActiveOffersUseCase$invoke$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getActiveOffersUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        return getActiveOffersUseCase.toUseCaseResult((arrow.core.Ior) obj2, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase.GetActiveOffersUseCase$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj22) {
                return com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase.GetActiveOffersUseCase.$r8$lambda$JL8wVQN7IbV1D_20Z14xc1xDteQ((com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase.GetActiveOffersUseCase.Response) obj22);
            }
        });
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/domain/usecase/GetActiveOffersUseCase$Request;", "", "Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/activeoffers/navigation/ActiveOffersOrigin;", "origin", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/activeoffers/navigation/ActiveOffersOrigin;)V", "component1", "()Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/activeoffers/navigation/ActiveOffersOrigin;", "copy", "(Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/activeoffers/navigation/ActiveOffersOrigin;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/domain/usecase/GetActiveOffersUseCase$Request;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/activeoffers/navigation/ActiveOffersOrigin;", "getOrigin"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Request {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.shoppingrewards.api.rewards.activeoffers.navigation.ActiveOffersOrigin origin;

        public Request(com.paypal.oslo.feature.shoppingrewards.api.rewards.activeoffers.navigation.ActiveOffersOrigin activeOffersOrigin) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activeOffersOrigin, "");
            this.origin = activeOffersOrigin;
        }

        public final com.paypal.oslo.feature.shoppingrewards.api.rewards.activeoffers.navigation.ActiveOffersOrigin getOrigin() {
            return this.origin;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.shoppingrewards.api.rewards.activeoffers.navigation.ActiveOffersOrigin activeOffersOrigin = this.origin;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Request(origin=");
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
            return (other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase.GetActiveOffersUseCase.Request) && this.origin == ((com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase.GetActiveOffersUseCase.Request) other).origin;
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase.GetActiveOffersUseCase.Request copy(com.paypal.oslo.feature.shoppingrewards.api.rewards.activeoffers.navigation.ActiveOffersOrigin origin) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(origin, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase.GetActiveOffersUseCase.Request(origin);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.api.rewards.activeoffers.navigation.ActiveOffersOrigin getOrigin() {
            return this.origin;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase.GetActiveOffersUseCase.Request copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase.GetActiveOffersUseCase.Request request, com.paypal.oslo.feature.shoppingrewards.api.rewards.activeoffers.navigation.ActiveOffersOrigin activeOffersOrigin, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activeOffersOrigin = request.origin;
            }
            return request.copy(activeOffersOrigin);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/domain/usecase/GetActiveOffersUseCase$Response;", "", "", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/domain/models/ActiveOfferData;", "activeOffers", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/domain/usecase/GetActiveOffersUseCase$Response;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getActiveOffers"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Response {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.models.ActiveOfferData> activeOffers;

        public Response(java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.models.ActiveOfferData> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.activeOffers = list;
        }

        public final java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.models.ActiveOfferData> getActiveOffers() {
            return this.activeOffers;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.models.ActiveOfferData> list = this.activeOffers;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Response(activeOffers=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.activeOffers.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase.GetActiveOffersUseCase.Response) && kotlin.jvm.internal.Intrinsics.areEqual(this.activeOffers, ((com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase.GetActiveOffersUseCase.Response) other).activeOffers);
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase.GetActiveOffersUseCase.Response copy(java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.models.ActiveOfferData> activeOffers) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activeOffers, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase.GetActiveOffersUseCase.Response(activeOffers);
        }

        public final java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.models.ActiveOfferData> component1() {
            return this.activeOffers;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase.GetActiveOffersUseCase.Response copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase.GetActiveOffersUseCase.Response response, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = response.activeOffers;
            }
            return response.copy(list);
        }
    }

    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase.GetActiveOffersUseCase.Response $r8$lambda$JL8wVQN7IbV1D_20Z14xc1xDteQ(com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase.GetActiveOffersUseCase.Response response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        return response;
    }
}
