package com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup;

@kotlin.Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0001\u001a\u0017\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010\u0010\u001aK\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010\u001b¨\u0006\u001c²\u0006\n\u0010\u001d\u001a\u00020\u001eX\u008a\u0084\u0002"}, d2 = {"PushProvisionSetupScreen", "", "appNavigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "debitInstrument", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;", "viewModel", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/PushProvisioningSetupViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/PushProvisioningSetupViewModel;Landroidx/compose/runtime/Composer;II)V", "mapPinResultToEvent", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/mvi/PushProvisioningSetupEvent;", "result", "Lcom/paypal/oslo/feature/debitcard/servicing/navigation/result/DebitPinNavResult;", "LoadingContent", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ErrorContent", "errorType", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "retryCount", "", "onRetry", "Lkotlin/Function0;", "onDismiss", "userIntent", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "debit-card_prodRelease", "uiState", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/mvi/PushProvisioningSetupState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PushProvisioningSetupScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0209  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PushProvisionSetupScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupViewModel pushProvisioningSetupViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupViewModel pushProvisioningSetupViewModel2;
        androidx.compose.runtime.Composer composer2;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i4;
        com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupViewModel pushProvisioningSetupViewModel3;
        final com.paypal.oslo.feature.starpay.api.StarPayClient rememberStarPayClient;
        androidx.compose.runtime.State collectAsStateWithLifecycle;
        boolean changedInstance;
        boolean changedInstance2;
        java.lang.Object rememberedValue;
        androidx.view.compose.ManagedActivityResultLauncher rememberLauncherForActivityResult;
        com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntent;
        boolean changedInstance3;
        boolean changedInstance4;
        boolean changedInstance5;
        boolean changedInstance6;
        com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupScreenKt$PushProvisionSetupScreen$1$1 rememberedValue2;
        int i5;
        com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupViewModel pushProvisioningSetupViewModel4;
        com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient;
        com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient2;
        boolean changed;
        boolean changedInstance7;
        com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupScreenKt$PushProvisionSetupScreen$2$1 rememberedValue3;
        com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupViewModel pushProvisioningSetupViewModel5;
        boolean changedInstance8;
        com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupScreenKt$PushProvisionSetupScreen$3$1 rememberedValue4;
        com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupScreenKt$PushProvisionSetupScreen$$inlined$NavResultEffectrtGRyWw$1 rememberedValue5;
        boolean changedInstance9;
        boolean z;
        boolean changedInstance10;
        boolean changed2;
        final androidx.view.compose.ManagedActivityResultLauncher managedActivityResultLauncher;
        androidx.compose.ui.Modifier modifier;
        com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupViewModel pushProvisioningSetupViewModel6;
        int i6;
        com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext;
        final com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient3;
        com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupScreenKt$PushProvisionSetupScreen$4$1 pushProvisioningSetupScreenKt$PushProvisionSetupScreen$4$1;
        com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupState pushProvisioningSetupState;
        int i7;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrument, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2127573046);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(debitInstrument) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                pushProvisioningSetupViewModel2 = pushProvisioningSetupViewModel;
                if (startRestartGroup.changedInstance(pushProvisioningSetupViewModel2)) {
                    i7 = 256;
                    i3 |= i7;
                }
            } else {
                pushProvisioningSetupViewModel2 = pushProvisioningSetupViewModel;
            }
            i7 = 128;
            i3 |= i7;
        } else {
            pushProvisioningSetupViewModel2 = pushProvisioningSetupViewModel;
        }
        if (startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                    i4 = 0;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    rememberStarPayClient = com.paypal.oslo.feature.starpay.api.StarPayClientProviderKt.rememberStarPayClient(startRestartGroup, i4);
                    collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(pushProvisioningSetupViewModel2.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                    androidx.activity.result.contract.ActivityResultContracts.StartIntentSenderForResult startIntentSenderForResult = new androidx.activity.result.contract.ActivityResultContracts.StartIntentSenderForResult();
                    changedInstance = startRestartGroup.changedInstance(pushProvisioningSetupViewModel2);
                    changedInstance2 = startRestartGroup.changedInstance(rememberStarPayClient);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!(changedInstance | changedInstance2)) {
                    }
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupScreenKt.m14273$r8$lambda$9zfBaIdiXvfos24aRZRW6VT4hM(com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupViewModel.this, rememberStarPayClient, (androidx.view.result.ActivityResult) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    rememberLauncherForActivityResult = androidx.view.compose.ActivityResultRegistryKt.rememberLauncherForActivityResult(startIntentSenderForResult, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, i4);
                    java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, i4);
                    userIntent = com.paypal.oslo.feature.debitcard.shared.analytics.PushProvisioningSetupAnalytics.INSTANCE.getUserIntent(debitInstrument.getProductName());
                    changedInstance3 = startRestartGroup.changedInstance(pushProvisioningSetupViewModel2);
                    changedInstance4 = startRestartGroup.changedInstance(rememberStarPayClient);
                    changedInstance5 = startRestartGroup.changedInstance(debitInstrument);
                    changedInstance6 = startRestartGroup.changedInstance(rememberLauncherForActivityResult);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!(changedInstance3 | changedInstance4 | changedInstance5 | changedInstance6)) {
                    }
                    i5 = i3;
                    pushProvisioningSetupViewModel4 = pushProvisioningSetupViewModel2;
                    starPayClient = rememberStarPayClient;
                    composer2 = startRestartGroup;
                    rememberedValue2 = new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupScreenKt$PushProvisionSetupScreen$1$1(pushProvisioningSetupViewModel2, rememberStarPayClient, debitInstrument, rememberLauncherForActivityResult, null);
                    composer2.updateRememberedValue(rememberedValue2);
                    starPayClient2 = starPayClient;
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(starPayClient2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, composer2, 0);
                    kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(((com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupState) collectAsStateWithLifecycle.getValue()).getClass());
                    changed = composer2.changed(collectAsStateWithLifecycle);
                    changedInstance7 = composer2.changedInstance(userIntent);
                    rememberedValue3 = composer2.rememberedValue();
                    if (!(changed | changedInstance7)) {
                    }
                    rememberedValue3 = new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupScreenKt$PushProvisionSetupScreen$2$1(userIntent, collectAsStateWithLifecycle, null);
                    composer2.updateRememberedValue(rememberedValue3);
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(orCreateKotlinClass, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, composer2, 0);
                    pushProvisioningSetupViewModel5 = pushProvisioningSetupViewModel4;
                    changedInstance8 = composer2.changedInstance(pushProvisioningSetupViewModel5);
                    rememberedValue4 = composer2.rememberedValue();
                    if (!changedInstance8) {
                    }
                    rememberedValue4 = new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupScreenKt$PushProvisionSetupScreen$3$1(pushProvisioningSetupViewModel5, null);
                    composer2.updateRememberedValue(rememberedValue4);
                    kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue4;
                    com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, composer2, 0);
                    rememberedValue5 = composer2.rememberedValue();
                    if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    }
                    com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue5, composer2, 3072);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    changedInstance9 = composer2.changedInstance(pushProvisioningSetupViewModel5);
                    if ((i5 & 14) == 4) {
                    }
                    changedInstance10 = composer2.changedInstance(userIntent);
                    changed2 = composer2.changed(rememberNavResultRequestId);
                    java.lang.Object rememberedValue6 = composer2.rememberedValue();
                    if (!(changedInstance9 | z | changedInstance10 | changed2)) {
                    }
                    managedActivityResultLauncher = rememberLauncherForActivityResult;
                    modifier = null;
                    pushProvisioningSetupViewModel6 = pushProvisioningSetupViewModel5;
                    i6 = 0;
                    userIntentContext = userIntent;
                    starPayClient3 = starPayClient2;
                    pushProvisioningSetupScreenKt$PushProvisionSetupScreen$4$1 = new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupScreenKt$PushProvisionSetupScreen$4$1(pushProvisioningSetupViewModel5, appNavigator, userIntent, rememberNavResultRequestId, null);
                    composer2.updateRememberedValue(pushProvisioningSetupScreenKt$PushProvisionSetupScreen$4$1);
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) pushProvisioningSetupScreenKt$PushProvisionSetupScreen$4$1, composer2, 6);
                    pushProvisioningSetupState = (com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupState) collectAsStateWithLifecycle.getValue();
                    if (pushProvisioningSetupState instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupState.Loading) {
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                }
            } else if ((i2 & 4) != 0) {
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
                pushProvisioningSetupViewModel3 = (com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                i3 &= -897;
                pushProvisioningSetupViewModel2 = pushProvisioningSetupViewModel3;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-2127573046, i3, -1, "com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisionSetupScreen (PushProvisioningSetupScreen.kt:87)");
                }
                rememberStarPayClient = com.paypal.oslo.feature.starpay.api.StarPayClientProviderKt.rememberStarPayClient(startRestartGroup, i4);
                collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(pushProvisioningSetupViewModel2.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                androidx.activity.result.contract.ActivityResultContracts.StartIntentSenderForResult startIntentSenderForResult2 = new androidx.activity.result.contract.ActivityResultContracts.StartIntentSenderForResult();
                changedInstance = startRestartGroup.changedInstance(pushProvisioningSetupViewModel2);
                changedInstance2 = startRestartGroup.changedInstance(rememberStarPayClient);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!(changedInstance | changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupScreenKt.m14273$r8$lambda$9zfBaIdiXvfos24aRZRW6VT4hM(com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupViewModel.this, rememberStarPayClient, (androidx.view.result.ActivityResult) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                rememberLauncherForActivityResult = androidx.view.compose.ActivityResultRegistryKt.rememberLauncherForActivityResult(startIntentSenderForResult2, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, i4);
                java.lang.String rememberNavResultRequestId2 = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, i4);
                userIntent = com.paypal.oslo.feature.debitcard.shared.analytics.PushProvisioningSetupAnalytics.INSTANCE.getUserIntent(debitInstrument.getProductName());
                changedInstance3 = startRestartGroup.changedInstance(pushProvisioningSetupViewModel2);
                changedInstance4 = startRestartGroup.changedInstance(rememberStarPayClient);
                changedInstance5 = startRestartGroup.changedInstance(debitInstrument);
                changedInstance6 = startRestartGroup.changedInstance(rememberLauncherForActivityResult);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if ((!(changedInstance3 | changedInstance4 | changedInstance5) && !changedInstance6) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    i5 = i3;
                    pushProvisioningSetupViewModel4 = pushProvisioningSetupViewModel2;
                    starPayClient = rememberStarPayClient;
                    composer2 = startRestartGroup;
                    rememberedValue2 = new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupScreenKt$PushProvisionSetupScreen$1$1(pushProvisioningSetupViewModel2, rememberStarPayClient, debitInstrument, rememberLauncherForActivityResult, null);
                    composer2.updateRememberedValue(rememberedValue2);
                } else {
                    starPayClient = rememberStarPayClient;
                    i5 = i3;
                    pushProvisioningSetupViewModel4 = pushProvisioningSetupViewModel2;
                    composer2 = startRestartGroup;
                }
                starPayClient2 = starPayClient;
                androidx.compose.runtime.EffectsKt.LaunchedEffect(starPayClient2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, composer2, 0);
                kotlin.reflect.KClass orCreateKotlinClass2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(((com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupState) collectAsStateWithLifecycle.getValue()).getClass());
                changed = composer2.changed(collectAsStateWithLifecycle);
                changedInstance7 = composer2.changedInstance(userIntent);
                rememberedValue3 = composer2.rememberedValue();
                if (!(changed | changedInstance7) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupScreenKt$PushProvisionSetupScreen$2$1(userIntent, collectAsStateWithLifecycle, null);
                    composer2.updateRememberedValue(rememberedValue3);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(orCreateKotlinClass2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, composer2, 0);
                pushProvisioningSetupViewModel5 = pushProvisioningSetupViewModel4;
                changedInstance8 = composer2.changedInstance(pushProvisioningSetupViewModel5);
                rememberedValue4 = composer2.rememberedValue();
                if (!changedInstance8 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupScreenKt$PushProvisionSetupScreen$3$1(pushProvisioningSetupViewModel5, null);
                    composer2.updateRememberedValue(rememberedValue4);
                }
                kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) rememberedValue4;
                com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager2 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, composer2, 0);
                rememberedValue5 = composer2.rememberedValue();
                if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupScreenKt$PushProvisionSetupScreen$$inlined$NavResultEffect-rtGRyWw$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                            return m14274invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                        }

                        /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                        public final kotlinx.coroutines.flow.Flow<java.lang.Object> m14274invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                            return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue5);
                }
                com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId2, resolveNavResultManager2, function22, (kotlin.jvm.functions.Function2) rememberedValue5, composer2, 3072);
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                changedInstance9 = composer2.changedInstance(pushProvisioningSetupViewModel5);
                z = (i5 & 14) == 4;
                changedInstance10 = composer2.changedInstance(userIntent);
                changed2 = composer2.changed(rememberNavResultRequestId2);
                java.lang.Object rememberedValue62 = composer2.rememberedValue();
                if ((!(changedInstance9 | z | changedInstance10) && !changed2) || rememberedValue62 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    managedActivityResultLauncher = rememberLauncherForActivityResult;
                    modifier = null;
                    pushProvisioningSetupViewModel6 = pushProvisioningSetupViewModel5;
                    i6 = 0;
                    userIntentContext = userIntent;
                    starPayClient3 = starPayClient2;
                    pushProvisioningSetupScreenKt$PushProvisionSetupScreen$4$1 = new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupScreenKt$PushProvisionSetupScreen$4$1(pushProvisioningSetupViewModel5, appNavigator, userIntent, rememberNavResultRequestId2, null);
                    composer2.updateRememberedValue(pushProvisioningSetupScreenKt$PushProvisionSetupScreen$4$1);
                } else {
                    modifier = null;
                    pushProvisioningSetupViewModel6 = pushProvisioningSetupViewModel5;
                    i6 = 0;
                    userIntentContext = userIntent;
                    pushProvisioningSetupScreenKt$PushProvisionSetupScreen$4$1 = rememberedValue62;
                    starPayClient3 = starPayClient2;
                    managedActivityResultLauncher = rememberLauncherForActivityResult;
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) pushProvisioningSetupScreenKt$PushProvisionSetupScreen$4$1, composer2, 6);
                pushProvisioningSetupState = (com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupState) collectAsStateWithLifecycle.getValue();
                if (pushProvisioningSetupState instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupState.Loading) {
                    composer2.startReplaceGroup(-1692009072);
                    getHighResolutionOutputSizeshNQ4ISI(modifier, composer2, i6, 1);
                    composer2.endReplaceGroup();
                    pushProvisioningSetupViewModel2 = pushProvisioningSetupViewModel6;
                } else if (!(pushProvisioningSetupState instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupState.Error)) {
                    pushProvisioningSetupViewModel2 = pushProvisioningSetupViewModel6;
                    composer2.startReplaceGroup(-1691077305);
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(-1691897162);
                    com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupState pushProvisioningSetupState2 = (com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupState) collectAsStateWithLifecycle.getValue();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(pushProvisioningSetupState2, "");
                    com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupState.Error error = (com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupState.Error) pushProvisioningSetupState2;
                    com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType = error.getErrorType();
                    int retryCount = error.getRetryCount();
                    pushProvisioningSetupViewModel2 = pushProvisioningSetupViewModel6;
                    boolean changedInstance11 = composer2.changedInstance(pushProvisioningSetupViewModel2);
                    boolean changedInstance12 = composer2.changedInstance(starPayClient3);
                    boolean changedInstance13 = composer2.changedInstance(debitInstrument);
                    boolean changedInstance14 = composer2.changedInstance(managedActivityResultLauncher);
                    java.lang.Object rememberedValue7 = composer2.rememberedValue();
                    if ((changedInstance11 | changedInstance12 | changedInstance13 | changedInstance14) || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupScreenKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupScreenKt.$r8$lambda$WQ6qLQZCDyeJRaCMwFN6ul5brsA(com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupViewModel.this, starPayClient3, debitInstrument, managedActivityResultLauncher);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue7);
                    }
                    kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue7;
                    boolean changedInstance15 = composer2.changedInstance(pushProvisioningSetupViewModel2);
                    java.lang.Object rememberedValue8 = composer2.rememberedValue();
                    if (changedInstance15 || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue8 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupScreenKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupScreenKt.m14271$r8$lambda$1YZbQdCJgyjQJLp8h81B2NNHiU(com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupViewModel.this);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue8);
                    }
                    Camera2StreamConfigurationMap(errorType, retryCount, function0, (kotlin.jvm.functions.Function0) rememberedValue8, userIntentContext, null, composer2, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable << 12, 32);
                    composer2.endReplaceGroup();
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            i4 = 0;
            pushProvisioningSetupViewModel3 = pushProvisioningSetupViewModel2;
            pushProvisioningSetupViewModel2 = pushProvisioningSetupViewModel3;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            rememberStarPayClient = com.paypal.oslo.feature.starpay.api.StarPayClientProviderKt.rememberStarPayClient(startRestartGroup, i4);
            collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(pushProvisioningSetupViewModel2.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            androidx.activity.result.contract.ActivityResultContracts.StartIntentSenderForResult startIntentSenderForResult22 = new androidx.activity.result.contract.ActivityResultContracts.StartIntentSenderForResult();
            changedInstance = startRestartGroup.changedInstance(pushProvisioningSetupViewModel2);
            changedInstance2 = startRestartGroup.changedInstance(rememberStarPayClient);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!(changedInstance | changedInstance2)) {
            }
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupScreenKt.m14273$r8$lambda$9zfBaIdiXvfos24aRZRW6VT4hM(com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupViewModel.this, rememberStarPayClient, (androidx.view.result.ActivityResult) obj);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            rememberLauncherForActivityResult = androidx.view.compose.ActivityResultRegistryKt.rememberLauncherForActivityResult(startIntentSenderForResult22, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, i4);
            java.lang.String rememberNavResultRequestId22 = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, i4);
            userIntent = com.paypal.oslo.feature.debitcard.shared.analytics.PushProvisioningSetupAnalytics.INSTANCE.getUserIntent(debitInstrument.getProductName());
            changedInstance3 = startRestartGroup.changedInstance(pushProvisioningSetupViewModel2);
            changedInstance4 = startRestartGroup.changedInstance(rememberStarPayClient);
            changedInstance5 = startRestartGroup.changedInstance(debitInstrument);
            changedInstance6 = startRestartGroup.changedInstance(rememberLauncherForActivityResult);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!(changedInstance3 | changedInstance4 | changedInstance5 | changedInstance6)) {
            }
            i5 = i3;
            pushProvisioningSetupViewModel4 = pushProvisioningSetupViewModel2;
            starPayClient = rememberStarPayClient;
            composer2 = startRestartGroup;
            rememberedValue2 = new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupScreenKt$PushProvisionSetupScreen$1$1(pushProvisioningSetupViewModel2, rememberStarPayClient, debitInstrument, rememberLauncherForActivityResult, null);
            composer2.updateRememberedValue(rememberedValue2);
            starPayClient2 = starPayClient;
            androidx.compose.runtime.EffectsKt.LaunchedEffect(starPayClient2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, composer2, 0);
            kotlin.reflect.KClass orCreateKotlinClass22 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(((com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupState) collectAsStateWithLifecycle.getValue()).getClass());
            changed = composer2.changed(collectAsStateWithLifecycle);
            changedInstance7 = composer2.changedInstance(userIntent);
            rememberedValue3 = composer2.rememberedValue();
            if (!(changed | changedInstance7)) {
            }
            rememberedValue3 = new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupScreenKt$PushProvisionSetupScreen$2$1(userIntent, collectAsStateWithLifecycle, null);
            composer2.updateRememberedValue(rememberedValue3);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(orCreateKotlinClass22, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, composer2, 0);
            pushProvisioningSetupViewModel5 = pushProvisioningSetupViewModel4;
            changedInstance8 = composer2.changedInstance(pushProvisioningSetupViewModel5);
            rememberedValue4 = composer2.rememberedValue();
            if (!changedInstance8) {
            }
            rememberedValue4 = new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupScreenKt$PushProvisionSetupScreen$3$1(pushProvisioningSetupViewModel5, null);
            composer2.updateRememberedValue(rememberedValue4);
            kotlin.jvm.functions.Function2 function222 = (kotlin.jvm.functions.Function2) rememberedValue4;
            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager22 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, composer2, 0);
            rememberedValue5 = composer2.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId22, resolveNavResultManager22, function222, (kotlin.jvm.functions.Function2) rememberedValue5, composer2, 3072);
            kotlin.Unit unit22 = kotlin.Unit.INSTANCE;
            changedInstance9 = composer2.changedInstance(pushProvisioningSetupViewModel5);
            if ((i5 & 14) == 4) {
            }
            changedInstance10 = composer2.changedInstance(userIntent);
            changed2 = composer2.changed(rememberNavResultRequestId22);
            java.lang.Object rememberedValue622 = composer2.rememberedValue();
            if (!(changedInstance9 | z | changedInstance10 | changed2)) {
            }
            managedActivityResultLauncher = rememberLauncherForActivityResult;
            modifier = null;
            pushProvisioningSetupViewModel6 = pushProvisioningSetupViewModel5;
            i6 = 0;
            userIntentContext = userIntent;
            starPayClient3 = starPayClient2;
            pushProvisioningSetupScreenKt$PushProvisionSetupScreen$4$1 = new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupScreenKt$PushProvisionSetupScreen$4$1(pushProvisioningSetupViewModel5, appNavigator, userIntent, rememberNavResultRequestId22, null);
            composer2.updateRememberedValue(pushProvisioningSetupScreenKt$PushProvisionSetupScreen$4$1);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit22, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) pushProvisioningSetupScreenKt$PushProvisionSetupScreen$4$1, composer2, 6);
            pushProvisioningSetupState = (com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupState) collectAsStateWithLifecycle.getValue();
            if (pushProvisioningSetupState instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupState.Loading) {
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        final com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupViewModel pushProvisioningSetupViewModel7 = pushProvisioningSetupViewModel2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupScreenKt.m14272$r8$lambda$8z1Ssw5OGV0T2fW0qQ7_8OMUxQ(com.paypal.oslo.core.navigation.AppNavigator.this, debitInstrument, pushProvisioningSetupViewModel7, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent mapPinResultToEvent(com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitPinNavResult debitPinNavResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitPinNavResult, "");
        if (debitPinNavResult.isPinSet()) {
            return com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.PinSetUpCompleted.INSTANCE;
        }
        return com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.PinSetUpFailed.INSTANCE;
    }

    private static final void getHighResolutionOutputSizeshNQ4ISI(final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1807658713);
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
                androidx.compose.runtime.ComposerKt.traceEventStart(-1807658713, i3, -1, "com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.LoadingContent (PushProvisioningSetupScreen.kt:234)");
            }
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
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
            com.paypal.pds.components.LoaderKt.Loader(androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getCenter()), com.paypal.pds.components.LoaderSize.Large.INSTANCE, null, null, startRestartGroup, com.paypal.pds.components.LoaderSize.Large.$stable << 3, 12);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupScreenKt.$r8$lambda$FjwwvAu7VtjdGeuE3ab5M__IPtU(androidx.compose.ui.Modifier.this, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void Camera2StreamConfigurationMap(final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, final int i, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        int i4;
        androidx.compose.ui.Modifier modifier2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1466741806);
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(debitErrorType.ordinal()) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= (32768 & i2) == 0 ? startRestartGroup.changed(userIntentContext) : startRestartGroup.changedInstance(userIntentContext) ? 16384 : 8192;
        }
        int i5 = i3 & 32;
        if (i5 != 0) {
            i4 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((196608 & i2) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 131072 : 65536;
            if (startRestartGroup.shouldExecute((74899 & i4) == 74898, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1466741806, i4, -1, "com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.ErrorContent (PushProvisioningSetupScreen.kt:262)");
                }
                int i6 = i4 >> 3;
                com.paypal.oslo.feature.debitcard.shared.ui.components.DebitErrorScreenKt.DebitErrorScreen(debitErrorType, function0, function02, userIntentContext, androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding(modifier4), false, java.lang.Integer.valueOf(i), null, startRestartGroup, (i6 & 7168) | (com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable << 9) | (i4 & 14) | (i6 & 112) | (i6 & 896) | ((i4 << 15) & 3670016), 160);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupScreenKt.$r8$lambda$a5U8vkPa0lMAsWqJSmDWjgYAU0s(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.this, i, function0, function02, userIntentContext, modifier3, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((74899 & i4) == 74898, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$1YZbQdCJgyjQJLp8h-81B2NNHiU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14271$r8$lambda$1YZbQdCJgyjQJLp8h81B2NNHiU(com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupViewModel pushProvisioningSetupViewModel) {
        pushProvisioningSetupViewModel.processEvent(com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.CloseButtonClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$8z1Ssw5OG-V0T2fW0qQ7_8OMUxQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14272$r8$lambda$8z1Ssw5OGV0T2fW0qQ7_8OMUxQ(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupViewModel pushProvisioningSetupViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PushProvisionSetupScreen(appNavigator, debitInstrument, pushProvisioningSetupViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$9zfBaIdiXvfos24aRZRW6VT4-hM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14273$r8$lambda$9zfBaIdiXvfos24aRZRW6VT4hM(com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupViewModel pushProvisioningSetupViewModel, com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient, androidx.view.result.ActivityResult activityResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResult, "");
        pushProvisioningSetupViewModel.onActivityResult(starPayClient, activityResult.getResultCode(), activityResult.getData());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$FjwwvAu7VtjdGeuE3ab5M__IPtU(androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighResolutionOutputSizeshNQ4ISI(modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WQ6qLQZCDyeJRaCMwFN6ul5brsA(com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupViewModel pushProvisioningSetupViewModel, com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, androidx.view.compose.ManagedActivityResultLauncher managedActivityResultLauncher) {
        pushProvisioningSetupViewModel.processEvent(new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.RetryPushProvisioning(starPayClient, debitInstrument, managedActivityResultLauncher));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$a5U8vkPa0lMAsWqJSmDWjgYAU0s(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, int i, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, androidx.compose.ui.Modifier modifier, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        Camera2StreamConfigurationMap(debitErrorType, i, function0, function02, userIntentContext, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupState access$PushProvisionSetupScreen$lambda$0(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupState) state.getValue();
    }
}
