package com.paypal.oslo.feature.taxanddocumentcenter.di.module;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/di/module/DownloadOrchestratorModule;", "", "<init>", "()V", "Lkotlinx/coroutines/CoroutineScope;", "provideDownloadOrchestratorScope", "()Lkotlinx/coroutines/CoroutineScope;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes15.dex */
public final class DownloadOrchestratorModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.di.module.DownloadOrchestratorModule INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.di.module.DownloadOrchestratorModule();

    private DownloadOrchestratorModule() {
    }

    @dagger.Provides
    @javax.inject.Named("downloadOrchestratorScope")
    public final kotlinx.coroutines.CoroutineScope provideDownloadOrchestratorScope() {
        return kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null).plus(kotlinx.coroutines.Dispatchers.getMain().getImmediate()));
    }
}
