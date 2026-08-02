package com.paypal.oslo.feature.businesshome.ui.businessexperiencedisabled;

/* loaded from: classes11.dex */
public final class BusinessExperienceDisabledViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businesshome.ui.businessexperiencedisabled.BusinessExperienceDisabledViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.api.IdentitySession> getHighSpeedVideoSizes;

    private BusinessExperienceDisabledViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.api.IdentitySession> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesshome.ui.businessexperiencedisabled.BusinessExperienceDisabledViewModel get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.businesshome.ui.businessexperiencedisabled.BusinessExperienceDisabledViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.api.IdentitySession> provider) {
        return new com.paypal.oslo.feature.businesshome.ui.businessexperiencedisabled.BusinessExperienceDisabledViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.businesshome.ui.businessexperiencedisabled.BusinessExperienceDisabledViewModel newInstance(com.paypal.oslo.feature.identity.api.IdentitySession identitySession) {
        return new com.paypal.oslo.feature.businesshome.ui.businessexperiencedisabled.BusinessExperienceDisabledViewModel(identitySession);
    }
}
