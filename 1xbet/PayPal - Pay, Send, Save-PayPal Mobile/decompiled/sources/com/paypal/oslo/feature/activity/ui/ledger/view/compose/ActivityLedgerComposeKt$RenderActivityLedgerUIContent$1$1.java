package com.paypal.oslo.feature.activity.ui.ledger.view.compose;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* synthetic */ class ActivityLedgerComposeKt$RenderActivityLedgerUIContent$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent, kotlin.Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent activityLedgerEvent) {
        com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent activityLedgerEvent2 = activityLedgerEvent;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityLedgerEvent2, "");
        ((com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel) this.receiver).processEvent$activity_prodRelease(activityLedgerEvent2);
        return kotlin.Unit.INSTANCE;
    }

    ActivityLedgerComposeKt$RenderActivityLedgerUIContent$1$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel.class, "processEvent", "processEvent$activity_prodRelease(Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerEvent;)V", 0);
    }
}
