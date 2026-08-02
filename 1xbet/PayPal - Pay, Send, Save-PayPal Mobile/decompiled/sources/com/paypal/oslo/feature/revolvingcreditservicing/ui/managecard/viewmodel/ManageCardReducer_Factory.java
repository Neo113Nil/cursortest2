package com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel;

/* loaded from: classes14.dex */
public final class ManageCardReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardReducer get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardReducer_Factory create() {
        return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardReducer_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardReducer newInstance() {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardReducer();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardReducer_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardReducer_Factory();

        private InstanceHolder() {
        }
    }
}
