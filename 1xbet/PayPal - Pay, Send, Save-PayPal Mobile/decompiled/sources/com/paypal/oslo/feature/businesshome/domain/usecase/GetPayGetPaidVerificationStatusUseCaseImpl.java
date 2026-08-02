package com.paypal.oslo.feature.businesshome.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/domain/usecase/GetPayGetPaidVerificationStatusUseCaseImpl;", "Lcom/paypal/oslo/feature/businesshome/api/domain/usecase/GetPayGetPaidVerificationStatusUseCase;", "Lcom/paypal/oslo/feature/businesshome/domain/repository/AccountSetupRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/businesshome/domain/repository/AccountSetupRepository;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/businesshome/api/domain/model/AccountSetupError;", "Lcom/paypal/oslo/feature/businesshome/api/domain/usecase/PayGetPaidVerificationResult;", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/businesshome/domain/repository/AccountSetupRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GetPayGetPaidVerificationStatusUseCaseImpl implements com.paypal.oslo.feature.businesshome.api.domain.usecase.GetPayGetPaidVerificationStatusUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.businesshome.domain.repository.AccountSetupRepository getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public GetPayGetPaidVerificationStatusUseCaseImpl(com.paypal.oslo.feature.businesshome.domain.repository.AccountSetupRepository accountSetupRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountSetupRepository, "");
        this.getHighResolutionOutputSizeshNQ4ISI = accountSetupRepository;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0116, code lost:
    
        if (r4.setPayGetPaidVerificationComplete(true, r0) == r1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0137, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0075, code lost:
    
        if (r10 != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x005c, code lost:
    
        if (r10 != r1) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.paypal.oslo.feature.businesshome.api.domain.usecase.GetPayGetPaidVerificationStatusUseCase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupError, ? extends com.paypal.oslo.feature.businesshome.api.domain.usecase.PayGetPaidVerificationResult>> continuation) {
        com.paypal.oslo.feature.businesshome.domain.usecase.GetPayGetPaidVerificationStatusUseCaseImpl$invoke$1 getPayGetPaidVerificationStatusUseCaseImpl$invoke$1;
        java.lang.Object obj;
        int i;
        java.util.Set set;
        if (continuation instanceof com.paypal.oslo.feature.businesshome.domain.usecase.GetPayGetPaidVerificationStatusUseCaseImpl$invoke$1) {
            getPayGetPaidVerificationStatusUseCaseImpl$invoke$1 = (com.paypal.oslo.feature.businesshome.domain.usecase.GetPayGetPaidVerificationStatusUseCaseImpl$invoke$1) continuation;
            if ((getPayGetPaidVerificationStatusUseCaseImpl$invoke$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                getPayGetPaidVerificationStatusUseCaseImpl$invoke$1.getHighSpeedVideoSizesFor -= 2147483648;
                obj = getPayGetPaidVerificationStatusUseCaseImpl$invoke$1.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getPayGetPaidVerificationStatusUseCaseImpl$invoke$1.getHighSpeedVideoSizesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.businesshome.domain.repository.AccountSetupRepository accountSetupRepository = this.getHighResolutionOutputSizeshNQ4ISI;
                    getPayGetPaidVerificationStatusUseCaseImpl$invoke$1.getHighSpeedVideoSizesFor = 1;
                    obj = accountSetupRepository.isPayGetPaidVerificationComplete(getPayGetPaidVerificationStatusUseCaseImpl$invoke$1);
                } else if (i == 1) {
                    kotlin.ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = getPayGetPaidVerificationStatusUseCaseImpl$invoke$1.getHighSpeedVideoFpsRangesFor;
                        int i3 = getPayGetPaidVerificationStatusUseCaseImpl$invoke$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return arrow.core.EitherKt.right(com.paypal.oslo.feature.businesshome.api.domain.usecase.PayGetPaidVerificationResult.Verified.INSTANCE);
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    arrow.core.Either either = (arrow.core.Either) obj;
                    if (!(either instanceof arrow.core.Either.Right)) {
                        if (either instanceof arrow.core.Either.Left) {
                            return arrow.core.EitherKt.left((com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupError) ((arrow.core.Either.Left) either).getValue());
                        }
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStatus accountSetupStatus = (com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStatus) ((arrow.core.Either.Right) either).getValue();
                    java.util.List<com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStep> setupSteps = accountSetupStatus.getSetupSteps();
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(setupSteps, 10)), 16));
                    for (java.lang.Object obj2 : setupSteps) {
                        linkedHashMap.put(((com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStep) obj2).getType(), obj2);
                    }
                    set = com.paypal.oslo.feature.businesshome.domain.usecase.GetPayGetPaidVerificationStatusUseCaseImplKt.Camera2StreamConfigurationMap;
                    java.util.Set set2 = set;
                    if (!(set2 instanceof java.util.Collection) || !set2.isEmpty()) {
                        java.util.Iterator it = set2.iterator();
                        while (it.hasNext()) {
                            com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStep accountSetupStep = (com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStep) linkedHashMap.get((com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStepType) it.next());
                            if (accountSetupStep == null || !accountSetupStep.isCompleted()) {
                                return arrow.core.EitherKt.right(new com.paypal.oslo.feature.businesshome.api.domain.usecase.PayGetPaidVerificationResult.NeedsSetup(accountSetupStatus));
                            }
                        }
                    }
                    com.paypal.oslo.feature.businesshome.domain.repository.AccountSetupRepository accountSetupRepository2 = this.getHighResolutionOutputSizeshNQ4ISI;
                    getPayGetPaidVerificationStatusUseCaseImpl$invoke$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    getPayGetPaidVerificationStatusUseCaseImpl$invoke$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    getPayGetPaidVerificationStatusUseCaseImpl$invoke$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(accountSetupStatus);
                    getPayGetPaidVerificationStatusUseCaseImpl$invoke$1.getHighSpeedVideoFpsRanges = 0;
                    getPayGetPaidVerificationStatusUseCaseImpl$invoke$1.getHighSpeedVideoFpsRangesFor = 0;
                    getPayGetPaidVerificationStatusUseCaseImpl$invoke$1.getHighSpeedVideoSizesFor = 3;
                }
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return arrow.core.EitherKt.right(com.paypal.oslo.feature.businesshome.api.domain.usecase.PayGetPaidVerificationResult.Verified.INSTANCE);
                }
                com.paypal.oslo.feature.businesshome.domain.repository.AccountSetupRepository accountSetupRepository3 = this.getHighResolutionOutputSizeshNQ4ISI;
                getPayGetPaidVerificationStatusUseCaseImpl$invoke$1.getHighSpeedVideoSizesFor = 2;
                obj = accountSetupRepository3.getAccountSetupStatus(getPayGetPaidVerificationStatusUseCaseImpl$invoke$1);
            }
        }
        getPayGetPaidVerificationStatusUseCaseImpl$invoke$1 = new com.paypal.oslo.feature.businesshome.domain.usecase.GetPayGetPaidVerificationStatusUseCaseImpl$invoke$1(this, continuation);
        obj = getPayGetPaidVerificationStatusUseCaseImpl$invoke$1.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getPayGetPaidVerificationStatusUseCaseImpl$invoke$1.getHighSpeedVideoSizesFor;
        if (i != 0) {
        }
        if (!((java.lang.Boolean) obj).booleanValue()) {
        }
    }
}
