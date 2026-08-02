package com.paypal.oslo.feature.searchandintelligence.ui;

/* loaded from: classes14.dex */
public final class ChatReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.searchandintelligence.ui.ChatReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.searchandintelligence.ui.ChatReducer get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.searchandintelligence.ui.ChatReducer_Factory create() {
        return com.paypal.oslo.feature.searchandintelligence.ui.ChatReducer_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.searchandintelligence.ui.ChatReducer newInstance() {
        return new com.paypal.oslo.feature.searchandintelligence.ui.ChatReducer();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.searchandintelligence.ui.ChatReducer_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.searchandintelligence.ui.ChatReducer_Factory();

        private InstanceHolder() {
        }
    }
}
