package com.paypal.oslo.feature.onboarding.welcomeback.di;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u000b\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0002\b\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ2\u0010\r\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0002\b\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/welcomeback/di/WelcomeBackEmailConfirmationNavigationModule;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingNavigator;", "postOnboardingNavigator", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/EntryProviderInstaller;", "Lkotlin/ExtensionFunctionType;", "provideDeepLinkEntryProviderInstaller", "(Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingNavigator;)Lkotlin/jvm/functions/Function1;", "provideStepEntryProviderInstaller"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes13.dex */
public final class WelcomeBackEmailConfirmationNavigationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.onboarding.welcomeback.di.WelcomeBackEmailConfirmationNavigationModule INSTANCE = new com.paypal.oslo.feature.onboarding.welcomeback.di.WelcomeBackEmailConfirmationNavigationModule();

    private WelcomeBackEmailConfirmationNavigationModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideDeepLinkEntryProviderInstaller(final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postOnboardingNavigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.welcomeback.di.WelcomeBackEmailConfirmationNavigationModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.onboarding.welcomeback.di.WelcomeBackEmailConfirmationNavigationModule.$r8$lambda$hUmbkpOnmxA6hXz3vxPlsaK38oI(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator.this, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideStepEntryProviderInstaller(final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postOnboardingNavigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.welcomeback.di.WelcomeBackEmailConfirmationNavigationModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.onboarding.welcomeback.di.WelcomeBackEmailConfirmationNavigationModule.$r8$lambda$xoMVzIeLGYhpW6R8kkq0MaDjIIc(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator.this, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hUmbkpOnmxA6hXz3vxPlsaK38oI(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        com.paypal.oslo.feature.onboarding.welcomeback.di.WelcomeBackNavigationEntriesKt.welcomeBackDeepLinkLauncherEntry(entryProviderScope, postOnboardingNavigator);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xoMVzIeLGYhpW6R8kkq0MaDjIIc(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        com.paypal.oslo.feature.onboarding.welcomeback.di.WelcomeBackNavigationEntriesKt.welcomeBackEmailConfirmationScreenEntry(entryProviderScope, postOnboardingNavigator);
        return kotlin.Unit.INSTANCE;
    }
}
