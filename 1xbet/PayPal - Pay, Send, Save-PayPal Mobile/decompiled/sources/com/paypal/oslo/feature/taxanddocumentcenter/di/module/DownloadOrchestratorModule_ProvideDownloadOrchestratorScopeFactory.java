package com.paypal.oslo.feature.taxanddocumentcenter.di.module;

/* loaded from: classes15.dex */
public final class DownloadOrchestratorModule_ProvideDownloadOrchestratorScopeFactory implements dagger.internal.Factory<kotlinx.coroutines.CoroutineScope> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlinx.coroutines.CoroutineScope get() {
        return provideDownloadOrchestratorScope();
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.di.module.DownloadOrchestratorModule_ProvideDownloadOrchestratorScopeFactory create() {
        return com.paypal.oslo.feature.taxanddocumentcenter.di.module.DownloadOrchestratorModule_ProvideDownloadOrchestratorScopeFactory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static kotlinx.coroutines.CoroutineScope provideDownloadOrchestratorScope() {
        return (kotlinx.coroutines.CoroutineScope) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.taxanddocumentcenter.di.module.DownloadOrchestratorModule.INSTANCE.provideDownloadOrchestratorScope());
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.taxanddocumentcenter.di.module.DownloadOrchestratorModule_ProvideDownloadOrchestratorScopeFactory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.taxanddocumentcenter.di.module.DownloadOrchestratorModule_ProvideDownloadOrchestratorScopeFactory();

        private InstanceHolder() {
        }
    }
}
