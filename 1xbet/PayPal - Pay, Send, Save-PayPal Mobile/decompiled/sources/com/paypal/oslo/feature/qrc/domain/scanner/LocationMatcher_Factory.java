package com.paypal.oslo.feature.qrc.domain.scanner;

/* loaded from: classes14.dex */
public final class LocationMatcher_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.qrc.domain.scanner.LocationMatcher> {
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoSizes;

    private LocationMatcher_Factory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.qrc.domain.scanner.LocationMatcher get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.qrc.domain.scanner.LocationMatcher_Factory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.feature.qrc.domain.scanner.LocationMatcher_Factory(provider);
    }

    public static com.paypal.oslo.feature.qrc.domain.scanner.LocationMatcher newInstance(android.content.Context context) {
        return new com.paypal.oslo.feature.qrc.domain.scanner.LocationMatcher(context);
    }
}
