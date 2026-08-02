package com.paypal.oslo.feature.bnplacquisition.ui.address.overview;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final class AddressOverviewScreenKt$AddressOverviewSuccessContent$1$10$1 implements kotlin.jvm.functions.Function0<kotlin.Unit> {
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent, kotlin.Unit> Camera2StreamConfigurationMap;

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
        this.Camera2StreamConfigurationMap.invoke(com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent.DonePressed.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    AddressOverviewScreenKt$AddressOverviewSuccessContent$1$10$1(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent, kotlin.Unit> function1) {
        this.Camera2StreamConfigurationMap = function1;
    }
}
