package com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class SpecialFinancingDetailScreenKt$SpecialFinancingDetailScreen$2$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.SpecialFinancingDetailEvent, kotlin.Unit> {
    public final void getHighSpeedVideoSizes(com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.SpecialFinancingDetailEvent specialFinancingDetailEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(specialFinancingDetailEvent, "");
        ((com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.SpecialFinancingDetailViewModel) this.receiver).handleEvent(specialFinancingDetailEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.SpecialFinancingDetailEvent specialFinancingDetailEvent) {
        getHighSpeedVideoSizes(specialFinancingDetailEvent);
        return kotlin.Unit.INSTANCE;
    }

    SpecialFinancingDetailScreenKt$SpecialFinancingDetailScreen$2$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.SpecialFinancingDetailViewModel.class, "handleEvent", "handleEvent(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/detail/viewmodel/SpecialFinancingDetailEvent;)V", 0);
    }
}
