package com.ingo.sdk.kotlin.common.features.customer;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\t\u0010\nR\u0015\u0010\u000e\u001a\u00020\u000b8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/customer/GetCustomerUseCase;", "Lcom/ingo/sdk/kotlin/common/core/interactor/SdkUseCase;", "Lcom/ingo/sdk/kotlin/common/features/customer/model/CustomerResponse;", "Lcom/ingo/sdk/kotlin/common/core/interactor/UseCase$None;", "<init>", "()V", "params", "Lcom/ingo/sdk/kotlin/common/core/functional/Either;", "Lcom/ingo/sdk/kotlin/common/core/exception/Failure;", "run", "(Lcom/ingo/sdk/kotlin/common/core/interactor/UseCase$None;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ingo/sdk/kotlin/common/features/customer/CustomerRepository;", "getHighSpeedVideoFpsRanges", "Lkotlin/Lazy;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class GetCustomerUseCase extends com.ingo.sdk.kotlin.common.core.interactor.SdkUseCase<com.ingo.sdk.kotlin.common.features.customer.model.CustomerResponse, com.ingo.sdk.kotlin.common.core.interactor.UseCase.None> {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoSizes;

    public GetCustomerUseCase() {
        super(0L, 1, null);
        this.getHighSpeedVideoSizes = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.kotlin.common.features.customer.GetCustomerUseCase$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.ingo.sdk.kotlin.common.features.customer.GetCustomerUseCase.$r8$lambda$W8nBwJSN4TPfrCdn_vxv3iL3r9g();
            }
        });
    }

    @Override // com.ingo.sdk.kotlin.common.core.interactor.UseCase
    public final /* bridge */ /* synthetic */ java.lang.Object run(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return run((com.ingo.sdk.kotlin.common.core.interactor.UseCase.None) obj, (kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.core.functional.Either<? extends com.ingo.sdk.kotlin.common.core.exception.Failure, com.ingo.sdk.kotlin.common.features.customer.model.CustomerResponse>>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object run(com.ingo.sdk.kotlin.common.core.interactor.UseCase.None none, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.core.functional.Either<? extends com.ingo.sdk.kotlin.common.core.exception.Failure, com.ingo.sdk.kotlin.common.features.customer.model.CustomerResponse>> continuation) {
        com.ingo.sdk.kotlin.common.features.customer.GetCustomerUseCase$run$1 getCustomerUseCase$run$1;
        int i;
        if (continuation instanceof com.ingo.sdk.kotlin.common.features.customer.GetCustomerUseCase$run$1) {
            getCustomerUseCase$run$1 = (com.ingo.sdk.kotlin.common.features.customer.GetCustomerUseCase$run$1) continuation;
            if ((getCustomerUseCase$run$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                getCustomerUseCase$run$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = getCustomerUseCase$run$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getCustomerUseCase$run$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.ingo.sdk.kotlin.common.features.customer.CustomerRepository customerRepository = (com.ingo.sdk.kotlin.common.features.customer.CustomerRepository) this.getHighSpeedVideoSizes.getValue();
                    getCustomerUseCase$run$1.getHighSpeedVideoFpsRanges = 1;
                    obj = customerRepository.getCustomer(getCustomerUseCase$run$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.ingo.sdk.kotlin.common.core.functional.Either either = (com.ingo.sdk.kotlin.common.core.functional.Either) obj;
                either.foldNothing(new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.kotlin.common.features.customer.GetCustomerUseCase$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.ingo.sdk.kotlin.common.features.customer.GetCustomerUseCase.m10772$r8$lambda$VFcfwmjKXxpnx4_XS6UZfgYPiE((com.ingo.sdk.kotlin.common.core.exception.Failure) obj2);
                    }
                }, new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.kotlin.common.features.customer.GetCustomerUseCase$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.ingo.sdk.kotlin.common.features.customer.GetCustomerUseCase.$r8$lambda$d_X_xl_rNBYyhX4Y6k0RNNUawq8((com.ingo.sdk.kotlin.common.features.customer.model.CustomerResponse) obj2);
                    }
                });
                return either;
            }
        }
        getCustomerUseCase$run$1 = new com.ingo.sdk.kotlin.common.features.customer.GetCustomerUseCase$run$1(this, continuation);
        java.lang.Object obj2 = getCustomerUseCase$run$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getCustomerUseCase$run$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        com.ingo.sdk.kotlin.common.core.functional.Either either2 = (com.ingo.sdk.kotlin.common.core.functional.Either) obj2;
        either2.foldNothing(new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.kotlin.common.features.customer.GetCustomerUseCase$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj22) {
                return com.ingo.sdk.kotlin.common.features.customer.GetCustomerUseCase.m10772$r8$lambda$VFcfwmjKXxpnx4_XS6UZfgYPiE((com.ingo.sdk.kotlin.common.core.exception.Failure) obj22);
            }
        }, new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.kotlin.common.features.customer.GetCustomerUseCase$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj22) {
                return com.ingo.sdk.kotlin.common.features.customer.GetCustomerUseCase.$r8$lambda$d_X_xl_rNBYyhX4Y6k0RNNUawq8((com.ingo.sdk.kotlin.common.features.customer.model.CustomerResponse) obj22);
            }
        });
        return either2;
    }

    /* renamed from: $r8$lambda$VFcfwm-jKXxpnx4_XS6UZfgYPiE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10772$r8$lambda$VFcfwmjKXxpnx4_XS6UZfgYPiE(com.ingo.sdk.kotlin.common.core.exception.Failure failure) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failure, "");
        com.ingo.sdk.kotlin.common.core.logging.IngoLogger ingoLogging = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging();
        java.lang.String getHighSpeedVideoFpsRangesFor = failure.getGetHighSpeedVideoFpsRangesFor();
        if (getHighSpeedVideoFpsRangesFor == null) {
            getHighSpeedVideoFpsRangesFor = "";
        }
        com.ingo.sdk.kotlin.common.core.logging.IngoLogger.e$default(ingoLogging, getHighSpeedVideoFpsRangesFor, null, failure instanceof com.ingo.sdk.kotlin.common.core.exception.ThrowableFailure ? ((com.ingo.sdk.kotlin.common.core.exception.ThrowableFailure) failure).getThrowable() : null, 2, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.ingo.sdk.kotlin.common.features.customer.CustomerRepository $r8$lambda$W8nBwJSN4TPfrCdn_vxv3iL3r9g() {
        java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.features.customer.CustomerRepository.class));
        if (obj != null) {
            return (com.ingo.sdk.kotlin.common.features.customer.CustomerRepository) obj;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.features.customer.CustomerRepository");
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$d_X_xl_rNBYyhX4Y6k0RNNUawq8(com.ingo.sdk.kotlin.common.features.customer.model.CustomerResponse customerResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customerResponse, "");
        java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.ux.IngoUxState.class));
        if (obj == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.ux.IngoUxState");
        }
        ((com.ingo.sdk.kotlin.ux.IngoUxState) obj).getSessionMap().put(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.features.customer.model.CustomerResponse.class), customerResponse);
        return kotlin.Unit.INSTANCE;
    }
}
