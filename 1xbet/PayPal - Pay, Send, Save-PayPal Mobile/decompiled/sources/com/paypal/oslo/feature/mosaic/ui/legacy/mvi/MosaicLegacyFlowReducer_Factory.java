package com.paypal.oslo.feature.mosaic.ui.legacy.mvi;

/* loaded from: classes13.dex */
public final class MosaicLegacyFlowReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowReducer get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowReducer_Factory create() {
        return com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowReducer_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowReducer newInstance() {
        return new com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowReducer();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowReducer_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowReducer_Factory();

        private InstanceHolder() {
        }
    }
}
