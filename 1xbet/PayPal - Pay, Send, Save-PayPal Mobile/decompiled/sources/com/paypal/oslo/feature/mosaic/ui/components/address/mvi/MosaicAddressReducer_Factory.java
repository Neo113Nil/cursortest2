package com.paypal.oslo.feature.mosaic.ui.components.address.mvi;

/* loaded from: classes13.dex */
public final class MosaicAddressReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressReducer get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressReducer_Factory create() {
        return com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressReducer_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressReducer newInstance() {
        return new com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressReducer();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressReducer_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressReducer_Factory();

        private InstanceHolder() {
        }
    }
}
