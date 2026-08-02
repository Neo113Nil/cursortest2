package com.paypal.oslo.feature.bnplacquisition.ui.contentviewer;

/* loaded from: classes11.dex */
public final class ContentViewerViewModel_HiltModules_KeyModule_ProvideFactory implements dagger.internal.Factory<java.lang.Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Boolean get() {
        return java.lang.Boolean.valueOf(provide());
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerViewModel_HiltModules_KeyModule_ProvideFactory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static boolean provide() {
        return com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerViewModel_HiltModules.KeyModule.provide();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerViewModel_HiltModules_KeyModule_ProvideFactory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
