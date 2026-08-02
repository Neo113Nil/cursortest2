package com.paypal.oslo.feature.packagetracking.ui.settings;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class PackageSettingsScreenCallbacksKt$createPackageSettingsCallbacks$6 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<kotlin.Unit> {
    public final void getHighSpeedVideoSizes() {
        ((com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel) this.receiver).onCloseWebView();
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ kotlin.Unit invoke() {
        getHighSpeedVideoSizes();
        return kotlin.Unit.INSTANCE;
    }

    PackageSettingsScreenCallbacksKt$createPackageSettingsCallbacks$6(java.lang.Object obj) {
        super(0, obj, com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel.class, "onCloseWebView", "onCloseWebView()V", 0);
    }
}
