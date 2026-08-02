package com.paypal.oslo.feature.cashin.ui.barcode.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BarcodeViewModelKt {
    public static final /* synthetic */ java.lang.String access$toAnalyticsStatus(com.paypal.oslo.feature.cashin.domain.usecase.DebitCardEligibility debitCardEligibility) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(debitCardEligibility, com.paypal.oslo.feature.cashin.domain.usecase.DebitCardEligibility.Eligible.INSTANCE)) {
            return "eligible";
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(debitCardEligibility, com.paypal.oslo.feature.cashin.domain.usecase.DebitCardEligibility.Ineligible.INSTANCE)) {
            return "ineligible";
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(debitCardEligibility, com.paypal.oslo.feature.cashin.domain.usecase.DebitCardEligibility.BundleProvisioned.INSTANCE)) {
            return "bundle_provisioned";
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
