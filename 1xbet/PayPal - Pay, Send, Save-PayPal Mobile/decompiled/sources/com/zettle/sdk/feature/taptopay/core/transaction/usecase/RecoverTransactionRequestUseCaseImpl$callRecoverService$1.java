package com.zettle.sdk.feature.taptopay.core.transaction.usecase;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/izettle/android/core/data/result/Result;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TapToPayRecoverTransaction;", "", "p0", "", "getHighSpeedVideoSizes", "(Lcom/izettle/android/core/data/result/Result;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
final class RecoverTransactionRequestUseCaseImpl$callRecoverService$1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<com.izettle.android.core.data.result.Result<? extends com.zettle.sdk.feature.taptopay.core.transaction.TapToPayRecoverTransaction, ? extends java.lang.Throwable>, kotlin.Unit> {
    final /* synthetic */ com.zettle.sdk.commons.network.NetworkClient $Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.zettle.sdk.feature.taptopay.core.transaction.usecase.RecoverTransactionRequestUseCase.Result, kotlin.Unit> $getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo $getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.zettle.sdk.feature.taptopay.core.transaction.usecase.RecoverTransactionRequestUseCaseImpl getHighSpeedVideoSizes;

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.izettle.android.core.data.result.Result<? extends com.zettle.sdk.feature.taptopay.core.transaction.TapToPayRecoverTransaction, ? extends java.lang.Throwable> result) {
        getHighSpeedVideoSizes(result);
        return kotlin.Unit.INSTANCE;
    }

    public final void getHighSpeedVideoSizes(com.izettle.android.core.data.result.Result<? extends com.zettle.sdk.feature.taptopay.core.transaction.TapToPayRecoverTransaction, ? extends java.lang.Throwable> result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        kotlin.jvm.functions.Function1<com.zettle.sdk.feature.taptopay.core.transaction.usecase.RecoverTransactionRequestUseCase.Result, kotlin.Unit> function1 = this.$getHighResolutionOutputSizeshNQ4ISI;
        com.zettle.sdk.feature.taptopay.core.transaction.usecase.RecoverTransactionRequestUseCaseImpl recoverTransactionRequestUseCaseImpl = this.getHighSpeedVideoSizes;
        com.zettle.sdk.commons.network.NetworkClient networkClient = this.$Camera2StreamConfigurationMap;
        com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo transactionInfo = this.$getHighSpeedVideoFpsRangesFor;
        if (result instanceof com.izettle.android.core.data.result.Success) {
            com.zettle.sdk.feature.taptopay.core.transaction.TapToPayRecoverTransaction tapToPayRecoverTransaction = (com.zettle.sdk.feature.taptopay.core.transaction.TapToPayRecoverTransaction) ((com.izettle.android.core.data.result.Success) result).getValue();
            if (tapToPayRecoverTransaction instanceof com.zettle.sdk.feature.taptopay.core.transaction.TapToPayRecoverTransaction.Success) {
                function1.invoke(new com.zettle.sdk.feature.taptopay.core.transaction.usecase.RecoverTransactionRequestUseCase.Result.Success(((com.zettle.sdk.feature.taptopay.core.transaction.TapToPayRecoverTransaction.Success) tapToPayRecoverTransaction).getPayload()));
            } else if (tapToPayRecoverTransaction instanceof com.zettle.sdk.feature.taptopay.core.transaction.TapToPayRecoverTransaction.Failed) {
                com.zettle.sdk.feature.taptopay.core.transaction.TapToPayRecoverTransaction.Failed failed = (com.zettle.sdk.feature.taptopay.core.transaction.TapToPayRecoverTransaction.Failed) tapToPayRecoverTransaction;
                if (com.zettle.sdk.feature.taptopay.core.transaction.usecase.RecoverTransactionRequestUseCaseImpl.access$shouldRetry(recoverTransactionRequestUseCaseImpl, failed.getReason())) {
                    com.zettle.sdk.feature.taptopay.core.transaction.usecase.RecoverTransactionRequestUseCaseImpl.access$retry(recoverTransactionRequestUseCaseImpl, networkClient, transactionInfo, function1);
                } else {
                    function1.invoke(new com.zettle.sdk.feature.taptopay.core.transaction.usecase.RecoverTransactionRequestUseCase.Result.Failed(failed.getInfo().getGetHighSpeedVideoSizes(), failed.getReason()));
                }
            }
        }
        kotlin.jvm.functions.Function1<com.zettle.sdk.feature.taptopay.core.transaction.usecase.RecoverTransactionRequestUseCase.Result, kotlin.Unit> function12 = this.$getHighResolutionOutputSizeshNQ4ISI;
        com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo transactionInfo2 = this.$getHighSpeedVideoFpsRangesFor;
        if (result instanceof com.izettle.android.core.data.result.Failure) {
            function12.invoke(new com.zettle.sdk.feature.taptopay.core.transaction.usecase.RecoverTransactionRequestUseCase.Result.BackendIssue(transactionInfo2.getGetHighSpeedVideoSizes()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    RecoverTransactionRequestUseCaseImpl$callRecoverService$1(kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.transaction.usecase.RecoverTransactionRequestUseCase.Result, kotlin.Unit> function1, com.zettle.sdk.feature.taptopay.core.transaction.usecase.RecoverTransactionRequestUseCaseImpl recoverTransactionRequestUseCaseImpl, com.zettle.sdk.commons.network.NetworkClient networkClient, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo transactionInfo) {
        super(1);
        this.$getHighResolutionOutputSizeshNQ4ISI = function1;
        this.getHighSpeedVideoSizes = recoverTransactionRequestUseCaseImpl;
        this.$Camera2StreamConfigurationMap = networkClient;
        this.$getHighSpeedVideoFpsRangesFor = transactionInfo;
    }
}
