package com.paypal.oslo.feature.identity.accountswitch.ui;

@kotlin.Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u000b\u001aA\u0010\f\u001a\u00020\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00052\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\u00102\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0001¢\u0006\u0002\u0010\u0013\u001aG\u0010\u0014\u001a\u00020\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00150\u00052\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u00102\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00172\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0001¢\u0006\u0002\u0010\u0018\u001a-\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00152\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00172\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0003¢\u0006\u0002\u0010\u001c\u001a\u0017\u0010\u001d\u001a\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0003¢\u0006\u0002\u0010\u001e\u001a\f\u0010\u001f\u001a\u00020\u0015*\u00020\u000eH\u0000\u001a\r\u0010 \u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010!¨\u0006\"²\u0006\n\u0010#\u001a\u00020$X\u008a\u0084\u0002²\u0006\f\u0010%\u001a\u0004\u0018\u00010&X\u008a\u0084\u0002"}, d2 = {"AddUserAccountScreen", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "linkProfileOptions", "", "", "postLoginSuccessDestination", "Landroidx/navigation3/runtime/NavKey;", "viewModel", "Lcom/paypal/oslo/feature/identity/accountswitch/ui/AddUserAccountViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Ljava/util/List;Landroidx/navigation3/runtime/NavKey;Lcom/paypal/oslo/feature/identity/accountswitch/ui/AddUserAccountViewModel;Landroidx/compose/runtime/Composer;II)V", "AddUserAccountScreenContent", "options", "Lcom/paypal/oslo/feature/identity/accountswitch/domain/model/AddUserAccountOption;", "onOptionClick", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AddUserAccountScreenLayout", "Lcom/paypal/oslo/feature/identity/accountswitch/ui/AddUserAccountOptionUi;", "onBackClick", "Lkotlin/Function0;", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AddUserAccountOptionItem", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.OPTION, "onClick", "(Lcom/paypal/oslo/feature/identity/accountswitch/ui/AddUserAccountOptionUi;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AddUserAccountLoadingContent", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "toUi", "AddUserAccountScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "identity_prodRelease", "uiState", "Lcom/paypal/oslo/feature/identity/accountswitch/ui/AddUserAccountUiState;", "linkProfileType", "Lcom/paypal/oslo/feature/identity/api/accountswitch/domain/model/LinkProfileOptionType;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddUserAccountScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AddUserAccountScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.util.List<java.lang.String> list, @com.paypal.oslo.feature.identity.api.di.PostLoginSuccessDestination final androidx.navigation3.runtime.NavKey navKey, com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountViewModel addUserAccountViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountViewModel addUserAccountViewModel2;
        androidx.compose.runtime.Composer composer2;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i4;
        int i5;
        java.lang.Object rememberedValue;
        boolean changedInstance;
        boolean changedInstance2;
        java.lang.Object rememberedValue2;
        com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountUiState addUserAccountUiState;
        int i6;
        com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountViewModel addUserAccountViewModel3;
        int i7;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(753267811);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(navKey) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                addUserAccountViewModel2 = addUserAccountViewModel;
                if (startRestartGroup.changedInstance(addUserAccountViewModel2)) {
                    i7 = 2048;
                    i3 |= i7;
                }
            } else {
                addUserAccountViewModel2 = addUserAccountViewModel;
            }
            i7 = 1024;
            i3 |= i7;
        } else {
            addUserAccountViewModel2 = addUserAccountViewModel;
        }
        if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
            } else if ((i2 & 8) != 0) {
                androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, startRestartGroup, 0);
                if (current instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                    empty = ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                } else {
                    empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
                }
                i4 = 1;
                com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountViewModel addUserAccountViewModel4 = (com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                i3 &= -7169;
                i5 = 0;
                addUserAccountViewModel2 = addUserAccountViewModel4;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(753267811, i3, -1, "com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreen (AddUserAccountScreen.kt:90)");
                }
                androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(addUserAccountViewModel2.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                final androidx.compose.runtime.State collectAsStateWithLifecycle2 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(addUserAccountViewModel2.getLinkProfileType(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, startRestartGroup);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) rememberedValue;
                changedInstance = startRestartGroup.changedInstance(addUserAccountViewModel2);
                changedInstance2 = startRestartGroup.changedInstance(list);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!(changedInstance | changedInstance2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenKt$AddUserAccountScreen$1$1(addUserAccountViewModel2, list, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(list, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, (i3 >> 3) & 14);
                addUserAccountUiState = (com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountUiState) collectAsStateWithLifecycle.getValue();
                if (!(addUserAccountUiState instanceof com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountUiState.Loading)) {
                    startRestartGroup.startReplaceGroup(-602128535);
                    getHighSpeedVideoFpsRangesFor(null, startRestartGroup, i5, i4);
                    startRestartGroup.endReplaceGroup();
                    addUserAccountViewModel3 = addUserAccountViewModel2;
                    composer2 = startRestartGroup;
                } else if (addUserAccountUiState instanceof com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountUiState.Success) {
                    startRestartGroup.startReplaceGroup(-601913333);
                    com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountUiState addUserAccountUiState2 = (com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountUiState) collectAsStateWithLifecycle.getValue();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(addUserAccountUiState2, "");
                    java.util.List<com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption> options = ((com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountUiState.Success) addUserAccountUiState2).getOptions();
                    boolean changedInstance3 = startRestartGroup.changedInstance(coroutineScope);
                    boolean changedInstance4 = startRestartGroup.changedInstance(addUserAccountViewModel2);
                    boolean changedInstance5 = startRestartGroup.changedInstance(navKey);
                    int i8 = (i3 & 14) != 4 ? i5 : 1;
                    boolean changed = startRestartGroup.changed(collectAsStateWithLifecycle2);
                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (((changedInstance3 ? 1 : 0) | (changedInstance4 ? 1 : 0) | (changedInstance5 ? 1 : 0) | i8 | (changed ? 1 : 0)) != 0 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        i6 = i3;
                        final com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountViewModel addUserAccountViewModel5 = addUserAccountViewModel2;
                        addUserAccountViewModel3 = addUserAccountViewModel2;
                        java.lang.Object obj = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenKt.$r8$lambda$W1l_7tdCx4xiq7oZboLBMAqk2uc(kotlinx.coroutines.CoroutineScope.this, addUserAccountViewModel5, navKey, appNavigator, collectAsStateWithLifecycle2, (com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption) obj2);
                            }
                        };
                        startRestartGroup.updateRememberedValue(obj);
                        rememberedValue3 = obj;
                    } else {
                        i6 = i3;
                        addUserAccountViewModel3 = addUserAccountViewModel2;
                    }
                    kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue3;
                    int i9 = (i6 << 6) & 896;
                    composer2 = startRestartGroup;
                    AddUserAccountScreenContent(options, function1, appNavigator, null, startRestartGroup, i9, 8);
                    composer2.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-1959084587);
                    startRestartGroup.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                addUserAccountViewModel2 = addUserAccountViewModel3;
            }
            i4 = 1;
            i5 = 0;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            androidx.compose.runtime.State collectAsStateWithLifecycle3 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(addUserAccountViewModel2.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            final androidx.compose.runtime.State collectAsStateWithLifecycle22 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(addUserAccountViewModel2.getLinkProfileType(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            final kotlinx.coroutines.CoroutineScope coroutineScope2 = (kotlinx.coroutines.CoroutineScope) rememberedValue;
            changedInstance = startRestartGroup.changedInstance(addUserAccountViewModel2);
            changedInstance2 = startRestartGroup.changedInstance(list);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!(changedInstance | changedInstance2)) {
            }
            rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenKt$AddUserAccountScreen$1$1(addUserAccountViewModel2, list, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(list, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, (i3 >> 3) & 14);
            addUserAccountUiState = (com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountUiState) collectAsStateWithLifecycle3.getValue();
            if (!(addUserAccountUiState instanceof com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountUiState.Loading)) {
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            addUserAccountViewModel2 = addUserAccountViewModel3;
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenKt.$r8$lambda$ES4J364vgYUYMEvvm8HD3ci3VGs(com.paypal.oslo.core.navigation.AppNavigator.this, list, navKey, addUserAccountViewModel2, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            });
        }
    }

    public static final void AddUserAccountScreenContent(final java.util.List<com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption> list, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption, kotlin.Unit> function1, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(981480769);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(appNavigator) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(981480769, i3, -1, "com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenContent (AddUserAccountScreen.kt:170)");
            }
            boolean changed = startRestartGroup.changed(list);
            java.util.ArrayList rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                java.util.List<com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption> list2 = list;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                java.util.Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(toUi((com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption) it.next()));
                }
                rememberedValue = arrayList;
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            java.util.List list3 = (java.util.List) rememberedValue;
            boolean z = (i3 & 112) == 32;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenKt.m15003$r8$lambda$mj13wgrrSST0OzqO_HqxsrzrFY(kotlin.jvm.functions.Function1.this, (com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountOptionUi) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue2;
            boolean z2 = (i3 & 896) == 256;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenKt.$r8$lambda$YeVYpYGx1lK_4RHanPdnFaso2Eg(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            AddUserAccountScreenLayout(list3, function12, (kotlin.jvm.functions.Function0) rememberedValue3, modifier, startRestartGroup, i3 & 7168, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenKt.$r8$lambda$ZrHfhGJzmyjuxPHTjkt9GSuKvPk(list, function1, appNavigator, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AddUserAccountScreenLayout(final java.util.List<com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountOptionUi> list, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountOptionUi, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-685866252);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-685866252, i4, -1, "com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenLayout (AddUserAccountScreen.kt:188)");
                }
                modifier3 = modifier4;
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2), "AddUserAccountScreen");
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                androidx.compose.ui.Modifier m1707paddingVpY3zN4 = androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing16());
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 48);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1707paddingVpY3zN4);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                com.paypal.pds.components.IconButtonKt.IconButton(com.paypal.pds.core.Icon.ArrowLeft.INSTANCE, function0, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 0.0f, 0.0f, 13, null), "BackButton"), com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_add_account_back_button, startRestartGroup, 0), null, false, false, startRestartGroup, ((i4 >> 3) & 112) | 27654, 448);
                startRestartGroup.endNode();
                composer2 = startRestartGroup;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_add_account_title, composer2, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing12()), "ScreenTitle"), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingLarge.INSTANCE, composer2, 384, 6, 1016);
                androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), "OptionsList");
                boolean changedInstance = composer2.changedInstance(list);
                boolean z = (i4 & 112) == 32;
                java.lang.Object rememberedValue = composer2.rememberedValue();
                if ((changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenKt.$r8$lambda$tB8j6koNhPpLF7YlvTtEuvUoCjE(list, function1, (androidx.compose.foundation.lazy.LazyListScope) obj);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue);
                }
                androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(testTag2, null, null, false, null, null, null, false, null, (kotlin.jvm.functions.Function1) rememberedValue, composer2, 6, 510);
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenKt.$r8$lambda$b3jtsEN8wX1hwc5tqgPSkQiag1Q(list, function1, function0, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void getHighSpeedVideoSizes(final com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountOptionUi addUserAccountOptionUi, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-628118425);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(addUserAccountOptionUi) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-628118425, i3, -1, "com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountOptionItem (AddUserAccountScreen.kt:247)");
                }
                final java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(addUserAccountOptionUi.getTitleRes(), startRestartGroup, 0);
                androidx.compose.ui.Modifier m1707paddingVpY3zN4 = androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing8());
                com.paypal.pds.components.CardStyle.Outlined outlined = com.paypal.pds.components.CardStyle.Outlined.INSTANCE;
                androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1652428223, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenKt.m15002$r8$lambda$ZmpH30dQqwmOAnS6sbYKD43RCI(stringResource, addUserAccountOptionUi, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54);
                int i5 = (com.paypal.pds.components.CardStyle.Outlined.$stable << 9) | 805306368 | ((i3 << 9) & 57344);
                modifier3 = modifier4;
                com.paypal.pds.components.CardKt.Card(m1707paddingVpY3zN4, null, null, outlined, function0, null, null, null, null, rememberComposableLambda, startRestartGroup, i5, 486);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenKt.$r8$lambda$QjmVV3jNdHS67ckexCNDANE9XUs(com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountOptionUi.this, function0, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void getHighSpeedVideoFpsRangesFor(final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(522587230);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if (!startRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(522587230, i3, -1, "com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountLoadingContent (AddUserAccountScreen.kt:306)");
            }
            androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 54);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, background);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.pds.components.LoaderKt.Loader(null, null, null, null, startRestartGroup, 0, 15);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenKt.m15001$r8$lambda$I5_1OoVypIE66j4FW3lzBs0zRo(androidx.compose.ui.Modifier.this, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountOptionUi toUi(com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption addUserAccountOption) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addUserAccountOption, "");
        int i = com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenKt.WhenMappings.$EnumSwitchMapping$0[addUserAccountOption.getOptionType().ordinal()];
        if (i == 1) {
            return new com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountOptionUi(addUserAccountOption.getId(), com.paypal.oslo.feature.identity.R.string.feature_identity_add_account_link_existing_title, com.paypal.oslo.feature.identity.R.string.feature_identity_add_account_link_existing_description, com.paypal.pds.core.Icon.Link.INSTANCE, addUserAccountOption);
        }
        if (i == 2) {
            return new com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountOptionUi(addUserAccountOption.getId(), com.paypal.oslo.feature.identity.R.string.feature_identity_add_account_create_new_business_title, com.paypal.oslo.feature.identity.R.string.feature_identity_add_account_create_new_description, com.paypal.pds.core.Icon.PersonPlus.INSTANCE, addUserAccountOption);
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountOptionUi(addUserAccountOption.getId(), com.paypal.oslo.feature.identity.R.string.feature_identity_add_account_create_new_personal_title, com.paypal.oslo.feature.identity.R.string.feature_identity_add_account_create_new_description, com.paypal.pds.core.Icon.PersonPlus.INSTANCE, addUserAccountOption);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0dmKgsF5oTC4ZybA6an_zTyj3Zk(com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountOptionUi addUserAccountOptionUi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addUserAccountOptionUi, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7tZio5Vjxq1DkjAeZ484h2kyInc(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ES4J364vgYUYMEvvm8HD3ci3VGs(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.util.List list, androidx.navigation3.runtime.NavKey navKey, com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountViewModel addUserAccountViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AddUserAccountScreen(appNavigator, list, navKey, addUserAccountViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$G20ZHjEGZIky1_ugXBFPco_MI1U(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        androidx.compose.ui.semantics.SemanticsPropertiesKt.m7815setRolekuIjeqM(semanticsPropertyReceiver, androidx.compose.ui.semantics.Role.INSTANCE.m7798getButtono7Vup1c());
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$I5_1OoVypIE66j4F-W3lzBs0zRo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15001$r8$lambda$I5_1OoVypIE66j4FW3lzBs0zRo(androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoFpsRangesFor(modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QjmVV3jNdHS67ckexCNDANE9XUs(com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountOptionUi addUserAccountOptionUi, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoSizes(addUserAccountOptionUi, function0, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$W1l_7tdCx4xiq7oZboLBMAqk2uc(kotlinx.coroutines.CoroutineScope coroutineScope, com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountViewModel addUserAccountViewModel, androidx.navigation3.runtime.NavKey navKey, com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.State state, com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption addUserAccountOption) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addUserAccountOption, "");
        int i = com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenKt.WhenMappings.$EnumSwitchMapping$0[addUserAccountOption.getOptionType().ordinal()];
        if (i == 1) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenKt$AddUserAccountScreen$2$1$1(addUserAccountViewModel, navKey, appNavigator, state, null), 3, null);
        } else if (i == 2) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenKt$AddUserAccountScreen$2$1$2(addUserAccountViewModel, appNavigator, null), 3, null);
        } else {
            if (i != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YeVYpYGx1lK_4RHanPdnFaso2Eg(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenKt.$r8$lambda$7tZio5Vjxq1DkjAeZ484h2kyInc((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ZmpH30dQqwm-OAnS6sbYKD43RCI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15002$r8$lambda$ZmpH30dQqwmOAnS6sbYKD43RCI(final java.lang.String str, com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountOptionUi addUserAccountOptionUi, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1652428223, i, -1, "com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountOptionItem.<anonymous> (AddUserAccountScreen.kt:257)");
            }
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16());
            boolean changed = composer.changed(str);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenKt.$r8$lambda$G20ZHjEGZIky1_ugXBFPco_MI1U(str, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.Modifier semantics$default = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(m1706padding3ABfNKs, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null);
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), composer, 48);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, semantics$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            com.paypal.pds.components.IconKt.Icon(addUserAccountOptionUi.getIcon(), null, androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize32()), null, com.paypal.pds.core.Color.ContentBrandPrimary.INSTANCE, composer, 24624, 8);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), composer, 0);
            androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, weight$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(addUserAccountOptionUi.getTitleRes(), composer, 0), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, androidx.compose.ui.text.style.TextOverflow.m8488boximpl(androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8501getEllipsisgIe3tQ8()), false, 2, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer, 12779904, 6, 858);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing4()), composer, 0);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(addUserAccountOptionUi.getDescriptionRes(), composer, 0), null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, androidx.compose.ui.text.style.TextOverflow.m8488boximpl(androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8501getEllipsisgIe3tQ8()), false, 3, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, composer, 12779904, 6, 858);
            composer.endNode();
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZrHfhGJzmyjuxPHTjkt9GSuKvPk(java.util.List list, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AddUserAccountScreenContent(list, function1, appNavigator, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$b3jtsEN8wX1hwc5tqgPSkQiag1Q(java.util.List list, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AddUserAccountScreenLayout(list, function1, function0, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$iglnDoBvI_EeVP_27Y7ZFFdo6WU(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1210142106);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1210142106, updateChangedFlags, -1, "com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenPreview (AddUserAccountScreen.kt:365)");
            }
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption[]{new com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption("link_existing", com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption.OptionType.LINK_EXISTING), new com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption("create_new", com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption.OptionType.CREATE_PERSONAL)});
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listOf, 10));
            java.util.Iterator it = listOf.iterator();
            while (it.hasNext()) {
                arrayList.add(toUi((com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption) it.next()));
            }
            java.util.ArrayList arrayList2 = arrayList;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenKt.$r8$lambda$0dmKgsF5oTC4ZybA6an_zTyj3Zk((com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountOptionUi) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            AddUserAccountScreenLayout(arrayList2, function1, (kotlin.jvm.functions.Function0) rememberedValue2, null, startRestartGroup, 432, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenKt.$r8$lambda$iglnDoBvI_EeVP_27Y7ZFFdo6WU(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$mj13wgrrS-ST0OzqO_HqxsrzrFY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15003$r8$lambda$mj13wgrrSST0OzqO_HqxsrzrFY(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountOptionUi addUserAccountOptionUi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addUserAccountOptionUi, "");
        function1.invoke(addUserAccountOptionUi.getDomainOption());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$tB8j6koNhPpLF7YlvTtEuvUoCjE(final java.util.List list, final kotlin.jvm.functions.Function1 function1, androidx.compose.foundation.lazy.LazyListScope lazyListScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListScope, "");
        final kotlin.jvm.functions.Function1 function12 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenKt.$r8$lambda$zIAO0VpKWvrFh8OTDkmJHhF6vo4((com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountOptionUi) obj);
            }
        };
        final com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenKt$AddUserAccountScreenLayout$lambda$0$1$0$$inlined$items$default$1 addUserAccountScreenKt$AddUserAccountScreenLayout$lambda$0$1$0$$inlined$items$default$1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenKt$AddUserAccountScreenLayout$lambda$0$1$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Void invoke(com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountOptionUi addUserAccountOptionUi) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                return invoke((com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountOptionUi) obj);
            }
        };
        lazyListScope.items(list.size(), new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object>() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenKt$AddUserAccountScreenLayout$lambda$0$1$0$$inlined$items$default$2
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
                return invoke(num.intValue());
            }

            public final java.lang.Object invoke(int i) {
                return kotlin.jvm.functions.Function1.this.invoke(list.get(i));
            }
        }, new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object>() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenKt$AddUserAccountScreenLayout$lambda$0$1$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
                return invoke(num.intValue());
            }

            public final java.lang.Object invoke(int i) {
                return kotlin.jvm.functions.Function1.this.invoke(list.get(i));
            }
        }, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(802480018, true, new kotlin.jvm.functions.Function4<androidx.compose.foundation.lazy.LazyItemScope, java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenKt$AddUserAccountScreenLayout$lambda$0$1$0$$inlined$items$default$4
            @Override // kotlin.jvm.functions.Function4
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, java.lang.Integer num, androidx.compose.runtime.Composer composer, java.lang.Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, int i, androidx.compose.runtime.Composer composer, int i2) {
                int i3;
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(802480018, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                final com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountOptionUi addUserAccountOptionUi = (com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountOptionUi) list.get(i);
                composer.startReplaceGroup(1923628258);
                boolean changed = composer.changed(function1);
                boolean changed2 = composer.changed(addUserAccountOptionUi);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    final kotlin.jvm.functions.Function1 function13 = function1;
                    rememberedValue = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenKt$AddUserAccountScreenLayout$1$2$1$2$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                            function13.invoke(addUserAccountOptionUi);
                            return kotlin.Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenKt.getHighSpeedVideoSizes(addUserAccountOptionUi, (kotlin.jvm.functions.Function0) rememberedValue, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "OptionItem_".concat(java.lang.String.valueOf(addUserAccountOptionUi.getId()))), composer, 0, 0);
                composer.endReplaceGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
        }));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object $r8$lambda$zIAO0VpKWvrFh8OTDkmJHhF6vo4(com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountOptionUi addUserAccountOptionUi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addUserAccountOptionUi, "");
        return addUserAccountOptionUi.getId();
    }

    public static final /* synthetic */ com.paypal.oslo.feature.identity.api.accountswitch.domain.model.LinkProfileOptionType access$AddUserAccountScreen$lambda$1(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.identity.api.accountswitch.domain.model.LinkProfileOptionType) state.getValue();
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption.OptionType.values().length];
            try {
                iArr[com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption.OptionType.LINK_EXISTING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption.OptionType.CREATE_BUSINESS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption.OptionType.CREATE_PERSONAL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
