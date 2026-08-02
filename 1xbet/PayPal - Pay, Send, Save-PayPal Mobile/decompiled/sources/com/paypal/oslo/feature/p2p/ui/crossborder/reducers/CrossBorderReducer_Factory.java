package com.paypal.oslo.feature.p2p.ui.crossborder.reducers;

/* loaded from: classes13.dex */
public final class CrossBorderReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.ui.crossborder.reducers.CrossBorderReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.ui.crossborder.reducers.CrossBorderReducer get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.p2p.ui.crossborder.reducers.CrossBorderReducer_Factory create() {
        return com.paypal.oslo.feature.p2p.ui.crossborder.reducers.CrossBorderReducer_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.p2p.ui.crossborder.reducers.CrossBorderReducer newInstance() {
        return new com.paypal.oslo.feature.p2p.ui.crossborder.reducers.CrossBorderReducer();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.p2p.ui.crossborder.reducers.CrossBorderReducer_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.p2p.ui.crossborder.reducers.CrossBorderReducer_Factory();

        private InstanceHolder() {
        }
    }
}
