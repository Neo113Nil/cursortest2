package com.paypal.oslo.feature.userprofile.ui.screens.address;

@kotlin.Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\u001a9\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\u001a\r\u0010\r\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000e¨\u0006\u000f²\u0006\u0016\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011X\u008a\u0084\u0002²\u0006\f\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u008a\u008e\u0002²\u0006\n\u0010\u0016\u001a\u00020\u0017X\u008a\u008e\u0002"}, d2 = {"AllAddressesScreen", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "config", "Lcom/paypal/oslo/feature/userprofile/config/UserProfileConfig;", "featureGate", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AllAddressesViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/userprofile/config/UserProfileConfig;Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AllAddressesViewModel;Landroidx/compose/runtime/Composer;II)V", "AllAddressesScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "user-profile_prodRelease", "uiState", "Lcom/paypal/oslo/feature/userprofile/ui/components/common/ProfileDataListUiState;", "Lcom/paypal/oslo/feature/userprofile/domain/ProfileDataItem;", "Lcom/paypal/oslo/core/userstore/model/ProfileAddress;", "toastMessage", "", "showToast", ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AllAddressScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AllAddressesScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.userprofile.config.UserProfileConfig userProfileConfig, final com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.userprofile.ui.viewmodel.AllAddressesViewModel allAddressesViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        com.paypal.oslo.feature.userprofile.ui.viewmodel.AllAddressesViewModel allAddressesViewModel2;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        final com.paypal.oslo.feature.userprofile.ui.viewmodel.AllAddressesViewModel allAddressesViewModel3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        androidx.compose.ui.Modifier modifier4;
        final com.paypal.oslo.feature.userprofile.ui.viewmodel.AllAddressesViewModel allAddressesViewModel4;
        boolean checkGate;
        com.paypal.oslo.feature.userprofile.ui.viewmodel.AllAddressesViewModel allAddressesViewModel5;
        androidx.compose.ui.Modifier modifier5;
        java.lang.String str;
        com.paypal.oslo.core.navigation.result.NavResultManager navResultManager;
        com.paypal.oslo.feature.userprofile.ui.screens.address.AllAddressScreenKt$AllAddressesScreen$2$1 allAddressScreenKt$AllAddressesScreen$2$1;
        int i4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userProfileConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-86151535);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(userProfileConfig) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(featureGate) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    allAddressesViewModel2 = allAddressesViewModel;
                    if (startRestartGroup.changedInstance(allAddressesViewModel2)) {
                        i4 = 16384;
                        i3 |= i4;
                    }
                } else {
                    allAddressesViewModel2 = allAddressesViewModel;
                }
                i4 = 8192;
                i3 |= i4;
            } else {
                allAddressesViewModel2 = allAddressesViewModel;
            }
            if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                } else {
                    androidx.compose.ui.Modifier.Companion companion = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if ((i2 & 16) != 0) {
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
                        com.paypal.oslo.feature.userprofile.ui.viewmodel.AllAddressesViewModel allAddressesViewModel6 = (com.paypal.oslo.feature.userprofile.ui.viewmodel.AllAddressesViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.userprofile.ui.viewmodel.AllAddressesViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                        i3 &= -57345;
                        modifier4 = companion;
                        allAddressesViewModel4 = allAddressesViewModel6;
                        int i6 = i3;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-86151535, i6, -1, "com.paypal.oslo.feature.userprofile.ui.screens.address.AllAddressesScreen (AllAddressScreen.kt:70)");
                        }
                        checkGate = featureGate.checkGate(com.paypal.oslo.feature.userprofile.remoteconfig.UserProfileFeatureGates.INSTANCE.getAddressesWebViewEnabled());
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "AllAddressesScreen: addressesWebViewEnabled = ".concat(java.lang.String.valueOf(checkGate)), null, null, 6, null);
                        java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_address_management_title, startRestartGroup, 0);
                        if (!checkGate) {
                            startRestartGroup.startReplaceGroup(1850716871);
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            boolean z = (i6 & 14) == 4;
                            boolean z2 = (i6 & 112) == 32;
                            boolean changed = startRestartGroup.changed(stringResource);
                            com.paypal.oslo.feature.userprofile.ui.screens.address.AllAddressScreenKt$AllAddressesScreen$1$1 rememberedValue = startRestartGroup.rememberedValue();
                            if ((z | z2 | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new com.paypal.oslo.feature.userprofile.ui.screens.address.AllAddressScreenKt$AllAddressesScreen$1$1(appNavigator, userProfileConfig, stringResource, null);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(1851198766);
                            startRestartGroup.endReplaceGroup();
                            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "AllAddressesScreen: Feature gate disabled - Showing native address management", null, null, 6, null);
                        }
                        if (checkGate) {
                            startRestartGroup.startReplaceGroup(1851697804);
                            androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(allAddressesViewModel4.getUiState(), null, startRestartGroup, 0, 1);
                            android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                            java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_navigate_to_address_details, startRestartGroup, 0);
                            java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_address_saved_successfully, startRestartGroup, 0);
                            java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
                            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue2;
                            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                str = stringResource2;
                                rememberedValue3 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            } else {
                                str = stringResource2;
                            }
                            final androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue3;
                            boolean changed2 = startRestartGroup.changed(stringResource3);
                            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                            if (changed2 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                navResultManager = null;
                                allAddressScreenKt$AllAddressesScreen$2$1 = new com.paypal.oslo.feature.userprofile.ui.screens.address.AllAddressScreenKt$AllAddressesScreen$2$1(stringResource3, mutableState, mutableState2, null);
                                startRestartGroup.updateRememberedValue(allAddressScreenKt$AllAddressesScreen$2$1);
                            } else {
                                allAddressScreenKt$AllAddressesScreen$2$1 = rememberedValue4;
                                navResultManager = null;
                            }
                            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) allAddressScreenKt$AllAddressesScreen$2$1;
                            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(navResultManager, startRestartGroup, 0);
                            com.paypal.oslo.feature.userprofile.ui.screens.address.AllAddressScreenKt$AllAddressesScreen$$inlined$NavResultEffectrtGRyWw$1 rememberedValue5 = startRestartGroup.rememberedValue();
                            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue5 = new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.address.AllAddressScreenKt$AllAddressesScreen$$inlined$NavResultEffect-rtGRyWw$1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager2, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                                        return m20487invokehN0UB1M(navResultManager2, navResultRequestId.m11592unboximpl());
                                    }

                                    /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                                    public final kotlinx.coroutines.flow.Flow<java.lang.Object> m20487invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager2, java.lang.String str2) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager2, "");
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                                        return navResultManager2.m11582getScopedResultFlowInternalDpEMydE(str2);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue5);
                            }
                            java.lang.String str2 = str;
                            composer2 = startRestartGroup;
                            com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue5, startRestartGroup, 3072);
                            boolean changedInstance = composer2.changedInstance(allAddressesViewModel4);
                            boolean changedInstance2 = composer2.changedInstance(context);
                            boolean changed3 = composer2.changed(str2);
                            boolean z3 = (i6 & 14) == 4;
                            boolean changed4 = composer2.changed(rememberNavResultRequestId);
                            com.paypal.oslo.feature.userprofile.ui.screens.address.AllAddressScreenKt$AllAddressesScreen$3$1 rememberedValue6 = composer2.rememberedValue();
                            if ((changedInstance | changedInstance2 | changed3 | z3 | changed4) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue6 = new com.paypal.oslo.feature.userprofile.ui.screens.address.AllAddressScreenKt$AllAddressesScreen$3$1(allAddressesViewModel4, context, str2, appNavigator, rememberNavResultRequestId, null);
                                composer2.updateRememberedValue(rememberedValue6);
                            }
                            androidx.compose.runtime.EffectsKt.LaunchedEffect(allAddressesViewModel4, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue6, composer2, (i6 >> 12) & 14);
                            androidx.compose.ui.Modifier context2 = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(modifier4, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("user_profile", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.AddressManagement.FEATURE, "view")));
                            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, context2);
                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                            if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                            com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListUiState profileDataListUiState = (com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListUiState) collectAsState.getValue();
                            java.lang.String stringResource4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_addresses_subtitle, composer2, 0);
                            java.lang.String stringResource5 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_add_new_address_button, composer2, 0);
                            java.lang.String stringResource6 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_no_addresses_found, composer2, 0);
                            boolean changedInstance3 = composer2.changedInstance(allAddressesViewModel4);
                            java.lang.Object rememberedValue7 = composer2.rememberedValue();
                            if (changedInstance3 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue7 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.address.AllAddressScreenKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return com.paypal.oslo.feature.userprofile.ui.screens.address.AllAddressScreenKt.$r8$lambda$0OpxDKuAuvA0gWNQZG_I4eVDQR4(com.paypal.oslo.feature.userprofile.ui.viewmodel.AllAddressesViewModel.this, (java.lang.String) obj);
                                    }
                                };
                                composer2.updateRememberedValue(rememberedValue7);
                            }
                            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue7;
                            boolean changedInstance4 = composer2.changedInstance(allAddressesViewModel4);
                            java.lang.Object rememberedValue8 = composer2.rememberedValue();
                            if (changedInstance4 || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue8 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.address.AllAddressScreenKt$$ExternalSyntheticLambda5
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.userprofile.ui.screens.address.AllAddressScreenKt.$r8$lambda$1swNWSgcVnHKoSSEegZGavKDDFk(com.paypal.oslo.feature.userprofile.ui.viewmodel.AllAddressesViewModel.this);
                                    }
                                };
                                composer2.updateRememberedValue(rememberedValue8);
                            }
                            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue8;
                            androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                            boolean changedInstance5 = composer2.changedInstance(allAddressesViewModel4);
                            java.lang.Object rememberedValue9 = composer2.rememberedValue();
                            if (changedInstance5 || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue9 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.address.AllAddressScreenKt$$ExternalSyntheticLambda6
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.userprofile.ui.screens.address.AllAddressScreenKt.$r8$lambda$7NNz_lt96ycptTjqS2iACNHaM_M(com.paypal.oslo.feature.userprofile.ui.viewmodel.AllAddressesViewModel.this);
                                    }
                                };
                                composer2.updateRememberedValue(rememberedValue9);
                            }
                            allAddressesViewModel5 = allAddressesViewModel4;
                            modifier5 = modifier4;
                            com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListContentKt.ProfileDataListContent(profileDataListUiState, stringResource4, stringResource5, stringResource6, "address", function1, function0, companion2, (kotlin.jvm.functions.Function0) rememberedValue9, com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.AddressManagement.UiNames.ADDRESS_LIST_ITEM, com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.AddressManagement.UiNames.ADD_ADDRESS_BUTTON, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("user_profile", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.AddressManagement.FEATURE, com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD)), null, composer2, 817913856, (com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable << 3) | 6, 4096);
                            java.lang.String str3 = (java.lang.String) mutableState.getValue();
                            if (str3 == null) {
                                composer2.startReplaceGroup(-1817358885);
                                composer2.endReplaceGroup();
                            } else {
                                composer2.startReplaceGroup(-1817358884);
                                androidx.compose.ui.Modifier component = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.component(androidx.compose.ui.platform.TestTagKt.testTag(boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getTopCenter()), "address_saved_toast"), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component(com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.AddressManagement.UiNames.ADD_ADDRESS_SUCCESS_TOAST, 0, null, null, 14, null));
                                java.lang.Object rememberedValue10 = composer2.rememberedValue();
                                if (rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue10 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.address.AllAddressScreenKt$$ExternalSyntheticLambda7
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            boolean booleanValue;
                                            booleanValue = ((java.lang.Boolean) androidx.compose.runtime.MutableState.this.getValue()).booleanValue();
                                            return java.lang.Boolean.valueOf(booleanValue);
                                        }
                                    };
                                    composer2.updateRememberedValue(rememberedValue10);
                                }
                                androidx.compose.ui.Modifier available = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.available(component, (kotlin.jvm.functions.Function0) rememberedValue10, composer2, 48);
                                java.lang.Object rememberedValue11 = composer2.rememberedValue();
                                if (rememberedValue11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue11 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.address.AllAddressScreenKt$$ExternalSyntheticLambda8
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                            return com.paypal.oslo.feature.userprofile.ui.screens.address.AllAddressScreenKt.$r8$lambda$tVMx7Wz9hRLoXaY6Ml4_NEYNmYA(androidx.compose.runtime.MutableState.this, mutableState, ((java.lang.Boolean) obj).booleanValue());
                                        }
                                    };
                                    composer2.updateRememberedValue(rememberedValue11);
                                }
                                com.paypal.pds.components.ToastKt.Toast(str3, available, null, (kotlin.jvm.functions.Function1) rememberedValue11, composer2, 3072, 4);
                                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                composer2.endReplaceGroup();
                                kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                            }
                            composer2.endNode();
                            composer2.endReplaceGroup();
                        } else {
                            composer2 = startRestartGroup;
                            allAddressesViewModel5 = allAddressesViewModel4;
                            modifier5 = modifier4;
                            composer2.startReplaceGroup(1856346161);
                            composer2.endReplaceGroup();
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        allAddressesViewModel3 = allAddressesViewModel5;
                        modifier3 = modifier5;
                    } else {
                        modifier2 = companion;
                    }
                }
                modifier4 = modifier2;
                allAddressesViewModel4 = allAddressesViewModel2;
                int i62 = i3;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                checkGate = featureGate.checkGate(com.paypal.oslo.feature.userprofile.remoteconfig.UserProfileFeatureGates.INSTANCE.getAddressesWebViewEnabled());
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "AllAddressesScreen: addressesWebViewEnabled = ".concat(java.lang.String.valueOf(checkGate)), null, null, 6, null);
                java.lang.String stringResource7 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_address_management_title, startRestartGroup, 0);
                if (!checkGate) {
                }
                if (checkGate) {
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                allAddressesViewModel3 = allAddressesViewModel5;
                modifier3 = modifier5;
            } else {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
                allAddressesViewModel3 = allAddressesViewModel2;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.address.AllAddressScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.userprofile.ui.screens.address.AllAddressScreenKt.m20485$r8$lambda$DQrAlZyMxHJ1a2UGmgy6UV2lmM(com.paypal.oslo.core.navigation.AppNavigator.this, userProfileConfig, featureGate, modifier3, allAddressesViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 24576) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0OpxDKuAuvA0gWNQZG_I4eVDQR4(com.paypal.oslo.feature.userprofile.ui.viewmodel.AllAddressesViewModel allAddressesViewModel, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        allAddressesViewModel.handleAction(new com.paypal.oslo.feature.userprofile.ui.viewmodel.AllAddressesAction.SelectAddress(str));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1swNWSgcVnHKoSSEegZGavKDDFk(com.paypal.oslo.feature.userprofile.ui.viewmodel.AllAddressesViewModel allAddressesViewModel) {
        allAddressesViewModel.handleAction(com.paypal.oslo.feature.userprofile.ui.viewmodel.AllAddressesAction.RetryLoading.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7NNz_lt96ycptTjqS2iACNHaM_M(com.paypal.oslo.feature.userprofile.ui.viewmodel.AllAddressesViewModel allAddressesViewModel) {
        allAddressesViewModel.handleAction(com.paypal.oslo.feature.userprofile.ui.viewmodel.AllAddressesAction.AddAddress.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$DQrAlZyMxHJ1a2UGmgy6UV2lm-M, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20485$r8$lambda$DQrAlZyMxHJ1a2UGmgy6UV2lmM(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.userprofile.config.UserProfileConfig userProfileConfig, com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.userprofile.ui.viewmodel.AllAddressesViewModel allAddressesViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AllAddressesScreen(appNavigator, userProfileConfig, featureGate, modifier, allAddressesViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$G3q38UFt4O60JX6w5ac3HU4ArwM(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IaJhuBtz4KvClwrSzP6UMRoxjiM(int i, androidx.compose.runtime.Composer composer, int i2) {
        androidx.compose.runtime.Composer composer2;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(315295780);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(315295780, updateChangedFlags, -1, "com.paypal.oslo.feature.userprofile.ui.screens.address.AllAddressesScreenPreview (AllAddressScreen.kt:207)");
            }
            com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListUiState.Content content = new com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListUiState.Content(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.userprofile.domain.ProfileDataItem[]{new com.paypal.oslo.feature.userprofile.domain.ProfileDataItem("1", "780 7th Ave", "New York, NY 10014", true, true, com.paypal.pds.core.Icon.MapPin.INSTANCE, 2, null, 128, null), new com.paypal.oslo.feature.userprofile.domain.ProfileDataItem(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D, "780 7th Avenue", "New York, NY 10014", false, true, com.paypal.pds.core.Icon.MapPin.INSTANCE, 2, null, 128, null)}));
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.address.AllAddressScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.userprofile.ui.screens.address.AllAddressScreenKt.$r8$lambda$G3q38UFt4O60JX6w5ac3HU4ArwM((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.address.AllAddressScreenKt$$ExternalSyntheticLambda1
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
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.address.AllAddressScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue3;
            composer2 = startRestartGroup;
            com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListContentKt.ProfileDataListContent(content, "Manage your delivery and payment addresses.", "Add a New Address", "No addresses found", "address", function1, function0, companion, function02, null, null, null, null, composer2, 115043760, 0, 7680);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.address.AllAddressScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.userprofile.ui.screens.address.AllAddressScreenKt.$r8$lambda$IaJhuBtz4KvClwrSzP6UMRoxjiM(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$tVMx7Wz9hRLoXaY6Ml4_NEYNmYA(androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.MutableState mutableState2, boolean z) {
        if (!z) {
            mutableState.setValue(java.lang.Boolean.FALSE);
            mutableState2.setValue(null);
        }
        return kotlin.Unit.INSTANCE;
    }
}
