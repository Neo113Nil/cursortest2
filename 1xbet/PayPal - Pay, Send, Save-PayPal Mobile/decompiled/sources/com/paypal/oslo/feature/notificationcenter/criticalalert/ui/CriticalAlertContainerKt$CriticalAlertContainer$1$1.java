package com.paypal.oslo.feature.notificationcenter.criticalalert.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class CriticalAlertContainerKt$CriticalAlertContainer$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<kotlin.Unit> {
    public final void getHighSpeedVideoSizes() {
        ((com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertViewModel) this.receiver).onTabNavigationChanged();
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ kotlin.Unit invoke() {
        getHighSpeedVideoSizes();
        return kotlin.Unit.INSTANCE;
    }

    CriticalAlertContainerKt$CriticalAlertContainer$1$1(java.lang.Object obj) {
        super(0, obj, com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertViewModel.class, "onTabNavigationChanged", "onTabNavigationChanged()V", 0);
    }
}
