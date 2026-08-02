package com.paypal.oslo.feature.dataprivacy.di;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/di/DataPrivacyModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "dynamicConfiguration", "Lcom/paypal/oslo/feature/dataprivacy/config/DataPrivacyDynamicConfiguration;", "provideDataPrivacyDynamicConfiguration", "(Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;)Lcom/paypal/oslo/feature/dataprivacy/config/DataPrivacyDynamicConfiguration;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes12.dex */
public final class DataPrivacyModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.dataprivacy.di.DataPrivacyModule INSTANCE = new com.paypal.oslo.feature.dataprivacy.di.DataPrivacyModule();

    private DataPrivacyModule() {
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.dataprivacy.config.DataPrivacyDynamicConfiguration provideDataPrivacyDynamicConfiguration(com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicConfiguration, "");
        return new com.paypal.oslo.feature.dataprivacy.config.DataPrivacyDynamicConfigurationImpl(dynamicConfiguration);
    }
}
