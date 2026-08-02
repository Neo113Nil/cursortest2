package com.ingo.sdk.kotlin.common.features.customer_enrollment;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\t\u0010\nR\u0015\u0010\u000e\u001a\u00020\u000b8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/customer_enrollment/CustomerEnrollmentUseCase;", "Lcom/ingo/sdk/kotlin/common/core/interactor/SdkUseCase;", "Lcom/ingo/sdk/kotlin/common/features/customer_enrollment/model/CustomerEnrollmentResponse;", "Lcom/ingo/sdk/kotlin/common/features/customer_enrollment/CustomerEnrollmentParameters;", "<init>", "()V", "params", "Lcom/ingo/sdk/kotlin/common/core/functional/Either;", "Lcom/ingo/sdk/kotlin/common/core/exception/Failure;", "run", "(Lcom/ingo/sdk/kotlin/common/features/customer_enrollment/CustomerEnrollmentParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ingo/sdk/kotlin/common/features/customer_enrollment/CustomerEnrollmentRepository;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/Lazy;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CustomerEnrollmentUseCase extends com.ingo.sdk.kotlin.common.core.interactor.SdkUseCase<com.ingo.sdk.kotlin.common.features.customer_enrollment.model.CustomerEnrollmentResponse, com.ingo.sdk.kotlin.common.features.customer_enrollment.CustomerEnrollmentParameters> {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.Lazy getHighResolutionOutputSizeshNQ4ISI;

    @Override // com.ingo.sdk.kotlin.common.core.interactor.UseCase
    public final /* bridge */ /* synthetic */ java.lang.Object run(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return run((com.ingo.sdk.kotlin.common.features.customer_enrollment.CustomerEnrollmentParameters) obj, (kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.core.functional.Either<? extends com.ingo.sdk.kotlin.common.core.exception.Failure, com.ingo.sdk.kotlin.common.features.customer_enrollment.model.CustomerEnrollmentResponse>>) continuation);
    }

    public CustomerEnrollmentUseCase() {
        super(0L, 1, null);
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.kotlin.common.features.customer_enrollment.CustomerEnrollmentUseCase$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.ingo.sdk.kotlin.common.features.customer_enrollment.CustomerEnrollmentUseCase.$r8$lambda$MVsXjR1kH4bGRqPwfZB34397dSA();
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object run(com.ingo.sdk.kotlin.common.features.customer_enrollment.CustomerEnrollmentParameters customerEnrollmentParameters, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.core.functional.Either<? extends com.ingo.sdk.kotlin.common.core.exception.Failure, com.ingo.sdk.kotlin.common.features.customer_enrollment.model.CustomerEnrollmentResponse>> continuation) {
        com.ingo.sdk.kotlin.common.features.customer_enrollment.CustomerEnrollmentUseCase$run$1 customerEnrollmentUseCase$run$1;
        int i;
        com.ingo.sdk.kotlin.common.core.functional.Either either;
        if (continuation instanceof com.ingo.sdk.kotlin.common.features.customer_enrollment.CustomerEnrollmentUseCase$run$1) {
            customerEnrollmentUseCase$run$1 = (com.ingo.sdk.kotlin.common.features.customer_enrollment.CustomerEnrollmentUseCase$run$1) continuation;
            if ((customerEnrollmentUseCase$run$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                customerEnrollmentUseCase$run$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = customerEnrollmentUseCase$run$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = customerEnrollmentUseCase$run$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.ingo.sdk.kotlin.common.features.customer_enrollment.CustomerEnrollmentRepository customerEnrollmentRepository = (com.ingo.sdk.kotlin.common.features.customer_enrollment.CustomerEnrollmentRepository) this.getHighResolutionOutputSizeshNQ4ISI.getValue();
                    java.lang.String ssn = customerEnrollmentParameters.getSsn();
                    java.lang.String dob = customerEnrollmentParameters.getDob();
                    java.lang.String mobilePhoneNumber = customerEnrollmentParameters.getMobilePhoneNumber();
                    customerEnrollmentUseCase$run$1.getHighSpeedVideoSizes = 1;
                    obj = customerEnrollmentRepository.completeEnrollment(ssn, dob, mobilePhoneNumber, customerEnrollmentUseCase$run$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (com.ingo.sdk.kotlin.common.core.functional.Either) obj;
                if (either.isRight()) {
                    return either;
                }
                com.ingo.sdk.kotlin.common.features.customer_enrollment.model.CustomerEnrollmentResponse customerEnrollmentResponse = (com.ingo.sdk.kotlin.common.features.customer_enrollment.model.CustomerEnrollmentResponse) com.ingo.sdk.kotlin.common.core.functional.EitherKt.getRightOrThrow$default(either, null, 1, null);
                java.lang.Object obj2 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.ux.IngoUxState.class));
                if (obj2 != null) {
                    java.lang.Object obj3 = ((com.ingo.sdk.kotlin.ux.IngoUxState) obj2).getSessionMap().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.features.customer.model.CustomerResponse.class));
                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj3, "");
                    com.ingo.sdk.kotlin.common.features.customer.model.CustomerResponse customerResponse = (com.ingo.sdk.kotlin.common.features.customer.model.CustomerResponse) obj3;
                    java.util.List<com.ingo.sdk.kotlin.common.features.customer.model.Account> accounts = customerEnrollmentResponse.getAccounts();
                    if (accounts != null && !accounts.isEmpty()) {
                        java.lang.Object obj4 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.ux.IngoUxState.class));
                        if (obj4 != null) {
                            ((com.ingo.sdk.kotlin.ux.IngoUxState) obj4).getSessionMap().put(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.features.customer.model.CustomerResponse.class), com.ingo.sdk.kotlin.common.features.customer.model.CustomerResponse.copy$default(customerResponse, customerEnrollmentResponse.getCustomerId(), null, null, null, customerEnrollmentResponse.getAccounts(), 14, null));
                        } else {
                            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.ux.IngoUxState");
                        }
                    } else {
                        java.lang.Object obj5 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.ux.IngoUxState.class));
                        if (obj5 != null) {
                            ((com.ingo.sdk.kotlin.ux.IngoUxState) obj5).getSessionMap().put(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.features.customer.model.CustomerResponse.class), com.ingo.sdk.kotlin.common.features.customer.model.CustomerResponse.copy$default(customerResponse, customerEnrollmentResponse.getCustomerId(), null, null, null, null, 30, null));
                        } else {
                            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.ux.IngoUxState");
                        }
                    }
                    java.lang.Object obj6 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.IngoSdkConfiguration.class));
                    if (obj6 != null) {
                        ((com.ingo.sdk.kotlin.common.IngoSdkConfiguration) obj6).setCustomerId(customerEnrollmentResponse.getCustomerId());
                        return either;
                    }
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.IngoSdkConfiguration");
                }
                throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.ux.IngoUxState");
            }
        }
        customerEnrollmentUseCase$run$1 = new com.ingo.sdk.kotlin.common.features.customer_enrollment.CustomerEnrollmentUseCase$run$1(this, continuation);
        java.lang.Object obj7 = customerEnrollmentUseCase$run$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = customerEnrollmentUseCase$run$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        either = (com.ingo.sdk.kotlin.common.core.functional.Either) obj7;
        if (either.isRight()) {
        }
    }

    public static /* synthetic */ com.ingo.sdk.kotlin.common.features.customer_enrollment.CustomerEnrollmentRepository $r8$lambda$MVsXjR1kH4bGRqPwfZB34397dSA() {
        java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.features.customer_enrollment.CustomerEnrollmentRepository.class));
        if (obj != null) {
            return (com.ingo.sdk.kotlin.common.features.customer_enrollment.CustomerEnrollmentRepository) obj;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.features.customer_enrollment.CustomerEnrollmentRepository");
    }
}
