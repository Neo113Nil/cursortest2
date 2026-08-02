package com.zettle.o11y.android.core.configuration;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b"}, d2 = {"Lcom/zettle/o11y/android/core/configuration/PaymentSDKO11YConfiguration;", "", "<init>", "()V", "Lcom/zettle/o11y/android/core/configuration/O11YConfiguration;", "prodConfiguration", "Lcom/zettle/o11y/android/core/configuration/O11YConfiguration;", "getProdConfiguration", "()Lcom/zettle/o11y/android/core/configuration/O11YConfiguration;", "sandboxConfiguration", "getSandboxConfiguration", "stagingConfiguration", "getStagingConfiguration"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PaymentSDKO11YConfiguration {
    public static final com.zettle.o11y.android.core.configuration.PaymentSDKO11YConfiguration INSTANCE = new com.zettle.o11y.android.core.configuration.PaymentSDKO11YConfiguration();
    private static final com.zettle.o11y.android.core.configuration.O11YConfiguration prodConfiguration = new com.zettle.o11y.android.core.configuration.O11YConfiguration(com.zettle.o11y.android.core.configuration.O11YDDInstanceName.PAYMENT_SDK.getInstanceName(), com.zettle.o11y.android.core.configuration.O11YEnvironment.PRODUCTION, "4690333e-ed01-4be5-ab9d-33e913ffaf66", "pub17fc596fe2a9939b36228747f863c3cd", "", kotlin.collections.CollectionsKt.listOf(com.zettle.sdk.BuildConfig.LIBRARY_PACKAGE_NAME), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"izettletest.com", "zettletest.com", "izettlepaytest.com"}));
    private static final com.zettle.o11y.android.core.configuration.O11YConfiguration sandboxConfiguration = new com.zettle.o11y.android.core.configuration.O11YConfiguration(com.zettle.o11y.android.core.configuration.O11YDDInstanceName.PAYMENT_SDK.getInstanceName(), com.zettle.o11y.android.core.configuration.O11YEnvironment.SANDBOX, "4690333e-ed01-4be5-ab9d-33e913ffaf66", "pub17fc596fe2a9939b36228747f863c3cd", "", kotlin.collections.CollectionsKt.listOf(com.zettle.sdk.BuildConfig.LIBRARY_PACKAGE_NAME), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"izettletest.com", "zettletest.com", "izettlepaytest.com"}));
    private static final com.zettle.o11y.android.core.configuration.O11YConfiguration stagingConfiguration = new com.zettle.o11y.android.core.configuration.O11YConfiguration(com.zettle.o11y.android.core.configuration.O11YDDInstanceName.PAYMENT_SDK.getInstanceName(), com.zettle.o11y.android.core.configuration.O11YEnvironment.STAGING, "e6ea32fc-92ad-4963-8818-65108725cfe7", "pub14ef94ce1320923b48bce6c0a5705534", "", kotlin.collections.CollectionsKt.listOf(com.zettle.sdk.BuildConfig.LIBRARY_PACKAGE_NAME), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"izettletest.com", "zettletest.com", "izettlepaytest.com"}));

    private PaymentSDKO11YConfiguration() {
    }

    public final com.zettle.o11y.android.core.configuration.O11YConfiguration getProdConfiguration() {
        return prodConfiguration;
    }

    public final com.zettle.o11y.android.core.configuration.O11YConfiguration getSandboxConfiguration() {
        return sandboxConfiguration;
    }

    public final com.zettle.o11y.android.core.configuration.O11YConfiguration getStagingConfiguration() {
        return stagingConfiguration;
    }
}
