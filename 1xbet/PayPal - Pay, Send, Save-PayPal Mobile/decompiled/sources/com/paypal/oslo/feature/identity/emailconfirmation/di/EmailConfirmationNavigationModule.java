package com.paypal.oslo.feature.identity.emailconfirmation.di;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u000b\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0002\b\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/emailconfirmation/di/EmailConfirmationNavigationModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/EntryProviderInstaller;", "Lkotlin/ExtensionFunctionType;", "provideEmailConfirmationEntryProviderInstaller", "(Lcom/paypal/oslo/core/navigation/AppNavigator;)Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes12.dex */
public final class EmailConfirmationNavigationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.identity.emailconfirmation.di.EmailConfirmationNavigationModule INSTANCE = new com.paypal.oslo.feature.identity.emailconfirmation.di.EmailConfirmationNavigationModule();

    private EmailConfirmationNavigationModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideEmailConfirmationEntryProviderInstaller(final com.paypal.oslo.core.navigation.AppNavigator navigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.emailconfirmation.di.EmailConfirmationNavigationModule$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.identity.emailconfirmation.di.EmailConfirmationNavigationModule.m15160$r8$lambda$dmnHUBkVxPslvW8q35QIXdbZzQ(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0fSpEXq5X5ZLoWziYJdBP8v2Z6s(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.identity.api.navigation.EmailConfirmationDestination emailConfirmationDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailConfirmationDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1694161135, i, -1, "com.paypal.oslo.feature.identity.emailconfirmation.di.EmailConfirmationNavigationModule.provideEmailConfirmationEntryProviderInstaller.<anonymous>.<anonymous> (EmailConfirmationNavigationModule.kt:55)");
        }
        java.lang.String email = emailConfirmationDestination.getEmail();
        java.lang.String code = emailConfirmationDestination.getCode();
        boolean changed = composer.changed(appNavigator);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.emailconfirmation.di.EmailConfirmationNavigationModule$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.identity.emailconfirmation.di.EmailConfirmationNavigationModule.m15161$r8$lambda$ootdH241ctzKiz4grXDeO4mmjk(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiEffect) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationScreenKt.EmailConfirmationScreen(email, code, (kotlin.jvm.functions.Function1) rememberedValue, null, composer, 0, 8);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$V946x1Q_2_JLfA49-e2lbeZAUp0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15159$r8$lambda$V946x1Q_2_JLfA49e2lbeZAUp0(com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiEffect emailConfirmationUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationNavResultMapperKt.toNavResult(emailConfirmationUiEffect));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$dmnHUBkVxPsl-vW8q35QIXdbZzQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15160$r8$lambda$dmnHUBkVxPslvW8q35QIXdbZzQ(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1694161135, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.identity.emailconfirmation.di.EmailConfirmationNavigationModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.identity.emailconfirmation.di.EmailConfirmationNavigationModule.$r8$lambda$0fSpEXq5X5ZLoWziYJdBP8v2Z6s(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.identity.api.navigation.EmailConfirmationDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.api.navigation.EmailConfirmationDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.api.navigation.EmailConfirmationDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.identity.emailconfirmation.di.EmailConfirmationNavigationModule$provideEmailConfirmationEntryProviderInstaller$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.identity.api.navigation.EmailConfirmationDestination emailConfirmationDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(emailConfirmationDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.api.navigation.EmailConfirmationDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.identity.emailconfirmation.di.EmailConfirmationNavigationModule$provideEmailConfirmationEntryProviderInstaller$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.identity.api.navigation.EmailConfirmationDestination emailConfirmationDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$oot-dH241ctzKiz4grXDeO4mmjk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15161$r8$lambda$ootdH241ctzKiz4grXDeO4mmjk(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiEffect emailConfirmationUiEffect) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailConfirmationUiEffect, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.emailconfirmation.di.EmailConfirmationNavigationModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.identity.emailconfirmation.di.EmailConfirmationNavigationModule.m15159$r8$lambda$V946x1Q_2_JLfA49e2lbeZAUp0(com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }
}
