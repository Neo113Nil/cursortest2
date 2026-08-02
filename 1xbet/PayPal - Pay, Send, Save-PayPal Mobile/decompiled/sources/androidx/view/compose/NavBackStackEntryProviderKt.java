package androidx.view.compose;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a,\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a&\u0010\n\u001a\u00020\u0004*\u00020\u00012\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/navigation/NavBackStackEntry;", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "saveableStateHolder", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "LocalOwnersProvider", "(Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/saveable/SaveableStateHolder;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "p0", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/runtime/saveable/SaveableStateHolder;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NavBackStackEntryProviderKt {
    public static final void LocalOwnersProvider(final androidx.view.NavBackStackEntry navBackStackEntry, final androidx.compose.runtime.saveable.SaveableStateHolder saveableStateHolder, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(233973821);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(navBackStackEntry) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(saveableStateHolder) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !startRestartGroup.getSkipping()) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(233973821, i2, -1, "androidx.navigation.compose.LocalOwnersProvider (NavBackStackEntryProvider.kt:49)");
            }
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) new androidx.compose.runtime.ProvidedValue[]{androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.provides(navBackStackEntry), androidx.view.compose.LocalLifecycleOwnerKt.getLocalLifecycleOwner().provides(navBackStackEntry), androidx.view.compose.LocalSavedStateRegistryOwnerKt.getLocalSavedStateRegistryOwner().provides(navBackStackEntry)}, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1808964477, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.navigation.compose.NavBackStackEntryProviderKt$LocalOwnersProvider$1
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    androidx.compose.runtime.Composer composer3 = composer2;
                    int intValue = num.intValue();
                    if ((intValue & 3) != 2 || !composer3.getSkipping()) {
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(1808964477, intValue, -1, "androidx.navigation.compose.LocalOwnersProvider.<anonymous> (NavBackStackEntryProvider.kt:55)");
                        }
                        androidx.view.compose.NavBackStackEntryProviderKt.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.saveable.SaveableStateHolder.this, function2, composer3, 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer3.skipToGroupEnd();
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }, startRestartGroup, 54), startRestartGroup, androidx.compose.runtime.ProvidedValue.$stable | 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.navigation.compose.NavBackStackEntryProviderKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.view.compose.NavBackStackEntryProviderKt.$r8$lambda$l5A6MjJA2IMy5aOWFHw0gFkDWTc(androidx.view.NavBackStackEntry.this, saveableStateHolder, function2, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighResolutionOutputSizeshNQ4ISI(final androidx.compose.runtime.saveable.SaveableStateHolder saveableStateHolder, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(832919318);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(saveableStateHolder) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(832919318, i3, -1, "androidx.navigation.compose.SaveableStateProvider (NavBackStackEntryProvider.kt:60)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.navigation.compose.NavBackStackEntryProviderKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.view.compose.NavBackStackEntryProviderKt.$r8$lambda$5Xhhy9EHqRyucxYvYedEkjAWf9c((androidx.view.viewmodel.CreationExtras) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, 6);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.view.compose.BackStackEntryIdViewModel.class);
            androidx.view.viewmodel.InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new androidx.view.viewmodel.InitializerViewModelFactoryBuilder();
            initializerViewModelFactoryBuilder.addInitializer(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.view.compose.BackStackEntryIdViewModel.class), function1);
            androidx.lifecycle.ViewModelProvider.Factory build = initializerViewModelFactoryBuilder.build();
            if (current instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                empty = ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
            } else {
                empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
            }
            androidx.view.compose.BackStackEntryIdViewModel backStackEntryIdViewModel = (androidx.view.compose.BackStackEntryIdViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(orCreateKotlinClass, current, (java.lang.String) null, build, empty, startRestartGroup, 0, 0);
            backStackEntryIdViewModel.setSaveableStateHolderRef(new androidx.view.compose.internal.WeakReference<>(saveableStateHolder));
            saveableStateHolder.SaveableStateProvider(backStackEntryIdViewModel.getId(), function2, startRestartGroup, ((i3 << 6) & 896) | (i3 & 112));
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.navigation.compose.NavBackStackEntryProviderKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.view.compose.NavBackStackEntryProviderKt.m9197$r8$lambda$AFHZfDjqfp40SnoViye7bYq_L0(androidx.compose.runtime.saveable.SaveableStateHolder.this, function2, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ androidx.view.compose.BackStackEntryIdViewModel $r8$lambda$5Xhhy9EHqRyucxYvYedEkjAWf9c(androidx.view.viewmodel.CreationExtras creationExtras) {
        return new androidx.view.compose.BackStackEntryIdViewModel(androidx.view.SavedStateHandleSupport.createSavedStateHandle(creationExtras));
    }

    /* renamed from: $r8$lambda$AFHZfDjqfp40SnoViy-e7bYq_L0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9197$r8$lambda$AFHZfDjqfp40SnoViye7bYq_L0(androidx.compose.runtime.saveable.SaveableStateHolder saveableStateHolder, kotlin.jvm.functions.Function2 function2, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighResolutionOutputSizeshNQ4ISI(saveableStateHolder, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$l5A6MjJA2IMy5aOWFHw0gFkDWTc(androidx.view.NavBackStackEntry navBackStackEntry, androidx.compose.runtime.saveable.SaveableStateHolder saveableStateHolder, kotlin.jvm.functions.Function2 function2, int i, androidx.compose.runtime.Composer composer, int i2) {
        LocalOwnersProvider(navBackStackEntry, saveableStateHolder, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
