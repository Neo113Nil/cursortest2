package com.paypal.oslo.feature.packagetracking.ui.settings;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class PackageSettingsScreenKt$PackageSettingsScreen$6$3$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailProvider, "");
        ((com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel) this.receiver).onLinkEmailClick(emailProvider);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider) {
        getHighSpeedVideoFpsRangesFor(emailProvider);
        return kotlin.Unit.INSTANCE;
    }

    PackageSettingsScreenKt$PackageSettingsScreen$6$3$1$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel.class, "onLinkEmailClick", "onLinkEmailClick(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;)V", 0);
    }
}
