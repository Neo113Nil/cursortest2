package com.paypal.oslo.feature.searchandintelligence.ui;

/* loaded from: classes14.dex */
public final class PrivacyDisclosureOpener_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.searchandintelligence.ui.PrivacyDisclosureOpener> {
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> Camera2StreamConfigurationMap;

    private PrivacyDisclosureOpener_Factory(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.searchandintelligence.ui.PrivacyDisclosureOpener get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.searchandintelligence.ui.PrivacyDisclosureOpener_Factory create(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider) {
        return new com.paypal.oslo.feature.searchandintelligence.ui.PrivacyDisclosureOpener_Factory(provider);
    }

    public static com.paypal.oslo.feature.searchandintelligence.ui.PrivacyDisclosureOpener newInstance(com.paypal.oslo.core.userstore.UserStore userStore) {
        return new com.paypal.oslo.feature.searchandintelligence.ui.PrivacyDisclosureOpener(userStore);
    }
}
