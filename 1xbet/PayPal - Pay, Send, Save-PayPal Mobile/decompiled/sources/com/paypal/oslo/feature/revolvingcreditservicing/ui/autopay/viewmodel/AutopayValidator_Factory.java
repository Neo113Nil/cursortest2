package com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel;

/* loaded from: classes14.dex */
public final class AutopayValidator_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayValidator> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayValidator get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayValidator_Factory create() {
        return com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayValidator_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayValidator newInstance() {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayValidator();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayValidator_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayValidator_Factory();

        private InstanceHolder() {
        }
    }
}
