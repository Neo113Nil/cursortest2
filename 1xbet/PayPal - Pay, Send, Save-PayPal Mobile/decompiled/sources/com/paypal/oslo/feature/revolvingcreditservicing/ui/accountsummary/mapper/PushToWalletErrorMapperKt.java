package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/starpay/api/Error;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/pushtowallet/PushToWalletError;", "toPushToWalletError", "(Lcom/paypal/oslo/feature/starpay/api/Error;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/pushtowallet/PushToWalletError;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PushToWalletErrorMapperKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.pushtowallet.PushToWalletError toPushToWalletError(com.paypal.oslo.feature.starpay.api.Error error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        if (error instanceof com.paypal.oslo.feature.starpay.api.Error.Canceled) {
            return null;
        }
        if (!(error instanceof com.paypal.oslo.feature.starpay.api.Error.NoActiveWallet) && !(error instanceof com.paypal.oslo.feature.starpay.api.Error.UnsupportedApi) && !(error instanceof com.paypal.oslo.feature.starpay.api.Error.SystemError)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.pushtowallet.PushToWalletError.GenericError.INSTANCE;
    }
}
