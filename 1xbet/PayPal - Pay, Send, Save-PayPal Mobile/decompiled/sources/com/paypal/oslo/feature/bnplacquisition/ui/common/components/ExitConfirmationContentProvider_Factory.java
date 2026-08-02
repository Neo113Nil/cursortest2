package com.paypal.oslo.feature.bnplacquisition.ui.common.components;

/* loaded from: classes11.dex */
public final class ExitConfirmationContentProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.ui.common.components.ExitConfirmationContentProvider> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.ExitConfirmationContentProvider get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.common.components.ExitConfirmationContentProvider_Factory create() {
        return com.paypal.oslo.feature.bnplacquisition.ui.common.components.ExitConfirmationContentProvider_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.common.components.ExitConfirmationContentProvider newInstance() {
        return new com.paypal.oslo.feature.bnplacquisition.ui.common.components.ExitConfirmationContentProvider();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.bnplacquisition.ui.common.components.ExitConfirmationContentProvider_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.ExitConfirmationContentProvider_Factory();

        private InstanceHolder() {
        }
    }
}
