package com.paypal.oslo.downloads.impl.util;

/* loaded from: classes10.dex */
public final class ResponseMetadataExtractor_Factory implements dagger.internal.Factory<com.paypal.oslo.downloads.impl.util.ResponseMetadataExtractor> {
    private final dagger.internal.Provider<com.paypal.oslo.downloads.impl.validation.MimeTypeDetector> getHighSpeedVideoFpsRanges;

    private ResponseMetadataExtractor_Factory(dagger.internal.Provider<com.paypal.oslo.downloads.impl.validation.MimeTypeDetector> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.downloads.impl.util.ResponseMetadataExtractor get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.downloads.impl.util.ResponseMetadataExtractor_Factory create(dagger.internal.Provider<com.paypal.oslo.downloads.impl.validation.MimeTypeDetector> provider) {
        return new com.paypal.oslo.downloads.impl.util.ResponseMetadataExtractor_Factory(provider);
    }

    public static com.paypal.oslo.downloads.impl.util.ResponseMetadataExtractor newInstance(com.paypal.oslo.downloads.impl.validation.MimeTypeDetector mimeTypeDetector) {
        return new com.paypal.oslo.downloads.impl.util.ResponseMetadataExtractor(mimeTypeDetector);
    }
}
