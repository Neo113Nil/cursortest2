package com.paypal.oslo.feature.searchandintelligence.ui;

/* loaded from: classes14.dex */
public final class ChatMetricsTrackerImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.searchandintelligence.ui.ChatMetricsTrackerImpl> {
    private final dagger.internal.Provider<kotlin.time.TimeSource> getHighSpeedVideoFpsRanges;

    private ChatMetricsTrackerImpl_Factory(dagger.internal.Provider<kotlin.time.TimeSource> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.searchandintelligence.ui.ChatMetricsTrackerImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.searchandintelligence.ui.ChatMetricsTrackerImpl_Factory create(dagger.internal.Provider<kotlin.time.TimeSource> provider) {
        return new com.paypal.oslo.feature.searchandintelligence.ui.ChatMetricsTrackerImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.searchandintelligence.ui.ChatMetricsTrackerImpl newInstance(kotlin.time.TimeSource timeSource) {
        return new com.paypal.oslo.feature.searchandintelligence.ui.ChatMetricsTrackerImpl(timeSource);
    }
}
