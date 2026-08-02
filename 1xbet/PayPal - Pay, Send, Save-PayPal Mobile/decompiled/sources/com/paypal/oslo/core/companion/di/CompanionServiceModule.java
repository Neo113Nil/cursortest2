package com.paypal.oslo.core.companion.di;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/core/companion/di/CompanionServiceModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/companion/domain/CompanionAppConfiguration;", "companionAppConfiguration", "Lcom/paypal/oslo/core/companion/domain/CompanionConfigurationApi;", "providesCompanionConfigurationApi", "(Lcom/paypal/oslo/core/companion/domain/CompanionAppConfiguration;)Lcom/paypal/oslo/core/companion/domain/CompanionConfigurationApi;", "companionConfigurationApi", "Lkotlinx/serialization/json/Json;", "json", "Lcom/paypal/oslo/core/companion/data/CompanionAppMessageHandler;", "providesCompanionConfigChangeHandler", "(Lcom/paypal/oslo/core/companion/domain/CompanionConfigurationApi;Lkotlinx/serialization/json/Json;)Lcom/paypal/oslo/core/companion/data/CompanionAppMessageHandler;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes10.dex */
public final class CompanionServiceModule {
    public static final com.paypal.oslo.core.companion.di.CompanionServiceModule INSTANCE = new com.paypal.oslo.core.companion.di.CompanionServiceModule();

    private CompanionServiceModule() {
    }

    @dagger.Provides
    public final com.paypal.oslo.core.companion.domain.CompanionConfigurationApi providesCompanionConfigurationApi(com.paypal.oslo.core.companion.domain.CompanionAppConfiguration companionAppConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companionAppConfiguration, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.companion.LoggerKt.log, "Creating CompanionConfigurationManager", null, null, 6, null);
        return new com.paypal.oslo.core.companion.data.CompanionConfigurationManager(kotlinx.coroutines.Dispatchers.getIO(), companionAppConfiguration);
    }

    @dagger.Provides
    public final com.paypal.oslo.core.companion.data.CompanionAppMessageHandler providesCompanionConfigChangeHandler(com.paypal.oslo.core.companion.domain.CompanionConfigurationApi companionConfigurationApi, kotlinx.serialization.json.Json json) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companionConfigurationApi, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.companion.LoggerKt.log, "Creating CompanionConfigChangeHandler", null, null, 6, null);
        return new com.paypal.oslo.core.companion.data.CompanionAppMessageHandler(companionConfigurationApi, json, kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.Dispatchers.getIO().plus(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null))));
    }
}
