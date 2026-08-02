package com.paypal.oslo.feature.home.ui.accountsnapshot;

@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a9\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0001¢\u0006\u0002\u0010\u000b¨\u0006\f²\u0006\n\u0010\r\u001a\u00020\u000eX\u008a\u0084\u0002"}, d2 = {"AccountSnapshotSection", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "viewModelFactory", "Lcom/paypal/oslo/feature/home/ui/accountsnapshot/AccountSnapshotViewModel$Factory;", "modifier", "Landroidx/compose/ui/Modifier;", "includedTypes", "", "Lcom/paypal/oslo/feature/home/api/AccountSnapshotType;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/home/ui/accountsnapshot/AccountSnapshotViewModel$Factory;Landroidx/compose/ui/Modifier;Ljava/util/Set;Landroidx/compose/runtime/Composer;II)V", "home_prodRelease", "uiState", "Lcom/paypal/oslo/feature/home/ui/accountsnapshot/mvi/AccountSnapshotUiState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AccountSnapshotProviderImplKt {
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountSnapshotSection(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotViewModel.Factory factory, androidx.compose.ui.Modifier modifier, java.util.Set<? extends com.paypal.oslo.feature.home.api.AccountSnapshotType> set, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        java.util.Set<? extends com.paypal.oslo.feature.home.api.AccountSnapshotType> set2;
        androidx.compose.ui.Modifier modifier3;
        final java.util.Set<? extends com.paypal.oslo.feature.home.api.AccountSnapshotType> set3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        com.paypal.oslo.feature.home.domain.model.Section<?> section;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-284620918);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? startRestartGroup.changed(factory) : startRestartGroup.changedInstance(factory) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                set2 = set;
                i3 |= startRestartGroup.changedInstance(set2) ? 2048 : 1024;
                if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    set3 = set2;
                } else {
                    modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    final java.util.Set<? extends com.paypal.oslo.feature.home.api.AccountSnapshotType> set4 = i4 != 0 ? null : set2;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-284620918, i3, -1, "com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotSection (AccountSnapshotProviderImpl.kt:87)");
                    }
                    androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new java.lang.IllegalStateException("No ViewModelStoreOwner found - AccountSnapshotSection must be called within a composable hierarchy that provides one".toString());
                    }
                    java.lang.String valueOf = java.lang.String.valueOf(set4);
                    androidx.lifecycle.ViewModelProvider.Factory factory2 = new androidx.lifecycle.ViewModelProvider.Factory() { // from class: com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotProviderImplKt$AccountSnapshotSection$viewModel$1
                        @Override // androidx.lifecycle.ViewModelProvider.Factory
                        public final /* bridge */ <T extends androidx.view.ViewModel> T create(java.lang.Class<T> cls, androidx.view.viewmodel.CreationExtras creationExtras) {
                            return (T) super.create(cls, creationExtras);
                        }

                        @Override // androidx.lifecycle.ViewModelProvider.Factory
                        public final /* bridge */ <T extends androidx.view.ViewModel> T create(kotlin.reflect.KClass<T> kClass, androidx.view.viewmodel.CreationExtras creationExtras) {
                            return (T) super.create(kClass, creationExtras);
                        }

                        @Override // androidx.lifecycle.ViewModelProvider.Factory
                        public final <T extends androidx.view.ViewModel> T create(java.lang.Class<T> modelClass) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modelClass, "");
                            com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotViewModel create = com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotViewModel.Factory.this.create(set4);
                            kotlin.jvm.internal.Intrinsics.checkNotNull(create, "");
                            return create;
                        }
                    };
                    if (current instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                        empty = ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                    } else {
                        empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
                    }
                    java.util.Set<? extends com.paypal.oslo.feature.home.api.AccountSnapshotType> set5 = set4;
                    final com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotViewModel accountSnapshotViewModel = (com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotViewModel.class), current, valueOf, factory2, empty, startRestartGroup, 0, 0);
                    androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(accountSnapshotViewModel.getUiState(), null, startRestartGroup, 0, 1);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    boolean changedInstance = startRestartGroup.changedInstance(accountSnapshotViewModel);
                    boolean z = (i3 & 14) == 4;
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if ((changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotProviderImplKt$AccountSnapshotSection$1$1(accountSnapshotViewModel, appNavigator, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                    com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiState accountSnapshotUiState = (com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiState) collectAsState.getValue();
                    if (accountSnapshotUiState instanceof com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiState.Loading) {
                        section = ((com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiState.Loading) accountSnapshotUiState).getSection();
                    } else if (accountSnapshotUiState instanceof com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiState.Success) {
                        section = ((com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiState.Success) accountSnapshotUiState).getSection();
                    } else {
                        if (!(accountSnapshotUiState instanceof com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiState.Error)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        section = ((com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiState.Error) accountSnapshotUiState).getSection();
                    }
                    if (section == null) {
                        startRestartGroup.startReplaceGroup(-874696132);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-874696131);
                        if (kotlin.jvm.internal.Intrinsics.areEqual(section.getType(), "Error")) {
                            startRestartGroup.startReplaceGroup(2071485257);
                            com.paypal.oslo.feature.home.domain.model.SectionError sectionError = (com.paypal.oslo.feature.home.domain.model.SectionError) kotlin.collections.CollectionsKt.first((java.util.List) section.getItems());
                            boolean exhausted = sectionError.getExhausted();
                            float accountSnapshotContainerHeightDp = com.paypal.oslo.feature.home.ui.AccountSnapshotContainerKt.getAccountSnapshotContainerHeightDp();
                            boolean changedInstance2 = startRestartGroup.changedInstance(accountSnapshotViewModel);
                            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotProviderImplKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotProviderImplKt.$r8$lambda$pHgI73inH3kIcWqEILmb9B4JuK8(com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotViewModel.this);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            com.paypal.oslo.feature.home.ui.SectionErrorItemKt.m14925SectionErrorItemFJfuzF0(sectionError, exhausted, (kotlin.jvm.functions.Function0) rememberedValue2, modifier3, accountSnapshotContainerHeightDp, startRestartGroup, ((i3 << 3) & 7168) | 24576, 0);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(2071947250);
                            boolean changedInstance3 = startRestartGroup.changedInstance(accountSnapshotViewModel);
                            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                            if (changedInstance3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotProviderImplKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotProviderImplKt.$r8$lambda$v_HM9faQMBjxuSRVWRgZBcXzlSQ(com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotViewModel.this, (com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem) obj);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            com.paypal.oslo.feature.home.ui.AccountSnapshotContainerKt.AccountSnapshotContainer(section, (kotlin.jvm.functions.Function1) rememberedValue3, modifier3, startRestartGroup, i3 & 896, 0);
                            startRestartGroup.endReplaceGroup();
                        }
                        startRestartGroup.endReplaceGroup();
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    set3 = set5;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier4 = modifier3;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotProviderImplKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotProviderImplKt.m14931$r8$lambda$Rieqg54PhMPoef9iDs7QuNIZP4(com.paypal.oslo.core.navigation.AppNavigator.this, factory, modifier4, set3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            set2 = set;
            if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        set2 = set;
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: $r8$lambda$Rieqg54PhMPoef9iDs7Qu-NIZP4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14931$r8$lambda$Rieqg54PhMPoef9iDs7QuNIZP4(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotViewModel.Factory factory, androidx.compose.ui.Modifier modifier, java.util.Set set, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AccountSnapshotSection(appNavigator, factory, modifier, set, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pHgI73inH3kIcWqEILmb9B4JuK8(com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotViewModel accountSnapshotViewModel) {
        accountSnapshotViewModel.processEvent(com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotEvent.Retry.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$v_HM9faQMBjxuSRVWRgZBcXzlSQ(com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotViewModel accountSnapshotViewModel, com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem accountSnapshotItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountSnapshotItem, "");
        accountSnapshotViewModel.processEvent(new com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotEvent.ItemClicked(accountSnapshotItem));
        return kotlin.Unit.INSTANCE;
    }
}
