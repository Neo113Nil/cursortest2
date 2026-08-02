package com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.screen;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class CustomStatementScreenKt$CustomStatementScreen$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent customStatementEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customStatementEvent, "");
        ((com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementViewModel) this.receiver).processEvent(customStatementEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent customStatementEvent) {
        getHighSpeedVideoFpsRangesFor(customStatementEvent);
        return kotlin.Unit.INSTANCE;
    }

    CustomStatementScreenKt$CustomStatementScreen$1$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementEvent;)V", 0);
    }
}
