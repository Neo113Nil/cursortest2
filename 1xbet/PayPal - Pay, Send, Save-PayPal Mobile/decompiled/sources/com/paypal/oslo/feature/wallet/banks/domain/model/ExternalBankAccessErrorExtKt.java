package com.paypal.oslo.feature.wallet.banks.domain.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessError;", "", "toDisplayMessage", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessError;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ExternalBankAccessErrorExtKt {
    public static final java.lang.String toDisplayMessage(com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError externalBankAccessError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalBankAccessError, "");
        if (externalBankAccessError instanceof com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError.Network) {
            return "Network error. Please try again.";
        }
        if (externalBankAccessError instanceof com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError.Business.MissingConnectUrl) {
            return "Connection failed. Please try again.";
        }
        if (externalBankAccessError instanceof com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError.Business.NoBankAccountsAvailable) {
            return "No bank accounts found.";
        }
        if (externalBankAccessError instanceof com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError.Business.LinkingFailed) {
            return "Failed to link accounts. Please try again.";
        }
        if (externalBankAccessError instanceof com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError.Business.PartialDataAvailable) {
            java.lang.String str = (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) ((com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError.Business.PartialDataAvailable) externalBankAccessError).getErrorMessages());
            return str == null ? "An error occurred." : str;
        }
        if (!(externalBankAccessError instanceof com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError.Business.ContentUnavailable)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.lang.String description = ((com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError.Business.ContentUnavailable) externalBankAccessError).getDescription();
        return description == null ? "Content unavailable." : description;
    }
}
