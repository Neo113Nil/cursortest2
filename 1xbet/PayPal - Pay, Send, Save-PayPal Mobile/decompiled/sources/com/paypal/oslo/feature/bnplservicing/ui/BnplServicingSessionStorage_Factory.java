package com.paypal.oslo.feature.bnplservicing.ui;

/* loaded from: classes11.dex */
public final class BnplServicingSessionStorage_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.ui.BnplServicingSessionStorage> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.ui.BnplServicingSessionStorage get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.BnplServicingSessionStorage_Factory create() {
        return com.paypal.oslo.feature.bnplservicing.ui.BnplServicingSessionStorage_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.BnplServicingSessionStorage newInstance() {
        return new com.paypal.oslo.feature.bnplservicing.ui.BnplServicingSessionStorage();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.bnplservicing.ui.BnplServicingSessionStorage_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.bnplservicing.ui.BnplServicingSessionStorage_Factory();

        private InstanceHolder() {
        }
    }
}
