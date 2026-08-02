package com.paypal.oslo.downloads.impl.validation;

/* loaded from: classes10.dex */
public final class DefaultContentValidator_Factory implements dagger.internal.Factory<com.paypal.oslo.downloads.impl.validation.DefaultContentValidator> {
    private final dagger.internal.Provider<com.paypal.oslo.downloads.impl.validation.ChecksumCalculator> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.downloads.impl.validation.MimeTypeDetector> getHighSpeedVideoSizes;

    private DefaultContentValidator_Factory(dagger.internal.Provider<com.paypal.oslo.downloads.impl.validation.MimeTypeDetector> provider, dagger.internal.Provider<com.paypal.oslo.downloads.impl.validation.ChecksumCalculator> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.downloads.impl.validation.DefaultContentValidator get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.downloads.impl.validation.DefaultContentValidator_Factory create(dagger.internal.Provider<com.paypal.oslo.downloads.impl.validation.MimeTypeDetector> provider, dagger.internal.Provider<com.paypal.oslo.downloads.impl.validation.ChecksumCalculator> provider2) {
        return new com.paypal.oslo.downloads.impl.validation.DefaultContentValidator_Factory(provider, provider2);
    }

    public static com.paypal.oslo.downloads.impl.validation.DefaultContentValidator newInstance(com.paypal.oslo.downloads.impl.validation.MimeTypeDetector mimeTypeDetector, com.paypal.oslo.downloads.impl.validation.ChecksumCalculator checksumCalculator) {
        return new com.paypal.oslo.downloads.impl.validation.DefaultContentValidator(mimeTypeDetector, checksumCalculator);
    }
}
