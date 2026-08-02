package com.paypal.oslo.feature.bnplservicing.ui.changefi;

/* loaded from: classes11.dex */
public final class ChangeFiReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiReducer get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiReducer_Factory create() {
        return com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiReducer_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiReducer newInstance() {
        return new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiReducer();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiReducer_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiReducer_Factory();

        private InstanceHolder() {
        }
    }
}
