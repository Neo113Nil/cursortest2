package com.paypal.oslo.feature.checkcapture.ui;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aa\u0010\u0013\u001a\u00020\u000f2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a-\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0019\u0010\u001a"}, d2 = {"Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/checkcapture/ui/mvi/CheckCaptureEffect;", "effects", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/feature/checkcapture/ingo/IngoSdkLauncher;", "ingoSdkLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "activityResultLauncher", "Lcom/paypal/oslo/core/permission/ui/controller/PermissionController;", "permissionController", "Lcom/paypal/oslo/feature/checkcapture/ui/viewmodel/CheckCaptureViewModel;", "viewModel", "Lkotlin/Function0;", "", "onIngoLaunchFailure", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/BusinessFlowContext;", "flowContext", "HandleCheckCaptureEffects", "(Lkotlinx/coroutines/flow/Flow;Landroid/content/Context;Lcom/paypal/oslo/feature/checkcapture/ingo/IngoSdkLauncher;Landroidx/activity/result/ActivityResultLauncher;Lcom/paypal/oslo/core/permission/ui/controller/PermissionController;Lcom/paypal/oslo/feature/checkcapture/ui/viewmodel/CheckCaptureViewModel;Lkotlin/jvm/functions/Function0;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/BusinessFlowContext;Landroidx/compose/runtime/Composer;I)V", "Lcom/paypal/oslo/feature/checkcapture/ingo/IngoResultHandler;", "ingoResultHandler", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "rememberIngoResultLauncher", "(Lcom/paypal/oslo/feature/checkcapture/ingo/IngoResultHandler;Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/BusinessFlowContext;Landroidx/compose/runtime/Composer;I)Landroidx/activity/result/ActivityResultLauncher;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CheckCaptureComposablesKt {
    public static final void HandleCheckCaptureEffects(final kotlinx.coroutines.flow.Flow<? extends com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureEffect> flow, final android.content.Context context, final com.paypal.oslo.feature.checkcapture.ingo.IngoSdkLauncher ingoSdkLauncher, final androidx.view.result.ActivityResultLauncher<android.content.Intent> activityResultLauncher, final com.paypal.oslo.core.permission.ui.controller.PermissionController permissionController, final com.paypal.oslo.feature.checkcapture.ui.viewmodel.CheckCaptureViewModel checkCaptureViewModel, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext businessFlowContext, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.Unit unit;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ingoSdkLauncher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResultLauncher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissionController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkCaptureViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessFlowContext, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1102424539);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(flow) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(context) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(ingoSdkLauncher) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(activityResultLauncher) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(permissionController) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(checkCaptureViewModel) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= (i & 16777216) == 0 ? startRestartGroup.changed(businessFlowContext) : startRestartGroup.changedInstance(businessFlowContext) ? 8388608 : 4194304;
        }
        if (!startRestartGroup.shouldExecute((4793491 & i2) != 4793490, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1102424539, i2, -1, "com.paypal.oslo.feature.checkcapture.ui.HandleCheckCaptureEffects (CheckCaptureComposables.kt:60)");
            }
            com.ingo.sdk.kotlin.ux.IngoSdkTheme buildIngoTheme = com.paypal.oslo.feature.checkcapture.ingo.IngoThemeBuilderKt.buildIngoTheme(startRestartGroup, 0);
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            boolean changedInstance = startRestartGroup.changedInstance(flow);
            boolean z = (i2 & 29360128) == 8388608 || ((16777216 & i2) != 0 && startRestartGroup.changedInstance(businessFlowContext));
            boolean changedInstance2 = startRestartGroup.changedInstance(ingoSdkLauncher);
            boolean changedInstance3 = startRestartGroup.changedInstance(context);
            boolean changedInstance4 = startRestartGroup.changedInstance(buildIngoTheme);
            boolean changedInstance5 = startRestartGroup.changedInstance(activityResultLauncher);
            boolean z2 = (i2 & 3670016) == 1048576;
            boolean changedInstance6 = startRestartGroup.changedInstance(permissionController);
            boolean changedInstance7 = startRestartGroup.changedInstance(checkCaptureViewModel);
            com.paypal.oslo.feature.checkcapture.ui.CheckCaptureComposablesKt$HandleCheckCaptureEffects$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (((changedInstance | z | changedInstance2 | changedInstance3 | changedInstance4 | changedInstance5 | z2 | changedInstance6) || changedInstance7) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                unit = unit2;
                rememberedValue = new com.paypal.oslo.feature.checkcapture.ui.CheckCaptureComposablesKt$HandleCheckCaptureEffects$1$1(flow, businessFlowContext, ingoSdkLauncher, context, buildIngoTheme, activityResultLauncher, function0, permissionController, checkCaptureViewModel, null);
                composer2 = startRestartGroup;
                composer2.updateRememberedValue(rememberedValue);
            } else {
                composer2 = startRestartGroup;
                unit = unit2;
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, composer2, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.checkcapture.ui.CheckCaptureComposablesKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.checkcapture.ui.CheckCaptureComposablesKt.$r8$lambda$wqid4T97i62RgXxeRwjwm8C0W68(kotlinx.coroutines.flow.Flow.this, context, ingoSdkLauncher, activityResultLauncher, permissionController, checkCaptureViewModel, function0, businessFlowContext, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final androidx.view.result.ActivityResultLauncher<android.content.Intent> rememberIngoResultLauncher(com.paypal.oslo.feature.checkcapture.ingo.IngoResultHandler ingoResultHandler, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext businessFlowContext, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ingoResultHandler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessFlowContext, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(726568335, i, -1, "com.paypal.oslo.feature.checkcapture.ui.rememberIngoResultLauncher (CheckCaptureComposables.kt:127)");
        }
        androidx.view.compose.ManagedActivityResultLauncher rememberLauncherForActivityResult = androidx.view.compose.ActivityResultRegistryKt.rememberLauncherForActivityResult(new androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult(), com.paypal.oslo.feature.checkcapture.ui.CheckCaptureScreenHelpersKt.createIngoResultCallback(ingoResultHandler, appNavigator, businessFlowContext), composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return rememberLauncherForActivityResult;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wqid4T97i62RgXxeRwjwm8C0W68(kotlinx.coroutines.flow.Flow flow, android.content.Context context, com.paypal.oslo.feature.checkcapture.ingo.IngoSdkLauncher ingoSdkLauncher, androidx.view.result.ActivityResultLauncher activityResultLauncher, com.paypal.oslo.core.permission.ui.controller.PermissionController permissionController, com.paypal.oslo.feature.checkcapture.ui.viewmodel.CheckCaptureViewModel checkCaptureViewModel, kotlin.jvm.functions.Function0 function0, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext businessFlowContext, int i, androidx.compose.runtime.Composer composer, int i2) {
        HandleCheckCaptureEffects(flow, context, ingoSdkLauncher, activityResultLauncher, permissionController, checkCaptureViewModel, function0, businessFlowContext, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
