package com.paypal.oslo.feature.dataprivacy.di;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u000b\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0002\b\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ2\u0010\r\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0002\b\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\fJ2\u0010\u000e\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0002\b\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\fJ2\u0010\u000f\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0002\b\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\fJ2\u0010\u0010\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0002\b\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/di/ErasureNavigationModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/EntryProviderInstaller;", "Lkotlin/ExtensionFunctionType;", "provideLinkedAccountsEntryProvider", "(Lcom/paypal/oslo/core/navigation/AppNavigator;)Lkotlin/jvm/functions/Function1;", "provideEmailConfirmationEntryProvider", "provideErasureReasonEntryProvider", "provideErasurePendingEntryProvider", "provideErasureSuccessEntryProvider"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes12.dex */
public final class ErasureNavigationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.dataprivacy.di.ErasureNavigationModule INSTANCE = new com.paypal.oslo.feature.dataprivacy.di.ErasureNavigationModule();

    private ErasureNavigationModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideLinkedAccountsEntryProvider(final com.paypal.oslo.core.navigation.AppNavigator navigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.dataprivacy.di.ErasureNavigationModule$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.dataprivacy.di.ErasureNavigationModule.$r8$lambda$SrcrvwbuyPxTzZ9yOt1Cdixe9OE(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideEmailConfirmationEntryProvider(final com.paypal.oslo.core.navigation.AppNavigator navigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.dataprivacy.di.ErasureNavigationModule$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.dataprivacy.di.ErasureNavigationModule.$r8$lambda$0uMYazrlaGG5wtQM2JXZIzQdzQo(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideErasureReasonEntryProvider(final com.paypal.oslo.core.navigation.AppNavigator navigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.dataprivacy.di.ErasureNavigationModule$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.dataprivacy.di.ErasureNavigationModule.$r8$lambda$X6wEJBTnIvR82gkqHyI82IbzCZ0(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideErasurePendingEntryProvider(final com.paypal.oslo.core.navigation.AppNavigator navigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.dataprivacy.di.ErasureNavigationModule$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.dataprivacy.di.ErasureNavigationModule.$r8$lambda$xp8_pR9thqqsT3DpP6_i7tcDVLQ(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideErasureSuccessEntryProvider(final com.paypal.oslo.core.navigation.AppNavigator navigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.dataprivacy.di.ErasureNavigationModule$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.dataprivacy.di.ErasureNavigationModule.m14087$r8$lambda$mvdnE5eMY9S14unpHnU94p7fGc(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0uMYazrlaGG5wtQM2JXZIzQdzQo(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-830375859, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.dataprivacy.di.ErasureNavigationModule$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.dataprivacy.di.ErasureNavigationModule.$r8$lambda$N8NjfiJO5Y6MMxyf_Xm8IO23m0A(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.dataprivacy.api.navigation.EmailConfirmationDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.dataprivacy.api.navigation.EmailConfirmationDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.dataprivacy.api.navigation.EmailConfirmationDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.dataprivacy.di.ErasureNavigationModule$provideEmailConfirmationEntryProvider$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.dataprivacy.api.navigation.EmailConfirmationDestination emailConfirmationDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(emailConfirmationDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.dataprivacy.api.navigation.EmailConfirmationDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.dataprivacy.di.ErasureNavigationModule$provideEmailConfirmationEntryProvider$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.dataprivacy.api.navigation.EmailConfirmationDestination emailConfirmationDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$1oPKGL17eqrwuoKVf-vl-2Kcn7o, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14086$r8$lambda$1oPKGL17eqrwuoKVfvl2Kcn7o(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.dataprivacy.api.navigation.ErasurePendingDestination erasurePendingDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(erasurePendingDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1549968413, i, -1, "com.paypal.oslo.feature.dataprivacy.di.ErasureNavigationModule.provideErasurePendingEntryProvider.<anonymous>.<anonymous> (NavigationModule.kt:261)");
        }
        com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.ErasurePendingScreenKt.ErasurePendingScreen(appNavigator, null, composer, 0, 2);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$28kxpcJ4QNWjNsEdJ9ihsycre0k(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.dataprivacy.api.navigation.ErasureReasonDestination erasureReasonDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(erasureReasonDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1373763277, i, -1, "com.paypal.oslo.feature.dataprivacy.di.ErasureNavigationModule.provideErasureReasonEntryProvider.<anonymous>.<anonymous> (NavigationModule.kt:247)");
        }
        com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.ErasureReasonScreenKt.ErasureReasonScreen(appNavigator, null, null, composer, 0, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JyL62419Z2jVKCFQf6Ih9At0M3M(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.dataprivacy.api.navigation.LinkedAccountsDestination linkedAccountsDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedAccountsDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(747322437, i, -1, "com.paypal.oslo.feature.dataprivacy.di.ErasureNavigationModule.provideLinkedAccountsEntryProvider.<anonymous>.<anonymous> (NavigationModule.kt:216)");
        }
        com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.LinkedAccountsScreenKt.LinkedAccountsScreen(appNavigator, linkedAccountsDestination.getLinkedAccountNames(), null, composer, 0, 4);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$N8NjfiJO5Y6MMxyf_Xm8IO23m0A(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.dataprivacy.api.navigation.EmailConfirmationDestination emailConfirmationDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailConfirmationDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-830375859, i, -1, "com.paypal.oslo.feature.dataprivacy.di.ErasureNavigationModule.provideEmailConfirmationEntryProvider.<anonymous>.<anonymous> (NavigationModule.kt:233)");
        }
        com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.EmailConfirmationScreenKt.EmailConfirmationScreen(appNavigator, null, null, composer, 0, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RooXwLT5h7RKX5ViAey3IUppj58(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.dataprivacy.api.navigation.ErasureSuccessDestination erasureSuccessDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(erasureSuccessDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1487380667, i, -1, "com.paypal.oslo.feature.dataprivacy.di.ErasureNavigationModule.provideErasureSuccessEntryProvider.<anonymous>.<anonymous> (NavigationModule.kt:275)");
        }
        com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.ErasureSuccessScreenKt.ErasureSuccessScreen(appNavigator, null, composer, 0, 2);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$SrcrvwbuyPxTzZ9yOt1Cdixe9OE(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(747322437, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.dataprivacy.di.ErasureNavigationModule$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.dataprivacy.di.ErasureNavigationModule.$r8$lambda$JyL62419Z2jVKCFQf6Ih9At0M3M(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.dataprivacy.api.navigation.LinkedAccountsDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.dataprivacy.api.navigation.LinkedAccountsDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.dataprivacy.api.navigation.LinkedAccountsDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.dataprivacy.di.ErasureNavigationModule$provideLinkedAccountsEntryProvider$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.dataprivacy.api.navigation.LinkedAccountsDestination linkedAccountsDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(linkedAccountsDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.dataprivacy.api.navigation.LinkedAccountsDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.dataprivacy.di.ErasureNavigationModule$provideLinkedAccountsEntryProvider$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.dataprivacy.api.navigation.LinkedAccountsDestination linkedAccountsDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$X6wEJBTnIvR82gkqHyI82IbzCZ0(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1373763277, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.dataprivacy.di.ErasureNavigationModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.dataprivacy.di.ErasureNavigationModule.$r8$lambda$28kxpcJ4QNWjNsEdJ9ihsycre0k(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.dataprivacy.api.navigation.ErasureReasonDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.dataprivacy.api.navigation.ErasureReasonDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.dataprivacy.api.navigation.ErasureReasonDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.dataprivacy.di.ErasureNavigationModule$provideErasureReasonEntryProvider$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.dataprivacy.api.navigation.ErasureReasonDestination erasureReasonDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(erasureReasonDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.dataprivacy.api.navigation.ErasureReasonDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.dataprivacy.di.ErasureNavigationModule$provideErasureReasonEntryProvider$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.dataprivacy.api.navigation.ErasureReasonDestination erasureReasonDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$mvdnE5eMY9S14-unpHnU94p7fGc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14087$r8$lambda$mvdnE5eMY9S14unpHnU94p7fGc(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1487380667, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.dataprivacy.di.ErasureNavigationModule$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.dataprivacy.di.ErasureNavigationModule.$r8$lambda$RooXwLT5h7RKX5ViAey3IUppj58(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.dataprivacy.api.navigation.ErasureSuccessDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.dataprivacy.api.navigation.ErasureSuccessDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.dataprivacy.api.navigation.ErasureSuccessDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.dataprivacy.di.ErasureNavigationModule$provideErasureSuccessEntryProvider$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.dataprivacy.api.navigation.ErasureSuccessDestination erasureSuccessDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(erasureSuccessDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.dataprivacy.api.navigation.ErasureSuccessDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.dataprivacy.di.ErasureNavigationModule$provideErasureSuccessEntryProvider$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.dataprivacy.api.navigation.ErasureSuccessDestination erasureSuccessDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xp8_pR9thqqsT3DpP6_i7tcDVLQ(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1549968413, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.dataprivacy.di.ErasureNavigationModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.dataprivacy.di.ErasureNavigationModule.m14086$r8$lambda$1oPKGL17eqrwuoKVfvl2Kcn7o(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.dataprivacy.api.navigation.ErasurePendingDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.dataprivacy.api.navigation.ErasurePendingDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.dataprivacy.api.navigation.ErasurePendingDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.dataprivacy.di.ErasureNavigationModule$provideErasurePendingEntryProvider$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.dataprivacy.api.navigation.ErasurePendingDestination erasurePendingDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(erasurePendingDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.dataprivacy.api.navigation.ErasurePendingDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.dataprivacy.di.ErasureNavigationModule$provideErasurePendingEntryProvider$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.dataprivacy.api.navigation.ErasurePendingDestination erasurePendingDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }
}
