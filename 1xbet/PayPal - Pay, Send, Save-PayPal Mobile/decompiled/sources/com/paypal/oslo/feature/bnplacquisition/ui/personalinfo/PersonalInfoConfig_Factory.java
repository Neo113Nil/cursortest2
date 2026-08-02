package com.paypal.oslo.feature.bnplacquisition.ui.personalinfo;

/* loaded from: classes11.dex */
public final class PersonalInfoConfig_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoConfig> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.ConfigContext> getHighSpeedVideoSizes;

    private PersonalInfoConfig_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.ConfigContext> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoConfig get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoConfig_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.ConfigContext> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoConfig_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoConfig newInstance(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoConfig(configContext);
    }
}
