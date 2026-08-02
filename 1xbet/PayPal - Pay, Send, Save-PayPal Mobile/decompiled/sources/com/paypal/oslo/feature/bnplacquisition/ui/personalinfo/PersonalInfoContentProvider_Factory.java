package com.paypal.oslo.feature.bnplacquisition.ui.personalinfo;

/* loaded from: classes11.dex */
public final class PersonalInfoContentProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoContentProvider> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.ConfigContext> getHighSpeedVideoSizes;

    private PersonalInfoContentProvider_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.ConfigContext> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoContentProvider get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoContentProvider_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.ConfigContext> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoContentProvider_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoContentProvider newInstance(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoContentProvider(configContext);
    }
}
