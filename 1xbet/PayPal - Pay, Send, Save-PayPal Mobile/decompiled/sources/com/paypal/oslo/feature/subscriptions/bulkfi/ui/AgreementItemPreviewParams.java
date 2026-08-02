package com.paypal.oslo.feature.subscriptions.bulkfi.ui;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007¨\u0006\t"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/AgreementItemPreviewParams;", "", "<init>", "()V", "agreementItem", "Lcom/paypal/oslo/feature/subscriptions/hub/ui/models/SubscriptionItemUiModel;", "id", "", "merchantName", "subscriptions_prodRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final class AgreementItemPreviewParams {
    public static final com.paypal.oslo.feature.subscriptions.bulkfi.ui.AgreementItemPreviewParams getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.subscriptions.bulkfi.ui.AgreementItemPreviewParams();

    private AgreementItemPreviewParams() {
    }

    public static com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel getHighSpeedVideoFpsRanges(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription subscription = com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE;
        return new com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel(str, subscription, null, com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel.copy$default(com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentPreviewData.INSTANCE.getCreditCard(), "fi_preferred_id", null, "Credit", null, null, null, 58, null), com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel.copy$default(com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentPreviewData.INSTANCE.getPaypalBalance(), "fi_balance_id", null, null, null, null, null, 62, null), new com.paypal.oslo.feature.subscriptions.hub.domain.Merchant("id-1", str2, null), new com.paypal.oslo.feature.subscriptions.hub.ui.models.LastPaymentInformationUiModel("$10.24", "Paid Dec 20"), 4, null);
    }
}
