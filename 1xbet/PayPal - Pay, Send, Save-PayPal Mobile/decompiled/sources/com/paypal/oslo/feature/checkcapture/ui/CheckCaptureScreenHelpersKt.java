package com.paypal.oslo.feature.checkcapture.ui;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a3\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a-\u0010\u001d\u001a\u0012\u0012\b\u0012\u00060\u001bj\u0002`\u001c\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a%\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b \u0010!\u001a-\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\"\u0010#\u001a+\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0000¢\u0006\u0004\b%\u0010&"}, d2 = {"Lcom/paypal/oslo/feature/checkcapture/ui/viewmodel/CheckCaptureViewModel;", "viewModel", "Lkotlin/Function1;", "", "", "createOnRetryCallback", "(Lcom/paypal/oslo/feature/checkcapture/ui/viewmodel/CheckCaptureViewModel;)Lkotlin/jvm/functions/Function1;", "Lkotlin/Function0;", "createOnProceedFromLandingCallback", "(Lcom/paypal/oslo/feature/checkcapture/ui/viewmodel/CheckCaptureViewModel;)Lkotlin/jvm/functions/Function0;", "Landroid/content/Context;", "context", "", "createOnLinkClickCallback", "(Landroid/content/Context;)Lkotlin/jvm/functions/Function1;", "Lcom/paypal/oslo/feature/checkcapture/ingo/IngoResultHandler;", "ingoResultHandler", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/BusinessFlowContext;", "flowContext", "Landroidx/activity/result/ActivityResult;", "createIngoResultCallback", "(Lcom/paypal/oslo/feature/checkcapture/ingo/IngoResultHandler;Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/BusinessFlowContext;)Lkotlin/jvm/functions/Function1;", "createOnIngoLaunchSuccessCallback", "()Lkotlin/jvm/functions/Function0;", "onFailure", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "createOnIngoLaunchFailureCallback", "(Lkotlin/jvm/functions/Function0;)Lkotlin/jvm/functions/Function1;", "retryCount", "createOnErrorRetryCallback", "(ILcom/paypal/oslo/feature/checkcapture/ui/viewmodel/CheckCaptureViewModel;)Lkotlin/jvm/functions/Function0;", "createOnRetryErrorClickCallback", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/BusinessFlowContext;Lcom/paypal/oslo/feature/checkcapture/ui/viewmodel/CheckCaptureViewModel;I)Lkotlin/jvm/functions/Function0;", "onNavigateBack", "createOnDismissErrorCallback", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/BusinessFlowContext;Lkotlin/jvm/functions/Function0;)Lkotlin/jvm/functions/Function0;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CheckCaptureScreenHelpersKt {
    public static final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> createOnRetryCallback(final com.paypal.oslo.feature.checkcapture.ui.viewmodel.CheckCaptureViewModel checkCaptureViewModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkCaptureViewModel, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.checkcapture.ui.CheckCaptureScreenHelpersKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.checkcapture.ui.CheckCaptureScreenHelpersKt.$r8$lambda$hnuJMlx0TyzsMdAm_nrLJ5r1S3U(com.paypal.oslo.feature.checkcapture.ui.viewmodel.CheckCaptureViewModel.this, ((java.lang.Integer) obj).intValue());
            }
        };
    }

    public static final kotlin.jvm.functions.Function0<kotlin.Unit> createOnProceedFromLandingCallback(final com.paypal.oslo.feature.checkcapture.ui.viewmodel.CheckCaptureViewModel checkCaptureViewModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkCaptureViewModel, "");
        return new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.checkcapture.ui.CheckCaptureScreenHelpersKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.checkcapture.ui.CheckCaptureScreenHelpersKt.$r8$lambda$yBywcTPXd8T6JBxGKFQ4dZ1AltU(com.paypal.oslo.feature.checkcapture.ui.viewmodel.CheckCaptureViewModel.this);
            }
        };
    }

    public static final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> createOnLinkClickCallback(final android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.checkcapture.ui.CheckCaptureScreenHelpersKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.checkcapture.ui.CheckCaptureScreenHelpersKt.$r8$lambda$gDT_Q0b1x60CTuNR_D7QWKKGO80(context, (java.lang.String) obj);
            }
        };
    }

    public static final kotlin.jvm.functions.Function1<androidx.view.result.ActivityResult, kotlin.Unit> createIngoResultCallback(final com.paypal.oslo.feature.checkcapture.ingo.IngoResultHandler ingoResultHandler, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext businessFlowContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ingoResultHandler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessFlowContext, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.checkcapture.ui.CheckCaptureScreenHelpersKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.checkcapture.ui.CheckCaptureScreenHelpersKt.m13497$r8$lambda$Po9eixrRMMPq474I44VKramKPE(com.paypal.oslo.feature.checkcapture.ingo.IngoResultHandler.this, appNavigator, businessFlowContext, (androidx.view.result.ActivityResult) obj);
            }
        };
    }

    public static final kotlin.jvm.functions.Function1<java.lang.Exception, kotlin.Unit> createOnIngoLaunchFailureCallback(final kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.checkcapture.ui.CheckCaptureScreenHelpersKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.checkcapture.ui.CheckCaptureScreenHelpersKt.$r8$lambda$lqekyL3H49GwrpS4GkOh4Rz5SM8(kotlin.jvm.functions.Function0.this, (java.lang.Exception) obj);
            }
        };
    }

    public static final kotlin.jvm.functions.Function0<kotlin.Unit> createOnErrorRetryCallback(final int i, final com.paypal.oslo.feature.checkcapture.ui.viewmodel.CheckCaptureViewModel checkCaptureViewModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkCaptureViewModel, "");
        return new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.checkcapture.ui.CheckCaptureScreenHelpersKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.checkcapture.ui.CheckCaptureScreenHelpersKt.$r8$lambda$CWQqdfl6TsqXLLWFlumMiutLw3g(com.paypal.oslo.feature.checkcapture.ui.viewmodel.CheckCaptureViewModel.this, i);
            }
        };
    }

    public static final kotlin.jvm.functions.Function0<kotlin.Unit> createOnRetryErrorClickCallback(final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext businessFlowContext, final com.paypal.oslo.feature.checkcapture.ui.viewmodel.CheckCaptureViewModel checkCaptureViewModel, final int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessFlowContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkCaptureViewModel, "");
        return new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.checkcapture.ui.CheckCaptureScreenHelpersKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.checkcapture.ui.CheckCaptureScreenHelpersKt.m13498$r8$lambda$q8gOEyup4Y5Kj6CihMKLRhqsk(com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext.this, checkCaptureViewModel, i);
            }
        };
    }

    public static final kotlin.jvm.functions.Function0<kotlin.Unit> createOnDismissErrorCallback(final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext businessFlowContext, final kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessFlowContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        return new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.checkcapture.ui.CheckCaptureScreenHelpersKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.checkcapture.ui.CheckCaptureScreenHelpersKt.$r8$lambda$pe8qWXS8nSdCSGyvC_0IimrSuw4(com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext.this, function0);
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4w1aN2u_eH8LtMTC0E5lY7XhYvs() {
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.checkcapture.LoggerKt.log, "Launched INGO SDK successfully", null, null, 6, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CWQqdfl6TsqXLLWFlumMiutLw3g(com.paypal.oslo.feature.checkcapture.ui.viewmodel.CheckCaptureViewModel checkCaptureViewModel, int i) {
        checkCaptureViewModel.processIntent(new com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureIntent.RetryAuthentication(i));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Po9eixrRMMPq474I44V-KramKPE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13497$r8$lambda$Po9eixrRMMPq474I44VKramKPE(com.paypal.oslo.feature.checkcapture.ingo.IngoResultHandler ingoResultHandler, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext businessFlowContext, androidx.view.result.ActivityResult activityResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResult, "");
        com.ingo.sdk.kotlin.common.model.result.IngoSdkResult handleResult = ingoResultHandler.handleResult(activityResult.getResultCode(), activityResult.getData());
        if (handleResult != null) {
            com.paypal.oslo.feature.checkcapture.analytics.AnalyticsActionsKt.appeared(com.paypal.oslo.feature.checkcapture.analytics.CheckCaptureAnalytics.INSTANCE.createIngoFlowExitedEvent(handleResult.getLastModule(), businessFlowContext));
        }
        com.paypal.oslo.feature.checkcapture.ui.CheckCaptureScreenKt.handleIngoActivityResult(handleResult, appNavigator);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gDT_Q0b1x60CTuNR_D7QWKKGO80(android.content.Context context, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.paypal.oslo.feature.checkcapture.ui.util.UrlUtils.INSTANCE.openUrl(context, str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hnuJMlx0TyzsMdAm_nrLJ5r1S3U(com.paypal.oslo.feature.checkcapture.ui.viewmodel.CheckCaptureViewModel checkCaptureViewModel, int i) {
        checkCaptureViewModel.processIntent(new com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureIntent.RetryAuthentication(i));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$lqekyL3H49GwrpS4GkOh4Rz5SM8(kotlin.jvm.functions.Function0 function0, java.lang.Exception exc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exc, "");
        com.paypal.oslo.feature.checkcapture.LoggerKt.log.e("Failed to launch INGO SDK", exc);
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pe8qWXS8nSdCSGyvC_0IimrSuw4(com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext businessFlowContext, kotlin.jvm.functions.Function0 function0) {
        com.paypal.oslo.feature.checkcapture.analytics.AnalyticsActionsKt.clicked(com.paypal.oslo.feature.checkcapture.analytics.CheckCaptureAnalytics.INSTANCE.createOkButtonClickedEvent(businessFlowContext));
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$q8gOEy-up4Y5Kj6CihMK-LRhqsk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13498$r8$lambda$q8gOEyup4Y5Kj6CihMKLRhqsk(com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext businessFlowContext, com.paypal.oslo.feature.checkcapture.ui.viewmodel.CheckCaptureViewModel checkCaptureViewModel, int i) {
        com.paypal.oslo.feature.checkcapture.analytics.AnalyticsActionsKt.clicked(com.paypal.oslo.feature.checkcapture.analytics.CheckCaptureAnalytics.INSTANCE.createRetryButtonClickedEvent(businessFlowContext));
        checkCaptureViewModel.processIntent(new com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureIntent.RetryAuthentication(i));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$yBywcTPXd8T6JBxGKFQ4dZ1AltU(com.paypal.oslo.feature.checkcapture.ui.viewmodel.CheckCaptureViewModel checkCaptureViewModel) {
        checkCaptureViewModel.processIntent(com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureIntent.ProceedFromLanding.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlin.jvm.functions.Function0<kotlin.Unit> createOnIngoLaunchSuccessCallback() {
        return new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.checkcapture.ui.CheckCaptureScreenHelpersKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.checkcapture.ui.CheckCaptureScreenHelpersKt.$r8$lambda$4w1aN2u_eH8LtMTC0E5lY7XhYvs();
            }
        };
    }
}
