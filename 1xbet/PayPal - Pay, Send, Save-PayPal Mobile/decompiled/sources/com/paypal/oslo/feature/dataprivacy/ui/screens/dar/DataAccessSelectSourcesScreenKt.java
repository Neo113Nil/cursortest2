package com.paypal.oslo.feature.dataprivacy.ui.screens.dar;

@kotlin.Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001ai\u0010\t\u001a\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\u00010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0013\u001a[\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u000f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u0018H\u0003¢\u0006\u0002\u0010\u001c\u001a\r\u0010\u001d\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001e¨\u0006\u001f²\u0006\u0010\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u008a\u0084\u0002²\u0006\u0010\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u008a\u0084\u0002²\u0006\f\u0010 \u001a\u0004\u0018\u00010\fX\u008a\u008e\u0002"}, d2 = {"DataAccessSelectSourcesScreen", "", "appNavigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DataAccessSelectSourcesViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DataAccessSelectSourcesViewModel;Landroidx/compose/runtime/Composer;II)V", "DataAccessSelectSourcesScreenContent", "availableSources", "", "", "selectedSources", "onSourcesChange", "Lkotlin/Function1;", "onBack", "Lkotlin/Function0;", "onContinue", "(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "DataSourceCheckboxItem", "title", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "checked", "", "onCheckedChange", "onHelpClick", "enabled", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "DataAccessSelectSourcesScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "data-privacy_prodRelease", "selectedSourceForInfo"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DataAccessSelectSourcesScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DataAccessSelectSourcesScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel dataAccessSelectSourcesViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel dataAccessSelectSourcesViewModel2;
        androidx.compose.ui.Modifier modifier3;
        final com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel dataAccessSelectSourcesViewModel3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i4;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        boolean changedInstance;
        boolean z;
        com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessSelectSourcesScreenKt$DataAccessSelectSourcesScreen$1$1 rememberedValue;
        boolean changedInstance2;
        java.lang.Object rememberedValue2;
        boolean changedInstance3;
        java.lang.Object rememberedValue3;
        boolean changedInstance4;
        java.lang.Object rememberedValue4;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1882713384);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    dataAccessSelectSourcesViewModel2 = dataAccessSelectSourcesViewModel;
                    if (startRestartGroup.changedInstance(dataAccessSelectSourcesViewModel2)) {
                        i5 = 256;
                        i3 |= i5;
                    }
                } else {
                    dataAccessSelectSourcesViewModel2 = dataAccessSelectSourcesViewModel;
                }
                i5 = 128;
                i3 |= i5;
            } else {
                dataAccessSelectSourcesViewModel2 = dataAccessSelectSourcesViewModel;
            }
            if (!startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    i4 = i3;
                    modifier3 = modifier2;
                } else {
                    modifier3 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) != 0) {
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
                        com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel dataAccessSelectSourcesViewModel4 = (com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                        i4 = i3 & (-897);
                        dataAccessSelectSourcesViewModel3 = dataAccessSelectSourcesViewModel4;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(1882713384, i4, -1, "com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessSelectSourcesScreen (DataAccessSelectSourcesScreen.kt:83)");
                        }
                        androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(dataAccessSelectSourcesViewModel3.getAvailableSources(), null, startRestartGroup, 0, 1);
                        androidx.compose.runtime.State collectAsState2 = androidx.compose.runtime.SnapshotStateKt.collectAsState(dataAccessSelectSourcesViewModel3.getSelectedSources(), null, startRestartGroup, 0, 1);
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        changedInstance = startRestartGroup.changedInstance(dataAccessSelectSourcesViewModel3);
                        z = (i4 & 14) == 4;
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!(changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessSelectSourcesScreenKt$DataAccessSelectSourcesScreen$1$1(dataAccessSelectSourcesViewModel3, appNavigator, null);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                        java.util.List list = (java.util.List) collectAsState.getValue();
                        java.util.List list2 = (java.util.List) collectAsState2.getValue();
                        changedInstance2 = startRestartGroup.changedInstance(dataAccessSelectSourcesViewModel3);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessSelectSourcesScreenKt$$ExternalSyntheticLambda10
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessSelectSourcesScreenKt.$r8$lambda$3bNKuJqFYeB9WzwPrIA327EEq64(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel.this, (java.util.List) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
                        changedInstance3 = startRestartGroup.changedInstance(dataAccessSelectSourcesViewModel3);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!changedInstance3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessSelectSourcesScreenKt$$ExternalSyntheticLambda11
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessSelectSourcesScreenKt.m14107$r8$lambda$3dEfGCwGTpG0WvWo8zhDSNvxk(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue3;
                        changedInstance4 = startRestartGroup.changedInstance(dataAccessSelectSourcesViewModel3);
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        if (!changedInstance4 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessSelectSourcesScreenKt$$ExternalSyntheticLambda12
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessSelectSourcesScreenKt.m14111$r8$lambda$iXKD5pKzx7rd3rYDpSRh7DeYCI(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        DataAccessSelectSourcesScreenContent(list, list2, function1, function0, (kotlin.jvm.functions.Function0) rememberedValue4, modifier3, startRestartGroup, (i4 << 12) & 458752, 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                    } else {
                        i4 = i3;
                    }
                }
                dataAccessSelectSourcesViewModel3 = dataAccessSelectSourcesViewModel2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                androidx.compose.runtime.State collectAsState3 = androidx.compose.runtime.SnapshotStateKt.collectAsState(dataAccessSelectSourcesViewModel3.getAvailableSources(), null, startRestartGroup, 0, 1);
                androidx.compose.runtime.State collectAsState22 = androidx.compose.runtime.SnapshotStateKt.collectAsState(dataAccessSelectSourcesViewModel3.getSelectedSources(), null, startRestartGroup, 0, 1);
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                changedInstance = startRestartGroup.changedInstance(dataAccessSelectSourcesViewModel3);
                if ((i4 & 14) == 4) {
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (!(changedInstance | z)) {
                }
                rememberedValue = new com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessSelectSourcesScreenKt$DataAccessSelectSourcesScreen$1$1(dataAccessSelectSourcesViewModel3, appNavigator, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                java.util.List list3 = (java.util.List) collectAsState3.getValue();
                java.util.List list22 = (java.util.List) collectAsState22.getValue();
                changedInstance2 = startRestartGroup.changedInstance(dataAccessSelectSourcesViewModel3);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changedInstance2) {
                }
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessSelectSourcesScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessSelectSourcesScreenKt.$r8$lambda$3bNKuJqFYeB9WzwPrIA327EEq64(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel.this, (java.util.List) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
                kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue2;
                changedInstance3 = startRestartGroup.changedInstance(dataAccessSelectSourcesViewModel3);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changedInstance3) {
                }
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessSelectSourcesScreenKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessSelectSourcesScreenKt.m14107$r8$lambda$3dEfGCwGTpG0WvWo8zhDSNvxk(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
                kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue3;
                changedInstance4 = startRestartGroup.changedInstance(dataAccessSelectSourcesViewModel3);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!changedInstance4) {
                }
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessSelectSourcesScreenKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessSelectSourcesScreenKt.m14111$r8$lambda$iXKD5pKzx7rd3rYDpSRh7DeYCI(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
                DataAccessSelectSourcesScreenContent(list3, list22, function12, function02, (kotlin.jvm.functions.Function0) rememberedValue4, modifier3, startRestartGroup, (i4 << 12) & 458752, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                dataAccessSelectSourcesViewModel3 = dataAccessSelectSourcesViewModel2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessSelectSourcesScreenKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessSelectSourcesScreenKt.m14114$r8$lambda$s46BO_oUYTxleZhJn_gDrOgATw(com.paypal.oslo.core.navigation.AppNavigator.this, modifier4, dataAccessSelectSourcesViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DataAccessSelectSourcesScreenContent(final java.util.List<java.lang.String> list, final java.util.List<java.lang.String> list2, final kotlin.jvm.functions.Function1<? super java.util.List<java.lang.String>, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        final androidx.compose.runtime.MutableState mutableState;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-791005052);
        int i4 = (i & 6) == 0 ? (startRestartGroup.changedInstance(list) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(list2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= startRestartGroup.changedInstance(function02) ? 16384 : 8192;
        }
        int i5 = i2 & 32;
        if (i5 != 0) {
            i4 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((196608 & i) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 131072 : 65536;
            i3 = i4;
            if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-791005052, i3, -1, "com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessSelectSourcesScreenContent (DataAccessSelectSourcesScreen.kt:126)");
                }
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.pds.components.BottomSheetController();
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue2;
                androidx.compose.ui.Modifier modifier5 = modifier4;
                boolean z = true;
                int i6 = i3;
                androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.WindowInsetsPaddingKt.windowInsetsPadding(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), androidx.compose.foundation.layout.WindowInsetsKt.m1752onlybOOhFvg(androidx.compose.foundation.layout.WindowInsets_androidKt.getSafeDrawing(androidx.compose.foundation.layout.WindowInsets.INSTANCE, startRestartGroup, 6), androidx.compose.foundation.layout.WindowInsetsSides.INSTANCE.m1777getTopJoeWqyM())), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
                com.paypal.oslo.core.commonui.components.TopBarKt.TopBar(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_security_privacy_title, startRestartGroup, 0), null, null, com.paypal.oslo.core.commonui.components.TopBarTitleAlignment.Center, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1415867914, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessSelectSourcesScreenKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessSelectSourcesScreenKt.m14108$r8$lambda$9Q84nsn_yiDNSpbaDjHVPmJhYw(kotlin.jvm.functions.Function0.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), null, startRestartGroup, 199680, 86);
                androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1708paddingVpY3zN4$default);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_download_your_data_title, startRestartGroup, 0), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing24(), 7, null), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingLarge.INSTANCE, startRestartGroup, 384, 6, 1016);
                androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy3 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor3);
                } else {
                    startRestartGroup.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, columnMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance3 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                startRestartGroup.startReplaceGroup(1895934100);
                int i7 = 0;
                for (java.lang.Object obj : list) {
                    if (i7 < 0) {
                        kotlin.collections.CollectionsKt.throwIndexOverflow();
                    }
                    final java.lang.String str = (java.lang.String) obj;
                    java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessScreenHelpers.INSTANCE.getAvailableSourceDescriptionRes(str), startRestartGroup, 0);
                    final boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual(str, "PayPal");
                    boolean contains = areEqual ? z : list2.contains(str);
                    boolean changed = startRestartGroup.changed(areEqual);
                    boolean changedInstance = startRestartGroup.changedInstance(list2);
                    boolean changed2 = startRestartGroup.changed(str);
                    int i8 = i6;
                    boolean z2 = (i8 & 896) == 256;
                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if ((changed | changedInstance | changed2 | z2) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessSelectSourcesScreenKt$$ExternalSyntheticLambda16
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessSelectSourcesScreenKt.$r8$lambda$fh61ymEi6P1Ka6tnVoPOl8TpMOo(areEqual, list2, str, function1, ((java.lang.Boolean) obj2).booleanValue());
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue3;
                    boolean changed3 = startRestartGroup.changed(str);
                    boolean changedInstance2 = startRestartGroup.changedInstance(bottomSheetController);
                    java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if ((changed3 || changedInstance2) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        mutableState = mutableState2;
                        rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessSelectSourcesScreenKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessSelectSourcesScreenKt.$r8$lambda$KRG_LBs8Odmtechk2_Epb2DBQSk(str, bottomSheetController, mutableState);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    } else {
                        mutableState = mutableState2;
                    }
                    getHighSpeedVideoFpsRanges(str, stringResource, contains, function12, (kotlin.jvm.functions.Function0) rememberedValue4, null, !areEqual, startRestartGroup, 0, 32);
                    if (i7 < list.size() - 1) {
                        startRestartGroup.startReplaceGroup(1349957622);
                        com.paypal.pds.components.DividerKt.Divider(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 1, null), startRestartGroup, 0, 0);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(1350111382);
                        startRestartGroup.endReplaceGroup();
                    }
                    i7++;
                    mutableState2 = mutableState;
                    i6 = i8;
                    z = true;
                }
                final androidx.compose.runtime.MutableState mutableState3 = mutableState2;
                int i9 = i6;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.endNode();
                startRestartGroup.endNode();
                androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16());
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy4 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode4 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier4 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1706padding3ABfNKs);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor4 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor4);
                } else {
                    startRestartGroup.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl4 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, columnMeasurePolicy4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, currentCompositionLocalMap4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl4, java.lang.Integer.valueOf(hashCode4), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, materializeModifier4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance4 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_linked_accounts_contact_info, startRestartGroup, 0), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 7, null), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, startRestartGroup, 384, 6, 1016);
                com.paypal.pds.components.ButtonKt.Button(function02, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_continue_button, startRestartGroup, 0), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, false, false, startRestartGroup, ((i9 >> 12) & 14) | 1769856, 408);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), startRestartGroup, 0);
                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 54);
                int hashCode5 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier5 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor5 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor5);
                } else {
                    startRestartGroup.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl5 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, currentCompositionLocalMap5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl5, java.lang.Integer.valueOf(hashCode5), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, materializeModifier5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.LockLocked.INSTANCE, null, null, null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, startRestartGroup, 24630, 12);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_linked_accounts_encryption_notice, startRestartGroup, 0), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, 0.0f, 0.0f, 14, null), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, startRestartGroup, 384, 6, 1016);
                startRestartGroup.endNode();
                startRestartGroup.endNode();
                startRestartGroup.endNode();
                composer2 = startRestartGroup;
                com.paypal.pds.components.ModalKt.Modal(bottomSheetController, null, new com.paypal.pds.components.TopNavConfig(null, false, null, 7, null), null, null, null, null, false, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1704936925, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessSelectSourcesScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessSelectSourcesScreenKt.$r8$lambda$V6omfxZCKz6_p0dhZRIapjSAbwk(androidx.compose.runtime.MutableState.this, bottomSheetController, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                }, startRestartGroup, 54), composer2, com.paypal.pds.components.BottomSheetController.$stable | 805306368 | (com.paypal.pds.components.TopNavConfig.$stable << 6), androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_PERCENT_X);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessSelectSourcesScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessSelectSourcesScreenKt.$r8$lambda$lfDxBhb2kxVPumz5Gr0rDUUX9Po(list, list2, function1, function0, function02, modifier3, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i3 = i4;
        if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighSpeedVideoFpsRanges(final java.lang.String str, final java.lang.String str2, final boolean z, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, boolean z2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        boolean z3;
        boolean z4;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1204524428);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        int i5 = i2 & 32;
        if (i5 != 0) {
            i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((196608 & i) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 131072 : 65536;
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
            } else if ((1572864 & i) == 0) {
                z3 = z2;
                i3 |= startRestartGroup.changed(z3) ? 1048576 : 524288;
                if (!startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    z4 = z3;
                } else {
                    androidx.compose.ui.Modifier modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    z4 = i4 != 0 ? true : z3;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1204524428, i3, -1, "com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataSourceCheckboxItem (DataAccessSelectSourcesScreen.kt:328)");
                    }
                    androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                    androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), startRestartGroup, 54);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                    int i6 = i3 >> 6;
                    int i7 = i3 >> 9;
                    androidx.compose.ui.Modifier modifier4 = modifier3;
                    com.paypal.pds.components.CheckboxKt.Checkbox(z, function1, null, z4, null, null, null, startRestartGroup, (i6 & 14) | 24576 | (i6 & 112) | (i7 & 7168), 100);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), startRestartGroup, 0);
                    androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing8()), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, weight$default);
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, (i3 & 14) | 384, 6, 1018);
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str2, null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, ((i3 >> 3) & 14) | 384, 6, 1018);
                    startRestartGroup.endNode();
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), startRestartGroup, 0);
                    com.paypal.pds.components.IconButtonKt.IconButton(com.paypal.pds.core.Icon.QuestionCircle.INSTANCE, function0, null, com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE, com.paypal.pds.components.ButtonSize.Small.INSTANCE, "Help for ".concat(java.lang.String.valueOf(str)), null, false, false, startRestartGroup, (i7 & 112) | 27654, 452);
                    startRestartGroup.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier4;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier5 = modifier2;
                    final boolean z5 = z4;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessSelectSourcesScreenKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessSelectSourcesScreenKt.m14106$r8$lambda$1xB5xd1xRMzBWD2mJvp8yUG5Y(str, str2, z, function1, function0, modifier5, z5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            z3 = z2;
            if (!startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        z3 = z2;
        if (!startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: $r8$lambda$1xB5xd1xR-MzBWD2m-Jvp8yUG5Y, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14106$r8$lambda$1xB5xd1xRMzBWD2mJvp8yUG5Y(java.lang.String str, java.lang.String str2, boolean z, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, boolean z2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoFpsRanges(str, str2, z, function1, function0, modifier, z2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3bNKuJqFYeB9WzwPrIA327EEq64(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel dataAccessSelectSourcesViewModel, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        dataAccessSelectSourcesViewModel.updateSelectedSources(list);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$3dEfGCwGTpG0WvW-o8zhDSNv-xk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14107$r8$lambda$3dEfGCwGTpG0WvWo8zhDSNvxk(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel dataAccessSelectSourcesViewModel) {
        dataAccessSelectSourcesViewModel.onBackClick();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$9Q84nsn_yi-DNSpbaDjHVPmJhYw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14108$r8$lambda$9Q84nsn_yiDNSpbaDjHVPmJhYw(kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1415867914, i, -1, "com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessSelectSourcesScreenContent.<anonymous>.<anonymous> (DataAccessSelectSourcesScreen.kt:141)");
            }
            com.paypal.oslo.core.commonui.components.TopBarKt.TopBarBackButton(function0, null, composer, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KRG_LBs8Odmtechk2_Epb2DBQSk(java.lang.String str, com.paypal.pds.components.BottomSheetController bottomSheetController, androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(str);
        bottomSheetController.showSheet();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Mn1XvRzjDvstRco3TCgGImSb5pg(androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList, com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessScreenHelpers.DataSection dataSection, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataSection, "");
        snapshotStateList.set(i, java.lang.Boolean.valueOf(!((java.lang.Boolean) snapshotStateList.get(i)).booleanValue()));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Ua-PoVKZMXNJJ15Ldq3CMqo0GHQ, reason: not valid java name */
    public static /* synthetic */ boolean m14109$r8$lambda$UaPoVKZMXNJJ15Ldq3CMqo0GHQ(androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList, java.util.List list, com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessScreenHelpers.DataSection dataSection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataSection, "");
        java.lang.Boolean bool = (java.lang.Boolean) kotlin.collections.CollectionsKt.getOrNull(snapshotStateList, list.indexOf(dataSection));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$V6omfxZCKz6_p0dhZRIapjSAbwk(androidx.compose.runtime.MutableState mutableState, final com.paypal.pds.components.BottomSheetController bottomSheetController, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1704936925, i, -1, "com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessSelectSourcesScreenContent.<anonymous> (DataAccessSelectSourcesScreen.kt:249)");
            }
            java.lang.String str = (java.lang.String) mutableState.getValue();
            if (str == null) {
                composer.startReplaceGroup(-507183774);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-507183773);
                androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16());
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, m1706padding3ABfNKs);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessScreenHelpers.INSTANCE.getModalTitleRes(str), composer, 0), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingMedium.INSTANCE, composer, 384, 6, 1018);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), composer, 0);
                final java.util.List<com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessScreenHelpers.DataSection> sectionsForSource = com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessScreenHelpers.INSTANCE.getSectionsForSource(str);
                boolean changed = composer.changed(str);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    int size = sectionsForSource.size();
                    java.lang.Boolean[] boolArr = new java.lang.Boolean[size];
                    for (int i2 = 0; i2 < size; i2++) {
                        boolArr[i2] = java.lang.Boolean.FALSE;
                    }
                    rememberedValue = androidx.compose.runtime.SnapshotStateKt.mutableStateListOf(boolArr);
                    composer.updateRememberedValue(rememberedValue);
                }
                final androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList = (androidx.compose.runtime.snapshots.SnapshotStateList) rememberedValue;
                androidx.compose.ui.Modifier verticalScroll$default = androidx.compose.foundation.ScrollKt.verticalScroll$default(columnScopeInstance.weight(androidx.compose.ui.Modifier.INSTANCE, 1.0f, false), androidx.compose.foundation.ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, verticalScroll$default);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                boolean changed2 = composer.changed(snapshotStateList);
                boolean changedInstance = composer.changedInstance(sectionsForSource);
                java.lang.Object rememberedValue2 = composer.rememberedValue();
                if ((changed2 | changedInstance) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessSelectSourcesScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return java.lang.Boolean.valueOf(com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessSelectSourcesScreenKt.m14109$r8$lambda$UaPoVKZMXNJJ15Ldq3CMqo0GHQ(androidx.compose.runtime.snapshots.SnapshotStateList.this, sectionsForSource, (com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessScreenHelpers.DataSection) obj));
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
                boolean changed3 = composer.changed(snapshotStateList);
                java.lang.Object rememberedValue3 = composer.rememberedValue();
                if (changed3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessSelectSourcesScreenKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessSelectSourcesScreenKt.$r8$lambda$Mn1XvRzjDvstRco3TCgGImSb5pg(androidx.compose.runtime.snapshots.SnapshotStateList.this, (com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessScreenHelpers.DataSection) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    };
                    composer.updateRememberedValue(rememberedValue3);
                }
                com.paypal.pds.components.AccordionKt.Accordion(sectionsForSource, function1, null, (kotlin.jvm.functions.Function2) rememberedValue3, true, com.paypal.oslo.feature.dataprivacy.ui.screens.dar.ComposableSingletons$DataAccessSelectSourcesScreenKt.INSTANCE.m14098getLambda$1020417007$data_privacy_prodRelease(), com.paypal.oslo.feature.dataprivacy.ui.screens.dar.ComposableSingletons$DataAccessSelectSourcesScreenKt.INSTANCE.m14099getLambda$158631749$data_privacy_prodRelease(), null, composer, 1794048, 132);
                composer.endNode();
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), composer, 0);
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_got_it_button, composer, 0);
                com.paypal.pds.components.ButtonStyle.Primary primary = com.paypal.pds.components.ButtonStyle.Primary.INSTANCE;
                com.paypal.pds.components.ButtonSize.Large large = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                boolean changedInstance2 = composer.changedInstance(bottomSheetController);
                java.lang.Object rememberedValue4 = composer.rememberedValue();
                if (changedInstance2 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessSelectSourcesScreenKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessSelectSourcesScreenKt.m14113$r8$lambda$ks2dfR7sF02HB3ANcbhKhzeM_Q(com.paypal.pds.components.BottomSheetController.this);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue4);
                }
                com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue4, stringResource, fillMaxWidth$default, null, null, primary, large, false, false, composer, 1769856, 408);
                composer.endNode();
                composer.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YqjL3RwFAYUzR9C2ACFbiHbHao0(java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fh61ymEi6P1Ka6tnVoPOl8TpMOo(boolean z, java.util.List list, java.lang.String str, kotlin.jvm.functions.Function1 function1, boolean z2) {
        java.util.List minus;
        if (!z) {
            if (z2) {
                minus = kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends java.lang.String>) list, str);
            } else {
                minus = kotlin.collections.CollectionsKt.minus(list, str);
            }
            function1.invoke(minus);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$fsttwDjju-QYKMXwYZMPIPxx3Jo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14110$r8$lambda$fsttwDjjuQYKMXwYZMPIPxx3Jo(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1292883235);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1292883235, updateChangedFlags, -1, "com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessSelectSourcesScreenPreview (DataAccessSelectSourcesScreen.kt:378)");
            }
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"PayPal", "Honey", "Xoom", "Zettle"});
            java.util.List listOf2 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"PayPal", "Honey"});
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessSelectSourcesScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessSelectSourcesScreenKt.$r8$lambda$YqjL3RwFAYUzR9C2ACFbiHbHao0((java.util.List) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessSelectSourcesScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessSelectSourcesScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            DataAccessSelectSourcesScreenContent(listOf, listOf2, function1, function0, (kotlin.jvm.functions.Function0) rememberedValue3, null, startRestartGroup, 28086, 32);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessSelectSourcesScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessSelectSourcesScreenKt.m14110$r8$lambda$fsttwDjjuQYKMXwYZMPIPxx3Jo(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$iXKD5pKzx7r-d3rYDpSRh7DeYCI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14111$r8$lambda$iXKD5pKzx7rd3rYDpSRh7DeYCI(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel dataAccessSelectSourcesViewModel) {
        dataAccessSelectSourcesViewModel.onContinueClick();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ks2dfR7sF02HB3ANcbhKh-zeM_Q, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14113$r8$lambda$ks2dfR7sF02HB3ANcbhKhzeM_Q(com.paypal.pds.components.BottomSheetController bottomSheetController) {
        bottomSheetController.hideSheet();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$lfDxBhb2kxVPumz5Gr0rDUUX9Po(java.util.List list, java.util.List list2, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        DataAccessSelectSourcesScreenContent(list, list2, function1, function0, function02, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$s46BO_oUYTxleZhJn_gDrOgAT-w, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14114$r8$lambda$s46BO_oUYTxleZhJn_gDrOgATw(com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel dataAccessSelectSourcesViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        DataAccessSelectSourcesScreen(appNavigator, modifier, dataAccessSelectSourcesViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
