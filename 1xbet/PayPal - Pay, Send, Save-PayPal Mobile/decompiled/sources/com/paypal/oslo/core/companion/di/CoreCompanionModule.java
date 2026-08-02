package com.paypal.oslo.core.companion.di;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\t\u001a\u00020\b2\u0011\u0010\u0007\u001a\r\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u0004H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/core/companion/di/CoreCompanionModule;", "", "<init>", "()V", "", "Lcom/paypal/oslo/core/companion/domain/ConfigSection;", "Lkotlin/jvm/JvmSuppressWildcards;", "configSections", "Lcom/paypal/oslo/core/companion/domain/CompanionAppConfiguration;", "provideDefaultCompanionConfiguration", "(Ljava/util/Set;)Lcom/paypal/oslo/core/companion/domain/CompanionAppConfiguration;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes4.dex */
public final class CoreCompanionModule {
    public static final com.paypal.oslo.core.companion.di.CoreCompanionModule INSTANCE = new com.paypal.oslo.core.companion.di.CoreCompanionModule();

    private CoreCompanionModule() {
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.oslo.core.companion.domain.CompanionAppConfiguration provideDefaultCompanionConfiguration(java.util.Set<com.paypal.oslo.core.companion.domain.ConfigSection> configSections) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configSections, "");
        return new com.paypal.oslo.core.companion.domain.CompanionAppConfiguration(kotlin.collections.CollectionsKt.toList(configSections));
    }
}
