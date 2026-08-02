package com.paypal.oslo.feature.xoom.di;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u000b\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0002\b\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ2\u0010\r\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0002\b\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\fJ2\u0010\u000e\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0002\b\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\fJ2\u0010\u000f\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0002\b\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\fJ2\u0010\u0010\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0002\b\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\fJ2\u0010\u0011\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0002\b\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\fJ2\u0010\u0012\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0002\b\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/xoom/di/NavigationModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "appNavigator", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/EntryProviderInstaller;", "Lkotlin/ExtensionFunctionType;", "provideSendMoneyAmountDestination", "(Lcom/paypal/oslo/core/navigation/AppNavigator;)Lkotlin/jvm/functions/Function1;", "provideSendMoneyDestination", "provideActivityDetailsDestination", "provideAccountLinkingDestination", "provideErrorDestination", "provideInterstitialScreen", "provideSendAgainDestination"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes16.dex */
public final class NavigationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.xoom.di.NavigationModule INSTANCE = new com.paypal.oslo.feature.xoom.di.NavigationModule();

    private NavigationModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideSendMoneyAmountDestination(final com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.xoom.di.NavigationModule$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.xoom.di.NavigationModule.$r8$lambda$_W5NXZ6bUZ01xEQ2Lf6MvNLSnKQ(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideSendMoneyDestination(final com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.xoom.di.NavigationModule$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.xoom.di.NavigationModule.$r8$lambda$uiyWPzNOq2QfqDA6nfu3wMgu5i4(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideActivityDetailsDestination(final com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.xoom.di.NavigationModule$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.xoom.di.NavigationModule.$r8$lambda$3fXBgxvlZJeEwapcDATsd5NTQ7U(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideAccountLinkingDestination(final com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.xoom.di.NavigationModule$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.xoom.di.NavigationModule.m21517$r8$lambda$G2xIbeIC6N4ZghbPbgR_51k4oE(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideErrorDestination(final com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.xoom.di.NavigationModule$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.xoom.di.NavigationModule.m21521$r8$lambda$jLhpsUrlywWwmGlgqCoUE0Qr5s(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideInterstitialScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.xoom.di.NavigationModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.xoom.di.NavigationModule.m21519$r8$lambda$cgp5CAPwUK3jQgjSkB5CW4Eaws(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideSendAgainDestination(final com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.xoom.di.NavigationModule$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.xoom.di.NavigationModule.$r8$lambda$HPKnV_WdckCFAygo565gsNzulgU(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3fXBgxvlZJeEwapcDATsd5NTQ7U(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, java.lang.Integer.valueOf(com.paypal.oslo.feature.xoom.R.string.feature_xoom_activity_details_title), false, null, null, true, null, null, false, 477, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(679468466, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.xoom.di.NavigationModule$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.xoom.di.NavigationModule.$r8$lambda$rlQNymLMmyh7L3H2KOvIPATIGxM(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.xoom.api.navigation.ActivityDetailsDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.xoom.api.navigation.ActivityDetailsDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.xoom.api.navigation.ActivityDetailsDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.xoom.di.NavigationModule$provideActivityDetailsDestination$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.xoom.api.navigation.ActivityDetailsDestination activityDetailsDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(activityDetailsDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.xoom.api.navigation.ActivityDetailsDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.xoom.di.NavigationModule$provideActivityDetailsDestination$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.xoom.api.navigation.ActivityDetailsDestination activityDetailsDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8pESRLWrOVYAByJbRaJellAbgiw(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingScreenKt.popXoomStack(appNavigator);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Cx-UImE5uws6-noly33o79vwk2I, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21516$r8$lambda$CxUImE5uws6noly33o79vwk2I(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingScreenKt.popXoomStack(appNavigator);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$G2xIbeIC6N4ZghbPb-gR_51k4oE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21517$r8$lambda$G2xIbeIC6N4ZghbPbgR_51k4oE(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1653853790, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.xoom.di.NavigationModule$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.xoom.di.NavigationModule.m21520$r8$lambda$fA7J8tUcxskxEn7omm3dMe9X9c(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.xoom.navigation.AccountLinkingDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.xoom.navigation.AccountLinkingDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.xoom.navigation.AccountLinkingDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.xoom.di.NavigationModule$provideAccountLinkingDestination$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.xoom.navigation.AccountLinkingDestination accountLinkingDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(accountLinkingDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.xoom.navigation.AccountLinkingDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.xoom.di.NavigationModule$provideAccountLinkingDestination$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.xoom.navigation.AccountLinkingDestination accountLinkingDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HPKnV_WdckCFAygo565gsNzulgU(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1864155538, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.xoom.di.NavigationModule$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.xoom.di.NavigationModule.$r8$lambda$gsVxWzBWvwbf9MiVqsJaNSWF5xE(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.xoom.navigation.SendAgainDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.xoom.navigation.SendAgainDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.xoom.navigation.SendAgainDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.xoom.di.NavigationModule$provideSendAgainDestination$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.xoom.navigation.SendAgainDestination sendAgainDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(sendAgainDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.xoom.navigation.SendAgainDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.xoom.di.NavigationModule$provideSendAgainDestination$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.xoom.navigation.SendAgainDestination sendAgainDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$VhmkNSdAu-KRgaZL3f7CVZvUFWE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21518$r8$lambda$VhmkNSdAuKRgaZL3f7CVZvUFWE(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.xoom.navigation.InterstitialDestination interstitialDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interstitialDestination, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1269556742, i, -1, "com.paypal.oslo.feature.xoom.di.NavigationModule.provideInterstitialScreen.<anonymous>.<anonymous> (NavigationModule.kt:135)");
            }
            com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialScreenKt.InterstitialScreen(appNavigator, null, composer, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_W5NXZ6bUZ01xEQ2Lf6MvNLSnKQ(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1857858606, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.xoom.di.NavigationModule$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.xoom.di.NavigationModule.$r8$lambda$tAXwVyzV8limr8ot7A1F_P172xE(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.xoom.api.navigation.SendMoneyAmountDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.xoom.api.navigation.SendMoneyAmountDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.xoom.api.navigation.SendMoneyAmountDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.xoom.di.NavigationModule$provideSendMoneyAmountDestination$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.xoom.api.navigation.SendMoneyAmountDestination sendMoneyAmountDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(sendMoneyAmountDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.xoom.api.navigation.SendMoneyAmountDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.xoom.di.NavigationModule$provideSendMoneyAmountDestination$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.xoom.api.navigation.SendMoneyAmountDestination sendMoneyAmountDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$cgp5CAPwUK3-jQgjSkB5CW4Eaws, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21519$r8$lambda$cgp5CAPwUK3jQgjSkB5CW4Eaws(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1269556742, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.xoom.di.NavigationModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.xoom.di.NavigationModule.m21518$r8$lambda$VhmkNSdAuKRgaZL3f7CVZvUFWE(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.xoom.navigation.InterstitialDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.xoom.navigation.InterstitialDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.xoom.navigation.InterstitialDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.xoom.di.NavigationModule$provideInterstitialScreen$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.xoom.navigation.InterstitialDestination interstitialDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(interstitialDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.xoom.navigation.InterstitialDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.xoom.di.NavigationModule$provideInterstitialScreen$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.xoom.navigation.InterstitialDestination interstitialDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$fA7-J8tUcxskxEn7omm3dMe9X9c, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21520$r8$lambda$fA7J8tUcxskxEn7omm3dMe9X9c(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.xoom.navigation.AccountLinkingDestination accountLinkingDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountLinkingDestination, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1653853790, i, -1, "com.paypal.oslo.feature.xoom.di.NavigationModule.provideAccountLinkingDestination.<anonymous>.<anonymous> (NavigationModule.kt:103)");
            }
            com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingScreenKt.AccountLinkingScreen(appNavigator, null, null, null, composer, 0, 14);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fafLsG9tHWEvc1neqpsLOApajE8(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.xoom.api.navigation.SendMoneyDestination sendMoneyDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendMoneyDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(99292562, i, -1, "com.paypal.oslo.feature.xoom.di.NavigationModule.provideSendMoneyDestination.<anonymous>.<anonymous> (NavigationModule.kt:71)");
        }
        com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyScreenKt.SendMoneyScreen(appNavigator, sendMoneyDestination.getRefTag(), null, null, null, null, null, null, null, composer, 0, androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_CURVE_FIT);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gsVxWzBWvwbf9MiVqsJaNSWF5xE(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.xoom.navigation.SendAgainDestination sendAgainDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendAgainDestination, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(sendAgainDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1864155538, i2, -1, "com.paypal.oslo.feature.xoom.di.NavigationModule.provideSendAgainDestination.<anonymous>.<anonymous> (NavigationModule.kt:149)");
            }
            com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyScreenKt.SendMoneyScreen(appNavigator, sendAgainDestination.getRefTag(), null, null, null, null, null, sendAgainDestination.getUrl(), null, composer, 0, 380);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$jLhpsUrlywWwmGlgqCoUE-0Qr5s, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21521$r8$lambda$jLhpsUrlywWwmGlgqCoUE0Qr5s(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.xoom.di.NavigationModule$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.xoom.di.NavigationModule.m21516$r8$lambda$CxUImE5uws6noly33o79vwk2I(com.paypal.oslo.core.navigation.AppNavigator.this);
            }
        }, null, false, null, null, false, 503, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1315805202, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.xoom.di.NavigationModule$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.xoom.di.NavigationModule.$r8$lambda$sT3itE8eNHI6cMF3S7onsagpqgU(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.xoom.navigation.ErrorDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.xoom.navigation.ErrorDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.xoom.navigation.ErrorDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.xoom.di.NavigationModule$provideErrorDestination$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.xoom.navigation.ErrorDestination errorDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(errorDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.xoom.navigation.ErrorDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.xoom.di.NavigationModule$provideErrorDestination$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.xoom.navigation.ErrorDestination errorDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rlQNymLMmyh7L3H2KOvIPATIGxM(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.xoom.api.navigation.ActivityDetailsDestination activityDetailsDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailsDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(679468466, i, -1, "com.paypal.oslo.feature.xoom.di.NavigationModule.provideActivityDetailsDestination.<anonymous>.<anonymous> (NavigationModule.kt:87)");
        }
        com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsScreenKt.ActivityDetailsScreen(appNavigator, activityDetailsDestination.getInvoiceId(), activityDetailsDestination.getRefTag(), null, null, null, composer, 0, 56);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$sT3itE8eNHI6cMF3S7onsagpqgU(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.xoom.navigation.ErrorDestination errorDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorDestination, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(errorDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1315805202, i2, -1, "com.paypal.oslo.feature.xoom.di.NavigationModule.provideErrorDestination.<anonymous>.<anonymous> (NavigationModule.kt:117)");
            }
            java.lang.String title = errorDestination.getTitle();
            java.lang.String description = errorDestination.getDescription();
            java.lang.String primaryButtonText = errorDestination.getPrimaryButtonText();
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.xoom.di.NavigationModule$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.xoom.di.NavigationModule.$r8$lambda$8pESRLWrOVYAByJbRaJellAbgiw(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.xoom.ui.error.ErrorScreenKt.ErrorScreen(title, description, primaryButtonText, (kotlin.jvm.functions.Function0) rememberedValue, androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16()), null, null, composer, 0, 96);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$tAXwVyzV8limr8ot7A1F_P172xE(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.xoom.api.navigation.SendMoneyAmountDestination sendMoneyAmountDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendMoneyAmountDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1857858606, i, -1, "com.paypal.oslo.feature.xoom.di.NavigationModule.provideSendMoneyAmountDestination.<anonymous>.<anonymous> (NavigationModule.kt:52)");
        }
        com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyScreenKt.SendMoneyScreen(appNavigator, sendMoneyAmountDestination.getRefTag(), null, sendMoneyAmountDestination.getSendCurrencyCode(), sendMoneyAmountDestination.getReceiveCurrencyCode(), sendMoneyAmountDestination.getDestinationCountryCode(), sendMoneyAmountDestination.getAmount(), null, null, composer, 0, 388);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$uiyWPzNOq2QfqDA6nfu3wMgu5i4(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(99292562, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.xoom.di.NavigationModule$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.xoom.di.NavigationModule.$r8$lambda$fafLsG9tHWEvc1neqpsLOApajE8(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.xoom.api.navigation.SendMoneyDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.xoom.api.navigation.SendMoneyDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.xoom.api.navigation.SendMoneyDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.xoom.di.NavigationModule$provideSendMoneyDestination$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.xoom.api.navigation.SendMoneyDestination sendMoneyDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(sendMoneyDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.xoom.api.navigation.SendMoneyDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.xoom.di.NavigationModule$provideSendMoneyDestination$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.xoom.api.navigation.SendMoneyDestination sendMoneyDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }
}
