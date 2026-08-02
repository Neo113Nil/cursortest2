package com.paypal.oslo.feature.settings.ui.screens;

@kotlin.Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a<\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0013\b\u0002\u0010\n\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010\u000e\u001a/\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\u0012\u001a;\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00030\u00172\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\u0019\u001aE\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00030\u00172\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0001¢\u0006\u0002\u0010\u001d\u001a\u0017\u0010\u001e\u001a\u00020\u00032\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\u0003¢\u0006\u0002\u0010\u001f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006 ²\u0006\n\u0010!\u001a\u00020\u0011X\u008a\u0084\u0002²\u0006\n\u0010\"\u001a\u00020\u0015X\u008a\u008e\u0002"}, d2 = {"SettingsListTestTag", "", "SettingsScreen", "", "viewModel", "Lcom/paypal/oslo/feature/settings/ui/viewmodel/SettingsViewModel;", "appNavigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "modifier", "Landroidx/compose/ui/Modifier;", "pushOptInStateFactory", "Lkotlin/Function0;", "Lcom/paypal/oslo/feature/pushnotification/api/optin/PushOptInState;", "Landroidx/compose/runtime/Composable;", "(Lcom/paypal/oslo/feature/settings/ui/viewmodel/SettingsViewModel;Lcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "SettingsScreenWithEffects", "state", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState;", "(Lcom/paypal/oslo/feature/settings/ui/viewmodel/SettingsViewModel;Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState;Lcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SettingsScreenContent", "isCloseAccountEnabled", "", "onEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent;", "(Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SettingsScreenReady", "listState", "Landroidx/compose/foundation/lazy/LazyListState;", "(Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/runtime/Composer;II)V", "SettingsStateContainerPreview", "(Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState;Landroidx/compose/runtime/Composer;I)V", "settings_prodRelease", "uiState", "showPasswordChangedToast"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SettingsScreenKt {
    public static final java.lang.String SettingsListTestTag = "settings_list";

    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SettingsScreen(final com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel settingsViewModel, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState> function2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState> function22;
        final androidx.compose.ui.Modifier modifier3;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState> function23;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i4;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-37074344);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(settingsViewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(appNavigator) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    function22 = function2;
                    if (startRestartGroup.changedInstance(function22)) {
                        i5 = 2048;
                        i3 |= i5;
                    }
                } else {
                    function22 = function2;
                }
                i5 = 1024;
                i3 |= i5;
            } else {
                function22 = function2;
            }
            if (!startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    i4 = i3;
                    modifier3 = modifier2;
                } else {
                    androidx.compose.ui.Modifier.Companion companion = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) != 0) {
                        i4 = i3 & (-7169);
                        modifier3 = companion;
                        function23 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt.$r8$lambda$Ma4r3cKnK4LQERRpFJhmpynzWC0((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        };
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-37074344, i4, -1, "com.paypal.oslo.feature.settings.ui.screens.SettingsScreen (SettingsScreen.kt:91)");
                        }
                        final androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(settingsViewModel.getState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                        com.paypal.oslo.feature.settings.ui.components.PushNotificationsOptInKt.ProvidePushNotificationsOptIn(function23, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1683868455, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt.m19303$r8$lambda$VZklhwND1BbagUjzppWC4br4j4(com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel.this, appNavigator, modifier3, collectAsStateWithLifecycle, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        }, startRestartGroup, 54), startRestartGroup, ((i4 >> 9) & 14) | 48);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                    } else {
                        i4 = i3;
                        modifier3 = companion;
                    }
                }
                function23 = function22;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                final androidx.compose.runtime.State collectAsStateWithLifecycle2 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(settingsViewModel.getState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                com.paypal.oslo.feature.settings.ui.components.PushNotificationsOptInKt.ProvidePushNotificationsOptIn(function23, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1683868455, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt.m19303$r8$lambda$VZklhwND1BbagUjzppWC4br4j4(com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel.this, appNavigator, modifier3, collectAsStateWithLifecycle2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, ((i4 >> 9) & 14) | 48);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                function23 = function22;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier3;
                final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState> function24 = function23;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt.$r8$lambda$DgO_OXbdlPQKUju1YoMBneTI91U(com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel.this, appNavigator, modifier4, function24, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SettingsScreenWithEffects(final com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel settingsViewModel, final com.paypal.oslo.feature.settings.ui.mvi.SettingsState settingsState, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.String str;
        boolean z;
        java.lang.String str2;
        kotlin.Unit unit;
        java.lang.String str3;
        com.paypal.oslo.core.navigation.result.NavResultManager navResultManager;
        com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt$SettingsScreenWithEffects$3$1 settingsScreenKt$SettingsScreenWithEffects$3$1;
        com.paypal.oslo.core.navigation.result.NavResultManager navResultManager2;
        com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt$SettingsScreenWithEffects$4$1 settingsScreenKt$SettingsScreenWithEffects$4$1;
        com.paypal.oslo.core.navigation.result.NavResultManager navResultManager3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1087763229);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(settingsViewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(settingsState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(appNavigator) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1087763229, i4, -1, "com.paypal.oslo.feature.settings.ui.screens.SettingsScreenWithEffects (SettingsScreen.kt:119)");
                }
                com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState pushOptInState = (com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState) startRestartGroup.consume(com.paypal.oslo.feature.settings.ui.components.PushNotificationsOptInKt.getLocalPushNotificationsOptIn());
                java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
                java.lang.String rememberNavResultRequestId2 = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
                java.lang.String rememberNavResultRequestId3 = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
                androidx.lifecycle.Lifecycle.Event event = androidx.lifecycle.Lifecycle.Event.ON_RESUME;
                boolean changedInstance = startRestartGroup.changedInstance(settingsViewModel);
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt.$r8$lambda$PH7IGqBqbVRL2MaLjLdnNz6C834(com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.ui.Modifier modifier4 = modifier3;
                androidx.view.compose.LifecycleEffectKt.LifecycleEventEffect(event, null, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 6, 2);
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                boolean changedInstance2 = startRestartGroup.changedInstance(settingsViewModel);
                boolean changedInstance3 = startRestartGroup.changedInstance(pushOptInState);
                if ((i4 & 896) != 256) {
                    str = rememberNavResultRequestId3;
                    z = false;
                } else {
                    str = rememberNavResultRequestId3;
                    z = true;
                }
                boolean changed = startRestartGroup.changed(str);
                boolean changed2 = startRestartGroup.changed(rememberNavResultRequestId);
                boolean changed3 = startRestartGroup.changed(rememberNavResultRequestId2);
                com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt$SettingsScreenWithEffects$2$1 rememberedValue3 = startRestartGroup.rememberedValue();
                if (((changedInstance2 | changedInstance3 | z | changed | changed2) || changed3) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    str2 = rememberNavResultRequestId;
                    unit = unit2;
                    str3 = str;
                    rememberedValue3 = new com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt$SettingsScreenWithEffects$2$1(settingsViewModel, pushOptInState, appNavigator, str, rememberNavResultRequestId, rememberNavResultRequestId2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                } else {
                    str2 = rememberNavResultRequestId;
                    unit = unit2;
                    str3 = str;
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 6);
                boolean changedInstance4 = startRestartGroup.changedInstance(settingsViewModel);
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (changedInstance4 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    navResultManager = null;
                    settingsScreenKt$SettingsScreenWithEffects$3$1 = new com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt$SettingsScreenWithEffects$3$1(settingsViewModel, null);
                    startRestartGroup.updateRememberedValue(settingsScreenKt$SettingsScreenWithEffects$3$1);
                } else {
                    settingsScreenKt$SettingsScreenWithEffects$3$1 = rememberedValue4;
                    navResultManager = null;
                }
                kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) settingsScreenKt$SettingsScreenWithEffects$3$1;
                com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(navResultManager, startRestartGroup, 0);
                com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt$SettingsScreenWithEffects$$inlined$NavResultEffectrtGRyWw$1 rememberedValue5 = startRestartGroup.rememberedValue();
                if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt$SettingsScreenWithEffects$$inlined$NavResultEffect-rtGRyWw$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager4, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                            return m19307invokehN0UB1M(navResultManager4, navResultRequestId.m11592unboximpl());
                        }

                        /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                        public final kotlinx.coroutines.flow.Flow<java.lang.Object> m19307invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager4, java.lang.String str4) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager4, "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
                            return navResultManager4.m11582getScopedResultFlowInternalDpEMydE(str4);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(str2, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue5, startRestartGroup, 3072);
                boolean changedInstance5 = startRestartGroup.changedInstance(settingsViewModel);
                java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                if (changedInstance5 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    navResultManager2 = null;
                    settingsScreenKt$SettingsScreenWithEffects$4$1 = new com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt$SettingsScreenWithEffects$4$1(settingsViewModel, null);
                    startRestartGroup.updateRememberedValue(settingsScreenKt$SettingsScreenWithEffects$4$1);
                } else {
                    settingsScreenKt$SettingsScreenWithEffects$4$1 = rememberedValue6;
                    navResultManager2 = null;
                }
                kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) settingsScreenKt$SettingsScreenWithEffects$4$1;
                com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager2 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(navResultManager2, startRestartGroup, 0);
                com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt$SettingsScreenWithEffects$$inlined$NavResultEffectrtGRyWw$2 rememberedValue7 = startRestartGroup.rememberedValue();
                if (rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue7 = new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt$SettingsScreenWithEffects$$inlined$NavResultEffect-rtGRyWw$2
                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager4, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                            return m19308invokehN0UB1M(navResultManager4, navResultRequestId.m11592unboximpl());
                        }

                        /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                        public final kotlinx.coroutines.flow.Flow<java.lang.Object> m19308invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager4, java.lang.String str4) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager4, "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
                            return navResultManager4.m11582getScopedResultFlowInternalDpEMydE(str4);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue7);
                }
                com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId2, resolveNavResultManager2, function22, (kotlin.jvm.functions.Function2) rememberedValue7, startRestartGroup, 3072);
                com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt$SettingsScreenWithEffects$5$1 rememberedValue8 = startRestartGroup.rememberedValue();
                if (rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    navResultManager3 = null;
                    rememberedValue8 = new com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt$SettingsScreenWithEffects$5$1(mutableState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue8);
                } else {
                    navResultManager3 = null;
                }
                kotlin.jvm.functions.Function2 function23 = (kotlin.jvm.functions.Function2) rememberedValue8;
                com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager3 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(navResultManager3, startRestartGroup, 0);
                com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt$SettingsScreenWithEffects$$inlined$NavResultEffectrtGRyWw$3 rememberedValue9 = startRestartGroup.rememberedValue();
                if (rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue9 = new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt$SettingsScreenWithEffects$$inlined$NavResultEffect-rtGRyWw$3
                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager4, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                            return m19309invokehN0UB1M(navResultManager4, navResultRequestId.m11592unboximpl());
                        }

                        /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                        public final kotlinx.coroutines.flow.Flow<java.lang.Object> m19309invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager4, java.lang.String str4) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager4, "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
                            return navResultManager4.m11582getScopedResultFlowInternalDpEMydE(str4);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue9);
                }
                com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(str3, resolveNavResultManager3, function23, (kotlin.jvm.functions.Function2) rememberedValue9, startRestartGroup, 3072);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, modifier4);
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
                boolean isCloseAccountEnabled = settingsViewModel.isCloseAccountEnabled();
                boolean changedInstance6 = startRestartGroup.changedInstance(settingsViewModel);
                com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt$SettingsScreenWithEffects$6$1$1 rememberedValue10 = startRestartGroup.rememberedValue();
                if (changedInstance6 || rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue10 = new com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt$SettingsScreenWithEffects$6$1$1(settingsViewModel);
                    startRestartGroup.updateRememberedValue(rememberedValue10);
                }
                SettingsScreenContent(settingsState, isCloseAccountEnabled, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue10), null, startRestartGroup, (i4 >> 3) & 14, 8);
                if (((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
                    startRestartGroup.startReplaceGroup(-1321346387);
                    java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.settings.R.string.feature_settings_change_password_success, startRestartGroup, 0);
                    androidx.compose.ui.Modifier align = boxScopeInstance.align(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, 0.0f, 13, null), androidx.compose.ui.Alignment.INSTANCE.getTopCenter());
                    java.lang.Object rememberedValue11 = startRestartGroup.rememberedValue();
                    if (rememberedValue11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue11 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt.m19302$r8$lambda$Ker8U0MYwzlIgH3Crb3CLD5ow0(androidx.compose.runtime.MutableState.this, ((java.lang.Boolean) obj).booleanValue());
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue11);
                    }
                    com.paypal.pds.components.ToastKt.Toast(stringResource, align, null, (kotlin.jvm.functions.Function1) rememberedValue11, startRestartGroup, 3072, 4);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-1320960065);
                    startRestartGroup.endReplaceGroup();
                }
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt.$r8$lambda$NwqG0vFAPhOvyoskPpEdYMhOgUo(com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel.this, settingsState, appNavigator, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SettingsScreenContent(final com.paypal.oslo.feature.settings.ui.mvi.SettingsState settingsState, final boolean z, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier modifier3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1837263066);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(settingsState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1837263066, i3, -1, "com.paypal.oslo.feature.settings.ui.screens.SettingsScreenContent (SettingsScreen.kt:220)");
                }
                com.paypal.oslo.feature.settings.ui.mvi.SettingsState.ScreenState screenState = settingsState.getScreenState();
                if ((screenState instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsState.ScreenState.Initial) || (screenState instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsState.ScreenState.Loading)) {
                    modifier3 = modifier4;
                    composer2 = startRestartGroup;
                    composer2.startReplaceGroup(-1158929399);
                    com.paypal.oslo.feature.settings.ui.components.LoadingScreenComponentKt.LoadingScreenComponent(modifier3, "", composer2, ((i3 >> 9) & 14) | 48, 0);
                    composer2.endReplaceGroup();
                } else if (screenState instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsState.ScreenState.Ready) {
                    startRestartGroup.startReplaceGroup(-1158752823);
                    modifier3 = modifier4;
                    SettingsScreenReady(settingsState, z, function1, modifier3, null, startRestartGroup, i3 & 8190, 16);
                    startRestartGroup.endReplaceGroup();
                    composer2 = startRestartGroup;
                } else {
                    if (!(screenState instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsState.ScreenState.Error)) {
                        startRestartGroup.startReplaceGroup(378253968);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    startRestartGroup.startReplaceGroup(-1158484177);
                    androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
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
                    modifier3 = modifier4;
                    composer2 = startRestartGroup;
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(((com.paypal.oslo.feature.settings.ui.mvi.SettingsState.ScreenState.Error) settingsState.getScreenState()).getMessage(), null, null, null, null, null, false, 0, 0, null, null, composer2, 0, 0, 2046);
                    composer2.endNode();
                    composer2.endReplaceGroup();
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt.$r8$lambda$aCW8_J5rhGUdSedjDB5zSLH8lyI(com.paypal.oslo.feature.settings.ui.mvi.SettingsState.this, z, function1, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SettingsScreenReady(final com.paypal.oslo.feature.settings.ui.mvi.SettingsState settingsState, final boolean z, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.foundation.lazy.LazyListState lazyListState, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.foundation.lazy.LazyListState lazyListState2;
        final androidx.compose.foundation.lazy.LazyListState lazyListState3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        final androidx.compose.foundation.lazy.LazyListState rememberLazyListState;
        int i4;
        androidx.compose.ui.Modifier modifier3;
        boolean z2;
        java.lang.Object rememberedValue;
        boolean z3;
        boolean changed;
        java.lang.Object rememberedValue2;
        boolean changedInstance;
        boolean z4;
        boolean z5;
        java.lang.Object rememberedValue3;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2120688413);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(settingsState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    lazyListState2 = lazyListState;
                    if (startRestartGroup.changed(lazyListState2)) {
                        i5 = 16384;
                        i3 |= i5;
                    }
                } else {
                    lazyListState2 = lazyListState;
                }
                i5 = 8192;
                i3 |= i5;
            } else {
                lazyListState2 = lazyListState;
            }
            if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                    if (i6 != 0) {
                        modifier2 = androidx.compose.ui.Modifier.INSTANCE;
                    }
                    if ((i2 & 16) != 0) {
                        rememberLazyListState = androidx.compose.foundation.lazy.LazyListStateKt.rememberLazyListState(settingsState.getScrollIndex().getFirst().intValue(), settingsState.getScrollIndex().getSecond().intValue(), startRestartGroup, 0, 0);
                        i4 = i3 & (-57345);
                        modifier3 = modifier2;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-2120688413, i4, -1, "com.paypal.oslo.feature.settings.ui.screens.SettingsScreenReady (SettingsScreen.kt:265)");
                        }
                        int i7 = i4 & 896;
                        z2 = i7 != 256;
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!z2 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt$$ExternalSyntheticLambda12
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt.$r8$lambda$YizPZ2k4pJ3Bo0SueXka88NJ79I(kotlin.jvm.functions.Function1.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        com.paypal.oslo.core.navigation.scene.TabReselectionHandlerKt.TabReselectionHandler(rememberLazyListState, (kotlin.jvm.functions.Function0<kotlin.Unit>) rememberedValue, startRestartGroup, (i4 >> 12) & 14, 0);
                        startRestartGroup.startReplaceGroup(2127920836);
                        z3 = i7 != 256;
                        changed = startRestartGroup.changed(rememberLazyListState);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!(z3 | changed) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt.m19305$r8$lambda$z75CCMWC53R74l8phikH0ytJdw(kotlin.jvm.functions.Function1.this, rememberLazyListState, (androidx.compose.runtime.DisposableEffectScope) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        androidx.compose.runtime.EffectsKt.DisposableEffect(rememberLazyListState, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue2, startRestartGroup, 0);
                        startRestartGroup.endReplaceGroup();
                        com.paypal.oslo.core.navigation.scene.L1ContentInsets l1ContentInsets = (com.paypal.oslo.core.navigation.scene.L1ContentInsets) startRestartGroup.consume(com.paypal.oslo.core.navigation.scene.LocalL1ContentInsetsKt.getLocalL1ContentInsets());
                        androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(modifier3, SettingsListTestTag);
                        androidx.compose.foundation.layout.PaddingValues m1703PaddingValuesa9UjIt4$default = androidx.compose.foundation.layout.PaddingKt.m1703PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, l1ContentInsets.m11616getBottomD9Ej5fM(), 7, null);
                        changedInstance = startRestartGroup.changedInstance(settingsState);
                        z4 = i7 != 256;
                        z5 = (i4 & 112) == 32;
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!(z4 | changedInstance | z5) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt.$r8$lambda$HyFYWeifGPESdDFSEUgrdVqWTgs(com.paypal.oslo.feature.settings.ui.mvi.SettingsState.this, z, function1, (androidx.compose.foundation.lazy.LazyListScope) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        androidx.compose.foundation.lazy.LazyListState lazyListState4 = rememberLazyListState;
                        androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(testTag, rememberLazyListState, m1703PaddingValuesa9UjIt4$default, false, null, null, null, false, null, (kotlin.jvm.functions.Function1) rememberedValue3, startRestartGroup, (i4 >> 9) & 112, 504);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier3;
                        lazyListState3 = lazyListState4;
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                }
                i4 = i3;
                modifier3 = modifier2;
                rememberLazyListState = lazyListState2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                int i72 = i4 & 896;
                if (i72 != 256) {
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z2) {
                }
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt.$r8$lambda$YizPZ2k4pJ3Bo0SueXka88NJ79I(kotlin.jvm.functions.Function1.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                com.paypal.oslo.core.navigation.scene.TabReselectionHandlerKt.TabReselectionHandler(rememberLazyListState, (kotlin.jvm.functions.Function0<kotlin.Unit>) rememberedValue, startRestartGroup, (i4 >> 12) & 14, 0);
                startRestartGroup.startReplaceGroup(2127920836);
                if (i72 != 256) {
                }
                changed = startRestartGroup.changed(rememberLazyListState);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!(z3 | changed)) {
                }
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt.m19305$r8$lambda$z75CCMWC53R74l8phikH0ytJdw(kotlin.jvm.functions.Function1.this, rememberLazyListState, (androidx.compose.runtime.DisposableEffectScope) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
                androidx.compose.runtime.EffectsKt.DisposableEffect(rememberLazyListState, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue2, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
                com.paypal.oslo.core.navigation.scene.L1ContentInsets l1ContentInsets2 = (com.paypal.oslo.core.navigation.scene.L1ContentInsets) startRestartGroup.consume(com.paypal.oslo.core.navigation.scene.LocalL1ContentInsetsKt.getLocalL1ContentInsets());
                androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(modifier3, SettingsListTestTag);
                androidx.compose.foundation.layout.PaddingValues m1703PaddingValuesa9UjIt4$default2 = androidx.compose.foundation.layout.PaddingKt.m1703PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, l1ContentInsets2.m11616getBottomD9Ej5fM(), 7, null);
                changedInstance = startRestartGroup.changedInstance(settingsState);
                if (i72 != 256) {
                }
                if ((i4 & 112) == 32) {
                }
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!(z4 | changedInstance | z5)) {
                }
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt.$r8$lambda$HyFYWeifGPESdDFSEUgrdVqWTgs(com.paypal.oslo.feature.settings.ui.mvi.SettingsState.this, z, function1, (androidx.compose.foundation.lazy.LazyListScope) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
                androidx.compose.foundation.lazy.LazyListState lazyListState42 = rememberLazyListState;
                androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(testTag2, rememberLazyListState, m1703PaddingValuesa9UjIt4$default2, false, null, null, null, false, null, (kotlin.jvm.functions.Function1) rememberedValue3, startRestartGroup, (i4 >> 9) & 112, 504);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier3;
                lazyListState3 = lazyListState42;
            } else {
                startRestartGroup.skipToGroupEnd();
                lazyListState3 = lazyListState2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt.$r8$lambda$od9lf8N20Bh1BU4JTxXxNjdhONY(com.paypal.oslo.feature.settings.ui.mvi.SettingsState.this, z, function1, modifier4, lazyListState3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$DgO_OXbdlPQKUju1YoMBneTI91U(com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel settingsViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function2 function2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SettingsScreen(settingsViewModel, appNavigator, modifier, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HyFYWeifGPESdDFSEUgrdVqWTgs(com.paypal.oslo.feature.settings.ui.mvi.SettingsState settingsState, boolean z, kotlin.jvm.functions.Function1 function1, androidx.compose.foundation.lazy.LazyListScope lazyListScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListScope, "");
        com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState sectionState = settingsState.getSections().get(com.paypal.oslo.feature.settings.domain.model.SettingSection.ACCOUNT);
        if (sectionState != null) {
            if (sectionState instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Loaded) {
                com.paypal.oslo.feature.settings.ui.components.SettingsSectionComponentKt.settingsSection(lazyListScope, ((com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Loaded) sectionState).getData(), com.paypal.oslo.feature.settings.api.analytics.SettingsAnalyticsConstants.Module.INSTANCE.getPROFILE(), function1);
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(sectionState, com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Loading.INSTANCE)) {
                com.paypal.oslo.feature.settings.ui.components.SettingsSectionComponentKt.settingsSectionLoading(lazyListScope);
            }
        }
        com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState sectionState2 = settingsState.getSections().get(com.paypal.oslo.feature.settings.domain.model.SettingSection.PAYMENT_PREFERENCES);
        if (sectionState2 != null && (sectionState2 instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Loaded)) {
            com.paypal.oslo.feature.settings.ui.components.SettingsSectionComponentKt.settingsSection(lazyListScope, ((com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Loaded) sectionState2).getData(), com.paypal.oslo.feature.settings.api.analytics.SettingsAnalyticsConstants.Module.INSTANCE.getPAYMENTS(), function1);
        }
        com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState sectionState3 = settingsState.getSections().get(com.paypal.oslo.feature.settings.domain.model.SettingSection.DATA_PRIVACY);
        if (sectionState3 != null && (sectionState3 instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Loaded)) {
            com.paypal.oslo.feature.settings.ui.components.SettingsSectionComponentKt.settingsSection(lazyListScope, ((com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Loaded) sectionState3).getData(), com.paypal.oslo.feature.settings.api.analytics.SettingsAnalyticsConstants.Module.INSTANCE.getSECURITY_AND_PRIVACY(), function1);
        }
        com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState sectionState4 = settingsState.getSections().get(com.paypal.oslo.feature.settings.domain.model.SettingSection.NOTIFICATIONS);
        if (sectionState4 != null && (sectionState4 instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Loaded)) {
            com.paypal.oslo.feature.settings.ui.components.SettingsSectionComponentKt.settingsSection(lazyListScope, ((com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Loaded) sectionState4).getData(), com.paypal.oslo.feature.settings.api.analytics.SettingsAnalyticsConstants.Module.INSTANCE.getNOTIFICATIONS(), function1);
        }
        com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState sectionState5 = settingsState.getSections().get(com.paypal.oslo.feature.settings.domain.model.SettingSection.HELP_SUPPORT);
        if (sectionState5 != null && (sectionState5 instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Loaded)) {
            com.paypal.oslo.feature.settings.ui.components.SettingsSectionComponentKt.settingsSection(lazyListScope, ((com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Loaded) sectionState5).getData(), com.paypal.oslo.feature.settings.api.analytics.SettingsAnalyticsConstants.Module.INSTANCE.getSUPPORT(), function1);
        }
        com.paypal.oslo.feature.settings.ui.components.SettingsFooterSectionKt.footerContentSection(lazyListScope, settingsState.getAppVersion(), settingsState.getLogoutState(), z, function1);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Ker8U0MYw-zlIgH3Crb3CLD5ow0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19302$r8$lambda$Ker8U0MYwzlIgH3Crb3CLD5ow0(androidx.compose.runtime.MutableState mutableState, boolean z) {
        if (!z) {
            mutableState.setValue(java.lang.Boolean.FALSE);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState $r8$lambda$Ma4r3cKnK4LQERRpFJhmpynzWC0(androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceGroup(-160095650);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-160095650, i, -1, "com.paypal.oslo.feature.settings.ui.screens.SettingsScreen.<anonymous> (SettingsScreen.kt:89)");
        }
        com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState rememberPushOptInState = com.paypal.oslo.feature.pushnotification.api.optin.RememberPushOptInStateKt.rememberPushOptInState(com.paypal.oslo.feature.settings.ui.util.SettingsNotificationsOptInSource.INSTANCE, composer, 6, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return rememberPushOptInState;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NwqG0vFAPhOvyoskPpEdYMhOgUo(com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel settingsViewModel, com.paypal.oslo.feature.settings.ui.mvi.SettingsState settingsState, com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SettingsScreenWithEffects(settingsViewModel, settingsState, appNavigator, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PH7IGqBqbVRL2MaLjLdnNz6C834(com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel settingsViewModel) {
        settingsViewModel.onIntent(com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.RefreshPendingItems.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$VZklhwN-D1BbagUjzppWC4br4j4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19303$r8$lambda$VZklhwND1BbagUjzppWC4br4j4(com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel settingsViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.State state, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1683868455, i, -1, "com.paypal.oslo.feature.settings.ui.screens.SettingsScreen.<anonymous> (SettingsScreen.kt:96)");
            }
            SettingsScreenWithEffects(settingsViewModel, (com.paypal.oslo.feature.settings.ui.mvi.SettingsState) state.getValue(), appNavigator, modifier, composer, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YizPZ2k4pJ3Bo0SueXka88NJ79I(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.LoadSettings.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$aCW8_J5rhGUdSedjDB5zSLH8lyI(com.paypal.oslo.feature.settings.ui.mvi.SettingsState settingsState, boolean z, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SettingsScreenContent(settingsState, z, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$od9lf8N20Bh1BU4JTxXxNjdhONY(com.paypal.oslo.feature.settings.ui.mvi.SettingsState settingsState, boolean z, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, androidx.compose.foundation.lazy.LazyListState lazyListState, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SettingsScreenReady(settingsState, z, function1, modifier, lazyListState, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$uKZHzgWoGSB-k1Oi84bkdxQHQdU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19304$r8$lambda$uKZHzgWoGSBk1Oi84bkdxQHQdU(final com.paypal.oslo.feature.settings.ui.mvi.SettingsState settingsState, int i, androidx.compose.runtime.Composer composer, int i2) {
        int i3;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(908513615);
        if ((updateChangedFlags & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(settingsState) ? 4 : 2) | updateChangedFlags;
        } else {
            i3 = updateChangedFlags;
        }
        if (!startRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(908513615, i3, -1, "com.paypal.oslo.feature.settings.ui.screens.SettingsStateContainerPreview (SettingsScreen.kt:362)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt.m19306$r8$lambda$zRcfcz1tpYV3H8EHpvt3JA6NDE((com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            SettingsScreenContent(settingsState, false, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, (i3 & 14) | 432, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt.m19304$r8$lambda$uKZHzgWoGSBk1Oi84bkdxQHQdU(com.paypal.oslo.feature.settings.ui.mvi.SettingsState.this, updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$z75CCMWC53R74l8ph-ikH0ytJdw, reason: not valid java name */
    public static /* synthetic */ androidx.compose.runtime.DisposableEffectResult m19305$r8$lambda$z75CCMWC53R74l8phikH0ytJdw(final kotlin.jvm.functions.Function1 function1, final androidx.compose.foundation.lazy.LazyListState lazyListState, androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disposableEffectScope, "");
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt$SettingsScreenReady$lambda$1$0$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                kotlin.jvm.functions.Function1.this.invoke(new com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.OnListScroll(kotlin.TuplesKt.to(java.lang.Integer.valueOf(lazyListState.getFirstVisibleItemIndex()), java.lang.Integer.valueOf(lazyListState.getFirstVisibleItemScrollOffset()))));
            }
        };
    }

    /* renamed from: $r8$lambda$zRcfcz1tp-YV3H8EHpvt3JA6NDE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19306$r8$lambda$zRcfcz1tpYV3H8EHpvt3JA6NDE(com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent settingsEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsEvent, "");
        return kotlin.Unit.INSTANCE;
    }
}
