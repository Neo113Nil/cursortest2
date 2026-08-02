package com.paypal.oslo.core.security.di;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/security/di/SecurityModule;", "", "Lcom/paypal/oslo/core/security/MagnesRiskDataProvider;", "impl", "Lcom/paypal/oslo/core/security/RiskDataProvider;", "bindsRiskInfoProvider", "(Lcom/paypal/oslo/core/security/MagnesRiskDataProvider;)Lcom/paypal/oslo/core/security/RiskDataProvider;", "Lcom/paypal/oslo/core/security/clipboard/SecureClipboardManagerImpl;", "Lcom/paypal/oslo/core/security/clipboard/SecureClipboardManager;", "bindsSecureClipboardManager", "(Lcom/paypal/oslo/core/security/clipboard/SecureClipboardManagerImpl;)Lcom/paypal/oslo/core/security/clipboard/SecureClipboardManager;", "Lcom/paypal/oslo/core/security/initializer/RiskDataConfiguratorImpl;", "Lcom/paypal/oslo/core/security/initializer/RiskDataConfigurator;", "bindsRiskDataConfigurator", "(Lcom/paypal/oslo/core/security/initializer/RiskDataConfiguratorImpl;)Lcom/paypal/oslo/core/security/initializer/RiskDataConfigurator;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes5.dex */
public interface SecurityModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.core.security.di.SecurityModule.Companion INSTANCE = com.paypal.oslo.core.security.di.SecurityModule.Companion.getHighSpeedVideoFpsRangesFor;

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.core.security.initializer.RiskDataConfigurator bindsRiskDataConfigurator(com.paypal.oslo.core.security.initializer.RiskDataConfiguratorImpl impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.core.security.RiskDataProvider bindsRiskInfoProvider(com.paypal.oslo.core.security.MagnesRiskDataProvider impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.core.security.clipboard.SecureClipboardManager bindsSecureClipboardManager(com.paypal.oslo.core.security.clipboard.SecureClipboardManagerImpl impl);

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/core/security/di/SecurityModule$Companion;", "", "<init>", "()V", "Llib/android/paypal/com/magnessdk/MagnesSDK;", "providesMagnesSDK", "()Llib/android/paypal/com/magnessdk/MagnesSDK;", "Ljava/util/concurrent/CountDownLatch;", "providesSecuritySetupLatch", "()Ljava/util/concurrent/CountDownLatch;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.paypal.oslo.core.security.di.SecurityModule.Companion getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.core.security.di.SecurityModule.Companion();

        private Companion() {
        }

        @dagger.Provides
        @javax.inject.Singleton
        public final lib.android.paypal.com.magnessdk.MagnesSDK providesMagnesSDK() {
            lib.android.paypal.com.magnessdk.MagnesSDK magnesSDK = lib.android.paypal.com.magnessdk.MagnesSDK.getInstance();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(magnesSDK, "");
            return magnesSDK;
        }

        @dagger.Provides
        @javax.inject.Singleton
        public final java.util.concurrent.CountDownLatch providesSecuritySetupLatch() {
            return new java.util.concurrent.CountDownLatch(1);
        }
    }
}
