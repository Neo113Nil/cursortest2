package com.paypal.oslo.feature.shaketoreport.utils;

/* loaded from: classes14.dex */
public final class IssueDataFactoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.shaketoreport.utils.IssueDataFactoryImpl> {
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRanges;

    private IssueDataFactoryImpl_Factory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.shaketoreport.utils.IssueDataFactoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.shaketoreport.utils.IssueDataFactoryImpl_Factory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.feature.shaketoreport.utils.IssueDataFactoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.shaketoreport.utils.IssueDataFactoryImpl newInstance(android.content.Context context) {
        return new com.paypal.oslo.feature.shaketoreport.utils.IssueDataFactoryImpl(context);
    }
}
