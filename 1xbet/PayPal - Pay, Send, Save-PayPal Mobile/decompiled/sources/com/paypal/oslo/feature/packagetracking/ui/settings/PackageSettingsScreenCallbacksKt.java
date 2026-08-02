package com.paypal.oslo.feature.packagetracking.ui.settings;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsViewModel;", "viewModel", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsScreenCallbacks;", "createPackageSettingsCallbacks", "(Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsViewModel;)Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsScreenCallbacks;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PackageSettingsScreenCallbacksKt {
    public static final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsScreenCallbacks createPackageSettingsCallbacks(final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel packageSettingsViewModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageSettingsViewModel, "");
        return new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsScreenCallbacks(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsScreenCallbacksKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsScreenCallbacksKt.$r8$lambda$gfSYukiOwjtySydRT8AqcaALBOw(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel.this, (com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider) obj);
            }
        }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsScreenCallbacksKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsScreenCallbacksKt.$r8$lambda$CYcL2V4VaUC2PVfVLuS_uD6SBS8(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel.this, (com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider) obj);
            }
        }, new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsScreenCallbacksKt$createPackageSettingsCallbacks$3(packageSettingsViewModel), new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsScreenCallbacksKt$createPackageSettingsCallbacks$4(packageSettingsViewModel), new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsScreenCallbacksKt$createPackageSettingsCallbacks$5(packageSettingsViewModel), new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsScreenCallbacksKt$createPackageSettingsCallbacks$6(packageSettingsViewModel));
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CYcL2V4VaUC2PVfVLuS_uD6SBS8(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel packageSettingsViewModel, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailProvider, "");
        packageSettingsViewModel.processScreenEvent(new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.UnlinkEmail.UnlinkClicked(emailProvider));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gfSYukiOwjtySydRT8AqcaALBOw(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel packageSettingsViewModel, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailProvider, "");
        packageSettingsViewModel.processScreenEvent(new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.LinkEmail.LinkClicked(emailProvider));
        return kotlin.Unit.INSTANCE;
    }
}
