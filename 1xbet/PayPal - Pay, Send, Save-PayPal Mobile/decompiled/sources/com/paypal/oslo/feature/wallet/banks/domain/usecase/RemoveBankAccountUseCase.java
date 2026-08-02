package com.paypal.oslo.feature.wallet.banks.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/usecase/RemoveBankAccountUseCase;", "", "Lcom/paypal/oslo/feature/wallet/banks/domain/repository/manageBank/RemoveBankAccountRepository;", "removeBankAccountRepository", "<init>", "(Lcom/paypal/oslo/feature/wallet/banks/domain/repository/manageBank/RemoveBankAccountRepository;)V", "", "bankAccountId", "", "invoke", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/wallet/banks/domain/repository/manageBank/RemoveBankAccountRepository;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RemoveBankAccountUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.wallet.banks.domain.repository.manageBank.RemoveBankAccountRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public RemoveBankAccountUseCase(com.paypal.oslo.feature.wallet.banks.domain.repository.manageBank.RemoveBankAccountRepository removeBankAccountRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(removeBankAccountRepository, "");
        this.getHighSpeedVideoFpsRangesFor = removeBankAccountRepository;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(java.lang.String str, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        com.paypal.oslo.feature.wallet.banks.domain.usecase.RemoveBankAccountUseCase$invoke$1 removeBankAccountUseCase$invoke$1;
        int i;
        java.lang.Boolean bool;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.wallet.banks.domain.usecase.RemoveBankAccountUseCase$invoke$1) {
            removeBankAccountUseCase$invoke$1 = (com.paypal.oslo.feature.wallet.banks.domain.usecase.RemoveBankAccountUseCase$invoke$1) continuation;
            if ((removeBankAccountUseCase$invoke$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                removeBankAccountUseCase$invoke$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = removeBankAccountUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = removeBankAccountUseCase$invoke$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.wallet.banks.domain.model.manageBank.RemoveBankAccountParams removeBankAccountParams = new com.paypal.oslo.feature.wallet.banks.domain.model.manageBank.RemoveBankAccountParams(str);
                    java.lang.Boolean boxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
                    com.paypal.oslo.feature.wallet.banks.domain.repository.manageBank.RemoveBankAccountRepository removeBankAccountRepository = this.getHighSpeedVideoFpsRangesFor;
                    removeBankAccountUseCase$invoke$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    removeBankAccountUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(removeBankAccountParams);
                    removeBankAccountUseCase$invoke$1.Camera2StreamConfigurationMap = boxBoolean;
                    removeBankAccountUseCase$invoke$1.getHighSpeedVideoSizes = 1;
                    obj = removeBankAccountRepository.removeBankAccount(removeBankAccountParams, removeBankAccountUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    bool = boxBoolean;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bool = (java.lang.Boolean) removeBankAccountUseCase$invoke$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Both)) {
                    com.paypal.oslo.feature.wallet.banks.domain.model.manageBank.RemoveBankAccountResult removeBankAccountResult = (com.paypal.oslo.feature.wallet.banks.domain.model.manageBank.RemoveBankAccountResult) ((arrow.core.Ior.Both) ior).getOrNull();
                    if (removeBankAccountResult != null) {
                        bool = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(removeBankAccountResult.getSuccess());
                    }
                    bool = null;
                } else if (ior instanceof arrow.core.Ior.Left) {
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Remove Bank Account UseCase failed to get response.", null, null, 6, null);
                } else {
                    if (!(ior instanceof arrow.core.Ior.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.wallet.banks.domain.model.manageBank.RemoveBankAccountResult removeBankAccountResult2 = (com.paypal.oslo.feature.wallet.banks.domain.model.manageBank.RemoveBankAccountResult) ((arrow.core.Ior.Right) ior).getOrNull();
                    if (removeBankAccountResult2 != null) {
                        bool = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(removeBankAccountResult2.getSuccess());
                    }
                    bool = null;
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(bool != null ? bool.booleanValue() : false);
            }
        }
        removeBankAccountUseCase$invoke$1 = new com.paypal.oslo.feature.wallet.banks.domain.usecase.RemoveBankAccountUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = removeBankAccountUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = removeBankAccountUseCase$invoke$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Both)) {
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(bool != null ? bool.booleanValue() : false);
    }
}
