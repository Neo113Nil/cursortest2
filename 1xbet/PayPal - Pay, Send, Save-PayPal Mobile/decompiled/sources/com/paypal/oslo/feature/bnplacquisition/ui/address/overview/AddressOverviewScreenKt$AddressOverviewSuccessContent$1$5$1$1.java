package com.paypal.oslo.feature.bnplacquisition.ui.address.overview;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final class AddressOverviewScreenKt$AddressOverviewSuccessContent$1$5$1$1 implements kotlin.jvm.functions.Function2<com.paypal.pds.components.SelectionCardModel, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent, kotlin.Unit> getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.pds.components.SelectionCardModel selectionCardModel, java.lang.Integer num) {
        com.paypal.pds.components.SelectionCardModel selectionCardModel2 = selectionCardModel;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectionCardModel2, "");
        this.getHighSpeedVideoFpsRangesFor.invoke(new com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent.AddressSelected(selectionCardModel2.getId()));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    AddressOverviewScreenKt$AddressOverviewSuccessContent$1$5$1$1(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent, kotlin.Unit> function1) {
        this.getHighSpeedVideoFpsRangesFor = function1;
    }
}
