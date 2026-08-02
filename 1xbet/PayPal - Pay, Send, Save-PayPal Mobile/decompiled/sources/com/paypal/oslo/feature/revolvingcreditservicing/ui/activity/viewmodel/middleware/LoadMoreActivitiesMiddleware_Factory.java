package com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware;

/* loaded from: classes14.dex */
public final class LoadMoreActivitiesMiddleware_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.LoadMoreActivitiesMiddleware> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.activities.GetFinancialActivitiesUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubTransactionItemUiModelMapper> getHighSpeedVideoSizes;

    private LoadMoreActivitiesMiddleware_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.activities.GetFinancialActivitiesUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubTransactionItemUiModelMapper> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.LoadMoreActivitiesMiddleware get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.LoadMoreActivitiesMiddleware_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.activities.GetFinancialActivitiesUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubTransactionItemUiModelMapper> provider2) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.LoadMoreActivitiesMiddleware_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.LoadMoreActivitiesMiddleware newInstance(com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.activities.GetFinancialActivitiesUseCase getFinancialActivitiesUseCase, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubTransactionItemUiModelMapper activityHubTransactionItemUiModelMapper) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.LoadMoreActivitiesMiddleware(getFinancialActivitiesUseCase, activityHubTransactionItemUiModelMapper);
    }
}
