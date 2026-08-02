package com.paypal.oslo.feature.userprofile.ui.screens.email;

@kotlin.Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001a9\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\u001a7\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a'\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a\r\u0010\u001a\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001b¨\u0006\u001c²\u0006\u0016\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001eX\u008a\u0084\u0002"}, d2 = {"AllEmailsScreen", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "config", "Lcom/paypal/oslo/feature/userprofile/config/UserProfileConfig;", "featureGate", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AllEmailsViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/userprofile/config/UserProfileConfig;Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AllEmailsViewModel;Landroidx/compose/runtime/Composer;II)V", "EmailOptionsNavResultEffect", "requestId", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "toastHostState", "Lcom/paypal/oslo/feature/userprofile/ui/components/common/CommonToastHostState;", "addEditRequestId", "context", "Landroid/content/Context;", "EmailOptionsNavResultEffect-ZpvxNno", "(Ljava/lang/String;Lcom/paypal/oslo/feature/userprofile/ui/components/common/CommonToastHostState;Lcom/paypal/oslo/core/navigation/AppNavigator;Ljava/lang/String;Landroid/content/Context;Landroidx/compose/runtime/Composer;I)V", "EmailSavedNavResultEffect", "EmailSavedNavResultEffect-uMTlDqM", "(Ljava/lang/String;Lcom/paypal/oslo/feature/userprofile/ui/components/common/CommonToastHostState;Landroid/content/Context;Landroidx/compose/runtime/Composer;I)V", "AllEmailsScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "user-profile_prodRelease", "uiState", "Lcom/paypal/oslo/feature/userprofile/ui/components/common/ProfileDataListUiState;", "Lcom/paypal/oslo/feature/userprofile/domain/ProfileDataItem;", "Lcom/paypal/oslo/core/userstore/model/ProfileEmail;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AllEmailsScreenKt {
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0313, code lost:
    
        if (r4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0331, code lost:
    
        if (r4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x034f, code lost:
    
        if (r4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L129;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AllEmailsScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.userprofile.config.UserProfileConfig userProfileConfig, final com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.userprofile.ui.viewmodel.AllEmailsViewModel allEmailsViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        com.paypal.oslo.feature.userprofile.ui.viewmodel.AllEmailsViewModel allEmailsViewModel2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2;
        androidx.compose.runtime.ScopeUpdateScope scopeUpdateScope;
        int i4;
        int i5;
        androidx.compose.ui.Modifier modifier3;
        com.paypal.oslo.feature.userprofile.ui.viewmodel.AllEmailsViewModel allEmailsViewModel3;
        int i6;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        int i7;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userProfileConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-99332614);
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
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    allEmailsViewModel2 = allEmailsViewModel;
                    if (startRestartGroup.changedInstance(allEmailsViewModel2)) {
                        i7 = 16384;
                        i3 |= i7;
                    }
                } else {
                    allEmailsViewModel2 = allEmailsViewModel;
                }
                i7 = 8192;
                i3 |= i7;
            } else {
                allEmailsViewModel2 = allEmailsViewModel;
            }
            if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    i6 = i3;
                    i4 = 0;
                    allEmailsViewModel3 = allEmailsViewModel2;
                    modifier3 = modifier2;
                    i5 = 1;
                } else {
                    androidx.compose.ui.Modifier.Companion companion = i8 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
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
                        i5 = 1;
                        allEmailsViewModel2 = (com.paypal.oslo.feature.userprofile.ui.viewmodel.AllEmailsViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.userprofile.ui.viewmodel.AllEmailsViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                        i3 &= -57345;
                    } else {
                        i4 = 0;
                        i5 = 1;
                    }
                    modifier3 = companion;
                    allEmailsViewModel3 = allEmailsViewModel2;
                    i6 = i3;
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-99332614, i6, -1, "com.paypal.oslo.feature.userprofile.ui.screens.email.AllEmailsScreen (AllEmailsScreen.kt:72)");
                }
                boolean checkGate = featureGate.checkGate(com.paypal.oslo.feature.userprofile.remoteconfig.UserProfileFeatureGates.INSTANCE.getEmailsWebViewEnabled());
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "AllEmailsScreen: emailsWebViewEnabled", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("enabled", java.lang.Boolean.valueOf(checkGate))), null, 4, null);
                if (checkGate) {
                    startRestartGroup.startReplaceGroup(15129208);
                    java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_email_management_title, startRestartGroup, i4);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    int i9 = (i6 & 14) == 4 ? i5 : i4;
                    if ((i6 & 112) == 32) {
                        i4 = i5;
                    }
                    boolean changed = startRestartGroup.changed(stringResource);
                    com.paypal.oslo.feature.userprofile.ui.screens.email.AllEmailsScreenKt$AllEmailsScreen$1$1 rememberedValue = startRestartGroup.rememberedValue();
                    if (((changed ? 1 : 0) | i4 | i9) != 0 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new com.paypal.oslo.feature.userprofile.ui.screens.email.AllEmailsScreenKt$AllEmailsScreen$1$1(appNavigator, userProfileConfig, stringResource, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                    startRestartGroup.endReplaceGroup();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    scopeUpdateScope = startRestartGroup.endRestartGroup();
                    if (scopeUpdateScope != null) {
                        final androidx.compose.ui.Modifier modifier4 = modifier3;
                        final com.paypal.oslo.feature.userprofile.ui.viewmodel.AllEmailsViewModel allEmailsViewModel4 = allEmailsViewModel3;
                        function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.email.AllEmailsScreenKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj4, java.lang.Object obj5) {
                                return com.paypal.oslo.feature.userprofile.ui.screens.email.AllEmailsScreenKt.$r8$lambda$7InXjeFt3lREK_ePCtnQAm8DTnk(com.paypal.oslo.core.navigation.AppNavigator.this, userProfileConfig, featureGate, modifier4, allEmailsViewModel4, i, i2, (androidx.compose.runtime.Composer) obj4, ((java.lang.Integer) obj5).intValue());
                            }
                        };
                        scopeUpdateScope.updateScope(function2);
                        return;
                    }
                    return;
                }
                startRestartGroup.startReplaceGroup(15698120);
                startRestartGroup.endReplaceGroup();
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "AllEmailsScreen: Feature gate disabled - Showing native email management", null, null, 6, null);
                final com.paypal.oslo.feature.userprofile.ui.viewmodel.AllEmailsViewModel allEmailsViewModel5 = allEmailsViewModel3;
                androidx.compose.ui.Modifier modifier5 = modifier3;
                androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(allEmailsViewModel3.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                com.paypal.oslo.feature.userprofile.ui.components.common.CommonToastHostState rememberCommonToastHostState = com.paypal.oslo.feature.userprofile.ui.components.common.CommonToastHostKt.rememberCommonToastHostState(startRestartGroup, i4);
                java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, i4);
                java.lang.String rememberNavResultRequestId2 = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, i4);
                int i10 = i6;
                boolean z = i4;
                getHighSpeedVideoFpsRanges(rememberNavResultRequestId, rememberCommonToastHostState, appNavigator, rememberNavResultRequestId2, (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext()), startRestartGroup, (i6 << 6) & 896);
                getHighResolutionOutputSizeshNQ4ISI(rememberNavResultRequestId2, rememberCommonToastHostState, (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext()), startRestartGroup, z ? 1 : 0);
                boolean changedInstance = startRestartGroup.changedInstance(allEmailsViewModel5);
                boolean z2 = (i10 & 14) == 4 ? true : z ? 1 : 0;
                boolean changed2 = startRestartGroup.changed(rememberNavResultRequestId);
                boolean changed3 = startRestartGroup.changed(rememberNavResultRequestId2);
                com.paypal.oslo.feature.userprofile.ui.screens.email.AllEmailsScreenKt$AllEmailsScreen$3$1 rememberedValue2 = startRestartGroup.rememberedValue();
                if ((changedInstance | z2 | changed2 | changed3) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new com.paypal.oslo.feature.userprofile.ui.screens.email.AllEmailsScreenKt$AllEmailsScreen$3$1(allEmailsViewModel5, appNavigator, rememberNavResultRequestId, rememberNavResultRequestId2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(allEmailsViewModel5, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, (i10 >> 12) & 14);
                androidx.compose.ui.Modifier windowInsetsPadding = androidx.compose.foundation.layout.WindowInsetsPaddingKt.windowInsetsPadding(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier5, 0.0f, 1, null), androidx.compose.foundation.layout.WindowInsets_androidKt.getSystemBars(androidx.compose.foundation.layout.WindowInsets.INSTANCE, startRestartGroup, 6));
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), z);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, z ? 1 : 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, windowInsetsPadding);
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
                com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListUiState profileDataListUiState = (com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListUiState) collectAsStateWithLifecycle.getValue();
                java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_emails_subtitle, startRestartGroup, z ? 1 : 0);
                java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_add_new_email_button, startRestartGroup, z ? 1 : 0);
                java.lang.String stringResource4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_no_emails_found, startRestartGroup, z ? 1 : 0);
                boolean changedInstance2 = startRestartGroup.changedInstance(allEmailsViewModel5);
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changedInstance2) {
                    obj = rememberedValue3;
                }
                kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.email.AllEmailsScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj4) {
                        return com.paypal.oslo.feature.userprofile.ui.screens.email.AllEmailsScreenKt.$r8$lambda$v5EGkf5VkiEsfTYlTtRnHIWs0Ro(com.paypal.oslo.feature.userprofile.ui.viewmodel.AllEmailsViewModel.this, (java.lang.String) obj4);
                    }
                };
                startRestartGroup.updateRememberedValue(function1);
                obj = function1;
                kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) obj;
                boolean changedInstance3 = startRestartGroup.changedInstance(allEmailsViewModel5);
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (!changedInstance3) {
                    obj2 = rememberedValue4;
                }
                kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.email.AllEmailsScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.userprofile.ui.screens.email.AllEmailsScreenKt.m20507$r8$lambda$j0snDi9rM20JcCB09EFHpur9dk(com.paypal.oslo.feature.userprofile.ui.viewmodel.AllEmailsViewModel.this);
                    }
                };
                startRestartGroup.updateRememberedValue(function0);
                obj2 = function0;
                kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) obj2;
                boolean changedInstance4 = startRestartGroup.changedInstance(allEmailsViewModel5);
                java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (!changedInstance4) {
                    obj3 = rememberedValue5;
                }
                kotlin.jvm.functions.Function0 function03 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.email.AllEmailsScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.userprofile.ui.screens.email.AllEmailsScreenKt.m20508$r8$lambda$qQX8jkr19zYv5vh8V13x6aAUU(com.paypal.oslo.feature.userprofile.ui.viewmodel.AllEmailsViewModel.this);
                    }
                };
                startRestartGroup.updateRememberedValue(function03);
                obj3 = function03;
                composer2 = startRestartGroup;
                com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListContentKt.ProfileDataListContent(profileDataListUiState, stringResource2, stringResource3, stringResource4, "email", function12, function02, null, (kotlin.jvm.functions.Function0) obj3, null, null, null, null, composer2, 24576, 0, 7808);
                com.paypal.oslo.feature.userprofile.ui.components.common.CommonToastHostKt.ToastHost(rememberCommonToastHostState, androidx.compose.ui.platform.TestTagKt.testTag(boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getTopCenter()), "email_saved_toast"), composer2, z ? 1 : 0, z ? 1 : 0);
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier5;
                allEmailsViewModel2 = allEmailsViewModel5;
            } else {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                final com.paypal.oslo.feature.userprofile.ui.viewmodel.AllEmailsViewModel allEmailsViewModel6 = allEmailsViewModel2;
                function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.email.AllEmailsScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj4, java.lang.Object obj5) {
                        return com.paypal.oslo.feature.userprofile.ui.screens.email.AllEmailsScreenKt.m20504$r8$lambda$EqtGbdxXcDfbsQPmaQGmI3xRAk(com.paypal.oslo.core.navigation.AppNavigator.this, userProfileConfig, featureGate, modifier2, allEmailsViewModel6, i, i2, (androidx.compose.runtime.Composer) obj4, ((java.lang.Integer) obj5).intValue());
                    }
                };
                scopeUpdateScope = endRestartGroup;
                scopeUpdateScope.updateScope(function2);
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

    private static final void getHighSpeedVideoFpsRanges(final java.lang.String str, final com.paypal.oslo.feature.userprofile.ui.components.common.CommonToastHostState commonToastHostState, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.lang.String str2, final android.content.Context context, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1473026925);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(commonToastHostState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(appNavigator) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(context) ? 16384 : 8192;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1473026925, i3, -1, "com.paypal.oslo.feature.userprofile.ui.screens.email.EmailOptionsNavResultEffect (AllEmailsScreen.kt:173)");
            }
            boolean z = (i3 & 112) == 32;
            boolean changedInstance = startRestartGroup.changedInstance(context);
            boolean z2 = (i3 & 896) == 256;
            boolean z3 = (i3 & 7168) == 2048;
            com.paypal.oslo.feature.userprofile.ui.screens.email.AllEmailsScreenKt$EmailOptionsNavResultEffect$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if ((z | changedInstance | z2 | z3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.userprofile.ui.screens.email.AllEmailsScreenKt$EmailOptionsNavResultEffect$1$1(commonToastHostState, context, appNavigator, str2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue;
            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
            com.paypal.oslo.feature.userprofile.ui.screens.email.AllEmailsScreenKt$EmailOptionsNavResultEffectZpvxNno$$inlined$NavResultEffectrtGRyWw$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.email.AllEmailsScreenKt$EmailOptionsNavResultEffect-ZpvxNno$$inlined$NavResultEffect-rtGRyWw$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                        return m20510invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                    }

                    /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                    public final kotlinx.coroutines.flow.Flow<java.lang.Object> m20510invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str3) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
                        return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str3);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(str, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue2, startRestartGroup, (i3 & 14) | 3072);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.email.AllEmailsScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.userprofile.ui.screens.email.AllEmailsScreenKt.$r8$lambda$IL5E2Rwj7vJp7cas_PEZesgfwG4(str, commonToastHostState, appNavigator, str2, context, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighResolutionOutputSizeshNQ4ISI(final java.lang.String str, final com.paypal.oslo.feature.userprofile.ui.components.common.CommonToastHostState commonToastHostState, final android.content.Context context, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1013153654);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(commonToastHostState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(context) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1013153654, i2, -1, "com.paypal.oslo.feature.userprofile.ui.screens.email.EmailSavedNavResultEffect (AllEmailsScreen.kt:220)");
            }
            boolean changedInstance = startRestartGroup.changedInstance(context);
            boolean z = (i2 & 112) == 32;
            com.paypal.oslo.feature.userprofile.ui.screens.email.AllEmailsScreenKt$EmailSavedNavResultEffect$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.userprofile.ui.screens.email.AllEmailsScreenKt$EmailSavedNavResultEffect$1$1(context, commonToastHostState, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue;
            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
            com.paypal.oslo.feature.userprofile.ui.screens.email.AllEmailsScreenKt$EmailSavedNavResultEffectuMTlDqM$$inlined$NavResultEffectrtGRyWw$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.email.AllEmailsScreenKt$EmailSavedNavResultEffect-uMTlDqM$$inlined$NavResultEffect-rtGRyWw$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                        return m20511invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                    }

                    /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                    public final kotlinx.coroutines.flow.Flow<java.lang.Object> m20511invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str2) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                        return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(str, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue2, startRestartGroup, (i2 & 14) | 3072);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.email.AllEmailsScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.userprofile.ui.screens.email.AllEmailsScreenKt.m20505$r8$lambda$GPkpuKarcGeKN9EtJFUpUnMO60(str, commonToastHostState, context, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7InXjeFt3lREK_ePCtnQAm8DTnk(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.userprofile.config.UserProfileConfig userProfileConfig, com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.userprofile.ui.viewmodel.AllEmailsViewModel allEmailsViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AllEmailsScreen(appNavigator, userProfileConfig, featureGate, modifier, allEmailsViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BF_IlVFjQqEHrww1prUXySMvcXY(int i, androidx.compose.runtime.Composer composer, int i2) {
        androidx.compose.runtime.Composer composer2;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-658251318);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-658251318, updateChangedFlags, -1, "com.paypal.oslo.feature.userprofile.ui.screens.email.AllEmailsScreenPreview (AllEmailsScreen.kt:235)");
            }
            com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListUiState.Content content = new com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListUiState.Content(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.userprofile.domain.ProfileDataItem[]{new com.paypal.oslo.feature.userprofile.domain.ProfileDataItem("1", "_sys_aquarium-1508158190721794@paypal.com", null, true, true, com.paypal.pds.core.Icon.NoIcon.INSTANCE, null, null, 192, null), new com.paypal.oslo.feature.userprofile.domain.ProfileDataItem(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D, "sppt@rr.tt", null, false, true, com.paypal.pds.core.Icon.NoIcon.INSTANCE, null, null, 192, null)}));
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.email.AllEmailsScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.userprofile.ui.screens.email.AllEmailsScreenKt.$r8$lambda$Z86CTp_LE22lqV6XkHKLGLpQxcU((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.email.AllEmailsScreenKt$$ExternalSyntheticLambda2
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
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.email.AllEmailsScreenKt$$ExternalSyntheticLambda3
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
            com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListContentKt.ProfileDataListContent(content, "Pay, get paid, and more. Make sure you link your preferred email addresses.", "Add a New Email", "No email addresses found", "email", function1, function0, companion, function02, null, null, null, null, composer2, 115043760, 0, 7680);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.email.AllEmailsScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.userprofile.ui.screens.email.AllEmailsScreenKt.$r8$lambda$BF_IlVFjQqEHrww1prUXySMvcXY(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$EqtGbdxXcDfbsQ-PmaQGmI3xRAk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20504$r8$lambda$EqtGbdxXcDfbsQPmaQGmI3xRAk(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.userprofile.config.UserProfileConfig userProfileConfig, com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.userprofile.ui.viewmodel.AllEmailsViewModel allEmailsViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AllEmailsScreen(appNavigator, userProfileConfig, featureGate, modifier, allEmailsViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$GPkpuKarcGeKN9EtJFUpUnMO6-0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20505$r8$lambda$GPkpuKarcGeKN9EtJFUpUnMO60(java.lang.String str, com.paypal.oslo.feature.userprofile.ui.components.common.CommonToastHostState commonToastHostState, android.content.Context context, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighResolutionOutputSizeshNQ4ISI(str, commonToastHostState, context, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IL5E2Rwj7vJp7cas_PEZesgfwG4(java.lang.String str, com.paypal.oslo.feature.userprofile.ui.components.common.CommonToastHostState commonToastHostState, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str2, android.content.Context context, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRanges(str, commonToastHostState, appNavigator, str2, context, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Z86CTp_LE22lqV6XkHKLGLpQxcU(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$j0sn-Di9rM20JcCB09EFHpur9dk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20507$r8$lambda$j0snDi9rM20JcCB09EFHpur9dk(com.paypal.oslo.feature.userprofile.ui.viewmodel.AllEmailsViewModel allEmailsViewModel) {
        allEmailsViewModel.handleAction(com.paypal.oslo.feature.userprofile.ui.viewmodel.AllEmailsAction.RetryLoading.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$qQX8jkr19zYv5vh8V-13x6aA-UU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20508$r8$lambda$qQX8jkr19zYv5vh8V13x6aAUU(com.paypal.oslo.feature.userprofile.ui.viewmodel.AllEmailsViewModel allEmailsViewModel) {
        allEmailsViewModel.handleAction(com.paypal.oslo.feature.userprofile.ui.viewmodel.AllEmailsAction.AddEmail.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$v5EGkf5VkiEsfTYlTtRnHIWs0Ro(com.paypal.oslo.feature.userprofile.ui.viewmodel.AllEmailsViewModel allEmailsViewModel, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        allEmailsViewModel.handleAction(new com.paypal.oslo.feature.userprofile.ui.viewmodel.AllEmailsAction.SelectEmail(str));
        return kotlin.Unit.INSTANCE;
    }
}
