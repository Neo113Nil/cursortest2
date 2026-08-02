package com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class FundingSourceSelectorScreenKt$FundingSourceSelectorScreen$addCardHandler$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent, kotlin.Unit> {
    public final void getHighSpeedVideoSizes(com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent fundingSourceSelectorEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingSourceSelectorEvent, "");
        ((com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.viewmodel.FundingSourceSelectorViewModel) this.receiver).processEvent(fundingSourceSelectorEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent fundingSourceSelectorEvent) {
        getHighSpeedVideoSizes(fundingSourceSelectorEvent);
        return kotlin.Unit.INSTANCE;
    }

    FundingSourceSelectorScreenKt$FundingSourceSelectorScreen$addCardHandler$1$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.viewmodel.FundingSourceSelectorViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/core/mvi/Event;)V", 0);
    }
}
