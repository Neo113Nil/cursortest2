package com.paypal.oslo.feature.businesshome.di;

/* loaded from: classes11.dex */
public final class NavigationModule_ProvideBusinessExperienceDisabledEntryFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideBusinessExperienceDisabledEntry();
    }

    public static com.paypal.oslo.feature.businesshome.di.NavigationModule_ProvideBusinessExperienceDisabledEntryFactory create() {
        return com.paypal.oslo.feature.businesshome.di.NavigationModule_ProvideBusinessExperienceDisabledEntryFactory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideBusinessExperienceDisabledEntry() {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.businesshome.di.NavigationModule.INSTANCE.provideBusinessExperienceDisabledEntry());
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.businesshome.di.NavigationModule_ProvideBusinessExperienceDisabledEntryFactory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.businesshome.di.NavigationModule_ProvideBusinessExperienceDisabledEntryFactory();

        private InstanceHolder() {
        }
    }
}
