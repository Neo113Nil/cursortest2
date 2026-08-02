package com.paypal.oslo.feature.notificationcenter.criticalalert.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class CriticalAlertContainerKt$CriticalAlertContainer$4$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.notificationcenter.criticalalert.domain.model.CriticalAlertData, kotlin.Unit> {
    public final void Camera2StreamConfigurationMap(com.paypal.oslo.feature.notificationcenter.criticalalert.domain.model.CriticalAlertData criticalAlertData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(criticalAlertData, "");
        ((com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertViewModel) this.receiver).onAlertClicked(criticalAlertData);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.notificationcenter.criticalalert.domain.model.CriticalAlertData criticalAlertData) {
        Camera2StreamConfigurationMap(criticalAlertData);
        return kotlin.Unit.INSTANCE;
    }

    CriticalAlertContainerKt$CriticalAlertContainer$4$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertViewModel.class, "onAlertClicked", "onAlertClicked(Lcom/paypal/oslo/feature/notificationcenter/criticalalert/domain/model/CriticalAlertData;)V", 0);
    }
}
