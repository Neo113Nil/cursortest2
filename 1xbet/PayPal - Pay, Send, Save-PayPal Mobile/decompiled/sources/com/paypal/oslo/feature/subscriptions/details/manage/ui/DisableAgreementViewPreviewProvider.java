package com.paypal.oslo.feature.subscriptions.details.manage.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/DisableAgreementViewPreviewProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementUiState$Disable;", "<init>", "()V", "Lkotlin/sequences/Sequence;", "getHighSpeedVideoSizes", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final class DisableAgreementViewPreviewProvider implements androidx.compose.ui.tooling.preview.PreviewParameterProvider<com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Disable> {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.sequences.Sequence<com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Disable> getHighSpeedVideoFpsRangesFor = kotlin.sequences.SequencesKt.sequenceOf((java.lang.Object[]) new com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Disable[]{new com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Disable(com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType.MERCHANT_MANAGED, "Spotify", false, false, null, 16, null), new com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Disable(com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType.MERCHANT_MANAGED, "Spotify", true, false, null, 16, null), new com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Disable(com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType.MERCHANT_MANAGED, "Spotify", false, true, null, 16, null), new com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Disable(com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType.PAYPAL_MANAGED, "Netflix", false, false, null, 16, null), new com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Disable(com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType.PAYPAL_MANAGED, "Netflix", true, false, null, 16, null), new com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Disable(com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType.PAYPAL_MANAGED, "Netflix", false, true, null, 16, null)});

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final /* bridge */ int getCount() {
        return super.getCount();
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final /* bridge */ java.lang.String getDisplayName(int i) {
        return super.getDisplayName(i);
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final kotlin.sequences.Sequence<com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Disable> getValues() {
        return this.getHighSpeedVideoFpsRangesFor;
    }
}
