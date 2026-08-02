package com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ManualAddBankViewModelKt {
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r0 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Error access$createErrorOutcome(com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualError addBankManualError) {
        java.lang.String str;
        if (kotlin.jvm.internal.Intrinsics.areEqual(addBankManualError, com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualError.Network.INSTANCE)) {
            str = "Network error. Please check your connection and try again.";
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(addBankManualError, com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualError.Business.AddingFailed.INSTANCE)) {
            str = "Unable to add bank account. Please verify your details and try again.";
        } else {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(addBankManualError, com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualError.Business.MissingBankAccountId.INSTANCE)) {
                if (!(addBankManualError instanceof com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualError.Business.PartialDataAvailable)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                str = (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) ((com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualError.Business.PartialDataAvailable) addBankManualError).getErrorMessages());
            }
            str = "Something went wrong. Please try again.";
        }
        return new com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Error(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(addBankManualError.getClass()).getSimpleName(), false, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public static final /* synthetic */ com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Success access$createSuccessOutcome(java.lang.String str, com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualParams addBankManualParams) {
        return new com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Success(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.wallet.api.navigation.result.banks.LinkedBankAccount(str, addBankManualParams.getAccountType().name(), kotlin.text.StringsKt.takeLast(addBankManualParams.getAccountNumber(), 4), "")), "Bank account added successfully", (java.lang.Integer) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public static final /* synthetic */ kotlin.Pair access$mapSubmissionErrorToMessage(com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualError addBankManualError) {
        if (addBankManualError instanceof com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualError.Network) {
            return kotlin.TuplesKt.to(null, java.lang.Integer.valueOf(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_network_error_please_try_again));
        }
        if (addBankManualError instanceof com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualError.Business.AddingFailed) {
            return kotlin.TuplesKt.to(null, java.lang.Integer.valueOf(com.paypal.oslo.feature.wallet.R.string.feature_wallet_add_bank_enter_bank_info_error_adding_failed));
        }
        if (addBankManualError instanceof com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualError.Business.MissingBankAccountId) {
            return kotlin.TuplesKt.to(null, java.lang.Integer.valueOf(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_something_went_wrong_please_try_again));
        }
        if (!(addBankManualError instanceof com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualError.Business.PartialDataAvailable)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.lang.String str = (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) ((com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualError.Business.PartialDataAvailable) addBankManualError).getErrorMessages());
        if (str != null) {
            return kotlin.TuplesKt.to(str, null);
        }
        return kotlin.TuplesKt.to(null, java.lang.Integer.valueOf(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_something_went_wrong_please_try_again));
    }
}
