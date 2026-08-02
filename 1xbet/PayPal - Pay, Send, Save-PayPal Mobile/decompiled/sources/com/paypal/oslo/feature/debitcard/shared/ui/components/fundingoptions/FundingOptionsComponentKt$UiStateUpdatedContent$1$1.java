package com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class FundingOptionsComponentKt$UiStateUpdatedContent$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent fundingOptionsComponentEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingOptionsComponentEvent, "");
        ((com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.viewmodel.FundingOptionsComponentViewModel) this.receiver).processEvent(fundingOptionsComponentEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent fundingOptionsComponentEvent) {
        getHighSpeedVideoFpsRangesFor(fundingOptionsComponentEvent);
        return kotlin.Unit.INSTANCE;
    }

    FundingOptionsComponentKt$UiStateUpdatedContent$1$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.viewmodel.FundingOptionsComponentViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/core/mvi/Event;)V", 0);
    }
}
