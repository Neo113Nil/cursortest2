package com.paypal.oslo.feature.checkcapture.ui;

@kotlin.Metadata(d1 = {"\u0000h\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001aW\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0001¢\u0006\u0002\u0010\u0012\u001a~\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032!\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00010\u00182\u0006\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010!\u001a\u0017\u0010\"\u001a\u00020\u00192\b\u0010#\u001a\u0004\u0018\u00010$H\u0003¢\u0006\u0002\u0010%\u001a\r\u0010&\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010'\u001a\u001a\u0010(\u001a\u00020\u00012\b\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010\f\u001a\u00020\rH\u0000¨\u0006+²\u0006\n\u0010\u0014\u001a\u00020\u0015X\u008a\u0084\u0002"}, d2 = {"CheckCaptureScreen", "", "onNavigateBack", "Lkotlin/Function0;", "viewModel", "Lcom/paypal/oslo/feature/checkcapture/ui/viewmodel/CheckCaptureViewModel;", "configManager", "Lcom/paypal/oslo/feature/checkcapture/domain/remoteconfig/CheckCaptureConfig$Manager;", "ingoSdkLauncher", "Lcom/paypal/oslo/feature/checkcapture/ingo/IngoSdkLauncher;", "ingoResultHandler", "Lcom/paypal/oslo/feature/checkcapture/ingo/IngoResultHandler;", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "modifier", "Landroidx/compose/ui/Modifier;", "permissionController", "Lcom/paypal/oslo/core/permission/ui/controller/PermissionController;", "(Lkotlin/jvm/functions/Function0;Lcom/paypal/oslo/feature/checkcapture/ui/viewmodel/CheckCaptureViewModel;Lcom/paypal/oslo/feature/checkcapture/domain/remoteconfig/CheckCaptureConfig$Manager;Lcom/paypal/oslo/feature/checkcapture/ingo/IngoSdkLauncher;Lcom/paypal/oslo/feature/checkcapture/ingo/IngoResultHandler;Lcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/core/permission/ui/controller/PermissionController;Landroidx/compose/runtime/Composer;II)V", "CheckCaptureContent", "state", "Lcom/paypal/oslo/feature/checkcapture/ui/mvi/CheckCaptureState;", "onProceedFromLanding", "onLinkClick", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "url", "privacyPolicyUrl", "termsAndConditionsUrl", "flowContext", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/BusinessFlowContext;", "(Lcom/paypal/oslo/feature/checkcapture/ui/mvi/CheckCaptureState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/checkcapture/ui/viewmodel/CheckCaptureViewModel;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/BusinessFlowContext;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "getErrorMessage", "errorType", "Lcom/paypal/oslo/feature/checkcapture/ui/mvi/CheckCaptureErrorType;", "(Lcom/paypal/oslo/feature/checkcapture/ui/mvi/CheckCaptureErrorType;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "LoadingScreen", "(Landroidx/compose/runtime/Composer;I)V", "handleIngoActivityResult", "ingoResult", "Lcom/ingo/sdk/kotlin/common/model/result/IngoSdkResult;", "check-capture_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CheckCaptureScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CheckCaptureScreen(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final com.paypal.oslo.feature.checkcapture.ui.viewmodel.CheckCaptureViewModel checkCaptureViewModel, final com.paypal.oslo.feature.checkcapture.domain.remoteconfig.CheckCaptureConfig.Manager manager, final com.paypal.oslo.feature.checkcapture.ingo.IngoSdkLauncher ingoSdkLauncher, final com.paypal.oslo.feature.checkcapture.ingo.IngoResultHandler ingoResultHandler, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, com.paypal.oslo.core.permission.ui.controller.PermissionController permissionController, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        com.paypal.oslo.core.permission.ui.controller.PermissionController permissionController2;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        final com.paypal.oslo.core.permission.ui.controller.PermissionController permissionController3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        com.paypal.oslo.core.permission.ui.controller.PermissionController rememberPermissionController;
        int i4;
        androidx.compose.ui.Modifier modifier4;
        boolean changed;
        java.lang.Object rememberedValue;
        boolean changedInstance;
        com.paypal.oslo.feature.checkcapture.ui.CheckCaptureScreenKt$CheckCaptureScreen$1$1 rememberedValue2;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkCaptureViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ingoSdkLauncher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ingoResultHandler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1177822361);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(checkCaptureViewModel) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? startRestartGroup.changed(manager) : startRestartGroup.changedInstance(manager) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(ingoSdkLauncher) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changed(ingoResultHandler) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changed(appNavigator) ? 131072 : 65536;
        }
        int i6 = i2 & 64;
        if (i6 != 0) {
            i3 |= 1572864;
        } else if ((1572864 & i) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 1048576 : 524288;
            if ((12582912 & i) != 0) {
                if ((i2 & 128) == 0) {
                    permissionController2 = permissionController;
                    if (startRestartGroup.changedInstance(permissionController2)) {
                        i5 = 8388608;
                        i3 |= i5;
                    }
                } else {
                    permissionController2 = permissionController;
                }
                i5 = 4194304;
                i3 |= i5;
            } else {
                permissionController2 = permissionController;
            }
            if (!startRestartGroup.shouldExecute((4793491 & i3) == 4793490, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 128) != 0) {
                        i3 &= -29360129;
                    }
                } else {
                    androidx.compose.ui.Modifier.Companion companion = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if ((i2 & 128) != 0) {
                        rememberPermissionController = com.paypal.oslo.core.permission.ui.controller.RememberPermissionControllerKt.rememberPermissionController(startRestartGroup, 0);
                        i4 = i3 & (-29360129);
                        modifier4 = companion;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(1177822361, i4, -1, "com.paypal.oslo.feature.checkcapture.ui.CheckCaptureScreen (CheckCaptureScreen.kt:63)");
                        }
                        composer2 = startRestartGroup;
                        androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(checkCaptureViewModel.getState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                        changed = composer2.changed(checkCaptureViewModel.getFlowAttemptId());
                        rememberedValue = composer2.rememberedValue();
                        if (!changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext("cash_a_check", checkCaptureViewModel.getFlowAttemptId());
                            composer2.updateRememberedValue(rememberedValue);
                        }
                        com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext businessFlowContext = (com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext) rememberedValue;
                        android.content.Context context = (android.content.Context) composer2.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                        int i7 = i4;
                        com.paypal.oslo.feature.checkcapture.ui.CheckCaptureComposablesKt.HandleCheckCaptureEffects(checkCaptureViewModel.getEffects(), context, ingoSdkLauncher, com.paypal.oslo.feature.checkcapture.ui.CheckCaptureComposablesKt.rememberIngoResultLauncher(ingoResultHandler, appNavigator, businessFlowContext, composer2, (com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext.$stable << 6) | ((i4 >> 12) & 126)), rememberPermissionController, checkCaptureViewModel, function0, businessFlowContext, composer2, ((i4 >> 3) & 896) | ((i4 >> 9) & 57344) | ((i4 << 12) & 458752) | ((i4 << 18) & 3670016) | (com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext.$stable << 21));
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        changedInstance = composer2.changedInstance(checkCaptureViewModel);
                        rememberedValue2 = composer2.rememberedValue();
                        if (!changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new com.paypal.oslo.feature.checkcapture.ui.CheckCaptureScreenKt$CheckCaptureScreen$1$1(checkCaptureViewModel, null);
                            composer2.updateRememberedValue(rememberedValue2);
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, composer2, 6);
                        getHighSpeedVideoSizes((com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureState) collectAsStateWithLifecycle.getValue(), function0, com.paypal.oslo.feature.checkcapture.ui.CheckCaptureScreenHelpersKt.createOnProceedFromLandingCallback(checkCaptureViewModel), com.paypal.oslo.feature.checkcapture.ui.CheckCaptureScreenHelpersKt.createOnLinkClickCallback(context), manager.getIngoPrivacyPolicyUrl(), manager.getIngoTermsAndConditionsUrl(), checkCaptureViewModel, businessFlowContext, modifier4, composer2, (com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext.$stable << 21) | ((i7 << 3) & 112) | ((i7 << 15) & 3670016) | (234881024 & (i7 << 6)), 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        permissionController3 = rememberPermissionController;
                    } else {
                        modifier2 = companion;
                    }
                }
                i4 = i3;
                modifier4 = modifier2;
                rememberPermissionController = permissionController2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                composer2 = startRestartGroup;
                androidx.compose.runtime.State collectAsStateWithLifecycle2 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(checkCaptureViewModel.getState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                changed = composer2.changed(checkCaptureViewModel.getFlowAttemptId());
                rememberedValue = composer2.rememberedValue();
                if (!changed) {
                }
                rememberedValue = new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext("cash_a_check", checkCaptureViewModel.getFlowAttemptId());
                composer2.updateRememberedValue(rememberedValue);
                com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext businessFlowContext2 = (com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext) rememberedValue;
                android.content.Context context2 = (android.content.Context) composer2.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                int i72 = i4;
                com.paypal.oslo.feature.checkcapture.ui.CheckCaptureComposablesKt.HandleCheckCaptureEffects(checkCaptureViewModel.getEffects(), context2, ingoSdkLauncher, com.paypal.oslo.feature.checkcapture.ui.CheckCaptureComposablesKt.rememberIngoResultLauncher(ingoResultHandler, appNavigator, businessFlowContext2, composer2, (com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext.$stable << 6) | ((i4 >> 12) & 126)), rememberPermissionController, checkCaptureViewModel, function0, businessFlowContext2, composer2, ((i4 >> 3) & 896) | ((i4 >> 9) & 57344) | ((i4 << 12) & 458752) | ((i4 << 18) & 3670016) | (com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext.$stable << 21));
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                changedInstance = composer2.changedInstance(checkCaptureViewModel);
                rememberedValue2 = composer2.rememberedValue();
                if (!changedInstance) {
                }
                rememberedValue2 = new com.paypal.oslo.feature.checkcapture.ui.CheckCaptureScreenKt$CheckCaptureScreen$1$1(checkCaptureViewModel, null);
                composer2.updateRememberedValue(rememberedValue2);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, composer2, 6);
                getHighSpeedVideoSizes((com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureState) collectAsStateWithLifecycle2.getValue(), function0, com.paypal.oslo.feature.checkcapture.ui.CheckCaptureScreenHelpersKt.createOnProceedFromLandingCallback(checkCaptureViewModel), com.paypal.oslo.feature.checkcapture.ui.CheckCaptureScreenHelpersKt.createOnLinkClickCallback(context2), manager.getIngoPrivacyPolicyUrl(), manager.getIngoTermsAndConditionsUrl(), checkCaptureViewModel, businessFlowContext2, modifier4, composer2, (com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext.$stable << 21) | ((i72 << 3) & 112) | ((i72 << 15) & 3670016) | (234881024 & (i72 << 6)), 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
                permissionController3 = rememberPermissionController;
            } else {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
                permissionController3 = permissionController2;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.checkcapture.ui.CheckCaptureScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.checkcapture.ui.CheckCaptureScreenKt.m13499$r8$lambda$uOjbJ_vKMiOEZpnRy0Bm80K2F4(kotlin.jvm.functions.Function0.this, checkCaptureViewModel, manager, ingoSdkLauncher, ingoResultHandler, appNavigator, modifier3, permissionController3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((12582912 & i) != 0) {
        }
        if (!startRestartGroup.shouldExecute((4793491 & i3) == 4793490, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighSpeedVideoSizes(final com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureState checkCaptureState, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, final java.lang.String str, final java.lang.String str2, final com.paypal.oslo.feature.checkcapture.ui.viewmodel.CheckCaptureViewModel checkCaptureViewModel, final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext businessFlowContext, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1345725294);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(checkCaptureState) : startRestartGroup.changedInstance(checkCaptureState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changed(str) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(checkCaptureViewModel) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= (16777216 & i) == 0 ? startRestartGroup.changed(businessFlowContext) : startRestartGroup.changedInstance(businessFlowContext) ? 8388608 : 4194304;
        }
        int i4 = i2 & 256;
        if (i4 != 0) {
            i3 |= 100663296;
        } else if ((100663296 & i) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 67108864 : 33554432;
            if (startRestartGroup.shouldExecute((38347923 & i3) == 38347922, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier2 = modifier;
            } else {
                androidx.compose.ui.Modifier.Companion companion = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1345725294, i3, -1, "com.paypal.oslo.feature.checkcapture.ui.CheckCaptureContent (CheckCaptureScreen.kt:125)");
                }
                androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.ui.Modifier modifier3 = companion;
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
                if (kotlin.jvm.internal.Intrinsics.areEqual(checkCaptureState, com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureState.Idle.INSTANCE)) {
                    startRestartGroup.startReplaceGroup(1480292528);
                    startRestartGroup.endReplaceGroup();
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(checkCaptureState, com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureState.ShowLandingScreen.INSTANCE)) {
                    startRestartGroup.startReplaceGroup(-1355503035);
                    int i5 = i3 >> 6;
                    com.paypal.oslo.feature.checkcapture.ui.CheckCaptureLandingScreenKt.CheckCaptureLandingScreen(function0, function02, str, str2, function1, businessFlowContext, startRestartGroup, (i5 & 458752) | ((i3 << 3) & 57344) | ((i3 >> 3) & 126) | (i5 & 896) | (i5 & 7168) | (com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext.$stable << 15));
                    startRestartGroup.endReplaceGroup();
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(checkCaptureState, com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureState.Loading.INSTANCE)) {
                    startRestartGroup.startReplaceGroup(-1355073561);
                    getHighResolutionOutputSizeshNQ4ISI(startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else if (checkCaptureState instanceof com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureState.Success) {
                    startRestartGroup.startReplaceGroup(-1354979073);
                    getHighResolutionOutputSizeshNQ4ISI(startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    if (!(checkCaptureState instanceof com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureState.Error)) {
                        startRestartGroup.startReplaceGroup(1480292081);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    startRestartGroup.startReplaceGroup(-1354807643);
                    com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureState.Error error = (com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureState.Error) checkCaptureState;
                    com.paypal.oslo.feature.checkcapture.ui.CheckCaptureErrorScreenKt.CheckCaptureErrorScreen(Camera2StreamConfigurationMap(error.getErrorType(), startRestartGroup), error.getCanRetry(), com.paypal.oslo.feature.checkcapture.ui.CheckCaptureScreenHelpersKt.createOnRetryErrorClickCallback(businessFlowContext, checkCaptureViewModel, error.getRetryCount()), com.paypal.oslo.feature.checkcapture.ui.CheckCaptureScreenHelpersKt.createOnDismissErrorCallback(businessFlowContext, function0), null, startRestartGroup, 0, 16);
                    startRestartGroup.endReplaceGroup();
                }
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.checkcapture.ui.CheckCaptureScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.checkcapture.ui.CheckCaptureScreenKt.$r8$lambda$JABOD6kRXpWGBlUIfCmVxMqcdIU(com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureState.this, function0, function02, function1, str, str2, checkCaptureViewModel, businessFlowContext, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        if (startRestartGroup.shouldExecute((38347923 & i3) == 38347922, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final java.lang.String Camera2StreamConfigurationMap(com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureErrorType checkCaptureErrorType, androidx.compose.runtime.Composer composer) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1696874383, 0, -1, "com.paypal.oslo.feature.checkcapture.ui.getErrorMessage (CheckCaptureScreen.kt:172)");
        }
        java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.checkcapture.ui.CheckCaptureErrorMessageMapperKt.mapErrorTypeToStringResource(checkCaptureErrorType), composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return stringResource;
    }

    private static final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-560555575);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-560555575, i, -1, "com.paypal.oslo.feature.checkcapture.ui.LoadingScreen (CheckCaptureScreen.kt:181)");
            }
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
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
            com.paypal.pds.components.LoaderKt.Loader(null, null, null, null, startRestartGroup, 0, 15);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.checkcapture.ui.CheckCaptureScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.checkcapture.ui.CheckCaptureScreenKt.$r8$lambda$rgisPhMcATrDvmxQCQdxlSUNjh8(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void handleIngoActivityResult(com.ingo.sdk.kotlin.common.model.result.IngoSdkResult ingoSdkResult, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.checkcapture.ui.CheckCaptureScreenKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.checkcapture.ui.CheckCaptureScreenKt.$r8$lambda$_zEE5Nf7f1reqapFzNKAsxqgAd4((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JABOD6kRXpWGBlUIfCmVxMqcdIU(com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureState checkCaptureState, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function1 function1, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.checkcapture.ui.viewmodel.CheckCaptureViewModel checkCaptureViewModel, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext businessFlowContext, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoSizes(checkCaptureState, function0, function02, function1, str, str2, checkCaptureViewModel, businessFlowContext, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_zEE5Nf7f1reqapFzNKAsxqgAd4(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rgisPhMcATrDvmxQCQdxlSUNjh8(int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighResolutionOutputSizeshNQ4ISI(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$u-OjbJ_vKMiOEZpnRy0Bm80K2F4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13499$r8$lambda$uOjbJ_vKMiOEZpnRy0Bm80K2F4(kotlin.jvm.functions.Function0 function0, com.paypal.oslo.feature.checkcapture.ui.viewmodel.CheckCaptureViewModel checkCaptureViewModel, com.paypal.oslo.feature.checkcapture.domain.remoteconfig.CheckCaptureConfig.Manager manager, com.paypal.oslo.feature.checkcapture.ingo.IngoSdkLauncher ingoSdkLauncher, com.paypal.oslo.feature.checkcapture.ingo.IngoResultHandler ingoResultHandler, com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, com.paypal.oslo.core.permission.ui.controller.PermissionController permissionController, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CheckCaptureScreen(function0, checkCaptureViewModel, manager, ingoSdkLauncher, ingoResultHandler, appNavigator, modifier, permissionController, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
