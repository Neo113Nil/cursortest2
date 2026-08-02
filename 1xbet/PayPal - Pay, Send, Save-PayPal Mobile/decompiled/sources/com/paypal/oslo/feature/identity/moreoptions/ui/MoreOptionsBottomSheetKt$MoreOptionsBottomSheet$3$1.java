package com.paypal.oslo.feature.identity.moreoptions.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class MoreOptionsBottomSheetKt$MoreOptionsBottomSheet$3$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent, kotlin.Unit> {
    public final void getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent moreOptionsEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moreOptionsEvent, "");
        ((com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsViewModel) this.receiver).processEvent(moreOptionsEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent moreOptionsEvent) {
        getHighResolutionOutputSizeshNQ4ISI(moreOptionsEvent);
        return kotlin.Unit.INSTANCE;
    }

    MoreOptionsBottomSheetKt$MoreOptionsBottomSheet$3$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/feature/identity/moreoptions/ui/MoreOptionsEvent;)V", 0);
    }
}
