package com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/usecase/EnrollInOfferUseCase;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCase;", "", "", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/repository/ShoppingIABRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/repository/ShoppingIABRepository;)V", "request", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult;", "invoke", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/repository/ShoppingIABRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class EnrollInOfferUseCase implements com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase<java.lang.String, kotlin.Unit> {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.repository.ShoppingIABRepository getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public EnrollInOfferUseCase(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.repository.ShoppingIABRepository shoppingIABRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shoppingIABRepository, "");
        this.getHighResolutionOutputSizeshNQ4ISI = shoppingIABRepository;
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<? extends kotlin.Unit>> continuation) {
        return invoke2(str, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<kotlin.Unit>>) continuation);
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase
    public final /* bridge */ com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<kotlin.Unit> onDataResultError(com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError dataResultError) {
        return super.onDataResultError(dataResultError);
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase
    public final /* bridge */ <T> com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<kotlin.Unit> onResponseData(com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<T> dataResult, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        return super.onResponseData(dataResult, function1);
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase
    public final /* bridge */ <T> com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<kotlin.Unit> toUseCaseResult(arrow.core.Ior<? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError, ? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<T>> ior, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        return super.toUseCaseResult(ior, function1);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke2(java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.EnrollInOfferUseCase$invoke$1 enrollInOfferUseCase$invoke$1;
        int i;
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.EnrollInOfferUseCase enrollInOfferUseCase;
        if (continuation instanceof com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.EnrollInOfferUseCase$invoke$1) {
            enrollInOfferUseCase$invoke$1 = (com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.EnrollInOfferUseCase$invoke$1) continuation;
            if ((enrollInOfferUseCase$invoke$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                enrollInOfferUseCase$invoke$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = enrollInOfferUseCase$invoke$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = enrollInOfferUseCase$invoke$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.repository.ShoppingIABRepository shoppingIABRepository = this.getHighResolutionOutputSizeshNQ4ISI;
                    enrollInOfferUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    enrollInOfferUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = this;
                    enrollInOfferUseCase$invoke$1.Camera2StreamConfigurationMap = 1;
                    obj = shoppingIABRepository.enrollInOffer(str, enrollInOfferUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    enrollInOfferUseCase = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    enrollInOfferUseCase = (com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.EnrollInOfferUseCase) enrollInOfferUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return enrollInOfferUseCase.toUseCaseResult((arrow.core.Ior) obj, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.EnrollInOfferUseCase$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.EnrollInOfferUseCase.$r8$lambda$IkqFoBaNLVmDJrVInGDbr6GaxC8((kotlin.Unit) obj2);
                    }
                });
            }
        }
        enrollInOfferUseCase$invoke$1 = new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.EnrollInOfferUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = enrollInOfferUseCase$invoke$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = enrollInOfferUseCase$invoke$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        return enrollInOfferUseCase.toUseCaseResult((arrow.core.Ior) obj2, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.EnrollInOfferUseCase$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj22) {
                return com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.EnrollInOfferUseCase.$r8$lambda$IkqFoBaNLVmDJrVInGDbr6GaxC8((kotlin.Unit) obj22);
            }
        });
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IkqFoBaNLVmDJrVInGDbr6GaxC8(kotlin.Unit unit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "");
        return kotlin.Unit.INSTANCE;
    }
}
