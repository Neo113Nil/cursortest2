package com.paypal.oslo.feature.bankingbundle.di.navigation;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\t\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\t\u0010\nJ:\u0010\u000f\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007¢\u0006\u0002\b\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J:\u0010\u0011\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007¢\u0006\u0002\b\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0011\u0010\u0010JB\u0010\u0014\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007¢\u0006\u0002\b\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015JB\u0010\u0016\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007¢\u0006\u0002\b\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0016\u0010\u0015J:\u0010\u0017\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007¢\u0006\u0002\b\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0017\u0010\u0010J2\u0010\u0018\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007¢\u0006\u0002\b\b2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0018\u0010\u0019J2\u0010\u001a\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007¢\u0006\u0002\b\b2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u001a\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/di/navigation/NavigationModule;", "", "<init>", "()V", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/EntryProviderInstaller;", "Lkotlin/ExtensionFunctionType;", "provideHomeEntryProviderInstaller", "()Lkotlin/jvm/functions/Function1;", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lcom/paypal/oslo/feature/bankingbundle/ui/navigation/BankingBundleNavigator;", "bankingBundleNavigator", "provideStandaloneLandingEntryProviderInstaller", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/bankingbundle/ui/navigation/BankingBundleNavigator;)Lkotlin/jvm/functions/Function1;", "provideAcceptMoneyChoiceEntryProviderInstaller", "Lcom/paypal/oslo/feature/bankingbundle/manager/BankingBundleFeatureManager;", "featureManager", "provideBankingBundleFlowEntryProviderInstaller", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/bankingbundle/ui/navigation/BankingBundleNavigator;Lcom/paypal/oslo/feature/bankingbundle/manager/BankingBundleFeatureManager;)Lkotlin/jvm/functions/Function1;", "provideBankingBundleDeepLinkEntryProviderInstaller", "provideBenefitsComparisonEntryProviderInstaller", "provideTermsWebViewEntryProviderInstaller", "(Lcom/paypal/oslo/core/navigation/AppNavigator;)Lkotlin/jvm/functions/Function1;", "provideSuccessSheetEntryProviderInstaller"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes11.dex */
public final class NavigationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule INSTANCE = new com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule();

    private NavigationModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideStandaloneLandingEntryProviderInstaller(final com.paypal.oslo.core.navigation.AppNavigator navigator, final com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator bankingBundleNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankingBundleNavigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule.$r8$lambda$Dc5k2GVeccNVck48aPYGQGmXsxY(com.paypal.oslo.core.navigation.AppNavigator.this, bankingBundleNavigator, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideAcceptMoneyChoiceEntryProviderInstaller(final com.paypal.oslo.core.navigation.AppNavigator navigator, final com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator bankingBundleNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankingBundleNavigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule.m12207$r8$lambda$7k_SA61xYmgjxWb32wAHnNRBn4(com.paypal.oslo.core.navigation.AppNavigator.this, bankingBundleNavigator, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideBankingBundleFlowEntryProviderInstaller(final com.paypal.oslo.core.navigation.AppNavigator navigator, final com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator bankingBundleNavigator, final com.paypal.oslo.feature.bankingbundle.manager.BankingBundleFeatureManager featureManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankingBundleNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureManager, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule.$r8$lambda$DP4gP4DSY0n2BqEfO4dKDXPZfqk(com.paypal.oslo.core.navigation.AppNavigator.this, bankingBundleNavigator, featureManager, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideBankingBundleDeepLinkEntryProviderInstaller(final com.paypal.oslo.core.navigation.AppNavigator navigator, final com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator bankingBundleNavigator, final com.paypal.oslo.feature.bankingbundle.manager.BankingBundleFeatureManager featureManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankingBundleNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureManager, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule.m12212$r8$lambda$IetRSNdgj3yY6zxqMtRbhzwK6g(com.paypal.oslo.core.navigation.AppNavigator.this, bankingBundleNavigator, featureManager, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideBenefitsComparisonEntryProviderInstaller(final com.paypal.oslo.core.navigation.AppNavigator navigator, final com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator bankingBundleNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankingBundleNavigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule.$r8$lambda$jlLnf0YOhpBON1kx9Urj9SAeehg(com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator.this, navigator, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideTermsWebViewEntryProviderInstaller(final com.paypal.oslo.core.navigation.AppNavigator navigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule.$r8$lambda$rlnI6mWFKOR7AI2aSagqjZPspvU(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideSuccessSheetEntryProviderInstaller(final com.paypal.oslo.core.navigation.AppNavigator navigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule$$ExternalSyntheticLambda37
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule.m12208$r8$lambda$8ifAPl08un8mrXCxc6qVe4XNIc(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    /* renamed from: $r8$lambda$-bZVa3tC3df18tgxiEqAG5Hu48U, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12203$r8$lambda$bZVa3tC3df18tgxiEqAG5Hu48U(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator bankingBundleNavigator, com.paypal.oslo.feature.bankingbundle.manager.BankingBundleFeatureManager bankingBundleFeatureManager, com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowDestination bankingBundleFlowDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankingBundleFlowDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1840304606, i, -1, "com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule.provideBankingBundleFlowEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:182)");
        }
        com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowKt.BankingBundleFlowWithResultHandling(bankingBundleFlowDestination.getFlowIntent(), bankingBundleFlowDestination.getDemoEligibility(), appNavigator, bankingBundleNavigator, bankingBundleFeatureManager, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0054sXW_EL5bJ9c4I9uhON7u8Ac(androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        kotlin.jvm.functions.Function3<com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleHomeDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m12202getLambda$2143882362$banking_bundle_prodRelease = com.paypal.oslo.feature.bankingbundle.di.navigation.ComposableSingletons$NavigationModuleKt.INSTANCE.m12202getLambda$2143882362$banking_bundle_prodRelease();
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleHomeDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleHomeDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule$provideHomeEntryProviderInstaller$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleHomeDestination bankingBundleHomeDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(bankingBundleHomeDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleHomeDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule$provideHomeEntryProviderInstaller$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleHomeDestination bankingBundleHomeDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) m12202getLambda$2143882362$banking_bundle_prodRelease);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0iTvonzKCW0AMrF2Uiqozr8tD30(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule.$r8$lambda$81YVumjeCHDADTy71TrFuM5vQ0c((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$0n47p1_zszR-1_ixAlycph5enlE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12204$r8$lambda$0n47p1_zszR1_ixAlycph5enlE(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule$$ExternalSyntheticLambda34
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule.m12210$r8$lambda$C7y52XlPeivIhez6yHVDmupF4k((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0nnrhyvF2x9Hqu41q8RgXVweJCY(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator bankingBundleNavigator, com.paypal.oslo.feature.bankingbundle.api.navigation.AcceptMoneyChoiceDestination acceptMoneyChoiceDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(acceptMoneyChoiceDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-600303413, i, -1, "com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule.provideAcceptMoneyChoiceEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:113)");
        }
        java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(composer, 0);
        boolean changed = composer.changed(bankingBundleNavigator);
        boolean changed2 = composer.changed(appNavigator);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule$$ExternalSyntheticLambda35
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule.m12217$r8$lambda$l3nXNh0aEzRAn4iBdwsMHq8ST0(com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator.this, appNavigator, (com.paypal.oslo.feature.oneonboarding.api.navigation.result.OneOnboardingFlowNavResult) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
        boolean changed3 = composer.changed(appNavigator);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (changed3 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule$$ExternalSyntheticLambda36
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule.m12213$r8$lambda$O9OtUhUIjuT9de8ZGo0LwswO1s(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.AcceptMoneyChoiceScreenKt.m12257AcceptMoneyChoiceScreenWithResultHandlingNhs6_Ig(appNavigator, rememberNavResultRequestId, function1, (kotlin.jvm.functions.Function0) rememberedValue2, null, composer, 0, 16);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$0vqxtf4rE0yPDVqq-jpjX0J0jq0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12205$r8$lambda$0vqxtf4rE0yPDVqqjpjX0J0jq0(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule.$r8$lambda$NCuO1rX8D7kMd4JPKXsZCQeizM0((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$27-jACFXzVi5rOw3_AccydKdS3Y, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12206$r8$lambda$27jACFXzVi5rOw3_AccydKdS3Y(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.setResult(com.paypal.oslo.feature.bankingbundle.api.navigation.result.BankingBundleFlowNavResult.Success.INSTANCE);
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$7k_SA61xYmgjxWb32wAHnNR-Bn4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12207$r8$lambda$7k_SA61xYmgjxWb32wAHnNRBn4(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator bankingBundleNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-600303413, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule.$r8$lambda$0nnrhyvF2x9Hqu41q8RgXVweJCY(com.paypal.oslo.core.navigation.AppNavigator.this, bankingBundleNavigator, (com.paypal.oslo.feature.bankingbundle.api.navigation.AcceptMoneyChoiceDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bankingbundle.api.navigation.AcceptMoneyChoiceDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bankingbundle.api.navigation.AcceptMoneyChoiceDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule$provideAcceptMoneyChoiceEntryProviderInstaller$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.bankingbundle.api.navigation.AcceptMoneyChoiceDestination acceptMoneyChoiceDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(acceptMoneyChoiceDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bankingbundle.api.navigation.AcceptMoneyChoiceDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule$provideAcceptMoneyChoiceEntryProviderInstaller$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.bankingbundle.api.navigation.AcceptMoneyChoiceDestination acceptMoneyChoiceDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$81YVumjeCHDADTy71TrFuM5vQ0c(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8L6ZhmVpV4uTobTWkgC_GL_yPzY(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator bankingBundleNavigator, final com.paypal.oslo.feature.bankingbundle.api.navigation.StandaloneLandingDestination standaloneLandingDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(standaloneLandingDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(360448683, i, -1, "com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule.provideStandaloneLandingEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:78)");
        }
        boolean changedInstance = composer.changedInstance(standaloneLandingDestination);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule.$r8$lambda$DjmYu8Dym4lMhEmsXjxHBIQRSM0(com.paypal.oslo.feature.bankingbundle.api.navigation.StandaloneLandingDestination.this, (com.paypal.oslo.feature.bankingbundle.ui.StandaloneLandingViewModel.Factory) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        final com.paypal.oslo.feature.bankingbundle.ui.StandaloneLandingViewModel standaloneLandingViewModel = (com.paypal.oslo.feature.bankingbundle.ui.StandaloneLandingViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bankingbundle.ui.StandaloneLandingViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0);
        java.lang.String source = standaloneLandingDestination.getSource();
        boolean skipSuccess = standaloneLandingDestination.getSkipSuccess();
        boolean changed = composer.changed(appNavigator);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule.m12205$r8$lambda$0vqxtf4rE0yPDVqqjpjX0J0jq0(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
        boolean changed2 = composer.changed(bankingBundleNavigator);
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if (changed2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule.m12211$r8$lambda$F6dI6eHItBKnqCsZnO_D_rYKFk(com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue3;
        boolean changed3 = composer.changed(appNavigator);
        java.lang.Object rememberedValue4 = composer.rememberedValue();
        if (changed3 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule.m12219$r8$lambda$zzXxO1G8nWMWNUkr2LuG4utZXc(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue4;
        boolean changed4 = composer.changed(bankingBundleNavigator);
        boolean changedInstance2 = composer.changedInstance(standaloneLandingViewModel);
        java.lang.Object rememberedValue5 = composer.rememberedValue();
        if ((changed4 | changedInstance2) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule.$r8$lambda$lC8Aj0VNbIiLawQ3hVa7YDUahAc(com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator.this, standaloneLandingViewModel);
                }
            };
            composer.updateRememberedValue(rememberedValue5);
        }
        com.paypal.oslo.feature.bankingbundle.ui.StandaloneLandingScreenKt.StandaloneLandingScreenWithResultHandling(source, skipSuccess, function0, function02, function03, (kotlin.jvm.functions.Function0) rememberedValue5, standaloneLandingViewModel, composer, 0, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$8ifAPl08u-n8mrXCxc6qVe4XNIc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12208$r8$lambda$8ifAPl08un8mrXCxc6qVe4XNIc(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule.m12209$r8$lambda$BCyScb5X36z9vsRRBwpNFwKk4U(com.paypal.oslo.core.navigation.AppNavigator.this);
            }
        };
        final java.util.Map bottomSheetMetadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.bottomSheetMetadata$default(null, false, false, false, null, null, function0, 55, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-809969676, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule$$ExternalSyntheticLambda31
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule.$r8$lambda$ZFcBrLU77Qb5dR_RiQI6KmdfS9c(kotlin.jvm.functions.Function0.this, (com.paypal.oslo.feature.bankingbundle.ui.SuccessSheetDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bankingbundle.ui.SuccessSheetDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bankingbundle.ui.SuccessSheetDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule$provideSuccessSheetEntryProviderInstaller$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.bankingbundle.ui.SuccessSheetDestination successSheetDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(successSheetDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bankingbundle.ui.SuccessSheetDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule$provideSuccessSheetEntryProviderInstaller$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.bankingbundle.ui.SuccessSheetDestination successSheetDestination) {
                return bottomSheetMetadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$BCyS-cb5X36z9vsRRBwpNFwKk4U, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12209$r8$lambda$BCyScb5X36z9vsRRBwpNFwKk4U(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule.m12206$r8$lambda$27jACFXzVi5rOw3_AccydKdS3Y((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$C7y52Xl-PeivIhez6yHVDmupF4k, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12210$r8$lambda$C7y52XlPeivIhez6yHVDmupF4k(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$DP4gP4DSY0n2BqEfO4dKDXPZfqk(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator bankingBundleNavigator, final com.paypal.oslo.feature.bankingbundle.manager.BankingBundleFeatureManager bankingBundleFeatureManager, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1840304606, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule.m12203$r8$lambda$bZVa3tC3df18tgxiEqAG5Hu48U(com.paypal.oslo.core.navigation.AppNavigator.this, bankingBundleNavigator, bankingBundleFeatureManager, (com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule$provideBankingBundleFlowEntryProviderInstaller$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowDestination bankingBundleFlowDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(bankingBundleFlowDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule$provideBankingBundleFlowEntryProviderInstaller$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowDestination bankingBundleFlowDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Dc5k2GVeccNVck48aPYGQGmXsxY(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator bankingBundleNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, true, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule$$ExternalSyntheticLambda29
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule.$r8$lambda$0iTvonzKCW0AMrF2Uiqozr8tD30(com.paypal.oslo.core.navigation.AppNavigator.this);
            }
        }, null, false, 411, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(360448683, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule$$ExternalSyntheticLambda30
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule.$r8$lambda$8L6ZhmVpV4uTobTWkgC_GL_yPzY(com.paypal.oslo.core.navigation.AppNavigator.this, bankingBundleNavigator, (com.paypal.oslo.feature.bankingbundle.api.navigation.StandaloneLandingDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bankingbundle.api.navigation.StandaloneLandingDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bankingbundle.api.navigation.StandaloneLandingDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule$provideStandaloneLandingEntryProviderInstaller$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.bankingbundle.api.navigation.StandaloneLandingDestination standaloneLandingDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(standaloneLandingDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bankingbundle.api.navigation.StandaloneLandingDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule$provideStandaloneLandingEntryProviderInstaller$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.bankingbundle.api.navigation.StandaloneLandingDestination standaloneLandingDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bankingbundle.ui.StandaloneLandingViewModel $r8$lambda$DjmYu8Dym4lMhEmsXjxHBIQRSM0(com.paypal.oslo.feature.bankingbundle.api.navigation.StandaloneLandingDestination standaloneLandingDestination, com.paypal.oslo.feature.bankingbundle.ui.StandaloneLandingViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(standaloneLandingDestination.getSkipSuccess());
    }

    /* renamed from: $r8$lambda$F6dI6eHItBKnq-CsZnO_D_rYKFk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12211$r8$lambda$F6dI6eHItBKnqCsZnO_D_rYKFk(com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator bankingBundleNavigator) {
        bankingBundleNavigator.navigateToBenefitsComparison();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$IetRSNdgj3yY6zx-qMtRbhzwK6g, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12212$r8$lambda$IetRSNdgj3yY6zxqMtRbhzwK6g(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator bankingBundleNavigator, final com.paypal.oslo.feature.bankingbundle.manager.BankingBundleFeatureManager bankingBundleFeatureManager, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(468980062, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule.m12214$r8$lambda$RWos3Ntng1mAqq4dn0crP0Q4uY(com.paypal.oslo.core.navigation.AppNavigator.this, bankingBundleNavigator, bankingBundleFeatureManager, (com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleDeepLinkDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleDeepLinkDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleDeepLinkDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule$provideBankingBundleDeepLinkEntryProviderInstaller$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleDeepLinkDestination bankingBundleDeepLinkDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(bankingBundleDeepLinkDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleDeepLinkDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule$provideBankingBundleDeepLinkEntryProviderInstaller$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleDeepLinkDestination bankingBundleDeepLinkDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NCuO1rX8D7kMd4JPKXsZCQeizM0(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$O9OtUhUIjuT9d-e8ZGo0LwswO1s, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12213$r8$lambda$O9OtUhUIjuT9de8ZGo0LwswO1s(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule$$ExternalSyntheticLambda33
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule.m12215$r8$lambda$S5gxwkFVNi6yGyHygILZeF2Gg((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PmxgirX1GBNGJ_Q0cobNeKV_LzQ(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Qvg9qHKTKk10lwfJkN2tO5zZBiY(com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator bankingBundleNavigator) {
        bankingBundleNavigator.completeWithSuccess();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$RWos3Ntng1m-Aqq4dn0crP0Q4uY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12214$r8$lambda$RWos3Ntng1mAqq4dn0crP0Q4uY(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator bankingBundleNavigator, com.paypal.oslo.feature.bankingbundle.manager.BankingBundleFeatureManager bankingBundleFeatureManager, com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleDeepLinkDestination bankingBundleDeepLinkDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankingBundleDeepLinkDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(468980062, i, -1, "com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule.provideBankingBundleDeepLinkEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:202)");
        }
        com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowKt.BankingBundleFlow(bankingBundleDeepLinkDestination.toFlowIntent(), appNavigator, bankingBundleNavigator, bankingBundleFeatureManager, null, null, composer, 0, 48);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$S5gxwkFVNi-6yGyHygILZeF2G-g, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12215$r8$lambda$S5gxwkFVNi6yGyHygILZeF2Gg(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.bankingbundle.ui.webview.TermsWebViewDestination("https://www.paypal.com/us/campaign/ppdc-debit-5per-cashback-category-tnc", "banking-bundle-accept-money-choice"));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZFcBrLU77Qb5dR_RiQI6KmdfS9c(kotlin.jvm.functions.Function0 function0, com.paypal.oslo.feature.bankingbundle.ui.SuccessSheetDestination successSheetDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(successSheetDestination, "");
        if ((i & 6) == 0) {
            i |= composer.changed(successSheetDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-809969676, i, -1, "com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule.provideSuccessSheetEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:276)");
            }
            com.paypal.oslo.feature.bankingbundle.ui.SuccessHalfSheetKt.SuccessHalfSheetContent(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.bankingbundle.R.string.feature_banking_bundle_success_title, new java.lang.Object[]{successSheetDestination.getUserFirstName()}, composer, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.bankingbundle.R.string.feature_banking_bundle_success_button, composer, 0), function0, function0, null, composer, 0, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$_Wm-Qpc9akkpj0rKuxEK5HXX2tQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12216$r8$lambda$_WmQpc9akkpj0rKuxEK5HXX2tQ(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.bankingbundle.ui.webview.TermsWebViewDestination("https://www.paypal.com/us/campaign/ppdc-debit-5per-cashback-category-tnc", "banking-bundle-standalone-landing"));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fIOMFfcIfIoC1WHJlZZ4e2IewcY(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jlLnf0YOhpBON1kx9Urj9SAeehg(final com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator bankingBundleNavigator, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1449659471, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule.$r8$lambda$zWMXUK4WnRvqm2heRos6F4e2fQ8(com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator.this, appNavigator, (com.paypal.oslo.feature.bankingbundle.api.navigation.BenefitsComparisonDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bankingbundle.api.navigation.BenefitsComparisonDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bankingbundle.api.navigation.BenefitsComparisonDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule$provideBenefitsComparisonEntryProviderInstaller$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.bankingbundle.api.navigation.BenefitsComparisonDestination benefitsComparisonDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(benefitsComparisonDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bankingbundle.api.navigation.BenefitsComparisonDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule$provideBenefitsComparisonEntryProviderInstaller$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.bankingbundle.api.navigation.BenefitsComparisonDestination benefitsComparisonDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$l12hRvnBOFN5QSH_vkmc0gj6M10(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.bankingbundle.ui.webview.TermsWebViewDestination termsWebViewDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(termsWebViewDestination, "");
        if ((i & 6) == 0) {
            i |= composer.changed(termsWebViewDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(321936904, i, -1, "com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule.provideTermsWebViewEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:251)");
            }
            java.lang.String url = termsWebViewDestination.getUrl();
            java.lang.String source = termsWebViewDestination.getSource();
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule.m12204$r8$lambda$0n47p1_zszR1_ixAlycph5enlE(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.bankingbundle.ui.webview.TermsWebViewScreenKt.TermsWebViewScreen(url, source, (kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$l3nXN-h0aEzRAn4iBdwsMHq8ST0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12217$r8$lambda$l3nXNh0aEzRAn4iBdwsMHq8ST0(com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator bankingBundleNavigator, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.oneonboarding.api.navigation.result.OneOnboardingFlowNavResult oneOnboardingFlowNavResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oneOnboardingFlowNavResult, "");
        int i = com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule.WhenMappings.$EnumSwitchMapping$0[oneOnboardingFlowNavResult.getStatus().ordinal()];
        if (i == 1) {
            bankingBundleNavigator.completeWithSuccess();
        } else if (i == 2) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.bankingbundle.LoggerKt.log, "OneOnboarding canceled by user", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("status", oneOnboardingFlowNavResult.getStatus().name())), null, 4, null);
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule.$r8$lambda$z1bizj1nh5m1Hj9M2hQfVlPJUns((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        } else if (i == 3) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.bankingbundle.LoggerKt.log, "OneOnboarding failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("status", oneOnboardingFlowNavResult.getStatus().name())), null, 4, null);
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule.$r8$lambda$PmxgirX1GBNGJ_Q0cobNeKV_LzQ((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        } else if (i == 4) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.bankingbundle.LoggerKt.log, "OneOnboarding is still in progress", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("status", oneOnboardingFlowNavResult.getStatus().name())), null, 4, null);
        } else {
            if (i != 5) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.bankingbundle.LoggerKt.log, "OneOnboarding result received with IN_REVIEW status", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("status", oneOnboardingFlowNavResult.getStatus().name())), null, 4, null);
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule.$r8$lambda$fIOMFfcIfIoC1WHJlZZ4e2IewcY((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$lC8Aj0VNbIiLawQ3hVa7YDUahAc(com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator bankingBundleNavigator, com.paypal.oslo.feature.bankingbundle.ui.StandaloneLandingViewModel standaloneLandingViewModel) {
        bankingBundleNavigator.m12266launchOneOnboardingDpEMydE(standaloneLandingViewModel.getOneOnboardingRequestId());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ltcwiVyw_BQFEAyAfXbXHRB1Jhw(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.bankingbundle.ui.webview.TermsWebViewDestination("https://www.paypal.com/us/campaign/ppdc-debit-5per-cashback-category-tnc", "banking-bundle-benefits-comparison"));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$n3zOs2Eo0V8_1OSXPYE2wn79cZ4(com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator bankingBundleNavigator) {
        bankingBundleNavigator.navigateBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rlnI6mWFKOR7AI2aSagqjZPspvU(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(321936904, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule$$ExternalSyntheticLambda32
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule.$r8$lambda$l12hRvnBOFN5QSH_vkmc0gj6M10(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.bankingbundle.ui.webview.TermsWebViewDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bankingbundle.ui.webview.TermsWebViewDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bankingbundle.ui.webview.TermsWebViewDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule$provideTermsWebViewEntryProviderInstaller$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.bankingbundle.ui.webview.TermsWebViewDestination termsWebViewDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(termsWebViewDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bankingbundle.ui.webview.TermsWebViewDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule$provideTermsWebViewEntryProviderInstaller$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.bankingbundle.ui.webview.TermsWebViewDestination termsWebViewDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$strDw-e8Y1YmoZCjz4xEecSJttA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12218$r8$lambda$strDwe8Y1YmoZCjz4xEecSJttA(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule.$r8$lambda$ltcwiVyw_BQFEAyAfXbXHRB1Jhw((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$z1bizj1nh5m1Hj9M2hQfVlPJUns(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zWMXUK4WnRvqm2heRos6F4e2fQ8(final com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator bankingBundleNavigator, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.bankingbundle.api.navigation.BenefitsComparisonDestination benefitsComparisonDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(benefitsComparisonDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1449659471, i, -1, "com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule.provideBenefitsComparisonEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:220)");
        }
        boolean changed = composer.changed(bankingBundleNavigator);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule.$r8$lambda$n3zOs2Eo0V8_1OSXPYE2wn79cZ4(com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
        boolean changed2 = composer.changed(bankingBundleNavigator);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule.$r8$lambda$Qvg9qHKTKk10lwfJkN2tO5zZBiY(com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
        boolean changed3 = composer.changed(appNavigator);
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if (changed3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule.m12218$r8$lambda$strDwe8Y1YmoZCjz4xEecSJttA(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        com.paypal.oslo.feature.bankingbundle.ui.BenefitsComparisonScreenKt.BenefitsComparisonScreen(function0, function02, (kotlin.jvm.functions.Function0) rememberedValue3, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$zzXxO1-G8nWMWNUkr2LuG4utZXc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12219$r8$lambda$zzXxO1G8nWMWNUkr2LuG4utZXc(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule.m12216$r8$lambda$_WmQpc9akkpj0rKuxEK5HXX2tQ((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.oneonboarding.api.domain.Status.values().length];
            try {
                iArr[com.paypal.oslo.feature.oneonboarding.api.domain.Status.COMPLETED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.oneonboarding.api.domain.Status.CANCELED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.oneonboarding.api.domain.Status.FAILED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.oneonboarding.api.domain.Status.IN_PROGRESS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.oneonboarding.api.domain.Status.IN_REVIEW.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideHomeEntryProviderInstaller() {
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule.$r8$lambda$0054sXW_EL5bJ9c4I9uhON7u8Ac((androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }
}
