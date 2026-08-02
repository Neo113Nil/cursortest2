package com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a9\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lkotlin/Function1;", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerEvent;", "", "onEvent", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;", "performPrimaryCTAClickEvent", "(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem$Transaction;", "item", "performTransactionTileClickEvent", "(Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem$Transaction;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TransactionItemClickEventHandlerKt {
    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel, kotlin.Unit> performPrimaryCTAClickEvent(final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.TransactionItemClickEventHandlerKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.TransactionItemClickEventHandlerKt.$r8$lambda$Xy8mTZMu_keA9nGeuBrquY42lsk(kotlin.jvm.functions.Function1.this, (com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel) obj);
            }
        };
    }

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel, kotlin.Unit> performTransactionTileClickEvent(final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.Transaction transaction, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transaction, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.TransactionItemClickEventHandlerKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.TransactionItemClickEventHandlerKt.$r8$lambda$Xx8SJFxhfRPfHeYDL33POwIAjEU(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.Transaction.this, function1, (com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel) obj);
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Xx8SJFxhfRPfHeYDL33POwIAjEU(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.Transaction transaction, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel) {
        if (com.paypal.oslo.feature.activity.domain.common.extensions.ActivityActionFilterExtensionsKt.isXoomTransactionFlow(transaction.getData())) {
            function1.invoke(new com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.XoomTransactionTileActionPressedEvent(com.paypal.oslo.feature.activity.domain.common.extensions.ActivityExtensionsKt.toXoomTransactionDestinationKey(transaction.getData())));
        } else if (com.paypal.oslo.feature.activity.ui.common.ActivityActionExtensionsKt.isPrimaryActionFlow(activityActionModel)) {
            function1.invoke(new com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.TransactionTileActionPressedEvent(activityActionModel));
        } else if (com.paypal.oslo.feature.activity.domain.common.extensions.ActivityActionFilterExtensionsKt.isPackageTrackingFlow(transaction.getData())) {
            function1.invoke(new com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.PackageTrackPressedEvent(com.paypal.oslo.feature.activity.domain.common.extensions.ActivityExtensionsKt.toPackageDetailsDestinationsKey(transaction.getData())));
        } else if (com.paypal.oslo.feature.activity.domain.common.extensions.ActivityActionFilterExtensionsKt.isPromotionalRewardsFlow(transaction.getData())) {
            function1.invoke(new com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.PromotionalRewardPressedEvent(com.paypal.oslo.feature.activity.domain.common.extensions.ActivityModelMapperExtensionsKt.toPromotionalRewardDestinationsKey(transaction.getData(), com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivitySourceConstants.KEY_SOURCE_LEDGER)));
        } else {
            function1.invoke(new com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.TransactionTilePressedEvent(transaction.getData()));
        }
        com.paypal.oslo.feature.activity.analytics.ActivityAnalyticsTrackerKt.trackTransactionCardPressed(transaction.getData().getAmountInformation().getAmount(), transaction.getData().getType().getRawValue(), com.paypal.oslo.feature.activity.analytics.ActivityAnalyticsConstants.Ledger.TRANSACTION_CARD);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Xy8mTZMu_keA9nGeuBrquY42lsk(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityActionModel, "");
        function1.invoke(new com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.TransactionTileActionPressedEvent(activityActionModel));
        com.paypal.oslo.feature.activity.analytics.ActivityAnalyticsTrackerKt.trackLedgerActionCtaPressed(activityActionModel.getType().getRawValue());
        return kotlin.Unit.INSTANCE;
    }
}
