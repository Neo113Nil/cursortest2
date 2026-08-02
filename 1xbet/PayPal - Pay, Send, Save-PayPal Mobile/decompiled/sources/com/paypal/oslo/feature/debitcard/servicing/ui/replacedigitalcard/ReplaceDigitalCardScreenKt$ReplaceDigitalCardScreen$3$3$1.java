package com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class ReplaceDigitalCardScreenKt$ReplaceDigitalCardScreen$3$3$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardEvent, kotlin.Unit> {
    public final void Camera2StreamConfigurationMap(com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardEvent replaceDigitalCardEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(replaceDigitalCardEvent, "");
        ((com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.viewmodel.ReplaceDigitalCardViewModel) this.receiver).processEvent(replaceDigitalCardEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardEvent replaceDigitalCardEvent) {
        Camera2StreamConfigurationMap(replaceDigitalCardEvent);
        return kotlin.Unit.INSTANCE;
    }

    ReplaceDigitalCardScreenKt$ReplaceDigitalCardScreen$3$3$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.viewmodel.ReplaceDigitalCardViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/feature/debitcard/servicing/ui/replacedigitalcard/mvi/ReplaceDigitalCardEvent;)V", 0);
    }
}
