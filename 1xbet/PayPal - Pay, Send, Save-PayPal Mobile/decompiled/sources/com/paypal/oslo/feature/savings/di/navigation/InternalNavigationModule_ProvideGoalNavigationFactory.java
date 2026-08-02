package com.paypal.oslo.feature.savings.di.navigation;

/* loaded from: classes14.dex */
public final class InternalNavigationModule_ProvideGoalNavigationFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideGoalNavigation();
    }

    public static com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule_ProvideGoalNavigationFactory create() {
        return com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule_ProvideGoalNavigationFactory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideGoalNavigation() {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule.INSTANCE.provideGoalNavigation());
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule_ProvideGoalNavigationFactory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule_ProvideGoalNavigationFactory();

        private InstanceHolder() {
        }
    }
}
