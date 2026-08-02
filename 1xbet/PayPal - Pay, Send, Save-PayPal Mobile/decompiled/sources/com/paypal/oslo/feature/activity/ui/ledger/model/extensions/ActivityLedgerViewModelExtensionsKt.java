package com.paypal.oslo.feature.activity.ui.ledger.model.extensions;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\b\u001a\u00020\u0007*\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/ledger/model/ActivityLedgerViewModel;", "Landroid/content/Intent;", "intent", "", "onNewDeeplinkReceived", "(Lcom/paypal/oslo/feature/activity/ui/ledger/model/ActivityLedgerViewModel;Landroid/content/Intent;)V", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;", "", "hasCryptoAsset", "(Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;)Z", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;", "getCurrentFilterTypeFromState", "(Lcom/paypal/oslo/feature/activity/ui/ledger/model/ActivityLedgerViewModel;)Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityLedgerViewModelExtensionsKt {
    public static final void onNewDeeplinkReceived(com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel, android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityLedgerViewModel, "");
        android.net.Uri data = intent != null ? intent.getData() : null;
        if (data != null) {
            try {
                com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState initialState$activity_prodRelease = activityLedgerViewModel.getInitialState$activity_prodRelease(new com.paypal.oslo.feature.activity.domain.common.deeplink.ActivityLedgerDeepLinkDto(data.getQueryParameter(com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_START_DATE), data.getQueryParameter(com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_END_DATE)));
                if (initialState$activity_prodRelease instanceof com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState.LedgerFilterState) {
                    activityLedgerViewModel.processEvent$activity_prodRelease(new com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.FilterApplied(((com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState.LedgerFilterState) initialState$activity_prodRelease).getActivityFilterType()));
                }
            } catch (java.lang.Exception e) {
                com.paypal.oslo.feature.activity.domain.base.utils.logs.ActivityLogUtils.INSTANCE.logDeepLinkParsingException$activity_prodRelease("onNewDeeplinkReceived", e);
            }
        }
    }

    public static final boolean hasCryptoAsset(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel) {
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCounterPartyAmountInformation amountInformation;
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCryptoAssetQuantityInformation cryptoAssetQuantity;
        java.lang.String cryptoQuantity = (activityTransactionModel == null || (amountInformation = activityTransactionModel.getAmountInformation()) == null || (cryptoAssetQuantity = amountInformation.getCryptoAssetQuantity()) == null) ? null : cryptoAssetQuantity.getCryptoQuantity();
        return !(cryptoQuantity == null || kotlin.text.StringsKt.isBlank(cryptoQuantity));
    }

    public static final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType getCurrentFilterTypeFromState(com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityLedgerViewModel, "");
        return activityLedgerViewModel.getLedgerScreenState$activity_prodRelease().getValue().getActivityFilterType();
    }
}
