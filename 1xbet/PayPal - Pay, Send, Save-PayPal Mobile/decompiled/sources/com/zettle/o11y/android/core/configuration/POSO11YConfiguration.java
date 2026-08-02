package com.zettle.o11y.android.core.configuration;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b"}, d2 = {"Lcom/zettle/o11y/android/core/configuration/POSO11YConfiguration;", "", "<init>", "()V", "Lcom/zettle/o11y/android/core/configuration/O11YConfiguration;", "prodConfiguration", "Lcom/zettle/o11y/android/core/configuration/O11YConfiguration;", "getProdConfiguration", "()Lcom/zettle/o11y/android/core/configuration/O11YConfiguration;", "sandboxConfiguration", "getSandboxConfiguration", "stagingConfiguration", "getStagingConfiguration"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class POSO11YConfiguration {
    public static final com.zettle.o11y.android.core.configuration.POSO11YConfiguration INSTANCE = new com.zettle.o11y.android.core.configuration.POSO11YConfiguration();
    private static final com.zettle.o11y.android.core.configuration.O11YConfiguration prodConfiguration = new com.zettle.o11y.android.core.configuration.O11YConfiguration(com.zettle.o11y.android.core.configuration.O11YDDInstanceName.POS.getInstanceName(), com.zettle.o11y.android.core.configuration.O11YEnvironment.PRODUCTION, "910c2170-d5e9-42ab-a6be-49d8dd43d88f", "pub49956a5c88d0c534385a256846e411b5", "", null, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"izettle.com", "zettle.com"}), 32, null);
    private static final com.zettle.o11y.android.core.configuration.O11YConfiguration sandboxConfiguration = new com.zettle.o11y.android.core.configuration.O11YConfiguration(com.zettle.o11y.android.core.configuration.O11YDDInstanceName.POS.getInstanceName(), com.zettle.o11y.android.core.configuration.O11YEnvironment.SANDBOX, "910c2170-d5e9-42ab-a6be-49d8dd43d88f", "pub49956a5c88d0c534385a256846e411b5", "", null, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"izettlesandbox.com", "izettlepaysandbox.com"}), 32, null);
    private static final com.zettle.o11y.android.core.configuration.O11YConfiguration stagingConfiguration = new com.zettle.o11y.android.core.configuration.O11YConfiguration(com.zettle.o11y.android.core.configuration.O11YDDInstanceName.POS.getInstanceName(), com.zettle.o11y.android.core.configuration.O11YEnvironment.STAGING, "72e26a19-7339-495c-8db8-6a3b07f2fe51", "pubfaee0dad393211dd033a2907330ccb76", "", null, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"izettletest.com", "zettletest.com"}), 32, null);

    private POSO11YConfiguration() {
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
