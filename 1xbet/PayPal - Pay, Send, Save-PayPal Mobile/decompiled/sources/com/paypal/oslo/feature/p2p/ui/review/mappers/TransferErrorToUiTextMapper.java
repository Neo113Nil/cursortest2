package com.paypal.oslo.feature.p2p.ui.review.mappers;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/mappers/TransferErrorToUiTextMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/p2p/domain/error/ExecutePaymentTransferError;", "error", "Lcom/paypal/oslo/feature/p2p/ui/UiText;", "map", "(Lcom/paypal/oslo/feature/p2p/domain/error/ExecutePaymentTransferError;)Lcom/paypal/oslo/feature/p2p/ui/UiText;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TransferErrorToUiTextMapper {
    public static final int $stable = 0;

    @javax.inject.Inject
    public TransferErrorToUiTextMapper() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.paypal.oslo.feature.p2p.ui.UiText map(com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        int i = 2;
        java.util.List list = null;
        java.lang.Object[] objArr = 0;
        java.lang.Object[] objArr2 = 0;
        java.lang.Object[] objArr3 = 0;
        if (error instanceof com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Network) {
            return new com.paypal.oslo.feature.p2p.ui.UiText.StringResource(com.paypal.oslo.feature.p2p.R.string.feature_p2p_review_error_network, list, i, objArr3 == true ? 1 : 0);
        }
        if ((error instanceof com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business.NoData) || (error instanceof com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business.UnexpectedResponseType)) {
            return new com.paypal.oslo.feature.p2p.ui.UiText.StringResource(com.paypal.oslo.feature.p2p.R.string.feature_p2p_review_error_unknown, objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0);
        }
        if (error instanceof com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business.InsufficientFunds) {
            return new com.paypal.oslo.feature.p2p.ui.UiText.DynamicString("Insufficient funds to complete this transfer");
        }
        if (error instanceof com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business.AmountExceedsLimit) {
            return new com.paypal.oslo.feature.p2p.ui.UiText.DynamicString("Transfer amount exceeds allowed limit");
        }
        if (error instanceof com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business.InvalidRecipient) {
            return new com.paypal.oslo.feature.p2p.ui.UiText.DynamicString("Recipient account is invalid");
        }
        if (error instanceof com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business.AccountRestricted) {
            return new com.paypal.oslo.feature.p2p.ui.UiText.DynamicString("Your account is restricted from making transfers");
        }
        if (error instanceof com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business.SecurityBlock) {
            return new com.paypal.oslo.feature.p2p.ui.UiText.DynamicString("Transfer was blocked for security reasons");
        }
        if (!(error instanceof com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business.ServerError)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.paypal.oslo.feature.p2p.ui.UiText.StringResource(com.paypal.oslo.feature.p2p.R.string.feature_p2p_review_error_transfer_failed, kotlin.collections.CollectionsKt.listOf(((com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business.ServerError) error).getMessage()));
    }
}
