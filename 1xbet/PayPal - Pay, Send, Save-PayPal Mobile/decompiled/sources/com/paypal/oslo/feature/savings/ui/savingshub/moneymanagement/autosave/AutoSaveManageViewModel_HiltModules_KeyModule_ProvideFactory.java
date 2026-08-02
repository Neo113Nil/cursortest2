package com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave;

/* loaded from: classes14.dex */
public final class AutoSaveManageViewModel_HiltModules_KeyModule_ProvideFactory implements dagger.internal.Factory<java.lang.Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Boolean get() {
        return java.lang.Boolean.valueOf(provide());
    }

    public static com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel_HiltModules_KeyModule_ProvideFactory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static boolean provide() {
        return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel_HiltModules.KeyModule.provide();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel_HiltModules_KeyModule_ProvideFactory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
