package com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel;

/* loaded from: classes14.dex */
public final class GetStatementDetailsMiddleware_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.GetStatementDetailsMiddleware> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.mapper.StatementDetailsUiModelMapper> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.statements.DownloadStatementUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetProductConfigurationsUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetStatementDetailsUseCase> getHighSpeedVideoSizes;

    private GetStatementDetailsMiddleware_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetStatementDetailsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.statements.DownloadStatementUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetProductConfigurationsUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.mapper.StatementDetailsUiModelMapper> provider4) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.Camera2StreamConfigurationMap = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.GetStatementDetailsMiddleware get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.GetStatementDetailsMiddleware_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetStatementDetailsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.statements.DownloadStatementUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetProductConfigurationsUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.mapper.StatementDetailsUiModelMapper> provider4) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.GetStatementDetailsMiddleware_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.GetStatementDetailsMiddleware newInstance(com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetStatementDetailsUseCase getStatementDetailsUseCase, com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.statements.DownloadStatementUseCase downloadStatementUseCase, com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetProductConfigurationsUseCase getProductConfigurationsUseCase, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.mapper.StatementDetailsUiModelMapper statementDetailsUiModelMapper) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.GetStatementDetailsMiddleware(getStatementDetailsUseCase, downloadStatementUseCase, getProductConfigurationsUseCase, statementDetailsUiModelMapper);
    }
}
