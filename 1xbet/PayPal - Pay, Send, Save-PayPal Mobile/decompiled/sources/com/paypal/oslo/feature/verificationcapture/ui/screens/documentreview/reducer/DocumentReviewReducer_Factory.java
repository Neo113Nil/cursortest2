package com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.reducer;

/* loaded from: classes15.dex */
public final class DocumentReviewReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.reducer.DocumentReviewReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.reducer.DocumentReviewReducer get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.reducer.DocumentReviewReducer_Factory create() {
        return com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.reducer.DocumentReviewReducer_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.reducer.DocumentReviewReducer newInstance() {
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.reducer.DocumentReviewReducer();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.reducer.DocumentReviewReducer_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.reducer.DocumentReviewReducer_Factory();

        private InstanceHolder() {
        }
    }
}
