package com.paypal.oslo.feature.checkcapture.di;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/checkcapture/di/IngoModule;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/checkcapture/fraudforce/CheckCaptureFraudForceManager;", "fraudForceManager", "Lcom/paypal/oslo/feature/checkcapture/ingo/IngoConfigurationProvider;", "configProvider", "Lcom/paypal/oslo/feature/checkcapture/ingo/IngoSdkLauncher;", "provideIngoSdkLauncher", "(Lcom/paypal/oslo/feature/checkcapture/fraudforce/CheckCaptureFraudForceManager;Lcom/paypal/oslo/feature/checkcapture/ingo/IngoConfigurationProvider;)Lcom/paypal/oslo/feature/checkcapture/ingo/IngoSdkLauncher;", "Lcom/paypal/oslo/feature/checkcapture/ingo/IngoResultHandler;", "provideIngoResultHandler", "()Lcom/paypal/oslo/feature/checkcapture/ingo/IngoResultHandler;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes5.dex */
public final class IngoModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.checkcapture.di.IngoModule INSTANCE = new com.paypal.oslo.feature.checkcapture.di.IngoModule();

    private IngoModule() {
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.oslo.feature.checkcapture.ingo.IngoSdkLauncher provideIngoSdkLauncher(com.paypal.oslo.feature.checkcapture.fraudforce.CheckCaptureFraudForceManager fraudForceManager, com.paypal.oslo.feature.checkcapture.ingo.IngoConfigurationProvider configProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fraudForceManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configProvider, "");
        return new com.paypal.oslo.feature.checkcapture.ingo.IngoSdkLauncher(fraudForceManager, configProvider);
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.oslo.feature.checkcapture.ingo.IngoResultHandler provideIngoResultHandler() {
        return new com.paypal.oslo.feature.checkcapture.ingo.IngoResultHandler();
    }
}
