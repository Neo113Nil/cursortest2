package com.paypal.oslo.downloads.impl.validation;

/* loaded from: classes10.dex */
public final class ChecksumCalculator_Factory implements dagger.internal.Factory<com.paypal.oslo.downloads.impl.validation.ChecksumCalculator> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.downloads.impl.validation.ChecksumCalculator get() {
        return newInstance();
    }

    public static com.paypal.oslo.downloads.impl.validation.ChecksumCalculator_Factory create() {
        return com.paypal.oslo.downloads.impl.validation.ChecksumCalculator_Factory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static com.paypal.oslo.downloads.impl.validation.ChecksumCalculator newInstance() {
        return new com.paypal.oslo.downloads.impl.validation.ChecksumCalculator();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.downloads.impl.validation.ChecksumCalculator_Factory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.downloads.impl.validation.ChecksumCalculator_Factory();

        private InstanceHolder() {
        }
    }
}
