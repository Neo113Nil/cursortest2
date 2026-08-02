package com.paypal.oslo.app.di;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/app/di/NavigationModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/navigation/result/NavResultManager;", "navResultManager", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "provideNavigator", "(Lcom/paypal/oslo/core/navigation/result/NavResultManager;)Lcom/paypal/oslo/core/navigation/AppNavigator;", "Landroidx/navigation3/runtime/NavKey;", "provideDefaultStartDestination", "()Landroidx/navigation3/runtime/NavKey;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes4.dex */
public final class NavigationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.app.di.NavigationModule INSTANCE = new com.paypal.oslo.app.di.NavigationModule();

    private NavigationModule() {
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.oslo.core.navigation.AppNavigator provideNavigator(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
        return new com.paypal.oslo.core.navigation.AppNavigator(kotlin.collections.CollectionsKt.emptyList(), navResultManager);
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final androidx.navigation3.runtime.NavKey provideDefaultStartDestination() {
        return com.paypal.oslo.feature.onboarding.api.navigation.WelcomeDestination.INSTANCE;
    }
}
