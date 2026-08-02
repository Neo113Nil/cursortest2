package com.paypal.oslo.feature.settings.ui.screens;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class SettingsScreenKt$SettingsScreenWithEffects$6$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent, kotlin.Unit> {
    public final void getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent settingsEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsEvent, "");
        ((com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel) this.receiver).onIntent(settingsEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent settingsEvent) {
        getHighResolutionOutputSizeshNQ4ISI(settingsEvent);
        return kotlin.Unit.INSTANCE;
    }

    SettingsScreenKt$SettingsScreenWithEffects$6$1$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel.class, "onIntent", "onIntent(Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent;)V", 0);
    }
}
