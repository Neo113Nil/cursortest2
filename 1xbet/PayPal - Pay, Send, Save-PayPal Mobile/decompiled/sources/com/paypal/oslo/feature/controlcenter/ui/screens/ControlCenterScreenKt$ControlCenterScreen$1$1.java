package com.paypal.oslo.feature.controlcenter.ui.screens;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class ControlCenterScreenKt$ControlCenterScreen$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent, kotlin.Unit> {
    public final void Camera2StreamConfigurationMap(com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent controlCenterEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(controlCenterEvent, "");
        ((com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel) this.receiver).processEvent(controlCenterEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent controlCenterEvent) {
        Camera2StreamConfigurationMap(controlCenterEvent);
        return kotlin.Unit.INSTANCE;
    }

    ControlCenterScreenKt$ControlCenterScreen$1$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/feature/controlcenter/ui/events/ControlCenterEvent;)V", 0);
    }
}
