package com.paypal.oslo.feature.packagetracking.ui.settings;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class PackageSettingsScreenKt$PackageSettingsScreen$6$3$8$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> {
    public final void Camera2StreamConfigurationMap(boolean z) {
        ((com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel) this.receiver).onAmazonTrackingToggle(z);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(java.lang.Boolean bool) {
        Camera2StreamConfigurationMap(bool.booleanValue());
        return kotlin.Unit.INSTANCE;
    }

    PackageSettingsScreenKt$PackageSettingsScreen$6$3$8$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel.class, "onAmazonTrackingToggle", "onAmazonTrackingToggle(Z)V", 0);
    }
}
