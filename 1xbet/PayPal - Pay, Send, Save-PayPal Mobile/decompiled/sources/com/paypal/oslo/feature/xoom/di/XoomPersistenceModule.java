package com.paypal.oslo.feature.xoom.di;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/xoom/di/XoomPersistenceModule;", "", "<init>", "()V", "Lkotlin/Pair;", "", "", "Lcom/paypal/oslo/core/persistence/appstorage/SharedPrefKeyMigration;", "keyMapping", "()Lkotlin/Pair;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes5.dex */
public final class XoomPersistenceModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.xoom.di.XoomPersistenceModule INSTANCE = new com.paypal.oslo.feature.xoom.di.XoomPersistenceModule();

    private XoomPersistenceModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.Pair<java.lang.String, java.util.List<com.paypal.oslo.core.persistence.appstorage.SharedPrefKeyMigration>> keyMapping() {
        return com.paypal.oslo.feature.xoom.data.persistence.XoomKeyMigrationProvider.INSTANCE.provide();
    }
}
