package com.zettle.sdk.feature.taptopay.core;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0000*\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/FailureReason;", "", "isCancelledReason", "(Lcom/zettle/sdk/feature/taptopay/core/FailureReason;)Z", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$SDKTransactionResultAction;", "toPaymentFailureReason", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$SDKTransactionResultAction;)Lcom/zettle/sdk/feature/taptopay/core/FailureReason;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class FailureReasonKt {
    public static final com.zettle.sdk.feature.taptopay.core.FailureReason toPaymentFailureReason(com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction sDKTransactionResultAction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sDKTransactionResultAction, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(sDKTransactionResultAction, com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction.SDKTransactionCardError.INSTANCE)) {
            return com.zettle.sdk.feature.taptopay.core.SDKTransactionResults.TransactionCardError.INSTANCE;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(sDKTransactionResultAction, com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction.SDKTransactionDeclined.INSTANCE)) {
            return com.zettle.sdk.feature.taptopay.core.SDKTransactionResults.TransactionDeclined.INSTANCE;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(sDKTransactionResultAction, com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction.SDKTransactionEndApplicationError.INSTANCE)) {
            return com.zettle.sdk.feature.taptopay.core.SDKTransactionResults.TransactionEndApplicationError.INSTANCE;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(sDKTransactionResultAction, com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction.SDKTransactionFailed.INSTANCE)) {
            return com.zettle.sdk.feature.taptopay.core.SDKTransactionResults.TransactionFailed.INSTANCE;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(sDKTransactionResultAction, com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction.SDKTransactionFailedAllowFallback.INSTANCE)) {
            return com.zettle.sdk.feature.taptopay.core.SDKTransactionResults.TransactionFailedAllowFallback.INSTANCE;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(sDKTransactionResultAction, com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction.SDKTransactionNoAppError.INSTANCE)) {
            return com.zettle.sdk.feature.taptopay.core.SDKTransactionResults.TransactionNoAppError.INSTANCE;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(sDKTransactionResultAction, com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction.SDKTransactionRequireCDCVM.INSTANCE)) {
            return com.zettle.sdk.feature.taptopay.core.SDKTransactionResults.TransactionRequireCDCVM.INSTANCE;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(sDKTransactionResultAction, com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction.SDKTransactionSelectNextInterface.INSTANCE)) {
            return com.zettle.sdk.feature.taptopay.core.SDKTransactionResults.TransactionSelectNextInterface.INSTANCE;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(sDKTransactionResultAction, com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction.SDKTransactionTryAgain.INSTANCE)) {
            return com.zettle.sdk.feature.taptopay.core.SDKTransactionResults.TransactionTryAgain.INSTANCE;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final boolean isCancelledReason(com.zettle.sdk.feature.taptopay.core.FailureReason failureReason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failureReason, "");
        return (failureReason instanceof com.zettle.sdk.feature.taptopay.core.FailureReason.CancelledByTimeout) || (failureReason instanceof com.zettle.sdk.feature.taptopay.core.FailureReason.CancelledByNetworkTimeout) || (failureReason instanceof com.zettle.sdk.feature.taptopay.core.FailureReason.CanceledByUser) || (failureReason instanceof com.zettle.sdk.feature.taptopay.core.FailureReason.PinEntranceCanceled) || (failureReason instanceof com.zettle.sdk.feature.taptopay.core.FailureReason.SignatureCanceled);
    }
}
