package com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui;

/* loaded from: classes13.dex */
public final class NameViewDisplayComponentViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewDisplayComponentViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.NameFormatUseCase> getHighSpeedVideoFpsRanges;

    private NameViewDisplayComponentViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.NameFormatUseCase> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewDisplayComponentViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewDisplayComponentViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.NameFormatUseCase> provider) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewDisplayComponentViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewDisplayComponentViewModel newInstance(com.paypal.oslo.core.i18n.domain.usecase.NameFormatUseCase nameFormatUseCase) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewDisplayComponentViewModel(nameFormatUseCase);
    }
}
