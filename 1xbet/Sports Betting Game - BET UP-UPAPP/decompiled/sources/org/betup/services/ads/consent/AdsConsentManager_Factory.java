package org.betup.services.ads.consent;

import dagger.internal.Factory;

/* loaded from: classes2.dex */
public final class AdsConsentManager_Factory implements Factory<AdsConsentManager> {
    private static final AdsConsentManager_Factory INSTANCE = new AdsConsentManager_Factory();

    @Override // javax.inject.Provider
    public AdsConsentManager get() {
        return new AdsConsentManager();
    }

    public static AdsConsentManager_Factory create() {
        return INSTANCE;
    }
}
