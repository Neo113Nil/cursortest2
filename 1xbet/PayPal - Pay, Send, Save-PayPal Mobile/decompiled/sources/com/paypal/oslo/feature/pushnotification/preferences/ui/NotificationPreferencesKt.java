package com.paypal.oslo.feature.pushnotification.preferences.ui;

@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a3\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\b¨\u0006\t²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002"}, d2 = {"NotificationPreferences", "", "preferencesViewModel", "Lcom/paypal/oslo/feature/pushnotification/preferences/ui/viewmodel/PreferencesViewModel;", "pushOptInState", "Lcom/paypal/oslo/feature/pushnotification/api/optin/PushOptInState;", "onTopBarCloseClick", "Lkotlin/Function0;", "(Lcom/paypal/oslo/feature/pushnotification/preferences/ui/viewmodel/PreferencesViewModel;Lcom/paypal/oslo/feature/pushnotification/api/optin/PushOptInState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "push-notification_prodRelease", "state", "Lcom/paypal/oslo/feature/pushnotification/preferences/ui/viewmodel/PreferencesUiState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NotificationPreferencesKt {
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    public static final void NotificationPreferences(com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel.PreferencesViewModel preferencesViewModel, com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState pushOptInState, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel.PreferencesViewModel preferencesViewModel2;
        int i3;
        com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState pushOptInState2;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        final com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel.PreferencesViewModel preferencesViewModel3;
        kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        final com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState pushOptInState3;
        boolean z;
        boolean z2;
        com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel.PreferencesViewModel preferencesViewModel4;
        int i4;
        com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState pushOptInState4;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        ?? r12;
        ?? r2;
        com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState pushOptInState5;
        kotlin.coroutines.CoroutineContext coroutineContext;
        com.paypal.oslo.feature.pushnotification.preferences.ui.NotificationPreferencesKt$NotificationPreferences$2$1 notificationPreferencesKt$NotificationPreferences$2$1;
        int i5;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-193113931);
        if ((i & 6) == 0) {
            if ((i2 & 1) == 0) {
                preferencesViewModel2 = preferencesViewModel;
                if (startRestartGroup.changedInstance(preferencesViewModel2)) {
                    i5 = 4;
                    i3 = i5 | i;
                }
            } else {
                preferencesViewModel2 = preferencesViewModel;
            }
            i5 = 2;
            i3 = i5 | i;
        } else {
            preferencesViewModel2 = preferencesViewModel;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
            pushOptInState2 = pushOptInState;
        } else {
            pushOptInState2 = pushOptInState;
            if ((i & 48) == 0) {
                i3 |= startRestartGroup.changedInstance(pushOptInState2) ? 32 : 16;
            }
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 384) == 0) {
                i3 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
            }
        }
        if (startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 1) != 0) {
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
                    androidx.view.viewmodel.CreationExtras creationExtras = empty;
                    z2 = true;
                    preferencesViewModel4 = (com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel.PreferencesViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel.PreferencesViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, creationExtras, startRestartGroup, 0, 0);
                    i3 &= -15;
                    z = false;
                } else {
                    z = false;
                    z2 = true;
                    preferencesViewModel4 = preferencesViewModel;
                }
                if (i6 != 0) {
                    pushOptInState2 = null;
                }
                if (i7 != 0) {
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.pushnotification.preferences.ui.NotificationPreferencesKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                kotlin.Unit unit;
                                unit = kotlin.Unit.INSTANCE;
                                return unit;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    i4 = i3;
                    preferencesViewModel3 = preferencesViewModel4;
                    pushOptInState4 = pushOptInState2;
                    function04 = (kotlin.jvm.functions.Function0) rememberedValue;
                    r2 = z2;
                    r12 = z;
                } else {
                    i4 = i3;
                    preferencesViewModel3 = preferencesViewModel4;
                    pushOptInState4 = pushOptInState2;
                    function04 = function0;
                    r2 = z2;
                    r12 = z;
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
                i4 = i3;
                pushOptInState4 = pushOptInState2;
                preferencesViewModel3 = preferencesViewModel2;
                r2 = 1;
                function04 = function02;
                r12 = 0;
            }
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-193113931, i4, -1, "com.paypal.oslo.feature.pushnotification.preferences.ui.NotificationPreferences (NotificationPreferences.kt:37)");
            }
            if (pushOptInState4 == null) {
                startRestartGroup.startReplaceGroup(-898886800);
                com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState rememberPushOptInState = com.paypal.oslo.feature.pushnotification.api.optin.RememberPushOptInStateKt.rememberPushOptInState(com.paypal.oslo.feature.pushnotification.preferences.PreferencesPushOptInSource.INSTANCE, startRestartGroup, 6, r12);
                startRestartGroup.endReplaceGroup();
                pushOptInState5 = rememberPushOptInState;
            } else {
                startRestartGroup.startReplaceGroup(-898887358);
                startRestartGroup.endReplaceGroup();
                pushOptInState5 = pushOptInState4;
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean changedInstance = startRestartGroup.changedInstance(preferencesViewModel3);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                coroutineContext = null;
                notificationPreferencesKt$NotificationPreferences$2$1 = new com.paypal.oslo.feature.pushnotification.preferences.ui.NotificationPreferencesKt$NotificationPreferences$2$1(preferencesViewModel3, null);
                startRestartGroup.updateRememberedValue(notificationPreferencesKt$NotificationPreferences$2$1);
            } else {
                notificationPreferencesKt$NotificationPreferences$2$1 = rememberedValue2;
                coroutineContext = null;
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) notificationPreferencesKt$NotificationPreferences$2$1, startRestartGroup, 6);
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, r2, coroutineContext);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), r12);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, r12));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
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
            if (pushOptInState5.isOptInRequired()) {
                startRestartGroup.startReplaceGroup(1265910888);
                final com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState pushOptInState6 = pushOptInState5;
                int i8 = r12;
                kotlin.jvm.functions.Function0<kotlin.Unit> function05 = function04;
                com.paypal.oslo.core.commonui.components.TopBarKt.TopBar("", null, null, null, false, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(787507331, r2, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.pushnotification.preferences.ui.NotificationPreferencesKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.pushnotification.preferences.ui.NotificationPreferencesKt.m17748$r8$lambda$gMiSyre80PRtNAbKKSuI8NNonE(kotlin.jvm.functions.Function0.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, 1572870, 62);
                boolean changedInstance2 = startRestartGroup.changedInstance(pushOptInState6);
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changedInstance2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.pushnotification.preferences.ui.NotificationPreferencesKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.pushnotification.preferences.ui.NotificationPreferencesKt.m17749$r8$lambda$udpGkB1U1tSbchGMszfDWZUw_I(com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                com.paypal.oslo.feature.pushnotification.preferences.ui.PushPermissionScreenKt.PushPermissionScreen((kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, i8);
                function03 = function05;
            } else {
                boolean z3 = r12;
                final kotlin.jvm.functions.Function0<kotlin.Unit> function06 = function04;
                startRestartGroup.startReplaceGroup(1266205543);
                androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(preferencesViewModel3.getPreferencesStateFlow(), coroutineContext, startRestartGroup, z3 ? 1 : 0, r2);
                com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel.PreferencesUiState preferencesUiState = (com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel.PreferencesUiState) collectAsState.getValue();
                if ((preferencesUiState instanceof com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel.PreferencesUiState.Error) || kotlin.jvm.internal.Intrinsics.areEqual(preferencesUiState, com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel.PreferencesUiState.Empty.INSTANCE)) {
                    startRestartGroup.startReplaceGroup(1266335805);
                    function03 = function06;
                    com.paypal.oslo.core.commonui.components.TopBarKt.TopBar("", null, null, null, false, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(217357922, r2, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.pushnotification.preferences.ui.NotificationPreferencesKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.pushnotification.preferences.ui.NotificationPreferencesKt.$r8$lambda$h7LgEooRCDRaDUFO3b3oNgJFf3M(kotlin.jvm.functions.Function0.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54), startRestartGroup, 1572870, 62);
                    boolean changedInstance3 = startRestartGroup.changedInstance(preferencesViewModel3);
                    java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if (changedInstance3 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.pushnotification.preferences.ui.NotificationPreferencesKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.pushnotification.preferences.ui.NotificationPreferencesKt.$r8$lambda$H0yertsve8nmNsbipni490BtP0E(com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel.PreferencesViewModel.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    com.paypal.oslo.feature.pushnotification.preferences.ui.PreferencesErrorScreenKt.PreferencesErrorScreen((kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, z3 ? 1 : 0);
                    startRestartGroup.endReplaceGroup();
                } else if (preferencesUiState instanceof com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel.PreferencesUiState.Loading) {
                    startRestartGroup.startReplaceGroup(1266669365);
                    androidx.compose.ui.Modifier verticalScroll$default = androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.foundation.ScrollKt.rememberScrollState(z3 ? 1 : 0, startRestartGroup, z3 ? 1 : 0, r2), false, null, false, 14, null);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, z3 ? 1 : 0);
                    int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, z3 ? 1 : 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, verticalScroll$default);
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
                    androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), z3);
                    int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, z3 ? 1 : 0));
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, maybeCachedBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    com.paypal.oslo.core.commonui.components.TopBarKt.TopBar("", null, null, null, false, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1534992803, r2, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.pushnotification.preferences.ui.NotificationPreferencesKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.pushnotification.preferences.ui.NotificationPreferencesKt.$r8$lambda$C4v72owJMoxC_sg3EtRH2bre3QA(kotlin.jvm.functions.Function0.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54), startRestartGroup, 1572870, 62);
                    com.paypal.oslo.feature.pushnotification.preferences.ui.PreferencesLoadingScreenKt.PreferencesLoadingScreen(startRestartGroup, z3 ? 1 : 0);
                    startRestartGroup.endNode();
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceGroup();
                    function03 = function06;
                } else {
                    if (!(preferencesUiState instanceof com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel.PreferencesUiState.Success)) {
                        startRestartGroup.startReplaceGroup(-1067530289);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    startRestartGroup.startReplaceGroup(1267238835);
                    androidx.compose.ui.Modifier verticalScroll$default2 = androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.foundation.ScrollKt.rememberScrollState(z3 ? 1 : 0, startRestartGroup, z3 ? 1 : 0, r2), false, null, false, 14, null);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, z3 ? 1 : 0);
                    int hashCode4 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, z3 ? 1 : 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier4 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, verticalScroll$default2);
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, currentCompositionLocalMap4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl4, java.lang.Integer.valueOf(hashCode4), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, materializeModifier4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                    androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy3 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), z3);
                    int hashCode5 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, z3 ? 1 : 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier5 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, maybeCachedBoxMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, currentCompositionLocalMap5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl5, java.lang.Integer.valueOf(hashCode5), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, materializeModifier5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance3 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    int i9 = i4;
                    com.paypal.oslo.core.commonui.components.TopBarKt.TopBar("", null, null, null, false, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(628309406, r2, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.pushnotification.preferences.ui.NotificationPreferencesKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.pushnotification.preferences.ui.NotificationPreferencesKt.m17746$r8$lambda$MTggvLgsThXfnPP8fSvXGreMWg(kotlin.jvm.functions.Function0.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54), startRestartGroup, 1572870, 62);
                    com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel.PreferencesUiState preferencesUiState2 = (com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel.PreferencesUiState) collectAsState.getValue();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(preferencesUiState2, "");
                    com.paypal.oslo.feature.pushnotification.preferences.domain.model.PreferencesList domainPreferencesList = ((com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel.PreferencesUiState.Success) preferencesUiState2).getDomainPreferencesList();
                    boolean changedInstance4 = startRestartGroup.changedInstance(preferencesViewModel3);
                    java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                    if (changedInstance4 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.pushnotification.preferences.ui.NotificationPreferencesKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.pushnotification.preferences.ui.NotificationPreferencesKt.$r8$lambda$JfE4nP0UNgJhCr2Zy2Rha4M2CGc(com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel.PreferencesViewModel.this, (com.paypal.oslo.feature.pushnotification.preferences.domain.model.PushNotificationPreference) obj, ((java.lang.Boolean) obj2).booleanValue());
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    com.paypal.oslo.feature.pushnotification.preferences.ui.PreferencesScreenKt.PreferencesScreen(domainPreferencesList, preferencesViewModel3, (kotlin.jvm.functions.Function2) rememberedValue5, startRestartGroup, (i9 << 3) & 112);
                    startRestartGroup.endNode();
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceGroup();
                    function03 = function06;
                }
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            pushOptInState3 = pushOptInState4;
        } else {
            startRestartGroup.skipToGroupEnd();
            preferencesViewModel3 = preferencesViewModel;
            function03 = function0;
            pushOptInState3 = pushOptInState2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel.PreferencesViewModel preferencesViewModel5 = preferencesViewModel3;
            final kotlin.jvm.functions.Function0<kotlin.Unit> function07 = function03;
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.pushnotification.preferences.ui.NotificationPreferencesKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.pushnotification.preferences.ui.NotificationPreferencesKt.$r8$lambda$uC_wrLOkMtlTNKvdkU21QvfmWXA(com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel.PreferencesViewModel.this, pushOptInState3, function07, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$C4v72owJMoxC_sg3EtRH2bre3QA(kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1534992803, i, -1, "com.paypal.oslo.feature.pushnotification.preferences.ui.NotificationPreferences.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NotificationPreferences.kt:71)");
            }
            com.paypal.oslo.core.commonui.components.TopBarKt.TopBarCloseButton(function0, null, null, composer, 0, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$H0yertsve8nmNsbipni490BtP0E(com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel.PreferencesViewModel preferencesViewModel) {
        preferencesViewModel.getPreferences();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JfE4nP0UNgJhCr2Zy2Rha4M2CGc(com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel.PreferencesViewModel preferencesViewModel, com.paypal.oslo.feature.pushnotification.preferences.domain.model.PushNotificationPreference pushNotificationPreference, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushNotificationPreference, "");
        preferencesViewModel.togglePreference(pushNotificationPreference, z);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$MTggvLgs-ThXfnPP8fSvXGreMWg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17746$r8$lambda$MTggvLgsThXfnPP8fSvXGreMWg(kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(628309406, i, -1, "com.paypal.oslo.feature.pushnotification.preferences.ui.NotificationPreferences.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NotificationPreferences.kt:86)");
            }
            com.paypal.oslo.core.commonui.components.TopBarKt.TopBarCloseButton(function0, null, null, composer, 0, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$gMi-Syre80PRtNAbKKSuI8NNonE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17748$r8$lambda$gMiSyre80PRtNAbKKSuI8NNonE(kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(787507331, i, -1, "com.paypal.oslo.feature.pushnotification.preferences.ui.NotificationPreferences.<anonymous>.<anonymous> (NotificationPreferences.kt:49)");
            }
            com.paypal.oslo.core.commonui.components.TopBarKt.TopBarCloseButton(function0, null, null, composer, 0, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$h7LgEooRCDRaDUFO3b3oNgJFf3M(kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(217357922, i, -1, "com.paypal.oslo.feature.pushnotification.preferences.ui.NotificationPreferences.<anonymous>.<anonymous> (NotificationPreferences.kt:58)");
            }
            com.paypal.oslo.core.commonui.components.TopBarKt.TopBarCloseButton(function0, null, null, composer, 0, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$uC_wrLOkMtlTNKvdkU21QvfmWXA(com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel.PreferencesViewModel preferencesViewModel, com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState pushOptInState, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        NotificationPreferences(preferencesViewModel, pushOptInState, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$udpGkB1U1tSbchGMszf-DWZUw_I, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17749$r8$lambda$udpGkB1U1tSbchGMszfDWZUw_I(com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState pushOptInState) {
        pushOptInState.requestPermissionOrOpenSettings();
        return kotlin.Unit.INSTANCE;
    }
}
