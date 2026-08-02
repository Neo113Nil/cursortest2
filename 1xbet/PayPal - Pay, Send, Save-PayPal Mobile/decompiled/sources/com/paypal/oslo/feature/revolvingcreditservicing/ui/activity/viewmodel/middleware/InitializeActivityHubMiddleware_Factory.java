package com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware;

/* loaded from: classes14.dex */
public final class InitializeActivityHubMiddleware_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.InitializeActivityHubMiddleware> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.activities.GetFinancialActivitiesOverviewUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubSectionMapper> getHighSpeedVideoSizes;

    private InitializeActivityHubMiddleware_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.activities.GetFinancialActivitiesOverviewUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubSectionMapper> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.InitializeActivityHubMiddleware get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.InitializeActivityHubMiddleware_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.activities.GetFinancialActivitiesOverviewUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubSectionMapper> provider2) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.InitializeActivityHubMiddleware_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.InitializeActivityHubMiddleware newInstance(com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.activities.GetFinancialActivitiesOverviewUseCase getFinancialActivitiesOverviewUseCase, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubSectionMapper activityHubSectionMapper) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.InitializeActivityHubMiddleware(getFinancialActivitiesOverviewUseCase, activityHubSectionMapper);
    }
}
