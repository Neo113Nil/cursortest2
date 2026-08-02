package com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000f\u0010B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/domain/usecase/ActivateOfferUseCase;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCase;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/domain/usecase/ActivateOfferUseCase$Request;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/domain/usecase/ActivateOfferUseCase$Response;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/domain/repository/OffersRepository;", "offersRepository", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/domain/repository/OffersRepository;)V", "request", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult;", "invoke", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/domain/usecase/ActivateOfferUseCase$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/domain/repository/OffersRepository;", "getHighSpeedVideoFpsRangesFor", "Request", "Response"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ActivateOfferUseCase implements com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase<com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.ActivateOfferUseCase.Request, com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.ActivateOfferUseCase.Response> {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.repository.OffersRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public ActivateOfferUseCase(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.repository.OffersRepository offersRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offersRepository, "");
        this.getHighSpeedVideoFpsRangesFor = offersRepository;
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.ActivateOfferUseCase.Request request, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<? extends com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.ActivateOfferUseCase.Response>> continuation) {
        return invoke2(request, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.ActivateOfferUseCase.Response>>) continuation);
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase
    public final /* bridge */ com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.ActivateOfferUseCase.Response> onDataResultError(com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError dataResultError) {
        return super.onDataResultError(dataResultError);
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase
    public final /* bridge */ <T> com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.ActivateOfferUseCase.Response> onResponseData(com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<T> dataResult, kotlin.jvm.functions.Function1<? super T, com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.ActivateOfferUseCase.Response> function1) {
        return super.onResponseData(dataResult, function1);
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase
    public final /* bridge */ <T> com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.ActivateOfferUseCase.Response> toUseCaseResult(arrow.core.Ior<? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError, ? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<T>> ior, kotlin.jvm.functions.Function1<? super T, com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.ActivateOfferUseCase.Response> function1) {
        return super.toUseCaseResult(ior, function1);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke2(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.ActivateOfferUseCase.Request request, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.ActivateOfferUseCase.Response>> continuation) {
        com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.ActivateOfferUseCase$invoke$1 activateOfferUseCase$invoke$1;
        int i;
        com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.ActivateOfferUseCase activateOfferUseCase;
        if (continuation instanceof com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.ActivateOfferUseCase$invoke$1) {
            activateOfferUseCase$invoke$1 = (com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.ActivateOfferUseCase$invoke$1) continuation;
            if ((activateOfferUseCase$invoke$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                activateOfferUseCase$invoke$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = activateOfferUseCase$invoke$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = activateOfferUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.repository.OffersRepository offersRepository = this.getHighSpeedVideoFpsRangesFor;
                    java.lang.String offerId = request.getOfferId();
                    activateOfferUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(request);
                    activateOfferUseCase$invoke$1.getHighSpeedVideoSizes = this;
                    activateOfferUseCase$invoke$1.getHighSpeedVideoFpsRanges = 1;
                    obj = offersRepository.activateOffer(offerId, activateOfferUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    activateOfferUseCase = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    activateOfferUseCase = (com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.ActivateOfferUseCase) activateOfferUseCase$invoke$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return activateOfferUseCase.toUseCaseResult((arrow.core.Ior) obj, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.ActivateOfferUseCase$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.ActivateOfferUseCase.$r8$lambda$0EHDbk3RXuflHTYj6cyKhrvCnq8((com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.ActivateOfferUseCase.Response) obj2);
                    }
                });
            }
        }
        activateOfferUseCase$invoke$1 = new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.ActivateOfferUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = activateOfferUseCase$invoke$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = activateOfferUseCase$invoke$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        return activateOfferUseCase.toUseCaseResult((arrow.core.Ior) obj2, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.ActivateOfferUseCase$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj22) {
                return com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.ActivateOfferUseCase.$r8$lambda$0EHDbk3RXuflHTYj6cyKhrvCnq8((com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.ActivateOfferUseCase.Response) obj22);
            }
        });
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/domain/usecase/ActivateOfferUseCase$Request;", "", "", "offerId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/domain/usecase/ActivateOfferUseCase$Request;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getOfferId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Request {
        public static final int $stable = 0;
        private final java.lang.String offerId;

        public Request(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.offerId = str;
        }

        public final java.lang.String getOfferId() {
            return this.offerId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.offerId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Request(offerId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.offerId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.ActivateOfferUseCase.Request) && kotlin.jvm.internal.Intrinsics.areEqual(this.offerId, ((com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.ActivateOfferUseCase.Request) other).offerId);
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.ActivateOfferUseCase.Request copy(java.lang.String offerId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerId, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.ActivateOfferUseCase.Request(offerId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getOfferId() {
            return this.offerId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.ActivateOfferUseCase.Request copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.ActivateOfferUseCase.Request request, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = request.offerId;
            }
            return request.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/domain/usecase/ActivateOfferUseCase$Response;", "", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/domain/models/OfferDetails;", "offerDetails", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/domain/models/OfferDetails;)V", "component1", "()Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/domain/models/OfferDetails;", "copy", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/domain/models/OfferDetails;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/domain/usecase/ActivateOfferUseCase$Response;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/domain/models/OfferDetails;", "getOfferDetails"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Response {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.OfferDetails offerDetails;

        public Response(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.OfferDetails offerDetails) {
            this.offerDetails = offerDetails;
        }

        public /* synthetic */ Response(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.OfferDetails offerDetails, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : offerDetails);
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.OfferDetails getOfferDetails() {
            return this.offerDetails;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.OfferDetails offerDetails = this.offerDetails;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Response(offerDetails=");
            sb.append(offerDetails);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.OfferDetails offerDetails = this.offerDetails;
            if (offerDetails == null) {
                return 0;
            }
            return offerDetails.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.ActivateOfferUseCase.Response) && kotlin.jvm.internal.Intrinsics.areEqual(this.offerDetails, ((com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.ActivateOfferUseCase.Response) other).offerDetails);
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.ActivateOfferUseCase.Response copy(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.OfferDetails offerDetails) {
            return new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.ActivateOfferUseCase.Response(offerDetails);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.OfferDetails getOfferDetails() {
            return this.offerDetails;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.ActivateOfferUseCase.Response copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.ActivateOfferUseCase.Response response, com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.OfferDetails offerDetails, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                offerDetails = response.offerDetails;
            }
            return response.copy(offerDetails);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Response() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.ActivateOfferUseCase.Response $r8$lambda$0EHDbk3RXuflHTYj6cyKhrvCnq8(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.ActivateOfferUseCase.Response response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        return response;
    }
}
