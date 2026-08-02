package com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityLedgerUpcomingSectionsContentComposeKt$UpcomingSectionItemView$lambda$0$0$$inlined$items$default$2 implements kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object> {
    final /* synthetic */ java.util.List getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function1 getHighSpeedVideoSizes;

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
        return invoke(num.intValue());
    }

    public final java.lang.Object invoke(int i) {
        return this.getHighSpeedVideoSizes.invoke(this.getHighSpeedVideoFpsRangesFor.get(i));
    }

    public ActivityLedgerUpcomingSectionsContentComposeKt$UpcomingSectionItemView$lambda$0$0$$inlined$items$default$2(kotlin.jvm.functions.Function1 function1, java.util.List list) {
        this.getHighSpeedVideoSizes = function1;
        this.getHighSpeedVideoFpsRangesFor = list;
    }
}
