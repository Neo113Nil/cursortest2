package com.paypal.oslo.feature.shaketoreport.domain.usecase;

/* loaded from: classes14.dex */
public final class SendBugReportUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.shaketoreport.domain.usecase.SendBugReportUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.shaketoreport.domain.repository.BugReportRepository> Camera2StreamConfigurationMap;

    private SendBugReportUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.shaketoreport.domain.repository.BugReportRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.shaketoreport.domain.usecase.SendBugReportUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.shaketoreport.domain.usecase.SendBugReportUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.shaketoreport.domain.repository.BugReportRepository> provider) {
        return new com.paypal.oslo.feature.shaketoreport.domain.usecase.SendBugReportUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.shaketoreport.domain.usecase.SendBugReportUseCase newInstance(com.paypal.oslo.feature.shaketoreport.domain.repository.BugReportRepository bugReportRepository) {
        return new com.paypal.oslo.feature.shaketoreport.domain.usecase.SendBugReportUseCase(bugReportRepository);
    }
}
