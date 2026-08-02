package com.paypal.oslo.feature.p2p.ui.review.mappers;

/* loaded from: classes13.dex */
public final class TransferErrorToUiTextMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.ui.review.mappers.TransferErrorToUiTextMapper> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.ui.review.mappers.TransferErrorToUiTextMapper get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.p2p.ui.review.mappers.TransferErrorToUiTextMapper_Factory create() {
        return com.paypal.oslo.feature.p2p.ui.review.mappers.TransferErrorToUiTextMapper_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.p2p.ui.review.mappers.TransferErrorToUiTextMapper newInstance() {
        return new com.paypal.oslo.feature.p2p.ui.review.mappers.TransferErrorToUiTextMapper();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.p2p.ui.review.mappers.TransferErrorToUiTextMapper_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.p2p.ui.review.mappers.TransferErrorToUiTextMapper_Factory();

        private InstanceHolder() {
        }
    }
}
