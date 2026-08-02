package com.paypal.oslo.feature.onboarding.postonboarding.di;

@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0019\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0001¢\u0006\u0002\u0010\u0004\u001a\u001a\u0010\u0005\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0000\u001a\u001a\u0010\u000b\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0000\u001a\u001a\u0010\f\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0000\u001a\u001a\u0010\r\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0000\u001a\u001a\u0010\u000e\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0000\u001a\u001a\u0010\u000f\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0000\u001a\u001a\u0010\u0010\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0000\u001a\u001a\u0010\u0011\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0000\u001a\u001a\u0010\u0012\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0000\u001a\u001a\u0010\u0013\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0000\u001a\u001a\u0010\u0014\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0000¨\u0006\u0015"}, d2 = {"scopedPostOnboardingViewModel", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingViewModel;", "deepLinkParams", "Lcom/paypal/oslo/feature/onboarding/api/navigation/PostOnboardingDeepLinkParams;", "(Lcom/paypal/oslo/feature/onboarding/api/navigation/PostOnboardingDeepLinkParams;Landroidx/compose/runtime/Composer;II)Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingViewModel;", "postOnboardingFlowEntry", "", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "postOnboardingNavigator", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingNavigator;", "dummyStepScreenEntry", "intentSelectionScreenEntry", "celebrationScreenEntry", "celebrationHalfSheetScreenEntry", "activationIntroScreenEntry", "pushNotificationScreenEntry", "addFiScreenEntry", "addNfcScreenEntry", "addBankScreenEntry", "onboardingPasskeyScreenEntry", "onboarding_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PostOnboardingNavigationEntriesKt {
    public static final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel scopedPostOnboardingViewModel(final com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingDeepLinkParams postOnboardingDeepLinkParams, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            postOnboardingDeepLinkParams = null;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(899344474, i, -1, "com.paypal.oslo.feature.onboarding.postonboarding.di.scopedPostOnboardingViewModel (PostOnboardingNavigationEntries.kt:69)");
        }
        boolean changedInstance = composer.changedInstance(postOnboardingDeepLinkParams);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt.m16098$r8$lambda$4RWpdqN50B8UwjCAZUTcGK9dU(com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingDeepLinkParams.this, (com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel.Factory) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel postOnboardingViewModel = (com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return postOnboardingViewModel;
    }

    public static final void postOnboardingFlowEntry(androidx.navigation3.runtime.EntryProviderScope<java.lang.Object> entryProviderScope, final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postOnboardingNavigator, "");
        kotlin.jvm.functions.Function1<K, ? extends java.lang.Object> function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt.$r8$lambda$UIKawuDTUOytlq6KjHCzDrztVVk((com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingFlowDestination) obj);
            }
        };
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingFlowDestination.class), (kotlin.jvm.functions.Function1) function1, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingFlowDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt$postOnboardingFlowEntry$$inlined$entry$1
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingFlowDestination postOnboardingFlowDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1535855669, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt.$r8$lambda$jjZsTvmPXf97Ajh2oeN8Dr2PU34(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator.this, (com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingFlowDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }));
    }

    public static final void dummyStepScreenEntry(androidx.navigation3.runtime.EntryProviderScope<java.lang.Object> entryProviderScope, final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postOnboardingNavigator, "");
        kotlin.jvm.functions.Function1<K, ? extends java.lang.Object> function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt.$r8$lambda$n7GsvzTVFql22wVqzR2R93bOaj4((com.paypal.oslo.feature.onboarding.steps.ui.DummyScreenDestination) obj);
            }
        };
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.onboarding.steps.ui.DummyScreenDestination.class), (kotlin.jvm.functions.Function1) function1, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.onboarding.steps.ui.DummyScreenDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt$dummyStepScreenEntry$$inlined$entry$1
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.onboarding.steps.ui.DummyScreenDestination dummyScreenDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1408866811, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt.$r8$lambda$oUITHErnZOZ4C4IVt9WUlDJCTgg(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator.this, (com.paypal.oslo.feature.onboarding.steps.ui.DummyScreenDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }));
    }

    public static final void intentSelectionScreenEntry(androidx.navigation3.runtime.EntryProviderScope<java.lang.Object> entryProviderScope, final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postOnboardingNavigator, "");
        kotlin.jvm.functions.Function1<K, ? extends java.lang.Object> function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt.$r8$lambda$eV7OPt1yRUlX4SKUOf9lM8obVdg((com.paypal.oslo.feature.onboarding.postonboarding.intent.navigation.IntentSelectionDestination) obj);
            }
        };
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.onboarding.postonboarding.intent.navigation.IntentSelectionDestination.class), (kotlin.jvm.functions.Function1) function1, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.onboarding.postonboarding.intent.navigation.IntentSelectionDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt$intentSelectionScreenEntry$$inlined$entry$1
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.onboarding.postonboarding.intent.navigation.IntentSelectionDestination intentSelectionDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1222318291, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt.$r8$lambda$EjFkWauTsGHe40YyFVHdWW8L_A0(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator.this, (com.paypal.oslo.feature.onboarding.postonboarding.intent.navigation.IntentSelectionDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }));
    }

    public static final void celebrationScreenEntry(androidx.navigation3.runtime.EntryProviderScope<java.lang.Object> entryProviderScope, final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postOnboardingNavigator, "");
        kotlin.jvm.functions.Function1<K, ? extends java.lang.Object> function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt.m16101$r8$lambda$eB8ZhXKYl14Xbgt2G4RsgXwT8E((com.paypal.oslo.feature.onboarding.postonboarding.celebration.navigation.CelebrationDestination) obj);
            }
        };
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.onboarding.postonboarding.celebration.navigation.CelebrationDestination.class), (kotlin.jvm.functions.Function1) function1, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.onboarding.postonboarding.celebration.navigation.CelebrationDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt$celebrationScreenEntry$$inlined$entry$1
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.onboarding.postonboarding.celebration.navigation.CelebrationDestination celebrationDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1862882311, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt.$r8$lambda$5D_kwEQ7gztasHJeEEYi6jxzmTI(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator.this, (com.paypal.oslo.feature.onboarding.postonboarding.celebration.navigation.CelebrationDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }));
    }

    public static final void celebrationHalfSheetScreenEntry(androidx.navigation3.runtime.EntryProviderScope<java.lang.Object> entryProviderScope, final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postOnboardingNavigator, "");
        final java.util.Map bottomSheetMetadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.bottomSheetMetadata$default(null, false, false, false, null, null, null, 119, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1280955935, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt.$r8$lambda$q5aUTVxl8rmE9ju9F6_XH1LXcIY(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator.this, (com.paypal.oslo.feature.onboarding.postonboarding.celebration.navigation.CelebrationHalfSheetDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.onboarding.postonboarding.celebration.navigation.CelebrationHalfSheetDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.onboarding.postonboarding.celebration.navigation.CelebrationHalfSheetDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt$celebrationHalfSheetScreenEntry$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.onboarding.postonboarding.celebration.navigation.CelebrationHalfSheetDestination celebrationHalfSheetDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(celebrationHalfSheetDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.onboarding.postonboarding.celebration.navigation.CelebrationHalfSheetDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt$celebrationHalfSheetScreenEntry$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.onboarding.postonboarding.celebration.navigation.CelebrationHalfSheetDestination celebrationHalfSheetDestination) {
                return bottomSheetMetadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
    }

    public static final void activationIntroScreenEntry(androidx.navigation3.runtime.EntryProviderScope<java.lang.Object> entryProviderScope, final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postOnboardingNavigator, "");
        kotlin.jvm.functions.Function1<K, ? extends java.lang.Object> function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt.$r8$lambda$GfdF2AswcenEKaEcMPM4Ww0IPzo((com.paypal.oslo.feature.onboarding.postonboarding.activation.navigation.ActivationIntroDestination) obj);
            }
        };
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.onboarding.postonboarding.activation.navigation.ActivationIntroDestination.class), (kotlin.jvm.functions.Function1) function1, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.onboarding.postonboarding.activation.navigation.ActivationIntroDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt$activationIntroScreenEntry$$inlined$entry$1
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.onboarding.postonboarding.activation.navigation.ActivationIntroDestination activationIntroDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-5930655, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt.$r8$lambda$5dEc1GcaAVHWIgjyf1ERDDjuZG8(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator.this, (com.paypal.oslo.feature.onboarding.postonboarding.activation.navigation.ActivationIntroDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }));
    }

    public static final void pushNotificationScreenEntry(androidx.navigation3.runtime.EntryProviderScope<java.lang.Object> entryProviderScope, final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postOnboardingNavigator, "");
        kotlin.jvm.functions.Function1<K, ? extends java.lang.Object> function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt.$r8$lambda$YO2HT0prhCk7g5RUHHL8vrxKHxI((com.paypal.oslo.feature.onboarding.postonboarding.pushnotification.navigation.PushNotificationDestination) obj);
            }
        };
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.onboarding.postonboarding.pushnotification.navigation.PushNotificationDestination.class), (kotlin.jvm.functions.Function1) function1, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.onboarding.postonboarding.pushnotification.navigation.PushNotificationDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt$pushNotificationScreenEntry$$inlined$entry$1
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.onboarding.postonboarding.pushnotification.navigation.PushNotificationDestination pushNotificationDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1057728705, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt.m16100$r8$lambda$cVH4Roa2urOChPrLoiOaIyQJMc(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator.this, (com.paypal.oslo.feature.onboarding.postonboarding.pushnotification.navigation.PushNotificationDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }));
    }

    public static final void addFiScreenEntry(androidx.navigation3.runtime.EntryProviderScope<java.lang.Object> entryProviderScope, final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postOnboardingNavigator, "");
        kotlin.jvm.functions.Function1<K, ? extends java.lang.Object> function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt.$r8$lambda$wWiDj_ArjLFPOwQgeCScFWztG70((com.paypal.oslo.feature.onboarding.postonboarding.addfi.navigation.AddFiDestination) obj);
            }
        };
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.onboarding.postonboarding.addfi.navigation.AddFiDestination.class), (kotlin.jvm.functions.Function1) function1, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.onboarding.postonboarding.addfi.navigation.AddFiDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt$addFiScreenEntry$$inlined$entry$1
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.onboarding.postonboarding.addfi.navigation.AddFiDestination addFiDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-326570619, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt.$r8$lambda$zPF1H39B_vN04_cqYbXfCOdV2I0(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator.this, (com.paypal.oslo.feature.onboarding.postonboarding.addfi.navigation.AddFiDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }));
    }

    public static final void addNfcScreenEntry(androidx.navigation3.runtime.EntryProviderScope<java.lang.Object> entryProviderScope, final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postOnboardingNavigator, "");
        kotlin.jvm.functions.Function1<K, ? extends java.lang.Object> function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt.m16099$r8$lambda$5CGVt8YNnKd4q1m49698EoKIII((com.paypal.oslo.feature.onboarding.postonboarding.addnfc.navigation.AddNfcDestination) obj);
            }
        };
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.onboarding.postonboarding.addnfc.navigation.AddNfcDestination.class), (kotlin.jvm.functions.Function1) function1, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.onboarding.postonboarding.addnfc.navigation.AddNfcDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt$addNfcScreenEntry$$inlined$entry$1
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.onboarding.postonboarding.addnfc.navigation.AddNfcDestination addNfcDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1706150689, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt.$r8$lambda$W11_iArw8Lyzl9URs7aXxld2ipg(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator.this, (com.paypal.oslo.feature.onboarding.postonboarding.addnfc.navigation.AddNfcDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }));
    }

    public static final void addBankScreenEntry(androidx.navigation3.runtime.EntryProviderScope<java.lang.Object> entryProviderScope, final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postOnboardingNavigator, "");
        kotlin.jvm.functions.Function1<K, ? extends java.lang.Object> function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt.m16103$r8$lambda$w9HPLMVeWgosHYRPtogLw5dQ7w((com.paypal.oslo.feature.onboarding.postonboarding.addbank.navigation.AddBankDestination) obj);
            }
        };
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.onboarding.postonboarding.addbank.navigation.AddBankDestination.class), (kotlin.jvm.functions.Function1) function1, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.onboarding.postonboarding.addbank.navigation.AddBankDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt$addBankScreenEntry$$inlined$entry$1
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.onboarding.postonboarding.addbank.navigation.AddBankDestination addBankDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(2119553299, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt.$r8$lambda$JVFnhmLp4gG0TT3bLHVGgEAfsZ0(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator.this, (com.paypal.oslo.feature.onboarding.postonboarding.addbank.navigation.AddBankDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }));
    }

    public static final void onboardingPasskeyScreenEntry(androidx.navigation3.runtime.EntryProviderScope<java.lang.Object> entryProviderScope, final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postOnboardingNavigator, "");
        kotlin.jvm.functions.Function1<K, ? extends java.lang.Object> function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt.m16102$r8$lambda$jPEqanFL_onGuoliFXnOmNnNU((com.paypal.oslo.feature.onboarding.postonboarding.passkeyenrollment.navigation.OnboardingPasskeyDestination) obj);
            }
        };
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.onboarding.postonboarding.passkeyenrollment.navigation.OnboardingPasskeyDestination.class), (kotlin.jvm.functions.Function1) function1, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.onboarding.postonboarding.passkeyenrollment.navigation.OnboardingPasskeyDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt$onboardingPasskeyScreenEntry$$inlined$entry$1
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.onboarding.postonboarding.passkeyenrollment.navigation.OnboardingPasskeyDestination onboardingPasskeyDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(380387047, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.onboarding.postonboarding.di.PostOnboardingNavigationEntriesKt.$r8$lambda$RxBdjtlDHMDQwcY8XLKGdNfScmE(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator.this, (com.paypal.oslo.feature.onboarding.postonboarding.passkeyenrollment.navigation.OnboardingPasskeyDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }));
    }

    /* renamed from: $r8$lambda$4RWp-dqN50B8Uwj-CAZUTcGK9dU, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel m16098$r8$lambda$4RWpdqN50B8UwjCAZUTcGK9dU(com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingDeepLinkParams postOnboardingDeepLinkParams, com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(postOnboardingDeepLinkParams);
    }

    /* renamed from: $r8$lambda$5CGVt8YNnKd4q1m4-9698EoKIII, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m16099$r8$lambda$5CGVt8YNnKd4q1m49698EoKIII(com.paypal.oslo.feature.onboarding.postonboarding.addnfc.navigation.AddNfcDestination addNfcDestination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addNfcDestination, "");
        return addNfcDestination.getStep().m16523getInitialFlowId8NcbBzM();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5D_kwEQ7gztasHJeEEYi6jxzmTI(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator, com.paypal.oslo.feature.onboarding.postonboarding.celebration.navigation.CelebrationDestination celebrationDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(celebrationDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1862882311, i, -1, "com.paypal.oslo.feature.onboarding.postonboarding.di.celebrationScreenEntry.<anonymous> (PostOnboardingNavigationEntries.kt:122)");
        }
        com.paypal.oslo.feature.onboarding.postonboarding.celebration.ui.CelebrationScreenKt.CelebrationScreen(celebrationDestination, postOnboardingNavigator, scopedPostOnboardingViewModel(null, composer, 0, 1), composer, i & 14);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5dEc1GcaAVHWIgjyf1ERDDjuZG8(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator, com.paypal.oslo.feature.onboarding.postonboarding.activation.navigation.ActivationIntroDestination activationIntroDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activationIntroDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-5930655, i, -1, "com.paypal.oslo.feature.onboarding.postonboarding.di.activationIntroScreenEntry.<anonymous> (PostOnboardingNavigationEntries.kt:144)");
        }
        com.paypal.oslo.feature.onboarding.postonboarding.activation.ui.ActivationIntroScreenKt.ActivationIntroScreen(activationIntroDestination, postOnboardingNavigator, scopedPostOnboardingViewModel(null, composer, 0, 1), composer, i & 14);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$EjFkWauTsGHe40YyFVHdWW8L_A0(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator, com.paypal.oslo.feature.onboarding.postonboarding.intent.navigation.IntentSelectionDestination intentSelectionDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentSelectionDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1222318291, i, -1, "com.paypal.oslo.feature.onboarding.postonboarding.di.intentSelectionScreenEntry.<anonymous> (PostOnboardingNavigationEntries.kt:110)");
        }
        com.paypal.oslo.feature.onboarding.postonboarding.intent.ui.IntentSelectionScreenKt.IntentSelectionScreen(intentSelectionDestination, postOnboardingNavigator, scopedPostOnboardingViewModel(null, composer, 0, 1), composer, i & 14);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object $r8$lambda$GfdF2AswcenEKaEcMPM4Ww0IPzo(com.paypal.oslo.feature.onboarding.postonboarding.activation.navigation.ActivationIntroDestination activationIntroDestination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activationIntroDestination, "");
        return activationIntroDestination.getStep().m16523getInitialFlowId8NcbBzM();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JVFnhmLp4gG0TT3bLHVGgEAfsZ0(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator, com.paypal.oslo.feature.onboarding.postonboarding.addbank.navigation.AddBankDestination addBankDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addBankDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(2119553299, i, -1, "com.paypal.oslo.feature.onboarding.postonboarding.di.addBankScreenEntry.<anonymous> (PostOnboardingNavigationEntries.kt:192)");
        }
        com.paypal.oslo.feature.onboarding.postonboarding.addbank.ui.AddBankScreenKt.AddBankScreen(addBankDestination, postOnboardingNavigator, scopedPostOnboardingViewModel(null, composer, 0, 1), composer, i & 14);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RxBdjtlDHMDQwcY8XLKGdNfScmE(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator, com.paypal.oslo.feature.onboarding.postonboarding.passkeyenrollment.navigation.OnboardingPasskeyDestination onboardingPasskeyDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onboardingPasskeyDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(380387047, i, -1, "com.paypal.oslo.feature.onboarding.postonboarding.di.onboardingPasskeyScreenEntry.<anonymous> (PostOnboardingNavigationEntries.kt:204)");
        }
        com.paypal.oslo.feature.onboarding.postonboarding.passkeyenrollment.ui.OnboardingPasskeyScreenKt.OnboardingPasskeyScreen(onboardingPasskeyDestination, postOnboardingNavigator, scopedPostOnboardingViewModel(null, composer, 0, 1), composer, i & 14);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object $r8$lambda$UIKawuDTUOytlq6KjHCzDrztVVk(com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingFlowDestination postOnboardingFlowDestination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postOnboardingFlowDestination, "");
        return postOnboardingFlowDestination.mo15903getFlowId8NcbBzM();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$W11_iArw8Lyzl9URs7aXxld2ipg(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator, com.paypal.oslo.feature.onboarding.postonboarding.addnfc.navigation.AddNfcDestination addNfcDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addNfcDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1706150689, i, -1, "com.paypal.oslo.feature.onboarding.postonboarding.di.addNfcScreenEntry.<anonymous> (PostOnboardingNavigationEntries.kt:180)");
        }
        com.paypal.oslo.feature.onboarding.postonboarding.addnfc.ui.AddNfcScreenKt.AddNfcScreen(addNfcDestination, postOnboardingNavigator, scopedPostOnboardingViewModel(null, composer, 0, 1), composer, i & 14);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object $r8$lambda$YO2HT0prhCk7g5RUHHL8vrxKHxI(com.paypal.oslo.feature.onboarding.postonboarding.pushnotification.navigation.PushNotificationDestination pushNotificationDestination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushNotificationDestination, "");
        return pushNotificationDestination.getStep().m16523getInitialFlowId8NcbBzM();
    }

    /* renamed from: $r8$lambda$cVH4Roa2urOChPrLoiOaIyQJM-c, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16100$r8$lambda$cVH4Roa2urOChPrLoiOaIyQJMc(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator, com.paypal.oslo.feature.onboarding.postonboarding.pushnotification.navigation.PushNotificationDestination pushNotificationDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushNotificationDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1057728705, i, -1, "com.paypal.oslo.feature.onboarding.postonboarding.di.pushNotificationScreenEntry.<anonymous> (PostOnboardingNavigationEntries.kt:156)");
        }
        com.paypal.oslo.feature.onboarding.postonboarding.pushnotification.ui.PushNotificationScreenKt.PushNotificationScreen(pushNotificationDestination, postOnboardingNavigator, scopedPostOnboardingViewModel(null, composer, 0, 1), null, composer, i & 14, 8);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$eB8ZhXKYl14Xbgt2G4-RsgXwT8E, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m16101$r8$lambda$eB8ZhXKYl14Xbgt2G4RsgXwT8E(com.paypal.oslo.feature.onboarding.postonboarding.celebration.navigation.CelebrationDestination celebrationDestination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(celebrationDestination, "");
        return celebrationDestination.getStep().m16523getInitialFlowId8NcbBzM();
    }

    public static /* synthetic */ java.lang.Object $r8$lambda$eV7OPt1yRUlX4SKUOf9lM8obVdg(com.paypal.oslo.feature.onboarding.postonboarding.intent.navigation.IntentSelectionDestination intentSelectionDestination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentSelectionDestination, "");
        return intentSelectionDestination.getStep().m16523getInitialFlowId8NcbBzM();
    }

    /* renamed from: $r8$lambda$jPEqanFL_o-nGu-oliFXnOmNnNU, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m16102$r8$lambda$jPEqanFL_onGuoliFXnOmNnNU(com.paypal.oslo.feature.onboarding.postonboarding.passkeyenrollment.navigation.OnboardingPasskeyDestination onboardingPasskeyDestination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onboardingPasskeyDestination, "");
        return onboardingPasskeyDestination.getStep().m16523getInitialFlowId8NcbBzM();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jjZsTvmPXf97Ajh2oeN8Dr2PU34(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator, com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingFlowDestination postOnboardingFlowDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postOnboardingFlowDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1535855669, i, -1, "com.paypal.oslo.feature.onboarding.postonboarding.di.postOnboardingFlowEntry.<anonymous> (PostOnboardingNavigationEntries.kt:82)");
        }
        com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingFlowScreenKt.m16125PostOnboardingFlowScreenfVxw3D8(postOnboardingFlowDestination.mo15903getFlowId8NcbBzM(), postOnboardingNavigator, scopedPostOnboardingViewModel(postOnboardingFlowDestination.getDeepLinkParams(), composer, 0, 0), null, composer, 0, 8);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object $r8$lambda$n7GsvzTVFql22wVqzR2R93bOaj4(com.paypal.oslo.feature.onboarding.steps.ui.DummyScreenDestination dummyScreenDestination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dummyScreenDestination, "");
        return dummyScreenDestination.getStep().m16523getInitialFlowId8NcbBzM();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$oUITHErnZOZ4C4IVt9WUlDJCTgg(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator, com.paypal.oslo.feature.onboarding.steps.ui.DummyScreenDestination dummyScreenDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dummyScreenDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1408866811, i, -1, "com.paypal.oslo.feature.onboarding.postonboarding.di.dummyStepScreenEntry.<anonymous> (PostOnboardingNavigationEntries.kt:98)");
        }
        com.paypal.oslo.feature.onboarding.steps.ui.DummyStepScreenKt.DummyStepScreen(dummyScreenDestination, postOnboardingNavigator, scopedPostOnboardingViewModel(null, composer, 0, 1), composer, i & 14);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$q5aUTVxl8rmE9ju9F6_XH1LXcIY(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator, com.paypal.oslo.feature.onboarding.postonboarding.celebration.navigation.CelebrationHalfSheetDestination celebrationHalfSheetDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(celebrationHalfSheetDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1280955935, i, -1, "com.paypal.oslo.feature.onboarding.postonboarding.di.celebrationHalfSheetScreenEntry.<anonymous> (PostOnboardingNavigationEntries.kt:133)");
        }
        com.paypal.oslo.feature.onboarding.postonboarding.celebration.ui.CelebrationHalfSheetScreenKt.CelebrationHalfSheetScreen(celebrationHalfSheetDestination, postOnboardingNavigator, null, composer, i & 14, 4);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$w9HPLMVeWgosHYRPto-gLw5dQ7w, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m16103$r8$lambda$w9HPLMVeWgosHYRPtogLw5dQ7w(com.paypal.oslo.feature.onboarding.postonboarding.addbank.navigation.AddBankDestination addBankDestination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addBankDestination, "");
        return addBankDestination.getStep().m16523getInitialFlowId8NcbBzM();
    }

    public static /* synthetic */ java.lang.Object $r8$lambda$wWiDj_ArjLFPOwQgeCScFWztG70(com.paypal.oslo.feature.onboarding.postonboarding.addfi.navigation.AddFiDestination addFiDestination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFiDestination, "");
        return addFiDestination.getStep().m16523getInitialFlowId8NcbBzM();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zPF1H39B_vN04_cqYbXfCOdV2I0(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator, com.paypal.oslo.feature.onboarding.postonboarding.addfi.navigation.AddFiDestination addFiDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFiDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-326570619, i, -1, "com.paypal.oslo.feature.onboarding.postonboarding.di.addFiScreenEntry.<anonymous> (PostOnboardingNavigationEntries.kt:168)");
        }
        com.paypal.oslo.feature.onboarding.postonboarding.addfi.ui.AddFiScreenKt.AddFiScreen(addFiDestination, postOnboardingNavigator, scopedPostOnboardingViewModel(null, composer, 0, 1), composer, i & 14);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
