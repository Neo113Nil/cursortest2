package com.paypal.oslo.feature.userprofile.ui.screens.phone;

@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001a9\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\u001a\r\u0010\r\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000e¨\u0006\u000f²\u0006\u0016\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011X\u008a\u0084\u0002"}, d2 = {"AllPhonesScreen", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "config", "Lcom/paypal/oslo/feature/userprofile/config/UserProfileConfig;", "featureGate", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AllPhonesViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/userprofile/config/UserProfileConfig;Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AllPhonesViewModel;Landroidx/compose/runtime/Composer;II)V", "AllPhonesScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "user-profile_prodRelease", "uiState", "Lcom/paypal/oslo/feature/userprofile/ui/components/common/ProfileDataListUiState;", "Lcom/paypal/oslo/feature/userprofile/domain/ProfileDataItem;", "Lcom/paypal/oslo/core/userstore/model/ProfilePhone;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AllPhonesScreenKt {
    /* JADX WARN: Code restructure failed: missing block: B:100:0x035a, code lost:
    
        if (r11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x037d, code lost:
    
        if (r11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x033d, code lost:
    
        if (r11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L137;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AllPhonesScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.userprofile.config.UserProfileConfig userProfileConfig, final com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesViewModel allPhonesViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesViewModel allPhonesViewModel2;
        final com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesViewModel allPhonesViewModel3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i4;
        int i5;
        final com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesViewModel allPhonesViewModel4;
        androidx.compose.ui.Modifier modifier3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesViewModel allPhonesViewModel5;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        int i6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userProfileConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1075455938);
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
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    allPhonesViewModel2 = allPhonesViewModel;
                    if (startRestartGroup.changedInstance(allPhonesViewModel2)) {
                        i6 = 16384;
                        i3 |= i6;
                    }
                } else {
                    allPhonesViewModel2 = allPhonesViewModel;
                }
                i6 = 8192;
                i3 |= i6;
            } else {
                allPhonesViewModel2 = allPhonesViewModel;
            }
            if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    i5 = i3;
                    modifier3 = modifier2;
                    allPhonesViewModel4 = allPhonesViewModel2;
                    i4 = 0;
                } else {
                    androidx.compose.ui.Modifier modifier4 = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
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
                        i4 = 0;
                        i5 = i3 & (-57345);
                        allPhonesViewModel4 = (com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                    } else {
                        i4 = 0;
                        i5 = i3;
                        allPhonesViewModel4 = allPhonesViewModel2;
                    }
                    modifier3 = modifier4;
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1075455938, i5, -1, "com.paypal.oslo.feature.userprofile.ui.screens.phone.AllPhonesScreen (AllPhonesScreen.kt:64)");
                }
                boolean checkGate = featureGate.checkGate(com.paypal.oslo.feature.userprofile.remoteconfig.UserProfileFeatureGates.INSTANCE.getPhonesWebViewEnabled());
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "AllPhonesScreen: phonesWebViewEnabled = ".concat(java.lang.String.valueOf(checkGate)), null, null, 6, null);
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_phone_management_title, startRestartGroup, i4);
                if (checkGate) {
                    startRestartGroup.startReplaceGroup(-1547543297);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    int i8 = (i5 & 14) == 4 ? 1 : i4;
                    int i9 = (i5 & 112) == 32 ? 1 : i4;
                    boolean changed = startRestartGroup.changed(stringResource);
                    com.paypal.oslo.feature.userprofile.ui.screens.phone.AllPhonesScreenKt$AllPhonesScreen$1$1 rememberedValue = startRestartGroup.rememberedValue();
                    if ((i8 | i9 | (changed ? 1 : 0)) != 0 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new com.paypal.oslo.feature.userprofile.ui.screens.phone.AllPhonesScreenKt$AllPhonesScreen$1$1(appNavigator, userProfileConfig, stringResource, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-1547070206);
                    startRestartGroup.endReplaceGroup();
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "AllPhonesScreen: Feature gate disabled - Showing native phone management", null, null, 6, null);
                }
                if (!checkGate) {
                    startRestartGroup.startReplaceGroup(-1546632362);
                    androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(allPhonesViewModel4.getUiState(), null, startRestartGroup, 0, 1);
                    java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
                    final java.lang.String rememberNavResultRequestId2 = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
                    android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                    com.paypal.oslo.feature.userprofile.ui.components.common.CommonToastHostState rememberCommonToastHostState = com.paypal.oslo.feature.userprofile.ui.components.common.CommonToastHostKt.rememberCommonToastHostState(startRestartGroup, 0);
                    boolean changed2 = startRestartGroup.changed(rememberCommonToastHostState);
                    boolean changedInstance = startRestartGroup.changedInstance(context);
                    com.paypal.oslo.feature.userprofile.ui.screens.phone.AllPhonesScreenKt$AllPhonesScreen$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
                    if ((changed2 | changedInstance) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new com.paypal.oslo.feature.userprofile.ui.screens.phone.AllPhonesScreenKt$AllPhonesScreen$2$1(rememberCommonToastHostState, context, null);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue2;
                    com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
                    com.paypal.oslo.feature.userprofile.ui.screens.phone.AllPhonesScreenKt$AllPhonesScreen$$inlined$NavResultEffectrtGRyWw$1 rememberedValue3 = startRestartGroup.rememberedValue();
                    if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.AllPhonesScreenKt$AllPhonesScreen$$inlined$NavResultEffect-rtGRyWw$1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                                return m20546invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                            }

                            /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                            public final kotlinx.coroutines.flow.Flow<java.lang.Object> m20546invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                                return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue3, startRestartGroup, 3072);
                    boolean changed3 = startRestartGroup.changed(rememberCommonToastHostState);
                    boolean changedInstance2 = startRestartGroup.changedInstance(context);
                    com.paypal.oslo.feature.userprofile.ui.screens.phone.AllPhonesScreenKt$AllPhonesScreen$3$1 rememberedValue4 = startRestartGroup.rememberedValue();
                    if ((changed3 | changedInstance2) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new com.paypal.oslo.feature.userprofile.ui.screens.phone.AllPhonesScreenKt$AllPhonesScreen$3$1(rememberCommonToastHostState, context, null);
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) rememberedValue4;
                    com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager2 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
                    com.paypal.oslo.feature.userprofile.ui.screens.phone.AllPhonesScreenKt$AllPhonesScreen$$inlined$NavResultEffectrtGRyWw$2 rememberedValue5 = startRestartGroup.rememberedValue();
                    if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.AllPhonesScreenKt$AllPhonesScreen$$inlined$NavResultEffect-rtGRyWw$2
                            @Override // kotlin.jvm.functions.Function2
                            public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                                return m20547invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                            }

                            /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                            public final kotlinx.coroutines.flow.Flow<java.lang.Object> m20547invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                                return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId2, resolveNavResultManager2, function22, (kotlin.jvm.functions.Function2) rememberedValue5, startRestartGroup, 3072);
                    boolean changedInstance3 = startRestartGroup.changedInstance(allPhonesViewModel4);
                    int i10 = i5 & 14;
                    boolean z = i10 == 4;
                    boolean changed4 = startRestartGroup.changed(rememberNavResultRequestId);
                    com.paypal.oslo.feature.userprofile.ui.screens.phone.AllPhonesScreenKt$AllPhonesScreen$4$1 rememberedValue6 = startRestartGroup.rememberedValue();
                    if ((changedInstance3 | z | changed4) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue6 = new com.paypal.oslo.feature.userprofile.ui.screens.phone.AllPhonesScreenKt$AllPhonesScreen$4$1(allPhonesViewModel4, appNavigator, rememberNavResultRequestId, null);
                        startRestartGroup.updateRememberedValue(rememberedValue6);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(allPhonesViewModel4, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue6, startRestartGroup, (i5 >> 12) & 14);
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, modifier3);
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListUiState profileDataListUiState = (com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListUiState) collectAsState.getValue();
                    java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_phone_numbers_subtitle, startRestartGroup, 0);
                    java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_add_phone_number_button, startRestartGroup, 0);
                    java.lang.String stringResource4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_no_phone_numbers_found, startRestartGroup, 0);
                    boolean z2 = i10 == 4;
                    boolean changed5 = startRestartGroup.changed(rememberNavResultRequestId2);
                    java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                    if (!(changed5 | z2)) {
                        obj = rememberedValue7;
                    }
                    kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.AllPhonesScreenKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj4) {
                            return com.paypal.oslo.feature.userprofile.ui.screens.phone.AllPhonesScreenKt.$r8$lambda$cyz7Cv2Yp51_JNbz13iL0TTCgSg(com.paypal.oslo.core.navigation.AppNavigator.this, rememberNavResultRequestId2, (java.lang.String) obj4);
                        }
                    };
                    startRestartGroup.updateRememberedValue(function1);
                    obj = function1;
                    kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) obj;
                    boolean changedInstance4 = startRestartGroup.changedInstance(allPhonesViewModel4);
                    java.lang.Object rememberedValue8 = startRestartGroup.rememberedValue();
                    if (!changedInstance4) {
                        obj2 = rememberedValue8;
                    }
                    kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.AllPhonesScreenKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.userprofile.ui.screens.phone.AllPhonesScreenKt.$r8$lambda$9uaeVWg0J_sJiq4C3y2DtcEn_YA(com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesViewModel.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(function0);
                    obj2 = function0;
                    kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) obj2;
                    androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                    boolean changedInstance5 = startRestartGroup.changedInstance(allPhonesViewModel4);
                    java.lang.Object rememberedValue9 = startRestartGroup.rememberedValue();
                    if (!changedInstance5) {
                        obj3 = rememberedValue9;
                    }
                    kotlin.jvm.functions.Function0 function03 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.AllPhonesScreenKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.userprofile.ui.screens.phone.AllPhonesScreenKt.$r8$lambda$UIMcQ8xz0aCpE4aJIdx_oflzYLQ(com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesViewModel.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(function03);
                    obj3 = function03;
                    allPhonesViewModel5 = allPhonesViewModel4;
                    com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListContentKt.ProfileDataListContent(profileDataListUiState, stringResource2, stringResource3, stringResource4, "phone", function12, function02, companion, (kotlin.jvm.functions.Function0) obj3, null, null, null, null, startRestartGroup, 12607488, 0, 7680);
                    com.paypal.oslo.feature.userprofile.ui.components.common.CommonToastHostKt.ToastHost(rememberCommonToastHostState, androidx.compose.ui.platform.TestTagKt.testTag(boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getTopCenter()), "phone_saved_toast"), startRestartGroup, 0, 0);
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceGroup();
                } else {
                    allPhonesViewModel5 = allPhonesViewModel4;
                    startRestartGroup.startReplaceGroup(-1543732064);
                    startRestartGroup.endReplaceGroup();
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
                allPhonesViewModel3 = allPhonesViewModel5;
            } else {
                startRestartGroup.skipToGroupEnd();
                allPhonesViewModel3 = allPhonesViewModel2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.AllPhonesScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj4, java.lang.Object obj5) {
                        return com.paypal.oslo.feature.userprofile.ui.screens.phone.AllPhonesScreenKt.$r8$lambda$VNFzHLsoJTu0V577F8DmQEEx_X8(com.paypal.oslo.core.navigation.AppNavigator.this, userProfileConfig, featureGate, modifier5, allPhonesViewModel3, i, i2, (androidx.compose.runtime.Composer) obj4, ((java.lang.Integer) obj5).intValue());
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
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$-msmteTY-Fs5DszQ4rLBtJT3AJE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20545$r8$lambda$msmteTYFs5DszQ4rLBtJT3AJE(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6WyZWmha13YbxO5l6EqD_DPyb3U(java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.userprofile.api.navigation.PhoneOptionsDestination(str));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9uaeVWg0J_sJiq4C3y2DtcEn_YA(com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesViewModel allPhonesViewModel) {
        allPhonesViewModel.handleAction(com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesAction.RetryLoading.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UIMcQ8xz0aCpE4aJIdx_oflzYLQ(com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesViewModel allPhonesViewModel) {
        allPhonesViewModel.handleAction(com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesAction.AddPhone.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$VNFzHLsoJTu0V577F8DmQEEx_X8(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.userprofile.config.UserProfileConfig userProfileConfig, com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesViewModel allPhonesViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AllPhonesScreen(appNavigator, userProfileConfig, featureGate, modifier, allPhonesViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cyz7Cv2Yp51_JNbz13iL0TTCgSg(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, final java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneSavedNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.AllPhonesScreenKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.userprofile.ui.screens.phone.AllPhonesScreenKt.$r8$lambda$6WyZWmha13YbxO5l6EqD_DPyb3U(str2, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jnyHdvTw4xwk8cLZLdM0kOIdv14(int i, androidx.compose.runtime.Composer composer, int i2) {
        androidx.compose.runtime.Composer composer2;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-938538404);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-938538404, updateChangedFlags, -1, "com.paypal.oslo.feature.userprofile.ui.screens.phone.AllPhonesScreenPreview (AllPhonesScreen.kt:166)");
            }
            com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListUiState.Content content = new com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListUiState.Content(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.userprofile.domain.ProfileDataItem[]{new com.paypal.oslo.feature.userprofile.domain.ProfileDataItem("1", "07*** **3401", "Mobile", true, true, com.paypal.pds.core.Icon.Phone.INSTANCE, null, null, 192, null), new com.paypal.oslo.feature.userprofile.domain.ProfileDataItem(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D, "07*** **9282", com.paypal.oslo.feature.userprofile.domain.model.constants.PhoneConstants.HOME, false, true, com.paypal.pds.core.Icon.Phone.INSTANCE, null, null, 192, null)}));
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.AllPhonesScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.userprofile.ui.screens.phone.AllPhonesScreenKt.m20545$r8$lambda$msmteTYFs5DszQ4rLBtJT3AJE((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.AllPhonesScreenKt$$ExternalSyntheticLambda1
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
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.AllPhonesScreenKt$$ExternalSyntheticLambda2
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
            com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListContentKt.ProfileDataListContent(content, "Manage your communication preferences.", "Add a Phone Number", "No phone numbers found", "phone", function1, function0, companion, function02, null, null, null, null, composer2, 115043760, 0, 7680);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.AllPhonesScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.userprofile.ui.screens.phone.AllPhonesScreenKt.$r8$lambda$jnyHdvTw4xwk8cLZLdM0kOIdv14(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
