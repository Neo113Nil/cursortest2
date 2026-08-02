package com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/usecase/GetOfferDetailsUseCase;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCase;", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/usecase/GetOfferDetailsUseCase$Request;", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabOfferDetails;", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/repository/ShoppingIABRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/repository/ShoppingIABRepository;)V", "request", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult;", "invoke", "(Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/usecase/GetOfferDetailsUseCase$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/repository/ShoppingIABRepository;", "getHighSpeedVideoSizes", "Request"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GetOfferDetailsUseCase implements com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.GetOfferDetailsUseCase.Request, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails> {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.repository.ShoppingIABRepository getHighSpeedVideoSizes;

    @javax.inject.Inject
    public GetOfferDetailsUseCase(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.repository.ShoppingIABRepository shoppingIABRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shoppingIABRepository, "");
        this.getHighSpeedVideoSizes = shoppingIABRepository;
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.GetOfferDetailsUseCase.Request request, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<? extends com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails>> continuation) {
        return invoke2(request, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails>>) continuation);
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase
    public final /* bridge */ com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails> onDataResultError(com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError dataResultError) {
        return super.onDataResultError(dataResultError);
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase
    public final /* bridge */ <T> com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails> onResponseData(com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<T> dataResult, kotlin.jvm.functions.Function1<? super T, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails> function1) {
        return super.onResponseData(dataResult, function1);
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase
    public final /* bridge */ <T> com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails> toUseCaseResult(arrow.core.Ior<? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError, ? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<T>> ior, kotlin.jvm.functions.Function1<? super T, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails> function1) {
        return super.toUseCaseResult(ior, function1);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke2(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.GetOfferDetailsUseCase.Request request, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails>> continuation) {
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.GetOfferDetailsUseCase$invoke$1 getOfferDetailsUseCase$invoke$1;
        int i;
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.GetOfferDetailsUseCase getOfferDetailsUseCase;
        if (continuation instanceof com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.GetOfferDetailsUseCase$invoke$1) {
            getOfferDetailsUseCase$invoke$1 = (com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.GetOfferDetailsUseCase$invoke$1) continuation;
            if ((getOfferDetailsUseCase$invoke$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                getOfferDetailsUseCase$invoke$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = getOfferDetailsUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getOfferDetailsUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String honeyStoreId = request.getHoneyStoreId();
                    if (honeyStoreId != null && !kotlin.text.StringsKt.isBlank(honeyStoreId)) {
                        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.repository.ShoppingIABRepository shoppingIABRepository = this.getHighSpeedVideoSizes;
                        java.lang.String honeyStoreId2 = request.getHoneyStoreId();
                        getOfferDetailsUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(request);
                        getOfferDetailsUseCase$invoke$1.Camera2StreamConfigurationMap = this;
                        getOfferDetailsUseCase$invoke$1.getHighSpeedVideoFpsRanges = 1;
                        obj = shoppingIABRepository.fetchStoreInfoByHoneyStoreId(honeyStoreId2, getOfferDetailsUseCase$invoke$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        getOfferDetailsUseCase = this;
                    } else {
                        return new com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.MissingFieldError(null, 1, null);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    getOfferDetailsUseCase = (com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.GetOfferDetailsUseCase) getOfferDetailsUseCase$invoke$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return getOfferDetailsUseCase.toUseCaseResult((arrow.core.Ior) obj, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.GetOfferDetailsUseCase$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.GetOfferDetailsUseCase.m19612$r8$lambda$RjFo_o3SfxPgbCIUBcgFMzETc((com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails) obj2);
                    }
                });
            }
        }
        getOfferDetailsUseCase$invoke$1 = new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.GetOfferDetailsUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = getOfferDetailsUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getOfferDetailsUseCase$invoke$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        return getOfferDetailsUseCase.toUseCaseResult((arrow.core.Ior) obj2, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.GetOfferDetailsUseCase$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj22) {
                return com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.GetOfferDetailsUseCase.m19612$r8$lambda$RjFo_o3SfxPgbCIUBcgFMzETc((com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails) obj22);
            }
        });
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/usecase/GetOfferDetailsUseCase$Request;", "", "", "honeyStoreId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/usecase/GetOfferDetailsUseCase$Request;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getHoneyStoreId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Request {
        public static final int $stable = 0;
        private final java.lang.String honeyStoreId;

        public Request(java.lang.String str) {
            this.honeyStoreId = str;
        }

        public /* synthetic */ Request(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public final java.lang.String getHoneyStoreId() {
            return this.honeyStoreId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.honeyStoreId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Request(honeyStoreId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.honeyStoreId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.GetOfferDetailsUseCase.Request) && kotlin.jvm.internal.Intrinsics.areEqual(this.honeyStoreId, ((com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.GetOfferDetailsUseCase.Request) other).honeyStoreId);
        }

        public final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.GetOfferDetailsUseCase.Request copy(java.lang.String honeyStoreId) {
            return new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.GetOfferDetailsUseCase.Request(honeyStoreId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getHoneyStoreId() {
            return this.honeyStoreId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.GetOfferDetailsUseCase.Request copy$default(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.GetOfferDetailsUseCase.Request request, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = request.honeyStoreId;
            }
            return request.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Request() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    /* renamed from: $r8$lambda$RjFo_-o3SfxPgbC-IUBcgFMzETc, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails m19612$r8$lambda$RjFo_o3SfxPgbCIUBcgFMzETc(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails iabOfferDetails) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iabOfferDetails, "");
        return iabOfferDetails;
    }
}
